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
public class client extends class33 {

    @OriginalMember(owner = "client", name = "K", descriptor = "Ljava/lang/String;")
    private String field136 = "";

    @OriginalMember(owner = "client", name = "L", descriptor = "Ljava/lang/String;")
    private String field137 = "";

    @OriginalMember(owner = "client", name = "N", descriptor = "Z")
    private boolean field139 = true;

    @OriginalMember(owner = "client", name = "P", descriptor = "[I")
    private int[] field141 = new int[1000];

    @OriginalMember(owner = "client", name = "Q", descriptor = "[I")
    private int[] field142 = new int[1000];

    @OriginalMember(owner = "client", name = "R", descriptor = "I")
    private int field143 = -1;

    @OriginalMember(owner = "client", name = "S", descriptor = "I")
    private int field144 = 48493;

    @OriginalMember(owner = "client", name = "Y", descriptor = "[B")
    private byte[] field150 = new byte[16384];

    @OriginalMember(owner = "client", name = "ab", descriptor = "Z")
    private boolean field152 = true;

    @OriginalMember(owner = "client", name = "cb", descriptor = "I")
    private int field154 = 6;

    @OriginalMember(owner = "client", name = "db", descriptor = "[LJONKABPT;")
    private class37[] field155 = new class37[100];

    @OriginalMember(owner = "client", name = "eb", descriptor = "Ljava/lang/String;")
    private String field156 = "";

    @OriginalMember(owner = "client", name = "mb", descriptor = "I")
    private int field164 = 7759444;

    @OriginalMember(owner = "client", name = "ob", descriptor = "I")
    private int field166 = -1;

    @OriginalMember(owner = "client", name = "rb", descriptor = "I")
    private int field169 = 3;

    @OriginalMember(owner = "client", name = "sb", descriptor = "LCKBTFRZM;")
    private class5 field170 = class5.method32(1, field252);

    @OriginalMember(owner = "client", name = "tb", descriptor = "Z")
    private boolean field171 = true;

    @OriginalMember(owner = "client", name = "Cb", descriptor = "Z")
    private boolean field180 = false;

    @OriginalMember(owner = "client", name = "Db", descriptor = "[LJQZFCGYF;")
    private class38[] field181 = new class38[13];

    @OriginalMember(owner = "client", name = "Fb", descriptor = "I")
    private int field183 = 46945;

    @OriginalMember(owner = "client", name = "Hb", descriptor = "[I")
    private int[] field185 = new int[50];

    @OriginalMember(owner = "client", name = "Ib", descriptor = "[I")
    private int[] field186 = new int[151];

    @OriginalMember(owner = "client", name = "Lb", descriptor = "Z")
    private boolean field189 = true;

    @OriginalMember(owner = "client", name = "Nb", descriptor = "[[I")
    private int[][] field191 = new int[104][104];

    @OriginalMember(owner = "client", name = "dc", descriptor = "I")
    private int field207 = 2;

    @OriginalMember(owner = "client", name = "hc", descriptor = "[I")
    private int[] field211 = new int[500];

    @OriginalMember(owner = "client", name = "ic", descriptor = "[I")
    private int[] field212 = new int[500];

    @OriginalMember(owner = "client", name = "jc", descriptor = "[I")
    private int[] field213 = new int[500];

    @OriginalMember(owner = "client", name = "kc", descriptor = "[I")
    private int[] field214 = new int[500];

    @OriginalMember(owner = "client", name = "lc", descriptor = "[I")
    private int[] field215 = new int[5];

    @OriginalMember(owner = "client", name = "oc", descriptor = "I")
    private int field218 = 2048;

    @OriginalMember(owner = "client", name = "pc", descriptor = "I")
    private int field219 = 2047;

    @OriginalMember(owner = "client", name = "qc", descriptor = "[LGPPDQFCV;")
    private class22[] field220 = new class22[this.field218];

    @OriginalMember(owner = "client", name = "sc", descriptor = "[I")
    public int[] field222 = new int[this.field218];

    @OriginalMember(owner = "client", name = "uc", descriptor = "[I")
    private int[] field224 = new int[this.field218];

    @OriginalMember(owner = "client", name = "vc", descriptor = "[LCKBTFRZM;")
    private class5[] field225 = new class5[this.field218];

    @OriginalMember(owner = "client", name = "wc", descriptor = "Z")
    private boolean field226 = false;

    @OriginalMember(owner = "client", name = "xc", descriptor = "I")
    private int field227 = -1;

    @OriginalMember(owner = "client", name = "Ic", descriptor = "I")
    private int field238 = -223;

    @OriginalMember(owner = "client", name = "Oc", descriptor = "I")
    private int field244 = 6;

    @OriginalMember(owner = "client", name = "Qc", descriptor = "LCKBTFRZM;")
    private class5 field246 = new class5(2, new byte[5000]);

    @OriginalMember(owner = "client", name = "Rc", descriptor = "[LTKXONZKI;")
    private class55[] field247 = new class55[16384];

    @OriginalMember(owner = "client", name = "Tc", descriptor = "[I")
    public int[] field249 = new int[16384];

    @OriginalMember(owner = "client", name = "Vc", descriptor = "I")
    private int field251 = -1;

    @OriginalMember(owner = "client", name = "Yc", descriptor = "[I")
    private int[] field254 = new int[5];

    @OriginalMember(owner = "client", name = "Zc", descriptor = "I")
    private int field255 = 78;

    @OriginalMember(owner = "client", name = "bd", descriptor = "[I")
    private int[] field257 = new int[class49.field1301];

    @OriginalMember(owner = "client", name = "ld", descriptor = "[I")
    private int[] field267 = new int[class49.field1301];

    @OriginalMember(owner = "client", name = "md", descriptor = "I")
    private int field268 = -1;

    @OriginalMember(owner = "client", name = "pd", descriptor = "Z")
    private boolean field271 = false;

    @OriginalMember(owner = "client", name = "Nd", descriptor = "Z")
    private boolean field295 = false;

    @OriginalMember(owner = "client", name = "Rd", descriptor = "LCKBTFRZM;")
    private class5 field299 = class5.method32(1, field252);

    @OriginalMember(owner = "client", name = "Wd", descriptor = "[LJQZFCGYF;")
    private class38[] field304 = new class38[100];

    @OriginalMember(owner = "client", name = "Yd", descriptor = "Z")
    private boolean field306 = true;

    @OriginalMember(owner = "client", name = "ce", descriptor = "I")
    private int field310 = 5063219;

    @OriginalMember(owner = "client", name = "de", descriptor = "B")
    private byte field311 = 2;

    @OriginalMember(owner = "client", name = "ee", descriptor = "I")
    private int field312 = -1;

    @OriginalMember(owner = "client", name = "fe", descriptor = "[I")
    private int[] field313 = new int[5];

    @OriginalMember(owner = "client", name = "ie", descriptor = "I")
    private final int field316 = 100;

    @OriginalMember(owner = "client", name = "je", descriptor = "[I")
    private int[] field317 = new int[100];

    @OriginalMember(owner = "client", name = "pe", descriptor = "B")
    private byte field323 = 9;

    @OriginalMember(owner = "client", name = "te", descriptor = "[I")
    private int[] field327 = new int[5];

    @OriginalMember(owner = "client", name = "ue", descriptor = "[I")
    private int[] field328 = new int[class49.field1301];

    @OriginalMember(owner = "client", name = "Ce", descriptor = "[Ljava/lang/String;")
    private String[] field336 = new String[200];

    @OriginalMember(owner = "client", name = "Ee", descriptor = "[I")
    private int[] field338 = new int[33];

    @OriginalMember(owner = "client", name = "He", descriptor = "I")
    private int field341 = -760;

    @OriginalMember(owner = "client", name = "Ie", descriptor = "Z")
    private boolean field342 = false;

    @OriginalMember(owner = "client", name = "Je", descriptor = "I")
    private int field343 = 2301979;

    @OriginalMember(owner = "client", name = "Ke", descriptor = "I")
    private int field344 = 10277;

    @OriginalMember(owner = "client", name = "Me", descriptor = "[I")
    private int[] field346 = new int[7];

    @OriginalMember(owner = "client", name = "Oe", descriptor = "[LICYHAEVI;")
    public class27[] field348 = new class27[5];

    @OriginalMember(owner = "client", name = "Pe", descriptor = "[Ljava/lang/String;")
    private String[] field349 = new String[500];

    @OriginalMember(owner = "client", name = "Qe", descriptor = "[LONADPAJP;")
    private class47[] field350 = new class47[4];

    @OriginalMember(owner = "client", name = "Se", descriptor = "Z")
    private volatile boolean field352 = false;

    @OriginalMember(owner = "client", name = "Ue", descriptor = "[I")
    public int[] field354 = new int[1000];

    @OriginalMember(owner = "client", name = "Ve", descriptor = "LWUVIEXOA;")
    private class69 field355 = new class69((byte) 7);

    @OriginalMember(owner = "client", name = "We", descriptor = "Ljava/util/zip/CRC32;")
    private CRC32 field356 = new CRC32();

    @OriginalMember(owner = "client", name = "Xe", descriptor = "[I")
    private final int[] field357 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client", name = "Ye", descriptor = "LWUVIEXOA;")
    private class69 field358 = new class69((byte) 7);

    @OriginalMember(owner = "client", name = "af", descriptor = "[I")
    private int[] field360 = new int[100];

    @OriginalMember(owner = "client", name = "bf", descriptor = "[Ljava/lang/String;")
    private String[] field361 = new String[100];

    @OriginalMember(owner = "client", name = "cf", descriptor = "[Ljava/lang/String;")
    private String[] field362 = new String[100];

    @OriginalMember(owner = "client", name = "gf", descriptor = "I")
    private int field366 = 2;

    @OriginalMember(owner = "client", name = "hf", descriptor = "Z")
    private volatile boolean field367 = false;

    @OriginalMember(owner = "client", name = "jf", descriptor = "I")
    private int field368 = -1;

    @OriginalMember(owner = "client", name = "mf", descriptor = "Z")
    private boolean field371 = false;

    @OriginalMember(owner = "client", name = "of", descriptor = "I")
    private int field373 = 2;

    @OriginalMember(owner = "client", name = "qf", descriptor = "Z")
    private boolean field375 = true;

    @OriginalMember(owner = "client", name = "uf", descriptor = "I")
    private int field379 = 128;

    @OriginalMember(owner = "client", name = "zf", descriptor = "I")
    private int field384 = -1;

    @OriginalMember(owner = "client", name = "Af", descriptor = "B")
    private byte field385 = 6;

    @OriginalMember(owner = "client", name = "Cf", descriptor = "Z")
    private boolean field387 = true;

    @OriginalMember(owner = "client", name = "If", descriptor = "Ljava/lang/String;")
    private String field393 = "";

    @OriginalMember(owner = "client", name = "Kf", descriptor = "[I")
    public int[] field395 = new int[2000];

    @OriginalMember(owner = "client", name = "Lf", descriptor = "I")
    private int field396 = -1;

    @OriginalMember(owner = "client", name = "Mf", descriptor = "I")
    private int field397 = -356;

    @OriginalMember(owner = "client", name = "Nf", descriptor = "[[[LWUVIEXOA;")
    private class69[][][] field398 = new class69[4][104][104];

    @OriginalMember(owner = "client", name = "Uf", descriptor = "Z")
    private boolean field405 = false;

    @OriginalMember(owner = "client", name = "Vf", descriptor = "Z")
    private boolean field406 = false;

    @OriginalMember(owner = "client", name = "Wf", descriptor = "Z")
    private boolean field407 = false;

    @OriginalMember(owner = "client", name = "Yf", descriptor = "I")
    private int field409 = 17283;

    @OriginalMember(owner = "client", name = "Zf", descriptor = "[I")
    private int[] field410 = new int[151];

    @OriginalMember(owner = "client", name = "dg", descriptor = "[I")
    private int[] field414 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client", name = "eg", descriptor = "[[I")
    private int[][] field415 = new int[104][104];

    @OriginalMember(owner = "client", name = "ig", descriptor = "[[I")
    private int[][] field419 = new int[104][104];

    @OriginalMember(owner = "client", name = "jg", descriptor = "B")
    private byte field420 = 9;

    @OriginalMember(owner = "client", name = "kg", descriptor = "Z")
    private boolean field421 = true;

    @OriginalMember(owner = "client", name = "lg", descriptor = "I")
    private int field422 = 3353893;

    @OriginalMember(owner = "client", name = "mg", descriptor = "[I")
    private int[] field423 = new int[33];

    @OriginalMember(owner = "client", name = "tg", descriptor = "Z")
    public boolean field430 = true;

    @OriginalMember(owner = "client", name = "ug", descriptor = "I")
    private int field431 = 17283;

    @OriginalMember(owner = "client", name = "vg", descriptor = "I")
    private int field432 = -1;

    @OriginalMember(owner = "client", name = "wg", descriptor = "Z")
    private boolean field433 = false;

    @OriginalMember(owner = "client", name = "Ag", descriptor = "[LJONKABPT;")
    private class37[] field437 = new class37[20];

    @OriginalMember(owner = "client", name = "Tg", descriptor = "I")
    private int field456 = -1;

    @OriginalMember(owner = "client", name = "Ug", descriptor = "I")
    private int field457 = -1;

    @OriginalMember(owner = "client", name = "ah", descriptor = "Z")
    private boolean field463 = false;

    @OriginalMember(owner = "client", name = "bh", descriptor = "Z")
    private boolean field464 = true;

    @OriginalMember(owner = "client", name = "ch", descriptor = "Z")
    private boolean field465 = false;

    @OriginalMember(owner = "client", name = "dh", descriptor = "LWUVIEXOA;")
    private class69 field466 = new class69((byte) 7);

    @OriginalMember(owner = "client", name = "eh", descriptor = "[LJQZFCGYF;")
    private class38[] field467 = new class38[2];

    @OriginalMember(owner = "client", name = "ih", descriptor = "I")
    private int field471 = 5;

    @OriginalMember(owner = "client", name = "jh", descriptor = "I")
    private int field472 = -1;

    @OriginalMember(owner = "client", name = "kh", descriptor = "[I")
    private int[] field473 = new int[256];

    @OriginalMember(owner = "client", name = "lh", descriptor = "I")
    private int field474 = -1;

    @OriginalMember(owner = "client", name = "nh", descriptor = "[I")
    private int[] field476 = new int[50];

    @OriginalMember(owner = "client", name = "ph", descriptor = "I")
    private int field478 = 245;

    @OriginalMember(owner = "client", name = "vh", descriptor = "[Z")
    private boolean[] field484 = new boolean[5];

    @OriginalMember(owner = "client", name = "wh", descriptor = "[[[I")
    private int[][][] field485 = new int[4][13][13];

    @OriginalMember(owner = "client", name = "Ch", descriptor = "[LJONKABPT;")
    private class37[] field491 = new class37[8];

    @OriginalMember(owner = "client", name = "Fh", descriptor = "[LJONKABPT;")
    private class37[] field494 = new class37[1000];

    @OriginalMember(owner = "client", name = "Kh", descriptor = "[I")
    private int[] field499 = new int[4000];

    @OriginalMember(owner = "client", name = "Lh", descriptor = "[I")
    private int[] field500 = new int[4000];

    @OriginalMember(owner = "client", name = "Mh", descriptor = "Z")
    private boolean field501 = false;

    @OriginalMember(owner = "client", name = "Nh", descriptor = "Z")
    private boolean field502 = false;

    @OriginalMember(owner = "client", name = "Oh", descriptor = "I")
    private int field503 = -22947;

    @OriginalMember(owner = "client", name = "Sh", descriptor = "[I")
    private int[] field507 = new int[200];

    @OriginalMember(owner = "client", name = "Th", descriptor = "Z")
    private boolean field508 = true;

    @OriginalMember(owner = "client", name = "Uh", descriptor = "Z")
    private boolean field509 = false;

    @OriginalMember(owner = "client", name = "Vh", descriptor = "Z")
    private volatile boolean field510 = false;

    @OriginalMember(owner = "client", name = "Wh", descriptor = "B")
    private byte field511 = 8;

    @OriginalMember(owner = "client", name = "Xh", descriptor = "Z")
    public boolean field512 = false;

    @OriginalMember(owner = "client", name = "Zh", descriptor = "Z")
    private boolean field514 = false;

    @OriginalMember(owner = "client", name = "bi", descriptor = "[J")
    private long[] field516 = new long[100];

    @OriginalMember(owner = "client", name = "di", descriptor = "Ljava/lang/String;")
    private String field518 = "";

    @OriginalMember(owner = "client", name = "ei", descriptor = "Z")
    private boolean field519 = false;

    @OriginalMember(owner = "client", name = "hi", descriptor = "Z")
    private boolean field522 = false;

    @OriginalMember(owner = "client", name = "ii", descriptor = "[I")
    private int[] field523 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client", name = "ji", descriptor = "[J")
    private long[] field524 = new long[200];

    @OriginalMember(owner = "client", name = "oi", descriptor = "[I")
    private int[] field529 = new int[2000];

    @OriginalMember(owner = "client", name = "ri", descriptor = "B")
    private byte field532 = 0;

    @OriginalMember(owner = "client", name = "ti", descriptor = "LFDUKJGTQ;")
    private class15 field534 = new class15();

    @OriginalMember(owner = "client", name = "wi", descriptor = "[LJONKABPT;")
    private class37[] field537 = new class37[20];

    @OriginalMember(owner = "client", name = "xi", descriptor = "[Ljava/lang/String;")
    private String[] field538 = new String[5];

    @OriginalMember(owner = "client", name = "yi", descriptor = "[Z")
    private boolean[] field539 = new boolean[5];

    @OriginalMember(owner = "client", name = "Bi", descriptor = "Z")
    private boolean field542 = false;

    @OriginalMember(owner = "client", name = "Ci", descriptor = "I")
    private int field543 = 76;

    @OriginalMember(owner = "client", name = "Di", descriptor = "B")
    private byte field544 = 7;

    @OriginalMember(owner = "client", name = "Ni", descriptor = "[I")
    private int[] field554 = new int[50];

    @OriginalMember(owner = "client", name = "Oi", descriptor = "B")
    private byte field555 = 7;

    @OriginalMember(owner = "client", name = "Pi", descriptor = "I")
    private int field556 = 817;

    @OriginalMember(owner = "client", name = "Xi", descriptor = "B")
    private byte field564 = 3;

    @OriginalMember(owner = "client", name = "bj", descriptor = "Z")
    private boolean field568 = false;

    @OriginalMember(owner = "client", name = "cj", descriptor = "I")
    private int field569 = 3;

    @OriginalMember(owner = "client", name = "ij", descriptor = "I")
    private int field575 = 1;

    @OriginalMember(owner = "client", name = "kj", descriptor = "I")
    private int field577 = 1;

    @OriginalMember(owner = "client", name = "lj", descriptor = "Z")
    private boolean field578 = false;

    @OriginalMember(owner = "client", name = "nj", descriptor = "I")
    private int field580 = 50;

    @OriginalMember(owner = "client", name = "oj", descriptor = "[I")
    private int[] field581 = new int[this.field580];

    @OriginalMember(owner = "client", name = "pj", descriptor = "[I")
    private int[] field582 = new int[this.field580];

    @OriginalMember(owner = "client", name = "qj", descriptor = "[I")
    private int[] field583 = new int[this.field580];

    @OriginalMember(owner = "client", name = "rj", descriptor = "[I")
    private int[] field584 = new int[this.field580];

    @OriginalMember(owner = "client", name = "sj", descriptor = "[I")
    private int[] field585 = new int[this.field580];

    @OriginalMember(owner = "client", name = "tj", descriptor = "[I")
    private int[] field586 = new int[this.field580];

    @OriginalMember(owner = "client", name = "uj", descriptor = "[I")
    private int[] field587 = new int[this.field580];

    @OriginalMember(owner = "client", name = "vj", descriptor = "[Ljava/lang/String;")
    private String[] field588 = new String[this.field580];

    @OriginalMember(owner = "client", name = "wj", descriptor = "Z")
    private boolean field589 = false;

    @OriginalMember(owner = "client", name = "xj", descriptor = "Z")
    private boolean field590 = false;

    @OriginalMember(owner = "client", name = "yj", descriptor = "[I")
    private int[] field591 = new int[5];

    @OriginalMember(owner = "client", name = "zj", descriptor = "B")
    private byte field592 = -48;

    @OriginalMember(owner = "client", name = "Cj", descriptor = "Z")
    private boolean field595 = true;

    @OriginalMember(owner = "client", name = "Dj", descriptor = "Ljava/lang/String;")
    private String field596 = "";

    @OriginalMember(owner = "client", name = "Ej", descriptor = "Ljava/lang/String;")
    private String field597 = "";

    @OriginalMember(owner = "client", name = "Fj", descriptor = "Ljava/lang/String;")
    private String field598 = "";

    @OriginalMember(owner = "client", name = "Hj", descriptor = "[I")
    private int[] field600 = new int[9];

    @OriginalMember(owner = "client", name = "Jj", descriptor = "I")
    private int field602 = 7;

    @OriginalMember(owner = "client", name = "Nj", descriptor = "Ljava/lang/String;")
    private String field606 = "";

    @OriginalMember(owner = "client", name = "Oj", descriptor = "I")
    private int field607 = 327;

    @OriginalMember(owner = "client", name = "Pj", descriptor = "LCKBTFRZM;")
    private class5 field608 = class5.method32(1, field252);

    @OriginalMember(owner = "client", name = "Rj", descriptor = "Z")
    private boolean field610 = false;

    @OriginalMember(owner = "client", name = "Sj", descriptor = "B")
    private byte field611 = -16;

    @OriginalMember(owner = "client", name = "Uj", descriptor = "Z")
    private boolean field613 = false;

    @OriginalMember(owner = "client", name = "Vj", descriptor = "Z")
    private boolean field614 = false;

    @OriginalMember(owner = "client", name = "gb", descriptor = "B")
    private static byte field158 = 1;

    @OriginalMember(owner = "client", name = "ub", descriptor = "Z")
    private static boolean field172 = true;

    @OriginalMember(owner = "client", name = "nc", descriptor = "[I")
    public static int[] field217 = new int[32];

    @OriginalMember(owner = "client", name = "Wc", descriptor = "I")
    private static int field252;

    @OriginalMember(owner = "client", name = "qd", descriptor = "I")
    private static int field272;

    @OriginalMember(owner = "client", name = "sd", descriptor = "Z")
    private static boolean field274;

    @OriginalMember(owner = "client", name = "Ed", descriptor = "Ljava/math/BigInteger;")
    private static BigInteger field286;

    @OriginalMember(owner = "client", name = "we", descriptor = "I")
    private static int field330;

    @OriginalMember(owner = "client", name = "Be", descriptor = "[I")
    private static int[] field335;

    @OriginalMember(owner = "client", name = "Fe", descriptor = "I")
    private static int field339;

    @OriginalMember(owner = "client", name = "fg", descriptor = "[I")
    public static final int[] field416;

    @OriginalMember(owner = "client", name = "Jh", descriptor = "Ljava/lang/String;")
    private static String field498;

    @OriginalMember(owner = "client", name = "qi", descriptor = "[[I")
    public static final int[][] field531;

    @OriginalMember(owner = "client", name = "Mi", descriptor = "B")
    private static byte field553;

    @OriginalMember(owner = "client", name = "Bj", descriptor = "I")
    private static int field594;

    @OriginalMember(owner = "client", name = "Kj", descriptor = "Ljava/math/BigInteger;")
    private static BigInteger field603;

    @OriginalMember(owner = "client", name = "M", descriptor = "I")
    private int field138;

    @OriginalMember(owner = "client", name = "O", descriptor = "I")
    private int field140;

    @OriginalMember(owner = "client", name = "X", descriptor = "I")
    private int field149;

    @OriginalMember(owner = "client", name = "Z", descriptor = "I")
    private int field151;

    @OriginalMember(owner = "client", name = "bb", descriptor = "I")
    private int field153;

    @OriginalMember(owner = "client", name = "fb", descriptor = "I")
    private int field157;

    @OriginalMember(owner = "client", name = "hb", descriptor = "I")
    private int field159;

    @OriginalMember(owner = "client", name = "nb", descriptor = "I")
    private static int field165;

    @OriginalMember(owner = "client", name = "pb", descriptor = "I")
    private int field167;

    @OriginalMember(owner = "client", name = "qb", descriptor = "I")
    private int field168;

    @OriginalMember(owner = "client", name = "wb", descriptor = "I")
    private static int field174;

    @OriginalMember(owner = "client", name = "xb", descriptor = "I")
    public int field175;

    @OriginalMember(owner = "client", name = "yb", descriptor = "I")
    public int field176;

    @OriginalMember(owner = "client", name = "zb", descriptor = "I")
    private int field177;

    @OriginalMember(owner = "client", name = "Bb", descriptor = "I")
    private int field179;

    @OriginalMember(owner = "client", name = "Eb", descriptor = "I")
    private int field182;

    @OriginalMember(owner = "client", name = "Gb", descriptor = "I")
    private int field184;

    @OriginalMember(owner = "client", name = "Jb", descriptor = "I")
    private int field187;

    @OriginalMember(owner = "client", name = "Kb", descriptor = "I")
    public static int field188;

    @OriginalMember(owner = "client", name = "Mb", descriptor = "I")
    private int field190;

    @OriginalMember(owner = "client", name = "Qb", descriptor = "I")
    private int field194;

    @OriginalMember(owner = "client", name = "Rb", descriptor = "I")
    private int field195;

    @OriginalMember(owner = "client", name = "Sb", descriptor = "I")
    private int field196;

    @OriginalMember(owner = "client", name = "Tb", descriptor = "I")
    private int field197;

    @OriginalMember(owner = "client", name = "Ub", descriptor = "I")
    private int field198;

    @OriginalMember(owner = "client", name = "Vb", descriptor = "I")
    private int field199;

    @OriginalMember(owner = "client", name = "Wb", descriptor = "I")
    private int field200;

    @OriginalMember(owner = "client", name = "Xb", descriptor = "I")
    private int field201;

    @OriginalMember(owner = "client", name = "Yb", descriptor = "I")
    private int field202;

    @OriginalMember(owner = "client", name = "Zb", descriptor = "I")
    private int field203;

    @OriginalMember(owner = "client", name = "ac", descriptor = "I")
    private int field204;

    @OriginalMember(owner = "client", name = "bc", descriptor = "I")
    private int field205;

    @OriginalMember(owner = "client", name = "cc", descriptor = "I")
    private int field206;

    @OriginalMember(owner = "client", name = "gc", descriptor = "I")
    private int field210;

    @OriginalMember(owner = "client", name = "mc", descriptor = "I")
    private int field216;

    @OriginalMember(owner = "client", name = "rc", descriptor = "I")
    private int field221;

    @OriginalMember(owner = "client", name = "tc", descriptor = "I")
    private int field223;

    @OriginalMember(owner = "client", name = "yc", descriptor = "I")
    private int field228;

    @OriginalMember(owner = "client", name = "zc", descriptor = "I")
    private int field229;

    @OriginalMember(owner = "client", name = "Ac", descriptor = "I")
    private int field230;

    @OriginalMember(owner = "client", name = "Hc", descriptor = "I")
    private int field237;

    @OriginalMember(owner = "client", name = "Jc", descriptor = "I")
    private int field239;

    @OriginalMember(owner = "client", name = "Kc", descriptor = "I")
    private int field240;

    @OriginalMember(owner = "client", name = "Sc", descriptor = "I")
    private int field248;

    @OriginalMember(owner = "client", name = "Uc", descriptor = "I")
    private int field250;

    @OriginalMember(owner = "client", name = "ad", descriptor = "I")
    private static int field256;

    @OriginalMember(owner = "client", name = "od", descriptor = "I")
    private int field270;

    @OriginalMember(owner = "client", name = "rd", descriptor = "I")
    public static int field273;

    @OriginalMember(owner = "client", name = "Fd", descriptor = "I")
    private int field287;

    @OriginalMember(owner = "client", name = "Gd", descriptor = "I")
    private int field288;

    @OriginalMember(owner = "client", name = "Hd", descriptor = "I")
    private int field289;

    @OriginalMember(owner = "client", name = "Id", descriptor = "I")
    private int field290;

    @OriginalMember(owner = "client", name = "Kd", descriptor = "I")
    private int field292;

    @OriginalMember(owner = "client", name = "Ld", descriptor = "I")
    private int field293;

    @OriginalMember(owner = "client", name = "Md", descriptor = "I")
    private int field294;

    @OriginalMember(owner = "client", name = "Od", descriptor = "I")
    private int field296;

    @OriginalMember(owner = "client", name = "Pd", descriptor = "I")
    private static int field297;

    @OriginalMember(owner = "client", name = "Qd", descriptor = "I")
    private static int field298;

    @OriginalMember(owner = "client", name = "Vd", descriptor = "I")
    private int field303;

    @OriginalMember(owner = "client", name = "Zd", descriptor = "I")
    private int field307;

    @OriginalMember(owner = "client", name = "ge", descriptor = "I")
    private int field314;

    @OriginalMember(owner = "client", name = "he", descriptor = "I")
    private int field315;

    @OriginalMember(owner = "client", name = "ke", descriptor = "I")
    private int field318;

    @OriginalMember(owner = "client", name = "le", descriptor = "I")
    private int field319;

    @OriginalMember(owner = "client", name = "me", descriptor = "I")
    private int field320;

    @OriginalMember(owner = "client", name = "ne", descriptor = "I")
    private int field321;

    @OriginalMember(owner = "client", name = "oe", descriptor = "I")
    private int field322;

    @OriginalMember(owner = "client", name = "ve", descriptor = "I")
    public static int field329;

    @OriginalMember(owner = "client", name = "ye", descriptor = "I")
    private int field332;

    @OriginalMember(owner = "client", name = "ze", descriptor = "I")
    private int field333;

    @OriginalMember(owner = "client", name = "De", descriptor = "I")
    private int field337;

    @OriginalMember(owner = "client", name = "Ge", descriptor = "I")
    private static int field340;

    @OriginalMember(owner = "client", name = "Le", descriptor = "I")
    private int field345;

    @OriginalMember(owner = "client", name = "Ne", descriptor = "I")
    private int field347;

    @OriginalMember(owner = "client", name = "Re", descriptor = "I")
    private int field351;

    @OriginalMember(owner = "client", name = "Te", descriptor = "I")
    private int field353;

    @OriginalMember(owner = "client", name = "ff", descriptor = "I")
    private int field365;

    @OriginalMember(owner = "client", name = "kf", descriptor = "I")
    private int field369;

    @OriginalMember(owner = "client", name = "lf", descriptor = "I")
    private int field370;

    @OriginalMember(owner = "client", name = "nf", descriptor = "I")
    private int field372;

    @OriginalMember(owner = "client", name = "vf", descriptor = "I")
    private int field380;

    @OriginalMember(owner = "client", name = "wf", descriptor = "I")
    private int field381;

    @OriginalMember(owner = "client", name = "xf", descriptor = "I")
    private int field382;

    @OriginalMember(owner = "client", name = "Bf", descriptor = "I")
    private int field386;

    @OriginalMember(owner = "client", name = "Jf", descriptor = "I")
    private static int field394;

    @OriginalMember(owner = "client", name = "Of", descriptor = "I")
    private int field399;

    @OriginalMember(owner = "client", name = "Pf", descriptor = "I")
    private int field400;

    @OriginalMember(owner = "client", name = "Qf", descriptor = "I")
    private int field401;

    @OriginalMember(owner = "client", name = "Rf", descriptor = "I")
    private int field402;

    @OriginalMember(owner = "client", name = "Tf", descriptor = "I")
    private int field404;

    @OriginalMember(owner = "client", name = "Xf", descriptor = "I")
    private static int field408;

    @OriginalMember(owner = "client", name = "ag", descriptor = "I")
    private int field411;

    @OriginalMember(owner = "client", name = "bg", descriptor = "I")
    private static int field412;

    @OriginalMember(owner = "client", name = "gg", descriptor = "I")
    private int field417;

    @OriginalMember(owner = "client", name = "hg", descriptor = "I")
    private int field418;

    @OriginalMember(owner = "client", name = "ng", descriptor = "I")
    private int field424;

    @OriginalMember(owner = "client", name = "og", descriptor = "I")
    private int field425;

    @OriginalMember(owner = "client", name = "pg", descriptor = "I")
    private int field426;

    @OriginalMember(owner = "client", name = "qg", descriptor = "I")
    private int field427;

    @OriginalMember(owner = "client", name = "rg", descriptor = "I")
    private int field428;

    @OriginalMember(owner = "client", name = "sg", descriptor = "I")
    private int field429;

    @OriginalMember(owner = "client", name = "xg", descriptor = "I")
    private static int field434;

    @OriginalMember(owner = "client", name = "yg", descriptor = "I")
    private int field435;

    @OriginalMember(owner = "client", name = "zg", descriptor = "I")
    private int field436;

    @OriginalMember(owner = "client", name = "Cg", descriptor = "I")
    private int field439;

    @OriginalMember(owner = "client", name = "Dg", descriptor = "I")
    private int field440;

    @OriginalMember(owner = "client", name = "Eg", descriptor = "I")
    public int field441;

    @OriginalMember(owner = "client", name = "Fg", descriptor = "I")
    private int field442;

    @OriginalMember(owner = "client", name = "Gg", descriptor = "I")
    private int field443;

    @OriginalMember(owner = "client", name = "Hg", descriptor = "I")
    private int field444;

    @OriginalMember(owner = "client", name = "Jg", descriptor = "I")
    private int field446;

    @OriginalMember(owner = "client", name = "Kg", descriptor = "I")
    private int field447;

    @OriginalMember(owner = "client", name = "Lg", descriptor = "I")
    private int field448;

    @OriginalMember(owner = "client", name = "Mg", descriptor = "I")
    private int field449;

    @OriginalMember(owner = "client", name = "Ng", descriptor = "I")
    private int field450;

    @OriginalMember(owner = "client", name = "Og", descriptor = "I")
    private int field451;

    @OriginalMember(owner = "client", name = "Pg", descriptor = "I")
    private int field452;

    @OriginalMember(owner = "client", name = "Qg", descriptor = "I")
    private int field453;

    @OriginalMember(owner = "client", name = "Rg", descriptor = "I")
    private int field454;

    @OriginalMember(owner = "client", name = "Sg", descriptor = "I")
    private int field455;

    @OriginalMember(owner = "client", name = "Vg", descriptor = "I")
    private int field458;

    @OriginalMember(owner = "client", name = "Wg", descriptor = "I")
    private int field459;

    @OriginalMember(owner = "client", name = "Xg", descriptor = "I")
    private int field460;

    @OriginalMember(owner = "client", name = "Yg", descriptor = "I")
    private int field461;

    @OriginalMember(owner = "client", name = "Zg", descriptor = "I")
    private int field462;

    @OriginalMember(owner = "client", name = "fh", descriptor = "I")
    private static int field468;

    @OriginalMember(owner = "client", name = "mh", descriptor = "I")
    private int field475;

    @OriginalMember(owner = "client", name = "oh", descriptor = "I")
    private int field477;

    @OriginalMember(owner = "client", name = "xh", descriptor = "I")
    private int field486;

    @OriginalMember(owner = "client", name = "yh", descriptor = "I")
    private int field487;

    @OriginalMember(owner = "client", name = "zh", descriptor = "I")
    private int field488;

    @OriginalMember(owner = "client", name = "Ah", descriptor = "I")
    private int field489;

    @OriginalMember(owner = "client", name = "Bh", descriptor = "I")
    private int field490;

    @OriginalMember(owner = "client", name = "Gh", descriptor = "I")
    private int field495;

    @OriginalMember(owner = "client", name = "Hh", descriptor = "I")
    private int field496;

    @OriginalMember(owner = "client", name = "Ih", descriptor = "I")
    private static int field497;

    @OriginalMember(owner = "client", name = "Ph", descriptor = "I")
    private static int field504;

    @OriginalMember(owner = "client", name = "Qh", descriptor = "I")
    private int field505;

    @OriginalMember(owner = "client", name = "Rh", descriptor = "I")
    private int field506;

    @OriginalMember(owner = "client", name = "Yh", descriptor = "I")
    private int field513;

    @OriginalMember(owner = "client", name = "ai", descriptor = "I")
    private int field515;

    @OriginalMember(owner = "client", name = "fi", descriptor = "I")
    private static int field520;

    @OriginalMember(owner = "client", name = "gi", descriptor = "I")
    private int field521;

    @OriginalMember(owner = "client", name = "pi", descriptor = "I")
    private int field530;

    @OriginalMember(owner = "client", name = "vi", descriptor = "I")
    private static int field536;

    @OriginalMember(owner = "client", name = "zi", descriptor = "I")
    private int field540;

    @OriginalMember(owner = "client", name = "Ei", descriptor = "I")
    private int field545;

    @OriginalMember(owner = "client", name = "Fi", descriptor = "I")
    private int field546;

    @OriginalMember(owner = "client", name = "Gi", descriptor = "I")
    private int field547;

    @OriginalMember(owner = "client", name = "Hi", descriptor = "I")
    private int field548;

    @OriginalMember(owner = "client", name = "Ii", descriptor = "I")
    private int field549;

    @OriginalMember(owner = "client", name = "Ji", descriptor = "I")
    private int field550;

    @OriginalMember(owner = "client", name = "Ki", descriptor = "I")
    private int field551;

    @OriginalMember(owner = "client", name = "Li", descriptor = "I")
    private int field552;

    @OriginalMember(owner = "client", name = "Yi", descriptor = "I")
    private int field565;

    @OriginalMember(owner = "client", name = "Zi", descriptor = "I")
    private int field566;

    @OriginalMember(owner = "client", name = "aj", descriptor = "I")
    private int field567;

    @OriginalMember(owner = "client", name = "dj", descriptor = "I")
    private int field570;

    @OriginalMember(owner = "client", name = "ej", descriptor = "I")
    private int field571;

    @OriginalMember(owner = "client", name = "fj", descriptor = "I")
    private int field572;

    @OriginalMember(owner = "client", name = "hj", descriptor = "I")
    private int field574;

    @OriginalMember(owner = "client", name = "jj", descriptor = "I")
    private int field576;

    @OriginalMember(owner = "client", name = "mj", descriptor = "I")
    private int field579;

    @OriginalMember(owner = "client", name = "Aj", descriptor = "I")
    private int field593;

    @OriginalMember(owner = "client", name = "Gj", descriptor = "I")
    private static int field599;

    @OriginalMember(owner = "client", name = "Lj", descriptor = "I")
    private static int field604;

    @OriginalMember(owner = "client", name = "Mj", descriptor = "I")
    private static int field605;

    @OriginalMember(owner = "client", name = "Qj", descriptor = "I")
    private static int field609;

    @OriginalMember(owner = "client", name = "Tj", descriptor = "I")
    private int field612;

    @OriginalMember(owner = "client", name = "Zj", descriptor = "I")
    public static int field618;

    @OriginalMember(owner = "client", name = "nd", descriptor = "J")
    private long field269;

    @OriginalMember(owner = "client", name = "xe", descriptor = "J")
    private long field331;

    @OriginalMember(owner = "client", name = "Ze", descriptor = "J")
    public long field359;

    @OriginalMember(owner = "client", name = "ki", descriptor = "J")
    private long field525;

    @OriginalMember(owner = "client", name = "Ai", descriptor = "J")
    private long field541;

    @OriginalMember(owner = "client", name = "Ij", descriptor = "LEAXVDNXA;")
    private class12 field601;

    @OriginalMember(owner = "client", name = "pf", descriptor = "LEEDCHWRL;")
    private class13 field374;

    @OriginalMember(owner = "client", name = "Dc", descriptor = "LFETXLXVZ;")
    private class16 field233;

    @OriginalMember(owner = "client", name = "Ec", descriptor = "LFETXLXVZ;")
    private class16 field234;

    @OriginalMember(owner = "client", name = "Fc", descriptor = "LFETXLXVZ;")
    private class16 field235;

    @OriginalMember(owner = "client", name = "Gc", descriptor = "LFETXLXVZ;")
    private class16 field236;

    @OriginalMember(owner = "client", name = "cd", descriptor = "LFETXLXVZ;")
    private class16 field258;

    @OriginalMember(owner = "client", name = "dd", descriptor = "LFETXLXVZ;")
    private class16 field259;

    @OriginalMember(owner = "client", name = "ed", descriptor = "LFETXLXVZ;")
    private class16 field260;

    @OriginalMember(owner = "client", name = "fd", descriptor = "LFETXLXVZ;")
    private class16 field261;

    @OriginalMember(owner = "client", name = "gd", descriptor = "LFETXLXVZ;")
    private class16 field262;

    @OriginalMember(owner = "client", name = "hd", descriptor = "LFETXLXVZ;")
    private class16 field263;

    @OriginalMember(owner = "client", name = "id", descriptor = "LFETXLXVZ;")
    private class16 field264;

    @OriginalMember(owner = "client", name = "jd", descriptor = "LFETXLXVZ;")
    private class16 field265;

    @OriginalMember(owner = "client", name = "kd", descriptor = "LFETXLXVZ;")
    private class16 field266;

    @OriginalMember(owner = "client", name = "vd", descriptor = "LFETXLXVZ;")
    private class16 field277;

    @OriginalMember(owner = "client", name = "wd", descriptor = "LFETXLXVZ;")
    private class16 field278;

    @OriginalMember(owner = "client", name = "xd", descriptor = "LFETXLXVZ;")
    private class16 field279;

    @OriginalMember(owner = "client", name = "yd", descriptor = "LFETXLXVZ;")
    private class16 field280;

    @OriginalMember(owner = "client", name = "zd", descriptor = "LFETXLXVZ;")
    private class16 field281;

    @OriginalMember(owner = "client", name = "Ad", descriptor = "LFETXLXVZ;")
    private class16 field282;

    @OriginalMember(owner = "client", name = "Bd", descriptor = "LFETXLXVZ;")
    private class16 field283;

    @OriginalMember(owner = "client", name = "Cd", descriptor = "LFETXLXVZ;")
    private class16 field284;

    @OriginalMember(owner = "client", name = "Dd", descriptor = "LFETXLXVZ;")
    private class16 field285;

    @OriginalMember(owner = "client", name = "rf", descriptor = "LFETXLXVZ;")
    private class16 field376;

    @OriginalMember(owner = "client", name = "sf", descriptor = "LFETXLXVZ;")
    private class16 field377;

    @OriginalMember(owner = "client", name = "tf", descriptor = "LFETXLXVZ;")
    private class16 field378;

    @OriginalMember(owner = "client", name = "Qi", descriptor = "LGPPDQFCV;")
    public static class22 field557;

    @OriginalMember(owner = "client", name = "Bc", descriptor = "LJONKABPT;")
    private class37 field231;

    @OriginalMember(owner = "client", name = "Cc", descriptor = "LJONKABPT;")
    private class37 field232;

    @OriginalMember(owner = "client", name = "Pc", descriptor = "LJONKABPT;")
    private class37 field245;

    @OriginalMember(owner = "client", name = "Ae", descriptor = "LJONKABPT;")
    private class37 field334;

    @OriginalMember(owner = "client", name = "gh", descriptor = "LJONKABPT;")
    private class37 field469;

    @OriginalMember(owner = "client", name = "hh", descriptor = "LJONKABPT;")
    private class37 field470;

    @OriginalMember(owner = "client", name = "qh", descriptor = "LJONKABPT;")
    private class37 field479;

    @OriginalMember(owner = "client", name = "rh", descriptor = "LJONKABPT;")
    private class37 field480;

    @OriginalMember(owner = "client", name = "sh", descriptor = "LJONKABPT;")
    private class37 field481;

    @OriginalMember(owner = "client", name = "th", descriptor = "LJONKABPT;")
    private class37 field482;

    @OriginalMember(owner = "client", name = "uh", descriptor = "LJONKABPT;")
    private class37 field483;

    @OriginalMember(owner = "client", name = "Dh", descriptor = "LJONKABPT;")
    private class37 field492;

    @OriginalMember(owner = "client", name = "Eh", descriptor = "LJONKABPT;")
    private class37 field493;

    @OriginalMember(owner = "client", name = "Wi", descriptor = "LJONKABPT;")
    private class37 field563;

    @OriginalMember(owner = "client", name = "ec", descriptor = "LJQZFCGYF;")
    private class38 field208;

    @OriginalMember(owner = "client", name = "fc", descriptor = "LJQZFCGYF;")
    private class38 field209;

    @OriginalMember(owner = "client", name = "Sd", descriptor = "LJQZFCGYF;")
    private class38 field300;

    @OriginalMember(owner = "client", name = "Td", descriptor = "LJQZFCGYF;")
    private class38 field301;

    @OriginalMember(owner = "client", name = "Ud", descriptor = "LJQZFCGYF;")
    private class38 field302;

    @OriginalMember(owner = "client", name = "ae", descriptor = "LJQZFCGYF;")
    private class38 field308;

    @OriginalMember(owner = "client", name = "be", descriptor = "LJQZFCGYF;")
    private class38 field309;

    @OriginalMember(owner = "client", name = "qe", descriptor = "LJQZFCGYF;")
    private class38 field324;

    @OriginalMember(owner = "client", name = "re", descriptor = "LJQZFCGYF;")
    private class38 field325;

    @OriginalMember(owner = "client", name = "se", descriptor = "LJQZFCGYF;")
    private class38 field326;

    @OriginalMember(owner = "client", name = "Df", descriptor = "LJQZFCGYF;")
    private class38 field388;

    @OriginalMember(owner = "client", name = "Ef", descriptor = "LJQZFCGYF;")
    private class38 field389;

    @OriginalMember(owner = "client", name = "Ff", descriptor = "LJQZFCGYF;")
    private class38 field390;

    @OriginalMember(owner = "client", name = "Gf", descriptor = "LJQZFCGYF;")
    private class38 field391;

    @OriginalMember(owner = "client", name = "Hf", descriptor = "LJQZFCGYF;")
    private class38 field392;

    @OriginalMember(owner = "client", name = "Ri", descriptor = "LJQZFCGYF;")
    private class38 field558;

    @OriginalMember(owner = "client", name = "Si", descriptor = "LJQZFCGYF;")
    private class38 field559;

    @OriginalMember(owner = "client", name = "Ti", descriptor = "LJQZFCGYF;")
    private class38 field560;

    @OriginalMember(owner = "client", name = "Ui", descriptor = "LJQZFCGYF;")
    private class38 field561;

    @OriginalMember(owner = "client", name = "Vi", descriptor = "LJQZFCGYF;")
    private class38 field562;

    @OriginalMember(owner = "client", name = "ib", descriptor = "LOSNNCWUM;")
    private class48 field160;

    @OriginalMember(owner = "client", name = "jb", descriptor = "LOSNNCWUM;")
    private class48 field161;

    @OriginalMember(owner = "client", name = "kb", descriptor = "LOSNNCWUM;")
    private class48 field162;

    @OriginalMember(owner = "client", name = "lb", descriptor = "LOSNNCWUM;")
    private class48 field163;

    @OriginalMember(owner = "client", name = "cg", descriptor = "LPJNVYQWL;")
    private class50 field413;

    @OriginalMember(owner = "client", name = "yf", descriptor = "LTTQEUGTP;")
    public class57 field383;

    @OriginalMember(owner = "client", name = "Sf", descriptor = "LUGKPKMOJ;")
    private class59 field403;

    @OriginalMember(owner = "client", name = "Xd", descriptor = "LCWPTWZXW;")
    private class8 field305;

    @OriginalMember(owner = "client", name = "Jd", descriptor = "Ljava/lang/String;")
    public String field291;

    @OriginalMember(owner = "client", name = "Bg", descriptor = "Ljava/lang/String;")
    private String field438;

    @OriginalMember(owner = "client", name = "si", descriptor = "Ljava/lang/String;")
    private String field533;

    @OriginalMember(owner = "client", name = "gj", descriptor = "Ljava/lang/String;")
    public String field573;

    @OriginalMember(owner = "client", name = "Ab", descriptor = "Ljava/net/Socket;")
    private Socket field178;

    @OriginalMember(owner = "client", name = "Xc", descriptor = "Z")
    private static boolean field253;

    @OriginalMember(owner = "client", name = "td", descriptor = "Z")
    private static boolean field275;

    @OriginalMember(owner = "client", name = "Ig", descriptor = "Z")
    public static boolean field445;

    @OriginalMember(owner = "client", name = "ci", descriptor = "Z")
    public static boolean field517;

    @OriginalMember(owner = "client", name = "Wj", descriptor = "Z")
    private static boolean field615;

    @OriginalMember(owner = "client", name = "T", descriptor = "[I")
    private int[] field145;

    @OriginalMember(owner = "client", name = "U", descriptor = "[I")
    private int[] field146;

    @OriginalMember(owner = "client", name = "V", descriptor = "[I")
    private int[] field147;

    @OriginalMember(owner = "client", name = "W", descriptor = "[I")
    private int[] field148;

    @OriginalMember(owner = "client", name = "Lc", descriptor = "[I")
    private int[] field241;

    @OriginalMember(owner = "client", name = "Mc", descriptor = "[I")
    private int[] field242;

    @OriginalMember(owner = "client", name = "Nc", descriptor = "[I")
    private int[] field243;

    @OriginalMember(owner = "client", name = "df", descriptor = "[I")
    private int[] field363;

    @OriginalMember(owner = "client", name = "ef", descriptor = "[I")
    private int[] field364;

    @OriginalMember(owner = "client", name = "li", descriptor = "[I")
    private int[] field526;

    @OriginalMember(owner = "client", name = "mi", descriptor = "[I")
    private int[] field527;

    @OriginalMember(owner = "client", name = "ni", descriptor = "[I")
    private int[] field528;

    @OriginalMember(owner = "client", name = "Xj", descriptor = "[I")
    private int[] field616;

    @OriginalMember(owner = "client", name = "Yj", descriptor = "[I")
    private int[] field617;

    @OriginalMember(owner = "client", name = "vb", descriptor = "[LJQZFCGYF;")
    private class38[] field173;

    @OriginalMember(owner = "client", name = "Ob", descriptor = "[[B")
    private byte[][] field192;

    @OriginalMember(owner = "client", name = "ud", descriptor = "[[B")
    private byte[][] field276;

    @OriginalMember(owner = "client", name = "ui", descriptor = "[[[B")
    private byte[][][] field535;

    @OriginalMember(owner = "client", name = "Pb", descriptor = "[[[I")
    private int[][][] field193;

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZLFDUKJGTQ;I)I")
    public final int method83(boolean arg0, class15 arg1, int arg2) {
        if (arg0) {
            return 4;
        } else if (arg1.field785 != null && arg2 < arg1.field785.length) {
            try {
                int[] var4 = arg1.field785[arg2];
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
                        var9 = this.field267[var4[var6++]];
                    }
                    if (var8 == 2) {
                        var9 = this.field257[var4[var6++]];
                    }
                    if (var8 == 3) {
                        var9 = this.field328[var4[var6++]];
                    }
                    if (var8 == 4) {
                        class15 var11 = class15.field806[var4[var6++]];
                        int var12 = var4[var6++];
                        if (var12 >= 0 && var12 < class52.field1323 && (!class52.method489(var12).field1371 || field274)) {
                            for (int var13 = 0; var13 < var11.field814.length; ++var13) {
                                if (var12 + 1 == var11.field814[var13]) {
                                    var9 += var11.field811[var13];
                                }
                            }
                        }
                    }
                    if (var8 == 5) {
                        var9 = this.field395[var4[var6++]];
                    }
                    if (var8 == 6) {
                        var9 = field335[this.field257[var4[var6++]] - 1];
                    }
                    if (var8 == 7) {
                        var9 = this.field395[var4[var6++]] * 100 / 46875;
                    }
                    if (var8 == 8) {
                        var9 = field557.field962;
                    }
                    if (var8 == 9) {
                        for (int var14 = 0; var14 < class49.field1301; ++var14) {
                            if (class49.field1303[var14]) {
                                var9 += this.field257[var14];
                            }
                        }
                    }
                    if (var8 == 10) {
                        class15 var15 = class15.field806[var4[var6++]];
                        int var16 = var4[var6++] + 1;
                        if (var16 >= 0 && var16 < class52.field1323 && (!class52.method489(var16).field1371 || field274)) {
                            for (int var17 = 0; var17 < var15.field814.length; ++var17) {
                                if (var15.field814[var17] == var16) {
                                    var9 = 999999999;
                                    break;
                                }
                            }
                        }
                    }
                    if (var8 == 11) {
                        var9 = this.field294;
                    }
                    if (var8 == 12) {
                        var9 = this.field151;
                    }
                    if (var8 == 13) {
                        int var18 = this.field395[var4[var6++]];
                        int var19 = var4[var6++];
                        var9 = (var18 & 1 << var19) != 0 ? 1 : 0;
                    }
                    if (var8 == 14) {
                        int var20 = var4[var6++];
                        class72 var21 = class72.field1715[var20];
                        int var22 = var21.field1717;
                        int var23 = var21.field1718;
                        int var24 = var21.field1719;
                        int var25 = field217[var24 - var23];
                        var9 = this.field395[var22] >> var23 & var25;
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
                        var9 = (field557.field1570 >> 7) + this.field545;
                    }
                    if (var8 == 19) {
                        var9 = (field557.field1571 >> 7) + this.field546;
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

    @OriginalMember(owner = "client", name = "d", descriptor = "(I)V")
    public final void method84(int arg0) {
        while (arg0 >= 0) {
            this.field542 = !this.field542;
        }
        if (this.field426 == 0) {
            int var2 = super.field1114;
            if (this.field570 == 1 && super.field1115 >= 516 && super.field1116 >= 160 && super.field1115 <= 765 && super.field1116 <= 205) {
                var2 = 0;
            }
            if (this.field342) {
                if (var2 != 1) {
                    int var3 = super.field1108;
                    int var4 = super.field1109;
                    if (this.field451 == 0) {
                        var3 -= 4;
                        var4 -= 4;
                    }
                    if (this.field451 == 1) {
                        var3 -= 553;
                        var4 -= 205;
                    }
                    if (this.field451 == 2) {
                        var3 -= 17;
                        var4 -= 357;
                    }
                    if (var3 < this.field452 - 10 || var3 > this.field454 + this.field452 + 10 || var4 < this.field453 - 10 || var4 > this.field455 + this.field453 + 10) {
                        this.field342 = false;
                        if (this.field451 == 1) {
                            this.field433 = true;
                        }
                        if (this.field451 == 2) {
                            this.field578 = true;
                        }
                    }
                }
                if (var2 == 1) {
                    int var5 = this.field452;
                    int var6 = this.field453;
                    int var7 = this.field454;
                    int var8 = super.field1115;
                    int var9 = super.field1116;
                    if (this.field451 == 0) {
                        var8 -= 4;
                        var9 -= 4;
                    }
                    if (this.field451 == 1) {
                        var8 -= 553;
                        var9 -= 205;
                    }
                    if (this.field451 == 2) {
                        var8 -= 17;
                        var9 -= 357;
                    }
                    int var10 = -1;
                    for (int var11 = 0; var11 < this.field315; ++var11) {
                        int var12 = (this.field315 - 1 - var11) * 15 + var6 + 31;
                        if (var8 > var5 && var8 < var5 + var7 && var9 > var12 - 13 && var9 < var12 + 3) {
                            var10 = var11;
                        }
                    }
                    if (var10 != -1) {
                        this.method118(var10, -46295);
                    }
                    this.field342 = false;
                    if (this.field451 == 1) {
                        this.field433 = true;
                    }
                    if (this.field451 == 2) {
                        this.field578 = true;
                        return;
                    }
                }
            } else {
                if (var2 == 1 && this.field315 > 0) {
                    int var13 = this.field213[this.field315 - 1];
                    if (var13 == 848 || var13 == 672 || var13 == 808 || var13 == 365 || var13 == 881 || var13 == 602 || var13 == 454 || var13 == 306 || var13 == 894 || var13 == 369 || var13 == 979 || var13 == 1435) {
                        int var14 = this.field211[this.field315 - 1];
                        int var15 = this.field212[this.field315 - 1];
                        class15 var16 = class15.field806[var15];
                        if (var16.field776 || var16.field826) {
                            this.field295 = false;
                            this.field210 = 0;
                            this.field424 = var15;
                            this.field425 = var14;
                            this.field426 = 2;
                            this.field427 = super.field1115;
                            this.field428 = super.field1116;
                            if (class15.field806[var15].field818 == this.field268) {
                                this.field426 = 1;
                            }
                            if (class15.field806[var15].field818 == this.field472) {
                                this.field426 = 3;
                            }
                            return;
                        }
                    }
                }
                if (var2 == 1 && (this.field612 == 1 || this.method182(true, this.field315 - 1)) && this.field315 > 2) {
                    var2 = 2;
                }
                if (var2 == 1 && this.field315 > 0) {
                    this.method118(this.field315 - 1, -46295);
                }
                if (var2 != 2 || this.field315 <= 0) {
                    return;
                }
                this.method150((byte) 2);
            }
        }
    }

    @OriginalMember(owner = "client", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        return signlink.mainapp != null ? signlink.mainapp.getAppletContext() : super.getAppletContext();
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(I)V")
    public final void method85(int arg0) {
        if (this.field426 == 0) {
            this.field349[0] = "Cancel";
            this.field213[0] = 1484;
            this.field315 = 1;
            this.method210(102);
            this.field159 = 0;
            if (super.field1108 > 4 && super.field1109 > 4 && super.field1108 < 516 && super.field1109 < 338) {
                if (this.field268 != -1) {
                    this.method169(super.field1108, 0, 4, 4, class15.field806[this.field268], (byte) -12, super.field1109);
                } else {
                    this.method104(true);
                }
            }
            if (this.field314 != this.field159) {
                this.field314 = this.field159;
            }
            this.field159 = 0;
            if (super.field1108 > 553 && super.field1109 > 205 && super.field1108 < 743 && super.field1109 < 466) {
                if (this.field474 != -1) {
                    this.method169(super.field1108, 0, 205, 553, class15.field806[this.field474], (byte) -12, super.field1109);
                } else if (this.field414[this.field169] != -1) {
                    this.method169(super.field1108, 0, 205, 553, class15.field806[this.field414[this.field169]], (byte) -12, super.field1109);
                }
            }
            if (this.field159 != this.field149) {
                this.field433 = true;
                this.field149 = this.field159;
            }
            this.field159 = 0;
            if (super.field1108 > 17 && super.field1109 > 357 && super.field1108 < 496 && super.field1109 < 453) {
                if (this.field472 != -1) {
                    this.method169(super.field1108, 0, 357, 17, class15.field806[this.field472], (byte) -12, super.field1109);
                } else if (super.field1109 < 434 && super.field1108 < 426) {
                    this.method124(super.field1108 - 17, super.field1109 - 357, this.field611);
                }
            }
            if (this.field472 != -1 && this.field194 != this.field159) {
                this.field578 = true;
                this.field194 = this.field159;
            }
            boolean var2 = false;
            if (arg0 < 0 || arg0 > 0) {
                this.field196 = this.field299.method44();
            }
            while (!var2) {
                var2 = true;
                for (int var3 = 0; var3 < this.field315 - 1; ++var3) {
                    if (this.field213[var3] < 1000 && this.field213[var3 + 1] > 1000) {
                        String var4 = this.field349[var3];
                        this.field349[var3] = this.field349[var3 + 1];
                        this.field349[var3 + 1] = var4;
                        int var5 = this.field213[var3];
                        this.field213[var3] = this.field213[var3 + 1];
                        this.field213[var3 + 1] = var5;
                        int var6 = this.field211[var3];
                        this.field211[var3] = this.field211[var3 + 1];
                        this.field211[var3 + 1] = var6;
                        int var7 = this.field212[var3];
                        this.field212[var3] = this.field212[var3 + 1];
                        this.field212[var3 + 1] = var7;
                        int var8 = this.field214[var3];
                        this.field214[var3] = this.field214[var3 + 1];
                        this.field214[var3 + 1] = var8;
                        var2 = false;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(Z)V")
    public final void method86(boolean arg0) {
        if (arg0) {
            this.field398 = null;
        }
        this.field514 = true;
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(B)V")
    public final void method87(byte arg0) {
        if (arg0 == 4) {
            boolean var2 = false;
        } else {
            this.field398 = null;
        }
        signlink.midifade = 0;
        signlink.midi = "stop";
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(I)V")
    public final void method88(int arg0) {
        short var2 = 256;
        if (this.field369 > 0) {
            for (int var3 = 0; var3 < 256; ++var3) {
                if (this.field369 > 768) {
                    this.field145[var3] = this.method100(1024 - this.field369, this.field146[var3], 0, this.field147[var3]);
                } else if (this.field369 > 256) {
                    this.field145[var3] = this.field147[var3];
                } else {
                    this.field145[var3] = this.method100(256 - this.field369, this.field147[var3], 0, this.field146[var3]);
                }
            }
        } else if (this.field370 > 0) {
            for (int var4 = 0; var4 < 256; ++var4) {
                if (this.field370 > 768) {
                    this.field145[var4] = this.method100(1024 - this.field370, this.field146[var4], 0, this.field148[var4]);
                } else if (this.field370 > 256) {
                    this.field145[var4] = this.field148[var4];
                } else {
                    this.field145[var4] = this.method100(256 - this.field370, this.field148[var4], 0, this.field146[var4]);
                }
            }
        } else {
            for (int var5 = 0; var5 < 256; ++var5) {
                this.field145[var5] = this.field146[var5];
            }
        }
        for (int var6 = 0; var6 < 33920; ++var6) {
            this.field261.field838[var6] = this.field492.field1173[var6];
        }
        int var7 = 0;
        int var8 = 1152;
        for (int var9 = 1; var9 < var2 - 1; ++var9) {
            int var23 = (var2 - var9) * this.field473[var9] / var2;
            int var24 = var23 + 22;
            if (var24 < 0) {
                var24 = 0;
            }
            var7 += var24;
            for (int var25 = var24; var25 < 128; ++var25) {
                int var26 = this.field616[var7++];
                if (var26 != 0) {
                    int var28 = 256 - var26;
                    int var29 = this.field145[var26];
                    int var30 = this.field261.field838[var8];
                    this.field261.field838[var8++] = ((var29 & 16711935) * var26 + (var30 & 16711935) * var28 & -16711936) + ((var29 & 65280) * var26 + (var30 & 65280) * var28 & 16711680) >> 8;
                } else {
                    ++var8;
                }
            }
            var8 += var24;
        }
        this.field261.method290(1, 0, 0, super.field1100);
        for (int var10 = 0; var10 < 33920; ++var10) {
            this.field262.field838[var10] = this.field493.field1173[var10];
        }
        int var11 = 0;
        int var12 = 1176;
        for (int var13 = 1; var13 < var2 - 1; ++var13) {
            int var14 = (var2 - var13) * this.field473[var13] / var2;
            int var15 = 103 - var14;
            int var16 = var12 + var14;
            for (int var17 = 0; var17 < var15; ++var17) {
                int var18 = this.field616[var11++];
                if (var18 != 0) {
                    int var20 = 256 - var18;
                    int var21 = this.field145[var18];
                    int var22 = this.field262.field838[var16];
                    this.field262.field838[var16++] = ((var21 & 16711935) * var18 + (var22 & 16711935) * var20 & -16711936) + ((var21 & 65280) * var18 + (var22 & 65280) * var20 & 16711680) >> 8;
                } else {
                    ++var16;
                }
            }
            var11 += 128 - var15;
            var12 = 128 - var15 - var14 + var16;
        }
        this.field262.method290(1, 0, 637, super.field1100);
        if (arg0 < 7 || arg0 > 7) {
            field253 = true;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIII)V")
    public final void method89(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field208.method442(arg3, arg0, false);
        this.field209.method442(arg2 + arg3 - 16, arg0, false);
        class35.method417(466, arg3 + 16, arg2 - 32, arg0, 16, this.field343);
        int var7 = (arg2 - 32) * arg2 / arg5;
        if (var7 < 8) {
            var7 = 8;
        }
        int var8 = (arg2 - 32 - var7) * arg4 / (arg5 - arg2);
        class35.method417(466, arg3 + 16 + var8, var7, arg0, 16, this.field310);
        class35.method422(arg0, this.field164, arg3 + 16 + var8, true, var7);
        this.field195 += arg1;
        class35.method422(arg0 + 1, this.field164, arg3 + 16 + var8, true, var7);
        class35.method420(this.field164, arg3 + 16 + var8, this.field344, arg0, 16);
        class35.method420(this.field164, arg3 + 17 + var8, this.field344, arg0, 16);
        class35.method422(arg0 + 15, this.field422, arg3 + 16 + var8, true, var7);
        class35.method422(arg0 + 14, this.field422, arg3 + 17 + var8, true, var7 - 1);
        class35.method420(this.field422, arg3 + 15 + var8 + var7, this.field344, arg0, 16);
        class35.method420(this.field422, arg3 + 14 + var8 + var7, this.field344, arg0 + 1, 15);
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(BI)V")
    public final void method90(byte arg0, int arg1) {
        if (arg0 == 35) {
            signlink.wavevol = arg1;
        }
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(I)V")
    public final void method91(int arg0) {
        this.field614 = true;
        for (int var2 = 0; var2 < 7; ++var2) {
            this.field346[var2] = -1;
            for (int var4 = 0; var4 < class29.field1051; ++var4) {
                if (!class29.field1052[var4].field1058 && class29.field1052[var4].field1053 == var2 + (this.field464 ? 0 : 7)) {
                    this.field346[var2] = var4;
                    break;
                }
            }
        }
        int var3 = 19 / arg0;
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(Z)V")
    public final void method92(boolean arg0) {
        if (this.field199 > 0) {
            this.method99(false);
        } else {
            this.field235.method289(true);
            this.field161.method464(144, 0, 0, 257, "Connection lost");
            this.field161.method464(143, 16777215, 0, 256, "Connection lost");
            this.field161.method464(159, 0, 0, 257, "Please wait - attempting to reestablish");
            this.field161.method464(158, 16777215, 0, 256, "Please wait - attempting to reestablish");
            if (arg0) {
                this.field238 = 420;
            }
            this.field235.method290(1, 4, 4, super.field1100);
            this.field411 = 0;
            this.field332 = 0;
            class8 var2 = this.field305;
            this.field512 = false;
            this.field216 = 0;
            this.method195(this.field136, this.field137, true);
            if (!this.field512) {
                this.method99(false);
            }
            try {
                var2.method229();
            } catch (Exception var3) {
            }
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(Z)V")
    public final void method93(boolean arg0) {
        this.field512 &= arg0;
        for (class66 var2 = (class66) this.field466.method585(); var2 != null; var2 = (class66) this.field466.method587(0)) {
            if (this.field442 == var2.field1675 && field329 <= var2.field1660) {
                if (field329 >= var2.field1659) {
                    if (var2.field1663 > 0) {
                        class55 var4 = this.field247[var2.field1663 - 1];
                        if (var4 != null && var4.field1570 >= 0 && var4.field1570 < 13312 && var4.field1571 >= 0 && var4.field1571 < 13312) {
                            var2.method576(this.method194(var2.field1675, 0, var4.field1570, var4.field1571) - var2.field1656, var4.field1570, var4.field1571, 301, field329);
                        }
                    }
                    if (var2.field1663 < 0) {
                        int var5 = -var2.field1663 - 1;
                        class22 var6;
                        if (this.field396 == var5) {
                            var6 = field557;
                        } else {
                            var6 = this.field220[var5];
                        }
                        if (var6 != null && var6.field1570 >= 0 && var6.field1570 < 13312 && var6.field1571 >= 0 && var6.field1571 < 13312) {
                            var2.method576(this.method194(var2.field1675, 0, var6.field1570, var6.field1571) - var2.field1656, var6.field1570, var6.field1571, 301, field329);
                        }
                    }
                    var2.method577(this.field459, (byte) 2);
                    this.field403.method518(false, 60, var2, var2.field1673, -1, (int) var2.field1670, this.field442, (int) var2.field1671, (int) var2.field1672, 615);
                }
            } else {
                var2.method450();
            }
        }
        ++field297;
        if (field297 > 1045) {
            field297 = 0;
            this.field608.method33((byte) 57, 234);
            this.field608.method34(0);
            int var3 = this.field608.field123;
            if ((int) (Math.random() * 2.0D) == 0) {
                this.field608.method35(60614);
            }
            this.field608.method34(170);
            this.field608.method35((int) (Math.random() * 65536.0D));
            this.field608.method35(42459);
            this.field608.method35(33342);
            this.field608.method34((int) (Math.random() * 256.0D));
            this.field608.method35(17955);
            if ((int) (Math.random() * 2.0D) == 0) {
                this.field608.method34(56);
            }
            if ((int) (Math.random() * 2.0D) == 0) {
                this.field608.method35(37865);
            }
            this.field608.method35(33168);
            this.field608.method43(0, this.field608.field123 - var3);
        }
    }

    @OriginalMember(owner = "client", name = "h", descriptor = "(I)V")
    public final void method94(int arg0) {
        this.field579 = 0;
        for (int var2 = -1; var2 < this.field248 + this.field221; ++var2) {
            class61 var20;
            if (var2 == -1) {
                var20 = field557;
            } else if (var2 < this.field221) {
                var20 = this.field220[this.field222[var2]];
            } else {
                var20 = this.field247[this.field249[var2 - this.field221]];
            }
            if (var20 != null && var20.method368(-32976)) {
                if (var20 instanceof class55) {
                    class4 var21 = ((class55) var20).field1398;
                    if (var21.field82 != null) {
                        var21 = var21.method27(-20711);
                    }
                    if (var21 == null) {
                        continue;
                    }
                }
                if (var2 >= this.field221) {
                    class4 var25 = ((class55) var20).field1398;
                    if (var25.field74 >= 0 && var25.field74 < this.field437.length) {
                        this.method164((byte) 99, var20, var20.field1569 + 15);
                        if (this.field456 > -1) {
                            this.field437[var25.field74].method429(this.field457 - 30, this.field456 - 12, false);
                        }
                    }
                    if (this.field404 == 1 && this.field249[var2 - this.field221] == this.field293 && field329 % 20 < 10) {
                        this.method164((byte) 99, var20, var20.field1569 + 15);
                        if (this.field456 > -1) {
                            this.field437[2].method429(this.field457 - 28, this.field456 - 12, false);
                        }
                    }
                } else {
                    int var22 = 30;
                    class22 var23 = (class22) var20;
                    if (var23.field952 != 0) {
                        this.method164((byte) 99, var20, var20.field1569 + 15);
                        if (this.field456 > -1) {
                            for (int var24 = 0; var24 < 8; ++var24) {
                                if ((var23.field952 & 1 << var24) != 0) {
                                    this.field437[var24].method429(this.field457 - var22, this.field456 - 12, false);
                                    var22 -= 25;
                                }
                            }
                        }
                    }
                    if (var2 >= 0 && this.field404 == 10 && this.field222[var2] == this.field153) {
                        this.method164((byte) 99, var20, var20.field1569 + 15);
                        if (this.field456 > -1) {
                            this.field437[7].method429(this.field457 - var22, this.field456 - 12, false);
                        }
                    }
                }
                if (var20.field1529 != null && (var2 >= this.field221 || this.field540 == 0 || this.field540 == 3 || this.field540 == 1 && this.method219(((class22) var20).field973, (byte) 1))) {
                    this.method164((byte) 99, var20, var20.field1569);
                    if (this.field456 > -1 && this.field579 < this.field580) {
                        this.field584[this.field579] = this.field162.method467(var20.field1529, this.field144) / 2;
                        this.field583[this.field579] = this.field162.field1298;
                        this.field581[this.field579] = this.field456;
                        this.field582[this.field579] = this.field457;
                        this.field585[this.field579] = var20.field1528;
                        this.field586[this.field579] = var20.field1534;
                        this.field587[this.field579] = var20.field1558;
                        this.field588[this.field579++] = var20.field1529;
                        if (this.field351 == 0 && var20.field1534 >= 1 && var20.field1534 <= 3) {
                            this.field583[this.field579] += 10;
                            this.field582[this.field579] += 5;
                        }
                        if (this.field351 == 0 && var20.field1534 == 4) {
                            this.field584[this.field579] = 60;
                        }
                        if (this.field351 == 0 && var20.field1534 == 5) {
                            this.field583[this.field579] += 5;
                        }
                    }
                }
                if (var20.field1530 > field329) {
                    this.method164((byte) 99, var20, var20.field1569 + 15);
                    if (this.field456 > -1) {
                        int var26 = var20.field1531 * 30 / var20.field1532;
                        if (var26 > 30) {
                            var26 = 30;
                        }
                        class35.method417(466, this.field457 - 3, 5, this.field456 - 15, var26, 65280);
                        class35.method417(466, this.field457 - 3, 5, this.field456 - 15 + var26, 30 - var26, 16711680);
                    }
                }
                for (int var27 = 0; var27 < 4; ++var27) {
                    if (var20.field1549[var27] > field329) {
                        this.method164((byte) 99, var20, var20.field1569 / 2);
                        if (this.field456 > -1) {
                            if (var27 == 1) {
                                this.field457 -= 20;
                            }
                            if (var27 == 2) {
                                this.field456 -= 15;
                                this.field457 -= 10;
                            }
                            if (var27 == 3) {
                                this.field456 += 15;
                                this.field457 -= 10;
                            }
                            this.field537[var20.field1548[var27]].method429(this.field457 - 12, this.field456 - 12, false);
                            this.field160.method464(this.field457 + 4, 0, 0, this.field456, String.valueOf(var20.field1547[var27]));
                            this.field160.method464(this.field457 + 3, 16777215, 0, this.field456 - 1, String.valueOf(var20.field1547[var27]));
                        }
                    }
                }
            }
        }
        this.field195 += arg0;
        ++field504;
        if (field504 > 1331) {
            field504 = 0;
            this.field608.method33((byte) 57, 54);
            this.field608.method34(0);
            int var3 = this.field608.field123;
            if ((int) (Math.random() * 2.0D) == 0) {
                this.field608.method35(42239);
            }
            if ((int) (Math.random() * 2.0D) == 0) {
                this.field608.method35(18928);
            }
            this.field608.method34(21);
            this.field608.method34(14);
            this.field608.method34((int) (Math.random() * 256.0D));
            this.field608.method34(10);
            this.field608.method35(29609);
            if ((int) (Math.random() * 2.0D) == 0) {
                this.field608.method35(22957);
            }
            this.field608.method34(245);
            this.field608.method34(50);
            this.field608.method43(0, this.field608.field123 - var3);
        }
        for (int var4 = 0; var4 < this.field579; ++var4) {
            int var5 = this.field581[var4];
            int var6 = this.field582[var4];
            int var7 = this.field584[var4];
            int var8 = this.field583[var4];
            boolean var9 = true;
            while (var9) {
                var9 = false;
                for (int var19 = 0; var19 < var4; ++var19) {
                    if (var6 + 2 > this.field582[var19] - this.field583[var19] && var6 - var8 < this.field582[var19] + 2 && var5 - var7 < this.field584[var19] + this.field581[var19] && var5 + var7 > this.field581[var19] - this.field584[var19] && this.field582[var19] - this.field583[var19] < var6) {
                        var6 = this.field582[var19] - this.field583[var19];
                        var9 = true;
                    }
                }
            }
            this.field456 = this.field581[var4];
            this.field457 = this.field582[var4] = var6;
            String var10 = this.field588[var4];
            if (this.field351 == 0) {
                int var11 = 16776960;
                if (this.field585[var4] < 6) {
                    var11 = this.field523[this.field585[var4]];
                }
                if (this.field585[var4] == 6) {
                    var11 = this.field530 % 20 < 10 ? 16711680 : 16776960;
                }
                if (this.field585[var4] == 7) {
                    var11 = this.field530 % 20 < 10 ? 255 : 65535;
                }
                if (this.field585[var4] == 8) {
                    var11 = this.field530 % 20 < 10 ? 45056 : 8454016;
                }
                if (this.field585[var4] == 9) {
                    int var12 = 150 - this.field587[var4];
                    if (var12 < 50) {
                        var11 = var12 * 1280 + 16711680;
                    } else if (var12 < 100) {
                        var11 = 16776960 - (var12 - 50) * 327680;
                    } else if (var12 < 150) {
                        var11 = (var12 - 100) * 5 + 65280;
                    }
                }
                if (this.field585[var4] == 10) {
                    int var13 = 150 - this.field587[var4];
                    if (var13 < 50) {
                        var11 = var13 * 5 + 16711680;
                    } else if (var13 < 100) {
                        var11 = 16711935 - (var13 - 50) * 327680;
                    } else if (var13 < 150) {
                        var11 = (var13 - 100) * 327680 + 255 - (var13 - 100) * 5;
                    }
                }
                if (this.field585[var4] == 11) {
                    int var14 = 150 - this.field587[var4];
                    if (var14 < 50) {
                        var11 = 16777215 - var14 * 327685;
                    } else if (var14 < 100) {
                        var11 = (var14 - 50) * 327685 + 65280;
                    } else if (var14 < 150) {
                        var11 = 16777215 - (var14 - 100) * 327680;
                    }
                }
                if (this.field586[var4] == 0) {
                    this.field162.method464(this.field457 + 1, 0, 0, this.field456, var10);
                    this.field162.method464(this.field457, var11, 0, this.field456, var10);
                }
                if (this.field586[var4] == 1) {
                    this.field162.method469(this.field530, this.field457 + 1, var10, true, this.field456, 0);
                    this.field162.method469(this.field530, this.field457, var10, true, this.field456, var11);
                }
                if (this.field586[var4] == 2) {
                    this.field162.method470(var10, this.field530, 876, this.field457 + 1, 0, this.field456);
                    this.field162.method470(var10, this.field530, 876, this.field457, var11, this.field456);
                }
                if (this.field586[var4] == 3) {
                    this.field162.method471(this.field530, 0, 0, 150 - this.field587[var4], var10, this.field456, this.field457 + 1);
                    this.field162.method471(this.field530, var11, 0, 150 - this.field587[var4], var10, this.field456, this.field457);
                }
                if (this.field586[var4] == 4) {
                    int var15 = this.field162.method467(var10, this.field144);
                    int var16 = (150 - this.field587[var4]) * (var15 + 100) / 150;
                    class35.method414(this.field456 - 50, this.field456 + 50, true, 0, 334);
                    this.field162.method468(var10, this.field457 + 1, 0, this.field456 + 50 - var16, (byte) -126);
                    this.field162.method468(var10, this.field457, var11, this.field456 + 50 - var16, (byte) -126);
                    class35.method413((byte) 6);
                }
                if (this.field586[var4] == 5) {
                    int var17 = 150 - this.field587[var4];
                    int var18 = 0;
                    if (var17 < 25) {
                        var18 = var17 - 25;
                    } else if (var17 > 125) {
                        var18 = var17 - 125;
                    }
                    class35.method414(0, 512, true, this.field457 - this.field162.field1298 - 1, this.field457 + 5);
                    this.field162.method464(this.field457 + 1 + var18, 0, 0, this.field456, var10);
                    this.field162.method464(this.field457 + var18, var11, 0, this.field456, var10);
                    class35.method413((byte) 6);
                }
            } else {
                this.field162.method464(this.field457 + 1, 0, 0, this.field456, var10);
                this.field162.method464(this.field457, 16776960, 0, this.field456, var10);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIIIII)V")
    private final void method95(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg6 != 0) {
            this.field398 = null;
        }
        if (arg7 >= 1 && arg0 >= 1 && arg7 <= 102 && arg0 <= 102) {
            if (field275 && this.field442 != arg2) {
                return;
            }
            int var9 = 0;
            boolean var10 = true;
            boolean var11 = false;
            boolean var12 = false;
            if (arg1 == 0) {
                var9 = this.field403.method533(arg2, arg7, arg0);
            }
            if (arg1 == 1) {
                var9 = this.field403.method534(arg0, (byte) 5, arg7, arg2);
            }
            if (arg1 == 2) {
                var9 = this.field403.method535(arg2, arg7, arg0);
            }
            if (arg1 == 3) {
                var9 = this.field403.method536(arg2, arg7, arg0);
            }
            if (var9 != 0) {
                int var13 = this.field403.method537(arg2, arg7, arg0, var9);
                int var14 = var9 >> 14 & 32767;
                int var15 = var13 & 31;
                int var16 = var13 >> 6;
                if (arg1 == 0) {
                    this.field403.method524(529, arg0, arg7, arg2);
                    class64 var17 = class64.method568(var14);
                    if (var17.field1621) {
                        this.field350[arg2].method456(var16, var15, arg7, arg0, var17.field1646, this.field508);
                    }
                }
                if (arg1 == 1) {
                    this.field403.method525(arg0, arg7, (byte) 72, arg2);
                }
                if (arg1 == 2) {
                    this.field403.method526(arg7, arg0, arg2, 348);
                    class64 var18 = class64.method568(var14);
                    if (var18.field1647 + arg7 > 103 || var18.field1647 + arg0 > 103 || var18.field1617 + arg7 > 103 || var18.field1617 + arg0 > 103) {
                        return;
                    }
                    if (var18.field1621) {
                        this.field350[arg2].method457(var18.field1646, 131, arg0, var18.field1647, var18.field1617, arg7, var16);
                    }
                }
                if (arg1 == 3) {
                    this.field403.method527(arg7, -4942, arg0, arg2);
                    class64 var19 = class64.method568(var14);
                    if (var19.field1621 && var19.field1614) {
                        this.field350[arg2].method459(arg0, arg7, 721);
                    }
                }
            }
            if (arg5 >= 0) {
                int var20 = arg2;
                if (arg2 < 3 && (this.field535[1][arg7][arg0] & 2) == 2) {
                    var20 = arg2 + 1;
                }
                class3.method12(arg7, arg5, arg0, this.field193, this.field403, this.field350[arg2], true, arg4, arg2, var20, arg3);
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "i", descriptor = "(I)V")
    public final void method96(int arg0) {
        for (int var2 = -1; var2 < this.field221; ++var2) {
            int var4;
            if (var2 == -1) {
                var4 = this.field219;
            } else {
                var4 = this.field222[var2];
            }
            class22 var5 = this.field220[var4];
            if (var5 != null) {
                this.method156(1, var5, 907);
            }
        }
        if (arg0 <= 0) {
            for (int var3 = 1; var3 > 0; ++var3) {
            }
        }
    }

    @OriginalMember(owner = "client", name = "j", descriptor = "(I)V")
    public final void method97(int arg0) {
        int var2 = this.field452;
        int var3 = this.field453;
        int var4 = this.field454;
        int var5 = this.field455;
        int var6 = 6116423;
        class35.method417(466, var3, var5, var2, var4, var6);
        class35.method417(466, var3 + 1, 16, var2 + 1, var4 - 2, 0);
        class35.method418(684, var4 - 2, var5 - 19, 0, var3 + 18, var2 + 1);
        this.field162.method468("Choose Option", var3 + 14, var6, var2 + 3, (byte) -126);
        if (arg0 < 0) {
            int var7 = super.field1108;
            int var8 = super.field1109;
            if (this.field451 == 0) {
                var7 -= 4;
                var8 -= 4;
            }
            if (this.field451 == 1) {
                var7 -= 553;
                var8 -= 205;
            }
            if (this.field451 == 2) {
                var7 -= 17;
                var8 -= 357;
            }
            for (int var9 = 0; var9 < this.field315; ++var9) {
                int var10 = (this.field315 - 1 - var9) * 15 + var3 + 31;
                int var11 = 16777215;
                if (var7 > var2 && var7 < var2 + var4 && var8 > var10 - 13 && var8 < var10 + 3) {
                    var11 = 16776960;
                }
                this.field162.method472(var2 + 3, true, var11, var10, this.field349[var9], (byte) 5);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZIZ)V")
    public final void method98(boolean arg0, int arg1, boolean arg2) {
        signlink.midivol = arg1;
        if (arg0) {
            this.field543 = this.field413.method479();
        }
        if (arg2) {
            signlink.midi = "voladjust";
        }
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(Z)V")
    public final void method99(boolean arg0) {
        try {
            if (this.field305 != null) {
                this.field305.method229();
            }
        } catch (Exception var3) {
        }
        this.field305 = null;
        if (!arg0) {
            this.field512 = false;
            this.field179 = 0;
            this.field136 = "";
            this.field137 = "";
            this.method198(-12265);
            this.field403.method507(6);
            for (int var2 = 0; var2 < 4; ++var2) {
                this.field350[var2].method451();
            }
            System.gc();
            this.method87((byte) 4);
            this.field384 = -1;
            this.field386 = -1;
            this.field167 = 0;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIII)I")
    public final int method100(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 != 0) {
            this.field238 = -194;
        }
        int var5 = 256 - arg0;
        return ((arg1 & 16711935) * var5 + (arg3 & 16711935) * arg0 & -16711936) + ((arg1 & 65280) * var5 + (arg3 & 65280) * arg0 & 16711680) >> 8;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IZLCKBTFRZM;)V")
    private final void method101(int arg0, boolean arg1, class5 arg2) {
        this.field353 = 0;
        this.field223 = 0;
        this.method135(-304, arg0, arg2);
        this.method149(arg2, arg0, (byte) 3);
        this.method196(8, arg0, arg2);
        if (arg1) {
            this.field196 = -1;
        }
        this.method123(arg0, arg2, (byte) -19);
        for (int var4 = 0; var4 < this.field353; ++var4) {
            int var6 = this.field354[var4];
            if (field329 != this.field220[var6].field1551) {
                this.field220[var6] = null;
            }
        }
        if (arg2.field123 != arg0) {
            signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg2.field123 + " psize:" + arg0);
            throw new RuntimeException("eek");
        } else {
            for (int var5 = 0; var5 < this.field221; ++var5) {
                if (this.field220[this.field222[var5]] == null) {
                    signlink.reporterror(this.field136 + " null entry in pl list - pos:" + var5 + " size:" + this.field221);
                    throw new RuntimeException("eek");
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "k", descriptor = "(I)V")
    public final void method102(int arg0) {
        this.method218(47550);
        if (this.field552 == 1) {
            this.field491[this.field551 / 100].method429(this.field550 - 8 - 4, this.field549 - 8 - 4, false);
            ++field520;
            if (field520 > 68) {
                field520 = 0;
                this.field608.method33((byte) 57, 64);
            }
        }
        if (this.field552 == 2) {
            this.field491[this.field551 / 100 + 4].method429(this.field550 - 8 - 4, this.field549 - 8 - 4, false);
        }
        if (this.field251 != -1) {
            this.method188(this.field459, this.field251, false);
            this.method215(438, 0, class15.field806[this.field251], 0, 0);
        }
        if (this.field268 != -1) {
            this.method188(this.field459, this.field268, false);
            this.method215(438, 0, class15.field806[this.field268], 0, 0);
        }
        this.method103(0);
        if (arg0 != 36465) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        if (!this.field342) {
            this.method85(0);
            this.method170(false);
        } else if (this.field451 == 0) {
            this.method97(-112);
        }
        if (this.field429 == 1) {
            this.field437[1].method429(296, 472, false);
        }
        if (field517) {
            short var3 = 507;
            byte var4 = 20;
            int var5 = 16776960;
            if (super.field1096 < 15) {
                var5 = 16711680;
            }
            this.field161.method463("Fps:" + super.field1096, var5, var4, (byte) 32, var3);
            int var13 = var4 + 15;
            Runtime var6 = Runtime.getRuntime();
            int var7 = (int) ((var6.totalMemory() - var6.freeMemory()) / 1024L);
            int var8 = 16776960;
            if (var7 > 33554432 && field275) {
                int var9 = 16711680;
            }
            this.field161.method463("Mem:" + var7 + "k", 16776960, var13, (byte) 32, var3);
            var13 += 15;
        }
        if (this.field240 != 0) {
            int var10 = this.field240 / 50;
            int var11 = var10 / 60;
            int var12 = var10 % 60;
            if (var12 < 10) {
                this.field161.method468("System update in: " + var11 + ":0" + var12, 329, 16776960, 4, (byte) -126);
            } else {
                this.field161.method468("System update in: " + var11 + ":" + var12, 329, 16776960, 4, (byte) -126);
            }
        }
    }

    @OriginalMember(owner = "client", name = "l", descriptor = "(I)V")
    public final void method103(int arg0) {
        if (arg0 != 0) {
            this.field196 = this.field299.method44();
        }
        this.field237 = 0;
        int var2 = (field557.field1570 >> 7) + this.field545;
        int var3 = (field557.field1571 >> 7) + this.field546;
        if (var2 >= 3053 && var2 <= 3156 && var3 >= 3056 && var3 <= 3136) {
            this.field237 = 1;
        }
        if (var2 >= 3072 && var2 <= 3118 && var3 >= 9492 && var3 <= 9535) {
            this.field237 = 1;
        }
        if (this.field237 == 1 && var2 >= 3139 && var2 <= 3199 && var3 >= 3008 && var3 <= 3062) {
            this.field237 = 0;
        }
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(Z)V")
    public final void method104(boolean arg0) {
        if (!arg0) {
            this.method197();
        }
        if (this.field287 == 0 && this.field570 == 0) {
            this.field349[this.field315] = "Walk here";
            this.field213[this.field315] = 665;
            this.field211[this.field315] = super.field1108;
            this.field212[this.field315] = super.field1109;
            ++this.field315;
        }
        int var2 = -1;
        for (int var3 = 0; var3 < class21.field946; ++var3) {
            int var4 = class21.field947[var3];
            int var5 = var4 & 127;
            int var6 = var4 >> 7 & 127;
            int var7 = var4 >> 29 & 3;
            int var8 = var4 >> 14 & 32767;
            if (var2 != var4) {
                var2 = var4;
                if (var7 == 2 && this.field403.method537(this.field442, var5, var6, var4) >= 0) {
                    class64 var9 = class64.method568(var8);
                    if (var9.field1639 != null) {
                        var9 = var9.method573(192);
                    }
                    if (var9 == null) {
                        continue;
                    }
                    if (this.field287 == 1) {
                        this.field349[this.field315] = "Use " + this.field291 + " with @cya@" + var9.field1629;
                        this.field213[this.field315] = 782;
                        this.field214[this.field315] = var4;
                        this.field211[this.field315] = var5;
                        this.field212[this.field315] = var6;
                        ++this.field315;
                    } else if (this.field570 == 1) {
                        if ((this.field572 & 4) == 4) {
                            this.field349[this.field315] = this.field573 + " @cya@" + var9.field1629;
                            this.field213[this.field315] = 392;
                            this.field214[this.field315] = var4;
                            this.field211[this.field315] = var5;
                            this.field212[this.field315] = var6;
                            ++this.field315;
                        }
                    } else {
                        if (var9.field1644 != null) {
                            for (int var10 = 4; var10 >= 0; --var10) {
                                if (var9.field1644[var10] != null) {
                                    this.field349[this.field315] = var9.field1644[var10] + " @cya@" + var9.field1629;
                                    if (var10 == 0) {
                                        this.field213[this.field315] = 717;
                                    }
                                    if (var10 == 1) {
                                        this.field213[this.field315] = 97;
                                    }
                                    if (var10 == 2) {
                                        this.field213[this.field315] = 346;
                                    }
                                    if (var10 == 3) {
                                        this.field213[this.field315] = 51;
                                    }
                                    if (var10 == 4) {
                                        this.field213[this.field315] = 1281;
                                    }
                                    this.field214[this.field315] = var4;
                                    this.field211[this.field315] = var5;
                                    this.field212[this.field315] = var6;
                                    ++this.field315;
                                }
                            }
                        }
                        this.field349[this.field315] = "Examine @cya@" + var9.field1629;
                        this.field213[this.field315] = 1431;
                        this.field214[this.field315] = var9.field1640 << 14;
                        this.field211[this.field315] = var5;
                        this.field212[this.field315] = var6;
                        ++this.field315;
                    }
                }
                if (var7 == 1) {
                    class55 var11 = this.field247[var8];
                    if (var11.field1398.field90 == 1 && (var11.field1570 & 127) == 64 && (var11.field1571 & 127) == 64) {
                        for (int var12 = 0; var12 < this.field248; ++var12) {
                            class55 var15 = this.field247[this.field249[var12]];
                            if (var15 != null && var11 != var15 && var15.field1398.field90 == 1 && var11.field1570 == var15.field1570 && var11.field1571 == var15.field1571) {
                                this.method142(var6, 5, var15.field1398, this.field249[var12], var5);
                            }
                        }
                        for (int var13 = 0; var13 < this.field221; ++var13) {
                            class22 var14 = this.field220[this.field222[var13]];
                            if (var14 != null && var11.field1570 == var14.field1570 && var11.field1571 == var14.field1571) {
                                this.method217(var5, var6, var14, this.field222[var13], 587);
                            }
                        }
                    }
                    this.method142(var6, 5, var11.field1398, var8, var5);
                }
                if (var7 == 0) {
                    class22 var16 = this.field220[var8];
                    if ((var16.field1570 & 127) == 64 && (var16.field1571 & 127) == 64) {
                        for (int var17 = 0; var17 < this.field248; ++var17) {
                            class55 var20 = this.field247[this.field249[var17]];
                            if (var20 != null && var20.field1398.field90 == 1 && var16.field1570 == var20.field1570 && var16.field1571 == var20.field1571) {
                                this.method142(var6, 5, var20.field1398, this.field249[var17], var5);
                            }
                        }
                        for (int var18 = 0; var18 < this.field221; ++var18) {
                            class22 var19 = this.field220[this.field222[var18]];
                            if (var19 != null && var16 != var19 && var16.field1570 == var19.field1570 && var16.field1571 == var19.field1571) {
                                this.method217(var5, var6, var19, this.field222[var18], 587);
                            }
                        }
                    }
                    this.method217(var5, var6, var16, var8, 587);
                }
                if (var7 == 3) {
                    class69 var21 = this.field398[this.field442][var5][var6];
                    if (var21 != null) {
                        for (class56 var22 = (class56) var21.method586((byte) 0); var22 != null; var22 = (class56) var21.method588(this.field503)) {
                            class52 var23 = class52.method489(var22.field1400);
                            if (this.field287 == 1) {
                                this.field349[this.field315] = "Use " + this.field291 + " with @lre@" + var23.field1321;
                                this.field213[this.field315] = 507;
                                this.field214[this.field315] = var22.field1400;
                                this.field211[this.field315] = var5;
                                this.field212[this.field315] = var6;
                                ++this.field315;
                            } else if (this.field570 == 1) {
                                if ((this.field572 & 1) == 1) {
                                    this.field349[this.field315] = this.field573 + " @lre@" + var23.field1321;
                                    this.field213[this.field315] = 53;
                                    this.field214[this.field315] = var22.field1400;
                                    this.field211[this.field315] = var5;
                                    this.field212[this.field315] = var6;
                                    ++this.field315;
                                }
                            } else {
                                for (int var24 = 4; var24 >= 0; --var24) {
                                    if (var23.field1354 != null && var23.field1354[var24] != null) {
                                        this.field349[this.field315] = var23.field1354[var24] + " @lre@" + var23.field1321;
                                        if (var24 == 0) {
                                            this.field213[this.field315] = 215;
                                        }
                                        if (var24 == 1) {
                                            this.field213[this.field315] = 877;
                                        }
                                        if (var24 == 2) {
                                            this.field213[this.field315] = 246;
                                        }
                                        if (var24 == 3) {
                                            this.field213[this.field315] = 321;
                                        }
                                        if (var24 == 4) {
                                            this.field213[this.field315] = 247;
                                        }
                                        this.field214[this.field315] = var22.field1400;
                                        this.field211[this.field315] = var5;
                                        this.field212[this.field315] = var6;
                                        ++this.field315;
                                    } else if (var24 == 2) {
                                        this.field349[this.field315] = "Take @lre@" + var23.field1321;
                                        this.field213[this.field315] = 246;
                                        this.field214[this.field315] = var22.field1400;
                                        this.field211[this.field315] = var5;
                                        this.field212[this.field315] = var6;
                                        ++this.field315;
                                    }
                                }
                                this.field349[this.field315] = "Examine @lre@" + var23.field1321;
                                this.field213[this.field315] = 1685;
                                this.field214[this.field315] = var22.field1400;
                                this.field211[this.field315] = var5;
                                this.field212[this.field315] = var6;
                                ++this.field315;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        try {
            System.out.println("RS2 user client - release #" + 309);
            if (arg0.length != 5) {
                System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
            } else {
                field272 = Integer.parseInt(arg0[0]);
                field273 = Integer.parseInt(arg0[1]);
                if (arg0[2].equals("lowmem")) {
                    method126(false);
                } else {
                    if (!arg0[2].equals("highmem")) {
                        System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
                        return;
                    }
                    method132((byte) 4);
                }
                if (arg0[3].equals("free")) {
                    field274 = false;
                } else {
                    if (!arg0[3].equals("members")) {
                        System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
                        return;
                    }
                    field274 = true;
                }
                signlink.storeid = Integer.parseInt(arg0[4]);
                signlink.startpriv(InetAddress.getLocalHost());
                client var1 = new client();
                var1.method399(503, (byte) 1, 765);
            }
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client", name = "m", descriptor = "(I)V")
    public final void method105(int arg0) {
        this.field308 = new class38(this.field601, "titlebox", 0);
        this.field309 = new class38(this.field601, "titlebutton", 0);
        this.field173 = new class38[12];
        int var2 = 0;
        if (arg0 != 7) {
            this.field398 = null;
        }
        try {
            var2 = Integer.parseInt(this.getParameter("fl_icon"));
        } catch (Exception var19) {
        }
        if (var2 == 0) {
            for (int var3 = 0; var3 < 12; ++var3) {
                this.field173[var3] = new class38(this.field601, "runes", var3);
            }
        } else {
            for (int var4 = 0; var4 < 12; ++var4) {
                this.field173[var4] = new class38(this.field601, "runes", (var4 & 3) + 12);
            }
        }
        this.field492 = new class37(128, 265);
        this.field493 = new class37(128, 265);
        for (int var5 = 0; var5 < 33920; ++var5) {
            this.field492.field1173[var5] = this.field261.field838[var5];
        }
        for (int var6 = 0; var6 < 33920; ++var6) {
            this.field493.field1173[var6] = this.field262.field838[var6];
        }
        this.field146 = new int[256];
        for (int var7 = 0; var7 < 64; ++var7) {
            this.field146[var7] = var7 * 262144;
        }
        for (int var8 = 0; var8 < 64; ++var8) {
            this.field146[var8 + 64] = var8 * 1024 + 16711680;
        }
        for (int var9 = 0; var9 < 64; ++var9) {
            this.field146[var9 + 128] = var9 * 4 + 16776960;
        }
        for (int var10 = 0; var10 < 64; ++var10) {
            this.field146[var10 + 192] = 16777215;
        }
        this.field147 = new int[256];
        for (int var11 = 0; var11 < 64; ++var11) {
            this.field147[var11] = var11 * 1024;
        }
        for (int var12 = 0; var12 < 64; ++var12) {
            this.field147[var12 + 64] = var12 * 4 + 65280;
        }
        for (int var13 = 0; var13 < 64; ++var13) {
            this.field147[var13 + 128] = var13 * 262144 + 65535;
        }
        for (int var14 = 0; var14 < 64; ++var14) {
            this.field147[var14 + 192] = 16777215;
        }
        this.field148 = new int[256];
        for (int var15 = 0; var15 < 64; ++var15) {
            this.field148[var15] = var15 * 4;
        }
        for (int var16 = 0; var16 < 64; ++var16) {
            this.field148[var16 + 64] = var16 * 262144 + 255;
        }
        for (int var17 = 0; var17 < 64; ++var17) {
            this.field148[var17 + 128] = var17 * 1024 + 16711935;
        }
        for (int var18 = 0; var18 < 64; ++var18) {
            this.field148[var18 + 192] = 16777215;
        }
        this.field145 = new int[256];
        this.field363 = new int[32768];
        this.field364 = new int[32768];
        this.method186((class38) null, -165);
        this.field616 = new int[32768];
        this.field617 = new int[32768];
        this.method200("Connecting to fileserver", 10, 5);
        if (!this.field367) {
            this.field352 = true;
            this.field367 = true;
            this.method117(this, 2);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZI[B)V")
    public final void method106(boolean arg0, int arg1, byte[] arg2) {
        signlink.midifade = arg0 ? 1 : 0;
        signlink.midisave(arg2, arg2.length);
        if (arg1 != 6) {
            this.field196 = -1;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(II)Ljava/lang/String;")
    public final String method107(int arg0, int arg1) {
        int var3 = 61 / arg1;
        return arg0 < 999999999 ? String.valueOf(arg0) : "*";
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(B)V")
    public final void method108(byte arg0) {
        if (arg0 == 96) {
            if (this.field179 == 0) {
                int var2 = super.field1098 / 2 - 80;
                int var3 = super.field1099 / 2 + 20;
                int var14 = var3 + 20;
                if (super.field1114 == 1 && super.field1115 >= var2 - 75 && super.field1115 <= var2 + 75 && super.field1116 >= var14 - 20 && super.field1116 <= var14 + 20) {
                    this.field179 = 3;
                    this.field593 = 0;
                }
                int var4 = super.field1098 / 2 + 80;
                if (super.field1114 == 1 && super.field1115 >= var4 - 75 && super.field1115 <= var4 + 75 && super.field1116 >= var14 - 20 && super.field1116 <= var14 + 20) {
                    this.field597 = "";
                    this.field598 = "Enter your username & password.";
                    this.field179 = 2;
                    this.field593 = 0;
                }
            } else if (this.field179 == 2) {
                int var5 = super.field1099 / 2 - 40;
                int var15 = var5 + 30;
                int var16 = var15 + 25;
                if (super.field1114 == 1 && super.field1116 >= var16 - 15 && super.field1116 < var16) {
                    this.field593 = 0;
                }
                var5 = var16 + 15;
                if (super.field1114 == 1 && super.field1116 >= var5 - 15 && super.field1116 < var5) {
                    this.field593 = 1;
                }
                var5 += 15;
                int var6 = super.field1098 / 2 - 80;
                int var7 = super.field1099 / 2 + 50;
                int var17 = var7 + 20;
                if (super.field1114 == 1 && super.field1115 >= var6 - 75 && super.field1115 <= var6 + 75 && super.field1116 >= var17 - 20 && super.field1116 <= var17 + 20) {
                    this.field216 = 0;
                    this.method195(this.field136, this.field137, false);
                    if (this.field512) {
                        return;
                    }
                }
                int var8 = super.field1098 / 2 + 80;
                if (super.field1114 == 1 && super.field1115 >= var8 - 75 && super.field1115 <= var8 + 75 && super.field1116 >= var17 - 20 && super.field1116 <= var17 + 20) {
                    this.field179 = 0;
                    this.field136 = "";
                    this.field137 = "";
                }
                while (true) {
                    while (true) {
                        int var9 = this.method403(-27156);
                        if (var9 == -1) {
                            return;
                        }
                        boolean var10 = false;
                        for (int var11 = 0; var11 < field498.length(); ++var11) {
                            if (var9 == field498.charAt(var11)) {
                                var10 = true;
                                break;
                            }
                        }
                        if (this.field593 == 0) {
                            if (var9 == 8 && this.field136.length() > 0) {
                                this.field136 = this.field136.substring(0, this.field136.length() - 1);
                            }
                            if (var9 == 9 || var9 == 10 || var9 == 13) {
                                this.field593 = 1;
                            }
                            if (var10) {
                                this.field136 = this.field136 + (char) var9;
                            }
                            if (this.field136.length() > 12) {
                                this.field136 = this.field136.substring(0, 12);
                            }
                        } else if (this.field593 == 1) {
                            if (var9 == 8 && this.field137.length() > 0) {
                                this.field137 = this.field137.substring(0, this.field137.length() - 1);
                            }
                            if (var9 == 9 || var9 == 10 || var9 == 13) {
                                this.field593 = 0;
                            }
                            if (var10) {
                                this.field137 = this.field137 + (char) var9;
                            }
                            if (this.field137.length() > 20) {
                                this.field137 = this.field137.substring(0, 20);
                            }
                        }
                    }
                }
            } else {
                if (this.field179 == 3) {
                    int var12 = super.field1098 / 2;
                    int var13 = super.field1099 / 2 + 50;
                    int var18 = var13 + 20;
                    if (super.field1114 == 1 && super.field1115 >= var12 - 75 && super.field1115 <= var12 + 75 && super.field1116 >= var18 - 20 && super.field1116 <= var18 + 20) {
                        this.field179 = 0;
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "n", descriptor = "(I)V")
    public final void method109(int arg0) {
        if (arg0 != -34262) {
            this.field196 = this.field299.method44();
        }
        while (true) {
            class24 var2 = this.field374.method257();
            if (var2 == null) {
                return;
            }
            if (var2.field982 == 0) {
                class21.method339(false, var2.field981, var2.field983);
                if ((this.field374.method258(false, var2.field981) & 98) != 0) {
                    this.field433 = true;
                    if (this.field472 != -1) {
                        this.field578 = true;
                    }
                }
            }
            if (var2.field982 == 1 && var2.field983 != null) {
                class14.method279(var2.field983, false);
            }
            if (var2.field982 == 2 && this.field386 == var2.field981 && var2.field983 != null) {
                this.method106(this.field387, 6, var2.field983);
            }
            if (var2.field982 == 3 && this.field443 == 1) {
                for (int var3 = 0; var3 < this.field276.length; ++var3) {
                    if (this.field527[var3] == var2.field981) {
                        this.field276[var3] = var2.field983;
                        if (var2.field983 == null) {
                            this.field527[var3] = -1;
                        }
                        break;
                    }
                    if (this.field528[var3] == var2.field981) {
                        this.field192[var3] = var2.field983;
                        if (var2.field983 == null) {
                            this.field528[var3] = -1;
                        }
                        break;
                    }
                }
            }
            if (var2.field982 == 93 && this.field374.method275((byte) 0, var2.field981)) {
                class3.method18(new class5(2, var2.field983), this.field374, 798);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;)V")
    private final void method110(String arg0) {
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

    @OriginalMember(owner = "client", name = "b", descriptor = "(II)V")
    public final void method111(int arg0, int arg1) {
        int var3 = class9.field648[arg0].field656;
        if (var3 != 0) {
            int var4 = this.field395[arg0];
            if (arg1 <= 0) {
                this.field196 = this.field299.method44();
            }
            if (var3 == 1) {
                if (var4 == 1) {
                    class10.method246(0, 0.9D);
                }
                if (var4 == 2) {
                    class10.method246(0, 0.8D);
                }
                if (var4 == 3) {
                    class10.method246(0, 0.7D);
                }
                if (var4 == 4) {
                    class10.method246(0, 0.6D);
                }
                class52.field1329.method3();
                this.field514 = true;
            }
            if (var3 == 3) {
                boolean var5 = this.field189;
                if (var4 == 0) {
                    this.method98(false, 0, this.field189);
                    this.field189 = true;
                }
                if (var4 == 1) {
                    this.method98(false, -400, this.field189);
                    this.field189 = true;
                }
                if (var4 == 2) {
                    this.method98(false, -800, this.field189);
                    this.field189 = true;
                }
                if (var4 == 3) {
                    this.method98(false, -1200, this.field189);
                    this.field189 = true;
                }
                if (var4 == 4) {
                    this.field189 = false;
                }
                if (this.field189 != var5 && !field275) {
                    if (this.field189) {
                        this.field386 = this.field384;
                        this.field387 = true;
                        this.field374.method259(2, this.field386);
                    } else {
                        this.method87((byte) 4);
                    }
                    this.field167 = 0;
                }
            }
            if (var3 == 4) {
                if (var4 == 0) {
                    this.field595 = true;
                    this.method90((byte) 35, 0);
                }
                if (var4 == 1) {
                    this.field595 = true;
                    this.method90((byte) 35, -400);
                }
                if (var4 == 2) {
                    this.field595 = true;
                    this.method90((byte) 35, -800);
                }
                if (var4 == 3) {
                    this.field595 = true;
                    this.method90((byte) 35, -1200);
                }
                if (var4 == 4) {
                    this.field595 = false;
                }
            }
            if (var3 == 5) {
                this.field612 = var4;
            }
            if (var3 == 6) {
                this.field351 = var4;
            }
            if (var3 == 8) {
                this.field307 = var4;
                this.field578 = true;
            }
            if (var3 == 9) {
                this.field296 = var4;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIZI)Z")
    public final boolean method112(int arg0, int arg1, boolean arg2, int arg3) {
        int var5 = arg1 >> 14 & 32767;
        int var6 = this.field403.method537(this.field442, arg3, arg0, arg1);
        if (var6 == -1) {
            return false;
        } else {
            int var7 = var6 & 31;
            int var8 = var6 >> 6 & 3;
            if (var7 != 10 && var7 != 11 && var7 != 22) {
                this.method180(2, 0, (byte) -3, 0, arg0, var8, field557.field1568[0], field557.field1567[0], false, var7 + 1, 0, arg3);
            } else {
                class64 var9 = class64.method568(var5);
                int var10;
                int var11;
                if (var8 != 0 && var8 != 2) {
                    var10 = var9.field1617;
                    var11 = var9.field1647;
                } else {
                    var10 = var9.field1647;
                    var11 = var9.field1617;
                }
                int var12 = var9.field1638;
                if (var8 != 0) {
                    var12 = (var12 >> 4 - var8) + (var12 << var8 & 15);
                }
                this.method180(2, var11, (byte) -3, var10, arg0, 0, field557.field1568[0], field557.field1567[0], false, 0, var12, arg3);
            }
            this.field549 = super.field1115;
            this.field512 &= arg2;
            this.field550 = super.field1116;
            this.field552 = 2;
            this.field551 = 0;
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LFDUKJGTQ;I)Z")
    public final boolean method113(class15 arg0, int arg1) {
        int var3 = arg0.field804;
        if (arg1 != 45308) {
            for (int var4 = 1; var4 > 0; ++var4) {
            }
        }
        if (this.field436 == 2) {
            if (var3 == 201) {
                this.field578 = true;
                this.field477 = 0;
                this.field589 = true;
                this.field518 = "";
                this.field345 = 1;
                this.field393 = "Enter name of friend to add to list";
            }
            if (var3 == 202) {
                this.field578 = true;
                this.field477 = 0;
                this.field589 = true;
                this.field518 = "";
                this.field345 = 2;
                this.field393 = "Enter name of friend to delete from list";
            }
        }
        if (var3 == 205) {
            this.field199 = 250;
            return true;
        } else {
            if (var3 == 501) {
                this.field578 = true;
                this.field477 = 0;
                this.field589 = true;
                this.field518 = "";
                this.field345 = 4;
                this.field393 = "Enter name of player to add to list";
            }
            if (var3 == 502) {
                this.field578 = true;
                this.field477 = 0;
                this.field589 = true;
                this.field518 = "";
                this.field345 = 5;
                this.field393 = "Enter name of player to delete from list";
            }
            if (var3 >= 300 && var3 <= 313) {
                int var5 = (var3 - 300) / 2;
                int var6 = var3 & 1;
                int var7 = this.field346[var5];
                if (var7 != -1) {
                    while (true) {
                        if (var6 == 0) {
                            --var7;
                            if (var7 < 0) {
                                var7 = class29.field1051 - 1;
                            }
                        }
                        if (var6 == 1) {
                            ++var7;
                            if (var7 >= class29.field1051) {
                                var7 = 0;
                            }
                        }
                        if (!class29.field1052[var7].field1058 && class29.field1052[var7].field1053 == var5 + (this.field464 ? 0 : 7)) {
                            this.field346[var5] = var7;
                            this.field614 = true;
                            break;
                        }
                    }
                }
            }
            if (var3 >= 314 && var3 <= 323) {
                int var8 = (var3 - 314) / 2;
                int var9 = var3 & 1;
                int var10 = this.field313[var8];
                if (var9 == 0) {
                    --var10;
                    if (var10 < 0) {
                        var10 = field531[var8].length - 1;
                    }
                }
                if (var9 == 1) {
                    ++var10;
                    if (var10 >= field531[var8].length) {
                        var10 = 0;
                    }
                }
                this.field313[var8] = var10;
                this.field614 = true;
            }
            if (var3 == 324 && !this.field464) {
                this.field464 = true;
                this.method91(582);
            }
            if (var3 == 325 && this.field464) {
                this.field464 = false;
                this.method91(582);
            }
            if (var3 != 326) {
                if (var3 == 613) {
                    this.field501 = !this.field501;
                }
                if (var3 >= 601 && var3 <= 612) {
                    this.method154(30702);
                    if (this.field596.length() > 0) {
                        this.field608.method33((byte) 57, 109);
                        this.field608.method40(0, class31.method388(this.field596));
                        this.field608.method34(var3 - 601);
                        this.field608.method34(this.field501 ? 1 : 0);
                    }
                }
                return false;
            } else {
                this.field608.method33((byte) 57, 22);
                this.field608.method34(this.field464 ? 0 : 1);
                for (int var11 = 0; var11 < 7; ++var11) {
                    this.field608.method34(this.field346[var11]);
                }
                for (int var12 = 0; var12 < 5; ++var12) {
                    this.field608.method34(this.field313[var12]);
                }
                return true;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(JI)V")
    public final void method114(long arg0, int arg1) {
        if (arg0 != 0L) {
            if (this.field475 >= 100) {
                this.method181("", -979, "Your ignore list is full. Max of 100 hit", 0);
            } else {
                String var4 = class31.method392(class31.method389((byte) -71, arg0), false);
                for (int var5 = 0; var5 < this.field475; ++var5) {
                    if (this.field516[var5] == arg0) {
                        this.method181("", -979, var4 + " is already on your ignore list", 0);
                        return;
                    }
                }
                for (int var6 = 0; var6 < this.field435; ++var6) {
                    if (this.field524[var6] == arg0) {
                        this.method181("", -979, "Please remove " + var4 + " from your friend list first", 0);
                        return;
                    }
                }
                int var7 = 3 / arg1;
                this.field516[this.field475++] = arg0;
                this.field433 = true;
                this.field608.method33((byte) 57, 49);
                this.field608.method40(0, arg0);
            }
        }
    }

    @OriginalMember(owner = "client", name = "run", descriptor = "()V")
    public final void run() {
        if (this.field352) {
            this.method140((byte) -12);
        } else {
            super.run();
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(B)V")
    public final void method115(byte arg0) {
        if (!this.field568 && !this.field405 && !this.field519) {
            ++field188;
            if (!this.field512) {
                this.method177(false, (byte) -51);
            } else {
                this.method162(true);
            }
            this.field292 = 0;
            if (this.field511 == arg0) {
                boolean var2 = false;
            } else {
                this.method197();
            }
        } else {
            this.method192(46945);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IILCKBTFRZM;)V")
    private final void method116(int arg0, int arg1, class5 arg2) {
        this.field353 = 0;
        this.field223 = 0;
        this.method141(true, arg0, arg2);
        if (arg1 >= 0) {
            this.field398 = null;
        }
        this.method119(arg2, arg0, 0);
        this.method134(arg0, 988, arg2);
        for (int var4 = 0; var4 < this.field353; ++var4) {
            int var6 = this.field354[var4];
            if (field329 != this.field247[var6].field1551) {
                this.field247[var6].field1398 = null;
                this.field247[var6] = null;
            }
        }
        if (arg2.field123 != arg0) {
            signlink.reporterror(this.field136 + " size mismatch in getnpcpos - pos:" + arg2.field123 + " psize:" + arg0);
            throw new RuntimeException("eek");
        } else {
            for (int var5 = 0; var5 < this.field248; ++var5) {
                if (this.field247[this.field249[var5]] == null) {
                    signlink.reporterror(this.field136 + " null entry in npc list - pos:" + var5 + " size:" + this.field248);
                    throw new RuntimeException("eek");
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
    public final void method117(Runnable arg0, int arg1) {
        if (arg1 > 10) {
            arg1 = 10;
        }
        if (signlink.mainapp != null) {
            signlink.startthread(arg0, arg1);
        } else {
            super.method117(arg0, arg1);
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(II)V")
    public final void method118(int arg0, int arg1) {
        if (arg0 >= 0) {
            if (this.field477 != 0) {
                this.field477 = 0;
                this.field578 = true;
            }
            int var3 = this.field211[arg0];
            int var4 = this.field212[arg0];
            int var5 = this.field213[arg0];
            int var6 = this.field214[arg0];
            if (var5 >= 2000) {
                var5 -= 2000;
            }
            if (var5 == 665) {
                if (!this.field342) {
                    this.field403.method545(super.field1116 - 4, -791, super.field1115 - 4);
                } else {
                    this.field403.method545(var4 - 4, -791, var3 - 4);
                }
            }
            if (var5 == 933) {
                class22 var7 = this.field220[var6];
                if (var7 != null) {
                    this.method180(2, 1, (byte) -3, 1, var7.field1568[0], 0, field557.field1568[0], field557.field1567[0], false, 0, 0, var7.field1567[0]);
                    this.field549 = super.field1115;
                    this.field550 = super.field1116;
                    this.field552 = 2;
                    this.field551 = 0;
                    this.field608.method33((byte) 57, 241);
                    this.field608.method68(var6, (byte) -125);
                }
            }
            if (var5 == 53) {
                boolean var8 = this.method180(2, 0, (byte) -3, 0, var4, 0, field557.field1568[0], field557.field1567[0], false, 0, 0, var3);
                if (!var8) {
                    this.method180(2, 1, (byte) -3, 1, var4, 0, field557.field1568[0], field557.field1567[0], false, 0, 0, var3);
                }
                this.field549 = super.field1115;
                this.field550 = super.field1116;
                this.field552 = 2;
                this.field551 = 0;
                this.field608.method33((byte) 57, 200);
                this.field608.method69(var6, (byte) 0);
                this.field608.method70(43385, this.field546 + var4);
                this.field608.method69(this.field545 + var3, (byte) 0);
                this.field608.method68(this.field571, (byte) -125);
            }
            if (var5 == 303) {
                class22 var10 = this.field220[var6];
                if (var10 != null) {
                    this.method180(2, 1, (byte) -3, 1, var10.field1568[0], 0, field557.field1568[0], field557.field1567[0], false, 0, 0, var10.field1567[0]);
                    this.field549 = super.field1115;
                    this.field550 = super.field1116;
                    this.field552 = 2;
                    this.field551 = 0;
                    this.field608.method33((byte) 57, 164);
                    this.field608.method70(43385, var6);
                }
            }
            if (var5 == 586) {
                this.field608.method33((byte) 57, 117);
                this.field608.method35(var4);
                class15 var11 = class15.field806[var4];
                if (var11.field785 != null && var11.field785[0][0] == 5) {
                    int var12 = var11.field785[0][1];
                    if (this.field395[var12] != var11.field821[0]) {
                        this.field395[var12] = var11.field821[0];
                        this.method111(var12, 276);
                        this.field433 = true;
                    }
                }
            }
            if (var5 == 672) {
                this.field608.method33((byte) 57, 84);
                this.field608.method70(43385, var6);
                this.field608.method68(var4, (byte) -125);
                this.field608.method68(var3, (byte) -125);
                this.field399 = 0;
                this.field400 = var4;
                this.field401 = var3;
                this.field402 = 2;
                if (class15.field806[var4].field818 == this.field268) {
                    this.field402 = 1;
                }
                if (class15.field806[var4].field818 == this.field472) {
                    this.field402 = 3;
                }
            }
            if (var5 == 743) {
                class55 var13 = this.field247[var6];
                if (var13 != null) {
                    this.method180(2, 1, (byte) -3, 1, var13.field1568[0], 0, field557.field1568[0], field557.field1567[0], false, 0, 0, var13.field1567[0]);
                    this.field549 = super.field1115;
                    this.field550 = super.field1116;
                    this.field552 = 2;
                    this.field551 = 0;
                    this.field608.method33((byte) 57, 2);
                    this.field608.method68(this.field571, (byte) -125);
                    this.field608.method69(var6, (byte) 0);
                }
            }
            if (var5 == 144 || var5 == 84 || var5 == 813 || var5 == 52) {
                String var14 = this.field349[arg0];
                int var15 = var14.indexOf("@whi@");
                if (var15 != -1) {
                    long var16 = class31.method388(var14.substring(var15 + 5).trim());
                    if (var5 == 144) {
                        this.method145((byte) 31, var16);
                    }
                    if (var5 == 84) {
                        this.method114(var16, 362);
                    }
                    if (var5 == 813) {
                        this.method131(var16, field330);
                    }
                    if (var5 == 52) {
                        this.method146(var16, true);
                    }
                }
            }
            if (var5 == 994 && !this.field226) {
                this.field608.method33((byte) 57, 52);
                this.field608.method35(var4);
                this.field226 = true;
            }
            if (var5 == 1281) {
                field604 += var6;
                if (field604 >= 130) {
                    this.field608.method33((byte) 57, 251);
                    this.field608.method34(16);
                    field604 = 0;
                }
                this.method112(var4, var6, true, var3);
                this.field608.method33((byte) 57, 123);
                this.field608.method68(var6 >> 14 & 32767, (byte) -125);
                this.field608.method70(43385, this.field546 + var4);
                this.field608.method70(43385, this.field545 + var3);
            }
            if (var5 == 710) {
                class15 var18 = class15.field806[var4];
                boolean var19 = true;
                if (var18.field804 > 0) {
                    var19 = this.method113(var18, 45308);
                }
                if (var19) {
                    this.field608.method33((byte) 57, 117);
                    this.field608.method35(var4);
                }
            }
            if (var5 == 979) {
                this.field287 = 1;
                this.field288 = var3;
                this.field289 = var4;
                this.field290 = var6;
                this.field291 = class52.method489(var6).field1321;
                this.field570 = 0;
                this.field433 = true;
            } else {
                if (var5 == 718) {
                    class22 var20 = this.field220[var6];
                    if (var20 != null) {
                        this.method180(2, 1, (byte) -3, 1, var20.field1568[0], 0, field557.field1568[0], field557.field1567[0], false, 0, 0, var20.field1567[0]);
                        this.field549 = super.field1115;
                        this.field550 = super.field1116;
                        this.field552 = 2;
                        this.field551 = 0;
                        this.field608.method33((byte) 57, 138);
                        this.field608.method35(var6);
                    }
                }
                if (var5 == 903) {
                    this.field608.method33((byte) 57, 117);
                    this.field608.method35(var4);
                    class15 var21 = class15.field806[var4];
                    if (var21.field785 != null && var21.field785[0][0] == 5) {
                        int var22 = var21.field785[0][1];
                        this.field395[var22] = 1 - this.field395[var22];
                        this.method111(var22, 276);
                        this.field433 = true;
                    }
                }
                if (var5 == 736) {
                    class55 var23 = this.field247[var6];
                    if (var23 != null) {
                        this.method180(2, 1, (byte) -3, 1, var23.field1568[0], 0, field557.field1568[0], field557.field1567[0], false, 0, 0, var23.field1567[0]);
                        this.field549 = super.field1115;
                        this.field550 = super.field1116;
                        this.field552 = 2;
                        this.field551 = 0;
                        this.field608.method33((byte) 57, 16);
                        this.field608.method70(43385, var6);
                    }
                }
                if (var5 == 1685) {
                    class52 var24 = class52.method489(var6);
                    String var25;
                    if (var24.field1326 != null) {
                        var25 = new String(var24.field1326);
                    } else {
                        var25 = "It's a " + var24.field1321 + ".";
                    }
                    this.method181("", -979, var25, 0);
                }
                if (var5 == 1072) {
                    class55 var26 = this.field247[var6];
                    if (var26 != null) {
                        class4 var27 = var26.field1398;
                        if (var27.field82 != null) {
                            var27 = var27.method27(-20711);
                        }
                        if (var27 != null) {
                            String var28;
                            if (var27.field79 != null) {
                                var28 = new String(var27.field79);
                            } else {
                                var28 = "It's a " + var27.field97 + ".";
                            }
                            this.method181("", -979, var28, 0);
                        }
                    }
                }
                if (var5 == 454) {
                    this.field608.method33((byte) 57, 126);
                    this.field608.method35(var4);
                    this.field608.method70(43385, var3);
                    this.field608.method35(var6);
                    this.field399 = 0;
                    this.field400 = var4;
                    this.field401 = var3;
                    this.field402 = 2;
                    if (class15.field806[var4].field818 == this.field268) {
                        this.field402 = 1;
                    }
                    if (class15.field806[var4].field818 == this.field472) {
                        this.field402 = 3;
                    }
                }
                if (var5 == 529) {
                    class22 var29 = this.field220[var6];
                    if (var29 != null) {
                        this.method180(2, 1, (byte) -3, 1, var29.field1568[0], 0, field557.field1568[0], field557.field1567[0], false, 0, 0, var29.field1567[0]);
                        this.field549 = super.field1115;
                        this.field550 = super.field1116;
                        this.field552 = 2;
                        this.field551 = 0;
                        this.field608.method33((byte) 57, 44);
                        this.field608.method68(var6, (byte) -125);
                    }
                }
                if (var5 == 832 || var5 == 105) {
                    String var30 = this.field349[arg0];
                    int var31 = var30.indexOf("@whi@");
                    if (var31 != -1) {
                        String var32 = var30.substring(var31 + 5).trim();
                        String var33 = class31.method392(class31.method389((byte) -71, class31.method388(var32)), false);
                        boolean var34 = false;
                        for (int var35 = 0; var35 < this.field221; ++var35) {
                            class22 var36 = this.field220[this.field222[var35]];
                            if (var36 != null && var36.field973 != null && var36.field973.equalsIgnoreCase(var33)) {
                                this.method180(2, 1, (byte) -3, 1, var36.field1568[0], 0, field557.field1568[0], field557.field1567[0], false, 0, 0, var36.field1567[0]);
                                if (var5 == 832) {
                                    this.field608.method33((byte) 57, 138);
                                    this.field608.method35(this.field222[var35]);
                                }
                                if (var5 == 105) {
                                    this.field608.method33((byte) 57, 164);
                                    this.field608.method70(43385, this.field222[var35]);
                                }
                                var34 = true;
                                break;
                            }
                        }
                        if (!var34) {
                            this.method181("", -979, "Unable to find " + var33, 0);
                        }
                    }
                }
                if (var5 == 175) {
                    class15 var37 = class15.field806[var4];
                    this.field570 = 1;
                    this.field571 = var4;
                    this.field572 = var37.field788;
                    this.field287 = 0;
                    this.field433 = true;
                    String var38 = var37.field823;
                    if (var38.indexOf(" ") != -1) {
                        var38 = var38.substring(0, var38.indexOf(" "));
                    }
                    String var39 = var37.field823;
                    if (var39.indexOf(" ") != -1) {
                        var39 = var39.substring(var39.indexOf(" ") + 1);
                    }
                    this.field573 = var38 + " " + var37.field817 + " " + var39;
                    if (this.field572 == 16) {
                        this.field433 = true;
                        this.field169 = 3;
                        this.field509 = true;
                    }
                } else {
                    if (var5 == 247) {
                        boolean var40 = this.method180(2, 0, (byte) -3, 0, var4, 0, field557.field1568[0], field557.field1567[0], false, 0, 0, var3);
                        if (!var40) {
                            this.method180(2, 1, (byte) -3, 1, var4, 0, field557.field1568[0], field557.field1567[0], false, 0, 0, var3);
                        }
                        this.field549 = super.field1115;
                        this.field550 = super.field1116;
                        this.field552 = 2;
                        this.field551 = 0;
                        this.field608.method33((byte) 57, 159);
                        this.field608.method35(this.field546 + var4);
                        this.field608.method69(var6, (byte) 0);
                        this.field608.method35(this.field545 + var3);
                    }
                    if (var5 == 776) {
                        class22 var42 = this.field220[var6];
                        if (var42 != null) {
                            this.method180(2, 1, (byte) -3, 1, var42.field1568[0], 0, field557.field1568[0], field557.field1567[0], false, 0, 0, var42.field1567[0]);
                            this.field549 = super.field1115;
                            this.field550 = super.field1116;
                            this.field552 = 2;
                            this.field551 = 0;
                            this.field608.method33((byte) 57, 242);
                            this.field608.method35(this.field571);
                            this.field608.method70(43385, var6);
                        }
                    }
                    if (var5 == 392 && this.method112(var4, var6, true, var3)) {
                        this.field608.method33((byte) 57, 53);
                        this.field608.method35(this.field546 + var4);
                        this.field608.method70(43385, var6 >> 14 & 32767);
                        this.field608.method69(this.field545 + var3, (byte) 0);
                        this.field608.method68(this.field571, (byte) -125);
                    }
                    if (var5 == 306) {
                        field434 += var6;
                        if (field434 >= 118) {
                            this.field608.method33((byte) 57, 163);
                            this.field608.method37(6106305);
                            field434 = 0;
                        }
                        this.field608.method33((byte) 57, 20);
                        this.field608.method69(var4, (byte) 0);
                        this.field608.method69(var3, (byte) 0);
                        this.field608.method35(var6);
                        this.field399 = 0;
                        this.field400 = var4;
                        this.field401 = var3;
                        this.field402 = 2;
                        if (class15.field806[var4].field818 == this.field268) {
                            this.field402 = 1;
                        }
                        if (class15.field806[var4].field818 == this.field472) {
                            this.field402 = 3;
                        }
                    }
                    if (var5 == 877) {
                        boolean var43 = this.method180(2, 0, (byte) -3, 0, var4, 0, field557.field1568[0], field557.field1567[0], false, 0, 0, var3);
                        if (!var43) {
                            this.method180(2, 1, (byte) -3, 1, var4, 0, field557.field1568[0], field557.field1567[0], false, 0, 0, var3);
                        }
                        this.field549 = super.field1115;
                        this.field550 = super.field1116;
                        this.field552 = 2;
                        this.field551 = 0;
                        this.field608.method33((byte) 57, 216);
                        this.field608.method70(43385, var6);
                        this.field608.method68(this.field545 + var3, (byte) -125);
                        this.field608.method68(this.field546 + var4, (byte) -125);
                    }
                    if (var5 == 210) {
                        String var45 = this.field349[arg0];
                        int var46 = var45.indexOf("@whi@");
                        if (var46 != -1) {
                            long var47 = class31.method388(var45.substring(var46 + 5).trim());
                            int var49 = -1;
                            for (int var50 = 0; var50 < this.field435; ++var50) {
                                if (this.field524[var50] == var47) {
                                    var49 = var50;
                                    break;
                                }
                            }
                            if (var49 != -1 && this.field507[var49] > 0) {
                                this.field578 = true;
                                this.field477 = 0;
                                this.field589 = true;
                                this.field518 = "";
                                this.field345 = 3;
                                this.field269 = this.field524[var49];
                                this.field393 = "Enter message to send to " + this.field336[var49];
                            }
                        }
                    }
                    if (var5 == 186) {
                        class55 var51 = this.field247[var6];
                        if (var51 != null) {
                            this.method180(2, 1, (byte) -3, 1, var51.field1568[0], 0, field557.field1568[0], field557.field1567[0], false, 0, 0, var51.field1567[0]);
                            this.field549 = super.field1115;
                            this.field550 = super.field1116;
                            this.field552 = 2;
                            this.field551 = 0;
                            this.field608.method33((byte) 57, 172);
                            this.field608.method68(this.field290, (byte) -125);
                            this.field608.method69(var6, (byte) 0);
                            this.field608.method70(43385, this.field289);
                            this.field608.method70(43385, this.field288);
                        }
                    }
                    if (var5 == 507) {
                        boolean var52 = this.method180(2, 0, (byte) -3, 0, var4, 0, field557.field1568[0], field557.field1567[0], false, 0, 0, var3);
                        if (!var52) {
                            this.method180(2, 1, (byte) -3, 1, var4, 0, field557.field1568[0], field557.field1567[0], false, 0, 0, var3);
                        }
                        this.field549 = super.field1115;
                        this.field550 = super.field1116;
                        this.field552 = 2;
                        this.field551 = 0;
                        this.field608.method33((byte) 57, 217);
                        this.field608.method69(this.field546 + var4, (byte) 0);
                        this.field608.method70(43385, var6);
                        this.field608.method70(43385, this.field290);
                        this.field608.method35(this.field289);
                        this.field608.method69(this.field545 + var3, (byte) 0);
                        this.field608.method68(this.field288, (byte) -125);
                    }
                    if (var5 == 97) {
                        this.method112(var4, var6, true, var3);
                        this.field608.method33((byte) 57, 203);
                        this.field608.method35(var6 >> 14 & 32767);
                        this.field608.method70(43385, this.field545 + var3);
                        this.field608.method35(this.field546 + var4);
                    }
                    if (var5 == 1435) {
                        class52 var54 = class52.method489(var6);
                        class15 var55 = class15.field806[var4];
                        String var56;
                        if (var55 != null && var55.field811[var3] >= 100000) {
                            var56 = var55.field811[var3] + " x " + var54.field1321;
                        } else if (var54.field1326 != null) {
                            var56 = new String(var54.field1326);
                        } else {
                            var56 = "It's a " + var54.field1321 + ".";
                        }
                        this.method181("", -979, var56, 0);
                    }
                    if (var5 == 683) {
                        this.field608.method33((byte) 57, 76);
                        this.field608.method68(var3, (byte) -125);
                        this.field608.method70(43385, var4);
                        this.field608.method69(this.field290, (byte) 0);
                        this.field608.method68(var6, (byte) -125);
                        this.field608.method68(this.field288, (byte) -125);
                        this.field608.method35(this.field289);
                        this.field399 = 0;
                        this.field400 = var4;
                        this.field401 = var3;
                        this.field402 = 2;
                        if (class15.field806[var4].field818 == this.field268) {
                            this.field402 = 1;
                        }
                        if (class15.field806[var4].field818 == this.field472) {
                            this.field402 = 3;
                        }
                    }
                    if (var5 == 614) {
                        class22 var57 = this.field220[var6];
                        if (var57 != null) {
                            this.method180(2, 1, (byte) -3, 1, var57.field1568[0], 0, field557.field1568[0], field557.field1567[0], false, 0, 0, var57.field1567[0]);
                            this.field549 = super.field1115;
                            this.field550 = super.field1116;
                            this.field552 = 2;
                            this.field551 = 0;
                            this.field608.method33((byte) 57, 33);
                            this.field608.method70(43385, this.field290);
                            this.field608.method68(this.field288, (byte) -125);
                            this.field608.method70(43385, var6);
                            this.field608.method70(43385, this.field289);
                        }
                    }
                    if (var5 == 860) {
                        class55 var58 = this.field247[var6];
                        if (var58 != null) {
                            this.method180(2, 1, (byte) -3, 1, var58.field1568[0], 0, field557.field1568[0], field557.field1567[0], false, 0, 0, var58.field1567[0]);
                            this.field549 = super.field1115;
                            this.field550 = super.field1116;
                            this.field552 = 2;
                            this.field551 = 0;
                            this.field608.method33((byte) 57, 185);
                            this.field608.method69(var6, (byte) 0);
                        }
                    }
                    if (var5 == 782 && this.method112(var4, var6, true, var3)) {
                        this.field608.method33((byte) 57, 38);
                        this.field608.method68(this.field288, (byte) -125);
                        this.field608.method70(43385, var6 >> 14 & 32767);
                        this.field608.method35(this.field289);
                        this.field608.method70(43385, this.field545 + var3);
                        this.field608.method68(this.field290, (byte) -125);
                        this.field608.method70(43385, this.field546 + var4);
                    }
                    if (var5 == 848) {
                        if ((var4 & 3) == 0) {
                            ++field298;
                        }
                        if (field298 >= 71) {
                            this.field608.method33((byte) 57, 115);
                            this.field608.method35(52081);
                            field298 = 0;
                        }
                        this.field608.method33((byte) 57, 91);
                        this.field608.method69(var4, (byte) 0);
                        this.field608.method69(var6, (byte) 0);
                        this.field608.method68(var3, (byte) -125);
                        this.field399 = 0;
                        this.field400 = var4;
                        this.field401 = var3;
                        this.field402 = 2;
                        if (class15.field806[var4].field818 == this.field268) {
                            this.field402 = 1;
                        }
                        if (class15.field806[var4].field818 == this.field472) {
                            this.field402 = 3;
                        }
                    }
                    if (var5 == 215) {
                        boolean var59 = this.method180(2, 0, (byte) -3, 0, var4, 0, field557.field1568[0], field557.field1567[0], false, 0, 0, var3);
                        if (!var59) {
                            this.method180(2, 1, (byte) -3, 1, var4, 0, field557.field1568[0], field557.field1567[0], false, 0, 0, var3);
                        }
                        this.field549 = super.field1115;
                        this.field550 = super.field1116;
                        this.field552 = 2;
                        this.field551 = 0;
                        if ((var4 & 3) == 0) {
                            ++field165;
                        }
                        if (field165 >= 78) {
                            this.field608.method33((byte) 57, 148);
                            this.field608.method35(30493);
                            field165 = 0;
                        }
                        this.field608.method33((byte) 57, 83);
                        this.field608.method70(43385, var6);
                        this.field608.method68(this.field546 + var4, (byte) -125);
                        this.field608.method70(43385, this.field545 + var3);
                    }
                    if (var5 == 1431) {
                        int var61 = var6 >> 14 & 32767;
                        class64 var62 = class64.method568(var61);
                        String var63;
                        if (var62.field1643 != null) {
                            var63 = new String(var62.field1643);
                        } else {
                            var63 = "It's a " + var62.field1629 + ".";
                        }
                        this.method181("", -979, var63, 0);
                    }
                    if (var5 == 717) {
                        this.method112(var4, var6, true, var3);
                        this.field608.method33((byte) 57, 59);
                        this.field608.method70(43385, this.field545 + var3);
                        this.field608.method70(43385, var6 >> 14 & 32767);
                        this.field608.method35(this.field546 + var4);
                    }
                    if (var5 == 781) {
                        class55 var64 = this.field247[var6];
                        if (var64 != null) {
                            this.method180(2, 1, (byte) -3, 1, var64.field1568[0], 0, field557.field1568[0], field557.field1567[0], false, 0, 0, var64.field1567[0]);
                            this.field549 = super.field1115;
                            this.field550 = super.field1116;
                            this.field552 = 2;
                            this.field551 = 0;
                            field340 += var6;
                            if (field340 >= 88) {
                                this.field608.method33((byte) 57, 68);
                                this.field608.method35(23699);
                                field340 = 0;
                            }
                            this.field608.method33((byte) 57, 30);
                            this.field608.method35(var6);
                        }
                    }
                    if (var5 == 346) {
                        field497 += this.field545;
                        if (field497 >= 119) {
                            this.field608.method33((byte) 57, 183);
                            field497 = 0;
                        }
                        this.method112(var4, var6, true, var3);
                        this.field608.method33((byte) 57, 80);
                        this.field608.method68(this.field546 + var4, (byte) -125);
                        this.field608.method68(var6 >> 14 & 32767, (byte) -125);
                        this.field608.method68(this.field545 + var3, (byte) -125);
                    }
                    if (var5 == 808) {
                        this.field608.method33((byte) 57, 96);
                        this.field608.method70(43385, var4);
                        this.field608.method35(var6);
                        this.field608.method70(43385, var3);
                        this.field399 = 0;
                        this.field400 = var4;
                        this.field401 = var3;
                        this.field402 = 2;
                        if (class15.field806[var4].field818 == this.field268) {
                            this.field402 = 1;
                        }
                        if (class15.field806[var4].field818 == this.field472) {
                            this.field402 = 3;
                        }
                    }
                    if (var5 == 152) {
                        String var65 = this.field349[arg0];
                        int var66 = var65.indexOf("@whi@");
                        if (var66 != -1) {
                            if (this.field268 == -1) {
                                this.method154(30702);
                                this.field596 = var65.substring(var66 + 5).trim();
                                this.field501 = false;
                                for (int var67 = 0; var67 < class15.field806.length; ++var67) {
                                    if (class15.field806[var67] != null && class15.field806[var67].field804 == 600) {
                                        this.field143 = this.field268 = class15.field806[var67].field818;
                                        break;
                                    }
                                }
                            } else {
                                this.method181("", -979, "Please close the interface you have open before using 'report abuse'", 0);
                            }
                        }
                    }
                    if (var5 == 365) {
                        this.field608.method33((byte) 57, 32);
                        this.field608.method35(var4);
                        this.field608.method69(var6, (byte) 0);
                        this.field608.method70(43385, var3);
                        this.field399 = 0;
                        this.field400 = var4;
                        this.field401 = var3;
                        this.field402 = 2;
                        if (class15.field806[var4].field818 == this.field268) {
                            this.field402 = 1;
                        }
                        if (class15.field806[var4].field818 == this.field472) {
                            this.field402 = 3;
                        }
                    }
                    if (var5 == 51) {
                        this.method112(var4, var6, true, var3);
                        this.field608.method33((byte) 57, 19);
                        this.field608.method70(43385, this.field546 + var4);
                        this.field608.method69(this.field545 + var3, (byte) 0);
                        this.field608.method69(var6 >> 14 & 32767, (byte) 0);
                    }
                    if (var5 == 246) {
                        boolean var68 = this.method180(2, 0, (byte) -3, 0, var4, 0, field557.field1568[0], field557.field1567[0], false, 0, 0, var3);
                        if (!var68) {
                            this.method180(2, 1, (byte) -3, 1, var4, 0, field557.field1568[0], field557.field1567[0], false, 0, 0, var3);
                        }
                        this.field549 = super.field1115;
                        this.field550 = super.field1116;
                        this.field552 = 2;
                        this.field551 = 0;
                        this.field608.method33((byte) 57, 78);
                        this.field608.method70(43385, this.field546 + var4);
                        this.field608.method68(var6, (byte) -125);
                        this.field608.method70(43385, this.field545 + var3);
                    }
                    if (var5 == 881) {
                        this.field608.method33((byte) 57, 235);
                        this.field608.method35(var3);
                        this.field608.method68(var4, (byte) -125);
                        this.field608.method68(var6, (byte) -125);
                        this.field399 = 0;
                        this.field400 = var4;
                        this.field401 = var3;
                        this.field402 = 2;
                        if (class15.field806[var4].field818 == this.field268) {
                            this.field402 = 1;
                        }
                        if (class15.field806[var4].field818 == this.field472) {
                            this.field402 = 3;
                        }
                    }
                    if (var5 == 321) {
                        boolean var70 = this.method180(2, 0, (byte) -3, 0, var4, 0, field557.field1568[0], field557.field1567[0], false, 0, 0, var3);
                        if (!var70) {
                            this.method180(2, 1, (byte) -3, 1, var4, 0, field557.field1568[0], field557.field1567[0], false, 0, 0, var3);
                        }
                        this.field549 = super.field1115;
                        this.field550 = super.field1116;
                        this.field552 = 2;
                        this.field551 = 0;
                        ++field609;
                        if (field609 >= 110) {
                            this.field608.method33((byte) 57, 169);
                            this.field608.method38(0);
                            field609 = 0;
                        }
                        this.field608.method33((byte) 57, 94);
                        this.field608.method69(var6, (byte) 0);
                        this.field608.method68(this.field545 + var3, (byte) -125);
                        this.field608.method70(43385, this.field546 + var4);
                    }
                    if (var5 == 657) {
                        class22 var72 = this.field220[var6];
                        if (var72 != null) {
                            this.method180(2, 1, (byte) -3, 1, var72.field1568[0], 0, field557.field1568[0], field557.field1567[0], false, 0, 0, var72.field1567[0]);
                            this.field549 = super.field1115;
                            this.field550 = super.field1116;
                            this.field552 = 2;
                            this.field551 = 0;
                            this.field608.method33((byte) 57, 5);
                            this.field608.method35(var6);
                        }
                    }
                    if (var5 == 894) {
                        this.field608.method33((byte) 57, 166);
                        this.field608.method68(var3, (byte) -125);
                        this.field608.method35(var4);
                        this.field608.method70(43385, var6);
                        this.field399 = 0;
                        this.field400 = var4;
                        this.field401 = var3;
                        this.field402 = 2;
                        if (class15.field806[var4].field818 == this.field268) {
                            this.field402 = 1;
                        }
                        if (class15.field806[var4].field818 == this.field472) {
                            this.field402 = 3;
                        }
                    }
                    if (var5 == 602) {
                        this.field608.method33((byte) 57, 140);
                        this.field608.method68(var3, (byte) -125);
                        this.field608.method70(43385, var4);
                        this.field608.method70(43385, var6);
                        this.field399 = 0;
                        this.field400 = var4;
                        this.field401 = var3;
                        this.field402 = 2;
                        if (class15.field806[var4].field818 == this.field268) {
                            this.field402 = 1;
                        }
                        if (class15.field806[var4].field818 == this.field472) {
                            this.field402 = 3;
                        }
                    }
                    if (var5 == 161) {
                        class55 var73 = this.field247[var6];
                        if (var73 != null) {
                            this.method180(2, 1, (byte) -3, 1, var73.field1568[0], 0, field557.field1568[0], field557.field1567[0], false, 0, 0, var73.field1567[0]);
                            this.field549 = super.field1115;
                            this.field550 = super.field1116;
                            this.field552 = 2;
                            this.field551 = 0;
                            this.field608.method33((byte) 57, 93);
                            this.field608.method69(var6, (byte) 0);
                        }
                    }
                    if (var5 == 883) {
                        this.method154(30702);
                    }
                    if (var5 == 369) {
                        this.field608.method33((byte) 57, 165);
                        this.field608.method68(var4, (byte) -125);
                        this.field608.method68(var3, (byte) -125);
                        this.field608.method70(43385, var6);
                        this.field399 = 0;
                        this.field400 = var4;
                        this.field401 = var3;
                        this.field402 = 2;
                        if (class15.field806[var4].field818 == this.field268) {
                            this.field402 = 1;
                        }
                        if (class15.field806[var4].field818 == this.field472) {
                            this.field402 = 3;
                        }
                    }
                    if (var5 == 374) {
                        this.field608.method33((byte) 57, 73);
                        this.field608.method69(var3, (byte) 0);
                        this.field608.method70(43385, var4);
                        this.field608.method70(43385, var6);
                        this.field608.method69(this.field571, (byte) 0);
                        this.field399 = 0;
                        this.field400 = var4;
                        this.field401 = var3;
                        this.field402 = 2;
                        if (class15.field806[var4].field818 == this.field268) {
                            this.field402 = 1;
                        }
                        if (class15.field806[var4].field818 == this.field472) {
                            this.field402 = 3;
                        }
                    }
                    if (var5 == 22) {
                        class55 var74 = this.field247[var6];
                        if (var74 != null) {
                            this.method180(2, 1, (byte) -3, 1, var74.field1568[0], 0, field557.field1568[0], field557.field1567[0], false, 0, 0, var74.field1567[0]);
                            this.field549 = super.field1115;
                            this.field550 = super.field1116;
                            this.field552 = 2;
                            this.field551 = 0;
                            this.field608.method33((byte) 57, 233);
                            this.field608.method69(var6, (byte) 0);
                        }
                    }
                    this.field287 = 0;
                    this.field570 = 0;
                    this.field433 = true;
                    if (arg1 != -46295) {
                        for (int var75 = 1; var75 > 0; ++var75) {
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LCKBTFRZM;II)V")
    private final void method119(class5 arg0, int arg1, int arg2) {
        int var4 = arg1 + arg2;
        while (arg0.field124 + 21 < var4 * 8) {
            int var5 = arg0.method55(this.field200, 14);
            if (var5 == 16383) {
                break;
            }
            if (this.field247[var5] == null) {
                this.field247[var5] = new class55();
            }
            class55 var6 = this.field247[var5];
            this.field249[this.field248++] = var5;
            var6.field1551 = field329;
            int var7 = arg0.method55(this.field200, 1);
            if (var7 == 1) {
                this.field224[this.field223++] = var5;
            }
            var6.field1398 = class4.method31(arg0.method55(this.field200, 12));
            int var8 = arg0.method55(this.field200, 5);
            if (var8 > 15) {
                var8 -= 32;
            }
            int var9 = arg0.method55(this.field200, 1);
            int var10 = arg0.method55(this.field200, 5);
            if (var10 > 15) {
                var10 -= 32;
            }
            var6.field1541 = var6.field1398.field90;
            var6.field1527 = var6.field1398.field87;
            var6.field1576 = var6.field1398.field77;
            var6.field1577 = var6.field1398.field68;
            var6.field1578 = var6.field1398.field81;
            var6.field1579 = var6.field1398.field89;
            var6.field1525 = var6.field1398.field75;
            var6.method559(field557.field1568[0] + var10, field557.field1567[0] + var8, 0, var9 == 1);
        }
        arg0.method56(0);
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZI)V")
    public final void method120(boolean arg0, int arg1) {
        int[] var3 = this.field334.field1173;
        int var4 = var3.length;
        for (int var5 = 0; var5 < var4; ++var5) {
            var3[var5] = 0;
        }
        for (int var6 = 1; var6 < 103; ++var6) {
            int var23 = (103 - var6) * 512 * 4 + 24628;
            for (int var24 = 1; var24 < 103; ++var24) {
                if ((this.field535[arg1][var24][var6] & 24) == 0) {
                    this.field403.method542(var3, var23, 512, arg1, var24, var6);
                }
                if (arg1 < 3 && (this.field535[arg1 + 1][var24][var6] & 8) != 0) {
                    this.field403.method542(var3, var23, 512, arg1 + 1, var24, var6);
                }
                var23 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        this.field334.method424(true);
        for (int var9 = 1; var9 < 103; ++var9) {
            for (int var22 = 1; var22 < 103; ++var22) {
                if ((this.field535[arg1][var22][var9] & 24) == 0) {
                    this.method148(var22, arg1, var7, var8, false, var9);
                }
                if (arg1 < 3 && (this.field535[arg1 + 1][var22][var9] & 8) != 0) {
                    this.method148(var22, arg1 + 1, var7, var8, false, var9);
                }
            }
        }
        this.field235.method289(true);
        this.field140 = 0;
        for (int var10 = 0; var10 < 104; ++var10) {
            for (int var11 = 0; var11 < 104; ++var11) {
                int var12 = this.field403.method536(this.field442, var10, var11);
                if (var12 != 0) {
                    int var13 = var12 >> 14 & 32767;
                    int var14 = class64.method568(var13).field1616;
                    if (var14 >= 0) {
                        int var15 = var10;
                        int var16 = var11;
                        if (var14 != 22 && var14 != 29 && var14 != 34 && var14 != 36 && var14 != 46 && var14 != 47 && var14 != 48) {
                            byte var17 = 104;
                            byte var18 = 104;
                            int[][] var19 = this.field350[this.field442].field1286;
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
                        this.field494[this.field140] = this.field155[var14];
                        this.field141[this.field140] = var15;
                        this.field142[this.field140] = var16;
                        ++this.field140;
                    }
                }
            }
        }
        this.field512 &= arg0;
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(Z)V")
    public final void method121(boolean arg0) {
        for (int var2 = 0; var2 < this.field303; ++var2) {
            if (this.field185[var2] <= 0) {
                boolean var3 = false;
                try {
                    if (this.field554[var2] == this.field368 && this.field476[var2] == this.field227) {
                        if (!this.method166(-967)) {
                            var3 = true;
                        }
                    } else {
                        class5 var4 = class51.method483(this.field476[var2], true, this.field554[var2]);
                        if (System.currentTimeMillis() + (long) (var4.field123 / 22) > (long) (this.field506 / 22) + this.field331) {
                            this.field506 = var4.field123;
                            this.field331 = System.currentTimeMillis();
                            if (this.method221(41795, var4.field123, var4.field122)) {
                                this.field368 = this.field554[var2];
                                this.field227 = this.field476[var2];
                            } else {
                                var3 = true;
                            }
                        }
                    }
                } catch (Exception var7) {
                }
                if (var3 && this.field185[var2] != -5) {
                    this.field185[var2] = -5;
                } else {
                    --this.field303;
                    for (int var6 = var2; var6 < this.field303; ++var6) {
                        this.field554[var6] = this.field554[var6 + 1];
                        this.field476[var6] = this.field476[var6 + 1];
                        this.field185[var6] = this.field185[var6 + 1];
                    }
                    --var2;
                }
            } else {
                int var10002 = this.field185[var2]--;
            }
        }
        if (arg0) {
            this.field196 = this.field299.method44();
        }
        if (this.field167 > 0) {
            this.field167 -= 20;
            if (this.field167 < 0) {
                this.field167 = 0;
            }
            if (this.field167 == 0 && this.field189 && !field275) {
                this.field386 = this.field384;
                this.field387 = true;
                this.field374.method259(2, this.field386);
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "o", descriptor = "(I)V")
    public final void method122(int arg0) {
        this.field233.method289(true);
        class10.field675 = this.field242;
        this.field300.method442(0, 0, false);
        if (this.field474 != -1) {
            this.method215(438, 0, class15.field806[this.field474], 0, 0);
        } else if (this.field414[this.field169] != -1) {
            this.method215(438, 0, class15.field806[this.field414[this.field169]], 0, 0);
        }
        if (this.field342 && this.field451 == 1) {
            this.method97(-112);
        }
        this.field233.method290(1, 205, 553, super.field1100);
        this.field235.method289(true);
        class10.field675 = this.field243;
        if (arg0 < 3 || arg0 > 3) {
            this.field196 = -1;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILCKBTFRZM;B)V")
    private final void method123(int arg0, class5 arg1, byte arg2) {
        if (arg2 == -19) {
            for (int var4 = 0; var4 < this.field223; ++var4) {
                int var5 = this.field224[var4];
                class22 var6 = this.field220[var5];
                int var7 = arg1.method44();
                if ((var7 & 16) != 0) {
                    var7 += arg1.method44() << 8;
                }
                this.method183(this.field138, arg1, var5, var7, var6);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIB)V")
    public final void method124(int arg0, int arg1, byte arg2) {
        int var4 = 0;
        if (arg2 != -16) {
            this.field196 = -1;
        }
        for (int var5 = 0; var5 < 100; ++var5) {
            if (this.field362[var5] != null) {
                int var6 = this.field360[var5];
                int var7 = 70 - var4 * 14 + this.field157 + 4;
                if (var7 < -20) {
                    break;
                }
                String var8 = this.field361[var5];
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
                if ((var6 == 1 || var6 == 2) && (var6 == 1 || this.field540 == 0 || this.field540 == 1 && this.method219(var8, (byte) 1))) {
                    if (arg1 > var7 - 14 && arg1 <= var7 && !var8.equals(field557.field973)) {
                        if (this.field239 >= 1) {
                            this.field349[this.field315] = "Report abuse @whi@" + var8;
                            this.field213[this.field315] = 152;
                            ++this.field315;
                        }
                        this.field349[this.field315] = "Add ignore @whi@" + var8;
                        this.field213[this.field315] = 84;
                        ++this.field315;
                        this.field349[this.field315] = "Add friend @whi@" + var8;
                        this.field213[this.field315] = 144;
                        ++this.field315;
                    }
                    ++var4;
                }
                if ((var6 == 3 || var6 == 7) && this.field307 == 0 && (var6 == 7 || this.field347 == 0 || this.field347 == 1 && this.method219(var8, (byte) 1))) {
                    if (arg1 > var7 - 14 && arg1 <= var7) {
                        if (this.field239 >= 1) {
                            this.field349[this.field315] = "Report abuse @whi@" + var8;
                            this.field213[this.field315] = 152;
                            ++this.field315;
                        }
                        this.field349[this.field315] = "Add ignore @whi@" + var8;
                        this.field213[this.field315] = 84;
                        ++this.field315;
                        this.field349[this.field315] = "Add friend @whi@" + var8;
                        this.field213[this.field315] = 144;
                        ++this.field315;
                    }
                    ++var4;
                }
                if (var6 == 4 && (this.field417 == 0 || this.field417 == 1 && this.method219(var8, (byte) 1))) {
                    if (arg1 > var7 - 14 && arg1 <= var7) {
                        this.field349[this.field315] = "Accept trade @whi@" + var8;
                        this.field213[this.field315] = 832;
                        ++this.field315;
                    }
                    ++var4;
                }
                if ((var6 == 5 || var6 == 6) && this.field307 == 0 && this.field347 < 2) {
                    ++var4;
                }
                if (var6 == 8 && (this.field417 == 0 || this.field417 == 1 && this.method219(var8, (byte) 1))) {
                    if (arg1 > var7 - 14 && arg1 <= var7) {
                        this.field349[this.field315] = "Accept challenge @whi@" + var8;
                        this.field213[this.field315] = 105;
                        ++this.field315;
                    }
                    ++var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "h", descriptor = "(Z)Ljava/lang/String;")
    public final String method125(boolean arg0) {
        if (arg0) {
            throw new NullPointerException();
        } else if (signlink.mainapp != null) {
            return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
        } else {
            return super.field1103 != null ? "runescape.com" : super.getDocumentBase().getHost().toLowerCase();
        }
    }

    @OriginalMember(owner = "client", name = "i", descriptor = "(Z)V")
    public static final void method126(boolean arg0) {
        class59.field1444 = true;
        if (arg0) {
            field252 = -129;
        }
        class10.field664 = true;
        field275 = true;
        class3.field66 = true;
        class64.field1648 = true;
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(ZI)V")
    public final void method127(boolean arg0, int arg1) {
        if (field557.field1570 >> 7 == this.field332 && field557.field1571 >> 7 == this.field333) {
            this.field332 = 0;
        }
        int var3 = this.field221;
        if (arg1 != 0) {
            this.field306 = !this.field306;
        }
        if (arg0) {
            var3 = 1;
        }
        for (int var4 = 0; var4 < var3; ++var4) {
            class22 var5;
            int var6;
            if (arg0) {
                var5 = field557;
                var6 = this.field219 << 14;
            } else {
                var5 = this.field220[this.field222[var4]];
                var6 = this.field222[var4] << 14;
            }
            if (var5 != null && var5.method368(-32976)) {
                var5.field964 = false;
                if ((field275 && this.field221 > 50 || this.field221 > 200) && !arg0 && var5.field1573 == var5.field1525) {
                    var5.field964 = true;
                }
                int var7 = var5.field1570 >> 7;
                int var8 = var5.field1571 >> 7;
                if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                    if (var5.field969 != null && field329 >= var5.field976 && field329 < var5.field977) {
                        var5.field964 = false;
                        var5.field961 = this.method194(this.field442, 0, var5.field1570, var5.field1571);
                        this.field403.method519(var5.field1572, var6, var5.field958, var5.field1571, var5.field956, var5.field959, var5, var5.field961, this.field442, 60, 760, var5.field1570, var5.field957);
                    } else {
                        if ((var5.field1570 & 127) == 64 && (var5.field1571 & 127) == 64) {
                            if (this.field415[var7][var8] == this.field530) {
                                continue;
                            }
                            this.field415[var7][var8] = this.field530;
                        }
                        var5.field961 = this.method194(this.field442, 0, var5.field1570, var5.field1571);
                        this.field403.method518(var5.field1524, 60, var5, var5.field1572, var6, var5.field1570, this.field442, var5.field1571, var5.field961, 615);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(LFDUKJGTQ;I)V")
    public final void method128(class15 arg0, int arg1) {
        int var3 = arg0.field804;
        if (arg1 != 7) {
            this.field398 = null;
        }
        if ((var3 < 1 || var3 > 100) && (var3 < 701 || var3 > 800)) {
            if (var3 >= 101 && var3 <= 200 || var3 >= 801 && var3 <= 900) {
                int var5 = this.field435;
                if (this.field436 != 2) {
                    var5 = 0;
                }
                if (var3 > 800) {
                    var3 -= 701;
                } else {
                    var3 -= 101;
                }
                if (var3 >= var5) {
                    arg0.field773 = "";
                    arg0.field771 = 0;
                } else {
                    if (this.field507[var3] == 0) {
                        arg0.field773 = "@red@Offline";
                    } else if (this.field507[var3] == field272) {
                        arg0.field773 = "@gre@World-" + (this.field507[var3] - 9);
                    } else {
                        arg0.field773 = "@yel@World-" + (this.field507[var3] - 9);
                    }
                    arg0.field771 = 1;
                }
            } else if (var3 == 203) {
                int var6 = this.field435;
                if (this.field436 != 2) {
                    var6 = 0;
                }
                arg0.field805 = var6 * 15 + 20;
                if (arg0.field805 <= arg0.field816) {
                    arg0.field805 = arg0.field816 + 1;
                }
            } else if (var3 >= 401 && var3 <= 500) {
                var3 -= 401;
                if (var3 == 0 && this.field436 == 0) {
                    arg0.field773 = "Loading ignore list";
                    arg0.field771 = 0;
                } else if (var3 == 1 && this.field436 == 0) {
                    arg0.field773 = "Please wait...";
                    arg0.field771 = 0;
                } else {
                    int var7 = this.field475;
                    if (this.field436 == 0) {
                        var7 = 0;
                    }
                    if (var3 >= var7) {
                        arg0.field773 = "";
                        arg0.field771 = 0;
                    } else {
                        arg0.field773 = class31.method392(class31.method389((byte) -71, this.field516[var3]), false);
                        arg0.field771 = 1;
                    }
                }
            } else if (var3 == 503) {
                arg0.field805 = this.field475 * 15 + 20;
                if (arg0.field805 <= arg0.field816) {
                    arg0.field805 = arg0.field816 + 1;
                }
            } else if (var3 == 327) {
                arg0.field783 = 150;
                arg0.field784 = (int) (Math.sin((double) field329 / 40.0D) * 256.0D) & 2047;
                if (this.field614) {
                    for (int var8 = 0; var8 < 7; ++var8) {
                        int var15 = this.field346[var8];
                        if (var15 >= 0 && !class29.field1052[var15].method384(0)) {
                            return;
                        }
                    }
                    this.field614 = false;
                    class21[] var9 = new class21[7];
                    int var10 = 0;
                    for (int var11 = 0; var11 < 7; ++var11) {
                        int var14 = this.field346[var11];
                        if (var14 >= 0) {
                            var9[var10++] = class29.field1052[var14].method385(-630);
                        }
                    }
                    class21 var12 = new class21(var9, 3729, var10);
                    for (int var13 = 0; var13 < 5; ++var13) {
                        if (this.field313[var13] != 0) {
                            var12.method355(field531[var13][0], field531[var13][this.field313[var13]]);
                            if (var13 == 1) {
                                var12.method355(field416[0], field416[this.field313[var13]]);
                            }
                        }
                    }
                    var12.method348(false);
                    var12.method349(90, class39.field1195[field557.field1525].field1197[0]);
                    var12.method358(64, 850, -30, -50, -30, true);
                    arg0.field780 = 5;
                    arg0.field781 = 0;
                    class15.method284(0, 5, var12, false);
                }
            } else if (var3 == 324) {
                if (this.field231 == null) {
                    this.field231 = arg0.field799;
                    this.field232 = arg0.field793;
                }
                if (this.field464) {
                    arg0.field799 = this.field232;
                } else {
                    arg0.field799 = this.field231;
                }
            } else if (var3 == 325) {
                if (this.field231 == null) {
                    this.field231 = arg0.field799;
                    this.field232 = arg0.field793;
                }
                if (this.field464) {
                    arg0.field799 = this.field231;
                } else {
                    arg0.field799 = this.field232;
                }
            } else if (var3 == 600) {
                arg0.field773 = this.field596;
                if (field329 % 20 < 10) {
                    arg0.field773 = arg0.field773 + "|";
                } else {
                    arg0.field773 = arg0.field773 + " ";
                }
            } else {
                if (var3 == 613) {
                    if (this.field239 >= 1) {
                        if (this.field501) {
                            arg0.field824 = 16711680;
                            arg0.field773 = "Moderator option: Mute player for 48 hours: <ON>";
                        } else {
                            arg0.field824 = 16777215;
                            arg0.field773 = "Moderator option: Mute player for 48 hours: <OFF>";
                        }
                    } else {
                        arg0.field773 = "";
                    }
                }
                if (var3 == 650 || var3 == 655) {
                    if (this.field187 != 0) {
                        String var16;
                        if (this.field515 == 0) {
                            var16 = "earlier today";
                        } else if (this.field515 == 1) {
                            var16 = "yesterday";
                        } else {
                            var16 = this.field515 + " days ago";
                        }
                        arg0.field773 = "You last logged in " + var16 + " from: " + signlink.dns;
                    } else {
                        arg0.field773 = "";
                    }
                }
                if (var3 == 651) {
                    if (this.field444 == 0) {
                        arg0.field773 = "0 unread messages";
                        arg0.field824 = 16776960;
                    }
                    if (this.field444 == 1) {
                        arg0.field773 = "1 unread message";
                        arg0.field824 = 65280;
                    }
                    if (this.field444 > 1) {
                        arg0.field773 = this.field444 + " unread messages";
                        arg0.field824 = 65280;
                    }
                }
                if (var3 == 652) {
                    if (this.field270 == 201) {
                        if (this.field190 == 1) {
                            arg0.field773 = "@yel@This is a non-members world: @whi@Since you are a member we";
                        } else {
                            arg0.field773 = "";
                        }
                    } else if (this.field270 == 200) {
                        arg0.field773 = "You have not yet set any password recovery questions.";
                    } else {
                        String var17;
                        if (this.field270 == 0) {
                            var17 = "Earlier today";
                        } else if (this.field270 == 1) {
                            var17 = "Yesterday";
                        } else {
                            var17 = this.field270 + " days ago";
                        }
                        arg0.field773 = var17 + " you changed your recovery questions";
                    }
                }
                if (var3 == 653) {
                    if (this.field270 == 201) {
                        if (this.field190 == 1) {
                            arg0.field773 = "@whi@recommend you use a members world instead. You may use";
                        } else {
                            arg0.field773 = "";
                        }
                    } else if (this.field270 == 200) {
                        arg0.field773 = "We strongly recommend you do so now to secure your account.";
                    } else {
                        arg0.field773 = "If you do not remember making this change then cancel it immediately";
                    }
                }
                if (var3 == 654) {
                    if (this.field270 == 201) {
                        if (this.field190 == 1) {
                            arg0.field773 = "@whi@this world but member benefits are unavailable whilst here.";
                        } else {
                            arg0.field773 = "";
                        }
                    } else if (this.field270 == 200) {
                        arg0.field773 = "Do this from the 'account management' area on our front webpage";
                    } else {
                        arg0.field773 = "Do this from the 'account management' area on our front webpage";
                    }
                }
            }
        } else if (var3 == 1 && this.field436 == 0) {
            arg0.field773 = "Loading friend list";
            arg0.field771 = 0;
        } else if (var3 == 1 && this.field436 == 1) {
            arg0.field773 = "Connecting to friendserver";
            arg0.field771 = 0;
        } else if (var3 == 2 && this.field436 != 2) {
            arg0.field773 = "Please wait...";
            arg0.field771 = 0;
        } else {
            int var4 = this.field435;
            if (this.field436 != 2) {
                var4 = 0;
            }
            if (var3 > 700) {
                var3 -= 601;
            } else {
                --var3;
            }
            if (var3 >= var4) {
                arg0.field773 = "";
                arg0.field771 = 0;
            } else {
                arg0.field773 = this.field336[var3];
                arg0.field771 = 1;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IZ)V")
    public final void method129(int arg0, boolean arg1) {
        for (int var3 = 0; var3 < this.field248; ++var3) {
            class55 var4 = this.field247[this.field249[var3]];
            int var5 = (this.field249[var3] << 14) + 536870912;
            if (var4 != null && var4.method368(-32976) && var4.field1398.field67 == arg1) {
                int var6 = var4.field1570 >> 7;
                int var7 = var4.field1571 >> 7;
                if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
                    if (var4.field1541 == 1 && (var4.field1570 & 127) == 64 && (var4.field1571 & 127) == 64) {
                        if (this.field415[var6][var7] == this.field530) {
                            continue;
                        }
                        this.field415[var6][var7] = this.field530;
                    }
                    this.field403.method518(var4.field1524, (var4.field1541 - 1) * 64 + 60, var4, var4.field1572, var5, var4.field1570, this.field442, var4.field1571, this.method194(this.field442, 0, var4.field1570, var4.field1571), 615);
                }
            }
        }
        if (arg0 >= 0) {
            this.field407 = !this.field407;
        }
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(B)V")
    public final void method130(byte arg0) {
        if (this.field258 == null) {
            super.field1101 = null;
            this.field236 = null;
            this.field234 = null;
            this.field233 = null;
            this.field235 = null;
            this.field376 = null;
            this.field377 = null;
            this.field378 = null;
            this.field261 = new class16(this.method190(0), 30871, 128, 265);
            class35.method415(this.field250);
            if (arg0 != -13) {
                this.field196 = -1;
            }
            this.field262 = new class16(this.method190(0), 30871, 128, 265);
            class35.method415(this.field250);
            this.field258 = new class16(this.method190(0), 30871, 509, 171);
            class35.method415(this.field250);
            this.field259 = new class16(this.method190(0), 30871, 360, 132);
            class35.method415(this.field250);
            this.field260 = new class16(this.method190(0), 30871, 360, 200);
            class35.method415(this.field250);
            this.field263 = new class16(this.method190(0), 30871, 202, 238);
            class35.method415(this.field250);
            this.field264 = new class16(this.method190(0), 30871, 203, 238);
            class35.method415(this.field250);
            this.field265 = new class16(this.method190(0), 30871, 74, 94);
            class35.method415(this.field250);
            this.field266 = new class16(this.method190(0), 30871, 75, 94);
            class35.method415(this.field250);
            if (this.field601 != null) {
                this.method213((byte) 2);
                this.method105(7);
            }
            this.field514 = true;
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(JI)V")
    public final void method131(long arg0, int arg1) {
        if (arg0 != 0L) {
            for (int var4 = 0; var4 < this.field435; ++var4) {
                if (this.field524[var4] == arg0) {
                    --this.field435;
                    this.field433 = true;
                    for (int var5 = var4; var5 < this.field435; ++var5) {
                        this.field336[var5] = this.field336[var5 + 1];
                        this.field507[var5] = this.field507[var5 + 1];
                        this.field524[var5] = this.field524[var5 + 1];
                    }
                    this.field608.method33((byte) 57, 62);
                    this.field608.method40(0, arg0);
                    break;
                }
            }
            if (arg1 != -11776) {
                this.field398 = null;
            }
        }
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(B)V")
    public static final void method132(byte arg0) {
        if (arg0 == 4) {
            boolean var1 = false;
        }
        class59.field1444 = false;
        class10.field664 = false;
        field275 = false;
        class3.field66 = false;
        class64.field1648 = false;
    }

    @OriginalMember(owner = "client", name = "p", descriptor = "(I)V")
    public final void method133(int arg0) {
        while (arg0 >= 0) {
            field172 = !field172;
        }
        if (super.field1114 == 1) {
            if (super.field1115 >= 6 && super.field1115 <= 106 && super.field1116 >= 467 && super.field1116 <= 499) {
                this.field540 = (this.field540 + 1) % 4;
                this.field610 = true;
                this.field578 = true;
                this.field608.method33((byte) 57, 174);
                this.field608.method34(this.field540);
                this.field608.method34(this.field347);
                this.field608.method34(this.field417);
            }
            if (super.field1115 >= 135 && super.field1115 <= 235 && super.field1116 >= 467 && super.field1116 <= 499) {
                this.field347 = (this.field347 + 1) % 3;
                this.field610 = true;
                this.field578 = true;
                this.field608.method33((byte) 57, 174);
                this.field608.method34(this.field540);
                this.field608.method34(this.field347);
                this.field608.method34(this.field417);
            }
            if (super.field1115 >= 273 && super.field1115 <= 373 && super.field1116 >= 467 && super.field1116 <= 499) {
                this.field417 = (this.field417 + 1) % 3;
                this.field610 = true;
                this.field578 = true;
                this.field608.method33((byte) 57, 174);
                this.field608.method34(this.field540);
                this.field608.method34(this.field347);
                this.field608.method34(this.field417);
            }
            if (super.field1115 >= 412 && super.field1115 <= 512 && super.field1116 >= 467 && super.field1116 <= 499) {
                if (this.field268 == -1) {
                    this.method154(30702);
                    this.field596 = "";
                    this.field501 = false;
                    for (int var2 = 0; var2 < class15.field806.length; ++var2) {
                        if (class15.field806[var2] != null && class15.field806[var2].field804 == 600) {
                            this.field143 = this.field268 = class15.field806[var2].field818;
                            return;
                        }
                    }
                    return;
                }
                this.method181("", -979, "Please close the interface you have open before using 'report abuse'", 0);
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(IILCKBTFRZM;)V")
    private final void method134(int arg0, int arg1, class5 arg2) {
        for (int var4 = 0; var4 < this.field223; ++var4) {
            int var6 = this.field224[var4];
            class55 var7 = this.field247[var6];
            int var8 = arg2.method44();
            if ((var8 & 4) != 0) {
                int var9 = arg2.method71(0);
                if (var9 == 65535) {
                    var9 = -1;
                }
                int var10 = arg2.method62(false);
                if (var7.field1542 == var9 && var9 != -1) {
                    int var11 = class39.field1195[var9].field1209;
                    if (var11 == 1) {
                        var7.field1543 = 0;
                        var7.field1544 = 0;
                        var7.field1545 = var10;
                        var7.field1546 = 0;
                    }
                    if (var11 == 2) {
                        var7.field1546 = 0;
                    }
                } else if (var9 == -1 || var7.field1542 == -1 || class39.field1195[var9].field1203 >= class39.field1195[var7.field1542].field1203) {
                    var7.field1542 = var9;
                    var7.field1543 = 0;
                    var7.field1544 = 0;
                    var7.field1545 = var10;
                    var7.field1546 = 0;
                    var7.field1535 = var7.field1559;
                }
            }
            if ((var8 & 8) != 0) {
                int var12 = arg2.method62(false);
                int var13 = arg2.method64(-768);
                var7.method558(-196, var12, var13, field329);
                var7.field1530 = field329 + 300;
                var7.field1531 = arg2.method64(-768);
                var7.field1532 = arg2.method64(-768);
            }
            if ((var8 & 64) != 0) {
                var7.field1398 = class4.method31(arg2.method73(this.field532));
                var7.field1541 = var7.field1398.field90;
                var7.field1527 = var7.field1398.field87;
                var7.field1576 = var7.field1398.field77;
                var7.field1577 = var7.field1398.field68;
                var7.field1578 = var7.field1398.field81;
                var7.field1579 = var7.field1398.field89;
                var7.field1525 = var7.field1398.field75;
            }
            if ((var8 & 1) != 0) {
                var7.field1536 = arg2.method72(3);
                int var14 = arg2.method78((byte) 3);
                var7.field1540 = var14 >> 16;
                var7.field1539 = (var14 & 65535) + field329;
                var7.field1537 = 0;
                var7.field1538 = 0;
                if (var7.field1539 > field329) {
                    var7.field1537 = -1;
                }
                if (var7.field1536 == 65535) {
                    var7.field1536 = -1;
                }
            }
            if ((var8 & 32) != 0) {
                int var15 = arg2.method64(-768);
                int var16 = arg2.method62(false);
                var7.method558(-196, var15, var16, field329);
                var7.field1530 = field329 + 300;
                var7.field1531 = arg2.method63((byte) -120);
                var7.field1532 = arg2.method62(false);
            }
            if ((var8 & 128) != 0) {
                var7.field1553 = arg2.method72(3);
                var7.field1554 = arg2.method73(this.field532);
            }
            if ((var8 & 16) != 0) {
                var7.field1552 = arg2.method72(3);
                if (var7.field1552 == 65535) {
                    var7.field1552 = -1;
                }
            }
            if ((var8 & 2) != 0) {
                var7.field1529 = arg2.method51();
                var7.field1558 = 100;
            }
        }
        int var5 = 75 / arg1;
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(IILCKBTFRZM;)V")
    private final void method135(int arg0, int arg1, class5 arg2) {
        arg2.method54(12265);
        while (arg0 >= 0) {
            this.field196 = arg2.method44();
        }
        int var4 = arg2.method55(this.field200, 1);
        if (var4 != 0) {
            int var5 = arg2.method55(this.field200, 2);
            if (var5 == 0) {
                this.field224[this.field223++] = this.field219;
            } else if (var5 == 1) {
                int var6 = arg2.method55(this.field200, 3);
                field557.method561(false, this.field420, var6);
                int var7 = arg2.method55(this.field200, 1);
                if (var7 == 1) {
                    this.field224[this.field223++] = this.field219;
                }
            } else if (var5 == 2) {
                int var8 = arg2.method55(this.field200, 3);
                field557.method561(true, this.field420, var8);
                int var9 = arg2.method55(this.field200, 3);
                field557.method561(true, this.field420, var9);
                int var10 = arg2.method55(this.field200, 1);
                if (var10 == 1) {
                    this.field224[this.field223++] = this.field219;
                }
            } else if (var5 == 3) {
                int var11 = arg2.method55(this.field200, 7);
                int var12 = arg2.method55(this.field200, 1);
                if (var12 == 1) {
                    this.field224[this.field223++] = this.field219;
                }
                int var13 = arg2.method55(this.field200, 1);
                this.field442 = arg2.method55(this.field200, 2);
                int var14 = arg2.method55(this.field200, 7);
                field557.method559(var14, var11, 0, var13 == 1);
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(I)V")
    public final void method136(int arg0) {
        if (!this.field568 && !this.field405 && !this.field519) {
            ++field329;
            if (arg0 >= 0) {
                field594 = this.field413.method479();
            }
            if (!this.field512) {
                this.method108((byte) 96);
            } else {
                this.method143(true);
            }
            this.method109(-34262);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILJONKABPT;II)V")
    public final void method137(int arg0, class37 arg1, int arg2, int arg3) {
        int var5 = this.field380 + this.field365 & 2047;
        if (arg2 != 9) {
            this.field196 = -1;
        }
        int var6 = arg0 * arg0 + arg3 * arg3;
        if (var6 <= 6400) {
            int var7 = class21.field948[var5];
            int var8 = class21.field949[var5];
            int var9 = var7 * 256 / (this.field574 + 256);
            int var10 = var8 * 256 / (this.field574 + 256);
            int var11 = arg0 * var10 + arg3 * var9 >> 16;
            int var12 = arg3 * var10 - arg0 * var9 >> 16;
            if (var6 > 2500) {
                arg1.method435(this.field301, var11 + 94 - arg1.field1178 / 2 + 4, -550, 83 - var12 - arg1.field1179 / 2 - 4);
            } else {
                arg1.method429(83 - var12 - arg1.field1179 / 2 - 4, var11 + 94 - arg1.field1178 / 2 + 4, false);
            }
        }
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(B)V")
    public final void method138(byte arg0) {
        if (arg0 != 2) {
            this.field608.method34(251);
        }
        for (class70 var2 = (class70) this.field355.method585(); var2 != null; var2 = (class70) this.field355.method587(0)) {
            if (this.field442 == var2.field1700 && !var2.field1709) {
                if (field329 >= var2.field1705) {
                    var2.method590(this.field459, 28532);
                    if (var2.field1709) {
                        var2.method450();
                    } else {
                        this.field403.method518(false, 60, var2, 0, -1, var2.field1701, var2.field1700, var2.field1702, var2.field1703, 615);
                    }
                }
            } else {
                var2.method450();
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILCKBTFRZM;Z)V")
    public final void method139(int arg0, class5 arg1, boolean arg2) {
        if (!arg2) {
            this.field398 = null;
        }
        if (arg0 == 78) {
            int var4 = arg1.method73(this.field532);
            int var5 = arg1.method62(false);
            int var6 = (var5 >> 4 & 7) + this.field495;
            int var7 = (var5 & 7) + this.field496;
            int var8 = arg1.method62(false);
            int var9 = var8 >> 2;
            int var10 = var8 & 3;
            int var11 = this.field357[var9];
            int var12 = arg1.method46();
            byte var13 = arg1.method65(false);
            int var14 = arg1.method71(0);
            byte var15 = arg1.method45();
            byte var16 = arg1.method66(false);
            int var17 = arg1.method46();
            byte var18 = arg1.method67(true);
            class22 var19;
            if (this.field396 == var17) {
                var19 = field557;
            } else {
                var19 = this.field220[var17];
            }
            if (var19 != null) {
                class64 var20 = class64.method568(var14);
                int var21 = this.field193[this.field442][var6][var7];
                int var22 = this.field193[this.field442][var6 + 1][var7];
                int var23 = this.field193[this.field442][var6 + 1][var7 + 1];
                int var24 = this.field193[this.field442][var6][var7 + 1];
                class21 var25 = var20.method569(var9, var10, var21, var22, var23, var24, -1);
                if (var25 != null) {
                    this.method167(var12 + 1, 0, var4 + 1, var11, this.field442, var7, var6, 0, -1, 0);
                    var19.field976 = field329 + var4;
                    var19.field977 = field329 + var12;
                    var19.field969 = var25;
                    int var26 = var20.field1647;
                    int var27 = var20.field1617;
                    if (var10 == 1 || var10 == 3) {
                        var26 = var20.field1617;
                        var27 = var20.field1647;
                    }
                    var19.field966 = var6 * 128 + var26 * 64;
                    var19.field968 = var7 * 128 + var27 * 64;
                    var19.field967 = this.method194(this.field442, 0, var19.field966, var19.field968);
                    if (var16 > var18) {
                        byte var28 = var16;
                        var16 = var18;
                        var18 = var28;
                    }
                    if (var15 > var13) {
                        byte var29 = var15;
                        var15 = var13;
                        var13 = var29;
                    }
                    var19.field956 = var6 + var16;
                    var19.field958 = var6 + var18;
                    var19.field957 = var7 + var15;
                    var19.field959 = var7 + var13;
                }
            }
        }
        if (arg0 == 219) {
            int var30 = arg1.method71(0);
            int var31 = arg1.method63((byte) -120);
            int var32 = var31 >> 2;
            int var33 = var31 & 3;
            int var34 = this.field357[var32];
            int var35 = arg1.method63((byte) -120);
            int var36 = (var35 >> 4 & 7) + this.field495;
            int var37 = (var35 & 7) + this.field496;
            if (var36 >= 0 && var37 >= 0 && var36 < 104 && var37 < 104) {
                this.method167(-1, 0, 0, var34, this.field442, var37, var36, var33, var30, var32);
            }
        } else if (arg0 == 7) {
            int var38 = arg1.method64(-768);
            int var39 = var38 >> 2;
            int var40 = var38 & 3;
            int var41 = this.field357[var39];
            int var42 = arg1.method64(-768);
            int var43 = (var42 >> 4 & 7) + this.field495;
            int var44 = (var42 & 7) + this.field496;
            int var45 = arg1.method73(this.field532);
            if (var43 >= 0 && var44 >= 0 && var43 < 103 && var44 < 103) {
                int var46 = this.field193[this.field442][var43][var44];
                int var47 = this.field193[this.field442][var43 + 1][var44];
                int var48 = this.field193[this.field442][var43 + 1][var44 + 1];
                int var49 = this.field193[this.field442][var43][var44 + 1];
                if (var41 == 0) {
                    class46 var50 = this.field403.method529(var44, var43, 3726, this.field442);
                    if (var50 != null) {
                        int var51 = var50.field1273 >> 14 & 32767;
                        if (var39 == 2) {
                            var50.field1271 = new class44(this.field556, var47, var49, var51, var40 + 4, var48, var46, false, var45, 2);
                            var50.field1272 = new class44(this.field556, var47, var49, var51, var40 + 1 & 3, var48, var46, false, var45, 2);
                        } else {
                            var50.field1271 = new class44(this.field556, var47, var49, var51, var40, var48, var46, false, var45, var39);
                        }
                    }
                }
                if (var41 == 1) {
                    class30 var52 = this.field403.method530(this.field442, (byte) -32, var44, var43);
                    if (var52 != null) {
                        var52.field1064 = new class44(this.field556, var47, var49, var52.field1065 >> 14 & 32767, 0, var48, var46, false, var45, 4);
                    }
                }
                if (var41 == 2) {
                    class40 var53 = this.field403.method531(var44, var43, this.field442, 1);
                    if (var39 == 11) {
                        var39 = 10;
                    }
                    if (var53 != null) {
                        var53.field1216 = new class44(this.field556, var47, var49, var53.field1224 >> 14 & 32767, var40, var48, var46, false, var45, var39);
                    }
                }
                if (var41 == 3) {
                    class62 var54 = this.field403.method532(var44, this.field442, var43, 3);
                    if (var54 != null) {
                        var54.field1583 = new class44(this.field556, var47, var49, var54.field1584 >> 14 & 32767, var40, var48, var46, false, var45, 22);
                    }
                }
            }
        } else if (arg0 == 90) {
            int var55 = arg1.method63((byte) -120);
            int var56 = (var55 >> 4 & 7) + this.field495;
            int var57 = (var55 & 7) + this.field496;
            int var58 = arg1.method72(3);
            int var59 = arg1.method72(3);
            int var60 = arg1.method71(0);
            if (var56 >= 0 && var57 >= 0 && var56 < 104 && var57 < 104 && this.field396 != var59) {
                class56 var61 = new class56();
                var61.field1400 = var60;
                var61.field1399 = var58;
                if (this.field398[this.field442][var56][var57] == null) {
                    this.field398[this.field442][var56][var57] = new class69((byte) 7);
                }
                this.field398[this.field442][var56][var57].method582(var61);
                this.method209(var56, var57);
            }
        } else if (arg0 == 198) {
            int var62 = arg1.method44();
            int var63 = (var62 >> 4 & 7) + this.field495;
            int var64 = (var62 & 7) + this.field496;
            int var65 = arg1.method46();
            int var66 = arg1.method44();
            int var67 = arg1.method46();
            if (var63 >= 0 && var64 >= 0 && var63 < 104 && var64 < 104) {
                int var68 = var63 * 128 + 64;
                int var69 = var64 * 128 + 64;
                class70 var70 = new class70(var67, var65, field329, this.field442, var68, this.method194(this.field442, 0, var68, var69) - var66, this.field230, var69);
                this.field355.method582(var70);
            }
        } else if (arg0 == 172) {
            int var71 = arg1.method46();
            int var72 = arg1.method64(-768);
            int var73 = (var72 >> 4 & 7) + this.field495;
            int var74 = (var72 & 7) + this.field496;
            if (var73 >= 0 && var74 >= 0 && var73 < 104 && var74 < 104) {
                class69 var75 = this.field398[this.field442][var73][var74];
                if (var75 != null) {
                    for (class56 var76 = (class56) var75.method585(); var76 != null; var76 = (class56) var75.method587(0)) {
                        if ((var71 & 32767) == var76.field1400) {
                            var76.method450();
                            break;
                        }
                    }
                    if (var75.method585() == null) {
                        this.field398[this.field442][var73][var74] = null;
                    }
                    this.method209(var73, var74);
                }
            }
        } else if (arg0 == 208) {
            int var77 = arg1.method44();
            int var78 = (var77 >> 4 & 7) + this.field495;
            int var79 = (var77 & 7) + this.field496;
            int var80 = var78 + arg1.method45();
            int var81 = var79 + arg1.method45();
            int var82 = arg1.method47();
            int var83 = arg1.method46();
            int var84 = arg1.method44() * 4;
            int var85 = arg1.method44() * 4;
            int var86 = arg1.method46();
            int var87 = arg1.method46();
            int var88 = arg1.method44();
            int var89 = arg1.method44();
            if (var78 >= 0 && var79 >= 0 && var78 < 104 && var79 < 104 && var80 >= 0 && var81 >= 0 && var80 < 104 && var81 < 104 && var83 != 65535) {
                int var90 = var78 * 128 + 64;
                int var91 = var79 * 128 + 64;
                int var92 = var80 * 128 + 64;
                int var93 = var81 * 128 + 64;
                class66 var94 = new class66(var82, var90, this.method194(this.field442, 0, var90, var91) - var84, field329 + var87, -196, var85, var83, var88, var91, var89, field329 + var86, this.field442);
                var94.method576(this.method194(this.field442, 0, var92, var93) - var85, var92, var93, 301, field329 + var86);
                this.field466.method582(var94);
            }
        } else {
            if (arg0 == 192) {
                int var95 = arg1.method44();
                int var96 = (var95 >> 4 & 7) + this.field495;
                int var97 = (var95 & 7) + this.field496;
                int var98 = arg1.method46();
                int var99 = arg1.method44();
                int var100 = var99 >> 4 & 15;
                int var101 = var99 & 7;
                if (field557.field1567[0] >= var96 - var100 && field557.field1567[0] <= var96 + var100 && field557.field1568[0] >= var97 - var100 && field557.field1568[0] <= var97 + var100 && this.field595 && !field275 && this.field303 < 50) {
                    this.field554[this.field303] = var98;
                    this.field476[this.field303] = var101;
                    this.field185[this.field303] = class51.field1315[var98];
                    ++this.field303;
                }
            }
            if (arg0 == 182) {
                int var102 = arg1.method64(-768);
                int var103 = var102 >> 2;
                int var104 = var102 & 3;
                int var105 = this.field357[var103];
                int var106 = arg1.method44();
                int var107 = (var106 >> 4 & 7) + this.field495;
                int var108 = (var106 & 7) + this.field496;
                if (var107 >= 0 && var108 >= 0 && var107 < 104 && var108 < 104) {
                    this.method167(-1, 0, 0, var105, this.field442, var108, var107, var104, -1, var103);
                }
            } else if (arg0 == 241) {
                int var109 = arg1.method62(false);
                int var110 = (var109 >> 4 & 7) + this.field495;
                int var111 = (var109 & 7) + this.field496;
                int var112 = arg1.method46();
                int var113 = arg1.method72(3);
                if (var110 >= 0 && var111 >= 0 && var110 < 104 && var111 < 104) {
                    class56 var114 = new class56();
                    var114.field1400 = var112;
                    var114.field1399 = var113;
                    if (this.field398[this.field442][var110][var111] == null) {
                        this.field398[this.field442][var110][var111] = new class69((byte) 7);
                    }
                    this.field398[this.field442][var110][var111].method582(var114);
                    this.method209(var110, var111);
                }
            } else if (arg0 == 76) {
                int var115 = arg1.method44();
                int var116 = (var115 >> 4 & 7) + this.field495;
                int var117 = (var115 & 7) + this.field496;
                int var118 = arg1.method46();
                int var119 = arg1.method46();
                int var120 = arg1.method46();
                if (var116 >= 0 && var117 >= 0 && var116 < 104 && var117 < 104) {
                    class69 var121 = this.field398[this.field442][var116][var117];
                    if (var121 != null) {
                        for (class56 var122 = (class56) var121.method585(); var122 != null; var122 = (class56) var121.method587(0)) {
                            if ((var118 & 32767) == var122.field1400 && var122.field1399 == var119) {
                                var122.field1399 = var120;
                                break;
                            }
                        }
                        this.method209(var116, var117);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "h", descriptor = "(B)V")
    public final void method140(byte arg0) {
        this.field510 = true;
        if (arg0 == -12) {
            try {
                long var2 = System.currentTimeMillis();
                int var4 = 0;
                int var5 = 20;
                while (this.field367) {
                    ++this.field168;
                    this.method191(330);
                    this.method191(330);
                    this.method88(this.field602);
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
            this.field510 = false;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZILCKBTFRZM;)V")
    private final void method141(boolean arg0, int arg1, class5 arg2) {
        arg2.method54(12265);
        int var4 = arg2.method55(this.field200, 8);
        if (var4 < this.field248) {
            for (int var5 = var4; var5 < this.field248; ++var5) {
                this.field354[this.field353++] = this.field249[var5];
            }
        }
        if (var4 > this.field248) {
            signlink.reporterror(this.field136 + " Too many npcs");
            throw new RuntimeException("eek");
        } else {
            this.field248 = 0;
            for (int var6 = 0; var6 < var4; ++var6) {
                int var7 = this.field249[var6];
                class55 var8 = this.field247[var7];
                int var9 = arg2.method55(this.field200, 1);
                if (var9 == 0) {
                    this.field249[this.field248++] = var7;
                    var8.field1551 = field329;
                } else {
                    int var10 = arg2.method55(this.field200, 2);
                    if (var10 == 0) {
                        this.field249[this.field248++] = var7;
                        var8.field1551 = field329;
                        this.field224[this.field223++] = var7;
                    } else if (var10 == 1) {
                        this.field249[this.field248++] = var7;
                        var8.field1551 = field329;
                        int var11 = arg2.method55(this.field200, 3);
                        var8.method561(false, this.field420, var11);
                        int var12 = arg2.method55(this.field200, 1);
                        if (var12 == 1) {
                            this.field224[this.field223++] = var7;
                        }
                    } else if (var10 == 2) {
                        this.field249[this.field248++] = var7;
                        var8.field1551 = field329;
                        int var13 = arg2.method55(this.field200, 3);
                        var8.method561(true, this.field420, var13);
                        int var14 = arg2.method55(this.field200, 3);
                        var8.method561(true, this.field420, var14);
                        int var15 = arg2.method55(this.field200, 1);
                        if (var15 == 1) {
                            this.field224[this.field223++] = var7;
                        }
                    } else if (var10 == 3) {
                        this.field354[this.field353++] = var7;
                    }
                }
            }
            if (!arg0) {
                this.method197();
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IILBXXPAJNW;II)V")
    public final void method142(int arg0, int arg1, class4 arg2, int arg3, int arg4) {
        if (this.field315 < 400) {
            if (arg2.field82 != null) {
                arg2 = arg2.method27(-20711);
            }
            if (arg2 != null) {
                String var6 = arg2.field97;
                if (arg1 < this.field471 || arg1 > this.field471) {
                    this.field542 = !this.field542;
                }
                if (arg2.field80 != 0) {
                    var6 = var6 + method223(-128, field557.field962, arg2.field80) + " (level-" + arg2.field80 + ")";
                }
                if (this.field287 == 1) {
                    this.field349[this.field315] = "Use " + this.field291 + " with @yel@" + var6;
                    this.field213[this.field315] = 186;
                    this.field214[this.field315] = arg3;
                    this.field211[this.field315] = arg4;
                    this.field212[this.field315] = arg0;
                    ++this.field315;
                } else {
                    if (this.field570 == 1) {
                        if ((this.field572 & 2) == 2) {
                            this.field349[this.field315] = this.field573 + " @yel@" + var6;
                            this.field213[this.field315] = 743;
                            this.field214[this.field315] = arg3;
                            this.field211[this.field315] = arg4;
                            this.field212[this.field315] = arg0;
                            ++this.field315;
                            return;
                        }
                    } else {
                        if (arg2.field69 != null) {
                            for (int var7 = 4; var7 >= 0; --var7) {
                                if (arg2.field69[var7] != null && !arg2.field69[var7].equalsIgnoreCase("attack")) {
                                    this.field349[this.field315] = arg2.field69[var7] + " @yel@" + var6;
                                    if (var7 == 0) {
                                        this.field213[this.field315] = 781;
                                    }
                                    if (var7 == 1) {
                                        this.field213[this.field315] = 860;
                                    }
                                    if (var7 == 2) {
                                        this.field213[this.field315] = 161;
                                    }
                                    if (var7 == 3) {
                                        this.field213[this.field315] = 22;
                                    }
                                    if (var7 == 4) {
                                        this.field213[this.field315] = 736;
                                    }
                                    this.field214[this.field315] = arg3;
                                    this.field211[this.field315] = arg4;
                                    this.field212[this.field315] = arg0;
                                    ++this.field315;
                                }
                            }
                        }
                        if (arg2.field69 != null) {
                            for (int var8 = 4; var8 >= 0; --var8) {
                                if (arg2.field69[var8] != null && arg2.field69[var8].equalsIgnoreCase("attack")) {
                                    short var9 = 0;
                                    if (arg2.field80 > field557.field962) {
                                        var9 = 2000;
                                    }
                                    this.field349[this.field315] = arg2.field69[var8] + " @yel@" + var6;
                                    if (var8 == 0) {
                                        this.field213[this.field315] = var9 + 781;
                                    }
                                    if (var8 == 1) {
                                        this.field213[this.field315] = var9 + 860;
                                    }
                                    if (var8 == 2) {
                                        this.field213[this.field315] = var9 + 161;
                                    }
                                    if (var8 == 3) {
                                        this.field213[this.field315] = var9 + 22;
                                    }
                                    if (var8 == 4) {
                                        this.field213[this.field315] = var9 + 736;
                                    }
                                    this.field214[this.field315] = arg3;
                                    this.field211[this.field315] = arg4;
                                    this.field212[this.field315] = arg0;
                                    ++this.field315;
                                }
                            }
                        }
                        this.field349[this.field315] = "Examine @yel@" + var6;
                        this.field213[this.field315] = 1072;
                        this.field214[this.field315] = arg3;
                        this.field211[this.field315] = arg4;
                        this.field212[this.field315] = arg0;
                        ++this.field315;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "j", descriptor = "(Z)V")
    public final void method143(boolean arg0) {
        if (this.field240 > 1) {
            --this.field240;
        }
        if (this.field199 > 0) {
            --this.field199;
        }
        for (int var2 = 0; var2 < 5 && this.method152(-172); ++var2) {
        }
        if (this.field512) {
            Object var3 = this.field383.field1406;
            synchronized (this.field383.field1406) {
                if (!field445) {
                    this.field383.field1404 = 0;
                } else if (super.field1114 != 0 || this.field383.field1404 >= 40) {
                    this.field608.method33((byte) 57, 129);
                    this.field608.method34(0);
                    int var4 = this.field608.field123;
                    int var5 = 0;
                    for (int var6 = 0; var6 < this.field383.field1404 && var4 - this.field608.field123 < 240; ++var6) {
                        ++var5;
                        int var7 = this.field383.field1405[var6];
                        if (var7 < 0) {
                            var7 = 0;
                        } else if (var7 > 502) {
                            var7 = 502;
                        }
                        int var8 = this.field383.field1403[var6];
                        if (var8 < 0) {
                            var8 = 0;
                        } else if (var8 > 764) {
                            var8 = 764;
                        }
                        int var9 = var7 * 765 + var8;
                        if (this.field383.field1405[var6] == -1 && this.field383.field1403[var6] == -1) {
                            var8 = -1;
                            var7 = -1;
                            var9 = 524287;
                        }
                        if (this.field175 == var8 && this.field176 == var7) {
                            if (this.field441 < 2047) {
                                ++this.field441;
                            }
                        } else {
                            int var10 = var8 - this.field175;
                            this.field175 = var8;
                            int var11 = var7 - this.field176;
                            this.field176 = var7;
                            if (this.field441 < 8 && var10 >= -32 && var10 <= 31 && var11 >= -32 && var11 <= 31) {
                                var10 += 32;
                                var11 += 32;
                                this.field608.method35((this.field441 << 12) + (var10 << 6) + var11);
                                this.field441 = 0;
                            } else if (this.field441 < 8) {
                                this.field608.method37((this.field441 << 19) + 8388608 + var9);
                                this.field441 = 0;
                            } else {
                                this.field608.method38((this.field441 << 19) + -1073741824 + var9);
                                this.field441 = 0;
                            }
                        }
                    }
                    this.field608.method43(0, this.field608.field123 - var4);
                    if (var5 >= this.field383.field1404) {
                        this.field383.field1404 = 0;
                    } else {
                        this.field383.field1404 -= var5;
                        for (int var12 = 0; var12 < this.field383.field1404; ++var12) {
                            this.field383.field1403[var12] = this.field383.field1403[var5 + var12];
                            this.field383.field1405[var12] = this.field383.field1405[var5 + var12];
                        }
                    }
                }
            }
            if (super.field1114 != 0) {
                long var13 = (super.field1117 - this.field359) / 50L;
                if (var13 > 4095L) {
                    var13 = 4095L;
                }
                this.field359 = super.field1117;
                int var15 = super.field1116;
                if (var15 < 0) {
                    var15 = 0;
                } else if (var15 > 502) {
                    var15 = 502;
                }
                int var16 = super.field1115;
                if (var16 < 0) {
                    var16 = 0;
                } else if (var16 > 764) {
                    var16 = 764;
                }
                int var17 = var15 * 765 + var16;
                byte var18 = 0;
                if (super.field1114 == 2) {
                    var18 = 1;
                }
                int var19 = (int) var13;
                this.field608.method33((byte) 57, 57);
                this.field608.method77(-319, (var18 << 19) + (var19 << 20) + var17);
            }
            if (this.field462 > 0) {
                --this.field462;
            }
            if (super.field1118[1] == 1 || super.field1118[2] == 1 || super.field1118[3] == 1 || super.field1118[4] == 1) {
                this.field463 = true;
            }
            if (this.field463 && this.field462 <= 0) {
                this.field462 = 20;
                this.field463 = false;
                this.field608.method33((byte) 57, 187);
                this.field608.method68(this.field379, (byte) -125);
                this.field608.method69(this.field380, (byte) 0);
            }
            if (super.field1105 && !this.field430) {
                this.field430 = true;
                this.field608.method33((byte) 57, 186);
                this.field608.method34(1);
            }
            if (!super.field1105 && this.field430) {
                this.field430 = false;
                this.field608.method33((byte) 57, 186);
                this.field608.method34(0);
            }
            this.method207(false);
            this.method153(this.field409);
            this.method121(false);
            ++this.field197;
            if (this.field197 > 750) {
                this.method92(false);
            }
            this.method96(642);
            this.method155(-881);
            this.method178((byte) 0);
            ++this.field459;
            if (this.field552 != 0) {
                this.field551 += 20;
                if (this.field551 >= 400) {
                    this.field552 = 0;
                }
            }
            if (this.field402 != 0) {
                ++this.field399;
                if (this.field399 >= 15) {
                    if (this.field402 == 2) {
                        this.field433 = true;
                    }
                    if (this.field402 == 3) {
                        this.field578 = true;
                    }
                    this.field402 = 0;
                }
            }
            if (this.field426 != 0) {
                ++this.field210;
                if (super.field1108 > this.field427 + 5 || super.field1108 < this.field427 - 5 || super.field1109 > this.field428 + 5 || super.field1109 < this.field428 - 5) {
                    this.field295 = true;
                }
                if (super.field1107 == 0) {
                    if (this.field426 == 2) {
                        this.field433 = true;
                    }
                    if (this.field426 == 3) {
                        this.field578 = true;
                    }
                    this.field426 = 0;
                    if (this.field295 && this.field210 >= 5) {
                        this.field440 = -1;
                        this.method85(0);
                        if (this.field440 == this.field424 && this.field439 != this.field425) {
                            class15 var20 = class15.field806[this.field424];
                            byte var21 = 0;
                            if (this.field296 == 1 && var20.field804 == 206) {
                                var21 = 1;
                            }
                            if (var20.field814[this.field439] <= 0) {
                                var21 = 0;
                            }
                            if (var20.field826) {
                                int var22 = this.field425;
                                int var23 = this.field439;
                                var20.field814[var23] = var20.field814[var22];
                                var20.field811[var23] = var20.field811[var22];
                                var20.field814[var22] = -1;
                                var20.field811[var22] = 0;
                            } else if (var21 == 1) {
                                int var24 = this.field425;
                                int var25 = this.field439;
                                while (var24 != var25) {
                                    if (var24 > var25) {
                                        var20.method288(var24, (byte) 7, var24 - 1);
                                        --var24;
                                    } else if (var24 < var25) {
                                        var20.method288(var24, (byte) 7, var24 + 1);
                                        ++var24;
                                    }
                                }
                            } else {
                                var20.method288(this.field425, (byte) 7, this.field439);
                            }
                            this.field608.method33((byte) 57, 170);
                            this.field608.method68(this.field439, (byte) -125);
                            this.field608.method69(this.field424, (byte) 0);
                            this.field608.method34(var21);
                            this.field608.method35(this.field425);
                        }
                    } else if ((this.field612 == 1 || this.method182(true, this.field315 - 1)) && this.field315 > 2) {
                        this.method150((byte) 2);
                    } else if (this.field315 > 0) {
                        this.method118(this.field315 - 1, -46295);
                    }
                    this.field399 = 10;
                    super.field1114 = 0;
                }
            }
            ++field536;
            if (field536 > 132) {
                field536 = 0;
                this.field608.method33((byte) 57, 11);
                this.field608.method38(0);
            }
            if (class59.field1478 != -1) {
                int var26 = class59.field1478;
                int var27 = class59.field1479;
                boolean var28 = this.method180(0, 0, (byte) -3, 0, var27, 0, field557.field1568[0], field557.field1567[0], true, 0, 0, var26);
                class59.field1478 = -1;
                if (var28) {
                    this.field549 = super.field1115;
                    this.field550 = super.field1116;
                    this.field552 = 1;
                    this.field551 = 0;
                }
            }
            if (super.field1114 == 1 && this.field438 != null) {
                this.field438 = null;
                this.field578 = true;
                super.field1114 = 0;
            }
            this.method84(-343);
            this.method205((byte) 6);
            this.method224(false);
            this.method133(-272);
            if (super.field1107 == 1 || super.field1114 == 1) {
                ++this.field292;
            }
            if (this.field443 == 2) {
                this.method184((byte) 3);
            }
            if (this.field443 == 2 && this.field271) {
                this.method172(true);
            }
            for (int var29 = 0; var29 < 5; ++var29) {
                int var10002 = this.field327[var29]++;
            }
            this.method222(false);
            ++super.field1106;
            if (super.field1106 > 4500) {
                this.field199 = 250;
                super.field1106 -= 500;
                this.field608.method33((byte) 57, 153);
            }
            ++this.field337;
            if (!arg0) {
                this.field398 = null;
            }
            if (this.field337 > 500) {
                this.field337 = 0;
                int var30 = (int) (Math.random() * 8.0D);
                if ((var30 & 1) == 1) {
                    this.field372 += this.field373;
                }
                if ((var30 & 2) == 2) {
                    this.field206 += this.field207;
                }
                if ((var30 & 4) == 4) {
                    this.field576 += this.field577;
                }
            }
            if (this.field372 < -50) {
                this.field373 = 2;
            }
            if (this.field372 > 50) {
                this.field373 = -2;
            }
            if (this.field206 < -55) {
                this.field207 = 2;
            }
            if (this.field206 > 55) {
                this.field207 = -2;
            }
            if (this.field576 < -40) {
                this.field577 = 1;
            }
            if (this.field576 > 40) {
                this.field577 = -1;
            }
            ++this.field513;
            if (this.field513 > 500) {
                this.field513 = 0;
                int var31 = (int) (Math.random() * 8.0D);
                if ((var31 & 1) == 1) {
                    this.field365 += this.field366;
                }
                if ((var31 & 2) == 2) {
                    this.field574 += this.field575;
                }
            }
            if (this.field365 < -60) {
                this.field366 = 2;
            }
            if (this.field365 > 60) {
                this.field366 = -2;
            }
            if (this.field574 < -20) {
                this.field575 = 1;
            }
            if (this.field574 > 10) {
                this.field575 = -1;
            }
            ++this.field198;
            if (this.field198 > 50) {
                this.field608.method33((byte) 57, 107);
            }
            try {
                if (this.field305 != null && this.field608.field123 > 0) {
                    this.field305.method233(230, this.field608.field122, this.field608.field123, 0);
                    this.field608.field123 = 0;
                    this.field198 = 0;
                }
            } catch (IOException var33) {
                this.method92(false);
            } catch (Exception var34) {
                this.method99(false);
            }
        }
    }

    @OriginalMember(owner = "client", name = "q", descriptor = "(I)V")
    public final void method144(int arg0) {
        if (arg0 <= 0) {
            this.field608.method34(126);
        }
        this.field236.method289(true);
        class10.field675 = this.field241;
        this.field302.method442(0, 0, false);
        if (this.field589) {
            this.field162.method464(40, 0, 0, 239, this.field393);
            this.field162.method464(60, 128, 0, 239, this.field518 + "*");
        } else if (this.field477 == 1) {
            this.field162.method464(40, 0, 0, 239, "Enter amount:");
            this.field162.method464(60, 128, 0, 239, this.field606 + "*");
        } else if (this.field477 == 2) {
            this.field162.method464(40, 0, 0, 239, "Enter name:");
            this.field162.method464(60, 128, 0, 239, this.field606 + "*");
        } else if (this.field438 != null) {
            this.field162.method464(40, 0, 0, 239, this.field438);
            this.field162.method464(60, 128, 0, 239, "Click to continue");
        } else if (this.field472 != -1) {
            this.method215(438, 0, class15.field806[this.field472], 0, 0);
        } else if (this.field432 != -1) {
            this.method215(438, 0, class15.field806[this.field432], 0, 0);
        } else {
            class48 var2 = this.field161;
            int var3 = 0;
            class35.method414(0, 463, true, 0, 77);
            for (int var4 = 0; var4 < 100; ++var4) {
                if (this.field362[var4] != null) {
                    int var6 = this.field360[var4];
                    int var7 = 70 - var3 * 14 + this.field157;
                    String var8 = this.field361[var4];
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
                            var2.method468(this.field362[var4], var7, 0, 4, (byte) -126);
                        }
                        ++var3;
                    }
                    if ((var6 == 1 || var6 == 2) && (var6 == 1 || this.field540 == 0 || this.field540 == 1 && this.method219(var8, (byte) 1))) {
                        if (var7 > 0 && var7 < 110) {
                            int var10 = 4;
                            if (var9 == 1) {
                                this.field467[0].method442(var7 - 12, var10, false);
                                var10 += 14;
                            }
                            if (var9 == 2) {
                                this.field467[1].method442(var7 - 12, var10, false);
                                var10 += 14;
                            }
                            var2.method468(var8 + ":", var7, 0, var10, (byte) -126);
                            int var11 = var10 + var2.method466(var8, false) + 8;
                            var2.method468(this.field362[var4], var7, 255, var11, (byte) -126);
                        }
                        ++var3;
                    }
                    if ((var6 == 3 || var6 == 7) && this.field307 == 0 && (var6 == 7 || this.field347 == 0 || this.field347 == 1 && this.method219(var8, (byte) 1))) {
                        if (var7 > 0 && var7 < 110) {
                            byte var12 = 4;
                            var2.method468("From", var7, 0, var12, (byte) -126);
                            int var13 = var12 + var2.method466("From ", false);
                            if (var9 == 1) {
                                this.field467[0].method442(var7 - 12, var13, false);
                                var13 += 14;
                            }
                            if (var9 == 2) {
                                this.field467[1].method442(var7 - 12, var13, false);
                                var13 += 14;
                            }
                            var2.method468(var8 + ":", var7, 0, var13, (byte) -126);
                            int var14 = var13 + var2.method466(var8, false) + 8;
                            var2.method468(this.field362[var4], var7, 8388608, var14, (byte) -126);
                        }
                        ++var3;
                    }
                    if (var6 == 4 && (this.field417 == 0 || this.field417 == 1 && this.method219(var8, (byte) 1))) {
                        if (var7 > 0 && var7 < 110) {
                            var2.method468(var8 + " " + this.field362[var4], var7, 8388736, 4, (byte) -126);
                        }
                        ++var3;
                    }
                    if (var6 == 5 && this.field307 == 0 && this.field347 < 2) {
                        if (var7 > 0 && var7 < 110) {
                            var2.method468(this.field362[var4], var7, 8388608, 4, (byte) -126);
                        }
                        ++var3;
                    }
                    if (var6 == 6 && this.field307 == 0 && this.field347 < 2) {
                        if (var7 > 0 && var7 < 110) {
                            var2.method468("To " + var8 + ":", var7, 0, 4, (byte) -126);
                            var2.method468(this.field362[var4], var7, 8388608, 12 + var2.method466("To " + var8, false), (byte) -126);
                        }
                        ++var3;
                    }
                    if (var6 == 8 && (this.field417 == 0 || this.field417 == 1 && this.method219(var8, (byte) 1))) {
                        if (var7 > 0 && var7 < 110) {
                            var2.method468(var8 + " " + this.field362[var4], var7, 8270336, 4, (byte) -126);
                        }
                        ++var3;
                    }
                }
            }
            class35.method413((byte) 6);
            this.field255 = var3 * 14 + 7;
            if (this.field255 < 78) {
                this.field255 = 78;
            }
            this.method89(463, 0, 77, 0, this.field255 - this.field157 - 77, this.field255);
            String var5;
            if (field557 != null && field557.field973 != null) {
                var5 = field557.field973;
            } else {
                var5 = class31.method392(this.field136, false);
            }
            var2.method468(var5 + ":", 90, 0, 4, (byte) -126);
            var2.method468(this.field156 + "*", 90, 255, 6 + var2.method466(var5 + ": ", false), (byte) -126);
            class35.method420(0, 77, this.field344, 0, 479);
        }
        if (this.field342 && this.field451 == 2) {
            this.method97(-112);
        }
        this.field236.method290(1, 357, 17, super.field1100);
        this.field235.method289(true);
        class10.field675 = this.field243;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BJ)V")
    public final void method145(byte arg0, long arg1) {
        if (arg1 != 0L) {
            if (this.field435 >= 100 && this.field177 != 1) {
                this.method181("", -979, "Your friendlist is full. Max of 100 for free users, and 200 for members", 0);
            } else if (this.field435 >= 200) {
                this.method181("", -979, "Your friendlist is full. Max of 100 for free users, and 200 for members", 0);
            } else {
                String var4 = class31.method392(class31.method389((byte) -71, arg1), false);
                for (int var5 = 0; var5 < this.field435; ++var5) {
                    if (this.field524[var5] == arg1) {
                        this.method181("", -979, var4 + " is already on your friend list", 0);
                        return;
                    }
                }
                for (int var6 = 0; var6 < this.field475; ++var6) {
                    if (this.field516[var6] == arg1) {
                        this.method181("", -979, "Please remove " + var4 + " from your ignore list first", 0);
                        return;
                    }
                }
                if (!var4.equals(field557.field973)) {
                    this.field336[this.field435] = var4;
                    this.field524[this.field435] = arg1;
                    this.field507[this.field435] = 0;
                    ++this.field435;
                    this.field433 = true;
                    this.field608.method33((byte) 57, 122);
                    if (arg0 != 31) {
                        this.field344 = this.field413.method479();
                    }
                    this.field608.method40(0, arg1);
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(JZ)V")
    public final void method146(long arg0, boolean arg1) {
        if (arg1) {
            if (arg0 != 0L) {
                for (int var4 = 0; var4 < this.field475; ++var4) {
                    if (this.field516[var4] == arg0) {
                        --this.field475;
                        this.field433 = true;
                        for (int var5 = var4; var5 < this.field475; ++var5) {
                            this.field516[var5] = this.field516[var5 + 1];
                        }
                        this.field608.method33((byte) 57, 180);
                        this.field608.method40(0, arg0);
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "k", descriptor = "(Z)V")
    public final void method147(boolean arg0) {
        int var2 = 5;
        this.field600[8] = 0;
        int var3 = 0;
        this.field512 &= arg0;
        while (this.field600[8] == 0) {
            String var4 = "Unknown problem";
            this.method200("Connecting to web server", 20, 5);
            try {
                DataInputStream var5 = this.method199("crc" + (int) (Math.random() * 9.9999999E7D) + "-" + 309);
                class5 var6 = new class5(2, new byte[40]);
                var5.readFully(var6.field122, 0, 40);
                var5.close();
                for (int var7 = 0; var7 < 9; ++var7) {
                    this.field600[var7] = var6.method49();
                }
                int var8 = var6.method49();
                int var9 = 1234;
                for (int var10 = 0; var10 < 9; ++var10) {
                    var9 = (var9 << 1) + this.field600[var10];
                }
                if (var8 != var9) {
                    var4 = "checksum problem";
                    this.field600[8] = 0;
                }
            } catch (EOFException var13) {
                var4 = "EOF problem";
                this.field600[8] = 0;
            } catch (IOException var14) {
                var4 = "connection problem";
                this.field600[8] = 0;
            } catch (Exception var15) {
                var4 = "logic problem";
                this.field600[8] = 0;
                if (!signlink.reporterror) {
                    return;
                }
            }
            if (this.field600[8] == 0) {
                ++var3;
                for (int var11 = var2; var11 > 0; --var11) {
                    if (var3 >= 10) {
                        this.method200("Game updated - please reload page", 10, 5);
                        var11 = 10;
                    } else {
                        this.method200(var4 + " - Will retry in " + var11 + " secs.", 10, 5);
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
                this.field502 = !this.field502;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIZI)V")
    public final void method148(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        int var7 = this.field403.method533(arg1, arg0, arg5);
        if (var7 != 0) {
            int var8 = this.field403.method537(arg1, arg0, arg5, var7);
            int var9 = var8 >> 6 & 3;
            int var10 = var8 & 31;
            int var11 = arg2;
            if (var7 > 0) {
                var11 = arg3;
            }
            int[] var12 = this.field334.field1173;
            int var13 = (103 - arg5) * 512 * 4 + arg0 * 4 + 24624;
            int var14 = var7 >> 14 & 32767;
            class64 var15 = class64.method568(var14);
            if (var15.field1605 != -1) {
                class38 var16 = this.field304[var15.field1605];
                if (var16 != null) {
                    int var17 = (var15.field1647 * 4 - var16.field1186) / 2;
                    int var18 = (var15.field1617 * 4 - var16.field1187) / 2;
                    var16.method442((104 - arg5 - var15.field1617) * 4 + 48 + var18, arg0 * 4 + 48 + var17, false);
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
        int var19 = this.field403.method535(arg1, arg0, arg5);
        if (var19 != 0) {
            int var20 = this.field403.method537(arg1, arg0, arg5, var19);
            int var21 = var20 >> 6 & 3;
            int var22 = var20 & 31;
            int var23 = var19 >> 14 & 32767;
            class64 var24 = class64.method568(var23);
            if (var24.field1605 != -1) {
                class38 var25 = this.field304[var24.field1605];
                if (var25 != null) {
                    int var26 = (var24.field1647 * 4 - var25.field1186) / 2;
                    int var27 = (var24.field1617 * 4 - var25.field1187) / 2;
                    var25.method442((104 - arg5 - var24.field1617) * 4 + 48 + var27, arg0 * 4 + 48 + var26, false);
                }
            } else if (var22 == 9) {
                int var28 = 15658734;
                if (var19 > 0) {
                    var28 = 15597568;
                }
                int[] var29 = this.field334.field1173;
                int var30 = (103 - arg5) * 512 * 4 + arg0 * 4 + 24624;
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
        int var31 = this.field403.method536(arg1, arg0, arg5);
        if (!arg4) {
            if (var31 != 0) {
                int var32 = var31 >> 14 & 32767;
                class64 var33 = class64.method568(var32);
                if (var33.field1605 != -1) {
                    class38 var34 = this.field304[var33.field1605];
                    if (var34 != null) {
                        int var35 = (var33.field1647 * 4 - var34.field1186) / 2;
                        int var36 = (var33.field1617 * 4 - var34.field1187) / 2;
                        var34.method442((104 - arg5 - var33.field1617) * 4 + 48 + var36, arg0 * 4 + 48 + var35, false);
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LCKBTFRZM;IB)V")
    private final void method149(class5 arg0, int arg1, byte arg2) {
        int var4 = arg0.method55(this.field200, 8);
        if (var4 < this.field221) {
            for (int var5 = var4; var5 < this.field221; ++var5) {
                this.field354[this.field353++] = this.field222[var5];
            }
        }
        if (var4 > this.field221) {
            signlink.reporterror(this.field136 + " Too many players");
            throw new RuntimeException("eek");
        } else {
            this.field221 = 0;
            if (arg2 == 3) {
                boolean var6 = false;
            } else {
                this.method197();
            }
            for (int var7 = 0; var7 < var4; ++var7) {
                int var8 = this.field222[var7];
                class22 var9 = this.field220[var8];
                int var10 = arg0.method55(this.field200, 1);
                if (var10 == 0) {
                    this.field222[this.field221++] = var8;
                    var9.field1551 = field329;
                } else {
                    int var11 = arg0.method55(this.field200, 2);
                    if (var11 == 0) {
                        this.field222[this.field221++] = var8;
                        var9.field1551 = field329;
                        this.field224[this.field223++] = var8;
                    } else if (var11 == 1) {
                        this.field222[this.field221++] = var8;
                        var9.field1551 = field329;
                        int var12 = arg0.method55(this.field200, 3);
                        var9.method561(false, this.field420, var12);
                        int var13 = arg0.method55(this.field200, 1);
                        if (var13 == 1) {
                            this.field224[this.field223++] = var8;
                        }
                    } else if (var11 == 2) {
                        this.field222[this.field221++] = var8;
                        var9.field1551 = field329;
                        int var14 = arg0.method55(this.field200, 3);
                        var9.method561(true, this.field420, var14);
                        int var15 = arg0.method55(this.field200, 3);
                        var9.method561(true, this.field420, var15);
                        int var16 = arg0.method55(this.field200, 1);
                        if (var16 == 1) {
                            this.field224[this.field223++] = var8;
                        }
                    } else if (var11 == 3) {
                        this.field354[this.field353++] = var8;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "i", descriptor = "(B)V")
    public final void method150(byte arg0) {
        int var2 = this.field162.method466("Choose Option", false);
        for (int var3 = 0; var3 < this.field315; ++var3) {
            int var11 = this.field162.method466(this.field349[var3], false);
            if (var11 > var2) {
                var2 = var11;
            }
        }
        if (this.field311 != arg0) {
            this.method197();
        }
        var2 += 8;
        int var4 = this.field315 * 15 + 21;
        if (super.field1115 > 4 && super.field1116 > 4 && super.field1115 < 516 && super.field1116 < 338) {
            int var5 = super.field1115 - 4 - var2 / 2;
            if (var2 + var5 > 512) {
                var5 = 512 - var2;
            }
            if (var5 < 0) {
                var5 = 0;
            }
            int var6 = super.field1116 - 4;
            if (var4 + var6 > 334) {
                var6 = 334 - var4;
            }
            if (var6 < 0) {
                var6 = 0;
            }
            this.field342 = true;
            this.field451 = 0;
            this.field452 = var5;
            this.field453 = var6;
            this.field454 = var2;
            this.field455 = this.field315 * 15 + 22;
        }
        if (super.field1115 > 553 && super.field1116 > 205 && super.field1115 < 743 && super.field1116 < 466) {
            int var7 = super.field1115 - 553 - var2 / 2;
            if (var7 < 0) {
                var7 = 0;
            } else if (var2 + var7 > 190) {
                var7 = 190 - var2;
            }
            int var8 = super.field1116 - 205;
            if (var8 < 0) {
                var8 = 0;
            } else if (var4 + var8 > 261) {
                var8 = 261 - var4;
            }
            this.field342 = true;
            this.field451 = 1;
            this.field452 = var7;
            this.field453 = var8;
            this.field454 = var2;
            this.field455 = this.field315 * 15 + 22;
        }
        if (super.field1115 > 17 && super.field1116 > 357 && super.field1115 < 496 && super.field1116 < 453) {
            int var9 = super.field1115 - 17 - var2 / 2;
            if (var9 < 0) {
                var9 = 0;
            } else if (var2 + var9 > 479) {
                var9 = 479 - var2;
            }
            int var10 = super.field1116 - 357;
            if (var10 < 0) {
                var10 = 0;
            } else if (var4 + var10 > 96) {
                var10 = 96 - var4;
            }
            this.field342 = true;
            this.field451 = 2;
            this.field452 = var9;
            this.field453 = var10;
            this.field454 = var2;
            this.field455 = this.field315 * 15 + 22;
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(BI)Ljava/lang/String;")
    private static final String method151(byte arg0, int arg1) {
        if (field553 == arg0) {
            boolean var2 = false;
        } else {
            field408 = 305;
        }
        String var3 = String.valueOf(arg1);
        for (int var4 = var3.length() - 3; var4 > 0; var4 -= 3) {
            var3 = var3.substring(0, var4) + "," + var3.substring(var4);
        }
        if (var3.length() > 8) {
            var3 = "@gre@" + var3.substring(0, var3.length() - 8) + " million @whi@(" + var3 + ")";
        } else if (var3.length() > 4) {
            var3 = "@cya@" + var3.substring(0, var3.length() - 4) + "K @whi@(" + var3 + ")";
        }
        return " " + var3;
    }

    @OriginalMember(owner = "client", name = "r", descriptor = "(I)Z")
    public final boolean method152(int arg0) {
        while (arg0 >= 0) {
            this.field196 = -1;
        }
        if (this.field305 == null) {
            return false;
        } else {
            try {
                int var2 = this.field305.method231();
                if (var2 == 0) {
                    return false;
                }
                if (this.field196 == -1) {
                    this.field305.method232(this.field299.field122, 0, 1);
                    this.field196 = this.field299.field122[0] & 255;
                    if (this.field413 != null) {
                        this.field196 = this.field196 - this.field413.method479() & 255;
                    }
                    this.field195 = class7.field634[this.field196];
                    --var2;
                }
                if (this.field195 == -1) {
                    if (var2 <= 0) {
                        return false;
                    }
                    this.field305.method232(this.field299.field122, 0, 1);
                    this.field195 = this.field299.field122[0] & 255;
                    --var2;
                }
                if (this.field195 == -2) {
                    if (var2 <= 1) {
                        return false;
                    }
                    this.field305.method232(this.field299.field122, 0, 2);
                    this.field299.field123 = 0;
                    this.field195 = this.field299.method46();
                    var2 -= 2;
                }
                if (var2 < this.field195) {
                    return false;
                }
                this.field299.field123 = 0;
                this.field305.method232(this.field299.field122, 0, this.field195);
                this.field197 = 0;
                this.field567 = this.field566;
                this.field566 = this.field565;
                this.field565 = this.field196;
                if (this.field196 == 116) {
                    this.field332 = 0;
                    this.field196 = -1;
                    return true;
                }
                if (this.field196 == 31) {
                    int var3 = this.field299.method71(0);
                    int var4 = this.field299.method49();
                    this.field529[var3] = var4;
                    if (this.field395[var3] != var4) {
                        this.field395[var3] = var4;
                        this.method111(var3, 276);
                        this.field433 = true;
                        if (this.field432 != -1) {
                            this.field578 = true;
                        }
                    }
                    this.field196 = -1;
                    return true;
                }
                if (this.field196 == 106) {
                    if (this.field474 != -1) {
                        this.field474 = -1;
                        this.field433 = true;
                        this.field509 = true;
                    }
                    if (this.field472 != -1) {
                        this.field472 = -1;
                        this.field578 = true;
                    }
                    if (this.field477 != 0) {
                        this.field477 = 0;
                        this.field578 = true;
                    }
                    this.field268 = -1;
                    this.field226 = false;
                    this.field196 = -1;
                    return true;
                }
                if (this.field196 == 96) {
                    int var5 = this.field299.method72(3);
                    int var6 = this.field299.method46();
                    int var7 = this.field299.method46();
                    int var8 = this.field299.method46();
                    class15.field806[var6].field783 = var8;
                    class15.field806[var6].field784 = var7;
                    class15.field806[var6].field782 = var5;
                    this.field196 = -1;
                    return true;
                }
                if (this.field196 == 126) {
                    int var9 = this.field299.method73(this.field532);
                    this.method185(true, var9);
                    if (this.field472 != -1) {
                        this.field472 = -1;
                        this.field578 = true;
                    }
                    if (this.field477 != 0) {
                        this.field477 = 0;
                        this.field578 = true;
                    }
                    this.field474 = var9;
                    this.field433 = true;
                    this.field509 = true;
                    this.field268 = -1;
                    this.field226 = false;
                    this.field196 = -1;
                    return true;
                }
                if (this.field196 == 61) {
                    int var10 = this.field299.method72(3);
                    int var11 = this.field299.method73(this.field532);
                    class15.field806[var10].field780 = 2;
                    class15.field806[var10].field781 = var11;
                    this.field196 = -1;
                    return true;
                }
                if (this.field196 == 171) {
                    this.field475 = this.field195 / 8;
                    for (int var12 = 0; var12 < this.field475; ++var12) {
                        this.field516[var12] = this.field299.method50(0);
                    }
                    this.field196 = -1;
                    return true;
                }
                if (this.field196 == 214) {
                    this.field169 = this.field299.method44();
                    this.field433 = true;
                    this.field509 = true;
                    this.field196 = -1;
                    return true;
                }
                if (this.field196 == 229) {
                    String var13 = this.field299.method51();
                    int var14 = this.field299.method46();
                    class15.field806[var14].field773 = var13;
                    if (this.field414[this.field169] == class15.field806[var14].field818) {
                        this.field433 = true;
                    }
                    this.field196 = -1;
                    return true;
                }
                if (this.field196 == 163) {
                    this.field496 = this.field299.method64(-768);
                    this.field495 = this.field299.method64(-768);
                    while (this.field299.field123 < this.field195) {
                        int var15 = this.field299.method44();
                        this.method139(var15, this.field299, true);
                    }
                    this.field196 = -1;
                    return true;
                }
                if (this.field196 == 109) {
                    this.method116(this.field195, this.field341, this.field299);
                    this.field196 = -1;
                    return true;
                }
                if (this.field196 == 26) {
                    String var16 = this.field299.method51();
                    if (var16.endsWith(":tradereq:")) {
                        String var17 = var16.substring(0, var16.indexOf(":"));
                        long var18 = class31.method388(var17);
                        boolean var20 = false;
                        for (int var21 = 0; var21 < this.field475; ++var21) {
                            if (this.field516[var21] == var18) {
                                var20 = true;
                                break;
                            }
                        }
                        if (!var20 && this.field237 == 0) {
                            this.method181(var17, -979, "wishes to trade with you.", 4);
                        }
                    } else if (var16.endsWith(":duelreq:")) {
                        String var22 = var16.substring(0, var16.indexOf(":"));
                        long var23 = class31.method388(var22);
                        boolean var25 = false;
                        for (int var26 = 0; var26 < this.field475; ++var26) {
                            if (this.field516[var26] == var23) {
                                var25 = true;
                                break;
                            }
                        }
                        if (!var25 && this.field237 == 0) {
                            this.method181(var22, -979, "wishes to duel with you.", 8);
                        }
                    } else if (!var16.endsWith(":chalreq:")) {
                        this.method181("", -979, var16, 0);
                    } else {
                        String var27 = var16.substring(0, var16.indexOf(":"));
                        long var28 = class31.method388(var27);
                        boolean var30 = false;
                        for (int var31 = 0; var31 < this.field475; ++var31) {
                            if (this.field516[var31] == var28) {
                                var30 = true;
                                break;
                            }
                        }
                        if (!var30 && this.field237 == 0) {
                            String var32 = var16.substring(var16.indexOf(":") + 1, var16.length() - 9);
                            this.method181(var27, -979, var32, 8);
                        }
                    }
                    this.field196 = -1;
                    return true;
                }
                if (this.field196 == 157) {
                    this.field411 = this.field299.method44();
                    this.field196 = -1;
                    return true;
                }
                if (this.field196 == 177) {
                    this.field433 = true;
                    int var33 = this.field299.method46();
                    class15 var34 = class15.field806[var33];
                    int var35 = this.field299.method46();
                    for (int var36 = 0; var36 < var35; ++var36) {
                        int var37 = this.field299.method64(-768);
                        if (var37 == 255) {
                            var37 = this.field299.method80(35745);
                        }
                        var34.field814[var36] = this.field299.method73(this.field532);
                        var34.field811[var36] = var37;
                    }
                    for (int var38 = var35; var38 < var34.field814.length; ++var38) {
                        var34.field814[var38] = 0;
                        var34.field811[var38] = 0;
                    }
                    this.field196 = -1;
                    return true;
                }
                if (this.field196 == 192 || this.field196 == 76 || this.field196 == 78 || this.field196 == 90 || this.field196 == 198 || this.field196 == 208 || this.field196 == 172 || this.field196 == 241 || this.field196 == 7 || this.field196 == 182 || this.field196 == 219) {
                    this.method139(this.field196, this.field299, true);
                    this.field196 = -1;
                    return true;
                }
                if (this.field196 == 115) {
                    int var39 = this.field299.method73(this.field532);
                    int var40 = this.field299.method73(this.field532);
                    class15 var41 = class15.field806[var39];
                    if (var41 != null && var41.field768 == 0) {
                        if (var40 < 0) {
                            var40 = 0;
                        }
                        if (var40 > var41.field805 - var41.field816) {
                            var40 = var41.field805 - var41.field816;
                        }
                        var41.field809 = var40;
                    }
                    this.field196 = -1;
                    return true;
                }
                if (this.field196 == 117) {
                    long var42 = this.field299.method50(0);
                    int var44 = this.field299.method44();
                    String var45 = class31.method392(class31.method389((byte) -71, var42), false);
                    for (int var46 = 0; var46 < this.field435; ++var46) {
                        if (this.field524[var46] == var42) {
                            if (this.field507[var46] != var44) {
                                this.field507[var46] = var44;
                                this.field433 = true;
                                if (var44 > 0) {
                                    this.method181("", -979, var45 + " has logged in.", 5);
                                }
                                if (var44 == 0) {
                                    this.method181("", -979, var45 + " has logged out.", 5);
                                }
                            }
                            var45 = null;
                            break;
                        }
                    }
                    if (var45 != null && this.field435 < 200) {
                        this.field524[this.field435] = var42;
                        this.field336[this.field435] = var45;
                        this.field507[this.field435] = var44;
                        ++this.field435;
                        this.field433 = true;
                    }
                    boolean var47 = false;
                    while (!var47) {
                        var47 = true;
                        for (int var48 = 0; var48 < this.field435 - 1; ++var48) {
                            if (this.field507[var48] != field272 && this.field507[var48 + 1] == field272 || this.field507[var48] == 0 && this.field507[var48 + 1] != 0) {
                                int var49 = this.field507[var48];
                                this.field507[var48] = this.field507[var48 + 1];
                                this.field507[var48 + 1] = var49;
                                String var50 = this.field336[var48];
                                this.field336[var48] = this.field336[var48 + 1];
                                this.field336[var48 + 1] = var50;
                                long var51 = this.field524[var48];
                                this.field524[var48] = this.field524[var48 + 1];
                                this.field524[var48 + 1] = var51;
                                this.field433 = true;
                                var47 = false;
                            }
                        }
                    }
                    this.field196 = -1;
                    return true;
                }
                if (this.field196 == 148) {
                    this.field312 = this.field299.method62(false);
                    if (this.field312 == this.field169) {
                        if (this.field312 == 3) {
                            this.field169 = 1;
                        } else {
                            this.field169 = 3;
                        }
                        this.field433 = true;
                    }
                    this.field196 = -1;
                    return true;
                }
                if (this.field196 == 18) {
                    int var53 = this.field299.method75(this.field607);
                    int var54 = this.field299.method46();
                    int var55 = this.field299.method76(false);
                    class15 var56 = class15.field806[var54];
                    var56.field807 = var53;
                    var56.field786 = var55;
                    this.field196 = -1;
                    return true;
                }
                if (this.field196 == 175) {
                    int var57 = this.field299.method46();
                    int var58 = this.field299.method44();
                    int var59 = this.field299.method46();
                    if (this.field595 && !field275 && this.field303 < 50) {
                        this.field554[this.field303] = var57;
                        this.field476[this.field303] = var58;
                        this.field185[this.field303] = class51.field1315[var57] + var59;
                        ++this.field303;
                    }
                    this.field196 = -1;
                    return true;
                }
                if (this.field196 == 70) {
                    int var60 = this.field299.method72(3);
                    int var61 = this.field299.method73(this.field532);
                    if (this.field472 != -1) {
                        this.field472 = -1;
                        this.field578 = true;
                    }
                    if (this.field477 != 0) {
                        this.field477 = 0;
                        this.field578 = true;
                    }
                    this.field268 = var60;
                    this.field474 = var61;
                    this.field433 = true;
                    this.field509 = true;
                    this.field226 = false;
                    this.field196 = -1;
                    return true;
                }
                if (this.field196 == 12) {
                    int var62 = this.field299.method72(3);
                    int var63 = this.field299.method46();
                    int var64 = this.field299.method71(0);
                    if (var62 == 65535) {
                        class15.field806[var64].field780 = 0;
                        this.field196 = -1;
                        return true;
                    }
                    class52 var65 = class52.method489(var62);
                    class15.field806[var64].field780 = 4;
                    class15.field806[var64].field781 = var62;
                    class15.field806[var64].field783 = var65.field1332;
                    class15.field806[var64].field784 = var65.field1343;
                    class15.field806[var64].field782 = var65.field1348 * 100 / var63;
                    this.field196 = -1;
                    return true;
                }
                if (this.field196 == 168) {
                    this.field496 = this.field299.method44();
                    this.field495 = this.field299.method64(-768);
                    this.field196 = -1;
                    return true;
                }
                if (this.field196 == 92) {
                    int var66 = this.field299.method73(this.field532);
                    class15 var67 = class15.field806[var66];
                    for (int var68 = 0; var68 < var67.field814.length; ++var68) {
                        var67.field814[var68] = -1;
                        var67.field814[var68] = 0;
                    }
                    this.field196 = -1;
                    return true;
                }
                if (this.field196 == 151) {
                    for (int var69 = 0; var69 < this.field220.length; ++var69) {
                        if (this.field220[var69] != null) {
                            this.field220[var69].field1542 = -1;
                        }
                    }
                    for (int var70 = 0; var70 < this.field247.length; ++var70) {
                        if (this.field247[var70] != null) {
                            this.field247[var70].field1542 = -1;
                        }
                    }
                    this.field196 = -1;
                    return true;
                }
                if (this.field196 == 223) {
                    this.field444 = this.field299.method71(0);
                    this.field515 = this.field299.method46();
                    this.field270 = this.field299.method63((byte) -120);
                    this.field187 = this.field299.method79(0);
                    this.field190 = this.field299.method62(false);
                    if (this.field187 != 0 && this.field268 == -1) {
                        signlink.dnslookup(class31.method391(0, this.field187));
                        this.method154(30702);
                        short var71 = 650;
                        if (this.field270 != 201 || this.field190 == 1) {
                            var71 = 655;
                        }
                        this.field596 = "";
                        this.field501 = false;
                        for (int var72 = 0; var72 < class15.field806.length; ++var72) {
                            if (class15.field806[var72] != null && class15.field806[var72].field804 == var71) {
                                this.field268 = class15.field806[var72].field818;
                                break;
                            }
                        }
                    }
                    this.field196 = -1;
                    return true;
                }
                if (this.field196 == 202) {
                    int var73 = this.field299.method72(3);
                    if (var73 == 65535) {
                        var73 = -1;
                    }
                    if (this.field384 != var73 && this.field189 && !field275 && this.field167 == 0) {
                        this.field386 = var73;
                        this.field387 = true;
                        this.field374.method259(2, this.field386);
                    }
                    this.field384 = var73;
                    this.field196 = -1;
                    return true;
                }
                if (this.field196 == 85) {
                    int var74 = this.field299.method71(0);
                    int var75 = this.field299.method46();
                    if (this.field189 && !field275) {
                        this.field386 = var74;
                        this.field387 = false;
                        this.field374.method259(2, this.field386);
                        this.field167 = var75;
                    }
                    this.field196 = -1;
                    return true;
                }
                if (this.field196 == 60) {
                    this.field271 = true;
                    this.field201 = this.field299.method44();
                    this.field202 = this.field299.method44();
                    this.field203 = this.field299.method46();
                    this.field204 = this.field299.method44();
                    this.field205 = this.field299.method44();
                    if (this.field205 >= 100) {
                        int var76 = this.field201 * 128 + 64;
                        int var77 = this.field202 * 128 + 64;
                        int var78 = this.method194(this.field442, 0, var76, var77) - this.field203;
                        int var79 = var76 - this.field318;
                        int var80 = var78 - this.field319;
                        int var81 = var77 - this.field320;
                        int var82 = (int) Math.sqrt((double) (var79 * var79 + var81 * var81));
                        this.field321 = (int) (Math.atan2((double) var80, (double) var82) * 325.949D) & 2047;
                        this.field322 = (int) (Math.atan2((double) var79, (double) var81) * -325.949D) & 2047;
                        if (this.field321 < 128) {
                            this.field321 = 128;
                        }
                        if (this.field321 > 383) {
                            this.field321 = 383;
                        }
                    }
                    this.field196 = -1;
                    return true;
                }
                if (this.field196 == 210) {
                    this.field589 = false;
                    this.field477 = 1;
                    this.field606 = "";
                    this.field578 = true;
                    this.field196 = -1;
                    return true;
                }
                if (this.field196 == 176) {
                    int var83 = this.field299.method46();
                    int var84 = this.field299.method74(0);
                    class15 var85 = class15.field806[var83];
                    var85.field830 = var84;
                    if (var84 == -1) {
                        var85.field775 = 0;
                        var85.field794 = 0;
                    }
                    this.field196 = -1;
                    return true;
                }
                if (this.field196 == 239) {
                    this.field177 = this.field299.method64(-768);
                    this.field396 = this.field299.method73(this.field532);
                    this.field196 = -1;
                    return true;
                }
                if (this.field196 == 56) {
                    this.field271 = false;
                    for (int var86 = 0; var86 < 5; ++var86) {
                        this.field484[var86] = false;
                    }
                    this.field196 = -1;
                    return true;
                }
                if (this.field196 == 189) {
                    this.field495 = this.field299.method63((byte) -120);
                    this.field496 = this.field299.method63((byte) -120);
                    for (int var87 = this.field495; var87 < this.field495 + 8; ++var87) {
                        for (int var88 = this.field496; var88 < this.field496 + 8; ++var88) {
                            if (this.field398[this.field442][var87][var88] != null) {
                                this.field398[this.field442][var87][var88] = null;
                                this.method209(var87, var88);
                            }
                        }
                    }
                    for (class53 var89 = (class53) this.field358.method585(); var89 != null; var89 = (class53) this.field358.method587(0)) {
                        if (var89.field1382 >= this.field495 && var89.field1382 < this.field495 + 8 && var89.field1383 >= this.field496 && var89.field1383 < this.field496 + 8 && this.field442 == var89.field1380) {
                            var89.field1372 = 0;
                        }
                    }
                    this.field196 = -1;
                    return true;
                }
                if (this.field196 == 111) {
                    if (this.field169 == 12) {
                        this.field433 = true;
                    }
                    this.field151 = this.field299.method47();
                    this.field196 = -1;
                    return true;
                }
                if (this.field196 == 44) {
                    boolean var90 = this.field299.method63((byte) -120) == 1;
                    int var91 = this.field299.method73(this.field532);
                    class15.field806[var91].field819 = var90;
                    this.field196 = -1;
                    return true;
                }
                if (this.field196 == 114) {
                    if (this.field169 == 12) {
                        this.field433 = true;
                    }
                    this.field294 = this.field299.method44();
                    this.field196 = -1;
                    return true;
                }
                if (this.field196 == 128) {
                    this.field271 = true;
                    this.field486 = this.field299.method44();
                    this.field487 = this.field299.method44();
                    this.field488 = this.field299.method46();
                    this.field489 = this.field299.method44();
                    this.field490 = this.field299.method44();
                    if (this.field490 >= 100) {
                        this.field318 = this.field486 * 128 + 64;
                        this.field320 = this.field487 * 128 + 64;
                        this.field319 = this.method194(this.field442, 0, this.field318, this.field320) - this.field488;
                    }
                    this.field196 = -1;
                    return true;
                }
                if (this.field196 == 51) {
                    int var92 = this.field299.method47();
                    if (var92 >= 0) {
                        this.method185(true, var92);
                    }
                    this.field251 = var92;
                    this.field196 = -1;
                    return true;
                }
                if (this.field196 == 181) {
                    int var93 = this.field299.method46();
                    int var94 = this.field299.method72(3);
                    int var95 = var93 >> 10 & 31;
                    int var96 = var93 >> 5 & 31;
                    int var97 = var93 & 31;
                    class15.field806[var94].field824 = (var97 << 3) + (var95 << 19) + (var96 << 11);
                    this.field196 = -1;
                    return true;
                }
                if (this.field196 == 244) {
                    int var98 = this.field299.method74(0);
                    this.field432 = var98;
                    this.field578 = true;
                    this.field196 = -1;
                    return true;
                }
                if (this.field196 == 226) {
                    this.field433 = true;
                    int var99 = this.field299.method62(false);
                    int var100 = this.field299.method79(0);
                    int var101 = this.field299.method63((byte) -120);
                    this.field328[var99] = var100;
                    this.field267[var99] = var101;
                    this.field257[var99] = 1;
                    for (int var102 = 0; var102 < 98; ++var102) {
                        if (var100 >= field335[var102]) {
                            this.field257[var99] = var102 + 2;
                        }
                    }
                    this.field196 = -1;
                    return true;
                }
                if (this.field196 == 159) {
                    int var103 = this.field299.method71(0);
                    byte var104 = this.field299.method66(false);
                    this.field529[var103] = var104;
                    if (this.field395[var103] != var104) {
                        this.field395[var103] = var104;
                        this.method111(var103, 276);
                        this.field433 = true;
                        if (this.field432 != -1) {
                            this.field578 = true;
                        }
                    }
                    this.field196 = -1;
                    return true;
                }
                if (this.field196 == 224) {
                    this.field436 = this.field299.method44();
                    this.field433 = true;
                    this.field196 = -1;
                    return true;
                }
                if (this.field196 == 141) {
                    this.field433 = true;
                    int var105 = this.field299.method46();
                    class15 var106 = class15.field806[var105];
                    while (this.field299.field123 < this.field195) {
                        int var107 = this.field299.method58();
                        int var108 = this.field299.method46();
                        int var109 = this.field299.method44();
                        if (var109 == 255) {
                            var109 = this.field299.method49();
                        }
                        if (var107 >= 0 && var107 < var106.field814.length) {
                            var106.field814[var107] = var108;
                            var106.field811[var107] = var109;
                        }
                    }
                    this.field196 = -1;
                    return true;
                }
                if (this.field196 == 64) {
                    this.field240 = this.field299.method71(0) * 30;
                    this.field196 = -1;
                    return true;
                }
                if (this.field196 == 63) {
                    int var110 = this.field299.method71(0);
                    int var111 = this.field299.method73(this.field532);
                    class15.field806[var111].field780 = 1;
                    class15.field806[var111].field781 = var110;
                    this.field196 = -1;
                    return true;
                }
                if (this.field196 == 167) {
                    int var112 = this.field299.method64(-768);
                    int var113 = this.field299.method62(false);
                    String var114 = this.field299.method51();
                    if (var112 >= 1 && var112 <= 5) {
                        if (var114.equalsIgnoreCase("null")) {
                            var114 = null;
                        }
                        this.field538[var112 - 1] = var114;
                        this.field539[var112 - 1] = var113 == 0;
                    }
                    this.field196 = -1;
                    return true;
                }
                if (this.field196 == 21) {
                    int var115 = this.field299.method73(this.field532);
                    int var116 = this.field299.method63((byte) -120);
                    if (var115 == 65535) {
                        var115 = -1;
                    }
                    this.field414[var116] = var115;
                    this.field433 = true;
                    this.field509 = true;
                    this.field196 = -1;
                    return true;
                }
                if (this.field196 == 57 || this.field196 == 122) {
                    int var117 = this.field228;
                    int var118 = this.field229;
                    if (this.field196 == 57) {
                        var118 = this.field299.method73(this.field532);
                        var117 = this.field299.method71(0);
                        this.field406 = false;
                    }
                    if (this.field196 == 122) {
                        var117 = this.field299.method46();
                        var118 = this.field299.method73(this.field532);
                        this.field299.method54(12265);
                        int var119 = 0;
                        while (true) {
                            if (var119 >= 4) {
                                this.field299.method56(0);
                                this.field406 = true;
                                break;
                            }
                            for (int var120 = 0; var120 < 13; ++var120) {
                                for (int var121 = 0; var121 < 13; ++var121) {
                                    int var122 = this.field299.method55(this.field200, 1);
                                    if (var122 == 1) {
                                        this.field485[var119][var120][var121] = this.field299.method55(this.field200, 26);
                                    } else {
                                        this.field485[var119][var120][var121] = -1;
                                    }
                                }
                            }
                            ++var119;
                        }
                    }
                    if (this.field228 == var117 && this.field229 == var118 && this.field443 == 2) {
                        this.field196 = -1;
                        return true;
                    }
                    this.field228 = var117;
                    this.field229 = var118;
                    this.field545 = (this.field228 - 6) * 8;
                    this.field546 = (this.field229 - 6) * 8;
                    this.field613 = false;
                    if ((this.field228 / 8 == 48 || this.field228 / 8 == 49) && this.field229 / 8 == 48) {
                        this.field613 = true;
                    }
                    if (this.field228 / 8 == 48 && this.field229 / 8 == 148) {
                        this.field613 = true;
                    }
                    this.field443 = 1;
                    this.field541 = System.currentTimeMillis();
                    this.field235.method289(true);
                    this.field161.method464(151, 0, 0, 257, "Loading - please wait.");
                    this.field161.method464(150, 16777215, 0, 256, "Loading - please wait.");
                    this.field235.method290(1, 4, 4, super.field1100);
                    if (this.field196 == 57) {
                        int var123 = 0;
                        int var124 = (this.field228 - 6) / 8;
                        label1112: while (true) {
                            if (var124 > (this.field228 + 6) / 8) {
                                this.field276 = new byte[var123][];
                                this.field192 = new byte[var123][];
                                this.field526 = new int[var123];
                                this.field527 = new int[var123];
                                this.field528 = new int[var123];
                                int var126 = 0;
                                int var127 = (this.field228 - 6) / 8;
                                while (true) {
                                    if (var127 > (this.field228 + 6) / 8) {
                                        break label1112;
                                    }
                                    for (int var128 = (this.field229 - 6) / 8; var128 <= (this.field229 + 6) / 8; ++var128) {
                                        this.field526[var126] = (var127 << 8) + var128;
                                        if (this.field613 && (var128 == 49 || var128 == 149 || var128 == 147 || var127 == 50 || var127 == 49 && var128 == 47)) {
                                            this.field527[var126] = -1;
                                            this.field528[var126] = -1;
                                            ++var126;
                                        } else {
                                            int var129 = this.field527[var126] = this.field374.method260(0, false, var128, var127);
                                            if (var129 != -1) {
                                                this.field374.method259(3, var129);
                                            }
                                            int var130 = this.field528[var126] = this.field374.method260(1, false, var128, var127);
                                            if (var130 != -1) {
                                                this.field374.method259(3, var130);
                                            }
                                            ++var126;
                                        }
                                    }
                                    ++var127;
                                }
                            }
                            for (int var125 = (this.field229 - 6) / 8; var125 <= (this.field229 + 6) / 8; ++var125) {
                                ++var123;
                            }
                            ++var124;
                        }
                    }
                    if (this.field196 == 122) {
                        int var131 = 0;
                        int[] var132 = new int[676];
                        int var133 = 0;
                        label1073: while (true) {
                            if (var133 >= 4) {
                                this.field276 = new byte[var131][];
                                this.field192 = new byte[var131][];
                                this.field526 = new int[var131];
                                this.field527 = new int[var131];
                                this.field528 = new int[var131];
                                int var141 = 0;
                                while (true) {
                                    if (var141 >= var131) {
                                        break label1073;
                                    }
                                    int var142 = this.field526[var141] = var132[var141];
                                    int var143 = var142 >> 8 & 255;
                                    int var144 = var142 & 255;
                                    int var145 = this.field527[var141] = this.field374.method260(0, false, var144, var143);
                                    if (var145 != -1) {
                                        this.field374.method259(3, var145);
                                    }
                                    int var146 = this.field528[var141] = this.field374.method260(1, false, var144, var143);
                                    if (var146 != -1) {
                                        this.field374.method259(3, var146);
                                    }
                                    ++var141;
                                }
                            }
                            for (int var134 = 0; var134 < 13; ++var134) {
                                for (int var135 = 0; var135 < 13; ++var135) {
                                    int var136 = this.field485[var133][var134][var135];
                                    if (var136 != -1) {
                                        int var137 = var136 >> 14 & 1023;
                                        int var138 = var136 >> 3 & 2047;
                                        int var139 = (var137 / 8 << 8) + var138 / 8;
                                        for (int var140 = 0; var140 < var131; ++var140) {
                                            if (var132[var140] == var139) {
                                                var139 = -1;
                                                break;
                                            }
                                        }
                                        if (var139 != -1) {
                                            var132[var131++] = var139;
                                        }
                                    }
                                }
                            }
                            ++var133;
                        }
                    }
                    int var147 = this.field545 - this.field547;
                    int var148 = this.field546 - this.field548;
                    this.field547 = this.field545;
                    this.field548 = this.field546;
                    for (int var149 = 0; var149 < 16384; ++var149) {
                        class55 var150 = this.field247[var149];
                        if (var150 != null) {
                            for (int var151 = 0; var151 < 10; ++var151) {
                                var150.field1567[var151] -= var147;
                                var150.field1568[var151] -= var148;
                            }
                            var150.field1570 -= var147 * 128;
                            var150.field1571 -= var148 * 128;
                        }
                    }
                    for (int var152 = 0; var152 < this.field218; ++var152) {
                        class22 var153 = this.field220[var152];
                        if (var153 != null) {
                            for (int var154 = 0; var154 < 10; ++var154) {
                                var153.field1567[var154] -= var147;
                                var153.field1568[var154] -= var148;
                            }
                            var153.field1570 -= var147 * 128;
                            var153.field1571 -= var148 * 128;
                        }
                    }
                    this.field590 = true;
                    byte var155 = 0;
                    byte var156 = 104;
                    byte var157 = 1;
                    if (var147 < 0) {
                        var155 = 103;
                        var156 = -1;
                        var157 = -1;
                    }
                    byte var158 = 0;
                    byte var159 = 104;
                    byte var160 = 1;
                    if (var148 < 0) {
                        var158 = 103;
                        var159 = -1;
                        var160 = -1;
                    }
                    for (int var161 = var155; var156 != var161; var161 += var157) {
                        for (int var162 = var158; var159 != var162; var162 += var160) {
                            int var163 = var147 + var161;
                            int var164 = var148 + var162;
                            for (int var165 = 0; var165 < 4; ++var165) {
                                if (var163 >= 0 && var164 >= 0 && var163 < 104 && var164 < 104) {
                                    this.field398[var165][var161][var162] = this.field398[var165][var163][var164];
                                } else {
                                    this.field398[var165][var161][var162] = null;
                                }
                            }
                        }
                    }
                    for (class53 var166 = (class53) this.field358.method585(); var166 != null; var166 = (class53) this.field358.method587(0)) {
                        var166.field1382 -= var147;
                        var166.field1383 -= var148;
                        if (var166.field1382 < 0 || var166.field1383 < 0 || var166.field1382 >= 104 || var166.field1383 >= 104) {
                            var166.method450();
                        }
                    }
                    if (this.field332 != 0) {
                        this.field332 -= var147;
                        this.field333 -= var148;
                    }
                    this.field271 = false;
                    this.field196 = -1;
                    return true;
                }
                if (this.field196 == 213) {
                    int var167 = this.field299.method72(3);
                    this.method185(true, var167);
                    if (this.field474 != -1) {
                        this.field474 = -1;
                        this.field433 = true;
                        this.field509 = true;
                    }
                    if (this.field472 != -1) {
                        this.field472 = -1;
                        this.field578 = true;
                    }
                    if (this.field477 != 0) {
                        this.field477 = 0;
                        this.field578 = true;
                    }
                    this.field268 = var167;
                    this.field226 = false;
                    this.field196 = -1;
                    return true;
                }
                if (this.field196 == 81) {
                    this.method101(this.field195, false, this.field299);
                    this.field590 = false;
                    this.field196 = -1;
                    return true;
                }
                if (this.field196 == 9) {
                    this.method99(false);
                    this.field196 = -1;
                    return false;
                }
                if (this.field196 == 102) {
                    this.field429 = this.field299.method44();
                    this.field196 = -1;
                    return true;
                }
                if (this.field196 == 200) {
                    int var168 = this.field299.method46();
                    this.method185(true, var168);
                    if (this.field474 != -1) {
                        this.field474 = -1;
                        this.field433 = true;
                        this.field509 = true;
                    }
                    this.field472 = var168;
                    this.field578 = true;
                    this.field268 = -1;
                    this.field226 = false;
                    this.field196 = -1;
                    return true;
                }
                if (this.field196 == 254) {
                    long var169 = this.field299.method50(0);
                    int var171 = this.field299.method49();
                    int var172 = this.field299.method44();
                    boolean var173 = false;
                    for (int var174 = 0; var174 < 100; ++var174) {
                        if (this.field317[var174] == var171) {
                            var173 = true;
                            break;
                        }
                    }
                    if (var172 <= 1) {
                        for (int var175 = 0; var175 < this.field475; ++var175) {
                            if (this.field516[var175] == var169) {
                                var173 = true;
                                break;
                            }
                        }
                    }
                    if (!var173 && this.field237 == 0) {
                        try {
                            this.field317[this.field505] = var171;
                            this.field505 = (this.field505 + 1) % 100;
                            String var176 = class28.method379(this.field195 - 13, this.field299, -21407);
                            if (var172 != 3) {
                                var176 = class19.method305(this.field154, var176);
                            }
                            if (var172 != 2 && var172 != 3) {
                                if (var172 == 1) {
                                    this.method181("@cr1@" + class31.method392(class31.method389((byte) -71, var169), false), -979, var176, 7);
                                } else {
                                    this.method181(class31.method392(class31.method389((byte) -71, var169), false), -979, var176, 3);
                                }
                            } else {
                                this.method181("@cr2@" + class31.method392(class31.method389((byte) -71, var169), false), -979, var176, 7);
                            }
                        } catch (Exception var187) {
                            signlink.reporterror("cde1");
                        }
                    }
                    this.field196 = -1;
                    return true;
                }
                if (this.field196 == 204) {
                    this.field589 = false;
                    this.field477 = 2;
                    this.field606 = "";
                    this.field578 = true;
                    this.field196 = -1;
                    return true;
                }
                if (this.field196 == 124) {
                    int var178 = this.field299.method44();
                    int var179 = this.field299.method44();
                    int var180 = this.field299.method44();
                    int var181 = this.field299.method44();
                    this.field484[var178] = true;
                    this.field591[var178] = var179;
                    this.field215[var178] = var180;
                    this.field254[var178] = var181;
                    this.field327[var178] = 0;
                    this.field196 = -1;
                    return true;
                }
                if (this.field196 == 80) {
                    int var182 = this.field299.method46();
                    class15.field806[var182].field780 = 3;
                    if (field557.field953 == null) {
                        class15.field806[var182].field781 = (field557.field975[11] << 5) + (field557.field975[8] << 10) + (field557.field975[0] << 15) + (field557.field974[0] << 25) + (field557.field974[4] << 20) + field557.field975[1];
                    } else {
                        class15.field806[var182].field781 = (int) (field557.field953.field83 + 305419896L);
                    }
                    this.field196 = -1;
                    return true;
                }
                if (this.field196 == 193) {
                    this.field404 = this.field299.method44();
                    if (this.field404 == 1) {
                        this.field293 = this.field299.method46();
                    }
                    if (this.field404 >= 2 && this.field404 <= 6) {
                        if (this.field404 == 2) {
                            this.field449 = 64;
                            this.field450 = 64;
                        }
                        if (this.field404 == 3) {
                            this.field449 = 0;
                            this.field450 = 64;
                        }
                        if (this.field404 == 4) {
                            this.field449 = 128;
                            this.field450 = 64;
                        }
                        if (this.field404 == 5) {
                            this.field449 = 64;
                            this.field450 = 0;
                        }
                        if (this.field404 == 6) {
                            this.field449 = 64;
                            this.field450 = 128;
                        }
                        this.field404 = 2;
                        this.field446 = this.field299.method46();
                        this.field447 = this.field299.method46();
                        this.field448 = this.field299.method44();
                    }
                    if (this.field404 == 10) {
                        this.field153 = this.field299.method46();
                    }
                    this.field196 = -1;
                    return true;
                }
                if (this.field196 == 65) {
                    this.field540 = this.field299.method44();
                    this.field347 = this.field299.method44();
                    this.field417 = this.field299.method44();
                    this.field610 = true;
                    this.field578 = true;
                    this.field196 = -1;
                    return true;
                }
                if (this.field196 == 178) {
                    for (int var183 = 0; var183 < this.field395.length; ++var183) {
                        if (this.field529[var183] != this.field395[var183]) {
                            this.field395[var183] = this.field529[var183];
                            this.method111(var183, 276);
                            this.field433 = true;
                        }
                    }
                    this.field196 = -1;
                    return true;
                }
                signlink.reporterror("T1 - " + this.field196 + "," + this.field195 + " - " + this.field566 + "," + this.field567);
                this.method99(false);
            } catch (IOException var188) {
                this.method92(false);
            } catch (Exception var189) {
                String var185 = "T2 - " + this.field196 + "," + this.field566 + "," + this.field567 + " - " + this.field195 + "," + (field557.field1567[0] + this.field545) + "," + (field557.field1568[0] + this.field546) + " - ";
                for (int var186 = 0; var186 < this.field195 && var186 < 50; ++var186) {
                    var185 = var185 + this.field299.field122[var186] + ",";
                }
                signlink.reporterror(var185);
                this.method99(false);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "s", descriptor = "(I)V")
    private final void method153(int arg0) {
        if (this.field431 != arg0) {
            this.field398 = null;
        }
        if (this.field443 == 2) {
            for (class53 var2 = (class53) this.field358.method585(); var2 != null; var2 = (class53) this.field358.method587(0)) {
                if (var2.field1372 > 0) {
                    --var2.field1372;
                }
                if (var2.field1372 == 0) {
                    if (var2.field1376 < 0 || class3.method5(-689, var2.field1376, var2.field1378)) {
                        this.method95(var2.field1383, var2.field1381, var2.field1380, var2.field1377, var2.field1378, var2.field1376, 0, var2.field1382);
                        var2.method450();
                    }
                } else {
                    if (var2.field1379 > 0) {
                        --var2.field1379;
                    }
                    if (var2.field1379 == 0 && var2.field1382 >= 1 && var2.field1383 >= 1 && var2.field1382 <= 102 && var2.field1383 <= 102 && (var2.field1373 < 0 || class3.method5(-689, var2.field1373, var2.field1375))) {
                        this.method95(var2.field1383, var2.field1381, var2.field1380, var2.field1374, var2.field1375, var2.field1373, 0, var2.field1382);
                        var2.field1379 = -1;
                        if (var2.field1376 == var2.field1373 && var2.field1376 == -1) {
                            var2.method450();
                        } else if (var2.field1376 == var2.field1373 && var2.field1377 == var2.field1374 && var2.field1378 == var2.field1375) {
                            var2.method450();
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "t", descriptor = "(I)V")
    public final void method154(int arg0) {
        this.field608.method33((byte) 57, 212);
        if (this.field474 != -1) {
            this.field474 = -1;
            this.field433 = true;
            this.field226 = false;
            this.field509 = true;
        }
        if (this.field472 != -1) {
            this.field472 = -1;
            this.field578 = true;
            this.field226 = false;
        }
        this.field268 = -1;
        if (arg0 != 30702) {
            this.field196 = this.field299.method44();
        }
    }

    @OriginalMember(owner = "client", name = "u", descriptor = "(I)V")
    public final void method155(int arg0) {
        while (arg0 >= 0) {
            this.field196 = -1;
        }
        for (int var2 = 0; var2 < this.field248; ++var2) {
            int var3 = this.field249[var2];
            class55 var4 = this.field247[var3];
            if (var4 != null) {
                this.method156(var4.field1398.field90, var4, 907);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILUKYMLOIC;I)V")
    public final void method156(int arg0, class61 arg1, int arg2) {
        if (arg2 <= 0) {
            this.field196 = -1;
        }
        if (arg1.field1570 < 128 || arg1.field1571 < 128 || arg1.field1570 >= 13184 || arg1.field1571 >= 13184) {
            arg1.field1542 = -1;
            arg1.field1536 = -1;
            arg1.field1564 = 0;
            arg1.field1565 = 0;
            arg1.field1570 = arg1.field1567[0] * 128 + arg1.field1541 * 64;
            arg1.field1571 = arg1.field1568[0] * 128 + arg1.field1541 * 64;
            arg1.method560(6);
        }
        if (field557 == arg1 && (arg1.field1570 < 1536 || arg1.field1571 < 1536 || arg1.field1570 >= 11776 || arg1.field1571 >= 11776)) {
            arg1.field1542 = -1;
            arg1.field1536 = -1;
            arg1.field1564 = 0;
            arg1.field1565 = 0;
            arg1.field1570 = arg1.field1567[0] * 128 + arg1.field1541 * 64;
            arg1.field1571 = arg1.field1568[0] * 128 + arg1.field1541 * 64;
            arg1.method560(6);
        }
        if (arg1.field1564 > field329) {
            this.method157(false, arg1);
        } else if (arg1.field1565 >= field329) {
            this.method158(arg1, 7);
        } else {
            this.method159(arg1, 0);
        }
        this.method160((byte) 2, arg1);
        this.method161(arg1, 245);
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZLUKYMLOIC;)V")
    public final void method157(boolean arg0, class61 arg1) {
        int var3 = arg1.field1564 - field329;
        int var4 = arg1.field1560 * 128 + arg1.field1541 * 64;
        int var5 = arg1.field1562 * 128 + arg1.field1541 * 64;
        if (arg0) {
            this.field398 = null;
        }
        arg1.field1570 += (var4 - arg1.field1570) / var3;
        arg1.field1571 += (var5 - arg1.field1571) / var3;
        arg1.field1533 = 0;
        if (arg1.field1566 == 0) {
            arg1.field1550 = 1024;
        }
        if (arg1.field1566 == 1) {
            arg1.field1550 = 1536;
        }
        if (arg1.field1566 == 2) {
            arg1.field1550 = 0;
        }
        if (arg1.field1566 == 3) {
            arg1.field1550 = 512;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LUKYMLOIC;I)V")
    public final void method158(class61 arg0, int arg1) {
        if (field329 == arg0.field1565 || arg0.field1542 == -1 || arg0.field1545 != 0 || arg0.field1544 + 1 > class39.field1195[arg0.field1542].method445(arg0.field1543, 977)) {
            int var3 = arg0.field1565 - arg0.field1564;
            int var4 = field329 - arg0.field1564;
            int var5 = arg0.field1560 * 128 + arg0.field1541 * 64;
            int var6 = arg0.field1562 * 128 + arg0.field1541 * 64;
            int var7 = arg0.field1561 * 128 + arg0.field1541 * 64;
            int var8 = arg0.field1563 * 128 + arg0.field1541 * 64;
            arg0.field1570 = ((var3 - var4) * var5 + var4 * var7) / var3;
            arg0.field1571 = ((var3 - var4) * var6 + var4 * var8) / var3;
        }
        arg0.field1533 = 0;
        if (arg0.field1566 == 0) {
            arg0.field1550 = 1024;
        }
        if (arg0.field1566 == 1) {
            arg0.field1550 = 1536;
        }
        if (arg0.field1566 == 2) {
            arg0.field1550 = 0;
        }
        if (arg0.field1566 == 3) {
            arg0.field1550 = 512;
        }
        arg0.field1572 = arg0.field1550;
        if (arg1 < 7 || arg1 > 7) {
            this.field183 = this.field413.method479();
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(LUKYMLOIC;I)V")
    public final void method159(class61 arg0, int arg1) {
        arg0.field1573 = arg0.field1525;
        if (arg0.field1559 == 0) {
            arg0.field1533 = 0;
        } else {
            if (arg0.field1542 != -1 && arg0.field1545 == 0) {
                class39 var3 = class39.field1195[arg0.field1542];
                if (arg0.field1535 > 0 && var3.field1207 == 0) {
                    ++arg0.field1533;
                    return;
                }
                if (arg0.field1535 <= 0 && var3.field1208 == 0) {
                    ++arg0.field1533;
                    return;
                }
            }
            int var4 = arg0.field1570;
            int var5 = arg0.field1571;
            int var6 = arg0.field1567[arg0.field1559 - 1] * 128 + arg0.field1541 * 64;
            int var7 = arg0.field1568[arg0.field1559 - 1] * 128 + arg0.field1541 * 64;
            if (arg1 != 0) {
                field253 = true;
            }
            if (var6 - var4 <= 256 && var6 - var4 >= -256 && var7 - var5 <= 256 && var7 - var5 >= -256) {
                if (var4 < var6) {
                    if (var5 < var7) {
                        arg0.field1550 = 1280;
                    } else if (var5 > var7) {
                        arg0.field1550 = 1792;
                    } else {
                        arg0.field1550 = 1536;
                    }
                } else if (var4 > var6) {
                    if (var5 < var7) {
                        arg0.field1550 = 768;
                    } else if (var5 > var7) {
                        arg0.field1550 = 256;
                    } else {
                        arg0.field1550 = 512;
                    }
                } else if (var5 < var7) {
                    arg0.field1550 = 1024;
                } else {
                    arg0.field1550 = 0;
                }
                int var8 = arg0.field1550 - arg0.field1572 & 2047;
                if (var8 > 1024) {
                    var8 -= 2048;
                }
                int var9 = arg0.field1577;
                if (var8 >= -256 && var8 <= 256) {
                    var9 = arg0.field1576;
                } else if (var8 >= 256 && var8 < 768) {
                    var9 = arg0.field1579;
                } else if (var8 >= -768 && var8 <= -256) {
                    var9 = arg0.field1578;
                }
                if (var9 == -1) {
                    var9 = arg0.field1576;
                }
                arg0.field1573 = var9;
                int var10 = 4;
                if (arg0.field1572 != arg0.field1550 && arg0.field1552 == -1 && arg0.field1527 != 0) {
                    var10 = 2;
                }
                if (arg0.field1559 > 2) {
                    var10 = 6;
                }
                if (arg0.field1559 > 3) {
                    var10 = 8;
                }
                if (arg0.field1533 > 0 && arg0.field1559 > 1) {
                    var10 = 8;
                    --arg0.field1533;
                }
                if (arg0.field1557[arg0.field1559 - 1]) {
                    var10 <<= 1;
                }
                if (var10 >= 8 && arg0.field1576 == arg0.field1573 && arg0.field1556 != -1) {
                    arg0.field1573 = arg0.field1556;
                }
                if (var4 < var6) {
                    arg0.field1570 += var10;
                    if (arg0.field1570 > var6) {
                        arg0.field1570 = var6;
                    }
                } else if (var4 > var6) {
                    arg0.field1570 -= var10;
                    if (arg0.field1570 < var6) {
                        arg0.field1570 = var6;
                    }
                }
                if (var5 < var7) {
                    arg0.field1571 += var10;
                    if (arg0.field1571 > var7) {
                        arg0.field1571 = var7;
                    }
                } else if (var5 > var7) {
                    arg0.field1571 -= var10;
                    if (arg0.field1571 < var7) {
                        arg0.field1571 = var7;
                    }
                }
                if (arg0.field1570 == var6 && arg0.field1571 == var7) {
                    --arg0.field1559;
                    if (arg0.field1535 > 0) {
                        --arg0.field1535;
                        return;
                    }
                }
            } else {
                arg0.field1570 = var6;
                arg0.field1571 = var7;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BLUKYMLOIC;)V")
    public final void method160(byte arg0, class61 arg1) {
        if (arg0 == 2) {
            boolean var3 = false;
        } else {
            for (int var4 = 1; var4 > 0; ++var4) {
            }
        }
        if (arg1.field1527 != 0) {
            if (arg1.field1552 != -1 && arg1.field1552 < 32768) {
                class55 var5 = this.field247[arg1.field1552];
                if (var5 != null) {
                    int var6 = arg1.field1570 - var5.field1570;
                    int var7 = arg1.field1571 - var5.field1571;
                    if (var6 != 0 || var7 != 0) {
                        arg1.field1550 = (int) (Math.atan2((double) var6, (double) var7) * 325.949D) & 2047;
                    }
                }
            }
            if (arg1.field1552 >= 32768) {
                int var8 = arg1.field1552 - 32768;
                if (this.field396 == var8) {
                    var8 = this.field219;
                }
                class22 var9 = this.field220[var8];
                if (var9 != null) {
                    int var10 = arg1.field1570 - var9.field1570;
                    int var11 = arg1.field1571 - var9.field1571;
                    if (var10 != 0 || var11 != 0) {
                        arg1.field1550 = (int) (Math.atan2((double) var10, (double) var11) * 325.949D) & 2047;
                    }
                }
            }
            if ((arg1.field1553 != 0 || arg1.field1554 != 0) && (arg1.field1559 == 0 || arg1.field1533 > 0)) {
                int var12 = arg1.field1570 - (arg1.field1553 - this.field545 - this.field545) * 64;
                int var13 = arg1.field1571 - (arg1.field1554 - this.field546 - this.field546) * 64;
                if (var12 != 0 || var13 != 0) {
                    arg1.field1550 = (int) (Math.atan2((double) var12, (double) var13) * 325.949D) & 2047;
                }
                arg1.field1553 = 0;
                arg1.field1554 = 0;
            }
            int var14 = arg1.field1550 - arg1.field1572 & 2047;
            if (var14 != 0) {
                if (var14 >= arg1.field1527 && var14 <= 2048 - arg1.field1527) {
                    if (var14 > 1024) {
                        arg1.field1572 -= arg1.field1527;
                    } else {
                        arg1.field1572 += arg1.field1527;
                    }
                } else {
                    arg1.field1572 = arg1.field1550;
                }
                arg1.field1572 &= 2047;
                if (arg1.field1573 == arg1.field1525 && arg1.field1572 != arg1.field1550) {
                    if (arg1.field1526 != -1) {
                        arg1.field1573 = arg1.field1526;
                        return;
                    }
                    arg1.field1573 = arg1.field1576;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(LUKYMLOIC;I)V")
    public final void method161(class61 arg0, int arg1) {
        int var3 = 32 / arg1;
        arg0.field1524 = false;
        if (arg0.field1573 != -1) {
            class39 var4 = class39.field1195[arg0.field1573];
            ++arg0.field1575;
            if (arg0.field1574 < var4.field1196 && arg0.field1575 > var4.method445(arg0.field1574, 977)) {
                arg0.field1575 = 0;
                ++arg0.field1574;
            }
            if (arg0.field1574 >= var4.field1196) {
                arg0.field1575 = 0;
                arg0.field1574 = 0;
            }
        }
        if (arg0.field1536 != -1 && field329 >= arg0.field1539) {
            if (arg0.field1537 < 0) {
                arg0.field1537 = 0;
            }
            class39 var5 = class63.field1588[arg0.field1536].field1592;
            ++arg0.field1538;
            while (arg0.field1537 < var5.field1196 && arg0.field1538 > var5.method445(arg0.field1537, 977)) {
                arg0.field1538 -= var5.method445(arg0.field1537, 977);
                ++arg0.field1537;
            }
            if (arg0.field1537 >= var5.field1196 && (arg0.field1537 < 0 || arg0.field1537 >= var5.field1196)) {
                arg0.field1536 = -1;
            }
        }
        if (arg0.field1542 != -1 && arg0.field1545 <= 1) {
            class39 var6 = class39.field1195[arg0.field1542];
            if (var6.field1207 == 1 && arg0.field1535 > 0 && arg0.field1564 <= field329 && arg0.field1565 < field329) {
                arg0.field1545 = 1;
                return;
            }
        }
        if (arg0.field1542 != -1 && arg0.field1545 == 0) {
            class39 var7 = class39.field1195[arg0.field1542];
            ++arg0.field1544;
            while (arg0.field1543 < var7.field1196 && arg0.field1544 > var7.method445(arg0.field1543, 977)) {
                arg0.field1544 -= var7.method445(arg0.field1543, 977);
                ++arg0.field1543;
            }
            if (arg0.field1543 >= var7.field1196) {
                arg0.field1543 -= var7.field1200;
                ++arg0.field1546;
                if (arg0.field1546 >= var7.field1206) {
                    arg0.field1542 = -1;
                }
                if (arg0.field1543 < 0 || arg0.field1543 >= var7.field1196) {
                    arg0.field1542 = -1;
                }
            }
            arg0.field1524 = var7.field1202;
        }
        if (arg0.field1545 > 0) {
            --arg0.field1545;
        }
    }

    @OriginalMember(owner = "client", name = "l", descriptor = "(Z)V")
    public final void method162(boolean arg0) {
        if (!arg0) {
            this.method197();
        }
        if (this.field514) {
            this.field514 = false;
            this.field277.method290(1, 4, 0, super.field1100);
            this.field278.method290(1, 357, 0, super.field1100);
            this.field279.method290(1, 4, 722, super.field1100);
            this.field280.method290(1, 205, 743, super.field1100);
            this.field281.method290(1, 0, 0, super.field1100);
            this.field282.method290(1, 4, 516, super.field1100);
            this.field283.method290(1, 205, 516, super.field1100);
            this.field284.method290(1, 357, 496, super.field1100);
            this.field285.method290(1, 338, 0, super.field1100);
            this.field433 = true;
            this.field578 = true;
            this.field509 = true;
            this.field610 = true;
            if (this.field443 != 2) {
                this.field235.method290(1, 4, 4, super.field1100);
                this.field234.method290(1, 4, 550, super.field1100);
            }
        }
        if (this.field443 == 2) {
            this.method201(this.field306);
        }
        if (this.field342 && this.field451 == 1) {
            this.field433 = true;
        }
        if (this.field474 != -1) {
            boolean var2 = this.method188(this.field459, this.field474, false);
            if (var2) {
                this.field433 = true;
            }
        }
        if (this.field402 == 2) {
            this.field433 = true;
        }
        if (this.field426 == 2) {
            this.field433 = true;
        }
        if (this.field433) {
            this.method122(this.field569);
            this.field433 = false;
        }
        if (this.field472 == -1) {
            this.field534.field809 = this.field255 - this.field157 - 77;
            if (super.field1108 > 448 && super.field1108 < 560 && super.field1109 > 332) {
                this.method193(463, 0, super.field1108 - 17, this.field534, false, 77, super.field1109 - 357, this.field255, -30561);
            }
            int var3 = this.field255 - 77 - this.field534.field809;
            if (var3 < 0) {
                var3 = 0;
            }
            if (var3 > this.field255 - 77) {
                var3 = this.field255 - 77;
            }
            if (this.field157 != var3) {
                this.field157 = var3;
                this.field578 = true;
            }
            ++field394;
            if (field394 > 79) {
                field394 = 0;
                this.field608.method33((byte) 57, 40);
            }
        }
        if (this.field472 != -1) {
            boolean var4 = this.method188(this.field459, this.field472, false);
            if (var4) {
                this.field578 = true;
            }
        }
        if (this.field402 == 3) {
            this.field578 = true;
        }
        if (this.field426 == 3) {
            this.field578 = true;
        }
        if (this.field438 != null) {
            this.field578 = true;
        }
        if (this.field342 && this.field451 == 2) {
            this.field578 = true;
        }
        if (this.field578) {
            this.method144(349);
            this.field578 = false;
        }
        if (this.field443 == 2) {
            this.method173(this.field592);
            this.field234.method290(1, 4, 550, super.field1100);
        }
        if (this.field312 != -1) {
            this.field509 = true;
        }
        if (this.field509) {
            if (this.field312 != -1 && this.field312 == this.field169) {
                this.field312 = -1;
                this.field608.method33((byte) 57, 86);
                this.field608.method34(this.field169);
            }
            this.field509 = false;
            this.field378.method289(true);
            this.field326.method442(0, 0, false);
            if (this.field474 == -1) {
                if (this.field414[this.field169] != -1) {
                    if (this.field169 == 0) {
                        this.field558.method442(10, 22, false);
                    }
                    if (this.field169 == 1) {
                        this.field559.method442(8, 54, false);
                    }
                    if (this.field169 == 2) {
                        this.field559.method442(8, 82, false);
                    }
                    if (this.field169 == 3) {
                        this.field560.method442(8, 110, false);
                    }
                    if (this.field169 == 4) {
                        this.field562.method442(8, 153, false);
                    }
                    if (this.field169 == 5) {
                        this.field562.method442(8, 181, false);
                    }
                    if (this.field169 == 6) {
                        this.field561.method442(9, 209, false);
                    }
                }
                if (this.field414[0] != -1 && (this.field312 != 0 || field329 % 20 < 10)) {
                    this.field181[0].method442(13, 29, false);
                }
                if (this.field414[1] != -1 && (this.field312 != 1 || field329 % 20 < 10)) {
                    this.field181[1].method442(11, 53, false);
                }
                if (this.field414[2] != -1 && (this.field312 != 2 || field329 % 20 < 10)) {
                    this.field181[2].method442(11, 82, false);
                }
                if (this.field414[3] != -1 && (this.field312 != 3 || field329 % 20 < 10)) {
                    this.field181[3].method442(12, 115, false);
                }
                if (this.field414[4] != -1 && (this.field312 != 4 || field329 % 20 < 10)) {
                    this.field181[4].method442(13, 153, false);
                }
                if (this.field414[5] != -1 && (this.field312 != 5 || field329 % 20 < 10)) {
                    this.field181[5].method442(11, 180, false);
                }
                if (this.field414[6] != -1 && (this.field312 != 6 || field329 % 20 < 10)) {
                    this.field181[6].method442(13, 208, false);
                }
            }
            this.field378.method290(1, 160, 516, super.field1100);
            ++field605;
            if (field605 > 1334) {
                field605 = 0;
                this.field608.method33((byte) 57, 133);
                this.field608.method34(0);
                int var5 = this.field608.field123;
                this.field608.method34(223);
                this.field608.method34((int) (Math.random() * 256.0D));
                this.field608.method35(43763);
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field608.method34(158);
                }
                this.field608.method34((int) (Math.random() * 256.0D));
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field608.method34(187);
                }
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field608.method34(197);
                }
                this.field608.method35(49718);
                this.field608.method34((int) (Math.random() * 256.0D));
                this.field608.method35(61183);
                this.field608.method43(0, this.field608.field123 - var5);
            }
            this.field377.method289(true);
            this.field325.method442(0, 0, false);
            if (this.field474 == -1) {
                if (this.field414[this.field169] != -1) {
                    if (this.field169 == 7) {
                        this.field388.method442(0, 42, false);
                    }
                    if (this.field169 == 8) {
                        this.field389.method442(0, 74, false);
                    }
                    if (this.field169 == 9) {
                        this.field389.method442(0, 102, false);
                    }
                    if (this.field169 == 10) {
                        this.field390.method442(1, 130, false);
                    }
                    if (this.field169 == 11) {
                        this.field392.method442(0, 173, false);
                    }
                    if (this.field169 == 12) {
                        this.field392.method442(0, 201, false);
                    }
                    if (this.field169 == 13) {
                        this.field391.method442(0, 229, false);
                    }
                }
                if (this.field414[8] != -1 && (this.field312 != 8 || field329 % 20 < 10)) {
                    this.field181[7].method442(2, 74, false);
                }
                if (this.field414[9] != -1 && (this.field312 != 9 || field329 % 20 < 10)) {
                    this.field181[8].method442(3, 102, false);
                }
                if (this.field414[10] != -1 && (this.field312 != 10 || field329 % 20 < 10)) {
                    this.field181[9].method442(4, 137, false);
                }
                if (this.field414[11] != -1 && (this.field312 != 11 || field329 % 20 < 10)) {
                    this.field181[10].method442(2, 174, false);
                }
                if (this.field414[12] != -1 && (this.field312 != 12 || field329 % 20 < 10)) {
                    this.field181[11].method442(2, 201, false);
                }
                if (this.field414[13] != -1 && (this.field312 != 13 || field329 % 20 < 10)) {
                    this.field181[12].method442(2, 226, false);
                }
            }
            this.field377.method290(1, 466, 496, super.field1100);
            this.field235.method289(true);
        }
        if (this.field610) {
            this.field610 = false;
            this.field376.method289(true);
            this.field324.method442(0, 0, false);
            this.field161.method465(55, (byte) 68, "Public chat", 28, 16777215, true);
            if (this.field540 == 0) {
                this.field161.method465(55, (byte) 68, "On", 41, 65280, true);
            }
            if (this.field540 == 1) {
                this.field161.method465(55, (byte) 68, "Friends", 41, 16776960, true);
            }
            if (this.field540 == 2) {
                this.field161.method465(55, (byte) 68, "Off", 41, 16711680, true);
            }
            if (this.field540 == 3) {
                this.field161.method465(55, (byte) 68, "Hide", 41, 65535, true);
            }
            this.field161.method465(184, (byte) 68, "Private chat", 28, 16777215, true);
            if (this.field347 == 0) {
                this.field161.method465(184, (byte) 68, "On", 41, 65280, true);
            }
            if (this.field347 == 1) {
                this.field161.method465(184, (byte) 68, "Friends", 41, 16776960, true);
            }
            if (this.field347 == 2) {
                this.field161.method465(184, (byte) 68, "Off", 41, 16711680, true);
            }
            this.field161.method465(324, (byte) 68, "Trade/compete", 28, 16777215, true);
            if (this.field417 == 0) {
                this.field161.method465(324, (byte) 68, "On", 41, 65280, true);
            }
            if (this.field417 == 1) {
                this.field161.method465(324, (byte) 68, "Friends", 41, 16776960, true);
            }
            if (this.field417 == 2) {
                this.field161.method465(324, (byte) 68, "Off", 41, 16711680, true);
            }
            this.field161.method465(458, (byte) 68, "Report abuse", 33, 16777215, true);
            this.field376.method290(1, 453, 0, super.field1100);
            this.field235.method289(true);
        }
        this.field459 = 0;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIIII)V")
    public final void method163(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = 2048 - arg4 & 2047;
        int var9 = 2048 - arg0 & 2047;
        int var10 = 0;
        int var11 = 0;
        int var12 = arg3;
        if (arg5 == 8433) {
            if (var8 != 0) {
                int var13 = class21.field948[var8];
                int var14 = class21.field949[var8];
                int var15 = var11 * var14 - arg3 * var13 >> 16;
                var12 = var11 * var13 + arg3 * var14 >> 16;
                var11 = var15;
            }
            if (var9 != 0) {
                int var16 = class21.field948[var9];
                int var17 = class21.field949[var9];
                int var18 = var10 * var17 + var12 * var16 >> 16;
                var12 = var12 * var17 - var10 * var16 >> 16;
                var10 = var18;
            }
            this.field318 = arg6 - var10;
            this.field319 = arg1 - var11;
            this.field320 = arg2 - var12;
            this.field321 = arg4;
            this.field322 = arg0;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BLUKYMLOIC;I)V")
    public final void method164(byte arg0, class61 arg1, int arg2) {
        if (arg0 != 99) {
            this.field171 = !this.field171;
        }
        this.method165(arg1.field1571, arg2, 966, arg1.field1570);
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(IIII)V")
    public final void method165(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 >= 128 && arg0 >= 128 && arg3 <= 13056 && arg0 <= 13056) {
            int var5 = this.method194(this.field442, 0, arg3, arg0) - arg1;
            int var6 = arg3 - this.field318;
            int var7 = var5 - this.field319;
            int var8 = arg0 - this.field320;
            int var9 = class21.field948[this.field321];
            int var10 = class21.field949[this.field321];
            int var11 = class21.field948[this.field322];
            int var12 = class21.field949[this.field322];
            int var13 = var6 * var12 + var8 * var11 >> 16;
            int var14 = var8 * var12 - var6 * var11 >> 16;
            int var16 = var7 * var10 - var9 * var14 >> 16;
            int var17 = 68 / arg2;
            int var18 = var7 * var9 + var10 * var14 >> 16;
            if (var18 >= 50) {
                this.field456 = (var13 << 9) / var18 + class10.field669;
                this.field457 = (var16 << 9) / var18 + class10.field670;
            } else {
                this.field456 = -1;
                this.field457 = -1;
            }
        } else {
            this.field456 = -1;
            this.field457 = -1;
        }
    }

    @OriginalMember(owner = "client", name = "v", descriptor = "(I)Z")
    public final boolean method166(int arg0) {
        while (arg0 >= 0) {
            this.field238 = this.field413.method479();
        }
        return signlink.wavereplay();
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIIIIIII)V")
    private final void method167(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        class53 var11 = null;
        class53 var12 = (class53) this.field358.method585();
        this.field195 += arg1;
        while (var12 != null) {
            if (var12.field1380 == arg4 && var12.field1382 == arg6 && var12.field1383 == arg5 && var12.field1381 == arg3) {
                var11 = var12;
                break;
            }
            var12 = (class53) this.field358.method587(0);
        }
        if (var11 == null) {
            var11 = new class53();
            var11.field1380 = arg4;
            var11.field1381 = arg3;
            var11.field1382 = arg6;
            var11.field1383 = arg5;
            this.method171(false, var11);
            this.field358.method582(var11);
        }
        var11.field1373 = arg8;
        var11.field1375 = arg9;
        var11.field1374 = arg7;
        var11.field1379 = arg2;
        var11.field1372 = arg0;
    }

    @OriginalMember(owner = "client", name = "w", descriptor = "(I)Ljava/net/Socket;")
    public final Socket method168(int arg0) throws IOException {
        return signlink.mainapp != null ? signlink.opensocket(arg0) : new Socket(InetAddress.getByName(this.getCodeBase().getHost()), arg0);
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIILFDUKJGTQ;BI)V")
    public final void method169(int arg0, int arg1, int arg2, int arg3, class15 arg4, byte arg5, int arg6) {
        if (arg5 != -12) {
            this.method197();
        }
        if (arg4.field768 == 0 && arg4.field797 != null && !arg4.field819) {
            if (arg0 >= arg3 && arg6 >= arg2 && arg0 <= arg4.field795 + arg3 && arg6 <= arg4.field816 + arg2) {
                int var8 = arg4.field797.length;
                for (int var9 = 0; var9 < var8; ++var9) {
                    int var10 = arg4.field790[var9] + arg3;
                    int var11 = arg4.field777[var9] + arg2 - arg1;
                    class15 var12 = class15.field806[arg4.field797[var9]];
                    int var13 = var12.field807 + var10;
                    int var14 = var12.field786 + var11;
                    if ((var12.field813 >= 0 || var12.field803 != 0) && arg0 >= var13 && arg6 >= var14 && arg0 < var12.field795 + var13 && arg6 < var12.field816 + var14) {
                        if (var12.field813 >= 0) {
                            this.field159 = var12.field813;
                        } else {
                            this.field159 = var12.field774;
                        }
                    }
                    if (var12.field768 == 0) {
                        this.method169(arg0, var12.field809, var14, var13, var12, (byte) -12, arg6);
                        if (var12.field805 > var12.field816) {
                            this.method193(var12.field795 + var13, var14, arg0, var12, true, var12.field816, arg6, var12.field805, -30561);
                        }
                    } else {
                        if (var12.field771 == 1 && arg0 >= var13 && arg6 >= var14 && arg0 < var12.field795 + var13 && arg6 < var12.field816 + var14) {
                            boolean var15 = false;
                            if (var12.field804 != 0) {
                                var15 = this.method211(var12, (byte) 88);
                            }
                            if (!var15) {
                                this.field349[this.field315] = var12.field827;
                                this.field213[this.field315] = 710;
                                this.field212[this.field315] = var12.field774;
                                ++this.field315;
                            }
                        }
                        if (var12.field771 == 2 && this.field570 == 0 && arg0 >= var13 && arg6 >= var14 && arg0 < var12.field795 + var13 && arg6 < var12.field816 + var14) {
                            String var16 = var12.field823;
                            if (var16.indexOf(" ") != -1) {
                                var16 = var16.substring(0, var16.indexOf(" "));
                            }
                            this.field349[this.field315] = var16 + " @gre@" + var12.field817;
                            this.field213[this.field315] = 175;
                            this.field212[this.field315] = var12.field774;
                            ++this.field315;
                        }
                        if (var12.field771 == 3 && arg0 >= var13 && arg6 >= var14 && arg0 < var12.field795 + var13 && arg6 < var12.field816 + var14) {
                            this.field349[this.field315] = "Close";
                            this.field213[this.field315] = 883;
                            this.field212[this.field315] = var12.field774;
                            ++this.field315;
                        }
                        if (var12.field771 == 4 && arg0 >= var13 && arg6 >= var14 && arg0 < var12.field795 + var13 && arg6 < var12.field816 + var14) {
                            this.field349[this.field315] = var12.field827;
                            this.field213[this.field315] = 903;
                            this.field212[this.field315] = var12.field774;
                            ++this.field315;
                        }
                        if (var12.field771 == 5 && arg0 >= var13 && arg6 >= var14 && arg0 < var12.field795 + var13 && arg6 < var12.field816 + var14) {
                            this.field349[this.field315] = var12.field827;
                            this.field213[this.field315] = 586;
                            this.field212[this.field315] = var12.field774;
                            ++this.field315;
                        }
                        if (var12.field771 == 6 && !this.field226 && arg0 >= var13 && arg6 >= var14 && arg0 < var12.field795 + var13 && arg6 < var12.field816 + var14) {
                            this.field349[this.field315] = var12.field827;
                            this.field213[this.field315] = 994;
                            this.field212[this.field315] = var12.field774;
                            ++this.field315;
                        }
                        if (var12.field768 == 2) {
                            int var17 = 0;
                            for (int var18 = 0; var18 < var12.field816; ++var18) {
                                for (int var19 = 0; var19 < var12.field795; ++var19) {
                                    int var20 = (var12.field834 + 32) * var19 + var13;
                                    int var21 = (var12.field833 + 32) * var18 + var14;
                                    if (var17 < 20) {
                                        var20 += var12.field815[var17];
                                        var21 += var12.field791[var17];
                                    }
                                    if (arg0 >= var20 && arg6 >= var21 && arg0 < var20 + 32 && arg6 < var21 + 32) {
                                        this.field439 = var17;
                                        this.field440 = var12.field774;
                                        if (var12.field814[var17] > 0) {
                                            class52 var22 = class52.method489(var12.field814[var17] - 1);
                                            if (this.field287 == 1 && var12.field829) {
                                                if (this.field289 != var12.field774 || this.field288 != var17) {
                                                    this.field349[this.field315] = "Use " + this.field291 + " with @lre@" + var22.field1321;
                                                    this.field213[this.field315] = 683;
                                                    this.field214[this.field315] = var22.field1337;
                                                    this.field211[this.field315] = var17;
                                                    this.field212[this.field315] = var12.field774;
                                                    ++this.field315;
                                                }
                                            } else if (this.field570 == 1 && var12.field829) {
                                                if ((this.field572 & 16) == 16) {
                                                    this.field349[this.field315] = this.field573 + " @lre@" + var22.field1321;
                                                    this.field213[this.field315] = 374;
                                                    this.field214[this.field315] = var22.field1337;
                                                    this.field211[this.field315] = var17;
                                                    this.field212[this.field315] = var12.field774;
                                                    ++this.field315;
                                                }
                                            } else {
                                                if (var12.field829) {
                                                    for (int var23 = 4; var23 >= 3; --var23) {
                                                        if (var22.field1356 != null && var22.field1356[var23] != null) {
                                                            this.field349[this.field315] = var22.field1356[var23] + " @lre@" + var22.field1321;
                                                            if (var23 == 3) {
                                                                this.field213[this.field315] = 894;
                                                            }
                                                            if (var23 == 4) {
                                                                this.field213[this.field315] = 369;
                                                            }
                                                            this.field214[this.field315] = var22.field1337;
                                                            this.field211[this.field315] = var17;
                                                            this.field212[this.field315] = var12.field774;
                                                            ++this.field315;
                                                        } else if (var23 == 4) {
                                                            this.field349[this.field315] = "Drop @lre@" + var22.field1321;
                                                            this.field213[this.field315] = 369;
                                                            this.field214[this.field315] = var22.field1337;
                                                            this.field211[this.field315] = var17;
                                                            this.field212[this.field315] = var12.field774;
                                                            ++this.field315;
                                                        }
                                                    }
                                                }
                                                if (var12.field820) {
                                                    this.field349[this.field315] = "Use @lre@" + var22.field1321;
                                                    this.field213[this.field315] = 979;
                                                    this.field214[this.field315] = var22.field1337;
                                                    this.field211[this.field315] = var17;
                                                    this.field212[this.field315] = var12.field774;
                                                    ++this.field315;
                                                }
                                                if (var12.field829 && var22.field1356 != null) {
                                                    for (int var24 = 2; var24 >= 0; --var24) {
                                                        if (var22.field1356[var24] != null) {
                                                            this.field349[this.field315] = var22.field1356[var24] + " @lre@" + var22.field1321;
                                                            if (var24 == 0) {
                                                                this.field213[this.field315] = 602;
                                                            }
                                                            if (var24 == 1) {
                                                                this.field213[this.field315] = 454;
                                                            }
                                                            if (var24 == 2) {
                                                                this.field213[this.field315] = 306;
                                                            }
                                                            this.field214[this.field315] = var22.field1337;
                                                            this.field211[this.field315] = var17;
                                                            this.field212[this.field315] = var12.field774;
                                                            ++this.field315;
                                                        }
                                                    }
                                                }
                                                if (var12.field832 != null) {
                                                    for (int var25 = 4; var25 >= 0; --var25) {
                                                        if (var12.field832[var25] != null) {
                                                            this.field349[this.field315] = var12.field832[var25] + " @lre@" + var22.field1321;
                                                            if (var25 == 0) {
                                                                this.field213[this.field315] = 848;
                                                            }
                                                            if (var25 == 1) {
                                                                this.field213[this.field315] = 672;
                                                            }
                                                            if (var25 == 2) {
                                                                this.field213[this.field315] = 808;
                                                            }
                                                            if (var25 == 3) {
                                                                this.field213[this.field315] = 365;
                                                            }
                                                            if (var25 == 4) {
                                                                this.field213[this.field315] = 881;
                                                            }
                                                            this.field214[this.field315] = var22.field1337;
                                                            this.field211[this.field315] = var17;
                                                            this.field212[this.field315] = var12.field774;
                                                            ++this.field315;
                                                        }
                                                    }
                                                }
                                                this.field349[this.field315] = "Examine @lre@" + var22.field1321;
                                                this.field213[this.field315] = 1435;
                                                this.field214[this.field315] = var22.field1337;
                                                this.field211[this.field315] = var17;
                                                this.field212[this.field315] = var12.field774;
                                                ++this.field315;
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

    @OriginalMember(owner = "client", name = "m", descriptor = "(Z)V")
    public final void method170(boolean arg0) {
        if (arg0) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        if (this.field315 >= 2 || this.field287 != 0 || this.field570 != 0) {
            String var3;
            if (this.field287 == 1 && this.field315 < 2) {
                var3 = "Use " + this.field291 + " with...";
            } else if (this.field570 == 1 && this.field315 < 2) {
                var3 = this.field573 + "...";
            } else {
                var3 = this.field349[this.field315 - 1];
            }
            if (this.field315 > 2) {
                var3 = var3 + "@whi@ / " + (this.field315 - 2) + " more options";
            }
            this.field162.method473(field329 / 1000, 16777215, 15, true, true, var3, 4);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZLQVTBMRGW;)V")
    private final void method171(boolean arg0, class53 arg1) {
        int var3 = 0;
        int var4 = -1;
        int var5 = 0;
        int var6 = 0;
        if (arg1.field1381 == 0) {
            var3 = this.field403.method533(arg1.field1380, arg1.field1382, arg1.field1383);
        }
        if (arg1.field1381 == 1) {
            var3 = this.field403.method534(arg1.field1383, (byte) 5, arg1.field1382, arg1.field1380);
        }
        if (arg1.field1381 == 2) {
            var3 = this.field403.method535(arg1.field1380, arg1.field1382, arg1.field1383);
        }
        if (arg1.field1381 == 3) {
            var3 = this.field403.method536(arg1.field1380, arg1.field1382, arg1.field1383);
        }
        if (var3 != 0) {
            int var7 = this.field403.method537(arg1.field1380, arg1.field1382, arg1.field1383, var3);
            var4 = var3 >> 14 & 32767;
            var5 = var7 & 31;
            var6 = var7 >> 6;
        }
        arg1.field1376 = var4;
        arg1.field1378 = var5;
        if (arg0) {
            for (int var8 = 1; var8 > 0; ++var8) {
            }
        }
        arg1.field1377 = var6;
    }

    @OriginalMember(owner = "client", name = "n", descriptor = "(Z)V")
    public final void method172(boolean arg0) {
        int var2 = this.field486 * 128 + 64;
        int var3 = this.field487 * 128 + 64;
        int var4 = this.method194(this.field442, 0, var2, var3) - this.field488;
        this.field512 &= arg0;
        if (this.field318 < var2) {
            this.field318 += (var2 - this.field318) * this.field490 / 1000 + this.field489;
            if (this.field318 > var2) {
                this.field318 = var2;
            }
        }
        if (this.field318 > var2) {
            this.field318 -= (this.field318 - var2) * this.field490 / 1000 + this.field489;
            if (this.field318 < var2) {
                this.field318 = var2;
            }
        }
        if (this.field319 < var4) {
            this.field319 += (var4 - this.field319) * this.field490 / 1000 + this.field489;
            if (this.field319 > var4) {
                this.field319 = var4;
            }
        }
        if (this.field319 > var4) {
            this.field319 -= (this.field319 - var4) * this.field490 / 1000 + this.field489;
            if (this.field319 < var4) {
                this.field319 = var4;
            }
        }
        if (this.field320 < var3) {
            this.field320 += (var3 - this.field320) * this.field490 / 1000 + this.field489;
            if (this.field320 > var3) {
                this.field320 = var3;
            }
        }
        if (this.field320 > var3) {
            this.field320 -= (this.field320 - var3) * this.field490 / 1000 + this.field489;
            if (this.field320 < var3) {
                this.field320 = var3;
            }
        }
        int var5 = this.field201 * 128 + 64;
        int var6 = this.field202 * 128 + 64;
        int var7 = this.method194(this.field442, 0, var5, var6) - this.field203;
        int var8 = var5 - this.field318;
        int var9 = var7 - this.field319;
        int var10 = var6 - this.field320;
        int var11 = (int) Math.sqrt((double) (var8 * var8 + var10 * var10));
        int var12 = (int) (Math.atan2((double) var9, (double) var11) * 325.949D) & 2047;
        int var13 = (int) (Math.atan2((double) var8, (double) var10) * -325.949D) & 2047;
        if (var12 < 128) {
            var12 = 128;
        }
        if (var12 > 383) {
            var12 = 383;
        }
        if (this.field321 < var12) {
            this.field321 += (var12 - this.field321) * this.field205 / 1000 + this.field204;
            if (this.field321 > var12) {
                this.field321 = var12;
            }
        }
        if (this.field321 > var12) {
            this.field321 -= (this.field321 - var12) * this.field205 / 1000 + this.field204;
            if (this.field321 < var12) {
                this.field321 = var12;
            }
        }
        int var14 = var13 - this.field322;
        if (var14 > 1024) {
            var14 -= 2048;
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (var14 > 0) {
            this.field322 += this.field205 * var14 / 1000 + this.field204;
            this.field322 &= 2047;
        }
        if (var14 < 0) {
            this.field322 -= -var14 * this.field205 / 1000 + this.field204;
            this.field322 &= 2047;
        }
        int var15 = var13 - this.field322;
        if (var15 > 1024) {
            var15 -= 2048;
        }
        if (var15 < -1024) {
            var15 += 2048;
        }
        if (var15 < 0 && var14 > 0 || var15 > 0 && var14 < 0) {
            this.field322 = var13;
        }
    }

    @OriginalMember(owner = "client", name = "j", descriptor = "(B)V")
    public final void method173(byte arg0) {
        if (arg0 != -48) {
            this.field543 = this.field413.method479();
        }
        this.field234.method289(true);
        if (this.field411 == 2) {
            byte[] var2 = this.field301.field1184;
            int[] var3 = class35.field1129;
            int var4 = var2.length;
            for (int var5 = 0; var5 < var4; ++var5) {
                if (var2[var5] == 0) {
                    var3[var5] = 0;
                }
            }
            this.field245.method433(this.field423, 256, this.field338, 33, 25, (byte) 41, 0, 33, 0, this.field380, 25);
            this.field235.method289(true);
        } else {
            int var6 = this.field380 + this.field365 & 2047;
            int var7 = field557.field1570 / 32 + 48;
            int var8 = 464 - field557.field1571 / 32;
            this.field334.method433(this.field186, this.field574 + 256, this.field410, 151, var7, (byte) 41, 25, 146, 5, var6, var8);
            this.field245.method433(this.field423, 256, this.field338, 33, 25, (byte) 41, 0, 33, 0, this.field380, 25);
            for (int var9 = 0; var9 < this.field140; ++var9) {
                int var39 = this.field141[var9] * 4 + 2 - field557.field1570 / 32;
                int var40 = this.field142[var9] * 4 + 2 - field557.field1571 / 32;
                this.method137(var39, this.field494[var9], 9, var40);
            }
            for (int var10 = 0; var10 < 104; ++var10) {
                for (int var35 = 0; var35 < 104; ++var35) {
                    class69 var36 = this.field398[this.field442][var10][var35];
                    if (var36 != null) {
                        int var37 = var10 * 4 + 2 - field557.field1570 / 32;
                        int var38 = var35 * 4 + 2 - field557.field1571 / 32;
                        this.method137(var37, this.field479, 9, var38);
                    }
                }
            }
            for (int var11 = 0; var11 < this.field248; ++var11) {
                class55 var31 = this.field247[this.field249[var11]];
                if (var31 != null && var31.method368(-32976)) {
                    class4 var32 = var31.field1398;
                    if (var32.field82 != null) {
                        var32 = var32.method27(-20711);
                    }
                    if (var32 != null && var32.field99) {
                        int var33 = var31.field1570 / 32 - field557.field1570 / 32;
                        int var34 = var31.field1571 / 32 - field557.field1571 / 32;
                        this.method137(var33, this.field480, 9, var34);
                    }
                }
            }
            for (int var12 = 0; var12 < this.field221; ++var12) {
                class22 var23 = this.field220[this.field222[var12]];
                if (var23 != null && var23.method368(-32976)) {
                    int var24 = var23.field1570 / 32 - field557.field1570 / 32;
                    int var25 = var23.field1571 / 32 - field557.field1571 / 32;
                    boolean var26 = false;
                    long var27 = class31.method388(var23.field973);
                    for (int var29 = 0; var29 < this.field435; ++var29) {
                        if (this.field524[var29] == var27 && this.field507[var29] != 0) {
                            var26 = true;
                            break;
                        }
                    }
                    boolean var30 = false;
                    if (field557.field978 != 0 && var23.field978 != 0 && field557.field978 == var23.field978) {
                        var30 = true;
                    }
                    if (var26) {
                        this.method137(var24, this.field482, 9, var25);
                    } else if (var30) {
                        this.method137(var24, this.field483, 9, var25);
                    } else {
                        this.method137(var24, this.field481, 9, var25);
                    }
                }
            }
            if (this.field404 != 0 && field329 % 20 < 10) {
                if (this.field404 == 1 && this.field293 >= 0 && this.field293 < this.field247.length) {
                    class55 var13 = this.field247[this.field293];
                    if (var13 != null) {
                        int var14 = var13.field1570 / 32 - field557.field1570 / 32;
                        int var15 = var13.field1571 / 32 - field557.field1571 / 32;
                        this.method187(this.field470, 9858, var14, var15);
                    }
                }
                if (this.field404 == 2) {
                    int var16 = (this.field446 - this.field545) * 4 + 2 - field557.field1570 / 32;
                    int var17 = (this.field447 - this.field546) * 4 + 2 - field557.field1571 / 32;
                    this.method187(this.field470, 9858, var16, var17);
                }
                if (this.field404 == 10 && this.field153 >= 0 && this.field153 < this.field220.length) {
                    class22 var18 = this.field220[this.field153];
                    if (var18 != null) {
                        int var19 = var18.field1570 / 32 - field557.field1570 / 32;
                        int var20 = var18.field1571 / 32 - field557.field1571 / 32;
                        this.method187(this.field470, 9858, var19, var20);
                    }
                }
            }
            if (this.field332 != 0) {
                int var21 = this.field332 * 4 + 2 - field557.field1570 / 32;
                int var22 = this.field333 * 4 + 2 - field557.field1571 / 32;
                this.method137(var21, this.field469, 9, var22);
            }
            class35.method417(466, 78, 3, 97, 3, 16777215);
            this.field235.method289(true);
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(II)V")
    public final void method174(int arg0, int arg1) {
        if (arg0 < 2 || arg0 > 2) {
            this.field196 = -1;
        }
        if (!field275) {
            if (class10.field683[17] >= arg1) {
                class38 var3 = class10.field677[17];
                int var4 = var3.field1187 * var3.field1186 - 1;
                int var5 = this.field459 * var3.field1186 * 2;
                byte[] var6 = var3.field1184;
                byte[] var7 = this.field150;
                for (int var8 = 0; var8 <= var4; ++var8) {
                    var7[var8] = var6[var8 - var5 & var4];
                }
                var3.field1184 = var7;
                this.field150 = var6;
                class10.method244((byte) 8, 17);
            }
            if (class10.field683[24] >= arg1) {
                class38 var9 = class10.field677[24];
                int var10 = var9.field1187 * var9.field1186 - 1;
                int var11 = this.field459 * var9.field1186 * 2;
                byte[] var12 = var9.field1184;
                byte[] var13 = this.field150;
                for (int var14 = 0; var14 <= var10; ++var14) {
                    var13[var14] = var12[var14 - var11 & var10];
                }
                var9.field1184 = var13;
                this.field150 = var12;
                class10.method244((byte) 8, 24);
                ++field174;
                if (field174 > 190) {
                    field174 = 0;
                    this.field608.method33((byte) 57, 25);
                    this.field608.method34(89);
                }
            }
            if (class10.field683[34] >= arg1) {
                class38 var15 = class10.field677[34];
                int var16 = var15.field1187 * var15.field1186 - 1;
                int var17 = this.field459 * var15.field1186 * 2;
                byte[] var18 = var15.field1184;
                byte[] var19 = this.field150;
                for (int var20 = 0; var20 <= var16; ++var20) {
                    var19[var20] = var18[var20 - var17 & var16];
                }
                var15.field1184 = var19;
                this.field150 = var18;
                class10.method244((byte) 8, 34);
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "k", descriptor = "(B)V")
    private final void method175(byte arg0) {
        if (this.field544 == arg0) {
            boolean var2 = false;
        } else {
            this.method197();
        }
        for (class53 var3 = (class53) this.field358.method585(); var3 != null; var3 = (class53) this.field358.method587(0)) {
            if (var3.field1372 == -1) {
                var3.field1379 = 0;
                this.method171(false, var3);
            } else {
                var3.method450();
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Z)V")
    public final void method176(boolean arg0) {
        signlink.reporterror = false;
        try {
            if (this.field305 != null) {
                this.field305.method229();
            }
        } catch (Exception var3) {
        }
        this.field305 = null;
        this.method87((byte) 4);
        if (this.field383 != null) {
            this.field383.field1407 = false;
        }
        this.field383 = null;
        this.field374.method270();
        this.field374 = null;
        this.field246 = null;
        this.field608 = null;
        this.field170 = null;
        this.field299 = null;
        this.field526 = null;
        this.field276 = null;
        this.field192 = null;
        this.field527 = null;
        this.field528 = null;
        this.field193 = null;
        this.field535 = null;
        this.field403 = null;
        this.field350 = null;
        this.field191 = null;
        this.field419 = null;
        this.field499 = null;
        this.field500 = null;
        this.field150 = null;
        this.field233 = null;
        this.field234 = null;
        this.field235 = null;
        this.field236 = null;
        this.field376 = null;
        this.field377 = null;
        this.field378 = null;
        this.field277 = null;
        this.field278 = null;
        this.field279 = null;
        this.field280 = null;
        this.field281 = null;
        this.field282 = null;
        this.field283 = null;
        this.field284 = null;
        this.field285 = null;
        this.field300 = null;
        this.field301 = null;
        this.field302 = null;
        this.field324 = null;
        this.field325 = null;
        this.field326 = null;
        this.field181 = null;
        this.field558 = null;
        this.field559 = null;
        this.field560 = null;
        this.field561 = null;
        this.field562 = null;
        this.field388 = null;
        this.field389 = null;
        this.field390 = null;
        this.field391 = null;
        this.field392 = null;
        this.field245 = null;
        this.field537 = null;
        this.field437 = null;
        this.field491 = null;
        this.field479 = null;
        this.field480 = null;
        this.field481 = null;
        this.field482 = null;
        this.field483 = null;
        this.field304 = null;
        this.field155 = null;
        this.field415 = null;
        this.field220 = null;
        this.field222 = null;
        this.field224 = null;
        this.field225 = null;
        this.field354 = null;
        this.field247 = null;
        this.field249 = null;
        this.field398 = null;
        this.field358 = null;
        this.field466 = null;
        this.field355 = null;
        this.field211 = null;
        this.field212 = null;
        this.field213 = null;
        this.field214 = null;
        this.field349 = null;
        this.field395 = null;
        this.field141 = null;
        this.field142 = null;
        this.field494 = null;
        this.field334 = null;
        this.field336 = null;
        this.field524 = null;
        this.field507 = null;
        this.field261 = null;
        this.field262 = null;
        this.field258 = null;
        this.field259 = null;
        this.field260 = null;
        this.field263 = null;
        this.field264 = null;
        this.field265 = null;
        this.field266 = null;
        this.method179((byte) 9);
        class64.method570(0);
        class4.method30(0);
        class52.method499(0);
        class6.field621 = null;
        class29.field1052 = null;
        class15.field806 = null;
        class54.field1384 = null;
        class39.field1195 = null;
        class63.field1588 = null;
        class63.field1600 = null;
        class9.field648 = null;
        super.field1101 = null;
        class22.field972 = null;
        class10.method237(0);
        class59.method506(0);
        class21.method337(0);
        class14.method280(0);
        System.gc();
        if (!arg0) {
            if (class45.field1265) {
            }
        } else {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZB)V")
    public final void method177(boolean arg0, byte arg1) {
        this.method130((byte) -13);
        this.field260.method289(true);
        this.field308.method442(0, 0, false);
        short var3 = 360;
        short var4 = 200;
        if (arg1 != -51) {
            this.field503 = 158;
        }
        if (this.field179 == 0) {
            int var5 = var4 / 2 + 80;
            this.field160.method465(var3 / 2, (byte) 68, this.field374.field740, var5, 7711145, true);
            int var6 = var4 / 2 - 20;
            this.field162.method465(var3 / 2, (byte) 68, "Welcome to RuneScape", var6, 16776960, true);
            int var17 = var6 + 30;
            int var7 = var3 / 2 - 80;
            int var8 = var4 / 2 + 20;
            this.field309.method442(var8 - 20, var7 - 73, false);
            this.field162.method465(var7, (byte) 68, "New User", var8 + 5, 16777215, true);
            int var9 = var3 / 2 + 80;
            this.field309.method442(var8 - 20, var9 - 73, false);
            this.field162.method465(var9, (byte) 68, "Existing User", var8 + 5, 16777215, true);
        }
        if (this.field179 == 2) {
            int var10 = var4 / 2 - 40;
            if (this.field597.length() > 0) {
                this.field162.method465(var3 / 2, (byte) 68, this.field597, var10 - 15, 16776960, true);
                this.field162.method465(var3 / 2, (byte) 68, this.field598, var10, 16776960, true);
                var10 += 30;
            } else {
                this.field162.method465(var3 / 2, (byte) 68, this.field598, var10 - 7, 16776960, true);
                var10 += 30;
            }
            this.field162.method472(var3 / 2 - 90, true, 16777215, var10, "Username: " + this.field136 + (this.field593 == 0 & field329 % 40 < 20 ? "@yel@|" : ""), (byte) 5);
            var10 += 15;
            this.field162.method472(var3 / 2 - 88, true, 16777215, var10, "Password: " + class31.method393(this.field137, 4) + (this.field593 == 1 & field329 % 40 < 20 ? "@yel@|" : ""), (byte) 5);
            var10 += 15;
            if (!arg0) {
                int var11 = var3 / 2 - 80;
                int var12 = var4 / 2 + 50;
                this.field309.method442(var12 - 20, var11 - 73, false);
                this.field162.method465(var11, (byte) 68, "Login", var12 + 5, 16777215, true);
                int var13 = var3 / 2 + 80;
                this.field309.method442(var12 - 20, var13 - 73, false);
                this.field162.method465(var13, (byte) 68, "Cancel", var12 + 5, 16777215, true);
            }
        }
        if (this.field179 == 3) {
            this.field162.method465(var3 / 2, (byte) 68, "Create a free account", var4 / 2 - 60, 16776960, true);
            int var14 = var4 / 2 - 35;
            this.field162.method465(var3 / 2, (byte) 68, "To create a new account you need to", var14, 16777215, true);
            int var18 = var14 + 15;
            this.field162.method465(var3 / 2, (byte) 68, "go back to the main RuneScape webpage", var18, 16777215, true);
            int var19 = var18 + 15;
            this.field162.method465(var3 / 2, (byte) 68, "and choose the red 'create account'", var19, 16777215, true);
            int var20 = var19 + 15;
            this.field162.method465(var3 / 2, (byte) 68, "button at the top right of that page.", var20, 16777215, true);
            int var21 = var20 + 15;
            int var15 = var3 / 2;
            int var16 = var4 / 2 + 50;
            this.field309.method442(var16 - 20, var15 - 73, false);
            this.field162.method465(var15, (byte) 68, "Cancel", var16 + 5, 16777215, true);
        }
        this.field260.method290(1, 171, 202, super.field1100);
        if (this.field514) {
            this.field514 = false;
            this.field258.method290(1, 0, 128, super.field1100);
            this.field259.method290(1, 371, 202, super.field1100);
            this.field263.method290(1, 265, 0, super.field1100);
            this.field264.method290(1, 265, 562, super.field1100);
            this.field265.method290(1, 171, 128, super.field1100);
            this.field266.method290(1, 171, 562, super.field1100);
        }
    }

    @OriginalMember(owner = "client", name = "l", descriptor = "(B)V")
    public final void method178(byte arg0) {
        if (arg0 != 0) {
            this.field196 = -1;
        }
        for (int var2 = -1; var2 < this.field221; ++var2) {
            int var6;
            if (var2 == -1) {
                var6 = this.field219;
            } else {
                var6 = this.field222[var2];
            }
            class22 var7 = this.field220[var6];
            if (var7 != null && var7.field1558 > 0) {
                --var7.field1558;
                if (var7.field1558 == 0) {
                    var7.field1529 = null;
                }
            }
        }
        for (int var3 = 0; var3 < this.field248; ++var3) {
            int var4 = this.field249[var3];
            class55 var5 = this.field247[var4];
            if (var5 != null && var5.field1558 > 0) {
                --var5.field1558;
                if (var5.field1558 == 0) {
                    var5.field1529 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "m", descriptor = "(B)V")
    public final void method179(byte arg0) {
        this.field367 = false;
        while (this.field510) {
            this.field367 = false;
            try {
                Thread.sleep(50L);
            } catch (Exception var2) {
            }
        }
        this.field308 = null;
        if (this.field323 != arg0) {
            this.field196 = this.field299.method44();
        }
        this.field309 = null;
        this.field173 = null;
        this.field145 = null;
        this.field146 = null;
        this.field147 = null;
        this.field148 = null;
        this.field363 = null;
        this.field364 = null;
        this.field616 = null;
        this.field617 = null;
        this.field492 = null;
        this.field493 = null;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIBIIIIIZIII)Z")
    public final boolean method180(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9, int arg10, int arg11) {
        byte var13 = 104;
        byte var14 = 104;
        for (int var15 = 0; var15 < var13; ++var15) {
            for (int var35 = 0; var35 < var14; ++var35) {
                this.field191[var15][var35] = 0;
                this.field419[var15][var35] = 99999999;
            }
        }
        int var16 = arg7;
        int var17 = arg6;
        this.field191[arg7][arg6] = 99;
        this.field419[arg7][arg6] = 0;
        byte var18 = 0;
        int var19 = 0;
        this.field499[var18] = arg7;
        int var36 = var18 + 1;
        this.field500[var18] = arg6;
        boolean var20 = false;
        int var21 = this.field499.length;
        int[][] var22 = this.field350[this.field442].field1286;
        while (var36 != var19) {
            var16 = this.field499[var19];
            var17 = this.field500[var19];
            var19 = (var19 + 1) % var21;
            if (arg11 == var16 && arg4 == var17) {
                var20 = true;
                break;
            }
            if (arg9 != 0) {
                if ((arg9 < 5 || arg9 == 10) && this.field350[this.field442].method460(var16, var17, arg5, 691, arg4, arg11, arg9 - 1)) {
                    var20 = true;
                    break;
                }
                if (arg9 < 10 && this.field350[this.field442].method461(arg11, arg9 - 1, arg4, var16, arg5, 0, var17)) {
                    var20 = true;
                    break;
                }
            }
            if (arg3 != 0 && arg1 != 0 && this.field350[this.field442].method462(true, arg10, arg4, var16, arg1, var17, arg11, arg3)) {
                var20 = true;
                break;
            }
            int var34 = this.field419[var16][var17] + 1;
            if (var16 > 0 && this.field191[var16 - 1][var17] == 0 && (var22[var16 - 1][var17] & 19398920) == 0) {
                this.field499[var36] = var16 - 1;
                this.field500[var36] = var17;
                var36 = (var36 + 1) % var21;
                this.field191[var16 - 1][var17] = 2;
                this.field419[var16 - 1][var17] = var34;
            }
            if (var16 < var13 - 1 && this.field191[var16 + 1][var17] == 0 && (var22[var16 + 1][var17] & 19399040) == 0) {
                this.field499[var36] = var16 + 1;
                this.field500[var36] = var17;
                var36 = (var36 + 1) % var21;
                this.field191[var16 + 1][var17] = 8;
                this.field419[var16 + 1][var17] = var34;
            }
            if (var17 > 0 && this.field191[var16][var17 - 1] == 0 && (var22[var16][var17 - 1] & 19398914) == 0) {
                this.field499[var36] = var16;
                this.field500[var36] = var17 - 1;
                var36 = (var36 + 1) % var21;
                this.field191[var16][var17 - 1] = 1;
                this.field419[var16][var17 - 1] = var34;
            }
            if (var17 < var14 - 1 && this.field191[var16][var17 + 1] == 0 && (var22[var16][var17 + 1] & 19398944) == 0) {
                this.field499[var36] = var16;
                this.field500[var36] = var17 + 1;
                var36 = (var36 + 1) % var21;
                this.field191[var16][var17 + 1] = 4;
                this.field419[var16][var17 + 1] = var34;
            }
            if (var16 > 0 && var17 > 0 && this.field191[var16 - 1][var17 - 1] == 0 && (var22[var16 - 1][var17 - 1] & 19398926) == 0 && (var22[var16 - 1][var17] & 19398920) == 0 && (var22[var16][var17 - 1] & 19398914) == 0) {
                this.field499[var36] = var16 - 1;
                this.field500[var36] = var17 - 1;
                var36 = (var36 + 1) % var21;
                this.field191[var16 - 1][var17 - 1] = 3;
                this.field419[var16 - 1][var17 - 1] = var34;
            }
            if (var16 < var13 - 1 && var17 > 0 && this.field191[var16 + 1][var17 - 1] == 0 && (var22[var16 + 1][var17 - 1] & 19399043) == 0 && (var22[var16 + 1][var17] & 19399040) == 0 && (var22[var16][var17 - 1] & 19398914) == 0) {
                this.field499[var36] = var16 + 1;
                this.field500[var36] = var17 - 1;
                var36 = (var36 + 1) % var21;
                this.field191[var16 + 1][var17 - 1] = 9;
                this.field419[var16 + 1][var17 - 1] = var34;
            }
            if (var16 > 0 && var17 < var14 - 1 && this.field191[var16 - 1][var17 + 1] == 0 && (var22[var16 - 1][var17 + 1] & 19398968) == 0 && (var22[var16 - 1][var17] & 19398920) == 0 && (var22[var16][var17 + 1] & 19398944) == 0) {
                this.field499[var36] = var16 - 1;
                this.field500[var36] = var17 + 1;
                var36 = (var36 + 1) % var21;
                this.field191[var16 - 1][var17 + 1] = 6;
                this.field419[var16 - 1][var17 + 1] = var34;
            }
            if (var16 < var13 - 1 && var17 < var14 - 1 && this.field191[var16 + 1][var17 + 1] == 0 && (var22[var16 + 1][var17 + 1] & 19399136) == 0 && (var22[var16 + 1][var17] & 19399040) == 0 && (var22[var16][var17 + 1] & 19398944) == 0) {
                this.field499[var36] = var16 + 1;
                this.field500[var36] = var17 + 1;
                var36 = (var36 + 1) % var21;
                this.field191[var16 + 1][var17 + 1] = 12;
                this.field419[var16 + 1][var17 + 1] = var34;
            }
        }
        this.field182 = 0;
        if (!var20) {
            if (arg8) {
                int var23 = 100;
                for (int var24 = 1; var24 < 2; ++var24) {
                    for (int var25 = arg11 - var24; var25 <= arg11 + var24; ++var25) {
                        for (int var26 = arg4 - var24; var26 <= arg4 + var24; ++var26) {
                            if (var25 >= 0 && var26 >= 0 && var25 < 104 && var26 < 104 && this.field419[var25][var26] < var23) {
                                var23 = this.field419[var25][var26];
                                var16 = var25;
                                var17 = var26;
                                this.field182 = 1;
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
        this.field499[var27] = var16;
        int var37 = var27 + 1;
        this.field500[var27] = var17;
        if (arg2 != -3) {
            this.field608.method34(209);
        }
        int var28;
        int var29 = var28 = this.field191[var16][var17];
        while (arg7 != var16 || arg6 != var17) {
            if (var28 != var29) {
                var28 = var29;
                this.field499[var37] = var16;
                this.field500[var37++] = var17;
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
            var29 = this.field191[var16][var17];
        }
        if (var37 <= 0) {
            if (arg0 == 1) {
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
            int var31 = this.field499[var37];
            int var32 = this.field500[var37];
            field468 += var30;
            if (field468 >= 81) {
                this.field608.method33((byte) 57, 135);
                this.field608.method34(54);
                field468 = 0;
            }
            if (arg0 == 0) {
                this.field608.method33((byte) 57, 39);
                this.field608.method34(var30 + var30 + 3);
            }
            if (arg0 == 1) {
                this.field608.method33((byte) 57, 82);
                this.field608.method34(var30 + var30 + 3 + 14);
            }
            if (arg0 == 2) {
                this.field608.method33((byte) 57, 144);
                this.field608.method34(var30 + var30 + 3);
            }
            this.field608.method70(43385, this.field545 + var31);
            this.field608.method35(this.field546 + var32);
            this.field332 = this.field499[0];
            this.field333 = this.field500[0];
            for (int var33 = 1; var33 < var30; ++var33) {
                --var37;
                this.field608.method61((byte) -67, this.field499[var37] - var31);
                this.field608.method60(this.field500[var37] - var32, 47636);
            }
            this.field608.method61((byte) -67, super.field1118[5] == 1 ? 1 : 0);
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;I)V")
    public final void method181(String arg0, int arg1, String arg2, int arg3) {
        if (arg3 == 0 && this.field432 != -1) {
            this.field438 = arg2;
            super.field1114 = 0;
        }
        if (this.field472 == -1) {
            this.field578 = true;
        }
        for (int var5 = 99; var5 > 0; --var5) {
            this.field360[var5] = this.field360[var5 - 1];
            this.field361[var5] = this.field361[var5 - 1];
            this.field362[var5] = this.field362[var5 - 1];
        }
        this.field360[0] = arg3;
        this.field361[0] = arg0;
        this.field362[0] = arg2;
        if (arg1 >= 0) {
            for (int var6 = 1; var6 > 0; ++var6) {
            }
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(ZI)Z")
    public final boolean method182(boolean arg0, int arg1) {
        if (arg1 < 0) {
            return false;
        } else {
            int var3 = this.field213[arg1];
            this.field512 &= arg0;
            if (var3 >= 2000) {
                var3 -= 2000;
            }
            return var3 == 144;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILCKBTFRZM;IILGPPDQFCV;)V")
    private final void method183(int arg0, class5 arg1, int arg2, int arg3, class22 arg4) {
        if (arg0 != 0) {
            this.field407 = !this.field407;
        }
        if ((arg3 & 1024) != 0) {
            arg4.field1536 = arg1.method46();
            int var6 = arg1.method78((byte) 3);
            arg4.field1540 = var6 >> 16;
            arg4.field1539 = (var6 & 65535) + field329;
            arg4.field1537 = 0;
            arg4.field1538 = 0;
            if (arg4.field1539 > field329) {
                arg4.field1537 = -1;
            }
            if (arg4.field1536 == 65535) {
                arg4.field1536 = -1;
            }
        }
        if ((arg3 & 64) != 0) {
            int var7 = arg1.method64(-768);
            byte[] var8 = new byte[var7];
            class5 var9 = new class5(2, var8);
            arg1.method53((byte) 68, var8, 0, var7);
            this.field225[arg2] = var9;
            arg4.method367(var9, -855);
        }
        if ((arg3 & 128) != 0) {
            arg4.field1552 = arg1.method71(0);
            if (arg4.field1552 == 65535) {
                arg4.field1552 = -1;
            }
        }
        if ((arg3 & 256) != 0) {
            int var10 = arg1.method62(false);
            int var11 = arg1.method62(false);
            arg4.method558(-196, var10, var11, field329);
            arg4.field1530 = field329 + 300;
            arg4.field1531 = arg1.method44();
            arg4.field1532 = arg1.method64(-768);
        }
        if ((arg3 & 8) != 0) {
            int var12 = arg1.method73(this.field532);
            if (var12 == 65535) {
                var12 = -1;
            }
            int var13 = arg1.method62(false);
            if (arg4.field1542 == var12 && var12 != -1) {
                int var14 = class39.field1195[var12].field1209;
                if (var14 == 1) {
                    arg4.field1543 = 0;
                    arg4.field1544 = 0;
                    arg4.field1545 = var13;
                    arg4.field1546 = 0;
                }
                if (var14 == 2) {
                    arg4.field1546 = 0;
                }
            } else if (var12 == -1 || arg4.field1542 == -1 || class39.field1195[var12].field1203 >= class39.field1195[arg4.field1542].field1203) {
                arg4.field1542 = var12;
                arg4.field1543 = 0;
                arg4.field1544 = 0;
                arg4.field1545 = var13;
                arg4.field1546 = 0;
                arg4.field1535 = arg4.field1559;
            }
        }
        if ((arg3 & 32) != 0) {
            arg4.field1529 = arg1.method51();
            if (arg4.field1529.charAt(0) == '~') {
                arg4.field1529 = arg4.field1529.substring(1);
                this.method181(arg4.field973, -979, arg4.field1529, 2);
            } else if (field557 == arg4) {
                this.method181(arg4.field973, -979, arg4.field1529, 2);
            }
            arg4.field1528 = 0;
            arg4.field1534 = 0;
            arg4.field1558 = 150;
        }
        if ((arg3 & 1) != 0) {
            int var15 = arg1.method62(false);
            int var16 = arg1.method64(-768);
            arg4.method558(-196, var15, var16, field329);
            arg4.field1530 = field329 + 300;
            arg4.field1531 = arg1.method62(false);
            arg4.field1532 = arg1.method63((byte) -120);
        }
        if ((arg3 & 2) != 0) {
            arg4.field1553 = arg1.method71(0);
            arg4.field1554 = arg1.method72(3);
        }
        if ((arg3 & 512) != 0) {
            arg4.field1560 = arg1.method63((byte) -120);
            arg4.field1562 = arg1.method44();
            arg4.field1561 = arg1.method64(-768);
            arg4.field1563 = arg1.method64(-768);
            arg4.field1564 = arg1.method73(this.field532) + field329;
            arg4.field1565 = arg1.method73(this.field532) + field329;
            arg4.field1566 = arg1.method44();
            arg4.method560(6);
        }
        if ((arg3 & 4) != 0) {
            int var17 = arg1.method71(0);
            int var18 = arg1.method62(false);
            int var19 = arg1.method63((byte) -120);
            int var20 = arg1.field123;
            if (arg4.field973 != null && arg4.field970) {
                long var21 = class31.method388(arg4.field973);
                boolean var23 = false;
                if (var18 <= 1) {
                    for (int var24 = 0; var24 < this.field475; ++var24) {
                        if (this.field516[var24] == var21) {
                            var23 = true;
                            break;
                        }
                    }
                }
                if (!var23 && this.field237 == 0) {
                    try {
                        this.field246.field123 = 0;
                        arg1.method82(this.field244, var19, 0, this.field246.field122);
                        this.field246.field123 = 0;
                        String var25 = class28.method379(var19, this.field246, -21407);
                        String var26 = class19.method305(this.field154, var25);
                        arg4.field1529 = var26;
                        arg4.field1528 = var17 >> 8;
                        arg4.field1534 = var17 & 255;
                        arg4.field1558 = 150;
                        if (var18 != 2 && var18 != 3) {
                            if (var18 == 1) {
                                this.method181("@cr1@" + arg4.field973, -979, var26, 1);
                            } else {
                                this.method181(arg4.field973, -979, var26, 2);
                            }
                        } else {
                            this.method181("@cr2@" + arg4.field973, -979, var26, 1);
                        }
                    } catch (Exception var28) {
                        signlink.reporterror("cde2");
                    }
                }
            }
            arg1.field123 = var19 + var20;
        }
    }

    @OriginalMember(owner = "client", name = "n", descriptor = "(B)V")
    public final void method184(byte arg0) {
        if (arg0 != 3) {
            this.field196 = this.field299.method44();
        }
        try {
            int var2 = field557.field1570 + this.field372;
            int var3 = field557.field1571 + this.field206;
            if (this.field460 - var2 < -500 || this.field460 - var2 > 500 || this.field461 - var3 < -500 || this.field461 - var3 > 500) {
                this.field460 = var2;
                this.field461 = var3;
            }
            if (this.field460 != var2) {
                this.field460 += (var2 - this.field460) / 16;
            }
            if (this.field461 != var3) {
                this.field461 += (var3 - this.field461) / 16;
            }
            if (super.field1118[1] == 1) {
                this.field381 += (-24 - this.field381) / 2;
            } else if (super.field1118[2] == 1) {
                this.field381 += (24 - this.field381) / 2;
            } else {
                this.field381 /= 2;
            }
            if (super.field1118[3] == 1) {
                this.field382 += (12 - this.field382) / 2;
            } else if (super.field1118[4] == 1) {
                this.field382 += (-12 - this.field382) / 2;
            } else {
                this.field382 /= 2;
            }
            this.field380 = this.field381 / 2 + this.field380 & 2047;
            this.field379 += this.field382 / 2;
            if (this.field379 < 128) {
                this.field379 = 128;
            }
            if (this.field379 > 383) {
                this.field379 = 383;
            }
            int var4 = this.field460 >> 7;
            int var5 = this.field461 >> 7;
            int var6 = this.method194(this.field442, 0, this.field460, this.field461);
            int var7 = 0;
            if (var4 > 3 && var5 > 3 && var4 < 100 && var5 < 100) {
                for (int var8 = var4 - 4; var8 <= var4 + 4; ++var8) {
                    for (int var9 = var5 - 4; var9 <= var5 + 4; ++var9) {
                        int var10 = this.field442;
                        if (var10 < 3 && (this.field535[1][var8][var9] & 2) == 2) {
                            ++var10;
                        }
                        int var11 = var6 - this.field193[var10][var8][var9];
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
            if (var12 > this.field458) {
                this.field458 += (var12 - this.field458) / 24;
            } else if (var12 < this.field458) {
                this.field458 += (var12 - this.field458) / 80;
            }
        } catch (Exception var13) {
            signlink.reporterror("glfc_ex " + field557.field1570 + "," + field557.field1571 + "," + this.field460 + "," + this.field461 + "," + this.field228 + "," + this.field229 + "," + this.field545 + "," + this.field546);
            throw new RuntimeException("eek");
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(ZI)V")
    public final void method185(boolean arg0, int arg1) {
        class15 var3 = class15.field806[arg1];
        for (int var4 = 0; var4 < var3.field797.length && var3.field797[var4] != -1; ++var4) {
            class15 var5 = class15.field806[var3.field797[var4]];
            if (var5.field768 == 1) {
                this.method185(true, var5.field774);
            }
            var5.field775 = 0;
            var5.field794 = 0;
        }
        if (!arg0) {
            this.field196 = this.field299.method44();
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LJQZFCGYF;I)V")
    public final void method186(class38 arg0, int arg1) {
        short var3 = 256;
        for (int var4 = 0; var4 < this.field363.length; ++var4) {
            this.field363[var4] = 0;
        }
        for (int var5 = 0; var5 < 5000; ++var5) {
            int var17 = (int) (Math.random() * 128.0D * (double) var3);
            this.field363[var17] = (int) (Math.random() * 256.0D);
        }
        for (int var6 = 0; var6 < 20; ++var6) {
            for (int var13 = 1; var13 < var3 - 1; ++var13) {
                for (int var15 = 1; var15 < 127; ++var15) {
                    int var16 = (var13 << 7) + var15;
                    this.field364[var16] = (this.field363[var16 - 1] + this.field363[var16 + 1] + this.field363[var16 - 128] + this.field363[var16 + 128]) / 4;
                }
            }
            int[] var14 = this.field363;
            this.field363 = this.field364;
            this.field364 = var14;
        }
        while (arg1 >= 0) {
            this.field196 = -1;
        }
        if (arg0 != null) {
            int var7 = 0;
            for (int var8 = 0; var8 < arg0.field1187; ++var8) {
                for (int var9 = 0; var9 < arg0.field1186; ++var9) {
                    if (arg0.field1184[var7++] != 0) {
                        int var10 = var9 + 16 + arg0.field1188;
                        int var11 = var8 + 16 + arg0.field1189;
                        int var12 = (var11 << 7) + var10;
                        this.field363[var12] = 0;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LJONKABPT;III)V")
    public final void method187(class37 arg0, int arg1, int arg2, int arg3) {
        int var5 = arg2 * arg2 + arg3 * arg3;
        if (arg1 != 9858) {
            this.field398 = null;
        }
        if (var5 > 4225 && var5 < 90000) {
            int var6 = this.field380 + this.field365 & 2047;
            int var7 = class21.field948[var6];
            int var8 = class21.field949[var6];
            int var9 = var7 * 256 / (this.field574 + 256);
            int var10 = var8 * 256 / (this.field574 + 256);
            int var11 = arg2 * var10 + arg3 * var9 >> 16;
            int var12 = arg3 * var10 - arg2 * var9 >> 16;
            double var13 = Math.atan2((double) var11, (double) var12);
            int var15 = (int) (Math.sin(var13) * 63.0D);
            int var16 = (int) (Math.cos(var13) * 57.0D);
            this.field563.method434(83 - var16 - 20, 20, 15, 20, 256, 15, var15 + 94 + 4 - 10, var13, 0);
        } else {
            this.method137(arg2, arg0, 9, arg3);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIZ)Z")
    public final boolean method188(int arg0, int arg1, boolean arg2) {
        boolean var4 = false;
        if (arg2) {
            for (int var5 = 1; var5 > 0; ++var5) {
            }
        }
        class15 var6 = class15.field806[arg1];
        for (int var7 = 0; var7 < var6.field797.length && var6.field797[var7] != -1; ++var7) {
            class15 var8 = class15.field806[var6.field797[var7]];
            if (var8.field768 == 1) {
                var4 |= this.method188(arg0, var8.field774, false);
            }
            if (var8.field768 == 6 && (var8.field830 != -1 || var8.field831 != -1)) {
                boolean var9 = this.method214(false, var8);
                int var10;
                if (var9) {
                    var10 = var8.field831;
                } else {
                    var10 = var8.field830;
                }
                if (var10 != -1) {
                    class39 var11 = class39.field1195[var10];
                    var8.field794 += arg0;
                    while (var8.field794 > var11.method445(var8.field775, 977)) {
                        var8.field794 -= var11.method445(var8.field775, 977) + 1;
                        ++var8.field775;
                        if (var8.field775 >= var11.field1196) {
                            var8.field775 -= var11.field1200;
                            if (var8.field775 < 0 || var8.field775 >= var11.field1196) {
                                var8.field775 = 0;
                            }
                        }
                        var4 = true;
                    }
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client", name = "x", descriptor = "(I)V")
    public void method189(int arg0) {
        System.out.println("============");
        int var2 = 48 / arg0;
        System.out.println("flame-cycle:" + this.field168);
        if (this.field374 != null) {
            System.out.println("Od-cycle:" + this.field374.field734);
        }
        System.out.println("loop-cycle:" + field329);
        System.out.println("draw-cycle:" + field188);
        System.out.println("ptype:" + this.field196);
        System.out.println("psize:" + this.field195);
        if (this.field305 != null) {
            this.field305.method234(776);
        }
        super.field1097 = true;
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(I)Ljava/awt/Component;")
    public final Component method190(int arg0) {
        if (arg0 != 0) {
            this.field503 = this.field413.method479();
        }
        if (signlink.mainapp != null) {
            return signlink.mainapp;
        } else {
            return super.field1103 != null ? super.field1103 : this;
        }
    }

    @OriginalMember(owner = "client", name = "y", descriptor = "(I)V")
    public final void method191(int arg0) {
        short var2 = 256;
        for (int var3 = 10; var3 < 117; ++var3) {
            int var18 = (int) (Math.random() * 100.0D);
            if (var18 < 50) {
                this.field616[(var2 - 2 << 7) + var3] = 255;
            }
        }
        for (int var4 = 0; var4 < 100; ++var4) {
            int var15 = (int) (Math.random() * 124.0D) + 2;
            int var16 = (int) (Math.random() * 128.0D) + 128;
            int var17 = (var16 << 7) + var15;
            this.field616[var17] = 192;
        }
        for (int var5 = 1; var5 < var2 - 1; ++var5) {
            for (int var13 = 1; var13 < 127; ++var13) {
                int var14 = (var5 << 7) + var13;
                this.field617[var14] = (this.field616[var14 - 1] + this.field616[var14 + 1] + this.field616[var14 - 128] + this.field616[var14 + 128]) / 4;
            }
        }
        this.field418 += 128;
        if (this.field418 > this.field363.length) {
            this.field418 -= this.field363.length;
            int var6 = (int) (Math.random() * 12.0D);
            this.method186(this.field173[var6], -165);
        }
        for (int var7 = 1; var7 < var2 - 1; ++var7) {
            for (int var10 = 1; var10 < 127; ++var10) {
                int var11 = (var7 << 7) + var10;
                int var12 = this.field617[var11 + 128] - this.field363[this.field418 + var11 & this.field363.length - 1] / 5;
                if (var12 < 0) {
                    var12 = 0;
                }
                this.field616[var11] = var12;
            }
        }
        if (arg0 <= 0) {
            field253 = true;
        }
        for (int var8 = 0; var8 < var2 - 1; ++var8) {
            this.field473[var8] = this.field473[var8 + 1];
        }
        this.field473[var2 - 1] = (int) (Math.sin((double) field329 / 14.0D) * 16.0D + Math.sin((double) field329 / 15.0D) * 14.0D + Math.sin((double) field329 / 16.0D) * 12.0D);
        if (this.field369 > 0) {
            this.field369 -= 4;
        }
        if (this.field370 > 0) {
            this.field370 -= 4;
        }
        if (this.field369 == 0 && this.field370 == 0) {
            int var9 = (int) (Math.random() * 2000.0D);
            if (var9 == 0) {
                this.field369 = 1024;
            }
            if (var9 == 1) {
                this.field370 = 1024;
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "z", descriptor = "(I)V")
    public final void method192(int arg0) {
        Graphics var2 = this.method190(0).getGraphics();
        var2.setColor(Color.black);
        var2.fillRect(0, 0, 765, 503);
        this.method402((byte) 41, 1);
        if (this.field183 != arg0) {
            this.field196 = this.field299.method44();
        }
        if (this.field405) {
            this.field367 = false;
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
        if (this.field519) {
            this.field367 = false;
            var2.setFont(new Font("Helvetica", 1, 20));
            var2.setColor(Color.white);
            var2.drawString("Error - unable to load game!", 50, 50);
            var2.drawString("To play RuneScape make sure you play from", 50, 100);
            var2.drawString("http://www.runescape.com", 50, 150);
        }
        if (this.field568) {
            this.field367 = false;
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

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIILFDUKJGTQ;ZIIII)V")
    public final void method193(int arg0, int arg1, int arg2, class15 arg3, boolean arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg8 != -30561) {
            this.field508 = !this.field508;
        }
        if (this.field522) {
            this.field521 = 32;
        } else {
            this.field521 = 0;
        }
        this.field522 = false;
        if (arg2 >= arg0 && arg2 < arg0 + 16 && arg6 >= arg1 && arg6 < arg1 + 16) {
            arg3.field809 -= this.field292 * 4;
            if (arg4) {
                this.field433 = true;
                return;
            }
        } else if (arg2 >= arg0 && arg2 < arg0 + 16 && arg6 >= arg1 + arg5 - 16 && arg6 < arg1 + arg5) {
            arg3.field809 += this.field292 * 4;
            if (arg4) {
                this.field433 = true;
                return;
            }
        } else {
            if (arg2 < arg0 - this.field521 || arg2 >= arg0 + 16 + this.field521 || arg6 < arg1 + 16 || arg6 >= arg1 + arg5 - 16 || this.field292 <= 0) {
                return;
            }
            int var10 = (arg5 - 32) * arg5 / arg7;
            if (var10 < 8) {
                var10 = 8;
            }
            int var11 = arg6 - arg1 - 16 - var10 / 2;
            int var12 = arg5 - 32 - var10;
            arg3.field809 = (arg7 - arg5) * var11 / var12;
            if (arg4) {
                this.field433 = true;
            }
            this.field522 = true;
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(IIII)I")
    public final int method194(int arg0, int arg1, int arg2, int arg3) {
        int var5 = arg2 >> 7;
        int var6 = arg3 >> 7;
        if (var5 >= 0 && var6 >= 0 && var5 <= 103 && var6 <= 103) {
            int var7 = arg0;
            if (arg1 != 0) {
                this.field608.method34(70);
            }
            if (arg0 < 3 && (this.field535[1][var5][var6] & 2) == 2) {
                var7 = arg0 + 1;
            }
            int var8 = arg2 & 127;
            int var9 = arg3 & 127;
            int var10 = (128 - var8) * this.field193[var7][var5][var6] + this.field193[var7][var5 + 1][var6] * var8 >> 7;
            int var11 = (128 - var8) * this.field193[var7][var5][var6 + 1] + this.field193[var7][var5 + 1][var6 + 1] * var8 >> 7;
            return (128 - var9) * var10 + var9 * var11 >> 7;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)V")
    public final void method195(String arg0, String arg1, boolean arg2) {
        signlink.errorname = arg0;
        try {
            if (!arg2) {
                this.field597 = "";
                this.field598 = "Connecting to server...";
                this.method177(true, (byte) -51);
            }
            this.field305 = new class8(this, this.method168(field273 + 43594), 1);
            long var4 = class31.method388(arg0);
            int var6 = (int) (var4 >> 16 & 31L);
            this.field608.field123 = 0;
            this.field608.method34(14);
            this.field608.method34(var6);
            this.field305.method233(230, this.field608.field122, 2, 0);
            for (int var7 = 0; var7 < 8; ++var7) {
                this.field305.method230();
            }
            int var8 = this.field305.method230();
            int var9 = var8;
            if (var8 == 0) {
                this.field305.method232(this.field299.field122, 0, 8);
                this.field299.field123 = 0;
                this.field525 = this.field299.method50(0);
                int[] var10 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (this.field525 >> 32), (int) this.field525 };
                this.field608.field123 = 0;
                this.field608.method34(10);
                this.field608.method38(var10[0]);
                this.field608.method38(var10[1]);
                this.field608.method38(var10[2]);
                this.field608.method38(var10[3]);
                this.field608.method38(signlink.uid);
                this.field608.method41(arg0);
                this.field608.method41(arg1);
                this.field608.method59(field286, field603, 360);
                this.field170.field123 = 0;
                if (arg2) {
                    this.field170.method34(18);
                } else {
                    this.field170.method34(16);
                }
                this.field170.method34(this.field608.field123 + 36 + 1 + 1 + 2);
                this.field170.method34(255);
                this.field170.method35(309);
                this.field170.method34(field275 ? 1 : 0);
                for (int var11 = 0; var11 < 9; ++var11) {
                    this.field170.method38(this.field600[var11]);
                }
                this.field170.method42(9447, this.field608.field122, 0, this.field608.field123);
                this.field608.field127 = new class50(0, var10);
                for (int var12 = 0; var12 < 4; ++var12) {
                    var10[var12] += 50;
                }
                this.field413 = new class50(0, var10);
                this.field305.method233(230, this.field170.field122, this.field170.field123, 0);
                var8 = this.field305.method230();
            }
            if (var8 == 1) {
                try {
                    Thread.sleep(2000L);
                } catch (Exception var22) {
                }
                this.method195(arg0, arg1, arg2);
            } else if (var8 == 2) {
                this.field239 = this.field305.method230();
                field445 = this.field305.method230() == 1;
                this.field359 = 0L;
                this.field441 = 0;
                this.field383.field1404 = 0;
                super.field1105 = true;
                this.field430 = true;
                this.field512 = true;
                this.field608.field123 = 0;
                this.field299.field123 = 0;
                this.field196 = -1;
                this.field565 = -1;
                this.field566 = -1;
                this.field567 = -1;
                this.field195 = 0;
                this.field197 = 0;
                this.field240 = 0;
                this.field199 = 0;
                this.field404 = 0;
                this.field315 = 0;
                this.field342 = false;
                super.field1106 = 0;
                for (int var13 = 0; var13 < 100; ++var13) {
                    this.field362[var13] = null;
                }
                this.field287 = 0;
                this.field570 = 0;
                this.field443 = 0;
                this.field303 = 0;
                this.field372 = (int) (Math.random() * 100.0D) - 50;
                this.field206 = (int) (Math.random() * 110.0D) - 55;
                this.field576 = (int) (Math.random() * 80.0D) - 40;
                this.field365 = (int) (Math.random() * 120.0D) - 60;
                this.field574 = (int) (Math.random() * 30.0D) - 20;
                this.field380 = (int) (Math.random() * 20.0D) - 10 & 2047;
                this.field411 = 0;
                this.field166 = -1;
                this.field332 = 0;
                this.field333 = 0;
                this.field221 = 0;
                this.field248 = 0;
                for (int var14 = 0; var14 < this.field218; ++var14) {
                    this.field220[var14] = null;
                    this.field225[var14] = null;
                }
                for (int var15 = 0; var15 < 16384; ++var15) {
                    this.field247[var15] = null;
                }
                field557 = this.field220[this.field219] = new class22();
                this.field466.method589();
                this.field355.method589();
                for (int var16 = 0; var16 < 4; ++var16) {
                    for (int var17 = 0; var17 < 104; ++var17) {
                        for (int var18 = 0; var18 < 104; ++var18) {
                            this.field398[var16][var17][var18] = null;
                        }
                    }
                }
                this.field358 = new class69((byte) 7);
                this.field436 = 0;
                this.field435 = 0;
                this.field432 = -1;
                this.field472 = -1;
                this.field268 = -1;
                this.field474 = -1;
                this.field251 = -1;
                this.field226 = false;
                this.field169 = 3;
                this.field477 = 0;
                this.field342 = false;
                this.field589 = false;
                this.field438 = null;
                this.field429 = 0;
                this.field312 = -1;
                this.field464 = true;
                this.method91(582);
                for (int var19 = 0; var19 < 5; ++var19) {
                    this.field313[var19] = 0;
                }
                for (int var20 = 0; var20 < 5; ++var20) {
                    this.field538[var20] = null;
                    this.field539[var20] = false;
                }
                field468 = 0;
                field340 = 0;
                field298 = 0;
                field165 = 0;
                field604 = 0;
                field497 = 0;
                field609 = 0;
                field434 = 0;
                field412 = 0;
                field599 = 0;
                this.method212((byte) 29);
            } else if (var8 == 3) {
                this.field597 = "";
                this.field598 = "Invalid username or password.";
            } else if (var8 == 4) {
                this.field597 = "Your account has been disabled.";
                this.field598 = "Please check your message-centre for details.";
            } else if (var8 == 5) {
                this.field597 = "Your account is already logged in.";
                this.field598 = "Try again in 60 secs...";
            } else if (var8 == 6) {
                this.field597 = "RuneScape has been updated!";
                this.field598 = "Please reload this page.";
            } else if (var8 == 7) {
                this.field597 = "This world is full.";
                this.field598 = "Please use a different world.";
            } else if (var8 == 8) {
                this.field597 = "Unable to connect.";
                this.field598 = "Login server offline.";
            } else if (var8 == 9) {
                this.field597 = "Login limit exceeded.";
                this.field598 = "Too many connections from your address.";
            } else if (var8 == 10) {
                this.field597 = "Unable to connect.";
                this.field598 = "Bad session id.";
            } else if (var8 == 11) {
                this.field598 = "Login server rejected session.";
                this.field598 = "Please try again.";
            } else if (var8 == 12) {
                this.field597 = "You need a members account to login to this world.";
                this.field598 = "Please subscribe, or use a different world.";
            } else if (var8 == 13) {
                this.field597 = "Could not complete login.";
                this.field598 = "Please try using a different world.";
            } else if (var8 == 14) {
                this.field597 = "The server is being updated.";
                this.field598 = "Please wait 1 minute and try again.";
            } else if (var8 == 15) {
                this.field512 = true;
                this.field608.field123 = 0;
                this.field299.field123 = 0;
                this.field196 = -1;
                this.field565 = -1;
                this.field566 = -1;
                this.field567 = -1;
                this.field195 = 0;
                this.field197 = 0;
                this.field240 = 0;
                this.field315 = 0;
                this.field342 = false;
                this.field541 = System.currentTimeMillis();
            } else if (var8 == 16) {
                this.field597 = "Login attempts exceeded.";
                this.field598 = "Please wait 1 minute and try again.";
            } else if (var8 == 17) {
                this.field597 = "You are standing in a members-only area.";
                this.field598 = "To play on this world move to a free area first";
            } else if (var8 == 20) {
                this.field597 = "Invalid loginserver requested";
                this.field598 = "Please try using a different world.";
            } else if (var8 != 21) {
                if (var8 == -1) {
                    if (var9 == 0) {
                        if (this.field216 < 2) {
                            try {
                                Thread.sleep(2000L);
                            } catch (Exception var24) {
                            }
                            ++this.field216;
                            this.method195(arg0, arg1, arg2);
                        } else {
                            this.field597 = "No response from loginserver";
                            this.field598 = "Please wait 1 minute and try again.";
                        }
                    } else {
                        this.field597 = "No response from server";
                        this.field598 = "Please try using a different world.";
                    }
                } else {
                    System.out.println("response:" + var8);
                    this.field597 = "Unexpected server response";
                    this.field598 = "Please try using a different world.";
                }
            } else {
                for (int var21 = this.field305.method230(); var21 >= 0; --var21) {
                    this.field597 = "You have only just left another world";
                    this.field598 = "Your profile will be transferred in: " + var21 + " seconds";
                    this.method177(true, (byte) -51);
                    try {
                        Thread.sleep(1000L);
                    } catch (Exception var23) {
                    }
                }
                this.method195(arg0, arg1, arg2);
            }
        } catch (IOException var25) {
            this.field597 = "";
            this.field598 = "Error connecting to server.";
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(IILCKBTFRZM;)V")
    private final void method196(int arg0, int arg1, class5 arg2) {
        if (arg0 < 8 || arg0 > 8) {
            this.field608.method34(241);
        }
        while (arg2.field124 + 10 < arg1 * 8) {
            int var4 = arg2.method55(this.field200, 11);
            if (var4 == 2047) {
                break;
            }
            if (this.field220[var4] == null) {
                this.field220[var4] = new class22();
                if (this.field225[var4] != null) {
                    this.field220[var4].method367(this.field225[var4], -855);
                }
            }
            this.field222[this.field221++] = var4;
            class22 var5 = this.field220[var4];
            var5.field1551 = field329;
            int var6 = arg2.method55(this.field200, 1);
            if (var6 == 1) {
                this.field224[this.field223++] = var4;
            }
            int var7 = arg2.method55(this.field200, 1);
            int var8 = arg2.method55(this.field200, 5);
            if (var8 > 15) {
                var8 -= 32;
            }
            int var9 = arg2.method55(this.field200, 5);
            if (var9 > 15) {
                var9 -= 32;
            }
            var5.method559(field557.field1568[0] + var9, field557.field1567[0] + var8, 0, var7 == 1);
        }
        arg2.method56(0);
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "()V")
    public final void method197() {
        this.method200("Starting up", 20, 5);
        if (signlink.sunjava) {
            super.field1094 = 5;
        }
        if (field615) {
            this.field568 = true;
        } else {
            field615 = true;
            boolean var1 = false;
            String var2 = this.method125(false);
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
                this.field519 = true;
            } else {
                if (signlink.cache_dat != null) {
                    for (int var3 = 0; var3 < 5; ++var3) {
                        this.field348[var3] = new class27(field158, 500000, var3 + 1, signlink.cache_dat, signlink.cache_idx[var3]);
                    }
                }
                try {
                    this.method147(true);
                    this.field601 = this.method220(1, "title screen", -655, "title", this.field600[1], 25);
                    this.field160 = new class48(false, this.field601, "p11_full", false);
                    this.field161 = new class48(false, this.field601, "p12_full", false);
                    this.field162 = new class48(false, this.field601, "b12_full", false);
                    this.field163 = new class48(false, this.field601, "q8_full", true);
                    this.method213((byte) 2);
                    this.method105(7);
                    class12 var4 = this.method220(2, "config", -655, "config", this.field600[2], 30);
                    class12 var5 = this.method220(3, "interface", -655, "interface", this.field600[3], 35);
                    class12 var6 = this.method220(4, "2d graphics", -655, "media", this.field600[4], 40);
                    class12 var7 = this.method220(6, "textures", -655, "textures", this.field600[6], 45);
                    class12 var8 = this.method220(7, "chat system", -655, "wordenc", this.field600[7], 50);
                    class12 var9 = this.method220(8, "sound effects", -655, "sounds", this.field600[8], 55);
                    this.field535 = new byte[4][104][104];
                    this.field193 = new int[4][105][105];
                    this.field403 = new class59(0, 104, 4, 104, this.field193);
                    for (int var10 = 0; var10 < 4; ++var10) {
                        this.field350[var10] = new class47(104, 104, -820);
                    }
                    this.field334 = new class37(512, 512);
                    class12 var11 = this.method220(5, "update list", -655, "versionlist", this.field600[5], 60);
                    this.method200("Connecting to update server", 60, 5);
                    this.field374 = new class13();
                    this.field374.method267(var11, this);
                    class14.method278(this.field374.method272(6));
                    class21.method338(this.field374.method276(0, (byte) 5), this.field374);
                    if (!field275) {
                        this.field386 = 0;
                        try {
                            this.field386 = Integer.parseInt(this.getParameter("music"));
                        } catch (Exception var70) {
                        }
                        this.field387 = true;
                        this.field374.method259(2, this.field386);
                        while (this.field374.method268() > 0) {
                            this.method109(-34262);
                            try {
                                Thread.sleep(100L);
                            } catch (Exception var69) {
                            }
                            if (this.field374.field731 > 3) {
                                this.method110("ondemand");
                                return;
                            }
                        }
                    }
                    this.method200("Requesting animations", 65, 5);
                    int var12 = this.field374.method276(1, (byte) 5);
                    for (int var13 = 0; var13 < var12; ++var13) {
                        this.field374.method259(1, var13);
                    }
                    while (this.field374.method268() > 0) {
                        int var14 = var12 - this.field374.method268();
                        if (var14 > 0) {
                            this.method200("Loading animations - " + var14 * 100 / var12 + "%", 65, 5);
                        }
                        this.method109(-34262);
                        try {
                            Thread.sleep(100L);
                        } catch (Exception var68) {
                        }
                        if (this.field374.field731 > 3) {
                            this.method110("ondemand");
                            return;
                        }
                    }
                    this.method200("Requesting models", 70, 5);
                    int var15 = this.field374.method276(0, (byte) 5);
                    for (int var16 = 0; var16 < var15; ++var16) {
                        int var17 = this.field374.method258(false, var16);
                        if ((var17 & 1) != 0) {
                            this.field374.method259(0, var16);
                        }
                    }
                    int var18 = this.field374.method268();
                    while (this.field374.method268() > 0) {
                        int var19 = var18 - this.field374.method268();
                        if (var19 > 0) {
                            this.method200("Loading models - " + var19 * 100 / var18 + "%", 70, 5);
                        }
                        this.method109(-34262);
                        try {
                            Thread.sleep(100L);
                        } catch (Exception var67) {
                        }
                    }
                    if (this.field348[0] != null) {
                        this.method200("Requesting maps", 75, 5);
                        this.field374.method259(3, this.field374.method260(0, false, 48, 47));
                        this.field374.method259(3, this.field374.method260(1, false, 48, 47));
                        this.field374.method259(3, this.field374.method260(0, false, 48, 48));
                        this.field374.method259(3, this.field374.method260(1, false, 48, 48));
                        this.field374.method259(3, this.field374.method260(0, false, 48, 49));
                        this.field374.method259(3, this.field374.method260(1, false, 48, 49));
                        this.field374.method259(3, this.field374.method260(0, false, 47, 47));
                        this.field374.method259(3, this.field374.method260(1, false, 47, 47));
                        this.field374.method259(3, this.field374.method260(0, false, 47, 48));
                        this.field374.method259(3, this.field374.method260(1, false, 47, 48));
                        this.field374.method259(3, this.field374.method260(0, false, 148, 48));
                        this.field374.method259(3, this.field374.method260(1, false, 148, 48));
                        int var20 = this.field374.method268();
                        while (this.field374.method268() > 0) {
                            int var21 = var20 - this.field374.method268();
                            if (var21 > 0) {
                                this.method200("Loading maps - " + var21 * 100 / var20 + "%", 75, 5);
                            }
                            this.method109(-34262);
                            try {
                                Thread.sleep(100L);
                            } catch (Exception var66) {
                            }
                        }
                    }
                    int var22 = this.field374.method276(0, (byte) 5);
                    for (int var23 = 0; var23 < var22; ++var23) {
                        int var24 = this.field374.method258(false, var23);
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
                            this.field374.method271(0, 931, var23, var25);
                        }
                    }
                    this.field374.method262(field274, false);
                    if (!field275) {
                        int var26 = this.field374.method276(2, (byte) 5);
                        for (int var27 = 1; var27 < var26; ++var27) {
                            if (this.field374.method261(field594, var27)) {
                                this.field374.method271(2, 931, var27, (byte) 1);
                            }
                        }
                    }
                    this.method200("Unpacking media", 80, 5);
                    this.field300 = new class38(var6, "invback", 0);
                    this.field302 = new class38(var6, "chatback", 0);
                    this.field301 = new class38(var6, "mapback", 0);
                    this.field324 = new class38(var6, "backbase1", 0);
                    this.field325 = new class38(var6, "backbase2", 0);
                    this.field326 = new class38(var6, "backhmid1", 0);
                    for (int var28 = 0; var28 < 13; ++var28) {
                        this.field181[var28] = new class38(var6, "sideicons", var28);
                    }
                    this.field245 = new class37(var6, "compass", 0);
                    this.field563 = new class37(var6, "mapedge", 0);
                    this.field563.method426(0);
                    try {
                        for (int var29 = 0; var29 < 100; ++var29) {
                            this.field304[var29] = new class38(var6, "mapscene", var29);
                        }
                    } catch (Exception var74) {
                    }
                    try {
                        for (int var30 = 0; var30 < 100; ++var30) {
                            this.field155[var30] = new class37(var6, "mapfunction", var30);
                        }
                    } catch (Exception var73) {
                    }
                    try {
                        for (int var31 = 0; var31 < 20; ++var31) {
                            this.field537[var31] = new class37(var6, "hitmarks", var31);
                        }
                    } catch (Exception var72) {
                    }
                    try {
                        for (int var32 = 0; var32 < 20; ++var32) {
                            this.field437[var32] = new class37(var6, "headicons", var32);
                        }
                    } catch (Exception var71) {
                    }
                    this.field469 = new class37(var6, "mapmarker", 0);
                    this.field470 = new class37(var6, "mapmarker", 1);
                    for (int var33 = 0; var33 < 8; ++var33) {
                        this.field491[var33] = new class37(var6, "cross", var33);
                    }
                    this.field479 = new class37(var6, "mapdots", 0);
                    this.field480 = new class37(var6, "mapdots", 1);
                    this.field481 = new class37(var6, "mapdots", 2);
                    this.field482 = new class37(var6, "mapdots", 3);
                    this.field483 = new class37(var6, "mapdots", 4);
                    this.field208 = new class38(var6, "scrollbar", 0);
                    this.field209 = new class38(var6, "scrollbar", 1);
                    this.field558 = new class38(var6, "redstone1", 0);
                    this.field559 = new class38(var6, "redstone2", 0);
                    this.field560 = new class38(var6, "redstone3", 0);
                    this.field561 = new class38(var6, "redstone1", 0);
                    this.field561.method439((byte) -6);
                    this.field562 = new class38(var6, "redstone2", 0);
                    this.field562.method439((byte) -6);
                    this.field388 = new class38(var6, "redstone1", 0);
                    this.field388.method440(false);
                    this.field389 = new class38(var6, "redstone2", 0);
                    this.field389.method440(false);
                    this.field390 = new class38(var6, "redstone3", 0);
                    this.field390.method440(false);
                    this.field391 = new class38(var6, "redstone1", 0);
                    this.field391.method439((byte) -6);
                    this.field391.method440(false);
                    this.field392 = new class38(var6, "redstone2", 0);
                    this.field392.method439((byte) -6);
                    this.field392.method440(false);
                    for (int var34 = 0; var34 < 2; ++var34) {
                        this.field467[var34] = new class38(var6, "mod_icons", var34);
                    }
                    class37 var35 = new class37(var6, "backleft1", 0);
                    this.field277 = new class16(this.method190(0), 30871, var35.field1174, var35.field1175);
                    var35.method427(0, 0, -609);
                    class37 var36 = new class37(var6, "backleft2", 0);
                    this.field278 = new class16(this.method190(0), 30871, var36.field1174, var36.field1175);
                    var36.method427(0, 0, -609);
                    class37 var37 = new class37(var6, "backright1", 0);
                    this.field279 = new class16(this.method190(0), 30871, var37.field1174, var37.field1175);
                    var37.method427(0, 0, -609);
                    class37 var38 = new class37(var6, "backright2", 0);
                    this.field280 = new class16(this.method190(0), 30871, var38.field1174, var38.field1175);
                    var38.method427(0, 0, -609);
                    class37 var39 = new class37(var6, "backtop1", 0);
                    this.field281 = new class16(this.method190(0), 30871, var39.field1174, var39.field1175);
                    var39.method427(0, 0, -609);
                    class37 var40 = new class37(var6, "backvmid1", 0);
                    this.field282 = new class16(this.method190(0), 30871, var40.field1174, var40.field1175);
                    var40.method427(0, 0, -609);
                    class37 var41 = new class37(var6, "backvmid2", 0);
                    this.field283 = new class16(this.method190(0), 30871, var41.field1174, var41.field1175);
                    var41.method427(0, 0, -609);
                    class37 var42 = new class37(var6, "backvmid3", 0);
                    this.field284 = new class16(this.method190(0), 30871, var42.field1174, var42.field1175);
                    var42.method427(0, 0, -609);
                    class37 var43 = new class37(var6, "backhmid2", 0);
                    this.field285 = new class16(this.method190(0), 30871, var43.field1174, var43.field1175);
                    var43.method427(0, 0, -609);
                    int var44 = (int) (Math.random() * 21.0D) - 10;
                    int var45 = (int) (Math.random() * 21.0D) - 10;
                    int var46 = (int) (Math.random() * 21.0D) - 10;
                    int var47 = (int) (Math.random() * 41.0D) - 20;
                    for (int var48 = 0; var48 < 100; ++var48) {
                        if (this.field155[var48] != null) {
                            this.field155[var48].method425(var44 + var47, 0, var46 + var47, var45 + var47);
                        }
                        if (this.field304[var48] != null) {
                            this.field304[var48].method441(var44 + var47, 0, var46 + var47, var45 + var47);
                        }
                    }
                    this.method200("Unpacking textures", 83, 5);
                    class10.method242(true, var7);
                    class10.method246(0, 0.8D);
                    class10.method241(field172, 20);
                    this.method200("Unpacking config", 86, 5);
                    class39.method444(true, var4);
                    class64.method574(var4);
                    class6.method225(true, var4);
                    class52.method494(var4);
                    class4.method28(var4);
                    class29.method382(true, var4);
                    class63.method562(true, var4);
                    class9.method235(true, var4);
                    class72.method591(true, var4);
                    class52.field1340 = field274;
                    if (!field275) {
                        this.method200("Unpacking sounds", 90, 5);
                        byte[] var49 = var9.method255("sounds.dat", (byte[]) null);
                        class5 var50 = new class5(2, var49);
                        class51.method482(true, var50);
                    }
                    this.method200("Unpacking interfaces", 95, 5);
                    class48[] var51 = new class48[] { this.field160, this.field161, this.field162, this.field163 };
                    class15.method287(var6, (byte) 9, var51, var5);
                    this.method200("Preparing game engine", 100, 5);
                    for (int var52 = 0; var52 < 33; ++var52) {
                        int var53 = 999;
                        int var54 = 0;
                        for (int var55 = 0; var55 < 34; ++var55) {
                            if (this.field301.field1184[this.field301.field1186 * var52 + var55] == 0) {
                                if (var53 == 999) {
                                    var53 = var55;
                                }
                            } else if (var53 != 999) {
                                var54 = var55;
                                break;
                            }
                        }
                        this.field423[var52] = var53;
                        this.field338[var52] = var54 - var53;
                    }
                    for (int var56 = 5; var56 < 156; ++var56) {
                        int var57 = 999;
                        int var58 = 0;
                        for (int var59 = 25; var59 < 172; ++var59) {
                            if (this.field301.field1184[this.field301.field1186 * var56 + var59] == 0 && (var59 > 34 || var56 > 34)) {
                                if (var57 == 999) {
                                    var57 = var59;
                                }
                            } else if (var57 != 999) {
                                var58 = var59;
                                break;
                            }
                        }
                        this.field186[var56 - 5] = var57 - 25;
                        this.field410[var56 - 5] = var58 - var57;
                    }
                    class10.method239(479, 1, 96);
                    this.field241 = class10.field675;
                    class10.method239(190, 1, 261);
                    this.field242 = class10.field675;
                    class10.method239(512, 1, 334);
                    this.field243 = class10.field675;
                    int[] var60 = new int[9];
                    for (int var61 = 0; var61 < 9; ++var61) {
                        int var62 = var61 * 32 + 128 + 15;
                        int var63 = var62 * 3 + 600;
                        int var64 = class10.field673[var62];
                        var60[var61] = var63 * var64 >> 16;
                    }
                    class59.method543(800, 334, -3598, 500, var60, 512);
                    class19.method295(var8);
                    this.field383 = new class57(0, this);
                    this.method117(this.field383, 10);
                    class44.field1257 = this;
                    class64.field1620 = this;
                    class4.field85 = this;
                } catch (Exception var75) {
                    signlink.reporterror("loaderror " + this.field533 + " " + this.field184);
                    this.field405 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "A", descriptor = "(I)V")
    public final void method198(int arg0) {
        class64.field1619.method3();
        class64.field1632.method3();
        class4.field72.method3();
        if (arg0 != -12265) {
            this.field398 = null;
        }
        class52.field1334.method3();
        class52.field1329.method3();
        class22.field972.method3();
        class63.field1600.method3();
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(Ljava/lang/String;)Ljava/io/DataInputStream;")
    public final DataInputStream method199(String arg0) throws IOException {
        if (!this.field502) {
            return signlink.mainapp != null ? signlink.openurl(arg0) : new DataInputStream((new URL(this.getCodeBase(), arg0)).openStream());
        } else {
            if (this.field178 != null) {
                try {
                    this.field178.close();
                } catch (Exception var4) {
                }
                this.field178 = null;
            }
            this.field178 = this.method168(43595);
            this.field178.setSoTimeout(10000);
            InputStream var2 = this.field178.getInputStream();
            OutputStream var3 = this.field178.getOutputStream();
            var3.write(("JAGGRAB /" + arg0 + "\n\n").getBytes());
            return new DataInputStream(var2);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;II)V")
    public final void method200(String arg0, int arg1, int arg2) {
        this.field184 = arg1;
        this.field533 = arg0;
        this.method130((byte) -13);
        if (this.field601 == null) {
            super.method200(arg0, arg1, 5);
        } else {
            this.field260.method289(true);
            short var4 = 360;
            short var5 = 200;
            byte var6 = 20;
            this.field162.method464(var5 / 2 - 26 - var6, 16777215, 0, var4 / 2, "RuneScape is loading - please wait...");
            int var7 = var5 / 2 - 18 - var6;
            class35.method418(684, 304, 34, 9179409, var7, var4 / 2 - 152);
            class35.method418(684, 302, 32, 0, var7 + 1, var4 / 2 - 151);
            if (arg2 != 5) {
                this.field608.method34(159);
            }
            class35.method417(466, var7 + 2, 30, var4 / 2 - 150, arg1 * 3, 9179409);
            class35.method417(466, var7 + 2, 30, arg1 * 3 + (var4 / 2 - 150), 300 - arg1 * 3, 0);
            this.field162.method464(var5 / 2 + 5 - var6, 16777215, 0, var4 / 2, arg0);
            this.field260.method290(1, 171, 202, super.field1100);
            if (this.field514) {
                this.field514 = false;
                if (!this.field367) {
                    this.field261.method290(1, 0, 0, super.field1100);
                    this.field262.method290(1, 0, 637, super.field1100);
                }
                this.field258.method290(1, 0, 128, super.field1100);
                this.field259.method290(1, 371, 202, super.field1100);
                this.field263.method290(1, 265, 0, super.field1100);
                this.field264.method290(1, 265, 562, super.field1100);
                this.field265.method290(1, 171, 128, super.field1100);
                this.field266.method290(1, 171, 562, super.field1100);
            }
        }
    }

    @OriginalMember(owner = "client", name = "o", descriptor = "(Z)V")
    public final void method201(boolean arg0) {
        ++this.field530;
        this.method127(true, 0);
        this.method129(-776, true);
        this.method127(false, 0);
        this.method129(-776, false);
        this.method93(true);
        if (!arg0) {
            this.field503 = this.field413.method479();
        }
        this.method138((byte) 2);
        if (!this.field271) {
            int var2 = this.field379;
            if (this.field458 / 256 > var2) {
                var2 = this.field458 / 256;
            }
            if (this.field484[4] && this.field215[4] + 128 > var2) {
                var2 = this.field215[4] + 128;
            }
            int var3 = this.field576 + this.field380 & 2047;
            this.method163(var3, this.method194(this.field442, 0, field557.field1570, field557.field1571) - 50, this.field461, var2 * 3 + 600, var2, 8433, this.field460);
        }
        int var4;
        if (!this.field271) {
            var4 = this.method202(0);
        } else {
            var4 = this.method203(0);
        }
        int var5 = this.field318;
        int var6 = this.field319;
        int var7 = this.field320;
        int var8 = this.field321;
        int var9 = this.field322;
        for (int var10 = 0; var10 < 5; ++var10) {
            if (this.field484[var10]) {
                int var12 = (int) (Math.random() * (double) (this.field591[var10] * 2 + 1) - (double) this.field591[var10] + Math.sin((double) this.field254[var10] / 100.0D * (double) this.field327[var10]) * (double) this.field215[var10]);
                if (var10 == 0) {
                    this.field318 += var12;
                }
                if (var10 == 1) {
                    this.field319 += var12;
                }
                if (var10 == 2) {
                    this.field320 += var12;
                }
                if (var10 == 3) {
                    this.field322 = this.field322 + var12 & 2047;
                }
                if (var10 == 4) {
                    this.field321 += var12;
                    if (this.field321 < 128) {
                        this.field321 = 128;
                    }
                    if (this.field321 > 383) {
                        this.field321 = 383;
                    }
                }
            }
        }
        int var11 = class10.field684;
        class21.field943 = true;
        class21.field946 = 0;
        class21.field944 = super.field1108 - 4;
        class21.field945 = super.field1109 - 4;
        class35.method415(this.field250);
        this.field403.method546(this.field321, this.field322, var4, this.field397, this.field320, this.field318, this.field319);
        this.field403.method521(-187);
        this.method94(0);
        this.method204(4);
        this.method174(2, var11);
        this.method102(36465);
        this.field235.method290(1, 4, 4, super.field1100);
        this.field318 = var5;
        this.field319 = var6;
        this.field320 = var7;
        this.field321 = var8;
        this.field322 = var9;
    }

    @OriginalMember(owner = "client", name = "B", descriptor = "(I)I")
    public final int method202(int arg0) {
        int var2 = 3;
        this.field195 += arg0;
        if (this.field321 < 310) {
            ++field256;
            if (field256 > 73) {
                field256 = 0;
                this.field608.method33((byte) 57, 112);
            }
            int var3 = this.field318 >> 7;
            int var4 = this.field320 >> 7;
            int var5 = field557.field1570 >> 7;
            int var6 = field557.field1571 >> 7;
            if ((this.field535[this.field442][var3][var4] & 4) != 0) {
                var2 = this.field442;
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
                    if ((this.field535[this.field442][var3][var4] & 4) != 0) {
                        var2 = this.field442;
                    }
                    var10 += var9;
                    if (var10 >= 65536) {
                        var10 -= 65536;
                        if (var4 < var6) {
                            ++var4;
                        } else if (var4 > var6) {
                            --var4;
                        }
                        if ((this.field535[this.field442][var3][var4] & 4) != 0) {
                            var2 = this.field442;
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
                    if ((this.field535[this.field442][var3][var4] & 4) != 0) {
                        var2 = this.field442;
                    }
                    var12 += var11;
                    if (var12 >= 65536) {
                        var12 -= 65536;
                        if (var3 < var5) {
                            ++var3;
                        } else if (var3 > var5) {
                            --var3;
                        }
                        if ((this.field535[this.field442][var3][var4] & 4) != 0) {
                            var2 = this.field442;
                        }
                    }
                }
            }
        }
        if ((this.field535[this.field442][field557.field1570 >> 7][field557.field1571 >> 7] & 4) != 0) {
            var2 = this.field442;
        }
        return var2;
    }

    @OriginalMember(owner = "client", name = "C", descriptor = "(I)I")
    public final int method203(int arg0) {
        if (arg0 != 0) {
            this.field397 = this.field413.method479();
        }
        int var2 = this.method194(this.field442, 0, this.field318, this.field320);
        return var2 - this.field319 < 800 && (this.field535[this.field442][this.field318 >> 7][this.field320 >> 7] & 4) != 0 ? this.field442 : 3;
    }

    @OriginalMember(owner = "client", name = "init", descriptor = "()V")
    public final void init() {
        field272 = Integer.parseInt(this.getParameter("nodeid"));
        field273 = Integer.parseInt(this.getParameter("portoff"));
        String var1 = this.getParameter("lowmem");
        if (var1 != null && var1.equals("1")) {
            method126(false);
        } else {
            method132((byte) 4);
        }
        String var2 = this.getParameter("free");
        if (var2 != null && var2.equals("1")) {
            field274 = false;
        } else {
            field274 = true;
        }
        this.method400(true, 503, 765);
    }

    @OriginalMember(owner = "client", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        return signlink.mainapp != null ? signlink.mainapp.getParameter(arg0) : super.getParameter(arg0);
    }

    @OriginalMember(owner = "client", name = "D", descriptor = "(I)V")
    public final void method204(int arg0) {
        if (arg0 < 4 || arg0 > 4) {
            this.method197();
        }
        if (this.field404 == 2) {
            this.method165((this.field447 - this.field546 << 7) + this.field450, this.field448 * 2, 966, (this.field446 - this.field545 << 7) + this.field449);
            if (this.field456 > -1 && field329 % 20 < 10) {
                this.field437[2].method429(this.field457 - 28, this.field456 - 12, false);
            }
        }
    }

    @OriginalMember(owner = "client", name = "o", descriptor = "(B)V")
    public final void method205(byte arg0) {
        if (this.field385 != arg0) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        if (this.field411 == 0) {
            if (super.field1114 == 1) {
                int var3 = super.field1115 - 25 - 550;
                int var4 = super.field1116 - 5 - 4;
                if (var3 >= 0 && var4 >= 0 && var3 < 146 && var4 < 151) {
                    var3 -= 73;
                    var4 -= 75;
                    int var5 = this.field380 + this.field365 & 2047;
                    int var6 = class10.field673[var5];
                    int var7 = class10.field674[var5];
                    int var8 = (this.field574 + 256) * var6 >> 8;
                    int var9 = (this.field574 + 256) * var7 >> 8;
                    int var10 = var3 * var9 + var4 * var8 >> 11;
                    int var11 = var4 * var9 - var3 * var8 >> 11;
                    int var12 = field557.field1570 + var10 >> 7;
                    int var13 = field557.field1571 - var11 >> 7;
                    boolean var14 = this.method180(1, 0, (byte) -3, 0, var13, 0, field557.field1568[0], field557.field1567[0], true, 0, 0, var12);
                    if (var14) {
                        this.field608.method34(var3);
                        this.field608.method34(var4);
                        this.field608.method35(this.field380);
                        this.field608.method34(57);
                        this.field608.method34(this.field365);
                        this.field608.method34(this.field574);
                        this.field608.method34(89);
                        this.field608.method35(field557.field1570);
                        this.field608.method35(field557.field1571);
                        this.field608.method34(this.field182);
                        this.field608.method34(63);
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(ZI)Ljava/lang/String;")
    private static final String method206(boolean arg0, int arg1) {
        if (!arg0) {
            field330 = 191;
        }
        if (arg1 < 100000) {
            return String.valueOf(arg1);
        } else {
            return arg1 < 10000000 ? arg1 / 1000 + "K" : arg1 / 1000000 + "M";
        }
    }

    @OriginalMember(owner = "client", name = "p", descriptor = "(Z)V")
    public final void method207(boolean arg0) {
        if (!arg0) {
            if (field275 && this.field443 == 2 && class3.field59 != this.field442) {
                this.field235.method289(true);
                this.field161.method464(151, 0, 0, 257, "Loading - please wait.");
                this.field161.method464(150, 16777215, 0, 256, "Loading - please wait.");
                this.field235.method290(1, 4, 4, super.field1100);
                this.field443 = 1;
                this.field541 = System.currentTimeMillis();
            }
            if (this.field443 == 1) {
                int var2 = this.method208(this.field407);
                if (var2 != 0 && System.currentTimeMillis() - this.field541 > 360000L) {
                    signlink.reporterror(this.field136 + " glcfb " + this.field525 + "," + var2 + "," + field275 + "," + this.field348[0] + "," + this.field374.method268() + "," + this.field442 + "," + this.field228 + "," + this.field229);
                    this.field541 = System.currentTimeMillis();
                }
            }
            if (this.field443 == 2 && this.field442 != this.field166) {
                this.field166 = this.field442;
                this.method120(true, this.field442);
            }
        }
    }

    @OriginalMember(owner = "client", name = "q", descriptor = "(Z)I")
    public final int method208(boolean arg0) {
        for (int var2 = 0; var2 < this.field276.length; ++var2) {
            if (this.field276[var2] == null && this.field527[var2] != -1) {
                return -1;
            }
            if (this.field192[var2] == null && this.field528[var2] != -1) {
                return -2;
            }
        }
        boolean var3 = true;
        for (int var4 = 0; var4 < this.field276.length; ++var4) {
            byte[] var5 = this.field192[var4];
            if (var5 != null) {
                int var6 = (this.field526[var4] >> 8) * 64 - this.field545;
                int var7 = (this.field526[var4] & 255) * 64 - this.field546;
                if (this.field406) {
                    var6 = 10;
                    var7 = 10;
                }
                var3 &= class3.method20(var6, (byte) 125, var5, var7);
            }
        }
        if (!var3) {
            return -3;
        } else if (this.field590) {
            return -4;
        } else {
            this.field443 = 2;
            class3.field59 = this.field442;
            if (arg0) {
                field408 = this.field413.method479();
            }
            this.method216(0);
            this.field608.method33((byte) 57, 167);
            return 0;
        }
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(II)V")
    public final void method209(int arg0, int arg1) {
        class69 var3 = this.field398[this.field442][arg0][arg1];
        if (var3 == null) {
            this.field403.method528(this.field442, arg0, arg1);
        } else {
            int var4 = -99999999;
            class56 var5 = null;
            for (class56 var6 = (class56) var3.method585(); var6 != null; var6 = (class56) var3.method587(0)) {
                class52 var11 = class52.method489(var6.field1400);
                int var12 = var11.field1331;
                if (var11.field1347) {
                    var12 = (var6.field1399 + 1) * var12;
                }
                if (var12 > var4) {
                    var4 = var12;
                    var5 = var6;
                }
            }
            var3.method583((byte) 3, var5);
            class56 var7 = null;
            class56 var8 = null;
            for (class56 var9 = (class56) var3.method585(); var9 != null; var9 = (class56) var3.method587(0)) {
                if (var5.field1400 != var9.field1400 && var7 == null) {
                    var7 = var9;
                }
                if (var5.field1400 != var9.field1400 && var7.field1400 != var9.field1400 && var8 == null) {
                    var8 = var9;
                }
            }
            int var10 = (arg1 << 7) + arg0 + 1610612736;
            this.field403.method514(this.field442, arg0, arg1, var7, var5, this.method194(this.field442, 0, arg0 * 128 + 64, arg1 * 128 + 64), var10, (byte) 4, var8);
        }
    }

    @OriginalMember(owner = "client", name = "E", descriptor = "(I)V")
    public final void method210(int arg0) {
        if (this.field307 != 0) {
            int var2 = 0;
            if (this.field240 != 0) {
                var2 = 1;
            }
            for (int var3 = 0; var3 < 100; ++var3) {
                if (this.field362[var3] != null) {
                    int var5 = this.field360[var3];
                    String var6 = this.field361[var3];
                    boolean var7 = false;
                    if (var6 != null && var6.startsWith("@cr1@")) {
                        var6 = var6.substring(5);
                        boolean var8 = true;
                    }
                    if (var6 != null && var6.startsWith("@cr2@")) {
                        var6 = var6.substring(5);
                        boolean var9 = true;
                    }
                    if ((var5 == 3 || var5 == 7) && (var5 == 7 || this.field347 == 0 || this.field347 == 1 && this.method219(var6, (byte) 1))) {
                        int var10 = 329 - var2 * 13;
                        if (super.field1108 > 4 && super.field1109 - 4 > var10 - 10 && super.field1109 - 4 <= var10 + 3) {
                            int var11 = this.field161.method466("From:  " + var6 + this.field362[var3], false) + 25;
                            if (var11 > 450) {
                                var11 = 450;
                            }
                            if (super.field1108 < var11 + 4) {
                                if (this.field239 >= 1) {
                                    this.field349[this.field315] = "Report abuse @whi@" + var6;
                                    this.field213[this.field315] = 2152;
                                    ++this.field315;
                                }
                                this.field349[this.field315] = "Add ignore @whi@" + var6;
                                this.field213[this.field315] = 2084;
                                ++this.field315;
                                this.field349[this.field315] = "Add friend @whi@" + var6;
                                this.field213[this.field315] = 2144;
                                ++this.field315;
                            }
                        }
                        ++var2;
                        if (var2 >= 5) {
                            return;
                        }
                    }
                    if ((var5 == 5 || var5 == 6) && this.field347 < 2) {
                        ++var2;
                        if (var2 >= 5) {
                            return;
                        }
                    }
                }
            }
            int var4 = 30 / arg0;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LFDUKJGTQ;B)Z")
    public final boolean method211(class15 arg0, byte arg1) {
        if (arg1 != 88) {
            this.field398 = null;
        }
        int var3 = arg0.field804;
        if ((var3 < 1 || var3 > 200) && (var3 < 701 || var3 > 900)) {
            if (var3 >= 401 && var3 <= 500) {
                this.field349[this.field315] = "Remove @whi@" + arg0.field773;
                this.field213[this.field315] = 52;
                ++this.field315;
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
            this.field349[this.field315] = "Remove @whi@" + this.field336[var3];
            this.field213[this.field315] = 813;
            ++this.field315;
            this.field349[this.field315] = "Message @whi@" + this.field336[var3];
            this.field213[this.field315] = 210;
            ++this.field315;
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "p", descriptor = "(B)V")
    public final void method212(byte arg0) {
        if (this.field236 == null) {
            this.method179((byte) 9);
            super.field1101 = null;
            this.field258 = null;
            this.field259 = null;
            this.field260 = null;
            this.field261 = null;
            if (arg0 != 29) {
                this.field196 = -1;
            }
            this.field262 = null;
            this.field263 = null;
            this.field264 = null;
            this.field265 = null;
            this.field266 = null;
            this.field236 = new class16(this.method190(0), 30871, 479, 96);
            this.field234 = new class16(this.method190(0), 30871, 172, 156);
            class35.method415(this.field250);
            this.field301.method442(0, 0, false);
            this.field233 = new class16(this.method190(0), 30871, 190, 261);
            this.field235 = new class16(this.method190(0), 30871, 512, 334);
            class35.method415(this.field250);
            this.field376 = new class16(this.method190(0), 30871, 496, 50);
            this.field377 = new class16(this.method190(0), 30871, 269, 37);
            this.field378 = new class16(this.method190(0), 30871, 249, 45);
            this.field514 = true;
        }
    }

    @OriginalMember(owner = "client", name = "q", descriptor = "(B)V")
    public final void method213(byte arg0) {
        byte[] var2 = this.field601.method255("title.dat", (byte[]) null);
        class37 var3 = new class37(var2, this);
        this.field261.method289(true);
        var3.method427(0, 0, -609);
        this.field262.method289(true);
        var3.method427(0, -637, -609);
        this.field258.method289(true);
        if (arg0 == 2) {
            boolean var4 = false;
        } else {
            this.method197();
        }
        var3.method427(0, -128, -609);
        this.field259.method289(true);
        var3.method427(-371, -202, -609);
        this.field260.method289(true);
        var3.method427(-171, -202, -609);
        this.field263.method289(true);
        var3.method427(-265, 0, -609);
        this.field264.method289(true);
        var3.method427(-265, -562, -609);
        this.field265.method289(true);
        var3.method427(-171, -128, -609);
        this.field266.method289(true);
        var3.method427(-171, -562, -609);
        int[] var5 = new int[var3.field1174];
        for (int var6 = 0; var6 < var3.field1175; ++var6) {
            for (int var11 = 0; var11 < var3.field1174; ++var11) {
                var5[var11] = var3.field1173[var3.field1174 * var6 + (var3.field1174 - var11 - 1)];
            }
            for (int var12 = 0; var12 < var3.field1174; ++var12) {
                var3.field1173[var3.field1174 * var6 + var12] = var5[var12];
            }
        }
        this.field261.method289(true);
        var3.method427(0, 382, -609);
        this.field262.method289(true);
        var3.method427(0, -255, -609);
        this.field258.method289(true);
        var3.method427(0, 254, -609);
        this.field259.method289(true);
        var3.method427(-371, 180, -609);
        this.field260.method289(true);
        var3.method427(-171, 180, -609);
        this.field263.method289(true);
        var3.method427(-265, 382, -609);
        this.field264.method289(true);
        var3.method427(-265, -180, -609);
        this.field265.method289(true);
        var3.method427(-171, 254, -609);
        this.field266.method289(true);
        var3.method427(-171, -180, -609);
        class37 var7 = new class37(this.field601, "logo", 0);
        this.field258.method289(true);
        var7.method429(18, 382 - var7.field1174 / 2 - 128, false);
        Object var8 = null;
        Object var9 = null;
        Object var10 = null;
        System.gc();
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZLFDUKJGTQ;)Z")
    public final boolean method214(boolean arg0, class15 arg1) {
        if (arg1.field792 == null) {
            return false;
        } else {
            for (int var3 = 0; var3 < arg1.field792.length; ++var3) {
                int var4 = this.method83(false, arg1, var3);
                int var5 = arg1.field821[var3];
                if (arg1.field792[var3] == 2) {
                    if (var4 >= var5) {
                        return false;
                    }
                } else if (arg1.field792[var3] == 3) {
                    if (var4 <= var5) {
                        return false;
                    }
                } else if (arg1.field792[var3] == 4) {
                    if (var4 == var5) {
                        return false;
                    }
                } else if (var4 != var5) {
                    return false;
                }
            }
            if (arg0) {
                throw new NullPointerException();
            } else {
                return true;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IILFDUKJGTQ;II)V")
    public final void method215(int arg0, int arg1, class15 arg2, int arg3, int arg4) {
        if (arg0 != 438) {
            for (int var6 = 1; var6 > 0; ++var6) {
            }
        }
        if (arg2.field768 == 0 && arg2.field797 != null) {
            if (!arg2.field819 || this.field314 == arg2.field774 || this.field149 == arg2.field774 || this.field194 == arg2.field774) {
                int var7 = class35.field1134;
                int var8 = class35.field1132;
                int var9 = class35.field1135;
                int var10 = class35.field1133;
                class35.method414(arg4, arg2.field795 + arg4, true, arg1, arg2.field816 + arg1);
                int var11 = arg2.field797.length;
                for (int var12 = 0; var12 < var11; ++var12) {
                    int var13 = arg2.field790[var12] + arg4;
                    int var14 = arg2.field777[var12] + arg1 - arg3;
                    class15 var15 = class15.field806[arg2.field797[var12]];
                    int var16 = var15.field807 + var13;
                    int var17 = var15.field786 + var14;
                    if (var15.field804 > 0) {
                        this.method128(var15, 7);
                    }
                    if (var15.field768 == 0) {
                        if (var15.field809 > var15.field805 - var15.field816) {
                            var15.field809 = var15.field805 - var15.field816;
                        }
                        if (var15.field809 < 0) {
                            var15.field809 = 0;
                        }
                        this.method215(438, var17, var15, var15.field809, var16);
                        if (var15.field805 > var15.field816) {
                            this.method89(var15.field795 + var16, 0, var15.field816, var17, var15.field809, var15.field805);
                        }
                    } else if (var15.field768 != 1) {
                        if (var15.field768 == 2) {
                            int var18 = 0;
                            for (int var19 = 0; var19 < var15.field816; ++var19) {
                                for (int var20 = 0; var20 < var15.field795; ++var20) {
                                    int var21 = (var15.field834 + 32) * var20 + var16;
                                    int var22 = (var15.field833 + 32) * var19 + var17;
                                    if (var18 < 20) {
                                        var21 += var15.field815[var18];
                                        var22 += var15.field791[var18];
                                    }
                                    if (var15.field814[var18] <= 0) {
                                        if (var15.field789 != null && var18 < 20) {
                                            class37 var31 = var15.field789[var18];
                                            if (var31 != null) {
                                                var31.method429(var22, var21, false);
                                            }
                                        }
                                    } else {
                                        int var23 = 0;
                                        int var24 = 0;
                                        int var25 = var15.field814[var18] - 1;
                                        if (var21 > class35.field1134 - 32 && var21 < class35.field1135 && var22 > class35.field1132 - 32 && var22 < class35.field1133 || this.field426 != 0 && this.field425 == var18) {
                                            int var26 = 0;
                                            if (this.field287 == 1 && this.field288 == var18 && this.field289 == var15.field774) {
                                                var26 = 16777215;
                                            }
                                            class37 var27 = class52.method492(var25, var15.field811[var18], true, var26);
                                            if (var27 != null) {
                                                if (this.field426 != 0 && this.field425 == var18 && this.field424 == var15.field774) {
                                                    var23 = super.field1108 - this.field427;
                                                    var24 = super.field1109 - this.field428;
                                                    if (var23 < 5 && var23 > -5) {
                                                        var23 = 0;
                                                    }
                                                    if (var24 < 5 && var24 > -5) {
                                                        var24 = 0;
                                                    }
                                                    if (this.field210 < 5) {
                                                        var23 = 0;
                                                        var24 = 0;
                                                    }
                                                    var27.method431(var22 + var24, (byte) -81, var21 + var23, 128);
                                                    if (var22 + var24 < class35.field1132 && arg2.field809 > 0) {
                                                        int var28 = (class35.field1132 - var22 - var24) * this.field459 / 3;
                                                        if (var28 > this.field459 * 10) {
                                                            var28 = this.field459 * 10;
                                                        }
                                                        if (var28 > arg2.field809) {
                                                            var28 = arg2.field809;
                                                        }
                                                        arg2.field809 -= var28;
                                                        this.field428 += var28;
                                                    }
                                                    if (var22 + var24 + 32 > class35.field1133 && arg2.field809 < arg2.field805 - arg2.field816) {
                                                        int var29 = (var22 + var24 + 32 - class35.field1133) * this.field459 / 3;
                                                        if (var29 > this.field459 * 10) {
                                                            var29 = this.field459 * 10;
                                                        }
                                                        if (var29 > arg2.field805 - arg2.field816 - arg2.field809) {
                                                            var29 = arg2.field805 - arg2.field816 - arg2.field809;
                                                        }
                                                        arg2.field809 += var29;
                                                        this.field428 -= var29;
                                                    }
                                                } else if (this.field402 != 0 && this.field401 == var18 && this.field400 == var15.field774) {
                                                    var27.method431(var22, (byte) -81, var21, 128);
                                                } else {
                                                    var27.method429(var22, var21, false);
                                                }
                                                if (var27.field1178 == 33 || var15.field811[var18] != 1) {
                                                    int var30 = var15.field811[var18];
                                                    this.field160.method468(method206(true, var30), var22 + 10 + var24, 0, var21 + 1 + var23, (byte) -126);
                                                    this.field160.method468(method206(true, var30), var22 + 9 + var24, 16776960, var21 + var23, (byte) -126);
                                                }
                                            }
                                        }
                                    }
                                    ++var18;
                                }
                            }
                        } else if (var15.field768 == 3) {
                            boolean var32 = false;
                            if (this.field194 == var15.field774 || this.field149 == var15.field774 || this.field314 == var15.field774) {
                                var32 = true;
                            }
                            int var33;
                            if (this.method214(false, var15)) {
                                var33 = var15.field801;
                                if (var32 && var15.field778 != 0) {
                                    var33 = var15.field778;
                                }
                            } else {
                                var33 = var15.field824;
                                if (var32 && var15.field803 != 0) {
                                    var33 = var15.field803;
                                }
                            }
                            if (var15.field798 == 0) {
                                if (var15.field787) {
                                    class35.method417(466, var17, var15.field816, var16, var15.field795, var33);
                                } else {
                                    class35.method418(684, var15.field795, var15.field816, var33, var17, var16);
                                }
                            } else if (var15.field787) {
                                class35.method416(var16, var15.field816, (byte) 5, var33, var15.field795, var17, 256 - (var15.field798 & 255));
                            } else {
                                class35.method419(false, var16, var17, 256 - (var15.field798 & 255), var33, var15.field795, var15.field816);
                            }
                        } else if (var15.field768 == 4) {
                            class48 var34 = var15.field812;
                            String var35 = var15.field773;
                            boolean var36 = false;
                            if (this.field194 == var15.field774 || this.field149 == var15.field774 || this.field314 == var15.field774) {
                                var36 = true;
                            }
                            int var37;
                            if (this.method214(false, var15)) {
                                var37 = var15.field801;
                                if (var36 && var15.field778 != 0) {
                                    var37 = var15.field778;
                                }
                                if (var15.field767.length() > 0) {
                                    var35 = var15.field767;
                                }
                            } else {
                                var37 = var15.field824;
                                if (var36 && var15.field803 != 0) {
                                    var37 = var15.field803;
                                }
                            }
                            if (var15.field771 == 6 && this.field226) {
                                var35 = "Please wait...";
                                var37 = var15.field824;
                            }
                            if (class35.field1130 == 479) {
                                if (var37 == 16776960) {
                                    var37 = 255;
                                }
                                if (var37 == 49152) {
                                    var37 = 16777215;
                                }
                            }
                            int var38 = var34.field1298 + var17;
                            while (var35.length() > 0) {
                                if (var35.indexOf("%") != -1) {
                                    label351: while (true) {
                                        int var39 = var35.indexOf("%1");
                                        if (var39 == -1) {
                                            while (true) {
                                                int var40 = var35.indexOf("%2");
                                                if (var40 == -1) {
                                                    while (true) {
                                                        int var41 = var35.indexOf("%3");
                                                        if (var41 == -1) {
                                                            while (true) {
                                                                int var42 = var35.indexOf("%4");
                                                                if (var42 == -1) {
                                                                    while (true) {
                                                                        int var43 = var35.indexOf("%5");
                                                                        if (var43 == -1) {
                                                                            break label351;
                                                                        }
                                                                        var35 = var35.substring(0, var43) + this.method107(this.method83(false, var15, 4), 351) + var35.substring(var43 + 2);
                                                                    }
                                                                }
                                                                var35 = var35.substring(0, var42) + this.method107(this.method83(false, var15, 3), 351) + var35.substring(var42 + 2);
                                                            }
                                                        }
                                                        var35 = var35.substring(0, var41) + this.method107(this.method83(false, var15, 2), 351) + var35.substring(var41 + 2);
                                                    }
                                                }
                                                var35 = var35.substring(0, var40) + this.method107(this.method83(false, var15, 1), 351) + var35.substring(var40 + 2);
                                            }
                                        }
                                        var35 = var35.substring(0, var39) + this.method107(this.method83(false, var15, 0), 351) + var35.substring(var39 + 2);
                                    }
                                }
                                int var44 = var35.indexOf("\\n");
                                String var45;
                                if (var44 != -1) {
                                    var45 = var35.substring(0, var44);
                                    var35 = var35.substring(var44 + 2);
                                } else {
                                    var45 = var35;
                                    var35 = "";
                                }
                                if (var15.field822) {
                                    var34.method465(var15.field795 / 2 + var16, (byte) 68, var45, var38, var37, var15.field779);
                                } else {
                                    var34.method472(var16, var15.field779, var37, var38, var45, (byte) 5);
                                }
                                var38 += var34.field1298;
                            }
                        } else if (var15.field768 == 5) {
                            class37 var46;
                            if (this.method214(false, var15)) {
                                var46 = var15.field793;
                            } else {
                                var46 = var15.field799;
                            }
                            if (var46 != null) {
                                var46.method429(var17, var16, false);
                            }
                        } else if (var15.field768 == 6) {
                            int var47 = class10.field669;
                            int var48 = class10.field670;
                            class10.field669 = var15.field795 / 2 + var16;
                            class10.field670 = var15.field816 / 2 + var17;
                            int var49 = class10.field673[var15.field783] * var15.field782 >> 16;
                            int var50 = class10.field674[var15.field783] * var15.field782 >> 16;
                            boolean var51 = this.method214(false, var15);
                            int var52;
                            if (var51) {
                                var52 = var15.field831;
                            } else {
                                var52 = var15.field830;
                            }
                            class21 var53;
                            if (var52 == -1) {
                                var53 = var15.method285((byte) 5, -1, -1, var51);
                            } else {
                                class39 var54 = class39.field1195[var52];
                                var53 = var15.method285((byte) 5, var54.field1197[var15.field775], var54.field1198[var15.field775], var51);
                            }
                            if (var53 != null) {
                                var53.method361(0, var15.field784, 0, var15.field783, 0, var49, var50);
                            }
                            class10.field669 = var47;
                            class10.field670 = var48;
                        } else if (var15.field768 == 7) {
                            class48 var55 = var15.field812;
                            int var56 = 0;
                            for (int var57 = 0; var57 < var15.field816; ++var57) {
                                for (int var58 = 0; var58 < var15.field795; ++var58) {
                                    if (var15.field814[var56] > 0) {
                                        class52 var59 = class52.method489(var15.field814[var56] - 1);
                                        String var60 = var59.field1321;
                                        if (var59.field1347 || var15.field811[var56] != 1) {
                                            var60 = var60 + " x" + method151((byte) 7, var15.field811[var56]);
                                        }
                                        int var61 = (var15.field834 + 115) * var58 + var16;
                                        int var62 = (var15.field833 + 12) * var57 + var17;
                                        if (var15.field822) {
                                            var55.method465(var15.field795 / 2 + var61, (byte) 68, var60, var62, var15.field824, var15.field779);
                                        } else {
                                            var55.method472(var61, var15.field779, var15.field824, var62, var60, (byte) 5);
                                        }
                                    }
                                    ++var56;
                                }
                            }
                        }
                    }
                }
                class35.method414(var7, var9, true, var8, var10);
            }
        }
    }

    @OriginalMember(owner = "client", name = "F", descriptor = "(I)V")
    public final void method216(int arg0) {
        try {
            this.field166 = -1;
            this.field355.method589();
            this.field466.method589();
            class10.method240((byte) -100);
            this.method198(-12265);
            this.field403.method507(6);
            System.gc();
            for (int var2 = 0; var2 < 4; ++var2) {
                this.field350[var2].method451();
            }
            for (int var3 = 0; var3 < 4; ++var3) {
                for (int var4 = 0; var4 < 104; ++var4) {
                    for (int var5 = 0; var5 < 104; ++var5) {
                        this.field535[var3][var4][var5] = 0;
                    }
                }
            }
            class3 var6 = new class3(832, 104, this.field193, this.field535, 104);
            int var7 = this.field276.length;
            class3.field66 = class59.field1444;
            for (int var8 = 0; var8 < var7; ++var8) {
                int var9 = this.field526[var8] >> 8;
                int var10 = this.field526[var8] & 255;
                if (var9 == 33 && var10 >= 71 && var10 <= 73) {
                    class3.field66 = false;
                }
            }
            if (class3.field66) {
                this.field403.method508(this.field442, (byte) 3);
            } else {
                this.field403.method508(0, (byte) 3);
            }
            this.field608.method33((byte) 57, 107);
            if (!this.field406) {
                for (int var11 = 0; var11 < var7; ++var11) {
                    int var12 = (this.field526[var11] >> 8) * 64 - this.field545;
                    int var13 = (this.field526[var11] & 255) * 64 - this.field546;
                    byte[] var14 = this.field276[var11];
                    if (var14 != null) {
                        var6.method14(var12, var14, (this.field228 - 6) * 8, var13, this.field543, (this.field229 - 6) * 8, this.field350);
                    }
                }
                for (int var15 = 0; var15 < var7; ++var15) {
                    int var16 = (this.field526[var15] >> 8) * 64 - this.field545;
                    int var17 = (this.field526[var15] & 255) * 64 - this.field546;
                    byte[] var18 = this.field276[var15];
                    if (var18 == null && this.field229 < 800) {
                        var6.method13(false, 64, var16, var17, 64);
                    }
                }
                this.field608.method33((byte) 57, 107);
                for (int var19 = 0; var19 < var7; ++var19) {
                    byte[] var20 = this.field192[var19];
                    if (var20 != null) {
                        int var21 = (this.field526[var19] >> 8) * 64 - this.field545;
                        int var22 = (this.field526[var19] & 255) * 64 - this.field546;
                        var6.method21(var22, 745, this.field350, this.field403, var20, var21);
                    }
                }
            }
            if (this.field406) {
                int var23 = 0;
                label246: while (true) {
                    if (var23 >= 4) {
                        for (int var33 = 0; var33 < 13; ++var33) {
                            for (int var34 = 0; var34 < 13; ++var34) {
                                int var35 = this.field485[0][var33][var34];
                                if (var35 == -1) {
                                    var6.method13(false, 8, var33 * 8, var34 * 8, 8);
                                }
                            }
                        }
                        this.field608.method33((byte) 57, 107);
                        int var36 = 0;
                        while (true) {
                            if (var36 >= 4) {
                                break label246;
                            }
                            for (int var37 = 0; var37 < 13; ++var37) {
                                for (int var38 = 0; var38 < 13; ++var38) {
                                    int var39 = this.field485[var36][var37][var38];
                                    if (var39 != -1) {
                                        int var40 = var39 >> 24 & 3;
                                        int var41 = var39 >> 1 & 3;
                                        int var42 = var39 >> 14 & 1023;
                                        int var43 = var39 >> 3 & 2047;
                                        int var44 = (var42 / 8 << 8) + var43 / 8;
                                        for (int var45 = 0; var45 < this.field526.length; ++var45) {
                                            if (this.field526[var45] == var44 && this.field192[var45] != null) {
                                                var6.method16(var37 * 8, this.field403, this.field192[var45], var40, var36, (var43 & 7) * 8, this.field564, var41, (var42 & 7) * 8, this.field350, var38 * 8);
                                                break;
                                            }
                                        }
                                    }
                                }
                            }
                            ++var36;
                        }
                    }
                    for (int var24 = 0; var24 < 13; ++var24) {
                        for (int var25 = 0; var25 < 13; ++var25) {
                            int var26 = this.field485[var23][var24][var25];
                            if (var26 != -1) {
                                int var27 = var26 >> 24 & 3;
                                int var28 = var26 >> 1 & 3;
                                int var29 = var26 >> 14 & 1023;
                                int var30 = var26 >> 3 & 2047;
                                int var31 = (var29 / 8 << 8) + var30 / 8;
                                for (int var32 = 0; var32 < this.field526.length; ++var32) {
                                    if (this.field526[var32] == var31 && this.field276[var32] != null) {
                                        var6.method19(45880, var24 * 8, (var30 & 7) * 8, (var29 & 7) * 8, this.field350, var23, var25 * 8, var27, this.field276[var32], var28);
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    ++var23;
                }
            }
            this.field608.method33((byte) 57, 107);
            var6.method17(this.field403, this.field350, -344);
            this.field235.method289(true);
            this.field608.method33((byte) 57, 107);
            for (int var46 = 0; var46 < 104; ++var46) {
                for (int var47 = 0; var47 < 104; ++var47) {
                    this.method209(var46, var47);
                }
            }
            this.method175(this.field555);
        } catch (Exception var60) {
        }
        class64.field1619.method3();
        if (super.field1103 != null) {
            this.field608.method33((byte) 57, 46);
            this.field608.method38(1057001181);
        }
        if (field275 && signlink.cache_dat != null) {
            int var49 = this.field374.method276(0, (byte) 5);
            for (int var50 = 0; var50 < var49; ++var50) {
                int var51 = this.field374.method258(false, var50);
                if ((var51 & 121) == 0) {
                    class21.method340(true, var50);
                }
            }
        }
        System.gc();
        class10.method241(field172, 20);
        this.field195 += arg0;
        this.field374.method256((byte) 4);
        int var52 = (this.field228 - 6) / 8 - 1;
        int var53 = (this.field228 + 6) / 8 + 1;
        int var54 = (this.field229 - 6) / 8 - 1;
        int var55 = (this.field229 + 6) / 8 + 1;
        if (this.field613) {
            var52 = 49;
            var53 = 50;
            var54 = 49;
            var55 = 50;
        }
        for (int var56 = var52; var56 <= var53; ++var56) {
            for (int var57 = var54; var57 <= var55; ++var57) {
                if (var52 == var56 || var53 == var56 || var54 == var57 || var55 == var57) {
                    int var58 = this.field374.method260(0, false, var57, var56);
                    if (var58 != -1) {
                        this.field374.method277((byte) 125, 3, var58);
                    }
                    int var59 = this.field374.method260(1, false, var57, var56);
                    if (var59 != -1) {
                        this.field374.method277((byte) 125, 3, var59);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IILGPPDQFCV;II)V")
    public final void method217(int arg0, int arg1, class22 arg2, int arg3, int arg4) {
        int var6 = 39 / arg4;
        if (field557 != arg2) {
            if (this.field315 < 400) {
                String var7;
                if (arg2.field965 == 0) {
                    var7 = arg2.field973 + method223(-128, field557.field962, arg2.field962) + " (level-" + arg2.field962 + ")";
                } else {
                    var7 = arg2.field973 + " (skill-" + arg2.field965 + ")";
                }
                if (this.field287 == 1) {
                    this.field349[this.field315] = "Use " + this.field291 + " with @whi@" + var7;
                    this.field213[this.field315] = 614;
                    this.field214[this.field315] = arg3;
                    this.field211[this.field315] = arg0;
                    this.field212[this.field315] = arg1;
                    ++this.field315;
                } else if (this.field570 == 1) {
                    if ((this.field572 & 8) == 8) {
                        this.field349[this.field315] = this.field573 + " @whi@" + var7;
                        this.field213[this.field315] = 776;
                        this.field214[this.field315] = arg3;
                        this.field211[this.field315] = arg0;
                        this.field212[this.field315] = arg1;
                        ++this.field315;
                    }
                } else {
                    for (int var8 = 4; var8 >= 0; --var8) {
                        if (this.field538[var8] != null) {
                            this.field349[this.field315] = this.field538[var8] + " @whi@" + var7;
                            short var10 = 0;
                            if (this.field538[var8].equalsIgnoreCase("attack")) {
                                if (arg2.field962 > field557.field962) {
                                    var10 = 2000;
                                }
                                if (field557.field978 != 0 && arg2.field978 != 0) {
                                    if (field557.field978 == arg2.field978) {
                                        var10 = 2000;
                                    } else {
                                        var10 = 0;
                                    }
                                }
                            } else if (this.field539[var8]) {
                                var10 = 2000;
                            }
                            if (var8 == 0) {
                                this.field213[this.field315] = var10 + 303;
                            }
                            if (var8 == 1) {
                                this.field213[this.field315] = var10 + 657;
                            }
                            if (var8 == 2) {
                                this.field213[this.field315] = var10 + 933;
                            }
                            if (var8 == 3) {
                                this.field213[this.field315] = var10 + 718;
                            }
                            if (var8 == 4) {
                                this.field213[this.field315] = var10 + 529;
                            }
                            this.field214[this.field315] = arg3;
                            this.field211[this.field315] = arg0;
                            this.field212[this.field315] = arg1;
                            ++this.field315;
                        }
                    }
                }
                for (int var9 = 0; var9 < this.field315; ++var9) {
                    if (this.field213[var9] == 665) {
                        this.field349[var9] = "Walk here @whi@" + var7;
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "G", descriptor = "(I)V")
    public final void method218(int arg0) {
        if (this.field307 != 0) {
            class48 var2 = this.field161;
            int var3 = 0;
            if (arg0 != 47550) {
                this.field196 = this.field299.method44();
            }
            if (this.field240 != 0) {
                var3 = 1;
            }
            for (int var4 = 0; var4 < 100; ++var4) {
                if (this.field362[var4] != null) {
                    int var5 = this.field360[var4];
                    String var6 = this.field361[var4];
                    byte var7 = 0;
                    if (var6 != null && var6.startsWith("@cr1@")) {
                        var6 = var6.substring(5);
                        var7 = 1;
                    }
                    if (var6 != null && var6.startsWith("@cr2@")) {
                        var6 = var6.substring(5);
                        var7 = 2;
                    }
                    if ((var5 == 3 || var5 == 7) && (var5 == 7 || this.field347 == 0 || this.field347 == 1 && this.method219(var6, (byte) 1))) {
                        int var8 = 329 - var3 * 13;
                        byte var9 = 4;
                        var2.method468("From", var8, 0, var9, (byte) -126);
                        var2.method468("From", var8 - 1, 65535, var9, (byte) -126);
                        int var10 = var9 + var2.method466("From ", false);
                        if (var7 == 1) {
                            this.field467[0].method442(var8 - 12, var10, false);
                            var10 += 14;
                        }
                        if (var7 == 2) {
                            this.field467[1].method442(var8 - 12, var10, false);
                            var10 += 14;
                        }
                        var2.method468(var6 + ": " + this.field362[var4], var8, 0, var10, (byte) -126);
                        var2.method468(var6 + ": " + this.field362[var4], var8 - 1, 65535, var10, (byte) -126);
                        ++var3;
                        if (var3 >= 5) {
                            return;
                        }
                    }
                    if (var5 == 5 && this.field347 < 2) {
                        int var11 = 329 - var3 * 13;
                        var2.method468(this.field362[var4], var11, 0, 4, (byte) -126);
                        var2.method468(this.field362[var4], var11 - 1, 65535, 4, (byte) -126);
                        ++var3;
                        if (var3 >= 5) {
                            return;
                        }
                    }
                    if (var5 == 6 && this.field347 < 2) {
                        int var12 = 329 - var3 * 13;
                        var2.method468("To " + var6 + ": " + this.field362[var4], var12, 0, 4, (byte) -126);
                        var2.method468("To " + var6 + ": " + this.field362[var4], var12 - 1, 65535, 4, (byte) -126);
                        ++var3;
                        if (var3 >= 5) {
                            return;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;B)Z")
    public final boolean method219(String arg0, byte arg1) {
        if (arg0 == null) {
            return false;
        } else {
            for (int var3 = 0; var3 < this.field435; ++var3) {
                if (arg0.equalsIgnoreCase(this.field336[var3])) {
                    return true;
                }
            }
            if (arg1 != 1) {
                this.method197();
            }
            return arg0.equalsIgnoreCase(field557.field973);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILjava/lang/String;ILjava/lang/String;II)LEAXVDNXA;")
    public final class12 method220(int arg0, String arg1, int arg2, String arg3, int arg4, int arg5) {
        byte[] var7 = null;
        while (arg2 >= 0) {
            this.field608.method34(9);
        }
        int var8 = 5;
        try {
            if (this.field348[0] != null) {
                var7 = this.field348[0].method375((byte) -18, arg0);
            }
        } catch (Exception var30) {
        }
        if (var7 != null) {
            this.field356.reset();
            this.field356.update(var7);
            int var9 = (int) this.field356.getValue();
            if (arg4 != var9) {
                var7 = null;
            }
        }
        if (var7 != null) {
            return new class12(var7, -5097);
        } else {
            int var11 = 0;
            while (var7 == null) {
                String var12 = "Unknown error";
                this.method200("Requesting " + arg1, arg5, 5);
                Object var13 = null;
                try {
                    int var14 = 0;
                    DataInputStream var15 = this.method199(arg3 + arg4);
                    byte[] var16 = new byte[6];
                    var15.readFully(var16, 0, 6);
                    class5 var17 = new class5(2, var16);
                    var17.field123 = 3;
                    int var18 = var17.method48() + 6;
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
                            this.method200("Loading " + arg1 + " - " + var23 + "%", arg5, 5);
                        }
                        var14 = var23;
                    }
                    var15.close();
                    try {
                        if (this.field348[0] != null) {
                            this.field348[0].method376(var7.length, arg0, var7, 387);
                        }
                    } catch (Exception var29) {
                        this.field348[0] = null;
                    }
                    if (var7 != null) {
                        this.field356.reset();
                        this.field356.update(var7);
                        int var24 = (int) this.field356.getValue();
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
                            this.method200("Game updated - please reload page", arg5, 5);
                            var26 = 10;
                        } else {
                            this.method200(var12 + " - Retrying in " + var26, arg5, 5);
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
                    this.field502 = !this.field502;
                }
            }
            return new class12(var7, -5097);
        }
    }

    @OriginalMember(owner = "client", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        if (signlink.mainapp != null) {
            return signlink.mainapp.getCodeBase();
        } else {
            try {
                if (super.field1103 != null) {
                    return new URL("http://127.0.0.1:" + (field273 + 80));
                }
            } catch (Exception var1) {
            }
            return super.getCodeBase();
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(II[B)Z")
    public final boolean method221(int arg0, int arg1, byte[] arg2) {
        if (arg0 != 41795) {
            this.field543 = this.field413.method479();
        }
        return arg2 == null ? true : signlink.wavesave(arg2, arg1);
    }

    @OriginalMember(owner = "client", name = "r", descriptor = "(Z)V")
    public final void method222(boolean arg0) {
        if (arg0) {
            this.field196 = this.field299.method44();
        }
        while (true) {
            int var2;
            do {
                while (true) {
                    var2 = this.method403(-27156);
                    if (var2 == -1) {
                        return;
                    }
                    if (this.field268 != -1 && this.field268 == this.field143) {
                        if (var2 == 8 && this.field596.length() > 0) {
                            this.field596 = this.field596.substring(0, this.field596.length() - 1);
                        }
                        break;
                    }
                    if (this.field589) {
                        if (var2 >= 32 && var2 <= 122 && this.field518.length() < 80) {
                            this.field518 = this.field518 + (char) var2;
                            this.field578 = true;
                        }
                        if (var2 == 8 && this.field518.length() > 0) {
                            this.field518 = this.field518.substring(0, this.field518.length() - 1);
                            this.field578 = true;
                        }
                        if (var2 == 13 || var2 == 10) {
                            this.field589 = false;
                            this.field578 = true;
                            if (this.field345 == 1) {
                                long var3 = class31.method388(this.field518);
                                this.method145((byte) 31, var3);
                            }
                            if (this.field345 == 2 && this.field435 > 0) {
                                long var5 = class31.method388(this.field518);
                                this.method131(var5, field330);
                            }
                            if (this.field345 == 3 && this.field518.length() > 0) {
                                this.field608.method33((byte) 57, 127);
                                this.field608.method34(0);
                                int var7 = this.field608.field123;
                                this.field608.method40(0, this.field269);
                                class28.method380(this.field518, this.field608, 42660);
                                this.field608.method43(0, this.field608.field123 - var7);
                                this.field518 = class28.method381(this.field154, this.field518);
                                this.field518 = class19.method305(this.field154, this.field518);
                                this.method181(class31.method392(class31.method389((byte) -71, this.field269), false), -979, this.field518, 6);
                                if (this.field347 == 2) {
                                    this.field347 = 1;
                                    this.field610 = true;
                                    this.field608.method33((byte) 57, 174);
                                    this.field608.method34(this.field540);
                                    this.field608.method34(this.field347);
                                    this.field608.method34(this.field417);
                                }
                            }
                            if (this.field345 == 4 && this.field475 < 100) {
                                long var8 = class31.method388(this.field518);
                                this.method114(var8, 362);
                            }
                            if (this.field345 == 5 && this.field475 > 0) {
                                long var10 = class31.method388(this.field518);
                                this.method146(var10, true);
                            }
                        }
                    } else if (this.field477 == 1) {
                        if (var2 >= 48 && var2 <= 57 && this.field606.length() < 10) {
                            this.field606 = this.field606 + (char) var2;
                            this.field578 = true;
                        }
                        if (var2 == 8 && this.field606.length() > 0) {
                            this.field606 = this.field606.substring(0, this.field606.length() - 1);
                            this.field578 = true;
                        }
                        if (var2 == 13 || var2 == 10) {
                            if (this.field606.length() > 0) {
                                int var12 = 0;
                                try {
                                    var12 = Integer.parseInt(this.field606);
                                } catch (Exception var22) {
                                }
                                this.field608.method33((byte) 57, 220);
                                this.field608.method38(var12);
                            }
                            this.field477 = 0;
                            this.field578 = true;
                        }
                    } else if (this.field477 == 2) {
                        if (var2 >= 32 && var2 <= 122 && this.field606.length() < 12) {
                            this.field606 = this.field606 + (char) var2;
                            this.field578 = true;
                        }
                        if (var2 == 8 && this.field606.length() > 0) {
                            this.field606 = this.field606.substring(0, this.field606.length() - 1);
                            this.field578 = true;
                        }
                        if (var2 == 13 || var2 == 10) {
                            if (this.field606.length() > 0) {
                                this.field608.method33((byte) 57, 15);
                                this.field608.method40(0, class31.method388(this.field606));
                            }
                            this.field477 = 0;
                            this.field578 = true;
                        }
                    } else if (this.field472 == -1) {
                        if (var2 >= 32 && var2 <= 122 && this.field156.length() < 80) {
                            this.field156 = this.field156 + (char) var2;
                            this.field578 = true;
                        }
                        if (var2 == 8 && this.field156.length() > 0) {
                            this.field156 = this.field156.substring(0, this.field156.length() - 1);
                            this.field578 = true;
                        }
                        if ((var2 == 13 || var2 == 10) && this.field156.length() > 0) {
                            if (this.field239 == 2) {
                                if (this.field156.equals("::clientdrop")) {
                                    this.method92(false);
                                }
                                if (this.field156.equals("::lag")) {
                                    this.method189(776);
                                }
                                if (this.field156.equals("::prefetchmusic")) {
                                    for (int var13 = 0; var13 < this.field374.method276(2, (byte) 5); ++var13) {
                                        this.field374.method271(2, 931, var13, (byte) 1);
                                    }
                                }
                                if (this.field156.equals("::fpson")) {
                                    field517 = true;
                                }
                                if (this.field156.equals("::fpsoff")) {
                                    field517 = false;
                                }
                                if (this.field156.equals("::noclip")) {
                                    for (int var14 = 0; var14 < 4; ++var14) {
                                        for (int var15 = 1; var15 < 103; ++var15) {
                                            for (int var16 = 1; var16 < 103; ++var16) {
                                                this.field350[var14].field1286[var15][var16] = 0;
                                            }
                                        }
                                    }
                                }
                            }
                            if (this.field156.startsWith("::")) {
                                this.field608.method33((byte) 57, 238);
                                this.field608.method34(this.field156.length() - 1);
                                this.field608.method41(this.field156.substring(2));
                            } else {
                                String var17 = this.field156.toLowerCase();
                                byte var18 = 0;
                                if (var17.startsWith("yellow:")) {
                                    var18 = 0;
                                    this.field156 = this.field156.substring(7);
                                } else if (var17.startsWith("red:")) {
                                    var18 = 1;
                                    this.field156 = this.field156.substring(4);
                                } else if (var17.startsWith("green:")) {
                                    var18 = 2;
                                    this.field156 = this.field156.substring(6);
                                } else if (var17.startsWith("cyan:")) {
                                    var18 = 3;
                                    this.field156 = this.field156.substring(5);
                                } else if (var17.startsWith("purple:")) {
                                    var18 = 4;
                                    this.field156 = this.field156.substring(7);
                                } else if (var17.startsWith("white:")) {
                                    var18 = 5;
                                    this.field156 = this.field156.substring(6);
                                } else if (var17.startsWith("flash1:")) {
                                    var18 = 6;
                                    this.field156 = this.field156.substring(7);
                                } else if (var17.startsWith("flash2:")) {
                                    var18 = 7;
                                    this.field156 = this.field156.substring(7);
                                } else if (var17.startsWith("flash3:")) {
                                    var18 = 8;
                                    this.field156 = this.field156.substring(7);
                                } else if (var17.startsWith("glow1:")) {
                                    var18 = 9;
                                    this.field156 = this.field156.substring(6);
                                } else if (var17.startsWith("glow2:")) {
                                    var18 = 10;
                                    this.field156 = this.field156.substring(6);
                                } else if (var17.startsWith("glow3:")) {
                                    var18 = 11;
                                    this.field156 = this.field156.substring(6);
                                }
                                String var19 = this.field156.toLowerCase();
                                byte var20 = 0;
                                if (var19.startsWith("wave:")) {
                                    var20 = 1;
                                    this.field156 = this.field156.substring(5);
                                } else if (var19.startsWith("wave2:")) {
                                    var20 = 2;
                                    this.field156 = this.field156.substring(6);
                                } else if (var19.startsWith("shake:")) {
                                    var20 = 3;
                                    this.field156 = this.field156.substring(6);
                                } else if (var19.startsWith("scroll:")) {
                                    var20 = 4;
                                    this.field156 = this.field156.substring(7);
                                } else if (var19.startsWith("slide:")) {
                                    var20 = 5;
                                    this.field156 = this.field156.substring(6);
                                }
                                this.field608.method33((byte) 57, 245);
                                this.field608.method34(0);
                                int var21 = this.field608.field123;
                                this.field608.method60(var20, 47636);
                                this.field608.method34(var18);
                                this.field246.field123 = 0;
                                class28.method380(this.field156, this.field246, 42660);
                                this.field608.method81(0, false, this.field246.field122, this.field246.field123);
                                this.field608.method43(0, this.field608.field123 - var21);
                                this.field156 = class28.method381(this.field154, this.field156);
                                this.field156 = class19.method305(this.field154, this.field156);
                                field557.field1529 = this.field156;
                                field557.field1528 = var18;
                                field557.field1534 = var20;
                                field557.field1558 = 150;
                                if (this.field239 == 2) {
                                    this.method181("@cr2@" + field557.field973, -979, field557.field1529, 2);
                                } else if (this.field239 == 1) {
                                    this.method181("@cr1@" + field557.field973, -979, field557.field1529, 2);
                                } else {
                                    this.method181(field557.field973, -979, field557.field1529, 2);
                                }
                                if (this.field540 == 2) {
                                    this.field540 = 3;
                                    this.field610 = true;
                                    this.field608.method33((byte) 57, 174);
                                    this.field608.method34(this.field540);
                                    this.field608.method34(this.field347);
                                    this.field608.method34(this.field417);
                                }
                            }
                            this.field156 = "";
                            this.field578 = true;
                        }
                    }
                }
            } while ((var2 < 97 || var2 > 122) && (var2 < 65 || var2 > 90) && (var2 < 48 || var2 > 57) && var2 != 32);
            if (this.field596.length() < 12) {
                this.field596 = this.field596 + (char) var2;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(III)Ljava/lang/String;")
    public static final String method223(int arg0, int arg1, int arg2) {
        while (arg0 >= 0) {
            for (int var4 = 1; var4 > 0; ++var4) {
            }
        }
        int var3 = arg1 - arg2;
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
        } else if (var3 > 0) {
            return "@gr1@";
        } else {
            return "@yel@";
        }
    }

    @OriginalMember(owner = "client", name = "s", descriptor = "(Z)V")
    public final void method224(boolean arg0) {
        if (arg0) {
            field172 = !field172;
        }
        if (super.field1114 == 1) {
            if (super.field1115 >= 539 && super.field1115 <= 573 && super.field1116 >= 169 && super.field1116 < 205 && this.field414[0] != -1) {
                this.field433 = true;
                this.field169 = 0;
                this.field509 = true;
            }
            if (super.field1115 >= 569 && super.field1115 <= 599 && super.field1116 >= 168 && super.field1116 < 205 && this.field414[1] != -1) {
                this.field433 = true;
                this.field169 = 1;
                this.field509 = true;
            }
            if (super.field1115 >= 597 && super.field1115 <= 627 && super.field1116 >= 168 && super.field1116 < 205 && this.field414[2] != -1) {
                this.field433 = true;
                this.field169 = 2;
                this.field509 = true;
            }
            if (super.field1115 >= 625 && super.field1115 <= 669 && super.field1116 >= 168 && super.field1116 < 203 && this.field414[3] != -1) {
                this.field433 = true;
                this.field169 = 3;
                this.field509 = true;
            }
            if (super.field1115 >= 666 && super.field1115 <= 696 && super.field1116 >= 168 && super.field1116 < 205 && this.field414[4] != -1) {
                this.field433 = true;
                this.field169 = 4;
                this.field509 = true;
            }
            if (super.field1115 >= 694 && super.field1115 <= 724 && super.field1116 >= 168 && super.field1116 < 205 && this.field414[5] != -1) {
                this.field433 = true;
                this.field169 = 5;
                this.field509 = true;
            }
            if (super.field1115 >= 722 && super.field1115 <= 756 && super.field1116 >= 169 && super.field1116 < 205 && this.field414[6] != -1) {
                this.field433 = true;
                this.field169 = 6;
                this.field509 = true;
            }
            if (super.field1115 >= 540 && super.field1115 <= 574 && super.field1116 >= 466 && super.field1116 < 502 && this.field414[7] != -1) {
                this.field433 = true;
                this.field169 = 7;
                this.field509 = true;
            }
            if (super.field1115 >= 572 && super.field1115 <= 602 && super.field1116 >= 466 && super.field1116 < 503 && this.field414[8] != -1) {
                this.field433 = true;
                this.field169 = 8;
                this.field509 = true;
            }
            if (super.field1115 >= 599 && super.field1115 <= 629 && super.field1116 >= 466 && super.field1116 < 503 && this.field414[9] != -1) {
                this.field433 = true;
                this.field169 = 9;
                this.field509 = true;
            }
            if (super.field1115 >= 627 && super.field1115 <= 671 && super.field1116 >= 467 && super.field1116 < 502 && this.field414[10] != -1) {
                this.field433 = true;
                this.field169 = 10;
                this.field509 = true;
            }
            if (super.field1115 >= 669 && super.field1115 <= 699 && super.field1116 >= 466 && super.field1116 < 503 && this.field414[11] != -1) {
                this.field433 = true;
                this.field169 = 11;
                this.field509 = true;
            }
            if (super.field1115 >= 696 && super.field1115 <= 726 && super.field1116 >= 466 && super.field1116 < 503 && this.field414[12] != -1) {
                this.field433 = true;
                this.field169 = 12;
                this.field509 = true;
            }
            if (super.field1115 >= 724 && super.field1115 <= 758 && super.field1116 >= 466 && super.field1116 < 502 && this.field414[13] != -1) {
                this.field433 = true;
                this.field169 = 13;
                this.field509 = true;
                return;
            }
        }
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; ++var1) {
            field217[var1] = var0 - 1;
            var0 += var0;
        }
        field252 = 750;
        field272 = 10;
        field274 = true;
        field286 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");
        field330 = -11776;
        field335 = new int[99];
        int var2 = 0;
        for (int var3 = 0; var3 < 99; ++var3) {
            int var4 = var3 + 1;
            int var5 = (int) ((double) var4 + 300.0D * Math.pow(2.0D, (double) var4 / 7.0D));
            var2 += var5;
            field335[var3] = var2 / 4;
        }
        field339 = -128;
        field416 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };
        field498 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
        field531 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };
        field553 = 7;
        field594 = -45573;
        field603 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");
    }
}
