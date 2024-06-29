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
public class client extends class52 {

    @OriginalMember(owner = "client!client", name = "L", descriptor = "I")
    private int field163 = 50;

    @OriginalMember(owner = "client!client", name = "M", descriptor = "[I")
    private int[] field164 = new int[this.field163];

    @OriginalMember(owner = "client!client", name = "N", descriptor = "[I")
    private int[] field165 = new int[this.field163];

    @OriginalMember(owner = "client!client", name = "O", descriptor = "[I")
    private int[] field166 = new int[this.field163];

    @OriginalMember(owner = "client!client", name = "P", descriptor = "[I")
    private int[] field167 = new int[this.field163];

    @OriginalMember(owner = "client!client", name = "Q", descriptor = "[I")
    private int[] field168 = new int[this.field163];

    @OriginalMember(owner = "client!client", name = "R", descriptor = "[I")
    private int[] field169 = new int[this.field163];

    @OriginalMember(owner = "client!client", name = "S", descriptor = "[I")
    private int[] field170 = new int[this.field163];

    @OriginalMember(owner = "client!client", name = "T", descriptor = "[Ljava/lang/String;")
    private String[] field171 = new String[this.field163];

    @OriginalMember(owner = "client!client", name = "U", descriptor = "Z")
    private boolean field172 = false;

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
    private int field177 = 3353893;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "[I")
    private int[] field178 = new int[500];

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "[I")
    private int[] field179 = new int[500];

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "[I")
    private int[] field180 = new int[500];

    @OriginalMember(owner = "client!client", name = "db", descriptor = "[I")
    private int[] field181 = new int[500];

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "Z")
    private boolean field182 = false;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "[LRAOZRSKX;")
    private class44[] field183 = new class44[2];

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "Z")
    private boolean field185 = false;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
    private int field186 = -1;

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "[I")
    private int[] field188 = new int[151];

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "[J")
    private long[] field189 = new long[200];

    @OriginalMember(owner = "client!client", name = "nb", descriptor = "Ljava/lang/String;")
    private String field191 = "";

    @OriginalMember(owner = "client!client", name = "ub", descriptor = "[I")
    private int[] field198 = new int[50];

    @OriginalMember(owner = "client!client", name = "xb", descriptor = "I")
    private int field201 = 7;

    @OriginalMember(owner = "client!client", name = "zb", descriptor = "I")
    private int field203 = 2;

    @OriginalMember(owner = "client!client", name = "Ab", descriptor = "[Ljava/lang/String;")
    private String[] field204 = new String[200];

    @OriginalMember(owner = "client!client", name = "Nb", descriptor = "[LRUPQNTVM;")
    private class47[] field217 = new class47[4];

    @OriginalMember(owner = "client!client", name = "Ob", descriptor = "LZXKMWHPZ;")
    private class72 field218 = new class72((byte) 8);

    @OriginalMember(owner = "client!client", name = "Pb", descriptor = "LZXKMWHPZ;")
    private class72 field219 = new class72((byte) 8);

    @OriginalMember(owner = "client!client", name = "Qb", descriptor = "I")
    private int field220 = -738;

    @OriginalMember(owner = "client!client", name = "Rb", descriptor = "Z")
    private volatile boolean field221 = false;

    @OriginalMember(owner = "client!client", name = "Sb", descriptor = "Ljava/lang/String;")
    private String field222 = "";

    @OriginalMember(owner = "client!client", name = "Tb", descriptor = "I")
    private int field223 = -21443;

    @OriginalMember(owner = "client!client", name = "Ub", descriptor = "I")
    private int field224 = -470;

    @OriginalMember(owner = "client!client", name = "Wb", descriptor = "Z")
    private boolean field226 = false;

    @OriginalMember(owner = "client!client", name = "ac", descriptor = "I")
    private int field230 = -1;

    @OriginalMember(owner = "client!client", name = "bc", descriptor = "Z")
    private boolean field231 = false;

    @OriginalMember(owner = "client!client", name = "sc", descriptor = "[LNDGQUJMA;")
    private class36[] field248 = new class36[8];

    @OriginalMember(owner = "client!client", name = "uc", descriptor = "Z")
    public boolean field250 = false;

    @OriginalMember(owner = "client!client", name = "yc", descriptor = "I")
    private int field254 = 743;

    @OriginalMember(owner = "client!client", name = "Fc", descriptor = "B")
    private byte field261 = -120;

    @OriginalMember(owner = "client!client", name = "Kc", descriptor = "I")
    private int field266 = 2;

    @OriginalMember(owner = "client!client", name = "Mc", descriptor = "[I")
    private int[] field268 = new int[200];

    @OriginalMember(owner = "client!client", name = "Nc", descriptor = "[J")
    private long[] field269 = new long[100];

    @OriginalMember(owner = "client!client", name = "Oc", descriptor = "Z")
    private boolean field270 = false;

    @OriginalMember(owner = "client!client", name = "Tc", descriptor = "Ljava/lang/String;")
    private String field275 = "";

    @OriginalMember(owner = "client!client", name = "Vc", descriptor = "LZXKMWHPZ;")
    private class72 field277 = new class72((byte) 8);

    @OriginalMember(owner = "client!client", name = "Xc", descriptor = "[I")
    private int[] field279 = new int[33];

    @OriginalMember(owner = "client!client", name = "Yc", descriptor = "Z")
    private boolean field280 = false;

    @OriginalMember(owner = "client!client", name = "Zc", descriptor = "Z")
    private boolean field281 = true;

    @OriginalMember(owner = "client!client", name = "ad", descriptor = "Z")
    private boolean field282 = true;

    @OriginalMember(owner = "client!client", name = "bd", descriptor = "[I")
    private int[] field283 = new int[2000];

    @OriginalMember(owner = "client!client", name = "cd", descriptor = "I")
    private final int field284 = 100;

    @OriginalMember(owner = "client!client", name = "dd", descriptor = "[I")
    private int[] field285 = new int[100];

    @OriginalMember(owner = "client!client", name = "kd", descriptor = "Z")
    private boolean field292 = false;

    @OriginalMember(owner = "client!client", name = "nd", descriptor = "Z")
    private boolean field295 = false;

    @OriginalMember(owner = "client!client", name = "qd", descriptor = "Z")
    private boolean field298 = true;

    @OriginalMember(owner = "client!client", name = "sd", descriptor = "I")
    private int field300 = -347;

    @OriginalMember(owner = "client!client", name = "td", descriptor = "[I")
    private int[] field301 = new int[33];

    @OriginalMember(owner = "client!client", name = "wd", descriptor = "Z")
    private boolean field304 = true;

    @OriginalMember(owner = "client!client", name = "Ad", descriptor = "LFMDWWBSX;")
    private class15 field308 = new class15();

    @OriginalMember(owner = "client!client", name = "Cd", descriptor = "Z")
    private boolean field310 = false;

    @OriginalMember(owner = "client!client", name = "Dd", descriptor = "[I")
    private int[] field311 = new int[9];

    @OriginalMember(owner = "client!client", name = "Gd", descriptor = "I")
    private int field314 = 43818;

    @OriginalMember(owner = "client!client", name = "Id", descriptor = "I")
    private int field316 = -15852;

    @OriginalMember(owner = "client!client", name = "Od", descriptor = "Z")
    private boolean field322 = false;

    @OriginalMember(owner = "client!client", name = "be", descriptor = "Ljava/lang/String;")
    private String field335 = "";

    @OriginalMember(owner = "client!client", name = "de", descriptor = "[Ljava/lang/String;")
    private String[] field337 = new String[100];

    @OriginalMember(owner = "client!client", name = "ee", descriptor = "[I")
    private int[] field338 = new int[100];

    @OriginalMember(owner = "client!client", name = "ge", descriptor = "Z")
    private boolean field340 = false;

    @OriginalMember(owner = "client!client", name = "he", descriptor = "Z")
    private boolean field341 = false;

    @OriginalMember(owner = "client!client", name = "je", descriptor = "I")
    private int field343 = -1;

    @OriginalMember(owner = "client!client", name = "le", descriptor = "Z")
    private boolean field345 = false;

    @OriginalMember(owner = "client!client", name = "me", descriptor = "Ljava/lang/String;")
    private String field346 = "";

    @OriginalMember(owner = "client!client", name = "ne", descriptor = "Ljava/lang/String;")
    private String field347 = "";

    @OriginalMember(owner = "client!client", name = "we", descriptor = "I")
    private int field356 = -1;

    @OriginalMember(owner = "client!client", name = "xe", descriptor = "Z")
    private boolean field357 = true;

    @OriginalMember(owner = "client!client", name = "ye", descriptor = "I")
    private int field358 = 2048;

    @OriginalMember(owner = "client!client", name = "ze", descriptor = "I")
    private int field359 = 2047;

    @OriginalMember(owner = "client!client", name = "Ae", descriptor = "[LIOPHRJNF;")
    private class22[] field360 = new class22[this.field358];

    @OriginalMember(owner = "client!client", name = "Ce", descriptor = "[I")
    public int[] field362 = new int[this.field358];

    @OriginalMember(owner = "client!client", name = "Ee", descriptor = "[I")
    private int[] field364 = new int[this.field358];

    @OriginalMember(owner = "client!client", name = "Fe", descriptor = "[LBFQIDHPO;")
    private class3[] field365 = new class3[this.field358];

    @OriginalMember(owner = "client!client", name = "Ge", descriptor = "Z")
    private boolean field366 = false;

    @OriginalMember(owner = "client!client", name = "He", descriptor = "[[[I")
    private int[][][] field367 = new int[4][13][13];

    @OriginalMember(owner = "client!client", name = "Je", descriptor = "I")
    private int field369 = 8;

    @OriginalMember(owner = "client!client", name = "Qe", descriptor = "I")
    private int field376 = 7759444;

    @OriginalMember(owner = "client!client", name = "Ve", descriptor = "[Z")
    private boolean[] field381 = new boolean[5];

    @OriginalMember(owner = "client!client", name = "bf", descriptor = "Z")
    private boolean field387 = false;

    @OriginalMember(owner = "client!client", name = "ef", descriptor = "[[I")
    private int[][] field390 = new int[104][104];

    @OriginalMember(owner = "client!client", name = "lf", descriptor = "[I")
    private int[] field396 = new int[50];

    @OriginalMember(owner = "client!client", name = "sf", descriptor = "[I")
    private int[] field403 = new int[256];

    @OriginalMember(owner = "client!client", name = "tf", descriptor = "LBFQIDHPO;")
    private class3 field404 = class3.method42(field448, 1);

    @OriginalMember(owner = "client!client", name = "uf", descriptor = "I")
    private int field405 = -1;

    @OriginalMember(owner = "client!client", name = "xf", descriptor = "[I")
    public int[] field408 = new int[] { 17, 24, 34, 40 };

    @OriginalMember(owner = "client!client", name = "yf", descriptor = "I")
    private int field409 = -1;

    @OriginalMember(owner = "client!client", name = "Af", descriptor = "Z")
    private boolean field411 = false;

    @OriginalMember(owner = "client!client", name = "Ef", descriptor = "[LNDGQUJMA;")
    private class36[] field415 = new class36[32];

    @OriginalMember(owner = "client!client", name = "Ff", descriptor = "Ljava/lang/String;")
    private String field416 = "";

    @OriginalMember(owner = "client!client", name = "Gf", descriptor = "Ljava/lang/String;")
    private String field417 = "";

    @OriginalMember(owner = "client!client", name = "Hf", descriptor = "B")
    private byte field418 = 91;

    @OriginalMember(owner = "client!client", name = "If", descriptor = "[I")
    private int[] field419 = new int[4000];

    @OriginalMember(owner = "client!client", name = "Jf", descriptor = "[I")
    private int[] field420 = new int[4000];

    @OriginalMember(owner = "client!client", name = "Kf", descriptor = "I")
    private int field421 = 467;

    @OriginalMember(owner = "client!client", name = "Of", descriptor = "Z")
    private boolean field425 = false;

    @OriginalMember(owner = "client!client", name = "Qf", descriptor = "[I")
    private int[] field427 = new int[1000];

    @OriginalMember(owner = "client!client", name = "Rf", descriptor = "[I")
    private int[] field428 = new int[1000];

    @OriginalMember(owner = "client!client", name = "Sf", descriptor = "Z")
    private volatile boolean field429 = false;

    @OriginalMember(owner = "client!client", name = "Tf", descriptor = "[I")
    private int[] field430 = new int[class28.field1008];

    @OriginalMember(owner = "client!client", name = "Uf", descriptor = "I")
    private int field431 = 3;

    @OriginalMember(owner = "client!client", name = "Vf", descriptor = "[I")
    private final int[] field432 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!client", name = "Wf", descriptor = "B")
    private byte field433 = -37;

    @OriginalMember(owner = "client!client", name = "Xf", descriptor = "[Ljava/lang/String;")
    private String[] field434 = new String[500];

    @OriginalMember(owner = "client!client", name = "Yf", descriptor = "[I")
    private int[] field435 = new int[151];

    @OriginalMember(owner = "client!client", name = "Zf", descriptor = "I")
    private int field436 = 2301979;

    @OriginalMember(owner = "client!client", name = "bg", descriptor = "[I")
    private int[] field438 = new int[class28.field1008];

    @OriginalMember(owner = "client!client", name = "dg", descriptor = "I")
    private int field440 = -1;

    @OriginalMember(owner = "client!client", name = "eg", descriptor = "Z")
    private boolean field441 = true;

    @OriginalMember(owner = "client!client", name = "kg", descriptor = "Z")
    private boolean field447 = true;

    @OriginalMember(owner = "client!client", name = "og", descriptor = "[Ljava/lang/String;")
    private String[] field451 = new String[5];

    @OriginalMember(owner = "client!client", name = "pg", descriptor = "[Z")
    private boolean[] field452 = new boolean[5];

    @OriginalMember(owner = "client!client", name = "qg", descriptor = "Z")
    private boolean field453 = false;

    @OriginalMember(owner = "client!client", name = "rg", descriptor = "B")
    private byte field454 = 9;

    @OriginalMember(owner = "client!client", name = "xg", descriptor = "Ljava/util/zip/CRC32;")
    private CRC32 field460 = new CRC32();

    @OriginalMember(owner = "client!client", name = "zg", descriptor = "I")
    private int field462 = 943;

    @OriginalMember(owner = "client!client", name = "Ag", descriptor = "Z")
    private boolean field463 = false;

    @OriginalMember(owner = "client!client", name = "Cg", descriptor = "I")
    private int field465 = -1;

    @OriginalMember(owner = "client!client", name = "Eg", descriptor = "I")
    private int field467 = 2;

    @OriginalMember(owner = "client!client", name = "Fg", descriptor = "I")
    private int field468 = 128;

    @OriginalMember(owner = "client!client", name = "Jg", descriptor = "B")
    private byte field472 = -18;

    @OriginalMember(owner = "client!client", name = "Kg", descriptor = "[I")
    private int[] field473 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!client", name = "Lg", descriptor = "[I")
    private int[] field474 = new int[5];

    @OriginalMember(owner = "client!client", name = "Mg", descriptor = "I")
    private int field475 = -593;

    @OriginalMember(owner = "client!client", name = "Ng", descriptor = "I")
    private int field476 = 2531;

    @OriginalMember(owner = "client!client", name = "Pg", descriptor = "B")
    private byte field478 = -120;

    @OriginalMember(owner = "client!client", name = "Qg", descriptor = "[I")
    private int[] field479 = new int[class28.field1008];

    @OriginalMember(owner = "client!client", name = "Rg", descriptor = "[I")
    private int[] field480 = new int[5];

    @OriginalMember(owner = "client!client", name = "Tg", descriptor = "Z")
    private boolean field482 = false;

    @OriginalMember(owner = "client!client", name = "Ug", descriptor = "LBFQIDHPO;")
    private class3 field483 = class3.method42(field448, 1);

    @OriginalMember(owner = "client!client", name = "Vg", descriptor = "I")
    private int field484 = -1;

    @OriginalMember(owner = "client!client", name = "Xg", descriptor = "I")
    private int field486 = 78;

    @OriginalMember(owner = "client!client", name = "ch", descriptor = "[[I")
    private int[][] field491 = new int[104][104];

    @OriginalMember(owner = "client!client", name = "gh", descriptor = "[[I")
    private int[][] field495 = new int[104][104];

    @OriginalMember(owner = "client!client", name = "hh", descriptor = "I")
    private int field496 = -999;

    @OriginalMember(owner = "client!client", name = "kh", descriptor = "LBFQIDHPO;")
    private class3 field499 = class3.method42(field448, 1);

    @OriginalMember(owner = "client!client", name = "lh", descriptor = "[I")
    private int[] field500 = new int[5];

    @OriginalMember(owner = "client!client", name = "mh", descriptor = "Z")
    private boolean field501 = false;

    @OriginalMember(owner = "client!client", name = "nh", descriptor = "Ljava/lang/String;")
    private String field502 = "";

    @OriginalMember(owner = "client!client", name = "oh", descriptor = "LBFQIDHPO;")
    private class3 field503 = new class3(new byte[5000], -990);

    @OriginalMember(owner = "client!client", name = "ph", descriptor = "[LBFCMZACY;")
    private class2[] field504 = new class2[16384];

    @OriginalMember(owner = "client!client", name = "rh", descriptor = "[I")
    public int[] field506 = new int[16384];

    @OriginalMember(owner = "client!client", name = "sh", descriptor = "[I")
    private int[] field507 = new int[5];

    @OriginalMember(owner = "client!client", name = "Fh", descriptor = "[I")
    private int[] field520 = new int[5];

    @OriginalMember(owner = "client!client", name = "Gh", descriptor = "I")
    private int field521 = -1;

    @OriginalMember(owner = "client!client", name = "Hh", descriptor = "[B")
    private byte[] field522 = new byte[16384];

    @OriginalMember(owner = "client!client", name = "Mh", descriptor = "Z")
    private boolean field527 = true;

    @OriginalMember(owner = "client!client", name = "Nh", descriptor = "[LRAOZRSKX;")
    private class44[] field528 = new class44[13];

    @OriginalMember(owner = "client!client", name = "Qh", descriptor = "Z")
    private boolean field531 = false;

    @OriginalMember(owner = "client!client", name = "Wh", descriptor = "Z")
    private boolean field537 = true;

    @OriginalMember(owner = "client!client", name = "Xh", descriptor = "[LNDGQUJMA;")
    private class36[] field538 = new class36[1000];

    @OriginalMember(owner = "client!client", name = "ai", descriptor = "Z")
    private boolean field541 = true;

    @OriginalMember(owner = "client!client", name = "ci", descriptor = "[LNDGQUJMA;")
    private class36[] field543 = new class36[32];

    @OriginalMember(owner = "client!client", name = "di", descriptor = "[[[LZXKMWHPZ;")
    private class72[][][] field544 = new class72[4][104][104];

    @OriginalMember(owner = "client!client", name = "ni", descriptor = "I")
    private int field554 = -1;

    @OriginalMember(owner = "client!client", name = "ui", descriptor = "Z")
    public boolean field561 = true;

    @OriginalMember(owner = "client!client", name = "vi", descriptor = "I")
    private int field562 = 153;

    @OriginalMember(owner = "client!client", name = "zi", descriptor = "I")
    private int field566 = 1;

    @OriginalMember(owner = "client!client", name = "Ii", descriptor = "Z")
    private boolean field575 = false;

    @OriginalMember(owner = "client!client", name = "Ji", descriptor = "I")
    private int field576 = -1;

    @OriginalMember(owner = "client!client", name = "Ki", descriptor = "I")
    private int field577 = -1;

    @OriginalMember(owner = "client!client", name = "Mi", descriptor = "[I")
    public int[] field579 = new int[1000];

    @OriginalMember(owner = "client!client", name = "Oi", descriptor = "Ljava/lang/String;")
    private String field581 = "";

    @OriginalMember(owner = "client!client", name = "Si", descriptor = "[LRAOZRSKX;")
    private class44[] field585 = new class44[100];

    @OriginalMember(owner = "client!client", name = "Wi", descriptor = "I")
    private int field589 = 5063219;

    @OriginalMember(owner = "client!client", name = "Xi", descriptor = "Z")
    private volatile boolean field590 = false;

    @OriginalMember(owner = "client!client", name = "dj", descriptor = "Z")
    private boolean field596 = false;

    @OriginalMember(owner = "client!client", name = "fj", descriptor = "I")
    private int field598 = 1;

    @OriginalMember(owner = "client!client", name = "gj", descriptor = "[I")
    public int[] field599 = new int[2000];

    @OriginalMember(owner = "client!client", name = "hj", descriptor = "I")
    private int field600 = -535;

    @OriginalMember(owner = "client!client", name = "mj", descriptor = "I")
    private int field605 = -124;

    @OriginalMember(owner = "client!client", name = "nj", descriptor = "Z")
    private boolean field606 = false;

    @OriginalMember(owner = "client!client", name = "oj", descriptor = "I")
    private int field607 = 6332;

    @OriginalMember(owner = "client!client", name = "xj", descriptor = "Z")
    private boolean field616 = true;

    @OriginalMember(owner = "client!client", name = "yj", descriptor = "I")
    private int field617 = -1;

    @OriginalMember(owner = "client!client", name = "Cj", descriptor = "Z")
    private boolean field621 = false;

    @OriginalMember(owner = "client!client", name = "Dj", descriptor = "[I")
    private int[] field622 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!client", name = "Kj", descriptor = "[LNDGQUJMA;")
    private class36[] field629 = new class36[100];

    @OriginalMember(owner = "client!client", name = "Lj", descriptor = "I")
    private int field630 = -872;

    @OriginalMember(owner = "client!client", name = "Mj", descriptor = "I")
    private int field631 = -1;

    @OriginalMember(owner = "client!client", name = "Nj", descriptor = "Z")
    private boolean field632 = false;

    @OriginalMember(owner = "client!client", name = "Rj", descriptor = "[LVXBCLRCG;")
    public class61[] field636 = new class61[5];

    @OriginalMember(owner = "client!client", name = "Sj", descriptor = "[I")
    private int[] field637 = new int[100];

    @OriginalMember(owner = "client!client", name = "Tj", descriptor = "[Ljava/lang/String;")
    private String[] field638 = new String[100];

    @OriginalMember(owner = "client!client", name = "Uj", descriptor = "[Ljava/lang/String;")
    private String[] field639 = new String[100];

    @OriginalMember(owner = "client!client", name = "Vj", descriptor = "I")
    private int field640 = 4;

    @OriginalMember(owner = "client!client", name = "Wj", descriptor = "[I")
    private int[] field641 = new int[7];

    @OriginalMember(owner = "client!client", name = "Xj", descriptor = "I")
    private int field642 = 8;

    @OriginalMember(owner = "client!client", name = "Yj", descriptor = "[LNDGQUJMA;")
    private class36[] field643 = new class36[20];

    @OriginalMember(owner = "client!client", name = "ik", descriptor = "[I")
    private int[] field653 = new int[50];

    @OriginalMember(owner = "client!client", name = "jk", descriptor = "I")
    private int field654 = -1;

    @OriginalMember(owner = "client!client", name = "lk", descriptor = "[LNDGQUJMA;")
    private class36[] field656 = new class36[32];

    @OriginalMember(owner = "client!client", name = "zc", descriptor = "Ljava/math/BigInteger;")
    private static BigInteger field255 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client!client", name = "Bc", descriptor = "Ljava/lang/String;")
    private static String field257 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @OriginalMember(owner = "client!client", name = "Rc", descriptor = "Ljava/math/BigInteger;")
    private static BigInteger field273 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!client", name = "zd", descriptor = "[I")
    public static int[] field307 = new int[32];

    @OriginalMember(owner = "client!client", name = "Hd", descriptor = "[I")
    public static final int[] field315;

    @OriginalMember(owner = "client!client", name = "Le", descriptor = "I")
    private static int field371;

    @OriginalMember(owner = "client!client", name = "Ne", descriptor = "Z")
    private static boolean field373;

    @OriginalMember(owner = "client!client", name = "lg", descriptor = "I")
    private static int field448;

    @OriginalMember(owner = "client!client", name = "ij", descriptor = "I")
    private static int field601;

    @OriginalMember(owner = "client!client", name = "wj", descriptor = "[[I")
    public static final int[][] field615;

    @OriginalMember(owner = "client!client", name = "hk", descriptor = "[I")
    private static int[] field652;

    @OriginalMember(owner = "client!client", name = "K", descriptor = "I")
    private int field162;

    @OriginalMember(owner = "client!client", name = "V", descriptor = "I")
    private static int field173;

    @OriginalMember(owner = "client!client", name = "W", descriptor = "I")
    private int field174;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
    private int field184;

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
    private int field187;

    @OriginalMember(owner = "client!client", name = "mb", descriptor = "I")
    private static int field190;

    @OriginalMember(owner = "client!client", name = "ob", descriptor = "I")
    private int field192;

    @OriginalMember(owner = "client!client", name = "pb", descriptor = "I")
    private int field193;

    @OriginalMember(owner = "client!client", name = "qb", descriptor = "I")
    private int field194;

    @OriginalMember(owner = "client!client", name = "vb", descriptor = "I")
    private int field199;

    @OriginalMember(owner = "client!client", name = "wb", descriptor = "I")
    private int field200;

    @OriginalMember(owner = "client!client", name = "yb", descriptor = "I")
    private int field202;

    @OriginalMember(owner = "client!client", name = "Kb", descriptor = "I")
    private int field214;

    @OriginalMember(owner = "client!client", name = "Lb", descriptor = "I")
    private int field215;

    @OriginalMember(owner = "client!client", name = "Mb", descriptor = "I")
    private int field216;

    @OriginalMember(owner = "client!client", name = "Xb", descriptor = "I")
    private int field227;

    @OriginalMember(owner = "client!client", name = "Yb", descriptor = "I")
    private int field228;

    @OriginalMember(owner = "client!client", name = "Zb", descriptor = "I")
    private int field229;

    @OriginalMember(owner = "client!client", name = "cc", descriptor = "I")
    private int field232;

    @OriginalMember(owner = "client!client", name = "dc", descriptor = "I")
    private int field233;

    @OriginalMember(owner = "client!client", name = "ec", descriptor = "I")
    private int field234;

    @OriginalMember(owner = "client!client", name = "fc", descriptor = "I")
    private int field235;

    @OriginalMember(owner = "client!client", name = "gc", descriptor = "I")
    private int field236;

    @OriginalMember(owner = "client!client", name = "hc", descriptor = "I")
    private static int field237;

    @OriginalMember(owner = "client!client", name = "ic", descriptor = "I")
    private int field238;

    @OriginalMember(owner = "client!client", name = "jc", descriptor = "I")
    private static int field239;

    @OriginalMember(owner = "client!client", name = "pc", descriptor = "I")
    private int field245;

    @OriginalMember(owner = "client!client", name = "qc", descriptor = "I")
    private int field246;

    @OriginalMember(owner = "client!client", name = "vc", descriptor = "I")
    private int field251;

    @OriginalMember(owner = "client!client", name = "wc", descriptor = "I")
    public int field252;

    @OriginalMember(owner = "client!client", name = "xc", descriptor = "I")
    public int field253;

    @OriginalMember(owner = "client!client", name = "Ac", descriptor = "I")
    private int field256;

    @OriginalMember(owner = "client!client", name = "Ec", descriptor = "I")
    private static int field260;

    @OriginalMember(owner = "client!client", name = "Jc", descriptor = "I")
    private int field265;

    @OriginalMember(owner = "client!client", name = "Lc", descriptor = "I")
    private int field267;

    @OriginalMember(owner = "client!client", name = "Pc", descriptor = "I")
    private int field271;

    @OriginalMember(owner = "client!client", name = "Qc", descriptor = "I")
    private int field272;

    @OriginalMember(owner = "client!client", name = "Sc", descriptor = "I")
    private int field274;

    @OriginalMember(owner = "client!client", name = "Uc", descriptor = "I")
    private int field276;

    @OriginalMember(owner = "client!client", name = "Wc", descriptor = "I")
    private static int field278;

    @OriginalMember(owner = "client!client", name = "ed", descriptor = "I")
    private int field286;

    @OriginalMember(owner = "client!client", name = "fd", descriptor = "I")
    private int field287;

    @OriginalMember(owner = "client!client", name = "gd", descriptor = "I")
    private int field288;

    @OriginalMember(owner = "client!client", name = "hd", descriptor = "I")
    private int field289;

    @OriginalMember(owner = "client!client", name = "id", descriptor = "I")
    private int field290;

    @OriginalMember(owner = "client!client", name = "ld", descriptor = "I")
    private int field293;

    @OriginalMember(owner = "client!client", name = "md", descriptor = "I")
    public static int field294;

    @OriginalMember(owner = "client!client", name = "od", descriptor = "I")
    private int field296;

    @OriginalMember(owner = "client!client", name = "pd", descriptor = "I")
    private int field297;

    @OriginalMember(owner = "client!client", name = "rd", descriptor = "I")
    private int field299;

    @OriginalMember(owner = "client!client", name = "vd", descriptor = "I")
    private static int field303;

    @OriginalMember(owner = "client!client", name = "xd", descriptor = "I")
    private int field305;

    @OriginalMember(owner = "client!client", name = "Bd", descriptor = "I")
    private int field309;

    @OriginalMember(owner = "client!client", name = "Fd", descriptor = "I")
    private int field313;

    @OriginalMember(owner = "client!client", name = "Pd", descriptor = "I")
    private int field323;

    @OriginalMember(owner = "client!client", name = "Ud", descriptor = "I")
    private int field328;

    @OriginalMember(owner = "client!client", name = "Vd", descriptor = "I")
    private int field329;

    @OriginalMember(owner = "client!client", name = "Wd", descriptor = "I")
    private int field330;

    @OriginalMember(owner = "client!client", name = "Xd", descriptor = "I")
    private int field331;

    @OriginalMember(owner = "client!client", name = "Yd", descriptor = "I")
    private int field332;

    @OriginalMember(owner = "client!client", name = "Zd", descriptor = "I")
    private int field333;

    @OriginalMember(owner = "client!client", name = "ae", descriptor = "I")
    private int field334;

    @OriginalMember(owner = "client!client", name = "ce", descriptor = "I")
    private int field336;

    @OriginalMember(owner = "client!client", name = "fe", descriptor = "I")
    private int field339;

    @OriginalMember(owner = "client!client", name = "ke", descriptor = "I")
    private int field344;

    @OriginalMember(owner = "client!client", name = "Be", descriptor = "I")
    private int field361;

    @OriginalMember(owner = "client!client", name = "De", descriptor = "I")
    private int field363;

    @OriginalMember(owner = "client!client", name = "Ie", descriptor = "I")
    private static int field368;

    @OriginalMember(owner = "client!client", name = "Ke", descriptor = "I")
    private int field370;

    @OriginalMember(owner = "client!client", name = "Me", descriptor = "I")
    public static int field372;

    @OriginalMember(owner = "client!client", name = "Pe", descriptor = "I")
    private static int field375;

    @OriginalMember(owner = "client!client", name = "Re", descriptor = "I")
    private int field377;

    @OriginalMember(owner = "client!client", name = "Se", descriptor = "I")
    private int field378;

    @OriginalMember(owner = "client!client", name = "Te", descriptor = "I")
    private int field379;

    @OriginalMember(owner = "client!client", name = "Ue", descriptor = "I")
    private int field380;

    @OriginalMember(owner = "client!client", name = "We", descriptor = "I")
    private static int field382;

    @OriginalMember(owner = "client!client", name = "Ye", descriptor = "I")
    private int field384;

    @OriginalMember(owner = "client!client", name = "Ze", descriptor = "I")
    private int field385;

    @OriginalMember(owner = "client!client", name = "af", descriptor = "I")
    private int field386;

    @OriginalMember(owner = "client!client", name = "ff", descriptor = "I")
    private int field391;

    @OriginalMember(owner = "client!client", name = "gf", descriptor = "I")
    private int field392;

    @OriginalMember(owner = "client!client", name = "hf", descriptor = "I")
    private int field393;

    @OriginalMember(owner = "client!client", name = "jf", descriptor = "I")
    private int field394;

    @OriginalMember(owner = "client!client", name = "kf", descriptor = "I")
    private int field395;

    @OriginalMember(owner = "client!client", name = "mf", descriptor = "I")
    private static int field397;

    @OriginalMember(owner = "client!client", name = "rf", descriptor = "I")
    private int field402;

    @OriginalMember(owner = "client!client", name = "zf", descriptor = "I")
    private int field410;

    @OriginalMember(owner = "client!client", name = "Bf", descriptor = "I")
    private static int field412;

    @OriginalMember(owner = "client!client", name = "Cf", descriptor = "I")
    private static int field413;

    @OriginalMember(owner = "client!client", name = "Lf", descriptor = "I")
    private int field422;

    @OriginalMember(owner = "client!client", name = "Mf", descriptor = "I")
    private int field423;

    @OriginalMember(owner = "client!client", name = "Pf", descriptor = "I")
    private int field426;

    @OriginalMember(owner = "client!client", name = "ag", descriptor = "I")
    private static int field437;

    @OriginalMember(owner = "client!client", name = "cg", descriptor = "I")
    private int field439;

    @OriginalMember(owner = "client!client", name = "fg", descriptor = "I")
    private int field442;

    @OriginalMember(owner = "client!client", name = "gg", descriptor = "I")
    private int field443;

    @OriginalMember(owner = "client!client", name = "hg", descriptor = "I")
    private int field444;

    @OriginalMember(owner = "client!client", name = "ig", descriptor = "I")
    private int field445;

    @OriginalMember(owner = "client!client", name = "jg", descriptor = "I")
    private int field446;

    @OriginalMember(owner = "client!client", name = "sg", descriptor = "I")
    private int field455;

    @OriginalMember(owner = "client!client", name = "tg", descriptor = "I")
    private int field456;

    @OriginalMember(owner = "client!client", name = "ug", descriptor = "I")
    private int field457;

    @OriginalMember(owner = "client!client", name = "vg", descriptor = "I")
    private int field458;

    @OriginalMember(owner = "client!client", name = "wg", descriptor = "I")
    private int field459;

    @OriginalMember(owner = "client!client", name = "yg", descriptor = "I")
    private int field461;

    @OriginalMember(owner = "client!client", name = "Bg", descriptor = "I")
    private int field464;

    @OriginalMember(owner = "client!client", name = "Dg", descriptor = "I")
    private int field466;

    @OriginalMember(owner = "client!client", name = "Gg", descriptor = "I")
    private int field469;

    @OriginalMember(owner = "client!client", name = "Hg", descriptor = "I")
    private int field470;

    @OriginalMember(owner = "client!client", name = "Ig", descriptor = "I")
    private int field471;

    @OriginalMember(owner = "client!client", name = "Og", descriptor = "I")
    public int field477;

    @OriginalMember(owner = "client!client", name = "Sg", descriptor = "I")
    private static int field481;

    @OriginalMember(owner = "client!client", name = "dh", descriptor = "I")
    private int field492;

    @OriginalMember(owner = "client!client", name = "eh", descriptor = "I")
    private int field493;

    @OriginalMember(owner = "client!client", name = "fh", descriptor = "I")
    private int field494;

    @OriginalMember(owner = "client!client", name = "jh", descriptor = "I")
    private int field498;

    @OriginalMember(owner = "client!client", name = "qh", descriptor = "I")
    private int field505;

    @OriginalMember(owner = "client!client", name = "uh", descriptor = "I")
    private int field509;

    @OriginalMember(owner = "client!client", name = "Eh", descriptor = "I")
    private int field519;

    @OriginalMember(owner = "client!client", name = "Ih", descriptor = "I")
    private int field523;

    @OriginalMember(owner = "client!client", name = "Jh", descriptor = "I")
    private int field524;

    @OriginalMember(owner = "client!client", name = "Kh", descriptor = "I")
    private int field525;

    @OriginalMember(owner = "client!client", name = "Lh", descriptor = "I")
    private int field526;

    @OriginalMember(owner = "client!client", name = "Oh", descriptor = "I")
    private int field529;

    @OriginalMember(owner = "client!client", name = "Rh", descriptor = "I")
    private int field532;

    @OriginalMember(owner = "client!client", name = "Sh", descriptor = "I")
    private int field533;

    @OriginalMember(owner = "client!client", name = "Th", descriptor = "I")
    private int field534;

    @OriginalMember(owner = "client!client", name = "Uh", descriptor = "I")
    private int field535;

    @OriginalMember(owner = "client!client", name = "Yh", descriptor = "I")
    private int field539;

    @OriginalMember(owner = "client!client", name = "bi", descriptor = "I")
    private int field542;

    @OriginalMember(owner = "client!client", name = "ei", descriptor = "I")
    private int field545;

    @OriginalMember(owner = "client!client", name = "fi", descriptor = "I")
    private int field546;

    @OriginalMember(owner = "client!client", name = "ii", descriptor = "I")
    private int field549;

    @OriginalMember(owner = "client!client", name = "ji", descriptor = "I")
    private int field550;

    @OriginalMember(owner = "client!client", name = "ki", descriptor = "I")
    private int field551;

    @OriginalMember(owner = "client!client", name = "li", descriptor = "I")
    private int field552;

    @OriginalMember(owner = "client!client", name = "mi", descriptor = "I")
    private int field553;

    @OriginalMember(owner = "client!client", name = "oi", descriptor = "I")
    private int field555;

    @OriginalMember(owner = "client!client", name = "pi", descriptor = "I")
    private int field556;

    @OriginalMember(owner = "client!client", name = "qi", descriptor = "I")
    private int field557;

    @OriginalMember(owner = "client!client", name = "ri", descriptor = "I")
    private int field558;

    @OriginalMember(owner = "client!client", name = "si", descriptor = "I")
    private int field559;

    @OriginalMember(owner = "client!client", name = "ti", descriptor = "I")
    private int field560;

    @OriginalMember(owner = "client!client", name = "xi", descriptor = "I")
    public static int field564;

    @OriginalMember(owner = "client!client", name = "yi", descriptor = "I")
    private int field565;

    @OriginalMember(owner = "client!client", name = "Gi", descriptor = "I")
    private int field573;

    @OriginalMember(owner = "client!client", name = "Hi", descriptor = "I")
    private static int field574;

    @OriginalMember(owner = "client!client", name = "Li", descriptor = "I")
    private int field578;

    @OriginalMember(owner = "client!client", name = "Pi", descriptor = "I")
    private int field582;

    @OriginalMember(owner = "client!client", name = "Qi", descriptor = "I")
    private int field583;

    @OriginalMember(owner = "client!client", name = "Ri", descriptor = "I")
    private int field584;

    @OriginalMember(owner = "client!client", name = "Ti", descriptor = "I")
    private int field586;

    @OriginalMember(owner = "client!client", name = "Ui", descriptor = "I")
    private int field587;

    @OriginalMember(owner = "client!client", name = "Vi", descriptor = "I")
    private int field588;

    @OriginalMember(owner = "client!client", name = "Yi", descriptor = "I")
    private int field591;

    @OriginalMember(owner = "client!client", name = "Zi", descriptor = "I")
    private static int field592;

    @OriginalMember(owner = "client!client", name = "cj", descriptor = "I")
    private int field595;

    @OriginalMember(owner = "client!client", name = "ej", descriptor = "I")
    private int field597;

    @OriginalMember(owner = "client!client", name = "jj", descriptor = "I")
    private int field602;

    @OriginalMember(owner = "client!client", name = "kj", descriptor = "I")
    private int field603;

    @OriginalMember(owner = "client!client", name = "lj", descriptor = "I")
    private int field604;

    @OriginalMember(owner = "client!client", name = "pj", descriptor = "I")
    private int field608;

    @OriginalMember(owner = "client!client", name = "qj", descriptor = "I")
    private int field609;

    @OriginalMember(owner = "client!client", name = "rj", descriptor = "I")
    private int field610;

    @OriginalMember(owner = "client!client", name = "vj", descriptor = "I")
    private int field614;

    @OriginalMember(owner = "client!client", name = "Fj", descriptor = "I")
    private static int field624;

    @OriginalMember(owner = "client!client", name = "Jj", descriptor = "I")
    private int field628;

    @OriginalMember(owner = "client!client", name = "Oj", descriptor = "I")
    private int field633;

    @OriginalMember(owner = "client!client", name = "Pj", descriptor = "I")
    private int field634;

    @OriginalMember(owner = "client!client", name = "Qj", descriptor = "I")
    private static int field635;

    @OriginalMember(owner = "client!client", name = "bk", descriptor = "I")
    private int field646;

    @OriginalMember(owner = "client!client", name = "ck", descriptor = "I")
    private int field647;

    @OriginalMember(owner = "client!client", name = "dk", descriptor = "I")
    private int field648;

    @OriginalMember(owner = "client!client", name = "ek", descriptor = "I")
    private int field649;

    @OriginalMember(owner = "client!client", name = "fk", descriptor = "I")
    private int field650;

    @OriginalMember(owner = "client!client", name = "gk", descriptor = "I")
    private int field651;

    @OriginalMember(owner = "client!client", name = "kk", descriptor = "I")
    private int field655;

    @OriginalMember(owner = "client!client", name = "mk", descriptor = "I")
    private int field657;

    @OriginalMember(owner = "client!client", name = "nk", descriptor = "I")
    public static int field658;

    @OriginalMember(owner = "client!client", name = "Xe", descriptor = "J")
    public long field383;

    @OriginalMember(owner = "client!client", name = "ih", descriptor = "J")
    private long field497;

    @OriginalMember(owner = "client!client", name = "wi", descriptor = "J")
    private long field563;

    @OriginalMember(owner = "client!client", name = "Fi", descriptor = "J")
    private long field572;

    @OriginalMember(owner = "client!client", name = "bj", descriptor = "J")
    private long field594;

    @OriginalMember(owner = "client!client", name = "Ej", descriptor = "LIOPHRJNF;")
    public static class22 field623;

    @OriginalMember(owner = "client!client", name = "jd", descriptor = "LNDGQUJMA;")
    private class36 field291;

    @OriginalMember(owner = "client!client", name = "Jd", descriptor = "LNDGQUJMA;")
    private class36 field317;

    @OriginalMember(owner = "client!client", name = "Kd", descriptor = "LNDGQUJMA;")
    private class36 field318;

    @OriginalMember(owner = "client!client", name = "Ld", descriptor = "LNDGQUJMA;")
    private class36 field319;

    @OriginalMember(owner = "client!client", name = "Md", descriptor = "LNDGQUJMA;")
    private class36 field320;

    @OriginalMember(owner = "client!client", name = "Nd", descriptor = "LNDGQUJMA;")
    private class36 field321;

    @OriginalMember(owner = "client!client", name = "cf", descriptor = "LNDGQUJMA;")
    private class36 field388;

    @OriginalMember(owner = "client!client", name = "vf", descriptor = "LNDGQUJMA;")
    private class36 field406;

    @OriginalMember(owner = "client!client", name = "wf", descriptor = "LNDGQUJMA;")
    private class36 field407;

    @OriginalMember(owner = "client!client", name = "Nf", descriptor = "LNDGQUJMA;")
    private class36 field424;

    @OriginalMember(owner = "client!client", name = "gi", descriptor = "LNDGQUJMA;")
    private class36 field547;

    @OriginalMember(owner = "client!client", name = "hi", descriptor = "LNDGQUJMA;")
    private class36 field548;

    @OriginalMember(owner = "client!client", name = "aj", descriptor = "LNDGQUJMA;")
    private class36 field593;

    @OriginalMember(owner = "client!client", name = "Zj", descriptor = "LNDGQUJMA;")
    private class36 field644;

    @OriginalMember(owner = "client!client", name = "ak", descriptor = "LNDGQUJMA;")
    private class36 field645;

    @OriginalMember(owner = "client!client", name = "yd", descriptor = "LPJTXDRVG;")
    private class41 field306;

    @OriginalMember(owner = "client!client", name = "kc", descriptor = "LRAOZRSKX;")
    private class44 field240;

    @OriginalMember(owner = "client!client", name = "lc", descriptor = "LRAOZRSKX;")
    private class44 field241;

    @OriginalMember(owner = "client!client", name = "mc", descriptor = "LRAOZRSKX;")
    private class44 field242;

    @OriginalMember(owner = "client!client", name = "nc", descriptor = "LRAOZRSKX;")
    private class44 field243;

    @OriginalMember(owner = "client!client", name = "oc", descriptor = "LRAOZRSKX;")
    private class44 field244;

    @OriginalMember(owner = "client!client", name = "Cc", descriptor = "LRAOZRSKX;")
    private class44 field258;

    @OriginalMember(owner = "client!client", name = "Dc", descriptor = "LRAOZRSKX;")
    private class44 field259;

    @OriginalMember(owner = "client!client", name = "of", descriptor = "LRAOZRSKX;")
    private class44 field399;

    @OriginalMember(owner = "client!client", name = "pf", descriptor = "LRAOZRSKX;")
    private class44 field400;

    @OriginalMember(owner = "client!client", name = "qf", descriptor = "LRAOZRSKX;")
    private class44 field401;

    @OriginalMember(owner = "client!client", name = "Ai", descriptor = "LRAOZRSKX;")
    private class44 field567;

    @OriginalMember(owner = "client!client", name = "Bi", descriptor = "LRAOZRSKX;")
    private class44 field568;

    @OriginalMember(owner = "client!client", name = "Ci", descriptor = "LRAOZRSKX;")
    private class44 field569;

    @OriginalMember(owner = "client!client", name = "Di", descriptor = "LRAOZRSKX;")
    private class44 field570;

    @OriginalMember(owner = "client!client", name = "Ei", descriptor = "LRAOZRSKX;")
    private class44 field571;

    @OriginalMember(owner = "client!client", name = "sj", descriptor = "LRAOZRSKX;")
    private class44 field611;

    @OriginalMember(owner = "client!client", name = "tj", descriptor = "LRAOZRSKX;")
    private class44 field612;

    @OriginalMember(owner = "client!client", name = "uj", descriptor = "LRAOZRSKX;")
    private class44 field613;

    @OriginalMember(owner = "client!client", name = "Hj", descriptor = "LRAOZRSKX;")
    private class44 field626;

    @OriginalMember(owner = "client!client", name = "Ij", descriptor = "LRAOZRSKX;")
    private class44 field627;

    @OriginalMember(owner = "client!client", name = "Zh", descriptor = "LVSQMPWOM;")
    private class59 field540;

    @OriginalMember(owner = "client!client", name = "Qd", descriptor = "LBKBLJVKV;")
    private class5 field324;

    @OriginalMember(owner = "client!client", name = "Rd", descriptor = "LBKBLJVKV;")
    private class5 field325;

    @OriginalMember(owner = "client!client", name = "Sd", descriptor = "LBKBLJVKV;")
    private class5 field326;

    @OriginalMember(owner = "client!client", name = "Td", descriptor = "LBKBLJVKV;")
    private class5 field327;

    @OriginalMember(owner = "client!client", name = "Wg", descriptor = "LWMQKHABS;")
    private class64 field485;

    @OriginalMember(owner = "client!client", name = "rc", descriptor = "LZPYOGBCY;")
    private class69 field247;

    @OriginalMember(owner = "client!client", name = "Ph", descriptor = "LZRJULOYY;")
    public class70 field530;

    @OriginalMember(owner = "client!client", name = "Bb", descriptor = "LZTWZAULT;")
    private class71 field205;

    @OriginalMember(owner = "client!client", name = "Cb", descriptor = "LZTWZAULT;")
    private class71 field206;

    @OriginalMember(owner = "client!client", name = "Db", descriptor = "LZTWZAULT;")
    private class71 field207;

    @OriginalMember(owner = "client!client", name = "Eb", descriptor = "LZTWZAULT;")
    private class71 field208;

    @OriginalMember(owner = "client!client", name = "Fb", descriptor = "LZTWZAULT;")
    private class71 field209;

    @OriginalMember(owner = "client!client", name = "Gb", descriptor = "LZTWZAULT;")
    private class71 field210;

    @OriginalMember(owner = "client!client", name = "Hb", descriptor = "LZTWZAULT;")
    private class71 field211;

    @OriginalMember(owner = "client!client", name = "Ib", descriptor = "LZTWZAULT;")
    private class71 field212;

    @OriginalMember(owner = "client!client", name = "Jb", descriptor = "LZTWZAULT;")
    private class71 field213;

    @OriginalMember(owner = "client!client", name = "Gc", descriptor = "LZTWZAULT;")
    private class71 field262;

    @OriginalMember(owner = "client!client", name = "Hc", descriptor = "LZTWZAULT;")
    private class71 field263;

    @OriginalMember(owner = "client!client", name = "Ic", descriptor = "LZTWZAULT;")
    private class71 field264;

    @OriginalMember(owner = "client!client", name = "se", descriptor = "LZTWZAULT;")
    private class71 field352;

    @OriginalMember(owner = "client!client", name = "te", descriptor = "LZTWZAULT;")
    private class71 field353;

    @OriginalMember(owner = "client!client", name = "ue", descriptor = "LZTWZAULT;")
    private class71 field354;

    @OriginalMember(owner = "client!client", name = "ve", descriptor = "LZTWZAULT;")
    private class71 field355;

    @OriginalMember(owner = "client!client", name = "vh", descriptor = "LZTWZAULT;")
    private class71 field510;

    @OriginalMember(owner = "client!client", name = "wh", descriptor = "LZTWZAULT;")
    private class71 field511;

    @OriginalMember(owner = "client!client", name = "xh", descriptor = "LZTWZAULT;")
    private class71 field512;

    @OriginalMember(owner = "client!client", name = "yh", descriptor = "LZTWZAULT;")
    private class71 field513;

    @OriginalMember(owner = "client!client", name = "zh", descriptor = "LZTWZAULT;")
    private class71 field514;

    @OriginalMember(owner = "client!client", name = "Ah", descriptor = "LZTWZAULT;")
    private class71 field515;

    @OriginalMember(owner = "client!client", name = "Bh", descriptor = "LZTWZAULT;")
    private class71 field516;

    @OriginalMember(owner = "client!client", name = "Ch", descriptor = "LZTWZAULT;")
    private class71 field517;

    @OriginalMember(owner = "client!client", name = "Dh", descriptor = "LZTWZAULT;")
    private class71 field518;

    @OriginalMember(owner = "client!client", name = "Ni", descriptor = "LBPHGILGU;")
    private class7 field580;

    @OriginalMember(owner = "client!client", name = "rb", descriptor = "Ljava/lang/String;")
    public String field195;

    @OriginalMember(owner = "client!client", name = "df", descriptor = "Ljava/lang/String;")
    private String field389;

    @OriginalMember(owner = "client!client", name = "Vh", descriptor = "Ljava/lang/String;")
    public String field536;

    @OriginalMember(owner = "client!client", name = "Gj", descriptor = "Ljava/lang/String;")
    private String field625;

    @OriginalMember(owner = "client!client", name = "Ed", descriptor = "Ljava/net/Socket;")
    private Socket field312;

    @OriginalMember(owner = "client!client", name = "X", descriptor = "Z")
    public static boolean field175;

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "Z")
    private static boolean field176;

    @OriginalMember(owner = "client!client", name = "tc", descriptor = "Z")
    private static boolean field249;

    @OriginalMember(owner = "client!client", name = "Oe", descriptor = "Z")
    private static boolean field374;

    @OriginalMember(owner = "client!client", name = "Df", descriptor = "Z")
    public static boolean field414;

    @OriginalMember(owner = "client!client", name = "sb", descriptor = "[I")
    private int[] field196;

    @OriginalMember(owner = "client!client", name = "tb", descriptor = "[I")
    private int[] field197;

    @OriginalMember(owner = "client!client", name = "oe", descriptor = "[I")
    private int[] field348;

    @OriginalMember(owner = "client!client", name = "pe", descriptor = "[I")
    private int[] field349;

    @OriginalMember(owner = "client!client", name = "qe", descriptor = "[I")
    private int[] field350;

    @OriginalMember(owner = "client!client", name = "re", descriptor = "[I")
    private int[] field351;

    @OriginalMember(owner = "client!client", name = "mg", descriptor = "[I")
    private int[] field449;

    @OriginalMember(owner = "client!client", name = "ng", descriptor = "[I")
    private int[] field450;

    @OriginalMember(owner = "client!client", name = "Yg", descriptor = "[I")
    private int[] field487;

    @OriginalMember(owner = "client!client", name = "Zg", descriptor = "[I")
    private int[] field488;

    @OriginalMember(owner = "client!client", name = "ah", descriptor = "[I")
    private int[] field489;

    @OriginalMember(owner = "client!client", name = "bh", descriptor = "[I")
    private int[] field490;

    @OriginalMember(owner = "client!client", name = "zj", descriptor = "[I")
    private int[] field618;

    @OriginalMember(owner = "client!client", name = "Aj", descriptor = "[I")
    private int[] field619;

    @OriginalMember(owner = "client!client", name = "Bj", descriptor = "[I")
    private int[] field620;

    @OriginalMember(owner = "client!client", name = "ud", descriptor = "[LRAOZRSKX;")
    private class44[] field302;

    @OriginalMember(owner = "client!client", name = "ie", descriptor = "[[B")
    private byte[][] field342;

    @OriginalMember(owner = "client!client", name = "nf", descriptor = "[[B")
    private byte[][] field398;

    @OriginalMember(owner = "client!client", name = "th", descriptor = "[[[B")
    private byte[][][] field508;

    @OriginalMember(owner = "client!client", name = "Vb", descriptor = "[[[I")
    private int[][][] field225;

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(Z)V")
    public final void method150(boolean arg0) {
        class33 var2 = (class33) this.field277.method598();
        if (!arg0) {
            this.field527 = !this.field527;
        }
        while (var2 != null) {
            if (this.field272 == var2.field1050 && field564 <= var2.field1034) {
                if (field564 >= var2.field1033) {
                    if (var2.field1046 > 0) {
                        class2 var3 = this.field504[var2.field1046 - 1];
                        if (var3 != null && var3.field884 >= 0 && var3.field884 < 13312 && var3.field885 >= 0 && var3.field885 < 13312) {
                            var2.method337(field564, var3.field884, var3.field885, (byte) -127, this.method190(0, var3.field885, var2.field1050, var3.field884) - var2.field1038);
                        }
                    }
                    if (var2.field1046 < 0) {
                        int var4 = -var2.field1046 - 1;
                        class22 var5;
                        if (this.field186 == var4) {
                            var5 = field623;
                        } else {
                            var5 = this.field360[var4];
                        }
                        if (var5 != null && var5.field884 >= 0 && var5.field884 < 13312 && var5.field885 >= 0 && var5.field885 < 13312) {
                            var2.method337(field564, var5.field884, var5.field885, (byte) -127, this.method190(0, var5.field885, var2.field1050, var5.field884) - var2.field1038);
                        }
                    }
                    var2.method336(this.field628, 225);
                    this.field306.method384(var2.field1048, this.field272, (int) var2.field1052, 60, (int) var2.field1053, var2, -1, false, (byte) 3, (int) var2.field1051);
                }
            } else {
                var2.method329();
            }
            var2 = (class33) this.field277.method600(4);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)V")
    public final void method151(String arg0, String arg1, boolean arg2) {
        signlink.errorname = arg0;
        try {
            if (!arg2) {
                this.field346 = "";
                this.field347 = "Connecting to server...";
                this.method189(356, true);
            }
            this.field247 = new class69(this.method283(field372 + 43594), this, false);
            long var4 = class29.method323(arg0);
            int var6 = (int) (var4 >> 16 & 31L);
            this.field483.field50 = 0;
            this.field483.method44(14);
            this.field483.method44(var6);
            this.field247.method590(2, this.field483.field49, 0, 0);
            for (int var7 = 0; var7 < 8; ++var7) {
                this.field247.method587();
            }
            int var8 = this.field247.method587();
            int var9 = var8;
            if (var8 == 0) {
                this.field247.method589(this.field404.field49, 0, 8);
                this.field404.field50 = 0;
                this.field497 = this.field404.method60(true);
                int[] var10 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (this.field497 >> 32), (int) this.field497 };
                this.field483.field50 = 0;
                this.field483.method44(10);
                this.field483.method48(var10[0]);
                this.field483.method48(var10[1]);
                this.field483.method48(var10[2]);
                this.field483.method48(var10[3]);
                this.field483.method48(signlink.uid);
                this.field483.method51(arg0);
                this.field483.method51(arg1);
                this.field483.method69(-23339, field273, field255);
                this.field499.field50 = 0;
                if (arg2) {
                    this.field499.method44(18);
                } else {
                    this.field499.method44(16);
                }
                this.field499.method44(this.field483.field50 + 36 + 1 + 1 + 2);
                this.field499.method44(255);
                this.field499.method45(367);
                this.field499.method44(field374 ? 1 : 0);
                for (int var11 = 0; var11 < 9; ++var11) {
                    this.field499.method48(this.field311[var11]);
                }
                this.field499.method52(this.field483.field49, this.field483.field50, (byte) -119, 0);
                this.field483.field54 = new class64(var10, (byte) 4);
                for (int var12 = 0; var12 < 4; ++var12) {
                    var10[var12] += 50;
                }
                this.field485 = new class64(var10, (byte) 4);
                this.field247.method590(this.field499.field50, this.field499.field49, 0, 0);
                var8 = this.field247.method587();
            }
            if (var8 == 1) {
                try {
                    Thread.sleep(2000L);
                } catch (Exception var22) {
                }
                this.method151(arg0, arg1, arg2);
            } else if (var8 == 2) {
                this.field267 = this.field247.method587();
                field414 = this.field247.method587() == 1;
                this.field383 = 0L;
                this.field477 = 0;
                this.field530.field1751 = 0;
                super.field1438 = true;
                this.field561 = true;
                this.field250 = true;
                this.field483.field50 = 0;
                this.field404.field50 = 0;
                this.field233 = -1;
                this.field586 = -1;
                this.field587 = -1;
                this.field588 = -1;
                this.field232 = 0;
                this.field234 = 0;
                this.field238 = 0;
                this.field236 = 0;
                this.field251 = 0;
                this.field344 = 0;
                this.field310 = false;
                super.field1439 = 0;
                for (int var13 = 0; var13 < 100; ++var13) {
                    this.field639[var13] = null;
                }
                this.field532 = 0;
                this.field192 = 0;
                this.field256 = 0;
                this.field245 = 0;
                this.field202 = (int) (Math.random() * 100.0D) - 50;
                this.field265 = (int) (Math.random() * 110.0D) - 55;
                this.field597 = (int) (Math.random() * 80.0D) - 40;
                this.field466 = (int) (Math.random() * 120.0D) - 60;
                this.field565 = (int) (Math.random() * 30.0D) - 20;
                this.field469 = (int) (Math.random() * 20.0D) - 10 & 2047;
                this.field296 = 0;
                this.field654 = -1;
                this.field422 = 0;
                this.field423 = 0;
                this.field361 = 0;
                this.field505 = 0;
                for (int var14 = 0; var14 < this.field358; ++var14) {
                    this.field360[var14] = null;
                    this.field365[var14] = null;
                }
                for (int var15 = 0; var15 < 16384; ++var15) {
                    this.field504[var15] = null;
                }
                field623 = this.field360[this.field359] = new class22();
                this.field277.method602();
                this.field219.method602();
                for (int var16 = 0; var16 < 4; ++var16) {
                    for (int var17 = 0; var17 < 104; ++var17) {
                        for (int var18 = 0; var18 < 104; ++var18) {
                            this.field544[var16][var17][var18] = null;
                        }
                    }
                }
                this.field218 = new class72((byte) 8);
                this.field494 = 0;
                this.field493 = 0;
                this.method205(this.field554, -964);
                this.field554 = -1;
                this.method205(this.field465, -964);
                this.field465 = -1;
                this.method205(this.field484, -964);
                this.field484 = -1;
                this.method205(this.field356, -964);
                this.field356 = -1;
                this.method205(this.field440, -964);
                this.field440 = -1;
                this.method205(this.field631, -964);
                this.field631 = -1;
                this.method205(this.field521, -964);
                this.field521 = -1;
                this.field295 = false;
                this.field431 = 3;
                this.field646 = 0;
                this.field310 = false;
                this.field340 = false;
                this.field625 = null;
                this.field199 = 0;
                this.field617 = -1;
                this.field541 = true;
                this.method288((byte) 2);
                for (int var19 = 0; var19 < 5; ++var19) {
                    this.field500[var19] = 0;
                }
                for (int var20 = 0; var20 < 5; ++var20) {
                    this.field451[var20] = null;
                    this.field452[var20] = false;
                }
                field624 = 0;
                field592 = 0;
                field635 = 0;
                field481 = 0;
                field173 = 0;
                field375 = 0;
                field237 = 0;
                field437 = 0;
                field278 = 0;
                field412 = 0;
                this.method236(this.field421);
            } else if (var8 == 3) {
                this.field346 = "";
                this.field347 = "Invalid username or password.";
            } else if (var8 == 4) {
                this.field346 = "Your account has been disabled.";
                this.field347 = "Please check your message-centre for details.";
            } else if (var8 == 5) {
                this.field346 = "Your account is already logged in.";
                this.field347 = "Try again in 60 secs...";
            } else if (var8 == 6) {
                this.field346 = "RuneScape has been updated!";
                this.field347 = "Please reload this page.";
            } else if (var8 == 7) {
                this.field346 = "This world is full.";
                this.field347 = "Please use a different world.";
            } else if (var8 == 8) {
                this.field346 = "Unable to connect.";
                this.field347 = "Login server offline.";
            } else if (var8 == 9) {
                this.field346 = "Login limit exceeded.";
                this.field347 = "Too many connections from your address.";
            } else if (var8 == 10) {
                this.field346 = "Unable to connect.";
                this.field347 = "Bad session id.";
            } else if (var8 == 12) {
                this.field346 = "You need a members account to login to this world.";
                this.field347 = "Please subscribe, or use a different world.";
            } else if (var8 == 13) {
                this.field346 = "Could not complete login.";
                this.field347 = "Please try using a different world.";
            } else if (var8 == 14) {
                this.field346 = "The server is being updated.";
                this.field347 = "Please wait 1 minute and try again.";
            } else if (var8 == 15) {
                this.field250 = true;
                this.field483.field50 = 0;
                this.field404.field50 = 0;
                this.field233 = -1;
                this.field586 = -1;
                this.field587 = -1;
                this.field588 = -1;
                this.field232 = 0;
                this.field234 = 0;
                this.field238 = 0;
                this.field344 = 0;
                this.field310 = false;
                this.field563 = System.currentTimeMillis();
            } else if (var8 == 16) {
                this.field346 = "Login attempts exceeded.";
                this.field347 = "Please wait 1 minute and try again.";
            } else if (var8 == 17) {
                this.field346 = "You are standing in a members-only area.";
                this.field347 = "To play on this world move to a free area first";
            } else if (var8 == 20) {
                this.field346 = "Invalid loginserver requested";
                this.field347 = "Please try using a different world.";
            } else if (var8 != 21) {
                if (var8 == 22) {
                    this.field346 = "Malformed login packet.";
                    this.field347 = "Please try again.";
                } else if (var8 == 23) {
                    this.field346 = "No reply from loginserver.";
                    this.field347 = "Please try again.";
                } else if (var8 == 24) {
                    this.field346 = "Error loading your profile.";
                    this.field347 = "Please contact customer support.";
                } else if (var8 == 25) {
                    this.field346 = "Unexpected loginserver response.";
                    this.field347 = "Please try using a different world.";
                } else if (var8 == 26) {
                    this.field346 = "This computers address has been blocked";
                    this.field347 = "as it was used to break our rules";
                } else if (var8 == -1) {
                    if (var9 == 0) {
                        if (this.field216 < 2) {
                            try {
                                Thread.sleep(2000L);
                            } catch (Exception var24) {
                            }
                            ++this.field216;
                            this.method151(arg0, arg1, arg2);
                        } else {
                            this.field346 = "No response from loginserver";
                            this.field347 = "Please wait 1 minute and try again.";
                        }
                    } else {
                        this.field346 = "No response from server";
                        this.field347 = "Please try using a different world.";
                    }
                } else {
                    System.out.println("response:" + var8);
                    this.field346 = "Unexpected server response";
                    this.field347 = "Please try using a different world.";
                }
            } else {
                int var21 = this.field247.method587();
                for (int var26 = var21 + 3; var26 >= 0; --var26) {
                    this.field346 = "You have only just left another world";
                    this.field347 = "Your profile will be transferred in: " + var26;
                    this.method189(356, true);
                    try {
                        Thread.sleep(1200L);
                    } catch (Exception var23) {
                    }
                }
                this.method151(arg0, arg1, arg2);
            }
        } catch (IOException var25) {
            this.field346 = "";
            this.field347 = "Error connecting to server.";
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IILBFQIDHPO;)V")
    private final void method152(int arg0, int arg1, class3 arg2) {
        this.field578 = 0;
        this.field363 = 0;
        this.method178((byte) 2, arg2, arg0);
        this.method250(arg0, -470, arg2);
        if (arg1 <= 0) {
            this.field562 = -256;
        }
        this.method285(8, arg0, arg2);
        for (int var4 = 0; var4 < this.field578; ++var4) {
            int var6 = this.field579[var4];
            if (field564 != this.field504[var6].field883) {
                this.field504[var6].field25 = null;
                this.field504[var6] = null;
            }
        }
        if (arg2.field50 != arg0) {
            signlink.reporterror(this.field416 + " size mismatch in getnpcpos - pos:" + arg2.field50 + " psize:" + arg0);
            throw new RuntimeException("eek");
        } else {
            for (int var5 = 0; var5 < this.field505; ++var5) {
                if (this.field504[this.field506[var5]] == null) {
                    signlink.reporterror(this.field416 + " null entry in npc list - pos:" + var5 + " size:" + this.field505);
                    throw new RuntimeException("eek");
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(I)Z")
    public final boolean method153(int arg0) {
        if (arg0 != -38717) {
            throw new NullPointerException();
        } else if (this.field247 == null) {
            return false;
        } else {
            try {
                int var2 = this.field247.method588();
                if (var2 == 0) {
                    return false;
                }
                if (this.field233 == -1) {
                    this.field247.method589(this.field404.field49, 0, 1);
                    this.field233 = this.field404.field49[0] & 255;
                    if (this.field485 != null) {
                        this.field233 = this.field233 - this.field485.method534() & 255;
                    }
                    this.field232 = class11.field724[this.field233];
                    --var2;
                }
                if (this.field232 == -1) {
                    if (var2 <= 0) {
                        return false;
                    }
                    this.field247.method589(this.field404.field49, 0, 1);
                    this.field232 = this.field404.field49[0] & 255;
                    --var2;
                }
                if (this.field232 == -2) {
                    if (var2 <= 1) {
                        return false;
                    }
                    this.field247.method589(this.field404.field49, 0, 2);
                    this.field404.field50 = 0;
                    this.field232 = this.field404.method56();
                    var2 -= 2;
                }
                if (var2 < this.field232) {
                    return false;
                }
                this.field404.field50 = 0;
                this.field247.method589(this.field404.field49, 0, this.field232);
                this.field234 = 0;
                this.field588 = this.field587;
                this.field587 = this.field586;
                this.field586 = this.field233;
                if (this.field233 == 250) {
                    this.field501 = true;
                    int var3 = this.field404.method73(-732);
                    int var4 = this.field404.method59();
                    int var5 = this.field404.method54();
                    this.field430[var5] = var4;
                    this.field479[var5] = var3;
                    this.field438[var5] = 1;
                    for (int var6 = 0; var6 < 98; ++var6) {
                        if (var4 >= field652[var6]) {
                            this.field438[var5] = var6 + 2;
                        }
                    }
                    this.field233 = -1;
                    return true;
                }
                if (this.field233 == 38) {
                    int var7 = this.field404.method82((byte) 3);
                    this.method201(var7, (byte) 7);
                    if (this.field465 != -1) {
                        this.method205(this.field465, -964);
                        this.field465 = -1;
                        this.field226 = true;
                    }
                    if (this.field356 != -1) {
                        this.method205(this.field356, -964);
                        this.field356 = -1;
                        this.field596 = true;
                    }
                    if (this.field440 != -1) {
                        this.method205(this.field440, -964);
                        this.field440 = -1;
                    }
                    if (this.field484 != -1) {
                        this.method205(this.field484, -964);
                        this.field484 = -1;
                    }
                    if (this.field631 != var7) {
                        this.method205(this.field631, -964);
                        this.field631 = var7;
                    }
                    if (this.field646 != 0) {
                        this.field646 = 0;
                        this.field226 = true;
                    }
                    this.field501 = true;
                    this.field425 = true;
                    this.field295 = false;
                    this.field233 = -1;
                    return true;
                }
                if (this.field233 == 153) {
                    int var8 = this.field404.method81(true);
                    int var9 = this.field404.method83(this.field454);
                    if (this.field465 != -1) {
                        this.method205(this.field465, -964);
                        this.field465 = -1;
                        this.field226 = true;
                    }
                    if (this.field356 != -1) {
                        this.method205(this.field356, -964);
                        this.field356 = -1;
                        this.field596 = true;
                    }
                    if (this.field440 != -1) {
                        this.method205(this.field440, -964);
                        this.field440 = -1;
                    }
                    if (this.field484 != var9) {
                        this.method205(this.field484, -964);
                        this.field484 = var9;
                    }
                    if (this.field631 != var8) {
                        this.method205(this.field631, -964);
                        this.field631 = var8;
                    }
                    if (this.field646 != 0) {
                        this.field646 = 0;
                        this.field226 = true;
                    }
                    this.field501 = true;
                    this.field425 = true;
                    this.field295 = false;
                    this.field233 = -1;
                    return true;
                }
                if (this.field233 == 198) {
                    String var10 = this.field404.method61();
                    if (var10.endsWith(":tradereq:")) {
                        String var11 = var10.substring(0, var10.indexOf(":"));
                        long var12 = class29.method323(var11);
                        boolean var14 = false;
                        for (int var15 = 0; var15 < this.field498; ++var15) {
                            if (this.field269[var15] == var12) {
                                var14 = true;
                                break;
                            }
                        }
                        if (!var14 && this.field529 == 0) {
                            this.method192(var11, "wishes to trade with you.", 4, this.field369);
                        }
                    } else if (var10.endsWith(":duelreq:")) {
                        String var16 = var10.substring(0, var10.indexOf(":"));
                        long var17 = class29.method323(var16);
                        boolean var19 = false;
                        for (int var20 = 0; var20 < this.field498; ++var20) {
                            if (this.field269[var20] == var17) {
                                var19 = true;
                                break;
                            }
                        }
                        if (!var19 && this.field529 == 0) {
                            this.method192(var16, "wishes to duel with you.", 8, this.field369);
                        }
                    } else if (!var10.endsWith(":chalreq:")) {
                        this.method192("", var10, 0, this.field369);
                    } else {
                        String var21 = var10.substring(0, var10.indexOf(":"));
                        long var22 = class29.method323(var21);
                        boolean var24 = false;
                        for (int var25 = 0; var25 < this.field498; ++var25) {
                            if (this.field269[var25] == var22) {
                                var24 = true;
                                break;
                            }
                        }
                        if (!var24 && this.field529 == 0) {
                            String var26 = var10.substring(var10.indexOf(":") + 1, var10.length() - 9);
                            this.method192(var21, var26, 8, this.field369);
                        }
                    }
                    this.field233 = -1;
                    return true;
                }
                if (this.field233 == 220) {
                    this.field340 = false;
                    this.field646 = 2;
                    this.field502 = "";
                    this.field226 = true;
                    this.field233 = -1;
                    return true;
                }
                if (this.field233 == 14) {
                    int var27 = this.field404.method84(9);
                    int var28 = this.field404.method83(this.field454);
                    int var29 = this.field404.method85(-193);
                    class15 var30 = class15.method306(var28);
                    var30.field800 = var29;
                    var30.field786 = var27;
                    this.field233 = -1;
                    return true;
                }
                if (this.field233 == 216) {
                    int var31 = this.field404.method56();
                    int var32 = this.field404.method54();
                    int var33 = this.field404.method56();
                    if (var33 == 65535) {
                        if (this.field245 < 50) {
                            this.field396[this.field245] = (short) var31;
                            this.field653[this.field245] = var32;
                            this.field198[this.field245] = 0;
                            ++this.field245;
                        }
                    } else if (this.field447 && !field374 && this.field245 < 50) {
                        this.field396[this.field245] = var31;
                        this.field653[this.field245] = var32;
                        this.field198[this.field245] = class34.field1062[var31] + var33;
                        ++this.field245;
                    }
                    this.field233 = -1;
                    return true;
                }
                if (this.field233 == 149) {
                    this.field251 = this.field404.method54();
                    if (this.field251 == 1) {
                        this.field227 = this.field404.method56();
                    }
                    if (this.field251 >= 2 && this.field251 <= 6) {
                        if (this.field251 == 2) {
                            this.field289 = 64;
                            this.field290 = 64;
                        }
                        if (this.field251 == 3) {
                            this.field289 = 0;
                            this.field290 = 64;
                        }
                        if (this.field251 == 4) {
                            this.field289 = 128;
                            this.field290 = 64;
                        }
                        if (this.field251 == 5) {
                            this.field289 = 64;
                            this.field290 = 0;
                        }
                        if (this.field251 == 6) {
                            this.field289 = 64;
                            this.field290 = 128;
                        }
                        this.field251 = 2;
                        this.field286 = this.field404.method56();
                        this.field287 = this.field404.method56();
                        this.field288 = this.field404.method54();
                    }
                    if (this.field251 == 10) {
                        this.field464 = this.field404.method56();
                    }
                    this.field233 = -1;
                    return true;
                }
                if (this.field233 == 142) {
                    this.field498 = this.field232 / 8;
                    for (int var34 = 0; var34 < this.field498; ++var34) {
                        this.field269[var34] = this.field404.method60(true);
                    }
                    this.field233 = -1;
                    return true;
                }
                if (this.field233 == 10) {
                    this.field545 = this.field404.method54();
                    this.field546 = this.field404.method75(false);
                    this.field233 = -1;
                    return true;
                }
                if (this.field233 == 110) {
                    this.field501 = true;
                    int var35 = this.field404.method56();
                    class15 var36 = class15.method306(var35);
                    while (this.field404.field50 < this.field232) {
                        int var37 = this.field404.method68();
                        int var38 = this.field404.method56();
                        int var39 = this.field404.method54();
                        if (var39 == 255) {
                            var39 = this.field404.method59();
                        }
                        if (var37 >= 0 && var37 < var36.field747.length) {
                            var36.field747[var37] = var38;
                            var36.field790[var37] = var39;
                        }
                    }
                    this.field233 = -1;
                    return true;
                }
                if (this.field233 == 226) {
                    int var40 = this.field404.method81(true);
                    this.method201(var40, (byte) 7);
                    if (this.field631 != -1) {
                        this.method205(this.field631, -964);
                        this.field631 = -1;
                        this.field501 = true;
                        this.field425 = true;
                    }
                    if (this.field465 != -1) {
                        this.method205(this.field465, -964);
                        this.field465 = -1;
                        this.field226 = true;
                    }
                    if (this.field356 != -1) {
                        this.method205(this.field356, -964);
                        this.field356 = -1;
                        this.field596 = true;
                    }
                    if (this.field440 != -1) {
                        this.method205(this.field440, -964);
                        this.field440 = -1;
                    }
                    if (this.field484 != var40) {
                        this.method205(this.field484, -964);
                        this.field484 = var40;
                    }
                    if (this.field646 != 0) {
                        this.field646 = 0;
                        this.field226 = true;
                    }
                    this.field295 = false;
                    this.field233 = -1;
                    return true;
                }
                if (this.field233 == 36) {
                    this.field422 = 0;
                    this.field233 = -1;
                    return true;
                }
                if (this.field233 == 168) {
                    this.field494 = this.field404.method54();
                    this.field501 = true;
                    this.field233 = -1;
                    return true;
                }
                if (this.field233 == 121) {
                    int var41 = this.field404.method82((byte) 3);
                    int var42 = this.field404.method83(this.field454);
                    int var43 = var42 >> 10 & 31;
                    int var44 = var42 >> 5 & 31;
                    int var45 = var42 & 31;
                    class15.method306(var41).field748 = (var45 << 3) + (var43 << 19) + (var44 << 11);
                    this.field233 = -1;
                    return true;
                }
                if (this.field233 == 155) {
                    int var46 = this.field404.method86(false);
                    if (var46 >= 0) {
                        this.method201(var46, (byte) 7);
                    }
                    if (this.field521 != var46) {
                        this.method205(this.field521, -964);
                        this.field521 = var46;
                    }
                    this.field233 = -1;
                    return true;
                }
                if (this.field233 == 208) {
                    int var47 = this.field404.method83(this.field454);
                    class15.method306(var47).field794 = 3;
                    if (field623.field941 == null) {
                        class15.method306(var47).field795 = (field623.field939[11] << 5) + (field623.field939[8] << 10) + (field623.field939[0] << 15) + (field623.field948[0] << 25) + (field623.field948[4] << 20) + field623.field939[1];
                    } else {
                        class15.method306(var47).field795 = (int) (field623.field941.field1364 + 305419896L);
                    }
                    this.field233 = -1;
                    return true;
                }
                if (this.field233 == 1) {
                    int var48 = this.field404.method56();
                    int var49 = this.field404.method81(true);
                    int var50 = this.field404.method83(this.field454);
                    int var51 = this.field404.method82((byte) 3);
                    class15.method306(var48).field803 = var51;
                    class15.method306(var48).field804 = var49;
                    class15.method306(var48).field802 = var50;
                    this.field233 = -1;
                    return true;
                }
                if (this.field233 == 122) {
                    int var52 = this.field404.method54();
                    int var53 = this.field404.method54();
                    int var54 = this.field404.method54();
                    int var55 = this.field404.method54();
                    this.field381[var52] = true;
                    this.field480[var52] = var53;
                    this.field520[var52] = var54;
                    this.field507[var52] = var55;
                    this.field474[var52] = 0;
                    this.field233 = -1;
                    return true;
                }
                if (this.field233 == 123) {
                    int var56 = this.field404.method56();
                    boolean var57 = this.field404.method73(-732) == 1;
                    class15.method306(var56).field796 = var57;
                    this.field233 = -1;
                    return true;
                }
                if (this.field233 == 201) {
                    int var58 = this.field404.method73(-732);
                    int var59 = this.field404.method81(true);
                    if (var59 == 65535) {
                        var59 = -1;
                    }
                    if (this.field473[var58] != var59) {
                        this.method205(this.field473[var58], -964);
                        this.field473[var58] = var59;
                    }
                    this.field501 = true;
                    this.field425 = true;
                    this.field233 = -1;
                    return true;
                }
                if (this.field233 == 108) {
                    this.field238 = this.field404.method81(true) * 30;
                    this.field233 = -1;
                    return true;
                }
                if (this.field233 == 170) {
                    this.field185 = true;
                    this.field647 = this.field404.method54();
                    this.field648 = this.field404.method54();
                    this.field649 = this.field404.method56();
                    this.field650 = this.field404.method54();
                    this.field651 = this.field404.method54();
                    if (this.field651 >= 100) {
                        this.field556 = this.field647 * 128 + 64;
                        this.field558 = this.field648 * 128 + 64;
                        this.field557 = this.method190(0, this.field558, this.field272, this.field556) - this.field649;
                    }
                    this.field233 = -1;
                    return true;
                }
                if (this.field233 == 227) {
                    this.field617 = this.field404.method74(-719);
                    if (this.field617 == this.field431) {
                        if (this.field617 == 3) {
                            this.field431 = 1;
                        } else {
                            this.field431 = 3;
                        }
                        this.field501 = true;
                    }
                    this.field233 = -1;
                    return true;
                }
                if (this.field233 == 152) {
                    int var60 = this.field404.method81(true);
                    int var61 = this.field404.method56();
                    class15 var62 = class15.method306(var61);
                    if (var62 != null && var62.field818 == 0) {
                        if (var60 < 0) {
                            var60 = 0;
                        }
                        if (var60 > var62.field791 - var62.field776) {
                            var60 = var62.field791 - var62.field776;
                        }
                        var62.field819 = var60;
                    }
                    this.field233 = -1;
                    return true;
                }
                if (this.field233 == 53) {
                    int var63 = this.field404.method83(this.field454);
                    int var64 = this.field404.method81(true);
                    class15.method306(var63).field794 = 1;
                    class15.method306(var63).field795 = var64;
                    this.field233 = -1;
                    return true;
                }
                if (this.field233 == 19) {
                    this.field545 = this.field404.method74(-719);
                    this.field546 = this.field404.method74(-719);
                    while (this.field404.field50 < this.field232) {
                        int var65 = this.field404.method54();
                        this.method272(true, var65, this.field404);
                    }
                    this.field233 = -1;
                    return true;
                }
                if (this.field233 == 235) {
                    this.field199 = this.field404.method54();
                    this.field233 = -1;
                    return true;
                }
                if (this.field233 == 47) {
                    String var66 = this.field404.method61();
                    int var67 = this.field404.method54();
                    int var68 = this.field404.method73(-732);
                    if (var68 >= 1 && var68 <= 5) {
                        if (var66.equalsIgnoreCase("null")) {
                            var66 = null;
                        }
                        this.field451[var68 - 1] = var66;
                        this.field452[var68 - 1] = var67 == 0;
                    }
                    this.field233 = -1;
                    return true;
                }
                if (this.field233 == 75) {
                    int var69 = this.field404.method56();
                    int var70 = this.field404.method83(this.field454);
                    int var71 = this.field404.method81(true);
                    class15.method306(var70).field775 = (var71 << 16) + var69;
                    this.field233 = -1;
                    return true;
                }
                if (this.field233 == 99) {
                    this.field186 = this.field404.method56();
                    this.field299 = this.field404.method75(false);
                    this.field233 = -1;
                    return true;
                }
                if (this.field233 == 181) {
                    for (int var72 = 0; var72 < this.field360.length; ++var72) {
                        if (this.field360[var72] != null) {
                            this.field360[var72].field869 = -1;
                        }
                    }
                    for (int var73 = 0; var73 < this.field504.length; ++var73) {
                        if (this.field504[var73] != null) {
                            this.field504[var73].field869 = -1;
                        }
                    }
                    this.field233 = -1;
                    return true;
                }
                if (this.field233 == 45) {
                    long var74 = this.field404.method60(true);
                    int var76 = this.field404.method59();
                    int var77 = this.field404.method54();
                    boolean var78 = false;
                    for (int var79 = 0; var79 < 100; ++var79) {
                        if (this.field285[var79] == var76) {
                            var78 = true;
                            break;
                        }
                    }
                    if (var77 <= 1) {
                        for (int var80 = 0; var80 < this.field498; ++var80) {
                            if (this.field269[var80] == var74) {
                                var78 = true;
                                break;
                            }
                        }
                    }
                    if (!var78 && this.field529 == 0) {
                        try {
                            this.field285[this.field539] = var76;
                            this.field539 = (this.field539 + 1) % 100;
                            String var81 = class40.method369(this.field605, this.field404, this.field232 - 13);
                            if (var77 != 3) {
                                var81 = class1.method11(-18263, var81);
                            }
                            if (var77 != 2 && var77 != 3) {
                                if (var77 == 1) {
                                    this.method192("@cr1@" + class29.method327(class29.method324(true, var74), (byte) 58), var81, 7, this.field369);
                                } else {
                                    this.method192(class29.method327(class29.method324(true, var74), (byte) 58), var81, 3, this.field369);
                                }
                            } else {
                                this.method192("@cr2@" + class29.method327(class29.method324(true, var74), (byte) 58), var81, 7, this.field369);
                            }
                        } catch (Exception var190) {
                            signlink.reporterror("cde1");
                        }
                    }
                    this.field233 = -1;
                    return true;
                }
                if (this.field233 == 243 || this.field233 == 46) {
                    int var83 = this.field214;
                    int var84 = this.field215;
                    if (this.field233 == 243) {
                        var83 = this.field404.method83(this.field454);
                        var84 = this.field404.method56();
                        this.field172 = false;
                    }
                    if (this.field233 == 46) {
                        var83 = this.field404.method83(this.field454);
                        var84 = this.field404.method81(true);
                        this.field404.method64(0);
                        int var85 = 0;
                        while (true) {
                            if (var85 >= 4) {
                                this.field404.method66(false);
                                this.field172 = true;
                                break;
                            }
                            for (int var86 = 0; var86 < 13; ++var86) {
                                for (int var87 = 0; var87 < 13; ++var87) {
                                    int var88 = this.field404.method65((byte) 88, 1);
                                    if (var88 == 1) {
                                        this.field367[var85][var86][var87] = this.field404.method65((byte) 88, 26);
                                    } else {
                                        this.field367[var85][var86][var87] = -1;
                                    }
                                }
                            }
                            ++var85;
                        }
                    }
                    if (this.field214 == var83 && this.field215 == var84 && this.field256 == 2) {
                        this.field233 = -1;
                        return true;
                    }
                    this.field214 = var83;
                    this.field215 = var84;
                    this.field377 = (this.field214 - 6) * 8;
                    this.field378 = (this.field215 - 6) * 8;
                    this.field280 = false;
                    if ((this.field214 / 8 == 48 || this.field214 / 8 == 49) && this.field215 / 8 == 48) {
                        this.field280 = true;
                    }
                    if (this.field214 / 8 == 48 && this.field215 / 8 == 148) {
                        this.field280 = true;
                    }
                    this.field256 = 1;
                    this.field563 = System.currentTimeMillis();
                    this.method230(true, (String) null, "Loading - please wait.");
                    if (this.field233 == 243) {
                        int var89 = 0;
                        int var90 = (this.field214 - 6) / 8;
                        label1191: while (true) {
                            if (var90 > (this.field214 + 6) / 8) {
                                this.field398 = new byte[var89][];
                                this.field342 = new byte[var89][];
                                this.field618 = new int[var89];
                                this.field619 = new int[var89];
                                this.field620 = new int[var89];
                                int var92 = 0;
                                int var93 = (this.field214 - 6) / 8;
                                while (true) {
                                    if (var93 > (this.field214 + 6) / 8) {
                                        break label1191;
                                    }
                                    for (int var94 = (this.field215 - 6) / 8; var94 <= (this.field215 + 6) / 8; ++var94) {
                                        this.field618[var92] = (var93 << 8) + var94;
                                        if (!this.field280 || var94 != 49 && var94 != 149 && var94 != 147 && var93 != 50 && (var93 != 49 || var94 != 47)) {
                                            int var95 = this.field619[var92] = this.field580.method129(var93, 0, false, var94);
                                            if (var95 != -1) {
                                                this.field580.method118(3, var95);
                                            }
                                            int var96 = this.field620[var92] = this.field580.method129(var93, 1, false, var94);
                                            if (var96 != -1) {
                                                this.field580.method118(3, var96);
                                            }
                                            ++var92;
                                        } else {
                                            this.field619[var92] = -1;
                                            this.field620[var92] = -1;
                                            ++var92;
                                        }
                                    }
                                    ++var93;
                                }
                            }
                            for (int var91 = (this.field215 - 6) / 8; var91 <= (this.field215 + 6) / 8; ++var91) {
                                ++var89;
                            }
                            ++var90;
                        }
                    }
                    if (this.field233 == 46) {
                        int var97 = 0;
                        int[] var98 = new int[676];
                        int var99 = 0;
                        label1150: while (true) {
                            if (var99 >= 4) {
                                this.field398 = new byte[var97][];
                                this.field342 = new byte[var97][];
                                this.field618 = new int[var97];
                                this.field619 = new int[var97];
                                this.field620 = new int[var97];
                                int var107 = 0;
                                while (true) {
                                    if (var107 >= var97) {
                                        break label1150;
                                    }
                                    int var108 = this.field618[var107] = var98[var107];
                                    int var109 = var108 >> 8 & 255;
                                    int var110 = var108 & 255;
                                    int var111 = this.field619[var107] = this.field580.method129(var109, 0, false, var110);
                                    if (var111 != -1) {
                                        this.field580.method118(3, var111);
                                    }
                                    int var112 = this.field620[var107] = this.field580.method129(var109, 1, false, var110);
                                    if (var112 != -1) {
                                        this.field580.method118(3, var112);
                                    }
                                    ++var107;
                                }
                            }
                            for (int var100 = 0; var100 < 13; ++var100) {
                                for (int var101 = 0; var101 < 13; ++var101) {
                                    int var102 = this.field367[var99][var100][var101];
                                    if (var102 != -1) {
                                        int var103 = var102 >> 14 & 1023;
                                        int var104 = var102 >> 3 & 2047;
                                        int var105 = (var103 / 8 << 8) + var104 / 8;
                                        for (int var106 = 0; var106 < var97; ++var106) {
                                            if (var98[var106] == var105) {
                                                var105 = -1;
                                                break;
                                            }
                                        }
                                        if (var105 != -1) {
                                            var98[var97++] = var105;
                                        }
                                    }
                                }
                            }
                            ++var99;
                        }
                    }
                    int var113 = this.field377 - this.field379;
                    int var114 = this.field378 - this.field380;
                    this.field379 = this.field377;
                    this.field380 = this.field378;
                    for (int var115 = 0; var115 < 16384; ++var115) {
                        class2 var116 = this.field504[var115];
                        if (var116 != null) {
                            for (int var117 = 0; var117 < 10; ++var117) {
                                var116.field905[var117] -= var113;
                                var116.field906[var117] -= var114;
                            }
                            var116.field884 -= var113 * 128;
                            var116.field885 -= var114 * 128;
                        }
                    }
                    for (int var118 = 0; var118 < this.field358; ++var118) {
                        class22 var119 = this.field360[var118];
                        if (var119 != null) {
                            for (int var120 = 0; var120 < 10; ++var120) {
                                var119.field905[var120] -= var113;
                                var119.field906[var120] -= var114;
                            }
                            var119.field884 -= var113 * 128;
                            var119.field885 -= var114 * 128;
                        }
                    }
                    this.field411 = true;
                    byte var121 = 0;
                    byte var122 = 104;
                    byte var123 = 1;
                    if (var113 < 0) {
                        var121 = 103;
                        var122 = -1;
                        var123 = -1;
                    }
                    byte var124 = 0;
                    byte var125 = 104;
                    byte var126 = 1;
                    if (var114 < 0) {
                        var124 = 103;
                        var125 = -1;
                        var126 = -1;
                    }
                    for (int var127 = var121; var122 != var127; var127 += var123) {
                        for (int var128 = var124; var125 != var128; var128 += var126) {
                            int var129 = var113 + var127;
                            int var130 = var114 + var128;
                            for (int var131 = 0; var131 < 4; ++var131) {
                                if (var129 >= 0 && var130 >= 0 && var129 < 104 && var130 < 104) {
                                    this.field544[var131][var127][var128] = this.field544[var131][var129][var130];
                                } else {
                                    this.field544[var131][var127][var128] = null;
                                }
                            }
                        }
                    }
                    for (class26 var132 = (class26) this.field218.method598(); var132 != null; var132 = (class26) this.field218.method600(4)) {
                        var132.field985 -= var113;
                        var132.field986 -= var114;
                        if (var132.field985 < 0 || var132.field986 < 0 || var132.field985 >= 104 || var132.field986 >= 104) {
                            var132.method329();
                        }
                    }
                    if (this.field422 != 0) {
                        this.field422 -= var113;
                        this.field423 -= var114;
                    }
                    this.field185 = false;
                    this.field233 = -1;
                    return true;
                }
                if (this.field233 == 240) {
                    if (this.field431 == 12) {
                        this.field501 = true;
                    }
                    this.field323 = this.field404.method54();
                    this.field233 = -1;
                    return true;
                }
                if (this.field233 == 92) {
                    int var133 = this.field404.method83(this.field454);
                    int var134 = this.field404.method86(false);
                    class15 var135 = class15.method306(var133);
                    if (var135.field787 != var134 || var134 == -1) {
                        var135.field787 = var134;
                        var135.field761 = 0;
                        var135.field749 = 0;
                    }
                    this.field233 = -1;
                    return true;
                }
                if (this.field233 == 222) {
                    this.field545 = this.field404.method75(false);
                    this.field546 = this.field404.method73(-732);
                    for (int var136 = this.field545; var136 < this.field545 + 8; ++var136) {
                        for (int var137 = this.field546; var137 < this.field546 + 8; ++var137) {
                            if (this.field544[this.field272][var136][var137] != null) {
                                this.field544[this.field272][var136][var137] = null;
                                this.method213(var136, var137);
                            }
                        }
                    }
                    for (class26 var138 = (class26) this.field218.method598(); var138 != null; var138 = (class26) this.field218.method600(4)) {
                        if (var138.field985 >= this.field545 && var138.field985 < this.field545 + 8 && var138.field986 >= this.field546 && var138.field986 < this.field546 + 8 && this.field272 == var138.field983) {
                            var138.field982 = 0;
                        }
                    }
                    this.field233 = -1;
                    return true;
                }
                if (this.field233 == 129) {
                    int var139 = this.field404.method56();
                    class15 var140 = class15.method306(var139);
                    for (int var141 = 0; var141 < var140.field747.length; ++var141) {
                        var140.field747[var141] = -1;
                        var140.field747[var141] = 0;
                    }
                    this.field233 = -1;
                    return true;
                }
                if (this.field233 == 207) {
                    this.field614 = this.field404.method54();
                    this.field459 = this.field404.method54();
                    this.field602 = this.field404.method54();
                    this.field531 = true;
                    this.field226 = true;
                    this.field233 = -1;
                    return true;
                }
                if (this.field233 == 171) {
                    this.field431 = this.field404.method54();
                    this.field501 = true;
                    this.field425 = true;
                    this.field233 = -1;
                    return true;
                }
                if (this.field233 == 73) {
                    int var142 = this.field404.method82((byte) 3);
                    int var143 = this.field404.method81(true);
                    class15.method306(var143).field794 = 2;
                    class15.method306(var143).field795 = var142;
                    this.field233 = -1;
                    return true;
                }
                if (this.field233 == 159) {
                    int var144 = this.field404.method56();
                    int var145 = this.field404.method82((byte) 3);
                    this.method201(var144, (byte) 7);
                    if (var145 != -1) {
                        this.method201(var145, (byte) 7);
                    }
                    if (this.field484 != -1) {
                        this.method205(this.field484, -964);
                        this.field484 = -1;
                    }
                    if (this.field631 != -1) {
                        this.method205(this.field631, -964);
                        this.field631 = -1;
                    }
                    if (this.field465 != -1) {
                        this.method205(this.field465, -964);
                        this.field465 = -1;
                    }
                    if (this.field356 != var144) {
                        this.method205(this.field356, -964);
                        this.field356 = var144;
                    }
                    if (this.field440 != var144) {
                        this.method205(this.field440, -964);
                        this.field440 = var145;
                    }
                    this.field646 = 0;
                    this.field295 = false;
                    this.field233 = -1;
                    return true;
                }
                if (this.field233 == 5) {
                    int var146 = this.field404.method86(false);
                    if (this.field554 != var146) {
                        this.method205(this.field554, -964);
                        this.field554 = var146;
                    }
                    this.field226 = true;
                    this.field233 = -1;
                    return true;
                }
                if (this.field233 == 78) {
                    this.method152(this.field232, this.field254, this.field404);
                    this.field233 = -1;
                    return true;
                }
                if (this.field233 == 205) {
                    this.field296 = this.field404.method54();
                    this.field233 = -1;
                    return true;
                }
                if (this.field233 == 252) {
                    this.method229(0);
                    this.field233 = -1;
                    return false;
                }
                if (this.field233 == 228) {
                    if (this.field631 != -1) {
                        this.method205(this.field631, -964);
                        this.field631 = -1;
                        this.field501 = true;
                        this.field425 = true;
                    }
                    if (this.field465 != -1) {
                        this.method205(this.field465, -964);
                        this.field465 = -1;
                        this.field226 = true;
                    }
                    if (this.field356 != -1) {
                        this.method205(this.field356, -964);
                        this.field356 = -1;
                        this.field596 = true;
                    }
                    if (this.field440 != -1) {
                        this.method205(this.field440, -964);
                        this.field440 = -1;
                    }
                    if (this.field484 != -1) {
                        this.method205(this.field484, -964);
                        this.field484 = -1;
                    }
                    if (this.field646 != 0) {
                        this.field646 = 0;
                        this.field226 = true;
                    }
                    this.field295 = false;
                    this.field233 = -1;
                    return true;
                }
                if (this.field233 == 61) {
                    long var147 = this.field404.method60(true);
                    int var149 = this.field404.method54();
                    String var150 = class29.method327(class29.method324(true, var147), (byte) 58);
                    for (int var151 = 0; var151 < this.field493; ++var151) {
                        if (this.field189[var151] == var147) {
                            if (this.field268[var151] != var149) {
                                this.field268[var151] = var149;
                                this.field501 = true;
                                if (var149 > 0) {
                                    this.method192("", var150 + " has logged in.", 5, this.field369);
                                }
                                if (var149 == 0) {
                                    this.method192("", var150 + " has logged out.", 5, this.field369);
                                }
                            }
                            var150 = null;
                            break;
                        }
                    }
                    if (var150 != null && this.field493 < 200) {
                        this.field189[this.field493] = var147;
                        this.field204[this.field493] = var150;
                        this.field268[this.field493] = var149;
                        ++this.field493;
                        this.field501 = true;
                    }
                    boolean var152 = false;
                    while (!var152) {
                        var152 = true;
                        for (int var153 = 0; var153 < this.field493 - 1; ++var153) {
                            if (this.field268[var153] != field371 && this.field268[var153 + 1] == field371 || this.field268[var153] == 0 && this.field268[var153 + 1] != 0) {
                                int var154 = this.field268[var153];
                                this.field268[var153] = this.field268[var153 + 1];
                                this.field268[var153 + 1] = var154;
                                String var155 = this.field204[var153];
                                this.field204[var153] = this.field204[var153 + 1];
                                this.field204[var153 + 1] = var155;
                                long var156 = this.field189[var153];
                                this.field189[var153] = this.field189[var153 + 1];
                                this.field189[var153 + 1] = var156;
                                this.field501 = true;
                                var152 = false;
                            }
                        }
                    }
                    this.field233 = -1;
                    return true;
                }
                if (this.field233 == 113) {
                    this.field185 = false;
                    for (int var158 = 0; var158 < 5; ++var158) {
                        this.field381[var158] = false;
                    }
                    this.field233 = -1;
                    return true;
                }
                if (this.field233 == 23) {
                    if (this.field431 == 12) {
                        this.field501 = true;
                    }
                    this.field591 = this.field404.method57();
                    this.field233 = -1;
                    return true;
                }
                if (this.field233 == 4) {
                    for (int var159 = 0; var159 < this.field599.length; ++var159) {
                        if (this.field599[var159] != this.field283[var159]) {
                            this.field599[var159] = this.field283[var159];
                            this.method155((byte) 5, var159);
                            this.field501 = true;
                        }
                    }
                    this.field233 = -1;
                    return true;
                }
                if (this.field233 == 157) {
                    this.field340 = false;
                    this.field646 = 1;
                    this.field502 = "";
                    this.field226 = true;
                    this.field233 = -1;
                    return true;
                }
                if (this.field233 == 7) {
                    int var160 = this.field404.method83(this.field454);
                    int var161 = this.field404.method83(this.field454);
                    int var162 = this.field404.method82((byte) 3);
                    if (var161 == 65535) {
                        class15.method306(var162).field794 = 0;
                        this.field233 = -1;
                        return true;
                    }
                    class45 var163 = class45.method456(var161);
                    class15.method306(var162).field794 = 4;
                    class15.method306(var162).field795 = var161;
                    class15.method306(var162).field803 = var163.field1253;
                    class15.method306(var162).field804 = var163.field1268;
                    class15.method306(var162).field802 = var163.field1289 * 100 / var160;
                    this.field233 = -1;
                    return true;
                }
                if (this.field233 == 83) {
                    this.field185 = true;
                    this.field442 = this.field404.method54();
                    this.field443 = this.field404.method54();
                    this.field444 = this.field404.method56();
                    this.field445 = this.field404.method54();
                    this.field446 = this.field404.method54();
                    if (this.field446 >= 100) {
                        int var164 = this.field442 * 128 + 64;
                        int var165 = this.field443 * 128 + 64;
                        int var166 = this.method190(0, var165, this.field272, var164) - this.field444;
                        int var167 = var164 - this.field556;
                        int var168 = var166 - this.field557;
                        int var169 = var165 - this.field558;
                        int var170 = (int) Math.sqrt((double) (var167 * var167 + var169 * var169));
                        this.field559 = (int) (Math.atan2((double) var168, (double) var170) * 325.949D) & 2047;
                        this.field560 = (int) (Math.atan2((double) var167, (double) var169) * -325.949D) & 2047;
                        if (this.field559 < 128) {
                            this.field559 = 128;
                        }
                        if (this.field559 > 383) {
                            this.field559 = 383;
                        }
                    }
                    this.field233 = -1;
                    return true;
                }
                if (this.field233 == 141) {
                    int var171 = this.field404.method81(true);
                    this.method201(var171, (byte) 7);
                    if (this.field631 != -1) {
                        this.method205(this.field631, -964);
                        this.field631 = -1;
                        this.field501 = true;
                        this.field425 = true;
                    }
                    if (this.field356 != -1) {
                        this.method205(this.field356, -964);
                        this.field356 = -1;
                        this.field596 = true;
                    }
                    if (this.field440 != -1) {
                        this.method205(this.field440, -964);
                        this.field440 = -1;
                    }
                    if (this.field484 != -1) {
                        this.method205(this.field484, -964);
                        this.field484 = -1;
                    }
                    if (this.field465 != var171) {
                        this.method205(this.field465, -964);
                        this.field465 = var171;
                    }
                    this.field295 = false;
                    this.field226 = true;
                    this.field233 = -1;
                    return true;
                }
                if (this.field233 == 184) {
                    this.field461 = this.field404.method82((byte) 3);
                    this.field293 = this.field404.method83(this.field454);
                    this.field553 = this.field404.method82((byte) 3);
                    this.field370 = this.field404.method59();
                    this.field410 = this.field404.method56();
                    this.field305 = this.field404.method83(this.field454);
                    this.field404.method54();
                    this.field633 = this.field404.method83(this.field454);
                    this.field608 = this.field404.method56();
                    this.field610 = this.field404.method82((byte) 3);
                    this.field404.method82((byte) 3);
                    signlink.dnslookup(class29.method326(this.field370, -367));
                    this.field233 = -1;
                    return true;
                }
                if (this.field233 == 245) {
                    this.field501 = true;
                    int var172 = this.field404.method56();
                    class15 var173 = class15.method306(var172);
                    int var174 = this.field404.method56();
                    for (int var175 = 0; var175 < var174; ++var175) {
                        var173.field747[var175] = this.field404.method81(true);
                        int var176 = this.field404.method74(-719);
                        if (var176 == 255) {
                            var176 = this.field404.method59();
                        }
                        var173.field790[var175] = var176;
                    }
                    for (int var177 = var174; var177 < var173.field747.length; ++var177) {
                        var173.field747[var177] = 0;
                        var173.field790[var177] = 0;
                    }
                    this.field233 = -1;
                    return true;
                }
                if (this.field233 == 65) {
                    int var178 = this.field404.method81(true);
                    String var179 = this.field404.method61();
                    class15.method306(var178).field764 = var179;
                    int var10001 = this.field473[this.field431];
                    if (class15.method306(var178).field753 == var10001) {
                        this.field501 = true;
                    }
                    this.field233 = -1;
                    return true;
                }
                if (this.field233 == 26 || this.field233 == 215 || this.field233 == 27 || this.field233 == 192 || this.field233 == 204 || this.field233 == 12 || this.field233 == 62 || this.field233 == 33 || this.field233 == 76 || this.field233 == 11 || this.field233 == 106) {
                    this.method272(true, this.field233, this.field404);
                    this.field233 = -1;
                    return true;
                }
                if (this.field233 == 253) {
                    int var180 = this.field404.method82((byte) 3);
                    int var181 = this.field404.method89(216);
                    this.field283[var180] = var181;
                    if (this.field599[var180] != var181) {
                        this.field599[var180] = var181;
                        this.method155((byte) 5, var180);
                        this.field501 = true;
                        if (this.field554 != -1) {
                            this.field226 = true;
                        }
                    }
                    this.field233 = -1;
                    return true;
                }
                if (this.field233 == 224) {
                    this.method177(this.field232, 22847, this.field404);
                    this.field411 = false;
                    this.field233 = -1;
                    return true;
                }
                if (this.field233 == 128) {
                    int var182 = this.field404.method56();
                    byte var183 = this.field404.method77((byte) 5);
                    this.field283[var182] = var183;
                    if (this.field599[var182] != var183) {
                        this.field599[var182] = var183;
                        this.method155((byte) 5, var182);
                        this.field501 = true;
                        if (this.field554 != -1) {
                            this.field226 = true;
                        }
                    }
                    this.field233 = -1;
                    return true;
                }
                if (this.field233 == 191) {
                    int var184 = this.field404.method56();
                    if (var184 == 65535) {
                        var184 = -1;
                    }
                    if (this.field343 != var184 && this.field537 && !field374 && this.field655 == 0) {
                        this.field297 = var184;
                        this.field298 = true;
                        this.field580.method118(2, this.field297);
                    }
                    this.field343 = var184;
                    this.field233 = -1;
                    return true;
                }
                if (this.field233 == 247) {
                    int var185 = this.field404.method81(true);
                    int var186 = this.field404.method87((byte) -86);
                    if (this.field537 && !field374) {
                        this.field297 = var185;
                        this.field298 = false;
                        this.field580.method118(2, this.field297);
                        this.field655 = var186;
                    }
                    this.field233 = -1;
                    return true;
                }
                signlink.reporterror("T1 - " + this.field233 + "," + this.field232 + " - " + this.field587 + "," + this.field588);
                this.method229(0);
            } catch (IOException var191) {
                this.method154(false);
            } catch (Exception var192) {
                String var188 = "T2 - " + this.field233 + "," + this.field587 + "," + this.field588 + " - " + this.field232 + "," + (field623.field905[0] + this.field377) + "," + (field623.field906[0] + this.field378) + " - ";
                for (int var189 = 0; var189 < this.field232 && var189 < 50; ++var189) {
                    var188 = var188 + this.field404.field49[var189] + ",";
                }
                signlink.reporterror(var188);
                this.method229(0);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(Z)V")
    public final void method154(boolean arg0) {
        if (this.field236 > 0) {
            this.method229(0);
        } else {
            this.method230(true, "Please wait - attempting to reestablish", "Connection lost");
            if (arg0) {
                this.field233 = this.field404.method54();
            }
            this.field296 = 0;
            this.field422 = 0;
            class69 var2 = this.field247;
            this.field250 = false;
            this.field216 = 0;
            this.method151(this.field416, this.field417, true);
            if (!this.field250) {
                this.method229(0);
            }
            try {
                var2.method586();
            } catch (Exception var3) {
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(BI)V")
    public final void method155(byte arg0, int arg1) {
        int var3 = class37.field1086[arg1].field1094;
        if (arg0 != 5) {
            this.field544 = null;
        }
        if (var3 != 0) {
            int var4 = this.field599[arg1];
            if (var3 == 1) {
                if (var4 == 1) {
                    class42.method433(0.9D, false);
                }
                if (var4 == 2) {
                    class42.method433(0.8D, false);
                }
                if (var4 == 3) {
                    class42.method433(0.7D, false);
                }
                if (var4 == 4) {
                    class42.method433(0.6D, false);
                }
                class45.field1256.method497();
                this.field596 = true;
            }
            if (var3 == 3) {
                boolean var5 = this.field537;
                if (var4 == 0) {
                    this.method241(364, 0, this.field537);
                    this.field537 = true;
                }
                if (var4 == 1) {
                    this.method241(364, -400, this.field537);
                    this.field537 = true;
                }
                if (var4 == 2) {
                    this.method241(364, -800, this.field537);
                    this.field537 = true;
                }
                if (var4 == 3) {
                    this.method241(364, -1200, this.field537);
                    this.field537 = true;
                }
                if (var4 == 4) {
                    this.field537 = false;
                }
                if (this.field537 != var5 && !field374) {
                    if (this.field537) {
                        this.field297 = this.field343;
                        this.field298 = true;
                        this.field580.method118(2, this.field297);
                    } else {
                        this.method212(0);
                    }
                    this.field655 = 0;
                }
            }
            if (var3 == 4) {
                if (var4 == 0) {
                    this.field447 = true;
                    this.method280(-44090, 0);
                }
                if (var4 == 1) {
                    this.field447 = true;
                    this.method280(-44090, -400);
                }
                if (var4 == 2) {
                    this.field447 = true;
                    this.method280(-44090, -800);
                }
                if (var4 == 3) {
                    this.field447 = true;
                    this.method280(-44090, -1200);
                }
                if (var4 == 4) {
                    this.field447 = false;
                }
            }
            if (var3 == 5) {
                this.field439 = var4;
            }
            if (var3 == 6) {
                this.field329 = var4;
            }
            if (var3 == 8) {
                this.field584 = var4;
                this.field226 = true;
            }
            if (var3 == 9) {
                this.field229 = var4;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILFMDWWBSX;)V")
    public final void method156(int arg0, class15 arg1) {
        int var3 = arg1.field805;
        if (arg0 < 2 || arg0 > 2) {
            this.field223 = -291;
        }
        if ((var3 < 1 || var3 > 100) && (var3 < 701 || var3 > 800)) {
            if ((var3 < 101 || var3 > 200) && (var3 < 801 || var3 > 900)) {
                if (var3 == 203) {
                    int var6 = this.field493;
                    if (this.field494 != 2) {
                        var6 = 0;
                    }
                    arg1.field791 = var6 * 15 + 20;
                    if (arg1.field791 <= arg1.field776) {
                        arg1.field791 = arg1.field776 + 1;
                    }
                } else if (var3 >= 401 && var3 <= 500) {
                    var3 -= 401;
                    if (var3 == 0 && this.field494 == 0) {
                        arg1.field764 = "Loading ignore list";
                        arg1.field816 = 0;
                    } else if (var3 == 1 && this.field494 == 0) {
                        arg1.field764 = "Please wait...";
                        arg1.field816 = 0;
                    } else {
                        int var7 = this.field498;
                        if (this.field494 == 0) {
                            var7 = 0;
                        }
                        if (var3 >= var7) {
                            arg1.field764 = "";
                            arg1.field816 = 0;
                        } else {
                            arg1.field764 = class29.method327(class29.method324(true, this.field269[var3]), (byte) 58);
                            arg1.field816 = 1;
                        }
                    }
                } else if (var3 == 503) {
                    arg1.field791 = this.field498 * 15 + 20;
                    if (arg1.field791 <= arg1.field776) {
                        arg1.field791 = arg1.field776 + 1;
                    }
                } else if (var3 == 327) {
                    arg1.field803 = 150;
                    arg1.field804 = (int) (Math.sin((double) field564 / 40.0D) * 256.0D) & 2047;
                    if (this.field606) {
                        for (int var8 = 0; var8 < 7; ++var8) {
                            int var15 = this.field641[var8];
                            if (var15 >= 0 && !class39.field1112[var15].method365(-422)) {
                                return;
                            }
                        }
                        this.field606 = false;
                        class65[] var9 = new class65[7];
                        int var10 = 0;
                        for (int var11 = 0; var11 < 7; ++var11) {
                            int var14 = this.field641[var11];
                            if (var14 >= 0) {
                                var9[var10++] = class39.field1112[var14].method366((byte) 107);
                            }
                        }
                        class65 var12 = new class65(var9, 273, var10);
                        for (int var13 = 0; var13 < 5; ++var13) {
                            if (this.field500[var13] != 0) {
                                var12.method555(field615[var13][0], field615[var13][this.field500[var13]]);
                                if (var13 == 1) {
                                    var12.method555(field315[0], field315[this.field500[var13]]);
                                }
                            }
                        }
                        var12.method548((byte) 77);
                        var12.method549(true, class50.field1392[field623.field862].field1394[0]);
                        var12.method558(64, 850, -30, -50, -30, true);
                        arg1.field794 = 5;
                        arg1.field795 = 0;
                        class15.method307(2, var12, 0, 5);
                    }
                } else if (var3 == 324) {
                    if (this.field406 == null) {
                        this.field406 = arg1.field815;
                        this.field407 = arg1.field784;
                    }
                    if (this.field541) {
                        arg1.field815 = this.field407;
                    } else {
                        arg1.field815 = this.field406;
                    }
                } else if (var3 == 325) {
                    if (this.field406 == null) {
                        this.field406 = arg1.field815;
                        this.field407 = arg1.field784;
                    }
                    if (this.field541) {
                        arg1.field815 = this.field406;
                    } else {
                        arg1.field815 = this.field407;
                    }
                } else if (var3 == 600) {
                    arg1.field764 = this.field581;
                    if (field564 % 20 < 10) {
                        arg1.field764 = arg1.field764 + "|";
                    } else {
                        arg1.field764 = arg1.field764 + " ";
                    }
                } else {
                    if (var3 == 620) {
                        if (this.field267 >= 1) {
                            if (this.field322) {
                                arg1.field748 = 16711680;
                                arg1.field764 = "Moderator option: Mute player for 48 hours: <ON>";
                            } else {
                                arg1.field748 = 16777215;
                                arg1.field764 = "Moderator option: Mute player for 48 hours: <OFF>";
                            }
                        } else {
                            arg1.field764 = "";
                        }
                    }
                    if (var3 == 660) {
                        int var16 = this.field461 - this.field293;
                        String var17;
                        if (var16 <= 0) {
                            var17 = "earlier today";
                        } else if (var16 == 1) {
                            var17 = "yesterday";
                        } else {
                            var17 = var16 + " days ago";
                        }
                        arg1.field764 = "You last logged in @red@" + var17 + "@bla@ from: @red@" + signlink.dns;
                    }
                    if (var3 == 661) {
                        if (this.field610 == 0) {
                            arg1.field764 = "\\nYou have not yet set any recovery questions.\\nIt is @lre@strongly@yel@ recommended that you do so.\\n\\nIf you don't you will be @lre@unable to recover your\\n@lre@password@yel@ if you forget it, or it is stolen.";
                        } else if (this.field610 <= this.field461) {
                            arg1.field764 = "\\n\\nRecovery Questions Last Set:\\n@gre@" + this.method157(false, this.field610);
                        } else {
                            int var18 = this.field461 + 14 - this.field610;
                            String var19;
                            if (var18 <= 0) {
                                var19 = "Earlier today";
                            } else if (var18 == 1) {
                                var19 = "Yesterday";
                            } else {
                                var19 = var18 + " days ago";
                            }
                            arg1.field764 = var19 + " you requested@lre@ new recovery\\n@lre@questions.@yel@ The requested change will occur\\non: @lre@" + this.method157(false, this.field610) + "\\n\\nIf you do not remember making this request\\ncancel it immediately, and change your password.";
                        }
                    }
                    if (var3 == 662) {
                        String var20;
                        if (this.field608 == 0) {
                            var20 = "@yel@0 unread messages";
                        } else if (this.field608 == 1) {
                            var20 = "@gre@1 unread message";
                        } else {
                            var20 = "@gre@" + this.field608 + " unread messages";
                        }
                        arg1.field764 = "You have " + var20 + "\\nin your message centre.";
                    }
                    if (var3 == 663) {
                        if (this.field410 > 0 && this.field410 <= this.field461 + 10) {
                            arg1.field764 = "Last password change:\\n@gre@" + this.method157(false, this.field410);
                        } else {
                            arg1.field764 = "Last password change:\\n@gre@Never changed";
                        }
                    }
                    if (var3 == 665) {
                        if (this.field633 > 2 && !field373) {
                            arg1.field764 = "This is a non-members\\nworld. To enjoy your\\nmembers benefits we\\nrecommend you play on a\\nmembers world instead.";
                        } else if (this.field633 > 2) {
                            arg1.field764 = "\\n\\nYou have @gre@" + this.field633 + "@yel@ days of\\nmember credit remaining.";
                        } else if (this.field633 > 0) {
                            arg1.field764 = "You have @gre@" + this.field633 + "@yel@ days of\\nmember credit remaining.\\n\\n@lre@Credit low! Renew now\\n@lre@to avoid losing members.";
                        } else {
                            arg1.field764 = "You are not a member.\\n\\nChoose to subscribe and\\nyou'll get loads of extra\\nbenefits and features.";
                        }
                    }
                    if (var3 == 667) {
                        if (this.field633 > 2 && !field373) {
                            arg1.field764 = "To switch to a members-only world:\\n1) Logout and return to the world selection page.\\n2) Choose one of the members world with a gold star next to it's name.\\n\\nIf you prefer you can continue to use this world,\\nbut members only features will be unavailable here.";
                        } else if (this.field633 > 0) {
                            arg1.field764 = "To extend or cancel a subscription:\\n1) Logout and return to the frontpage of this website.\\n2)Choose the relevant option from the 'membership' section.\\n\\nNote: If you are a credit card subscriber a top-up payment will\\nautomatically be taken when 3 days credit remain.\\n(unless you cancel your subscription, which can be done at any time.)";
                        } else {
                            arg1.field764 = "To start a subscripton:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Start a new subscription'";
                        }
                    }
                    if (var3 == 668) {
                        if (this.field610 > this.field461) {
                            arg1.field764 = "To cancel this request:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Cancel recovery questions'.";
                        } else {
                            arg1.field764 = "To change your recovery questions:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Set new recovery questions'.";
                        }
                    }
                }
            } else {
                int var5 = this.field493;
                if (this.field494 != 2) {
                    var5 = 0;
                }
                if (var3 > 800) {
                    var3 -= 701;
                } else {
                    var3 -= 101;
                }
                if (var3 >= var5) {
                    arg1.field764 = "";
                    arg1.field816 = 0;
                } else {
                    if (this.field268[var3] == 0) {
                        arg1.field764 = "@red@Offline";
                    } else if (this.field268[var3] < 200) {
                        if (this.field268[var3] == field371) {
                            arg1.field764 = "@gre@World" + (this.field268[var3] - 9);
                        } else {
                            arg1.field764 = "@yel@World" + (this.field268[var3] - 9);
                        }
                    } else if (this.field268[var3] == field371) {
                        arg1.field764 = "@gre@Classic" + (this.field268[var3] - 219);
                    } else {
                        arg1.field764 = "@yel@Classic" + (this.field268[var3] - 219);
                    }
                    arg1.field816 = 1;
                }
            }
        } else if (var3 == 1 && this.field494 == 0) {
            arg1.field764 = "Loading friend list";
            arg1.field816 = 0;
        } else if (var3 == 1 && this.field494 == 1) {
            arg1.field764 = "Connecting to friendserver";
            arg1.field816 = 0;
        } else if (var3 == 2 && this.field494 != 2) {
            arg1.field764 = "Please wait...";
            arg1.field816 = 0;
        } else {
            int var4 = this.field493;
            if (this.field494 != 2) {
                var4 = 0;
            }
            if (var3 > 700) {
                var3 -= 601;
            } else {
                --var3;
            }
            if (var3 >= var4) {
                arg1.field764 = "";
                arg1.field816 = 0;
            } else {
                arg1.field764 = this.field204[var3];
                arg1.field816 = 1;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(ZI)Ljava/lang/String;")
    public final String method157(boolean arg0, int arg1) {
        if (arg1 > this.field461 + 10) {
            return "Unknown";
        } else {
            long var3 = ((long) arg1 + 11745L) * 86400000L;
            Calendar var5 = Calendar.getInstance();
            var5.setTime(new Date(var3));
            int var6 = var5.get(5);
            int var7 = var5.get(2);
            int var8 = var5.get(1);
            if (arg0) {
                this.field223 = this.field485.method534();
            }
            String[] var9 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
            return var6 + "-" + var9[var7] + "-" + var8;
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(I)Ljava/lang/String;")
    public final String method158(int arg0) {
        if (arg0 >= 7 && arg0 <= 7) {
            if (signlink.mainapp != null) {
                return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
            } else {
                return super.field1436 != null ? "runescape.com" : super.getDocumentBase().getHost().toLowerCase();
            }
        } else {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
    public final void method159(int arg0) {
        this.field529 = 0;
        int var2 = (field623.field884 >> 7) + this.field377;
        int var3 = (field623.field885 >> 7) + this.field378;
        if (arg0 == 0) {
            if (var2 >= 3053 && var2 <= 3156 && var3 >= 3056 && var3 <= 3136) {
                this.field529 = 1;
            }
            if (var2 >= 3072 && var2 <= 3118 && var3 >= 9492 && var3 <= 9535) {
                this.field529 = 1;
            }
            if (this.field529 == 1 && var2 >= 3139 && var2 <= 3199 && var3 >= 3008 && var3 <= 3062) {
                this.field529 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
    public final void method160(byte arg0) {
        if (this.field261 != arg0) {
            this.field233 = this.field404.method54();
        }
        if (field374 && this.field256 == 2 && class46.field1296 != this.field272) {
            this.method230(true, (String) null, "Loading - please wait.");
            this.field256 = 1;
            this.field563 = System.currentTimeMillis();
        }
        if (this.field256 == 1) {
            int var2 = this.method161(0);
            if (var2 != 0 && System.currentTimeMillis() - this.field563 > 360000L) {
                signlink.reporterror(this.field416 + " glcfb " + this.field497 + "," + var2 + "," + field374 + "," + this.field636[0] + "," + this.field580.method116() + "," + this.field272 + "," + this.field214 + "," + this.field215);
                this.field563 = System.currentTimeMillis();
            }
        }
        if (this.field256 == 2 && this.field654 != this.field272) {
            this.field654 = this.field272;
            this.method278(this.field272, (byte) 2);
        }
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)I")
    public final int method161(int arg0) {
        for (int var2 = 0; var2 < this.field398.length; ++var2) {
            if (this.field398[var2] == null && this.field619[var2] != -1) {
                return -1;
            }
            if (this.field342[var2] == null && this.field620[var2] != -1) {
                return -2;
            }
        }
        boolean var3 = true;
        for (int var4 = 0; var4 < this.field398.length; ++var4) {
            byte[] var5 = this.field342[var4];
            if (var5 != null) {
                int var6 = (this.field618[var4] >> 8) * 64 - this.field377;
                int var7 = (this.field618[var4] & 255) * 64 - this.field378;
                if (this.field172) {
                    var6 = 10;
                    var7 = 10;
                }
                var3 &= class46.method466(false, var7, var5, var6);
            }
        }
        if (!var3) {
            return -3;
        } else if (this.field411) {
            return -4;
        } else {
            this.field256 = 2;
            class46.field1296 = this.field272;
            this.method173(true);
            this.field232 += arg0;
            this.field483.method43(0, 178);
            return 0;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
    public final void method162() {
        this.method169("Starting up", 20, (byte) 108);
        if (signlink.sunjava) {
            super.field1427 = 5;
        }
        if (field249) {
            this.field621 = true;
        } else {
            field249 = true;
            boolean var1 = false;
            String var2 = this.method158(7);
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
                this.field453 = true;
            } else {
                if (signlink.cache_dat != null) {
                    for (int var3 = 0; var3 < 5; ++var3) {
                        this.field636[var3] = new class61(signlink.cache_idx[var3], var3 + 1, 500000, 9, signlink.cache_dat);
                    }
                }
                try {
                    this.method223(964);
                    this.field540 = this.method242(true, "title screen", 1, 25, "title", this.field311[1]);
                    this.field324 = new class5("p11_full", false, 2, this.field540);
                    this.field325 = new class5("p12_full", false, 2, this.field540);
                    this.field326 = new class5("b12_full", false, 2, this.field540);
                    this.field327 = new class5("q8_full", true, 2, this.field540);
                    this.method232(20060);
                    this.method195(187);
                    class59 var4 = this.method242(true, "config", 2, 30, "config", this.field311[2]);
                    class59 var5 = this.method242(true, "interface", 3, 35, "interface", this.field311[3]);
                    class59 var6 = this.method242(true, "2d graphics", 4, 40, "media", this.field311[4]);
                    class59 var7 = this.method242(true, "textures", 6, 45, "textures", this.field311[6]);
                    class59 var8 = this.method242(true, "chat system", 7, 50, "wordenc", this.field311[7]);
                    class59 var9 = this.method242(true, "sound effects", 8, 55, "sounds", this.field311[8]);
                    this.field508 = new byte[4][104][104];
                    this.field225 = new int[4][105][105];
                    this.field306 = new class41(104, false, 4, 104, this.field225);
                    for (int var10 = 0; var10 < 4; ++var10) {
                        this.field217[var10] = new class47((byte) 3, 104, 104);
                    }
                    this.field424 = new class36(512, 512);
                    class59 var11 = this.method242(true, "update list", 5, 60, "versionlist", this.field311[5]);
                    this.method169("Connecting to update server", 60, (byte) 108);
                    this.field580 = new class7();
                    this.field580.method130(var11, this);
                    class6.method111(this.field580.method135(-261));
                    class65.method538(this.field580.method122(0, 0), this.field580);
                    if (!field374) {
                        this.field297 = 0;
                        this.field298 = true;
                        this.field580.method118(2, this.field297);
                        while (this.field580.method116() > 0) {
                            this.method193(5);
                            try {
                                Thread.sleep(100L);
                            } catch (Exception var71) {
                            }
                            if (this.field580.field137 > 3) {
                                this.method275("ondemand");
                                return;
                            }
                        }
                    }
                    this.method169("Requesting animations", 65, (byte) 108);
                    int var12 = this.field580.method122(1, 0);
                    for (int var13 = 0; var13 < var12; ++var13) {
                        this.field580.method118(1, var13);
                    }
                    while (this.field580.method116() > 0) {
                        int var14 = var12 - this.field580.method116();
                        if (var14 > 0) {
                            this.method169("Loading animations - " + var14 * 100 / var12 + "%", 65, (byte) 108);
                        }
                        this.method193(5);
                        try {
                            Thread.sleep(100L);
                        } catch (Exception var70) {
                        }
                        if (this.field580.field137 > 3) {
                            this.method275("ondemand");
                            return;
                        }
                    }
                    this.method169("Requesting models", 70, (byte) 108);
                    int var15 = this.field580.method122(0, 0);
                    for (int var16 = 0; var16 < var15; ++var16) {
                        int var17 = this.field580.method121(0, var16);
                        if ((var17 & 1) != 0) {
                            this.field580.method118(0, var16);
                        }
                    }
                    int var18 = this.field580.method116();
                    while (this.field580.method116() > 0) {
                        int var19 = var18 - this.field580.method116();
                        if (var19 > 0) {
                            this.method169("Loading models - " + var19 * 100 / var18 + "%", 70, (byte) 108);
                        }
                        this.method193(5);
                        try {
                            Thread.sleep(100L);
                        } catch (Exception var69) {
                        }
                    }
                    if (this.field636[0] != null) {
                        this.method169("Requesting maps", 75, (byte) 108);
                        this.field580.method118(3, this.field580.method129(47, 0, false, 48));
                        this.field580.method118(3, this.field580.method129(47, 1, false, 48));
                        this.field580.method118(3, this.field580.method129(48, 0, false, 48));
                        this.field580.method118(3, this.field580.method129(48, 1, false, 48));
                        this.field580.method118(3, this.field580.method129(49, 0, false, 48));
                        this.field580.method118(3, this.field580.method129(49, 1, false, 48));
                        this.field580.method118(3, this.field580.method129(47, 0, false, 47));
                        this.field580.method118(3, this.field580.method129(47, 1, false, 47));
                        this.field580.method118(3, this.field580.method129(48, 0, false, 47));
                        this.field580.method118(3, this.field580.method129(48, 1, false, 47));
                        this.field580.method118(3, this.field580.method129(48, 0, false, 148));
                        this.field580.method118(3, this.field580.method129(48, 1, false, 148));
                        int var20 = this.field580.method116();
                        while (this.field580.method116() > 0) {
                            int var21 = var20 - this.field580.method116();
                            if (var21 > 0) {
                                this.method169("Loading maps - " + var21 * 100 / var20 + "%", 75, (byte) 108);
                            }
                            this.method193(5);
                            try {
                                Thread.sleep(100L);
                            } catch (Exception var68) {
                            }
                        }
                    }
                    int var22 = this.field580.method122(0, 0);
                    for (int var23 = 0; var23 < var22; ++var23) {
                        int var24 = this.field580.method121(0, var23);
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
                            this.field580.method136(0, -6015, var23, var25);
                        }
                    }
                    this.field580.method123((byte) 53, field373);
                    if (!field374) {
                        int var26 = this.field580.method122(2, 0);
                        for (int var27 = 1; var27 < var26; ++var27) {
                            if (this.field580.method117(var27, 4)) {
                                this.field580.method136(2, -6015, var27, (byte) 1);
                            }
                        }
                    }
                    this.method169("Unpacking media", 80, (byte) 108);
                    this.field399 = new class44(var6, "invback", 0);
                    this.field401 = new class44(var6, "chatback", 0);
                    this.field400 = new class44(var6, "mapback", 0);
                    this.field611 = new class44(var6, "backbase1", 0);
                    this.field612 = new class44(var6, "backbase2", 0);
                    this.field613 = new class44(var6, "backhmid1", 0);
                    for (int var28 = 0; var28 < 13; ++var28) {
                        this.field528[var28] = new class44(var6, "sideicons", var28);
                    }
                    this.field593 = new class36(var6, "compass", 0);
                    this.field388 = new class36(var6, "mapedge", 0);
                    this.field388.method350(-31455);
                    for (int var29 = 0; var29 < 72; ++var29) {
                        this.field585[var29] = new class44(var6, "mapscene", var29);
                    }
                    for (int var30 = 0; var30 < 70; ++var30) {
                        this.field629[var30] = new class36(var6, "mapfunction", var30);
                    }
                    for (int var31 = 0; var31 < 5; ++var31) {
                        this.field643[var31] = new class36(var6, "hitmarks", var31);
                    }
                    for (int var32 = 0; var32 < 6; ++var32) {
                        this.field415[var32] = new class36(var6, "headicons_pk", var32);
                    }
                    for (int var33 = 0; var33 < 9; ++var33) {
                        this.field543[var33] = new class36(var6, "headicons_prayer", var33);
                    }
                    for (int var34 = 0; var34 < 6; ++var34) {
                        this.field656[var34] = new class36(var6, "headicons_hint", var34);
                    }
                    this.field291 = new class36(var6, "overlay_multiway", 0);
                    this.field644 = new class36(var6, "mapmarker", 0);
                    this.field645 = new class36(var6, "mapmarker", 1);
                    for (int var35 = 0; var35 < 8; ++var35) {
                        this.field248[var35] = new class36(var6, "cross", var35);
                    }
                    this.field317 = new class36(var6, "mapdots", 0);
                    this.field318 = new class36(var6, "mapdots", 1);
                    this.field319 = new class36(var6, "mapdots", 2);
                    this.field320 = new class36(var6, "mapdots", 3);
                    this.field321 = new class36(var6, "mapdots", 4);
                    this.field626 = new class44(var6, "scrollbar", 0);
                    this.field627 = new class44(var6, "scrollbar", 1);
                    this.field240 = new class44(var6, "redstone1", 0);
                    this.field241 = new class44(var6, "redstone2", 0);
                    this.field242 = new class44(var6, "redstone3", 0);
                    this.field243 = new class44(var6, "redstone1", 0);
                    this.field243.method443(842);
                    this.field244 = new class44(var6, "redstone2", 0);
                    this.field244.method443(842);
                    this.field567 = new class44(var6, "redstone1", 0);
                    this.field567.method444((byte) -90);
                    this.field568 = new class44(var6, "redstone2", 0);
                    this.field568.method444((byte) -90);
                    this.field569 = new class44(var6, "redstone3", 0);
                    this.field569.method444((byte) -90);
                    this.field570 = new class44(var6, "redstone1", 0);
                    this.field570.method443(842);
                    this.field570.method444((byte) -90);
                    this.field571 = new class44(var6, "redstone2", 0);
                    this.field571.method443(842);
                    this.field571.method444((byte) -90);
                    for (int var36 = 0; var36 < 2; ++var36) {
                        this.field183[var36] = new class44(var6, "mod_icons", var36);
                    }
                    class36 var37 = new class36(var6, "backleft1", 0);
                    this.field510 = new class71(field260, this.method271(-319), var37.field1077, var37.field1078);
                    var37.method351(0, 298, 0);
                    class36 var38 = new class36(var6, "backleft2", 0);
                    this.field511 = new class71(field260, this.method271(-319), var38.field1077, var38.field1078);
                    var38.method351(0, 298, 0);
                    class36 var39 = new class36(var6, "backright1", 0);
                    this.field512 = new class71(field260, this.method271(-319), var39.field1077, var39.field1078);
                    var39.method351(0, 298, 0);
                    class36 var40 = new class36(var6, "backright2", 0);
                    this.field513 = new class71(field260, this.method271(-319), var40.field1077, var40.field1078);
                    var40.method351(0, 298, 0);
                    class36 var41 = new class36(var6, "backtop1", 0);
                    this.field514 = new class71(field260, this.method271(-319), var41.field1077, var41.field1078);
                    var41.method351(0, 298, 0);
                    class36 var42 = new class36(var6, "backvmid1", 0);
                    this.field515 = new class71(field260, this.method271(-319), var42.field1077, var42.field1078);
                    var42.method351(0, 298, 0);
                    class36 var43 = new class36(var6, "backvmid2", 0);
                    this.field516 = new class71(field260, this.method271(-319), var43.field1077, var43.field1078);
                    var43.method351(0, 298, 0);
                    class36 var44 = new class36(var6, "backvmid3", 0);
                    this.field517 = new class71(field260, this.method271(-319), var44.field1077, var44.field1078);
                    var44.method351(0, 298, 0);
                    class36 var45 = new class36(var6, "backhmid2", 0);
                    this.field518 = new class71(field260, this.method271(-319), var45.field1077, var45.field1078);
                    var45.method351(0, 298, 0);
                    int var46 = (int) (Math.random() * 21.0D) - 10;
                    int var47 = (int) (Math.random() * 21.0D) - 10;
                    int var48 = (int) (Math.random() * 21.0D) - 10;
                    int var49 = (int) (Math.random() * 41.0D) - 20;
                    for (int var50 = 0; var50 < 100; ++var50) {
                        if (this.field629[var50] != null) {
                            this.field629[var50].method349(var46 + var49, var47 + var49, 289, var48 + var49);
                        }
                        if (this.field585[var50] != null) {
                            this.field585[var50].method445(var46 + var49, var47 + var49, 289, var48 + var49);
                        }
                    }
                    this.method169("Unpacking textures", 83, (byte) 108);
                    class42.method429(var7, 1001);
                    class42.method433(0.8D, false);
                    class42.method428(20, (byte) 14);
                    this.method169("Unpacking config", 86, (byte) 108);
                    class50.method506(true, var4);
                    class68.method577(var4);
                    class19.method311(true, var4);
                    class45.method458(var4);
                    class49.method503(var4);
                    class39.method363(true, var4);
                    class9.method297(true, var4);
                    class37.method361(true, var4);
                    class56.method519(true, var4);
                    class45.field1294 = field373;
                    if (!field374) {
                        this.method169("Unpacking sounds", 90, (byte) 108);
                        byte[] var51 = var9.method526("sounds.dat", (byte[]) null);
                        class3 var52 = new class3(var51, -990);
                        class34.method338(true, var52);
                    }
                    this.method169("Unpacking interfaces", 95, (byte) 108);
                    class5[] var53 = new class5[] { this.field324, this.field325, this.field326, this.field327 };
                    class15.method301(var5, 6, var53, var6);
                    this.method169("Preparing game engine", 100, (byte) 108);
                    for (int var54 = 0; var54 < 33; ++var54) {
                        int var55 = 999;
                        int var56 = 0;
                        for (int var57 = 0; var57 < 34; ++var57) {
                            if (this.field400.field1233[this.field400.field1235 * var54 + var57] == 0) {
                                if (var55 == 999) {
                                    var55 = var57;
                                }
                            } else if (var55 != 999) {
                                var56 = var57;
                                break;
                            }
                        }
                        this.field279[var54] = var55;
                        this.field301[var54] = var56 - var55;
                    }
                    for (int var58 = 5; var58 < 156; ++var58) {
                        int var59 = 999;
                        int var60 = 0;
                        for (int var61 = 25; var61 < 172; ++var61) {
                            if (this.field400.field1233[this.field400.field1235 * var58 + var61] == 0 && (var61 > 34 || var58 > 34)) {
                                if (var59 == 999) {
                                    var59 = var61;
                                }
                            } else if (var59 != 999) {
                                var60 = var61;
                                break;
                            }
                        }
                        this.field435[var58 - 5] = var59 - 25;
                        this.field188[var58 - 5] = var60 - var59;
                    }
                    class42.method426(765, false, 503);
                    this.field490 = class42.field1212;
                    class42.method426(479, false, 96);
                    this.field487 = class42.field1212;
                    class42.method426(190, false, 261);
                    this.field488 = class42.field1212;
                    class42.method426(512, false, 334);
                    this.field489 = class42.field1212;
                    int[] var62 = new int[9];
                    for (int var63 = 0; var63 < 9; ++var63) {
                        int var64 = var63 * 32 + 128 + 15;
                        int var65 = var64 * 3 + 600;
                        int var66 = class42.field1210[var64];
                        var62[var63] = var65 * var66 >> 16;
                    }
                    class41.method409(var62, 334, 9, 500, 800, 512);
                    class1.method1(var8);
                    this.field530 = new class70(0, this);
                    this.method180(this.field530, 10);
                    class62.field1572 = this;
                    class68.field1705 = this;
                    class49.field1360 = this;
                } catch (Exception var72) {
                    signlink.reporterror("loaderror " + this.field389 + " " + this.field509);
                    this.field231 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(JI)V")
    public final void method163(long arg0, int arg1) {
        if (arg0 != 0L) {
            if (this.field493 >= 100 && this.field299 != 1) {
                this.method192("", "Your friendlist is full. Max of 100 for free users, and 200 for members", 0, this.field369);
            } else if (this.field493 >= 200) {
                this.method192("", "Your friendlist is full. Max of 100 for free users, and 200 for members", 0, this.field369);
            } else {
                String var4 = class29.method327(class29.method324(true, arg0), (byte) 58);
                for (int var5 = 0; var5 < this.field493; ++var5) {
                    if (this.field189[var5] == arg0) {
                        this.method192("", var4 + " is already on your friend list", 0, this.field369);
                        return;
                    }
                }
                for (int var6 = 0; var6 < this.field498; ++var6) {
                    if (this.field269[var6] == arg0) {
                        this.method192("", "Please remove " + var4 + " from your ignore list first", 0, this.field369);
                        return;
                    }
                }
                if (!var4.equals(field623.field953)) {
                    this.field204[this.field493] = var4;
                    if (arg1 >= 0) {
                        this.field292 = !this.field292;
                    }
                    this.field189[this.field493] = arg0;
                    this.field268[this.field493] = 0;
                    ++this.field493;
                    this.field501 = true;
                    this.field483.method43(0, 23);
                    this.field483.method50(this.field642, arg0);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
    public final void method164(int arg0) {
        if (arg0 == 45678) {
            for (class25 var2 = (class25) this.field219.method598(); var2 != null; var2 = (class25) this.field219.method600(4)) {
                if (this.field272 == var2.field967 && !var2.field966) {
                    if (field564 >= var2.field972) {
                        var2.method322(-144, this.field628);
                        if (var2.field966) {
                            var2.method329();
                        } else {
                            this.field306.method384(0, var2.field967, var2.field969, 60, var2.field970, var2, -1, false, (byte) 3, var2.field968);
                        }
                    }
                } else {
                    var2.method329();
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(Z)V")
    public final void method165(boolean arg0) {
        if (super.field1434 == null) {
            this.method235((byte) 1);
            if (!arg0) {
                this.field205 = null;
                this.field206 = null;
                this.field207 = null;
                this.field208 = null;
                this.field209 = null;
                this.field210 = null;
                this.field211 = null;
                this.field212 = null;
                this.field213 = null;
                this.field355 = null;
                this.field353 = null;
                this.field352 = null;
                this.field354 = null;
                this.field262 = null;
                this.field263 = null;
                this.field264 = null;
                super.field1434 = new class71(field260, this.method271(-319), 765, 503);
                this.field596 = true;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
    public static final void method166(int arg0) {
        class41.field1135 = false;
        class42.field1201 = false;
        field374 = false;
        class46.field1295 = false;
        class68.field1693 = false;
        if (arg0 != 6) {
            for (int var1 = 1; var1 > 0; ++var1) {
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(Z)V")
    public final void method167(boolean arg0) {
        if (this.field238 > 1) {
            --this.field238;
        }
        if (this.field236 > 0) {
            --this.field236;
        }
        for (int var2 = 0; var2 < 5 && this.method153(-38717); ++var2) {
        }
        if (this.field250) {
            Object var3 = this.field530.field1756;
            synchronized (this.field530.field1756) {
                if (!field414) {
                    this.field530.field1751 = 0;
                } else if (super.field1447 != 0 || this.field530.field1751 >= 40) {
                    this.field483.method43(0, 158);
                    this.field483.method44(0);
                    int var4 = this.field483.field50;
                    int var5 = 0;
                    for (int var6 = 0; var6 < this.field530.field1751 && var4 - this.field483.field50 < 240; ++var6) {
                        ++var5;
                        int var7 = this.field530.field1754[var6];
                        if (var7 < 0) {
                            var7 = 0;
                        } else if (var7 > 502) {
                            var7 = 502;
                        }
                        int var8 = this.field530.field1752[var6];
                        if (var8 < 0) {
                            var8 = 0;
                        } else if (var8 > 764) {
                            var8 = 764;
                        }
                        int var9 = var7 * 765 + var8;
                        if (this.field530.field1754[var6] == -1 && this.field530.field1752[var6] == -1) {
                            var8 = -1;
                            var7 = -1;
                            var9 = 524287;
                        }
                        if (this.field252 == var8 && this.field253 == var7) {
                            if (this.field477 < 2047) {
                                ++this.field477;
                            }
                        } else {
                            int var10 = var8 - this.field252;
                            this.field252 = var8;
                            int var11 = var7 - this.field253;
                            this.field253 = var7;
                            if (this.field477 < 8 && var10 >= -32 && var10 <= 31 && var11 >= -32 && var11 <= 31) {
                                var10 += 32;
                                var11 += 32;
                                this.field483.method45((this.field477 << 12) + (var10 << 6) + var11);
                                this.field477 = 0;
                            } else if (this.field477 < 8) {
                                this.field483.method47((this.field477 << 19) + 8388608 + var9);
                                this.field477 = 0;
                            } else {
                                this.field483.method48((this.field477 << 19) + -1073741824 + var9);
                                this.field477 = 0;
                            }
                        }
                    }
                    this.field483.method53(this.field483.field50 - var4, false);
                    if (var5 >= this.field530.field1751) {
                        this.field530.field1751 = 0;
                    } else {
                        this.field530.field1751 -= var5;
                        for (int var12 = 0; var12 < this.field530.field1751; ++var12) {
                            this.field530.field1752[var12] = this.field530.field1752[var5 + var12];
                            this.field530.field1754[var12] = this.field530.field1754[var5 + var12];
                        }
                    }
                }
            }
            if (super.field1447 != 0) {
                long var13 = (super.field1450 - this.field383) / 50L;
                if (var13 > 4095L) {
                    var13 = 4095L;
                }
                this.field383 = super.field1450;
                int var15 = super.field1449;
                if (var15 < 0) {
                    var15 = 0;
                } else if (var15 > 502) {
                    var15 = 502;
                }
                int var16 = super.field1448;
                if (var16 < 0) {
                    var16 = 0;
                } else if (var16 > 764) {
                    var16 = 764;
                }
                int var17 = var15 * 765 + var16;
                byte var18 = 0;
                if (super.field1447 == 2) {
                    var18 = 1;
                }
                int var19 = (int) var13;
                this.field483.method43(0, 126);
                this.field483.method48((var18 << 19) + (var19 << 20) + var17);
            }
            if (this.field386 > 0) {
                --this.field386;
            }
            if (super.field1451[1] == 1 || super.field1451[2] == 1 || super.field1451[3] == 1 || super.field1451[4] == 1) {
                this.field387 = true;
            }
            if (this.field387 && this.field386 <= 0) {
                this.field386 = 20;
                this.field387 = false;
                this.field483.method43(0, 165);
                this.field483.method45(this.field468);
                this.field483.method79(true, this.field469);
            }
            if (super.field1438 && !this.field561) {
                this.field561 = true;
                this.field483.method43(0, 207);
                this.field483.method44(1);
            }
            if (!super.field1438 && this.field561) {
                this.field561 = false;
                this.field483.method43(0, 207);
                this.field483.method44(0);
            }
            this.method160(this.field478);
            this.method289(413);
            this.method174(-95);
            ++field397;
            if (field397 > 87) {
                field397 = 0;
                this.field483.method43(0, 1);
            }
            ++this.field234;
            if (this.field234 > 750) {
                this.method154(false);
            }
            this.method191(8);
            this.method262(15168);
            this.method237((byte) 8);
            ++field368;
            if (field368 > 75) {
                field368 = 0;
                this.field483.method43(0, 22);
            }
            ++this.field628;
            if (arg0) {
                this.field527 = !this.field527;
            }
            if (this.field552 != 0) {
                this.field551 += 20;
                if (this.field551 >= 400) {
                    this.field552 = 0;
                }
            }
            if (this.field526 != 0) {
                ++this.field523;
                if (this.field523 >= 15) {
                    if (this.field526 == 2) {
                        this.field501 = true;
                    }
                    if (this.field526 == 3) {
                        this.field226 = true;
                    }
                    this.field526 = 0;
                }
            }
            if (this.field393 != 0) {
                ++this.field246;
                if (super.field1441 > this.field394 + 5 || super.field1441 < this.field394 - 5 || super.field1442 > this.field395 + 5 || super.field1442 < this.field395 - 5) {
                    this.field345 = true;
                }
                if (super.field1440 == 0) {
                    if (this.field393 == 2) {
                        this.field501 = true;
                    }
                    if (this.field393 == 3) {
                        this.field226 = true;
                    }
                    this.field393 = 0;
                    if (this.field345 && this.field246 >= 5) {
                        this.field458 = -1;
                        this.method240(13173);
                        if (this.field458 == this.field391 && this.field457 != this.field392) {
                            class15 var20 = class15.method306(this.field391);
                            byte var21 = 0;
                            if (this.field229 == 1 && var20.field805 == 206) {
                                var21 = 1;
                            }
                            if (var20.field747[this.field457] <= 0) {
                                var21 = 0;
                            }
                            if (var20.field751) {
                                int var22 = this.field392;
                                int var23 = this.field457;
                                var20.field747[var23] = var20.field747[var22];
                                var20.field790[var23] = var20.field790[var22];
                                var20.field747[var22] = -1;
                                var20.field790[var22] = 0;
                            } else if (var21 == 1) {
                                int var24 = this.field392;
                                int var25 = this.field457;
                                while (var24 != var25) {
                                    if (var24 > var25) {
                                        var20.method302(var24, var24 - 1, 0);
                                        --var24;
                                    } else if (var24 < var25) {
                                        var20.method302(var24, var24 + 1, 0);
                                        ++var24;
                                    }
                                }
                            } else {
                                var20.method302(this.field392, this.field457, 0);
                            }
                            this.field483.method43(0, 217);
                            this.field483.method71(var21, (byte) 8);
                            this.field483.method79(true, this.field391);
                            this.field483.method79(true, this.field392);
                            this.field483.method79(true, this.field457);
                        }
                    } else if ((this.field439 == 1 || this.method206(1, this.field344 - 1)) && this.field344 > 2) {
                        this.method176(0);
                    } else if (this.field344 > 0) {
                        this.method248((byte) -47, this.field344 - 1);
                    }
                    this.field523 = 10;
                    super.field1447 = 0;
                }
            }
            ++field574;
            if (field574 > 1083) {
                field574 = 0;
                this.field483.method43(0, 44);
                this.field483.method44(0);
                int var26 = this.field483.field50;
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field483.method44(197);
                }
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field483.method44(248);
                }
                this.field483.method45((int) (Math.random() * 65536.0D));
                this.field483.method44(169);
                this.field483.method44((int) (Math.random() * 256.0D));
                this.field483.method45((int) (Math.random() * 65536.0D));
                this.field483.method44(192);
                this.field483.method44(124);
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field483.method44(81);
                }
                this.field483.method45((int) (Math.random() * 65536.0D));
                this.field483.method53(this.field483.field50 - var26, false);
            }
            if (class41.field1169 != -1) {
                int var27 = class41.field1169;
                int var28 = class41.field1170;
                boolean var29 = this.method217(0, 0, var28, true, (byte) 6, 0, var27, 0, field623.field905[0], field623.field906[0], 0, 0);
                class41.field1169 = -1;
                if (var29) {
                    this.field549 = super.field1448;
                    this.field550 = super.field1449;
                    this.field552 = 1;
                    this.field551 = 0;
                }
            }
            if (super.field1447 == 1 && this.field625 != null) {
                this.field625 = null;
                this.field226 = true;
                super.field1447 = 0;
            }
            this.method243(0);
            if (this.field356 == -1) {
                this.method294((byte) -9);
                this.method226((byte) 98);
                this.method182(-97);
            }
            if (super.field1440 == 1 || super.field1447 == 1) {
                ++this.field582;
            }
            if (this.field174 == 0 && this.field228 == 0 && this.field276 == 0) {
                if (this.field274 > 0) {
                    --this.field274;
                }
            } else if (this.field274 < 100) {
                ++this.field274;
                if (this.field274 == 100) {
                    if (this.field174 != 0) {
                        this.field226 = true;
                    }
                    if (this.field228 != 0) {
                        this.field501 = true;
                    }
                }
            }
            if (this.field256 == 2) {
                this.method256(false);
            }
            if (this.field256 == 2 && this.field185) {
                this.method295((byte) -18);
            }
            for (int var30 = 0; var30 < 5; ++var30) {
                int var10002 = this.field474[var30]++;
            }
            this.method233((byte) -69);
            ++super.field1439;
            if (super.field1439 > 4500) {
                this.field236 = 250;
                super.field1439 -= 500;
                this.field483.method43(0, 82);
            }
            ++this.field456;
            if (this.field456 > 500) {
                this.field456 = 0;
                int var31 = (int) (Math.random() * 8.0D);
                if ((var31 & 1) == 1) {
                    this.field202 += this.field203;
                }
                if ((var31 & 2) == 2) {
                    this.field265 += this.field266;
                }
                if ((var31 & 4) == 4) {
                    this.field597 += this.field598;
                }
            }
            if (this.field202 < -50) {
                this.field203 = 2;
            }
            if (this.field202 > 50) {
                this.field203 = -2;
            }
            if (this.field265 < -55) {
                this.field266 = 2;
            }
            if (this.field265 > 55) {
                this.field266 = -2;
            }
            if (this.field597 < -40) {
                this.field598 = 1;
            }
            if (this.field597 > 40) {
                this.field598 = -1;
            }
            ++this.field595;
            if (this.field595 > 500) {
                this.field595 = 0;
                int var32 = (int) (Math.random() * 8.0D);
                if ((var32 & 1) == 1) {
                    this.field466 += this.field467;
                }
                if ((var32 & 2) == 2) {
                    this.field565 += this.field566;
                }
            }
            if (this.field466 < -60) {
                this.field467 = 2;
            }
            if (this.field466 > 60) {
                this.field467 = -2;
            }
            if (this.field565 < -20) {
                this.field566 = 1;
            }
            if (this.field565 > 10) {
                this.field566 = -1;
            }
            ++this.field235;
            if (this.field235 > 50) {
                this.field483.method43(0, 54);
            }
            try {
                if (this.field247 != null && this.field483.field50 > 0) {
                    this.field247.method590(this.field483.field50, this.field483.field49, 0, 0);
                    this.field483.field50 = 0;
                    this.field235 = 0;
                }
            } catch (IOException var34) {
                this.method154(false);
            } catch (Exception var35) {
                this.method229(0);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIIIIII)V")
    private final void method168(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg0 != -2633) {
            this.field233 = this.field404.method54();
        }
        class26 var11 = null;
        for (class26 var12 = (class26) this.field218.method598(); var12 != null; var12 = (class26) this.field218.method600(4)) {
            if (var12.field983 == arg8 && var12.field985 == arg7 && var12.field986 == arg2 && var12.field984 == arg3) {
                var11 = var12;
                break;
            }
        }
        if (var11 == null) {
            var11 = new class26();
            var11.field983 = arg8;
            var11.field984 = arg3;
            var11.field985 = arg7;
            var11.field986 = arg2;
            this.method293(var11, (byte) 3);
            this.field218.method595(var11);
        }
        var11.field987 = arg5;
        var11.field989 = arg9;
        var11.field988 = arg1;
        var11.field978 = arg4;
        var11.field982 = arg6;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;IB)V")
    public final void method169(String arg0, int arg1, byte arg2) {
        this.field509 = arg1;
        this.field389 = arg0;
        this.method254(false);
        if (this.field540 == null) {
            super.method169(arg0, arg1, (byte) 108);
        } else {
            this.field207.method592(-19705);
            short var4 = 360;
            short var5 = 200;
            byte var6 = 20;
            this.field326.method96(var5 / 2 - 26 - var6, (byte) 8, 16777215, "RuneScape is loading - please wait...", var4 / 2);
            int var7 = var5 / 2 - 18 - var6;
            if (arg2 != 108) {
                field260 = -20;
            }
            class8.method144(var7, 9179409, 264, var4 / 2 - 152, 34, 304);
            class8.method144(var7 + 1, 0, 264, var4 / 2 - 151, 32, 302);
            class8.method143(9179409, var4 / 2 - 150, var7 + 2, arg1 * 3, 30, false);
            class8.method143(0, arg1 * 3 + (var4 / 2 - 150), var7 + 2, 300 - arg1 * 3, 30, false);
            this.field326.method96(var5 / 2 + 5 - var6, (byte) 8, 16777215, arg0, var4 / 2);
            this.field207.method593(super.field1433, 202, false, 171);
            if (this.field596) {
                this.field596 = false;
                if (!this.field221) {
                    this.field208.method593(super.field1433, 0, false, 0);
                    this.field209.method593(super.field1433, 637, false, 0);
                }
                this.field205.method593(super.field1433, 128, false, 0);
                this.field206.method593(super.field1433, 202, false, 371);
                this.field210.method593(super.field1433, 0, false, 265);
                this.field211.method593(super.field1433, 562, false, 265);
                this.field212.method593(super.field1433, 128, false, 171);
                this.field213.method593(super.field1433, 562, false, 171);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(III)Ljava/lang/String;")
    public static final String method170(int arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            field601 = 363;
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

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IJ)V")
    public final void method171(int arg0, long arg1) {
        if (arg1 != 0L) {
            for (int var4 = 0; var4 < this.field498; ++var4) {
                if (this.field269[var4] == arg1) {
                    --this.field498;
                    this.field501 = true;
                    for (int var5 = var4; var5 < this.field498; ++var5) {
                        this.field269[var5] = this.field269[var5 + 1];
                    }
                    this.field483.method43(0, 12);
                    this.field483.method50(this.field642, arg1);
                    break;
                }
            }
            if (arg0 <= 0) {
                this.method162();
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(Z)V")
    public final void method172(boolean arg0) {
        this.field355.method592(-19705);
        class42.field1212 = this.field487;
        this.field401.method446(0, (byte) 3, 0);
        if (this.field340) {
            this.field326.method96(40, (byte) 8, 0, this.field222, 239);
            this.field326.method96(60, (byte) 8, 128, this.field191 + "*", 239);
        } else if (this.field646 == 1) {
            this.field326.method96(40, (byte) 8, 0, "Enter amount:", 239);
            this.field326.method96(60, (byte) 8, 128, this.field502 + "*", 239);
        } else if (this.field646 == 2) {
            this.field326.method96(40, (byte) 8, 0, "Enter name:", 239);
            this.field326.method96(60, (byte) 8, 128, this.field502 + "*", 239);
        } else if (this.field646 == 3) {
            if (this.field502 != this.field335) {
                this.method238(this.field502, -187);
                this.field335 = this.field502;
            }
            class5 var2 = this.field325;
            class8.method140(0, true, 0, 463, 77);
            for (int var3 = 0; var3 < this.field336; ++var3) {
                int var4 = var3 * 14 + 18 - this.field339;
                if (var4 > 0 && var4 < 110) {
                    var2.method96(var4, (byte) 8, 0, this.field337[var3], 239);
                }
            }
            class8.method139(0);
            if (this.field336 > 5) {
                this.method292(463, 0, this.field482, this.field339, this.field336 * 14 + 7, 77);
            }
            if (this.field502.length() == 0) {
                this.field326.method96(40, (byte) 8, 255, "Enter object name", 239);
            } else if (this.field336 == 0) {
                this.field326.method96(40, (byte) 8, 0, "No matching objects found, please shorten search", 239);
            }
            var2.method96(90, (byte) 8, 0, this.field502 + "*", 239);
            class8.method146(-898, 479, 0, 0, 77);
        } else if (this.field625 != null) {
            this.field326.method96(40, (byte) 8, 0, this.field625, 239);
            this.field326.method96(60, (byte) 8, 128, "Click to continue", 239);
        } else if (this.field465 != -1) {
            this.method208(0, 0, 0, class15.method306(this.field465), this.field281);
        } else if (this.field554 != -1) {
            this.method208(0, 0, 0, class15.method306(this.field554), this.field281);
        } else {
            class5 var5 = this.field325;
            int var6 = 0;
            class8.method140(0, true, 0, 463, 77);
            for (int var7 = 0; var7 < 100; ++var7) {
                if (this.field639[var7] != null) {
                    int var9 = this.field637[var7];
                    int var10 = 70 - var6 * 14 + this.field573;
                    String var11 = this.field638[var7];
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
                            var5.method100(var10, this.field639[var7], 20424, 4, 0);
                        }
                        ++var6;
                    }
                    if ((var9 == 1 || var9 == 2) && (var9 == 1 || this.field614 == 0 || this.field614 == 1 && this.method247((byte) 7, var11))) {
                        if (var10 > 0 && var10 < 110) {
                            int var13 = 4;
                            if (var12 == 1) {
                                this.field183[0].method446(var10 - 12, (byte) 3, var13);
                                var13 += 14;
                            }
                            if (var12 == 2) {
                                this.field183[1].method446(var10 - 12, (byte) 3, var13);
                                var13 += 14;
                            }
                            var5.method100(var10, var11 + ":", 20424, var13, 0);
                            int var14 = var13 + var5.method98(var11, 2) + 8;
                            var5.method100(var10, this.field639[var7], 20424, var14, 255);
                        }
                        ++var6;
                    }
                    if ((var9 == 3 || var9 == 7) && this.field584 == 0 && (var9 == 7 || this.field459 == 0 || this.field459 == 1 && this.method247((byte) 7, var11))) {
                        if (var10 > 0 && var10 < 110) {
                            byte var15 = 4;
                            var5.method100(var10, "From", 20424, var15, 0);
                            int var16 = var15 + var5.method98("From ", 2);
                            if (var12 == 1) {
                                this.field183[0].method446(var10 - 12, (byte) 3, var16);
                                var16 += 14;
                            }
                            if (var12 == 2) {
                                this.field183[1].method446(var10 - 12, (byte) 3, var16);
                                var16 += 14;
                            }
                            var5.method100(var10, var11 + ":", 20424, var16, 0);
                            int var17 = var16 + var5.method98(var11, 2) + 8;
                            var5.method100(var10, this.field639[var7], 20424, var17, 8388608);
                        }
                        ++var6;
                    }
                    if (var9 == 4 && (this.field602 == 0 || this.field602 == 1 && this.method247((byte) 7, var11))) {
                        if (var10 > 0 && var10 < 110) {
                            var5.method100(var10, var11 + " " + this.field639[var7], 20424, 4, 8388736);
                        }
                        ++var6;
                    }
                    if (var9 == 5 && this.field584 == 0 && this.field459 < 2) {
                        if (var10 > 0 && var10 < 110) {
                            var5.method100(var10, this.field639[var7], 20424, 4, 8388608);
                        }
                        ++var6;
                    }
                    if (var9 == 6 && this.field584 == 0 && this.field459 < 2) {
                        if (var10 > 0 && var10 < 110) {
                            var5.method100(var10, "To " + var11 + ":", 20424, 4, 0);
                            var5.method100(var10, this.field639[var7], 20424, 12 + var5.method98("To " + var11, 2), 8388608);
                        }
                        ++var6;
                    }
                    if (var9 == 8 && (this.field602 == 0 || this.field602 == 1 && this.method247((byte) 7, var11))) {
                        if (var10 > 0 && var10 < 110) {
                            var5.method100(var10, var11 + " " + this.field639[var7], 20424, 4, 8270336);
                        }
                        ++var6;
                    }
                }
            }
            class8.method139(0);
            this.field486 = var6 * 14 + 7;
            if (this.field486 < 78) {
                this.field486 = 78;
            }
            this.method292(463, 0, this.field482, this.field486 - this.field573 - 77, this.field486, 77);
            String var8;
            if (field623 != null && field623.field953 != null) {
                var8 = field623.field953;
            } else {
                var8 = class29.method327(this.field416, (byte) 58);
            }
            var5.method100(90, var8 + ":", 20424, 4, 0);
            var5.method100(90, this.field275 + "*", 20424, 6 + var5.method98(var8 + ": ", 2), 255);
            class8.method146(-898, 479, 0, 0, 77);
        }
        if (this.field310 && this.field330 == 2) {
            this.method184(31290);
        }
        this.field355.method593(super.field1433, 17, false, 357);
        this.field354.method592(-19705);
        if (arg0) {
            this.field642 = 165;
        }
        class42.field1212 = this.field489;
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(Z)V")
    public final void method173(boolean arg0) {
        try {
            this.field654 = -1;
            this.field219.method602();
            this.field277.method602();
            class42.method427(false);
            this.method225(this.field463);
            this.field306.method373(16868);
            System.gc();
            for (int var2 = 0; var2 < 4; ++var2) {
                this.field217[var2].method483();
            }
            for (int var3 = 0; var3 < 4; ++var3) {
                for (int var4 = 0; var4 < 104; ++var4) {
                    for (int var5 = 0; var5 < 104; ++var5) {
                        this.field508[var3][var4][var5] = 0;
                    }
                }
            }
            class46 var6 = new class46(this.field508, this.field225, 104, 216, 104);
            int var7 = this.field398.length;
            this.field483.method43(0, 54);
            if (!this.field172) {
                for (int var8 = 0; var8 < var7; ++var8) {
                    int var9 = (this.field618[var8] >> 8) * 64 - this.field377;
                    int var10 = (this.field618[var8] & 255) * 64 - this.field378;
                    byte[] var11 = this.field398[var8];
                    if (var11 != null) {
                        var6.method463(var11, (this.field215 - 6) * 8, (this.field214 - 6) * 8, this.field217, 1, var9, var10);
                    }
                }
                for (int var12 = 0; var12 < var7; ++var12) {
                    int var13 = (this.field618[var12] >> 8) * 64 - this.field377;
                    int var14 = (this.field618[var12] & 255) * 64 - this.field378;
                    byte[] var15 = this.field398[var12];
                    if (var15 == null && this.field215 < 800) {
                        var6.method462(64, 64, var14, var13, this.field292);
                    }
                }
                this.field483.method43(0, 54);
                for (int var16 = 0; var16 < var7; ++var16) {
                    byte[] var17 = this.field342[var16];
                    if (var17 != null) {
                        int var18 = (this.field618[var16] >> 8) * 64 - this.field377;
                        int var19 = (this.field618[var16] & 255) * 64 - this.field378;
                        var6.method464(var19, 3, var18, this.field306, var17, this.field217);
                    }
                }
            }
            if (this.field172) {
                int var20 = 0;
                label252: while (true) {
                    if (var20 >= 4) {
                        for (int var31 = 0; var31 < 13; ++var31) {
                            for (int var32 = 0; var32 < 13; ++var32) {
                                int var33 = this.field367[0][var31][var32];
                                if (var33 == -1) {
                                    var6.method462(8, 8, var32 * 8, var31 * 8, this.field292);
                                }
                            }
                        }
                        this.field483.method43(0, 54);
                        int var34 = 0;
                        while (true) {
                            if (var34 >= 4) {
                                break label252;
                            }
                            for (int var35 = 0; var35 < 13; ++var35) {
                                for (int var36 = 0; var36 < 13; ++var36) {
                                    int var37 = this.field367[var34][var35][var36];
                                    if (var37 != -1) {
                                        int var38 = var37 >> 24 & 3;
                                        int var39 = var37 >> 1 & 3;
                                        int var40 = var37 >> 14 & 1023;
                                        int var41 = var37 >> 3 & 2047;
                                        int var42 = (var40 / 8 << 8) + var41 / 8;
                                        for (int var43 = 0; var43 < this.field618.length; ++var43) {
                                            if (this.field618[var43] == var42 && this.field342[var43] != null) {
                                                var6.method476((var41 & 7) * 8, var36 * 8, (byte) 8, this.field306, var39, var34, this.field217, (var40 & 7) * 8, this.field342[var43], var38, var35 * 8);
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
                            int var24 = this.field367[var20][var21][var22];
                            if (var24 != -1) {
                                int var25 = var24 >> 24 & 3;
                                int var26 = var24 >> 1 & 3;
                                int var27 = var24 >> 14 & 1023;
                                int var28 = var24 >> 3 & 2047;
                                int var29 = (var27 / 8 << 8) + var28 / 8;
                                for (int var30 = 0; var30 < this.field618.length; ++var30) {
                                    if (this.field618[var30] == var29 && this.field398[var30] != null) {
                                        var6.method467(var26, (var27 & 7) * 8, var22 * 8, var20, this.field398[var30], this.field217, var21 * 8, (var28 & 7) * 8, var25, this.field220);
                                        var23 = true;
                                        break;
                                    }
                                }
                            }
                            if (!var23) {
                                var6.method461(var21 * 8, var20, 620, var22 * 8);
                            }
                        }
                    }
                    ++var20;
                }
            }
            this.field483.method43(0, 54);
            var6.method474(this.field306, this.field217, this.field634);
            if (this.field354 != null) {
                this.field354.method592(-19705);
                class42.field1212 = this.field489;
            }
            this.field483.method43(0, 54);
            int var44 = class46.field1317;
            if (var44 > this.field272) {
                var44 = this.field272;
            }
            if (var44 < this.field272 - 1) {
                int var45 = this.field272 - 1;
            }
            if (field374) {
                this.field306.method374(class46.field1317, 0);
            } else {
                this.field306.method374(0, 0);
            }
            for (int var46 = 0; var46 < 104; ++var46) {
                for (int var47 = 0; var47 < 104; ++var47) {
                    this.method213(var46, var47);
                }
            }
            this.method252(true);
        } catch (Exception var60) {
        }
        class68.field1698.method497();
        if (super.field1436 != null) {
            this.field483.method43(0, 120);
            this.field483.method48(1057001181);
        }
        if (field374 && signlink.cache_dat != null) {
            int var49 = this.field580.method122(0, 0);
            for (int var50 = 0; var50 < var49; ++var50) {
                int var51 = this.field580.method121(0, var50);
                if ((var51 & 121) == 0) {
                    class65.method540(true, var50);
                }
            }
        }
        System.gc();
        class42.method428(20, (byte) 14);
        this.field580.method132((byte) 4);
        this.field250 &= arg0;
        int var52 = (this.field214 - 6) / 8 - 1;
        int var53 = (this.field214 + 6) / 8 + 1;
        int var54 = (this.field215 - 6) / 8 - 1;
        int var55 = (this.field215 + 6) / 8 + 1;
        if (this.field280) {
            var52 = 49;
            var53 = 50;
            var54 = 49;
            var55 = 50;
        }
        for (int var56 = var52; var56 <= var53; ++var56) {
            for (int var57 = var54; var57 <= var55; ++var57) {
                if (var52 == var56 || var53 == var56 || var54 == var57 || var55 == var57) {
                    int var58 = this.field580.method129(var56, 0, false, var57);
                    if (var58 != -1) {
                        this.field580.method133(3, true, var58);
                    }
                    int var59 = this.field580.method129(var56, 1, false, var57);
                    if (var59 != -1) {
                        this.field580.method133(3, true, var59);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
    public final void method174(int arg0) {
        for (int var2 = 0; var2 < this.field245; ++var2) {
            if (this.field198[var2] <= 0) {
                boolean var3 = false;
                try {
                    if (this.field396[var2] == this.field230 && this.field653[var2] == this.field409) {
                        if (!this.method246(true)) {
                            var3 = true;
                        }
                    } else {
                        class3 var4 = class34.method339(this.field653[var2], this.field396[var2], 110);
                        if (System.currentTimeMillis() + (long) (var4.field50 / 22) > (long) (this.field492 / 22) + this.field594) {
                            this.field492 = var4.field50;
                            this.field594 = System.currentTimeMillis();
                            if (this.method234(false, var4.field50, var4.field49)) {
                                this.field230 = this.field396[var2];
                                this.field409 = this.field653[var2];
                            } else {
                                var3 = true;
                            }
                        }
                    }
                } catch (Exception var7) {
                    if (signlink.reporterror) {
                        this.field483.method43(0, 156);
                        this.field483.method45(this.field396[var2] & 32767);
                    } else {
                        this.field483.method43(0, 156);
                        this.field483.method45(-1);
                    }
                }
                if (var3 && this.field198[var2] != -5) {
                    this.field198[var2] = -5;
                } else {
                    --this.field245;
                    for (int var6 = var2; var6 < this.field245; ++var6) {
                        this.field396[var6] = this.field396[var6 + 1];
                        this.field653[var6] = this.field653[var6 + 1];
                        this.field198[var6] = this.field198[var6 + 1];
                    }
                    --var2;
                }
            } else {
                int var10002 = this.field198[var2]--;
            }
        }
        if (arg0 >= 0) {
            this.field483.method44(213);
        }
        if (this.field655 > 0) {
            this.field655 -= 20;
            if (this.field655 < 0) {
                this.field655 = 0;
            }
            if (this.field655 == 0 && this.field537 && !field374) {
                this.field297 = this.field343;
                this.field298 = true;
                this.field580.method118(2, this.field297);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(III)V")
    public final void method175(int arg0, int arg1, int arg2) {
        if (arg0 != 1) {
            this.method162();
        }
        int var4 = 0;
        for (int var5 = 0; var5 < 100; ++var5) {
            if (this.field639[var5] != null) {
                int var6 = this.field637[var5];
                int var7 = 70 - var4 * 14 + this.field573 + 4;
                if (var7 < -20) {
                    break;
                }
                String var8 = this.field638[var5];
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
                if ((var6 == 1 || var6 == 2) && (var6 == 1 || this.field614 == 0 || this.field614 == 1 && this.method247((byte) 7, var8))) {
                    if (arg1 > var7 - 14 && arg1 <= var7 && !var8.equals(field623.field953)) {
                        if (this.field267 >= 1) {
                            this.field434[this.field344] = "Report abuse @whi@" + var8;
                            this.field180[this.field344] = 414;
                            ++this.field344;
                        }
                        this.field434[this.field344] = "Add ignore @whi@" + var8;
                        this.field180[this.field344] = 872;
                        ++this.field344;
                        this.field434[this.field344] = "Add friend @whi@" + var8;
                        this.field180[this.field344] = 106;
                        ++this.field344;
                    }
                    ++var4;
                }
                if ((var6 == 3 || var6 == 7) && this.field584 == 0 && (var6 == 7 || this.field459 == 0 || this.field459 == 1 && this.method247((byte) 7, var8))) {
                    if (arg1 > var7 - 14 && arg1 <= var7) {
                        if (this.field267 >= 1) {
                            this.field434[this.field344] = "Report abuse @whi@" + var8;
                            this.field180[this.field344] = 414;
                            ++this.field344;
                        }
                        this.field434[this.field344] = "Add ignore @whi@" + var8;
                        this.field180[this.field344] = 872;
                        ++this.field344;
                        this.field434[this.field344] = "Add friend @whi@" + var8;
                        this.field180[this.field344] = 106;
                        ++this.field344;
                    }
                    ++var4;
                }
                if (var6 == 4 && (this.field602 == 0 || this.field602 == 1 && this.method247((byte) 7, var8))) {
                    if (arg1 > var7 - 14 && arg1 <= var7) {
                        this.field434[this.field344] = "Accept trade @whi@" + var8;
                        this.field180[this.field344] = 416;
                        ++this.field344;
                    }
                    ++var4;
                }
                if ((var6 == 5 || var6 == 6) && this.field584 == 0 && this.field459 < 2) {
                    ++var4;
                }
                if (var6 == 8 && (this.field602 == 0 || this.field602 == 1 && this.method247((byte) 7, var8))) {
                    if (arg1 > var7 - 14 && arg1 <= var7) {
                        this.field434[this.field344] = "Accept challenge @whi@" + var8;
                        this.field180[this.field344] = 918;
                        ++this.field344;
                    }
                    ++var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V")
    public final void method176(int arg0) {
        int var2 = this.field326.method98("Choose Option", 2);
        for (int var3 = 0; var3 < this.field344; ++var3) {
            int var12 = this.field326.method98(this.field434[var3], 2);
            if (var12 > var2) {
                var2 = var12;
            }
        }
        if (arg0 != 0) {
            for (int var4 = 1; var4 > 0; ++var4) {
            }
        }
        var2 += 8;
        int var5 = this.field344 * 15 + 21;
        if (super.field1448 > 4 && super.field1449 > 4 && super.field1448 < 516 && super.field1449 < 338) {
            int var6 = super.field1448 - 4 - var2 / 2;
            if (var2 + var6 > 512) {
                var6 = 512 - var2;
            }
            if (var6 < 0) {
                var6 = 0;
            }
            int var7 = super.field1449 - 4;
            if (var5 + var7 > 334) {
                var7 = 334 - var5;
            }
            if (var7 < 0) {
                var7 = 0;
            }
            this.field310 = true;
            this.field330 = 0;
            this.field331 = var6;
            this.field332 = var7;
            this.field333 = var2;
            this.field334 = this.field344 * 15 + 22;
        }
        if (super.field1448 > 553 && super.field1449 > 205 && super.field1448 < 743 && super.field1449 < 466) {
            int var8 = super.field1448 - 553 - var2 / 2;
            if (var8 < 0) {
                var8 = 0;
            } else if (var2 + var8 > 190) {
                var8 = 190 - var2;
            }
            int var9 = super.field1449 - 205;
            if (var9 < 0) {
                var9 = 0;
            } else if (var5 + var9 > 261) {
                var9 = 261 - var5;
            }
            this.field310 = true;
            this.field330 = 1;
            this.field331 = var8;
            this.field332 = var9;
            this.field333 = var2;
            this.field334 = this.field344 * 15 + 22;
        }
        if (super.field1448 > 17 && super.field1449 > 357 && super.field1448 < 496 && super.field1449 < 453) {
            int var10 = super.field1448 - 17 - var2 / 2;
            if (var10 < 0) {
                var10 = 0;
            } else if (var2 + var10 > 479) {
                var10 = 479 - var2;
            }
            int var11 = super.field1449 - 357;
            if (var11 < 0) {
                var11 = 0;
            } else if (var5 + var11 > 96) {
                var11 = 96 - var5;
            }
            this.field310 = true;
            this.field330 = 2;
            this.field331 = var10;
            this.field332 = var11;
            this.field333 = var2;
            this.field334 = this.field344 * 15 + 22;
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(IILBFQIDHPO;)V")
    private final void method177(int arg0, int arg1, class3 arg2) {
        this.field578 = 0;
        this.field363 = 0;
        if (arg1 != 22847) {
            this.field233 = arg2.method54();
        }
        this.method257(arg0, arg2, false);
        this.method222(arg0, (byte) 9, arg2);
        this.method251(arg0, arg2, this.field433);
        this.method183(arg0, arg2, true);
        for (int var4 = 0; var4 < this.field578; ++var4) {
            int var6 = this.field579[var4];
            if (field564 != this.field360[var6].field883) {
                this.field360[var6] = null;
            }
        }
        if (arg2.field50 != arg0) {
            signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg2.field50 + " psize:" + arg0);
            throw new RuntimeException("eek");
        } else {
            for (int var5 = 0; var5 < this.field361; ++var5) {
                if (this.field360[this.field362[var5]] == null) {
                    signlink.reporterror(this.field416 + " null entry in pl list - pos:" + var5 + " size:" + this.field361);
                    throw new RuntimeException("eek");
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(BLBFQIDHPO;I)V")
    private final void method178(byte arg0, class3 arg1, int arg2) {
        arg1.method64(0);
        if (arg0 != 2) {
            for (int var4 = 1; var4 > 0; ++var4) {
            }
        }
        int var5 = arg1.method65((byte) 88, 8);
        if (var5 < this.field505) {
            for (int var6 = var5; var6 < this.field505; ++var6) {
                this.field579[this.field578++] = this.field506[var6];
            }
        }
        if (var5 > this.field505) {
            signlink.reporterror(this.field416 + " Too many npcs");
            throw new RuntimeException("eek");
        } else {
            this.field505 = 0;
            for (int var7 = 0; var7 < var5; ++var7) {
                int var8 = this.field506[var7];
                class2 var9 = this.field504[var8];
                int var10 = arg1.method65((byte) 88, 1);
                if (var10 == 0) {
                    this.field506[this.field505++] = var8;
                    var9.field883 = field564;
                } else {
                    int var11 = arg1.method65((byte) 88, 2);
                    if (var11 == 0) {
                        this.field506[this.field505++] = var8;
                        var9.field883 = field564;
                        this.field364[this.field363++] = var8;
                    } else if (var11 == 1) {
                        this.field506[this.field505++] = var8;
                        var9.field883 = field564;
                        int var12 = arg1.method65((byte) 88, 3);
                        var9.method317(var12, this.field418, false);
                        int var13 = arg1.method65((byte) 88, 1);
                        if (var13 == 1) {
                            this.field364[this.field363++] = var8;
                        }
                    } else if (var11 == 2) {
                        this.field506[this.field505++] = var8;
                        var9.field883 = field564;
                        int var14 = arg1.method65((byte) 88, 3);
                        var9.method317(var14, this.field418, true);
                        int var15 = arg1.method65((byte) 88, 3);
                        var9.method317(var15, this.field418, true);
                        int var16 = arg1.method65((byte) 88, 1);
                        if (var16 == 1) {
                            this.field364[this.field363++] = var8;
                        }
                    } else if (var11 == 3) {
                        this.field579[this.field578++] = var8;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IB)Ljava/lang/String;")
    private static final String method179(int arg0, byte arg1) {
        String var2 = String.valueOf(arg0);
        for (int var3 = var2.length() - 3; var3 > 0; var3 -= 3) {
            var2 = var2.substring(0, var3) + "," + var2.substring(var3);
        }
        if (arg1 != -14) {
            field448 = -61;
        }
        if (var2.length() > 8) {
            var2 = "@gre@" + var2.substring(0, var2.length() - 8) + " million @whi@(" + var2 + ")";
        } else if (var2.length() > 4) {
            var2 = "@cya@" + var2.substring(0, var2.length() - 4) + "K @whi@(" + var2 + ")";
        }
        return " " + var2;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
    public final void method180(Runnable arg0, int arg1) {
        if (arg1 > 10) {
            arg1 = 10;
        }
        if (signlink.mainapp != null) {
            signlink.startthread(arg0, arg1);
        } else {
            super.method180(arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILNDGQUJMA;II)V")
    public final void method181(int arg0, class36 arg1, int arg2, int arg3) {
        if (arg3 != 8) {
            this.field223 = 330;
        }
        int var5 = arg0 * arg0 + arg2 * arg2;
        if (var5 > 4225 && var5 < 90000) {
            int var6 = this.field469 + this.field466 & 2047;
            int var7 = class65.field1658[var6];
            int var8 = class65.field1659[var6];
            int var9 = var7 * 256 / (this.field565 + 256);
            int var10 = var8 * 256 / (this.field565 + 256);
            int var11 = arg0 * var9 + arg2 * var10 >> 16;
            int var12 = arg0 * var10 - arg2 * var9 >> 16;
            double var13 = Math.atan2((double) var11, (double) var12);
            int var15 = (int) (Math.sin(var13) * 63.0D);
            int var16 = (int) (Math.cos(var13) * 57.0D);
            this.field388.method358(83 - var16 - 20, 0, 15, var13, 20, 15, 20, 256, var15 + 94 + 4 - 10);
        } else {
            this.method202((byte) 103, arg2, arg1, arg0);
        }
    }

    @OriginalMember(owner = "client!client", name = "m", descriptor = "(I)V")
    public final void method182(int arg0) {
        while (arg0 >= 0) {
            this.method162();
        }
        if (super.field1447 == 1) {
            if (super.field1448 >= 6 && super.field1448 <= 106 && super.field1449 >= 467 && super.field1449 <= 499) {
                this.field614 = (this.field614 + 1) % 4;
                this.field531 = true;
                this.field226 = true;
                this.field483.method43(0, 83);
                this.field483.method44(this.field614);
                this.field483.method44(this.field459);
                this.field483.method44(this.field602);
            }
            if (super.field1448 >= 135 && super.field1448 <= 235 && super.field1449 >= 467 && super.field1449 <= 499) {
                this.field459 = (this.field459 + 1) % 3;
                this.field531 = true;
                this.field226 = true;
                this.field483.method43(0, 83);
                this.field483.method44(this.field614);
                this.field483.method44(this.field459);
                this.field483.method44(this.field602);
            }
            if (super.field1448 >= 273 && super.field1448 <= 373 && super.field1449 >= 467 && super.field1449 <= 499) {
                this.field602 = (this.field602 + 1) % 3;
                this.field531 = true;
                this.field226 = true;
                this.field483.method43(0, 83);
                this.field483.method44(this.field614);
                this.field483.method44(this.field459);
                this.field483.method44(this.field602);
            }
            if (super.field1448 >= 412 && super.field1448 <= 512 && super.field1449 >= 467 && super.field1449 <= 499) {
                if (this.field484 == -1) {
                    this.method260(true);
                    this.field581 = "";
                    this.field322 = false;
                    this.field405 = this.field484 = class15.field777;
                    return;
                }
                this.method192("", "Please close the interface you have open before using 'report abuse'", 0, this.field369);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILBFQIDHPO;Z)V")
    private final void method183(int arg0, class3 arg1, boolean arg2) {
        this.field250 &= arg2;
        for (int var4 = 0; var4 < this.field363; ++var4) {
            int var5 = this.field364[var4];
            class22 var6 = this.field360[var5];
            int var7 = arg1.method54();
            if ((var7 & 32) != 0) {
                var7 += arg1.method54() << 8;
            }
            this.method281(var6, true, var5, var7, arg1);
        }
    }

    @OriginalMember(owner = "client!client", name = "n", descriptor = "(I)V")
    public final void method184(int arg0) {
        int var2 = this.field331;
        int var3 = this.field332;
        int var4 = this.field333;
        int var5 = this.field334;
        int var6 = 6116423;
        class8.method143(var6, var2, var3, var4, var5, false);
        class8.method143(0, var2 + 1, var3 + 1, var4 - 2, 16, false);
        class8.method144(var3 + 18, 0, 264, var2 + 1, var5 - 19, var4 - 2);
        this.field326.method100(var3 + 14, "Choose Option", 20424, var2 + 3, var6);
        int var7 = super.field1441;
        int var8 = super.field1442;
        if (this.field330 == 0) {
            var7 -= 4;
            var8 -= 4;
        }
        if (this.field330 == 1) {
            var7 -= 553;
            var8 -= 205;
        }
        if (this.field330 == 2) {
            var7 -= 17;
            var8 -= 357;
        }
        for (int var9 = 0; var9 < this.field344; ++var9) {
            int var10 = (this.field344 - 1 - var9) * 15 + var3 + 31;
            int var11 = 16777215;
            if (var7 > var2 && var7 < var2 + var4 && var8 > var10 - 13 && var8 < var10 + 3) {
                var11 = 16776960;
            }
            this.field326.method104(true, var10, var2 + 3, var11, this.field434[var9], 4);
        }
        if (arg0 != 31290) {
            this.method162();
        }
    }

    @OriginalMember(owner = "client!client", name = "o", descriptor = "(I)V")
    public static final void method185(int arg0) {
        class41.field1135 = true;
        class42.field1201 = true;
        field374 = true;
        class46.field1295 = true;
        class68.field1693 = true;
        if (arg0 >= 0) {
            for (int var1 = 1; var1 > 0; ++var1) {
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIBIIIII)V")
    private final void method186(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg2 != -28) {
            this.field483.method44(4);
        }
        if (arg4 >= 1 && arg5 >= 1 && arg4 <= 102 && arg5 <= 102) {
            if (field374 && this.field272 != arg3) {
                return;
            }
            int var9 = 0;
            boolean var10 = true;
            boolean var11 = false;
            boolean var12 = false;
            if (arg1 == 0) {
                var9 = this.field306.method399(arg3, arg4, arg5);
            }
            if (arg1 == 1) {
                var9 = this.field306.method400(arg3, arg4, arg5, 3);
            }
            if (arg1 == 2) {
                var9 = this.field306.method401(arg3, arg4, arg5);
            }
            if (arg1 == 3) {
                var9 = this.field306.method402(arg3, arg4, arg5);
            }
            if (var9 != 0) {
                int var13 = this.field306.method403(arg3, arg4, arg5, var9);
                int var14 = var9 >> 14 & 32767;
                int var15 = var13 & 31;
                int var16 = var13 >> 6;
                if (arg1 == 0) {
                    this.field306.method390(this.field341, arg5, arg4, arg3);
                    class68 var17 = class68.method575(var14);
                    if (var17.field1735) {
                        this.field217[arg3].method488(var15, arg4, arg5, var17.field1704, 0, var16);
                    }
                }
                if (arg1 == 1) {
                    this.field306.method391(arg3, arg4, arg5, (byte) 97);
                }
                if (arg1 == 2) {
                    this.field306.method392(arg5, 0, arg4, arg3);
                    class68 var18 = class68.method575(var14);
                    if (var18.field1707 + arg4 > 103 || var18.field1707 + arg5 > 103 || var18.field1715 + arg4 > 103 || var18.field1715 + arg5 > 103) {
                        return;
                    }
                    if (var18.field1735) {
                        this.field217[arg3].method489(var18.field1715, var18.field1707, (byte) 0, var16, arg5, arg4, var18.field1704);
                    }
                }
                if (arg1 == 3) {
                    this.field306.method393(true, arg5, arg4, arg3);
                    class68 var19 = class68.method575(var14);
                    if (var19.field1735 && var19.field1700) {
                        this.field217[arg3].method491(arg4, true, arg5);
                    }
                }
            }
            if (arg6 >= 0) {
                int var20 = arg3;
                if (arg3 < 3 && (this.field508[1][arg4][arg5] & 2) == 2) {
                    var20 = arg3 + 1;
                }
                class46.method472((byte) 1, var20, arg3, this.field225, arg6, arg0, arg5, arg7, arg4, this.field217[arg3], this.field306);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "p", descriptor = "(I)I")
    public final int method187(int arg0) {
        if (this.field476 != arg0) {
            this.method162();
        }
        int var2 = 3;
        if (this.field559 < 310) {
            ++field382;
            if (field382 > 143) {
                field382 = 0;
                this.field483.method43(0, 60);
                this.field483.method44(254);
            }
            int var3 = this.field556 >> 7;
            int var4 = this.field558 >> 7;
            int var5 = field623.field884 >> 7;
            int var6 = field623.field885 >> 7;
            if ((this.field508[this.field272][var3][var4] & 4) != 0) {
                var2 = this.field272;
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
                    if ((this.field508[this.field272][var3][var4] & 4) != 0) {
                        var2 = this.field272;
                    }
                    var10 += var9;
                    if (var10 >= 65536) {
                        var10 -= 65536;
                        if (var4 < var6) {
                            ++var4;
                        } else if (var4 > var6) {
                            --var4;
                        }
                        if ((this.field508[this.field272][var3][var4] & 4) != 0) {
                            var2 = this.field272;
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
                    if ((this.field508[this.field272][var3][var4] & 4) != 0) {
                        var2 = this.field272;
                    }
                    var12 += var11;
                    if (var12 >= 65536) {
                        var12 -= 65536;
                        if (var3 < var5) {
                            ++var3;
                        } else if (var3 > var5) {
                            --var3;
                        }
                        if ((this.field508[this.field272][var3][var4] & 4) != 0) {
                            var2 = this.field272;
                        }
                    }
                }
            }
        }
        if ((this.field508[this.field272][field623.field884 >> 7][field623.field885 >> 7] & 4) != 0) {
            var2 = this.field272;
        }
        return var2;
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(Z)I")
    public final int method188(boolean arg0) {
        if (arg0) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        int var3 = this.method190(0, this.field558, this.field272, this.field556);
        return var3 - this.field557 < 800 && (this.field508[this.field272][this.field556 >> 7][this.field558 >> 7] & 4) != 0 ? this.field272 : 3;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IZ)V")
    public final void method189(int arg0, boolean arg1) {
        this.method254(false);
        this.field207.method592(-19705);
        this.field258.method446(0, (byte) 3, 0);
        short var3 = 360;
        short var4 = 200;
        if (arg0 <= 0) {
            this.field527 = !this.field527;
        }
        if (this.field313 == 0) {
            int var5 = var4 / 2 + 80;
            this.field324.method97(true, this.field580.field114, -930, 7711145, var5, var3 / 2);
            int var6 = var4 / 2 - 20;
            this.field326.method97(true, "Welcome to RuneScape", -930, 16776960, var6, var3 / 2);
            int var17 = var6 + 30;
            int var7 = var3 / 2 - 80;
            int var8 = var4 / 2 + 20;
            this.field259.method446(var8 - 20, (byte) 3, var7 - 73);
            this.field326.method97(true, "New User", -930, 16777215, var8 + 5, var7);
            int var9 = var3 / 2 + 80;
            this.field259.method446(var8 - 20, (byte) 3, var9 - 73);
            this.field326.method97(true, "Existing User", -930, 16777215, var8 + 5, var9);
        }
        if (this.field313 == 2) {
            int var10 = var4 / 2 - 40;
            if (this.field346.length() > 0) {
                this.field326.method97(true, this.field346, -930, 16776960, var10 - 15, var3 / 2);
                this.field326.method97(true, this.field347, -930, 16776960, var10, var3 / 2);
                var10 += 30;
            } else {
                this.field326.method97(true, this.field347, -930, 16776960, var10 - 7, var3 / 2);
                var10 += 30;
            }
            this.field326.method104(true, var10, var3 / 2 - 90, 16777215, "Username: " + this.field416 + (this.field200 == 0 & field564 % 40 < 20 ? "@yel@|" : ""), 4);
            var10 += 15;
            this.field326.method104(true, var10, var3 / 2 - 88, 16777215, "Password: " + class29.method328(true, this.field417) + (this.field200 == 1 & field564 % 40 < 20 ? "@yel@|" : ""), 4);
            var10 += 15;
            if (!arg1) {
                int var11 = var3 / 2 - 80;
                int var12 = var4 / 2 + 50;
                this.field259.method446(var12 - 20, (byte) 3, var11 - 73);
                this.field326.method97(true, "Login", -930, 16777215, var12 + 5, var11);
                int var13 = var3 / 2 + 80;
                this.field259.method446(var12 - 20, (byte) 3, var13 - 73);
                this.field326.method97(true, "Cancel", -930, 16777215, var12 + 5, var13);
            }
        }
        if (this.field313 == 3) {
            this.field326.method97(true, "Create a free account", -930, 16776960, var4 / 2 - 60, var3 / 2);
            int var14 = var4 / 2 - 35;
            this.field326.method97(true, "To create a new account you need to", -930, 16777215, var14, var3 / 2);
            int var18 = var14 + 15;
            this.field326.method97(true, "go back to the main RuneScape webpage", -930, 16777215, var18, var3 / 2);
            int var19 = var18 + 15;
            this.field326.method97(true, "and choose the 'create account'", -930, 16777215, var19, var3 / 2);
            int var20 = var19 + 15;
            this.field326.method97(true, "button near the top of that page.", -930, 16777215, var20, var3 / 2);
            int var21 = var20 + 15;
            int var15 = var3 / 2;
            int var16 = var4 / 2 + 50;
            this.field259.method446(var16 - 20, (byte) 3, var15 - 73);
            this.field326.method97(true, "Cancel", -930, 16777215, var16 + 5, var15);
        }
        this.field207.method593(super.field1433, 202, false, 171);
        if (this.field596) {
            this.field596 = false;
            this.field205.method593(super.field1433, 128, false, 0);
            this.field206.method593(super.field1433, 202, false, 371);
            this.field210.method593(super.field1433, 0, false, 265);
            this.field211.method593(super.field1433, 562, false, 265);
            this.field212.method593(super.field1433, 128, false, 171);
            this.field213.method593(super.field1433, 562, false, 171);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIII)I")
    public final int method190(int arg0, int arg1, int arg2, int arg3) {
        int var5 = arg3 >> 7;
        int var6 = arg1 >> 7;
        if (var5 >= 0 && var6 >= 0 && var5 <= 103 && var6 <= 103) {
            int var7 = arg2;
            if (arg2 < 3 && (this.field508[1][var5][var6] & 2) == 2) {
                var7 = arg2 + 1;
            }
            int var8 = arg3 & 127;
            int var9 = arg1 & 127;
            int var10 = (128 - var8) * this.field225[var7][var5][var6] + this.field225[var7][var5 + 1][var6] * var8 >> 7;
            if (arg0 != 0) {
                this.field233 = -1;
            }
            int var11 = (128 - var8) * this.field225[var7][var5][var6 + 1] + this.field225[var7][var5 + 1][var6 + 1] * var8 >> 7;
            return (128 - var9) * var10 + var9 * var11 >> 7;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!client", name = "q", descriptor = "(I)V")
    public final void method191(int arg0) {
        if (arg0 < 8 || arg0 > 8) {
            this.field483.method44(198);
        }
        for (int var2 = -1; var2 < this.field361; ++var2) {
            int var3;
            if (var2 == -1) {
                var3 = this.field359;
            } else {
                var3 = this.field362[var2];
            }
            class22 var4 = this.field360[var3];
            if (var4 != null) {
                this.method263(1, 36436, var4);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;II)V")
    public final void method192(String arg0, String arg1, int arg2, int arg3) {
        if (arg2 == 0 && this.field554 != -1) {
            this.field625 = arg1;
            super.field1447 = 0;
        }
        if (this.field465 == -1) {
            this.field226 = true;
        }
        for (int var5 = 99; var5 > 0; --var5) {
            this.field637[var5] = this.field637[var5 - 1];
            this.field638[var5] = this.field638[var5 - 1];
            this.field639[var5] = this.field639[var5 - 1];
        }
        this.field637[0] = arg2;
        if (arg3 < 8 || arg3 > 8) {
            this.field483.method44(51);
        }
        this.field638[0] = arg0;
        this.field639[0] = arg1;
    }

    @OriginalMember(owner = "client!client", name = "r", descriptor = "(I)V")
    public final void method193(int arg0) {
        if (arg0 < 5 || arg0 > 5) {
            field448 = this.field485.method534();
        }
        while (true) {
            class43 var2 = this.field580.method127();
            if (var2 == null) {
                return;
            }
            if (var2.field1224 == 0) {
                class65.method539(var2.field1226, var2.field1227, 0);
                if ((this.field580.method121(0, var2.field1226) & 98) != 0) {
                    this.field501 = true;
                    if (this.field465 != -1 || this.field554 != -1) {
                        this.field226 = true;
                    }
                }
            }
            if (var2.field1224 == 1 && var2.field1227 != null) {
                class6.method112(var2.field1227, -563);
            }
            if (var2.field1224 == 2 && this.field297 == var2.field1226 && var2.field1227 != null) {
                this.method200(var2.field1227, false, this.field298);
            }
            if (var2.field1224 == 3 && this.field256 == 1) {
                for (int var3 = 0; var3 < this.field398.length; ++var3) {
                    if (this.field619[var3] == var2.field1226) {
                        this.field398[var3] = var2.field1227;
                        if (var2.field1227 == null) {
                            this.field619[var3] = -1;
                        }
                        break;
                    }
                    if (this.field620[var3] == var2.field1226) {
                        this.field342[var3] = var2.field1227;
                        if (var2.field1227 == null) {
                            this.field620[var3] = -1;
                        }
                        break;
                    }
                }
            }
            if (var2.field1224 == 93 && this.field580.method128(var2.field1226, (byte) -88)) {
                class46.method475(this.field580, new class3(var2.field1227, -990), -166);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(LFMDWWBSX;Z)Z")
    public final boolean method194(class15 arg0, boolean arg1) {
        if (!arg1) {
            this.field483.method44(57);
        }
        if (arg0.field742 == null) {
            return false;
        } else {
            for (int var3 = 0; var3 < arg0.field742.length; ++var3) {
                int var4 = this.method244(this.field462, arg0, var3);
                int var5 = arg0.field773[var3];
                if (arg0.field742[var3] == 2) {
                    if (var4 >= var5) {
                        return false;
                    }
                } else if (arg0.field742[var3] == 3) {
                    if (var4 <= var5) {
                        return false;
                    }
                } else if (arg0.field742[var3] == 4) {
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

    @OriginalMember(owner = "client!client", name = "s", descriptor = "(I)V")
    public final void method195(int arg0) {
        this.field258 = new class44(this.field540, "titlebox", 0);
        this.field259 = new class44(this.field540, "titlebutton", 0);
        int var2 = 5 / arg0;
        this.field302 = new class44[12];
        for (int var3 = 0; var3 < 12; ++var3) {
            this.field302[var3] = new class44(this.field540, "runes", var3);
        }
        this.field547 = new class36(128, 265);
        this.field548 = new class36(128, 265);
        for (int var4 = 0; var4 < 33920; ++var4) {
            this.field547.field1076[var4] = this.field208.field1757[var4];
        }
        for (int var5 = 0; var5 < 33920; ++var5) {
            this.field548.field1076[var5] = this.field209.field1757[var5];
        }
        this.field349 = new int[256];
        for (int var6 = 0; var6 < 64; ++var6) {
            this.field349[var6] = var6 * 262144;
        }
        for (int var7 = 0; var7 < 64; ++var7) {
            this.field349[var7 + 64] = var7 * 1024 + 16711680;
        }
        for (int var8 = 0; var8 < 64; ++var8) {
            this.field349[var8 + 128] = var8 * 4 + 16776960;
        }
        for (int var9 = 0; var9 < 64; ++var9) {
            this.field349[var9 + 192] = 16777215;
        }
        this.field350 = new int[256];
        for (int var10 = 0; var10 < 64; ++var10) {
            this.field350[var10] = var10 * 1024;
        }
        for (int var11 = 0; var11 < 64; ++var11) {
            this.field350[var11 + 64] = var11 * 4 + 65280;
        }
        for (int var12 = 0; var12 < 64; ++var12) {
            this.field350[var12 + 128] = var12 * 262144 + 65535;
        }
        for (int var13 = 0; var13 < 64; ++var13) {
            this.field350[var13 + 192] = 16777215;
        }
        this.field351 = new int[256];
        for (int var14 = 0; var14 < 64; ++var14) {
            this.field351[var14] = var14 * 4;
        }
        for (int var15 = 0; var15 < 64; ++var15) {
            this.field351[var15 + 64] = var15 * 262144 + 255;
        }
        for (int var16 = 0; var16 < 64; ++var16) {
            this.field351[var16 + 128] = var16 * 1024 + 16711935;
        }
        for (int var17 = 0; var17 < 64; ++var17) {
            this.field351[var17 + 192] = 16777215;
        }
        this.field348 = new int[256];
        this.field196 = new int[32768];
        this.field197 = new int[32768];
        this.method277(0, (class44) null);
        this.field449 = new int[32768];
        this.field450 = new int[32768];
        this.method169("Connecting to fileserver", 10, (byte) 108);
        if (!this.field221) {
            this.field429 = true;
            this.field221 = true;
            this.method180(this, 2);
        }
    }

    @OriginalMember(owner = "client!client", name = "t", descriptor = "(I)V")
    public final void method196(int arg0) {
        short var2 = 256;
        for (int var3 = 10; var3 < 117; ++var3) {
            int var18 = (int) (Math.random() * 100.0D);
            if (var18 < 50) {
                this.field449[(var2 - 2 << 7) + var3] = 255;
            }
        }
        for (int var4 = 0; var4 < 100; ++var4) {
            int var15 = (int) (Math.random() * 124.0D) + 2;
            int var16 = (int) (Math.random() * 128.0D) + 128;
            int var17 = (var16 << 7) + var15;
            this.field449[var17] = 192;
        }
        if (arg0 != -19541) {
            this.field483.method44(211);
        }
        for (int var5 = 1; var5 < var2 - 1; ++var5) {
            for (int var13 = 1; var13 < 127; ++var13) {
                int var14 = (var5 << 7) + var13;
                this.field450[var14] = (this.field449[var14 - 1] + this.field449[var14 + 1] + this.field449[var14 - 128] + this.field449[var14 + 128]) / 4;
            }
        }
        this.field583 += 128;
        if (this.field583 > this.field196.length) {
            this.field583 -= this.field196.length;
            int var6 = (int) (Math.random() * 12.0D);
            this.method277(0, this.field302[var6]);
        }
        for (int var7 = 1; var7 < var2 - 1; ++var7) {
            for (int var10 = 1; var10 < 127; ++var10) {
                int var11 = (var7 << 7) + var10;
                int var12 = this.field450[var11 + 128] - this.field196[this.field583 + var11 & this.field196.length - 1] / 5;
                if (var12 < 0) {
                    var12 = 0;
                }
                this.field449[var11] = var12;
            }
        }
        for (int var8 = 0; var8 < var2 - 1; ++var8) {
            this.field403[var8] = this.field403[var8 + 1];
        }
        this.field403[var2 - 1] = (int) (Math.sin((double) field564 / 14.0D) * 16.0D + Math.sin((double) field564 / 15.0D) * 14.0D + Math.sin((double) field564 / 16.0D) * 12.0D);
        if (this.field603 > 0) {
            this.field603 -= 4;
        }
        if (this.field604 > 0) {
            this.field604 -= 4;
        }
        if (this.field603 == 0 && this.field604 == 0) {
            int var9 = (int) (Math.random() * 2000.0D);
            if (var9 == 0) {
                this.field603 = 1024;
            }
            if (var9 == 1) {
                this.field604 = 1024;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(IZ)Ljava/lang/String;")
    private static final String method197(int arg0, boolean arg1) {
        if (!arg1) {
            field176 = !field176;
        }
        if (arg0 < 100000) {
            return String.valueOf(arg0);
        } else {
            return arg0 < 10000000 ? arg0 / 1000 + "K" : arg0 / 1000000 + "M";
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ZZ)V")
    public final void method198(boolean arg0, boolean arg1) {
        for (int var3 = 0; var3 < this.field505; ++var3) {
            class2 var4 = this.field504[this.field506[var3]];
            int var5 = (this.field506[var3] << 14) + 536870912;
            if (var4 != null && var4.method41(122) && var4.field25.field1387 == arg0 && var4.field25.method498(0)) {
                int var6 = var4.field884 >> 7;
                int var7 = var4.field885 >> 7;
                if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
                    if (var4.field874 == 1 && (var4.field884 & 127) == 64 && (var4.field885 & 127) == 64) {
                        if (this.field390[var6][var7] == this.field187) {
                            continue;
                        }
                        this.field390[var6][var7] = this.field187;
                    }
                    if (!var4.field25.field1359) {
                        var5 += Integer.MIN_VALUE;
                    }
                    this.field306.method384(var4.field886, this.field272, var4.field885, (var4.field874 - 1) * 64 + 60, this.method190(0, var4.field885, this.field272, var4.field884), var4, var5, var4.field917, (byte) 3, var4.field884);
                }
            }
        }
        if (arg1) {
            this.field544 = null;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;)Ljava/io/DataInputStream;")
    public final DataInputStream method199(String arg0) throws IOException {
        if (!this.field366) {
            return signlink.mainapp != null ? signlink.openurl(arg0) : new DataInputStream((new URL(this.getCodeBase(), arg0)).openStream());
        } else {
            if (this.field312 != null) {
                try {
                    this.field312.close();
                } catch (Exception var4) {
                }
                this.field312 = null;
            }
            this.field312 = this.method283(43595);
            this.field312.setSoTimeout(10000);
            InputStream var2 = this.field312.getInputStream();
            OutputStream var3 = this.field312.getOutputStream();
            var3.write(("JAGGRAB /" + arg0 + "\n\n").getBytes());
            return new DataInputStream(var2);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([BZZ)V")
    public final void method200(byte[] arg0, boolean arg1, boolean arg2) {
        if (arg1) {
            field176 = !field176;
        }
        if (this.field537) {
            signlink.midifade = arg2 ? 1 : 0;
            signlink.midisave(arg0, arg0.length);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(IB)V")
    public final void method201(int arg0, byte arg1) {
        if (arg1 != 7) {
            this.field544 = null;
        }
        class15 var3 = class15.method306(arg0);
        for (int var4 = 0; var4 < var3.field774.length && var3.field774[var4] != -1; ++var4) {
            class15 var5 = class15.method306(var3.field774[var4]);
            if (var5.field818 == 1) {
                this.method201(var5.field809, (byte) 7);
            }
            var5.field761 = 0;
            var5.field749 = 0;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(BILNDGQUJMA;I)V")
    public final void method202(byte arg0, int arg1, class36 arg2, int arg3) {
        if (arg2 != null) {
            int var5 = this.field469 + this.field466 & 2047;
            int var6 = arg1 * arg1 + arg3 * arg3;
            if (var6 <= 6400) {
                int var7 = class65.field1658[var5];
                int var8 = class65.field1659[var5];
                if (arg0 == 103) {
                    int var9 = var7 * 256 / (this.field565 + 256);
                    int var10 = var8 * 256 / (this.field565 + 256);
                    int var11 = arg1 * var10 + arg3 * var9 >> 16;
                    int var12 = arg3 * var10 - arg1 * var9 >> 16;
                    if (var6 > 2500) {
                        arg2.method359(var11 + 94 - arg2.field1081 / 2 + 4, 961, 83 - var12 - arg2.field1082 / 2 - 4, this.field400);
                    } else {
                        arg2.method353(83 - var12 - arg2.field1082 / 2 - 4, (byte) 3, var11 + 94 - arg2.field1081 / 2 + 4);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "u", descriptor = "(I)V")
    public final void method203(int arg0) {
        if (arg0 != 47383) {
            this.field184 = this.field485.method534();
        }
        this.method253(0);
        if (this.field552 == 1) {
            this.field248[this.field551 / 100].method353(this.field550 - 8 - 4, (byte) 3, this.field549 - 8 - 4);
        }
        if (this.field552 == 2) {
            this.field248[this.field551 / 100 + 4].method353(this.field550 - 8 - 4, (byte) 3, this.field549 - 8 - 4);
            ++field239;
            if (field239 > 80) {
                field239 = 0;
                this.field483.method43(0, 171);
            }
        }
        if (this.field521 != -1) {
            this.method287(this.field521, false, this.field628);
            this.method208(0, 0, 0, class15.method306(this.field521), this.field281);
        }
        if (this.field484 != -1) {
            this.method287(this.field484, false, this.field628);
            this.method208(0, 0, 0, class15.method306(this.field484), this.field281);
        }
        this.method159(0);
        if (!this.field310) {
            this.method240(13173);
            this.method255(4);
        } else if (this.field330 == 0) {
            this.method184(31290);
        }
        if (this.field199 == 1) {
            this.field291.method353(296, (byte) 3, 472);
        }
        if (field175) {
            short var2 = 507;
            byte var3 = 20;
            int var4 = 16776960;
            if (super.field1429 < 30 && field374) {
                var4 = 16711680;
            }
            if (super.field1429 < 20 && !field374) {
                var4 = 16711680;
            }
            this.field325.method95(this.field223, var4, "Fps:" + super.field1429, var3, var2);
            int var13 = var3 + 15;
            Runtime var5 = Runtime.getRuntime();
            int var6 = (int) ((var5.totalMemory() - var5.freeMemory()) / 1024L);
            int var7 = 16776960;
            if (var6 > 33554432 && field374) {
                int var8 = 16711680;
            }
            if (var6 > 67108864 && !field374) {
                int var9 = 16711680;
            }
            this.field325.method95(this.field223, 16776960, "Mem:" + var6 + "k", var13, var2);
            var13 += 15;
        }
        if (this.field238 != 0) {
            int var10 = this.field238 / 50;
            int var11 = var10 / 60;
            int var12 = var10 % 60;
            if (var12 < 10) {
                this.field325.method100(329, "System update in: " + var11 + ":0" + var12, 20424, 4, 16776960);
            } else {
                this.field325.method100(329, "System update in: " + var11 + ":" + var12, 20424, 4, 16776960);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        return signlink.mainapp != null ? signlink.mainapp.getAppletContext() : super.getAppletContext();
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ZJ)V")
    public final void method204(boolean arg0, long arg1) {
        if (arg1 != 0L) {
            if (this.field498 >= 100) {
                this.method192("", "Your ignore list is full. Max of 100 hit", 0, this.field369);
            } else {
                String var4 = class29.method327(class29.method324(true, arg1), (byte) 58);
                for (int var5 = 0; var5 < this.field498; ++var5) {
                    if (this.field269[var5] == arg1) {
                        this.method192("", var4 + " is already on your ignore list", 0, this.field369);
                        return;
                    }
                }
                if (arg0) {
                    this.field640 = -136;
                }
                for (int var6 = 0; var6 < this.field493; ++var6) {
                    if (this.field189[var6] == arg1) {
                        this.method192("", "Please remove " + var4 + " from your friend list first", 0, this.field369);
                        return;
                    }
                }
                this.field269[this.field498++] = arg1;
                this.field501 = true;
                this.field483.method43(0, 233);
                this.field483.method50(this.field642, arg1);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V")
    public final void method205(int arg0, int arg1) {
        if (arg1 < 0) {
            class15.method308(arg0, -964);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(II)Z")
    public final boolean method206(int arg0, int arg1) {
        if (arg0 < 1 || arg0 > 1) {
            this.field233 = -1;
        }
        if (arg1 < 0) {
            return false;
        } else {
            int var3 = this.field180[arg1];
            if (var3 >= 2000) {
                var3 -= 2000;
            }
            return var3 == 106;
        }
    }

    @OriginalMember(owner = "client!client", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        if (signlink.mainapp != null) {
            return signlink.mainapp.getCodeBase();
        } else {
            try {
                if (super.field1436 != null) {
                    return new URL("http://127.0.0.1:" + (field372 + 80));
                }
            } catch (Exception var1) {
            }
            return super.getCodeBase();
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIILFMDWWBSX;II)V")
    public final void method207(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class15 arg6, int arg7, int arg8) {
        if (this.field270) {
            this.field309 = 32;
        } else {
            this.field309 = 0;
        }
        this.field270 = false;
        while (arg0 >= 0) {
            this.field483.method44(221);
        }
        if (arg8 >= arg1 && arg8 < arg1 + 16 && arg5 >= arg7 && arg5 < arg7 + 16) {
            arg6.field819 -= this.field582 * 4;
            if (arg4 == 1) {
                this.field501 = true;
            }
            if (arg4 == 2 || arg4 == 3) {
                this.field226 = true;
            }
        } else if (arg8 >= arg1 && arg8 < arg1 + 16 && arg5 >= arg3 + arg7 - 16 && arg5 < arg3 + arg7) {
            arg6.field819 += this.field582 * 4;
            if (arg4 == 1) {
                this.field501 = true;
            }
            if (arg4 == 2 || arg4 == 3) {
                this.field226 = true;
            }
        } else if (arg8 >= arg1 - this.field309 && arg8 < arg1 + 16 + this.field309 && arg5 >= arg7 + 16 && arg5 < arg3 + arg7 - 16 && this.field582 > 0) {
            int var10 = (arg3 - 32) * arg3 / arg2;
            if (var10 < 8) {
                var10 = 8;
            }
            int var11 = arg5 - arg7 - 16 - var10 / 2;
            int var12 = arg3 - 32 - var10;
            arg6.field819 = (arg2 - arg3) * var11 / var12;
            if (arg4 == 1) {
                this.field501 = true;
            }
            if (arg4 == 2 || arg4 == 3) {
                this.field226 = true;
            }
            this.field270 = true;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIILFMDWWBSX;Z)V")
    public final void method208(int arg0, int arg1, int arg2, class15 arg3, boolean arg4) {
        if (arg3.field818 == 0 && arg3.field774 != null) {
            if (!arg3.field796 || this.field555 == arg3.field809 || this.field271 == arg3.field809 || this.field402 == arg3.field809) {
                int var6 = class8.field156;
                int var7 = class8.field154;
                int var8 = class8.field157;
                int var9 = class8.field155;
                this.field250 &= arg4;
                class8.method140(arg1, true, arg2, arg3.field781 + arg1, arg3.field776 + arg2);
                int var10 = arg3.field774.length;
                for (int var11 = 0; var11 < var10; ++var11) {
                    int var12 = arg3.field744[var11] + arg1;
                    int var13 = arg3.field817[var11] + arg2 - arg0;
                    class15 var14 = class15.method306(arg3.field774[var11]);
                    int var15 = var14.field800 + var12;
                    int var16 = var14.field786 + var13;
                    if (var14.field805 > 0) {
                        this.method156(2, var14);
                    }
                    if (var14.field818 == 0) {
                        if (var14.field819 > var14.field791 - var14.field776) {
                            var14.field819 = var14.field791 - var14.field776;
                        }
                        if (var14.field819 < 0) {
                            var14.field819 = 0;
                        }
                        this.method208(var14.field819, var15, var16, var14, this.field281);
                        if (var14.field791 > var14.field776) {
                            this.method292(var14.field781 + var15, var16, this.field482, var14.field819, var14.field791, var14.field776);
                        }
                    } else if (var14.field818 != 1) {
                        if (var14.field818 == 2) {
                            int var17 = 0;
                            for (int var18 = 0; var18 < var14.field776; ++var18) {
                                for (int var19 = 0; var19 < var14.field781; ++var19) {
                                    int var20 = (var14.field752 + 32) * var19 + var15;
                                    int var21 = (var14.field782 + 32) * var18 + var16;
                                    if (var17 < 20) {
                                        var20 += var14.field801[var17];
                                        var21 += var14.field780[var17];
                                    }
                                    if (var14.field747[var17] <= 0) {
                                        if (var14.field792 != null && var17 < 20) {
                                            class36 var30 = var14.field792[var17];
                                            if (var30 != null) {
                                                var30.method353(var21, (byte) 3, var20);
                                            }
                                        }
                                    } else {
                                        int var22 = 0;
                                        int var23 = 0;
                                        int var24 = var14.field747[var17] - 1;
                                        if (var20 > class8.field156 - 32 && var20 < class8.field157 && var21 > class8.field154 - 32 && var21 < class8.field155 || this.field393 != 0 && this.field392 == var17) {
                                            int var25 = 0;
                                            if (this.field532 == 1 && this.field533 == var17 && this.field534 == var14.field809) {
                                                var25 = 16777215;
                                            }
                                            class36 var26 = class45.method457(var25, var24, var14.field790[var17], 524);
                                            if (var26 != null) {
                                                if (this.field393 != 0 && this.field392 == var17 && this.field391 == var14.field809) {
                                                    var22 = super.field1441 - this.field394;
                                                    var23 = super.field1442 - this.field395;
                                                    if (var22 < 5 && var22 > -5) {
                                                        var22 = 0;
                                                    }
                                                    if (var23 < 5 && var23 > -5) {
                                                        var23 = 0;
                                                    }
                                                    if (this.field246 < 5) {
                                                        var22 = 0;
                                                        var23 = 0;
                                                    }
                                                    var26.method355(128, var21 + var23, (byte) 1, var20 + var22);
                                                    if (var21 + var23 < class8.field154 && arg3.field819 > 0) {
                                                        int var27 = (class8.field154 - var21 - var23) * this.field628 / 3;
                                                        if (var27 > this.field628 * 10) {
                                                            var27 = this.field628 * 10;
                                                        }
                                                        if (var27 > arg3.field819) {
                                                            var27 = arg3.field819;
                                                        }
                                                        arg3.field819 -= var27;
                                                        this.field395 += var27;
                                                    }
                                                    if (var21 + var23 + 32 > class8.field155 && arg3.field819 < arg3.field791 - arg3.field776) {
                                                        int var28 = (var21 + var23 + 32 - class8.field155) * this.field628 / 3;
                                                        if (var28 > this.field628 * 10) {
                                                            var28 = this.field628 * 10;
                                                        }
                                                        if (var28 > arg3.field791 - arg3.field776 - arg3.field819) {
                                                            var28 = arg3.field791 - arg3.field776 - arg3.field819;
                                                        }
                                                        arg3.field819 += var28;
                                                        this.field395 -= var28;
                                                    }
                                                } else if (this.field526 != 0 && this.field525 == var17 && this.field524 == var14.field809) {
                                                    var26.method355(128, var21, (byte) 1, var20);
                                                } else {
                                                    var26.method353(var21, (byte) 3, var20);
                                                }
                                                if (var26.field1081 == 33 || var14.field790[var17] != 1) {
                                                    int var29 = var14.field790[var17];
                                                    this.field324.method100(var21 + 10 + var23, method197(var29, true), 20424, var20 + 1 + var22, 0);
                                                    this.field324.method100(var21 + 9 + var23, method197(var29, true), 20424, var20 + var22, 16776960);
                                                }
                                            }
                                        }
                                    }
                                    ++var17;
                                }
                            }
                        } else if (var14.field818 == 3) {
                            boolean var31 = false;
                            if (this.field402 == var14.field809 || this.field271 == var14.field809 || this.field555 == var14.field809) {
                                var31 = true;
                            }
                            int var32;
                            if (this.method194(var14, this.field357)) {
                                var32 = var14.field757;
                                if (var31 && var14.field812 != 0) {
                                    var32 = var14.field812;
                                }
                            } else {
                                var32 = var14.field748;
                                if (var31 && var14.field789 != 0) {
                                    var32 = var14.field789;
                                }
                            }
                            if (var14.field754 == 0) {
                                if (var14.field808) {
                                    class8.method143(var32, var15, var16, var14.field781, var14.field776, false);
                                } else {
                                    class8.method144(var16, var32, 264, var15, var14.field776, var14.field781);
                                }
                            } else if (var14.field808) {
                                class8.method142(var14.field776, var32, var15, var14.field781, var16, 256 - (var14.field754 & 255), 0);
                            } else {
                                class8.method145(var14.field781, var15, var16, var14.field776, 256 - (var14.field754 & 255), 936, var32);
                            }
                        } else if (var14.field818 == 4) {
                            class5 var33 = var14.field807;
                            String var34 = var14.field764;
                            boolean var35 = false;
                            if (this.field402 == var14.field809 || this.field271 == var14.field809 || this.field555 == var14.field809) {
                                var35 = true;
                            }
                            int var36;
                            if (this.method194(var14, this.field357)) {
                                var36 = var14.field757;
                                if (var35 && var14.field812 != 0) {
                                    var36 = var14.field812;
                                }
                                if (var14.field797.length() > 0) {
                                    var34 = var14.field797;
                                }
                            } else {
                                var36 = var14.field748;
                                if (var35 && var14.field789 != 0) {
                                    var36 = var14.field789;
                                }
                            }
                            if (var14.field816 == 6 && this.field295) {
                                var34 = "Please wait...";
                                var36 = var14.field748;
                            }
                            if (class8.field152 == 479) {
                                if (var36 == 16776960) {
                                    var36 = 255;
                                }
                                if (var36 == 49152) {
                                    var36 = 16777215;
                                }
                            }
                            int var37 = var33.field89 + var16;
                            while (var34.length() > 0) {
                                if (var34.indexOf("%") != -1) {
                                    label389: while (true) {
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
                                                                            break label389;
                                                                        }
                                                                        var34 = var34.substring(0, var42) + this.method239(723, this.method244(this.field462, var14, 4)) + var34.substring(var42 + 2);
                                                                    }
                                                                }
                                                                var34 = var34.substring(0, var41) + this.method239(723, this.method244(this.field462, var14, 3)) + var34.substring(var41 + 2);
                                                            }
                                                        }
                                                        var34 = var34.substring(0, var40) + this.method239(723, this.method244(this.field462, var14, 2)) + var34.substring(var40 + 2);
                                                    }
                                                }
                                                var34 = var34.substring(0, var39) + this.method239(723, this.method244(this.field462, var14, 1)) + var34.substring(var39 + 2);
                                            }
                                        }
                                        var34 = var34.substring(0, var38) + this.method239(723, this.method244(this.field462, var14, 0)) + var34.substring(var38 + 2);
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
                                if (var14.field768) {
                                    var33.method97(var14.field759, var44, -930, var36, var37, var14.field781 / 2 + var15);
                                } else {
                                    var33.method104(var14.field759, var37, var15, var36, var44, 4);
                                }
                                var37 += var33.field89;
                            }
                        } else if (var14.field818 == 5) {
                            class36 var45;
                            if (this.method194(var14, this.field357)) {
                                var45 = var14.field784;
                            } else {
                                var45 = var14.field815;
                            }
                            if (var45 != null) {
                                var45.method353(var16, (byte) 3, var15);
                            }
                        } else if (var14.field818 == 6) {
                            int var46 = class42.field1206;
                            int var47 = class42.field1207;
                            class42.field1206 = var14.field781 / 2 + var15;
                            class42.field1207 = var14.field776 / 2 + var16;
                            int var48 = class42.field1210[var14.field803] * var14.field802 >> 16;
                            int var49 = class42.field1211[var14.field803] * var14.field802 >> 16;
                            boolean var50 = this.method194(var14, this.field357);
                            int var51;
                            if (var50) {
                                var51 = var14.field788;
                            } else {
                                var51 = var14.field787;
                            }
                            class65 var52;
                            if (var51 == -1) {
                                var52 = var14.method304(-1, 1, -1, var50);
                            } else {
                                class50 var53 = class50.field1392[var51];
                                var52 = var14.method304(var53.field1395[var14.field761], 1, var53.field1394[var14.field761], var50);
                            }
                            if (var52 != null) {
                                var52.method562(0, var14.field804, 0, var14.field803, 0, var48, var49);
                            }
                            class42.field1206 = var46;
                            class42.field1207 = var47;
                        } else {
                            if (var14.field818 == 7) {
                                class5 var54 = var14.field807;
                                int var55 = 0;
                                for (int var56 = 0; var56 < var14.field776; ++var56) {
                                    for (int var57 = 0; var57 < var14.field781; ++var57) {
                                        if (var14.field747[var55] > 0) {
                                            class45 var58 = class45.method456(var14.field747[var55] - 1);
                                            String var59 = String.valueOf(var58.field1269);
                                            if (var58.field1255 || var14.field790[var55] != 1) {
                                                var59 = var59 + " x" + method179(var14.field790[var55], (byte) -14);
                                            }
                                            int var60 = (var14.field752 + 115) * var57 + var15;
                                            int var61 = (var14.field782 + 12) * var56 + var16;
                                            if (var14.field768) {
                                                var54.method97(var14.field759, var59, -930, var14.field748, var61, var14.field781 / 2 + var60);
                                            } else {
                                                var54.method104(var14.field759, var61, var60, var14.field748, var59, 4);
                                            }
                                        }
                                        ++var55;
                                    }
                                }
                            }
                            if (var14.field818 == 8 && (this.field174 == var14.field809 || this.field228 == var14.field809 || this.field276 == var14.field809) && this.field274 == 100) {
                                int var62 = 0;
                                int var63 = 0;
                                class5 var64 = this.field325;
                                String var65 = var14.field764;
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
                                    int var74 = var64.method98(var73, 2);
                                    if (var74 > var62) {
                                        var62 = var74;
                                    }
                                    var63 += var64.field89 + 1;
                                }
                                var62 += 6;
                                var63 += 7;
                                int var66 = var14.field781 + var15 - 5 - var62;
                                int var67 = var14.field776 + var16 + 5;
                                if (var66 < var15 + 5) {
                                    var66 = var15 + 5;
                                }
                                if (var62 + var66 > arg3.field781 + arg1) {
                                    var66 = arg3.field781 + arg1 - var62;
                                }
                                if (var63 + var67 > arg3.field776 + arg2) {
                                    var67 = arg3.field776 + arg2 - var63;
                                }
                                class8.method143(16777120, var66, var67, var62, var63, false);
                                class8.method144(var67, 0, 264, var66, var63, var62);
                                String var68 = var14.field764;
                                int var69 = var64.field89 + var67 + 2;
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
                                    var64.method104(false, var69, var66 + 3, 0, var71, 4);
                                    var69 += var64.field89 + 1;
                                }
                            }
                        }
                    }
                }
                class8.method140(var6, true, var7, var8, var9);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(LFMDWWBSX;I)Z")
    public final boolean method209(class15 arg0, int arg1) {
        if (arg1 >= 2 && arg1 <= 2) {
            int var3 = arg0.field805;
            if (this.field494 == 2) {
                if (var3 == 201) {
                    this.field226 = true;
                    this.field646 = 0;
                    this.field340 = true;
                    this.field191 = "";
                    this.field657 = 1;
                    this.field222 = "Enter name of friend to add to list";
                }
                if (var3 == 202) {
                    this.field226 = true;
                    this.field646 = 0;
                    this.field340 = true;
                    this.field191 = "";
                    this.field657 = 2;
                    this.field222 = "Enter name of friend to delete from list";
                }
            }
            if (var3 == 205) {
                this.field236 = 250;
                return true;
            } else {
                if (var3 == 501) {
                    this.field226 = true;
                    this.field646 = 0;
                    this.field340 = true;
                    this.field191 = "";
                    this.field657 = 4;
                    this.field222 = "Enter name of player to add to list";
                }
                if (var3 == 502) {
                    this.field226 = true;
                    this.field646 = 0;
                    this.field340 = true;
                    this.field191 = "";
                    this.field657 = 5;
                    this.field222 = "Enter name of player to delete from list";
                }
                if (var3 >= 300 && var3 <= 313) {
                    int var4 = (var3 - 300) / 2;
                    int var5 = var3 & 1;
                    int var6 = this.field641[var4];
                    if (var6 != -1) {
                        while (true) {
                            if (var5 == 0) {
                                --var6;
                                if (var6 < 0) {
                                    var6 = class39.field1111 - 1;
                                }
                            }
                            if (var5 == 1) {
                                ++var6;
                                if (var6 >= class39.field1111) {
                                    var6 = 0;
                                }
                            }
                            if (!class39.field1112[var6].field1118 && class39.field1112[var6].field1113 == var4 + (this.field541 ? 0 : 7)) {
                                this.field641[var4] = var6;
                                this.field606 = true;
                                break;
                            }
                        }
                    }
                }
                if (var3 >= 314 && var3 <= 323) {
                    int var7 = (var3 - 314) / 2;
                    int var8 = var3 & 1;
                    int var9 = this.field500[var7];
                    if (var8 == 0) {
                        --var9;
                        if (var9 < 0) {
                            var9 = field615[var7].length - 1;
                        }
                    }
                    if (var8 == 1) {
                        ++var9;
                        if (var9 >= field615[var7].length) {
                            var9 = 0;
                        }
                    }
                    this.field500[var7] = var9;
                    this.field606 = true;
                }
                if (var3 == 324 && !this.field541) {
                    this.field541 = true;
                    this.method288((byte) 2);
                }
                if (var3 == 325 && this.field541) {
                    this.field541 = false;
                    this.method288((byte) 2);
                }
                if (var3 != 326) {
                    if (var3 == 620) {
                        this.field322 = !this.field322;
                    }
                    if (var3 >= 601 && var3 <= 613) {
                        this.method260(true);
                        if (this.field581.length() > 0) {
                            this.field483.method43(0, 139);
                            this.field483.method50(this.field642, class29.method323(this.field581));
                            this.field483.method44(var3 - 601);
                            this.field483.method44(this.field322 ? 1 : 0);
                        }
                    }
                    return false;
                } else {
                    this.field483.method43(0, 163);
                    this.field483.method44(this.field541 ? 0 : 1);
                    for (int var10 = 0; var10 < 7; ++var10) {
                        this.field483.method44(this.field641[var10]);
                    }
                    for (int var11 = 0; var11 < 5; ++var11) {
                        this.field483.method44(this.field500[var11]);
                    }
                    return true;
                }
            }
        } else {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIILFMDWWBSX;I)V")
    public final void method210(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class15 arg6, int arg7) {
        if (arg6.field818 == 0 && arg6.field774 != null && !arg6.field796) {
            if (arg0 >= arg1 && arg3 >= arg2 && arg0 <= arg6.field781 + arg1 && arg3 <= arg6.field776 + arg2) {
                int var9 = arg6.field774.length;
                this.field232 += arg4;
                for (int var10 = 0; var10 < var9; ++var10) {
                    int var11 = arg6.field744[var10] + arg1;
                    int var12 = arg6.field817[var10] + arg2 - arg7;
                    class15 var13 = class15.method306(arg6.field774[var10]);
                    int var14 = var13.field800 + var11;
                    int var15 = var13.field786 + var12;
                    if ((var13.field766 >= 0 || var13.field789 != 0) && arg0 >= var14 && arg3 >= var15 && arg0 < var13.field781 + var14 && arg3 < var13.field776 + var15) {
                        if (var13.field766 >= 0) {
                            this.field455 = var13.field766;
                        } else {
                            this.field455 = var13.field809;
                        }
                    }
                    if (var13.field818 == 8 && arg0 >= var14 && arg3 >= var15 && arg0 < var13.field781 + var14 && arg3 < var13.field776 + var15) {
                        this.field328 = var13.field809;
                    }
                    if (var13.field818 == 0) {
                        this.method210(arg0, var14, var15, arg3, 0, arg5, var13, var13.field819);
                        if (var13.field791 > var13.field776) {
                            this.method207(-535, var13.field781 + var14, var13.field791, var13.field776, arg5, arg3, var13, var15, arg0);
                        }
                    } else {
                        if (var13.field816 == 1 && arg0 >= var14 && arg3 >= var15 && arg0 < var13.field781 + var14 && arg3 < var13.field776 + var15) {
                            boolean var16 = false;
                            if (var13.field805 != 0) {
                                var16 = this.method245(-6429, var13);
                            }
                            if (!var16) {
                                this.field434[this.field344] = var13.field785;
                                this.field180[this.field344] = 253;
                                this.field179[this.field344] = var13.field809;
                                ++this.field344;
                            }
                        }
                        if (var13.field816 == 2 && this.field192 == 0 && arg0 >= var14 && arg3 >= var15 && arg0 < var13.field781 + var14 && arg3 < var13.field776 + var15) {
                            String var17 = var13.field806;
                            if (var17.indexOf(" ") != -1) {
                                var17 = var17.substring(0, var17.indexOf(" "));
                            }
                            this.field434[this.field344] = var17 + " @gre@" + var13.field756;
                            this.field180[this.field344] = 565;
                            this.field179[this.field344] = var13.field809;
                            ++this.field344;
                        }
                        if (var13.field816 == 3 && arg0 >= var14 && arg3 >= var15 && arg0 < var13.field781 + var14 && arg3 < var13.field776 + var15) {
                            this.field434[this.field344] = "Close";
                            if (arg5 == 3) {
                                this.field180[this.field344] = 827;
                            } else {
                                this.field180[this.field344] = 727;
                            }
                            this.field179[this.field344] = var13.field809;
                            ++this.field344;
                        }
                        if (var13.field816 == 4 && arg0 >= var14 && arg3 >= var15 && arg0 < var13.field781 + var14 && arg3 < var13.field776 + var15) {
                            this.field434[this.field344] = var13.field785;
                            this.field180[this.field344] = 125;
                            this.field179[this.field344] = var13.field809;
                            ++this.field344;
                        }
                        if (var13.field816 == 5 && arg0 >= var14 && arg3 >= var15 && arg0 < var13.field781 + var14 && arg3 < var13.field776 + var15) {
                            this.field434[this.field344] = var13.field785;
                            this.field180[this.field344] = 14;
                            this.field179[this.field344] = var13.field809;
                            ++this.field344;
                        }
                        if (var13.field816 == 6 && !this.field295 && arg0 >= var14 && arg3 >= var15 && arg0 < var13.field781 + var14 && arg3 < var13.field776 + var15) {
                            this.field434[this.field344] = var13.field785;
                            this.field180[this.field344] = 683;
                            this.field179[this.field344] = var13.field809;
                            ++this.field344;
                        }
                        if (var13.field818 == 2) {
                            int var18 = 0;
                            for (int var19 = 0; var19 < var13.field776; ++var19) {
                                for (int var20 = 0; var20 < var13.field781; ++var20) {
                                    int var21 = (var13.field752 + 32) * var20 + var14;
                                    int var22 = (var13.field782 + 32) * var19 + var15;
                                    if (var18 < 20) {
                                        var21 += var13.field801[var18];
                                        var22 += var13.field780[var18];
                                    }
                                    if (arg0 >= var21 && arg3 >= var22 && arg0 < var21 + 32 && arg3 < var22 + 32) {
                                        this.field457 = var18;
                                        this.field458 = var13.field809;
                                        if (var13.field747[var18] > 0) {
                                            class45 var23 = class45.method456(var13.field747[var18] - 1);
                                            if (this.field532 == 1 && var13.field767) {
                                                if (this.field534 != var13.field809 || this.field533 != var18) {
                                                    this.field434[this.field344] = "Use " + this.field536 + " with @lre@" + var23.field1269;
                                                    this.field180[this.field344] = 151;
                                                    this.field181[this.field344] = var23.field1257;
                                                    this.field178[this.field344] = var18;
                                                    this.field179[this.field344] = var13.field809;
                                                    ++this.field344;
                                                }
                                            } else if (this.field192 == 1 && var13.field767) {
                                                if ((this.field194 & 16) == 16) {
                                                    this.field434[this.field344] = this.field195 + " @lre@" + var23.field1269;
                                                    this.field180[this.field344] = 817;
                                                    this.field181[this.field344] = var23.field1257;
                                                    this.field178[this.field344] = var18;
                                                    this.field179[this.field344] = var13.field809;
                                                    ++this.field344;
                                                }
                                            } else {
                                                if (var13.field767) {
                                                    for (int var24 = 4; var24 >= 3; --var24) {
                                                        if (var23.field1266 != null && var23.field1266[var24] != null) {
                                                            this.field434[this.field344] = var23.field1266[var24] + " @lre@" + var23.field1269;
                                                            if (var24 == 3) {
                                                                this.field180[this.field344] = 508;
                                                            }
                                                            if (var24 == 4) {
                                                                this.field180[this.field344] = 959;
                                                            }
                                                            this.field181[this.field344] = var23.field1257;
                                                            this.field178[this.field344] = var18;
                                                            this.field179[this.field344] = var13.field809;
                                                            ++this.field344;
                                                        } else if (var24 == 4) {
                                                            this.field434[this.field344] = "Drop @lre@" + var23.field1269;
                                                            this.field180[this.field344] = 959;
                                                            this.field181[this.field344] = var23.field1257;
                                                            this.field178[this.field344] = var18;
                                                            this.field179[this.field344] = var13.field809;
                                                            ++this.field344;
                                                        }
                                                    }
                                                }
                                                if (var13.field793) {
                                                    this.field434[this.field344] = "Use @lre@" + var23.field1269;
                                                    this.field180[this.field344] = 286;
                                                    this.field181[this.field344] = var23.field1257;
                                                    this.field178[this.field344] = var18;
                                                    this.field179[this.field344] = var13.field809;
                                                    ++this.field344;
                                                }
                                                if (var13.field767 && var23.field1266 != null) {
                                                    for (int var25 = 2; var25 >= 0; --var25) {
                                                        if (var23.field1266[var25] != null) {
                                                            this.field434[this.field344] = var23.field1266[var25] + " @lre@" + var23.field1269;
                                                            if (var25 == 0) {
                                                                this.field180[this.field344] = 500;
                                                            }
                                                            if (var25 == 1) {
                                                                this.field180[this.field344] = 360;
                                                            }
                                                            if (var25 == 2) {
                                                                this.field180[this.field344] = 986;
                                                            }
                                                            this.field181[this.field344] = var23.field1257;
                                                            this.field178[this.field344] = var18;
                                                            this.field179[this.field344] = var13.field809;
                                                            ++this.field344;
                                                        }
                                                    }
                                                }
                                                if (var13.field770 != null) {
                                                    for (int var26 = 4; var26 >= 0; --var26) {
                                                        if (var13.field770[var26] != null) {
                                                            this.field434[this.field344] = var13.field770[var26] + " @lre@" + var23.field1269;
                                                            if (var26 == 0) {
                                                                this.field180[this.field344] = 191;
                                                            }
                                                            if (var26 == 1) {
                                                                this.field180[this.field344] = 603;
                                                            }
                                                            if (var26 == 2) {
                                                                this.field180[this.field344] = 972;
                                                            }
                                                            if (var26 == 3) {
                                                                this.field180[this.field344] = 517;
                                                            }
                                                            if (var26 == 4) {
                                                                this.field180[this.field344] = 788;
                                                            }
                                                            this.field181[this.field344] = var23.field1257;
                                                            this.field178[this.field344] = var18;
                                                            this.field179[this.field344] = var13.field809;
                                                            ++this.field344;
                                                        }
                                                    }
                                                }
                                                this.field434[this.field344] = "Examine @lre@" + var23.field1269;
                                                this.field180[this.field344] = 1690;
                                                this.field181[this.field344] = var23.field1257;
                                                this.field178[this.field344] = var18;
                                                this.field179[this.field344] = var13.field809;
                                                ++this.field344;
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

    @OriginalMember(owner = "client!client", name = "v", descriptor = "(I)V")
    public final void method211(int arg0) {
        this.field352.method592(-19705);
        class42.field1212 = this.field488;
        if (this.field316 == arg0) {
            this.field399.method446(0, (byte) 3, 0);
            if (this.field631 != -1) {
                this.method208(0, 0, 0, class15.method306(this.field631), this.field281);
            } else if (this.field473[this.field431] != -1) {
                this.method208(0, 0, 0, class15.method306(this.field473[this.field431]), this.field281);
            }
            if (this.field310 && this.field330 == 1) {
                this.method184(31290);
            }
            this.field352.method593(super.field1433, 553, false, 205);
            this.field354.method592(-19705);
            class42.field1212 = this.field489;
        }
    }

    @OriginalMember(owner = "client!client", name = "w", descriptor = "(I)V")
    public final void method212(int arg0) {
        this.field232 += arg0;
        signlink.midiplay = false;
        signlink.midifade = 0;
        signlink.midi = "stop";
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(II)V")
    public final void method213(int arg0, int arg1) {
        class72 var3 = this.field544[this.field272][arg0][arg1];
        if (var3 == null) {
            this.field306.method394(this.field272, arg0, arg1);
        } else {
            int var4 = -99999999;
            class14 var5 = null;
            for (class14 var6 = (class14) var3.method598(); var6 != null; var6 = (class14) var3.method600(4)) {
                class45 var11 = class45.method456(var6.field738);
                int var12 = var11.field1243;
                if (var11.field1255) {
                    var12 = (var6.field739 + 1) * var12;
                }
                if (var12 > var4) {
                    var4 = var12;
                    var5 = var6;
                }
            }
            var3.method596((byte) 2, var5);
            class14 var7 = null;
            class14 var8 = null;
            for (class14 var9 = (class14) var3.method598(); var9 != null; var9 = (class14) var3.method600(4)) {
                if (var5.field738 != var9.field738 && var7 == null) {
                    var7 = var9;
                }
                if (var5.field738 != var9.field738 && var7.field738 != var9.field738 && var8 == null) {
                    var8 = var9;
                }
            }
            int var10 = (arg1 << 7) + arg0 + 1610612736;
            this.field306.method380(var7, arg1, var10, this.method190(0, arg1 * 128 + 64, this.field272, arg0 * 128 + 64), var8, arg0, 959, this.field272, var5);
        }
    }

    @OriginalMember(owner = "client!client", name = "x", descriptor = "(I)V")
    public final void method214(int arg0) {
        if (arg0 < 6 || arg0 > 6) {
            this.method162();
        }
        if (this.field251 == 2) {
            this.method259(this.field288 * 2, (this.field286 - this.field377 << 7) + this.field289, this.field496, (this.field287 - this.field378 << 7) + this.field290);
            if (this.field576 > -1 && field564 % 20 < 10) {
                this.field656[0].method353(this.field577 - 28, (byte) 3, this.field576 - 12);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(IIII)Z")
    public final boolean method215(int arg0, int arg1, int arg2, int arg3) {
        int var5 = arg1 >> 14 & 32767;
        int var6 = this.field306.method403(this.field272, arg0, arg2, arg1);
        if (var6 == -1) {
            return false;
        } else {
            int var7 = var6 & 31;
            int var8 = var6 >> 6 & 3;
            if (arg3 >= 0) {
                for (int var9 = 1; var9 > 0; ++var9) {
                }
            }
            ++field190;
            if (field190 > 119) {
                field190 = 0;
                this.field483.method43(0, 240);
                this.field483.method44(120);
            }
            if (var7 != 10 && var7 != 11 && var7 != 22) {
                this.method217(var8, 0, arg2, true, (byte) 6, 0, arg0, 2, field623.field905[0], field623.field906[0], 0, var7 + 1);
            } else {
                class68 var10 = class68.method575(var5);
                int var11;
                int var12;
                if (var8 != 0 && var8 != 2) {
                    var11 = var10.field1715;
                    var12 = var10.field1707;
                } else {
                    var11 = var10.field1707;
                    var12 = var10.field1715;
                }
                int var13 = var10.field1725;
                if (var8 != 0) {
                    var13 = (var13 >> 4 - var8) + (var13 << var8 & 15);
                }
                this.method217(0, var13, arg2, true, (byte) 6, var11, arg0, 2, field623.field905[0], field623.field906[0], var12, 0);
            }
            this.field549 = super.field1448;
            this.field550 = super.field1449;
            this.field552 = 2;
            this.field551 = 0;
            return true;
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)V")
    public final void method216(boolean arg0) {
        if (this.field580 != null) {
            this.field580.method124();
        }
        this.field580 = null;
        try {
            if (this.field247 != null) {
                this.field247.method586();
            }
        } catch (Exception var2) {
        }
        this.field247 = null;
        this.field483 = null;
        this.field499 = null;
        this.field404 = null;
        this.field399 = null;
        this.field400 = null;
        this.field401 = null;
        this.field567 = null;
        if (arg0) {
            field448 = -79;
        }
        this.field568 = null;
        this.field569 = null;
        this.field570 = null;
        this.field571 = null;
        if (this.field530 != null) {
            this.field530.field1755 = false;
        }
        this.field530 = null;
        this.field503 = null;
        this.field424 = null;
        this.field504 = null;
        this.field506 = null;
        this.field291 = null;
        this.field360 = null;
        this.field362 = null;
        this.field364 = null;
        this.field365 = null;
        this.field579 = null;
        this.field599 = null;
        this.field204 = null;
        this.field189 = null;
        this.field268 = null;
        this.field528 = null;
        this.field390 = null;
        this.field208 = null;
        this.field209 = null;
        this.field205 = null;
        this.field206 = null;
        this.field207 = null;
        this.field510 = null;
        this.field511 = null;
        this.field512 = null;
        this.field513 = null;
        this.field317 = null;
        this.field318 = null;
        this.field319 = null;
        this.field320 = null;
        this.field321 = null;
        this.field277 = null;
        this.field219 = null;
        this.field491 = null;
        this.field495 = null;
        this.field419 = null;
        this.field420 = null;
        this.field427 = null;
        this.field428 = null;
        this.field538 = null;
        this.method212(0);
        this.field240 = null;
        this.field241 = null;
        this.field242 = null;
        this.field243 = null;
        this.field244 = null;
        this.field618 = null;
        this.field398 = null;
        this.field342 = null;
        this.field619 = null;
        this.field620 = null;
        this.field585 = null;
        this.field629 = null;
        this.field352 = null;
        this.field353 = null;
        this.field354 = null;
        this.field355 = null;
        this.field225 = null;
        this.field508 = null;
        this.field306 = null;
        this.field217 = null;
        this.field514 = null;
        this.field515 = null;
        this.field516 = null;
        this.field517 = null;
        this.field518 = null;
        this.field593 = null;
        this.field643 = null;
        this.field415 = null;
        this.field543 = null;
        this.field656 = null;
        this.field248 = null;
        this.field611 = null;
        this.field612 = null;
        this.field613 = null;
        this.field262 = null;
        this.field263 = null;
        this.field264 = null;
        this.field522 = null;
        this.field544 = null;
        this.field218 = null;
        this.field210 = null;
        this.field211 = null;
        this.field212 = null;
        this.field213 = null;
        this.field178 = null;
        this.field179 = null;
        this.field180 = null;
        this.field181 = null;
        this.field434 = null;
        this.method235((byte) 1);
        class68.method576(this.field562);
        class49.method500(this.field562);
        class45.method451(this.field562);
        class15.method310(this.field562);
        class19.field850 = null;
        class39.field1112 = null;
        class12.field725 = null;
        class50.field1392 = null;
        class9.field662 = null;
        class9.field674 = null;
        class37.field1086 = null;
        super.field1434 = null;
        class22.field928 = null;
        class42.method424(this.field562);
        class41.method372(this.field562);
        class65.method537(this.field562);
        class6.method113(this.field562);
        System.gc();
        if (class30.field1023) {
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIZBIIIIIII)Z")
    public final boolean method217(int arg0, int arg1, int arg2, boolean arg3, byte arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        byte var13 = 104;
        byte var14 = 104;
        for (int var15 = 0; var15 < var13; ++var15) {
            for (int var40 = 0; var40 < var14; ++var40) {
                this.field491[var15][var40] = 0;
                this.field495[var15][var40] = 99999999;
            }
        }
        if (arg4 != 6) {
            throw new NullPointerException();
        } else {
            boolean var16 = false;
            int var17 = arg8;
            int var18 = arg9;
            this.field491[arg8][arg9] = 99;
            this.field495[arg8][arg9] = 0;
            byte var19 = 0;
            int var20 = 0;
            this.field419[var19] = arg8;
            int var41 = var19 + 1;
            this.field420[var19] = arg9;
            boolean var21 = false;
            int var22 = this.field419.length;
            int[][] var23 = this.field217[this.field272].field1336;
            while (var41 != var20) {
                var17 = this.field419[var20];
                var18 = this.field420[var20];
                var20 = (var20 + 1) % var22;
                if (arg6 == var17 && arg2 == var18) {
                    var21 = true;
                    break;
                }
                if (arg11 != 0) {
                    if ((arg11 < 5 || arg11 == 10) && this.field217[this.field272].method492(arg6, arg0, arg11 - 1, arg2, var18, var17, false)) {
                        var21 = true;
                        break;
                    }
                    if (arg11 < 10 && this.field217[this.field272].method493(false, arg0, arg6, arg2, var17, arg11 - 1, var18)) {
                        var21 = true;
                        break;
                    }
                }
                if (arg5 != 0 && arg10 != 0 && this.field217[this.field272].method494(arg10, 0, var18, arg5, var17, arg2, arg6, arg1)) {
                    var21 = true;
                    break;
                }
                int var39 = this.field495[var17][var18] + 1;
                if (var17 > 0 && this.field491[var17 - 1][var18] == 0 && (var23[var17 - 1][var18] & 19398920) == 0) {
                    this.field419[var41] = var17 - 1;
                    this.field420[var41] = var18;
                    var41 = (var41 + 1) % var22;
                    this.field491[var17 - 1][var18] = 2;
                    this.field495[var17 - 1][var18] = var39;
                }
                if (var17 < var13 - 1 && this.field491[var17 + 1][var18] == 0 && (var23[var17 + 1][var18] & 19399040) == 0) {
                    this.field419[var41] = var17 + 1;
                    this.field420[var41] = var18;
                    var41 = (var41 + 1) % var22;
                    this.field491[var17 + 1][var18] = 8;
                    this.field495[var17 + 1][var18] = var39;
                }
                if (var18 > 0 && this.field491[var17][var18 - 1] == 0 && (var23[var17][var18 - 1] & 19398914) == 0) {
                    this.field419[var41] = var17;
                    this.field420[var41] = var18 - 1;
                    var41 = (var41 + 1) % var22;
                    this.field491[var17][var18 - 1] = 1;
                    this.field495[var17][var18 - 1] = var39;
                }
                if (var18 < var14 - 1 && this.field491[var17][var18 + 1] == 0 && (var23[var17][var18 + 1] & 19398944) == 0) {
                    this.field419[var41] = var17;
                    this.field420[var41] = var18 + 1;
                    var41 = (var41 + 1) % var22;
                    this.field491[var17][var18 + 1] = 4;
                    this.field495[var17][var18 + 1] = var39;
                }
                if (var17 > 0 && var18 > 0 && this.field491[var17 - 1][var18 - 1] == 0 && (var23[var17 - 1][var18 - 1] & 19398926) == 0 && (var23[var17 - 1][var18] & 19398920) == 0 && (var23[var17][var18 - 1] & 19398914) == 0) {
                    this.field419[var41] = var17 - 1;
                    this.field420[var41] = var18 - 1;
                    var41 = (var41 + 1) % var22;
                    this.field491[var17 - 1][var18 - 1] = 3;
                    this.field495[var17 - 1][var18 - 1] = var39;
                }
                if (var17 < var13 - 1 && var18 > 0 && this.field491[var17 + 1][var18 - 1] == 0 && (var23[var17 + 1][var18 - 1] & 19399043) == 0 && (var23[var17 + 1][var18] & 19399040) == 0 && (var23[var17][var18 - 1] & 19398914) == 0) {
                    this.field419[var41] = var17 + 1;
                    this.field420[var41] = var18 - 1;
                    var41 = (var41 + 1) % var22;
                    this.field491[var17 + 1][var18 - 1] = 9;
                    this.field495[var17 + 1][var18 - 1] = var39;
                }
                if (var17 > 0 && var18 < var14 - 1 && this.field491[var17 - 1][var18 + 1] == 0 && (var23[var17 - 1][var18 + 1] & 19398968) == 0 && (var23[var17 - 1][var18] & 19398920) == 0 && (var23[var17][var18 + 1] & 19398944) == 0) {
                    this.field419[var41] = var17 - 1;
                    this.field420[var41] = var18 + 1;
                    var41 = (var41 + 1) % var22;
                    this.field491[var17 - 1][var18 + 1] = 6;
                    this.field495[var17 - 1][var18 + 1] = var39;
                }
                if (var17 < var13 - 1 && var18 < var14 - 1 && this.field491[var17 + 1][var18 + 1] == 0 && (var23[var17 + 1][var18 + 1] & 19399136) == 0 && (var23[var17 + 1][var18] & 19399040) == 0 && (var23[var17][var18 + 1] & 19398944) == 0) {
                    this.field419[var41] = var17 + 1;
                    this.field420[var41] = var18 + 1;
                    var41 = (var41 + 1) % var22;
                    this.field491[var17 + 1][var18 + 1] = 12;
                    this.field495[var17 + 1][var18 + 1] = var39;
                }
            }
            this.field609 = 0;
            if (!var21) {
                if (!arg3) {
                    return false;
                }
                int var24 = 1000;
                int var25 = 100;
                byte var26 = 10;
                for (int var27 = arg6 - var26; var27 <= arg6 + var26; ++var27) {
                    for (int var28 = arg2 - var26; var28 <= arg2 + var26; ++var28) {
                        if (var27 >= 0 && var28 >= 0 && var27 < 104 && var28 < 104 && this.field495[var27][var28] < 100) {
                            int var29 = 0;
                            if (var27 < arg6) {
                                var29 = arg6 - var27;
                            } else if (var27 > arg5 + arg6 - 1) {
                                var29 = var27 - (arg5 + arg6 - 1);
                            }
                            int var30 = 0;
                            if (var28 < arg2) {
                                var30 = arg2 - var28;
                            } else if (var28 > arg2 + arg10 - 1) {
                                var30 = var28 - (arg2 + arg10 - 1);
                            }
                            int var31 = var29 * var29 + var30 * var30;
                            if (var31 < var24 || var24 == var31 && this.field495[var27][var28] < var25) {
                                var24 = var31;
                                var25 = this.field495[var27][var28];
                                var17 = var27;
                                var18 = var28;
                            }
                        }
                    }
                }
                if (var24 == 1000) {
                    return false;
                }
                if (arg8 == var17 && arg9 == var18) {
                    return false;
                }
                this.field609 = 1;
            }
            byte var32 = 0;
            this.field419[var32] = var17;
            int var42 = var32 + 1;
            this.field420[var32] = var18;
            int var33;
            int var34 = var33 = this.field491[var17][var18];
            while (arg8 != var17 || arg9 != var18) {
                if (var33 != var34) {
                    var33 = var34;
                    this.field419[var42] = var17;
                    this.field420[var42++] = var18;
                }
                if ((var34 & 2) != 0) {
                    ++var17;
                } else if ((var34 & 8) != 0) {
                    --var17;
                }
                if ((var34 & 1) != 0) {
                    ++var18;
                } else if ((var34 & 4) != 0) {
                    --var18;
                }
                var34 = this.field491[var17][var18];
            }
            if (var42 <= 0) {
                if (arg7 == 1) {
                    return false;
                } else {
                    return true;
                }
            } else {
                int var35 = var42;
                if (var42 > 25) {
                    var35 = 25;
                }
                --var42;
                int var36 = this.field419[var42];
                int var37 = this.field420[var42];
                if (arg7 == 0) {
                    this.field483.method43(0, 129);
                    this.field483.method44(var35 + var35 + 3);
                }
                if (arg7 == 1) {
                    this.field483.method43(0, 132);
                    this.field483.method44(var35 + var35 + 3 + 14);
                }
                if (arg7 == 2) {
                    this.field483.method43(0, 211);
                    this.field483.method44(var35 + var35 + 3);
                }
                this.field483.method72((byte) 116, super.field1451[5] == 1 ? 1 : 0);
                this.field483.method45(this.field378 + var37);
                this.field422 = this.field419[0];
                this.field423 = this.field420[0];
                for (int var38 = 1; var38 < var35; ++var38) {
                    --var42;
                    this.field483.method44(this.field419[var42] - var36);
                    this.field483.method72((byte) 116, this.field420[var42] - var37);
                }
                this.field483.method79(true, this.field377 + var36);
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "y", descriptor = "(I)V")
    public final void method218(int arg0) {
        this.field162 = 0;
        int var2 = 7 / arg0;
        for (int var3 = -1; var3 < this.field505 + this.field361; ++var3) {
            class20 var20;
            if (var3 == -1) {
                var20 = field623;
            } else if (var3 < this.field361) {
                var20 = this.field360[this.field362[var3]];
            } else {
                var20 = this.field504[this.field506[var3 - this.field361]];
            }
            if (var20 != null && var20.method41(122)) {
                if (var20 instanceof class2) {
                    class49 var21 = ((class2) var20).field25;
                    if (var21.field1379 != null) {
                        var21 = var21.method504(0);
                    }
                    if (var21 == null) {
                        continue;
                    }
                }
                if (var3 >= this.field361) {
                    class49 var24 = ((class2) var20).field25;
                    if (var24.field1382 >= 0 && var24.field1382 < this.field543.length) {
                        this.method258(var20, 0, var20.field918 + 15);
                        if (this.field576 > -1) {
                            this.field543[var24.field1382].method353(this.field577 - 30, (byte) 3, this.field576 - 12);
                        }
                    }
                    if (this.field251 == 1 && this.field506[var3 - this.field361] == this.field227 && field564 % 20 < 10) {
                        this.method258(var20, 0, var20.field918 + 15);
                        if (this.field576 > -1) {
                            this.field656[0].method353(this.field577 - 28, (byte) 3, this.field576 - 12);
                        }
                    }
                } else {
                    int var22 = 30;
                    class22 var23 = (class22) var20;
                    if (var23.field930 != -1 || var23.field938 != -1) {
                        this.method258(var20, 0, var20.field918 + 15);
                        if (this.field576 > -1) {
                            if (var23.field930 != -1) {
                                this.field415[var23.field930].method353(this.field577 - var22, (byte) 3, this.field576 - 12);
                                var22 += 25;
                            }
                            if (var23.field938 != -1) {
                                this.field543[var23.field938].method353(this.field577 - var22, (byte) 3, this.field576 - 12);
                                var22 += 25;
                            }
                        }
                    }
                    if (var3 >= 0 && this.field251 == 10 && this.field362[var3] == this.field464) {
                        this.method258(var20, 0, var20.field918 + 15);
                        if (this.field576 > -1) {
                            this.field656[1].method353(this.field577 - var22, (byte) 3, this.field576 - 12);
                        }
                    }
                }
                if (var20.field916 != null && (var3 >= this.field361 || this.field614 == 0 || this.field614 == 3 || this.field614 == 1 && this.method247((byte) 7, ((class22) var20).field953))) {
                    this.method258(var20, 0, var20.field918);
                    if (this.field576 > -1 && this.field162 < this.field163) {
                        this.field167[this.field162] = this.field326.method99(var20.field916, 0) / 2;
                        this.field166[this.field162] = this.field326.field89;
                        this.field164[this.field162] = this.field576;
                        this.field165[this.field162] = this.field577;
                        this.field168[this.field162] = var20.field876;
                        this.field169[this.field162] = var20.field887;
                        this.field170[this.field162] = var20.field908;
                        this.field171[this.field162++] = var20.field916;
                        if (this.field329 == 0 && var20.field887 >= 1 && var20.field887 <= 3) {
                            this.field166[this.field162] += 10;
                            this.field165[this.field162] += 5;
                        }
                        if (this.field329 == 0 && var20.field887 == 4) {
                            this.field167[this.field162] = 60;
                        }
                        if (this.field329 == 0 && var20.field887 == 5) {
                            this.field166[this.field162] += 5;
                        }
                    }
                }
                if (var20.field909 > field564) {
                    this.method258(var20, 0, var20.field918 + 15);
                    if (this.field576 > -1) {
                        int var25 = var20.field910 * 30 / var20.field911;
                        if (var25 > 30) {
                            var25 = 30;
                        }
                        class8.method143(65280, this.field576 - 15, this.field577 - 3, var25, 5, false);
                        class8.method143(16711680, this.field576 - 15 + var25, this.field577 - 3, 30 - var25, 5, false);
                    }
                }
                for (int var26 = 0; var26 < 4; ++var26) {
                    if (var20.field879[var26] > field564) {
                        this.method258(var20, 0, var20.field918 / 2);
                        if (this.field576 > -1) {
                            if (var26 == 1) {
                                this.field577 -= 20;
                            }
                            if (var26 == 2) {
                                this.field576 -= 15;
                                this.field577 -= 10;
                            }
                            if (var26 == 3) {
                                this.field576 += 15;
                                this.field577 -= 10;
                            }
                            this.field643[var20.field878[var26]].method353(this.field577 - 12, (byte) 3, this.field576 - 12);
                            this.field324.method96(this.field577 + 4, (byte) 8, 0, String.valueOf(var20.field877[var26]), this.field576);
                            this.field324.method96(this.field577 + 3, (byte) 8, 16777215, String.valueOf(var20.field877[var26]), this.field576 - 1);
                        }
                    }
                }
            }
        }
        for (int var4 = 0; var4 < this.field162; ++var4) {
            int var5 = this.field164[var4];
            int var6 = this.field165[var4];
            int var7 = this.field167[var4];
            int var8 = this.field166[var4];
            boolean var9 = true;
            while (var9) {
                var9 = false;
                for (int var19 = 0; var19 < var4; ++var19) {
                    if (var6 + 2 > this.field165[var19] - this.field166[var19] && var6 - var8 < this.field165[var19] + 2 && var5 - var7 < this.field167[var19] + this.field164[var19] && var5 + var7 > this.field164[var19] - this.field167[var19] && this.field165[var19] - this.field166[var19] < var6) {
                        var6 = this.field165[var19] - this.field166[var19];
                        var9 = true;
                    }
                }
            }
            this.field576 = this.field164[var4];
            this.field577 = this.field165[var4] = var6;
            String var10 = this.field171[var4];
            if (this.field329 == 0) {
                int var11 = 16776960;
                if (this.field168[var4] < 6) {
                    var11 = this.field622[this.field168[var4]];
                }
                if (this.field168[var4] == 6) {
                    var11 = this.field187 % 20 < 10 ? 16711680 : 16776960;
                }
                if (this.field168[var4] == 7) {
                    var11 = this.field187 % 20 < 10 ? 255 : 65535;
                }
                if (this.field168[var4] == 8) {
                    var11 = this.field187 % 20 < 10 ? 45056 : 8454016;
                }
                if (this.field168[var4] == 9) {
                    int var12 = 150 - this.field170[var4];
                    if (var12 < 50) {
                        var11 = var12 * 1280 + 16711680;
                    } else if (var12 < 100) {
                        var11 = 16776960 - (var12 - 50) * 327680;
                    } else if (var12 < 150) {
                        var11 = (var12 - 100) * 5 + 65280;
                    }
                }
                if (this.field168[var4] == 10) {
                    int var13 = 150 - this.field170[var4];
                    if (var13 < 50) {
                        var11 = var13 * 5 + 16711680;
                    } else if (var13 < 100) {
                        var11 = 16711935 - (var13 - 50) * 327680;
                    } else if (var13 < 150) {
                        var11 = (var13 - 100) * 327680 + 255 - (var13 - 100) * 5;
                    }
                }
                if (this.field168[var4] == 11) {
                    int var14 = 150 - this.field170[var4];
                    if (var14 < 50) {
                        var11 = 16777215 - var14 * 327685;
                    } else if (var14 < 100) {
                        var11 = (var14 - 50) * 327685 + 65280;
                    } else if (var14 < 150) {
                        var11 = 16777215 - (var14 - 100) * 327680;
                    }
                }
                if (this.field169[var4] == 0) {
                    this.field326.method96(this.field577 + 1, (byte) 8, 0, var10, this.field576);
                    this.field326.method96(this.field577, (byte) 8, var11, var10, this.field576);
                }
                if (this.field169[var4] == 1) {
                    this.field326.method101(this.field577 + 1, var10, this.field576, this.field187, 0, 0);
                    this.field326.method101(this.field577, var10, this.field576, this.field187, 0, var11);
                }
                if (this.field169[var4] == 2) {
                    this.field326.method102(this.field187, 938, this.field577 + 1, 0, this.field576, var10);
                    this.field326.method102(this.field187, 938, this.field577, var11, this.field576, var10);
                }
                if (this.field169[var4] == 3) {
                    this.field326.method103(150 - this.field170[var4], this.field300, 0, this.field576, this.field577 + 1, var10, this.field187);
                    this.field326.method103(150 - this.field170[var4], this.field300, var11, this.field576, this.field577, var10, this.field187);
                }
                if (this.field169[var4] == 4) {
                    int var15 = this.field326.method99(var10, 0);
                    int var16 = (150 - this.field170[var4]) * (var15 + 100) / 150;
                    class8.method140(this.field576 - 50, true, 0, this.field576 + 50, 334);
                    this.field326.method100(this.field577 + 1, var10, 20424, this.field576 + 50 - var16, 0);
                    this.field326.method100(this.field577, var10, 20424, this.field576 + 50 - var16, var11);
                    class8.method139(0);
                }
                if (this.field169[var4] == 5) {
                    int var17 = 150 - this.field170[var4];
                    int var18 = 0;
                    if (var17 < 25) {
                        var18 = var17 - 25;
                    } else if (var17 > 125) {
                        var18 = var17 - 125;
                    }
                    class8.method140(0, true, this.field577 - this.field326.field89 - 1, 512, this.field577 + 5);
                    this.field326.method96(this.field577 + 1 + var18, (byte) 8, 0, var10, this.field576);
                    this.field326.method96(this.field577 + var18, (byte) 8, var11, var10, this.field576);
                    class8.method139(0);
                }
            } else {
                this.field326.method96(this.field577 + 1, (byte) 8, 0, var10, this.field576);
                this.field326.method96(this.field577, (byte) 8, 16776960, var10, this.field576);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "z", descriptor = "(I)V")
    public final void method219(int arg0) {
        short var2 = 256;
        if (this.field603 > 0) {
            for (int var3 = 0; var3 < 256; ++var3) {
                if (this.field603 > 768) {
                    this.field348[var3] = this.method282(this.field350[var3], 47, this.field349[var3], 1024 - this.field603);
                } else if (this.field603 > 256) {
                    this.field348[var3] = this.field350[var3];
                } else {
                    this.field348[var3] = this.method282(this.field349[var3], 47, this.field350[var3], 256 - this.field603);
                }
            }
        } else if (this.field604 > 0) {
            for (int var4 = 0; var4 < 256; ++var4) {
                if (this.field604 > 768) {
                    this.field348[var4] = this.method282(this.field351[var4], 47, this.field349[var4], 1024 - this.field604);
                } else if (this.field604 > 256) {
                    this.field348[var4] = this.field351[var4];
                } else {
                    this.field348[var4] = this.method282(this.field349[var4], 47, this.field351[var4], 256 - this.field604);
                }
            }
        } else {
            for (int var5 = 0; var5 < 256; ++var5) {
                this.field348[var5] = this.field349[var5];
            }
        }
        for (int var6 = 0; var6 < 33920; ++var6) {
            this.field208.field1757[var6] = this.field547.field1076[var6];
        }
        int var7 = 0;
        int var8 = 1152;
        for (int var9 = 1; var9 < var2 - 1; ++var9) {
            int var24 = (var2 - var9) * this.field403[var9] / var2;
            int var25 = var24 + 22;
            if (var25 < 0) {
                var25 = 0;
            }
            var7 += var25;
            for (int var26 = var25; var26 < 128; ++var26) {
                int var27 = this.field449[var7++];
                if (var27 != 0) {
                    int var29 = 256 - var27;
                    int var30 = this.field348[var27];
                    int var31 = this.field208.field1757[var8];
                    this.field208.field1757[var8++] = ((var30 & 16711935) * var27 + (var31 & 16711935) * var29 & -16711936) + ((var30 & 65280) * var27 + (var31 & 65280) * var29 & 16711680) >> 8;
                } else {
                    ++var8;
                }
            }
            var8 += var25;
        }
        this.field208.method593(super.field1433, 0, false, 0);
        int var10 = 71 / arg0;
        for (int var11 = 0; var11 < 33920; ++var11) {
            this.field209.field1757[var11] = this.field548.field1076[var11];
        }
        int var12 = 0;
        int var13 = 1176;
        for (int var14 = 1; var14 < var2 - 1; ++var14) {
            int var15 = (var2 - var14) * this.field403[var14] / var2;
            int var16 = 103 - var15;
            int var17 = var13 + var15;
            for (int var18 = 0; var18 < var16; ++var18) {
                int var19 = this.field449[var12++];
                if (var19 != 0) {
                    int var21 = 256 - var19;
                    int var22 = this.field348[var19];
                    int var23 = this.field209.field1757[var17];
                    this.field209.field1757[var17++] = ((var22 & 16711935) * var19 + (var23 & 16711935) * var21 & -16711936) + ((var22 & 65280) * var19 + (var23 & 65280) * var21 & 16711680) >> 8;
                } else {
                    ++var17;
                }
            }
            var12 += 128 - var16;
            var13 = 128 - var16 - var15 + var17;
        }
        this.field209.method593(super.field1433, 637, false, 0);
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
    public final void method220(byte arg0) {
        this.field353.method592(-19705);
        if (this.field296 == 2) {
            byte[] var2 = this.field400.field1233;
            int[] var3 = class8.field151;
            int var4 = var2.length;
            for (int var5 = 0; var5 < var4; ++var5) {
                if (var2[var5] == 0) {
                    var3[var5] = 0;
                }
            }
            this.field593.method357(454, this.field301, 25, this.field469, 0, 256, this.field279, 33, 0, 25, 33);
            this.field354.method592(-19705);
            class42.field1212 = this.field489;
        } else {
            int var6 = this.field469 + this.field466 & 2047;
            int var7 = field623.field884 / 32 + 48;
            if (arg0 != 0) {
                this.field483.method44(204);
            }
            int var8 = 464 - field623.field885 / 32;
            this.field424.method357(454, this.field188, var7, var6, 5, this.field565 + 256, this.field435, 151, 25, var8, 146);
            this.field593.method357(454, this.field301, 25, this.field469, 0, 256, this.field279, 33, 0, 25, 33);
            for (int var9 = 0; var9 < this.field426; ++var9) {
                int var39 = this.field427[var9] * 4 + 2 - field623.field884 / 32;
                int var40 = this.field428[var9] * 4 + 2 - field623.field885 / 32;
                this.method202((byte) 103, var39, this.field538[var9], var40);
            }
            for (int var10 = 0; var10 < 104; ++var10) {
                for (int var35 = 0; var35 < 104; ++var35) {
                    class72 var36 = this.field544[this.field272][var10][var35];
                    if (var36 != null) {
                        int var37 = var10 * 4 + 2 - field623.field884 / 32;
                        int var38 = var35 * 4 + 2 - field623.field885 / 32;
                        this.method202((byte) 103, var37, this.field317, var38);
                    }
                }
            }
            for (int var11 = 0; var11 < this.field505; ++var11) {
                class2 var31 = this.field504[this.field506[var11]];
                if (var31 != null && var31.method41(122)) {
                    class49 var32 = var31.field25;
                    if (var32.field1379 != null) {
                        var32 = var32.method504(0);
                    }
                    if (var32 != null && var32.field1349 && var32.field1359) {
                        int var33 = var31.field884 / 32 - field623.field884 / 32;
                        int var34 = var31.field885 / 32 - field623.field885 / 32;
                        this.method202((byte) 103, var33, this.field318, var34);
                    }
                }
            }
            for (int var12 = 0; var12 < this.field361; ++var12) {
                class22 var23 = this.field360[this.field362[var12]];
                if (var23 != null && var23.method41(122)) {
                    int var24 = var23.field884 / 32 - field623.field884 / 32;
                    int var25 = var23.field885 / 32 - field623.field885 / 32;
                    boolean var26 = false;
                    long var27 = class29.method323(var23.field953);
                    for (int var29 = 0; var29 < this.field493; ++var29) {
                        if (this.field189[var29] == var27 && this.field268[var29] != 0) {
                            var26 = true;
                            break;
                        }
                    }
                    boolean var30 = false;
                    if (field623.field927 != 0 && var23.field927 != 0 && field623.field927 == var23.field927) {
                        var30 = true;
                    }
                    if (var26) {
                        this.method202((byte) 103, var24, this.field320, var25);
                    } else if (var30) {
                        this.method202((byte) 103, var24, this.field321, var25);
                    } else {
                        this.method202((byte) 103, var24, this.field319, var25);
                    }
                }
            }
            if (this.field251 != 0 && field564 % 20 < 10) {
                if (this.field251 == 1 && this.field227 >= 0 && this.field227 < this.field504.length) {
                    class2 var13 = this.field504[this.field227];
                    if (var13 != null) {
                        int var14 = var13.field884 / 32 - field623.field884 / 32;
                        int var15 = var13.field885 / 32 - field623.field885 / 32;
                        this.method181(var15, this.field645, var14, 8);
                    }
                }
                if (this.field251 == 2) {
                    int var16 = (this.field286 - this.field377) * 4 + 2 - field623.field884 / 32;
                    int var17 = (this.field287 - this.field378) * 4 + 2 - field623.field885 / 32;
                    this.method181(var17, this.field645, var16, 8);
                }
                if (this.field251 == 10 && this.field464 >= 0 && this.field464 < this.field360.length) {
                    class22 var18 = this.field360[this.field464];
                    if (var18 != null) {
                        int var19 = var18.field884 / 32 - field623.field884 / 32;
                        int var20 = var18.field885 / 32 - field623.field885 / 32;
                        this.method181(var20, this.field645, var19, 8);
                    }
                }
            }
            if (this.field422 != 0) {
                int var21 = this.field422 * 4 + 2 - field623.field884 / 32;
                int var22 = this.field423 * 4 + 2 - field623.field885 / 32;
                this.method202((byte) 103, var21, this.field644, var22);
            }
            class8.method143(16777215, 97, 78, 3, 3, false);
            this.field354.method592(-19705);
            class42.field1212 = this.field489;
        }
    }

    @OriginalMember(owner = "client!client", name = "k", descriptor = "(Z)V")
    public final void method221(boolean arg0) {
        if (this.field584 != 0) {
            int var2 = 0;
            if (!arg0) {
                if (this.field238 != 0) {
                    var2 = 1;
                }
                for (int var3 = 0; var3 < 100; ++var3) {
                    if (this.field639[var3] != null) {
                        int var4 = this.field637[var3];
                        String var5 = this.field638[var3];
                        boolean var6 = false;
                        if (var5 != null && var5.startsWith("@cr1@")) {
                            var5 = var5.substring(5);
                            boolean var7 = true;
                        }
                        if (var5 != null && var5.startsWith("@cr2@")) {
                            var5 = var5.substring(5);
                            boolean var8 = true;
                        }
                        if ((var4 == 3 || var4 == 7) && (var4 == 7 || this.field459 == 0 || this.field459 == 1 && this.method247((byte) 7, var5))) {
                            int var9 = 329 - var2 * 13;
                            if (super.field1441 > 4 && super.field1442 - 4 > var9 - 10 && super.field1442 - 4 <= var9 + 3) {
                                int var10 = this.field325.method98("From:  " + var5 + this.field639[var3], 2) + 25;
                                if (var10 > 450) {
                                    var10 = 450;
                                }
                                if (super.field1441 < var10 + 4) {
                                    if (this.field267 >= 1) {
                                        this.field434[this.field344] = "Report abuse @whi@" + var5;
                                        this.field180[this.field344] = 2414;
                                        ++this.field344;
                                    }
                                    this.field434[this.field344] = "Add ignore @whi@" + var5;
                                    this.field180[this.field344] = 2872;
                                    ++this.field344;
                                    this.field434[this.field344] = "Add friend @whi@" + var5;
                                    this.field180[this.field344] = 2106;
                                    ++this.field344;
                                }
                            }
                            ++var2;
                            if (var2 >= 5) {
                                return;
                            }
                        }
                        if ((var4 == 5 || var4 == 6) && this.field459 < 2) {
                            ++var2;
                            if (var2 >= 5) {
                                return;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IBLBFQIDHPO;)V")
    private final void method222(int arg0, byte arg1, class3 arg2) {
        int var4 = arg2.method65((byte) 88, 8);
        if (var4 < this.field361) {
            for (int var5 = var4; var5 < this.field361; ++var5) {
                this.field579[this.field578++] = this.field362[var5];
            }
        }
        if (var4 > this.field361) {
            signlink.reporterror(this.field416 + " Too many players");
            throw new RuntimeException("eek");
        } else {
            this.field361 = 0;
            for (int var6 = 0; var6 < var4; ++var6) {
                int var7 = this.field362[var6];
                class22 var8 = this.field360[var7];
                int var9 = arg2.method65((byte) 88, 1);
                if (var9 == 0) {
                    this.field362[this.field361++] = var7;
                    var8.field883 = field564;
                } else {
                    int var10 = arg2.method65((byte) 88, 2);
                    if (var10 == 0) {
                        this.field362[this.field361++] = var7;
                        var8.field883 = field564;
                        this.field364[this.field363++] = var7;
                    } else if (var10 == 1) {
                        this.field362[this.field361++] = var7;
                        var8.field883 = field564;
                        int var11 = arg2.method65((byte) 88, 3);
                        var8.method317(var11, this.field418, false);
                        int var12 = arg2.method65((byte) 88, 1);
                        if (var12 == 1) {
                            this.field364[this.field363++] = var7;
                        }
                    } else if (var10 == 2) {
                        this.field362[this.field361++] = var7;
                        var8.field883 = field564;
                        int var13 = arg2.method65((byte) 88, 3);
                        var8.method317(var13, this.field418, true);
                        int var14 = arg2.method65((byte) 88, 3);
                        var8.method317(var14, this.field418, true);
                        int var15 = arg2.method65((byte) 88, 1);
                        if (var15 == 1) {
                            this.field364[this.field363++] = var7;
                        }
                    } else if (var10 == 3) {
                        this.field579[this.field578++] = var7;
                    }
                }
            }
            if (arg1 != 9) {
                field448 = this.field485.method534();
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "A", descriptor = "(I)V")
    public final void method223(int arg0) {
        int var2 = 5;
        this.field311[8] = 0;
        int var3 = 0;
        int var4 = 53 / arg0;
        while (this.field311[8] == 0) {
            String var5 = "Unknown problem";
            this.method169("Connecting to web server", 20, (byte) 108);
            try {
                DataInputStream var6 = this.method199("crc" + (int) (Math.random() * 9.9999999E7D) + "-" + 367);
                class3 var7 = new class3(new byte[40], -990);
                var6.readFully(var7.field49, 0, 40);
                var6.close();
                for (int var8 = 0; var8 < 9; ++var8) {
                    this.field311[var8] = var7.method59();
                }
                int var9 = var7.method59();
                int var10 = 1234;
                for (int var11 = 0; var11 < 9; ++var11) {
                    var10 = (var10 << 1) + this.field311[var11];
                }
                if (var9 != var10) {
                    var5 = "checksum problem";
                    this.field311[8] = 0;
                }
            } catch (EOFException var14) {
                var5 = "EOF problem";
                this.field311[8] = 0;
            } catch (IOException var15) {
                var5 = "connection problem";
                this.field311[8] = 0;
            } catch (Exception var16) {
                var5 = "logic problem";
                this.field311[8] = 0;
                if (!signlink.reporterror) {
                    return;
                }
            }
            if (this.field311[8] == 0) {
                ++var3;
                for (int var12 = var2; var12 > 0; --var12) {
                    if (var3 >= 10) {
                        this.method169("Game updated - please reload page", 10, (byte) 108);
                        var12 = 10;
                    } else {
                        this.method169(var5 + " - Will retry in " + var12 + " secs.", 10, (byte) 108);
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
                this.field366 = !this.field366;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "B", descriptor = "(I)V")
    public final void method224(int arg0) {
        this.field590 = true;
        try {
            long var2 = System.currentTimeMillis();
            int var4 = 0;
            int var5 = 20;
            while (this.field221) {
                ++this.field519;
                this.method196(-19541);
                this.method196(-19541);
                this.method219(9);
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
        this.field590 = false;
        if (arg0 != 0) {
            for (int var9 = 1; var9 > 0; ++var9) {
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "l", descriptor = "(Z)V")
    public final void method225(boolean arg0) {
        class68.field1698.method497();
        class68.field1726.method497();
        class49.field1353.method497();
        class45.field1286.method497();
        if (arg0) {
            this.field314 = -90;
        }
        class45.field1256.method497();
        class22.field928.method497();
        class9.field674.method497();
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
    public final void method226(byte arg0) {
        if (arg0 != 98) {
            this.field233 = -1;
        }
        if (super.field1447 == 1) {
            if (super.field1448 >= 539 && super.field1448 <= 573 && super.field1449 >= 169 && super.field1449 < 205 && this.field473[0] != -1) {
                this.field501 = true;
                this.field431 = 0;
                this.field425 = true;
            }
            if (super.field1448 >= 569 && super.field1448 <= 599 && super.field1449 >= 168 && super.field1449 < 205 && this.field473[1] != -1) {
                this.field501 = true;
                this.field431 = 1;
                this.field425 = true;
            }
            if (super.field1448 >= 597 && super.field1448 <= 627 && super.field1449 >= 168 && super.field1449 < 205 && this.field473[2] != -1) {
                this.field501 = true;
                this.field431 = 2;
                this.field425 = true;
            }
            if (super.field1448 >= 625 && super.field1448 <= 669 && super.field1449 >= 168 && super.field1449 < 203 && this.field473[3] != -1) {
                this.field501 = true;
                this.field431 = 3;
                this.field425 = true;
            }
            if (super.field1448 >= 666 && super.field1448 <= 696 && super.field1449 >= 168 && super.field1449 < 205 && this.field473[4] != -1) {
                this.field501 = true;
                this.field431 = 4;
                this.field425 = true;
            }
            if (super.field1448 >= 694 && super.field1448 <= 724 && super.field1449 >= 168 && super.field1449 < 205 && this.field473[5] != -1) {
                this.field501 = true;
                this.field431 = 5;
                this.field425 = true;
            }
            if (super.field1448 >= 722 && super.field1448 <= 756 && super.field1449 >= 169 && super.field1449 < 205 && this.field473[6] != -1) {
                this.field501 = true;
                this.field431 = 6;
                this.field425 = true;
            }
            if (super.field1448 >= 540 && super.field1448 <= 574 && super.field1449 >= 466 && super.field1449 < 502 && this.field473[7] != -1) {
                this.field501 = true;
                this.field431 = 7;
                this.field425 = true;
            }
            if (super.field1448 >= 572 && super.field1448 <= 602 && super.field1449 >= 466 && super.field1449 < 503 && this.field473[8] != -1) {
                this.field501 = true;
                this.field431 = 8;
                this.field425 = true;
            }
            if (super.field1448 >= 599 && super.field1448 <= 629 && super.field1449 >= 466 && super.field1449 < 503 && this.field473[9] != -1) {
                this.field501 = true;
                this.field431 = 9;
                this.field425 = true;
            }
            if (super.field1448 >= 627 && super.field1448 <= 671 && super.field1449 >= 467 && super.field1449 < 502 && this.field473[10] != -1) {
                this.field501 = true;
                this.field431 = 10;
                this.field425 = true;
            }
            if (super.field1448 >= 669 && super.field1448 <= 699 && super.field1449 >= 466 && super.field1449 < 503 && this.field473[11] != -1) {
                this.field501 = true;
                this.field431 = 11;
                this.field425 = true;
            }
            if (super.field1448 >= 696 && super.field1448 <= 726 && super.field1449 >= 466 && super.field1449 < 503 && this.field473[12] != -1) {
                this.field501 = true;
                this.field431 = 12;
                this.field425 = true;
            }
            if (super.field1448 >= 724 && super.field1448 <= 758 && super.field1449 >= 466 && super.field1449 < 502 && this.field473[13] != -1) {
                this.field501 = true;
                this.field431 = 13;
                this.field425 = true;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIILIOPHRJNF;I)V")
    public final void method227(int arg0, int arg1, int arg2, class22 arg3, int arg4) {
        if (field623 != arg3) {
            if (this.field344 < 400) {
                if (arg1 != -10739) {
                    this.field483.method44(124);
                }
                String var6;
                if (arg3.field931 == 0) {
                    var6 = arg3.field953 + method170(field623.field956, arg3.field956, 0) + " (level-" + arg3.field956 + ")";
                } else {
                    var6 = arg3.field953 + " (skill-" + arg3.field931 + ")";
                }
                if (this.field532 == 1) {
                    this.field434[this.field344] = "Use " + this.field536 + " with @whi@" + var6;
                    this.field180[this.field344] = 453;
                    this.field181[this.field344] = arg0;
                    this.field178[this.field344] = arg4;
                    this.field179[this.field344] = arg2;
                    ++this.field344;
                } else if (this.field192 == 1) {
                    if ((this.field194 & 8) == 8) {
                        this.field434[this.field344] = this.field195 + " @whi@" + var6;
                        this.field180[this.field344] = 322;
                        this.field181[this.field344] = arg0;
                        this.field178[this.field344] = arg4;
                        this.field179[this.field344] = arg2;
                        ++this.field344;
                    }
                } else {
                    for (int var7 = 4; var7 >= 0; --var7) {
                        if (this.field451[var7] != null) {
                            this.field434[this.field344] = this.field451[var7] + " @whi@" + var6;
                            short var9 = 0;
                            if (this.field451[var7].equalsIgnoreCase("attack")) {
                                if (arg3.field956 > field623.field956) {
                                    var9 = 2000;
                                }
                                if (field623.field927 != 0 && arg3.field927 != 0) {
                                    if (field623.field927 == arg3.field927) {
                                        var9 = 2000;
                                    } else {
                                        var9 = 0;
                                    }
                                }
                            } else if (this.field452[var7]) {
                                var9 = 2000;
                            }
                            if (var7 == 0) {
                                this.field180[this.field344] = var9 + 403;
                            }
                            if (var7 == 1) {
                                this.field180[this.field344] = var9 + 124;
                            }
                            if (var7 == 2) {
                                this.field180[this.field344] = var9 + 764;
                            }
                            if (var7 == 3) {
                                this.field180[this.field344] = var9 + 246;
                            }
                            if (var7 == 4) {
                                this.field180[this.field344] = var9 + 329;
                            }
                            this.field181[this.field344] = arg0;
                            this.field178[this.field344] = arg4;
                            this.field179[this.field344] = arg2;
                            ++this.field344;
                        }
                    }
                }
                for (int var8 = 0; var8 < this.field344; ++var8) {
                    if (this.field180[var8] == 903) {
                        this.field434[var8] = "Walk here @whi@" + var6;
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIII)V")
    public final void method228(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = 2048 - arg6 & 2047;
        int var9 = 2048 - arg0 & 2047;
        int var10 = 0;
        int var11 = 0;
        int var12 = arg5;
        if (var8 != 0) {
            int var13 = class65.field1658[var8];
            int var14 = class65.field1659[var8];
            int var15 = var11 * var14 - arg5 * var13 >> 16;
            var12 = var11 * var13 + arg5 * var14 >> 16;
            var11 = var15;
        }
        if (var9 != 0) {
            int var16 = class65.field1658[var9];
            int var17 = class65.field1659[var9];
            int var18 = var10 * var17 + var12 * var16 >> 16;
            var12 = var12 * var17 - var10 * var16 >> 16;
            var10 = var18;
        }
        this.field556 = arg4 - var10;
        this.field557 = arg3 - var11;
        if (arg1 != 6332) {
            this.field233 = -1;
        }
        this.field558 = arg2 - var12;
        this.field559 = arg6;
        this.field560 = arg0;
    }

    @OriginalMember(owner = "client!client", name = "C", descriptor = "(I)V")
    public final void method229(int arg0) {
        try {
            if (this.field247 != null) {
                this.field247.method586();
            }
        } catch (Exception var4) {
        }
        this.field247 = null;
        this.field250 = false;
        if (arg0 != 0) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        this.field313 = 0;
        this.field416 = "";
        this.field417 = "";
        this.method225(this.field463);
        this.field306.method373(16868);
        for (int var3 = 0; var3 < 4; ++var3) {
            this.field217[var3].method483();
        }
        System.gc();
        this.method212(0);
        this.field343 = -1;
        this.field297 = -1;
        this.field655 = 0;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ZLjava/lang/String;Ljava/lang/String;)V")
    public final void method230(boolean arg0, String arg1, String arg2) {
        this.field250 &= arg0;
        if (this.field354 != null) {
            this.field354.method592(-19705);
            class42.field1212 = this.field489;
            int var4 = 151;
            if (arg1 != null) {
                var4 -= 7;
            }
            this.field325.method96(var4, (byte) 8, 0, arg2, 257);
            this.field325.method96(var4 - 1, (byte) 8, 16777215, arg2, 256);
            var4 += 15;
            if (arg1 != null) {
                this.field325.method96(var4, (byte) 8, 0, arg1, 257);
                this.field325.method96(var4 - 1, (byte) 8, 16777215, arg1, 256);
            }
            this.field354.method593(super.field1433, 4, false, 4);
        } else if (super.field1434 != null) {
            super.field1434.method592(-19705);
            class42.field1212 = this.field490;
            int var5 = 251;
            short var6 = 300;
            byte var7 = 50;
            class8.method143(0, 383 - var6 / 2, var5 - 5 - var7 / 2, var6, var7, false);
            class8.method144(var5 - 5 - var7 / 2, 16777215, 264, 383 - var6 / 2, var7, var6);
            if (arg1 != null) {
                var5 -= 7;
            }
            this.field325.method96(var5, (byte) 8, 0, arg2, 383);
            this.field325.method96(var5 - 1, (byte) 8, 16777215, arg2, 382);
            var5 += 15;
            if (arg1 != null) {
                this.field325.method96(var5, (byte) 8, 0, arg1, 383);
                this.field325.method96(var5 - 1, (byte) 8, 16777215, arg1, 382);
            }
            super.field1434.method593(super.field1433, 0, false, 0);
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(II)V")
    public final void method231(int arg0, int arg1) {
        if (arg1 != 6) {
            this.field463 = !this.field463;
        }
        if (!field374) {
            for (int var3 = 0; var3 < this.field408.length; ++var3) {
                int var4 = this.field408[var3];
                if (class42.field1220[var4] >= arg0) {
                    class44 var5 = class42.field1214[var4];
                    int var6 = var5.field1236 * var5.field1235 - 1;
                    int var7 = this.field628 * var5.field1235 * 2;
                    byte[] var8 = var5.field1233;
                    byte[] var9 = this.field522;
                    for (int var10 = 0; var10 <= var6; ++var10) {
                        var9[var10] = var8[var10 - var7 & var6];
                    }
                    var5.field1233 = var9;
                    this.field522 = var8;
                    class42.method431(var4, -633);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "D", descriptor = "(I)V")
    public final void method232(int arg0) {
        byte[] var2 = this.field540.method526("title.dat", (byte[]) null);
        class36 var3 = new class36(var2, this);
        this.field208.method592(-19705);
        var3.method351(0, 298, 0);
        this.field209.method592(-19705);
        var3.method351(0, 298, -637);
        this.field205.method592(-19705);
        var3.method351(0, 298, -128);
        this.field206.method592(-19705);
        var3.method351(-371, 298, -202);
        this.field207.method592(-19705);
        var3.method351(-171, 298, -202);
        this.field210.method592(-19705);
        var3.method351(-265, 298, 0);
        this.field211.method592(-19705);
        var3.method351(-265, 298, -562);
        this.field212.method592(-19705);
        var3.method351(-171, 298, -128);
        this.field213.method592(-19705);
        var3.method351(-171, 298, -562);
        int[] var4 = new int[var3.field1077];
        for (int var5 = 0; var5 < var3.field1078; ++var5) {
            for (int var10 = 0; var10 < var3.field1077; ++var10) {
                var4[var10] = var3.field1076[var3.field1077 * var5 + (var3.field1077 - var10 - 1)];
            }
            for (int var11 = 0; var11 < var3.field1077; ++var11) {
                var3.field1076[var3.field1077 * var5 + var11] = var4[var11];
            }
        }
        this.field208.method592(-19705);
        var3.method351(0, 298, 382);
        this.field209.method592(-19705);
        var3.method351(0, 298, -255);
        this.field205.method592(-19705);
        var3.method351(0, 298, 254);
        this.field206.method592(-19705);
        var3.method351(-371, 298, 180);
        this.field207.method592(-19705);
        var3.method351(-171, 298, 180);
        this.field210.method592(-19705);
        var3.method351(-265, 298, 382);
        this.field211.method592(-19705);
        var3.method351(-265, 298, -180);
        this.field212.method592(-19705);
        var3.method351(-171, 298, 254);
        this.field213.method592(-19705);
        var3.method351(-171, 298, -180);
        class36 var6 = new class36(this.field540, "logo", 0);
        this.field205.method592(-19705);
        var6.method353(18, (byte) 3, 382 - var6.field1077 / 2 - 128);
        Object var7 = null;
        Object var8 = null;
        if (arg0 != 20060) {
            this.field616 = !this.field616;
        }
        Object var9 = null;
        System.gc();
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
    public final void method233(byte arg0) {
        if (arg0 != -69) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        ++field413;
        if (field413 > 122) {
            field413 = 0;
            this.field483.method43(0, 58);
            this.field483.method48(0);
        }
        while (true) {
            int var3;
            do {
                while (true) {
                    var3 = this.method518(true);
                    if (var3 == -1) {
                        return;
                    }
                    if (this.field484 != -1 && this.field484 == this.field405) {
                        if (var3 == 8 && this.field581.length() > 0) {
                            this.field581 = this.field581.substring(0, this.field581.length() - 1);
                        }
                        break;
                    }
                    if (this.field340) {
                        if (var3 >= 32 && var3 <= 122 && this.field191.length() < 80) {
                            this.field191 = this.field191 + (char) var3;
                            this.field226 = true;
                        }
                        if (var3 == 8 && this.field191.length() > 0) {
                            this.field191 = this.field191.substring(0, this.field191.length() - 1);
                            this.field226 = true;
                        }
                        if (var3 == 13 || var3 == 10) {
                            this.field340 = false;
                            this.field226 = true;
                            if (this.field657 == 1) {
                                long var4 = class29.method323(this.field191);
                                this.method163(var4, -872);
                            }
                            if (this.field657 == 2 && this.field493 > 0) {
                                long var6 = class29.method323(this.field191);
                                this.method290(true, var6);
                            }
                            if (this.field657 == 3 && this.field191.length() > 0) {
                                this.field483.method43(0, 21);
                                this.field483.method44(0);
                                int var8 = this.field483.field50;
                                this.field483.method50(this.field642, this.field572);
                                class40.method370(this.field483, 0, this.field191);
                                this.field483.method53(this.field483.field50 - var8, false);
                                this.field191 = class40.method371(-18263, this.field191);
                                this.field191 = class1.method11(-18263, this.field191);
                                this.method192(class29.method327(class29.method324(true, this.field572), (byte) 58), this.field191, 6, this.field369);
                                if (this.field459 == 2) {
                                    this.field459 = 1;
                                    this.field531 = true;
                                    this.field483.method43(0, 83);
                                    this.field483.method44(this.field614);
                                    this.field483.method44(this.field459);
                                    this.field483.method44(this.field602);
                                }
                            }
                            if (this.field657 == 4 && this.field498 < 100) {
                                long var9 = class29.method323(this.field191);
                                this.method204(false, var9);
                            }
                            if (this.field657 == 5 && this.field498 > 0) {
                                long var11 = class29.method323(this.field191);
                                this.method171(291, var11);
                            }
                        }
                    } else if (this.field646 == 1) {
                        if (var3 >= 48 && var3 <= 57 && this.field502.length() < 10) {
                            this.field502 = this.field502 + (char) var3;
                            this.field226 = true;
                        }
                        if (var3 == 8 && this.field502.length() > 0) {
                            this.field502 = this.field502.substring(0, this.field502.length() - 1);
                            this.field226 = true;
                        }
                        if (var3 == 13 || var3 == 10) {
                            if (this.field502.length() > 0) {
                                int var13 = 0;
                                try {
                                    var13 = Integer.parseInt(this.field502);
                                } catch (Exception var23) {
                                }
                                this.field483.method43(0, 234);
                                this.field483.method48(var13);
                            }
                            this.field646 = 0;
                            this.field226 = true;
                        }
                    } else if (this.field646 == 2) {
                        if (var3 >= 32 && var3 <= 122 && this.field502.length() < 12) {
                            this.field502 = this.field502 + (char) var3;
                            this.field226 = true;
                        }
                        if (var3 == 8 && this.field502.length() > 0) {
                            this.field502 = this.field502.substring(0, this.field502.length() - 1);
                            this.field226 = true;
                        }
                        if (var3 == 13 || var3 == 10) {
                            if (this.field502.length() > 0) {
                                this.field483.method43(0, 40);
                                this.field483.method50(this.field642, class29.method323(this.field502));
                            }
                            this.field646 = 0;
                            this.field226 = true;
                        }
                    } else if (this.field646 == 3) {
                        if (var3 >= 32 && var3 <= 122 && this.field502.length() < 40) {
                            this.field502 = this.field502 + (char) var3;
                            this.field226 = true;
                        }
                        if (var3 == 8 && this.field502.length() > 0) {
                            this.field502 = this.field502.substring(0, this.field502.length() - 1);
                            this.field226 = true;
                        }
                    } else if (this.field465 == -1 && this.field356 == -1) {
                        if (var3 >= 32 && var3 <= 122 && this.field275.length() < 80) {
                            this.field275 = this.field275 + (char) var3;
                            this.field226 = true;
                        }
                        if (var3 == 8 && this.field275.length() > 0) {
                            this.field275 = this.field275.substring(0, this.field275.length() - 1);
                            this.field226 = true;
                        }
                        if ((var3 == 13 || var3 == 10) && this.field275.length() > 0) {
                            if (this.field267 == 2) {
                                if (this.field275.equals("::clientdrop")) {
                                    this.method154(false);
                                }
                                if (this.field275.equals("::lag")) {
                                    this.method270(744);
                                }
                                if (this.field275.equals("::prefetchmusic")) {
                                    for (int var14 = 0; var14 < this.field580.method122(2, 0); ++var14) {
                                        this.field580.method136(2, -6015, var14, (byte) 1);
                                    }
                                }
                                if (this.field275.equals("::fpson")) {
                                    field175 = true;
                                }
                                if (this.field275.equals("::fpsoff")) {
                                    field175 = false;
                                }
                                if (this.field275.equals("::noclip")) {
                                    for (int var15 = 0; var15 < 4; ++var15) {
                                        for (int var16 = 1; var16 < 103; ++var16) {
                                            for (int var17 = 1; var17 < 103; ++var17) {
                                                this.field217[var15].field1336[var16][var17] = 0;
                                            }
                                        }
                                    }
                                }
                            }
                            if (this.field275.startsWith("::")) {
                                this.field483.method43(0, 33);
                                this.field483.method44(this.field275.length() - 1);
                                this.field483.method51(this.field275.substring(2));
                            } else {
                                String var18 = this.field275.toLowerCase();
                                byte var19 = 0;
                                if (var18.startsWith("yellow:")) {
                                    var19 = 0;
                                    this.field275 = this.field275.substring(7);
                                } else if (var18.startsWith("red:")) {
                                    var19 = 1;
                                    this.field275 = this.field275.substring(4);
                                } else if (var18.startsWith("green:")) {
                                    var19 = 2;
                                    this.field275 = this.field275.substring(6);
                                } else if (var18.startsWith("cyan:")) {
                                    var19 = 3;
                                    this.field275 = this.field275.substring(5);
                                } else if (var18.startsWith("purple:")) {
                                    var19 = 4;
                                    this.field275 = this.field275.substring(7);
                                } else if (var18.startsWith("white:")) {
                                    var19 = 5;
                                    this.field275 = this.field275.substring(6);
                                } else if (var18.startsWith("flash1:")) {
                                    var19 = 6;
                                    this.field275 = this.field275.substring(7);
                                } else if (var18.startsWith("flash2:")) {
                                    var19 = 7;
                                    this.field275 = this.field275.substring(7);
                                } else if (var18.startsWith("flash3:")) {
                                    var19 = 8;
                                    this.field275 = this.field275.substring(7);
                                } else if (var18.startsWith("glow1:")) {
                                    var19 = 9;
                                    this.field275 = this.field275.substring(6);
                                } else if (var18.startsWith("glow2:")) {
                                    var19 = 10;
                                    this.field275 = this.field275.substring(6);
                                } else if (var18.startsWith("glow3:")) {
                                    var19 = 11;
                                    this.field275 = this.field275.substring(6);
                                }
                                String var20 = this.field275.toLowerCase();
                                byte var21 = 0;
                                if (var20.startsWith("wave:")) {
                                    var21 = 1;
                                    this.field275 = this.field275.substring(5);
                                } else if (var20.startsWith("wave2:")) {
                                    var21 = 2;
                                    this.field275 = this.field275.substring(6);
                                } else if (var20.startsWith("shake:")) {
                                    var21 = 3;
                                    this.field275 = this.field275.substring(6);
                                } else if (var20.startsWith("scroll:")) {
                                    var21 = 4;
                                    this.field275 = this.field275.substring(7);
                                } else if (var20.startsWith("slide:")) {
                                    var21 = 5;
                                    this.field275 = this.field275.substring(6);
                                }
                                this.field483.method43(0, 183);
                                this.field483.method44(0);
                                int var22 = this.field483.field50;
                                this.field483.method70(var19, -12346);
                                this.field503.field50 = 0;
                                class40.method370(this.field503, 0, this.field275);
                                this.field483.method90(0, this.field503.field49, true, this.field503.field50);
                                this.field483.method70(var21, -12346);
                                this.field483.method53(this.field483.field50 - var22, false);
                                this.field275 = class40.method371(-18263, this.field275);
                                this.field275 = class1.method11(-18263, this.field275);
                                field623.field916 = this.field275;
                                field623.field876 = var19;
                                field623.field887 = var21;
                                field623.field908 = 150;
                                if (this.field267 == 2) {
                                    this.method192("@cr2@" + field623.field953, field623.field916, 2, this.field369);
                                } else if (this.field267 == 1) {
                                    this.method192("@cr1@" + field623.field953, field623.field916, 2, this.field369);
                                } else {
                                    this.method192(field623.field953, field623.field916, 2, this.field369);
                                }
                                if (this.field614 == 2) {
                                    this.field614 = 3;
                                    this.field531 = true;
                                    this.field483.method43(0, 83);
                                    this.field483.method44(this.field614);
                                    this.field483.method44(this.field459);
                                    this.field483.method44(this.field602);
                                }
                            }
                            this.field275 = "";
                            this.field226 = true;
                        }
                    }
                }
            } while ((var3 < 97 || var3 > 122) && (var3 < 65 || var3 > 90) && (var3 < 48 || var3 > 57) && var3 != 32);
            if (this.field581.length() < 12) {
                this.field581 = this.field581 + (char) var3;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ZI[B)Z")
    public final boolean method234(boolean arg0, int arg1, byte[] arg2) {
        if (arg0) {
            this.field544 = null;
        }
        return arg2 == null ? true : signlink.wavesave(arg2, arg1);
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
    public final void method235(byte arg0) {
        this.field221 = false;
        while (this.field590) {
            this.field221 = false;
            try {
                Thread.sleep(50L);
            } catch (Exception var3) {
            }
        }
        this.field258 = null;
        this.field259 = null;
        this.field302 = null;
        this.field348 = null;
        this.field349 = null;
        this.field350 = null;
        this.field351 = null;
        this.field196 = null;
        this.field197 = null;
        this.field449 = null;
        this.field450 = null;
        if (arg0 == 1) {
            boolean var2 = false;
        } else {
            this.field616 = !this.field616;
        }
        this.field547 = null;
        this.field548 = null;
    }

    @OriginalMember(owner = "client!client", name = "E", descriptor = "(I)V")
    public final void method236(int arg0) {
        if (this.field355 == null) {
            this.method235((byte) 1);
            super.field1434 = null;
            this.field205 = null;
            this.field206 = null;
            this.field207 = null;
            this.field208 = null;
            int var2 = 18 / arg0;
            this.field209 = null;
            this.field210 = null;
            this.field211 = null;
            this.field212 = null;
            this.field213 = null;
            this.field355 = new class71(field260, this.method271(-319), 479, 96);
            this.field353 = new class71(field260, this.method271(-319), 172, 156);
            class8.method141(true);
            this.field400.method446(0, (byte) 3, 0);
            this.field352 = new class71(field260, this.method271(-319), 190, 261);
            this.field354 = new class71(field260, this.method271(-319), 512, 334);
            class8.method141(true);
            this.field262 = new class71(field260, this.method271(-319), 496, 50);
            this.field263 = new class71(field260, this.method271(-319), 269, 37);
            this.field264 = new class71(field260, this.method271(-319), 249, 45);
            this.field596 = true;
            this.field354.method592(-19705);
            class42.field1212 = this.field489;
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V")
    public final void method237(byte arg0) {
        if (arg0 == 8) {
            for (int var2 = -1; var2 < this.field361; ++var2) {
                int var6;
                if (var2 == -1) {
                    var6 = this.field359;
                } else {
                    var6 = this.field362[var2];
                }
                class22 var7 = this.field360[var6];
                if (var7 != null && var7.field908 > 0) {
                    --var7.field908;
                    if (var7.field908 == 0) {
                        var7.field916 = null;
                    }
                }
            }
            for (int var3 = 0; var3 < this.field505; ++var3) {
                int var4 = this.field506[var3];
                class2 var5 = this.field504[var4];
                if (var5 != null && var5.field908 > 0) {
                    --var5.field908;
                    if (var5.field908 == 0) {
                        var5.field916 = null;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public final void method238(String arg0, int arg1) {
        if (arg0 != null && arg0.length() != 0) {
            String var3 = arg0;
            String[] var4 = new String[100];
            int var5 = 0;
            while (true) {
                int var6 = var3.indexOf(" ");
                if (var6 == -1) {
                    String var8 = var3.trim();
                    if (var8.length() > 0) {
                        var4[var5++] = var8.toLowerCase();
                    }
                    this.field336 = 0;
                    while (arg1 >= 0) {
                        this.field463 = !this.field463;
                    }
                    label55: for (int var9 = 0; var9 < class45.field1287; ++var9) {
                        class45 var10 = class45.method456(var9);
                        if (var10.field1251 == -1 && var10.field1269 != null) {
                            String var11 = var10.field1269.toLowerCase();
                            for (int var12 = 0; var12 < var5; ++var12) {
                                if (var11.indexOf(var4[var12]) == -1) {
                                    continue label55;
                                }
                            }
                            this.field337[this.field336] = var11;
                            this.field338[this.field336] = var9;
                            ++this.field336;
                            if (this.field336 >= this.field337.length) {
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
            this.field336 = 0;
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(II)Ljava/lang/String;")
    public final String method239(int arg0, int arg1) {
        int var3 = 52 / arg0;
        return arg1 < 999999999 ? String.valueOf(arg1) : "*";
    }

    @OriginalMember(owner = "client!client", name = "F", descriptor = "(I)V")
    public final void method240(int arg0) {
        if (arg0 != 13173) {
            this.field421 = this.field485.method534();
        }
        if (this.field393 == 0) {
            this.field434[0] = "Cancel";
            this.field180[0] = 1844;
            this.field344 = 1;
            if (this.field356 != -1) {
                this.field455 = 0;
                this.field328 = 0;
                this.method210(super.field1441, 0, 0, super.field1442, 0, 0, class15.method306(this.field356), 0);
                if (this.field555 != this.field455) {
                    this.field555 = this.field455;
                }
                if (this.field328 != this.field276) {
                    this.field276 = this.field328;
                }
            } else {
                this.method221(false);
                this.field455 = 0;
                this.field328 = 0;
                if (super.field1441 > 4 && super.field1442 > 4 && super.field1441 < 516 && super.field1442 < 338) {
                    if (this.field484 != -1) {
                        this.method210(super.field1441, 4, 4, super.field1442, 0, 0, class15.method306(this.field484), 0);
                    } else {
                        this.method274((byte) 106);
                    }
                }
                if (this.field555 != this.field455) {
                    this.field555 = this.field455;
                }
                if (this.field328 != this.field276) {
                    this.field276 = this.field328;
                }
                this.field455 = 0;
                this.field328 = 0;
                if (super.field1441 > 553 && super.field1442 > 205 && super.field1441 < 743 && super.field1442 < 466) {
                    if (this.field631 != -1) {
                        this.method210(super.field1441, 553, 205, super.field1442, 0, 1, class15.method306(this.field631), 0);
                    } else if (this.field473[this.field431] != -1) {
                        this.method210(super.field1441, 553, 205, super.field1442, 0, 1, class15.method306(this.field473[this.field431]), 0);
                    }
                }
                if (this.field455 != this.field271) {
                    this.field501 = true;
                    this.field271 = this.field455;
                }
                if (this.field328 != this.field228) {
                    this.field501 = true;
                    this.field228 = this.field328;
                }
                this.field455 = 0;
                this.field328 = 0;
                if (super.field1441 > 17 && super.field1442 > 357 && super.field1441 < 496 && super.field1442 < 453) {
                    if (this.field465 != -1) {
                        this.method210(super.field1441, 17, 357, super.field1442, 0, 2, class15.method306(this.field465), 0);
                    } else if (this.field554 != -1) {
                        this.method210(super.field1441, 17, 357, super.field1442, 0, 3, class15.method306(this.field554), 0);
                    } else if (super.field1442 < 434 && super.field1441 < 426 && this.field646 == 0) {
                        this.method175(1, super.field1442 - 357, super.field1441 - 17);
                    }
                }
                if ((this.field465 != -1 || this.field554 != -1) && this.field455 != this.field402) {
                    this.field226 = true;
                    this.field402 = this.field455;
                }
                if ((this.field465 != -1 || this.field554 != -1) && this.field328 != this.field174) {
                    this.field226 = true;
                    this.field174 = this.field328;
                }
                boolean var2 = false;
                while (!var2) {
                    var2 = true;
                    for (int var3 = 0; var3 < this.field344 - 1; ++var3) {
                        if (this.field180[var3] < 1000 && this.field180[var3 + 1] > 1000) {
                            String var4 = this.field434[var3];
                            this.field434[var3] = this.field434[var3 + 1];
                            this.field434[var3 + 1] = var4;
                            int var5 = this.field180[var3];
                            this.field180[var3] = this.field180[var3 + 1];
                            this.field180[var3 + 1] = var5;
                            int var6 = this.field178[var3];
                            this.field178[var3] = this.field178[var3 + 1];
                            this.field178[var3 + 1] = var6;
                            int var7 = this.field179[var3];
                            this.field179[var3] = this.field179[var3 + 1];
                            this.field179[var3 + 1] = var7;
                            int var8 = this.field181[var3];
                            this.field181[var3] = this.field181[var3 + 1];
                            this.field181[var3 + 1] = var8;
                            var2 = false;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIZ)V")
    public final void method241(int arg0, int arg1, boolean arg2) {
        if (arg0 > 0) {
            signlink.midivol = arg1;
            if (arg2) {
                signlink.midi = "voladjust";
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ZLjava/lang/String;IILjava/lang/String;I)LVSQMPWOM;")
    public final class59 method242(boolean arg0, String arg1, int arg2, int arg3, String arg4, int arg5) {
        if (!arg0) {
            this.field544 = null;
        }
        byte[] var7 = null;
        int var8 = 5;
        try {
            if (this.field636[0] != null) {
                var7 = this.field636[0].method529((byte) -11, arg2);
            }
        } catch (Exception var30) {
        }
        if (var7 != null) {
            this.field460.reset();
            this.field460.update(var7);
            int var9 = (int) this.field460.getValue();
            if (arg5 != var9) {
                var7 = null;
            }
        }
        if (var7 != null) {
            return new class59(var7, 156);
        } else {
            int var11 = 0;
            while (var7 == null) {
                String var12 = "Unknown error";
                this.method169("Requesting " + arg1, arg3, (byte) 108);
                Object var13 = null;
                try {
                    int var14 = 0;
                    DataInputStream var15 = this.method199(arg4 + arg5);
                    byte[] var16 = new byte[6];
                    var15.readFully(var16, 0, 6);
                    class3 var17 = new class3(var16, -990);
                    var17.field50 = 3;
                    int var18 = var17.method58() + 6;
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
                            this.method169("Loading " + arg1 + " - " + var23 + "%", arg3, (byte) 108);
                        }
                        var14 = var23;
                    }
                    var15.close();
                    try {
                        if (this.field636[0] != null) {
                            this.field636[0].method530(arg2, var7.length, var7, 0);
                        }
                    } catch (Exception var29) {
                        this.field636[0] = null;
                    }
                    if (var7 != null) {
                        this.field460.reset();
                        this.field460.update(var7);
                        int var24 = (int) this.field460.getValue();
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
                            this.method169("Game updated - please reload page", arg3, (byte) 108);
                            var26 = 10;
                        } else {
                            this.method169(var12 + " - Retrying in " + var26, arg3, (byte) 108);
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
                    this.field366 = !this.field366;
                }
            }
            return new class59(var7, 156);
        }
    }

    @OriginalMember(owner = "client!client", name = "G", descriptor = "(I)V")
    public final void method243(int arg0) {
        if (arg0 < 0 || arg0 > 0) {
            this.field527 = !this.field527;
        }
        if (this.field393 == 0) {
            int var2 = super.field1447;
            if (this.field192 == 1 && super.field1448 >= 516 && super.field1449 >= 160 && super.field1448 <= 765 && super.field1449 <= 205) {
                var2 = 0;
            }
            if (this.field310) {
                if (var2 != 1) {
                    int var3 = super.field1441;
                    int var4 = super.field1442;
                    if (this.field330 == 0) {
                        var3 -= 4;
                        var4 -= 4;
                    }
                    if (this.field330 == 1) {
                        var3 -= 553;
                        var4 -= 205;
                    }
                    if (this.field330 == 2) {
                        var3 -= 17;
                        var4 -= 357;
                    }
                    if (var3 < this.field331 - 10 || var3 > this.field333 + this.field331 + 10 || var4 < this.field332 - 10 || var4 > this.field334 + this.field332 + 10) {
                        this.field310 = false;
                        if (this.field330 == 1) {
                            this.field501 = true;
                        }
                        if (this.field330 == 2) {
                            this.field226 = true;
                        }
                    }
                }
                if (var2 == 1) {
                    int var5 = this.field331;
                    int var6 = this.field332;
                    int var7 = this.field333;
                    int var8 = super.field1448;
                    int var9 = super.field1449;
                    if (this.field330 == 0) {
                        var8 -= 4;
                        var9 -= 4;
                    }
                    if (this.field330 == 1) {
                        var8 -= 553;
                        var9 -= 205;
                    }
                    if (this.field330 == 2) {
                        var8 -= 17;
                        var9 -= 357;
                    }
                    int var10 = -1;
                    for (int var11 = 0; var11 < this.field344; ++var11) {
                        int var12 = (this.field344 - 1 - var11) * 15 + var6 + 31;
                        if (var8 > var5 && var8 < var5 + var7 && var9 > var12 - 13 && var9 < var12 + 3) {
                            var10 = var11;
                        }
                    }
                    if (var10 != -1) {
                        this.method248((byte) -47, var10);
                    }
                    this.field310 = false;
                    if (this.field330 == 1) {
                        this.field501 = true;
                    }
                    if (this.field330 == 2) {
                        this.field226 = true;
                        return;
                    }
                }
            } else {
                if (var2 == 1 && this.field344 > 0) {
                    int var13 = this.field180[this.field344 - 1];
                    if (var13 == 191 || var13 == 603 || var13 == 972 || var13 == 517 || var13 == 788 || var13 == 500 || var13 == 360 || var13 == 986 || var13 == 508 || var13 == 959 || var13 == 286 || var13 == 1690) {
                        int var14 = this.field178[this.field344 - 1];
                        int var15 = this.field179[this.field344 - 1];
                        class15 var16 = class15.method306(var15);
                        if (var16.field765 || var16.field751) {
                            this.field345 = false;
                            this.field246 = 0;
                            this.field391 = var15;
                            this.field392 = var14;
                            this.field393 = 2;
                            this.field394 = super.field1448;
                            this.field395 = super.field1449;
                            if (class15.method306(var15).field753 == this.field484) {
                                this.field393 = 1;
                            }
                            if (class15.method306(var15).field753 == this.field465) {
                                this.field393 = 3;
                            }
                            return;
                        }
                    }
                }
                if (var2 == 1 && (this.field439 == 1 || this.method206(1, this.field344 - 1)) && this.field344 > 2) {
                    var2 = 2;
                }
                if (var2 == 1 && this.field344 > 0) {
                    this.method248((byte) -47, this.field344 - 1);
                }
                if (var2 != 2 || this.field344 <= 0) {
                    return;
                }
                this.method176(0);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILFMDWWBSX;I)I")
    public final int method244(int arg0, class15 arg1, int arg2) {
        int var4 = 14 / arg0;
        if (arg1.field750 != null && arg2 < arg1.field750.length) {
            try {
                int[] var5 = arg1.field750[arg2];
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
                        var10 = this.field479[var5[var7++]];
                    }
                    if (var9 == 2) {
                        var10 = this.field438[var5[var7++]];
                    }
                    if (var9 == 3) {
                        var10 = this.field430[var5[var7++]];
                    }
                    if (var9 == 4) {
                        class15 var12 = class15.method306(var5[var7++]);
                        int var13 = var5[var7++];
                        if (var13 >= 0 && var13 < class45.field1287 && (!class45.method456(var13).field1262 || field373)) {
                            for (int var14 = 0; var14 < var12.field747.length; ++var14) {
                                if (var13 + 1 == var12.field747[var14]) {
                                    var10 += var12.field790[var14];
                                }
                            }
                        }
                    }
                    if (var9 == 5) {
                        var10 = this.field599[var5[var7++]];
                    }
                    if (var9 == 6) {
                        var10 = field652[this.field438[var5[var7++]] - 1];
                    }
                    if (var9 == 7) {
                        var10 = this.field599[var5[var7++]] * 100 / 46875;
                    }
                    if (var9 == 8) {
                        var10 = field623.field956;
                    }
                    if (var9 == 9) {
                        for (int var15 = 0; var15 < class28.field1008; ++var15) {
                            if (class28.field1010[var15]) {
                                var10 += this.field438[var15];
                            }
                        }
                    }
                    if (var9 == 10) {
                        class15 var16 = class15.method306(var5[var7++]);
                        int var17 = var5[var7++] + 1;
                        if (var17 >= 0 && var17 < class45.field1287 && (!class45.method456(var17).field1262 || field373)) {
                            for (int var18 = 0; var18 < var16.field747.length; ++var18) {
                                if (var16.field747[var18] == var17) {
                                    var10 = 999999999;
                                    break;
                                }
                            }
                        }
                    }
                    if (var9 == 11) {
                        var10 = this.field323;
                    }
                    if (var9 == 12) {
                        var10 = this.field591;
                    }
                    if (var9 == 13) {
                        int var19 = this.field599[var5[var7++]];
                        int var20 = var5[var7++];
                        var10 = (var19 & 1 << var20) != 0 ? 1 : 0;
                    }
                    if (var9 == 14) {
                        int var21 = var5[var7++];
                        class56 var22 = class56.field1489[var21];
                        int var23 = var22.field1491;
                        int var24 = var22.field1492;
                        int var25 = var22.field1493;
                        int var26 = field307[var25 - var24];
                        var10 = this.field599[var23] >> var24 & var26;
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
                        var10 = (field623.field884 >> 7) + this.field377;
                    }
                    if (var9 == 19) {
                        var10 = (field623.field885 >> 7) + this.field378;
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

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(ILFMDWWBSX;)Z")
    public final boolean method245(int arg0, class15 arg1) {
        int var3 = arg1.field805;
        if (arg0 != -6429) {
            this.field282 = !this.field282;
        }
        if ((var3 < 1 || var3 > 200) && (var3 < 701 || var3 > 900)) {
            if (var3 >= 401 && var3 <= 500) {
                this.field434[this.field344] = "Remove @whi@" + arg1.field764;
                this.field180[this.field344] = 281;
                ++this.field344;
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
            this.field434[this.field344] = "Remove @whi@" + this.field204[var3];
            this.field180[this.field344] = 921;
            ++this.field344;
            this.field434[this.field344] = "Message @whi@" + this.field204[var3];
            this.field180[this.field344] = 694;
            ++this.field344;
            return true;
        }
    }

    @OriginalMember(owner = "client!client", name = "m", descriptor = "(Z)Z")
    public final boolean method246(boolean arg0) {
        if (!arg0) {
            throw new NullPointerException();
        } else {
            return signlink.wavereplay();
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(BLjava/lang/String;)Z")
    public final boolean method247(byte arg0, String arg1) {
        if (arg1 == null) {
            return false;
        } else {
            for (int var3 = 0; var3 < this.field493; ++var3) {
                if (arg1.equalsIgnoreCase(this.field204[var3])) {
                    return true;
                }
            }
            if (arg0 == 7) {
                boolean var4 = false;
            } else {
                this.field600 = this.field485.method534();
            }
            return arg1.equalsIgnoreCase(field623.field953);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(BI)V")
    public final void method248(byte arg0, int arg1) {
        if (arg1 >= 0) {
            int var3 = this.field178[arg1];
            int var4 = this.field179[arg1];
            int var5 = this.field180[arg1];
            int var6 = this.field181[arg1];
            if (var5 >= 2000) {
                var5 -= 2000;
            }
            if (this.field646 != 0 && var5 != 1844) {
                this.field646 = 0;
                this.field226 = true;
            }
            if (var5 == 416 || var5 == 918) {
                String var7 = this.field434[arg1];
                int var8 = var7.indexOf("@whi@");
                if (var8 != -1) {
                    String var9 = var7.substring(var8 + 5).trim();
                    String var10 = class29.method327(class29.method324(true, class29.method323(var9)), (byte) 58);
                    boolean var11 = false;
                    for (int var12 = 0; var12 < this.field361; ++var12) {
                        class22 var13 = this.field360[this.field362[var12]];
                        if (var13 != null && var13.field953 != null && var13.field953.equalsIgnoreCase(var10)) {
                            this.method217(0, 0, var13.field906[0], false, (byte) 6, 1, var13.field905[0], 2, field623.field905[0], field623.field906[0], 1, 0);
                            if (var5 == 416) {
                                this.field483.method43(0, 195);
                                this.field483.method79(true, this.field362[var12]);
                            }
                            if (var5 == 918) {
                                if ((var6 & 3) == 0) {
                                    ++field624;
                                }
                                if (field624 >= 112) {
                                    this.field483.method43(0, 13);
                                    field624 = 0;
                                }
                                this.field483.method43(0, 176);
                                this.field483.method45(this.field362[var12]);
                            }
                            var11 = true;
                            break;
                        }
                    }
                    if (!var11) {
                        this.method192("", "Unable to find " + var10, 0, this.field369);
                    }
                }
            }
            if (var5 == 124) {
                class22 var14 = this.field360[var6];
                if (var14 != null) {
                    this.method217(0, 0, var14.field906[0], false, (byte) 6, 1, var14.field905[0], 2, field623.field905[0], field623.field906[0], 1, 0);
                    this.field549 = super.field1448;
                    this.field550 = super.field1449;
                    this.field552 = 2;
                    this.field551 = 0;
                    ++field173;
                    if (field173 >= 85) {
                        this.field483.method43(0, 212);
                        this.field483.method48(0);
                        field173 = 0;
                    }
                    this.field483.method43(0, 251);
                    this.field483.method79(true, var6);
                }
            }
            if (var5 == 5) {
                boolean var15 = this.method217(0, 0, var4, false, (byte) 6, 0, var3, 2, field623.field905[0], field623.field906[0], 0, 0);
                if (!var15) {
                    this.method217(0, 0, var4, false, (byte) 6, 1, var3, 2, field623.field905[0], field623.field906[0], 1, 0);
                }
                this.field549 = super.field1448;
                this.field550 = super.field1449;
                this.field552 = 2;
                this.field551 = 0;
                this.field483.method43(0, 14);
                this.field483.method45(this.field377 + var3);
                this.field483.method80(this.field304, var6);
                this.field483.method78(this.field640, this.field378 + var4);
            }
            if (var5 == 530) {
                this.method215(var3, var6, var4, -461);
                this.field483.method43(0, 185);
                this.field483.method45(this.field378 + var4);
                this.field483.method78(this.field640, this.field377 + var3);
                this.field483.method78(this.field640, var6 >> 14 & 32767);
            }
            if (var5 == 125) {
                this.field483.method43(0, 50);
                this.field483.method45(var4);
                class15 var17 = class15.method306(var4);
                if (var17.field750 != null && var17.field750[0][0] == 5) {
                    int var18 = var17.field750[0][1];
                    this.field599[var18] = 1 - this.field599[var18];
                    this.method155((byte) 5, var18);
                    this.field501 = true;
                }
            }
            if (var5 == 986) {
                this.field483.method43(0, 63);
                this.field483.method45(var6);
                this.field483.method79(true, var4);
                this.field483.method80(this.field304, var3);
                this.field523 = 0;
                this.field524 = var4;
                this.field525 = var3;
                this.field526 = 2;
                if (class15.method306(var4).field753 == this.field484) {
                    this.field526 = 1;
                }
                if (class15.method306(var4).field753 == this.field465) {
                    this.field526 = 3;
                }
            }
            if (var5 == 191) {
                this.field483.method43(0, 201);
                this.field483.method79(true, var3);
                this.field483.method79(true, var4);
                this.field483.method79(true, var6);
                this.field523 = 0;
                this.field524 = var4;
                this.field525 = var3;
                this.field526 = 2;
                if (class15.method306(var4).field753 == this.field484) {
                    this.field526 = 1;
                }
                if (class15.method306(var4).field753 == this.field465) {
                    this.field526 = 3;
                }
            }
            if (var5 == 58) {
                this.method215(var3, var6, var4, -461);
                this.field483.method43(0, 86);
                this.field483.method78(this.field640, this.field378 + var4);
                this.field483.method79(true, this.field377 + var3);
                this.field483.method45(var6 >> 14 & 32767);
            }
            if (var5 == 1690) {
                class45 var19 = class45.method456(var6);
                class15 var20 = class15.method306(var4);
                String var21;
                if (var20 != null && var20.field790[var3] >= 100000) {
                    var21 = var20.field790[var3] + " x " + var19.field1269;
                } else if (var19.field1277 != null) {
                    var21 = new String(var19.field1277);
                } else {
                    var21 = "It's a " + var19.field1269 + ".";
                }
                this.method192("", var21, 0, this.field369);
            }
            if (var5 == 788) {
                this.field483.method43(0, 113);
                this.field483.method80(this.field304, var4);
                this.field483.method45(var3);
                this.field483.method78(this.field640, var6);
                this.field523 = 0;
                this.field524 = var4;
                this.field525 = var3;
                this.field526 = 2;
                if (class15.method306(var4).field753 == this.field484) {
                    this.field526 = 1;
                }
                if (class15.method306(var4).field753 == this.field465) {
                    this.field526 = 3;
                }
            }
            if (var5 == 760 && this.method215(var3, var6, var4, -461)) {
                this.field483.method43(0, 213);
                this.field483.method45(var6 >> 14 & 32767);
                this.field483.method45(this.field534);
                this.field483.method80(this.field304, this.field377 + var3);
                this.field483.method79(true, this.field535);
                this.field483.method78(this.field640, this.field533);
                this.field483.method80(this.field304, this.field378 + var4);
            }
            if (var5 == 827) {
                this.method205(this.field554, -964);
                this.field554 = -1;
                this.field226 = true;
            }
            if (var5 == 482) {
                boolean var22 = this.method217(0, 0, var4, false, (byte) 6, 0, var3, 2, field623.field905[0], field623.field906[0], 0, 0);
                if (!var22) {
                    this.method217(0, 0, var4, false, (byte) 6, 1, var3, 2, field623.field905[0], field623.field906[0], 1, 0);
                }
                this.field549 = super.field1448;
                this.field550 = super.field1449;
                this.field552 = 2;
                this.field551 = 0;
                this.field483.method43(0, 11);
                this.field483.method79(true, this.field377 + var3);
                this.field483.method45(var6);
                this.field483.method78(this.field640, this.field378 + var4);
                this.field483.method45(this.field193);
            }
            if (var5 == 329) {
                class22 var24 = this.field360[var6];
                if (var24 != null) {
                    this.method217(0, 0, var24.field906[0], false, (byte) 6, 1, var24.field905[0], 2, field623.field905[0], field623.field906[0], 1, 0);
                    this.field549 = super.field1448;
                    this.field550 = super.field1449;
                    this.field552 = 2;
                    this.field551 = 0;
                    this.field483.method43(0, 84);
                    this.field483.method45(var6);
                }
            }
            if (var5 == 903) {
                if (!this.field310) {
                    this.field306.method411(super.field1448 - 4, -613, super.field1449 - 4);
                } else {
                    this.field306.method411(var3 - 4, -613, var4 - 4);
                }
            }
            if (var5 == 307) {
                boolean var25 = this.method217(0, 0, var4, false, (byte) 6, 0, var3, 2, field623.field905[0], field623.field906[0], 0, 0);
                if (!var25) {
                    this.method217(0, 0, var4, false, (byte) 6, 1, var3, 2, field623.field905[0], field623.field906[0], 1, 0);
                }
                this.field549 = super.field1448;
                this.field550 = super.field1449;
                this.field552 = 2;
                this.field551 = 0;
                this.field483.method43(0, 215);
                this.field483.method79(true, this.field378 + var4);
                this.field483.method79(true, var6);
                this.field483.method79(true, this.field377 + var3);
            }
            if (var5 == 817) {
                this.field483.method43(0, 224);
                this.field483.method78(this.field640, var3);
                this.field483.method78(this.field640, this.field193);
                this.field483.method79(true, var4);
                this.field483.method80(this.field304, var6);
                this.field523 = 0;
                this.field524 = var4;
                this.field525 = var3;
                this.field526 = 2;
                if (class15.method306(var4).field753 == this.field484) {
                    this.field526 = 1;
                }
                if (class15.method306(var4).field753 == this.field465) {
                    this.field526 = 3;
                }
            }
            if (var5 == 414) {
                String var27 = this.field434[arg1];
                int var28 = var27.indexOf("@whi@");
                if (var28 != -1) {
                    if (this.field484 == -1) {
                        this.method260(true);
                        this.field581 = var27.substring(var28 + 5).trim();
                        this.field322 = false;
                        this.field405 = this.field484 = class15.field777;
                    } else {
                        this.method192("", "Please close the interface you have open before using 'report abuse'", 0, this.field369);
                    }
                }
            }
            if (var5 == 995) {
                boolean var29 = this.method217(0, 0, var4, false, (byte) 6, 0, var3, 2, field623.field905[0], field623.field906[0], 0, 0);
                if (!var29) {
                    this.method217(0, 0, var4, false, (byte) 6, 1, var3, 2, field623.field905[0], field623.field906[0], 1, 0);
                }
                this.field549 = super.field1448;
                this.field550 = super.field1449;
                this.field552 = 2;
                this.field551 = 0;
                if ((this.field377 & 3) == 0) {
                    ++field375;
                }
                if (field375 >= 130) {
                    this.field483.method43(0, 150);
                    this.field483.method44(244);
                    field375 = 0;
                }
                this.field483.method43(0, 30);
                this.field483.method79(true, this.field378 + var4);
                this.field483.method45(this.field377 + var3);
                this.field483.method78(this.field640, var6);
            }
            if (var5 == 1237) {
                this.method215(var3, var6, var4, -461);
                this.field483.method43(0, 236);
                this.field483.method80(this.field304, this.field377 + var3);
                this.field483.method78(this.field640, var6 >> 14 & 32767);
                this.field483.method79(true, this.field378 + var4);
            }
            if (var5 == 500) {
                this.field483.method43(0, 71);
                this.field483.method45(var6);
                this.field483.method45(var3);
                this.field483.method80(this.field304, var4);
                this.field523 = 0;
                this.field524 = var4;
                this.field525 = var3;
                this.field526 = 2;
                if (class15.method306(var4).field753 == this.field484) {
                    this.field526 = 1;
                }
                if (class15.method306(var4).field753 == this.field465) {
                    this.field526 = 3;
                }
            }
            if (var5 == 977) {
                class2 var31 = this.field504[var6];
                if (var31 != null) {
                    this.method217(0, 0, var31.field906[0], false, (byte) 6, 1, var31.field905[0], 2, field623.field905[0], field623.field906[0], 1, 0);
                    this.field549 = super.field1448;
                    this.field550 = super.field1449;
                    this.field552 = 2;
                    this.field551 = 0;
                    if ((var6 & 3) == 0) {
                        ++field481;
                    }
                    if (field481 >= 126) {
                        this.field483.method43(0, 235);
                        this.field483.method47(4893544);
                        field481 = 0;
                    }
                    this.field483.method43(0, 99);
                    this.field483.method78(this.field640, var6);
                }
            }
            if (var5 == 322) {
                class22 var32 = this.field360[var6];
                if (var32 != null) {
                    this.method217(0, 0, var32.field906[0], false, (byte) 6, 1, var32.field905[0], 2, field623.field905[0], field623.field906[0], 1, 0);
                    this.field549 = super.field1448;
                    this.field550 = super.field1449;
                    this.field552 = 2;
                    this.field551 = 0;
                    this.field483.method43(0, 96);
                    this.field483.method45(this.field193);
                    this.field483.method80(this.field304, var6);
                }
            }
            if (var5 == 526) {
                class2 var33 = this.field504[var6];
                if (var33 != null) {
                    this.method217(0, 0, var33.field906[0], false, (byte) 6, 1, var33.field905[0], 2, field623.field905[0], field623.field906[0], 1, 0);
                    this.field549 = super.field1448;
                    this.field550 = super.field1449;
                    this.field552 = 2;
                    this.field551 = 0;
                    field592 += var6;
                    if (field592 >= 144) {
                        this.field483.method43(0, 48);
                        field592 = 0;
                    }
                    this.field483.method43(0, 216);
                    this.field483.method79(true, var6);
                }
            }
            if (var5 == 112) {
                class2 var34 = this.field504[var6];
                if (var34 != null) {
                    this.method217(0, 0, var34.field906[0], false, (byte) 6, 1, var34.field905[0], 2, field623.field905[0], field623.field906[0], 1, 0);
                    this.field549 = super.field1448;
                    this.field550 = super.field1449;
                    this.field552 = 2;
                    this.field551 = 0;
                    this.field483.method43(0, 117);
                    this.field483.method45(var6);
                }
            }
            if (var5 == 304) {
                this.method215(var3, var6, var4, -461);
                this.field483.method43(0, 119);
                this.field483.method78(this.field640, this.field377 + var3);
                this.field483.method80(this.field304, var6 >> 14 & 32767);
                this.field483.method78(this.field640, this.field378 + var4);
            }
            if (var5 == 246) {
                class22 var35 = this.field360[var6];
                if (var35 != null) {
                    this.method217(0, 0, var35.field906[0], false, (byte) 6, 1, var35.field905[0], 2, field623.field905[0], field623.field906[0], 1, 0);
                    this.field549 = super.field1448;
                    this.field550 = super.field1449;
                    this.field552 = 2;
                    this.field551 = 0;
                    this.field483.method43(0, 195);
                    this.field483.method79(true, var6);
                }
            }
            if (var5 == 360) {
                this.field483.method43(0, 61);
                this.field483.method45(var4);
                this.field483.method78(this.field640, var3);
                this.field483.method45(var6);
                this.field523 = 0;
                this.field524 = var4;
                this.field525 = var3;
                this.field526 = 2;
                if (class15.method306(var4).field753 == this.field484) {
                    this.field526 = 1;
                }
                if (class15.method306(var4).field753 == this.field465) {
                    this.field526 = 3;
                }
            }
            if (var5 == 453) {
                class22 var36 = this.field360[var6];
                if (var36 != null) {
                    this.method217(0, 0, var36.field906[0], false, (byte) 6, 1, var36.field905[0], 2, field623.field905[0], field623.field906[0], 1, 0);
                    this.field549 = super.field1448;
                    this.field550 = super.field1449;
                    this.field552 = 2;
                    this.field551 = 0;
                    this.field483.method43(0, 103);
                    this.field483.method80(this.field304, this.field534);
                    this.field483.method80(this.field304, this.field535);
                    this.field483.method78(this.field640, var6);
                    this.field483.method80(this.field304, this.field533);
                }
            }
            if (var5 == 517) {
                this.field483.method43(0, 98);
                this.field483.method79(true, var3);
                this.field483.method78(this.field640, var6);
                this.field483.method79(true, var4);
                this.field523 = 0;
                this.field524 = var4;
                this.field525 = var3;
                this.field526 = 2;
                if (class15.method306(var4).field753 == this.field484) {
                    this.field526 = 1;
                }
                if (class15.method306(var4).field753 == this.field465) {
                    this.field526 = 3;
                }
            }
            if (var5 == 1260) {
                class45 var37 = class45.method456(var6);
                String var38;
                if (var37.field1277 != null) {
                    var38 = new String(var37.field1277);
                } else {
                    var38 = "It's a " + var37.field1269 + ".";
                }
                this.method192("", var38, 0, this.field369);
            }
            if (var5 == 764) {
                class22 var39 = this.field360[var6];
                if (var39 != null) {
                    this.method217(0, 0, var39.field906[0], false, (byte) 6, 1, var39.field905[0], 2, field623.field905[0], field623.field906[0], 1, 0);
                    this.field549 = super.field1448;
                    this.field550 = super.field1449;
                    this.field552 = 2;
                    this.field551 = 0;
                    this.field483.method43(0, 34);
                    this.field483.method78(this.field640, var6);
                }
            }
            if (var5 == 1170) {
                class2 var40 = this.field504[var6];
                if (var40 != null) {
                    class49 var41 = var40.field25;
                    if (var41.field1379 != null) {
                        var41 = var41.method504(0);
                    }
                    if (var41 != null) {
                        String var42;
                        if (var41.field1352 != null) {
                            var42 = new String(var41.field1352);
                        } else {
                            var42 = "It's a " + var41.field1368 + ".";
                        }
                        this.method192("", var42, 0, this.field369);
                    }
                }
            }
            if (var5 == 565) {
                class15 var43 = class15.method306(var4);
                this.field192 = 1;
                this.field193 = var4;
                this.field194 = var43.field769;
                this.field532 = 0;
                this.field501 = true;
                String var44 = var43.field806;
                if (var44.indexOf(" ") != -1) {
                    var44 = var44.substring(0, var44.indexOf(" "));
                }
                String var45 = var43.field806;
                if (var45.indexOf(" ") != -1) {
                    var45 = var45.substring(var45.indexOf(" ") + 1);
                }
                this.field195 = var44 + " " + var43.field756 + " " + var45;
                if (this.field194 == 16) {
                    this.field501 = true;
                    this.field431 = 3;
                    this.field425 = true;
                }
            } else {
                if (var5 == 947) {
                    class2 var46 = this.field504[var6];
                    if (var46 != null) {
                        this.method217(0, 0, var46.field906[0], false, (byte) 6, 1, var46.field905[0], 2, field623.field905[0], field623.field906[0], 1, 0);
                        this.field549 = super.field1448;
                        this.field550 = super.field1449;
                        this.field552 = 2;
                        this.field551 = 0;
                        this.field483.method43(0, 137);
                        this.field483.method79(true, this.field193);
                        this.field483.method79(true, var6);
                    }
                }
                if (var5 == 694) {
                    String var47 = this.field434[arg1];
                    int var48 = var47.indexOf("@whi@");
                    if (var48 != -1) {
                        long var49 = class29.method323(var47.substring(var48 + 5).trim());
                        int var51 = -1;
                        for (int var52 = 0; var52 < this.field493; ++var52) {
                            if (this.field189[var52] == var49) {
                                var51 = var52;
                                break;
                            }
                        }
                        if (var51 != -1 && this.field268[var51] > 0) {
                            this.field226 = true;
                            this.field646 = 0;
                            this.field340 = true;
                            this.field191 = "";
                            this.field657 = 3;
                            this.field572 = this.field189[var51];
                            this.field222 = "Enter message to send to " + this.field204[var51];
                        }
                    }
                }
                if (var5 == 14) {
                    this.field483.method43(0, 50);
                    this.field483.method45(var4);
                    class15 var53 = class15.method306(var4);
                    if (var53.field750 != null && var53.field750[0][0] == 5) {
                        int var54 = var53.field750[0][1];
                        if (this.field599[var54] != var53.field773[0]) {
                            this.field599[var54] = var53.field773[0];
                            this.method155((byte) 5, var54);
                            this.field501 = true;
                        }
                    }
                }
                if (var5 == 479) {
                    this.method215(var3, var6, var4, -461);
                    this.field483.method43(0, 59);
                    this.field483.method79(true, this.field378 + var4);
                    this.field483.method45(this.field377 + var3);
                    this.field483.method45(var6 >> 14 & 32767);
                }
                if (var5 == 959) {
                    this.field483.method43(0, 65);
                    this.field483.method80(this.field304, var6);
                    this.field483.method80(this.field304, var3);
                    this.field483.method79(true, var4);
                    this.field523 = 0;
                    this.field524 = var4;
                    this.field525 = var3;
                    this.field526 = 2;
                    if (class15.method306(var4).field753 == this.field484) {
                        this.field526 = 1;
                    }
                    if (class15.method306(var4).field753 == this.field465) {
                        this.field526 = 3;
                    }
                }
                if (var5 == 270) {
                    boolean var55 = this.method217(0, 0, var4, false, (byte) 6, 0, var3, 2, field623.field905[0], field623.field906[0], 0, 0);
                    if (!var55) {
                        this.method217(0, 0, var4, false, (byte) 6, 1, var3, 2, field623.field905[0], field623.field906[0], 1, 0);
                    }
                    this.field549 = super.field1448;
                    this.field550 = super.field1449;
                    this.field552 = 2;
                    this.field551 = 0;
                    this.field483.method43(0, 62);
                    this.field483.method45(this.field378 + var4);
                    this.field483.method45(var6);
                    this.field483.method79(true, this.field377 + var3);
                }
                if (var5 == 508) {
                    this.field483.method43(0, 193);
                    this.field483.method45(var3);
                    this.field483.method80(this.field304, var4);
                    this.field483.method80(this.field304, var6);
                    this.field523 = 0;
                    this.field524 = var4;
                    this.field525 = var3;
                    this.field526 = 2;
                    if (class15.method306(var4).field753 == this.field484) {
                        this.field526 = 1;
                    }
                    if (class15.method306(var4).field753 == this.field465) {
                        this.field526 = 3;
                    }
                }
                if (var5 == 403) {
                    class22 var57 = this.field360[var6];
                    if (var57 != null) {
                        this.method217(0, 0, var57.field906[0], false, (byte) 6, 1, var57.field905[0], 2, field623.field905[0], field623.field906[0], 1, 0);
                        this.field549 = super.field1448;
                        this.field550 = super.field1449;
                        this.field552 = 2;
                        this.field551 = 0;
                        if ((var6 & 3) == 0) {
                            ++field624;
                        }
                        if (field624 >= 112) {
                            this.field483.method43(0, 13);
                            field624 = 0;
                        }
                        this.field483.method43(0, 176);
                        this.field483.method45(var6);
                    }
                }
                if (var5 == 106 || var5 == 872 || var5 == 921 || var5 == 281) {
                    String var58 = this.field434[arg1];
                    int var59 = var58.indexOf("@whi@");
                    if (var59 != -1) {
                        long var60 = class29.method323(var58.substring(var59 + 5).trim());
                        if (var5 == 106) {
                            this.method163(var60, -872);
                        }
                        if (var5 == 872) {
                            this.method204(false, var60);
                        }
                        if (var5 == 921) {
                            this.method290(true, var60);
                        }
                        if (var5 == 281) {
                            this.method171(291, var60);
                        }
                    }
                }
                if (var5 == 253) {
                    class15 var62 = class15.method306(var4);
                    boolean var63 = true;
                    if (var62.field805 > 0) {
                        var63 = this.method209(var62, 2);
                    }
                    if (var63) {
                        this.field483.method43(0, 50);
                        this.field483.method45(var4);
                    }
                }
                if (var5 == 435) {
                    boolean var64 = this.method217(0, 0, var4, false, (byte) 6, 0, var3, 2, field623.field905[0], field623.field906[0], 0, 0);
                    if (!var64) {
                        this.method217(0, 0, var4, false, (byte) 6, 1, var3, 2, field623.field905[0], field623.field906[0], 1, 0);
                    }
                    this.field549 = super.field1448;
                    this.field550 = super.field1449;
                    this.field552 = 2;
                    this.field551 = 0;
                    field635 += var6;
                    if (field635 >= 111) {
                        this.field483.method43(0, 73);
                        this.field483.method47(6333090);
                        field635 = 0;
                    }
                    this.field483.method43(0, 67);
                    this.field483.method79(true, this.field377 + var3);
                    this.field483.method80(this.field304, var6);
                    this.field483.method79(true, this.field378 + var4);
                }
                if (var5 == 151) {
                    this.field483.method43(0, 169);
                    this.field483.method79(true, var3);
                    this.field483.method80(this.field304, this.field535);
                    this.field483.method79(true, this.field534);
                    this.field483.method79(true, var6);
                    this.field483.method78(this.field640, var4);
                    this.field483.method78(this.field640, this.field533);
                    this.field523 = 0;
                    this.field524 = var4;
                    this.field525 = var3;
                    this.field526 = 2;
                    if (class15.method306(var4).field753 == this.field484) {
                        this.field526 = 1;
                    }
                    if (class15.method306(var4).field753 == this.field465) {
                        this.field526 = 3;
                    }
                }
                if (var5 == 709) {
                    class2 var66 = this.field504[var6];
                    if (var66 != null) {
                        this.method217(0, 0, var66.field906[0], false, (byte) 6, 1, var66.field905[0], 2, field623.field905[0], field623.field906[0], 1, 0);
                        this.field549 = super.field1448;
                        this.field550 = super.field1449;
                        this.field552 = 2;
                        this.field551 = 0;
                        this.field483.method43(0, 39);
                        this.field483.method80(this.field304, var6);
                    }
                }
                if (var5 == 286) {
                    this.field532 = 1;
                    this.field533 = var3;
                    this.field534 = var4;
                    this.field535 = var6;
                    this.field536 = String.valueOf(class45.method456(var6).field1269);
                    this.field192 = 0;
                    this.field501 = true;
                } else {
                    if (var5 == 727) {
                        this.method260(true);
                    }
                    if (var5 == 1551) {
                        int var67 = var6 >> 14 & 32767;
                        class68 var68 = class68.method575(var67);
                        String var69;
                        if (var68.field1713 != null) {
                            var69 = new String(var68.field1713);
                        } else {
                            var69 = "It's a " + var68.field1699 + ".";
                        }
                        this.method192("", var69, 0, this.field369);
                    }
                    if (var5 == 963) {
                        class2 var70 = this.field504[var6];
                        if (var70 != null) {
                            this.method217(0, 0, var70.field906[0], false, (byte) 6, 1, var70.field905[0], 2, field623.field905[0], field623.field906[0], 1, 0);
                            this.field549 = super.field1448;
                            this.field550 = super.field1449;
                            this.field552 = 2;
                            this.field551 = 0;
                            this.field483.method43(0, 206);
                            this.field483.method45(this.field535);
                            this.field483.method78(this.field640, this.field534);
                            this.field483.method80(this.field304, this.field533);
                            this.field483.method79(true, var6);
                        }
                    }
                    if (var5 == 741) {
                        class2 var71 = this.field504[var6];
                        if (var71 != null) {
                            this.method217(0, 0, var71.field906[0], false, (byte) 6, 1, var71.field905[0], 2, field623.field905[0], field623.field906[0], 1, 0);
                            this.field549 = super.field1448;
                            this.field550 = super.field1449;
                            this.field552 = 2;
                            this.field551 = 0;
                            this.field483.method43(0, 10);
                            this.field483.method79(true, var6);
                        }
                    }
                    if (var5 == 212) {
                        boolean var72 = this.method217(0, 0, var4, false, (byte) 6, 0, var3, 2, field623.field905[0], field623.field906[0], 0, 0);
                        if (!var72) {
                            this.method217(0, 0, var4, false, (byte) 6, 1, var3, 2, field623.field905[0], field623.field906[0], 1, 0);
                        }
                        this.field549 = super.field1448;
                        this.field550 = super.field1449;
                        this.field552 = 2;
                        this.field551 = 0;
                        this.field483.method43(0, 226);
                        this.field483.method78(this.field640, this.field377 + var3);
                        this.field483.method45(var6);
                        this.field483.method45(this.field534);
                        this.field483.method78(this.field640, this.field533);
                        this.field483.method79(true, this.field378 + var4);
                        this.field483.method79(true, this.field535);
                    }
                    if (var5 == 683 && !this.field295) {
                        this.field483.method43(0, 105);
                        this.field483.method45(var4);
                        this.field295 = true;
                    }
                    if (var5 == 603) {
                        this.field483.method43(0, 159);
                        this.field483.method79(true, var6);
                        this.field483.method80(this.field304, var4);
                        this.field483.method45(var3);
                        this.field523 = 0;
                        this.field524 = var4;
                        this.field525 = var3;
                        this.field526 = 2;
                        if (class15.method306(var4).field753 == this.field484) {
                            this.field526 = 1;
                        }
                        if (class15.method306(var4).field753 == this.field465) {
                            this.field526 = 3;
                        }
                    }
                    if (var5 == 972) {
                        this.field483.method43(0, 244);
                        this.field483.method80(this.field304, var6);
                        this.field483.method80(this.field304, var4);
                        this.field483.method79(true, var3);
                        this.field523 = 0;
                        this.field524 = var4;
                        this.field525 = var3;
                        this.field526 = 2;
                        if (class15.method306(var4).field753 == this.field484) {
                            this.field526 = 1;
                        }
                        if (class15.method306(var4).field753 == this.field465) {
                            this.field526 = 3;
                        }
                    }
                    if (var5 == 625 && this.method215(var3, var6, var4, -461)) {
                        this.field483.method43(0, 173);
                        this.field483.method79(true, this.field377 + var3);
                        this.field483.method80(this.field304, this.field193);
                        this.field483.method79(true, var6 >> 14 & 32767);
                        this.field483.method45(this.field378 + var4);
                    }
                    this.field532 = 0;
                    if (arg0 != -47) {
                        this.field483.method44(179);
                    }
                    this.field192 = 0;
                    this.field501 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(IZ)V")
    public final void method249(int arg0, boolean arg1) {
        if (field623.field884 >> 7 == this.field422 && field623.field885 >> 7 == this.field423) {
            this.field422 = 0;
        }
        int var3 = this.field361;
        if (arg0 >= 1 && arg0 <= 1) {
            if (arg1) {
                var3 = 1;
            }
            for (int var4 = 0; var4 < var3; ++var4) {
                class22 var5;
                int var6;
                if (arg1) {
                    var5 = field623;
                    var6 = this.field359 << 14;
                } else {
                    var5 = this.field360[this.field362[var4]];
                    var6 = this.field362[var4] << 14;
                }
                if (var5 != null && var5.method41(122)) {
                    var5.field947 = false;
                    if ((field374 && this.field361 > 50 || this.field361 > 200) && !arg1 && var5.field880 == var5.field862) {
                        var5.field947 = true;
                    }
                    int var7 = var5.field884 >> 7;
                    int var8 = var5.field885 >> 7;
                    if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                        if (var5.field936 != null && field564 >= var5.field950 && field564 < var5.field951) {
                            var5.field947 = false;
                            var5.field929 = this.method190(0, var5.field885, this.field272, var5.field884);
                            this.field306.method385(var5, (byte) 2, var5.field885, this.field272, var5.field884, var5.field943, var6, var5.field886, var5.field929, var5.field946, 60, var5.field944, var5.field945);
                        } else {
                            if ((var5.field884 & 127) == 64 && (var5.field885 & 127) == 64) {
                                if (this.field390[var7][var8] == this.field187) {
                                    continue;
                                }
                                this.field390[var7][var8] = this.field187;
                            }
                            var5.field929 = this.method190(0, var5.field885, this.field272, var5.field884);
                            this.field306.method384(var5.field886, this.field272, var5.field885, 60, var5.field929, var5, var6, var5.field917, (byte) 3, var5.field884);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(IILBFQIDHPO;)V")
    private final void method250(int arg0, int arg1, class3 arg2) {
        while (true) {
            if (arg2.field51 + 21 < arg0 * 8) {
                int var4 = arg2.method65((byte) 88, 14);
                if (var4 != 16383) {
                    if (this.field504[var4] == null) {
                        this.field504[var4] = new class2();
                    }
                    class2 var5 = this.field504[var4];
                    this.field506[this.field505++] = var4;
                    var5.field883 = field564;
                    var5.field25 = class49.method501(arg2.method65((byte) 88, 13));
                    int var6 = arg2.method65((byte) 88, 5);
                    if (var6 > 15) {
                        var6 -= 32;
                    }
                    int var7 = arg2.method65((byte) 88, 5);
                    if (var7 > 15) {
                        var7 -= 32;
                    }
                    int var8 = arg2.method65((byte) 88, 1);
                    int var9 = arg2.method65((byte) 88, 1);
                    if (var9 == 1) {
                        this.field364[this.field363++] = var4;
                    }
                    var5.field874 = var5.field25.field1363;
                    var5.field895 = var5.field25.field1358;
                    var5.field864 = var5.field25.field1375;
                    var5.field865 = var5.field25.field1377;
                    var5.field866 = var5.field25.field1351;
                    var5.field867 = var5.field25.field1381;
                    var5.field862 = var5.field25.field1386;
                    var5.method316(field623.field906[0] + var7, var8 == 1, (byte) 6, field623.field905[0] + var6);
                    continue;
                }
            }
            arg2.method66(false);
            if (arg1 < 0) {
                return;
            }
            for (int var10 = 1; var10 > 0; ++var10) {
            }
            return;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILBFQIDHPO;B)V")
    private final void method251(int arg0, class3 arg1, byte arg2) {
        while (true) {
            if (arg1.field51 + 10 < arg0 * 8) {
                int var4 = arg1.method65((byte) 88, 11);
                if (var4 != 2047) {
                    if (this.field360[var4] == null) {
                        this.field360[var4] = new class22();
                        if (this.field365[var4] != null) {
                            this.field360[var4].method321((byte) 5, this.field365[var4]);
                        }
                    }
                    this.field362[this.field361++] = var4;
                    class22 var5 = this.field360[var4];
                    var5.field883 = field564;
                    int var6 = arg1.method65((byte) 88, 5);
                    if (var6 > 15) {
                        var6 -= 32;
                    }
                    int var7 = arg1.method65((byte) 88, 5);
                    if (var7 > 15) {
                        var7 -= 32;
                    }
                    int var8 = arg1.method65((byte) 88, 1);
                    int var9 = arg1.method65((byte) 88, 1);
                    if (var9 == 1) {
                        this.field364[this.field363++] = var4;
                    }
                    var5.method316(field623.field906[0] + var7, var8 == 1, (byte) 6, field623.field905[0] + var6);
                    continue;
                }
            }
            arg1.method66(false);
            if (arg2 != -37) {
                this.field300 = this.field485.method534();
                return;
            }
            return;
        }
    }

    @OriginalMember(owner = "client!client", name = "n", descriptor = "(Z)V")
    private final void method252(boolean arg0) {
        class26 var2 = (class26) this.field218.method598();
        this.field250 &= arg0;
        while (var2 != null) {
            if (var2.field982 == -1) {
                var2.field978 = 0;
                this.method293(var2, (byte) 3);
            } else {
                var2.method329();
            }
            var2 = (class26) this.field218.method600(4);
        }
    }

    @OriginalMember(owner = "client!client", name = "H", descriptor = "(I)V")
    public final void method253(int arg0) {
        if (this.field584 != 0) {
            class5 var2 = this.field325;
            int var3 = 0;
            if (this.field238 != 0) {
                var3 = 1;
            }
            for (int var4 = 0; var4 < 100; ++var4) {
                if (this.field639[var4] != null) {
                    int var5 = this.field637[var4];
                    String var6 = this.field638[var4];
                    byte var7 = 0;
                    if (var6 != null && var6.startsWith("@cr1@")) {
                        var6 = var6.substring(5);
                        var7 = 1;
                    }
                    if (var6 != null && var6.startsWith("@cr2@")) {
                        var6 = var6.substring(5);
                        var7 = 2;
                    }
                    if ((var5 == 3 || var5 == 7) && (var5 == 7 || this.field459 == 0 || this.field459 == 1 && this.method247((byte) 7, var6))) {
                        int var8 = 329 - var3 * 13;
                        byte var9 = 4;
                        var2.method100(var8, "From", 20424, var9, 0);
                        var2.method100(var8 - 1, "From", 20424, var9, 65535);
                        int var10 = var9 + var2.method98("From ", 2);
                        if (var7 == 1) {
                            this.field183[0].method446(var8 - 12, (byte) 3, var10);
                            var10 += 14;
                        }
                        if (var7 == 2) {
                            this.field183[1].method446(var8 - 12, (byte) 3, var10);
                            var10 += 14;
                        }
                        var2.method100(var8, var6 + ": " + this.field639[var4], 20424, var10, 0);
                        var2.method100(var8 - 1, var6 + ": " + this.field639[var4], 20424, var10, 65535);
                        ++var3;
                        if (var3 >= 5) {
                            return;
                        }
                    }
                    if (var5 == 5 && this.field459 < 2) {
                        int var11 = 329 - var3 * 13;
                        var2.method100(var11, this.field639[var4], 20424, 4, 0);
                        var2.method100(var11 - 1, this.field639[var4], 20424, 4, 65535);
                        ++var3;
                        if (var3 >= 5) {
                            return;
                        }
                    }
                    if (var5 == 6 && this.field459 < 2) {
                        int var12 = 329 - var3 * 13;
                        var2.method100(var12, "To " + var6 + ": " + this.field639[var4], 20424, 4, 0);
                        var2.method100(var12 - 1, "To " + var6 + ": " + this.field639[var4], 20424, 4, 65535);
                        ++var3;
                        if (var3 >= 5) {
                            return;
                        }
                    }
                }
            }
            this.field232 += arg0;
        }
    }

    @OriginalMember(owner = "client!client", name = "o", descriptor = "(Z)V")
    public final void method254(boolean arg0) {
        if (this.field205 == null) {
            super.field1434 = null;
            this.field355 = null;
            this.field353 = null;
            this.field352 = null;
            this.field354 = null;
            this.field262 = null;
            this.field263 = null;
            this.field264 = null;
            this.field208 = new class71(field260, this.method271(-319), 128, 265);
            class8.method141(true);
            this.field209 = new class71(field260, this.method271(-319), 128, 265);
            class8.method141(true);
            this.field205 = new class71(field260, this.method271(-319), 509, 171);
            class8.method141(true);
            if (arg0) {
                this.field233 = this.field404.method54();
            }
            this.field206 = new class71(field260, this.method271(-319), 360, 132);
            class8.method141(true);
            this.field207 = new class71(field260, this.method271(-319), 360, 200);
            class8.method141(true);
            this.field210 = new class71(field260, this.method271(-319), 202, 238);
            class8.method141(true);
            this.field211 = new class71(field260, this.method271(-319), 203, 238);
            class8.method141(true);
            this.field212 = new class71(field260, this.method271(-319), 74, 94);
            class8.method141(true);
            this.field213 = new class71(field260, this.method271(-319), 75, 94);
            class8.method141(true);
            if (this.field540 != null) {
                this.method232(20060);
                this.method195(187);
            }
            this.field596 = true;
        }
    }

    @OriginalMember(owner = "client!client", name = "I", descriptor = "(I)V")
    public final void method255(int arg0) {
        if (this.field344 >= 2 || this.field532 != 0 || this.field192 != 0) {
            if (arg0 < field601 || arg0 > field601) {
                this.field483.method44(34);
            }
            String var2;
            if (this.field532 == 1 && this.field344 < 2) {
                var2 = "Use " + this.field536 + " with...";
            } else if (this.field192 == 1 && this.field344 < 2) {
                var2 = this.field195 + "...";
            } else {
                var2 = this.field434[this.field344 - 1];
            }
            if (this.field344 > 2) {
                var2 = var2 + "@whi@ / " + (this.field344 - 2) + " more options";
            }
            this.field326.method105(field564 / 1000, 15, 906, 16777215, 4, true, var2);
        }
    }

    @OriginalMember(owner = "client!client", name = "p", descriptor = "(Z)V")
    public final void method256(boolean arg0) {
        if (arg0) {
            this.field527 = !this.field527;
        }
        try {
            int var2 = field623.field884 + this.field202;
            int var3 = field623.field885 + this.field265;
            if (this.field384 - var2 < -500 || this.field384 - var2 > 500 || this.field385 - var3 < -500 || this.field385 - var3 > 500) {
                this.field384 = var2;
                this.field385 = var3;
            }
            if (this.field384 != var2) {
                this.field384 += (var2 - this.field384) / 16;
            }
            if (this.field385 != var3) {
                this.field385 += (var3 - this.field385) / 16;
            }
            if (super.field1451[1] == 1) {
                this.field470 += (-24 - this.field470) / 2;
            } else if (super.field1451[2] == 1) {
                this.field470 += (24 - this.field470) / 2;
            } else {
                this.field470 /= 2;
            }
            if (super.field1451[3] == 1) {
                this.field471 += (12 - this.field471) / 2;
            } else if (super.field1451[4] == 1) {
                this.field471 += (-12 - this.field471) / 2;
            } else {
                this.field471 /= 2;
            }
            this.field469 = this.field470 / 2 + this.field469 & 2047;
            this.field468 += this.field471 / 2;
            if (this.field468 < 128) {
                this.field468 = 128;
            }
            if (this.field468 > 383) {
                this.field468 = 383;
            }
            int var4 = this.field384 >> 7;
            int var5 = this.field385 >> 7;
            int var6 = this.method190(0, this.field385, this.field272, this.field384);
            int var7 = 0;
            if (var4 > 3 && var5 > 3 && var4 < 100 && var5 < 100) {
                for (int var8 = var4 - 4; var8 <= var4 + 4; ++var8) {
                    for (int var9 = var5 - 4; var9 <= var5 + 4; ++var9) {
                        int var10 = this.field272;
                        if (var10 < 3 && (this.field508[1][var8][var9] & 2) == 2) {
                            ++var10;
                        }
                        int var11 = var6 - this.field225[var10][var8][var9];
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
            if (var12 > this.field542) {
                this.field542 += (var12 - this.field542) / 24;
            } else if (var12 < this.field542) {
                this.field542 += (var12 - this.field542) / 80;
            }
        } catch (Exception var13) {
            signlink.reporterror("glfc_ex " + field623.field884 + "," + field623.field885 + "," + this.field384 + "," + this.field385 + "," + this.field214 + "," + this.field215 + "," + this.field377 + "," + this.field378);
            throw new RuntimeException("eek");
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(ILBFQIDHPO;Z)V")
    private final void method257(int arg0, class3 arg1, boolean arg2) {
        if (arg2) {
            this.field463 = !this.field463;
        }
        arg1.method64(0);
        int var4 = arg1.method65((byte) 88, 1);
        if (var4 != 0) {
            int var5 = arg1.method65((byte) 88, 2);
            if (var5 == 0) {
                this.field364[this.field363++] = this.field359;
            } else if (var5 == 1) {
                int var6 = arg1.method65((byte) 88, 3);
                field623.method317(var6, this.field418, false);
                int var7 = arg1.method65((byte) 88, 1);
                if (var7 == 1) {
                    this.field364[this.field363++] = this.field359;
                }
            } else if (var5 == 2) {
                int var8 = arg1.method65((byte) 88, 3);
                field623.method317(var8, this.field418, true);
                int var9 = arg1.method65((byte) 88, 3);
                field623.method317(var9, this.field418, true);
                int var10 = arg1.method65((byte) 88, 1);
                if (var10 == 1) {
                    this.field364[this.field363++] = this.field359;
                }
            } else if (var5 == 3) {
                int var11 = arg1.method65((byte) 88, 7);
                this.field272 = arg1.method65((byte) 88, 2);
                int var12 = arg1.method65((byte) 88, 1);
                int var13 = arg1.method65((byte) 88, 7);
                int var14 = arg1.method65((byte) 88, 1);
                if (var14 == 1) {
                    this.field364[this.field363++] = this.field359;
                }
                field623.method316(var11, var12 == 1, (byte) 6, var13);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(LHCCLTVPO;II)V")
    public final void method258(class20 arg0, int arg1, int arg2) {
        this.method259(arg2, arg0.field884, this.field496, arg0.field885);
        this.field232 += arg1;
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(IIII)V")
    public final void method259(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 >= 128 && arg3 >= 128 && arg1 <= 13056 && arg3 <= 13056) {
            int var5 = this.method190(0, arg3, this.field272, arg1) - arg0;
            int var6 = arg1 - this.field556;
            int var7 = var5 - this.field557;
            int var8 = arg3 - this.field558;
            int var9 = class65.field1658[this.field559];
            int var10 = class65.field1659[this.field559];
            int var11 = class65.field1658[this.field560];
            int var12 = class65.field1659[this.field560];
            int var13 = var6 * var12 + var8 * var11 >> 16;
            int var14 = var8 * var12 - var6 * var11 >> 16;
            int var16 = var7 * var10 - var9 * var14 >> 16;
            if (arg2 >= 0) {
                for (int var17 = 1; var17 > 0; ++var17) {
                }
            }
            int var18 = var7 * var9 + var10 * var14 >> 16;
            if (var18 >= 50) {
                this.field576 = (var13 << 9) / var18 + class42.field1206;
                this.field577 = (var16 << 9) / var18 + class42.field1207;
            } else {
                this.field576 = -1;
                this.field577 = -1;
            }
        } else {
            this.field576 = -1;
            this.field577 = -1;
        }
    }

    @OriginalMember(owner = "client!client", name = "q", descriptor = "(Z)V")
    public final void method260(boolean arg0) {
        this.field250 &= arg0;
        this.field483.method43(0, 51);
        if (this.field631 != -1) {
            this.method205(this.field631, -964);
            this.field631 = -1;
            this.field501 = true;
            this.field295 = false;
            this.field425 = true;
        }
        if (this.field465 != -1) {
            this.method205(this.field465, -964);
            this.field465 = -1;
            this.field226 = true;
            this.field295 = false;
        }
        if (this.field356 != -1) {
            this.method205(this.field356, -964);
            this.field356 = -1;
            this.field596 = true;
        }
        if (this.field440 != -1) {
            this.method205(this.field440, -964);
            this.field440 = -1;
        }
        if (this.field484 != -1) {
            this.method205(this.field484, -964);
            this.field484 = -1;
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
    public final void method261(int arg0) {
        this.field596 = true;
        if (arg0 != 7831) {
            this.method162();
        }
    }

    @OriginalMember(owner = "client!client", name = "J", descriptor = "(I)V")
    public final void method262(int arg0) {
        for (int var2 = 0; var2 < this.field505; ++var2) {
            int var3 = this.field506[var2];
            class2 var4 = this.field504[var3];
            if (var4 != null) {
                this.method263(var4.field25.field1363, 36436, var4);
            }
        }
        if (arg0 == 15168) {
            ;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IILHCCLTVPO;)V")
    public final void method263(int arg0, int arg1, class20 arg2) {
        if (arg1 != 36436) {
            this.field463 = !this.field463;
        }
        if (arg2.field884 < 128 || arg2.field885 < 128 || arg2.field884 >= 13184 || arg2.field885 >= 13184) {
            arg2.field869 = -1;
            arg2.field888 = -1;
            arg2.field900 = 0;
            arg2.field901 = 0;
            arg2.field884 = arg2.field905[0] * 128 + arg2.field874 * 64;
            arg2.field885 = arg2.field906[0] * 128 + arg2.field874 * 64;
            arg2.method315(true);
        }
        if (field623 == arg2 && (arg2.field884 < 1536 || arg2.field885 < 1536 || arg2.field884 >= 11776 || arg2.field885 >= 11776)) {
            arg2.field869 = -1;
            arg2.field888 = -1;
            arg2.field900 = 0;
            arg2.field901 = 0;
            arg2.field884 = arg2.field905[0] * 128 + arg2.field874 * 64;
            arg2.field885 = arg2.field906[0] * 128 + arg2.field874 * 64;
            arg2.method315(true);
        }
        if (arg2.field900 > field564) {
            this.method264(-622, arg2);
        } else if (arg2.field901 >= field564) {
            this.method265(true, arg2);
        } else {
            this.method266(false, arg2);
        }
        this.method267(arg2, true);
        this.method268(arg2, 0);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILHCCLTVPO;)V")
    public final void method264(int arg0, class20 arg1) {
        int var3 = arg1.field900 - field564;
        int var4 = arg1.field896 * 128 + arg1.field874 * 64;
        int var5 = arg1.field898 * 128 + arg1.field874 * 64;
        arg1.field884 += (var4 - arg1.field884) / var3;
        arg1.field885 += (var5 - arg1.field885) / var3;
        arg1.field893 = 0;
        if (arg0 >= 0) {
            this.field483.method44(173);
        }
        if (arg1.field902 == 0) {
            arg1.field903 = 1024;
        }
        if (arg1.field902 == 1) {
            arg1.field903 = 1536;
        }
        if (arg1.field902 == 2) {
            arg1.field903 = 0;
        }
        if (arg1.field902 == 3) {
            arg1.field903 = 512;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ZLHCCLTVPO;)V")
    public final void method265(boolean arg0, class20 arg1) {
        this.field250 &= arg0;
        if (field564 == arg1.field901 || arg1.field869 == -1 || arg1.field872 != 0 || arg1.field871 + 1 > class50.field1392[arg1.field869].method507(arg1.field870, 196)) {
            int var3 = arg1.field901 - arg1.field900;
            int var4 = field564 - arg1.field900;
            int var5 = arg1.field896 * 128 + arg1.field874 * 64;
            int var6 = arg1.field898 * 128 + arg1.field874 * 64;
            int var7 = arg1.field897 * 128 + arg1.field874 * 64;
            int var8 = arg1.field899 * 128 + arg1.field874 * 64;
            arg1.field884 = ((var3 - var4) * var5 + var4 * var7) / var3;
            arg1.field885 = ((var3 - var4) * var6 + var4 * var8) / var3;
        }
        arg1.field893 = 0;
        if (arg1.field902 == 0) {
            arg1.field903 = 1024;
        }
        if (arg1.field902 == 1) {
            arg1.field903 = 1536;
        }
        if (arg1.field902 == 2) {
            arg1.field903 = 0;
        }
        if (arg1.field902 == 3) {
            arg1.field903 = 512;
        }
        arg1.field886 = arg1.field903;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(ZLHCCLTVPO;)V")
    public final void method266(boolean arg0, class20 arg1) {
        arg1.field880 = arg1.field862;
        if (arg1.field904 == 0) {
            arg1.field893 = 0;
        } else {
            if (arg1.field869 != -1 && arg1.field872 == 0) {
                class50 var3 = class50.field1392[arg1.field869];
                if (arg1.field868 > 0 && var3.field1404 == 0) {
                    ++arg1.field893;
                    return;
                }
                if (arg1.field868 <= 0 && var3.field1405 == 0) {
                    ++arg1.field893;
                    return;
                }
            }
            int var4 = arg1.field884;
            int var5 = arg1.field885;
            int var6 = arg1.field905[arg1.field904 - 1] * 128 + arg1.field874 * 64;
            int var7 = arg1.field906[arg1.field904 - 1] * 128 + arg1.field874 * 64;
            if (var6 - var4 <= 256 && var6 - var4 >= -256 && var7 - var5 <= 256 && var7 - var5 >= -256) {
                if (var4 < var6) {
                    if (var5 < var7) {
                        arg1.field903 = 1280;
                    } else if (var5 > var7) {
                        arg1.field903 = 1792;
                    } else {
                        arg1.field903 = 1536;
                    }
                } else if (var4 > var6) {
                    if (var5 < var7) {
                        arg1.field903 = 768;
                    } else if (var5 > var7) {
                        arg1.field903 = 256;
                    } else {
                        arg1.field903 = 512;
                    }
                } else if (var5 < var7) {
                    arg1.field903 = 1024;
                } else {
                    arg1.field903 = 0;
                }
                int var8 = arg1.field903 - arg1.field886 & 2047;
                if (var8 > 1024) {
                    var8 -= 2048;
                }
                int var9 = arg1.field865;
                if (var8 >= -256 && var8 <= 256) {
                    var9 = arg1.field864;
                } else if (var8 >= 256 && var8 < 768) {
                    var9 = arg1.field867;
                } else if (var8 >= -768 && var8 <= -256) {
                    var9 = arg1.field866;
                }
                if (var9 == -1) {
                    var9 = arg1.field864;
                }
                arg1.field880 = var9;
                int var10 = 4;
                if (arg0) {
                    for (int var11 = 1; var11 > 0; ++var11) {
                    }
                }
                if (arg1.field903 != arg1.field886 && arg1.field875 == -1 && arg1.field895 != 0) {
                    var10 = 2;
                }
                if (arg1.field904 > 2) {
                    var10 = 6;
                }
                if (arg1.field904 > 3) {
                    var10 = 8;
                }
                if (arg1.field893 > 0 && arg1.field904 > 1) {
                    var10 = 8;
                    --arg1.field893;
                }
                if (arg1.field912[arg1.field904 - 1]) {
                    var10 <<= 1;
                }
                if (var10 >= 8 && arg1.field880 == arg1.field864 && arg1.field907 != -1) {
                    arg1.field880 = arg1.field907;
                }
                if (var4 < var6) {
                    arg1.field884 += var10;
                    if (arg1.field884 > var6) {
                        arg1.field884 = var6;
                    }
                } else if (var4 > var6) {
                    arg1.field884 -= var10;
                    if (arg1.field884 < var6) {
                        arg1.field884 = var6;
                    }
                }
                if (var5 < var7) {
                    arg1.field885 += var10;
                    if (arg1.field885 > var7) {
                        arg1.field885 = var7;
                    }
                } else if (var5 > var7) {
                    arg1.field885 -= var10;
                    if (arg1.field885 < var7) {
                        arg1.field885 = var7;
                    }
                }
                if (arg1.field884 == var6 && arg1.field885 == var7) {
                    --arg1.field904;
                    if (arg1.field868 > 0) {
                        --arg1.field868;
                        return;
                    }
                }
            } else {
                arg1.field884 = var6;
                arg1.field885 = var7;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(LHCCLTVPO;Z)V")
    public final void method267(class20 arg0, boolean arg1) {
        this.field250 &= arg1;
        if (arg0.field895 != 0) {
            if (arg0.field875 != -1 && arg0.field875 < 32768) {
                class2 var3 = this.field504[arg0.field875];
                if (var3 != null) {
                    int var4 = arg0.field884 - var3.field884;
                    int var5 = arg0.field885 - var3.field885;
                    if (var4 != 0 || var5 != 0) {
                        arg0.field903 = (int) (Math.atan2((double) var4, (double) var5) * 325.949D) & 2047;
                    }
                }
            }
            if (arg0.field875 >= 32768) {
                int var6 = arg0.field875 - 32768;
                if (this.field186 == var6) {
                    var6 = this.field359;
                }
                class22 var7 = this.field360[var6];
                if (var7 != null) {
                    int var8 = arg0.field884 - var7.field884;
                    int var9 = arg0.field885 - var7.field885;
                    if (var8 != 0 || var9 != 0) {
                        arg0.field903 = (int) (Math.atan2((double) var8, (double) var9) * 325.949D) & 2047;
                    }
                }
            }
            if ((arg0.field913 != 0 || arg0.field914 != 0) && (arg0.field904 == 0 || arg0.field893 > 0)) {
                int var10 = arg0.field884 - (arg0.field913 - this.field377 - this.field377) * 64;
                int var11 = arg0.field885 - (arg0.field914 - this.field378 - this.field378) * 64;
                if (var10 != 0 || var11 != 0) {
                    arg0.field903 = (int) (Math.atan2((double) var10, (double) var11) * 325.949D) & 2047;
                }
                arg0.field913 = 0;
                arg0.field914 = 0;
            }
            int var12 = arg0.field903 - arg0.field886 & 2047;
            if (var12 != 0) {
                if (var12 >= arg0.field895 && var12 <= 2048 - arg0.field895) {
                    if (var12 > 1024) {
                        arg0.field886 -= arg0.field895;
                    } else {
                        arg0.field886 += arg0.field895;
                    }
                } else {
                    arg0.field886 = arg0.field903;
                }
                arg0.field886 &= 2047;
                if (arg0.field880 == arg0.field862 && arg0.field903 != arg0.field886) {
                    if (arg0.field863 != -1) {
                        arg0.field880 = arg0.field863;
                        return;
                    }
                    arg0.field880 = arg0.field864;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(LHCCLTVPO;I)V")
    public final void method268(class20 arg0, int arg1) {
        this.field232 += arg1;
        arg0.field917 = false;
        if (arg0.field880 != -1) {
            class50 var3 = class50.field1392[arg0.field880];
            ++arg0.field882;
            if (arg0.field881 < var3.field1393 && arg0.field882 > var3.method507(arg0.field881, 196)) {
                arg0.field882 = 0;
                ++arg0.field881;
            }
            if (arg0.field881 >= var3.field1393) {
                arg0.field882 = 0;
                arg0.field881 = 0;
            }
        }
        if (arg0.field888 != -1 && field564 >= arg0.field891) {
            if (arg0.field889 < 0) {
                arg0.field889 = 0;
            }
            class50 var4 = class9.field662[arg0.field888].field666;
            ++arg0.field890;
            while (arg0.field889 < var4.field1393 && arg0.field890 > var4.method507(arg0.field889, 196)) {
                arg0.field890 -= var4.method507(arg0.field889, 196);
                ++arg0.field889;
            }
            if (arg0.field889 >= var4.field1393 && (arg0.field889 < 0 || arg0.field889 >= var4.field1393)) {
                arg0.field888 = -1;
            }
        }
        if (arg0.field869 != -1 && arg0.field872 <= 1) {
            class50 var5 = class50.field1392[arg0.field869];
            if (var5.field1404 == 1 && arg0.field868 > 0 && arg0.field900 <= field564 && arg0.field901 < field564) {
                arg0.field872 = 1;
                return;
            }
        }
        if (arg0.field869 != -1 && arg0.field872 == 0) {
            class50 var6 = class50.field1392[arg0.field869];
            ++arg0.field871;
            while (arg0.field870 < var6.field1393 && arg0.field871 > var6.method507(arg0.field870, 196)) {
                arg0.field871 -= var6.method507(arg0.field870, 196);
                ++arg0.field870;
            }
            if (arg0.field870 >= var6.field1393) {
                arg0.field870 -= var6.field1397;
                ++arg0.field873;
                if (arg0.field873 >= var6.field1403) {
                    arg0.field869 = -1;
                }
                if (arg0.field870 < 0 || arg0.field870 >= var6.field1393) {
                    arg0.field869 = -1;
                }
            }
            arg0.field917 = var6.field1399;
        }
        if (arg0.field872 > 0) {
            --arg0.field872;
        }
    }

    @OriginalMember(owner = "client!client", name = "K", descriptor = "(I)V")
    public final void method269(int arg0) {
        this.field232 += arg0;
        if (this.field356 == -1 || this.field256 != 2 && super.field1434 == null) {
            if (this.field596) {
                this.method236(this.field421);
                this.field596 = false;
                this.field510.method593(super.field1433, 0, false, 4);
                this.field511.method593(super.field1433, 0, false, 357);
                this.field512.method593(super.field1433, 722, false, 4);
                this.field513.method593(super.field1433, 743, false, 205);
                this.field514.method593(super.field1433, 0, false, 0);
                this.field515.method593(super.field1433, 516, false, 4);
                this.field516.method593(super.field1433, 516, false, 205);
                this.field517.method593(super.field1433, 496, false, 357);
                this.field518.method593(super.field1433, 0, false, 338);
                this.field501 = true;
                this.field226 = true;
                this.field425 = true;
                this.field531 = true;
                if (this.field256 != 2) {
                    this.field354.method593(super.field1433, 4, false, 4);
                    this.field353.method593(super.field1433, 550, false, 4);
                }
            }
            if (this.field256 == 2) {
                this.method296(7);
            }
            if (this.field310 && this.field330 == 1) {
                this.field501 = true;
            }
            if (this.field631 != -1) {
                boolean var4 = this.method287(this.field631, false, this.field628);
                if (var4) {
                    this.field501 = true;
                }
            }
            if (this.field526 == 2) {
                this.field501 = true;
            }
            if (this.field393 == 2) {
                this.field501 = true;
            }
            if (this.field501) {
                this.method211(-15852);
                this.field501 = false;
            }
            if (this.field465 == -1 && this.field646 == 0) {
                this.field308.field819 = this.field486 - this.field573 - 77;
                if (super.field1441 > 448 && super.field1441 < 560 && super.field1442 > 332) {
                    this.method207(-535, 463, this.field486, 77, -1, super.field1442 - 357, this.field308, 0, super.field1441 - 17);
                }
                int var5 = this.field486 - 77 - this.field308.field819;
                if (var5 < 0) {
                    var5 = 0;
                }
                if (var5 > this.field486 - 77) {
                    var5 = this.field486 - 77;
                }
                if (this.field573 != var5) {
                    this.field573 = var5;
                    this.field226 = true;
                }
            }
            if (this.field465 == -1 && this.field646 == 3) {
                int var6 = this.field336 * 14 + 7;
                this.field308.field819 = this.field339;
                if (super.field1441 > 448 && super.field1441 < 560 && super.field1442 > 332) {
                    this.method207(-535, 463, var6, 77, -1, super.field1442 - 357, this.field308, 0, super.field1441 - 17);
                }
                int var7 = this.field308.field819;
                if (var7 < 0) {
                    var7 = 0;
                }
                if (var7 > var6 - 77) {
                    var7 = var6 - 77;
                }
                if (this.field339 != var7) {
                    this.field339 = var7;
                    this.field226 = true;
                }
            }
            if (this.field465 != -1) {
                boolean var8 = this.method287(this.field465, false, this.field628);
                if (var8) {
                    this.field226 = true;
                }
            }
            if (this.field526 == 3) {
                this.field226 = true;
            }
            if (this.field393 == 3) {
                this.field226 = true;
            }
            if (this.field625 != null) {
                this.field226 = true;
            }
            if (this.field310 && this.field330 == 2) {
                this.field226 = true;
            }
            if (this.field226) {
                this.method172(false);
                this.field226 = false;
            }
            if (this.field256 == 2) {
                this.method220((byte) 0);
                this.field353.method593(super.field1433, 550, false, 4);
            }
            if (this.field617 != -1) {
                this.field425 = true;
            }
            if (this.field425) {
                if (this.field617 != -1 && this.field617 == this.field431) {
                    this.field617 = -1;
                    this.field483.method43(0, 76);
                    this.field483.method44(this.field431);
                }
                this.field425 = false;
                this.field264.method592(-19705);
                this.field613.method446(0, (byte) 3, 0);
                if (this.field631 == -1) {
                    if (this.field473[this.field431] != -1) {
                        if (this.field431 == 0) {
                            this.field240.method446(10, (byte) 3, 22);
                        }
                        if (this.field431 == 1) {
                            this.field241.method446(8, (byte) 3, 54);
                        }
                        if (this.field431 == 2) {
                            this.field241.method446(8, (byte) 3, 82);
                        }
                        if (this.field431 == 3) {
                            this.field242.method446(8, (byte) 3, 110);
                        }
                        if (this.field431 == 4) {
                            this.field244.method446(8, (byte) 3, 153);
                        }
                        if (this.field431 == 5) {
                            this.field244.method446(8, (byte) 3, 181);
                        }
                        if (this.field431 == 6) {
                            this.field243.method446(9, (byte) 3, 209);
                        }
                    }
                    if (this.field473[0] != -1 && (this.field617 != 0 || field564 % 20 < 10)) {
                        this.field528[0].method446(13, (byte) 3, 29);
                    }
                    if (this.field473[1] != -1 && (this.field617 != 1 || field564 % 20 < 10)) {
                        this.field528[1].method446(11, (byte) 3, 53);
                    }
                    if (this.field473[2] != -1 && (this.field617 != 2 || field564 % 20 < 10)) {
                        this.field528[2].method446(11, (byte) 3, 82);
                    }
                    if (this.field473[3] != -1 && (this.field617 != 3 || field564 % 20 < 10)) {
                        this.field528[3].method446(12, (byte) 3, 115);
                    }
                    if (this.field473[4] != -1 && (this.field617 != 4 || field564 % 20 < 10)) {
                        this.field528[4].method446(13, (byte) 3, 153);
                    }
                    if (this.field473[5] != -1 && (this.field617 != 5 || field564 % 20 < 10)) {
                        this.field528[5].method446(11, (byte) 3, 180);
                    }
                    if (this.field473[6] != -1 && (this.field617 != 6 || field564 % 20 < 10)) {
                        this.field528[6].method446(13, (byte) 3, 208);
                    }
                }
                this.field264.method593(super.field1433, 516, false, 160);
                this.field263.method592(-19705);
                this.field612.method446(0, (byte) 3, 0);
                if (this.field631 == -1) {
                    if (this.field473[this.field431] != -1) {
                        if (this.field431 == 7) {
                            this.field567.method446(0, (byte) 3, 42);
                        }
                        if (this.field431 == 8) {
                            this.field568.method446(0, (byte) 3, 74);
                        }
                        if (this.field431 == 9) {
                            this.field568.method446(0, (byte) 3, 102);
                        }
                        if (this.field431 == 10) {
                            this.field569.method446(1, (byte) 3, 130);
                        }
                        if (this.field431 == 11) {
                            this.field571.method446(0, (byte) 3, 173);
                        }
                        if (this.field431 == 12) {
                            this.field571.method446(0, (byte) 3, 201);
                        }
                        if (this.field431 == 13) {
                            this.field570.method446(0, (byte) 3, 229);
                        }
                    }
                    if (this.field473[8] != -1 && (this.field617 != 8 || field564 % 20 < 10)) {
                        this.field528[7].method446(2, (byte) 3, 74);
                    }
                    if (this.field473[9] != -1 && (this.field617 != 9 || field564 % 20 < 10)) {
                        this.field528[8].method446(3, (byte) 3, 102);
                    }
                    if (this.field473[10] != -1 && (this.field617 != 10 || field564 % 20 < 10)) {
                        this.field528[9].method446(4, (byte) 3, 137);
                    }
                    if (this.field473[11] != -1 && (this.field617 != 11 || field564 % 20 < 10)) {
                        this.field528[10].method446(2, (byte) 3, 174);
                    }
                    if (this.field473[12] != -1 && (this.field617 != 12 || field564 % 20 < 10)) {
                        this.field528[11].method446(2, (byte) 3, 201);
                    }
                    if (this.field473[13] != -1 && (this.field617 != 13 || field564 % 20 < 10)) {
                        this.field528[12].method446(2, (byte) 3, 226);
                    }
                }
                this.field263.method593(super.field1433, 496, false, 466);
                this.field354.method592(-19705);
                class42.field1212 = this.field489;
            }
            if (this.field531) {
                this.field531 = false;
                this.field262.method592(-19705);
                this.field611.method446(0, (byte) 3, 0);
                this.field325.method97(true, "Public chat", -930, 16777215, 28, 55);
                if (this.field614 == 0) {
                    this.field325.method97(true, "On", -930, 65280, 41, 55);
                }
                if (this.field614 == 1) {
                    this.field325.method97(true, "Friends", -930, 16776960, 41, 55);
                }
                if (this.field614 == 2) {
                    this.field325.method97(true, "Off", -930, 16711680, 41, 55);
                }
                if (this.field614 == 3) {
                    this.field325.method97(true, "Hide", -930, 65535, 41, 55);
                }
                this.field325.method97(true, "Private chat", -930, 16777215, 28, 184);
                if (this.field459 == 0) {
                    this.field325.method97(true, "On", -930, 65280, 41, 184);
                }
                if (this.field459 == 1) {
                    this.field325.method97(true, "Friends", -930, 16776960, 41, 184);
                }
                if (this.field459 == 2) {
                    this.field325.method97(true, "Off", -930, 16711680, 41, 184);
                }
                this.field325.method97(true, "Trade/compete", -930, 16777215, 28, 324);
                if (this.field602 == 0) {
                    this.field325.method97(true, "On", -930, 65280, 41, 324);
                }
                if (this.field602 == 1) {
                    this.field325.method97(true, "Friends", -930, 16776960, 41, 324);
                }
                if (this.field602 == 2) {
                    this.field325.method97(true, "Off", -930, 16711680, 41, 324);
                }
                this.field325.method97(true, "Report abuse", -930, 16777215, 33, 458);
                this.field262.method593(super.field1433, 0, false, 453);
                this.field354.method592(-19705);
                class42.field1212 = this.field489;
            }
            this.field628 = 0;
        } else {
            if (this.field256 == 2) {
                this.method287(this.field356, false, this.field628);
                if (this.field440 != -1) {
                    this.method287(this.field440, false, this.field628);
                }
                this.field628 = 0;
                this.method165(field176);
                super.field1434.method592(-19705);
                class42.field1212 = this.field490;
                class8.method141(true);
                this.field596 = true;
                class15 var2 = class15.method306(this.field356);
                if (var2.field781 == 512 && var2.field776 == 334 && var2.field818 == 0) {
                    var2.field781 = 765;
                    var2.field776 = 503;
                }
                this.method208(0, 0, 0, var2, this.field281);
                if (this.field440 != -1) {
                    class15 var3 = class15.method306(this.field440);
                    if (var3.field781 == 512 && var3.field776 == 334 && var3.field818 == 0) {
                        var3.field781 = 765;
                        var3.field776 = 503;
                    }
                    this.method208(0, 0, 0, var3, this.field281);
                }
                if (!this.field310) {
                    this.method240(13173);
                    this.method255(4);
                } else {
                    this.method184(31290);
                }
            }
            super.field1434.method593(super.field1433, 0, false, 0);
        }
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        try {
            System.out.println("RS2 user client - release #" + 367);
            if (arg0.length != 5) {
                System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
            } else {
                field371 = Integer.parseInt(arg0[0]);
                field372 = Integer.parseInt(arg0[1]);
                if (arg0[2].equals("lowmem")) {
                    method185(-588);
                } else {
                    if (!arg0[2].equals("highmem")) {
                        System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
                        return;
                    }
                    method166(6);
                }
                if (arg0[3].equals("free")) {
                    field373 = false;
                } else {
                    if (!arg0[3].equals("members")) {
                        System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
                        return;
                    }
                    field373 = true;
                }
                signlink.storeid = Integer.parseInt(arg0[4]);
                signlink.startpriv(InetAddress.getLocalHost());
                client var1 = new client();
                var1.method514(765, 503, 312);
            }
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!client", name = "L", descriptor = "(I)V")
    public void method270(int arg0) {
        int var2 = 62 / arg0;
        System.out.println("============");
        System.out.println("flame-cycle:" + this.field519);
        if (this.field580 != null) {
            System.out.println("Od-cycle:" + this.field580.field133);
        }
        System.out.println("loop-cycle:" + field564);
        System.out.println("draw-cycle:" + field294);
        System.out.println("ptype:" + this.field233);
        System.out.println("psize:" + this.field232);
        if (this.field247 != null) {
            this.field247.method591(744);
        }
        super.field1430 = true;
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(I)Ljava/awt/Component;")
    public final Component method271(int arg0) {
        while (arg0 >= 0) {
            this.field544 = null;
        }
        if (signlink.mainapp != null) {
            return signlink.mainapp;
        } else if (super.field1436 != null) {
            return super.field1436;
        } else {
            return this;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ZILBFQIDHPO;)V")
    public final void method272(boolean arg0, int arg1, class3 arg2) {
        if (arg0) {
            if (arg1 == 106) {
                int var4 = arg2.method83(this.field454);
                int var5 = arg2.method73(-732);
                int var6 = (var5 >> 4 & 7) + this.field545;
                int var7 = (var5 & 7) + this.field546;
                int var8 = arg2.method74(-719);
                int var9 = var8 >> 2;
                int var10 = var8 & 3;
                int var11 = this.field432[var9];
                if (var6 >= 0 && var7 >= 0 && var6 < 104 && var7 < 104) {
                    this.method168(-2633, var10, var7, var11, 0, var4, -1, var6, this.field272, var9);
                }
            } else {
                if (arg1 == 26) {
                    int var12 = arg2.method54();
                    int var13 = (var12 >> 4 & 7) + this.field545;
                    int var14 = (var12 & 7) + this.field546;
                    int var15 = arg2.method56();
                    int var16 = arg2.method54();
                    int var17 = var16 >> 4 & 15;
                    int var18 = var16 & 7;
                    if (field623.field905[0] >= var13 - var17 && field623.field905[0] <= var13 + var17 && field623.field906[0] >= var14 - var17 && field623.field906[0] <= var14 + var17 && this.field447 && !field374 && this.field245 < 50) {
                        this.field396[this.field245] = var15;
                        this.field653[this.field245] = var18;
                        this.field198[this.field245] = class34.field1062[var15];
                        ++this.field245;
                    }
                }
                if (arg1 == 27) {
                    int var19 = arg2.method75(false);
                    int var20 = var19 >> 2;
                    int var21 = var19 & 3;
                    int var22 = this.field432[var20];
                    byte var23 = arg2.method76(3);
                    byte var24 = arg2.method77((byte) 5);
                    int var25 = arg2.method56();
                    byte var26 = arg2.method76(3);
                    byte var27 = arg2.method55();
                    int var28 = arg2.method74(-719);
                    int var29 = (var28 >> 4 & 7) + this.field545;
                    int var30 = (var28 & 7) + this.field546;
                    int var31 = arg2.method83(this.field454);
                    int var32 = arg2.method56();
                    int var33 = arg2.method56();
                    class22 var34;
                    if (this.field186 == var32) {
                        var34 = field623;
                    } else {
                        var34 = this.field360[var32];
                    }
                    if (var34 != null) {
                        class68 var35 = class68.method575(var33);
                        int var36 = this.field225[this.field272][var29][var30];
                        int var37 = this.field225[this.field272][var29 + 1][var30];
                        int var38 = this.field225[this.field272][var29 + 1][var30 + 1];
                        int var39 = this.field225[this.field272][var29][var30 + 1];
                        class65 var40 = var35.method580(var20, var21, var36, var37, var38, var39, -1);
                        if (var40 != null) {
                            this.method168(-2633, 0, var30, var22, var25 + 1, -1, var31 + 1, var29, this.field272, 0);
                            var34.field950 = field564 + var25;
                            var34.field951 = field564 + var31;
                            var34.field936 = var40;
                            int var41 = var35.field1707;
                            int var42 = var35.field1715;
                            if (var21 == 1 || var21 == 3) {
                                var41 = var35.field1715;
                                var42 = var35.field1707;
                            }
                            var34.field933 = var29 * 128 + var41 * 64;
                            var34.field935 = var30 * 128 + var42 * 64;
                            var34.field934 = this.method190(0, var34.field935, this.field272, var34.field933);
                            if (var27 > var26) {
                                byte var43 = var27;
                                var27 = var26;
                                var26 = var43;
                            }
                            if (var23 > var24) {
                                byte var44 = var23;
                                var23 = var24;
                                var24 = var44;
                            }
                            var34.field943 = var27 + var29;
                            var34.field945 = var26 + var29;
                            var34.field944 = var23 + var30;
                            var34.field946 = var24 + var30;
                        }
                    }
                }
                if (arg1 == 11) {
                    int var45 = arg2.method73(-732);
                    int var46 = var45 >> 2;
                    int var47 = var45 & 3;
                    int var48 = this.field432[var46];
                    int var49 = arg2.method75(false);
                    int var50 = (var49 >> 4 & 7) + this.field545;
                    int var51 = (var49 & 7) + this.field546;
                    if (var50 >= 0 && var51 >= 0 && var50 < 104 && var51 < 104) {
                        this.method168(-2633, var47, var51, var48, 0, -1, -1, var50, this.field272, var46);
                    }
                } else if (arg1 == 204) {
                    int var52 = arg2.method54();
                    int var53 = (var52 >> 4 & 7) + this.field545;
                    int var54 = (var52 & 7) + this.field546;
                    int var55 = arg2.method56();
                    int var56 = arg2.method54();
                    int var57 = arg2.method56();
                    if (var53 >= 0 && var54 >= 0 && var53 < 104 && var54 < 104) {
                        int var58 = var53 * 128 + 64;
                        int var59 = var54 * 128 + 64;
                        class25 var60 = new class25(var57, this.field272, var59, field564, 0, this.method190(0, var59, this.field272, var58) - var56, var58, var55);
                        this.field219.method595(var60);
                    }
                } else if (arg1 == 215) {
                    int var61 = arg2.method54();
                    int var62 = (var61 >> 4 & 7) + this.field545;
                    int var63 = (var61 & 7) + this.field546;
                    int var64 = arg2.method56();
                    int var65 = arg2.method56();
                    int var66 = arg2.method56();
                    if (var62 >= 0 && var63 >= 0 && var62 < 104 && var63 < 104) {
                        class72 var67 = this.field544[this.field272][var62][var63];
                        if (var67 != null) {
                            for (class14 var68 = (class14) var67.method598(); var68 != null; var68 = (class14) var67.method600(4)) {
                                if ((var64 & 32767) == var68.field738 && var68.field739 == var65) {
                                    var68.field739 = var66;
                                    break;
                                }
                            }
                            this.method213(var62, var63);
                        }
                    }
                } else if (arg1 == 192) {
                    int var69 = arg2.method83(this.field454);
                    int var70 = arg2.method73(-732);
                    int var71 = (var70 >> 4 & 7) + this.field545;
                    int var72 = (var70 & 7) + this.field546;
                    int var73 = arg2.method82((byte) 3);
                    int var74 = arg2.method82((byte) 3);
                    if (var71 >= 0 && var72 >= 0 && var71 < 104 && var72 < 104 && this.field186 != var74) {
                        class14 var75 = new class14();
                        var75.field738 = var73;
                        var75.field739 = var69;
                        if (this.field544[this.field272][var71][var72] == null) {
                            this.field544[this.field272][var71][var72] = new class72((byte) 8);
                        }
                        this.field544[this.field272][var71][var72].method595(var75);
                        this.method213(var71, var72);
                    }
                } else if (arg1 == 33) {
                    int var76 = arg2.method82((byte) 3);
                    int var77 = arg2.method54();
                    int var78 = (var77 >> 4 & 7) + this.field545;
                    int var79 = (var77 & 7) + this.field546;
                    int var80 = arg2.method82((byte) 3);
                    if (var78 >= 0 && var79 >= 0 && var78 < 104 && var79 < 104) {
                        class14 var81 = new class14();
                        var81.field738 = var76;
                        var81.field739 = var80;
                        if (this.field544[this.field272][var78][var79] == null) {
                            this.field544[this.field272][var78][var79] = new class72((byte) 8);
                        }
                        this.field544[this.field272][var78][var79].method595(var81);
                        this.method213(var78, var79);
                    }
                } else if (arg1 == 12) {
                    int var82 = arg2.method54();
                    int var83 = (var82 >> 4 & 7) + this.field545;
                    int var84 = (var82 & 7) + this.field546;
                    int var85 = var83 + arg2.method55();
                    int var86 = var84 + arg2.method55();
                    int var87 = arg2.method57();
                    int var88 = arg2.method56();
                    int var89 = arg2.method54() * 4;
                    int var90 = arg2.method54() * 4;
                    int var91 = arg2.method56();
                    int var92 = arg2.method56();
                    int var93 = arg2.method54();
                    int var94 = arg2.method54();
                    if (var83 >= 0 && var84 >= 0 && var83 < 104 && var84 < 104 && var85 >= 0 && var86 >= 0 && var85 < 104 && var86 < 104 && var88 != 65535) {
                        int var95 = var83 * 128 + 64;
                        int var96 = var84 * 128 + 64;
                        int var97 = var85 * 128 + 64;
                        int var98 = var86 * 128 + 64;
                        class33 var99 = new class33(this.field272, field564 + var92, var94, var87, var90, var93, this.method190(0, var96, this.field272, var95) - var89, var96, var88, var95, false, field564 + var91);
                        var99.method337(field564 + var91, var97, var98, (byte) -127, this.method190(0, var98, this.field272, var97) - var90);
                        this.field277.method595(var99);
                    }
                } else if (arg1 != 62) {
                    if (arg1 == 76) {
                        int var106 = arg2.method81(true);
                        int var107 = arg2.method75(false);
                        int var108 = (var107 >> 4 & 7) + this.field545;
                        int var109 = (var107 & 7) + this.field546;
                        int var110 = arg2.method73(-732);
                        int var111 = var110 >> 2;
                        int var112 = var110 & 3;
                        int var113 = this.field432[var111];
                        if (var108 >= 0 && var109 >= 0 && var108 < 103 && var109 < 103) {
                            int var114 = this.field225[this.field272][var108][var109];
                            int var115 = this.field225[this.field272][var108 + 1][var109];
                            int var116 = this.field225[this.field272][var108 + 1][var109 + 1];
                            int var117 = this.field225[this.field272][var108][var109 + 1];
                            if (var113 == 0) {
                                class24 var118 = this.field306.method395(this.field272, var108, 698, var109);
                                if (var118 != null) {
                                    int var119 = var118.field964 >> 14 & 32767;
                                    if (var111 == 2) {
                                        var118.field962 = new class62(var117, var119, this.field201, false, var114, var112 + 4, var115, var116, 2, var106);
                                        var118.field963 = new class62(var117, var119, this.field201, false, var114, var112 + 1 & 3, var115, var116, 2, var106);
                                    } else {
                                        var118.field962 = new class62(var117, var119, this.field201, false, var114, var112, var115, var116, var111, var106);
                                    }
                                }
                            }
                            if (var113 == 1) {
                                class16 var120 = this.field306.method396(var108, this.field272, var109, this.field475);
                                if (var120 != null) {
                                    var120.field825 = new class62(var117, var120.field826 >> 14 & 32767, this.field201, false, var114, 0, var115, var116, 4, var106);
                                }
                            }
                            if (var113 == 2) {
                                class57 var121 = this.field306.method397(var108, var109, 229, this.field272);
                                if (var111 == 11) {
                                    var111 = 10;
                                }
                                if (var121 != null) {
                                    var121.field1502 = new class62(var117, var121.field1510 >> 14 & 32767, this.field201, false, var114, var112, var115, var116, var111, var106);
                                }
                            }
                            if (var113 == 3) {
                                class63 var122 = this.field306.method398(this.field272, (byte) 45, var108, var109);
                                if (var122 != null) {
                                    var122.field1576 = new class62(var117, var122.field1577 >> 14 & 32767, this.field201, false, var114, var112, var115, var116, 22, var106);
                                }
                            }
                        }
                    }
                } else {
                    int var100 = arg2.method82((byte) 3);
                    int var101 = arg2.method73(-732);
                    int var102 = (var101 >> 4 & 7) + this.field545;
                    int var103 = (var101 & 7) + this.field546;
                    if (var102 >= 0 && var103 >= 0 && var102 < 104 && var103 < 104) {
                        class72 var104 = this.field544[this.field272][var102][var103];
                        if (var104 != null) {
                            for (class14 var105 = (class14) var104.method598(); var105 != null; var105 = (class14) var104.method600(4)) {
                                if ((var100 & 32767) == var105.field738) {
                                    var105.method329();
                                    break;
                                }
                            }
                            if (var104.method598() == null) {
                                this.field544[this.field272][var102][var103] = null;
                            }
                            this.method213(var102, var103);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIII)V")
    public final void method273(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = this.field306.method399(arg2, arg4, arg0);
        if (var7 != 0) {
            int var8 = this.field306.method403(arg2, arg4, arg0, var7);
            int var9 = var8 >> 6 & 3;
            int var10 = var8 & 31;
            int var11 = arg1;
            if (var7 > 0) {
                var11 = arg5;
            }
            int[] var12 = this.field424.field1076;
            int var13 = (103 - arg0) * 512 * 4 + arg4 * 4 + 24624;
            int var14 = var7 >> 14 & 32767;
            class68 var15 = class68.method575(var14);
            if (var15.field1708 != -1) {
                class44 var16 = this.field585[var15.field1708];
                if (var16 != null) {
                    int var17 = (var15.field1707 * 4 - var16.field1235) / 2;
                    int var18 = (var15.field1715 * 4 - var16.field1236) / 2;
                    var16.method446((104 - arg0 - var15.field1715) * 4 + 48 + var18, (byte) 3, arg4 * 4 + 48 + var17);
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
        int var19 = this.field306.method401(arg2, arg4, arg0);
        this.field232 += arg3;
        if (var19 != 0) {
            int var20 = this.field306.method403(arg2, arg4, arg0, var19);
            int var21 = var20 >> 6 & 3;
            int var22 = var20 & 31;
            int var23 = var19 >> 14 & 32767;
            class68 var24 = class68.method575(var23);
            if (var24.field1708 != -1) {
                class44 var25 = this.field585[var24.field1708];
                if (var25 != null) {
                    int var26 = (var24.field1707 * 4 - var25.field1235) / 2;
                    int var27 = (var24.field1715 * 4 - var25.field1236) / 2;
                    var25.method446((104 - arg0 - var24.field1715) * 4 + 48 + var27, (byte) 3, arg4 * 4 + 48 + var26);
                }
            } else if (var22 == 9) {
                int var28 = 15658734;
                if (var19 > 0) {
                    var28 = 15597568;
                }
                int[] var29 = this.field424.field1076;
                int var30 = (103 - arg0) * 512 * 4 + arg4 * 4 + 24624;
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
        int var31 = this.field306.method402(arg2, arg4, arg0);
        if (var31 != 0) {
            int var32 = var31 >> 14 & 32767;
            class68 var33 = class68.method575(var32);
            if (var33.field1708 != -1) {
                class44 var34 = this.field585[var33.field1708];
                if (var34 != null) {
                    int var35 = (var33.field1707 * 4 - var34.field1235) / 2;
                    int var36 = (var33.field1715 * 4 - var34.field1236) / 2;
                    var34.method446((104 - arg0 - var33.field1715) * 4 + 48 + var36, (byte) 3, arg4 * 4 + 48 + var35);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V")
    public final void method274(byte arg0) {
        if (this.field532 == 0 && this.field192 == 0) {
            this.field434[this.field344] = "Walk here";
            this.field180[this.field344] = 903;
            this.field178[this.field344] = super.field1441;
            this.field179[this.field344] = super.field1442;
            ++this.field344;
        }
        int var2 = -1;
        if (arg0 != 106) {
            this.field483.method44(66);
        }
        for (int var3 = 0; var3 < class65.field1656; ++var3) {
            int var4 = class65.field1657[var3];
            int var5 = var4 & 127;
            int var6 = var4 >> 7 & 127;
            int var7 = var4 >> 29 & 3;
            int var8 = var4 >> 14 & 32767;
            if (var2 != var4) {
                var2 = var4;
                if (var7 == 2 && this.field306.method403(this.field272, var5, var6, var4) >= 0) {
                    class68 var9 = class68.method575(var8);
                    if (var9.field1695 != null) {
                        var9 = var9.method584((byte) -70);
                    }
                    if (var9 == null) {
                        continue;
                    }
                    if (this.field532 == 1) {
                        this.field434[this.field344] = "Use " + this.field536 + " with @cya@" + var9.field1699;
                        this.field180[this.field344] = 760;
                        this.field181[this.field344] = var4;
                        this.field178[this.field344] = var5;
                        this.field179[this.field344] = var6;
                        ++this.field344;
                    } else if (this.field192 == 1) {
                        if ((this.field194 & 4) == 4) {
                            this.field434[this.field344] = this.field195 + " @cya@" + var9.field1699;
                            this.field180[this.field344] = 625;
                            this.field181[this.field344] = var4;
                            this.field178[this.field344] = var5;
                            this.field179[this.field344] = var6;
                            ++this.field344;
                        }
                    } else {
                        if (var9.field1711 != null) {
                            for (int var10 = 4; var10 >= 0; --var10) {
                                if (var9.field1711[var10] != null) {
                                    this.field434[this.field344] = var9.field1711[var10] + " @cya@" + var9.field1699;
                                    if (var10 == 0) {
                                        this.field180[this.field344] = 530;
                                    }
                                    if (var10 == 1) {
                                        this.field180[this.field344] = 479;
                                    }
                                    if (var10 == 2) {
                                        this.field180[this.field344] = 304;
                                    }
                                    if (var10 == 3) {
                                        this.field180[this.field344] = 58;
                                    }
                                    if (var10 == 4) {
                                        this.field180[this.field344] = 1237;
                                    }
                                    this.field181[this.field344] = var4;
                                    this.field178[this.field344] = var5;
                                    this.field179[this.field344] = var6;
                                    ++this.field344;
                                }
                            }
                        }
                        this.field434[this.field344] = "Examine @cya@" + var9.field1699;
                        this.field180[this.field344] = 1551;
                        this.field181[this.field344] = var9.field1702 << 14;
                        this.field178[this.field344] = var5;
                        this.field179[this.field344] = var6;
                        ++this.field344;
                    }
                }
                if (var7 == 1) {
                    class2 var11 = this.field504[var8];
                    if (var11.field25.field1363 == 1 && (var11.field884 & 127) == 64 && (var11.field885 & 127) == 64) {
                        for (int var12 = 0; var12 < this.field505; ++var12) {
                            class2 var15 = this.field504[this.field506[var12]];
                            if (var15 != null && var11 != var15 && var15.field25.field1363 == 1 && var11.field884 == var15.field884 && var11.field885 == var15.field885) {
                                this.method291(var15.field25, var5, var6, this.field506[var12], true);
                            }
                        }
                        for (int var13 = 0; var13 < this.field361; ++var13) {
                            class22 var14 = this.field360[this.field362[var13]];
                            if (var14 != null && var11.field884 == var14.field884 && var11.field885 == var14.field885) {
                                this.method227(this.field362[var13], -10739, var6, var14, var5);
                            }
                        }
                    }
                    this.method291(var11.field25, var5, var6, var8, true);
                }
                if (var7 == 0) {
                    class22 var16 = this.field360[var8];
                    if ((var16.field884 & 127) == 64 && (var16.field885 & 127) == 64) {
                        for (int var17 = 0; var17 < this.field505; ++var17) {
                            class2 var20 = this.field504[this.field506[var17]];
                            if (var20 != null && var20.field25.field1363 == 1 && var16.field884 == var20.field884 && var16.field885 == var20.field885) {
                                this.method291(var20.field25, var5, var6, this.field506[var17], true);
                            }
                        }
                        for (int var18 = 0; var18 < this.field361; ++var18) {
                            class22 var19 = this.field360[this.field362[var18]];
                            if (var19 != null && var16 != var19 && var16.field884 == var19.field884 && var16.field885 == var19.field885) {
                                this.method227(this.field362[var18], -10739, var6, var19, var5);
                            }
                        }
                    }
                    this.method227(var8, -10739, var6, var16, var5);
                }
                if (var7 == 3) {
                    class72 var21 = this.field544[this.field272][var5][var6];
                    if (var21 != null) {
                        for (class14 var22 = (class14) var21.method599(-120); var22 != null; var22 = (class14) var21.method601(true)) {
                            class45 var23 = class45.method456(var22.field738);
                            if (this.field532 == 1) {
                                this.field434[this.field344] = "Use " + this.field536 + " with @lre@" + var23.field1269;
                                this.field180[this.field344] = 212;
                                this.field181[this.field344] = var22.field738;
                                this.field178[this.field344] = var5;
                                this.field179[this.field344] = var6;
                                ++this.field344;
                            } else if (this.field192 == 1) {
                                if ((this.field194 & 1) == 1) {
                                    this.field434[this.field344] = this.field195 + " @lre@" + var23.field1269;
                                    this.field180[this.field344] = 482;
                                    this.field181[this.field344] = var22.field738;
                                    this.field178[this.field344] = var5;
                                    this.field179[this.field344] = var6;
                                    ++this.field344;
                                }
                            } else {
                                for (int var24 = 4; var24 >= 0; --var24) {
                                    if (var23.field1263 != null && var23.field1263[var24] != null) {
                                        this.field434[this.field344] = var23.field1263[var24] + " @lre@" + var23.field1269;
                                        if (var24 == 0) {
                                            this.field180[this.field344] = 5;
                                        }
                                        if (var24 == 1) {
                                            this.field180[this.field344] = 270;
                                        }
                                        if (var24 == 2) {
                                            this.field180[this.field344] = 435;
                                        }
                                        if (var24 == 3) {
                                            this.field180[this.field344] = 995;
                                        }
                                        if (var24 == 4) {
                                            this.field180[this.field344] = 307;
                                        }
                                        this.field181[this.field344] = var22.field738;
                                        this.field178[this.field344] = var5;
                                        this.field179[this.field344] = var6;
                                        ++this.field344;
                                    } else if (var24 == 2) {
                                        this.field434[this.field344] = "Take @lre@" + var23.field1269;
                                        this.field180[this.field344] = 435;
                                        this.field181[this.field344] = var22.field738;
                                        this.field178[this.field344] = var5;
                                        this.field179[this.field344] = var6;
                                        ++this.field344;
                                    }
                                }
                                this.field434[this.field344] = "Examine @lre@" + var23.field1269;
                                this.field180[this.field344] = 1260;
                                this.field181[this.field344] = var22.field738;
                                this.field178[this.field344] = var5;
                                this.field179[this.field344] = var6;
                                ++this.field344;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Ljava/lang/String;)V")
    private final void method275(String arg0) {
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

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
    public final void method276(int arg0) {
        if (!this.field621 && !this.field231 && !this.field453) {
            ++field294;
            if (!this.field250) {
                this.method189(356, false);
            } else {
                this.method269(0);
            }
            this.field582 = 0;
            if (arg0 < 6 || arg0 > 6) {
                this.field233 = -1;
            }
        } else {
            this.method284(282);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILRAOZRSKX;)V")
    public final void method277(int arg0, class44 arg1) {
        if (arg0 < 0 || arg0 > 0) {
            this.field544 = null;
        }
        short var3 = 256;
        for (int var4 = 0; var4 < this.field196.length; ++var4) {
            this.field196[var4] = 0;
        }
        for (int var5 = 0; var5 < 5000; ++var5) {
            int var17 = (int) (Math.random() * 128.0D * (double) var3);
            this.field196[var17] = (int) (Math.random() * 256.0D);
        }
        for (int var6 = 0; var6 < 20; ++var6) {
            for (int var13 = 1; var13 < var3 - 1; ++var13) {
                for (int var15 = 1; var15 < 127; ++var15) {
                    int var16 = (var13 << 7) + var15;
                    this.field197[var16] = (this.field196[var16 - 1] + this.field196[var16 + 1] + this.field196[var16 - 128] + this.field196[var16 + 128]) / 4;
                }
            }
            int[] var14 = this.field196;
            this.field196 = this.field197;
            this.field197 = var14;
        }
        if (arg1 != null) {
            int var7 = 0;
            for (int var8 = 0; var8 < arg1.field1236; ++var8) {
                for (int var9 = 0; var9 < arg1.field1235; ++var9) {
                    if (arg1.field1233[var7++] != 0) {
                        int var10 = var9 + 16 + arg1.field1237;
                        int var11 = var8 + 16 + arg1.field1238;
                        int var12 = (var11 << 7) + var10;
                        this.field196[var12] = 0;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(IB)V")
    public final void method278(int arg0, byte arg1) {
        int[] var3 = this.field424.field1076;
        int var4 = var3.length;
        if (arg1 == 2) {
            boolean var5 = false;
        } else {
            this.method162();
        }
        for (int var6 = 0; var6 < var4; ++var6) {
            var3[var6] = 0;
        }
        for (int var7 = 1; var7 < 103; ++var7) {
            int var24 = (103 - var7) * 512 * 4 + 24628;
            for (int var25 = 1; var25 < 103; ++var25) {
                if ((this.field508[arg0][var25][var7] & 24) == 0) {
                    this.field306.method408(var3, var24, 512, arg0, var25, var7);
                }
                if (arg0 < 3 && (this.field508[arg0 + 1][var25][var7] & 8) != 0) {
                    this.field306.method408(var3, var24, 512, arg0 + 1, var25, var7);
                }
                var24 += 4;
            }
        }
        int var8 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var9 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        this.field424.method348(-19705);
        for (int var10 = 1; var10 < 103; ++var10) {
            for (int var23 = 1; var23 < 103; ++var23) {
                if ((this.field508[arg0][var23][var10] & 24) == 0) {
                    this.method273(var10, var8, arg0, 0, var23, var9);
                }
                if (arg0 < 3 && (this.field508[arg0 + 1][var23][var10] & 8) != 0) {
                    this.method273(var10, var8, arg0 + 1, 0, var23, var9);
                }
            }
        }
        if (this.field354 != null) {
            this.field354.method592(-19705);
            class42.field1212 = this.field489;
        }
        this.field426 = 0;
        for (int var11 = 0; var11 < 104; ++var11) {
            for (int var12 = 0; var12 < 104; ++var12) {
                int var13 = this.field306.method402(this.field272, var11, var12);
                if (var13 != 0) {
                    int var14 = var13 >> 14 & 32767;
                    int var15 = class68.method575(var14).field1714;
                    if (var15 >= 0) {
                        int var16 = var11;
                        int var17 = var12;
                        if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
                            byte var18 = 104;
                            byte var19 = 104;
                            int[][] var20 = this.field217[this.field272].field1336;
                            for (int var21 = 0; var21 < 10; ++var21) {
                                int var22 = (int) (Math.random() * 4.0D);
                                if (var22 == 0 && var16 > 0 && var16 > var11 - 3 && (var20[var16 - 1][var17] & 19398920) == 0) {
                                    --var16;
                                }
                                if (var22 == 1 && var16 < var18 - 1 && var16 < var11 + 3 && (var20[var16 + 1][var17] & 19399040) == 0) {
                                    ++var16;
                                }
                                if (var22 == 2 && var17 > 0 && var17 > var12 - 3 && (var20[var16][var17 - 1] & 19398914) == 0) {
                                    --var17;
                                }
                                if (var22 == 3 && var17 < var19 - 1 && var17 < var12 + 3 && (var20[var16][var17 + 1] & 19398944) == 0) {
                                    ++var17;
                                }
                            }
                        }
                        this.field538[this.field426] = this.field629[var15];
                        this.field427[this.field426] = var16;
                        this.field428[this.field426] = var17;
                        ++this.field426;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
    public final void method279(boolean arg0) {
        if (!this.field621 && !this.field231 && !this.field453) {
            ++field564;
            if (!arg0) {
                if (!this.field250) {
                    this.method286(this.field314);
                } else {
                    this.method167(false);
                }
                this.method193(5);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(II)V")
    public final void method280(int arg0, int arg1) {
        if (arg0 != -44090) {
            for (int var3 = 1; var3 > 0; ++var3) {
            }
        }
        signlink.wavevol = arg1;
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
    public final void init() {
        field371 = Integer.parseInt(this.getParameter("nodeid"));
        field372 = Integer.parseInt(this.getParameter("portoff"));
        String var1 = this.getParameter("lowmem");
        if (var1 != null && var1.equals("1")) {
            method185(-588);
        } else {
            method166(6);
        }
        String var2 = this.getParameter("free");
        if (var2 != null && var2.equals("1")) {
            field373 = false;
        } else {
            field373 = true;
        }
        this.method515(field303, 765, 503);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(LIOPHRJNF;ZIILBFQIDHPO;)V")
    private final void method281(class22 arg0, boolean arg1, int arg2, int arg3, class3 arg4) {
        this.field250 &= arg1;
        if ((arg3 & 4) != 0) {
            arg0.field875 = arg4.method81(true);
            if (arg0.field875 == 65535) {
                arg0.field875 = -1;
            }
        }
        if ((arg3 & 128) != 0) {
            int var6 = arg4.method54();
            byte[] var7 = new byte[var6];
            class3 var8 = new class3(var7, -990);
            arg4.method63(0, var7, var6, (byte) 5);
            this.field365[arg2] = var8;
            arg0.method321((byte) 5, var8);
        }
        if ((arg3 & 256) != 0) {
            arg0.field896 = arg4.method75(false);
            arg0.field898 = arg4.method54();
            arg0.field897 = arg4.method54();
            arg0.field899 = arg4.method75(false);
            arg0.field900 = arg4.method81(true) + field564;
            arg0.field901 = arg4.method81(true) + field564;
            arg0.field902 = arg4.method74(-719);
            arg0.method315(true);
        }
        if ((arg3 & 1) != 0) {
            int var9 = arg4.method56();
            if (var9 == 65535) {
                var9 = -1;
            }
            int var10 = arg4.method74(-719);
            if (arg0.field869 == var9 && var9 != -1) {
                int var11 = class50.field1392[var9].field1406;
                if (var11 == 1) {
                    arg0.field870 = 0;
                    arg0.field871 = 0;
                    arg0.field872 = var10;
                    arg0.field873 = 0;
                }
                if (var11 == 2) {
                    arg0.field873 = 0;
                }
            } else if (var9 == -1 || arg0.field869 == -1 || class50.field1392[var9].field1400 >= class50.field1392[arg0.field869].field1400) {
                arg0.field869 = var9;
                arg0.field870 = 0;
                arg0.field871 = 0;
                arg0.field872 = var10;
                arg0.field873 = 0;
                arg0.field868 = arg0.field904;
            }
        }
        if ((arg3 & 2) != 0) {
            arg0.field913 = arg4.method56();
            arg0.field914 = arg4.method82((byte) 3);
        }
        if ((arg3 & 1024) != 0) {
            int var12 = arg4.method74(-719);
            int var13 = arg4.method54();
            arg0.method318(field564, (byte) -87, var13, var12);
            arg0.field909 = field564 + 300;
            arg0.field910 = arg4.method54();
            arg0.field911 = arg4.method73(-732);
        }
        if ((arg3 & 512) != 0) {
            arg0.field888 = arg4.method82((byte) 3);
            int var14 = arg4.method88(-105);
            arg0.field892 = var14 >> 16;
            arg0.field891 = (var14 & 65535) + field564;
            arg0.field889 = 0;
            arg0.field890 = 0;
            if (arg0.field891 > field564) {
                arg0.field889 = -1;
            }
            if (arg0.field888 == 65535) {
                arg0.field888 = -1;
            }
        }
        if ((arg3 & 8) != 0) {
            arg0.field916 = arg4.method61();
            if (arg0.field916.charAt(0) == '~') {
                arg0.field916 = arg0.field916.substring(1);
                this.method192(arg0.field953, arg0.field916, 2, this.field369);
            } else if (field623 == arg0) {
                this.method192(arg0.field953, arg0.field916, 2, this.field369);
            }
            arg0.field876 = 0;
            arg0.field887 = 0;
            arg0.field908 = 150;
        }
        if ((arg3 & 64) != 0) {
            int var15 = arg4.method56();
            int var16 = arg4.method73(-732);
            int var17 = arg4.method73(-732);
            int var18 = arg4.field50;
            if (arg0.field953 != null && arg0.field952) {
                long var19 = class29.method323(arg0.field953);
                boolean var21 = false;
                if (var16 <= 1) {
                    for (int var22 = 0; var22 < this.field498; ++var22) {
                        if (this.field269[var22] == var19) {
                            var21 = true;
                            break;
                        }
                    }
                }
                if (!var21 && this.field529 == 0) {
                    try {
                        this.field503.field50 = 0;
                        arg4.method63(0, this.field503.field49, var17, (byte) 5);
                        this.field503.field50 = 0;
                        String var23 = class40.method369(this.field605, this.field503, var17);
                        String var24 = class1.method11(-18263, var23);
                        arg0.field916 = var24;
                        arg0.field876 = var15 >> 8;
                        arg0.field887 = var15 & 255;
                        arg0.field908 = 150;
                        if (var16 != 2 && var16 != 3) {
                            if (var16 == 1) {
                                this.method192("@cr1@" + arg0.field953, var24, 1, this.field369);
                            } else {
                                this.method192(arg0.field953, var24, 2, this.field369);
                            }
                        } else {
                            this.method192("@cr2@" + arg0.field953, var24, 1, this.field369);
                        }
                    } catch (Exception var28) {
                        signlink.reporterror("cde2");
                    }
                }
            }
            arg4.field50 = var17 + var18;
        }
        if ((arg3 & 16) != 0) {
            int var26 = arg4.method54();
            int var27 = arg4.method75(false);
            arg0.method318(field564, (byte) -87, var27, var26);
            arg0.field909 = field564 + 300;
            arg0.field910 = arg4.method74(-719);
            arg0.field911 = arg4.method54();
        }
    }

    @OriginalMember(owner = "client!client", name = "run", descriptor = "()V")
    public final void run() {
        if (this.field429) {
            this.method224(0);
        } else {
            super.run();
        }
    }

    @OriginalMember(owner = "client!client", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        return signlink.mainapp != null ? signlink.mainapp.getParameter(arg0) : super.getParameter(arg0);
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(IIII)I")
    public final int method282(int arg0, int arg1, int arg2, int arg3) {
        int var5 = 92 / arg1;
        int var6 = 256 - arg3;
        return ((arg0 & 16711935) * arg3 + (arg2 & 16711935) * var6 & -16711936) + ((arg0 & 65280) * arg3 + (arg2 & 65280) * var6 & 16711680) >> 8;
    }

    @OriginalMember(owner = "client!client", name = "M", descriptor = "(I)Ljava/net/Socket;")
    public final Socket method283(int arg0) throws IOException {
        return signlink.mainapp != null ? signlink.opensocket(arg0) : new Socket(InetAddress.getByName(this.getCodeBase().getHost()), arg0);
    }

    @OriginalMember(owner = "client!client", name = "N", descriptor = "(I)V")
    public final void method284(int arg0) {
        Graphics var2 = this.method271(-319).getGraphics();
        var2.setColor(Color.black);
        if (arg0 <= 0) {
            this.field233 = this.field404.method54();
        }
        var2.fillRect(0, 0, 765, 503);
        this.method517(true, 1);
        if (this.field231) {
            this.field221 = false;
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
        if (this.field453) {
            this.field221 = false;
            var2.setFont(new Font("Helvetica", 1, 20));
            var2.setColor(Color.white);
            var2.drawString("Error - unable to load game!", 50, 50);
            var2.drawString("To play RuneScape make sure you play from", 50, 100);
            var2.drawString("http://www.runescape.com", 50, 150);
        }
        if (this.field621) {
            this.field221 = false;
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

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(IILBFQIDHPO;)V")
    private final void method285(int arg0, int arg1, class3 arg2) {
        for (int var4 = 0; var4 < this.field363; ++var4) {
            int var5 = this.field364[var4];
            class2 var6 = this.field504[var5];
            int var7 = arg2.method54();
            if ((var7 & 32) != 0) {
                var6.field916 = arg2.method61();
                var6.field908 = 100;
            }
            if ((var7 & 16) != 0) {
                int var8 = arg2.method73(-732);
                int var9 = arg2.method74(-719);
                var6.method318(field564, (byte) -87, var9, var8);
                var6.field909 = field564 + 300;
                var6.field910 = arg2.method54();
                var6.field911 = arg2.method75(false);
            }
            if ((var7 & 1) != 0) {
                var6.field913 = arg2.method81(true);
                var6.field914 = arg2.method56();
            }
            if ((var7 & 64) != 0) {
                var6.field25 = class49.method501(arg2.method56());
                var6.field874 = var6.field25.field1363;
                var6.field895 = var6.field25.field1358;
                var6.field864 = var6.field25.field1375;
                var6.field865 = var6.field25.field1377;
                var6.field866 = var6.field25.field1351;
                var6.field867 = var6.field25.field1381;
                var6.field862 = var6.field25.field1386;
            }
            if ((var7 & 128) != 0) {
                var6.field875 = arg2.method83(this.field454);
                if (var6.field875 == 65535) {
                    var6.field875 = -1;
                }
            }
            if ((var7 & 4) != 0) {
                int var10 = arg2.method75(false);
                int var11 = arg2.method74(-719);
                var6.method318(field564, (byte) -87, var11, var10);
                var6.field909 = field564 + 300;
                var6.field910 = arg2.method54();
                var6.field911 = arg2.method54();
            }
            if ((var7 & 8) != 0) {
                int var12 = arg2.method81(true);
                if (var12 == 65535) {
                    var12 = -1;
                }
                int var13 = arg2.method75(false);
                if (var6.field869 == var12 && var12 != -1) {
                    int var14 = class50.field1392[var12].field1406;
                    if (var14 == 1) {
                        var6.field870 = 0;
                        var6.field871 = 0;
                        var6.field872 = var13;
                        var6.field873 = 0;
                    }
                    if (var14 == 2) {
                        var6.field873 = 0;
                    }
                } else if (var12 == -1 || var6.field869 == -1 || class50.field1392[var12].field1400 >= class50.field1392[var6.field869].field1400) {
                    var6.field869 = var12;
                    var6.field870 = 0;
                    var6.field871 = 0;
                    var6.field872 = var13;
                    var6.field873 = 0;
                    var6.field868 = var6.field904;
                }
            }
            if ((var7 & 2) != 0) {
                var6.field888 = arg2.method81(true);
                int var15 = arg2.method59();
                var6.field892 = var15 >> 16;
                var6.field891 = (var15 & 65535) + field564;
                var6.field889 = 0;
                var6.field890 = 0;
                if (var6.field891 > field564) {
                    var6.field889 = -1;
                }
                if (var6.field888 == 65535) {
                    var6.field888 = -1;
                }
            }
        }
        if (arg0 < 8 || arg0 > 8) {
            this.field233 = -1;
        }
    }

    @OriginalMember(owner = "client!client", name = "O", descriptor = "(I)V")
    public final void method286(int arg0) {
        if (arg0 != 43818) {
            this.field341 = !this.field341;
        }
        if (this.field313 == 0) {
            int var2 = super.field1431 / 2 - 80;
            int var3 = super.field1432 / 2 + 20;
            int var14 = var3 + 20;
            if (super.field1447 == 1 && super.field1448 >= var2 - 75 && super.field1448 <= var2 + 75 && super.field1449 >= var14 - 20 && super.field1449 <= var14 + 20) {
                this.field313 = 3;
                this.field200 = 0;
            }
            int var4 = super.field1431 / 2 + 80;
            if (super.field1447 == 1 && super.field1448 >= var4 - 75 && super.field1448 <= var4 + 75 && super.field1449 >= var14 - 20 && super.field1449 <= var14 + 20) {
                this.field346 = "";
                this.field347 = "Enter your username & password.";
                this.field313 = 2;
                this.field200 = 0;
            }
        } else if (this.field313 == 2) {
            int var5 = super.field1432 / 2 - 40;
            int var15 = var5 + 30;
            int var16 = var15 + 25;
            if (super.field1447 == 1 && super.field1449 >= var16 - 15 && super.field1449 < var16) {
                this.field200 = 0;
            }
            var5 = var16 + 15;
            if (super.field1447 == 1 && super.field1449 >= var5 - 15 && super.field1449 < var5) {
                this.field200 = 1;
            }
            var5 += 15;
            int var6 = super.field1431 / 2 - 80;
            int var7 = super.field1432 / 2 + 50;
            int var17 = var7 + 20;
            if (super.field1447 == 1 && super.field1448 >= var6 - 75 && super.field1448 <= var6 + 75 && super.field1449 >= var17 - 20 && super.field1449 <= var17 + 20) {
                this.field216 = 0;
                this.method151(this.field416, this.field417, false);
                if (this.field250) {
                    return;
                }
            }
            int var8 = super.field1431 / 2 + 80;
            if (super.field1447 == 1 && super.field1448 >= var8 - 75 && super.field1448 <= var8 + 75 && super.field1449 >= var17 - 20 && super.field1449 <= var17 + 20) {
                this.field313 = 0;
                this.field416 = "";
                this.field417 = "";
            }
            while (true) {
                while (true) {
                    int var9 = this.method518(true);
                    if (var9 == -1) {
                        return;
                    }
                    boolean var10 = false;
                    for (int var11 = 0; var11 < field257.length(); ++var11) {
                        if (var9 == field257.charAt(var11)) {
                            var10 = true;
                            break;
                        }
                    }
                    if (this.field200 == 0) {
                        if (var9 == 8 && this.field416.length() > 0) {
                            this.field416 = this.field416.substring(0, this.field416.length() - 1);
                        }
                        if (var9 == 9 || var9 == 10 || var9 == 13) {
                            this.field200 = 1;
                        }
                        if (var10) {
                            this.field416 = this.field416 + (char) var9;
                        }
                        if (this.field416.length() > 12) {
                            this.field416 = this.field416.substring(0, 12);
                        }
                    } else if (this.field200 == 1) {
                        if (var9 == 8 && this.field417.length() > 0) {
                            this.field417 = this.field417.substring(0, this.field417.length() - 1);
                        }
                        if (var9 == 9 || var9 == 10 || var9 == 13) {
                            this.field200 = 0;
                        }
                        if (var10) {
                            this.field417 = this.field417 + (char) var9;
                        }
                        if (this.field417.length() > 20) {
                            this.field417 = this.field417.substring(0, 20);
                        }
                    }
                }
            }
        } else {
            if (this.field313 == 3) {
                int var12 = super.field1431 / 2;
                int var13 = super.field1432 / 2 + 50;
                int var18 = var13 + 20;
                if (super.field1447 == 1 && super.field1448 >= var12 - 75 && super.field1448 <= var12 + 75 && super.field1449 >= var18 - 20 && super.field1449 <= var18 + 20) {
                    this.field313 = 0;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IZI)Z")
    public final boolean method287(int arg0, boolean arg1, int arg2) {
        boolean var4 = false;
        if (arg1) {
            this.field544 = null;
        }
        class15 var5 = class15.method306(arg0);
        for (int var6 = 0; var6 < var5.field774.length && var5.field774[var6] != -1; ++var6) {
            class15 var7 = class15.method306(var5.field774[var6]);
            if (var7.field818 == 0) {
                var4 |= this.method287(var7.field809, false, arg2);
            }
            if (var7.field818 == 6 && (var7.field787 != -1 || var7.field788 != -1)) {
                boolean var8 = this.method194(var7, this.field357);
                int var9;
                if (var8) {
                    var9 = var7.field788;
                } else {
                    var9 = var7.field787;
                }
                if (var9 != -1) {
                    class50 var10 = class50.field1392[var9];
                    var7.field749 += arg2;
                    while (var7.field749 > var10.method507(var7.field761, 196)) {
                        var7.field749 -= var10.method507(var7.field761, 196) + 1;
                        ++var7.field761;
                        if (var7.field761 >= var10.field1393) {
                            var7.field761 -= var10.field1397;
                            if (var7.field761 < 0 || var7.field761 >= var10.field1393) {
                                var7.field761 = 0;
                            }
                        }
                        var4 = true;
                    }
                }
            }
            if (var7.field818 == 6 && var7.field775 != 0) {
                int var11 = var7.field775 >> 16;
                int var12 = var7.field775 << 16 >> 16;
                int var13 = arg2 * var11;
                int var14 = arg2 * var12;
                var7.field803 = var7.field803 + var13 & 2047;
                var7.field804 = var7.field804 + var14 & 2047;
                var4 = true;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(B)V")
    public final void method288(byte arg0) {
        this.field606 = true;
        for (int var2 = 0; var2 < 7; ++var2) {
            this.field641[var2] = -1;
            for (int var4 = 0; var4 < class39.field1111; ++var4) {
                if (!class39.field1112[var4].field1118 && class39.field1112[var4].field1113 == var2 + (this.field541 ? 0 : 7)) {
                    this.field641[var2] = var4;
                    break;
                }
            }
        }
        if (arg0 == 2) {
            boolean var3 = false;
        } else {
            this.field483.method44(97);
        }
    }

    @OriginalMember(owner = "client!client", name = "P", descriptor = "(I)V")
    private final void method289(int arg0) {
        int var2 = 4 / arg0;
        if (this.field256 == 2) {
            for (class26 var3 = (class26) this.field218.method598(); var3 != null; var3 = (class26) this.field218.method600(4)) {
                if (var3.field982 > 0) {
                    --var3.field982;
                }
                if (var3.field982 == 0) {
                    if (var3.field979 < 0 || class46.method469(0, var3.field979, var3.field981)) {
                        this.method186(var3.field981, var3.field984, (byte) -28, var3.field983, var3.field985, var3.field986, var3.field979, var3.field980);
                        var3.method329();
                    }
                } else {
                    if (var3.field978 > 0) {
                        --var3.field978;
                    }
                    if (var3.field978 == 0 && var3.field985 >= 1 && var3.field986 >= 1 && var3.field985 <= 102 && var3.field986 <= 102 && (var3.field987 < 0 || class46.method469(0, var3.field987, var3.field989))) {
                        this.method186(var3.field989, var3.field984, (byte) -28, var3.field983, var3.field985, var3.field986, var3.field987, var3.field988);
                        var3.field978 = -1;
                        if (var3.field987 == var3.field979 && var3.field979 == -1) {
                            var3.method329();
                        } else if (var3.field987 == var3.field979 && var3.field988 == var3.field980 && var3.field989 == var3.field981) {
                            var3.method329();
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(ZJ)V")
    public final void method290(boolean arg0, long arg1) {
        if (arg1 != 0L) {
            for (int var4 = 0; var4 < this.field493; ++var4) {
                if (this.field189[var4] == arg1) {
                    --this.field493;
                    this.field501 = true;
                    for (int var5 = var4; var5 < this.field493; ++var5) {
                        this.field204[var5] = this.field204[var5 + 1];
                        this.field268[var5] = this.field268[var5 + 1];
                        this.field189[var5] = this.field189[var5 + 1];
                    }
                    this.field483.method43(0, 19);
                    this.field483.method50(this.field642, arg1);
                    break;
                }
            }
            this.field250 &= arg0;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(LSHKUIFHF;IIIZ)V")
    public final void method291(class49 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (arg4) {
            if (this.field344 < 400) {
                if (arg0.field1379 != null) {
                    arg0 = arg0.method504(0);
                }
                if (arg0 != null) {
                    if (arg0.field1359) {
                        String var6 = arg0.field1368;
                        if (arg0.field1370 != 0) {
                            var6 = var6 + method170(field623.field956, arg0.field1370, 0) + " (level-" + arg0.field1370 + ")";
                        }
                        if (this.field532 == 1) {
                            this.field434[this.field344] = "Use " + this.field536 + " with @yel@" + var6;
                            this.field180[this.field344] = 963;
                            this.field181[this.field344] = arg3;
                            this.field178[this.field344] = arg1;
                            this.field179[this.field344] = arg2;
                            ++this.field344;
                        } else {
                            if (this.field192 == 1) {
                                if ((this.field194 & 2) == 2) {
                                    this.field434[this.field344] = this.field195 + " @yel@" + var6;
                                    this.field180[this.field344] = 947;
                                    this.field181[this.field344] = arg3;
                                    this.field178[this.field344] = arg1;
                                    this.field179[this.field344] = arg2;
                                    ++this.field344;
                                    return;
                                }
                            } else {
                                if (arg0.field1348 != null) {
                                    for (int var7 = 4; var7 >= 0; --var7) {
                                        if (arg0.field1348[var7] != null && !arg0.field1348[var7].equalsIgnoreCase("attack")) {
                                            this.field434[this.field344] = arg0.field1348[var7] + " @yel@" + var6;
                                            if (var7 == 0) {
                                                this.field180[this.field344] = 977;
                                            }
                                            if (var7 == 1) {
                                                this.field180[this.field344] = 112;
                                            }
                                            if (var7 == 2) {
                                                this.field180[this.field344] = 709;
                                            }
                                            if (var7 == 3) {
                                                this.field180[this.field344] = 526;
                                            }
                                            if (var7 == 4) {
                                                this.field180[this.field344] = 741;
                                            }
                                            this.field181[this.field344] = arg3;
                                            this.field178[this.field344] = arg1;
                                            this.field179[this.field344] = arg2;
                                            ++this.field344;
                                        }
                                    }
                                }
                                if (arg0.field1348 != null) {
                                    for (int var8 = 4; var8 >= 0; --var8) {
                                        if (arg0.field1348[var8] != null && arg0.field1348[var8].equalsIgnoreCase("attack")) {
                                            short var9 = 0;
                                            if (arg0.field1370 > field623.field956) {
                                                var9 = 2000;
                                            }
                                            this.field434[this.field344] = arg0.field1348[var8] + " @yel@" + var6;
                                            if (var8 == 0) {
                                                this.field180[this.field344] = var9 + 977;
                                            }
                                            if (var8 == 1) {
                                                this.field180[this.field344] = var9 + 112;
                                            }
                                            if (var8 == 2) {
                                                this.field180[this.field344] = var9 + 709;
                                            }
                                            if (var8 == 3) {
                                                this.field180[this.field344] = var9 + 526;
                                            }
                                            if (var8 == 4) {
                                                this.field180[this.field344] = var9 + 741;
                                            }
                                            this.field181[this.field344] = arg3;
                                            this.field178[this.field344] = arg1;
                                            this.field179[this.field344] = arg2;
                                            ++this.field344;
                                        }
                                    }
                                }
                                this.field434[this.field344] = "Examine @yel@" + var6;
                                this.field180[this.field344] = 1170;
                                this.field181[this.field344] = arg3;
                                this.field178[this.field344] = arg1;
                                this.field179[this.field344] = arg2;
                                ++this.field344;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIZIII)V")
    public final void method292(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        this.field626.method446(arg1, (byte) 3, arg0);
        this.field627.method446(arg1 + arg5 - 16, (byte) 3, arg0);
        class8.method143(this.field436, arg0, arg1 + 16, 16, arg5 - 32, false);
        int var7 = (arg5 - 32) * arg5 / arg4;
        if (var7 < 8) {
            var7 = 8;
        }
        int var8 = (arg5 - 32 - var7) * arg3 / (arg4 - arg5);
        class8.method143(this.field589, arg0, arg1 + 16 + var8, 16, var7, false);
        class8.method148(this.field376, var7, arg0, true, arg1 + 16 + var8);
        class8.method148(this.field376, var7, arg0 + 1, true, arg1 + 16 + var8);
        class8.method146(-898, 16, arg0, this.field376, arg1 + 16 + var8);
        class8.method146(-898, 16, arg0, this.field376, arg1 + 17 + var8);
        class8.method148(this.field177, var7, arg0 + 15, true, arg1 + 16 + var8);
        class8.method148(this.field177, var7 - 1, arg0 + 14, true, arg1 + 17 + var8);
        if (!arg2) {
            class8.method146(-898, 16, arg0, this.field177, arg1 + 15 + var8 + var7);
            class8.method146(-898, 15, arg0 + 1, this.field177, arg1 + 14 + var8 + var7);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(LIYAQHTAH;B)V")
    private final void method293(class26 arg0, byte arg1) {
        int var3 = 0;
        int var4 = -1;
        int var5 = 0;
        int var6 = 0;
        if (arg1 == 3) {
            boolean var7 = false;
        } else {
            this.field483.method44(85);
        }
        if (arg0.field984 == 0) {
            var3 = this.field306.method399(arg0.field983, arg0.field985, arg0.field986);
        }
        if (arg0.field984 == 1) {
            var3 = this.field306.method400(arg0.field983, arg0.field985, arg0.field986, 3);
        }
        if (arg0.field984 == 2) {
            var3 = this.field306.method401(arg0.field983, arg0.field985, arg0.field986);
        }
        if (arg0.field984 == 3) {
            var3 = this.field306.method402(arg0.field983, arg0.field985, arg0.field986);
        }
        if (var3 != 0) {
            int var8 = this.field306.method403(arg0.field983, arg0.field985, arg0.field986, var3);
            var4 = var3 >> 14 & 32767;
            var5 = var8 & 31;
            var6 = var8 >> 6;
        }
        arg0.field979 = var4;
        arg0.field981 = var5;
        arg0.field980 = var6;
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(B)V")
    public final void method294(byte arg0) {
        if (arg0 != -9) {
            this.field483.method44(111);
        }
        if (this.field296 == 0) {
            if (super.field1447 == 1) {
                int var2 = super.field1448 - 25 - 550;
                int var3 = super.field1449 - 5 - 4;
                if (var2 >= 0 && var3 >= 0 && var2 < 146 && var3 < 151) {
                    var2 -= 73;
                    var3 -= 75;
                    int var4 = this.field469 + this.field466 & 2047;
                    int var5 = class42.field1210[var4];
                    int var6 = class42.field1211[var4];
                    int var7 = (this.field565 + 256) * var5 >> 8;
                    int var8 = (this.field565 + 256) * var6 >> 8;
                    int var9 = var2 * var8 + var3 * var7 >> 11;
                    int var10 = var3 * var8 - var2 * var7 >> 11;
                    int var11 = field623.field884 + var9 >> 7;
                    int var12 = field623.field885 - var10 >> 7;
                    boolean var13 = this.method217(0, 0, var12, true, (byte) 6, 0, var11, 1, field623.field905[0], field623.field906[0], 0, 0);
                    if (var13) {
                        this.field483.method44(var2);
                        this.field483.method44(var3);
                        this.field483.method45(this.field469);
                        this.field483.method44(57);
                        this.field483.method44(this.field466);
                        this.field483.method44(this.field565);
                        this.field483.method44(89);
                        this.field483.method45(field623.field884);
                        this.field483.method45(field623.field885);
                        this.field483.method44(this.field609);
                        this.field483.method44(63);
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(B)V")
    public final void method295(byte arg0) {
        int var2 = this.field647 * 128 + 64;
        int var3 = this.field648 * 128 + 64;
        int var4 = this.method190(0, var3, this.field272, var2) - this.field649;
        if (this.field556 < var2) {
            this.field556 += (var2 - this.field556) * this.field651 / 1000 + this.field650;
            if (this.field556 > var2) {
                this.field556 = var2;
            }
        }
        if (this.field556 > var2) {
            this.field556 -= (this.field556 - var2) * this.field651 / 1000 + this.field650;
            if (this.field556 < var2) {
                this.field556 = var2;
            }
        }
        if (this.field557 < var4) {
            this.field557 += (var4 - this.field557) * this.field651 / 1000 + this.field650;
            if (this.field557 > var4) {
                this.field557 = var4;
            }
        }
        if (this.field557 > var4) {
            this.field557 -= (this.field557 - var4) * this.field651 / 1000 + this.field650;
            if (this.field557 < var4) {
                this.field557 = var4;
            }
        }
        if (this.field558 < var3) {
            this.field558 += (var3 - this.field558) * this.field651 / 1000 + this.field650;
            if (this.field558 > var3) {
                this.field558 = var3;
            }
        }
        if (this.field558 > var3) {
            this.field558 -= (this.field558 - var3) * this.field651 / 1000 + this.field650;
            if (this.field558 < var3) {
                this.field558 = var3;
            }
        }
        int var5 = this.field442 * 128 + 64;
        int var6 = this.field443 * 128 + 64;
        int var7 = this.method190(0, var6, this.field272, var5) - this.field444;
        int var8 = var5 - this.field556;
        int var9 = var7 - this.field557;
        int var10 = var6 - this.field558;
        int var11 = (int) Math.sqrt((double) (var8 * var8 + var10 * var10));
        int var12 = (int) (Math.atan2((double) var9, (double) var11) * 325.949D) & 2047;
        int var13 = (int) (Math.atan2((double) var8, (double) var10) * -325.949D) & 2047;
        if (this.field472 != arg0) {
            this.field544 = null;
        }
        if (var12 < 128) {
            var12 = 128;
        }
        if (var12 > 383) {
            var12 = 383;
        }
        if (this.field559 < var12) {
            this.field559 += (var12 - this.field559) * this.field446 / 1000 + this.field445;
            if (this.field559 > var12) {
                this.field559 = var12;
            }
        }
        if (this.field559 > var12) {
            this.field559 -= (this.field559 - var12) * this.field446 / 1000 + this.field445;
            if (this.field559 < var12) {
                this.field559 = var12;
            }
        }
        int var14 = var13 - this.field560;
        if (var14 > 1024) {
            var14 -= 2048;
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (var14 > 0) {
            this.field560 += this.field446 * var14 / 1000 + this.field445;
            this.field560 &= 2047;
        }
        if (var14 < 0) {
            this.field560 -= -var14 * this.field446 / 1000 + this.field445;
            this.field560 &= 2047;
        }
        int var15 = var13 - this.field560;
        if (var15 > 1024) {
            var15 -= 2048;
        }
        if (var15 < -1024) {
            var15 += 2048;
        }
        if (var15 < 0 && var14 > 0 || var15 > 0 && var14 < 0) {
            this.field560 = var13;
        }
    }

    @OriginalMember(owner = "client!client", name = "Q", descriptor = "(I)V")
    public final void method296(int arg0) {
        ++this.field187;
        this.method249(1, true);
        this.method198(true, this.field575);
        this.method249(1, false);
        this.method198(false, this.field575);
        this.method150(true);
        this.method164(45678);
        if (!this.field185) {
            int var2 = this.field468;
            if (this.field542 / 256 > var2) {
                var2 = this.field542 / 256;
            }
            if (this.field381[4] && this.field520[4] + 128 > var2) {
                var2 = this.field520[4] + 128;
            }
            int var3 = this.field597 + this.field469 & 2047;
            this.method228(var3, this.field607, this.field385, this.method190(0, field623.field885, this.field272, field623.field884) - 50, this.field384, var2 * 3 + 600, var2);
        }
        int var4;
        if (!this.field185) {
            var4 = this.method187(2531);
        } else {
            var4 = this.method188(false);
        }
        int var5 = this.field556;
        int var6 = this.field557;
        int var7 = this.field558;
        int var8 = this.field559;
        int var9 = this.field560;
        for (int var10 = 0; var10 < 5; ++var10) {
            if (this.field381[var10]) {
                int var12 = (int) (Math.random() * (double) (this.field480[var10] * 2 + 1) - (double) this.field480[var10] + Math.sin((double) this.field507[var10] / 100.0D * (double) this.field474[var10]) * (double) this.field520[var10]);
                if (var10 == 0) {
                    this.field556 += var12;
                }
                if (var10 == 1) {
                    this.field557 += var12;
                }
                if (var10 == 2) {
                    this.field558 += var12;
                }
                if (var10 == 3) {
                    this.field560 = this.field560 + var12 & 2047;
                }
                if (var10 == 4) {
                    this.field559 += var12;
                    if (this.field559 < 128) {
                        this.field559 = 128;
                    }
                    if (this.field559 > 383) {
                        this.field559 = 383;
                    }
                }
            }
        }
        int var11 = class42.field1221;
        class65.field1653 = true;
        class65.field1656 = 0;
        class65.field1654 = super.field1441 - 4;
        class65.field1655 = super.field1442 - 4;
        class8.method141(true);
        this.field306.method412(var4, 0, this.field558, this.field557, this.field559, this.field556, this.field560);
        this.field306.method387(191);
        if (arg0 < 7 || arg0 > 7) {
            this.method162();
        }
        this.method218(842);
        this.method214(6);
        this.method231(var11, 6);
        this.method203(47383);
        this.field354.method593(super.field1433, 4, false, 4);
        this.field556 = var5;
        this.field557 = var6;
        this.field558 = var7;
        this.field559 = var8;
        this.field560 = var9;
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; ++var1) {
            field307[var1] = var0 - 1;
            var0 += var0;
        }
        field315 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };
        field371 = 10;
        field373 = true;
        field448 = 122;
        field601 = 4;
        field615 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };
        field652 = new int[99];
        int var2 = 0;
        for (int var3 = 0; var3 < 99; ++var3) {
            int var4 = var3 + 1;
            int var5 = (int) ((double) var4 + 300.0D * Math.pow(2.0D, (double) var4 / 7.0D));
            var2 += var5;
            field652[var3] = var2 / 4;
        }
    }
}
