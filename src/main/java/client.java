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
public class client extends class59 {

    @OriginalMember(owner = "client!client", name = "Q", descriptor = "Z")
    private volatile boolean field75 = false;

    @OriginalMember(owner = "client!client", name = "S", descriptor = "Ljava/lang/String;")
    private String field77 = "";

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "Z")
    private volatile boolean field95 = false;

    @OriginalMember(owner = "client!client", name = "ub", descriptor = "Z")
    public boolean field105 = true;

    @OriginalMember(owner = "client!client", name = "vb", descriptor = "Ljava/lang/String;")
    private String field106 = "";

    @OriginalMember(owner = "client!client", name = "wb", descriptor = "I")
    private int field107 = -12340;

    @OriginalMember(owner = "client!client", name = "yb", descriptor = "[LOMAKLDKI;")
    private class37[] field109 = new class37[8];

    @OriginalMember(owner = "client!client", name = "zb", descriptor = "B")
    private byte field110 = 1;

    @OriginalMember(owner = "client!client", name = "Bb", descriptor = "Ljava/lang/String;")
    private String field112 = "";

    @OriginalMember(owner = "client!client", name = "Db", descriptor = "[Ljava/lang/String;")
    private String[] field114 = new String[100];

    @OriginalMember(owner = "client!client", name = "Eb", descriptor = "[I")
    private int[] field115 = new int[100];

    @OriginalMember(owner = "client!client", name = "Gb", descriptor = "Z")
    private boolean field117 = false;

    @OriginalMember(owner = "client!client", name = "Hb", descriptor = "[I")
    private int[] field118 = new int[200];

    @OriginalMember(owner = "client!client", name = "Ib", descriptor = "Ljava/util/zip/CRC32;")
    private CRC32 field119 = new CRC32();

    @OriginalMember(owner = "client!client", name = "Pb", descriptor = "I")
    private int field126 = 50;

    @OriginalMember(owner = "client!client", name = "Qb", descriptor = "[I")
    private int[] field127 = new int[this.field126];

    @OriginalMember(owner = "client!client", name = "Rb", descriptor = "[I")
    private int[] field128 = new int[this.field126];

    @OriginalMember(owner = "client!client", name = "Sb", descriptor = "[I")
    private int[] field129 = new int[this.field126];

    @OriginalMember(owner = "client!client", name = "Tb", descriptor = "[I")
    private int[] field130 = new int[this.field126];

    @OriginalMember(owner = "client!client", name = "Ub", descriptor = "[I")
    private int[] field131 = new int[this.field126];

    @OriginalMember(owner = "client!client", name = "Vb", descriptor = "[I")
    private int[] field132 = new int[this.field126];

    @OriginalMember(owner = "client!client", name = "Wb", descriptor = "[I")
    private int[] field133 = new int[this.field126];

    @OriginalMember(owner = "client!client", name = "Xb", descriptor = "[Ljava/lang/String;")
    private String[] field134 = new String[this.field126];

    @OriginalMember(owner = "client!client", name = "Yb", descriptor = "[I")
    private int[] field135 = new int[151];

    @OriginalMember(owner = "client!client", name = "gc", descriptor = "[LOMAKLDKI;")
    private class37[] field143 = new class37[32];

    @OriginalMember(owner = "client!client", name = "mc", descriptor = "LETMNPRAF;")
    private class11 field149 = new class11(0);

    @OriginalMember(owner = "client!client", name = "pc", descriptor = "I")
    private int field152 = 1;

    @OriginalMember(owner = "client!client", name = "qc", descriptor = "LETMNPRAF;")
    private class11 field153 = new class11(0);

    @OriginalMember(owner = "client!client", name = "sc", descriptor = "I")
    private int field155 = 1;

    @OriginalMember(owner = "client!client", name = "uc", descriptor = "B")
    private byte field157 = -10;

    @OriginalMember(owner = "client!client", name = "vc", descriptor = "Z")
    private boolean field158 = true;

    @OriginalMember(owner = "client!client", name = "yc", descriptor = "Z")
    private boolean field161 = true;

    @OriginalMember(owner = "client!client", name = "zc", descriptor = "I")
    private int field162 = 404;

    @OriginalMember(owner = "client!client", name = "Ac", descriptor = "I")
    private int field163 = -1;

    @OriginalMember(owner = "client!client", name = "Bc", descriptor = "[[[LETMNPRAF;")
    private class11[][][] field164 = new class11[4][104][104];

    @OriginalMember(owner = "client!client", name = "Ec", descriptor = "[I")
    private int[] field167 = new int[5];

    @OriginalMember(owner = "client!client", name = "Mc", descriptor = "Z")
    private boolean field175 = false;

    @OriginalMember(owner = "client!client", name = "Nc", descriptor = "[I")
    private int[] field176 = new int[class58.field1550];

    @OriginalMember(owner = "client!client", name = "Oc", descriptor = "LSVWJKJVI;")
    private class52 field177 = class52.method449(false, 1);

    @OriginalMember(owner = "client!client", name = "Qc", descriptor = "I")
    private int field179 = -309;

    @OriginalMember(owner = "client!client", name = "Yc", descriptor = "B")
    private byte field187 = 112;

    @OriginalMember(owner = "client!client", name = "Zc", descriptor = "Z")
    private boolean field188 = false;

    @OriginalMember(owner = "client!client", name = "ad", descriptor = "I")
    private int field189 = -858;

    @OriginalMember(owner = "client!client", name = "cd", descriptor = "Z")
    private boolean field191 = false;

    @OriginalMember(owner = "client!client", name = "ed", descriptor = "LSVWJKJVI;")
    private class52 field193 = new class52(new byte[5000], true);

    @OriginalMember(owner = "client!client", name = "fd", descriptor = "[LPEHNWFXK;")
    private class42[] field194 = new class42[16384];

    @OriginalMember(owner = "client!client", name = "hd", descriptor = "[I")
    public int[] field196 = new int[16384];

    @OriginalMember(owner = "client!client", name = "id", descriptor = "[I")
    public int[] field197 = new int[2000];

    @OriginalMember(owner = "client!client", name = "jd", descriptor = "[J")
    private long[] field198 = new long[100];

    @OriginalMember(owner = "client!client", name = "md", descriptor = "Ljava/lang/String;")
    private String field201 = "";

    @OriginalMember(owner = "client!client", name = "pd", descriptor = "[I")
    private int[] field204 = new int[class58.field1550];

    @OriginalMember(owner = "client!client", name = "rd", descriptor = "B")
    private byte field206 = -120;

    @OriginalMember(owner = "client!client", name = "sd", descriptor = "[I")
    private int[] field207 = new int[5];

    @OriginalMember(owner = "client!client", name = "td", descriptor = "I")
    private int field208 = 78;

    @OriginalMember(owner = "client!client", name = "xd", descriptor = "[I")
    private int[] field212 = new int[33];

    @OriginalMember(owner = "client!client", name = "yd", descriptor = "Z")
    private boolean field213 = false;

    @OriginalMember(owner = "client!client", name = "Bd", descriptor = "I")
    private int field216 = -1;

    @OriginalMember(owner = "client!client", name = "Fd", descriptor = "I")
    private int field220 = 2;

    @OriginalMember(owner = "client!client", name = "Gd", descriptor = "Ljava/lang/String;")
    private String field221 = "";

    @OriginalMember(owner = "client!client", name = "Hd", descriptor = "[I")
    private int[] field222 = new int[100];

    @OriginalMember(owner = "client!client", name = "Id", descriptor = "[Ljava/lang/String;")
    private String[] field223 = new String[100];

    @OriginalMember(owner = "client!client", name = "Jd", descriptor = "[Ljava/lang/String;")
    private String[] field224 = new String[100];

    @OriginalMember(owner = "client!client", name = "Ld", descriptor = "[LOMAKLDKI;")
    private class37[] field226 = new class37[1000];

    @OriginalMember(owner = "client!client", name = "Vd", descriptor = "Z")
    private boolean field236 = true;

    @OriginalMember(owner = "client!client", name = "ae", descriptor = "I")
    private int field241 = 3;

    @OriginalMember(owner = "client!client", name = "ge", descriptor = "I")
    private int field247 = -1;

    @OriginalMember(owner = "client!client", name = "ie", descriptor = "Z")
    private boolean field249 = false;

    @OriginalMember(owner = "client!client", name = "je", descriptor = "Ljava/lang/String;")
    private String field250 = "";

    @OriginalMember(owner = "client!client", name = "ke", descriptor = "Ljava/lang/String;")
    private String field251 = "";

    @OriginalMember(owner = "client!client", name = "ne", descriptor = "Z")
    private boolean field254 = false;

    @OriginalMember(owner = "client!client", name = "te", descriptor = "[I")
    private int[] field260 = new int[33];

    @OriginalMember(owner = "client!client", name = "ve", descriptor = "[I")
    private int[] field262 = new int[500];

    @OriginalMember(owner = "client!client", name = "we", descriptor = "[I")
    private int[] field263 = new int[500];

    @OriginalMember(owner = "client!client", name = "xe", descriptor = "[I")
    private int[] field264 = new int[500];

    @OriginalMember(owner = "client!client", name = "ye", descriptor = "[I")
    private int[] field265 = new int[500];

    @OriginalMember(owner = "client!client", name = "Be", descriptor = "I")
    private int field268 = -1;

    @OriginalMember(owner = "client!client", name = "Ce", descriptor = "I")
    private int field269 = 340;

    @OriginalMember(owner = "client!client", name = "Fe", descriptor = "I")
    private int field272 = 2;

    @OriginalMember(owner = "client!client", name = "Le", descriptor = "I")
    private int field278 = 2;

    @OriginalMember(owner = "client!client", name = "Me", descriptor = "[[I")
    private int[][] field279 = new int[104][104];

    @OriginalMember(owner = "client!client", name = "Ne", descriptor = "[LZXDQRRNS;")
    private class72[] field280 = new class72[2];

    @OriginalMember(owner = "client!client", name = "Oe", descriptor = "[I")
    private int[] field281 = new int[7];

    @OriginalMember(owner = "client!client", name = "Pe", descriptor = "[I")
    private int[] field282 = new int[50];

    @OriginalMember(owner = "client!client", name = "Qe", descriptor = "I")
    private int field283 = 128;

    @OriginalMember(owner = "client!client", name = "We", descriptor = "[I")
    private int[] field289 = new int[5];

    @OriginalMember(owner = "client!client", name = "Xe", descriptor = "I")
    private int field290 = -1;

    @OriginalMember(owner = "client!client", name = "Ze", descriptor = "Z")
    private boolean field292 = true;

    @OriginalMember(owner = "client!client", name = "af", descriptor = "[[I")
    private int[][] field293 = new int[104][104];

    @OriginalMember(owner = "client!client", name = "bf", descriptor = "Z")
    private boolean field294 = false;

    @OriginalMember(owner = "client!client", name = "ff", descriptor = "Z")
    private boolean field298 = false;

    @OriginalMember(owner = "client!client", name = "jf", descriptor = "[I")
    public int[] field301 = new int[1000];

    @OriginalMember(owner = "client!client", name = "lf", descriptor = "[I")
    private int[] field303 = new int[5];

    @OriginalMember(owner = "client!client", name = "qf", descriptor = "[LOMAKLDKI;")
    private class37[] field308 = new class37[20];

    @OriginalMember(owner = "client!client", name = "vf", descriptor = "I")
    private int field313 = 7759444;

    @OriginalMember(owner = "client!client", name = "wf", descriptor = "LNHFASBOX;")
    private class34 field314 = new class34();

    @OriginalMember(owner = "client!client", name = "If", descriptor = "B")
    private byte field326 = -22;

    @OriginalMember(owner = "client!client", name = "Jf", descriptor = "Z")
    private boolean field327 = false;

    @OriginalMember(owner = "client!client", name = "Kf", descriptor = "[LXFNDANMT;")
    public class67[] field328 = new class67[5];

    @OriginalMember(owner = "client!client", name = "Lf", descriptor = "I")
    private int field329 = -1;

    @OriginalMember(owner = "client!client", name = "Rf", descriptor = "[I")
    private int[] field335 = new int[4000];

    @OriginalMember(owner = "client!client", name = "Sf", descriptor = "[I")
    private int[] field336 = new int[4000];

    @OriginalMember(owner = "client!client", name = "Uf", descriptor = "B")
    private byte field338 = 7;

    @OriginalMember(owner = "client!client", name = "fg", descriptor = "[B")
    private byte[] field349 = new byte[16384];

    @OriginalMember(owner = "client!client", name = "gg", descriptor = "[I")
    private int[] field350 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!client", name = "hg", descriptor = "I")
    private int field351 = 8494;

    @OriginalMember(owner = "client!client", name = "ig", descriptor = "[I")
    private int[] field352 = new int[50];

    @OriginalMember(owner = "client!client", name = "jg", descriptor = "Z")
    private boolean field353 = false;

    @OriginalMember(owner = "client!client", name = "lg", descriptor = "Z")
    public boolean field355 = false;

    @OriginalMember(owner = "client!client", name = "mg", descriptor = "I")
    private int field356 = 5063219;

    @OriginalMember(owner = "client!client", name = "tg", descriptor = "[Ljava/lang/String;")
    private String[] field363 = new String[5];

    @OriginalMember(owner = "client!client", name = "ug", descriptor = "[Z")
    private boolean[] field364 = new boolean[5];

    @OriginalMember(owner = "client!client", name = "Bg", descriptor = "[I")
    private int[] field371 = new int[5];

    @OriginalMember(owner = "client!client", name = "Cg", descriptor = "I")
    private int field372 = -1;

    @OriginalMember(owner = "client!client", name = "Dg", descriptor = "[LOMAKLDKI;")
    private class37[] field373 = new class37[100];

    @OriginalMember(owner = "client!client", name = "Fg", descriptor = "I")
    private int field375 = -22770;

    @OriginalMember(owner = "client!client", name = "Gg", descriptor = "[I")
    private final int[] field376 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!client", name = "Ig", descriptor = "Ljava/lang/String;")
    private String field378 = "";

    @OriginalMember(owner = "client!client", name = "Jg", descriptor = "Ljava/lang/String;")
    private String field379 = "";

    @OriginalMember(owner = "client!client", name = "Lg", descriptor = "Z")
    private boolean field381 = false;

    @OriginalMember(owner = "client!client", name = "Ng", descriptor = "Z")
    private boolean field383 = true;

    @OriginalMember(owner = "client!client", name = "Tg", descriptor = "[LZXDQRRNS;")
    private class72[] field389 = new class72[100];

    @OriginalMember(owner = "client!client", name = "Wg", descriptor = "[LZXDQRRNS;")
    private class72[] field392 = new class72[13];

    @OriginalMember(owner = "client!client", name = "Xg", descriptor = "I")
    private int field393 = -1;

    @OriginalMember(owner = "client!client", name = "Zg", descriptor = "LSVWJKJVI;")
    private class52 field395 = class52.method449(false, 1);

    @OriginalMember(owner = "client!client", name = "dh", descriptor = "Z")
    private boolean field399 = false;

    @OriginalMember(owner = "client!client", name = "eh", descriptor = "I")
    private int field400 = -1;

    @OriginalMember(owner = "client!client", name = "fh", descriptor = "I")
    private int field401 = -1;

    @OriginalMember(owner = "client!client", name = "gh", descriptor = "[I")
    private int[] field402 = new int[2000];

    @OriginalMember(owner = "client!client", name = "hh", descriptor = "Z")
    private boolean field403 = false;

    @OriginalMember(owner = "client!client", name = "jh", descriptor = "Z")
    private boolean field405 = false;

    @OriginalMember(owner = "client!client", name = "mh", descriptor = "[LOXMJPDWD;")
    private class41[] field408 = new class41[4];

    @OriginalMember(owner = "client!client", name = "nh", descriptor = "[I")
    private int[] field409 = new int[9];

    @OriginalMember(owner = "client!client", name = "oh", descriptor = "[I")
    private int[] field410 = new int[50];

    @OriginalMember(owner = "client!client", name = "rh", descriptor = "Z")
    private boolean field413 = false;

    @OriginalMember(owner = "client!client", name = "uh", descriptor = "I")
    private int field416 = 7;

    @OriginalMember(owner = "client!client", name = "yh", descriptor = "Z")
    private boolean field420 = false;

    @OriginalMember(owner = "client!client", name = "zh", descriptor = "[Z")
    private boolean[] field421 = new boolean[5];

    @OriginalMember(owner = "client!client", name = "Ah", descriptor = "[LOMAKLDKI;")
    private class37[] field422 = new class37[32];

    @OriginalMember(owner = "client!client", name = "Gh", descriptor = "LSVWJKJVI;")
    private class52 field428 = class52.method449(false, 1);

    @OriginalMember(owner = "client!client", name = "Hh", descriptor = "Z")
    private boolean field429 = true;

    @OriginalMember(owner = "client!client", name = "Kh", descriptor = "I")
    private int field432 = -1;

    @OriginalMember(owner = "client!client", name = "Nh", descriptor = "Z")
    private boolean field435 = true;

    @OriginalMember(owner = "client!client", name = "Ph", descriptor = "I")
    private int field437 = -1;

    @OriginalMember(owner = "client!client", name = "Qh", descriptor = "I")
    private int field438 = -1;

    @OriginalMember(owner = "client!client", name = "Sh", descriptor = "[[I")
    private int[][] field440 = new int[104][104];

    @OriginalMember(owner = "client!client", name = "Th", descriptor = "[Ljava/lang/String;")
    private String[] field441 = new String[500];

    @OriginalMember(owner = "client!client", name = "Vh", descriptor = "I")
    private int field443 = -21060;

    @OriginalMember(owner = "client!client", name = "Wh", descriptor = "I")
    private int field444 = -1;

    @OriginalMember(owner = "client!client", name = "Xh", descriptor = "Z")
    private boolean field445 = false;

    @OriginalMember(owner = "client!client", name = "Yh", descriptor = "[[[I")
    private int[][][] field446 = new int[4][13][13];

    @OriginalMember(owner = "client!client", name = "Zh", descriptor = "I")
    private int field447 = 2301979;

    @OriginalMember(owner = "client!client", name = "ni", descriptor = "Z")
    private volatile boolean field461 = false;

    @OriginalMember(owner = "client!client", name = "pi", descriptor = "[I")
    private int[] field463 = new int[1000];

    @OriginalMember(owner = "client!client", name = "qi", descriptor = "[I")
    private int[] field464 = new int[1000];

    @OriginalMember(owner = "client!client", name = "ri", descriptor = "I")
    private int field465 = -13325;

    @OriginalMember(owner = "client!client", name = "si", descriptor = "Z")
    private boolean field466 = true;

    @OriginalMember(owner = "client!client", name = "ti", descriptor = "Ljava/lang/String;")
    private String field467 = "";

    @OriginalMember(owner = "client!client", name = "xi", descriptor = "I")
    private int field471 = 3353893;

    @OriginalMember(owner = "client!client", name = "yi", descriptor = "Z")
    private boolean field472 = false;

    @OriginalMember(owner = "client!client", name = "zi", descriptor = "I")
    private int field473 = 2048;

    @OriginalMember(owner = "client!client", name = "Ai", descriptor = "I")
    private int field474 = 2047;

    @OriginalMember(owner = "client!client", name = "Bi", descriptor = "[LKVXZMJHR;")
    private class27[] field475 = new class27[this.field473];

    @OriginalMember(owner = "client!client", name = "Di", descriptor = "[I")
    public int[] field477 = new int[this.field473];

    @OriginalMember(owner = "client!client", name = "Fi", descriptor = "[I")
    private int[] field479 = new int[this.field473];

    @OriginalMember(owner = "client!client", name = "Gi", descriptor = "[LSVWJKJVI;")
    private class52[] field480 = new class52[this.field473];

    @OriginalMember(owner = "client!client", name = "Hi", descriptor = "B")
    private byte field481 = -4;

    @OriginalMember(owner = "client!client", name = "Ji", descriptor = "I")
    private int field483 = -1;

    @OriginalMember(owner = "client!client", name = "Oi", descriptor = "[J")
    private long[] field488 = new long[200];

    @OriginalMember(owner = "client!client", name = "Pi", descriptor = "[Ljava/lang/String;")
    private String[] field489 = new String[200];

    @OriginalMember(owner = "client!client", name = "Ri", descriptor = "Z")
    private boolean field491 = false;

    @OriginalMember(owner = "client!client", name = "Vi", descriptor = "[I")
    private int[] field495 = new int[class58.field1550];

    @OriginalMember(owner = "client!client", name = "Wi", descriptor = "[I")
    public int[] field496 = new int[] { 17, 24, 34, 40 };

    @OriginalMember(owner = "client!client", name = "Xi", descriptor = "[I")
    private int[] field497 = new int[256];

    @OriginalMember(owner = "client!client", name = "Yi", descriptor = "Z")
    private boolean field498 = false;

    @OriginalMember(owner = "client!client", name = "Zi", descriptor = "Z")
    private boolean field499 = false;

    @OriginalMember(owner = "client!client", name = "yj", descriptor = "[I")
    private int[] field524 = new int[151];

    @OriginalMember(owner = "client!client", name = "Aj", descriptor = "I")
    private int field526 = 25871;

    @OriginalMember(owner = "client!client", name = "Bj", descriptor = "B")
    private byte field527 = 123;

    @OriginalMember(owner = "client!client", name = "Cj", descriptor = "Z")
    private boolean field528 = false;

    @OriginalMember(owner = "client!client", name = "Dj", descriptor = "LETMNPRAF;")
    private class11 field529 = new class11(0);

    @OriginalMember(owner = "client!client", name = "Ij", descriptor = "I")
    private int field534 = -1;

    @OriginalMember(owner = "client!client", name = "Jj", descriptor = "[I")
    private int[] field535 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!client", name = "Kj", descriptor = "I")
    private int field536 = 3;

    @OriginalMember(owner = "client!client", name = "Lj", descriptor = "I")
    private int field537 = 42604;

    @OriginalMember(owner = "client!client", name = "Sj", descriptor = "[LOMAKLDKI;")
    private class37[] field544 = new class37[32];

    @OriginalMember(owner = "client!client", name = "Tj", descriptor = "I")
    private int field545 = -214;

    @OriginalMember(owner = "client!client", name = "Xj", descriptor = "I")
    private final int field549 = 100;

    @OriginalMember(owner = "client!client", name = "Yj", descriptor = "[I")
    private int[] field550 = new int[100];

    @OriginalMember(owner = "client!client", name = "Jb", descriptor = "I")
    private static int field120 = 7;

    @OriginalMember(owner = "client!client", name = "lc", descriptor = "Ljava/math/BigInteger;")
    private static BigInteger field148 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!client", name = "Kc", descriptor = "Ljava/lang/String;")
    private static String field173 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @OriginalMember(owner = "client!client", name = "wd", descriptor = "[I")
    public static int[] field211 = new int[32];

    @OriginalMember(owner = "client!client", name = "rf", descriptor = "[[I")
    public static final int[][] field309;

    @OriginalMember(owner = "client!client", name = "dg", descriptor = "I")
    private static int field347;

    @OriginalMember(owner = "client!client", name = "th", descriptor = "[I")
    public static final int[] field415;

    @OriginalMember(owner = "client!client", name = "Oh", descriptor = "I")
    private static int field436;

    @OriginalMember(owner = "client!client", name = "fi", descriptor = "Ljava/math/BigInteger;")
    private static BigInteger field453;

    @OriginalMember(owner = "client!client", name = "Ui", descriptor = "[I")
    private static int[] field494;

    @OriginalMember(owner = "client!client", name = "bj", descriptor = "Z")
    private static boolean field501;

    @OriginalMember(owner = "client!client", name = "cj", descriptor = "I")
    private static int field502;

    @OriginalMember(owner = "client!client", name = "ej", descriptor = "Z")
    private static boolean field504;

    @OriginalMember(owner = "client!client", name = "pb", descriptor = "I")
    private static int field100;

    @OriginalMember(owner = "client!client", name = "qb", descriptor = "I")
    private int field101;

    @OriginalMember(owner = "client!client", name = "rb", descriptor = "I")
    private int field102;

    @OriginalMember(owner = "client!client", name = "tb", descriptor = "I")
    private int field104;

    @OriginalMember(owner = "client!client", name = "xb", descriptor = "I")
    private int field108;

    @OriginalMember(owner = "client!client", name = "Ab", descriptor = "I")
    private int field111;

    @OriginalMember(owner = "client!client", name = "Cb", descriptor = "I")
    private int field113;

    @OriginalMember(owner = "client!client", name = "Fb", descriptor = "I")
    private int field116;

    @OriginalMember(owner = "client!client", name = "Ob", descriptor = "I")
    private int field125;

    @OriginalMember(owner = "client!client", name = "Zb", descriptor = "I")
    private int field136;

    @OriginalMember(owner = "client!client", name = "ac", descriptor = "I")
    private int field137;

    @OriginalMember(owner = "client!client", name = "bc", descriptor = "I")
    private int field138;

    @OriginalMember(owner = "client!client", name = "cc", descriptor = "I")
    private int field139;

    @OriginalMember(owner = "client!client", name = "dc", descriptor = "I")
    private int field140;

    @OriginalMember(owner = "client!client", name = "ec", descriptor = "I")
    private int field141;

    @OriginalMember(owner = "client!client", name = "fc", descriptor = "I")
    private int field142;

    @OriginalMember(owner = "client!client", name = "hc", descriptor = "I")
    private int field144;

    @OriginalMember(owner = "client!client", name = "nc", descriptor = "I")
    private static int field150;

    @OriginalMember(owner = "client!client", name = "oc", descriptor = "I")
    private int field151;

    @OriginalMember(owner = "client!client", name = "rc", descriptor = "I")
    private int field154;

    @OriginalMember(owner = "client!client", name = "tc", descriptor = "I")
    private int field156;

    @OriginalMember(owner = "client!client", name = "wc", descriptor = "I")
    public int field159;

    @OriginalMember(owner = "client!client", name = "xc", descriptor = "I")
    public int field160;

    @OriginalMember(owner = "client!client", name = "Cc", descriptor = "I")
    private static int field165;

    @OriginalMember(owner = "client!client", name = "Dc", descriptor = "I")
    private static int field166;

    @OriginalMember(owner = "client!client", name = "Fc", descriptor = "I")
    private int field168;

    @OriginalMember(owner = "client!client", name = "Gc", descriptor = "I")
    private int field169;

    @OriginalMember(owner = "client!client", name = "Hc", descriptor = "I")
    private int field170;

    @OriginalMember(owner = "client!client", name = "Ic", descriptor = "I")
    private int field171;

    @OriginalMember(owner = "client!client", name = "Jc", descriptor = "I")
    private int field172;

    @OriginalMember(owner = "client!client", name = "Lc", descriptor = "I")
    private int field174;

    @OriginalMember(owner = "client!client", name = "Pc", descriptor = "I")
    private int field178;

    @OriginalMember(owner = "client!client", name = "Rc", descriptor = "I")
    private int field180;

    @OriginalMember(owner = "client!client", name = "gd", descriptor = "I")
    private int field195;

    @OriginalMember(owner = "client!client", name = "nd", descriptor = "I")
    private int field202;

    @OriginalMember(owner = "client!client", name = "od", descriptor = "I")
    private int field203;

    @OriginalMember(owner = "client!client", name = "ud", descriptor = "I")
    private int field209;

    @OriginalMember(owner = "client!client", name = "vd", descriptor = "I")
    private int field210;

    @OriginalMember(owner = "client!client", name = "zd", descriptor = "I")
    private int field214;

    @OriginalMember(owner = "client!client", name = "Ad", descriptor = "I")
    private int field215;

    @OriginalMember(owner = "client!client", name = "Ed", descriptor = "I")
    private int field219;

    @OriginalMember(owner = "client!client", name = "Kd", descriptor = "I")
    private int field225;

    @OriginalMember(owner = "client!client", name = "Wd", descriptor = "I")
    private int field237;

    @OriginalMember(owner = "client!client", name = "Xd", descriptor = "I")
    private int field238;

    @OriginalMember(owner = "client!client", name = "Yd", descriptor = "I")
    private int field239;

    @OriginalMember(owner = "client!client", name = "Zd", descriptor = "I")
    private static int field240;

    @OriginalMember(owner = "client!client", name = "be", descriptor = "I")
    private int field242;

    @OriginalMember(owner = "client!client", name = "ce", descriptor = "I")
    private int field243;

    @OriginalMember(owner = "client!client", name = "de", descriptor = "I")
    private int field244;

    @OriginalMember(owner = "client!client", name = "ee", descriptor = "I")
    private int field245;

    @OriginalMember(owner = "client!client", name = "fe", descriptor = "I")
    private int field246;

    @OriginalMember(owner = "client!client", name = "he", descriptor = "I")
    private int field248;

    @OriginalMember(owner = "client!client", name = "me", descriptor = "I")
    private int field253;

    @OriginalMember(owner = "client!client", name = "oe", descriptor = "I")
    private int field255;

    @OriginalMember(owner = "client!client", name = "pe", descriptor = "I")
    private int field256;

    @OriginalMember(owner = "client!client", name = "qe", descriptor = "I")
    private int field257;

    @OriginalMember(owner = "client!client", name = "Ae", descriptor = "I")
    private int field267;

    @OriginalMember(owner = "client!client", name = "De", descriptor = "I")
    private static int field270;

    @OriginalMember(owner = "client!client", name = "Ee", descriptor = "I")
    private int field271;

    @OriginalMember(owner = "client!client", name = "Ge", descriptor = "I")
    private static int field273;

    @OriginalMember(owner = "client!client", name = "He", descriptor = "I")
    private static int field274;

    @OriginalMember(owner = "client!client", name = "Ie", descriptor = "I")
    private int field275;

    @OriginalMember(owner = "client!client", name = "Ke", descriptor = "I")
    private int field277;

    @OriginalMember(owner = "client!client", name = "Re", descriptor = "I")
    private int field284;

    @OriginalMember(owner = "client!client", name = "Se", descriptor = "I")
    private int field285;

    @OriginalMember(owner = "client!client", name = "Te", descriptor = "I")
    private int field286;

    @OriginalMember(owner = "client!client", name = "Ue", descriptor = "I")
    private int field287;

    @OriginalMember(owner = "client!client", name = "Ve", descriptor = "I")
    private int field288;

    @OriginalMember(owner = "client!client", name = "Ye", descriptor = "I")
    private int field291;

    @OriginalMember(owner = "client!client", name = "cf", descriptor = "I")
    private int field295;

    @OriginalMember(owner = "client!client", name = "df", descriptor = "I")
    private int field296;

    @OriginalMember(owner = "client!client", name = "ef", descriptor = "I")
    private int field297;

    @OriginalMember(owner = "client!client", name = "gf", descriptor = "I")
    private int field299;

    @OriginalMember(owner = "client!client", name = "hf", descriptor = "I")
    private int field300;

    @OriginalMember(owner = "client!client", name = "kf", descriptor = "I")
    private int field302;

    @OriginalMember(owner = "client!client", name = "nf", descriptor = "I")
    private int field305;

    @OriginalMember(owner = "client!client", name = "of", descriptor = "I")
    private int field306;

    @OriginalMember(owner = "client!client", name = "pf", descriptor = "I")
    private int field307;

    @OriginalMember(owner = "client!client", name = "xf", descriptor = "I")
    private int field315;

    @OriginalMember(owner = "client!client", name = "yf", descriptor = "I")
    private int field316;

    @OriginalMember(owner = "client!client", name = "zf", descriptor = "I")
    private int field317;

    @OriginalMember(owner = "client!client", name = "Af", descriptor = "I")
    private int field318;

    @OriginalMember(owner = "client!client", name = "Bf", descriptor = "I")
    private int field319;

    @OriginalMember(owner = "client!client", name = "Cf", descriptor = "I")
    private int field320;

    @OriginalMember(owner = "client!client", name = "Df", descriptor = "I")
    private int field321;

    @OriginalMember(owner = "client!client", name = "Ef", descriptor = "I")
    public int field322;

    @OriginalMember(owner = "client!client", name = "Gf", descriptor = "I")
    private int field324;

    @OriginalMember(owner = "client!client", name = "Mf", descriptor = "I")
    private int field330;

    @OriginalMember(owner = "client!client", name = "Pf", descriptor = "I")
    private int field333;

    @OriginalMember(owner = "client!client", name = "Qf", descriptor = "I")
    private int field334;

    @OriginalMember(owner = "client!client", name = "Yf", descriptor = "I")
    private int field342;

    @OriginalMember(owner = "client!client", name = "Zf", descriptor = "I")
    private int field343;

    @OriginalMember(owner = "client!client", name = "ag", descriptor = "I")
    private int field344;

    @OriginalMember(owner = "client!client", name = "bg", descriptor = "I")
    private int field345;

    @OriginalMember(owner = "client!client", name = "cg", descriptor = "I")
    public static int field346;

    @OriginalMember(owner = "client!client", name = "eg", descriptor = "I")
    private static int field348;

    @OriginalMember(owner = "client!client", name = "kg", descriptor = "I")
    private int field354;

    @OriginalMember(owner = "client!client", name = "sg", descriptor = "I")
    private static int field362;

    @OriginalMember(owner = "client!client", name = "vg", descriptor = "I")
    private static int field365;

    @OriginalMember(owner = "client!client", name = "wg", descriptor = "I")
    private int field366;

    @OriginalMember(owner = "client!client", name = "xg", descriptor = "I")
    private int field367;

    @OriginalMember(owner = "client!client", name = "yg", descriptor = "I")
    private int field368;

    @OriginalMember(owner = "client!client", name = "zg", descriptor = "I")
    private int field369;

    @OriginalMember(owner = "client!client", name = "Ag", descriptor = "I")
    private int field370;

    @OriginalMember(owner = "client!client", name = "Eg", descriptor = "I")
    private int field374;

    @OriginalMember(owner = "client!client", name = "Hg", descriptor = "I")
    private int field377;

    @OriginalMember(owner = "client!client", name = "Kg", descriptor = "I")
    private int field380;

    @OriginalMember(owner = "client!client", name = "Mg", descriptor = "I")
    private int field382;

    @OriginalMember(owner = "client!client", name = "Og", descriptor = "I")
    private int field384;

    @OriginalMember(owner = "client!client", name = "Pg", descriptor = "I")
    private int field385;

    @OriginalMember(owner = "client!client", name = "Qg", descriptor = "I")
    private int field386;

    @OriginalMember(owner = "client!client", name = "Rg", descriptor = "I")
    private int field387;

    @OriginalMember(owner = "client!client", name = "Sg", descriptor = "I")
    private int field388;

    @OriginalMember(owner = "client!client", name = "Ug", descriptor = "I")
    private int field390;

    @OriginalMember(owner = "client!client", name = "Vg", descriptor = "I")
    private int field391;

    @OriginalMember(owner = "client!client", name = "Yg", descriptor = "I")
    private int field394;

    @OriginalMember(owner = "client!client", name = "ah", descriptor = "I")
    private int field396;

    @OriginalMember(owner = "client!client", name = "ch", descriptor = "I")
    private int field398;

    @OriginalMember(owner = "client!client", name = "ih", descriptor = "I")
    private int field404;

    @OriginalMember(owner = "client!client", name = "kh", descriptor = "I")
    private int field406;

    @OriginalMember(owner = "client!client", name = "lh", descriptor = "I")
    private int field407;

    @OriginalMember(owner = "client!client", name = "sh", descriptor = "I")
    private int field414;

    @OriginalMember(owner = "client!client", name = "vh", descriptor = "I")
    private int field417;

    @OriginalMember(owner = "client!client", name = "wh", descriptor = "I")
    private static int field418;

    @OriginalMember(owner = "client!client", name = "xh", descriptor = "I")
    private int field419;

    @OriginalMember(owner = "client!client", name = "Bh", descriptor = "I")
    private int field423;

    @OriginalMember(owner = "client!client", name = "Ch", descriptor = "I")
    private int field424;

    @OriginalMember(owner = "client!client", name = "Dh", descriptor = "I")
    private int field425;

    @OriginalMember(owner = "client!client", name = "Eh", descriptor = "I")
    private int field426;

    @OriginalMember(owner = "client!client", name = "Ih", descriptor = "I")
    private static int field430;

    @OriginalMember(owner = "client!client", name = "Jh", descriptor = "I")
    private int field431;

    @OriginalMember(owner = "client!client", name = "Lh", descriptor = "I")
    private int field433;

    @OriginalMember(owner = "client!client", name = "Mh", descriptor = "I")
    private int field434;

    @OriginalMember(owner = "client!client", name = "Rh", descriptor = "I")
    private int field439;

    @OriginalMember(owner = "client!client", name = "ei", descriptor = "I")
    private int field452;

    @OriginalMember(owner = "client!client", name = "gi", descriptor = "I")
    private int field454;

    @OriginalMember(owner = "client!client", name = "hi", descriptor = "I")
    private int field455;

    @OriginalMember(owner = "client!client", name = "ii", descriptor = "I")
    private int field456;

    @OriginalMember(owner = "client!client", name = "ji", descriptor = "I")
    private int field457;

    @OriginalMember(owner = "client!client", name = "ki", descriptor = "I")
    private int field458;

    @OriginalMember(owner = "client!client", name = "mi", descriptor = "I")
    private int field460;

    @OriginalMember(owner = "client!client", name = "oi", descriptor = "I")
    private int field462;

    @OriginalMember(owner = "client!client", name = "ui", descriptor = "I")
    private int field468;

    @OriginalMember(owner = "client!client", name = "vi", descriptor = "I")
    private static int field469;

    @OriginalMember(owner = "client!client", name = "wi", descriptor = "I")
    private static int field470;

    @OriginalMember(owner = "client!client", name = "Ci", descriptor = "I")
    private int field476;

    @OriginalMember(owner = "client!client", name = "Ei", descriptor = "I")
    private int field478;

    @OriginalMember(owner = "client!client", name = "Ki", descriptor = "I")
    private int field484;

    @OriginalMember(owner = "client!client", name = "Si", descriptor = "I")
    private int field492;

    @OriginalMember(owner = "client!client", name = "aj", descriptor = "I")
    public static int field500;

    @OriginalMember(owner = "client!client", name = "dj", descriptor = "I")
    public static int field503;

    @OriginalMember(owner = "client!client", name = "kj", descriptor = "I")
    private int field510;

    @OriginalMember(owner = "client!client", name = "lj", descriptor = "I")
    private static int field511;

    @OriginalMember(owner = "client!client", name = "mj", descriptor = "I")
    private int field512;

    @OriginalMember(owner = "client!client", name = "nj", descriptor = "I")
    private int field513;

    @OriginalMember(owner = "client!client", name = "oj", descriptor = "I")
    private int field514;

    @OriginalMember(owner = "client!client", name = "pj", descriptor = "I")
    private int field515;

    @OriginalMember(owner = "client!client", name = "qj", descriptor = "I")
    private int field516;

    @OriginalMember(owner = "client!client", name = "sj", descriptor = "I")
    private int field518;

    @OriginalMember(owner = "client!client", name = "zj", descriptor = "I")
    private int field525;

    @OriginalMember(owner = "client!client", name = "Fj", descriptor = "I")
    private int field531;

    @OriginalMember(owner = "client!client", name = "Uj", descriptor = "I")
    private int field546;

    @OriginalMember(owner = "client!client", name = "Vj", descriptor = "I")
    private int field547;

    @OriginalMember(owner = "client!client", name = "Wj", descriptor = "I")
    private int field548;

    @OriginalMember(owner = "client!client", name = "Zj", descriptor = "I")
    public static int field551;

    @OriginalMember(owner = "client!client", name = "J", descriptor = "I")
    private int field68;

    @OriginalMember(owner = "client!client", name = "R", descriptor = "I")
    private int field76;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "I")
    private int field88;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
    private int field89;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
    private int field90;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
    private int field91;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
    private int field92;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
    private int field93;

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
    private int field94;

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "I")
    private int field96;

    @OriginalMember(owner = "client!client", name = "mb", descriptor = "I")
    private int field97;

    @OriginalMember(owner = "client!client", name = "nb", descriptor = "I")
    private int field98;

    @OriginalMember(owner = "client!client", name = "ob", descriptor = "I")
    private int field99;

    @OriginalMember(owner = "client!client", name = "sb", descriptor = "J")
    private long field103;

    @OriginalMember(owner = "client!client", name = "dd", descriptor = "J")
    private long field192;

    @OriginalMember(owner = "client!client", name = "se", descriptor = "J")
    private long field259;

    @OriginalMember(owner = "client!client", name = "ph", descriptor = "J")
    public long field411;

    @OriginalMember(owner = "client!client", name = "Ti", descriptor = "J")
    private long field493;

    @OriginalMember(owner = "client!client", name = "T", descriptor = "LGXHGUSOD;")
    private class13 field78;

    @OriginalMember(owner = "client!client", name = "Ej", descriptor = "LIHBKBLZU;")
    private class16 field530;

    @OriginalMember(owner = "client!client", name = "Nb", descriptor = "LJAGFVRIK;")
    public class20 field124;

    @OriginalMember(owner = "client!client", name = "Md", descriptor = "LKJGJRATW;")
    private class25 field227;

    @OriginalMember(owner = "client!client", name = "Nd", descriptor = "LKJGJRATW;")
    private class25 field228;

    @OriginalMember(owner = "client!client", name = "Od", descriptor = "LKJGJRATW;")
    private class25 field229;

    @OriginalMember(owner = "client!client", name = "Pd", descriptor = "LKJGJRATW;")
    private class25 field230;

    @OriginalMember(owner = "client!client", name = "Qd", descriptor = "LKJGJRATW;")
    private class25 field231;

    @OriginalMember(owner = "client!client", name = "Rd", descriptor = "LKJGJRATW;")
    private class25 field232;

    @OriginalMember(owner = "client!client", name = "Sd", descriptor = "LKJGJRATW;")
    private class25 field233;

    @OriginalMember(owner = "client!client", name = "Td", descriptor = "LKJGJRATW;")
    private class25 field234;

    @OriginalMember(owner = "client!client", name = "Ud", descriptor = "LKJGJRATW;")
    private class25 field235;

    @OriginalMember(owner = "client!client", name = "Li", descriptor = "LKJGJRATW;")
    private class25 field485;

    @OriginalMember(owner = "client!client", name = "Mi", descriptor = "LKJGJRATW;")
    private class25 field486;

    @OriginalMember(owner = "client!client", name = "Ni", descriptor = "LKJGJRATW;")
    private class25 field487;

    @OriginalMember(owner = "client!client", name = "Oj", descriptor = "LKJGJRATW;")
    private class25 field540;

    @OriginalMember(owner = "client!client", name = "Pj", descriptor = "LKJGJRATW;")
    private class25 field541;

    @OriginalMember(owner = "client!client", name = "Qj", descriptor = "LKJGJRATW;")
    private class25 field542;

    @OriginalMember(owner = "client!client", name = "Rj", descriptor = "LKJGJRATW;")
    private class25 field543;

    @OriginalMember(owner = "client!client", name = "U", descriptor = "LKJGJRATW;")
    private class25 field79;

    @OriginalMember(owner = "client!client", name = "V", descriptor = "LKJGJRATW;")
    private class25 field80;

    @OriginalMember(owner = "client!client", name = "W", descriptor = "LKJGJRATW;")
    private class25 field81;

    @OriginalMember(owner = "client!client", name = "X", descriptor = "LKJGJRATW;")
    private class25 field82;

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "LKJGJRATW;")
    private class25 field83;

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "LKJGJRATW;")
    private class25 field84;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "LKJGJRATW;")
    private class25 field85;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "LKJGJRATW;")
    private class25 field86;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "LKJGJRATW;")
    private class25 field87;

    @OriginalMember(owner = "client!client", name = "kc", descriptor = "LKVXZMJHR;")
    public static class27 field147;

    @OriginalMember(owner = "client!client", name = "ic", descriptor = "LOMAKLDKI;")
    private class37 field145;

    @OriginalMember(owner = "client!client", name = "jc", descriptor = "LOMAKLDKI;")
    private class37 field146;

    @OriginalMember(owner = "client!client", name = "bd", descriptor = "LOMAKLDKI;")
    private class37 field190;

    @OriginalMember(owner = "client!client", name = "Cd", descriptor = "LOMAKLDKI;")
    private class37 field217;

    @OriginalMember(owner = "client!client", name = "Dd", descriptor = "LOMAKLDKI;")
    private class37 field218;

    @OriginalMember(owner = "client!client", name = "Tf", descriptor = "LOMAKLDKI;")
    private class37 field337;

    @OriginalMember(owner = "client!client", name = "Fh", descriptor = "LOMAKLDKI;")
    private class37 field427;

    @OriginalMember(owner = "client!client", name = "Qi", descriptor = "LOMAKLDKI;")
    private class37 field490;

    @OriginalMember(owner = "client!client", name = "tj", descriptor = "LOMAKLDKI;")
    private class37 field519;

    @OriginalMember(owner = "client!client", name = "uj", descriptor = "LOMAKLDKI;")
    private class37 field520;

    @OriginalMember(owner = "client!client", name = "vj", descriptor = "LOMAKLDKI;")
    private class37 field521;

    @OriginalMember(owner = "client!client", name = "wj", descriptor = "LOMAKLDKI;")
    private class37 field522;

    @OriginalMember(owner = "client!client", name = "xj", descriptor = "LOMAKLDKI;")
    private class37 field523;

    @OriginalMember(owner = "client!client", name = "Gj", descriptor = "LOMAKLDKI;")
    private class37 field532;

    @OriginalMember(owner = "client!client", name = "Hj", descriptor = "LOMAKLDKI;")
    private class37 field533;

    @OriginalMember(owner = "client!client", name = "gj", descriptor = "LONSICLVF;")
    private class38 field506;

    @OriginalMember(owner = "client!client", name = "hj", descriptor = "LONSICLVF;")
    private class38 field507;

    @OriginalMember(owner = "client!client", name = "ij", descriptor = "LONSICLVF;")
    private class38 field508;

    @OriginalMember(owner = "client!client", name = "jj", descriptor = "LONSICLVF;")
    private class38 field509;

    @OriginalMember(owner = "client!client", name = "Ii", descriptor = "LOPLZBITI;")
    private class39 field482;

    @OriginalMember(owner = "client!client", name = "P", descriptor = "LPTISUREQ;")
    private class46 field74;

    @OriginalMember(owner = "client!client", name = "Hf", descriptor = "LWEMOPWVJ;")
    private class62 field325;

    @OriginalMember(owner = "client!client", name = "Kb", descriptor = "LZXDQRRNS;")
    private class72 field121;

    @OriginalMember(owner = "client!client", name = "Lb", descriptor = "LZXDQRRNS;")
    private class72 field122;

    @OriginalMember(owner = "client!client", name = "Mb", descriptor = "LZXDQRRNS;")
    private class72 field123;

    @OriginalMember(owner = "client!client", name = "Nf", descriptor = "LZXDQRRNS;")
    private class72 field331;

    @OriginalMember(owner = "client!client", name = "Of", descriptor = "LZXDQRRNS;")
    private class72 field332;

    @OriginalMember(owner = "client!client", name = "Vf", descriptor = "LZXDQRRNS;")
    private class72 field339;

    @OriginalMember(owner = "client!client", name = "Wf", descriptor = "LZXDQRRNS;")
    private class72 field340;

    @OriginalMember(owner = "client!client", name = "Xf", descriptor = "LZXDQRRNS;")
    private class72 field341;

    @OriginalMember(owner = "client!client", name = "ng", descriptor = "LZXDQRRNS;")
    private class72 field357;

    @OriginalMember(owner = "client!client", name = "og", descriptor = "LZXDQRRNS;")
    private class72 field358;

    @OriginalMember(owner = "client!client", name = "pg", descriptor = "LZXDQRRNS;")
    private class72 field359;

    @OriginalMember(owner = "client!client", name = "qg", descriptor = "LZXDQRRNS;")
    private class72 field360;

    @OriginalMember(owner = "client!client", name = "rg", descriptor = "LZXDQRRNS;")
    private class72 field361;

    @OriginalMember(owner = "client!client", name = "Mj", descriptor = "LZXDQRRNS;")
    private class72 field538;

    @OriginalMember(owner = "client!client", name = "Nj", descriptor = "LZXDQRRNS;")
    private class72 field539;

    @OriginalMember(owner = "client!client", name = "K", descriptor = "LZXDQRRNS;")
    private class72 field69;

    @OriginalMember(owner = "client!client", name = "L", descriptor = "LZXDQRRNS;")
    private class72 field70;

    @OriginalMember(owner = "client!client", name = "M", descriptor = "LZXDQRRNS;")
    private class72 field71;

    @OriginalMember(owner = "client!client", name = "N", descriptor = "LZXDQRRNS;")
    private class72 field72;

    @OriginalMember(owner = "client!client", name = "O", descriptor = "LZXDQRRNS;")
    private class72 field73;

    @OriginalMember(owner = "client!client", name = "re", descriptor = "Ljava/lang/String;")
    public String field258;

    @OriginalMember(owner = "client!client", name = "Je", descriptor = "Ljava/lang/String;")
    private String field276;

    @OriginalMember(owner = "client!client", name = "mf", descriptor = "Ljava/lang/String;")
    private String field304;

    @OriginalMember(owner = "client!client", name = "rj", descriptor = "Ljava/lang/String;")
    public String field517;

    @OriginalMember(owner = "client!client", name = "ze", descriptor = "Ljava/net/Socket;")
    private Socket field266;

    @OriginalMember(owner = "client!client", name = "qd", descriptor = "Z")
    public static boolean field205;

    @OriginalMember(owner = "client!client", name = "bh", descriptor = "Z")
    private static boolean field397;

    @OriginalMember(owner = "client!client", name = "Uh", descriptor = "Z")
    public static boolean field442;

    @OriginalMember(owner = "client!client", name = "fj", descriptor = "Z")
    private static boolean field505;

    @OriginalMember(owner = "client!client", name = "Sc", descriptor = "[I")
    private int[] field181;

    @OriginalMember(owner = "client!client", name = "Tc", descriptor = "[I")
    private int[] field182;

    @OriginalMember(owner = "client!client", name = "Uc", descriptor = "[I")
    private int[] field183;

    @OriginalMember(owner = "client!client", name = "Vc", descriptor = "[I")
    private int[] field184;

    @OriginalMember(owner = "client!client", name = "Wc", descriptor = "[I")
    private int[] field185;

    @OriginalMember(owner = "client!client", name = "Xc", descriptor = "[I")
    private int[] field186;

    @OriginalMember(owner = "client!client", name = "kd", descriptor = "[I")
    private int[] field199;

    @OriginalMember(owner = "client!client", name = "ld", descriptor = "[I")
    private int[] field200;

    @OriginalMember(owner = "client!client", name = "sf", descriptor = "[I")
    private int[] field310;

    @OriginalMember(owner = "client!client", name = "tf", descriptor = "[I")
    private int[] field311;

    @OriginalMember(owner = "client!client", name = "uf", descriptor = "[I")
    private int[] field312;

    @OriginalMember(owner = "client!client", name = "ai", descriptor = "[I")
    private int[] field448;

    @OriginalMember(owner = "client!client", name = "bi", descriptor = "[I")
    private int[] field449;

    @OriginalMember(owner = "client!client", name = "ci", descriptor = "[I")
    private int[] field450;

    @OriginalMember(owner = "client!client", name = "di", descriptor = "[I")
    private int[] field451;

    @OriginalMember(owner = "client!client", name = "Ff", descriptor = "[LZXDQRRNS;")
    private class72[] field323;

    @OriginalMember(owner = "client!client", name = "ue", descriptor = "[[B")
    private byte[][] field261;

    @OriginalMember(owner = "client!client", name = "li", descriptor = "[[B")
    private byte[][] field459;

    @OriginalMember(owner = "client!client", name = "le", descriptor = "[[[B")
    private byte[][][] field252;

    @OriginalMember(owner = "client!client", name = "qh", descriptor = "[[[I")
    private int[][][] field412;

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIZII)V")
    public final void method12(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        int var8 = 2048 - arg6 & 2047;
        int var9 = 2048 - arg1 & 2047;
        int var10 = 0;
        int var11 = 0;
        int var12 = arg3;
        if (var8 != 0) {
            int var13 = class19.field873[var8];
            int var14 = class19.field874[var8];
            int var15 = var11 * var14 - arg3 * var13 >> 16;
            var12 = var11 * var13 + arg3 * var14 >> 16;
            var11 = var15;
        }
        if (var9 != 0) {
            int var16 = class19.field873[var9];
            int var17 = class19.field874[var9];
            int var18 = var10 * var17 + var12 * var16 >> 16;
            var12 = var12 * var17 - var10 * var16 >> 16;
            var10 = var18;
        }
        this.field242 = arg2 - var10;
        this.field243 = arg0 - var11;
        this.field244 = arg5 - var12;
        this.field245 = arg6;
        this.field246 = arg1;
        if (!arg4) {
            this.field367 = -1;
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
    public final void method13(int arg0) {
        if (this.field526 != arg0) {
            this.field377 = this.field482.method375();
        }
        int var2 = this.field508.method362("Choose Option", 443);
        for (int var3 = 0; var3 < this.field439; ++var3) {
            int var11 = this.field508.method362(this.field441[var3], 443);
            if (var11 > var2) {
                var2 = var11;
            }
        }
        var2 += 8;
        int var4 = this.field439 * 15 + 21;
        if (super.field1580 > 4 && super.field1581 > 4 && super.field1580 < 516 && super.field1581 < 338) {
            int var5 = super.field1580 - 4 - var2 / 2;
            if (var2 + var5 > 512) {
                var5 = 512 - var2;
            }
            if (var5 < 0) {
                var5 = 0;
            }
            int var6 = super.field1581 - 4;
            if (var4 + var6 > 334) {
                var6 = 334 - var4;
            }
            if (var6 < 0) {
                var6 = 0;
            }
            this.field498 = true;
            this.field168 = 0;
            this.field169 = var5;
            this.field170 = var6;
            this.field171 = var2;
            this.field172 = this.field439 * 15 + 22;
        }
        if (super.field1580 > 553 && super.field1581 > 205 && super.field1580 < 743 && super.field1581 < 466) {
            int var7 = super.field1580 - 553 - var2 / 2;
            if (var7 < 0) {
                var7 = 0;
            } else if (var2 + var7 > 190) {
                var7 = 190 - var2;
            }
            int var8 = super.field1581 - 205;
            if (var8 < 0) {
                var8 = 0;
            } else if (var4 + var8 > 261) {
                var8 = 261 - var4;
            }
            this.field498 = true;
            this.field168 = 1;
            this.field169 = var7;
            this.field170 = var8;
            this.field171 = var2;
            this.field172 = this.field439 * 15 + 22;
        }
        if (super.field1580 > 17 && super.field1581 > 357 && super.field1580 < 496 && super.field1581 < 453) {
            int var9 = super.field1580 - 17 - var2 / 2;
            if (var9 < 0) {
                var9 = 0;
            } else if (var2 + var9 > 479) {
                var9 = 479 - var2;
            }
            int var10 = super.field1581 - 357;
            if (var10 < 0) {
                var10 = 0;
            } else if (var4 + var10 > 96) {
                var10 = 96 - var4;
            }
            this.field498 = true;
            this.field168 = 2;
            this.field169 = var9;
            this.field170 = var10;
            this.field171 = var2;
            this.field172 = this.field439 * 15 + 22;
        }
    }

    @OriginalMember(owner = "client!client", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        return signlink.mainapp != null ? signlink.mainapp.getParameter(arg0) : super.getParameter(arg0);
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
    public final void method14(int arg0) {
        int var2 = 25 / arg0;
        if (super.field1579 == 1) {
            if (super.field1580 >= 6 && super.field1580 <= 106 && super.field1581 >= 467 && super.field1581 <= 499) {
                this.field68 = (this.field68 + 1) % 4;
                this.field413 = true;
                this.field472 = true;
                this.field395.method450(7, 54);
                this.field395.method451(this.field68);
                this.field395.method451(this.field104);
                this.field395.method451(this.field174);
            }
            if (super.field1580 >= 135 && super.field1580 <= 235 && super.field1581 >= 467 && super.field1581 <= 499) {
                this.field104 = (this.field104 + 1) % 3;
                this.field413 = true;
                this.field472 = true;
                this.field395.method450(7, 54);
                this.field395.method451(this.field68);
                this.field395.method451(this.field104);
                this.field395.method451(this.field174);
            }
            if (super.field1580 >= 273 && super.field1580 <= 373 && super.field1581 >= 467 && super.field1581 <= 499) {
                this.field174 = (this.field174 + 1) % 3;
                this.field413 = true;
                this.field472 = true;
                this.field395.method450(7, 54);
                this.field395.method451(this.field68);
                this.field395.method451(this.field104);
                this.field395.method451(this.field174);
            }
            if (super.field1580 >= 412 && super.field1580 <= 512 && super.field1581 >= 467 && super.field1581 <= 499) {
                if (this.field329 == -1) {
                    this.method146(349);
                    this.field467 = "";
                    this.field445 = false;
                    this.field290 = this.field329 = class34.field1034;
                    return;
                }
                this.method45("", 0, 895, "Please close the interface you have open before using 'report abuse'");
                return;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(II)Ljava/lang/String;")
    public final String method15(int arg0, int arg1) {
        if (arg0 != -45195) {
            this.field367 = -1;
        }
        return arg1 < 999999999 ? String.valueOf(arg1) : "*";
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;I)Z")
    public final boolean method16(String arg0, int arg1) {
        if (arg1 != 38775) {
            this.field241 = this.field482.method375();
        }
        if (arg0 == null) {
            return false;
        } else {
            for (int var3 = 0; var3 < this.field390; ++var3) {
                if (arg0.equalsIgnoreCase(this.field489[var3])) {
                    return true;
                }
            }
            return arg0.equalsIgnoreCase(field147.field952);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(LSVWJKJVI;IB)V")
    private final void method17(class52 arg0, int arg1, byte arg2) {
        arg0.method471(0);
        int var4 = arg0.method472(-34994, 8);
        if (var4 < this.field195) {
            for (int var5 = var4; var5 < this.field195; ++var5) {
                this.field301[this.field300++] = this.field196[var5];
            }
        }
        if (var4 > this.field195) {
            signlink.reporterror(this.field378 + " Too many npcs");
            throw new RuntimeException("eek");
        } else {
            this.field195 = 0;
            if (arg2 != 105) {
                this.field510 = -412;
            }
            for (int var6 = 0; var6 < var4; ++var6) {
                int var7 = this.field196[var6];
                class42 var8 = this.field194[var7];
                int var9 = arg0.method472(-34994, 1);
                if (var9 == 0) {
                    this.field196[this.field195++] = var7;
                    var8.field1108 = field346;
                } else {
                    int var10 = arg0.method472(-34994, 2);
                    if (var10 == 0) {
                        this.field196[this.field195++] = var7;
                        var8.field1108 = field346;
                        this.field479[this.field478++] = var7;
                    } else if (var10 == 1) {
                        this.field196[this.field195++] = var7;
                        var8.field1108 = field346;
                        int var11 = arg0.method472(-34994, 3);
                        var8.method343(this.field189, var11, false);
                        int var12 = arg0.method472(-34994, 1);
                        if (var12 == 1) {
                            this.field479[this.field478++] = var7;
                        }
                    } else if (var10 == 2) {
                        this.field196[this.field195++] = var7;
                        var8.field1108 = field346;
                        int var13 = arg0.method472(-34994, 3);
                        var8.method343(this.field189, var13, true);
                        int var14 = arg0.method472(-34994, 3);
                        var8.method343(this.field189, var14, true);
                        int var15 = arg0.method472(-34994, 1);
                        if (var15 == 1) {
                            this.field479[this.field478++] = var7;
                        }
                    } else if (var10 == 3) {
                        this.field301[this.field300++] = var7;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(II)V")
    public final void method18(int arg0, int arg1) {
        class34 var3 = class34.method339(arg1);
        for (int var4 = 0; var4 < var3.field1065.length && var3.field1065[var4] != -1; ++var4) {
            class34 var5 = class34.method339(var3.field1065[var4]);
            if (var5.field1017 == 1) {
                this.method18(1, var5.field1040);
            }
            var5.field1055 = 0;
            var5.field1064 = 0;
        }
        if (arg0 != 1) {
            this.field162 = this.field482.method375();
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;)Ljava/io/DataInputStream;")
    public final DataInputStream method19(String arg0) throws IOException {
        if (!this.field188) {
            return signlink.mainapp != null ? signlink.openurl(arg0) : new DataInputStream((new URL(this.getCodeBase(), arg0)).openStream());
        } else {
            if (this.field266 != null) {
                try {
                    this.field266.close();
                } catch (Exception var4) {
                }
                this.field266 = null;
            }
            this.field266 = this.method154(43595);
            this.field266.setSoTimeout(10000);
            InputStream var2 = this.field266.getInputStream();
            OutputStream var3 = this.field266.getOutputStream();
            var3.write(("JAGGRAB /" + arg0 + "\n\n").getBytes());
            return new DataInputStream(var2);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(LNHFASBOX;B)Z")
    public final boolean method20(class34 arg0, byte arg1) {
        int var3 = arg0.field1012;
        if (arg1 != -84) {
            throw new NullPointerException();
        } else {
            if (this.field391 == 2) {
                if (var3 == 201) {
                    this.field472 = true;
                    this.field414 = 0;
                    this.field117 = true;
                    this.field221 = "";
                    this.field178 = 1;
                    this.field106 = "Enter name of friend to add to list";
                }
                if (var3 == 202) {
                    this.field472 = true;
                    this.field414 = 0;
                    this.field117 = true;
                    this.field221 = "";
                    this.field178 = 2;
                    this.field106 = "Enter name of friend to delete from list";
                }
            }
            if (var3 == 205) {
                this.field370 = 250;
                return true;
            } else {
                if (var3 == 501) {
                    this.field472 = true;
                    this.field414 = 0;
                    this.field117 = true;
                    this.field221 = "";
                    this.field178 = 4;
                    this.field106 = "Enter name of player to add to list";
                }
                if (var3 == 502) {
                    this.field472 = true;
                    this.field414 = 0;
                    this.field117 = true;
                    this.field221 = "";
                    this.field178 = 5;
                    this.field106 = "Enter name of player to delete from list";
                }
                if (var3 >= 300 && var3 <= 313) {
                    int var4 = (var3 - 300) / 2;
                    int var5 = var3 & 1;
                    int var6 = this.field281[var4];
                    if (var6 != -1) {
                        while (true) {
                            if (var5 == 0) {
                                --var6;
                                if (var6 < 0) {
                                    var6 = class54.field1460 - 1;
                                }
                            }
                            if (var5 == 1) {
                                ++var6;
                                if (var6 >= class54.field1460) {
                                    var6 = 0;
                                }
                            }
                            if (!class54.field1461[var6].field1467 && class54.field1461[var6].field1462 == var4 + (this.field161 ? 0 : 7)) {
                                this.field281[var4] = var6;
                                this.field403 = true;
                                break;
                            }
                        }
                    }
                }
                if (var3 >= 314 && var3 <= 323) {
                    int var7 = (var3 - 314) / 2;
                    int var8 = var3 & 1;
                    int var9 = this.field207[var7];
                    if (var8 == 0) {
                        --var9;
                        if (var9 < 0) {
                            var9 = field309[var7].length - 1;
                        }
                    }
                    if (var8 == 1) {
                        ++var9;
                        if (var9 >= field309[var7].length) {
                            var9 = 0;
                        }
                    }
                    this.field207[var7] = var9;
                    this.field403 = true;
                }
                if (var3 == 324 && !this.field161) {
                    this.field161 = true;
                    this.method94(24830);
                }
                if (var3 == 325 && this.field161) {
                    this.field161 = false;
                    this.method94(24830);
                }
                if (var3 != 326) {
                    if (var3 == 620) {
                        this.field445 = !this.field445;
                    }
                    if (var3 >= 601 && var3 <= 613) {
                        this.method146(349);
                        if (this.field467.length() > 0) {
                            this.field395.method450(7, 135);
                            this.field395.method457(class3.method5(this.field467), 601);
                            this.field395.method451(var3 - 601);
                            this.field395.method451(this.field445 ? 1 : 0);
                        }
                    }
                    return false;
                } else {
                    this.field395.method450(7, 24);
                    this.field395.method451(this.field161 ? 0 : 1);
                    for (int var10 = 0; var10 < 7; ++var10) {
                        this.field395.method451(this.field281[var10]);
                    }
                    for (int var11 = 0; var11 < 5; ++var11) {
                        this.field395.method451(this.field207[var11]);
                    }
                    return true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(III)Ljava/lang/String;")
    public static final String method21(int arg0, int arg1, int arg2) {
        if (arg1 != -43582) {
            field120 = -357;
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

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Ljava/lang/String;I)V")
    public final void method22(String arg0, int arg1) {
        if (arg0 != null && arg0.length() != 0) {
            String var3 = arg0;
            if (arg1 < 4 || arg1 > 4) {
                this.method155();
            }
            String[] var4 = new String[100];
            int var5 = 0;
            while (true) {
                int var6 = var3.indexOf(" ");
                if (var6 == -1) {
                    String var8 = var3.trim();
                    if (var8.length() > 0) {
                        var4[var5++] = var8.toLowerCase();
                    }
                    this.field113 = 0;
                    label50: for (int var9 = 0; var9 < class56.field1509; ++var9) {
                        class56 var10 = class56.method544(var9);
                        if (var10.field1533 == -1 && var10.field1496 != null) {
                            String var11 = var10.field1496.toLowerCase();
                            for (int var12 = 0; var12 < var5; ++var12) {
                                if (var11.indexOf(var4[var12]) == -1) {
                                    continue label50;
                                }
                            }
                            this.field114[this.field113] = var11;
                            this.field115[this.field113] = var9;
                            ++this.field113;
                            if (this.field113 >= this.field114.length) {
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
            this.field113 = 0;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(LZXDQRRNS;I)V")
    public final void method23(class72 arg0, int arg1) {
        this.field366 += arg1;
        short var3 = 256;
        for (int var4 = 0; var4 < this.field181.length; ++var4) {
            this.field181[var4] = 0;
        }
        for (int var5 = 0; var5 < 5000; ++var5) {
            int var17 = (int) (Math.random() * 128.0D * (double) var3);
            this.field181[var17] = (int) (Math.random() * 256.0D);
        }
        for (int var6 = 0; var6 < 20; ++var6) {
            for (int var13 = 1; var13 < var3 - 1; ++var13) {
                for (int var15 = 1; var15 < 127; ++var15) {
                    int var16 = (var13 << 7) + var15;
                    this.field182[var16] = (this.field181[var16 - 1] + this.field181[var16 + 1] + this.field181[var16 - 128] + this.field181[var16 + 128]) / 4;
                }
            }
            int[] var14 = this.field181;
            this.field181 = this.field182;
            this.field182 = var14;
        }
        if (arg0 != null) {
            int var7 = 0;
            for (int var8 = 0; var8 < arg0.field1728; ++var8) {
                for (int var9 = 0; var9 < arg0.field1727; ++var9) {
                    if (arg0.field1725[var7++] != 0) {
                        int var10 = var9 + 16 + arg0.field1729;
                        int var11 = var8 + 16 + arg0.field1730;
                        int var12 = (var11 << 7) + var10;
                        this.field181[var12] = 0;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)V")
    private final void method24(boolean arg0) {
        class6 var2 = (class6) this.field153.method181();
        if (arg0) {
            for (int var3 = 1; var3 > 0; ++var3) {
            }
        }
        while (var2 != null) {
            if (var2.field67 == -1) {
                var2.field66 = 0;
                this.method156(var2, (byte) 39);
            } else {
                var2.method331();
            }
            var2 = (class6) this.field153.method183((byte) 6);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIII)V")
    public final void method25(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = this.field78.method215(arg1, arg5, arg0);
        if (arg4 != 1) {
            this.field367 = -1;
        }
        if (var7 != 0) {
            int var8 = this.field78.method219(arg1, arg5, arg0, var7);
            int var9 = var8 >> 6 & 3;
            int var10 = var8 & 31;
            int var11 = arg2;
            if (var7 > 0) {
                var11 = arg3;
            }
            int[] var12 = this.field427.field1146;
            int var13 = (103 - arg0) * 512 * 4 + arg5 * 4 + 24624;
            int var14 = var7 >> 14 & 32767;
            class47 var15 = class47.method417(var14);
            if (var15.field1304 != -1) {
                class72 var16 = this.field389[var15.field1304];
                if (var16 != null) {
                    int var17 = (var15.field1289 * 4 - var16.field1727) / 2;
                    int var18 = (var15.field1297 * 4 - var16.field1728) / 2;
                    var16.method599((104 - arg0 - var15.field1297) * 4 + 48 + var18, arg5 * 4 + 48 + var17, (byte) 0);
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
        int var19 = this.field78.method217(arg1, arg5, arg0);
        if (var19 != 0) {
            int var20 = this.field78.method219(arg1, arg5, arg0, var19);
            int var21 = var20 >> 6 & 3;
            int var22 = var20 & 31;
            int var23 = var19 >> 14 & 32767;
            class47 var24 = class47.method417(var23);
            if (var24.field1304 != -1) {
                class72 var25 = this.field389[var24.field1304];
                if (var25 != null) {
                    int var26 = (var24.field1289 * 4 - var25.field1727) / 2;
                    int var27 = (var24.field1297 * 4 - var25.field1728) / 2;
                    var25.method599((104 - arg0 - var24.field1297) * 4 + 48 + var27, arg5 * 4 + 48 + var26, (byte) 0);
                }
            } else if (var22 == 9) {
                int var28 = 15658734;
                if (var19 > 0) {
                    var28 = 15597568;
                }
                int[] var29 = this.field427.field1146;
                int var30 = (103 - arg0) * 512 * 4 + arg5 * 4 + 24624;
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
        int var31 = this.field78.method218(arg1, arg5, arg0);
        if (var31 != 0) {
            int var32 = var31 >> 14 & 32767;
            class47 var33 = class47.method417(var32);
            if (var33.field1304 != -1) {
                class72 var34 = this.field389[var33.field1304];
                if (var34 != null) {
                    int var35 = (var33.field1289 * 4 - var34.field1727) / 2;
                    int var36 = (var33.field1297 * 4 - var34.field1728) / 2;
                    var34.method599((104 - arg0 - var33.field1297) * 4 + 48 + var36, arg5 * 4 + 48 + var35, (byte) 0);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(BI)V")
    public final void method26(byte arg0, int arg1) {
        if (arg0 == -13) {
            class34.method334((byte) -13, arg1);
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(Z)V")
    public final void method27(boolean arg0) {
        byte[] var2 = this.field325.method559("title.dat", (byte[]) null);
        class37 var3 = new class37(var2, this);
        this.field230.method316(-439);
        var3.method349(8, 0, 0);
        this.field231.method316(-439);
        var3.method349(8, -637, 0);
        this.field227.method316(-439);
        var3.method349(8, -128, 0);
        this.field228.method316(-439);
        var3.method349(8, -202, -371);
        this.field229.method316(-439);
        var3.method349(8, -202, -171);
        this.field232.method316(-439);
        var3.method349(8, 0, -265);
        this.field233.method316(-439);
        var3.method349(8, -562, -265);
        this.field355 &= arg0;
        this.field234.method316(-439);
        var3.method349(8, -128, -171);
        this.field235.method316(-439);
        var3.method349(8, -562, -171);
        int[] var4 = new int[var3.field1147];
        for (int var5 = 0; var5 < var3.field1148; ++var5) {
            for (int var10 = 0; var10 < var3.field1147; ++var10) {
                var4[var10] = var3.field1146[var3.field1147 * var5 + (var3.field1147 - var10 - 1)];
            }
            for (int var11 = 0; var11 < var3.field1147; ++var11) {
                var3.field1146[var3.field1147 * var5 + var11] = var4[var11];
            }
        }
        this.field230.method316(-439);
        var3.method349(8, 382, 0);
        this.field231.method316(-439);
        var3.method349(8, -255, 0);
        this.field227.method316(-439);
        var3.method349(8, 254, 0);
        this.field228.method316(-439);
        var3.method349(8, 180, -371);
        this.field229.method316(-439);
        var3.method349(8, 180, -171);
        this.field232.method316(-439);
        var3.method349(8, 382, -265);
        this.field233.method316(-439);
        var3.method349(8, -180, -265);
        this.field234.method316(-439);
        var3.method349(8, 254, -171);
        this.field235.method316(-439);
        var3.method349(8, -180, -171);
        class37 var6 = new class37(this.field325, "logo", 0);
        this.field227.method316(-439);
        var6.method351(18, 382 - var6.field1147 / 2 - 128, (byte) 0);
        Object var7 = null;
        Object var8 = null;
        Object var9 = null;
        System.gc();
        if (class31.field984) {
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
    public final void method28(int arg0) {
        try {
            if (this.field74 != null) {
                this.field74.method407();
            }
        } catch (Exception var3) {
        }
        this.field74 = null;
        this.field355 = false;
        this.field267 = 0;
        this.field378 = "";
        this.field379 = "";
        this.field366 += arg0;
        this.method95(8);
        this.field78.method189(7);
        for (int var2 = 0; var2 < 4; ++var2) {
            this.field408[var2].method380();
        }
        System.gc();
        this.method128(925);
        this.field372 = -1;
        this.field434 = -1;
        this.field330 = 0;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)V")
    public final void method29(String arg0, String arg1, int arg2) {
        while (arg2 >= 0) {
            this.field367 = -1;
        }
        if (this.field542 != null) {
            this.field542.method316(-439);
            class48.field1331 = this.field185;
            int var4 = 151;
            if (arg1 != null) {
                var4 -= 7;
            }
            this.field507.method360(var4, (byte) 33, arg0, 257, 0);
            this.field507.method360(var4 - 1, (byte) 33, arg0, 256, 16777215);
            var4 += 15;
            if (arg1 != null) {
                this.field507.method360(var4, (byte) 33, arg1, 257, 0);
                this.field507.method360(var4 - 1, (byte) 33, arg1, 256, 16777215);
            }
            this.field542.method317(796, 4, 4, super.field1565);
        } else if (super.field1566 != null) {
            super.field1566.method316(-439);
            class48.field1331 = this.field186;
            int var5 = 251;
            short var6 = 300;
            byte var7 = 50;
            class8.method164(0, 21899, var7, 383 - var6 / 2, var6, var5 - 5 - var7 / 2);
            class8.method165(16777215, 383 - var6 / 2, -13126, var5 - 5 - var7 / 2, var7, var6);
            if (arg1 != null) {
                var5 -= 7;
            }
            this.field507.method360(var5, (byte) 33, arg0, 383, 0);
            this.field507.method360(var5 - 1, (byte) 33, arg0, 382, 16777215);
            var5 += 15;
            if (arg1 != null) {
                this.field507.method360(var5, (byte) 33, arg1, 383, 0);
                this.field507.method360(var5 - 1, (byte) 33, arg1, 382, 16777215);
            }
            super.field1566.method317(796, 0, 0, super.field1565);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIII)I")
    public final int method30(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 != -7809) {
            this.field367 = -1;
        }
        int var5 = 256 - arg0;
        return ((arg1 & 16711935) * arg0 + (arg2 & 16711935) * var5 & -16711936) + ((arg1 & 65280) * arg0 + (arg2 & 65280) * var5 & 16711680) >> 8;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(JI)V")
    public final void method31(long arg0, int arg1) {
        if (arg0 != 0L) {
            if (this.field299 >= 100) {
                this.method45("", 0, 895, "Your ignore list is full. Max of 100 hit");
            } else {
                String var4 = class3.method9(27250, class3.method6(357, arg0));
                for (int var5 = 0; var5 < this.field299; ++var5) {
                    if (this.field198[var5] == arg0) {
                        this.method45("", 0, 895, var4 + " is already on your ignore list");
                        return;
                    }
                }
                for (int var6 = 0; var6 < this.field390; ++var6) {
                    if (this.field488[var6] == arg0) {
                        this.method45("", 0, 895, "Please remove " + var4 + " from your friend list first");
                        return;
                    }
                }
                this.field198[this.field299++] = arg0;
                this.field405 = true;
                if (arg1 >= 0) {
                    this.field164 = null;
                }
                this.field395.method450(7, 4);
                this.field395.method457(arg0, 601);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
    public final void method32(int arg0) {
        while (arg0 >= 0) {
            this.field164 = null;
        }
        if (this.field315 == 2) {
            this.method71((this.field455 - this.field97 << 7) + this.field458, this.field456 * 2, 0, (this.field454 - this.field96 << 7) + this.field457);
            if (this.field437 > -1 && field346 % 20 < 10) {
                this.field143[0].method351(this.field438 - 28, this.field437 - 12, (byte) 0);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(LSVWJKJVI;IB)V")
    private final void method33(class52 arg0, int arg1, byte arg2) {
        while (true) {
            if (arg0.field1435 + 21 < arg1 * 8) {
                int var4 = arg0.method472(-34994, 14);
                if (var4 != 16383) {
                    if (this.field194[var4] == null) {
                        this.field194[var4] = new class42();
                    }
                    class42 var5 = this.field194[var4];
                    this.field196[this.field195++] = var4;
                    var5.field1108 = field346;
                    int var6 = arg0.method472(-34994, 1);
                    if (var6 == 1) {
                        this.field479[this.field478++] = var4;
                    }
                    int var7 = arg0.method472(-34994, 1);
                    var5.field1196 = class44.method398(arg0.method472(-34994, 13));
                    int var8 = arg0.method472(-34994, 5);
                    if (var8 > 15) {
                        var8 -= 32;
                    }
                    int var9 = arg0.method472(-34994, 5);
                    if (var9 > 15) {
                        var9 -= 32;
                    }
                    var5.field1097 = var5.field1196.field1238;
                    var5.field1099 = var5.field1196.field1245;
                    var5.field1113 = var5.field1196.field1218;
                    var5.field1114 = var5.field1196.field1241;
                    var5.field1115 = var5.field1196.field1243;
                    var5.field1116 = var5.field1196.field1211;
                    var5.field1072 = var5.field1196.field1217;
                    var5.method344(field147.field1126[0] + var8, var7 == 1, this.field429, field147.field1125[0] + var9);
                    continue;
                }
            }
            arg0.method473(true);
            if (arg2 == 6) {
                boolean var10 = false;
                return;
            }
            return;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IJ)V")
    public final void method34(int arg0, long arg1) {
        int var4 = 25 / arg0;
        if (arg1 != 0L) {
            for (int var5 = 0; var5 < this.field299; ++var5) {
                if (this.field198[var5] == arg1) {
                    --this.field299;
                    this.field405 = true;
                    for (int var6 = var5; var6 < this.field299; ++var6) {
                        this.field198[var6] = this.field198[var6 + 1];
                    }
                    this.field395.method450(7, 240);
                    this.field395.method457(arg1, 601);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(II[B)Z")
    public final boolean method35(int arg0, int arg1, byte[] arg2) {
        if (arg1 != -45954) {
            this.field395.method451(226);
        }
        return arg2 == null ? true : signlink.wavesave(arg2, arg0);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILSVWJKJVI;LKVXZMJHR;II)V")
    private final void method36(int arg0, class52 arg1, class27 arg2, int arg3, int arg4) {
        if (arg4 <= 0) {
            field501 = !field501;
        }
        if ((arg3 & 256) != 0) {
            int var6 = arg1.method481(this.field537);
            int var7 = arg1.method479(-45375);
            arg2.method342(var7, field346, (byte) 79, var6);
            arg2.field1088 = field346 + 300;
            arg2.field1089 = arg1.method479(-45375);
            arg2.field1090 = arg1.method461();
        }
        if ((arg3 & 8) != 0) {
            arg2.field1092 = arg1.method468();
            if (arg2.field1092.charAt(0) == '~') {
                arg2.field1092 = arg2.field1092.substring(1);
                this.method45(arg2.field952, 2, 895, arg2.field1092);
            } else if (field147 == arg2) {
                this.method45(arg2.field952, 2, 895, arg2.field1092);
            }
            arg2.field1077 = 0;
            arg2.field1091 = 0;
            arg2.field1112 = 150;
        }
        if ((arg3 & 512) != 0) {
            arg2.field1102 = arg1.method490((byte) 3);
            int var8 = arg1.method466();
            arg2.field1106 = var8 >> 16;
            arg2.field1105 = (var8 & 65535) + field346;
            arg2.field1103 = 0;
            arg2.field1104 = 0;
            if (arg2.field1105 > field346) {
                arg2.field1103 = -1;
            }
            if (arg2.field1102 == 65535) {
                arg2.field1102 = -1;
            }
        }
        if ((arg3 & 4) != 0) {
            int var9 = arg1.method463();
            if (var9 == 65535) {
                var9 = -1;
            }
            int var10 = arg1.method481(this.field537);
            if (arg2.field1117 == var9 && var9 != -1) {
                int var11 = class26.field921[var9].field935;
                if (var11 == 1) {
                    arg2.field1118 = 0;
                    arg2.field1119 = 0;
                    arg2.field1120 = var10;
                    arg2.field1121 = 0;
                }
                if (var11 == 2) {
                    arg2.field1121 = 0;
                }
            } else if (var9 == -1 || arg2.field1117 == -1 || class26.field921[var9].field929 >= class26.field921[arg2.field1117].field929) {
                arg2.field1117 = var9;
                arg2.field1118 = 0;
                arg2.field1119 = 0;
                arg2.field1120 = var10;
                arg2.field1121 = 0;
                arg2.field1122 = arg2.field1100;
            }
        }
        if ((arg3 & 1024) != 0) {
            arg2.field1081 = arg1.method480(this.field351);
            arg2.field1083 = arg1.method481(this.field537);
            arg2.field1082 = arg1.method480(this.field351);
            arg2.field1084 = arg1.method479(-45375);
            arg2.field1085 = arg1.method488(true) + field346;
            arg2.field1086 = arg1.method490((byte) 3) + field346;
            arg2.field1087 = arg1.method461();
            arg2.method345(true);
        }
        if ((arg3 & 128) != 0) {
            arg2.field1074 = arg1.method490((byte) 3);
            arg2.field1075 = arg1.method463();
        }
        if ((arg3 & 2) != 0) {
            arg2.field1101 = arg1.method463();
            if (arg2.field1101 == 65535) {
                arg2.field1101 = -1;
            }
        }
        if ((arg3 & 32) != 0) {
            int var12 = arg1.method488(true);
            int var13 = arg1.method481(this.field537);
            int var14 = arg1.method481(this.field537);
            int var15 = arg1.field1434;
            if (arg2.field952 != null && arg2.field955) {
                long var16 = class3.method5(arg2.field952);
                boolean var18 = false;
                if (var13 <= 1) {
                    for (int var19 = 0; var19 < this.field299; ++var19) {
                        if (this.field198[var19] == var16) {
                            var18 = true;
                            break;
                        }
                    }
                }
                if (!var18 && this.field484 == 0) {
                    try {
                        this.field193.field1434 = 0;
                        arg1.method470(0, 36, this.field193.field1433, var14);
                        this.field193.field1434 = 0;
                        String var20 = class18.method266(this.field193, var14, -562);
                        String var21 = class55.method512(false, var20);
                        arg2.field1092 = var21;
                        arg2.field1077 = var12 >> 8;
                        arg2.field1091 = var12 & 255;
                        arg2.field1112 = 150;
                        if (var13 != 2 && var13 != 3) {
                            if (var13 == 1) {
                                this.method45("@cr1@" + arg2.field952, 1, 895, var21);
                            } else {
                                this.method45(arg2.field952, 2, 895, var21);
                            }
                        } else {
                            this.method45("@cr2@" + arg2.field952, 1, 895, var21);
                        }
                    } catch (Exception var28) {
                        signlink.reporterror("cde2");
                    }
                }
            }
            arg1.field1434 = var14 + var15;
        }
        if ((arg3 & 64) != 0) {
            int var23 = arg1.method481(this.field537);
            byte[] var24 = new byte[var23];
            class52 var25 = new class52(var24, true);
            arg1.method495(false, var23, 0, var24);
            this.field480[arg0] = var25;
            arg2.method324(0, var25);
        }
        if ((arg3 & 1) != 0) {
            int var26 = arg1.method481(this.field537);
            int var27 = arg1.method461();
            arg2.method342(var27, field346, (byte) 79, var26);
            arg2.field1088 = field346 + 300;
            arg2.field1089 = arg1.method481(this.field537);
            arg2.field1090 = arg1.method481(this.field537);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IBLSVWJKJVI;)V")
    private final void method37(int arg0, byte arg1, class52 arg2) {
        if (arg1 != 64) {
            for (int var4 = 1; var4 > 0; ++var4) {
            }
        }
        arg2.method471(0);
        int var5 = arg2.method472(-34994, 1);
        if (var5 != 0) {
            int var6 = arg2.method472(-34994, 2);
            if (var6 == 0) {
                this.field479[this.field478++] = this.field474;
            } else if (var6 == 1) {
                int var7 = arg2.method472(-34994, 3);
                field147.method343(this.field189, var7, false);
                int var8 = arg2.method472(-34994, 1);
                if (var8 == 1) {
                    this.field479[this.field478++] = this.field474;
                }
            } else if (var6 == 2) {
                int var9 = arg2.method472(-34994, 3);
                field147.method343(this.field189, var9, true);
                int var10 = arg2.method472(-34994, 3);
                field147.method343(this.field189, var10, true);
                int var11 = arg2.method472(-34994, 1);
                if (var11 == 1) {
                    this.field479[this.field478++] = this.field474;
                }
            } else if (var6 == 3) {
                this.field307 = arg2.method472(-34994, 2);
                int var12 = arg2.method472(-34994, 7);
                int var13 = arg2.method472(-34994, 1);
                int var14 = arg2.method472(-34994, 1);
                if (var14 == 1) {
                    this.field479[this.field478++] = this.field474;
                }
                int var15 = arg2.method472(-34994, 7);
                field147.method344(var12, var13 == 1, this.field429, var15);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(II)V")
    public final void method38(int arg0, int arg1) {
        this.field366 += arg0;
        int var3 = class24.field898[arg1].field906;
        if (var3 != 0) {
            int var4 = this.field197[arg1];
            if (var3 == 1) {
                if (var4 == 1) {
                    class48.method433(false, 0.9D);
                }
                if (var4 == 2) {
                    class48.method433(false, 0.8D);
                }
                if (var4 == 3) {
                    class48.method433(false, 0.7D);
                }
                if (var4 == 4) {
                    class48.method433(false, 0.6D);
                }
                class56.field1500.method177();
                this.field399 = true;
            }
            if (var3 == 3) {
                boolean var5 = this.field158;
                if (var4 == 0) {
                    this.method73(535, 0, this.field158);
                    this.field158 = true;
                }
                if (var4 == 1) {
                    this.method73(535, -400, this.field158);
                    this.field158 = true;
                }
                if (var4 == 2) {
                    this.method73(535, -800, this.field158);
                    this.field158 = true;
                }
                if (var4 == 3) {
                    this.method73(535, -1200, this.field158);
                    this.field158 = true;
                }
                if (var4 == 4) {
                    this.field158 = false;
                }
                if (this.field158 != var5 && !field505) {
                    if (this.field158) {
                        this.field434 = this.field372;
                        this.field435 = true;
                        this.field530.method245(2, this.field434);
                    } else {
                        this.method128(925);
                    }
                    this.field330 = 0;
                }
            }
            if (var3 == 4) {
                if (var4 == 0) {
                    this.field236 = true;
                    this.method140(0, false);
                }
                if (var4 == 1) {
                    this.field236 = true;
                    this.method140(-400, false);
                }
                if (var4 == 2) {
                    this.field236 = true;
                    this.method140(-800, false);
                }
                if (var4 == 3) {
                    this.field236 = true;
                    this.method140(-1200, false);
                }
                if (var4 == 4) {
                    this.field236 = false;
                }
            }
            if (var3 == 5) {
                this.field419 = var4;
            }
            if (var3 == 6) {
                this.field93 = var4;
            }
            if (var3 == 8) {
                this.field452 = var4;
                this.field472 = true;
            }
            if (var3 == 9) {
                this.field92 = var4;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
    public final void method39(int arg0) {
        ++field469;
        if (arg0 != -39493) {
            this.field241 = -367;
        }
        if (field469 > 117) {
            field469 = 0;
            this.field395.method450(7, 72);
            this.field395.method455(0);
        }
        while (true) {
            int var2;
            do {
                while (true) {
                    var2 = this.method557(0);
                    if (var2 == -1) {
                        return;
                    }
                    if (this.field329 != -1 && this.field329 == this.field290) {
                        if (var2 == 8 && this.field467.length() > 0) {
                            this.field467 = this.field467.substring(0, this.field467.length() - 1);
                        }
                        break;
                    }
                    if (this.field117) {
                        if (var2 >= 32 && var2 <= 122 && this.field221.length() < 80) {
                            this.field221 = this.field221 + (char) var2;
                            this.field472 = true;
                        }
                        if (var2 == 8 && this.field221.length() > 0) {
                            this.field221 = this.field221.substring(0, this.field221.length() - 1);
                            this.field472 = true;
                        }
                        if (var2 == 13 || var2 == 10) {
                            this.field117 = false;
                            this.field472 = true;
                            if (this.field178 == 1) {
                                long var3 = class3.method5(this.field221);
                                this.method57(-25941, var3);
                            }
                            if (this.field178 == 2 && this.field390 > 0) {
                                long var5 = class3.method5(this.field221);
                                this.method66((byte) -128, var5);
                            }
                            if (this.field178 == 3 && this.field221.length() > 0) {
                                this.field395.method450(7, 124);
                                this.field395.method451(0);
                                int var7 = this.field395.field1434;
                                this.field395.method457(this.field103, 601);
                                class18.method267(this.field395, 815, this.field221);
                                this.field395.method460(true, this.field395.field1434 - var7);
                                this.field221 = class18.method268(false, this.field221);
                                this.field221 = class55.method512(false, this.field221);
                                this.method45(class3.method9(27250, class3.method6(357, this.field103)), 6, 895, this.field221);
                                if (this.field104 == 2) {
                                    this.field104 = 1;
                                    this.field413 = true;
                                    this.field395.method450(7, 54);
                                    this.field395.method451(this.field68);
                                    this.field395.method451(this.field104);
                                    this.field395.method451(this.field174);
                                }
                            }
                            if (this.field178 == 4 && this.field299 < 100) {
                                long var8 = class3.method5(this.field221);
                                this.method31(var8, -39);
                            }
                            if (this.field178 == 5 && this.field299 > 0) {
                                long var10 = class3.method5(this.field221);
                                this.method34(659, var10);
                            }
                        }
                    } else if (this.field414 == 1) {
                        if (var2 >= 48 && var2 <= 57 && this.field77.length() < 10) {
                            this.field77 = this.field77 + (char) var2;
                            this.field472 = true;
                        }
                        if (var2 == 8 && this.field77.length() > 0) {
                            this.field77 = this.field77.substring(0, this.field77.length() - 1);
                            this.field472 = true;
                        }
                        if (var2 == 13 || var2 == 10) {
                            if (this.field77.length() > 0) {
                                int var12 = 0;
                                try {
                                    var12 = Integer.parseInt(this.field77);
                                } catch (Exception var22) {
                                }
                                this.field395.method450(7, 140);
                                this.field395.method455(var12);
                            }
                            this.field414 = 0;
                            this.field472 = true;
                        }
                    } else if (this.field414 == 2) {
                        if (var2 >= 32 && var2 <= 122 && this.field77.length() < 12) {
                            this.field77 = this.field77 + (char) var2;
                            this.field472 = true;
                        }
                        if (var2 == 8 && this.field77.length() > 0) {
                            this.field77 = this.field77.substring(0, this.field77.length() - 1);
                            this.field472 = true;
                        }
                        if (var2 == 13 || var2 == 10) {
                            if (this.field77.length() > 0) {
                                this.field395.method450(7, 146);
                                this.field395.method457(class3.method5(this.field77), 601);
                            }
                            this.field414 = 0;
                            this.field472 = true;
                        }
                    } else if (this.field414 == 3) {
                        if (var2 >= 32 && var2 <= 122 && this.field77.length() < 40) {
                            this.field77 = this.field77 + (char) var2;
                            this.field472 = true;
                        }
                        if (var2 == 8 && this.field77.length() > 0) {
                            this.field77 = this.field77.substring(0, this.field77.length() - 1);
                            this.field472 = true;
                        }
                    } else if (this.field216 == -1 && this.field432 == -1) {
                        if (var2 >= 32 && var2 <= 122 && this.field201.length() < 80) {
                            this.field201 = this.field201 + (char) var2;
                            this.field472 = true;
                        }
                        if (var2 == 8 && this.field201.length() > 0) {
                            this.field201 = this.field201.substring(0, this.field201.length() - 1);
                            this.field472 = true;
                        }
                        if ((var2 == 13 || var2 == 10) && this.field201.length() > 0) {
                            if (this.field101 == 2) {
                                if (this.field201.equals("::clientdrop")) {
                                    this.method43(-3593);
                                }
                                if (this.field201.equals("::lag")) {
                                    this.method81(this.field338);
                                }
                                if (this.field201.equals("::prefetchmusic")) {
                                    for (int var13 = 0; var13 < this.field530.method244(2, 0); ++var13) {
                                        this.field530.method253((byte) 1, (byte) -5, 2, var13);
                                    }
                                }
                                if (this.field201.equals("::fpson")) {
                                    field442 = true;
                                }
                                if (this.field201.equals("::fpsoff")) {
                                    field442 = false;
                                }
                                if (this.field201.equals("::noclip")) {
                                    for (int var14 = 0; var14 < 4; ++var14) {
                                        for (int var15 = 1; var15 < 103; ++var15) {
                                            for (int var16 = 1; var16 < 103; ++var16) {
                                                this.field408[var14].field1193[var15][var16] = 0;
                                            }
                                        }
                                    }
                                }
                            }
                            if (this.field201.startsWith("::")) {
                                this.field395.method450(7, 82);
                                this.field395.method451(this.field201.length() - 1);
                                this.field395.method458(this.field201.substring(2));
                            } else {
                                String var17 = this.field201.toLowerCase();
                                byte var18 = 0;
                                if (var17.startsWith("yellow:")) {
                                    var18 = 0;
                                    this.field201 = this.field201.substring(7);
                                } else if (var17.startsWith("red:")) {
                                    var18 = 1;
                                    this.field201 = this.field201.substring(4);
                                } else if (var17.startsWith("green:")) {
                                    var18 = 2;
                                    this.field201 = this.field201.substring(6);
                                } else if (var17.startsWith("cyan:")) {
                                    var18 = 3;
                                    this.field201 = this.field201.substring(5);
                                } else if (var17.startsWith("purple:")) {
                                    var18 = 4;
                                    this.field201 = this.field201.substring(7);
                                } else if (var17.startsWith("white:")) {
                                    var18 = 5;
                                    this.field201 = this.field201.substring(6);
                                } else if (var17.startsWith("flash1:")) {
                                    var18 = 6;
                                    this.field201 = this.field201.substring(7);
                                } else if (var17.startsWith("flash2:")) {
                                    var18 = 7;
                                    this.field201 = this.field201.substring(7);
                                } else if (var17.startsWith("flash3:")) {
                                    var18 = 8;
                                    this.field201 = this.field201.substring(7);
                                } else if (var17.startsWith("glow1:")) {
                                    var18 = 9;
                                    this.field201 = this.field201.substring(6);
                                } else if (var17.startsWith("glow2:")) {
                                    var18 = 10;
                                    this.field201 = this.field201.substring(6);
                                } else if (var17.startsWith("glow3:")) {
                                    var18 = 11;
                                    this.field201 = this.field201.substring(6);
                                }
                                String var19 = this.field201.toLowerCase();
                                byte var20 = 0;
                                if (var19.startsWith("wave:")) {
                                    var20 = 1;
                                    this.field201 = this.field201.substring(5);
                                } else if (var19.startsWith("wave2:")) {
                                    var20 = 2;
                                    this.field201 = this.field201.substring(6);
                                } else if (var19.startsWith("shake:")) {
                                    var20 = 3;
                                    this.field201 = this.field201.substring(6);
                                } else if (var19.startsWith("scroll:")) {
                                    var20 = 4;
                                    this.field201 = this.field201.substring(7);
                                } else if (var19.startsWith("slide:")) {
                                    var20 = 5;
                                    this.field201 = this.field201.substring(6);
                                }
                                this.field395.method450(7, 165);
                                this.field395.method451(0);
                                int var21 = this.field395.field1434;
                                this.field395.method451(var18);
                                this.field395.method477(928, var20);
                                this.field193.field1434 = 0;
                                class18.method267(this.field193, 815, this.field201);
                                this.field395.method459(0, this.field193.field1433, this.field157, this.field193.field1434);
                                this.field395.method460(true, this.field395.field1434 - var21);
                                this.field201 = class18.method268(false, this.field201);
                                this.field201 = class55.method512(false, this.field201);
                                field147.field1092 = this.field201;
                                field147.field1077 = var18;
                                field147.field1091 = var20;
                                field147.field1112 = 150;
                                if (this.field101 == 2) {
                                    this.method45("@cr2@" + field147.field952, 2, 895, field147.field1092);
                                } else if (this.field101 == 1) {
                                    this.method45("@cr1@" + field147.field952, 2, 895, field147.field1092);
                                } else {
                                    this.method45(field147.field952, 2, 895, field147.field1092);
                                }
                                if (this.field68 == 2) {
                                    this.field68 = 3;
                                    this.field413 = true;
                                    this.field395.method450(7, 54);
                                    this.field395.method451(this.field68);
                                    this.field395.method451(this.field104);
                                    this.field395.method451(this.field174);
                                }
                            }
                            this.field201 = "";
                            this.field472 = true;
                        }
                    }
                }
            } while ((var2 < 97 || var2 > 122) && (var2 < 65 || var2 > 90) && (var2 < 48 || var2 > 57) && var2 != 32);
            if (this.field467.length() < 12) {
                this.field467 = this.field467 + (char) var2;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(Z)V")
    public final void method40(boolean arg0) {
        if (this.field543 == null) {
            this.method144((byte) 62);
            super.field1566 = null;
            this.field227 = null;
            this.field228 = null;
            this.field229 = null;
            this.field230 = null;
            this.field231 = null;
            this.field232 = null;
            this.field233 = null;
            this.field234 = null;
            this.field235 = null;
            this.field543 = new class25(this.method82(523), 0, 479, 96);
            this.field541 = new class25(this.method82(523), 0, 172, 156);
            this.field355 &= arg0;
            class8.method162(this.field334);
            this.field122.method599(0, 0, (byte) 0);
            this.field540 = new class25(this.method82(523), 0, 190, 261);
            this.field542 = new class25(this.method82(523), 0, 512, 334);
            class8.method162(this.field334);
            this.field485 = new class25(this.method82(523), 0, 496, 50);
            this.field486 = new class25(this.method82(523), 0, 269, 37);
            this.field487 = new class25(this.method82(523), 0, 249, 45);
            this.field399 = true;
            this.field542.method316(-439);
            class48.field1331 = this.field185;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IILNHFASBOX;)I")
    public final int method41(int arg0, int arg1, class34 arg2) {
        if (arg1 != 0) {
            this.method155();
        }
        if (arg2.field1043 != null && arg0 < arg2.field1043.length) {
            try {
                int[] var4 = arg2.field1043[arg0];
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
                        var9 = this.field204[var4[var6++]];
                    }
                    if (var8 == 2) {
                        var9 = this.field495[var4[var6++]];
                    }
                    if (var8 == 3) {
                        var9 = this.field176[var4[var6++]];
                    }
                    if (var8 == 4) {
                        class34 var11 = class34.method339(var4[var6++]);
                        int var12 = var4[var6++];
                        if (var12 >= 0 && var12 < class56.field1509 && (!class56.method544(var12).field1507 || field504)) {
                            for (int var13 = 0; var13 < var11.field1061.length; ++var13) {
                                if (var12 + 1 == var11.field1061[var13]) {
                                    var9 += var11.field1048[var13];
                                }
                            }
                        }
                    }
                    if (var8 == 5) {
                        var9 = this.field197[var4[var6++]];
                    }
                    if (var8 == 6) {
                        var9 = field494[this.field495[var4[var6++]] - 1];
                    }
                    if (var8 == 7) {
                        var9 = this.field197[var4[var6++]] * 100 / 46875;
                    }
                    if (var8 == 8) {
                        var9 = field147.field950;
                    }
                    if (var8 == 9) {
                        for (int var14 = 0; var14 < class58.field1550; ++var14) {
                            if (class58.field1552[var14]) {
                                var9 += this.field495[var14];
                            }
                        }
                    }
                    if (var8 == 10) {
                        class34 var15 = class34.method339(var4[var6++]);
                        int var16 = var4[var6++] + 1;
                        if (var16 >= 0 && var16 < class56.field1509 && (!class56.method544(var16).field1507 || field504)) {
                            for (int var17 = 0; var17 < var15.field1061.length; ++var17) {
                                if (var15.field1061[var17] == var16) {
                                    var9 = 999999999;
                                    break;
                                }
                            }
                        }
                    }
                    if (var8 == 11) {
                        var9 = this.field239;
                    }
                    if (var8 == 12) {
                        var9 = this.field406;
                    }
                    if (var8 == 13) {
                        int var18 = this.field197[var4[var6++]];
                        int var19 = var4[var6++];
                        var9 = (var18 & 1 << var19) != 0 ? 1 : 0;
                    }
                    if (var8 == 14) {
                        int var20 = var4[var6++];
                        class12 var21 = class12.field623[var20];
                        int var22 = var21.field625;
                        int var23 = var21.field626;
                        int var24 = var21.field627;
                        int var25 = field211[var24 - var23];
                        var9 = this.field197[var22] >> var23 & var25;
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
                        var9 = (field147.field1078 >> 7) + this.field96;
                    }
                    if (var8 == 19) {
                        var9 = (field147.field1079 >> 7) + this.field97;
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

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIILNHFASBOX;IZII)V")
    public final void method42(int arg0, int arg1, int arg2, class34 arg3, int arg4, boolean arg5, int arg6, int arg7) {
        if (arg5) {
            field436 = 179;
        }
        if (arg3.field1017 == 0 && arg3.field1065 != null && !arg3.field1007) {
            if (arg0 >= arg7 && arg2 >= arg4 && arg0 <= arg3.field1020 + arg7 && arg2 <= arg3.field995 + arg4) {
                int var9 = arg3.field1065.length;
                for (int var10 = 0; var10 < var9; ++var10) {
                    int var11 = arg3.field994[var10] + arg7;
                    int var12 = arg3.field1023[var10] + arg4 - arg1;
                    class34 var13 = class34.method339(arg3.field1065[var10]);
                    int var14 = var13.field1035 + var11;
                    int var15 = var13.field1022 + var12;
                    if ((var13.field1018 >= 0 || var13.field1058 != 0) && arg0 >= var14 && arg2 >= var15 && arg0 < var13.field1020 + var14 && arg2 < var13.field995 + var15) {
                        if (var13.field1018 >= 0) {
                            this.field144 = var13.field1018;
                        } else {
                            this.field144 = var13.field1040;
                        }
                    }
                    if (var13.field1017 == 8 && arg0 >= var14 && arg2 >= var15 && arg0 < var13.field1020 + var14 && arg2 < var13.field995 + var15) {
                        this.field431 = var13.field1040;
                    }
                    if (var13.field1017 == 0) {
                        this.method42(arg0, var13.field1044, arg2, var13, var15, false, arg6, var14);
                        if (var13.field1027 > var13.field995) {
                            this.method126(var13, var15, arg6, (byte) -92, var13.field995, arg0, var13.field1027, var13.field1020 + var14, arg2);
                        }
                    } else {
                        if (var13.field1051 == 1 && arg0 >= var14 && arg2 >= var15 && arg0 < var13.field1020 + var14 && arg2 < var13.field995 + var15) {
                            boolean var16 = false;
                            if (var13.field1012 != 0) {
                                var16 = this.method114((byte) -52, var13);
                            }
                            if (!var16) {
                                this.field441[this.field439] = var13.field1062;
                                this.field264[this.field439] = 128;
                                this.field263[this.field439] = var13.field1040;
                                ++this.field439;
                            }
                        }
                        if (var13.field1051 == 2 && this.field255 == 0 && arg0 >= var14 && arg2 >= var15 && arg0 < var13.field1020 + var14 && arg2 < var13.field995 + var15) {
                            String var17 = var13.field1037;
                            if (var17.indexOf(" ") != -1) {
                                var17 = var17.substring(0, var17.indexOf(" "));
                            }
                            this.field441[this.field439] = var17 + " @gre@" + var13.field1038;
                            this.field264[this.field439] = 738;
                            this.field263[this.field439] = var13.field1040;
                            ++this.field439;
                        }
                        if (var13.field1051 == 3 && arg0 >= var14 && arg2 >= var15 && arg0 < var13.field1020 + var14 && arg2 < var13.field995 + var15) {
                            this.field441[this.field439] = "Close";
                            if (arg6 == 3) {
                                this.field264[this.field439] = 136;
                            } else {
                                this.field264[this.field439] = 526;
                            }
                            this.field263[this.field439] = var13.field1040;
                            ++this.field439;
                        }
                        if (var13.field1051 == 4 && arg0 >= var14 && arg2 >= var15 && arg0 < var13.field1020 + var14 && arg2 < var13.field995 + var15) {
                            this.field441[this.field439] = var13.field1062;
                            this.field264[this.field439] = 256;
                            this.field263[this.field439] = var13.field1040;
                            ++this.field439;
                        }
                        if (var13.field1051 == 5 && arg0 >= var14 && arg2 >= var15 && arg0 < var13.field1020 + var14 && arg2 < var13.field995 + var15) {
                            this.field441[this.field439] = var13.field1062;
                            this.field264[this.field439] = 211;
                            this.field263[this.field439] = var13.field1040;
                            ++this.field439;
                        }
                        if (var13.field1051 == 6 && !this.field249 && arg0 >= var14 && arg2 >= var15 && arg0 < var13.field1020 + var14 && arg2 < var13.field995 + var15) {
                            this.field441[this.field439] = var13.field1062;
                            this.field264[this.field439] = 192;
                            this.field263[this.field439] = var13.field1040;
                            ++this.field439;
                        }
                        if (var13.field1017 == 2) {
                            int var18 = 0;
                            for (int var19 = 0; var19 < var13.field995; ++var19) {
                                for (int var20 = 0; var20 < var13.field1020; ++var20) {
                                    int var21 = (var13.field1057 + 32) * var20 + var14;
                                    int var22 = (var13.field1001 + 32) * var19 + var15;
                                    if (var18 < 20) {
                                        var21 += var13.field1021[var18];
                                        var22 += var13.field1004[var18];
                                    }
                                    if (arg0 >= var21 && arg2 >= var22 && arg0 < var21 + 32 && arg2 < var22 + 32) {
                                        this.field287 = var18;
                                        this.field288 = var13.field1040;
                                        if (var13.field1061[var18] > 0) {
                                            class56 var23 = class56.method544(var13.field1061[var18] - 1);
                                            if (this.field513 == 1 && var13.field1039) {
                                                if (this.field515 != var13.field1040 || this.field514 != var18) {
                                                    this.field441[this.field439] = "Use " + this.field517 + " with @lre@" + var23.field1496;
                                                    this.field264[this.field439] = 919;
                                                    this.field265[this.field439] = var23.field1535;
                                                    this.field262[this.field439] = var18;
                                                    this.field263[this.field439] = var13.field1040;
                                                    ++this.field439;
                                                }
                                            } else if (this.field255 == 1 && var13.field1039) {
                                                if ((this.field257 & 16) == 16) {
                                                    this.field441[this.field439] = this.field258 + " @lre@" + var23.field1496;
                                                    this.field264[this.field439] = 210;
                                                    this.field265[this.field439] = var23.field1535;
                                                    this.field262[this.field439] = var18;
                                                    this.field263[this.field439] = var13.field1040;
                                                    ++this.field439;
                                                }
                                            } else {
                                                if (var13.field1039) {
                                                    for (int var24 = 4; var24 >= 3; --var24) {
                                                        if (var23.field1495 != null && var23.field1495[var24] != null) {
                                                            this.field441[this.field439] = var23.field1495[var24] + " @lre@" + var23.field1496;
                                                            if (var24 == 3) {
                                                                this.field264[this.field439] = 228;
                                                            }
                                                            if (var24 == 4) {
                                                                this.field264[this.field439] = 675;
                                                            }
                                                            this.field265[this.field439] = var23.field1535;
                                                            this.field262[this.field439] = var18;
                                                            this.field263[this.field439] = var13.field1040;
                                                            ++this.field439;
                                                        } else if (var24 == 4) {
                                                            this.field441[this.field439] = "Drop @lre@" + var23.field1496;
                                                            this.field264[this.field439] = 675;
                                                            this.field265[this.field439] = var23.field1535;
                                                            this.field262[this.field439] = var18;
                                                            this.field263[this.field439] = var13.field1040;
                                                            ++this.field439;
                                                        }
                                                    }
                                                }
                                                if (var13.field1042) {
                                                    this.field441[this.field439] = "Use @lre@" + var23.field1496;
                                                    this.field264[this.field439] = 860;
                                                    this.field265[this.field439] = var23.field1535;
                                                    this.field262[this.field439] = var18;
                                                    this.field263[this.field439] = var13.field1040;
                                                    ++this.field439;
                                                }
                                                if (var13.field1039 && var23.field1495 != null) {
                                                    for (int var25 = 2; var25 >= 0; --var25) {
                                                        if (var23.field1495[var25] != null) {
                                                            this.field441[this.field439] = var23.field1495[var25] + " @lre@" + var23.field1496;
                                                            if (var25 == 0) {
                                                                this.field264[this.field439] = 221;
                                                            }
                                                            if (var25 == 1) {
                                                                this.field264[this.field439] = 379;
                                                            }
                                                            if (var25 == 2) {
                                                                this.field264[this.field439] = 207;
                                                            }
                                                            this.field265[this.field439] = var23.field1535;
                                                            this.field262[this.field439] = var18;
                                                            this.field263[this.field439] = var13.field1040;
                                                            ++this.field439;
                                                        }
                                                    }
                                                }
                                                if (var13.field1003 != null) {
                                                    for (int var26 = 4; var26 >= 0; --var26) {
                                                        if (var13.field1003[var26] != null) {
                                                            this.field441[this.field439] = var13.field1003[var26] + " @lre@" + var23.field1496;
                                                            if (var26 == 0) {
                                                                this.field264[this.field439] = 941;
                                                            }
                                                            if (var26 == 1) {
                                                                this.field264[this.field439] = 631;
                                                            }
                                                            if (var26 == 2) {
                                                                this.field264[this.field439] = 94;
                                                            }
                                                            if (var26 == 3) {
                                                                this.field264[this.field439] = 292;
                                                            }
                                                            if (var26 == 4) {
                                                                this.field264[this.field439] = 883;
                                                            }
                                                            this.field265[this.field439] = var23.field1535;
                                                            this.field262[this.field439] = var18;
                                                            this.field263[this.field439] = var13.field1040;
                                                            ++this.field439;
                                                        }
                                                    }
                                                }
                                                this.field441[this.field439] = "Examine @lre@" + var23.field1496;
                                                this.field264[this.field439] = 1826;
                                                this.field265[this.field439] = var23.field1535;
                                                this.field262[this.field439] = var18;
                                                this.field263[this.field439] = var13.field1040;
                                                ++this.field439;
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

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
    public final void method43(int arg0) {
        if (arg0 == -3593) {
            if (this.field370 > 0) {
                this.method28(0);
            } else {
                this.method29("Connection lost", "Please wait - attempting to reestablish", -946);
                this.field209 = 0;
                this.field425 = 0;
                class46 var2 = this.field74;
                this.field355 = false;
                this.field531 = 0;
                this.method158(this.field378, this.field379, true);
                if (!this.field355) {
                    this.method28(0);
                }
                try {
                    var2.method407();
                } catch (Exception var3) {
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ZIIILKVXZMJHR;)V")
    public final void method44(boolean arg0, int arg1, int arg2, int arg3, class27 arg4) {
        if (field147 != arg4) {
            if (this.field439 < 400) {
                String var6;
                if (arg4.field954 == 0) {
                    var6 = arg4.field952 + method21(field147.field950, field347, arg4.field950) + " (level-" + arg4.field950 + ")";
                } else {
                    var6 = arg4.field952 + " (skill-" + arg4.field954 + ")";
                }
                if (this.field513 == 1) {
                    this.field441[this.field439] = "Use " + this.field517 + " with @whi@" + var6;
                    this.field264[this.field439] = 669;
                    this.field265[this.field439] = arg3;
                    this.field262[this.field439] = arg2;
                    this.field263[this.field439] = arg1;
                    ++this.field439;
                } else if (this.field255 == 1) {
                    if ((this.field257 & 8) == 8) {
                        this.field441[this.field439] = this.field258 + " @whi@" + var6;
                        this.field264[this.field439] = 544;
                        this.field265[this.field439] = arg3;
                        this.field262[this.field439] = arg2;
                        this.field263[this.field439] = arg1;
                        ++this.field439;
                    }
                } else {
                    for (int var7 = 4; var7 >= 0; --var7) {
                        if (this.field363[var7] != null) {
                            this.field441[this.field439] = this.field363[var7] + " @whi@" + var6;
                            short var9 = 0;
                            if (this.field363[var7].equalsIgnoreCase("attack")) {
                                if (arg4.field950 > field147.field950) {
                                    var9 = 2000;
                                }
                                if (field147.field939 != 0 && arg4.field939 != 0) {
                                    if (field147.field939 == arg4.field939) {
                                        var9 = 2000;
                                    } else {
                                        var9 = 0;
                                    }
                                }
                            } else if (this.field364[var7]) {
                                var9 = 2000;
                            }
                            if (var7 == 0) {
                                this.field264[this.field439] = var9 + 685;
                            }
                            if (var7 == 1) {
                                this.field264[this.field439] = var9 + 530;
                            }
                            if (var7 == 2) {
                                this.field264[this.field439] = var9 + 622;
                            }
                            if (var7 == 3) {
                                this.field264[this.field439] = var9 + 749;
                            }
                            if (var7 == 4) {
                                this.field264[this.field439] = var9 + 832;
                            }
                            this.field265[this.field439] = arg3;
                            this.field262[this.field439] = arg2;
                            this.field263[this.field439] = arg1;
                            ++this.field439;
                        }
                    }
                }
                for (int var8 = 0; var8 < this.field439; ++var8) {
                    if (this.field264[var8] == 821) {
                        this.field441[var8] = "Walk here @whi@" + var6;
                        break;
                    }
                }
                if (arg0) {
                    this.field510 = 44;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        if (signlink.mainapp != null) {
            return signlink.mainapp.getCodeBase();
        } else {
            try {
                if (super.field1568 != null) {
                    return new URL("http://127.0.0.1:" + (field503 + 80));
                }
            } catch (Exception var1) {
            }
            return super.getCodeBase();
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;IILjava/lang/String;)V")
    public final void method45(String arg0, int arg1, int arg2, String arg3) {
        if (arg1 == 0 && this.field400 != -1) {
            this.field304 = arg3;
            super.field1579 = 0;
        }
        if (this.field216 == -1) {
            this.field472 = true;
        }
        for (int var5 = 99; var5 > 0; --var5) {
            this.field222[var5] = this.field222[var5 - 1];
            this.field223[var5] = this.field223[var5 - 1];
            this.field224[var5] = this.field224[var5 - 1];
        }
        this.field222[0] = arg1;
        if (arg2 <= 0) {
            this.field269 = this.field482.method375();
        }
        this.field223[0] = arg0;
        this.field224[0] = arg3;
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
    public final void method46(int arg0) {
        if (this.field439 >= 2 || this.field513 != 0 || this.field255 != 0) {
            if (arg0 <= 0) {
                this.method155();
            }
            String var2;
            if (this.field513 == 1 && this.field439 < 2) {
                var2 = "Use " + this.field517 + " with...";
            } else if (this.field255 == 1 && this.field439 < 2) {
                var2 = this.field258 + "...";
            } else {
                var2 = this.field441[this.field439 - 1];
            }
            if (this.field439 > 2) {
                var2 = var2 + "@whi@ / " + (this.field439 - 2) + " more options";
            }
            this.field508.method369(15, 16777215, var2, field346 / 1000, 4, true, true);
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
    public final void method47(byte arg0) {
        if (this.field227 == null) {
            super.field1566 = null;
            this.field543 = null;
            this.field541 = null;
            this.field540 = null;
            this.field542 = null;
            this.field485 = null;
            this.field486 = null;
            this.field487 = null;
            this.field230 = new class25(this.method82(523), 0, 128, 265);
            class8.method162(this.field334);
            this.field231 = new class25(this.method82(523), 0, 128, 265);
            class8.method162(this.field334);
            this.field227 = new class25(this.method82(523), 0, 509, 171);
            class8.method162(this.field334);
            this.field228 = new class25(this.method82(523), 0, 360, 132);
            class8.method162(this.field334);
            if (arg0 != 94) {
                this.field395.method451(108);
            }
            this.field229 = new class25(this.method82(523), 0, 360, 200);
            class8.method162(this.field334);
            this.field232 = new class25(this.method82(523), 0, 202, 238);
            class8.method162(this.field334);
            this.field233 = new class25(this.method82(523), 0, 203, 238);
            class8.method162(this.field334);
            this.field234 = new class25(this.method82(523), 0, 74, 94);
            class8.method162(this.field334);
            this.field235 = new class25(this.method82(523), 0, 75, 94);
            class8.method162(this.field334);
            if (this.field325 != null) {
                this.method27(true);
                this.method72(6);
            }
            this.field399 = true;
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(II)Ljava/lang/String;")
    private static final String method48(int arg0, int arg1) {
        String var2 = String.valueOf(arg0);
        for (int var3 = var2.length() - 3; var3 > 0; var3 -= 3) {
            var2 = var2.substring(0, var3) + "," + var2.substring(var3);
        }
        if (arg1 != 0) {
            throw new NullPointerException();
        } else {
            if (var2.length() > 8) {
                var2 = "@gre@" + var2.substring(0, var2.length() - 8) + " million @whi@(" + var2 + ")";
            } else if (var2.length() > 4) {
                var2 = "@cya@" + var2.substring(0, var2.length() - 4) + "K @whi@(" + var2 + ")";
            }
            return " " + var2;
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
    public final void method49(byte arg0) {
        this.field541.method316(-439);
        if (this.field209 == 2) {
            byte[] var2 = this.field122.field1725;
            int[] var3 = class8.field581;
            int var4 = var2.length;
            for (int var5 = 0; var5 < var4; ++var5) {
                if (var2[var5] == 0) {
                    var3[var5] = 0;
                }
            }
            this.field490.method355(33, 0, 0, this.field260, 25, 0, this.field284, this.field212, 33, 256, 25);
            this.field542.method316(-439);
            class48.field1331 = this.field185;
        } else {
            int var6 = this.field284 + this.field271 & 2047;
            if (arg0 != 5) {
                this.field351 = 460;
            }
            int var7 = field147.field1078 / 32 + 48;
            int var8 = 464 - field147.field1079 / 32;
            this.field427.method355(146, 5, 0, this.field524, var7, 25, var6, this.field135, 151, this.field154 + 256, var8);
            this.field490.method355(33, 0, 0, this.field260, 25, 0, this.field284, this.field212, 33, 256, 25);
            for (int var9 = 0; var9 < this.field462; ++var9) {
                int var39 = this.field463[var9] * 4 + 2 - field147.field1078 / 32;
                int var40 = this.field464[var9] * 4 + 2 - field147.field1079 / 32;
                this.method91(var40, this.field226[var9], var39, (byte) 30);
            }
            for (int var10 = 0; var10 < 104; ++var10) {
                for (int var35 = 0; var35 < 104; ++var35) {
                    class11 var36 = this.field164[this.field307][var10][var35];
                    if (var36 != null) {
                        int var37 = var10 * 4 + 2 - field147.field1078 / 32;
                        int var38 = var35 * 4 + 2 - field147.field1079 / 32;
                        this.method91(var38, this.field519, var37, (byte) 30);
                    }
                }
            }
            for (int var11 = 0; var11 < this.field195; ++var11) {
                class42 var31 = this.field194[this.field196[var11]];
                if (var31 != null && var31.method325(5)) {
                    class44 var32 = var31.field1196;
                    if (var32.field1224 != null) {
                        var32 = var32.method397(1);
                    }
                    if (var32 != null && var32.field1225 && var32.field1212) {
                        int var33 = var31.field1078 / 32 - field147.field1078 / 32;
                        int var34 = var31.field1079 / 32 - field147.field1079 / 32;
                        this.method91(var34, this.field520, var33, (byte) 30);
                    }
                }
            }
            for (int var12 = 0; var12 < this.field476; ++var12) {
                class27 var23 = this.field475[this.field477[var12]];
                if (var23 != null && var23.method325(5)) {
                    int var24 = var23.field1078 / 32 - field147.field1078 / 32;
                    int var25 = var23.field1079 / 32 - field147.field1079 / 32;
                    boolean var26 = false;
                    long var27 = class3.method5(var23.field952);
                    for (int var29 = 0; var29 < this.field390; ++var29) {
                        if (this.field488[var29] == var27 && this.field118[var29] != 0) {
                            var26 = true;
                            break;
                        }
                    }
                    boolean var30 = false;
                    if (field147.field939 != 0 && var23.field939 != 0 && field147.field939 == var23.field939) {
                        var30 = true;
                    }
                    if (var26) {
                        this.method91(var25, this.field522, var24, (byte) 30);
                    } else if (var30) {
                        this.method91(var25, this.field523, var24, (byte) 30);
                    } else {
                        this.method91(var25, this.field521, var24, (byte) 30);
                    }
                }
            }
            if (this.field315 != 0 && field346 % 20 < 10) {
                if (this.field315 == 1 && this.field202 >= 0 && this.field202 < this.field194.length) {
                    class42 var13 = this.field194[this.field202];
                    if (var13 != null) {
                        int var14 = var13.field1078 / 32 - field147.field1078 / 32;
                        int var15 = var13.field1079 / 32 - field147.field1079 / 32;
                        this.method111(var14, this.field533, false, var15);
                    }
                }
                if (this.field315 == 2) {
                    int var16 = (this.field454 - this.field96) * 4 + 2 - field147.field1078 / 32;
                    int var17 = (this.field455 - this.field97) * 4 + 2 - field147.field1079 / 32;
                    this.method111(var16, this.field533, false, var17);
                }
                if (this.field315 == 10 && this.field492 >= 0 && this.field492 < this.field475.length) {
                    class27 var18 = this.field475[this.field492];
                    if (var18 != null) {
                        int var19 = var18.field1078 / 32 - field147.field1078 / 32;
                        int var20 = var18.field1079 / 32 - field147.field1079 / 32;
                        this.method111(var19, this.field533, false, var20);
                    }
                }
            }
            if (this.field425 != 0) {
                int var21 = this.field425 * 4 + 2 - field147.field1078 / 32;
                int var22 = this.field426 * 4 + 2 - field147.field1079 / 32;
                this.method91(var22, this.field532, var21, (byte) 30);
            }
            class8.method164(16777215, 21899, 3, 97, 3, 78);
            this.field542.method316(-439);
            class48.field1331 = this.field185;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IB)Z")
    public final boolean method50(int arg0, byte arg1) {
        if (arg0 < 0) {
            return false;
        } else {
            int var3 = this.field264[arg0];
            if (arg1 != 119) {
                this.field537 = this.field482.method375();
            }
            if (var3 >= 2000) {
                var3 -= 2000;
            }
            return var3 == 839;
        }
    }

    @OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
    public final void method51(int arg0) {
        if (this.field513 == 0 && this.field255 == 0) {
            this.field441[this.field439] = "Walk here";
            this.field264[this.field439] = 821;
            this.field262[this.field439] = super.field1573;
            this.field263[this.field439] = super.field1574;
            ++this.field439;
        }
        int var2 = -1;
        for (int var3 = 0; var3 < class19.field871; ++var3) {
            int var5 = class19.field872[var3];
            int var6 = var5 & 127;
            int var7 = var5 >> 7 & 127;
            int var8 = var5 >> 29 & 3;
            int var9 = var5 >> 14 & 32767;
            if (var2 != var5) {
                var2 = var5;
                if (var8 == 2 && this.field78.method219(this.field307, var6, var7, var5) >= 0) {
                    class47 var10 = class47.method417(var9);
                    if (var10.field1285 != null) {
                        var10 = var10.method418(38796);
                    }
                    if (var10 == null) {
                        continue;
                    }
                    if (this.field513 == 1) {
                        this.field441[this.field439] = "Use " + this.field517 + " with @cya@" + var10.field1309;
                        this.field264[this.field439] = 453;
                        this.field265[this.field439] = var5;
                        this.field262[this.field439] = var6;
                        this.field263[this.field439] = var7;
                        ++this.field439;
                    } else if (this.field255 == 1) {
                        if ((this.field257 & 4) == 4) {
                            this.field441[this.field439] = this.field258 + " @cya@" + var10.field1309;
                            this.field264[this.field439] = 23;
                            this.field265[this.field439] = var5;
                            this.field262[this.field439] = var6;
                            this.field263[this.field439] = var7;
                            ++this.field439;
                        }
                    } else {
                        if (var10.field1312 != null) {
                            for (int var11 = 4; var11 >= 0; --var11) {
                                if (var10.field1312[var11] != null) {
                                    this.field441[this.field439] = var10.field1312[var11] + " @cya@" + var10.field1309;
                                    if (var11 == 0) {
                                        this.field264[this.field439] = 405;
                                    }
                                    if (var11 == 1) {
                                        this.field264[this.field439] = 87;
                                    }
                                    if (var11 == 2) {
                                        this.field264[this.field439] = 424;
                                    }
                                    if (var11 == 3) {
                                        this.field264[this.field439] = 707;
                                    }
                                    if (var11 == 4) {
                                        this.field264[this.field439] = 1198;
                                    }
                                    this.field265[this.field439] = var5;
                                    this.field262[this.field439] = var6;
                                    this.field263[this.field439] = var7;
                                    ++this.field439;
                                }
                            }
                        }
                        this.field441[this.field439] = "Examine @cya@" + var10.field1309;
                        this.field264[this.field439] = 1648;
                        this.field265[this.field439] = var10.field1286 << 14;
                        this.field262[this.field439] = var6;
                        this.field263[this.field439] = var7;
                        ++this.field439;
                    }
                }
                if (var8 == 1) {
                    class42 var12 = this.field194[var9];
                    if (var12.field1196.field1238 == 1 && (var12.field1078 & 127) == 64 && (var12.field1079 & 127) == 64) {
                        for (int var13 = 0; var13 < this.field195; ++var13) {
                            class42 var16 = this.field194[this.field196[var13]];
                            if (var16 != null && var12 != var16 && var16.field1196.field1238 == 1 && var12.field1078 == var16.field1078 && var12.field1079 == var16.field1079) {
                                this.method113(var6, var7, true, this.field196[var13], var16.field1196);
                            }
                        }
                        for (int var14 = 0; var14 < this.field476; ++var14) {
                            class27 var15 = this.field475[this.field477[var14]];
                            if (var15 != null && var12.field1078 == var15.field1078 && var12.field1079 == var15.field1079) {
                                this.method44(false, var7, var6, this.field477[var14], var15);
                            }
                        }
                    }
                    this.method113(var6, var7, true, var9, var12.field1196);
                }
                if (var8 == 0) {
                    class27 var17 = this.field475[var9];
                    if ((var17.field1078 & 127) == 64 && (var17.field1079 & 127) == 64) {
                        for (int var18 = 0; var18 < this.field195; ++var18) {
                            class42 var21 = this.field194[this.field196[var18]];
                            if (var21 != null && var21.field1196.field1238 == 1 && var17.field1078 == var21.field1078 && var17.field1079 == var21.field1079) {
                                this.method113(var6, var7, true, this.field196[var18], var21.field1196);
                            }
                        }
                        for (int var19 = 0; var19 < this.field476; ++var19) {
                            class27 var20 = this.field475[this.field477[var19]];
                            if (var20 != null && var17 != var20 && var17.field1078 == var20.field1078 && var17.field1079 == var20.field1079) {
                                this.method44(false, var7, var6, this.field477[var19], var20);
                            }
                        }
                    }
                    this.method44(false, var7, var6, var9, var17);
                }
                if (var8 == 3) {
                    class11 var22 = this.field164[this.field307][var6][var7];
                    if (var22 != null) {
                        for (class61 var23 = (class61) var22.method182(0); var23 != null; var23 = (class61) var22.method184(true)) {
                            class56 var24 = class56.method544(var23.field1606);
                            if (this.field513 == 1) {
                                this.field441[this.field439] = "Use " + this.field517 + " with @lre@" + var24.field1496;
                                this.field264[this.field439] = 956;
                                this.field265[this.field439] = var23.field1606;
                                this.field262[this.field439] = var6;
                                this.field263[this.field439] = var7;
                                ++this.field439;
                            } else if (this.field255 == 1) {
                                if ((this.field257 & 1) == 1) {
                                    this.field441[this.field439] = this.field258 + " @lre@" + var24.field1496;
                                    this.field264[this.field439] = 769;
                                    this.field265[this.field439] = var23.field1606;
                                    this.field262[this.field439] = var6;
                                    this.field263[this.field439] = var7;
                                    ++this.field439;
                                }
                            } else {
                                for (int var25 = 4; var25 >= 0; --var25) {
                                    if (var24.field1485 != null && var24.field1485[var25] != null) {
                                        this.field441[this.field439] = var24.field1485[var25] + " @lre@" + var24.field1496;
                                        if (var25 == 0) {
                                            this.field264[this.field439] = 77;
                                        }
                                        if (var25 == 1) {
                                            this.field264[this.field439] = 483;
                                        }
                                        if (var25 == 2) {
                                            this.field264[this.field439] = 491;
                                        }
                                        if (var25 == 3) {
                                            this.field264[this.field439] = 879;
                                        }
                                        if (var25 == 4) {
                                            this.field264[this.field439] = 455;
                                        }
                                        this.field265[this.field439] = var23.field1606;
                                        this.field262[this.field439] = var6;
                                        this.field263[this.field439] = var7;
                                        ++this.field439;
                                    } else if (var25 == 2) {
                                        this.field441[this.field439] = "Take @lre@" + var24.field1496;
                                        this.field264[this.field439] = 491;
                                        this.field265[this.field439] = var23.field1606;
                                        this.field262[this.field439] = var6;
                                        this.field263[this.field439] = var7;
                                        ++this.field439;
                                    }
                                }
                                this.field441[this.field439] = "Examine @lre@" + var24.field1496;
                                this.field264[this.field439] = 1914;
                                this.field265[this.field439] = var23.field1606;
                                this.field262[this.field439] = var6;
                                this.field263[this.field439] = var7;
                                ++this.field439;
                            }
                        }
                    }
                }
            }
        }
        if (arg0 != -8207) {
            for (int var4 = 1; var4 > 0; ++var4) {
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V")
    public final void method52(int arg0) {
        this.method53((byte) -51);
        if (arg0 != 42641) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        if (this.field345 == 1) {
            this.field109[this.field344 / 100].method351(this.field343 - 8 - 4, this.field342 - 8 - 4, (byte) 0);
        }
        if (this.field345 == 2) {
            this.field109[this.field344 / 100 + 4].method351(this.field343 - 8 - 4, this.field342 - 8 - 4, (byte) 0);
            ++field165;
            if (field165 > 1114) {
                field165 = 0;
                this.field395.method450(7, 26);
                this.field395.method451(0);
                int var3 = this.field395.field1434;
                this.field395.method451((int) (Math.random() * 256.0D));
                this.field395.method452(9360);
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field395.method451(245);
                }
                this.field395.method452(2628);
                this.field395.method452(27049);
                this.field395.method451(152);
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field395.method452(33207);
                }
                this.field395.method452(59958);
                this.field395.method451(186);
                this.field395.method452((int) (Math.random() * 65536.0D));
                this.field395.method460(true, this.field395.field1434 - var3);
            }
        }
        if (this.field393 != -1) {
            this.method99(this.field393, this.field324, this.field377);
            this.method65(class34.method339(this.field393), 0, 0, 0, 284);
        }
        if (this.field329 != -1) {
            this.method99(this.field329, this.field324, this.field377);
            this.method65(class34.method339(this.field329), 0, 0, 0, 284);
        }
        this.method59((byte) 1);
        if (!this.field498) {
            this.method84(true);
            this.method46(13);
        } else if (this.field168 == 0) {
            this.method136(true);
        }
        if (this.field203 == 1) {
            this.field337.method351(296, 472, (byte) 0);
        }
        if (field442) {
            short var4 = 507;
            byte var5 = 20;
            int var6 = 16776960;
            if (super.field1561 < 30 && field505) {
                var6 = 16711680;
            }
            if (super.field1561 < 20 && !field505) {
                var6 = 16711680;
            }
            this.field507.method359(var5, 553, "Fps:" + super.field1561, var6, var4);
            int var15 = var5 + 15;
            Runtime var7 = Runtime.getRuntime();
            int var8 = (int) ((var7.totalMemory() - var7.freeMemory()) / 1024L);
            int var9 = 16776960;
            if (var8 > 33554432 && field505) {
                int var10 = 16711680;
            }
            if (var8 > 67108864 && !field505) {
                int var11 = 16711680;
            }
            this.field507.method359(var15, 553, "Mem:" + var8 + "k", 16776960, var4);
            var15 += 15;
        }
        if (this.field180 != 0) {
            int var12 = this.field180 / 50;
            int var13 = var12 / 60;
            int var14 = var12 % 60;
            if (var14 < 10) {
                this.field507.method364(329, 16776960, (byte) -120, 4, "System update in: " + var13 + ":0" + var14);
            } else {
                this.field507.method364(329, 16776960, (byte) -120, 4, "System update in: " + var13 + ":" + var14);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
    public final void method53(byte arg0) {
        if (this.field452 != 0) {
            class38 var2 = this.field507;
            if (arg0 == -51) {
                int var3 = 0;
                if (this.field180 != 0) {
                    var3 = 1;
                }
                for (int var4 = 0; var4 < 100; ++var4) {
                    if (this.field224[var4] != null) {
                        int var5 = this.field222[var4];
                        String var6 = this.field223[var4];
                        byte var7 = 0;
                        if (var6 != null && var6.startsWith("@cr1@")) {
                            var6 = var6.substring(5);
                            var7 = 1;
                        }
                        if (var6 != null && var6.startsWith("@cr2@")) {
                            var6 = var6.substring(5);
                            var7 = 2;
                        }
                        if ((var5 == 3 || var5 == 7) && (var5 == 7 || this.field104 == 0 || this.field104 == 1 && this.method16(var6, 38775))) {
                            int var8 = 329 - var3 * 13;
                            byte var9 = 4;
                            var2.method364(var8, 0, (byte) -120, var9, "From");
                            var2.method364(var8 - 1, 65535, (byte) -120, var9, "From");
                            int var10 = var9 + var2.method362("From ", 443);
                            if (var7 == 1) {
                                this.field280[0].method599(var8 - 12, var10, (byte) 0);
                                var10 += 14;
                            }
                            if (var7 == 2) {
                                this.field280[1].method599(var8 - 12, var10, (byte) 0);
                                var10 += 14;
                            }
                            var2.method364(var8, 0, (byte) -120, var10, var6 + ": " + this.field224[var4]);
                            var2.method364(var8 - 1, 65535, (byte) -120, var10, var6 + ": " + this.field224[var4]);
                            ++var3;
                            if (var3 >= 5) {
                                return;
                            }
                        }
                        if (var5 == 5 && this.field104 < 2) {
                            int var11 = 329 - var3 * 13;
                            var2.method364(var11, 0, (byte) -120, 4, this.field224[var4]);
                            var2.method364(var11 - 1, 65535, (byte) -120, 4, this.field224[var4]);
                            ++var3;
                            if (var3 >= 5) {
                                return;
                            }
                        }
                        if (var5 == 6 && this.field104 < 2) {
                            int var12 = 329 - var3 * 13;
                            var2.method364(var12, 0, (byte) -120, 4, "To " + var6 + ": " + this.field224[var4]);
                            var2.method364(var12 - 1, 65535, (byte) -120, 4, "To " + var6 + ": " + this.field224[var4]);
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

    @OriginalMember(owner = "client!client", name = "m", descriptor = "(I)V")
    public final void method54(int arg0) {
        Graphics var2 = this.method82(523).getGraphics();
        if (arg0 < 7 || arg0 > 7) {
            this.field367 = this.field177.method461();
        }
        var2.setColor(Color.black);
        var2.fillRect(0, 0, 765, 503);
        this.method556(1, 45200);
        if (this.field191) {
            this.field95 = false;
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
        if (this.field175) {
            this.field95 = false;
            var2.setFont(new Font("Helvetica", 1, 20));
            var2.setColor(Color.white);
            var2.drawString("Error - unable to load game!", 50, 50);
            var2.drawString("To play RuneScape make sure you play from", 50, 100);
            var2.drawString("http://www.runescape.com", 50, 150);
        }
        if (this.field381) {
            this.field95 = false;
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

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILNHFASBOX;)V")
    public final void method55(int arg0, class34 arg1) {
        if (this.field443 != arg0) {
            for (int var3 = 1; var3 > 0; ++var3) {
            }
        }
        int var4 = arg1.field1012;
        if ((var4 < 1 || var4 > 100) && (var4 < 701 || var4 > 800)) {
            if ((var4 < 101 || var4 > 200) && (var4 < 801 || var4 > 900)) {
                if (var4 == 203) {
                    int var7 = this.field390;
                    if (this.field391 != 2) {
                        var7 = 0;
                    }
                    arg1.field1027 = var7 * 15 + 20;
                    if (arg1.field1027 <= arg1.field995) {
                        arg1.field1027 = arg1.field995 + 1;
                    }
                } else if (var4 >= 401 && var4 <= 500) {
                    var4 -= 401;
                    if (var4 == 0 && this.field391 == 0) {
                        arg1.field1010 = "Loading ignore list";
                        arg1.field1051 = 0;
                    } else if (var4 == 1 && this.field391 == 0) {
                        arg1.field1010 = "Please wait...";
                        arg1.field1051 = 0;
                    } else {
                        int var8 = this.field299;
                        if (this.field391 == 0) {
                            var8 = 0;
                        }
                        if (var4 >= var8) {
                            arg1.field1010 = "";
                            arg1.field1051 = 0;
                        } else {
                            arg1.field1010 = class3.method9(27250, class3.method6(357, this.field198[var4]));
                            arg1.field1051 = 1;
                        }
                    }
                } else if (var4 == 503) {
                    arg1.field1027 = this.field299 * 15 + 20;
                    if (arg1.field1027 <= arg1.field995) {
                        arg1.field1027 = arg1.field995 + 1;
                    }
                } else if (var4 == 327) {
                    arg1.field1015 = 150;
                    arg1.field1016 = (int) (Math.sin((double) field346 / 40.0D) * 256.0D) & 2047;
                    if (this.field403) {
                        for (int var9 = 0; var9 < 7; ++var9) {
                            int var16 = this.field281[var9];
                            if (var16 >= 0 && !class54.field1461[var16].method498(-303)) {
                                return;
                            }
                        }
                        this.field403 = false;
                        class19[] var10 = new class19[7];
                        int var11 = 0;
                        for (int var12 = 0; var12 < 7; ++var12) {
                            int var15 = this.field281[var12];
                            if (var15 >= 0) {
                                var10[var11++] = class54.field1461[var15].method499(-413);
                            }
                        }
                        class19 var13 = new class19((byte) 9, var11, var10);
                        for (int var14 = 0; var14 < 5; ++var14) {
                            if (this.field207[var14] != 0) {
                                var13.method287(field309[var14][0], field309[var14][this.field207[var14]]);
                                if (var14 == 1) {
                                    var13.method287(field415[0], field415[this.field207[var14]]);
                                }
                            }
                        }
                        var13.method280(true);
                        var13.method281(true, class26.field921[field147.field1072].field923[0]);
                        var13.method290(64, 850, -30, -50, -30, true);
                        arg1.field1059 = 5;
                        arg1.field1060 = 0;
                        class34.method338(0, 5, 0, var13);
                    }
                } else if (var4 == 324) {
                    if (this.field145 == null) {
                        this.field145 = arg1.field1025;
                        this.field146 = arg1.field1056;
                    }
                    if (this.field161) {
                        arg1.field1025 = this.field146;
                    } else {
                        arg1.field1025 = this.field145;
                    }
                } else if (var4 == 325) {
                    if (this.field145 == null) {
                        this.field145 = arg1.field1025;
                        this.field146 = arg1.field1056;
                    }
                    if (this.field161) {
                        arg1.field1025 = this.field145;
                    } else {
                        arg1.field1025 = this.field146;
                    }
                } else if (var4 == 600) {
                    arg1.field1010 = this.field467;
                    if (field346 % 20 < 10) {
                        arg1.field1010 = arg1.field1010 + "|";
                    } else {
                        arg1.field1010 = arg1.field1010 + " ";
                    }
                } else {
                    if (var4 == 620) {
                        if (this.field101 >= 1) {
                            if (this.field445) {
                                arg1.field1005 = 16711680;
                                arg1.field1010 = "Moderator option: Mute player for 48 hours: <ON>";
                            } else {
                                arg1.field1005 = 16777215;
                                arg1.field1010 = "Moderator option: Mute player for 48 hours: <OFF>";
                            }
                        } else {
                            arg1.field1010 = "";
                        }
                    }
                    if (var4 == 660) {
                        int var17 = this.field354 - this.field460;
                        String var18;
                        if (var17 <= 0) {
                            var18 = "earlier today";
                        } else if (var17 == 1) {
                            var18 = "yesterday";
                        } else {
                            var18 = var17 + " days ago";
                        }
                        arg1.field1010 = "You last logged in @red@" + var18 + "@bla@ from: @red@" + signlink.dns;
                    }
                    if (var4 == 661) {
                        if (this.field374 == 0) {
                            arg1.field1010 = "\\nYou have not yet set any recovery questions.\\nIt is @lre@strongly@yel@ recommended that you do so.\\n\\nIf you don't you will be @lre@unable to recover your\\n@lre@password@yel@ if you forget it, or it is stolen.";
                        } else if (this.field374 <= this.field354) {
                            arg1.field1010 = "\\n\\nRecovery Questions Last Set:\\n@gre@" + this.method56((byte) 117, this.field374);
                        } else {
                            int var19 = this.field354 + 14 - this.field374;
                            String var20;
                            if (var19 <= 0) {
                                var20 = "Earlier today";
                            } else if (var19 == 1) {
                                var20 = "Yesterday";
                            } else {
                                var20 = var19 + " days ago";
                            }
                            arg1.field1010 = var20 + " you requested@lre@ new recovery\\n@lre@questions.@yel@ The requested change will occur\\non: @lre@" + this.method56((byte) 117, this.field374) + "\\n\\nIf you do not remember making this request\\ncancel it immediately, and change your password.";
                        }
                    }
                    if (var4 == 662) {
                        String var21;
                        if (this.field108 == 0) {
                            var21 = "@yel@0 unread messages";
                        } else if (this.field108 == 1) {
                            var21 = "@gre@1 unread message";
                        } else {
                            var21 = "@gre@" + this.field108 + " unread messages";
                        }
                        arg1.field1010 = "You have " + var21 + "\\nin your message centre.";
                    }
                    if (var4 == 663) {
                        if (this.field396 > 0 && this.field396 <= this.field354 + 10) {
                            arg1.field1010 = "Last password change:\\n@gre@" + this.method56((byte) 117, this.field396);
                        } else {
                            arg1.field1010 = "Last password change:\\n@gre@Never changed";
                        }
                    }
                    if (var4 == 665) {
                        if (this.field156 > 2 && !field504) {
                            arg1.field1010 = "This is a non-members\\nworld. To enjoy your\\nmembers benefits we\\nrecommend you play on a\\nmembers world instead.";
                        } else if (this.field156 > 2) {
                            arg1.field1010 = "\\n\\nYou have @gre@" + this.field156 + "@yel@ days of\\nmember credit remaining.";
                        } else if (this.field156 > 0) {
                            arg1.field1010 = "You have @gre@" + this.field156 + "@yel@ days of\\nmember credit remaining.\\n\\n@lre@Credit low! Renew now\\n@lre@to avoid losing members.";
                        } else {
                            arg1.field1010 = "You are not a member.\\n\\nChoose to subscribe and\\nyou'll get loads of extra\\nbenefits and features.";
                        }
                    }
                    if (var4 == 667) {
                        if (this.field156 > 2 && !field504) {
                            arg1.field1010 = "To switch to a members-only world:\\n1) Logout and return to the world selection page.\\n2) Choose one of the members world with a gold star next to it's name.\\n\\nIf you prefer you can continue to use this world,\\nbut members only features will be unavailable here.";
                        } else if (this.field156 > 0) {
                            arg1.field1010 = "To extend or cancel a subscription:\\n1) Logout and return to the frontpage of this website.\\n2)Choose the relevant option from the 'membership' section.\\n\\nNote: If you are a credit card subscriber a top-up payment will\\nautomatically be taken when 3 days credit remain.\\n(unless you cancel your subscription, which can be done at any time.)";
                        } else {
                            arg1.field1010 = "To start a subscripton:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Start a new subscription'";
                        }
                    }
                    if (var4 == 668) {
                        if (this.field374 > this.field354) {
                            arg1.field1010 = "To cancel this request:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Cancel recovery questions'.";
                        } else {
                            arg1.field1010 = "To change your recovery questions:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Set new recovery questions'.";
                        }
                    }
                }
            } else {
                int var6 = this.field390;
                if (this.field391 != 2) {
                    var6 = 0;
                }
                if (var4 > 800) {
                    var4 -= 701;
                } else {
                    var4 -= 101;
                }
                if (var4 >= var6) {
                    arg1.field1010 = "";
                    arg1.field1051 = 0;
                } else {
                    if (this.field118[var4] == 0) {
                        arg1.field1010 = "@red@Offline";
                    } else if (this.field118[var4] < 200) {
                        if (this.field118[var4] == field502) {
                            arg1.field1010 = "@gre@World" + (this.field118[var4] - 9);
                        } else {
                            arg1.field1010 = "@yel@World" + (this.field118[var4] - 9);
                        }
                    } else if (this.field118[var4] == field502) {
                        arg1.field1010 = "@gre@Classic" + (this.field118[var4] - 219);
                    } else {
                        arg1.field1010 = "@yel@Classic" + (this.field118[var4] - 219);
                    }
                    arg1.field1051 = 1;
                }
            }
        } else if (var4 == 1 && this.field391 == 0) {
            arg1.field1010 = "Loading friend list";
            arg1.field1051 = 0;
        } else if (var4 == 1 && this.field391 == 1) {
            arg1.field1010 = "Connecting to friendserver";
            arg1.field1051 = 0;
        } else if (var4 == 2 && this.field391 != 2) {
            arg1.field1010 = "Please wait...";
            arg1.field1051 = 0;
        } else {
            int var5 = this.field390;
            if (this.field391 != 2) {
                var5 = 0;
            }
            if (var4 > 700) {
                var4 -= 601;
            } else {
                --var4;
            }
            if (var4 >= var5) {
                arg1.field1010 = "";
                arg1.field1051 = 0;
            } else {
                arg1.field1010 = this.field489[var4];
                arg1.field1051 = 1;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(BI)Ljava/lang/String;")
    public final String method56(byte arg0, int arg1) {
        if (arg0 != 117) {
            this.field367 = -1;
        }
        if (arg1 > this.field354 + 10) {
            return "Unknown";
        } else {
            long var3 = ((long) arg1 + 11745L) * 86400000L;
            Calendar var5 = Calendar.getInstance();
            var5.setTime(new Date(var3));
            int var6 = var5.get(5);
            int var7 = var5.get(2);
            int var8 = var5.get(1);
            String[] var9 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
            return var6 + "-" + var9[var7] + "-" + var8;
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(IJ)V")
    public final void method57(int arg0, long arg1) {
        if (arg1 != 0L) {
            if (this.field390 >= 100 && this.field253 != 1) {
                this.method45("", 0, 895, "Your friendlist is full. Max of 100 for free users, and 200 for members");
            } else if (this.field390 >= 200) {
                this.method45("", 0, 895, "Your friendlist is full. Max of 100 for free users, and 200 for members");
            } else {
                String var4 = class3.method9(27250, class3.method6(357, arg1));
                for (int var5 = 0; var5 < this.field390; ++var5) {
                    if (this.field488[var5] == arg1) {
                        this.method45("", 0, 895, var4 + " is already on your friend list");
                        return;
                    }
                }
                for (int var6 = 0; var6 < this.field299; ++var6) {
                    if (this.field198[var6] == arg1) {
                        this.method45("", 0, 895, "Please remove " + var4 + " from your ignore list first");
                        return;
                    }
                }
                if (!var4.equals(field147.field952)) {
                    this.field489[this.field390] = var4;
                    this.field488[this.field390] = arg1;
                    this.field118[this.field390] = 0;
                    ++this.field390;
                    this.field405 = true;
                    this.field395.method450(7, 190);
                    if (arg0 != -25941) {
                        this.field367 = this.field177.method461();
                    }
                    this.field395.method457(arg1, 601);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(B)Z")
    public final boolean method58(byte arg0) {
        if (arg0 != 92) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        return signlink.wavereplay();
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V")
    public final void method59(byte arg0) {
        if (this.field110 != arg0) {
            this.field491 = !this.field491;
        }
        this.field484 = 0;
        int var2 = (field147.field1078 >> 7) + this.field96;
        int var3 = (field147.field1079 >> 7) + this.field97;
        if (var2 >= 3053 && var2 <= 3156 && var3 >= 3056 && var3 <= 3136) {
            this.field484 = 1;
        }
        if (var2 >= 3072 && var2 <= 3118 && var3 >= 9492 && var3 <= 9535) {
            this.field484 = 1;
        }
        if (this.field484 == 1 && var2 >= 3139 && var2 <= 3199 && var3 >= 3008 && var3 <= 3062) {
            this.field484 = 0;
        }
    }

    @OriginalMember(owner = "client!client", name = "n", descriptor = "(I)V")
    public final void method60(int arg0) {
        int var2 = this.field384 * 128 + 64;
        int var3 = this.field385 * 128 + 64;
        int var4 = this.method97(var2, var3, (byte) -103, this.field307) - this.field386;
        if (this.field242 < var2) {
            this.field242 += (var2 - this.field242) * this.field388 / 1000 + this.field387;
            if (this.field242 > var2) {
                this.field242 = var2;
            }
        }
        if (this.field242 > var2) {
            this.field242 -= (this.field242 - var2) * this.field388 / 1000 + this.field387;
            if (this.field242 < var2) {
                this.field242 = var2;
            }
        }
        if (this.field243 < var4) {
            this.field243 += (var4 - this.field243) * this.field388 / 1000 + this.field387;
            if (this.field243 > var4) {
                this.field243 = var4;
            }
        }
        if (this.field243 > var4) {
            this.field243 -= (this.field243 - var4) * this.field388 / 1000 + this.field387;
            if (this.field243 < var4) {
                this.field243 = var4;
            }
        }
        if (this.field244 < var3) {
            this.field244 += (var3 - this.field244) * this.field388 / 1000 + this.field387;
            if (this.field244 > var3) {
                this.field244 = var3;
            }
        }
        if (this.field244 > var3) {
            this.field244 -= (this.field244 - var3) * this.field388 / 1000 + this.field387;
            if (this.field244 < var3) {
                this.field244 = var3;
            }
        }
        int var5 = this.field136 * 128 + 64;
        int var6 = this.field137 * 128 + 64;
        int var7 = this.method97(var5, var6, (byte) -103, this.field307) - this.field138;
        int var8 = var5 - this.field242;
        int var9 = var7 - this.field243;
        int var10 = var6 - this.field244;
        int var11 = (int) Math.sqrt((double) (var8 * var8 + var10 * var10));
        if (arg0 >= 0 && arg0 <= 0) {
            int var12 = (int) (Math.atan2((double) var9, (double) var11) * 325.949D) & 2047;
            int var13 = (int) (Math.atan2((double) var8, (double) var10) * -325.949D) & 2047;
            if (var12 < 128) {
                var12 = 128;
            }
            if (var12 > 383) {
                var12 = 383;
            }
            if (this.field245 < var12) {
                this.field245 += (var12 - this.field245) * this.field140 / 1000 + this.field139;
                if (this.field245 > var12) {
                    this.field245 = var12;
                }
            }
            if (this.field245 > var12) {
                this.field245 -= (this.field245 - var12) * this.field140 / 1000 + this.field139;
                if (this.field245 < var12) {
                    this.field245 = var12;
                }
            }
            int var14 = var13 - this.field246;
            if (var14 > 1024) {
                var14 -= 2048;
            }
            if (var14 < -1024) {
                var14 += 2048;
            }
            if (var14 > 0) {
                this.field246 += this.field140 * var14 / 1000 + this.field139;
                this.field246 &= 2047;
            }
            if (var14 < 0) {
                this.field246 -= -var14 * this.field140 / 1000 + this.field139;
                this.field246 &= 2047;
            }
            int var15 = var13 - this.field246;
            if (var15 > 1024) {
                var15 -= 2048;
            }
            if (var15 < -1024) {
                var15 += 2048;
            }
            if (var15 < 0 && var14 > 0 || var15 > 0 && var14 < 0) {
                this.field246 = var13;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(Z)V")
    public final void method61(boolean arg0) {
        if (arg0) {
            this.field269 = -22;
        }
        if (this.field318 == 0) {
            int var2 = super.field1579;
            if (this.field255 == 1 && super.field1580 >= 516 && super.field1581 >= 160 && super.field1580 <= 765 && super.field1581 <= 205) {
                var2 = 0;
            }
            if (this.field498) {
                if (var2 != 1) {
                    int var3 = super.field1573;
                    int var4 = super.field1574;
                    if (this.field168 == 0) {
                        var3 -= 4;
                        var4 -= 4;
                    }
                    if (this.field168 == 1) {
                        var3 -= 553;
                        var4 -= 205;
                    }
                    if (this.field168 == 2) {
                        var3 -= 17;
                        var4 -= 357;
                    }
                    if (var3 < this.field169 - 10 || var3 > this.field171 + this.field169 + 10 || var4 < this.field170 - 10 || var4 > this.field172 + this.field170 + 10) {
                        this.field498 = false;
                        if (this.field168 == 1) {
                            this.field405 = true;
                        }
                        if (this.field168 == 2) {
                            this.field472 = true;
                        }
                    }
                }
                if (var2 == 1) {
                    int var5 = this.field169;
                    int var6 = this.field170;
                    int var7 = this.field171;
                    int var8 = super.field1580;
                    int var9 = super.field1581;
                    if (this.field168 == 0) {
                        var8 -= 4;
                        var9 -= 4;
                    }
                    if (this.field168 == 1) {
                        var8 -= 553;
                        var9 -= 205;
                    }
                    if (this.field168 == 2) {
                        var8 -= 17;
                        var9 -= 357;
                    }
                    int var10 = -1;
                    for (int var11 = 0; var11 < this.field439; ++var11) {
                        int var12 = (this.field439 - 1 - var11) * 15 + var6 + 31;
                        if (var8 > var5 && var8 < var5 + var7 && var9 > var12 - 13 && var9 < var12 + 3) {
                            var10 = var11;
                        }
                    }
                    if (var10 != -1) {
                        this.method143(true, var10);
                    }
                    this.field498 = false;
                    if (this.field168 == 1) {
                        this.field405 = true;
                    }
                    if (this.field168 == 2) {
                        this.field472 = true;
                        return;
                    }
                }
            } else {
                if (var2 == 1 && this.field439 > 0) {
                    int var13 = this.field264[this.field439 - 1];
                    if (var13 == 941 || var13 == 631 || var13 == 94 || var13 == 292 || var13 == 883 || var13 == 221 || var13 == 379 || var13 == 207 || var13 == 228 || var13 == 675 || var13 == 860 || var13 == 1826) {
                        int var14 = this.field262[this.field439 - 1];
                        int var15 = this.field263[this.field439 - 1];
                        class34 var16 = class34.method339(var15);
                        if (var16.field1028 || var16.field1011) {
                            this.field213 = false;
                            this.field468 = 0;
                            this.field316 = var15;
                            this.field317 = var14;
                            this.field318 = 2;
                            this.field319 = super.field1580;
                            this.field320 = super.field1581;
                            if (class34.method339(var15).field1052 == this.field329) {
                                this.field318 = 1;
                            }
                            if (class34.method339(var15).field1052 == this.field216) {
                                this.field318 = 3;
                            }
                            return;
                        }
                    }
                }
                if (var2 == 1 && (this.field419 == 1 || this.method50(this.field439 - 1, (byte) 119)) && this.field439 > 2) {
                    var2 = 2;
                }
                if (var2 == 1 && this.field439 > 0) {
                    this.method143(true, this.field439 - 1);
                }
                if (var2 != 2 || this.field439 <= 0) {
                    return;
                }
                this.method13(25871);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "o", descriptor = "(I)I")
    public final int method62(int arg0) {
        int var2 = 3;
        if (arg0 >= 5 && arg0 <= 5) {
            if (this.field245 < 310) {
                int var3 = this.field242 >> 7;
                int var4 = this.field244 >> 7;
                int var5 = field147.field1078 >> 7;
                int var6 = field147.field1079 >> 7;
                if ((this.field252[this.field307][var3][var4] & 4) != 0) {
                    var2 = this.field307;
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
                        if ((this.field252[this.field307][var3][var4] & 4) != 0) {
                            var2 = this.field307;
                        }
                        var10 += var9;
                        if (var10 >= 65536) {
                            var10 -= 65536;
                            if (var4 < var6) {
                                ++var4;
                            } else if (var4 > var6) {
                                --var4;
                            }
                            if ((this.field252[this.field307][var3][var4] & 4) != 0) {
                                var2 = this.field307;
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
                        if ((this.field252[this.field307][var3][var4] & 4) != 0) {
                            var2 = this.field307;
                        }
                        var12 += var11;
                        if (var12 >= 65536) {
                            var12 -= 65536;
                            if (var3 < var5) {
                                ++var3;
                            } else if (var3 > var5) {
                                --var3;
                            }
                            if ((this.field252[this.field307][var3][var4] & 4) != 0) {
                                var2 = this.field307;
                            }
                        }
                    }
                }
            }
            if ((this.field252[this.field307][field147.field1078 >> 7][field147.field1079 >> 7] & 4) != 0) {
                var2 = this.field307;
            }
            return var2;
        } else {
            return this.field545;
        }
    }

    @OriginalMember(owner = "client!client", name = "p", descriptor = "(I)I")
    public final int method63(int arg0) {
        int var2 = this.method97(this.field242, this.field244, (byte) -103, this.field307);
        if (arg0 >= 0) {
            this.field164 = null;
        }
        return var2 - this.field243 < 800 && (this.field252[this.field307][this.field242 >> 7][this.field244 >> 7] & 4) != 0 ? this.field307 : 3;
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(Z)V")
    public final void method64(boolean arg0) {
        ++this.field394;
        if (arg0) {
            this.field107 = -472;
        }
        this.method133(true, (byte) -75);
        this.method80(this.field206, true);
        this.method133(false, (byte) -75);
        this.method80(this.field206, false);
        this.method93(this.field491);
        this.method102(this.field545);
        if (!this.field420) {
            int var2 = this.field283;
            if (this.field291 / 256 > var2) {
                var2 = this.field291 / 256;
            }
            if (this.field421[4] && this.field167[4] + 128 > var2) {
                var2 = this.field167[4] + 128;
            }
            int var3 = this.field284 + this.field151 & 2047;
            this.method12(this.method97(field147.field1078, field147.field1079, (byte) -103, this.field307) - 50, var3, this.field295, var2 * 3 + 600, true, this.field296, var2);
        }
        int var4;
        if (!this.field420) {
            var4 = this.method62(5);
        } else {
            var4 = this.method63(-61);
        }
        int var5 = this.field242;
        int var6 = this.field243;
        int var7 = this.field244;
        int var8 = this.field245;
        int var9 = this.field246;
        for (int var10 = 0; var10 < 5; ++var10) {
            if (this.field421[var10]) {
                int var12 = (int) (Math.random() * (double) (this.field303[var10] * 2 + 1) - (double) this.field303[var10] + Math.sin((double) this.field289[var10] / 100.0D * (double) this.field371[var10]) * (double) this.field167[var10]);
                if (var10 == 0) {
                    this.field242 += var12;
                }
                if (var10 == 1) {
                    this.field243 += var12;
                }
                if (var10 == 2) {
                    this.field244 += var12;
                }
                if (var10 == 3) {
                    this.field246 = this.field246 + var12 & 2047;
                }
                if (var10 == 4) {
                    this.field245 += var12;
                    if (this.field245 < 128) {
                        this.field245 = 128;
                    }
                    if (this.field245 > 383) {
                        this.field245 = 383;
                    }
                }
            }
        }
        int var11 = class48.field1340;
        class19.field868 = true;
        class19.field871 = 0;
        class19.field869 = super.field1573 - 4;
        class19.field870 = super.field1574 - 4;
        class8.method162(this.field334);
        this.field78.method228((byte) -125, this.field244, this.field246, this.field243, this.field242, this.field245, var4);
        this.field78.method203(this.field187);
        this.method115(0);
        this.method32(-274);
        this.method130((byte) 7, var11);
        this.method52(42641);
        this.field542.method317(796, 4, 4, super.field1565);
        this.field242 = var5;
        this.field243 = var6;
        this.field244 = var7;
        this.field245 = var8;
        this.field246 = var9;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(LNHFASBOX;IIII)V")
    public final void method65(class34 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0.field1017 == 0 && arg0.field1065 != null) {
            if (!arg0.field1007 || this.field321 == arg0.field1040 || this.field214 == arg0.field1040 || this.field76 == arg0.field1040) {
                int var6 = class8.field586;
                int var7 = class8.field584;
                int var8 = class8.field587;
                int var9 = class8.field585;
                int var10 = 38 / arg4;
                class8.method161(arg0.field1020 + arg2, arg2, arg0.field995 + arg3, this.field162, arg3);
                int var11 = arg0.field1065.length;
                for (int var12 = 0; var12 < var11; ++var12) {
                    int var13 = arg0.field994[var12] + arg2;
                    int var14 = arg0.field1023[var12] + arg3 - arg1;
                    class34 var15 = class34.method339(arg0.field1065[var12]);
                    int var16 = var15.field1035 + var13;
                    int var17 = var15.field1022 + var14;
                    if (var15.field1012 > 0) {
                        this.method55(-21060, var15);
                    }
                    if (var15.field1017 == 0) {
                        if (var15.field1044 > var15.field1027 - var15.field995) {
                            var15.field1044 = var15.field1027 - var15.field995;
                        }
                        if (var15.field1044 < 0) {
                            var15.field1044 = 0;
                        }
                        this.method65(var15, var15.field1044, var16, var17, 284);
                        if (var15.field1027 > var15.field995) {
                            this.method148(var17, this.field423, var15.field1027, var15.field1020 + var16, var15.field995, var15.field1044);
                        }
                    } else if (var15.field1017 != 1) {
                        if (var15.field1017 == 2) {
                            int var18 = 0;
                            for (int var19 = 0; var19 < var15.field995; ++var19) {
                                for (int var20 = 0; var20 < var15.field1020; ++var20) {
                                    int var21 = (var15.field1057 + 32) * var20 + var16;
                                    int var22 = (var15.field1001 + 32) * var19 + var17;
                                    if (var18 < 20) {
                                        var21 += var15.field1021[var18];
                                        var22 += var15.field1004[var18];
                                    }
                                    if (var15.field1061[var18] <= 0) {
                                        if (var15.field1063 != null && var18 < 20) {
                                            class37 var31 = var15.field1063[var18];
                                            if (var31 != null) {
                                                var31.method351(var22, var21, (byte) 0);
                                            }
                                        }
                                    } else {
                                        int var23 = 0;
                                        int var24 = 0;
                                        int var25 = var15.field1061[var18] - 1;
                                        if (var21 > class8.field586 - 32 && var21 < class8.field587 && var22 > class8.field584 - 32 && var22 < class8.field585 || this.field318 != 0 && this.field317 == var18) {
                                            int var26 = 0;
                                            if (this.field513 == 1 && this.field514 == var18 && this.field515 == var15.field1040) {
                                                var26 = 16777215;
                                            }
                                            class37 var27 = class56.method546(true, var15.field1048[var18], var25, var26);
                                            if (var27 != null) {
                                                if (this.field318 != 0 && this.field317 == var18 && this.field316 == var15.field1040) {
                                                    var23 = super.field1573 - this.field319;
                                                    var24 = super.field1574 - this.field320;
                                                    if (var23 < 5 && var23 > -5) {
                                                        var23 = 0;
                                                    }
                                                    if (var24 < 5 && var24 > -5) {
                                                        var24 = 0;
                                                    }
                                                    if (this.field468 < 5) {
                                                        var23 = 0;
                                                        var24 = 0;
                                                    }
                                                    var27.method353(36640, var22 + var24, var21 + var23, 128);
                                                    if (var22 + var24 < class8.field584 && arg0.field1044 > 0) {
                                                        int var28 = (class8.field584 - var22 - var24) * this.field324 / 3;
                                                        if (var28 > this.field324 * 10) {
                                                            var28 = this.field324 * 10;
                                                        }
                                                        if (var28 > arg0.field1044) {
                                                            var28 = arg0.field1044;
                                                        }
                                                        arg0.field1044 -= var28;
                                                        this.field320 += var28;
                                                    }
                                                    if (var22 + var24 + 32 > class8.field585 && arg0.field1044 < arg0.field1027 - arg0.field995) {
                                                        int var29 = (var22 + var24 + 32 - class8.field585) * this.field324 / 3;
                                                        if (var29 > this.field324 * 10) {
                                                            var29 = this.field324 * 10;
                                                        }
                                                        if (var29 > arg0.field1027 - arg0.field995 - arg0.field1044) {
                                                            var29 = arg0.field1027 - arg0.field995 - arg0.field1044;
                                                        }
                                                        arg0.field1044 += var29;
                                                        this.field320 -= var29;
                                                    }
                                                } else if (this.field91 != 0 && this.field90 == var18 && this.field89 == var15.field1040) {
                                                    var27.method353(36640, var22, var21, 128);
                                                } else {
                                                    var27.method351(var22, var21, (byte) 0);
                                                }
                                                if (var27.field1151 == 33 || var15.field1048[var18] != 1) {
                                                    int var30 = var15.field1048[var18];
                                                    this.field506.method364(var22 + 10 + var24, 0, (byte) -120, var21 + 1 + var23, method83(var30, -39512));
                                                    this.field506.method364(var22 + 9 + var24, 16776960, (byte) -120, var21 + var23, method83(var30, -39512));
                                                }
                                            }
                                        }
                                    }
                                    ++var18;
                                }
                            }
                        } else if (var15.field1017 == 3) {
                            boolean var32 = false;
                            if (this.field76 == var15.field1040 || this.field214 == var15.field1040 || this.field321 == var15.field1040) {
                                var32 = true;
                            }
                            int var33;
                            if (this.method137(var15, true)) {
                                var33 = var15.field999;
                                if (var32 && var15.field1041 != 0) {
                                    var33 = var15.field1041;
                                }
                            } else {
                                var33 = var15.field1005;
                                if (var32 && var15.field1058 != 0) {
                                    var33 = var15.field1058;
                                }
                            }
                            if (var15.field1002 == 0) {
                                if (var15.field1050) {
                                    class8.method164(var33, 21899, var15.field995, var16, var15.field1020, var17);
                                } else {
                                    class8.method165(var33, var16, -13126, var17, var15.field995, var15.field1020);
                                }
                            } else if (var15.field1050) {
                                class8.method163(this.field383, 256 - (var15.field1002 & 255), var17, var15.field995, var15.field1020, var16, var33);
                            } else {
                                class8.method166(256 - (var15.field1002 & 255), var33, true, var16, var17, var15.field1020, var15.field995);
                            }
                        } else if (var15.field1017 == 4) {
                            class38 var34 = var15.field1026;
                            String var35 = var15.field1010;
                            boolean var36 = false;
                            if (this.field76 == var15.field1040 || this.field214 == var15.field1040 || this.field321 == var15.field1040) {
                                var36 = true;
                            }
                            int var37;
                            if (this.method137(var15, true)) {
                                var37 = var15.field999;
                                if (var36 && var15.field1041 != 0) {
                                    var37 = var15.field1041;
                                }
                                if (var15.field1024.length() > 0) {
                                    var35 = var15.field1024;
                                }
                            } else {
                                var37 = var15.field1005;
                                if (var36 && var15.field1058 != 0) {
                                    var37 = var15.field1058;
                                }
                            }
                            if (var15.field1051 == 6 && this.field249) {
                                var35 = "Please wait...";
                                var37 = var15.field1005;
                            }
                            if (class8.field582 == 479) {
                                if (var37 == 16776960) {
                                    var37 = 255;
                                }
                                if (var37 == 49152) {
                                    var37 = 16777215;
                                }
                            }
                            int var38 = var34.field1165 + var17;
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
                                                                        var35 = var35.substring(0, var43) + this.method15(-45195, this.method41(4, 0, var15)) + var35.substring(var43 + 2);
                                                                    }
                                                                }
                                                                var35 = var35.substring(0, var42) + this.method15(-45195, this.method41(3, 0, var15)) + var35.substring(var42 + 2);
                                                            }
                                                        }
                                                        var35 = var35.substring(0, var41) + this.method15(-45195, this.method41(2, 0, var15)) + var35.substring(var41 + 2);
                                                    }
                                                }
                                                var35 = var35.substring(0, var40) + this.method15(-45195, this.method41(1, 0, var15)) + var35.substring(var40 + 2);
                                            }
                                        }
                                        var35 = var35.substring(0, var39) + this.method15(-45195, this.method41(0, 0, var15)) + var35.substring(var39 + 2);
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
                                if (var15.field1009) {
                                    var34.method361(var15.field1020 / 2 + var16, var38, var45, -40792, var15.field1019, var37);
                                } else {
                                    var34.method368(var37, var15.field1019, var45, -21100, var16, var38);
                                }
                                var38 += var34.field1165;
                            }
                        } else if (var15.field1017 == 5) {
                            class37 var46;
                            if (this.method137(var15, true)) {
                                var46 = var15.field1056;
                            } else {
                                var46 = var15.field1025;
                            }
                            if (var46 != null) {
                                var46.method351(var17, var16, (byte) 0);
                            }
                        } else if (var15.field1017 == 6) {
                            int var47 = class48.field1325;
                            int var48 = class48.field1326;
                            class48.field1325 = var15.field1020 / 2 + var16;
                            class48.field1326 = var15.field995 / 2 + var17;
                            int var49 = class48.field1329[var15.field1015] * var15.field1014 >> 16;
                            int var50 = class48.field1330[var15.field1015] * var15.field1014 >> 16;
                            boolean var51 = this.method137(var15, true);
                            int var52;
                            if (var51) {
                                var52 = var15.field1054;
                            } else {
                                var52 = var15.field1053;
                            }
                            class19 var53;
                            if (var52 == -1) {
                                var53 = var15.method333(this.field375, var51, -1, -1);
                            } else {
                                class26 var54 = class26.field921[var52];
                                var53 = var15.method333(this.field375, var51, var54.field923[var15.field1055], var54.field924[var15.field1055]);
                            }
                            if (var53 != null) {
                                var53.method294(0, var15.field1016, 0, var15.field1015, 0, var49, var50);
                            }
                            class48.field1325 = var47;
                            class48.field1326 = var48;
                        } else {
                            if (var15.field1017 == 7) {
                                class38 var55 = var15.field1026;
                                int var56 = 0;
                                for (int var57 = 0; var57 < var15.field995; ++var57) {
                                    for (int var58 = 0; var58 < var15.field1020; ++var58) {
                                        if (var15.field1061[var56] > 0) {
                                            class56 var59 = class56.method544(var15.field1061[var56] - 1);
                                            String var60 = String.valueOf(var59.field1496);
                                            if (var59.field1510 || var15.field1048[var56] != 1) {
                                                var60 = var60 + " x" + method48(var15.field1048[var56], 0);
                                            }
                                            int var61 = (var15.field1057 + 115) * var58 + var16;
                                            int var62 = (var15.field1001 + 12) * var57 + var17;
                                            if (var15.field1009) {
                                                var55.method361(var15.field1020 / 2 + var61, var62, var60, -40792, var15.field1019, var15.field1005);
                                            } else {
                                                var55.method368(var15.field1005, var15.field1019, var60, -21100, var61, var62);
                                            }
                                        }
                                        ++var56;
                                    }
                                }
                            }
                            if (var15.field1017 == 8 && (this.field333 == var15.field1040 || this.field248 == var15.field1040 || this.field525 == var15.field1040) && this.field404 == 100) {
                                int var63 = 0;
                                int var64 = 0;
                                class38 var65 = this.field507;
                                String var66 = var15.field1010;
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
                                    int var75 = var65.method362(var74, 443);
                                    if (var75 > var63) {
                                        var63 = var75;
                                    }
                                    var64 += var65.field1165 + 1;
                                }
                                var63 += 6;
                                var64 += 7;
                                int var67 = var15.field1020 + var16 - 5 - var63;
                                int var68 = var15.field995 + var17 + 5;
                                if (var67 < var16 + 5) {
                                    var67 = var16 + 5;
                                }
                                if (var63 + var67 > arg0.field1020 + arg2) {
                                    var67 = arg0.field1020 + arg2 - var63;
                                }
                                if (var64 + var68 > arg0.field995 + arg3) {
                                    var68 = arg0.field995 + arg3 - var64;
                                }
                                class8.method164(16777120, 21899, var64, var67, var63, var68);
                                class8.method165(0, var67, -13126, var68, var64, var63);
                                String var69 = var15.field1010;
                                int var70 = var65.field1165 + var68 + 2;
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
                                    var65.method368(0, false, var72, -21100, var67 + 3, var70);
                                    var70 += var65.field1165 + 1;
                                }
                            }
                        }
                    }
                }
                class8.method161(var8, var6, var9, this.field162, var7);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(BJ)V")
    public final void method66(byte arg0, long arg1) {
        if (arg1 != 0L) {
            for (int var4 = 0; var4 < this.field390; ++var4) {
                if (this.field488[var4] == arg1) {
                    --this.field390;
                    this.field405 = true;
                    for (int var5 = var4; var5 < this.field390; ++var5) {
                        this.field489[var5] = this.field489[var5 + 1];
                        this.field118[var5] = this.field118[var5 + 1];
                        this.field488[var5] = this.field488[var5 + 1];
                    }
                    this.field395.method450(7, 183);
                    this.field395.method457(arg1, 601);
                    break;
                }
            }
            if (arg0 != -128) {
                this.field383 = !this.field383;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(II)V")
    public final void method67(int arg0, int arg1) {
        class11 var3 = this.field164[this.field307][arg0][arg1];
        if (var3 == null) {
            this.field78.method210(this.field307, arg0, arg1);
        } else {
            int var4 = -99999999;
            class61 var5 = null;
            for (class61 var6 = (class61) var3.method181(); var6 != null; var6 = (class61) var3.method183((byte) 6)) {
                class56 var11 = class56.method544(var6.field1606);
                int var12 = var11.field1484;
                if (var11.field1510) {
                    var12 = (var6.field1608 + 1) * var12;
                }
                if (var12 > var4) {
                    var4 = var12;
                    var5 = var6;
                }
            }
            var3.method179(var5, -6203);
            class61 var7 = null;
            class61 var8 = null;
            for (class61 var9 = (class61) var3.method181(); var9 != null; var9 = (class61) var3.method183((byte) 6)) {
                if (var5.field1606 != var9.field1606 && var7 == null) {
                    var7 = var9;
                }
                if (var5.field1606 != var9.field1606 && var7.field1606 != var9.field1606 && var8 == null) {
                    var8 = var9;
                }
            }
            int var10 = (arg1 << 7) + arg0 + 1610612736;
            this.field78.method196(var8, var5, (byte) -36, arg1, this.field307, arg0, this.method97(arg0 * 128 + 64, arg1 * 128 + 64, (byte) -103, this.field307), var10, var7);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIILjava/lang/String;Ljava/lang/String;)LWEMOPWVJ;")
    public final class62 method68(int arg0, int arg1, int arg2, int arg3, String arg4, String arg5) {
        byte[] var7 = null;
        int var8 = 82 / arg2;
        int var9 = 5;
        try {
            if (this.field328[0] != null) {
                var7 = this.field328[0].method582(-13096, arg1);
            }
        } catch (Exception var31) {
        }
        if (var7 != null) {
            this.field119.reset();
            this.field119.update(var7);
            int var10 = (int) this.field119.getValue();
            if (arg3 != var10) {
                var7 = null;
            }
        }
        if (var7 != null) {
            return new class62(var7, this.field269);
        } else {
            int var12 = 0;
            while (var7 == null) {
                String var13 = "Unknown error";
                this.method141(true, arg0, "Requesting " + arg5);
                Object var14 = null;
                try {
                    int var15 = 0;
                    DataInputStream var16 = this.method19(arg4 + arg3);
                    byte[] var17 = new byte[6];
                    var16.readFully(var17, 0, 6);
                    class52 var18 = new class52(var17, true);
                    var18.field1434 = 3;
                    int var19 = var18.method465() + 6;
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
                            this.method141(true, arg0, "Loading " + arg5 + " - " + var24 + "%");
                        }
                        var15 = var24;
                    }
                    var16.close();
                    try {
                        if (this.field328[0] != null) {
                            this.field328[0].method583(arg1, var7.length, 72, var7);
                        }
                    } catch (Exception var30) {
                        this.field328[0] = null;
                    }
                    if (var7 != null) {
                        this.field119.reset();
                        this.field119.update(var7);
                        int var25 = (int) this.field119.getValue();
                        if (arg3 != var25) {
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
                            this.method141(true, arg0, "Game updated - please reload page");
                            var27 = 10;
                        } else {
                            this.method141(true, arg0, var13 + " - Retrying in " + var27);
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
                    this.field188 = !this.field188;
                }
            }
            return new class62(var7, this.field269);
        }
    }

    @OriginalMember(owner = "client!client", name = "q", descriptor = "(I)V")
    public final void method69(int arg0) {
        short var2 = 256;
        if (this.field241 != arg0) {
            this.field466 = !this.field466;
        }
        for (int var3 = 10; var3 < 117; ++var3) {
            int var18 = (int) (Math.random() * 100.0D);
            if (var18 < 50) {
                this.field199[(var2 - 2 << 7) + var3] = 255;
            }
        }
        for (int var4 = 0; var4 < 100; ++var4) {
            int var15 = (int) (Math.random() * 124.0D) + 2;
            int var16 = (int) (Math.random() * 128.0D) + 128;
            int var17 = (var16 << 7) + var15;
            this.field199[var17] = 192;
        }
        for (int var5 = 1; var5 < var2 - 1; ++var5) {
            for (int var13 = 1; var13 < 127; ++var13) {
                int var14 = (var5 << 7) + var13;
                this.field200[var14] = (this.field199[var14 - 1] + this.field199[var14 + 1] + this.field199[var14 - 128] + this.field199[var14 + 128]) / 4;
            }
        }
        this.field518 += 128;
        if (this.field518 > this.field181.length) {
            this.field518 -= this.field181.length;
            int var6 = (int) (Math.random() * 12.0D);
            this.method23(this.field323[var6], 0);
        }
        for (int var7 = 1; var7 < var2 - 1; ++var7) {
            for (int var10 = 1; var10 < 127; ++var10) {
                int var11 = (var7 << 7) + var10;
                int var12 = this.field200[var11 + 128] - this.field181[this.field518 + var11 & this.field181.length - 1] / 5;
                if (var12 < 0) {
                    var12 = 0;
                }
                this.field199[var11] = var12;
            }
        }
        for (int var8 = 0; var8 < var2 - 1; ++var8) {
            this.field497[var8] = this.field497[var8 + 1];
        }
        this.field497[var2 - 1] = (int) (Math.sin((double) field346 / 14.0D) * 16.0D + Math.sin((double) field346 / 15.0D) * 14.0D + Math.sin((double) field346 / 16.0D) * 12.0D);
        if (this.field305 > 0) {
            this.field305 -= 4;
        }
        if (this.field306 > 0) {
            this.field306 -= 4;
        }
        if (this.field305 == 0 && this.field306 == 0) {
            int var9 = (int) (Math.random() * 2000.0D);
            if (var9 == 0) {
                this.field305 = 1024;
            }
            if (var9 == 1) {
                this.field306 = 1024;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(BLNNWGJIGN;I)V")
    public final void method70(byte arg0, class35 arg1, int arg2) {
        if (arg0 == -99) {
            this.method71(arg1.field1079, arg2, 0, arg1.field1078);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(IIII)V")
    public final void method71(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 >= 128 && arg0 >= 128 && arg3 <= 13056 && arg0 <= 13056) {
            int var5 = this.method97(arg3, arg0, (byte) -103, this.field307) - arg1;
            int var6 = arg3 - this.field242;
            int var7 = var5 - this.field243;
            int var8 = arg0 - this.field244;
            int var9 = class19.field873[this.field245];
            int var10 = class19.field874[this.field245];
            int var11 = class19.field873[this.field246];
            int var12 = class19.field874[this.field246];
            int var13 = var6 * var12 + var8 * var11 >> 16;
            int var14 = var8 * var12 - var6 * var11 >> 16;
            this.field366 += arg2;
            int var16 = var7 * var10 - var9 * var14 >> 16;
            int var17 = var7 * var9 + var10 * var14 >> 16;
            if (var17 >= 50) {
                this.field437 = (var13 << 9) / var17 + class48.field1325;
                this.field438 = (var16 << 9) / var17 + class48.field1326;
            } else {
                this.field437 = -1;
                this.field438 = -1;
            }
        } else {
            this.field437 = -1;
            this.field438 = -1;
        }
    }

    @OriginalMember(owner = "client!client", name = "r", descriptor = "(I)V")
    public final void method72(int arg0) {
        this.field331 = new class72(this.field325, "titlebox", 0);
        if (arg0 < 6 || arg0 > 6) {
            field120 = 432;
        }
        this.field332 = new class72(this.field325, "titlebutton", 0);
        this.field323 = new class72[12];
        for (int var2 = 0; var2 < 12; ++var2) {
            this.field323[var2] = new class72(this.field325, "runes", var2);
        }
        this.field217 = new class37(128, 265);
        this.field218 = new class37(128, 265);
        for (int var3 = 0; var3 < 33920; ++var3) {
            this.field217.field1146[var3] = this.field230.field914[var3];
        }
        for (int var4 = 0; var4 < 33920; ++var4) {
            this.field218.field1146[var4] = this.field231.field914[var4];
        }
        this.field449 = new int[256];
        for (int var5 = 0; var5 < 64; ++var5) {
            this.field449[var5] = var5 * 262144;
        }
        for (int var6 = 0; var6 < 64; ++var6) {
            this.field449[var6 + 64] = var6 * 1024 + 16711680;
        }
        for (int var7 = 0; var7 < 64; ++var7) {
            this.field449[var7 + 128] = var7 * 4 + 16776960;
        }
        for (int var8 = 0; var8 < 64; ++var8) {
            this.field449[var8 + 192] = 16777215;
        }
        this.field450 = new int[256];
        for (int var9 = 0; var9 < 64; ++var9) {
            this.field450[var9] = var9 * 1024;
        }
        for (int var10 = 0; var10 < 64; ++var10) {
            this.field450[var10 + 64] = var10 * 4 + 65280;
        }
        for (int var11 = 0; var11 < 64; ++var11) {
            this.field450[var11 + 128] = var11 * 262144 + 65535;
        }
        for (int var12 = 0; var12 < 64; ++var12) {
            this.field450[var12 + 192] = 16777215;
        }
        this.field451 = new int[256];
        for (int var13 = 0; var13 < 64; ++var13) {
            this.field451[var13] = var13 * 4;
        }
        for (int var14 = 0; var14 < 64; ++var14) {
            this.field451[var14 + 64] = var14 * 262144 + 255;
        }
        for (int var15 = 0; var15 < 64; ++var15) {
            this.field451[var15 + 128] = var15 * 1024 + 16711935;
        }
        for (int var16 = 0; var16 < 64; ++var16) {
            this.field451[var16 + 192] = 16777215;
        }
        this.field448 = new int[256];
        this.field181 = new int[32768];
        this.field182 = new int[32768];
        this.method23((class72) null, 0);
        this.field199 = new int[32768];
        this.field200 = new int[32768];
        this.method141(true, 10, "Connecting to fileserver");
        if (!this.field95) {
            this.field461 = true;
            this.field95 = true;
            this.method87(this, 2);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIZ)V")
    public final void method73(int arg0, int arg1, boolean arg2) {
        signlink.midivol = arg1;
        int var4 = 15 / arg0;
        if (arg2) {
            signlink.midi = "voladjust";
        }
    }

    @OriginalMember(owner = "client!client", name = "s", descriptor = "(I)V")
    public final void method74(int arg0) {
        if (arg0 >= 2 && arg0 <= 2) {
            for (int var2 = 0; var2 < this.field215; ++var2) {
                if (this.field352[var2] <= 0) {
                    boolean var3 = false;
                    try {
                        if (this.field282[var2] == this.field534 && this.field410[var2] == this.field401) {
                            if (!this.method58((byte) 92)) {
                                var3 = true;
                            }
                        } else {
                            class52 var4 = class23.method309(-26286, this.field282[var2], this.field410[var2]);
                            if (System.currentTimeMillis() + (long) (var4.field1434 / 22) > (long) (this.field407 / 22) + this.field192) {
                                this.field407 = var4.field1434;
                                this.field192 = System.currentTimeMillis();
                                if (this.method35(var4.field1434, -45954, var4.field1433)) {
                                    this.field534 = this.field282[var2];
                                    this.field401 = this.field410[var2];
                                } else {
                                    var3 = true;
                                }
                            }
                        }
                    } catch (Exception var7) {
                        if (signlink.reporterror) {
                            this.field395.method450(7, 252);
                            this.field395.method452(this.field282[var2] & 32767);
                        } else {
                            this.field395.method450(7, 252);
                            this.field395.method452(-1);
                        }
                    }
                    if (var3 && this.field352[var2] != -5) {
                        this.field352[var2] = -5;
                    } else {
                        --this.field215;
                        for (int var6 = var2; var6 < this.field215; ++var6) {
                            this.field282[var6] = this.field282[var6 + 1];
                            this.field410[var6] = this.field410[var6 + 1];
                            this.field352[var6] = this.field352[var6 + 1];
                        }
                        --var2;
                    }
                } else {
                    int var10002 = this.field352[var2]--;
                }
            }
            if (this.field330 > 0) {
                this.field330 -= 20;
                if (this.field330 < 0) {
                    this.field330 = 0;
                }
                if (this.field330 == 0 && this.field158 && !field505) {
                    this.field434 = this.field372;
                    this.field435 = true;
                    this.field530.method245(2, this.field434);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(LSVWJKJVI;ZI)V")
    private final void method75(class52 arg0, boolean arg1, int arg2) {
        if (!arg1) {
            for (int var4 = 0; var4 < this.field478; ++var4) {
                int var5 = this.field479[var4];
                class27 var6 = this.field475[var5];
                int var7 = arg0.method461();
                if ((var7 & 16) != 0) {
                    var7 += arg0.method461() << 8;
                }
                this.method36(var5, arg0, var6, var7, 85);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(BI)V")
    public final void method76(byte arg0, int arg1) {
        int[] var3 = this.field427.field1146;
        int var4 = var3.length;
        for (int var5 = 0; var5 < var4; ++var5) {
            var3[var5] = 0;
        }
        for (int var6 = 1; var6 < 103; ++var6) {
            int var23 = (103 - var6) * 512 * 4 + 24628;
            for (int var24 = 1; var24 < 103; ++var24) {
                if ((this.field252[arg1][var24][var6] & 24) == 0) {
                    this.field78.method224(var3, var23, 512, arg1, var24, var6);
                }
                if (arg1 < 3 && (this.field252[arg1 + 1][var24][var6] & 8) != 0) {
                    this.field78.method224(var3, var23, 512, arg1 + 1, var24, var6);
                }
                var23 += 4;
            }
        }
        if (this.field527 != arg0) {
            this.field367 = this.field177.method461();
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        this.field427.method346(-439);
        for (int var9 = 1; var9 < 103; ++var9) {
            for (int var22 = 1; var22 < 103; ++var22) {
                if ((this.field252[arg1][var22][var9] & 24) == 0) {
                    this.method25(var9, arg1, var7, var8, 1, var22);
                }
                if (arg1 < 3 && (this.field252[arg1 + 1][var22][var9] & 8) != 0) {
                    this.method25(var9, arg1 + 1, var7, var8, 1, var22);
                }
            }
        }
        if (this.field542 != null) {
            this.field542.method316(-439);
            class48.field1331 = this.field185;
        }
        this.field462 = 0;
        for (int var10 = 0; var10 < 104; ++var10) {
            for (int var11 = 0; var11 < 104; ++var11) {
                int var12 = this.field78.method218(this.field307, var10, var11);
                if (var12 != 0) {
                    int var13 = var12 >> 14 & 32767;
                    int var14 = class47.method417(var13).field1316;
                    if (var14 >= 0) {
                        int var15 = var10;
                        int var16 = var11;
                        if (var14 != 22 && var14 != 29 && var14 != 34 && var14 != 36 && var14 != 46 && var14 != 47 && var14 != 48) {
                            byte var17 = 104;
                            byte var18 = 104;
                            int[][] var19 = this.field408[this.field307].field1193;
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
                        this.field226[this.field462] = this.field373[var14];
                        this.field463[this.field462] = var15;
                        this.field464[this.field462] = var16;
                        ++this.field462;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
    public final void method77(boolean arg0) {
        if (arg0) {
            this.method155();
        }
        if (!this.field381 && !this.field191 && !this.field175) {
            ++field500;
            if (!this.field355) {
                this.method101(false, -8466);
            } else {
                this.method110((byte) 97);
            }
            this.field433 = 0;
        } else {
            this.method54(field120);
        }
    }

    @OriginalMember(owner = "client!client", name = "t", descriptor = "(I)V")
    public final void method78(int arg0) {
        if (super.field1566 == null) {
            this.method144((byte) 62);
            this.field227 = null;
            this.field228 = null;
            this.field229 = null;
            this.field230 = null;
            this.field231 = null;
            this.field232 = null;
            this.field233 = null;
            this.field234 = null;
            this.field235 = null;
            this.field543 = null;
            if (arg0 >= 0) {
                this.field395.method451(221);
            }
            this.field541 = null;
            this.field540 = null;
            this.field542 = null;
            this.field485 = null;
            this.field486 = null;
            this.field487 = null;
            super.field1566 = new class25(this.method82(523), 0, 765, 503);
            this.field399 = true;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
    public final void method79(boolean arg0) {
        if (!arg0) {
            if (!this.field381 && !this.field191 && !this.field175) {
                ++field346;
                if (!this.field355) {
                    this.method100((byte) -4);
                } else {
                    this.method119(-236);
                }
                this.method121((byte) 108);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(BZ)V")
    public final void method80(byte arg0, boolean arg1) {
        if (arg0 != -120) {
            this.method155();
        }
        for (int var3 = 0; var3 < this.field195; ++var3) {
            class42 var4 = this.field194[this.field196[var3]];
            int var5 = (this.field196[var3] << 14) + 536870912;
            if (var4 != null && var4.method325(5) && var4.field1196.field1244 == arg1 && var4.field1196.method394(true)) {
                int var6 = var4.field1078 >> 7;
                int var7 = var4.field1079 >> 7;
                if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
                    if (var4.field1097 == 1 && (var4.field1078 & 127) == 64 && (var4.field1079 & 127) == 64) {
                        if (this.field440[var6][var7] == this.field394) {
                            continue;
                        }
                        this.field440[var6][var7] = this.field394;
                    }
                    if (!var4.field1196.field1212) {
                        var5 += Integer.MIN_VALUE;
                    }
                    this.field78.method200(this.method97(var4.field1078, var4.field1079, (byte) -103, this.field307), var4.field1079, (byte) 2, this.field307, var4, var4.field1093, var4.field1080, var5, (var4.field1097 - 1) * 64 + 60, var4.field1078);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(B)V")
    public void method81(byte arg0) {
        System.out.println("============");
        System.out.println("flame-cycle:" + this.field102);
        if (arg0 != 7) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        if (this.field530 != null) {
            System.out.println("Od-cycle:" + this.field530.field758);
        }
        System.out.println("loop-cycle:" + field346);
        System.out.println("draw-cycle:" + field500);
        System.out.println("ptype:" + this.field367);
        System.out.println("psize:" + this.field366);
        if (this.field74 != null) {
            this.field74.method412(this.field338);
        }
        super.field1562 = true;
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(I)Ljava/awt/Component;")
    public final Component method82(int arg0) {
        int var2 = 14 / arg0;
        if (signlink.mainapp != null) {
            return signlink.mainapp;
        } else {
            return super.field1568 != null ? super.field1568 : this;
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(II)Ljava/lang/String;")
    private static final String method83(int arg0, int arg1) {
        if (arg1 != -39512) {
            field347 = -324;
        }
        if (arg0 < 100000) {
            return String.valueOf(arg0);
        } else {
            return arg0 < 10000000 ? arg0 / 1000 + "K" : arg0 / 1000000 + "M";
        }
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(Z)V")
    public final void method84(boolean arg0) {
        if (this.field318 == 0) {
            this.field441[0] = "Cancel";
            this.field264[0] = 1467;
            if (!arg0) {
                this.field334 = this.field482.method375();
            }
            this.field439 = 1;
            if (this.field432 != -1) {
                this.field144 = 0;
                this.field431 = 0;
                this.method42(super.field1573, 0, super.field1574, class34.method339(this.field432), 0, false, 0, 0);
                if (this.field321 != this.field144) {
                    this.field321 = this.field144;
                }
                if (this.field525 != this.field431) {
                    this.field525 = this.field431;
                }
            } else {
                this.method118(0);
                this.field144 = 0;
                this.field431 = 0;
                if (super.field1573 > 4 && super.field1574 > 4 && super.field1573 < 516 && super.field1574 < 338) {
                    if (this.field329 != -1) {
                        this.method42(super.field1573, 0, super.field1574, class34.method339(this.field329), 4, false, 0, 4);
                    } else {
                        this.method51(-8207);
                    }
                }
                if (this.field321 != this.field144) {
                    this.field321 = this.field144;
                }
                if (this.field525 != this.field431) {
                    this.field525 = this.field431;
                }
                this.field144 = 0;
                this.field431 = 0;
                if (super.field1573 > 553 && super.field1574 > 205 && super.field1573 < 743 && super.field1574 < 466) {
                    if (this.field268 != -1) {
                        this.method42(super.field1573, 0, super.field1574, class34.method339(this.field268), 205, false, 1, 553);
                    } else if (this.field535[this.field536] != -1) {
                        this.method42(super.field1573, 0, super.field1574, class34.method339(this.field535[this.field536]), 205, false, 1, 553);
                    }
                }
                if (this.field214 != this.field144) {
                    this.field405 = true;
                    this.field214 = this.field144;
                }
                if (this.field431 != this.field248) {
                    this.field405 = true;
                    this.field248 = this.field431;
                }
                this.field144 = 0;
                this.field431 = 0;
                if (super.field1573 > 17 && super.field1574 > 357 && super.field1573 < 496 && super.field1574 < 453) {
                    if (this.field216 != -1) {
                        this.method42(super.field1573, 0, super.field1574, class34.method339(this.field216), 357, false, 2, 17);
                    } else if (this.field400 != -1) {
                        this.method42(super.field1573, 0, super.field1574, class34.method339(this.field400), 357, false, 3, 17);
                    } else if (super.field1574 < 434 && super.field1573 < 426 && this.field414 == 0) {
                        this.method157(9, super.field1574 - 357, super.field1573 - 17);
                    }
                }
                if ((this.field216 != -1 || this.field400 != -1) && this.field76 != this.field144) {
                    this.field472 = true;
                    this.field76 = this.field144;
                }
                if ((this.field216 != -1 || this.field400 != -1) && this.field431 != this.field333) {
                    this.field472 = true;
                    this.field333 = this.field431;
                }
                boolean var2 = false;
                while (!var2) {
                    var2 = true;
                    for (int var3 = 0; var3 < this.field439 - 1; ++var3) {
                        if (this.field264[var3] < 1000 && this.field264[var3 + 1] > 1000) {
                            String var4 = this.field441[var3];
                            this.field441[var3] = this.field441[var3 + 1];
                            this.field441[var3 + 1] = var4;
                            int var5 = this.field264[var3];
                            this.field264[var3] = this.field264[var3 + 1];
                            this.field264[var3 + 1] = var5;
                            int var6 = this.field262[var3];
                            this.field262[var3] = this.field262[var3 + 1];
                            this.field262[var3 + 1] = var6;
                            int var7 = this.field263[var3];
                            this.field263[var3] = this.field263[var3 + 1];
                            this.field263[var3 + 1] = var7;
                            int var8 = this.field265[var3];
                            this.field265[var3] = this.field265[var3 + 1];
                            this.field265[var3 + 1] = var8;
                            var2 = false;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "u", descriptor = "(I)V")
    public final void method85(int arg0) {
        int var2 = 31 / arg0;
        try {
            int var3 = field147.field1078 + this.field277;
            int var4 = field147.field1079 + this.field219;
            if (this.field295 - var3 < -500 || this.field295 - var3 > 500 || this.field296 - var4 < -500 || this.field296 - var4 > 500) {
                this.field295 = var3;
                this.field296 = var4;
            }
            if (this.field295 != var3) {
                this.field295 += (var3 - this.field295) / 16;
            }
            if (this.field296 != var4) {
                this.field296 += (var4 - this.field296) / 16;
            }
            if (super.field1583[1] == 1) {
                this.field285 += (-24 - this.field285) / 2;
            } else if (super.field1583[2] == 1) {
                this.field285 += (24 - this.field285) / 2;
            } else {
                this.field285 /= 2;
            }
            if (super.field1583[3] == 1) {
                this.field286 += (12 - this.field286) / 2;
            } else if (super.field1583[4] == 1) {
                this.field286 += (-12 - this.field286) / 2;
            } else {
                this.field286 /= 2;
            }
            this.field284 = this.field285 / 2 + this.field284 & 2047;
            this.field283 += this.field286 / 2;
            if (this.field283 < 128) {
                this.field283 = 128;
            }
            if (this.field283 > 383) {
                this.field283 = 383;
            }
            int var5 = this.field295 >> 7;
            int var6 = this.field296 >> 7;
            int var7 = this.method97(this.field295, this.field296, (byte) -103, this.field307);
            int var8 = 0;
            if (var5 > 3 && var6 > 3 && var5 < 100 && var6 < 100) {
                for (int var9 = var5 - 4; var9 <= var5 + 4; ++var9) {
                    for (int var10 = var6 - 4; var10 <= var6 + 4; ++var10) {
                        int var11 = this.field307;
                        if (var11 < 3 && (this.field252[1][var9][var10] & 2) == 2) {
                            ++var11;
                        }
                        int var12 = var7 - this.field412[var11][var9][var10];
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
            if (var13 > this.field291) {
                this.field291 += (var13 - this.field291) / 24;
            } else if (var13 < this.field291) {
                this.field291 += (var13 - this.field291) / 80;
            }
        } catch (Exception var14) {
            signlink.reporterror("glfc_ex " + field147.field1078 + "," + field147.field1079 + "," + this.field295 + "," + this.field296 + "," + this.field141 + "," + this.field142 + "," + this.field96 + "," + this.field97);
            throw new RuntimeException("eek");
        }
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(Z)V")
    public final void method86(boolean arg0) {
        if (arg0) {
            this.field334 = -264;
        }
        for (int var2 = -1; var2 < this.field476; ++var2) {
            int var3;
            if (var2 == -1) {
                var3 = this.field474;
            } else {
                var3 = this.field477[var2];
            }
            class27 var4 = this.field475[var3];
            if (var4 != null) {
                this.method104(1, var4, 0);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
    public final void method87(Runnable arg0, int arg1) {
        if (arg1 > 10) {
            arg1 = 10;
        }
        if (signlink.mainapp != null) {
            signlink.startthread(arg0, arg1);
        } else {
            super.method87(arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(LSVWJKJVI;IB)V")
    private final void method88(class52 arg0, int arg1, byte arg2) {
        int var4 = arg0.method472(-34994, 8);
        if (arg2 == 8) {
            boolean var5 = false;
            if (var4 < this.field476) {
                for (int var6 = var4; var6 < this.field476; ++var6) {
                    this.field301[this.field300++] = this.field477[var6];
                }
            }
            if (var4 > this.field476) {
                signlink.reporterror(this.field378 + " Too many players");
                throw new RuntimeException("eek");
            } else {
                this.field476 = 0;
                for (int var7 = 0; var7 < var4; ++var7) {
                    int var8 = this.field477[var7];
                    class27 var9 = this.field475[var8];
                    int var10 = arg0.method472(-34994, 1);
                    if (var10 == 0) {
                        this.field477[this.field476++] = var8;
                        var9.field1108 = field346;
                    } else {
                        int var11 = arg0.method472(-34994, 2);
                        if (var11 == 0) {
                            this.field477[this.field476++] = var8;
                            var9.field1108 = field346;
                            this.field479[this.field478++] = var8;
                        } else if (var11 == 1) {
                            this.field477[this.field476++] = var8;
                            var9.field1108 = field346;
                            int var12 = arg0.method472(-34994, 3);
                            var9.method343(this.field189, var12, false);
                            int var13 = arg0.method472(-34994, 1);
                            if (var13 == 1) {
                                this.field479[this.field478++] = var8;
                            }
                        } else if (var11 == 2) {
                            this.field477[this.field476++] = var8;
                            var9.field1108 = field346;
                            int var14 = arg0.method472(-34994, 3);
                            var9.method343(this.field189, var14, true);
                            int var15 = arg0.method472(-34994, 3);
                            var9.method343(this.field189, var15, true);
                            int var16 = arg0.method472(-34994, 1);
                            if (var16 == 1) {
                                this.field479[this.field478++] = var8;
                            }
                        } else if (var11 == 3) {
                            this.field301[this.field300++] = var8;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(B)V")
    public final void method89(byte arg0) {
        if (arg0 != 84) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        int var3 = 5;
        this.field409[8] = 0;
        int var4 = 0;
        while (this.field409[8] == 0) {
            String var5 = "Unknown problem";
            this.method141(true, 20, "Connecting to web server");
            try {
                DataInputStream var6 = this.method19("crc" + (int) (Math.random() * 9.9999999E7D) + "-" + 362);
                class52 var7 = new class52(new byte[40], true);
                var6.readFully(var7.field1433, 0, 40);
                var6.close();
                for (int var8 = 0; var8 < 9; ++var8) {
                    this.field409[var8] = var7.method466();
                }
                int var9 = var7.method466();
                int var10 = 1234;
                for (int var11 = 0; var11 < 9; ++var11) {
                    var10 = (var10 << 1) + this.field409[var11];
                }
                if (var9 != var10) {
                    var5 = "checksum problem";
                    this.field409[8] = 0;
                }
            } catch (EOFException var14) {
                var5 = "EOF problem";
                this.field409[8] = 0;
            } catch (IOException var15) {
                var5 = "connection problem";
                this.field409[8] = 0;
            } catch (Exception var16) {
                var5 = "logic problem";
                this.field409[8] = 0;
                if (!signlink.reporterror) {
                    return;
                }
            }
            if (this.field409[8] == 0) {
                ++var4;
                for (int var12 = var3; var12 > 0; --var12) {
                    if (var4 >= 10) {
                        this.method141(true, 10, "Game updated - please reload page");
                        var12 = 10;
                    } else {
                        this.method141(true, 10, var5 + " - Will retry in " + var12 + " secs.");
                    }
                    try {
                        Thread.sleep(1000L);
                    } catch (Exception var13) {
                    }
                }
                var3 *= 2;
                if (var3 > 60) {
                    var3 = 60;
                }
                this.field188 = !this.field188;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "v", descriptor = "(I)V")
    public final void method90(int arg0) {
        this.field366 += arg0;
        if (this.field209 == 0) {
            if (super.field1579 == 1) {
                int var2 = super.field1580 - 25 - 550;
                int var3 = super.field1581 - 5 - 4;
                if (var2 >= 0 && var3 >= 0 && var2 < 146 && var3 < 151) {
                    var2 -= 73;
                    var3 -= 75;
                    int var4 = this.field284 + this.field271 & 2047;
                    int var5 = class48.field1329[var4];
                    int var6 = class48.field1330[var4];
                    int var7 = (this.field154 + 256) * var5 >> 8;
                    int var8 = (this.field154 + 256) * var6 >> 8;
                    int var9 = var2 * var8 + var3 * var7 >> 11;
                    int var10 = var3 * var8 - var2 * var7 >> 11;
                    int var11 = field147.field1078 + var9 >> 7;
                    int var12 = field147.field1079 - var10 >> 7;
                    boolean var13 = this.method92(0, 0, 0, 0, 0, field147.field1125[0], 1, true, field147.field1126[0], 0, var12, var11);
                    if (var13) {
                        this.field395.method451(var2);
                        this.field395.method451(var3);
                        this.field395.method452(this.field284);
                        this.field395.method451(57);
                        this.field395.method451(this.field271);
                        this.field395.method451(this.field154);
                        this.field395.method451(89);
                        this.field395.method452(field147.field1078);
                        this.field395.method452(field147.field1079);
                        this.field395.method451(this.field417);
                        this.field395.method451(63);
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILOMAKLDKI;IB)V")
    public final void method91(int arg0, class37 arg1, int arg2, byte arg3) {
        int var5 = this.field284 + this.field271 & 2047;
        int var6 = arg0 * arg0 + arg2 * arg2;
        if (var6 <= 6400) {
            int var7 = class19.field873[var5];
            int var8 = class19.field874[var5];
            int var9 = var7 * 256 / (this.field154 + 256);
            int var10 = var8 * 256 / (this.field154 + 256);
            int var11 = arg0 * var9 + arg2 * var10 >> 16;
            int var12 = arg0 * var10 - arg2 * var9 >> 16;
            if (arg3 != 30) {
                this.field367 = -1;
            }
            if (var6 > 2500) {
                arg1.method357(false, 83 - var12 - arg1.field1152 / 2 - 4, var11 + 94 - arg1.field1151 / 2 + 4, this.field122);
            } else {
                arg1.method351(83 - var12 - arg1.field1152 / 2 - 4, var11 + 94 - arg1.field1151 / 2 + 4, (byte) 0);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIIIZIIII)Z")
    public final boolean method92(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11) {
        byte var13 = 104;
        byte var14 = 104;
        for (int var15 = 0; var15 < var13; ++var15) {
            for (int var39 = 0; var39 < var14; ++var39) {
                this.field279[var15][var39] = 0;
                this.field293[var15][var39] = 99999999;
            }
        }
        int var16 = arg5;
        int var17 = arg8;
        this.field279[arg5][arg8] = 99;
        this.field293[arg5][arg8] = 0;
        byte var18 = 0;
        int var19 = 0;
        this.field335[var18] = arg5;
        int var40 = var18 + 1;
        this.field336[var18] = arg8;
        boolean var20 = false;
        int var21 = this.field335.length;
        int[][] var22 = this.field408[this.field307].field1193;
        while (var40 != var19) {
            var16 = this.field335[var19];
            var17 = this.field336[var19];
            var19 = (var19 + 1) % var21;
            if (arg11 == var16 && arg10 == var17) {
                var20 = true;
                break;
            }
            if (arg4 != 0) {
                if ((arg4 < 5 || arg4 == 10) && this.field408[this.field307].method389(var16, arg10, arg1, arg11, var17, 45022, arg4 - 1)) {
                    var20 = true;
                    break;
                }
                if (arg4 < 10 && this.field408[this.field307].method390(arg4 - 1, arg10, arg11, var17, arg1, -953, var16)) {
                    var20 = true;
                    break;
                }
            }
            if (arg9 != 0 && arg2 != 0 && this.field408[this.field307].method391(arg11, arg3, true, arg10, arg9, var17, arg2, var16)) {
                var20 = true;
                break;
            }
            int var38 = this.field293[var16][var17] + 1;
            if (var16 > 0 && this.field279[var16 - 1][var17] == 0 && (var22[var16 - 1][var17] & 19398920) == 0) {
                this.field335[var40] = var16 - 1;
                this.field336[var40] = var17;
                var40 = (var40 + 1) % var21;
                this.field279[var16 - 1][var17] = 2;
                this.field293[var16 - 1][var17] = var38;
            }
            if (var16 < var13 - 1 && this.field279[var16 + 1][var17] == 0 && (var22[var16 + 1][var17] & 19399040) == 0) {
                this.field335[var40] = var16 + 1;
                this.field336[var40] = var17;
                var40 = (var40 + 1) % var21;
                this.field279[var16 + 1][var17] = 8;
                this.field293[var16 + 1][var17] = var38;
            }
            if (var17 > 0 && this.field279[var16][var17 - 1] == 0 && (var22[var16][var17 - 1] & 19398914) == 0) {
                this.field335[var40] = var16;
                this.field336[var40] = var17 - 1;
                var40 = (var40 + 1) % var21;
                this.field279[var16][var17 - 1] = 1;
                this.field293[var16][var17 - 1] = var38;
            }
            if (var17 < var14 - 1 && this.field279[var16][var17 + 1] == 0 && (var22[var16][var17 + 1] & 19398944) == 0) {
                this.field335[var40] = var16;
                this.field336[var40] = var17 + 1;
                var40 = (var40 + 1) % var21;
                this.field279[var16][var17 + 1] = 4;
                this.field293[var16][var17 + 1] = var38;
            }
            if (var16 > 0 && var17 > 0 && this.field279[var16 - 1][var17 - 1] == 0 && (var22[var16 - 1][var17 - 1] & 19398926) == 0 && (var22[var16 - 1][var17] & 19398920) == 0 && (var22[var16][var17 - 1] & 19398914) == 0) {
                this.field335[var40] = var16 - 1;
                this.field336[var40] = var17 - 1;
                var40 = (var40 + 1) % var21;
                this.field279[var16 - 1][var17 - 1] = 3;
                this.field293[var16 - 1][var17 - 1] = var38;
            }
            if (var16 < var13 - 1 && var17 > 0 && this.field279[var16 + 1][var17 - 1] == 0 && (var22[var16 + 1][var17 - 1] & 19399043) == 0 && (var22[var16 + 1][var17] & 19399040) == 0 && (var22[var16][var17 - 1] & 19398914) == 0) {
                this.field335[var40] = var16 + 1;
                this.field336[var40] = var17 - 1;
                var40 = (var40 + 1) % var21;
                this.field279[var16 + 1][var17 - 1] = 9;
                this.field293[var16 + 1][var17 - 1] = var38;
            }
            if (var16 > 0 && var17 < var14 - 1 && this.field279[var16 - 1][var17 + 1] == 0 && (var22[var16 - 1][var17 + 1] & 19398968) == 0 && (var22[var16 - 1][var17] & 19398920) == 0 && (var22[var16][var17 + 1] & 19398944) == 0) {
                this.field335[var40] = var16 - 1;
                this.field336[var40] = var17 + 1;
                var40 = (var40 + 1) % var21;
                this.field279[var16 - 1][var17 + 1] = 6;
                this.field293[var16 - 1][var17 + 1] = var38;
            }
            if (var16 < var13 - 1 && var17 < var14 - 1 && this.field279[var16 + 1][var17 + 1] == 0 && (var22[var16 + 1][var17 + 1] & 19399136) == 0 && (var22[var16 + 1][var17] & 19399040) == 0 && (var22[var16][var17 + 1] & 19398944) == 0) {
                this.field335[var40] = var16 + 1;
                this.field336[var40] = var17 + 1;
                var40 = (var40 + 1) % var21;
                this.field279[var16 + 1][var17 + 1] = 12;
                this.field293[var16 + 1][var17 + 1] = var38;
            }
        }
        this.field417 = 0;
        if (!var20) {
            if (!arg7) {
                return false;
            }
            int var23 = 1000;
            int var24 = 100;
            byte var25 = 10;
            for (int var26 = arg11 - var25; var26 <= arg11 + var25; ++var26) {
                for (int var27 = arg10 - var25; var27 <= arg10 + var25; ++var27) {
                    if (var26 >= 0 && var27 >= 0 && var26 < 104 && var27 < 104 && this.field293[var26][var27] < 100) {
                        int var28 = 0;
                        if (var26 < arg11) {
                            var28 = arg11 - var26;
                        } else if (var26 > arg9 + arg11 - 1) {
                            var28 = var26 - (arg9 + arg11 - 1);
                        }
                        int var29 = 0;
                        if (var27 < arg10) {
                            var29 = arg10 - var27;
                        } else if (var27 > arg2 + arg10 - 1) {
                            var29 = var27 - (arg2 + arg10 - 1);
                        }
                        int var30 = var28 * var28 + var29 * var29;
                        if (var30 < var23 || var23 == var30 && this.field293[var26][var27] < var24) {
                            var23 = var30;
                            var24 = this.field293[var26][var27];
                            var16 = var26;
                            var17 = var27;
                        }
                    }
                }
            }
            if (var23 == 1000) {
                return false;
            }
            if (arg5 == var16 && arg8 == var17) {
                return false;
            }
            this.field417 = 1;
        }
        byte var31 = 0;
        if (arg0 != 0) {
            this.field395.method451(116);
        }
        this.field335[var31] = var16;
        int var41 = var31 + 1;
        this.field336[var31] = var17;
        int var32;
        int var33 = var32 = this.field279[var16][var17];
        while (arg5 != var16 || arg8 != var17) {
            if (var32 != var33) {
                var32 = var33;
                this.field335[var41] = var16;
                this.field336[var41++] = var17;
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
            var33 = this.field279[var16][var17];
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
            int var35 = this.field335[var41];
            int var36 = this.field336[var41];
            ++field150;
            if (field150 >= 85) {
                this.field395.method450(7, 173);
                this.field395.method451(150);
                field150 = 0;
            }
            if (arg6 == 0) {
                this.field395.method450(7, 169);
                this.field395.method451(var34 + var34 + 3);
            }
            if (arg6 == 1) {
                this.field395.method450(7, 77);
                this.field395.method451(var34 + var34 + 3 + 14);
            }
            if (arg6 == 2) {
                this.field395.method450(7, 35);
                this.field395.method451(var34 + var34 + 3);
            }
            this.field395.method452(this.field96 + var35);
            this.field395.method486(this.field97 + var36, false);
            this.field395.method477(928, super.field1583[5] == 1 ? 1 : 0);
            this.field425 = this.field335[0];
            this.field426 = this.field336[0];
            for (int var37 = 1; var37 < var34; ++var37) {
                --var41;
                this.field395.method478(this.field335[var41] - var35, -919);
                this.field395.method451(this.field336[var41] - var36);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(Z)V")
    public final void method93(boolean arg0) {
        class1 var2 = (class1) this.field149.method181();
        if (arg0) {
            this.field466 = !this.field466;
        }
        while (var2 != null) {
            if (this.field307 == var2.field1 && field346 <= var2.field9) {
                if (field346 >= var2.field8) {
                    if (var2.field19 > 0) {
                        class42 var3 = this.field194[var2.field19 - 1];
                        if (var3 != null && var3.field1078 >= 0 && var3.field1078 < 13312 && var3.field1079 >= 0 && var3.field1079 < 13312) {
                            var2.method3(var3.field1078, var3.field1079, this.method97(var3.field1078, var3.field1079, (byte) -103, var2.field1) - var2.field7, false, field346);
                        }
                    }
                    if (var2.field19 < 0) {
                        int var4 = -var2.field19 - 1;
                        class27 var5;
                        if (this.field483 == var4) {
                            var5 = field147;
                        } else {
                            var5 = this.field475[var4];
                        }
                        if (var5 != null && var5.field1078 >= 0 && var5.field1078 < 13312 && var5.field1079 >= 0 && var5.field1079 < 13312) {
                            var2.method3(var5.field1078, var5.field1079, this.method97(var5.field1078, var5.field1079, (byte) -103, var2.field1) - var2.field7, false, field346);
                        }
                    }
                    var2.method1(true, this.field324);
                    this.field78.method200((int) var2.field13, (int) var2.field12, (byte) 2, this.field307, var2, false, var2.field2, -1, 60, (int) var2.field11);
                }
            } else {
                var2.method331();
            }
            var2 = (class1) this.field149.method183((byte) 6);
        }
    }

    @OriginalMember(owner = "client!client", name = "w", descriptor = "(I)V")
    public final void method94(int arg0) {
        if (arg0 == 24830) {
            this.field403 = true;
            for (int var2 = 0; var2 < 7; ++var2) {
                this.field281[var2] = -1;
                for (int var3 = 0; var3 < class54.field1460; ++var3) {
                    if (!class54.field1461[var3].field1467 && class54.field1461[var3].field1462 == var2 + (this.field161 ? 0 : 7)) {
                        this.field281[var2] = var3;
                        break;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "x", descriptor = "(I)V")
    public final void method95(int arg0) {
        class47.field1282.method177();
        class47.field1293.method177();
        class44.field1242.method177();
        class56.field1524.method177();
        class56.field1500.method177();
        class27.field956.method177();
        if (arg0 != 8) {
            this.field367 = -1;
        }
        class50.field1366.method177();
    }

    @OriginalMember(owner = "client!client", name = "y", descriptor = "(I)Ljava/lang/String;")
    public final String method96(int arg0) {
        this.field366 += arg0;
        if (signlink.mainapp != null) {
            return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
        } else {
            return super.field1568 != null ? "runescape.com" : super.getDocumentBase().getHost().toLowerCase();
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIBI)I")
    public final int method97(int arg0, int arg1, byte arg2, int arg3) {
        int var5 = arg0 >> 7;
        int var6 = arg1 >> 7;
        if (var5 >= 0 && var6 >= 0 && var5 <= 103 && var6 <= 103) {
            int var7 = arg3;
            if (arg3 < 3 && (this.field252[1][var5][var6] & 2) == 2) {
                var7 = arg3 + 1;
            }
            int var8 = arg0 & 127;
            int var9 = arg1 & 127;
            int var10 = (128 - var8) * this.field412[var7][var5][var6] + this.field412[var7][var5 + 1][var6] * var8 >> 7;
            if (arg2 != -103) {
                this.field545 = -317;
            }
            int var11 = (128 - var8) * this.field412[var7][var5][var6 + 1] + this.field412[var7][var5 + 1][var6 + 1] * var8 >> 7;
            return (128 - var9) * var10 + var9 * var11 >> 7;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(LSVWJKJVI;II)V")
    private final void method98(class52 arg0, int arg1, int arg2) {
        if (arg2 < this.field416 || arg2 > this.field416) {
            this.field367 = -1;
        }
        for (int var4 = 0; var4 < this.field478; ++var4) {
            int var5 = this.field479[var4];
            class42 var6 = this.field194[var5];
            int var7 = arg0.method461();
            if ((var7 & 32) != 0) {
                var6.field1101 = arg0.method488(true);
                if (var6.field1101 == 65535) {
                    var6.field1101 = -1;
                }
            }
            if ((var7 & 2) != 0) {
                int var8 = arg0.method488(true);
                if (var8 == 65535) {
                    var8 = -1;
                }
                int var9 = arg0.method481(this.field537);
                if (var6.field1117 == var8 && var8 != -1) {
                    int var10 = class26.field921[var8].field935;
                    if (var10 == 1) {
                        var6.field1118 = 0;
                        var6.field1119 = 0;
                        var6.field1120 = var9;
                        var6.field1121 = 0;
                    }
                    if (var10 == 2) {
                        var6.field1121 = 0;
                    }
                } else if (var8 == -1 || var6.field1117 == -1 || class26.field921[var8].field929 >= class26.field921[var6.field1117].field929) {
                    var6.field1117 = var8;
                    var6.field1118 = 0;
                    var6.field1119 = 0;
                    var6.field1120 = var9;
                    var6.field1121 = 0;
                    var6.field1122 = var6.field1100;
                }
            }
            if ((var7 & 1) != 0) {
                int var11 = arg0.method480(this.field351);
                int var12 = arg0.method479(-45375);
                var6.method342(var12, field346, (byte) 79, var11);
                var6.field1088 = field346 + 300;
                var6.field1089 = arg0.method480(this.field351);
                var6.field1090 = arg0.method481(this.field537);
            }
            if ((var7 & 4) != 0) {
                int var13 = arg0.method480(this.field351);
                int var14 = arg0.method479(-45375);
                var6.method342(var14, field346, (byte) 79, var13);
                var6.field1088 = field346 + 300;
                var6.field1089 = arg0.method479(-45375);
                var6.field1090 = arg0.method461();
            }
            if ((var7 & 16) != 0) {
                var6.field1102 = arg0.method489((byte) -107);
                int var15 = arg0.method466();
                var6.field1106 = var15 >> 16;
                var6.field1105 = (var15 & 65535) + field346;
                var6.field1103 = 0;
                var6.field1104 = 0;
                if (var6.field1105 > field346) {
                    var6.field1103 = -1;
                }
                if (var6.field1102 == 65535) {
                    var6.field1102 = -1;
                }
            }
            if ((var7 & 64) != 0) {
                var6.field1092 = arg0.method468();
                var6.field1112 = 100;
            }
            if ((var7 & 128) != 0) {
                var6.field1074 = arg0.method490((byte) 3);
                var6.field1075 = arg0.method488(true);
            }
            if ((var7 & 8) != 0) {
                var6.field1196 = class44.method398(arg0.method489((byte) -107));
                var6.field1097 = var6.field1196.field1238;
                var6.field1099 = var6.field1196.field1245;
                var6.field1113 = var6.field1196.field1218;
                var6.field1114 = var6.field1196.field1241;
                var6.field1115 = var6.field1196.field1243;
                var6.field1116 = var6.field1196.field1211;
                var6.field1072 = var6.field1196.field1217;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(III)Z")
    public final boolean method99(int arg0, int arg1, int arg2) {
        this.field366 += arg2;
        boolean var4 = false;
        class34 var5 = class34.method339(arg0);
        for (int var6 = 0; var6 < var5.field1065.length && var5.field1065[var6] != -1; ++var6) {
            class34 var7 = class34.method339(var5.field1065[var6]);
            if (var7.field1017 == 0) {
                var4 |= this.method99(var7.field1040, arg1, this.field377);
            }
            if (var7.field1017 == 6 && (var7.field1053 != -1 || var7.field1054 != -1)) {
                boolean var8 = this.method137(var7, true);
                int var9;
                if (var8) {
                    var9 = var7.field1054;
                } else {
                    var9 = var7.field1053;
                }
                if (var9 != -1) {
                    class26 var10 = class26.field921[var9];
                    var7.field1064 += arg1;
                    while (var7.field1064 > var10.method320(var7.field1055, (byte) 0)) {
                        var7.field1064 -= var10.method320(var7.field1055, (byte) 0) + 1;
                        ++var7.field1055;
                        if (var7.field1055 >= var10.field922) {
                            var7.field1055 -= var10.field926;
                            if (var7.field1055 < 0 || var7.field1055 >= var10.field922) {
                                var7.field1055 = 0;
                            }
                        }
                        var4 = true;
                    }
                }
            }
            if (var7.field1017 == 6 && var7.field1067 != 0) {
                int var11 = var7.field1067 >> 16;
                int var12 = var7.field1067 << 16 >> 16;
                int var13 = arg1 * var11;
                int var14 = arg1 * var12;
                var7.field1015 = var7.field1015 + var13 & 2047;
                var7.field1016 = var7.field1016 + var14 & 2047;
                var4 = true;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(B)V")
    public final void method100(byte arg0) {
        if (this.field481 == arg0) {
            if (this.field267 == 0) {
                int var2 = super.field1563 / 2 - 80;
                int var3 = super.field1564 / 2 + 20;
                int var14 = var3 + 20;
                if (super.field1579 == 1 && super.field1580 >= var2 - 75 && super.field1580 <= var2 + 75 && super.field1581 >= var14 - 20 && super.field1581 <= var14 + 20) {
                    this.field267 = 3;
                    this.field111 = 0;
                }
                int var4 = super.field1563 / 2 + 80;
                if (super.field1579 == 1 && super.field1580 >= var4 - 75 && super.field1580 <= var4 + 75 && super.field1581 >= var14 - 20 && super.field1581 <= var14 + 20) {
                    this.field250 = "";
                    this.field251 = "Enter your username & password.";
                    this.field267 = 2;
                    this.field111 = 0;
                }
            } else if (this.field267 == 2) {
                int var5 = super.field1564 / 2 - 40;
                int var15 = var5 + 30;
                int var16 = var15 + 25;
                if (super.field1579 == 1 && super.field1581 >= var16 - 15 && super.field1581 < var16) {
                    this.field111 = 0;
                }
                var5 = var16 + 15;
                if (super.field1579 == 1 && super.field1581 >= var5 - 15 && super.field1581 < var5) {
                    this.field111 = 1;
                }
                var5 += 15;
                int var6 = super.field1563 / 2 - 80;
                int var7 = super.field1564 / 2 + 50;
                int var17 = var7 + 20;
                if (super.field1579 == 1 && super.field1580 >= var6 - 75 && super.field1580 <= var6 + 75 && super.field1581 >= var17 - 20 && super.field1581 <= var17 + 20) {
                    this.field531 = 0;
                    this.method158(this.field378, this.field379, false);
                    if (this.field355) {
                        return;
                    }
                }
                int var8 = super.field1563 / 2 + 80;
                if (super.field1579 == 1 && super.field1580 >= var8 - 75 && super.field1580 <= var8 + 75 && super.field1581 >= var17 - 20 && super.field1581 <= var17 + 20) {
                    this.field267 = 0;
                    this.field378 = "";
                    this.field379 = "";
                }
                while (true) {
                    while (true) {
                        int var9 = this.method557(0);
                        if (var9 == -1) {
                            return;
                        }
                        boolean var10 = false;
                        for (int var11 = 0; var11 < field173.length(); ++var11) {
                            if (var9 == field173.charAt(var11)) {
                                var10 = true;
                                break;
                            }
                        }
                        if (this.field111 == 0) {
                            if (var9 == 8 && this.field378.length() > 0) {
                                this.field378 = this.field378.substring(0, this.field378.length() - 1);
                            }
                            if (var9 == 9 || var9 == 10 || var9 == 13) {
                                this.field111 = 1;
                            }
                            if (var10) {
                                this.field378 = this.field378 + (char) var9;
                            }
                            if (this.field378.length() > 12) {
                                this.field378 = this.field378.substring(0, 12);
                            }
                        } else if (this.field111 == 1) {
                            if (var9 == 8 && this.field379.length() > 0) {
                                this.field379 = this.field379.substring(0, this.field379.length() - 1);
                            }
                            if (var9 == 9 || var9 == 10 || var9 == 13) {
                                this.field111 = 0;
                            }
                            if (var10) {
                                this.field379 = this.field379 + (char) var9;
                            }
                            if (this.field379.length() > 20) {
                                this.field379 = this.field379.substring(0, 20);
                            }
                        }
                    }
                }
            } else {
                if (this.field267 == 3) {
                    int var12 = super.field1563 / 2;
                    int var13 = super.field1564 / 2 + 50;
                    int var18 = var13 + 20;
                    if (super.field1579 == 1 && super.field1580 >= var12 - 75 && super.field1580 <= var12 + 75 && super.field1581 >= var18 - 20 && super.field1581 <= var18 + 20) {
                        this.field267 = 0;
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ZI)V")
    public final void method101(boolean arg0, int arg1) {
        this.method47((byte) 94);
        if (arg1 != -8466) {
            this.field367 = -1;
        }
        this.field229.method316(-439);
        this.field331.method599(0, 0, (byte) 0);
        short var3 = 360;
        short var4 = 200;
        if (this.field267 == 0) {
            int var5 = var4 / 2 + 80;
            this.field506.method361(var3 / 2, var5, this.field530.field771, -40792, true, 7711145);
            int var6 = var4 / 2 - 20;
            this.field508.method361(var3 / 2, var6, "Welcome to RuneScape", -40792, true, 16776960);
            int var17 = var6 + 30;
            int var7 = var3 / 2 - 80;
            int var8 = var4 / 2 + 20;
            this.field332.method599(var8 - 20, var7 - 73, (byte) 0);
            this.field508.method361(var7, var8 + 5, "New User", -40792, true, 16777215);
            int var9 = var3 / 2 + 80;
            this.field332.method599(var8 - 20, var9 - 73, (byte) 0);
            this.field508.method361(var9, var8 + 5, "Existing User", -40792, true, 16777215);
        }
        if (this.field267 == 2) {
            int var10 = var4 / 2 - 40;
            if (this.field250.length() > 0) {
                this.field508.method361(var3 / 2, var10 - 15, this.field250, -40792, true, 16776960);
                this.field508.method361(var3 / 2, var10, this.field251, -40792, true, 16776960);
                var10 += 30;
            } else {
                this.field508.method361(var3 / 2, var10 - 7, this.field251, -40792, true, 16776960);
                var10 += 30;
            }
            this.field508.method368(16777215, true, "Username: " + this.field378 + (this.field111 == 0 & field346 % 40 < 20 ? "@yel@|" : ""), -21100, var3 / 2 - 90, var10);
            var10 += 15;
            this.field508.method368(16777215, true, "Password: " + class3.method10(this.field379, this.field510) + (this.field111 == 1 & field346 % 40 < 20 ? "@yel@|" : ""), -21100, var3 / 2 - 88, var10);
            var10 += 15;
            if (!arg0) {
                int var11 = var3 / 2 - 80;
                int var12 = var4 / 2 + 50;
                this.field332.method599(var12 - 20, var11 - 73, (byte) 0);
                this.field508.method361(var11, var12 + 5, "Login", -40792, true, 16777215);
                int var13 = var3 / 2 + 80;
                this.field332.method599(var12 - 20, var13 - 73, (byte) 0);
                this.field508.method361(var13, var12 + 5, "Cancel", -40792, true, 16777215);
            }
        }
        if (this.field267 == 3) {
            this.field508.method361(var3 / 2, var4 / 2 - 60, "Create a free account", -40792, true, 16776960);
            int var14 = var4 / 2 - 35;
            this.field508.method361(var3 / 2, var14, "To create a new account you need to", -40792, true, 16777215);
            int var18 = var14 + 15;
            this.field508.method361(var3 / 2, var18, "go back to the main RuneScape webpage", -40792, true, 16777215);
            int var19 = var18 + 15;
            this.field508.method361(var3 / 2, var19, "and choose the 'create account'", -40792, true, 16777215);
            int var20 = var19 + 15;
            this.field508.method361(var3 / 2, var20, "button near the top of that page.", -40792, true, 16777215);
            int var21 = var20 + 15;
            int var15 = var3 / 2;
            int var16 = var4 / 2 + 50;
            this.field332.method599(var16 - 20, var15 - 73, (byte) 0);
            this.field508.method361(var15, var16 + 5, "Cancel", -40792, true, 16777215);
        }
        this.field229.method317(796, 171, 202, super.field1565);
        if (this.field399) {
            this.field399 = false;
            this.field227.method317(796, 0, 128, super.field1565);
            this.field228.method317(796, 371, 202, super.field1565);
            this.field232.method317(796, 265, 0, super.field1565);
            this.field233.method317(796, 265, 562, super.field1565);
            this.field234.method317(796, 171, 128, super.field1565);
            this.field235.method317(796, 171, 562, super.field1565);
        }
    }

    @OriginalMember(owner = "client!client", name = "z", descriptor = "(I)V")
    public final void method102(int arg0) {
        while (arg0 >= 0) {
            this.field367 = -1;
        }
        for (class43 var2 = (class43) this.field529.method181(); var2 != null; var2 = (class43) this.field529.method183((byte) 6)) {
            if (this.field307 == var2.field1201 && !var2.field1206) {
                if (field346 >= var2.field1197) {
                    var2.method393(this.field324, true);
                    if (var2.field1206) {
                        var2.method331();
                    } else {
                        this.field78.method200(var2.field1204, var2.field1203, (byte) 2, var2.field1201, var2, false, 0, -1, 60, var2.field1202);
                    }
                }
            } else {
                var2.method331();
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "A", descriptor = "(I)V")
    public final void method103(int arg0) {
        for (int var2 = 0; var2 < this.field195; ++var2) {
            int var3 = this.field196[var2];
            class42 var4 = this.field194[var3];
            if (var4 != null) {
                this.method104(var4.field1196.field1238, var4, 0);
            }
        }
        if (arg0 != 21350) {
            this.field383 = !this.field383;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILNNWGJIGN;I)V")
    public final void method104(int arg0, class35 arg1, int arg2) {
        if (arg2 != 0) {
            for (int var4 = 1; var4 > 0; ++var4) {
            }
        }
        if (arg1.field1078 < 128 || arg1.field1079 < 128 || arg1.field1078 >= 13184 || arg1.field1079 >= 13184) {
            arg1.field1117 = -1;
            arg1.field1102 = -1;
            arg1.field1085 = 0;
            arg1.field1086 = 0;
            arg1.field1078 = arg1.field1125[0] * 128 + arg1.field1097 * 64;
            arg1.field1079 = arg1.field1126[0] * 128 + arg1.field1097 * 64;
            arg1.method345(true);
        }
        if (field147 == arg1 && (arg1.field1078 < 1536 || arg1.field1079 < 1536 || arg1.field1078 >= 11776 || arg1.field1079 >= 11776)) {
            arg1.field1117 = -1;
            arg1.field1102 = -1;
            arg1.field1085 = 0;
            arg1.field1086 = 0;
            arg1.field1078 = arg1.field1125[0] * 128 + arg1.field1097 * 64;
            arg1.field1079 = arg1.field1126[0] * 128 + arg1.field1097 * 64;
            arg1.method345(true);
        }
        if (arg1.field1085 > field346) {
            this.method105(arg1, 2);
        } else if (arg1.field1086 >= field346) {
            this.method106(arg1, (byte) 68);
        } else {
            this.method107(-12340, arg1);
        }
        this.method108((byte) -74, arg1);
        this.method109(464, arg1);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(LNNWGJIGN;I)V")
    public final void method105(class35 arg0, int arg1) {
        int var3 = arg0.field1085 - field346;
        if (arg1 != 2) {
            for (int var4 = 1; var4 > 0; ++var4) {
            }
        }
        int var5 = arg0.field1097 * 64 + arg0.field1081 * 128;
        int var6 = arg0.field1097 * 64 + arg0.field1083 * 128;
        arg0.field1078 += (var5 - arg0.field1078) / var3;
        arg0.field1079 += (var6 - arg0.field1079) / var3;
        arg0.field1123 = 0;
        if (arg0.field1087 == 0) {
            arg0.field1069 = 1024;
        }
        if (arg0.field1087 == 1) {
            arg0.field1069 = 1536;
        }
        if (arg0.field1087 == 2) {
            arg0.field1069 = 0;
        }
        if (arg0.field1087 == 3) {
            arg0.field1069 = 512;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(LNNWGJIGN;B)V")
    public final void method106(class35 arg0, byte arg1) {
        if (field346 == arg0.field1086 || arg0.field1117 == -1 || arg0.field1120 != 0 || arg0.field1119 + 1 > class26.field921[arg0.field1117].method320(arg0.field1118, (byte) 0)) {
            int var3 = arg0.field1086 - arg0.field1085;
            int var4 = field346 - arg0.field1085;
            int var5 = arg0.field1097 * 64 + arg0.field1081 * 128;
            int var6 = arg0.field1097 * 64 + arg0.field1083 * 128;
            int var7 = arg0.field1097 * 64 + arg0.field1082 * 128;
            int var8 = arg0.field1097 * 64 + arg0.field1084 * 128;
            arg0.field1078 = ((var3 - var4) * var5 + var4 * var7) / var3;
            arg0.field1079 = ((var3 - var4) * var6 + var4 * var8) / var3;
        }
        arg0.field1123 = 0;
        if (arg1 == 68) {
            if (arg0.field1087 == 0) {
                arg0.field1069 = 1024;
            }
            if (arg0.field1087 == 1) {
                arg0.field1069 = 1536;
            }
            if (arg0.field1087 == 2) {
                arg0.field1069 = 0;
            }
            if (arg0.field1087 == 3) {
                arg0.field1069 = 512;
            }
            arg0.field1080 = arg0.field1069;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILNNWGJIGN;)V")
    public final void method107(int arg0, class35 arg1) {
        if (this.field107 != arg0) {
            this.field367 = this.field177.method461();
        }
        arg1.field1094 = arg1.field1072;
        if (arg1.field1100 == 0) {
            arg1.field1123 = 0;
        } else {
            if (arg1.field1117 != -1 && arg1.field1120 == 0) {
                class26 var3 = class26.field921[arg1.field1117];
                if (arg1.field1122 > 0 && var3.field933 == 0) {
                    ++arg1.field1123;
                    return;
                }
                if (arg1.field1122 <= 0 && var3.field934 == 0) {
                    ++arg1.field1123;
                    return;
                }
            }
            int var4 = arg1.field1078;
            int var5 = arg1.field1079;
            int var6 = arg1.field1125[arg1.field1100 - 1] * 128 + arg1.field1097 * 64;
            int var7 = arg1.field1126[arg1.field1100 - 1] * 128 + arg1.field1097 * 64;
            if (var6 - var4 <= 256 && var6 - var4 >= -256 && var7 - var5 <= 256 && var7 - var5 >= -256) {
                if (var4 < var6) {
                    if (var5 < var7) {
                        arg1.field1069 = 1280;
                    } else if (var5 > var7) {
                        arg1.field1069 = 1792;
                    } else {
                        arg1.field1069 = 1536;
                    }
                } else if (var4 > var6) {
                    if (var5 < var7) {
                        arg1.field1069 = 768;
                    } else if (var5 > var7) {
                        arg1.field1069 = 256;
                    } else {
                        arg1.field1069 = 512;
                    }
                } else if (var5 < var7) {
                    arg1.field1069 = 1024;
                } else {
                    arg1.field1069 = 0;
                }
                int var8 = arg1.field1069 - arg1.field1080 & 2047;
                if (var8 > 1024) {
                    var8 -= 2048;
                }
                int var9 = arg1.field1114;
                if (var8 >= -256 && var8 <= 256) {
                    var9 = arg1.field1113;
                } else if (var8 >= 256 && var8 < 768) {
                    var9 = arg1.field1116;
                } else if (var8 >= -768 && var8 <= -256) {
                    var9 = arg1.field1115;
                }
                if (var9 == -1) {
                    var9 = arg1.field1113;
                }
                arg1.field1094 = var9;
                int var10 = 4;
                if (arg1.field1080 != arg1.field1069 && arg1.field1101 == -1 && arg1.field1099 != 0) {
                    var10 = 2;
                }
                if (arg1.field1100 > 2) {
                    var10 = 6;
                }
                if (arg1.field1100 > 3) {
                    var10 = 8;
                }
                if (arg1.field1123 > 0 && arg1.field1100 > 1) {
                    var10 = 8;
                    --arg1.field1123;
                }
                if (arg1.field1071[arg1.field1100 - 1]) {
                    var10 <<= 1;
                }
                if (var10 >= 8 && arg1.field1113 == arg1.field1094 && arg1.field1124 != -1) {
                    arg1.field1094 = arg1.field1124;
                }
                if (var4 < var6) {
                    arg1.field1078 += var10;
                    if (arg1.field1078 > var6) {
                        arg1.field1078 = var6;
                    }
                } else if (var4 > var6) {
                    arg1.field1078 -= var10;
                    if (arg1.field1078 < var6) {
                        arg1.field1078 = var6;
                    }
                }
                if (var5 < var7) {
                    arg1.field1079 += var10;
                    if (arg1.field1079 > var7) {
                        arg1.field1079 = var7;
                    }
                } else if (var5 > var7) {
                    arg1.field1079 -= var10;
                    if (arg1.field1079 < var7) {
                        arg1.field1079 = var7;
                    }
                }
                if (arg1.field1078 == var6 && arg1.field1079 == var7) {
                    --arg1.field1100;
                    if (arg1.field1122 > 0) {
                        --arg1.field1122;
                        return;
                    }
                }
            } else {
                arg1.field1078 = var6;
                arg1.field1079 = var7;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(BLNNWGJIGN;)V")
    public final void method108(byte arg0, class35 arg1) {
        if (arg0 != -74) {
            this.field466 = !this.field466;
        }
        if (arg1.field1099 != 0) {
            if (arg1.field1101 != -1 && arg1.field1101 < 32768) {
                class42 var3 = this.field194[arg1.field1101];
                if (var3 != null) {
                    int var4 = arg1.field1078 - var3.field1078;
                    int var5 = arg1.field1079 - var3.field1079;
                    if (var4 != 0 || var5 != 0) {
                        arg1.field1069 = (int) (Math.atan2((double) var4, (double) var5) * 325.949D) & 2047;
                    }
                }
            }
            if (arg1.field1101 >= 32768) {
                int var6 = arg1.field1101 - 32768;
                if (this.field483 == var6) {
                    var6 = this.field474;
                }
                class27 var7 = this.field475[var6];
                if (var7 != null) {
                    int var8 = arg1.field1078 - var7.field1078;
                    int var9 = arg1.field1079 - var7.field1079;
                    if (var8 != 0 || var9 != 0) {
                        arg1.field1069 = (int) (Math.atan2((double) var8, (double) var9) * 325.949D) & 2047;
                    }
                }
            }
            if ((arg1.field1074 != 0 || arg1.field1075 != 0) && (arg1.field1100 == 0 || arg1.field1123 > 0)) {
                int var10 = arg1.field1078 - (arg1.field1074 - this.field96 - this.field96) * 64;
                int var11 = arg1.field1079 - (arg1.field1075 - this.field97 - this.field97) * 64;
                if (var10 != 0 || var11 != 0) {
                    arg1.field1069 = (int) (Math.atan2((double) var10, (double) var11) * 325.949D) & 2047;
                }
                arg1.field1074 = 0;
                arg1.field1075 = 0;
            }
            int var12 = arg1.field1069 - arg1.field1080 & 2047;
            if (var12 != 0) {
                if (var12 >= arg1.field1099 && var12 <= 2048 - arg1.field1099) {
                    if (var12 > 1024) {
                        arg1.field1080 -= arg1.field1099;
                    } else {
                        arg1.field1080 += arg1.field1099;
                    }
                } else {
                    arg1.field1080 = arg1.field1069;
                }
                arg1.field1080 &= 2047;
                if (arg1.field1094 == arg1.field1072 && arg1.field1080 != arg1.field1069) {
                    if (arg1.field1073 != -1) {
                        arg1.field1094 = arg1.field1073;
                        return;
                    }
                    arg1.field1094 = arg1.field1113;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(ILNNWGJIGN;)V")
    public final void method109(int arg0, class35 arg1) {
        int var3 = 23 / arg0;
        arg1.field1093 = false;
        if (arg1.field1094 != -1) {
            class26 var4 = class26.field921[arg1.field1094];
            ++arg1.field1096;
            if (arg1.field1095 < var4.field922 && arg1.field1096 > var4.method320(arg1.field1095, (byte) 0)) {
                arg1.field1096 = 0;
                ++arg1.field1095;
            }
            if (arg1.field1095 >= var4.field922) {
                arg1.field1096 = 0;
                arg1.field1095 = 0;
            }
        }
        if (arg1.field1102 != -1 && field346 >= arg1.field1105) {
            if (arg1.field1103 < 0) {
                arg1.field1103 = 0;
            }
            class26 var5 = class50.field1354[arg1.field1102].field1358;
            ++arg1.field1104;
            while (arg1.field1103 < var5.field922 && arg1.field1104 > var5.method320(arg1.field1103, (byte) 0)) {
                arg1.field1104 -= var5.method320(arg1.field1103, (byte) 0);
                ++arg1.field1103;
            }
            if (arg1.field1103 >= var5.field922 && (arg1.field1103 < 0 || arg1.field1103 >= var5.field922)) {
                arg1.field1102 = -1;
            }
        }
        if (arg1.field1117 != -1 && arg1.field1120 <= 1) {
            class26 var6 = class26.field921[arg1.field1117];
            if (var6.field933 == 1 && arg1.field1122 > 0 && arg1.field1085 <= field346 && arg1.field1086 < field346) {
                arg1.field1120 = 1;
                return;
            }
        }
        if (arg1.field1117 != -1 && arg1.field1120 == 0) {
            class26 var7 = class26.field921[arg1.field1117];
            ++arg1.field1119;
            while (arg1.field1118 < var7.field922 && arg1.field1119 > var7.method320(arg1.field1118, (byte) 0)) {
                arg1.field1119 -= var7.method320(arg1.field1118, (byte) 0);
                ++arg1.field1118;
            }
            if (arg1.field1118 >= var7.field922) {
                arg1.field1118 -= var7.field926;
                ++arg1.field1121;
                if (arg1.field1121 >= var7.field932) {
                    arg1.field1117 = -1;
                }
                if (arg1.field1118 < 0 || arg1.field1118 >= var7.field922) {
                    arg1.field1117 = -1;
                }
            }
            arg1.field1093 = var7.field928;
        }
        if (arg1.field1120 > 0) {
            --arg1.field1120;
        }
    }

    @OriginalMember(owner = "client!client", name = "k", descriptor = "(B)V")
    public final void method110(byte arg0) {
        if (arg0 != 97) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        if (this.field432 != -1 && (this.field302 == 2 || super.field1566 != null)) {
            if (this.field302 == 2) {
                this.method99(this.field432, this.field324, this.field377);
                if (this.field163 != -1) {
                    this.method99(this.field163, this.field324, this.field377);
                }
                this.field324 = 0;
                this.method78(-806);
                super.field1566.method316(-439);
                class48.field1331 = this.field186;
                class8.method162(this.field334);
                this.field399 = true;
                class34 var3 = class34.method339(this.field432);
                if (var3.field1020 == 512 && var3.field995 == 334 && var3.field1017 == 0) {
                    var3.field1020 = 765;
                    var3.field995 = 503;
                }
                this.method65(var3, 0, 0, 0, 284);
                if (this.field163 != -1) {
                    class34 var4 = class34.method339(this.field163);
                    if (var4.field1020 == 512 && var4.field995 == 334 && var4.field1017 == 0) {
                        var4.field1020 = 765;
                        var4.field995 = 503;
                    }
                    this.method65(var4, 0, 0, 0, 284);
                }
                if (!this.field498) {
                    this.method84(true);
                    this.method46(13);
                } else {
                    this.method136(true);
                }
            }
            super.field1566.method317(796, 0, 0, super.field1565);
        } else {
            if (this.field399) {
                this.method40(true);
                this.field399 = false;
                this.field79.method317(796, 4, 0, super.field1565);
                this.field80.method317(796, 357, 0, super.field1565);
                this.field81.method317(796, 4, 722, super.field1565);
                this.field82.method317(796, 205, 743, super.field1565);
                this.field83.method317(796, 0, 0, super.field1565);
                this.field84.method317(796, 4, 516, super.field1565);
                this.field85.method317(796, 205, 516, super.field1565);
                this.field86.method317(796, 357, 496, super.field1565);
                this.field87.method317(796, 338, 0, super.field1565);
                this.field405 = true;
                this.field472 = true;
                this.field499 = true;
                this.field413 = true;
                if (this.field302 != 2) {
                    this.field542.method317(796, 4, 4, super.field1565);
                    this.field541.method317(796, 4, 550, super.field1565);
                }
            }
            if (this.field302 == 2) {
                this.method64(false);
            }
            if (this.field498 && this.field168 == 1) {
                this.field405 = true;
            }
            if (this.field268 != -1) {
                boolean var5 = this.method99(this.field268, this.field324, this.field377);
                if (var5) {
                    this.field405 = true;
                }
            }
            if (this.field91 == 2) {
                this.field405 = true;
            }
            if (this.field318 == 2) {
                this.field405 = true;
            }
            if (this.field405) {
                this.method129((byte) 9);
                this.field405 = false;
            }
            if (this.field216 == -1 && this.field414 == 0) {
                this.field314.field1044 = this.field208 - this.field382 - 77;
                if (super.field1573 > 448 && super.field1573 < 560 && super.field1574 > 332) {
                    this.method126(this.field314, 0, -1, (byte) -92, 77, super.field1573 - 17, this.field208, 463, super.field1574 - 357);
                }
                int var6 = this.field208 - 77 - this.field314.field1044;
                if (var6 < 0) {
                    var6 = 0;
                }
                if (var6 > this.field208 - 77) {
                    var6 = this.field208 - 77;
                }
                if (this.field382 != var6) {
                    this.field382 = var6;
                    this.field472 = true;
                }
            }
            if (this.field216 == -1 && this.field414 == 3) {
                int var7 = this.field113 * 14 + 7;
                this.field314.field1044 = this.field116;
                if (super.field1573 > 448 && super.field1573 < 560 && super.field1574 > 332) {
                    this.method126(this.field314, 0, -1, (byte) -92, 77, super.field1573 - 17, var7, 463, super.field1574 - 357);
                }
                int var8 = this.field314.field1044;
                if (var8 < 0) {
                    var8 = 0;
                }
                if (var8 > var7 - 77) {
                    var8 = var7 - 77;
                }
                if (this.field116 != var8) {
                    this.field116 = var8;
                    this.field472 = true;
                }
            }
            if (this.field216 != -1) {
                boolean var9 = this.method99(this.field216, this.field324, this.field377);
                if (var9) {
                    this.field472 = true;
                }
            }
            if (this.field91 == 3) {
                this.field472 = true;
            }
            if (this.field318 == 3) {
                this.field472 = true;
            }
            if (this.field304 != null) {
                this.field472 = true;
            }
            if (this.field498 && this.field168 == 2) {
                this.field472 = true;
            }
            if (this.field472) {
                this.method135((byte) 0);
                this.field472 = false;
            }
            if (this.field302 == 2) {
                this.method49((byte) 5);
                this.field541.method317(796, 4, 550, super.field1565);
                ++field430;
                if (field430 > 1271) {
                    field430 = 0;
                    this.field395.method450(7, 225);
                    this.field395.method451(0);
                    int var10 = this.field395.field1434;
                    if ((int) (Math.random() * 2.0D) == 0) {
                        this.field395.method451(152);
                    }
                    this.field395.method452((int) (Math.random() * 65536.0D));
                    this.field395.method451((int) (Math.random() * 256.0D));
                    this.field395.method451((int) (Math.random() * 256.0D));
                    this.field395.method452(16113);
                    this.field395.method452((int) (Math.random() * 65536.0D));
                    this.field395.method452(60626);
                    this.field395.method452(58675);
                    this.field395.method452((int) (Math.random() * 65536.0D));
                    this.field395.method451((int) (Math.random() * 256.0D));
                    this.field395.method460(true, this.field395.field1434 - var10);
                }
            }
            if (this.field247 != -1) {
                this.field499 = true;
            }
            if (this.field499) {
                if (this.field247 != -1 && this.field536 == this.field247) {
                    this.field247 = -1;
                    this.field395.method450(7, 61);
                    this.field395.method451(this.field536);
                }
                this.field499 = false;
                this.field487.method316(-439);
                this.field341.method599(0, 0, (byte) 0);
                if (this.field268 == -1) {
                    if (this.field535[this.field536] != -1) {
                        if (this.field536 == 0) {
                            this.field69.method599(10, 22, (byte) 0);
                        }
                        if (this.field536 == 1) {
                            this.field70.method599(8, 54, (byte) 0);
                        }
                        if (this.field536 == 2) {
                            this.field70.method599(8, 82, (byte) 0);
                        }
                        if (this.field536 == 3) {
                            this.field71.method599(8, 110, (byte) 0);
                        }
                        if (this.field536 == 4) {
                            this.field73.method599(8, 153, (byte) 0);
                        }
                        if (this.field536 == 5) {
                            this.field73.method599(8, 181, (byte) 0);
                        }
                        if (this.field536 == 6) {
                            this.field72.method599(9, 209, (byte) 0);
                        }
                    }
                    if (this.field535[0] != -1 && (this.field247 != 0 || field346 % 20 < 10)) {
                        this.field392[0].method599(13, 29, (byte) 0);
                    }
                    if (this.field535[1] != -1 && (this.field247 != 1 || field346 % 20 < 10)) {
                        this.field392[1].method599(11, 53, (byte) 0);
                    }
                    if (this.field535[2] != -1 && (this.field247 != 2 || field346 % 20 < 10)) {
                        this.field392[2].method599(11, 82, (byte) 0);
                    }
                    if (this.field535[3] != -1 && (this.field247 != 3 || field346 % 20 < 10)) {
                        this.field392[3].method599(12, 115, (byte) 0);
                    }
                    if (this.field535[4] != -1 && (this.field247 != 4 || field346 % 20 < 10)) {
                        this.field392[4].method599(13, 153, (byte) 0);
                    }
                    if (this.field535[5] != -1 && (this.field247 != 5 || field346 % 20 < 10)) {
                        this.field392[5].method599(11, 180, (byte) 0);
                    }
                    if (this.field535[6] != -1 && (this.field247 != 6 || field346 % 20 < 10)) {
                        this.field392[6].method599(13, 208, (byte) 0);
                    }
                }
                this.field487.method317(796, 160, 516, super.field1565);
                this.field486.method316(-439);
                this.field340.method599(0, 0, (byte) 0);
                if (this.field268 == -1) {
                    if (this.field535[this.field536] != -1) {
                        if (this.field536 == 7) {
                            this.field357.method599(0, 42, (byte) 0);
                        }
                        if (this.field536 == 8) {
                            this.field358.method599(0, 74, (byte) 0);
                        }
                        if (this.field536 == 9) {
                            this.field358.method599(0, 102, (byte) 0);
                        }
                        if (this.field536 == 10) {
                            this.field359.method599(1, 130, (byte) 0);
                        }
                        if (this.field536 == 11) {
                            this.field361.method599(0, 173, (byte) 0);
                        }
                        if (this.field536 == 12) {
                            this.field361.method599(0, 201, (byte) 0);
                        }
                        if (this.field536 == 13) {
                            this.field360.method599(0, 229, (byte) 0);
                        }
                    }
                    if (this.field535[8] != -1 && (this.field247 != 8 || field346 % 20 < 10)) {
                        this.field392[7].method599(2, 74, (byte) 0);
                    }
                    if (this.field535[9] != -1 && (this.field247 != 9 || field346 % 20 < 10)) {
                        this.field392[8].method599(3, 102, (byte) 0);
                    }
                    if (this.field535[10] != -1 && (this.field247 != 10 || field346 % 20 < 10)) {
                        this.field392[9].method599(4, 137, (byte) 0);
                    }
                    if (this.field535[11] != -1 && (this.field247 != 11 || field346 % 20 < 10)) {
                        this.field392[10].method599(2, 174, (byte) 0);
                    }
                    if (this.field535[12] != -1 && (this.field247 != 12 || field346 % 20 < 10)) {
                        this.field392[11].method599(2, 201, (byte) 0);
                    }
                    if (this.field535[13] != -1 && (this.field247 != 13 || field346 % 20 < 10)) {
                        this.field392[12].method599(2, 226, (byte) 0);
                    }
                }
                this.field486.method317(796, 466, 496, super.field1565);
                this.field542.method316(-439);
                class48.field1331 = this.field185;
            }
            if (this.field413) {
                this.field413 = false;
                this.field485.method316(-439);
                this.field339.method599(0, 0, (byte) 0);
                this.field507.method361(55, 28, "Public chat", -40792, true, 16777215);
                if (this.field68 == 0) {
                    this.field507.method361(55, 41, "On", -40792, true, 65280);
                }
                if (this.field68 == 1) {
                    this.field507.method361(55, 41, "Friends", -40792, true, 16776960);
                }
                if (this.field68 == 2) {
                    this.field507.method361(55, 41, "Off", -40792, true, 16711680);
                }
                if (this.field68 == 3) {
                    this.field507.method361(55, 41, "Hide", -40792, true, 65535);
                }
                this.field507.method361(184, 28, "Private chat", -40792, true, 16777215);
                if (this.field104 == 0) {
                    this.field507.method361(184, 41, "On", -40792, true, 65280);
                }
                if (this.field104 == 1) {
                    this.field507.method361(184, 41, "Friends", -40792, true, 16776960);
                }
                if (this.field104 == 2) {
                    this.field507.method361(184, 41, "Off", -40792, true, 16711680);
                }
                this.field507.method361(324, 28, "Trade/compete", -40792, true, 16777215);
                if (this.field174 == 0) {
                    this.field507.method361(324, 41, "On", -40792, true, 65280);
                }
                if (this.field174 == 1) {
                    this.field507.method361(324, 41, "Friends", -40792, true, 16776960);
                }
                if (this.field174 == 2) {
                    this.field507.method361(324, 41, "Off", -40792, true, 16711680);
                }
                this.field507.method361(458, 33, "Report abuse", -40792, true, 16777215);
                this.field485.method317(796, 453, 0, super.field1565);
                this.field542.method316(-439);
                class48.field1331 = this.field185;
            }
            this.field324 = 0;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILOMAKLDKI;ZI)V")
    public final void method111(int arg0, class37 arg1, boolean arg2, int arg3) {
        if (!arg2) {
            int var5 = arg0 * arg0 + arg3 * arg3;
            if (var5 > 4225 && var5 < 90000) {
                int var6 = this.field284 + this.field271 & 2047;
                int var7 = class19.field873[var6];
                int var8 = class19.field874[var6];
                int var9 = var7 * 256 / (this.field154 + 256);
                int var10 = var8 * 256 / (this.field154 + 256);
                int var11 = arg0 * var10 + arg3 * var9 >> 16;
                int var12 = arg3 * var10 - arg0 * var9 >> 16;
                double var13 = Math.atan2((double) var11, (double) var12);
                int var15 = (int) (Math.sin(var13) * 63.0D);
                int var16 = (int) (Math.cos(var13) * 57.0D);
                this.field190.method356(true, 15, var15 + 94 + 4 - 10, 20, 20, 15, var13, 256, 83 - var16 - 20);
            } else {
                this.method91(arg3, arg1, arg0, (byte) 30);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
    public final void method112(byte arg0) {
        this.field485 = null;
        this.field486 = null;
        this.field487 = null;
        this.field389 = null;
        this.field373 = null;
        this.method128(925);
        this.field440 = null;
        this.field232 = null;
        this.field233 = null;
        this.field234 = null;
        this.field235 = null;
        this.field83 = null;
        this.field84 = null;
        this.field85 = null;
        this.field86 = null;
        this.field87 = null;
        this.field121 = null;
        this.field122 = null;
        this.field123 = null;
        this.field489 = null;
        this.field488 = null;
        this.field118 = null;
        this.field357 = null;
        this.field358 = null;
        this.field359 = null;
        this.field360 = null;
        this.field361 = null;
        this.field69 = null;
        this.field70 = null;
        this.field71 = null;
        this.field72 = null;
        this.field73 = null;
        this.field349 = null;
        this.field230 = null;
        this.field231 = null;
        this.field227 = null;
        this.field228 = null;
        this.field229 = null;
        this.field279 = null;
        this.field293 = null;
        this.field335 = null;
        this.field336 = null;
        this.field427 = null;
        this.field490 = null;
        this.field308 = null;
        this.field544 = null;
        this.field422 = null;
        this.field143 = null;
        this.field109 = null;
        this.field197 = null;
        this.field310 = null;
        this.field261 = null;
        this.field459 = null;
        this.field311 = null;
        this.field312 = null;
        this.field395 = null;
        this.field428 = null;
        this.field177 = null;
        this.field337 = null;
        this.field79 = null;
        this.field80 = null;
        this.field81 = null;
        this.field82 = null;
        this.field193 = null;
        this.field519 = null;
        this.field520 = null;
        this.field521 = null;
        this.field522 = null;
        this.field523 = null;
        this.field540 = null;
        this.field541 = null;
        this.field542 = null;
        this.field543 = null;
        this.field339 = null;
        this.field340 = null;
        this.field341 = null;
        this.field194 = null;
        this.field196 = null;
        this.field475 = null;
        this.field477 = null;
        this.field479 = null;
        this.field480 = null;
        this.field301 = null;
        this.field392 = null;
        try {
            if (this.field74 != null) {
                this.field74.method407();
            }
        } catch (Exception var2) {
        }
        this.field74 = null;
        this.field412 = null;
        this.field252 = null;
        this.field78 = null;
        this.field408 = null;
        this.field164 = null;
        this.field153 = null;
        if (this.field530 != null) {
            this.field530.method252();
        }
        this.field530 = null;
        if (this.field124 != null) {
            this.field124.field879 = false;
        }
        this.field124 = null;
        this.field463 = null;
        this.field464 = null;
        this.field226 = null;
        this.field262 = null;
        this.field263 = null;
        if (arg0 == 8) {
            this.field264 = null;
            this.field265 = null;
            this.field441 = null;
            this.field149 = null;
            this.field529 = null;
            this.method144((byte) 62);
            class47.method420(0);
            class44.method400(0);
            class56.method541(0);
            class34.method336(0);
            class9.field594 = null;
            class54.field1461 = null;
            class53.field1447 = null;
            class26.field921 = null;
            class50.field1354 = null;
            class50.field1366 = null;
            class24.field898 = null;
            super.field1566 = null;
            class27.field956 = null;
            class48.method424(0);
            class13.method188(0);
            class19.method269(0);
            class45.method404(0);
            System.gc();
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIZILPIPBZEOV;)V")
    public final void method113(int arg0, int arg1, boolean arg2, int arg3, class44 arg4) {
        if (this.field439 < 400) {
            if (arg4.field1224 != null) {
                arg4 = arg4.method397(1);
            }
            if (arg4 != null) {
                if (arg4.field1212) {
                    String var6 = arg4.field1222;
                    this.field355 &= arg2;
                    if (arg4.field1237 != 0) {
                        var6 = var6 + method21(field147.field950, field347, arg4.field1237) + " (level-" + arg4.field1237 + ")";
                    }
                    if (this.field513 == 1) {
                        this.field441[this.field439] = "Use " + this.field517 + " with @yel@" + var6;
                        this.field264[this.field439] = 227;
                        this.field265[this.field439] = arg3;
                        this.field262[this.field439] = arg0;
                        this.field263[this.field439] = arg1;
                        ++this.field439;
                    } else {
                        if (this.field255 == 1) {
                            if ((this.field257 & 2) == 2) {
                                this.field441[this.field439] = this.field258 + " @yel@" + var6;
                                this.field264[this.field439] = 389;
                                this.field265[this.field439] = arg3;
                                this.field262[this.field439] = arg0;
                                this.field263[this.field439] = arg1;
                                ++this.field439;
                                return;
                            }
                        } else {
                            if (arg4.field1234 != null) {
                                for (int var7 = 4; var7 >= 0; --var7) {
                                    if (arg4.field1234[var7] != null && !arg4.field1234[var7].equalsIgnoreCase("attack")) {
                                        this.field441[this.field439] = arg4.field1234[var7] + " @yel@" + var6;
                                        if (var7 == 0) {
                                            this.field264[this.field439] = 616;
                                        }
                                        if (var7 == 1) {
                                            this.field264[this.field439] = 310;
                                        }
                                        if (var7 == 2) {
                                            this.field264[this.field439] = 218;
                                        }
                                        if (var7 == 3) {
                                            this.field264[this.field439] = 138;
                                        }
                                        if (var7 == 4) {
                                            this.field264[this.field439] = 745;
                                        }
                                        this.field265[this.field439] = arg3;
                                        this.field262[this.field439] = arg0;
                                        this.field263[this.field439] = arg1;
                                        ++this.field439;
                                    }
                                }
                            }
                            if (arg4.field1234 != null) {
                                for (int var8 = 4; var8 >= 0; --var8) {
                                    if (arg4.field1234[var8] != null && arg4.field1234[var8].equalsIgnoreCase("attack")) {
                                        short var9 = 0;
                                        if (arg4.field1237 > field147.field950) {
                                            var9 = 2000;
                                        }
                                        this.field441[this.field439] = arg4.field1234[var8] + " @yel@" + var6;
                                        if (var8 == 0) {
                                            this.field264[this.field439] = var9 + 616;
                                        }
                                        if (var8 == 1) {
                                            this.field264[this.field439] = var9 + 310;
                                        }
                                        if (var8 == 2) {
                                            this.field264[this.field439] = var9 + 218;
                                        }
                                        if (var8 == 3) {
                                            this.field264[this.field439] = var9 + 138;
                                        }
                                        if (var8 == 4) {
                                            this.field264[this.field439] = var9 + 745;
                                        }
                                        this.field265[this.field439] = arg3;
                                        this.field262[this.field439] = arg0;
                                        this.field263[this.field439] = arg1;
                                        ++this.field439;
                                    }
                                }
                            }
                            this.field441[this.field439] = "Examine @yel@" + var6;
                            this.field264[this.field439] = 1013;
                            this.field265[this.field439] = arg3;
                            this.field262[this.field439] = arg0;
                            this.field263[this.field439] = arg1;
                            ++this.field439;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(BLNHFASBOX;)Z")
    public final boolean method114(byte arg0, class34 arg1) {
        if (arg0 != -52) {
            this.field375 = 70;
        }
        int var3 = arg1.field1012;
        if ((var3 < 1 || var3 > 200) && (var3 < 701 || var3 > 900)) {
            if (var3 >= 401 && var3 <= 500) {
                this.field441[this.field439] = "Remove @whi@" + arg1.field1010;
                this.field264[this.field439] = 557;
                ++this.field439;
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
            this.field441[this.field439] = "Remove @whi@" + this.field489[var3];
            this.field264[this.field439] = 613;
            ++this.field439;
            this.field441[this.field439] = "Message @whi@" + this.field489[var3];
            this.field264[this.field439] = 444;
            ++this.field439;
            return true;
        }
    }

    @OriginalMember(owner = "client!client", name = "B", descriptor = "(I)V")
    public final void method115(int arg0) {
        this.field125 = 0;
        this.field366 += arg0;
        for (int var2 = -1; var2 < this.field476 + this.field195; ++var2) {
            class35 var19;
            if (var2 == -1) {
                var19 = field147;
            } else if (var2 < this.field476) {
                var19 = this.field475[this.field477[var2]];
            } else {
                var19 = this.field194[this.field196[var2 - this.field476]];
            }
            if (var19 != null && var19.method325(5)) {
                if (var19 instanceof class42) {
                    class44 var20 = ((class42) var19).field1196;
                    if (var20.field1224 != null) {
                        var20 = var20.method397(1);
                    }
                    if (var20 == null) {
                        continue;
                    }
                }
                if (var2 >= this.field476) {
                    class44 var23 = ((class42) var19).field1196;
                    if (var23.field1232 >= 0 && var23.field1232 < this.field422.length) {
                        this.method70((byte) -99, var19, var19.field1070 + 15);
                        if (this.field437 > -1) {
                            this.field422[var23.field1232].method351(this.field438 - 30, this.field437 - 12, (byte) 0);
                        }
                    }
                    if (this.field315 == 1 && this.field196[var2 - this.field476] == this.field202 && field346 % 20 < 10) {
                        this.method70((byte) -99, var19, var19.field1070 + 15);
                        if (this.field437 > -1) {
                            this.field143[0].method351(this.field438 - 28, this.field437 - 12, (byte) 0);
                        }
                    }
                } else {
                    int var21 = 30;
                    class27 var22 = (class27) var19;
                    if (var22.field945 != -1 || var22.field949 != -1) {
                        this.method70((byte) -99, var19, var19.field1070 + 15);
                        if (this.field437 > -1) {
                            if (var22.field945 != -1) {
                                this.field544[var22.field945].method351(this.field438 - var21, this.field437 - 12, (byte) 0);
                                var21 += 25;
                            }
                            if (var22.field949 != -1) {
                                this.field422[var22.field949].method351(this.field438 - var21, this.field437 - 12, (byte) 0);
                                var21 += 25;
                            }
                        }
                    }
                    if (var2 >= 0 && this.field315 == 10 && this.field477[var2] == this.field492) {
                        this.method70((byte) -99, var19, var19.field1070 + 15);
                        if (this.field437 > -1) {
                            this.field143[1].method351(this.field438 - var21, this.field437 - 12, (byte) 0);
                        }
                    }
                }
                if (var19.field1092 != null && (var2 >= this.field476 || this.field68 == 0 || this.field68 == 3 || this.field68 == 1 && this.method16(((class27) var19).field952, 38775))) {
                    this.method70((byte) -99, var19, var19.field1070);
                    if (this.field437 > -1 && this.field125 < this.field126) {
                        this.field130[this.field125] = this.field508.method363((byte) 0, var19.field1092) / 2;
                        this.field129[this.field125] = this.field508.field1165;
                        this.field127[this.field125] = this.field437;
                        this.field128[this.field125] = this.field438;
                        this.field131[this.field125] = var19.field1077;
                        this.field132[this.field125] = var19.field1091;
                        this.field133[this.field125] = var19.field1112;
                        this.field134[this.field125++] = var19.field1092;
                        if (this.field93 == 0 && var19.field1091 >= 1 && var19.field1091 <= 3) {
                            this.field129[this.field125] += 10;
                            this.field128[this.field125] += 5;
                        }
                        if (this.field93 == 0 && var19.field1091 == 4) {
                            this.field130[this.field125] = 60;
                        }
                        if (this.field93 == 0 && var19.field1091 == 5) {
                            this.field129[this.field125] += 5;
                        }
                    }
                }
                if (var19.field1088 > field346) {
                    this.method70((byte) -99, var19, var19.field1070 + 15);
                    if (this.field437 > -1) {
                        int var24 = var19.field1089 * 30 / var19.field1090;
                        if (var24 > 30) {
                            var24 = 30;
                        }
                        class8.method164(65280, 21899, 5, this.field437 - 15, var24, this.field438 - 3);
                        class8.method164(16711680, 21899, 5, this.field437 - 15 + var24, 30 - var24, this.field438 - 3);
                    }
                }
                for (int var25 = 0; var25 < 4; ++var25) {
                    if (var19.field1111[var25] > field346) {
                        this.method70((byte) -99, var19, var19.field1070 / 2);
                        if (this.field437 > -1) {
                            if (var25 == 1) {
                                this.field438 -= 20;
                            }
                            if (var25 == 2) {
                                this.field437 -= 15;
                                this.field438 -= 10;
                            }
                            if (var25 == 3) {
                                this.field437 += 15;
                                this.field438 -= 10;
                            }
                            this.field308[var19.field1110[var25]].method351(this.field438 - 12, this.field437 - 12, (byte) 0);
                            this.field506.method360(this.field438 + 4, (byte) 33, String.valueOf(var19.field1109[var25]), this.field437, 0);
                            this.field506.method360(this.field438 + 3, (byte) 33, String.valueOf(var19.field1109[var25]), this.field437 - 1, 16777215);
                        }
                    }
                }
            }
        }
        for (int var3 = 0; var3 < this.field125; ++var3) {
            int var4 = this.field127[var3];
            int var5 = this.field128[var3];
            int var6 = this.field130[var3];
            int var7 = this.field129[var3];
            boolean var8 = true;
            while (var8) {
                var8 = false;
                for (int var18 = 0; var18 < var3; ++var18) {
                    if (var5 + 2 > this.field128[var18] - this.field129[var18] && var5 - var7 < this.field128[var18] + 2 && var4 - var6 < this.field130[var18] + this.field127[var18] && var4 + var6 > this.field127[var18] - this.field130[var18] && this.field128[var18] - this.field129[var18] < var5) {
                        var5 = this.field128[var18] - this.field129[var18];
                        var8 = true;
                    }
                }
            }
            this.field437 = this.field127[var3];
            this.field438 = this.field128[var3] = var5;
            String var9 = this.field134[var3];
            if (this.field93 == 0) {
                int var10 = 16776960;
                if (this.field131[var3] < 6) {
                    var10 = this.field350[this.field131[var3]];
                }
                if (this.field131[var3] == 6) {
                    var10 = this.field394 % 20 < 10 ? 16711680 : 16776960;
                }
                if (this.field131[var3] == 7) {
                    var10 = this.field394 % 20 < 10 ? 255 : 65535;
                }
                if (this.field131[var3] == 8) {
                    var10 = this.field394 % 20 < 10 ? 45056 : 8454016;
                }
                if (this.field131[var3] == 9) {
                    int var11 = 150 - this.field133[var3];
                    if (var11 < 50) {
                        var10 = var11 * 1280 + 16711680;
                    } else if (var11 < 100) {
                        var10 = 16776960 - (var11 - 50) * 327680;
                    } else if (var11 < 150) {
                        var10 = (var11 - 100) * 5 + 65280;
                    }
                }
                if (this.field131[var3] == 10) {
                    int var12 = 150 - this.field133[var3];
                    if (var12 < 50) {
                        var10 = var12 * 5 + 16711680;
                    } else if (var12 < 100) {
                        var10 = 16711935 - (var12 - 50) * 327680;
                    } else if (var12 < 150) {
                        var10 = (var12 - 100) * 327680 + 255 - (var12 - 100) * 5;
                    }
                }
                if (this.field131[var3] == 11) {
                    int var13 = 150 - this.field133[var3];
                    if (var13 < 50) {
                        var10 = 16777215 - var13 * 327685;
                    } else if (var13 < 100) {
                        var10 = (var13 - 50) * 327685 + 65280;
                    } else if (var13 < 150) {
                        var10 = 16777215 - (var13 - 100) * 327680;
                    }
                }
                if (this.field132[var3] == 0) {
                    this.field508.method360(this.field438 + 1, (byte) 33, var9, this.field437, 0);
                    this.field508.method360(this.field438, (byte) 33, var9, this.field437, var10);
                }
                if (this.field132[var3] == 1) {
                    this.field508.method365(this.field437, 0, this.field394, 0, var9, this.field438 + 1);
                    this.field508.method365(this.field437, 0, this.field394, var10, var9, this.field438);
                }
                if (this.field132[var3] == 2) {
                    this.field508.method366(var9, this.field394, 856, this.field438 + 1, this.field437, 0);
                    this.field508.method366(var9, this.field394, 856, this.field438, this.field437, var10);
                }
                if (this.field132[var3] == 3) {
                    this.field508.method367(-125, this.field438 + 1, 0, var9, this.field394, 150 - this.field133[var3], this.field437);
                    this.field508.method367(-125, this.field438, var10, var9, this.field394, 150 - this.field133[var3], this.field437);
                }
                if (this.field132[var3] == 4) {
                    int var14 = this.field508.method363((byte) 0, var9);
                    int var15 = (150 - this.field133[var3]) * (var14 + 100) / 150;
                    class8.method161(this.field437 + 50, this.field437 - 50, 334, this.field162, 0);
                    this.field508.method364(this.field438 + 1, 0, (byte) -120, this.field437 + 50 - var15, var9);
                    this.field508.method364(this.field438, var10, (byte) -120, this.field437 + 50 - var15, var9);
                    class8.method160(376);
                }
                if (this.field132[var3] == 5) {
                    int var16 = 150 - this.field133[var3];
                    int var17 = 0;
                    if (var16 < 25) {
                        var17 = var16 - 25;
                    } else if (var16 > 125) {
                        var17 = var16 - 125;
                    }
                    class8.method161(512, 0, this.field438 + 5, this.field162, this.field438 - this.field508.field1165 - 1);
                    this.field508.method360(this.field438 + 1 + var17, (byte) 33, var9, this.field437, 0);
                    this.field508.method360(this.field438 + var17, (byte) 33, var9, this.field437, var10);
                    class8.method160(376);
                }
            } else {
                this.field508.method360(this.field438 + 1, (byte) 33, var9, this.field437, 0);
                this.field508.method360(this.field438, (byte) 33, var9, this.field437, 16776960);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "k", descriptor = "(Z)Z")
    public final boolean method116(boolean arg0) {
        if (arg0) {
            field501 = !field501;
        }
        if (this.field74 == null) {
            return false;
        } else {
            try {
                int var2 = this.field74.method409();
                if (var2 == 0) {
                    return false;
                }
                if (this.field367 == -1) {
                    this.field74.method410(this.field177.field1433, 0, 1);
                    this.field367 = this.field177.field1433[0] & 255;
                    if (this.field482 != null) {
                        this.field367 = this.field367 - this.field482.method375() & 255;
                    }
                    this.field366 = class30.field980[this.field367];
                    --var2;
                }
                if (this.field366 == -1) {
                    if (var2 <= 0) {
                        return false;
                    }
                    this.field74.method410(this.field177.field1433, 0, 1);
                    this.field366 = this.field177.field1433[0] & 255;
                    --var2;
                }
                if (this.field366 == -2) {
                    if (var2 <= 1) {
                        return false;
                    }
                    this.field74.method410(this.field177.field1433, 0, 2);
                    this.field177.field1434 = 0;
                    this.field366 = this.field177.method463();
                    var2 -= 2;
                }
                if (var2 < this.field366) {
                    return false;
                }
                this.field177.field1434 = 0;
                this.field74.method410(this.field177.field1433, 0, this.field366);
                this.field368 = 0;
                this.field548 = this.field547;
                this.field547 = this.field546;
                this.field546 = this.field367;
                if (this.field367 == 56) {
                    String var3 = this.field177.method468();
                    if (var3.endsWith(":tradereq:")) {
                        String var4 = var3.substring(0, var3.indexOf(":"));
                        long var5 = class3.method5(var4);
                        boolean var7 = false;
                        for (int var8 = 0; var8 < this.field299; ++var8) {
                            if (this.field198[var8] == var5) {
                                var7 = true;
                                break;
                            }
                        }
                        if (!var7 && this.field484 == 0) {
                            this.method45(var4, 4, 895, "wishes to trade with you.");
                        }
                    } else if (var3.endsWith(":duelreq:")) {
                        String var9 = var3.substring(0, var3.indexOf(":"));
                        long var10 = class3.method5(var9);
                        boolean var12 = false;
                        for (int var13 = 0; var13 < this.field299; ++var13) {
                            if (this.field198[var13] == var10) {
                                var12 = true;
                                break;
                            }
                        }
                        if (!var12 && this.field484 == 0) {
                            this.method45(var9, 8, 895, "wishes to duel with you.");
                        }
                    } else if (!var3.endsWith(":chalreq:")) {
                        this.method45("", 0, 895, var3);
                    } else {
                        String var14 = var3.substring(0, var3.indexOf(":"));
                        long var15 = class3.method5(var14);
                        boolean var17 = false;
                        for (int var18 = 0; var18 < this.field299; ++var18) {
                            if (this.field198[var18] == var15) {
                                var17 = true;
                                break;
                            }
                        }
                        if (!var17 && this.field484 == 0) {
                            String var19 = var3.substring(var3.indexOf(":") + 1, var3.length() - 9);
                            this.method45(var14, 8, 895, var19);
                        }
                    }
                    this.field367 = -1;
                    return true;
                }
                if (this.field367 == 12) {
                    int var20 = this.field177.method489((byte) -107);
                    int var21 = this.field177.method490((byte) 3);
                    int var22 = this.field177.method490((byte) 3);
                    class34.method339(var22).field1067 = (var20 << 16) + var21;
                    this.field367 = -1;
                    return true;
                }
                if (this.field367 == 45) {
                    long var23 = this.field177.method467((byte) 50);
                    int var25 = this.field177.method466();
                    int var26 = this.field177.method461();
                    boolean var27 = false;
                    for (int var28 = 0; var28 < 100; ++var28) {
                        if (this.field550[var28] == var25) {
                            var27 = true;
                            break;
                        }
                    }
                    if (var26 <= 1) {
                        for (int var29 = 0; var29 < this.field299; ++var29) {
                            if (this.field198[var29] == var23) {
                                var27 = true;
                                break;
                            }
                        }
                    }
                    if (!var27 && this.field484 == 0) {
                        try {
                            this.field550[this.field94] = var25;
                            this.field94 = (this.field94 + 1) % 100;
                            String var30 = class18.method266(this.field177, this.field366 - 13, -562);
                            if (var26 != 3) {
                                var30 = class55.method512(false, var30);
                            }
                            if (var26 != 2 && var26 != 3) {
                                if (var26 == 1) {
                                    this.method45("@cr1@" + class3.method9(27250, class3.method6(357, var23)), 7, 895, var30);
                                } else {
                                    this.method45(class3.method9(27250, class3.method6(357, var23)), 3, 895, var30);
                                }
                            } else {
                                this.method45("@cr2@" + class3.method9(27250, class3.method6(357, var23)), 7, 895, var30);
                            }
                        } catch (Exception var190) {
                            signlink.reporterror("cde1");
                        }
                    }
                    this.field367 = -1;
                    return true;
                }
                if (this.field367 == 51) {
                    if (this.field268 != -1) {
                        this.method26((byte) -13, this.field268);
                        this.field268 = -1;
                        this.field405 = true;
                        this.field499 = true;
                    }
                    if (this.field216 != -1) {
                        this.method26((byte) -13, this.field216);
                        this.field216 = -1;
                        this.field472 = true;
                    }
                    if (this.field432 != -1) {
                        this.method26((byte) -13, this.field432);
                        this.field432 = -1;
                        this.field399 = true;
                    }
                    if (this.field163 != -1) {
                        this.method26((byte) -13, this.field163);
                        this.field163 = -1;
                    }
                    if (this.field329 != -1) {
                        this.method26((byte) -13, this.field329);
                        this.field329 = -1;
                    }
                    if (this.field414 != 0) {
                        this.field414 = 0;
                        this.field472 = true;
                    }
                    this.field249 = false;
                    this.field367 = -1;
                    return true;
                }
                if (this.field367 == 208) {
                    this.field405 = true;
                    int var32 = this.field177.method481(this.field537);
                    int var33 = this.field177.method494(true);
                    int var34 = this.field177.method481(this.field537);
                    this.field176[var34] = var33;
                    this.field204[var34] = var32;
                    this.field495[var34] = 1;
                    for (int var35 = 0; var35 < 98; ++var35) {
                        if (var33 >= field494[var35]) {
                            this.field495[var34] = var35 + 2;
                        }
                    }
                    this.field367 = -1;
                    return true;
                }
                if (this.field367 == 237) {
                    this.field253 = this.field177.method479(-45375);
                    this.field483 = this.field177.method463();
                    this.field367 = -1;
                    return true;
                }
                if (this.field367 == 235) {
                    int var36 = this.field177.method463();
                    int var37 = this.field177.method488(true);
                    if (this.field216 != -1) {
                        this.method26((byte) -13, this.field216);
                        this.field216 = -1;
                        this.field472 = true;
                    }
                    if (this.field432 != -1) {
                        this.method26((byte) -13, this.field432);
                        this.field432 = -1;
                        this.field399 = true;
                    }
                    if (this.field163 != -1) {
                        this.method26((byte) -13, this.field163);
                        this.field163 = -1;
                    }
                    if (this.field329 != var37) {
                        this.method26((byte) -13, this.field329);
                        this.field329 = var37;
                    }
                    if (this.field268 != var36) {
                        this.method26((byte) -13, this.field268);
                        this.field268 = var36;
                    }
                    if (this.field414 != 0) {
                        this.field414 = 0;
                        this.field472 = true;
                    }
                    this.field405 = true;
                    this.field499 = true;
                    this.field249 = false;
                    this.field367 = -1;
                    return true;
                }
                if (this.field367 == 123) {
                    int var38 = this.field177.method488(true);
                    int var39 = this.field177.method493(24013);
                    this.field402[var38] = var39;
                    if (this.field197[var38] != var39) {
                        this.field197[var38] = var39;
                        this.method38(0, var38);
                        this.field405 = true;
                        if (this.field400 != -1) {
                            this.field472 = true;
                        }
                    }
                    this.field367 = -1;
                    return true;
                }
                if (this.field367 == 42) {
                    if (this.field536 == 12) {
                        this.field405 = true;
                    }
                    this.field239 = this.field177.method461();
                    this.field367 = -1;
                    return true;
                }
                if (this.field367 == 148) {
                    this.field117 = false;
                    this.field414 = 2;
                    this.field77 = "";
                    this.field472 = true;
                    this.field367 = -1;
                    return true;
                }
                if (this.field367 == 85) {
                    int var40 = this.field177.method488(true);
                    if (var40 == 65535) {
                        var40 = -1;
                    }
                    if (this.field372 != var40 && this.field158 && !field505 && this.field330 == 0) {
                        this.field434 = var40;
                        this.field435 = true;
                        this.field530.method245(2, this.field434);
                    }
                    this.field372 = var40;
                    this.field367 = -1;
                    return true;
                }
                if (this.field367 == 65) {
                    int var41 = this.field177.method489((byte) -107);
                    int var42 = this.field177.method465();
                    if (this.field158 && !field505) {
                        this.field434 = var41;
                        this.field435 = false;
                        this.field530.method245(2, this.field434);
                        this.field330 = var42;
                    }
                    this.field367 = -1;
                    return true;
                }
                if (this.field367 == 78) {
                    int var43 = this.field177.method463();
                    int var44 = this.field177.method461();
                    int var45 = this.field177.method463();
                    if (var45 == 65535) {
                        if (this.field215 < 50) {
                            this.field282[this.field215] = (short) var43;
                            this.field410[this.field215] = var44;
                            this.field352[this.field215] = 0;
                            ++this.field215;
                        }
                    } else if (this.field236 && !field505 && this.field215 < 50) {
                        this.field282[this.field215] = var43;
                        this.field410[this.field215] = var44;
                        this.field352[this.field215] = class23.field890[var43] + var45;
                        ++this.field215;
                    }
                    this.field367 = -1;
                    return true;
                }
                if (this.field367 == 185) {
                    int var46 = this.field177.method489((byte) -107);
                    class34.method339(var46).field1059 = 3;
                    if (field147.field944 == null) {
                        class34.method339(var46).field1060 = (field147.field959[11] << 5) + (field147.field959[8] << 10) + (field147.field959[0] << 15) + (field147.field965[0] << 25) + (field147.field965[4] << 20) + field147.field959[1];
                    } else {
                        class34.method339(var46).field1060 = (int) (field147.field944.field1227 + 305419896L);
                    }
                    this.field367 = -1;
                    return true;
                }
                if (this.field367 == 8) {
                    int var47 = this.field177.method463();
                    int var48 = this.field177.method490((byte) 3);
                    int var49 = this.field177.method488(true);
                    if (var47 == 65535) {
                        class34.method339(var48).field1059 = 0;
                        this.field367 = -1;
                        return true;
                    }
                    class56 var50 = class56.method544(var47);
                    class34.method339(var48).field1059 = 4;
                    class34.method339(var48).field1060 = var47;
                    class34.method339(var48).field1015 = var50.field1504;
                    class34.method339(var48).field1016 = var50.field1493;
                    class34.method339(var48).field1014 = var50.field1488 * 100 / var49;
                    this.field367 = -1;
                    return true;
                }
                if (this.field367 == 76) {
                    this.field117 = false;
                    this.field414 = 1;
                    this.field77 = "";
                    this.field472 = true;
                    this.field367 = -1;
                    return true;
                }
                if (this.field367 == 197) {
                    this.field425 = 0;
                    this.field367 = -1;
                    return true;
                }
                if (this.field367 == 29) {
                    int var51 = this.field177.method488(true);
                    String var52 = this.field177.method468();
                    class34.method339(var51).field1010 = var52;
                    int var10001 = this.field535[this.field536];
                    if (class34.method339(var51).field1052 == var10001) {
                        this.field405 = true;
                    }
                    this.field367 = -1;
                    return true;
                }
                if (this.field367 == 38) {
                    this.field536 = this.field177.method480(this.field351);
                    this.field405 = true;
                    this.field499 = true;
                    this.field367 = -1;
                    return true;
                }
                if (this.field367 == 137) {
                    for (int var53 = 0; var53 < this.field197.length; ++var53) {
                        if (this.field402[var53] != this.field197[var53]) {
                            this.field197[var53] = this.field402[var53];
                            this.method38(0, var53);
                            this.field405 = true;
                        }
                    }
                    this.field367 = -1;
                    return true;
                }
                if (this.field367 == 210) {
                    this.field203 = this.field177.method461();
                    this.field367 = -1;
                    return true;
                }
                if (this.field367 == 44) {
                    this.field156 = this.field177.method490((byte) 3);
                    this.field460 = this.field177.method489((byte) -107);
                    this.field177.method488(true);
                    this.field374 = this.field177.method489((byte) -107);
                    this.field275 = this.field177.method489((byte) -107);
                    this.field424 = this.field177.method490((byte) 3);
                    this.field354 = this.field177.method489((byte) -107);
                    this.field225 = this.field177.method493(24013);
                    this.field396 = this.field177.method489((byte) -107);
                    this.field177.method481(this.field537);
                    this.field108 = this.field177.method490((byte) 3);
                    signlink.dnslookup(class3.method8(-29151, this.field225));
                    this.field367 = -1;
                    return true;
                }
                if (this.field367 == 18) {
                    long var54 = this.field177.method467((byte) 50);
                    int var56 = this.field177.method461();
                    String var57 = class3.method9(27250, class3.method6(357, var54));
                    for (int var58 = 0; var58 < this.field390; ++var58) {
                        if (this.field488[var58] == var54) {
                            if (this.field118[var58] != var56) {
                                this.field118[var58] = var56;
                                this.field405 = true;
                                if (var56 > 0) {
                                    this.method45("", 5, 895, var57 + " has logged in.");
                                }
                                if (var56 == 0) {
                                    this.method45("", 5, 895, var57 + " has logged out.");
                                }
                            }
                            var57 = null;
                            break;
                        }
                    }
                    if (var57 != null && this.field390 < 200) {
                        this.field488[this.field390] = var54;
                        this.field489[this.field390] = var57;
                        this.field118[this.field390] = var56;
                        ++this.field390;
                        this.field405 = true;
                    }
                    boolean var59 = false;
                    while (!var59) {
                        var59 = true;
                        for (int var60 = 0; var60 < this.field390 - 1; ++var60) {
                            if (this.field118[var60] != field502 && this.field118[var60 + 1] == field502 || this.field118[var60] == 0 && this.field118[var60 + 1] != 0) {
                                int var61 = this.field118[var60];
                                this.field118[var60] = this.field118[var60 + 1];
                                this.field118[var60 + 1] = var61;
                                String var62 = this.field489[var60];
                                this.field489[var60] = this.field489[var60 + 1];
                                this.field489[var60 + 1] = var62;
                                long var63 = this.field488[var60];
                                this.field488[var60] = this.field488[var60 + 1];
                                this.field488[var60 + 1] = var63;
                                this.field405 = true;
                                var59 = false;
                            }
                        }
                    }
                    this.field367 = -1;
                    return true;
                }
                if (this.field367 == 94) {
                    int var65 = this.field177.method488(true);
                    this.method18(1, var65);
                    if (this.field268 != -1) {
                        this.method26((byte) -13, this.field268);
                        this.field268 = -1;
                        this.field405 = true;
                        this.field499 = true;
                    }
                    if (this.field216 != -1) {
                        this.method26((byte) -13, this.field216);
                        this.field216 = -1;
                        this.field472 = true;
                    }
                    if (this.field432 != -1) {
                        this.method26((byte) -13, this.field432);
                        this.field432 = -1;
                        this.field399 = true;
                    }
                    if (this.field163 != -1) {
                        this.method26((byte) -13, this.field163);
                        this.field163 = -1;
                    }
                    if (this.field329 != var65) {
                        this.method26((byte) -13, this.field329);
                        this.field329 = var65;
                    }
                    if (this.field414 != 0) {
                        this.field414 = 0;
                        this.field472 = true;
                    }
                    this.field249 = false;
                    this.field367 = -1;
                    return true;
                }
                if (this.field367 == 101) {
                    int var66 = this.field177.method488(true);
                    int var67 = this.field177.method463();
                    class34.method339(var66).field1059 = 1;
                    class34.method339(var66).field1060 = var67;
                    this.field367 = -1;
                    return true;
                }
                if (this.field367 == 136) {
                    int var68 = this.field177.method488(true);
                    int var69 = this.field177.method490((byte) 3);
                    int var70 = this.field177.method489((byte) -107);
                    int var71 = this.field177.method463();
                    class34.method339(var69).field1015 = var71;
                    class34.method339(var69).field1016 = var68;
                    class34.method339(var69).field1014 = var70;
                    this.field367 = -1;
                    return true;
                }
                if (this.field367 == 33) {
                    int var72 = this.field177.method461();
                    int var73 = this.field177.method461();
                    int var74 = this.field177.method461();
                    int var75 = this.field177.method461();
                    this.field421[var72] = true;
                    this.field303[var72] = var73;
                    this.field167[var72] = var74;
                    this.field289[var72] = var75;
                    this.field371[var72] = 0;
                    this.field367 = -1;
                    return true;
                }
                if (this.field367 == 67) {
                    int var76 = this.field177.method463();
                    int var77 = this.field177.method492(8);
                    class34 var78 = class34.method339(var76);
                    if (var78.field1053 != var77 || var77 == -1) {
                        var78.field1053 = var77;
                        var78.field1055 = 0;
                        var78.field1064 = 0;
                    }
                    this.field367 = -1;
                    return true;
                }
                if (this.field367 == 230) {
                    this.field237 = this.field177.method480(this.field351);
                    this.field238 = this.field177.method479(-45375);
                    while (this.field177.field1434 < this.field366) {
                        int var79 = this.field177.method461();
                        this.method142(var79, 255, this.field177);
                    }
                    this.field367 = -1;
                    return true;
                }
                if (this.field367 == 193) {
                    int var80 = this.field177.method479(-45375);
                    int var81 = this.field177.method479(-45375);
                    String var82 = this.field177.method468();
                    if (var80 >= 1 && var80 <= 5) {
                        if (var82.equalsIgnoreCase("null")) {
                            var82 = null;
                        }
                        this.field363[var80 - 1] = var82;
                        this.field364[var80 - 1] = var81 == 0;
                    }
                    this.field367 = -1;
                    return true;
                }
                if (this.field367 == 188) {
                    int var83 = this.field177.method464();
                    if (var83 >= 0) {
                        this.method18(1, var83);
                    }
                    if (this.field393 != var83) {
                        this.method26((byte) -13, this.field393);
                        this.field393 = var83;
                    }
                    this.field367 = -1;
                    return true;
                }
                if (this.field367 == 23) {
                    int var84 = this.field177.method488(true);
                    this.method18(1, var84);
                    if (this.field268 != -1) {
                        this.method26((byte) -13, this.field268);
                        this.field268 = -1;
                        this.field405 = true;
                        this.field499 = true;
                    }
                    if (this.field432 != -1) {
                        this.method26((byte) -13, this.field432);
                        this.field432 = -1;
                        this.field399 = true;
                    }
                    if (this.field163 != -1) {
                        this.method26((byte) -13, this.field163);
                        this.field163 = -1;
                    }
                    if (this.field329 != -1) {
                        this.method26((byte) -13, this.field329);
                        this.field329 = -1;
                    }
                    if (this.field216 != var84) {
                        this.method26((byte) -13, this.field216);
                        this.field216 = var84;
                    }
                    this.field249 = false;
                    this.field472 = true;
                    this.field367 = -1;
                    return true;
                }
                if (this.field367 != 120 && this.field367 != 95) {
                    if (this.field367 == 4) {
                        this.field247 = this.field177.method479(-45375);
                        if (this.field536 == this.field247) {
                            if (this.field247 == 3) {
                                this.field536 = 1;
                            } else {
                                this.field536 = 3;
                            }
                            this.field405 = true;
                        }
                        this.field367 = -1;
                        return true;
                    }
                    if (this.field367 == 250) {
                        int var135 = this.field177.method464();
                        if (this.field400 != var135) {
                            this.method26((byte) -13, this.field400);
                            this.field400 = var135;
                        }
                        this.field472 = true;
                        this.field367 = -1;
                        return true;
                    }
                    if (this.field367 == 232) {
                        int var136 = this.field177.method488(true);
                        this.method18(1, var136);
                        if (this.field216 != -1) {
                            this.method26((byte) -13, this.field216);
                            this.field216 = -1;
                            this.field472 = true;
                        }
                        if (this.field432 != -1) {
                            this.method26((byte) -13, this.field432);
                            this.field432 = -1;
                            this.field399 = true;
                        }
                        if (this.field163 != -1) {
                            this.method26((byte) -13, this.field163);
                            this.field163 = -1;
                        }
                        if (this.field329 != -1) {
                            this.method26((byte) -13, this.field329);
                            this.field329 = -1;
                        }
                        if (this.field268 != var136) {
                            this.method26((byte) -13, this.field268);
                            this.field268 = var136;
                        }
                        if (this.field414 != 0) {
                            this.field414 = 0;
                            this.field472 = true;
                        }
                        this.field405 = true;
                        this.field499 = true;
                        this.field249 = false;
                        this.field367 = -1;
                        return true;
                    }
                    if (this.field367 == 224) {
                        if (this.field536 == 12) {
                            this.field405 = true;
                        }
                        this.field406 = this.field177.method464();
                        this.field367 = -1;
                        return true;
                    }
                    if (this.field367 == 89) {
                        this.method131(this.field366, this.field177, (byte) 1);
                        this.field367 = -1;
                        return true;
                    }
                    if (this.field367 == 57) {
                        this.field68 = this.field177.method461();
                        this.field104 = this.field177.method461();
                        this.field174 = this.field177.method461();
                        this.field413 = true;
                        this.field472 = true;
                        this.field367 = -1;
                        return true;
                    }
                    if (this.field367 == 234) {
                        this.field405 = true;
                        int var137 = this.field177.method463();
                        class34 var138 = class34.method339(var137);
                        while (this.field177.field1434 < this.field366) {
                            int var139 = this.field177.method475();
                            int var140 = this.field177.method463();
                            int var141 = this.field177.method461();
                            if (var141 == 255) {
                                var141 = this.field177.method466();
                            }
                            if (var139 >= 0 && var139 < var138.field1061.length) {
                                var138.field1061[var139] = var140;
                                var138.field1048[var139] = var141;
                            }
                        }
                        this.field367 = -1;
                        return true;
                    }
                    if (this.field367 == 141) {
                        this.field180 = this.field177.method489((byte) -107) * 30;
                        this.field367 = -1;
                        return true;
                    }
                    if (this.field367 == 75) {
                        this.field405 = true;
                        int var142 = this.field177.method463();
                        class34 var143 = class34.method339(var142);
                        int var144 = this.field177.method463();
                        for (int var145 = 0; var145 < var144; ++var145) {
                            int var146 = this.field177.method481(this.field537);
                            if (var146 == 255) {
                                var146 = this.field177.method494(true);
                            }
                            var143.field1061[var145] = this.field177.method490((byte) 3);
                            var143.field1048[var145] = var146;
                        }
                        for (int var147 = var144; var147 < var143.field1061.length; ++var147) {
                            var143.field1061[var147] = 0;
                            var143.field1048[var147] = 0;
                        }
                        this.field367 = -1;
                        return true;
                    }
                    if (this.field367 == 205) {
                        this.field299 = this.field366 / 8;
                        for (int var148 = 0; var148 < this.field299; ++var148) {
                            this.field198[var148] = this.field177.method467((byte) 50);
                        }
                        this.field367 = -1;
                        return true;
                    }
                    if (this.field367 == 161) {
                        int var149 = this.field177.method463();
                        int var150 = this.field177.method463();
                        int var151 = var150 >> 10 & 31;
                        int var152 = var150 >> 5 & 31;
                        int var153 = var150 & 31;
                        class34.method339(var149).field1005 = (var153 << 3) + (var151 << 19) + (var152 << 11);
                        this.field367 = -1;
                        return true;
                    }
                    if (this.field367 == 149) {
                        this.field391 = this.field177.method461();
                        this.field405 = true;
                        this.field367 = -1;
                        return true;
                    }
                    if (this.field367 == 221) {
                        this.field237 = this.field177.method479(-45375);
                        this.field238 = this.field177.method481(this.field537);
                        this.field367 = -1;
                        return true;
                    }
                    if (this.field367 == 199) {
                        this.field420 = true;
                        this.field136 = this.field177.method461();
                        this.field137 = this.field177.method461();
                        this.field138 = this.field177.method463();
                        this.field139 = this.field177.method461();
                        this.field140 = this.field177.method461();
                        if (this.field140 >= 100) {
                            int var154 = this.field136 * 128 + 64;
                            int var155 = this.field137 * 128 + 64;
                            int var156 = this.method97(var154, var155, (byte) -103, this.field307) - this.field138;
                            int var157 = var154 - this.field242;
                            int var158 = var156 - this.field243;
                            int var159 = var155 - this.field244;
                            int var160 = (int) Math.sqrt((double) (var157 * var157 + var159 * var159));
                            this.field245 = (int) (Math.atan2((double) var158, (double) var160) * 325.949D) & 2047;
                            this.field246 = (int) (Math.atan2((double) var157, (double) var159) * -325.949D) & 2047;
                            if (this.field245 < 128) {
                                this.field245 = 128;
                            }
                            if (this.field245 > 383) {
                                this.field245 = 383;
                            }
                        }
                        this.field367 = -1;
                        return true;
                    }
                    if (this.field367 == 203) {
                        int var161 = this.field177.method490((byte) 3);
                        int var162 = this.field177.method463();
                        this.method18(1, var161);
                        if (var162 != -1) {
                            this.method18(1, var162);
                        }
                        if (this.field329 != -1) {
                            this.method26((byte) -13, this.field329);
                            this.field329 = -1;
                        }
                        if (this.field268 != -1) {
                            this.method26((byte) -13, this.field268);
                            this.field268 = -1;
                        }
                        if (this.field216 != -1) {
                            this.method26((byte) -13, this.field216);
                            this.field216 = -1;
                        }
                        if (this.field432 != var161) {
                            this.method26((byte) -13, this.field432);
                            this.field432 = var161;
                        }
                        if (this.field163 != var161) {
                            this.method26((byte) -13, this.field163);
                            this.field163 = var162;
                        }
                        this.field414 = 0;
                        this.field249 = false;
                        this.field367 = -1;
                        return true;
                    }
                    if (this.field367 == 62) {
                        int var163 = this.field177.method463();
                        boolean var164 = this.field177.method481(this.field537) == 1;
                        class34.method339(var163).field1007 = var164;
                        this.field367 = -1;
                        return true;
                    }
                    if (this.field367 == 17) {
                        this.field209 = this.field177.method461();
                        this.field367 = -1;
                        return true;
                    }
                    if (this.field367 == 9) {
                        for (int var165 = 0; var165 < this.field475.length; ++var165) {
                            if (this.field475[var165] != null) {
                                this.field475[var165].field1117 = -1;
                            }
                        }
                        for (int var166 = 0; var166 < this.field194.length; ++var166) {
                            if (this.field194[var166] != null) {
                                this.field194[var166].field1117 = -1;
                            }
                        }
                        this.field367 = -1;
                        return true;
                    }
                    if (this.field367 == 154) {
                        this.field420 = false;
                        for (int var167 = 0; var167 < 5; ++var167) {
                            this.field421[var167] = false;
                        }
                        this.field367 = -1;
                        return true;
                    }
                    if (this.field367 == 228) {
                        int var168 = this.field177.method479(-45375);
                        int var169 = this.field177.method463();
                        if (var169 == 65535) {
                            var169 = -1;
                        }
                        if (this.field535[var168] != var169) {
                            this.method26((byte) -13, this.field535[var168]);
                            this.field535[var168] = var169;
                        }
                        this.field405 = true;
                        this.field499 = true;
                        this.field367 = -1;
                        return true;
                    }
                    if (this.field367 != 15) {
                        if (this.field367 == 220) {
                            int var170 = this.field177.method463();
                            byte var171 = this.field177.method462();
                            this.field402[var170] = var171;
                            if (this.field197[var170] != var171) {
                                this.field197[var170] = var171;
                                this.method38(0, var170);
                                this.field405 = true;
                                if (this.field400 != -1) {
                                    this.field472 = true;
                                }
                            }
                            this.field367 = -1;
                            return true;
                        }
                        if (this.field367 == 140) {
                            this.field238 = this.field177.method461();
                            this.field237 = this.field177.method481(this.field537);
                            for (int var172 = this.field237; var172 < this.field237 + 8; ++var172) {
                                for (int var173 = this.field238; var173 < this.field238 + 8; ++var173) {
                                    if (this.field164[this.field307][var172][var173] != null) {
                                        this.field164[this.field307][var172][var173] = null;
                                        this.method67(var172, var173);
                                    }
                                }
                            }
                            for (class6 var174 = (class6) this.field153.method181(); var174 != null; var174 = (class6) this.field153.method183((byte) 6)) {
                                if (var174.field58 >= this.field237 && var174.field58 < this.field237 + 8 && var174.field59 >= this.field238 && var174.field59 < this.field238 + 8 && this.field307 == var174.field56) {
                                    var174.field67 = 0;
                                }
                            }
                            this.field367 = -1;
                            return true;
                        }
                        if (this.field367 == 121) {
                            int var175 = this.field177.method492(8);
                            int var176 = this.field177.method489((byte) -107);
                            int var177 = this.field177.method491(0);
                            class34 var178 = class34.method339(var176);
                            var178.field1035 = var177;
                            var178.field1022 = var175;
                            this.field367 = -1;
                            return true;
                        }
                        if (this.field367 == 170) {
                            this.method134(this.field326, this.field177, this.field366);
                            this.field353 = false;
                            this.field367 = -1;
                            return true;
                        }
                        if (this.field367 == 126) {
                            int var179 = this.field177.method489((byte) -107);
                            class34 var180 = class34.method339(var179);
                            for (int var181 = 0; var181 < var180.field1061.length; ++var181) {
                                var180.field1061[var181] = -1;
                                var180.field1061[var181] = 0;
                            }
                            this.field367 = -1;
                            return true;
                        }
                        if (this.field367 == 194) {
                            int var182 = this.field177.method463();
                            int var183 = this.field177.method490((byte) 3);
                            class34.method339(var183).field1059 = 2;
                            class34.method339(var183).field1060 = var182;
                            this.field367 = -1;
                            return true;
                        }
                        if (this.field367 == 68) {
                            this.method28(0);
                            this.field367 = -1;
                            return false;
                        }
                        if (this.field367 == 80 || this.field367 == 200 || this.field367 == 243 || this.field367 == 34 || this.field367 == 129 || this.field367 == 99 || this.field367 == 189 || this.field367 == 247 || this.field367 == 157 || this.field367 == 144 || this.field367 == 26) {
                            this.method142(this.field367, 255, this.field177);
                            this.field367 = -1;
                            return true;
                        }
                        if (this.field367 == 139) {
                            int var184 = this.field177.method489((byte) -107);
                            int var185 = this.field177.method488(true);
                            class34 var186 = class34.method339(var184);
                            if (var186 != null && var186.field1017 == 0) {
                                if (var185 < 0) {
                                    var185 = 0;
                                }
                                if (var185 > var186.field1027 - var186.field995) {
                                    var185 = var186.field1027 - var186.field995;
                                }
                                var186.field1044 = var185;
                            }
                            this.field367 = -1;
                            return true;
                        }
                        if (this.field367 == 59) {
                            this.field420 = true;
                            this.field384 = this.field177.method461();
                            this.field385 = this.field177.method461();
                            this.field386 = this.field177.method463();
                            this.field387 = this.field177.method461();
                            this.field388 = this.field177.method461();
                            if (this.field388 >= 100) {
                                this.field242 = this.field384 * 128 + 64;
                                this.field244 = this.field385 * 128 + 64;
                                this.field243 = this.method97(this.field242, this.field244, (byte) -103, this.field307) - this.field386;
                            }
                            this.field367 = -1;
                            return true;
                        }
                        signlink.reporterror("T1 - " + this.field367 + "," + this.field366 + " - " + this.field547 + "," + this.field548);
                        this.method28(0);
                        return true;
                    }
                    this.field315 = this.field177.method461();
                    if (this.field315 == 1) {
                        this.field202 = this.field177.method463();
                    }
                    if (this.field315 >= 2 && this.field315 <= 6) {
                        if (this.field315 == 2) {
                            this.field457 = 64;
                            this.field458 = 64;
                        }
                        if (this.field315 == 3) {
                            this.field457 = 0;
                            this.field458 = 64;
                        }
                        if (this.field315 == 4) {
                            this.field457 = 128;
                            this.field458 = 64;
                        }
                        if (this.field315 == 5) {
                            this.field457 = 64;
                            this.field458 = 0;
                        }
                        if (this.field315 == 6) {
                            this.field457 = 64;
                            this.field458 = 128;
                        }
                        this.field315 = 2;
                        this.field454 = this.field177.method463();
                        this.field455 = this.field177.method463();
                        this.field456 = this.field177.method461();
                    }
                    if (this.field315 == 10) {
                        this.field492 = this.field177.method463();
                    }
                    this.field367 = -1;
                    return true;
                }
                int var85 = this.field141;
                int var86 = this.field142;
                if (this.field367 == 120) {
                    var86 = this.field177.method490((byte) 3);
                    var85 = this.field177.method490((byte) 3);
                    this.field528 = false;
                }
                if (this.field367 == 95) {
                    this.field177.method471(0);
                    int var87 = 0;
                    while (true) {
                        if (var87 >= 4) {
                            this.field177.method473(true);
                            var85 = this.field177.method490((byte) 3);
                            var86 = this.field177.method489((byte) -107);
                            this.field528 = true;
                            break;
                        }
                        for (int var88 = 0; var88 < 13; ++var88) {
                            for (int var89 = 0; var89 < 13; ++var89) {
                                int var90 = this.field177.method472(-34994, 1);
                                if (var90 == 1) {
                                    this.field446[var87][var88][var89] = this.field177.method472(-34994, 26);
                                } else {
                                    this.field446[var87][var88][var89] = -1;
                                }
                            }
                        }
                        ++var87;
                    }
                }
                if (this.field141 == var85 && this.field142 == var86 && this.field302 == 2) {
                    this.field367 = -1;
                    return true;
                }
                this.field141 = var85;
                this.field142 = var86;
                this.field96 = (this.field141 - 6) * 8;
                this.field97 = (this.field142 - 6) * 8;
                this.field327 = false;
                if ((this.field141 / 8 == 48 || this.field141 / 8 == 49) && this.field142 / 8 == 48) {
                    this.field327 = true;
                }
                if (this.field141 / 8 == 48 && this.field142 / 8 == 148) {
                    this.field327 = true;
                }
                this.field302 = 1;
                this.field493 = System.currentTimeMillis();
                this.method29("Loading - please wait.", (String) null, -946);
                if (this.field367 == 120) {
                    int var91 = 0;
                    int var92 = (this.field141 - 6) / 8;
                    label1195: while (true) {
                        if (var92 > (this.field141 + 6) / 8) {
                            this.field261 = new byte[var91][];
                            this.field459 = new byte[var91][];
                            this.field310 = new int[var91];
                            this.field311 = new int[var91];
                            this.field312 = new int[var91];
                            int var94 = 0;
                            int var95 = (this.field141 - 6) / 8;
                            while (true) {
                                if (var95 > (this.field141 + 6) / 8) {
                                    break label1195;
                                }
                                for (int var96 = (this.field142 - 6) / 8; var96 <= (this.field142 + 6) / 8; ++var96) {
                                    this.field310[var94] = (var95 << 8) + var96;
                                    if (this.field327 && (var96 == 49 || var96 == 149 || var96 == 147 || var95 == 50 || var95 == 49 && var96 == 47)) {
                                        this.field311[var94] = -1;
                                        this.field312[var94] = -1;
                                        ++var94;
                                    } else {
                                        int var97 = this.field311[var94] = this.field530.method259(0, var95, false, var96);
                                        if (var97 != -1) {
                                            this.field530.method245(3, var97);
                                        }
                                        int var98 = this.field312[var94] = this.field530.method259(1, var95, false, var96);
                                        if (var98 != -1) {
                                            this.field530.method245(3, var98);
                                        }
                                        ++var94;
                                    }
                                }
                                ++var95;
                            }
                        }
                        for (int var93 = (this.field142 - 6) / 8; var93 <= (this.field142 + 6) / 8; ++var93) {
                            ++var91;
                        }
                        ++var92;
                    }
                }
                if (this.field367 == 95) {
                    int var99 = 0;
                    int[] var100 = new int[676];
                    int var101 = 0;
                    label1156: while (true) {
                        if (var101 >= 4) {
                            this.field261 = new byte[var99][];
                            this.field459 = new byte[var99][];
                            this.field310 = new int[var99];
                            this.field311 = new int[var99];
                            this.field312 = new int[var99];
                            int var109 = 0;
                            while (true) {
                                if (var109 >= var99) {
                                    break label1156;
                                }
                                int var110 = this.field310[var109] = var100[var109];
                                int var111 = var110 >> 8 & 255;
                                int var112 = var110 & 255;
                                int var113 = this.field311[var109] = this.field530.method259(0, var111, false, var112);
                                if (var113 != -1) {
                                    this.field530.method245(3, var113);
                                }
                                int var114 = this.field312[var109] = this.field530.method259(1, var111, false, var112);
                                if (var114 != -1) {
                                    this.field530.method245(3, var114);
                                }
                                ++var109;
                            }
                        }
                        for (int var102 = 0; var102 < 13; ++var102) {
                            for (int var103 = 0; var103 < 13; ++var103) {
                                int var104 = this.field446[var101][var102][var103];
                                if (var104 != -1) {
                                    int var105 = var104 >> 14 & 1023;
                                    int var106 = var104 >> 3 & 2047;
                                    int var107 = (var105 / 8 << 8) + var106 / 8;
                                    for (int var108 = 0; var108 < var99; ++var108) {
                                        if (var100[var108] == var107) {
                                            var107 = -1;
                                            break;
                                        }
                                    }
                                    if (var107 != -1) {
                                        var100[var99++] = var107;
                                    }
                                }
                            }
                        }
                        ++var101;
                    }
                }
                int var115 = this.field96 - this.field98;
                int var116 = this.field97 - this.field99;
                this.field98 = this.field96;
                this.field99 = this.field97;
                for (int var117 = 0; var117 < 16384; ++var117) {
                    class42 var118 = this.field194[var117];
                    if (var118 != null) {
                        for (int var119 = 0; var119 < 10; ++var119) {
                            var118.field1125[var119] -= var115;
                            var118.field1126[var119] -= var116;
                        }
                        var118.field1078 -= var115 * 128;
                        var118.field1079 -= var116 * 128;
                    }
                }
                for (int var120 = 0; var120 < this.field473; ++var120) {
                    class27 var121 = this.field475[var120];
                    if (var121 != null) {
                        for (int var122 = 0; var122 < 10; ++var122) {
                            var121.field1125[var122] -= var115;
                            var121.field1126[var122] -= var116;
                        }
                        var121.field1078 -= var115 * 128;
                        var121.field1079 -= var116 * 128;
                    }
                }
                this.field353 = true;
                byte var123 = 0;
                byte var124 = 104;
                byte var125 = 1;
                if (var115 < 0) {
                    var123 = 103;
                    var124 = -1;
                    var125 = -1;
                }
                byte var126 = 0;
                byte var127 = 104;
                byte var128 = 1;
                if (var116 < 0) {
                    var126 = 103;
                    var127 = -1;
                    var128 = -1;
                }
                for (int var129 = var123; var124 != var129; var129 += var125) {
                    for (int var130 = var126; var127 != var130; var130 += var128) {
                        int var131 = var115 + var129;
                        int var132 = var116 + var130;
                        for (int var133 = 0; var133 < 4; ++var133) {
                            if (var131 >= 0 && var132 >= 0 && var131 < 104 && var132 < 104) {
                                this.field164[var133][var129][var130] = this.field164[var133][var131][var132];
                            } else {
                                this.field164[var133][var129][var130] = null;
                            }
                        }
                    }
                }
                for (class6 var134 = (class6) this.field153.method181(); var134 != null; var134 = (class6) this.field153.method183((byte) 6)) {
                    var134.field58 -= var115;
                    var134.field59 -= var116;
                    if (var134.field58 < 0 || var134.field59 < 0 || var134.field58 >= 104 || var134.field59 >= 104) {
                        var134.method331();
                    }
                }
                if (this.field425 != 0) {
                    this.field425 -= var115;
                    this.field426 -= var116;
                }
                this.field420 = false;
                this.field367 = -1;
                return true;
            } catch (IOException var191) {
                this.method43(-3593);
            } catch (Exception var192) {
                String var188 = "T2 - " + this.field367 + "," + this.field547 + "," + this.field548 + " - " + this.field366 + "," + (field147.field1125[0] + this.field96) + "," + (field147.field1126[0] + this.field97) + " - ";
                for (int var189 = 0; var189 < this.field366 && var189 < 50; ++var189) {
                    var188 = var188 + this.field177.field1433[var189] + ",";
                }
                signlink.reporterror(var188);
                this.method28(0);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIIIIII)V")
    private final void method117(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        class6 var11 = null;
        for (class6 var12 = (class6) this.field153.method181(); var12 != null; var12 = (class6) this.field153.method183((byte) 6)) {
            if (var12.field56 == arg6 && var12.field58 == arg7 && var12.field59 == arg8 && var12.field57 == arg3) {
                var11 = var12;
                break;
            }
        }
        if (var11 == null) {
            var11 = new class6();
            var11.field56 = arg6;
            var11.field57 = arg3;
            var11.field58 = arg7;
            var11.field59 = arg8;
            this.method156(var11, (byte) 39);
            this.field153.method178(var11);
        }
        var11.field60 = arg9;
        var11.field62 = arg4;
        var11.field61 = arg1;
        var11.field66 = arg5;
        if (arg2 < 0) {
            var11.field67 = arg0;
        }
    }

    @OriginalMember(owner = "client!client", name = "C", descriptor = "(I)V")
    public final void method118(int arg0) {
        if (this.field452 != 0) {
            int var2 = 0;
            if (this.field180 != 0) {
                var2 = 1;
            }
            for (int var3 = 0; var3 < 100; ++var3) {
                if (this.field224[var3] != null) {
                    int var4 = this.field222[var3];
                    String var5 = this.field223[var3];
                    boolean var6 = false;
                    if (var5 != null && var5.startsWith("@cr1@")) {
                        var5 = var5.substring(5);
                        boolean var7 = true;
                    }
                    if (var5 != null && var5.startsWith("@cr2@")) {
                        var5 = var5.substring(5);
                        boolean var8 = true;
                    }
                    if ((var4 == 3 || var4 == 7) && (var4 == 7 || this.field104 == 0 || this.field104 == 1 && this.method16(var5, 38775))) {
                        int var9 = 329 - var2 * 13;
                        if (super.field1573 > 4 && super.field1574 - 4 > var9 - 10 && super.field1574 - 4 <= var9 + 3) {
                            int var10 = this.field507.method362("From:  " + var5 + this.field224[var3], 443) + 25;
                            if (var10 > 450) {
                                var10 = 450;
                            }
                            if (super.field1573 < var10 + 4) {
                                if (this.field101 >= 1) {
                                    this.field441[this.field439] = "Report abuse @whi@" + var5;
                                    this.field264[this.field439] = 2591;
                                    ++this.field439;
                                }
                                this.field441[this.field439] = "Add ignore @whi@" + var5;
                                this.field264[this.field439] = 2673;
                                ++this.field439;
                                this.field441[this.field439] = "Add friend @whi@" + var5;
                                this.field264[this.field439] = 2839;
                                ++this.field439;
                            }
                        }
                        ++var2;
                        if (var2 >= 5) {
                            return;
                        }
                    }
                    if ((var4 == 5 || var4 == 6) && this.field104 < 2) {
                        ++var2;
                        if (var2 >= 5) {
                            return;
                        }
                    }
                }
            }
            this.field366 += arg0;
        }
    }

    @OriginalMember(owner = "client!client", name = "D", descriptor = "(I)V")
    public final void method119(int arg0) {
        if (this.field180 > 1) {
            --this.field180;
        }
        if (this.field370 > 0) {
            --this.field370;
        }
        for (int var2 = 0; var2 < 5 && this.method116(false); ++var2) {
        }
        if (this.field355) {
            Object var3 = this.field124.field881;
            synchronized (this.field124.field881) {
                if (!field205) {
                    this.field124.field877 = 0;
                } else if (super.field1579 != 0 || this.field124.field877 >= 40) {
                    this.field395.method450(7, 51);
                    this.field395.method451(0);
                    int var4 = this.field395.field1434;
                    int var5 = 0;
                    for (int var6 = 0; var6 < this.field124.field877 && var4 - this.field395.field1434 < 240; ++var6) {
                        ++var5;
                        int var7 = this.field124.field878[var6];
                        if (var7 < 0) {
                            var7 = 0;
                        } else if (var7 > 502) {
                            var7 = 502;
                        }
                        int var8 = this.field124.field880[var6];
                        if (var8 < 0) {
                            var8 = 0;
                        } else if (var8 > 764) {
                            var8 = 764;
                        }
                        int var9 = var7 * 765 + var8;
                        if (this.field124.field878[var6] == -1 && this.field124.field880[var6] == -1) {
                            var8 = -1;
                            var7 = -1;
                            var9 = 524287;
                        }
                        if (this.field159 == var8 && this.field160 == var7) {
                            if (this.field322 < 2047) {
                                ++this.field322;
                            }
                        } else {
                            int var10 = var8 - this.field159;
                            this.field159 = var8;
                            int var11 = var7 - this.field160;
                            this.field160 = var7;
                            if (this.field322 < 8 && var10 >= -32 && var10 <= 31 && var11 >= -32 && var11 <= 31) {
                                var10 += 32;
                                var11 += 32;
                                this.field395.method452((this.field322 << 12) + (var10 << 6) + var11);
                                this.field322 = 0;
                            } else if (this.field322 < 8) {
                                this.field395.method454((this.field322 << 19) + 8388608 + var9);
                                this.field322 = 0;
                            } else {
                                this.field395.method455((this.field322 << 19) + -1073741824 + var9);
                                this.field322 = 0;
                            }
                        }
                    }
                    this.field395.method460(true, this.field395.field1434 - var4);
                    if (var5 >= this.field124.field877) {
                        this.field124.field877 = 0;
                    } else {
                        this.field124.field877 -= var5;
                        for (int var12 = 0; var12 < this.field124.field877; ++var12) {
                            this.field124.field880[var12] = this.field124.field880[var5 + var12];
                            this.field124.field878[var12] = this.field124.field878[var5 + var12];
                        }
                    }
                }
            }
            if (super.field1579 != 0) {
                long var13 = (super.field1582 - this.field411) / 50L;
                if (var13 > 4095L) {
                    var13 = 4095L;
                }
                this.field411 = super.field1582;
                int var15 = super.field1581;
                if (var15 < 0) {
                    var15 = 0;
                } else if (var15 > 502) {
                    var15 = 502;
                }
                int var16 = super.field1580;
                if (var16 < 0) {
                    var16 = 0;
                } else if (var16 > 764) {
                    var16 = 764;
                }
                int var17 = var15 * 765 + var16;
                byte var18 = 0;
                if (super.field1579 == 2) {
                    var18 = 1;
                }
                int var19 = (int) var13;
                this.field395.method450(7, 27);
                this.field395.method455((var18 << 19) + (var19 << 20) + var17);
            }
            if (this.field297 > 0) {
                --this.field297;
            }
            if (super.field1583[1] == 1 || super.field1583[2] == 1 || super.field1583[3] == 1 || super.field1583[4] == 1) {
                this.field298 = true;
            }
            if (this.field298 && this.field297 <= 0) {
                this.field297 = 20;
                this.field298 = false;
                this.field395.method450(7, 166);
                this.field395.method487(this.field284, false);
                this.field395.method486(this.field283, false);
            }
            if (super.field1570 && !this.field105) {
                this.field105 = true;
                this.field395.method450(7, 111);
                this.field395.method451(1);
            }
            if (!super.field1570 && this.field105) {
                this.field105 = false;
                this.field395.method450(7, 111);
                this.field395.method451(0);
            }
            this.method149(1247);
            this.method151(-174);
            this.method74(2);
            ++this.field368;
            if (this.field368 > 750) {
                this.method43(-3593);
            }
            this.method86(false);
            this.method103(21350);
            this.method132(-801);
            ++this.field324;
            if (this.field345 != 0) {
                this.field344 += 20;
                if (this.field344 >= 400) {
                    this.field345 = 0;
                }
            }
            if (this.field91 != 0) {
                ++this.field88;
                if (this.field88 >= 15) {
                    if (this.field91 == 2) {
                        this.field405 = true;
                    }
                    if (this.field91 == 3) {
                        this.field472 = true;
                    }
                    this.field91 = 0;
                }
            }
            if (this.field318 != 0) {
                ++this.field468;
                if (super.field1573 > this.field319 + 5 || super.field1573 < this.field319 - 5 || super.field1574 > this.field320 + 5 || super.field1574 < this.field320 - 5) {
                    this.field213 = true;
                }
                if (super.field1572 == 0) {
                    if (this.field318 == 2) {
                        this.field405 = true;
                    }
                    if (this.field318 == 3) {
                        this.field472 = true;
                    }
                    this.field318 = 0;
                    if (this.field213 && this.field468 >= 5) {
                        this.field288 = -1;
                        this.method84(true);
                        if (this.field316 == this.field288 && this.field317 != this.field287) {
                            class34 var20 = class34.method339(this.field316);
                            byte var21 = 0;
                            if (this.field92 == 1 && var20.field1012 == 206) {
                                var21 = 1;
                            }
                            if (var20.field1061[this.field287] <= 0) {
                                var21 = 0;
                            }
                            if (var20.field1011) {
                                int var22 = this.field317;
                                int var23 = this.field287;
                                var20.field1061[var23] = var20.field1061[var22];
                                var20.field1048[var23] = var20.field1048[var22];
                                var20.field1061[var22] = -1;
                                var20.field1048[var22] = 0;
                            } else if (var21 == 1) {
                                int var24 = this.field317;
                                int var25 = this.field287;
                                while (var24 != var25) {
                                    if (var24 > var25) {
                                        var20.method340(var24 - 1, var24, 0);
                                        --var24;
                                    } else if (var24 < var25) {
                                        var20.method340(var24 + 1, var24, 0);
                                        ++var24;
                                    }
                                }
                            } else {
                                var20.method340(this.field287, this.field317, 0);
                            }
                            this.field395.method450(7, 21);
                            this.field395.method452(this.field316);
                            this.field395.method452(this.field317);
                            this.field395.method451(var21);
                            this.field395.method485(false, this.field287);
                        }
                    } else if ((this.field419 == 1 || this.method50(this.field439 - 1, (byte) 119)) && this.field439 > 2) {
                        this.method13(25871);
                    } else if (this.field439 > 0) {
                        this.method143(true, this.field439 - 1);
                    }
                    this.field88 = 10;
                    super.field1579 = 0;
                }
            }
            if (class13.field674 != -1) {
                int var26 = class13.field674;
                int var27 = class13.field675;
                boolean var28 = this.method92(0, 0, 0, 0, 0, field147.field1125[0], 0, true, field147.field1126[0], 0, var27, var26);
                class13.field674 = -1;
                if (var28) {
                    this.field342 = super.field1580;
                    this.field343 = super.field1581;
                    this.field345 = 1;
                    this.field344 = 0;
                }
            }
            if (super.field1579 == 1 && this.field304 != null) {
                this.field304 = null;
                this.field472 = true;
                super.field1579 = 0;
            }
            this.method61(false);
            if (this.field432 == -1) {
                this.method90(0);
                this.method122((byte) -107);
                this.method14(187);
            }
            if (super.field1572 == 1 || super.field1579 == 1) {
                ++this.field433;
            }
            if (this.field333 == 0 && this.field248 == 0 && this.field525 == 0) {
                if (this.field404 > 0) {
                    --this.field404;
                }
            } else if (this.field404 < 100) {
                ++this.field404;
                if (this.field404 == 100) {
                    if (this.field333 != 0) {
                        this.field472 = true;
                    }
                    if (this.field248 != 0) {
                        this.field405 = true;
                    }
                }
            }
            if (this.field302 == 2) {
                this.method85(847);
            }
            if (this.field302 == 2 && this.field420) {
                this.method60(0);
            }
            for (int var29 = 0; var29 < 5; ++var29) {
                int var10002 = this.field371[var29]++;
            }
            this.method39(-39493);
            ++field511;
            if (field511 > 1804) {
                field511 = 0;
                this.field395.method450(7, 69);
                this.field395.method451(0);
                int var30 = this.field395.field1434;
                this.field395.method451((int) (Math.random() * 256.0D));
                this.field395.method451(212);
                this.field395.method452(25280);
                this.field395.method452((int) (Math.random() * 65536.0D));
                this.field395.method452((int) (Math.random() * 65536.0D));
                this.field395.method451((int) (Math.random() * 256.0D));
                this.field395.method451(181);
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field395.method451(149);
                }
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field395.method451(90);
                }
                this.field395.method452((int) (Math.random() * 65536.0D));
                this.field395.method460(true, this.field395.field1434 - var30);
            }
            ++super.field1571;
            if (super.field1571 > 4500) {
                this.field370 = 250;
                super.field1571 -= 500;
                this.field395.method450(7, 244);
            }
            ++this.field210;
            if (this.field210 > 500) {
                this.field210 = 0;
                int var31 = (int) (Math.random() * 8.0D);
                if ((var31 & 1) == 1) {
                    this.field277 += this.field278;
                }
                if ((var31 & 2) == 2) {
                    this.field219 += this.field220;
                }
                if ((var31 & 4) == 4) {
                    this.field151 += this.field152;
                }
            }
            if (this.field277 < -50) {
                this.field278 = 2;
            }
            if (this.field277 > 50) {
                this.field278 = -2;
            }
            if (this.field219 < -55) {
                this.field220 = 2;
            }
            if (this.field219 > 55) {
                this.field220 = -2;
            }
            if (this.field151 < -40) {
                this.field152 = 1;
            }
            if (this.field151 > 40) {
                this.field152 = -1;
            }
            ++this.field398;
            while (arg0 >= 0) {
                this.field334 = 395;
            }
            if (this.field398 > 500) {
                this.field398 = 0;
                int var32 = (int) (Math.random() * 8.0D);
                if ((var32 & 1) == 1) {
                    this.field271 += this.field272;
                }
                if ((var32 & 2) == 2) {
                    this.field154 += this.field155;
                }
            }
            if (this.field271 < -60) {
                this.field272 = 2;
            }
            if (this.field271 > 60) {
                this.field272 = -2;
            }
            if (this.field154 < -20) {
                this.field155 = 1;
            }
            if (this.field154 > 10) {
                this.field155 = -1;
            }
            ++field166;
            if (field166 > 1148) {
                field166 = 0;
                this.field395.method450(7, 206);
                this.field395.method451(0);
                int var33 = this.field395.field1434;
                this.field395.method452((int) (Math.random() * 65536.0D));
                this.field395.method451(252);
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field395.method452(62952);
                }
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field395.method451(24);
                }
                this.field395.method451((int) (Math.random() * 256.0D));
                this.field395.method451(178);
                this.field395.method452(7452);
                this.field395.method451(12);
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field395.method452(44881);
                }
                this.field395.method451(10);
                this.field395.method460(true, this.field395.field1434 - var33);
            }
            ++this.field369;
            if (this.field369 > 50) {
                this.field395.method450(7, 89);
            }
            try {
                if (this.field74 != null && this.field395.field1434 > 0) {
                    this.field74.method411((byte) -32, 0, this.field395.field1434, this.field395.field1433);
                    this.field395.field1434 = 0;
                    this.field369 = 0;
                }
            } catch (IOException var35) {
                this.method43(-3593);
            } catch (Exception var36) {
                this.method28(0);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIB)Z")
    public final boolean method120(int arg0, int arg1, int arg2, byte arg3) {
        int var5 = arg2 >> 14 & 32767;
        int var6 = this.field78.method219(this.field307, arg0, arg1, arg2);
        if (var6 == -1) {
            return false;
        } else {
            int var7 = var6 & 31;
            int var8 = var6 >> 6 & 3;
            if (var7 != 10 && var7 != 11 && var7 != 22) {
                this.method92(0, var8, 0, 0, var7 + 1, field147.field1125[0], 2, true, field147.field1126[0], 0, arg1, arg0);
            } else {
                class47 var9 = class47.method417(var5);
                int var10;
                int var11;
                if (var8 != 0 && var8 != 2) {
                    var10 = var9.field1297;
                    var11 = var9.field1289;
                } else {
                    var10 = var9.field1289;
                    var11 = var9.field1297;
                }
                int var12 = var9.field1299;
                if (var8 != 0) {
                    var12 = (var12 >> 4 - var8) + (var12 << var8 & 15);
                }
                this.method92(0, 0, var11, var12, 0, field147.field1125[0], 2, true, field147.field1126[0], var10, arg1, arg0);
            }
            this.field342 = super.field1580;
            if (arg3 == 8) {
                boolean var13 = false;
            } else {
                this.field107 = 46;
            }
            this.field343 = super.field1581;
            this.field345 = 2;
            this.field344 = 0;
            return true;
        }
    }

    @OriginalMember(owner = "client!client", name = "l", descriptor = "(B)V")
    public final void method121(byte arg0) {
        if (arg0 != 108) {
            this.field164 = null;
        }
        while (true) {
            class33 var2 = this.field530.method261();
            if (var2 == null) {
                return;
            }
            if (var2.field991 == 0) {
                class19.method271(var2.field988, (byte) -73, var2.field989);
                if ((this.field530.method248(true, var2.field989) & 98) != 0) {
                    this.field405 = true;
                    if (this.field216 != -1 || this.field400 != -1) {
                        this.field472 = true;
                    }
                }
            }
            if (var2.field991 == 1 && var2.field988 != null) {
                class45.method403((byte) 9, var2.field988);
            }
            if (var2.field991 == 2 && this.field434 == var2.field989 && var2.field988 != null) {
                this.method139((byte) -70, var2.field988, this.field435);
            }
            if (var2.field991 == 3 && this.field302 == 1) {
                for (int var3 = 0; var3 < this.field261.length; ++var3) {
                    if (this.field311[var3] == var2.field989) {
                        this.field261[var3] = var2.field988;
                        if (var2.field988 == null) {
                            this.field311[var3] = -1;
                        }
                        break;
                    }
                    if (this.field312[var3] == var2.field989) {
                        this.field459[var3] = var2.field988;
                        if (var2.field988 == null) {
                            this.field312[var3] = -1;
                        }
                        break;
                    }
                }
            }
            if (var2.field991 == 93 && this.field530.method263(var2.field989, (byte) 8)) {
                class64.method572(new class52(var2.field988, true), this.field530, 923);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "m", descriptor = "(B)V")
    public final void method122(byte arg0) {
        if (arg0 != -107) {
            this.field164 = null;
        }
        if (super.field1579 == 1) {
            if (super.field1580 >= 539 && super.field1580 <= 573 && super.field1581 >= 169 && super.field1581 < 205 && this.field535[0] != -1) {
                this.field405 = true;
                this.field536 = 0;
                this.field499 = true;
            }
            if (super.field1580 >= 569 && super.field1580 <= 599 && super.field1581 >= 168 && super.field1581 < 205 && this.field535[1] != -1) {
                this.field405 = true;
                this.field536 = 1;
                this.field499 = true;
            }
            if (super.field1580 >= 597 && super.field1580 <= 627 && super.field1581 >= 168 && super.field1581 < 205 && this.field535[2] != -1) {
                this.field405 = true;
                this.field536 = 2;
                this.field499 = true;
            }
            if (super.field1580 >= 625 && super.field1580 <= 669 && super.field1581 >= 168 && super.field1581 < 203 && this.field535[3] != -1) {
                this.field405 = true;
                this.field536 = 3;
                this.field499 = true;
            }
            if (super.field1580 >= 666 && super.field1580 <= 696 && super.field1581 >= 168 && super.field1581 < 205 && this.field535[4] != -1) {
                this.field405 = true;
                this.field536 = 4;
                this.field499 = true;
            }
            if (super.field1580 >= 694 && super.field1580 <= 724 && super.field1581 >= 168 && super.field1581 < 205 && this.field535[5] != -1) {
                this.field405 = true;
                this.field536 = 5;
                this.field499 = true;
            }
            if (super.field1580 >= 722 && super.field1580 <= 756 && super.field1581 >= 169 && super.field1581 < 205 && this.field535[6] != -1) {
                this.field405 = true;
                this.field536 = 6;
                this.field499 = true;
            }
            if (super.field1580 >= 540 && super.field1580 <= 574 && super.field1581 >= 466 && super.field1581 < 502 && this.field535[7] != -1) {
                this.field405 = true;
                this.field536 = 7;
                this.field499 = true;
            }
            if (super.field1580 >= 572 && super.field1580 <= 602 && super.field1581 >= 466 && super.field1581 < 503 && this.field535[8] != -1) {
                this.field405 = true;
                this.field536 = 8;
                this.field499 = true;
            }
            if (super.field1580 >= 599 && super.field1580 <= 629 && super.field1581 >= 466 && super.field1581 < 503 && this.field535[9] != -1) {
                this.field405 = true;
                this.field536 = 9;
                this.field499 = true;
            }
            if (super.field1580 >= 627 && super.field1580 <= 671 && super.field1581 >= 467 && super.field1581 < 502 && this.field535[10] != -1) {
                this.field405 = true;
                this.field536 = 10;
                this.field499 = true;
            }
            if (super.field1580 >= 669 && super.field1580 <= 699 && super.field1581 >= 466 && super.field1581 < 503 && this.field535[11] != -1) {
                this.field405 = true;
                this.field536 = 11;
                this.field499 = true;
            }
            if (super.field1580 >= 696 && super.field1580 <= 726 && super.field1581 >= 466 && super.field1581 < 503 && this.field535[12] != -1) {
                this.field405 = true;
                this.field536 = 12;
                this.field499 = true;
            }
            if (super.field1580 >= 724 && super.field1580 <= 758 && super.field1581 >= 466 && super.field1581 < 502 && this.field535[13] != -1) {
                this.field405 = true;
                this.field536 = 13;
                this.field499 = true;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
    public final void init() {
        field502 = Integer.parseInt(this.getParameter("nodeid"));
        field503 = Integer.parseInt(this.getParameter("portoff"));
        String var1 = this.getParameter("lowmem");
        if (var1 != null && var1.equals("1")) {
            method127((byte) 30);
        } else {
            method153(true);
        }
        String var2 = this.getParameter("free");
        if (var2 != null && var2.equals("1")) {
            field504 = false;
        } else {
            field504 = true;
        }
        this.method554(765, 503, 0);
    }

    @OriginalMember(owner = "client!client", name = "E", descriptor = "(I)V")
    public final void method123(int arg0) {
        if (arg0 >= 0) {
            this.method155();
        }
        try {
            this.field444 = -1;
            this.field529.method185();
            this.field149.method185();
            class48.method427(this.field465);
            this.method95(8);
            this.field78.method189(7);
            System.gc();
            for (int var2 = 0; var2 < 4; ++var2) {
                this.field408[var2].method380();
            }
            for (int var3 = 0; var3 < 4; ++var3) {
                for (int var4 = 0; var4 < 104; ++var4) {
                    for (int var5 = 0; var5 < 104; ++var5) {
                        this.field252[var3][var4][var5] = 0;
                    }
                }
            }
            class64 var6 = new class64(this.field412, this.field252, 104, (byte) 36, 104);
            int var7 = this.field261.length;
            this.field395.method450(7, 89);
            if (!this.field528) {
                for (int var8 = 0; var8 < var7; ++var8) {
                    int var9 = (this.field310[var8] >> 8) * 64 - this.field96;
                    int var10 = (this.field310[var8] & 255) * 64 - this.field97;
                    byte[] var11 = this.field261[var8];
                    if (var11 != null) {
                        var6.method563((this.field142 - 6) * 8, this.field408, -39848, var11, var9, var10, (this.field141 - 6) * 8);
                    }
                }
                for (int var12 = 0; var12 < var7; ++var12) {
                    int var13 = (this.field310[var12] >> 8) * 64 - this.field96;
                    int var14 = (this.field310[var12] & 255) * 64 - this.field97;
                    byte[] var15 = this.field261[var12];
                    if (var15 == null && this.field142 < 800) {
                        var6.method579(var13, 0, var14, 64, 64);
                    }
                }
                this.field395.method450(7, 89);
                for (int var16 = 0; var16 < var7; ++var16) {
                    byte[] var17 = this.field459[var16];
                    if (var17 != null) {
                        int var18 = (this.field310[var16] >> 8) * 64 - this.field96;
                        int var19 = (this.field310[var16] & 255) * 64 - this.field97;
                        var6.method578(var17, var18, 6107, this.field78, var19, this.field408);
                    }
                }
            }
            if (this.field528) {
                int var20 = 0;
                label254: while (true) {
                    if (var20 >= 4) {
                        for (int var31 = 0; var31 < 13; ++var31) {
                            for (int var32 = 0; var32 < 13; ++var32) {
                                int var33 = this.field446[0][var31][var32];
                                if (var33 == -1) {
                                    var6.method579(var31 * 8, 0, var32 * 8, 8, 8);
                                }
                            }
                        }
                        this.field395.method450(7, 89);
                        int var34 = 0;
                        while (true) {
                            if (var34 >= 4) {
                                break label254;
                            }
                            for (int var35 = 0; var35 < 13; ++var35) {
                                for (int var36 = 0; var36 < 13; ++var36) {
                                    int var37 = this.field446[var34][var35][var36];
                                    if (var37 != -1) {
                                        int var38 = var37 >> 24 & 3;
                                        int var39 = var37 >> 1 & 3;
                                        int var40 = var37 >> 14 & 1023;
                                        int var41 = var37 >> 3 & 2047;
                                        int var42 = (var40 / 8 << 8) + var41 / 8;
                                        for (int var43 = 0; var43 < this.field310.length; ++var43) {
                                            if (this.field310[var43] == var42 && this.field459[var43] != null) {
                                                var6.method581(var36 * 8, var39, (var41 & 7) * 8, (var40 & 7) * 8, this.field408, var38, -192, this.field459[var43], var35 * 8, this.field78, var34);
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
                            int var24 = this.field446[var20][var21][var22];
                            if (var24 != -1) {
                                int var25 = var24 >> 24 & 3;
                                int var26 = var24 >> 1 & 3;
                                int var27 = var24 >> 14 & 1023;
                                int var28 = var24 >> 3 & 2047;
                                int var29 = (var27 / 8 << 8) + var28 / 8;
                                for (int var30 = 0; var30 < this.field310.length; ++var30) {
                                    if (this.field310[var30] == var29 && this.field261[var30] != null) {
                                        var6.method580(var26, (var28 & 7) * 8, (var27 & 7) * 8, this.field261[var30], (byte) 74, var21 * 8, var22 * 8, var20, var25, this.field408);
                                        var23 = true;
                                        break;
                                    }
                                }
                            }
                            if (!var23) {
                                var6.method568(false, var22 * 8, var21 * 8, var20);
                            }
                        }
                    }
                    ++var20;
                }
            }
            this.field395.method450(7, 89);
            var6.method574(this.field78, this.field408, 9);
            if (this.field542 != null) {
                this.field542.method316(-439);
                class48.field1331 = this.field185;
            }
            this.field395.method450(7, 89);
            int var44 = class64.field1648;
            if (var44 > this.field307) {
                var44 = this.field307;
            }
            if (var44 < this.field307 - 1) {
                int var45 = this.field307 - 1;
            }
            if (field505) {
                this.field78.method190(116, class64.field1648);
            } else {
                this.field78.method190(116, 0);
            }
            for (int var46 = 0; var46 < 104; ++var46) {
                for (int var47 = 0; var47 < 104; ++var47) {
                    this.method67(var46, var47);
                }
            }
            this.method24(false);
        } catch (Exception var60) {
        }
        class47.field1282.method177();
        if (super.field1568 != null) {
            this.field395.method450(7, 226);
            this.field395.method455(1057001181);
        }
        if (field505 && signlink.cache_dat != null) {
            int var49 = this.field530.method244(0, 0);
            for (int var50 = 0; var50 < var49; ++var50) {
                int var51 = this.field530.method248(true, var50);
                if ((var51 & 121) == 0) {
                    class19.method272(var50, -33282);
                }
            }
        }
        System.gc();
        class48.method428(107, 20);
        this.field530.method260(347);
        int var52 = (this.field141 - 6) / 8 - 1;
        int var53 = (this.field141 + 6) / 8 + 1;
        int var54 = (this.field142 - 6) / 8 - 1;
        int var55 = (this.field142 + 6) / 8 + 1;
        if (this.field327) {
            var52 = 49;
            var53 = 50;
            var54 = 49;
            var55 = 50;
        }
        for (int var56 = var52; var56 <= var53; ++var56) {
            for (int var57 = var54; var57 <= var55; ++var57) {
                if (var52 == var56 || var53 == var56 || var54 == var57 || var55 == var57) {
                    int var58 = this.field530.method259(0, var56, false, var57);
                    if (var58 != -1) {
                        this.field530.method262(var58, 3, -751);
                    }
                    int var59 = this.field530.method259(1, var56, false, var57);
                    if (var59 != -1) {
                        this.field530.method262(var59, 3, -751);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IILSVWJKJVI;)V")
    private final void method124(int arg0, int arg1, class52 arg2) {
        while (true) {
            if (arg2.field1435 + 10 < arg1 * 8) {
                int var4 = arg2.method472(-34994, 11);
                if (var4 != 2047) {
                    if (this.field475[var4] == null) {
                        this.field475[var4] = new class27();
                        if (this.field480[var4] != null) {
                            this.field475[var4].method324(0, this.field480[var4]);
                        }
                    }
                    this.field477[this.field476++] = var4;
                    class27 var5 = this.field475[var4];
                    var5.field1108 = field346;
                    int var6 = arg2.method472(-34994, 5);
                    if (var6 > 15) {
                        var6 -= 32;
                    }
                    int var7 = arg2.method472(-34994, 1);
                    int var8 = arg2.method472(-34994, 1);
                    if (var8 == 1) {
                        this.field479[this.field478++] = var4;
                    }
                    int var9 = arg2.method472(-34994, 5);
                    if (var9 > 15) {
                        var9 -= 32;
                    }
                    var5.method344(field147.field1126[0] + var6, var7 == 1, this.field429, field147.field1125[0] + var9);
                    continue;
                }
            }
            arg2.method473(true);
            if (arg0 >= 0) {
                this.field510 = this.field482.method375();
                return;
            }
            return;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIIII)V")
    private final void method125(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field366 += arg1;
        if (arg5 >= 1 && arg2 >= 1 && arg5 <= 102 && arg2 <= 102) {
            if (field505 && this.field307 != arg3) {
                return;
            }
            int var9 = 0;
            boolean var10 = true;
            boolean var11 = false;
            boolean var12 = false;
            if (arg0 == 0) {
                var9 = this.field78.method215(arg3, arg5, arg2);
            }
            if (arg0 == 1) {
                var9 = this.field78.method216(arg3, arg5, arg2, 0);
            }
            if (arg0 == 2) {
                var9 = this.field78.method217(arg3, arg5, arg2);
            }
            if (arg0 == 3) {
                var9 = this.field78.method218(arg3, arg5, arg2);
            }
            if (var9 != 0) {
                int var13 = this.field78.method219(arg3, arg5, arg2, var9);
                int var14 = var9 >> 14 & 32767;
                int var15 = var13 & 31;
                int var16 = var13 >> 6;
                if (arg0 == 0) {
                    this.field78.method206(arg3, 0, arg2, arg5);
                    class47 var17 = class47.method417(var14);
                    if (var17.field1270) {
                        this.field408[arg3].method385(var16, var17.field1278, arg2, arg5, var15, false);
                    }
                }
                if (arg0 == 1) {
                    this.field78.method207(arg3, arg5, arg2, 5);
                }
                if (arg0 == 2) {
                    this.field78.method208(arg5, false, arg2, arg3);
                    class47 var18 = class47.method417(var14);
                    if (var18.field1289 + arg5 > 103 || var18.field1289 + arg2 > 103 || var18.field1297 + arg5 > 103 || var18.field1297 + arg2 > 103) {
                        return;
                    }
                    if (var18.field1270) {
                        this.field408[arg3].method386(var16, arg5, var18.field1278, arg2, var18.field1289, var18.field1297, false);
                    }
                }
                if (arg0 == 3) {
                    this.field78.method209(arg2, 14726, arg3, arg5);
                    class47 var19 = class47.method417(var14);
                    if (var19.field1270 && var19.field1290) {
                        this.field408[arg3].method388(true, arg5, arg2);
                    }
                }
            }
            if (arg6 >= 0) {
                int var20 = arg3;
                if (arg3 < 3 && (this.field252[1][arg5][arg2] & 2) == 2) {
                    var20 = arg3 + 1;
                }
                class64.method575(arg5, this.field412, arg6, true, arg7, this.field408[arg3], this.field78, arg3, var20, arg4, arg2);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(LNHFASBOX;IIBIIIII)V")
    public final void method126(class34 arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (this.field294) {
            this.field380 = 32;
        } else {
            this.field380 = 0;
        }
        this.field294 = false;
        if (arg3 != -92) {
            this.field416 = -369;
        }
        if (arg5 >= arg7 && arg5 < arg7 + 16 && arg8 >= arg1 && arg8 < arg1 + 16) {
            arg0.field1044 -= this.field433 * 4;
            if (arg2 == 1) {
                this.field405 = true;
            }
            if (arg2 == 2 || arg2 == 3) {
                this.field472 = true;
            }
        } else if (arg5 >= arg7 && arg5 < arg7 + 16 && arg8 >= arg1 + arg4 - 16 && arg8 < arg1 + arg4) {
            arg0.field1044 += this.field433 * 4;
            if (arg2 == 1) {
                this.field405 = true;
            }
            if (arg2 == 2 || arg2 == 3) {
                this.field472 = true;
            }
        } else if (arg5 >= arg7 - this.field380 && arg5 < arg7 + 16 + this.field380 && arg8 >= arg1 + 16 && arg8 < arg1 + arg4 - 16 && this.field433 > 0) {
            int var10 = (arg4 - 32) * arg4 / arg6;
            if (var10 < 8) {
                var10 = 8;
            }
            int var11 = arg8 - arg1 - 16 - var10 / 2;
            int var12 = arg4 - 32 - var10;
            arg0.field1044 = (arg6 - arg4) * var11 / var12;
            if (arg2 == 1) {
                this.field405 = true;
            }
            if (arg2 == 2 || arg2 == 3) {
                this.field472 = true;
            }
            this.field294 = true;
        }
    }

    @OriginalMember(owner = "client!client", name = "n", descriptor = "(B)V")
    public static final void method127(byte arg0) {
        class13.field640 = true;
        class48.field1320 = true;
        if (arg0 != 30) {
            field436 = 427;
        }
        field505 = true;
        class64.field1652 = true;
        class47.field1307 = true;
    }

    @OriginalMember(owner = "client!client", name = "F", descriptor = "(I)V")
    public final void method128(int arg0) {
        if (arg0 <= 0) {
            field347 = 464;
        }
        signlink.midiplay = false;
        signlink.midifade = 0;
        signlink.midi = "stop";
    }

    @OriginalMember(owner = "client!client", name = "o", descriptor = "(B)V")
    public final void method129(byte arg0) {
        this.field540.method316(-439);
        if (arg0 == 9) {
            boolean var2 = false;
        } else {
            this.field241 = this.field482.method375();
        }
        class48.field1331 = this.field184;
        this.field121.method599(0, 0, (byte) 0);
        if (this.field268 != -1) {
            this.method65(class34.method339(this.field268), 0, 0, 0, 284);
        } else if (this.field535[this.field536] != -1) {
            this.method65(class34.method339(this.field535[this.field536]), 0, 0, 0, 284);
        }
        if (this.field498 && this.field168 == 1) {
            this.method136(true);
        }
        this.field540.method317(796, 205, 553, super.field1565);
        this.field542.method316(-439);
        class48.field1331 = this.field185;
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(BI)V")
    public final void method130(byte arg0, int arg1) {
        if (arg0 == 7) {
            if (!field505) {
                for (int var3 = 0; var3 < this.field496.length; ++var3) {
                    int var4 = this.field496[var3];
                    if (class48.field1339[var4] >= arg1) {
                        class72 var5 = class48.field1333[var4];
                        int var6 = var5.field1728 * var5.field1727 - 1;
                        int var7 = this.field324 * var5.field1727 * 2;
                        byte[] var8 = var5.field1725;
                        byte[] var9 = this.field349;
                        for (int var10 = 0; var10 <= var6; ++var10) {
                            var9[var10] = var8[var10 - var7 & var6];
                        }
                        var5.field1725 = var9;
                        this.field349 = var8;
                        class48.method431(var4, 931);
                        ++field365;
                        if (field365 > 1734) {
                            field365 = 0;
                            this.field395.method450(7, 217);
                            this.field395.method451(0);
                            int var11 = this.field395.field1434;
                            if ((int) (Math.random() * 2.0D) == 0) {
                                this.field395.method452(8354);
                            }
                            this.field395.method451((int) (Math.random() * 256.0D));
                            this.field395.method452((int) (Math.random() * 65536.0D));
                            this.field395.method452(46806);
                            this.field395.method452(61169);
                            this.field395.method451(228);
                            this.field395.method452((int) (Math.random() * 65536.0D));
                            this.field395.method452(22457);
                            this.field395.method451((int) (Math.random() * 256.0D));
                            this.field395.method451((int) (Math.random() * 256.0D));
                            this.field395.method460(true, this.field395.field1434 - var11);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILSVWJKJVI;B)V")
    private final void method131(int arg0, class52 arg1, byte arg2) {
        this.field300 = 0;
        this.field478 = 0;
        this.method17(arg1, arg0, (byte) 105);
        this.method33(arg1, arg0, (byte) 6);
        this.method98(arg1, arg0, 7);
        for (int var4 = 0; var4 < this.field300; ++var4) {
            int var6 = this.field301[var4];
            if (field346 != this.field194[var6].field1108) {
                this.field194[var6].field1196 = null;
                this.field194[var6] = null;
            }
        }
        if (arg2 == 1) {
            if (arg1.field1434 != arg0) {
                signlink.reporterror(this.field378 + " size mismatch in getnpcpos - pos:" + arg1.field1434 + " psize:" + arg0);
                throw new RuntimeException("eek");
            } else {
                for (int var5 = 0; var5 < this.field195; ++var5) {
                    if (this.field194[this.field196[var5]] == null) {
                        signlink.reporterror(this.field378 + " null entry in npc list - pos:" + var5 + " size:" + this.field195);
                        throw new RuntimeException("eek");
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "G", descriptor = "(I)V")
    public final void method132(int arg0) {
        for (int var2 = -1; var2 < this.field476; ++var2) {
            int var6;
            if (var2 == -1) {
                var6 = this.field474;
            } else {
                var6 = this.field477[var2];
            }
            class27 var7 = this.field475[var6];
            if (var7 != null && var7.field1112 > 0) {
                --var7.field1112;
                if (var7.field1112 == 0) {
                    var7.field1092 = null;
                }
            }
        }
        if (arg0 >= 0) {
            this.field367 = this.field177.method461();
        }
        for (int var3 = 0; var3 < this.field195; ++var3) {
            int var4 = this.field196[var3];
            class42 var5 = this.field194[var4];
            if (var5 != null && var5.field1112 > 0) {
                --var5.field1112;
                if (var5.field1112 == 0) {
                    var5.field1092 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ZB)V")
    public final void method133(boolean arg0, byte arg1) {
        if (arg1 != -75) {
            this.field367 = -1;
        }
        if (field147.field1078 >> 7 == this.field425 && field147.field1079 >> 7 == this.field426) {
            this.field425 = 0;
        }
        int var3 = this.field476;
        if (arg0) {
            var3 = 1;
        }
        for (int var4 = 0; var4 < var3; ++var4) {
            class27 var5;
            int var6;
            if (arg0) {
                var5 = field147;
                var6 = this.field474 << 14;
            } else {
                var5 = this.field475[this.field477[var4]];
                var6 = this.field477[var4] << 14;
            }
            if (var5 != null && var5.method325(5)) {
                var5.field951 = false;
                if ((field505 && this.field476 > 50 || this.field476 > 200) && !arg0 && var5.field1094 == var5.field1072) {
                    var5.field951 = true;
                }
                int var7 = var5.field1078 >> 7;
                int var8 = var5.field1079 >> 7;
                if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                    if (var5.field943 != null && field346 >= var5.field957 && field346 < var5.field958) {
                        var5.field951 = false;
                        var5.field948 = this.method97(var5.field1078, var5.field1079, (byte) -103, this.field307);
                        this.field78.method201(var5.field960, var5.field1078, var5.field961, this.field307, var5.field962, var5.field948, var5, var5.field963, var5.field1079, (byte) 39, var6, 60, var5.field1080);
                    } else {
                        if ((var5.field1078 & 127) == 64 && (var5.field1079 & 127) == 64) {
                            if (this.field440[var7][var8] == this.field394) {
                                continue;
                            }
                            this.field440[var7][var8] = this.field394;
                        }
                        var5.field948 = this.method97(var5.field1078, var5.field1079, (byte) -103, this.field307);
                        this.field78.method200(var5.field948, var5.field1079, (byte) 2, this.field307, var5, var5.field1093, var5.field1080, var6, 60, var5.field1078);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "run", descriptor = "()V")
    public final void run() {
        if (this.field461) {
            this.method152((byte) -20);
        } else {
            super.run();
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(BLSVWJKJVI;I)V")
    private final void method134(byte arg0, class52 arg1, int arg2) {
        if (arg0 != -22) {
            this.method155();
        }
        this.field300 = 0;
        this.field478 = 0;
        this.method37(arg2, (byte) 64, arg1);
        this.method88(arg1, arg2, (byte) 8);
        this.method124(-570, arg2, arg1);
        this.method75(arg1, false, arg2);
        for (int var4 = 0; var4 < this.field300; ++var4) {
            int var6 = this.field301[var4];
            if (field346 != this.field475[var6].field1108) {
                this.field475[var6] = null;
            }
        }
        if (arg1.field1434 != arg2) {
            signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg1.field1434 + " psize:" + arg2);
            throw new RuntimeException("eek");
        } else {
            for (int var5 = 0; var5 < this.field476; ++var5) {
                if (this.field475[this.field477[var5]] == null) {
                    signlink.reporterror(this.field378 + " null entry in pl list - pos:" + var5 + " size:" + this.field476);
                    throw new RuntimeException("eek");
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        try {
            System.out.println("RS2 user client - release #" + 362);
            if (arg0.length != 5) {
                System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
            } else {
                field502 = Integer.parseInt(arg0[0]);
                field503 = Integer.parseInt(arg0[1]);
                if (arg0[2].equals("lowmem")) {
                    method127((byte) 30);
                } else {
                    if (!arg0[2].equals("highmem")) {
                        System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
                        return;
                    }
                    method153(true);
                }
                if (arg0[3].equals("free")) {
                    field504 = false;
                } else {
                    if (!arg0[3].equals("members")) {
                        System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
                        return;
                    }
                    field504 = true;
                }
                signlink.storeid = Integer.parseInt(arg0[4]);
                signlink.startpriv(InetAddress.getLocalHost());
                client var1 = new client();
                var1.method553(765, 0, 503);
            }
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!client", name = "p", descriptor = "(B)V")
    public final void method135(byte arg0) {
        this.field543.method316(-439);
        class48.field1331 = this.field183;
        this.field123.method599(0, 0, (byte) 0);
        if (this.field117) {
            this.field508.method360(40, (byte) 33, this.field106, 239, 0);
            this.field508.method360(60, (byte) 33, this.field221 + "*", 239, 128);
        } else if (this.field414 == 1) {
            this.field508.method360(40, (byte) 33, "Enter amount:", 239, 0);
            this.field508.method360(60, (byte) 33, this.field77 + "*", 239, 128);
        } else if (this.field414 == 2) {
            this.field508.method360(40, (byte) 33, "Enter name:", 239, 0);
            this.field508.method360(60, (byte) 33, this.field77 + "*", 239, 128);
        } else if (this.field414 == 3) {
            if (this.field77 != this.field112) {
                this.method22(this.field77, 4);
                this.field112 = this.field77;
            }
            class38 var2 = this.field507;
            class8.method161(463, 0, 77, this.field162, 0);
            for (int var3 = 0; var3 < this.field113; ++var3) {
                int var4 = var3 * 14 + 18 - this.field116;
                if (var4 > 0 && var4 < 110) {
                    var2.method360(var4, (byte) 33, this.field114[var3], 239, 0);
                }
            }
            class8.method160(376);
            if (this.field113 > 5) {
                this.method148(0, this.field423, this.field113 * 14 + 7, 463, 77, this.field116);
            }
            if (this.field77.length() == 0) {
                this.field508.method360(40, (byte) 33, "Enter object name", 239, 255);
            } else if (this.field113 == 0) {
                this.field508.method360(40, (byte) 33, "No matching objects found, please shorten search", 239, 0);
            }
            var2.method360(90, (byte) 33, this.field77 + "*", 239, 0);
            class8.method167(0, 479, 0, 0, 77);
        } else if (this.field304 != null) {
            this.field508.method360(40, (byte) 33, this.field304, 239, 0);
            this.field508.method360(60, (byte) 33, "Click to continue", 239, 128);
        } else if (this.field216 != -1) {
            this.method65(class34.method339(this.field216), 0, 0, 0, 284);
        } else if (this.field400 != -1) {
            this.method65(class34.method339(this.field400), 0, 0, 0, 284);
        } else {
            class38 var5 = this.field507;
            int var6 = 0;
            class8.method161(463, 0, 77, this.field162, 0);
            for (int var7 = 0; var7 < 100; ++var7) {
                if (this.field224[var7] != null) {
                    int var10 = this.field222[var7];
                    int var11 = 70 - var6 * 14 + this.field382;
                    String var12 = this.field223[var7];
                    byte var13 = 0;
                    if (var12 != null && var12.startsWith("@cr1@")) {
                        var12 = var12.substring(5);
                        var13 = 1;
                    }
                    if (var12 != null && var12.startsWith("@cr2@")) {
                        var12 = var12.substring(5);
                        var13 = 2;
                    }
                    if (var10 == 0) {
                        if (var11 > 0 && var11 < 110) {
                            var5.method364(var11, 0, (byte) -120, 4, this.field224[var7]);
                        }
                        ++var6;
                    }
                    if ((var10 == 1 || var10 == 2) && (var10 == 1 || this.field68 == 0 || this.field68 == 1 && this.method16(var12, 38775))) {
                        if (var11 > 0 && var11 < 110) {
                            int var14 = 4;
                            if (var13 == 1) {
                                this.field280[0].method599(var11 - 12, var14, (byte) 0);
                                var14 += 14;
                            }
                            if (var13 == 2) {
                                this.field280[1].method599(var11 - 12, var14, (byte) 0);
                                var14 += 14;
                            }
                            var5.method364(var11, 0, (byte) -120, var14, var12 + ":");
                            int var15 = var14 + var5.method362(var12, 443) + 8;
                            var5.method364(var11, 255, (byte) -120, var15, this.field224[var7]);
                        }
                        ++var6;
                    }
                    if ((var10 == 3 || var10 == 7) && this.field452 == 0 && (var10 == 7 || this.field104 == 0 || this.field104 == 1 && this.method16(var12, 38775))) {
                        if (var11 > 0 && var11 < 110) {
                            byte var16 = 4;
                            var5.method364(var11, 0, (byte) -120, var16, "From");
                            int var17 = var16 + var5.method362("From ", 443);
                            if (var13 == 1) {
                                this.field280[0].method599(var11 - 12, var17, (byte) 0);
                                var17 += 14;
                            }
                            if (var13 == 2) {
                                this.field280[1].method599(var11 - 12, var17, (byte) 0);
                                var17 += 14;
                            }
                            var5.method364(var11, 0, (byte) -120, var17, var12 + ":");
                            int var18 = var17 + var5.method362(var12, 443) + 8;
                            var5.method364(var11, 8388608, (byte) -120, var18, this.field224[var7]);
                        }
                        ++var6;
                    }
                    if (var10 == 4 && (this.field174 == 0 || this.field174 == 1 && this.method16(var12, 38775))) {
                        if (var11 > 0 && var11 < 110) {
                            var5.method364(var11, 8388736, (byte) -120, 4, var12 + " " + this.field224[var7]);
                        }
                        ++var6;
                    }
                    if (var10 == 5 && this.field452 == 0 && this.field104 < 2) {
                        if (var11 > 0 && var11 < 110) {
                            var5.method364(var11, 8388608, (byte) -120, 4, this.field224[var7]);
                        }
                        ++var6;
                    }
                    if (var10 == 6 && this.field452 == 0 && this.field104 < 2) {
                        if (var11 > 0 && var11 < 110) {
                            var5.method364(var11, 0, (byte) -120, 4, "To " + var12 + ":");
                            var5.method364(var11, 8388608, (byte) -120, 12 + var5.method362("To " + var12, 443), this.field224[var7]);
                        }
                        ++var6;
                    }
                    if (var10 == 8 && (this.field174 == 0 || this.field174 == 1 && this.method16(var12, 38775))) {
                        if (var11 > 0 && var11 < 110) {
                            var5.method364(var11, 8270336, (byte) -120, 4, var12 + " " + this.field224[var7]);
                        }
                        ++var6;
                    }
                }
            }
            class8.method160(376);
            this.field208 = var6 * 14 + 7;
            if (this.field208 < 78) {
                this.field208 = 78;
            }
            this.method148(0, this.field423, this.field208, 463, 77, this.field208 - this.field382 - 77);
            String var8;
            if (field147 != null && field147.field952 != null) {
                var8 = field147.field952;
            } else {
                var8 = class3.method9(27250, this.field378);
            }
            var5.method364(90, 0, (byte) -120, 4, var8 + ":");
            var5.method364(90, 255, (byte) -120, 6 + var5.method362(var8 + ": ", 443), this.field201 + "*");
            class8.method167(0, 479, 0, 0, 77);
        }
        if (this.field498 && this.field168 == 2) {
            this.method136(true);
        }
        this.field543.method317(796, 357, 17, super.field1565);
        this.field542.method316(-439);
        if (arg0 == 0) {
            boolean var9 = false;
        } else {
            this.method155();
        }
        class48.field1331 = this.field185;
    }

    @OriginalMember(owner = "client!client", name = "l", descriptor = "(Z)V")
    public final void method136(boolean arg0) {
        int var2 = this.field169;
        int var3 = this.field170;
        int var4 = this.field171;
        int var5 = this.field172;
        int var6 = 6116423;
        class8.method164(var6, 21899, var5, var2, var4, var3);
        class8.method164(0, 21899, 16, var2 + 1, var4 - 2, var3 + 1);
        class8.method165(0, var2 + 1, -13126, var3 + 18, var5 - 19, var4 - 2);
        this.field508.method364(var3 + 14, var6, (byte) -120, var2 + 3, "Choose Option");
        int var7 = super.field1573;
        int var8 = super.field1574;
        if (!arg0) {
            this.field351 = this.field482.method375();
        }
        if (this.field168 == 0) {
            var7 -= 4;
            var8 -= 4;
        }
        if (this.field168 == 1) {
            var7 -= 553;
            var8 -= 205;
        }
        if (this.field168 == 2) {
            var7 -= 17;
            var8 -= 357;
        }
        for (int var9 = 0; var9 < this.field439; ++var9) {
            int var10 = (this.field439 - 1 - var9) * 15 + var3 + 31;
            int var11 = 16777215;
            if (var7 > var2 && var7 < var2 + var4 && var8 > var10 - 13 && var8 < var10 + 3) {
                var11 = 16776960;
            }
            this.field508.method368(var11, true, this.field441[var9], -21100, var2 + 3, var10);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(LNHFASBOX;Z)Z")
    public final boolean method137(class34 arg0, boolean arg1) {
        if (arg0.field1036 == null) {
            return false;
        } else {
            for (int var3 = 0; var3 < arg0.field1036.length; ++var3) {
                int var4 = this.method41(var3, 0, arg0);
                int var5 = arg0.field996[var3];
                if (arg0.field1036[var3] == 2) {
                    if (var4 >= var5) {
                        return false;
                    }
                } else if (arg0.field1036[var3] == 3) {
                    if (var4 <= var5) {
                        return false;
                    }
                } else if (arg0.field1036[var3] == 4) {
                    if (var4 == var5) {
                        return false;
                    }
                } else if (var4 != var5) {
                    return false;
                }
            }
            if (!arg1) {
                this.field164 = null;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Ljava/lang/String;)V")
    private final void method138(String arg0) {
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

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(B[BZ)V")
    public final void method139(byte arg0, byte[] arg1, boolean arg2) {
        if (this.field158) {
            signlink.midifade = arg2 ? 1 : 0;
            signlink.midisave(arg1, arg1.length);
            if (arg0 != -70) {
                this.field423 = this.field482.method375();
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IZ)V")
    public final void method140(int arg0, boolean arg1) {
        if (arg1) {
            this.method155();
        }
        signlink.wavevol = arg0;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ZILjava/lang/String;)V")
    public final void method141(boolean arg0, int arg1, String arg2) {
        this.field512 = arg1;
        this.field276 = arg2;
        this.method47((byte) 94);
        if (this.field325 == null) {
            super.method141(true, arg1, arg2);
        } else {
            this.field229.method316(-439);
            short var4 = 360;
            short var5 = 200;
            this.field355 &= arg0;
            byte var6 = 20;
            this.field508.method360(var5 / 2 - 26 - var6, (byte) 33, "RuneScape is loading - please wait...", var4 / 2, 16777215);
            int var7 = var5 / 2 - 18 - var6;
            class8.method165(9179409, var4 / 2 - 152, -13126, var7, 34, 304);
            class8.method165(0, var4 / 2 - 151, -13126, var7 + 1, 32, 302);
            class8.method164(9179409, 21899, 30, var4 / 2 - 150, arg1 * 3, var7 + 2);
            class8.method164(0, 21899, 30, arg1 * 3 + (var4 / 2 - 150), 300 - arg1 * 3, var7 + 2);
            this.field508.method360(var5 / 2 + 5 - var6, (byte) 33, arg2, var4 / 2, 16777215);
            this.field229.method317(796, 171, 202, super.field1565);
            if (this.field399) {
                this.field399 = false;
                if (!this.field95) {
                    this.field230.method317(796, 0, 0, super.field1565);
                    this.field231.method317(796, 0, 637, super.field1565);
                }
                this.field227.method317(796, 0, 128, super.field1565);
                this.field228.method317(796, 371, 202, super.field1565);
                this.field232.method317(796, 265, 0, super.field1565);
                this.field233.method317(796, 265, 562, super.field1565);
                this.field234.method317(796, 171, 128, super.field1565);
                this.field235.method317(796, 171, 562, super.field1565);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(IILSVWJKJVI;)V")
    public final void method142(int arg0, int arg1, class52 arg2) {
        if (arg1 > 0) {
            if (arg0 == 243) {
                int var4 = arg2.method480(this.field351);
                int var5 = (var4 >> 4 & 7) + this.field237;
                int var6 = (var4 & 7) + this.field238;
                byte var7 = arg2.method482(false);
                int var8 = arg2.method490((byte) 3);
                int var9 = arg2.method480(this.field351);
                int var10 = var9 >> 2;
                int var11 = var9 & 3;
                int var12 = this.field376[var10];
                int var13 = arg2.method489((byte) -107);
                byte var14 = arg2.method484(0);
                int var15 = arg2.method463();
                int var16 = arg2.method490((byte) 3);
                byte var17 = arg2.method483(0);
                byte var18 = arg2.method462();
                class27 var19;
                if (this.field483 == var15) {
                    var19 = field147;
                } else {
                    var19 = this.field475[var15];
                }
                if (var19 != null) {
                    class47 var20 = class47.method417(var13);
                    int var21 = this.field412[this.field307][var5][var6];
                    int var22 = this.field412[this.field307][var5 + 1][var6];
                    int var23 = this.field412[this.field307][var5 + 1][var6 + 1];
                    int var24 = this.field412[this.field307][var5][var6 + 1];
                    class19 var25 = var20.method414(var10, var11, var21, var22, var23, var24, -1);
                    if (var25 != null) {
                        this.method117(var8 + 1, 0, -233, var12, 0, var16 + 1, this.field307, var5, var6, -1);
                        var19.field957 = field346 + var16;
                        var19.field958 = field346 + var8;
                        var19.field943 = var25;
                        int var26 = var20.field1289;
                        int var27 = var20.field1297;
                        if (var11 == 1 || var11 == 3) {
                            var26 = var20.field1297;
                            var27 = var20.field1289;
                        }
                        var19.field940 = var5 * 128 + var26 * 64;
                        var19.field942 = var6 * 128 + var27 * 64;
                        var19.field941 = this.method97(var19.field940, var19.field942, (byte) -103, this.field307);
                        if (var7 > var17) {
                            byte var28 = var7;
                            var7 = var17;
                            var17 = var28;
                        }
                        if (var14 > var18) {
                            byte var29 = var14;
                            var14 = var18;
                            var18 = var29;
                        }
                        var19.field960 = var5 + var7;
                        var19.field962 = var5 + var17;
                        var19.field961 = var6 + var14;
                        var19.field963 = var6 + var18;
                    }
                }
            }
            if (arg0 == 200) {
                int var30 = arg2.method461();
                int var31 = (var30 >> 4 & 7) + this.field237;
                int var32 = (var30 & 7) + this.field238;
                int var33 = arg2.method463();
                int var34 = arg2.method463();
                int var35 = arg2.method463();
                if (var31 >= 0 && var32 >= 0 && var31 < 104 && var32 < 104) {
                    class11 var36 = this.field164[this.field307][var31][var32];
                    if (var36 != null) {
                        for (class61 var37 = (class61) var36.method181(); var37 != null; var37 = (class61) var36.method183((byte) 6)) {
                            if ((var33 & 32767) == var37.field1606 && var37.field1608 == var34) {
                                var37.field1608 = var35;
                                break;
                            }
                        }
                        this.method67(var31, var32);
                    }
                }
            } else if (arg0 == 157) {
                int var38 = arg2.method481(this.field537);
                int var39 = (var38 >> 4 & 7) + this.field237;
                int var40 = (var38 & 7) + this.field238;
                int var41 = arg2.method463();
                int var42 = arg2.method480(this.field351);
                int var43 = var42 >> 2;
                int var44 = var42 & 3;
                int var45 = this.field376[var43];
                if (var39 >= 0 && var40 >= 0 && var39 < 103 && var40 < 103) {
                    int var46 = this.field412[this.field307][var39][var40];
                    int var47 = this.field412[this.field307][var39 + 1][var40];
                    int var48 = this.field412[this.field307][var39 + 1][var40 + 1];
                    int var49 = this.field412[this.field307][var39][var40 + 1];
                    if (var45 == 0) {
                        class28 var50 = this.field78.method211(this.field307, true, var39, var40);
                        if (var50 != null) {
                            int var51 = var50.field973 >> 14 & 32767;
                            if (var43 == 2) {
                                var50.field971 = new class17(var48, var47, var51, var41, -371, 2, var44 + 4, false, var46, var49);
                                var50.field972 = new class17(var48, var47, var51, var41, -371, 2, var44 + 1 & 3, false, var46, var49);
                            } else {
                                var50.field971 = new class17(var48, var47, var51, var41, -371, var43, var44, false, var46, var49);
                            }
                        }
                    }
                    if (var45 == 1) {
                        class36 var52 = this.field78.method212(var40, this.field307, var39, 5);
                        if (var52 != null) {
                            var52.field1132 = new class17(var48, var47, var52.field1133 >> 14 & 32767, var41, -371, 4, 0, false, var46, var49);
                        }
                    }
                    if (var45 == 2) {
                        class57 var53 = this.field78.method213((byte) 0, this.field307, var39, var40);
                        if (var43 == 11) {
                            var43 = 10;
                        }
                        if (var53 != null) {
                            var53.field1540 = new class17(var48, var47, var53.field1548 >> 14 & 32767, var41, -371, var43, var44, false, var46, var49);
                        }
                    }
                    if (var45 == 3) {
                        class68 var54 = this.field78.method214(var39, var40, 5, this.field307);
                        if (var54 != null) {
                            var54.field1678 = new class17(var48, var47, var54.field1679 >> 14 & 32767, var41, -371, 22, var44, false, var46, var49);
                        }
                    }
                }
            } else {
                if (arg0 == 80) {
                    int var55 = arg2.method461();
                    int var56 = (var55 >> 4 & 7) + this.field237;
                    int var57 = (var55 & 7) + this.field238;
                    int var58 = arg2.method463();
                    int var59 = arg2.method461();
                    int var60 = var59 >> 4 & 15;
                    int var61 = var59 & 7;
                    if (field147.field1125[0] >= var56 - var60 && field147.field1125[0] <= var56 + var60 && field147.field1126[0] >= var57 - var60 && field147.field1126[0] <= var57 + var60 && this.field236 && !field505 && this.field215 < 50) {
                        this.field282[this.field215] = var58;
                        this.field410[this.field215] = var61;
                        this.field352[this.field215] = class23.field890[var58];
                        ++this.field215;
                    }
                }
                if (arg0 == 99) {
                    int var62 = arg2.method461();
                    int var63 = (var62 >> 4 & 7) + this.field237;
                    int var64 = (var62 & 7) + this.field238;
                    int var65 = var63 + arg2.method462();
                    int var66 = var64 + arg2.method462();
                    int var67 = arg2.method464();
                    int var68 = arg2.method463();
                    int var69 = arg2.method461() * 4;
                    int var70 = arg2.method461() * 4;
                    int var71 = arg2.method463();
                    int var72 = arg2.method463();
                    int var73 = arg2.method461();
                    int var74 = arg2.method461();
                    if (var63 >= 0 && var64 >= 0 && var63 < 104 && var64 < 104 && var65 >= 0 && var66 >= 0 && var65 < 104 && var66 < 104 && var68 != 65535) {
                        int var75 = var63 * 128 + 64;
                        int var76 = var64 * 128 + 64;
                        int var77 = var65 * 128 + 64;
                        int var78 = var66 * 128 + 64;
                        class1 var79 = new class1(field346 + var71, this.method97(var75, var76, (byte) -103, this.field307) - var69, this.field307, var75, var74, var67, var70, (byte) -108, var68, var76, var73, field346 + var72);
                        var79.method3(var77, var78, this.method97(var77, var78, (byte) -103, this.field307) - var70, false, field346 + var71);
                        this.field149.method178(var79);
                    }
                } else if (arg0 != 189) {
                    if (arg0 == 144) {
                        int var86 = arg2.method479(-45375);
                        int var87 = (var86 >> 4 & 7) + this.field237;
                        int var88 = (var86 & 7) + this.field238;
                        int var89 = arg2.method479(-45375);
                        int var90 = var89 >> 2;
                        int var91 = var89 & 3;
                        int var92 = this.field376[var90];
                        if (var87 >= 0 && var88 >= 0 && var87 < 104 && var88 < 104) {
                            this.method117(-1, var91, -233, var92, var90, 0, this.field307, var87, var88, -1);
                        }
                    } else if (arg0 == 26) {
                        int var93 = arg2.method490((byte) 3);
                        int var94 = arg2.method480(this.field351);
                        int var95 = (var94 >> 4 & 7) + this.field237;
                        int var96 = (var94 & 7) + this.field238;
                        int var97 = arg2.method461();
                        int var98 = var97 >> 2;
                        int var99 = var97 & 3;
                        int var100 = this.field376[var98];
                        if (var95 >= 0 && var96 >= 0 && var95 < 104 && var96 < 104) {
                            this.method117(-1, var99, -233, var100, var98, 0, this.field307, var95, var96, var93);
                        }
                    } else if (arg0 == 34) {
                        int var101 = arg2.method490((byte) 3);
                        int var102 = arg2.method489((byte) -107);
                        int var103 = arg2.method489((byte) -107);
                        int var104 = arg2.method461();
                        int var105 = (var104 >> 4 & 7) + this.field237;
                        int var106 = (var104 & 7) + this.field238;
                        if (var105 >= 0 && var106 >= 0 && var105 < 104 && var106 < 104 && this.field483 != var101) {
                            class61 var107 = new class61();
                            var107.field1606 = var102;
                            var107.field1608 = var103;
                            if (this.field164[this.field307][var105][var106] == null) {
                                this.field164[this.field307][var105][var106] = new class11(0);
                            }
                            this.field164[this.field307][var105][var106].method178(var107);
                            this.method67(var105, var106);
                        }
                    } else if (arg0 == 247) {
                        int var108 = arg2.method489((byte) -107);
                        int var109 = arg2.method481(this.field537);
                        int var110 = (var109 >> 4 & 7) + this.field237;
                        int var111 = (var109 & 7) + this.field238;
                        int var112 = arg2.method463();
                        if (var110 >= 0 && var111 >= 0 && var110 < 104 && var111 < 104) {
                            class61 var113 = new class61();
                            var113.field1606 = var112;
                            var113.field1608 = var108;
                            if (this.field164[this.field307][var110][var111] == null) {
                                this.field164[this.field307][var110][var111] = new class11(0);
                            }
                            this.field164[this.field307][var110][var111].method178(var113);
                            this.method67(var110, var111);
                        }
                    } else if (arg0 == 129) {
                        int var114 = arg2.method461();
                        int var115 = (var114 >> 4 & 7) + this.field237;
                        int var116 = (var114 & 7) + this.field238;
                        int var117 = arg2.method463();
                        int var118 = arg2.method461();
                        int var119 = arg2.method463();
                        if (var115 >= 0 && var116 >= 0 && var115 < 104 && var116 < 104) {
                            int var120 = var115 * 128 + 64;
                            int var121 = var116 * 128 + 64;
                            class43 var122 = new class43(false, this.field307, var119, var117, var121, field346, this.method97(var120, var121, (byte) -103, this.field307) - var118, var120);
                            this.field529.method178(var122);
                        }
                    }
                } else {
                    int var80 = arg2.method488(true);
                    int var81 = arg2.method461();
                    int var82 = (var81 >> 4 & 7) + this.field237;
                    int var83 = (var81 & 7) + this.field238;
                    if (var82 >= 0 && var83 >= 0 && var82 < 104 && var83 < 104) {
                        class11 var84 = this.field164[this.field307][var82][var83];
                        if (var84 != null) {
                            for (class61 var85 = (class61) var84.method181(); var85 != null; var85 = (class61) var84.method183((byte) 6)) {
                                if ((var80 & 32767) == var85.field1606) {
                                    var85.method331();
                                    break;
                                }
                            }
                            if (var84.method181() == null) {
                                this.field164[this.field307][var82][var83] = null;
                            }
                            this.method67(var82, var83);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(ZI)V")
    public final void method143(boolean arg0, int arg1) {
        if (arg1 >= 0) {
            int var3 = this.field262[arg1];
            int var4 = this.field263[arg1];
            int var5 = this.field264[arg1];
            int var6 = this.field265[arg1];
            this.field355 &= arg0;
            if (var5 >= 2000) {
                var5 -= 2000;
            }
            if (this.field414 != 0 && var5 != 1467) {
                this.field414 = 0;
                this.field472 = true;
            }
            if (var5 == 210) {
                this.field395.method450(7, 132);
                this.field395.method452(var6);
                this.field395.method452(this.field256);
                this.field395.method485(false, var4);
                this.field395.method485(false, var3);
                this.field88 = 0;
                this.field89 = var4;
                this.field90 = var3;
                this.field91 = 2;
                if (class34.method339(var4).field1052 == this.field329) {
                    this.field91 = 1;
                }
                if (class34.method339(var4).field1052 == this.field216) {
                    this.field91 = 3;
                }
            }
            if (var5 == 919) {
                this.field395.method450(7, 50);
                this.field395.method452(var3);
                this.field395.method486(var6, false);
                this.field395.method485(false, this.field515);
                this.field395.method487(var4, false);
                this.field395.method452(this.field516);
                this.field395.method487(this.field514, false);
                this.field88 = 0;
                this.field89 = var4;
                this.field90 = var3;
                this.field91 = 2;
                if (class34.method339(var4).field1052 == this.field329) {
                    this.field91 = 1;
                }
                if (class34.method339(var4).field1052 == this.field216) {
                    this.field91 = 3;
                }
            }
            if (var5 == 310) {
                class42 var7 = this.field194[var6];
                if (var7 != null) {
                    this.method92(0, 0, 1, 0, 0, field147.field1125[0], 2, false, field147.field1126[0], 1, var7.field1126[0], var7.field1125[0]);
                    this.field342 = super.field1580;
                    this.field343 = super.field1581;
                    this.field345 = 2;
                    this.field344 = 0;
                    this.field395.method450(7, 126);
                    this.field395.method487(var6, false);
                }
            }
            if (var5 == 622) {
                class27 var8 = this.field475[var6];
                if (var8 != null) {
                    this.method92(0, 0, 1, 0, 0, field147.field1125[0], 2, false, field147.field1126[0], 1, var8.field1126[0], var8.field1125[0]);
                    this.field342 = super.field1580;
                    this.field343 = super.field1581;
                    this.field345 = 2;
                    this.field344 = 0;
                    this.field395.method450(7, 59);
                    this.field395.method452(var6);
                }
            }
            if (var5 == 136) {
                this.method26((byte) -13, this.field400);
                this.field400 = -1;
                this.field472 = true;
            }
            if (var5 == 480 || var5 == 189) {
                String var9 = this.field441[arg1];
                int var10 = var9.indexOf("@whi@");
                if (var10 != -1) {
                    String var11 = var9.substring(var10 + 5).trim();
                    String var12 = class3.method9(27250, class3.method6(357, class3.method5(var11)));
                    boolean var13 = false;
                    for (int var14 = 0; var14 < this.field476; ++var14) {
                        class27 var15 = this.field475[this.field477[var14]];
                        if (var15 != null && var15.field952 != null && var15.field952.equalsIgnoreCase(var12)) {
                            this.method92(0, 0, 1, 0, 0, field147.field1125[0], 2, false, field147.field1126[0], 1, var15.field1126[0], var15.field1125[0]);
                            if (var5 == 480) {
                                ++field418;
                                if (field418 >= 82) {
                                    this.field395.method450(7, 188);
                                    this.field395.method455(0);
                                    field418 = 0;
                                }
                                this.field395.method450(7, 128);
                                this.field395.method485(false, this.field477[var14]);
                            }
                            if (var5 == 189) {
                                this.field395.method450(7, 186);
                                this.field395.method452(this.field477[var14]);
                            }
                            var13 = true;
                            break;
                        }
                    }
                    if (!var13) {
                        this.method45("", 0, 895, "Unable to find " + var12);
                    }
                }
            }
            if (var5 == 218) {
                class42 var16 = this.field194[var6];
                if (var16 != null) {
                    this.method92(0, 0, 1, 0, 0, field147.field1125[0], 2, false, field147.field1126[0], 1, var16.field1126[0], var16.field1125[0]);
                    this.field342 = super.field1580;
                    this.field343 = super.field1581;
                    this.field345 = 2;
                    this.field344 = 0;
                    this.field395.method450(7, 29);
                    this.field395.method485(false, var6);
                }
            }
            if (var5 == 221) {
                this.field395.method450(7, 7);
                this.field395.method452(var4);
                this.field395.method485(false, var6);
                this.field395.method485(false, var3);
                this.field88 = 0;
                this.field89 = var4;
                this.field90 = var3;
                this.field91 = 2;
                if (class34.method339(var4).field1052 == this.field329) {
                    this.field91 = 1;
                }
                if (class34.method339(var4).field1052 == this.field216) {
                    this.field91 = 3;
                }
            }
            if (var5 == 483) {
                boolean var17 = this.method92(0, 0, 0, 0, 0, field147.field1125[0], 2, false, field147.field1126[0], 0, var4, var3);
                if (!var17) {
                    this.method92(0, 0, 1, 0, 0, field147.field1125[0], 2, false, field147.field1126[0], 1, var4, var3);
                }
                this.field342 = super.field1580;
                this.field343 = super.field1581;
                this.field345 = 2;
                this.field344 = 0;
                this.field395.method450(7, 144);
                this.field395.method485(false, this.field97 + var4);
                this.field395.method452(this.field96 + var3);
                this.field395.method486(var6, false);
            }
            if (var5 == 631) {
                if ((var6 & 3) == 0) {
                    ++field362;
                }
                if (field362 >= 96) {
                    this.field395.method450(7, 15);
                    this.field395.method452(61151);
                    field362 = 0;
                }
                this.field395.method450(7, 94);
                this.field395.method485(false, var6);
                this.field395.method485(false, var3);
                this.field395.method452(var4);
                this.field88 = 0;
                this.field89 = var4;
                this.field90 = var3;
                this.field91 = 2;
                if (class34.method339(var4).field1052 == this.field329) {
                    this.field91 = 1;
                }
                if (class34.method339(var4).field1052 == this.field216) {
                    this.field91 = 3;
                }
            }
            if (var5 == 526) {
                this.method146(349);
            }
            if (var5 == 738) {
                class34 var19 = class34.method339(var4);
                this.field255 = 1;
                this.field256 = var4;
                this.field257 = var19.field1006;
                this.field513 = 0;
                this.field405 = true;
                String var20 = var19.field1037;
                if (var20.indexOf(" ") != -1) {
                    var20 = var20.substring(0, var20.indexOf(" "));
                }
                String var21 = var19.field1037;
                if (var21.indexOf(" ") != -1) {
                    var21 = var21.substring(var21.indexOf(" ") + 1);
                }
                this.field258 = var20 + " " + var19.field1038 + " " + var21;
                if (this.field257 == 16) {
                    this.field405 = true;
                    this.field536 = 3;
                    this.field499 = true;
                }
            } else {
                if (var5 == 444) {
                    String var22 = this.field441[arg1];
                    int var23 = var22.indexOf("@whi@");
                    if (var23 != -1) {
                        long var24 = class3.method5(var22.substring(var23 + 5).trim());
                        int var26 = -1;
                        for (int var27 = 0; var27 < this.field390; ++var27) {
                            if (this.field488[var27] == var24) {
                                var26 = var27;
                                break;
                            }
                        }
                        if (var26 != -1 && this.field118[var26] > 0) {
                            this.field472 = true;
                            this.field414 = 0;
                            this.field117 = true;
                            this.field221 = "";
                            this.field178 = 3;
                            this.field103 = this.field488[var26];
                            this.field106 = "Enter message to send to " + this.field489[var26];
                        }
                    }
                }
                if (var5 == 87) {
                    this.method120(var3, var4, var6, (byte) 8);
                    this.field395.method450(7, 134);
                    this.field395.method486(this.field96 + var3, false);
                    this.field395.method452(this.field97 + var4);
                    this.field395.method487(var6 >> 14 & 32767, false);
                }
                if (var5 == 879) {
                    boolean var28 = this.method92(0, 0, 0, 0, 0, field147.field1125[0], 2, false, field147.field1126[0], 0, var4, var3);
                    if (!var28) {
                        this.method92(0, 0, 1, 0, 0, field147.field1125[0], 2, false, field147.field1126[0], 1, var4, var3);
                    }
                    this.field342 = super.field1580;
                    this.field343 = super.field1581;
                    this.field345 = 2;
                    this.field344 = 0;
                    this.field395.method450(7, 136);
                    this.field395.method452(var6);
                    this.field395.method485(false, this.field97 + var4);
                    this.field395.method486(this.field96 + var3, false);
                }
                if (var5 == 138) {
                    class42 var30 = this.field194[var6];
                    if (var30 != null) {
                        this.method92(0, 0, 1, 0, 0, field147.field1125[0], 2, false, field147.field1126[0], 1, var30.field1126[0], var30.field1125[0]);
                        this.field342 = super.field1580;
                        this.field343 = super.field1581;
                        this.field345 = 2;
                        this.field344 = 0;
                        this.field395.method450(7, 203);
                        this.field395.method485(false, var6);
                    }
                }
                if (var5 == 207) {
                    this.field395.method450(7, 73);
                    this.field395.method452(var4);
                    this.field395.method485(false, var6);
                    this.field395.method485(false, var3);
                    this.field88 = 0;
                    this.field89 = var4;
                    this.field90 = var3;
                    this.field91 = 2;
                    if (class34.method339(var4).field1052 == this.field329) {
                        this.field91 = 1;
                    }
                    if (class34.method339(var4).field1052 == this.field216) {
                        this.field91 = 3;
                    }
                }
                if (var5 == 769) {
                    boolean var31 = this.method92(0, 0, 0, 0, 0, field147.field1125[0], 2, false, field147.field1126[0], 0, var4, var3);
                    if (!var31) {
                        this.method92(0, 0, 1, 0, 0, field147.field1125[0], 2, false, field147.field1126[0], 1, var4, var3);
                    }
                    this.field342 = super.field1580;
                    this.field343 = super.field1581;
                    this.field345 = 2;
                    this.field344 = 0;
                    this.field395.method450(7, 88);
                    this.field395.method486(this.field96 + var3, false);
                    this.field395.method452(this.field256);
                    this.field395.method486(var6, false);
                    this.field395.method452(this.field97 + var4);
                }
                if (var5 == 389) {
                    class42 var33 = this.field194[var6];
                    if (var33 != null) {
                        this.method92(0, 0, 1, 0, 0, field147.field1125[0], 2, false, field147.field1126[0], 1, var33.field1126[0], var33.field1125[0]);
                        this.field342 = super.field1580;
                        this.field343 = super.field1581;
                        this.field345 = 2;
                        this.field344 = 0;
                        this.field395.method450(7, 117);
                        this.field395.method452(this.field256);
                        this.field395.method485(false, var6);
                    }
                }
                if (var5 == 669) {
                    class27 var34 = this.field475[var6];
                    if (var34 != null) {
                        this.method92(0, 0, 1, 0, 0, field147.field1125[0], 2, false, field147.field1126[0], 1, var34.field1126[0], var34.field1125[0]);
                        this.field342 = super.field1580;
                        this.field343 = super.field1581;
                        this.field345 = 2;
                        this.field344 = 0;
                        this.field395.method450(7, 34);
                        this.field395.method486(this.field514, false);
                        this.field395.method487(var6, false);
                        this.field395.method485(false, this.field516);
                        this.field395.method452(this.field515);
                    }
                }
                if (var5 == 228) {
                    this.field395.method450(7, 208);
                    this.field395.method486(var3, false);
                    this.field395.method485(false, var4);
                    this.field395.method486(var6, false);
                    this.field88 = 0;
                    this.field89 = var4;
                    this.field90 = var3;
                    this.field91 = 2;
                    if (class34.method339(var4).field1052 == this.field329) {
                        this.field91 = 1;
                    }
                    if (class34.method339(var4).field1052 == this.field216) {
                        this.field91 = 3;
                    }
                }
                if (var5 == 1826) {
                    class56 var35 = class56.method544(var6);
                    class34 var36 = class34.method339(var4);
                    String var37;
                    if (var36 != null && var36.field1048[var3] >= 100000) {
                        var37 = var36.field1048[var3] + " x " + var35.field1496;
                    } else if (var35.field1505 != null) {
                        var37 = new String(var35.field1505);
                    } else {
                        var37 = "It's a " + var35.field1496 + ".";
                    }
                    this.method45("", 0, 895, var37);
                }
                if (var5 == 675) {
                    this.field395.method450(7, 104);
                    this.field395.method486(var6, false);
                    this.field395.method485(false, var3);
                    this.field395.method452(var4);
                    this.field88 = 0;
                    this.field89 = var4;
                    this.field90 = var3;
                    this.field91 = 2;
                    if (class34.method339(var4).field1052 == this.field329) {
                        this.field91 = 1;
                    }
                    if (class34.method339(var4).field1052 == this.field216) {
                        this.field91 = 3;
                    }
                }
                if (var5 == 227) {
                    class42 var38 = this.field194[var6];
                    if (var38 != null) {
                        this.method92(0, 0, 1, 0, 0, field147.field1125[0], 2, false, field147.field1126[0], 1, var38.field1126[0], var38.field1125[0]);
                        this.field342 = super.field1580;
                        this.field343 = super.field1581;
                        this.field345 = 2;
                        this.field344 = 0;
                        this.field395.method450(7, 78);
                        this.field395.method486(this.field515, false);
                        this.field395.method487(this.field516, false);
                        this.field395.method487(this.field514, false);
                        this.field395.method487(var6, false);
                    }
                }
                if (var5 == 685) {
                    class27 var39 = this.field475[var6];
                    if (var39 != null) {
                        this.method92(0, 0, 1, 0, 0, field147.field1125[0], 2, false, field147.field1126[0], 1, var39.field1126[0], var39.field1125[0]);
                        this.field342 = super.field1580;
                        this.field343 = super.field1581;
                        this.field345 = 2;
                        this.field344 = 0;
                        this.field395.method450(7, 186);
                        this.field395.method452(var6);
                    }
                }
                if (var5 == 77) {
                    boolean var40 = this.method92(0, 0, 0, 0, 0, field147.field1125[0], 2, false, field147.field1126[0], 0, var4, var3);
                    if (!var40) {
                        this.method92(0, 0, 1, 0, 0, field147.field1125[0], 2, false, field147.field1126[0], 1, var4, var3);
                    }
                    this.field342 = super.field1580;
                    this.field343 = super.field1581;
                    this.field345 = 2;
                    this.field344 = 0;
                    this.field395.method450(7, 235);
                    this.field395.method486(var6, false);
                    this.field395.method452(this.field96 + var3);
                    this.field395.method487(this.field97 + var4, false);
                }
                if (var5 == 941) {
                    this.field395.method450(7, 133);
                    this.field395.method485(false, var6);
                    this.field395.method487(var4, false);
                    this.field395.method485(false, var3);
                    this.field88 = 0;
                    this.field89 = var4;
                    this.field90 = var3;
                    this.field91 = 2;
                    if (class34.method339(var4).field1052 == this.field329) {
                        this.field91 = 1;
                    }
                    if (class34.method339(var4).field1052 == this.field216) {
                        this.field91 = 3;
                    }
                }
                if (var5 == 707) {
                    this.method120(var3, var4, var6, (byte) 8);
                    this.field395.method450(7, 116);
                    this.field395.method486(this.field97 + var4, false);
                    this.field395.method485(false, var6 >> 14 & 32767);
                    this.field395.method452(this.field96 + var3);
                }
                if (var5 == 94) {
                    this.field395.method450(7, 192);
                    this.field395.method452(var4);
                    this.field395.method452(var6);
                    this.field395.method452(var3);
                    this.field88 = 0;
                    this.field89 = var4;
                    this.field90 = var3;
                    this.field91 = 2;
                    if (class34.method339(var4).field1052 == this.field329) {
                        this.field91 = 1;
                    }
                    if (class34.method339(var4).field1052 == this.field216) {
                        this.field91 = 3;
                    }
                }
                if (var5 == 821) {
                    if (!this.field498) {
                        this.field78.method227((byte) 1, super.field1581 - 4, super.field1580 - 4);
                    } else {
                        this.field78.method227((byte) 1, var4 - 4, var3 - 4);
                    }
                }
                if (var5 == 883) {
                    this.field395.method450(7, 221);
                    this.field395.method487(var6, false);
                    this.field395.method487(var3, false);
                    this.field395.method487(var4, false);
                    this.field88 = 0;
                    this.field89 = var4;
                    this.field90 = var3;
                    this.field91 = 2;
                    if (class34.method339(var4).field1052 == this.field329) {
                        this.field91 = 1;
                    }
                    if (class34.method339(var4).field1052 == this.field216) {
                        this.field91 = 3;
                    }
                }
                if (var5 == 749) {
                    class27 var42 = this.field475[var6];
                    if (var42 != null) {
                        this.method92(0, 0, 1, 0, 0, field147.field1125[0], 2, false, field147.field1126[0], 1, var42.field1126[0], var42.field1125[0]);
                        this.field342 = super.field1580;
                        this.field343 = super.field1581;
                        this.field345 = 2;
                        this.field344 = 0;
                        ++field418;
                        if (field418 >= 82) {
                            this.field395.method450(7, 188);
                            this.field395.method455(0);
                            field418 = 0;
                        }
                        this.field395.method450(7, 128);
                        this.field395.method485(false, var6);
                    }
                }
                if (var5 == 453 && this.method120(var3, var4, var6, (byte) 8)) {
                    this.field395.method450(7, 181);
                    this.field395.method452(this.field515);
                    this.field395.method485(false, this.field516);
                    this.field395.method486(this.field514, false);
                    this.field395.method487(var6 >> 14 & 32767, false);
                    this.field395.method485(false, this.field96 + var3);
                    this.field395.method486(this.field97 + var4, false);
                }
                if (var5 == 1013) {
                    class42 var43 = this.field194[var6];
                    if (var43 != null) {
                        class44 var44 = var43.field1196;
                        if (var44.field1224 != null) {
                            var44 = var44.method397(1);
                        }
                        if (var44 != null) {
                            String var45;
                            if (var44.field1208 != null) {
                                var45 = new String(var44.field1208);
                            } else {
                                var45 = "It's a " + var44.field1222 + ".";
                            }
                            this.method45("", 0, 895, var45);
                        }
                    }
                }
                if (var5 == 491) {
                    boolean var46 = this.method92(0, 0, 0, 0, 0, field147.field1125[0], 2, false, field147.field1126[0], 0, var4, var3);
                    if (!var46) {
                        this.method92(0, 0, 1, 0, 0, field147.field1125[0], 2, false, field147.field1126[0], 1, var4, var3);
                    }
                    this.field342 = super.field1580;
                    this.field343 = super.field1581;
                    this.field345 = 2;
                    this.field344 = 0;
                    if ((this.field97 & 3) == 0) {
                        ++field273;
                    }
                    if (field273 >= 108) {
                        this.field395.method450(7, 159);
                        this.field395.method454(4963834);
                        field273 = 0;
                    }
                    this.field395.method450(7, 160);
                    this.field395.method452(var6);
                    this.field395.method485(false, this.field97 + var4);
                    this.field395.method487(this.field96 + var3, false);
                }
                if (var5 == 455) {
                    boolean var48 = this.method92(0, 0, 0, 0, 0, field147.field1125[0], 2, false, field147.field1126[0], 0, var4, var3);
                    if (!var48) {
                        this.method92(0, 0, 1, 0, 0, field147.field1125[0], 2, false, field147.field1126[0], 1, var4, var3);
                    }
                    this.field342 = super.field1580;
                    this.field343 = super.field1581;
                    this.field345 = 2;
                    this.field344 = 0;
                    this.field395.method450(7, 40);
                    this.field395.method486(this.field96 + var3, false);
                    this.field395.method452(var6);
                    this.field395.method485(false, this.field97 + var4);
                }
                if (var5 == 1198) {
                    this.method120(var3, var4, var6, (byte) 8);
                    this.field395.method450(7, 31);
                    this.field395.method452(var6 >> 14 & 32767);
                    this.field395.method452(this.field97 + var4);
                    this.field395.method487(this.field96 + var3, false);
                }
                if (var5 == 544) {
                    class27 var50 = this.field475[var6];
                    if (var50 != null) {
                        this.method92(0, 0, 1, 0, 0, field147.field1125[0], 2, false, field147.field1126[0], 1, var50.field1126[0], var50.field1125[0]);
                        this.field342 = super.field1580;
                        this.field343 = super.field1581;
                        this.field345 = 2;
                        this.field344 = 0;
                        this.field395.method450(7, 167);
                        this.field395.method487(var6, false);
                        this.field395.method486(this.field256, false);
                    }
                }
                if (var5 == 256) {
                    this.field395.method450(7, 16);
                    this.field395.method452(var4);
                    class34 var51 = class34.method339(var4);
                    if (var51.field1043 != null && var51.field1043[0][0] == 5) {
                        int var52 = var51.field1043[0][1];
                        this.field197[var52] = 1 - this.field197[var52];
                        this.method38(0, var52);
                        this.field405 = true;
                    }
                }
                if (var5 == 1648) {
                    int var53 = var6 >> 14 & 32767;
                    class47 var54 = class47.method417(var53);
                    String var55;
                    if (var54.field1308 != null) {
                        var55 = new String(var54.field1308);
                    } else {
                        var55 = "It's a " + var54.field1309 + ".";
                    }
                    this.method45("", 0, 895, var55);
                }
                if (var5 == 192 && !this.field249) {
                    this.field395.method450(7, 33);
                    this.field395.method452(var4);
                    this.field249 = true;
                }
                if (var5 == 956) {
                    boolean var56 = this.method92(0, 0, 0, 0, 0, field147.field1125[0], 2, false, field147.field1126[0], 0, var4, var3);
                    if (!var56) {
                        this.method92(0, 0, 1, 0, 0, field147.field1125[0], 2, false, field147.field1126[0], 1, var4, var3);
                    }
                    this.field342 = super.field1580;
                    this.field343 = super.field1581;
                    this.field345 = 2;
                    this.field344 = 0;
                    this.field395.method450(7, 10);
                    this.field395.method485(false, var6);
                    this.field395.method486(this.field516, false);
                    this.field395.method452(this.field96 + var3);
                    this.field395.method487(this.field97 + var4, false);
                    this.field395.method486(this.field514, false);
                    this.field395.method487(this.field515, false);
                }
                if (var5 == 832) {
                    class27 var58 = this.field475[var6];
                    if (var58 != null) {
                        this.method92(0, 0, 1, 0, 0, field147.field1125[0], 2, false, field147.field1126[0], 1, var58.field1126[0], var58.field1125[0]);
                        this.field342 = super.field1580;
                        this.field343 = super.field1581;
                        this.field345 = 2;
                        this.field344 = 0;
                        ++field348;
                        if (field348 >= 78) {
                            this.field395.method450(7, 227);
                            this.field395.method454(16243839);
                            field348 = 0;
                        }
                        this.field395.method450(7, 47);
                        this.field395.method487(var6, false);
                    }
                }
                if (var5 == 379) {
                    this.field395.method450(7, 36);
                    this.field395.method452(var3);
                    this.field395.method485(false, var6);
                    this.field395.method452(var4);
                    this.field88 = 0;
                    this.field89 = var4;
                    this.field90 = var3;
                    this.field91 = 2;
                    if (class34.method339(var4).field1052 == this.field329) {
                        this.field91 = 1;
                    }
                    if (class34.method339(var4).field1052 == this.field216) {
                        this.field91 = 3;
                    }
                }
                if (var5 == 1914) {
                    class56 var59 = class56.method544(var6);
                    String var60;
                    if (var59.field1505 != null) {
                        var60 = new String(var59.field1505);
                    } else {
                        var60 = "It's a " + var59.field1496 + ".";
                    }
                    this.method45("", 0, 895, var60);
                }
                if (var5 == 128) {
                    class34 var61 = class34.method339(var4);
                    boolean var62 = true;
                    if (var61.field1012 > 0) {
                        var62 = this.method20(var61, (byte) -84);
                    }
                    if (var62) {
                        this.field395.method450(7, 16);
                        this.field395.method452(var4);
                    }
                }
                if (var5 == 405) {
                    this.method120(var3, var4, var6, (byte) 8);
                    this.field395.method450(7, 239);
                    this.field395.method452(var6 >> 14 & 32767);
                    this.field395.method485(false, this.field96 + var3);
                    this.field395.method486(this.field97 + var4, false);
                }
                if (var5 == 839 || var5 == 673 || var5 == 613 || var5 == 557) {
                    String var63 = this.field441[arg1];
                    int var64 = var63.indexOf("@whi@");
                    if (var64 != -1) {
                        long var65 = class3.method5(var63.substring(var64 + 5).trim());
                        if (var5 == 839) {
                            this.method57(-25941, var65);
                        }
                        if (var5 == 673) {
                            this.method31(var65, -39);
                        }
                        if (var5 == 613) {
                            this.method66((byte) -128, var65);
                        }
                        if (var5 == 557) {
                            this.method34(659, var65);
                        }
                    }
                }
                if (var5 == 745) {
                    class42 var67 = this.field194[var6];
                    if (var67 != null) {
                        this.method92(0, 0, 1, 0, 0, field147.field1125[0], 2, false, field147.field1126[0], 1, var67.field1126[0], var67.field1125[0]);
                        this.field342 = super.field1580;
                        this.field343 = super.field1581;
                        this.field345 = 2;
                        this.field344 = 0;
                        field274 += var6;
                        if (field274 >= 65) {
                            this.field395.method450(7, 0);
                            field274 = 0;
                        }
                        this.field395.method450(7, 163);
                        this.field395.method452(var6);
                    }
                }
                if (var5 == 530) {
                    class27 var68 = this.field475[var6];
                    if (var68 != null) {
                        this.method92(0, 0, 1, 0, 0, field147.field1125[0], 2, false, field147.field1126[0], 1, var68.field1126[0], var68.field1125[0]);
                        this.field342 = super.field1580;
                        this.field343 = super.field1581;
                        this.field345 = 2;
                        this.field344 = 0;
                        this.field395.method450(7, 153);
                        this.field395.method486(var6, false);
                    }
                }
                if (var5 == 211) {
                    this.field395.method450(7, 16);
                    this.field395.method452(var4);
                    class34 var69 = class34.method339(var4);
                    if (var69.field1043 != null && var69.field1043[0][0] == 5) {
                        int var70 = var69.field1043[0][1];
                        if (this.field197[var70] != var69.field996[0]) {
                            this.field197[var70] = var69.field996[0];
                            this.method38(0, var70);
                            this.field405 = true;
                        }
                    }
                }
                if (var5 == 424) {
                    if ((var3 & 3) == 0) {
                        ++field100;
                    }
                    if (field100 >= 54) {
                        this.field395.method450(7, 247);
                        this.field395.method455(0);
                        field100 = 0;
                    }
                    this.method120(var3, var4, var6, (byte) 8);
                    this.field395.method450(7, 57);
                    this.field395.method452(this.field96 + var3);
                    this.field395.method486(this.field97 + var4, false);
                    this.field395.method487(var6 >> 14 & 32767, false);
                }
                if (var5 == 591) {
                    String var71 = this.field441[arg1];
                    int var72 = var71.indexOf("@whi@");
                    if (var72 != -1) {
                        if (this.field329 == -1) {
                            this.method146(349);
                            this.field467 = var71.substring(var72 + 5).trim();
                            this.field445 = false;
                            this.field290 = this.field329 = class34.field1034;
                        } else {
                            this.method45("", 0, 895, "Please close the interface you have open before using 'report abuse'");
                        }
                    }
                }
                if (var5 == 23 && this.method120(var3, var4, var6, (byte) 8)) {
                    this.field395.method450(7, 80);
                    this.field395.method452(var6 >> 14 & 32767);
                    this.field395.method487(this.field256, false);
                    this.field395.method486(this.field97 + var4, false);
                    this.field395.method485(false, this.field96 + var3);
                }
                if (var5 == 616) {
                    class42 var73 = this.field194[var6];
                    if (var73 != null) {
                        this.method92(0, 0, 1, 0, 0, field147.field1125[0], 2, false, field147.field1126[0], 1, var73.field1126[0], var73.field1125[0]);
                        this.field342 = super.field1580;
                        this.field343 = super.field1581;
                        this.field345 = 2;
                        this.field344 = 0;
                        this.field395.method450(7, 14);
                        this.field395.method486(var6, false);
                    }
                }
                if (var5 == 860) {
                    this.field513 = 1;
                    this.field514 = var3;
                    this.field515 = var4;
                    this.field516 = var6;
                    this.field517 = String.valueOf(class56.method544(var6).field1496);
                    this.field255 = 0;
                    this.field405 = true;
                } else {
                    if (var5 == 292) {
                        this.field395.method450(7, 172);
                        this.field395.method486(var4, false);
                        this.field395.method486(var6, false);
                        this.field395.method486(var3, false);
                        this.field88 = 0;
                        this.field89 = var4;
                        this.field90 = var3;
                        this.field91 = 2;
                        if (class34.method339(var4).field1052 == this.field329) {
                            this.field91 = 1;
                        }
                        if (class34.method339(var4).field1052 == this.field216) {
                            this.field91 = 3;
                        }
                    }
                    this.field513 = 0;
                    this.field255 = 0;
                    this.field405 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "q", descriptor = "(B)V")
    public final void method144(byte arg0) {
        this.field95 = false;
        while (this.field75) {
            this.field95 = false;
            try {
                Thread.sleep(50L);
            } catch (Exception var2) {
            }
        }
        this.field331 = null;
        this.field332 = null;
        this.field323 = null;
        this.field448 = null;
        this.field449 = null;
        this.field450 = null;
        this.field451 = null;
        this.field181 = null;
        this.field182 = null;
        this.field199 = null;
        this.field200 = null;
        if (arg0 != 62) {
            this.field367 = this.field177.method461();
        }
        this.field217 = null;
        this.field218 = null;
    }

    @OriginalMember(owner = "client!client", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        return signlink.mainapp != null ? signlink.mainapp.getAppletContext() : super.getAppletContext();
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
    public final void method145(int arg0) {
        if (arg0 != 6) {
            this.field395.method451(114);
        }
        this.field399 = true;
    }

    @OriginalMember(owner = "client!client", name = "H", descriptor = "(I)V")
    public final void method146(int arg0) {
        this.field395.method450(7, 30);
        int var2 = 60 / arg0;
        if (this.field268 != -1) {
            this.method26((byte) -13, this.field268);
            this.field268 = -1;
            this.field405 = true;
            this.field249 = false;
            this.field499 = true;
        }
        if (this.field216 != -1) {
            this.method26((byte) -13, this.field216);
            this.field216 = -1;
            this.field472 = true;
            this.field249 = false;
        }
        if (this.field432 != -1) {
            this.method26((byte) -13, this.field432);
            this.field432 = -1;
            this.field399 = true;
        }
        if (this.field163 != -1) {
            this.method26((byte) -13, this.field163);
            this.field163 = -1;
        }
        if (this.field329 != -1) {
            this.method26((byte) -13, this.field329);
            this.field329 = -1;
        }
    }

    @OriginalMember(owner = "client!client", name = "m", descriptor = "(Z)V")
    public final void method147(boolean arg0) {
        short var2 = 256;
        if (arg0) {
            for (int var3 = 1; var3 > 0; ++var3) {
            }
        }
        if (this.field305 > 0) {
            for (int var4 = 0; var4 < 256; ++var4) {
                if (this.field305 > 768) {
                    this.field448[var4] = this.method30(1024 - this.field305, this.field450[var4], this.field449[var4], -7809);
                } else if (this.field305 > 256) {
                    this.field448[var4] = this.field450[var4];
                } else {
                    this.field448[var4] = this.method30(256 - this.field305, this.field449[var4], this.field450[var4], -7809);
                }
            }
        } else if (this.field306 > 0) {
            for (int var5 = 0; var5 < 256; ++var5) {
                if (this.field306 > 768) {
                    this.field448[var5] = this.method30(1024 - this.field306, this.field451[var5], this.field449[var5], -7809);
                } else if (this.field306 > 256) {
                    this.field448[var5] = this.field451[var5];
                } else {
                    this.field448[var5] = this.method30(256 - this.field306, this.field449[var5], this.field451[var5], -7809);
                }
            }
        } else {
            for (int var6 = 0; var6 < 256; ++var6) {
                this.field448[var6] = this.field449[var6];
            }
        }
        for (int var7 = 0; var7 < 33920; ++var7) {
            this.field230.field914[var7] = this.field217.field1146[var7];
        }
        int var8 = 0;
        int var9 = 1152;
        for (int var10 = 1; var10 < var2 - 1; ++var10) {
            int var24 = (var2 - var10) * this.field497[var10] / var2;
            int var25 = var24 + 22;
            if (var25 < 0) {
                var25 = 0;
            }
            var8 += var25;
            for (int var26 = var25; var26 < 128; ++var26) {
                int var27 = this.field199[var8++];
                if (var27 != 0) {
                    int var29 = 256 - var27;
                    int var30 = this.field448[var27];
                    int var31 = this.field230.field914[var9];
                    this.field230.field914[var9++] = ((var30 & 16711935) * var27 + (var31 & 16711935) * var29 & -16711936) + ((var30 & 65280) * var27 + (var31 & 65280) * var29 & 16711680) >> 8;
                } else {
                    ++var9;
                }
            }
            var9 += var25;
        }
        this.field230.method317(796, 0, 0, super.field1565);
        for (int var11 = 0; var11 < 33920; ++var11) {
            this.field231.field914[var11] = this.field218.field1146[var11];
        }
        int var12 = 0;
        int var13 = 1176;
        for (int var14 = 1; var14 < var2 - 1; ++var14) {
            int var15 = (var2 - var14) * this.field497[var14] / var2;
            int var16 = 103 - var15;
            int var17 = var13 + var15;
            for (int var18 = 0; var18 < var16; ++var18) {
                int var19 = this.field199[var12++];
                if (var19 != 0) {
                    int var21 = 256 - var19;
                    int var22 = this.field448[var19];
                    int var23 = this.field231.field914[var17];
                    this.field231.field914[var17++] = ((var22 & 16711935) * var19 + (var23 & 16711935) * var21 & -16711936) + ((var22 & 65280) * var19 + (var23 & 65280) * var21 & 16711680) >> 8;
                } else {
                    ++var17;
                }
            }
            var12 += 128 - var16;
            var13 = 128 - var16 - var15 + var17;
        }
        this.field231.method317(796, 0, 637, super.field1565);
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(IIIIII)V")
    public final void method148(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field538.method599(arg0, arg3, (byte) 0);
        this.field539.method599(arg0 + arg4 - 16, arg3, (byte) 0);
        class8.method164(this.field447, 21899, arg4 - 32, arg3, 16, arg0 + 16);
        int var7 = (arg4 - 32) * arg4 / arg2;
        if (var7 < 8) {
            var7 = 8;
        }
        int var8 = (arg4 - 32 - var7) * arg5 / (arg2 - arg4);
        this.field366 += arg1;
        class8.method164(this.field356, 21899, var7, arg3, 16, arg0 + 16 + var8);
        class8.method169(7, arg0 + 16 + var8, arg3, this.field313, var7);
        class8.method169(7, arg0 + 16 + var8, arg3 + 1, this.field313, var7);
        class8.method167(arg3, 16, 0, this.field313, arg0 + 16 + var8);
        class8.method167(arg3, 16, 0, this.field313, arg0 + 17 + var8);
        class8.method169(7, arg0 + 16 + var8, arg3 + 15, this.field471, var7);
        class8.method169(7, arg0 + 17 + var8, arg3 + 14, this.field471, var7 - 1);
        class8.method167(arg3, 16, 0, this.field471, arg0 + 15 + var8 + var7);
        class8.method167(arg3 + 1, 15, 0, this.field471, arg0 + 14 + var8 + var7);
    }

    @OriginalMember(owner = "client!client", name = "I", descriptor = "(I)V")
    public final void method149(int arg0) {
        if (arg0 != 1247) {
            this.field164 = null;
        }
        if (field505 && this.field302 == 2 && class64.field1651 != this.field307) {
            this.method29("Loading - please wait.", (String) null, -946);
            this.field302 = 1;
            this.field493 = System.currentTimeMillis();
        }
        if (this.field302 == 1) {
            int var2 = this.method150(9);
            if (var2 != 0 && System.currentTimeMillis() - this.field493 > 360000L) {
                signlink.reporterror(this.field378 + " glcfb " + this.field259 + "," + var2 + "," + field505 + "," + this.field328[0] + "," + this.field530.method249() + "," + this.field307 + "," + this.field141 + "," + this.field142);
                this.field493 = System.currentTimeMillis();
            }
        }
        if (this.field302 == 2 && this.field444 != this.field307) {
            this.field444 = this.field307;
            this.method76((byte) 123, this.field307);
        }
    }

    @OriginalMember(owner = "client!client", name = "J", descriptor = "(I)I")
    public final int method150(int arg0) {
        for (int var2 = 0; var2 < this.field261.length; ++var2) {
            if (this.field261[var2] == null && this.field311[var2] != -1) {
                return -1;
            }
            if (this.field459[var2] == null && this.field312[var2] != -1) {
                return -2;
            }
        }
        boolean var3 = true;
        for (int var4 = 0; var4 < this.field261.length; ++var4) {
            byte[] var6 = this.field459[var4];
            if (var6 != null) {
                int var7 = (this.field310[var4] >> 8) * 64 - this.field96;
                int var8 = (this.field310[var4] & 255) * 64 - this.field97;
                if (this.field528) {
                    var7 = 10;
                    var8 = 10;
                }
                var3 &= class64.method561(var6, false, var7, var8);
            }
        }
        if (!var3) {
            return -3;
        } else if (this.field353) {
            return -4;
        } else {
            this.field302 = 2;
            class64.field1651 = this.field307;
            this.method123(this.field179);
            this.field395.method450(7, 138);
            if (arg0 != 9) {
                for (int var5 = 1; var5 > 0; ++var5) {
                }
            }
            return 0;
        }
    }

    @OriginalMember(owner = "client!client", name = "K", descriptor = "(I)V")
    private final void method151(int arg0) {
        if (arg0 >= 0) {
            this.field395.method451(219);
        }
        if (this.field302 == 2) {
            for (class6 var2 = (class6) this.field153.method181(); var2 != null; var2 = (class6) this.field153.method183((byte) 6)) {
                if (var2.field67 > 0) {
                    --var2.field67;
                }
                if (var2.field67 == 0) {
                    if (var2.field63 < 0 || class64.method570(var2.field63, var2.field65, 19)) {
                        this.method125(var2.field57, 0, var2.field59, var2.field56, var2.field64, var2.field58, var2.field63, var2.field65);
                        var2.method331();
                    }
                } else {
                    if (var2.field66 > 0) {
                        --var2.field66;
                    }
                    if (var2.field66 == 0 && var2.field58 >= 1 && var2.field59 >= 1 && var2.field58 <= 102 && var2.field59 <= 102 && (var2.field60 < 0 || class64.method570(var2.field60, var2.field62, 19))) {
                        this.method125(var2.field57, 0, var2.field59, var2.field56, var2.field61, var2.field58, var2.field60, var2.field62);
                        var2.field66 = -1;
                        if (var2.field63 == var2.field60 && var2.field63 == -1) {
                            var2.method331();
                        } else if (var2.field63 == var2.field60 && var2.field64 == var2.field61 && var2.field65 == var2.field62) {
                            var2.method331();
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "r", descriptor = "(B)V")
    public final void method152(byte arg0) {
        if (arg0 != -20) {
            this.field367 = -1;
        }
        this.field75 = true;
        try {
            long var2 = System.currentTimeMillis();
            int var4 = 0;
            int var5 = 20;
            while (this.field95) {
                ++this.field102;
                this.method69(3);
                this.method69(3);
                this.method147(false);
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
        this.field75 = false;
    }

    @OriginalMember(owner = "client!client", name = "n", descriptor = "(Z)V")
    public static final void method153(boolean arg0) {
        class13.field640 = false;
        if (arg0) {
            class48.field1320 = false;
            field505 = false;
            class64.field1652 = false;
            class47.field1307 = false;
        }
    }

    @OriginalMember(owner = "client!client", name = "L", descriptor = "(I)Ljava/net/Socket;")
    public final Socket method154(int arg0) throws IOException {
        return signlink.mainapp != null ? signlink.opensocket(arg0) : new Socket(InetAddress.getByName(this.getCodeBase().getHost()), arg0);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
    public final void method155() {
        this.method141(true, 20, "Starting up");
        if (signlink.sunjava) {
            super.field1559 = 5;
        }
        if (field397) {
            this.field381 = true;
        } else {
            field397 = true;
            boolean var1 = false;
            String var2 = this.method96(0);
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
                this.field175 = true;
            } else {
                if (signlink.cache_dat != null) {
                    for (int var3 = 0; var3 < 5; ++var3) {
                        this.field328[var3] = new class67(signlink.cache_idx[var3], 500000, signlink.cache_dat, 0, var3 + 1);
                    }
                }
                try {
                    this.method89((byte) 84);
                    this.field325 = this.method68(25, 1, 876, this.field409[1], "title", "title screen");
                    this.field506 = new class38((byte) 1, this.field325, false, "p11_full");
                    this.field507 = new class38((byte) 1, this.field325, false, "p12_full");
                    this.field508 = new class38((byte) 1, this.field325, false, "b12_full");
                    this.field509 = new class38((byte) 1, this.field325, true, "q8_full");
                    this.method27(true);
                    this.method72(6);
                    class62 var4 = this.method68(30, 2, 876, this.field409[2], "config", "config");
                    class62 var5 = this.method68(35, 3, 876, this.field409[3], "interface", "interface");
                    class62 var6 = this.method68(40, 4, 876, this.field409[4], "media", "2d graphics");
                    class62 var7 = this.method68(45, 6, 876, this.field409[6], "textures", "textures");
                    class62 var8 = this.method68(50, 7, 876, this.field409[7], "wordenc", "chat system");
                    class62 var9 = this.method68(55, 8, 876, this.field409[8], "sounds", "sound effects");
                    this.field252 = new byte[4][104][104];
                    this.field412 = new int[4][105][105];
                    this.field78 = new class13(4, 1, 104, 104, this.field412);
                    for (int var10 = 0; var10 < 4; ++var10) {
                        this.field408[var10] = new class41(103, 104, 104);
                    }
                    this.field427 = new class37(512, 512);
                    class62 var11 = this.method68(60, 5, 876, this.field409[5], "versionlist", "update list");
                    this.method141(true, 60, "Connecting to update server");
                    this.field530 = new class16();
                    this.field530.method251(var11, this);
                    class45.method402(this.field530.method256(false));
                    class19.method270(this.field530.method244(0, 0), this.field530);
                    if (!field505) {
                        this.field434 = 0;
                        this.field435 = true;
                        this.field530.method245(2, this.field434);
                        while (this.field530.method249() > 0) {
                            this.method121((byte) 108);
                            try {
                                Thread.sleep(100L);
                            } catch (Exception var71) {
                            }
                            if (this.field530.field747 > 3) {
                                this.method138("ondemand");
                                return;
                            }
                        }
                    }
                    this.method141(true, 65, "Requesting animations");
                    int var12 = this.field530.method244(1, 0);
                    for (int var13 = 0; var13 < var12; ++var13) {
                        this.field530.method245(1, var13);
                    }
                    while (this.field530.method249() > 0) {
                        int var14 = var12 - this.field530.method249();
                        if (var14 > 0) {
                            this.method141(true, 65, "Loading animations - " + var14 * 100 / var12 + "%");
                        }
                        this.method121((byte) 108);
                        try {
                            Thread.sleep(100L);
                        } catch (Exception var70) {
                        }
                        if (this.field530.field747 > 3) {
                            this.method138("ondemand");
                            return;
                        }
                    }
                    this.method141(true, 70, "Requesting models");
                    int var15 = this.field530.method244(0, 0);
                    for (int var16 = 0; var16 < var15; ++var16) {
                        int var17 = this.field530.method248(true, var16);
                        if ((var17 & 1) != 0) {
                            this.field530.method245(0, var16);
                        }
                    }
                    int var18 = this.field530.method249();
                    while (this.field530.method249() > 0) {
                        int var19 = var18 - this.field530.method249();
                        if (var19 > 0) {
                            this.method141(true, 70, "Loading models - " + var19 * 100 / var18 + "%");
                        }
                        this.method121((byte) 108);
                        try {
                            Thread.sleep(100L);
                        } catch (Exception var69) {
                        }
                    }
                    if (this.field328[0] != null) {
                        this.method141(true, 75, "Requesting maps");
                        this.field530.method245(3, this.field530.method259(0, 47, false, 48));
                        this.field530.method245(3, this.field530.method259(1, 47, false, 48));
                        this.field530.method245(3, this.field530.method259(0, 48, false, 48));
                        this.field530.method245(3, this.field530.method259(1, 48, false, 48));
                        this.field530.method245(3, this.field530.method259(0, 49, false, 48));
                        this.field530.method245(3, this.field530.method259(1, 49, false, 48));
                        this.field530.method245(3, this.field530.method259(0, 47, false, 47));
                        this.field530.method245(3, this.field530.method259(1, 47, false, 47));
                        this.field530.method245(3, this.field530.method259(0, 48, false, 47));
                        this.field530.method245(3, this.field530.method259(1, 48, false, 47));
                        this.field530.method245(3, this.field530.method259(0, 48, false, 148));
                        this.field530.method245(3, this.field530.method259(1, 48, false, 148));
                        int var20 = this.field530.method249();
                        while (this.field530.method249() > 0) {
                            int var21 = var20 - this.field530.method249();
                            if (var21 > 0) {
                                this.method141(true, 75, "Loading maps - " + var21 * 100 / var20 + "%");
                            }
                            this.method121((byte) 108);
                            try {
                                Thread.sleep(100L);
                            } catch (Exception var68) {
                            }
                        }
                    }
                    int var22 = this.field530.method244(0, 0);
                    for (int var23 = 0; var23 < var22; ++var23) {
                        int var24 = this.field530.method248(true, var23);
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
                            this.field530.method253(var25, (byte) -5, 0, var23);
                        }
                    }
                    this.field530.method258(true, field504);
                    if (!field505) {
                        int var26 = this.field530.method244(2, 0);
                        for (int var27 = 1; var27 < var26; ++var27) {
                            if (this.field530.method255(var27, -672)) {
                                this.field530.method253((byte) 1, (byte) -5, 2, var27);
                            }
                        }
                    }
                    this.method141(true, 80, "Unpacking media");
                    this.field121 = new class72(var6, "invback", 0);
                    this.field123 = new class72(var6, "chatback", 0);
                    this.field122 = new class72(var6, "mapback", 0);
                    this.field339 = new class72(var6, "backbase1", 0);
                    this.field340 = new class72(var6, "backbase2", 0);
                    this.field341 = new class72(var6, "backhmid1", 0);
                    for (int var28 = 0; var28 < 13; ++var28) {
                        this.field392[var28] = new class72(var6, "sideicons", var28);
                    }
                    this.field490 = new class37(var6, "compass", 0);
                    this.field190 = new class37(var6, "mapedge", 0);
                    this.field190.method348(812);
                    for (int var29 = 0; var29 < 72; ++var29) {
                        this.field389[var29] = new class72(var6, "mapscene", var29);
                    }
                    for (int var30 = 0; var30 < 63; ++var30) {
                        this.field373[var30] = new class37(var6, "mapfunction", var30);
                    }
                    for (int var31 = 0; var31 < 5; ++var31) {
                        this.field308[var31] = new class37(var6, "hitmarks", var31);
                    }
                    for (int var32 = 0; var32 < 6; ++var32) {
                        this.field544[var32] = new class37(var6, "headicons_pk", var32);
                    }
                    for (int var33 = 0; var33 < 9; ++var33) {
                        this.field422[var33] = new class37(var6, "headicons_prayer", var33);
                    }
                    for (int var34 = 0; var34 < 6; ++var34) {
                        this.field143[var34] = new class37(var6, "headicons_hint", var34);
                    }
                    this.field337 = new class37(var6, "overlay_multiway", 0);
                    this.field532 = new class37(var6, "mapmarker", 0);
                    this.field533 = new class37(var6, "mapmarker", 1);
                    for (int var35 = 0; var35 < 8; ++var35) {
                        this.field109[var35] = new class37(var6, "cross", var35);
                    }
                    this.field519 = new class37(var6, "mapdots", 0);
                    this.field520 = new class37(var6, "mapdots", 1);
                    this.field521 = new class37(var6, "mapdots", 2);
                    this.field522 = new class37(var6, "mapdots", 3);
                    this.field523 = new class37(var6, "mapdots", 4);
                    this.field538 = new class72(var6, "scrollbar", 0);
                    this.field539 = new class72(var6, "scrollbar", 1);
                    this.field69 = new class72(var6, "redstone1", 0);
                    this.field70 = new class72(var6, "redstone2", 0);
                    this.field71 = new class72(var6, "redstone3", 0);
                    this.field72 = new class72(var6, "redstone1", 0);
                    this.field72.method596(-6360);
                    this.field73 = new class72(var6, "redstone2", 0);
                    this.field73.method596(-6360);
                    this.field357 = new class72(var6, "redstone1", 0);
                    this.field357.method597(0);
                    this.field358 = new class72(var6, "redstone2", 0);
                    this.field358.method597(0);
                    this.field359 = new class72(var6, "redstone3", 0);
                    this.field359.method597(0);
                    this.field360 = new class72(var6, "redstone1", 0);
                    this.field360.method596(-6360);
                    this.field360.method597(0);
                    this.field361 = new class72(var6, "redstone2", 0);
                    this.field361.method596(-6360);
                    this.field361.method597(0);
                    for (int var36 = 0; var36 < 2; ++var36) {
                        this.field280[var36] = new class72(var6, "mod_icons", var36);
                    }
                    class37 var37 = new class37(var6, "backleft1", 0);
                    this.field79 = new class25(this.method82(523), 0, var37.field1147, var37.field1148);
                    var37.method349(8, 0, 0);
                    class37 var38 = new class37(var6, "backleft2", 0);
                    this.field80 = new class25(this.method82(523), 0, var38.field1147, var38.field1148);
                    var38.method349(8, 0, 0);
                    class37 var39 = new class37(var6, "backright1", 0);
                    this.field81 = new class25(this.method82(523), 0, var39.field1147, var39.field1148);
                    var39.method349(8, 0, 0);
                    class37 var40 = new class37(var6, "backright2", 0);
                    this.field82 = new class25(this.method82(523), 0, var40.field1147, var40.field1148);
                    var40.method349(8, 0, 0);
                    class37 var41 = new class37(var6, "backtop1", 0);
                    this.field83 = new class25(this.method82(523), 0, var41.field1147, var41.field1148);
                    var41.method349(8, 0, 0);
                    class37 var42 = new class37(var6, "backvmid1", 0);
                    this.field84 = new class25(this.method82(523), 0, var42.field1147, var42.field1148);
                    var42.method349(8, 0, 0);
                    class37 var43 = new class37(var6, "backvmid2", 0);
                    this.field85 = new class25(this.method82(523), 0, var43.field1147, var43.field1148);
                    var43.method349(8, 0, 0);
                    class37 var44 = new class37(var6, "backvmid3", 0);
                    this.field86 = new class25(this.method82(523), 0, var44.field1147, var44.field1148);
                    var44.method349(8, 0, 0);
                    class37 var45 = new class37(var6, "backhmid2", 0);
                    this.field87 = new class25(this.method82(523), 0, var45.field1147, var45.field1148);
                    var45.method349(8, 0, 0);
                    int var46 = (int) (Math.random() * 21.0D) - 10;
                    int var47 = (int) (Math.random() * 21.0D) - 10;
                    int var48 = (int) (Math.random() * 21.0D) - 10;
                    int var49 = (int) (Math.random() * 41.0D) - 20;
                    for (int var50 = 0; var50 < 100; ++var50) {
                        if (this.field373[var50] != null) {
                            this.field373[var50].method347(var48 + var49, var47 + var49, -879, var46 + var49);
                        }
                        if (this.field389[var50] != null) {
                            this.field389[var50].method598(var48 + var49, var47 + var49, -879, var46 + var49);
                        }
                    }
                    this.method141(true, 83, "Unpacking textures");
                    class48.method429(var7, (byte) 2);
                    class48.method433(false, 0.8D);
                    class48.method428(107, 20);
                    this.method141(true, 86, "Unpacking config");
                    class26.method319(var4, 24414);
                    class47.method416(var4);
                    class9.method171(var4, 24414);
                    class56.method548(var4);
                    class44.method396(var4);
                    class54.method496(var4, 24414);
                    class50.method446(var4, 24414);
                    class24.method314(var4, 24414);
                    class12.method186(var4, 24414);
                    class56.field1532 = field504;
                    if (!field505) {
                        this.method141(true, 90, "Unpacking sounds");
                        byte[] var51 = var9.method559("sounds.dat", (byte[]) null);
                        class52 var52 = new class52(var51, true);
                        class23.method308(var52, 24414);
                    }
                    this.method141(true, 95, "Unpacking interfaces");
                    class38[] var53 = new class38[] { this.field506, this.field507, this.field508, this.field509 };
                    class34.method335(var5, var6, var53, 9284);
                    this.method141(true, 100, "Preparing game engine");
                    for (int var54 = 0; var54 < 33; ++var54) {
                        int var55 = 999;
                        int var56 = 0;
                        for (int var57 = 0; var57 < 34; ++var57) {
                            if (this.field122.field1725[this.field122.field1727 * var54 + var57] == 0) {
                                if (var55 == 999) {
                                    var55 = var57;
                                }
                            } else if (var55 != 999) {
                                var56 = var57;
                                break;
                            }
                        }
                        this.field212[var54] = var55;
                        this.field260[var54] = var56 - var55;
                    }
                    for (int var58 = 5; var58 < 156; ++var58) {
                        int var59 = 999;
                        int var60 = 0;
                        for (int var61 = 25; var61 < 172; ++var61) {
                            if (this.field122.field1725[this.field122.field1727 * var58 + var61] == 0 && (var61 > 34 || var58 > 34)) {
                                if (var59 == 999) {
                                    var59 = var61;
                                }
                            } else if (var59 != 999) {
                                var60 = var61;
                                break;
                            }
                        }
                        this.field135[var58 - 5] = var59 - 25;
                        this.field524[var58 - 5] = var60 - var59;
                    }
                    class48.method426(503, 765, field501);
                    this.field186 = class48.field1331;
                    class48.method426(96, 479, field501);
                    this.field183 = class48.field1331;
                    class48.method426(261, 190, field501);
                    this.field184 = class48.field1331;
                    class48.method426(334, 512, field501);
                    this.field185 = class48.field1331;
                    int[] var62 = new int[9];
                    for (int var63 = 0; var63 < 9; ++var63) {
                        int var64 = var63 * 32 + 128 + 15;
                        int var65 = var64 * 3 + 600;
                        int var66 = class48.field1329[var64];
                        var62[var63] = var65 * var66 >> 16;
                    }
                    class13.method225(334, 0, 800, var62, 512, 500);
                    class55.method502(var8);
                    this.field124 = new class20(this, (byte) 4);
                    this.method87(this.field124, 10);
                    class17.field784 = this;
                    class47.field1283 = this;
                    class44.field1229 = this;
                } catch (Exception var72) {
                    signlink.reporterror("loaderror " + this.field276 + " " + this.field512);
                    this.field191 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(LCHEFEIMI;B)V")
    private final void method156(class6 arg0, byte arg1) {
        int var3 = 0;
        int var4 = -1;
        int var5 = 0;
        int var6 = 0;
        if (arg0.field57 == 0) {
            var3 = this.field78.method215(arg0.field56, arg0.field58, arg0.field59);
        }
        if (arg0.field57 == 1) {
            var3 = this.field78.method216(arg0.field56, arg0.field58, arg0.field59, 0);
        }
        if (arg0.field57 == 2) {
            var3 = this.field78.method217(arg0.field56, arg0.field58, arg0.field59);
        }
        if (arg0.field57 == 3) {
            var3 = this.field78.method218(arg0.field56, arg0.field58, arg0.field59);
        }
        if (var3 != 0) {
            int var7 = this.field78.method219(arg0.field56, arg0.field58, arg0.field59, var3);
            var4 = var3 >> 14 & 32767;
            var5 = var7 & 31;
            var6 = var7 >> 6;
        }
        arg0.field63 = var4;
        if (arg1 == 39) {
            arg0.field65 = var5;
            arg0.field64 = var6;
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(III)V")
    public final void method157(int arg0, int arg1, int arg2) {
        int var4 = 0;
        for (int var5 = 0; var5 < 100; ++var5) {
            if (this.field224[var5] != null) {
                int var6 = this.field222[var5];
                int var7 = 70 - var4 * 14 + this.field382 + 4;
                if (var7 < -20) {
                    break;
                }
                String var8 = this.field223[var5];
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
                if ((var6 == 1 || var6 == 2) && (var6 == 1 || this.field68 == 0 || this.field68 == 1 && this.method16(var8, 38775))) {
                    if (arg1 > var7 - 14 && arg1 <= var7 && !var8.equals(field147.field952)) {
                        if (this.field101 >= 1) {
                            this.field441[this.field439] = "Report abuse @whi@" + var8;
                            this.field264[this.field439] = 591;
                            ++this.field439;
                        }
                        this.field441[this.field439] = "Add ignore @whi@" + var8;
                        this.field264[this.field439] = 673;
                        ++this.field439;
                        this.field441[this.field439] = "Add friend @whi@" + var8;
                        this.field264[this.field439] = 839;
                        ++this.field439;
                    }
                    ++var4;
                }
                if ((var6 == 3 || var6 == 7) && this.field452 == 0 && (var6 == 7 || this.field104 == 0 || this.field104 == 1 && this.method16(var8, 38775))) {
                    if (arg1 > var7 - 14 && arg1 <= var7) {
                        if (this.field101 >= 1) {
                            this.field441[this.field439] = "Report abuse @whi@" + var8;
                            this.field264[this.field439] = 591;
                            ++this.field439;
                        }
                        this.field441[this.field439] = "Add ignore @whi@" + var8;
                        this.field264[this.field439] = 673;
                        ++this.field439;
                        this.field441[this.field439] = "Add friend @whi@" + var8;
                        this.field264[this.field439] = 839;
                        ++this.field439;
                    }
                    ++var4;
                }
                if (var6 == 4 && (this.field174 == 0 || this.field174 == 1 && this.method16(var8, 38775))) {
                    if (arg1 > var7 - 14 && arg1 <= var7) {
                        this.field441[this.field439] = "Accept trade @whi@" + var8;
                        this.field264[this.field439] = 480;
                        ++this.field439;
                    }
                    ++var4;
                }
                if ((var6 == 5 || var6 == 6) && this.field452 == 0 && this.field104 < 2) {
                    ++var4;
                }
                if (var6 == 8 && (this.field174 == 0 || this.field174 == 1 && this.method16(var8, 38775))) {
                    if (arg1 > var7 - 14 && arg1 <= var7) {
                        this.field441[this.field439] = "Accept challenge @whi@" + var8;
                        this.field264[this.field439] = 189;
                        ++this.field439;
                    }
                    ++var4;
                }
            }
        }
        if (arg0 != 9) {
            this.method155();
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)V")
    public final void method158(String arg0, String arg1, boolean arg2) {
        signlink.errorname = arg0;
        try {
            if (!arg2) {
                this.field250 = "";
                this.field251 = "Connecting to server...";
                this.method101(true, -8466);
            }
            this.field74 = new class46(20196, this, this.method154(field503 + 43594));
            long var4 = class3.method5(arg0);
            int var6 = (int) (var4 >> 16 & 31L);
            this.field395.field1434 = 0;
            this.field395.method451(14);
            this.field395.method451(var6);
            this.field74.method411((byte) -32, 0, 2, this.field395.field1433);
            for (int var7 = 0; var7 < 8; ++var7) {
                this.field74.method408();
            }
            int var8 = this.field74.method408();
            int var9 = var8;
            if (var8 == 0) {
                this.field74.method410(this.field177.field1433, 0, 8);
                this.field177.field1434 = 0;
                this.field259 = this.field177.method467((byte) 50);
                int[] var10 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (this.field259 >> 32), (int) this.field259 };
                this.field395.field1434 = 0;
                this.field395.method451(10);
                this.field395.method455(var10[0]);
                this.field395.method455(var10[1]);
                this.field395.method455(var10[2]);
                this.field395.method455(var10[3]);
                this.field395.method455(signlink.uid);
                this.field395.method458(arg0);
                this.field395.method458(arg1);
                this.field395.method476(field453, field148, -734);
                this.field428.field1434 = 0;
                if (arg2) {
                    this.field428.method451(18);
                } else {
                    this.field428.method451(16);
                }
                this.field428.method451(this.field395.field1434 + 36 + 1 + 1 + 2);
                this.field428.method451(255);
                this.field428.method452(362);
                this.field428.method451(field505 ? 1 : 0);
                for (int var11 = 0; var11 < 9; ++var11) {
                    this.field428.method455(this.field409[var11]);
                }
                this.field428.method459(0, this.field395.field1433, this.field157, this.field395.field1434);
                this.field395.field1438 = new class39(var10, 10236);
                for (int var12 = 0; var12 < 4; ++var12) {
                    var10[var12] += 50;
                }
                this.field482 = new class39(var10, 10236);
                this.field74.method411((byte) -32, 0, this.field428.field1434, this.field428.field1433);
                var8 = this.field74.method408();
            }
            if (var8 == 1) {
                try {
                    Thread.sleep(2000L);
                } catch (Exception var22) {
                }
                this.method158(arg0, arg1, arg2);
            } else if (var8 == 2) {
                this.field101 = this.field74.method408();
                field205 = this.field74.method408() == 1;
                this.field411 = 0L;
                this.field322 = 0;
                this.field124.field877 = 0;
                super.field1570 = true;
                this.field105 = true;
                this.field355 = true;
                this.field395.field1434 = 0;
                this.field177.field1434 = 0;
                this.field367 = -1;
                this.field546 = -1;
                this.field547 = -1;
                this.field548 = -1;
                this.field366 = 0;
                this.field368 = 0;
                this.field180 = 0;
                this.field370 = 0;
                this.field315 = 0;
                this.field439 = 0;
                this.field498 = false;
                super.field1571 = 0;
                for (int var13 = 0; var13 < 100; ++var13) {
                    this.field224[var13] = null;
                }
                this.field513 = 0;
                this.field255 = 0;
                this.field302 = 0;
                this.field215 = 0;
                this.field277 = (int) (Math.random() * 100.0D) - 50;
                this.field219 = (int) (Math.random() * 110.0D) - 55;
                this.field151 = (int) (Math.random() * 80.0D) - 40;
                this.field271 = (int) (Math.random() * 120.0D) - 60;
                this.field154 = (int) (Math.random() * 30.0D) - 20;
                this.field284 = (int) (Math.random() * 20.0D) - 10 & 2047;
                this.field209 = 0;
                this.field444 = -1;
                this.field425 = 0;
                this.field426 = 0;
                this.field476 = 0;
                this.field195 = 0;
                for (int var14 = 0; var14 < this.field473; ++var14) {
                    this.field475[var14] = null;
                    this.field480[var14] = null;
                }
                for (int var15 = 0; var15 < 16384; ++var15) {
                    this.field194[var15] = null;
                }
                field147 = this.field475[this.field474] = new class27();
                this.field149.method185();
                this.field529.method185();
                for (int var16 = 0; var16 < 4; ++var16) {
                    for (int var17 = 0; var17 < 104; ++var17) {
                        for (int var18 = 0; var18 < 104; ++var18) {
                            this.field164[var16][var17][var18] = null;
                        }
                    }
                }
                this.field153 = new class11(0);
                this.field391 = 0;
                this.field390 = 0;
                this.method26((byte) -13, this.field400);
                this.field400 = -1;
                this.method26((byte) -13, this.field216);
                this.field216 = -1;
                this.method26((byte) -13, this.field329);
                this.field329 = -1;
                this.method26((byte) -13, this.field432);
                this.field432 = -1;
                this.method26((byte) -13, this.field163);
                this.field163 = -1;
                this.method26((byte) -13, this.field268);
                this.field268 = -1;
                this.method26((byte) -13, this.field393);
                this.field393 = -1;
                this.field249 = false;
                this.field536 = 3;
                this.field414 = 0;
                this.field498 = false;
                this.field117 = false;
                this.field304 = null;
                this.field203 = 0;
                this.field247 = -1;
                this.field161 = true;
                this.method94(24830);
                for (int var19 = 0; var19 < 5; ++var19) {
                    this.field207[var19] = 0;
                }
                for (int var20 = 0; var20 < 5; ++var20) {
                    this.field363[var20] = null;
                    this.field364[var20] = false;
                }
                field150 = 0;
                field362 = 0;
                field274 = 0;
                field348 = 0;
                field418 = 0;
                field100 = 0;
                field273 = 0;
                field470 = 0;
                field270 = 0;
                field240 = 0;
                this.method40(true);
            } else if (var8 == 3) {
                this.field250 = "";
                this.field251 = "Invalid username or password.";
            } else if (var8 == 4) {
                this.field250 = "Your account has been disabled.";
                this.field251 = "Please check your message-centre for details.";
            } else if (var8 == 5) {
                this.field250 = "Your account is already logged in.";
                this.field251 = "Try again in 60 secs...";
            } else if (var8 == 6) {
                this.field250 = "RuneScape has been updated!";
                this.field251 = "Please reload this page.";
            } else if (var8 == 7) {
                this.field250 = "This world is full.";
                this.field251 = "Please use a different world.";
            } else if (var8 == 8) {
                this.field250 = "Unable to connect.";
                this.field251 = "Login server offline.";
            } else if (var8 == 9) {
                this.field250 = "Login limit exceeded.";
                this.field251 = "Too many connections from your address.";
            } else if (var8 == 10) {
                this.field250 = "Unable to connect.";
                this.field251 = "Bad session id.";
            } else if (var8 == 11) {
                this.field250 = "Login server rejected session.";
                this.field251 = "Please try again.";
            } else if (var8 == 12) {
                this.field250 = "You need a members account to login to this world.";
                this.field251 = "Please subscribe, or use a different world.";
            } else if (var8 == 13) {
                this.field250 = "Could not complete login.";
                this.field251 = "Please try using a different world.";
            } else if (var8 == 14) {
                this.field250 = "The server is being updated.";
                this.field251 = "Please wait 1 minute and try again.";
            } else if (var8 == 15) {
                this.field355 = true;
                this.field395.field1434 = 0;
                this.field177.field1434 = 0;
                this.field367 = -1;
                this.field546 = -1;
                this.field547 = -1;
                this.field548 = -1;
                this.field366 = 0;
                this.field368 = 0;
                this.field180 = 0;
                this.field439 = 0;
                this.field498 = false;
                this.field493 = System.currentTimeMillis();
            } else if (var8 == 16) {
                this.field250 = "Login attempts exceeded.";
                this.field251 = "Please wait 1 minute and try again.";
            } else if (var8 == 17) {
                this.field250 = "You are standing in a members-only area.";
                this.field251 = "To play on this world move to a free area first";
            } else if (var8 == 20) {
                this.field250 = "Invalid loginserver requested";
                this.field251 = "Please try using a different world.";
            } else if (var8 != 21) {
                if (var8 == 22) {
                    this.field250 = "Malformed login packet.";
                    this.field251 = "Please try again.";
                } else if (var8 == 23) {
                    this.field250 = "This computers address has been blocked";
                    this.field251 = "as it was used to break our rules";
                } else if (var8 == -1) {
                    if (var9 == 0) {
                        if (this.field531 < 2) {
                            try {
                                Thread.sleep(2000L);
                            } catch (Exception var24) {
                            }
                            ++this.field531;
                            this.method158(arg0, arg1, arg2);
                        } else {
                            this.field250 = "No response from loginserver";
                            this.field251 = "Please wait 1 minute and try again.";
                        }
                    } else {
                        this.field250 = "No response from server";
                        this.field251 = "Please try using a different world.";
                    }
                } else {
                    System.out.println("response:" + var8);
                    this.field250 = "Unexpected server response";
                    this.field251 = "Please try using a different world.";
                }
            } else {
                int var21 = this.field74.method408();
                for (int var26 = var21 + 3; var26 >= 0; --var26) {
                    this.field250 = "You have only just left another world";
                    this.field251 = "Your profile will be transferred in: " + var26;
                    this.method101(true, -8466);
                    try {
                        Thread.sleep(1200L);
                    } catch (Exception var23) {
                    }
                }
                this.method158(arg0, arg1, arg2);
            }
        } catch (IOException var25) {
            this.field250 = "";
            this.field251 = "Error connecting to server.";
        }
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; ++var1) {
            field211[var1] = var0 - 1;
            var0 += var0;
        }
        field309 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };
        field347 = -43582;
        field415 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };
        field436 = 8;
        field453 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");
        field494 = new int[99];
        int var2 = 0;
        for (int var3 = 0; var3 < 99; ++var3) {
            int var4 = var3 + 1;
            int var5 = (int) ((double) var4 + 300.0D * Math.pow(2.0D, (double) var4 / 7.0D));
            var2 += var5;
            field494[var3] = var2 / 4;
        }
        field501 = true;
        field502 = 10;
        field504 = true;
    }
}
