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

@OriginalClass("client")
public class client extends class18 {

    @OriginalMember(owner = "client", name = "T", descriptor = "Z")
    private boolean field169 = true;

    @OriginalMember(owner = "client", name = "fb", descriptor = "I")
    private int field181 = -1;

    @OriginalMember(owner = "client", name = "kb", descriptor = "[I")
    private int[] field186 = new int[5];

    @OriginalMember(owner = "client", name = "mb", descriptor = "Z")
    private boolean field188 = true;

    @OriginalMember(owner = "client", name = "nb", descriptor = "[I")
    private int[] field189 = new int[class58.field1328];

    @OriginalMember(owner = "client", name = "ob", descriptor = "Z")
    private boolean field190 = true;

    @OriginalMember(owner = "client", name = "pb", descriptor = "[Z")
    private boolean[] field191 = new boolean[5];

    @OriginalMember(owner = "client", name = "qb", descriptor = "LXGRGMPUQ;")
    private class69 field192 = new class69(new byte[5000], -82);

    @OriginalMember(owner = "client", name = "rb", descriptor = "[LDLMOHDFX;")
    private class13[] field193 = new class13[16384];

    @OriginalMember(owner = "client", name = "tb", descriptor = "[I")
    public int[] field195 = new int[16384];

    @OriginalMember(owner = "client", name = "vb", descriptor = "B")
    private byte field197 = 7;

    @OriginalMember(owner = "client", name = "wb", descriptor = "[I")
    private int[] field198 = new int[7];

    @OriginalMember(owner = "client", name = "Db", descriptor = "I")
    private int field205 = -17431;

    @OriginalMember(owner = "client", name = "Fb", descriptor = "Z")
    private boolean field207 = false;

    @OriginalMember(owner = "client", name = "Mb", descriptor = "[I")
    private int[] field214 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client", name = "Ob", descriptor = "[I")
    private int[] field216 = new int[50];

    @OriginalMember(owner = "client", name = "Pb", descriptor = "LVYAVYWNE;")
    private class65 field217 = new class65();

    @OriginalMember(owner = "client", name = "Sb", descriptor = "Z")
    private boolean field220 = false;

    @OriginalMember(owner = "client", name = "Tb", descriptor = "[I")
    private int[] field221 = new int[class58.field1328];

    @OriginalMember(owner = "client", name = "Wb", descriptor = "I")
    private int field224 = -1;

    @OriginalMember(owner = "client", name = "Xb", descriptor = "I")
    private int field225 = 7759444;

    @OriginalMember(owner = "client", name = "Yb", descriptor = "[I")
    private int[] field226 = new int[100];

    @OriginalMember(owner = "client", name = "Zb", descriptor = "[Ljava/lang/String;")
    private String[] field227 = new String[100];

    @OriginalMember(owner = "client", name = "ac", descriptor = "[Ljava/lang/String;")
    private String[] field228 = new String[100];

    @OriginalMember(owner = "client", name = "cc", descriptor = "[J")
    private long[] field230 = new long[200];

    @OriginalMember(owner = "client", name = "dc", descriptor = "Ljava/lang/String;")
    private String field231 = "";

    @OriginalMember(owner = "client", name = "ec", descriptor = "LXGRGMPUQ;")
    private class69 field232 = class69.method453(1, field281);

    @OriginalMember(owner = "client", name = "qc", descriptor = "I")
    private int field244 = 1;

    @OriginalMember(owner = "client", name = "rc", descriptor = "[I")
    private int[] field245 = new int[33];

    @OriginalMember(owner = "client", name = "tc", descriptor = "I")
    private int field247 = -1;

    @OriginalMember(owner = "client", name = "xc", descriptor = "[[[I")
    private int[][][] field251 = new int[4][13][13];

    @OriginalMember(owner = "client", name = "Ec", descriptor = "I")
    private int field258 = 2;

    @OriginalMember(owner = "client", name = "Fc", descriptor = "I")
    private final int field259 = 100;

    @OriginalMember(owner = "client", name = "Gc", descriptor = "[I")
    private int[] field260 = new int[100];

    @OriginalMember(owner = "client", name = "Hc", descriptor = "[J")
    private long[] field261 = new long[100];

    @OriginalMember(owner = "client", name = "Ic", descriptor = "I")
    private int field262 = -1;

    @OriginalMember(owner = "client", name = "Jc", descriptor = "I")
    private int field263 = -1;

    @OriginalMember(owner = "client", name = "Pc", descriptor = "[I")
    private int[] field269 = new int[50];

    @OriginalMember(owner = "client", name = "Wc", descriptor = "Z")
    private boolean field276 = false;

    @OriginalMember(owner = "client", name = "Xc", descriptor = "Z")
    private boolean field277 = false;

    @OriginalMember(owner = "client", name = "Yc", descriptor = "[I")
    private int[] field278 = new int[200];

    @OriginalMember(owner = "client", name = "ed", descriptor = "I")
    private int field284 = -1;

    @OriginalMember(owner = "client", name = "fd", descriptor = "[I")
    private int[] field285 = new int[5];

    @OriginalMember(owner = "client", name = "hd", descriptor = "Z")
    private boolean field287 = false;

    @OriginalMember(owner = "client", name = "id", descriptor = "Z")
    private boolean field288 = false;

    @OriginalMember(owner = "client", name = "jd", descriptor = "Z")
    private boolean field289 = false;

    @OriginalMember(owner = "client", name = "ld", descriptor = "Z")
    private boolean field291 = false;

    @OriginalMember(owner = "client", name = "od", descriptor = "[B")
    private byte[] field294 = new byte[16384];

    @OriginalMember(owner = "client", name = "qd", descriptor = "[LPDMJJHOP;")
    private class55[] field296 = new class55[32];

    @OriginalMember(owner = "client", name = "vd", descriptor = "B")
    private byte field301 = 4;

    @OriginalMember(owner = "client", name = "zd", descriptor = "LVLUKUYNM;")
    private class60 field305 = new class60((byte) 0);

    @OriginalMember(owner = "client", name = "Nd", descriptor = "I")
    private int field319 = 2301979;

    @OriginalMember(owner = "client", name = "Od", descriptor = "[I")
    public int[] field320 = new int[2000];

    @OriginalMember(owner = "client", name = "Pd", descriptor = "Ljava/util/zip/CRC32;")
    private CRC32 field321 = new CRC32();

    @OriginalMember(owner = "client", name = "Qd", descriptor = "[I")
    private final int[] field322 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client", name = "Xd", descriptor = "Z")
    private boolean field329 = false;

    @OriginalMember(owner = "client", name = "Zd", descriptor = "[LPDMJJHOP;")
    private class55[] field331 = new class55[32];

    @OriginalMember(owner = "client", name = "ce", descriptor = "Z")
    public boolean field334 = false;

    @OriginalMember(owner = "client", name = "de", descriptor = "Ljava/lang/String;")
    private String field335 = "";

    @OriginalMember(owner = "client", name = "ge", descriptor = "Z")
    private boolean field338 = false;

    @OriginalMember(owner = "client", name = "he", descriptor = "I")
    private int field339 = -1;

    @OriginalMember(owner = "client", name = "se", descriptor = "[LVSJQVIFL;")
    private class63[] field350 = new class63[13];

    @OriginalMember(owner = "client", name = "we", descriptor = "Z")
    private boolean field354 = true;

    @OriginalMember(owner = "client", name = "xe", descriptor = "[[I")
    private int[][] field355 = new int[104][104];

    @OriginalMember(owner = "client", name = "ye", descriptor = "I")
    private int field356 = -1;

    @OriginalMember(owner = "client", name = "ze", descriptor = "[[I")
    private int[][] field357 = new int[104][104];

    @OriginalMember(owner = "client", name = "Ae", descriptor = "[I")
    private int[] field358 = new int[50];

    @OriginalMember(owner = "client", name = "Be", descriptor = "[[[LVLUKUYNM;")
    private class60[][][] field359 = new class60[4][104][104];

    @OriginalMember(owner = "client", name = "De", descriptor = "[LGQSCEHQI;")
    private class21[] field361 = new class21[4];

    @OriginalMember(owner = "client", name = "He", descriptor = "I")
    private int field365 = 2;

    @OriginalMember(owner = "client", name = "Ie", descriptor = "[I")
    private int[] field366 = new int[2000];

    @OriginalMember(owner = "client", name = "Je", descriptor = "I")
    private int field367 = 3353893;

    @OriginalMember(owner = "client", name = "Le", descriptor = "Z")
    private boolean field369 = false;

    @OriginalMember(owner = "client", name = "Me", descriptor = "[I")
    private int[] field370 = new int[33];

    @OriginalMember(owner = "client", name = "Ne", descriptor = "I")
    private int field371 = 128;

    @OriginalMember(owner = "client", name = "Re", descriptor = "I")
    private int field375 = 4006;

    @OriginalMember(owner = "client", name = "Te", descriptor = "Z")
    private volatile boolean field377 = false;

    @OriginalMember(owner = "client", name = "Ve", descriptor = "I")
    private int field379 = 1;

    @OriginalMember(owner = "client", name = "We", descriptor = "[LVSJQVIFL;")
    private class63[] field380 = new class63[2];

    @OriginalMember(owner = "client", name = "Xe", descriptor = "Z")
    public boolean field381 = true;

    @OriginalMember(owner = "client", name = "af", descriptor = "[LPDMJJHOP;")
    private class55[] field384 = new class55[20];

    @OriginalMember(owner = "client", name = "hf", descriptor = "I")
    private int field391 = -1;

    @OriginalMember(owner = "client", name = "jf", descriptor = "Z")
    private boolean field392 = false;

    @OriginalMember(owner = "client", name = "mf", descriptor = "I")
    private int field395 = 1;

    @OriginalMember(owner = "client", name = "qf", descriptor = "Z")
    private boolean field399 = false;

    @OriginalMember(owner = "client", name = "rf", descriptor = "[[I")
    private int[][] field400 = new int[104][104];

    @OriginalMember(owner = "client", name = "tf", descriptor = "[I")
    private int[] field402 = new int[5];

    @OriginalMember(owner = "client", name = "uf", descriptor = "[Ljava/lang/String;")
    private String[] field403 = new String[5];

    @OriginalMember(owner = "client", name = "vf", descriptor = "[Z")
    private boolean[] field404 = new boolean[5];

    @OriginalMember(owner = "client", name = "Af", descriptor = "I")
    private int field409 = -1;

    @OriginalMember(owner = "client", name = "Gf", descriptor = "LXGRGMPUQ;")
    private class69 field415 = class69.method453(1, field281);

    @OriginalMember(owner = "client", name = "Xf", descriptor = "Z")
    private volatile boolean field432 = false;

    @OriginalMember(owner = "client", name = "Yf", descriptor = "Z")
    private boolean field433 = false;

    @OriginalMember(owner = "client", name = "ag", descriptor = "[I")
    private int[] field435 = new int[1000];

    @OriginalMember(owner = "client", name = "bg", descriptor = "[I")
    private int[] field436 = new int[1000];

    @OriginalMember(owner = "client", name = "cg", descriptor = "Ljava/lang/String;")
    private String field437 = "";

    @OriginalMember(owner = "client", name = "dg", descriptor = "Ljava/lang/String;")
    private String field438 = "";

    @OriginalMember(owner = "client", name = "eg", descriptor = "B")
    private byte field439 = -49;

    @OriginalMember(owner = "client", name = "hg", descriptor = "I")
    private int field442 = -1;

    @OriginalMember(owner = "client", name = "ig", descriptor = "I")
    private int field443 = 3;

    @OriginalMember(owner = "client", name = "jg", descriptor = "I")
    private int field444 = 19939;

    @OriginalMember(owner = "client", name = "og", descriptor = "[I")
    private int[] field449 = new int[5];

    @OriginalMember(owner = "client", name = "pg", descriptor = "I")
    private int field450 = -1;

    @OriginalMember(owner = "client", name = "sg", descriptor = "B")
    private byte field453 = 3;

    @OriginalMember(owner = "client", name = "tg", descriptor = "Z")
    private boolean field454 = false;

    @OriginalMember(owner = "client", name = "Bg", descriptor = "LVLUKUYNM;")
    private class60 field462 = new class60((byte) 0);

    @OriginalMember(owner = "client", name = "Mg", descriptor = "[LPDMJJHOP;")
    private class55[] field473 = new class55[32];

    @OriginalMember(owner = "client", name = "Ng", descriptor = "[LPDMJJHOP;")
    private class55[] field474 = new class55[100];

    @OriginalMember(owner = "client", name = "Og", descriptor = "I")
    private int field475 = -1;

    @OriginalMember(owner = "client", name = "Tg", descriptor = "Z")
    private boolean field480 = true;

    @OriginalMember(owner = "client", name = "Ug", descriptor = "B")
    private byte field481 = 3;

    @OriginalMember(owner = "client", name = "Vg", descriptor = "[I")
    private int[] field482 = new int[256];

    @OriginalMember(owner = "client", name = "Wg", descriptor = "[I")
    private int[] field483 = new int[4000];

    @OriginalMember(owner = "client", name = "Xg", descriptor = "[I")
    private int[] field484 = new int[4000];

    @OriginalMember(owner = "client", name = "Yg", descriptor = "[LPDMJJHOP;")
    private class55[] field485 = new class55[1000];

    @OriginalMember(owner = "client", name = "ah", descriptor = "I")
    private int field487 = 2;

    @OriginalMember(owner = "client", name = "bh", descriptor = "LXGRGMPUQ;")
    private class69 field488 = class69.method453(1, field281);

    @OriginalMember(owner = "client", name = "ch", descriptor = "I")
    private int field489 = 1;

    @OriginalMember(owner = "client", name = "dh", descriptor = "Ljava/lang/String;")
    private String field490 = "";

    @OriginalMember(owner = "client", name = "hh", descriptor = "Ljava/lang/String;")
    private String field494 = "";

    @OriginalMember(owner = "client", name = "jh", descriptor = "Z")
    private boolean field496 = false;

    @OriginalMember(owner = "client", name = "ph", descriptor = "Ljava/lang/String;")
    private String field502 = "";

    @OriginalMember(owner = "client", name = "qh", descriptor = "Ljava/lang/String;")
    private String field503 = "";

    @OriginalMember(owner = "client", name = "th", descriptor = "[I")
    private int[] field506 = new int[5];

    @OriginalMember(owner = "client", name = "vh", descriptor = "I")
    private int field508 = 44451;

    @OriginalMember(owner = "client", name = "yh", descriptor = "B")
    private byte field511 = 6;

    @OriginalMember(owner = "client", name = "zh", descriptor = "I")
    private int field512 = 831;

    @OriginalMember(owner = "client", name = "Bh", descriptor = "Z")
    private boolean field514 = false;

    @OriginalMember(owner = "client", name = "Ch", descriptor = "Z")
    private boolean field515 = false;

    @OriginalMember(owner = "client", name = "Ih", descriptor = "[Ljava/lang/String;")
    private String[] field521 = new String[200];

    @OriginalMember(owner = "client", name = "Sh", descriptor = "[I")
    private int[] field531 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client", name = "Th", descriptor = "B")
    private byte field532 = 1;

    @OriginalMember(owner = "client", name = "Vh", descriptor = "Z")
    private boolean field534 = false;

    @OriginalMember(owner = "client", name = "Wh", descriptor = "Z")
    private boolean field535 = false;

    @OriginalMember(owner = "client", name = "Zh", descriptor = "Z")
    private volatile boolean field538 = false;

    @OriginalMember(owner = "client", name = "li", descriptor = "I")
    private int field550 = -1;

    @OriginalMember(owner = "client", name = "oi", descriptor = "I")
    private int field553 = 5063219;

    @OriginalMember(owner = "client", name = "si", descriptor = "[I")
    public int[] field557 = new int[1000];

    @OriginalMember(owner = "client", name = "ti", descriptor = "Z")
    private boolean field558 = false;

    @OriginalMember(owner = "client", name = "vi", descriptor = "I")
    private int field560 = 78;

    @OriginalMember(owner = "client", name = "wi", descriptor = "Z")
    private boolean field561 = false;

    @OriginalMember(owner = "client", name = "yi", descriptor = "I")
    private int field563 = 50;

    @OriginalMember(owner = "client", name = "zi", descriptor = "[I")
    private int[] field564 = new int[this.field563];

    @OriginalMember(owner = "client", name = "Ai", descriptor = "[I")
    private int[] field565 = new int[this.field563];

    @OriginalMember(owner = "client", name = "Bi", descriptor = "[I")
    private int[] field566 = new int[this.field563];

    @OriginalMember(owner = "client", name = "Ci", descriptor = "[I")
    private int[] field567 = new int[this.field563];

    @OriginalMember(owner = "client", name = "Di", descriptor = "[I")
    private int[] field568 = new int[this.field563];

    @OriginalMember(owner = "client", name = "Ei", descriptor = "[I")
    private int[] field569 = new int[this.field563];

    @OriginalMember(owner = "client", name = "Fi", descriptor = "[I")
    private int[] field570 = new int[this.field563];

    @OriginalMember(owner = "client", name = "Gi", descriptor = "[Ljava/lang/String;")
    private String[] field571 = new String[this.field563];

    @OriginalMember(owner = "client", name = "Ii", descriptor = "I")
    private int field573 = 2048;

    @OriginalMember(owner = "client", name = "Ji", descriptor = "I")
    private int field574 = 2047;

    @OriginalMember(owner = "client", name = "Ki", descriptor = "[LMTFZASIN;")
    private class48[] field575 = new class48[this.field573];

    @OriginalMember(owner = "client", name = "Mi", descriptor = "[I")
    public int[] field577 = new int[this.field573];

    @OriginalMember(owner = "client", name = "Oi", descriptor = "[I")
    private int[] field579 = new int[this.field573];

    @OriginalMember(owner = "client", name = "Pi", descriptor = "[LXGRGMPUQ;")
    private class69[] field580 = new class69[this.field573];

    @OriginalMember(owner = "client", name = "Qi", descriptor = "[Ljava/lang/String;")
    private String[] field581 = new String[500];

    @OriginalMember(owner = "client", name = "Ti", descriptor = "LVLUKUYNM;")
    private class60 field584 = new class60((byte) 0);

    @OriginalMember(owner = "client", name = "Vi", descriptor = "[LVSJQVIFL;")
    private class63[] field586 = new class63[100];

    @OriginalMember(owner = "client", name = "Wi", descriptor = "Z")
    private boolean field587 = true;

    @OriginalMember(owner = "client", name = "Yi", descriptor = "B")
    private byte field589 = -70;

    @OriginalMember(owner = "client", name = "ej", descriptor = "Z")
    private boolean field595 = false;

    @OriginalMember(owner = "client", name = "fj", descriptor = "Z")
    private boolean field596 = false;

    @OriginalMember(owner = "client", name = "gj", descriptor = "[I")
    private int[] field597 = new int[9];

    @OriginalMember(owner = "client", name = "hj", descriptor = "[LPDMJJHOP;")
    private class55[] field598 = new class55[8];

    @OriginalMember(owner = "client", name = "lj", descriptor = "[I")
    public int[] field602 = new int[] { 17, 24, 34, 40 };

    @OriginalMember(owner = "client", name = "nj", descriptor = "I")
    private int field604 = 1;

    @OriginalMember(owner = "client", name = "oj", descriptor = "I")
    private int field605 = -1;

    @OriginalMember(owner = "client", name = "pj", descriptor = "Ljava/lang/String;")
    private String field606 = "";

    @OriginalMember(owner = "client", name = "rj", descriptor = "I")
    private int field608 = -1;

    @OriginalMember(owner = "client", name = "sj", descriptor = "I")
    private int field609 = -601;

    @OriginalMember(owner = "client", name = "vj", descriptor = "[I")
    private int[] field612 = new int[151];

    @OriginalMember(owner = "client", name = "Fj", descriptor = "[I")
    private int[] field622 = new int[class58.field1328];

    @OriginalMember(owner = "client", name = "Gj", descriptor = "[I")
    private int[] field623 = new int[151];

    @OriginalMember(owner = "client", name = "Ij", descriptor = "[I")
    private int[] field625 = new int[500];

    @OriginalMember(owner = "client", name = "Jj", descriptor = "[I")
    private int[] field626 = new int[500];

    @OriginalMember(owner = "client", name = "Kj", descriptor = "[I")
    private int[] field627 = new int[500];

    @OriginalMember(owner = "client", name = "Lj", descriptor = "[I")
    private int[] field628 = new int[500];

    @OriginalMember(owner = "client", name = "Oj", descriptor = "[LIJFFCIDM;")
    public class25[] field631 = new class25[5];

    @OriginalMember(owner = "client", name = "Sj", descriptor = "I")
    private int field635 = 2;

    @OriginalMember(owner = "client", name = "Xj", descriptor = "Z")
    private boolean field640 = true;

    @OriginalMember(owner = "client", name = "Z", descriptor = "I")
    private static int field175 = -891;

    @OriginalMember(owner = "client", name = "ab", descriptor = "I")
    private static int field176 = -551;

    @OriginalMember(owner = "client", name = "db", descriptor = "I")
    private static int field179 = 5;

    @OriginalMember(owner = "client", name = "bd", descriptor = "B")
    private static byte field281 = 74;

    @OriginalMember(owner = "client", name = "cd", descriptor = "Ljava/lang/String;")
    private static String field282 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @OriginalMember(owner = "client", name = "nd", descriptor = "Ljava/math/BigInteger;")
    private static BigInteger field293 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client", name = "ee", descriptor = "[[I")
    public static final int[][] field336 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client", name = "bf", descriptor = "[I")
    public static int[] field385 = new int[32];

    @OriginalMember(owner = "client", name = "gf", descriptor = "[I")
    public static final int[] field390;

    @OriginalMember(owner = "client", name = "Hg", descriptor = "I")
    private static int field468;

    @OriginalMember(owner = "client", name = "Jg", descriptor = "Z")
    private static boolean field470;

    @OriginalMember(owner = "client", name = "Sg", descriptor = "Ljava/math/BigInteger;")
    private static BigInteger field479;

    @OriginalMember(owner = "client", name = "uh", descriptor = "Z")
    private static boolean field507;

    @OriginalMember(owner = "client", name = "Zi", descriptor = "[I")
    private static int[] field590;

    @OriginalMember(owner = "client", name = "ij", descriptor = "I")
    private static int field599;

    @OriginalMember(owner = "client", name = "K", descriptor = "I")
    private int field160;

    @OriginalMember(owner = "client", name = "L", descriptor = "I")
    private int field161;

    @OriginalMember(owner = "client", name = "M", descriptor = "I")
    private int field162;

    @OriginalMember(owner = "client", name = "N", descriptor = "I")
    private int field163;

    @OriginalMember(owner = "client", name = "O", descriptor = "I")
    private int field164;

    @OriginalMember(owner = "client", name = "P", descriptor = "I")
    public int field165;

    @OriginalMember(owner = "client", name = "Q", descriptor = "I")
    public int field166;

    @OriginalMember(owner = "client", name = "R", descriptor = "I")
    private int field167;

    @OriginalMember(owner = "client", name = "S", descriptor = "I")
    public static int field168;

    @OriginalMember(owner = "client", name = "W", descriptor = "I")
    private int field172;

    @OriginalMember(owner = "client", name = "X", descriptor = "I")
    private int field173;

    @OriginalMember(owner = "client", name = "Y", descriptor = "I")
    private int field174;

    @OriginalMember(owner = "client", name = "bb", descriptor = "I")
    private static int field177;

    @OriginalMember(owner = "client", name = "eb", descriptor = "I")
    private int field180;

    @OriginalMember(owner = "client", name = "gb", descriptor = "I")
    private int field182;

    @OriginalMember(owner = "client", name = "hb", descriptor = "I")
    private int field183;

    @OriginalMember(owner = "client", name = "ib", descriptor = "I")
    private int field184;

    @OriginalMember(owner = "client", name = "jb", descriptor = "I")
    private int field185;

    @OriginalMember(owner = "client", name = "lb", descriptor = "I")
    private static int field187;

    @OriginalMember(owner = "client", name = "sb", descriptor = "I")
    private int field194;

    @OriginalMember(owner = "client", name = "ub", descriptor = "I")
    private int field196;

    @OriginalMember(owner = "client", name = "xb", descriptor = "I")
    private int field199;

    @OriginalMember(owner = "client", name = "yb", descriptor = "I")
    private int field200;

    @OriginalMember(owner = "client", name = "zb", descriptor = "I")
    private int field201;

    @OriginalMember(owner = "client", name = "Ab", descriptor = "I")
    private int field202;

    @OriginalMember(owner = "client", name = "Bb", descriptor = "I")
    private int field203;

    @OriginalMember(owner = "client", name = "Cb", descriptor = "I")
    private int field204;

    @OriginalMember(owner = "client", name = "Eb", descriptor = "I")
    private int field206;

    @OriginalMember(owner = "client", name = "Gb", descriptor = "I")
    private int field208;

    @OriginalMember(owner = "client", name = "Hb", descriptor = "I")
    private int field209;

    @OriginalMember(owner = "client", name = "Ib", descriptor = "I")
    private int field210;

    @OriginalMember(owner = "client", name = "Jb", descriptor = "I")
    private int field211;

    @OriginalMember(owner = "client", name = "Kb", descriptor = "I")
    private int field212;

    @OriginalMember(owner = "client", name = "Lb", descriptor = "I")
    private int field213;

    @OriginalMember(owner = "client", name = "Nb", descriptor = "I")
    private int field215;

    @OriginalMember(owner = "client", name = "Rb", descriptor = "I")
    private int field219;

    @OriginalMember(owner = "client", name = "fc", descriptor = "I")
    private int field233;

    @OriginalMember(owner = "client", name = "gc", descriptor = "I")
    private int field234;

    @OriginalMember(owner = "client", name = "hc", descriptor = "I")
    private int field235;

    @OriginalMember(owner = "client", name = "ic", descriptor = "I")
    private int field236;

    @OriginalMember(owner = "client", name = "kc", descriptor = "I")
    private int field238;

    @OriginalMember(owner = "client", name = "lc", descriptor = "I")
    private int field239;

    @OriginalMember(owner = "client", name = "mc", descriptor = "I")
    private int field240;

    @OriginalMember(owner = "client", name = "sc", descriptor = "I")
    private int field246;

    @OriginalMember(owner = "client", name = "uc", descriptor = "I")
    private int field248;

    @OriginalMember(owner = "client", name = "vc", descriptor = "I")
    private int field249;

    @OriginalMember(owner = "client", name = "wc", descriptor = "I")
    private int field250;

    @OriginalMember(owner = "client", name = "yc", descriptor = "I")
    private int field252;

    @OriginalMember(owner = "client", name = "zc", descriptor = "I")
    private int field253;

    @OriginalMember(owner = "client", name = "Ac", descriptor = "I")
    private int field254;

    @OriginalMember(owner = "client", name = "Cc", descriptor = "I")
    private static int field256;

    @OriginalMember(owner = "client", name = "Dc", descriptor = "I")
    private int field257;

    @OriginalMember(owner = "client", name = "Oc", descriptor = "I")
    private int field268;

    @OriginalMember(owner = "client", name = "Rc", descriptor = "I")
    private int field271;

    @OriginalMember(owner = "client", name = "Sc", descriptor = "I")
    private int field272;

    @OriginalMember(owner = "client", name = "Uc", descriptor = "I")
    private int field274;

    @OriginalMember(owner = "client", name = "Zc", descriptor = "I")
    public int field279;

    @OriginalMember(owner = "client", name = "ad", descriptor = "I")
    private int field280;

    @OriginalMember(owner = "client", name = "dd", descriptor = "I")
    private int field283;

    @OriginalMember(owner = "client", name = "md", descriptor = "I")
    private int field292;

    @OriginalMember(owner = "client", name = "pd", descriptor = "I")
    private int field295;

    @OriginalMember(owner = "client", name = "td", descriptor = "I")
    private static int field299;

    @OriginalMember(owner = "client", name = "ud", descriptor = "I")
    private int field300;

    @OriginalMember(owner = "client", name = "wd", descriptor = "I")
    private int field302;

    @OriginalMember(owner = "client", name = "xd", descriptor = "I")
    private int field303;

    @OriginalMember(owner = "client", name = "Gd", descriptor = "I")
    private int field312;

    @OriginalMember(owner = "client", name = "Hd", descriptor = "I")
    private static int field313;

    @OriginalMember(owner = "client", name = "Ld", descriptor = "I")
    private int field317;

    @OriginalMember(owner = "client", name = "Md", descriptor = "I")
    private int field318;

    @OriginalMember(owner = "client", name = "Sd", descriptor = "I")
    private int field324;

    @OriginalMember(owner = "client", name = "Td", descriptor = "I")
    private int field325;

    @OriginalMember(owner = "client", name = "Ud", descriptor = "I")
    private int field326;

    @OriginalMember(owner = "client", name = "Vd", descriptor = "I")
    private int field327;

    @OriginalMember(owner = "client", name = "Wd", descriptor = "I")
    private int field328;

    @OriginalMember(owner = "client", name = "ae", descriptor = "I")
    private int field332;

    @OriginalMember(owner = "client", name = "be", descriptor = "I")
    private static int field333;

    @OriginalMember(owner = "client", name = "fe", descriptor = "I")
    private int field337;

    @OriginalMember(owner = "client", name = "ke", descriptor = "I")
    private static int field342;

    @OriginalMember(owner = "client", name = "le", descriptor = "I")
    private int field343;

    @OriginalMember(owner = "client", name = "re", descriptor = "I")
    private int field349;

    @OriginalMember(owner = "client", name = "te", descriptor = "I")
    private int field351;

    @OriginalMember(owner = "client", name = "ve", descriptor = "I")
    private int field353;

    @OriginalMember(owner = "client", name = "Ce", descriptor = "I")
    private static int field360;

    @OriginalMember(owner = "client", name = "Ee", descriptor = "I")
    private int field362;

    @OriginalMember(owner = "client", name = "Fe", descriptor = "I")
    private int field363;

    @OriginalMember(owner = "client", name = "Ge", descriptor = "I")
    private int field364;

    @OriginalMember(owner = "client", name = "Ke", descriptor = "I")
    private int field368;

    @OriginalMember(owner = "client", name = "Oe", descriptor = "I")
    private int field372;

    @OriginalMember(owner = "client", name = "Pe", descriptor = "I")
    private int field373;

    @OriginalMember(owner = "client", name = "Qe", descriptor = "I")
    private int field374;

    @OriginalMember(owner = "client", name = "Ue", descriptor = "I")
    private int field378;

    @OriginalMember(owner = "client", name = "Ye", descriptor = "I")
    private static int field382;

    @OriginalMember(owner = "client", name = "kf", descriptor = "I")
    private int field393;

    @OriginalMember(owner = "client", name = "lf", descriptor = "I")
    private int field394;

    @OriginalMember(owner = "client", name = "nf", descriptor = "I")
    private int field396;

    @OriginalMember(owner = "client", name = "of", descriptor = "I")
    private int field397;

    @OriginalMember(owner = "client", name = "pf", descriptor = "I")
    private int field398;

    @OriginalMember(owner = "client", name = "sf", descriptor = "I")
    private int field401;

    @OriginalMember(owner = "client", name = "wf", descriptor = "I")
    private int field405;

    @OriginalMember(owner = "client", name = "xf", descriptor = "I")
    private int field406;

    @OriginalMember(owner = "client", name = "zf", descriptor = "I")
    private int field408;

    @OriginalMember(owner = "client", name = "Bf", descriptor = "I")
    private int field410;

    @OriginalMember(owner = "client", name = "Cf", descriptor = "I")
    private int field411;

    @OriginalMember(owner = "client", name = "Jf", descriptor = "I")
    private int field418;

    @OriginalMember(owner = "client", name = "Kf", descriptor = "I")
    private int field419;

    @OriginalMember(owner = "client", name = "Lf", descriptor = "I")
    private int field420;

    @OriginalMember(owner = "client", name = "Mf", descriptor = "I")
    private int field421;

    @OriginalMember(owner = "client", name = "Nf", descriptor = "I")
    private int field422;

    @OriginalMember(owner = "client", name = "Of", descriptor = "I")
    private int field423;

    @OriginalMember(owner = "client", name = "Pf", descriptor = "I")
    private int field424;

    @OriginalMember(owner = "client", name = "Qf", descriptor = "I")
    private int field425;

    @OriginalMember(owner = "client", name = "Rf", descriptor = "I")
    private int field426;

    @OriginalMember(owner = "client", name = "Sf", descriptor = "I")
    private int field427;

    @OriginalMember(owner = "client", name = "Zf", descriptor = "I")
    private int field434;

    @OriginalMember(owner = "client", name = "fg", descriptor = "I")
    private int field440;

    @OriginalMember(owner = "client", name = "kg", descriptor = "I")
    private int field445;

    @OriginalMember(owner = "client", name = "lg", descriptor = "I")
    private int field446;

    @OriginalMember(owner = "client", name = "mg", descriptor = "I")
    private int field447;

    @OriginalMember(owner = "client", name = "ng", descriptor = "I")
    private int field448;

    @OriginalMember(owner = "client", name = "qg", descriptor = "I")
    private int field451;

    @OriginalMember(owner = "client", name = "rg", descriptor = "I")
    private int field452;

    @OriginalMember(owner = "client", name = "ug", descriptor = "I")
    private int field455;

    @OriginalMember(owner = "client", name = "vg", descriptor = "I")
    private int field456;

    @OriginalMember(owner = "client", name = "wg", descriptor = "I")
    private int field457;

    @OriginalMember(owner = "client", name = "xg", descriptor = "I")
    private int field458;

    @OriginalMember(owner = "client", name = "yg", descriptor = "I")
    private int field459;

    @OriginalMember(owner = "client", name = "zg", descriptor = "I")
    private static int field460;

    @OriginalMember(owner = "client", name = "Ag", descriptor = "I")
    private int field461;

    @OriginalMember(owner = "client", name = "Dg", descriptor = "I")
    private int field464;

    @OriginalMember(owner = "client", name = "Eg", descriptor = "I")
    private int field465;

    @OriginalMember(owner = "client", name = "Fg", descriptor = "I")
    private int field466;

    @OriginalMember(owner = "client", name = "Gg", descriptor = "I")
    private int field467;

    @OriginalMember(owner = "client", name = "Ig", descriptor = "I")
    public static int field469;

    @OriginalMember(owner = "client", name = "Lg", descriptor = "I")
    private int field472;

    @OriginalMember(owner = "client", name = "Rg", descriptor = "I")
    private static int field478;

    @OriginalMember(owner = "client", name = "Zg", descriptor = "I")
    private int field486;

    @OriginalMember(owner = "client", name = "eh", descriptor = "I")
    private int field491;

    @OriginalMember(owner = "client", name = "ih", descriptor = "I")
    private int field495;

    @OriginalMember(owner = "client", name = "rh", descriptor = "I")
    private int field504;

    @OriginalMember(owner = "client", name = "sh", descriptor = "I")
    private int field505;

    @OriginalMember(owner = "client", name = "wh", descriptor = "I")
    private int field509;

    @OriginalMember(owner = "client", name = "Dh", descriptor = "I")
    private int field516;

    @OriginalMember(owner = "client", name = "Eh", descriptor = "I")
    private int field517;

    @OriginalMember(owner = "client", name = "Fh", descriptor = "I")
    private int field518;

    @OriginalMember(owner = "client", name = "Gh", descriptor = "I")
    private int field519;

    @OriginalMember(owner = "client", name = "Hh", descriptor = "I")
    private int field520;

    @OriginalMember(owner = "client", name = "Xh", descriptor = "I")
    private static int field536;

    @OriginalMember(owner = "client", name = "Yh", descriptor = "I")
    private static int field537;

    @OriginalMember(owner = "client", name = "ei", descriptor = "I")
    private int field543;

    @OriginalMember(owner = "client", name = "fi", descriptor = "I")
    private int field544;

    @OriginalMember(owner = "client", name = "gi", descriptor = "I")
    private int field545;

    @OriginalMember(owner = "client", name = "hi", descriptor = "I")
    private int field546;

    @OriginalMember(owner = "client", name = "pi", descriptor = "I")
    private int field554;

    @OriginalMember(owner = "client", name = "qi", descriptor = "I")
    private int field555;

    @OriginalMember(owner = "client", name = "ri", descriptor = "I")
    private int field556;

    @OriginalMember(owner = "client", name = "ui", descriptor = "I")
    private int field559;

    @OriginalMember(owner = "client", name = "xi", descriptor = "I")
    private int field562;

    @OriginalMember(owner = "client", name = "Hi", descriptor = "I")
    public static int field572;

    @OriginalMember(owner = "client", name = "Li", descriptor = "I")
    private int field576;

    @OriginalMember(owner = "client", name = "Ni", descriptor = "I")
    private int field578;

    @OriginalMember(owner = "client", name = "Ri", descriptor = "I")
    private int field582;

    @OriginalMember(owner = "client", name = "Si", descriptor = "I")
    private int field583;

    @OriginalMember(owner = "client", name = "Ui", descriptor = "I")
    private int field585;

    @OriginalMember(owner = "client", name = "Xi", descriptor = "I")
    private int field588;

    @OriginalMember(owner = "client", name = "aj", descriptor = "I")
    private static int field591;

    @OriginalMember(owner = "client", name = "bj", descriptor = "I")
    private int field592;

    @OriginalMember(owner = "client", name = "cj", descriptor = "I")
    private static int field593;

    @OriginalMember(owner = "client", name = "dj", descriptor = "I")
    private int field594;

    @OriginalMember(owner = "client", name = "jj", descriptor = "I")
    private int field600;

    @OriginalMember(owner = "client", name = "kj", descriptor = "I")
    private int field601;

    @OriginalMember(owner = "client", name = "qj", descriptor = "I")
    private int field607;

    @OriginalMember(owner = "client", name = "tj", descriptor = "I")
    private static int field610;

    @OriginalMember(owner = "client", name = "uj", descriptor = "I")
    private int field611;

    @OriginalMember(owner = "client", name = "Hj", descriptor = "I")
    private int field624;

    @OriginalMember(owner = "client", name = "Mj", descriptor = "I")
    private int field629;

    @OriginalMember(owner = "client", name = "Nj", descriptor = "I")
    private static int field630;

    @OriginalMember(owner = "client", name = "Pj", descriptor = "I")
    private int field632;

    @OriginalMember(owner = "client", name = "Qj", descriptor = "I")
    private int field633;

    @OriginalMember(owner = "client", name = "Rj", descriptor = "I")
    private int field634;

    @OriginalMember(owner = "client", name = "Yj", descriptor = "I")
    public static int field641;

    @OriginalMember(owner = "client", name = "Ub", descriptor = "J")
    private long field222;

    @OriginalMember(owner = "client", name = "Vb", descriptor = "J")
    private long field223;

    @OriginalMember(owner = "client", name = "bc", descriptor = "J")
    public long field229;

    @OriginalMember(owner = "client", name = "yf", descriptor = "J")
    private long field407;

    @OriginalMember(owner = "client", name = "mj", descriptor = "J")
    private long field603;

    @OriginalMember(owner = "client", name = "Jh", descriptor = "LBVMYRJQC;")
    private class10 field522;

    @OriginalMember(owner = "client", name = "Kh", descriptor = "LBVMYRJQC;")
    private class10 field523;

    @OriginalMember(owner = "client", name = "Lh", descriptor = "LBVMYRJQC;")
    private class10 field524;

    @OriginalMember(owner = "client", name = "Mh", descriptor = "LBVMYRJQC;")
    private class10 field525;

    @OriginalMember(owner = "client", name = "Nh", descriptor = "LBVMYRJQC;")
    private class10 field526;

    @OriginalMember(owner = "client", name = "Oh", descriptor = "LBVMYRJQC;")
    private class10 field527;

    @OriginalMember(owner = "client", name = "Ph", descriptor = "LBVMYRJQC;")
    private class10 field528;

    @OriginalMember(owner = "client", name = "Qh", descriptor = "LBVMYRJQC;")
    private class10 field529;

    @OriginalMember(owner = "client", name = "Rh", descriptor = "LBVMYRJQC;")
    private class10 field530;

    @OriginalMember(owner = "client", name = "ai", descriptor = "LBVMYRJQC;")
    private class10 field539;

    @OriginalMember(owner = "client", name = "bi", descriptor = "LBVMYRJQC;")
    private class10 field540;

    @OriginalMember(owner = "client", name = "ci", descriptor = "LBVMYRJQC;")
    private class10 field541;

    @OriginalMember(owner = "client", name = "di", descriptor = "LBVMYRJQC;")
    private class10 field542;

    @OriginalMember(owner = "client", name = "ii", descriptor = "LBVMYRJQC;")
    private class10 field547;

    @OriginalMember(owner = "client", name = "ji", descriptor = "LBVMYRJQC;")
    private class10 field548;

    @OriginalMember(owner = "client", name = "ki", descriptor = "LBVMYRJQC;")
    private class10 field549;

    @OriginalMember(owner = "client", name = "wj", descriptor = "LBVMYRJQC;")
    private class10 field613;

    @OriginalMember(owner = "client", name = "xj", descriptor = "LBVMYRJQC;")
    private class10 field614;

    @OriginalMember(owner = "client", name = "yj", descriptor = "LBVMYRJQC;")
    private class10 field615;

    @OriginalMember(owner = "client", name = "zj", descriptor = "LBVMYRJQC;")
    private class10 field616;

    @OriginalMember(owner = "client", name = "Aj", descriptor = "LBVMYRJQC;")
    private class10 field617;

    @OriginalMember(owner = "client", name = "Bj", descriptor = "LBVMYRJQC;")
    private class10 field618;

    @OriginalMember(owner = "client", name = "Cj", descriptor = "LBVMYRJQC;")
    private class10 field619;

    @OriginalMember(owner = "client", name = "Dj", descriptor = "LBVMYRJQC;")
    private class10 field620;

    @OriginalMember(owner = "client", name = "Ej", descriptor = "LBVMYRJQC;")
    private class10 field621;

    @OriginalMember(owner = "client", name = "Rd", descriptor = "LENXSCLLS;")
    private class16 field323;

    @OriginalMember(owner = "client", name = "Ad", descriptor = "LAAVSEYUK;")
    private class1 field306;

    @OriginalMember(owner = "client", name = "Tj", descriptor = "LKGPDNFPL;")
    private class34 field636;

    @OriginalMember(owner = "client", name = "Uj", descriptor = "LKGPDNFPL;")
    private class34 field637;

    @OriginalMember(owner = "client", name = "Vj", descriptor = "LKGPDNFPL;")
    private class34 field638;

    @OriginalMember(owner = "client", name = "Wj", descriptor = "LKGPDNFPL;")
    private class34 field639;

    @OriginalMember(owner = "client", name = "nc", descriptor = "LLAQKYZGL;")
    private class37 field241;

    @OriginalMember(owner = "client", name = "kd", descriptor = "LMJLXHQTQ;")
    private class44 field290;

    @OriginalMember(owner = "client", name = "cb", descriptor = "LMTFZASIN;")
    public static class48 field178;

    @OriginalMember(owner = "client", name = "Uh", descriptor = "LOQEOESGS;")
    public class52 field533;

    @OriginalMember(owner = "client", name = "Tc", descriptor = "LPDMJJHOP;")
    private class55 field273;

    @OriginalMember(owner = "client", name = "Vc", descriptor = "LPDMJJHOP;")
    private class55 field275;

    @OriginalMember(owner = "client", name = "ie", descriptor = "LPDMJJHOP;")
    private class55 field340;

    @OriginalMember(owner = "client", name = "je", descriptor = "LPDMJJHOP;")
    private class55 field341;

    @OriginalMember(owner = "client", name = "cf", descriptor = "LPDMJJHOP;")
    private class55 field386;

    @OriginalMember(owner = "client", name = "Hf", descriptor = "LPDMJJHOP;")
    private class55 field416;

    @OriginalMember(owner = "client", name = "If", descriptor = "LPDMJJHOP;")
    private class55 field417;

    @OriginalMember(owner = "client", name = "Cg", descriptor = "LPDMJJHOP;")
    private class55 field463;

    @OriginalMember(owner = "client", name = "fh", descriptor = "LPDMJJHOP;")
    private class55 field492;

    @OriginalMember(owner = "client", name = "gh", descriptor = "LPDMJJHOP;")
    private class55 field493;

    @OriginalMember(owner = "client", name = "kh", descriptor = "LPDMJJHOP;")
    private class55 field497;

    @OriginalMember(owner = "client", name = "lh", descriptor = "LPDMJJHOP;")
    private class55 field498;

    @OriginalMember(owner = "client", name = "mh", descriptor = "LPDMJJHOP;")
    private class55 field499;

    @OriginalMember(owner = "client", name = "nh", descriptor = "LPDMJJHOP;")
    private class55 field500;

    @OriginalMember(owner = "client", name = "oh", descriptor = "LPDMJJHOP;")
    private class55 field501;

    @OriginalMember(owner = "client", name = "rd", descriptor = "LVSJQVIFL;")
    private class63 field297;

    @OriginalMember(owner = "client", name = "sd", descriptor = "LVSJQVIFL;")
    private class63 field298;

    @OriginalMember(owner = "client", name = "Bd", descriptor = "LVSJQVIFL;")
    private class63 field307;

    @OriginalMember(owner = "client", name = "Cd", descriptor = "LVSJQVIFL;")
    private class63 field308;

    @OriginalMember(owner = "client", name = "Dd", descriptor = "LVSJQVIFL;")
    private class63 field309;

    @OriginalMember(owner = "client", name = "Ed", descriptor = "LVSJQVIFL;")
    private class63 field310;

    @OriginalMember(owner = "client", name = "Fd", descriptor = "LVSJQVIFL;")
    private class63 field311;

    @OriginalMember(owner = "client", name = "Id", descriptor = "LVSJQVIFL;")
    private class63 field314;

    @OriginalMember(owner = "client", name = "Jd", descriptor = "LVSJQVIFL;")
    private class63 field315;

    @OriginalMember(owner = "client", name = "Kd", descriptor = "LVSJQVIFL;")
    private class63 field316;

    @OriginalMember(owner = "client", name = "me", descriptor = "LVSJQVIFL;")
    private class63 field344;

    @OriginalMember(owner = "client", name = "ne", descriptor = "LVSJQVIFL;")
    private class63 field345;

    @OriginalMember(owner = "client", name = "oe", descriptor = "LVSJQVIFL;")
    private class63 field346;

    @OriginalMember(owner = "client", name = "pe", descriptor = "LVSJQVIFL;")
    private class63 field347;

    @OriginalMember(owner = "client", name = "qe", descriptor = "LVSJQVIFL;")
    private class63 field348;

    @OriginalMember(owner = "client", name = "Df", descriptor = "LVSJQVIFL;")
    private class63 field412;

    @OriginalMember(owner = "client", name = "Ef", descriptor = "LVSJQVIFL;")
    private class63 field413;

    @OriginalMember(owner = "client", name = "Ff", descriptor = "LVSJQVIFL;")
    private class63 field414;

    @OriginalMember(owner = "client", name = "mi", descriptor = "LVSJQVIFL;")
    private class63 field551;

    @OriginalMember(owner = "client", name = "ni", descriptor = "LVSJQVIFL;")
    private class63 field552;

    @OriginalMember(owner = "client", name = "gg", descriptor = "LYDQEOBYY;")
    private class70 field441;

    @OriginalMember(owner = "client", name = "jc", descriptor = "Ljava/lang/String;")
    public String field237;

    @OriginalMember(owner = "client", name = "Bc", descriptor = "Ljava/lang/String;")
    public String field255;

    @OriginalMember(owner = "client", name = "Yd", descriptor = "Ljava/lang/String;")
    private String field330;

    @OriginalMember(owner = "client", name = "Se", descriptor = "Ljava/lang/String;")
    private String field376;

    @OriginalMember(owner = "client", name = "V", descriptor = "Ljava/net/Socket;")
    private Socket field171;

    @OriginalMember(owner = "client", name = "gd", descriptor = "Z")
    private static boolean field286;

    @OriginalMember(owner = "client", name = "yd", descriptor = "Z")
    private static boolean field304;

    @OriginalMember(owner = "client", name = "ue", descriptor = "Z")
    public static boolean field352;

    @OriginalMember(owner = "client", name = "Kg", descriptor = "Z")
    private static boolean field471;

    @OriginalMember(owner = "client", name = "Ah", descriptor = "Z")
    public static boolean field513;

    @OriginalMember(owner = "client", name = "oc", descriptor = "[I")
    private int[] field242;

    @OriginalMember(owner = "client", name = "pc", descriptor = "[I")
    private int[] field243;

    @OriginalMember(owner = "client", name = "Kc", descriptor = "[I")
    private int[] field264;

    @OriginalMember(owner = "client", name = "Lc", descriptor = "[I")
    private int[] field265;

    @OriginalMember(owner = "client", name = "Mc", descriptor = "[I")
    private int[] field266;

    @OriginalMember(owner = "client", name = "Nc", descriptor = "[I")
    private int[] field267;

    @OriginalMember(owner = "client", name = "df", descriptor = "[I")
    private int[] field387;

    @OriginalMember(owner = "client", name = "ef", descriptor = "[I")
    private int[] field388;

    @OriginalMember(owner = "client", name = "ff", descriptor = "[I")
    private int[] field389;

    @OriginalMember(owner = "client", name = "Tf", descriptor = "[I")
    private int[] field428;

    @OriginalMember(owner = "client", name = "Uf", descriptor = "[I")
    private int[] field429;

    @OriginalMember(owner = "client", name = "Vf", descriptor = "[I")
    private int[] field430;

    @OriginalMember(owner = "client", name = "Wf", descriptor = "[I")
    private int[] field431;

    @OriginalMember(owner = "client", name = "Pg", descriptor = "[I")
    private int[] field476;

    @OriginalMember(owner = "client", name = "Qg", descriptor = "[I")
    private int[] field477;

    @OriginalMember(owner = "client", name = "xh", descriptor = "[LVSJQVIFL;")
    private class63[] field510;

    @OriginalMember(owner = "client", name = "Qc", descriptor = "[[B")
    private byte[][] field270;

    @OriginalMember(owner = "client", name = "Ze", descriptor = "[[B")
    private byte[][] field383;

    @OriginalMember(owner = "client", name = "Qb", descriptor = "[[[B")
    private byte[][][] field218;

    @OriginalMember(owner = "client", name = "U", descriptor = "[[[I")
    private int[][][] field170;

    @OriginalMember(owner = "client", name = "b", descriptor = "(II)V")
    public final void method43(int arg0, int arg1) {
        if (arg1 != 0) {
            field176 = -444;
        }
        class65.method398(arg0, 0);
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(Z)V")
    public final void method44(boolean arg0) {
        if (this.field542 == null) {
            this.method188(-601);
            super.field762 = null;
            this.field613 = null;
            this.field614 = null;
            this.field615 = null;
            this.field616 = null;
            this.field617 = null;
            if (arg0) {
                this.field424 = -1;
            }
            this.field618 = null;
            this.field619 = null;
            this.field620 = null;
            this.field621 = null;
            this.field542 = new class10(96, this.method107(4), false, 479);
            this.field540 = new class10(156, this.method107(4), false, 172);
            class24.method243((byte) -107);
            this.field413.method374(0, false, 0);
            this.field539 = new class10(261, this.method107(4), false, 190);
            this.field541 = new class10(334, this.method107(4), false, 512);
            class24.method243((byte) -107);
            this.field547 = new class10(50, this.method107(4), false, 496);
            this.field548 = new class10(37, this.method107(4), false, 269);
            this.field549 = new class10(45, this.method107(4), false, 249);
            this.field369 = true;
            this.field541.method34(2);
            class64.field1378 = this.field430;
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(B)V")
    public final void method45(byte arg0) {
        for (int var2 = -1; var2 < this.field576; ++var2) {
            int var6;
            if (var2 == -1) {
                var6 = this.field574;
            } else {
                var6 = this.field577[var2];
            }
            class48 var7 = this.field575[var6];
            if (var7 != null && var7.field685 > 0) {
                --var7.field685;
                if (var7.field685 == 0) {
                    var7.field684 = null;
                }
            }
        }
        if (arg0 != 3) {
            this.field190 = !this.field190;
        }
        for (int var3 = 0; var3 < this.field194; ++var3) {
            int var4 = this.field195[var3];
            class13 var5 = this.field193[var4];
            if (var5 != null && var5.field685 > 0) {
                --var5.field685;
                if (var5.field685 == 0) {
                    var5.field684 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(I)V")
    public static final void method46(int arg0) {
        class70.field1673 = true;
        if (arg0 != -34690) {
            for (int var1 = 1; var1 > 0; ++var1) {
            }
        }
        class64.field1367 = true;
        field471 = true;
        class67.field1577 = true;
        class8.field106 = true;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
    public final void method47(Runnable arg0, int arg1) {
        if (arg1 > 10) {
            arg1 = 10;
        }
        if (signlink.mainapp != null) {
            signlink.startthread(arg0, arg1);
        } else {
            super.method47(arg0, arg1);
        }
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(I)V")
    public final void method48(int arg0) {
        this.field423 += arg0;
        class8.field122.method195();
        class8.field107.method195();
        class33.field1007.method195();
        class22.field836.method195();
        class22.field845.method195();
        class48.field1237.method195();
        class6.field73.method195();
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(I)V")
    public static final void method49(int arg0) {
        class70.field1673 = false;
        class64.field1367 = false;
        if (arg0 < 0) {
            field471 = false;
            class67.field1577 = false;
            class8.field106 = false;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IJ)V")
    public final void method50(int arg0, long arg1) {
        if (arg1 != 0L) {
            if (this.field183 >= 100 && this.field495 != 1) {
                this.method133(1, 0, "", "Your friendlist is full. Max of 100 for free users, and 200 for members");
            } else if (this.field183 >= 200) {
                this.method133(1, 0, "", "Your friendlist is full. Max of 100 for free users, and 200 for members");
            } else {
                String var4 = class11.method41(class11.method38(this.field487, arg1), 42484);
                for (int var5 = 0; var5 < this.field183; ++var5) {
                    if (this.field230[var5] == arg1) {
                        this.method133(1, 0, "", var4 + " is already on your friend list");
                        return;
                    }
                }
                for (int var6 = 0; var6 < this.field249; ++var6) {
                    if (this.field261[var6] == arg1) {
                        this.method133(1, 0, "", "Please remove " + var4 + " from your ignore list first");
                        return;
                    }
                }
                if (!var4.equals(field178.field1239)) {
                    this.field521[this.field183] = var4;
                    this.field230[this.field183] = arg1;
                    if (arg0 != 0) {
                        this.field558 = !this.field558;
                    }
                    this.field278[this.field183] = 0;
                    ++this.field183;
                    this.field515 = true;
                    this.field415.method454(4, 229);
                    this.field415.method461(this.field511, arg1);
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
                if (super.field764 != null) {
                    return new URL("http://127.0.0.1:" + (field469 + 80));
                }
            } catch (Exception var1) {
            }
            return super.getCodeBase();
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILXGRGMPUQ;I)V")
    private final void method51(int arg0, class69 arg1, int arg2) {
        for (int var4 = 0; var4 < this.field578; ++var4) {
            int var5 = this.field579[var4];
            class48 var6 = this.field575[var5];
            int var7 = arg1.method465();
            if ((var7 & 64) != 0) {
                var7 += arg1.method465() << 8;
            }
            this.method148(var6, 0, var7, var5, arg1);
        }
        if (arg2 == -24634) {
            ;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZLVYAVYWNE;)Z")
    public final boolean method52(boolean arg0, class65 arg1) {
        if (!arg0) {
            throw new NullPointerException();
        } else {
            int var3 = arg1.field1454;
            if ((var3 < 1 || var3 > 200) && (var3 < 701 || var3 > 900)) {
                if (var3 >= 401 && var3 <= 500) {
                    this.field581[this.field250] = "Remove @whi@" + arg1.field1413;
                    this.field627[this.field250] = 663;
                    ++this.field250;
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
                this.field581[this.field250] = "Remove @whi@" + this.field521[var3];
                this.field627[this.field250] = 633;
                ++this.field250;
                this.field581[this.field250] = "Message @whi@" + this.field521[var3];
                this.field627[this.field250] = 144;
                ++this.field250;
                return true;
            }
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(I)V")
    public final void method53(int arg0) {
        signlink.reporterror = false;
        try {
            if (this.field306 != null) {
                this.field306.method1();
            }
        } catch (Exception var2) {
        }
        this.field306 = null;
        this.method134((byte) -30);
        if (this.field533 != null) {
            this.field533.field1284 = false;
        }
        this.field533 = null;
        this.field241.method295();
        this.field241 = null;
        this.field192 = null;
        this.field415 = null;
        this.field488 = null;
        this.field232 = null;
        this.field387 = null;
        this.field270 = null;
        this.field383 = null;
        this.field388 = null;
        this.field389 = null;
        this.field170 = null;
        this.field218 = null;
        this.field441 = null;
        this.field361 = null;
        this.field355 = null;
        this.field357 = null;
        this.field483 = null;
        this.field484 = null;
        this.field294 = null;
        this.field539 = null;
        this.field540 = null;
        this.field541 = null;
        this.field542 = null;
        this.field547 = null;
        this.field548 = null;
        this.field549 = null;
        this.field522 = null;
        this.field523 = null;
        this.field524 = null;
        this.field525 = null;
        this.field526 = null;
        this.field527 = null;
        this.field528 = null;
        this.field529 = null;
        this.field530 = null;
        this.field412 = null;
        this.field413 = null;
        this.field414 = null;
        this.field314 = null;
        this.field315 = null;
        this.field316 = null;
        this.field350 = null;
        this.field307 = null;
        this.field308 = null;
        this.field309 = null;
        this.field310 = null;
        this.field311 = null;
        this.field344 = null;
        this.field345 = null;
        this.field346 = null;
        this.field347 = null;
        this.field348 = null;
        this.field463 = null;
        this.field384 = null;
        this.field296 = null;
        this.field331 = null;
        this.field473 = null;
        this.field598 = null;
        this.field386 = null;
        this.field497 = null;
        this.field498 = null;
        this.field499 = null;
        this.field500 = null;
        this.field501 = null;
        this.field586 = null;
        this.field474 = null;
        this.field400 = null;
        this.field575 = null;
        this.field577 = null;
        this.field579 = null;
        this.field580 = null;
        this.field557 = null;
        this.field193 = null;
        this.field195 = null;
        this.field359 = null;
        this.field584 = null;
        this.field462 = null;
        this.field305 = null;
        this.field625 = null;
        this.field626 = null;
        this.field627 = null;
        this.field628 = null;
        this.field581 = null;
        this.field320 = null;
        this.field435 = null;
        this.field436 = null;
        this.field485 = null;
        this.field273 = null;
        this.field521 = null;
        this.field230 = null;
        this.field278 = null;
        this.field616 = null;
        this.field617 = null;
        this.field613 = null;
        this.field614 = null;
        this.field615 = null;
        this.field618 = null;
        this.field619 = null;
        this.field620 = null;
        this.field621 = null;
        this.method188(-601);
        class8.method31((byte) -117);
        class33.method269((byte) -117);
        class22.method230((byte) -117);
        class65.method396((byte) -117);
        class50.field1267 = null;
        class7.field79 = null;
        class4.field32 = null;
        class45.field1187 = null;
        class6.field61 = null;
        class6.field73 = null;
        class36.field1041 = null;
        super.field762 = null;
        class48.field1237 = null;
        class64.method376((byte) -117);
        while (arg0 >= 0) {
            this.field415.method455(152);
        }
        class70.method501((byte) -117);
        class66.method403((byte) -117);
        class2.method9((byte) -117);
        System.gc();
        if (class54.field1301) {
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(Z)V")
    public final void method54(boolean arg0) {
        if (arg0) {
            this.field424 = this.field232.method465();
        }
        if (super.field762 == null) {
            this.method188(-601);
            this.field613 = null;
            this.field614 = null;
            this.field615 = null;
            this.field616 = null;
            this.field617 = null;
            this.field618 = null;
            this.field619 = null;
            this.field620 = null;
            this.field621 = null;
            this.field542 = null;
            this.field540 = null;
            this.field539 = null;
            this.field541 = null;
            this.field547 = null;
            this.field548 = null;
            this.field549 = null;
            super.field762 = new class10(503, this.method107(4), false, 765);
            this.field369 = true;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIII)V")
    public final void method55(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        while (arg3 >= 0) {
            this.field415.method455(159);
        }
        int var7 = this.field441.method528(arg2, arg0, arg1);
        if (var7 != 0) {
            int var8 = this.field441.method532(arg2, arg0, arg1, var7);
            int var9 = var8 >> 6 & 3;
            int var10 = var8 & 31;
            int var11 = arg5;
            if (var7 > 0) {
                var11 = arg4;
            }
            int[] var12 = this.field273.field1307;
            int var13 = (103 - arg1) * 512 * 4 + arg0 * 4 + 24624;
            int var14 = var7 >> 14 & 32767;
            class8 var15 = class8.method30(var14);
            if (var15.field103 != -1) {
                class63 var16 = this.field586[var15.field103];
                if (var16 != null) {
                    int var17 = (var15.field97 * 4 - var16.field1357) / 2;
                    int var18 = (var15.field118 * 4 - var16.field1358) / 2;
                    var16.method374((104 - arg1 - var15.field118) * 4 + 48 + var18, false, arg0 * 4 + 48 + var17);
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
        int var19 = this.field441.method530(arg2, arg0, arg1);
        if (var19 != 0) {
            int var20 = this.field441.method532(arg2, arg0, arg1, var19);
            int var21 = var20 >> 6 & 3;
            int var22 = var20 & 31;
            int var23 = var19 >> 14 & 32767;
            class8 var24 = class8.method30(var23);
            if (var24.field103 != -1) {
                class63 var25 = this.field586[var24.field103];
                if (var25 != null) {
                    int var26 = (var24.field97 * 4 - var25.field1357) / 2;
                    int var27 = (var24.field118 * 4 - var25.field1358) / 2;
                    var25.method374((104 - arg1 - var24.field118) * 4 + 48 + var27, false, arg0 * 4 + 48 + var26);
                }
            } else if (var22 == 9) {
                int var28 = 15658734;
                if (var19 > 0) {
                    var28 = 15597568;
                }
                int[] var29 = this.field273.field1307;
                int var30 = (103 - arg1) * 512 * 4 + arg0 * 4 + 24624;
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
        int var31 = this.field441.method531(arg2, arg0, arg1);
        if (var31 != 0) {
            int var32 = var31 >> 14 & 32767;
            class8 var33 = class8.method30(var32);
            if (var33.field103 != -1) {
                class63 var34 = this.field586[var33.field103];
                if (var34 != null) {
                    int var35 = (var33.field97 * 4 - var34.field1357) / 2;
                    int var36 = (var33.field118 * 4 - var34.field1358) / 2;
                    var34.method374((104 - arg1 - var33.field118) * 4 + 48 + var36, false, arg0 * 4 + 48 + var35);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZZ)V")
    public final void method56(boolean arg0, boolean arg1) {
        if (arg1) {
            this.field190 = !this.field190;
        }
        for (int var3 = 0; var3 < this.field194; ++var3) {
            class13 var4 = this.field193[this.field195[var3]];
            int var5 = (this.field195[var3] << 14) + 536870912;
            if (var4 != null && var4.method192(-22030) && var4.field671.field983 == arg0 && var4.field671.method268(2)) {
                int var6 = var4.field731 >> 7;
                int var7 = var4.field732 >> 7;
                if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
                    if (var4.field694 == 1 && (var4.field731 & 127) == 64 && (var4.field732 & 127) == 64) {
                        if (this.field400[var6][var7] == this.field559) {
                            continue;
                        }
                        this.field400[var6][var7] = this.field559;
                    }
                    if (!var4.field671.field1000) {
                        var5 += Integer.MIN_VALUE;
                    }
                    this.field441.method513(this.field300, var4.field731, this.method95(var4.field731, var4.field732, this.field405, -738), (var4.field694 - 1) * 64 + 60, var5, var4.field732, this.field405, var4, var4.field733, var4.field710);
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "h", descriptor = "(I)V")
    public final void method57(int arg0) {
        ++field478;
        if (field478 > 92) {
            field478 = 0;
            this.field415.method454(4, 15);
        }
        for (int var2 = 0; var2 < this.field194; ++var2) {
            int var3 = this.field195[var2];
            class13 var4 = this.field193[var3];
            if (var4 != null) {
                this.method58(var4, 676, var4.field671.field975);
            }
        }
        this.field423 += arg0;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LDSYLCNKR;II)V")
    public final void method58(class15 arg0, int arg1, int arg2) {
        if (arg0.field731 < 128 || arg0.field732 < 128 || arg0.field731 >= 13184 || arg0.field732 >= 13184) {
            arg0.field686 = -1;
            arg0.field717 = -1;
            arg0.field707 = 0;
            arg0.field708 = 0;
            arg0.field731 = arg0.field711[0] * 128 + arg0.field694 * 64;
            arg0.field732 = arg0.field712[0] * 128 + arg0.field694 * 64;
            arg0.method196(false);
        }
        if (field178 == arg0 && (arg0.field731 < 1536 || arg0.field732 < 1536 || arg0.field731 >= 11776 || arg0.field732 >= 11776)) {
            arg0.field686 = -1;
            arg0.field717 = -1;
            arg0.field707 = 0;
            arg0.field708 = 0;
            arg0.field731 = arg0.field711[0] * 128 + arg0.field694 * 64;
            arg0.field732 = arg0.field712[0] * 128 + arg0.field694 * 64;
            arg0.method196(false);
        }
        if (arg0.field707 > field572) {
            this.method59((byte) 4, arg0);
        } else if (arg0.field708 >= field572) {
            this.method60(37678, arg0);
        } else {
            this.method61(arg0, (byte) 101);
        }
        this.method62(arg0, -37625);
        if (arg1 > 0) {
            this.method63((byte) 5, arg0);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BLDSYLCNKR;)V")
    public final void method59(byte arg0, class15 arg1) {
        int var3 = arg1.field707 - field572;
        int var4 = arg1.field703 * 128 + arg1.field694 * 64;
        int var5 = arg1.field705 * 128 + arg1.field694 * 64;
        arg1.field731 += (var4 - arg1.field731) / var3;
        if (arg0 == 4) {
            boolean var6 = false;
            arg1.field732 += (var5 - arg1.field732) / var3;
            arg1.field726 = 0;
            if (arg1.field709 == 0) {
                arg1.field716 = 1024;
            }
            if (arg1.field709 == 1) {
                arg1.field716 = 1536;
            }
            if (arg1.field709 == 2) {
                arg1.field716 = 0;
            }
            if (arg1.field709 == 3) {
                arg1.field716 = 512;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILDSYLCNKR;)V")
    public final void method60(int arg0, class15 arg1) {
        if (field572 == arg1.field708 || arg1.field686 == -1 || arg1.field689 != 0 || arg1.field688 + 1 > class45.field1187[arg1.field686].method319(arg1.field687, this.field453)) {
            int var3 = arg1.field708 - arg1.field707;
            int var4 = field572 - arg1.field707;
            int var5 = arg1.field703 * 128 + arg1.field694 * 64;
            int var6 = arg1.field705 * 128 + arg1.field694 * 64;
            int var7 = arg1.field704 * 128 + arg1.field694 * 64;
            int var8 = arg1.field706 * 128 + arg1.field694 * 64;
            arg1.field731 = ((var3 - var4) * var5 + var4 * var7) / var3;
            arg1.field732 = ((var3 - var4) * var6 + var4 * var8) / var3;
        }
        arg1.field726 = 0;
        if (arg1.field709 == 0) {
            arg1.field716 = 1024;
        }
        if (arg1.field709 == 1) {
            arg1.field716 = 1536;
        }
        if (arg1.field709 == 2) {
            arg1.field716 = 0;
        }
        if (arg1.field709 == 3) {
            arg1.field716 = 512;
        }
        arg1.field733 = arg1.field716;
        if (arg0 != 37678) {
            for (int var9 = 1; var9 > 0; ++var9) {
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LDSYLCNKR;B)V")
    public final void method61(class15 arg0, byte arg1) {
        arg0.field723 = arg0.field736;
        if (arg0.field728 == 0) {
            arg0.field726 = 0;
        } else {
            if (arg0.field686 != -1 && arg0.field689 == 0) {
                class45 var3 = class45.field1187[arg0.field686];
                if (arg0.field714 > 0 && var3.field1199 == 0) {
                    ++arg0.field726;
                    return;
                }
                if (arg0.field714 <= 0 && var3.field1200 == 0) {
                    ++arg0.field726;
                    return;
                }
            }
            int var4 = arg0.field731;
            int var5 = arg0.field732;
            if (arg1 != 101) {
                this.field415.method455(15);
            }
            int var6 = arg0.field711[arg0.field728 - 1] * 128 + arg0.field694 * 64;
            int var7 = arg0.field712[arg0.field728 - 1] * 128 + arg0.field694 * 64;
            if (var6 - var4 <= 256 && var6 - var4 >= -256 && var7 - var5 <= 256 && var7 - var5 >= -256) {
                if (var4 < var6) {
                    if (var5 < var7) {
                        arg0.field716 = 1280;
                    } else if (var5 > var7) {
                        arg0.field716 = 1792;
                    } else {
                        arg0.field716 = 1536;
                    }
                } else if (var4 > var6) {
                    if (var5 < var7) {
                        arg0.field716 = 768;
                    } else if (var5 > var7) {
                        arg0.field716 = 256;
                    } else {
                        arg0.field716 = 512;
                    }
                } else if (var5 < var7) {
                    arg0.field716 = 1024;
                } else {
                    arg0.field716 = 0;
                }
                int var8 = arg0.field716 - arg0.field733 & 2047;
                if (var8 > 1024) {
                    var8 -= 2048;
                }
                int var9 = arg0.field700;
                if (var8 >= -256 && var8 <= 256) {
                    var9 = arg0.field699;
                } else if (var8 >= 256 && var8 < 768) {
                    var9 = arg0.field702;
                } else if (var8 >= -768 && var8 <= -256) {
                    var9 = arg0.field701;
                }
                if (var9 == -1) {
                    var9 = arg0.field699;
                }
                arg0.field723 = var9;
                int var10 = 4;
                if (arg0.field733 != arg0.field716 && arg0.field713 == -1 && arg0.field727 != 0) {
                    var10 = 2;
                }
                if (arg0.field728 > 2) {
                    var10 = 6;
                }
                if (arg0.field728 > 3) {
                    var10 = 8;
                }
                if (arg0.field726 > 0 && arg0.field728 > 1) {
                    var10 = 8;
                    --arg0.field726;
                }
                if (arg0.field683[arg0.field728 - 1]) {
                    var10 <<= 1;
                }
                if (var10 >= 8 && arg0.field723 == arg0.field699 && arg0.field735 != -1) {
                    arg0.field723 = arg0.field735;
                }
                if (var4 < var6) {
                    arg0.field731 += var10;
                    if (arg0.field731 > var6) {
                        arg0.field731 = var6;
                    }
                } else if (var4 > var6) {
                    arg0.field731 -= var10;
                    if (arg0.field731 < var6) {
                        arg0.field731 = var6;
                    }
                }
                if (var5 < var7) {
                    arg0.field732 += var10;
                    if (arg0.field732 > var7) {
                        arg0.field732 = var7;
                    }
                } else if (var5 > var7) {
                    arg0.field732 -= var10;
                    if (arg0.field732 < var7) {
                        arg0.field732 = var7;
                    }
                }
                if (arg0.field731 == var6 && arg0.field732 == var7) {
                    --arg0.field728;
                    if (arg0.field714 > 0) {
                        --arg0.field714;
                        return;
                    }
                }
            } else {
                arg0.field731 = var6;
                arg0.field732 = var7;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LDSYLCNKR;I)V")
    public final void method62(class15 arg0, int arg1) {
        if (arg1 != -37625) {
            this.field415.method455(133);
        }
        if (arg0.field727 != 0) {
            if (arg0.field713 != -1 && arg0.field713 < 32768) {
                class13 var3 = this.field193[arg0.field713];
                if (var3 != null) {
                    int var4 = arg0.field731 - var3.field731;
                    int var5 = arg0.field732 - var3.field732;
                    if (var4 != 0 || var5 != 0) {
                        arg0.field716 = (int) (Math.atan2((double) var4, (double) var5) * 325.949D) & 2047;
                    }
                }
            }
            if (arg0.field713 >= 32768) {
                int var6 = arg0.field713 - 32768;
                if (this.field284 == var6) {
                    var6 = this.field574;
                }
                class48 var7 = this.field575[var6];
                if (var7 != null) {
                    int var8 = arg0.field731 - var7.field731;
                    int var9 = arg0.field732 - var7.field732;
                    if (var8 != 0 || var9 != 0) {
                        arg0.field716 = (int) (Math.atan2((double) var8, (double) var9) * 325.949D) & 2047;
                    }
                }
            }
            if ((arg0.field729 != 0 || arg0.field730 != 0) && (arg0.field728 == 0 || arg0.field726 > 0)) {
                int var10 = arg0.field731 - (arg0.field729 - this.field464 - this.field464) * 64;
                int var11 = arg0.field732 - (arg0.field730 - this.field465 - this.field465) * 64;
                if (var10 != 0 || var11 != 0) {
                    arg0.field716 = (int) (Math.atan2((double) var10, (double) var11) * 325.949D) & 2047;
                }
                arg0.field729 = 0;
                arg0.field730 = 0;
            }
            int var12 = arg0.field716 - arg0.field733 & 2047;
            if (var12 != 0) {
                if (var12 >= arg0.field727 && var12 <= 2048 - arg0.field727) {
                    if (var12 > 1024) {
                        arg0.field733 -= arg0.field727;
                    } else {
                        arg0.field733 += arg0.field727;
                    }
                } else {
                    arg0.field733 = arg0.field716;
                }
                arg0.field733 &= 2047;
                if (arg0.field736 == arg0.field723 && arg0.field733 != arg0.field716) {
                    if (arg0.field737 != -1) {
                        arg0.field723 = arg0.field737;
                        return;
                    }
                    arg0.field723 = arg0.field699;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(BLDSYLCNKR;)V")
    public final void method63(byte arg0, class15 arg1) {
        if (arg0 != 5) {
            field507 = !field507;
        }
        arg1.field710 = false;
        if (arg1.field723 != -1) {
            class45 var3 = class45.field1187[arg1.field723];
            ++arg1.field725;
            if (arg1.field724 < var3.field1188 && arg1.field725 > var3.method319(arg1.field724, this.field453)) {
                arg1.field725 = 0;
                ++arg1.field724;
            }
            if (arg1.field724 >= var3.field1188) {
                arg1.field725 = 0;
                arg1.field724 = 0;
            }
        }
        if (arg1.field717 != -1 && field572 >= arg1.field720) {
            if (arg1.field718 < 0) {
                arg1.field718 = 0;
            }
            class45 var4 = class6.field61[arg1.field717].field65;
            ++arg1.field719;
            while (arg1.field718 < var4.field1188 && arg1.field719 > var4.method319(arg1.field718, this.field453)) {
                arg1.field719 -= var4.method319(arg1.field718, this.field453);
                ++arg1.field718;
            }
            if (arg1.field718 >= var4.field1188 && (arg1.field718 < 0 || arg1.field718 >= var4.field1188)) {
                arg1.field717 = -1;
            }
        }
        if (arg1.field686 != -1 && arg1.field689 <= 1) {
            class45 var5 = class45.field1187[arg1.field686];
            if (var5.field1199 == 1 && arg1.field714 > 0 && arg1.field707 <= field572 && arg1.field708 < field572) {
                arg1.field689 = 1;
                return;
            }
        }
        if (arg1.field686 != -1 && arg1.field689 == 0) {
            class45 var6 = class45.field1187[arg1.field686];
            ++arg1.field688;
            while (arg1.field687 < var6.field1188 && arg1.field688 > var6.method319(arg1.field687, this.field453)) {
                arg1.field688 -= var6.method319(arg1.field687, this.field453);
                ++arg1.field687;
            }
            if (arg1.field687 >= var6.field1188) {
                arg1.field687 -= var6.field1192;
                ++arg1.field690;
                if (arg1.field690 >= var6.field1198) {
                    arg1.field686 = -1;
                }
                if (arg1.field687 < 0 || arg1.field687 >= var6.field1188) {
                    arg1.field686 = -1;
                }
            }
            arg1.field710 = var6.field1194;
        }
        if (arg1.field689 > 0) {
            --arg1.field689;
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(B)V")
    public final void method64(byte arg0) {
        if (arg0 != -49) {
            field507 = !field507;
        }
        if (this.field356 != -1 && (this.field594 == 2 || super.field762 != null)) {
            if (this.field594 == 2) {
                this.method162(this.field356, this.field452, 0);
                if (this.field247 != -1) {
                    this.method162(this.field247, this.field452, 0);
                }
                this.field452 = 0;
                this.method54(false);
                super.field762.method34(2);
                class64.field1378 = this.field431;
                class24.method243((byte) -107);
                this.field369 = true;
                class65 var2 = class65.method395(this.field356);
                if (var2.field1408 == 512 && var2.field1416 == 334 && var2.field1462 == 0) {
                    var2.field1408 = 765;
                    var2.field1416 = 503;
                }
                this.method83(0, 6, 0, var2, 0);
                if (this.field247 != -1) {
                    class65 var3 = class65.method395(this.field247);
                    if (var3.field1408 == 512 && var3.field1416 == 334 && var3.field1462 == 0) {
                        var3.field1408 = 765;
                        var3.field1416 = 503;
                    }
                    this.method83(0, 6, 0, var3, 0);
                }
                if (!this.field291) {
                    this.method132(true);
                    this.method157(-32751);
                } else {
                    this.method149((byte) 51);
                }
            }
            super.field762.method35(super.field761, 0, 0, this.field508);
        } else {
            if (this.field369) {
                this.method44(false);
                this.field369 = false;
                this.field522.method35(super.field761, 0, 4, this.field508);
                this.field523.method35(super.field761, 0, 357, this.field508);
                this.field524.method35(super.field761, 722, 4, this.field508);
                this.field525.method35(super.field761, 743, 205, this.field508);
                this.field526.method35(super.field761, 0, 0, this.field508);
                this.field527.method35(super.field761, 516, 4, this.field508);
                this.field528.method35(super.field761, 516, 205, this.field508);
                this.field529.method35(super.field761, 496, 357, this.field508);
                this.field530.method35(super.field761, 0, 338, this.field508);
                this.field515 = true;
                this.field338 = true;
                this.field289 = true;
                this.field454 = true;
                if (this.field594 != 2) {
                    this.field541.method35(super.field761, 4, 4, this.field508);
                    this.field540.method35(super.field761, 550, 4, this.field508);
                }
            }
            if (this.field594 == 2) {
                this.method141(false);
            }
            if (this.field291 && this.field200 == 1) {
                this.field515 = true;
            }
            if (this.field409 != -1) {
                boolean var4 = this.method162(this.field409, this.field452, 0);
                if (var4) {
                    this.field515 = true;
                }
            }
            if (this.field422 == 2) {
                this.field515 = true;
            }
            if (this.field162 == 2) {
                this.field515 = true;
            }
            if (this.field515) {
                this.method154(0);
                this.field515 = false;
            }
            if (this.field475 == -1) {
                this.field217.field1463 = this.field560 - this.field582 - 77;
                if (super.field769 > 448 && super.field769 < 560 && super.field770 > 332) {
                    this.method118(super.field770 - 357, super.field769 - 17, this.field560, 0, 77, 463, false, this.field217, -1);
                }
                int var5 = this.field560 - 77 - this.field217.field1463;
                if (var5 < 0) {
                    var5 = 0;
                }
                if (var5 > this.field560 - 77) {
                    var5 = this.field560 - 77;
                }
                if (this.field582 != var5) {
                    this.field582 = var5;
                    this.field338 = true;
                }
            }
            if (this.field475 != -1) {
                boolean var6 = this.method162(this.field475, this.field452, 0);
                if (var6) {
                    this.field338 = true;
                }
            }
            if (this.field422 == 3) {
                this.field338 = true;
            }
            if (this.field162 == 3) {
                this.field338 = true;
            }
            if (this.field376 != null) {
                this.field338 = true;
            }
            if (this.field291 && this.field200 == 2) {
                this.field338 = true;
            }
            if (this.field338) {
                this.method105(-91);
                this.field338 = false;
            }
            if (this.field594 == 2) {
                this.method67(this.field197);
                this.field540.method35(super.field761, 550, 4, this.field508);
            }
            if (this.field605 != -1) {
                this.field289 = true;
            }
            if (this.field289) {
                if (this.field605 != -1 && this.field605 == this.field443) {
                    this.field605 = -1;
                    this.field415.method454(4, 113);
                    this.field415.method455(this.field443);
                }
                this.field289 = false;
                this.field549.method34(2);
                this.field316.method374(0, false, 0);
                if (this.field409 == -1) {
                    if (this.field531[this.field443] != -1) {
                        if (this.field443 == 0) {
                            this.field307.method374(10, false, 22);
                        }
                        if (this.field443 == 1) {
                            this.field308.method374(8, false, 54);
                        }
                        if (this.field443 == 2) {
                            this.field308.method374(8, false, 82);
                        }
                        if (this.field443 == 3) {
                            this.field309.method374(8, false, 110);
                        }
                        if (this.field443 == 4) {
                            this.field311.method374(8, false, 153);
                        }
                        if (this.field443 == 5) {
                            this.field311.method374(8, false, 181);
                        }
                        if (this.field443 == 6) {
                            this.field310.method374(9, false, 209);
                        }
                    }
                    if (this.field531[0] != -1 && (this.field605 != 0 || field572 % 20 < 10)) {
                        this.field350[0].method374(13, false, 29);
                    }
                    if (this.field531[1] != -1 && (this.field605 != 1 || field572 % 20 < 10)) {
                        this.field350[1].method374(11, false, 53);
                    }
                    if (this.field531[2] != -1 && (this.field605 != 2 || field572 % 20 < 10)) {
                        this.field350[2].method374(11, false, 82);
                    }
                    if (this.field531[3] != -1 && (this.field605 != 3 || field572 % 20 < 10)) {
                        this.field350[3].method374(12, false, 115);
                    }
                    if (this.field531[4] != -1 && (this.field605 != 4 || field572 % 20 < 10)) {
                        this.field350[4].method374(13, false, 153);
                    }
                    if (this.field531[5] != -1 && (this.field605 != 5 || field572 % 20 < 10)) {
                        this.field350[5].method374(11, false, 180);
                    }
                    if (this.field531[6] != -1 && (this.field605 != 6 || field572 % 20 < 10)) {
                        this.field350[6].method374(13, false, 208);
                    }
                }
                this.field549.method35(super.field761, 516, 160, this.field508);
                this.field548.method34(2);
                this.field315.method374(0, false, 0);
                if (this.field409 == -1) {
                    if (this.field531[this.field443] != -1) {
                        if (this.field443 == 7) {
                            this.field344.method374(0, false, 42);
                        }
                        if (this.field443 == 8) {
                            this.field345.method374(0, false, 74);
                        }
                        if (this.field443 == 9) {
                            this.field345.method374(0, false, 102);
                        }
                        if (this.field443 == 10) {
                            this.field346.method374(1, false, 130);
                        }
                        if (this.field443 == 11) {
                            this.field348.method374(0, false, 173);
                        }
                        if (this.field443 == 12) {
                            this.field348.method374(0, false, 201);
                        }
                        if (this.field443 == 13) {
                            this.field347.method374(0, false, 229);
                        }
                    }
                    if (this.field531[8] != -1 && (this.field605 != 8 || field572 % 20 < 10)) {
                        this.field350[7].method374(2, false, 74);
                    }
                    if (this.field531[9] != -1 && (this.field605 != 9 || field572 % 20 < 10)) {
                        this.field350[8].method374(3, false, 102);
                    }
                    if (this.field531[10] != -1 && (this.field605 != 10 || field572 % 20 < 10)) {
                        this.field350[9].method374(4, false, 137);
                    }
                    if (this.field531[11] != -1 && (this.field605 != 11 || field572 % 20 < 10)) {
                        this.field350[10].method374(2, false, 174);
                    }
                    if (this.field531[12] != -1 && (this.field605 != 12 || field572 % 20 < 10)) {
                        this.field350[11].method374(2, false, 201);
                    }
                    if (this.field531[13] != -1 && (this.field605 != 13 || field572 % 20 < 10)) {
                        this.field350[12].method374(2, false, 226);
                    }
                }
                this.field548.method35(super.field761, 496, 466, this.field508);
                this.field541.method34(2);
                class64.field1378 = this.field430;
            }
            if (this.field454) {
                this.field454 = false;
                this.field547.method34(2);
                this.field314.method374(0, false, 0);
                this.field637.method272(55, 28, "Public chat", 16777215, true, 0);
                if (this.field167 == 0) {
                    this.field637.method272(55, 41, "On", 65280, true, 0);
                }
                if (this.field167 == 1) {
                    this.field637.method272(55, 41, "Friends", 16776960, true, 0);
                }
                if (this.field167 == 2) {
                    this.field637.method272(55, 41, "Off", 16711680, true, 0);
                }
                if (this.field167 == 3) {
                    this.field637.method272(55, 41, "Hide", 65535, true, 0);
                }
                this.field637.method272(184, 28, "Private chat", 16777215, true, 0);
                if (this.field408 == 0) {
                    this.field637.method272(184, 41, "On", 65280, true, 0);
                }
                if (this.field408 == 1) {
                    this.field637.method272(184, 41, "Friends", 16776960, true, 0);
                }
                if (this.field408 == 2) {
                    this.field637.method272(184, 41, "Off", 16711680, true, 0);
                }
                this.field637.method272(324, 28, "Trade/compete", 16777215, true, 0);
                if (this.field318 == 0) {
                    this.field637.method272(324, 41, "On", 65280, true, 0);
                }
                if (this.field318 == 1) {
                    this.field637.method272(324, 41, "Friends", 16776960, true, 0);
                }
                if (this.field318 == 2) {
                    this.field637.method272(324, 41, "Off", 16711680, true, 0);
                }
                this.field637.method272(458, 33, "Report abuse", 16777215, true, 0);
                this.field547.method35(super.field761, 0, 453, this.field508);
                this.field541.method34(2);
                class64.field1378 = this.field430;
            }
            this.field452 = 0;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZBI)V")
    public final void method65(boolean arg0, byte arg1, int arg2) {
        if (arg1 != 9) {
            this.field415.method455(95);
        }
        signlink.midivol = arg2;
        if (arg0) {
            signlink.midi = "voladjust";
        }
    }

    @OriginalMember(owner = "client", name = "i", descriptor = "(I)V")
    public final void method66(int arg0) {
        if (this.field162 == 0) {
            int var2 = super.field775;
            if (arg0 < 0) {
                if (this.field252 == 1 && super.field776 >= 516 && super.field777 >= 160 && super.field776 <= 765 && super.field777 <= 205) {
                    var2 = 0;
                }
                if (this.field291) {
                    if (var2 != 1) {
                        int var3 = super.field769;
                        int var4 = super.field770;
                        if (this.field200 == 0) {
                            var3 -= 4;
                            var4 -= 4;
                        }
                        if (this.field200 == 1) {
                            var3 -= 553;
                            var4 -= 205;
                        }
                        if (this.field200 == 2) {
                            var3 -= 17;
                            var4 -= 357;
                        }
                        if (var3 < this.field201 - 10 || var3 > this.field203 + this.field201 + 10 || var4 < this.field202 - 10 || var4 > this.field204 + this.field202 + 10) {
                            this.field291 = false;
                            if (this.field200 == 1) {
                                this.field515 = true;
                            }
                            if (this.field200 == 2) {
                                this.field338 = true;
                            }
                        }
                    }
                    if (var2 == 1) {
                        int var5 = this.field201;
                        int var6 = this.field202;
                        int var7 = this.field203;
                        int var8 = super.field776;
                        int var9 = super.field777;
                        if (this.field200 == 0) {
                            var8 -= 4;
                            var9 -= 4;
                        }
                        if (this.field200 == 1) {
                            var8 -= 553;
                            var9 -= 205;
                        }
                        if (this.field200 == 2) {
                            var8 -= 17;
                            var9 -= 357;
                        }
                        int var10 = -1;
                        for (int var11 = 0; var11 < this.field250; ++var11) {
                            int var12 = (this.field250 - 1 - var11) * 15 + var6 + 31;
                            if (var8 > var5 && var8 < var5 + var7 && var9 > var12 - 13 && var9 < var12 + 3) {
                                var10 = var11;
                            }
                        }
                        if (var10 != -1) {
                            this.method90(var10, (byte) 51);
                        }
                        this.field291 = false;
                        if (this.field200 == 1) {
                            this.field515 = true;
                        }
                        if (this.field200 == 2) {
                            this.field338 = true;
                            return;
                        }
                    }
                } else {
                    if (var2 == 1 && this.field250 > 0) {
                        int var13 = this.field627[this.field250 - 1];
                        if (var13 == 610 || var13 == 36 || var13 == 38 || var13 == 277 || var13 == 929 || var13 == 477 || var13 == 705 || var13 == 363 || var13 == 34 || var13 == 73 || var13 == 332 || var13 == 1205) {
                            int var14 = this.field625[this.field250 - 1];
                            int var15 = this.field626[this.field250 - 1];
                            class65 var16 = class65.method395(var15);
                            if (var16.field1412 || var16.field1406) {
                                this.field534 = false;
                                this.field280 = 0;
                                this.field160 = var15;
                                this.field161 = var14;
                                this.field162 = 2;
                                this.field163 = super.field776;
                                this.field164 = super.field777;
                                if (class65.method395(var15).field1391 == this.field391) {
                                    this.field162 = 1;
                                }
                                if (class65.method395(var15).field1391 == this.field475) {
                                    this.field162 = 3;
                                }
                                return;
                            }
                        }
                    }
                    if (var2 == 1 && (this.field509 == 1 || this.method85(8, this.field250 - 1)) && this.field250 > 2) {
                        var2 = 2;
                    }
                    if (var2 == 1 && this.field250 > 0) {
                        this.method90(this.field250 - 1, (byte) 51);
                    }
                    if (var2 != 2 || this.field250 <= 0) {
                        return;
                    }
                    this.method131(635);
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(B)V")
    public final void method67(byte arg0) {
        this.field540.method34(2);
        if (this.field505 == 2) {
            byte[] var2 = this.field413.field1355;
            int[] var3 = class24.field897;
            int var4 = var2.length;
            for (int var5 = 0; var5 < var4; ++var5) {
                if (var2[var5] == 0) {
                    var3[var5] = 0;
                }
            }
            this.field463.method344(33, 25, 25, this.field370, 0, 33, 0, 256, this.field372, -46326, this.field245);
            this.field541.method34(2);
            class64.field1378 = this.field430;
        } else {
            int var6 = this.field372 + this.field257 & 2047;
            int var7 = field178.field731 / 32 + 48;
            int var8 = 464 - field178.field732 / 32;
            this.field273.method344(151, var8, var7, this.field612, 25, 146, 5, this.field378 + 256, var6, -46326, this.field623);
            if (this.field197 == arg0) {
                this.field463.method344(33, 25, 25, this.field370, 0, 33, 0, 256, this.field372, -46326, this.field245);
                for (int var9 = 0; var9 < this.field434; ++var9) {
                    int var39 = this.field435[var9] * 4 + 2 - field178.field731 / 32;
                    int var40 = this.field436[var9] * 4 + 2 - field178.field732 / 32;
                    this.method117(this.field485[var9], var40, (byte) -26, var39);
                }
                for (int var10 = 0; var10 < 104; ++var10) {
                    for (int var35 = 0; var35 < 104; ++var35) {
                        class60 var36 = this.field359[this.field405][var10][var35];
                        if (var36 != null) {
                            int var37 = var10 * 4 + 2 - field178.field731 / 32;
                            int var38 = var35 * 4 + 2 - field178.field732 / 32;
                            this.method117(this.field497, var38, (byte) -26, var37);
                        }
                    }
                }
                for (int var11 = 0; var11 < this.field194; ++var11) {
                    class13 var31 = this.field193[this.field195[var11]];
                    if (var31 != null && var31.method192(-22030)) {
                        class33 var32 = var31.field671;
                        if (var32.field971 != null) {
                            var32 = var32.method262((byte) 9);
                        }
                        if (var32 != null && var32.field992 && var32.field1000) {
                            int var33 = var31.field731 / 32 - field178.field731 / 32;
                            int var34 = var31.field732 / 32 - field178.field732 / 32;
                            this.method117(this.field498, var34, (byte) -26, var33);
                        }
                    }
                }
                for (int var12 = 0; var12 < this.field576; ++var12) {
                    class48 var23 = this.field575[this.field577[var12]];
                    if (var23 != null && var23.method192(-22030)) {
                        int var24 = var23.field731 / 32 - field178.field731 / 32;
                        int var25 = var23.field732 / 32 - field178.field732 / 32;
                        boolean var26 = false;
                        long var27 = class11.method37(var23.field1239);
                        for (int var29 = 0; var29 < this.field183; ++var29) {
                            if (this.field230[var29] == var27 && this.field278[var29] != 0) {
                                var26 = true;
                                break;
                            }
                        }
                        boolean var30 = false;
                        if (field178.field1215 != 0 && var23.field1215 != 0 && field178.field1215 == var23.field1215) {
                            var30 = true;
                        }
                        if (var26) {
                            this.method117(this.field500, var25, (byte) -26, var24);
                        } else if (var30) {
                            this.method117(this.field501, var25, (byte) -26, var24);
                        } else {
                            this.method117(this.field499, var25, (byte) -26, var24);
                        }
                    }
                }
                if (this.field240 != 0 && field572 % 20 < 10) {
                    if (this.field240 == 1 && this.field199 >= 0 && this.field199 < this.field193.length) {
                        class13 var13 = this.field193[this.field199];
                        if (var13 != null) {
                            int var14 = var13.field731 / 32 - field178.field731 / 32;
                            int var15 = var13.field732 / 32 - field178.field732 / 32;
                            this.method84(this.field417, (byte) -103, var14, var15);
                        }
                    }
                    if (this.field240 == 2) {
                        int var16 = (this.field516 - this.field464) * 4 + 2 - field178.field731 / 32;
                        int var17 = (this.field517 - this.field465) * 4 + 2 - field178.field732 / 32;
                        this.method84(this.field417, (byte) -103, var16, var17);
                    }
                    if (this.field240 == 10 && this.field274 >= 0 && this.field274 < this.field575.length) {
                        class48 var18 = this.field575[this.field274];
                        if (var18 != null) {
                            int var19 = var18.field731 / 32 - field178.field731 / 32;
                            int var20 = var18.field732 / 32 - field178.field732 / 32;
                            this.method84(this.field417, (byte) -103, var19, var20);
                        }
                    }
                }
                if (this.field271 != 0) {
                    int var21 = this.field271 * 4 + 2 - field178.field731 / 32;
                    int var22 = this.field272 * 4 + 2 - field178.field732 / 32;
                    this.method117(this.field416, var22, (byte) -26, var21);
                }
                class24.method245(78, 16777215, 97, false, 3, 3);
                this.field541.method34(2);
                class64.field1378 = this.field430;
            }
        }
    }

    @OriginalMember(owner = "client", name = "j", descriptor = "(I)V")
    public final void method68(int arg0) {
        if (this.field295 > 1) {
            --this.field295;
        }
        if (this.field427 > 0) {
            --this.field427;
        }
        for (int var2 = 0; var2 < 5 && this.method140((byte) 1); ++var2) {
        }
        if (this.field334) {
            Object var3 = this.field533.field1281;
            synchronized (this.field533.field1281) {
                if (!field513) {
                    this.field533.field1282 = 0;
                } else if (super.field775 != 0 || this.field533.field1282 >= 40) {
                    this.field415.method454(4, 97);
                    this.field415.method455(0);
                    int var4 = this.field415.field1652;
                    int var5 = 0;
                    for (int var6 = 0; var6 < this.field533.field1282 && var4 - this.field415.field1652 < 240; ++var6) {
                        ++var5;
                        int var7 = this.field533.field1285[var6];
                        if (var7 < 0) {
                            var7 = 0;
                        } else if (var7 > 502) {
                            var7 = 502;
                        }
                        int var8 = this.field533.field1283[var6];
                        if (var8 < 0) {
                            var8 = 0;
                        } else if (var8 > 764) {
                            var8 = 764;
                        }
                        int var9 = var7 * 765 + var8;
                        if (this.field533.field1285[var6] == -1 && this.field533.field1283[var6] == -1) {
                            var8 = -1;
                            var7 = -1;
                            var9 = 524287;
                        }
                        if (this.field165 == var8 && this.field166 == var7) {
                            if (this.field279 < 2047) {
                                ++this.field279;
                            }
                        } else {
                            int var10 = var8 - this.field165;
                            this.field165 = var8;
                            int var11 = var7 - this.field166;
                            this.field166 = var7;
                            if (this.field279 < 8 && var10 >= -32 && var10 <= 31 && var11 >= -32 && var11 <= 31) {
                                var10 += 32;
                                var11 += 32;
                                this.field415.method456((this.field279 << 12) + (var10 << 6) + var11);
                                this.field279 = 0;
                            } else if (this.field279 < 8) {
                                this.field415.method458((this.field279 << 19) + 8388608 + var9);
                                this.field279 = 0;
                            } else {
                                this.field415.method459((this.field279 << 19) + -1073741824 + var9);
                                this.field279 = 0;
                            }
                        }
                    }
                    this.field415.method464(true, this.field415.field1652 - var4);
                    if (var5 >= this.field533.field1282) {
                        this.field533.field1282 = 0;
                    } else {
                        this.field533.field1282 -= var5;
                        for (int var12 = 0; var12 < this.field533.field1282; ++var12) {
                            this.field533.field1283[var12] = this.field533.field1283[var5 + var12];
                            this.field533.field1285[var12] = this.field533.field1285[var5 + var12];
                        }
                    }
                }
            }
            if (super.field775 != 0) {
                long var13 = (super.field778 - this.field229) / 50L;
                if (var13 > 4095L) {
                    var13 = 4095L;
                }
                this.field229 = super.field778;
                int var15 = super.field777;
                if (var15 < 0) {
                    var15 = 0;
                } else if (var15 > 502) {
                    var15 = 502;
                }
                int var16 = super.field776;
                if (var16 < 0) {
                    var16 = 0;
                } else if (var16 > 764) {
                    var16 = 764;
                }
                int var17 = var15 * 765 + var16;
                byte var18 = 0;
                if (super.field775 == 2) {
                    var18 = 1;
                }
                int var19 = (int) var13;
                this.field415.method454(4, 14);
                this.field415.method497((var18 << 19) + (var19 << 20) + var17, this.field173);
            }
            if (this.field398 > 0) {
                --this.field398;
            }
            if (super.field779[1] == 1 || super.field779[2] == 1 || super.field779[3] == 1 || super.field779[4] == 1) {
                this.field399 = true;
            }
            if (this.field399 && this.field398 <= 0) {
                this.field398 = 20;
                this.field399 = false;
                this.field415.method454(4, 124);
                this.field415.method490(-302, this.field371);
                this.field415.method488(this.field372, 41364);
            }
            if (super.field766 && !this.field381) {
                this.field381 = true;
                this.field415.method454(4, 57);
                this.field415.method455(1);
            }
            if (!super.field766 && this.field381) {
                this.field381 = false;
                this.field415.method454(4, 57);
                this.field415.method455(0);
            }
            this.method115(false);
            this.method93(true);
            this.method146(false);
            ++this.field425;
            if (this.field425 > 750) {
                this.method125(18674);
            }
            this.method76(-17431);
            this.method57(0);
            this.method45((byte) 3);
            ++this.field452;
            if (this.field448 != 0) {
                this.field447 += 20;
                if (this.field447 >= 400) {
                    this.field448 = 0;
                }
            }
            if (this.field422 != 0) {
                ++this.field419;
                if (this.field419 >= 15) {
                    if (this.field422 == 2) {
                        this.field515 = true;
                    }
                    if (this.field422 == 3) {
                        this.field338 = true;
                    }
                    this.field422 = 0;
                }
            }
            if (this.field162 != 0) {
                ++this.field280;
                if (super.field769 > this.field163 + 5 || super.field769 < this.field163 - 5 || super.field770 > this.field164 + 5 || super.field770 < this.field164 - 5) {
                    this.field534 = true;
                }
                if (super.field768 == 0) {
                    if (this.field162 == 2) {
                        this.field515 = true;
                    }
                    if (this.field162 == 3) {
                        this.field338 = true;
                    }
                    this.field162 = 0;
                    if (this.field534 && this.field280 >= 5) {
                        this.field303 = -1;
                        this.method132(true);
                        if (this.field303 == this.field160 && this.field302 != this.field161) {
                            class65 var20 = class65.method395(this.field160);
                            byte var21 = 0;
                            if (this.field332 == 1 && var20.field1454 == 206) {
                                var21 = 1;
                            }
                            if (var20.field1431[this.field302] <= 0) {
                                var21 = 0;
                            }
                            if (var20.field1406) {
                                int var22 = this.field161;
                                int var23 = this.field302;
                                var20.field1431[var23] = var20.field1431[var22];
                                var20.field1395[var23] = var20.field1395[var22];
                                var20.field1431[var22] = -1;
                                var20.field1395[var22] = 0;
                            } else if (var21 == 1) {
                                int var24 = this.field161;
                                int var25 = this.field302;
                                while (var24 != var25) {
                                    if (var24 > var25) {
                                        var20.method394((byte) -28, var24 - 1, var24);
                                        --var24;
                                    } else if (var24 < var25) {
                                        var20.method394((byte) -28, var24 + 1, var24);
                                        ++var24;
                                    }
                                }
                            } else {
                                var20.method394((byte) -28, this.field302, this.field161);
                            }
                            this.field415.method454(4, 202);
                            this.field415.method456(this.field302);
                            this.field415.method482(this.field444, var21);
                            this.field415.method489(this.field161, 1);
                            this.field415.method456(this.field160);
                        }
                    } else if ((this.field509 == 1 || this.method85(8, this.field250 - 1)) && this.field250 > 2) {
                        this.method131(635);
                    } else if (this.field250 > 0) {
                        this.method90(this.field250 - 1, (byte) 51);
                    }
                    this.field419 = 10;
                    super.field775 = 0;
                }
            }
            if (class70.field1707 != -1) {
                int var26 = class70.field1707;
                int var27 = class70.field1708;
                boolean var28 = this.method102(var27, this.field244, 0, 0, 0, 0, field178.field711[0], 0, true, var26, field178.field712[0], 0);
                class70.field1707 = -1;
                if (var28) {
                    this.field445 = super.field776;
                    this.field446 = super.field777;
                    this.field448 = 1;
                    this.field447 = 0;
                }
            }
            if (super.field775 == 1 && this.field376 != null) {
                this.field376 = null;
                this.field338 = true;
                super.field775 = 0;
            }
            this.method66(-551);
            if (this.field356 == -1) {
                this.method181(-44096);
                this.method180((byte) 4);
                this.method108(0);
            }
            if (super.field768 == 1 || super.field775 == 1) {
                ++this.field312;
            }
            if (this.field401 == 0 && this.field246 == 0 && this.field283 == 0) {
                if (this.field196 > 0) {
                    --this.field196;
                }
            } else if (this.field196 < 100) {
                ++this.field196;
                if (this.field196 == 100) {
                    if (this.field401 != 0) {
                        this.field338 = true;
                    }
                    if (this.field246 != 0) {
                        this.field515 = true;
                    }
                }
            }
            if (this.field594 == 2) {
                this.method158(6);
            }
            if (this.field594 == 2 && this.field535) {
                this.method166(-873);
            }
            for (int var29 = 0; var29 < 5; ++var29) {
                int var10002 = this.field449[var29]++;
            }
            this.method109(513);
            ++super.field767;
            if (super.field767 > 4500) {
                this.field427 = 250;
                super.field767 -= 500;
                this.field415.method454(4, 145);
            }
            ++this.field182;
            if (arg0 >= 0) {
                this.field190 = !this.field190;
            }
            if (this.field182 > 500) {
                this.field182 = 0;
                int var30 = (int) (Math.random() * 8.0D);
                if ((var30 & 1) == 1) {
                    this.field364 += this.field365;
                }
                if ((var30 & 2) == 2) {
                    this.field634 += this.field635;
                }
                if ((var30 & 4) == 4) {
                    this.field394 += this.field395;
                }
            }
            if (this.field364 < -50) {
                this.field365 = 2;
            }
            if (this.field364 > 50) {
                this.field365 = -2;
            }
            if (this.field634 < -55) {
                this.field635 = 2;
            }
            if (this.field634 > 55) {
                this.field635 = -2;
            }
            if (this.field394 < -40) {
                this.field395 = 1;
            }
            if (this.field394 > 40) {
                this.field395 = -1;
            }
            ++this.field368;
            if (this.field368 > 500) {
                this.field368 = 0;
                int var31 = (int) (Math.random() * 8.0D);
                if ((var31 & 1) == 1) {
                    this.field257 += this.field258;
                }
                if ((var31 & 2) == 2) {
                    this.field378 += this.field379;
                }
            }
            if (this.field257 < -60) {
                this.field258 = 2;
            }
            if (this.field257 > 60) {
                this.field258 = -2;
            }
            if (this.field378 < -20) {
                this.field379 = 1;
            }
            if (this.field378 > 10) {
                this.field379 = -1;
            }
            ++this.field426;
            if (this.field426 > 50) {
                this.field415.method454(4, 214);
            }
            try {
                if (this.field306 != null && this.field415.field1652 > 0) {
                    this.field306.method5(this.field415.field1652, this.field415.field1651, 0, 0);
                    this.field415.field1652 = 0;
                    this.field426 = 0;
                }
            } catch (IOException var33) {
                this.method125(18674);
            } catch (Exception var34) {
                this.method123(true);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IZ)V")
    public final void method69(int arg0, boolean arg1) {
        this.method96((byte) 9);
        if (arg0 < 8 || arg0 > 8) {
            this.field424 = this.field232.method465();
        }
        this.field615.method34(2);
        this.field551.method374(0, false, 0);
        short var3 = 360;
        short var4 = 200;
        if (this.field172 == 0) {
            int var5 = var4 / 2 + 80;
            this.field636.method272(var3 / 2, var5, this.field241.field1083, 7711145, true, 0);
            int var6 = var4 / 2 - 20;
            this.field638.method272(var3 / 2, var6, "Welcome to RuneScape", 16776960, true, 0);
            int var17 = var6 + 30;
            int var7 = var3 / 2 - 80;
            int var8 = var4 / 2 + 20;
            this.field552.method374(var8 - 20, false, var7 - 73);
            this.field638.method272(var7, var8 + 5, "New User", 16777215, true, 0);
            int var9 = var3 / 2 + 80;
            this.field552.method374(var8 - 20, false, var9 - 73);
            this.field638.method272(var9, var8 + 5, "Existing User", 16777215, true, 0);
        }
        if (this.field172 == 2) {
            int var10 = var4 / 2 - 40;
            if (this.field502.length() > 0) {
                this.field638.method272(var3 / 2, var10 - 15, this.field502, 16776960, true, 0);
                this.field638.method272(var3 / 2, var10, this.field503, 16776960, true, 0);
                var10 += 30;
            } else {
                this.field638.method272(var3 / 2, var10 - 7, this.field503, 16776960, true, 0);
                var10 += 30;
            }
            this.field638.method279(0, "Username: " + this.field437 + (this.field461 == 0 & field572 % 40 < 20 ? "@yel@|" : ""), var3 / 2 - 90, 16777215, true, var10);
            var10 += 15;
            this.field638.method279(0, "Password: " + class11.method42((byte) -118, this.field438) + (this.field461 == 1 & field572 % 40 < 20 ? "@yel@|" : ""), var3 / 2 - 88, 16777215, true, var10);
            var10 += 15;
            if (!arg1) {
                int var11 = var3 / 2 - 80;
                int var12 = var4 / 2 + 50;
                this.field552.method374(var12 - 20, false, var11 - 73);
                this.field638.method272(var11, var12 + 5, "Login", 16777215, true, 0);
                int var13 = var3 / 2 + 80;
                this.field552.method374(var12 - 20, false, var13 - 73);
                this.field638.method272(var13, var12 + 5, "Cancel", 16777215, true, 0);
            }
        }
        if (this.field172 == 3) {
            this.field638.method272(var3 / 2, var4 / 2 - 60, "Create a free account", 16776960, true, 0);
            int var14 = var4 / 2 - 35;
            this.field638.method272(var3 / 2, var14, "To create a new account you need to", 16777215, true, 0);
            int var18 = var14 + 15;
            this.field638.method272(var3 / 2, var18, "go back to the main RuneScape webpage", 16777215, true, 0);
            int var19 = var18 + 15;
            this.field638.method272(var3 / 2, var19, "and choose the 'create account'", 16777215, true, 0);
            int var20 = var19 + 15;
            this.field638.method272(var3 / 2, var20, "button near the top of that page.", 16777215, true, 0);
            int var21 = var20 + 15;
            int var15 = var3 / 2;
            int var16 = var4 / 2 + 50;
            this.field552.method374(var16 - 20, false, var15 - 73);
            this.field638.method272(var15, var16 + 5, "Cancel", 16777215, true, 0);
        }
        this.field615.method35(super.field761, 202, 171, this.field508);
        if (this.field369) {
            this.field369 = false;
            this.field613.method35(super.field761, 128, 0, this.field508);
            this.field614.method35(super.field761, 202, 371, this.field508);
            this.field618.method35(super.field761, 0, 265, this.field508);
            this.field619.method35(super.field761, 562, 265, this.field508);
            this.field620.method35(super.field761, 128, 171, this.field508);
            this.field621.method35(super.field761, 562, 171, this.field508);
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(ILXGRGMPUQ;I)V")
    private final void method70(int arg0, class69 arg1, int arg2) {
        for (int var4 = 0; var4 < this.field578; ++var4) {
            int var5 = this.field579[var4];
            class13 var6 = this.field193[var5];
            int var7 = arg1.method465();
            if ((var7 & 16) != 0) {
                int var8 = arg1.method465();
                int var9 = arg1.method484(-241);
                var6.method198(var9, field572, -739, var8);
                var6.field691 = field572 + 300;
                var6.field692 = arg1.method484(-241);
                var6.field693 = arg1.method484(-241);
            }
            if ((var7 & 64) != 0) {
                var6.field729 = arg1.method467();
                var6.field730 = arg1.method492(0);
            }
            if ((var7 & 128) != 0) {
                var6.field717 = arg1.method493(0);
                int var10 = arg1.method499(0);
                var6.field721 = var10 >> 16;
                var6.field720 = (var10 & 65535) + field572;
                var6.field718 = 0;
                var6.field719 = 0;
                if (var6.field720 > field572) {
                    var6.field718 = -1;
                }
                if (var6.field717 == 65535) {
                    var6.field717 = -1;
                }
            }
            if ((var7 & 1) != 0) {
                var6.field713 = arg1.method492(0);
                if (var6.field713 == 65535) {
                    var6.field713 = -1;
                }
            }
            if ((var7 & 32) != 0) {
                int var11 = arg1.method467();
                if (var11 == 65535) {
                    var11 = -1;
                }
                int var12 = arg1.method485(this.field207);
                if (var6.field686 == var11 && var11 != -1) {
                    int var13 = class45.field1187[var11].field1201;
                    if (var13 == 1) {
                        var6.field687 = 0;
                        var6.field688 = 0;
                        var6.field689 = var12;
                        var6.field690 = 0;
                    }
                    if (var13 == 2) {
                        var6.field690 = 0;
                    }
                } else if (var11 == -1 || var6.field686 == -1 || class45.field1187[var11].field1195 >= class45.field1187[var6.field686].field1195) {
                    var6.field686 = var11;
                    var6.field687 = 0;
                    var6.field688 = 0;
                    var6.field689 = var12;
                    var6.field690 = 0;
                    var6.field714 = var6.field728;
                }
            }
            if ((var7 & 8) != 0) {
                var6.field671 = class33.method267(arg1.method493(0));
                var6.field694 = var6.field671.field975;
                var6.field727 = var6.field671.field987;
                var6.field699 = var6.field671.field1001;
                var6.field700 = var6.field671.field989;
                var6.field701 = var6.field671.field969;
                var6.field702 = var6.field671.field985;
                var6.field736 = var6.field671.field998;
            }
            if ((var7 & 4) != 0) {
                int var14 = arg1.method485(this.field207);
                int var15 = arg1.method485(this.field207);
                var6.method198(var15, field572, -739, var14);
                var6.field691 = field572 + 300;
                var6.field692 = arg1.method483(-270);
                var6.field693 = arg1.method465();
            }
            if ((var7 & 2) != 0) {
                var6.field684 = arg1.method472();
                var6.field685 = 100;
            }
        }
        if (arg2 > 0) {
            ;
        }
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(B)V")
    public final void method71(byte arg0) {
        Graphics var2 = this.method107(4).getGraphics();
        var2.setColor(Color.black);
        var2.fillRect(0, 0, 765, 503);
        this.method210(0, 1);
        if (arg0 != -111) {
            field599 = 148;
        }
        if (this.field433) {
            this.field432 = false;
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
        if (this.field329) {
            this.field432 = false;
            var2.setFont(new Font("Helvetica", 1, 20));
            var2.setColor(Color.white);
            var2.drawString("Error - unable to load game!", 50, 50);
            var2.drawString("To play RuneScape make sure you play from", 50, 100);
            var2.drawString("http://www.runescape.com", 50, 150);
        }
        if (this.field392) {
            this.field432 = false;
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

    @OriginalMember(owner = "client", name = "d", descriptor = "(Z)V")
    public final void method72(boolean arg0) {
        if (!arg0) {
            this.method81();
        }
        byte[] var2 = this.field290.method317("title.dat", (byte[]) null);
        class55 var3 = new class55(var2, this);
        this.field616.method34(2);
        var3.method338(0, 0, 936);
        this.field617.method34(2);
        var3.method338(0, -637, 936);
        this.field613.method34(2);
        var3.method338(0, -128, 936);
        this.field614.method34(2);
        var3.method338(-371, -202, 936);
        this.field615.method34(2);
        var3.method338(-171, -202, 936);
        this.field618.method34(2);
        var3.method338(-265, 0, 936);
        this.field619.method34(2);
        var3.method338(-265, -562, 936);
        this.field620.method34(2);
        var3.method338(-171, -128, 936);
        this.field621.method34(2);
        var3.method338(-171, -562, 936);
        int[] var4 = new int[var3.field1308];
        for (int var5 = 0; var5 < var3.field1309; ++var5) {
            for (int var10 = 0; var10 < var3.field1308; ++var10) {
                var4[var10] = var3.field1307[var3.field1308 * var5 + (var3.field1308 - var10 - 1)];
            }
            for (int var11 = 0; var11 < var3.field1308; ++var11) {
                var3.field1307[var3.field1308 * var5 + var11] = var4[var11];
            }
        }
        this.field616.method34(2);
        var3.method338(0, 382, 936);
        this.field617.method34(2);
        var3.method338(0, -255, 936);
        this.field613.method34(2);
        var3.method338(0, 254, 936);
        this.field614.method34(2);
        var3.method338(-371, 180, 936);
        this.field615.method34(2);
        var3.method338(-171, 180, 936);
        this.field618.method34(2);
        var3.method338(-265, 382, 936);
        this.field619.method34(2);
        var3.method338(-265, -180, 936);
        this.field620.method34(2);
        var3.method338(-171, 254, 936);
        this.field621.method34(2);
        var3.method338(-171, -180, 936);
        class55 var6 = new class55(this.field290, "logo", 0);
        this.field613.method34(2);
        var6.method340(18, false, 382 - var6.field1308 / 2 - 128);
        Object var7 = null;
        Object var8 = null;
        Object var9 = null;
        System.gc();
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(II)V")
    public final void method73(int arg0, int arg1) {
        if (arg1 != 5) {
            this.field489 = -281;
        }
        int var3 = class36.field1041[arg0].field1049;
        if (var3 != 0) {
            int var4 = this.field320[arg0];
            if (var3 == 1) {
                if (var4 == 1) {
                    class64.method385(0.9D, (byte) 5);
                }
                if (var4 == 2) {
                    class64.method385(0.8D, (byte) 5);
                }
                if (var4 == 3) {
                    class64.method385(0.7D, (byte) 5);
                }
                if (var4 == 4) {
                    class64.method385(0.6D, (byte) 5);
                }
                class22.field845.method195();
                this.field369 = true;
            }
            if (var3 == 3) {
                boolean var5 = this.field640;
                if (var4 == 0) {
                    this.method65(this.field640, (byte) 9, 0);
                    this.field640 = true;
                }
                if (var4 == 1) {
                    this.method65(this.field640, (byte) 9, -400);
                    this.field640 = true;
                }
                if (var4 == 2) {
                    this.method65(this.field640, (byte) 9, -800);
                    this.field640 = true;
                }
                if (var4 == 3) {
                    this.method65(this.field640, (byte) 9, -1200);
                    this.field640 = true;
                }
                if (var4 == 4) {
                    this.field640 = false;
                }
                if (this.field640 != var5 && !field471) {
                    if (this.field640) {
                        this.field353 = this.field224;
                        this.field354 = true;
                        this.field241.method297(2, this.field353);
                    } else {
                        this.method134((byte) -30);
                    }
                    this.field238 = 0;
                }
            }
            if (var3 == 4) {
                if (var4 == 0) {
                    this.field480 = true;
                    this.method101((byte) -109, 0);
                }
                if (var4 == 1) {
                    this.field480 = true;
                    this.method101((byte) -109, -400);
                }
                if (var4 == 2) {
                    this.field480 = true;
                    this.method101((byte) -109, -800);
                }
                if (var4 == 3) {
                    this.field480 = true;
                    this.method101((byte) -109, -1200);
                }
                if (var4 == 4) {
                    this.field480 = false;
                }
            }
            if (var3 == 5) {
                this.field509 = var4;
            }
            if (var3 == 6) {
                this.field393 = var4;
            }
            if (var3 == 8) {
                this.field174 = var4;
                this.field338 = true;
            }
            if (var3 == 9) {
                this.field332 = var4;
            }
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(II)V")
    public final void method74(int arg0, int arg1) {
        class60 var3 = this.field359[this.field405][arg0][arg1];
        if (var3 == null) {
            this.field441.method523(this.field405, arg0, arg1);
        } else {
            int var4 = -99999999;
            class51 var5 = null;
            for (class51 var6 = (class51) var3.method361(); var6 != null; var6 = (class51) var3.method363(this.field512)) {
                class22 var11 = class22.method237(var6.field1280);
                int var12 = var11.field834;
                if (var11.field842) {
                    var12 = (var6.field1279 + 1) * var12;
                }
                if (var12 > var4) {
                    var4 = var12;
                    var5 = var6;
                }
            }
            var3.method359(var5, 8);
            class51 var7 = null;
            class51 var8 = null;
            for (class51 var9 = (class51) var3.method361(); var9 != null; var9 = (class51) var3.method363(this.field512)) {
                if (var5.field1280 != var9.field1280 && var7 == null) {
                    var7 = var9;
                }
                if (var5.field1280 != var9.field1280 && var7.field1280 != var9.field1280 && var8 == null) {
                    var8 = var9;
                }
            }
            int var10 = (arg1 << 7) + arg0 + 1610612736;
            this.field441.method509(var7, var5, arg1, arg0, this.method95(arg0 * 128 + 64, arg1 * 128 + 64, this.field405, -738), var10, this.field405, (byte) -105, var8);
        }
    }

    @OriginalMember(owner = "client", name = "k", descriptor = "(I)V")
    public final void method75(int arg0) {
        if (this.field233 == 0 && this.field252 == 0) {
            this.field581[this.field250] = "Walk here";
            this.field627[this.field250] = 765;
            this.field625[this.field250] = super.field769;
            this.field626[this.field250] = super.field770;
            ++this.field250;
        }
        int var2 = -1;
        for (int var3 = 0; var3 < class66.field1540; ++var3) {
            int var5 = class66.field1541[var3];
            int var6 = var5 & 127;
            int var7 = var5 >> 7 & 127;
            int var8 = var5 >> 29 & 3;
            int var9 = var5 >> 14 & 32767;
            if (var2 != var5) {
                var2 = var5;
                if (var8 == 2 && this.field441.method532(this.field405, var6, var7, var5) >= 0) {
                    class8 var10 = class8.method30(var9);
                    if (var10.field90 != null) {
                        var10 = var10.method23(true);
                    }
                    if (var10 == null) {
                        continue;
                    }
                    if (this.field233 == 1) {
                        this.field581[this.field250] = "Use " + this.field237 + " with @cya@" + var10.field119;
                        this.field627[this.field250] = 906;
                        this.field628[this.field250] = var5;
                        this.field625[this.field250] = var6;
                        this.field626[this.field250] = var7;
                        ++this.field250;
                    } else if (this.field252 == 1) {
                        if ((this.field254 & 4) == 4) {
                            this.field581[this.field250] = this.field255 + " @cya@" + var10.field119;
                            this.field627[this.field250] = 450;
                            this.field628[this.field250] = var5;
                            this.field625[this.field250] = var6;
                            this.field626[this.field250] = var7;
                            ++this.field250;
                        }
                    } else {
                        if (var10.field120 != null) {
                            for (int var11 = 4; var11 >= 0; --var11) {
                                if (var10.field120[var11] != null) {
                                    this.field581[this.field250] = var10.field120[var11] + " @cya@" + var10.field119;
                                    if (var11 == 0) {
                                        this.field627[this.field250] = 579;
                                    }
                                    if (var11 == 1) {
                                        this.field627[this.field250] = 179;
                                    }
                                    if (var11 == 2) {
                                        this.field627[this.field250] = 109;
                                    }
                                    if (var11 == 3) {
                                        this.field627[this.field250] = 186;
                                    }
                                    if (var11 == 4) {
                                        this.field627[this.field250] = 1802;
                                    }
                                    this.field628[this.field250] = var5;
                                    this.field625[this.field250] = var6;
                                    this.field626[this.field250] = var7;
                                    ++this.field250;
                                }
                            }
                        }
                        this.field581[this.field250] = "Examine @cya@" + var10.field119;
                        this.field627[this.field250] = 1836;
                        this.field628[this.field250] = var10.field133 << 14;
                        this.field625[this.field250] = var6;
                        this.field626[this.field250] = var7;
                        ++this.field250;
                    }
                }
                if (var8 == 1) {
                    class13 var12 = this.field193[var9];
                    if (var12.field671.field975 == 1 && (var12.field731 & 127) == 64 && (var12.field732 & 127) == 64) {
                        for (int var13 = 0; var13 < this.field194; ++var13) {
                            class13 var16 = this.field193[this.field195[var13]];
                            if (var16 != null && var12 != var16 && var16.field671.field975 == 1 && var12.field731 == var16.field731 && var12.field732 == var16.field732) {
                                this.method179(this.field195[var13], var6, var16.field671, 55, var7);
                            }
                        }
                        for (int var14 = 0; var14 < this.field576; ++var14) {
                            class48 var15 = this.field575[this.field577[var14]];
                            if (var15 != null && var12.field731 == var15.field731 && var12.field732 == var15.field732) {
                                this.method143(var7, 7, var6, this.field577[var14], var15);
                            }
                        }
                    }
                    this.method179(var9, var6, var12.field671, 55, var7);
                }
                if (var8 == 0) {
                    class48 var17 = this.field575[var9];
                    if ((var17.field731 & 127) == 64 && (var17.field732 & 127) == 64) {
                        for (int var18 = 0; var18 < this.field194; ++var18) {
                            class13 var21 = this.field193[this.field195[var18]];
                            if (var21 != null && var21.field671.field975 == 1 && var17.field731 == var21.field731 && var17.field732 == var21.field732) {
                                this.method179(this.field195[var18], var6, var21.field671, 55, var7);
                            }
                        }
                        for (int var19 = 0; var19 < this.field576; ++var19) {
                            class48 var20 = this.field575[this.field577[var19]];
                            if (var20 != null && var17 != var20 && var17.field731 == var20.field731 && var17.field732 == var20.field732) {
                                this.method143(var7, 7, var6, this.field577[var19], var20);
                            }
                        }
                    }
                    this.method143(var7, 7, var6, var9, var17);
                }
                if (var8 == 3) {
                    class60 var22 = this.field359[this.field405][var6][var7];
                    if (var22 != null) {
                        for (class51 var23 = (class51) var22.method362(46747); var23 != null; var23 = (class51) var22.method364(-472)) {
                            class22 var24 = class22.method237(var23.field1280);
                            if (this.field233 == 1) {
                                this.field581[this.field250] = "Use " + this.field237 + " with @lre@" + var24.field848;
                                this.field627[this.field250] = 675;
                                this.field628[this.field250] = var23.field1280;
                                this.field625[this.field250] = var6;
                                this.field626[this.field250] = var7;
                                ++this.field250;
                            } else if (this.field252 == 1) {
                                if ((this.field254 & 1) == 1) {
                                    this.field581[this.field250] = this.field255 + " @lre@" + var24.field848;
                                    this.field627[this.field250] = 453;
                                    this.field628[this.field250] = var23.field1280;
                                    this.field625[this.field250] = var6;
                                    this.field626[this.field250] = var7;
                                    ++this.field250;
                                }
                            } else {
                                for (int var25 = 4; var25 >= 0; --var25) {
                                    if (var24.field829 != null && var24.field829[var25] != null) {
                                        this.field581[this.field250] = var24.field829[var25] + " @lre@" + var24.field848;
                                        if (var25 == 0) {
                                            this.field627[this.field250] = 228;
                                        }
                                        if (var25 == 1) {
                                            this.field627[this.field250] = 330;
                                        }
                                        if (var25 == 2) {
                                            this.field627[this.field250] = 162;
                                        }
                                        if (var25 == 3) {
                                            this.field627[this.field250] = 916;
                                        }
                                        if (var25 == 4) {
                                            this.field627[this.field250] = 790;
                                        }
                                        this.field628[this.field250] = var23.field1280;
                                        this.field625[this.field250] = var6;
                                        this.field626[this.field250] = var7;
                                        ++this.field250;
                                    } else if (var25 == 2) {
                                        this.field581[this.field250] = "Take @lre@" + var24.field848;
                                        this.field627[this.field250] = 162;
                                        this.field628[this.field250] = var23.field1280;
                                        this.field625[this.field250] = var6;
                                        this.field626[this.field250] = var7;
                                        ++this.field250;
                                    }
                                }
                                this.field581[this.field250] = "Examine @lre@" + var24.field848;
                                this.field627[this.field250] = 1918;
                                this.field628[this.field250] = var23.field1280;
                                this.field625[this.field250] = var6;
                                this.field626[this.field250] = var7;
                                ++this.field250;
                            }
                        }
                    }
                }
            }
        }
        while (arg0 >= 0) {
            for (int var4 = 1; var4 > 0; ++var4) {
            }
        }
    }

    @OriginalMember(owner = "client", name = "l", descriptor = "(I)V")
    public final void method76(int arg0) {
        for (int var2 = -1; var2 < this.field576; ++var2) {
            int var3;
            if (var2 == -1) {
                var3 = this.field574;
            } else {
                var3 = this.field577[var2];
            }
            class48 var4 = this.field575[var3];
            if (var4 != null) {
                this.method58(var4, 676, 1);
            }
        }
        if (this.field205 != arg0) {
            this.field359 = null;
        }
    }

    @OriginalMember(owner = "client", name = "m", descriptor = "(I)V")
    public final void method77(int arg0) {
        this.field562 = 0;
        for (int var2 = -1; var2 < this.field576 + this.field194; ++var2) {
            class15 var19;
            if (var2 == -1) {
                var19 = field178;
            } else if (var2 < this.field576) {
                var19 = this.field575[this.field577[var2]];
            } else {
                var19 = this.field193[this.field195[var2 - this.field576]];
            }
            if (var19 != null && var19.method192(-22030)) {
                if (var19 instanceof class13) {
                    class33 var20 = ((class13) var19).field671;
                    if (var20.field971 != null) {
                        var20 = var20.method262((byte) 9);
                    }
                    if (var20 == null) {
                        continue;
                    }
                }
                if (var2 >= this.field576) {
                    class33 var23 = ((class13) var19).field671;
                    if (var23.field996 >= 0 && var23.field996 < this.field331.length) {
                        this.method177(-267, var19, var19.field739 + 15);
                        if (this.field262 > -1) {
                            this.field331[var23.field996].method340(this.field263 - 30, false, this.field262 - 12);
                        }
                    }
                    if (this.field240 == 1 && this.field195[var2 - this.field576] == this.field199 && field572 % 20 < 10) {
                        this.method177(-267, var19, var19.field739 + 15);
                        if (this.field262 > -1) {
                            this.field473[0].method340(this.field263 - 28, false, this.field262 - 12);
                        }
                    }
                } else {
                    int var21 = 30;
                    class48 var22 = (class48) var19;
                    if (var22.field1245 != -1 || var22.field1244 != -1) {
                        this.method177(-267, var19, var19.field739 + 15);
                        if (this.field262 > -1) {
                            if (var22.field1245 != -1) {
                                this.field296[var22.field1245].method340(this.field263 - var21, false, this.field262 - 12);
                                var21 += 25;
                            }
                            if (var22.field1244 != -1) {
                                this.field331[var22.field1244].method340(this.field263 - var21, false, this.field262 - 12);
                                var21 += 25;
                            }
                        }
                    }
                    if (var2 >= 0 && this.field240 == 10 && this.field577[var2] == this.field274) {
                        this.method177(-267, var19, var19.field739 + 15);
                        if (this.field262 > -1) {
                            this.field473[1].method340(this.field263 - var21, false, this.field262 - 12);
                        }
                    }
                }
                if (var19.field684 != null && (var2 >= this.field576 || this.field167 == 0 || this.field167 == 3 || this.field167 == 1 && this.method186((byte) 20, ((class48) var19).field1239))) {
                    this.method177(-267, var19, var19.field739);
                    if (this.field262 > -1 && this.field562 < this.field563) {
                        this.field567[this.field562] = this.field638.method274(var19.field684, 219) / 2;
                        this.field566[this.field562] = this.field638.field1024;
                        this.field564[this.field562] = this.field262;
                        this.field565[this.field562] = this.field263;
                        this.field568[this.field562] = var19.field722;
                        this.field569[this.field562] = var19.field734;
                        this.field570[this.field562] = var19.field685;
                        this.field571[this.field562++] = var19.field684;
                        if (this.field393 == 0 && var19.field734 >= 1 && var19.field734 <= 3) {
                            this.field566[this.field562] += 10;
                            this.field565[this.field562] += 5;
                        }
                        if (this.field393 == 0 && var19.field734 == 4) {
                            this.field567[this.field562] = 60;
                        }
                        if (this.field393 == 0 && var19.field734 == 5) {
                            this.field566[this.field562] += 5;
                        }
                    }
                }
                if (var19.field691 > field572) {
                    this.method177(-267, var19, var19.field739 + 15);
                    if (this.field262 > -1) {
                        int var24 = var19.field692 * 30 / var19.field693;
                        if (var24 > 30) {
                            var24 = 30;
                        }
                        class24.method245(this.field263 - 3, 65280, this.field262 - 15, false, var24, 5);
                        class24.method245(this.field263 - 3, 16711680, this.field262 - 15 + var24, false, 30 - var24, 5);
                    }
                }
                for (int var25 = 0; var25 < 4; ++var25) {
                    if (var19.field698[var25] > field572) {
                        this.method177(-267, var19, var19.field739 / 2);
                        if (this.field262 > -1) {
                            if (var25 == 1) {
                                this.field263 -= 20;
                            }
                            if (var25 == 2) {
                                this.field262 -= 15;
                                this.field263 -= 10;
                            }
                            if (var25 == 3) {
                                this.field262 += 15;
                                this.field263 -= 10;
                            }
                            this.field384[var19.field697[var25]].method340(this.field263 - 12, false, this.field262 - 12);
                            this.field636.method271(String.valueOf(var19.field696[var25]), false, 0, this.field263 + 4, this.field262);
                            this.field636.method271(String.valueOf(var19.field696[var25]), false, 16777215, this.field263 + 3, this.field262 - 1);
                        }
                    }
                }
            }
        }
        for (int var3 = 0; var3 < this.field562; ++var3) {
            int var4 = this.field564[var3];
            int var5 = this.field565[var3];
            int var6 = this.field567[var3];
            int var7 = this.field566[var3];
            boolean var8 = true;
            while (var8) {
                var8 = false;
                for (int var18 = 0; var18 < var3; ++var18) {
                    if (var5 + 2 > this.field565[var18] - this.field566[var18] && var5 - var7 < this.field565[var18] + 2 && var4 - var6 < this.field567[var18] + this.field564[var18] && var4 + var6 > this.field564[var18] - this.field567[var18] && this.field565[var18] - this.field566[var18] < var5) {
                        var5 = this.field565[var18] - this.field566[var18];
                        var8 = true;
                    }
                }
            }
            this.field262 = this.field564[var3];
            this.field263 = this.field565[var3] = var5;
            String var9 = this.field571[var3];
            if (this.field393 == 0) {
                int var10 = 16776960;
                if (this.field568[var3] < 6) {
                    var10 = this.field214[this.field568[var3]];
                }
                if (this.field568[var3] == 6) {
                    var10 = this.field559 % 20 < 10 ? 16711680 : 16776960;
                }
                if (this.field568[var3] == 7) {
                    var10 = this.field559 % 20 < 10 ? 255 : 65535;
                }
                if (this.field568[var3] == 8) {
                    var10 = this.field559 % 20 < 10 ? 45056 : 8454016;
                }
                if (this.field568[var3] == 9) {
                    int var11 = 150 - this.field570[var3];
                    if (var11 < 50) {
                        var10 = var11 * 1280 + 16711680;
                    } else if (var11 < 100) {
                        var10 = 16776960 - (var11 - 50) * 327680;
                    } else if (var11 < 150) {
                        var10 = (var11 - 100) * 5 + 65280;
                    }
                }
                if (this.field568[var3] == 10) {
                    int var12 = 150 - this.field570[var3];
                    if (var12 < 50) {
                        var10 = var12 * 5 + 16711680;
                    } else if (var12 < 100) {
                        var10 = 16711935 - (var12 - 50) * 327680;
                    } else if (var12 < 150) {
                        var10 = (var12 - 100) * 327680 + 255 - (var12 - 100) * 5;
                    }
                }
                if (this.field568[var3] == 11) {
                    int var13 = 150 - this.field570[var3];
                    if (var13 < 50) {
                        var10 = 16777215 - var13 * 327685;
                    } else if (var13 < 100) {
                        var10 = (var13 - 50) * 327685 + 65280;
                    } else if (var13 < 150) {
                        var10 = 16777215 - (var13 - 100) * 327680;
                    }
                }
                if (this.field569[var3] == 0) {
                    this.field638.method271(var9, false, 0, this.field263 + 1, this.field262);
                    this.field638.method271(var9, false, var10, this.field263, this.field262);
                }
                if (this.field569[var3] == 1) {
                    this.field638.method276(0, this.field559, (byte) -46, this.field262, var9, this.field263 + 1);
                    this.field638.method276(var10, this.field559, (byte) -46, this.field262, var9, this.field263);
                }
                if (this.field569[var3] == 2) {
                    this.field638.method277(var9, this.field262, true, 0, this.field559, this.field263 + 1);
                    this.field638.method277(var9, this.field262, true, var10, this.field559, this.field263);
                }
                if (this.field569[var3] == 3) {
                    this.field638.method278(this.field263 + 1, this.field559, var9, this.field262, 0, 150 - this.field570[var3], (byte) 3);
                    this.field638.method278(this.field263, this.field559, var9, this.field262, var10, 150 - this.field570[var3], (byte) 3);
                }
                if (this.field569[var3] == 4) {
                    int var14 = this.field638.method274(var9, 219);
                    int var15 = (150 - this.field570[var3]) * (var14 + 100) / 150;
                    class24.method242((byte) -90, this.field262 - 50, 334, 0, this.field262 + 50);
                    this.field638.method275(this.field263 + 1, this.field262 + 50 - var15, 0, var9, (byte) 6);
                    this.field638.method275(this.field263, this.field262 + 50 - var15, var10, var9, (byte) 6);
                    class24.method241(-652);
                }
                if (this.field569[var3] == 5) {
                    int var16 = 150 - this.field570[var3];
                    int var17 = 0;
                    if (var16 < 25) {
                        var17 = var16 - 25;
                    } else if (var16 > 125) {
                        var17 = var16 - 125;
                    }
                    class24.method242((byte) -90, 0, this.field263 + 5, this.field263 - this.field638.field1024 - 1, 512);
                    this.field638.method271(var9, false, 0, this.field263 + 1 + var17, this.field262);
                    this.field638.method271(var9, false, var10, this.field263 + var17, this.field262);
                    class24.method241(-652);
                }
            } else {
                this.field638.method271(var9, false, 0, this.field263 + 1, this.field262);
                this.field638.method271(var9, false, 16776960, this.field263, this.field262);
            }
        }
        if (arg0 != 27355) {
            this.field359 = null;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LXGRGMPUQ;BI)V")
    public final void method78(class69 arg0, byte arg1, int arg2) {
        if (arg1 == 5) {
            boolean var4 = false;
            if (arg2 == 45) {
                int var5 = arg0.method484(-241);
                int var6 = var5 >> 2;
                int var7 = var5 & 3;
                int var8 = this.field322[var6];
                int var9 = arg0.method485(this.field207);
                int var10 = (var9 >> 4 & 7) + this.field554;
                int var11 = (var9 & 7) + this.field555;
                if (var10 >= 0 && var11 >= 0 && var10 < 104 && var11 < 104) {
                    this.method100(-1, var6, this.field405, var10, var11, (byte) 2, 0, -1, var7, var8);
                }
            } else if (arg2 == 196) {
                int var12 = arg0.method467();
                int var13 = arg0.method493(0);
                int var14 = arg0.method492(0);
                int var15 = arg0.method485(this.field207);
                int var16 = (var15 >> 4 & 7) + this.field554;
                int var17 = (var15 & 7) + this.field555;
                if (var16 >= 0 && var17 >= 0 && var16 < 104 && var17 < 104 && this.field284 != var12) {
                    class51 var18 = new class51();
                    var18.field1280 = var14;
                    var18.field1279 = var13;
                    if (this.field359[this.field405][var16][var17] == null) {
                        this.field359[this.field405][var16][var17] = new class60((byte) 0);
                    }
                    this.field359[this.field405][var16][var17].method358(var18);
                    this.method74(var16, var17);
                }
            } else {
                if (arg2 == 157) {
                    int var19 = arg0.method491(455);
                    int var20 = arg0.method492(0);
                    byte var21 = arg0.method466();
                    byte var22 = arg0.method487(0);
                    byte var23 = arg0.method487(0);
                    int var24 = arg0.method492(0);
                    int var25 = arg0.method483(-270);
                    int var26 = (var25 >> 4 & 7) + this.field554;
                    int var27 = (var25 & 7) + this.field555;
                    byte var28 = arg0.method486(false);
                    int var29 = arg0.method493(0);
                    int var30 = arg0.method465();
                    int var31 = var30 >> 2;
                    int var32 = var30 & 3;
                    int var33 = this.field322[var31];
                    class48 var34;
                    if (this.field284 == var19) {
                        var34 = field178;
                    } else {
                        var34 = this.field575[var19];
                    }
                    if (var34 != null) {
                        class8 var35 = class8.method30(var24);
                        int var36 = this.field170[this.field405][var26][var27];
                        int var37 = this.field170[this.field405][var26 + 1][var27];
                        int var38 = this.field170[this.field405][var26 + 1][var27 + 1];
                        int var39 = this.field170[this.field405][var26][var27 + 1];
                        class66 var40 = var35.method27(var31, var32, var36, var37, var38, var39, -1);
                        if (var40 != null) {
                            this.method100(-1, 0, this.field405, var26, var27, (byte) 2, var20 + 1, var29 + 1, 0, var33);
                            var34.field1242 = field572 + var20;
                            var34.field1243 = field572 + var29;
                            var34.field1235 = var40;
                            int var41 = var35.field97;
                            int var42 = var35.field118;
                            if (var32 == 1 || var32 == 3) {
                                var41 = var35.field118;
                                var42 = var35.field97;
                            }
                            var34.field1232 = var26 * 128 + var41 * 64;
                            var34.field1234 = var27 * 128 + var42 * 64;
                            var34.field1233 = this.method95(var34.field1232, var34.field1234, this.field405, -738);
                            if (var22 > var28) {
                                byte var43 = var22;
                                var22 = var28;
                                var28 = var43;
                            }
                            if (var23 > var21) {
                                byte var44 = var23;
                                var23 = var21;
                                var21 = var44;
                            }
                            var34.field1224 = var22 + var26;
                            var34.field1226 = var26 + var28;
                            var34.field1225 = var23 + var27;
                            var34.field1227 = var21 + var27;
                        }
                    }
                }
                if (arg2 == 81) {
                    int var45 = arg0.method465();
                    int var46 = (var45 >> 4 & 7) + this.field554;
                    int var47 = (var45 & 7) + this.field555;
                    int var48 = arg0.method467();
                    int var49 = arg0.method467();
                    int var50 = arg0.method467();
                    if (var46 >= 0 && var47 >= 0 && var46 < 104 && var47 < 104) {
                        class60 var51 = this.field359[this.field405][var46][var47];
                        if (var51 != null) {
                            for (class51 var52 = (class51) var51.method361(); var52 != null; var52 = (class51) var51.method363(this.field512)) {
                                if ((var48 & 32767) == var52.field1280 && var52.field1279 == var49) {
                                    var52.field1279 = var50;
                                    break;
                                }
                            }
                            this.method74(var46, var47);
                        }
                    }
                } else if (arg2 == 163) {
                    int var53 = arg0.method467();
                    int var54 = arg0.method484(-241);
                    int var55 = (var54 >> 4 & 7) + this.field554;
                    int var56 = (var54 & 7) + this.field555;
                    int var57 = arg0.method484(-241);
                    int var58 = var57 >> 2;
                    int var59 = var57 & 3;
                    int var60 = this.field322[var58];
                    if (var55 >= 0 && var56 >= 0 && var55 < 103 && var56 < 103) {
                        int var61 = this.field170[this.field405][var55][var56];
                        int var62 = this.field170[this.field405][var55 + 1][var56];
                        int var63 = this.field170[this.field405][var55 + 1][var56 + 1];
                        int var64 = this.field170[this.field405][var55][var56 + 1];
                        if (var60 == 0) {
                            class39 var65 = this.field441.method524(var56, this.field405, var55, 870);
                            if (var65 != null) {
                                int var66 = var65.field1136 >> 14 & 32767;
                                if (var58 == 2) {
                                    var65.field1134 = new class5(var63, var61, var66, var62, false, 2, 0, var59 + 4, var53, var64);
                                    var65.field1135 = new class5(var63, var61, var66, var62, false, 2, 0, var59 + 1 & 3, var53, var64);
                                } else {
                                    var65.field1134 = new class5(var63, var61, var66, var62, false, var58, 0, var59, var53, var64);
                                }
                            }
                        }
                        if (var60 == 1) {
                            class47 var67 = this.field441.method525(6, this.field405, var55, var56);
                            if (var67 != null) {
                                var67.field1212 = new class5(var63, var61, var67.field1213 >> 14 & 32767, var62, false, 4, 0, 0, var53, var64);
                            }
                        }
                        if (var60 == 2) {
                            class32 var68 = this.field441.method526(4, var56, this.field405, var55);
                            if (var58 == 11) {
                                var58 = 10;
                            }
                            if (var68 != null) {
                                var68.field959 = new class5(var63, var61, var68.field967 >> 14 & 32767, var62, false, var58, 0, var59, var53, var64);
                            }
                        }
                        if (var60 == 3) {
                            class61 var69 = this.field441.method527(var56, false, this.field405, var55);
                            if (var69 != null) {
                                var69.field1343 = new class5(var63, var61, var69.field1344 >> 14 & 32767, var62, false, 22, 0, var59, var53, var64);
                            }
                        }
                    }
                } else if (arg2 != 12) {
                    if (arg2 == 129) {
                        int var76 = arg0.method492(0);
                        int var77 = arg0.method493(0);
                        int var78 = arg0.method465();
                        int var79 = (var78 >> 4 & 7) + this.field554;
                        int var80 = (var78 & 7) + this.field555;
                        if (var79 >= 0 && var80 >= 0 && var79 < 104 && var80 < 104) {
                            class51 var81 = new class51();
                            var81.field1280 = var77;
                            var81.field1279 = var76;
                            if (this.field359[this.field405][var79][var80] == null) {
                                this.field359[this.field405][var79][var80] = new class60((byte) 0);
                            }
                            this.field359[this.field405][var79][var80].method358(var81);
                            this.method74(var79, var80);
                        }
                    } else {
                        if (arg2 == 237) {
                            int var82 = arg0.method465();
                            int var83 = (var82 >> 4 & 7) + this.field554;
                            int var84 = (var82 & 7) + this.field555;
                            int var85 = arg0.method467();
                            int var86 = arg0.method465();
                            int var87 = var86 >> 4 & 15;
                            int var88 = var86 & 7;
                            if (field178.field711[0] >= var83 - var87 && field178.field711[0] <= var83 + var87 && field178.field712[0] >= var84 - var87 && field178.field712[0] <= var84 + var87 && this.field480 && !field471 && this.field268 < 50) {
                                this.field269[this.field268] = var85;
                                this.field216[this.field268] = var88;
                                this.field358[this.field268] = class53.field1292[var85];
                                ++this.field268;
                            }
                        }
                        if (arg2 == 143) {
                            int var89 = arg0.method465();
                            int var90 = (var89 >> 4 & 7) + this.field554;
                            int var91 = (var89 & 7) + this.field555;
                            int var92 = var90 + arg0.method466();
                            int var93 = var91 + arg0.method466();
                            int var94 = arg0.method468();
                            int var95 = arg0.method467();
                            int var96 = arg0.method465() * 4;
                            int var97 = arg0.method465() * 4;
                            int var98 = arg0.method467();
                            int var99 = arg0.method467();
                            int var100 = arg0.method465();
                            int var101 = arg0.method465();
                            if (var90 >= 0 && var91 >= 0 && var90 < 104 && var91 < 104 && var92 >= 0 && var93 >= 0 && var92 < 104 && var93 < 104 && var95 != 65535) {
                                int var102 = var90 * 128 + 64;
                                int var103 = var91 * 128 + 64;
                                int var104 = var92 * 128 + 64;
                                int var105 = var93 * 128 + 64;
                                class12 var106 = new class12(var102, this.method95(var102, var103, this.field405, -738) - var96, var100, 9330, field572 + var99, var101, var94, var97, this.field405, field572 + var98, var95, var103);
                                var106.method189(var104, this.method95(var104, var105, this.field405, -738) - var97, field572 + var98, false, var105);
                                this.field462.method358(var106);
                            }
                        } else if (arg2 == 180) {
                            int var107 = arg0.method465();
                            int var108 = (var107 >> 4 & 7) + this.field554;
                            int var109 = (var107 & 7) + this.field555;
                            int var110 = arg0.method467();
                            int var111 = arg0.method465();
                            int var112 = arg0.method467();
                            if (var108 >= 0 && var109 >= 0 && var108 < 104 && var109 < 104) {
                                int var113 = var108 * 128 + 64;
                                int var114 = var109 * 128 + 64;
                                class19 var115 = new class19(this.field405, 680, var114, field572, var113, var112, this.method95(var113, var114, this.field405, -738) - var111, var110);
                                this.field305.method358(var115);
                            }
                        } else if (arg2 == 68) {
                            int var116 = arg0.method467();
                            int var117 = arg0.method465();
                            int var118 = var117 >> 2;
                            int var119 = var117 & 3;
                            int var120 = this.field322[var118];
                            int var121 = arg0.method483(-270);
                            int var122 = (var121 >> 4 & 7) + this.field554;
                            int var123 = (var121 & 7) + this.field555;
                            if (var122 >= 0 && var123 >= 0 && var122 < 104 && var123 < 104) {
                                this.method100(var116, var118, this.field405, var122, var123, (byte) 2, 0, -1, var119, var120);
                            }
                        }
                    }
                } else {
                    int var70 = arg0.method485(this.field207);
                    int var71 = (var70 >> 4 & 7) + this.field554;
                    int var72 = (var70 & 7) + this.field555;
                    int var73 = arg0.method492(0);
                    if (var71 >= 0 && var72 >= 0 && var71 < 104 && var72 < 104) {
                        class60 var74 = this.field359[this.field405][var71][var72];
                        if (var74 != null) {
                            for (class51 var75 = (class51) var74.method361(); var75 != null; var75 = (class51) var74.method363(this.field512)) {
                                if ((var73 & 32767) == var75.field1280) {
                                    var75.method334();
                                    break;
                                }
                            }
                            if (var74.method361() == null) {
                                this.field359[this.field405][var71][var72] = null;
                            }
                            this.method74(var71, var72);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BILXGRGMPUQ;)V")
    private final void method79(byte arg0, int arg1, class69 arg2) {
        this.field556 = 0;
        this.field578 = 0;
        this.method88(arg2, 3, arg1);
        if (arg0 == 5) {
            this.method89((byte) 3, arg2, arg1);
            this.method70(arg1, arg2, 55);
            for (int var4 = 0; var4 < this.field556; ++var4) {
                int var6 = this.field557[var4];
                if (field572 != this.field193[var6].field682) {
                    this.field193[var6].field671 = null;
                    this.field193[var6] = null;
                }
            }
            if (arg2.field1652 != arg1) {
                signlink.reporterror(this.field437 + " size mismatch in getnpcpos - pos:" + arg2.field1652 + " psize:" + arg1);
                throw new RuntimeException("eek");
            } else {
                for (int var5 = 0; var5 < this.field194; ++var5) {
                    if (this.field193[this.field195[var5]] == null) {
                        signlink.reporterror(this.field437 + " null entry in npc list - pos:" + var5 + " size:" + this.field194);
                        throw new RuntimeException("eek");
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "n", descriptor = "(I)V")
    public final void method80(int arg0) {
        class12 var2 = (class12) this.field462.method361();
        int var3 = 52 / arg0;
        while (var2 != null) {
            if (this.field405 == var2.field659 && field572 <= var2.field643) {
                if (field572 >= var2.field642) {
                    if (var2.field663 > 0) {
                        class13 var4 = this.field193[var2.field663 - 1];
                        if (var4 != null && var4.field731 >= 0 && var4.field731 < 13312 && var4.field732 >= 0 && var4.field732 < 13312) {
                            var2.method189(var4.field731, this.method95(var4.field731, var4.field732, var2.field659, -738) - var2.field651, field572, false, var4.field732);
                        }
                    }
                    if (var2.field663 < 0) {
                        int var5 = -var2.field663 - 1;
                        class48 var6;
                        if (this.field284 == var5) {
                            var6 = field178;
                        } else {
                            var6 = this.field575[var5];
                        }
                        if (var6 != null && var6.field731 >= 0 && var6.field731 < 13312 && var6.field732 >= 0 && var6.field732 < 13312) {
                            var2.method189(var6.field731, this.method95(var6.field731, var6.field732, var2.field659, -738) - var2.field651, field572, false, var6.field732);
                        }
                    }
                    var2.method190(this.field452, -416);
                    this.field441.method513(this.field300, (int) var2.field644, (int) var2.field646, 60, -1, (int) var2.field645, this.field405, var2, var2.field656, false);
                }
            } else {
                var2.method334();
            }
            var2 = (class12) this.field462.method363(this.field512);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "()V")
    public final void method81() {
        this.method142(20, "Starting up", 9);
        if (signlink.sunjava) {
            super.field755 = 5;
        }
        if (field286) {
            this.field392 = true;
        } else {
            field286 = true;
            boolean var1 = false;
            String var2 = this.method185((byte) 10);
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
            if (var2.endsWith("127.0.0.1")) {
                var1 = true;
            }
            if (!var1) {
                this.field329 = true;
            } else {
                if (signlink.cache_dat != null) {
                    for (int var3 = 0; var3 < 5; ++var3) {
                        this.field631[var3] = new class25((byte) -113, 500000, signlink.cache_idx[var3], signlink.cache_dat, var3 + 1);
                    }
                }
                try {
                    this.method176(field507);
                    this.field290 = this.method163(25, this.field597[1], true, "title", 1, "title screen");
                    this.field636 = new class34("p11_full", false, this.field290, false);
                    this.field637 = new class34("p12_full", false, this.field290, false);
                    this.field638 = new class34("b12_full", false, this.field290, false);
                    this.field639 = new class34("q8_full", false, this.field290, true);
                    this.method72(true);
                    this.method175((byte) 8);
                    class44 var4 = this.method163(30, this.field597[2], true, "config", 2, "config");
                    class44 var5 = this.method163(35, this.field597[3], true, "interface", 3, "interface");
                    class44 var6 = this.method163(40, this.field597[4], true, "media", 4, "2d graphics");
                    class44 var7 = this.method163(45, this.field597[6], true, "textures", 6, "textures");
                    class44 var8 = this.method163(50, this.field597[7], true, "wordenc", 7, "chat system");
                    class44 var9 = this.method163(55, this.field597[8], true, "sounds", 8, "sound effects");
                    this.field218 = new byte[4][104][104];
                    this.field170 = new int[4][105][105];
                    this.field441 = new class70(104, this.field170, (byte) -68, 4, 104);
                    for (int var10 = 0; var10 < 4; ++var10) {
                        this.field361[var10] = new class21(104, 104, -44659);
                    }
                    this.field273 = new class55(512, 512);
                    class44 var11 = this.method163(60, this.field597[5], true, "versionlist", 5, "update list");
                    this.method142(60, "Connecting to update server", 9);
                    this.field241 = new class37();
                    this.field241.method306(var11, this);
                    class2.method7(this.field241.method308(false));
                    class66.method404(this.field241.method303(0, field304), this.field241);
                    if (!field471) {
                        this.field353 = 0;
                        this.field354 = true;
                        this.field241.method297(2, this.field353);
                        while (this.field241.method302() > 0) {
                            this.method139((byte) 2);
                            try {
                                Thread.sleep(100L);
                            } catch (Exception var71) {
                            }
                            if (this.field241.field1077 > 3) {
                                this.method147("ondemand");
                                return;
                            }
                        }
                    }
                    this.method142(65, "Requesting animations", 9);
                    int var12 = this.field241.method303(1, field304);
                    for (int var13 = 0; var13 < var12; ++var13) {
                        this.field241.method297(1, var13);
                    }
                    while (this.field241.method302() > 0) {
                        int var14 = var12 - this.field241.method302();
                        if (var14 > 0) {
                            this.method142(65, "Loading animations - " + var14 * 100 / var12 + "%", 9);
                        }
                        this.method139((byte) 2);
                        try {
                            Thread.sleep(100L);
                        } catch (Exception var70) {
                        }
                        if (this.field241.field1077 > 3) {
                            this.method147("ondemand");
                            return;
                        }
                    }
                    this.method142(70, "Requesting models", 9);
                    int var15 = this.field241.method303(0, field304);
                    for (int var16 = 0; var16 < var15; ++var16) {
                        int var17 = this.field241.method294(var16, field599);
                        if ((var17 & 1) != 0) {
                            this.field241.method297(0, var16);
                        }
                    }
                    int var18 = this.field241.method302();
                    while (this.field241.method302() > 0) {
                        int var19 = var18 - this.field241.method302();
                        if (var19 > 0) {
                            this.method142(70, "Loading models - " + var19 * 100 / var18 + "%", 9);
                        }
                        this.method139((byte) 2);
                        try {
                            Thread.sleep(100L);
                        } catch (Exception var69) {
                        }
                    }
                    if (this.field631[0] != null) {
                        this.method142(75, "Requesting maps", 9);
                        this.field241.method297(3, this.field241.method299(47, 48, -704, 0));
                        this.field241.method297(3, this.field241.method299(47, 48, -704, 1));
                        this.field241.method297(3, this.field241.method299(48, 48, -704, 0));
                        this.field241.method297(3, this.field241.method299(48, 48, -704, 1));
                        this.field241.method297(3, this.field241.method299(49, 48, -704, 0));
                        this.field241.method297(3, this.field241.method299(49, 48, -704, 1));
                        this.field241.method297(3, this.field241.method299(47, 47, -704, 0));
                        this.field241.method297(3, this.field241.method299(47, 47, -704, 1));
                        this.field241.method297(3, this.field241.method299(48, 47, -704, 0));
                        this.field241.method297(3, this.field241.method299(48, 47, -704, 1));
                        this.field241.method297(3, this.field241.method299(48, 148, -704, 0));
                        this.field241.method297(3, this.field241.method299(48, 148, -704, 1));
                        int var20 = this.field241.method302();
                        while (this.field241.method302() > 0) {
                            int var21 = var20 - this.field241.method302();
                            if (var21 > 0) {
                                this.method142(75, "Loading maps - " + var21 * 100 / var20 + "%", 9);
                            }
                            this.method139((byte) 2);
                            try {
                                Thread.sleep(100L);
                            } catch (Exception var68) {
                            }
                        }
                    }
                    int var22 = this.field241.method303(0, field304);
                    for (int var23 = 0; var23 < var22; ++var23) {
                        int var24 = this.field241.method294(var23, field599);
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
                            this.field241.method300(0, var25, var23, 161);
                        }
                    }
                    this.field241.method304(field470, (byte) 84);
                    if (!field471) {
                        int var26 = this.field241.method303(2, field304);
                        for (int var27 = 1; var27 < var26; ++var27) {
                            if (this.field241.method291(var27, (byte) -72)) {
                                this.field241.method300(2, (byte) 1, var27, 161);
                            }
                        }
                    }
                    this.method142(80, "Unpacking media", 9);
                    this.field412 = new class63(var6, "invback", 0);
                    this.field414 = new class63(var6, "chatback", 0);
                    this.field413 = new class63(var6, "mapback", 0);
                    this.field314 = new class63(var6, "backbase1", 0);
                    this.field315 = new class63(var6, "backbase2", 0);
                    this.field316 = new class63(var6, "backhmid1", 0);
                    for (int var28 = 0; var28 < 13; ++var28) {
                        this.field350[var28] = new class63(var6, "sideicons", var28);
                    }
                    this.field463 = new class55(var6, "compass", 0);
                    this.field275 = new class55(var6, "mapedge", 0);
                    this.field275.method337(18860);
                    for (int var29 = 0; var29 < 72; ++var29) {
                        this.field586[var29] = new class63(var6, "mapscene", var29);
                    }
                    for (int var30 = 0; var30 < 63; ++var30) {
                        this.field474[var30] = new class55(var6, "mapfunction", var30);
                    }
                    for (int var31 = 0; var31 < 5; ++var31) {
                        this.field384[var31] = new class55(var6, "hitmarks", var31);
                    }
                    for (int var32 = 0; var32 < 6; ++var32) {
                        this.field296[var32] = new class55(var6, "headicons_pk", var32);
                    }
                    for (int var33 = 0; var33 < 9; ++var33) {
                        this.field331[var33] = new class55(var6, "headicons_prayer", var33);
                    }
                    for (int var34 = 0; var34 < 6; ++var34) {
                        this.field473[var34] = new class55(var6, "headicons_hint", var34);
                    }
                    this.field386 = new class55(var6, "overlay_multiway", 0);
                    this.field416 = new class55(var6, "mapmarker", 0);
                    this.field417 = new class55(var6, "mapmarker", 1);
                    for (int var35 = 0; var35 < 8; ++var35) {
                        this.field598[var35] = new class55(var6, "cross", var35);
                    }
                    this.field497 = new class55(var6, "mapdots", 0);
                    this.field498 = new class55(var6, "mapdots", 1);
                    this.field499 = new class55(var6, "mapdots", 2);
                    this.field500 = new class55(var6, "mapdots", 3);
                    this.field501 = new class55(var6, "mapdots", 4);
                    this.field297 = new class63(var6, "scrollbar", 0);
                    this.field298 = new class63(var6, "scrollbar", 1);
                    this.field307 = new class63(var6, "redstone1", 0);
                    this.field308 = new class63(var6, "redstone2", 0);
                    this.field309 = new class63(var6, "redstone3", 0);
                    this.field310 = new class63(var6, "redstone1", 0);
                    this.field310.method371(0);
                    this.field311 = new class63(var6, "redstone2", 0);
                    this.field311.method371(0);
                    this.field344 = new class63(var6, "redstone1", 0);
                    this.field344.method372((byte) 8);
                    this.field345 = new class63(var6, "redstone2", 0);
                    this.field345.method372((byte) 8);
                    this.field346 = new class63(var6, "redstone3", 0);
                    this.field346.method372((byte) 8);
                    this.field347 = new class63(var6, "redstone1", 0);
                    this.field347.method371(0);
                    this.field347.method372((byte) 8);
                    this.field348 = new class63(var6, "redstone2", 0);
                    this.field348.method371(0);
                    this.field348.method372((byte) 8);
                    for (int var36 = 0; var36 < 2; ++var36) {
                        this.field380[var36] = new class63(var6, "mod_icons", var36);
                    }
                    class55 var37 = new class55(var6, "backleft1", 0);
                    this.field522 = new class10(var37.field1309, this.method107(4), false, var37.field1308);
                    var37.method338(0, 0, 936);
                    class55 var38 = new class55(var6, "backleft2", 0);
                    this.field523 = new class10(var38.field1309, this.method107(4), false, var38.field1308);
                    var38.method338(0, 0, 936);
                    class55 var39 = new class55(var6, "backright1", 0);
                    this.field524 = new class10(var39.field1309, this.method107(4), false, var39.field1308);
                    var39.method338(0, 0, 936);
                    class55 var40 = new class55(var6, "backright2", 0);
                    this.field525 = new class10(var40.field1309, this.method107(4), false, var40.field1308);
                    var40.method338(0, 0, 936);
                    class55 var41 = new class55(var6, "backtop1", 0);
                    this.field526 = new class10(var41.field1309, this.method107(4), false, var41.field1308);
                    var41.method338(0, 0, 936);
                    class55 var42 = new class55(var6, "backvmid1", 0);
                    this.field527 = new class10(var42.field1309, this.method107(4), false, var42.field1308);
                    var42.method338(0, 0, 936);
                    class55 var43 = new class55(var6, "backvmid2", 0);
                    this.field528 = new class10(var43.field1309, this.method107(4), false, var43.field1308);
                    var43.method338(0, 0, 936);
                    class55 var44 = new class55(var6, "backvmid3", 0);
                    this.field529 = new class10(var44.field1309, this.method107(4), false, var44.field1308);
                    var44.method338(0, 0, 936);
                    class55 var45 = new class55(var6, "backhmid2", 0);
                    this.field530 = new class10(var45.field1309, this.method107(4), false, var45.field1308);
                    var45.method338(0, 0, 936);
                    int var46 = (int) (Math.random() * 21.0D) - 10;
                    int var47 = (int) (Math.random() * 21.0D) - 10;
                    int var48 = (int) (Math.random() * 21.0D) - 10;
                    int var49 = (int) (Math.random() * 41.0D) - 20;
                    for (int var50 = 0; var50 < 100; ++var50) {
                        if (this.field474[var50] != null) {
                            this.field474[var50].method336(var48 + var49, true, var46 + var49, var47 + var49);
                        }
                        if (this.field586[var50] != null) {
                            this.field586[var50].method373(var48 + var49, true, var46 + var49, var47 + var49);
                        }
                    }
                    this.method142(83, "Unpacking textures", 9);
                    class64.method381(var7, 133);
                    class64.method385(0.8D, (byte) 5);
                    class64.method380(20, 833);
                    this.method142(86, "Unpacking config", 9);
                    class45.method318(true, var4);
                    class8.method26(var4);
                    class50.method324(true, var4);
                    class22.method227(var4);
                    class33.method266(var4);
                    class7.method17(true, var4);
                    class6.method14(true, var4);
                    class36.method286(true, var4);
                    class23.method238(true, var4);
                    class22.field837 = field470;
                    if (!field471) {
                        this.method142(90, "Unpacking sounds", 9);
                        byte[] var51 = var9.method317("sounds.dat", (byte[]) null);
                        class69 var52 = new class69(var51, -82);
                        class53.method328(true, var52);
                    }
                    this.method142(95, "Unpacking interfaces", 9);
                    class34[] var53 = new class34[] { this.field636, this.field637, this.field638, this.field639 };
                    class65.method401(var6, var5, var53, (byte) 119);
                    this.method142(100, "Preparing game engine", 9);
                    for (int var54 = 0; var54 < 33; ++var54) {
                        int var55 = 999;
                        int var56 = 0;
                        for (int var57 = 0; var57 < 34; ++var57) {
                            if (this.field413.field1355[this.field413.field1357 * var54 + var57] == 0) {
                                if (var55 == 999) {
                                    var55 = var57;
                                }
                            } else if (var55 != 999) {
                                var56 = var57;
                                break;
                            }
                        }
                        this.field370[var54] = var55;
                        this.field245[var54] = var56 - var55;
                    }
                    for (int var58 = 5; var58 < 156; ++var58) {
                        int var59 = 999;
                        int var60 = 0;
                        for (int var61 = 25; var61 < 172; ++var61) {
                            if (this.field413.field1355[this.field413.field1357 * var58 + var61] == 0 && (var61 > 34 || var58 > 34)) {
                                if (var59 == 999) {
                                    var59 = var61;
                                }
                            } else if (var59 != 999) {
                                var60 = var61;
                                break;
                            }
                        }
                        this.field612[var58 - 5] = var59 - 25;
                        this.field623[var58 - 5] = var60 - var59;
                    }
                    class64.method378(503, 4, 765);
                    this.field431 = class64.field1378;
                    class64.method378(96, 4, 479);
                    this.field428 = class64.field1378;
                    class64.method378(261, 4, 190);
                    this.field429 = class64.field1378;
                    class64.method378(334, 4, 512);
                    this.field430 = class64.field1378;
                    int[] var62 = new int[9];
                    for (int var63 = 0; var63 < 9; ++var63) {
                        int var64 = var63 * 32 + 128 + 15;
                        int var65 = var64 * 3 + 600;
                        int var66 = class64.field1376[var64];
                        var62[var63] = var65 * var66 >> 16;
                    }
                    class70.method538(var62, 800, 512, -708, 334, 500);
                    class72.method561(var8);
                    this.field533 = new class52(this, (byte) -116);
                    this.method47(this.field533, 10);
                    class5.field49 = this;
                    class8.field88 = this;
                    class33.field976 = this;
                } catch (Exception var72) {
                    signlink.reporterror("loaderror " + this.field330 + " " + this.field219);
                    this.field433 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IILXGRGMPUQ;)V")
    private final void method82(int arg0, int arg1, class69 arg2) {
        while (true) {
            if (arg2.field1653 + 10 < arg1 * 8) {
                int var4 = arg2.method476(11, 0);
                if (var4 != 2047) {
                    if (this.field575[var4] == null) {
                        this.field575[var4] = new class48();
                        if (this.field580[var4] != null) {
                            this.field575[var4].method322((byte) -104, this.field580[var4]);
                        }
                    }
                    this.field577[this.field576++] = var4;
                    class48 var5 = this.field575[var4];
                    var5.field682 = field572;
                    int var6 = arg2.method476(5, 0);
                    if (var6 > 15) {
                        var6 -= 32;
                    }
                    int var7 = arg2.method476(1, 0);
                    if (var7 == 1) {
                        this.field579[this.field578++] = var4;
                    }
                    int var8 = arg2.method476(1, 0);
                    int var9 = arg2.method476(5, 0);
                    if (var9 > 15) {
                        var9 -= 32;
                    }
                    var5.method199(true, var8 == 1, field178.field712[0] + var6, field178.field711[0] + var9);
                    continue;
                }
            }
            arg2.method477(-22110);
            if (arg0 != -49893) {
                this.field359 = null;
                return;
            }
            return;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIILVYAVYWNE;I)V")
    public final void method83(int arg0, int arg1, int arg2, class65 arg3, int arg4) {
        if (arg3.field1462 == 0 && arg3.field1437 != null) {
            if (!arg3.field1465 || this.field629 == arg3.field1398 || this.field292 == arg3.field1398 || this.field472 == arg3.field1398) {
                int var6 = class24.field902;
                int var7 = class24.field900;
                int var8 = class24.field903;
                int var9 = class24.field901;
                class24.method242((byte) -90, arg0, arg3.field1416 + arg4, arg4, arg3.field1408 + arg0);
                if (arg1 < 6 || arg1 > 6) {
                    for (int var10 = 1; var10 > 0; ++var10) {
                    }
                }
                int var11 = arg3.field1437.length;
                for (int var12 = 0; var12 < var11; ++var12) {
                    int var13 = arg3.field1411[var12] + arg0;
                    int var14 = arg3.field1450[var12] + arg4 - arg2;
                    class65 var15 = class65.method395(arg3.field1437[var12]);
                    int var16 = var15.field1404 + var13;
                    int var17 = var15.field1415 + var14;
                    if (var15.field1454 > 0) {
                        this.method119(var15, (byte) 3);
                    }
                    if (var15.field1462 == 0) {
                        if (var15.field1463 > var15.field1396 - var15.field1416) {
                            var15.field1463 = var15.field1396 - var15.field1416;
                        }
                        if (var15.field1463 < 0) {
                            var15.field1463 = 0;
                        }
                        this.method83(var16, 6, var15.field1463, var15, var17);
                        if (var15.field1396 > var15.field1416) {
                            this.method169(var15.field1396, var15.field1463, var15.field1416, (byte) 8, var15.field1408 + var16, var17);
                        }
                    } else if (var15.field1462 != 1) {
                        if (var15.field1462 == 2) {
                            int var18 = 0;
                            for (int var19 = 0; var19 < var15.field1416; ++var19) {
                                for (int var20 = 0; var20 < var15.field1408; ++var20) {
                                    int var21 = (var15.field1442 + 32) * var20 + var16;
                                    int var22 = (var15.field1464 + 32) * var19 + var17;
                                    if (var18 < 20) {
                                        var21 += var15.field1427[var18];
                                        var22 += var15.field1399[var18];
                                    }
                                    if (var15.field1431[var18] <= 0) {
                                        if (var15.field1400 != null && var18 < 20) {
                                            class55 var31 = var15.field1400[var18];
                                            if (var31 != null) {
                                                var31.method340(var22, false, var21);
                                            }
                                        }
                                    } else {
                                        int var23 = 0;
                                        int var24 = 0;
                                        int var25 = var15.field1431[var18] - 1;
                                        if (var21 > class24.field902 - 32 && var21 < class24.field903 && var22 > class24.field900 - 32 && var22 < class24.field901 || this.field162 != 0 && this.field161 == var18) {
                                            int var26 = 0;
                                            if (this.field233 == 1 && this.field234 == var18 && this.field235 == var15.field1398) {
                                                var26 = 16777215;
                                            }
                                            class55 var27 = class22.method229(var25, (byte) 0, var26, var15.field1395[var18]);
                                            if (var27 != null) {
                                                if (this.field162 != 0 && this.field161 == var18 && this.field160 == var15.field1398) {
                                                    var23 = super.field769 - this.field163;
                                                    var24 = super.field770 - this.field164;
                                                    if (var23 < 5 && var23 > -5) {
                                                        var23 = 0;
                                                    }
                                                    if (var24 < 5 && var24 > -5) {
                                                        var24 = 0;
                                                    }
                                                    if (this.field280 < 5) {
                                                        var23 = 0;
                                                        var24 = 0;
                                                    }
                                                    var27.method342(var22 + var24, 156, var21 + var23, 128);
                                                    if (var22 + var24 < class24.field900 && arg3.field1463 > 0) {
                                                        int var28 = (class24.field900 - var22 - var24) * this.field452 / 3;
                                                        if (var28 > this.field452 * 10) {
                                                            var28 = this.field452 * 10;
                                                        }
                                                        if (var28 > arg3.field1463) {
                                                            var28 = arg3.field1463;
                                                        }
                                                        arg3.field1463 -= var28;
                                                        this.field164 += var28;
                                                    }
                                                    if (var22 + var24 + 32 > class24.field901 && arg3.field1463 < arg3.field1396 - arg3.field1416) {
                                                        int var29 = (var22 + var24 + 32 - class24.field901) * this.field452 / 3;
                                                        if (var29 > this.field452 * 10) {
                                                            var29 = this.field452 * 10;
                                                        }
                                                        if (var29 > arg3.field1396 - arg3.field1416 - arg3.field1463) {
                                                            var29 = arg3.field1396 - arg3.field1416 - arg3.field1463;
                                                        }
                                                        arg3.field1463 += var29;
                                                        this.field164 -= var29;
                                                    }
                                                } else if (this.field422 != 0 && this.field421 == var18 && this.field420 == var15.field1398) {
                                                    var27.method342(var22, 156, var21, 128);
                                                } else {
                                                    var27.method340(var22, false, var21);
                                                }
                                                if (var27.field1312 == 33 || var15.field1395[var18] != 1) {
                                                    int var30 = var15.field1395[var18];
                                                    this.field636.method275(var22 + 10 + var24, var21 + 1 + var23, 0, method155(0, var30), (byte) 6);
                                                    this.field636.method275(var22 + 9 + var24, var21 + var23, 16776960, method155(0, var30), (byte) 6);
                                                }
                                            }
                                        }
                                    }
                                    ++var18;
                                }
                            }
                        } else if (var15.field1462 == 3) {
                            boolean var32 = false;
                            if (this.field472 == var15.field1398 || this.field292 == var15.field1398 || this.field629 == var15.field1398) {
                                var32 = true;
                            }
                            int var33;
                            if (this.method99(var15, (byte) 7)) {
                                var33 = var15.field1421;
                                if (var32 && var15.field1435 != 0) {
                                    var33 = var15.field1435;
                                }
                            } else {
                                var33 = var15.field1452;
                                if (var32 && var15.field1453 != 0) {
                                    var33 = var15.field1453;
                                }
                            }
                            if (var15.field1393 == 0) {
                                if (var15.field1394) {
                                    class24.method245(var17, var33, var16, false, var15.field1408, var15.field1416);
                                } else {
                                    class24.method246(false, var33, var17, var15.field1408, var16, var15.field1416);
                                }
                            } else if (var15.field1394) {
                                class24.method244(var33, var16, 256 - (var15.field1393 & 255), -774, var15.field1408, var15.field1416, var17);
                            } else {
                                class24.method247(256 - (var15.field1393 & 255), var17, false, var33, var16, var15.field1408, var15.field1416);
                            }
                        } else if (var15.field1462 == 4) {
                            class34 var34 = var15.field1447;
                            String var35 = var15.field1413;
                            boolean var36 = false;
                            if (this.field472 == var15.field1398 || this.field292 == var15.field1398 || this.field629 == var15.field1398) {
                                var36 = true;
                            }
                            int var37;
                            if (this.method99(var15, (byte) 7)) {
                                var37 = var15.field1421;
                                if (var36 && var15.field1435 != 0) {
                                    var37 = var15.field1435;
                                }
                                if (var15.field1455.length() > 0) {
                                    var35 = var15.field1455;
                                }
                            } else {
                                var37 = var15.field1452;
                                if (var36 && var15.field1453 != 0) {
                                    var37 = var15.field1453;
                                }
                            }
                            if (var15.field1420 == 6 && this.field287) {
                                var35 = "Please wait...";
                                var37 = var15.field1452;
                            }
                            if (class24.field898 == 479) {
                                if (var37 == 16776960) {
                                    var37 = 255;
                                }
                                if (var37 == 49152) {
                                    var37 = 16777215;
                                }
                            }
                            int var38 = var34.field1024 + var17;
                            while (var35.length() > 0) {
                                if (var35.indexOf("%") != -1) {
                                    label389: while (true) {
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
                                                                            break label389;
                                                                        }
                                                                        var35 = var35.substring(0, var43) + this.method159((byte) -56, this.method104(false, 4, var15)) + var35.substring(var43 + 2);
                                                                    }
                                                                }
                                                                var35 = var35.substring(0, var42) + this.method159((byte) -56, this.method104(false, 3, var15)) + var35.substring(var42 + 2);
                                                            }
                                                        }
                                                        var35 = var35.substring(0, var41) + this.method159((byte) -56, this.method104(false, 2, var15)) + var35.substring(var41 + 2);
                                                    }
                                                }
                                                var35 = var35.substring(0, var40) + this.method159((byte) -56, this.method104(false, 1, var15)) + var35.substring(var40 + 2);
                                            }
                                        }
                                        var35 = var35.substring(0, var39) + this.method159((byte) -56, this.method104(false, 0, var15)) + var35.substring(var39 + 2);
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
                                if (var15.field1424) {
                                    var34.method272(var15.field1408 / 2 + var16, var38, var45, var37, var15.field1438, 0);
                                } else {
                                    var34.method279(0, var45, var16, var37, var15.field1438, var38);
                                }
                                var38 += var34.field1024;
                            }
                        } else if (var15.field1462 == 5) {
                            class55 var46;
                            if (this.method99(var15, (byte) 7)) {
                                var46 = var15.field1434;
                            } else {
                                var46 = var15.field1457;
                            }
                            if (var46 != null) {
                                var46.method340(var17, false, var16);
                            }
                        } else if (var15.field1462 == 6) {
                            int var47 = class64.field1372;
                            int var48 = class64.field1373;
                            class64.field1372 = var15.field1408 / 2 + var16;
                            class64.field1373 = var15.field1416 / 2 + var17;
                            int var49 = class64.field1376[var15.field1418] * var15.field1417 >> 16;
                            int var50 = class64.field1377[var15.field1418] * var15.field1417 >> 16;
                            boolean var51 = this.method99(var15, (byte) 7);
                            int var52;
                            if (var51) {
                                var52 = var15.field1402;
                            } else {
                                var52 = var15.field1401;
                            }
                            class66 var53;
                            if (var52 == -1) {
                                var53 = var15.method393(-1, var51, -1, 2);
                            } else {
                                class45 var54 = class45.field1187[var52];
                                var53 = var15.method393(var54.field1189[var15.field1451], var51, var54.field1190[var15.field1451], 2);
                            }
                            if (var53 != null) {
                                var53.method427(0, var15.field1419, 0, var15.field1418, 0, var49, var50);
                            }
                            class64.field1372 = var47;
                            class64.field1373 = var48;
                        } else {
                            if (var15.field1462 == 7) {
                                class34 var55 = var15.field1447;
                                int var56 = 0;
                                for (int var57 = 0; var57 < var15.field1416; ++var57) {
                                    for (int var58 = 0; var58 < var15.field1408; ++var58) {
                                        if (var15.field1431[var56] > 0) {
                                            class22 var59 = class22.method237(var15.field1431[var56] - 1);
                                            String var60 = var59.field848;
                                            if (var59.field842 || var15.field1395[var56] != 1) {
                                                var60 = var60 + " x" + method86(var15.field1395[var56], -40187);
                                            }
                                            int var61 = (var15.field1442 + 115) * var58 + var16;
                                            int var62 = (var15.field1464 + 12) * var57 + var17;
                                            if (var15.field1424) {
                                                var55.method272(var15.field1408 / 2 + var61, var62, var60, var15.field1452, var15.field1438, 0);
                                            } else {
                                                var55.method279(0, var60, var61, var15.field1452, var15.field1438, var62);
                                            }
                                        }
                                        ++var56;
                                    }
                                }
                            }
                            if (var15.field1462 == 8 && (this.field401 == var15.field1398 || this.field246 == var15.field1398 || this.field283 == var15.field1398) && this.field196 == 100) {
                                int var63 = 0;
                                int var64 = 0;
                                class34 var65 = this.field637;
                                String var66 = var15.field1413;
                                while (var66.length() > 0) {
                                    int var73 = var66.indexOf("\\n");
                                    String var74;
                                    if (var73 != -1) {
                                        var74 = var66.substring(0, var73);
                                        var66 = var66.substring(var73 + 2);
                                    } else {
                                        var74 = var66;
                                        var66 = "";
                                    }
                                    int var75 = var65.method273(false, var74);
                                    if (var75 > var63) {
                                        var63 = var75;
                                    }
                                    var64 += var65.field1024 + 1;
                                }
                                var63 += 6;
                                var64 += 7;
                                int var67 = var15.field1408 + var16 - 5 - var63;
                                int var68 = var15.field1416 + var17 + 5;
                                if (var67 < var16 + 5) {
                                    var67 = var16 + 5;
                                }
                                if (var63 + var67 > arg3.field1408 + arg0) {
                                    var67 = arg3.field1408 + arg0 - var63;
                                }
                                class24.method245(var68, 16777120, var67, false, var63, var64);
                                class24.method246(false, 0, var68, var63, var67, var64);
                                String var69 = var15.field1413;
                                int var70 = var65.field1024 + var68 + 2;
                                while (var69.length() > 0) {
                                    int var71 = var69.indexOf("\\n");
                                    String var72;
                                    if (var71 != -1) {
                                        var72 = var69.substring(0, var71);
                                        var69 = var69.substring(var71 + 2);
                                    } else {
                                        var72 = var69;
                                        var69 = "";
                                    }
                                    var65.method279(0, var72, var67 + 3, 0, false, var70);
                                    var70 += var65.field1024 + 1;
                                }
                            }
                        }
                    }
                }
                class24.method242((byte) -90, var6, var9, var7, var8);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LPDMJJHOP;BII)V")
    public final void method84(class55 arg0, byte arg1, int arg2, int arg3) {
        if (arg1 != -103) {
            this.method81();
        }
        int var5 = arg2 * arg2 + arg3 * arg3;
        if (var5 > 4225 && var5 < 90000) {
            int var6 = this.field372 + this.field257 & 2047;
            int var7 = class66.field1542[var6];
            int var8 = class66.field1543[var6];
            int var9 = var7 * 256 / (this.field378 + 256);
            int var10 = var8 * 256 / (this.field378 + 256);
            int var11 = arg2 * var10 + arg3 * var9 >> 16;
            int var12 = arg3 * var10 - arg2 * var9 >> 16;
            double var13 = Math.atan2((double) var11, (double) var12);
            int var15 = (int) (Math.sin(var13) * 63.0D);
            int var16 = (int) (Math.cos(var13) * 57.0D);
            this.field275.method345(83 - var16 - 20, 20, var15 + 94 + 4 - 10, 15, 256, true, var13, 20, 15);
        } else {
            this.method117(arg0, arg3, (byte) -26, arg2);
        }
    }

    @OriginalMember(owner = "client", name = "init", descriptor = "()V")
    public final void init() {
        field468 = Integer.parseInt(this.getParameter("nodeid"));
        field469 = Integer.parseInt(this.getParameter("portoff"));
        String var1 = this.getParameter("lowmem");
        if (var1 != null && var1.equals("1")) {
            method46(-34690);
        } else {
            method49(-693);
        }
        String var2 = this.getParameter("free");
        if (var2 != null && var2.equals("1")) {
            field470 = false;
        } else {
            field470 = true;
        }
        this.method208(766, 503, 765);
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(II)Z")
    public final boolean method85(int arg0, int arg1) {
        if (arg0 != 8) {
            this.field359 = null;
        }
        if (arg1 < 0) {
            return false;
        } else {
            int var3 = this.field627[arg1];
            if (var3 >= 2000) {
                var3 -= 2000;
            }
            return var3 == 678;
        }
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(II)Ljava/lang/String;")
    private static final String method86(int arg0, int arg1) {
        if (arg1 != -40187) {
            field179 = -337;
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

    @OriginalMember(owner = "client", name = "g", descriptor = "(B)V")
    public final void method87(byte arg0) {
        short var2 = 256;
        for (int var3 = 10; var3 < 117; ++var3) {
            int var18 = (int) (Math.random() * 100.0D);
            if (var18 < 50) {
                this.field242[(var2 - 2 << 7) + var3] = 255;
            }
        }
        for (int var4 = 0; var4 < 100; ++var4) {
            int var15 = (int) (Math.random() * 124.0D) + 2;
            int var16 = (int) (Math.random() * 128.0D) + 128;
            int var17 = (var16 << 7) + var15;
            this.field242[var17] = 192;
        }
        for (int var5 = 1; var5 < var2 - 1; ++var5) {
            for (int var13 = 1; var13 < 127; ++var13) {
                int var14 = (var5 << 7) + var13;
                this.field243[var14] = (this.field242[var14 - 1] + this.field242[var14 + 1] + this.field242[var14 - 128] + this.field242[var14 + 128]) / 4;
            }
        }
        if (arg0 != 58) {
            this.field190 = !this.field190;
        }
        this.field337 += 128;
        if (this.field337 > this.field476.length) {
            this.field337 -= this.field476.length;
            int var6 = (int) (Math.random() * 12.0D);
            this.method122(this.field510[var6], 40149);
        }
        for (int var7 = 1; var7 < var2 - 1; ++var7) {
            for (int var10 = 1; var10 < 127; ++var10) {
                int var11 = (var7 << 7) + var10;
                int var12 = this.field243[var11 + 128] - this.field476[this.field337 + var11 & this.field476.length - 1] / 5;
                if (var12 < 0) {
                    var12 = 0;
                }
                this.field242[var11] = var12;
            }
        }
        for (int var8 = 0; var8 < var2 - 1; ++var8) {
            this.field482[var8] = this.field482[var8 + 1];
        }
        this.field482[var2 - 1] = (int) (Math.sin((double) field572 / 14.0D) * 16.0D + Math.sin((double) field572 / 15.0D) * 14.0D + Math.sin((double) field572 / 16.0D) * 12.0D);
        if (this.field362 > 0) {
            this.field362 -= 4;
        }
        if (this.field363 > 0) {
            this.field363 -= 4;
        }
        if (this.field362 == 0 && this.field363 == 0) {
            int var9 = (int) (Math.random() * 2000.0D);
            if (var9 == 0) {
                this.field362 = 1024;
            }
            if (var9 == 1) {
                this.field363 = 1024;
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LXGRGMPUQ;II)V")
    private final void method88(class69 arg0, int arg1, int arg2) {
        if (arg1 < 3 || arg1 > 3) {
            this.field359 = null;
        }
        arg0.method475(-998);
        int var4 = arg0.method476(8, 0);
        if (var4 < this.field194) {
            for (int var5 = var4; var5 < this.field194; ++var5) {
                this.field557[this.field556++] = this.field195[var5];
            }
        }
        if (var4 > this.field194) {
            signlink.reporterror(this.field437 + " Too many npcs");
            throw new RuntimeException("eek");
        } else {
            this.field194 = 0;
            for (int var6 = 0; var6 < var4; ++var6) {
                int var7 = this.field195[var6];
                class13 var8 = this.field193[var7];
                int var9 = arg0.method476(1, 0);
                if (var9 == 0) {
                    this.field195[this.field194++] = var7;
                    var8.field682 = field572;
                } else {
                    int var10 = arg0.method476(2, 0);
                    if (var10 == 0) {
                        this.field195[this.field194++] = var7;
                        var8.field682 = field572;
                        this.field579[this.field578++] = var7;
                    } else if (var10 == 1) {
                        this.field195[this.field194++] = var7;
                        var8.field682 = field572;
                        int var11 = arg0.method476(3, 0);
                        var8.method197(var11, false, -19255);
                        int var12 = arg0.method476(1, 0);
                        if (var12 == 1) {
                            this.field579[this.field578++] = var7;
                        }
                    } else if (var10 == 2) {
                        this.field195[this.field194++] = var7;
                        var8.field682 = field572;
                        int var13 = arg0.method476(3, 0);
                        var8.method197(var13, true, -19255);
                        int var14 = arg0.method476(3, 0);
                        var8.method197(var14, true, -19255);
                        int var15 = arg0.method476(1, 0);
                        if (var15 == 1) {
                            this.field579[this.field578++] = var7;
                        }
                    } else if (var10 == 3) {
                        this.field557[this.field556++] = var7;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BLXGRGMPUQ;I)V")
    private final void method89(byte arg0, class69 arg1, int arg2) {
        while (true) {
            if (arg1.field1653 + 21 < arg2 * 8) {
                int var4 = arg1.method476(14, 0);
                if (var4 != 16383) {
                    if (this.field193[var4] == null) {
                        this.field193[var4] = new class13();
                    }
                    class13 var5 = this.field193[var4];
                    this.field195[this.field194++] = var4;
                    var5.field682 = field572;
                    var5.field671 = class33.method267(arg1.method476(13, 0));
                    int var6 = arg1.method476(1, 0);
                    int var7 = arg1.method476(1, 0);
                    if (var7 == 1) {
                        this.field579[this.field578++] = var4;
                    }
                    int var8 = arg1.method476(5, 0);
                    if (var8 > 15) {
                        var8 -= 32;
                    }
                    int var9 = arg1.method476(5, 0);
                    if (var9 > 15) {
                        var9 -= 32;
                    }
                    var5.field694 = var5.field671.field975;
                    var5.field727 = var5.field671.field987;
                    var5.field699 = var5.field671.field1001;
                    var5.field700 = var5.field671.field989;
                    var5.field701 = var5.field671.field969;
                    var5.field702 = var5.field671.field985;
                    var5.field736 = var5.field671.field998;
                    var5.method199(true, var6 == 1, field178.field712[0] + var8, field178.field711[0] + var9);
                    continue;
                }
            }
            arg1.method477(-22110);
            if (arg0 != 3) {
                this.field415.method455(137);
                return;
            }
            return;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IB)V")
    public final void method90(int arg0, byte arg1) {
        if (arg0 >= 0) {
            if (this.field588 != 0) {
                this.field588 = 0;
                this.field338 = true;
            }
            int var3 = this.field625[arg0];
            int var4 = this.field626[arg0];
            int var5 = this.field627[arg0];
            int var6 = this.field628[arg0];
            if (arg1 != 51) {
                this.field424 = this.field232.method465();
            }
            if (var5 >= 2000) {
                var5 -= 2000;
            }
            if (var5 == 818 && !this.field287) {
                this.field415.method454(4, 36);
                this.field415.method456(var4);
                this.field287 = true;
            }
            if (var5 == 178 || var5 == 830) {
                String var7 = this.field581[arg0];
                int var8 = var7.indexOf("@whi@");
                if (var8 != -1) {
                    String var9 = var7.substring(var8 + 5).trim();
                    String var10 = class11.method41(class11.method38(this.field487, class11.method37(var9)), 42484);
                    boolean var11 = false;
                    for (int var12 = 0; var12 < this.field576; ++var12) {
                        class48 var13 = this.field575[this.field577[var12]];
                        if (var13 != null && var13.field1239 != null && var13.field1239.equalsIgnoreCase(var10)) {
                            this.method102(var13.field712[0], this.field244, 1, 0, 2, 1, field178.field711[0], 0, false, var13.field711[0], field178.field712[0], 0);
                            if (var5 == 178) {
                                this.field415.method454(4, 59);
                                this.field415.method456(this.field577[var12]);
                            }
                            if (var5 == 830) {
                                this.field415.method454(4, 212);
                                this.field415.method488(this.field577[var12], 41364);
                            }
                            var11 = true;
                            break;
                        }
                    }
                    if (!var11) {
                        this.method133(1, 0, "", "Unable to find " + var10);
                    }
                }
            }
            if (var5 == 157) {
                class13 var14 = this.field193[var6];
                if (var14 != null) {
                    this.method102(var14.field712[0], this.field244, 1, 0, 2, 1, field178.field711[0], 0, false, var14.field711[0], field178.field712[0], 0);
                    this.field445 = super.field776;
                    this.field446 = super.field777;
                    this.field448 = 2;
                    this.field447 = 0;
                    this.field415.method454(4, 98);
                    this.field415.method456(var6);
                }
            }
            if (var5 == 1205) {
                class22 var15 = class22.method237(var6);
                class65 var16 = class65.method395(var4);
                String var17;
                if (var16 != null && var16.field1395[var3] >= 100000) {
                    var17 = var16.field1395[var3] + " x " + var15.field848;
                } else if (var15.field874 != null) {
                    var17 = new String(var15.field874);
                } else {
                    var17 = "It's a " + var15.field848 + ".";
                }
                this.method133(1, 0, "", var17);
            }
            if (var5 == 453) {
                boolean var18 = this.method102(var4, this.field244, 0, 0, 2, 0, field178.field711[0], 0, false, var3, field178.field712[0], 0);
                if (!var18) {
                    this.method102(var4, this.field244, 1, 0, 2, 1, field178.field711[0], 0, false, var3, field178.field712[0], 0);
                }
                this.field445 = super.field776;
                this.field446 = super.field777;
                this.field448 = 2;
                this.field447 = 0;
                this.field415.method454(4, 196);
                this.field415.method456(var6);
                this.field415.method490(-302, this.field253);
                this.field415.method456(this.field465 + var4);
                this.field415.method489(this.field464 + var3, 1);
            }
            if (var5 == 708) {
                class13 var20 = this.field193[var6];
                if (var20 != null) {
                    this.method102(var20.field712[0], this.field244, 1, 0, 2, 1, field178.field711[0], 0, false, var20.field711[0], field178.field712[0], 0);
                    this.field445 = super.field776;
                    this.field446 = super.field777;
                    this.field448 = 2;
                    this.field447 = 0;
                    ++field360;
                    if (field360 >= 103) {
                        this.field415.method454(4, 99);
                        this.field415.method455(180);
                        field360 = 0;
                    }
                    this.field415.method454(4, 100);
                    this.field415.method489(var6, 1);
                }
            }
            if (var5 == 1802) {
                this.method98(var4, (byte) 4, var3, var6);
                this.field415.method454(4, 245);
                this.field415.method490(-302, this.field464 + var3);
                this.field415.method490(-302, var6 >> 14 & 32767);
                this.field415.method490(-302, this.field465 + var4);
            }
            if (var5 == 36) {
                this.field415.method454(4, 216);
                this.field415.method456(var6);
                this.field415.method489(var4, 1);
                this.field415.method488(var3, 41364);
                this.field419 = 0;
                this.field420 = var4;
                this.field421 = var3;
                this.field422 = 2;
                if (class65.method395(var4).field1391 == this.field391) {
                    this.field422 = 1;
                }
                if (class65.method395(var4).field1391 == this.field475) {
                    this.field422 = 3;
                }
            }
            if (var5 == 821) {
                this.method160(-156);
            }
            if (var5 == 1918) {
                class22 var21 = class22.method237(var6);
                String var22;
                if (var21.field874 != null) {
                    var22 = new String(var21.field874);
                } else {
                    var22 = "It's a " + var21.field848 + ".";
                }
                this.method133(1, 0, "", var22);
            }
            if (var5 == 330) {
                boolean var23 = this.method102(var4, this.field244, 0, 0, 2, 0, field178.field711[0], 0, false, var3, field178.field712[0], 0);
                if (!var23) {
                    this.method102(var4, this.field244, 1, 0, 2, 1, field178.field711[0], 0, false, var3, field178.field712[0], 0);
                }
                this.field445 = super.field776;
                this.field446 = super.field777;
                this.field448 = 2;
                this.field447 = 0;
                this.field415.method454(4, 37);
                this.field415.method490(-302, this.field464 + var3);
                this.field415.method488(var6, 41364);
                this.field415.method489(this.field465 + var4, 1);
            }
            if (var5 == 214) {
                class65 var25 = class65.method395(var4);
                boolean var26 = true;
                if (var25.field1454 > 0) {
                    var26 = this.method172(true, var25);
                }
                if (var26) {
                    this.field415.method454(4, 27);
                    this.field415.method456(var4);
                }
            }
            if (var5 == 916) {
                boolean var27 = this.method102(var4, this.field244, 0, 0, 2, 0, field178.field711[0], 0, false, var3, field178.field712[0], 0);
                if (!var27) {
                    this.method102(var4, this.field244, 1, 0, 2, 1, field178.field711[0], 0, false, var3, field178.field712[0], 0);
                }
                this.field445 = super.field776;
                this.field446 = super.field777;
                this.field448 = 2;
                this.field447 = 0;
                this.field415.method454(4, 227);
                this.field415.method488(var6, 41364);
                this.field415.method490(-302, this.field464 + var3);
                this.field415.method456(this.field465 + var4);
            }
            if (var5 == 675) {
                boolean var29 = this.method102(var4, this.field244, 0, 0, 2, 0, field178.field711[0], 0, false, var3, field178.field712[0], 0);
                if (!var29) {
                    this.method102(var4, this.field244, 1, 0, 2, 1, field178.field711[0], 0, false, var3, field178.field712[0], 0);
                }
                this.field445 = super.field776;
                this.field446 = super.field777;
                this.field448 = 2;
                this.field447 = 0;
                this.field415.method454(4, 103);
                this.field415.method488(this.field464 + var3, 41364);
                this.field415.method488(this.field234, 41364);
                this.field415.method456(this.field235);
                this.field415.method456(this.field465 + var4);
                this.field415.method456(var6);
                this.field415.method490(-302, this.field236);
            }
            if (var5 == 1958) {
                class13 var31 = this.field193[var6];
                if (var31 != null) {
                    class33 var32 = var31.field671;
                    if (var32.field971 != null) {
                        var32 = var32.method262((byte) 9);
                    }
                    if (var32 != null) {
                        String var33;
                        if (var32.field1008 != null) {
                            var33 = new String(var32.field1008);
                        } else {
                            var33 = "It's a " + var32.field988 + ".";
                        }
                        this.method133(1, 0, "", var33);
                    }
                }
            }
            if (var5 == 843) {
                class48 var34 = this.field575[var6];
                if (var34 != null) {
                    this.method102(var34.field712[0], this.field244, 1, 0, 2, 1, field178.field711[0], 0, false, var34.field711[0], field178.field712[0], 0);
                    this.field445 = super.field776;
                    this.field446 = super.field777;
                    this.field448 = 2;
                    this.field447 = 0;
                    this.field415.method454(4, 130);
                    this.field415.method456(this.field253);
                    this.field415.method488(var6, 41364);
                }
            }
            if (var5 == 940) {
                class48 var35 = this.field575[var6];
                if (var35 != null) {
                    this.method102(var35.field712[0], this.field244, 1, 0, 2, 1, field178.field711[0], 0, false, var35.field711[0], field178.field712[0], 0);
                    this.field445 = super.field776;
                    this.field446 = super.field777;
                    this.field448 = 2;
                    this.field447 = 0;
                    this.field415.method454(4, 212);
                    this.field415.method488(var6, 41364);
                }
            }
            if (var5 == 1836) {
                int var36 = var6 >> 14 & 32767;
                class8 var37 = class8.method30(var36);
                String var38;
                if (var37.field132 != null) {
                    var38 = new String(var37.field132);
                } else {
                    var38 = "It's a " + var37.field119 + ".";
                }
                this.method133(1, 0, "", var38);
            }
            if (var5 == 31) {
                class13 var39 = this.field193[var6];
                if (var39 != null) {
                    this.method102(var39.field712[0], this.field244, 1, 0, 2, 1, field178.field711[0], 0, false, var39.field711[0], field178.field712[0], 0);
                    this.field445 = super.field776;
                    this.field446 = super.field777;
                    this.field448 = 2;
                    this.field447 = 0;
                    this.field415.method454(4, 184);
                    this.field415.method490(-302, var6);
                    this.field415.method490(-302, this.field253);
                }
            }
            if (var5 == 73) {
                this.field415.method454(4, 87);
                this.field415.method456(var6);
                this.field415.method489(var3, 1);
                this.field415.method490(-302, var4);
                this.field419 = 0;
                this.field420 = var4;
                this.field421 = var3;
                this.field422 = 2;
                if (class65.method395(var4).field1391 == this.field391) {
                    this.field422 = 1;
                }
                if (class65.method395(var4).field1391 == this.field475) {
                    this.field422 = 3;
                }
            }
            if (var5 == 705) {
                this.field415.method454(4, 205);
                this.field415.method456(var4);
                this.field415.method490(-302, var3);
                this.field415.method488(var6, 41364);
                this.field419 = 0;
                this.field420 = var4;
                this.field421 = var3;
                this.field422 = 2;
                if (class65.method395(var4).field1391 == this.field391) {
                    this.field422 = 1;
                }
                if (class65.method395(var4).field1391 == this.field475) {
                    this.field422 = 3;
                }
            }
            if (var5 == 109) {
                this.method98(var4, (byte) 4, var3, var6);
                this.field415.method454(4, 201);
                this.field415.method490(-302, var6 >> 14 & 32767);
                this.field415.method488(this.field465 + var4, 41364);
                this.field415.method488(this.field464 + var3, 41364);
            }
            if (var5 == 477) {
                this.field415.method454(4, 171);
                this.field415.method456(var4);
                this.field415.method488(var6, 41364);
                this.field415.method489(var3, 1);
                this.field419 = 0;
                this.field420 = var4;
                this.field421 = var3;
                this.field422 = 2;
                if (class65.method395(var4).field1391 == this.field391) {
                    this.field422 = 1;
                }
                if (class65.method395(var4).field1391 == this.field475) {
                    this.field422 = 3;
                }
            }
            if (var5 == 657) {
                this.field415.method454(4, 88);
                this.field415.method488(var3, 41364);
                this.field415.method488(var4, 41364);
                this.field415.method488(var6, 41364);
                this.field415.method488(this.field253, 41364);
                this.field419 = 0;
                this.field420 = var4;
                this.field421 = var3;
                this.field422 = 2;
                if (class65.method395(var4).field1391 == this.field391) {
                    this.field422 = 1;
                }
                if (class65.method395(var4).field1391 == this.field475) {
                    this.field422 = 3;
                }
            }
            if (var5 == 576) {
                class48 var40 = this.field575[var6];
                if (var40 != null) {
                    this.method102(var40.field712[0], this.field244, 1, 0, 2, 1, field178.field711[0], 0, false, var40.field711[0], field178.field712[0], 0);
                    this.field445 = super.field776;
                    this.field446 = super.field777;
                    this.field448 = 2;
                    this.field447 = 0;
                    this.field415.method454(4, 79);
                    this.field415.method488(var6, 41364);
                }
            }
            if (var5 == 277) {
                this.field415.method454(4, 131);
                this.field415.method488(var3, 41364);
                this.field415.method488(var6, 41364);
                this.field415.method456(var4);
                this.field419 = 0;
                this.field420 = var4;
                this.field421 = var3;
                this.field422 = 2;
                if (class65.method395(var4).field1391 == this.field391) {
                    this.field422 = 1;
                }
                if (class65.method395(var4).field1391 == this.field475) {
                    this.field422 = 3;
                }
            }
            if (var5 == 726) {
                String var41 = this.field581[arg0];
                int var42 = var41.indexOf("@whi@");
                if (var42 != -1) {
                    if (this.field391 == -1) {
                        this.method160(-156);
                        this.field335 = var41.substring(var42 + 5).trim();
                        this.field595 = false;
                        this.field550 = this.field391 = class65.field1456;
                    } else {
                        this.method133(1, 0, "", "Please close the interface you have open before using 'report abuse'");
                    }
                }
            }
            if (var5 == 529) {
                this.method43(this.field339, 0);
                this.field339 = -1;
                this.field338 = true;
            }
            if (var5 == 534) {
                class48 var43 = this.field575[var6];
                if (var43 != null) {
                    this.method102(var43.field712[0], this.field244, 1, 0, 2, 1, field178.field711[0], 0, false, var43.field711[0], field178.field712[0], 0);
                    this.field445 = super.field776;
                    this.field446 = super.field777;
                    this.field448 = 2;
                    this.field447 = 0;
                    field187 += var6;
                    if (field187 >= 145) {
                        this.field415.method454(4, 19);
                        this.field415.method459(0);
                        field187 = 0;
                    }
                    this.field415.method454(4, 78);
                    this.field415.method490(-302, var6);
                }
            }
            if (var5 == 144) {
                String var44 = this.field581[arg0];
                int var45 = var44.indexOf("@whi@");
                if (var45 != -1) {
                    long var46 = class11.method37(var44.substring(var45 + 5).trim());
                    int var48 = -1;
                    for (int var49 = 0; var49 < this.field183; ++var49) {
                        if (this.field230[var49] == var46) {
                            var48 = var49;
                            break;
                        }
                    }
                    if (var48 != -1 && this.field278[var48] > 0) {
                        this.field338 = true;
                        this.field588 = 0;
                        this.field561 = true;
                        this.field490 = "";
                        this.field185 = 3;
                        this.field222 = this.field230[var48];
                        this.field606 = "Enter message to send to " + this.field521[var48];
                    }
                }
            }
            if (var5 == 982) {
                class13 var50 = this.field193[var6];
                if (var50 != null) {
                    this.method102(var50.field712[0], this.field244, 1, 0, 2, 1, field178.field711[0], 0, false, var50.field711[0], field178.field712[0], 0);
                    this.field445 = super.field776;
                    this.field446 = super.field777;
                    this.field448 = 2;
                    this.field447 = 0;
                    field610 += var6;
                    if (field610 >= 116) {
                        this.field415.method454(4, 69);
                        field610 = 0;
                    }
                    this.field415.method454(4, 235);
                    this.field415.method490(-302, var6);
                }
            }
            if (var5 == 34) {
                this.field415.method454(4, 93);
                this.field415.method489(var3, 1);
                this.field415.method488(var6, 41364);
                this.field415.method456(var4);
                this.field419 = 0;
                this.field420 = var4;
                this.field421 = var3;
                this.field422 = 2;
                if (class65.method395(var4).field1391 == this.field391) {
                    this.field422 = 1;
                }
                if (class65.method395(var4).field1391 == this.field475) {
                    this.field422 = 3;
                }
            }
            if (var5 == 332) {
                this.field233 = 1;
                this.field234 = var3;
                this.field235 = var4;
                this.field236 = var6;
                this.field237 = class22.method237(var6).field848;
                this.field252 = 0;
                this.field515 = true;
            } else {
                if (var5 == 168) {
                    class13 var51 = this.field193[var6];
                    if (var51 != null) {
                        this.method102(var51.field712[0], this.field244, 1, 0, 2, 1, field178.field711[0], 0, false, var51.field711[0], field178.field712[0], 0);
                        this.field445 = super.field776;
                        this.field446 = super.field777;
                        this.field448 = 2;
                        this.field447 = 0;
                        if ((var6 & 3) == 0) {
                            ++field630;
                        }
                        if (field630 >= 84) {
                            this.field415.method454(4, 39);
                            this.field415.method458(6583216);
                            field630 = 0;
                        }
                        this.field415.method454(4, 53);
                        this.field415.method490(-302, var6);
                    }
                }
                if (var5 == 790) {
                    boolean var52 = this.method102(var4, this.field244, 0, 0, 2, 0, field178.field711[0], 0, false, var3, field178.field712[0], 0);
                    if (!var52) {
                        this.method102(var4, this.field244, 1, 0, 2, 1, field178.field711[0], 0, false, var3, field178.field712[0], 0);
                    }
                    this.field445 = super.field776;
                    this.field446 = super.field777;
                    this.field448 = 2;
                    this.field447 = 0;
                    this.field415.method454(4, 94);
                    this.field415.method490(-302, this.field464 + var3);
                    this.field415.method488(this.field465 + var4, 41364);
                    this.field415.method488(var6, 41364);
                }
                if (var5 == 228) {
                    boolean var54 = this.method102(var4, this.field244, 0, 0, 2, 0, field178.field711[0], 0, false, var3, field178.field712[0], 0);
                    if (!var54) {
                        this.method102(var4, this.field244, 1, 0, 2, 1, field178.field711[0], 0, false, var3, field178.field712[0], 0);
                    }
                    this.field445 = super.field776;
                    this.field446 = super.field777;
                    this.field448 = 2;
                    this.field447 = 0;
                    if ((var3 & 3) == 0) {
                        ++field591;
                    }
                    if (field591 >= 93) {
                        this.field415.method454(4, 22);
                        this.field415.method458(4706572);
                        field591 = 0;
                    }
                    this.field415.method454(4, 1);
                    this.field415.method489(this.field464 + var3, 1);
                    this.field415.method456(this.field465 + var4);
                    this.field415.method488(var6, 41364);
                }
                if (var5 == 363) {
                    this.field415.method454(4, 43);
                    this.field415.method489(var6, 1);
                    this.field415.method456(var3);
                    this.field415.method456(var4);
                    this.field419 = 0;
                    this.field420 = var4;
                    this.field421 = var3;
                    this.field422 = 2;
                    if (class65.method395(var4).field1391 == this.field391) {
                        this.field422 = 1;
                    }
                    if (class65.method395(var4).field1391 == this.field475) {
                        this.field422 = 3;
                    }
                }
                if (var5 == 211) {
                    this.field415.method454(4, 27);
                    this.field415.method456(var4);
                    class65 var56 = class65.method395(var4);
                    if (var56.field1423 != null && var56.field1423[0][0] == 5) {
                        int var57 = var56.field1423[0][1];
                        if (this.field320[var57] != var56.field1430[0]) {
                            this.field320[var57] = var56.field1430[0];
                            this.method73(var57, 5);
                            this.field515 = true;
                        }
                    }
                }
                if (var5 == 854) {
                    class65 var58 = class65.method395(var4);
                    this.field252 = 1;
                    this.field253 = var4;
                    this.field254 = var58.field1425;
                    this.field233 = 0;
                    this.field515 = true;
                    String var59 = var58.field1403;
                    if (var59.indexOf(" ") != -1) {
                        var59 = var59.substring(0, var59.indexOf(" "));
                    }
                    String var60 = var58.field1403;
                    if (var60.indexOf(" ") != -1) {
                        var60 = var60.substring(var60.indexOf(" ") + 1);
                    }
                    this.field255 = var59 + " " + var58.field1443 + " " + var60;
                    if (this.field254 == 16) {
                        this.field515 = true;
                        this.field443 = 3;
                        this.field289 = true;
                    }
                } else {
                    if (var5 == 38) {
                        this.field415.method454(4, 209);
                        this.field415.method489(var3, 1);
                        this.field415.method456(var6);
                        this.field415.method456(var4);
                        this.field419 = 0;
                        this.field420 = var4;
                        this.field421 = var3;
                        this.field422 = 2;
                        if (class65.method395(var4).field1391 == this.field391) {
                            this.field422 = 1;
                        }
                        if (class65.method395(var4).field1391 == this.field475) {
                            this.field422 = 3;
                        }
                    }
                    if (var5 == 579) {
                        field313 += var4;
                        if (field313 >= 112) {
                            this.field415.method454(4, 192);
                            this.field415.method459(0);
                            field313 = 0;
                        }
                        this.method98(var4, (byte) 4, var3, var6);
                        this.field415.method454(4, 71);
                        this.field415.method489(var6 >> 14 & 32767, 1);
                        this.field415.method490(-302, this.field465 + var4);
                        this.field415.method490(-302, this.field464 + var3);
                    }
                    if (var5 == 678 || var5 == 495 || var5 == 633 || var5 == 663) {
                        String var61 = this.field581[arg0];
                        int var62 = var61.indexOf("@whi@");
                        if (var62 != -1) {
                            long var63 = class11.method37(var61.substring(var62 + 5).trim());
                            if (var5 == 678) {
                                this.method50(this.field607, var63);
                            }
                            if (var5 == 495) {
                                this.method174(var63, 0);
                            }
                            if (var5 == 633) {
                                this.method167(var63, 21174);
                            }
                            if (var5 == 663) {
                                this.method138(var63, true);
                            }
                        }
                    }
                    if (var5 == 906 && this.method98(var4, (byte) 4, var3, var6)) {
                        this.field415.method454(4, 38);
                        this.field415.method490(-302, this.field464 + var3);
                        this.field415.method488(var6 >> 14 & 32767, 41364);
                        this.field415.method488(this.field465 + var4, 41364);
                        this.field415.method490(-302, this.field234);
                        this.field415.method456(this.field236);
                        this.field415.method456(this.field235);
                    }
                    if (var5 == 269) {
                        class48 var65 = this.field575[var6];
                        if (var65 != null) {
                            this.method102(var65.field712[0], this.field244, 1, 0, 2, 1, field178.field711[0], 0, false, var65.field711[0], field178.field712[0], 0);
                            this.field445 = super.field776;
                            this.field446 = super.field777;
                            this.field448 = 2;
                            this.field447 = 0;
                            this.field415.method454(4, 59);
                            this.field415.method456(var6);
                        }
                    }
                    if (var5 == 610) {
                        this.field415.method454(4, 117);
                        this.field415.method488(var4, 41364);
                        this.field415.method489(var6, 1);
                        this.field415.method488(var3, 41364);
                        this.field419 = 0;
                        this.field420 = var4;
                        this.field421 = var3;
                        this.field422 = 2;
                        if (class65.method395(var4).field1391 == this.field391) {
                            this.field422 = 1;
                        }
                        if (class65.method395(var4).field1391 == this.field475) {
                            this.field422 = 3;
                        }
                    }
                    if (var5 == 250) {
                        class48 var66 = this.field575[var6];
                        if (var66 != null) {
                            this.method102(var66.field712[0], this.field244, 1, 0, 2, 1, field178.field711[0], 0, false, var66.field711[0], field178.field712[0], 0);
                            this.field445 = super.field776;
                            this.field446 = super.field777;
                            this.field448 = 2;
                            this.field447 = 0;
                            this.field415.method454(4, 151);
                            this.field415.method490(-302, var6);
                        }
                    }
                    if (var5 == 765) {
                        if (!this.field291) {
                            this.field441.method540(super.field777 - 4, -501, super.field776 - 4);
                        } else {
                            this.field441.method540(var4 - 4, -501, var3 - 4);
                        }
                    }
                    if (var5 == 856) {
                        this.field415.method454(4, 27);
                        this.field415.method456(var4);
                        class65 var67 = class65.method395(var4);
                        if (var67.field1423 != null && var67.field1423[0][0] == 5) {
                            int var68 = var67.field1423[0][1];
                            this.field320[var68] = 1 - this.field320[var68];
                            this.method73(var68, 5);
                            this.field515 = true;
                        }
                    }
                    if (var5 == 929) {
                        this.field415.method454(4, 254);
                        this.field415.method489(var6, 1);
                        this.field415.method489(var4, 1);
                        this.field415.method488(var3, 41364);
                        this.field419 = 0;
                        this.field420 = var4;
                        this.field421 = var3;
                        this.field422 = 2;
                        if (class65.method395(var4).field1391 == this.field391) {
                            this.field422 = 1;
                        }
                        if (class65.method395(var4).field1391 == this.field475) {
                            this.field422 = 3;
                        }
                    }
                    if (var5 == 186) {
                        ++field593;
                        if (field593 >= 112) {
                            this.field415.method454(4, 178);
                            this.field415.method459(0);
                            field593 = 0;
                        }
                        this.method98(var4, (byte) 4, var3, var6);
                        this.field415.method454(4, 215);
                        this.field415.method490(-302, this.field464 + var3);
                        this.field415.method456(this.field465 + var4);
                        this.field415.method490(-302, var6 >> 14 & 32767);
                    }
                    if (var5 == 179) {
                        this.method98(var4, (byte) 4, var3, var6);
                        this.field415.method454(4, 75);
                        this.field415.method489(var6 >> 14 & 32767, 1);
                        this.field415.method490(-302, this.field464 + var3);
                        this.field415.method488(this.field465 + var4, 41364);
                    }
                    if (var5 == 441) {
                        class48 var69 = this.field575[var6];
                        if (var69 != null) {
                            this.method102(var69.field712[0], this.field244, 1, 0, 2, 1, field178.field711[0], 0, false, var69.field711[0], field178.field712[0], 0);
                            this.field445 = super.field776;
                            this.field446 = super.field777;
                            this.field448 = 2;
                            this.field447 = 0;
                            this.field415.method454(4, 55);
                            this.field415.method456(this.field235);
                            this.field415.method456(this.field236);
                            this.field415.method490(-302, this.field234);
                            this.field415.method490(-302, var6);
                        }
                    }
                    if (var5 == 450 && this.method98(var4, (byte) 4, var3, var6)) {
                        this.field415.method454(4, 84);
                        this.field415.method489(this.field464 + var3, 1);
                        this.field415.method488(this.field465 + var4, 41364);
                        this.field415.method488(var6 >> 14 & 32767, 41364);
                        this.field415.method456(this.field253);
                    }
                    if (var5 == 372) {
                        class13 var70 = this.field193[var6];
                        if (var70 != null) {
                            this.method102(var70.field712[0], this.field244, 1, 0, 2, 1, field178.field711[0], 0, false, var70.field711[0], field178.field712[0], 0);
                            this.field445 = super.field776;
                            this.field446 = super.field777;
                            this.field448 = 2;
                            this.field447 = 0;
                            this.field415.method454(4, 199);
                            this.field415.method490(-302, var6);
                        }
                    }
                    if (var5 == 162) {
                        boolean var71 = this.method102(var4, this.field244, 0, 0, 2, 0, field178.field711[0], 0, false, var3, field178.field712[0], 0);
                        if (!var71) {
                            this.method102(var4, this.field244, 1, 0, 2, 1, field178.field711[0], 0, false, var3, field178.field712[0], 0);
                        }
                        this.field445 = super.field776;
                        this.field446 = super.field777;
                        this.field448 = 2;
                        this.field447 = 0;
                        this.field415.method454(4, 115);
                        this.field415.method489(var6, 1);
                        this.field415.method488(this.field465 + var4, 41364);
                        this.field415.method489(this.field464 + var3, 1);
                    }
                    if (var5 == 754) {
                        class13 var73 = this.field193[var6];
                        if (var73 != null) {
                            this.method102(var73.field712[0], this.field244, 1, 0, 2, 1, field178.field711[0], 0, false, var73.field711[0], field178.field712[0], 0);
                            this.field445 = super.field776;
                            this.field446 = super.field777;
                            this.field448 = 2;
                            this.field447 = 0;
                            this.field415.method454(4, 250);
                            this.field415.method490(-302, this.field234);
                            this.field415.method490(-302, this.field236);
                            this.field415.method488(var6, 41364);
                            this.field415.method490(-302, this.field235);
                        }
                    }
                    if (var5 == 131) {
                        this.field415.method454(4, 200);
                        this.field415.method488(var3, 41364);
                        this.field415.method489(this.field234, 1);
                        this.field415.method489(this.field236, 1);
                        this.field415.method488(this.field235, 41364);
                        this.field415.method490(-302, var4);
                        this.field415.method456(var6);
                        this.field419 = 0;
                        this.field420 = var4;
                        this.field421 = var3;
                        this.field422 = 2;
                        if (class65.method395(var4).field1391 == this.field391) {
                            this.field422 = 1;
                        }
                        if (class65.method395(var4).field1391 == this.field475) {
                            this.field422 = 3;
                        }
                    }
                    this.field233 = 0;
                    this.field252 = 0;
                    this.field515 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(B)V")
    public final void method91(byte arg0) {
        this.field369 = true;
        if (arg0 != -8) {
            field304 = !field304;
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(I)V")
    public final void method92(int arg0) {
        if (!this.field392 && !this.field433 && !this.field329) {
            ++field572;
            if (!this.field334) {
                this.method145(this.field532);
            } else {
                this.method68(-891);
            }
            this.method139((byte) 2);
            if (arg0 < 9 || arg0 > 9) {
                this.field424 = -1;
            }
        }
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(Z)V")
    private final void method93(boolean arg0) {
        if (!arg0) {
            this.field190 = !this.field190;
        }
        if (this.field594 == 2) {
            for (class35 var2 = (class35) this.field584.method361(); var2 != null; var2 = (class35) this.field584.method363(this.field512)) {
                if (var2.field1027 > 0) {
                    --var2.field1027;
                }
                if (var2.field1027 == 0) {
                    if (var2.field1036 < 0 || class67.method445(var2.field1038, var2.field1036, 0)) {
                        this.method183(var2.field1037, var2.field1028, -39748, var2.field1030, var2.field1029, var2.field1031, var2.field1038, var2.field1036);
                        var2.method334();
                    }
                } else {
                    if (var2.field1035 > 0) {
                        --var2.field1035;
                    }
                    if (var2.field1035 == 0 && var2.field1030 >= 1 && var2.field1031 >= 1 && var2.field1030 <= 102 && var2.field1031 <= 102 && (var2.field1032 < 0 || class67.method445(var2.field1034, var2.field1032, 0))) {
                        this.method183(var2.field1033, var2.field1028, -39748, var2.field1030, var2.field1029, var2.field1031, var2.field1034, var2.field1032);
                        var2.field1035 = -1;
                        if (var2.field1036 == var2.field1032 && var2.field1036 == -1) {
                            var2.method334();
                        } else if (var2.field1036 == var2.field1032 && var2.field1037 == var2.field1033 && var2.field1038 == var2.field1034) {
                            var2.method334();
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIBIIII)V")
    public final void method94(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = 2048 - arg4 & 2047;
        int var9 = 2048 - arg5 & 2047;
        int var10 = 0;
        int var11 = 0;
        int var12 = arg6;
        if (var8 != 0) {
            int var13 = class66.field1542[var8];
            int var14 = class66.field1543[var8];
            int var15 = var11 * var14 - arg6 * var13 >> 16;
            var12 = var11 * var13 + arg6 * var14 >> 16;
            var11 = var15;
        }
        if (var9 != 0) {
            int var16 = class66.field1542[var9];
            int var17 = class66.field1543[var9];
            int var18 = var10 * var17 + var12 * var16 >> 16;
            var12 = var12 * var17 - var10 * var16 >> 16;
            var10 = var18;
        }
        this.field455 = arg0 - var10;
        this.field456 = arg1 - var11;
        if (arg2 == 9) {
            boolean var19 = false;
            this.field457 = arg3 - var12;
            this.field458 = arg4;
            this.field459 = arg5;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIII)I")
    public final int method95(int arg0, int arg1, int arg2, int arg3) {
        int var5 = arg0 >> 7;
        int var6 = arg1 >> 7;
        if (var5 >= 0 && var6 >= 0 && var5 <= 103 && var6 <= 103) {
            int var7 = arg2;
            if (arg2 < 3 && (this.field218[1][var5][var6] & 2) == 2) {
                var7 = arg2 + 1;
            }
            int var8 = arg0 & 127;
            int var9 = arg1 & 127;
            if (arg3 >= 0) {
                return 4;
            } else {
                int var10 = (128 - var8) * this.field170[var7][var5][var6] + this.field170[var7][var5 + 1][var6] * var8 >> 7;
                int var11 = (128 - var8) * this.field170[var7][var5][var6 + 1] + this.field170[var7][var5 + 1][var6 + 1] * var8 >> 7;
                return (128 - var9) * var10 + var9 * var11 >> 7;
            }
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client", name = "h", descriptor = "(B)V")
    public final void method96(byte arg0) {
        if (this.field613 == null) {
            super.field762 = null;
            this.field542 = null;
            this.field540 = null;
            if (arg0 != 9) {
                this.field190 = !this.field190;
            }
            this.field539 = null;
            this.field541 = null;
            this.field547 = null;
            this.field548 = null;
            this.field549 = null;
            this.field616 = new class10(265, this.method107(4), false, 128);
            class24.method243((byte) -107);
            this.field617 = new class10(265, this.method107(4), false, 128);
            class24.method243((byte) -107);
            this.field613 = new class10(171, this.method107(4), false, 509);
            class24.method243((byte) -107);
            this.field614 = new class10(132, this.method107(4), false, 360);
            class24.method243((byte) -107);
            this.field615 = new class10(200, this.method107(4), false, 360);
            class24.method243((byte) -107);
            this.field618 = new class10(238, this.method107(4), false, 202);
            class24.method243((byte) -107);
            this.field619 = new class10(238, this.method107(4), false, 203);
            class24.method243((byte) -107);
            this.field620 = new class10(94, this.method107(4), false, 74);
            class24.method243((byte) -107);
            this.field621 = new class10(94, this.method107(4), false, 75);
            class24.method243((byte) -107);
            if (this.field290 != null) {
                this.method72(true);
                this.method175((byte) 8);
            }
            this.field369 = true;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Z[BI)V")
    public final void method97(boolean arg0, byte[] arg1, int arg2) {
        if (arg2 != -3220) {
            this.field424 = this.field232.method465();
        }
        if (this.field640) {
            signlink.midifade = arg0 ? 1 : 0;
            signlink.midisave(arg1, arg1.length);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IBII)Z")
    public final boolean method98(int arg0, byte arg1, int arg2, int arg3) {
        int var5 = arg3 >> 14 & 32767;
        int var6 = this.field441.method532(this.field405, arg2, arg0, arg3);
        if (var6 == -1) {
            return false;
        } else {
            int var7 = var6 & 31;
            int var8 = var6 >> 6 & 3;
            if (var7 != 10 && var7 != 11 && var7 != 22) {
                this.method102(arg0, this.field244, 0, 0, 2, 0, field178.field711[0], var8, false, arg2, field178.field712[0], var7 + 1);
            } else {
                class8 var9 = class8.method30(var5);
                int var10;
                int var11;
                if (var8 != 0 && var8 != 2) {
                    var10 = var9.field118;
                    var11 = var9.field97;
                } else {
                    var10 = var9.field97;
                    var11 = var9.field118;
                }
                int var12 = var9.field92;
                if (var8 != 0) {
                    var12 = (var12 >> 4 - var8) + (var12 << var8 & 15);
                }
                this.method102(arg0, this.field244, var10, var12, 2, var11, field178.field711[0], 0, false, arg2, field178.field712[0], 0);
            }
            ++field536;
            if (field536 > 173) {
                field536 = 0;
                this.field415.method454(4, 230);
                this.field415.method456(2704);
            }
            this.field445 = super.field776;
            this.field446 = super.field777;
            this.field448 = 2;
            if (arg1 == 4) {
                boolean var13 = false;
            } else {
                this.method81();
            }
            this.field447 = 0;
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LVYAVYWNE;B)Z")
    public final boolean method99(class65 arg0, byte arg1) {
        if (arg1 != 7) {
            throw new NullPointerException();
        } else if (arg0.field1460 == null) {
            return false;
        } else {
            for (int var3 = 0; var3 < arg0.field1460.length; ++var3) {
                int var4 = this.method104(false, var3, arg0);
                int var5 = arg0.field1430[var3];
                if (arg0.field1460[var3] == 2) {
                    if (var4 >= var5) {
                        return false;
                    }
                } else if (arg0.field1460[var3] == 3) {
                    if (var4 <= var5) {
                        return false;
                    }
                } else if (arg0.field1460[var3] == 4) {
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

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIIBIIII)V")
    private final void method100(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7, int arg8, int arg9) {
        class35 var11 = null;
        for (class35 var12 = (class35) this.field584.method361(); var12 != null; var12 = (class35) this.field584.method363(this.field512)) {
            if (var12.field1028 == arg2 && var12.field1030 == arg3 && var12.field1031 == arg4 && var12.field1029 == arg9) {
                var11 = var12;
                break;
            }
        }
        if (var11 == null) {
            var11 = new class35();
            var11.field1028 = arg2;
            var11.field1029 = arg9;
            var11.field1030 = arg3;
            var11.field1031 = arg4;
            this.method111(var11, 5);
            this.field584.method358(var11);
        }
        var11.field1032 = arg0;
        if (arg5 == 2) {
            boolean var13 = false;
        } else {
            this.field508 = -481;
        }
        var11.field1034 = arg1;
        var11.field1033 = arg8;
        var11.field1035 = arg6;
        var11.field1027 = arg7;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BI)V")
    public final void method101(byte arg0, int arg1) {
        signlink.wavevol = arg1;
        if (arg0 != -109) {
            this.field359 = null;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIIIIIZIII)Z")
    public final boolean method102(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9, int arg10, int arg11) {
        byte var13 = 104;
        byte var14 = 104;
        for (int var15 = 0; var15 < var13; ++var15) {
            for (int var35 = 0; var35 < var14; ++var35) {
                this.field355[var15][var35] = 0;
                this.field357[var15][var35] = 99999999;
            }
        }
        if (arg1 < 1 || arg1 > 1) {
            this.field558 = !this.field558;
        }
        int var16 = arg6;
        int var17 = arg10;
        this.field355[arg6][arg10] = 99;
        this.field357[arg6][arg10] = 0;
        byte var18 = 0;
        int var19 = 0;
        this.field483[var18] = arg6;
        int var36 = var18 + 1;
        this.field484[var18] = arg10;
        boolean var20 = false;
        int var21 = this.field483.length;
        int[][] var22 = this.field361[this.field405].field828;
        while (var36 != var19) {
            var16 = this.field483[var19];
            var17 = this.field484[var19];
            var19 = (var19 + 1) % var21;
            if (arg9 == var16 && arg0 == var17) {
                var20 = true;
                break;
            }
            if (arg11 != 0) {
                if ((arg11 < 5 || arg11 == 10) && this.field361[this.field405].method222(arg9, arg0, var16, 40655, arg7, arg11 - 1, var17)) {
                    var20 = true;
                    break;
                }
                if (arg11 < 10 && this.field361[this.field405].method223(var17, arg11 - 1, arg7, var16, arg0, -633, arg9)) {
                    var20 = true;
                    break;
                }
            }
            if (arg2 != 0 && arg5 != 0 && this.field361[this.field405].method224(var17, 0, arg5, arg3, arg0, arg9, arg2, var16)) {
                var20 = true;
                break;
            }
            int var34 = this.field357[var16][var17] + 1;
            if (var16 > 0 && this.field355[var16 - 1][var17] == 0 && (var22[var16 - 1][var17] & 19398920) == 0) {
                this.field483[var36] = var16 - 1;
                this.field484[var36] = var17;
                var36 = (var36 + 1) % var21;
                this.field355[var16 - 1][var17] = 2;
                this.field357[var16 - 1][var17] = var34;
            }
            if (var16 < var13 - 1 && this.field355[var16 + 1][var17] == 0 && (var22[var16 + 1][var17] & 19399040) == 0) {
                this.field483[var36] = var16 + 1;
                this.field484[var36] = var17;
                var36 = (var36 + 1) % var21;
                this.field355[var16 + 1][var17] = 8;
                this.field357[var16 + 1][var17] = var34;
            }
            if (var17 > 0 && this.field355[var16][var17 - 1] == 0 && (var22[var16][var17 - 1] & 19398914) == 0) {
                this.field483[var36] = var16;
                this.field484[var36] = var17 - 1;
                var36 = (var36 + 1) % var21;
                this.field355[var16][var17 - 1] = 1;
                this.field357[var16][var17 - 1] = var34;
            }
            if (var17 < var14 - 1 && this.field355[var16][var17 + 1] == 0 && (var22[var16][var17 + 1] & 19398944) == 0) {
                this.field483[var36] = var16;
                this.field484[var36] = var17 + 1;
                var36 = (var36 + 1) % var21;
                this.field355[var16][var17 + 1] = 4;
                this.field357[var16][var17 + 1] = var34;
            }
            if (var16 > 0 && var17 > 0 && this.field355[var16 - 1][var17 - 1] == 0 && (var22[var16 - 1][var17 - 1] & 19398926) == 0 && (var22[var16 - 1][var17] & 19398920) == 0 && (var22[var16][var17 - 1] & 19398914) == 0) {
                this.field483[var36] = var16 - 1;
                this.field484[var36] = var17 - 1;
                var36 = (var36 + 1) % var21;
                this.field355[var16 - 1][var17 - 1] = 3;
                this.field357[var16 - 1][var17 - 1] = var34;
            }
            if (var16 < var13 - 1 && var17 > 0 && this.field355[var16 + 1][var17 - 1] == 0 && (var22[var16 + 1][var17 - 1] & 19399043) == 0 && (var22[var16 + 1][var17] & 19399040) == 0 && (var22[var16][var17 - 1] & 19398914) == 0) {
                this.field483[var36] = var16 + 1;
                this.field484[var36] = var17 - 1;
                var36 = (var36 + 1) % var21;
                this.field355[var16 + 1][var17 - 1] = 9;
                this.field357[var16 + 1][var17 - 1] = var34;
            }
            if (var16 > 0 && var17 < var14 - 1 && this.field355[var16 - 1][var17 + 1] == 0 && (var22[var16 - 1][var17 + 1] & 19398968) == 0 && (var22[var16 - 1][var17] & 19398920) == 0 && (var22[var16][var17 + 1] & 19398944) == 0) {
                this.field483[var36] = var16 - 1;
                this.field484[var36] = var17 + 1;
                var36 = (var36 + 1) % var21;
                this.field355[var16 - 1][var17 + 1] = 6;
                this.field357[var16 - 1][var17 + 1] = var34;
            }
            if (var16 < var13 - 1 && var17 < var14 - 1 && this.field355[var16 + 1][var17 + 1] == 0 && (var22[var16 + 1][var17 + 1] & 19399136) == 0 && (var22[var16 + 1][var17] & 19399040) == 0 && (var22[var16][var17 + 1] & 19398944) == 0) {
                this.field483[var36] = var16 + 1;
                this.field484[var36] = var17 + 1;
                var36 = (var36 + 1) % var21;
                this.field355[var16 + 1][var17 + 1] = 12;
                this.field357[var16 + 1][var17 + 1] = var34;
            }
        }
        this.field546 = 0;
        if (!var20) {
            if (arg8) {
                int var23 = 100;
                for (int var24 = 1; var24 < 2; ++var24) {
                    for (int var25 = arg9 - var24; var25 <= arg9 + var24; ++var25) {
                        for (int var26 = arg0 - var24; var26 <= arg0 + var24; ++var26) {
                            if (var25 >= 0 && var26 >= 0 && var25 < 104 && var26 < 104 && this.field357[var25][var26] < var23) {
                                var23 = this.field357[var25][var26];
                                var16 = var25;
                                var17 = var26;
                                this.field546 = 1;
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
        this.field483[var27] = var16;
        int var37 = var27 + 1;
        this.field484[var27] = var17;
        int var28;
        int var29 = var28 = this.field355[var16][var17];
        while (arg6 != var16 || arg10 != var17) {
            if (var28 != var29) {
                var28 = var29;
                this.field483[var37] = var16;
                this.field484[var37++] = var17;
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
            var29 = this.field355[var16][var17];
        }
        if (var37 <= 0) {
            if (arg4 == 1) {
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
            int var31 = this.field483[var37];
            int var32 = this.field484[var37];
            if (arg4 == 0) {
                this.field415.method454(4, 217);
                this.field415.method455(var30 + var30 + 3);
            }
            if (arg4 == 1) {
                this.field415.method454(4, 180);
                this.field415.method455(var30 + var30 + 3 + 14);
            }
            if (arg4 == 2) {
                this.field415.method454(4, 222);
                this.field415.method455(var30 + var30 + 3);
            }
            this.field415.method481((byte) -88, super.field779[5] == 1 ? 1 : 0);
            this.field415.method490(-302, this.field464 + var31);
            this.field415.method456(this.field465 + var32);
            this.field271 = this.field483[0];
            this.field272 = this.field484[0];
            for (int var33 = 1; var33 < var30; ++var33) {
                --var37;
                this.field415.method481((byte) -88, this.field483[var37] - var31);
                this.field415.method482(this.field444, this.field484[var37] - var32);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(III)Ljava/lang/String;")
    public static final String method103(int arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            throw new NullPointerException();
        } else {
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
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZILVYAVYWNE;)I")
    public final int method104(boolean arg0, int arg1, class65 arg2) {
        if (arg0) {
            for (int var4 = 1; var4 > 0; ++var4) {
            }
        }
        if (arg2.field1423 != null && arg1 < arg2.field1423.length) {
            try {
                int[] var5 = arg2.field1423[arg1];
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
                        var10 = this.field221[var5[var7++]];
                    }
                    if (var9 == 2) {
                        var10 = this.field189[var5[var7++]];
                    }
                    if (var9 == 3) {
                        var10 = this.field622[var5[var7++]];
                    }
                    if (var9 == 4) {
                        class65 var12 = class65.method395(var5[var7++]);
                        int var13 = var5[var7++];
                        if (var13 >= 0 && var13 < class22.field855 && (!class22.method237(var13).field880 || field470)) {
                            for (int var14 = 0; var14 < var12.field1431.length; ++var14) {
                                if (var13 + 1 == var12.field1431[var14]) {
                                    var10 += var12.field1395[var14];
                                }
                            }
                        }
                    }
                    if (var9 == 5) {
                        var10 = this.field320[var5[var7++]];
                    }
                    if (var9 == 6) {
                        var10 = field590[this.field189[var5[var7++]] - 1];
                    }
                    if (var9 == 7) {
                        var10 = this.field320[var5[var7++]] * 100 / 46875;
                    }
                    if (var9 == 8) {
                        var10 = field178.field1228;
                    }
                    if (var9 == 9) {
                        for (int var15 = 0; var15 < class58.field1328; ++var15) {
                            if (class58.field1330[var15]) {
                                var10 += this.field189[var15];
                            }
                        }
                    }
                    if (var9 == 10) {
                        class65 var16 = class65.method395(var5[var7++]);
                        int var17 = var5[var7++] + 1;
                        if (var17 >= 0 && var17 < class22.field855 && (!class22.method237(var17).field880 || field470)) {
                            for (int var18 = 0; var18 < var16.field1431.length; ++var18) {
                                if (var16.field1431[var18] == var17) {
                                    var10 = 999999999;
                                    break;
                                }
                            }
                        }
                    }
                    if (var9 == 11) {
                        var10 = this.field592;
                    }
                    if (var9 == 12) {
                        var10 = this.field491;
                    }
                    if (var9 == 13) {
                        int var19 = this.field320[var5[var7++]];
                        int var20 = var5[var7++];
                        var10 = (var19 & 1 << var20) != 0 ? 1 : 0;
                    }
                    if (var9 == 14) {
                        int var21 = var5[var7++];
                        class23 var22 = class23.field884[var21];
                        int var23 = var22.field886;
                        int var24 = var22.field887;
                        int var25 = var22.field888;
                        int var26 = field385[var25 - var24];
                        var10 = this.field320[var23] >> var24 & var26;
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
                        var10 = (field178.field731 >> 7) + this.field464;
                    }
                    if (var9 == 19) {
                        var10 = (field178.field732 >> 7) + this.field465;
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

    @OriginalMember(owner = "client", name = "o", descriptor = "(I)V")
    public final void method105(int arg0) {
        this.field542.method34(2);
        class64.field1378 = this.field428;
        while (arg0 >= 0) {
            for (int var15 = 1; var15 > 0; ++var15) {
            }
        }
        this.field414.method374(0, false, 0);
        if (this.field561) {
            this.field638.method271(this.field606, false, 0, 40, 239);
            this.field638.method271(this.field490 + "*", false, 128, 60, 239);
        } else if (this.field588 == 1) {
            this.field638.method271("Enter amount:", false, 0, 40, 239);
            this.field638.method271(this.field231 + "*", false, 128, 60, 239);
        } else if (this.field588 == 2) {
            this.field638.method271("Enter name:", false, 0, 40, 239);
            this.field638.method271(this.field231 + "*", false, 128, 60, 239);
        } else if (this.field376 != null) {
            this.field638.method271(this.field376, false, 0, 40, 239);
            this.field638.method271("Click to continue", false, 128, 60, 239);
        } else if (this.field475 != -1) {
            this.method83(0, 6, 0, class65.method395(this.field475), 0);
        } else if (this.field339 != -1) {
            this.method83(0, 6, 0, class65.method395(this.field339), 0);
        } else {
            class34 var2 = this.field637;
            int var3 = 0;
            class24.method242((byte) -90, 0, 77, 0, 463);
            for (int var4 = 0; var4 < 100; ++var4) {
                if (this.field228[var4] != null) {
                    int var6 = this.field226[var4];
                    int var7 = 70 - var3 * 14 + this.field582;
                    String var8 = this.field227[var4];
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
                            var2.method275(var7, 4, 0, this.field228[var4], (byte) 6);
                        }
                        ++var3;
                    }
                    if ((var6 == 1 || var6 == 2) && (var6 == 1 || this.field167 == 0 || this.field167 == 1 && this.method186((byte) 20, var8))) {
                        if (var7 > 0 && var7 < 110) {
                            int var10 = 4;
                            if (var9 == 1) {
                                this.field380[0].method374(var7 - 12, false, var10);
                                var10 += 14;
                            }
                            if (var9 == 2) {
                                this.field380[1].method374(var7 - 12, false, var10);
                                var10 += 14;
                            }
                            var2.method275(var7, var10, 0, var8 + ":", (byte) 6);
                            int var11 = var10 + var2.method273(false, var8) + 8;
                            var2.method275(var7, var11, 255, this.field228[var4], (byte) 6);
                        }
                        ++var3;
                    }
                    if ((var6 == 3 || var6 == 7) && this.field174 == 0 && (var6 == 7 || this.field408 == 0 || this.field408 == 1 && this.method186((byte) 20, var8))) {
                        if (var7 > 0 && var7 < 110) {
                            byte var12 = 4;
                            var2.method275(var7, var12, 0, "From", (byte) 6);
                            int var13 = var12 + var2.method273(false, "From ");
                            if (var9 == 1) {
                                this.field380[0].method374(var7 - 12, false, var13);
                                var13 += 14;
                            }
                            if (var9 == 2) {
                                this.field380[1].method374(var7 - 12, false, var13);
                                var13 += 14;
                            }
                            var2.method275(var7, var13, 0, var8 + ":", (byte) 6);
                            int var14 = var13 + var2.method273(false, var8) + 8;
                            var2.method275(var7, var14, 8388608, this.field228[var4], (byte) 6);
                        }
                        ++var3;
                    }
                    if (var6 == 4 && (this.field318 == 0 || this.field318 == 1 && this.method186((byte) 20, var8))) {
                        if (var7 > 0 && var7 < 110) {
                            var2.method275(var7, 4, 8388736, var8 + " " + this.field228[var4], (byte) 6);
                        }
                        ++var3;
                    }
                    if (var6 == 5 && this.field174 == 0 && this.field408 < 2) {
                        if (var7 > 0 && var7 < 110) {
                            var2.method275(var7, 4, 8388608, this.field228[var4], (byte) 6);
                        }
                        ++var3;
                    }
                    if (var6 == 6 && this.field174 == 0 && this.field408 < 2) {
                        if (var7 > 0 && var7 < 110) {
                            var2.method275(var7, 4, 0, "To " + var8 + ":", (byte) 6);
                            var2.method275(var7, 12 + var2.method273(false, "To " + var8), 8388608, this.field228[var4], (byte) 6);
                        }
                        ++var3;
                    }
                    if (var6 == 8 && (this.field318 == 0 || this.field318 == 1 && this.method186((byte) 20, var8))) {
                        if (var7 > 0 && var7 < 110) {
                            var2.method275(var7, 4, 8270336, var8 + " " + this.field228[var4], (byte) 6);
                        }
                        ++var3;
                    }
                }
            }
            class24.method241(-652);
            this.field560 = var3 * 14 + 7;
            if (this.field560 < 78) {
                this.field560 = 78;
            }
            this.method169(this.field560, this.field560 - this.field582 - 77, 77, (byte) 8, 463, 0);
            String var5;
            if (field178 != null && field178.field1239 != null) {
                var5 = field178.field1239;
            } else {
                var5 = class11.method41(this.field437, 42484);
            }
            var2.method275(90, 4, 0, var5 + ":", (byte) 6);
            var2.method275(90, 6 + var2.method273(false, var5 + ": "), 255, this.field494 + "*", (byte) 6);
            class24.method248(0, 77, 479, 0, false);
        }
        if (this.field291 && this.field200 == 2) {
            this.method149((byte) 51);
        }
        this.field542.method35(super.field761, 17, 357, this.field508);
        this.field541.method34(2);
        class64.field1378 = this.field430;
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(Z)V")
    public void method106(boolean arg0) {
        System.out.println("============");
        System.out.println("flame-cycle:" + this.field624);
        if (this.field241 != null) {
            System.out.println("Od-cycle:" + this.field241.field1093);
        }
        System.out.println("loop-cycle:" + field572);
        System.out.println("draw-cycle:" + field168);
        System.out.println("ptype:" + this.field424);
        if (arg0) {
            this.field424 = -1;
        }
        System.out.println("psize:" + this.field423);
        if (this.field306 != null) {
            this.field306.method6(false);
        }
        super.field758 = true;
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(I)Ljava/awt/Component;")
    public final Component method107(int arg0) {
        if (arg0 < 4 || arg0 > 4) {
            this.field444 = this.field323.method200();
        }
        if (signlink.mainapp != null) {
            return signlink.mainapp;
        } else {
            return super.field764 != null ? super.field764 : this;
        }
    }

    @OriginalMember(owner = "client", name = "p", descriptor = "(I)V")
    public final void method108(int arg0) {
        if (arg0 == 0) {
            if (super.field775 == 1) {
                if (super.field776 >= 6 && super.field776 <= 106 && super.field777 >= 467 && super.field777 <= 499) {
                    this.field167 = (this.field167 + 1) % 4;
                    this.field454 = true;
                    this.field338 = true;
                    this.field415.method454(4, 206);
                    this.field415.method455(this.field167);
                    this.field415.method455(this.field408);
                    this.field415.method455(this.field318);
                }
                if (super.field776 >= 135 && super.field776 <= 235 && super.field777 >= 467 && super.field777 <= 499) {
                    this.field408 = (this.field408 + 1) % 3;
                    this.field454 = true;
                    this.field338 = true;
                    this.field415.method454(4, 206);
                    this.field415.method455(this.field167);
                    this.field415.method455(this.field408);
                    this.field415.method455(this.field318);
                }
                if (super.field776 >= 273 && super.field776 <= 373 && super.field777 >= 467 && super.field777 <= 499) {
                    this.field318 = (this.field318 + 1) % 3;
                    this.field454 = true;
                    this.field338 = true;
                    this.field415.method454(4, 206);
                    this.field415.method455(this.field167);
                    this.field415.method455(this.field408);
                    this.field415.method455(this.field318);
                }
                if (super.field776 >= 412 && super.field776 <= 512 && super.field777 >= 467 && super.field777 <= 499) {
                    if (this.field391 == -1) {
                        this.method160(-156);
                        this.field335 = "";
                        this.field595 = false;
                        this.field550 = this.field391 = class65.field1456;
                        return;
                    }
                    this.method133(1, 0, "", "Please close the interface you have open before using 'report abuse'");
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "q", descriptor = "(I)V")
    public final void method109(int arg0) {
        if (arg0 <= 0) {
            this.field415.method455(16);
        }
        while (true) {
            int var2;
            do {
                while (true) {
                    var2 = this.method211(299);
                    if (var2 == -1) {
                        return;
                    }
                    if (this.field391 != -1 && this.field550 == this.field391) {
                        if (var2 == 8 && this.field335.length() > 0) {
                            this.field335 = this.field335.substring(0, this.field335.length() - 1);
                        }
                        break;
                    }
                    if (this.field561) {
                        if (var2 >= 32 && var2 <= 122 && this.field490.length() < 80) {
                            this.field490 = this.field490 + (char) var2;
                            this.field338 = true;
                        }
                        if (var2 == 8 && this.field490.length() > 0) {
                            this.field490 = this.field490.substring(0, this.field490.length() - 1);
                            this.field338 = true;
                        }
                        if (var2 == 13 || var2 == 10) {
                            this.field561 = false;
                            this.field338 = true;
                            if (this.field185 == 1) {
                                long var3 = class11.method37(this.field490);
                                this.method50(this.field607, var3);
                            }
                            if (this.field185 == 2 && this.field183 > 0) {
                                long var5 = class11.method37(this.field490);
                                this.method167(var5, 21174);
                            }
                            if (this.field185 == 3 && this.field490.length() > 0) {
                                this.field415.method454(4, 220);
                                this.field415.method455(0);
                                int var7 = this.field415.field1652;
                                this.field415.method461(this.field511, this.field222);
                                class62.method367(this.field490, this.field415, true);
                                this.field415.method464(true, this.field415.field1652 - var7);
                                this.field490 = class62.method368(true, this.field490);
                                this.field490 = class72.method571(true, this.field490);
                                this.method133(1, 6, class11.method41(class11.method38(this.field487, this.field222), 42484), this.field490);
                                if (this.field408 == 2) {
                                    this.field408 = 1;
                                    this.field454 = true;
                                    this.field415.method454(4, 206);
                                    this.field415.method455(this.field167);
                                    this.field415.method455(this.field408);
                                    this.field415.method455(this.field318);
                                }
                            }
                            if (this.field185 == 4 && this.field249 < 100) {
                                long var8 = class11.method37(this.field490);
                                this.method174(var8, 0);
                            }
                            if (this.field185 == 5 && this.field249 > 0) {
                                long var10 = class11.method37(this.field490);
                                this.method138(var10, true);
                            }
                        }
                    } else if (this.field588 == 1) {
                        if (var2 >= 48 && var2 <= 57 && this.field231.length() < 10) {
                            this.field231 = this.field231 + (char) var2;
                            this.field338 = true;
                        }
                        if (var2 == 8 && this.field231.length() > 0) {
                            this.field231 = this.field231.substring(0, this.field231.length() - 1);
                            this.field338 = true;
                        }
                        if (var2 == 13 || var2 == 10) {
                            if (this.field231.length() > 0) {
                                int var12 = 0;
                                try {
                                    var12 = Integer.parseInt(this.field231);
                                } catch (Exception var22) {
                                }
                                this.field415.method454(4, 114);
                                this.field415.method459(var12);
                            }
                            this.field588 = 0;
                            this.field338 = true;
                        }
                    } else if (this.field588 == 2) {
                        if (var2 >= 32 && var2 <= 122 && this.field231.length() < 12) {
                            this.field231 = this.field231 + (char) var2;
                            this.field338 = true;
                        }
                        if (var2 == 8 && this.field231.length() > 0) {
                            this.field231 = this.field231.substring(0, this.field231.length() - 1);
                            this.field338 = true;
                        }
                        if (var2 == 13 || var2 == 10) {
                            if (this.field231.length() > 0) {
                                this.field415.method454(4, 104);
                                this.field415.method461(this.field511, class11.method37(this.field231));
                            }
                            this.field588 = 0;
                            this.field338 = true;
                        }
                    } else if (this.field475 == -1 && this.field356 == -1) {
                        if (var2 >= 32 && var2 <= 122 && this.field494.length() < 80) {
                            this.field494 = this.field494 + (char) var2;
                            this.field338 = true;
                        }
                        if (var2 == 8 && this.field494.length() > 0) {
                            this.field494 = this.field494.substring(0, this.field494.length() - 1);
                            this.field338 = true;
                        }
                        if ((var2 == 13 || var2 == 10) && this.field494.length() > 0) {
                            if (this.field585 == 2) {
                                if (this.field494.equals("::clientdrop")) {
                                    this.method125(18674);
                                }
                                if (this.field494.equals("::lag")) {
                                    this.method106(false);
                                }
                                if (this.field494.equals("::prefetchmusic")) {
                                    for (int var13 = 0; var13 < this.field241.method303(2, field304); ++var13) {
                                        this.field241.method300(2, (byte) 1, var13, 161);
                                    }
                                }
                                if (this.field494.equals("::fpson")) {
                                    field352 = true;
                                }
                                if (this.field494.equals("::fpsoff")) {
                                    field352 = false;
                                }
                                if (this.field494.equals("::noclip")) {
                                    for (int var14 = 0; var14 < 4; ++var14) {
                                        for (int var15 = 1; var15 < 103; ++var15) {
                                            for (int var16 = 1; var16 < 103; ++var16) {
                                                this.field361[var14].field828[var15][var16] = 0;
                                            }
                                        }
                                    }
                                }
                            }
                            if (this.field494.startsWith("::")) {
                                this.field415.method454(4, 188);
                                this.field415.method455(this.field494.length() - 1);
                                this.field415.method462(this.field494.substring(2));
                            } else {
                                String var17 = this.field494.toLowerCase();
                                byte var18 = 0;
                                if (var17.startsWith("yellow:")) {
                                    var18 = 0;
                                    this.field494 = this.field494.substring(7);
                                } else if (var17.startsWith("red:")) {
                                    var18 = 1;
                                    this.field494 = this.field494.substring(4);
                                } else if (var17.startsWith("green:")) {
                                    var18 = 2;
                                    this.field494 = this.field494.substring(6);
                                } else if (var17.startsWith("cyan:")) {
                                    var18 = 3;
                                    this.field494 = this.field494.substring(5);
                                } else if (var17.startsWith("purple:")) {
                                    var18 = 4;
                                    this.field494 = this.field494.substring(7);
                                } else if (var17.startsWith("white:")) {
                                    var18 = 5;
                                    this.field494 = this.field494.substring(6);
                                } else if (var17.startsWith("flash1:")) {
                                    var18 = 6;
                                    this.field494 = this.field494.substring(7);
                                } else if (var17.startsWith("flash2:")) {
                                    var18 = 7;
                                    this.field494 = this.field494.substring(7);
                                } else if (var17.startsWith("flash3:")) {
                                    var18 = 8;
                                    this.field494 = this.field494.substring(7);
                                } else if (var17.startsWith("glow1:")) {
                                    var18 = 9;
                                    this.field494 = this.field494.substring(6);
                                } else if (var17.startsWith("glow2:")) {
                                    var18 = 10;
                                    this.field494 = this.field494.substring(6);
                                } else if (var17.startsWith("glow3:")) {
                                    var18 = 11;
                                    this.field494 = this.field494.substring(6);
                                }
                                String var19 = this.field494.toLowerCase();
                                byte var20 = 0;
                                if (var19.startsWith("wave:")) {
                                    var20 = 1;
                                    this.field494 = this.field494.substring(5);
                                } else if (var19.startsWith("wave2:")) {
                                    var20 = 2;
                                    this.field494 = this.field494.substring(6);
                                } else if (var19.startsWith("shake:")) {
                                    var20 = 3;
                                    this.field494 = this.field494.substring(6);
                                } else if (var19.startsWith("scroll:")) {
                                    var20 = 4;
                                    this.field494 = this.field494.substring(7);
                                } else if (var19.startsWith("slide:")) {
                                    var20 = 5;
                                    this.field494 = this.field494.substring(6);
                                }
                                this.field415.method454(4, 144);
                                this.field415.method455(0);
                                int var21 = this.field415.field1652;
                                this.field415.method481((byte) -88, var18);
                                this.field415.method481((byte) -88, var20);
                                this.field192.field1652 = 0;
                                class62.method367(this.field494, this.field192, true);
                                this.field415.method500(this.field192.field1652, true, 0, this.field192.field1651);
                                this.field415.method464(true, this.field415.field1652 - var21);
                                this.field494 = class62.method368(true, this.field494);
                                this.field494 = class72.method571(true, this.field494);
                                field178.field684 = this.field494;
                                field178.field722 = var18;
                                field178.field734 = var20;
                                field178.field685 = 150;
                                if (this.field585 == 2) {
                                    this.method133(1, 2, "@cr2@" + field178.field1239, field178.field684);
                                } else if (this.field585 == 1) {
                                    this.method133(1, 2, "@cr1@" + field178.field1239, field178.field684);
                                } else {
                                    this.method133(1, 2, field178.field1239, field178.field684);
                                }
                                if (this.field167 == 2) {
                                    this.field167 = 3;
                                    this.field454 = true;
                                    this.field415.method454(4, 206);
                                    this.field415.method455(this.field167);
                                    this.field415.method455(this.field408);
                                    this.field415.method455(this.field318);
                                }
                            }
                            this.field494 = "";
                            this.field338 = true;
                        }
                    }
                }
            } while ((var2 < 97 || var2 > 122) && (var2 < 65 || var2 > 90) && (var2 < 48 || var2 > 57) && var2 != 32);
            if (this.field335.length() < 12) {
                this.field335 = this.field335 + (char) var2;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(II[B)Z")
    public final boolean method110(int arg0, int arg1, byte[] arg2) {
        if (arg0 != 31545) {
            throw new NullPointerException();
        } else {
            return arg2 == null ? true : signlink.wavesave(arg2, arg1);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LKLVJVWGL;I)V")
    private final void method111(class35 arg0, int arg1) {
        int var3 = 0;
        int var4 = -1;
        int var5 = 0;
        int var6 = 0;
        if (arg1 <= 0) {
            this.field424 = this.field232.method465();
        }
        if (arg0.field1029 == 0) {
            var3 = this.field441.method528(arg0.field1028, arg0.field1030, arg0.field1031);
        }
        if (arg0.field1029 == 1) {
            var3 = this.field441.method529(arg0.field1028, (byte) 2, arg0.field1031, arg0.field1030);
        }
        if (arg0.field1029 == 2) {
            var3 = this.field441.method530(arg0.field1028, arg0.field1030, arg0.field1031);
        }
        if (arg0.field1029 == 3) {
            var3 = this.field441.method531(arg0.field1028, arg0.field1030, arg0.field1031);
        }
        if (var3 != 0) {
            int var7 = this.field441.method532(arg0.field1028, arg0.field1030, arg0.field1031, var3);
            var4 = var3 >> 14 & 32767;
            var5 = var7 & 31;
            var6 = var7 >> 6;
        }
        arg0.field1036 = var4;
        arg0.field1038 = var5;
        arg0.field1037 = var6;
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(LXGRGMPUQ;II)V")
    private final void method112(class69 arg0, int arg1, int arg2) {
        arg0.method475(-998);
        int var4 = arg0.method476(1, 0);
        if (var4 != 0) {
            int var5 = arg0.method476(2, 0);
            if (arg1 >= 1 && arg1 <= 1) {
                if (var5 == 0) {
                    this.field579[this.field578++] = this.field574;
                } else if (var5 == 1) {
                    int var6 = arg0.method476(3, 0);
                    field178.method197(var6, false, -19255);
                    int var7 = arg0.method476(1, 0);
                    if (var7 == 1) {
                        this.field579[this.field578++] = this.field574;
                    }
                } else if (var5 == 2) {
                    int var8 = arg0.method476(3, 0);
                    field178.method197(var8, true, -19255);
                    int var9 = arg0.method476(3, 0);
                    field178.method197(var9, true, -19255);
                    int var10 = arg0.method476(1, 0);
                    if (var10 == 1) {
                        this.field579[this.field578++] = this.field574;
                    }
                } else if (var5 == 3) {
                    int var11 = arg0.method476(1, 0);
                    this.field405 = arg0.method476(2, 0);
                    int var12 = arg0.method476(7, 0);
                    int var13 = arg0.method476(7, 0);
                    int var14 = arg0.method476(1, 0);
                    if (var14 == 1) {
                        this.field579[this.field578++] = this.field574;
                    }
                    field178.method199(true, var11 == 1, var12, var13);
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZB)V")
    public final void method113(boolean arg0, byte arg1) {
        if (field178.field731 >> 7 == this.field271 && field178.field732 >> 7 == this.field272) {
            this.field271 = 0;
        }
        int var3 = this.field576;
        if (arg1 != 4) {
            this.field169 = !this.field169;
        }
        if (arg0) {
            var3 = 1;
        }
        for (int var4 = 0; var4 < var3; ++var4) {
            class48 var5;
            int var6;
            if (arg0) {
                var5 = field178;
                var6 = this.field574 << 14;
            } else {
                var5 = this.field575[this.field577[var4]];
                var6 = this.field577[var4] << 14;
            }
            if (var5 != null && var5.method192(-22030)) {
                var5.field1231 = false;
                if ((field471 && this.field576 > 50 || this.field576 > 200) && !arg0 && var5.field736 == var5.field723) {
                    var5.field1231 = true;
                }
                int var7 = var5.field731 >> 7;
                int var8 = var5.field732 >> 7;
                if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                    if (var5.field1235 != null && field572 >= var5.field1242 && field572 < var5.field1243) {
                        var5.field1231 = false;
                        var5.field1230 = this.method95(var5.field731, var5.field732, this.field405, -738);
                        this.field441.method514(var5, var5.field731, (byte) 108, var5.field1224, var5.field1230, this.field405, var6, 60, var5.field733, var5.field1225, var5.field732, var5.field1227, var5.field1226);
                    } else {
                        if ((var5.field731 & 127) == 64 && (var5.field732 & 127) == 64) {
                            if (this.field400[var7][var8] == this.field559) {
                                continue;
                            }
                            this.field400[var7][var8] = this.field559;
                        }
                        var5.field1230 = this.method95(var5.field731, var5.field732, this.field405, -738);
                        this.field441.method513(this.field300, var5.field731, var5.field1230, 60, var6, var5.field732, this.field405, var5, var5.field733, var5.field710);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZLXGRGMPUQ;I)V")
    private final void method114(boolean arg0, class69 arg1, int arg2) {
        this.field556 = 0;
        this.field578 = 0;
        this.method112(arg1, 1, arg2);
        if (!arg0) {
            this.field359 = null;
        }
        this.method184(arg2, arg1, 504);
        this.method82(-49893, arg2, arg1);
        this.method51(arg2, arg1, -24634);
        for (int var4 = 0; var4 < this.field556; ++var4) {
            int var6 = this.field557[var4];
            if (field572 != this.field575[var6].field682) {
                this.field575[var6] = null;
            }
        }
        if (arg1.field1652 != arg2) {
            signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg1.field1652 + " psize:" + arg2);
            throw new RuntimeException("eek");
        } else {
            for (int var5 = 0; var5 < this.field576; ++var5) {
                if (this.field575[this.field577[var5]] == null) {
                    signlink.reporterror(this.field437 + " null entry in pl list - pos:" + var5 + " size:" + this.field576);
                    throw new RuntimeException("eek");
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(Z)V")
    public final void method115(boolean arg0) {
        if (arg0) {
            this.method81();
        }
        if (field471 && this.field594 == 2 && class67.field1549 != this.field405) {
            this.method124((String) null, "Loading - please wait.", true);
            this.field594 = 1;
            this.field223 = System.currentTimeMillis();
        }
        if (this.field594 == 1) {
            int var2 = this.method116(true);
            if (var2 != 0 && System.currentTimeMillis() - this.field223 > 360000L) {
                signlink.reporterror(this.field437 + " glcfb " + this.field603 + "," + var2 + "," + field471 + "," + this.field631[0] + "," + this.field241.method302() + "," + this.field405 + "," + this.field632 + "," + this.field633);
                this.field223 = System.currentTimeMillis();
            }
        }
        if (this.field594 == 2 && this.field450 != this.field405) {
            this.field450 = this.field405;
            this.method129(false, this.field405);
        }
    }

    @OriginalMember(owner = "client", name = "h", descriptor = "(Z)I")
    public final int method116(boolean arg0) {
        for (int var2 = 0; var2 < this.field270.length; ++var2) {
            if (this.field270[var2] == null && this.field388[var2] != -1) {
                return -1;
            }
            if (this.field383[var2] == null && this.field389[var2] != -1) {
                return -2;
            }
        }
        boolean var3 = true;
        for (int var4 = 0; var4 < this.field270.length; ++var4) {
            byte[] var5 = this.field383[var4];
            if (var5 != null) {
                int var6 = (this.field387[var4] >> 8) * 64 - this.field464;
                int var7 = (this.field387[var4] & 255) * 64 - this.field465;
                if (this.field288) {
                    var6 = 10;
                    var7 = 10;
                }
                var3 &= class67.method433(var6, 6, var7, var5);
            }
        }
        this.field334 &= arg0;
        if (!var3) {
            return -3;
        } else if (this.field276) {
            return -4;
        } else {
            this.field594 = 2;
            class67.field1549 = this.field405;
            this.method170(0);
            this.field415.method454(4, 231);
            return 0;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LPDMJJHOP;IBI)V")
    public final void method117(class55 arg0, int arg1, byte arg2, int arg3) {
        int var5 = this.field372 + this.field257 & 2047;
        int var6 = arg1 * arg1 + arg3 * arg3;
        if (var6 <= 6400) {
            int var7 = class66.field1542[var5];
            int var8 = class66.field1543[var5];
            int var9 = var7 * 256 / (this.field378 + 256);
            if (arg2 != -26) {
                for (int var10 = 1; var10 > 0; ++var10) {
                }
            }
            int var11 = var8 * 256 / (this.field378 + 256);
            int var12 = arg1 * var9 + arg3 * var11 >> 16;
            int var13 = arg1 * var11 - arg3 * var9 >> 16;
            if (var6 > 2500) {
                arg0.method346(83 - var13 - arg0.field1313 / 2 - 4, this.field413, 0, var12 + 94 - arg0.field1312 / 2 + 4);
            } else {
                arg0.method340(83 - var13 - arg0.field1313 / 2 - 4, false, var12 + 94 - arg0.field1312 / 2 + 4);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIIIZLVYAVYWNE;I)V")
    public final void method118(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, class65 arg7, int arg8) {
        if (!arg6) {
            if (this.field596) {
                this.field180 = 32;
            } else {
                this.field180 = 0;
            }
            this.field596 = false;
            if (arg1 >= arg5 && arg1 < arg5 + 16 && arg0 >= arg3 && arg0 < arg3 + 16) {
                arg7.field1463 -= this.field312 * 4;
                if (arg8 == 1) {
                    this.field515 = true;
                }
                if (arg8 == 2 || arg8 == 3) {
                    this.field338 = true;
                }
            } else if (arg1 >= arg5 && arg1 < arg5 + 16 && arg0 >= arg3 + arg4 - 16 && arg0 < arg3 + arg4) {
                arg7.field1463 += this.field312 * 4;
                if (arg8 == 1) {
                    this.field515 = true;
                }
                if (arg8 == 2 || arg8 == 3) {
                    this.field338 = true;
                }
            } else if (arg1 >= arg5 - this.field180 && arg1 < arg5 + 16 + this.field180 && arg0 >= arg3 + 16 && arg0 < arg3 + arg4 - 16 && this.field312 > 0) {
                int var10 = (arg4 - 32) * arg4 / arg2;
                if (var10 < 8) {
                    var10 = 8;
                }
                int var11 = arg0 - arg3 - 16 - var10 / 2;
                int var12 = arg4 - 32 - var10;
                arg7.field1463 = (arg2 - arg4) * var11 / var12;
                if (arg8 == 1) {
                    this.field515 = true;
                }
                if (arg8 == 2 || arg8 == 3) {
                    this.field338 = true;
                }
                this.field596 = true;
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(LVYAVYWNE;B)V")
    public final void method119(class65 arg0, byte arg1) {
        int var3 = arg0.field1454;
        if (arg1 == 3) {
            boolean var4 = false;
        } else {
            this.field424 = this.field232.method465();
        }
        if ((var3 < 1 || var3 > 100) && (var3 < 701 || var3 > 800)) {
            if (var3 >= 101 && var3 <= 200 || var3 >= 801 && var3 <= 900) {
                int var6 = this.field183;
                if (this.field184 != 2) {
                    var6 = 0;
                }
                if (var3 > 800) {
                    var3 -= 701;
                } else {
                    var3 -= 101;
                }
                if (var3 >= var6) {
                    arg0.field1413 = "";
                    arg0.field1420 = 0;
                } else {
                    if (this.field278[var3] == 0) {
                        arg0.field1413 = "@red@Offline";
                    } else if (this.field278[var3] < 200) {
                        if (this.field278[var3] == field468) {
                            arg0.field1413 = "@gre@World" + (this.field278[var3] - 9);
                        } else {
                            arg0.field1413 = "@yel@World" + (this.field278[var3] - 9);
                        }
                    } else if (this.field278[var3] == field468) {
                        arg0.field1413 = "@gre@Classic" + (this.field278[var3] - 219);
                    } else {
                        arg0.field1413 = "@yel@Classic" + (this.field278[var3] - 219);
                    }
                    arg0.field1420 = 1;
                }
            } else if (var3 == 203) {
                int var7 = this.field183;
                if (this.field184 != 2) {
                    var7 = 0;
                }
                arg0.field1396 = var7 * 15 + 20;
                if (arg0.field1396 <= arg0.field1416) {
                    arg0.field1396 = arg0.field1416 + 1;
                }
            } else if (var3 >= 401 && var3 <= 500) {
                var3 -= 401;
                if (var3 == 0 && this.field184 == 0) {
                    arg0.field1413 = "Loading ignore list";
                    arg0.field1420 = 0;
                } else if (var3 == 1 && this.field184 == 0) {
                    arg0.field1413 = "Please wait...";
                    arg0.field1420 = 0;
                } else {
                    int var8 = this.field249;
                    if (this.field184 == 0) {
                        var8 = 0;
                    }
                    if (var3 >= var8) {
                        arg0.field1413 = "";
                        arg0.field1420 = 0;
                    } else {
                        arg0.field1413 = class11.method41(class11.method38(this.field487, this.field261[var3]), 42484);
                        arg0.field1420 = 1;
                    }
                }
            } else if (var3 == 503) {
                arg0.field1396 = this.field249 * 15 + 20;
                if (arg0.field1396 <= arg0.field1416) {
                    arg0.field1396 = arg0.field1416 + 1;
                }
            } else if (var3 == 327) {
                arg0.field1418 = 150;
                arg0.field1419 = (int) (Math.sin((double) field572 / 40.0D) * 256.0D) & 2047;
                if (this.field514) {
                    for (int var9 = 0; var9 < 7; ++var9) {
                        int var16 = this.field198[var9];
                        if (var16 >= 0 && !class7.field79[var16].method19(this.field239)) {
                            return;
                        }
                    }
                    this.field514 = false;
                    class66[] var10 = new class66[7];
                    int var11 = 0;
                    for (int var12 = 0; var12 < 7; ++var12) {
                        int var15 = this.field198[var12];
                        if (var15 >= 0) {
                            var10[var11++] = class7.field79[var15].method20((byte) 7);
                        }
                    }
                    class66 var13 = new class66(var10, this.field375, var11);
                    for (int var14 = 0; var14 < 5; ++var14) {
                        if (this.field285[var14] != 0) {
                            var13.method421(field336[var14][0], field336[var14][this.field285[var14]]);
                            if (var14 == 1) {
                                var13.method421(field390[0], field390[this.field285[var14]]);
                            }
                        }
                    }
                    var13.method414((byte) 56);
                    var13.method415(class45.field1187[field178.field736].field1189[0], 3);
                    var13.method424(64, 850, -30, -50, -30, true);
                    arg0.field1444 = 5;
                    arg0.field1445 = 0;
                    class65.method400(0, var13, 5, 0);
                }
            } else if (var3 == 324) {
                if (this.field340 == null) {
                    this.field340 = arg0.field1457;
                    this.field341 = arg0.field1434;
                }
                if (this.field587) {
                    arg0.field1457 = this.field341;
                } else {
                    arg0.field1457 = this.field340;
                }
            } else if (var3 == 325) {
                if (this.field340 == null) {
                    this.field340 = arg0.field1457;
                    this.field341 = arg0.field1434;
                }
                if (this.field587) {
                    arg0.field1457 = this.field340;
                } else {
                    arg0.field1457 = this.field341;
                }
            } else if (var3 == 600) {
                arg0.field1413 = this.field335;
                if (field572 % 20 < 10) {
                    arg0.field1413 = arg0.field1413 + "|";
                } else {
                    arg0.field1413 = arg0.field1413 + " ";
                }
            } else {
                if (var3 == 620) {
                    if (this.field585 >= 1) {
                        if (this.field595) {
                            arg0.field1452 = 16711680;
                            arg0.field1413 = "Moderator option: Mute player for 48 hours: <ON>";
                        } else {
                            arg0.field1452 = 16777215;
                            arg0.field1413 = "Moderator option: Mute player for 48 hours: <OFF>";
                        }
                    } else {
                        arg0.field1413 = "";
                    }
                }
                if (var3 == 660) {
                    int var17 = this.field418 - this.field351;
                    String var18;
                    if (var17 <= 0) {
                        var18 = "earlier today";
                    } else if (var17 == 1) {
                        var18 = "yesterday";
                    } else {
                        var18 = var17 + " days ago";
                    }
                    arg0.field1413 = "You last logged in @red@" + var18 + "@bla@ from: @red@" + signlink.dns;
                }
                if (var3 == 661) {
                    if (this.field440 == 0) {
                        arg0.field1413 = "\\nYou have not yet set any recovery questions.\\nIt is @lre@strongly@yel@ recommended that you do so.\\n\\nIf you don't you will be @lre@unable to recover your\\n@lre@password@yel@ if you forget it, or it is stolen.";
                    } else if (this.field440 <= this.field418) {
                        arg0.field1413 = "\\n\\nRecovery Questions Last Set:\\n@gre@" + this.method120(34211, this.field440);
                    } else {
                        int var19 = this.field418 + 14 - this.field440;
                        String var20;
                        if (var19 <= 0) {
                            var20 = "Earlier today";
                        } else if (var19 == 1) {
                            var20 = "Yesterday";
                        } else {
                            var20 = var19 + " days ago";
                        }
                        arg0.field1413 = var20 + " you requested@lre@ new recovery\\n@lre@questions.@yel@ The requested change will occur\\non: @lre@" + this.method120(34211, this.field440) + "\\n\\nIf you do not remember making this request\\ncancel it immediately, and change your password.";
                    }
                }
                if (var3 == 662) {
                    String var21;
                    if (this.field349 == 0) {
                        var21 = "@yel@0 unread messages";
                    } else if (this.field349 == 1) {
                        var21 = "@gre@1 unread message";
                    } else {
                        var21 = "@gre@" + this.field349 + " unread messages";
                    }
                    arg0.field1413 = "You have " + var21 + "\\nin your message centre.";
                }
                if (var3 == 663) {
                    if (this.field317 > 0 && this.field317 <= this.field418 + 10) {
                        arg0.field1413 = "Last password change:\\n@gre@" + this.method120(34211, this.field317);
                    } else {
                        arg0.field1413 = "Last password change:\\n@gre@Never changed";
                    }
                }
                if (var3 == 664) {
                    if (this.field486 == 0) {
                        arg0.field1413 = "You have not yet set\\nany contact details.";
                    }
                    if (this.field486 == 1) {
                        arg0.field1413 = "Contact Details Last Set:\\n@gre@" + this.method120(34211, this.field411);
                    }
                    if (this.field486 == 2) {
                        arg0.field1413 = "You need to set\\nnew contact details.";
                    }
                }
                if (var3 == 665) {
                    if (this.field601 > 2 && !field470) {
                        arg0.field1413 = "This is a non-members\\nworld. To enjoy your\\nmembers benefits we\\nrecommend you play on a\\nmembers world instead.";
                    } else if (this.field601 > 2) {
                        arg0.field1413 = "\\n\\nYou have @gre@" + this.field601 + "@yel@ days of\\nmember credit remaining.";
                    } else if (this.field601 > 0) {
                        arg0.field1413 = "You have @gre@" + this.field601 + "@yel@ days of\\nmember credit remaining.\\n\\n@lre@Credit low! Renew now\\n@lre@to avoid losing members.";
                    } else {
                        arg0.field1413 = "You are not a member.\\n\\nChoose to subscribe and\\nyou'll get loads of extra\\nbenefits and features.";
                    }
                }
                if (var3 == 667) {
                    if (this.field601 > 2 && !field470) {
                        arg0.field1413 = "To switch to a members-only world:\\n1) Logout and return to the world selection page.\\n2) Choose one of the members world with a gold star next to it's name.\\n\\nIf you prefer you can continue to use this world,\\nbut members only features will be unavailable here.";
                    } else if (this.field601 > 0) {
                        arg0.field1413 = "To extend or cancel a subscription:\\n1) Logout and return to the frontpage of this website.\\n2)Choose the relevant option from the 'membership' section.\\n\\nNote: If you are a credit card subscriber a top-up payment will\\nautomatically be taken when 3 days credit remain.\\n(unless you cancel your subscription, which can be done at any time.)";
                    } else {
                        arg0.field1413 = "To start a subscripton:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Start a new subscription'";
                    }
                }
                if (var3 == 668) {
                    if (this.field440 > this.field418) {
                        arg0.field1413 = "To cancel this request:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Cancel recovery questions'.";
                    } else {
                        arg0.field1413 = "To change your recovery questions:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Set new recovery questions'.";
                    }
                }
            }
        } else if (var3 == 1 && this.field184 == 0) {
            arg0.field1413 = "Loading friend list";
            arg0.field1420 = 0;
        } else if (var3 == 1 && this.field184 == 1) {
            arg0.field1413 = "Connecting to friendserver";
            arg0.field1420 = 0;
        } else if (var3 == 2 && this.field184 != 2) {
            arg0.field1413 = "Please wait...";
            arg0.field1420 = 0;
        } else {
            int var5 = this.field183;
            if (this.field184 != 2) {
                var5 = 0;
            }
            if (var3 > 700) {
                var3 -= 601;
            } else {
                --var3;
            }
            if (var3 >= var5) {
                arg0.field1413 = "";
                arg0.field1420 = 0;
            } else {
                arg0.field1413 = this.field521[var3];
                arg0.field1420 = 1;
            }
        }
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(II)Ljava/lang/String;")
    public final String method120(int arg0, int arg1) {
        if (arg1 > this.field418 + 10) {
            return "Unknown";
        } else {
            long var3 = ((long) arg1 + 11745L) * 86400000L;
            Calendar var5 = Calendar.getInstance();
            var5.setTime(new Date(var3));
            int var6 = var5.get(5);
            int var7 = var5.get(2);
            int var8 = var5.get(1);
            String[] var9 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
            if (arg0 != 34211) {
                this.field300 = this.field323.method200();
            }
            return var6 + "-" + var9[var7] + "-" + var8;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)V")
    public final void method121(String arg0, String arg1, boolean arg2) {
        signlink.errorname = arg0;
        try {
            if (!arg2) {
                this.field502 = "";
                this.field503 = "Connecting to server...";
                this.method69(8, true);
            }
            this.field306 = new class1(this, this.method144(field469 + 43594), (byte) -45);
            long var4 = class11.method37(arg0);
            int var6 = (int) (var4 >> 16 & 31L);
            this.field415.field1652 = 0;
            this.field415.method455(14);
            this.field415.method455(var6);
            this.field306.method5(2, this.field415.field1651, 0, 0);
            for (int var7 = 0; var7 < 8; ++var7) {
                this.field306.method2();
            }
            int var8 = this.field306.method2();
            int var9 = var8;
            if (var8 == 0) {
                this.field306.method4(this.field232.field1651, 0, 8);
                this.field232.field1652 = 0;
                this.field603 = this.field232.method471(0);
                int[] var10 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (this.field603 >> 32), (int) this.field603 };
                this.field415.field1652 = 0;
                this.field415.method455(10);
                this.field415.method459(var10[0]);
                this.field415.method459(var10[1]);
                this.field415.method459(var10[2]);
                this.field415.method459(var10[3]);
                this.field415.method459(signlink.uid);
                this.field415.method462(arg0);
                this.field415.method462(arg1);
                this.field415.method480(field293, (byte) 4, field479);
                this.field488.field1652 = 0;
                if (arg2) {
                    this.field488.method455(18);
                } else {
                    this.field488.method455(16);
                }
                this.field488.method455(this.field415.field1652 + 36 + 1 + 1 + 2);
                this.field488.method455(255);
                this.field488.method456(347);
                this.field488.method455(field471 ? 1 : 0);
                for (int var11 = 0; var11 < 9; ++var11) {
                    this.field488.method459(this.field597[var11]);
                }
                this.field488.method463(this.field415.field1651, 0, -944, this.field415.field1652);
                this.field415.field1656 = new class16(-36942, var10);
                for (int var12 = 0; var12 < 4; ++var12) {
                    var10[var12] += 50;
                }
                this.field323 = new class16(-36942, var10);
                this.field306.method5(this.field488.field1652, this.field488.field1651, 0, 0);
                var8 = this.field306.method2();
            }
            if (var8 == 1) {
                try {
                    Thread.sleep(2000L);
                } catch (Exception var22) {
                }
                this.method121(arg0, arg1, arg2);
            } else if (var8 == 2) {
                this.field585 = this.field306.method2();
                field513 = this.field306.method2() == 1;
                this.field229 = 0L;
                this.field279 = 0;
                this.field533.field1282 = 0;
                super.field766 = true;
                this.field381 = true;
                this.field334 = true;
                this.field415.field1652 = 0;
                this.field232.field1652 = 0;
                this.field424 = -1;
                this.field543 = -1;
                this.field544 = -1;
                this.field545 = -1;
                this.field423 = 0;
                this.field425 = 0;
                this.field295 = 0;
                this.field427 = 0;
                this.field240 = 0;
                this.field250 = 0;
                this.field291 = false;
                super.field767 = 0;
                for (int var13 = 0; var13 < 100; ++var13) {
                    this.field228[var13] = null;
                }
                this.field233 = 0;
                this.field252 = 0;
                this.field594 = 0;
                this.field268 = 0;
                this.field364 = (int) (Math.random() * 100.0D) - 50;
                this.field634 = (int) (Math.random() * 110.0D) - 55;
                this.field394 = (int) (Math.random() * 80.0D) - 40;
                this.field257 = (int) (Math.random() * 120.0D) - 60;
                this.field378 = (int) (Math.random() * 30.0D) - 20;
                this.field372 = (int) (Math.random() * 20.0D) - 10 & 2047;
                this.field505 = 0;
                this.field450 = -1;
                this.field271 = 0;
                this.field272 = 0;
                this.field576 = 0;
                this.field194 = 0;
                for (int var14 = 0; var14 < this.field573; ++var14) {
                    this.field575[var14] = null;
                    this.field580[var14] = null;
                }
                for (int var15 = 0; var15 < 16384; ++var15) {
                    this.field193[var15] = null;
                }
                field178 = this.field575[this.field574] = new class48();
                this.field462.method365();
                this.field305.method365();
                for (int var16 = 0; var16 < 4; ++var16) {
                    for (int var17 = 0; var17 < 104; ++var17) {
                        for (int var18 = 0; var18 < 104; ++var18) {
                            this.field359[var16][var17][var18] = null;
                        }
                    }
                }
                this.field584 = new class60((byte) 0);
                this.field184 = 0;
                this.field183 = 0;
                this.method43(this.field339, 0);
                this.field339 = -1;
                this.method43(this.field475, 0);
                this.field475 = -1;
                this.method43(this.field391, 0);
                this.field391 = -1;
                this.method43(this.field356, 0);
                this.field356 = -1;
                this.method43(this.field247, 0);
                this.field247 = -1;
                this.method43(this.field409, 0);
                this.field409 = -1;
                this.method43(this.field181, 0);
                this.field181 = -1;
                this.field287 = false;
                this.field443 = 3;
                this.field588 = 0;
                this.field291 = false;
                this.field561 = false;
                this.field376 = null;
                this.field343 = 0;
                this.field605 = -1;
                this.field587 = true;
                this.method161((byte) -70);
                for (int var19 = 0; var19 < 5; ++var19) {
                    this.field285[var19] = 0;
                }
                for (int var20 = 0; var20 < 5; ++var20) {
                    this.field403[var20] = null;
                    this.field404[var20] = false;
                }
                field360 = 0;
                field187 = 0;
                field630 = 0;
                field591 = 0;
                field610 = 0;
                field313 = 0;
                field593 = 0;
                field299 = 0;
                field460 = 0;
                field256 = 0;
                this.method44(false);
            } else if (var8 == 3) {
                this.field502 = "";
                this.field503 = "Invalid username or password.";
            } else if (var8 == 4) {
                this.field502 = "Your account has been disabled.";
                this.field503 = "Please check your message-centre for details.";
            } else if (var8 == 5) {
                this.field502 = "Your account is already logged in.";
                this.field503 = "Try again in 60 secs...";
            } else if (var8 == 6) {
                this.field502 = "RuneScape has been updated!";
                this.field503 = "Please reload this page.";
            } else if (var8 == 7) {
                this.field502 = "This world is full.";
                this.field503 = "Please use a different world.";
            } else if (var8 == 8) {
                this.field502 = "Unable to connect.";
                this.field503 = "Login server offline.";
            } else if (var8 == 9) {
                this.field502 = "Login limit exceeded.";
                this.field503 = "Too many connections from your address.";
            } else if (var8 == 10) {
                this.field502 = "Unable to connect.";
                this.field503 = "Bad session id.";
            } else if (var8 == 11) {
                this.field502 = "Login server rejected session.";
                this.field503 = "Please try again.";
            } else if (var8 == 12) {
                this.field502 = "You need a members account to login to this world.";
                this.field503 = "Please subscribe, or use a different world.";
            } else if (var8 == 13) {
                this.field502 = "Could not complete login.";
                this.field503 = "Please try using a different world.";
            } else if (var8 == 14) {
                this.field502 = "The server is being updated.";
                this.field503 = "Please wait 1 minute and try again.";
            } else if (var8 == 15) {
                this.field334 = true;
                this.field415.field1652 = 0;
                this.field232.field1652 = 0;
                this.field424 = -1;
                this.field543 = -1;
                this.field544 = -1;
                this.field545 = -1;
                this.field423 = 0;
                this.field425 = 0;
                this.field295 = 0;
                this.field250 = 0;
                this.field291 = false;
                this.field223 = System.currentTimeMillis();
            } else if (var8 == 16) {
                this.field502 = "Login attempts exceeded.";
                this.field503 = "Please wait 1 minute and try again.";
            } else if (var8 == 17) {
                this.field502 = "You are standing in a members-only area.";
                this.field503 = "To play on this world move to a free area first";
            } else if (var8 == 20) {
                this.field502 = "Invalid loginserver requested";
                this.field503 = "Please try using a different world.";
            } else if (var8 != 21) {
                if (var8 == 22) {
                    this.field502 = "Malformed login packet.";
                    this.field503 = "Please try again.";
                } else if (var8 == -1) {
                    if (var9 == 0) {
                        if (this.field406 < 2) {
                            try {
                                Thread.sleep(2000L);
                            } catch (Exception var24) {
                            }
                            ++this.field406;
                            this.method121(arg0, arg1, arg2);
                        } else {
                            this.field502 = "No response from loginserver";
                            this.field503 = "Please wait 1 minute and try again.";
                        }
                    } else {
                        this.field502 = "No response from server";
                        this.field503 = "Please try using a different world.";
                    }
                } else {
                    System.out.println("response:" + var8);
                    this.field502 = "Unexpected server response";
                    this.field503 = "Please try using a different world.";
                }
            } else {
                int var21 = this.field306.method2();
                for (int var26 = var21 + 3; var26 >= 0; --var26) {
                    this.field502 = "You have only just left another world";
                    this.field503 = "Your profile will be transferred in: " + var26;
                    this.method69(8, true);
                    try {
                        Thread.sleep(1200L);
                    } catch (Exception var23) {
                    }
                }
                this.method121(arg0, arg1, arg2);
            }
        } catch (IOException var25) {
            this.field502 = "";
            this.field503 = "Error connecting to server.";
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LVSJQVIFL;I)V")
    public final void method122(class63 arg0, int arg1) {
        if (arg1 != 40149) {
            this.method81();
        }
        short var3 = 256;
        for (int var4 = 0; var4 < this.field476.length; ++var4) {
            this.field476[var4] = 0;
        }
        for (int var5 = 0; var5 < 5000; ++var5) {
            int var17 = (int) (Math.random() * 128.0D * (double) var3);
            this.field476[var17] = (int) (Math.random() * 256.0D);
        }
        for (int var6 = 0; var6 < 20; ++var6) {
            for (int var13 = 1; var13 < var3 - 1; ++var13) {
                for (int var15 = 1; var15 < 127; ++var15) {
                    int var16 = (var13 << 7) + var15;
                    this.field477[var16] = (this.field476[var16 - 1] + this.field476[var16 + 1] + this.field476[var16 - 128] + this.field476[var16 + 128]) / 4;
                }
            }
            int[] var14 = this.field476;
            this.field476 = this.field477;
            this.field477 = var14;
        }
        if (arg0 != null) {
            int var7 = 0;
            for (int var8 = 0; var8 < arg0.field1358; ++var8) {
                for (int var9 = 0; var9 < arg0.field1357; ++var9) {
                    if (arg0.field1355[var7++] != 0) {
                        int var10 = var9 + 16 + arg0.field1359;
                        int var11 = var8 + 16 + arg0.field1360;
                        int var12 = (var11 << 7) + var10;
                        this.field476[var12] = 0;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "i", descriptor = "(Z)V")
    public final void method123(boolean arg0) {
        try {
            if (this.field306 != null) {
                this.field306.method1();
            }
        } catch (Exception var3) {
        }
        this.field306 = null;
        this.field334 = false;
        this.field172 = 0;
        this.field437 = "";
        this.field438 = "";
        if (!arg0) {
            this.field424 = -1;
        }
        this.method48(0);
        this.field441.method502(-762);
        for (int var2 = 0; var2 < 4; ++var2) {
            this.field361[var2].method213();
        }
        System.gc();
        this.method134((byte) -30);
        this.field224 = -1;
        this.field353 = -1;
        this.field238 = 0;
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)V")
    public final void method124(String arg0, String arg1, boolean arg2) {
        this.field334 &= arg2;
        if (this.field541 != null) {
            this.field541.method34(2);
            class64.field1378 = this.field430;
            int var4 = 151;
            if (arg0 != null) {
                var4 -= 7;
            }
            this.field637.method271(arg1, false, 0, var4, 257);
            this.field637.method271(arg1, false, 16777215, var4 - 1, 256);
            var4 += 15;
            if (arg0 != null) {
                this.field637.method271(arg0, false, 0, var4, 257);
                this.field637.method271(arg0, false, 16777215, var4 - 1, 256);
            }
            this.field541.method35(super.field761, 4, 4, this.field508);
        } else if (super.field762 != null) {
            super.field762.method34(2);
            class64.field1378 = this.field431;
            int var5 = 251;
            short var6 = 300;
            byte var7 = 50;
            class24.method245(var5 - 5 - var7 / 2, 0, 383 - var6 / 2, false, var6, var7);
            class24.method246(false, 16777215, var5 - 5 - var7 / 2, var6, 383 - var6 / 2, var7);
            if (arg0 != null) {
                var5 -= 7;
            }
            this.field637.method271(arg1, false, 0, var5, 383);
            this.field637.method271(arg1, false, 16777215, var5 - 1, 382);
            var5 += 15;
            if (arg0 != null) {
                this.field637.method271(arg0, false, 0, var5, 383);
                this.field637.method271(arg0, false, 16777215, var5 - 1, 382);
            }
            super.field762.method35(super.field761, 0, 0, this.field508);
        }
    }

    @OriginalMember(owner = "client", name = "r", descriptor = "(I)V")
    public final void method125(int arg0) {
        if (this.field427 > 0) {
            this.method123(true);
        } else {
            this.method124("Please wait - attempting to reestablish", "Connection lost", true);
            this.field505 = 0;
            this.field271 = 0;
            class1 var2 = this.field306;
            this.field334 = false;
            if (arg0 != 18674) {
                for (int var3 = 1; var3 > 0; ++var3) {
                }
            }
            this.field406 = 0;
            this.method121(this.field437, this.field438, true);
            if (!this.field334) {
                this.method123(true);
            }
            try {
                var2.method1();
            } catch (Exception var4) {
            }
        }
    }

    @OriginalMember(owner = "client", name = "s", descriptor = "(I)I")
    public final int method126(int arg0) {
        if (arg0 >= 0) {
            this.field424 = -1;
        }
        int var2 = 3;
        if (this.field458 < 310) {
            int var3 = this.field455 >> 7;
            int var4 = this.field457 >> 7;
            int var5 = field178.field731 >> 7;
            int var6 = field178.field732 >> 7;
            if ((this.field218[this.field405][var3][var4] & 4) != 0) {
                var2 = this.field405;
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
                    if ((this.field218[this.field405][var3][var4] & 4) != 0) {
                        var2 = this.field405;
                    }
                    var10 += var9;
                    if (var10 >= 65536) {
                        var10 -= 65536;
                        if (var4 < var6) {
                            ++var4;
                        } else if (var4 > var6) {
                            --var4;
                        }
                        if ((this.field218[this.field405][var3][var4] & 4) != 0) {
                            var2 = this.field405;
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
                    if ((this.field218[this.field405][var3][var4] & 4) != 0) {
                        var2 = this.field405;
                    }
                    var12 += var11;
                    if (var12 >= 65536) {
                        var12 -= 65536;
                        if (var3 < var5) {
                            ++var3;
                        } else if (var3 > var5) {
                            --var3;
                        }
                        if ((this.field218[this.field405][var3][var4] & 4) != 0) {
                            var2 = this.field405;
                        }
                    }
                }
            }
        }
        if ((this.field218[this.field405][field178.field731 >> 7][field178.field732 >> 7] & 4) != 0) {
            var2 = this.field405;
        }
        return var2;
    }

    @OriginalMember(owner = "client", name = "t", descriptor = "(I)I")
    public final int method127(int arg0) {
        int var2 = this.method95(this.field455, this.field457, this.field405, -738);
        if (arg0 < 5 || arg0 > 5) {
            this.field169 = !this.field169;
        }
        return var2 - this.field456 < 800 && (this.field218[this.field405][this.field455 >> 7][this.field457 >> 7] & 4) != 0 ? this.field405 : 3;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZI)V")
    public final void method128(boolean arg0, int arg1) {
        class65 var3 = class65.method395(arg1);
        for (int var4 = 0; var4 < var3.field1437.length && var3.field1437[var4] != -1; ++var4) {
            class65 var5 = class65.method395(var3.field1437[var4]);
            if (var5.field1462 == 1) {
                this.method128(true, var5.field1398);
            }
            var5.field1451 = 0;
            var5.field1414 = 0;
        }
        this.field334 &= arg0;
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(ZI)V")
    public final void method129(boolean arg0, int arg1) {
        int[] var3 = this.field273.field1307;
        int var4 = var3.length;
        for (int var5 = 0; var5 < var4; ++var5) {
            var3[var5] = 0;
        }
        for (int var6 = 1; var6 < 103; ++var6) {
            int var23 = (103 - var6) * 512 * 4 + 24628;
            for (int var24 = 1; var24 < 103; ++var24) {
                if ((this.field218[arg1][var24][var6] & 24) == 0) {
                    this.field441.method537(var3, var23, 512, arg1, var24, var6);
                }
                if (arg1 < 3 && (this.field218[arg1 + 1][var24][var6] & 8) != 0) {
                    this.field441.method537(var3, var23, 512, arg1 + 1, var24, var6);
                }
                var23 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        if (arg0) {
            this.field424 = -1;
        }
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        this.field273.method335(2);
        for (int var9 = 1; var9 < 103; ++var9) {
            for (int var22 = 1; var22 < 103; ++var22) {
                if ((this.field218[arg1][var22][var9] & 24) == 0) {
                    this.method55(var22, var9, arg1, -429, var8, var7);
                }
                if (arg1 < 3 && (this.field218[arg1 + 1][var22][var9] & 8) != 0) {
                    this.method55(var22, var9, arg1 + 1, -429, var8, var7);
                }
            }
        }
        if (this.field541 != null) {
            this.field541.method34(2);
            class64.field1378 = this.field430;
        }
        ++field333;
        if (field333 > 133) {
            field333 = 0;
            this.field415.method454(4, 149);
            this.field415.method458(4428546);
        }
        this.field434 = 0;
        for (int var10 = 0; var10 < 104; ++var10) {
            for (int var11 = 0; var11 < 104; ++var11) {
                int var12 = this.field441.method531(this.field405, var10, var11);
                if (var12 != 0) {
                    int var13 = var12 >> 14 & 32767;
                    int var14 = class8.method30(var13).field104;
                    if (var14 >= 0) {
                        int var15 = var10;
                        int var16 = var11;
                        if (var14 != 22 && var14 != 29 && var14 != 34 && var14 != 36 && var14 != 46 && var14 != 47 && var14 != 48) {
                            byte var17 = 104;
                            byte var18 = 104;
                            int[][] var19 = this.field361[this.field405].field828;
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
                        this.field485[this.field434] = this.field474[var14];
                        this.field435[this.field434] = var15;
                        this.field436[this.field434] = var16;
                        ++this.field434;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "u", descriptor = "(I)Z")
    public final boolean method130(int arg0) {
        if (arg0 < 0) {
            return signlink.wavereplay();
        } else {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "client", name = "v", descriptor = "(I)V")
    public final void method131(int arg0) {
        int var2 = this.field638.method273(false, "Choose Option");
        for (int var3 = 0; var3 < this.field250; ++var3) {
            int var11 = this.field638.method273(false, this.field581[var3]);
            if (var11 > var2) {
                var2 = var11;
            }
        }
        var2 += 8;
        if (arg0 <= 0) {
            this.field415.method455(165);
        }
        int var4 = this.field250 * 15 + 21;
        if (super.field776 > 4 && super.field777 > 4 && super.field776 < 516 && super.field777 < 338) {
            int var5 = super.field776 - 4 - var2 / 2;
            if (var2 + var5 > 512) {
                var5 = 512 - var2;
            }
            if (var5 < 0) {
                var5 = 0;
            }
            int var6 = super.field777 - 4;
            if (var4 + var6 > 334) {
                var6 = 334 - var4;
            }
            if (var6 < 0) {
                var6 = 0;
            }
            this.field291 = true;
            this.field200 = 0;
            this.field201 = var5;
            this.field202 = var6;
            this.field203 = var2;
            this.field204 = this.field250 * 15 + 22;
        }
        if (super.field776 > 553 && super.field777 > 205 && super.field776 < 743 && super.field777 < 466) {
            int var7 = super.field776 - 553 - var2 / 2;
            if (var7 < 0) {
                var7 = 0;
            } else if (var2 + var7 > 190) {
                var7 = 190 - var2;
            }
            int var8 = super.field777 - 205;
            if (var8 < 0) {
                var8 = 0;
            } else if (var4 + var8 > 261) {
                var8 = 261 - var4;
            }
            this.field291 = true;
            this.field200 = 1;
            this.field201 = var7;
            this.field202 = var8;
            this.field203 = var2;
            this.field204 = this.field250 * 15 + 22;
        }
        if (super.field776 > 17 && super.field777 > 357 && super.field776 < 496 && super.field777 < 453) {
            int var9 = super.field776 - 17 - var2 / 2;
            if (var9 < 0) {
                var9 = 0;
            } else if (var2 + var9 > 479) {
                var9 = 479 - var2;
            }
            int var10 = super.field777 - 357;
            if (var10 < 0) {
                var10 = 0;
            } else if (var4 + var10 > 96) {
                var10 = 96 - var4;
            }
            this.field291 = true;
            this.field200 = 2;
            this.field201 = var9;
            this.field202 = var10;
            this.field203 = var2;
            this.field204 = this.field250 * 15 + 22;
        }
    }

    @OriginalMember(owner = "client", name = "run", descriptor = "()V")
    public final void run() {
        if (this.field538) {
            this.method136(6);
        } else {
            super.run();
        }
    }

    @OriginalMember(owner = "client", name = "j", descriptor = "(Z)V")
    public final void method132(boolean arg0) {
        if (this.field162 == 0) {
            this.field581[0] = "Cancel";
            if (!arg0) {
                for (int var2 = 1; var2 > 0; ++var2) {
                }
            }
            this.field627[0] = 1027;
            this.field250 = 1;
            if (this.field356 != -1) {
                this.field504 = 0;
                this.field583 = 0;
                this.method153(class65.method395(this.field356), super.field770, 0, super.field769, 9, 0, 0, 0);
                if (this.field629 != this.field504) {
                    this.field629 = this.field504;
                }
                if (this.field583 != this.field283) {
                    this.field283 = this.field583;
                }
            } else {
                this.method156(794);
                this.field504 = 0;
                this.field583 = 0;
                if (super.field769 > 4 && super.field770 > 4 && super.field769 < 516 && super.field770 < 338) {
                    if (this.field391 != -1) {
                        this.method153(class65.method395(this.field391), super.field770, 4, super.field769, 9, 0, 4, 0);
                    } else {
                        this.method75(-883);
                    }
                }
                if (this.field629 != this.field504) {
                    this.field629 = this.field504;
                }
                if (this.field583 != this.field283) {
                    this.field283 = this.field583;
                }
                this.field504 = 0;
                this.field583 = 0;
                if (super.field769 > 553 && super.field770 > 205 && super.field769 < 743 && super.field770 < 466) {
                    if (this.field409 != -1) {
                        this.method153(class65.method395(this.field409), super.field770, 553, super.field769, 9, 0, 205, 1);
                    } else if (this.field531[this.field443] != -1) {
                        this.method153(class65.method395(this.field531[this.field443]), super.field770, 553, super.field769, 9, 0, 205, 1);
                    }
                }
                if (this.field504 != this.field292) {
                    this.field515 = true;
                    this.field292 = this.field504;
                }
                if (this.field583 != this.field246) {
                    this.field515 = true;
                    this.field246 = this.field583;
                }
                this.field504 = 0;
                this.field583 = 0;
                if (super.field769 > 17 && super.field770 > 357 && super.field769 < 496 && super.field770 < 453) {
                    if (this.field475 != -1) {
                        this.method153(class65.method395(this.field475), super.field770, 17, super.field769, 9, 0, 357, 2);
                    } else if (this.field339 != -1) {
                        this.method153(class65.method395(this.field339), super.field770, 17, super.field769, 9, 0, 357, 3);
                    } else if (super.field770 < 434 && super.field769 < 426) {
                        this.method187(super.field770 - 357, super.field769 - 17, 8);
                    }
                }
                if ((this.field475 != -1 || this.field339 != -1) && this.field504 != this.field472) {
                    this.field338 = true;
                    this.field472 = this.field504;
                }
                if ((this.field475 != -1 || this.field339 != -1) && this.field583 != this.field401) {
                    this.field338 = true;
                    this.field401 = this.field583;
                }
                boolean var3 = false;
                while (!var3) {
                    var3 = true;
                    for (int var4 = 0; var4 < this.field250 - 1; ++var4) {
                        if (this.field627[var4] < 1000 && this.field627[var4 + 1] > 1000) {
                            String var5 = this.field581[var4];
                            this.field581[var4] = this.field581[var4 + 1];
                            this.field581[var4 + 1] = var5;
                            int var6 = this.field627[var4];
                            this.field627[var4] = this.field627[var4 + 1];
                            this.field627[var4 + 1] = var6;
                            int var7 = this.field625[var4];
                            this.field625[var4] = this.field625[var4 + 1];
                            this.field625[var4 + 1] = var7;
                            int var8 = this.field626[var4];
                            this.field626[var4] = this.field626[var4 + 1];
                            this.field626[var4 + 1] = var8;
                            int var9 = this.field628[var4];
                            this.field628[var4] = this.field628[var4 + 1];
                            this.field628[var4 + 1] = var9;
                            var3 = false;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IILjava/lang/String;Ljava/lang/String;)V")
    public final void method133(int arg0, int arg1, String arg2, String arg3) {
        if (arg0 != 1) {
            field179 = this.field323.method200();
        }
        if (arg1 == 0 && this.field339 != -1) {
            this.field376 = arg3;
            super.field775 = 0;
        }
        if (this.field475 == -1) {
            this.field338 = true;
        }
        for (int var5 = 99; var5 > 0; --var5) {
            this.field226[var5] = this.field226[var5 - 1];
            this.field227[var5] = this.field227[var5 - 1];
            this.field228[var5] = this.field228[var5 - 1];
        }
        this.field226[0] = arg1;
        this.field227[0] = arg2;
        this.field228[0] = arg3;
    }

    @OriginalMember(owner = "client", name = "i", descriptor = "(B)V")
    public final void method134(byte arg0) {
        signlink.midiplay = false;
        signlink.midifade = 0;
        signlink.midi = "stop";
        if (arg0 != -30) {
            field507 = !field507;
        }
    }

    @OriginalMember(owner = "client", name = "j", descriptor = "(B)V")
    public final void method135(byte arg0) {
        if (this.field174 != 0) {
            class34 var2 = this.field637;
            int var3 = 0;
            if (this.field295 != 0) {
                var3 = 1;
            }
            for (int var4 = 0; var4 < 100; ++var4) {
                if (this.field228[var4] != null) {
                    int var5 = this.field226[var4];
                    String var6 = this.field227[var4];
                    byte var7 = 0;
                    if (var6 != null && var6.startsWith("@cr1@")) {
                        var6 = var6.substring(5);
                        var7 = 1;
                    }
                    if (var6 != null && var6.startsWith("@cr2@")) {
                        var6 = var6.substring(5);
                        var7 = 2;
                    }
                    if ((var5 == 3 || var5 == 7) && (var5 == 7 || this.field408 == 0 || this.field408 == 1 && this.method186((byte) 20, var6))) {
                        int var8 = 329 - var3 * 13;
                        byte var9 = 4;
                        var2.method275(var8, var9, 0, "From", (byte) 6);
                        var2.method275(var8 - 1, var9, 65535, "From", (byte) 6);
                        int var10 = var9 + var2.method273(false, "From ");
                        if (var7 == 1) {
                            this.field380[0].method374(var8 - 12, false, var10);
                            var10 += 14;
                        }
                        if (var7 == 2) {
                            this.field380[1].method374(var8 - 12, false, var10);
                            var10 += 14;
                        }
                        var2.method275(var8, var10, 0, var6 + ": " + this.field228[var4], (byte) 6);
                        var2.method275(var8 - 1, var10, 65535, var6 + ": " + this.field228[var4], (byte) 6);
                        ++var3;
                        if (var3 >= 5) {
                            return;
                        }
                    }
                    if (var5 == 5 && this.field408 < 2) {
                        int var11 = 329 - var3 * 13;
                        var2.method275(var11, 4, 0, this.field228[var4], (byte) 6);
                        var2.method275(var11 - 1, 4, 65535, this.field228[var4], (byte) 6);
                        ++var3;
                        if (var3 >= 5) {
                            return;
                        }
                    }
                    if (var5 == 6 && this.field408 < 2) {
                        int var12 = 329 - var3 * 13;
                        var2.method275(var12, 4, 0, "To " + var6 + ": " + this.field228[var4], (byte) 6);
                        var2.method275(var12 - 1, 4, 65535, "To " + var6 + ": " + this.field228[var4], (byte) 6);
                        ++var3;
                        if (var3 >= 5) {
                            return;
                        }
                    }
                }
            }
            if (arg0 == 2) {
                ;
            }
        }
    }

    @OriginalMember(owner = "client", name = "w", descriptor = "(I)V")
    public final void method136(int arg0) {
        if (arg0 != 6) {
            field507 = !field507;
        }
        this.field377 = true;
        try {
            long var2 = System.currentTimeMillis();
            int var4 = 0;
            int var5 = 20;
            while (this.field432) {
                ++this.field624;
                this.method87((byte) 58);
                this.method87((byte) 58);
                this.method165(false);
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
        this.field377 = false;
    }

    @OriginalMember(owner = "client", name = "x", descriptor = "(I)V")
    public final void method137(int arg0) {
        this.method135((byte) 2);
        if (this.field448 == 1) {
            this.field598[this.field447 / 100].method340(this.field446 - 8 - 4, false, this.field445 - 8 - 4);
            ++field537;
            if (field537 > 83) {
                field537 = 0;
                this.field415.method454(4, 137);
            }
        }
        if (this.field448 == 2) {
            this.field598[this.field447 / 100 + 4].method340(this.field446 - 8 - 4, false, this.field445 - 8 - 4);
        }
        if (this.field181 != -1) {
            this.method162(this.field181, this.field452, 0);
            this.method83(0, 6, 0, class65.method395(this.field181), 0);
        }
        if (this.field391 != -1) {
            this.method162(this.field391, this.field452, 0);
            this.method83(0, 6, 0, class65.method395(this.field391), 0);
        }
        this.method151(this.field604);
        if (arg0 >= 0) {
            this.field359 = null;
        }
        if (!this.field291) {
            this.method132(true);
            this.method157(-32751);
        } else if (this.field200 == 0) {
            this.method149((byte) 51);
        }
        if (this.field343 == 1) {
            this.field386.method340(296, false, 472);
        }
        if (field352) {
            short var2 = 507;
            byte var3 = 20;
            int var4 = 16776960;
            if (super.field757 < 30 && field471) {
                var4 = 16711680;
            }
            if (super.field757 < 20 && !field471) {
                var4 = 16711680;
            }
            this.field637.method270(var3, "Fps:" + super.field757, var2, -54, var4);
            int var13 = var3 + 15;
            Runtime var5 = Runtime.getRuntime();
            int var6 = (int) ((var5.totalMemory() - var5.freeMemory()) / 1024L);
            int var7 = 16776960;
            if (var6 > 33554432 && field471) {
                int var8 = 16711680;
            }
            if (var6 > 67108864 && !field471) {
                int var9 = 16711680;
            }
            this.field637.method270(var13, "Mem:" + var6 + "k", var2, -54, 16776960);
            var13 += 15;
        }
        if (this.field295 != 0) {
            int var10 = this.field295 / 50;
            int var11 = var10 / 60;
            int var12 = var10 % 60;
            if (var12 < 10) {
                this.field637.method275(329, 4, 16776960, "System update in: " + var11 + ":0" + var12, (byte) 6);
            } else {
                this.field637.method275(329, 4, 16776960, "System update in: " + var11 + ":" + var12, (byte) 6);
            }
        }
    }

    @OriginalMember(owner = "client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        try {
            System.out.println("RS2 user client - release #" + 347);
            if (arg0.length != 5) {
                System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
            } else {
                field468 = Integer.parseInt(arg0[0]);
                field469 = Integer.parseInt(arg0[1]);
                if (arg0[2].equals("lowmem")) {
                    method46(-34690);
                } else {
                    if (!arg0[2].equals("highmem")) {
                        System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
                        return;
                    }
                    method49(-693);
                }
                if (arg0[3].equals("free")) {
                    field470 = false;
                } else {
                    if (!arg0[3].equals("members")) {
                        System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
                        return;
                    }
                    field470 = true;
                }
                signlink.storeid = Integer.parseInt(arg0[4]);
                signlink.startpriv(InetAddress.getLocalHost());
                client var1 = new client();
                var1.method207((byte) 6, 503, 765);
            }
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(JZ)V")
    public final void method138(long arg0, boolean arg1) {
        if (arg0 != 0L) {
            for (int var4 = 0; var4 < this.field249; ++var4) {
                if (this.field261[var4] == arg0) {
                    --this.field249;
                    this.field515 = true;
                    for (int var5 = var4; var5 < this.field249; ++var5) {
                        this.field261[var5] = this.field261[var5 + 1];
                    }
                    this.field415.method454(4, 135);
                    this.field415.method461(this.field511, arg0);
                    break;
                }
            }
            if (!arg1) {
                this.field415.method455(155);
            }
        }
    }

    @OriginalMember(owner = "client", name = "k", descriptor = "(B)V")
    public final void method139(byte arg0) {
        if (arg0 != 2) {
            this.field424 = this.field232.method465();
        }
        while (true) {
            class57 var2 = this.field241.method292();
            if (var2 == null) {
                return;
            }
            if (var2.field1324 == 0) {
                class66.method405(var2.field1323, 54, var2.field1327);
                if ((this.field241.method294(var2.field1327, field599) & 98) != 0) {
                    this.field515 = true;
                    if (this.field475 != -1 || this.field339 != -1) {
                        this.field338 = true;
                    }
                }
            }
            if (var2.field1324 == 1 && var2.field1323 != null) {
                class2.method8(false, var2.field1323);
            }
            if (var2.field1324 == 2 && this.field353 == var2.field1327 && var2.field1323 != null) {
                this.method97(this.field354, var2.field1323, -3220);
            }
            if (var2.field1324 == 3 && this.field594 == 1) {
                for (int var3 = 0; var3 < this.field270.length; ++var3) {
                    if (this.field388[var3] == var2.field1327) {
                        this.field270[var3] = var2.field1323;
                        if (var2.field1323 == null) {
                            this.field388[var3] = -1;
                        }
                        break;
                    }
                    if (this.field389[var3] == var2.field1327) {
                        this.field383[var3] = var2.field1323;
                        if (var2.field1323 == null) {
                            this.field389[var3] = -1;
                        }
                        break;
                    }
                }
            }
            if (var2.field1324 == 93 && this.field241.method305(var2.field1327, -742)) {
                class67.method436(new class69(var2.field1323, -82), false, this.field241);
            }
        }
    }

    @OriginalMember(owner = "client", name = "l", descriptor = "(B)Z")
    public final boolean method140(byte arg0) {
        if (arg0 != 1) {
            this.field424 = this.field232.method465();
        }
        if (this.field306 == null) {
            return false;
        } else {
            try {
                int var2 = this.field306.method3();
                if (var2 == 0) {
                    return false;
                }
                if (this.field424 == -1) {
                    this.field306.method4(this.field232.field1651, 0, 1);
                    this.field424 = this.field232.field1651[0] & 255;
                    if (this.field323 != null) {
                        this.field424 = this.field424 - this.field323.method200() & 255;
                    }
                    this.field423 = class28.field920[this.field424];
                    --var2;
                }
                if (this.field423 == -1) {
                    if (var2 <= 0) {
                        return false;
                    }
                    this.field306.method4(this.field232.field1651, 0, 1);
                    this.field423 = this.field232.field1651[0] & 255;
                    --var2;
                }
                if (this.field423 == -2) {
                    if (var2 <= 1) {
                        return false;
                    }
                    this.field306.method4(this.field232.field1651, 0, 2);
                    this.field232.field1652 = 0;
                    this.field423 = this.field232.method467();
                    var2 -= 2;
                }
                if (var2 < this.field423) {
                    return false;
                }
                this.field232.field1652 = 0;
                this.field306.method4(this.field232.field1651, 0, this.field423);
                this.field425 = 0;
                this.field545 = this.field544;
                this.field544 = this.field543;
                this.field543 = this.field424;
                if (this.field424 == 169) {
                    int var3 = this.field232.method491(455);
                    int var4 = this.field232.method493(0);
                    if (this.field475 != -1) {
                        this.method43(this.field475, 0);
                        this.field475 = -1;
                        this.field338 = true;
                    }
                    if (this.field356 != -1) {
                        this.method43(this.field356, 0);
                        this.field356 = -1;
                        this.field369 = true;
                    }
                    if (this.field247 != -1) {
                        this.method43(this.field247, 0);
                        this.field247 = -1;
                    }
                    if (this.field391 != var3) {
                        this.method43(this.field391, 0);
                        this.field391 = var3;
                    }
                    if (this.field409 != var4) {
                        this.method43(this.field409, 0);
                        this.field409 = var4;
                    }
                    if (this.field588 != 0) {
                        this.field588 = 0;
                        this.field338 = true;
                    }
                    this.field515 = true;
                    this.field289 = true;
                    this.field287 = false;
                    this.field424 = -1;
                    return true;
                }
                if (this.field424 == 79) {
                    int var5 = this.field232.method467();
                    int var6 = this.field232.method493(0);
                    int var7 = this.field232.method493(0);
                    int var8 = this.field232.method492(0);
                    class65.method395(var7).field1418 = var5;
                    class65.method395(var7).field1419 = var8;
                    class65.method395(var7).field1417 = var6;
                    this.field424 = -1;
                    return true;
                }
                if (this.field424 == 30) {
                    this.field605 = this.field232.method465();
                    if (this.field605 == this.field443) {
                        if (this.field605 == 3) {
                            this.field443 = 1;
                        } else {
                            this.field443 = 3;
                        }
                        this.field515 = true;
                    }
                    this.field424 = -1;
                    return true;
                }
                if (this.field424 == 170) {
                    this.field284 = this.field232.method493(0);
                    this.field495 = this.field232.method483(-270);
                    this.field424 = -1;
                    return true;
                }
                if (this.field424 == 9) {
                    if (this.field443 == 12) {
                        this.field515 = true;
                    }
                    this.field592 = this.field232.method465();
                    this.field424 = -1;
                    return true;
                }
                if (this.field424 == 149) {
                    this.field418 = this.field232.method492(0);
                    this.field411 = this.field232.method491(455);
                    this.field410 = this.field232.method498(-404);
                    this.field486 = this.field232.method465();
                    this.field611 = this.field232.method493(0);
                    this.field440 = this.field232.method493(0);
                    this.field451 = this.field232.method493(0);
                    this.field349 = this.field232.method467();
                    this.field601 = this.field232.method467();
                    this.field351 = this.field232.method493(0);
                    this.field317 = this.field232.method491(455);
                    signlink.dnslookup(class11.method40(this.field410, false));
                    this.field424 = -1;
                    return true;
                }
                if (this.field424 == 155) {
                    this.method123(true);
                    this.field424 = -1;
                    return false;
                }
                if (this.field424 == 105) {
                    for (int var9 = 0; var9 < this.field575.length; ++var9) {
                        if (this.field575[var9] != null) {
                            this.field575[var9].field686 = -1;
                        }
                    }
                    for (int var10 = 0; var10 < this.field193.length; ++var10) {
                        if (this.field193[var10] != null) {
                            this.field193[var10].field686 = -1;
                        }
                    }
                    this.field424 = -1;
                    return true;
                }
                if (this.field424 == 64) {
                    this.field515 = true;
                    int var11 = this.field232.method467();
                    class65 var12 = class65.method395(var11);
                    int var13 = this.field232.method467();
                    for (int var14 = 0; var14 < var13; ++var14) {
                        int var15 = this.field232.method483(-270);
                        if (var15 == 255) {
                            var15 = this.field232.method498(-404);
                        }
                        var12.field1431[var14] = this.field232.method491(455);
                        var12.field1395[var14] = var15;
                    }
                    for (int var16 = var13; var16 < var12.field1431.length; ++var16) {
                        var12.field1431[var16] = 0;
                        var12.field1395[var16] = 0;
                    }
                    this.field424 = -1;
                    return true;
                }
                if (this.field424 == 142) {
                    long var17 = this.field232.method471(0);
                    int var19 = this.field232.method465();
                    String var20 = class11.method41(class11.method38(this.field487, var17), 42484);
                    for (int var21 = 0; var21 < this.field183; ++var21) {
                        if (this.field230[var21] == var17) {
                            if (this.field278[var21] != var19) {
                                this.field278[var21] = var19;
                                this.field515 = true;
                                if (var19 > 0) {
                                    this.method133(1, 5, "", var20 + " has logged in.");
                                }
                                if (var19 == 0) {
                                    this.method133(1, 5, "", var20 + " has logged out.");
                                }
                            }
                            var20 = null;
                            break;
                        }
                    }
                    if (var20 != null && this.field183 < 200) {
                        this.field230[this.field183] = var17;
                        this.field521[this.field183] = var20;
                        this.field278[this.field183] = var19;
                        ++this.field183;
                        this.field515 = true;
                    }
                    boolean var22 = false;
                    while (!var22) {
                        var22 = true;
                        for (int var23 = 0; var23 < this.field183 - 1; ++var23) {
                            if (this.field278[var23] != field468 && this.field278[var23 + 1] == field468 || this.field278[var23] == 0 && this.field278[var23 + 1] != 0) {
                                int var24 = this.field278[var23];
                                this.field278[var23] = this.field278[var23 + 1];
                                this.field278[var23 + 1] = var24;
                                String var25 = this.field521[var23];
                                this.field521[var23] = this.field521[var23 + 1];
                                this.field521[var23 + 1] = var25;
                                long var26 = this.field230[var23];
                                this.field230[var23] = this.field230[var23 + 1];
                                this.field230[var23 + 1] = var26;
                                this.field515 = true;
                                var22 = false;
                            }
                        }
                    }
                    this.field424 = -1;
                    return true;
                }
                if (this.field424 == 210) {
                    long var28 = this.field232.method471(0);
                    int var30 = this.field232.method470();
                    int var31 = this.field232.method465();
                    boolean var32 = false;
                    for (int var33 = 0; var33 < 100; ++var33) {
                        if (this.field260[var33] == var30) {
                            var32 = true;
                            break;
                        }
                    }
                    if (var31 <= 1) {
                        for (int var34 = 0; var34 < this.field249; ++var34) {
                            if (this.field261[var34] == var28) {
                                var32 = true;
                                break;
                            }
                        }
                    }
                    if (!var32 && this.field208 == 0) {
                        try {
                            this.field260[this.field248] = var30;
                            this.field248 = (this.field248 + 1) % 100;
                            String var35 = class62.method366(this.field232, 7, this.field423 - 13);
                            if (var31 != 3) {
                                var35 = class72.method571(true, var35);
                            }
                            if (var31 != 2 && var31 != 3) {
                                if (var31 == 1) {
                                    this.method133(1, 7, "@cr1@" + class11.method41(class11.method38(this.field487, var28), 42484), var35);
                                } else {
                                    this.method133(1, 3, class11.method41(class11.method38(this.field487, var28), 42484), var35);
                                }
                            } else {
                                this.method133(1, 7, "@cr2@" + class11.method41(class11.method38(this.field487, var28), 42484), var35);
                            }
                        } catch (Exception var190) {
                            signlink.reporterror("cde1");
                        }
                    }
                    this.field424 = -1;
                    return true;
                }
                if (this.field424 == 248) {
                    int var37 = this.field232.method491(455);
                    this.method128(true, var37);
                    if (this.field475 != -1) {
                        this.method43(this.field475, 0);
                        this.field475 = -1;
                        this.field338 = true;
                    }
                    if (this.field356 != -1) {
                        this.method43(this.field356, 0);
                        this.field356 = -1;
                        this.field369 = true;
                    }
                    if (this.field247 != -1) {
                        this.method43(this.field247, 0);
                        this.field247 = -1;
                    }
                    if (this.field391 != -1) {
                        this.method43(this.field391, 0);
                        this.field391 = -1;
                    }
                    if (this.field409 != var37) {
                        this.method43(this.field409, 0);
                        this.field409 = var37;
                    }
                    if (this.field588 != 0) {
                        this.field588 = 0;
                        this.field338 = true;
                    }
                    this.field515 = true;
                    this.field289 = true;
                    this.field287 = false;
                    this.field424 = -1;
                    return true;
                }
                if (this.field424 == 172) {
                    for (int var38 = 0; var38 < this.field320.length; ++var38) {
                        if (this.field366[var38] != this.field320[var38]) {
                            this.field320[var38] = this.field366[var38];
                            this.method73(var38, 5);
                            this.field515 = true;
                        }
                    }
                    this.field424 = -1;
                    return true;
                }
                if (this.field424 == 244) {
                    this.field240 = this.field232.method465();
                    if (this.field240 == 1) {
                        this.field199 = this.field232.method467();
                    }
                    if (this.field240 >= 2 && this.field240 <= 6) {
                        if (this.field240 == 2) {
                            this.field519 = 64;
                            this.field520 = 64;
                        }
                        if (this.field240 == 3) {
                            this.field519 = 0;
                            this.field520 = 64;
                        }
                        if (this.field240 == 4) {
                            this.field519 = 128;
                            this.field520 = 64;
                        }
                        if (this.field240 == 5) {
                            this.field519 = 64;
                            this.field520 = 0;
                        }
                        if (this.field240 == 6) {
                            this.field519 = 64;
                            this.field520 = 128;
                        }
                        this.field240 = 2;
                        this.field516 = this.field232.method467();
                        this.field517 = this.field232.method467();
                        this.field518 = this.field232.method465();
                    }
                    if (this.field240 == 10) {
                        this.field274 = this.field232.method467();
                    }
                    this.field424 = -1;
                    return true;
                }
                if (this.field424 == 111) {
                    if (this.field443 == 12) {
                        this.field515 = true;
                    }
                    this.field491 = this.field232.method468();
                    this.field424 = -1;
                    return true;
                }
                if (this.field424 == 224) {
                    this.field535 = true;
                    this.field324 = this.field232.method465();
                    this.field325 = this.field232.method465();
                    this.field326 = this.field232.method467();
                    this.field327 = this.field232.method465();
                    this.field328 = this.field232.method465();
                    if (this.field328 >= 100) {
                        int var39 = this.field324 * 128 + 64;
                        int var40 = this.field325 * 128 + 64;
                        int var41 = this.method95(var39, var40, this.field405, -738) - this.field326;
                        int var42 = var39 - this.field455;
                        int var43 = var41 - this.field456;
                        int var44 = var40 - this.field457;
                        int var45 = (int) Math.sqrt((double) (var42 * var42 + var44 * var44));
                        this.field458 = (int) (Math.atan2((double) var43, (double) var45) * 325.949D) & 2047;
                        this.field459 = (int) (Math.atan2((double) var42, (double) var44) * -325.949D) & 2047;
                        if (this.field458 < 128) {
                            this.field458 = 128;
                        }
                        if (this.field458 > 383) {
                            this.field458 = 383;
                        }
                    }
                    this.field424 = -1;
                    return true;
                }
                if (this.field424 == 165) {
                    int var46 = this.field232.method495(0);
                    if (var46 >= 0) {
                        this.method128(true, var46);
                    }
                    if (this.field181 != var46) {
                        this.method43(this.field181, 0);
                        this.field181 = var46;
                    }
                    this.field424 = -1;
                    return true;
                }
                if (this.field424 == 75) {
                    this.field555 = this.field232.method485(this.field207);
                    this.field554 = this.field232.method485(this.field207);
                    for (int var47 = this.field554; var47 < this.field554 + 8; ++var47) {
                        for (int var48 = this.field555; var48 < this.field555 + 8; ++var48) {
                            if (this.field359[this.field405][var47][var48] != null) {
                                this.field359[this.field405][var47][var48] = null;
                                this.method74(var47, var48);
                            }
                        }
                    }
                    for (class35 var49 = (class35) this.field584.method361(); var49 != null; var49 = (class35) this.field584.method363(this.field512)) {
                        if (var49.field1030 >= this.field554 && var49.field1030 < this.field554 + 8 && var49.field1031 >= this.field555 && var49.field1031 < this.field555 + 8 && this.field405 == var49.field1028) {
                            var49.field1027 = 0;
                        }
                    }
                    this.field424 = -1;
                    return true;
                }
                if (this.field424 == 120) {
                    this.field295 = this.field232.method491(455) * 30;
                    this.field424 = -1;
                    return true;
                }
                if (this.field424 == 89) {
                    int var50 = this.field232.method492(0);
                    int var51 = this.field232.method492(0);
                    class65.method395(var50).field1444 = 2;
                    class65.method395(var50).field1445 = var51;
                    this.field424 = -1;
                    return true;
                }
                if (this.field424 == 150) {
                    this.field167 = this.field232.method465();
                    this.field408 = this.field232.method465();
                    this.field318 = this.field232.method465();
                    this.field454 = true;
                    this.field338 = true;
                    this.field424 = -1;
                    return true;
                }
                if (this.field424 == 104) {
                    int var52 = this.field232.method491(455);
                    this.method128(true, var52);
                    if (this.field409 != -1) {
                        this.method43(this.field409, 0);
                        this.field409 = -1;
                        this.field515 = true;
                        this.field289 = true;
                    }
                    if (this.field475 != -1) {
                        this.method43(this.field475, 0);
                        this.field475 = -1;
                        this.field338 = true;
                    }
                    if (this.field356 != -1) {
                        this.method43(this.field356, 0);
                        this.field356 = -1;
                        this.field369 = true;
                    }
                    if (this.field247 != -1) {
                        this.method43(this.field247, 0);
                        this.field247 = -1;
                    }
                    if (this.field391 != var52) {
                        this.method43(this.field391, 0);
                        this.field391 = var52;
                    }
                    if (this.field588 != 0) {
                        this.field588 = 0;
                        this.field338 = true;
                    }
                    this.field287 = false;
                    this.field424 = -1;
                    return true;
                }
                if (this.field424 == 13) {
                    if (this.field409 != -1) {
                        this.method43(this.field409, 0);
                        this.field409 = -1;
                        this.field515 = true;
                        this.field289 = true;
                    }
                    if (this.field475 != -1) {
                        this.method43(this.field475, 0);
                        this.field475 = -1;
                        this.field338 = true;
                    }
                    if (this.field356 != -1) {
                        this.method43(this.field356, 0);
                        this.field356 = -1;
                        this.field369 = true;
                    }
                    if (this.field247 != -1) {
                        this.method43(this.field247, 0);
                        this.field247 = -1;
                    }
                    if (this.field391 != -1) {
                        this.method43(this.field391, 0);
                        this.field391 = -1;
                    }
                    if (this.field588 != 0) {
                        this.field588 = 0;
                        this.field338 = true;
                    }
                    this.field287 = false;
                    this.field424 = -1;
                    return true;
                }
                if (this.field424 == 118) {
                    int var53 = this.field232.method465();
                    int var54 = this.field232.method465();
                    int var55 = this.field232.method465();
                    int var56 = this.field232.method465();
                    this.field191[var53] = true;
                    this.field186[var53] = var54;
                    this.field402[var53] = var55;
                    this.field506[var53] = var56;
                    this.field449[var53] = 0;
                    this.field424 = -1;
                    return true;
                }
                if (this.field424 == 154) {
                    int var57 = this.field232.method495(0);
                    if (this.field339 != var57) {
                        this.method43(this.field339, 0);
                        this.field339 = var57;
                    }
                    this.field338 = true;
                    this.field424 = -1;
                    return true;
                }
                if (this.field424 == 166) {
                    String var58 = this.field232.method472();
                    if (var58.endsWith(":tradereq:")) {
                        String var59 = var58.substring(0, var58.indexOf(":"));
                        long var60 = class11.method37(var59);
                        boolean var62 = false;
                        for (int var63 = 0; var63 < this.field249; ++var63) {
                            if (this.field261[var63] == var60) {
                                var62 = true;
                                break;
                            }
                        }
                        if (!var62 && this.field208 == 0) {
                            this.method133(1, 4, var59, "wishes to trade with you.");
                        }
                    } else if (var58.endsWith(":duelreq:")) {
                        String var64 = var58.substring(0, var58.indexOf(":"));
                        long var65 = class11.method37(var64);
                        boolean var67 = false;
                        for (int var68 = 0; var68 < this.field249; ++var68) {
                            if (this.field261[var68] == var65) {
                                var67 = true;
                                break;
                            }
                        }
                        if (!var67 && this.field208 == 0) {
                            this.method133(1, 8, var64, "wishes to duel with you.");
                        }
                    } else if (!var58.endsWith(":chalreq:")) {
                        this.method133(1, 0, "", var58);
                    } else {
                        String var69 = var58.substring(0, var58.indexOf(":"));
                        long var70 = class11.method37(var69);
                        boolean var72 = false;
                        for (int var73 = 0; var73 < this.field249; ++var73) {
                            if (this.field261[var73] == var70) {
                                var72 = true;
                                break;
                            }
                        }
                        if (!var72 && this.field208 == 0) {
                            String var74 = var58.substring(var58.indexOf(":") + 1, var58.length() - 9);
                            this.method133(1, 8, var69, var74);
                        }
                    }
                    this.field424 = -1;
                    return true;
                }
                if (this.field424 == 19) {
                    int var75 = this.field232.method491(455);
                    int var76 = this.field232.method492(0);
                    class65 var77 = class65.method395(var76);
                    if (var77 != null && var77.field1462 == 0) {
                        if (var75 < 0) {
                            var75 = 0;
                        }
                        if (var75 > var77.field1396 - var77.field1416) {
                            var75 = var77.field1396 - var77.field1416;
                        }
                        var77.field1463 = var75;
                    }
                    this.field424 = -1;
                    return true;
                }
                if (this.field424 == 177) {
                    this.field535 = true;
                    this.field209 = this.field232.method465();
                    this.field210 = this.field232.method465();
                    this.field211 = this.field232.method467();
                    this.field212 = this.field232.method465();
                    this.field213 = this.field232.method465();
                    if (this.field213 >= 100) {
                        this.field455 = this.field209 * 128 + 64;
                        this.field457 = this.field210 * 128 + 64;
                        this.field456 = this.method95(this.field455, this.field457, this.field405, -738) - this.field211;
                    }
                    this.field424 = -1;
                    return true;
                }
                if (this.field424 == 187) {
                    int var78 = this.field232.method494(885);
                    int var79 = this.field232.method495(0);
                    int var80 = this.field232.method467();
                    class65 var81 = class65.method395(var80);
                    var81.field1404 = var79;
                    var81.field1415 = var78;
                    this.field424 = -1;
                    return true;
                }
                if (this.field424 == 56) {
                    int var82 = this.field232.method491(455);
                    int var83 = this.field232.method499(0);
                    this.field366[var82] = var83;
                    if (this.field320[var82] != var83) {
                        this.field320[var82] = var83;
                        this.method73(var82, 5);
                        this.field515 = true;
                        if (this.field339 != -1) {
                            this.field338 = true;
                        }
                    }
                    this.field424 = -1;
                    return true;
                }
                if (this.field424 == 183 || this.field424 == 206) {
                    int var84 = this.field632;
                    int var85 = this.field633;
                    if (this.field424 == 183) {
                        var85 = this.field232.method492(0);
                        var84 = this.field232.method491(455);
                        this.field288 = false;
                    }
                    if (this.field424 == 206) {
                        this.field232.method475(-998);
                        int var86 = 0;
                        while (true) {
                            if (var86 >= 4) {
                                this.field232.method477(-22110);
                                var84 = this.field232.method493(0);
                                var85 = this.field232.method467();
                                this.field288 = true;
                                break;
                            }
                            for (int var87 = 0; var87 < 13; ++var87) {
                                for (int var88 = 0; var88 < 13; ++var88) {
                                    int var89 = this.field232.method476(1, 0);
                                    if (var89 == 1) {
                                        this.field251[var86][var87][var88] = this.field232.method476(26, 0);
                                    } else {
                                        this.field251[var86][var87][var88] = -1;
                                    }
                                }
                            }
                            ++var86;
                        }
                    }
                    if (this.field632 == var84 && this.field633 == var85 && this.field594 == 2) {
                        this.field424 = -1;
                        return true;
                    }
                    this.field632 = var84;
                    this.field633 = var85;
                    this.field464 = (this.field632 - 6) * 8;
                    this.field465 = (this.field633 - 6) * 8;
                    this.field220 = false;
                    if ((this.field632 / 8 == 48 || this.field632 / 8 == 49) && this.field633 / 8 == 48) {
                        this.field220 = true;
                    }
                    if (this.field632 / 8 == 48 && this.field633 / 8 == 148) {
                        this.field220 = true;
                    }
                    this.field594 = 1;
                    this.field223 = System.currentTimeMillis();
                    this.method124((String) null, "Loading - please wait.", true);
                    if (this.field424 == 183) {
                        int var90 = 0;
                        int var91 = (this.field632 - 6) / 8;
                        label1203: while (true) {
                            if (var91 > (this.field632 + 6) / 8) {
                                this.field270 = new byte[var90][];
                                this.field383 = new byte[var90][];
                                this.field387 = new int[var90];
                                this.field388 = new int[var90];
                                this.field389 = new int[var90];
                                int var93 = 0;
                                int var94 = (this.field632 - 6) / 8;
                                while (true) {
                                    if (var94 > (this.field632 + 6) / 8) {
                                        break label1203;
                                    }
                                    for (int var95 = (this.field633 - 6) / 8; var95 <= (this.field633 + 6) / 8; ++var95) {
                                        this.field387[var93] = (var94 << 8) + var95;
                                        if (!this.field220 || var95 != 49 && var95 != 149 && var95 != 147 && var94 != 50 && (var94 != 49 || var95 != 47)) {
                                            int var96 = this.field388[var93] = this.field241.method299(var94, var95, -704, 0);
                                            if (var96 != -1) {
                                                this.field241.method297(3, var96);
                                            }
                                            int var97 = this.field389[var93] = this.field241.method299(var94, var95, -704, 1);
                                            if (var97 != -1) {
                                                this.field241.method297(3, var97);
                                            }
                                            ++var93;
                                        } else {
                                            this.field388[var93] = -1;
                                            this.field389[var93] = -1;
                                            ++var93;
                                        }
                                    }
                                    ++var94;
                                }
                            }
                            for (int var92 = (this.field633 - 6) / 8; var92 <= (this.field633 + 6) / 8; ++var92) {
                                ++var90;
                            }
                            ++var91;
                        }
                    }
                    if (this.field424 == 206) {
                        int var98 = 0;
                        int[] var99 = new int[676];
                        int var100 = 0;
                        label1162: while (true) {
                            if (var100 >= 4) {
                                this.field270 = new byte[var98][];
                                this.field383 = new byte[var98][];
                                this.field387 = new int[var98];
                                this.field388 = new int[var98];
                                this.field389 = new int[var98];
                                int var108 = 0;
                                while (true) {
                                    if (var108 >= var98) {
                                        break label1162;
                                    }
                                    int var109 = this.field387[var108] = var99[var108];
                                    int var110 = var109 >> 8 & 255;
                                    int var111 = var109 & 255;
                                    int var112 = this.field388[var108] = this.field241.method299(var110, var111, -704, 0);
                                    if (var112 != -1) {
                                        this.field241.method297(3, var112);
                                    }
                                    int var113 = this.field389[var108] = this.field241.method299(var110, var111, -704, 1);
                                    if (var113 != -1) {
                                        this.field241.method297(3, var113);
                                    }
                                    ++var108;
                                }
                            }
                            for (int var101 = 0; var101 < 13; ++var101) {
                                for (int var102 = 0; var102 < 13; ++var102) {
                                    int var103 = this.field251[var100][var101][var102];
                                    if (var103 != -1) {
                                        int var104 = var103 >> 14 & 1023;
                                        int var105 = var103 >> 3 & 2047;
                                        int var106 = (var104 / 8 << 8) + var105 / 8;
                                        for (int var107 = 0; var107 < var98; ++var107) {
                                            if (var99[var107] == var106) {
                                                var106 = -1;
                                                break;
                                            }
                                        }
                                        if (var106 != -1) {
                                            var99[var98++] = var106;
                                        }
                                    }
                                }
                            }
                            ++var100;
                        }
                    }
                    int var114 = this.field464 - this.field466;
                    int var115 = this.field465 - this.field467;
                    this.field466 = this.field464;
                    this.field467 = this.field465;
                    for (int var116 = 0; var116 < 16384; ++var116) {
                        class13 var117 = this.field193[var116];
                        if (var117 != null) {
                            for (int var118 = 0; var118 < 10; ++var118) {
                                var117.field711[var118] -= var114;
                                var117.field712[var118] -= var115;
                            }
                            var117.field731 -= var114 * 128;
                            var117.field732 -= var115 * 128;
                        }
                    }
                    for (int var119 = 0; var119 < this.field573; ++var119) {
                        class48 var120 = this.field575[var119];
                        if (var120 != null) {
                            for (int var121 = 0; var121 < 10; ++var121) {
                                var120.field711[var121] -= var114;
                                var120.field712[var121] -= var115;
                            }
                            var120.field731 -= var114 * 128;
                            var120.field732 -= var115 * 128;
                        }
                    }
                    this.field276 = true;
                    byte var122 = 0;
                    byte var123 = 104;
                    byte var124 = 1;
                    if (var114 < 0) {
                        var122 = 103;
                        var123 = -1;
                        var124 = -1;
                    }
                    byte var125 = 0;
                    byte var126 = 104;
                    byte var127 = 1;
                    if (var115 < 0) {
                        var125 = 103;
                        var126 = -1;
                        var127 = -1;
                    }
                    for (int var128 = var122; var123 != var128; var128 += var124) {
                        for (int var129 = var125; var126 != var129; var129 += var127) {
                            int var130 = var114 + var128;
                            int var131 = var115 + var129;
                            for (int var132 = 0; var132 < 4; ++var132) {
                                if (var130 >= 0 && var131 >= 0 && var130 < 104 && var131 < 104) {
                                    this.field359[var132][var128][var129] = this.field359[var132][var130][var131];
                                } else {
                                    this.field359[var132][var128][var129] = null;
                                }
                            }
                        }
                    }
                    for (class35 var133 = (class35) this.field584.method361(); var133 != null; var133 = (class35) this.field584.method363(this.field512)) {
                        var133.field1030 -= var114;
                        var133.field1031 -= var115;
                        if (var133.field1030 < 0 || var133.field1031 < 0 || var133.field1030 >= 104 || var133.field1031 >= 104) {
                            var133.method334();
                        }
                    }
                    if (this.field271 != 0) {
                        this.field271 -= var114;
                        this.field272 -= var115;
                    }
                    this.field535 = false;
                    this.field424 = -1;
                    return true;
                }
                if (this.field424 == 84) {
                    int var134 = this.field232.method493(0);
                    int var135 = this.field232.method485(this.field207);
                    if (var134 == 65535) {
                        var134 = -1;
                    }
                    if (this.field531[var135] != var134) {
                        this.method43(this.field531[var135], 0);
                        this.field531[var135] = var134;
                    }
                    this.field515 = true;
                    this.field289 = true;
                    this.field424 = -1;
                    return true;
                }
                if (this.field424 == 131) {
                    int var136 = this.field232.method467();
                    int var137 = this.field232.method465();
                    int var138 = this.field232.method467();
                    if (this.field480 && !field471 && this.field268 < 50) {
                        this.field269[this.field268] = var136;
                        this.field216[this.field268] = var137;
                        this.field358[this.field268] = class53.field1292[var136] + var138;
                        ++this.field268;
                    }
                    this.field424 = -1;
                    return true;
                }
                if (this.field424 == 41) {
                    int var139 = this.field232.method467();
                    class65 var140 = class65.method395(var139);
                    for (int var141 = 0; var141 < var140.field1431.length; ++var141) {
                        var140.field1431[var141] = -1;
                        var140.field1431[var141] = 0;
                    }
                    this.field424 = -1;
                    return true;
                }
                if (this.field424 == 83) {
                    boolean var142 = this.field232.method484(-241) == 1;
                    int var143 = this.field232.method467();
                    class65.method395(var143).field1465 = var142;
                    this.field424 = -1;
                    return true;
                }
                if (this.field424 == 87) {
                    this.field184 = this.field232.method465();
                    this.field515 = true;
                    this.field424 = -1;
                    return true;
                }
                if (this.field424 == 80) {
                    this.field555 = this.field232.method483(-270);
                    this.field554 = this.field232.method483(-270);
                    while (this.field232.field1652 < this.field423) {
                        int var144 = this.field232.method465();
                        this.method78(this.field232, (byte) 5, var144);
                    }
                    this.field424 = -1;
                    return true;
                }
                if (this.field424 == 247) {
                    int var145 = this.field232.method467();
                    this.method128(true, var145);
                    if (this.field409 != -1) {
                        this.method43(this.field409, 0);
                        this.field409 = -1;
                        this.field515 = true;
                        this.field289 = true;
                    }
                    if (this.field356 != -1) {
                        this.method43(this.field356, 0);
                        this.field356 = -1;
                        this.field369 = true;
                    }
                    if (this.field247 != -1) {
                        this.method43(this.field247, 0);
                        this.field247 = -1;
                    }
                    if (this.field391 != -1) {
                        this.method43(this.field391, 0);
                        this.field391 = -1;
                    }
                    if (this.field475 != var145) {
                        this.method43(this.field475, 0);
                        this.field475 = var145;
                    }
                    this.field287 = false;
                    this.field338 = true;
                    this.field424 = -1;
                    return true;
                }
                if (this.field424 == 245) {
                    int var146 = this.field232.method467();
                    int var147 = this.field232.method493(0);
                    int var148 = var147 >> 10 & 31;
                    int var149 = var147 >> 5 & 31;
                    int var150 = var147 & 31;
                    class65.method395(var146).field1452 = (var150 << 3) + (var148 << 19) + (var149 << 11);
                    this.field424 = -1;
                    return true;
                }
                if (this.field424 == 46) {
                    this.field443 = this.field232.method484(-241);
                    this.field515 = true;
                    this.field289 = true;
                    this.field424 = -1;
                    return true;
                }
                if (this.field424 == 67) {
                    String var151 = this.field232.method472();
                    int var152 = this.field232.method491(455);
                    class65.method395(var152).field1413 = var151;
                    int var10001 = this.field531[this.field443];
                    if (class65.method395(var152).field1391 == var10001) {
                        this.field515 = true;
                    }
                    this.field424 = -1;
                    return true;
                }
                if (this.field424 == 60) {
                    this.field271 = 0;
                    this.field424 = -1;
                    return true;
                }
                if (this.field424 == 27) {
                    int var153 = this.field232.method492(0);
                    int var154 = this.field232.method467();
                    int var155 = this.field232.method492(0);
                    class65.method395(var153).field1426 = (var155 << 16) + var154;
                    this.field424 = -1;
                    return true;
                }
                if (this.field424 == 140) {
                    this.method79((byte) 5, this.field423, this.field232);
                    this.field424 = -1;
                    return true;
                }
                if (this.field424 == 178) {
                    int var156 = this.field232.method491(455);
                    int var157 = this.field232.method493(0);
                    class65.method395(var157).field1444 = 1;
                    class65.method395(var157).field1445 = var156;
                    this.field424 = -1;
                    return true;
                }
                if (this.field424 == 134) {
                    int var158 = this.field232.method493(0);
                    class65.method395(var158).field1444 = 3;
                    if (field178.field1222 == null) {
                        class65.method395(var158).field1445 = (field178.field1236[11] << 5) + (field178.field1236[8] << 10) + (field178.field1236[0] << 15) + (field178.field1219[0] << 25) + (field178.field1219[4] << 20) + field178.field1236[1];
                    } else {
                        class65.method395(var158).field1445 = (int) (field178.field1222.field1004 + 305419896L);
                    }
                    this.field424 = -1;
                    return true;
                }
                if (this.field424 == 237 || this.field424 == 81 || this.field424 == 157 || this.field424 == 196 || this.field424 == 180 || this.field424 == 143 || this.field424 == 12 || this.field424 == 129 || this.field424 == 163 || this.field424 == 45 || this.field424 == 68) {
                    this.method78(this.field232, (byte) 5, this.field424);
                    this.field424 = -1;
                    return true;
                }
                if (this.field424 == 220) {
                    this.field561 = false;
                    this.field588 = 1;
                    this.field231 = "";
                    this.field338 = true;
                    this.field424 = -1;
                    return true;
                }
                if (this.field424 == 33) {
                    this.field555 = this.field232.method483(-270);
                    this.field554 = this.field232.method485(this.field207);
                    this.field424 = -1;
                    return true;
                }
                if (this.field424 == 176) {
                    this.field561 = false;
                    this.field588 = 2;
                    this.field231 = "";
                    this.field338 = true;
                    this.field424 = -1;
                    return true;
                }
                if (this.field424 == 100) {
                    this.field515 = true;
                    int var159 = this.field232.method485(this.field207);
                    int var160 = this.field232.method499(0);
                    int var161 = this.field232.method465();
                    this.field622[var159] = var160;
                    this.field221[var159] = var161;
                    this.field189[var159] = 1;
                    for (int var162 = 0; var162 < 98; ++var162) {
                        if (var160 >= field590[var162]) {
                            this.field189[var159] = var162 + 2;
                        }
                    }
                    this.field424 = -1;
                    return true;
                }
                if (this.field424 == 168) {
                    byte var163 = this.field232.method487(0);
                    int var164 = this.field232.method467();
                    this.field366[var164] = var163;
                    if (this.field320[var164] != var163) {
                        this.field320[var164] = var163;
                        this.method73(var164, 5);
                        this.field515 = true;
                        if (this.field339 != -1) {
                            this.field338 = true;
                        }
                    }
                    this.field424 = -1;
                    return true;
                }
                if (this.field424 == 128) {
                    this.field515 = true;
                    int var165 = this.field232.method467();
                    class65 var166 = class65.method395(var165);
                    while (this.field232.field1652 < this.field423) {
                        int var167 = this.field232.method479();
                        int var168 = this.field232.method467();
                        int var169 = this.field232.method465();
                        if (var169 == 255) {
                            var169 = this.field232.method470();
                        }
                        if (var167 >= 0 && var167 < var166.field1431.length) {
                            var166.field1431[var167] = var168;
                            var166.field1395[var167] = var169;
                        }
                    }
                    this.field424 = -1;
                    return true;
                }
                if (this.field424 == 106) {
                    this.method114(true, this.field232, this.field423);
                    this.field276 = false;
                    this.field424 = -1;
                    return true;
                }
                if (this.field424 == 37) {
                    this.field343 = this.field232.method465();
                    this.field424 = -1;
                    return true;
                }
                if (this.field424 == 97) {
                    this.field249 = this.field423 / 8;
                    for (int var170 = 0; var170 < this.field249; ++var170) {
                        this.field261[var170] = this.field232.method471(0);
                    }
                    this.field424 = -1;
                    return true;
                }
                if (this.field424 == 235) {
                    int var171 = this.field232.method467();
                    int var172 = this.field232.method493(0);
                    this.method128(true, var172);
                    if (var171 != -1) {
                        this.method128(true, var171);
                    }
                    if (this.field391 != -1) {
                        this.method43(this.field391, 0);
                        this.field391 = -1;
                    }
                    if (this.field409 != -1) {
                        this.method43(this.field409, 0);
                        this.field409 = -1;
                    }
                    if (this.field475 != -1) {
                        this.method43(this.field475, 0);
                        this.field475 = -1;
                    }
                    if (this.field356 != var172) {
                        this.method43(this.field356, 0);
                        this.field356 = var172;
                    }
                    if (this.field247 != var172) {
                        this.method43(this.field247, 0);
                        this.field247 = var171;
                    }
                    this.field588 = 0;
                    this.field287 = false;
                    this.field424 = -1;
                    return true;
                }
                if (this.field424 == 148) {
                    this.field535 = false;
                    for (int var173 = 0; var173 < 5; ++var173) {
                        this.field191[var173] = false;
                    }
                    this.field424 = -1;
                    return true;
                }
                if (this.field424 == 146) {
                    int var174 = this.field232.method484(-241);
                    String var175 = this.field232.method472();
                    int var176 = this.field232.method484(-241);
                    if (var174 >= 1 && var174 <= 5) {
                        if (var175.equalsIgnoreCase("null")) {
                            var175 = null;
                        }
                        this.field403[var174 - 1] = var175;
                        this.field404[var174 - 1] = var176 == 0;
                    }
                    this.field424 = -1;
                    return true;
                }
                if (this.field424 == 28) {
                    int var177 = this.field232.method493(0);
                    int var178 = this.field232.method494(885);
                    class65 var179 = class65.method395(var177);
                    if (var179.field1401 != var178 || var178 == -1) {
                        var179.field1401 = var178;
                        var179.field1451 = 0;
                        var179.field1414 = 0;
                    }
                    this.field424 = -1;
                    return true;
                }
                if (this.field424 == 152) {
                    int var180 = this.field232.method492(0);
                    int var181 = this.field232.method493(0);
                    int var182 = this.field232.method493(0);
                    if (var180 == 65535) {
                        class65.method395(var182).field1444 = 0;
                        this.field424 = -1;
                        return true;
                    }
                    class22 var183 = class22.method237(var180);
                    class65.method395(var182).field1444 = 4;
                    class65.method395(var182).field1445 = var180;
                    class65.method395(var182).field1418 = var183.field838;
                    class65.method395(var182).field1419 = var183.field851;
                    class65.method395(var182).field1417 = var183.field859 * 100 / var181;
                    this.field424 = -1;
                    return true;
                }
                if (this.field424 == 95) {
                    this.field505 = this.field232.method465();
                    this.field424 = -1;
                    return true;
                }
                if (this.field424 == 114) {
                    int var184 = this.field232.method467();
                    if (var184 == 65535) {
                        var184 = -1;
                    }
                    if (this.field224 != var184 && this.field640 && !field471 && this.field238 == 0) {
                        this.field353 = var184;
                        this.field354 = true;
                        this.field241.method297(2, this.field353);
                    }
                    this.field224 = var184;
                    this.field424 = -1;
                    return true;
                }
                if (this.field424 == 31) {
                    int var185 = this.field232.method467();
                    int var186 = this.field232.method496(-976);
                    if (this.field640 && !field471) {
                        this.field353 = var185;
                        this.field354 = false;
                        this.field241.method297(2, this.field353);
                        this.field238 = var186;
                    }
                    this.field424 = -1;
                    return true;
                }
                signlink.reporterror("T1 - " + this.field424 + "," + this.field423 + " - " + this.field544 + "," + this.field545);
                this.method123(true);
            } catch (IOException var191) {
                this.method125(18674);
            } catch (Exception var192) {
                String var188 = "T2 - " + this.field424 + "," + this.field544 + "," + this.field545 + " - " + this.field423 + "," + (field178.field711[0] + this.field464) + "," + (field178.field712[0] + this.field465) + " - ";
                for (int var189 = 0; var189 < this.field423 && var189 < 50; ++var189) {
                    var188 = var188 + this.field232.field1651[var189] + ",";
                }
                signlink.reporterror(var188);
                this.method123(true);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "k", descriptor = "(Z)V")
    public final void method141(boolean arg0) {
        ++this.field559;
        this.method113(true, this.field301);
        if (!arg0) {
            this.method56(true, false);
            this.method113(false, this.field301);
            this.method56(false, false);
            this.method80(847);
            this.method168((byte) 66);
            if (!this.field535) {
                int var2 = this.field371;
                if (this.field215 / 256 > var2) {
                    var2 = this.field215 / 256;
                }
                if (this.field191[4] && this.field402[4] + 128 > var2) {
                    var2 = this.field402[4] + 128;
                }
                int var3 = this.field394 + this.field372 & 2047;
                this.method94(this.field396, this.method95(field178.field731, field178.field732, this.field405, -738) - 50, (byte) 9, this.field397, var2, var3, var2 * 3 + 600);
            }
            int var4;
            if (!this.field535) {
                var4 = this.method126(-167);
            } else {
                var4 = this.method127(5);
            }
            int var5 = this.field455;
            int var6 = this.field456;
            int var7 = this.field457;
            int var8 = this.field458;
            int var9 = this.field459;
            for (int var10 = 0; var10 < 5; ++var10) {
                if (this.field191[var10]) {
                    int var12 = (int) (Math.random() * (double) (this.field186[var10] * 2 + 1) - (double) this.field186[var10] + Math.sin((double) this.field506[var10] / 100.0D * (double) this.field449[var10]) * (double) this.field402[var10]);
                    if (var10 == 0) {
                        this.field455 += var12;
                    }
                    if (var10 == 1) {
                        this.field456 += var12;
                    }
                    if (var10 == 2) {
                        this.field457 += var12;
                    }
                    if (var10 == 3) {
                        this.field459 = this.field459 + var12 & 2047;
                    }
                    if (var10 == 4) {
                        this.field458 += var12;
                        if (this.field458 < 128) {
                            this.field458 = 128;
                        }
                        if (this.field458 > 383) {
                            this.field458 = 383;
                        }
                    }
                }
            }
            int var11 = class64.field1387;
            class66.field1537 = true;
            class66.field1540 = 0;
            class66.field1538 = super.field769 - 4;
            class66.field1539 = super.field770 - 4;
            class24.method243((byte) -107);
            this.field441.method541((byte) -97, this.field459, this.field456, this.field458, var4, this.field457, this.field455);
            this.field441.method516(235);
            this.method77(27355);
            this.method171(true);
            this.method173((byte) -13, var11);
            this.method137(-785);
            this.field541.method35(super.field761, 4, 4, this.field508);
            this.field455 = var5;
            this.field456 = var6;
            this.field457 = var7;
            this.field458 = var8;
            this.field459 = var9;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILjava/lang/String;I)V")
    public final void method142(int arg0, String arg1, int arg2) {
        this.field219 = arg0;
        this.field330 = arg1;
        this.method96((byte) 9);
        if (this.field290 == null) {
            super.method142(arg0, arg1, 9);
        } else {
            this.field615.method34(2);
            short var4 = 360;
            short var5 = 200;
            byte var6 = 20;
            this.field638.method271("RuneScape is loading - please wait...", false, 16777215, var5 / 2 - 26 - var6, var4 / 2);
            int var7 = var5 / 2 - 18 - var6;
            class24.method246(false, 9179409, var7, 304, var4 / 2 - 152, 34);
            if (arg2 < 9 || arg2 > 9) {
                this.field424 = -1;
            }
            class24.method246(false, 0, var7 + 1, 302, var4 / 2 - 151, 32);
            class24.method245(var7 + 2, 9179409, var4 / 2 - 150, false, arg0 * 3, 30);
            class24.method245(var7 + 2, 0, arg0 * 3 + (var4 / 2 - 150), false, 300 - arg0 * 3, 30);
            this.field638.method271(arg1, false, 16777215, var5 / 2 + 5 - var6, var4 / 2);
            this.field615.method35(super.field761, 202, 171, this.field508);
            if (this.field369) {
                this.field369 = false;
                if (!this.field432) {
                    this.field616.method35(super.field761, 0, 0, this.field508);
                    this.field617.method35(super.field761, 637, 0, this.field508);
                }
                this.field613.method35(super.field761, 128, 0, this.field508);
                this.field614.method35(super.field761, 202, 371, this.field508);
                this.field618.method35(super.field761, 0, 265, this.field508);
                this.field619.method35(super.field761, 562, 265, this.field508);
                this.field620.method35(super.field761, 128, 171, this.field508);
                this.field621.method35(super.field761, 562, 171, this.field508);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIILMTFZASIN;)V")
    public final void method143(int arg0, int arg1, int arg2, int arg3, class48 arg4) {
        if (field178 != arg4) {
            if (this.field250 < 400) {
                String var6;
                if (arg4.field1216 == 0) {
                    var6 = arg4.field1239 + method103(field178.field1228, 0, arg4.field1228) + " (level-" + arg4.field1228 + ")";
                } else {
                    var6 = arg4.field1239 + " (skill-" + arg4.field1216 + ")";
                }
                if (this.field233 == 1) {
                    this.field581[this.field250] = "Use " + this.field237 + " with @whi@" + var6;
                    this.field627[this.field250] = 441;
                    this.field628[this.field250] = arg3;
                    this.field625[this.field250] = arg2;
                    this.field626[this.field250] = arg0;
                    ++this.field250;
                } else if (this.field252 == 1) {
                    if ((this.field254 & 8) == 8) {
                        this.field581[this.field250] = this.field255 + " @whi@" + var6;
                        this.field627[this.field250] = 843;
                        this.field628[this.field250] = arg3;
                        this.field625[this.field250] = arg2;
                        this.field626[this.field250] = arg0;
                        ++this.field250;
                    }
                } else {
                    for (int var7 = 4; var7 >= 0; --var7) {
                        if (this.field403[var7] != null) {
                            this.field581[this.field250] = this.field403[var7] + " @whi@" + var6;
                            short var9 = 0;
                            if (this.field403[var7].equalsIgnoreCase("attack")) {
                                if (arg4.field1228 > field178.field1228) {
                                    var9 = 2000;
                                }
                                if (field178.field1215 != 0 && arg4.field1215 != 0) {
                                    if (field178.field1215 == arg4.field1215) {
                                        var9 = 2000;
                                    } else {
                                        var9 = 0;
                                    }
                                }
                            } else if (this.field404[var7]) {
                                var9 = 2000;
                            }
                            if (var7 == 0) {
                                this.field627[this.field250] = var9 + 940;
                            }
                            if (var7 == 1) {
                                this.field627[this.field250] = var9 + 250;
                            }
                            if (var7 == 2) {
                                this.field627[this.field250] = var9 + 534;
                            }
                            if (var7 == 3) {
                                this.field627[this.field250] = var9 + 269;
                            }
                            if (var7 == 4) {
                                this.field627[this.field250] = var9 + 576;
                            }
                            this.field628[this.field250] = arg3;
                            this.field625[this.field250] = arg2;
                            this.field626[this.field250] = arg0;
                            ++this.field250;
                        }
                    }
                }
                for (int var8 = 0; var8 < this.field250; ++var8) {
                    if (this.field627[var8] == 765) {
                        this.field581[var8] = "Walk here @whi@" + var6;
                        break;
                    }
                }
                if (arg1 != 7) {
                    this.field424 = -1;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "y", descriptor = "(I)Ljava/net/Socket;")
    public final Socket method144(int arg0) throws IOException {
        return signlink.mainapp != null ? signlink.opensocket(arg0) : new Socket(InetAddress.getByName(this.getCodeBase().getHost()), arg0);
    }

    @OriginalMember(owner = "client", name = "m", descriptor = "(B)V")
    public final void method145(byte arg0) {
        if (arg0 != 1) {
            field304 = !field304;
        }
        if (this.field172 == 0) {
            int var2 = super.field759 / 2 - 80;
            int var3 = super.field760 / 2 + 20;
            int var14 = var3 + 20;
            if (super.field775 == 1 && super.field776 >= var2 - 75 && super.field776 <= var2 + 75 && super.field777 >= var14 - 20 && super.field777 <= var14 + 20) {
                this.field172 = 3;
                this.field461 = 0;
            }
            int var4 = super.field759 / 2 + 80;
            if (super.field775 == 1 && super.field776 >= var4 - 75 && super.field776 <= var4 + 75 && super.field777 >= var14 - 20 && super.field777 <= var14 + 20) {
                this.field502 = "";
                this.field503 = "Enter your username & password.";
                this.field172 = 2;
                this.field461 = 0;
            }
        } else if (this.field172 == 2) {
            int var5 = super.field760 / 2 - 40;
            int var15 = var5 + 30;
            int var16 = var15 + 25;
            if (super.field775 == 1 && super.field777 >= var16 - 15 && super.field777 < var16) {
                this.field461 = 0;
            }
            var5 = var16 + 15;
            if (super.field775 == 1 && super.field777 >= var5 - 15 && super.field777 < var5) {
                this.field461 = 1;
            }
            var5 += 15;
            int var6 = super.field759 / 2 - 80;
            int var7 = super.field760 / 2 + 50;
            int var17 = var7 + 20;
            if (super.field775 == 1 && super.field776 >= var6 - 75 && super.field776 <= var6 + 75 && super.field777 >= var17 - 20 && super.field777 <= var17 + 20) {
                this.field406 = 0;
                this.method121(this.field437, this.field438, false);
                if (this.field334) {
                    return;
                }
            }
            int var8 = super.field759 / 2 + 80;
            if (super.field775 == 1 && super.field776 >= var8 - 75 && super.field776 <= var8 + 75 && super.field777 >= var17 - 20 && super.field777 <= var17 + 20) {
                this.field172 = 0;
                this.field437 = "";
                this.field438 = "";
            }
            while (true) {
                while (true) {
                    int var9 = this.method211(299);
                    if (var9 == -1) {
                        return;
                    }
                    boolean var10 = false;
                    for (int var11 = 0; var11 < field282.length(); ++var11) {
                        if (var9 == field282.charAt(var11)) {
                            var10 = true;
                            break;
                        }
                    }
                    if (this.field461 == 0) {
                        if (var9 == 8 && this.field437.length() > 0) {
                            this.field437 = this.field437.substring(0, this.field437.length() - 1);
                        }
                        if (var9 == 9 || var9 == 10 || var9 == 13) {
                            this.field461 = 1;
                        }
                        if (var10) {
                            this.field437 = this.field437 + (char) var9;
                        }
                        if (this.field437.length() > 12) {
                            this.field437 = this.field437.substring(0, 12);
                        }
                    } else if (this.field461 == 1) {
                        if (var9 == 8 && this.field438.length() > 0) {
                            this.field438 = this.field438.substring(0, this.field438.length() - 1);
                        }
                        if (var9 == 9 || var9 == 10 || var9 == 13) {
                            this.field461 = 0;
                        }
                        if (var10) {
                            this.field438 = this.field438 + (char) var9;
                        }
                        if (this.field438.length() > 20) {
                            this.field438 = this.field438.substring(0, 20);
                        }
                    }
                }
            }
        } else {
            if (this.field172 == 3) {
                int var12 = super.field759 / 2;
                int var13 = super.field760 / 2 + 50;
                int var18 = var13 + 20;
                if (super.field775 == 1 && super.field776 >= var12 - 75 && super.field776 <= var12 + 75 && super.field777 >= var18 - 20 && super.field777 <= var18 + 20) {
                    this.field172 = 0;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        return signlink.mainapp != null ? signlink.mainapp.getAppletContext() : super.getAppletContext();
    }

    @OriginalMember(owner = "client", name = "l", descriptor = "(Z)V")
    public final void method146(boolean arg0) {
        for (int var2 = 0; var2 < this.field268; ++var2) {
            if (this.field358[var2] <= 0) {
                boolean var3 = false;
                try {
                    if (this.field269[var2] == this.field442 && this.field216[var2] == this.field608) {
                        if (!this.method130(-821)) {
                            var3 = true;
                        }
                    } else {
                        class69 var4 = class53.method329(this.field216[var2], this.field269[var2], 0);
                        if (System.currentTimeMillis() + (long) (var4.field1652 / 22) > (long) (this.field600 / 22) + this.field407) {
                            this.field600 = var4.field1652;
                            this.field407 = System.currentTimeMillis();
                            if (this.method110(31545, var4.field1652, var4.field1651)) {
                                this.field442 = this.field269[var2];
                                this.field608 = this.field216[var2];
                            } else {
                                var3 = true;
                            }
                        }
                    }
                } catch (Exception var7) {
                }
                if (var3 && this.field358[var2] != -5) {
                    this.field358[var2] = -5;
                } else {
                    --this.field268;
                    for (int var6 = var2; var6 < this.field268; ++var6) {
                        this.field269[var6] = this.field269[var6 + 1];
                        this.field216[var6] = this.field216[var6 + 1];
                        this.field358[var6] = this.field358[var6 + 1];
                    }
                    --var2;
                }
            } else {
                int var10002 = this.field358[var2]--;
            }
        }
        if (!arg0) {
            if (this.field238 > 0) {
                this.field238 -= 20;
                if (this.field238 < 0) {
                    this.field238 = 0;
                }
                if (this.field238 == 0 && this.field640 && !field471) {
                    this.field353 = this.field224;
                    this.field354 = true;
                    this.field241.method297(2, this.field353);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;)V")
    private final void method147(String arg0) {
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

    @OriginalMember(owner = "client", name = "a", descriptor = "(LMTFZASIN;IIILXGRGMPUQ;)V")
    private final void method148(class48 arg0, int arg1, int arg2, int arg3, class69 arg4) {
        if (arg1 != 0) {
            this.field415.method455(129);
        }
        if ((arg2 & 16) != 0) {
            int var6 = arg4.method467();
            int var7 = arg4.method483(-270);
            int var8 = arg4.method484(-241);
            int var9 = arg4.field1652;
            if (arg0.field1239 != null && arg0.field1223) {
                long var10 = class11.method37(arg0.field1239);
                boolean var12 = false;
                if (var7 <= 1) {
                    for (int var13 = 0; var13 < this.field249; ++var13) {
                        if (this.field261[var13] == var10) {
                            var12 = true;
                            break;
                        }
                    }
                }
                if (!var12 && this.field208 == 0) {
                    try {
                        this.field192.field1652 = 0;
                        arg4.method474(this.field192.field1651, -43215, var8, 0);
                        this.field192.field1652 = 0;
                        String var14 = class62.method366(this.field192, 7, var8);
                        String var15 = class72.method571(true, var14);
                        arg0.field684 = var15;
                        arg0.field722 = var6 >> 8;
                        arg0.field734 = var6 & 255;
                        arg0.field685 = 150;
                        if (var7 != 2 && var7 != 3) {
                            if (var7 == 1) {
                                this.method133(1, 1, "@cr1@" + arg0.field1239, var15);
                            } else {
                                this.method133(1, 2, arg0.field1239, var15);
                            }
                        } else {
                            this.method133(1, 1, "@cr2@" + arg0.field1239, var15);
                        }
                    } catch (Exception var28) {
                        signlink.reporterror("cde2");
                    }
                }
            }
            arg4.field1652 = var8 + var9;
        }
        if ((arg2 & 32) != 0) {
            arg0.field729 = arg4.method492(0);
            arg0.field730 = arg4.method492(0);
        }
        if ((arg2 & 512) != 0) {
            arg0.field703 = arg4.method484(-241);
            arg0.field705 = arg4.method465();
            arg0.field704 = arg4.method483(-270);
            arg0.field706 = arg4.method465();
            arg0.field707 = arg4.method492(0) + field572;
            arg0.field708 = arg4.method467() + field572;
            arg0.field709 = arg4.method484(-241);
            arg0.method196(false);
        }
        if ((arg2 & 2) != 0) {
            arg0.field684 = arg4.method472();
            if (arg0.field684.charAt(0) == '~') {
                arg0.field684 = arg0.field684.substring(1);
                this.method133(1, 2, arg0.field1239, arg0.field684);
            } else if (field178 == arg0) {
                this.method133(1, 2, arg0.field1239, arg0.field684);
            }
            arg0.field722 = 0;
            arg0.field734 = 0;
            arg0.field685 = 150;
        }
        if ((arg2 & 1024) != 0) {
            arg0.field717 = arg4.method491(455);
            int var17 = arg4.method499(0);
            arg0.field721 = var17 >> 16;
            arg0.field720 = (var17 & 65535) + field572;
            arg0.field718 = 0;
            arg0.field719 = 0;
            if (arg0.field720 > field572) {
                arg0.field718 = -1;
            }
            if (arg0.field717 == 65535) {
                arg0.field717 = -1;
            }
        }
        if ((arg2 & 256) != 0) {
            int var18 = arg4.method483(-270);
            int var19 = arg4.method483(-270);
            arg0.method198(var19, field572, -739, var18);
            arg0.field691 = field572 + 300;
            arg0.field692 = arg4.method465();
            arg0.field693 = arg4.method483(-270);
        }
        if ((arg2 & 1) != 0) {
            arg0.field713 = arg4.method491(455);
            if (arg0.field713 == 65535) {
                arg0.field713 = -1;
            }
        }
        if ((arg2 & 8) != 0) {
            int var20 = arg4.method484(-241);
            byte[] var21 = new byte[var20];
            class69 var22 = new class69(var21, -82);
            arg4.method474(var21, -43215, var20, 0);
            this.field580[arg3] = var22;
            arg0.method322((byte) -104, var22);
        }
        if ((arg2 & 128) != 0) {
            int var23 = arg4.method467();
            if (var23 == 65535) {
                var23 = -1;
            }
            int var24 = arg4.method465();
            if (arg0.field686 == var23 && var23 != -1) {
                int var25 = class45.field1187[var23].field1201;
                if (var25 == 1) {
                    arg0.field687 = 0;
                    arg0.field688 = 0;
                    arg0.field689 = var24;
                    arg0.field690 = 0;
                }
                if (var25 == 2) {
                    arg0.field690 = 0;
                }
            } else if (var23 == -1 || arg0.field686 == -1 || class45.field1187[var23].field1195 >= class45.field1187[arg0.field686].field1195) {
                arg0.field686 = var23;
                arg0.field687 = 0;
                arg0.field688 = 0;
                arg0.field689 = var24;
                arg0.field690 = 0;
                arg0.field714 = arg0.field728;
            }
        }
        if ((arg2 & 4) != 0) {
            int var26 = arg4.method484(-241);
            int var27 = arg4.method485(this.field207);
            arg0.method198(var27, field572, -739, var26);
            arg0.field691 = field572 + 300;
            arg0.field692 = arg4.method485(this.field207);
            arg0.field693 = arg4.method483(-270);
        }
    }

    @OriginalMember(owner = "client", name = "n", descriptor = "(B)V")
    public final void method149(byte arg0) {
        int var2 = this.field201;
        int var3 = this.field202;
        int var4 = this.field203;
        int var5 = this.field204;
        int var6 = 6116423;
        if (arg0 != 51) {
            this.field604 = 408;
        }
        class24.method245(var3, var6, var2, false, var4, var5);
        class24.method245(var3 + 1, 0, var2 + 1, false, var4 - 2, 16);
        class24.method246(false, 0, var3 + 18, var4 - 2, var2 + 1, var5 - 19);
        this.field638.method275(var3 + 14, var2 + 3, var6, "Choose Option", (byte) 6);
        int var7 = super.field769;
        int var8 = super.field770;
        if (this.field200 == 0) {
            var7 -= 4;
            var8 -= 4;
        }
        if (this.field200 == 1) {
            var7 -= 553;
            var8 -= 205;
        }
        if (this.field200 == 2) {
            var7 -= 17;
            var8 -= 357;
        }
        for (int var9 = 0; var9 < this.field250; ++var9) {
            int var10 = (this.field250 - 1 - var9) * 15 + var3 + 31;
            int var11 = 16777215;
            if (var7 > var2 && var7 < var2 + var4 && var8 > var10 - 13 && var8 < var10 + 3) {
                var11 = 16776960;
            }
            this.field638.method279(0, this.field581[var9], var2 + 3, var11, true, var10);
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(Ljava/lang/String;)Ljava/io/DataInputStream;")
    public final DataInputStream method150(String arg0) throws IOException {
        if (!this.field496) {
            return signlink.mainapp != null ? signlink.openurl(arg0) : new DataInputStream((new URL(this.getCodeBase(), arg0)).openStream());
        } else {
            if (this.field171 != null) {
                try {
                    this.field171.close();
                } catch (Exception var4) {
                }
                this.field171 = null;
            }
            this.field171 = this.method144(43595);
            this.field171.setSoTimeout(10000);
            InputStream var2 = this.field171.getInputStream();
            OutputStream var3 = this.field171.getOutputStream();
            var3.write(("JAGGRAB /" + arg0 + "\n\n").getBytes());
            return new DataInputStream(var2);
        }
    }

    @OriginalMember(owner = "client", name = "z", descriptor = "(I)V")
    public final void method151(int arg0) {
        this.field208 = 0;
        if (arg0 != 1) {
            this.field415.method455(87);
        }
        int var2 = (field178.field731 >> 7) + this.field464;
        int var3 = (field178.field732 >> 7) + this.field465;
        if (var2 >= 3053 && var2 <= 3156 && var3 >= 3056 && var3 <= 3136) {
            this.field208 = 1;
        }
        if (var2 >= 3072 && var2 <= 3118 && var3 >= 9492 && var3 <= 9535) {
            this.field208 = 1;
        }
        if (this.field208 == 1 && var2 >= 3139 && var2 <= 3199 && var3 >= 3008 && var3 <= 3062) {
            this.field208 = 0;
        }
    }

    @OriginalMember(owner = "client", name = "m", descriptor = "(Z)V")
    private final void method152(boolean arg0) {
        if (arg0) {
            this.method81();
        }
        for (class35 var2 = (class35) this.field584.method361(); var2 != null; var2 = (class35) this.field584.method363(this.field512)) {
            if (var2.field1027 == -1) {
                var2.field1035 = 0;
                this.method111(var2, 5);
            } else {
                var2.method334();
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LVYAVYWNE;IIIIIII)V")
    public final void method153(class65 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg0.field1462 == 0 && arg0.field1437 != null && !arg0.field1465) {
            if (arg3 >= arg2 && arg1 >= arg6 && arg3 <= arg0.field1408 + arg2 && arg1 <= arg0.field1416 + arg6) {
                int var9 = arg0.field1437.length;
                for (int var10 = 0; var10 < var9; ++var10) {
                    int var11 = arg0.field1411[var10] + arg2;
                    int var12 = arg0.field1450[var10] + arg6 - arg5;
                    class65 var13 = class65.method395(arg0.field1437[var10]);
                    int var14 = var13.field1404 + var11;
                    int var15 = var13.field1415 + var12;
                    if ((var13.field1429 >= 0 || var13.field1453 != 0) && arg3 >= var14 && arg1 >= var15 && arg3 < var13.field1408 + var14 && arg1 < var13.field1416 + var15) {
                        if (var13.field1429 >= 0) {
                            this.field504 = var13.field1429;
                        } else {
                            this.field504 = var13.field1398;
                        }
                    }
                    if (var13.field1462 == 8 && arg3 >= var14 && arg1 >= var15 && arg3 < var13.field1408 + var14 && arg1 < var13.field1416 + var15) {
                        this.field583 = var13.field1398;
                    }
                    if (var13.field1462 == 0) {
                        this.method153(var13, arg1, var14, arg3, 9, var13.field1463, var15, arg7);
                        if (var13.field1396 > var13.field1416) {
                            this.method118(arg1, arg3, var13.field1396, var15, var13.field1416, var13.field1408 + var14, false, var13, arg7);
                        }
                    } else {
                        if (var13.field1420 == 1 && arg3 >= var14 && arg1 >= var15 && arg3 < var13.field1408 + var14 && arg1 < var13.field1416 + var15) {
                            boolean var16 = false;
                            if (var13.field1454 != 0) {
                                var16 = this.method52(true, var13);
                            }
                            if (!var16) {
                                this.field581[this.field250] = var13.field1433;
                                this.field627[this.field250] = 214;
                                this.field626[this.field250] = var13.field1398;
                                ++this.field250;
                            }
                        }
                        if (var13.field1420 == 2 && this.field252 == 0 && arg3 >= var14 && arg1 >= var15 && arg3 < var13.field1408 + var14 && arg1 < var13.field1416 + var15) {
                            String var17 = var13.field1403;
                            if (var17.indexOf(" ") != -1) {
                                var17 = var17.substring(0, var17.indexOf(" "));
                            }
                            this.field581[this.field250] = var17 + " @gre@" + var13.field1443;
                            this.field627[this.field250] = 854;
                            this.field626[this.field250] = var13.field1398;
                            ++this.field250;
                        }
                        if (var13.field1420 == 3 && arg3 >= var14 && arg1 >= var15 && arg3 < var13.field1408 + var14 && arg1 < var13.field1416 + var15) {
                            this.field581[this.field250] = "Close";
                            if (arg7 == 3) {
                                this.field627[this.field250] = 529;
                            } else {
                                this.field627[this.field250] = 821;
                            }
                            this.field626[this.field250] = var13.field1398;
                            ++this.field250;
                        }
                        if (var13.field1420 == 4 && arg3 >= var14 && arg1 >= var15 && arg3 < var13.field1408 + var14 && arg1 < var13.field1416 + var15) {
                            this.field581[this.field250] = var13.field1433;
                            this.field627[this.field250] = 856;
                            this.field626[this.field250] = var13.field1398;
                            ++this.field250;
                        }
                        if (var13.field1420 == 5 && arg3 >= var14 && arg1 >= var15 && arg3 < var13.field1408 + var14 && arg1 < var13.field1416 + var15) {
                            this.field581[this.field250] = var13.field1433;
                            this.field627[this.field250] = 211;
                            this.field626[this.field250] = var13.field1398;
                            ++this.field250;
                        }
                        if (var13.field1420 == 6 && !this.field287 && arg3 >= var14 && arg1 >= var15 && arg3 < var13.field1408 + var14 && arg1 < var13.field1416 + var15) {
                            this.field581[this.field250] = var13.field1433;
                            this.field627[this.field250] = 818;
                            this.field626[this.field250] = var13.field1398;
                            ++this.field250;
                        }
                        if (var13.field1462 == 2) {
                            int var18 = 0;
                            for (int var19 = 0; var19 < var13.field1416; ++var19) {
                                for (int var20 = 0; var20 < var13.field1408; ++var20) {
                                    int var21 = (var13.field1442 + 32) * var20 + var14;
                                    int var22 = (var13.field1464 + 32) * var19 + var15;
                                    if (var18 < 20) {
                                        var21 += var13.field1427[var18];
                                        var22 += var13.field1399[var18];
                                    }
                                    if (arg3 >= var21 && arg1 >= var22 && arg3 < var21 + 32 && arg1 < var22 + 32) {
                                        this.field302 = var18;
                                        this.field303 = var13.field1398;
                                        if (var13.field1431[var18] > 0) {
                                            class22 var23 = class22.method237(var13.field1431[var18] - 1);
                                            if (this.field233 == 1 && var13.field1410) {
                                                if (this.field235 != var13.field1398 || this.field234 != var18) {
                                                    this.field581[this.field250] = "Use " + this.field237 + " with @lre@" + var23.field848;
                                                    this.field627[this.field250] = 131;
                                                    this.field628[this.field250] = var23.field832;
                                                    this.field625[this.field250] = var18;
                                                    this.field626[this.field250] = var13.field1398;
                                                    ++this.field250;
                                                }
                                            } else if (this.field252 == 1 && var13.field1410) {
                                                if ((this.field254 & 16) == 16) {
                                                    this.field581[this.field250] = this.field255 + " @lre@" + var23.field848;
                                                    this.field627[this.field250] = 657;
                                                    this.field628[this.field250] = var23.field832;
                                                    this.field625[this.field250] = var18;
                                                    this.field626[this.field250] = var13.field1398;
                                                    ++this.field250;
                                                }
                                            } else {
                                                if (var13.field1410) {
                                                    for (int var24 = 4; var24 >= 3; --var24) {
                                                        if (var23.field839 != null && var23.field839[var24] != null) {
                                                            this.field581[this.field250] = var23.field839[var24] + " @lre@" + var23.field848;
                                                            if (var24 == 3) {
                                                                this.field627[this.field250] = 34;
                                                            }
                                                            if (var24 == 4) {
                                                                this.field627[this.field250] = 73;
                                                            }
                                                            this.field628[this.field250] = var23.field832;
                                                            this.field625[this.field250] = var18;
                                                            this.field626[this.field250] = var13.field1398;
                                                            ++this.field250;
                                                        } else if (var24 == 4) {
                                                            this.field581[this.field250] = "Drop @lre@" + var23.field848;
                                                            this.field627[this.field250] = 73;
                                                            this.field628[this.field250] = var23.field832;
                                                            this.field625[this.field250] = var18;
                                                            this.field626[this.field250] = var13.field1398;
                                                            ++this.field250;
                                                        }
                                                    }
                                                }
                                                if (var13.field1439) {
                                                    this.field581[this.field250] = "Use @lre@" + var23.field848;
                                                    this.field627[this.field250] = 332;
                                                    this.field628[this.field250] = var23.field832;
                                                    this.field625[this.field250] = var18;
                                                    this.field626[this.field250] = var13.field1398;
                                                    ++this.field250;
                                                }
                                                if (var13.field1410 && var23.field839 != null) {
                                                    for (int var25 = 2; var25 >= 0; --var25) {
                                                        if (var23.field839[var25] != null) {
                                                            this.field581[this.field250] = var23.field839[var25] + " @lre@" + var23.field848;
                                                            if (var25 == 0) {
                                                                this.field627[this.field250] = 477;
                                                            }
                                                            if (var25 == 1) {
                                                                this.field627[this.field250] = 705;
                                                            }
                                                            if (var25 == 2) {
                                                                this.field627[this.field250] = 363;
                                                            }
                                                            this.field628[this.field250] = var23.field832;
                                                            this.field625[this.field250] = var18;
                                                            this.field626[this.field250] = var13.field1398;
                                                            ++this.field250;
                                                        }
                                                    }
                                                }
                                                if (var13.field1422 != null) {
                                                    for (int var26 = 4; var26 >= 0; --var26) {
                                                        if (var13.field1422[var26] != null) {
                                                            this.field581[this.field250] = var13.field1422[var26] + " @lre@" + var23.field848;
                                                            if (var26 == 0) {
                                                                this.field627[this.field250] = 610;
                                                            }
                                                            if (var26 == 1) {
                                                                this.field627[this.field250] = 36;
                                                            }
                                                            if (var26 == 2) {
                                                                this.field627[this.field250] = 38;
                                                            }
                                                            if (var26 == 3) {
                                                                this.field627[this.field250] = 277;
                                                            }
                                                            if (var26 == 4) {
                                                                this.field627[this.field250] = 929;
                                                            }
                                                            this.field628[this.field250] = var23.field832;
                                                            this.field625[this.field250] = var18;
                                                            this.field626[this.field250] = var13.field1398;
                                                            ++this.field250;
                                                        }
                                                    }
                                                }
                                                this.field581[this.field250] = "Examine @lre@" + var23.field848;
                                                this.field627[this.field250] = 1205;
                                                this.field628[this.field250] = var23.field832;
                                                this.field625[this.field250] = var18;
                                                this.field626[this.field250] = var13.field1398;
                                                ++this.field250;
                                            }
                                        }
                                    }
                                    ++var18;
                                }
                            }
                        }
                    }
                }
                if (arg4 < 9 || arg4 > 9) {
                    this.field424 = this.field232.method465();
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "A", descriptor = "(I)V")
    public final void method154(int arg0) {
        this.field539.method34(2);
        class64.field1378 = this.field429;
        this.field412.method374(0, false, 0);
        if (this.field409 != -1) {
            this.method83(0, 6, 0, class65.method395(this.field409), 0);
        } else if (this.field531[this.field443] != -1) {
            this.method83(0, 6, 0, class65.method395(this.field531[this.field443]), 0);
        }
        if (this.field291 && this.field200 == 1) {
            this.method149((byte) 51);
        }
        this.field539.method35(super.field761, 553, 205, this.field508);
        this.field541.method34(2);
        class64.field1378 = this.field430;
        if (arg0 != 0) {
            this.field207 = !this.field207;
        }
    }

    @OriginalMember(owner = "client", name = "h", descriptor = "(II)Ljava/lang/String;")
    private static final String method155(int arg0, int arg1) {
        if (arg0 != 0) {
            field175 = 53;
        }
        if (arg1 < 100000) {
            return String.valueOf(arg1);
        } else {
            return arg1 < 10000000 ? arg1 / 1000 + "K" : arg1 / 1000000 + "M";
        }
    }

    @OriginalMember(owner = "client", name = "B", descriptor = "(I)V")
    public final void method156(int arg0) {
        if (arg0 <= 0) {
            this.field424 = -1;
        }
        if (this.field174 != 0) {
            int var2 = 0;
            if (this.field295 != 0) {
                var2 = 1;
            }
            for (int var3 = 0; var3 < 100; ++var3) {
                if (this.field228[var3] != null) {
                    int var4 = this.field226[var3];
                    String var5 = this.field227[var3];
                    boolean var6 = false;
                    if (var5 != null && var5.startsWith("@cr1@")) {
                        var5 = var5.substring(5);
                        boolean var7 = true;
                    }
                    if (var5 != null && var5.startsWith("@cr2@")) {
                        var5 = var5.substring(5);
                        boolean var8 = true;
                    }
                    if ((var4 == 3 || var4 == 7) && (var4 == 7 || this.field408 == 0 || this.field408 == 1 && this.method186((byte) 20, var5))) {
                        int var9 = 329 - var2 * 13;
                        if (super.field769 > 4 && super.field770 - 4 > var9 - 10 && super.field770 - 4 <= var9 + 3) {
                            int var10 = this.field637.method273(false, "From:  " + var5 + this.field228[var3]) + 25;
                            if (var10 > 450) {
                                var10 = 450;
                            }
                            if (super.field769 < var10 + 4) {
                                if (this.field585 >= 1) {
                                    this.field581[this.field250] = "Report abuse @whi@" + var5;
                                    this.field627[this.field250] = 2726;
                                    ++this.field250;
                                }
                                this.field581[this.field250] = "Add ignore @whi@" + var5;
                                this.field627[this.field250] = 2495;
                                ++this.field250;
                                this.field581[this.field250] = "Add friend @whi@" + var5;
                                this.field627[this.field250] = 2678;
                                ++this.field250;
                            }
                        }
                        ++var2;
                        if (var2 >= 5) {
                            return;
                        }
                    }
                    if ((var4 == 5 || var4 == 6) && this.field408 < 2) {
                        ++var2;
                        if (var2 >= 5) {
                            return;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "C", descriptor = "(I)V")
    public final void method157(int arg0) {
        if (this.field250 >= 2 || this.field233 != 0 || this.field252 != 0) {
            String var2;
            if (this.field233 == 1 && this.field250 < 2) {
                var2 = "Use " + this.field237 + " with...";
            } else if (this.field252 == 1 && this.field250 < 2) {
                var2 = this.field255 + "...";
            } else {
                var2 = this.field581[this.field250 - 1];
            }
            if (this.field250 > 2) {
                var2 = var2 + "@whi@ / " + (this.field250 - 2) + " more options";
            }
            this.field638.method280(0, var2, field572 / 1000, 16777215, 4, 15, true);
            if (arg0 != -32751) {
                this.method81();
            }
        }
    }

    @OriginalMember(owner = "client", name = "D", descriptor = "(I)V")
    public final void method158(int arg0) {
        if (arg0 < 6 || arg0 > 6) {
            this.field173 = -420;
        }
        try {
            int var2 = field178.field731 + this.field364;
            int var3 = field178.field732 + this.field634;
            if (this.field396 - var2 < -500 || this.field396 - var2 > 500 || this.field397 - var3 < -500 || this.field397 - var3 > 500) {
                this.field396 = var2;
                this.field397 = var3;
            }
            if (this.field396 != var2) {
                this.field396 += (var2 - this.field396) / 16;
            }
            if (this.field397 != var3) {
                this.field397 += (var3 - this.field397) / 16;
            }
            if (super.field779[1] == 1) {
                this.field373 += (-24 - this.field373) / 2;
            } else if (super.field779[2] == 1) {
                this.field373 += (24 - this.field373) / 2;
            } else {
                this.field373 /= 2;
            }
            if (super.field779[3] == 1) {
                this.field374 += (12 - this.field374) / 2;
            } else if (super.field779[4] == 1) {
                this.field374 += (-12 - this.field374) / 2;
            } else {
                this.field374 /= 2;
            }
            this.field372 = this.field373 / 2 + this.field372 & 2047;
            this.field371 += this.field374 / 2;
            if (this.field371 < 128) {
                this.field371 = 128;
            }
            if (this.field371 > 383) {
                this.field371 = 383;
            }
            int var4 = this.field396 >> 7;
            int var5 = this.field397 >> 7;
            int var6 = this.method95(this.field396, this.field397, this.field405, -738);
            int var7 = 0;
            if (var4 > 3 && var5 > 3 && var4 < 100 && var5 < 100) {
                for (int var8 = var4 - 4; var8 <= var4 + 4; ++var8) {
                    for (int var9 = var5 - 4; var9 <= var5 + 4; ++var9) {
                        int var10 = this.field405;
                        if (var10 < 3 && (this.field218[1][var8][var9] & 2) == 2) {
                            ++var10;
                        }
                        int var11 = var6 - this.field170[var10][var8][var9];
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
            if (var12 > this.field215) {
                this.field215 += (var12 - this.field215) / 24;
            } else if (var12 < this.field215) {
                this.field215 += (var12 - this.field215) / 80;
            }
        } catch (Exception var13) {
            signlink.reporterror("glfc_ex " + field178.field731 + "," + field178.field732 + "," + this.field396 + "," + this.field397 + "," + this.field632 + "," + this.field633 + "," + this.field464 + "," + this.field465);
            throw new RuntimeException("eek");
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(BI)Ljava/lang/String;")
    public final String method159(byte arg0, int arg1) {
        if (arg0 != -56) {
            this.field424 = this.field232.method465();
        }
        return arg1 < 999999999 ? String.valueOf(arg1) : "*";
    }

    @OriginalMember(owner = "client", name = "E", descriptor = "(I)V")
    public final void method160(int arg0) {
        this.field415.method454(4, 189);
        while (arg0 >= 0) {
            this.field424 = -1;
        }
        if (this.field409 != -1) {
            this.method43(this.field409, 0);
            this.field409 = -1;
            this.field515 = true;
            this.field287 = false;
            this.field289 = true;
        }
        if (this.field475 != -1) {
            this.method43(this.field475, 0);
            this.field475 = -1;
            this.field338 = true;
            this.field287 = false;
        }
        if (this.field356 != -1) {
            this.method43(this.field356, 0);
            this.field356 = -1;
            this.field369 = true;
        }
        if (this.field247 != -1) {
            this.method43(this.field247, 0);
            this.field247 = -1;
        }
        if (this.field391 != -1) {
            this.method43(this.field391, 0);
            this.field391 = -1;
        }
    }

    @OriginalMember(owner = "client", name = "o", descriptor = "(B)V")
    public final void method161(byte arg0) {
        if (this.field589 != arg0) {
            this.field300 = -43;
        }
        this.field514 = true;
        for (int var2 = 0; var2 < 7; ++var2) {
            this.field198[var2] = -1;
            for (int var3 = 0; var3 < class7.field78; ++var3) {
                if (!class7.field79[var3].field85 && class7.field79[var3].field80 == var2 + (this.field587 ? 0 : 7)) {
                    this.field198[var2] = var3;
                    break;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(III)Z")
    public final boolean method162(int arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            for (int var4 = 1; var4 > 0; ++var4) {
            }
        }
        boolean var5 = false;
        class65 var6 = class65.method395(arg0);
        for (int var7 = 0; var7 < var6.field1437.length && var6.field1437[var7] != -1; ++var7) {
            class65 var8 = class65.method395(var6.field1437[var7]);
            if (var8.field1462 == 1) {
                var5 |= this.method162(var8.field1398, arg1, 0);
            }
            if (var8.field1462 == 6 && (var8.field1401 != -1 || var8.field1402 != -1)) {
                boolean var9 = this.method99(var8, (byte) 7);
                int var10;
                if (var9) {
                    var10 = var8.field1402;
                } else {
                    var10 = var8.field1401;
                }
                if (var10 != -1) {
                    class45 var11 = class45.field1187[var10];
                    var8.field1414 += arg1;
                    while (var8.field1414 > var11.method319(var8.field1451, this.field453)) {
                        var8.field1414 -= var11.method319(var8.field1451, this.field453) + 1;
                        ++var8.field1451;
                        if (var8.field1451 >= var11.field1188) {
                            var8.field1451 -= var11.field1192;
                            if (var8.field1451 < 0 || var8.field1451 >= var11.field1188) {
                                var8.field1451 = 0;
                            }
                        }
                        var5 = true;
                    }
                }
            }
            if (var8.field1462 == 6 && var8.field1426 != 0) {
                int var12 = var8.field1426 >> 16;
                int var13 = var8.field1426 << 16 >> 16;
                int var14 = arg1 * var12;
                int var15 = arg1 * var13;
                var8.field1418 = var8.field1418 + var14 & 2047;
                var8.field1419 = var8.field1419 + var15 & 2047;
                var5 = true;
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIZLjava/lang/String;ILjava/lang/String;)LMJLXHQTQ;")
    public final class44 method163(int arg0, int arg1, boolean arg2, String arg3, int arg4, String arg5) {
        this.field334 &= arg2;
        byte[] var7 = null;
        int var8 = 5;
        try {
            if (this.field631[0] != null) {
                var7 = this.field631[0].method252(this.field190, arg4);
            }
        } catch (Exception var30) {
        }
        if (var7 != null) {
            this.field321.reset();
            this.field321.update(var7);
            int var9 = (int) this.field321.getValue();
            if (arg1 != var9) {
                var7 = null;
            }
        }
        if (var7 != null) {
            return new class44(20305, var7);
        } else {
            int var11 = 0;
            while (var7 == null) {
                String var12 = "Unknown error";
                this.method142(arg0, "Requesting " + arg5, 9);
                Object var13 = null;
                try {
                    int var14 = 0;
                    DataInputStream var15 = this.method150(arg3 + arg1);
                    byte[] var16 = new byte[6];
                    var15.readFully(var16, 0, 6);
                    class69 var17 = new class69(var16, -82);
                    var17.field1652 = 3;
                    int var18 = var17.method469() + 6;
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
                            this.method142(arg0, "Loading " + arg5 + " - " + var23 + "%", 9);
                        }
                        var14 = var23;
                    }
                    var15.close();
                    try {
                        if (this.field631[0] != null) {
                            this.field631[0].method253(var7.length, (byte) 9, var7, arg4);
                        }
                    } catch (Exception var29) {
                        this.field631[0] = null;
                    }
                    if (var7 != null) {
                        this.field321.reset();
                        this.field321.update(var7);
                        int var24 = (int) this.field321.getValue();
                        if (arg1 != var24) {
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
                            this.method142(arg0, "Game updated - please reload page", 9);
                            var26 = 10;
                        } else {
                            this.method142(arg0, var12 + " - Retrying in " + var26, 9);
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
                    this.field496 = !this.field496;
                }
            }
            return new class44(20305, var7);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIB)I")
    public final int method164(int arg0, int arg1, int arg2, byte arg3) {
        if (arg3 != 88) {
            this.field415.method455(67);
        }
        int var5 = 256 - arg1;
        return ((arg0 & 16711935) * arg1 + (arg2 & 16711935) * var5 & -16711936) + ((arg0 & 65280) * arg1 + (arg2 & 65280) * var5 & 16711680) >> 8;
    }

    @OriginalMember(owner = "client", name = "n", descriptor = "(Z)V")
    public final void method165(boolean arg0) {
        if (arg0) {
            field599 = this.field323.method200();
        }
        short var2 = 256;
        if (this.field362 > 0) {
            for (int var3 = 0; var3 < 256; ++var3) {
                if (this.field362 > 768) {
                    this.field264[var3] = this.method164(this.field266[var3], 1024 - this.field362, this.field265[var3], (byte) 88);
                } else if (this.field362 > 256) {
                    this.field264[var3] = this.field266[var3];
                } else {
                    this.field264[var3] = this.method164(this.field265[var3], 256 - this.field362, this.field266[var3], (byte) 88);
                }
            }
        } else if (this.field363 > 0) {
            for (int var4 = 0; var4 < 256; ++var4) {
                if (this.field363 > 768) {
                    this.field264[var4] = this.method164(this.field267[var4], 1024 - this.field363, this.field265[var4], (byte) 88);
                } else if (this.field363 > 256) {
                    this.field264[var4] = this.field267[var4];
                } else {
                    this.field264[var4] = this.method164(this.field265[var4], 256 - this.field363, this.field267[var4], (byte) 88);
                }
            }
        } else {
            for (int var5 = 0; var5 < 256; ++var5) {
                this.field264[var5] = this.field265[var5];
            }
        }
        for (int var6 = 0; var6 < 33920; ++var6) {
            this.field616.field148[var6] = this.field492.field1307[var6];
        }
        int var7 = 0;
        int var8 = 1152;
        for (int var9 = 1; var9 < var2 - 1; ++var9) {
            int var23 = (var2 - var9) * this.field482[var9] / var2;
            int var24 = var23 + 22;
            if (var24 < 0) {
                var24 = 0;
            }
            var7 += var24;
            for (int var25 = var24; var25 < 128; ++var25) {
                int var26 = this.field242[var7++];
                if (var26 != 0) {
                    int var28 = 256 - var26;
                    int var29 = this.field264[var26];
                    int var30 = this.field616.field148[var8];
                    this.field616.field148[var8++] = ((var29 & 16711935) * var26 + (var30 & 16711935) * var28 & -16711936) + ((var29 & 65280) * var26 + (var30 & 65280) * var28 & 16711680) >> 8;
                } else {
                    ++var8;
                }
            }
            var8 += var24;
        }
        this.field616.method35(super.field761, 0, 0, this.field508);
        for (int var10 = 0; var10 < 33920; ++var10) {
            this.field617.field148[var10] = this.field493.field1307[var10];
        }
        int var11 = 0;
        int var12 = 1176;
        for (int var13 = 1; var13 < var2 - 1; ++var13) {
            int var14 = (var2 - var13) * this.field482[var13] / var2;
            int var15 = 103 - var14;
            int var16 = var12 + var14;
            for (int var17 = 0; var17 < var15; ++var17) {
                int var18 = this.field242[var11++];
                if (var18 != 0) {
                    int var20 = 256 - var18;
                    int var21 = this.field264[var18];
                    int var22 = this.field617.field148[var16];
                    this.field617.field148[var16++] = ((var21 & 16711935) * var18 + (var22 & 16711935) * var20 & -16711936) + ((var21 & 65280) * var18 + (var22 & 65280) * var20 & 16711680) >> 8;
                } else {
                    ++var16;
                }
            }
            var11 += 128 - var15;
            var12 = 128 - var15 - var14 + var16;
        }
        this.field617.method35(super.field761, 637, 0, this.field508);
    }

    @OriginalMember(owner = "client", name = "F", descriptor = "(I)V")
    public final void method166(int arg0) {
        int var2 = this.field209 * 128 + 64;
        int var3 = this.field210 * 128 + 64;
        int var4 = this.method95(var2, var3, this.field405, -738) - this.field211;
        if (this.field455 < var2) {
            this.field455 += (var2 - this.field455) * this.field213 / 1000 + this.field212;
            if (this.field455 > var2) {
                this.field455 = var2;
            }
        }
        if (this.field455 > var2) {
            this.field455 -= (this.field455 - var2) * this.field213 / 1000 + this.field212;
            if (this.field455 < var2) {
                this.field455 = var2;
            }
        }
        if (this.field456 < var4) {
            this.field456 += (var4 - this.field456) * this.field213 / 1000 + this.field212;
            if (this.field456 > var4) {
                this.field456 = var4;
            }
        }
        if (this.field456 > var4) {
            this.field456 -= (this.field456 - var4) * this.field213 / 1000 + this.field212;
            if (this.field456 < var4) {
                this.field456 = var4;
            }
        }
        if (this.field457 < var3) {
            this.field457 += (var3 - this.field457) * this.field213 / 1000 + this.field212;
            if (this.field457 > var3) {
                this.field457 = var3;
            }
        }
        if (this.field457 > var3) {
            this.field457 -= (this.field457 - var3) * this.field213 / 1000 + this.field212;
            if (this.field457 < var3) {
                this.field457 = var3;
            }
        }
        ++field382;
        if (field382 > 158) {
            field382 = 0;
            this.field415.method454(4, 163);
            this.field415.method458(6260440);
        }
        int var5 = this.field324 * 128 + 64;
        int var6 = this.field325 * 128 + 64;
        int var7 = this.method95(var5, var6, this.field405, -738) - this.field326;
        int var8 = var5 - this.field455;
        int var9 = var7 - this.field456;
        int var10 = var6 - this.field457;
        int var11 = (int) Math.sqrt((double) (var8 * var8 + var10 * var10));
        if (arg0 >= 0) {
            for (int var12 = 1; var12 > 0; ++var12) {
            }
        }
        int var13 = (int) (Math.atan2((double) var9, (double) var11) * 325.949D) & 2047;
        int var14 = (int) (Math.atan2((double) var8, (double) var10) * -325.949D) & 2047;
        if (var13 < 128) {
            var13 = 128;
        }
        if (var13 > 383) {
            var13 = 383;
        }
        if (this.field458 < var13) {
            this.field458 += (var13 - this.field458) * this.field328 / 1000 + this.field327;
            if (this.field458 > var13) {
                this.field458 = var13;
            }
        }
        if (this.field458 > var13) {
            this.field458 -= (this.field458 - var13) * this.field328 / 1000 + this.field327;
            if (this.field458 < var13) {
                this.field458 = var13;
            }
        }
        int var15 = var14 - this.field459;
        if (var15 > 1024) {
            var15 -= 2048;
        }
        if (var15 < -1024) {
            var15 += 2048;
        }
        if (var15 > 0) {
            this.field459 += this.field328 * var15 / 1000 + this.field327;
            this.field459 &= 2047;
        }
        if (var15 < 0) {
            this.field459 -= -var15 * this.field328 / 1000 + this.field327;
            this.field459 &= 2047;
        }
        int var16 = var14 - this.field459;
        if (var16 > 1024) {
            var16 -= 2048;
        }
        if (var16 < -1024) {
            var16 += 2048;
        }
        if (var16 < 0 && var15 > 0 || var16 > 0 && var15 < 0) {
            this.field459 = var14;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(JI)V")
    public final void method167(long arg0, int arg1) {
        if (arg1 != 21174) {
            field304 = !field304;
        }
        if (arg0 != 0L) {
            for (int var4 = 0; var4 < this.field183; ++var4) {
                if (this.field230[var4] == arg0) {
                    --this.field183;
                    this.field515 = true;
                    for (int var5 = var4; var5 < this.field183; ++var5) {
                        this.field521[var5] = this.field521[var5 + 1];
                        this.field278[var5] = this.field278[var5 + 1];
                        this.field230[var5] = this.field230[var5 + 1];
                    }
                    this.field415.method454(4, 54);
                    this.field415.method461(this.field511, arg0);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "p", descriptor = "(B)V")
    public final void method168(byte arg0) {
        class19 var2 = (class19) this.field305.method361();
        if (arg0 != 66) {
            this.field424 = -1;
        }
        while (var2 != null) {
            if (this.field405 == var2.field784 && !var2.field790) {
                if (field572 >= var2.field791) {
                    var2.method212(337, this.field452);
                    if (var2.field790) {
                        var2.method334();
                    } else {
                        this.field441.method513(this.field300, var2.field785, var2.field787, 60, -1, var2.field786, var2.field784, var2, 0, false);
                    }
                }
            } else {
                var2.method334();
            }
            var2 = (class19) this.field305.method363(this.field512);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIBII)V")
    public final void method169(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        this.field297.method374(arg5, false, arg4);
        if (arg3 == 8) {
            boolean var7 = false;
        } else {
            this.field487 = this.field323.method200();
        }
        this.field298.method374(arg2 + arg5 - 16, false, arg4);
        class24.method245(arg5 + 16, this.field319, arg4, false, 16, arg2 - 32);
        int var8 = (arg2 - 32) * arg2 / arg0;
        if (var8 < 8) {
            var8 = 8;
        }
        int var9 = (arg2 - 32 - var8) * arg1 / (arg0 - arg2);
        class24.method245(arg5 + 16 + var9, this.field553, arg4, false, 16, var8);
        class24.method250(var8, arg5 + 16 + var9, this.field225, arg4, -72);
        class24.method250(var8, arg5 + 16 + var9, this.field225, arg4 + 1, -72);
        class24.method248(this.field225, arg5 + 16 + var9, 16, arg4, false);
        class24.method248(this.field225, arg5 + 17 + var9, 16, arg4, false);
        class24.method250(var8, arg5 + 16 + var9, this.field367, arg4 + 15, -72);
        class24.method250(var8 - 1, arg5 + 17 + var9, this.field367, arg4 + 14, -72);
        class24.method248(this.field367, arg5 + 15 + var9 + var8, 16, arg4, false);
        class24.method248(this.field367, arg5 + 14 + var9 + var8, 15, arg4 + 1, false);
    }

    @OriginalMember(owner = "client", name = "G", descriptor = "(I)V")
    public final void method170(int arg0) {
        try {
            this.field450 = -1;
            this.field305.method365();
            this.field462.method365();
            class64.method379(this.field489);
            this.method48(0);
            this.field441.method502(-762);
            System.gc();
            for (int var2 = 0; var2 < 4; ++var2) {
                this.field361[var2].method213();
            }
            for (int var3 = 0; var3 < 4; ++var3) {
                for (int var4 = 0; var4 < 104; ++var4) {
                    for (int var5 = 0; var5 < 104; ++var5) {
                        this.field218[var3][var4][var5] = 0;
                    }
                }
            }
            class67 var6 = new class67(104, this.field170, this.field218, false, 104);
            int var7 = this.field270.length;
            this.field415.method454(4, 214);
            if (!this.field288) {
                for (int var8 = 0; var8 < var7; ++var8) {
                    int var9 = (this.field387[var8] >> 8) * 64 - this.field464;
                    int var10 = (this.field387[var8] & 255) * 64 - this.field465;
                    byte[] var11 = this.field270[var8];
                    if (var11 != null) {
                        var6.method442(this.field361, var9, var10, (byte) 6, (this.field633 - 6) * 8, var11, (this.field632 - 6) * 8);
                    }
                }
                for (int var12 = 0; var12 < var7; ++var12) {
                    int var13 = (this.field387[var12] >> 8) * 64 - this.field464;
                    int var14 = (this.field387[var12] & 255) * 64 - this.field465;
                    byte[] var15 = this.field270[var12];
                    if (var15 == null && this.field633 < 800) {
                        var6.method450(var13, 64, -28, 64, var14);
                    }
                }
                this.field415.method454(4, 214);
                for (int var16 = 0; var16 < var7; ++var16) {
                    byte[] var17 = this.field383[var16];
                    if (var17 != null) {
                        int var18 = (this.field387[var16] >> 8) * 64 - this.field464;
                        int var19 = (this.field387[var16] & 255) * 64 - this.field465;
                        var6.method448(var19, this.field361, var18, var17, (byte) 3, this.field441);
                    }
                }
            }
            if (this.field288) {
                int var20 = 0;
                label252: while (true) {
                    if (var20 >= 4) {
                        for (int var30 = 0; var30 < 13; ++var30) {
                            for (int var31 = 0; var31 < 13; ++var31) {
                                int var32 = this.field251[0][var30][var31];
                                if (var32 == -1) {
                                    var6.method450(var30 * 8, 8, -28, 8, var31 * 8);
                                }
                            }
                        }
                        this.field415.method454(4, 214);
                        int var33 = 0;
                        while (true) {
                            if (var33 >= 4) {
                                break label252;
                            }
                            for (int var34 = 0; var34 < 13; ++var34) {
                                for (int var35 = 0; var35 < 13; ++var35) {
                                    int var36 = this.field251[var33][var34][var35];
                                    if (var36 != -1) {
                                        int var37 = var36 >> 24 & 3;
                                        int var38 = var36 >> 1 & 3;
                                        int var39 = var36 >> 14 & 1023;
                                        int var40 = var36 >> 3 & 2047;
                                        int var41 = (var39 / 8 << 8) + var40 / 8;
                                        for (int var42 = 0; var42 < this.field387.length; ++var42) {
                                            if (this.field387[var42] == var41 && this.field383[var42] != null) {
                                                var6.method441(this.field383[var42], var35 * 8, this.field361, var34 * 8, this.field441, (var40 & 7) * 8, var37, 0, (var39 & 7) * 8, var33, var38);
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
                            int var23 = this.field251[var20][var21][var22];
                            if (var23 != -1) {
                                int var24 = var23 >> 24 & 3;
                                int var25 = var23 >> 1 & 3;
                                int var26 = var23 >> 14 & 1023;
                                int var27 = var23 >> 3 & 2047;
                                int var28 = (var26 / 8 << 8) + var27 / 8;
                                for (int var29 = 0; var29 < this.field387.length; ++var29) {
                                    if (this.field387[var29] == var28 && this.field270[var29] != null) {
                                        var6.method446(var22 * 8, (var27 & 7) * 8, var21 * 8, this.field270[var29], var24, (var26 & 7) * 8, var25, false, var20, this.field361);
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    ++var20;
                }
            }
            this.field415.method454(4, 214);
            var6.method443(this.field361, this.field441, this.field481);
            if (this.field541 != null) {
                this.field541.method34(2);
                class64.field1378 = this.field430;
            }
            this.field415.method454(4, 214);
            int var43 = class67.field1565;
            if (var43 > this.field405) {
                var43 = this.field405;
            }
            if (var43 < this.field405 - 1) {
                int var44 = this.field405 - 1;
            }
            if (field471) {
                this.field441.method503((byte) -69, class67.field1565);
            } else {
                this.field441.method503((byte) -69, 0);
            }
            for (int var45 = 0; var45 < 104; ++var45) {
                for (int var46 = 0; var46 < 104; ++var46) {
                    this.method74(var45, var46);
                }
            }
            this.method152(false);
        } catch (Exception var59) {
        }
        class8.field122.method195();
        if (super.field764 != null) {
            this.field415.method454(4, 210);
            this.field415.method459(1057001181);
        }
        if (field471 && signlink.cache_dat != null) {
            int var48 = this.field241.method303(0, field304);
            for (int var49 = 0; var49 < var48; ++var49) {
                int var50 = this.field241.method294(var49, field599);
                if ((var50 & 121) == 0) {
                    class66.method406(6, var49);
                }
            }
        }
        System.gc();
        class64.method380(20, 833);
        this.field241.method307(257);
        int var51 = (this.field632 - 6) / 8 - 1;
        int var52 = (this.field632 + 6) / 8 + 1;
        int var53 = (this.field633 - 6) / 8 - 1;
        int var54 = (this.field633 + 6) / 8 + 1;
        if (this.field220) {
            var51 = 49;
            var52 = 50;
            var53 = 49;
            var54 = 50;
        }
        for (int var55 = var51; var55 <= var52; ++var55) {
            for (int var56 = var53; var56 <= var54; ++var56) {
                if (var51 == var55 || var52 == var55 || var53 == var56 || var54 == var56) {
                    int var57 = this.field241.method299(var55, var56, -704, 0);
                    if (var57 != -1) {
                        this.field241.method301(var57, this.field206, 3);
                    }
                    int var58 = this.field241.method299(var55, var56, -704, 1);
                    if (var58 != -1) {
                        this.field241.method301(var58, this.field206, 3);
                    }
                }
            }
        }
        if (arg0 != 0) {
            this.field607 = this.field323.method200();
        }
    }

    @OriginalMember(owner = "client", name = "o", descriptor = "(Z)V")
    public final void method171(boolean arg0) {
        this.field334 &= arg0;
        if (this.field240 == 2) {
            this.method178((this.field516 - this.field464 << 7) + this.field519, -830, (this.field517 - this.field465 << 7) + this.field520, this.field518 * 2);
            if (this.field262 > -1 && field572 % 20 < 10) {
                this.field473[0].method340(this.field263 - 28, false, this.field262 - 12);
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(ZLVYAVYWNE;)Z")
    public final boolean method172(boolean arg0, class65 arg1) {
        int var3 = arg1.field1454;
        this.field334 &= arg0;
        if (this.field184 == 2) {
            if (var3 == 201) {
                this.field338 = true;
                this.field588 = 0;
                this.field561 = true;
                this.field490 = "";
                this.field185 = 1;
                this.field606 = "Enter name of friend to add to list";
            }
            if (var3 == 202) {
                this.field338 = true;
                this.field588 = 0;
                this.field561 = true;
                this.field490 = "";
                this.field185 = 2;
                this.field606 = "Enter name of friend to delete from list";
            }
        }
        if (var3 == 205) {
            this.field427 = 250;
            return true;
        } else {
            if (var3 == 501) {
                this.field338 = true;
                this.field588 = 0;
                this.field561 = true;
                this.field490 = "";
                this.field185 = 4;
                this.field606 = "Enter name of player to add to list";
            }
            if (var3 == 502) {
                this.field338 = true;
                this.field588 = 0;
                this.field561 = true;
                this.field490 = "";
                this.field185 = 5;
                this.field606 = "Enter name of player to delete from list";
            }
            if (var3 >= 300 && var3 <= 313) {
                int var4 = (var3 - 300) / 2;
                int var5 = var3 & 1;
                int var6 = this.field198[var4];
                if (var6 != -1) {
                    while (true) {
                        if (var5 == 0) {
                            --var6;
                            if (var6 < 0) {
                                var6 = class7.field78 - 1;
                            }
                        }
                        if (var5 == 1) {
                            ++var6;
                            if (var6 >= class7.field78) {
                                var6 = 0;
                            }
                        }
                        if (!class7.field79[var6].field85 && class7.field79[var6].field80 == var4 + (this.field587 ? 0 : 7)) {
                            this.field198[var4] = var6;
                            this.field514 = true;
                            break;
                        }
                    }
                }
            }
            if (var3 >= 314 && var3 <= 323) {
                int var7 = (var3 - 314) / 2;
                int var8 = var3 & 1;
                int var9 = this.field285[var7];
                if (var8 == 0) {
                    --var9;
                    if (var9 < 0) {
                        var9 = field336[var7].length - 1;
                    }
                }
                if (var8 == 1) {
                    ++var9;
                    if (var9 >= field336[var7].length) {
                        var9 = 0;
                    }
                }
                this.field285[var7] = var9;
                this.field514 = true;
            }
            if (var3 == 324 && !this.field587) {
                this.field587 = true;
                this.method161((byte) -70);
            }
            if (var3 == 325 && this.field587) {
                this.field587 = false;
                this.method161((byte) -70);
            }
            if (var3 != 326) {
                if (var3 == 620) {
                    this.field595 = !this.field595;
                }
                if (var3 >= 601 && var3 <= 613) {
                    this.method160(-156);
                    if (this.field335.length() > 0) {
                        this.field415.method454(4, 91);
                        this.field415.method461(this.field511, class11.method37(this.field335));
                        this.field415.method455(var3 - 601);
                        this.field415.method455(this.field595 ? 1 : 0);
                    }
                }
                return false;
            } else {
                this.field415.method454(4, 29);
                this.field415.method455(this.field587 ? 0 : 1);
                for (int var10 = 0; var10 < 7; ++var10) {
                    this.field415.method455(this.field198[var10]);
                }
                for (int var11 = 0; var11 < 5; ++var11) {
                    this.field415.method455(this.field285[var11]);
                }
                return true;
            }
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(BI)V")
    public final void method173(byte arg0, int arg1) {
        if (arg0 != -13) {
            this.field359 = null;
        }
        if (!field471) {
            for (int var3 = 0; var3 < this.field602.length; ++var3) {
                int var4 = this.field602[var3];
                if (class64.field1386[var4] >= arg1) {
                    class63 var5 = class64.field1380[var4];
                    int var6 = var5.field1358 * var5.field1357 - 1;
                    int var7 = this.field452 * var5.field1357 * 2;
                    byte[] var8 = var5.field1355;
                    byte[] var9 = this.field294;
                    for (int var10 = 0; var10 <= var6; ++var10) {
                        var9[var10] = var8[var10 - var7 & var6];
                    }
                    var5.field1355 = var9;
                    this.field294 = var8;
                    class64.method383(false, var4);
                    ++field177;
                    if (field177 > 139) {
                        field177 = 0;
                        this.field415.method454(4, 26);
                        this.field415.method458(4647988);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(JI)V")
    public final void method174(long arg0, int arg1) {
        if (arg0 != 0L) {
            if (this.field249 >= 100) {
                this.method133(1, 0, "", "Your ignore list is full. Max of 100 hit");
            } else {
                String var4 = class11.method41(class11.method38(this.field487, arg0), 42484);
                for (int var5 = 0; var5 < this.field249; ++var5) {
                    if (this.field261[var5] == arg0) {
                        this.method133(1, 0, "", var4 + " is already on your ignore list");
                        return;
                    }
                }
                for (int var6 = 0; var6 < this.field183; ++var6) {
                    if (this.field230[var6] == arg0) {
                        this.method133(1, 0, "", "Please remove " + var4 + " from your friend list first");
                        return;
                    }
                }
                this.field261[this.field249++] = arg0;
                if (arg1 != 0) {
                    this.field206 = -459;
                }
                this.field515 = true;
                this.field415.method454(4, 150);
                this.field415.method461(this.field511, arg0);
            }
        }
    }

    @OriginalMember(owner = "client", name = "q", descriptor = "(B)V")
    public final void method175(byte arg0) {
        this.field551 = new class63(this.field290, "titlebox", 0);
        if (arg0 == 8) {
            this.field552 = new class63(this.field290, "titlebutton", 0);
            this.field510 = new class63[12];
            for (int var2 = 0; var2 < 12; ++var2) {
                this.field510[var2] = new class63(this.field290, "runes", var2);
            }
            this.field492 = new class55(128, 265);
            this.field493 = new class55(128, 265);
            for (int var3 = 0; var3 < 33920; ++var3) {
                this.field492.field1307[var3] = this.field616.field148[var3];
            }
            for (int var4 = 0; var4 < 33920; ++var4) {
                this.field493.field1307[var4] = this.field617.field148[var4];
            }
            this.field265 = new int[256];
            for (int var5 = 0; var5 < 64; ++var5) {
                this.field265[var5] = var5 * 262144;
            }
            for (int var6 = 0; var6 < 64; ++var6) {
                this.field265[var6 + 64] = var6 * 1024 + 16711680;
            }
            for (int var7 = 0; var7 < 64; ++var7) {
                this.field265[var7 + 128] = var7 * 4 + 16776960;
            }
            for (int var8 = 0; var8 < 64; ++var8) {
                this.field265[var8 + 192] = 16777215;
            }
            this.field266 = new int[256];
            for (int var9 = 0; var9 < 64; ++var9) {
                this.field266[var9] = var9 * 1024;
            }
            for (int var10 = 0; var10 < 64; ++var10) {
                this.field266[var10 + 64] = var10 * 4 + 65280;
            }
            for (int var11 = 0; var11 < 64; ++var11) {
                this.field266[var11 + 128] = var11 * 262144 + 65535;
            }
            for (int var12 = 0; var12 < 64; ++var12) {
                this.field266[var12 + 192] = 16777215;
            }
            this.field267 = new int[256];
            for (int var13 = 0; var13 < 64; ++var13) {
                this.field267[var13] = var13 * 4;
            }
            for (int var14 = 0; var14 < 64; ++var14) {
                this.field267[var14 + 64] = var14 * 262144 + 255;
            }
            for (int var15 = 0; var15 < 64; ++var15) {
                this.field267[var15 + 128] = var15 * 1024 + 16711935;
            }
            for (int var16 = 0; var16 < 64; ++var16) {
                this.field267[var16 + 192] = 16777215;
            }
            this.field264 = new int[256];
            this.field476 = new int[32768];
            this.field477 = new int[32768];
            this.method122((class63) null, 40149);
            this.field242 = new int[32768];
            this.field243 = new int[32768];
            this.method142(10, "Connecting to fileserver", 9);
            if (!this.field432) {
                this.field538 = true;
                this.field432 = true;
                this.method47(this, 2);
            }
        }
    }

    @OriginalMember(owner = "client", name = "p", descriptor = "(Z)V")
    public final void method176(boolean arg0) {
        this.field334 &= arg0;
        int var2 = 5;
        this.field597[8] = 0;
        int var3 = 0;
        while (this.field597[8] == 0) {
            String var4 = "Unknown problem";
            this.method142(20, "Connecting to web server", 9);
            try {
                DataInputStream var5 = this.method150("crc" + (int) (Math.random() * 9.9999999E7D) + "-" + 347);
                class69 var6 = new class69(new byte[40], -82);
                var5.readFully(var6.field1651, 0, 40);
                var5.close();
                for (int var7 = 0; var7 < 9; ++var7) {
                    this.field597[var7] = var6.method470();
                }
                int var8 = var6.method470();
                int var9 = 1234;
                for (int var10 = 0; var10 < 9; ++var10) {
                    var9 = (var9 << 1) + this.field597[var10];
                }
                if (var8 != var9) {
                    var4 = "checksum problem";
                    this.field597[8] = 0;
                }
            } catch (EOFException var13) {
                var4 = "EOF problem";
                this.field597[8] = 0;
            } catch (IOException var14) {
                var4 = "connection problem";
                this.field597[8] = 0;
            } catch (Exception var15) {
                var4 = "logic problem";
                this.field597[8] = 0;
                if (!signlink.reporterror) {
                    return;
                }
            }
            if (this.field597[8] == 0) {
                ++var3;
                for (int var11 = var2; var11 > 0; --var11) {
                    if (var3 >= 10) {
                        this.method142(10, "Game updated - please reload page", 9);
                        var11 = 10;
                    } else {
                        this.method142(10, var4 + " - Will retry in " + var11 + " secs.", 9);
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
                this.field496 = !this.field496;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILDSYLCNKR;I)V")
    public final void method177(int arg0, class15 arg1, int arg2) {
        if (arg0 < 0) {
            this.method178(arg1.field731, -830, arg1.field732, arg2);
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(IIII)V")
    public final void method178(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 >= 128 && arg2 >= 128 && arg0 <= 13056 && arg2 <= 13056) {
            int var5 = this.method95(arg0, arg2, this.field405, -738) - arg3;
            int var6 = arg0 - this.field455;
            int var7 = var5 - this.field456;
            int var8 = arg2 - this.field457;
            int var9 = class66.field1542[this.field458];
            int var10 = class66.field1543[this.field458];
            int var11 = class66.field1542[this.field459];
            int var12 = class66.field1543[this.field459];
            int var13 = var6 * var12 + var8 * var11 >> 16;
            while (arg1 >= 0) {
                this.method81();
            }
            int var14 = var8 * var12 - var6 * var11 >> 16;
            int var16 = var7 * var10 - var9 * var14 >> 16;
            int var17 = var7 * var9 + var10 * var14 >> 16;
            if (var17 >= 50) {
                this.field262 = (var13 << 9) / var17 + class64.field1372;
                this.field263 = (var16 << 9) / var17 + class64.field1373;
            } else {
                this.field262 = -1;
                this.field263 = -1;
            }
        } else {
            this.field262 = -1;
            this.field263 = -1;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IILKFUEEJVZ;II)V")
    public final void method179(int arg0, int arg1, class33 arg2, int arg3, int arg4) {
        if (this.field250 < 400) {
            if (arg2.field971 != null) {
                arg2 = arg2.method262((byte) 9);
            }
            if (arg2 != null) {
                if (arg2.field1000) {
                    String var6 = arg2.field988;
                    int var7 = 45 / arg3;
                    if (arg2.field1003 != 0) {
                        var6 = var6 + method103(field178.field1228, 0, arg2.field1003) + " (level-" + arg2.field1003 + ")";
                    }
                    if (this.field233 == 1) {
                        this.field581[this.field250] = "Use " + this.field237 + " with @yel@" + var6;
                        this.field627[this.field250] = 754;
                        this.field628[this.field250] = arg0;
                        this.field625[this.field250] = arg1;
                        this.field626[this.field250] = arg4;
                        ++this.field250;
                    } else {
                        if (this.field252 == 1) {
                            if ((this.field254 & 2) == 2) {
                                this.field581[this.field250] = this.field255 + " @yel@" + var6;
                                this.field627[this.field250] = 31;
                                this.field628[this.field250] = arg0;
                                this.field625[this.field250] = arg1;
                                this.field626[this.field250] = arg4;
                                ++this.field250;
                                return;
                            }
                        } else {
                            if (arg2.field982 != null) {
                                for (int var8 = 4; var8 >= 0; --var8) {
                                    if (arg2.field982[var8] != null && !arg2.field982[var8].equalsIgnoreCase("attack")) {
                                        this.field581[this.field250] = arg2.field982[var8] + " @yel@" + var6;
                                        if (var8 == 0) {
                                            this.field627[this.field250] = 982;
                                        }
                                        if (var8 == 1) {
                                            this.field627[this.field250] = 708;
                                        }
                                        if (var8 == 2) {
                                            this.field627[this.field250] = 372;
                                        }
                                        if (var8 == 3) {
                                            this.field627[this.field250] = 168;
                                        }
                                        if (var8 == 4) {
                                            this.field627[this.field250] = 157;
                                        }
                                        this.field628[this.field250] = arg0;
                                        this.field625[this.field250] = arg1;
                                        this.field626[this.field250] = arg4;
                                        ++this.field250;
                                    }
                                }
                            }
                            if (arg2.field982 != null) {
                                for (int var9 = 4; var9 >= 0; --var9) {
                                    if (arg2.field982[var9] != null && arg2.field982[var9].equalsIgnoreCase("attack")) {
                                        short var10 = 0;
                                        if (arg2.field1003 > field178.field1228) {
                                            var10 = 2000;
                                        }
                                        this.field581[this.field250] = arg2.field982[var9] + " @yel@" + var6;
                                        if (var9 == 0) {
                                            this.field627[this.field250] = var10 + 982;
                                        }
                                        if (var9 == 1) {
                                            this.field627[this.field250] = var10 + 708;
                                        }
                                        if (var9 == 2) {
                                            this.field627[this.field250] = var10 + 372;
                                        }
                                        if (var9 == 3) {
                                            this.field627[this.field250] = var10 + 168;
                                        }
                                        if (var9 == 4) {
                                            this.field627[this.field250] = var10 + 157;
                                        }
                                        this.field628[this.field250] = arg0;
                                        this.field625[this.field250] = arg1;
                                        this.field626[this.field250] = arg4;
                                        ++this.field250;
                                    }
                                }
                            }
                            this.field581[this.field250] = "Examine @yel@" + var6;
                            this.field627[this.field250] = 1958;
                            this.field628[this.field250] = arg0;
                            this.field625[this.field250] = arg1;
                            this.field626[this.field250] = arg4;
                            ++this.field250;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "r", descriptor = "(B)V")
    public final void method180(byte arg0) {
        if (arg0 == 4) {
            boolean var2 = false;
        } else {
            for (int var3 = 1; var3 > 0; ++var3) {
            }
        }
        if (super.field775 == 1) {
            if (super.field776 >= 539 && super.field776 <= 573 && super.field777 >= 169 && super.field777 < 205 && this.field531[0] != -1) {
                this.field515 = true;
                this.field443 = 0;
                this.field289 = true;
            }
            if (super.field776 >= 569 && super.field776 <= 599 && super.field777 >= 168 && super.field777 < 205 && this.field531[1] != -1) {
                this.field515 = true;
                this.field443 = 1;
                this.field289 = true;
            }
            if (super.field776 >= 597 && super.field776 <= 627 && super.field777 >= 168 && super.field777 < 205 && this.field531[2] != -1) {
                this.field515 = true;
                this.field443 = 2;
                this.field289 = true;
            }
            if (super.field776 >= 625 && super.field776 <= 669 && super.field777 >= 168 && super.field777 < 203 && this.field531[3] != -1) {
                this.field515 = true;
                this.field443 = 3;
                this.field289 = true;
            }
            if (super.field776 >= 666 && super.field776 <= 696 && super.field777 >= 168 && super.field777 < 205 && this.field531[4] != -1) {
                this.field515 = true;
                this.field443 = 4;
                this.field289 = true;
            }
            if (super.field776 >= 694 && super.field776 <= 724 && super.field777 >= 168 && super.field777 < 205 && this.field531[5] != -1) {
                this.field515 = true;
                this.field443 = 5;
                this.field289 = true;
            }
            if (super.field776 >= 722 && super.field776 <= 756 && super.field777 >= 169 && super.field777 < 205 && this.field531[6] != -1) {
                this.field515 = true;
                this.field443 = 6;
                this.field289 = true;
            }
            if (super.field776 >= 540 && super.field776 <= 574 && super.field777 >= 466 && super.field777 < 502 && this.field531[7] != -1) {
                this.field515 = true;
                this.field443 = 7;
                this.field289 = true;
            }
            if (super.field776 >= 572 && super.field776 <= 602 && super.field777 >= 466 && super.field777 < 503 && this.field531[8] != -1) {
                this.field515 = true;
                this.field443 = 8;
                this.field289 = true;
            }
            if (super.field776 >= 599 && super.field776 <= 629 && super.field777 >= 466 && super.field777 < 503 && this.field531[9] != -1) {
                this.field515 = true;
                this.field443 = 9;
                this.field289 = true;
            }
            if (super.field776 >= 627 && super.field776 <= 671 && super.field777 >= 467 && super.field777 < 502 && this.field531[10] != -1) {
                this.field515 = true;
                this.field443 = 10;
                this.field289 = true;
            }
            if (super.field776 >= 669 && super.field776 <= 699 && super.field777 >= 466 && super.field777 < 503 && this.field531[11] != -1) {
                this.field515 = true;
                this.field443 = 11;
                this.field289 = true;
            }
            if (super.field776 >= 696 && super.field776 <= 726 && super.field777 >= 466 && super.field777 < 503 && this.field531[12] != -1) {
                this.field515 = true;
                this.field443 = 12;
                this.field289 = true;
            }
            if (super.field776 >= 724 && super.field776 <= 758 && super.field777 >= 466 && super.field777 < 502 && this.field531[13] != -1) {
                this.field515 = true;
                this.field443 = 13;
                this.field289 = true;
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "H", descriptor = "(I)V")
    public final void method181(int arg0) {
        if (arg0 != -44096) {
            this.field424 = -1;
        }
        if (this.field505 == 0) {
            if (super.field775 == 1) {
                int var2 = super.field776 - 25 - 550;
                int var3 = super.field777 - 5 - 4;
                if (var2 >= 0 && var3 >= 0 && var2 < 146 && var3 < 151) {
                    var2 -= 73;
                    var3 -= 75;
                    int var4 = this.field372 + this.field257 & 2047;
                    int var5 = class64.field1376[var4];
                    int var6 = class64.field1377[var4];
                    int var7 = (this.field378 + 256) * var5 >> 8;
                    int var8 = (this.field378 + 256) * var6 >> 8;
                    int var9 = var2 * var8 + var3 * var7 >> 11;
                    int var10 = var3 * var8 - var2 * var7 >> 11;
                    int var11 = field178.field731 + var9 >> 7;
                    int var12 = field178.field732 - var10 >> 7;
                    boolean var13 = this.method102(var12, this.field244, 0, 0, 1, 0, field178.field711[0], 0, true, var11, field178.field712[0], 0);
                    if (var13) {
                        this.field415.method455(var2);
                        this.field415.method455(var3);
                        this.field415.method456(this.field372);
                        this.field415.method455(57);
                        this.field415.method455(this.field257);
                        this.field415.method455(this.field378);
                        this.field415.method455(89);
                        this.field415.method456(field178.field731);
                        this.field415.method456(field178.field732);
                        this.field415.method455(this.field546);
                        this.field415.method455(63);
                    }
                }
                ++field342;
                if (field342 > 90) {
                    field342 = 0;
                    this.field415.method454(4, 45);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(B)V")
    public final void method182(byte arg0) {
        if (!this.field392 && !this.field433 && !this.field329) {
            ++field168;
            if (!this.field334) {
                this.method69(8, false);
            } else {
                this.method64(this.field439);
            }
            this.field312 = 0;
            if (arg0 != 5) {
                this.field424 = -1;
            }
        } else {
            this.method71((byte) -111);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIIIII)V")
    private final void method183(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg2 != -39748) {
            field304 = !field304;
        }
        if (arg3 >= 1 && arg5 >= 1 && arg3 <= 102 && arg5 <= 102) {
            if (field471 && this.field405 != arg1) {
                return;
            }
            int var9 = 0;
            boolean var10 = true;
            boolean var11 = false;
            boolean var12 = false;
            if (arg4 == 0) {
                var9 = this.field441.method528(arg1, arg3, arg5);
            }
            if (arg4 == 1) {
                var9 = this.field441.method529(arg1, (byte) 2, arg5, arg3);
            }
            if (arg4 == 2) {
                var9 = this.field441.method530(arg1, arg3, arg5);
            }
            if (arg4 == 3) {
                var9 = this.field441.method531(arg1, arg3, arg5);
            }
            if (var9 != 0) {
                int var13 = this.field441.method532(arg1, arg3, arg5, var9);
                int var14 = var9 >> 14 & 32767;
                int var15 = var13 & 31;
                int var16 = var13 >> 6;
                if (arg4 == 0) {
                    this.field441.method519(arg5, 564, arg1, arg3);
                    class8 var17 = class8.method30(var14);
                    if (var17.field109) {
                        this.field361[arg1].method218(arg3, 6, arg5, var17.field117, var16, var15);
                    }
                }
                if (arg4 == 1) {
                    this.field441.method520(arg1, (byte) 18, arg3, arg5);
                }
                if (arg4 == 2) {
                    this.field441.method521(arg1, arg5, false, arg3);
                    class8 var18 = class8.method30(var14);
                    if (var18.field97 + arg3 > 103 || var18.field97 + arg5 > 103 || var18.field118 + arg3 > 103 || var18.field118 + arg5 > 103) {
                        return;
                    }
                    if (var18.field109) {
                        this.field361[arg1].method219(arg5, var18.field118, var16, arg3, var18.field117, var18.field97, false);
                    }
                }
                if (arg4 == 3) {
                    this.field441.method522(arg5, (byte) 8, arg1, arg3);
                    class8 var19 = class8.method30(var14);
                    if (var19.field109 && var19.field105) {
                        this.field361[arg1].method221(-390, arg3, arg5);
                    }
                }
            }
            if (arg7 >= 0) {
                int var20 = arg1;
                if (arg1 < 3 && (this.field218[1][arg3][arg5] & 2) == 2) {
                    var20 = arg1 + 1;
                }
                class67.method447(arg1, arg3, arg6, arg7, var20, true, this.field441, this.field361[arg1], arg0, this.field170, arg5);
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(ILXGRGMPUQ;I)V")
    private final void method184(int arg0, class69 arg1, int arg2) {
        int var4 = arg1.method476(8, 0);
        if (arg2 <= 0) {
            for (int var5 = 1; var5 > 0; ++var5) {
            }
        }
        if (var4 < this.field576) {
            for (int var6 = var4; var6 < this.field576; ++var6) {
                this.field557[this.field556++] = this.field577[var6];
            }
        }
        if (var4 > this.field576) {
            signlink.reporterror(this.field437 + " Too many players");
            throw new RuntimeException("eek");
        } else {
            this.field576 = 0;
            for (int var7 = 0; var7 < var4; ++var7) {
                int var8 = this.field577[var7];
                class48 var9 = this.field575[var8];
                int var10 = arg1.method476(1, 0);
                if (var10 == 0) {
                    this.field577[this.field576++] = var8;
                    var9.field682 = field572;
                } else {
                    int var11 = arg1.method476(2, 0);
                    if (var11 == 0) {
                        this.field577[this.field576++] = var8;
                        var9.field682 = field572;
                        this.field579[this.field578++] = var8;
                    } else if (var11 == 1) {
                        this.field577[this.field576++] = var8;
                        var9.field682 = field572;
                        int var12 = arg1.method476(3, 0);
                        var9.method197(var12, false, -19255);
                        int var13 = arg1.method476(1, 0);
                        if (var13 == 1) {
                            this.field579[this.field578++] = var8;
                        }
                    } else if (var11 == 2) {
                        this.field577[this.field576++] = var8;
                        var9.field682 = field572;
                        int var14 = arg1.method476(3, 0);
                        var9.method197(var14, true, -19255);
                        int var15 = arg1.method476(3, 0);
                        var9.method197(var15, true, -19255);
                        int var16 = arg1.method476(1, 0);
                        if (var16 == 1) {
                            this.field579[this.field578++] = var8;
                        }
                    } else if (var11 == 3) {
                        this.field557[this.field556++] = var8;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "s", descriptor = "(B)Ljava/lang/String;")
    public final String method185(byte arg0) {
        if (arg0 != 10) {
            this.field512 = -433;
        }
        if (signlink.mainapp != null) {
            return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
        } else {
            return super.field764 != null ? "runescape.com" : super.getDocumentBase().getHost().toLowerCase();
        }
    }

    @OriginalMember(owner = "client", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        return signlink.mainapp != null ? signlink.mainapp.getParameter(arg0) : super.getParameter(arg0);
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BLjava/lang/String;)Z")
    public final boolean method186(byte arg0, String arg1) {
        if (arg0 != 20) {
            this.field444 = -262;
        }
        if (arg1 == null) {
            return false;
        } else {
            for (int var3 = 0; var3 < this.field183; ++var3) {
                if (arg1.equalsIgnoreCase(this.field521[var3])) {
                    return true;
                }
            }
            return arg1.equalsIgnoreCase(field178.field1239);
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(III)V")
    public final void method187(int arg0, int arg1, int arg2) {
        if (arg2 < 8 || arg2 > 8) {
            this.method81();
        }
        int var4 = 0;
        for (int var5 = 0; var5 < 100; ++var5) {
            if (this.field228[var5] != null) {
                int var6 = this.field226[var5];
                int var7 = 70 - var4 * 14 + this.field582 + 4;
                if (var7 < -20) {
                    break;
                }
                String var8 = this.field227[var5];
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
                if ((var6 == 1 || var6 == 2) && (var6 == 1 || this.field167 == 0 || this.field167 == 1 && this.method186((byte) 20, var8))) {
                    if (arg0 > var7 - 14 && arg0 <= var7 && !var8.equals(field178.field1239)) {
                        if (this.field585 >= 1) {
                            this.field581[this.field250] = "Report abuse @whi@" + var8;
                            this.field627[this.field250] = 726;
                            ++this.field250;
                        }
                        this.field581[this.field250] = "Add ignore @whi@" + var8;
                        this.field627[this.field250] = 495;
                        ++this.field250;
                        this.field581[this.field250] = "Add friend @whi@" + var8;
                        this.field627[this.field250] = 678;
                        ++this.field250;
                    }
                    ++var4;
                }
                if ((var6 == 3 || var6 == 7) && this.field174 == 0 && (var6 == 7 || this.field408 == 0 || this.field408 == 1 && this.method186((byte) 20, var8))) {
                    if (arg0 > var7 - 14 && arg0 <= var7) {
                        if (this.field585 >= 1) {
                            this.field581[this.field250] = "Report abuse @whi@" + var8;
                            this.field627[this.field250] = 726;
                            ++this.field250;
                        }
                        this.field581[this.field250] = "Add ignore @whi@" + var8;
                        this.field627[this.field250] = 495;
                        ++this.field250;
                        this.field581[this.field250] = "Add friend @whi@" + var8;
                        this.field627[this.field250] = 678;
                        ++this.field250;
                    }
                    ++var4;
                }
                if (var6 == 4 && (this.field318 == 0 || this.field318 == 1 && this.method186((byte) 20, var8))) {
                    if (arg0 > var7 - 14 && arg0 <= var7) {
                        this.field581[this.field250] = "Accept trade @whi@" + var8;
                        this.field627[this.field250] = 178;
                        ++this.field250;
                    }
                    ++var4;
                }
                if ((var6 == 5 || var6 == 6) && this.field174 == 0 && this.field408 < 2) {
                    ++var4;
                }
                if (var6 == 8 && (this.field318 == 0 || this.field318 == 1 && this.method186((byte) 20, var8))) {
                    if (arg0 > var7 - 14 && arg0 <= var7) {
                        this.field581[this.field250] = "Accept challenge @whi@" + var8;
                        this.field627[this.field250] = 830;
                        ++this.field250;
                    }
                    ++var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "I", descriptor = "(I)V")
    public final void method188(int arg0) {
        this.field432 = false;
        while (this.field377) {
            this.field432 = false;
            try {
                Thread.sleep(50L);
            } catch (Exception var2) {
            }
        }
        this.field551 = null;
        this.field552 = null;
        this.field510 = null;
        this.field264 = null;
        while (arg0 >= 0) {
            this.field424 = this.field232.method465();
        }
        this.field265 = null;
        this.field266 = null;
        this.field267 = null;
        this.field476 = null;
        this.field477 = null;
        this.field242 = null;
        this.field243 = null;
        this.field492 = null;
        this.field493 = null;
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; ++var1) {
            field385[var1] = var0 - 1;
            var0 += var0;
        }
        field390 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };
        field468 = 10;
        field470 = true;
        field479 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");
        field507 = true;
        field590 = new int[99];
        int var2 = 0;
        for (int var3 = 0; var3 < 99; ++var3) {
            int var4 = var3 + 1;
            int var5 = (int) ((double) var4 + 300.0D * Math.pow(2.0D, (double) var4 / 7.0D));
            var2 += var5;
            field590[var3] = var2 / 4;
        }
        field599 = -12;
    }
}
