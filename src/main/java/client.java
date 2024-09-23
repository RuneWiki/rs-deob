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
public class client extends class71 {

    @OriginalMember(owner = "client", name = "J", descriptor = "Z")
    private boolean field74 = false;

    @OriginalMember(owner = "client", name = "M", descriptor = "[I")
    private int[] field77 = new int[151];

    @OriginalMember(owner = "client", name = "P", descriptor = "[LUFHMHWIH;")
    private class55[] field80 = new class55[1000];

    @OriginalMember(owner = "client", name = "S", descriptor = "Ljava/lang/String;")
    private String field83 = "";

    @OriginalMember(owner = "client", name = "T", descriptor = "Z")
    private boolean field84 = false;

    @OriginalMember(owner = "client", name = "X", descriptor = "Z")
    private volatile boolean field88 = false;

    @OriginalMember(owner = "client", name = "bb", descriptor = "[I")
    private int[] field92 = new int[50];

    @OriginalMember(owner = "client", name = "cb", descriptor = "I")
    private int field93 = -1;

    @OriginalMember(owner = "client", name = "ib", descriptor = "[LUFHMHWIH;")
    private class55[] field99 = new class55[20];

    @OriginalMember(owner = "client", name = "lb", descriptor = "[[I")
    private int[][] field102 = new int[104][104];

    @OriginalMember(owner = "client", name = "mb", descriptor = "[B")
    private byte[] field103 = new byte[16384];

    @OriginalMember(owner = "client", name = "nb", descriptor = "[[I")
    private int[][] field104 = new int[104][104];

    @OriginalMember(owner = "client", name = "pb", descriptor = "Z")
    public boolean field106 = false;

    @OriginalMember(owner = "client", name = "ub", descriptor = "LPUBJBHOK;")
    private class42 field111 = new class42(-591);

    @OriginalMember(owner = "client", name = "wb", descriptor = "I")
    private int field113 = -4482;

    @OriginalMember(owner = "client", name = "xb", descriptor = "I")
    private int field114 = -1;

    @OriginalMember(owner = "client", name = "yb", descriptor = "I")
    private int field115 = -1;

    @OriginalMember(owner = "client", name = "zb", descriptor = "I")
    private int field116 = 7;

    @OriginalMember(owner = "client", name = "Bb", descriptor = "Z")
    private boolean field118 = true;

    @OriginalMember(owner = "client", name = "Cb", descriptor = "Z")
    private boolean field119 = false;

    @OriginalMember(owner = "client", name = "Db", descriptor = "Ljava/lang/String;")
    private String field120 = "";

    @OriginalMember(owner = "client", name = "Eb", descriptor = "Z")
    private boolean field121 = false;

    @OriginalMember(owner = "client", name = "Hb", descriptor = "Z")
    private boolean field124 = false;

    @OriginalMember(owner = "client", name = "Mb", descriptor = "LPUBJBHOK;")
    private class42 field129 = new class42(-591);

    @OriginalMember(owner = "client", name = "Ob", descriptor = "[I")
    private int[] field131 = new int[class64.field1485];

    @OriginalMember(owner = "client", name = "Pb", descriptor = "LMQZHAILV;")
    private class33 field132 = new class33(true, new byte[5000]);

    @OriginalMember(owner = "client", name = "Qb", descriptor = "[LOQGXHJNH;")
    private class36[] field133 = new class36[16384];

    @OriginalMember(owner = "client", name = "Sb", descriptor = "[I")
    public int[] field135 = new int[16384];

    @OriginalMember(owner = "client", name = "Tb", descriptor = "Z")
    public boolean field136 = true;

    @OriginalMember(owner = "client", name = "Ub", descriptor = "[Ljava/lang/String;")
    private String[] field137 = new String[500];

    @OriginalMember(owner = "client", name = "Wb", descriptor = "Ljava/lang/String;")
    private String field139 = "";

    @OriginalMember(owner = "client", name = "Xb", descriptor = "Ljava/lang/String;")
    private String field140 = "";

    @OriginalMember(owner = "client", name = "Yb", descriptor = "Z")
    private boolean field141 = false;

    @OriginalMember(owner = "client", name = "cc", descriptor = "[I")
    private int[] field145 = new int[256];

    @OriginalMember(owner = "client", name = "dc", descriptor = "I")
    private int field146 = -723;

    @OriginalMember(owner = "client", name = "lc", descriptor = "I")
    private int field154 = -1;

    @OriginalMember(owner = "client", name = "sc", descriptor = "Z")
    private boolean field161 = true;

    @OriginalMember(owner = "client", name = "tc", descriptor = "B")
    private byte field162 = 9;

    @OriginalMember(owner = "client", name = "uc", descriptor = "Ljava/lang/String;")
    private String field163 = "";

    @OriginalMember(owner = "client", name = "Bc", descriptor = "[J")
    private long[] field170 = new long[100];

    @OriginalMember(owner = "client", name = "Lc", descriptor = "[I")
    private int[] field180 = new int[33];

    @OriginalMember(owner = "client", name = "Nc", descriptor = "I")
    private int field182 = -11;

    @OriginalMember(owner = "client", name = "Pc", descriptor = "LPUBJBHOK;")
    private class42 field184 = new class42(-591);

    @OriginalMember(owner = "client", name = "Qc", descriptor = "Z")
    private boolean field185 = false;

    @OriginalMember(owner = "client", name = "Rc", descriptor = "I")
    private int field186 = -1;

    @OriginalMember(owner = "client", name = "Sc", descriptor = "Ljava/lang/String;")
    private String field187 = "";

    @OriginalMember(owner = "client", name = "Tc", descriptor = "B")
    private byte field188 = -106;

    @OriginalMember(owner = "client", name = "Vc", descriptor = "Z")
    private boolean field190 = false;

    @OriginalMember(owner = "client", name = "Xc", descriptor = "[I")
    private int[] field192 = new int[50];

    @OriginalMember(owner = "client", name = "ad", descriptor = "Z")
    private boolean field195 = false;

    @OriginalMember(owner = "client", name = "hd", descriptor = "LMQZHAILV;")
    private class33 field202 = class33.method313(1, field498);

    @OriginalMember(owner = "client", name = "id", descriptor = "Z")
    private boolean field203 = true;

    @OriginalMember(owner = "client", name = "jd", descriptor = "Z")
    private volatile boolean field204 = false;

    @OriginalMember(owner = "client", name = "ld", descriptor = "I")
    private int field206 = 50;

    @OriginalMember(owner = "client", name = "md", descriptor = "[I")
    private int[] field207 = new int[this.field206];

    @OriginalMember(owner = "client", name = "nd", descriptor = "[I")
    private int[] field208 = new int[this.field206];

    @OriginalMember(owner = "client", name = "od", descriptor = "[I")
    private int[] field209 = new int[this.field206];

    @OriginalMember(owner = "client", name = "pd", descriptor = "[I")
    private int[] field210 = new int[this.field206];

    @OriginalMember(owner = "client", name = "qd", descriptor = "[I")
    private int[] field211 = new int[this.field206];

    @OriginalMember(owner = "client", name = "rd", descriptor = "[I")
    private int[] field212 = new int[this.field206];

    @OriginalMember(owner = "client", name = "sd", descriptor = "[I")
    private int[] field213 = new int[this.field206];

    @OriginalMember(owner = "client", name = "td", descriptor = "[Ljava/lang/String;")
    private String[] field214 = new String[this.field206];

    @OriginalMember(owner = "client", name = "Ad", descriptor = "[[I")
    private int[][] field221 = new int[104][104];

    @OriginalMember(owner = "client", name = "Bd", descriptor = "Z")
    private boolean field222 = true;

    @OriginalMember(owner = "client", name = "Dd", descriptor = "I")
    private int field224 = 1;

    @OriginalMember(owner = "client", name = "Ed", descriptor = "Z")
    private boolean field225 = false;

    @OriginalMember(owner = "client", name = "Hd", descriptor = "Z")
    private volatile boolean field228 = false;

    @OriginalMember(owner = "client", name = "Id", descriptor = "I")
    private int field229 = -606;

    @OriginalMember(owner = "client", name = "Jd", descriptor = "[Ljava/lang/String;")
    private String[] field230 = new String[5];

    @OriginalMember(owner = "client", name = "Kd", descriptor = "[Z")
    private boolean[] field231 = new boolean[5];

    @OriginalMember(owner = "client", name = "Ld", descriptor = "[I")
    public int[] field232 = new int[2000];

    @OriginalMember(owner = "client", name = "Nd", descriptor = "I")
    private int field234 = 3;

    @OriginalMember(owner = "client", name = "Pd", descriptor = "B")
    private byte field236 = 68;

    @OriginalMember(owner = "client", name = "Qd", descriptor = "[[[I")
    private int[][][] field237 = new int[4][13][13];

    @OriginalMember(owner = "client", name = "Rd", descriptor = "[LMPYOQJPZ;")
    private class32[] field238 = new class32[4];

    @OriginalMember(owner = "client", name = "Td", descriptor = "LTDQUELMV;")
    private class52 field240 = new class52();

    @OriginalMember(owner = "client", name = "Ud", descriptor = "Z")
    private boolean field241 = false;

    @OriginalMember(owner = "client", name = "Xd", descriptor = "[I")
    private int[] field244 = new int[33];

    @OriginalMember(owner = "client", name = "ae", descriptor = "Z")
    private boolean field247 = false;

    @OriginalMember(owner = "client", name = "be", descriptor = "I")
    private int field248 = -14692;

    @OriginalMember(owner = "client", name = "ce", descriptor = "I")
    private int field249 = 16513;

    @OriginalMember(owner = "client", name = "ge", descriptor = "[LHQETDHHW;")
    private class20[] field253 = new class20[2];

    @OriginalMember(owner = "client", name = "he", descriptor = "LMQZHAILV;")
    private class33 field254 = class33.method313(1, field498);

    @OriginalMember(owner = "client", name = "ie", descriptor = "[I")
    private int[] field255 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client", name = "je", descriptor = "[LUFHMHWIH;")
    private class55[] field256 = new class55[8];

    @OriginalMember(owner = "client", name = "ke", descriptor = "Z")
    private boolean field257 = false;

    @OriginalMember(owner = "client", name = "ye", descriptor = "[Z")
    private boolean[] field271 = new boolean[5];

    @OriginalMember(owner = "client", name = "Ae", descriptor = "Z")
    private boolean field273 = false;

    @OriginalMember(owner = "client", name = "Be", descriptor = "I")
    private int field274 = 7759444;

    @OriginalMember(owner = "client", name = "Ce", descriptor = "Z")
    private boolean field275 = false;

    @OriginalMember(owner = "client", name = "Fe", descriptor = "I")
    private int field278 = 2;

    @OriginalMember(owner = "client", name = "Le", descriptor = "I")
    private int field284 = 5063219;

    @OriginalMember(owner = "client", name = "Ne", descriptor = "I")
    private int field286 = 2;

    @OriginalMember(owner = "client", name = "Pe", descriptor = "[I")
    public int[] field288 = new int[1000];

    @OriginalMember(owner = "client", name = "Re", descriptor = "[I")
    private int[] field290 = new int[9];

    @OriginalMember(owner = "client", name = "Se", descriptor = "[I")
    private int[] field291 = new int[151];

    @OriginalMember(owner = "client", name = "Te", descriptor = "[I")
    private int[] field292 = new int[100];

    @OriginalMember(owner = "client", name = "Ue", descriptor = "[Ljava/lang/String;")
    private String[] field293 = new String[100];

    @OriginalMember(owner = "client", name = "Ve", descriptor = "[Ljava/lang/String;")
    private String[] field294 = new String[100];

    @OriginalMember(owner = "client", name = "We", descriptor = "[I")
    private int[] field295 = new int[7];

    @OriginalMember(owner = "client", name = "cf", descriptor = "I")
    private int field301 = -1;

    @OriginalMember(owner = "client", name = "mf", descriptor = "LMQZHAILV;")
    private class33 field310 = class33.method313(1, field498);

    @OriginalMember(owner = "client", name = "Pf", descriptor = "I")
    private int field339 = 78;

    @OriginalMember(owner = "client", name = "Sf", descriptor = "[I")
    private int[] field342 = new int[50];

    @OriginalMember(owner = "client", name = "Xf", descriptor = "I")
    private int field347 = -1;

    @OriginalMember(owner = "client", name = "cg", descriptor = "Z")
    private boolean field352 = false;

    @OriginalMember(owner = "client", name = "eg", descriptor = "Z")
    private boolean field354 = false;

    @OriginalMember(owner = "client", name = "fg", descriptor = "[I")
    private int[] field355 = new int[5];

    @OriginalMember(owner = "client", name = "gg", descriptor = "[I")
    private int[] field356 = new int[500];

    @OriginalMember(owner = "client", name = "hg", descriptor = "[I")
    private int[] field357 = new int[500];

    @OriginalMember(owner = "client", name = "ig", descriptor = "[I")
    private int[] field358 = new int[500];

    @OriginalMember(owner = "client", name = "jg", descriptor = "[I")
    private int[] field359 = new int[500];

    @OriginalMember(owner = "client", name = "lg", descriptor = "[I")
    private int[] field361 = new int[1000];

    @OriginalMember(owner = "client", name = "mg", descriptor = "[I")
    private int[] field362 = new int[1000];

    @OriginalMember(owner = "client", name = "ng", descriptor = "Ljava/lang/String;")
    private String field363 = "";

    @OriginalMember(owner = "client", name = "og", descriptor = "Ljava/lang/String;")
    private String field364 = "";

    @OriginalMember(owner = "client", name = "qg", descriptor = "Z")
    private boolean field366 = true;

    @OriginalMember(owner = "client", name = "rg", descriptor = "Z")
    private boolean field367 = true;

    @OriginalMember(owner = "client", name = "sg", descriptor = "[I")
    private int[] field368 = new int[5];

    @OriginalMember(owner = "client", name = "ug", descriptor = "I")
    private int field370 = -929;

    @OriginalMember(owner = "client", name = "vg", descriptor = "I")
    private int field371 = -27735;

    @OriginalMember(owner = "client", name = "wg", descriptor = "I")
    private int field372 = -742;

    @OriginalMember(owner = "client", name = "Bg", descriptor = "Z")
    private boolean field377 = false;

    @OriginalMember(owner = "client", name = "Dg", descriptor = "I")
    private int field379 = 1;

    @OriginalMember(owner = "client", name = "Eg", descriptor = "B")
    private byte field380 = 109;

    @OriginalMember(owner = "client", name = "Fg", descriptor = "[I")
    private int[] field381 = new int[5];

    @OriginalMember(owner = "client", name = "Hg", descriptor = "I")
    private int field383 = 128;

    @OriginalMember(owner = "client", name = "Qg", descriptor = "[LHQETDHHW;")
    private class20[] field392 = new class20[100];

    @OriginalMember(owner = "client", name = "Sg", descriptor = "I")
    private int field394 = -597;

    @OriginalMember(owner = "client", name = "Tg", descriptor = "Z")
    private boolean field395 = false;

    @OriginalMember(owner = "client", name = "Vg", descriptor = "I")
    private int field397 = 760;

    @OriginalMember(owner = "client", name = "Wg", descriptor = "Z")
    private boolean field398 = true;

    @OriginalMember(owner = "client", name = "Yg", descriptor = "I")
    private int field400 = 7;

    @OriginalMember(owner = "client", name = "Zg", descriptor = "Z")
    private boolean field401 = false;

    @OriginalMember(owner = "client", name = "ah", descriptor = "B")
    private byte field402 = -107;

    @OriginalMember(owner = "client", name = "bh", descriptor = "I")
    private int field403 = -1;

    @OriginalMember(owner = "client", name = "dh", descriptor = "Z")
    private boolean field405 = false;

    @OriginalMember(owner = "client", name = "hh", descriptor = "[LUFHMHWIH;")
    private class55[] field409 = new class55[20];

    @OriginalMember(owner = "client", name = "jh", descriptor = "Ljava/util/zip/CRC32;")
    private CRC32 field411 = new CRC32();

    @OriginalMember(owner = "client", name = "kh", descriptor = "[LUFHMHWIH;")
    private class55[] field412 = new class55[100];

    @OriginalMember(owner = "client", name = "rh", descriptor = "I")
    private int field419 = -1;

    @OriginalMember(owner = "client", name = "th", descriptor = "I")
    private int field421 = 1;

    @OriginalMember(owner = "client", name = "uh", descriptor = "Z")
    private boolean field422 = false;

    @OriginalMember(owner = "client", name = "vh", descriptor = "Z")
    private boolean field423 = false;

    @OriginalMember(owner = "client", name = "wh", descriptor = "I")
    private int field424 = -1;

    @OriginalMember(owner = "client", name = "xh", descriptor = "[Ljava/lang/String;")
    private String[] field425 = new String[200];

    @OriginalMember(owner = "client", name = "zh", descriptor = "I")
    private int field427 = -1;

    @OriginalMember(owner = "client", name = "Ah", descriptor = "I")
    private int field428 = -1;

    @OriginalMember(owner = "client", name = "Ch", descriptor = "Z")
    private boolean field430 = false;

    @OriginalMember(owner = "client", name = "Dh", descriptor = "Ljava/lang/String;")
    private String field431 = "";

    @OriginalMember(owner = "client", name = "Eh", descriptor = "[I")
    private int[] field432 = new int[200];

    @OriginalMember(owner = "client", name = "Hh", descriptor = "I")
    private int field435 = 379;

    @OriginalMember(owner = "client", name = "Jh", descriptor = "Z")
    private boolean field437 = false;

    @OriginalMember(owner = "client", name = "Kh", descriptor = "Z")
    private boolean field438 = false;

    @OriginalMember(owner = "client", name = "Lh", descriptor = "I")
    private int field439 = 9;

    @OriginalMember(owner = "client", name = "Rh", descriptor = "I")
    private int field445 = 7;

    @OriginalMember(owner = "client", name = "Yh", descriptor = "Z")
    private boolean field452 = true;

    @OriginalMember(owner = "client", name = "Zh", descriptor = "Z")
    private boolean field453 = true;

    @OriginalMember(owner = "client", name = "ai", descriptor = "Z")
    private boolean field454 = true;

    @OriginalMember(owner = "client", name = "ci", descriptor = "I")
    private int field456 = 2048;

    @OriginalMember(owner = "client", name = "di", descriptor = "I")
    private int field457 = 2047;

    @OriginalMember(owner = "client", name = "ei", descriptor = "[LKWSXZIVG;")
    private class29[] field458 = new class29[this.field456];

    @OriginalMember(owner = "client", name = "gi", descriptor = "[I")
    public int[] field460 = new int[this.field456];

    @OriginalMember(owner = "client", name = "ii", descriptor = "[I")
    private int[] field462 = new int[this.field456];

    @OriginalMember(owner = "client", name = "ji", descriptor = "[LMQZHAILV;")
    private class33[] field463 = new class33[this.field456];

    @OriginalMember(owner = "client", name = "ki", descriptor = "I")
    private int field464 = 3353893;

    @OriginalMember(owner = "client", name = "mi", descriptor = "[I")
    private int[] field466 = new int[class64.field1485];

    @OriginalMember(owner = "client", name = "oi", descriptor = "I")
    private int field468 = 2;

    @OriginalMember(owner = "client", name = "qi", descriptor = "[I")
    private int[] field470 = new int[class64.field1485];

    @OriginalMember(owner = "client", name = "yi", descriptor = "I")
    private int field478 = 2301979;

    @OriginalMember(owner = "client", name = "zi", descriptor = "Z")
    private boolean field479 = false;

    @OriginalMember(owner = "client", name = "Ai", descriptor = "I")
    private final int field480 = 100;

    @OriginalMember(owner = "client", name = "Bi", descriptor = "[I")
    private int[] field481 = new int[100];

    @OriginalMember(owner = "client", name = "Di", descriptor = "[J")
    private long[] field483 = new long[200];

    @OriginalMember(owner = "client", name = "Ei", descriptor = "[I")
    private int[] field484 = new int[4000];

    @OriginalMember(owner = "client", name = "Fi", descriptor = "[I")
    private int[] field485 = new int[4000];

    @OriginalMember(owner = "client", name = "Hi", descriptor = "B")
    private byte field487 = 7;

    @OriginalMember(owner = "client", name = "dj", descriptor = "Z")
    private boolean field509 = false;

    @OriginalMember(owner = "client", name = "ej", descriptor = "[I")
    private int[] field510 = new int[2000];

    @OriginalMember(owner = "client", name = "gj", descriptor = "[I")
    private int[] field512 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client", name = "hj", descriptor = "[LHQETDHHW;")
    private class20[] field513 = new class20[13];

    @OriginalMember(owner = "client", name = "kj", descriptor = "B")
    private byte field516 = -106;

    @OriginalMember(owner = "client", name = "nj", descriptor = "B")
    private byte field519 = 81;

    @OriginalMember(owner = "client", name = "pj", descriptor = "B")
    private byte field521 = 2;

    @OriginalMember(owner = "client", name = "rj", descriptor = "I")
    private int field523 = -1;

    @OriginalMember(owner = "client", name = "sj", descriptor = "Z")
    private boolean field524 = false;

    @OriginalMember(owner = "client", name = "uj", descriptor = "[I")
    private int[] field526 = new int[5];

    @OriginalMember(owner = "client", name = "Dj", descriptor = "Z")
    private boolean field535 = false;

    @OriginalMember(owner = "client", name = "Gj", descriptor = "[[[LPUBJBHOK;")
    private class42[][][] field538 = new class42[4][104][104];

    @OriginalMember(owner = "client", name = "Hj", descriptor = "[LXWXMLCDO;")
    public class66[] field539 = new class66[5];

    @OriginalMember(owner = "client", name = "Jj", descriptor = "I")
    private int field541 = -1;

    @OriginalMember(owner = "client", name = "Mj", descriptor = "[I")
    private int[] field544 = new int[5];

    @OriginalMember(owner = "client", name = "Nj", descriptor = "[I")
    private final int[] field545 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client", name = "Ib", descriptor = "[I")
    public static final int[] field125 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };

    @OriginalMember(owner = "client", name = "Uc", descriptor = "[[I")
    public static final int[][] field189 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client", name = "Md", descriptor = "I")
    private static int field233 = -27735;

    @OriginalMember(owner = "client", name = "Vd", descriptor = "Ljava/math/BigInteger;")
    private static BigInteger field242 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client", name = "le", descriptor = "Ljava/math/BigInteger;")
    private static BigInteger field258 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client", name = "Ke", descriptor = "[I")
    public static int[] field283 = new int[32];

    @OriginalMember(owner = "client", name = "dg", descriptor = "[I")
    private static int[] field353;

    @OriginalMember(owner = "client", name = "xg", descriptor = "I")
    private static int field373;

    @OriginalMember(owner = "client", name = "zg", descriptor = "Z")
    private static boolean field375;

    @OriginalMember(owner = "client", name = "ph", descriptor = "B")
    private static byte field417;

    @OriginalMember(owner = "client", name = "Si", descriptor = "I")
    private static int field498;

    @OriginalMember(owner = "client", name = "qj", descriptor = "Ljava/lang/String;")
    private static String field522;

    @OriginalMember(owner = "client", name = "jb", descriptor = "I")
    private int field100;

    @OriginalMember(owner = "client", name = "kb", descriptor = "I")
    private int field101;

    @OriginalMember(owner = "client", name = "ob", descriptor = "I")
    private int field105;

    @OriginalMember(owner = "client", name = "qb", descriptor = "I")
    private int field107;

    @OriginalMember(owner = "client", name = "vb", descriptor = "I")
    private int field112;

    @OriginalMember(owner = "client", name = "Ab", descriptor = "I")
    private int field117;

    @OriginalMember(owner = "client", name = "Fb", descriptor = "I")
    private int field122;

    @OriginalMember(owner = "client", name = "Gb", descriptor = "I")
    private int field123;

    @OriginalMember(owner = "client", name = "Jb", descriptor = "I")
    private int field126;

    @OriginalMember(owner = "client", name = "Kb", descriptor = "I")
    private int field127;

    @OriginalMember(owner = "client", name = "Lb", descriptor = "I")
    private int field128;

    @OriginalMember(owner = "client", name = "Nb", descriptor = "I")
    private int field130;

    @OriginalMember(owner = "client", name = "Rb", descriptor = "I")
    private int field134;

    @OriginalMember(owner = "client", name = "Zb", descriptor = "I")
    private static int field142;

    @OriginalMember(owner = "client", name = "ac", descriptor = "I")
    private int field143;

    @OriginalMember(owner = "client", name = "ec", descriptor = "I")
    private int field147;

    @OriginalMember(owner = "client", name = "fc", descriptor = "I")
    private int field148;

    @OriginalMember(owner = "client", name = "gc", descriptor = "I")
    private int field149;

    @OriginalMember(owner = "client", name = "hc", descriptor = "I")
    private int field150;

    @OriginalMember(owner = "client", name = "jc", descriptor = "I")
    private int field152;

    @OriginalMember(owner = "client", name = "kc", descriptor = "I")
    private int field153;

    @OriginalMember(owner = "client", name = "nc", descriptor = "I")
    private static int field156;

    @OriginalMember(owner = "client", name = "Mc", descriptor = "I")
    private int field181;

    @OriginalMember(owner = "client", name = "Oc", descriptor = "I")
    private int field183;

    @OriginalMember(owner = "client", name = "bd", descriptor = "I")
    private int field196;

    @OriginalMember(owner = "client", name = "cd", descriptor = "I")
    private int field197;

    @OriginalMember(owner = "client", name = "dd", descriptor = "I")
    private int field198;

    @OriginalMember(owner = "client", name = "ed", descriptor = "I")
    private int field199;

    @OriginalMember(owner = "client", name = "fd", descriptor = "I")
    private int field200;

    @OriginalMember(owner = "client", name = "gd", descriptor = "I")
    private int field201;

    @OriginalMember(owner = "client", name = "kd", descriptor = "I")
    private int field205;

    @OriginalMember(owner = "client", name = "wd", descriptor = "I")
    private int field217;

    @OriginalMember(owner = "client", name = "xd", descriptor = "I")
    private int field218;

    @OriginalMember(owner = "client", name = "yd", descriptor = "I")
    private int field219;

    @OriginalMember(owner = "client", name = "zd", descriptor = "I")
    private int field220;

    @OriginalMember(owner = "client", name = "Cd", descriptor = "I")
    private int field223;

    @OriginalMember(owner = "client", name = "Fd", descriptor = "I")
    private int field226;

    @OriginalMember(owner = "client", name = "Gd", descriptor = "I")
    private static int field227;

    @OriginalMember(owner = "client", name = "Od", descriptor = "I")
    private int field235;

    @OriginalMember(owner = "client", name = "Sd", descriptor = "I")
    private int field239;

    @OriginalMember(owner = "client", name = "Zd", descriptor = "I")
    private int field246;

    @OriginalMember(owner = "client", name = "de", descriptor = "I")
    private static int field250;

    @OriginalMember(owner = "client", name = "me", descriptor = "I")
    private static int field259;

    @OriginalMember(owner = "client", name = "ne", descriptor = "I")
    private int field260;

    @OriginalMember(owner = "client", name = "oe", descriptor = "I")
    private int field261;

    @OriginalMember(owner = "client", name = "pe", descriptor = "I")
    private int field262;

    @OriginalMember(owner = "client", name = "qe", descriptor = "I")
    private int field263;

    @OriginalMember(owner = "client", name = "re", descriptor = "I")
    private int field264;

    @OriginalMember(owner = "client", name = "se", descriptor = "I")
    private int field265;

    @OriginalMember(owner = "client", name = "te", descriptor = "I")
    private int field266;

    @OriginalMember(owner = "client", name = "ue", descriptor = "I")
    private int field267;

    @OriginalMember(owner = "client", name = "ve", descriptor = "I")
    private int field268;

    @OriginalMember(owner = "client", name = "we", descriptor = "I")
    private int field269;

    @OriginalMember(owner = "client", name = "xe", descriptor = "I")
    private int field270;

    @OriginalMember(owner = "client", name = "ze", descriptor = "I")
    private int field272;

    @OriginalMember(owner = "client", name = "De", descriptor = "I")
    private static int field276;

    @OriginalMember(owner = "client", name = "Ee", descriptor = "I")
    private int field277;

    @OriginalMember(owner = "client", name = "He", descriptor = "I")
    private int field280;

    @OriginalMember(owner = "client", name = "Me", descriptor = "I")
    private int field285;

    @OriginalMember(owner = "client", name = "Oe", descriptor = "I")
    private int field287;

    @OriginalMember(owner = "client", name = "df", descriptor = "I")
    private int field302;

    @OriginalMember(owner = "client", name = "ef", descriptor = "I")
    private int field303;

    @OriginalMember(owner = "client", name = "ff", descriptor = "I")
    private int field304;

    @OriginalMember(owner = "client", name = "gf", descriptor = "I")
    private int field305;

    @OriginalMember(owner = "client", name = "hf", descriptor = "I")
    private int field306;

    @OriginalMember(owner = "client", name = "jf", descriptor = "I")
    private int field307;

    @OriginalMember(owner = "client", name = "kf", descriptor = "I")
    private int field308;

    @OriginalMember(owner = "client", name = "lf", descriptor = "I")
    private int field309;

    @OriginalMember(owner = "client", name = "wf", descriptor = "I")
    private int field320;

    @OriginalMember(owner = "client", name = "xf", descriptor = "I")
    private int field321;

    @OriginalMember(owner = "client", name = "yf", descriptor = "I")
    private int field322;

    @OriginalMember(owner = "client", name = "zf", descriptor = "I")
    private int field323;

    @OriginalMember(owner = "client", name = "Af", descriptor = "I")
    private int field324;

    @OriginalMember(owner = "client", name = "Bf", descriptor = "I")
    private int field325;

    @OriginalMember(owner = "client", name = "Cf", descriptor = "I")
    private int field326;

    @OriginalMember(owner = "client", name = "Ef", descriptor = "I")
    private int field328;

    @OriginalMember(owner = "client", name = "Hf", descriptor = "I")
    private static int field331;

    @OriginalMember(owner = "client", name = "If", descriptor = "I")
    private int field332;

    @OriginalMember(owner = "client", name = "Jf", descriptor = "I")
    public int field333;

    @OriginalMember(owner = "client", name = "Qf", descriptor = "I")
    private int field340;

    @OriginalMember(owner = "client", name = "Rf", descriptor = "I")
    private int field341;

    @OriginalMember(owner = "client", name = "Yf", descriptor = "I")
    private int field348;

    @OriginalMember(owner = "client", name = "Zf", descriptor = "I")
    private int field349;

    @OriginalMember(owner = "client", name = "bg", descriptor = "I")
    private int field351;

    @OriginalMember(owner = "client", name = "kg", descriptor = "I")
    private int field360;

    @OriginalMember(owner = "client", name = "tg", descriptor = "I")
    public static int field369;

    @OriginalMember(owner = "client", name = "yg", descriptor = "I")
    public static int field374;

    @OriginalMember(owner = "client", name = "Cg", descriptor = "I")
    private int field378;

    @OriginalMember(owner = "client", name = "Gg", descriptor = "I")
    private int field382;

    @OriginalMember(owner = "client", name = "Ig", descriptor = "I")
    private int field384;

    @OriginalMember(owner = "client", name = "Jg", descriptor = "I")
    private int field385;

    @OriginalMember(owner = "client", name = "Kg", descriptor = "I")
    private int field386;

    @OriginalMember(owner = "client", name = "Lg", descriptor = "I")
    private int field387;

    @OriginalMember(owner = "client", name = "Mg", descriptor = "I")
    private int field388;

    @OriginalMember(owner = "client", name = "Ng", descriptor = "I")
    private int field389;

    @OriginalMember(owner = "client", name = "Og", descriptor = "I")
    private int field390;

    @OriginalMember(owner = "client", name = "Rg", descriptor = "I")
    private int field393;

    @OriginalMember(owner = "client", name = "Ug", descriptor = "I")
    private int field396;

    @OriginalMember(owner = "client", name = "Xg", descriptor = "I")
    private int field399;

    @OriginalMember(owner = "client", name = "ch", descriptor = "I")
    private int field404;

    @OriginalMember(owner = "client", name = "eh", descriptor = "I")
    private static int field406;

    @OriginalMember(owner = "client", name = "fh", descriptor = "I")
    private int field407;

    @OriginalMember(owner = "client", name = "gh", descriptor = "I")
    private int field408;

    @OriginalMember(owner = "client", name = "ih", descriptor = "I")
    private int field410;

    @OriginalMember(owner = "client", name = "lh", descriptor = "I")
    private int field413;

    @OriginalMember(owner = "client", name = "mh", descriptor = "I")
    private int field414;

    @OriginalMember(owner = "client", name = "nh", descriptor = "I")
    private int field415;

    @OriginalMember(owner = "client", name = "oh", descriptor = "I")
    private int field416;

    @OriginalMember(owner = "client", name = "qh", descriptor = "I")
    private static int field418;

    @OriginalMember(owner = "client", name = "sh", descriptor = "I")
    private int field420;

    @OriginalMember(owner = "client", name = "yh", descriptor = "I")
    private int field426;

    @OriginalMember(owner = "client", name = "Bh", descriptor = "I")
    private static int field429;

    @OriginalMember(owner = "client", name = "Fh", descriptor = "I")
    private int field433;

    @OriginalMember(owner = "client", name = "Ih", descriptor = "I")
    private static int field436;

    @OriginalMember(owner = "client", name = "Mh", descriptor = "I")
    private int field440;

    @OriginalMember(owner = "client", name = "Nh", descriptor = "I")
    private int field441;

    @OriginalMember(owner = "client", name = "Oh", descriptor = "I")
    private int field442;

    @OriginalMember(owner = "client", name = "Ph", descriptor = "I")
    private int field443;

    @OriginalMember(owner = "client", name = "Qh", descriptor = "I")
    private int field444;

    @OriginalMember(owner = "client", name = "Xh", descriptor = "I")
    private static int field451;

    @OriginalMember(owner = "client", name = "bi", descriptor = "I")
    private int field455;

    @OriginalMember(owner = "client", name = "fi", descriptor = "I")
    private int field459;

    @OriginalMember(owner = "client", name = "hi", descriptor = "I")
    private int field461;

    @OriginalMember(owner = "client", name = "li", descriptor = "I")
    public static int field465;

    @OriginalMember(owner = "client", name = "ni", descriptor = "I")
    private int field467;

    @OriginalMember(owner = "client", name = "pi", descriptor = "I")
    private int field469;

    @OriginalMember(owner = "client", name = "ui", descriptor = "I")
    private int field474;

    @OriginalMember(owner = "client", name = "vi", descriptor = "I")
    private int field475;

    @OriginalMember(owner = "client", name = "wi", descriptor = "I")
    private int field476;

    @OriginalMember(owner = "client", name = "Gi", descriptor = "I")
    private int field486;

    @OriginalMember(owner = "client", name = "Ii", descriptor = "I")
    private int field488;

    @OriginalMember(owner = "client", name = "Ji", descriptor = "I")
    private int field489;

    @OriginalMember(owner = "client", name = "Ki", descriptor = "I")
    private int field490;

    @OriginalMember(owner = "client", name = "Li", descriptor = "I")
    private int field491;

    @OriginalMember(owner = "client", name = "Mi", descriptor = "I")
    private int field492;

    @OriginalMember(owner = "client", name = "Ri", descriptor = "I")
    private int field497;

    @OriginalMember(owner = "client", name = "Ti", descriptor = "I")
    private int field499;

    @OriginalMember(owner = "client", name = "Ui", descriptor = "I")
    private int field500;

    @OriginalMember(owner = "client", name = "Vi", descriptor = "I")
    private int field501;

    @OriginalMember(owner = "client", name = "Wi", descriptor = "I")
    private int field502;

    @OriginalMember(owner = "client", name = "Xi", descriptor = "I")
    private int field503;

    @OriginalMember(owner = "client", name = "Yi", descriptor = "I")
    private int field504;

    @OriginalMember(owner = "client", name = "Zi", descriptor = "I")
    private int field505;

    @OriginalMember(owner = "client", name = "aj", descriptor = "I")
    private int field506;

    @OriginalMember(owner = "client", name = "bj", descriptor = "I")
    private int field507;

    @OriginalMember(owner = "client", name = "cj", descriptor = "I")
    private int field508;

    @OriginalMember(owner = "client", name = "fj", descriptor = "I")
    private int field511;

    @OriginalMember(owner = "client", name = "ij", descriptor = "I")
    private int field514;

    @OriginalMember(owner = "client", name = "mj", descriptor = "I")
    private static int field518;

    @OriginalMember(owner = "client", name = "oj", descriptor = "I")
    private static int field520;

    @OriginalMember(owner = "client", name = "Aj", descriptor = "I")
    private int field532;

    @OriginalMember(owner = "client", name = "Bj", descriptor = "I")
    private int field533;

    @OriginalMember(owner = "client", name = "Cj", descriptor = "I")
    private int field534;

    @OriginalMember(owner = "client", name = "Fj", descriptor = "I")
    private int field537;

    @OriginalMember(owner = "client", name = "Ij", descriptor = "I")
    private int field540;

    @OriginalMember(owner = "client", name = "Kj", descriptor = "I")
    private int field542;

    @OriginalMember(owner = "client", name = "Lj", descriptor = "I")
    private int field543;

    @OriginalMember(owner = "client", name = "Oj", descriptor = "I")
    public static int field546;

    @OriginalMember(owner = "client", name = "K", descriptor = "I")
    private int field75;

    @OriginalMember(owner = "client", name = "O", descriptor = "I")
    private int field79;

    @OriginalMember(owner = "client", name = "Q", descriptor = "I")
    public int field81;

    @OriginalMember(owner = "client", name = "R", descriptor = "I")
    public int field82;

    @OriginalMember(owner = "client", name = "db", descriptor = "I")
    private int field94;

    @OriginalMember(owner = "client", name = "eb", descriptor = "I")
    private static int field95;

    @OriginalMember(owner = "client", name = "hb", descriptor = "I")
    private static int field98;

    @OriginalMember(owner = "client", name = "Df", descriptor = "J")
    private long field327;

    @OriginalMember(owner = "client", name = "Tf", descriptor = "J")
    private long field343;

    @OriginalMember(owner = "client", name = "jj", descriptor = "J")
    private long field515;

    @OriginalMember(owner = "client", name = "L", descriptor = "J")
    private long field76;

    @OriginalMember(owner = "client", name = "N", descriptor = "J")
    public long field78;

    @OriginalMember(owner = "client", name = "rb", descriptor = "LHQETDHHW;")
    private class20 field108;

    @OriginalMember(owner = "client", name = "sb", descriptor = "LHQETDHHW;")
    private class20 field109;

    @OriginalMember(owner = "client", name = "tb", descriptor = "LHQETDHHW;")
    private class20 field110;

    @OriginalMember(owner = "client", name = "vc", descriptor = "LHQETDHHW;")
    private class20 field164;

    @OriginalMember(owner = "client", name = "wc", descriptor = "LHQETDHHW;")
    private class20 field165;

    @OriginalMember(owner = "client", name = "xc", descriptor = "LHQETDHHW;")
    private class20 field166;

    @OriginalMember(owner = "client", name = "yc", descriptor = "LHQETDHHW;")
    private class20 field167;

    @OriginalMember(owner = "client", name = "zc", descriptor = "LHQETDHHW;")
    private class20 field168;

    @OriginalMember(owner = "client", name = "Kf", descriptor = "LHQETDHHW;")
    private class20 field334;

    @OriginalMember(owner = "client", name = "Lf", descriptor = "LHQETDHHW;")
    private class20 field335;

    @OriginalMember(owner = "client", name = "Mf", descriptor = "LHQETDHHW;")
    private class20 field336;

    @OriginalMember(owner = "client", name = "Nf", descriptor = "LHQETDHHW;")
    private class20 field337;

    @OriginalMember(owner = "client", name = "Of", descriptor = "LHQETDHHW;")
    private class20 field338;

    @OriginalMember(owner = "client", name = "Sh", descriptor = "LHQETDHHW;")
    private class20 field446;

    @OriginalMember(owner = "client", name = "Th", descriptor = "LHQETDHHW;")
    private class20 field447;

    @OriginalMember(owner = "client", name = "ri", descriptor = "LHQETDHHW;")
    private class20 field471;

    @OriginalMember(owner = "client", name = "si", descriptor = "LHQETDHHW;")
    private class20 field472;

    @OriginalMember(owner = "client", name = "ti", descriptor = "LHQETDHHW;")
    private class20 field473;

    @OriginalMember(owner = "client", name = "fb", descriptor = "LHQETDHHW;")
    private class20 field96;

    @OriginalMember(owner = "client", name = "gb", descriptor = "LHQETDHHW;")
    private class20 field97;

    @OriginalMember(owner = "client", name = "bc", descriptor = "LKWSXZIVG;")
    public static class29 field144;

    @OriginalMember(owner = "client", name = "pg", descriptor = "LRCWDZCCF;")
    private class45 field365;

    @OriginalMember(owner = "client", name = "Wd", descriptor = "LRGNQYESN;")
    private class46 field243;

    @OriginalMember(owner = "client", name = "Xe", descriptor = "LRGWSJTPO;")
    private class47 field296;

    @OriginalMember(owner = "client", name = "Ye", descriptor = "LRGWSJTPO;")
    private class47 field297;

    @OriginalMember(owner = "client", name = "Ze", descriptor = "LRGWSJTPO;")
    private class47 field298;

    @OriginalMember(owner = "client", name = "af", descriptor = "LRGWSJTPO;")
    private class47 field299;

    @OriginalMember(owner = "client", name = "Yc", descriptor = "LUFHMHWIH;")
    private class55 field193;

    @OriginalMember(owner = "client", name = "Zc", descriptor = "LUFHMHWIH;")
    private class55 field194;

    @OriginalMember(owner = "client", name = "ee", descriptor = "LUFHMHWIH;")
    private class55 field251;

    @OriginalMember(owner = "client", name = "fe", descriptor = "LUFHMHWIH;")
    private class55 field252;

    @OriginalMember(owner = "client", name = "Ge", descriptor = "LUFHMHWIH;")
    private class55 field279;

    @OriginalMember(owner = "client", name = "bf", descriptor = "LUFHMHWIH;")
    private class55 field300;

    @OriginalMember(owner = "client", name = "ag", descriptor = "LUFHMHWIH;")
    private class55 field350;

    @OriginalMember(owner = "client", name = "vj", descriptor = "LUFHMHWIH;")
    private class55 field527;

    @OriginalMember(owner = "client", name = "wj", descriptor = "LUFHMHWIH;")
    private class55 field528;

    @OriginalMember(owner = "client", name = "xj", descriptor = "LUFHMHWIH;")
    private class55 field529;

    @OriginalMember(owner = "client", name = "yj", descriptor = "LUFHMHWIH;")
    private class55 field530;

    @OriginalMember(owner = "client", name = "zj", descriptor = "LUFHMHWIH;")
    private class55 field531;

    @OriginalMember(owner = "client", name = "V", descriptor = "LUFHMHWIH;")
    private class55 field86;

    @OriginalMember(owner = "client", name = "W", descriptor = "LUFHMHWIH;")
    private class55 field87;

    @OriginalMember(owner = "client", name = "Vb", descriptor = "LUTXVFWKJ;")
    public class57 field138;

    @OriginalMember(owner = "client", name = "Ac", descriptor = "LWMEYNQIL;")
    private class62 field169;

    @OriginalMember(owner = "client", name = "Ff", descriptor = "LYCBPJRVN;")
    private class67 field329;

    @OriginalMember(owner = "client", name = "oc", descriptor = "LCPJIVKZX;")
    private class7 field157;

    @OriginalMember(owner = "client", name = "pc", descriptor = "LCPJIVKZX;")
    private class7 field158;

    @OriginalMember(owner = "client", name = "qc", descriptor = "LCPJIVKZX;")
    private class7 field159;

    @OriginalMember(owner = "client", name = "rc", descriptor = "LCPJIVKZX;")
    private class7 field160;

    @OriginalMember(owner = "client", name = "Cc", descriptor = "LCPJIVKZX;")
    private class7 field171;

    @OriginalMember(owner = "client", name = "Dc", descriptor = "LCPJIVKZX;")
    private class7 field172;

    @OriginalMember(owner = "client", name = "Ec", descriptor = "LCPJIVKZX;")
    private class7 field173;

    @OriginalMember(owner = "client", name = "Fc", descriptor = "LCPJIVKZX;")
    private class7 field174;

    @OriginalMember(owner = "client", name = "Gc", descriptor = "LCPJIVKZX;")
    private class7 field175;

    @OriginalMember(owner = "client", name = "Hc", descriptor = "LCPJIVKZX;")
    private class7 field176;

    @OriginalMember(owner = "client", name = "Ic", descriptor = "LCPJIVKZX;")
    private class7 field177;

    @OriginalMember(owner = "client", name = "Jc", descriptor = "LCPJIVKZX;")
    private class7 field178;

    @OriginalMember(owner = "client", name = "Kc", descriptor = "LCPJIVKZX;")
    private class7 field179;

    @OriginalMember(owner = "client", name = "nf", descriptor = "LCPJIVKZX;")
    private class7 field311;

    @OriginalMember(owner = "client", name = "of", descriptor = "LCPJIVKZX;")
    private class7 field312;

    @OriginalMember(owner = "client", name = "pf", descriptor = "LCPJIVKZX;")
    private class7 field313;

    @OriginalMember(owner = "client", name = "qf", descriptor = "LCPJIVKZX;")
    private class7 field314;

    @OriginalMember(owner = "client", name = "rf", descriptor = "LCPJIVKZX;")
    private class7 field315;

    @OriginalMember(owner = "client", name = "sf", descriptor = "LCPJIVKZX;")
    private class7 field316;

    @OriginalMember(owner = "client", name = "tf", descriptor = "LCPJIVKZX;")
    private class7 field317;

    @OriginalMember(owner = "client", name = "uf", descriptor = "LCPJIVKZX;")
    private class7 field318;

    @OriginalMember(owner = "client", name = "vf", descriptor = "LCPJIVKZX;")
    private class7 field319;

    @OriginalMember(owner = "client", name = "Y", descriptor = "LCPJIVKZX;")
    private class7 field89;

    @OriginalMember(owner = "client", name = "Z", descriptor = "LCPJIVKZX;")
    private class7 field90;

    @OriginalMember(owner = "client", name = "ab", descriptor = "LCPJIVKZX;")
    private class7 field91;

    @OriginalMember(owner = "client", name = "Pg", descriptor = "LCXFTMSCH;")
    private class8 field391;

    @OriginalMember(owner = "client", name = "ic", descriptor = "Ljava/lang/String;")
    public String field151;

    @OriginalMember(owner = "client", name = "Wc", descriptor = "Ljava/lang/String;")
    private String field191;

    @OriginalMember(owner = "client", name = "Yd", descriptor = "Ljava/lang/String;")
    private String field245;

    @OriginalMember(owner = "client", name = "xi", descriptor = "Ljava/lang/String;")
    public String field477;

    @OriginalMember(owner = "client", name = "Ej", descriptor = "Ljava/net/Socket;")
    private Socket field536;

    @OriginalMember(owner = "client", name = "Gf", descriptor = "Z")
    public static boolean field330;

    @OriginalMember(owner = "client", name = "Ag", descriptor = "Z")
    private static boolean field376;

    @OriginalMember(owner = "client", name = "tj", descriptor = "Z")
    private static boolean field525;

    @OriginalMember(owner = "client", name = "U", descriptor = "Z")
    public static boolean field85;

    @OriginalMember(owner = "client", name = "ud", descriptor = "[I")
    private int[] field215;

    @OriginalMember(owner = "client", name = "vd", descriptor = "[I")
    private int[] field216;

    @OriginalMember(owner = "client", name = "Ie", descriptor = "[I")
    private int[] field281;

    @OriginalMember(owner = "client", name = "Je", descriptor = "[I")
    private int[] field282;

    @OriginalMember(owner = "client", name = "Uf", descriptor = "[I")
    private int[] field344;

    @OriginalMember(owner = "client", name = "Vf", descriptor = "[I")
    private int[] field345;

    @OriginalMember(owner = "client", name = "Wf", descriptor = "[I")
    private int[] field346;

    @OriginalMember(owner = "client", name = "Uh", descriptor = "[I")
    private int[] field448;

    @OriginalMember(owner = "client", name = "Vh", descriptor = "[I")
    private int[] field449;

    @OriginalMember(owner = "client", name = "Wh", descriptor = "[I")
    private int[] field450;

    @OriginalMember(owner = "client", name = "Ni", descriptor = "[I")
    private int[] field493;

    @OriginalMember(owner = "client", name = "Oi", descriptor = "[I")
    private int[] field494;

    @OriginalMember(owner = "client", name = "Pi", descriptor = "[I")
    private int[] field495;

    @OriginalMember(owner = "client", name = "Qi", descriptor = "[I")
    private int[] field496;

    @OriginalMember(owner = "client", name = "Ci", descriptor = "[LHQETDHHW;")
    private class20[] field482;

    @OriginalMember(owner = "client", name = "mc", descriptor = "[[B")
    private byte[][] field155;

    @OriginalMember(owner = "client", name = "Qe", descriptor = "[[B")
    private byte[][] field289;

    @OriginalMember(owner = "client", name = "lj", descriptor = "[[[B")
    private byte[][][] field517;

    @OriginalMember(owner = "client", name = "Gh", descriptor = "[[[I")
    private int[][][] field434;

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILTDQUELMV;B)I")
    public final int method20(int arg0, class52 arg1, byte arg2) {
        if (arg2 != 76) {
            this.field538 = null;
        }
        if (arg1.field1261 != null && arg0 < arg1.field1261.length) {
            try {
                int[] var4 = arg1.field1261[arg0];
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
                        var9 = this.field466[var4[var6++]];
                    }
                    if (var8 == 2) {
                        var9 = this.field131[var4[var6++]];
                    }
                    if (var8 == 3) {
                        var9 = this.field470[var4[var6++]];
                    }
                    if (var8 == 4) {
                        class52 var11 = class52.field1258[var4[var6++]];
                        int var12 = var4[var6++];
                        if (var12 >= 0 && var12 < class3.field41 && (!class3.method13(var12).field49 || field375)) {
                            for (int var13 = 0; var13 < var11.field1304.length; ++var13) {
                                if (var12 + 1 == var11.field1304[var13]) {
                                    var9 += var11.field1272[var13];
                                }
                            }
                        }
                    }
                    if (var8 == 5) {
                        var9 = this.field232[var4[var6++]];
                    }
                    if (var8 == 6) {
                        var9 = field353[this.field131[var4[var6++]] - 1];
                    }
                    if (var8 == 7) {
                        var9 = this.field232[var4[var6++]] * 100 / 46875;
                    }
                    if (var8 == 8) {
                        var9 = field144.field871;
                    }
                    if (var8 == 9) {
                        for (int var14 = 0; var14 < class64.field1485; ++var14) {
                            if (class64.field1487[var14]) {
                                var9 += this.field131[var14];
                            }
                        }
                    }
                    if (var8 == 10) {
                        class52 var15 = class52.field1258[var4[var6++]];
                        int var16 = var4[var6++] + 1;
                        if (var16 >= 0 && var16 < class3.field41 && (!class3.method13(var16).field49 || field375)) {
                            for (int var17 = 0; var17 < var15.field1304.length; ++var17) {
                                if (var15.field1304[var17] == var16) {
                                    var9 = 999999999;
                                    break;
                                }
                            }
                        }
                    }
                    if (var8 == 11) {
                        var9 = this.field416;
                    }
                    if (var8 == 12) {
                        var9 = this.field404;
                    }
                    if (var8 == 13) {
                        int var18 = this.field232[var4[var6++]];
                        int var19 = var4[var6++];
                        var9 = (var18 & 1 << var19) != 0 ? 1 : 0;
                    }
                    if (var8 == 14) {
                        int var20 = var4[var6++];
                        class9 var21 = class9.field626[var20];
                        int var22 = var21.field628;
                        int var23 = var21.field629;
                        int var24 = var21.field630;
                        int var25 = field283[var24 - var23];
                        var9 = this.field232[var22] >> var23 & var25;
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
                        var9 = (field144.field1206 >> 7) + this.field499;
                    }
                    if (var8 == 19) {
                        var9 = (field144.field1207 >> 7) + this.field500;
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

    @OriginalMember(owner = "client", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        if (signlink.mainapp != null) {
            return signlink.mainapp.getCodeBase();
        } else {
            try {
                if (super.field1653 != null) {
                    return new URL("http://127.0.0.1:" + (field374 + 80));
                }
            } catch (Exception var1) {
            }
            return super.getCodeBase();
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(ZI)V")
    public final void method21(boolean arg0, int arg1) {
        for (int var3 = 0; var3 < this.field134; ++var3) {
            class36 var4 = this.field133[this.field135[var3]];
            int var5 = (this.field135[var3] << 14) + 536870912;
            if (var4 != null && var4.method273(0) && var4.field966.field595 == arg0) {
                int var6 = var4.field1206 >> 7;
                int var7 = var4.field1207 >> 7;
                if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
                    if (var4.field1242 == 1 && (var4.field1206 & 127) == 64 && (var4.field1207 & 127) == 64) {
                        if (this.field104[var6][var7] == this.field219) {
                            continue;
                        }
                        this.field104[var6][var7] = this.field219;
                    }
                    if (!var4.field966.field580) {
                        var5 += Integer.MIN_VALUE;
                    }
                    this.field243.method417(var4.field1207, var4.field1206, (var4.field1242 - 1) * 64 + 60, this.method24(var4.field1206, -8947, var4.field1207, this.field426), var4, 3, this.field426, var4.field1230, var4.field1208, var5);
                }
            }
        }
        if (arg1 != -434) {
            this.field310.method315(205);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIIIIIIZBI)Z")
    public final boolean method22(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, byte arg10, int arg11) {
        byte var13 = 104;
        byte var14 = 104;
        for (int var15 = 0; var15 < var13; ++var15) {
            for (int var35 = 0; var35 < var14; ++var35) {
                this.field102[var15][var35] = 0;
                this.field221[var15][var35] = 99999999;
            }
        }
        int var16 = arg6;
        int var17 = arg11;
        this.field102[arg6][arg11] = 99;
        this.field221[arg6][arg11] = 0;
        byte var18 = 0;
        int var19 = 0;
        this.field484[var18] = arg6;
        int var36 = var18 + 1;
        this.field485[var18] = arg11;
        boolean var20 = false;
        int var21 = this.field484.length;
        int[][] var22 = this.field238[this.field426].field926;
        if (arg10 != -48) {
            this.field397 = 395;
        }
        while (var36 != var19) {
            var16 = this.field484[var19];
            var17 = this.field485[var19];
            var19 = (var19 + 1) % var21;
            if (arg5 == var16 && arg1 == var17) {
                var20 = true;
                break;
            }
            if (arg4 != 0) {
                if ((arg4 < 5 || arg4 == 10) && this.field238[this.field426].method310(arg5, this.field487, arg7, var16, arg1, var17, arg4 - 1)) {
                    var20 = true;
                    break;
                }
                if (arg4 < 10 && this.field238[this.field426].method311(var16, arg7, arg4 - 1, var17, arg5, 0, arg1)) {
                    var20 = true;
                    break;
                }
            }
            if (arg8 != 0 && arg3 != 0 && this.field238[this.field426].method312((byte) 8, var17, var16, arg0, arg3, arg5, arg8, arg1)) {
                var20 = true;
                break;
            }
            int var34 = this.field221[var16][var17] + 1;
            if (var16 > 0 && this.field102[var16 - 1][var17] == 0 && (var22[var16 - 1][var17] & 19398920) == 0) {
                this.field484[var36] = var16 - 1;
                this.field485[var36] = var17;
                var36 = (var36 + 1) % var21;
                this.field102[var16 - 1][var17] = 2;
                this.field221[var16 - 1][var17] = var34;
            }
            if (var16 < var13 - 1 && this.field102[var16 + 1][var17] == 0 && (var22[var16 + 1][var17] & 19399040) == 0) {
                this.field484[var36] = var16 + 1;
                this.field485[var36] = var17;
                var36 = (var36 + 1) % var21;
                this.field102[var16 + 1][var17] = 8;
                this.field221[var16 + 1][var17] = var34;
            }
            if (var17 > 0 && this.field102[var16][var17 - 1] == 0 && (var22[var16][var17 - 1] & 19398914) == 0) {
                this.field484[var36] = var16;
                this.field485[var36] = var17 - 1;
                var36 = (var36 + 1) % var21;
                this.field102[var16][var17 - 1] = 1;
                this.field221[var16][var17 - 1] = var34;
            }
            if (var17 < var14 - 1 && this.field102[var16][var17 + 1] == 0 && (var22[var16][var17 + 1] & 19398944) == 0) {
                this.field484[var36] = var16;
                this.field485[var36] = var17 + 1;
                var36 = (var36 + 1) % var21;
                this.field102[var16][var17 + 1] = 4;
                this.field221[var16][var17 + 1] = var34;
            }
            if (var16 > 0 && var17 > 0 && this.field102[var16 - 1][var17 - 1] == 0 && (var22[var16 - 1][var17 - 1] & 19398926) == 0 && (var22[var16 - 1][var17] & 19398920) == 0 && (var22[var16][var17 - 1] & 19398914) == 0) {
                this.field484[var36] = var16 - 1;
                this.field485[var36] = var17 - 1;
                var36 = (var36 + 1) % var21;
                this.field102[var16 - 1][var17 - 1] = 3;
                this.field221[var16 - 1][var17 - 1] = var34;
            }
            if (var16 < var13 - 1 && var17 > 0 && this.field102[var16 + 1][var17 - 1] == 0 && (var22[var16 + 1][var17 - 1] & 19399043) == 0 && (var22[var16 + 1][var17] & 19399040) == 0 && (var22[var16][var17 - 1] & 19398914) == 0) {
                this.field484[var36] = var16 + 1;
                this.field485[var36] = var17 - 1;
                var36 = (var36 + 1) % var21;
                this.field102[var16 + 1][var17 - 1] = 9;
                this.field221[var16 + 1][var17 - 1] = var34;
            }
            if (var16 > 0 && var17 < var14 - 1 && this.field102[var16 - 1][var17 + 1] == 0 && (var22[var16 - 1][var17 + 1] & 19398968) == 0 && (var22[var16 - 1][var17] & 19398920) == 0 && (var22[var16][var17 + 1] & 19398944) == 0) {
                this.field484[var36] = var16 - 1;
                this.field485[var36] = var17 + 1;
                var36 = (var36 + 1) % var21;
                this.field102[var16 - 1][var17 + 1] = 6;
                this.field221[var16 - 1][var17 + 1] = var34;
            }
            if (var16 < var13 - 1 && var17 < var14 - 1 && this.field102[var16 + 1][var17 + 1] == 0 && (var22[var16 + 1][var17 + 1] & 19399136) == 0 && (var22[var16 + 1][var17] & 19399040) == 0 && (var22[var16][var17 + 1] & 19398944) == 0) {
                this.field484[var36] = var16 + 1;
                this.field485[var36] = var17 + 1;
                var36 = (var36 + 1) % var21;
                this.field102[var16 + 1][var17 + 1] = 12;
                this.field221[var16 + 1][var17 + 1] = var34;
            }
        }
        this.field542 = 0;
        if (!var20) {
            if (arg9) {
                int var23 = 100;
                for (int var24 = 1; var24 < 2; ++var24) {
                    for (int var25 = arg5 - var24; var25 <= arg5 + var24; ++var25) {
                        for (int var26 = arg1 - var24; var26 <= arg1 + var24; ++var26) {
                            if (var25 >= 0 && var26 >= 0 && var25 < 104 && var26 < 104 && this.field221[var25][var26] < var23) {
                                var23 = this.field221[var25][var26];
                                var16 = var25;
                                var17 = var26;
                                this.field542 = 1;
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
        this.field484[var27] = var16;
        int var37 = var27 + 1;
        this.field485[var27] = var17;
        int var28;
        int var29 = var28 = this.field102[var16][var17];
        while (arg6 != var16 || arg11 != var17) {
            if (var28 != var29) {
                var28 = var29;
                this.field484[var37] = var16;
                this.field485[var37++] = var17;
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
            var29 = this.field102[var16][var17];
        }
        if (var37 <= 0) {
            if (arg2 == 1) {
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
            int var31 = this.field484[var37];
            int var32 = this.field485[var37];
            if (arg2 == 0) {
                this.field310.method314(43776, 63);
                this.field310.method315(var30 + var30 + 3);
            }
            if (arg2 == 1) {
                this.field310.method314(43776, 83);
                this.field310.method315(var30 + var30 + 3 + 14);
            }
            if (arg2 == 2) {
                this.field310.method314(43776, 118);
                this.field310.method315(var30 + var30 + 3);
            }
            this.field310.method351(this.field499 + var31, 46574);
            this.field310.method315(super.field1668[5] == 1 ? 1 : 0);
            this.field348 = this.field484[0];
            this.field349 = this.field485[0];
            for (int var33 = 1; var33 < var30; ++var33) {
                --var37;
                this.field310.method341(this.field484[var37] - var31, 671);
                this.field310.method343((byte) 8, this.field485[var37] - var32);
            }
            this.field310.method351(this.field500 + var32, 46574);
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(I)V")
    public final void method23(int arg0) {
        if (this.field469 != 0) {
            class47 var2 = this.field297;
            int var3 = 0;
            if (this.field107 != 0) {
                var3 = 1;
            }
            for (int var4 = 0; var4 < 100; ++var4) {
                if (this.field294[var4] != null) {
                    int var5 = this.field292[var4];
                    String var6 = this.field293[var4];
                    byte var7 = 0;
                    if (var6 != null && var6.startsWith("@cr1@")) {
                        var6 = var6.substring(5);
                        var7 = 1;
                    }
                    if (var6 != null && var6.startsWith("@cr2@")) {
                        var6 = var6.substring(5);
                        var7 = 2;
                    }
                    if ((var5 == 3 || var5 == 7) && (var5 == 7 || this.field112 == 0 || this.field112 == 1 && this.method43(var6, false))) {
                        int var8 = 329 - var3 * 13;
                        byte var9 = 4;
                        var2.method462(0, "From", 0, var8, var9);
                        var2.method462(65535, "From", 0, var8 - 1, var9);
                        int var10 = var9 + var2.method460("From ", 5);
                        if (var7 == 1) {
                            this.field253[0].method246(var10, var8 - 12, 2);
                            var10 += 14;
                        }
                        if (var7 == 2) {
                            this.field253[1].method246(var10, var8 - 12, 2);
                            var10 += 14;
                        }
                        var2.method462(0, var6 + ": " + this.field294[var4], 0, var8, var10);
                        var2.method462(65535, var6 + ": " + this.field294[var4], 0, var8 - 1, var10);
                        ++var3;
                        if (var3 >= 5) {
                            return;
                        }
                    }
                    if (var5 == 5 && this.field112 < 2) {
                        int var11 = 329 - var3 * 13;
                        var2.method462(0, this.field294[var4], 0, var11, 4);
                        var2.method462(65535, this.field294[var4], 0, var11 - 1, 4);
                        ++var3;
                        if (var3 >= 5) {
                            return;
                        }
                    }
                    if (var5 == 6 && this.field112 < 2) {
                        int var12 = 329 - var3 * 13;
                        var2.method462(0, "To " + var6 + ": " + this.field294[var4], 0, var12, 4);
                        var2.method462(65535, "To " + var6 + ": " + this.field294[var4], 0, var12 - 1, 4);
                        ++var3;
                        if (var3 >= 5) {
                            return;
                        }
                    }
                }
            }
            if (arg0 != 0) {
                this.field489 = this.field254.method325();
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIII)I")
    public final int method24(int arg0, int arg1, int arg2, int arg3) {
        int var5 = arg0 >> 7;
        int var6 = arg2 >> 7;
        if (var5 >= 0 && var6 >= 0 && var5 <= 103 && var6 <= 103) {
            int var7 = arg3;
            if (arg3 < 3 && (this.field517[1][var5][var6] & 2) == 2) {
                var7 = arg3 + 1;
            }
            int var8 = arg0 & 127;
            int var9 = arg2 & 127;
            if (arg1 != -8947) {
                return this.field435;
            } else {
                int var10 = (128 - var8) * this.field434[var7][var5][var6] + this.field434[var7][var5 + 1][var6] * var8 >> 7;
                int var11 = (128 - var8) * this.field434[var7][var5][var6 + 1] + this.field434[var7][var5 + 1][var6 + 1] * var8 >> 7;
                return (128 - var9) * var10 + var9 * var11 >> 7;
            }
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILjava/lang/String;ILjava/lang/String;)V")
    public final void method25(int arg0, String arg1, int arg2, String arg3) {
        if (arg2 == 0 && this.field427 != -1) {
            this.field191 = arg3;
            super.field1664 = 0;
        }
        if (this.field301 == -1) {
            this.field401 = true;
        }
        for (int var5 = 99; var5 > 0; --var5) {
            this.field292[var5] = this.field292[var5 - 1];
            this.field293[var5] = this.field293[var5 - 1];
            this.field294[var5] = this.field294[var5 - 1];
        }
        this.field292[0] = arg2;
        this.field488 += arg0;
        this.field293[0] = arg1;
        this.field294[0] = arg3;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILHQETDHHW;)V")
    public final void method26(int arg0, class20 arg1) {
        int var3 = 51 / arg0;
        short var4 = 256;
        for (int var5 = 0; var5 < this.field281.length; ++var5) {
            this.field281[var5] = 0;
        }
        for (int var6 = 0; var6 < 5000; ++var6) {
            int var18 = (int) (Math.random() * 128.0D * (double) var4);
            this.field281[var18] = (int) (Math.random() * 256.0D);
        }
        for (int var7 = 0; var7 < 20; ++var7) {
            for (int var14 = 1; var14 < var4 - 1; ++var14) {
                for (int var16 = 1; var16 < 127; ++var16) {
                    int var17 = (var14 << 7) + var16;
                    this.field282[var17] = (this.field281[var17 - 1] + this.field281[var17 + 1] + this.field281[var17 - 128] + this.field281[var17 + 128]) / 4;
                }
            }
            int[] var15 = this.field281;
            this.field281 = this.field282;
            this.field282 = var15;
        }
        if (arg1 != null) {
            int var8 = 0;
            for (int var9 = 0; var9 < arg1.field749; ++var9) {
                for (int var10 = 0; var10 < arg1.field748; ++var10) {
                    if (arg1.field746[var8++] != 0) {
                        int var11 = var10 + 16 + arg1.field750;
                        int var12 = var9 + 16 + arg1.field751;
                        int var13 = (var12 << 7) + var11;
                        this.field281[var13] = 0;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(I)V")
    public final void method27(int arg0) {
        if (arg0 >= 0) {
            this.field398 = !this.field398;
        }
        this.method23(0);
        if (this.field444 == 1) {
            this.field256[this.field443 / 100].method498(this.field441 - 8 - 4, this.field442 - 8 - 4, 2);
        }
        if (this.field444 == 2) {
            this.field256[this.field443 / 100 + 4].method498(this.field441 - 8 - 4, this.field442 - 8 - 4, 2);
        }
        if (this.field403 != -1) {
            this.method61(this.field455, -20845, this.field403);
            this.method137((byte) 6, 0, 0, class52.field1258[this.field403], 0);
        }
        if (this.field347 != -1) {
            this.method61(this.field455, -20845, this.field347);
            this.method137((byte) 6, 0, 0, class52.field1258[this.field347], 0);
        }
        this.method145((byte) 3);
        if (!this.field74) {
            this.method66(113);
            this.method31((byte) -108);
        } else if (this.field260 == 0) {
            this.method60(-120);
        }
        if (this.field217 == 1) {
            this.field409[1].method498(472, 296, 2);
        }
        if (field85) {
            short var2 = 507;
            byte var3 = 20;
            int var4 = 16776960;
            if (super.field1646 < 15) {
                var4 = 16711680;
            }
            this.field297.method457(var4, 0, "Fps:" + super.field1646, var3, var2);
            int var12 = var3 + 15;
            Runtime var5 = Runtime.getRuntime();
            int var6 = (int) ((var5.totalMemory() - var5.freeMemory()) / 1024L);
            int var7 = 16776960;
            if (var6 > 33554432 && field376) {
                int var8 = 16711680;
            }
            this.field297.method457(16776960, 0, "Mem:" + var6 + "k", var12, var2);
            var12 += 15;
        }
        if (this.field107 != 0) {
            int var9 = this.field107 / 50;
            int var10 = var9 / 60;
            int var11 = var9 % 60;
            if (var11 < 10) {
                this.field297.method462(16776960, "System update in: " + var10 + ":0" + var11, 0, 329, 4);
            } else {
                this.field297.method462(16776960, "System update in: " + var10 + ":" + var11, 0, 329, 4);
            }
        }
    }

    @OriginalMember(owner = "client", name = "h", descriptor = "(I)V")
    public final void method28(int arg0) {
        if (this.field492 > 0) {
            this.method147(0);
        } else {
            this.field159.method172(-130);
            this.field297.method458(144, 0, 257, "Connection lost", 0);
            this.field297.method458(143, 16777215, 256, "Connection lost", 0);
            this.field297.method458(159, 0, 257, "Please wait - attempting to reestablish", 0);
            this.field297.method458(158, 16777215, 256, "Please wait - attempting to reestablish", 0);
            this.field159.method173(super.field1650, false, 4, 4);
            this.field235 = 0;
            this.field348 = 0;
            class62 var2 = this.field169;
            this.field106 = false;
            this.field246 = 0;
            this.method132(this.field363, this.field364, true);
            this.field488 += arg0;
            if (!this.field106) {
                this.method147(0);
            }
            try {
                var2.method514();
            } catch (Exception var3) {
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZILMQZHAILV;)V")
    private final void method29(boolean arg0, int arg1, class33 arg2) {
        if (!arg0) {
            this.field287 = 0;
            this.field461 = 0;
            this.method69(arg2, true, arg1);
            this.method85(this.field516, arg1, arg2);
            this.method142(arg1, arg2, -597);
            for (int var4 = 0; var4 < this.field287; ++var4) {
                int var6 = this.field288[var4];
                if (field369 != this.field133[var6].field1209) {
                    this.field133[var6].field966 = null;
                    this.field133[var6] = null;
                }
            }
            if (arg2.field945 != arg1) {
                signlink.reporterror(this.field363 + " size mismatch in getnpcpos - pos:" + arg2.field945 + " psize:" + arg1);
                throw new RuntimeException("eek");
            } else {
                for (int var5 = 0; var5 < this.field134; ++var5) {
                    if (this.field133[this.field135[var5]] == null) {
                        signlink.reporterror(this.field363 + " null entry in npc list - pos:" + var5 + " size:" + this.field134);
                        throw new RuntimeException("eek");
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IILjava/lang/String;ILjava/lang/String;I)LCXFTMSCH;")
    public final class8 method30(int arg0, int arg1, String arg2, int arg3, String arg4, int arg5) {
        byte[] var7 = null;
        if (arg0 != 0) {
            this.field275 = !this.field275;
        }
        int var8 = 5;
        try {
            if (this.field539[0] != null) {
                var7 = this.field539[0].method520(arg5, -261);
            }
        } catch (Exception var30) {
        }
        if (var7 != null) {
            this.field411.reset();
            this.field411.update(var7);
            int var9 = (int) this.field411.getValue();
            if (arg1 != var9) {
                var7 = null;
            }
        }
        if (var7 != null) {
            return new class8(var7, 4);
        } else {
            int var11 = 0;
            while (var7 == null) {
                String var12 = "Unknown error";
                this.method87("Requesting " + arg4, arg3, (byte) 9);
                Object var13 = null;
                try {
                    int var14 = 0;
                    DataInputStream var15 = this.method135(arg2 + arg1);
                    byte[] var16 = new byte[6];
                    var15.readFully(var16, 0, 6);
                    class33 var17 = new class33(true, var16);
                    var17.field945 = 3;
                    int var18 = var17.method329() + 6;
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
                            this.method87("Loading " + arg4 + " - " + var23 + "%", arg3, (byte) 9);
                        }
                        var14 = var23;
                    }
                    var15.close();
                    try {
                        if (this.field539[0] != null) {
                            this.field539[0].method521(arg5, 338, var7, var7.length);
                        }
                    } catch (Exception var29) {
                        this.field539[0] = null;
                    }
                    if (var7 != null) {
                        this.field411.reset();
                        this.field411.update(var7);
                        int var24 = (int) this.field411.getValue();
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
                            this.method87("Game updated - please reload page", arg3, (byte) 9);
                            var26 = 10;
                        } else {
                            this.method87(var12 + " - Retrying in " + var26, arg3, (byte) 9);
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
                    this.field225 = !this.field225;
                }
            }
            return new class8(var7, 4);
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(B)V")
    public final void method31(byte arg0) {
        if (this.field152 >= 2 || this.field147 != 0 || this.field474 != 0) {
            if (arg0 != -108) {
                for (int var2 = 1; var2 > 0; ++var2) {
                }
            }
            String var3;
            if (this.field147 == 1 && this.field152 < 2) {
                var3 = "Use " + this.field151 + " with...";
            } else if (this.field474 == 1 && this.field152 < 2) {
                var3 = this.field477 + "...";
            } else {
                var3 = this.field137[this.field152 - 1];
            }
            if (this.field152 > 2) {
                var3 = var3 + "@whi@ / " + (this.field152 - 2) + " more options";
            }
            this.field298.method467(var3, (byte) 2, true, 4, 16777215, 15, field369 / 1000);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIII)V")
    public final void method32(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field446.method246(arg3, arg5, 2);
        this.field447.method246(arg3, arg1 + arg5 - 16, 2);
        class23.method258(16, (byte) -33, arg3, this.field478, arg5 + 16, arg1 - 32);
        int var7 = (arg1 - 32) * arg1 / arg4;
        if (var7 < 8) {
            var7 = 8;
        }
        int var8 = (arg1 - 32 - var7) * arg0 / (arg4 - arg1);
        class23.method258(16, (byte) -33, arg3, this.field284, arg5 + 16 + var8, var7);
        class23.method263(var7, (byte) -83, this.field274, arg5 + 16 + var8, arg3);
        class23.method263(var7, (byte) -83, this.field274, arg5 + 16 + var8, arg3 + 1);
        class23.method261(this.field274, (byte) 6, arg3, 16, arg5 + 16 + var8);
        class23.method261(this.field274, (byte) 6, arg3, 16, arg5 + 17 + var8);
        class23.method263(var7, (byte) -83, this.field464, arg5 + 16 + var8, arg3 + 15);
        class23.method263(var7 - 1, (byte) -83, this.field464, arg5 + 17 + var8, arg3 + 14);
        class23.method261(this.field464, (byte) 6, arg3, 16, arg5 + 15 + var8 + var7);
        if (this.field248 != arg2) {
            this.field190 = !this.field190;
        }
        class23.method261(this.field464, (byte) 6, arg3 + 1, 15, arg5 + 14 + var8 + var7);
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(III)Ljava/lang/String;")
    public static final String method33(int arg0, int arg1, int arg2) {
        int var3 = 92 / arg2;
        int var4 = arg1 - arg0;
        if (var4 < -9) {
            return "@red@";
        } else if (var4 < -6) {
            return "@or3@";
        } else if (var4 < -3) {
            return "@or2@";
        } else if (var4 < 0) {
            return "@or1@";
        } else if (var4 > 9) {
            return "@gre@";
        } else if (var4 > 6) {
            return "@gr3@";
        } else if (var4 > 3) {
            return "@gr2@";
        } else {
            return var4 > 0 ? "@gr1@" : "@yel@";
        }
    }

    @OriginalMember(owner = "client", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        return signlink.mainapp != null ? signlink.mainapp.getAppletContext() : super.getAppletContext();
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(B)V")
    public static final void method34(byte arg0) {
        class46.field1087 = true;
        class44.field1049 = true;
        if (arg0 == -63) {
            field376 = true;
            class31.field917 = true;
            class72.field1720 = true;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Z)V")
    public final void method35(boolean arg0) {
        class69 var2 = (class69) this.field184.method376();
        if (!arg0) {
            this.field310.method315(24);
        }
        while (var2 != null) {
            if (this.field426 == var2.field1555 && !var2.field1554) {
                if (field369 >= var2.field1548) {
                    var2.method546(this.field455, false);
                    if (var2.field1554) {
                        var2.method492();
                    } else {
                        this.field243.method417(var2.field1557, var2.field1556, 60, var2.field1558, var2, 3, var2.field1555, false, 0, -1);
                    }
                }
            } else {
                var2.method492();
            }
            var2 = (class69) this.field184.method378(0);
        }
    }

    @OriginalMember(owner = "client", name = "i", descriptor = "(I)V")
    public final void method36(int arg0) {
        if (arg0 < 3 || arg0 > 3) {
            this.field310.method315(110);
        }
        if (this.field235 == 0) {
            if (super.field1664 == 1) {
                int var2 = super.field1665 - 25 - 550;
                int var3 = super.field1666 - 5 - 4;
                if (var2 >= 0 && var3 >= 0 && var2 < 146 && var3 < 151) {
                    var2 -= 73;
                    var3 -= 75;
                    int var4 = this.field384 + this.field277 & 2047;
                    int var5 = class44.field1058[var4];
                    int var6 = class44.field1059[var4];
                    int var7 = (this.field420 + 256) * var5 >> 8;
                    int var8 = (this.field420 + 256) * var6 >> 8;
                    int var9 = var2 * var8 + var3 * var7 >> 11;
                    int var10 = var3 * var8 - var2 * var7 >> 11;
                    int var11 = field144.field1206 + var9 >> 7;
                    int var12 = field144.field1207 - var10 >> 7;
                    boolean var13 = this.method22(0, var12, 1, 0, 0, var11, field144.field1228[0], 0, 0, true, (byte) -48, field144.field1229[0]);
                    if (var13) {
                        this.field310.method315(var2);
                        this.field310.method315(var3);
                        this.field310.method316(this.field384);
                        this.field310.method315(57);
                        this.field310.method315(this.field277);
                        this.field310.method315(this.field420);
                        this.field310.method315(89);
                        this.field310.method316(field144.field1206);
                        this.field310.method316(field144.field1207);
                        this.field310.method315(this.field542);
                        this.field310.method315(63);
                    }
                }
                ++field142;
                if (field142 > 82) {
                    field142 = 0;
                    this.field310.method314(43776, 84);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IBI)V")
    public final void method37(int arg0, byte arg1, int arg2) {
        int var4 = 0;
        if (arg1 == 2) {
            boolean var5 = false;
        } else {
            for (int var6 = 1; var6 > 0; ++var6) {
            }
        }
        for (int var7 = 0; var7 < 100; ++var7) {
            if (this.field294[var7] != null) {
                int var8 = this.field292[var7];
                int var9 = 70 - var4 * 14 + this.field265 + 4;
                if (var9 < -20) {
                    break;
                }
                String var10 = this.field293[var7];
                boolean var11 = false;
                if (var10 != null && var10.startsWith("@cr1@")) {
                    var10 = var10.substring(5);
                    boolean var12 = true;
                }
                if (var10 != null && var10.startsWith("@cr2@")) {
                    var10 = var10.substring(5);
                    boolean var13 = true;
                }
                if (var8 == 0) {
                    ++var4;
                }
                if ((var8 == 1 || var8 == 2) && (var8 == 1 || this.field511 == 0 || this.field511 == 1 && this.method43(var10, false))) {
                    if (arg2 > var9 - 14 && arg2 <= var9 && !var10.equals(field144.field849)) {
                        if (this.field181 >= 1) {
                            this.field137[this.field152] = "Report abuse @whi@" + var10;
                            this.field358[this.field152] = 140;
                            ++this.field152;
                        }
                        this.field137[this.field152] = "Add ignore @whi@" + var10;
                        this.field358[this.field152] = 633;
                        ++this.field152;
                        this.field137[this.field152] = "Add friend @whi@" + var10;
                        this.field358[this.field152] = 539;
                        ++this.field152;
                    }
                    ++var4;
                }
                if ((var8 == 3 || var8 == 7) && this.field469 == 0 && (var8 == 7 || this.field112 == 0 || this.field112 == 1 && this.method43(var10, false))) {
                    if (arg2 > var9 - 14 && arg2 <= var9) {
                        if (this.field181 >= 1) {
                            this.field137[this.field152] = "Report abuse @whi@" + var10;
                            this.field358[this.field152] = 140;
                            ++this.field152;
                        }
                        this.field137[this.field152] = "Add ignore @whi@" + var10;
                        this.field358[this.field152] = 633;
                        ++this.field152;
                        this.field137[this.field152] = "Add friend @whi@" + var10;
                        this.field358[this.field152] = 539;
                        ++this.field152;
                    }
                    ++var4;
                }
                if (var8 == 4 && (this.field341 == 0 || this.field341 == 1 && this.method43(var10, false))) {
                    if (arg2 > var9 - 14 && arg2 <= var9) {
                        this.field137[this.field152] = "Accept trade @whi@" + var10;
                        this.field358[this.field152] = 744;
                        ++this.field152;
                    }
                    ++var4;
                }
                if ((var8 == 5 || var8 == 6) && this.field469 == 0 && this.field112 < 2) {
                    ++var4;
                }
                if (var8 == 8 && (this.field341 == 0 || this.field341 == 1 && this.method43(var10, false))) {
                    if (arg2 > var9 - 14 && arg2 <= var9) {
                        this.field137[this.field152] = "Accept challenge @whi@" + var10;
                        this.field358[this.field152] = 862;
                        ++this.field152;
                    }
                    ++var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LTDQUELMV;I)V")
    public final void method38(class52 arg0, int arg1) {
        int var3 = arg0.field1262;
        if (arg1 < 6 || arg1 > 6) {
            this.field538 = null;
        }
        if ((var3 < 1 || var3 > 100) && (var3 < 701 || var3 > 800)) {
            if (var3 >= 101 && var3 <= 200 || var3 >= 801 && var3 <= 900) {
                int var5 = this.field325;
                if (this.field326 != 2) {
                    var5 = 0;
                }
                if (var3 > 800) {
                    var3 -= 701;
                } else {
                    var3 -= 101;
                }
                if (var3 >= var5) {
                    arg0.field1315 = "";
                    arg0.field1289 = 0;
                } else {
                    if (this.field432[var3] == 0) {
                        arg0.field1315 = "@red@Offline";
                    } else if (this.field432[var3] < 200) {
                        if (this.field432[var3] == field373) {
                            arg0.field1315 = "@gre@World-" + (this.field432[var3] - 9);
                        } else {
                            arg0.field1315 = "@yel@World-" + (this.field432[var3] - 9);
                        }
                    } else if (this.field432[var3] == field373) {
                        arg0.field1315 = "@gre@Classic" + (this.field432[var3] - 219);
                    } else {
                        arg0.field1315 = "@yel@Classic" + (this.field432[var3] - 219);
                    }
                    arg0.field1289 = 1;
                }
            } else if (var3 == 203) {
                int var6 = this.field325;
                if (this.field326 != 2) {
                    var6 = 0;
                }
                arg0.field1318 = var6 * 15 + 20;
                if (arg0.field1318 <= arg0.field1264) {
                    arg0.field1318 = arg0.field1264 + 1;
                }
            } else if (var3 >= 401 && var3 <= 500) {
                var3 -= 401;
                if (var3 == 0 && this.field326 == 0) {
                    arg0.field1315 = "Loading ignore list";
                    arg0.field1289 = 0;
                } else if (var3 == 1 && this.field326 == 0) {
                    arg0.field1315 = "Please wait...";
                    arg0.field1289 = 0;
                } else {
                    int var7 = this.field105;
                    if (this.field326 == 0) {
                        var7 = 0;
                    }
                    if (var3 >= var7) {
                        arg0.field1315 = "";
                        arg0.field1289 = 0;
                    } else {
                        arg0.field1315 = class39.method371(class39.method368((byte) 3, this.field170[var3]), (byte) -7);
                        arg0.field1289 = 1;
                    }
                }
            } else if (var3 == 503) {
                arg0.field1318 = this.field105 * 15 + 20;
                if (arg0.field1318 <= arg0.field1264) {
                    arg0.field1318 = arg0.field1264 + 1;
                }
            } else if (var3 == 327) {
                arg0.field1267 = 150;
                arg0.field1268 = (int) (Math.sin((double) field369 / 40.0D) * 256.0D) & 2047;
                if (this.field247) {
                    for (int var8 = 0; var8 < 7; ++var8) {
                        int var15 = this.field295[var8];
                        if (var15 >= 0 && !class30.field881[var15].method276((byte) 5)) {
                            return;
                        }
                    }
                    this.field247 = false;
                    class70[] var9 = new class70[7];
                    int var10 = 0;
                    for (int var11 = 0; var11 < 7; ++var11) {
                        int var14 = this.field295[var11];
                        if (var14 >= 0) {
                            var9[var10++] = class30.field881[var14].method277(710);
                        }
                    }
                    class70 var12 = new class70(var9, 0, var10);
                    for (int var13 = 0; var13 < 5; ++var13) {
                        if (this.field544[var13] != 0) {
                            var12.method565(field189[var13][0], field189[var13][this.field544[var13]]);
                            if (var13 == 1) {
                                var12.method565(field125[0], field125[this.field544[var13]]);
                            }
                        }
                    }
                    var12.method558(895);
                    var12.method559(class22.field761[field144.field1239].field763[0], -682);
                    var12.method568(64, 850, -30, -50, -30, true);
                    arg0.field1308 = 5;
                    arg0.field1309 = 0;
                    class52.method486(var12, 0, 31040, 5);
                }
            } else if (var3 == 324) {
                if (this.field251 == null) {
                    this.field251 = arg0.field1263;
                    this.field252 = arg0.field1299;
                }
                if (this.field452) {
                    arg0.field1263 = this.field252;
                } else {
                    arg0.field1263 = this.field251;
                }
            } else if (var3 == 325) {
                if (this.field251 == null) {
                    this.field251 = arg0.field1263;
                    this.field252 = arg0.field1299;
                }
                if (this.field452) {
                    arg0.field1263 = this.field251;
                } else {
                    arg0.field1263 = this.field252;
                }
            } else if (var3 == 600) {
                arg0.field1315 = this.field187;
                if (field369 % 20 < 10) {
                    arg0.field1315 = arg0.field1315 + "|";
                } else {
                    arg0.field1315 = arg0.field1315 + " ";
                }
            } else {
                if (var3 == 613) {
                    if (this.field181 >= 1) {
                        if (this.field354) {
                            arg0.field1293 = 16711680;
                            arg0.field1315 = "Moderator option: Mute player for 48 hours: <ON>";
                        } else {
                            arg0.field1293 = 16777215;
                            arg0.field1315 = "Moderator option: Mute player for 48 hours: <OFF>";
                        }
                    } else {
                        arg0.field1315 = "";
                    }
                }
                if (var3 == 650 || var3 == 655) {
                    if (this.field351 != 0) {
                        String var16;
                        if (this.field100 == 0) {
                            var16 = "earlier today";
                        } else if (this.field100 == 1) {
                            var16 = "yesterday";
                        } else {
                            var16 = this.field100 + " days ago";
                        }
                        arg0.field1315 = "You last logged in " + var16 + " from: " + signlink.dns;
                    } else {
                        arg0.field1315 = "";
                    }
                }
                if (var3 == 651) {
                    if (this.field220 == 0) {
                        arg0.field1315 = "0 unread messages";
                        arg0.field1293 = 16776960;
                    }
                    if (this.field220 == 1) {
                        arg0.field1315 = "1 unread message";
                        arg0.field1293 = 65280;
                    }
                    if (this.field220 > 1) {
                        arg0.field1315 = this.field220 + " unread messages";
                        arg0.field1293 = 65280;
                    }
                }
                if (var3 == 652) {
                    if (this.field130 == 201) {
                        if (this.field540 == 1) {
                            arg0.field1315 = "@yel@This is a non-members world: @whi@Since you are a member we";
                        } else {
                            arg0.field1315 = "";
                        }
                    } else if (this.field130 == 200) {
                        arg0.field1315 = "You have not yet set any password recovery questions.";
                    } else {
                        String var17;
                        if (this.field130 == 0) {
                            var17 = "Earlier today";
                        } else if (this.field130 == 1) {
                            var17 = "Yesterday";
                        } else {
                            var17 = this.field130 + " days ago";
                        }
                        arg0.field1315 = var17 + " you changed your recovery questions";
                    }
                }
                if (var3 == 653) {
                    if (this.field130 == 201) {
                        if (this.field540 == 1) {
                            arg0.field1315 = "@whi@recommend you use a members world instead. You may use";
                        } else {
                            arg0.field1315 = "";
                        }
                    } else if (this.field130 == 200) {
                        arg0.field1315 = "We strongly recommend you do so now to secure your account.";
                    } else {
                        arg0.field1315 = "If you do not remember making this change then cancel it immediately";
                    }
                }
                if (var3 == 654) {
                    if (this.field130 == 201) {
                        if (this.field540 == 1) {
                            arg0.field1315 = "@whi@this world but member benefits are unavailable whilst here.";
                        } else {
                            arg0.field1315 = "";
                        }
                    } else if (this.field130 == 200) {
                        arg0.field1315 = "Do this from the 'account management' area on our front webpage";
                    } else {
                        arg0.field1315 = "Do this from the 'account management' area on our front webpage";
                    }
                }
            }
        } else if (var3 == 1 && this.field326 == 0) {
            arg0.field1315 = "Loading friend list";
            arg0.field1289 = 0;
        } else if (var3 == 1 && this.field326 == 1) {
            arg0.field1315 = "Connecting to friendserver";
            arg0.field1289 = 0;
        } else if (var3 == 2 && this.field326 != 2) {
            arg0.field1315 = "Please wait...";
            arg0.field1289 = 0;
        } else {
            int var4 = this.field325;
            if (this.field326 != 2) {
                var4 = 0;
            }
            if (var3 > 700) {
                var3 -= 601;
            } else {
                --var3;
            }
            if (var3 >= var4) {
                arg0.field1315 = "";
                arg0.field1289 = 0;
            } else {
                arg0.field1315 = this.field425[var3];
                arg0.field1289 = 1;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BI)V")
    public final void method39(byte arg0, int arg1) {
        int var3 = class4.field551[arg1].field559;
        if (var3 != 0) {
            int var4 = this.field232[arg1];
            if (arg0 != 109) {
                this.field489 = this.field254.method325();
            }
            if (var3 == 1) {
                if (var4 == 1) {
                    class44.method394(0.9D, 0);
                }
                if (var4 == 2) {
                    class44.method394(0.8D, 0);
                }
                if (var4 == 3) {
                    class44.method394(0.7D, 0);
                }
                if (var4 == 4) {
                    class44.method394(0.6D, 0);
                }
                class3.field46.method223();
                this.field273 = true;
            }
            if (var3 == 3) {
                boolean var5 = this.field161;
                if (var4 == 0) {
                    this.method73(this.field161, 0, 0);
                    this.field161 = true;
                }
                if (var4 == 1) {
                    this.method73(this.field161, -400, 0);
                    this.field161 = true;
                }
                if (var4 == 2) {
                    this.method73(this.field161, -800, 0);
                    this.field161 = true;
                }
                if (var4 == 3) {
                    this.method73(this.field161, -1200, 0);
                    this.field161 = true;
                }
                if (var4 == 4) {
                    this.field161 = false;
                }
                if (this.field161 != var5 && !field376) {
                    if (this.field161) {
                        this.field117 = this.field419;
                        this.field118 = true;
                        this.field329.method533(2, this.field117);
                    } else {
                        this.method160(0);
                    }
                    this.field543 = 0;
                }
            }
            if (var3 == 4) {
                if (var4 == 0) {
                    this.field367 = true;
                    this.method151(0, (byte) -94);
                }
                if (var4 == 1) {
                    this.field367 = true;
                    this.method151(-400, (byte) -94);
                }
                if (var4 == 2) {
                    this.field367 = true;
                    this.method151(-800, (byte) -94);
                }
                if (var4 == 3) {
                    this.field367 = true;
                    this.method151(-1200, (byte) -94);
                }
                if (var4 == 4) {
                    this.field367 = false;
                }
            }
            if (var3 == 5) {
                this.field508 = var4;
            }
            if (var3 == 6) {
                this.field101 = var4;
            }
            if (var3 == 8) {
                this.field469 = var4;
                this.field401 = true;
            }
            if (var3 == 9) {
                this.field183 = var4;
            }
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(ZI)Ljava/lang/String;")
    private static final String method40(boolean arg0, int arg1) {
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

    @OriginalMember(owner = "client", name = "j", descriptor = "(I)V")
    public void method41(int arg0) {
        System.out.println("============");
        System.out.println("flame-cycle:" + this.field196);
        if (this.field329 != null) {
            System.out.println("Od-cycle:" + this.field329.field1513);
        }
        System.out.println("loop-cycle:" + field369);
        System.out.println("draw-cycle:" + field465);
        System.out.println("ptype:" + this.field489);
        System.out.println("psize:" + this.field488);
        if (arg0 != 2) {
            this.field445 = this.field365.method402();
        }
        if (this.field169 != null) {
            this.field169.method519(2);
        }
        super.field1647 = true;
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(I)Ljava/awt/Component;")
    public final Component method42(int arg0) {
        if (arg0 != 1) {
            this.field524 = !this.field524;
        }
        if (signlink.mainapp != null) {
            return signlink.mainapp;
        } else {
            return super.field1653 != null ? super.field1653 : this;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;Z)Z")
    public final boolean method43(String arg0, boolean arg1) {
        if (arg1) {
            this.field222 = !this.field222;
        }
        if (arg0 == null) {
            return false;
        } else {
            for (int var3 = 0; var3 < this.field325; ++var3) {
                if (arg0.equalsIgnoreCase(this.field425[var3])) {
                    return true;
                }
            }
            return arg0.equalsIgnoreCase(field144.field849);
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(BI)V")
    public final void method44(byte arg0, int arg1) {
        if (arg0 != 1) {
            this.field489 = this.field254.method325();
        }
        class52 var3 = class52.field1258[arg1];
        for (int var4 = 0; var4 < var3.field1311.length && var3.field1311[var4] != -1; ++var4) {
            class52 var5 = class52.field1258[var3.field1311[var4]];
            if (var5.field1298 == 1) {
                this.method44((byte) 1, var5.field1281);
            }
            var5.field1317 = 0;
            var5.field1257 = 0;
        }
    }

    @OriginalMember(owner = "client", name = "k", descriptor = "(I)V")
    public final void method45(int arg0) {
        while (arg0 >= 0) {
            this.field275 = !this.field275;
        }
        short var2 = 256;
        if (this.field407 > 0) {
            for (int var3 = 0; var3 < 256; ++var3) {
                if (this.field407 > 768) {
                    this.field493[var3] = this.method126(this.field495[var3], 1024 - this.field407, 518, this.field494[var3]);
                } else if (this.field407 > 256) {
                    this.field493[var3] = this.field495[var3];
                } else {
                    this.field493[var3] = this.method126(this.field494[var3], 256 - this.field407, 518, this.field495[var3]);
                }
            }
        } else if (this.field408 > 0) {
            for (int var4 = 0; var4 < 256; ++var4) {
                if (this.field408 > 768) {
                    this.field493[var4] = this.method126(this.field496[var4], 1024 - this.field408, 518, this.field494[var4]);
                } else if (this.field408 > 256) {
                    this.field493[var4] = this.field496[var4];
                } else {
                    this.field493[var4] = this.method126(this.field494[var4], 256 - this.field408, 518, this.field496[var4]);
                }
            }
        } else {
            for (int var5 = 0; var5 < 256; ++var5) {
                this.field493[var5] = this.field494[var5];
            }
        }
        for (int var6 = 0; var6 < 33920; ++var6) {
            this.field174.field607[var6] = this.field193.field1344[var6];
        }
        int var7 = 0;
        int var8 = 1152;
        for (int var9 = 1; var9 < var2 - 1; ++var9) {
            int var23 = (var2 - var9) * this.field145[var9] / var2;
            int var24 = var23 + 22;
            if (var24 < 0) {
                var24 = 0;
            }
            var7 += var24;
            for (int var25 = var24; var25 < 128; ++var25) {
                int var26 = this.field215[var7++];
                if (var26 != 0) {
                    int var28 = 256 - var26;
                    int var29 = this.field493[var26];
                    int var30 = this.field174.field607[var8];
                    this.field174.field607[var8++] = ((var29 & 16711935) * var26 + (var30 & 16711935) * var28 & -16711936) + ((var29 & 65280) * var26 + (var30 & 65280) * var28 & 16711680) >> 8;
                } else {
                    ++var8;
                }
            }
            var8 += var24;
        }
        this.field174.method173(super.field1650, false, 0, 0);
        for (int var10 = 0; var10 < 33920; ++var10) {
            this.field175.field607[var10] = this.field194.field1344[var10];
        }
        int var11 = 0;
        int var12 = 1176;
        for (int var13 = 1; var13 < var2 - 1; ++var13) {
            int var14 = (var2 - var13) * this.field145[var13] / var2;
            int var15 = 103 - var14;
            int var16 = var12 + var14;
            for (int var17 = 0; var17 < var15; ++var17) {
                int var18 = this.field215[var11++];
                if (var18 != 0) {
                    int var20 = 256 - var18;
                    int var21 = this.field493[var18];
                    int var22 = this.field175.field607[var16];
                    this.field175.field607[var16++] = ((var21 & 16711935) * var18 + (var22 & 16711935) * var20 & -16711936) + ((var21 & 65280) * var18 + (var22 & 65280) * var20 & 16711680) >> 8;
                } else {
                    ++var16;
                }
            }
            var11 += 128 - var15;
            var12 = 128 - var15 - var14 + var16;
        }
        this.field175.method173(super.field1650, false, 637, 0);
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(I)V")
    public final void method46(int arg0) {
        if (arg0 < this.field379 || arg0 > this.field379) {
            this.field310.method315(126);
        }
        this.field273 = true;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BIII)Z")
    public final boolean method47(byte arg0, int arg1, int arg2, int arg3) {
        int var5 = arg3 >> 14 & 32767;
        int var6 = this.field243.method436(this.field426, arg2, arg1, arg3);
        if (var6 == -1) {
            return false;
        } else {
            int var7 = var6 & 31;
            int var8 = var6 >> 6 & 3;
            if (var7 != 10 && var7 != 11 && var7 != 22) {
                this.method22(0, arg1, 2, 0, var7 + 1, arg2, field144.field1228[0], var8, 0, false, (byte) -48, field144.field1229[0]);
            } else {
                class72 var9 = class72.method588(var5);
                int var10;
                int var11;
                if (var8 != 0 && var8 != 2) {
                    var10 = var9.field1723;
                    var11 = var9.field1707;
                } else {
                    var10 = var9.field1707;
                    var11 = var9.field1723;
                }
                int var12 = var9.field1692;
                if (var8 != 0) {
                    var12 = (var12 >> 4 - var8) + (var12 << var8 & 15);
                }
                this.method22(var12, arg1, 2, var11, 0, arg2, field144.field1228[0], 0, var10, false, (byte) -48, field144.field1229[0]);
            }
            this.field441 = super.field1665;
            this.field442 = super.field1666;
            this.field444 = 2;
            if (this.field521 != arg0) {
                this.field435 = this.field365.method402();
            }
            this.field443 = 0;
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(Z)Z")
    public final boolean method48(boolean arg0) {
        if (arg0) {
            field233 = this.field365.method402();
        }
        if (this.field169 == null) {
            return false;
        } else {
            try {
                int var2 = this.field169.method516();
                if (var2 == 0) {
                    return false;
                }
                if (this.field489 == -1) {
                    this.field169.method517(this.field254.field944, 0, 1);
                    this.field489 = this.field254.field944[0] & 255;
                    if (this.field365 != null) {
                        this.field489 = this.field489 - this.field365.method402() & 255;
                    }
                    this.field488 = class34.field959[this.field489];
                    --var2;
                }
                if (this.field488 == -1) {
                    if (var2 <= 0) {
                        return false;
                    }
                    this.field169.method517(this.field254.field944, 0, 1);
                    this.field488 = this.field254.field944[0] & 255;
                    --var2;
                }
                if (this.field488 == -2) {
                    if (var2 <= 1) {
                        return false;
                    }
                    this.field169.method517(this.field254.field944, 0, 2);
                    this.field254.field945 = 0;
                    this.field488 = this.field254.method327();
                    var2 -= 2;
                }
                if (var2 < this.field488) {
                    return false;
                }
                this.field254.field945 = 0;
                this.field169.method517(this.field254.field944, 0, this.field488);
                this.field490 = 0;
                this.field128 = this.field127;
                this.field127 = this.field126;
                this.field126 = this.field489;
                if (this.field489 == 88) {
                    int var3 = this.field254.method354((byte) -59);
                    int var4 = this.field254.method352((byte) 117);
                    int var5 = this.field254.method327();
                    int var6 = this.field254.method354((byte) -59);
                    class52.field1258[var4].field1267 = var3;
                    class52.field1258[var4].field1268 = var6;
                    class52.field1258[var4].field1266 = var5;
                    this.field489 = -1;
                    return true;
                }
                if (this.field489 == 105) {
                    this.method147(0);
                    this.field489 = -1;
                    return false;
                }
                if (this.field489 == 95) {
                    int var7 = this.field254.method352((byte) 117);
                    int var8 = this.field254.method352((byte) 117);
                    class52.field1258[var7].field1308 = 2;
                    class52.field1258[var7].field1309 = var8;
                    this.field489 = -1;
                    return true;
                }
                if (this.field489 == 182) {
                    String var9 = this.field254.method332();
                    int var10 = this.field254.method353(0);
                    class52.field1258[var10].field1315 = var9;
                    if (this.field255[this.field234] == class52.field1258[var10].field1271) {
                        this.field438 = true;
                    }
                    this.field489 = -1;
                    return true;
                }
                if (this.field489 == 41) {
                    this.method29(false, this.field488, this.field254);
                    this.field489 = -1;
                    return true;
                }
                if (this.field489 == 24) {
                    int var11 = this.field254.method327();
                    boolean var12 = this.field254.method325() == 1;
                    class52.field1258[var11].field1291 = var12;
                    this.field489 = -1;
                    return true;
                }
                if (this.field489 == 118) {
                    int var13 = this.field254.method327();
                    this.method44((byte) 1, var13);
                    if (this.field541 != -1) {
                        this.field541 = -1;
                        this.field438 = true;
                        this.field121 = true;
                    }
                    this.field301 = var13;
                    this.field401 = true;
                    this.field347 = -1;
                    this.field352 = false;
                    this.field489 = -1;
                    return true;
                }
                if (this.field489 == 75) {
                    this.field511 = this.field254.method325();
                    this.field112 = this.field254.method325();
                    this.field341 = this.field254.method325();
                    this.field124 = true;
                    this.field401 = true;
                    this.field489 = -1;
                    return true;
                }
                if (this.field489 == 127) {
                    int var14 = this.field254.method327();
                    int var15 = this.field254.method352((byte) 117);
                    int var16 = var15 >> 10 & 31;
                    int var17 = var15 >> 5 & 31;
                    int var18 = var15 & 31;
                    class52.field1258[var14].field1293 = (var18 << 3) + (var16 << 19) + (var17 << 11);
                    this.field489 = -1;
                    return true;
                }
                if (this.field489 == 197) {
                    long var19 = this.field254.method331(true);
                    int var21 = this.field254.method330();
                    int var22 = this.field254.method325();
                    boolean var23 = false;
                    for (int var24 = 0; var24 < 100; ++var24) {
                        if (this.field481[var24] == var21) {
                            var23 = true;
                            break;
                        }
                    }
                    if (var22 <= 1) {
                        for (int var25 = 0; var25 < this.field105; ++var25) {
                            if (this.field170[var25] == var19) {
                                var23 = true;
                                break;
                            }
                        }
                    }
                    if (!var23 && this.field514 == 0) {
                        try {
                            this.field481[this.field399] = var21;
                            this.field399 = (this.field399 + 1) % 100;
                            String var26 = class16.method230(-838, this.field488 - 13, this.field254);
                            if (var22 != 3) {
                                var26 = class11.method193(var26, -643);
                            }
                            if (var22 != 2 && var22 != 3) {
                                if (var22 == 1) {
                                    this.method25(0, "@cr1@" + class39.method371(class39.method368((byte) 3, var19), (byte) -7), 7, var26);
                                } else {
                                    this.method25(0, class39.method371(class39.method368((byte) 3, var19), (byte) -7), 3, var26);
                                }
                            } else {
                                this.method25(0, "@cr2@" + class39.method371(class39.method368((byte) 3, var19), (byte) -7), 7, var26);
                            }
                        } catch (Exception var190) {
                            signlink.reporterror("cde1");
                        }
                    }
                    this.field489 = -1;
                    return true;
                }
                if (this.field489 == 59) {
                    this.field123 = this.field254.method325();
                    this.field122 = this.field254.method345(219);
                    for (int var28 = this.field122; var28 < this.field122 + 8; ++var28) {
                        for (int var29 = this.field123; var29 < this.field123 + 8; ++var29) {
                            if (this.field538[this.field426][var28][var29] != null) {
                                this.field538[this.field426][var28][var29] = null;
                                this.method94(var28, var29);
                            }
                        }
                    }
                    for (class56 var30 = (class56) this.field129.method376(); var30 != null; var30 = (class56) this.field129.method378(0)) {
                        if (var30.field1360 >= this.field122 && var30.field1360 < this.field122 + 8 && var30.field1361 >= this.field123 && var30.field1361 < this.field123 + 8 && this.field426 == var30.field1358) {
                            var30.field1362 = 0;
                        }
                    }
                    this.field489 = -1;
                    return true;
                }
                if (this.field489 == 213) {
                    this.field440 = this.field254.method325();
                    this.field523 = this.field254.method353(0);
                    this.field489 = -1;
                    return true;
                }
                if (this.field489 == 47) {
                    int var31 = this.field254.method327();
                    int var32 = this.field254.method353(0);
                    int var33 = this.field254.method354((byte) -59);
                    if (var33 == 65535) {
                        class52.field1258[var31].field1308 = 0;
                        this.field489 = -1;
                        return true;
                    }
                    class3 var34 = class3.method13(var33);
                    class52.field1258[var31].field1308 = 4;
                    class52.field1258[var31].field1309 = var33;
                    class52.field1258[var31].field1267 = var34.field38;
                    class52.field1258[var31].field1268 = var34.field67;
                    class52.field1258[var31].field1266 = var34.field35 * 100 / var32;
                    this.field489 = -1;
                    return true;
                }
                if (this.field489 == 23) {
                    int var35 = this.field254.method354((byte) -59);
                    int var36 = this.field254.method352((byte) 117);
                    int var37 = this.field254.method353(0);
                    class52.field1258[var35].field1265 = (var37 << 16) + var36;
                    this.field489 = -1;
                    return true;
                }
                if (this.field489 == 221) {
                    this.field107 = this.field254.method354((byte) -59) * 30;
                    this.field489 = -1;
                    return true;
                }
                if (this.field489 == 161) {
                    int var38 = this.field254.method353(0);
                    int var39 = this.field254.method352((byte) 117);
                    class52.field1258[var39].field1308 = 1;
                    class52.field1258[var39].field1309 = var38;
                    this.field489 = -1;
                    return true;
                }
                if (this.field489 == 156) {
                    int var40 = this.field254.method327();
                    class52 var41 = class52.field1258[var40];
                    for (int var42 = 0; var42 < var41.field1304.length; ++var42) {
                        var41.field1304[var42] = -1;
                        var41.field1304[var42] = 0;
                    }
                    this.field489 = -1;
                    return true;
                }
                if (this.field489 == 240) {
                    this.field123 = this.field254.method344(-854);
                    this.field122 = this.field254.method346(false);
                    this.field489 = -1;
                    return true;
                }
                if (this.field489 == 235) {
                    int var43 = this.field254.method346(false);
                    int var44 = this.field254.method353(0);
                    if (var44 == 65535) {
                        var44 = -1;
                    }
                    this.field255[var43] = var44;
                    this.field438 = true;
                    this.field121 = true;
                    this.field489 = -1;
                    return true;
                }
                if (this.field489 == 34) {
                    int var45 = this.field254.method353(0);
                    this.method44((byte) 1, var45);
                    if (this.field541 != -1) {
                        this.field541 = -1;
                        this.field438 = true;
                        this.field121 = true;
                    }
                    if (this.field301 != -1) {
                        this.field301 = -1;
                        this.field401 = true;
                    }
                    if (this.field153 != 0) {
                        this.field153 = 0;
                        this.field401 = true;
                    }
                    this.field347 = var45;
                    this.field352 = false;
                    this.field489 = -1;
                    return true;
                }
                if (this.field489 == 13) {
                    this.field257 = false;
                    this.field153 = 2;
                    this.field431 = "";
                    this.field401 = true;
                    this.field489 = -1;
                    return true;
                }
                if (this.field489 == 96) {
                    String var46 = this.field254.method332();
                    if (var46.endsWith(":tradereq:")) {
                        String var47 = var46.substring(0, var46.indexOf(":"));
                        long var48 = class39.method367(var47);
                        boolean var50 = false;
                        for (int var51 = 0; var51 < this.field105; ++var51) {
                            if (this.field170[var51] == var48) {
                                var50 = true;
                                break;
                            }
                        }
                        if (!var50 && this.field514 == 0) {
                            this.method25(0, var47, 4, "wishes to trade with you.");
                        }
                    } else if (var46.endsWith(":duelreq:")) {
                        String var52 = var46.substring(0, var46.indexOf(":"));
                        long var53 = class39.method367(var52);
                        boolean var55 = false;
                        for (int var56 = 0; var56 < this.field105; ++var56) {
                            if (this.field170[var56] == var53) {
                                var55 = true;
                                break;
                            }
                        }
                        if (!var55 && this.field514 == 0) {
                            this.method25(0, var52, 8, "wishes to duel with you.");
                        }
                    } else if (!var46.endsWith(":chalreq:")) {
                        this.method25(0, "", 0, var46);
                    } else {
                        String var57 = var46.substring(0, var46.indexOf(":"));
                        long var58 = class39.method367(var57);
                        boolean var60 = false;
                        for (int var61 = 0; var61 < this.field105; ++var61) {
                            if (this.field170[var61] == var58) {
                                var60 = true;
                                break;
                            }
                        }
                        if (!var60 && this.field514 == 0) {
                            String var62 = var46.substring(var46.indexOf(":") + 1, var46.length() - 9);
                            this.method25(0, var57, 8, var62);
                        }
                    }
                    this.field489 = -1;
                    return true;
                }
                if (this.field489 == 1) {
                    for (int var63 = 0; var63 < this.field458.length; ++var63) {
                        if (this.field458[var63] != null) {
                            this.field458[var63].field1234 = -1;
                        }
                    }
                    for (int var64 = 0; var64 < this.field133.length; ++var64) {
                        if (this.field133[var64] != null) {
                            this.field133[var64].field1234 = -1;
                        }
                    }
                    this.field489 = -1;
                    return true;
                }
                if (this.field489 == 64) {
                    this.field105 = this.field488 / 8;
                    for (int var65 = 0; var65 < this.field105; ++var65) {
                        this.field170[var65] = this.field254.method331(true);
                    }
                    this.field489 = -1;
                    return true;
                }
                if (this.field489 == 116) {
                    int var66 = this.field254.method355(7);
                    int var67 = this.field254.method357(this.field453);
                    int var68 = this.field254.method354((byte) -59);
                    class52 var69 = class52.field1258[var68];
                    var69.field1290 = var67;
                    var69.field1310 = var66;
                    this.field489 = -1;
                    return true;
                }
                if (this.field489 == 27) {
                    this.field430 = true;
                    this.field303 = this.field254.method325();
                    this.field304 = this.field254.method325();
                    this.field305 = this.field254.method327();
                    this.field306 = this.field254.method325();
                    this.field307 = this.field254.method325();
                    if (this.field307 >= 100) {
                        int var70 = this.field303 * 128 + 64;
                        int var71 = this.field304 * 128 + 64;
                        int var72 = this.method24(var70, -8947, var71, this.field426) - this.field305;
                        int var73 = var70 - this.field266;
                        int var74 = var72 - this.field267;
                        int var75 = var71 - this.field268;
                        int var76 = (int) Math.sqrt((double) (var73 * var73 + var75 * var75));
                        this.field269 = (int) (Math.atan2((double) var74, (double) var76) * 325.949D) & 2047;
                        this.field270 = (int) (Math.atan2((double) var73, (double) var75) * -325.949D) & 2047;
                        if (this.field269 < 128) {
                            this.field269 = 128;
                        }
                        if (this.field269 > 383) {
                            this.field269 = 383;
                        }
                    }
                    this.field489 = -1;
                    return true;
                }
                if (this.field489 == 77) {
                    this.field348 = 0;
                    this.field489 = -1;
                    return true;
                }
                if (this.field489 == 162) {
                    if (this.field541 != -1) {
                        this.field541 = -1;
                        this.field438 = true;
                        this.field121 = true;
                    }
                    if (this.field301 != -1) {
                        this.field301 = -1;
                        this.field401 = true;
                    }
                    if (this.field153 != 0) {
                        this.field153 = 0;
                        this.field401 = true;
                    }
                    this.field347 = -1;
                    this.field352 = false;
                    this.field489 = -1;
                    return true;
                }
                if (this.field489 == 15 || this.field489 == 46) {
                    int var77 = this.field308;
                    int var78 = this.field309;
                    if (this.field489 == 15) {
                        var78 = this.field254.method327();
                        var77 = this.field254.method352((byte) 117);
                        this.field423 = false;
                    }
                    if (this.field489 == 46) {
                        var78 = this.field254.method353(0);
                        this.field254.method335(141);
                        int var79 = 0;
                        while (true) {
                            if (var79 >= 4) {
                                this.field254.method337((byte) -97);
                                var77 = this.field254.method327();
                                this.field423 = true;
                                break;
                            }
                            for (int var80 = 0; var80 < 13; ++var80) {
                                for (int var81 = 0; var81 < 13; ++var81) {
                                    int var82 = this.field254.method336(-29762, 1);
                                    if (var82 == 1) {
                                        this.field237[var79][var80][var81] = this.field254.method336(-29762, 26);
                                    } else {
                                        this.field237[var79][var80][var81] = -1;
                                    }
                                }
                            }
                            ++var79;
                        }
                    }
                    if (this.field308 == var77 && this.field309 == var78 && this.field497 == 2) {
                        this.field489 = -1;
                        return true;
                    }
                    this.field308 = var77;
                    this.field309 = var78;
                    this.field499 = (this.field308 - 6) * 8;
                    this.field500 = (this.field309 - 6) * 8;
                    this.field377 = false;
                    if ((this.field308 / 8 == 48 || this.field308 / 8 == 49) && this.field309 / 8 == 48) {
                        this.field377 = true;
                    }
                    if (this.field308 / 8 == 48 && this.field309 / 8 == 148) {
                        this.field377 = true;
                    }
                    this.field497 = 1;
                    this.field515 = System.currentTimeMillis();
                    this.field159.method172(-130);
                    this.field297.method458(151, 0, 257, "Loading - please wait.", 0);
                    this.field297.method458(150, 16777215, 256, "Loading - please wait.", 0);
                    this.field159.method173(super.field1650, false, 4, 4);
                    if (this.field489 == 15) {
                        int var83 = 0;
                        int var84 = (this.field308 - 6) / 8;
                        label1098: while (true) {
                            if (var84 > (this.field308 + 6) / 8) {
                                this.field289 = new byte[var83][];
                                this.field155 = new byte[var83][];
                                this.field448 = new int[var83];
                                this.field449 = new int[var83];
                                this.field450 = new int[var83];
                                int var86 = 0;
                                int var87 = (this.field308 - 6) / 8;
                                while (true) {
                                    if (var87 > (this.field308 + 6) / 8) {
                                        break label1098;
                                    }
                                    for (int var88 = (this.field309 - 6) / 8; var88 <= (this.field309 + 6) / 8; ++var88) {
                                        this.field448[var86] = (var87 << 8) + var88;
                                        if (!this.field377 || var88 != 49 && var88 != 149 && var88 != 147 && var87 != 50 && (var87 != 49 || var88 != 47)) {
                                            int var89 = this.field449[var86] = this.field329.method531(var87, 0, var88, (byte) -34);
                                            if (var89 != -1) {
                                                this.field329.method533(3, var89);
                                            }
                                            int var90 = this.field450[var86] = this.field329.method531(var87, 1, var88, (byte) -34);
                                            if (var90 != -1) {
                                                this.field329.method533(3, var90);
                                            }
                                            ++var86;
                                        } else {
                                            this.field449[var86] = -1;
                                            this.field450[var86] = -1;
                                            ++var86;
                                        }
                                    }
                                    ++var87;
                                }
                            }
                            for (int var85 = (this.field309 - 6) / 8; var85 <= (this.field309 + 6) / 8; ++var85) {
                                ++var83;
                            }
                            ++var84;
                        }
                    }
                    if (this.field489 == 46) {
                        int var91 = 0;
                        int[] var92 = new int[676];
                        int var93 = 0;
                        label1057: while (true) {
                            if (var93 >= 4) {
                                this.field289 = new byte[var91][];
                                this.field155 = new byte[var91][];
                                this.field448 = new int[var91];
                                this.field449 = new int[var91];
                                this.field450 = new int[var91];
                                int var101 = 0;
                                while (true) {
                                    if (var101 >= var91) {
                                        break label1057;
                                    }
                                    int var102 = this.field448[var101] = var92[var101];
                                    int var103 = var102 >> 8 & 255;
                                    int var104 = var102 & 255;
                                    int var105 = this.field449[var101] = this.field329.method531(var103, 0, var104, (byte) -34);
                                    if (var105 != -1) {
                                        this.field329.method533(3, var105);
                                    }
                                    int var106 = this.field450[var101] = this.field329.method531(var103, 1, var104, (byte) -34);
                                    if (var106 != -1) {
                                        this.field329.method533(3, var106);
                                    }
                                    ++var101;
                                }
                            }
                            for (int var94 = 0; var94 < 13; ++var94) {
                                for (int var95 = 0; var95 < 13; ++var95) {
                                    int var96 = this.field237[var93][var94][var95];
                                    if (var96 != -1) {
                                        int var97 = var96 >> 14 & 1023;
                                        int var98 = var96 >> 3 & 2047;
                                        int var99 = (var97 / 8 << 8) + var98 / 8;
                                        for (int var100 = 0; var100 < var91; ++var100) {
                                            if (var92[var100] == var99) {
                                                var99 = -1;
                                                break;
                                            }
                                        }
                                        if (var99 != -1) {
                                            var92[var91++] = var99;
                                        }
                                    }
                                }
                            }
                            ++var93;
                        }
                    }
                    int var107 = this.field499 - this.field501;
                    int var108 = this.field500 - this.field502;
                    this.field501 = this.field499;
                    this.field502 = this.field500;
                    for (int var109 = 0; var109 < 16384; ++var109) {
                        class36 var110 = this.field133[var109];
                        if (var110 != null) {
                            for (int var111 = 0; var111 < 10; ++var111) {
                                var110.field1228[var111] -= var107;
                                var110.field1229[var111] -= var108;
                            }
                            var110.field1206 -= var107 * 128;
                            var110.field1207 -= var108 * 128;
                        }
                    }
                    for (int var112 = 0; var112 < this.field456; ++var112) {
                        class29 var113 = this.field458[var112];
                        if (var113 != null) {
                            for (int var114 = 0; var114 < 10; ++var114) {
                                var113.field1228[var114] -= var107;
                                var113.field1229[var114] -= var108;
                            }
                            var113.field1206 -= var107 * 128;
                            var113.field1207 -= var108 * 128;
                        }
                    }
                    this.field84 = true;
                    byte var115 = 0;
                    byte var116 = 104;
                    byte var117 = 1;
                    if (var107 < 0) {
                        var115 = 103;
                        var116 = -1;
                        var117 = -1;
                    }
                    byte var118 = 0;
                    byte var119 = 104;
                    byte var120 = 1;
                    if (var108 < 0) {
                        var118 = 103;
                        var119 = -1;
                        var120 = -1;
                    }
                    for (int var121 = var115; var116 != var121; var121 += var117) {
                        for (int var122 = var118; var119 != var122; var122 += var120) {
                            int var123 = var107 + var121;
                            int var124 = var108 + var122;
                            for (int var125 = 0; var125 < 4; ++var125) {
                                if (var123 >= 0 && var124 >= 0 && var123 < 104 && var124 < 104) {
                                    this.field538[var125][var121][var122] = this.field538[var125][var123][var124];
                                } else {
                                    this.field538[var125][var121][var122] = null;
                                }
                            }
                        }
                    }
                    for (class56 var126 = (class56) this.field129.method376(); var126 != null; var126 = (class56) this.field129.method378(0)) {
                        var126.field1360 -= var107;
                        var126.field1361 -= var108;
                        if (var126.field1360 < 0 || var126.field1361 < 0 || var126.field1360 >= 104 || var126.field1361 >= 104) {
                            var126.method492();
                        }
                    }
                    if (this.field348 != 0) {
                        this.field348 -= var107;
                        this.field349 -= var108;
                    }
                    this.field430 = false;
                    this.field489 = -1;
                    return true;
                }
                if (this.field489 == 9) {
                    int var127 = this.field254.method325();
                    int var128 = this.field254.method325();
                    int var129 = this.field254.method325();
                    int var130 = this.field254.method325();
                    this.field271[var127] = true;
                    this.field355[var127] = var128;
                    this.field368[var127] = var129;
                    this.field526[var127] = var130;
                    this.field381[var127] = 0;
                    this.field489 = -1;
                    return true;
                }
                if (this.field489 == 86) {
                    int var131 = this.field254.method354((byte) -59);
                    int var132 = this.field254.method360(true);
                    this.field510[var131] = var132;
                    if (this.field232[var131] != var132) {
                        this.field232[var131] = var132;
                        this.method39(this.field380, var131);
                        this.field438 = true;
                        if (this.field427 != -1) {
                            this.field401 = true;
                        }
                    }
                    this.field489 = -1;
                    return true;
                }
                if (this.field489 == 232) {
                    this.field186 = this.field254.method344(-854);
                    if (this.field234 == this.field186) {
                        if (this.field186 == 3) {
                            this.field234 = 1;
                        } else {
                            this.field234 = 3;
                        }
                        this.field438 = true;
                    }
                    this.field489 = -1;
                    return true;
                }
                if (this.field489 == 102) {
                    int var133 = this.field254.method353(0);
                    class52.field1258[var133].field1308 = 3;
                    if (field144.field858 == null) {
                        class52.field1258[var133].field1309 = (field144.field873[11] << 5) + (field144.field873[8] << 10) + (field144.field873[0] << 15) + (field144.field857[0] << 25) + (field144.field857[4] << 20) + field144.field873[1];
                    } else {
                        class52.field1258[var133].field1309 = (int) (field144.field858.field604 + 305419896L);
                    }
                    this.field489 = -1;
                    return true;
                }
                if (this.field489 == 10) {
                    this.field438 = true;
                    int var134 = this.field254.method346(false);
                    int var135 = this.field254.method360(true);
                    int var136 = this.field254.method345(219);
                    this.field470[var134] = var135;
                    this.field466[var134] = var136;
                    this.field131[var134] = 1;
                    for (int var137 = 0; var137 < 98; ++var137) {
                        if (var135 >= field353[var137]) {
                            this.field131[var134] = var137 + 2;
                        }
                    }
                    this.field489 = -1;
                    return true;
                }
                if (this.field489 == 178) {
                    this.field217 = this.field254.method325();
                    this.field489 = -1;
                    return true;
                }
                if (this.field489 == 183) {
                    this.field123 = this.field254.method325();
                    this.field122 = this.field254.method344(-854);
                    while (this.field254.field945 < this.field488) {
                        int var138 = this.field254.method325();
                        this.method51(var138, -92, this.field254);
                    }
                    this.field489 = -1;
                    return true;
                }
                if (this.field489 == 173) {
                    int var139 = this.field254.method354((byte) -59);
                    byte var140 = this.field254.method348(-23701);
                    this.field510[var139] = var140;
                    if (this.field232[var139] != var140) {
                        this.field232[var139] = var140;
                        this.method39(this.field380, var139);
                        this.field438 = true;
                        if (this.field427 != -1) {
                            this.field401 = true;
                        }
                    }
                    this.field489 = -1;
                    return true;
                }
                if (this.field489 == 31) {
                    if (this.field234 == 12) {
                        this.field438 = true;
                    }
                    this.field416 = this.field254.method325();
                    this.field489 = -1;
                    return true;
                }
                if (this.field489 == 36) {
                    this.field226 = this.field254.method325();
                    if (this.field226 == 1) {
                        this.field75 = this.field254.method327();
                    }
                    if (this.field226 >= 2 && this.field226 <= 6) {
                        if (this.field226 == 2) {
                            this.field323 = 64;
                            this.field324 = 64;
                        }
                        if (this.field226 == 3) {
                            this.field323 = 0;
                            this.field324 = 64;
                        }
                        if (this.field226 == 4) {
                            this.field323 = 128;
                            this.field324 = 64;
                        }
                        if (this.field226 == 5) {
                            this.field323 = 64;
                            this.field324 = 0;
                        }
                        if (this.field226 == 6) {
                            this.field323 = 64;
                            this.field324 = 128;
                        }
                        this.field226 = 2;
                        this.field320 = this.field254.method327();
                        this.field321 = this.field254.method327();
                        this.field322 = this.field254.method325();
                    }
                    if (this.field226 == 10) {
                        this.field396 = this.field254.method327();
                    }
                    this.field489 = -1;
                    return true;
                }
                if (this.field489 == 123) {
                    this.field430 = false;
                    for (int var141 = 0; var141 < 5; ++var141) {
                        this.field271[var141] = false;
                    }
                    this.field489 = -1;
                    return true;
                }
                if (this.field489 == 228) {
                    long var142 = this.field254.method331(true);
                    int var144 = this.field254.method325();
                    String var145 = class39.method371(class39.method368((byte) 3, var142), (byte) -7);
                    for (int var146 = 0; var146 < this.field325; ++var146) {
                        if (this.field483[var146] == var142) {
                            if (this.field432[var146] != var144) {
                                this.field432[var146] = var144;
                                this.field438 = true;
                                if (var144 > 0) {
                                    this.method25(0, "", 5, var145 + " has logged in.");
                                }
                                if (var144 == 0) {
                                    this.method25(0, "", 5, var145 + " has logged out.");
                                }
                            }
                            var145 = null;
                            break;
                        }
                    }
                    if (var145 != null && this.field325 < 200) {
                        this.field483[this.field325] = var142;
                        this.field425[this.field325] = var145;
                        this.field432[this.field325] = var144;
                        ++this.field325;
                        this.field438 = true;
                    }
                    boolean var147 = false;
                    while (!var147) {
                        var147 = true;
                        for (int var148 = 0; var148 < this.field325 - 1; ++var148) {
                            if (this.field432[var148] != field373 && this.field432[var148 + 1] == field373 || this.field432[var148] == 0 && this.field432[var148 + 1] != 0) {
                                int var149 = this.field432[var148];
                                this.field432[var148] = this.field432[var148 + 1];
                                this.field432[var148 + 1] = var149;
                                String var150 = this.field425[var148];
                                this.field425[var148] = this.field425[var148 + 1];
                                this.field425[var148 + 1] = var150;
                                long var151 = this.field483[var148];
                                this.field483[var148] = this.field483[var148 + 1];
                                this.field483[var148 + 1] = var151;
                                this.field438 = true;
                                var147 = false;
                            }
                        }
                    }
                    this.field489 = -1;
                    return true;
                }
                if (this.field489 == 233) {
                    this.field235 = this.field254.method325();
                    this.field489 = -1;
                    return true;
                }
                if (this.field489 == 187) {
                    this.field257 = false;
                    this.field153 = 1;
                    this.field431 = "";
                    this.field401 = true;
                    this.field489 = -1;
                    return true;
                }
                if (this.field489 == 209) {
                    String var153 = this.field254.method332();
                    int var154 = this.field254.method325();
                    int var155 = this.field254.method325();
                    if (var155 >= 1 && var155 <= 5) {
                        if (var153.equalsIgnoreCase("null")) {
                            var153 = null;
                        }
                        this.field230[var155 - 1] = var153;
                        this.field231[var155 - 1] = var154 == 0;
                    }
                    this.field489 = -1;
                    return true;
                }
                if (this.field489 == 111) {
                    this.method136((byte) 7, this.field254, this.field488);
                    this.field84 = false;
                    this.field489 = -1;
                    return true;
                }
                if (this.field489 == 199) {
                    this.field234 = this.field254.method344(-854);
                    this.field438 = true;
                    this.field121 = true;
                    this.field489 = -1;
                    return true;
                }
                if (this.field489 == 143) {
                    int var156 = this.field254.method328();
                    this.field427 = var156;
                    this.field401 = true;
                    this.field489 = -1;
                    return true;
                }
                if (this.field489 == 4) {
                    this.field326 = this.field254.method325();
                    this.field438 = true;
                    this.field489 = -1;
                    return true;
                }
                if (this.field489 == 247) {
                    int var157 = this.field254.method327();
                    int var158 = this.field254.method354((byte) -59);
                    if (this.field301 != -1) {
                        this.field301 = -1;
                        this.field401 = true;
                    }
                    if (this.field153 != 0) {
                        this.field153 = 0;
                        this.field401 = true;
                    }
                    this.field347 = var158;
                    this.field541 = var157;
                    this.field438 = true;
                    this.field121 = true;
                    this.field352 = false;
                    this.field489 = -1;
                    return true;
                }
                if (this.field489 == 254) {
                    if (this.field234 == 12) {
                        this.field438 = true;
                    }
                    this.field404 = this.field254.method328();
                    this.field489 = -1;
                    return true;
                }
                if (this.field489 == 100) {
                    int var159 = this.field254.method353(0);
                    if (var159 == 65535) {
                        var159 = -1;
                    }
                    if (this.field419 != var159 && this.field161 && !field376 && this.field543 == 0) {
                        this.field117 = var159;
                        this.field118 = true;
                        this.field329.method533(2, this.field117);
                    }
                    this.field419 = var159;
                    this.field489 = -1;
                    return true;
                }
                if (this.field489 == 126) {
                    int var160 = this.field254.method358(-39582);
                    int var161 = this.field254.method353(0);
                    if (this.field161 && !field376) {
                        this.field117 = var161;
                        this.field118 = false;
                        this.field329.method533(2, this.field117);
                        this.field543 = var160;
                    }
                    this.field489 = -1;
                    return true;
                }
                if (this.field489 == 91) {
                    int var162 = this.field254.method357(this.field453);
                    if (var162 >= 0) {
                        this.method44((byte) 1, var162);
                    }
                    this.field403 = var162;
                    this.field489 = -1;
                    return true;
                }
                if (this.field489 == 124) {
                    int var163 = this.field254.method352((byte) 117);
                    this.method44((byte) 1, var163);
                    if (this.field301 != -1) {
                        this.field301 = -1;
                        this.field401 = true;
                    }
                    if (this.field153 != 0) {
                        this.field153 = 0;
                        this.field401 = true;
                    }
                    this.field541 = var163;
                    this.field438 = true;
                    this.field121 = true;
                    this.field347 = -1;
                    this.field352 = false;
                    this.field489 = -1;
                    return true;
                }
                if (this.field489 == 163) {
                    this.field438 = true;
                    int var164 = this.field254.method327();
                    class52 var165 = class52.field1258[var164];
                    while (this.field254.field945 < this.field488) {
                        int var166 = this.field254.method339();
                        int var167 = this.field254.method327();
                        int var168 = this.field254.method325();
                        if (var168 == 255) {
                            var168 = this.field254.method330();
                        }
                        if (var166 >= 0 && var166 < var165.field1304.length) {
                            var165.field1304[var166] = var167;
                            var165.field1272[var166] = var168;
                        }
                    }
                    this.field489 = -1;
                    return true;
                }
                if (this.field489 == 42) {
                    this.field438 = true;
                    int var169 = this.field254.method327();
                    class52 var170 = class52.field1258[var169];
                    int var171 = this.field254.method327();
                    for (int var172 = 0; var172 < var171; ++var172) {
                        var170.field1304[var172] = this.field254.method327();
                        int var173 = this.field254.method344(-854);
                        if (var173 == 255) {
                            var173 = this.field254.method360(true);
                        }
                        var170.field1272[var172] = var173;
                    }
                    for (int var174 = var171; var174 < var170.field1304.length; ++var174) {
                        var170.field1304[var174] = 0;
                        var170.field1272[var174] = 0;
                    }
                    this.field489 = -1;
                    return true;
                }
                if (this.field489 == 198) {
                    int var175 = this.field254.method327();
                    int var176 = this.field254.method325();
                    int var177 = this.field254.method327();
                    if (this.field367 && !field376 && this.field340 < 50) {
                        this.field192[this.field340] = var175;
                        this.field92[this.field340] = var176;
                        this.field342[this.field340] = class13.field669[var175] + var177;
                        ++this.field340;
                    }
                    this.field489 = -1;
                    return true;
                }
                if (this.field489 == 76) {
                    this.field351 = this.field254.method330();
                    this.field130 = this.field254.method346(false);
                    this.field100 = this.field254.method354((byte) -59);
                    this.field540 = this.field254.method345(219);
                    this.field220 = this.field254.method327();
                    if (this.field351 != 0 && this.field347 == -1) {
                        signlink.dnslookup(class39.method370(0, this.field351));
                        this.method128(true);
                        short var178 = 650;
                        if (this.field130 != 201 || this.field540 == 1) {
                            var178 = 655;
                        }
                        this.field187 = "";
                        this.field354 = false;
                        for (int var179 = 0; var179 < class52.field1258.length; ++var179) {
                            if (class52.field1258[var179] != null && class52.field1258[var179].field1262 == var178) {
                                this.field347 = class52.field1258[var179].field1271;
                                break;
                            }
                        }
                    }
                    this.field489 = -1;
                    return true;
                }
                if (this.field489 == 241) {
                    for (int var180 = 0; var180 < this.field232.length; ++var180) {
                        if (this.field510[var180] != this.field232[var180]) {
                            this.field232[var180] = this.field510[var180];
                            this.method39(this.field380, var180);
                            this.field438 = true;
                        }
                    }
                    this.field489 = -1;
                    return true;
                }
                if (this.field489 == 145) {
                    int var181 = this.field254.method354((byte) -59);
                    int var182 = this.field254.method352((byte) 117);
                    class52 var183 = class52.field1258[var182];
                    if (var183 != null && var183.field1298 == 0) {
                        if (var181 < 0) {
                            var181 = 0;
                        }
                        if (var181 > var183.field1318 - var183.field1264) {
                            var181 = var183.field1318 - var183.field1264;
                        }
                        var183.field1320 = var181;
                    }
                    this.field489 = -1;
                    return true;
                }
                if (this.field489 == 189 || this.field489 == 192 || this.field489 == 152 || this.field489 == 51 || this.field489 == 50 || this.field489 == 110 || this.field489 == 211 || this.field489 == 48 || this.field489 == 249 || this.field489 == 172 || this.field489 == 251) {
                    this.method51(this.field489, -92, this.field254);
                    this.field489 = -1;
                    return true;
                }
                if (this.field489 == 52) {
                    int var184 = this.field254.method327();
                    int var185 = this.field254.method356((byte) 35);
                    class52 var186 = class52.field1258[var184];
                    var186.field1301 = var185;
                    if (var185 == -1) {
                        var186.field1317 = 0;
                        var186.field1257 = 0;
                    }
                    this.field489 = -1;
                    return true;
                }
                if (this.field489 == 205) {
                    this.field430 = true;
                    this.field503 = this.field254.method325();
                    this.field504 = this.field254.method325();
                    this.field505 = this.field254.method327();
                    this.field506 = this.field254.method325();
                    this.field507 = this.field254.method325();
                    if (this.field507 >= 100) {
                        this.field266 = this.field503 * 128 + 64;
                        this.field268 = this.field504 * 128 + 64;
                        this.field267 = this.method24(this.field266, -8947, this.field268, this.field426) - this.field505;
                    }
                    this.field489 = -1;
                    return true;
                }
                signlink.reporterror("T1 - " + this.field489 + "," + this.field488 + " - " + this.field127 + "," + this.field128);
                this.method147(0);
            } catch (IOException var191) {
                this.method28(0);
            } catch (Exception var192) {
                String var188 = "T2 - " + this.field489 + "," + this.field127 + "," + this.field128 + " - " + this.field488 + "," + (field144.field1228[0] + this.field499) + "," + (field144.field1229[0] + this.field500) + " - ";
                for (int var189 = 0; var189 < this.field488 && var189 < 50; ++var189) {
                    var188 = var188 + this.field254.field944[var189] + ",";
                }
                signlink.reporterror(var188);
                this.method147(0);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LUTGRLTTT;I)V")
    private final void method49(class56 arg0, int arg1) {
        int var3 = 0;
        int var4 = -1;
        int var5 = 0;
        int var6 = 0;
        if (arg0.field1359 == 0) {
            var3 = this.field243.method432(arg0.field1358, arg0.field1360, arg0.field1361);
        }
        if (arg0.field1359 == 1) {
            var3 = this.field243.method433(true, arg0.field1361, arg0.field1358, arg0.field1360);
        }
        if (arg0.field1359 == 2) {
            var3 = this.field243.method434(arg0.field1358, arg0.field1360, arg0.field1361);
        }
        if (arg0.field1359 == 3) {
            var3 = this.field243.method435(arg0.field1358, arg0.field1360, arg0.field1361);
        }
        if (var3 != 0) {
            int var7 = this.field243.method436(arg0.field1358, arg0.field1360, arg0.field1361, var3);
            var4 = var3 >> 14 & 32767;
            var5 = var7 & 31;
            var6 = var7 >> 6;
        }
        arg0.field1352 = var4;
        arg0.field1354 = var5;
        if (arg1 == 36318) {
            arg0.field1353 = var6;
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(Z)Z")
    public final boolean method50(boolean arg0) {
        if (arg0) {
            this.method70();
        }
        return signlink.wavereplay();
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IILMQZHAILV;)V")
    public final void method51(int arg0, int arg1, class33 arg2) {
        if (arg1 >= 0) {
            this.method70();
        }
        if (arg0 == 172) {
            int var4 = arg2.method344(-854);
            int var5 = var4 >> 2;
            int var6 = var4 & 3;
            int var7 = this.field545[var5];
            int var8 = arg2.method345(219);
            int var9 = (var8 >> 4 & 7) + this.field122;
            int var10 = (var8 & 7) + this.field123;
            if (var9 >= 0 && var10 >= 0 && var9 < 104 && var10 < 104) {
                this.method98(0, var5, this.field426, -1, var6, -1, var10, var9, this.field370, var7);
            }
        } else if (arg0 == 50) {
            int var11 = arg2.method325();
            int var12 = (var11 >> 4 & 7) + this.field122;
            int var13 = (var11 & 7) + this.field123;
            int var14 = arg2.method327();
            int var15 = arg2.method325();
            int var16 = arg2.method327();
            if (var12 >= 0 && var13 >= 0 && var12 < 104 && var13 < 104) {
                int var17 = var12 * 128 + 64;
                int var18 = var13 * 128 + 64;
                class69 var19 = new class69(field369, 247, var18, var14, this.method24(var17, -8947, var18, this.field426) - var15, this.field426, var16, var17);
                this.field184.method373(var19);
            }
        } else if (arg0 == 48) {
            int var20 = arg2.method354((byte) -59);
            int var21 = arg2.method354((byte) -59);
            int var22 = arg2.method325();
            int var23 = (var22 >> 4 & 7) + this.field122;
            int var24 = (var22 & 7) + this.field123;
            if (var23 >= 0 && var24 >= 0 && var23 < 104 && var24 < 104) {
                class65 var25 = new class65();
                var25.field1490 = var20;
                var25.field1488 = var21;
                if (this.field538[this.field426][var23][var24] == null) {
                    this.field538[this.field426][var23][var24] = new class42(-591);
                }
                this.field538[this.field426][var23][var24].method373(var25);
                this.method94(var23, var24);
            }
        } else if (arg0 == 249) {
            int var26 = arg2.method346(false);
            int var27 = (var26 >> 4 & 7) + this.field122;
            int var28 = (var26 & 7) + this.field123;
            int var29 = arg2.method346(false);
            int var30 = var29 >> 2;
            int var31 = var29 & 3;
            int var32 = this.field545[var30];
            int var33 = arg2.method327();
            if (var27 >= 0 && var28 >= 0 && var27 < 103 && var28 < 103) {
                int var34 = this.field434[this.field426][var27][var28];
                int var35 = this.field434[this.field426][var27 + 1][var28];
                int var36 = this.field434[this.field426][var27 + 1][var28 + 1];
                int var37 = this.field434[this.field426][var27][var28 + 1];
                if (var32 == 0) {
                    class54 var38 = this.field243.method428(var27, -654, this.field426, var28);
                    if (var38 != null) {
                        int var39 = var38.field1337 >> 14 & 32767;
                        if (var30 == 2) {
                            var38.field1335 = new class58(var35, var37, -486, var33, var39, var36, var31 + 4, var34, false, 2);
                            var38.field1336 = new class58(var35, var37, -486, var33, var39, var36, var31 + 1 & 3, var34, false, 2);
                        } else {
                            var38.field1335 = new class58(var35, var37, -486, var33, var39, var36, var31, var34, false, var30);
                        }
                    }
                }
                if (var32 == 1) {
                    class17 var40 = this.field243.method429(var28, var27, 36470, this.field426);
                    if (var40 != null) {
                        var40.field712 = new class58(var35, var37, -486, var33, var40.field713 >> 14 & 32767, var36, 0, var34, false, 4);
                    }
                }
                if (var32 == 2) {
                    class40 var41 = this.field243.method430(var27, var28, this.field426, false);
                    if (var30 == 11) {
                        var30 = 10;
                    }
                    if (var41 != null) {
                        var41.field998 = new class58(var35, var37, -486, var33, var41.field1006 >> 14 & 32767, var36, var31, var34, false, var30);
                    }
                }
                if (var32 == 3) {
                    class14 var42 = this.field243.method431(var27, var28, this.field426, this.field402);
                    if (var42 != null) {
                        var42.field678 = new class58(var35, var37, -486, var33, var42.field679 >> 14 & 32767, var36, var31, var34, false, 22);
                    }
                }
            }
        } else if (arg0 == 51) {
            int var43 = arg2.method344(-854);
            int var44 = (var43 >> 4 & 7) + this.field122;
            int var45 = (var43 & 7) + this.field123;
            int var46 = arg2.method327();
            int var47 = arg2.method327();
            int var48 = arg2.method354((byte) -59);
            if (var44 >= 0 && var45 >= 0 && var44 < 104 && var45 < 104 && this.field523 != var47) {
                class65 var49 = new class65();
                var49.field1490 = var48;
                var49.field1488 = var46;
                if (this.field538[this.field426][var44][var45] == null) {
                    this.field538[this.field426][var44][var45] = new class42(-591);
                }
                this.field538[this.field426][var44][var45].method373(var49);
                this.method94(var44, var45);
            }
        } else {
            if (arg0 == 189) {
                int var50 = arg2.method325();
                int var51 = (var50 >> 4 & 7) + this.field122;
                int var52 = (var50 & 7) + this.field123;
                int var53 = arg2.method327();
                int var54 = arg2.method325();
                int var55 = var54 >> 4 & 15;
                int var56 = var54 & 7;
                if (field144.field1228[0] >= var51 - var55 && field144.field1228[0] <= var51 + var55 && field144.field1229[0] >= var52 - var55 && field144.field1229[0] <= var52 + var55 && this.field367 && !field376 && this.field340 < 50) {
                    this.field192[this.field340] = var53;
                    this.field92[this.field340] = var56;
                    this.field342[this.field340] = class13.field669[var53];
                    ++this.field340;
                }
            }
            if (arg0 == 192) {
                int var57 = arg2.method325();
                int var58 = (var57 >> 4 & 7) + this.field122;
                int var59 = (var57 & 7) + this.field123;
                int var60 = arg2.method327();
                int var61 = arg2.method327();
                int var62 = arg2.method327();
                if (var58 >= 0 && var59 >= 0 && var58 < 104 && var59 < 104) {
                    class42 var63 = this.field538[this.field426][var58][var59];
                    if (var63 != null) {
                        for (class65 var64 = (class65) var63.method376(); var64 != null; var64 = (class65) var63.method378(0)) {
                            if ((var60 & 32767) == var64.field1490 && var64.field1488 == var61) {
                                var64.field1488 = var62;
                                break;
                            }
                        }
                        this.method94(var58, var59);
                    }
                }
            } else if (arg0 == 110) {
                int var65 = arg2.method325();
                int var66 = (var65 >> 4 & 7) + this.field122;
                int var67 = (var65 & 7) + this.field123;
                int var68 = var66 + arg2.method326();
                int var69 = var67 + arg2.method326();
                int var70 = arg2.method328();
                int var71 = arg2.method327();
                int var72 = arg2.method325() * 4;
                int var73 = arg2.method325() * 4;
                int var74 = arg2.method327();
                int var75 = arg2.method327();
                int var76 = arg2.method325();
                int var77 = arg2.method325();
                if (var66 >= 0 && var67 >= 0 && var66 < 104 && var67 < 104 && var68 >= 0 && var69 >= 0 && var68 < 104 && var69 < 104 && var71 != 65535) {
                    int var78 = var66 * 128 + 64;
                    int var79 = var67 * 128 + 64;
                    int var80 = var68 * 128 + 64;
                    int var81 = var69 * 128 + 64;
                    class59 var82 = new class59(var70, this.field426, var73, field369 + var75, var71, var77, var76, var78, field369 + var74, -784, this.method24(var78, -8947, var79, this.field426) - var72, var79);
                    var82.method507(var81, this.field397, this.method24(var80, -8947, var81, this.field426) - var73, var80, field369 + var74);
                    this.field111.method373(var82);
                }
            } else if (arg0 == 251) {
                int var83 = arg2.method327();
                int var84 = arg2.method325();
                int var85 = var84 >> 2;
                int var86 = var84 & 3;
                int var87 = this.field545[var85];
                int var88 = arg2.method325();
                int var89 = (var88 >> 4 & 7) + this.field122;
                int var90 = (var88 & 7) + this.field123;
                if (var89 >= 0 && var90 >= 0 && var89 < 104 && var90 < 104) {
                    this.method98(0, var85, this.field426, -1, var86, var83, var90, var89, this.field370, var87);
                }
            } else if (arg0 == 211) {
                int var91 = arg2.method354((byte) -59);
                int var92 = arg2.method345(219);
                int var93 = (var92 >> 4 & 7) + this.field122;
                int var94 = (var92 & 7) + this.field123;
                if (var93 >= 0 && var94 >= 0 && var93 < 104 && var94 < 104) {
                    class42 var95 = this.field538[this.field426][var93][var94];
                    if (var95 != null) {
                        for (class65 var96 = (class65) var95.method376(); var96 != null; var96 = (class65) var95.method378(0)) {
                            if ((var91 & 32767) == var96.field1490) {
                                var96.method492();
                                break;
                            }
                        }
                        if (var95.method376() == null) {
                            this.field538[this.field426][var93][var94] = null;
                        }
                        this.method94(var93, var94);
                    }
                }
            } else {
                if (arg0 == 152) {
                    int var97 = arg2.method354((byte) -59);
                    byte var98 = arg2.method347(0);
                    byte var99 = arg2.method347(0);
                    int var100 = arg2.method327();
                    byte var101 = arg2.method348(-23701);
                    int var102 = arg2.method325();
                    int var103 = (var102 >> 4 & 7) + this.field122;
                    int var104 = (var102 & 7) + this.field123;
                    byte var105 = arg2.method326();
                    int var106 = arg2.method354((byte) -59);
                    int var107 = arg2.method354((byte) -59);
                    int var108 = arg2.method346(false);
                    int var109 = var108 >> 2;
                    int var110 = var108 & 3;
                    int var111 = this.field545[var109];
                    class29 var112;
                    if (this.field523 == var106) {
                        var112 = field144;
                    } else {
                        var112 = this.field458[var106];
                    }
                    if (var112 != null) {
                        class72 var113 = class72.method588(var97);
                        int var114 = this.field434[this.field426][var103][var104];
                        int var115 = this.field434[this.field426][var103 + 1][var104];
                        int var116 = this.field434[this.field426][var103 + 1][var104 + 1];
                        int var117 = this.field434[this.field426][var103][var104 + 1];
                        class70 var118 = var113.method586(var109, var110, var114, var115, var116, var117, -1);
                        if (var118 != null) {
                            this.method98(var107 + 1, 0, this.field426, var100 + 1, 0, -1, var104, var103, this.field370, var111);
                            var112.field868 = field369 + var107;
                            var112.field869 = field369 + var100;
                            var112.field863 = var118;
                            int var119 = var113.field1707;
                            int var120 = var113.field1723;
                            if (var110 == 1 || var110 == 3) {
                                var119 = var113.field1723;
                                var120 = var113.field1707;
                            }
                            var112.field860 = var103 * 128 + var119 * 64;
                            var112.field862 = var104 * 128 + var120 * 64;
                            var112.field861 = this.method24(var112.field860, -8947, var112.field862, this.field426);
                            if (var101 > var99) {
                                byte var121 = var101;
                                var101 = var99;
                                var99 = var121;
                            }
                            if (var98 > var105) {
                                byte var122 = var98;
                                var98 = var105;
                                var105 = var122;
                            }
                            var112.field864 = var101 + var103;
                            var112.field866 = var99 + var103;
                            var112.field865 = var98 + var104;
                            var112.field867 = var104 + var105;
                            return;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(Z)V")
    private final void method52(boolean arg0) {
        this.field106 &= arg0;
        if (this.field497 == 2) {
            for (class56 var2 = (class56) this.field129.method376(); var2 != null; var2 = (class56) this.field129.method378(0)) {
                if (var2.field1362 > 0) {
                    --var2.field1362;
                }
                if (var2.field1362 == 0) {
                    if (var2.field1352 < 0 || class31.method281(0, var2.field1352, var2.field1354)) {
                        this.method141(var2.field1353, var2.field1352, var2.field1358, var2.field1361, var2.field1354, var2.field1360, var2.field1359, -494);
                        var2.method492();
                    }
                } else {
                    if (var2.field1351 > 0) {
                        --var2.field1351;
                    }
                    if (var2.field1351 == 0 && var2.field1360 >= 1 && var2.field1361 >= 1 && var2.field1360 <= 102 && var2.field1361 <= 102 && (var2.field1355 < 0 || class31.method281(0, var2.field1355, var2.field1357))) {
                        this.method141(var2.field1356, var2.field1355, var2.field1358, var2.field1361, var2.field1357, var2.field1360, var2.field1359, -494);
                        var2.field1351 = -1;
                        if (var2.field1355 == var2.field1352 && var2.field1352 == -1) {
                            var2.method492();
                        } else if (var2.field1355 == var2.field1352 && var2.field1356 == var2.field1353 && var2.field1357 == var2.field1354) {
                            var2.method492();
                        }
                    }
                }
            }
            ++field520;
            if (field520 > 1729) {
                field520 = 0;
                this.field310.method314(43776, 150);
                this.field310.method315(0);
                int var3 = this.field310.field945;
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field310.method316(29185);
                }
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field310.method316(16136);
                }
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field310.method316(49565);
                }
                this.field310.method316(39160);
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field310.method315(97);
                }
                this.field310.method316((int) (Math.random() * 65536.0D));
                this.field310.method316(7669);
                this.field310.method316(55494);
                this.field310.method316(52743);
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field310.method315(155);
                }
                this.field310.method324(this.field310.field945 - var3, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;)V")
    private final void method53(String arg0) {
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

    @OriginalMember(owner = "client", name = "l", descriptor = "(I)V")
    public final void method54(int arg0) {
        while (arg0 >= 0) {
            this.field275 = !this.field275;
        }
        short var2 = 256;
        for (int var3 = 10; var3 < 117; ++var3) {
            int var18 = (int) (Math.random() * 100.0D);
            if (var18 < 50) {
                this.field215[(var2 - 2 << 7) + var3] = 255;
            }
        }
        for (int var4 = 0; var4 < 100; ++var4) {
            int var15 = (int) (Math.random() * 124.0D) + 2;
            int var16 = (int) (Math.random() * 128.0D) + 128;
            int var17 = (var16 << 7) + var15;
            this.field215[var17] = 192;
        }
        for (int var5 = 1; var5 < var2 - 1; ++var5) {
            for (int var13 = 1; var13 < 127; ++var13) {
                int var14 = (var5 << 7) + var13;
                this.field216[var14] = (this.field215[var14 - 1] + this.field215[var14 + 1] + this.field215[var14 - 128] + this.field215[var14 + 128]) / 4;
            }
        }
        this.field280 += 128;
        if (this.field280 > this.field281.length) {
            this.field280 -= this.field281.length;
            int var6 = (int) (Math.random() * 12.0D);
            this.method26(572, this.field482[var6]);
        }
        for (int var7 = 1; var7 < var2 - 1; ++var7) {
            for (int var10 = 1; var10 < 127; ++var10) {
                int var11 = (var7 << 7) + var10;
                int var12 = this.field216[var11 + 128] - this.field281[this.field280 + var11 & this.field281.length - 1] / 5;
                if (var12 < 0) {
                    var12 = 0;
                }
                this.field215[var11] = var12;
            }
        }
        for (int var8 = 0; var8 < var2 - 1; ++var8) {
            this.field145[var8] = this.field145[var8 + 1];
        }
        this.field145[var2 - 1] = (int) (Math.sin((double) field369 / 14.0D) * 16.0D + Math.sin((double) field369 / 15.0D) * 14.0D + Math.sin((double) field369 / 16.0D) * 12.0D);
        if (this.field407 > 0) {
            this.field407 -= 4;
        }
        if (this.field408 > 0) {
            this.field408 -= 4;
        }
        if (this.field407 == 0 && this.field408 == 0) {
            int var9 = (int) (Math.random() * 2000.0D);
            if (var9 == 0) {
                this.field407 = 1024;
            }
            if (var9 == 1) {
                this.field408 = 1024;
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "m", descriptor = "(I)V")
    public static final void method55(int arg0) {
        class46.field1087 = false;
        class44.field1049 = false;
        if (arg0 == -41414) {
            field376 = false;
            class31.field917 = false;
            class72.field1720 = false;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LUFHMHWIH;IZI)V")
    public final void method56(class55 arg0, int arg1, boolean arg2, int arg3) {
        int var5 = this.field384 + this.field277 & 2047;
        int var6 = arg1 * arg1 + arg3 * arg3;
        if (var6 <= 6400) {
            int var7 = class70.field1634[var5];
            int var8 = class70.field1635[var5];
            int var9 = var7 * 256 / (this.field420 + 256);
            int var10 = var8 * 256 / (this.field420 + 256);
            if (!arg2) {
                this.field222 = !this.field222;
            }
            int var11 = arg1 * var10 + arg3 * var9 >> 16;
            int var12 = arg3 * var10 - arg1 * var9 >> 16;
            if (var6 > 2500) {
                arg0.method504(var11 + 94 - arg0.field1349 / 2 + 4, true, this.field109, 83 - var12 - arg0.field1350 / 2 - 4);
            } else {
                arg0.method498(var11 + 94 - arg0.field1349 / 2 + 4, 83 - var12 - arg0.field1350 / 2 - 4, 2);
            }
        }
    }

    @OriginalMember(owner = "client", name = "n", descriptor = "(I)Ljava/net/Socket;")
    public final Socket method57(int arg0) throws IOException {
        return signlink.mainapp != null ? signlink.opensocket(arg0) : new Socket(InetAddress.getByName(this.getCodeBase().getHost()), arg0);
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(Z)V")
    public final void method58(boolean arg0) {
        Graphics var2 = this.method42(1).getGraphics();
        if (arg0) {
            field498 = 380;
        }
        var2.setColor(Color.black);
        var2.fillRect(0, 0, 765, 503);
        this.method579(false, 1);
        if (this.field509) {
            this.field204 = false;
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
        if (this.field119) {
            this.field204 = false;
            var2.setFont(new Font("Helvetica", 1, 20));
            var2.setColor(Color.white);
            var2.drawString("Error - unable to load game!", 50, 50);
            var2.drawString("To play RuneScape make sure you play from", 50, 100);
            var2.drawString("http://www.runescape.com", 50, 150);
        }
        if (this.field241) {
            this.field204 = false;
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

    @OriginalMember(owner = "client", name = "a", descriptor = "(IILCOIHKGSL;II)V")
    public final void method59(int arg0, int arg1, class6 arg2, int arg3, int arg4) {
        while (arg4 >= 0) {
            this.field489 = -1;
        }
        if (this.field152 < 400) {
            if (arg2.field583 != null) {
                arg2 = arg2.method167(0);
            }
            if (arg2 != null) {
                if (arg2.field580) {
                    String var6 = arg2.field589;
                    if (arg2.field566 != 0) {
                        var6 = var6 + method33(arg2.field566, field144.field871, 554) + " (level-" + arg2.field566 + ")";
                    }
                    if (this.field147 == 1) {
                        this.field137[this.field152] = "Use " + this.field151 + " with @yel@" + var6;
                        this.field358[this.field152] = 345;
                        this.field359[this.field152] = arg3;
                        this.field356[this.field152] = arg1;
                        this.field357[this.field152] = arg0;
                        ++this.field152;
                    } else {
                        if (this.field474 == 1) {
                            if ((this.field476 & 2) == 2) {
                                this.field137[this.field152] = this.field477 + " @yel@" + var6;
                                this.field358[this.field152] = 214;
                                this.field359[this.field152] = arg3;
                                this.field356[this.field152] = arg1;
                                this.field357[this.field152] = arg0;
                                ++this.field152;
                                return;
                            }
                        } else {
                            if (arg2.field586 != null) {
                                for (int var7 = 4; var7 >= 0; --var7) {
                                    if (arg2.field586[var7] != null && !arg2.field586[var7].equalsIgnoreCase("attack")) {
                                        this.field137[this.field152] = arg2.field586[var7] + " @yel@" + var6;
                                        if (var7 == 0) {
                                            this.field358[this.field152] = 205;
                                        }
                                        if (var7 == 1) {
                                            this.field358[this.field152] = 475;
                                        }
                                        if (var7 == 2) {
                                            this.field358[this.field152] = 677;
                                        }
                                        if (var7 == 3) {
                                            this.field358[this.field152] = 381;
                                        }
                                        if (var7 == 4) {
                                            this.field358[this.field152] = 939;
                                        }
                                        this.field359[this.field152] = arg3;
                                        this.field356[this.field152] = arg1;
                                        this.field357[this.field152] = arg0;
                                        ++this.field152;
                                    }
                                }
                            }
                            if (arg2.field586 != null) {
                                for (int var8 = 4; var8 >= 0; --var8) {
                                    if (arg2.field586[var8] != null && arg2.field586[var8].equalsIgnoreCase("attack")) {
                                        short var9 = 0;
                                        if (arg2.field566 > field144.field871) {
                                            var9 = 2000;
                                        }
                                        this.field137[this.field152] = arg2.field586[var8] + " @yel@" + var6;
                                        if (var8 == 0) {
                                            this.field358[this.field152] = var9 + 205;
                                        }
                                        if (var8 == 1) {
                                            this.field358[this.field152] = var9 + 475;
                                        }
                                        if (var8 == 2) {
                                            this.field358[this.field152] = var9 + 677;
                                        }
                                        if (var8 == 3) {
                                            this.field358[this.field152] = var9 + 381;
                                        }
                                        if (var8 == 4) {
                                            this.field358[this.field152] = var9 + 939;
                                        }
                                        this.field359[this.field152] = arg3;
                                        this.field356[this.field152] = arg1;
                                        this.field357[this.field152] = arg0;
                                        ++this.field152;
                                    }
                                }
                            }
                            this.field137[this.field152] = "Examine @yel@" + var6;
                            this.field358[this.field152] = 1520;
                            this.field359[this.field152] = arg3;
                            this.field356[this.field152] = arg1;
                            this.field357[this.field152] = arg0;
                            ++this.field152;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "o", descriptor = "(I)V")
    public final void method60(int arg0) {
        int var2 = this.field261;
        int var3 = this.field262;
        int var4 = this.field263;
        int var5 = this.field264;
        int var6 = 6116423;
        class23.method258(var4, (byte) -33, var2, var6, var3, var5);
        class23.method258(var4 - 2, (byte) -33, var2 + 1, 0, var3 + 1, 16);
        class23.method259(var2 + 1, var3 + 18, 0, false, var5 - 19, var4 - 2);
        if (arg0 >= 0) {
            this.field538 = null;
        }
        this.field298.method462(var6, "Choose Option", 0, var3 + 14, var2 + 3);
        int var7 = super.field1658;
        int var8 = super.field1659;
        if (this.field260 == 0) {
            var7 -= 4;
            var8 -= 4;
        }
        if (this.field260 == 1) {
            var7 -= 553;
            var8 -= 205;
        }
        if (this.field260 == 2) {
            var7 -= 17;
            var8 -= 357;
        }
        for (int var9 = 0; var9 < this.field152; ++var9) {
            int var10 = (this.field152 - 1 - var9) * 15 + var3 + 31;
            int var11 = 16777215;
            if (var7 > var2 && var7 < var2 + var4 && var8 > var10 - 13 && var8 < var10 + 3) {
                var11 = 16776960;
            }
            this.field298.method466(var10, 8, true, this.field137[var9], var2 + 3, var11);
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(III)Z")
    public final boolean method61(int arg0, int arg1, int arg2) {
        if (arg1 != -20845) {
            this.field489 = -1;
        }
        boolean var4 = false;
        class52 var5 = class52.field1258[arg2];
        for (int var6 = 0; var6 < var5.field1311.length && var5.field1311[var6] != -1; ++var6) {
            class52 var7 = class52.field1258[var5.field1311[var6]];
            if (var7.field1298 == 1) {
                var4 |= this.method61(arg0, -20845, var7.field1281);
            }
            if (var7.field1298 == 6 && (var7.field1301 != -1 || var7.field1302 != -1)) {
                boolean var8 = this.method127(this.field519, var7);
                int var9;
                if (var8) {
                    var9 = var7.field1302;
                } else {
                    var9 = var7.field1301;
                }
                if (var9 != -1) {
                    class22 var10 = class22.field761[var9];
                    var7.field1257 += arg0;
                    while (var7.field1257 > var10.method251(this.field146, var7.field1317)) {
                        var7.field1257 -= var10.method251(this.field146, var7.field1317) + 1;
                        ++var7.field1317;
                        if (var7.field1317 >= var10.field762) {
                            var7.field1317 -= var10.field766;
                            if (var7.field1317 < 0 || var7.field1317 >= var10.field762) {
                                var7.field1317 = 0;
                            }
                        }
                        var4 = true;
                    }
                }
            }
            if (var7.field1298 == 6 && var7.field1265 != 0) {
                int var11 = var7.field1265 >> 16;
                int var12 = var7.field1265 << 16 >> 16;
                int var13 = arg0 * var11;
                int var14 = arg0 * var12;
                var7.field1267 = var7.field1267 + var13 & 2047;
                var7.field1268 = var7.field1268 + var14 & 2047;
                var4 = true;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client", name = "p", descriptor = "(I)V")
    public final void method62(int arg0) {
        if (this.field147 == 0 && this.field474 == 0) {
            this.field137[this.field152] = "Walk here";
            this.field358[this.field152] = 672;
            this.field356[this.field152] = super.field1658;
            this.field357[this.field152] = super.field1659;
            ++this.field152;
        }
        int var2 = -1;
        for (int var3 = 0; var3 < class70.field1632; ++var3) {
            int var4 = class70.field1633[var3];
            int var5 = var4 & 127;
            int var6 = var4 >> 7 & 127;
            int var7 = var4 >> 29 & 3;
            int var8 = var4 >> 14 & 32767;
            if (var2 != var4) {
                var2 = var4;
                if (var7 == 2 && this.field243.method436(this.field426, var5, var6, var4) >= 0) {
                    class72 var9 = class72.method588(var8);
                    if (var9.field1689 != null) {
                        var9 = var9.method589(-612);
                    }
                    if (var9 == null) {
                        continue;
                    }
                    if (this.field147 == 1) {
                        this.field137[this.field152] = "Use " + this.field151 + " with @cya@" + var9.field1701;
                        this.field358[this.field152] = 37;
                        this.field359[this.field152] = var4;
                        this.field356[this.field152] = var5;
                        this.field357[this.field152] = var6;
                        ++this.field152;
                    } else if (this.field474 == 1) {
                        if ((this.field476 & 4) == 4) {
                            this.field137[this.field152] = this.field477 + " @cya@" + var9.field1701;
                            this.field358[this.field152] = 337;
                            this.field359[this.field152] = var4;
                            this.field356[this.field152] = var5;
                            this.field357[this.field152] = var6;
                            ++this.field152;
                        }
                    } else {
                        if (var9.field1693 != null) {
                            for (int var10 = 4; var10 >= 0; --var10) {
                                if (var9.field1693[var10] != null) {
                                    this.field137[this.field152] = var9.field1693[var10] + " @cya@" + var9.field1701;
                                    if (var10 == 0) {
                                        this.field358[this.field152] = 276;
                                    }
                                    if (var10 == 1) {
                                        this.field358[this.field152] = 413;
                                    }
                                    if (var10 == 2) {
                                        this.field358[this.field152] = 899;
                                    }
                                    if (var10 == 3) {
                                        this.field358[this.field152] = 115;
                                    }
                                    if (var10 == 4) {
                                        this.field358[this.field152] = 1161;
                                    }
                                    this.field359[this.field152] = var4;
                                    this.field356[this.field152] = var5;
                                    this.field357[this.field152] = var6;
                                    ++this.field152;
                                }
                            }
                        }
                        this.field137[this.field152] = "Examine @cya@" + var9.field1701;
                        this.field358[this.field152] = 1230;
                        this.field359[this.field152] = var9.field1705 << 14;
                        this.field356[this.field152] = var5;
                        this.field357[this.field152] = var6;
                        ++this.field152;
                    }
                }
                if (var7 == 1) {
                    class36 var11 = this.field133[var8];
                    if (var11.field966.field593 == 1 && (var11.field1206 & 127) == 64 && (var11.field1207 & 127) == 64) {
                        for (int var12 = 0; var12 < this.field134; ++var12) {
                            class36 var15 = this.field133[this.field135[var12]];
                            if (var15 != null && var11 != var15 && var15.field966.field593 == 1 && var11.field1206 == var15.field1206 && var11.field1207 == var15.field1207) {
                                this.method59(var6, var5, var15.field966, this.field135[var12], -539);
                            }
                        }
                        for (int var13 = 0; var13 < this.field459; ++var13) {
                            class29 var14 = this.field458[this.field460[var13]];
                            if (var14 != null && var11.field1206 == var14.field1206 && var11.field1207 == var14.field1207) {
                                this.method153(var14, var6, this.field460[var13], var5, 0);
                            }
                        }
                    }
                    this.method59(var6, var5, var11.field966, var8, -539);
                }
                if (var7 == 0) {
                    class29 var16 = this.field458[var8];
                    if ((var16.field1206 & 127) == 64 && (var16.field1207 & 127) == 64) {
                        for (int var17 = 0; var17 < this.field134; ++var17) {
                            class36 var20 = this.field133[this.field135[var17]];
                            if (var20 != null && var20.field966.field593 == 1 && var16.field1206 == var20.field1206 && var16.field1207 == var20.field1207) {
                                this.method59(var6, var5, var20.field966, this.field135[var17], -539);
                            }
                        }
                        for (int var18 = 0; var18 < this.field459; ++var18) {
                            class29 var19 = this.field458[this.field460[var18]];
                            if (var19 != null && var16 != var19 && var16.field1206 == var19.field1206 && var16.field1207 == var19.field1207) {
                                this.method153(var19, var6, this.field460[var18], var5, 0);
                            }
                        }
                    }
                    this.method153(var16, var6, var8, var5, 0);
                }
                if (var7 == 3) {
                    class42 var21 = this.field538[this.field426][var5][var6];
                    if (var21 != null) {
                        for (class65 var22 = (class65) var21.method377((byte) 8); var22 != null; var22 = (class65) var21.method379(1)) {
                            class3 var23 = class3.method13(var22.field1490);
                            if (this.field147 == 1) {
                                this.field137[this.field152] = "Use " + this.field151 + " with @lre@" + var23.field43;
                                this.field358[this.field152] = 782;
                                this.field359[this.field152] = var22.field1490;
                                this.field356[this.field152] = var5;
                                this.field357[this.field152] = var6;
                                ++this.field152;
                            } else if (this.field474 == 1) {
                                if ((this.field476 & 1) == 1) {
                                    this.field137[this.field152] = this.field477 + " @lre@" + var23.field43;
                                    this.field358[this.field152] = 461;
                                    this.field359[this.field152] = var22.field1490;
                                    this.field356[this.field152] = var5;
                                    this.field357[this.field152] = var6;
                                    ++this.field152;
                                }
                            } else {
                                for (int var24 = 4; var24 >= 0; --var24) {
                                    if (var23.field20 != null && var23.field20[var24] != null) {
                                        this.field137[this.field152] = var23.field20[var24] + " @lre@" + var23.field43;
                                        if (var24 == 0) {
                                            this.field358[this.field152] = 60;
                                        }
                                        if (var24 == 1) {
                                            this.field358[this.field152] = 50;
                                        }
                                        if (var24 == 2) {
                                            this.field358[this.field152] = 814;
                                        }
                                        if (var24 == 3) {
                                            this.field358[this.field152] = 415;
                                        }
                                        if (var24 == 4) {
                                            this.field358[this.field152] = 516;
                                        }
                                        this.field359[this.field152] = var22.field1490;
                                        this.field356[this.field152] = var5;
                                        this.field357[this.field152] = var6;
                                        ++this.field152;
                                    } else if (var24 == 2) {
                                        this.field137[this.field152] = "Take @lre@" + var23.field43;
                                        this.field358[this.field152] = 814;
                                        this.field359[this.field152] = var22.field1490;
                                        this.field356[this.field152] = var5;
                                        this.field357[this.field152] = var6;
                                        ++this.field152;
                                    }
                                }
                                this.field137[this.field152] = "Examine @lre@" + var23.field43;
                                this.field358[this.field152] = 1566;
                                this.field359[this.field152] = var22.field1490;
                                this.field356[this.field152] = var5;
                                this.field357[this.field152] = var6;
                                ++this.field152;
                            }
                        }
                    }
                }
            }
        }
        if (arg0 >= 0) {
            ;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(B)V")
    public final void method63(byte arg0) {
        if (!this.field241 && !this.field509 && !this.field119) {
            ++field369;
            if (!this.field106) {
                this.method125(false);
            } else {
                this.method155(0);
            }
            this.method121(-200);
            if (arg0 != -35) {
                field233 = 68;
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(LTDQUELMV;I)Z")
    public final boolean method64(class52 arg0, int arg1) {
        if (arg1 >= 3 && arg1 <= 3) {
            int var3 = arg0.field1262;
            if (this.field326 == 2) {
                if (var3 == 201) {
                    this.field401 = true;
                    this.field153 = 0;
                    this.field257 = true;
                    this.field83 = "";
                    this.field79 = 1;
                    this.field120 = "Enter name of friend to add to list";
                }
                if (var3 == 202) {
                    this.field401 = true;
                    this.field153 = 0;
                    this.field257 = true;
                    this.field83 = "";
                    this.field79 = 2;
                    this.field120 = "Enter name of friend to delete from list";
                }
            }
            if (var3 == 205) {
                this.field492 = 250;
                return true;
            } else {
                if (var3 == 501) {
                    this.field401 = true;
                    this.field153 = 0;
                    this.field257 = true;
                    this.field83 = "";
                    this.field79 = 4;
                    this.field120 = "Enter name of player to add to list";
                }
                if (var3 == 502) {
                    this.field401 = true;
                    this.field153 = 0;
                    this.field257 = true;
                    this.field83 = "";
                    this.field79 = 5;
                    this.field120 = "Enter name of player to delete from list";
                }
                if (var3 >= 300 && var3 <= 313) {
                    int var4 = (var3 - 300) / 2;
                    int var5 = var3 & 1;
                    int var6 = this.field295[var4];
                    if (var6 != -1) {
                        while (true) {
                            if (var5 == 0) {
                                --var6;
                                if (var6 < 0) {
                                    var6 = class30.field880 - 1;
                                }
                            }
                            if (var5 == 1) {
                                ++var6;
                                if (var6 >= class30.field880) {
                                    var6 = 0;
                                }
                            }
                            if (!class30.field881[var6].field887 && class30.field881[var6].field882 == var4 + (this.field452 ? 0 : 7)) {
                                this.field295[var4] = var6;
                                this.field247 = true;
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
                            var9 = field189[var7].length - 1;
                        }
                    }
                    if (var8 == 1) {
                        ++var9;
                        if (var9 >= field189[var7].length) {
                            var9 = 0;
                        }
                    }
                    this.field544[var7] = var9;
                    this.field247 = true;
                }
                if (var3 == 324 && !this.field452) {
                    this.field452 = true;
                    this.method100((byte) 71);
                }
                if (var3 == 325 && this.field452) {
                    this.field452 = false;
                    this.method100((byte) 71);
                }
                if (var3 != 326) {
                    if (var3 == 613) {
                        this.field354 = !this.field354;
                    }
                    if (var3 >= 601 && var3 <= 612) {
                        this.method128(true);
                        if (this.field187.length() > 0) {
                            this.field310.method314(43776, 129);
                            this.field310.method321((byte) 73, class39.method367(this.field187));
                            this.field310.method315(var3 - 601);
                            this.field310.method315(this.field354 ? 1 : 0);
                        }
                    }
                    return false;
                } else {
                    this.field310.method314(43776, 203);
                    this.field310.method315(this.field452 ? 0 : 1);
                    for (int var10 = 0; var10 < 7; ++var10) {
                        this.field310.method315(this.field295[var10]);
                    }
                    for (int var11 = 0; var11 < 5; ++var11) {
                        this.field310.method315(this.field544[var11]);
                    }
                    return true;
                }
            }
        } else {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LMQZHAILV;IILKWSXZIVG;I)V")
    private final void method65(class33 arg0, int arg1, int arg2, class29 arg3, int arg4) {
        this.field488 += arg1;
        if ((arg4 & 256) != 0) {
            arg3.field1214 = arg0.method325();
            arg3.field1216 = arg0.method325();
            arg3.field1215 = arg0.method325();
            arg3.field1217 = arg0.method344(-854);
            arg3.field1218 = arg0.method352((byte) 117) + field369;
            arg3.field1219 = arg0.method352((byte) 117) + field369;
            arg3.field1220 = arg0.method344(-854);
            arg3.method478((byte) 5);
        }
        if ((arg4 & 32) != 0) {
            int var6 = arg0.method354((byte) -59);
            int var7 = arg0.method325();
            int var8 = arg0.method344(-854);
            int var9 = arg0.field945;
            if (arg3.field849 != null && arg3.field851) {
                long var10 = class39.method367(arg3.field849);
                boolean var12 = false;
                if (var7 <= 1) {
                    for (int var13 = 0; var13 < this.field105; ++var13) {
                        if (this.field170[var13] == var10) {
                            var12 = true;
                            break;
                        }
                    }
                }
                if (!var12 && this.field514 == 0) {
                    try {
                        this.field132.field945 = 0;
                        arg0.method362(526, this.field132.field944, 0, var8);
                        this.field132.field945 = 0;
                        String var14 = class16.method230(-838, var8, this.field132);
                        String var15 = class11.method193(var14, -643);
                        arg3.field1221 = var15;
                        arg3.field1244 = var6 >> 8;
                        arg3.field1222 = var6 & 255;
                        arg3.field1249 = 150;
                        if (var7 != 2 && var7 != 3) {
                            if (var7 == 1) {
                                this.method25(0, "@cr1@" + arg3.field849, 1, var15);
                            } else {
                                this.method25(0, arg3.field849, 2, var15);
                            }
                        } else {
                            this.method25(0, "@cr2@" + arg3.field849, 1, var15);
                        }
                    } catch (Exception var28) {
                        signlink.reporterror("cde2");
                    }
                }
            }
            arg0.field945 = var8 + var9;
        }
        if ((arg4 & 64) != 0) {
            int var17 = arg0.method346(false);
            int var18 = arg0.method345(219);
            arg3.method477(field369, var17, var18, this.field162);
            arg3.field1252 = field369 + 300;
            arg3.field1253 = arg0.method344(-854);
            arg3.field1254 = arg0.method345(219);
        }
        if ((arg4 & 4) != 0) {
            arg3.field1221 = arg0.method332();
            if (arg3.field1221.charAt(0) == '~') {
                arg3.field1221 = arg3.field1221.substring(1);
                this.method25(0, arg3.field849, 2, arg3.field1221);
            } else if (field144 == arg3) {
                this.method25(0, arg3.field849, 2, arg3.field1221);
            }
            arg3.field1244 = 0;
            arg3.field1222 = 0;
            arg3.field1249 = 150;
        }
        if ((arg4 & 2) != 0) {
            arg3.field1232 = arg0.method327();
            arg3.field1233 = arg0.method352((byte) 117);
        }
        if ((arg4 & 512) != 0) {
            int var19 = arg0.method346(false);
            int var20 = arg0.method346(false);
            arg3.method477(field369, var19, var20, this.field162);
            arg3.field1252 = field369 + 300;
            arg3.field1253 = arg0.method346(false);
            arg3.field1254 = arg0.method344(-854);
        }
        if ((arg4 & 1) != 0) {
            int var21 = arg0.method345(219);
            byte[] var22 = new byte[var21];
            class33 var23 = new class33(true, var22);
            arg0.method334(0, var21, var22, -162);
            this.field463[arg2] = var23;
            arg3.method270((byte) 4, var23);
        }
        if ((arg4 & 8) != 0) {
            int var24 = arg0.method354((byte) -59);
            if (var24 == 65535) {
                var24 = -1;
            }
            int var25 = arg0.method346(false);
            if (arg3.field1234 == var24 && var24 != -1) {
                int var26 = class22.field761[var24].field775;
                if (var26 == 1) {
                    arg3.field1235 = 0;
                    arg3.field1236 = 0;
                    arg3.field1237 = var25;
                    arg3.field1238 = 0;
                }
                if (var26 == 2) {
                    arg3.field1238 = 0;
                }
            } else if (var24 == -1 || arg3.field1234 == -1 || class22.field761[var24].field769 >= class22.field761[arg3.field1234].field769) {
                arg3.field1234 = var24;
                arg3.field1235 = 0;
                arg3.field1236 = 0;
                arg3.field1237 = var25;
                arg3.field1238 = 0;
                arg3.field1231 = arg3.field1241;
            }
        }
        if ((arg4 & 1024) != 0) {
            arg3.field1200 = arg0.method354((byte) -59);
            int var27 = arg0.method361((byte) 47);
            arg3.field1204 = var27 >> 16;
            arg3.field1203 = (var27 & 65535) + field369;
            arg3.field1201 = 0;
            arg3.field1202 = 0;
            if (arg3.field1203 > field369) {
                arg3.field1201 = -1;
            }
            if (arg3.field1200 == 65535) {
                arg3.field1200 = -1;
            }
        }
        if ((arg4 & 128) != 0) {
            arg3.field1213 = arg0.method353(0);
            if (arg3.field1213 == 65535) {
                arg3.field1213 = -1;
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "q", descriptor = "(I)V")
    public final void method66(int arg0) {
        if (this.field199 == 0) {
            this.field137[0] = "Cancel";
            this.field358[0] = 1113;
            this.field152 = 1;
            this.method91(-472);
            this.field239 = 0;
            if (super.field1658 > 4 && super.field1659 > 4 && super.field1658 < 516 && super.field1659 < 338) {
                if (this.field347 != -1) {
                    this.method103(class52.field1258[this.field347], 4, super.field1659, false, 0, 4, super.field1658);
                } else {
                    this.method62(-301);
                }
            }
            if (this.field486 != this.field239) {
                this.field486 = this.field239;
            }
            this.field239 = 0;
            if (super.field1658 > 553 && super.field1659 > 205 && super.field1658 < 743 && super.field1659 < 466) {
                if (this.field541 != -1) {
                    this.method103(class52.field1258[this.field541], 553, super.field1659, false, 0, 205, super.field1658);
                } else if (this.field255[this.field234] != -1) {
                    this.method103(class52.field1258[this.field255[this.field234]], 553, super.field1659, false, 0, 205, super.field1658);
                }
            }
            if (this.field382 != this.field239) {
                this.field438 = true;
                this.field382 = this.field239;
            }
            this.field239 = 0;
            int var2 = 57 / arg0;
            if (super.field1658 > 17 && super.field1659 > 357 && super.field1658 < 496 && super.field1659 < 453) {
                if (this.field301 != -1) {
                    this.method103(class52.field1258[this.field301], 17, super.field1659, false, 0, 357, super.field1658);
                } else if (super.field1659 < 434 && super.field1658 < 426) {
                    this.method37(super.field1658 - 17, (byte) 2, super.field1659 - 357);
                }
            }
            if (this.field301 != -1 && this.field393 != this.field239) {
                this.field401 = true;
                this.field393 = this.field239;
            }
            boolean var3 = false;
            while (!var3) {
                var3 = true;
                for (int var4 = 0; var4 < this.field152 - 1; ++var4) {
                    if (this.field358[var4] < 1000 && this.field358[var4 + 1] > 1000) {
                        String var5 = this.field137[var4];
                        this.field137[var4] = this.field137[var4 + 1];
                        this.field137[var4 + 1] = var5;
                        int var6 = this.field358[var4];
                        this.field358[var4] = this.field358[var4 + 1];
                        this.field358[var4 + 1] = var6;
                        int var7 = this.field356[var4];
                        this.field356[var4] = this.field356[var4 + 1];
                        this.field356[var4 + 1] = var7;
                        int var8 = this.field357[var4];
                        this.field357[var4] = this.field357[var4 + 1];
                        this.field357[var4 + 1] = var8;
                        int var9 = this.field359[var4];
                        this.field359[var4] = this.field359[var4 + 1];
                        this.field359[var4 + 1] = var9;
                        var3 = false;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(BI)Ljava/lang/String;")
    private static final String method67(byte arg0, int arg1) {
        if (arg0 != 110) {
            throw new NullPointerException();
        } else {
            String var2 = String.valueOf(arg1);
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
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(B)V")
    public final void method68(byte arg0) {
        if (this.field160 == null) {
            this.method131(this.field236);
            super.field1651 = null;
            this.field171 = null;
            this.field172 = null;
            this.field173 = null;
            this.field174 = null;
            this.field175 = null;
            this.field176 = null;
            this.field177 = null;
            this.field178 = null;
            this.field179 = null;
            this.field160 = new class7(479, -158, 96, this.method42(1));
            this.field158 = new class7(172, -158, 156, this.method42(1));
            class23.method256(this.field116);
            this.field109.method246(0, 0, 2);
            this.field157 = new class7(190, -158, 261, this.method42(1));
            this.field159 = new class7(512, -158, 334, this.method42(1));
            if (arg0 == 63) {
                class23.method256(this.field116);
                this.field89 = new class7(496, -158, 50, this.method42(1));
                this.field90 = new class7(269, -158, 37, this.method42(1));
                this.field91 = new class7(249, -158, 45, this.method42(1));
                this.field273 = true;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LMQZHAILV;ZI)V")
    private final void method69(class33 arg0, boolean arg1, int arg2) {
        arg0.method335(141);
        int var4 = arg0.method336(-29762, 8);
        if (var4 < this.field134) {
            for (int var5 = var4; var5 < this.field134; ++var5) {
                this.field288[this.field287++] = this.field135[var5];
            }
        }
        if (var4 > this.field134) {
            signlink.reporterror(this.field363 + " Too many npcs");
            throw new RuntimeException("eek");
        } else {
            this.field134 = 0;
            this.field106 &= arg1;
            for (int var6 = 0; var6 < var4; ++var6) {
                int var7 = this.field135[var6];
                class36 var8 = this.field133[var7];
                int var9 = arg0.method336(-29762, 1);
                if (var9 == 0) {
                    this.field135[this.field134++] = var7;
                    var8.field1209 = field369;
                } else {
                    int var10 = arg0.method336(-29762, 2);
                    if (var10 == 0) {
                        this.field135[this.field134++] = var7;
                        var8.field1209 = field369;
                        this.field462[this.field461++] = var7;
                    } else if (var10 == 1) {
                        this.field135[this.field134++] = var7;
                        var8.field1209 = field369;
                        int var11 = arg0.method336(-29762, 3);
                        var8.method479(6, false, var11);
                        int var12 = arg0.method336(-29762, 1);
                        if (var12 == 1) {
                            this.field462[this.field461++] = var7;
                        }
                    } else if (var10 == 2) {
                        this.field135[this.field134++] = var7;
                        var8.field1209 = field369;
                        int var13 = arg0.method336(-29762, 3);
                        var8.method479(6, true, var13);
                        int var14 = arg0.method336(-29762, 3);
                        var8.method479(6, true, var14);
                        int var15 = arg0.method336(-29762, 1);
                        if (var15 == 1) {
                            this.field462[this.field461++] = var7;
                        }
                    } else if (var10 == 3) {
                        this.field288[this.field287++] = var7;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "()V")
    public final void method70() {
        this.method87("Starting up", 20, (byte) 9);
        if (signlink.sunjava) {
            super.field1644 = 5;
        }
        if (field525) {
            this.field241 = true;
        } else {
            field525 = true;
            boolean var1 = false;
            String var2 = this.method115(field233);
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
                this.field119 = true;
            } else {
                if (signlink.cache_dat != null) {
                    for (int var3 = 0; var3 < 5; ++var3) {
                        this.field539[var3] = new class66(signlink.cache_idx[var3], var3 + 1, (byte) 8, 500000, signlink.cache_dat);
                    }
                }
                try {
                    this.method90(-11);
                    this.field391 = this.method30(0, this.field290[1], "title", 25, "title screen", 1);
                    this.field296 = new class47("p11_full", false, this.field391, 0);
                    this.field297 = new class47("p12_full", false, this.field391, 0);
                    this.field298 = new class47("b12_full", false, this.field391, 0);
                    this.field299 = new class47("q8_full", true, this.field391, 0);
                    this.method156(true);
                    this.method140(false);
                    class8 var4 = this.method30(0, this.field290[2], "config", 30, "config", 2);
                    class8 var5 = this.method30(0, this.field290[3], "interface", 35, "interface", 3);
                    class8 var6 = this.method30(0, this.field290[4], "media", 40, "2d graphics", 4);
                    class8 var7 = this.method30(0, this.field290[6], "textures", 45, "textures", 6);
                    class8 var8 = this.method30(0, this.field290[7], "wordenc", 50, "chat system", 7);
                    class8 var9 = this.method30(0, this.field290[8], "sounds", 55, "sound effects", 8);
                    this.field517 = new byte[4][104][104];
                    this.field434 = new int[4][105][105];
                    this.field243 = new class46(104, this.field434, false, 4, 104);
                    for (int var10 = 0; var10 < 4; ++var10) {
                        this.field238[var10] = new class32(104, 104, 0);
                    }
                    this.field350 = new class55(512, 512);
                    class8 var11 = this.method30(0, this.field290[5], "versionlist", 60, "update list", 5);
                    this.method87("Connecting to update server", 60, (byte) 9);
                    this.field329 = new class67();
                    this.field329.method536(var11, this);
                    class60.method509(this.field329.method543(false));
                    class70.method548(this.field329.method535(0, 21089), this.field329);
                    if (!field376) {
                        this.field117 = 0;
                        try {
                            this.field117 = Integer.parseInt(this.getParameter("music"));
                        } catch (Exception var70) {
                        }
                        this.field118 = true;
                        this.field329.method533(2, this.field117);
                        while (this.field329.method541() > 0) {
                            this.method121(-200);
                            try {
                                Thread.sleep(100L);
                            } catch (Exception var69) {
                            }
                            if (this.field329.field1522 > 3) {
                                this.method53("ondemand");
                                return;
                            }
                        }
                    }
                    this.method87("Requesting animations", 65, (byte) 9);
                    int var12 = this.field329.method535(1, 21089);
                    for (int var13 = 0; var13 < var12; ++var13) {
                        this.field329.method533(1, var13);
                    }
                    while (this.field329.method541() > 0) {
                        int var14 = var12 - this.field329.method541();
                        if (var14 > 0) {
                            this.method87("Loading animations - " + var14 * 100 / var12 + "%", 65, (byte) 9);
                        }
                        this.method121(-200);
                        try {
                            Thread.sleep(100L);
                        } catch (Exception var68) {
                        }
                        if (this.field329.field1522 > 3) {
                            this.method53("ondemand");
                            return;
                        }
                    }
                    this.method87("Requesting models", 70, (byte) 9);
                    int var15 = this.field329.method535(0, 21089);
                    for (int var16 = 0; var16 < var15; ++var16) {
                        int var17 = this.field329.method540(var16, 1);
                        if ((var17 & 1) != 0) {
                            this.field329.method533(0, var16);
                        }
                    }
                    int var18 = this.field329.method541();
                    while (this.field329.method541() > 0) {
                        int var19 = var18 - this.field329.method541();
                        if (var19 > 0) {
                            this.method87("Loading models - " + var19 * 100 / var18 + "%", 70, (byte) 9);
                        }
                        this.method121(-200);
                        try {
                            Thread.sleep(100L);
                        } catch (Exception var67) {
                        }
                    }
                    if (this.field539[0] != null) {
                        this.method87("Requesting maps", 75, (byte) 9);
                        this.field329.method533(3, this.field329.method531(47, 0, 48, (byte) -34));
                        this.field329.method533(3, this.field329.method531(47, 1, 48, (byte) -34));
                        this.field329.method533(3, this.field329.method531(48, 0, 48, (byte) -34));
                        this.field329.method533(3, this.field329.method531(48, 1, 48, (byte) -34));
                        this.field329.method533(3, this.field329.method531(49, 0, 48, (byte) -34));
                        this.field329.method533(3, this.field329.method531(49, 1, 48, (byte) -34));
                        this.field329.method533(3, this.field329.method531(47, 0, 47, (byte) -34));
                        this.field329.method533(3, this.field329.method531(47, 1, 47, (byte) -34));
                        this.field329.method533(3, this.field329.method531(48, 0, 47, (byte) -34));
                        this.field329.method533(3, this.field329.method531(48, 1, 47, (byte) -34));
                        this.field329.method533(3, this.field329.method531(48, 0, 148, (byte) -34));
                        this.field329.method533(3, this.field329.method531(48, 1, 148, (byte) -34));
                        int var20 = this.field329.method541();
                        while (this.field329.method541() > 0) {
                            int var21 = var20 - this.field329.method541();
                            if (var21 > 0) {
                                this.method87("Loading maps - " + var21 * 100 / var20 + "%", 75, (byte) 9);
                            }
                            this.method121(-200);
                            try {
                                Thread.sleep(100L);
                            } catch (Exception var66) {
                            }
                        }
                    }
                    int var22 = this.field329.method535(0, 21089);
                    for (int var23 = 0; var23 < var22; ++var23) {
                        int var24 = this.field329.method540(var23, 1);
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
                            this.field329.method525(var23, var25, 0, (byte) 49);
                        }
                    }
                    this.field329.method526(0, field375);
                    if (!field376) {
                        int var26 = this.field329.method535(2, 21089);
                        for (int var27 = 1; var27 < var26; ++var27) {
                            if (this.field329.method528(var27, false)) {
                                this.field329.method525(var27, (byte) 1, 2, (byte) 49);
                            }
                        }
                    }
                    this.method87("Unpacking media", 80, (byte) 9);
                    this.field108 = new class20(var6, "invback", 0);
                    this.field110 = new class20(var6, "chatback", 0);
                    this.field109 = new class20(var6, "mapback", 0);
                    this.field471 = new class20(var6, "backbase1", 0);
                    this.field472 = new class20(var6, "backbase2", 0);
                    this.field473 = new class20(var6, "backhmid1", 0);
                    for (int var28 = 0; var28 < 13; ++var28) {
                        this.field513[var28] = new class20(var6, "sideicons", var28);
                    }
                    this.field279 = new class55(var6, "compass", 0);
                    this.field300 = new class55(var6, "mapedge", 0);
                    this.field300.method495(997);
                    try {
                        for (int var29 = 0; var29 < 100; ++var29) {
                            this.field392[var29] = new class20(var6, "mapscene", var29);
                        }
                    } catch (Exception var74) {
                    }
                    try {
                        for (int var30 = 0; var30 < 100; ++var30) {
                            this.field412[var30] = new class55(var6, "mapfunction", var30);
                        }
                    } catch (Exception var73) {
                    }
                    try {
                        for (int var31 = 0; var31 < 20; ++var31) {
                            this.field99[var31] = new class55(var6, "hitmarks", var31);
                        }
                    } catch (Exception var72) {
                    }
                    try {
                        for (int var32 = 0; var32 < 20; ++var32) {
                            this.field409[var32] = new class55(var6, "headicons", var32);
                        }
                    } catch (Exception var71) {
                    }
                    this.field86 = new class55(var6, "mapmarker", 0);
                    this.field87 = new class55(var6, "mapmarker", 1);
                    for (int var33 = 0; var33 < 8; ++var33) {
                        this.field256[var33] = new class55(var6, "cross", var33);
                    }
                    this.field527 = new class55(var6, "mapdots", 0);
                    this.field528 = new class55(var6, "mapdots", 1);
                    this.field529 = new class55(var6, "mapdots", 2);
                    this.field530 = new class55(var6, "mapdots", 3);
                    this.field531 = new class55(var6, "mapdots", 4);
                    this.field446 = new class20(var6, "scrollbar", 0);
                    this.field447 = new class20(var6, "scrollbar", 1);
                    this.field334 = new class20(var6, "redstone1", 0);
                    this.field335 = new class20(var6, "redstone2", 0);
                    this.field336 = new class20(var6, "redstone3", 0);
                    this.field337 = new class20(var6, "redstone1", 0);
                    this.field337.method243(1);
                    this.field338 = new class20(var6, "redstone2", 0);
                    this.field338.method243(1);
                    this.field164 = new class20(var6, "redstone1", 0);
                    this.field164.method244((byte) 85);
                    this.field165 = new class20(var6, "redstone2", 0);
                    this.field165.method244((byte) 85);
                    this.field166 = new class20(var6, "redstone3", 0);
                    this.field166.method244((byte) 85);
                    this.field167 = new class20(var6, "redstone1", 0);
                    this.field167.method243(1);
                    this.field167.method244((byte) 85);
                    this.field168 = new class20(var6, "redstone2", 0);
                    this.field168.method243(1);
                    this.field168.method244((byte) 85);
                    for (int var34 = 0; var34 < 2; ++var34) {
                        this.field253[var34] = new class20(var6, "mod_icons", var34);
                    }
                    class55 var35 = new class55(var6, "backleft1", 0);
                    this.field311 = new class7(var35.field1345, -158, var35.field1346, this.method42(1));
                    var35.method496(0, 0, true);
                    class55 var36 = new class55(var6, "backleft2", 0);
                    this.field312 = new class7(var36.field1345, -158, var36.field1346, this.method42(1));
                    var36.method496(0, 0, true);
                    class55 var37 = new class55(var6, "backright1", 0);
                    this.field313 = new class7(var37.field1345, -158, var37.field1346, this.method42(1));
                    var37.method496(0, 0, true);
                    class55 var38 = new class55(var6, "backright2", 0);
                    this.field314 = new class7(var38.field1345, -158, var38.field1346, this.method42(1));
                    var38.method496(0, 0, true);
                    class55 var39 = new class55(var6, "backtop1", 0);
                    this.field315 = new class7(var39.field1345, -158, var39.field1346, this.method42(1));
                    var39.method496(0, 0, true);
                    class55 var40 = new class55(var6, "backvmid1", 0);
                    this.field316 = new class7(var40.field1345, -158, var40.field1346, this.method42(1));
                    var40.method496(0, 0, true);
                    class55 var41 = new class55(var6, "backvmid2", 0);
                    this.field317 = new class7(var41.field1345, -158, var41.field1346, this.method42(1));
                    var41.method496(0, 0, true);
                    class55 var42 = new class55(var6, "backvmid3", 0);
                    this.field318 = new class7(var42.field1345, -158, var42.field1346, this.method42(1));
                    var42.method496(0, 0, true);
                    class55 var43 = new class55(var6, "backhmid2", 0);
                    this.field319 = new class7(var43.field1345, -158, var43.field1346, this.method42(1));
                    var43.method496(0, 0, true);
                    int var44 = (int) (Math.random() * 21.0D) - 10;
                    int var45 = (int) (Math.random() * 21.0D) - 10;
                    int var46 = (int) (Math.random() * 21.0D) - 10;
                    int var47 = (int) (Math.random() * 41.0D) - 20;
                    for (int var48 = 0; var48 < 100; ++var48) {
                        if (this.field412[var48] != null) {
                            this.field412[var48].method494(var46 + var47, var44 + var47, var45 + var47, (byte) -65);
                        }
                        if (this.field392[var48] != null) {
                            this.field392[var48].method245(var46 + var47, var44 + var47, var45 + var47, (byte) -65);
                        }
                    }
                    this.method87("Unpacking textures", 83, (byte) 9);
                    class44.method390(var7, 0);
                    class44.method394(0.8D, 0);
                    class44.method389(20, true);
                    this.method87("Unpacking config", 86, (byte) 9);
                    class22.method250(var4, (byte) 51);
                    class72.method590(var4);
                    class2.method3(var4, (byte) 51);
                    class3.method7(var4);
                    class6.method168(var4);
                    class30.method274(var4, (byte) 51);
                    class37.method364(var4, (byte) 51);
                    class4.method162(var4, (byte) 51);
                    class9.method177(var4, (byte) 51);
                    class3.field22 = field375;
                    if (!field376) {
                        this.method87("Unpacking sounds", 90, (byte) 9);
                        byte[] var49 = var9.method176("sounds.dat", (byte[]) null);
                        class33 var50 = new class33(true, var49);
                        class13.method224(var50, (byte) 51);
                    }
                    this.method87("Unpacking interfaces", 95, (byte) 9);
                    class47[] var51 = new class47[] { this.field296, this.field297, this.field298, this.field299 };
                    class52.method489(var51, true, var6, var5);
                    this.method87("Preparing game engine", 100, (byte) 9);
                    for (int var52 = 0; var52 < 33; ++var52) {
                        int var53 = 999;
                        int var54 = 0;
                        for (int var55 = 0; var55 < 34; ++var55) {
                            if (this.field109.field746[this.field109.field748 * var52 + var55] == 0) {
                                if (var53 == 999) {
                                    var53 = var55;
                                }
                            } else if (var53 != 999) {
                                var54 = var55;
                                break;
                            }
                        }
                        this.field244[var52] = var53;
                        this.field180[var52] = var54 - var53;
                    }
                    for (int var56 = 5; var56 < 156; ++var56) {
                        int var57 = 999;
                        int var58 = 0;
                        for (int var59 = 25; var59 < 172; ++var59) {
                            if (this.field109.field746[this.field109.field748 * var56 + var59] == 0 && (var59 > 34 || var56 > 34)) {
                                if (var57 == 999) {
                                    var57 = var59;
                                }
                            } else if (var57 != 999) {
                                var58 = var59;
                                break;
                            }
                        }
                        this.field291[var56 - 5] = var57 - 25;
                        this.field77[var56 - 5] = var58 - var57;
                    }
                    class44.method387(479, 96, (byte) 5);
                    this.field344 = class44.field1060;
                    class44.method387(190, 261, (byte) 5);
                    this.field345 = class44.field1060;
                    class44.method387(512, 334, (byte) 5);
                    this.field346 = class44.field1060;
                    int[] var60 = new int[9];
                    for (int var61 = 0; var61 < 9; ++var61) {
                        int var62 = var61 * 32 + 128 + 15;
                        int var63 = var62 * 3 + 600;
                        int var64 = class44.field1058[var62];
                        var60[var61] = var63 * var64 >> 16;
                    }
                    class46.method442(512, 0, 500, 800, var60, 334);
                    class11.method183(var8);
                    this.field138 = new class57(this, field417);
                    this.method97(this.field138, 10);
                    class58.field1385 = this;
                    class72.field1685 = this;
                    class6.field578 = this;
                } catch (Exception var75) {
                    signlink.reporterror("loaderror " + this.field245 + " " + this.field332);
                    this.field509 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "r", descriptor = "(I)V")
    public final void method71(int arg0) {
        this.field205 = 0;
        for (int var2 = -1; var2 < this.field459 + this.field134; ++var2) {
            class50 var19;
            if (var2 == -1) {
                var19 = field144;
            } else if (var2 < this.field459) {
                var19 = this.field458[this.field460[var2]];
            } else {
                var19 = this.field133[this.field135[var2 - this.field459]];
            }
            if (var19 != null && var19.method273(0)) {
                if (var19 instanceof class36) {
                    class6 var20 = ((class36) var19).field966;
                    if (var20.field583 != null) {
                        var20 = var20.method167(0);
                    }
                    if (var20 == null) {
                        continue;
                    }
                }
                if (var2 >= this.field459) {
                    class6 var24 = ((class36) var19).field966;
                    if (var24.field577 >= 0 && var24.field577 < this.field409.length) {
                        this.method88(var19.field1251 + 15, false, var19);
                        if (this.field114 > -1) {
                            this.field409[var24.field577].method498(this.field114 - 12, this.field115 - 30, 2);
                        }
                    }
                    if (this.field226 == 1 && this.field135[var2 - this.field459] == this.field75 && field369 % 20 < 10) {
                        this.method88(var19.field1251 + 15, false, var19);
                        if (this.field114 > -1) {
                            this.field409[2].method498(this.field114 - 12, this.field115 - 28, 2);
                        }
                    }
                } else {
                    int var21 = 30;
                    class29 var22 = (class29) var19;
                    if (var22.field870 != 0) {
                        this.method88(var19.field1251 + 15, false, var19);
                        if (this.field114 > -1) {
                            for (int var23 = 0; var23 < 8; ++var23) {
                                if ((var22.field870 & 1 << var23) != 0) {
                                    this.field409[var23].method498(this.field114 - 12, this.field115 - var21, 2);
                                    var21 -= 25;
                                }
                            }
                        }
                    }
                    if (var2 >= 0 && this.field226 == 10 && this.field460[var2] == this.field396) {
                        this.method88(var19.field1251 + 15, false, var19);
                        if (this.field114 > -1) {
                            this.field409[7].method498(this.field114 - 12, this.field115 - var21, 2);
                        }
                    }
                }
                if (var19.field1221 != null && (var2 >= this.field459 || this.field511 == 0 || this.field511 == 3 || this.field511 == 1 && this.method43(((class29) var19).field849, false))) {
                    this.method88(var19.field1251, false, var19);
                    if (this.field114 > -1 && this.field205 < this.field206) {
                        this.field210[this.field205] = this.field298.method461(var19.field1221, 7) / 2;
                        this.field209[this.field205] = this.field298.field1162;
                        this.field207[this.field205] = this.field114;
                        this.field208[this.field205] = this.field115;
                        this.field211[this.field205] = var19.field1244;
                        this.field212[this.field205] = var19.field1222;
                        this.field213[this.field205] = var19.field1249;
                        this.field214[this.field205++] = var19.field1221;
                        if (this.field101 == 0 && var19.field1222 >= 1 && var19.field1222 <= 3) {
                            this.field209[this.field205] += 10;
                            this.field208[this.field205] += 5;
                        }
                        if (this.field101 == 0 && var19.field1222 == 4) {
                            this.field210[this.field205] = 60;
                        }
                        if (this.field101 == 0 && var19.field1222 == 5) {
                            this.field209[this.field205] += 5;
                        }
                    }
                }
                if (var19.field1252 > field369) {
                    this.method88(var19.field1251 + 15, false, var19);
                    if (this.field114 > -1) {
                        int var25 = var19.field1253 * 30 / var19.field1254;
                        if (var25 > 30) {
                            var25 = 30;
                        }
                        class23.method258(var25, (byte) -33, this.field114 - 15, 65280, this.field115 - 3, 5);
                        class23.method258(30 - var25, (byte) -33, this.field114 - 15 + var25, 16711680, this.field115 - 3, 5);
                    }
                }
                for (int var26 = 0; var26 < 4; ++var26) {
                    if (var19.field1212[var26] > field369) {
                        this.method88(var19.field1251 / 2, false, var19);
                        if (this.field114 > -1) {
                            if (var26 == 1) {
                                this.field115 -= 20;
                            }
                            if (var26 == 2) {
                                this.field114 -= 15;
                                this.field115 -= 10;
                            }
                            if (var26 == 3) {
                                this.field114 += 15;
                                this.field115 -= 10;
                            }
                            this.field99[var19.field1211[var26]].method498(this.field114 - 12, this.field115 - 12, 2);
                            this.field296.method458(this.field115 + 4, 0, this.field114, String.valueOf(var19.field1210[var26]), 0);
                            this.field296.method458(this.field115 + 3, 16777215, this.field114 - 1, String.valueOf(var19.field1210[var26]), 0);
                        }
                    }
                }
            }
        }
        if (this.field249 != arg0) {
            this.field379 = this.field365.method402();
        }
        for (int var3 = 0; var3 < this.field205; ++var3) {
            int var4 = this.field207[var3];
            int var5 = this.field208[var3];
            int var6 = this.field210[var3];
            int var7 = this.field209[var3];
            boolean var8 = true;
            while (var8) {
                var8 = false;
                for (int var18 = 0; var18 < var3; ++var18) {
                    if (var5 + 2 > this.field208[var18] - this.field209[var18] && var5 - var7 < this.field208[var18] + 2 && var4 - var6 < this.field210[var18] + this.field207[var18] && var4 + var6 > this.field207[var18] - this.field210[var18] && this.field208[var18] - this.field209[var18] < var5) {
                        var5 = this.field208[var18] - this.field209[var18];
                        var8 = true;
                    }
                }
            }
            this.field114 = this.field207[var3];
            this.field115 = this.field208[var3] = var5;
            String var9 = this.field214[var3];
            if (this.field101 == 0) {
                int var10 = 16776960;
                if (this.field211[var3] < 6) {
                    var10 = this.field512[this.field211[var3]];
                }
                if (this.field211[var3] == 6) {
                    var10 = this.field219 % 20 < 10 ? 16711680 : 16776960;
                }
                if (this.field211[var3] == 7) {
                    var10 = this.field219 % 20 < 10 ? 255 : 65535;
                }
                if (this.field211[var3] == 8) {
                    var10 = this.field219 % 20 < 10 ? 45056 : 8454016;
                }
                if (this.field211[var3] == 9) {
                    int var11 = 150 - this.field213[var3];
                    if (var11 < 50) {
                        var10 = var11 * 1280 + 16711680;
                    } else if (var11 < 100) {
                        var10 = 16776960 - (var11 - 50) * 327680;
                    } else if (var11 < 150) {
                        var10 = (var11 - 100) * 5 + 65280;
                    }
                }
                if (this.field211[var3] == 10) {
                    int var12 = 150 - this.field213[var3];
                    if (var12 < 50) {
                        var10 = var12 * 5 + 16711680;
                    } else if (var12 < 100) {
                        var10 = 16711935 - (var12 - 50) * 327680;
                    } else if (var12 < 150) {
                        var10 = (var12 - 100) * 327680 + 255 - (var12 - 100) * 5;
                    }
                }
                if (this.field211[var3] == 11) {
                    int var13 = 150 - this.field213[var3];
                    if (var13 < 50) {
                        var10 = 16777215 - var13 * 327685;
                    } else if (var13 < 100) {
                        var10 = (var13 - 50) * 327685 + 65280;
                    } else if (var13 < 150) {
                        var10 = 16777215 - (var13 - 100) * 327680;
                    }
                }
                if (this.field212[var3] == 0) {
                    this.field298.method458(this.field115 + 1, 0, this.field114, var9, 0);
                    this.field298.method458(this.field115, var10, this.field114, var9, 0);
                }
                if (this.field212[var3] == 1) {
                    this.field298.method463(this.field219, this.field114, 0, var9, this.field115 + 1, -83);
                    this.field298.method463(this.field219, this.field114, var10, var9, this.field115, -83);
                }
                if (this.field212[var3] == 2) {
                    this.field298.method464(this.field115 + 1, this.field114, this.field219, 0, 0, var9);
                    this.field298.method464(this.field115, this.field114, this.field219, var10, 0, var9);
                }
                if (this.field212[var3] == 3) {
                    this.field298.method465(this.field219, -49901, 0, this.field114, this.field115 + 1, var9, 150 - this.field213[var3]);
                    this.field298.method465(this.field219, -49901, var10, this.field114, this.field115, var9, 150 - this.field213[var3]);
                }
                if (this.field212[var3] == 4) {
                    int var14 = this.field298.method461(var9, 7);
                    int var15 = (150 - this.field213[var3]) * (var14 + 100) / 150;
                    class23.method255(334, 0, this.field114 + 50, this.field114 - 50, false);
                    this.field298.method462(0, var9, 0, this.field115 + 1, this.field114 + 50 - var15);
                    this.field298.method462(var10, var9, 0, this.field115, this.field114 + 50 - var15);
                    class23.method254((byte) 3);
                }
                if (this.field212[var3] == 5) {
                    int var16 = 150 - this.field213[var3];
                    int var17 = 0;
                    if (var16 < 25) {
                        var17 = var16 - 25;
                    } else if (var16 > 125) {
                        var17 = var16 - 125;
                    }
                    class23.method255(this.field115 + 5, this.field115 - this.field298.field1162 - 1, 512, 0, false);
                    this.field298.method458(this.field115 + 1 + var17, 0, this.field114, var9, 0);
                    this.field298.method458(this.field115 + var17, var10, this.field114, var9, 0);
                    class23.method254((byte) 3);
                }
            } else {
                this.field298.method458(this.field115 + 1, 0, this.field114, var9, 0);
                this.field298.method458(this.field115, 16776960, this.field114, var9, 0);
            }
        }
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(B)V")
    public final void method72(byte arg0) {
        if (arg0 != 9) {
            this.field489 = this.field254.method325();
        }
        int var2 = this.field298.method460("Choose Option", 5);
        for (int var3 = 0; var3 < this.field152; ++var3) {
            int var11 = this.field298.method460(this.field137[var3], 5);
            if (var11 > var2) {
                var2 = var11;
            }
        }
        var2 += 8;
        int var4 = this.field152 * 15 + 21;
        if (super.field1665 > 4 && super.field1666 > 4 && super.field1665 < 516 && super.field1666 < 338) {
            int var5 = super.field1665 - 4 - var2 / 2;
            if (var2 + var5 > 512) {
                var5 = 512 - var2;
            }
            if (var5 < 0) {
                var5 = 0;
            }
            int var6 = super.field1666 - 4;
            if (var4 + var6 > 334) {
                var6 = 334 - var4;
            }
            if (var6 < 0) {
                var6 = 0;
            }
            this.field74 = true;
            this.field260 = 0;
            this.field261 = var5;
            this.field262 = var6;
            this.field263 = var2;
            this.field264 = this.field152 * 15 + 22;
        }
        if (super.field1665 > 553 && super.field1666 > 205 && super.field1665 < 743 && super.field1666 < 466) {
            int var7 = super.field1665 - 553 - var2 / 2;
            if (var7 < 0) {
                var7 = 0;
            } else if (var2 + var7 > 190) {
                var7 = 190 - var2;
            }
            int var8 = super.field1666 - 205;
            if (var8 < 0) {
                var8 = 0;
            } else if (var4 + var8 > 261) {
                var8 = 261 - var4;
            }
            this.field74 = true;
            this.field260 = 1;
            this.field261 = var7;
            this.field262 = var8;
            this.field263 = var2;
            this.field264 = this.field152 * 15 + 22;
        }
        if (super.field1665 > 17 && super.field1666 > 357 && super.field1665 < 496 && super.field1666 < 453) {
            int var9 = super.field1665 - 17 - var2 / 2;
            if (var9 < 0) {
                var9 = 0;
            } else if (var2 + var9 > 479) {
                var9 = 479 - var2;
            }
            int var10 = super.field1666 - 357;
            if (var10 < 0) {
                var10 = 0;
            } else if (var4 + var10 > 96) {
                var10 = 96 - var4;
            }
            this.field74 = true;
            this.field260 = 2;
            this.field261 = var9;
            this.field262 = var10;
            this.field263 = var2;
            this.field264 = this.field152 * 15 + 22;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZII)V")
    public final void method73(boolean arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            this.method70();
        }
        signlink.midivol = arg1;
        if (arg0) {
            signlink.midi = "voladjust";
        }
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(Z)V")
    private final void method74(boolean arg0) {
        if (!arg0) {
            field233 = 22;
        }
        for (class56 var2 = (class56) this.field129.method376(); var2 != null; var2 = (class56) this.field129.method378(0)) {
            if (var2.field1362 == -1) {
                var2.field1351 = 0;
                this.method49(var2, 36318);
            } else {
                var2.method492();
            }
        }
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(B)V")
    public final void method75(byte arg0) {
        if (arg0 != 121) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        if (field376 && this.field497 == 2 && class31.field907 != this.field426) {
            this.field159.method172(-130);
            this.field297.method458(151, 0, 257, "Loading - please wait.", 0);
            this.field297.method458(150, 16777215, 256, "Loading - please wait.", 0);
            this.field159.method173(super.field1650, false, 4, 4);
            this.field497 = 1;
            this.field515 = System.currentTimeMillis();
        }
        if (this.field497 == 1) {
            int var3 = this.method76(0);
            if (var3 != 0 && System.currentTimeMillis() - this.field515 > 360000L) {
                signlink.reporterror(this.field363 + " glcfb " + this.field76 + "," + var3 + "," + field376 + "," + this.field539[0] + "," + this.field329.method541() + "," + this.field426 + "," + this.field308 + "," + this.field309);
                this.field515 = System.currentTimeMillis();
            }
        }
        if (this.field497 == 2 && this.field426 != this.field424) {
            this.field424 = this.field426;
            this.method104(false, this.field426);
        }
    }

    @OriginalMember(owner = "client", name = "s", descriptor = "(I)I")
    public final int method76(int arg0) {
        for (int var2 = 0; var2 < this.field289.length; ++var2) {
            if (this.field289[var2] == null && this.field449[var2] != -1) {
                return -1;
            }
            if (this.field155[var2] == null && this.field450[var2] != -1) {
                return -2;
            }
        }
        boolean var3 = true;
        this.field488 += arg0;
        for (int var4 = 0; var4 < this.field289.length; ++var4) {
            byte[] var5 = this.field155[var4];
            if (var5 != null) {
                int var6 = (this.field448[var4] >> 8) * 64 - this.field499;
                int var7 = (this.field448[var4] & 255) * 64 - this.field500;
                if (this.field423) {
                    var6 = 10;
                    var7 = 10;
                }
                var3 &= class31.method285(var6, var7, true, var5);
            }
        }
        if (!var3) {
            return -3;
        } else if (this.field84) {
            return -4;
        } else {
            this.field497 = 2;
            class31.field907 = this.field426;
            this.method105(-182);
            this.field310.method314(43776, 47);
            return 0;
        }
    }

    @OriginalMember(owner = "client", name = "h", descriptor = "(B)V")
    public final void method77(byte arg0) {
        this.field157.method172(-130);
        class44.field1060 = this.field345;
        this.field108.method246(0, 0, 2);
        if (arg0 == 9) {
            boolean var2 = false;
        } else {
            field233 = this.field365.method402();
        }
        if (this.field541 != -1) {
            this.method137((byte) 6, 0, 0, class52.field1258[this.field541], 0);
        } else if (this.field255[this.field234] != -1) {
            this.method137((byte) 6, 0, 0, class52.field1258[this.field255[this.field234]], 0);
        }
        if (this.field74 && this.field260 == 1) {
            this.method60(-120);
        }
        this.field157.method173(super.field1650, false, 553, 205);
        this.field159.method172(-130);
        class44.field1060 = this.field346;
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(ZI)V")
    public final void method78(boolean arg0, int arg1) {
        this.method146(-742);
        this.field173.method172(-130);
        this.field96.method246(0, 0, 2);
        short var3 = 360;
        short var4 = 200;
        if (this.field537 == 0) {
            int var5 = var4 / 2 + 80;
            this.field296.method459(this.field329.field1541, 7711145, true, var3 / 2, (byte) -38, var5);
            int var6 = var4 / 2 - 20;
            this.field298.method459("Welcome to RuneScape", 16776960, true, var3 / 2, (byte) -38, var6);
            int var18 = var6 + 30;
            int var7 = var3 / 2 - 80;
            int var8 = var4 / 2 + 20;
            this.field97.method246(var7 - 73, var8 - 20, 2);
            this.field298.method459("New User", 16777215, true, var7, (byte) -38, var8 + 5);
            int var9 = var3 / 2 + 80;
            this.field97.method246(var9 - 73, var8 - 20, 2);
            this.field298.method459("Existing User", 16777215, true, var9, (byte) -38, var8 + 5);
        }
        if (this.field537 == 2) {
            int var10 = var4 / 2 - 40;
            if (this.field139.length() > 0) {
                this.field298.method459(this.field139, 16776960, true, var3 / 2, (byte) -38, var10 - 15);
                this.field298.method459(this.field140, 16776960, true, var3 / 2, (byte) -38, var10);
                var10 += 30;
            } else {
                this.field298.method459(this.field140, 16776960, true, var3 / 2, (byte) -38, var10 - 7);
                var10 += 30;
            }
            this.field298.method466(var10, 8, true, "Username: " + this.field363 + (this.field410 == 0 & field369 % 40 < 20 ? "@yel@|" : ""), var3 / 2 - 90, 16777215);
            var10 += 15;
            this.field298.method466(var10, 8, true, "Password: " + class39.method372(399, this.field364) + (this.field410 == 1 & field369 % 40 < 20 ? "@yel@|" : ""), var3 / 2 - 88, 16777215);
            var10 += 15;
            if (!arg0) {
                int var11 = var3 / 2 - 80;
                int var12 = var4 / 2 + 50;
                this.field97.method246(var11 - 73, var12 - 20, 2);
                this.field298.method459("Login", 16777215, true, var11, (byte) -38, var12 + 5);
                int var13 = var3 / 2 + 80;
                this.field97.method246(var13 - 73, var12 - 20, 2);
                this.field298.method459("Cancel", 16777215, true, var13, (byte) -38, var12 + 5);
            }
        }
        if (this.field537 == 3) {
            this.field298.method459("Create a free account", 16776960, true, var3 / 2, (byte) -38, var4 / 2 - 60);
            int var14 = var4 / 2 - 35;
            this.field298.method459("To create a new account you need to", 16777215, true, var3 / 2, (byte) -38, var14);
            int var19 = var14 + 15;
            this.field298.method459("go back to the main RuneScape webpage", 16777215, true, var3 / 2, (byte) -38, var19);
            int var20 = var19 + 15;
            this.field298.method459("and choose the red 'create account'", 16777215, true, var3 / 2, (byte) -38, var20);
            int var21 = var20 + 15;
            this.field298.method459("button at the top right of that page.", 16777215, true, var3 / 2, (byte) -38, var21);
            int var22 = var21 + 15;
            int var15 = var3 / 2;
            int var16 = var4 / 2 + 50;
            this.field97.method246(var15 - 73, var16 - 20, 2);
            this.field298.method459("Cancel", 16777215, true, var15, (byte) -38, var16 + 5);
        }
        this.field173.method173(super.field1650, false, 202, 171);
        int var17 = 62 / arg1;
        if (this.field273) {
            this.field273 = false;
            this.field171.method173(super.field1650, false, 128, 0);
            this.field172.method173(super.field1650, false, 202, 371);
            this.field176.method173(super.field1650, false, 0, 265);
            this.field177.method173(super.field1650, false, 562, 265);
            this.field178.method173(super.field1650, false, 128, 171);
            this.field179.method173(super.field1650, false, 562, 171);
        }
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(Z)V")
    public final void method79(boolean arg0) {
        if (arg0) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        while (true) {
            int var3;
            do {
                while (true) {
                    var3 = this.method580(4);
                    if (var3 == -1) {
                        return;
                    }
                    if (this.field347 != -1 && this.field428 == this.field347) {
                        if (var3 == 8 && this.field187.length() > 0) {
                            this.field187 = this.field187.substring(0, this.field187.length() - 1);
                        }
                        break;
                    }
                    if (this.field257) {
                        if (var3 >= 32 && var3 <= 122 && this.field83.length() < 80) {
                            this.field83 = this.field83 + (char) var3;
                            this.field401 = true;
                        }
                        if (var3 == 8 && this.field83.length() > 0) {
                            this.field83 = this.field83.substring(0, this.field83.length() - 1);
                            this.field401 = true;
                        }
                        if (var3 == 13 || var3 == 10) {
                            this.field257 = false;
                            this.field401 = true;
                            if (this.field79 == 1) {
                                long var4 = class39.method367(this.field83);
                                this.method106(1123, var4);
                            }
                            if (this.field79 == 2 && this.field325 > 0) {
                                long var6 = class39.method367(this.field83);
                                this.method84(-989, var6);
                            }
                            if (this.field79 == 3 && this.field83.length() > 0) {
                                this.field310.method314(43776, 187);
                                this.field310.method315(0);
                                int var8 = this.field310.field945;
                                this.field310.method321((byte) 73, this.field343);
                                class16.method231(564, this.field83, this.field310);
                                this.field310.method324(this.field310.field945 - var8, false);
                                this.field83 = class16.method232(this.field83, -643);
                                this.field83 = class11.method193(this.field83, -643);
                                this.method25(0, class39.method371(class39.method368((byte) 3, this.field343), (byte) -7), 6, this.field83);
                                if (this.field112 == 2) {
                                    this.field112 = 1;
                                    this.field124 = true;
                                    this.field310.method314(43776, 59);
                                    this.field310.method315(this.field511);
                                    this.field310.method315(this.field112);
                                    this.field310.method315(this.field341);
                                }
                            }
                            if (this.field79 == 4 && this.field105 < 100) {
                                long var9 = class39.method367(this.field83);
                                this.method129(-13110, var9);
                            }
                            if (this.field79 == 5 && this.field105 > 0) {
                                long var11 = class39.method367(this.field83);
                                this.method150(818, var11);
                            }
                        }
                    } else if (this.field153 == 1) {
                        if (var3 >= 48 && var3 <= 57 && this.field431.length() < 10) {
                            this.field431 = this.field431 + (char) var3;
                            this.field401 = true;
                        }
                        if (var3 == 8 && this.field431.length() > 0) {
                            this.field431 = this.field431.substring(0, this.field431.length() - 1);
                            this.field401 = true;
                        }
                        if (var3 == 13 || var3 == 10) {
                            if (this.field431.length() > 0) {
                                int var13 = 0;
                                try {
                                    var13 = Integer.parseInt(this.field431);
                                } catch (Exception var23) {
                                }
                                this.field310.method314(43776, 1);
                                this.field310.method319(var13);
                            }
                            this.field153 = 0;
                            this.field401 = true;
                        }
                    } else if (this.field153 == 2) {
                        if (var3 >= 32 && var3 <= 122 && this.field431.length() < 12) {
                            this.field431 = this.field431 + (char) var3;
                            this.field401 = true;
                        }
                        if (var3 == 8 && this.field431.length() > 0) {
                            this.field431 = this.field431.substring(0, this.field431.length() - 1);
                            this.field401 = true;
                        }
                        if (var3 == 13 || var3 == 10) {
                            if (this.field431.length() > 0) {
                                this.field310.method314(43776, 109);
                                this.field310.method321((byte) 73, class39.method367(this.field431));
                            }
                            this.field153 = 0;
                            this.field401 = true;
                        }
                    } else if (this.field301 == -1) {
                        if (var3 >= 32 && var3 <= 122 && this.field163.length() < 80) {
                            this.field163 = this.field163 + (char) var3;
                            this.field401 = true;
                        }
                        if (var3 == 8 && this.field163.length() > 0) {
                            this.field163 = this.field163.substring(0, this.field163.length() - 1);
                            this.field401 = true;
                        }
                        if ((var3 == 13 || var3 == 10) && this.field163.length() > 0) {
                            if (this.field181 == 2) {
                                if (this.field163.equals("::clientdrop")) {
                                    this.method28(0);
                                }
                                if (this.field163.equals("::lag")) {
                                    this.method41(2);
                                }
                                if (this.field163.equals("::prefetchmusic")) {
                                    for (int var14 = 0; var14 < this.field329.method535(2, 21089); ++var14) {
                                        this.field329.method525(var14, (byte) 1, 2, (byte) 49);
                                    }
                                }
                                if (this.field163.equals("::fpson")) {
                                    field85 = true;
                                }
                                if (this.field163.equals("::fpsoff")) {
                                    field85 = false;
                                }
                                if (this.field163.equals("::noclip")) {
                                    for (int var15 = 0; var15 < 4; ++var15) {
                                        for (int var16 = 1; var16 < 103; ++var16) {
                                            for (int var17 = 1; var17 < 103; ++var17) {
                                                this.field238[var15].field926[var16][var17] = 0;
                                            }
                                        }
                                    }
                                }
                            }
                            if (this.field163.startsWith("::")) {
                                this.field310.method314(43776, 20);
                                this.field310.method315(this.field163.length() - 1);
                                this.field310.method322(this.field163.substring(2));
                            } else {
                                String var18 = this.field163.toLowerCase();
                                byte var19 = 0;
                                if (var18.startsWith("yellow:")) {
                                    var19 = 0;
                                    this.field163 = this.field163.substring(7);
                                } else if (var18.startsWith("red:")) {
                                    var19 = 1;
                                    this.field163 = this.field163.substring(4);
                                } else if (var18.startsWith("green:")) {
                                    var19 = 2;
                                    this.field163 = this.field163.substring(6);
                                } else if (var18.startsWith("cyan:")) {
                                    var19 = 3;
                                    this.field163 = this.field163.substring(5);
                                } else if (var18.startsWith("purple:")) {
                                    var19 = 4;
                                    this.field163 = this.field163.substring(7);
                                } else if (var18.startsWith("white:")) {
                                    var19 = 5;
                                    this.field163 = this.field163.substring(6);
                                } else if (var18.startsWith("flash1:")) {
                                    var19 = 6;
                                    this.field163 = this.field163.substring(7);
                                } else if (var18.startsWith("flash2:")) {
                                    var19 = 7;
                                    this.field163 = this.field163.substring(7);
                                } else if (var18.startsWith("flash3:")) {
                                    var19 = 8;
                                    this.field163 = this.field163.substring(7);
                                } else if (var18.startsWith("glow1:")) {
                                    var19 = 9;
                                    this.field163 = this.field163.substring(6);
                                } else if (var18.startsWith("glow2:")) {
                                    var19 = 10;
                                    this.field163 = this.field163.substring(6);
                                } else if (var18.startsWith("glow3:")) {
                                    var19 = 11;
                                    this.field163 = this.field163.substring(6);
                                }
                                String var20 = this.field163.toLowerCase();
                                byte var21 = 0;
                                if (var20.startsWith("wave:")) {
                                    var21 = 1;
                                    this.field163 = this.field163.substring(5);
                                } else if (var20.startsWith("wave2:")) {
                                    var21 = 2;
                                    this.field163 = this.field163.substring(6);
                                } else if (var20.startsWith("shake:")) {
                                    var21 = 3;
                                    this.field163 = this.field163.substring(6);
                                } else if (var20.startsWith("scroll:")) {
                                    var21 = 4;
                                    this.field163 = this.field163.substring(7);
                                } else if (var20.startsWith("slide:")) {
                                    var21 = 5;
                                    this.field163 = this.field163.substring(6);
                                }
                                this.field310.method314(43776, 246);
                                this.field310.method315(0);
                                int var22 = this.field310.field945;
                                this.field310.method343((byte) 8, var21);
                                this.field132.field945 = 0;
                                class16.method231(564, this.field163, this.field132);
                                this.field310.method323(0, 1, this.field132.field944, this.field132.field945);
                                this.field310.method315(var19);
                                this.field310.method324(this.field310.field945 - var22, false);
                                this.field163 = class16.method232(this.field163, -643);
                                this.field163 = class11.method193(this.field163, -643);
                                field144.field1221 = this.field163;
                                field144.field1244 = var19;
                                field144.field1222 = var21;
                                field144.field1249 = 150;
                                if (this.field181 == 2) {
                                    this.method25(0, "@cr2@" + field144.field849, 2, field144.field1221);
                                } else if (this.field181 == 1) {
                                    this.method25(0, "@cr1@" + field144.field849, 2, field144.field1221);
                                } else {
                                    this.method25(0, field144.field849, 2, field144.field1221);
                                }
                                if (this.field511 == 2) {
                                    this.field511 = 3;
                                    this.field124 = true;
                                    this.field310.method314(43776, 59);
                                    this.field310.method315(this.field511);
                                    this.field310.method315(this.field112);
                                    this.field310.method315(this.field341);
                                }
                            }
                            this.field163 = "";
                            this.field401 = true;
                        }
                    }
                }
            } while ((var3 < 97 || var3 > 122) && (var3 < 65 || var3 > 90) && (var3 < 48 || var3 > 57) && var3 != 32);
            if (this.field187.length() < 12) {
                this.field187 = this.field187 + (char) var3;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIIII)V")
    public final void method80(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = 2048 - arg5 & 2047;
        int var9 = 2048 - arg3 & 2047;
        int var10 = 0;
        int var11 = 0;
        int var12 = arg6;
        if (var8 != 0) {
            int var13 = class70.field1634[var8];
            int var14 = class70.field1635[var8];
            int var15 = var11 * var14 - arg6 * var13 >> 16;
            var12 = var11 * var13 + arg6 * var14 >> 16;
            var11 = var15;
        }
        if (var9 != 0) {
            int var16 = class70.field1634[var9];
            int var17 = class70.field1635[var9];
            int var18 = var10 * var17 + var12 * var16 >> 16;
            var12 = var12 * var17 - var10 * var16 >> 16;
            var10 = var18;
        }
        this.field266 = arg4 - var10;
        this.field267 = arg1 - var11;
        this.field268 = arg0 - var12;
        this.field269 = arg5;
        while (arg2 >= 0) {
            this.field538 = null;
        }
        this.field270 = arg3;
    }

    @OriginalMember(owner = "client", name = "t", descriptor = "(I)V")
    public final void method81(int arg0) {
        if (arg0 != -4482) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        for (int var3 = 0; var3 < this.field340; ++var3) {
            if (this.field342[var3] <= 0) {
                boolean var4 = false;
                try {
                    if (this.field192[var3] == this.field154 && this.field92[var3] == this.field93) {
                        if (!this.method50(this.field405)) {
                            var4 = true;
                        }
                    } else {
                        class33 var5 = class13.method225((byte) -107, this.field92[var3], this.field192[var3]);
                        if (System.currentTimeMillis() + (long) (var5.field945 / 22) > (long) (this.field218 / 22) + this.field327) {
                            this.field218 = var5.field945;
                            this.field327 = System.currentTimeMillis();
                            if (this.method148(-460, var5.field944, var5.field945)) {
                                this.field154 = this.field192[var3];
                                this.field93 = this.field92[var3];
                            } else {
                                var4 = true;
                            }
                        }
                    }
                } catch (Exception var8) {
                }
                if (var4 && this.field342[var3] != -5) {
                    this.field342[var3] = -5;
                } else {
                    --this.field340;
                    for (int var7 = var3; var7 < this.field340; ++var7) {
                        this.field192[var7] = this.field192[var7 + 1];
                        this.field92[var7] = this.field92[var7 + 1];
                        this.field342[var7] = this.field342[var7 + 1];
                    }
                    --var3;
                }
            } else {
                int var10002 = this.field342[var3]--;
            }
        }
        if (this.field543 > 0) {
            this.field543 -= 20;
            if (this.field543 < 0) {
                this.field543 = 0;
            }
            if (this.field543 == 0 && this.field161 && !field376) {
                this.field117 = this.field419;
                this.field118 = true;
                this.field329.method533(2, this.field117);
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "h", descriptor = "(Z)V")
    public final void method82(boolean arg0) {
        this.field88 = true;
        if (!arg0) {
            this.field182 = this.field365.method402();
        }
        try {
            long var2 = System.currentTimeMillis();
            int var4 = 0;
            int var5 = 20;
            while (this.field204) {
                ++this.field196;
                this.method54(-207);
                this.method54(-207);
                this.method45(-257);
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
        this.field88 = false;
    }

    @OriginalMember(owner = "client", name = "i", descriptor = "(Z)V")
    public final void method83(boolean arg0) {
        if (this.field226 == 2) {
            this.method89(this.field322 * 2, this.field435, (this.field321 - this.field500 << 7) + this.field324, (this.field320 - this.field499 << 7) + this.field323);
            this.field106 &= arg0;
            if (this.field114 > -1 && field369 % 20 < 10) {
                this.field409[2].method498(this.field114 - 12, this.field115 - 28, 2);
            }
        }
    }

    @OriginalMember(owner = "client", name = "init", descriptor = "()V")
    public final void init() {
        field373 = Integer.parseInt(this.getParameter("nodeid"));
        field374 = Integer.parseInt(this.getParameter("portoff"));
        String var1 = this.getParameter("lowmem");
        if (var1 != null && var1.equals("1")) {
            method34((byte) -63);
        } else {
            method55(-41414);
        }
        String var2 = this.getParameter("free");
        if (var2 != null && var2.equals("1")) {
            field375 = false;
        } else {
            field375 = true;
        }
        this.method577(0, 765, 503);
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IJ)V")
    public final void method84(int arg0, long arg1) {
        if (arg1 != 0L) {
            for (int var4 = 0; var4 < this.field325; ++var4) {
                if (this.field483[var4] == arg1) {
                    --this.field325;
                    this.field438 = true;
                    for (int var5 = var4; var5 < this.field325; ++var5) {
                        this.field425[var5] = this.field425[var5 + 1];
                        this.field432[var5] = this.field432[var5 + 1];
                        this.field483[var5] = this.field483[var5 + 1];
                    }
                    this.field310.method314(43776, 168);
                    this.field310.method321((byte) 73, arg1);
                    break;
                }
            }
            if (arg0 >= 0) {
                ;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BILMQZHAILV;)V")
    private final void method85(byte arg0, int arg1, class33 arg2) {
        if (this.field188 != arg0) {
            this.method70();
        }
        while (arg2.field946 + 21 < arg1 * 8) {
            int var4 = arg2.method336(-29762, 14);
            if (var4 == 16383) {
                break;
            }
            if (this.field133[var4] == null) {
                this.field133[var4] = new class36();
            }
            class36 var5 = this.field133[var4];
            this.field135[this.field134++] = var4;
            var5.field1209 = field369;
            int var6 = arg2.method336(-29762, 5);
            if (var6 > 15) {
                var6 -= 32;
            }
            int var7 = arg2.method336(-29762, 1);
            if (var7 == 1) {
                this.field462[this.field461++] = var4;
            }
            var5.field966 = class6.method171(arg2.method336(-29762, 12));
            int var8 = arg2.method336(-29762, 5);
            if (var8 > 15) {
                var8 -= 32;
            }
            int var9 = arg2.method336(-29762, 1);
            var5.field1242 = var5.field966.field593;
            var5.field1205 = var5.field966.field601;
            var5.field1223 = var5.field966.field582;
            var5.field1224 = var5.field966.field598;
            var5.field1225 = var5.field966.field599;
            var5.field1226 = var5.field966.field581;
            var5.field1239 = var5.field966.field597;
            var5.method480(field144.field1228[0] + var8, field144.field1229[0] + var6, -364, var9 == 1);
        }
        arg2.method337((byte) -97);
    }

    @OriginalMember(owner = "client", name = "u", descriptor = "(I)V")
    public final void method86(int arg0) {
        this.field158.method172(-130);
        if (this.field235 == 2) {
            byte[] var2 = this.field109.field746;
            int[] var3 = class23.field782;
            int var4 = var2.length;
            for (int var5 = 0; var5 < var4; ++var5) {
                if (var2[var5] == 0) {
                    var3[var5] = 0;
                }
            }
            this.field279.method502(25, this.field180, 268, 256, this.field244, 33, 33, 25, 0, 0, this.field384);
            this.field159.method172(-130);
        } else {
            int var6 = this.field384 + this.field277 & 2047;
            int var7 = field144.field1206 / 32 + 48;
            int var8 = 464 - field144.field1207 / 32;
            this.field350.method502(var7, this.field77, 268, this.field420 + 256, this.field291, 146, 151, var8, 5, 25, var6);
            this.field279.method502(25, this.field180, 268, 256, this.field244, 33, 33, 25, 0, 0, this.field384);
            if (arg0 != -45213) {
                for (int var9 = 1; var9 > 0; ++var9) {
                }
            }
            for (int var10 = 0; var10 < this.field360; ++var10) {
                int var40 = this.field361[var10] * 4 + 2 - field144.field1206 / 32;
                int var41 = this.field362[var10] * 4 + 2 - field144.field1207 / 32;
                this.method56(this.field80[var10], var40, this.field366, var41);
            }
            for (int var11 = 0; var11 < 104; ++var11) {
                for (int var36 = 0; var36 < 104; ++var36) {
                    class42 var37 = this.field538[this.field426][var11][var36];
                    if (var37 != null) {
                        int var38 = var11 * 4 + 2 - field144.field1206 / 32;
                        int var39 = var36 * 4 + 2 - field144.field1207 / 32;
                        this.method56(this.field527, var38, this.field366, var39);
                    }
                }
            }
            for (int var12 = 0; var12 < this.field134; ++var12) {
                class36 var32 = this.field133[this.field135[var12]];
                if (var32 != null && var32.method273(0)) {
                    class6 var33 = var32.field966;
                    if (var33.field583 != null) {
                        var33 = var33.method167(0);
                    }
                    if (var33 != null && var33.field603 && var33.field580) {
                        int var34 = var32.field1206 / 32 - field144.field1206 / 32;
                        int var35 = var32.field1207 / 32 - field144.field1207 / 32;
                        this.method56(this.field528, var34, this.field366, var35);
                    }
                }
            }
            for (int var13 = 0; var13 < this.field459; ++var13) {
                class29 var24 = this.field458[this.field460[var13]];
                if (var24 != null && var24.method273(0)) {
                    int var25 = var24.field1206 / 32 - field144.field1206 / 32;
                    int var26 = var24.field1207 / 32 - field144.field1207 / 32;
                    boolean var27 = false;
                    long var28 = class39.method367(var24.field849);
                    for (int var30 = 0; var30 < this.field325; ++var30) {
                        if (this.field483[var30] == var28 && this.field432[var30] != 0) {
                            var27 = true;
                            break;
                        }
                    }
                    boolean var31 = false;
                    if (field144.field845 != 0 && var24.field845 != 0 && field144.field845 == var24.field845) {
                        var31 = true;
                    }
                    if (var27) {
                        this.method56(this.field530, var25, this.field366, var26);
                    } else if (var31) {
                        this.method56(this.field531, var25, this.field366, var26);
                    } else {
                        this.method56(this.field529, var25, this.field366, var26);
                    }
                }
            }
            if (this.field226 != 0 && field369 % 20 < 10) {
                if (this.field226 == 1 && this.field75 >= 0 && this.field75 < this.field133.length) {
                    class36 var14 = this.field133[this.field75];
                    if (var14 != null) {
                        int var15 = var14.field1206 / 32 - field144.field1206 / 32;
                        int var16 = var14.field1207 / 32 - field144.field1207 / 32;
                        this.method93(this.field87, var16, var15, (byte) 6);
                    }
                }
                if (this.field226 == 2) {
                    int var17 = (this.field320 - this.field499) * 4 + 2 - field144.field1206 / 32;
                    int var18 = (this.field321 - this.field500) * 4 + 2 - field144.field1207 / 32;
                    this.method93(this.field87, var18, var17, (byte) 6);
                }
                if (this.field226 == 10 && this.field396 >= 0 && this.field396 < this.field458.length) {
                    class29 var19 = this.field458[this.field396];
                    if (var19 != null) {
                        int var20 = var19.field1206 / 32 - field144.field1206 / 32;
                        int var21 = var19.field1207 / 32 - field144.field1207 / 32;
                        this.method93(this.field87, var21, var20, (byte) 6);
                    }
                }
            }
            if (this.field348 != 0) {
                int var22 = this.field348 * 4 + 2 - field144.field1206 / 32;
                int var23 = this.field349 * 4 + 2 - field144.field1207 / 32;
                this.method56(this.field86, var22, this.field366, var23);
            }
            class23.method258(3, (byte) -33, 97, 16777215, 78, 3);
            this.field159.method172(-130);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;IB)V")
    public final void method87(String arg0, int arg1, byte arg2) {
        this.field332 = arg1;
        this.field245 = arg0;
        this.method146(-742);
        if (this.field391 == null) {
            super.method87(arg0, arg1, (byte) 9);
        } else {
            this.field173.method172(-130);
            short var4 = 360;
            short var5 = 200;
            byte var6 = 20;
            if (arg2 == 9) {
                boolean var7 = false;
            } else {
                this.field275 = !this.field275;
            }
            this.field298.method458(var5 / 2 - 26 - var6, 16777215, var4 / 2, "RuneScape is loading - please wait...", 0);
            int var8 = var5 / 2 - 18 - var6;
            class23.method259(var4 / 2 - 152, var8, 9179409, false, 34, 304);
            class23.method259(var4 / 2 - 151, var8 + 1, 0, false, 32, 302);
            class23.method258(arg1 * 3, (byte) -33, var4 / 2 - 150, 9179409, var8 + 2, 30);
            class23.method258(300 - arg1 * 3, (byte) -33, arg1 * 3 + (var4 / 2 - 150), 0, var8 + 2, 30);
            this.field298.method458(var5 / 2 + 5 - var6, 16777215, var4 / 2, arg0, 0);
            this.field173.method173(super.field1650, false, 202, 171);
            if (this.field273) {
                this.field273 = false;
                if (!this.field204) {
                    this.field174.method173(super.field1650, false, 0, 0);
                    this.field175.method173(super.field1650, false, 637, 0);
                }
                this.field171.method173(super.field1650, false, 128, 0);
                this.field172.method173(super.field1650, false, 202, 371);
                this.field176.method173(super.field1650, false, 0, 265);
                this.field177.method173(super.field1650, false, 562, 265);
                this.field178.method173(super.field1650, false, 128, 171);
                this.field179.method173(super.field1650, false, 562, 171);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IZLSXZSKNOI;)V")
    public final void method88(int arg0, boolean arg1, class50 arg2) {
        this.method89(arg0, this.field435, arg2.field1207, arg2.field1206);
        if (arg1) {
            this.method70();
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(IIII)V")
    public final void method89(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 >= 128 && arg2 >= 128 && arg3 <= 13056 && arg2 <= 13056) {
            int var5 = this.method24(arg3, -8947, arg2, this.field426) - arg0;
            int var6 = arg3 - this.field266;
            int var7 = var5 - this.field267;
            int var8 = 45 / arg1;
            int var9 = arg2 - this.field268;
            int var10 = class70.field1634[this.field269];
            int var11 = class70.field1635[this.field269];
            int var12 = class70.field1634[this.field270];
            int var13 = class70.field1635[this.field270];
            int var14 = var6 * var13 + var9 * var12 >> 16;
            int var15 = var9 * var13 - var6 * var12 >> 16;
            int var17 = var7 * var11 - var10 * var15 >> 16;
            int var18 = var7 * var10 + var11 * var15 >> 16;
            if (var18 >= 50) {
                this.field114 = (var14 << 9) / var18 + class44.field1054;
                this.field115 = (var17 << 9) / var18 + class44.field1055;
            } else {
                this.field114 = -1;
                this.field115 = -1;
            }
        } else {
            this.field114 = -1;
            this.field115 = -1;
        }
    }

    @OriginalMember(owner = "client", name = "v", descriptor = "(I)V")
    public final void method90(int arg0) {
        int var2 = 5;
        this.field290[8] = 0;
        int var3 = 0;
        if (arg0 >= 0) {
            this.field310.method315(120);
        }
        while (this.field290[8] == 0) {
            String var4 = "Unknown problem";
            this.method87("Connecting to web server", 20, (byte) 9);
            try {
                DataInputStream var5 = this.method135("crc" + (int) (Math.random() * 9.9999999E7D) + "-" + 329);
                class33 var6 = new class33(true, new byte[40]);
                var5.readFully(var6.field944, 0, 40);
                var5.close();
                for (int var7 = 0; var7 < 9; ++var7) {
                    this.field290[var7] = var6.method330();
                }
                int var8 = var6.method330();
                int var9 = 1234;
                for (int var10 = 0; var10 < 9; ++var10) {
                    var9 = (var9 << 1) + this.field290[var10];
                }
                if (var8 != var9) {
                    var4 = "checksum problem";
                    this.field290[8] = 0;
                }
            } catch (EOFException var13) {
                var4 = "EOF problem";
                this.field290[8] = 0;
            } catch (IOException var14) {
                var4 = "connection problem";
                this.field290[8] = 0;
            } catch (Exception var15) {
                var4 = "logic problem";
                this.field290[8] = 0;
                if (!signlink.reporterror) {
                    return;
                }
            }
            if (this.field290[8] == 0) {
                ++var3;
                for (int var11 = var2; var11 > 0; --var11) {
                    if (var3 >= 10) {
                        this.method87("Game updated - please reload page", 10, (byte) 9);
                        var11 = 10;
                    } else {
                        this.method87(var4 + " - Will retry in " + var11 + " secs.", 10, (byte) 9);
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
                this.field225 = !this.field225;
            }
        }
    }

    @OriginalMember(owner = "client", name = "w", descriptor = "(I)V")
    public final void method91(int arg0) {
        if (this.field469 != 0) {
            int var2 = 0;
            if (arg0 >= 0) {
                this.field489 = this.field254.method325();
            }
            if (this.field107 != 0) {
                var2 = 1;
            }
            for (int var3 = 0; var3 < 100; ++var3) {
                if (this.field294[var3] != null) {
                    int var4 = this.field292[var3];
                    String var5 = this.field293[var3];
                    boolean var6 = false;
                    if (var5 != null && var5.startsWith("@cr1@")) {
                        var5 = var5.substring(5);
                        boolean var7 = true;
                    }
                    if (var5 != null && var5.startsWith("@cr2@")) {
                        var5 = var5.substring(5);
                        boolean var8 = true;
                    }
                    if ((var4 == 3 || var4 == 7) && (var4 == 7 || this.field112 == 0 || this.field112 == 1 && this.method43(var5, false))) {
                        int var9 = 329 - var2 * 13;
                        if (super.field1658 > 4 && super.field1659 - 4 > var9 - 10 && super.field1659 - 4 <= var9 + 3) {
                            int var10 = this.field297.method460("From:  " + var5 + this.field294[var3], 5) + 25;
                            if (var10 > 450) {
                                var10 = 450;
                            }
                            if (super.field1658 < var10 + 4) {
                                if (this.field181 >= 1) {
                                    this.field137[this.field152] = "Report abuse @whi@" + var5;
                                    this.field358[this.field152] = 2140;
                                    ++this.field152;
                                }
                                this.field137[this.field152] = "Add ignore @whi@" + var5;
                                this.field358[this.field152] = 2633;
                                ++this.field152;
                                this.field137[this.field152] = "Add friend @whi@" + var5;
                                this.field358[this.field152] = 2539;
                                ++this.field152;
                            }
                        }
                        ++var2;
                        if (var2 >= 5) {
                            return;
                        }
                    }
                    if ((var4 == 5 || var4 == 6) && this.field112 < 2) {
                        ++var2;
                        if (var2 >= 5) {
                            return;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZLTDQUELMV;)Z")
    public final boolean method92(boolean arg0, class52 arg1) {
        int var3 = arg1.field1262;
        if (arg0) {
            this.field454 = !this.field454;
        }
        if ((var3 < 1 || var3 > 200) && (var3 < 701 || var3 > 900)) {
            if (var3 >= 401 && var3 <= 500) {
                this.field137[this.field152] = "Remove @whi@" + arg1.field1315;
                this.field358[this.field152] = 128;
                ++this.field152;
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
            this.field137[this.field152] = "Remove @whi@" + this.field425[var3];
            this.field358[this.field152] = 361;
            ++this.field152;
            this.field137[this.field152] = "Message @whi@" + this.field425[var3];
            this.field358[this.field152] = 704;
            ++this.field152;
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LUFHMHWIH;IIB)V")
    public final void method93(class55 arg0, int arg1, int arg2, byte arg3) {
        if (arg3 == 6) {
            int var5 = arg1 * arg1 + arg2 * arg2;
            if (var5 > 4225 && var5 < 90000) {
                int var6 = this.field384 + this.field277 & 2047;
                int var7 = class70.field1634[var6];
                int var8 = class70.field1635[var6];
                int var9 = var7 * 256 / (this.field420 + 256);
                int var10 = var8 * 256 / (this.field420 + 256);
                int var11 = arg1 * var9 + arg2 * var10 >> 16;
                int var12 = arg1 * var10 - arg2 * var9 >> 16;
                double var13 = Math.atan2((double) var11, (double) var12);
                int var15 = (int) (Math.sin(var13) * 63.0D);
                int var16 = (int) (Math.cos(var13) * 57.0D);
                this.field300.method503(20, var15 + 94 + 4 - 10, 15, -47907, 20, 83 - var16 - 20, var13, 256, 15);
            } else {
                this.method56(arg0, arg2, this.field366, arg1);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(II)V")
    public final void method94(int arg0, int arg1) {
        class42 var3 = this.field538[this.field426][arg0][arg1];
        if (var3 == null) {
            this.field243.method427(this.field426, arg0, arg1);
        } else {
            int var4 = -99999999;
            class65 var5 = null;
            for (class65 var6 = (class65) var3.method376(); var6 != null; var6 = (class65) var3.method378(0)) {
                class3 var11 = class3.method13(var6.field1490);
                int var12 = var11.field54;
                if (var11.field26) {
                    var12 = (var6.field1488 + 1) * var12;
                }
                if (var12 > var4) {
                    var4 = var12;
                    var5 = var6;
                }
            }
            var3.method374(825, var5);
            class65 var7 = null;
            class65 var8 = null;
            for (class65 var9 = (class65) var3.method376(); var9 != null; var9 = (class65) var3.method378(0)) {
                if (var5.field1490 != var9.field1490 && var7 == null) {
                    var7 = var9;
                }
                if (var5.field1490 != var9.field1490 && var7.field1490 != var9.field1490 && var8 == null) {
                    var8 = var9;
                }
            }
            int var10 = (arg1 << 7) + arg0 + 1610612736;
            this.field243.method413(arg0, arg1, var10, var7, this.method24(arg0 * 128 + 64, -8947, arg1 * 128 + 64, this.field426), 0, var8, this.field426, var5);
        }
    }

    @OriginalMember(owner = "client", name = "x", descriptor = "(I)V")
    public final void method95(int arg0) {
        if (this.field199 == 0) {
            int var2 = super.field1664;
            if (arg0 != 5164) {
                this.field538 = null;
            }
            if (this.field474 == 1 && super.field1665 >= 516 && super.field1666 >= 160 && super.field1665 <= 765 && super.field1666 <= 205) {
                var2 = 0;
            }
            if (this.field74) {
                if (var2 != 1) {
                    int var3 = super.field1658;
                    int var4 = super.field1659;
                    if (this.field260 == 0) {
                        var3 -= 4;
                        var4 -= 4;
                    }
                    if (this.field260 == 1) {
                        var3 -= 553;
                        var4 -= 205;
                    }
                    if (this.field260 == 2) {
                        var3 -= 17;
                        var4 -= 357;
                    }
                    if (var3 < this.field261 - 10 || var3 > this.field263 + this.field261 + 10 || var4 < this.field262 - 10 || var4 > this.field264 + this.field262 + 10) {
                        this.field74 = false;
                        if (this.field260 == 1) {
                            this.field438 = true;
                        }
                        if (this.field260 == 2) {
                            this.field401 = true;
                        }
                    }
                }
                if (var2 == 1) {
                    int var5 = this.field261;
                    int var6 = this.field262;
                    int var7 = this.field263;
                    int var8 = super.field1665;
                    int var9 = super.field1666;
                    if (this.field260 == 0) {
                        var8 -= 4;
                        var9 -= 4;
                    }
                    if (this.field260 == 1) {
                        var8 -= 553;
                        var9 -= 205;
                    }
                    if (this.field260 == 2) {
                        var8 -= 17;
                        var9 -= 357;
                    }
                    int var10 = -1;
                    for (int var11 = 0; var11 < this.field152; ++var11) {
                        int var12 = (this.field152 - 1 - var11) * 15 + var6 + 31;
                        if (var8 > var5 && var8 < var5 + var7 && var9 > var12 - 13 && var9 < var12 + 3) {
                            var10 = var11;
                        }
                    }
                    if (var10 != -1) {
                        this.method119(var10, false);
                    }
                    this.field74 = false;
                    if (this.field260 == 1) {
                        this.field438 = true;
                    }
                    if (this.field260 == 2) {
                        this.field401 = true;
                        return;
                    }
                }
            } else {
                if (var2 == 1 && this.field152 > 0) {
                    int var13 = this.field358[this.field152 - 1];
                    if (var13 == 616 || var13 == 245 || var13 == 823 || var13 == 962 || var13 == 598 || var13 == 758 || var13 == 344 || var13 == 63 || var13 == 803 || var13 == 664 || var13 == 157 || var13 == 1339) {
                        int var14 = this.field356[this.field152 - 1];
                        int var15 = this.field357[this.field152 - 1];
                        class52 var16 = class52.field1258[var15];
                        if (var16.field1287 || var16.field1323) {
                            this.field395 = false;
                            this.field433 = 0;
                            this.field197 = var15;
                            this.field198 = var14;
                            this.field199 = 2;
                            this.field200 = super.field1665;
                            this.field201 = super.field1666;
                            if (class52.field1258[var15].field1271 == this.field347) {
                                this.field199 = 1;
                            }
                            if (class52.field1258[var15].field1271 == this.field301) {
                                this.field199 = 3;
                            }
                            return;
                        }
                    }
                }
                if (var2 == 1 && (this.field508 == 1 || this.method143(this.field152 - 1, true)) && this.field152 > 2) {
                    var2 = 2;
                }
                if (var2 == 1 && this.field152 > 0) {
                    this.method119(this.field152 - 1, false);
                }
                if (var2 != 2 || this.field152 <= 0) {
                    return;
                }
                this.method72((byte) 9);
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(B)V")
    public final void method96(byte arg0) {
        signlink.reporterror = false;
        try {
            if (this.field169 != null) {
                this.field169.method514();
            }
        } catch (Exception var2) {
        }
        this.field169 = null;
        this.method160(0);
        if (this.field138 != null) {
            this.field138.field1370 = false;
        }
        this.field138 = null;
        this.field329.method538();
        this.field329 = null;
        this.field132 = null;
        this.field310 = null;
        this.field202 = null;
        this.field254 = null;
        this.field448 = null;
        this.field289 = null;
        this.field155 = null;
        this.field449 = null;
        this.field450 = null;
        this.field434 = null;
        this.field517 = null;
        this.field243 = null;
        this.field238 = null;
        this.field102 = null;
        this.field221 = null;
        this.field484 = null;
        this.field485 = null;
        this.field103 = null;
        this.field157 = null;
        this.field158 = null;
        this.field159 = null;
        this.field160 = null;
        this.field89 = null;
        this.field90 = null;
        this.field91 = null;
        this.field311 = null;
        this.field312 = null;
        this.field313 = null;
        this.field314 = null;
        this.field315 = null;
        this.field316 = null;
        this.field317 = null;
        this.field318 = null;
        this.field319 = null;
        this.field108 = null;
        this.field109 = null;
        this.field110 = null;
        this.field471 = null;
        this.field472 = null;
        this.field473 = null;
        this.field513 = null;
        this.field334 = null;
        this.field335 = null;
        this.field336 = null;
        this.field337 = null;
        this.field338 = null;
        this.field164 = null;
        this.field165 = null;
        this.field166 = null;
        this.field167 = null;
        this.field168 = null;
        this.field279 = null;
        this.field99 = null;
        this.field409 = null;
        this.field256 = null;
        this.field527 = null;
        this.field528 = null;
        this.field529 = null;
        if (arg0 != 0) {
            this.field182 = this.field365.method402();
        }
        this.field530 = null;
        this.field531 = null;
        this.field392 = null;
        this.field412 = null;
        this.field104 = null;
        this.field458 = null;
        this.field460 = null;
        this.field462 = null;
        this.field463 = null;
        this.field288 = null;
        this.field133 = null;
        this.field135 = null;
        this.field538 = null;
        this.field129 = null;
        this.field111 = null;
        this.field184 = null;
        this.field356 = null;
        this.field357 = null;
        this.field358 = null;
        this.field359 = null;
        this.field137 = null;
        this.field232 = null;
        this.field361 = null;
        this.field362 = null;
        this.field80 = null;
        this.field350 = null;
        this.field425 = null;
        this.field483 = null;
        this.field432 = null;
        this.field174 = null;
        this.field175 = null;
        this.field171 = null;
        this.field172 = null;
        this.field173 = null;
        this.field176 = null;
        this.field177 = null;
        this.field178 = null;
        this.field179 = null;
        this.method131(this.field236);
        class72.method591((byte) -56);
        class6.method170((byte) -56);
        class3.method9((byte) -56);
        class2.field7 = null;
        class30.field881 = null;
        class52.field1258 = null;
        class27.field825 = null;
        class22.field761 = null;
        class37.field970 = null;
        class37.field982 = null;
        class4.field551 = null;
        super.field1651 = null;
        class29.field856 = null;
        class44.method385((byte) -56);
        class46.method405((byte) -56);
        class70.method547((byte) -56);
        class60.method511((byte) -56);
        System.gc();
        if (class53.field1329) {
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
    public final void method97(Runnable arg0, int arg1) {
        if (arg1 > 10) {
            arg1 = 10;
        }
        if (signlink.mainapp != null) {
            signlink.startthread(arg0, arg1);
        } else {
            super.method97(arg0, arg1);
        }
    }

    @OriginalMember(owner = "client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        try {
            System.out.println("RS2 user client - release #" + 329);
            if (arg0.length != 5) {
                System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
            } else {
                field373 = Integer.parseInt(arg0[0]);
                field374 = Integer.parseInt(arg0[1]);
                if (arg0[2].equals("lowmem")) {
                    method34((byte) -63);
                } else {
                    if (!arg0[2].equals("highmem")) {
                        System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
                        return;
                    }
                    method55(-41414);
                }
                if (arg0[3].equals("free")) {
                    field375 = false;
                } else {
                    if (!arg0[3].equals("members")) {
                        System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
                        return;
                    }
                    field375 = true;
                }
                signlink.storeid = Integer.parseInt(arg0[4]);
                signlink.startpriv(InetAddress.getLocalHost());
                client var1 = new client();
                var1.method576(503, 765, false);
            }
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIIIIIII)V")
    private final void method98(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        class56 var11 = null;
        for (class56 var12 = (class56) this.field129.method376(); var12 != null; var12 = (class56) this.field129.method378(0)) {
            if (var12.field1358 == arg2 && var12.field1360 == arg7 && var12.field1361 == arg6 && var12.field1359 == arg9) {
                var11 = var12;
                break;
            }
        }
        if (var11 == null) {
            var11 = new class56();
            var11.field1358 = arg2;
            var11.field1359 = arg9;
            var11.field1360 = arg7;
            var11.field1361 = arg6;
            this.method49(var11, 36318);
            this.field129.method373(var11);
        }
        var11.field1355 = arg5;
        while (arg8 >= 0) {
            this.field310.method315(174);
        }
        var11.field1357 = arg1;
        var11.field1356 = arg4;
        var11.field1351 = arg0;
        var11.field1362 = arg3;
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(IIIIII)V")
    public final void method99(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = this.field243.method432(arg0, arg2, arg3);
        if (var7 != 0) {
            int var8 = this.field243.method436(arg0, arg2, arg3, var7);
            int var9 = var8 >> 6 & 3;
            int var10 = var8 & 31;
            int var11 = arg1;
            if (var7 > 0) {
                var11 = arg4;
            }
            int[] var12 = this.field350.field1344;
            int var13 = (103 - arg3) * 512 * 4 + arg2 * 4 + 24624;
            int var14 = var7 >> 14 & 32767;
            class72 var15 = class72.method588(var14);
            if (var15.field1715 != -1) {
                class20 var16 = this.field392[var15.field1715];
                if (var16 != null) {
                    int var17 = (var15.field1707 * 4 - var16.field748) / 2;
                    int var18 = (var15.field1723 * 4 - var16.field749) / 2;
                    var16.method246(arg2 * 4 + 48 + var17, (104 - arg3 - var15.field1723) * 4 + 48 + var18, 2);
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
        int var19 = this.field243.method434(arg0, arg2, arg3);
        if (arg5 >= 7 && arg5 <= 7) {
            if (var19 != 0) {
                int var20 = this.field243.method436(arg0, arg2, arg3, var19);
                int var21 = var20 >> 6 & 3;
                int var22 = var20 & 31;
                int var23 = var19 >> 14 & 32767;
                class72 var24 = class72.method588(var23);
                if (var24.field1715 != -1) {
                    class20 var25 = this.field392[var24.field1715];
                    if (var25 != null) {
                        int var26 = (var24.field1707 * 4 - var25.field748) / 2;
                        int var27 = (var24.field1723 * 4 - var25.field749) / 2;
                        var25.method246(arg2 * 4 + 48 + var26, (104 - arg3 - var24.field1723) * 4 + 48 + var27, 2);
                    }
                } else if (var22 == 9) {
                    int var28 = 15658734;
                    if (var19 > 0) {
                        var28 = 15597568;
                    }
                    int[] var29 = this.field350.field1344;
                    int var30 = (103 - arg3) * 512 * 4 + arg2 * 4 + 24624;
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
            int var31 = this.field243.method435(arg0, arg2, arg3);
            if (var31 != 0) {
                int var32 = var31 >> 14 & 32767;
                class72 var33 = class72.method588(var32);
                if (var33.field1715 != -1) {
                    class20 var34 = this.field392[var33.field1715];
                    if (var34 != null) {
                        int var35 = (var33.field1707 * 4 - var34.field748) / 2;
                        int var36 = (var33.field1723 * 4 - var34.field749) / 2;
                        var34.method246(arg2 * 4 + 48 + var35, (104 - arg3 - var33.field1723) * 4 + 48 + var36, 2);
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "i", descriptor = "(B)V")
    public final void method100(byte arg0) {
        if (arg0 != 71) {
            this.method70();
        }
        this.field247 = true;
        for (int var2 = 0; var2 < 7; ++var2) {
            this.field295[var2] = -1;
            for (int var3 = 0; var3 < class30.field880; ++var3) {
                if (!class30.field881[var3].field887 && class30.field881[var3].field882 == var2 + (this.field452 ? 0 : 7)) {
                    this.field295[var2] = var3;
                    break;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZZ)V")
    public final void method101(boolean arg0, boolean arg1) {
        if (field144.field1206 >> 7 == this.field348 && field144.field1207 >> 7 == this.field349) {
            this.field348 = 0;
        }
        int var3 = this.field459;
        if (arg1) {
            var3 = 1;
        }
        for (int var4 = 0; var4 < var3; ++var4) {
            class29 var5;
            int var6;
            if (arg1) {
                var5 = field144;
                var6 = this.field457 << 14;
            } else {
                var5 = this.field458[this.field460[var4]];
                var6 = this.field460[var4] << 14;
            }
            if (var5 != null && var5.method273(0)) {
                var5.field848 = false;
                if ((field376 && this.field459 > 50 || this.field459 > 200) && !arg1 && var5.field1246 == var5.field1239) {
                    var5.field848 = true;
                }
                int var7 = var5.field1206 >> 7;
                int var8 = var5.field1207 >> 7;
                if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                    if (var5.field863 != null && field369 >= var5.field868 && field369 < var5.field869) {
                        var5.field848 = false;
                        var5.field855 = this.method24(var5.field1206, -8947, var5.field1207, this.field426);
                        this.field243.method418(var5.field865, 0, var6, this.field426, var5.field866, var5.field1206, var5.field855, var5.field1207, var5.field1208, var5.field864, var5.field867, 60, var5);
                    } else {
                        if ((var5.field1206 & 127) == 64 && (var5.field1207 & 127) == 64) {
                            if (this.field104[var7][var8] == this.field219) {
                                continue;
                            }
                            this.field104[var7][var8] = this.field219;
                        }
                        var5.field855 = this.method24(var5.field1206, -8947, var5.field1207, this.field426);
                        this.field243.method417(var5.field1207, var5.field1206, 60, var5.field855, var5, 3, this.field426, var5.field1230, var5.field1208, var6);
                    }
                }
            }
        }
        if (arg0) {
            this.field185 = !this.field185;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZB[B)V")
    public final void method102(boolean arg0, byte arg1, byte[] arg2) {
        if (this.field161) {
            signlink.midifade = arg0 ? 1 : 0;
            signlink.midisave(arg2, arg2.length);
            if (arg1 != 70) {
                this.field489 = this.field254.method325();
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LTDQUELMV;IIZIII)V")
    public final void method103(class52 arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        if (arg0.field1298 == 0 && arg0.field1311 != null && !arg0.field1291) {
            if (arg6 >= arg1 && arg2 >= arg5 && arg6 <= arg0.field1312 + arg1 && arg2 <= arg0.field1264 + arg5) {
                int var8 = arg0.field1311.length;
                for (int var9 = 0; var9 < var8; ++var9) {
                    int var10 = arg0.field1279[var9] + arg1;
                    int var11 = arg0.field1316[var9] + arg5 - arg4;
                    class52 var12 = class52.field1258[arg0.field1311[var9]];
                    int var13 = var12.field1290 + var10;
                    int var14 = var12.field1310 + var11;
                    if ((var12.field1300 >= 0 || var12.field1288 != 0) && arg6 >= var13 && arg2 >= var14 && arg6 < var12.field1312 + var13 && arg2 < var12.field1264 + var14) {
                        if (var12.field1300 >= 0) {
                            this.field239 = var12.field1300;
                        } else {
                            this.field239 = var12.field1281;
                        }
                    }
                    if (var12.field1298 == 0) {
                        this.method103(var12, var13, arg2, false, var12.field1320, var14, arg6);
                        if (var12.field1318 > var12.field1264) {
                            this.method159(arg2, var14, var12, var12.field1318, var12.field1264, true, arg6, 0, var12.field1312 + var13);
                        }
                    } else {
                        if (var12.field1289 == 1 && arg6 >= var13 && arg2 >= var14 && arg6 < var12.field1312 + var13 && arg2 < var12.field1264 + var14) {
                            boolean var15 = false;
                            if (var12.field1262 != 0) {
                                var15 = this.method92(false, var12);
                            }
                            if (!var15) {
                                this.field137[this.field152] = var12.field1260;
                                this.field358[this.field152] = 938;
                                this.field357[this.field152] = var12.field1281;
                                ++this.field152;
                            }
                        }
                        if (var12.field1289 == 2 && this.field474 == 0 && arg6 >= var13 && arg2 >= var14 && arg6 < var12.field1312 + var13 && arg2 < var12.field1264 + var14) {
                            String var16 = var12.field1325;
                            if (var16.indexOf(" ") != -1) {
                                var16 = var16.substring(0, var16.indexOf(" "));
                            }
                            this.field137[this.field152] = var16 + " @gre@" + var12.field1273;
                            this.field358[this.field152] = 836;
                            this.field357[this.field152] = var12.field1281;
                            ++this.field152;
                        }
                        if (var12.field1289 == 3 && arg6 >= var13 && arg2 >= var14 && arg6 < var12.field1312 + var13 && arg2 < var12.field1264 + var14) {
                            this.field137[this.field152] = "Close";
                            this.field358[this.field152] = 148;
                            this.field357[this.field152] = var12.field1281;
                            ++this.field152;
                        }
                        if (var12.field1289 == 4 && arg6 >= var13 && arg2 >= var14 && arg6 < var12.field1312 + var13 && arg2 < var12.field1264 + var14) {
                            this.field137[this.field152] = var12.field1260;
                            this.field358[this.field152] = 469;
                            this.field357[this.field152] = var12.field1281;
                            ++this.field152;
                        }
                        if (var12.field1289 == 5 && arg6 >= var13 && arg2 >= var14 && arg6 < var12.field1312 + var13 && arg2 < var12.field1264 + var14) {
                            this.field137[this.field152] = var12.field1260;
                            this.field358[this.field152] = 913;
                            this.field357[this.field152] = var12.field1281;
                            ++this.field152;
                        }
                        if (var12.field1289 == 6 && !this.field352 && arg6 >= var13 && arg2 >= var14 && arg6 < var12.field1312 + var13 && arg2 < var12.field1264 + var14) {
                            this.field137[this.field152] = var12.field1260;
                            this.field358[this.field152] = 488;
                            this.field357[this.field152] = var12.field1281;
                            ++this.field152;
                        }
                        if (var12.field1298 == 2) {
                            int var17 = 0;
                            for (int var18 = 0; var18 < var12.field1264; ++var18) {
                                for (int var19 = 0; var19 < var12.field1312; ++var19) {
                                    int var20 = (var12.field1314 + 32) * var19 + var13;
                                    int var21 = (var12.field1307 + 32) * var18 + var14;
                                    if (var17 < 20) {
                                        var20 += var12.field1324[var17];
                                        var21 += var12.field1296[var17];
                                    }
                                    if (arg6 >= var20 && arg2 >= var21 && arg6 < var20 + 32 && arg2 < var21 + 32) {
                                        this.field413 = var17;
                                        this.field414 = var12.field1281;
                                        if (var12.field1304[var17] > 0) {
                                            class3 var22 = class3.method13(var12.field1304[var17] - 1);
                                            if (this.field147 == 1 && var12.field1303) {
                                                if (this.field149 != var12.field1281 || this.field148 != var17) {
                                                    this.field137[this.field152] = "Use " + this.field151 + " with @lre@" + var22.field43;
                                                    this.field358[this.field152] = 543;
                                                    this.field359[this.field152] = var22.field50;
                                                    this.field356[this.field152] = var17;
                                                    this.field357[this.field152] = var12.field1281;
                                                    ++this.field152;
                                                }
                                            } else if (this.field474 == 1 && var12.field1303) {
                                                if ((this.field476 & 16) == 16) {
                                                    this.field137[this.field152] = this.field477 + " @lre@" + var22.field43;
                                                    this.field358[this.field152] = 65;
                                                    this.field359[this.field152] = var22.field50;
                                                    this.field356[this.field152] = var17;
                                                    this.field357[this.field152] = var12.field1281;
                                                    ++this.field152;
                                                }
                                            } else {
                                                if (var12.field1303) {
                                                    for (int var23 = 4; var23 >= 3; --var23) {
                                                        if (var22.field70 != null && var22.field70[var23] != null) {
                                                            this.field137[this.field152] = var22.field70[var23] + " @lre@" + var22.field43;
                                                            if (var23 == 3) {
                                                                this.field358[this.field152] = 803;
                                                            }
                                                            if (var23 == 4) {
                                                                this.field358[this.field152] = 664;
                                                            }
                                                            this.field359[this.field152] = var22.field50;
                                                            this.field356[this.field152] = var17;
                                                            this.field357[this.field152] = var12.field1281;
                                                            ++this.field152;
                                                        } else if (var23 == 4) {
                                                            this.field137[this.field152] = "Drop @lre@" + var22.field43;
                                                            this.field358[this.field152] = 664;
                                                            this.field359[this.field152] = var22.field50;
                                                            this.field356[this.field152] = var17;
                                                            this.field357[this.field152] = var12.field1281;
                                                            ++this.field152;
                                                        }
                                                    }
                                                }
                                                if (var12.field1283) {
                                                    this.field137[this.field152] = "Use @lre@" + var22.field43;
                                                    this.field358[this.field152] = 157;
                                                    this.field359[this.field152] = var22.field50;
                                                    this.field356[this.field152] = var17;
                                                    this.field357[this.field152] = var12.field1281;
                                                    ++this.field152;
                                                }
                                                if (var12.field1303 && var22.field70 != null) {
                                                    for (int var24 = 2; var24 >= 0; --var24) {
                                                        if (var22.field70[var24] != null) {
                                                            this.field137[this.field152] = var22.field70[var24] + " @lre@" + var22.field43;
                                                            if (var24 == 0) {
                                                                this.field358[this.field152] = 758;
                                                            }
                                                            if (var24 == 1) {
                                                                this.field358[this.field152] = 344;
                                                            }
                                                            if (var24 == 2) {
                                                                this.field358[this.field152] = 63;
                                                            }
                                                            this.field359[this.field152] = var22.field50;
                                                            this.field356[this.field152] = var17;
                                                            this.field357[this.field152] = var12.field1281;
                                                            ++this.field152;
                                                        }
                                                    }
                                                }
                                                if (var12.field1269 != null) {
                                                    for (int var25 = 4; var25 >= 0; --var25) {
                                                        if (var12.field1269[var25] != null) {
                                                            this.field137[this.field152] = var12.field1269[var25] + " @lre@" + var22.field43;
                                                            if (var25 == 0) {
                                                                this.field358[this.field152] = 616;
                                                            }
                                                            if (var25 == 1) {
                                                                this.field358[this.field152] = 245;
                                                            }
                                                            if (var25 == 2) {
                                                                this.field358[this.field152] = 823;
                                                            }
                                                            if (var25 == 3) {
                                                                this.field358[this.field152] = 962;
                                                            }
                                                            if (var25 == 4) {
                                                                this.field358[this.field152] = 598;
                                                            }
                                                            this.field359[this.field152] = var22.field50;
                                                            this.field356[this.field152] = var17;
                                                            this.field357[this.field152] = var12.field1281;
                                                            ++this.field152;
                                                        }
                                                    }
                                                }
                                                this.field137[this.field152] = "Examine @lre@" + var22.field43;
                                                this.field358[this.field152] = 1339;
                                                this.field359[this.field152] = var22.field50;
                                                this.field356[this.field152] = var17;
                                                this.field357[this.field152] = var12.field1281;
                                                ++this.field152;
                                            }
                                        }
                                    }
                                    ++var17;
                                }
                            }
                        }
                    }
                }
                if (arg3) {
                    this.field538 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(ZI)V")
    public final void method104(boolean arg0, int arg1) {
        int[] var3 = this.field350.field1344;
        int var4 = var3.length;
        for (int var5 = 0; var5 < var4; ++var5) {
            var3[var5] = 0;
        }
        for (int var6 = 1; var6 < 103; ++var6) {
            int var23 = (103 - var6) * 512 * 4 + 24628;
            for (int var24 = 1; var24 < 103; ++var24) {
                if ((this.field517[arg1][var24][var6] & 24) == 0) {
                    this.field243.method441(var3, var23, 512, arg1, var24, var6);
                }
                if (arg1 < 3 && (this.field517[arg1 + 1][var24][var6] & 8) != 0) {
                    this.field243.method441(var3, var23, 512, arg1 + 1, var24, var6);
                }
                var23 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        this.field350.method493(-130);
        for (int var9 = 1; var9 < 103; ++var9) {
            for (int var22 = 1; var22 < 103; ++var22) {
                if ((this.field517[arg1][var22][var9] & 24) == 0) {
                    this.method99(arg1, var7, var22, var9, var8, this.field400);
                }
                if (arg1 < 3 && (this.field517[arg1 + 1][var22][var9] & 8) != 0) {
                    this.method99(arg1 + 1, var7, var22, var9, var8, this.field400);
                }
            }
        }
        this.field159.method172(-130);
        if (arg0) {
            this.method70();
        }
        this.field360 = 0;
        for (int var10 = 0; var10 < 104; ++var10) {
            for (int var11 = 0; var11 < 104; ++var11) {
                int var12 = this.field243.method435(this.field426, var10, var11);
                if (var12 != 0) {
                    int var13 = var12 >> 14 & 32767;
                    int var14 = class72.method588(var13).field1704;
                    if (var14 >= 0) {
                        int var15 = var10;
                        int var16 = var11;
                        if (var14 != 22 && var14 != 29 && var14 != 34 && var14 != 36 && var14 != 46 && var14 != 47 && var14 != 48) {
                            byte var17 = 104;
                            byte var18 = 104;
                            int[][] var19 = this.field238[this.field426].field926;
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
                        this.field80[this.field360] = this.field412[var14];
                        this.field361[this.field360] = var15;
                        this.field362[this.field360] = var16;
                        ++this.field360;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "y", descriptor = "(I)V")
    public final void method105(int arg0) {
        try {
            this.field424 = -1;
            this.field184.method380();
            this.field111.method380();
            class44.method388(true);
            this.method116(-974);
            this.field243.method406(16184);
            System.gc();
            for (int var2 = 0; var2 < 4; ++var2) {
                this.field238[var2].method301();
            }
            for (int var3 = 0; var3 < 4; ++var3) {
                for (int var4 = 0; var4 < 104; ++var4) {
                    for (int var5 = 0; var5 < 104; ++var5) {
                        this.field517[var3][var4][var5] = 0;
                    }
                }
            }
            class31 var6 = new class31(this.field434, 104, 104, this.field517, false);
            int var7 = this.field289.length;
            this.field310.method314(43776, 65);
            if (!this.field423) {
                for (int var8 = 0; var8 < var7; ++var8) {
                    int var9 = (this.field448[var8] >> 8) * 64 - this.field499;
                    int var10 = (this.field448[var8] & 255) * 64 - this.field500;
                    byte[] var11 = this.field289[var8];
                    if (var11 != null) {
                        var6.method282(7, var10, (this.field309 - 6) * 8, this.field238, var11, (this.field308 - 6) * 8, var9);
                    }
                }
                for (int var12 = 0; var12 < var7; ++var12) {
                    int var13 = (this.field448[var12] >> 8) * 64 - this.field499;
                    int var14 = (this.field448[var12] & 255) * 64 - this.field500;
                    byte[] var15 = this.field289[var12];
                    if (var15 == null && this.field309 < 800) {
                        var6.method297(24112, 64, 64, var13, var14);
                    }
                }
                ++field429;
                if (field429 > 83) {
                    field429 = 0;
                    this.field310.method314(43776, 231);
                }
                this.field310.method314(43776, 65);
                for (int var16 = 0; var16 < var7; ++var16) {
                    byte[] var17 = this.field155[var16];
                    if (var17 != null) {
                        int var18 = (this.field448[var16] >> 8) * 64 - this.field499;
                        int var19 = (this.field448[var16] & 255) * 64 - this.field500;
                        var6.method296(var17, var19, (byte) 4, var18, this.field238, this.field243);
                    }
                }
            }
            if (this.field423) {
                int var20 = 0;
                label257: while (true) {
                    if (var20 >= 4) {
                        for (int var30 = 0; var30 < 13; ++var30) {
                            for (int var31 = 0; var31 < 13; ++var31) {
                                int var32 = this.field237[0][var30][var31];
                                if (var32 == -1) {
                                    var6.method297(24112, 8, 8, var30 * 8, var31 * 8);
                                }
                            }
                        }
                        this.field310.method314(43776, 65);
                        int var33 = 0;
                        while (true) {
                            if (var33 >= 4) {
                                break label257;
                            }
                            for (int var34 = 0; var34 < 13; ++var34) {
                                for (int var35 = 0; var35 < 13; ++var35) {
                                    int var36 = this.field237[var33][var34][var35];
                                    if (var36 != -1) {
                                        int var37 = var36 >> 24 & 3;
                                        int var38 = var36 >> 1 & 3;
                                        int var39 = var36 >> 14 & 1023;
                                        int var40 = var36 >> 3 & 2047;
                                        int var41 = (var39 / 8 << 8) + var40 / 8;
                                        for (int var42 = 0; var42 < this.field448.length; ++var42) {
                                            if (this.field448[var42] == var41 && this.field155[var42] != null) {
                                                var6.method293(this.field155[var42], (var40 & 7) * 8, var38, var35 * 8, var37, this.field243, (var39 & 7) * 8, var33, false, var34 * 8, this.field238);
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
                            int var23 = this.field237[var20][var21][var22];
                            if (var23 != -1) {
                                int var24 = var23 >> 24 & 3;
                                int var25 = var23 >> 1 & 3;
                                int var26 = var23 >> 14 & 1023;
                                int var27 = var23 >> 3 & 2047;
                                int var28 = (var26 / 8 << 8) + var27 / 8;
                                for (int var29 = 0; var29 < this.field448.length; ++var29) {
                                    if (this.field448[var29] == var28 && this.field289[var29] != null) {
                                        var6.method291(var20, this.field289[var29], var22 * 8, var24, (var27 & 7) * 8, var21 * 8, 4, (var26 & 7) * 8, var25, this.field238);
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    ++var20;
                }
            }
            this.field310.method314(43776, 65);
            var6.method300(this.field238, -478, this.field243);
            this.field159.method172(-130);
            this.field310.method314(43776, 65);
            int var43 = class31.field909;
            if (var43 > this.field426) {
                var43 = this.field426;
            }
            if (var43 < this.field426 - 1) {
                int var44 = this.field426 - 1;
            }
            if (field376) {
                this.field243.method407(class31.field909, true);
            } else {
                this.field243.method407(0, true);
            }
            for (int var45 = 0; var45 < 104; ++var45) {
                for (int var46 = 0; var46 < 104; ++var46) {
                    this.method94(var45, var46);
                }
            }
            this.method74(true);
        } catch (Exception var59) {
        }
        class72.field1688.method223();
        if (super.field1653 != null) {
            this.field310.method314(43776, 221);
            this.field310.method319(1057001181);
        }
        if (field376 && signlink.cache_dat != null) {
            int var48 = this.field329.method535(0, 21089);
            for (int var49 = 0; var49 < var48; ++var49) {
                int var50 = this.field329.method540(var49, 1);
                if ((var50 & 121) == 0) {
                    class70.method550(false, var49);
                }
            }
        }
        System.gc();
        class44.method389(20, true);
        this.field329.method537(-23388);
        int var51 = (this.field308 - 6) / 8 - 1;
        int var52 = (this.field308 + 6) / 8 + 1;
        int var53 = (this.field309 - 6) / 8 - 1;
        int var54 = (this.field309 + 6) / 8 + 1;
        while (arg0 >= 0) {
            this.field489 = this.field254.method325();
        }
        if (this.field377) {
            var51 = 49;
            var52 = 50;
            var53 = 49;
            var54 = 50;
        }
        for (int var55 = var51; var55 <= var52; ++var55) {
            for (int var56 = var53; var56 <= var54; ++var56) {
                if (var51 == var55 || var52 == var55 || var53 == var56 || var54 == var56) {
                    int var57 = this.field329.method531(var55, 0, var56, (byte) -34);
                    if (var57 != -1) {
                        this.field329.method524(var57, 3, 1);
                    }
                    int var58 = this.field329.method531(var55, 1, var56, (byte) -34);
                    if (var58 != -1) {
                        this.field329.method524(var58, 3, 1);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(IJ)V")
    public final void method106(int arg0, long arg1) {
        if (arg1 != 0L) {
            if (this.field325 >= 100 && this.field440 != 1) {
                this.method25(0, "", 0, "Your friendlist is full. Max of 100 for free users, and 200 for members");
            } else if (this.field325 >= 200) {
                this.method25(0, "", 0, "Your friendlist is full. Max of 100 for free users, and 200 for members");
            } else {
                String var4 = class39.method371(class39.method368((byte) 3, arg1), (byte) -7);
                if (arg0 == 1123) {
                    for (int var5 = 0; var5 < this.field325; ++var5) {
                        if (this.field483[var5] == arg1) {
                            this.method25(0, "", 0, var4 + " is already on your friend list");
                            return;
                        }
                    }
                    for (int var6 = 0; var6 < this.field105; ++var6) {
                        if (this.field170[var6] == arg1) {
                            this.method25(0, "", 0, "Please remove " + var4 + " from your ignore list first");
                            return;
                        }
                    }
                    if (!var4.equals(field144.field849)) {
                        this.field425[this.field325] = var4;
                        this.field483[this.field325] = arg1;
                        this.field432[this.field325] = 0;
                        ++this.field325;
                        this.field438 = true;
                        this.field310.method314(43776, 227);
                        this.field310.method321((byte) 73, arg1);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "z", descriptor = "(I)V")
    public final void method107(int arg0) {
        this.field488 += arg0;
        for (int var2 = 0; var2 < this.field134; ++var2) {
            int var3 = this.field135[var2];
            class36 var4 = this.field133[var3];
            if (var4 != null) {
                this.method108((byte) 1, var4.field966.field593, var4);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BILSXZSKNOI;)V")
    public final void method108(byte arg0, int arg1, class50 arg2) {
        if (arg2.field1206 < 128 || arg2.field1207 < 128 || arg2.field1206 >= 13184 || arg2.field1207 >= 13184) {
            arg2.field1234 = -1;
            arg2.field1200 = -1;
            arg2.field1218 = 0;
            arg2.field1219 = 0;
            arg2.field1206 = arg2.field1228[0] * 128 + arg2.field1242 * 64;
            arg2.field1207 = arg2.field1229[0] * 128 + arg2.field1242 * 64;
            arg2.method478((byte) 5);
        }
        if (field144 == arg2 && (arg2.field1206 < 1536 || arg2.field1207 < 1536 || arg2.field1206 >= 11776 || arg2.field1207 >= 11776)) {
            arg2.field1234 = -1;
            arg2.field1200 = -1;
            arg2.field1218 = 0;
            arg2.field1219 = 0;
            arg2.field1206 = arg2.field1228[0] * 128 + arg2.field1242 * 64;
            arg2.field1207 = arg2.field1229[0] * 128 + arg2.field1242 * 64;
            arg2.method478((byte) 5);
        }
        if (arg2.field1218 > field369) {
            this.method109(606, arg2);
        } else if (arg2.field1219 >= field369) {
            this.method110(arg2, -606);
        } else {
            this.method111((byte) 5, arg2);
        }
        this.method112(9, arg2);
        this.method113(arg2, (byte) 55);
        if (arg0 == 1) {
            ;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILSXZSKNOI;)V")
    public final void method109(int arg0, class50 arg1) {
        int var3 = arg1.field1218 - field369;
        int var4 = arg1.field1242 * 64 + arg1.field1214 * 128;
        int var5 = arg1.field1242 * 64 + arg1.field1216 * 128;
        arg1.field1206 += (var4 - arg1.field1206) / var3;
        arg1.field1207 += (var5 - arg1.field1207) / var3;
        arg1.field1250 = 0;
        if (arg0 <= 0) {
            this.field538 = null;
        }
        if (arg1.field1220 == 0) {
            arg1.field1199 = 1024;
        }
        if (arg1.field1220 == 1) {
            arg1.field1199 = 1536;
        }
        if (arg1.field1220 == 2) {
            arg1.field1199 = 0;
        }
        if (arg1.field1220 == 3) {
            arg1.field1199 = 512;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LSXZSKNOI;I)V")
    public final void method110(class50 arg0, int arg1) {
        if (field369 == arg0.field1219 || arg0.field1234 == -1 || arg0.field1237 != 0 || arg0.field1236 + 1 > class22.field761[arg0.field1234].method251(this.field146, arg0.field1235)) {
            int var3 = arg0.field1219 - arg0.field1218;
            int var4 = field369 - arg0.field1218;
            int var5 = arg0.field1242 * 64 + arg0.field1214 * 128;
            int var6 = arg0.field1242 * 64 + arg0.field1216 * 128;
            int var7 = arg0.field1242 * 64 + arg0.field1215 * 128;
            int var8 = arg0.field1242 * 64 + arg0.field1217 * 128;
            arg0.field1206 = ((var3 - var4) * var5 + var4 * var7) / var3;
            arg0.field1207 = ((var3 - var4) * var6 + var4 * var8) / var3;
        }
        arg0.field1250 = 0;
        while (arg1 >= 0) {
            this.field379 = this.field365.method402();
        }
        if (arg0.field1220 == 0) {
            arg0.field1199 = 1024;
        }
        if (arg0.field1220 == 1) {
            arg0.field1199 = 1536;
        }
        if (arg0.field1220 == 2) {
            arg0.field1199 = 0;
        }
        if (arg0.field1220 == 3) {
            arg0.field1199 = 512;
        }
        arg0.field1208 = arg0.field1199;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BLSXZSKNOI;)V")
    public final void method111(byte arg0, class50 arg1) {
        arg1.field1246 = arg1.field1239;
        if (arg0 == 5) {
            boolean var3 = false;
        } else {
            for (int var4 = 1; var4 > 0; ++var4) {
            }
        }
        if (arg1.field1241 == 0) {
            arg1.field1250 = 0;
        } else {
            if (arg1.field1234 != -1 && arg1.field1237 == 0) {
                class22 var5 = class22.field761[arg1.field1234];
                if (arg1.field1231 > 0 && var5.field773 == 0) {
                    ++arg1.field1250;
                    return;
                }
                if (arg1.field1231 <= 0 && var5.field774 == 0) {
                    ++arg1.field1250;
                    return;
                }
            }
            int var6 = arg1.field1206;
            int var7 = arg1.field1207;
            int var8 = arg1.field1228[arg1.field1241 - 1] * 128 + arg1.field1242 * 64;
            int var9 = arg1.field1229[arg1.field1241 - 1] * 128 + arg1.field1242 * 64;
            if (var8 - var6 <= 256 && var8 - var6 >= -256 && var9 - var7 <= 256 && var9 - var7 >= -256) {
                if (var6 < var8) {
                    if (var7 < var9) {
                        arg1.field1199 = 1280;
                    } else if (var7 > var9) {
                        arg1.field1199 = 1792;
                    } else {
                        arg1.field1199 = 1536;
                    }
                } else if (var6 > var8) {
                    if (var7 < var9) {
                        arg1.field1199 = 768;
                    } else if (var7 > var9) {
                        arg1.field1199 = 256;
                    } else {
                        arg1.field1199 = 512;
                    }
                } else if (var7 < var9) {
                    arg1.field1199 = 1024;
                } else {
                    arg1.field1199 = 0;
                }
                int var10 = arg1.field1199 - arg1.field1208 & 2047;
                if (var10 > 1024) {
                    var10 -= 2048;
                }
                int var11 = arg1.field1224;
                if (var10 >= -256 && var10 <= 256) {
                    var11 = arg1.field1223;
                } else if (var10 >= 256 && var10 < 768) {
                    var11 = arg1.field1226;
                } else if (var10 >= -768 && var10 <= -256) {
                    var11 = arg1.field1225;
                }
                if (var11 == -1) {
                    var11 = arg1.field1223;
                }
                arg1.field1246 = var11;
                int var12 = 4;
                if (arg1.field1208 != arg1.field1199 && arg1.field1213 == -1 && arg1.field1205 != 0) {
                    var12 = 2;
                }
                if (arg1.field1241 > 2) {
                    var12 = 6;
                }
                if (arg1.field1241 > 3) {
                    var12 = 8;
                }
                if (arg1.field1250 > 0 && arg1.field1241 > 1) {
                    var12 = 8;
                    --arg1.field1250;
                }
                if (arg1.field1245[arg1.field1241 - 1]) {
                    var12 <<= 1;
                }
                if (var12 >= 8 && arg1.field1246 == arg1.field1223 && arg1.field1227 != -1) {
                    arg1.field1246 = arg1.field1227;
                }
                if (var6 < var8) {
                    arg1.field1206 += var12;
                    if (arg1.field1206 > var8) {
                        arg1.field1206 = var8;
                    }
                } else if (var6 > var8) {
                    arg1.field1206 -= var12;
                    if (arg1.field1206 < var8) {
                        arg1.field1206 = var8;
                    }
                }
                if (var7 < var9) {
                    arg1.field1207 += var12;
                    if (arg1.field1207 > var9) {
                        arg1.field1207 = var9;
                    }
                } else if (var7 > var9) {
                    arg1.field1207 -= var12;
                    if (arg1.field1207 < var9) {
                        arg1.field1207 = var9;
                    }
                }
                if (arg1.field1206 == var8 && arg1.field1207 == var9) {
                    --arg1.field1241;
                    if (arg1.field1231 > 0) {
                        --arg1.field1231;
                        return;
                    }
                }
            } else {
                arg1.field1206 = var8;
                arg1.field1207 = var9;
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(ILSXZSKNOI;)V")
    public final void method112(int arg0, class50 arg1) {
        if (this.field439 == arg0) {
            if (arg1.field1205 != 0) {
                if (arg1.field1213 != -1 && arg1.field1213 < 32768) {
                    class36 var3 = this.field133[arg1.field1213];
                    if (var3 != null) {
                        int var4 = arg1.field1206 - var3.field1206;
                        int var5 = arg1.field1207 - var3.field1207;
                        if (var4 != 0 || var5 != 0) {
                            arg1.field1199 = (int) (Math.atan2((double) var4, (double) var5) * 325.949D) & 2047;
                        }
                    }
                }
                if (arg1.field1213 >= 32768) {
                    int var6 = arg1.field1213 - 32768;
                    if (this.field523 == var6) {
                        var6 = this.field457;
                    }
                    class29 var7 = this.field458[var6];
                    if (var7 != null) {
                        int var8 = arg1.field1206 - var7.field1206;
                        int var9 = arg1.field1207 - var7.field1207;
                        if (var8 != 0 || var9 != 0) {
                            arg1.field1199 = (int) (Math.atan2((double) var8, (double) var9) * 325.949D) & 2047;
                        }
                    }
                }
                if ((arg1.field1232 != 0 || arg1.field1233 != 0) && (arg1.field1241 == 0 || arg1.field1250 > 0)) {
                    int var10 = arg1.field1206 - (arg1.field1232 - this.field499 - this.field499) * 64;
                    int var11 = arg1.field1207 - (arg1.field1233 - this.field500 - this.field500) * 64;
                    if (var10 != 0 || var11 != 0) {
                        arg1.field1199 = (int) (Math.atan2((double) var10, (double) var11) * 325.949D) & 2047;
                    }
                    arg1.field1232 = 0;
                    arg1.field1233 = 0;
                }
                int var12 = arg1.field1199 - arg1.field1208 & 2047;
                if (var12 != 0) {
                    if (var12 >= arg1.field1205 && var12 <= 2048 - arg1.field1205) {
                        if (var12 > 1024) {
                            arg1.field1208 -= arg1.field1205;
                        } else {
                            arg1.field1208 += arg1.field1205;
                        }
                    } else {
                        arg1.field1208 = arg1.field1199;
                    }
                    arg1.field1208 &= 2047;
                    if (arg1.field1246 == arg1.field1239 && arg1.field1208 != arg1.field1199) {
                        if (arg1.field1240 != -1) {
                            arg1.field1246 = arg1.field1240;
                            return;
                        }
                        arg1.field1246 = arg1.field1223;
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LSXZSKNOI;B)V")
    public final void method113(class50 arg0, byte arg1) {
        if (arg1 != 55) {
            this.method70();
        }
        arg0.field1230 = false;
        if (arg0.field1246 != -1) {
            class22 var3 = class22.field761[arg0.field1246];
            ++arg0.field1248;
            if (arg0.field1247 < var3.field762 && arg0.field1248 > var3.method251(this.field146, arg0.field1247)) {
                arg0.field1248 = 0;
                ++arg0.field1247;
            }
            if (arg0.field1247 >= var3.field762) {
                arg0.field1248 = 0;
                arg0.field1247 = 0;
            }
        }
        if (arg0.field1200 != -1 && field369 >= arg0.field1203) {
            if (arg0.field1201 < 0) {
                arg0.field1201 = 0;
            }
            class22 var4 = class37.field970[arg0.field1200].field974;
            ++arg0.field1202;
            while (arg0.field1201 < var4.field762 && arg0.field1202 > var4.method251(this.field146, arg0.field1201)) {
                arg0.field1202 -= var4.method251(this.field146, arg0.field1201);
                ++arg0.field1201;
            }
            if (arg0.field1201 >= var4.field762 && (arg0.field1201 < 0 || arg0.field1201 >= var4.field762)) {
                arg0.field1200 = -1;
            }
        }
        if (arg0.field1234 != -1 && arg0.field1237 <= 1) {
            class22 var5 = class22.field761[arg0.field1234];
            if (var5.field773 == 1 && arg0.field1231 > 0 && arg0.field1218 <= field369 && arg0.field1219 < field369) {
                arg0.field1237 = 1;
                return;
            }
        }
        if (arg0.field1234 != -1 && arg0.field1237 == 0) {
            class22 var6 = class22.field761[arg0.field1234];
            ++arg0.field1236;
            while (arg0.field1235 < var6.field762 && arg0.field1236 > var6.method251(this.field146, arg0.field1235)) {
                arg0.field1236 -= var6.method251(this.field146, arg0.field1235);
                ++arg0.field1235;
            }
            if (arg0.field1235 >= var6.field762) {
                arg0.field1235 -= var6.field766;
                ++arg0.field1238;
                if (arg0.field1238 >= var6.field772) {
                    arg0.field1234 = -1;
                }
                if (arg0.field1235 < 0 || arg0.field1235 >= var6.field762) {
                    arg0.field1234 = -1;
                }
            }
            arg0.field1230 = var6.field768;
        }
        if (arg0.field1237 > 0) {
            --arg0.field1237;
        }
    }

    @OriginalMember(owner = "client", name = "j", descriptor = "(Z)V")
    public final void method114(boolean arg0) {
        if (this.field273) {
            this.field273 = false;
            this.field311.method173(super.field1650, false, 0, 4);
            this.field312.method173(super.field1650, false, 0, 357);
            this.field313.method173(super.field1650, false, 722, 4);
            this.field314.method173(super.field1650, false, 743, 205);
            this.field315.method173(super.field1650, false, 0, 0);
            this.field316.method173(super.field1650, false, 516, 4);
            this.field317.method173(super.field1650, false, 516, 205);
            this.field318.method173(super.field1650, false, 496, 357);
            this.field319.method173(super.field1650, false, 0, 338);
            this.field438 = true;
            this.field401 = true;
            this.field121 = true;
            this.field124 = true;
            if (this.field497 != 2) {
                this.field159.method173(super.field1650, false, 4, 4);
                this.field158.method173(super.field1650, false, 550, 4);
            }
        }
        if (this.field497 == 2) {
            this.method139(false);
        }
        if (this.field74 && this.field260 == 1) {
            this.field438 = true;
        }
        if (this.field541 != -1) {
            boolean var2 = this.method61(this.field455, -20845, this.field541);
            if (var2) {
                this.field438 = true;
            }
        }
        if (this.field390 == 2) {
            this.field438 = true;
        }
        if (this.field199 == 2) {
            this.field438 = true;
        }
        if (this.field438) {
            this.method77((byte) 9);
            this.field438 = false;
        }
        ++field250;
        if (field250 > 1564) {
            field250 = 0;
            this.field310.method314(43776, 56);
            this.field310.method315(0);
            int var3 = this.field310.field945;
            if ((int) (Math.random() * 2.0D) == 0) {
                this.field310.method316(64019);
            }
            this.field310.method316(12441);
            this.field310.method315((int) (Math.random() * 256.0D));
            this.field310.method316((int) (Math.random() * 65536.0D));
            this.field310.method315((int) (Math.random() * 256.0D));
            if ((int) (Math.random() * 2.0D) == 0) {
                this.field310.method316(63947);
            }
            this.field310.method316(43979);
            this.field310.method316(32368);
            this.field310.method316((int) (Math.random() * 65536.0D));
            this.field310.method315((int) (Math.random() * 256.0D));
            this.field310.method324(this.field310.field945 - var3, false);
        }
        if (this.field301 == -1) {
            this.field240.field1320 = this.field339 - this.field265 - 77;
            if (super.field1658 > 448 && super.field1658 < 560 && super.field1659 > 332) {
                this.method159(super.field1659 - 357, 0, this.field240, this.field339, 77, false, super.field1658 - 17, 0, 463);
            }
            int var4 = this.field339 - 77 - this.field240.field1320;
            if (var4 < 0) {
                var4 = 0;
            }
            if (var4 > this.field339 - 77) {
                var4 = this.field339 - 77;
            }
            if (this.field265 != var4) {
                this.field265 = var4;
                this.field401 = true;
            }
        }
        if (this.field301 != -1) {
            boolean var5 = this.method61(this.field455, -20845, this.field301);
            if (var5) {
                this.field401 = true;
            }
        }
        if (this.field390 == 3) {
            this.field401 = true;
        }
        if (this.field199 == 3) {
            this.field401 = true;
        }
        if (this.field191 != null) {
            this.field401 = true;
        }
        if (this.field74 && this.field260 == 2) {
            this.field401 = true;
        }
        if (this.field401) {
            this.method124(false);
            this.field401 = false;
        }
        if (this.field497 == 2) {
            this.method86(-45213);
            this.field158.method173(super.field1650, false, 550, 4);
        }
        if (this.field186 != -1) {
            this.field121 = true;
        }
        if (this.field121) {
            if (this.field186 != -1 && this.field234 == this.field186) {
                this.field186 = -1;
                this.field310.method314(43776, 114);
                this.field310.method315(this.field234);
            }
            this.field121 = false;
            this.field91.method172(-130);
            this.field473.method246(0, 0, 2);
            if (this.field541 == -1) {
                if (this.field255[this.field234] != -1) {
                    if (this.field234 == 0) {
                        this.field334.method246(22, 10, 2);
                    }
                    if (this.field234 == 1) {
                        this.field335.method246(54, 8, 2);
                    }
                    if (this.field234 == 2) {
                        this.field335.method246(82, 8, 2);
                    }
                    if (this.field234 == 3) {
                        this.field336.method246(110, 8, 2);
                    }
                    if (this.field234 == 4) {
                        this.field338.method246(153, 8, 2);
                    }
                    if (this.field234 == 5) {
                        this.field338.method246(181, 8, 2);
                    }
                    if (this.field234 == 6) {
                        this.field337.method246(209, 9, 2);
                    }
                }
                if (this.field255[0] != -1 && (this.field186 != 0 || field369 % 20 < 10)) {
                    this.field513[0].method246(29, 13, 2);
                }
                if (this.field255[1] != -1 && (this.field186 != 1 || field369 % 20 < 10)) {
                    this.field513[1].method246(53, 11, 2);
                }
                if (this.field255[2] != -1 && (this.field186 != 2 || field369 % 20 < 10)) {
                    this.field513[2].method246(82, 11, 2);
                }
                if (this.field255[3] != -1 && (this.field186 != 3 || field369 % 20 < 10)) {
                    this.field513[3].method246(115, 12, 2);
                }
                if (this.field255[4] != -1 && (this.field186 != 4 || field369 % 20 < 10)) {
                    this.field513[4].method246(153, 13, 2);
                }
                if (this.field255[5] != -1 && (this.field186 != 5 || field369 % 20 < 10)) {
                    this.field513[5].method246(180, 11, 2);
                }
                if (this.field255[6] != -1 && (this.field186 != 6 || field369 % 20 < 10)) {
                    this.field513[6].method246(208, 13, 2);
                }
            }
            this.field91.method173(super.field1650, false, 516, 160);
            this.field90.method172(-130);
            this.field472.method246(0, 0, 2);
            if (this.field541 == -1) {
                if (this.field255[this.field234] != -1) {
                    if (this.field234 == 7) {
                        this.field164.method246(42, 0, 2);
                    }
                    if (this.field234 == 8) {
                        this.field165.method246(74, 0, 2);
                    }
                    if (this.field234 == 9) {
                        this.field165.method246(102, 0, 2);
                    }
                    if (this.field234 == 10) {
                        this.field166.method246(130, 1, 2);
                    }
                    if (this.field234 == 11) {
                        this.field168.method246(173, 0, 2);
                    }
                    if (this.field234 == 12) {
                        this.field168.method246(201, 0, 2);
                    }
                    if (this.field234 == 13) {
                        this.field167.method246(229, 0, 2);
                    }
                }
                if (this.field255[8] != -1 && (this.field186 != 8 || field369 % 20 < 10)) {
                    this.field513[7].method246(74, 2, 2);
                }
                if (this.field255[9] != -1 && (this.field186 != 9 || field369 % 20 < 10)) {
                    this.field513[8].method246(102, 3, 2);
                }
                if (this.field255[10] != -1 && (this.field186 != 10 || field369 % 20 < 10)) {
                    this.field513[9].method246(137, 4, 2);
                }
                if (this.field255[11] != -1 && (this.field186 != 11 || field369 % 20 < 10)) {
                    this.field513[10].method246(174, 2, 2);
                }
                if (this.field255[12] != -1 && (this.field186 != 12 || field369 % 20 < 10)) {
                    this.field513[11].method246(201, 2, 2);
                }
                if (this.field255[13] != -1 && (this.field186 != 13 || field369 % 20 < 10)) {
                    this.field513[12].method246(226, 2, 2);
                }
            }
            this.field90.method173(super.field1650, false, 496, 466);
            this.field159.method172(-130);
        }
        if (this.field124) {
            this.field124 = false;
            this.field89.method172(-130);
            this.field471.method246(0, 0, 2);
            this.field297.method459("Public chat", 16777215, true, 55, (byte) -38, 28);
            if (this.field511 == 0) {
                this.field297.method459("On", 65280, true, 55, (byte) -38, 41);
            }
            if (this.field511 == 1) {
                this.field297.method459("Friends", 16776960, true, 55, (byte) -38, 41);
            }
            if (this.field511 == 2) {
                this.field297.method459("Off", 16711680, true, 55, (byte) -38, 41);
            }
            if (this.field511 == 3) {
                this.field297.method459("Hide", 65535, true, 55, (byte) -38, 41);
            }
            this.field297.method459("Private chat", 16777215, true, 184, (byte) -38, 28);
            if (this.field112 == 0) {
                this.field297.method459("On", 65280, true, 184, (byte) -38, 41);
            }
            if (this.field112 == 1) {
                this.field297.method459("Friends", 16776960, true, 184, (byte) -38, 41);
            }
            if (this.field112 == 2) {
                this.field297.method459("Off", 16711680, true, 184, (byte) -38, 41);
            }
            this.field297.method459("Trade/compete", 16777215, true, 324, (byte) -38, 28);
            if (this.field341 == 0) {
                this.field297.method459("On", 65280, true, 324, (byte) -38, 41);
            }
            if (this.field341 == 1) {
                this.field297.method459("Friends", 16776960, true, 324, (byte) -38, 41);
            }
            if (this.field341 == 2) {
                this.field297.method459("Off", 16711680, true, 324, (byte) -38, 41);
            }
            this.field297.method459("Report abuse", 16777215, true, 458, (byte) -38, 33);
            this.field89.method173(super.field1650, false, 0, 453);
            this.field159.method172(-130);
        }
        this.field455 = 0;
        if (arg0) {
            this.field182 = this.field365.method402();
        }
    }

    @OriginalMember(owner = "client", name = "A", descriptor = "(I)Ljava/lang/String;")
    public final String method115(int arg0) {
        if (this.field371 != arg0) {
            this.field328 = 338;
        }
        if (signlink.mainapp != null) {
            return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
        } else {
            return super.field1653 != null ? "runescape.com" : super.getDocumentBase().getHost().toLowerCase();
        }
    }

    @OriginalMember(owner = "client", name = "B", descriptor = "(I)V")
    public final void method116(int arg0) {
        if (arg0 >= 0) {
            this.field328 = this.field365.method402();
        }
        class72.field1688.method223();
        class72.field1697.method223();
        class6.field576.method223();
        class3.field63.method223();
        class3.field46.method223();
        class29.field856.method223();
        class37.field982.method223();
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILMQZHAILV;I)V")
    private final void method117(int arg0, class33 arg1, int arg2) {
        arg1.method335(141);
        int var4 = 18 / arg0;
        int var5 = arg1.method336(-29762, 1);
        if (var5 != 0) {
            int var6 = arg1.method336(-29762, 2);
            if (var6 == 0) {
                this.field462[this.field461++] = this.field457;
            } else if (var6 == 1) {
                int var7 = arg1.method336(-29762, 3);
                field144.method479(6, false, var7);
                int var8 = arg1.method336(-29762, 1);
                if (var8 == 1) {
                    this.field462[this.field461++] = this.field457;
                }
            } else if (var6 == 2) {
                int var9 = arg1.method336(-29762, 3);
                field144.method479(6, true, var9);
                int var10 = arg1.method336(-29762, 3);
                field144.method479(6, true, var10);
                int var11 = arg1.method336(-29762, 1);
                if (var11 == 1) {
                    this.field462[this.field461++] = this.field457;
                }
            } else if (var6 == 3) {
                int var12 = arg1.method336(-29762, 7);
                int var13 = arg1.method336(-29762, 7);
                this.field426 = arg1.method336(-29762, 2);
                int var14 = arg1.method336(-29762, 1);
                if (var14 == 1) {
                    this.field462[this.field461++] = this.field457;
                }
                int var15 = arg1.method336(-29762, 1);
                field144.method480(var12, var13, -364, var15 == 1);
            }
        }
    }

    @OriginalMember(owner = "client", name = "k", descriptor = "(Z)V")
    public final void method118(boolean arg0) {
        if (!arg0) {
            this.field489 = -1;
        }
        try {
            int var2 = field144.field1206 + this.field467;
            int var3 = field144.field1207 + this.field285;
            if (this.field532 - var2 < -500 || this.field532 - var2 > 500 || this.field533 - var3 < -500 || this.field533 - var3 > 500) {
                this.field532 = var2;
                this.field533 = var3;
            }
            if (this.field532 != var2) {
                this.field532 += (var2 - this.field532) / 16;
            }
            if (this.field533 != var3) {
                this.field533 += (var3 - this.field533) / 16;
            }
            if (super.field1668[1] == 1) {
                this.field385 += (-24 - this.field385) / 2;
            } else if (super.field1668[2] == 1) {
                this.field385 += (24 - this.field385) / 2;
            } else {
                this.field385 /= 2;
            }
            if (super.field1668[3] == 1) {
                this.field386 += (12 - this.field386) / 2;
            } else if (super.field1668[4] == 1) {
                this.field386 += (-12 - this.field386) / 2;
            } else {
                this.field386 /= 2;
            }
            this.field384 = this.field385 / 2 + this.field384 & 2047;
            this.field383 += this.field386 / 2;
            if (this.field383 < 128) {
                this.field383 = 128;
            }
            if (this.field383 > 383) {
                this.field383 = 383;
            }
            int var4 = this.field532 >> 7;
            int var5 = this.field533 >> 7;
            int var6 = this.method24(this.field532, -8947, this.field533, this.field426);
            int var7 = 0;
            if (var4 > 3 && var5 > 3 && var4 < 100 && var5 < 100) {
                for (int var8 = var4 - 4; var8 <= var4 + 4; ++var8) {
                    for (int var9 = var5 - 4; var9 <= var5 + 4; ++var9) {
                        int var10 = this.field426;
                        if (var10 < 3 && (this.field517[1][var8][var9] & 2) == 2) {
                            ++var10;
                        }
                        int var11 = var6 - this.field434[var10][var8][var9];
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
            if (var12 > this.field143) {
                this.field143 += (var12 - this.field143) / 24;
            } else if (var12 < this.field143) {
                this.field143 += (var12 - this.field143) / 80;
            }
        } catch (Exception var13) {
            signlink.reporterror("glfc_ex " + field144.field1206 + "," + field144.field1207 + "," + this.field532 + "," + this.field533 + "," + this.field308 + "," + this.field309 + "," + this.field499 + "," + this.field500);
            throw new RuntimeException("eek");
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IZ)V")
    public final void method119(int arg0, boolean arg1) {
        if (arg0 >= 0) {
            if (this.field153 != 0) {
                this.field153 = 0;
                this.field401 = true;
            }
            int var3 = this.field356[arg0];
            int var4 = this.field357[arg0];
            int var5 = this.field358[arg0];
            int var6 = this.field359[arg0];
            if (arg1) {
                this.field538 = null;
            }
            if (var5 >= 2000) {
                var5 -= 2000;
            }
            if (var5 == 214) {
                class36 var7 = this.field133[var6];
                if (var7 != null) {
                    this.method22(0, var7.field1229[0], 2, 1, 0, var7.field1228[0], field144.field1228[0], 0, 1, false, (byte) -48, field144.field1229[0]);
                    this.field441 = super.field1665;
                    this.field442 = super.field1666;
                    this.field444 = 2;
                    this.field443 = 0;
                    this.field310.method314(43776, 44);
                    this.field310.method316(var6);
                    this.field310.method351(this.field475, 46574);
                }
            }
            if (var5 == 337 && this.method47((byte) 2, var4, var3, var6)) {
                this.field310.method314(43776, 149);
                this.field310.method351(this.field499 + var3, 46574);
                this.field310.method350(var6 >> 14 & 32767, -13310);
                this.field310.method316(this.field475);
                this.field310.method316(this.field500 + var4);
            }
            if (var5 == 115) {
                this.method47((byte) 2, var4, var3, var6);
                this.field310.method314(43776, 75);
                this.field310.method349(this.field185, this.field499 + var3);
                this.field310.method351(var6 >> 14 & 32767, 46574);
                this.field310.method349(this.field185, this.field500 + var4);
            }
            if (var5 == 245) {
                this.field310.method314(43776, 228);
                this.field310.method316(var3);
                this.field310.method316(var4);
                this.field310.method316(var6);
                this.field387 = 0;
                this.field388 = var4;
                this.field389 = var3;
                this.field390 = 2;
                if (class52.field1258[var4].field1271 == this.field347) {
                    this.field390 = 1;
                }
                if (class52.field1258[var4].field1271 == this.field301) {
                    this.field390 = 3;
                }
            }
            if (var5 == 1161) {
                this.method47((byte) 2, var4, var3, var6);
                this.field310.method314(43776, 136);
                this.field310.method349(this.field185, this.field499 + var3);
                this.field310.method316(this.field500 + var4);
                this.field310.method349(this.field185, var6 >> 14 & 32767);
            }
            if (var5 == 488 && !this.field352) {
                this.field310.method314(43776, 60);
                this.field310.method316(var4);
                this.field352 = true;
            }
            if (var5 == 803) {
                this.field310.method314(43776, 39);
                this.field310.method351(var6, 46574);
                this.field310.method349(this.field185, var3);
                this.field310.method351(var4, 46574);
                this.field387 = 0;
                this.field388 = var4;
                this.field389 = var3;
                this.field390 = 2;
                if (class52.field1258[var4].field1271 == this.field347) {
                    this.field390 = 1;
                }
                if (class52.field1258[var4].field1271 == this.field301) {
                    this.field390 = 3;
                }
            }
            if (var5 == 899) {
                this.method47((byte) 2, var4, var3, var6);
                this.field310.method314(43776, 97);
                this.field310.method351(this.field499 + var3, 46574);
                this.field310.method351(var6 >> 14 & 32767, 46574);
                this.field310.method316(this.field500 + var4);
            }
            if (var5 == 677) {
                class36 var8 = this.field133[var6];
                if (var8 != null) {
                    this.method22(0, var8.field1229[0], 2, 1, 0, var8.field1228[0], field144.field1228[0], 0, 1, false, (byte) -48, field144.field1229[0]);
                    this.field441 = super.field1665;
                    this.field442 = super.field1666;
                    this.field444 = 2;
                    this.field443 = 0;
                    ++field436;
                    if (field436 >= 90) {
                        this.field310.method314(43776, 11);
                        this.field310.method316(19580);
                        field436 = 0;
                    }
                    this.field310.method314(43776, 139);
                    this.field310.method351(var6, 46574);
                }
            }
            if (var5 == 140) {
                String var9 = this.field137[arg0];
                int var10 = var9.indexOf("@whi@");
                if (var10 != -1) {
                    if (this.field347 == -1) {
                        this.method128(true);
                        this.field187 = var9.substring(var10 + 5).trim();
                        this.field354 = false;
                        for (int var11 = 0; var11 < class52.field1258.length; ++var11) {
                            if (class52.field1258[var11] != null && class52.field1258[var11].field1262 == 600) {
                                this.field428 = this.field347 = class52.field1258[var11].field1271;
                                break;
                            }
                        }
                    } else {
                        this.method25(0, "", 0, "Please close the interface you have open before using 'report abuse'");
                    }
                }
            }
            if (var5 == 672) {
                if (!this.field74) {
                    this.field243.method444(super.field1665 - 4, -27225, super.field1666 - 4);
                } else {
                    this.field243.method444(var3 - 4, -27225, var4 - 4);
                }
            }
            if (var5 == 755) {
                class29 var12 = this.field458[var6];
                if (var12 != null) {
                    this.method22(0, var12.field1229[0], 2, 1, 0, var12.field1228[0], field144.field1228[0], 0, 1, false, (byte) -48, field144.field1229[0]);
                    this.field441 = super.field1665;
                    this.field442 = super.field1666;
                    this.field444 = 2;
                    this.field443 = 0;
                    this.field310.method314(43776, 22);
                    this.field310.method316(var6);
                }
            }
            if (var5 == 148) {
                this.method128(true);
            }
            if (var5 == 50) {
                boolean var13 = this.method22(0, var4, 2, 0, 0, var3, field144.field1228[0], 0, 0, false, (byte) -48, field144.field1229[0]);
                if (!var13) {
                    this.method22(0, var4, 2, 1, 0, var3, field144.field1228[0], 0, 1, false, (byte) -48, field144.field1229[0]);
                }
                this.field441 = super.field1665;
                this.field442 = super.field1666;
                this.field444 = 2;
                this.field443 = 0;
                this.field310.method314(43776, 14);
                this.field310.method349(this.field185, this.field500 + var4);
                this.field310.method316(var6);
                this.field310.method349(this.field185, this.field499 + var3);
            }
            if (var5 == 469) {
                this.field310.method314(43776, 249);
                this.field310.method316(var4);
                class52 var15 = class52.field1258[var4];
                if (var15.field1261 != null && var15.field1261[0][0] == 5) {
                    int var16 = var15.field1261[0][1];
                    this.field232[var16] = 1 - this.field232[var16];
                    this.method39(this.field380, var16);
                    this.field438 = true;
                }
            }
            if (var5 == 510) {
                class29 var17 = this.field458[var6];
                if (var17 != null) {
                    this.method22(0, var17.field1229[0], 2, 1, 0, var17.field1228[0], field144.field1228[0], 0, 1, false, (byte) -48, field144.field1229[0]);
                    this.field441 = super.field1665;
                    this.field442 = super.field1666;
                    this.field444 = 2;
                    this.field443 = 0;
                    this.field310.method314(43776, 175);
                    this.field310.method316(var6);
                }
            }
            if (var5 == 704) {
                String var18 = this.field137[arg0];
                int var19 = var18.indexOf("@whi@");
                if (var19 != -1) {
                    long var20 = class39.method367(var18.substring(var19 + 5).trim());
                    int var22 = -1;
                    for (int var23 = 0; var23 < this.field325; ++var23) {
                        if (this.field483[var23] == var20) {
                            var22 = var23;
                            break;
                        }
                    }
                    if (var22 != -1 && this.field432[var22] > 0) {
                        this.field401 = true;
                        this.field153 = 0;
                        this.field257 = true;
                        this.field83 = "";
                        this.field79 = 3;
                        this.field343 = this.field483[var22];
                        this.field120 = "Enter message to send to " + this.field425[var22];
                    }
                }
            }
            if (var5 == 539 || var5 == 633 || var5 == 361 || var5 == 128) {
                String var24 = this.field137[arg0];
                int var25 = var24.indexOf("@whi@");
                if (var25 != -1) {
                    long var26 = class39.method367(var24.substring(var25 + 5).trim());
                    if (var5 == 539) {
                        this.method106(1123, var26);
                    }
                    if (var5 == 633) {
                        this.method129(-13110, var26);
                    }
                    if (var5 == 361) {
                        this.method84(-989, var26);
                    }
                    if (var5 == 128) {
                        this.method150(818, var26);
                    }
                }
            }
            if (var5 == 957) {
                class29 var28 = this.field458[var6];
                if (var28 != null) {
                    this.method22(0, var28.field1229[0], 2, 1, 0, var28.field1228[0], field144.field1228[0], 0, 1, false, (byte) -48, field144.field1229[0]);
                    this.field441 = super.field1665;
                    this.field442 = super.field1666;
                    this.field444 = 2;
                    this.field443 = 0;
                    this.field310.method314(43776, 213);
                    this.field310.method350(this.field148, -13310);
                    this.field310.method351(this.field150, 46574);
                    this.field310.method349(this.field185, this.field149);
                    this.field310.method316(var6);
                }
            }
            if (var5 == 1520) {
                class36 var29 = this.field133[var6];
                if (var29 != null) {
                    class6 var30 = var29.field966;
                    if (var30.field583 != null) {
                        var30 = var30.method167(0);
                    }
                    if (var30 != null) {
                        String var31;
                        if (var30.field568 != null) {
                            var31 = new String(var30.field568);
                        } else {
                            var31 = "It's a " + var30.field589 + ".";
                        }
                        this.method25(0, "", 0, var31);
                    }
                }
            }
            if (var5 == 962) {
                this.field310.method314(43776, 140);
                this.field310.method350(var6, -13310);
                this.field310.method316(var4);
                this.field310.method316(var3);
                this.field387 = 0;
                this.field388 = var4;
                this.field389 = var3;
                this.field390 = 2;
                if (class52.field1258[var4].field1271 == this.field347) {
                    this.field390 = 1;
                }
                if (class52.field1258[var4].field1271 == this.field301) {
                    this.field390 = 3;
                }
            }
            if (var5 == 782) {
                boolean var32 = this.method22(0, var4, 2, 0, 0, var3, field144.field1228[0], 0, 0, false, (byte) -48, field144.field1229[0]);
                if (!var32) {
                    this.method22(0, var4, 2, 1, 0, var3, field144.field1228[0], 0, 1, false, (byte) -48, field144.field1229[0]);
                }
                this.field441 = super.field1665;
                this.field442 = super.field1666;
                this.field444 = 2;
                this.field443 = 0;
                this.field310.method314(43776, 43);
                this.field310.method349(this.field185, this.field500 + var4);
                this.field310.method351(this.field499 + var3, 46574);
                this.field310.method349(this.field185, this.field150);
                this.field310.method350(this.field149, -13310);
                this.field310.method316(var6);
                this.field310.method316(this.field148);
            }
            if (var5 == 1566) {
                class3 var34 = class3.method13(var6);
                String var35;
                if (var34.field31 != null) {
                    var35 = new String(var34.field31);
                } else {
                    var35 = "It's a " + var34.field43 + ".";
                }
                this.method25(0, "", 0, var35);
            }
            if (var5 == 60) {
                boolean var36 = this.method22(0, var4, 2, 0, 0, var3, field144.field1228[0], 0, 0, false, (byte) -48, field144.field1229[0]);
                if (!var36) {
                    this.method22(0, var4, 2, 1, 0, var3, field144.field1228[0], 0, 1, false, (byte) -48, field144.field1229[0]);
                }
                this.field441 = super.field1665;
                this.field442 = super.field1666;
                this.field444 = 2;
                this.field443 = 0;
                this.field310.method314(43776, 134);
                this.field310.method351(this.field500 + var4, 46574);
                this.field310.method316(var6);
                this.field310.method316(this.field499 + var3);
            }
            if (var5 == 475) {
                class36 var38 = this.field133[var6];
                if (var38 != null) {
                    this.method22(0, var38.field1229[0], 2, 1, 0, var38.field1228[0], field144.field1228[0], 0, 1, false, (byte) -48, field144.field1229[0]);
                    this.field441 = super.field1665;
                    this.field442 = super.field1666;
                    this.field444 = 2;
                    this.field443 = 0;
                    if ((var6 & 3) == 0) {
                        ++field406;
                    }
                    if (field406 >= 128) {
                        this.field310.method314(43776, 174);
                        this.field310.method316(18260);
                        field406 = 0;
                    }
                    this.field310.method314(43776, 238);
                    this.field310.method351(var6, 46574);
                }
            }
            if (var5 == 527) {
                class29 var39 = this.field458[var6];
                if (var39 != null) {
                    this.method22(0, var39.field1229[0], 2, 1, 0, var39.field1228[0], field144.field1228[0], 0, 1, false, (byte) -48, field144.field1229[0]);
                    this.field441 = super.field1665;
                    this.field442 = super.field1666;
                    this.field444 = 2;
                    this.field443 = 0;
                    this.field310.method314(43776, 98);
                    this.field310.method316(var6);
                }
            }
            if (var5 == 543) {
                this.field310.method314(43776, 199);
                this.field310.method316(this.field148);
                this.field310.method349(this.field185, this.field149);
                this.field310.method316(var6);
                this.field310.method316(this.field150);
                this.field310.method350(var3, -13310);
                this.field310.method350(var4, -13310);
                this.field387 = 0;
                this.field388 = var4;
                this.field389 = var3;
                this.field390 = 2;
                if (class52.field1258[var4].field1271 == this.field347) {
                    this.field390 = 1;
                }
                if (class52.field1258[var4].field1271 == this.field301) {
                    this.field390 = 3;
                }
            }
            if (var5 == 461) {
                boolean var40 = this.method22(0, var4, 2, 0, 0, var3, field144.field1228[0], 0, 0, false, (byte) -48, field144.field1229[0]);
                if (!var40) {
                    this.method22(0, var4, 2, 1, 0, var3, field144.field1228[0], 0, 1, false, (byte) -48, field144.field1229[0]);
                }
                this.field441 = super.field1665;
                this.field442 = super.field1666;
                this.field444 = 2;
                this.field443 = 0;
                this.field310.method314(43776, 254);
                this.field310.method351(this.field475, 46574);
                this.field310.method351(this.field499 + var3, 46574);
                this.field310.method349(this.field185, var6);
                this.field310.method350(this.field500 + var4, -13310);
            }
            if (var5 == 938) {
                class52 var42 = class52.field1258[var4];
                boolean var43 = true;
                if (var42.field1262 > 0) {
                    var43 = this.method64(var42, 3);
                }
                if (var43) {
                    this.field310.method314(43776, 249);
                    this.field310.method316(var4);
                }
            }
            if (var5 == 381) {
                class36 var44 = this.field133[var6];
                if (var44 != null) {
                    this.method22(0, var44.field1229[0], 2, 1, 0, var44.field1228[0], field144.field1228[0], 0, 1, false, (byte) -48, field144.field1229[0]);
                    this.field441 = super.field1665;
                    this.field442 = super.field1666;
                    this.field444 = 2;
                    this.field443 = 0;
                    if ((var6 & 3) == 0) {
                        ++field227;
                    }
                    if (field227 >= 91) {
                        this.field310.method314(43776, 24);
                        this.field310.method315(48);
                        field227 = 0;
                    }
                    this.field310.method314(43776, 173);
                    this.field310.method351(var6, 46574);
                }
            }
            if (var5 == 65) {
                this.field310.method314(43776, 67);
                this.field310.method350(var3, -13310);
                this.field310.method350(var6, -13310);
                this.field310.method349(this.field185, var4);
                this.field310.method351(this.field475, 46574);
                this.field387 = 0;
                this.field388 = var4;
                this.field389 = var3;
                this.field390 = 2;
                if (class52.field1258[var4].field1271 == this.field347) {
                    this.field390 = 1;
                }
                if (class52.field1258[var4].field1271 == this.field301) {
                    this.field390 = 3;
                }
            }
            if (var5 == 913) {
                this.field310.method314(43776, 249);
                this.field310.method316(var4);
                class52 var45 = class52.field1258[var4];
                if (var45.field1261 != null && var45.field1261[0][0] == 5) {
                    int var46 = var45.field1261[0][1];
                    if (this.field232[var46] != var45.field1297[0]) {
                        this.field232[var46] = var45.field1297[0];
                        this.method39(this.field380, var46);
                        this.field438 = true;
                    }
                }
            }
            if (var5 == 616) {
                this.field310.method314(43776, 240);
                this.field310.method351(var4, 46574);
                this.field310.method351(var6, 46574);
                this.field310.method350(var3, -13310);
                this.field387 = 0;
                this.field388 = var4;
                this.field389 = var3;
                this.field390 = 2;
                if (class52.field1258[var4].field1271 == this.field347) {
                    this.field390 = 1;
                }
                if (class52.field1258[var4].field1271 == this.field301) {
                    this.field390 = 3;
                }
            }
            if (var5 == 88) {
                class29 var47 = this.field458[var6];
                if (var47 != null) {
                    this.method22(0, var47.field1229[0], 2, 1, 0, var47.field1228[0], field144.field1228[0], 0, 1, false, (byte) -48, field144.field1229[0]);
                    this.field441 = super.field1665;
                    this.field442 = super.field1666;
                    this.field444 = 2;
                    this.field443 = 0;
                    this.field310.method314(43776, 5);
                    this.field310.method316(var6);
                    this.field310.method351(this.field475, 46574);
                }
            }
            if (var5 == 205) {
                class36 var48 = this.field133[var6];
                if (var48 != null) {
                    this.method22(0, var48.field1229[0], 2, 1, 0, var48.field1228[0], field144.field1228[0], 0, 1, false, (byte) -48, field144.field1229[0]);
                    this.field441 = super.field1665;
                    this.field442 = super.field1666;
                    this.field444 = 2;
                    this.field443 = 0;
                    this.field310.method314(43776, 45);
                    this.field310.method316(var6);
                }
            }
            if (var5 == 664) {
                this.field310.method314(43776, 94);
                this.field310.method316(var4);
                this.field310.method349(this.field185, var6);
                this.field310.method316(var3);
                this.field387 = 0;
                this.field388 = var4;
                this.field389 = var3;
                this.field390 = 2;
                if (class52.field1258[var4].field1271 == this.field347) {
                    this.field390 = 1;
                }
                if (class52.field1258[var4].field1271 == this.field301) {
                    this.field390 = 3;
                }
            }
            if (var5 == 836) {
                class52 var49 = class52.field1258[var4];
                this.field474 = 1;
                this.field475 = var4;
                this.field476 = var49.field1280;
                this.field147 = 0;
                this.field438 = true;
                String var50 = var49.field1325;
                if (var50.indexOf(" ") != -1) {
                    var50 = var50.substring(0, var50.indexOf(" "));
                }
                String var51 = var49.field1325;
                if (var51.indexOf(" ") != -1) {
                    var51 = var51.substring(var51.indexOf(" ") + 1);
                }
                this.field477 = var50 + " " + var49.field1273 + " " + var51;
                if (this.field476 == 16) {
                    this.field438 = true;
                    this.field234 = 3;
                    this.field121 = true;
                }
            } else {
                if (var5 == 32) {
                    class29 var52 = this.field458[var6];
                    if (var52 != null) {
                        this.method22(0, var52.field1229[0], 2, 1, 0, var52.field1228[0], field144.field1228[0], 0, 1, false, (byte) -48, field144.field1229[0]);
                        this.field441 = super.field1665;
                        this.field442 = super.field1666;
                        this.field444 = 2;
                        this.field443 = 0;
                        this.field310.method314(43776, 30);
                        this.field310.method350(var6, -13310);
                    }
                }
                if (var5 == 814) {
                    boolean var53 = this.method22(0, var4, 2, 0, 0, var3, field144.field1228[0], 0, 0, false, (byte) -48, field144.field1229[0]);
                    if (!var53) {
                        this.method22(0, var4, 2, 1, 0, var3, field144.field1228[0], 0, 1, false, (byte) -48, field144.field1229[0]);
                    }
                    this.field441 = super.field1665;
                    this.field442 = super.field1666;
                    this.field444 = 2;
                    this.field443 = 0;
                    this.field310.method314(43776, 27);
                    this.field310.method349(this.field185, this.field500 + var4);
                    this.field310.method349(this.field185, var6);
                    this.field310.method316(this.field499 + var3);
                }
                if (var5 == 415) {
                    boolean var55 = this.method22(0, var4, 2, 0, 0, var3, field144.field1228[0], 0, 0, false, (byte) -48, field144.field1229[0]);
                    if (!var55) {
                        this.method22(0, var4, 2, 1, 0, var3, field144.field1228[0], 0, 1, false, (byte) -48, field144.field1229[0]);
                    }
                    this.field441 = super.field1665;
                    this.field442 = super.field1666;
                    this.field444 = 2;
                    this.field443 = 0;
                    this.field310.method314(43776, 234);
                    this.field310.method316(this.field499 + var3);
                    this.field310.method350(var6, -13310);
                    this.field310.method316(this.field500 + var4);
                }
                if (var5 == 344) {
                    if ((var3 & 3) == 0) {
                        ++field259;
                    }
                    if (field259 >= 113) {
                        this.field310.method314(43776, 218);
                        this.field310.method319(0);
                        field259 = 0;
                    }
                    this.field310.method314(43776, 162);
                    this.field310.method316(var6);
                    this.field310.method350(var4, -13310);
                    this.field310.method316(var3);
                    this.field387 = 0;
                    this.field388 = var4;
                    this.field389 = var3;
                    this.field390 = 2;
                    if (class52.field1258[var4].field1271 == this.field347) {
                        this.field390 = 1;
                    }
                    if (class52.field1258[var4].field1271 == this.field301) {
                        this.field390 = 3;
                    }
                }
                if (var5 == 531) {
                    class29 var57 = this.field458[var6];
                    if (var57 != null) {
                        this.method22(0, var57.field1229[0], 2, 1, 0, var57.field1228[0], field144.field1228[0], 0, 1, false, (byte) -48, field144.field1229[0]);
                        this.field441 = super.field1665;
                        this.field442 = super.field1666;
                        this.field444 = 2;
                        this.field443 = 0;
                        this.field310.method314(43776, 53);
                        this.field310.method351(var6, 46574);
                    }
                }
                if (var5 == 823) {
                    this.field310.method314(43776, 184);
                    this.field310.method350(var6, -13310);
                    this.field310.method349(this.field185, var3);
                    this.field310.method349(this.field185, var4);
                    this.field387 = 0;
                    this.field388 = var4;
                    this.field389 = var3;
                    this.field390 = 2;
                    if (class52.field1258[var4].field1271 == this.field347) {
                        this.field390 = 1;
                    }
                    if (class52.field1258[var4].field1271 == this.field301) {
                        this.field390 = 3;
                    }
                }
                if (var5 == 413) {
                    this.method47((byte) 2, var4, var3, var6);
                    this.field310.method314(43776, 101);
                    this.field310.method350(var6 >> 14 & 32767, -13310);
                    this.field310.method351(this.field500 + var4, 46574);
                    this.field310.method316(this.field499 + var3);
                }
                if (var5 == 516) {
                    boolean var58 = this.method22(0, var4, 2, 0, 0, var3, field144.field1228[0], 0, 0, false, (byte) -48, field144.field1229[0]);
                    if (!var58) {
                        this.method22(0, var4, 2, 1, 0, var3, field144.field1228[0], 0, 1, false, (byte) -48, field144.field1229[0]);
                    }
                    this.field441 = super.field1665;
                    this.field442 = super.field1666;
                    this.field444 = 2;
                    this.field443 = 0;
                    ++field451;
                    if (field451 >= 101) {
                        this.field310.method314(43776, 85);
                        this.field310.method315(68);
                        field451 = 0;
                    }
                    this.field310.method314(43776, 241);
                    this.field310.method350(this.field500 + var4, -13310);
                    this.field310.method351(this.field499 + var3, 46574);
                    this.field310.method349(this.field185, var6);
                }
                if (var5 == 276) {
                    field156 += var4;
                    if (field156 >= 117) {
                        this.field310.method314(43776, 151);
                        this.field310.method316(22816);
                        field156 = 0;
                    }
                    this.method47((byte) 2, var4, var3, var6);
                    this.field310.method314(43776, 226);
                    this.field310.method350(this.field499 + var3, -13310);
                    this.field310.method316(this.field500 + var4);
                    this.field310.method349(this.field185, var6 >> 14 & 32767);
                }
                if (var5 == 758) {
                    this.field310.method314(43776, 64);
                    this.field310.method316(var3);
                    this.field310.method351(var6, 46574);
                    this.field310.method316(var4);
                    this.field387 = 0;
                    this.field388 = var4;
                    this.field389 = var3;
                    this.field390 = 2;
                    if (class52.field1258[var4].field1271 == this.field347) {
                        this.field390 = 1;
                    }
                    if (class52.field1258[var4].field1271 == this.field301) {
                        this.field390 = 3;
                    }
                }
                if (var5 == 598) {
                    this.field310.method314(43776, 167);
                    this.field310.method351(var3, 46574);
                    this.field310.method316(var6);
                    this.field310.method316(var4);
                    this.field387 = 0;
                    this.field388 = var4;
                    this.field389 = var3;
                    this.field390 = 2;
                    if (class52.field1258[var4].field1271 == this.field347) {
                        this.field390 = 1;
                    }
                    if (class52.field1258[var4].field1271 == this.field301) {
                        this.field390 = 3;
                    }
                }
                if (var5 == 63) {
                    ++field95;
                    if (field95 >= 121) {
                        this.field310.method314(43776, 205);
                        this.field310.method318(13187396);
                        field95 = 0;
                    }
                    this.field310.method314(43776, 253);
                    this.field310.method351(var4, 46574);
                    this.field310.method316(var3);
                    this.field310.method349(this.field185, var6);
                    this.field387 = 0;
                    this.field388 = var4;
                    this.field389 = var3;
                    this.field390 = 2;
                    if (class52.field1258[var4].field1271 == this.field347) {
                        this.field390 = 1;
                    }
                    if (class52.field1258[var4].field1271 == this.field301) {
                        this.field390 = 3;
                    }
                }
                if (var5 == 1230) {
                    int var60 = var6 >> 14 & 32767;
                    class72 var61 = class72.method588(var60);
                    String var62;
                    if (var61.field1719 != null) {
                        var62 = new String(var61.field1719);
                    } else {
                        var62 = "It's a " + var61.field1701 + ".";
                    }
                    this.method25(0, "", 0, var62);
                }
                if (var5 == 37 && this.method47((byte) 2, var4, var3, var6)) {
                    this.field310.method314(43776, 2);
                    this.field310.method351(this.field500 + var4, 46574);
                    this.field310.method350(this.field150, -13310);
                    this.field310.method351(this.field149, 46574);
                    this.field310.method316(this.field148);
                    this.field310.method316(var6 >> 14 & 32767);
                    this.field310.method349(this.field185, this.field499 + var3);
                }
                if (var5 == 345) {
                    class36 var63 = this.field133[var6];
                    if (var63 != null) {
                        this.method22(0, var63.field1229[0], 2, 1, 0, var63.field1228[0], field144.field1228[0], 0, 1, false, (byte) -48, field144.field1229[0]);
                        this.field441 = super.field1665;
                        this.field442 = super.field1666;
                        this.field444 = 2;
                        this.field443 = 0;
                        this.field310.method314(43776, 87);
                        this.field310.method316(this.field150);
                        this.field310.method316(var6);
                        this.field310.method351(this.field149, 46574);
                        this.field310.method316(this.field148);
                    }
                }
                if (var5 == 939) {
                    class36 var64 = this.field133[var6];
                    if (var64 != null) {
                        this.method22(0, var64.field1229[0], 2, 1, 0, var64.field1228[0], field144.field1228[0], 0, 1, false, (byte) -48, field144.field1229[0]);
                        this.field441 = super.field1665;
                        this.field442 = super.field1666;
                        this.field444 = 2;
                        this.field443 = 0;
                        this.field310.method314(43776, 76);
                        this.field310.method351(var6, 46574);
                    }
                }
                if (var5 == 157) {
                    this.field147 = 1;
                    this.field148 = var3;
                    this.field149 = var4;
                    this.field150 = var6;
                    this.field151 = class3.method13(var6).field43;
                    this.field474 = 0;
                    this.field438 = true;
                } else {
                    if (var5 == 744 || var5 == 862) {
                        String var65 = this.field137[arg0];
                        int var66 = var65.indexOf("@whi@");
                        if (var66 != -1) {
                            String var67 = var65.substring(var66 + 5).trim();
                            String var68 = class39.method371(class39.method368((byte) 3, class39.method367(var67)), (byte) -7);
                            boolean var69 = false;
                            for (int var70 = 0; var70 < this.field459; ++var70) {
                                class29 var71 = this.field458[this.field460[var70]];
                                if (var71 != null && var71.field849 != null && var71.field849.equalsIgnoreCase(var68)) {
                                    this.method22(0, var71.field1229[0], 2, 1, 0, var71.field1228[0], field144.field1228[0], 0, 1, false, (byte) -48, field144.field1229[0]);
                                    if (var5 == 744) {
                                        this.field310.method314(43776, 53);
                                        this.field310.method351(this.field460[var70], 46574);
                                    }
                                    if (var5 == 862) {
                                        this.field310.method314(43776, 98);
                                        this.field310.method316(this.field460[var70]);
                                    }
                                    var69 = true;
                                    break;
                                }
                            }
                            if (!var69) {
                                this.method25(0, "", 0, "Unable to find " + var68);
                            }
                        }
                    }
                    if (var5 == 1339) {
                        class3 var72 = class3.method13(var6);
                        class52 var73 = class52.field1258[var4];
                        String var74;
                        if (var73 != null && var73.field1272[var3] >= 100000) {
                            var74 = var73.field1272[var3] + " x " + var72.field43;
                        } else if (var72.field31 != null) {
                            var74 = new String(var72.field31);
                        } else {
                            var74 = "It's a " + var72.field43 + ".";
                        }
                        this.method25(0, "", 0, var74);
                    }
                    this.field147 = 0;
                    this.field474 = 0;
                    this.field438 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "C", descriptor = "(I)V")
    public final void method120(int arg0) {
        for (int var2 = -1; var2 < this.field459; ++var2) {
            int var6;
            if (var2 == -1) {
                var6 = this.field457;
            } else {
                var6 = this.field460[var2];
            }
            class29 var7 = this.field458[var6];
            if (var7 != null && var7.field1249 > 0) {
                --var7.field1249;
                if (var7.field1249 == 0) {
                    var7.field1221 = null;
                }
            }
        }
        if (arg0 < 7 || arg0 > 7) {
            this.field489 = this.field254.method325();
        }
        for (int var3 = 0; var3 < this.field134; ++var3) {
            int var4 = this.field135[var3];
            class36 var5 = this.field133[var4];
            if (var5 != null && var5.field1249 > 0) {
                --var5.field1249;
                if (var5.field1249 == 0) {
                    var5.field1221 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "D", descriptor = "(I)V")
    public final void method121(int arg0) {
        while (arg0 >= 0) {
            this.field372 = this.field365.method402();
        }
        while (true) {
            class24 var2 = this.field329.method534();
            if (var2 == null) {
                return;
            }
            if (var2.field795 == 0) {
                class70.method549(var2.field797, var2.field796, (byte) -64);
                if ((this.field329.method540(var2.field797, 1) & 98) != 0) {
                    this.field438 = true;
                    if (this.field301 != -1) {
                        this.field401 = true;
                    }
                }
            }
            if (var2.field795 == 1 && var2.field796 != null) {
                class60.method510(3, var2.field796);
            }
            if (var2.field795 == 2 && this.field117 == var2.field797 && var2.field796 != null) {
                this.method102(this.field118, (byte) 70, var2.field796);
            }
            if (var2.field795 == 3 && this.field497 == 1) {
                for (int var3 = 0; var3 < this.field289.length; ++var3) {
                    if (this.field449[var3] == var2.field797) {
                        this.field289[var3] = var2.field796;
                        if (var2.field796 == null) {
                            this.field449[var3] = -1;
                        }
                        break;
                    }
                    if (this.field450[var3] == var2.field797) {
                        this.field155[var3] = var2.field796;
                        if (var2.field796 == null) {
                            this.field450[var3] = -1;
                        }
                        break;
                    }
                }
            }
            if (var2.field795 == 93 && this.field329.method542(var2.field797, false)) {
                class31.method287(new class33(true, var2.field796), this.field329, 0);
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(II)V")
    public final void method122(int arg0, int arg1) {
        if (arg1 != 0) {
            this.field489 = this.field254.method325();
        }
        if (!field376) {
            if (class44.field1068[17] >= arg0) {
                class20 var3 = class44.field1062[17];
                int var4 = var3.field749 * var3.field748 - 1;
                int var5 = this.field455 * var3.field748 * 2;
                byte[] var6 = var3.field746;
                byte[] var7 = this.field103;
                for (int var8 = 0; var8 <= var4; ++var8) {
                    var7[var8] = var6[var8 - var5 & var4];
                }
                var3.field746 = var7;
                this.field103 = var6;
                class44.method392(this.field190, 17);
            }
            if (class44.field1068[24] >= arg0) {
                class20 var9 = class44.field1062[24];
                int var10 = var9.field749 * var9.field748 - 1;
                int var11 = this.field455 * var9.field748 * 2;
                byte[] var12 = var9.field746;
                byte[] var13 = this.field103;
                for (int var14 = 0; var14 <= var10; ++var14) {
                    var13[var14] = var12[var14 - var11 & var10];
                }
                var9.field746 = var13;
                this.field103 = var12;
                class44.method392(this.field190, 24);
            }
            if (class44.field1068[34] >= arg0) {
                class20 var15 = class44.field1062[34];
                int var16 = var15.field749 * var15.field748 - 1;
                int var17 = this.field455 * var15.field748 * 2;
                byte[] var18 = var15.field746;
                byte[] var19 = this.field103;
                for (int var20 = 0; var20 <= var16; ++var20) {
                    var19[var20] = var18[var20 - var17 & var16];
                }
                var15.field746 = var19;
                this.field103 = var18;
                class44.method392(this.field190, 34);
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(LMQZHAILV;ZI)V")
    private final void method123(class33 arg0, boolean arg1, int arg2) {
        int var4 = arg0.method336(-29762, 8);
        if (arg1) {
            for (int var5 = 1; var5 > 0; ++var5) {
            }
        }
        if (var4 < this.field459) {
            for (int var6 = var4; var6 < this.field459; ++var6) {
                this.field288[this.field287++] = this.field460[var6];
            }
        }
        if (var4 > this.field459) {
            signlink.reporterror(this.field363 + " Too many players");
            throw new RuntimeException("eek");
        } else {
            this.field459 = 0;
            for (int var7 = 0; var7 < var4; ++var7) {
                int var8 = this.field460[var7];
                class29 var9 = this.field458[var8];
                int var10 = arg0.method336(-29762, 1);
                if (var10 == 0) {
                    this.field460[this.field459++] = var8;
                    var9.field1209 = field369;
                } else {
                    int var11 = arg0.method336(-29762, 2);
                    if (var11 == 0) {
                        this.field460[this.field459++] = var8;
                        var9.field1209 = field369;
                        this.field462[this.field461++] = var8;
                    } else if (var11 == 1) {
                        this.field460[this.field459++] = var8;
                        var9.field1209 = field369;
                        int var12 = arg0.method336(-29762, 3);
                        var9.method479(6, false, var12);
                        int var13 = arg0.method336(-29762, 1);
                        if (var13 == 1) {
                            this.field462[this.field461++] = var8;
                        }
                    } else if (var11 == 2) {
                        this.field460[this.field459++] = var8;
                        var9.field1209 = field369;
                        int var14 = arg0.method336(-29762, 3);
                        var9.method479(6, true, var14);
                        int var15 = arg0.method336(-29762, 3);
                        var9.method479(6, true, var15);
                        int var16 = arg0.method336(-29762, 1);
                        if (var16 == 1) {
                            this.field462[this.field461++] = var8;
                        }
                    } else if (var11 == 3) {
                        this.field288[this.field287++] = var8;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "l", descriptor = "(Z)V")
    public final void method124(boolean arg0) {
        if (arg0) {
            this.field489 = -1;
        }
        this.field160.method172(-130);
        class44.field1060 = this.field344;
        this.field110.method246(0, 0, 2);
        if (this.field257) {
            this.field298.method458(40, 0, 239, this.field120, 0);
            this.field298.method458(60, 128, 239, this.field83 + "*", 0);
        } else if (this.field153 == 1) {
            this.field298.method458(40, 0, 239, "Enter amount:", 0);
            this.field298.method458(60, 128, 239, this.field431 + "*", 0);
        } else if (this.field153 == 2) {
            this.field298.method458(40, 0, 239, "Enter name:", 0);
            this.field298.method458(60, 128, 239, this.field431 + "*", 0);
        } else if (this.field191 != null) {
            this.field298.method458(40, 0, 239, this.field191, 0);
            this.field298.method458(60, 128, 239, "Click to continue", 0);
        } else if (this.field301 != -1) {
            this.method137((byte) 6, 0, 0, class52.field1258[this.field301], 0);
        } else if (this.field427 != -1) {
            this.method137((byte) 6, 0, 0, class52.field1258[this.field427], 0);
        } else {
            class47 var2 = this.field297;
            int var3 = 0;
            class23.method255(77, 0, 463, 0, false);
            for (int var4 = 0; var4 < 100; ++var4) {
                if (this.field294[var4] != null) {
                    int var6 = this.field292[var4];
                    int var7 = 70 - var3 * 14 + this.field265;
                    String var8 = this.field293[var4];
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
                            var2.method462(0, this.field294[var4], 0, var7, 4);
                        }
                        ++var3;
                    }
                    if ((var6 == 1 || var6 == 2) && (var6 == 1 || this.field511 == 0 || this.field511 == 1 && this.method43(var8, false))) {
                        if (var7 > 0 && var7 < 110) {
                            int var10 = 4;
                            if (var9 == 1) {
                                this.field253[0].method246(var10, var7 - 12, 2);
                                var10 += 14;
                            }
                            if (var9 == 2) {
                                this.field253[1].method246(var10, var7 - 12, 2);
                                var10 += 14;
                            }
                            var2.method462(0, var8 + ":", 0, var7, var10);
                            int var11 = var10 + var2.method460(var8, 5) + 8;
                            var2.method462(255, this.field294[var4], 0, var7, var11);
                        }
                        ++var3;
                    }
                    if ((var6 == 3 || var6 == 7) && this.field469 == 0 && (var6 == 7 || this.field112 == 0 || this.field112 == 1 && this.method43(var8, false))) {
                        if (var7 > 0 && var7 < 110) {
                            byte var12 = 4;
                            var2.method462(0, "From", 0, var7, var12);
                            int var13 = var12 + var2.method460("From ", 5);
                            if (var9 == 1) {
                                this.field253[0].method246(var13, var7 - 12, 2);
                                var13 += 14;
                            }
                            if (var9 == 2) {
                                this.field253[1].method246(var13, var7 - 12, 2);
                                var13 += 14;
                            }
                            var2.method462(0, var8 + ":", 0, var7, var13);
                            int var14 = var13 + var2.method460(var8, 5) + 8;
                            var2.method462(8388608, this.field294[var4], 0, var7, var14);
                        }
                        ++var3;
                    }
                    if (var6 == 4 && (this.field341 == 0 || this.field341 == 1 && this.method43(var8, false))) {
                        if (var7 > 0 && var7 < 110) {
                            var2.method462(8388736, var8 + " " + this.field294[var4], 0, var7, 4);
                        }
                        ++var3;
                    }
                    if (var6 == 5 && this.field469 == 0 && this.field112 < 2) {
                        if (var7 > 0 && var7 < 110) {
                            var2.method462(8388608, this.field294[var4], 0, var7, 4);
                        }
                        ++var3;
                    }
                    if (var6 == 6 && this.field469 == 0 && this.field112 < 2) {
                        if (var7 > 0 && var7 < 110) {
                            var2.method462(0, "To " + var8 + ":", 0, var7, 4);
                            var2.method462(8388608, this.field294[var4], 0, var7, 12 + var2.method460("To " + var8, 5));
                        }
                        ++var3;
                    }
                    if (var6 == 8 && (this.field341 == 0 || this.field341 == 1 && this.method43(var8, false))) {
                        if (var7 > 0 && var7 < 110) {
                            var2.method462(8270336, var8 + " " + this.field294[var4], 0, var7, 4);
                        }
                        ++var3;
                    }
                }
            }
            class23.method254((byte) 3);
            this.field339 = var3 * 14 + 7;
            if (this.field339 < 78) {
                this.field339 = 78;
            }
            this.method32(this.field339 - this.field265 - 77, 77, -14692, 463, this.field339, 0);
            String var5;
            if (field144 != null && field144.field849 != null) {
                var5 = field144.field849;
            } else {
                var5 = class39.method371(this.field363, (byte) -7);
            }
            var2.method462(0, var5 + ":", 0, 90, 4);
            var2.method462(255, this.field163 + "*", 0, 90, 6 + var2.method460(var5 + ": ", 5));
            class23.method261(0, (byte) 6, 0, 479, 77);
        }
        if (this.field74 && this.field260 == 2) {
            this.method60(-120);
        }
        this.field160.method173(super.field1650, false, 17, 357);
        this.field159.method172(-130);
        class44.field1060 = this.field346;
    }

    @OriginalMember(owner = "client", name = "m", descriptor = "(Z)V")
    public final void method125(boolean arg0) {
        if (arg0) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        if (this.field537 == 0) {
            int var3 = super.field1648 / 2 - 80;
            int var4 = super.field1649 / 2 + 20;
            int var15 = var4 + 20;
            if (super.field1664 == 1 && super.field1665 >= var3 - 75 && super.field1665 <= var3 + 75 && super.field1666 >= var15 - 20 && super.field1666 <= var15 + 20) {
                this.field537 = 3;
                this.field410 = 0;
            }
            int var5 = super.field1648 / 2 + 80;
            if (super.field1664 == 1 && super.field1665 >= var5 - 75 && super.field1665 <= var5 + 75 && super.field1666 >= var15 - 20 && super.field1666 <= var15 + 20) {
                this.field139 = "";
                this.field140 = "Enter your username & password.";
                this.field537 = 2;
                this.field410 = 0;
            }
        } else if (this.field537 == 2) {
            int var6 = super.field1649 / 2 - 40;
            int var16 = var6 + 30;
            int var17 = var16 + 25;
            if (super.field1664 == 1 && super.field1666 >= var17 - 15 && super.field1666 < var17) {
                this.field410 = 0;
            }
            var6 = var17 + 15;
            if (super.field1664 == 1 && super.field1666 >= var6 - 15 && super.field1666 < var6) {
                this.field410 = 1;
            }
            var6 += 15;
            int var7 = super.field1648 / 2 - 80;
            int var8 = super.field1649 / 2 + 50;
            int var18 = var8 + 20;
            if (super.field1664 == 1 && super.field1665 >= var7 - 75 && super.field1665 <= var7 + 75 && super.field1666 >= var18 - 20 && super.field1666 <= var18 + 20) {
                this.field246 = 0;
                this.method132(this.field363, this.field364, false);
                if (this.field106) {
                    return;
                }
            }
            int var9 = super.field1648 / 2 + 80;
            if (super.field1664 == 1 && super.field1665 >= var9 - 75 && super.field1665 <= var9 + 75 && super.field1666 >= var18 - 20 && super.field1666 <= var18 + 20) {
                this.field537 = 0;
                this.field363 = "";
                this.field364 = "";
            }
            while (true) {
                while (true) {
                    int var10 = this.method580(4);
                    if (var10 == -1) {
                        return;
                    }
                    boolean var11 = false;
                    for (int var12 = 0; var12 < field522.length(); ++var12) {
                        if (var10 == field522.charAt(var12)) {
                            var11 = true;
                            break;
                        }
                    }
                    if (this.field410 == 0) {
                        if (var10 == 8 && this.field363.length() > 0) {
                            this.field363 = this.field363.substring(0, this.field363.length() - 1);
                        }
                        if (var10 == 9 || var10 == 10 || var10 == 13) {
                            this.field410 = 1;
                        }
                        if (var11) {
                            this.field363 = this.field363 + (char) var10;
                        }
                        if (this.field363.length() > 12) {
                            this.field363 = this.field363.substring(0, 12);
                        }
                    } else if (this.field410 == 1) {
                        if (var10 == 8 && this.field364.length() > 0) {
                            this.field364 = this.field364.substring(0, this.field364.length() - 1);
                        }
                        if (var10 == 9 || var10 == 10 || var10 == 13) {
                            this.field410 = 0;
                        }
                        if (var11) {
                            this.field364 = this.field364 + (char) var10;
                        }
                        if (this.field364.length() > 20) {
                            this.field364 = this.field364.substring(0, 20);
                        }
                    }
                }
            }
        } else {
            if (this.field537 == 3) {
                int var13 = super.field1648 / 2;
                int var14 = super.field1649 / 2 + 50;
                int var19 = var14 + 20;
                if (super.field1664 == 1 && super.field1665 >= var13 - 75 && super.field1665 <= var13 + 75 && super.field1666 >= var19 - 20 && super.field1666 <= var19 + 20) {
                    this.field537 = 0;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(IIII)I")
    public final int method126(int arg0, int arg1, int arg2, int arg3) {
        int var5 = 256 - arg1;
        int var6 = 22 / arg2;
        return ((arg0 & 16711935) * arg1 + (arg3 & 16711935) * var5 & -16711936) + ((arg0 & 65280) * arg1 + (arg3 & 65280) * var5 & 16711680) >> 8;
    }

    @OriginalMember(owner = "client", name = "run", descriptor = "()V")
    public final void run() {
        if (this.field228) {
            this.method82(true);
        } else {
            super.run();
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BLTDQUELMV;)Z")
    public final boolean method127(byte arg0, class52 arg1) {
        if (arg1.field1321 == null) {
            return false;
        } else {
            for (int var3 = 0; var3 < arg1.field1321.length; ++var3) {
                int var4 = this.method20(var3, arg1, (byte) 76);
                int var5 = arg1.field1297[var3];
                if (arg1.field1321[var3] == 2) {
                    if (var4 >= var5) {
                        return false;
                    }
                } else if (arg1.field1321[var3] == 3) {
                    if (var4 <= var5) {
                        return false;
                    }
                } else if (arg1.field1321[var3] == 4) {
                    if (var4 == var5) {
                        return false;
                    }
                } else if (var4 != var5) {
                    return false;
                }
            }
            if (arg0 != 81) {
                this.field229 = 361;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "n", descriptor = "(Z)V")
    public final void method128(boolean arg0) {
        this.field310.method314(43776, 10);
        this.field106 &= arg0;
        if (this.field541 != -1) {
            this.field541 = -1;
            this.field438 = true;
            this.field352 = false;
            this.field121 = true;
        }
        if (this.field301 != -1) {
            this.field301 = -1;
            this.field401 = true;
            this.field352 = false;
        }
        this.field347 = -1;
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(IJ)V")
    public final void method129(int arg0, long arg1) {
        if (arg1 != 0L) {
            if (this.field105 >= 100) {
                this.method25(0, "", 0, "Your ignore list is full. Max of 100 hit");
            } else {
                String var4 = class39.method371(class39.method368((byte) 3, arg1), (byte) -7);
                for (int var5 = 0; var5 < this.field105; ++var5) {
                    if (this.field170[var5] == arg1) {
                        this.method25(0, "", 0, var4 + " is already on your ignore list");
                        return;
                    }
                }
                for (int var6 = 0; var6 < this.field325; ++var6) {
                    if (this.field483[var6] == arg1) {
                        this.method25(0, "", 0, "Please remove " + var4 + " from your friend list first");
                        return;
                    }
                }
                this.field170[this.field105++] = arg1;
                if (arg0 == -13110) {
                    this.field438 = true;
                    this.field310.method314(43776, 171);
                    this.field310.method321((byte) 73, arg1);
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(II)Ljava/lang/String;")
    public final String method130(int arg0, int arg1) {
        int var3 = 94 / arg0;
        return arg1 < 999999999 ? String.valueOf(arg1) : "*";
    }

    @OriginalMember(owner = "client", name = "j", descriptor = "(B)V")
    public final void method131(byte arg0) {
        this.field204 = false;
        while (this.field88) {
            this.field204 = false;
            try {
                Thread.sleep(50L);
            } catch (Exception var2) {
            }
        }
        this.field96 = null;
        this.field97 = null;
        this.field482 = null;
        this.field493 = null;
        this.field494 = null;
        this.field495 = null;
        if (arg0 == 68) {
            this.field496 = null;
            this.field281 = null;
            this.field282 = null;
            this.field215 = null;
            this.field216 = null;
            this.field193 = null;
            this.field194 = null;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)V")
    public final void method132(String arg0, String arg1, boolean arg2) {
        signlink.errorname = arg0;
        try {
            if (!arg2) {
                this.field139 = "";
                this.field140 = "Connecting to server...";
                this.method78(true, 7);
            }
            this.field169 = new class62(this.method57(field374 + 43594), 618, this);
            long var4 = class39.method367(arg0);
            int var6 = (int) (var4 >> 16 & 31L);
            this.field310.field945 = 0;
            this.field310.method315(14);
            this.field310.method315(var6);
            this.field169.method518(this.field310.field944, 0, -358, 2);
            for (int var7 = 0; var7 < 8; ++var7) {
                this.field169.method515();
            }
            int var8 = this.field169.method515();
            int var9 = var8;
            if (var8 == 0) {
                this.field169.method517(this.field254.field944, 0, 8);
                this.field254.field945 = 0;
                this.field76 = this.field254.method331(true);
                int[] var10 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (this.field76 >> 32), (int) this.field76 };
                this.field310.field945 = 0;
                this.field310.method315(10);
                this.field310.method319(var10[0]);
                this.field310.method319(var10[1]);
                this.field310.method319(var10[2]);
                this.field310.method319(var10[3]);
                this.field310.method319(signlink.uid);
                this.field310.method322(arg0);
                this.field310.method322(arg1);
                this.field310.method340(true, field258, field242);
                this.field202.field945 = 0;
                if (arg2) {
                    this.field202.method315(18);
                } else {
                    this.field202.method315(16);
                }
                this.field202.method315(this.field310.field945 + 36 + 1 + 1 + 2);
                this.field202.method315(255);
                this.field202.method316(329);
                this.field202.method315(field376 ? 1 : 0);
                for (int var11 = 0; var11 < 9; ++var11) {
                    this.field202.method319(this.field290[var11]);
                }
                this.field202.method323(0, 1, this.field310.field944, this.field310.field945);
                this.field310.field949 = new class45(-993, var10);
                for (int var12 = 0; var12 < 4; ++var12) {
                    var10[var12] += 50;
                }
                this.field365 = new class45(-993, var10);
                this.field169.method518(this.field202.field944, 0, -358, this.field202.field945);
                var8 = this.field169.method515();
            }
            if (var8 == 1) {
                try {
                    Thread.sleep(2000L);
                } catch (Exception var22) {
                }
                this.method132(arg0, arg1, arg2);
            } else if (var8 == 2) {
                this.field181 = this.field169.method515();
                field330 = this.field169.method515() == 1;
                this.field78 = 0L;
                this.field333 = 0;
                this.field138.field1366 = 0;
                super.field1655 = true;
                this.field136 = true;
                this.field106 = true;
                this.field310.field945 = 0;
                this.field254.field945 = 0;
                this.field489 = -1;
                this.field126 = -1;
                this.field127 = -1;
                this.field128 = -1;
                this.field488 = 0;
                this.field490 = 0;
                this.field107 = 0;
                this.field492 = 0;
                this.field226 = 0;
                this.field152 = 0;
                this.field74 = false;
                super.field1656 = 0;
                for (int var13 = 0; var13 < 100; ++var13) {
                    this.field294[var13] = null;
                }
                this.field147 = 0;
                this.field474 = 0;
                this.field497 = 0;
                this.field340 = 0;
                this.field467 = (int) (Math.random() * 100.0D) - 50;
                this.field285 = (int) (Math.random() * 110.0D) - 55;
                this.field223 = (int) (Math.random() * 80.0D) - 40;
                this.field277 = (int) (Math.random() * 120.0D) - 60;
                this.field420 = (int) (Math.random() * 30.0D) - 20;
                this.field384 = (int) (Math.random() * 20.0D) - 10 & 2047;
                this.field235 = 0;
                this.field424 = -1;
                this.field348 = 0;
                this.field349 = 0;
                this.field459 = 0;
                this.field134 = 0;
                for (int var14 = 0; var14 < this.field456; ++var14) {
                    this.field458[var14] = null;
                    this.field463[var14] = null;
                }
                for (int var15 = 0; var15 < 16384; ++var15) {
                    this.field133[var15] = null;
                }
                field144 = this.field458[this.field457] = new class29();
                this.field111.method380();
                this.field184.method380();
                for (int var16 = 0; var16 < 4; ++var16) {
                    for (int var17 = 0; var17 < 104; ++var17) {
                        for (int var18 = 0; var18 < 104; ++var18) {
                            this.field538[var16][var17][var18] = null;
                        }
                    }
                }
                this.field129 = new class42(-591);
                this.field326 = 0;
                this.field325 = 0;
                this.field427 = -1;
                this.field301 = -1;
                this.field347 = -1;
                this.field541 = -1;
                this.field403 = -1;
                this.field352 = false;
                this.field234 = 3;
                this.field153 = 0;
                this.field74 = false;
                this.field257 = false;
                this.field191 = null;
                this.field217 = 0;
                this.field186 = -1;
                this.field452 = true;
                this.method100((byte) 71);
                for (int var19 = 0; var19 < 5; ++var19) {
                    this.field544[var19] = 0;
                }
                for (int var20 = 0; var20 < 5; ++var20) {
                    this.field230[var20] = null;
                    this.field231[var20] = false;
                }
                field259 = 0;
                field406 = 0;
                field227 = 0;
                field451 = 0;
                field436 = 0;
                field156 = 0;
                field95 = 0;
                field418 = 0;
                field276 = 0;
                field331 = 0;
                this.method68((byte) 63);
            } else if (var8 == 3) {
                this.field139 = "";
                this.field140 = "Invalid username or password.";
            } else if (var8 == 4) {
                this.field139 = "Your account has been disabled.";
                this.field140 = "Please check your message-centre for details.";
            } else if (var8 == 5) {
                this.field139 = "Your account is already logged in.";
                this.field140 = "Try again in 60 secs...";
            } else if (var8 == 6) {
                this.field139 = "RuneScape has been updated!";
                this.field140 = "Please reload this page.";
            } else if (var8 == 7) {
                this.field139 = "This world is full.";
                this.field140 = "Please use a different world.";
            } else if (var8 == 8) {
                this.field139 = "Unable to connect.";
                this.field140 = "Login server offline.";
            } else if (var8 == 9) {
                this.field139 = "Login limit exceeded.";
                this.field140 = "Too many connections from your address.";
            } else if (var8 == 10) {
                this.field139 = "Unable to connect.";
                this.field140 = "Bad session id.";
            } else if (var8 == 11) {
                this.field140 = "Login server rejected session.";
                this.field140 = "Please try again.";
            } else if (var8 == 12) {
                this.field139 = "You need a members account to login to this world.";
                this.field140 = "Please subscribe, or use a different world.";
            } else if (var8 == 13) {
                this.field139 = "Could not complete login.";
                this.field140 = "Please try using a different world.";
            } else if (var8 == 14) {
                this.field139 = "The server is being updated.";
                this.field140 = "Please wait 1 minute and try again.";
            } else if (var8 == 15) {
                this.field106 = true;
                this.field310.field945 = 0;
                this.field254.field945 = 0;
                this.field489 = -1;
                this.field126 = -1;
                this.field127 = -1;
                this.field128 = -1;
                this.field488 = 0;
                this.field490 = 0;
                this.field107 = 0;
                this.field152 = 0;
                this.field74 = false;
                this.field515 = System.currentTimeMillis();
            } else if (var8 == 16) {
                this.field139 = "Login attempts exceeded.";
                this.field140 = "Please wait 1 minute and try again.";
            } else if (var8 == 17) {
                this.field139 = "You are standing in a members-only area.";
                this.field140 = "To play on this world move to a free area first";
            } else if (var8 == 20) {
                this.field139 = "Invalid loginserver requested";
                this.field140 = "Please try using a different world.";
            } else if (var8 != 21) {
                if (var8 == -1) {
                    if (var9 == 0) {
                        if (this.field246 < 2) {
                            try {
                                Thread.sleep(2000L);
                            } catch (Exception var24) {
                            }
                            ++this.field246;
                            this.method132(arg0, arg1, arg2);
                        } else {
                            this.field139 = "No response from loginserver";
                            this.field140 = "Please wait 1 minute and try again.";
                        }
                    } else {
                        this.field139 = "No response from server";
                        this.field140 = "Please try using a different world.";
                    }
                } else {
                    System.out.println("response:" + var8);
                    this.field139 = "Unexpected server response";
                    this.field140 = "Please try using a different world.";
                }
            } else {
                int var21 = this.field169.method515();
                for (int var26 = var21 + 3; var26 >= 0; --var26) {
                    this.field139 = "You have only just left another world";
                    this.field140 = "Your profile will be transferred in: " + var26;
                    this.method78(true, 7);
                    try {
                        Thread.sleep(1200L);
                    } catch (Exception var23) {
                    }
                }
                this.method132(arg0, arg1, arg2);
            }
        } catch (IOException var25) {
            this.field139 = "";
            this.field140 = "Error connecting to server.";
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(IILMQZHAILV;)V")
    private final void method133(int arg0, int arg1, class33 arg2) {
        for (int var4 = 0; var4 < this.field461; ++var4) {
            int var5 = this.field462[var4];
            class29 var6 = this.field458[var5];
            int var7 = arg2.method325();
            if ((var7 & 16) != 0) {
                var7 += arg2.method325() << 8;
            }
            this.method65(arg2, 0, var5, var6, var7);
        }
        if (arg0 != 0) {
            this.field538 = null;
        }
    }

    @OriginalMember(owner = "client", name = "E", descriptor = "(I)V")
    public final void method134(int arg0) {
        if (arg0 == 14456) {
            int var2 = this.field503 * 128 + 64;
            int var3 = this.field504 * 128 + 64;
            int var4 = this.method24(var2, -8947, var3, this.field426) - this.field505;
            if (this.field266 < var2) {
                this.field266 += (var2 - this.field266) * this.field507 / 1000 + this.field506;
                if (this.field266 > var2) {
                    this.field266 = var2;
                }
            }
            if (this.field266 > var2) {
                this.field266 -= (this.field266 - var2) * this.field507 / 1000 + this.field506;
                if (this.field266 < var2) {
                    this.field266 = var2;
                }
            }
            if (this.field267 < var4) {
                this.field267 += (var4 - this.field267) * this.field507 / 1000 + this.field506;
                if (this.field267 > var4) {
                    this.field267 = var4;
                }
            }
            if (this.field267 > var4) {
                this.field267 -= (this.field267 - var4) * this.field507 / 1000 + this.field506;
                if (this.field267 < var4) {
                    this.field267 = var4;
                }
            }
            if (this.field268 < var3) {
                this.field268 += (var3 - this.field268) * this.field507 / 1000 + this.field506;
                if (this.field268 > var3) {
                    this.field268 = var3;
                }
            }
            if (this.field268 > var3) {
                this.field268 -= (this.field268 - var3) * this.field507 / 1000 + this.field506;
                if (this.field268 < var3) {
                    this.field268 = var3;
                }
            }
            int var5 = this.field303 * 128 + 64;
            int var6 = this.field304 * 128 + 64;
            int var7 = this.method24(var5, -8947, var6, this.field426) - this.field305;
            int var8 = var5 - this.field266;
            int var9 = var7 - this.field267;
            int var10 = var6 - this.field268;
            int var11 = (int) Math.sqrt((double) (var8 * var8 + var10 * var10));
            int var12 = (int) (Math.atan2((double) var9, (double) var11) * 325.949D) & 2047;
            int var13 = (int) (Math.atan2((double) var8, (double) var10) * -325.949D) & 2047;
            if (var12 < 128) {
                var12 = 128;
            }
            if (var12 > 383) {
                var12 = 383;
            }
            if (this.field269 < var12) {
                this.field269 += (var12 - this.field269) * this.field307 / 1000 + this.field306;
                if (this.field269 > var12) {
                    this.field269 = var12;
                }
            }
            if (this.field269 > var12) {
                this.field269 -= (this.field269 - var12) * this.field307 / 1000 + this.field306;
                if (this.field269 < var12) {
                    this.field269 = var12;
                }
            }
            int var14 = var13 - this.field270;
            if (var14 > 1024) {
                var14 -= 2048;
            }
            if (var14 < -1024) {
                var14 += 2048;
            }
            if (var14 > 0) {
                this.field270 += this.field307 * var14 / 1000 + this.field306;
                this.field270 &= 2047;
            }
            if (var14 < 0) {
                this.field270 -= -var14 * this.field307 / 1000 + this.field306;
                this.field270 &= 2047;
            }
            int var15 = var13 - this.field270;
            if (var15 > 1024) {
                var15 -= 2048;
            }
            if (var15 < -1024) {
                var15 += 2048;
            }
            if (var15 < 0 && var14 > 0 || var15 > 0 && var14 < 0) {
                this.field270 = var13;
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(Ljava/lang/String;)Ljava/io/DataInputStream;")
    public final DataInputStream method135(String arg0) throws IOException {
        if (!this.field225) {
            return signlink.mainapp != null ? signlink.openurl(arg0) : new DataInputStream((new URL(this.getCodeBase(), arg0)).openStream());
        } else {
            if (this.field536 != null) {
                try {
                    this.field536.close();
                } catch (Exception var4) {
                }
                this.field536 = null;
            }
            this.field536 = this.method57(43595);
            this.field536.setSoTimeout(10000);
            InputStream var2 = this.field536.getInputStream();
            OutputStream var3 = this.field536.getOutputStream();
            var3.write(("JAGGRAB /" + arg0 + "\n\n").getBytes());
            return new DataInputStream(var2);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BLMQZHAILV;I)V")
    private final void method136(byte arg0, class33 arg1, int arg2) {
        this.field287 = 0;
        this.field461 = 0;
        this.method117(107, arg1, arg2);
        this.method123(arg1, false, arg2);
        this.method149(arg1, (byte) 7, arg2);
        this.method133(0, arg2, arg1);
        for (int var4 = 0; var4 < this.field287; ++var4) {
            int var6 = this.field288[var4];
            if (field369 != this.field458[var6].field1209) {
                this.field458[var6] = null;
            }
        }
        if (arg0 != 7) {
            this.field275 = !this.field275;
        }
        if (arg1.field945 != arg2) {
            signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg1.field945 + " psize:" + arg2);
            throw new RuntimeException("eek");
        } else {
            for (int var5 = 0; var5 < this.field459; ++var5) {
                if (this.field458[this.field460[var5]] == null) {
                    signlink.reporterror(this.field363 + " null entry in pl list - pos:" + var5 + " size:" + this.field459);
                    throw new RuntimeException("eek");
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BIILTDQUELMV;I)V")
    public final void method137(byte arg0, int arg1, int arg2, class52 arg3, int arg4) {
        if (arg3.field1298 == 0 && arg3.field1311 != null) {
            if (!arg3.field1291 || this.field486 == arg3.field1281 || this.field382 == arg3.field1281 || this.field393 == arg3.field1281) {
                int var6 = class23.field787;
                int var7 = class23.field785;
                int var8 = class23.field788;
                int var9 = class23.field786;
                if (arg0 == 6) {
                    class23.method255(arg3.field1264 + arg4, arg4, arg3.field1312 + arg2, arg2, false);
                    int var10 = arg3.field1311.length;
                    for (int var11 = 0; var11 < var10; ++var11) {
                        int var12 = arg3.field1279[var11] + arg2;
                        int var13 = arg3.field1316[var11] + arg4 - arg1;
                        class52 var14 = class52.field1258[arg3.field1311[var11]];
                        int var15 = var14.field1290 + var12;
                        int var16 = var14.field1310 + var13;
                        if (var14.field1262 > 0) {
                            this.method38(var14, 6);
                        }
                        if (var14.field1298 == 0) {
                            if (var14.field1320 > var14.field1318 - var14.field1264) {
                                var14.field1320 = var14.field1318 - var14.field1264;
                            }
                            if (var14.field1320 < 0) {
                                var14.field1320 = 0;
                            }
                            this.method137((byte) 6, var14.field1320, var15, var14, var16);
                            if (var14.field1318 > var14.field1264) {
                                this.method32(var14.field1320, var14.field1264, -14692, var14.field1312 + var15, var14.field1318, var16);
                            }
                        } else if (var14.field1298 != 1) {
                            if (var14.field1298 == 2) {
                                int var17 = 0;
                                for (int var18 = 0; var18 < var14.field1264; ++var18) {
                                    for (int var19 = 0; var19 < var14.field1312; ++var19) {
                                        int var20 = (var14.field1314 + 32) * var19 + var15;
                                        int var21 = (var14.field1307 + 32) * var18 + var16;
                                        if (var17 < 20) {
                                            var20 += var14.field1324[var17];
                                            var21 += var14.field1296[var17];
                                        }
                                        if (var14.field1304[var17] <= 0) {
                                            if (var14.field1274 != null && var17 < 20) {
                                                class55 var30 = var14.field1274[var17];
                                                if (var30 != null) {
                                                    var30.method498(var20, var21, 2);
                                                }
                                            }
                                        } else {
                                            int var22 = 0;
                                            int var23 = 0;
                                            int var24 = var14.field1304[var17] - 1;
                                            if (var20 > class23.field787 - 32 && var20 < class23.field788 && var21 > class23.field785 - 32 && var21 < class23.field786 || this.field199 != 0 && this.field198 == var17) {
                                                int var25 = 0;
                                                if (this.field147 == 1 && this.field148 == var17 && this.field149 == var14.field1281) {
                                                    var25 = 16777215;
                                                }
                                                class55 var26 = class3.method14(this.field422, var25, var14.field1272[var17], var24);
                                                if (var26 != null) {
                                                    if (this.field199 != 0 && this.field198 == var17 && this.field197 == var14.field1281) {
                                                        var22 = super.field1658 - this.field200;
                                                        var23 = super.field1659 - this.field201;
                                                        if (var22 < 5 && var22 > -5) {
                                                            var22 = 0;
                                                        }
                                                        if (var23 < 5 && var23 > -5) {
                                                            var23 = 0;
                                                        }
                                                        if (this.field433 < 5) {
                                                            var22 = 0;
                                                            var23 = 0;
                                                        }
                                                        var26.method500(128, -749, var20 + var22, var21 + var23);
                                                        if (var21 + var23 < class23.field785 && arg3.field1320 > 0) {
                                                            int var27 = (class23.field785 - var21 - var23) * this.field455 / 3;
                                                            if (var27 > this.field455 * 10) {
                                                                var27 = this.field455 * 10;
                                                            }
                                                            if (var27 > arg3.field1320) {
                                                                var27 = arg3.field1320;
                                                            }
                                                            arg3.field1320 -= var27;
                                                            this.field201 += var27;
                                                        }
                                                        if (var21 + var23 + 32 > class23.field786 && arg3.field1320 < arg3.field1318 - arg3.field1264) {
                                                            int var28 = (var21 + var23 + 32 - class23.field786) * this.field455 / 3;
                                                            if (var28 > this.field455 * 10) {
                                                                var28 = this.field455 * 10;
                                                            }
                                                            if (var28 > arg3.field1318 - arg3.field1264 - arg3.field1320) {
                                                                var28 = arg3.field1318 - arg3.field1264 - arg3.field1320;
                                                            }
                                                            arg3.field1320 += var28;
                                                            this.field201 -= var28;
                                                        }
                                                    } else if (this.field390 != 0 && this.field389 == var17 && this.field388 == var14.field1281) {
                                                        var26.method500(128, -749, var20, var21);
                                                    } else {
                                                        var26.method498(var20, var21, 2);
                                                    }
                                                    if (var26.field1349 == 33 || var14.field1272[var17] != 1) {
                                                        int var29 = var14.field1272[var17];
                                                        this.field296.method462(0, method40(false, var29), 0, var21 + 10 + var23, var20 + 1 + var22);
                                                        this.field296.method462(16776960, method40(false, var29), 0, var21 + 9 + var23, var20 + var22);
                                                    }
                                                }
                                            }
                                        }
                                        ++var17;
                                    }
                                }
                            } else if (var14.field1298 == 3) {
                                boolean var31 = false;
                                if (this.field393 == var14.field1281 || this.field382 == var14.field1281 || this.field486 == var14.field1281) {
                                    var31 = true;
                                }
                                int var32;
                                if (this.method127(this.field519, var14)) {
                                    var32 = var14.field1313;
                                    if (var31 && var14.field1270 != 0) {
                                        var32 = var14.field1270;
                                    }
                                } else {
                                    var32 = var14.field1293;
                                    if (var31 && var14.field1288 != 0) {
                                        var32 = var14.field1288;
                                    }
                                }
                                if (var14.field1285 == 0) {
                                    if (var14.field1259) {
                                        class23.method258(var14.field1312, (byte) -33, var15, var32, var16, var14.field1264);
                                    } else {
                                        class23.method259(var15, var16, var32, false, var14.field1264, var14.field1312);
                                    }
                                } else if (var14.field1259) {
                                    class23.method257(256 - (var14.field1285 & 255), var14.field1312, var16, (byte) -58, var32, var15, var14.field1264);
                                } else {
                                    class23.method260(var16, 7, var14.field1264, 256 - (var14.field1285 & 255), var14.field1312, var15, var32);
                                }
                            } else if (var14.field1298 == 4) {
                                class47 var33 = var14.field1295;
                                String var34 = var14.field1315;
                                boolean var35 = false;
                                if (this.field393 == var14.field1281 || this.field382 == var14.field1281 || this.field486 == var14.field1281) {
                                    var35 = true;
                                }
                                int var36;
                                if (this.method127(this.field519, var14)) {
                                    var36 = var14.field1313;
                                    if (var35 && var14.field1270 != 0) {
                                        var36 = var14.field1270;
                                    }
                                    if (var14.field1282.length() > 0) {
                                        var34 = var14.field1282;
                                    }
                                } else {
                                    var36 = var14.field1293;
                                    if (var35 && var14.field1288 != 0) {
                                        var36 = var14.field1288;
                                    }
                                }
                                if (var14.field1289 == 6 && this.field352) {
                                    var34 = "Please wait...";
                                    var36 = var14.field1293;
                                }
                                if (class23.field783 == 479) {
                                    if (var36 == 16776960) {
                                        var36 = 255;
                                    }
                                    if (var36 == 49152) {
                                        var36 = 16777215;
                                    }
                                }
                                int var37 = var33.field1162 + var16;
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
                                                                            var34 = var34.substring(0, var42) + this.method130(791, this.method20(4, var14, (byte) 76)) + var34.substring(var42 + 2);
                                                                        }
                                                                    }
                                                                    var34 = var34.substring(0, var41) + this.method130(791, this.method20(3, var14, (byte) 76)) + var34.substring(var41 + 2);
                                                                }
                                                            }
                                                            var34 = var34.substring(0, var40) + this.method130(791, this.method20(2, var14, (byte) 76)) + var34.substring(var40 + 2);
                                                        }
                                                    }
                                                    var34 = var34.substring(0, var39) + this.method130(791, this.method20(1, var14, (byte) 76)) + var34.substring(var39 + 2);
                                                }
                                            }
                                            var34 = var34.substring(0, var38) + this.method130(791, this.method20(0, var14, (byte) 76)) + var34.substring(var38 + 2);
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
                                    if (var14.field1292) {
                                        var33.method459(var44, var36, var14.field1277, var14.field1312 / 2 + var15, (byte) -38, var37);
                                    } else {
                                        var33.method466(var37, 8, var14.field1277, var44, var15, var36);
                                    }
                                    var37 += var33.field1162;
                                }
                            } else if (var14.field1298 == 5) {
                                class55 var45;
                                if (this.method127(this.field519, var14)) {
                                    var45 = var14.field1299;
                                } else {
                                    var45 = var14.field1263;
                                }
                                if (var45 != null) {
                                    var45.method498(var15, var16, 2);
                                }
                            } else if (var14.field1298 == 6) {
                                int var46 = class44.field1054;
                                int var47 = class44.field1055;
                                class44.field1054 = var14.field1312 / 2 + var15;
                                class44.field1055 = var14.field1264 / 2 + var16;
                                int var48 = class44.field1058[var14.field1267] * var14.field1266 >> 16;
                                int var49 = class44.field1059[var14.field1267] * var14.field1266 >> 16;
                                boolean var50 = this.method127(this.field519, var14);
                                int var51;
                                if (var50) {
                                    var51 = var14.field1302;
                                } else {
                                    var51 = var14.field1301;
                                }
                                class70 var52;
                                if (var51 == -1) {
                                    var52 = var14.method488(-1, false, var50, -1);
                                } else {
                                    class22 var53 = class22.field761[var51];
                                    var52 = var14.method488(var53.field763[var14.field1317], false, var50, var53.field764[var14.field1317]);
                                }
                                if (var52 != null) {
                                    var52.method571(0, var14.field1268, 0, var14.field1267, 0, var48, var49);
                                }
                                class44.field1054 = var46;
                                class44.field1055 = var47;
                            } else if (var14.field1298 == 7) {
                                class47 var54 = var14.field1295;
                                int var55 = 0;
                                for (int var56 = 0; var56 < var14.field1264; ++var56) {
                                    for (int var57 = 0; var57 < var14.field1312; ++var57) {
                                        if (var14.field1304[var55] > 0) {
                                            class3 var58 = class3.method13(var14.field1304[var55] - 1);
                                            String var59 = var58.field43;
                                            if (var58.field26 || var14.field1272[var55] != 1) {
                                                var59 = var59 + " x" + method67((byte) 110, var14.field1272[var55]);
                                            }
                                            int var60 = (var14.field1314 + 115) * var57 + var15;
                                            int var61 = (var14.field1307 + 12) * var56 + var16;
                                            if (var14.field1292) {
                                                var54.method459(var59, var14.field1293, var14.field1277, var14.field1312 / 2 + var60, (byte) -38, var61);
                                            } else {
                                                var54.method466(var61, 8, var14.field1277, var59, var60, var14.field1293);
                                            }
                                        }
                                        ++var55;
                                    }
                                }
                            }
                        }
                    }
                    class23.method255(var9, var7, var8, var6, false);
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "F", descriptor = "(I)V")
    public final void method138(int arg0) {
        this.field488 += arg0;
        for (class59 var2 = (class59) this.field111.method376(); var2 != null; var2 = (class59) this.field111.method378(0)) {
            if (this.field426 == var2.field1397 && field369 <= var2.field1403) {
                if (field369 >= var2.field1402) {
                    if (var2.field1406 > 0) {
                        class36 var3 = this.field133[var2.field1406 - 1];
                        if (var3 != null && var3.field1206 >= 0 && var3.field1206 < 13312 && var3.field1207 >= 0 && var3.field1207 < 13312) {
                            var2.method507(var3.field1207, this.field397, this.method24(var3.field1206, -8947, var3.field1207, var2.field1397) - var2.field1396, var3.field1206, field369);
                        }
                    }
                    if (var2.field1406 < 0) {
                        int var4 = -var2.field1406 - 1;
                        class29 var5;
                        if (this.field523 == var4) {
                            var5 = field144;
                        } else {
                            var5 = this.field458[var4];
                        }
                        if (var5 != null && var5.field1206 >= 0 && var5.field1206 < 13312 && var5.field1207 >= 0 && var5.field1207 < 13312) {
                            var2.method507(var5.field1207, this.field397, this.method24(var5.field1206, -8947, var5.field1207, var2.field1397) - var2.field1396, var5.field1206, field369);
                        }
                    }
                    var2.method508(this.field455, 794);
                    this.field243.method417((int) var2.field1388, (int) var2.field1387, 60, (int) var2.field1389, var2, 3, this.field426, false, var2.field1390, -1);
                }
            } else {
                var2.method492();
            }
        }
    }

    @OriginalMember(owner = "client", name = "o", descriptor = "(Z)V")
    public final void method139(boolean arg0) {
        ++this.field219;
        this.method101(false, true);
        this.method21(true, -434);
        this.method101(false, false);
        this.method21(false, -434);
        this.method138(this.field94);
        this.method35(this.field454);
        if (!this.field430) {
            int var2 = this.field383;
            if (this.field143 / 256 > var2) {
                var2 = this.field143 / 256;
            }
            if (this.field271[4] && this.field368[4] + 128 > var2) {
                var2 = this.field368[4] + 128;
            }
            int var3 = this.field384 + this.field223 & 2047;
            this.method80(this.field533, this.method24(field144.field1206, -8947, field144.field1207, this.field426) - 50, -483, var3, this.field532, var2, var2 * 3 + 600);
            ++field518;
            if (field518 > 116) {
                field518 = 0;
                this.field310.method314(43776, 243);
                this.field310.method315(68);
            }
        }
        int var4;
        if (!this.field430) {
            var4 = this.method157((byte) -21);
        } else {
            var4 = this.method158(393);
        }
        int var5 = this.field266;
        int var6 = this.field267;
        int var7 = this.field268;
        int var8 = this.field269;
        int var9 = this.field270;
        for (int var10 = 0; var10 < 5; ++var10) {
            if (this.field271[var10]) {
                int var12 = (int) (Math.random() * (double) (this.field355[var10] * 2 + 1) - (double) this.field355[var10] + Math.sin((double) this.field526[var10] / 100.0D * (double) this.field381[var10]) * (double) this.field368[var10]);
                if (var10 == 0) {
                    this.field266 += var12;
                }
                if (var10 == 1) {
                    this.field267 += var12;
                }
                if (var10 == 2) {
                    this.field268 += var12;
                }
                if (var10 == 3) {
                    this.field270 = this.field270 + var12 & 2047;
                }
                if (var10 == 4) {
                    this.field269 += var12;
                    if (this.field269 < 128) {
                        this.field269 = 128;
                    }
                    if (this.field269 > 383) {
                        this.field269 = 383;
                    }
                }
            }
        }
        int var11 = class44.field1069;
        class70.field1629 = true;
        class70.field1632 = 0;
        class70.field1630 = super.field1658 - 4;
        class70.field1631 = super.field1659 - 4;
        class23.method256(this.field116);
        this.field243.method445(this.field268, var4, this.field266, this.field267, this.field270, this.field269, 0);
        this.field243.method420((byte) -74);
        this.method71(16513);
        this.method83(true);
        this.method122(var11, 0);
        this.method27(-409);
        this.field159.method173(super.field1650, false, 4, 4);
        this.field266 = var5;
        this.field267 = var6;
        this.field268 = var7;
        this.field269 = var8;
        this.field270 = var9;
        if (arg0) {
            this.field489 = this.field254.method325();
        }
    }

    @OriginalMember(owner = "client", name = "p", descriptor = "(Z)V")
    public final void method140(boolean arg0) {
        if (arg0) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        this.field96 = new class20(this.field391, "titlebox", 0);
        this.field97 = new class20(this.field391, "titlebutton", 0);
        this.field482 = new class20[12];
        int var3 = 0;
        try {
            var3 = Integer.parseInt(this.getParameter("fl_icon"));
        } catch (Exception var20) {
        }
        if (var3 == 0) {
            for (int var4 = 0; var4 < 12; ++var4) {
                this.field482[var4] = new class20(this.field391, "runes", var4);
            }
        } else {
            for (int var5 = 0; var5 < 12; ++var5) {
                this.field482[var5] = new class20(this.field391, "runes", (var5 & 3) + 12);
            }
        }
        this.field193 = new class55(128, 265);
        this.field194 = new class55(128, 265);
        for (int var6 = 0; var6 < 33920; ++var6) {
            this.field193.field1344[var6] = this.field174.field607[var6];
        }
        for (int var7 = 0; var7 < 33920; ++var7) {
            this.field194.field1344[var7] = this.field175.field607[var7];
        }
        this.field494 = new int[256];
        for (int var8 = 0; var8 < 64; ++var8) {
            this.field494[var8] = var8 * 262144;
        }
        for (int var9 = 0; var9 < 64; ++var9) {
            this.field494[var9 + 64] = var9 * 1024 + 16711680;
        }
        for (int var10 = 0; var10 < 64; ++var10) {
            this.field494[var10 + 128] = var10 * 4 + 16776960;
        }
        for (int var11 = 0; var11 < 64; ++var11) {
            this.field494[var11 + 192] = 16777215;
        }
        this.field495 = new int[256];
        for (int var12 = 0; var12 < 64; ++var12) {
            this.field495[var12] = var12 * 1024;
        }
        for (int var13 = 0; var13 < 64; ++var13) {
            this.field495[var13 + 64] = var13 * 4 + 65280;
        }
        for (int var14 = 0; var14 < 64; ++var14) {
            this.field495[var14 + 128] = var14 * 262144 + 65535;
        }
        for (int var15 = 0; var15 < 64; ++var15) {
            this.field495[var15 + 192] = 16777215;
        }
        this.field496 = new int[256];
        for (int var16 = 0; var16 < 64; ++var16) {
            this.field496[var16] = var16 * 4;
        }
        for (int var17 = 0; var17 < 64; ++var17) {
            this.field496[var17 + 64] = var17 * 262144 + 255;
        }
        for (int var18 = 0; var18 < 64; ++var18) {
            this.field496[var18 + 128] = var18 * 1024 + 16711935;
        }
        for (int var19 = 0; var19 < 64; ++var19) {
            this.field496[var19 + 192] = 16777215;
        }
        this.field493 = new int[256];
        this.field281 = new int[32768];
        this.field282 = new int[32768];
        this.method26(572, (class20) null);
        this.field215 = new int[32768];
        this.field216 = new int[32768];
        this.method87("Connecting to fileserver", 10, (byte) 9);
        if (!this.field204) {
            this.field228 = true;
            this.field204 = true;
            this.method97(this, 2);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIIIII)V")
    private final void method141(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg7 >= 0) {
            this.field538 = null;
        }
        if (arg5 >= 1 && arg3 >= 1 && arg5 <= 102 && arg3 <= 102) {
            if (field376 && this.field426 != arg2) {
                return;
            }
            int var9 = 0;
            boolean var10 = true;
            boolean var11 = false;
            boolean var12 = false;
            if (arg6 == 0) {
                var9 = this.field243.method432(arg2, arg5, arg3);
            }
            if (arg6 == 1) {
                var9 = this.field243.method433(true, arg3, arg2, arg5);
            }
            if (arg6 == 2) {
                var9 = this.field243.method434(arg2, arg5, arg3);
            }
            if (arg6 == 3) {
                var9 = this.field243.method435(arg2, arg5, arg3);
            }
            if (var9 != 0) {
                int var13 = this.field243.method436(arg2, arg5, arg3, var9);
                int var14 = var9 >> 14 & 32767;
                int var15 = var13 & 31;
                int var16 = var13 >> 6;
                if (arg6 == 0) {
                    this.field243.method423(arg3, 5, arg2, arg5);
                    class72 var17 = class72.method588(var14);
                    if (var17.field1683) {
                        this.field238[arg2].method306(var17.field1711, arg5, -766, arg3, var15, var16);
                    }
                }
                if (arg6 == 1) {
                    this.field243.method424(arg5, arg3, arg2, false);
                }
                if (arg6 == 2) {
                    this.field243.method425(arg5, arg2, true, arg3);
                    class72 var18 = class72.method588(var14);
                    if (var18.field1707 + arg5 > 103 || var18.field1707 + arg3 > 103 || var18.field1723 + arg5 > 103 || var18.field1723 + arg3 > 103) {
                        return;
                    }
                    if (var18.field1683) {
                        this.field238[arg2].method307(var16, false, arg3, var18.field1723, var18.field1711, arg5, var18.field1707);
                    }
                }
                if (arg6 == 3) {
                    this.field243.method426(arg3, (byte) 6, arg5, arg2);
                    class72 var19 = class72.method588(var14);
                    if (var19.field1683 && var19.field1681) {
                        this.field238[arg2].method309(arg3, arg5, 46905);
                    }
                }
            }
            if (arg1 >= 0) {
                int var20 = arg2;
                if (arg2 < 3 && (this.field517[1][arg5][arg3] & 2) == 2) {
                    var20 = arg2 + 1;
                }
                class31.method290(arg0, arg2, arg1, arg3, this.field243, var20, this.field238[arg2], arg4, -290, this.field434, arg5);
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(ILMQZHAILV;I)V")
    private final void method142(int arg0, class33 arg1, int arg2) {
        for (int var4 = 0; var4 < this.field461; ++var4) {
            int var5 = this.field462[var4];
            class36 var6 = this.field133[var5];
            int var7 = arg1.method325();
            if ((var7 & 128) != 0) {
                var6.field1213 = arg1.method352((byte) 117);
                if (var6.field1213 == 65535) {
                    var6.field1213 = -1;
                }
            }
            if ((var7 & 32) != 0) {
                var6.field1232 = arg1.method352((byte) 117);
                var6.field1233 = arg1.method327();
            }
            if ((var7 & 2) != 0) {
                var6.field1200 = arg1.method353(0);
                int var8 = arg1.method361((byte) 47);
                var6.field1204 = var8 >> 16;
                var6.field1203 = (var8 & 65535) + field369;
                var6.field1201 = 0;
                var6.field1202 = 0;
                if (var6.field1203 > field369) {
                    var6.field1201 = -1;
                }
                if (var6.field1200 == 65535) {
                    var6.field1200 = -1;
                }
            }
            if ((var7 & 1) != 0) {
                int var9 = arg1.method346(false);
                int var10 = arg1.method345(219);
                var6.method477(field369, var9, var10, this.field162);
                var6.field1252 = field369 + 300;
                var6.field1253 = arg1.method346(false);
                var6.field1254 = arg1.method346(false);
            }
            if ((var7 & 8) != 0) {
                int var11 = arg1.method346(false);
                int var12 = arg1.method346(false);
                var6.method477(field369, var11, var12, this.field162);
                var6.field1252 = field369 + 300;
                var6.field1253 = arg1.method325();
                var6.field1254 = arg1.method345(219);
            }
            if ((var7 & 4) != 0) {
                int var13 = arg1.method354((byte) -59);
                if (var13 == 65535) {
                    var13 = -1;
                }
                int var14 = arg1.method325();
                if (var6.field1234 == var13 && var13 != -1) {
                    int var15 = class22.field761[var13].field775;
                    if (var15 == 1) {
                        var6.field1235 = 0;
                        var6.field1236 = 0;
                        var6.field1237 = var14;
                        var6.field1238 = 0;
                    }
                    if (var15 == 2) {
                        var6.field1238 = 0;
                    }
                } else if (var13 == -1 || var6.field1234 == -1 || class22.field761[var13].field769 >= class22.field761[var6.field1234].field769) {
                    var6.field1234 = var13;
                    var6.field1235 = 0;
                    var6.field1236 = 0;
                    var6.field1237 = var14;
                    var6.field1238 = 0;
                    var6.field1231 = var6.field1241;
                }
            }
            if ((var7 & 16) != 0) {
                var6.field966 = class6.method171(arg1.method352((byte) 117));
                var6.field1242 = var6.field966.field593;
                var6.field1205 = var6.field966.field601;
                var6.field1223 = var6.field966.field582;
                var6.field1224 = var6.field966.field598;
                var6.field1225 = var6.field966.field599;
                var6.field1226 = var6.field966.field581;
                var6.field1239 = var6.field966.field597;
            }
            if ((var7 & 64) != 0) {
                var6.field1221 = arg1.method332();
                var6.field1249 = 100;
            }
        }
        while (arg2 >= 0) {
            this.field141 = !this.field141;
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(IZ)Z")
    public final boolean method143(int arg0, boolean arg1) {
        if (!arg1) {
            this.field489 = -1;
        }
        if (arg0 < 0) {
            return false;
        } else {
            int var3 = this.field358[arg0];
            if (var3 >= 2000) {
                var3 -= 2000;
            }
            return var3 == 539;
        }
    }

    @OriginalMember(owner = "client", name = "G", descriptor = "(I)V")
    public final void method144(int arg0) {
        if (arg0 >= 0) {
            this.method70();
        }
        if (super.field1664 == 1) {
            if (super.field1665 >= 6 && super.field1665 <= 106 && super.field1666 >= 467 && super.field1666 <= 499) {
                this.field511 = (this.field511 + 1) % 4;
                this.field124 = true;
                this.field401 = true;
                this.field310.method314(43776, 59);
                this.field310.method315(this.field511);
                this.field310.method315(this.field112);
                this.field310.method315(this.field341);
            }
            if (super.field1665 >= 135 && super.field1665 <= 235 && super.field1666 >= 467 && super.field1666 <= 499) {
                this.field112 = (this.field112 + 1) % 3;
                this.field124 = true;
                this.field401 = true;
                this.field310.method314(43776, 59);
                this.field310.method315(this.field511);
                this.field310.method315(this.field112);
                this.field310.method315(this.field341);
            }
            if (super.field1665 >= 273 && super.field1665 <= 373 && super.field1666 >= 467 && super.field1666 <= 499) {
                this.field341 = (this.field341 + 1) % 3;
                this.field124 = true;
                this.field401 = true;
                this.field310.method314(43776, 59);
                this.field310.method315(this.field511);
                this.field310.method315(this.field112);
                this.field310.method315(this.field341);
            }
            if (super.field1665 >= 412 && super.field1665 <= 512 && super.field1666 >= 467 && super.field1666 <= 499) {
                if (this.field347 == -1) {
                    this.method128(true);
                    this.field187 = "";
                    this.field354 = false;
                    for (int var2 = 0; var2 < class52.field1258.length; ++var2) {
                        if (class52.field1258[var2] != null && class52.field1258[var2].field1262 == 600) {
                            this.field428 = this.field347 = class52.field1258[var2].field1271;
                            break;
                        }
                    }
                } else {
                    this.method25(0, "", 0, "Please close the interface you have open before using 'report abuse'");
                }
            }
            ++field98;
            if (field98 > 81) {
                field98 = 0;
                this.field310.method314(43776, 92);
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "k", descriptor = "(B)V")
    public final void method145(byte arg0) {
        if (arg0 == 3) {
            boolean var2 = false;
        } else {
            this.field489 = -1;
        }
        this.field514 = 0;
        int var3 = (field144.field1206 >> 7) + this.field499;
        int var4 = (field144.field1207 >> 7) + this.field500;
        if (var3 >= 3053 && var3 <= 3156 && var4 >= 3056 && var4 <= 3136) {
            this.field514 = 1;
        }
        if (var3 >= 3072 && var3 <= 3118 && var4 >= 9492 && var4 <= 9535) {
            this.field514 = 1;
        }
        if (this.field514 == 1 && var3 >= 3139 && var3 <= 3199 && var4 >= 3008 && var4 <= 3062) {
            this.field514 = 0;
        }
    }

    @OriginalMember(owner = "client", name = "H", descriptor = "(I)V")
    public final void method146(int arg0) {
        if (this.field171 == null) {
            super.field1651 = null;
            this.field160 = null;
            this.field158 = null;
            this.field157 = null;
            this.field159 = null;
            this.field89 = null;
            if (arg0 >= 0) {
                this.field489 = this.field254.method325();
            }
            this.field90 = null;
            this.field91 = null;
            this.field174 = new class7(128, -158, 265, this.method42(1));
            class23.method256(this.field116);
            this.field175 = new class7(128, -158, 265, this.method42(1));
            class23.method256(this.field116);
            this.field171 = new class7(509, -158, 171, this.method42(1));
            class23.method256(this.field116);
            this.field172 = new class7(360, -158, 132, this.method42(1));
            class23.method256(this.field116);
            this.field173 = new class7(360, -158, 200, this.method42(1));
            class23.method256(this.field116);
            this.field176 = new class7(202, -158, 238, this.method42(1));
            class23.method256(this.field116);
            this.field177 = new class7(203, -158, 238, this.method42(1));
            class23.method256(this.field116);
            this.field178 = new class7(74, -158, 94, this.method42(1));
            class23.method256(this.field116);
            this.field179 = new class7(75, -158, 94, this.method42(1));
            class23.method256(this.field116);
            if (this.field391 != null) {
                this.method156(true);
                this.method140(false);
            }
            this.field273 = true;
        }
    }

    @OriginalMember(owner = "client", name = "I", descriptor = "(I)V")
    public final void method147(int arg0) {
        try {
            if (this.field169 != null) {
                this.field169.method514();
            }
        } catch (Exception var3) {
        }
        this.field169 = null;
        this.field106 = false;
        this.field537 = 0;
        this.field363 = "";
        this.field364 = "";
        this.method116(-974);
        if (arg0 != 0) {
            this.field538 = null;
        }
        this.field243.method406(16184);
        for (int var2 = 0; var2 < 4; ++var2) {
            this.field238[var2].method301();
        }
        System.gc();
        this.method160(0);
        this.field419 = -1;
        this.field117 = -1;
        this.field543 = 0;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(I[BI)Z")
    public final boolean method148(int arg0, byte[] arg1, int arg2) {
        if (arg0 >= 0) {
            this.field445 = this.field365.method402();
        }
        return arg1 == null ? true : signlink.wavesave(arg1, arg2);
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LMQZHAILV;BI)V")
    private final void method149(class33 arg0, byte arg1, int arg2) {
        while (true) {
            if (arg0.field946 + 10 < arg2 * 8) {
                int var4 = arg0.method336(-29762, 11);
                if (var4 != 2047) {
                    if (this.field458[var4] == null) {
                        this.field458[var4] = new class29();
                        if (this.field463[var4] != null) {
                            this.field458[var4].method270((byte) 4, this.field463[var4]);
                        }
                    }
                    this.field460[this.field459++] = var4;
                    class29 var5 = this.field458[var4];
                    var5.field1209 = field369;
                    int var6 = arg0.method336(-29762, 5);
                    if (var6 > 15) {
                        var6 -= 32;
                    }
                    int var7 = arg0.method336(-29762, 1);
                    if (var7 == 1) {
                        this.field462[this.field461++] = var4;
                    }
                    int var8 = arg0.method336(-29762, 1);
                    int var9 = arg0.method336(-29762, 5);
                    if (var9 > 15) {
                        var9 -= 32;
                    }
                    var5.method480(field144.field1228[0] + var6, field144.field1229[0] + var9, -364, var8 == 1);
                    continue;
                }
            }
            arg0.method337((byte) -97);
            if (arg1 != 7) {
                this.method70();
                return;
            }
            return;
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(IJ)V")
    public final void method150(int arg0, long arg1) {
        int var4 = 99 / arg0;
        if (arg1 != 0L) {
            for (int var5 = 0; var5 < this.field105; ++var5) {
                if (this.field170[var5] == arg1) {
                    --this.field105;
                    this.field438 = true;
                    for (int var6 = var5; var6 < this.field105; ++var6) {
                        this.field170[var6] = this.field170[var6 + 1];
                    }
                    this.field310.method314(43776, 127);
                    this.field310.method321((byte) 73, arg1);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IB)V")
    public final void method151(int arg0, byte arg1) {
        if (arg1 != -94) {
            this.field489 = -1;
        }
        signlink.wavevol = arg0;
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(I)V")
    public final void method152(int arg0) {
        if (arg0 <= 0) {
            this.field489 = this.field254.method325();
        }
        if (!this.field241 && !this.field509 && !this.field119) {
            ++field465;
            if (!this.field106) {
                this.method78(false, 7);
            } else {
                this.method114(false);
            }
            this.field415 = 0;
        } else {
            this.method58(false);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LKWSXZIVG;IIII)V")
    public final void method153(class29 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (field144 != arg0) {
            if (this.field152 < 400) {
                this.field488 += arg4;
                String var6;
                if (arg0.field846 == 0) {
                    var6 = arg0.field849 + method33(arg0.field871, field144.field871, 554) + " (level-" + arg0.field871 + ")";
                } else {
                    var6 = arg0.field849 + " (skill-" + arg0.field846 + ")";
                }
                if (this.field147 == 1) {
                    this.field137[this.field152] = "Use " + this.field151 + " with @whi@" + var6;
                    this.field358[this.field152] = 957;
                    this.field359[this.field152] = arg2;
                    this.field356[this.field152] = arg3;
                    this.field357[this.field152] = arg1;
                    ++this.field152;
                } else if (this.field474 == 1) {
                    if ((this.field476 & 8) == 8) {
                        this.field137[this.field152] = this.field477 + " @whi@" + var6;
                        this.field358[this.field152] = 88;
                        this.field359[this.field152] = arg2;
                        this.field356[this.field152] = arg3;
                        this.field357[this.field152] = arg1;
                        ++this.field152;
                    }
                } else {
                    for (int var7 = 4; var7 >= 0; --var7) {
                        if (this.field230[var7] != null) {
                            this.field137[this.field152] = this.field230[var7] + " @whi@" + var6;
                            short var9 = 0;
                            if (this.field230[var7].equalsIgnoreCase("attack")) {
                                if (arg0.field871 > field144.field871) {
                                    var9 = 2000;
                                }
                                if (field144.field845 != 0 && arg0.field845 != 0) {
                                    if (field144.field845 == arg0.field845) {
                                        var9 = 2000;
                                    } else {
                                        var9 = 0;
                                    }
                                }
                            } else if (this.field231[var7]) {
                                var9 = 2000;
                            }
                            if (var7 == 0) {
                                this.field358[this.field152] = var9 + 527;
                            }
                            if (var7 == 1) {
                                this.field358[this.field152] = var9 + 755;
                            }
                            if (var7 == 2) {
                                this.field358[this.field152] = var9 + 510;
                            }
                            if (var7 == 3) {
                                this.field358[this.field152] = var9 + 531;
                            }
                            if (var7 == 4) {
                                this.field358[this.field152] = var9 + 32;
                            }
                            this.field359[this.field152] = arg2;
                            this.field356[this.field152] = arg3;
                            this.field357[this.field152] = arg1;
                            ++this.field152;
                        }
                    }
                }
                for (int var8 = 0; var8 < this.field152; ++var8) {
                    if (this.field358[var8] == 672) {
                        this.field137[var8] = "Walk here @whi@" + var6;
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "q", descriptor = "(Z)V")
    public final void method154(boolean arg0) {
        this.field106 &= arg0;
        if (super.field1664 == 1) {
            if (super.field1665 >= 539 && super.field1665 <= 573 && super.field1666 >= 169 && super.field1666 < 205 && this.field255[0] != -1) {
                this.field438 = true;
                this.field234 = 0;
                this.field121 = true;
            }
            if (super.field1665 >= 569 && super.field1665 <= 599 && super.field1666 >= 168 && super.field1666 < 205 && this.field255[1] != -1) {
                this.field438 = true;
                this.field234 = 1;
                this.field121 = true;
            }
            if (super.field1665 >= 597 && super.field1665 <= 627 && super.field1666 >= 168 && super.field1666 < 205 && this.field255[2] != -1) {
                this.field438 = true;
                this.field234 = 2;
                this.field121 = true;
            }
            if (super.field1665 >= 625 && super.field1665 <= 669 && super.field1666 >= 168 && super.field1666 < 203 && this.field255[3] != -1) {
                this.field438 = true;
                this.field234 = 3;
                this.field121 = true;
            }
            if (super.field1665 >= 666 && super.field1665 <= 696 && super.field1666 >= 168 && super.field1666 < 205 && this.field255[4] != -1) {
                this.field438 = true;
                this.field234 = 4;
                this.field121 = true;
            }
            if (super.field1665 >= 694 && super.field1665 <= 724 && super.field1666 >= 168 && super.field1666 < 205 && this.field255[5] != -1) {
                this.field438 = true;
                this.field234 = 5;
                this.field121 = true;
            }
            if (super.field1665 >= 722 && super.field1665 <= 756 && super.field1666 >= 169 && super.field1666 < 205 && this.field255[6] != -1) {
                this.field438 = true;
                this.field234 = 6;
                this.field121 = true;
            }
            if (super.field1665 >= 540 && super.field1665 <= 574 && super.field1666 >= 466 && super.field1666 < 502 && this.field255[7] != -1) {
                this.field438 = true;
                this.field234 = 7;
                this.field121 = true;
            }
            if (super.field1665 >= 572 && super.field1665 <= 602 && super.field1666 >= 466 && super.field1666 < 503 && this.field255[8] != -1) {
                this.field438 = true;
                this.field234 = 8;
                this.field121 = true;
            }
            if (super.field1665 >= 599 && super.field1665 <= 629 && super.field1666 >= 466 && super.field1666 < 503 && this.field255[9] != -1) {
                this.field438 = true;
                this.field234 = 9;
                this.field121 = true;
            }
            if (super.field1665 >= 627 && super.field1665 <= 671 && super.field1666 >= 467 && super.field1666 < 502 && this.field255[10] != -1) {
                this.field438 = true;
                this.field234 = 10;
                this.field121 = true;
            }
            if (super.field1665 >= 669 && super.field1665 <= 699 && super.field1666 >= 466 && super.field1666 < 503 && this.field255[11] != -1) {
                this.field438 = true;
                this.field234 = 11;
                this.field121 = true;
            }
            if (super.field1665 >= 696 && super.field1665 <= 726 && super.field1666 >= 466 && super.field1666 < 503 && this.field255[12] != -1) {
                this.field438 = true;
                this.field234 = 12;
                this.field121 = true;
            }
            if (super.field1665 >= 724 && super.field1665 <= 758 && super.field1666 >= 466 && super.field1666 < 502 && this.field255[13] != -1) {
                this.field438 = true;
                this.field234 = 13;
                this.field121 = true;
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        return signlink.mainapp != null ? signlink.mainapp.getParameter(arg0) : super.getParameter(arg0);
    }

    @OriginalMember(owner = "client", name = "J", descriptor = "(I)V")
    public final void method155(int arg0) {
        if (this.field107 > 1) {
            --this.field107;
        }
        if (this.field492 > 0) {
            --this.field492;
        }
        for (int var2 = 0; var2 < 5 && this.method48(false); ++var2) {
        }
        if (this.field106) {
            Object var3 = this.field138.field1368;
            synchronized (this.field138.field1368) {
                if (!field330) {
                    this.field138.field1366 = 0;
                } else if (super.field1664 != 0 || this.field138.field1366 >= 40) {
                    this.field310.method314(43776, 17);
                    this.field310.method315(0);
                    int var4 = this.field310.field945;
                    int var5 = 0;
                    for (int var6 = 0; var6 < this.field138.field1366 && var4 - this.field310.field945 < 240; ++var6) {
                        ++var5;
                        int var7 = this.field138.field1365[var6];
                        if (var7 < 0) {
                            var7 = 0;
                        } else if (var7 > 502) {
                            var7 = 502;
                        }
                        int var8 = this.field138.field1367[var6];
                        if (var8 < 0) {
                            var8 = 0;
                        } else if (var8 > 764) {
                            var8 = 764;
                        }
                        int var9 = var7 * 765 + var8;
                        if (this.field138.field1365[var6] == -1 && this.field138.field1367[var6] == -1) {
                            var8 = -1;
                            var7 = -1;
                            var9 = 524287;
                        }
                        if (this.field81 == var8 && this.field82 == var7) {
                            if (this.field333 < 2047) {
                                ++this.field333;
                            }
                        } else {
                            int var10 = var8 - this.field81;
                            this.field81 = var8;
                            int var11 = var7 - this.field82;
                            this.field82 = var7;
                            if (this.field333 < 8 && var10 >= -32 && var10 <= 31 && var11 >= -32 && var11 <= 31) {
                                var10 += 32;
                                var11 += 32;
                                this.field310.method316((this.field333 << 12) + (var10 << 6) + var11);
                                this.field333 = 0;
                            } else if (this.field333 < 8) {
                                this.field310.method318((this.field333 << 19) + 8388608 + var9);
                                this.field333 = 0;
                            } else {
                                this.field310.method319((this.field333 << 19) + -1073741824 + var9);
                                this.field333 = 0;
                            }
                        }
                    }
                    this.field310.method324(this.field310.field945 - var4, false);
                    if (var5 >= this.field138.field1366) {
                        this.field138.field1366 = 0;
                    } else {
                        this.field138.field1366 -= var5;
                        for (int var12 = 0; var12 < this.field138.field1366; ++var12) {
                            this.field138.field1367[var12] = this.field138.field1367[var5 + var12];
                            this.field138.field1365[var12] = this.field138.field1365[var5 + var12];
                        }
                    }
                }
            }
            if (super.field1664 != 0) {
                long var13 = (super.field1667 - this.field78) / 50L;
                if (var13 > 4095L) {
                    var13 = 4095L;
                }
                this.field78 = super.field1667;
                int var15 = super.field1666;
                if (var15 < 0) {
                    var15 = 0;
                } else if (var15 > 502) {
                    var15 = 502;
                }
                int var16 = super.field1665;
                if (var16 < 0) {
                    var16 = 0;
                } else if (var16 > 764) {
                    var16 = 764;
                }
                int var17 = var15 * 765 + var16;
                byte var18 = 0;
                if (super.field1664 == 2) {
                    var18 = 1;
                }
                int var19 = (int) var13;
                this.field310.method314(43776, 81);
                this.field310.method359(false, (var18 << 19) + (var19 << 20) + var17);
            }
            if (this.field534 > 0) {
                --this.field534;
            }
            if (super.field1668[1] == 1 || super.field1668[2] == 1 || super.field1668[3] == 1 || super.field1668[4] == 1) {
                this.field535 = true;
            }
            if (this.field535 && this.field534 <= 0) {
                this.field534 = 20;
                this.field535 = false;
                this.field310.method314(43776, 74);
                this.field310.method351(this.field384, 46574);
                this.field310.method350(this.field383, -13310);
            }
            if (super.field1655 && !this.field136) {
                this.field136 = true;
                this.field310.method314(43776, 82);
                this.field310.method315(1);
            }
            if (!super.field1655 && this.field136) {
                this.field136 = false;
                this.field310.method314(43776, 82);
                this.field310.method315(0);
            }
            this.method75((byte) 121);
            this.method52(true);
            this.method81(this.field113);
            ++this.field490;
            if (this.field490 > 750) {
                this.method28(0);
            }
            this.method161(false);
            this.method107(0);
            this.method120(7);
            ++this.field455;
            if (this.field444 != 0) {
                this.field443 += 20;
                if (this.field443 >= 400) {
                    this.field444 = 0;
                }
            }
            if (this.field390 != 0) {
                ++this.field387;
                if (this.field387 >= 15) {
                    if (this.field390 == 2) {
                        this.field438 = true;
                    }
                    if (this.field390 == 3) {
                        this.field401 = true;
                    }
                    this.field390 = 0;
                }
            }
            if (this.field199 != 0) {
                ++this.field433;
                if (super.field1658 > this.field200 + 5 || super.field1658 < this.field200 - 5 || super.field1659 > this.field201 + 5 || super.field1659 < this.field201 - 5) {
                    this.field395 = true;
                }
                if (super.field1657 == 0) {
                    if (this.field199 == 2) {
                        this.field438 = true;
                    }
                    if (this.field199 == 3) {
                        this.field401 = true;
                    }
                    this.field199 = 0;
                    if (this.field395 && this.field433 >= 5) {
                        this.field414 = -1;
                        this.method66(113);
                        if (this.field414 == this.field197 && this.field413 != this.field198) {
                            class52 var20 = class52.field1258[this.field197];
                            byte var21 = 0;
                            if (this.field183 == 1 && var20.field1262 == 206) {
                                var21 = 1;
                            }
                            if (var20.field1304[this.field413] <= 0) {
                                var21 = 0;
                            }
                            if (var20.field1323) {
                                int var22 = this.field198;
                                int var23 = this.field413;
                                var20.field1304[var23] = var20.field1304[var22];
                                var20.field1272[var23] = var20.field1272[var22];
                                var20.field1304[var22] = -1;
                                var20.field1272[var22] = 0;
                            } else if (var21 == 1) {
                                int var24 = this.field198;
                                int var25 = this.field413;
                                while (var24 != var25) {
                                    if (var24 > var25) {
                                        var20.method487(var24 - 1, 0, var24);
                                        --var24;
                                    } else if (var24 < var25) {
                                        var20.method487(var24 + 1, 0, var24);
                                        ++var24;
                                    }
                                }
                            } else {
                                var20.method487(this.field413, 0, this.field198);
                            }
                            this.field310.method314(43776, 138);
                            this.field310.method316(this.field413);
                            this.field310.method349(this.field185, this.field198);
                            this.field310.method342(var21, 43665);
                            this.field310.method349(this.field185, this.field197);
                        }
                    } else if ((this.field508 == 1 || this.method143(this.field152 - 1, true)) && this.field152 > 2) {
                        this.method72((byte) 9);
                    } else if (this.field152 > 0) {
                        this.method119(this.field152 - 1, false);
                    }
                    this.field387 = 10;
                    super.field1664 = 0;
                }
            }
            if (class46.field1121 != -1) {
                int var26 = class46.field1121;
                int var27 = class46.field1122;
                boolean var28 = this.method22(0, var27, 0, 0, 0, var26, field144.field1228[0], 0, 0, true, (byte) -48, field144.field1229[0]);
                class46.field1121 = -1;
                if (var28) {
                    this.field441 = super.field1665;
                    this.field442 = super.field1666;
                    this.field444 = 1;
                    this.field443 = 0;
                }
            }
            if (super.field1664 == 1 && this.field191 != null) {
                this.field191 = null;
                this.field401 = true;
                super.field1664 = 0;
            }
            this.method95(5164);
            this.method36(3);
            this.method154(this.field222);
            this.method144(-853);
            if (arg0 != 0) {
                this.method70();
            }
            if (super.field1657 == 1 || super.field1664 == 1) {
                ++this.field415;
            }
            if (this.field497 == 2) {
                this.method118(true);
            }
            if (this.field497 == 2 && this.field430) {
                this.method134(14456);
            }
            for (int var29 = 0; var29 < 5; ++var29) {
                int var10002 = this.field381[var29]++;
            }
            this.method79(false);
            ++super.field1656;
            if (super.field1656 > 4500) {
                this.field492 = 250;
                super.field1656 -= 500;
                this.field310.method314(43776, 111);
            }
            ++this.field378;
            if (this.field378 > 500) {
                this.field378 = 0;
                int var30 = (int) (Math.random() * 8.0D);
                if ((var30 & 1) == 1) {
                    this.field467 += this.field468;
                }
                if ((var30 & 2) == 2) {
                    this.field285 += this.field286;
                }
                if ((var30 & 4) == 4) {
                    this.field223 += this.field224;
                }
            }
            if (this.field467 < -50) {
                this.field468 = 2;
            }
            if (this.field467 > 50) {
                this.field468 = -2;
            }
            if (this.field285 < -55) {
                this.field286 = 2;
            }
            if (this.field285 > 55) {
                this.field286 = -2;
            }
            if (this.field223 < -40) {
                this.field224 = 1;
            }
            if (this.field223 > 40) {
                this.field224 = -1;
            }
            ++this.field272;
            if (this.field272 > 500) {
                this.field272 = 0;
                int var31 = (int) (Math.random() * 8.0D);
                if ((var31 & 1) == 1) {
                    this.field277 += this.field278;
                }
                if ((var31 & 2) == 2) {
                    this.field420 += this.field421;
                }
            }
            if (this.field277 < -60) {
                this.field278 = 2;
            }
            if (this.field277 > 60) {
                this.field278 = -2;
            }
            if (this.field420 < -20) {
                this.field421 = 1;
            }
            if (this.field420 > 10) {
                this.field421 = -1;
            }
            ++this.field491;
            if (this.field491 > 50) {
                this.field310.method314(43776, 65);
            }
            try {
                if (this.field169 != null && this.field310.field945 > 0) {
                    this.field169.method518(this.field310.field944, 0, -358, this.field310.field945);
                    this.field310.field945 = 0;
                    this.field491 = 0;
                }
            } catch (IOException var33) {
                this.method28(0);
            } catch (Exception var34) {
                this.method147(0);
            }
        }
    }

    @OriginalMember(owner = "client", name = "r", descriptor = "(Z)V")
    public final void method156(boolean arg0) {
        byte[] var2 = this.field391.method176("title.dat", (byte[]) null);
        class55 var3 = new class55(var2, this);
        this.field174.method172(-130);
        var3.method496(0, 0, true);
        this.field175.method172(-130);
        var3.method496(0, -637, true);
        this.field171.method172(-130);
        var3.method496(0, -128, true);
        this.field172.method172(-130);
        var3.method496(-371, -202, true);
        this.field173.method172(-130);
        var3.method496(-171, -202, true);
        this.field176.method172(-130);
        var3.method496(-265, 0, true);
        this.field177.method172(-130);
        var3.method496(-265, -562, true);
        this.field178.method172(-130);
        var3.method496(-171, -128, true);
        this.field179.method172(-130);
        var3.method496(-171, -562, true);
        int[] var4 = new int[var3.field1345];
        for (int var5 = 0; var5 < var3.field1346; ++var5) {
            for (int var10 = 0; var10 < var3.field1345; ++var10) {
                var4[var10] = var3.field1344[var3.field1345 * var5 + (var3.field1345 - var10 - 1)];
            }
            for (int var11 = 0; var11 < var3.field1345; ++var11) {
                var3.field1344[var3.field1345 * var5 + var11] = var4[var11];
            }
        }
        this.field174.method172(-130);
        var3.method496(0, 382, true);
        this.field175.method172(-130);
        var3.method496(0, -255, true);
        this.field171.method172(-130);
        var3.method496(0, 254, true);
        this.field172.method172(-130);
        var3.method496(-371, 180, true);
        this.field173.method172(-130);
        var3.method496(-171, 180, true);
        this.field176.method172(-130);
        var3.method496(-265, 382, true);
        this.field177.method172(-130);
        var3.method496(-265, -180, true);
        this.field106 &= arg0;
        this.field178.method172(-130);
        var3.method496(-171, 254, true);
        this.field179.method172(-130);
        var3.method496(-171, -180, true);
        class55 var6 = new class55(this.field391, "logo", 0);
        this.field171.method172(-130);
        var6.method498(382 - var6.field1345 / 2 - 128, 18, 2);
        Object var7 = null;
        Object var8 = null;
        Object var9 = null;
        System.gc();
    }

    @OriginalMember(owner = "client", name = "l", descriptor = "(B)I")
    public final int method157(byte arg0) {
        int var2 = 3;
        if (arg0 != -21) {
            this.field185 = !this.field185;
        }
        if (this.field269 < 310) {
            int var3 = this.field266 >> 7;
            int var4 = this.field268 >> 7;
            int var5 = field144.field1206 >> 7;
            int var6 = field144.field1207 >> 7;
            if ((this.field517[this.field426][var3][var4] & 4) != 0) {
                var2 = this.field426;
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
                    if ((this.field517[this.field426][var3][var4] & 4) != 0) {
                        var2 = this.field426;
                    }
                    var10 += var9;
                    if (var10 >= 65536) {
                        var10 -= 65536;
                        if (var4 < var6) {
                            ++var4;
                        } else if (var4 > var6) {
                            --var4;
                        }
                        if ((this.field517[this.field426][var3][var4] & 4) != 0) {
                            var2 = this.field426;
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
                    if ((this.field517[this.field426][var3][var4] & 4) != 0) {
                        var2 = this.field426;
                    }
                    var12 += var11;
                    if (var12 >= 65536) {
                        var12 -= 65536;
                        if (var3 < var5) {
                            ++var3;
                        } else if (var3 > var5) {
                            --var3;
                        }
                        if ((this.field517[this.field426][var3][var4] & 4) != 0) {
                            var2 = this.field426;
                        }
                    }
                }
            }
        }
        if ((this.field517[this.field426][field144.field1206 >> 7][field144.field1207 >> 7] & 4) != 0) {
            var2 = this.field426;
        }
        return var2;
    }

    @OriginalMember(owner = "client", name = "K", descriptor = "(I)I")
    public final int method158(int arg0) {
        if (arg0 <= 0) {
            this.field538 = null;
        }
        int var2 = this.method24(this.field266, -8947, this.field268, this.field426);
        return var2 - this.field267 < 800 && (this.field517[this.field426][this.field266 >> 7][this.field268 >> 7] & 4) != 0 ? this.field426 : 3;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IILTDQUELMV;IIZIII)V")
    public final void method159(int arg0, int arg1, class52 arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, int arg8) {
        if (arg7 != 0) {
            for (int var10 = 1; var10 > 0; ++var10) {
            }
        }
        if (this.field437) {
            this.field302 = 32;
        } else {
            this.field302 = 0;
        }
        this.field437 = false;
        if (arg6 >= arg8 && arg6 < arg8 + 16 && arg0 >= arg1 && arg0 < arg1 + 16) {
            arg2.field1320 -= this.field415 * 4;
            if (arg5) {
                this.field438 = true;
                return;
            }
        } else if (arg6 >= arg8 && arg6 < arg8 + 16 && arg0 >= arg1 + arg4 - 16 && arg0 < arg1 + arg4) {
            arg2.field1320 += this.field415 * 4;
            if (arg5) {
                this.field438 = true;
                return;
            }
        } else {
            if (arg6 < arg8 - this.field302 || arg6 >= arg8 + 16 + this.field302 || arg0 < arg1 + 16 || arg0 >= arg1 + arg4 - 16 || this.field415 <= 0) {
                return;
            }
            int var11 = (arg4 - 32) * arg4 / arg3;
            if (var11 < 8) {
                var11 = 8;
            }
            int var12 = arg0 - arg1 - 16 - var11 / 2;
            int var13 = arg4 - 32 - var11;
            arg2.field1320 = (arg3 - arg4) * var12 / var13;
            if (arg5) {
                this.field438 = true;
            }
            this.field437 = true;
        }
    }

    @OriginalMember(owner = "client", name = "L", descriptor = "(I)V")
    public final void method160(int arg0) {
        this.field488 += arg0;
        signlink.midiplay = false;
        signlink.midifade = 0;
        signlink.midi = "stop";
    }

    @OriginalMember(owner = "client", name = "s", descriptor = "(Z)V")
    public final void method161(boolean arg0) {
        for (int var2 = -1; var2 < this.field459; ++var2) {
            int var3;
            if (var2 == -1) {
                var3 = this.field457;
            } else {
                var3 = this.field460[var2];
            }
            class29 var4 = this.field458[var3];
            if (var4 != null) {
                this.method108((byte) 1, 1, var4);
            }
        }
        if (arg0) {
            this.field538 = null;
        }
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; ++var1) {
            field283[var1] = var0 - 1;
            var0 += var0;
        }
        field353 = new int[99];
        int var2 = 0;
        for (int var3 = 0; var3 < 99; ++var3) {
            int var4 = var3 + 1;
            int var5 = (int) ((double) var4 + 300.0D * Math.pow(2.0D, (double) var4 / 7.0D));
            var2 += var5;
            field353[var3] = var2 / 4;
        }
        field373 = 10;
        field375 = true;
        field417 = 4;
        field498 = 38;
        field522 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
    }
}
