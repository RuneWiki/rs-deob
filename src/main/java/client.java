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
public class client extends class1 {

    @OriginalMember(owner = "client", name = "H", descriptor = "[LIBHVCUAH;")
    private class19[] field108 = new class19[1000];

    @OriginalMember(owner = "client", name = "J", descriptor = "I")
    private int field110 = -40048;

    @OriginalMember(owner = "client", name = "M", descriptor = "I")
    private int field113 = 2;

    @OriginalMember(owner = "client", name = "N", descriptor = "[I")
    private int[] field114 = new int[4000];

    @OriginalMember(owner = "client", name = "O", descriptor = "[I")
    private int[] field115 = new int[4000];

    @OriginalMember(owner = "client", name = "P", descriptor = "[Z")
    private boolean[] field116 = new boolean[5];

    @OriginalMember(owner = "client", name = "Q", descriptor = "B")
    private byte field117 = 6;

    @OriginalMember(owner = "client", name = "S", descriptor = "I")
    private int field119 = 128;

    @OriginalMember(owner = "client", name = "Y", descriptor = "I")
    private int field125 = 3;

    @OriginalMember(owner = "client", name = "Z", descriptor = "I")
    private int field126 = -1;

    @OriginalMember(owner = "client", name = "ab", descriptor = "I")
    private int field127 = -56;

    @OriginalMember(owner = "client", name = "bb", descriptor = "[I")
    private int[] field128 = new int[33];

    @OriginalMember(owner = "client", name = "cb", descriptor = "[Ljava/lang/String;")
    private String[] field129 = new String[5];

    @OriginalMember(owner = "client", name = "db", descriptor = "[Z")
    private boolean[] field130 = new boolean[5];

    @OriginalMember(owner = "client", name = "hb", descriptor = "I")
    private int field134 = 50;

    @OriginalMember(owner = "client", name = "ib", descriptor = "[I")
    private int[] field135 = new int[this.field134];

    @OriginalMember(owner = "client", name = "jb", descriptor = "[I")
    private int[] field136 = new int[this.field134];

    @OriginalMember(owner = "client", name = "kb", descriptor = "[I")
    private int[] field137 = new int[this.field134];

    @OriginalMember(owner = "client", name = "lb", descriptor = "[I")
    private int[] field138 = new int[this.field134];

    @OriginalMember(owner = "client", name = "mb", descriptor = "[I")
    private int[] field139 = new int[this.field134];

    @OriginalMember(owner = "client", name = "nb", descriptor = "[I")
    private int[] field140 = new int[this.field134];

    @OriginalMember(owner = "client", name = "ob", descriptor = "[I")
    private int[] field141 = new int[this.field134];

    @OriginalMember(owner = "client", name = "pb", descriptor = "[Ljava/lang/String;")
    private String[] field142 = new String[this.field134];

    @OriginalMember(owner = "client", name = "sb", descriptor = "I")
    private int field145 = 3;

    @OriginalMember(owner = "client", name = "yb", descriptor = "I")
    private int field151 = -40048;

    @OriginalMember(owner = "client", name = "Ib", descriptor = "Z")
    private boolean field161 = false;

    @OriginalMember(owner = "client", name = "Jb", descriptor = "[I")
    private int[] field162 = new int[200];

    @OriginalMember(owner = "client", name = "Vb", descriptor = "B")
    private byte field174 = -26;

    @OriginalMember(owner = "client", name = "Wb", descriptor = "I")
    private int field175 = -67;

    @OriginalMember(owner = "client", name = "Yb", descriptor = "[I")
    private int[] field177 = new int[9];

    @OriginalMember(owner = "client", name = "Zb", descriptor = "[I")
    private int[] field178 = new int[class3.field36];

    @OriginalMember(owner = "client", name = "ac", descriptor = "Ljava/lang/String;")
    private String field179 = "";

    @OriginalMember(owner = "client", name = "bc", descriptor = "Z")
    private boolean field180 = false;

    @OriginalMember(owner = "client", name = "cc", descriptor = "I")
    private int field181 = 78;

    @OriginalMember(owner = "client", name = "dc", descriptor = "Z")
    private volatile boolean field182 = false;

    @OriginalMember(owner = "client", name = "lc", descriptor = "Z")
    private boolean field190 = false;

    @OriginalMember(owner = "client", name = "tc", descriptor = "I")
    private int field198 = 2;

    @OriginalMember(owner = "client", name = "Dc", descriptor = "LURASIGRB;")
    private class58 field208 = new class58(41824);

    @OriginalMember(owner = "client", name = "Ic", descriptor = "[I")
    private int[] field213 = new int[50];

    @OriginalMember(owner = "client", name = "Lc", descriptor = "[I")
    private int[] field216 = new int[class3.field36];

    @OriginalMember(owner = "client", name = "Qc", descriptor = "B")
    private byte field221 = 109;

    @OriginalMember(owner = "client", name = "Rc", descriptor = "B")
    private byte field222 = 1;

    @OriginalMember(owner = "client", name = "bd", descriptor = "Z")
    private boolean field232 = false;

    @OriginalMember(owner = "client", name = "id", descriptor = "Ljava/util/zip/CRC32;")
    private CRC32 field239 = new CRC32();

    @OriginalMember(owner = "client", name = "jd", descriptor = "Ljava/lang/String;")
    private String field240 = "";

    @OriginalMember(owner = "client", name = "kd", descriptor = "Ljava/lang/String;")
    private String field241 = "";

    @OriginalMember(owner = "client", name = "md", descriptor = "I")
    private int field243 = -1;

    @OriginalMember(owner = "client", name = "nd", descriptor = "Z")
    private boolean field244 = true;

    @OriginalMember(owner = "client", name = "od", descriptor = "I")
    private int field245 = 1;

    @OriginalMember(owner = "client", name = "rd", descriptor = "Z")
    public boolean field248 = false;

    @OriginalMember(owner = "client", name = "sd", descriptor = "[I")
    private int[] field249 = new int[500];

    @OriginalMember(owner = "client", name = "td", descriptor = "[I")
    private int[] field250 = new int[500];

    @OriginalMember(owner = "client", name = "ud", descriptor = "[I")
    private int[] field251 = new int[500];

    @OriginalMember(owner = "client", name = "vd", descriptor = "[I")
    private int[] field252 = new int[500];

    @OriginalMember(owner = "client", name = "Dd", descriptor = "Z")
    private boolean field260 = false;

    @OriginalMember(owner = "client", name = "Jd", descriptor = "[I")
    private int[] field266 = new int[151];

    @OriginalMember(owner = "client", name = "Kd", descriptor = "Z")
    private boolean field267 = false;

    @OriginalMember(owner = "client", name = "Md", descriptor = "I")
    private int field269 = -1;

    @OriginalMember(owner = "client", name = "Td", descriptor = "B")
    private byte field276 = 2;

    @OriginalMember(owner = "client", name = "Ud", descriptor = "Z")
    private boolean field277 = false;

    @OriginalMember(owner = "client", name = "Vd", descriptor = "B")
    private byte field278 = 0;

    @OriginalMember(owner = "client", name = "Wd", descriptor = "I")
    private int field279 = 3353893;

    @OriginalMember(owner = "client", name = "Yd", descriptor = "B")
    private byte field281 = 9;

    @OriginalMember(owner = "client", name = "Zd", descriptor = "[I")
    private int[] field282 = new int[class3.field36];

    @OriginalMember(owner = "client", name = "ce", descriptor = "Z")
    public boolean field285 = true;

    @OriginalMember(owner = "client", name = "de", descriptor = "[I")
    public int[] field286 = new int[2000];

    @OriginalMember(owner = "client", name = "ee", descriptor = "[I")
    private int[] field287 = new int[50];

    @OriginalMember(owner = "client", name = "ge", descriptor = "[I")
    private int[] field289 = new int[1000];

    @OriginalMember(owner = "client", name = "he", descriptor = "[I")
    private int[] field290 = new int[1000];

    @OriginalMember(owner = "client", name = "ke", descriptor = "I")
    private int field293 = 1;

    @OriginalMember(owner = "client", name = "le", descriptor = "B")
    private byte field294 = 4;

    @OriginalMember(owner = "client", name = "me", descriptor = "LUAWAYCTK;")
    private class55 field295 = class55.method443(-400, 1);

    @OriginalMember(owner = "client", name = "ne", descriptor = "Z")
    private boolean field296 = false;

    @OriginalMember(owner = "client", name = "pe", descriptor = "[I")
    public int[] field298 = new int[1000];

    @OriginalMember(owner = "client", name = "qe", descriptor = "I")
    private int field299 = -1;

    @OriginalMember(owner = "client", name = "re", descriptor = "Ljava/lang/String;")
    private String field300 = "";

    @OriginalMember(owner = "client", name = "se", descriptor = "Z")
    private boolean field301 = false;

    @OriginalMember(owner = "client", name = "te", descriptor = "[LIBHVCUAH;")
    private class19[] field302 = new class19[20];

    @OriginalMember(owner = "client", name = "ve", descriptor = "B")
    private byte field304 = 1;

    @OriginalMember(owner = "client", name = "we", descriptor = "[Ljava/lang/String;")
    private String[] field305 = new String[500];

    @OriginalMember(owner = "client", name = "xe", descriptor = "LLYHLTGUG;")
    private class29 field306 = new class29();

    @OriginalMember(owner = "client", name = "Ce", descriptor = "[[I")
    private int[][] field311 = new int[104][104];

    @OriginalMember(owner = "client", name = "De", descriptor = "I")
    private int field312 = 7759444;

    @OriginalMember(owner = "client", name = "Ee", descriptor = "[J")
    private long[] field313 = new long[200];

    @OriginalMember(owner = "client", name = "Ie", descriptor = "B")
    private byte field317 = 6;

    @OriginalMember(owner = "client", name = "Le", descriptor = "LUAWAYCTK;")
    private class55 field320 = class55.method443(-400, 1);

    @OriginalMember(owner = "client", name = "Me", descriptor = "[I")
    private int[] field321 = new int[151];

    @OriginalMember(owner = "client", name = "Ze", descriptor = "Z")
    private boolean field334 = false;

    @OriginalMember(owner = "client", name = "cf", descriptor = "I")
    private int field337 = -1;

    @OriginalMember(owner = "client", name = "df", descriptor = "I")
    private int field338 = -1;

    @OriginalMember(owner = "client", name = "ef", descriptor = "Ljava/lang/String;")
    private String field339 = "";

    @OriginalMember(owner = "client", name = "gf", descriptor = "Z")
    private boolean field341 = false;

    @OriginalMember(owner = "client", name = "hf", descriptor = "[I")
    private int[] field342 = new int[5];

    @OriginalMember(owner = "client", name = "mf", descriptor = "I")
    private int field346 = 1;

    @OriginalMember(owner = "client", name = "pf", descriptor = "I")
    private int field349 = -1;

    @OriginalMember(owner = "client", name = "rf", descriptor = "I")
    private int field351 = 5063219;

    @OriginalMember(owner = "client", name = "sf", descriptor = "[I")
    private int[] field352 = new int[2000];

    @OriginalMember(owner = "client", name = "vf", descriptor = "I")
    private int field355 = -1;

    @OriginalMember(owner = "client", name = "wf", descriptor = "I")
    private int field356 = -1;

    @OriginalMember(owner = "client", name = "xf", descriptor = "Ljava/lang/String;")
    private String field357 = "";

    @OriginalMember(owner = "client", name = "yf", descriptor = "Ljava/lang/String;")
    private String field358 = "";

    @OriginalMember(owner = "client", name = "Bf", descriptor = "I")
    private final int field361 = 100;

    @OriginalMember(owner = "client", name = "Cf", descriptor = "[I")
    private int[] field362 = new int[100];

    @OriginalMember(owner = "client", name = "Df", descriptor = "LUAWAYCTK;")
    private class55 field363 = class55.method443(-400, 1);

    @OriginalMember(owner = "client", name = "Ef", descriptor = "LUAWAYCTK;")
    private class55 field364 = new class55(741, new byte[5000]);

    @OriginalMember(owner = "client", name = "Ff", descriptor = "[LJKNLPRIU;")
    private class25[] field365 = new class25[16384];

    @OriginalMember(owner = "client", name = "Hf", descriptor = "[I")
    public int[] field367 = new int[16384];

    @OriginalMember(owner = "client", name = "Kf", descriptor = "Z")
    private boolean field370 = true;

    @OriginalMember(owner = "client", name = "Pf", descriptor = "I")
    private int field375 = -1;

    @OriginalMember(owner = "client", name = "Rf", descriptor = "I")
    private int field377 = 2;

    @OriginalMember(owner = "client", name = "bg", descriptor = "Z")
    private volatile boolean field387 = false;

    @OriginalMember(owner = "client", name = "cg", descriptor = "Ljava/lang/String;")
    private String field388 = "";

    @OriginalMember(owner = "client", name = "dg", descriptor = "B")
    private byte field389 = 9;

    @OriginalMember(owner = "client", name = "eg", descriptor = "[LXHDQQNIR;")
    private class68[] field390 = new class68[100];

    @OriginalMember(owner = "client", name = "fg", descriptor = "[I")
    private int[] field391 = new int[33];

    @OriginalMember(owner = "client", name = "ng", descriptor = "[J")
    private long[] field399 = new long[100];

    @OriginalMember(owner = "client", name = "sg", descriptor = "I")
    private int field404 = 2301979;

    @OriginalMember(owner = "client", name = "ug", descriptor = "I")
    private int field406 = 3;

    @OriginalMember(owner = "client", name = "vg", descriptor = "[I")
    private int[] field407 = new int[5];

    @OriginalMember(owner = "client", name = "wg", descriptor = "Ljava/lang/String;")
    private String field408 = "";

    @OriginalMember(owner = "client", name = "xg", descriptor = "Z")
    private boolean field409 = false;

    @OriginalMember(owner = "client", name = "Ag", descriptor = "Z")
    private boolean field412 = false;

    @OriginalMember(owner = "client", name = "Bg", descriptor = "Z")
    private boolean field413 = false;

    @OriginalMember(owner = "client", name = "Cg", descriptor = "I")
    private int field414 = -1;

    @OriginalMember(owner = "client", name = "Fg", descriptor = "[I")
    private int[] field417 = new int[5];

    @OriginalMember(owner = "client", name = "Gg", descriptor = "[I")
    private int[] field418 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client", name = "Ug", descriptor = "I")
    private int field432 = 30130;

    @OriginalMember(owner = "client", name = "Vg", descriptor = "I")
    private int field433 = 973;

    @OriginalMember(owner = "client", name = "Wg", descriptor = "[LMQOIEGDZ;")
    public class33[] field434 = new class33[5];

    @OriginalMember(owner = "client", name = "Xg", descriptor = "Z")
    private boolean field435 = false;

    @OriginalMember(owner = "client", name = "Zg", descriptor = "I")
    private int field437 = 3;

    @OriginalMember(owner = "client", name = "gh", descriptor = "I")
    private int field444 = -66;

    @OriginalMember(owner = "client", name = "hh", descriptor = "[LCGGBZSOS;")
    private class5[] field445 = new class5[4];

    @OriginalMember(owner = "client", name = "lh", descriptor = "Z")
    private boolean field449 = true;

    @OriginalMember(owner = "client", name = "mh", descriptor = "LURASIGRB;")
    private class58 field450 = new class58(41824);

    @OriginalMember(owner = "client", name = "nh", descriptor = "[I")
    private int[] field451 = new int[5];

    @OriginalMember(owner = "client", name = "oh", descriptor = "I")
    private int field452 = -77;

    @OriginalMember(owner = "client", name = "ph", descriptor = "Z")
    private volatile boolean field453 = false;

    @OriginalMember(owner = "client", name = "rh", descriptor = "Z")
    private boolean field455 = false;

    @OriginalMember(owner = "client", name = "vh", descriptor = "Z")
    private boolean field459 = false;

    @OriginalMember(owner = "client", name = "zh", descriptor = "LURASIGRB;")
    private class58 field463 = new class58(41824);

    @OriginalMember(owner = "client", name = "Ah", descriptor = "Z")
    private boolean field464 = true;

    @OriginalMember(owner = "client", name = "Bh", descriptor = "[LIBHVCUAH;")
    private class19[] field465 = new class19[8];

    @OriginalMember(owner = "client", name = "Ch", descriptor = "[LIBHVCUAH;")
    private class19[] field466 = new class19[32];

    @OriginalMember(owner = "client", name = "Dh", descriptor = "[LIBHVCUAH;")
    private class19[] field467 = new class19[32];

    @OriginalMember(owner = "client", name = "Eh", descriptor = "I")
    private int field468 = 2048;

    @OriginalMember(owner = "client", name = "Fh", descriptor = "I")
    private int field469 = 2047;

    @OriginalMember(owner = "client", name = "Gh", descriptor = "[LUFGXOLGK;")
    private class56[] field470 = new class56[this.field468];

    @OriginalMember(owner = "client", name = "Ih", descriptor = "[I")
    public int[] field472 = new int[this.field468];

    @OriginalMember(owner = "client", name = "Kh", descriptor = "[I")
    private int[] field474 = new int[this.field468];

    @OriginalMember(owner = "client", name = "Lh", descriptor = "[LUAWAYCTK;")
    private class55[] field475 = new class55[this.field468];

    @OriginalMember(owner = "client", name = "Mh", descriptor = "I")
    private int field476 = -1;

    @OriginalMember(owner = "client", name = "Nh", descriptor = "[I")
    private int[] field477 = new int[50];

    @OriginalMember(owner = "client", name = "Ph", descriptor = "I")
    private int field479 = 974;

    @OriginalMember(owner = "client", name = "Qh", descriptor = "Z")
    private boolean field480 = true;

    @OriginalMember(owner = "client", name = "Rh", descriptor = "I")
    private int field481 = -752;

    @OriginalMember(owner = "client", name = "Th", descriptor = "I")
    private int field483 = 504;

    @OriginalMember(owner = "client", name = "Wh", descriptor = "Z")
    private boolean field486 = false;

    @OriginalMember(owner = "client", name = "ai", descriptor = "Z")
    private boolean field490 = false;

    @OriginalMember(owner = "client", name = "di", descriptor = "[B")
    private byte[] field493 = new byte[16384];

    @OriginalMember(owner = "client", name = "ji", descriptor = "Z")
    private boolean field499 = false;

    @OriginalMember(owner = "client", name = "ki", descriptor = "[LXHDQQNIR;")
    private class68[] field500 = new class68[2];

    @OriginalMember(owner = "client", name = "mi", descriptor = "Z")
    private boolean field502 = false;

    @OriginalMember(owner = "client", name = "ni", descriptor = "Z")
    private boolean field503 = false;

    @OriginalMember(owner = "client", name = "pi", descriptor = "[LIBHVCUAH;")
    private class19[] field505 = new class19[100];

    @OriginalMember(owner = "client", name = "ri", descriptor = "Z")
    private boolean field507 = false;

    @OriginalMember(owner = "client", name = "zi", descriptor = "Z")
    private boolean field515 = true;

    @OriginalMember(owner = "client", name = "Ji", descriptor = "[I")
    private int[] field525 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client", name = "Qi", descriptor = "Z")
    private boolean field532 = true;

    @OriginalMember(owner = "client", name = "Ri", descriptor = "I")
    private int field533 = 33820;

    @OriginalMember(owner = "client", name = "Si", descriptor = "I")
    private int field534 = -1;

    @OriginalMember(owner = "client", name = "Vi", descriptor = "I")
    private int field537 = -1;

    @OriginalMember(owner = "client", name = "Wi", descriptor = "[[I")
    private int[][] field538 = new int[104][104];

    @OriginalMember(owner = "client", name = "Yi", descriptor = "I")
    private int field540 = 1;

    @OriginalMember(owner = "client", name = "aj", descriptor = "[I")
    private int[] field542 = new int[256];

    @OriginalMember(owner = "client", name = "bj", descriptor = "[[I")
    private int[][] field543 = new int[104][104];

    @OriginalMember(owner = "client", name = "cj", descriptor = "[I")
    private int[] field544 = new int[5];

    @OriginalMember(owner = "client", name = "dj", descriptor = "[I")
    private int[] field545 = new int[7];

    @OriginalMember(owner = "client", name = "ej", descriptor = "Z")
    private boolean field546 = false;

    @OriginalMember(owner = "client", name = "fj", descriptor = "Z")
    private boolean field547 = false;

    @OriginalMember(owner = "client", name = "mj", descriptor = "Z")
    private boolean field554 = false;

    @OriginalMember(owner = "client", name = "pj", descriptor = "[I")
    private int[] field557 = new int[100];

    @OriginalMember(owner = "client", name = "qj", descriptor = "[Ljava/lang/String;")
    private String[] field558 = new String[100];

    @OriginalMember(owner = "client", name = "rj", descriptor = "[Ljava/lang/String;")
    private String[] field559 = new String[100];

    @OriginalMember(owner = "client", name = "sj", descriptor = "I")
    private int field560 = -1;

    @OriginalMember(owner = "client", name = "uj", descriptor = "[LIBHVCUAH;")
    private class19[] field562 = new class19[32];

    @OriginalMember(owner = "client", name = "vj", descriptor = "[LXHDQQNIR;")
    private class68[] field563 = new class68[13];

    @OriginalMember(owner = "client", name = "Bj", descriptor = "[[[I")
    private int[][][] field569 = new int[4][13][13];

    @OriginalMember(owner = "client", name = "Cj", descriptor = "[I")
    private final int[] field570 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client", name = "Ej", descriptor = "Z")
    private boolean field572 = false;

    @OriginalMember(owner = "client", name = "Mj", descriptor = "[[[LURASIGRB;")
    private class58[][][] field580 = new class58[4][104][104];

    @OriginalMember(owner = "client", name = "Nj", descriptor = "[Ljava/lang/String;")
    private String[] field581 = new String[200];

    @OriginalMember(owner = "client", name = "R", descriptor = "[I")
    public static final int[] field118 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };

    @OriginalMember(owner = "client", name = "Eb", descriptor = "Z")
    private static boolean field157 = true;

    @OriginalMember(owner = "client", name = "fc", descriptor = "[I")
    public static int[] field184 = new int[32];

    @OriginalMember(owner = "client", name = "oc", descriptor = "I")
    private static int field193;

    @OriginalMember(owner = "client", name = "qc", descriptor = "Z")
    private static boolean field195;

    @OriginalMember(owner = "client", name = "Cd", descriptor = "I")
    private static int field259;

    @OriginalMember(owner = "client", name = "ue", descriptor = "[[I")
    public static final int[][] field303;

    @OriginalMember(owner = "client", name = "kf", descriptor = "Ljava/math/BigInteger;")
    private static BigInteger field344;

    @OriginalMember(owner = "client", name = "Vf", descriptor = "Z")
    private static boolean field381;

    @OriginalMember(owner = "client", name = "Dg", descriptor = "Ljava/math/BigInteger;")
    private static BigInteger field415;

    @OriginalMember(owner = "client", name = "wh", descriptor = "B")
    private static byte field460;

    @OriginalMember(owner = "client", name = "yh", descriptor = "[I")
    private static int[] field462;

    @OriginalMember(owner = "client", name = "Ii", descriptor = "Ljava/lang/String;")
    private static String field524;

    @OriginalMember(owner = "client", name = "Ti", descriptor = "I")
    private static int field535;

    @OriginalMember(owner = "client", name = "I", descriptor = "I")
    private int field109;

    @OriginalMember(owner = "client", name = "K", descriptor = "I")
    private int field111;

    @OriginalMember(owner = "client", name = "L", descriptor = "I")
    private int field112;

    @OriginalMember(owner = "client", name = "T", descriptor = "I")
    private int field120;

    @OriginalMember(owner = "client", name = "U", descriptor = "I")
    private int field121;

    @OriginalMember(owner = "client", name = "V", descriptor = "I")
    private int field122;

    @OriginalMember(owner = "client", name = "W", descriptor = "I")
    private int field123;

    @OriginalMember(owner = "client", name = "eb", descriptor = "I")
    private int field131;

    @OriginalMember(owner = "client", name = "gb", descriptor = "I")
    private int field133;

    @OriginalMember(owner = "client", name = "tb", descriptor = "I")
    private int field146;

    @OriginalMember(owner = "client", name = "ub", descriptor = "I")
    private int field147;

    @OriginalMember(owner = "client", name = "vb", descriptor = "I")
    private int field148;

    @OriginalMember(owner = "client", name = "xb", descriptor = "I")
    private static int field150;

    @OriginalMember(owner = "client", name = "zb", descriptor = "I")
    private int field152;

    @OriginalMember(owner = "client", name = "Ab", descriptor = "I")
    private int field153;

    @OriginalMember(owner = "client", name = "Bb", descriptor = "I")
    private int field154;

    @OriginalMember(owner = "client", name = "Cb", descriptor = "I")
    private int field155;

    @OriginalMember(owner = "client", name = "Db", descriptor = "I")
    private int field156;

    @OriginalMember(owner = "client", name = "Hb", descriptor = "I")
    private int field160;

    @OriginalMember(owner = "client", name = "Lb", descriptor = "I")
    private static int field164;

    @OriginalMember(owner = "client", name = "Xb", descriptor = "I")
    private static int field176;

    @OriginalMember(owner = "client", name = "ec", descriptor = "I")
    private int field183;

    @OriginalMember(owner = "client", name = "gc", descriptor = "I")
    private int field185;

    @OriginalMember(owner = "client", name = "hc", descriptor = "I")
    private int field186;

    @OriginalMember(owner = "client", name = "ic", descriptor = "I")
    private int field187;

    @OriginalMember(owner = "client", name = "jc", descriptor = "I")
    private int field188;

    @OriginalMember(owner = "client", name = "kc", descriptor = "I")
    private int field189;

    @OriginalMember(owner = "client", name = "mc", descriptor = "I")
    private int field191;

    @OriginalMember(owner = "client", name = "pc", descriptor = "I")
    public static int field194;

    @OriginalMember(owner = "client", name = "sc", descriptor = "I")
    private int field197;

    @OriginalMember(owner = "client", name = "Ec", descriptor = "I")
    private int field209;

    @OriginalMember(owner = "client", name = "Fc", descriptor = "I")
    private int field210;

    @OriginalMember(owner = "client", name = "Gc", descriptor = "I")
    private int field211;

    @OriginalMember(owner = "client", name = "Hc", descriptor = "I")
    private int field212;

    @OriginalMember(owner = "client", name = "Jc", descriptor = "I")
    private int field214;

    @OriginalMember(owner = "client", name = "Kc", descriptor = "I")
    private int field215;

    @OriginalMember(owner = "client", name = "Mc", descriptor = "I")
    private int field217;

    @OriginalMember(owner = "client", name = "Nc", descriptor = "I")
    private int field218;

    @OriginalMember(owner = "client", name = "Oc", descriptor = "I")
    private int field219;

    @OriginalMember(owner = "client", name = "Pc", descriptor = "I")
    private int field220;

    @OriginalMember(owner = "client", name = "Sc", descriptor = "I")
    private int field223;

    @OriginalMember(owner = "client", name = "Tc", descriptor = "I")
    private int field224;

    @OriginalMember(owner = "client", name = "Uc", descriptor = "I")
    private int field225;

    @OriginalMember(owner = "client", name = "Vc", descriptor = "I")
    private int field226;

    @OriginalMember(owner = "client", name = "Wc", descriptor = "I")
    private int field227;

    @OriginalMember(owner = "client", name = "Xc", descriptor = "I")
    public int field228;

    @OriginalMember(owner = "client", name = "cd", descriptor = "I")
    private int field233;

    @OriginalMember(owner = "client", name = "dd", descriptor = "I")
    private int field234;

    @OriginalMember(owner = "client", name = "hd", descriptor = "I")
    private int field238;

    @OriginalMember(owner = "client", name = "qd", descriptor = "I")
    private static int field247;

    @OriginalMember(owner = "client", name = "wd", descriptor = "I")
    private int field253;

    @OriginalMember(owner = "client", name = "xd", descriptor = "I")
    private int field254;

    @OriginalMember(owner = "client", name = "yd", descriptor = "I")
    private int field255;

    @OriginalMember(owner = "client", name = "zd", descriptor = "I")
    private int field256;

    @OriginalMember(owner = "client", name = "Ad", descriptor = "I")
    private int field257;

    @OriginalMember(owner = "client", name = "Bd", descriptor = "I")
    private int field258;

    @OriginalMember(owner = "client", name = "Ed", descriptor = "I")
    private int field261;

    @OriginalMember(owner = "client", name = "Fd", descriptor = "I")
    private int field262;

    @OriginalMember(owner = "client", name = "Gd", descriptor = "I")
    private int field263;

    @OriginalMember(owner = "client", name = "Hd", descriptor = "I")
    private int field264;

    @OriginalMember(owner = "client", name = "Id", descriptor = "I")
    private int field265;

    @OriginalMember(owner = "client", name = "Ld", descriptor = "I")
    private int field268;

    @OriginalMember(owner = "client", name = "Nd", descriptor = "I")
    private int field270;

    @OriginalMember(owner = "client", name = "ae", descriptor = "I")
    private int field283;

    @OriginalMember(owner = "client", name = "be", descriptor = "I")
    private int field284;

    @OriginalMember(owner = "client", name = "fe", descriptor = "I")
    private int field288;

    @OriginalMember(owner = "client", name = "ie", descriptor = "I")
    private int field291;

    @OriginalMember(owner = "client", name = "je", descriptor = "I")
    private int field292;

    @OriginalMember(owner = "client", name = "oe", descriptor = "I")
    private int field297;

    @OriginalMember(owner = "client", name = "Ke", descriptor = "I")
    private int field319;

    @OriginalMember(owner = "client", name = "Oe", descriptor = "I")
    private static int field323;

    @OriginalMember(owner = "client", name = "Te", descriptor = "I")
    private int field328;

    @OriginalMember(owner = "client", name = "Ue", descriptor = "I")
    private int field329;

    @OriginalMember(owner = "client", name = "af", descriptor = "I")
    private int field335;

    @OriginalMember(owner = "client", name = "bf", descriptor = "I")
    private int field336;

    @OriginalMember(owner = "client", name = "ff", descriptor = "I")
    public static int field340;

    @OriginalMember(owner = "client", name = "jf", descriptor = "I")
    private int field343;

    @OriginalMember(owner = "client", name = "lf", descriptor = "I")
    private int field345;

    @OriginalMember(owner = "client", name = "nf", descriptor = "I")
    public static int field347;

    @OriginalMember(owner = "client", name = "of", descriptor = "I")
    private static int field348;

    @OriginalMember(owner = "client", name = "qf", descriptor = "I")
    private static int field350;

    @OriginalMember(owner = "client", name = "tf", descriptor = "I")
    private int field353;

    @OriginalMember(owner = "client", name = "uf", descriptor = "I")
    private int field354;

    @OriginalMember(owner = "client", name = "zf", descriptor = "I")
    private int field359;

    @OriginalMember(owner = "client", name = "Gf", descriptor = "I")
    private int field366;

    @OriginalMember(owner = "client", name = "If", descriptor = "I")
    private int field368;

    @OriginalMember(owner = "client", name = "Jf", descriptor = "I")
    private int field369;

    @OriginalMember(owner = "client", name = "Of", descriptor = "I")
    private int field374;

    @OriginalMember(owner = "client", name = "Qf", descriptor = "I")
    private int field376;

    @OriginalMember(owner = "client", name = "Sf", descriptor = "I")
    private int field378;

    @OriginalMember(owner = "client", name = "Tf", descriptor = "I")
    private int field379;

    @OriginalMember(owner = "client", name = "Uf", descriptor = "I")
    private int field380;

    @OriginalMember(owner = "client", name = "Yf", descriptor = "I")
    private int field384;

    @OriginalMember(owner = "client", name = "Zf", descriptor = "I")
    private int field385;

    @OriginalMember(owner = "client", name = "ag", descriptor = "I")
    private int field386;

    @OriginalMember(owner = "client", name = "lg", descriptor = "I")
    private int field397;

    @OriginalMember(owner = "client", name = "mg", descriptor = "I")
    private int field398;

    @OriginalMember(owner = "client", name = "og", descriptor = "I")
    private int field400;

    @OriginalMember(owner = "client", name = "pg", descriptor = "I")
    private int field401;

    @OriginalMember(owner = "client", name = "rg", descriptor = "I")
    private int field403;

    @OriginalMember(owner = "client", name = "tg", descriptor = "I")
    private int field405;

    @OriginalMember(owner = "client", name = "yg", descriptor = "I")
    private int field410;

    @OriginalMember(owner = "client", name = "zg", descriptor = "I")
    private int field411;

    @OriginalMember(owner = "client", name = "Og", descriptor = "I")
    private static int field426;

    @OriginalMember(owner = "client", name = "Pg", descriptor = "I")
    private int field427;

    @OriginalMember(owner = "client", name = "Qg", descriptor = "I")
    private int field428;

    @OriginalMember(owner = "client", name = "Rg", descriptor = "I")
    private int field429;

    @OriginalMember(owner = "client", name = "Sg", descriptor = "I")
    private int field430;

    @OriginalMember(owner = "client", name = "Tg", descriptor = "I")
    private static int field431;

    @OriginalMember(owner = "client", name = "Yg", descriptor = "I")
    private int field436;

    @OriginalMember(owner = "client", name = "ah", descriptor = "I")
    private int field438;

    @OriginalMember(owner = "client", name = "bh", descriptor = "I")
    private int field439;

    @OriginalMember(owner = "client", name = "ch", descriptor = "I")
    private int field440;

    @OriginalMember(owner = "client", name = "dh", descriptor = "I")
    private int field441;

    @OriginalMember(owner = "client", name = "eh", descriptor = "I")
    private int field442;

    @OriginalMember(owner = "client", name = "fh", descriptor = "I")
    private int field443;

    @OriginalMember(owner = "client", name = "ih", descriptor = "I")
    private int field446;

    @OriginalMember(owner = "client", name = "jh", descriptor = "I")
    private int field447;

    @OriginalMember(owner = "client", name = "kh", descriptor = "I")
    private int field448;

    @OriginalMember(owner = "client", name = "xh", descriptor = "I")
    private int field461;

    @OriginalMember(owner = "client", name = "Hh", descriptor = "I")
    private int field471;

    @OriginalMember(owner = "client", name = "Jh", descriptor = "I")
    private int field473;

    @OriginalMember(owner = "client", name = "Oh", descriptor = "I")
    private int field478;

    @OriginalMember(owner = "client", name = "Uh", descriptor = "I")
    private int field484;

    @OriginalMember(owner = "client", name = "Vh", descriptor = "I")
    private int field485;

    @OriginalMember(owner = "client", name = "Xh", descriptor = "I")
    private int field487;

    @OriginalMember(owner = "client", name = "Yh", descriptor = "I")
    private int field488;

    @OriginalMember(owner = "client", name = "Zh", descriptor = "I")
    private int field489;

    @OriginalMember(owner = "client", name = "ei", descriptor = "I")
    private int field494;

    @OriginalMember(owner = "client", name = "fi", descriptor = "I")
    private int field495;

    @OriginalMember(owner = "client", name = "gi", descriptor = "I")
    private int field496;

    @OriginalMember(owner = "client", name = "hi", descriptor = "I")
    private int field497;

    @OriginalMember(owner = "client", name = "li", descriptor = "I")
    private static int field501;

    @OriginalMember(owner = "client", name = "qi", descriptor = "I")
    private static int field506;

    @OriginalMember(owner = "client", name = "yi", descriptor = "I")
    private int field514;

    @OriginalMember(owner = "client", name = "Ai", descriptor = "I")
    private int field516;

    @OriginalMember(owner = "client", name = "Bi", descriptor = "I")
    private int field517;

    @OriginalMember(owner = "client", name = "Ci", descriptor = "I")
    private int field518;

    @OriginalMember(owner = "client", name = "Di", descriptor = "I")
    private int field519;

    @OriginalMember(owner = "client", name = "Ei", descriptor = "I")
    private int field520;

    @OriginalMember(owner = "client", name = "Fi", descriptor = "I")
    private int field521;

    @OriginalMember(owner = "client", name = "Gi", descriptor = "I")
    private int field522;

    @OriginalMember(owner = "client", name = "Hi", descriptor = "I")
    private static int field523;

    @OriginalMember(owner = "client", name = "Ki", descriptor = "I")
    private int field526;

    @OriginalMember(owner = "client", name = "Li", descriptor = "I")
    private int field527;

    @OriginalMember(owner = "client", name = "Mi", descriptor = "I")
    private int field528;

    @OriginalMember(owner = "client", name = "Ni", descriptor = "I")
    private static int field529;

    @OriginalMember(owner = "client", name = "Oi", descriptor = "I")
    private int field530;

    @OriginalMember(owner = "client", name = "Ui", descriptor = "I")
    private static int field536;

    @OriginalMember(owner = "client", name = "Zi", descriptor = "I")
    private static int field541;

    @OriginalMember(owner = "client", name = "gj", descriptor = "I")
    private int field548;

    @OriginalMember(owner = "client", name = "hj", descriptor = "I")
    private int field549;

    @OriginalMember(owner = "client", name = "ij", descriptor = "I")
    private static int field550;

    @OriginalMember(owner = "client", name = "jj", descriptor = "I")
    private int field551;

    @OriginalMember(owner = "client", name = "kj", descriptor = "I")
    private int field552;

    @OriginalMember(owner = "client", name = "lj", descriptor = "I")
    private int field553;

    @OriginalMember(owner = "client", name = "nj", descriptor = "I")
    private int field555;

    @OriginalMember(owner = "client", name = "oj", descriptor = "I")
    private int field556;

    @OriginalMember(owner = "client", name = "tj", descriptor = "I")
    private int field561;

    @OriginalMember(owner = "client", name = "Dj", descriptor = "I")
    private int field571;

    @OriginalMember(owner = "client", name = "Jj", descriptor = "I")
    public int field577;

    @OriginalMember(owner = "client", name = "Kj", descriptor = "I")
    public int field578;

    @OriginalMember(owner = "client", name = "Lj", descriptor = "I")
    private int field579;

    @OriginalMember(owner = "client", name = "Oj", descriptor = "I")
    private int field582;

    @OriginalMember(owner = "client", name = "Pj", descriptor = "I")
    private int field583;

    @OriginalMember(owner = "client", name = "Qj", descriptor = "I")
    private int field584;

    @OriginalMember(owner = "client", name = "Rj", descriptor = "I")
    private int field585;

    @OriginalMember(owner = "client", name = "Sj", descriptor = "I")
    private int field586;

    @OriginalMember(owner = "client", name = "Tj", descriptor = "I")
    public static int field587;

    @OriginalMember(owner = "client", name = "Od", descriptor = "J")
    private long field271;

    @OriginalMember(owner = "client", name = "Lf", descriptor = "J")
    private long field371;

    @OriginalMember(owner = "client", name = "Sh", descriptor = "J")
    private long field482;

    @OriginalMember(owner = "client", name = "ci", descriptor = "J")
    private long field492;

    @OriginalMember(owner = "client", name = "Xi", descriptor = "J")
    public long field539;

    @OriginalMember(owner = "client", name = "bi", descriptor = "LELICEBAH;")
    private class11 field491;

    @OriginalMember(owner = "client", name = "pd", descriptor = "LIBHVCUAH;")
    private class19 field246;

    @OriginalMember(owner = "client", name = "Sd", descriptor = "LIBHVCUAH;")
    private class19 field275;

    @OriginalMember(owner = "client", name = "ye", descriptor = "LIBHVCUAH;")
    private class19 field307;

    @OriginalMember(owner = "client", name = "ze", descriptor = "LIBHVCUAH;")
    private class19 field308;

    @OriginalMember(owner = "client", name = "Ae", descriptor = "LIBHVCUAH;")
    private class19 field309;

    @OriginalMember(owner = "client", name = "Be", descriptor = "LIBHVCUAH;")
    private class19 field310;

    @OriginalMember(owner = "client", name = "qg", descriptor = "LIBHVCUAH;")
    private class19 field402;

    @OriginalMember(owner = "client", name = "Mg", descriptor = "LIBHVCUAH;")
    private class19 field424;

    @OriginalMember(owner = "client", name = "wi", descriptor = "LIBHVCUAH;")
    private class19 field512;

    @OriginalMember(owner = "client", name = "xi", descriptor = "LIBHVCUAH;")
    private class19 field513;

    @OriginalMember(owner = "client", name = "wj", descriptor = "LIBHVCUAH;")
    private class19 field564;

    @OriginalMember(owner = "client", name = "xj", descriptor = "LIBHVCUAH;")
    private class19 field565;

    @OriginalMember(owner = "client", name = "yj", descriptor = "LIBHVCUAH;")
    private class19 field566;

    @OriginalMember(owner = "client", name = "zj", descriptor = "LIBHVCUAH;")
    private class19 field567;

    @OriginalMember(owner = "client", name = "Aj", descriptor = "LIBHVCUAH;")
    private class19 field568;

    @OriginalMember(owner = "client", name = "Ve", descriptor = "LIDBGYHWK;")
    private class20 field330;

    @OriginalMember(owner = "client", name = "We", descriptor = "LIDBGYHWK;")
    private class20 field331;

    @OriginalMember(owner = "client", name = "Xe", descriptor = "LIDBGYHWK;")
    private class20 field332;

    @OriginalMember(owner = "client", name = "Ye", descriptor = "LIDBGYHWK;")
    private class20 field333;

    @OriginalMember(owner = "client", name = "Xf", descriptor = "LOBOSMEDX;")
    private class38 field383;

    @OriginalMember(owner = "client", name = "Mb", descriptor = "LPKTDMNAV;")
    private class42 field165;

    @OriginalMember(owner = "client", name = "Nb", descriptor = "LPKTDMNAV;")
    private class42 field166;

    @OriginalMember(owner = "client", name = "Ob", descriptor = "LPKTDMNAV;")
    private class42 field167;

    @OriginalMember(owner = "client", name = "Pb", descriptor = "LPKTDMNAV;")
    private class42 field168;

    @OriginalMember(owner = "client", name = "Qb", descriptor = "LPKTDMNAV;")
    private class42 field169;

    @OriginalMember(owner = "client", name = "Rb", descriptor = "LPKTDMNAV;")
    private class42 field170;

    @OriginalMember(owner = "client", name = "Sb", descriptor = "LPKTDMNAV;")
    private class42 field171;

    @OriginalMember(owner = "client", name = "Tb", descriptor = "LPKTDMNAV;")
    private class42 field172;

    @OriginalMember(owner = "client", name = "Ub", descriptor = "LPKTDMNAV;")
    private class42 field173;

    @OriginalMember(owner = "client", name = "uc", descriptor = "LPKTDMNAV;")
    private class42 field199;

    @OriginalMember(owner = "client", name = "vc", descriptor = "LPKTDMNAV;")
    private class42 field200;

    @OriginalMember(owner = "client", name = "wc", descriptor = "LPKTDMNAV;")
    private class42 field201;

    @OriginalMember(owner = "client", name = "xc", descriptor = "LPKTDMNAV;")
    private class42 field202;

    @OriginalMember(owner = "client", name = "yc", descriptor = "LPKTDMNAV;")
    private class42 field203;

    @OriginalMember(owner = "client", name = "zc", descriptor = "LPKTDMNAV;")
    private class42 field204;

    @OriginalMember(owner = "client", name = "Ac", descriptor = "LPKTDMNAV;")
    private class42 field205;

    @OriginalMember(owner = "client", name = "Bc", descriptor = "LPKTDMNAV;")
    private class42 field206;

    @OriginalMember(owner = "client", name = "Cc", descriptor = "LPKTDMNAV;")
    private class42 field207;

    @OriginalMember(owner = "client", name = "si", descriptor = "LPKTDMNAV;")
    private class42 field508;

    @OriginalMember(owner = "client", name = "ti", descriptor = "LPKTDMNAV;")
    private class42 field509;

    @OriginalMember(owner = "client", name = "ui", descriptor = "LPKTDMNAV;")
    private class42 field510;

    @OriginalMember(owner = "client", name = "vi", descriptor = "LPKTDMNAV;")
    private class42 field511;

    @OriginalMember(owner = "client", name = "Fj", descriptor = "LPKTDMNAV;")
    private class42 field573;

    @OriginalMember(owner = "client", name = "Gj", descriptor = "LPKTDMNAV;")
    private class42 field574;

    @OriginalMember(owner = "client", name = "Hj", descriptor = "LPKTDMNAV;")
    private class42 field575;

    @OriginalMember(owner = "client", name = "Ij", descriptor = "LRVLWVPJQ;")
    private class50 field576;

    @OriginalMember(owner = "client", name = "Ng", descriptor = "LUFGXOLGK;")
    public static class56 field425;

    @OriginalMember(owner = "client", name = "nc", descriptor = "LVXFBFZWJ;")
    public class64 field192;

    @OriginalMember(owner = "client", name = "ld", descriptor = "LVZIKSEDY;")
    private class65 field242;

    @OriginalMember(owner = "client", name = "Fb", descriptor = "LXHDQQNIR;")
    private class68 field158;

    @OriginalMember(owner = "client", name = "Gb", descriptor = "LXHDQQNIR;")
    private class68 field159;

    @OriginalMember(owner = "client", name = "Yc", descriptor = "LXHDQQNIR;")
    private class68 field229;

    @OriginalMember(owner = "client", name = "Zc", descriptor = "LXHDQQNIR;")
    private class68 field230;

    @OriginalMember(owner = "client", name = "ad", descriptor = "LXHDQQNIR;")
    private class68 field231;

    @OriginalMember(owner = "client", name = "ed", descriptor = "LXHDQQNIR;")
    private class68 field235;

    @OriginalMember(owner = "client", name = "fd", descriptor = "LXHDQQNIR;")
    private class68 field236;

    @OriginalMember(owner = "client", name = "Fe", descriptor = "LXHDQQNIR;")
    private class68 field314;

    @OriginalMember(owner = "client", name = "Ge", descriptor = "LXHDQQNIR;")
    private class68 field315;

    @OriginalMember(owner = "client", name = "He", descriptor = "LXHDQQNIR;")
    private class68 field316;

    @OriginalMember(owner = "client", name = "gg", descriptor = "LXHDQQNIR;")
    private class68 field392;

    @OriginalMember(owner = "client", name = "hg", descriptor = "LXHDQQNIR;")
    private class68 field393;

    @OriginalMember(owner = "client", name = "ig", descriptor = "LXHDQQNIR;")
    private class68 field394;

    @OriginalMember(owner = "client", name = "jg", descriptor = "LXHDQQNIR;")
    private class68 field395;

    @OriginalMember(owner = "client", name = "kg", descriptor = "LXHDQQNIR;")
    private class68 field396;

    @OriginalMember(owner = "client", name = "Hg", descriptor = "LXHDQQNIR;")
    private class68 field419;

    @OriginalMember(owner = "client", name = "Ig", descriptor = "LXHDQQNIR;")
    private class68 field420;

    @OriginalMember(owner = "client", name = "Jg", descriptor = "LXHDQQNIR;")
    private class68 field421;

    @OriginalMember(owner = "client", name = "Kg", descriptor = "LXHDQQNIR;")
    private class68 field422;

    @OriginalMember(owner = "client", name = "Lg", descriptor = "LXHDQQNIR;")
    private class68 field423;

    @OriginalMember(owner = "client", name = "Je", descriptor = "LDUZSRFJE;")
    private class9 field318;

    @OriginalMember(owner = "client", name = "fb", descriptor = "Ljava/lang/String;")
    private String field132;

    @OriginalMember(owner = "client", name = "wb", descriptor = "Ljava/lang/String;")
    public String field149;

    @OriginalMember(owner = "client", name = "Wf", descriptor = "Ljava/lang/String;")
    private String field382;

    @OriginalMember(owner = "client", name = "ii", descriptor = "Ljava/lang/String;")
    public String field498;

    @OriginalMember(owner = "client", name = "gd", descriptor = "Ljava/net/Socket;")
    private Socket field237;

    @OriginalMember(owner = "client", name = "X", descriptor = "Z")
    public static boolean field124;

    @OriginalMember(owner = "client", name = "rc", descriptor = "Z")
    private static boolean field196;

    @OriginalMember(owner = "client", name = "Ne", descriptor = "Z")
    private static boolean field322;

    @OriginalMember(owner = "client", name = "Eg", descriptor = "Z")
    public static boolean field416;

    @OriginalMember(owner = "client", name = "qh", descriptor = "Z")
    private static boolean field454;

    @OriginalMember(owner = "client", name = "qb", descriptor = "[I")
    private int[] field143;

    @OriginalMember(owner = "client", name = "rb", descriptor = "[I")
    private int[] field144;

    @OriginalMember(owner = "client", name = "Pd", descriptor = "[I")
    private int[] field272;

    @OriginalMember(owner = "client", name = "Qd", descriptor = "[I")
    private int[] field273;

    @OriginalMember(owner = "client", name = "Rd", descriptor = "[I")
    private int[] field274;

    @OriginalMember(owner = "client", name = "Pe", descriptor = "[I")
    private int[] field324;

    @OriginalMember(owner = "client", name = "Qe", descriptor = "[I")
    private int[] field325;

    @OriginalMember(owner = "client", name = "Re", descriptor = "[I")
    private int[] field326;

    @OriginalMember(owner = "client", name = "Se", descriptor = "[I")
    private int[] field327;

    @OriginalMember(owner = "client", name = "Mf", descriptor = "[I")
    private int[] field372;

    @OriginalMember(owner = "client", name = "Nf", descriptor = "[I")
    private int[] field373;

    @OriginalMember(owner = "client", name = "sh", descriptor = "[I")
    private int[] field456;

    @OriginalMember(owner = "client", name = "th", descriptor = "[I")
    private int[] field457;

    @OriginalMember(owner = "client", name = "uh", descriptor = "[I")
    private int[] field458;

    @OriginalMember(owner = "client", name = "Xd", descriptor = "[LXHDQQNIR;")
    private class68[] field280;

    @OriginalMember(owner = "client", name = "Kb", descriptor = "[[B")
    private byte[][] field163;

    @OriginalMember(owner = "client", name = "oi", descriptor = "[[B")
    private byte[][] field504;

    @OriginalMember(owner = "client", name = "Pi", descriptor = "[[[B")
    private byte[][][] field531;

    @OriginalMember(owner = "client", name = "Af", descriptor = "[[[I")
    private int[][][] field360;

    @OriginalMember(owner = "client", name = "a", descriptor = "(B)V")
    public final void method40(byte arg0) {
        for (int var2 = 0; var2 < this.field366; ++var2) {
            int var3 = this.field367[var2];
            class25 var4 = this.field365[var3];
            if (var4 != null) {
                this.method41(594, var4.field871.field854, var4);
            }
        }
        if (arg0 != -28) {
            field381 = true;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IILTTYUWHXI;)V")
    public final void method41(int arg0, int arg1, class54 arg2) {
        int var4 = 88 / arg0;
        if (arg2.field1422 < 128 || arg2.field1423 < 128 || arg2.field1422 >= 13184 || arg2.field1423 >= 13184) {
            arg2.field1382 = -1;
            arg2.field1396 = -1;
            arg2.field1392 = 0;
            arg2.field1393 = 0;
            arg2.field1422 = arg2.field1415[0] * 128 + arg2.field1417 * 64;
            arg2.field1423 = arg2.field1416[0] * 128 + arg2.field1417 * 64;
            arg2.method440((byte) 126);
        }
        if (field425 == arg2 && (arg2.field1422 < 1536 || arg2.field1423 < 1536 || arg2.field1422 >= 11776 || arg2.field1423 >= 11776)) {
            arg2.field1382 = -1;
            arg2.field1396 = -1;
            arg2.field1392 = 0;
            arg2.field1393 = 0;
            arg2.field1422 = arg2.field1415[0] * 128 + arg2.field1417 * 64;
            arg2.field1423 = arg2.field1416[0] * 128 + arg2.field1417 * 64;
            arg2.method440((byte) 126);
        }
        if (arg2.field1392 > field347) {
            this.method42(arg2, true);
        } else if (arg2.field1393 >= field347) {
            this.method43(arg2, false);
        } else {
            this.method44(arg2, (byte) 5);
        }
        this.method45(arg2, 6);
        this.method46(8, arg2);
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LTTYUWHXI;Z)V")
    public final void method42(class54 arg0, boolean arg1) {
        int var3 = arg0.field1392 - field347;
        if (!arg1) {
            this.field320.method445(148);
        }
        int var4 = arg0.field1417 * 64 + arg0.field1388 * 128;
        int var5 = arg0.field1417 * 64 + arg0.field1390 * 128;
        arg0.field1422 += (var4 - arg0.field1422) / var3;
        arg0.field1423 += (var5 - arg0.field1423) / var3;
        arg0.field1395 = 0;
        if (arg0.field1394 == 0) {
            arg0.field1434 = 1024;
        }
        if (arg0.field1394 == 1) {
            arg0.field1434 = 1536;
        }
        if (arg0.field1394 == 2) {
            arg0.field1434 = 0;
        }
        if (arg0.field1394 == 3) {
            arg0.field1434 = 512;
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(LTTYUWHXI;Z)V")
    public final void method43(class54 arg0, boolean arg1) {
        if (field347 == arg0.field1393 || arg0.field1382 == -1 || arg0.field1385 != 0 || arg0.field1384 + 1 > class47.field1280[arg0.field1382].method414(arg0.field1383, this.field145)) {
            int var3 = arg0.field1393 - arg0.field1392;
            int var4 = field347 - arg0.field1392;
            int var5 = arg0.field1417 * 64 + arg0.field1388 * 128;
            int var6 = arg0.field1417 * 64 + arg0.field1390 * 128;
            int var7 = arg0.field1417 * 64 + arg0.field1389 * 128;
            int var8 = arg0.field1417 * 64 + arg0.field1391 * 128;
            arg0.field1422 = ((var3 - var4) * var5 + var4 * var7) / var3;
            arg0.field1423 = ((var3 - var4) * var6 + var4 * var8) / var3;
        }
        arg0.field1395 = 0;
        if (arg0.field1394 == 0) {
            arg0.field1434 = 1024;
        }
        if (arg0.field1394 == 1) {
            arg0.field1434 = 1536;
        }
        if (arg0.field1394 == 2) {
            arg0.field1434 = 0;
        }
        if (arg0.field1394 == 3) {
            arg0.field1434 = 512;
        }
        arg0.field1424 = arg0.field1434;
        if (arg1) {
            this.field432 = -423;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LTTYUWHXI;B)V")
    public final void method44(class54 arg0, byte arg1) {
        if (arg1 != 5) {
            this.field320.method445(46);
        }
        arg0.field1425 = arg0.field1407;
        if (arg0.field1387 == 0) {
            arg0.field1395 = 0;
        } else {
            if (arg0.field1382 != -1 && arg0.field1385 == 0) {
                class47 var3 = class47.field1280[arg0.field1382];
                if (arg0.field1420 > 0 && var3.field1292 == 0) {
                    ++arg0.field1395;
                    return;
                }
                if (arg0.field1420 <= 0 && var3.field1293 == 0) {
                    ++arg0.field1395;
                    return;
                }
            }
            int var4 = arg0.field1422;
            int var5 = arg0.field1423;
            int var6 = arg0.field1415[arg0.field1387 - 1] * 128 + arg0.field1417 * 64;
            int var7 = arg0.field1416[arg0.field1387 - 1] * 128 + arg0.field1417 * 64;
            if (var6 - var4 <= 256 && var6 - var4 >= -256 && var7 - var5 <= 256 && var7 - var5 >= -256) {
                if (var4 < var6) {
                    if (var5 < var7) {
                        arg0.field1434 = 1280;
                    } else if (var5 > var7) {
                        arg0.field1434 = 1792;
                    } else {
                        arg0.field1434 = 1536;
                    }
                } else if (var4 > var6) {
                    if (var5 < var7) {
                        arg0.field1434 = 768;
                    } else if (var5 > var7) {
                        arg0.field1434 = 256;
                    } else {
                        arg0.field1434 = 512;
                    }
                } else if (var5 < var7) {
                    arg0.field1434 = 1024;
                } else {
                    arg0.field1434 = 0;
                }
                int var8 = arg0.field1434 - arg0.field1424 & 2047;
                if (var8 > 1024) {
                    var8 -= 2048;
                }
                int var9 = arg0.field1411;
                if (var8 >= -256 && var8 <= 256) {
                    var9 = arg0.field1410;
                } else if (var8 >= 256 && var8 < 768) {
                    var9 = arg0.field1413;
                } else if (var8 >= -768 && var8 <= -256) {
                    var9 = arg0.field1412;
                }
                if (var9 == -1) {
                    var9 = arg0.field1410;
                }
                arg0.field1425 = var9;
                int var10 = 4;
                if (arg0.field1434 != arg0.field1424 && arg0.field1429 == -1 && arg0.field1418 != 0) {
                    var10 = 2;
                }
                if (arg0.field1387 > 2) {
                    var10 = 6;
                }
                if (arg0.field1387 > 3) {
                    var10 = 8;
                }
                if (arg0.field1395 > 0 && arg0.field1387 > 1) {
                    var10 = 8;
                    --arg0.field1395;
                }
                if (arg0.field1428[arg0.field1387 - 1]) {
                    var10 <<= 1;
                }
                if (var10 >= 8 && arg0.field1425 == arg0.field1410 && arg0.field1414 != -1) {
                    arg0.field1425 = arg0.field1414;
                }
                if (var4 < var6) {
                    arg0.field1422 += var10;
                    if (arg0.field1422 > var6) {
                        arg0.field1422 = var6;
                    }
                } else if (var4 > var6) {
                    arg0.field1422 -= var10;
                    if (arg0.field1422 < var6) {
                        arg0.field1422 = var6;
                    }
                }
                if (var5 < var7) {
                    arg0.field1423 += var10;
                    if (arg0.field1423 > var7) {
                        arg0.field1423 = var7;
                    }
                } else if (var5 > var7) {
                    arg0.field1423 -= var10;
                    if (arg0.field1423 < var7) {
                        arg0.field1423 = var7;
                    }
                }
                if (arg0.field1422 == var6 && arg0.field1423 == var7) {
                    --arg0.field1387;
                    if (arg0.field1420 > 0) {
                        --arg0.field1420;
                        return;
                    }
                }
            } else {
                arg0.field1422 = var6;
                arg0.field1423 = var7;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LTTYUWHXI;I)V")
    public final void method45(class54 arg0, int arg1) {
        if (field259 != arg1) {
            this.method6();
        }
        if (arg0.field1418 != 0) {
            if (arg0.field1429 != -1 && arg0.field1429 < 32768) {
                class25 var3 = this.field365[arg0.field1429];
                if (var3 != null) {
                    int var4 = arg0.field1422 - var3.field1422;
                    int var5 = arg0.field1423 - var3.field1423;
                    if (var4 != 0 || var5 != 0) {
                        arg0.field1434 = (int) (Math.atan2((double) var4, (double) var5) * 325.949D) & 2047;
                    }
                }
            }
            if (arg0.field1429 >= 32768) {
                int var6 = arg0.field1429 - 32768;
                if (this.field375 == var6) {
                    var6 = this.field469;
                }
                class56 var7 = this.field470[var6];
                if (var7 != null) {
                    int var8 = arg0.field1422 - var7.field1422;
                    int var9 = arg0.field1423 - var7.field1423;
                    if (var8 != 0 || var9 != 0) {
                        arg0.field1434 = (int) (Math.atan2((double) var8, (double) var9) * 325.949D) & 2047;
                    }
                }
            }
            if ((arg0.field1430 != 0 || arg0.field1431 != 0) && (arg0.field1387 == 0 || arg0.field1395 > 0)) {
                int var10 = arg0.field1422 - (arg0.field1430 - this.field255 - this.field255) * 64;
                int var11 = arg0.field1423 - (arg0.field1431 - this.field256 - this.field256) * 64;
                if (var10 != 0 || var11 != 0) {
                    arg0.field1434 = (int) (Math.atan2((double) var10, (double) var11) * 325.949D) & 2047;
                }
                arg0.field1430 = 0;
                arg0.field1431 = 0;
            }
            int var12 = arg0.field1434 - arg0.field1424 & 2047;
            if (var12 != 0) {
                if (var12 >= arg0.field1418 && var12 <= 2048 - arg0.field1418) {
                    if (var12 > 1024) {
                        arg0.field1424 -= arg0.field1418;
                    } else {
                        arg0.field1424 += arg0.field1418;
                    }
                } else {
                    arg0.field1424 = arg0.field1434;
                }
                arg0.field1424 &= 2047;
                if (arg0.field1425 == arg0.field1407 && arg0.field1434 != arg0.field1424) {
                    if (arg0.field1408 != -1) {
                        arg0.field1425 = arg0.field1408;
                        return;
                    }
                    arg0.field1425 = arg0.field1410;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILTTYUWHXI;)V")
    public final void method46(int arg0, class54 arg1) {
        if (arg0 < 8 || arg0 > 8) {
            this.field580 = null;
        }
        arg1.field1421 = false;
        if (arg1.field1425 != -1) {
            class47 var3 = class47.field1280[arg1.field1425];
            ++arg1.field1427;
            if (arg1.field1426 < var3.field1281 && arg1.field1427 > var3.method414(arg1.field1426, this.field145)) {
                arg1.field1427 = 0;
                ++arg1.field1426;
            }
            if (arg1.field1426 >= var3.field1281) {
                arg1.field1427 = 0;
                arg1.field1426 = 0;
            }
        }
        if (arg1.field1396 != -1 && field347 >= arg1.field1399) {
            if (arg1.field1397 < 0) {
                arg1.field1397 = 0;
            }
            class47 var4 = class43.field1253[arg1.field1396].field1257;
            ++arg1.field1398;
            while (arg1.field1397 < var4.field1281 && arg1.field1398 > var4.method414(arg1.field1397, this.field145)) {
                arg1.field1398 -= var4.method414(arg1.field1397, this.field145);
                ++arg1.field1397;
            }
            if (arg1.field1397 >= var4.field1281 && (arg1.field1397 < 0 || arg1.field1397 >= var4.field1281)) {
                arg1.field1396 = -1;
            }
        }
        if (arg1.field1382 != -1 && arg1.field1385 <= 1) {
            class47 var5 = class47.field1280[arg1.field1382];
            if (var5.field1292 == 1 && arg1.field1420 > 0 && arg1.field1392 <= field347 && arg1.field1393 < field347) {
                arg1.field1385 = 1;
                return;
            }
        }
        if (arg1.field1382 != -1 && arg1.field1385 == 0) {
            class47 var6 = class47.field1280[arg1.field1382];
            ++arg1.field1384;
            while (arg1.field1383 < var6.field1281 && arg1.field1384 > var6.method414(arg1.field1383, this.field145)) {
                arg1.field1384 -= var6.method414(arg1.field1383, this.field145);
                ++arg1.field1383;
            }
            if (arg1.field1383 >= var6.field1281) {
                arg1.field1383 -= var6.field1285;
                ++arg1.field1386;
                if (arg1.field1386 >= var6.field1291) {
                    arg1.field1382 = -1;
                }
                if (arg1.field1383 < 0 || arg1.field1383 >= var6.field1281) {
                    arg1.field1382 = -1;
                }
            }
            arg1.field1421 = var6.field1287;
        }
        if (arg1.field1385 > 0) {
            --arg1.field1385;
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(B)V")
    public final void method47(byte arg0) {
        if (this.field412) {
            this.field412 = false;
            this.field165.method400((byte) -122, 4, 0, super.field11);
            this.field166.method400((byte) -122, 357, 0, super.field11);
            this.field167.method400((byte) -122, 4, 722, super.field11);
            this.field168.method400((byte) -122, 205, 743, super.field11);
            this.field169.method400((byte) -122, 0, 0, super.field11);
            this.field170.method400((byte) -122, 4, 516, super.field11);
            this.field171.method400((byte) -122, 205, 516, super.field11);
            this.field172.method400((byte) -122, 357, 496, super.field11);
            this.field173.method400((byte) -122, 338, 0, super.field11);
            this.field490 = true;
            this.field409 = true;
            this.field455 = true;
            this.field459 = true;
            if (this.field443 != 2) {
                this.field510.method400((byte) -122, 4, 4, super.field11);
                this.field509.method400((byte) -122, 4, 550, super.field11);
            }
            ++field550;
            if (field550 > 92) {
                field550 = 0;
                this.field320.method444(false, 248);
            }
        }
        if (this.field443 == 2) {
            this.method101(-97);
        }
        if (this.field572 && this.field438 == 1) {
            this.field490 = true;
        }
        if (this.field560 != -1) {
            boolean var2 = this.method154(this.field560, this.field579, 0);
            if (var2) {
                this.field490 = true;
            }
        }
        if (this.field220 == 2) {
            this.field490 = true;
        }
        if (this.field584 == 2) {
            this.field490 = true;
        }
        if (this.field490) {
            this.method112(this.field317);
            this.field490 = false;
        }
        if (this.field338 == -1) {
            this.field306.field920 = this.field181 - this.field397 - 77;
            if (super.field19 > 448 && super.field19 < 560 && super.field20 > 332) {
                this.method120(77, this.field181, super.field19 - 17, 0, 463, -1, 44345, this.field306, super.field20 - 357);
            }
            int var3 = this.field181 - 77 - this.field306.field920;
            if (var3 < 0) {
                var3 = 0;
            }
            if (var3 > this.field181 - 77) {
                var3 = this.field181 - 77;
            }
            if (this.field397 != var3) {
                this.field397 = var3;
                this.field409 = true;
            }
        }
        if (this.field338 != -1) {
            boolean var4 = this.method154(this.field338, this.field579, 0);
            if (var4) {
                this.field409 = true;
            }
        }
        if (this.field220 == 3) {
            this.field409 = true;
        }
        if (this.field584 == 3) {
            this.field409 = true;
        }
        if (this.field382 != null) {
            this.field409 = true;
        }
        if (this.field572 && this.field438 == 2) {
            this.field409 = true;
        }
        if (this.field409) {
            this.method86(false);
            this.field409 = false;
        }
        if (this.field443 == 2) {
            this.method49(0);
            this.field509.method400((byte) -122, 4, 550, super.field11);
        }
        if (this.field269 != -1) {
            this.field455 = true;
        }
        if (this.field455) {
            if (this.field269 != -1 && this.field269 == this.field125) {
                this.field269 = -1;
                this.field320.method444(false, 132);
                this.field320.method445(this.field125);
            }
            this.field455 = false;
            this.field575.method399(true);
            this.field231.method555(0, 0, this.field481);
            if (this.field560 == -1) {
                if (this.field418[this.field125] != -1) {
                    if (this.field125 == 0) {
                        this.field419.method555(22, 10, this.field481);
                    }
                    if (this.field125 == 1) {
                        this.field420.method555(54, 8, this.field481);
                    }
                    if (this.field125 == 2) {
                        this.field420.method555(82, 8, this.field481);
                    }
                    if (this.field125 == 3) {
                        this.field421.method555(110, 8, this.field481);
                    }
                    if (this.field125 == 4) {
                        this.field423.method555(153, 8, this.field481);
                    }
                    if (this.field125 == 5) {
                        this.field423.method555(181, 8, this.field481);
                    }
                    if (this.field125 == 6) {
                        this.field422.method555(209, 9, this.field481);
                    }
                }
                if (this.field418[0] != -1 && (this.field269 != 0 || field347 % 20 < 10)) {
                    this.field563[0].method555(29, 13, this.field481);
                }
                if (this.field418[1] != -1 && (this.field269 != 1 || field347 % 20 < 10)) {
                    this.field563[1].method555(53, 11, this.field481);
                }
                if (this.field418[2] != -1 && (this.field269 != 2 || field347 % 20 < 10)) {
                    this.field563[2].method555(82, 11, this.field481);
                }
                if (this.field418[3] != -1 && (this.field269 != 3 || field347 % 20 < 10)) {
                    this.field563[3].method555(115, 12, this.field481);
                }
                if (this.field418[4] != -1 && (this.field269 != 4 || field347 % 20 < 10)) {
                    this.field563[4].method555(153, 13, this.field481);
                }
                if (this.field418[5] != -1 && (this.field269 != 5 || field347 % 20 < 10)) {
                    this.field563[5].method555(180, 11, this.field481);
                }
                if (this.field418[6] != -1 && (this.field269 != 6 || field347 % 20 < 10)) {
                    this.field563[6].method555(208, 13, this.field481);
                }
            }
            this.field575.method400((byte) -122, 160, 516, super.field11);
            this.field574.method399(true);
            this.field230.method555(0, 0, this.field481);
            if (this.field560 == -1) {
                if (this.field418[this.field125] != -1) {
                    if (this.field125 == 7) {
                        this.field392.method555(42, 0, this.field481);
                    }
                    if (this.field125 == 8) {
                        this.field393.method555(74, 0, this.field481);
                    }
                    if (this.field125 == 9) {
                        this.field393.method555(102, 0, this.field481);
                    }
                    if (this.field125 == 10) {
                        this.field394.method555(130, 1, this.field481);
                    }
                    if (this.field125 == 11) {
                        this.field396.method555(173, 0, this.field481);
                    }
                    if (this.field125 == 12) {
                        this.field396.method555(201, 0, this.field481);
                    }
                    if (this.field125 == 13) {
                        this.field395.method555(229, 0, this.field481);
                    }
                }
                if (this.field418[8] != -1 && (this.field269 != 8 || field347 % 20 < 10)) {
                    this.field563[7].method555(74, 2, this.field481);
                }
                if (this.field418[9] != -1 && (this.field269 != 9 || field347 % 20 < 10)) {
                    this.field563[8].method555(102, 3, this.field481);
                }
                if (this.field418[10] != -1 && (this.field269 != 10 || field347 % 20 < 10)) {
                    this.field563[9].method555(137, 4, this.field481);
                }
                if (this.field418[11] != -1 && (this.field269 != 11 || field347 % 20 < 10)) {
                    this.field563[10].method555(174, 2, this.field481);
                }
                if (this.field418[12] != -1 && (this.field269 != 12 || field347 % 20 < 10)) {
                    this.field563[11].method555(201, 2, this.field481);
                }
                if (this.field418[13] != -1 && (this.field269 != 13 || field347 % 20 < 10)) {
                    this.field563[12].method555(226, 2, this.field481);
                }
            }
            this.field574.method400((byte) -122, 466, 496, super.field11);
            this.field510.method399(true);
        }
        if (this.field459) {
            this.field459 = false;
            this.field573.method399(true);
            this.field229.method555(0, 0, this.field481);
            this.field331.method242(-546, 16777215, true, "Public chat", 55, 28);
            if (this.field571 == 0) {
                this.field331.method242(-546, 65280, true, "On", 55, 41);
            }
            if (this.field571 == 1) {
                this.field331.method242(-546, 16776960, true, "Friends", 55, 41);
            }
            if (this.field571 == 2) {
                this.field331.method242(-546, 16711680, true, "Off", 55, 41);
            }
            if (this.field571 == 3) {
                this.field331.method242(-546, 65535, true, "Hide", 55, 41);
            }
            this.field331.method242(-546, 16777215, true, "Private chat", 184, 28);
            if (this.field354 == 0) {
                this.field331.method242(-546, 65280, true, "On", 184, 41);
            }
            if (this.field354 == 1) {
                this.field331.method242(-546, 16776960, true, "Friends", 184, 41);
            }
            if (this.field354 == 2) {
                this.field331.method242(-546, 16711680, true, "Off", 184, 41);
            }
            this.field331.method242(-546, 16777215, true, "Trade/compete", 324, 28);
            if (this.field516 == 0) {
                this.field331.method242(-546, 65280, true, "On", 324, 41);
            }
            if (this.field516 == 1) {
                this.field331.method242(-546, 16776960, true, "Friends", 324, 41);
            }
            if (this.field516 == 2) {
                this.field331.method242(-546, 16711680, true, "Off", 324, 41);
            }
            this.field331.method242(-546, 16777215, true, "Report abuse", 458, 33);
            this.field573.method400((byte) -122, 453, 0, super.field11);
            this.field510.method399(true);
        }
        this.field579 = 0;
        if (this.field174 != arg0) {
            this.field580 = null;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(II)V")
    public final void method48(int arg0, int arg1) {
        if (arg1 != -21639) {
            this.method6();
        }
        signlink.wavevol = arg0;
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(I)V")
    public final void method49(int arg0) {
        this.field509.method399(true);
        if (this.field549 == 2) {
            byte[] var2 = this.field315.field1675;
            int[] var3 = class53.field1371;
            int var4 = var2.length;
            for (int var5 = 0; var5 < var4; ++var5) {
                if (var2[var5] == 0) {
                    var3[var5] = 0;
                }
            }
            this.field246.method236(33, 33, 25, this.field128, this.field120, this.field304, this.field391, 25, 0, 256, 0);
            this.field510.method399(true);
        } else {
            int var6 = this.field197 + this.field120 & 2047;
            int var7 = field425.field1422 / 32 + 48;
            int var8 = 464 - field425.field1423 / 32;
            this.field518 += arg0;
            this.field402.method236(146, 151, var7, this.field266, var6, this.field304, this.field321, var8, 5, this.field292 + 256, 25);
            this.field246.method236(33, 33, 25, this.field128, this.field120, this.field304, this.field391, 25, 0, 256, 0);
            for (int var9 = 0; var9 < this.field288; ++var9) {
                int var39 = this.field289[var9] * 4 + 2 - field425.field1422 / 32;
                int var40 = this.field290[var9] * 4 + 2 - field425.field1423 / 32;
                this.method100(var39, var40, this.field108[var9], 2934);
            }
            for (int var10 = 0; var10 < 104; ++var10) {
                for (int var35 = 0; var35 < 104; ++var35) {
                    class58 var36 = this.field580[this.field548][var10][var35];
                    if (var36 != null) {
                        int var37 = var10 * 4 + 2 - field425.field1422 / 32;
                        int var38 = var35 * 4 + 2 - field425.field1423 / 32;
                        this.method100(var37, var38, this.field564, 2934);
                    }
                }
            }
            for (int var11 = 0; var11 < this.field366; ++var11) {
                class25 var31 = this.field365[this.field367[var11]];
                if (var31 != null && var31.method287(false)) {
                    class24 var32 = var31.field871;
                    if (var32.field836 != null) {
                        var32 = var32.method282(0);
                    }
                    if (var32 != null && var32.field843 && var32.field829) {
                        int var33 = var31.field1422 / 32 - field425.field1422 / 32;
                        int var34 = var31.field1423 / 32 - field425.field1423 / 32;
                        this.method100(var33, var34, this.field565, 2934);
                    }
                }
            }
            for (int var12 = 0; var12 < this.field471; ++var12) {
                class56 var23 = this.field470[this.field472[var12]];
                if (var23 != null && var23.method287(false)) {
                    int var24 = var23.field1422 / 32 - field425.field1422 / 32;
                    int var25 = var23.field1423 / 32 - field425.field1423 / 32;
                    boolean var26 = false;
                    long var27 = class61.method508(var23.field1488);
                    for (int var29 = 0; var29 < this.field447; ++var29) {
                        if (this.field313[var29] == var27 && this.field162[var29] != 0) {
                            var26 = true;
                            break;
                        }
                    }
                    boolean var30 = false;
                    if (field425.field1474 != 0 && var23.field1474 != 0 && field425.field1474 == var23.field1474) {
                        var30 = true;
                    }
                    if (var26) {
                        this.method100(var24, var25, this.field567, 2934);
                    } else if (var30) {
                        this.method100(var24, var25, this.field568, 2934);
                    } else {
                        this.method100(var24, var25, this.field566, 2934);
                    }
                }
            }
            if (this.field410 != 0 && field347 % 20 < 10) {
                if (this.field410 == 1 && this.field268 >= 0 && this.field268 < this.field365.length) {
                    class25 var13 = this.field365[this.field268];
                    if (var13 != null) {
                        int var14 = var13.field1422 / 32 - field425.field1422 / 32;
                        int var15 = var13.field1423 / 32 - field425.field1423 / 32;
                        this.method159(var15, -325, this.field310, var14);
                    }
                }
                if (this.field410 == 2) {
                    int var16 = (this.field223 - this.field255) * 4 + 2 - field425.field1422 / 32;
                    int var17 = (this.field224 - this.field256) * 4 + 2 - field425.field1423 / 32;
                    this.method159(var17, -325, this.field310, var16);
                }
                if (this.field410 == 10 && this.field353 >= 0 && this.field353 < this.field470.length) {
                    class56 var18 = this.field470[this.field353];
                    if (var18 != null) {
                        int var19 = var18.field1422 / 32 - field425.field1422 / 32;
                        int var20 = var18.field1423 / 32 - field425.field1423 / 32;
                        this.method159(var20, -325, this.field310, var19);
                    }
                }
            }
            if (this.field400 != 0) {
                int var21 = this.field400 * 4 + 2 - field425.field1422 / 32;
                int var22 = this.field401 * 4 + 2 - field425.field1423 / 32;
                this.method100(var21, var22, this.field309, 2934);
            }
            class53.method432(16777215, 78, 3, false, 97, 3);
            this.field510.method399(true);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIIIIIII)V")
    private final void method50(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        class8 var11 = null;
        for (class8 var12 = (class8) this.field463.method503(); var12 != null; var12 = (class8) this.field463.method505(false)) {
            if (var12.field622 == arg2 && var12.field624 == arg4 && var12.field625 == arg7 && var12.field623 == arg9) {
                var11 = var12;
                break;
            }
        }
        if (var11 == null) {
            var11 = new class8();
            var11.field622 = arg2;
            var11.field623 = arg9;
            var11.field624 = arg4;
            var11.field625 = arg7;
            this.method164(0, var11);
            this.field463.method500(var11);
        }
        var11.field614 = arg6;
        if (arg0 >= 0) {
            this.field341 = !this.field341;
        }
        var11.field616 = arg8;
        var11.field615 = arg1;
        var11.field621 = arg5;
        var11.field620 = arg3;
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(I)V")
    public final void method51(int arg0) {
        if (arg0 >= 0) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        if (this.field214 != 0) {
            class20 var3 = this.field331;
            int var4 = 0;
            if (this.field530 != 0) {
                var4 = 1;
            }
            for (int var5 = 0; var5 < 100; ++var5) {
                if (this.field559[var5] != null) {
                    int var6 = this.field557[var5];
                    String var7 = this.field558[var5];
                    byte var8 = 0;
                    if (var7 != null && var7.startsWith("@cr1@")) {
                        var7 = var7.substring(5);
                        var8 = 1;
                    }
                    if (var7 != null && var7.startsWith("@cr2@")) {
                        var7 = var7.substring(5);
                        var8 = 2;
                    }
                    if ((var6 == 3 || var6 == 7) && (var6 == 7 || this.field354 == 0 || this.field354 == 1 && this.method79(var7, 9))) {
                        int var9 = 329 - var4 * 13;
                        byte var10 = 4;
                        var3.method245(0, var10, var9, "From", (byte) 2);
                        var3.method245(65535, var10, var9 - 1, "From", (byte) 2);
                        int var11 = var10 + var3.method243("From ", true);
                        if (var8 == 1) {
                            this.field500[0].method555(var11, var9 - 12, this.field481);
                            var11 += 14;
                        }
                        if (var8 == 2) {
                            this.field500[1].method555(var11, var9 - 12, this.field481);
                            var11 += 14;
                        }
                        var3.method245(0, var11, var9, var7 + ": " + this.field559[var5], (byte) 2);
                        var3.method245(65535, var11, var9 - 1, var7 + ": " + this.field559[var5], (byte) 2);
                        ++var4;
                        if (var4 >= 5) {
                            return;
                        }
                    }
                    if (var6 == 5 && this.field354 < 2) {
                        int var12 = 329 - var4 * 13;
                        var3.method245(0, 4, var12, this.field559[var5], (byte) 2);
                        var3.method245(65535, 4, var12 - 1, this.field559[var5], (byte) 2);
                        ++var4;
                        if (var4 >= 5) {
                            return;
                        }
                    }
                    if (var6 == 6 && this.field354 < 2) {
                        int var13 = 329 - var4 * 13;
                        var3.method245(0, 4, var13, "To " + var7 + ": " + this.field559[var5], (byte) 2);
                        var3.method245(65535, 4, var13 - 1, "To " + var7 + ": " + this.field559[var5], (byte) 2);
                        ++var4;
                        if (var4 >= 5) {
                            return;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(I)V")
    public final void method52(int arg0) {
        for (int var2 = -1; var2 < this.field471; ++var2) {
            int var6;
            if (var2 == -1) {
                var6 = this.field469;
            } else {
                var6 = this.field472[var2];
            }
            class56 var7 = this.field470[var6];
            if (var7 != null && var7.field1409 > 0) {
                --var7.field1409;
                if (var7.field1409 == 0) {
                    var7.field1419 = null;
                }
            }
        }
        for (int var3 = 0; var3 < this.field366; ++var3) {
            int var4 = this.field367[var3];
            class25 var5 = this.field365[var4];
            if (var5 != null && var5.field1409 > 0) {
                --var5.field1409;
                if (var5.field1409 == 0) {
                    var5.field1419 = null;
                }
            }
        }
        if (arg0 != 0) {
            field535 = this.field242.method518();
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LLYHLTGUG;I)V")
    public final void method53(class29 arg0, int arg1) {
        int var3 = arg0.field952;
        if (arg1 >= 0) {
            this.field320.method445(253);
        }
        if (var3 >= 1 && var3 <= 100 || var3 >= 701 && var3 <= 800) {
            if (var3 == 1 && this.field448 == 0) {
                arg0.field978 = "Loading friend list";
                arg0.field917 = 0;
            } else if (var3 == 1 && this.field448 == 1) {
                arg0.field978 = "Connecting to friendserver";
                arg0.field917 = 0;
            } else if (var3 == 2 && this.field448 != 2) {
                arg0.field978 = "Please wait...";
                arg0.field917 = 0;
            } else {
                int var4 = this.field447;
                if (this.field448 != 2) {
                    var4 = 0;
                }
                if (var3 > 700) {
                    var3 -= 601;
                } else {
                    --var3;
                }
                if (var3 >= var4) {
                    arg0.field978 = "";
                    arg0.field917 = 0;
                } else {
                    arg0.field978 = this.field581[var3];
                    arg0.field917 = 1;
                }
            }
        } else if (var3 >= 101 && var3 <= 200 || var3 >= 801 && var3 <= 900) {
            int var5 = this.field447;
            if (this.field448 != 2) {
                var5 = 0;
            }
            if (var3 > 800) {
                var3 -= 701;
            } else {
                var3 -= 101;
            }
            if (var3 >= var5) {
                arg0.field978 = "";
                arg0.field917 = 0;
            } else {
                if (this.field162[var3] == 0) {
                    arg0.field978 = "@red@Offline";
                } else if (this.field162[var3] < 200) {
                    if (this.field162[var3] == field193) {
                        arg0.field978 = "@gre@World-" + (this.field162[var3] - 9);
                    } else {
                        arg0.field978 = "@yel@World-" + (this.field162[var3] - 9);
                    }
                } else if (this.field162[var3] == field193) {
                    arg0.field978 = "@gre@Classic" + (this.field162[var3] - 219);
                } else {
                    arg0.field978 = "@yel@Classic" + (this.field162[var3] - 219);
                }
                arg0.field917 = 1;
            }
        } else if (var3 == 203) {
            int var6 = this.field447;
            if (this.field448 != 2) {
                var6 = 0;
            }
            arg0.field956 = var6 * 15 + 20;
            if (arg0.field956 <= arg0.field979) {
                arg0.field956 = arg0.field979 + 1;
            }
        } else if (var3 >= 401 && var3 <= 500) {
            var3 -= 401;
            if (var3 == 0 && this.field448 == 0) {
                arg0.field978 = "Loading ignore list";
                arg0.field917 = 0;
            } else if (var3 == 1 && this.field448 == 0) {
                arg0.field978 = "Please wait...";
                arg0.field917 = 0;
            } else {
                int var7 = this.field253;
                if (this.field448 == 0) {
                    var7 = 0;
                }
                if (var3 >= var7) {
                    arg0.field978 = "";
                    arg0.field917 = 0;
                } else {
                    arg0.field978 = class61.method512(false, class61.method509(this.field533, this.field399[var3]));
                    arg0.field917 = 1;
                }
            }
        } else if (var3 == 503) {
            arg0.field956 = this.field253 * 15 + 20;
            if (arg0.field956 <= arg0.field979) {
                arg0.field956 = arg0.field979 + 1;
            }
        } else if (var3 == 327) {
            arg0.field947 = 150;
            arg0.field948 = (int) (Math.sin((double) field347 / 40.0D) * 256.0D) & 2047;
            if (this.field301) {
                for (int var8 = 0; var8 < 7; ++var8) {
                    int var15 = this.field545[var8];
                    if (var15 >= 0 && !class36.field1099[var15].method335(4)) {
                        return;
                    }
                }
                this.field301 = false;
                class66[] var9 = new class66[7];
                int var10 = 0;
                for (int var11 = 0; var11 < 7; ++var11) {
                    int var14 = this.field545[var11];
                    if (var14 >= 0) {
                        var9[var10++] = class36.field1099[var14].method336((byte) 4);
                    }
                }
                class66 var12 = new class66(true, var10, var9);
                for (int var13 = 0; var13 < 5; ++var13) {
                    if (this.field407[var13] != 0) {
                        var12.method539(field303[var13][0], field303[var13][this.field407[var13]]);
                        if (var13 == 1) {
                            var12.method539(field118[0], field118[this.field407[var13]]);
                        }
                    }
                }
                var12.method532((byte) 2);
                var12.method533(class47.field1280[field425.field1407].field1282[0], 803);
                var12.method542(64, 850, -30, -50, -30, true);
                arg0.field913 = 5;
                arg0.field914 = 0;
                class29.method306(0, this.field278, var12, 5);
            }
        } else if (var3 == 324) {
            if (this.field307 == null) {
                this.field307 = arg0.field961;
                this.field308 = arg0.field924;
            }
            if (this.field515) {
                arg0.field961 = this.field308;
            } else {
                arg0.field961 = this.field307;
            }
        } else if (var3 == 325) {
            if (this.field307 == null) {
                this.field307 = arg0.field961;
                this.field308 = arg0.field924;
            }
            if (this.field515) {
                arg0.field961 = this.field307;
            } else {
                arg0.field961 = this.field308;
            }
        } else if (var3 == 600) {
            arg0.field978 = this.field408;
            if (field347 % 20 < 10) {
                arg0.field978 = arg0.field978 + "|";
            } else {
                arg0.field978 = arg0.field978 + " ";
            }
        } else {
            if (var3 == 620) {
                if (this.field123 >= 1) {
                    if (this.field502) {
                        arg0.field975 = 16711680;
                        arg0.field978 = "Moderator option: Mute player for 48 hours: <ON>";
                    } else {
                        arg0.field975 = 16777215;
                        arg0.field978 = "Moderator option: Mute player for 48 hours: <OFF>";
                    }
                } else {
                    arg0.field978 = "";
                }
            }
            if (var3 == 650 || var3 == 655) {
                if (this.field368 != 0) {
                    String var16;
                    if (this.field514 == 0) {
                        var16 = "earlier today";
                    } else if (this.field514 == 1) {
                        var16 = "yesterday";
                    } else {
                        var16 = this.field514 + " days ago";
                    }
                    arg0.field978 = "You last logged in " + var16 + " from: " + signlink.dns;
                } else {
                    arg0.field978 = "";
                }
            }
            if (var3 == 651) {
                if (this.field283 == 0) {
                    arg0.field978 = "0 unread messages";
                    arg0.field975 = 16776960;
                }
                if (this.field283 == 1) {
                    arg0.field978 = "1 unread message";
                    arg0.field975 = 65280;
                }
                if (this.field283 > 1) {
                    arg0.field978 = this.field283 + " unread messages";
                    arg0.field975 = 65280;
                }
            }
            if (var3 == 652) {
                if (this.field461 == 201) {
                    if (this.field336 == 1) {
                        arg0.field978 = "@yel@This is a non-members world: @whi@Since you are a member we";
                    } else {
                        arg0.field978 = "";
                    }
                } else if (this.field461 == 200) {
                    arg0.field978 = "You have not yet set any password recovery questions.";
                } else {
                    String var17;
                    if (this.field461 == 0) {
                        var17 = "Earlier today";
                    } else if (this.field461 == 1) {
                        var17 = "Yesterday";
                    } else {
                        var17 = this.field461 + " days ago";
                    }
                    arg0.field978 = var17 + " you changed your recovery questions";
                }
            }
            if (var3 == 653) {
                if (this.field461 == 201) {
                    if (this.field336 == 1) {
                        arg0.field978 = "@whi@recommend you use a members world instead. You may use";
                    } else {
                        arg0.field978 = "";
                    }
                } else if (this.field461 == 200) {
                    arg0.field978 = "We strongly recommend you do so now to secure your account.";
                } else {
                    arg0.field978 = "If you do not remember making this change then cancel it immediately";
                }
            }
            if (var3 == 654) {
                if (this.field461 == 201) {
                    if (this.field336 == 1) {
                        arg0.field978 = "@whi@this world but member benefits are unavailable whilst here.";
                    } else {
                        arg0.field978 = "";
                    }
                } else if (this.field461 == 200) {
                    arg0.field978 = "Do this from the 'account management' area on our front webpage";
                } else {
                    arg0.field978 = "Do this from the 'account management' area on our front webpage";
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IJ)V")
    public final void method54(int arg0, long arg1) {
        if (arg1 != 0L) {
            for (int var4 = 0; var4 < this.field447; ++var4) {
                if (this.field313[var4] == arg1) {
                    --this.field447;
                    this.field490 = true;
                    for (int var5 = var4; var5 < this.field447; ++var5) {
                        this.field581[var5] = this.field581[var5 + 1];
                        this.field162[var5] = this.field162[var5 + 1];
                        this.field313[var5] = this.field313[var5 + 1];
                    }
                    this.field320.method444(false, 222);
                    this.field320.method451(arg1, true);
                    break;
                }
            }
            int var6 = 99 / arg0;
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(B)V")
    public final void method55(byte arg0) {
        if (arg0 != 2) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        while (true) {
            int var3;
            do {
                while (true) {
                    var3 = this.method5(false);
                    if (var3 == -1) {
                        return;
                    }
                    if (this.field299 != -1 && this.field299 == this.field243) {
                        if (var3 == 8 && this.field408.length() > 0) {
                            this.field408 = this.field408.substring(0, this.field408.length() - 1);
                        }
                        break;
                    }
                    if (this.field334) {
                        if (var3 >= 32 && var3 <= 122 && this.field179.length() < 80) {
                            this.field179 = this.field179 + (char) var3;
                            this.field409 = true;
                        }
                        if (var3 == 8 && this.field179.length() > 0) {
                            this.field179 = this.field179.substring(0, this.field179.length() - 1);
                            this.field409 = true;
                        }
                        if (var3 == 13 || var3 == 10) {
                            this.field334 = false;
                            this.field409 = true;
                            if (this.field319 == 1) {
                                long var4 = class61.method508(this.field179);
                                this.method173(this.field464, var4);
                            }
                            if (this.field319 == 2 && this.field447 > 0) {
                                long var6 = class61.method508(this.field179);
                                this.method54(973, var6);
                            }
                            if (this.field319 == 3 && this.field179.length() > 0) {
                                this.field320.method444(false, 242);
                                this.field320.method445(0);
                                int var8 = this.field320.field1456;
                                this.field320.method451(this.field271, true);
                                class6.method38(this.field179, -16600, this.field320);
                                this.field320.method454(this.field320.field1456 - var8, 36772);
                                this.field179 = class6.method39(76, this.field179);
                                this.field179 = class72.method567(76, this.field179);
                                this.method104(class61.method512(false, class61.method509(this.field533, this.field271)), this.field179, 6, this.field341);
                                if (this.field354 == 2) {
                                    this.field354 = 1;
                                    this.field459 = true;
                                    this.field320.method444(false, 4);
                                    this.field320.method445(this.field571);
                                    this.field320.method445(this.field354);
                                    this.field320.method445(this.field516);
                                }
                            }
                            if (this.field319 == 4 && this.field253 < 100) {
                                long var9 = class61.method508(this.field179);
                                this.method106(var9, 0);
                            }
                            if (this.field319 == 5 && this.field253 > 0) {
                                long var11 = class61.method508(this.field179);
                                this.method111(var11, this.field479);
                            }
                        }
                    } else if (this.field561 == 1) {
                        if (var3 >= 48 && var3 <= 57 && this.field339.length() < 10) {
                            this.field339 = this.field339 + (char) var3;
                            this.field409 = true;
                        }
                        if (var3 == 8 && this.field339.length() > 0) {
                            this.field339 = this.field339.substring(0, this.field339.length() - 1);
                            this.field409 = true;
                        }
                        if (var3 == 13 || var3 == 10) {
                            if (this.field339.length() > 0) {
                                int var13 = 0;
                                try {
                                    var13 = Integer.parseInt(this.field339);
                                } catch (Exception var23) {
                                }
                                this.field320.method444(false, 243);
                                this.field320.method449(var13);
                            }
                            this.field561 = 0;
                            this.field409 = true;
                        }
                    } else if (this.field561 == 2) {
                        if (var3 >= 32 && var3 <= 122 && this.field339.length() < 12) {
                            this.field339 = this.field339 + (char) var3;
                            this.field409 = true;
                        }
                        if (var3 == 8 && this.field339.length() > 0) {
                            this.field339 = this.field339.substring(0, this.field339.length() - 1);
                            this.field409 = true;
                        }
                        if (var3 == 13 || var3 == 10) {
                            if (this.field339.length() > 0) {
                                this.field320.method444(false, 52);
                                this.field320.method451(class61.method508(this.field339), true);
                            }
                            this.field561 = 0;
                            this.field409 = true;
                        }
                    } else if (this.field338 == -1) {
                        if (var3 >= 32 && var3 <= 122 && this.field388.length() < 80) {
                            this.field388 = this.field388 + (char) var3;
                            this.field409 = true;
                        }
                        if (var3 == 8 && this.field388.length() > 0) {
                            this.field388 = this.field388.substring(0, this.field388.length() - 1);
                            this.field409 = true;
                        }
                        if ((var3 == 13 || var3 == 10) && this.field388.length() > 0) {
                            if (this.field123 == 2) {
                                if (this.field388.equals("::clientdrop")) {
                                    this.method150(false);
                                }
                                if (this.field388.equals("::lag")) {
                                    this.method108(0);
                                }
                                if (this.field388.equals("::prefetchmusic")) {
                                    for (int var14 = 0; var14 < this.field491.method191(false, 2); ++var14) {
                                        this.field491.method201(-279, 2, (byte) 1, var14);
                                    }
                                }
                                if (this.field388.equals("::fpson")) {
                                    field124 = true;
                                }
                                if (this.field388.equals("::fpsoff")) {
                                    field124 = false;
                                }
                                if (this.field388.equals("::noclip")) {
                                    for (int var15 = 0; var15 < 4; ++var15) {
                                        for (int var16 = 1; var16 < 103; ++var16) {
                                            for (int var17 = 1; var17 < 103; ++var17) {
                                                this.field445[var15].field102[var16][var17] = 0;
                                            }
                                        }
                                    }
                                }
                            }
                            if (this.field388.startsWith("::")) {
                                this.field320.method444(false, 216);
                                this.field320.method445(this.field388.length() - 1);
                                this.field320.method452(this.field388.substring(2));
                            } else {
                                String var18 = this.field388.toLowerCase();
                                byte var19 = 0;
                                if (var18.startsWith("yellow:")) {
                                    var19 = 0;
                                    this.field388 = this.field388.substring(7);
                                } else if (var18.startsWith("red:")) {
                                    var19 = 1;
                                    this.field388 = this.field388.substring(4);
                                } else if (var18.startsWith("green:")) {
                                    var19 = 2;
                                    this.field388 = this.field388.substring(6);
                                } else if (var18.startsWith("cyan:")) {
                                    var19 = 3;
                                    this.field388 = this.field388.substring(5);
                                } else if (var18.startsWith("purple:")) {
                                    var19 = 4;
                                    this.field388 = this.field388.substring(7);
                                } else if (var18.startsWith("white:")) {
                                    var19 = 5;
                                    this.field388 = this.field388.substring(6);
                                } else if (var18.startsWith("flash1:")) {
                                    var19 = 6;
                                    this.field388 = this.field388.substring(7);
                                } else if (var18.startsWith("flash2:")) {
                                    var19 = 7;
                                    this.field388 = this.field388.substring(7);
                                } else if (var18.startsWith("flash3:")) {
                                    var19 = 8;
                                    this.field388 = this.field388.substring(7);
                                } else if (var18.startsWith("glow1:")) {
                                    var19 = 9;
                                    this.field388 = this.field388.substring(6);
                                } else if (var18.startsWith("glow2:")) {
                                    var19 = 10;
                                    this.field388 = this.field388.substring(6);
                                } else if (var18.startsWith("glow3:")) {
                                    var19 = 11;
                                    this.field388 = this.field388.substring(6);
                                }
                                String var20 = this.field388.toLowerCase();
                                byte var21 = 0;
                                if (var20.startsWith("wave:")) {
                                    var21 = 1;
                                    this.field388 = this.field388.substring(5);
                                } else if (var20.startsWith("wave2:")) {
                                    var21 = 2;
                                    this.field388 = this.field388.substring(6);
                                } else if (var20.startsWith("shake:")) {
                                    var21 = 3;
                                    this.field388 = this.field388.substring(6);
                                } else if (var20.startsWith("scroll:")) {
                                    var21 = 4;
                                    this.field388 = this.field388.substring(7);
                                } else if (var20.startsWith("slide:")) {
                                    var21 = 5;
                                    this.field388 = this.field388.substring(6);
                                }
                                this.field320.method444(false, 173);
                                this.field320.method445(0);
                                int var22 = this.field320.field1456;
                                this.field320.method471(4, var21);
                                this.field364.field1456 = 0;
                                class6.method38(this.field388, -16600, this.field364);
                                this.field320.method492(this.field364.field1455, true, 0, this.field364.field1456);
                                this.field320.method445(var19);
                                this.field320.method454(this.field320.field1456 - var22, 36772);
                                this.field388 = class6.method39(76, this.field388);
                                this.field388 = class72.method567(76, this.field388);
                                field425.field1419 = this.field388;
                                field425.field1401 = var19;
                                field425.field1403 = var21;
                                field425.field1409 = 150;
                                if (this.field123 == 2) {
                                    this.method104("@cr2@" + field425.field1488, field425.field1419, 2, this.field341);
                                } else if (this.field123 == 1) {
                                    this.method104("@cr1@" + field425.field1488, field425.field1419, 2, this.field341);
                                } else {
                                    this.method104(field425.field1488, field425.field1419, 2, this.field341);
                                }
                                if (this.field571 == 2) {
                                    this.field571 = 3;
                                    this.field459 = true;
                                    this.field320.method444(false, 4);
                                    this.field320.method445(this.field571);
                                    this.field320.method445(this.field354);
                                    this.field320.method445(this.field516);
                                }
                            }
                            this.field388 = "";
                            this.field409 = true;
                        }
                    }
                }
            } while ((var3 < 97 || var3 > 122) && (var3 < 65 || var3 > 90) && (var3 < 48 || var3 > 57) && var3 != 32);
            if (this.field408.length() < 12) {
                this.field408 = this.field408 + (char) var3;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZZ)V")
    public final void method56(boolean arg0, boolean arg1) {
        this.method135((byte) 7);
        this.field201.method399(true);
        this.field158.method555(0, 0, this.field481);
        short var3 = 360;
        short var4 = 200;
        if (this.field238 == 0) {
            int var5 = var4 / 2 + 80;
            this.field330.method242(-546, 7711145, true, this.field491.field669, var3 / 2, var5);
            int var6 = var4 / 2 - 20;
            this.field332.method242(-546, 16776960, true, "Welcome to RuneScape", var3 / 2, var6);
            int var17 = var6 + 30;
            int var7 = var3 / 2 - 80;
            int var8 = var4 / 2 + 20;
            this.field159.method555(var7 - 73, var8 - 20, this.field481);
            this.field332.method242(-546, 16777215, true, "New User", var7, var8 + 5);
            int var9 = var3 / 2 + 80;
            this.field159.method555(var9 - 73, var8 - 20, this.field481);
            this.field332.method242(-546, 16777215, true, "Existing User", var9, var8 + 5);
        }
        if (this.field238 == 2) {
            int var10 = var4 / 2 - 40;
            if (this.field240.length() > 0) {
                this.field332.method242(-546, 16776960, true, this.field240, var3 / 2, var10 - 15);
                this.field332.method242(-546, 16776960, true, this.field241, var3 / 2, var10);
                var10 += 30;
            } else {
                this.field332.method242(-546, 16776960, true, this.field241, var3 / 2, var10 - 7);
                var10 += 30;
            }
            this.field332.method249(true, 7, "Username: " + this.field357 + (this.field489 == 0 & field347 % 40 < 20 ? "@yel@|" : ""), 16777215, var3 / 2 - 90, var10);
            var10 += 15;
            this.field332.method249(true, 7, "Password: " + class61.method513(this.field437, this.field358) + (this.field489 == 1 & field347 % 40 < 20 ? "@yel@|" : ""), 16777215, var3 / 2 - 88, var10);
            var10 += 15;
            if (!arg0) {
                int var11 = var3 / 2 - 80;
                int var12 = var4 / 2 + 50;
                this.field159.method555(var11 - 73, var12 - 20, this.field481);
                this.field332.method242(-546, 16777215, true, "Login", var11, var12 + 5);
                int var13 = var3 / 2 + 80;
                this.field159.method555(var13 - 73, var12 - 20, this.field481);
                this.field332.method242(-546, 16777215, true, "Cancel", var13, var12 + 5);
            }
        }
        if (this.field238 == 3) {
            this.field332.method242(-546, 16776960, true, "Create a free account", var3 / 2, var4 / 2 - 60);
            int var14 = var4 / 2 - 35;
            this.field332.method242(-546, 16777215, true, "To create a new account you need to", var3 / 2, var14);
            int var18 = var14 + 15;
            this.field332.method242(-546, 16777215, true, "go back to the main RuneScape webpage", var3 / 2, var18);
            int var19 = var18 + 15;
            this.field332.method242(-546, 16777215, true, "and choose the red 'create account'", var3 / 2, var19);
            int var20 = var19 + 15;
            this.field332.method242(-546, 16777215, true, "button at the top right of that page.", var3 / 2, var20);
            int var21 = var20 + 15;
            int var15 = var3 / 2;
            int var16 = var4 / 2 + 50;
            this.field159.method555(var15 - 73, var16 - 20, this.field481);
            this.field332.method242(-546, 16777215, true, "Cancel", var15, var16 + 5);
        }
        this.field201.method400((byte) -122, 171, 202, super.field11);
        this.field248 &= arg1;
        if (this.field412) {
            this.field412 = false;
            this.field199.method400((byte) -122, 0, 128, super.field11);
            this.field200.method400((byte) -122, 371, 202, super.field11);
            this.field204.method400((byte) -122, 265, 0, super.field11);
            this.field205.method400((byte) -122, 265, 562, super.field11);
            this.field206.method400((byte) -122, 171, 128, super.field11);
            this.field207.method400((byte) -122, 171, 562, super.field11);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZIIIIIII)V")
    private final void method57(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg0) {
            field454 = true;
        }
        if (arg4 >= 1 && arg7 >= 1 && arg4 <= 102 && arg7 <= 102) {
            if (field196 && this.field548 != arg2) {
                return;
            }
            int var9 = 0;
            boolean var10 = true;
            boolean var11 = false;
            boolean var12 = false;
            if (arg5 == 0) {
                var9 = this.field383.method368(arg2, arg4, arg7);
            }
            if (arg5 == 1) {
                var9 = this.field383.method369(arg7, -17514, arg4, arg2);
            }
            if (arg5 == 2) {
                var9 = this.field383.method370(arg2, arg4, arg7);
            }
            if (arg5 == 3) {
                var9 = this.field383.method371(arg2, arg4, arg7);
            }
            if (var9 != 0) {
                int var13 = this.field383.method372(arg2, arg4, arg7, var9);
                int var14 = var9 >> 14 & 32767;
                int var15 = var13 & 31;
                int var16 = var13 >> 6;
                if (arg5 == 0) {
                    this.field383.method359(arg2, arg7, -43431, arg4);
                    class4 var17 = class4.method24(var14);
                    if (var17.field79) {
                        this.field445[arg2].method30(arg7, var17.field49, false, var15, var16, arg4);
                    }
                }
                if (arg5 == 1) {
                    this.field383.method360(-627, arg4, arg7, arg2);
                }
                if (arg5 == 2) {
                    this.field383.method361(arg4, arg7, arg2, -70);
                    class4 var18 = class4.method24(var14);
                    if (var18.field72 + arg4 > 103 || var18.field72 + arg7 > 103 || var18.field57 + arg4 > 103 || var18.field57 + arg7 > 103) {
                        return;
                    }
                    if (var18.field79) {
                        this.field445[arg2].method31(var18.field49, var18.field57, arg4, false, var16, arg7, var18.field72);
                    }
                }
                if (arg5 == 3) {
                    this.field383.method362(0, arg2, arg7, arg4);
                    class4 var19 = class4.method24(var14);
                    if (var19.field79 && var19.field40) {
                        this.field445[arg2].method33(arg7, -83, arg4);
                    }
                }
            }
            if (arg1 >= 0) {
                int var20 = arg2;
                if (arg2 < 3 && (this.field531[1][arg4][arg7] & 2) == 2) {
                    var20 = arg2 + 1;
                }
                class22.method274(arg1, 24, arg4, arg3, arg6, this.field383, var20, this.field445[arg2], arg2, this.field360, arg7);
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IILLYHLTGUG;)I")
    public final int method58(int arg0, int arg1, class29 arg2) {
        if (arg0 <= 0) {
            field381 = true;
        }
        if (arg2.field962 != null && arg1 < arg2.field962.length) {
            try {
                int[] var4 = arg2.field962[arg1];
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
                        var9 = this.field178[var4[var6++]];
                    }
                    if (var8 == 2) {
                        var9 = this.field216[var4[var6++]];
                    }
                    if (var8 == 3) {
                        var9 = this.field282[var4[var6++]];
                    }
                    if (var8 == 4) {
                        class29 var11 = class29.field963[var4[var6++]];
                        int var12 = var4[var6++];
                        if (var12 >= 0 && var12 < class31.field1054 && (!class31.method322(var12).field1049 || field195)) {
                            for (int var13 = 0; var13 < var11.field967.length; ++var13) {
                                if (var12 + 1 == var11.field967[var13]) {
                                    var9 += var11.field918[var13];
                                }
                            }
                        }
                    }
                    if (var8 == 5) {
                        var9 = this.field286[var4[var6++]];
                    }
                    if (var8 == 6) {
                        var9 = field462[this.field216[var4[var6++]] - 1];
                    }
                    if (var8 == 7) {
                        var9 = this.field286[var4[var6++]] * 100 / 46875;
                    }
                    if (var8 == 8) {
                        var9 = field425.field1480;
                    }
                    if (var8 == 9) {
                        for (int var14 = 0; var14 < class3.field36; ++var14) {
                            if (class3.field38[var14]) {
                                var9 += this.field216[var14];
                            }
                        }
                    }
                    if (var8 == 10) {
                        class29 var15 = class29.field963[var4[var6++]];
                        int var16 = var4[var6++] + 1;
                        if (var16 >= 0 && var16 < class31.field1054 && (!class31.method322(var16).field1049 || field195)) {
                            for (int var17 = 0; var17 < var15.field967.length; ++var17) {
                                if (var15.field967[var17] == var16) {
                                    var9 = 999999999;
                                    break;
                                }
                            }
                        }
                    }
                    if (var8 == 11) {
                        var9 = this.field212;
                    }
                    if (var8 == 12) {
                        var9 = this.field160;
                    }
                    if (var8 == 13) {
                        int var18 = this.field286[var4[var6++]];
                        int var19 = var4[var6++];
                        var9 = (var18 & 1 << var19) != 0 ? 1 : 0;
                    }
                    if (var8 == 14) {
                        int var20 = var4[var6++];
                        class57 var21 = class57.field1497[var20];
                        int var22 = var21.field1499;
                        int var23 = var21.field1500;
                        int var24 = var21.field1501;
                        int var25 = field184[var24 - var23];
                        var9 = this.field286[var22] >> var23 & var25;
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
                        var9 = (field425.field1422 >> 7) + this.field255;
                    }
                    if (var8 == 19) {
                        var9 = (field425.field1423 >> 7) + this.field256;
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

    @OriginalMember(owner = "client", name = "a", descriptor = "([BIB)Z")
    public final boolean method59(byte[] arg0, int arg1, byte arg2) {
        if (arg2 != 103) {
            throw new NullPointerException();
        } else {
            return arg0 == null ? true : signlink.wavesave(arg0, arg1);
        }
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(I)V")
    public final void method60(int arg0) {
        if (arg0 >= 0) {
            this.field519 = this.field363.method455();
        }
        try {
            int var2 = field425.field1422 + this.field376;
            int var3 = field425.field1423 + this.field112;
            if (this.field551 - var2 < -500 || this.field551 - var2 > 500 || this.field552 - var3 < -500 || this.field552 - var3 > 500) {
                this.field551 = var2;
                this.field552 = var3;
            }
            if (this.field551 != var2) {
                this.field551 += (var2 - this.field551) / 16;
            }
            if (this.field552 != var3) {
                this.field552 += (var3 - this.field552) / 16;
            }
            if (super.field29[1] == 1) {
                this.field121 += (-24 - this.field121) / 2;
            } else if (super.field29[2] == 1) {
                this.field121 += (24 - this.field121) / 2;
            } else {
                this.field121 /= 2;
            }
            if (super.field29[3] == 1) {
                this.field122 += (12 - this.field122) / 2;
            } else if (super.field29[4] == 1) {
                this.field122 += (-12 - this.field122) / 2;
            } else {
                this.field122 /= 2;
            }
            this.field120 = this.field121 / 2 + this.field120 & 2047;
            this.field119 += this.field122 / 2;
            if (this.field119 < 128) {
                this.field119 = 128;
            }
            if (this.field119 > 383) {
                this.field119 = 383;
            }
            int var4 = this.field551 >> 7;
            int var5 = this.field552 >> 7;
            int var6 = this.method72(this.field552, this.field551, this.field548, -964);
            int var7 = 0;
            if (var4 > 3 && var5 > 3 && var4 < 100 && var5 < 100) {
                for (int var8 = var4 - 4; var8 <= var4 + 4; ++var8) {
                    for (int var9 = var5 - 4; var9 <= var5 + 4; ++var9) {
                        int var10 = this.field548;
                        if (var10 < 3 && (this.field531[1][var8][var9] & 2) == 2) {
                            ++var10;
                        }
                        int var11 = var6 - this.field360[var10][var8][var9];
                        if (var11 > var7) {
                            var7 = var11;
                        }
                    }
                }
            }
            ++field164;
            if (field164 > 184) {
                field164 = 0;
                this.field320.method444(false, 129);
                this.field320.method446(12882);
            }
            int var12 = var7 * 192;
            if (var12 > 98048) {
                var12 = 98048;
            }
            if (var12 < 32768) {
                var12 = 32768;
            }
            if (var12 > this.field343) {
                this.field343 += (var12 - this.field343) / 24;
            } else if (var12 < this.field343) {
                this.field343 += (var12 - this.field343) / 80;
            }
        } catch (Exception var13) {
            signlink.reporterror("glfc_ex " + field425.field1422 + "," + field425.field1423 + "," + this.field551 + "," + this.field552 + "," + this.field555 + "," + this.field556 + "," + this.field255 + "," + this.field256);
            throw new RuntimeException("eek");
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILUAWAYCTK;I)V")
    private final void method61(int arg0, class55 arg1, int arg2) {
        arg1.method465(true);
        if (arg0 != 0) {
            this.field580 = null;
        }
        int var4 = arg1.method466(5, 8);
        if (var4 < this.field366) {
            for (int var5 = var4; var5 < this.field366; ++var5) {
                this.field298[this.field297++] = this.field367[var5];
            }
        }
        if (var4 > this.field366) {
            signlink.reporterror(this.field357 + " Too many npcs");
            throw new RuntimeException("eek");
        } else {
            this.field366 = 0;
            for (int var6 = 0; var6 < var4; ++var6) {
                int var7 = this.field367[var6];
                class25 var8 = this.field365[var7];
                int var9 = arg1.method466(5, 1);
                if (var9 == 0) {
                    this.field367[this.field366++] = var7;
                    var8.field1432 = field347;
                } else {
                    int var10 = arg1.method466(5, 2);
                    if (var10 == 0) {
                        this.field367[this.field366++] = var7;
                        var8.field1432 = field347;
                        this.field474[this.field473++] = var7;
                    } else if (var10 == 1) {
                        this.field367[this.field366++] = var7;
                        var8.field1432 = field347;
                        int var11 = arg1.method466(5, 3);
                        var8.method439(12, false, var11);
                        int var12 = arg1.method466(5, 1);
                        if (var12 == 1) {
                            this.field474[this.field473++] = var7;
                        }
                    } else if (var10 == 2) {
                        this.field367[this.field366++] = var7;
                        var8.field1432 = field347;
                        int var13 = arg1.method466(5, 3);
                        var8.method439(12, true, var13);
                        int var14 = arg1.method466(5, 3);
                        var8.method439(12, true, var14);
                        int var15 = arg1.method466(5, 1);
                        if (var15 == 1) {
                            this.field474[this.field473++] = var7;
                        }
                    } else if (var10 == 3) {
                        this.field298[this.field297++] = var7;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(II)V")
    public final void method62(int arg0, int arg1) {
        if (arg1 >= 3 && arg1 <= 3) {
            if (arg0 >= 0) {
                if (this.field561 != 0) {
                    this.field561 = 0;
                    this.field409 = true;
                }
                int var3 = this.field249[arg0];
                int var4 = this.field250[arg0];
                int var5 = this.field251[arg0];
                int var6 = this.field252[arg0];
                if (var5 >= 2000) {
                    var5 -= 2000;
                }
                if (var5 == 406 || var5 == 853) {
                    String var7 = this.field305[arg0];
                    int var8 = var7.indexOf("@whi@");
                    if (var8 != -1) {
                        String var9 = var7.substring(var8 + 5).trim();
                        String var10 = class61.method512(false, class61.method509(this.field533, class61.method508(var9)));
                        boolean var11 = false;
                        for (int var12 = 0; var12 < this.field471; ++var12) {
                            class56 var13 = this.field470[this.field472[var12]];
                            if (var13 != null && var13.field1488 != null && var13.field1488.equalsIgnoreCase(var10)) {
                                this.method71(var13.field1415[0], false, 1, 1, 0, field425.field1416[0], field425.field1415[0], 0, 0, var13.field1416[0], 0, 2);
                                if (var5 == 406) {
                                    this.field320.method444(false, 218);
                                    this.field320.method480(-24437, this.field472[var12]);
                                }
                                if (var5 == 853) {
                                    this.field320.method444(false, 170);
                                    this.field320.method481(975, this.field472[var12]);
                                }
                                var11 = true;
                                break;
                            }
                        }
                        if (!var11) {
                            this.method104("", "Unable to find " + var10, 0, this.field341);
                        }
                    }
                }
                if (var5 == 842) {
                    this.field320.method444(false, 149);
                    this.field320.method481(975, var6);
                    this.field320.method480(-24437, var4);
                    this.field320.method479(var3, 8);
                    this.field217 = 0;
                    this.field218 = var4;
                    this.field219 = var3;
                    this.field220 = 2;
                    if (class29.field963[var4].field928 == this.field299) {
                        this.field220 = 1;
                    }
                    if (class29.field963[var4].field928 == this.field338) {
                        this.field220 = 3;
                    }
                }
                if (var5 == 532) {
                    this.field320.method444(false, 35);
                    this.field320.method446(var3);
                    this.field320.method480(-24437, var6);
                    this.field320.method446(var4);
                    this.field217 = 0;
                    this.field218 = var4;
                    this.field219 = var3;
                    this.field220 = 2;
                    if (class29.field963[var4].field928 == this.field299) {
                        this.field220 = 1;
                    }
                    if (class29.field963[var4].field928 == this.field338) {
                        this.field220 = 3;
                    }
                }
                if (var5 == 153) {
                    class25 var14 = this.field365[var6];
                    if (var14 != null) {
                        this.method71(var14.field1415[0], false, 1, 1, 0, field425.field1416[0], field425.field1415[0], 0, 0, var14.field1416[0], 0, 2);
                        this.field427 = super.field26;
                        this.field428 = super.field27;
                        this.field430 = 2;
                        this.field429 = 0;
                        this.field320.method444(false, 36);
                        this.field320.method479(var6, 8);
                    }
                }
                if (var5 == 69) {
                    this.field320.method444(false, 44);
                    this.field320.method480(-24437, var4);
                    this.field320.method446(var3);
                    this.field320.method479(var6, 8);
                    this.field217 = 0;
                    this.field218 = var4;
                    this.field219 = var3;
                    this.field220 = 2;
                    if (class29.field963[var4].field928 == this.field299) {
                        this.field220 = 1;
                    }
                    if (class29.field963[var4].field928 == this.field338) {
                        this.field220 = 3;
                    }
                }
                if (var5 == 904) {
                    if (!this.field572) {
                        this.field383.method380(super.field26 - 4, super.field27 - 4, -773);
                    } else {
                        this.field383.method380(var3 - 4, var4 - 4, -773);
                    }
                }
                if (var5 == 118) {
                    this.field320.method444(false, 209);
                    this.field320.method446(var4);
                    this.field320.method480(-24437, var6);
                    this.field320.method481(975, var3);
                    this.field217 = 0;
                    this.field218 = var4;
                    this.field219 = var3;
                    this.field220 = 2;
                    if (class29.field963[var4].field928 == this.field299) {
                        this.field220 = 1;
                    }
                    if (class29.field963[var4].field928 == this.field338) {
                        this.field220 = 3;
                    }
                }
                if (var5 == 35) {
                    this.field320.method444(false, 88);
                    this.field320.method481(975, var6);
                    this.field320.method479(var4, 8);
                    this.field320.method479(var3, 8);
                    this.field217 = 0;
                    this.field218 = var4;
                    this.field219 = var3;
                    this.field220 = 2;
                    if (class29.field963[var4].field928 == this.field299) {
                        this.field220 = 1;
                    }
                    if (class29.field963[var4].field928 == this.field338) {
                        this.field220 = 3;
                    }
                }
                if (var5 == 775) {
                    this.field320.method444(false, 192);
                    this.field320.method481(975, var3);
                    this.field320.method446(var4);
                    this.field320.method446(var6);
                    this.field320.method479(this.field147, 8);
                    this.field217 = 0;
                    this.field218 = var4;
                    this.field219 = var3;
                    this.field220 = 2;
                    if (class29.field963[var4].field928 == this.field299) {
                        this.field220 = 1;
                    }
                    if (class29.field963[var4].field928 == this.field338) {
                        this.field220 = 3;
                    }
                }
                if (var5 == 978) {
                    this.method143(false);
                }
                if (var5 == 749) {
                    class25 var15 = this.field365[var6];
                    if (var15 != null) {
                        this.method71(var15.field1415[0], false, 1, 1, 0, field425.field1416[0], field425.field1415[0], 0, 0, var15.field1416[0], 0, 2);
                        this.field427 = super.field26;
                        this.field428 = super.field27;
                        this.field430 = 2;
                        this.field429 = 0;
                        field150 += var6;
                        if (field150 >= 134) {
                            this.field320.method444(false, 99);
                            this.field320.method449(0);
                            field150 = 0;
                        }
                        this.field320.method444(false, 136);
                        this.field320.method480(-24437, var6);
                    }
                }
                if (var5 == 863) {
                    class56 var16 = this.field470[var6];
                    if (var16 != null) {
                        this.method71(var16.field1415[0], false, 1, 1, 0, field425.field1416[0], field425.field1415[0], 0, 0, var16.field1416[0], 0, 2);
                        this.field427 = super.field26;
                        this.field428 = super.field27;
                        this.field430 = 2;
                        this.field429 = 0;
                        this.field320.method444(false, 113);
                        this.field320.method481(975, var6);
                        this.field320.method481(975, this.field496);
                        this.field320.method446(this.field497);
                        this.field320.method479(this.field495, 8);
                    }
                }
                if (var5 == 551) {
                    this.method110(var3, var6, var4, -734);
                    this.field320.method444(false, 9);
                    this.field320.method446(this.field256 + var4);
                    this.field320.method446(var6 >> 14 & 32767);
                    this.field320.method480(-24437, this.field255 + var3);
                }
                if (var5 == 734) {
                    this.field320.method444(false, 153);
                    this.field320.method446(var4);
                    class29 var17 = class29.field963[var4];
                    if (var17.field962 != null && var17.field962[0][0] == 5) {
                        int var18 = var17.field962[0][1];
                        this.field286[var18] = 1 - this.field286[var18];
                        this.method165(this.field221, var18);
                        this.field490 = true;
                    }
                }
                if (var5 == 14) {
                    boolean var19 = this.method71(var3, false, 0, 0, 0, field425.field1416[0], field425.field1415[0], 0, 0, var4, 0, 2);
                    if (!var19) {
                        this.method71(var3, false, 1, 1, 0, field425.field1416[0], field425.field1415[0], 0, 0, var4, 0, 2);
                    }
                    this.field427 = super.field26;
                    this.field428 = super.field27;
                    this.field430 = 2;
                    this.field429 = 0;
                    this.field320.method444(false, 198);
                    this.field320.method479(var6, 8);
                    this.field320.method480(-24437, this.field256 + var4);
                    this.field320.method479(this.field255 + var3, 8);
                }
                if (var5 == 761 || var5 == 157 || var5 == 280 || var5 == 279) {
                    String var21 = this.field305[arg0];
                    int var22 = var21.indexOf("@whi@");
                    if (var22 != -1) {
                        long var23 = class61.method508(var21.substring(var22 + 5).trim());
                        if (var5 == 761) {
                            this.method173(this.field464, var23);
                        }
                        if (var5 == 157) {
                            this.method106(var23, 0);
                        }
                        if (var5 == 280) {
                            this.method54(973, var23);
                        }
                        if (var5 == 279) {
                            this.method111(var23, this.field479);
                        }
                    }
                }
                if (var5 == 186) {
                    boolean var25 = this.method71(var3, false, 0, 0, 0, field425.field1416[0], field425.field1415[0], 0, 0, var4, 0, 2);
                    if (!var25) {
                        this.method71(var3, false, 1, 1, 0, field425.field1416[0], field425.field1415[0], 0, 0, var4, 0, 2);
                    }
                    this.field427 = super.field26;
                    this.field428 = super.field27;
                    this.field430 = 2;
                    this.field429 = 0;
                    this.field320.method444(false, 114);
                    this.field320.method446(var6);
                    this.field320.method446(this.field256 + var4);
                    this.field320.method446(this.field255 + var3);
                }
                if (var5 == 1822) {
                    class25 var27 = this.field365[var6];
                    if (var27 != null) {
                        class24 var28 = var27.field871;
                        if (var28.field836 != null) {
                            var28 = var28.method282(0);
                        }
                        if (var28 != null) {
                            String var29;
                            if (var28.field830 != null) {
                                var29 = new String(var28.field830);
                            } else {
                                var29 = "It's a " + var28.field832 + ".";
                            }
                            this.method104("", var29, 0, this.field341);
                        }
                    }
                }
                if (var5 == 915) {
                    boolean var30 = this.method71(var3, false, 0, 0, 0, field425.field1416[0], field425.field1415[0], 0, 0, var4, 0, 2);
                    if (!var30) {
                        this.method71(var3, false, 1, 1, 0, field425.field1416[0], field425.field1415[0], 0, 0, var4, 0, 2);
                    }
                    this.field427 = super.field26;
                    this.field428 = super.field27;
                    this.field430 = 2;
                    this.field429 = 0;
                    if ((var4 & 3) == 0) {
                        ++field506;
                    }
                    if (field506 >= 149) {
                        this.field320.method444(false, 244);
                        this.field320.method445(161);
                        field506 = 0;
                    }
                    this.field320.method444(false, 109);
                    this.field320.method481(975, this.field256 + var4);
                    this.field320.method479(var6, 8);
                    this.field320.method446(this.field255 + var3);
                }
                if (var5 == 1969) {
                    class31 var32 = class31.method322(var6);
                    class29 var33 = class29.field963[var4];
                    String var34;
                    if (var33 != null && var33.field918[var3] >= 100000) {
                        var34 = var33.field918[var3] + " x " + var32.field1012;
                    } else if (var32.field1042 != null) {
                        var34 = new String(var32.field1042);
                    } else {
                        var34 = "It's a " + var32.field1012 + ".";
                    }
                    this.method104("", var34, 0, this.field341);
                }
                if (var5 == 870) {
                    class29 var35 = class29.field963[var4];
                    this.field146 = 1;
                    this.field147 = var4;
                    this.field148 = var35.field927;
                    this.field494 = 0;
                    this.field490 = true;
                    String var36 = var35.field980;
                    if (var36.indexOf(" ") != -1) {
                        var36 = var36.substring(0, var36.indexOf(" "));
                    }
                    String var37 = var35.field980;
                    if (var37.indexOf(" ") != -1) {
                        var37 = var37.substring(var37.indexOf(" ") + 1);
                    }
                    this.field149 = var36 + " " + var35.field969 + " " + var37;
                    if (this.field148 == 16) {
                        this.field490 = true;
                        this.field125 = 3;
                        this.field455 = true;
                    }
                } else {
                    if (var5 == 194) {
                        String var38 = this.field305[arg0];
                        int var39 = var38.indexOf("@whi@");
                        if (var39 != -1) {
                            if (this.field299 == -1) {
                                this.method143(false);
                                this.field408 = var38.substring(var39 + 5).trim();
                                this.field502 = false;
                                for (int var40 = 0; var40 < class29.field963.length; ++var40) {
                                    if (class29.field963[var40] != null && class29.field963[var40].field952 == 600) {
                                        this.field243 = this.field299 = class29.field963[var40].field928;
                                        break;
                                    }
                                }
                            } else {
                                this.method104("", "Please close the interface you have open before using 'report abuse'", 0, this.field341);
                            }
                        }
                    }
                    if (var5 == 534) {
                        boolean var41 = this.method71(var3, false, 0, 0, 0, field425.field1416[0], field425.field1415[0], 0, 0, var4, 0, 2);
                        if (!var41) {
                            this.method71(var3, false, 1, 1, 0, field425.field1416[0], field425.field1415[0], 0, 0, var4, 0, 2);
                        }
                        this.field427 = super.field26;
                        this.field428 = super.field27;
                        this.field430 = 2;
                        this.field429 = 0;
                        this.field320.method444(false, 30);
                        this.field320.method446(this.field256 + var4);
                        this.field320.method446(this.field497);
                        this.field320.method480(-24437, this.field496);
                        this.field320.method479(var6, 8);
                        this.field320.method480(-24437, this.field255 + var3);
                        this.field320.method481(975, this.field495);
                    }
                    if (var5 == 457) {
                        class25 var43 = this.field365[var6];
                        if (var43 != null) {
                            this.method71(var43.field1415[0], false, 1, 1, 0, field425.field1416[0], field425.field1415[0], 0, 0, var43.field1416[0], 0, 2);
                            this.field427 = super.field26;
                            this.field428 = super.field27;
                            this.field430 = 2;
                            this.field429 = 0;
                            this.field320.method444(false, 228);
                            this.field320.method479(var6, 8);
                        }
                    }
                    if (var5 == 102 && this.method110(var3, var6, var4, -734)) {
                        this.field320.method444(false, 96);
                        this.field320.method480(-24437, this.field495);
                        this.field320.method479(var6 >> 14 & 32767, 8);
                        this.field320.method446(this.field496);
                        this.field320.method480(-24437, this.field256 + var4);
                        this.field320.method481(975, this.field497);
                        this.field320.method446(this.field255 + var3);
                    }
                    if (var5 == 698) {
                        this.method110(var3, var6, var4, -734);
                        this.field320.method444(false, 134);
                        this.field320.method480(-24437, this.field256 + var4);
                        this.field320.method481(975, var6 >> 14 & 32767);
                        this.field320.method480(-24437, this.field255 + var3);
                    }
                    if (var5 == 222) {
                        class56 var44 = this.field470[var6];
                        if (var44 != null) {
                            this.method71(var44.field1415[0], false, 1, 1, 0, field425.field1416[0], field425.field1415[0], 0, 0, var44.field1416[0], 0, 2);
                            this.field427 = super.field26;
                            this.field428 = super.field27;
                            this.field430 = 2;
                            this.field429 = 0;
                            this.field320.method444(false, 139);
                            this.field320.method446(var6);
                            this.field320.method480(-24437, this.field147);
                        }
                    }
                    if (var5 == 255 && this.method110(var3, var6, var4, -734)) {
                        this.field320.method444(false, 183);
                        this.field320.method480(-24437, var6 >> 14 & 32767);
                        this.field320.method481(975, this.field147);
                        this.field320.method479(this.field256 + var4, 8);
                        this.field320.method481(975, this.field255 + var3);
                    }
                    if (var5 == 73) {
                        String var45 = this.field305[arg0];
                        int var46 = var45.indexOf("@whi@");
                        if (var46 != -1) {
                            long var47 = class61.method508(var45.substring(var46 + 5).trim());
                            int var49 = -1;
                            for (int var50 = 0; var50 < this.field447; ++var50) {
                                if (this.field313[var50] == var47) {
                                    var49 = var50;
                                    break;
                                }
                            }
                            if (var49 != -1 && this.field162[var49] > 0) {
                                this.field409 = true;
                                this.field561 = 0;
                                this.field334 = true;
                                this.field179 = "";
                                this.field319 = 3;
                                this.field271 = this.field313[var49];
                                this.field300 = "Enter message to send to " + this.field581[var49];
                            }
                        }
                    }
                    if (var5 == 568) {
                        this.method110(var3, var6, var4, -734);
                        this.field320.method444(false, 148);
                        this.field320.method481(975, this.field255 + var3);
                        this.field320.method481(975, var6 >> 14 & 32767);
                        this.field320.method480(-24437, this.field256 + var4);
                    }
                    if (var5 == 962) {
                        class56 var51 = this.field470[var6];
                        if (var51 != null) {
                            this.method71(var51.field1415[0], false, 1, 1, 0, field425.field1416[0], field425.field1415[0], 0, 0, var51.field1416[0], 0, 2);
                            this.field427 = super.field26;
                            this.field428 = super.field27;
                            this.field430 = 2;
                            this.field429 = 0;
                            field247 += var6;
                            if (field247 >= 107) {
                                this.field320.method444(false, 11);
                                field247 = 0;
                            }
                            this.field320.method444(false, 50);
                            this.field320.method480(-24437, var6);
                        }
                    }
                    if (var5 == 208) {
                        this.field320.method444(false, 15);
                        this.field320.method446(this.field495);
                        this.field320.method481(975, this.field497);
                        this.field320.method480(-24437, var4);
                        this.field320.method481(975, this.field496);
                        this.field320.method480(-24437, var6);
                        this.field320.method446(var3);
                        this.field217 = 0;
                        this.field218 = var4;
                        this.field219 = var3;
                        this.field220 = 2;
                        if (class29.field963[var4].field928 == this.field299) {
                            this.field220 = 1;
                        }
                        if (class29.field963[var4].field928 == this.field338) {
                            this.field220 = 3;
                        }
                    }
                    if (var5 == 267) {
                        class56 var52 = this.field470[var6];
                        if (var52 != null) {
                            this.method71(var52.field1415[0], false, 1, 1, 0, field425.field1416[0], field425.field1415[0], 0, 0, var52.field1416[0], 0, 2);
                            this.field427 = super.field26;
                            this.field428 = super.field27;
                            this.field430 = 2;
                            this.field429 = 0;
                            this.field320.method444(false, 170);
                            this.field320.method481(975, var6);
                        }
                    }
                    if (var5 == 187) {
                        class56 var53 = this.field470[var6];
                        if (var53 != null) {
                            this.method71(var53.field1415[0], false, 1, 1, 0, field425.field1416[0], field425.field1415[0], 0, 0, var53.field1416[0], 0, 2);
                            this.field427 = super.field26;
                            this.field428 = super.field27;
                            this.field430 = 2;
                            this.field429 = 0;
                            this.field320.method444(false, 241);
                            this.field320.method481(975, var6);
                        }
                    }
                    if (var5 == 1554) {
                        int var54 = var6 >> 14 & 32767;
                        class4 var55 = class4.method24(var54);
                        String var56;
                        if (var55.field67 != null) {
                            var56 = new String(var55.field67);
                        } else {
                            var56 = "It's a " + var55.field54 + ".";
                        }
                        this.method104("", var56, 0, this.field341);
                    }
                    if (var5 == 650) {
                        this.field320.method444(false, 250);
                        this.field320.method481(975, var3);
                        this.field320.method481(975, var6);
                        this.field320.method479(var4, 8);
                        this.field217 = 0;
                        this.field218 = var4;
                        this.field219 = var3;
                        this.field220 = 2;
                        if (class29.field963[var4].field928 == this.field299) {
                            this.field220 = 1;
                        }
                        if (class29.field963[var4].field928 == this.field338) {
                            this.field220 = 3;
                        }
                    }
                    if (var5 == 821) {
                        this.field320.method444(false, 64);
                        this.field320.method446(var6);
                        this.field320.method481(975, var4);
                        this.field320.method480(-24437, var3);
                        this.field217 = 0;
                        this.field218 = var4;
                        this.field219 = var3;
                        this.field220 = 2;
                        if (class29.field963[var4].field928 == this.field299) {
                            this.field220 = 1;
                        }
                        if (class29.field963[var4].field928 == this.field338) {
                            this.field220 = 3;
                        }
                    }
                    if (var5 == 1892) {
                        class31 var57 = class31.method322(var6);
                        String var58;
                        if (var57.field1042 != null) {
                            var58 = new String(var57.field1042);
                        } else {
                            var58 = "It's a " + var57.field1012 + ".";
                        }
                        this.method104("", var58, 0, this.field341);
                    }
                    if (var5 == 479) {
                        this.field320.method444(false, 135);
                        this.field320.method481(975, var6);
                        this.field320.method480(-24437, var3);
                        this.field320.method481(975, var4);
                        this.field217 = 0;
                        this.field218 = var4;
                        this.field219 = var3;
                        this.field220 = 2;
                        if (class29.field963[var4].field928 == this.field299) {
                            this.field220 = 1;
                        }
                        if (class29.field963[var4].field928 == this.field338) {
                            this.field220 = 3;
                        }
                    }
                    if (var5 == 681) {
                        this.field494 = 1;
                        this.field495 = var3;
                        this.field496 = var4;
                        this.field497 = var6;
                        this.field498 = class31.method322(var6).field1012;
                        this.field146 = 0;
                        this.field490 = true;
                    } else {
                        if (var5 == 861) {
                            this.field126 = -1;
                            this.field409 = true;
                        }
                        if (var5 == 597) {
                            this.field320.method444(false, 153);
                            this.field320.method446(var4);
                            class29 var59 = class29.field963[var4];
                            if (var59.field962 != null && var59.field962[0][0] == 5) {
                                int var60 = var59.field962[0][1];
                                if (this.field286[var60] != var59.field953[0]) {
                                    this.field286[var60] = var59.field953[0];
                                    this.method165(this.field221, var60);
                                    this.field490 = true;
                                }
                            }
                        }
                        if (var5 == 1500) {
                            this.method110(var3, var6, var4, -734);
                            this.field320.method444(false, 111);
                            this.field320.method479(this.field256 + var4, 8);
                            this.field320.method479(this.field255 + var3, 8);
                            this.field320.method479(var6 >> 14 & 32767, 8);
                        }
                        if (var5 == 217 && !this.field503) {
                            this.field320.method444(false, 189);
                            this.field320.method446(var4);
                            this.field503 = true;
                        }
                        if (var5 == 951) {
                            class29 var61 = class29.field963[var4];
                            boolean var62 = true;
                            if (var61.field952 > 0) {
                                var62 = this.method167(var61, 927);
                            }
                            if (var62) {
                                this.field320.method444(false, 153);
                                this.field320.method446(var4);
                            }
                        }
                        if (var5 == 610) {
                            class25 var63 = this.field365[var6];
                            if (var63 != null) {
                                this.method71(var63.field1415[0], false, 1, 1, 0, field425.field1416[0], field425.field1415[0], 0, 0, var63.field1416[0], 0, 2);
                                this.field427 = super.field26;
                                this.field428 = super.field27;
                                this.field430 = 2;
                                this.field429 = 0;
                                this.field320.method444(false, 142);
                                this.field320.method446(var6);
                                this.field320.method446(this.field147);
                            }
                        }
                        if (var5 == 397) {
                            class25 var64 = this.field365[var6];
                            if (var64 != null) {
                                this.method71(var64.field1415[0], false, 1, 1, 0, field425.field1416[0], field425.field1415[0], 0, 0, var64.field1416[0], 0, 2);
                                this.field427 = super.field26;
                                this.field428 = super.field27;
                                this.field430 = 2;
                                this.field429 = 0;
                                this.field320.method444(false, 204);
                                this.field320.method481(975, this.field496);
                                this.field320.method480(-24437, this.field495);
                                this.field320.method446(this.field497);
                                this.field320.method481(975, var6);
                            }
                        }
                        if (var5 == 468) {
                            boolean var65 = this.method71(var3, false, 0, 0, 0, field425.field1416[0], field425.field1415[0], 0, 0, var4, 0, 2);
                            if (!var65) {
                                this.method71(var3, false, 1, 1, 0, field425.field1416[0], field425.field1415[0], 0, 0, var4, 0, 2);
                            }
                            this.field427 = super.field26;
                            this.field428 = super.field27;
                            this.field430 = 2;
                            this.field429 = 0;
                            this.field320.method444(false, 246);
                            this.field320.method479(var6, 8);
                            this.field320.method446(this.field256 + var4);
                            this.field320.method480(-24437, this.field147);
                            this.field320.method480(-24437, this.field255 + var3);
                        }
                        if (var5 == 149) {
                            this.field320.method444(false, 172);
                            this.field320.method446(var3);
                            this.field320.method481(975, var4);
                            this.field320.method479(var6, 8);
                            this.field217 = 0;
                            this.field218 = var4;
                            this.field219 = var3;
                            this.field220 = 2;
                            if (class29.field963[var4].field928 == this.field299) {
                                this.field220 = 1;
                            }
                            if (class29.field963[var4].field928 == this.field338) {
                                this.field220 = 3;
                            }
                        }
                        if (var5 == 684) {
                            if ((var3 & 3) == 0) {
                                ++field323;
                            }
                            if (field323 >= 99) {
                                this.field320.method444(false, 119);
                                field323 = 0;
                            }
                            this.field320.method444(false, 76);
                            this.field320.method480(-24437, var6);
                            this.field320.method481(975, var4);
                            this.field320.method479(var3, 8);
                            this.field217 = 0;
                            this.field218 = var4;
                            this.field219 = var3;
                            this.field220 = 2;
                            if (class29.field963[var4].field928 == this.field299) {
                                this.field220 = 1;
                            }
                            if (class29.field963[var4].field928 == this.field338) {
                                this.field220 = 3;
                            }
                        }
                        if (var5 == 401) {
                            boolean var67 = this.method71(var3, false, 0, 0, 0, field425.field1416[0], field425.field1415[0], 0, 0, var4, 0, 2);
                            if (!var67) {
                                this.method71(var3, false, 1, 1, 0, field425.field1416[0], field425.field1415[0], 0, 0, var4, 0, 2);
                            }
                            this.field427 = super.field26;
                            this.field428 = super.field27;
                            this.field430 = 2;
                            this.field429 = 0;
                            ++field501;
                            if (field501 >= 128) {
                                this.field320.method444(false, 146);
                                this.field320.method445(124);
                                field501 = 0;
                            }
                            this.field320.method444(false, 144);
                            this.field320.method481(975, var6);
                            this.field320.method446(this.field256 + var4);
                            this.field320.method479(this.field255 + var3, 8);
                        }
                        if (var5 == 560) {
                            class25 var69 = this.field365[var6];
                            if (var69 != null) {
                                this.method71(var69.field1415[0], false, 1, 1, 0, field425.field1416[0], field425.field1415[0], 0, 0, var69.field1416[0], 0, 2);
                                this.field427 = super.field26;
                                this.field428 = super.field27;
                                this.field430 = 2;
                                this.field429 = 0;
                                this.field320.method444(false, 247);
                                this.field320.method479(var6, 8);
                            }
                        }
                        if (var5 == 634) {
                            class56 var70 = this.field470[var6];
                            if (var70 != null) {
                                this.method71(var70.field1415[0], false, 1, 1, 0, field425.field1416[0], field425.field1415[0], 0, 0, var70.field1416[0], 0, 2);
                                this.field427 = super.field26;
                                this.field428 = super.field27;
                                this.field430 = 2;
                                this.field429 = 0;
                                this.field320.method444(false, 218);
                                this.field320.method480(-24437, var6);
                            }
                        }
                        if (var5 == 275) {
                            class56 var71 = this.field470[var6];
                            if (var71 != null) {
                                this.method71(var71.field1415[0], false, 1, 1, 0, field425.field1416[0], field425.field1415[0], 0, 0, var71.field1416[0], 0, 2);
                                this.field427 = super.field26;
                                this.field428 = super.field27;
                                this.field430 = 2;
                                this.field429 = 0;
                                this.field320.method444(false, 23);
                                this.field320.method480(-24437, var6);
                            }
                        }
                        if (var5 == 388) {
                            this.method110(var3, var6, var4, -734);
                            this.field320.method444(false, 226);
                            this.field320.method479(this.field255 + var3, 8);
                            this.field320.method479(this.field256 + var4, 8);
                            this.field320.method479(var6 >> 14 & 32767, 8);
                        }
                        if (var5 == 109) {
                            boolean var72 = this.method71(var3, false, 0, 0, 0, field425.field1416[0], field425.field1415[0], 0, 0, var4, 0, 2);
                            if (!var72) {
                                this.method71(var3, false, 1, 1, 0, field425.field1416[0], field425.field1415[0], 0, 0, var4, 0, 2);
                            }
                            this.field427 = super.field26;
                            this.field428 = super.field27;
                            this.field430 = 2;
                            this.field429 = 0;
                            this.field320.method444(false, 47);
                            this.field320.method480(-24437, var6);
                            this.field320.method479(this.field256 + var4, 8);
                            this.field320.method481(975, this.field255 + var3);
                        }
                        if (var5 == 735) {
                            class25 var74 = this.field365[var6];
                            if (var74 != null) {
                                this.method71(var74.field1415[0], false, 1, 1, 0, field425.field1416[0], field425.field1415[0], 0, 0, var74.field1416[0], 0, 2);
                                this.field427 = super.field26;
                                this.field428 = super.field27;
                                this.field430 = 2;
                                this.field429 = 0;
                                this.field320.method444(false, 2);
                                this.field320.method446(var6);
                            }
                        }
                        this.field494 = 0;
                        this.field146 = 0;
                        this.field490 = true;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IZI)V")
    public final void method63(int arg0, boolean arg1, int arg2) {
        signlink.midivol = arg0;
        if (arg2 == -22490) {
            if (arg1) {
                signlink.midi = "voladjust";
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LUAWAYCTK;BI)V")
    private final void method64(class55 arg0, byte arg1, int arg2) {
        for (int var4 = 0; var4 < this.field473; ++var4) {
            int var6 = this.field474[var4];
            class56 var7 = this.field470[var6];
            int var8 = arg0.method455();
            if ((var8 & 32) != 0) {
                var8 += arg0.method455() << 8;
            }
            this.method90(var8, var7, var6, arg0, 0);
        }
        if (arg1 == 2) {
            boolean var5 = false;
        } else {
            this.field533 = this.field242.method518();
        }
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(I)V")
    public final void method65(int arg0) {
        byte[] var2 = this.field576.method424("title.dat", (byte[]) null);
        class19 var3 = new class19(var2, this);
        if (arg0 != -23897) {
            this.field519 = -1;
        }
        this.field202.method399(true);
        var3.method230(0, (byte) -76, 0);
        this.field203.method399(true);
        var3.method230(-637, (byte) -76, 0);
        this.field199.method399(true);
        var3.method230(-128, (byte) -76, 0);
        this.field200.method399(true);
        var3.method230(-202, (byte) -76, -371);
        this.field201.method399(true);
        var3.method230(-202, (byte) -76, -171);
        this.field204.method399(true);
        var3.method230(0, (byte) -76, -265);
        this.field205.method399(true);
        var3.method230(-562, (byte) -76, -265);
        this.field206.method399(true);
        var3.method230(-128, (byte) -76, -171);
        this.field207.method399(true);
        var3.method230(-562, (byte) -76, -171);
        int[] var4 = new int[var3.field752];
        for (int var5 = 0; var5 < var3.field753; ++var5) {
            for (int var10 = 0; var10 < var3.field752; ++var10) {
                var4[var10] = var3.field751[var3.field752 * var5 + (var3.field752 - var10 - 1)];
            }
            for (int var11 = 0; var11 < var3.field752; ++var11) {
                var3.field751[var3.field752 * var5 + var11] = var4[var11];
            }
        }
        this.field202.method399(true);
        var3.method230(382, (byte) -76, 0);
        this.field203.method399(true);
        var3.method230(-255, (byte) -76, 0);
        this.field199.method399(true);
        var3.method230(254, (byte) -76, 0);
        this.field200.method399(true);
        var3.method230(180, (byte) -76, -371);
        this.field201.method399(true);
        var3.method230(180, (byte) -76, -171);
        this.field204.method399(true);
        var3.method230(382, (byte) -76, -265);
        this.field205.method399(true);
        var3.method230(-180, (byte) -76, -265);
        this.field206.method399(true);
        var3.method230(254, (byte) -76, -171);
        this.field207.method399(true);
        var3.method230(-180, (byte) -76, -171);
        class19 var6 = new class19(this.field576, "logo", 0);
        this.field199.method399(true);
        var6.method232(382 - var6.field752 / 2 - 128, 18, this.field481);
        Object var7 = null;
        Object var8 = null;
        Object var9 = null;
        System.gc();
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(II)V")
    public final void method66(int arg0, int arg1) {
        class58 var3 = this.field580[this.field548][arg0][arg1];
        if (var3 == null) {
            this.field383.method363(this.field548, arg0, arg1);
        } else {
            int var4 = -99999999;
            class27 var5 = null;
            for (class27 var6 = (class27) var3.method503(); var6 != null; var6 = (class27) var3.method505(false)) {
                class31 var11 = class31.method322(var6.field896);
                int var12 = var11.field1031;
                if (var11.field1046) {
                    var12 = (var6.field897 + 1) * var12;
                }
                if (var12 > var4) {
                    var4 = var12;
                    var5 = var6;
                }
            }
            var3.method501(-728, var5);
            class27 var7 = null;
            class27 var8 = null;
            for (class27 var9 = (class27) var3.method503(); var9 != null; var9 = (class27) var3.method505(false)) {
                if (var5.field896 != var9.field896 && var7 == null) {
                    var7 = var9;
                }
                if (var5.field896 != var9.field896 && var7.field896 != var9.field896 && var8 == null) {
                    var8 = var9;
                }
            }
            int var10 = (arg1 << 7) + arg0 + 1610612736;
            this.field383.method349(arg0, var10, this.method72(arg1 * 128 + 64, arg0 * 128 + 64, this.field548, -964), -46996, arg1, var7, var5, var8, this.field548);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)V")
    public final void method67(String arg0, String arg1, boolean arg2) {
        signlink.errorname = arg0;
        try {
            if (!arg2) {
                this.field240 = "";
                this.field241 = "Connecting to server...";
                this.method56(true, true);
            }
            this.field318 = new class9(this, this.field486, this.method99(field194 + 43594));
            long var4 = class61.method508(arg0);
            int var6 = (int) (var4 >> 16 & 31L);
            this.field320.field1456 = 0;
            this.field320.method445(14);
            this.field320.method445(var6);
            this.field318.method178(0, this.field320.field1455, 2, 0);
            for (int var7 = 0; var7 < 8; ++var7) {
                this.field318.method175();
            }
            int var8 = this.field318.method175();
            int var9 = var8;
            if (var8 == 0) {
                this.field318.method177(this.field363.field1455, 0, 8);
                this.field363.field1456 = 0;
                this.field482 = this.field363.method461((byte) -26);
                int[] var10 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (this.field482 >> 32), (int) this.field482 };
                this.field320.field1456 = 0;
                this.field320.method445(10);
                this.field320.method449(var10[0]);
                this.field320.method449(var10[1]);
                this.field320.method449(var10[2]);
                this.field320.method449(var10[3]);
                this.field320.method449(signlink.uid);
                this.field320.method452(arg0);
                this.field320.method452(arg1);
                this.field320.method470(field415, 8, field344);
                this.field295.field1456 = 0;
                if (arg2) {
                    this.field295.method445(18);
                } else {
                    this.field295.method445(16);
                }
                this.field295.method445(this.field320.field1456 + 36 + 1 + 1 + 2);
                this.field295.method445(255);
                this.field295.method446(333);
                this.field295.method445(field196 ? 1 : 0);
                for (int var11 = 0; var11 < 9; ++var11) {
                    this.field295.method449(this.field177[var11]);
                }
                this.field295.method453(this.field320.field1455, false, 0, this.field320.field1456);
                this.field320.field1460 = new class65(var10, 803);
                for (int var12 = 0; var12 < 4; ++var12) {
                    var10[var12] += 50;
                }
                this.field242 = new class65(var10, 803);
                this.field318.method178(0, this.field295.field1455, this.field295.field1456, 0);
                var8 = this.field318.method175();
            }
            if (var8 == 1) {
                try {
                    Thread.sleep(2000L);
                } catch (Exception var22) {
                }
                this.method67(arg0, arg1, arg2);
            } else if (var8 == 2) {
                this.field123 = this.field318.method175();
                field416 = this.field318.method175() == 1;
                this.field539 = 0L;
                this.field228 = 0;
                this.field192.field1564 = 0;
                super.field16 = true;
                this.field285 = true;
                this.field248 = true;
                this.field320.field1456 = 0;
                this.field363.field1456 = 0;
                this.field519 = -1;
                this.field384 = -1;
                this.field385 = -1;
                this.field386 = -1;
                this.field518 = 0;
                this.field520 = 0;
                this.field530 = 0;
                this.field522 = 0;
                this.field410 = 0;
                this.field131 = 0;
                this.field572 = false;
                super.field17 = 0;
                for (int var13 = 0; var13 < 100; ++var13) {
                    this.field559[var13] = null;
                }
                this.field494 = 0;
                this.field146 = 0;
                this.field443 = 0;
                this.field209 = 0;
                this.field376 = (int) (Math.random() * 100.0D) - 50;
                this.field112 = (int) (Math.random() * 110.0D) - 55;
                this.field345 = (int) (Math.random() * 80.0D) - 40;
                this.field197 = (int) (Math.random() * 120.0D) - 60;
                this.field292 = (int) (Math.random() * 30.0D) - 20;
                this.field120 = (int) (Math.random() * 20.0D) - 10 & 2047;
                this.field549 = 0;
                this.field414 = -1;
                this.field400 = 0;
                this.field401 = 0;
                this.field471 = 0;
                this.field366 = 0;
                for (int var14 = 0; var14 < this.field468; ++var14) {
                    this.field470[var14] = null;
                    this.field475[var14] = null;
                }
                for (int var15 = 0; var15 < 16384; ++var15) {
                    this.field365[var15] = null;
                }
                field425 = this.field470[this.field469] = new class56();
                this.field208.method507();
                this.field450.method507();
                for (int var16 = 0; var16 < 4; ++var16) {
                    for (int var17 = 0; var17 < 104; ++var17) {
                        for (int var18 = 0; var18 < 104; ++var18) {
                            this.field580[var16][var17][var18] = null;
                        }
                    }
                }
                this.field463 = new class58(41824);
                this.field448 = 0;
                this.field447 = 0;
                this.field126 = -1;
                this.field338 = -1;
                this.field299 = -1;
                this.field534 = -1;
                this.field560 = -1;
                this.field337 = -1;
                this.field503 = false;
                this.field125 = 3;
                this.field561 = 0;
                this.field572 = false;
                this.field334 = false;
                this.field382 = null;
                this.field284 = 0;
                this.field269 = -1;
                this.field515 = true;
                this.method146(454);
                for (int var19 = 0; var19 < 5; ++var19) {
                    this.field407[var19] = 0;
                }
                for (int var20 = 0; var20 < 5; ++var20) {
                    this.field129[var20] = null;
                    this.field130[var20] = false;
                }
                field506 = 0;
                field150 = 0;
                field247 = 0;
                field501 = 0;
                field323 = 0;
                field348 = 0;
                field541 = 0;
                field536 = 0;
                field529 = 0;
                field350 = 0;
                this.method168(0);
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
                this.field240 = "Login server rejected session.";
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
                this.field248 = true;
                this.field320.field1456 = 0;
                this.field363.field1456 = 0;
                this.field519 = -1;
                this.field384 = -1;
                this.field385 = -1;
                this.field386 = -1;
                this.field518 = 0;
                this.field520 = 0;
                this.field530 = 0;
                this.field131 = 0;
                this.field572 = false;
                this.field371 = System.currentTimeMillis();
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
                if (var8 == 22) {
                    this.field240 = "Malformed login packet.";
                    this.field241 = "Please try again.";
                } else if (var8 == -1) {
                    if (var9 == 0) {
                        if (this.field487 < 2) {
                            try {
                                Thread.sleep(2000L);
                            } catch (Exception var24) {
                            }
                            ++this.field487;
                            this.method67(arg0, arg1, arg2);
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
                int var21 = this.field318.method175();
                for (int var26 = var21 + 3; var26 >= 0; --var26) {
                    this.field240 = "You have only just left another world";
                    this.field241 = "Your profile will be transferred in: " + var26;
                    this.method56(true, true);
                    try {
                        Thread.sleep(1200L);
                    } catch (Exception var23) {
                    }
                }
                this.method67(arg0, arg1, arg2);
            }
        } catch (IOException var25) {
            this.field240 = "";
            this.field241 = "Error connecting to server.";
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILjava/lang/String;Z)V")
    public final void method13(int arg0, String arg1, boolean arg2) {
        this.field405 = arg0;
        this.field132 = arg1;
        this.method135((byte) 7);
        if (arg2) {
            field535 = this.field242.method518();
        }
        if (this.field576 == null) {
            super.method13(arg0, arg1, false);
        } else {
            this.field201.method399(true);
            short var4 = 360;
            short var5 = 200;
            byte var6 = 20;
            this.field332.method241(var5 / 2 - 26 - var6, var4 / 2, "RuneScape is loading - please wait...", 0, 16777215);
            int var7 = var5 / 2 - 18 - var6;
            class53.method433(var4 / 2 - 152, var7, 304, 9179409, 248, 34);
            class53.method433(var4 / 2 - 151, var7 + 1, 302, 0, 248, 32);
            class53.method432(9179409, var7 + 2, 30, false, var4 / 2 - 150, arg0 * 3);
            class53.method432(0, var7 + 2, 30, false, arg0 * 3 + (var4 / 2 - 150), 300 - arg0 * 3);
            this.field332.method241(var5 / 2 + 5 - var6, var4 / 2, arg1, 0, 16777215);
            this.field201.method400((byte) -122, 171, 202, super.field11);
            if (this.field412) {
                this.field412 = false;
                if (!this.field387) {
                    this.field202.method400((byte) -122, 0, 0, super.field11);
                    this.field203.method400((byte) -122, 0, 637, super.field11);
                }
                this.field199.method400((byte) -122, 0, 128, super.field11);
                this.field200.method400((byte) -122, 371, 202, super.field11);
                this.field204.method400((byte) -122, 265, 0, super.field11);
                this.field205.method400((byte) -122, 265, 562, super.field11);
                this.field206.method400((byte) -122, 171, 128, super.field11);
                this.field207.method400((byte) -122, 171, 562, super.field11);
            }
        }
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(Z)V")
    public final void method68(boolean arg0) {
        if (!arg0) {
            field535 = 282;
        }
        if (this.field549 == 0) {
            if (super.field25 == 1) {
                int var2 = super.field26 - 25 - 550;
                int var3 = super.field27 - 5 - 4;
                if (var2 >= 0 && var3 >= 0 && var2 < 146 && var3 < 151) {
                    var2 -= 73;
                    var3 -= 75;
                    int var4 = this.field197 + this.field120 & 2047;
                    int var5 = class26.field882[var4];
                    int var6 = class26.field883[var4];
                    int var7 = (this.field292 + 256) * var5 >> 8;
                    int var8 = (this.field292 + 256) * var6 >> 8;
                    int var9 = var2 * var8 + var3 * var7 >> 11;
                    int var10 = var3 * var8 - var2 * var7 >> 11;
                    int var11 = field425.field1422 + var9 >> 7;
                    int var12 = field425.field1423 - var10 >> 7;
                    boolean var13 = this.method71(var11, true, 0, 0, 0, field425.field1416[0], field425.field1415[0], 0, 0, var12, 0, 1);
                    if (var13) {
                        this.field320.method445(var2);
                        this.field320.method445(var3);
                        this.field320.method446(this.field120);
                        this.field320.method445(57);
                        this.field320.method445(this.field197);
                        this.field320.method445(this.field292);
                        this.field320.method445(89);
                        this.field320.method446(field425.field1422);
                        this.field320.method446(field425.field1423);
                        this.field320.method445(this.field254);
                        this.field320.method445(63);
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        try {
            System.out.println("RS2 user client - release #" + 333);
            if (arg0.length != 5) {
                System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
            } else {
                field193 = Integer.parseInt(arg0[0]);
                field194 = Integer.parseInt(arg0[1]);
                if (arg0[2].equals("lowmem")) {
                    method153(5);
                } else {
                    if (!arg0[2].equals("highmem")) {
                        System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
                        return;
                    }
                    method95(1652);
                }
                if (arg0[3].equals("free")) {
                    field195 = false;
                } else {
                    if (!arg0[3].equals("members")) {
                        System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
                        return;
                    }
                    field195 = true;
                }
                signlink.storeid = Integer.parseInt(arg0[4]);
                signlink.startpriv(InetAddress.getLocalHost());
                client var1 = new client();
                var1.method1(2, 765, 503);
            }
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(IZ)Ljava/lang/String;")
    public final String method69(int arg0, boolean arg1) {
        if (arg1) {
            this.field580 = null;
        }
        return arg0 < 999999999 ? String.valueOf(arg0) : "*";
    }

    @OriginalMember(owner = "client", name = "h", descriptor = "(I)V")
    public final void method70(int arg0) {
        class4.field64.method208();
        class4.field48.method208();
        class24.field866.method208();
        class31.field1020.method208();
        class31.field1034.method208();
        class56.field1469.method208();
        class43.field1265.method208();
        if (arg0 < 3 || arg0 > 3) {
            this.field320.method445(192);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IZIIIIIIIIII)Z")
    public final boolean method71(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        byte var13 = 104;
        byte var14 = 104;
        for (int var15 = 0; var15 < var13; ++var15) {
            for (int var35 = 0; var35 < var14; ++var35) {
                this.field543[var15][var35] = 0;
                this.field311[var15][var35] = 99999999;
            }
        }
        int var16 = arg6;
        int var17 = arg5;
        this.field543[arg6][arg5] = 99;
        this.field311[arg6][arg5] = 0;
        byte var18 = 0;
        int var19 = 0;
        if (arg10 != 0) {
            this.field519 = this.field363.method455();
        }
        this.field114[var18] = arg6;
        int var36 = var18 + 1;
        this.field115[var18] = arg5;
        boolean var20 = false;
        int var21 = this.field114.length;
        int[][] var22 = this.field445[this.field548].field102;
        while (var36 != var19) {
            var16 = this.field114[var19];
            var17 = this.field115[var19];
            var19 = (var19 + 1) % var21;
            if (arg0 == var16 && arg9 == var17) {
                var20 = true;
                break;
            }
            if (arg7 != 0) {
                if ((arg7 < 5 || arg7 == 10) && this.field445[this.field548].method34(var17, var16, arg9, -406, arg7 - 1, arg0, arg4)) {
                    var20 = true;
                    break;
                }
                if (arg7 < 10 && this.field445[this.field548].method35(arg7 - 1, var17, arg0, var16, 1, arg4, arg9)) {
                    var20 = true;
                    break;
                }
            }
            if (arg2 != 0 && arg3 != 0 && this.field445[this.field548].method36((byte) 9, arg3, arg8, arg0, arg2, var16, var17, arg9)) {
                var20 = true;
                break;
            }
            int var34 = this.field311[var16][var17] + 1;
            if (var16 > 0 && this.field543[var16 - 1][var17] == 0 && (var22[var16 - 1][var17] & 19398920) == 0) {
                this.field114[var36] = var16 - 1;
                this.field115[var36] = var17;
                var36 = (var36 + 1) % var21;
                this.field543[var16 - 1][var17] = 2;
                this.field311[var16 - 1][var17] = var34;
            }
            if (var16 < var13 - 1 && this.field543[var16 + 1][var17] == 0 && (var22[var16 + 1][var17] & 19399040) == 0) {
                this.field114[var36] = var16 + 1;
                this.field115[var36] = var17;
                var36 = (var36 + 1) % var21;
                this.field543[var16 + 1][var17] = 8;
                this.field311[var16 + 1][var17] = var34;
            }
            if (var17 > 0 && this.field543[var16][var17 - 1] == 0 && (var22[var16][var17 - 1] & 19398914) == 0) {
                this.field114[var36] = var16;
                this.field115[var36] = var17 - 1;
                var36 = (var36 + 1) % var21;
                this.field543[var16][var17 - 1] = 1;
                this.field311[var16][var17 - 1] = var34;
            }
            if (var17 < var14 - 1 && this.field543[var16][var17 + 1] == 0 && (var22[var16][var17 + 1] & 19398944) == 0) {
                this.field114[var36] = var16;
                this.field115[var36] = var17 + 1;
                var36 = (var36 + 1) % var21;
                this.field543[var16][var17 + 1] = 4;
                this.field311[var16][var17 + 1] = var34;
            }
            if (var16 > 0 && var17 > 0 && this.field543[var16 - 1][var17 - 1] == 0 && (var22[var16 - 1][var17 - 1] & 19398926) == 0 && (var22[var16 - 1][var17] & 19398920) == 0 && (var22[var16][var17 - 1] & 19398914) == 0) {
                this.field114[var36] = var16 - 1;
                this.field115[var36] = var17 - 1;
                var36 = (var36 + 1) % var21;
                this.field543[var16 - 1][var17 - 1] = 3;
                this.field311[var16 - 1][var17 - 1] = var34;
            }
            if (var16 < var13 - 1 && var17 > 0 && this.field543[var16 + 1][var17 - 1] == 0 && (var22[var16 + 1][var17 - 1] & 19399043) == 0 && (var22[var16 + 1][var17] & 19399040) == 0 && (var22[var16][var17 - 1] & 19398914) == 0) {
                this.field114[var36] = var16 + 1;
                this.field115[var36] = var17 - 1;
                var36 = (var36 + 1) % var21;
                this.field543[var16 + 1][var17 - 1] = 9;
                this.field311[var16 + 1][var17 - 1] = var34;
            }
            if (var16 > 0 && var17 < var14 - 1 && this.field543[var16 - 1][var17 + 1] == 0 && (var22[var16 - 1][var17 + 1] & 19398968) == 0 && (var22[var16 - 1][var17] & 19398920) == 0 && (var22[var16][var17 + 1] & 19398944) == 0) {
                this.field114[var36] = var16 - 1;
                this.field115[var36] = var17 + 1;
                var36 = (var36 + 1) % var21;
                this.field543[var16 - 1][var17 + 1] = 6;
                this.field311[var16 - 1][var17 + 1] = var34;
            }
            if (var16 < var13 - 1 && var17 < var14 - 1 && this.field543[var16 + 1][var17 + 1] == 0 && (var22[var16 + 1][var17 + 1] & 19399136) == 0 && (var22[var16 + 1][var17] & 19399040) == 0 && (var22[var16][var17 + 1] & 19398944) == 0) {
                this.field114[var36] = var16 + 1;
                this.field115[var36] = var17 + 1;
                var36 = (var36 + 1) % var21;
                this.field543[var16 + 1][var17 + 1] = 12;
                this.field311[var16 + 1][var17 + 1] = var34;
            }
        }
        this.field254 = 0;
        if (!var20) {
            if (arg1) {
                int var23 = 100;
                for (int var24 = 1; var24 < 2; ++var24) {
                    for (int var25 = arg0 - var24; var25 <= arg0 + var24; ++var25) {
                        for (int var26 = arg9 - var24; var26 <= arg9 + var24; ++var26) {
                            if (var25 >= 0 && var26 >= 0 && var25 < 104 && var26 < 104 && this.field311[var25][var26] < var23) {
                                var23 = this.field311[var25][var26];
                                var16 = var25;
                                var17 = var26;
                                this.field254 = 1;
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
        this.field114[var27] = var16;
        int var37 = var27 + 1;
        this.field115[var27] = var17;
        int var28;
        int var29 = var28 = this.field543[var16][var17];
        while (arg6 != var16 || arg5 != var17) {
            if (var28 != var29) {
                var28 = var29;
                this.field114[var37] = var16;
                this.field115[var37++] = var17;
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
            var29 = this.field543[var16][var17];
        }
        if (var37 <= 0) {
            if (arg11 == 1) {
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
            int var31 = this.field114[var37];
            int var32 = this.field115[var37];
            if (arg11 == 0) {
                this.field320.method444(false, 115);
                this.field320.method445(var30 + var30 + 3);
            }
            if (arg11 == 1) {
                this.field320.method444(false, 16);
                this.field320.method445(var30 + var30 + 3 + 14);
            }
            if (arg11 == 2) {
                this.field320.method444(false, 251);
                this.field320.method445(var30 + var30 + 3);
            }
            this.field320.method472(super.field29[5] == 1 ? 1 : 0, this.field294);
            this.field320.method446(this.field255 + var31);
            this.field400 = this.field114[0];
            this.field401 = this.field115[0];
            for (int var33 = 1; var33 < var30; ++var33) {
                --var37;
                this.field320.method472(this.field114[var37] - var31, this.field294);
                this.field320.method472(this.field115[var37] - var32, this.field294);
            }
            this.field320.method480(-24437, this.field256 + var32);
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIII)I")
    public final int method72(int arg0, int arg1, int arg2, int arg3) {
        int var5 = arg1 >> 7;
        int var6 = arg0 >> 7;
        if (var5 >= 0 && var6 >= 0 && var5 <= 103 && var6 <= 103) {
            int var7 = arg2;
            if (arg2 < 3 && (this.field531[1][var5][var6] & 2) == 2) {
                var7 = arg2 + 1;
            }
            int var8 = arg1 & 127;
            int var9 = arg0 & 127;
            if (arg3 >= 0) {
                this.method6();
            }
            int var10 = (128 - var8) * this.field360[var7][var5][var6] + this.field360[var7][var5 + 1][var6] * var8 >> 7;
            int var11 = (128 - var8) * this.field360[var7][var5][var6 + 1] + this.field360[var7][var5 + 1][var6 + 1] * var8 >> 7;
            return (128 - var9) * var10 + var9 * var11 >> 7;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client", name = "i", descriptor = "(I)V")
    public final void method73(int arg0) {
        int var2 = 98 / arg0;
        if (super.field25 == 1) {
            if (super.field26 >= 539 && super.field26 <= 573 && super.field27 >= 169 && super.field27 < 205 && this.field418[0] != -1) {
                this.field490 = true;
                this.field125 = 0;
                this.field455 = true;
            }
            if (super.field26 >= 569 && super.field26 <= 599 && super.field27 >= 168 && super.field27 < 205 && this.field418[1] != -1) {
                this.field490 = true;
                this.field125 = 1;
                this.field455 = true;
            }
            if (super.field26 >= 597 && super.field26 <= 627 && super.field27 >= 168 && super.field27 < 205 && this.field418[2] != -1) {
                this.field490 = true;
                this.field125 = 2;
                this.field455 = true;
            }
            if (super.field26 >= 625 && super.field26 <= 669 && super.field27 >= 168 && super.field27 < 203 && this.field418[3] != -1) {
                this.field490 = true;
                this.field125 = 3;
                this.field455 = true;
            }
            if (super.field26 >= 666 && super.field26 <= 696 && super.field27 >= 168 && super.field27 < 205 && this.field418[4] != -1) {
                this.field490 = true;
                this.field125 = 4;
                this.field455 = true;
            }
            if (super.field26 >= 694 && super.field26 <= 724 && super.field27 >= 168 && super.field27 < 205 && this.field418[5] != -1) {
                this.field490 = true;
                this.field125 = 5;
                this.field455 = true;
            }
            if (super.field26 >= 722 && super.field26 <= 756 && super.field27 >= 169 && super.field27 < 205 && this.field418[6] != -1) {
                this.field490 = true;
                this.field125 = 6;
                this.field455 = true;
            }
            if (super.field26 >= 540 && super.field26 <= 574 && super.field27 >= 466 && super.field27 < 502 && this.field418[7] != -1) {
                this.field490 = true;
                this.field125 = 7;
                this.field455 = true;
            }
            if (super.field26 >= 572 && super.field26 <= 602 && super.field27 >= 466 && super.field27 < 503 && this.field418[8] != -1) {
                this.field490 = true;
                this.field125 = 8;
                this.field455 = true;
            }
            if (super.field26 >= 599 && super.field26 <= 629 && super.field27 >= 466 && super.field27 < 503 && this.field418[9] != -1) {
                this.field490 = true;
                this.field125 = 9;
                this.field455 = true;
            }
            if (super.field26 >= 627 && super.field26 <= 671 && super.field27 >= 467 && super.field27 < 502 && this.field418[10] != -1) {
                this.field490 = true;
                this.field125 = 10;
                this.field455 = true;
            }
            if (super.field26 >= 669 && super.field26 <= 699 && super.field27 >= 466 && super.field27 < 503 && this.field418[11] != -1) {
                this.field490 = true;
                this.field125 = 11;
                this.field455 = true;
            }
            if (super.field26 >= 696 && super.field26 <= 726 && super.field27 >= 466 && super.field27 < 503 && this.field418[12] != -1) {
                this.field490 = true;
                this.field125 = 12;
                this.field455 = true;
            }
            if (super.field26 >= 724 && super.field26 <= 758 && super.field27 >= 466 && super.field27 < 502 && this.field418[13] != -1) {
                this.field490 = true;
                this.field125 = 13;
                this.field455 = true;
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(B)V")
    public final void method74(byte arg0) {
        int var2 = this.field332.method243("Choose Option", true);
        for (int var3 = 0; var3 < this.field131; ++var3) {
            int var11 = this.field332.method243(this.field305[var3], true);
            if (var11 > var2) {
                var2 = var11;
            }
        }
        var2 += 8;
        int var4 = this.field131 * 15 + 21;
        if (arg0 == -83) {
            if (super.field26 > 4 && super.field27 > 4 && super.field26 < 516 && super.field27 < 338) {
                int var5 = super.field26 - 4 - var2 / 2;
                if (var2 + var5 > 512) {
                    var5 = 512 - var2;
                }
                if (var5 < 0) {
                    var5 = 0;
                }
                int var6 = super.field27 - 4;
                if (var4 + var6 > 334) {
                    var6 = 334 - var4;
                }
                if (var6 < 0) {
                    var6 = 0;
                }
                this.field572 = true;
                this.field438 = 0;
                this.field439 = var5;
                this.field440 = var6;
                this.field441 = var2;
                this.field442 = this.field131 * 15 + 22;
            }
            if (super.field26 > 553 && super.field27 > 205 && super.field26 < 743 && super.field27 < 466) {
                int var7 = super.field26 - 553 - var2 / 2;
                if (var7 < 0) {
                    var7 = 0;
                } else if (var2 + var7 > 190) {
                    var7 = 190 - var2;
                }
                int var8 = super.field27 - 205;
                if (var8 < 0) {
                    var8 = 0;
                } else if (var4 + var8 > 261) {
                    var8 = 261 - var4;
                }
                this.field572 = true;
                this.field438 = 1;
                this.field439 = var7;
                this.field440 = var8;
                this.field441 = var2;
                this.field442 = this.field131 * 15 + 22;
            }
            if (super.field26 > 17 && super.field27 > 357 && super.field26 < 496 && super.field27 < 453) {
                int var9 = super.field26 - 17 - var2 / 2;
                if (var9 < 0) {
                    var9 = 0;
                } else if (var2 + var9 > 479) {
                    var9 = 479 - var2;
                }
                int var10 = super.field27 - 357;
                if (var10 < 0) {
                    var10 = 0;
                } else if (var4 + var10 > 96) {
                    var10 = 96 - var4;
                }
                this.field572 = true;
                this.field438 = 2;
                this.field439 = var9;
                this.field440 = var10;
                this.field441 = var2;
                this.field442 = this.field131 * 15 + 22;
            }
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(II)V")
    public final void method75(int arg0, int arg1) {
        if (arg0 >= 0) {
            for (int var3 = 1; var3 > 0; ++var3) {
            }
        }
        int[] var4 = this.field402.field751;
        int var5 = var4.length;
        for (int var6 = 0; var6 < var5; ++var6) {
            var4[var6] = 0;
        }
        for (int var7 = 1; var7 < 103; ++var7) {
            int var25 = (103 - var7) * 512 * 4 + 24628;
            for (int var26 = 1; var26 < 103; ++var26) {
                if ((this.field531[arg1][var26][var7] & 24) == 0) {
                    this.field383.method377(var4, var25, 512, arg1, var26, var7);
                }
                if (arg1 < 3 && (this.field531[arg1 + 1][var26][var7] & 8) != 0) {
                    this.field383.method377(var4, var25, 512, arg1 + 1, var26, var7);
                }
                var25 += 4;
            }
        }
        ++field431;
        if (field431 > 58) {
            field431 = 0;
            this.field320.method444(false, 79);
        }
        int var8 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var9 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        this.field402.method227(true);
        for (int var10 = 1; var10 < 103; ++var10) {
            for (int var24 = 1; var24 < 103; ++var24) {
                if ((this.field531[arg1][var24][var10] & 24) == 0) {
                    this.method126(var9, var10, arg1, 1, var8, var24);
                }
                if (arg1 < 3 && (this.field531[arg1 + 1][var24][var10] & 8) != 0) {
                    this.method126(var9, var10, arg1 + 1, 1, var8, var24);
                }
            }
        }
        this.field510.method399(true);
        ++field426;
        if (field426 > 1279) {
            field426 = 0;
            this.field320.method444(false, 93);
            this.field320.method445(0);
            int var11 = this.field320.field1456;
            this.field320.method446((int) (Math.random() * 65536.0D));
            this.field320.method445(5);
            this.field320.method446((int) (Math.random() * 65536.0D));
            if ((int) (Math.random() * 2.0D) == 0) {
                this.field320.method445(190);
            }
            this.field320.method446((int) (Math.random() * 65536.0D));
            if ((int) (Math.random() * 2.0D) == 0) {
                this.field320.method445(224);
            }
            this.field320.method445(142);
            this.field320.method445((int) (Math.random() * 256.0D));
            this.field320.method445((int) (Math.random() * 256.0D));
            this.field320.method446((int) (Math.random() * 65536.0D));
            this.field320.method454(this.field320.field1456 - var11, 36772);
        }
        this.field288 = 0;
        for (int var12 = 0; var12 < 104; ++var12) {
            for (int var13 = 0; var13 < 104; ++var13) {
                int var14 = this.field383.method371(this.field548, var12, var13);
                if (var14 != 0) {
                    int var15 = var14 >> 14 & 32767;
                    int var16 = class4.method24(var15).field52;
                    if (var16 >= 0) {
                        int var17 = var12;
                        int var18 = var13;
                        if (var16 != 22 && var16 != 29 && var16 != 34 && var16 != 36 && var16 != 46 && var16 != 47 && var16 != 48) {
                            byte var19 = 104;
                            byte var20 = 104;
                            int[][] var21 = this.field445[this.field548].field102;
                            for (int var22 = 0; var22 < 10; ++var22) {
                                int var23 = (int) (Math.random() * 4.0D);
                                if (var23 == 0 && var17 > 0 && var17 > var12 - 3 && (var21[var17 - 1][var18] & 19398920) == 0) {
                                    --var17;
                                }
                                if (var23 == 1 && var17 < var19 - 1 && var17 < var12 + 3 && (var21[var17 + 1][var18] & 19399040) == 0) {
                                    ++var17;
                                }
                                if (var23 == 2 && var18 > 0 && var18 > var13 - 3 && (var21[var17][var18 - 1] & 19398914) == 0) {
                                    --var18;
                                }
                                if (var23 == 3 && var18 < var20 - 1 && var18 < var13 + 3 && (var21[var17][var18 + 1] & 19398944) == 0) {
                                    ++var18;
                                }
                            }
                        }
                        this.field108[this.field288] = this.field505[var16];
                        this.field289[this.field288] = var17;
                        this.field290[this.field288] = var18;
                        ++this.field288;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(Z)V")
    public final void method76(boolean arg0) {
        if (this.field214 != 0) {
            int var2 = 0;
            if (this.field530 != 0) {
                var2 = 1;
            }
            for (int var3 = 0; var3 < 100; ++var3) {
                if (this.field559[var3] != null) {
                    int var4 = this.field557[var3];
                    String var5 = this.field558[var3];
                    boolean var6 = false;
                    if (var5 != null && var5.startsWith("@cr1@")) {
                        var5 = var5.substring(5);
                        boolean var7 = true;
                    }
                    if (var5 != null && var5.startsWith("@cr2@")) {
                        var5 = var5.substring(5);
                        boolean var8 = true;
                    }
                    if ((var4 == 3 || var4 == 7) && (var4 == 7 || this.field354 == 0 || this.field354 == 1 && this.method79(var5, 9))) {
                        int var9 = 329 - var2 * 13;
                        if (super.field19 > 4 && super.field20 - 4 > var9 - 10 && super.field20 - 4 <= var9 + 3) {
                            int var10 = this.field331.method243("From:  " + var5 + this.field559[var3], true) + 25;
                            if (var10 > 450) {
                                var10 = 450;
                            }
                            if (super.field19 < var10 + 4) {
                                if (this.field123 >= 1) {
                                    this.field305[this.field131] = "Report abuse @whi@" + var5;
                                    this.field251[this.field131] = 2194;
                                    ++this.field131;
                                }
                                this.field305[this.field131] = "Add ignore @whi@" + var5;
                                this.field251[this.field131] = 2157;
                                ++this.field131;
                                this.field305[this.field131] = "Add friend @whi@" + var5;
                                this.field251[this.field131] = 2761;
                                ++this.field131;
                            }
                        }
                        ++var2;
                        if (var2 >= 5) {
                            return;
                        }
                    }
                    if ((var4 == 5 || var4 == 6) && this.field354 < 2) {
                        ++var2;
                        if (var2 >= 5) {
                            return;
                        }
                    }
                }
            }
            if (arg0) {
                this.field320.method445(145);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZI)V")
    public final void method77(boolean arg0, int arg1) {
        if (field425.field1422 >> 7 == this.field400 && field425.field1423 >> 7 == this.field401) {
            this.field400 = 0;
        }
        int var3 = this.field471;
        if (arg1 < 1 || arg1 > 1) {
            this.field320.method445(45);
        }
        if (arg0) {
            var3 = 1;
        }
        for (int var4 = 0; var4 < var3; ++var4) {
            class56 var5;
            int var6;
            if (arg0) {
                var5 = field425;
                var6 = this.field469 << 14;
            } else {
                var5 = this.field470[this.field472[var4]];
                var6 = this.field472[var4] << 14;
            }
            if (var5 != null && var5.method287(false)) {
                var5.field1486 = false;
                if ((field196 && this.field471 > 50 || this.field471 > 200) && !arg0 && var5.field1425 == var5.field1407) {
                    var5.field1486 = true;
                }
                int var7 = var5.field1422 >> 7;
                int var8 = var5.field1423 >> 7;
                if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                    if (var5.field1485 != null && field347 >= var5.field1489 && field347 < var5.field1490) {
                        var5.field1486 = false;
                        var5.field1472 = this.method72(var5.field1423, var5.field1422, this.field548, -964);
                        this.field383.method354(var5.field1423, var6, var5.field1493, var5.field1494, 60, 0, this.field548, var5.field1492, var5, var5.field1424, var5.field1491, var5.field1422, var5.field1472);
                    } else {
                        if ((var5.field1422 & 127) == 64 && (var5.field1423 & 127) == 64) {
                            if (this.field538[var7][var8] == this.field329) {
                                continue;
                            }
                            this.field538[var7][var8] = this.field329;
                        }
                        var5.field1472 = this.method72(var5.field1423, var5.field1422, this.field548, -964);
                        this.field383.method353(60, var5.field1422, var5.field1424, var6, 8, var5.field1472, this.field548, var5.field1423, var5, var5.field1421);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "h", descriptor = "(Z)V")
    public final void method78(boolean arg0) {
        try {
            if (this.field318 != null) {
                this.field318.method174();
            }
        } catch (Exception var3) {
        }
        this.field318 = null;
        this.field248 = false;
        this.field238 = 0;
        if (!arg0) {
            this.field320.method445(40);
        }
        this.field357 = "";
        this.field358 = "";
        this.method70(this.field406);
        this.field383.method342(false);
        for (int var2 = 0; var2 < 4; ++var2) {
            this.field445[var2].method25();
        }
        System.gc();
        this.method123(0);
        this.field476 = -1;
        this.field369 = -1;
        this.field210 = 0;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;I)Z")
    public final boolean method79(String arg0, int arg1) {
        if (arg1 < 9 || arg1 > 9) {
            this.field483 = 199;
        }
        if (arg0 == null) {
            return false;
        } else {
            for (int var3 = 0; var3 < this.field447; ++var3) {
                if (arg0.equalsIgnoreCase(this.field581[var3])) {
                    return true;
                }
            }
            return arg0.equalsIgnoreCase(field425.field1488);
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(IZ)Ljava/lang/String;")
    private static final String method80(int arg0, boolean arg1) {
        if (arg1) {
            field259 = -468;
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

    @OriginalMember(owner = "client", name = "b", descriptor = "(III)Ljava/lang/String;")
    public static final String method81(int arg0, int arg1, int arg2) {
        while (arg1 >= 0) {
            for (int var4 = 1; var4 > 0; ++var4) {
            }
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
        } else if (var3 > 0) {
            return "@gr1@";
        } else {
            return "@yel@";
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IBLUAWAYCTK;)V")
    private final void method82(int arg0, byte arg1, class55 arg2) {
        arg2.method465(true);
        int var4 = arg2.method466(5, 1);
        if (arg1 != -90) {
            this.method6();
        }
        if (var4 != 0) {
            int var5 = arg2.method466(5, 2);
            if (var5 == 0) {
                this.field474[this.field473++] = this.field469;
            } else if (var5 == 1) {
                int var6 = arg2.method466(5, 3);
                field425.method439(12, false, var6);
                int var7 = arg2.method466(5, 1);
                if (var7 == 1) {
                    this.field474[this.field473++] = this.field469;
                }
            } else if (var5 == 2) {
                int var8 = arg2.method466(5, 3);
                field425.method439(12, true, var8);
                int var9 = arg2.method466(5, 3);
                field425.method439(12, true, var9);
                int var10 = arg2.method466(5, 1);
                if (var10 == 1) {
                    this.field474[this.field473++] = this.field469;
                }
            } else if (var5 == 3) {
                int var11 = arg2.method466(5, 1);
                this.field548 = arg2.method466(5, 2);
                int var12 = arg2.method466(5, 7);
                int var13 = arg2.method466(5, 1);
                if (var13 == 1) {
                    this.field474[this.field473++] = this.field469;
                }
                int var14 = arg2.method466(5, 7);
                field425.method441(var14, var11 == 1, var12, true);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BLXHDQQNIR;)V")
    public final void method83(byte arg0, class68 arg1) {
        short var3 = 256;
        for (int var4 = 0; var4 < this.field372.length; ++var4) {
            this.field372[var4] = 0;
        }
        for (int var5 = 0; var5 < 5000; ++var5) {
            int var18 = (int) (Math.random() * 128.0D * (double) var3);
            this.field372[var18] = (int) (Math.random() * 256.0D);
        }
        if (arg0 != 0) {
            for (int var6 = 1; var6 > 0; ++var6) {
            }
        }
        for (int var7 = 0; var7 < 20; ++var7) {
            for (int var14 = 1; var14 < var3 - 1; ++var14) {
                for (int var16 = 1; var16 < 127; ++var16) {
                    int var17 = (var14 << 7) + var16;
                    this.field373[var17] = (this.field372[var17 - 1] + this.field372[var17 + 1] + this.field372[var17 - 128] + this.field372[var17 + 128]) / 4;
                }
            }
            int[] var15 = this.field372;
            this.field372 = this.field373;
            this.field373 = var15;
        }
        if (arg1 != null) {
            int var8 = 0;
            for (int var9 = 0; var9 < arg1.field1678; ++var9) {
                for (int var10 = 0; var10 < arg1.field1677; ++var10) {
                    if (arg1.field1675[var8++] != 0) {
                        int var11 = var10 + 16 + arg1.field1679;
                        int var12 = var9 + 16 + arg1.field1680;
                        int var13 = (var12 << 7) + var11;
                        this.field372[var13] = 0;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(Z)V")
    public final void method7(boolean arg0) {
        this.field248 &= arg0;
        if (!this.field413 && !this.field546 && !this.field507) {
            ++field347;
            if (!this.field248) {
                this.method132(3);
            } else {
                this.method144(-182);
            }
            this.method166(-17023);
        }
    }

    @OriginalMember(owner = "client", name = "j", descriptor = "(I)V")
    public final void method84(int arg0) {
        if (arg0 >= 0) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        if (field196 && this.field443 == 2 && class22.field812 != this.field548) {
            this.field510.method399(true);
            this.field331.method241(151, 257, "Loading - please wait.", 0, 0);
            this.field331.method241(150, 256, "Loading - please wait.", 0, 16777215);
            this.field510.method400((byte) -122, 4, 4, super.field11);
            this.field443 = 1;
            this.field371 = System.currentTimeMillis();
        }
        if (this.field443 == 1) {
            int var3 = this.method85(true);
            if (var3 != 0 && System.currentTimeMillis() - this.field371 > 360000L) {
                signlink.reporterror(this.field357 + " glcfb " + this.field482 + "," + var3 + "," + field196 + "," + this.field434[0] + "," + this.field491.method204() + "," + this.field548 + "," + this.field555 + "," + this.field556);
                this.field371 = System.currentTimeMillis();
            }
        }
        if (this.field443 == 2 && this.field548 != this.field414) {
            this.field414 = this.field548;
            this.method75(-363, this.field548);
        }
    }

    @OriginalMember(owner = "client", name = "i", descriptor = "(Z)I")
    public final int method85(boolean arg0) {
        for (int var2 = 0; var2 < this.field163.length; ++var2) {
            if (this.field163[var2] == null && this.field273[var2] != -1) {
                return -1;
            }
            if (this.field504[var2] == null && this.field274[var2] != -1) {
                return -2;
            }
        }
        if (!arg0) {
            this.field481 = this.field242.method518();
        }
        boolean var3 = true;
        for (int var4 = 0; var4 < this.field163.length; ++var4) {
            byte[] var5 = this.field504[var4];
            if (var5 != null) {
                int var6 = (this.field272[var4] >> 8) * 64 - this.field255;
                int var7 = (this.field272[var4] & 255) * 64 - this.field256;
                if (this.field499) {
                    var6 = 10;
                    var7 = 10;
                }
                var3 &= class22.method270(var6, (byte) -32, var5, var7);
            }
        }
        if (!var3) {
            return -3;
        } else if (this.field277) {
            return -4;
        } else {
            this.field443 = 2;
            class22.field812 = this.field548;
            this.method160((byte) 7);
            this.field320.method444(false, 14);
            return 0;
        }
    }

    @OriginalMember(owner = "client", name = "j", descriptor = "(Z)V")
    public final void method86(boolean arg0) {
        if (arg0) {
            this.field320.method445(244);
        }
        this.field511.method399(true);
        class26.field884 = this.field456;
        this.field316.method555(0, 0, this.field481);
        if (this.field334) {
            this.field332.method241(40, 239, this.field300, 0, 0);
            this.field332.method241(60, 239, this.field179 + "*", 0, 128);
        } else if (this.field561 == 1) {
            this.field332.method241(40, 239, "Enter amount:", 0, 0);
            this.field332.method241(60, 239, this.field339 + "*", 0, 128);
        } else if (this.field561 == 2) {
            this.field332.method241(40, 239, "Enter name:", 0, 0);
            this.field332.method241(60, 239, this.field339 + "*", 0, 128);
        } else if (this.field382 != null) {
            this.field332.method241(40, 239, this.field382, 0, 0);
            this.field332.method241(60, 239, "Click to continue", 0, 128);
        } else if (this.field338 != -1) {
            this.method130(0, 0, class29.field963[this.field338], (byte) 67, 0);
        } else if (this.field126 != -1) {
            this.method130(0, 0, class29.field963[this.field126], (byte) 67, 0);
        } else {
            class20 var2 = this.field331;
            int var3 = 0;
            class53.method429(0, 463, 77, 0, (byte) -121);
            for (int var4 = 0; var4 < 100; ++var4) {
                if (this.field559[var4] != null) {
                    int var6 = this.field557[var4];
                    int var7 = 70 - var3 * 14 + this.field397;
                    String var8 = this.field558[var4];
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
                            var2.method245(0, 4, var7, this.field559[var4], (byte) 2);
                        }
                        ++var3;
                    }
                    if ((var6 == 1 || var6 == 2) && (var6 == 1 || this.field571 == 0 || this.field571 == 1 && this.method79(var8, 9))) {
                        if (var7 > 0 && var7 < 110) {
                            int var10 = 4;
                            if (var9 == 1) {
                                this.field500[0].method555(var10, var7 - 12, this.field481);
                                var10 += 14;
                            }
                            if (var9 == 2) {
                                this.field500[1].method555(var10, var7 - 12, this.field481);
                                var10 += 14;
                            }
                            var2.method245(0, var10, var7, var8 + ":", (byte) 2);
                            int var11 = var10 + var2.method243(var8, true) + 8;
                            var2.method245(255, var11, var7, this.field559[var4], (byte) 2);
                        }
                        ++var3;
                    }
                    if ((var6 == 3 || var6 == 7) && this.field214 == 0 && (var6 == 7 || this.field354 == 0 || this.field354 == 1 && this.method79(var8, 9))) {
                        if (var7 > 0 && var7 < 110) {
                            byte var12 = 4;
                            var2.method245(0, var12, var7, "From", (byte) 2);
                            int var13 = var12 + var2.method243("From ", true);
                            if (var9 == 1) {
                                this.field500[0].method555(var13, var7 - 12, this.field481);
                                var13 += 14;
                            }
                            if (var9 == 2) {
                                this.field500[1].method555(var13, var7 - 12, this.field481);
                                var13 += 14;
                            }
                            var2.method245(0, var13, var7, var8 + ":", (byte) 2);
                            int var14 = var13 + var2.method243(var8, true) + 8;
                            var2.method245(8388608, var14, var7, this.field559[var4], (byte) 2);
                        }
                        ++var3;
                    }
                    if (var6 == 4 && (this.field516 == 0 || this.field516 == 1 && this.method79(var8, 9))) {
                        if (var7 > 0 && var7 < 110) {
                            var2.method245(8388736, 4, var7, var8 + " " + this.field559[var4], (byte) 2);
                        }
                        ++var3;
                    }
                    if (var6 == 5 && this.field214 == 0 && this.field354 < 2) {
                        if (var7 > 0 && var7 < 110) {
                            var2.method245(8388608, 4, var7, this.field559[var4], (byte) 2);
                        }
                        ++var3;
                    }
                    if (var6 == 6 && this.field214 == 0 && this.field354 < 2) {
                        if (var7 > 0 && var7 < 110) {
                            var2.method245(0, 4, var7, "To " + var8 + ":", (byte) 2);
                            var2.method245(8388608, 12 + var2.method243("To " + var8, true), var7, this.field559[var4], (byte) 2);
                        }
                        ++var3;
                    }
                    if (var6 == 8 && (this.field516 == 0 || this.field516 == 1 && this.method79(var8, 9))) {
                        if (var7 > 0 && var7 < 110) {
                            var2.method245(8270336, 4, var7, var8 + " " + this.field559[var4], (byte) 2);
                        }
                        ++var3;
                    }
                }
            }
            class53.method428(-237);
            this.field181 = var3 * 14 + 7;
            if (this.field181 < 78) {
                this.field181 = 78;
            }
            this.method155(this.field181, 77, 0, 7, 463, this.field181 - this.field397 - 77);
            String var5;
            if (field425 != null && field425.field1488 != null) {
                var5 = field425.field1488;
            } else {
                var5 = class61.method512(false, this.field357);
            }
            var2.method245(0, 4, 90, var5 + ":", (byte) 2);
            var2.method245(255, 6 + var2.method243(var5 + ": ", true), 90, this.field388 + "*", (byte) 2);
            class53.method435((byte) 1, 77, 479, 0, 0);
        }
        if (this.field572 && this.field438 == 2) {
            this.method89(this.field127);
        }
        this.field511.method400((byte) -122, 357, 17, super.field11);
        this.field510.method399(true);
        class26.field884 = this.field458;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LUAWAYCTK;II)V")
    private final void method87(class55 arg0, int arg1, int arg2) {
        if (this.field151 != arg2) {
            this.field245 = 386;
        }
        while (arg0.field1457 + 10 < arg1 * 8) {
            int var4 = arg0.method466(5, 11);
            if (var4 == 2047) {
                break;
            }
            if (this.field470[var4] == null) {
                this.field470[var4] = new class56();
                if (this.field475[var4] != null) {
                    this.field470[var4].method496(this.field276, this.field475[var4]);
                }
            }
            this.field472[this.field471++] = var4;
            class56 var5 = this.field470[var4];
            var5.field1432 = field347;
            int var6 = arg0.method466(5, 5);
            if (var6 > 15) {
                var6 -= 32;
            }
            int var7 = arg0.method466(5, 1);
            if (var7 == 1) {
                this.field474[this.field473++] = var4;
            }
            int var8 = arg0.method466(5, 1);
            int var9 = arg0.method466(5, 5);
            if (var9 > 15) {
                var9 -= 32;
            }
            var5.method441(field425.field1416[0] + var9, var8 == 1, field425.field1415[0] + var6, true);
        }
        arg0.method467(false);
    }

    @OriginalMember(owner = "client", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        return signlink.mainapp != null ? signlink.mainapp.getParameter(arg0) : super.getParameter(arg0);
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Z[BB)V")
    public final void method88(boolean arg0, byte[] arg1, byte arg2) {
        if (this.field532) {
            signlink.midifade = arg0 ? 1 : 0;
            signlink.midisave(arg1, arg1.length);
            if (arg2 == -101) {
                ;
            }
        }
    }

    @OriginalMember(owner = "client", name = "k", descriptor = "(I)V")
    public final void method89(int arg0) {
        int var2 = this.field439;
        int var3 = this.field440;
        int var4 = this.field441;
        int var5 = this.field442;
        int var6 = 6116423;
        class53.method432(var6, var3, var5, false, var2, var4);
        class53.method432(0, var3 + 1, 16, false, var2 + 1, var4 - 2);
        class53.method433(var2 + 1, var3 + 18, var4 - 2, 0, 248, var5 - 19);
        this.field332.method245(var6, var2 + 3, var3 + 14, "Choose Option", (byte) 2);
        int var7 = super.field19;
        int var8 = super.field20;
        while (arg0 >= 0) {
            this.field398 = -104;
        }
        if (this.field438 == 0) {
            var7 -= 4;
            var8 -= 4;
        }
        if (this.field438 == 1) {
            var7 -= 553;
            var8 -= 205;
        }
        if (this.field438 == 2) {
            var7 -= 17;
            var8 -= 357;
        }
        for (int var9 = 0; var9 < this.field131; ++var9) {
            int var10 = (this.field131 - 1 - var9) * 15 + var3 + 31;
            int var11 = 16777215;
            if (var7 > var2 && var7 < var2 + var4 && var8 > var10 - 13 && var8 < var10 + 3) {
                var11 = 16776960;
            }
            this.field332.method249(true, 7, this.field305[var9], var11, var2 + 3, var10);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILUFGXOLGK;ILUAWAYCTK;I)V")
    private final void method90(int arg0, class56 arg1, int arg2, class55 arg3, int arg4) {
        this.field518 += arg4;
        if ((arg0 & 512) != 0) {
            arg1.field1396 = arg3.method457();
            int var6 = arg3.method489(false);
            arg1.field1400 = var6 >> 16;
            arg1.field1399 = (var6 & 65535) + field347;
            arg1.field1397 = 0;
            arg1.field1398 = 0;
            if (arg1.field1399 > field347) {
                arg1.field1397 = -1;
            }
            if (arg1.field1396 == 65535) {
                arg1.field1396 = -1;
            }
        }
        if ((arg0 & 1024) != 0) {
            arg1.field1388 = arg3.method455();
            arg1.field1390 = arg3.method475((byte) 16);
            arg1.field1389 = arg3.method474((byte) 1);
            arg1.field1391 = arg3.method475((byte) 16);
            arg1.field1392 = arg3.method483(17702) + field347;
            arg1.field1393 = arg3.method484(false) + field347;
            arg1.field1394 = arg3.method475((byte) 16);
            arg1.method440((byte) 126);
        }
        if ((arg0 & 16) != 0) {
            arg1.field1429 = arg3.method484(false);
            if (arg1.field1429 == 65535) {
                arg1.field1429 = -1;
            }
        }
        if ((arg0 & 1) != 0) {
            int var7 = arg3.method483(17702);
            int var8 = arg3.method474((byte) 1);
            int var9 = arg3.method474((byte) 1);
            int var10 = arg3.field1456;
            if (arg1.field1488 != null && arg1.field1473) {
                long var11 = class61.method508(arg1.field1488);
                boolean var13 = false;
                if (var8 <= 1) {
                    for (int var14 = 0; var14 < this.field253; ++var14) {
                        if (this.field399[var14] == var11) {
                            var13 = true;
                            break;
                        }
                    }
                }
                if (!var13 && this.field478 == 0) {
                    try {
                        this.field364.field1456 = 0;
                        arg3.method494(var9, this.field364.field1455, 0, -746);
                        this.field364.field1456 = 0;
                        String var15 = class6.method37(this.field364, 0, var9);
                        String var16 = class72.method567(76, var15);
                        arg1.field1419 = var16;
                        arg1.field1401 = var7 >> 8;
                        arg1.field1403 = var7 & 255;
                        arg1.field1409 = 150;
                        if (var8 != 2 && var8 != 3) {
                            if (var8 == 1) {
                                this.method104("@cr1@" + arg1.field1488, var16, 1, this.field341);
                            } else {
                                this.method104(arg1.field1488, var16, 2, this.field341);
                            }
                        } else {
                            this.method104("@cr2@" + arg1.field1488, var16, 1, this.field341);
                        }
                    } catch (Exception var28) {
                        signlink.reporterror("cde2");
                    }
                }
            }
            arg3.field1456 = var9 + var10;
        }
        if ((arg0 & 8) != 0) {
            arg1.field1419 = arg3.method462();
            if (arg1.field1419.charAt(0) == '~') {
                arg1.field1419 = arg1.field1419.substring(1);
                this.method104(arg1.field1488, arg1.field1419, 2, this.field341);
            } else if (field425 == arg1) {
                this.method104(arg1.field1488, arg1.field1419, 2, this.field341);
            }
            arg1.field1401 = 0;
            arg1.field1403 = 0;
            arg1.field1409 = 150;
        }
        if ((arg0 & 256) != 0) {
            int var18 = arg3.method476((byte) -50);
            int var19 = arg3.method455();
            arg1.method442(this.field547, var19, field347, var18);
            arg1.field1404 = field347 + 300;
            arg1.field1405 = arg3.method474((byte) 1);
            arg1.field1406 = arg3.method475((byte) 16);
        }
        if ((arg0 & 128) != 0) {
            arg1.field1430 = arg3.method457();
            arg1.field1431 = arg3.method484(false);
        }
        if ((arg0 & 64) != 0) {
            int var20 = arg3.method475((byte) 16);
            byte[] var21 = new byte[var20];
            class55 var22 = new class55(741, var21);
            arg3.method493(var20, 0, var21, 0);
            this.field475[arg2] = var22;
            arg1.method496(this.field276, var22);
        }
        if ((arg0 & 4) != 0) {
            int var23 = arg3.method475((byte) 16);
            int var24 = arg3.method474((byte) 1);
            arg1.method442(this.field547, var24, field347, var23);
            arg1.field1404 = field347 + 300;
            arg1.field1405 = arg3.method455();
            arg1.field1406 = arg3.method476((byte) -50);
        }
        if ((arg0 & 2) != 0) {
            int var25 = arg3.method483(17702);
            if (var25 == 65535) {
                var25 = -1;
            }
            int var26 = arg3.method475((byte) 16);
            if (arg1.field1382 == var25 && var25 != -1) {
                int var27 = class47.field1280[var25].field1294;
                if (var27 == 1) {
                    arg1.field1383 = 0;
                    arg1.field1384 = 0;
                    arg1.field1385 = var26;
                    arg1.field1386 = 0;
                }
                if (var27 == 2) {
                    arg1.field1386 = 0;
                    return;
                }
            } else if (var25 == -1 || arg1.field1382 == -1 || class47.field1280[var25].field1288 >= class47.field1280[arg1.field1382].field1288) {
                arg1.field1382 = var25;
                arg1.field1383 = 0;
                arg1.field1384 = 0;
                arg1.field1385 = var26;
                arg1.field1386 = 0;
                arg1.field1420 = arg1.field1387;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIBI)I")
    public final int method91(int arg0, int arg1, byte arg2, int arg3) {
        if (arg2 != -62) {
            for (int var5 = 1; var5 > 0; ++var5) {
            }
        }
        int var6 = 256 - arg0;
        return ((arg1 & 16711935) * var6 + (arg3 & 16711935) * arg0 & -16711936) + ((arg1 & 65280) * var6 + (arg3 & 65280) * arg0 & 16711680) >> 8;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(I)V")
    public final void method8(int arg0) {
        signlink.reporterror = false;
        try {
            if (this.field318 != null) {
                this.field318.method174();
            }
        } catch (Exception var2) {
        }
        this.field318 = null;
        this.method123(0);
        if (this.field192 != null) {
            this.field192.field1562 = false;
        }
        this.field192 = null;
        this.field491.method188();
        this.field491 = null;
        this.field364 = null;
        this.field320 = null;
        this.field295 = null;
        this.field363 = null;
        this.field272 = null;
        this.field163 = null;
        this.field504 = null;
        this.field273 = null;
        this.field274 = null;
        this.field360 = null;
        this.field531 = null;
        this.field383 = null;
        this.field445 = null;
        this.field543 = null;
        this.field311 = null;
        this.field114 = null;
        this.field115 = null;
        this.field493 = null;
        this.field508 = null;
        this.field509 = null;
        this.field510 = null;
        this.field511 = null;
        this.field573 = null;
        this.field574 = null;
        this.field575 = null;
        this.field165 = null;
        this.field166 = null;
        this.field167 = null;
        this.field168 = null;
        this.field169 = null;
        this.field170 = null;
        this.field171 = null;
        this.field172 = null;
        this.field173 = null;
        this.field314 = null;
        this.field315 = null;
        this.field316 = null;
        this.field229 = null;
        this.field230 = null;
        this.field231 = null;
        this.field563 = null;
        this.field419 = null;
        this.field420 = null;
        this.field421 = null;
        this.field422 = null;
        this.field423 = null;
        this.field392 = null;
        this.field393 = null;
        this.field394 = null;
        this.field395 = null;
        this.field396 = null;
        this.field246 = null;
        this.field302 = null;
        this.field562 = null;
        this.field467 = null;
        this.field466 = null;
        this.field465 = null;
        this.field424 = null;
        this.field564 = null;
        this.field565 = null;
        this.field566 = null;
        this.field567 = null;
        this.field568 = null;
        this.field390 = null;
        this.field505 = null;
        this.field538 = null;
        this.field470 = null;
        this.field472 = null;
        this.field474 = null;
        this.field475 = null;
        this.field298 = null;
        this.field365 = null;
        this.field367 = null;
        this.field580 = null;
        this.field463 = null;
        this.field208 = null;
        this.field450 = null;
        this.field249 = null;
        this.field250 = null;
        this.field518 += arg0;
        this.field251 = null;
        this.field252 = null;
        this.field305 = null;
        this.field286 = null;
        this.field289 = null;
        this.field290 = null;
        this.field108 = null;
        this.field402 = null;
        this.field581 = null;
        this.field313 = null;
        this.field162 = null;
        this.field202 = null;
        this.field203 = null;
        this.field199 = null;
        this.field200 = null;
        this.field201 = null;
        this.field204 = null;
        this.field205 = null;
        this.field206 = null;
        this.field207 = null;
        this.method142(1);
        class4.method18(false);
        class24.method279(false);
        class31.method323(false);
        class10.field642 = null;
        class36.field1099 = null;
        class29.field963 = null;
        class71.field1710 = null;
        class47.field1280 = null;
        class43.field1253 = null;
        class43.field1265 = null;
        class49.field1311 = null;
        super.field12 = null;
        class56.field1469 = null;
        class26.method288(false);
        class38.method341(false);
        class66.method521(false);
        class15.method216(false);
        System.gc();
        if (class40.field1193) {
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(LUAWAYCTK;BI)V")
    private final void method92(class55 arg0, byte arg1, int arg2) {
        if (this.field117 == arg1) {
            boolean var4 = false;
        } else {
            this.field519 = arg0.method455();
        }
        for (int var5 = 0; var5 < this.field473; ++var5) {
            int var6 = this.field474[var5];
            class25 var7 = this.field365[var6];
            int var8 = arg0.method455();
            if ((var8 & 4) != 0) {
                var7.field1419 = arg0.method462();
                var7.field1409 = 100;
            }
            if ((var8 & 1) != 0) {
                var7.field1396 = arg0.method484(false);
                int var9 = arg0.method489(false);
                var7.field1400 = var9 >> 16;
                var7.field1399 = (var9 & 65535) + field347;
                var7.field1397 = 0;
                var7.field1398 = 0;
                if (var7.field1399 > field347) {
                    var7.field1397 = -1;
                }
                if (var7.field1396 == 65535) {
                    var7.field1396 = -1;
                }
            }
            if ((var8 & 128) != 0) {
                int var10 = arg0.method455();
                int var11 = arg0.method475((byte) 16);
                var7.method442(this.field547, var11, field347, var10);
                var7.field1404 = field347 + 300;
                var7.field1405 = arg0.method455();
                var7.field1406 = arg0.method475((byte) 16);
            }
            if ((var8 & 64) != 0) {
                var7.field1429 = arg0.method483(17702);
                if (var7.field1429 == 65535) {
                    var7.field1429 = -1;
                }
            }
            if ((var8 & 2) != 0) {
                int var12 = arg0.method474((byte) 1);
                int var13 = arg0.method474((byte) 1);
                var7.method442(this.field547, var13, field347, var12);
                var7.field1404 = field347 + 300;
                var7.field1405 = arg0.method455();
                var7.field1406 = arg0.method476((byte) -50);
            }
            if ((var8 & 32) != 0) {
                int var14 = arg0.method484(false);
                if (var14 == 65535) {
                    var14 = -1;
                }
                int var15 = arg0.method474((byte) 1);
                if (var7.field1382 == var14 && var14 != -1) {
                    int var16 = class47.field1280[var14].field1294;
                    if (var16 == 1) {
                        var7.field1383 = 0;
                        var7.field1384 = 0;
                        var7.field1385 = var15;
                        var7.field1386 = 0;
                    }
                    if (var16 == 2) {
                        var7.field1386 = 0;
                    }
                } else if (var14 == -1 || var7.field1382 == -1 || class47.field1280[var14].field1288 >= class47.field1280[var7.field1382].field1288) {
                    var7.field1382 = var14;
                    var7.field1383 = 0;
                    var7.field1384 = 0;
                    var7.field1385 = var15;
                    var7.field1386 = 0;
                    var7.field1420 = var7.field1387;
                }
            }
            if ((var8 & 8) != 0) {
                var7.field871 = class24.method284(arg0.method457());
                var7.field1417 = var7.field871.field854;
                var7.field1418 = var7.field871.field862;
                var7.field1410 = var7.field871.field845;
                var7.field1411 = var7.field871.field864;
                var7.field1412 = var7.field871.field841;
                var7.field1413 = var7.field871.field857;
                var7.field1407 = var7.field871.field839;
            }
            if ((var8 & 16) != 0) {
                var7.field1430 = arg0.method484(false);
                var7.field1431 = arg0.method482(0);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZII)V")
    public final void method93(boolean arg0, int arg1, int arg2) {
        int var4 = 0;
        for (int var5 = 0; var5 < 100; ++var5) {
            if (this.field559[var5] != null) {
                int var6 = this.field557[var5];
                int var7 = 70 - var4 * 14 + this.field397 + 4;
                if (var7 < -20) {
                    break;
                }
                String var8 = this.field558[var5];
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
                if ((var6 == 1 || var6 == 2) && (var6 == 1 || this.field571 == 0 || this.field571 == 1 && this.method79(var8, 9))) {
                    if (arg2 > var7 - 14 && arg2 <= var7 && !var8.equals(field425.field1488)) {
                        if (this.field123 >= 1) {
                            this.field305[this.field131] = "Report abuse @whi@" + var8;
                            this.field251[this.field131] = 194;
                            ++this.field131;
                        }
                        this.field305[this.field131] = "Add ignore @whi@" + var8;
                        this.field251[this.field131] = 157;
                        ++this.field131;
                        this.field305[this.field131] = "Add friend @whi@" + var8;
                        this.field251[this.field131] = 761;
                        ++this.field131;
                    }
                    ++var4;
                }
                if ((var6 == 3 || var6 == 7) && this.field214 == 0 && (var6 == 7 || this.field354 == 0 || this.field354 == 1 && this.method79(var8, 9))) {
                    if (arg2 > var7 - 14 && arg2 <= var7) {
                        if (this.field123 >= 1) {
                            this.field305[this.field131] = "Report abuse @whi@" + var8;
                            this.field251[this.field131] = 194;
                            ++this.field131;
                        }
                        this.field305[this.field131] = "Add ignore @whi@" + var8;
                        this.field251[this.field131] = 157;
                        ++this.field131;
                        this.field305[this.field131] = "Add friend @whi@" + var8;
                        this.field251[this.field131] = 761;
                        ++this.field131;
                    }
                    ++var4;
                }
                if (var6 == 4 && (this.field516 == 0 || this.field516 == 1 && this.method79(var8, 9))) {
                    if (arg2 > var7 - 14 && arg2 <= var7) {
                        this.field305[this.field131] = "Accept trade @whi@" + var8;
                        this.field251[this.field131] = 406;
                        ++this.field131;
                    }
                    ++var4;
                }
                if ((var6 == 5 || var6 == 6) && this.field214 == 0 && this.field354 < 2) {
                    ++var4;
                }
                if (var6 == 8 && (this.field516 == 0 || this.field516 == 1 && this.method79(var8, 9))) {
                    if (arg2 > var7 - 14 && arg2 <= var7) {
                        this.field305[this.field131] = "Accept challenge @whi@" + var8;
                        this.field251[this.field131] = 853;
                        ++this.field131;
                    }
                    ++var4;
                }
            }
        }
        if (!arg0) {
            this.field580 = null;
        }
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(II)Z")
    public final boolean method94(int arg0, int arg1) {
        if (arg1 != 9525) {
            for (int var3 = 1; var3 > 0; ++var3) {
            }
        }
        if (arg0 < 0) {
            return false;
        } else {
            int var4 = this.field251[arg0];
            if (var4 >= 2000) {
                var4 -= 2000;
            }
            return var4 == 761;
        }
    }

    @OriginalMember(owner = "client", name = "l", descriptor = "(I)V")
    public static final void method95(int arg0) {
        if (arg0 != 1652) {
            field157 = !field157;
        }
        class38.field1123 = false;
        class26.field873 = false;
        field196 = false;
        class22.field794 = false;
        class4.field51 = false;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
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

    @OriginalMember(owner = "client", name = "a", descriptor = "(IILJKAPIYZO;II)V")
    public final void method96(int arg0, int arg1, class24 arg2, int arg3, int arg4) {
        if (arg1 != -12242) {
            this.field519 = -1;
        }
        if (this.field131 < 400) {
            if (arg2.field836 != null) {
                arg2 = arg2.method282(0);
            }
            if (arg2 != null) {
                if (arg2.field829) {
                    String var6 = arg2.field832;
                    if (arg2.field840 != 0) {
                        var6 = var6 + method81(arg2.field840, -695, field425.field1480) + " (level-" + arg2.field840 + ")";
                    }
                    if (this.field494 == 1) {
                        this.field305[this.field131] = "Use " + this.field498 + " with @yel@" + var6;
                        this.field251[this.field131] = 397;
                        this.field252[this.field131] = arg4;
                        this.field249[this.field131] = arg0;
                        this.field250[this.field131] = arg3;
                        ++this.field131;
                    } else {
                        if (this.field146 == 1) {
                            if ((this.field148 & 2) == 2) {
                                this.field305[this.field131] = this.field149 + " @yel@" + var6;
                                this.field251[this.field131] = 610;
                                this.field252[this.field131] = arg4;
                                this.field249[this.field131] = arg0;
                                this.field250[this.field131] = arg3;
                                ++this.field131;
                                return;
                            }
                        } else {
                            if (arg2.field868 != null) {
                                for (int var7 = 4; var7 >= 0; --var7) {
                                    if (arg2.field868[var7] != null && !arg2.field868[var7].equalsIgnoreCase("attack")) {
                                        this.field305[this.field131] = arg2.field868[var7] + " @yel@" + var6;
                                        if (var7 == 0) {
                                            this.field251[this.field131] = 457;
                                        }
                                        if (var7 == 1) {
                                            this.field251[this.field131] = 749;
                                        }
                                        if (var7 == 2) {
                                            this.field251[this.field131] = 735;
                                        }
                                        if (var7 == 3) {
                                            this.field251[this.field131] = 153;
                                        }
                                        if (var7 == 4) {
                                            this.field251[this.field131] = 560;
                                        }
                                        this.field252[this.field131] = arg4;
                                        this.field249[this.field131] = arg0;
                                        this.field250[this.field131] = arg3;
                                        ++this.field131;
                                    }
                                }
                            }
                            if (arg2.field868 != null) {
                                for (int var8 = 4; var8 >= 0; --var8) {
                                    if (arg2.field868[var8] != null && arg2.field868[var8].equalsIgnoreCase("attack")) {
                                        short var9 = 0;
                                        if (arg2.field840 > field425.field1480) {
                                            var9 = 2000;
                                        }
                                        this.field305[this.field131] = arg2.field868[var8] + " @yel@" + var6;
                                        if (var8 == 0) {
                                            this.field251[this.field131] = var9 + 457;
                                        }
                                        if (var8 == 1) {
                                            this.field251[this.field131] = var9 + 749;
                                        }
                                        if (var8 == 2) {
                                            this.field251[this.field131] = var9 + 735;
                                        }
                                        if (var8 == 3) {
                                            this.field251[this.field131] = var9 + 153;
                                        }
                                        if (var8 == 4) {
                                            this.field251[this.field131] = var9 + 560;
                                        }
                                        this.field252[this.field131] = arg4;
                                        this.field249[this.field131] = arg0;
                                        this.field250[this.field131] = arg3;
                                        ++this.field131;
                                    }
                                }
                            }
                            this.field305[this.field131] = "Examine @yel@" + var6;
                            this.field251[this.field131] = 1822;
                            this.field252[this.field131] = arg4;
                            this.field249[this.field131] = arg0;
                            this.field250[this.field131] = arg3;
                            ++this.field131;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BLLYHLTGUG;)Z")
    public final boolean method97(byte arg0, class29 arg1) {
        if (arg0 != 2) {
            this.field519 = -1;
        }
        if (arg1.field958 == null) {
            return false;
        } else {
            for (int var3 = 0; var3 < arg1.field958.length; ++var3) {
                int var4 = this.method58(967, var3, arg1);
                int var5 = arg1.field953[var3];
                if (arg1.field958[var3] == 2) {
                    if (var4 >= var5) {
                        return false;
                    }
                } else if (arg1.field958[var3] == 3) {
                    if (var4 <= var5) {
                        return false;
                    }
                } else if (arg1.field958[var3] == 4) {
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

    @OriginalMember(owner = "client", name = "k", descriptor = "(Z)V")
    private final void method98(boolean arg0) {
        if (arg0) {
            this.field519 = this.field363.method455();
        }
        if (this.field443 == 2) {
            for (class8 var2 = (class8) this.field463.method503(); var2 != null; var2 = (class8) this.field463.method505(false)) {
                if (var2.field620 > 0) {
                    --var2.field620;
                }
                if (var2.field620 == 0) {
                    if (var2.field617 < 0 || class22.method259(var2.field619, var2.field617, false)) {
                        this.method57(false, var2.field617, var2.field622, var2.field618, var2.field624, var2.field623, var2.field619, var2.field625);
                        var2.method398();
                    }
                } else {
                    if (var2.field621 > 0) {
                        --var2.field621;
                    }
                    if (var2.field621 == 0 && var2.field624 >= 1 && var2.field625 >= 1 && var2.field624 <= 102 && var2.field625 <= 102 && (var2.field614 < 0 || class22.method259(var2.field616, var2.field614, false))) {
                        this.method57(false, var2.field614, var2.field622, var2.field615, var2.field624, var2.field623, var2.field616, var2.field625);
                        var2.field621 = -1;
                        if (var2.field617 == var2.field614 && var2.field617 == -1) {
                            var2.method398();
                        } else if (var2.field617 == var2.field614 && var2.field618 == var2.field615 && var2.field619 == var2.field616) {
                            var2.method398();
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "m", descriptor = "(I)Ljava/net/Socket;")
    public final Socket method99(int arg0) throws IOException {
        return signlink.mainapp != null ? signlink.opensocket(arg0) : new Socket(InetAddress.getByName(this.getCodeBase().getHost()), arg0);
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IILIBHVCUAH;I)V")
    public final void method100(int arg0, int arg1, class19 arg2, int arg3) {
        if (arg3 != 2934) {
            this.field519 = -1;
        }
        int var5 = this.field197 + this.field120 & 2047;
        int var6 = arg0 * arg0 + arg1 * arg1;
        if (var6 <= 6400) {
            int var7 = class66.field1649[var5];
            int var8 = class66.field1650[var5];
            int var9 = var7 * 256 / (this.field292 + 256);
            int var10 = var8 * 256 / (this.field292 + 256);
            int var11 = arg0 * var10 + arg1 * var9 >> 16;
            int var12 = arg1 * var10 - arg0 * var9 >> 16;
            if (var6 > 2500) {
                arg2.method238(this.field480, 83 - var12 - arg2.field757 / 2 - 4, this.field315, var11 + 94 - arg2.field756 / 2 + 4);
            } else {
                arg2.method232(var11 + 94 - arg2.field756 / 2 + 4, 83 - var12 - arg2.field757 / 2 - 4, this.field481);
            }
        }
    }

    @OriginalMember(owner = "client", name = "n", descriptor = "(I)V")
    public final void method101(int arg0) {
        ++this.field329;
        this.method77(true, 1);
        this.method122((byte) 2, true);
        this.method77(false, 1);
        while (arg0 >= 0) {
            this.field328 = this.field242.method518();
        }
        this.method122((byte) 2, false);
        this.method161(474);
        this.method170(false);
        if (!this.field267) {
            int var2 = this.field119;
            if (this.field343 / 256 > var2) {
                var2 = this.field343 / 256;
            }
            if (this.field116[4] && this.field342[4] + 128 > var2) {
                var2 = this.field342[4] + 128;
            }
            int var3 = this.field345 + this.field120 & 2047;
            this.method103(var3, false, this.field552, this.field551, var2 * 3 + 600, var2, this.method72(field425.field1423, field425.field1422, this.field548, -964) - 50);
            ++field176;
            if (field176 > 1252) {
                field176 = 0;
                this.field320.method444(false, 191);
                this.field320.method445(0);
                int var4 = this.field320.field1456;
                this.field320.method446((int) (Math.random() * 65536.0D));
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field320.method446(29307);
                }
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field320.method445(10);
                }
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field320.method445(104);
                }
                this.field320.method446(34003);
                this.field320.method445(235);
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field320.method446(64940);
                }
                this.field320.method445(242);
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field320.method446(64309);
                }
                this.field320.method445(174);
                this.field320.method454(this.field320.field1456 - var4, 36772);
            }
        }
        int var5;
        if (!this.field267) {
            var5 = this.method140(9);
        } else {
            var5 = this.method141(90);
        }
        int var6 = this.field185;
        int var7 = this.field186;
        int var8 = this.field187;
        int var9 = this.field188;
        int var10 = this.field189;
        for (int var11 = 0; var11 < 5; ++var11) {
            if (this.field116[var11]) {
                int var13 = (int) (Math.random() * (double) (this.field544[var11] * 2 + 1) - (double) this.field544[var11] + Math.sin((double) this.field417[var11] / 100.0D * (double) this.field451[var11]) * (double) this.field342[var11]);
                if (var11 == 0) {
                    this.field185 += var13;
                }
                if (var11 == 1) {
                    this.field186 += var13;
                }
                if (var11 == 2) {
                    this.field187 += var13;
                }
                if (var11 == 3) {
                    this.field189 = this.field189 + var13 & 2047;
                }
                if (var11 == 4) {
                    this.field188 += var13;
                    if (this.field188 < 128) {
                        this.field188 = 128;
                    }
                    if (this.field188 > 383) {
                        this.field188 = 383;
                    }
                }
            }
        }
        int var12 = class26.field893;
        class66.field1644 = true;
        class66.field1647 = 0;
        class66.field1645 = super.field19 - 4;
        class66.field1646 = super.field20 - 4;
        class53.method430(413);
        this.field383.method381(this.field187, this.field185, 27889, this.field189, this.field188, this.field186, var5);
        this.field383.method356(0);
        this.method125(69);
        this.method133((byte) 0);
        this.method139((byte) 26, var12);
        this.method114(-58);
        this.field510.method400((byte) -122, 4, 4, super.field11);
        this.field185 = var6;
        this.field186 = var7;
        this.field187 = var8;
        this.field188 = var9;
        this.field189 = var10;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;)V")
    private final void method102(String arg0) {
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

    @OriginalMember(owner = "client", name = "a", descriptor = "(IZIIIII)V")
    public final void method103(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = 2048 - arg5 & 2047;
        int var9 = 2048 - arg0 & 2047;
        int var10 = 0;
        int var11 = 0;
        int var12 = arg4;
        if (var8 != 0) {
            int var13 = class66.field1649[var8];
            int var14 = class66.field1650[var8];
            int var15 = var11 * var14 - arg4 * var13 >> 16;
            var12 = var11 * var13 + arg4 * var14 >> 16;
            var11 = var15;
        }
        if (var9 != 0) {
            int var16 = class66.field1649[var9];
            int var17 = class66.field1650[var9];
            int var18 = var10 * var17 + var12 * var16 >> 16;
            var12 = var12 * var17 - var10 * var16 >> 16;
            var10 = var18;
        }
        this.field185 = arg3 - var10;
        this.field186 = arg6 - var11;
        this.field187 = arg2 - var12;
        if (arg1) {
            this.method6();
        }
        this.field188 = arg5;
        this.field189 = arg0;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;IZ)V")
    public final void method104(String arg0, String arg1, int arg2, boolean arg3) {
        if (arg2 == 0 && this.field126 != -1) {
            this.field382 = arg1;
            super.field25 = 0;
        }
        if (this.field338 == -1) {
            this.field409 = true;
        }
        for (int var5 = 99; var5 > 0; --var5) {
            this.field557[var5] = this.field557[var5 - 1];
            this.field558[var5] = this.field558[var5 - 1];
            this.field559[var5] = this.field559[var5 - 1];
        }
        this.field557[0] = arg2;
        this.field558[0] = arg0;
        if (arg3) {
            this.field320.method445(19);
        }
        this.field559[0] = arg1;
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(B)V")
    public final void method105(byte arg0) {
        Graphics var2 = this.method11(false).getGraphics();
        var2.setColor(Color.black);
        var2.fillRect(0, 0, 765, 503);
        this.method4(1, true);
        if (arg0 != 81) {
            this.field580 = null;
        }
        if (this.field546) {
            this.field387 = false;
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
        if (this.field507) {
            this.field387 = false;
            var2.setFont(new Font("Helvetica", 1, 20));
            var2.setColor(Color.white);
            var2.drawString("Error - unable to load game!", 50, 50);
            var2.drawString("To play RuneScape make sure you play from", 50, 100);
            var2.drawString("http://www.runescape.com", 50, 150);
        }
        if (this.field413) {
            this.field387 = false;
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

    @OriginalMember(owner = "client", name = "a", descriptor = "(JI)V")
    public final void method106(long arg0, int arg1) {
        if (arg0 != 0L) {
            if (this.field253 >= 100) {
                this.method104("", "Your ignore list is full. Max of 100 hit", 0, this.field341);
            } else {
                String var4 = class61.method512(false, class61.method509(this.field533, arg0));
                for (int var5 = 0; var5 < this.field253; ++var5) {
                    if (this.field399[var5] == arg0) {
                        this.method104("", var4 + " is already on your ignore list", 0, this.field341);
                        return;
                    }
                }
                for (int var6 = 0; var6 < this.field447; ++var6) {
                    if (this.field313[var6] == arg0) {
                        this.method104("", "Please remove " + var4 + " from your friend list first", 0, this.field341);
                        return;
                    }
                }
                this.field399[this.field253++] = arg0;
                this.field490 = true;
                this.field320.method444(false, 12);
                this.field320.method451(arg0, true);
                if (arg1 != 0) {
                    this.method6();
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "o", descriptor = "(I)Ljava/lang/String;")
    public final String method107(int arg0) {
        if (arg0 != -48843) {
            throw new NullPointerException();
        } else if (signlink.mainapp != null) {
            return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
        } else {
            return super.field14 != null ? "runescape.com" : super.getDocumentBase().getHost().toLowerCase();
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "()V")
    public final void method6() {
        this.method13(20, "Starting up", false);
        if (signlink.sunjava) {
            super.field5 = 5;
        }
        if (field322) {
            this.field413 = true;
        } else {
            field322 = true;
            boolean var1 = false;
            String var2 = this.method107(-48843);
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
                this.field507 = true;
            } else {
                if (signlink.cache_dat != null) {
                    for (int var3 = 0; var3 < 5; ++var3) {
                        this.field434[var3] = new class33(signlink.cache_idx[var3], var3 + 1, 500000, (byte) 37, signlink.cache_dat);
                    }
                }
                try {
                    this.method134(-47231);
                    this.field576 = this.method118("title", this.field177[1], 25, "title screen", 1, -378);
                    this.field330 = new class20("p11_full", this.field576, false, 8801);
                    this.field331 = new class20("p12_full", this.field576, false, 8801);
                    this.field332 = new class20("b12_full", this.field576, false, 8801);
                    this.field333 = new class20("q8_full", this.field576, true, 8801);
                    this.method65(-23897);
                    this.method109(-576);
                    class50 var4 = this.method118("config", this.field177[2], 30, "config", 2, -378);
                    class50 var5 = this.method118("interface", this.field177[3], 35, "interface", 3, -378);
                    class50 var6 = this.method118("media", this.field177[4], 40, "2d graphics", 4, -378);
                    class50 var7 = this.method118("textures", this.field177[6], 45, "textures", 6, -378);
                    class50 var8 = this.method118("wordenc", this.field177[7], 50, "chat system", 7, -378);
                    class50 var9 = this.method118("sounds", this.field177[8], 55, "sound effects", 8, -378);
                    this.field531 = new byte[4][104][104];
                    this.field360 = new int[4][105][105];
                    this.field383 = new class38(4, field381, 104, this.field360, 104);
                    for (int var10 = 0; var10 < 4; ++var10) {
                        this.field445[var10] = new class5(104, 104, (byte) 4);
                    }
                    this.field402 = new class19(512, 512);
                    class50 var11 = this.method118("versionlist", this.field177[5], 60, "update list", 5, -378);
                    this.method13(60, "Connecting to update server", false);
                    this.field491 = new class11();
                    this.field491.method196(var11, this);
                    class15.method214(this.field491.method194(true));
                    class66.method522(this.field491.method191(false, 0), this.field491);
                    if (!field196) {
                        this.field369 = 0;
                        try {
                            this.field369 = Integer.parseInt(this.getParameter("music"));
                        } catch (Exception var72) {
                        }
                        this.field370 = true;
                        this.field491.method184(2, this.field369);
                        while (this.field491.method204() > 0) {
                            this.method166(-17023);
                            try {
                                Thread.sleep(100L);
                            } catch (Exception var71) {
                            }
                            if (this.field491.field681 > 3) {
                                this.method102("ondemand");
                                return;
                            }
                        }
                    }
                    this.method13(65, "Requesting animations", false);
                    int var12 = this.field491.method191(false, 1);
                    for (int var13 = 0; var13 < var12; ++var13) {
                        this.field491.method184(1, var13);
                    }
                    while (this.field491.method204() > 0) {
                        int var14 = var12 - this.field491.method204();
                        if (var14 > 0) {
                            this.method13(65, "Loading animations - " + var14 * 100 / var12 + "%", false);
                        }
                        this.method166(-17023);
                        try {
                            Thread.sleep(100L);
                        } catch (Exception var70) {
                        }
                        if (this.field491.field681 > 3) {
                            this.method102("ondemand");
                            return;
                        }
                    }
                    this.method13(70, "Requesting models", false);
                    int var15 = this.field491.method191(false, 0);
                    for (int var16 = 0; var16 < var15; ++var16) {
                        int var17 = this.field491.method200(var16, -651);
                        if ((var17 & 1) != 0) {
                            this.field491.method184(0, var16);
                        }
                    }
                    int var18 = this.field491.method204();
                    while (this.field491.method204() > 0) {
                        int var19 = var18 - this.field491.method204();
                        if (var19 > 0) {
                            this.method13(70, "Loading models - " + var19 * 100 / var18 + "%", false);
                        }
                        this.method166(-17023);
                        try {
                            Thread.sleep(100L);
                        } catch (Exception var69) {
                        }
                    }
                    if (this.field434[0] != null) {
                        this.method13(75, "Requesting maps", false);
                        this.field491.method184(3, this.field491.method199(48, 0, -306, 47));
                        this.field491.method184(3, this.field491.method199(48, 1, -306, 47));
                        this.field491.method184(3, this.field491.method199(48, 0, -306, 48));
                        this.field491.method184(3, this.field491.method199(48, 1, -306, 48));
                        this.field491.method184(3, this.field491.method199(48, 0, -306, 49));
                        this.field491.method184(3, this.field491.method199(48, 1, -306, 49));
                        this.field491.method184(3, this.field491.method199(47, 0, -306, 47));
                        this.field491.method184(3, this.field491.method199(47, 1, -306, 47));
                        this.field491.method184(3, this.field491.method199(47, 0, -306, 48));
                        this.field491.method184(3, this.field491.method199(47, 1, -306, 48));
                        this.field491.method184(3, this.field491.method199(148, 0, -306, 48));
                        this.field491.method184(3, this.field491.method199(148, 1, -306, 48));
                        int var20 = this.field491.method204();
                        while (this.field491.method204() > 0) {
                            int var21 = var20 - this.field491.method204();
                            if (var21 > 0) {
                                this.method13(75, "Loading maps - " + var21 * 100 / var20 + "%", false);
                            }
                            this.method166(-17023);
                            try {
                                Thread.sleep(100L);
                            } catch (Exception var68) {
                            }
                        }
                    }
                    int var22 = this.field491.method191(false, 0);
                    for (int var23 = 0; var23 < var22; ++var23) {
                        int var24 = this.field491.method200(var23, -651);
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
                            this.field491.method201(-279, 0, var25, var23);
                        }
                    }
                    this.field491.method202(field535, field195);
                    if (!field196) {
                        int var26 = this.field491.method191(false, 2);
                        for (int var27 = 1; var27 < var26; ++var27) {
                            if (this.field491.method186(field454, var27)) {
                                this.field491.method201(-279, 2, (byte) 1, var27);
                            }
                        }
                    }
                    this.method13(80, "Unpacking media", false);
                    this.field314 = new class68(var6, "invback", 0);
                    this.field316 = new class68(var6, "chatback", 0);
                    this.field315 = new class68(var6, "mapback", 0);
                    this.field229 = new class68(var6, "backbase1", 0);
                    this.field230 = new class68(var6, "backbase2", 0);
                    this.field231 = new class68(var6, "backhmid1", 0);
                    for (int var28 = 0; var28 < 13; ++var28) {
                        this.field563[var28] = new class68(var6, "sideicons", var28);
                    }
                    this.field246 = new class19(var6, "compass", 0);
                    this.field275 = new class19(var6, "mapedge", 0);
                    this.field275.method229(true);
                    for (int var29 = 0; var29 < 72; ++var29) {
                        this.field390[var29] = new class68(var6, "mapscene", var29);
                    }
                    for (int var30 = 0; var30 < 63; ++var30) {
                        this.field505[var30] = new class19(var6, "mapfunction", var30);
                    }
                    for (int var31 = 0; var31 < 5; ++var31) {
                        this.field302[var31] = new class19(var6, "hitmarks", var31);
                    }
                    for (int var32 = 0; var32 < 6; ++var32) {
                        this.field562[var32] = new class19(var6, "headicons_pk", var32);
                    }
                    for (int var33 = 0; var33 < 9; ++var33) {
                        this.field467[var33] = new class19(var6, "headicons_prayer", var33);
                    }
                    for (int var34 = 0; var34 < 6; ++var34) {
                        this.field466[var34] = new class19(var6, "headicons_hint", var34);
                    }
                    this.field424 = new class19(var6, "overlay_multiway", 0);
                    this.field309 = new class19(var6, "mapmarker", 0);
                    this.field310 = new class19(var6, "mapmarker", 1);
                    for (int var35 = 0; var35 < 8; ++var35) {
                        this.field465[var35] = new class19(var6, "cross", var35);
                    }
                    this.field564 = new class19(var6, "mapdots", 0);
                    this.field565 = new class19(var6, "mapdots", 1);
                    this.field566 = new class19(var6, "mapdots", 2);
                    this.field567 = new class19(var6, "mapdots", 3);
                    this.field568 = new class19(var6, "mapdots", 4);
                    this.field235 = new class68(var6, "scrollbar", 0);
                    this.field236 = new class68(var6, "scrollbar", 1);
                    this.field419 = new class68(var6, "redstone1", 0);
                    this.field420 = new class68(var6, "redstone2", 0);
                    this.field421 = new class68(var6, "redstone3", 0);
                    this.field422 = new class68(var6, "redstone1", 0);
                    this.field422.method552(178);
                    this.field423 = new class68(var6, "redstone2", 0);
                    this.field423.method552(178);
                    this.field392 = new class68(var6, "redstone1", 0);
                    this.field392.method553((byte) -104);
                    this.field393 = new class68(var6, "redstone2", 0);
                    this.field393.method553((byte) -104);
                    this.field394 = new class68(var6, "redstone3", 0);
                    this.field394.method553((byte) -104);
                    this.field395 = new class68(var6, "redstone1", 0);
                    this.field395.method552(178);
                    this.field395.method553((byte) -104);
                    this.field396 = new class68(var6, "redstone2", 0);
                    this.field396.method552(178);
                    this.field396.method553((byte) -104);
                    for (int var36 = 0; var36 < 2; ++var36) {
                        this.field500[var36] = new class68(var6, "mod_icons", var36);
                    }
                    class19 var37 = new class19(var6, "backleft1", 0);
                    this.field165 = new class42(var37.field752, this.method11(false), var37.field753, (byte) 33);
                    var37.method230(0, (byte) -76, 0);
                    class19 var38 = new class19(var6, "backleft2", 0);
                    this.field166 = new class42(var38.field752, this.method11(false), var38.field753, (byte) 33);
                    var38.method230(0, (byte) -76, 0);
                    class19 var39 = new class19(var6, "backright1", 0);
                    this.field167 = new class42(var39.field752, this.method11(false), var39.field753, (byte) 33);
                    var39.method230(0, (byte) -76, 0);
                    class19 var40 = new class19(var6, "backright2", 0);
                    this.field168 = new class42(var40.field752, this.method11(false), var40.field753, (byte) 33);
                    var40.method230(0, (byte) -76, 0);
                    class19 var41 = new class19(var6, "backtop1", 0);
                    this.field169 = new class42(var41.field752, this.method11(false), var41.field753, (byte) 33);
                    var41.method230(0, (byte) -76, 0);
                    class19 var42 = new class19(var6, "backvmid1", 0);
                    this.field170 = new class42(var42.field752, this.method11(false), var42.field753, (byte) 33);
                    var42.method230(0, (byte) -76, 0);
                    class19 var43 = new class19(var6, "backvmid2", 0);
                    this.field171 = new class42(var43.field752, this.method11(false), var43.field753, (byte) 33);
                    var43.method230(0, (byte) -76, 0);
                    class19 var44 = new class19(var6, "backvmid3", 0);
                    this.field172 = new class42(var44.field752, this.method11(false), var44.field753, (byte) 33);
                    var44.method230(0, (byte) -76, 0);
                    class19 var45 = new class19(var6, "backhmid2", 0);
                    this.field173 = new class42(var45.field752, this.method11(false), var45.field753, (byte) 33);
                    var45.method230(0, (byte) -76, 0);
                    int var46 = (int) (Math.random() * 21.0D) - 10;
                    int var47 = (int) (Math.random() * 21.0D) - 10;
                    int var48 = (int) (Math.random() * 21.0D) - 10;
                    int var49 = (int) (Math.random() * 41.0D) - 20;
                    for (int var50 = 0; var50 < 100; ++var50) {
                        if (this.field505[var50] != null) {
                            this.field505[var50].method228(var47 + var49, field460, var48 + var49, var46 + var49);
                        }
                        if (this.field390[var50] != null) {
                            this.field390[var50].method554(var47 + var49, field460, var48 + var49, var46 + var49);
                        }
                    }
                    this.method13(83, "Unpacking textures", false);
                    class26.method293(var7, (byte) 91);
                    class26.method297(0.8D, 5);
                    class26.method292(37165, 20);
                    this.method13(86, "Unpacking config", false);
                    class47.method413(0, var4);
                    class4.method15(var4);
                    class10.method180(0, var4);
                    class31.method316(var4);
                    class24.method285(var4);
                    class36.method333(0, var4);
                    class43.method402(0, var4);
                    class49.method421(0, var4);
                    class57.method498(0, var4);
                    class31.field1017 = field195;
                    if (!field196) {
                        this.method13(90, "Unpacking sounds", false);
                        byte[] var51 = var9.method424("sounds.dat", (byte[]) null);
                        class55 var52 = new class55(741, var51);
                        class16.method219(0, var52);
                    }
                    this.method13(95, "Unpacking interfaces", false);
                    class20[] var53 = new class20[] { this.field330, this.field331, this.field332, this.field333 };
                    class29.method307((byte) -15, var6, var53, var5);
                    this.method13(100, "Preparing game engine", false);
                    for (int var54 = 0; var54 < 33; ++var54) {
                        int var55 = 999;
                        int var56 = 0;
                        for (int var57 = 0; var57 < 34; ++var57) {
                            if (this.field315.field1675[this.field315.field1677 * var54 + var57] == 0) {
                                if (var55 == 999) {
                                    var55 = var57;
                                }
                            } else if (var55 != 999) {
                                var56 = var57;
                                break;
                            }
                        }
                        this.field391[var54] = var55;
                        this.field128[var54] = var56 - var55;
                    }
                    for (int var58 = 5; var58 < 156; ++var58) {
                        int var59 = 999;
                        int var60 = 0;
                        for (int var61 = 25; var61 < 172; ++var61) {
                            if (this.field315.field1675[this.field315.field1677 * var58 + var61] == 0 && (var61 > 34 || var58 > 34)) {
                                if (var59 == 999) {
                                    var59 = var61;
                                }
                            } else if (var59 != 999) {
                                var60 = var61;
                                break;
                            }
                        }
                        this.field321[var58 - 5] = var59 - 25;
                        this.field266[var58 - 5] = var60 - var59;
                    }
                    class26.method290(479, 96, (byte) 5);
                    this.field456 = class26.field884;
                    class26.method290(190, 261, (byte) 5);
                    this.field457 = class26.field884;
                    class26.method290(512, 334, (byte) 5);
                    this.field458 = class26.field884;
                    int[] var62 = new int[9];
                    for (int var63 = 0; var63 < 9; ++var63) {
                        int var64 = var63 * 32 + 128 + 15;
                        int var65 = var64 * 3 + 600;
                        int var66 = class26.field882[var64];
                        var62[var63] = var65 * var66 >> 16;
                    }
                    class38.method378(var62, 800, 512, (byte) -111, 500, 334);
                    class72.method557(var8);
                    this.field192 = new class64(true, this);
                    this.method12(this.field192, 10);
                    class23.field818 = this;
                    class4.field78 = this;
                    class24.field863 = this;
                } catch (Exception var73) {
                    signlink.reporterror("loaderror " + this.field132 + " " + this.field405);
                    this.field546 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "p", descriptor = "(I)V")
    public void method108(int arg0) {
        if (arg0 != 0) {
            this.field449 = !this.field449;
        }
        System.out.println("============");
        System.out.println("flame-cycle:" + this.field446);
        if (this.field491 != null) {
            System.out.println("Od-cycle:" + this.field491.field655);
        }
        System.out.println("loop-cycle:" + field347);
        System.out.println("draw-cycle:" + field340);
        System.out.println("ptype:" + this.field519);
        System.out.println("psize:" + this.field518);
        if (this.field318 != null) {
            this.field318.method179(0);
        }
        super.field8 = true;
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(Z)Ljava/awt/Component;")
    public final Component method11(boolean arg0) {
        if (arg0) {
            this.field398 = 338;
        }
        if (signlink.mainapp != null) {
            return signlink.mainapp;
        } else {
            return super.field14 != null ? super.field14 : this;
        }
    }

    @OriginalMember(owner = "client", name = "q", descriptor = "(I)V")
    public final void method109(int arg0) {
        this.field158 = new class68(this.field576, "titlebox", 0);
        this.field159 = new class68(this.field576, "titlebutton", 0);
        this.field280 = new class68[12];
        int var2 = 0;
        if (arg0 >= 0) {
            this.field437 = this.field242.method518();
        }
        try {
            var2 = Integer.parseInt(this.getParameter("fl_icon"));
        } catch (Exception var19) {
        }
        if (var2 == 0) {
            for (int var3 = 0; var3 < 12; ++var3) {
                this.field280[var3] = new class68(this.field576, "runes", var3);
            }
        } else {
            for (int var4 = 0; var4 < 12; ++var4) {
                this.field280[var4] = new class68(this.field576, "runes", (var4 & 3) + 12);
            }
        }
        this.field512 = new class19(128, 265);
        this.field513 = new class19(128, 265);
        for (int var5 = 0; var5 < 33920; ++var5) {
            this.field512.field751[var5] = this.field202.field1244[var5];
        }
        for (int var6 = 0; var6 < 33920; ++var6) {
            this.field513.field751[var6] = this.field203.field1244[var6];
        }
        this.field325 = new int[256];
        for (int var7 = 0; var7 < 64; ++var7) {
            this.field325[var7] = var7 * 262144;
        }
        for (int var8 = 0; var8 < 64; ++var8) {
            this.field325[var8 + 64] = var8 * 1024 + 16711680;
        }
        for (int var9 = 0; var9 < 64; ++var9) {
            this.field325[var9 + 128] = var9 * 4 + 16776960;
        }
        for (int var10 = 0; var10 < 64; ++var10) {
            this.field325[var10 + 192] = 16777215;
        }
        this.field326 = new int[256];
        for (int var11 = 0; var11 < 64; ++var11) {
            this.field326[var11] = var11 * 1024;
        }
        for (int var12 = 0; var12 < 64; ++var12) {
            this.field326[var12 + 64] = var12 * 4 + 65280;
        }
        for (int var13 = 0; var13 < 64; ++var13) {
            this.field326[var13 + 128] = var13 * 262144 + 65535;
        }
        for (int var14 = 0; var14 < 64; ++var14) {
            this.field326[var14 + 192] = 16777215;
        }
        this.field327 = new int[256];
        for (int var15 = 0; var15 < 64; ++var15) {
            this.field327[var15] = var15 * 4;
        }
        for (int var16 = 0; var16 < 64; ++var16) {
            this.field327[var16 + 64] = var16 * 262144 + 255;
        }
        for (int var17 = 0; var17 < 64; ++var17) {
            this.field327[var17 + 128] = var17 * 1024 + 16711935;
        }
        for (int var18 = 0; var18 < 64; ++var18) {
            this.field327[var18 + 192] = 16777215;
        }
        this.field324 = new int[256];
        this.field372 = new int[32768];
        this.field373 = new int[32768];
        this.method83((byte) 0, (class68) null);
        this.field143 = new int[32768];
        this.field144 = new int[32768];
        this.method13(10, "Connecting to fileserver", false);
        if (!this.field387) {
            this.field182 = true;
            this.field387 = true;
            this.method12(this, 2);
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(IIII)Z")
    public final boolean method110(int arg0, int arg1, int arg2, int arg3) {
        int var5 = arg1 >> 14 & 32767;
        if (arg3 >= 0) {
            for (int var6 = 1; var6 > 0; ++var6) {
            }
        }
        int var7 = this.field383.method372(this.field548, arg0, arg2, arg1);
        if (var7 == -1) {
            return false;
        } else {
            int var8 = var7 & 31;
            int var9 = var7 >> 6 & 3;
            if (var8 != 10 && var8 != 11 && var8 != 22) {
                this.method71(arg0, false, 0, 0, var9, field425.field1416[0], field425.field1415[0], var8 + 1, 0, arg2, 0, 2);
            } else {
                class4 var10 = class4.method24(var5);
                int var11;
                int var12;
                if (var9 != 0 && var9 != 2) {
                    var11 = var10.field57;
                    var12 = var10.field72;
                } else {
                    var11 = var10.field72;
                    var12 = var10.field57;
                }
                int var13 = var10.field45;
                if (var9 != 0) {
                    var13 = (var13 >> 4 - var9) + (var13 << var9 & 15);
                }
                this.method71(arg0, false, var11, var12, 0, field425.field1416[0], field425.field1415[0], 0, var13, arg2, 0, 2);
            }
            this.field427 = super.field26;
            this.field428 = super.field27;
            this.field430 = 2;
            this.field429 = 0;
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(JI)V")
    public final void method111(long arg0, int arg1) {
        if (arg1 > 0) {
            if (arg0 != 0L) {
                for (int var4 = 0; var4 < this.field253; ++var4) {
                    if (this.field399[var4] == arg0) {
                        --this.field253;
                        this.field490 = true;
                        for (int var5 = var4; var5 < this.field253; ++var5) {
                            this.field399[var5] = this.field399[var5 + 1];
                        }
                        this.field320.method444(false, 107);
                        this.field320.method451(arg0, true);
                        return;
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
                if (super.field14 != null) {
                    return new URL("http://127.0.0.1:" + (field194 + 80));
                }
            } catch (Exception var1) {
            }
            return super.getCodeBase();
        }
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(B)V")
    public final void method112(byte arg0) {
        this.field508.method399(true);
        class26.field884 = this.field457;
        this.field314.method555(0, 0, this.field481);
        if (this.field560 != -1) {
            this.method130(0, 0, class29.field963[this.field560], (byte) 67, 0);
        } else if (this.field418[this.field125] != -1) {
            this.method130(0, 0, class29.field963[this.field418[this.field125]], (byte) 67, 0);
        }
        if (this.field572 && this.field438 == 1) {
            this.method89(this.field127);
        }
        this.field508.method400((byte) -122, 205, 553, super.field11);
        this.field510.method399(true);
        class26.field884 = this.field458;
        if (arg0 != 6) {
            this.field580 = null;
        }
    }

    @OriginalMember(owner = "client", name = "r", descriptor = "(I)V")
    public final void method113(int arg0) {
        int var2 = this.field152 * 128 + 64;
        int var3 = this.field153 * 128 + 64;
        int var4 = this.method72(var3, var2, this.field548, -964) - this.field154;
        if (this.field185 < var2) {
            this.field185 += (var2 - this.field185) * this.field156 / 1000 + this.field155;
            if (this.field185 > var2) {
                this.field185 = var2;
            }
        }
        if (this.field185 > var2) {
            this.field185 -= (this.field185 - var2) * this.field156 / 1000 + this.field155;
            if (this.field185 < var2) {
                this.field185 = var2;
            }
        }
        if (this.field186 < var4) {
            this.field186 += (var4 - this.field186) * this.field156 / 1000 + this.field155;
            if (this.field186 > var4) {
                this.field186 = var4;
            }
        }
        if (this.field186 > var4) {
            this.field186 -= (this.field186 - var4) * this.field156 / 1000 + this.field155;
            if (this.field186 < var4) {
                this.field186 = var4;
            }
        }
        if (this.field187 < var3) {
            this.field187 += (var3 - this.field187) * this.field156 / 1000 + this.field155;
            if (this.field187 > var3) {
                this.field187 = var3;
            }
        }
        if (this.field187 > var3) {
            this.field187 -= (this.field187 - var3) * this.field156 / 1000 + this.field155;
            if (this.field187 < var3) {
                this.field187 = var3;
            }
        }
        int var5 = this.field261 * 128 + 64;
        int var6 = this.field262 * 128 + 64;
        int var7 = this.method72(var6, var5, this.field548, -964) - this.field263;
        int var8 = var5 - this.field185;
        int var9 = var7 - this.field186;
        int var10 = var6 - this.field187;
        int var11 = (int) Math.sqrt((double) (var8 * var8 + var10 * var10));
        int var12 = (int) (Math.atan2((double) var9, (double) var11) * 325.949D) & 2047;
        while (arg0 >= 0) {
            this.field519 = this.field363.method455();
        }
        int var13 = (int) (Math.atan2((double) var8, (double) var10) * -325.949D) & 2047;
        if (var12 < 128) {
            var12 = 128;
        }
        if (var12 > 383) {
            var12 = 383;
        }
        if (this.field188 < var12) {
            this.field188 += (var12 - this.field188) * this.field265 / 1000 + this.field264;
            if (this.field188 > var12) {
                this.field188 = var12;
            }
        }
        if (this.field188 > var12) {
            this.field188 -= (this.field188 - var12) * this.field265 / 1000 + this.field264;
            if (this.field188 < var12) {
                this.field188 = var12;
            }
        }
        int var14 = var13 - this.field189;
        if (var14 > 1024) {
            var14 -= 2048;
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (var14 > 0) {
            this.field189 += this.field265 * var14 / 1000 + this.field264;
            this.field189 &= 2047;
        }
        if (var14 < 0) {
            this.field189 -= -var14 * this.field265 / 1000 + this.field264;
            this.field189 &= 2047;
        }
        int var15 = var13 - this.field189;
        if (var15 > 1024) {
            var15 -= 2048;
        }
        if (var15 < -1024) {
            var15 += 2048;
        }
        if (var15 < 0 && var14 > 0 || var15 > 0 && var14 < 0) {
            this.field189 = var13;
        }
    }

    @OriginalMember(owner = "client", name = "s", descriptor = "(I)V")
    public final void method114(int arg0) {
        if (arg0 >= 0) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        this.method51(this.field444);
        if (this.field430 == 1) {
            this.field465[this.field429 / 100].method232(this.field427 - 8 - 4, this.field428 - 8 - 4, this.field481);
        }
        if (this.field430 == 2) {
            this.field465[this.field429 / 100 + 4].method232(this.field427 - 8 - 4, this.field428 - 8 - 4, this.field481);
        }
        if (this.field337 != -1) {
            this.method154(this.field337, this.field579, 0);
            this.method130(0, 0, class29.field963[this.field337], (byte) 67, 0);
        }
        if (this.field299 != -1) {
            this.method154(this.field299, this.field579, 0);
            this.method130(0, 0, class29.field963[this.field299], (byte) 67, 0);
        }
        this.method116((byte) 7);
        if (!this.field572) {
            this.method157(-7);
            this.method138(true);
        } else if (this.field438 == 0) {
            this.method89(this.field127);
        }
        if (this.field284 == 1) {
            this.field424.method232(472, 296, this.field481);
        }
        if (field124) {
            short var3 = 507;
            byte var4 = 20;
            int var5 = 16776960;
            if (super.field7 < 15) {
                var5 = 16711680;
            }
            this.field331.method240("Fps:" + super.field7, 799, var3, var5, var4);
            int var14 = var4 + 15;
            Runtime var6 = Runtime.getRuntime();
            int var7 = (int) ((var6.totalMemory() - var6.freeMemory()) / 1024L);
            int var8 = 16776960;
            if (var7 > 33554432 && field196) {
                int var9 = 16711680;
            }
            if (var7 > 67108864 && !field196) {
                int var10 = 16711680;
            }
            this.field331.method240("Mem:" + var7 + "k", 799, var3, 16776960, var14);
            var14 += 15;
        }
        if (this.field530 != 0) {
            int var11 = this.field530 / 50;
            int var12 = var11 / 60;
            int var13 = var11 % 60;
            if (var13 < 10) {
                this.field331.method245(16776960, 4, 329, "System update in: " + var12 + ":0" + var13, (byte) 2);
            } else {
                this.field331.method245(16776960, 4, 329, "System update in: " + var12 + ":" + var13, (byte) 2);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BLUAWAYCTK;I)V")
    private final void method115(byte arg0, class55 arg1, int arg2) {
        if (arg0 == 5) {
            boolean var4 = false;
        } else {
            this.field320.method445(105);
        }
        int var5 = arg1.method466(5, 8);
        if (var5 < this.field471) {
            for (int var6 = var5; var6 < this.field471; ++var6) {
                this.field298[this.field297++] = this.field472[var6];
            }
        }
        if (var5 > this.field471) {
            signlink.reporterror(this.field357 + " Too many players");
            throw new RuntimeException("eek");
        } else {
            this.field471 = 0;
            for (int var7 = 0; var7 < var5; ++var7) {
                int var8 = this.field472[var7];
                class56 var9 = this.field470[var8];
                int var10 = arg1.method466(5, 1);
                if (var10 == 0) {
                    this.field472[this.field471++] = var8;
                    var9.field1432 = field347;
                } else {
                    int var11 = arg1.method466(5, 2);
                    if (var11 == 0) {
                        this.field472[this.field471++] = var8;
                        var9.field1432 = field347;
                        this.field474[this.field473++] = var8;
                    } else if (var11 == 1) {
                        this.field472[this.field471++] = var8;
                        var9.field1432 = field347;
                        int var12 = arg1.method466(5, 3);
                        var9.method439(12, false, var12);
                        int var13 = arg1.method466(5, 1);
                        if (var13 == 1) {
                            this.field474[this.field473++] = var8;
                        }
                    } else if (var11 == 2) {
                        this.field472[this.field471++] = var8;
                        var9.field1432 = field347;
                        int var14 = arg1.method466(5, 3);
                        var9.method439(12, true, var14);
                        int var15 = arg1.method466(5, 3);
                        var9.method439(12, true, var15);
                        int var16 = arg1.method466(5, 1);
                        if (var16 == 1) {
                            this.field474[this.field473++] = var8;
                        }
                    } else if (var11 == 3) {
                        this.field298[this.field297++] = var8;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(B)V")
    public final void method116(byte arg0) {
        this.field478 = 0;
        int var2 = (field425.field1422 >> 7) + this.field255;
        int var3 = (field425.field1423 >> 7) + this.field256;
        if (arg0 == 7) {
            if (var2 >= 3053 && var2 <= 3156 && var3 >= 3056 && var3 <= 3136) {
                this.field478 = 1;
            }
            if (var2 >= 3072 && var2 <= 3118 && var3 >= 9492 && var3 <= 9535) {
                this.field478 = 1;
            }
            if (this.field478 == 1 && var2 >= 3139 && var2 <= 3199 && var3 >= 3008 && var3 <= 3062) {
                this.field478 = 0;
            }
        }
    }

    @OriginalMember(owner = "client", name = "l", descriptor = "(Z)V")
    public final void method117(boolean arg0) {
        if (!arg0) {
            for (int var2 = 0; var2 < this.field209; ++var2) {
                if (this.field213[var2] <= 0) {
                    boolean var3 = false;
                    try {
                        if (this.field477[var2] == this.field349 && this.field287[var2] == this.field537) {
                            if (!this.method128(this.field483)) {
                                var3 = true;
                            }
                        } else {
                            class55 var4 = class16.method220(this.field477[var2], true, this.field287[var2]);
                            if (System.currentTimeMillis() + (long) (var4.field1456 / 22) > (long) (this.field527 / 22) + this.field492) {
                                this.field527 = var4.field1456;
                                this.field492 = System.currentTimeMillis();
                                if (this.method59(var4.field1455, var4.field1456, (byte) 103)) {
                                    this.field349 = this.field477[var2];
                                    this.field537 = this.field287[var2];
                                } else {
                                    var3 = true;
                                }
                            }
                        }
                    } catch (Exception var7) {
                    }
                    if (var3 && this.field213[var2] != -5) {
                        this.field213[var2] = -5;
                    } else {
                        --this.field209;
                        for (int var6 = var2; var6 < this.field209; ++var6) {
                            this.field477[var6] = this.field477[var6 + 1];
                            this.field287[var6] = this.field287[var6 + 1];
                            this.field213[var6] = this.field213[var6 + 1];
                        }
                        --var2;
                    }
                } else {
                    int var10002 = this.field213[var2]--;
                }
            }
            if (this.field210 > 0) {
                this.field210 -= 20;
                if (this.field210 < 0) {
                    this.field210 = 0;
                }
                if (this.field210 == 0 && this.field532 && !field196) {
                    this.field369 = this.field476;
                    this.field370 = true;
                    this.field491.method184(2, this.field369);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;IILjava/lang/String;II)LRVLWVPJQ;")
    public final class50 method118(String arg0, int arg1, int arg2, String arg3, int arg4, int arg5) {
        byte[] var7 = null;
        while (arg5 >= 0) {
            this.field580 = null;
        }
        int var8 = 5;
        try {
            if (this.field434[0] != null) {
                var7 = this.field434[0].method328(-7321, arg4);
            }
        } catch (Exception var30) {
        }
        if (var7 != null) {
            this.field239.reset();
            this.field239.update(var7);
            int var9 = (int) this.field239.getValue();
            if (arg1 != var9) {
                var7 = null;
            }
        }
        if (var7 != null) {
            return new class50(34194, var7);
        } else {
            int var11 = 0;
            while (var7 == null) {
                String var12 = "Unknown error";
                this.method13(arg2, "Requesting " + arg3, false);
                Object var13 = null;
                try {
                    int var14 = 0;
                    DataInputStream var15 = this.method151(arg0 + arg1);
                    byte[] var16 = new byte[6];
                    var15.readFully(var16, 0, 6);
                    class55 var17 = new class55(741, var16);
                    var17.field1456 = 3;
                    int var18 = var17.method459() + 6;
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
                            this.method13(arg2, "Loading " + arg3 + " - " + var23 + "%", false);
                        }
                        var14 = var23;
                    }
                    var15.close();
                    try {
                        if (this.field434[0] != null) {
                            this.field434[0].method329(arg4, this.field328, var7.length, var7);
                        }
                    } catch (Exception var29) {
                        this.field434[0] = null;
                    }
                    if (var7 != null) {
                        this.field239.reset();
                        this.field239.update(var7);
                        int var24 = (int) this.field239.getValue();
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
                            this.method13(arg2, "Game updated - please reload page", false);
                            var26 = 10;
                        } else {
                            this.method13(arg2, var12 + " - Retrying in " + var26, false);
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
                    this.field180 = !this.field180;
                }
            }
            return new class50(34194, var7);
        }
    }

    @OriginalMember(owner = "client", name = "m", descriptor = "(Z)Z")
    public final boolean method119(boolean arg0) {
        if (!arg0) {
            throw new NullPointerException();
        } else if (this.field318 == null) {
            return false;
        } else {
            try {
                int var2 = this.field318.method176();
                if (var2 == 0) {
                    return false;
                }
                if (this.field519 == -1) {
                    this.field318.method177(this.field363.field1455, 0, 1);
                    this.field519 = this.field363.field1455[0] & 255;
                    if (this.field242 != null) {
                        this.field519 = this.field519 - this.field242.method518() & 255;
                    }
                    this.field518 = class44.field1267[this.field519];
                    --var2;
                }
                if (this.field518 == -1) {
                    if (var2 <= 0) {
                        return false;
                    }
                    this.field318.method177(this.field363.field1455, 0, 1);
                    this.field518 = this.field363.field1455[0] & 255;
                    --var2;
                }
                if (this.field518 == -2) {
                    if (var2 <= 1) {
                        return false;
                    }
                    this.field318.method177(this.field363.field1455, 0, 2);
                    this.field363.field1456 = 0;
                    this.field518 = this.field363.method457();
                    var2 -= 2;
                }
                if (var2 < this.field518) {
                    return false;
                }
                this.field363.field1456 = 0;
                this.field318.method177(this.field363.field1455, 0, this.field518);
                this.field520 = 0;
                this.field386 = this.field385;
                this.field385 = this.field384;
                this.field384 = this.field519;
                if (this.field519 == 203) {
                    this.field283 = this.field363.method457();
                    this.field368 = this.field363.method491((byte) 1);
                    this.field336 = this.field363.method476((byte) -50);
                    this.field514 = this.field363.method482(0);
                    this.field461 = this.field363.method474((byte) 1);
                    if (this.field368 != 0 && this.field299 == -1) {
                        signlink.dnslookup(class61.method511(this.field368, 4));
                        this.method143(false);
                        short var3 = 650;
                        if (this.field461 != 201 || this.field336 == 1) {
                            var3 = 655;
                        }
                        this.field408 = "";
                        this.field502 = false;
                        for (int var4 = 0; var4 < class29.field963.length; ++var4) {
                            if (class29.field963[var4] != null && class29.field963[var4].field952 == var3) {
                                this.field299 = class29.field963[var4].field928;
                                break;
                            }
                        }
                    }
                    this.field519 = -1;
                    return true;
                }
                if (this.field519 == 250) {
                    int var5 = this.field363.method455();
                    int var6 = this.field363.method455();
                    int var7 = this.field363.method455();
                    int var8 = this.field363.method455();
                    this.field116[var5] = true;
                    this.field544[var5] = var6;
                    this.field342[var5] = var7;
                    this.field417[var5] = var8;
                    this.field451[var5] = 0;
                    this.field519 = -1;
                    return true;
                }
                if (this.field519 == 57) {
                    if (this.field125 == 12) {
                        this.field490 = true;
                    }
                    this.field160 = this.field363.method458();
                    this.field519 = -1;
                    return true;
                }
                if (this.field519 == 198) {
                    this.field269 = this.field363.method476((byte) -50);
                    if (this.field269 == this.field125) {
                        if (this.field269 == 3) {
                            this.field125 = 1;
                        } else {
                            this.field125 = 3;
                        }
                        this.field490 = true;
                    }
                    this.field519 = -1;
                    return true;
                }
                if (this.field519 == 116 || this.field519 == 177 || this.field519 == 147 || this.field519 == 155 || this.field519 == 126 || this.field519 == 137 || this.field519 == 105 || this.field519 == 113 || this.field519 == 170 || this.field519 == 234 || this.field519 == 217) {
                    this.method124(0, this.field519, this.field363);
                    this.field519 = -1;
                    return true;
                }
                if (this.field519 == 140) {
                    this.field284 = this.field363.method455();
                    this.field519 = -1;
                    return true;
                }
                if (this.field519 == 136) {
                    int var9 = this.field363.method482(0);
                    int var10 = this.field363.method482(0);
                    int var11 = var10 >> 10 & 31;
                    int var12 = var10 >> 5 & 31;
                    int var13 = var10 & 31;
                    class29.field963[var9].field975 = (var13 << 3) + (var11 << 19) + (var12 << 11);
                    this.field519 = -1;
                    return true;
                }
                if (this.field519 == 131) {
                    this.field125 = this.field363.method455();
                    this.field490 = true;
                    this.field455 = true;
                    this.field519 = -1;
                    return true;
                }
                if (this.field519 == 158) {
                    this.field334 = false;
                    this.field561 = 2;
                    this.field339 = "";
                    this.field409 = true;
                    this.field519 = -1;
                    return true;
                }
                if (this.field519 == 36 || this.field519 == 62) {
                    int var14 = this.field555;
                    int var15 = this.field556;
                    if (this.field519 == 36) {
                        var15 = this.field363.method457();
                        var14 = this.field363.method483(17702);
                        this.field499 = false;
                    }
                    if (this.field519 == 62) {
                        var14 = this.field363.method457();
                        this.field363.method465(true);
                        int var16 = 0;
                        while (true) {
                            if (var16 >= 4) {
                                this.field363.method467(false);
                                var15 = this.field363.method483(17702);
                                this.field499 = true;
                                break;
                            }
                            for (int var17 = 0; var17 < 13; ++var17) {
                                for (int var18 = 0; var18 < 13; ++var18) {
                                    int var19 = this.field363.method466(5, 1);
                                    if (var19 == 1) {
                                        this.field569[var16][var17][var18] = this.field363.method466(5, 26);
                                    } else {
                                        this.field569[var16][var17][var18] = -1;
                                    }
                                }
                            }
                            ++var16;
                        }
                    }
                    if (this.field555 == var14 && this.field556 == var15 && this.field443 == 2) {
                        this.field519 = -1;
                        return true;
                    }
                    this.field555 = var14;
                    this.field556 = var15;
                    this.field255 = (this.field555 - 6) * 8;
                    this.field256 = (this.field556 - 6) * 8;
                    this.field161 = false;
                    if ((this.field555 / 8 == 48 || this.field555 / 8 == 49) && this.field556 / 8 == 48) {
                        this.field161 = true;
                    }
                    if (this.field555 / 8 == 48 && this.field556 / 8 == 148) {
                        this.field161 = true;
                    }
                    this.field443 = 1;
                    this.field371 = System.currentTimeMillis();
                    this.field510.method399(true);
                    this.field331.method241(151, 257, "Loading - please wait.", 0, 0);
                    this.field331.method241(150, 256, "Loading - please wait.", 0, 16777215);
                    this.field510.method400((byte) -122, 4, 4, super.field11);
                    if (this.field519 == 36) {
                        int var20 = 0;
                        int var21 = (this.field555 - 6) / 8;
                        label1190: while (true) {
                            if (var21 > (this.field555 + 6) / 8) {
                                this.field163 = new byte[var20][];
                                this.field504 = new byte[var20][];
                                this.field272 = new int[var20];
                                this.field273 = new int[var20];
                                this.field274 = new int[var20];
                                int var23 = 0;
                                int var24 = (this.field555 - 6) / 8;
                                while (true) {
                                    if (var24 > (this.field555 + 6) / 8) {
                                        break label1190;
                                    }
                                    for (int var25 = (this.field556 - 6) / 8; var25 <= (this.field556 + 6) / 8; ++var25) {
                                        this.field272[var23] = (var24 << 8) + var25;
                                        if (!this.field161 || var25 != 49 && var25 != 149 && var25 != 147 && var24 != 50 && (var24 != 49 || var25 != 47)) {
                                            int var26 = this.field273[var23] = this.field491.method199(var25, 0, -306, var24);
                                            if (var26 != -1) {
                                                this.field491.method184(3, var26);
                                            }
                                            int var27 = this.field274[var23] = this.field491.method199(var25, 1, -306, var24);
                                            if (var27 != -1) {
                                                this.field491.method184(3, var27);
                                            }
                                            ++var23;
                                        } else {
                                            this.field273[var23] = -1;
                                            this.field274[var23] = -1;
                                            ++var23;
                                        }
                                    }
                                    ++var24;
                                }
                            }
                            for (int var22 = (this.field556 - 6) / 8; var22 <= (this.field556 + 6) / 8; ++var22) {
                                ++var20;
                            }
                            ++var21;
                        }
                    }
                    if (this.field519 == 62) {
                        int var28 = 0;
                        int[] var29 = new int[676];
                        int var30 = 0;
                        label1149: while (true) {
                            if (var30 >= 4) {
                                this.field163 = new byte[var28][];
                                this.field504 = new byte[var28][];
                                this.field272 = new int[var28];
                                this.field273 = new int[var28];
                                this.field274 = new int[var28];
                                int var38 = 0;
                                while (true) {
                                    if (var38 >= var28) {
                                        break label1149;
                                    }
                                    int var39 = this.field272[var38] = var29[var38];
                                    int var40 = var39 >> 8 & 255;
                                    int var41 = var39 & 255;
                                    int var42 = this.field273[var38] = this.field491.method199(var41, 0, -306, var40);
                                    if (var42 != -1) {
                                        this.field491.method184(3, var42);
                                    }
                                    int var43 = this.field274[var38] = this.field491.method199(var41, 1, -306, var40);
                                    if (var43 != -1) {
                                        this.field491.method184(3, var43);
                                    }
                                    ++var38;
                                }
                            }
                            for (int var31 = 0; var31 < 13; ++var31) {
                                for (int var32 = 0; var32 < 13; ++var32) {
                                    int var33 = this.field569[var30][var31][var32];
                                    if (var33 != -1) {
                                        int var34 = var33 >> 14 & 1023;
                                        int var35 = var33 >> 3 & 2047;
                                        int var36 = (var34 / 8 << 8) + var35 / 8;
                                        for (int var37 = 0; var37 < var28; ++var37) {
                                            if (var29[var37] == var36) {
                                                var36 = -1;
                                                break;
                                            }
                                        }
                                        if (var36 != -1) {
                                            var29[var28++] = var36;
                                        }
                                    }
                                }
                            }
                            ++var30;
                        }
                    }
                    int var44 = this.field255 - this.field257;
                    int var45 = this.field256 - this.field258;
                    this.field257 = this.field255;
                    this.field258 = this.field256;
                    for (int var46 = 0; var46 < 16384; ++var46) {
                        class25 var47 = this.field365[var46];
                        if (var47 != null) {
                            for (int var48 = 0; var48 < 10; ++var48) {
                                var47.field1415[var48] -= var44;
                                var47.field1416[var48] -= var45;
                            }
                            var47.field1422 -= var44 * 128;
                            var47.field1423 -= var45 * 128;
                        }
                    }
                    for (int var49 = 0; var49 < this.field468; ++var49) {
                        class56 var50 = this.field470[var49];
                        if (var50 != null) {
                            for (int var51 = 0; var51 < 10; ++var51) {
                                var50.field1415[var51] -= var44;
                                var50.field1416[var51] -= var45;
                            }
                            var50.field1422 -= var44 * 128;
                            var50.field1423 -= var45 * 128;
                        }
                    }
                    this.field277 = true;
                    byte var52 = 0;
                    byte var53 = 104;
                    byte var54 = 1;
                    if (var44 < 0) {
                        var52 = 103;
                        var53 = -1;
                        var54 = -1;
                    }
                    byte var55 = 0;
                    byte var56 = 104;
                    byte var57 = 1;
                    if (var45 < 0) {
                        var55 = 103;
                        var56 = -1;
                        var57 = -1;
                    }
                    for (int var58 = var52; var53 != var58; var58 += var54) {
                        for (int var59 = var55; var56 != var59; var59 += var57) {
                            int var60 = var44 + var58;
                            int var61 = var45 + var59;
                            for (int var62 = 0; var62 < 4; ++var62) {
                                if (var60 >= 0 && var61 >= 0 && var60 < 104 && var61 < 104) {
                                    this.field580[var62][var58][var59] = this.field580[var62][var60][var61];
                                } else {
                                    this.field580[var62][var58][var59] = null;
                                }
                            }
                        }
                    }
                    for (class8 var63 = (class8) this.field463.method503(); var63 != null; var63 = (class8) this.field463.method505(false)) {
                        var63.field624 -= var44;
                        var63.field625 -= var45;
                        if (var63.field624 < 0 || var63.field625 < 0 || var63.field624 >= 104 || var63.field625 >= 104) {
                            var63.method398();
                        }
                    }
                    if (this.field400 != 0) {
                        this.field400 -= var44;
                        this.field401 -= var45;
                    }
                    this.field267 = false;
                    this.field519 = -1;
                    return true;
                }
                if (this.field519 == 90) {
                    this.field410 = this.field363.method455();
                    if (this.field410 == 1) {
                        this.field268 = this.field363.method457();
                    }
                    if (this.field410 >= 2 && this.field410 <= 6) {
                        if (this.field410 == 2) {
                            this.field226 = 64;
                            this.field227 = 64;
                        }
                        if (this.field410 == 3) {
                            this.field226 = 0;
                            this.field227 = 64;
                        }
                        if (this.field410 == 4) {
                            this.field226 = 128;
                            this.field227 = 64;
                        }
                        if (this.field410 == 5) {
                            this.field226 = 64;
                            this.field227 = 0;
                        }
                        if (this.field410 == 6) {
                            this.field226 = 64;
                            this.field227 = 128;
                        }
                        this.field410 = 2;
                        this.field223 = this.field363.method457();
                        this.field224 = this.field363.method457();
                        this.field225 = this.field363.method455();
                    }
                    if (this.field410 == 10) {
                        this.field353 = this.field363.method457();
                    }
                    this.field519 = -1;
                    return true;
                }
                if (this.field519 == 31) {
                    int var64 = this.field363.method458();
                    int var65 = this.field363.method486(-164);
                    int var66 = this.field363.method457();
                    class29 var67 = class29.field963[var66];
                    var67.field930 = var64;
                    var67.field935 = var65;
                    this.field519 = -1;
                    return true;
                }
                if (this.field519 == 190) {
                    int var68 = this.field363.method484(false);
                    int var69 = this.field363.method484(false);
                    class29.field963[var68].field913 = 1;
                    class29.field963[var68].field914 = var69;
                    this.field519 = -1;
                    return true;
                }
                if (this.field519 == 132) {
                    int var70 = this.field363.method457();
                    int var71 = this.field363.method483(17702);
                    int var72 = this.field363.method483(17702);
                    class29.field963[var72].field925 = (var70 << 16) + var71;
                    this.field519 = -1;
                    return true;
                }
                if (this.field519 == 0) {
                    this.field448 = this.field363.method455();
                    this.field490 = true;
                    this.field519 = -1;
                    return true;
                }
                if (this.field519 == 8) {
                    int var73 = this.field363.method484(false);
                    int var74 = this.field363.method490(506);
                    this.field352[var73] = var74;
                    if (this.field286[var73] != var74) {
                        this.field286[var73] = var74;
                        this.method165(this.field221, var73);
                        this.field490 = true;
                        if (this.field126 != -1) {
                            this.field409 = true;
                        }
                    }
                    this.field519 = -1;
                    return true;
                }
                if (this.field519 == 161) {
                    this.method137(this.field363, this.field518, false);
                    this.field277 = false;
                    this.field519 = -1;
                    return true;
                }
                if (this.field519 == 2) {
                    this.field334 = false;
                    this.field561 = 1;
                    this.field339 = "";
                    this.field409 = true;
                    this.field519 = -1;
                    return true;
                }
                if (this.field519 == 75) {
                    this.field378 = this.field363.method455();
                    this.field379 = this.field363.method474((byte) 1);
                    for (int var75 = this.field378; var75 < this.field378 + 8; ++var75) {
                        for (int var76 = this.field379; var76 < this.field379 + 8; ++var76) {
                            if (this.field580[this.field548][var75][var76] != null) {
                                this.field580[this.field548][var75][var76] = null;
                                this.method66(var75, var76);
                            }
                        }
                    }
                    for (class8 var77 = (class8) this.field463.method503(); var77 != null; var77 = (class8) this.field463.method505(false)) {
                        if (var77.field624 >= this.field378 && var77.field624 < this.field378 + 8 && var77.field625 >= this.field379 && var77.field625 < this.field379 + 8 && this.field548 == var77.field622) {
                            var77.field620 = 0;
                        }
                    }
                    this.field519 = -1;
                    return true;
                }
                if (this.field519 == 145) {
                    this.field267 = true;
                    this.field152 = this.field363.method455();
                    this.field153 = this.field363.method455();
                    this.field154 = this.field363.method457();
                    this.field155 = this.field363.method455();
                    this.field156 = this.field363.method455();
                    if (this.field156 >= 100) {
                        this.field185 = this.field152 * 128 + 64;
                        this.field187 = this.field153 * 128 + 64;
                        this.field186 = this.method72(this.field187, this.field185, this.field548, -964) - this.field154;
                    }
                    this.field519 = -1;
                    return true;
                }
                if (this.field519 == 12) {
                    int var78 = this.field363.method484(false);
                    this.method136(var78, true);
                    this.field299 = -1;
                    this.field560 = -1;
                    this.field338 = -1;
                    this.field561 = 0;
                    this.field503 = false;
                    this.field534 = var78;
                    this.field519 = -1;
                    return true;
                }
                if (this.field519 == 35) {
                    this.field549 = this.field363.method455();
                    this.field519 = -1;
                    return true;
                }
                if (this.field519 == 168) {
                    this.field267 = false;
                    for (int var79 = 0; var79 < 5; ++var79) {
                        this.field116[var79] = false;
                    }
                    this.field519 = -1;
                    return true;
                }
                if (this.field519 == 253) {
                    this.field400 = 0;
                    this.field519 = -1;
                    return true;
                }
                if (this.field519 == 207) {
                    this.field490 = true;
                    int var80 = this.field363.method457();
                    class29 var81 = class29.field963[var80];
                    while (this.field363.field1456 < this.field518) {
                        int var82 = this.field363.method469();
                        int var83 = this.field363.method457();
                        int var84 = this.field363.method455();
                        if (var84 == 255) {
                            var84 = this.field363.method460();
                        }
                        if (var82 >= 0 && var82 < var81.field967.length) {
                            var81.field967[var82] = var83;
                            var81.field918[var82] = var84;
                        }
                    }
                    this.field519 = -1;
                    return true;
                }
                if (this.field519 == 247) {
                    long var85 = this.field363.method461((byte) -26);
                    int var87 = this.field363.method460();
                    int var88 = this.field363.method455();
                    boolean var89 = false;
                    for (int var90 = 0; var90 < 100; ++var90) {
                        if (this.field362[var90] == var87) {
                            var89 = true;
                            break;
                        }
                    }
                    if (var88 <= 1) {
                        for (int var91 = 0; var91 < this.field253; ++var91) {
                            if (this.field399[var91] == var85) {
                                var89 = true;
                                break;
                            }
                        }
                    }
                    if (!var89 && this.field478 == 0) {
                        try {
                            this.field362[this.field109] = var87;
                            this.field109 = (this.field109 + 1) % 100;
                            String var92 = class6.method37(this.field363, 0, this.field518 - 13);
                            if (var88 != 3) {
                                var92 = class72.method567(76, var92);
                            }
                            if (var88 != 2 && var88 != 3) {
                                if (var88 == 1) {
                                    this.method104("@cr1@" + class61.method512(false, class61.method509(this.field533, var85)), var92, 7, this.field341);
                                } else {
                                    this.method104(class61.method512(false, class61.method509(this.field533, var85)), var92, 3, this.field341);
                                }
                            } else {
                                this.method104("@cr2@" + class61.method512(false, class61.method509(this.field533, var85)), var92, 7, this.field341);
                            }
                        } catch (Exception var191) {
                            signlink.reporterror("cde1");
                        }
                    }
                    this.field519 = -1;
                    return true;
                }
                if (this.field519 == 19) {
                    for (int var94 = 0; var94 < this.field286.length; ++var94) {
                        if (this.field352[var94] != this.field286[var94]) {
                            this.field286[var94] = this.field352[var94];
                            this.method165(this.field221, var94);
                            this.field490 = true;
                        }
                    }
                    this.field519 = -1;
                    return true;
                }
                if (this.field519 == 25) {
                    int var95 = this.field363.method458();
                    if (var95 >= 0) {
                        this.method136(var95, true);
                    }
                    this.field337 = var95;
                    this.field519 = -1;
                    return true;
                }
                if (this.field519 == 58) {
                    this.method148(this.field363, this.field518, 160);
                    this.field519 = -1;
                    return true;
                }
                if (this.field519 == 72) {
                    boolean var96 = this.field363.method474((byte) 1) == 1;
                    int var97 = this.field363.method482(0);
                    class29.field963[var97].field976 = var96;
                    this.field519 = -1;
                    return true;
                }
                if (this.field519 == 11) {
                    this.field375 = this.field363.method483(17702);
                    this.field374 = this.field363.method476((byte) -50);
                    this.field519 = -1;
                    return true;
                }
                if (this.field519 == 135) {
                    this.field490 = true;
                    int var98 = this.field363.method457();
                    class29 var99 = class29.field963[var98];
                    int var100 = this.field363.method457();
                    for (int var101 = 0; var101 < var100; ++var101) {
                        var99.field967[var101] = this.field363.method483(17702);
                        int var102 = this.field363.method475((byte) 16);
                        if (var102 == 255) {
                            var102 = this.field363.method489(false);
                        }
                        var99.field918[var101] = var102;
                    }
                    for (int var103 = var100; var103 < var99.field967.length; ++var103) {
                        var99.field967[var103] = 0;
                        var99.field918[var103] = 0;
                    }
                    this.field519 = -1;
                    return true;
                }
                if (this.field519 == 193) {
                    String var104 = this.field363.method462();
                    if (var104.endsWith(":tradereq:")) {
                        String var105 = var104.substring(0, var104.indexOf(":"));
                        long var106 = class61.method508(var105);
                        boolean var108 = false;
                        for (int var109 = 0; var109 < this.field253; ++var109) {
                            if (this.field399[var109] == var106) {
                                var108 = true;
                                break;
                            }
                        }
                        if (!var108 && this.field478 == 0) {
                            this.method104(var105, "wishes to trade with you.", 4, this.field341);
                        }
                    } else if (var104.endsWith(":duelreq:")) {
                        String var110 = var104.substring(0, var104.indexOf(":"));
                        long var111 = class61.method508(var110);
                        boolean var113 = false;
                        for (int var114 = 0; var114 < this.field253; ++var114) {
                            if (this.field399[var114] == var111) {
                                var113 = true;
                                break;
                            }
                        }
                        if (!var113 && this.field478 == 0) {
                            this.method104(var110, "wishes to duel with you.", 8, this.field341);
                        }
                    } else if (!var104.endsWith(":chalreq:")) {
                        this.method104("", var104, 0, this.field341);
                    } else {
                        String var115 = var104.substring(0, var104.indexOf(":"));
                        long var116 = class61.method508(var115);
                        boolean var118 = false;
                        for (int var119 = 0; var119 < this.field253; ++var119) {
                            if (this.field399[var119] == var116) {
                                var118 = true;
                                break;
                            }
                        }
                        if (!var118 && this.field478 == 0) {
                            String var120 = var104.substring(var104.indexOf(":") + 1, var104.length() - 9);
                            this.method104(var115, var120, 8, this.field341);
                        }
                    }
                    this.field519 = -1;
                    return true;
                }
                if (this.field519 == 182) {
                    byte var121 = this.field363.method477(this.field245);
                    int var122 = this.field363.method484(false);
                    this.field352[var122] = var121;
                    if (this.field286[var122] != var121) {
                        this.field286[var122] = var121;
                        this.method165(this.field221, var122);
                        this.field490 = true;
                        if (this.field126 != -1) {
                            this.field409 = true;
                        }
                    }
                    this.field519 = -1;
                    return true;
                }
                if (this.field519 == 187) {
                    this.field378 = this.field363.method455();
                    this.field379 = this.field363.method475((byte) 16);
                    while (this.field363.field1456 < this.field518) {
                        int var123 = this.field363.method455();
                        this.method124(0, var123, this.field363);
                    }
                    this.field519 = -1;
                    return true;
                }
                if (this.field519 == 178) {
                    int var124 = this.field363.method457();
                    int var125 = this.field363.method482(0);
                    if (this.field338 != -1) {
                        this.field338 = -1;
                        this.field409 = true;
                    }
                    if (this.field561 != 0) {
                        this.field561 = 0;
                        this.field409 = true;
                    }
                    this.field299 = var124;
                    this.field560 = var125;
                    this.field490 = true;
                    this.field455 = true;
                    this.field503 = false;
                    this.field519 = -1;
                    return true;
                }
                if (this.field519 == 205) {
                    for (int var126 = 0; var126 < this.field470.length; ++var126) {
                        if (this.field470[var126] != null) {
                            this.field470[var126].field1382 = -1;
                        }
                    }
                    for (int var127 = 0; var127 < this.field365.length; ++var127) {
                        if (this.field365[var127] != null) {
                            this.field365[var127].field1382 = -1;
                        }
                    }
                    this.field519 = -1;
                    return true;
                }
                if (this.field519 == 33) {
                    int var128 = this.field363.method484(false);
                    int var129 = this.field363.method486(-164);
                    class29 var130 = class29.field963[var128];
                    if (var130.field954 != var129 || var129 == -1) {
                        var130.field954 = var129;
                        var130.field972 = 0;
                        var130.field974 = 0;
                    }
                    this.field519 = -1;
                    return true;
                }
                if (this.field519 == 39) {
                    int var131 = this.field363.method483(17702);
                    int var132 = this.field363.method457();
                    int var133 = this.field363.method457();
                    int var134 = this.field363.method482(0);
                    class29.field963[var133].field947 = var134;
                    class29.field963[var133].field948 = var131;
                    class29.field963[var133].field946 = var132;
                    this.field519 = -1;
                    return true;
                }
                if (this.field519 == 91) {
                    this.field253 = this.field518 / 8;
                    for (int var135 = 0; var135 < this.field253; ++var135) {
                        this.field399[var135] = this.field363.method461((byte) -26);
                    }
                    this.field519 = -1;
                    return true;
                }
                if (this.field519 == 38) {
                    int var136 = this.field363.method482(0);
                    int var137 = this.field363.method483(17702);
                    class29.field963[var137].field913 = 2;
                    class29.field963[var137].field914 = var136;
                    this.field519 = -1;
                    return true;
                }
                if (this.field519 == 87) {
                    int var138 = this.field363.method482(0);
                    this.method136(var138, true);
                    if (this.field338 != -1) {
                        this.field338 = -1;
                        this.field409 = true;
                    }
                    if (this.field561 != 0) {
                        this.field561 = 0;
                        this.field409 = true;
                    }
                    if (this.field534 != -1) {
                        this.field534 = -1;
                        this.field412 = true;
                    }
                    this.field560 = var138;
                    this.field490 = true;
                    this.field455 = true;
                    this.field299 = -1;
                    this.field503 = false;
                    this.field519 = -1;
                    return true;
                }
                if (this.field519 == 184) {
                    long var139 = this.field363.method461((byte) -26);
                    int var141 = this.field363.method455();
                    String var142 = class61.method512(false, class61.method509(this.field533, var139));
                    for (int var143 = 0; var143 < this.field447; ++var143) {
                        if (this.field313[var143] == var139) {
                            if (this.field162[var143] != var141) {
                                this.field162[var143] = var141;
                                this.field490 = true;
                                if (var141 > 0) {
                                    this.method104("", var142 + " has logged in.", 5, this.field341);
                                }
                                if (var141 == 0) {
                                    this.method104("", var142 + " has logged out.", 5, this.field341);
                                }
                            }
                            var142 = null;
                            break;
                        }
                    }
                    if (var142 != null && this.field447 < 200) {
                        this.field313[this.field447] = var139;
                        this.field581[this.field447] = var142;
                        this.field162[this.field447] = var141;
                        ++this.field447;
                        this.field490 = true;
                    }
                    boolean var144 = false;
                    while (!var144) {
                        var144 = true;
                        for (int var145 = 0; var145 < this.field447 - 1; ++var145) {
                            if (this.field162[var145] != field193 && this.field162[var145 + 1] == field193 || this.field162[var145] == 0 && this.field162[var145 + 1] != 0) {
                                int var146 = this.field162[var145];
                                this.field162[var145] = this.field162[var145 + 1];
                                this.field162[var145 + 1] = var146;
                                String var147 = this.field581[var145];
                                this.field581[var145] = this.field581[var145 + 1];
                                this.field581[var145 + 1] = var147;
                                long var148 = this.field313[var145];
                                this.field313[var145] = this.field313[var145 + 1];
                                this.field313[var145 + 1] = var148;
                                this.field490 = true;
                                var144 = false;
                            }
                        }
                    }
                    this.field519 = -1;
                    return true;
                }
                if (this.field519 == 189) {
                    this.field571 = this.field363.method455();
                    this.field354 = this.field363.method455();
                    this.field516 = this.field363.method455();
                    this.field459 = true;
                    this.field409 = true;
                    this.field519 = -1;
                    return true;
                }
                if (this.field519 == 220) {
                    int var150 = this.field363.method482(0);
                    class29.field963[var150].field913 = 3;
                    if (field425.field1481 == null) {
                        class29.field963[var150].field914 = (field425.field1471[11] << 5) + (field425.field1471[8] << 10) + (field425.field1471[0] << 15) + (field425.field1476[0] << 25) + (field425.field1476[4] << 20) + field425.field1471[1];
                    } else {
                        class29.field963[var150].field914 = (int) (field425.field1481.field831 + 305419896L);
                    }
                    this.field519 = -1;
                    return true;
                }
                if (this.field519 == 238) {
                    this.field530 = this.field363.method483(17702) * 30;
                    this.field519 = -1;
                    return true;
                }
                if (this.field519 == 4) {
                    this.field379 = this.field363.method476((byte) -50);
                    this.field378 = this.field363.method455();
                    this.field519 = -1;
                    return true;
                }
                if (this.field519 == 197) {
                    int var151 = this.field363.method485((byte) 7);
                    this.field126 = var151;
                    this.field409 = true;
                    this.field519 = -1;
                    return true;
                }
                if (this.field519 == 77) {
                    int var152 = this.field363.method457();
                    int var153 = this.field363.method455();
                    if (var152 == 65535) {
                        var152 = -1;
                    }
                    this.field418[var153] = var152;
                    this.field490 = true;
                    this.field455 = true;
                    this.field519 = -1;
                    return true;
                }
                if (this.field519 == 20) {
                    if (this.field125 == 12) {
                        this.field490 = true;
                    }
                    this.field212 = this.field363.method455();
                    this.field519 = -1;
                    return true;
                }
                if (this.field519 == 10) {
                    if (this.field560 != -1) {
                        this.field560 = -1;
                        this.field490 = true;
                        this.field455 = true;
                    }
                    if (this.field338 != -1) {
                        this.field338 = -1;
                        this.field409 = true;
                    }
                    if (this.field534 != -1) {
                        this.field534 = -1;
                        this.field412 = true;
                    }
                    if (this.field561 != 0) {
                        this.field561 = 0;
                        this.field409 = true;
                    }
                    this.field299 = -1;
                    this.field503 = false;
                    this.field519 = -1;
                    return true;
                }
                if (this.field519 == 48) {
                    this.field267 = true;
                    this.field261 = this.field363.method455();
                    this.field262 = this.field363.method455();
                    this.field263 = this.field363.method457();
                    this.field264 = this.field363.method455();
                    this.field265 = this.field363.method455();
                    if (this.field265 >= 100) {
                        int var154 = this.field261 * 128 + 64;
                        int var155 = this.field262 * 128 + 64;
                        int var156 = this.method72(var155, var154, this.field548, -964) - this.field263;
                        int var157 = var154 - this.field185;
                        int var158 = var156 - this.field186;
                        int var159 = var155 - this.field187;
                        int var160 = (int) Math.sqrt((double) (var157 * var157 + var159 * var159));
                        this.field188 = (int) (Math.atan2((double) var158, (double) var160) * 325.949D) & 2047;
                        this.field189 = (int) (Math.atan2((double) var157, (double) var159) * -325.949D) & 2047;
                        if (this.field188 < 128) {
                            this.field188 = 128;
                        }
                        if (this.field188 > 383) {
                            this.field188 = 383;
                        }
                    }
                    this.field519 = -1;
                    return true;
                }
                if (this.field519 == 175) {
                    int var161 = this.field363.method482(0);
                    class29 var162 = class29.field963[var161];
                    for (int var163 = 0; var163 < var162.field967.length; ++var163) {
                        var162.field967[var163] = -1;
                        var162.field967[var163] = 0;
                    }
                    this.field519 = -1;
                    return true;
                }
                if (this.field519 == 166) {
                    int var164 = this.field363.method483(17702);
                    this.method136(var164, true);
                    if (this.field560 != -1) {
                        this.field560 = -1;
                        this.field490 = true;
                        this.field455 = true;
                    }
                    if (this.field534 != -1) {
                        this.field534 = -1;
                        this.field412 = true;
                    }
                    this.field338 = var164;
                    this.field409 = true;
                    this.field299 = -1;
                    this.field503 = false;
                    this.field519 = -1;
                    return true;
                }
                if (this.field519 == 139) {
                    this.method78(true);
                    this.field519 = -1;
                    return false;
                }
                if (this.field519 == 119) {
                    String var165 = this.field363.method462();
                    int var166 = this.field363.method457();
                    class29.field963[var166].field978 = var165;
                    if (this.field418[this.field125] == class29.field963[var166].field928) {
                        this.field490 = true;
                    }
                    this.field519 = -1;
                    return true;
                }
                if (this.field519 == 85) {
                    int var167 = this.field363.method475((byte) 16);
                    String var168 = this.field363.method462();
                    int var169 = this.field363.method455();
                    if (var167 >= 1 && var167 <= 5) {
                        if (var168.equalsIgnoreCase("null")) {
                            var168 = null;
                        }
                        this.field129[var167 - 1] = var168;
                        this.field130[var167 - 1] = var169 == 0;
                    }
                    this.field519 = -1;
                    return true;
                }
                if (this.field519 == 52) {
                    int var170 = this.field363.method482(0);
                    if (var170 == 65535) {
                        var170 = -1;
                    }
                    if (this.field476 != var170 && this.field532 && !field196 && this.field210 == 0) {
                        this.field369 = var170;
                        this.field370 = true;
                        this.field491.method184(2, this.field369);
                    }
                    this.field476 = var170;
                    this.field519 = -1;
                    return true;
                }
                if (this.field519 == 146) {
                    int var171 = this.field363.method487((byte) -33);
                    int var172 = this.field363.method457();
                    if (this.field532 && !field196) {
                        this.field369 = var172;
                        this.field370 = false;
                        this.field491.method184(2, this.field369);
                        this.field210 = var171;
                    }
                    this.field519 = -1;
                    return true;
                }
                if (this.field519 == 60) {
                    this.field490 = true;
                    int var173 = this.field363.method490(506);
                    int var174 = this.field363.method475((byte) 16);
                    int var175 = this.field363.method475((byte) 16);
                    this.field282[var174] = var173;
                    this.field178[var174] = var175;
                    this.field216[var174] = 1;
                    for (int var176 = 0; var176 < 98; ++var176) {
                        if (var173 >= field462[var176]) {
                            this.field216[var174] = var176 + 2;
                        }
                    }
                    this.field519 = -1;
                    return true;
                }
                if (this.field519 == 208) {
                    int var177 = this.field363.method457();
                    int var178 = this.field363.method455();
                    int var179 = this.field363.method457();
                    if (this.field244 && !field196 && this.field209 < 50) {
                        this.field477[this.field209] = var177;
                        this.field287[this.field209] = var178;
                        this.field213[this.field209] = class16.field726[var177] + var179;
                        ++this.field209;
                    }
                    this.field519 = -1;
                    return true;
                }
                if (this.field519 == 5) {
                    int var180 = this.field363.method483(17702);
                    int var181 = this.field363.method484(false);
                    class29 var182 = class29.field963[var180];
                    if (var182 != null && var182.field921 == 0) {
                        if (var181 < 0) {
                            var181 = 0;
                        }
                        if (var181 > var182.field956 - var182.field979) {
                            var181 = var182.field956 - var182.field979;
                        }
                        var182.field920 = var181;
                    }
                    this.field519 = -1;
                    return true;
                }
                if (this.field519 == 111) {
                    int var183 = this.field363.method482(0);
                    this.method136(var183, true);
                    if (this.field560 != -1) {
                        this.field560 = -1;
                        this.field490 = true;
                        this.field455 = true;
                    }
                    if (this.field338 != -1) {
                        this.field338 = -1;
                        this.field409 = true;
                    }
                    if (this.field534 != -1) {
                        this.field534 = -1;
                        this.field412 = true;
                    }
                    if (this.field561 != 0) {
                        this.field561 = 0;
                        this.field409 = true;
                    }
                    this.field299 = var183;
                    this.field503 = false;
                    this.field519 = -1;
                    return true;
                }
                if (this.field519 == 142) {
                    int var184 = this.field363.method484(false);
                    int var185 = this.field363.method483(17702);
                    int var186 = this.field363.method482(0);
                    if (var186 == 65535) {
                        class29.field963[var185].field913 = 0;
                        this.field519 = -1;
                        return true;
                    }
                    class31 var187 = class31.method322(var186);
                    class29.field963[var185].field913 = 4;
                    class29.field963[var185].field914 = var186;
                    class29.field963[var185].field947 = var187.field1010;
                    class29.field963[var185].field948 = var187.field1006;
                    class29.field963[var185].field946 = var187.field1035 * 100 / var184;
                    this.field519 = -1;
                    return true;
                }
                signlink.reporterror("T1 - " + this.field519 + "," + this.field518 + " - " + this.field385 + "," + this.field386);
                this.method78(true);
            } catch (IOException var192) {
                this.method150(false);
            } catch (Exception var193) {
                String var189 = "T2 - " + this.field519 + "," + this.field385 + "," + this.field386 + " - " + this.field518 + "," + (field425.field1415[0] + this.field255) + "," + (field425.field1416[0] + this.field256) + " - ";
                for (int var190 = 0; var190 < this.field518 && var190 < 50; ++var190) {
                    var189 = var189 + this.field363.field1455[var190] + ",";
                }
                signlink.reporterror(var189);
                this.method78(true);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIIIILLYHLTGUG;I)V")
    public final void method120(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class29 arg7, int arg8) {
        if (arg6 != 44345) {
            this.field580 = null;
        }
        if (this.field260) {
            this.field270 = 32;
        } else {
            this.field270 = 0;
        }
        this.field260 = false;
        if (arg2 >= arg4 && arg2 < arg4 + 16 && arg8 >= arg3 && arg8 < arg3 + 16) {
            arg7.field920 -= this.field211 * 4;
            if (arg5 == 1) {
                this.field490 = true;
            }
            if (arg5 == 2 || arg5 == 3) {
                this.field409 = true;
            }
        } else if (arg2 >= arg4 && arg2 < arg4 + 16 && arg8 >= arg0 + arg3 - 16 && arg8 < arg0 + arg3) {
            arg7.field920 += this.field211 * 4;
            if (arg5 == 1) {
                this.field490 = true;
            }
            if (arg5 == 2 || arg5 == 3) {
                this.field409 = true;
            }
        } else if (arg2 >= arg4 - this.field270 && arg2 < arg4 + 16 + this.field270 && arg8 >= arg3 + 16 && arg8 < arg0 + arg3 - 16 && this.field211 > 0) {
            int var10 = (arg0 - 32) * arg0 / arg1;
            if (var10 < 8) {
                var10 = 8;
            }
            int var11 = arg8 - arg3 - 16 - var10 / 2;
            int var12 = arg0 - 32 - var10;
            arg7.field920 = (arg1 - arg0) * var11 / var12;
            if (arg5 == 1) {
                this.field490 = true;
            }
            if (arg5 == 2 || arg5 == 3) {
                this.field409 = true;
            }
            this.field260 = true;
        }
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(II)Ljava/lang/String;")
    private static final String method121(int arg0, int arg1) {
        if (arg0 <= 0) {
            throw new NullPointerException();
        } else if (arg1 < 100000) {
            return String.valueOf(arg1);
        } else {
            return arg1 < 10000000 ? arg1 / 1000 + "K" : arg1 / 1000000 + "M";
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BZ)V")
    public final void method122(byte arg0, boolean arg1) {
        if (arg0 == 2) {
            boolean var3 = false;
        } else {
            this.field432 = 116;
        }
        for (int var4 = 0; var4 < this.field366; ++var4) {
            class25 var5 = this.field365[this.field367[var4]];
            int var6 = (this.field367[var4] << 14) + 536870912;
            if (var5 != null && var5.method287(false) && var5.field871.field859 == arg1 && var5.field871.method280(false)) {
                int var7 = var5.field1422 >> 7;
                int var8 = var5.field1423 >> 7;
                if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                    if (var5.field1417 == 1 && (var5.field1422 & 127) == 64 && (var5.field1423 & 127) == 64) {
                        if (this.field538[var7][var8] == this.field329) {
                            continue;
                        }
                        this.field538[var7][var8] = this.field329;
                    }
                    if (!var5.field871.field829) {
                        var6 += Integer.MIN_VALUE;
                    }
                    this.field383.method353((var5.field1417 - 1) * 64 + 60, var5.field1422, var5.field1424, var6, 8, this.method72(var5.field1423, var5.field1422, this.field548, -964), this.field548, var5.field1423, var5, var5.field1421);
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "t", descriptor = "(I)V")
    public final void method123(int arg0) {
        this.field518 += arg0;
        signlink.midiplay = false;
        signlink.midifade = 0;
        signlink.midi = "stop";
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IILUAWAYCTK;)V")
    public final void method124(int arg0, int arg1, class55 arg2) {
        if (arg0 != 0) {
            this.field398 = this.field242.method518();
        }
        if (arg1 == 105) {
            int var4 = arg2.method474((byte) 1);
            int var5 = (var4 >> 4 & 7) + this.field378;
            int var6 = (var4 & 7) + this.field379;
            int var7 = arg2.method484(false);
            if (var5 >= 0 && var6 >= 0 && var5 < 104 && var6 < 104) {
                class58 var8 = this.field580[this.field548][var5][var6];
                if (var8 != null) {
                    for (class27 var9 = (class27) var8.method503(); var9 != null; var9 = (class27) var8.method505(false)) {
                        if ((var7 & 32767) == var9.field896) {
                            var9.method398();
                            break;
                        }
                    }
                    if (var8.method503() == null) {
                        this.field580[this.field548][var5][var6] = null;
                    }
                    this.method66(var5, var6);
                }
            }
        } else {
            if (arg1 == 147) {
                byte var10 = arg2.method477(this.field245);
                int var11 = arg2.method484(false);
                int var12 = arg2.method483(17702);
                byte var13 = arg2.method478((byte) 8);
                int var14 = arg2.method455();
                int var15 = (var14 >> 4 & 7) + this.field378;
                int var16 = (var14 & 7) + this.field379;
                byte var17 = arg2.method478((byte) 8);
                int var18 = arg2.method476((byte) -50);
                int var19 = var18 >> 2;
                int var20 = var18 & 3;
                int var21 = this.field570[var19];
                byte var22 = arg2.method477(this.field245);
                int var23 = arg2.method484(false);
                int var24 = arg2.method457();
                class56 var25;
                if (this.field375 == var12) {
                    var25 = field425;
                } else {
                    var25 = this.field470[var12];
                }
                if (var25 != null) {
                    class4 var26 = class4.method24(var11);
                    int var27 = this.field360[this.field548][var15][var16];
                    int var28 = this.field360[this.field548][var15 + 1][var16];
                    int var29 = this.field360[this.field548][var15 + 1][var16 + 1];
                    int var30 = this.field360[this.field548][var15][var16 + 1];
                    class66 var31 = var26.method20(var19, var20, var27, var28, var29, var30, -1);
                    if (var31 != null) {
                        this.method50(-558, 0, this.field548, var23 + 1, var15, var24 + 1, -1, var16, 0, var21);
                        var25.field1489 = field347 + var24;
                        var25.field1490 = field347 + var23;
                        var25.field1485 = var31;
                        int var32 = var26.field72;
                        int var33 = var26.field57;
                        if (var20 == 1 || var20 == 3) {
                            var32 = var26.field57;
                            var33 = var26.field72;
                        }
                        var25.field1482 = var15 * 128 + var32 * 64;
                        var25.field1484 = var16 * 128 + var33 * 64;
                        var25.field1483 = this.method72(var25.field1484, var25.field1482, this.field548, -964);
                        if (var17 > var10) {
                            byte var34 = var17;
                            var17 = var10;
                            var10 = var34;
                        }
                        if (var13 > var22) {
                            byte var35 = var13;
                            var13 = var22;
                            var22 = var35;
                        }
                        var25.field1491 = var15 + var17;
                        var25.field1493 = var10 + var15;
                        var25.field1492 = var13 + var16;
                        var25.field1494 = var16 + var22;
                    }
                }
            }
            if (arg1 != 177) {
                if (arg1 == 170) {
                    int var44 = arg2.method476((byte) -50);
                    int var45 = var44 >> 2;
                    int var46 = var44 & 3;
                    int var47 = this.field570[var45];
                    int var48 = arg2.method483(17702);
                    int var49 = arg2.method475((byte) 16);
                    int var50 = (var49 >> 4 & 7) + this.field378;
                    int var51 = (var49 & 7) + this.field379;
                    if (var50 >= 0 && var51 >= 0 && var50 < 103 && var51 < 103) {
                        int var52 = this.field360[this.field548][var50][var51];
                        int var53 = this.field360[this.field548][var50 + 1][var51];
                        int var54 = this.field360[this.field548][var50 + 1][var51 + 1];
                        int var55 = this.field360[this.field548][var50][var51 + 1];
                        if (var47 == 0) {
                            class46 var56 = this.field383.method364(true, var51, this.field548, var50);
                            if (var56 != null) {
                                int var57 = var56.field1276 >> 14 & 32767;
                                if (var45 == 2) {
                                    var56.field1274 = new class23(var53, var48, var55, var57, var54, 2, var46 + 4, var52, true, false);
                                    var56.field1275 = new class23(var53, var48, var55, var57, var54, 2, var46 + 1 & 3, var52, true, false);
                                } else {
                                    var56.field1274 = new class23(var53, var48, var55, var57, var54, var45, var46, var52, true, false);
                                }
                            }
                        }
                        if (var47 == 1) {
                            class70 var58 = this.field383.method365(this.field548, var51, (byte) -64, var50);
                            if (var58 != null) {
                                var58.field1706 = new class23(var53, var48, var55, var58.field1707 >> 14 & 32767, var54, 4, 0, var52, true, false);
                            }
                        }
                        if (var47 == 2) {
                            class28 var59 = this.field383.method366(var51, (byte) 3, var50, this.field548);
                            if (var45 == 11) {
                                var45 = 10;
                            }
                            if (var59 != null) {
                                var59.field902 = new class23(var53, var48, var55, var59.field910 >> 14 & 32767, var54, var45, var46, var52, true, false);
                            }
                        }
                        if (var47 == 3) {
                            class21 var60 = this.field383.method367(this.field548, var51, false, var50);
                            if (var60 != null) {
                                var60.field775 = new class23(var53, var48, var55, var60.field776 >> 14 & 32767, var54, 22, var46, var52, true, false);
                            }
                        }
                    }
                } else if (arg1 == 217) {
                    int var61 = arg2.method455();
                    int var62 = var61 >> 2;
                    int var63 = var61 & 3;
                    int var64 = this.field570[var62];
                    int var65 = arg2.method474((byte) 1);
                    int var66 = (var65 >> 4 & 7) + this.field378;
                    int var67 = (var65 & 7) + this.field379;
                    int var68 = arg2.method484(false);
                    if (var66 >= 0 && var67 >= 0 && var66 < 104 && var67 < 104) {
                        this.method50(-558, var63, this.field548, -1, var66, 0, var68, var67, var62, var64);
                    }
                } else {
                    if (arg1 == 116) {
                        int var69 = arg2.method455();
                        int var70 = (var69 >> 4 & 7) + this.field378;
                        int var71 = (var69 & 7) + this.field379;
                        int var72 = arg2.method457();
                        int var73 = arg2.method455();
                        int var74 = var73 >> 4 & 15;
                        int var75 = var73 & 7;
                        if (field425.field1415[0] >= var70 - var74 && field425.field1415[0] <= var70 + var74 && field425.field1416[0] >= var71 - var74 && field425.field1416[0] <= var71 + var74 && this.field244 && !field196 && this.field209 < 50) {
                            this.field477[this.field209] = var72;
                            this.field287[this.field209] = var75;
                            this.field213[this.field209] = class16.field726[var72];
                            ++this.field209;
                        }
                    }
                    if (arg1 == 234) {
                        int var76 = arg2.method455();
                        int var77 = var76 >> 2;
                        int var78 = var76 & 3;
                        int var79 = this.field570[var77];
                        int var80 = arg2.method474((byte) 1);
                        int var81 = (var80 >> 4 & 7) + this.field378;
                        int var82 = (var80 & 7) + this.field379;
                        if (var81 >= 0 && var82 >= 0 && var81 < 104 && var82 < 104) {
                            this.method50(-558, var78, this.field548, -1, var81, 0, -1, var82, var77, var79);
                        }
                    } else if (arg1 == 137) {
                        int var83 = arg2.method455();
                        int var84 = (var83 >> 4 & 7) + this.field378;
                        int var85 = (var83 & 7) + this.field379;
                        int var86 = var84 + arg2.method456();
                        int var87 = var85 + arg2.method456();
                        int var88 = arg2.method458();
                        int var89 = arg2.method457();
                        int var90 = arg2.method455() * 4;
                        int var91 = arg2.method455() * 4;
                        int var92 = arg2.method457();
                        int var93 = arg2.method457();
                        int var94 = arg2.method455();
                        int var95 = arg2.method455();
                        if (var84 >= 0 && var85 >= 0 && var84 < 104 && var85 < 104 && var86 >= 0 && var87 >= 0 && var86 < 104 && var87 < 104 && var89 != 65535) {
                            int var96 = var84 * 128 + 64;
                            int var97 = var85 * 128 + 64;
                            int var98 = var86 * 128 + 64;
                            int var99 = var87 * 128 + 64;
                            class51 var100 = new class51(field347 + var92, var97, var88, var96, this.field548, (byte) 3, var91, var89, var94, var95, this.method72(var97, var96, this.field548, -964) - var90, field347 + var93);
                            var100.method425(this.method72(var99, var98, this.field548, -964) - var91, var98, 1, var99, field347 + var92);
                            this.field208.method500(var100);
                        }
                    } else if (arg1 == 155) {
                        int var101 = arg2.method484(false);
                        int var102 = arg2.method476((byte) -50);
                        int var103 = (var102 >> 4 & 7) + this.field378;
                        int var104 = (var102 & 7) + this.field379;
                        int var105 = arg2.method457();
                        int var106 = arg2.method484(false);
                        if (var103 >= 0 && var104 >= 0 && var103 < 104 && var104 < 104 && this.field375 != var106) {
                            class27 var107 = new class27();
                            var107.field896 = var105;
                            var107.field897 = var101;
                            if (this.field580[this.field548][var103][var104] == null) {
                                this.field580[this.field548][var103][var104] = new class58(41824);
                            }
                            this.field580[this.field548][var103][var104].method500(var107);
                            this.method66(var103, var104);
                        }
                    } else if (arg1 == 113) {
                        int var108 = arg2.method482(0);
                        int var109 = arg2.method475((byte) 16);
                        int var110 = (var109 >> 4 & 7) + this.field378;
                        int var111 = (var109 & 7) + this.field379;
                        int var112 = arg2.method482(0);
                        if (var110 >= 0 && var111 >= 0 && var110 < 104 && var111 < 104) {
                            class27 var113 = new class27();
                            var113.field896 = var108;
                            var113.field897 = var112;
                            if (this.field580[this.field548][var110][var111] == null) {
                                this.field580[this.field548][var110][var111] = new class58(41824);
                            }
                            this.field580[this.field548][var110][var111].method500(var113);
                            this.method66(var110, var111);
                        }
                    } else if (arg1 == 126) {
                        int var114 = arg2.method455();
                        int var115 = (var114 >> 4 & 7) + this.field378;
                        int var116 = (var114 & 7) + this.field379;
                        int var117 = arg2.method457();
                        int var118 = arg2.method455();
                        int var119 = arg2.method457();
                        if (var115 >= 0 && var116 >= 0 && var115 < 104 && var116 < 104) {
                            int var120 = var115 * 128 + 64;
                            int var121 = var116 * 128 + 64;
                            class18 var122 = new class18(-911, var120, field347, this.field548, var119, this.method72(var121, var120, this.field548, -964) - var118, var121, var117);
                            this.field450.method500(var122);
                        }
                    }
                }
            } else {
                int var36 = arg2.method455();
                int var37 = (var36 >> 4 & 7) + this.field378;
                int var38 = (var36 & 7) + this.field379;
                int var39 = arg2.method457();
                int var40 = arg2.method457();
                int var41 = arg2.method457();
                if (var37 >= 0 && var38 >= 0 && var37 < 104 && var38 < 104) {
                    class58 var42 = this.field580[this.field548][var37][var38];
                    if (var42 != null) {
                        for (class27 var43 = (class27) var42.method503(); var43 != null; var43 = (class27) var42.method505(false)) {
                            if ((var39 & 32767) == var43.field896 && var43.field897 == var40) {
                                var43.field897 = var41;
                                break;
                            }
                        }
                        this.method66(var37, var38);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "u", descriptor = "(I)V")
    public final void method125(int arg0) {
        int var2 = 65 / arg0;
        this.field133 = 0;
        for (int var3 = -1; var3 < this.field471 + this.field366; ++var3) {
            class54 var20;
            if (var3 == -1) {
                var20 = field425;
            } else if (var3 < this.field471) {
                var20 = this.field470[this.field472[var3]];
            } else {
                var20 = this.field365[this.field367[var3 - this.field471]];
            }
            if (var20 != null && var20.method287(false)) {
                if (var20 instanceof class25) {
                    class24 var21 = ((class25) var20).field871;
                    if (var21.field836 != null) {
                        var21 = var21.method282(0);
                    }
                    if (var21 == null) {
                        continue;
                    }
                }
                if (var3 >= this.field471) {
                    class24 var24 = ((class25) var20).field871;
                    if (var24.field865 >= 0 && var24.field865 < this.field467.length) {
                        this.method162(var20.field1433 + 15, false, var20);
                        if (this.field355 > -1) {
                            this.field467[var24.field865].method232(this.field355 - 12, this.field356 - 30, this.field481);
                        }
                    }
                    if (this.field410 == 1 && this.field367[var3 - this.field471] == this.field268 && field347 % 20 < 10) {
                        this.method162(var20.field1433 + 15, false, var20);
                        if (this.field355 > -1) {
                            this.field466[0].method232(this.field355 - 12, this.field356 - 28, this.field481);
                        }
                    }
                } else {
                    int var22 = 30;
                    class56 var23 = (class56) var20;
                    if (var23.field1475 != -1 || var23.field1478 != -1) {
                        this.method162(var20.field1433 + 15, false, var20);
                        if (this.field355 > -1) {
                            if (var23.field1475 != -1) {
                                this.field562[var23.field1475].method232(this.field355 - 12, this.field356 - var22, this.field481);
                                var22 += 25;
                            }
                            if (var23.field1478 != -1) {
                                this.field467[var23.field1478].method232(this.field355 - 12, this.field356 - var22, this.field481);
                                var22 += 25;
                            }
                        }
                    }
                    if (var3 >= 0 && this.field410 == 10 && this.field472[var3] == this.field353) {
                        this.method162(var20.field1433 + 15, false, var20);
                        if (this.field355 > -1) {
                            this.field466[1].method232(this.field355 - 12, this.field356 - var22, this.field481);
                        }
                    }
                }
                if (var20.field1419 != null && (var3 >= this.field471 || this.field571 == 0 || this.field571 == 3 || this.field571 == 1 && this.method79(((class56) var20).field1488, 9))) {
                    this.method162(var20.field1433, false, var20);
                    if (this.field355 > -1 && this.field133 < this.field134) {
                        this.field138[this.field133] = this.field332.method244(var20.field1419, false) / 2;
                        this.field137[this.field133] = this.field332.field769;
                        this.field135[this.field133] = this.field355;
                        this.field136[this.field133] = this.field356;
                        this.field139[this.field133] = var20.field1401;
                        this.field140[this.field133] = var20.field1403;
                        this.field141[this.field133] = var20.field1409;
                        this.field142[this.field133++] = var20.field1419;
                        if (this.field380 == 0 && var20.field1403 >= 1 && var20.field1403 <= 3) {
                            this.field137[this.field133] += 10;
                            this.field136[this.field133] += 5;
                        }
                        if (this.field380 == 0 && var20.field1403 == 4) {
                            this.field138[this.field133] = 60;
                        }
                        if (this.field380 == 0 && var20.field1403 == 5) {
                            this.field137[this.field133] += 5;
                        }
                    }
                }
                if (var20.field1404 > field347) {
                    this.method162(var20.field1433 + 15, false, var20);
                    if (this.field355 > -1) {
                        int var25 = var20.field1405 * 30 / var20.field1406;
                        if (var25 > 30) {
                            var25 = 30;
                        }
                        class53.method432(65280, this.field356 - 3, 5, false, this.field355 - 15, var25);
                        class53.method432(16711680, this.field356 - 3, 5, false, this.field355 - 15 + var25, 30 - var25);
                    }
                }
                for (int var26 = 0; var26 < 4; ++var26) {
                    if (var20.field1437[var26] > field347) {
                        this.method162(var20.field1433 / 2, false, var20);
                        if (this.field355 > -1) {
                            if (var26 == 1) {
                                this.field356 -= 20;
                            }
                            if (var26 == 2) {
                                this.field355 -= 15;
                                this.field356 -= 10;
                            }
                            if (var26 == 3) {
                                this.field355 += 15;
                                this.field356 -= 10;
                            }
                            this.field302[var20.field1436[var26]].method232(this.field355 - 12, this.field356 - 12, this.field481);
                            this.field330.method241(this.field356 + 4, this.field355, String.valueOf(var20.field1435[var26]), 0, 0);
                            this.field330.method241(this.field356 + 3, this.field355 - 1, String.valueOf(var20.field1435[var26]), 0, 16777215);
                        }
                    }
                }
            }
        }
        for (int var4 = 0; var4 < this.field133; ++var4) {
            int var5 = this.field135[var4];
            int var6 = this.field136[var4];
            int var7 = this.field138[var4];
            int var8 = this.field137[var4];
            boolean var9 = true;
            while (var9) {
                var9 = false;
                for (int var19 = 0; var19 < var4; ++var19) {
                    if (var6 + 2 > this.field136[var19] - this.field137[var19] && var6 - var8 < this.field136[var19] + 2 && var5 - var7 < this.field138[var19] + this.field135[var19] && var5 + var7 > this.field135[var19] - this.field138[var19] && this.field136[var19] - this.field137[var19] < var6) {
                        var6 = this.field136[var19] - this.field137[var19];
                        var9 = true;
                    }
                }
            }
            this.field355 = this.field135[var4];
            this.field356 = this.field136[var4] = var6;
            String var10 = this.field142[var4];
            if (this.field380 == 0) {
                int var11 = 16776960;
                if (this.field139[var4] < 6) {
                    var11 = this.field525[this.field139[var4]];
                }
                if (this.field139[var4] == 6) {
                    var11 = this.field329 % 20 < 10 ? 16711680 : 16776960;
                }
                if (this.field139[var4] == 7) {
                    var11 = this.field329 % 20 < 10 ? 255 : 65535;
                }
                if (this.field139[var4] == 8) {
                    var11 = this.field329 % 20 < 10 ? 45056 : 8454016;
                }
                if (this.field139[var4] == 9) {
                    int var12 = 150 - this.field141[var4];
                    if (var12 < 50) {
                        var11 = var12 * 1280 + 16711680;
                    } else if (var12 < 100) {
                        var11 = 16776960 - (var12 - 50) * 327680;
                    } else if (var12 < 150) {
                        var11 = (var12 - 100) * 5 + 65280;
                    }
                }
                if (this.field139[var4] == 10) {
                    int var13 = 150 - this.field141[var4];
                    if (var13 < 50) {
                        var11 = var13 * 5 + 16711680;
                    } else if (var13 < 100) {
                        var11 = 16711935 - (var13 - 50) * 327680;
                    } else if (var13 < 150) {
                        var11 = (var13 - 100) * 327680 + 255 - (var13 - 100) * 5;
                    }
                }
                if (this.field139[var4] == 11) {
                    int var14 = 150 - this.field141[var4];
                    if (var14 < 50) {
                        var11 = 16777215 - var14 * 327685;
                    } else if (var14 < 100) {
                        var11 = (var14 - 50) * 327685 + 65280;
                    } else if (var14 < 150) {
                        var11 = 16777215 - (var14 - 100) * 327680;
                    }
                }
                if (this.field140[var4] == 0) {
                    this.field332.method241(this.field356 + 1, this.field355, var10, 0, 0);
                    this.field332.method241(this.field356, this.field355, var10, 0, var11);
                }
                if (this.field140[var4] == 1) {
                    this.field332.method246(this.field356 + 1, var10, -384, this.field329, 0, this.field355);
                    this.field332.method246(this.field356, var10, -384, this.field329, var11, this.field355);
                }
                if (this.field140[var4] == 2) {
                    this.field332.method247(0, 0, this.field329, this.field356 + 1, var10, this.field355);
                    this.field332.method247(0, var11, this.field329, this.field356, var10, this.field355);
                }
                if (this.field140[var4] == 3) {
                    this.field332.method248(this.field329, 0, this.field355, var10, 150 - this.field141[var4], 0, this.field356 + 1);
                    this.field332.method248(this.field329, var11, this.field355, var10, 150 - this.field141[var4], 0, this.field356);
                }
                if (this.field140[var4] == 4) {
                    int var15 = this.field332.method244(var10, false);
                    int var16 = (150 - this.field141[var4]) * (var15 + 100) / 150;
                    class53.method429(0, this.field355 + 50, 334, this.field355 - 50, (byte) -121);
                    this.field332.method245(0, this.field355 + 50 - var16, this.field356 + 1, var10, (byte) 2);
                    this.field332.method245(var11, this.field355 + 50 - var16, this.field356, var10, (byte) 2);
                    class53.method428(-237);
                }
                if (this.field140[var4] == 5) {
                    int var17 = 150 - this.field141[var4];
                    int var18 = 0;
                    if (var17 < 25) {
                        var18 = var17 - 25;
                    } else if (var17 > 125) {
                        var18 = var17 - 125;
                    }
                    class53.method429(this.field356 - this.field332.field769 - 1, 512, this.field356 + 5, 0, (byte) -121);
                    this.field332.method241(this.field356 + 1 + var18, this.field355, var10, 0, 0);
                    this.field332.method241(this.field356 + var18, this.field355, var10, 0, var11);
                    class53.method428(-237);
                }
            } else {
                this.field332.method241(this.field356 + 1, this.field355, var10, 0, 0);
                this.field332.method241(this.field356, this.field355, var10, 0, 16776960);
            }
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(Z)V")
    public final void method10(boolean arg0) {
        if (arg0) {
            this.field412 = true;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIII)V")
    public final void method126(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = this.field383.method368(arg2, arg5, arg1);
        if (var7 != 0) {
            int var8 = this.field383.method372(arg2, arg5, arg1, var7);
            int var9 = var8 >> 6 & 3;
            int var10 = var8 & 31;
            int var11 = arg4;
            if (var7 > 0) {
                var11 = arg0;
            }
            int[] var12 = this.field402.field751;
            int var13 = (103 - arg1) * 512 * 4 + arg5 * 4 + 24624;
            int var14 = var7 >> 14 & 32767;
            class4 var15 = class4.method24(var14);
            if (var15.field44 != -1) {
                class68 var16 = this.field390[var15.field44];
                if (var16 != null) {
                    int var17 = (var15.field72 * 4 - var16.field1677) / 2;
                    int var18 = (var15.field57 * 4 - var16.field1678) / 2;
                    var16.method555(arg5 * 4 + 48 + var17, (104 - arg1 - var15.field57) * 4 + 48 + var18, this.field481);
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
        int var19 = this.field383.method370(arg2, arg5, arg1);
        if (arg3 != 1) {
            this.field580 = null;
        }
        if (var19 != 0) {
            int var20 = this.field383.method372(arg2, arg5, arg1, var19);
            int var21 = var20 >> 6 & 3;
            int var22 = var20 & 31;
            int var23 = var19 >> 14 & 32767;
            class4 var24 = class4.method24(var23);
            if (var24.field44 != -1) {
                class68 var25 = this.field390[var24.field44];
                if (var25 != null) {
                    int var26 = (var24.field72 * 4 - var25.field1677) / 2;
                    int var27 = (var24.field57 * 4 - var25.field1678) / 2;
                    var25.method555(arg5 * 4 + 48 + var26, (104 - arg1 - var24.field57) * 4 + 48 + var27, this.field481);
                }
            } else if (var22 == 9) {
                int var28 = 15658734;
                if (var19 > 0) {
                    var28 = 15597568;
                }
                int[] var29 = this.field402.field751;
                int var30 = (103 - arg1) * 512 * 4 + arg5 * 4 + 24624;
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
        int var31 = this.field383.method371(arg2, arg5, arg1);
        if (var31 != 0) {
            int var32 = var31 >> 14 & 32767;
            class4 var33 = class4.method24(var32);
            if (var33.field44 != -1) {
                class68 var34 = this.field390[var33.field44];
                if (var34 != null) {
                    int var35 = (var33.field72 * 4 - var34.field1677) / 2;
                    int var36 = (var33.field57 * 4 - var34.field1678) / 2;
                    var34.method555(arg5 * 4 + 48 + var35, (104 - arg1 - var33.field57) * 4 + 48 + var36, this.field481);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "v", descriptor = "(I)V")
    public final void method127(int arg0) {
        if (arg0 < 0) {
            this.field453 = true;
            try {
                long var2 = System.currentTimeMillis();
                int var4 = 0;
                int var5 = 20;
                while (this.field387) {
                    ++this.field446;
                    this.method129(-67);
                    this.method129(-67);
                    this.method145(-77);
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
            this.field453 = false;
        }
    }

    @OriginalMember(owner = "client", name = "w", descriptor = "(I)Z")
    public final boolean method128(int arg0) {
        if (arg0 != 504) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        return signlink.wavereplay();
    }

    @OriginalMember(owner = "client", name = "x", descriptor = "(I)V")
    public final void method129(int arg0) {
        short var2 = 256;
        for (int var3 = 10; var3 < 117; ++var3) {
            int var18 = (int) (Math.random() * 100.0D);
            if (var18 < 50) {
                this.field143[(var2 - 2 << 7) + var3] = 255;
            }
        }
        for (int var4 = 0; var4 < 100; ++var4) {
            int var15 = (int) (Math.random() * 124.0D) + 2;
            int var16 = (int) (Math.random() * 128.0D) + 128;
            int var17 = (var16 << 7) + var15;
            this.field143[var17] = 192;
        }
        if (arg0 < 0) {
            for (int var5 = 1; var5 < var2 - 1; ++var5) {
                for (int var13 = 1; var13 < 127; ++var13) {
                    int var14 = (var5 << 7) + var13;
                    this.field144[var14] = (this.field143[var14 - 1] + this.field143[var14 + 1] + this.field143[var14 - 128] + this.field143[var14 + 128]) / 4;
                }
            }
            this.field528 += 128;
            if (this.field528 > this.field372.length) {
                this.field528 -= this.field372.length;
                int var6 = (int) (Math.random() * 12.0D);
                this.method83((byte) 0, this.field280[var6]);
            }
            for (int var7 = 1; var7 < var2 - 1; ++var7) {
                for (int var10 = 1; var10 < 127; ++var10) {
                    int var11 = (var7 << 7) + var10;
                    int var12 = this.field144[var11 + 128] - this.field372[this.field528 + var11 & this.field372.length - 1] / 5;
                    if (var12 < 0) {
                        var12 = 0;
                    }
                    this.field143[var11] = var12;
                }
            }
            for (int var8 = 0; var8 < var2 - 1; ++var8) {
                this.field542[var8] = this.field542[var8 + 1];
            }
            this.field542[var2 - 1] = (int) (Math.sin((double) field347 / 14.0D) * 16.0D + Math.sin((double) field347 / 15.0D) * 14.0D + Math.sin((double) field347 / 16.0D) * 12.0D);
            if (this.field484 > 0) {
                this.field484 -= 4;
            }
            if (this.field485 > 0) {
                this.field485 -= 4;
            }
            if (this.field484 == 0 && this.field485 == 0) {
                int var9 = (int) (Math.random() * 2000.0D);
                if (var9 == 0) {
                    this.field484 = 1024;
                }
                if (var9 == 1) {
                    this.field485 = 1024;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IILLYHLTGUG;BI)V")
    public final void method130(int arg0, int arg1, class29 arg2, byte arg3, int arg4) {
        if (arg2.field921 == 0 && arg2.field926 != null) {
            if (!arg2.field976 || this.field183 == arg2.field938 || this.field403 == arg2.field938 || this.field359 == arg2.field938) {
                int var6 = class53.field1376;
                int var7 = class53.field1374;
                int var8 = class53.field1377;
                int var9 = class53.field1375;
                class53.method429(arg0, arg2.field950 + arg1, arg2.field979 + arg0, arg1, (byte) -121);
                int var10 = arg2.field926.length;
                if (arg3 != 67) {
                    for (int var11 = 1; var11 > 0; ++var11) {
                    }
                }
                for (int var12 = 0; var12 < var10; ++var12) {
                    int var13 = arg2.field923[var12] + arg1;
                    int var14 = arg2.field968[var12] + arg0 - arg4;
                    class29 var15 = class29.field963[arg2.field926[var12]];
                    int var16 = var15.field930 + var13;
                    int var17 = var15.field935 + var14;
                    if (var15.field952 > 0) {
                        this.method53(var15, -209);
                    }
                    if (var15.field921 == 0) {
                        if (var15.field920 > var15.field956 - var15.field979) {
                            var15.field920 = var15.field956 - var15.field979;
                        }
                        if (var15.field920 < 0) {
                            var15.field920 = 0;
                        }
                        this.method130(var17, var16, var15, (byte) 67, var15.field920);
                        if (var15.field956 > var15.field979) {
                            this.method155(var15.field956, var15.field979, var17, 7, var15.field950 + var16, var15.field920);
                        }
                    } else if (var15.field921 != 1) {
                        if (var15.field921 == 2) {
                            int var18 = 0;
                            for (int var19 = 0; var19 < var15.field979; ++var19) {
                                for (int var20 = 0; var20 < var15.field950; ++var20) {
                                    int var21 = (var15.field971 + 32) * var20 + var16;
                                    int var22 = (var15.field941 + 32) * var19 + var17;
                                    if (var18 < 20) {
                                        var21 += var15.field977[var18];
                                        var22 += var15.field915[var18];
                                    }
                                    if (var15.field967[var18] <= 0) {
                                        if (var15.field945 != null && var18 < 20) {
                                            class19 var31 = var15.field945[var18];
                                            if (var31 != null) {
                                                var31.method232(var21, var22, this.field481);
                                            }
                                        }
                                    } else {
                                        int var23 = 0;
                                        int var24 = 0;
                                        int var25 = var15.field967[var18] - 1;
                                        if (var21 > class53.field1376 - 32 && var21 < class53.field1377 && var22 > class53.field1374 - 32 && var22 < class53.field1375 || this.field584 != 0 && this.field583 == var18) {
                                            int var26 = 0;
                                            if (this.field494 == 1 && this.field495 == var18 && this.field496 == var15.field938) {
                                                var26 = 16777215;
                                            }
                                            class19 var27 = class31.method314(var26, -900, var25, var15.field918[var18]);
                                            if (var27 != null) {
                                                if (this.field584 != 0 && this.field583 == var18 && this.field582 == var15.field938) {
                                                    var23 = super.field19 - this.field585;
                                                    var24 = super.field20 - this.field586;
                                                    if (var23 < 5 && var23 > -5) {
                                                        var23 = 0;
                                                    }
                                                    if (var24 < 5 && var24 > -5) {
                                                        var24 = 0;
                                                    }
                                                    if (this.field488 < 5) {
                                                        var23 = 0;
                                                        var24 = 0;
                                                    }
                                                    var27.method234(false, var21 + var23, 128, var22 + var24);
                                                    if (var22 + var24 < class53.field1374 && arg2.field920 > 0) {
                                                        int var28 = (class53.field1374 - var22 - var24) * this.field579 / 3;
                                                        if (var28 > this.field579 * 10) {
                                                            var28 = this.field579 * 10;
                                                        }
                                                        if (var28 > arg2.field920) {
                                                            var28 = arg2.field920;
                                                        }
                                                        arg2.field920 -= var28;
                                                        this.field586 += var28;
                                                    }
                                                    if (var22 + var24 + 32 > class53.field1375 && arg2.field920 < arg2.field956 - arg2.field979) {
                                                        int var29 = (var22 + var24 + 32 - class53.field1375) * this.field579 / 3;
                                                        if (var29 > this.field579 * 10) {
                                                            var29 = this.field579 * 10;
                                                        }
                                                        if (var29 > arg2.field956 - arg2.field979 - arg2.field920) {
                                                            var29 = arg2.field956 - arg2.field979 - arg2.field920;
                                                        }
                                                        arg2.field920 += var29;
                                                        this.field586 -= var29;
                                                    }
                                                } else if (this.field220 != 0 && this.field219 == var18 && this.field218 == var15.field938) {
                                                    var27.method234(false, var21, 128, var22);
                                                } else {
                                                    var27.method232(var21, var22, this.field481);
                                                }
                                                if (var27.field756 == 33 || var15.field918[var18] != 1) {
                                                    int var30 = var15.field918[var18];
                                                    this.field330.method245(0, var21 + 1 + var23, var22 + 10 + var24, method121(538, var30), (byte) 2);
                                                    this.field330.method245(16776960, var21 + var23, var22 + 9 + var24, method121(538, var30), (byte) 2);
                                                }
                                            }
                                        }
                                    }
                                    ++var18;
                                }
                            }
                        } else if (var15.field921 == 3) {
                            boolean var32 = false;
                            if (this.field359 == var15.field938 || this.field403 == var15.field938 || this.field183 == var15.field938) {
                                var32 = true;
                            }
                            int var33;
                            if (this.method97((byte) 2, var15)) {
                                var33 = var15.field965;
                                if (var32 && var15.field964 != 0) {
                                    var33 = var15.field964;
                                }
                            } else {
                                var33 = var15.field975;
                                if (var32 && var15.field951 != 0) {
                                    var33 = var15.field951;
                                }
                            }
                            if (var15.field919 == 0) {
                                if (var15.field929) {
                                    class53.method432(var33, var17, var15.field979, false, var16, var15.field950);
                                } else {
                                    class53.method433(var16, var17, var15.field950, var33, 248, var15.field979);
                                }
                            } else if (var15.field929) {
                                class53.method431(2, var16, var15.field950, var33, 256 - (var15.field919 & 255), var17, var15.field979);
                            } else {
                                class53.method434(var17, this.field540, 256 - (var15.field919 & 255), var16, var15.field950, var33, var15.field979);
                            }
                        } else if (var15.field921 == 4) {
                            class20 var34 = var15.field959;
                            String var35 = var15.field978;
                            boolean var36 = false;
                            if (this.field359 == var15.field938 || this.field403 == var15.field938 || this.field183 == var15.field938) {
                                var36 = true;
                            }
                            int var37;
                            if (this.method97((byte) 2, var15)) {
                                var37 = var15.field965;
                                if (var36 && var15.field964 != 0) {
                                    var37 = var15.field964;
                                }
                                if (var15.field960.length() > 0) {
                                    var35 = var15.field960;
                                }
                            } else {
                                var37 = var15.field975;
                                if (var36 && var15.field951 != 0) {
                                    var37 = var15.field951;
                                }
                            }
                            if (var15.field917 == 6 && this.field503) {
                                var35 = "Please wait...";
                                var37 = var15.field975;
                            }
                            if (class53.field1372 == 479) {
                                if (var37 == 16776960) {
                                    var37 = 255;
                                }
                                if (var37 == 49152) {
                                    var37 = 16777215;
                                }
                            }
                            int var38 = var34.field769 + var17;
                            while (var35.length() > 0) {
                                if (var35.indexOf("%") != -1) {
                                    label382: while (true) {
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
                                                                            break label382;
                                                                        }
                                                                        var35 = var35.substring(0, var43) + this.method69(this.method58(967, 4, var15), false) + var35.substring(var43 + 2);
                                                                    }
                                                                }
                                                                var35 = var35.substring(0, var42) + this.method69(this.method58(967, 3, var15), false) + var35.substring(var42 + 2);
                                                            }
                                                        }
                                                        var35 = var35.substring(0, var41) + this.method69(this.method58(967, 2, var15), false) + var35.substring(var41 + 2);
                                                    }
                                                }
                                                var35 = var35.substring(0, var40) + this.method69(this.method58(967, 1, var15), false) + var35.substring(var40 + 2);
                                            }
                                        }
                                        var35 = var35.substring(0, var39) + this.method69(this.method58(967, 0, var15), false) + var35.substring(var39 + 2);
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
                                if (var15.field939) {
                                    var34.method242(-546, var37, var15.field912, var45, var15.field950 / 2 + var16, var38);
                                } else {
                                    var34.method249(var15.field912, 7, var45, var37, var16, var38);
                                }
                                var38 += var34.field769;
                            }
                        } else if (var15.field921 == 5) {
                            class19 var46;
                            if (this.method97((byte) 2, var15)) {
                                var46 = var15.field924;
                            } else {
                                var46 = var15.field961;
                            }
                            if (var46 != null) {
                                var46.method232(var16, var17, this.field481);
                            }
                        } else if (var15.field921 == 6) {
                            int var47 = class26.field878;
                            int var48 = class26.field879;
                            class26.field878 = var15.field950 / 2 + var16;
                            class26.field879 = var15.field979 / 2 + var17;
                            int var49 = class26.field882[var15.field947] * var15.field946 >> 16;
                            int var50 = class26.field883[var15.field947] * var15.field946 >> 16;
                            boolean var51 = this.method97((byte) 2, var15);
                            int var52;
                            if (var51) {
                                var52 = var15.field955;
                            } else {
                                var52 = var15.field954;
                            }
                            class66 var53;
                            if (var52 == -1) {
                                var53 = var15.method305(false, -1, var51, -1);
                            } else {
                                class47 var54 = class47.field1280[var52];
                                var53 = var15.method305(false, var54.field1282[var15.field972], var51, var54.field1283[var15.field972]);
                            }
                            if (var53 != null) {
                                var53.method545(0, var15.field948, 0, var15.field947, 0, var49, var50);
                            }
                            class26.field878 = var47;
                            class26.field879 = var48;
                        } else {
                            if (var15.field921 == 7) {
                                class20 var55 = var15.field959;
                                int var56 = 0;
                                for (int var57 = 0; var57 < var15.field979; ++var57) {
                                    for (int var58 = 0; var58 < var15.field950; ++var58) {
                                        if (var15.field967[var56] > 0) {
                                            class31 var59 = class31.method322(var15.field967[var56] - 1);
                                            String var60 = var59.field1012;
                                            if (var59.field1046 || var15.field918[var56] != 1) {
                                                var60 = var60 + " x" + method80(var15.field918[var56], false);
                                            }
                                            int var61 = (var15.field971 + 115) * var58 + var16;
                                            int var62 = (var15.field941 + 12) * var57 + var17;
                                            if (var15.field939) {
                                                var55.method242(-546, var15.field975, var15.field912, var60, var15.field950 / 2 + var61, var62);
                                            } else {
                                                var55.method249(var15.field912, 7, var60, var15.field975, var61, var62);
                                            }
                                        }
                                        ++var56;
                                    }
                                }
                            }
                            if (var15.field921 == 8 && (this.field436 == var15.field938 || this.field526 == var15.field938 || this.field191 == var15.field938)) {
                                int var63 = 0;
                                int var64 = 0;
                                class20 var65 = this.field331;
                                String var66 = var15.field978;
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
                                    int var75 = var65.method243(var74, true);
                                    if (var75 > var63) {
                                        var63 = var75;
                                    }
                                    var64 += var65.field769 + 1;
                                }
                                var63 += 6;
                                var64 += 7;
                                int var67 = var15.field950 + var16 - 5 - var63;
                                int var68 = var15.field979 + var17 + 5;
                                if (var67 < var16 + 5) {
                                    var67 = this.field495 + 5;
                                }
                                class53.method432(16777120, var68, var64, false, var67, var63);
                                class53.method433(var67, var68, var63, 0, 248, var64);
                                String var69 = var15.field978;
                                int var70 = var65.field769 + var68 + 2;
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
                                    var65.method249(false, 7, var72, 0, var67 + 3, var70);
                                    var70 += var65.field769 + 1;
                                }
                            }
                        }
                    }
                }
                class53.method429(var7, var8, var9, var6, (byte) -121);
            }
        }
    }

    @OriginalMember(owner = "client", name = "y", descriptor = "(I)V")
    private final void method131(int arg0) {
        class8 var2 = (class8) this.field463.method503();
        if (arg0 > 0) {
            while (var2 != null) {
                if (var2.field620 == -1) {
                    var2.field621 = 0;
                    this.method164(0, var2);
                } else {
                    var2.method398();
                }
                var2 = (class8) this.field463.method505(false);
            }
        }
    }

    @OriginalMember(owner = "client", name = "z", descriptor = "(I)V")
    public final void method132(int arg0) {
        if (arg0 < 3 || arg0 > 3) {
            this.field580 = null;
        }
        if (this.field238 == 0) {
            int var2 = super.field9 / 2 - 80;
            int var3 = super.field10 / 2 + 20;
            int var14 = var3 + 20;
            if (super.field25 == 1 && super.field26 >= var2 - 75 && super.field26 <= var2 + 75 && super.field27 >= var14 - 20 && super.field27 <= var14 + 20) {
                this.field238 = 3;
                this.field489 = 0;
            }
            int var4 = super.field9 / 2 + 80;
            if (super.field25 == 1 && super.field26 >= var4 - 75 && super.field26 <= var4 + 75 && super.field27 >= var14 - 20 && super.field27 <= var14 + 20) {
                this.field240 = "";
                this.field241 = "Enter your username & password.";
                this.field238 = 2;
                this.field489 = 0;
            }
        } else if (this.field238 == 2) {
            int var5 = super.field10 / 2 - 40;
            int var15 = var5 + 30;
            int var16 = var15 + 25;
            if (super.field25 == 1 && super.field27 >= var16 - 15 && super.field27 < var16) {
                this.field489 = 0;
            }
            var5 = var16 + 15;
            if (super.field25 == 1 && super.field27 >= var5 - 15 && super.field27 < var5) {
                this.field489 = 1;
            }
            var5 += 15;
            int var6 = super.field9 / 2 - 80;
            int var7 = super.field10 / 2 + 50;
            int var17 = var7 + 20;
            if (super.field25 == 1 && super.field26 >= var6 - 75 && super.field26 <= var6 + 75 && super.field27 >= var17 - 20 && super.field27 <= var17 + 20) {
                this.field487 = 0;
                this.method67(this.field357, this.field358, false);
                if (this.field248) {
                    return;
                }
            }
            int var8 = super.field9 / 2 + 80;
            if (super.field25 == 1 && super.field26 >= var8 - 75 && super.field26 <= var8 + 75 && super.field27 >= var17 - 20 && super.field27 <= var17 + 20) {
                this.field238 = 0;
                this.field357 = "";
                this.field358 = "";
            }
            while (true) {
                while (true) {
                    int var9 = this.method5(false);
                    if (var9 == -1) {
                        return;
                    }
                    boolean var10 = false;
                    for (int var11 = 0; var11 < field524.length(); ++var11) {
                        if (var9 == field524.charAt(var11)) {
                            var10 = true;
                            break;
                        }
                    }
                    if (this.field489 == 0) {
                        if (var9 == 8 && this.field357.length() > 0) {
                            this.field357 = this.field357.substring(0, this.field357.length() - 1);
                        }
                        if (var9 == 9 || var9 == 10 || var9 == 13) {
                            this.field489 = 1;
                        }
                        if (var10) {
                            this.field357 = this.field357 + (char) var9;
                        }
                        if (this.field357.length() > 12) {
                            this.field357 = this.field357.substring(0, 12);
                        }
                    } else if (this.field489 == 1) {
                        if (var9 == 8 && this.field358.length() > 0) {
                            this.field358 = this.field358.substring(0, this.field358.length() - 1);
                        }
                        if (var9 == 9 || var9 == 10 || var9 == 13) {
                            this.field489 = 0;
                        }
                        if (var10) {
                            this.field358 = this.field358 + (char) var9;
                        }
                        if (this.field358.length() > 20) {
                            this.field358 = this.field358.substring(0, 20);
                        }
                    }
                }
            }
        } else {
            if (this.field238 == 3) {
                int var12 = super.field9 / 2;
                int var13 = super.field10 / 2 + 50;
                int var18 = var13 + 20;
                if (super.field25 == 1 && super.field26 >= var12 - 75 && super.field26 <= var12 + 75 && super.field27 >= var18 - 20 && super.field27 <= var18 + 20) {
                    this.field238 = 0;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "h", descriptor = "(B)V")
    public final void method133(byte arg0) {
        if (this.field410 == 2) {
            this.method163((this.field223 - this.field255 << 7) + this.field226, this.field225 * 2, (this.field224 - this.field256 << 7) + this.field227, this.field281);
            if (arg0 == 0) {
                boolean var2 = false;
            }
            if (this.field355 > -1 && field347 % 20 < 10) {
                this.field466[0].method232(this.field355 - 12, this.field356 - 28, this.field481);
            }
        }
    }

    @OriginalMember(owner = "client", name = "A", descriptor = "(I)V")
    public final void method134(int arg0) {
        if (arg0 == -47231) {
            int var2 = 5;
            this.field177[8] = 0;
            int var3 = 0;
            while (this.field177[8] == 0) {
                String var4 = "Unknown problem";
                this.method13(20, "Connecting to web server", false);
                try {
                    DataInputStream var5 = this.method151("crc" + (int) (Math.random() * 9.9999999E7D) + "-" + 333);
                    class55 var6 = new class55(741, new byte[40]);
                    var5.readFully(var6.field1455, 0, 40);
                    var5.close();
                    for (int var7 = 0; var7 < 9; ++var7) {
                        this.field177[var7] = var6.method460();
                    }
                    int var8 = var6.method460();
                    int var9 = 1234;
                    for (int var10 = 0; var10 < 9; ++var10) {
                        var9 = (var9 << 1) + this.field177[var10];
                    }
                    if (var8 != var9) {
                        var4 = "checksum problem";
                        this.field177[8] = 0;
                    }
                } catch (EOFException var13) {
                    var4 = "EOF problem";
                    this.field177[8] = 0;
                } catch (IOException var14) {
                    var4 = "connection problem";
                    this.field177[8] = 0;
                } catch (Exception var15) {
                    var4 = "logic problem";
                    this.field177[8] = 0;
                    if (!signlink.reporterror) {
                        return;
                    }
                }
                if (this.field177[8] == 0) {
                    ++var3;
                    for (int var11 = var2; var11 > 0; --var11) {
                        if (var3 >= 10) {
                            this.method13(10, "Game updated - please reload page", false);
                            var11 = 10;
                        } else {
                            this.method13(10, var4 + " - Will retry in " + var11 + " secs.", false);
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
                    this.field180 = !this.field180;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "i", descriptor = "(B)V")
    public final void method135(byte arg0) {
        if (this.field199 == null) {
            super.field12 = null;
            this.field511 = null;
            this.field509 = null;
            this.field508 = null;
            this.field510 = null;
            this.field573 = null;
            this.field574 = null;
            this.field575 = null;
            this.field202 = new class42(128, this.method11(false), 265, (byte) 33);
            class53.method430(413);
            this.field203 = new class42(128, this.method11(false), 265, (byte) 33);
            class53.method430(413);
            this.field199 = new class42(509, this.method11(false), 171, (byte) 33);
            class53.method430(413);
            this.field200 = new class42(360, this.method11(false), 132, (byte) 33);
            class53.method430(413);
            this.field201 = new class42(360, this.method11(false), 200, (byte) 33);
            class53.method430(413);
            this.field204 = new class42(202, this.method11(false), 238, (byte) 33);
            class53.method430(413);
            this.field205 = new class42(203, this.method11(false), 238, (byte) 33);
            class53.method430(413);
            this.field206 = new class42(74, this.method11(false), 94, (byte) 33);
            if (arg0 == 7) {
                boolean var2 = false;
            }
            class53.method430(413);
            this.field207 = new class42(75, this.method11(false), 94, (byte) 33);
            class53.method430(413);
            if (this.field576 != null) {
                this.method65(-23897);
                this.method109(-576);
            }
            this.field412 = true;
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(IZ)V")
    public final void method136(int arg0, boolean arg1) {
        this.field248 &= arg1;
        class29 var3 = class29.field963[arg0];
        for (int var4 = 0; var4 < var3.field926.length && var3.field926[var4] != -1; ++var4) {
            class29 var5 = class29.field963[var3.field926[var4]];
            if (var5.field921 == 1) {
                this.method136(var5.field938, true);
            }
            var5.field972 = 0;
            var5.field974 = 0;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LUAWAYCTK;IZ)V")
    private final void method137(class55 arg0, int arg1, boolean arg2) {
        this.field297 = 0;
        this.field473 = 0;
        if (arg2) {
            this.field519 = -1;
        }
        this.method82(arg1, (byte) -90, arg0);
        this.method115((byte) 5, arg0, arg1);
        this.method87(arg0, arg1, this.field110);
        this.method64(arg0, (byte) 2, arg1);
        for (int var4 = 0; var4 < this.field297; ++var4) {
            int var6 = this.field298[var4];
            if (field347 != this.field470[var6].field1432) {
                this.field470[var6] = null;
            }
        }
        if (arg0.field1456 != arg1) {
            signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg0.field1456 + " psize:" + arg1);
            throw new RuntimeException("eek");
        } else {
            for (int var5 = 0; var5 < this.field471; ++var5) {
                if (this.field470[this.field472[var5]] == null) {
                    signlink.reporterror(this.field357 + " null entry in pl list - pos:" + var5 + " size:" + this.field471);
                    throw new RuntimeException("eek");
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "n", descriptor = "(Z)V")
    public final void method138(boolean arg0) {
        this.field248 &= arg0;
        if (this.field131 >= 2 || this.field494 != 0 || this.field146 != 0) {
            String var2;
            if (this.field494 == 1 && this.field131 < 2) {
                var2 = "Use " + this.field498 + " with...";
            } else if (this.field146 == 1 && this.field131 < 2) {
                var2 = this.field149 + "...";
            } else {
                var2 = this.field305[this.field131 - 1];
            }
            if (this.field131 > 2) {
                var2 = var2 + "@whi@ / " + (this.field131 - 2) + " more options";
            }
            this.field332.method250(field347 / 1000, var2, 16777215, 521, 4, 15, true);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BI)V")
    public final void method139(byte arg0, int arg1) {
        if (arg0 == 26) {
            if (!field196) {
                if (class26.field892[17] >= arg1) {
                    class68 var3 = class26.field886[17];
                    int var4 = var3.field1678 * var3.field1677 - 1;
                    int var5 = this.field579 * var3.field1677 * 2;
                    byte[] var6 = var3.field1675;
                    byte[] var7 = this.field493;
                    for (int var8 = 0; var8 <= var4; ++var8) {
                        var7[var8] = var6[var8 - var5 & var4];
                    }
                    var3.field1675 = var7;
                    this.field493 = var6;
                    class26.method295((byte) 5, 17);
                }
                if (class26.field892[24] >= arg1) {
                    class68 var9 = class26.field886[24];
                    int var10 = var9.field1678 * var9.field1677 - 1;
                    int var11 = this.field579 * var9.field1677 * 2;
                    byte[] var12 = var9.field1675;
                    byte[] var13 = this.field493;
                    for (int var14 = 0; var14 <= var10; ++var14) {
                        var13[var14] = var12[var14 - var11 & var10];
                    }
                    var9.field1675 = var13;
                    this.field493 = var12;
                    class26.method295((byte) 5, 24);
                }
                if (class26.field892[34] >= arg1) {
                    class68 var15 = class26.field886[34];
                    int var16 = var15.field1678 * var15.field1677 - 1;
                    int var17 = this.field579 * var15.field1677 * 2;
                    byte[] var18 = var15.field1675;
                    byte[] var19 = this.field493;
                    for (int var20 = 0; var20 <= var16; ++var20) {
                        var19[var20] = var18[var20 - var17 & var16];
                    }
                    var15.field1675 = var19;
                    this.field493 = var18;
                    class26.method295((byte) 5, 34);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "B", descriptor = "(I)I")
    public final int method140(int arg0) {
        if (arg0 != 9) {
            this.field341 = !this.field341;
        }
        int var2 = 3;
        if (this.field188 < 310) {
            int var3 = this.field185 >> 7;
            int var4 = this.field187 >> 7;
            int var5 = field425.field1422 >> 7;
            int var6 = field425.field1423 >> 7;
            if ((this.field531[this.field548][var3][var4] & 4) != 0) {
                var2 = this.field548;
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
                    if ((this.field531[this.field548][var3][var4] & 4) != 0) {
                        var2 = this.field548;
                    }
                    var10 += var9;
                    if (var10 >= 65536) {
                        var10 -= 65536;
                        if (var4 < var6) {
                            ++var4;
                        } else if (var4 > var6) {
                            --var4;
                        }
                        if ((this.field531[this.field548][var3][var4] & 4) != 0) {
                            var2 = this.field548;
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
                    if ((this.field531[this.field548][var3][var4] & 4) != 0) {
                        var2 = this.field548;
                    }
                    var12 += var11;
                    if (var12 >= 65536) {
                        var12 -= 65536;
                        if (var3 < var5) {
                            ++var3;
                        } else if (var3 > var5) {
                            --var3;
                        }
                        if ((this.field531[this.field548][var3][var4] & 4) != 0) {
                            var2 = this.field548;
                        }
                    }
                }
            }
        }
        if ((this.field531[this.field548][field425.field1422 >> 7][field425.field1423 >> 7] & 4) != 0) {
            var2 = this.field548;
        }
        return var2;
    }

    @OriginalMember(owner = "client", name = "C", descriptor = "(I)I")
    public final int method141(int arg0) {
        int var2 = this.method72(this.field187, this.field185, this.field548, -964);
        if (arg0 <= 0) {
            for (int var3 = 1; var3 > 0; ++var3) {
            }
        }
        return var2 - this.field186 < 800 && (this.field531[this.field548][this.field185 >> 7][this.field187 >> 7] & 4) != 0 ? this.field548 : 3;
    }

    @OriginalMember(owner = "client", name = "D", descriptor = "(I)V")
    public final void method142(int arg0) {
        this.field387 = false;
        while (this.field453) {
            this.field387 = false;
            try {
                Thread.sleep(50L);
            } catch (Exception var2) {
            }
        }
        this.field158 = null;
        this.field159 = null;
        this.field280 = null;
        this.field324 = null;
        this.field325 = null;
        this.field326 = null;
        this.field327 = null;
        this.field372 = null;
        this.field373 = null;
        this.field143 = null;
        if (arg0 == 1) {
            this.field144 = null;
            this.field512 = null;
            this.field513 = null;
        }
    }

    @OriginalMember(owner = "client", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        return signlink.mainapp != null ? signlink.mainapp.getAppletContext() : super.getAppletContext();
    }

    @OriginalMember(owner = "client", name = "o", descriptor = "(Z)V")
    public final void method143(boolean arg0) {
        if (!arg0) {
            this.field320.method444(false, 165);
            if (this.field560 != -1) {
                this.field560 = -1;
                this.field490 = true;
                this.field503 = false;
                this.field455 = true;
            }
            if (this.field338 != -1) {
                this.field338 = -1;
                this.field409 = true;
                this.field503 = false;
            }
            if (this.field534 != -1) {
                this.field534 = -1;
                this.field412 = true;
            }
            this.field299 = -1;
        }
    }

    @OriginalMember(owner = "client", name = "E", descriptor = "(I)V")
    public final void method144(int arg0) {
        if (this.field530 > 1) {
            --this.field530;
        }
        if (this.field522 > 0) {
            --this.field522;
        }
        for (int var2 = 0; var2 < 5 && this.method119(true); ++var2) {
        }
        if (this.field248) {
            Object var3 = this.field192.field1566;
            synchronized (this.field192.field1566) {
                if (!field416) {
                    this.field192.field1564 = 0;
                } else if (super.field25 != 0 || this.field192.field1564 >= 40) {
                    this.field320.method444(false, 95);
                    this.field320.method445(0);
                    int var4 = this.field320.field1456;
                    int var5 = 0;
                    for (int var6 = 0; var6 < this.field192.field1564 && var4 - this.field320.field1456 < 240; ++var6) {
                        ++var5;
                        int var7 = this.field192.field1567[var6];
                        if (var7 < 0) {
                            var7 = 0;
                        } else if (var7 > 502) {
                            var7 = 502;
                        }
                        int var8 = this.field192.field1565[var6];
                        if (var8 < 0) {
                            var8 = 0;
                        } else if (var8 > 764) {
                            var8 = 764;
                        }
                        int var9 = var7 * 765 + var8;
                        if (this.field192.field1567[var6] == -1 && this.field192.field1565[var6] == -1) {
                            var8 = -1;
                            var7 = -1;
                            var9 = 524287;
                        }
                        if (this.field577 == var8 && this.field578 == var7) {
                            if (this.field228 < 2047) {
                                ++this.field228;
                            }
                        } else {
                            int var10 = var8 - this.field577;
                            this.field577 = var8;
                            int var11 = var7 - this.field578;
                            this.field578 = var7;
                            if (this.field228 < 8 && var10 >= -32 && var10 <= 31 && var11 >= -32 && var11 <= 31) {
                                var10 += 32;
                                var11 += 32;
                                this.field320.method446((this.field228 << 12) + (var10 << 6) + var11);
                                this.field228 = 0;
                            } else if (this.field228 < 8) {
                                this.field320.method448((this.field228 << 19) + 8388608 + var9);
                                this.field228 = 0;
                            } else {
                                this.field320.method449((this.field228 << 19) + -1073741824 + var9);
                                this.field228 = 0;
                            }
                        }
                    }
                    this.field320.method454(this.field320.field1456 - var4, 36772);
                    if (var5 >= this.field192.field1564) {
                        this.field192.field1564 = 0;
                    } else {
                        this.field192.field1564 -= var5;
                        for (int var12 = 0; var12 < this.field192.field1564; ++var12) {
                            this.field192.field1565[var12] = this.field192.field1565[var5 + var12];
                            this.field192.field1567[var12] = this.field192.field1567[var5 + var12];
                        }
                    }
                }
            }
            if (super.field25 != 0) {
                long var13 = (super.field28 - this.field539) / 50L;
                if (var13 > 4095L) {
                    var13 = 4095L;
                }
                this.field539 = super.field28;
                int var15 = super.field27;
                if (var15 < 0) {
                    var15 = 0;
                } else if (var15 > 502) {
                    var15 = 502;
                }
                int var16 = super.field26;
                if (var16 < 0) {
                    var16 = 0;
                } else if (var16 > 764) {
                    var16 = 764;
                }
                int var17 = var15 * 765 + var16;
                byte var18 = 0;
                if (super.field25 == 2) {
                    var18 = 1;
                }
                int var19 = (int) var13;
                this.field320.method444(false, 217);
                this.field320.method488(3, (var18 << 19) + (var19 << 20) + var17);
            }
            if (this.field553 > 0) {
                --this.field553;
            }
            if (super.field29[1] == 1 || super.field29[2] == 1 || super.field29[3] == 1 || super.field29[4] == 1) {
                this.field554 = true;
            }
            if (this.field554 && this.field553 <= 0) {
                this.field553 = 20;
                this.field554 = false;
                this.field320.method444(false, 239);
                this.field320.method481(975, this.field119);
                this.field320.method446(this.field120);
            }
            if (super.field16 && !this.field285) {
                this.field285 = true;
                this.field320.method444(false, 207);
                this.field320.method445(1);
            }
            if (!super.field16 && this.field285) {
                this.field285 = false;
                this.field320.method444(false, 207);
                this.field320.method445(0);
            }
            this.method84(-770);
            this.method98(false);
            this.method117(false);
            ++this.field520;
            if (this.field520 > 750) {
                this.method150(false);
            }
            this.method147(this.field222);
            this.method40((byte) -28);
            this.method52(0);
            ++this.field579;
            if (this.field430 != 0) {
                this.field429 += 20;
                if (this.field429 >= 400) {
                    this.field430 = 0;
                }
            }
            if (this.field220 != 0) {
                ++this.field217;
                if (this.field217 >= 15) {
                    if (this.field220 == 2) {
                        this.field490 = true;
                    }
                    if (this.field220 == 3) {
                        this.field409 = true;
                    }
                    this.field220 = 0;
                }
            }
            if (this.field584 != 0) {
                ++this.field488;
                if (super.field19 > this.field585 + 5 || super.field19 < this.field585 - 5 || super.field20 > this.field586 + 5 || super.field20 < this.field586 - 5) {
                    this.field435 = true;
                }
                if (super.field18 == 0) {
                    if (this.field584 == 2) {
                        this.field490 = true;
                    }
                    if (this.field584 == 3) {
                        this.field409 = true;
                    }
                    this.field584 = 0;
                    if (this.field435 && this.field488 >= 5) {
                        this.field234 = -1;
                        this.method157(-7);
                        if (this.field582 == this.field234 && this.field583 != this.field233) {
                            class29 var20 = class29.field963[this.field582];
                            byte var21 = 0;
                            if (this.field215 == 1 && var20.field952 == 206) {
                                var21 = 1;
                            }
                            if (var20.field967[this.field233] <= 0) {
                                var21 = 0;
                            }
                            if (var20.field933) {
                                int var22 = this.field583;
                                int var23 = this.field233;
                                var20.field967[var23] = var20.field967[var22];
                                var20.field918[var23] = var20.field918[var22];
                                var20.field967[var22] = -1;
                                var20.field918[var22] = 0;
                            } else if (var21 == 1) {
                                int var24 = this.field583;
                                int var25 = this.field233;
                                while (var24 != var25) {
                                    if (var24 > var25) {
                                        var20.method309(-325, var24, var24 - 1);
                                        --var24;
                                    } else if (var24 < var25) {
                                        var20.method309(-325, var24, var24 + 1);
                                        ++var24;
                                    }
                                }
                            } else {
                                var20.method309(-325, this.field583, this.field233);
                            }
                            this.field320.method444(false, 159);
                            this.field320.method480(-24437, this.field233);
                            this.field320.method481(975, this.field582);
                            this.field320.method446(this.field583);
                            this.field320.method473(var21, this.field432);
                        }
                    } else if ((this.field111 == 1 || this.method94(this.field131 - 1, 9525)) && this.field131 > 2) {
                        this.method74((byte) -83);
                    } else if (this.field131 > 0) {
                        this.method62(this.field131 - 1, 3);
                    }
                    this.field217 = 10;
                    super.field25 = 0;
                }
            }
            if (class38.field1157 != -1) {
                int var26 = class38.field1157;
                int var27 = class38.field1158;
                boolean var28 = this.method71(var26, true, 0, 0, 0, field425.field1416[0], field425.field1415[0], 0, 0, var27, 0, 0);
                class38.field1157 = -1;
                if (var28) {
                    this.field427 = super.field26;
                    this.field428 = super.field27;
                    this.field430 = 1;
                    this.field429 = 0;
                }
            }
            if (super.field25 == 1 && this.field382 != null) {
                this.field382 = null;
                this.field409 = true;
                super.field25 = 0;
            }
            this.method171((byte) 117);
            while (arg0 >= 0) {
                this.field437 = this.field242.method518();
            }
            this.method68(true);
            this.method73(115);
            this.method158((byte) 9);
            if (super.field18 == 1 || super.field25 == 1) {
                ++this.field211;
            }
            if (this.field443 == 2) {
                this.method60(-246);
            }
            if (this.field443 == 2 && this.field267) {
                this.method113(-183);
            }
            for (int var29 = 0; var29 < 5; ++var29) {
                int var10002 = this.field451[var29]++;
            }
            this.method55((byte) 2);
            ++super.field17;
            if (super.field17 > 4500) {
                this.field522 = 250;
                super.field17 -= 500;
                this.field320.method444(false, 214);
            }
            ++this.field335;
            if (this.field335 > 500) {
                this.field335 = 0;
                int var30 = (int) (Math.random() * 8.0D);
                if ((var30 & 1) == 1) {
                    this.field376 += this.field377;
                }
                if ((var30 & 2) == 2) {
                    this.field112 += this.field113;
                }
                if ((var30 & 4) == 4) {
                    this.field345 += this.field346;
                }
            }
            if (this.field376 < -50) {
                this.field377 = 2;
            }
            if (this.field376 > 50) {
                this.field377 = -2;
            }
            if (this.field112 < -55) {
                this.field113 = 2;
            }
            if (this.field112 > 55) {
                this.field113 = -2;
            }
            if (this.field345 < -40) {
                this.field346 = 1;
            }
            if (this.field345 > 40) {
                this.field346 = -1;
            }
            ++this.field411;
            if (this.field411 > 500) {
                this.field411 = 0;
                int var31 = (int) (Math.random() * 8.0D);
                if ((var31 & 1) == 1) {
                    this.field197 += this.field198;
                }
                if ((var31 & 2) == 2) {
                    this.field292 += this.field293;
                }
            }
            if (this.field197 < -60) {
                this.field198 = 2;
            }
            if (this.field197 > 60) {
                this.field198 = -2;
            }
            if (this.field292 < -20) {
                this.field293 = 1;
            }
            if (this.field292 > 10) {
                this.field293 = -1;
            }
            ++this.field521;
            if (this.field521 > 50) {
                this.field320.method444(false, 161);
            }
            try {
                if (this.field318 != null && this.field320.field1456 > 0) {
                    this.field318.method178(0, this.field320.field1455, this.field320.field1456, 0);
                    this.field320.field1456 = 0;
                    this.field521 = 0;
                }
            } catch (IOException var33) {
                this.method150(false);
            } catch (Exception var34) {
                this.method78(true);
            }
        }
    }

    @OriginalMember(owner = "client", name = "F", descriptor = "(I)V")
    public final void method145(int arg0) {
        if (arg0 >= 0) {
            this.field320.method445(198);
        }
        short var2 = 256;
        if (this.field484 > 0) {
            for (int var3 = 0; var3 < 256; ++var3) {
                if (this.field484 > 768) {
                    this.field324[var3] = this.method91(1024 - this.field484, this.field325[var3], (byte) -62, this.field326[var3]);
                } else if (this.field484 > 256) {
                    this.field324[var3] = this.field326[var3];
                } else {
                    this.field324[var3] = this.method91(256 - this.field484, this.field326[var3], (byte) -62, this.field325[var3]);
                }
            }
        } else if (this.field485 > 0) {
            for (int var4 = 0; var4 < 256; ++var4) {
                if (this.field485 > 768) {
                    this.field324[var4] = this.method91(1024 - this.field485, this.field325[var4], (byte) -62, this.field327[var4]);
                } else if (this.field485 > 256) {
                    this.field324[var4] = this.field327[var4];
                } else {
                    this.field324[var4] = this.method91(256 - this.field485, this.field327[var4], (byte) -62, this.field325[var4]);
                }
            }
        } else {
            for (int var5 = 0; var5 < 256; ++var5) {
                this.field324[var5] = this.field325[var5];
            }
        }
        for (int var6 = 0; var6 < 33920; ++var6) {
            this.field202.field1244[var6] = this.field512.field751[var6];
        }
        int var7 = 0;
        int var8 = 1152;
        for (int var9 = 1; var9 < var2 - 1; ++var9) {
            int var23 = (var2 - var9) * this.field542[var9] / var2;
            int var24 = var23 + 22;
            if (var24 < 0) {
                var24 = 0;
            }
            var7 += var24;
            for (int var25 = var24; var25 < 128; ++var25) {
                int var26 = this.field143[var7++];
                if (var26 != 0) {
                    int var28 = 256 - var26;
                    int var29 = this.field324[var26];
                    int var30 = this.field202.field1244[var8];
                    this.field202.field1244[var8++] = ((var29 & 16711935) * var26 + (var30 & 16711935) * var28 & -16711936) + ((var29 & 65280) * var26 + (var30 & 65280) * var28 & 16711680) >> 8;
                } else {
                    ++var8;
                }
            }
            var8 += var24;
        }
        this.field202.method400((byte) -122, 0, 0, super.field11);
        for (int var10 = 0; var10 < 33920; ++var10) {
            this.field203.field1244[var10] = this.field513.field751[var10];
        }
        int var11 = 0;
        int var12 = 1176;
        for (int var13 = 1; var13 < var2 - 1; ++var13) {
            int var14 = (var2 - var13) * this.field542[var13] / var2;
            int var15 = 103 - var14;
            int var16 = var12 + var14;
            for (int var17 = 0; var17 < var15; ++var17) {
                int var18 = this.field143[var11++];
                if (var18 != 0) {
                    int var20 = 256 - var18;
                    int var21 = this.field324[var18];
                    int var22 = this.field203.field1244[var16];
                    this.field203.field1244[var16++] = ((var21 & 16711935) * var18 + (var22 & 16711935) * var20 & -16711936) + ((var21 & 65280) * var18 + (var22 & 65280) * var20 & 16711680) >> 8;
                } else {
                    ++var16;
                }
            }
            var11 += 128 - var15;
            var12 = 128 - var15 - var14 + var16;
        }
        this.field203.method400((byte) -122, 0, 637, super.field11);
    }

    @OriginalMember(owner = "client", name = "G", descriptor = "(I)V")
    public final void method146(int arg0) {
        this.field301 = true;
        for (int var2 = 0; var2 < 7; ++var2) {
            this.field545[var2] = -1;
            for (int var3 = 0; var3 < class36.field1098; ++var3) {
                if (!class36.field1099[var3].field1105 && class36.field1099[var3].field1100 == var2 + (this.field515 ? 0 : 7)) {
                    this.field545[var2] = var3;
                    break;
                }
            }
        }
        if (arg0 <= 0) {
            this.field519 = this.field363.method455();
        }
    }

    @OriginalMember(owner = "client", name = "j", descriptor = "(B)V")
    public final void method147(byte arg0) {
        if (arg0 != 1) {
            this.field483 = 118;
        }
        for (int var2 = -1; var2 < this.field471; ++var2) {
            int var3;
            if (var2 == -1) {
                var3 = this.field469;
            } else {
                var3 = this.field472[var2];
            }
            class56 var4 = this.field470[var3];
            if (var4 != null) {
                this.method41(594, 1, var4);
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(LUAWAYCTK;II)V")
    private final void method148(class55 arg0, int arg1, int arg2) {
        int var4 = 20 / arg2;
        this.field297 = 0;
        this.field473 = 0;
        this.method61(0, arg0, arg1);
        this.method149(969, arg1, arg0);
        this.method92(arg0, this.field117, arg1);
        for (int var5 = 0; var5 < this.field297; ++var5) {
            int var7 = this.field298[var5];
            if (field347 != this.field365[var7].field1432) {
                this.field365[var7].field871 = null;
                this.field365[var7] = null;
            }
        }
        if (arg0.field1456 != arg1) {
            signlink.reporterror(this.field357 + " size mismatch in getnpcpos - pos:" + arg0.field1456 + " psize:" + arg1);
            throw new RuntimeException("eek");
        } else {
            for (int var6 = 0; var6 < this.field366; ++var6) {
                if (this.field365[this.field367[var6]] == null) {
                    signlink.reporterror(this.field357 + " null entry in npc list - pos:" + var6 + " size:" + this.field366);
                    throw new RuntimeException("eek");
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(IILUAWAYCTK;)V")
    private final void method149(int arg0, int arg1, class55 arg2) {
        if (arg0 <= 0) {
            this.field464 = !this.field464;
        }
        while (arg2.field1457 + 21 < arg1 * 8) {
            int var4 = arg2.method466(5, 14);
            if (var4 == 16383) {
                break;
            }
            if (this.field365[var4] == null) {
                this.field365[var4] = new class25();
            }
            class25 var5 = this.field365[var4];
            this.field367[this.field366++] = var4;
            var5.field1432 = field347;
            var5.field871 = class24.method284(arg2.method466(5, 12));
            int var6 = arg2.method466(5, 1);
            if (var6 == 1) {
                this.field474[this.field473++] = var4;
            }
            int var7 = arg2.method466(5, 5);
            if (var7 > 15) {
                var7 -= 32;
            }
            int var8 = arg2.method466(5, 5);
            if (var8 > 15) {
                var8 -= 32;
            }
            int var9 = arg2.method466(5, 1);
            var5.field1417 = var5.field871.field854;
            var5.field1418 = var5.field871.field862;
            var5.field1410 = var5.field871.field845;
            var5.field1411 = var5.field871.field864;
            var5.field1412 = var5.field871.field841;
            var5.field1413 = var5.field871.field857;
            var5.field1407 = var5.field871.field839;
            var5.method441(field425.field1416[0] + var8, var9 == 1, field425.field1415[0] + var7, true);
        }
        arg2.method467(false);
    }

    @OriginalMember(owner = "client", name = "p", descriptor = "(Z)V")
    public final void method150(boolean arg0) {
        if (this.field522 > 0) {
            this.method78(true);
        } else {
            this.field510.method399(true);
            if (arg0) {
                for (int var2 = 1; var2 > 0; ++var2) {
                }
            }
            this.field331.method241(144, 257, "Connection lost", 0, 0);
            this.field331.method241(143, 256, "Connection lost", 0, 16777215);
            this.field331.method241(159, 257, "Please wait - attempting to reestablish", 0, 0);
            this.field331.method241(158, 256, "Please wait - attempting to reestablish", 0, 16777215);
            this.field510.method400((byte) -122, 4, 4, super.field11);
            this.field549 = 0;
            this.field400 = 0;
            class9 var3 = this.field318;
            this.field248 = false;
            this.field487 = 0;
            this.method67(this.field357, this.field358, true);
            if (!this.field248) {
                this.method78(true);
            }
            try {
                var3.method174();
            } catch (Exception var4) {
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(Ljava/lang/String;)Ljava/io/DataInputStream;")
    public final DataInputStream method151(String arg0) throws IOException {
        if (!this.field180) {
            return signlink.mainapp != null ? signlink.openurl(arg0) : new DataInputStream((new URL(this.getCodeBase(), arg0)).openStream());
        } else {
            if (this.field237 != null) {
                try {
                    this.field237.close();
                } catch (Exception var4) {
                }
                this.field237 = null;
            }
            this.field237 = this.method99(43595);
            this.field237.setSoTimeout(10000);
            InputStream var2 = this.field237.getInputStream();
            OutputStream var3 = this.field237.getOutputStream();
            var3.write(("JAGGRAB /" + arg0 + "\n\n").getBytes());
            return new DataInputStream(var2);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LLYHLTGUG;B)Z")
    public final boolean method152(class29 arg0, byte arg1) {
        if (arg1 != 44) {
            throw new NullPointerException();
        } else {
            int var3 = arg0.field952;
            if ((var3 < 1 || var3 > 200) && (var3 < 701 || var3 > 900)) {
                if (var3 >= 401 && var3 <= 500) {
                    this.field305[this.field131] = "Remove @whi@" + arg0.field978;
                    this.field251[this.field131] = 279;
                    ++this.field131;
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
                this.field305[this.field131] = "Remove @whi@" + this.field581[var3];
                this.field251[this.field131] = 280;
                ++this.field131;
                this.field305[this.field131] = "Message @whi@" + this.field581[var3];
                this.field251[this.field131] = 73;
                ++this.field131;
                return true;
            }
        }
    }

    @OriginalMember(owner = "client", name = "H", descriptor = "(I)V")
    public static final void method153(int arg0) {
        class38.field1123 = true;
        class26.field873 = true;
        field196 = true;
        class22.field794 = true;
        class4.field51 = true;
        if (arg0 < 5 || arg0 > 5) {
            ;
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(III)Z")
    public final boolean method154(int arg0, int arg1, int arg2) {
        boolean var4 = false;
        class29 var5 = class29.field963[arg0];
        for (int var6 = 0; var6 < var5.field926.length && var5.field926[var6] != -1; ++var6) {
            class29 var7 = class29.field963[var5.field926[var6]];
            if (var7.field921 == 1) {
                var4 |= this.method154(var7.field938, arg1, 0);
            }
            if (var7.field921 == 6 && (var7.field954 != -1 || var7.field955 != -1)) {
                boolean var8 = this.method97((byte) 2, var7);
                int var9;
                if (var8) {
                    var9 = var7.field955;
                } else {
                    var9 = var7.field954;
                }
                if (var9 != -1) {
                    class47 var10 = class47.field1280[var9];
                    var7.field974 += arg1;
                    while (var7.field974 > var10.method414(var7.field972, this.field145)) {
                        var7.field974 -= var10.method414(var7.field972, this.field145) + 1;
                        ++var7.field972;
                        if (var7.field972 >= var10.field1281) {
                            var7.field972 -= var10.field1285;
                            if (var7.field972 < 0 || var7.field972 >= var10.field1281) {
                                var7.field972 = 0;
                            }
                        }
                        var4 = true;
                    }
                }
            }
            if (var7.field921 == 6 && var7.field925 != 0) {
                int var11 = var7.field925 >> 16;
                int var12 = var7.field925 << 16 >> 16;
                int var13 = arg1 * var11;
                int var14 = arg1 * var12;
                var7.field947 = var7.field947 + var13 & 2047;
                var7.field948 = var7.field948 + var14 & 2047;
                var4 = true;
            }
        }
        this.field518 += arg2;
        return var4;
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(IIIIII)V")
    public final void method155(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field235.method555(arg4, arg2, this.field481);
        if (arg3 < 7 || arg3 > 7) {
            this.field519 = -1;
        }
        this.field236.method555(arg4, arg1 + arg2 - 16, this.field481);
        class53.method432(this.field404, arg2 + 16, arg1 - 32, false, arg4, 16);
        int var7 = (arg1 - 32) * arg1 / arg0;
        if (var7 < 8) {
            var7 = 8;
        }
        int var8 = (arg1 - 32 - var7) * arg5 / (arg0 - arg1);
        class53.method432(this.field351, arg2 + 16 + var8, var7, false, arg4, 16);
        class53.method437(this.field312, arg4, var7, 617, arg2 + 16 + var8);
        class53.method437(this.field312, arg4 + 1, var7, 617, arg2 + 16 + var8);
        class53.method435((byte) 1, arg2 + 16 + var8, 16, this.field312, arg4);
        class53.method435((byte) 1, arg2 + 17 + var8, 16, this.field312, arg4);
        class53.method437(this.field279, arg4 + 15, var7, 617, arg2 + 16 + var8);
        class53.method437(this.field279, arg4 + 14, var7 - 1, 617, arg2 + 17 + var8);
        class53.method435((byte) 1, arg2 + 15 + var8 + var7, 16, this.field279, arg4);
        class53.method435((byte) 1, arg2 + 14 + var8 + var7, 15, this.field279, arg4 + 1);
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IILUFGXOLGK;II)V")
    public final void method156(int arg0, int arg1, class56 arg2, int arg3, int arg4) {
        this.field518 += arg3;
        if (field425 != arg2) {
            if (this.field131 < 400) {
                String var6;
                if (arg2.field1477 == 0) {
                    var6 = arg2.field1488 + method81(arg2.field1480, -695, field425.field1480) + " (level-" + arg2.field1480 + ")";
                } else {
                    var6 = arg2.field1488 + " (skill-" + arg2.field1477 + ")";
                }
                if (this.field494 == 1) {
                    this.field305[this.field131] = "Use " + this.field498 + " with @whi@" + var6;
                    this.field251[this.field131] = 863;
                    this.field252[this.field131] = arg1;
                    this.field249[this.field131] = arg4;
                    this.field250[this.field131] = arg0;
                    ++this.field131;
                } else if (this.field146 == 1) {
                    if ((this.field148 & 8) == 8) {
                        this.field305[this.field131] = this.field149 + " @whi@" + var6;
                        this.field251[this.field131] = 222;
                        this.field252[this.field131] = arg1;
                        this.field249[this.field131] = arg4;
                        this.field250[this.field131] = arg0;
                        ++this.field131;
                    }
                } else {
                    for (int var7 = 4; var7 >= 0; --var7) {
                        if (this.field129[var7] != null) {
                            this.field305[this.field131] = this.field129[var7] + " @whi@" + var6;
                            short var9 = 0;
                            if (this.field129[var7].equalsIgnoreCase("attack")) {
                                if (arg2.field1480 > field425.field1480) {
                                    var9 = 2000;
                                }
                                if (field425.field1474 != 0 && arg2.field1474 != 0) {
                                    if (field425.field1474 == arg2.field1474) {
                                        var9 = 2000;
                                    } else {
                                        var9 = 0;
                                    }
                                }
                            } else if (this.field130[var7]) {
                                var9 = 2000;
                            }
                            if (var7 == 0) {
                                this.field251[this.field131] = var9 + 267;
                            }
                            if (var7 == 1) {
                                this.field251[this.field131] = var9 + 962;
                            }
                            if (var7 == 2) {
                                this.field251[this.field131] = var9 + 275;
                            }
                            if (var7 == 3) {
                                this.field251[this.field131] = var9 + 634;
                            }
                            if (var7 == 4) {
                                this.field251[this.field131] = var9 + 187;
                            }
                            this.field252[this.field131] = arg1;
                            this.field249[this.field131] = arg4;
                            this.field250[this.field131] = arg0;
                            ++this.field131;
                        }
                    }
                }
                for (int var8 = 0; var8 < this.field131; ++var8) {
                    if (this.field251[var8] == 904) {
                        this.field305[var8] = "Walk here @whi@" + var6;
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "run", descriptor = "()V")
    public final void run() {
        if (this.field182) {
            this.method127(-226);
        } else {
            super.run();
        }
    }

    @OriginalMember(owner = "client", name = "I", descriptor = "(I)V")
    public final void method157(int arg0) {
        if (this.field584 == 0) {
            this.field305[0] = "Cancel";
            this.field251[0] = 1966;
            this.field131 = 1;
            this.method76(this.field232);
            this.field517 = 0;
            this.field291 = 0;
            if (super.field19 > 4 && super.field20 > 4 && super.field19 < 516 && super.field20 < 338) {
                if (this.field299 != -1) {
                    this.method169(class29.field963[this.field299], 5, 0, super.field19, 4, 0, super.field20, 4);
                } else {
                    this.method172(5631);
                }
            }
            if (this.field517 != this.field183) {
                this.field183 = this.field517;
            }
            if (this.field291 != this.field191) {
                this.field191 = this.field291;
            }
            this.field517 = 0;
            this.field291 = 0;
            if (super.field19 > 553 && super.field20 > 205 && super.field19 < 743 && super.field20 < 466) {
                if (this.field560 != -1) {
                    this.method169(class29.field963[this.field560], 5, 1, super.field19, 205, 0, super.field20, 553);
                } else if (this.field418[this.field125] != -1) {
                    this.method169(class29.field963[this.field418[this.field125]], 5, 1, super.field19, 205, 0, super.field20, 553);
                }
            }
            if (this.field517 != this.field403) {
                this.field490 = true;
                this.field403 = this.field517;
            }
            if (this.field526 != this.field291) {
                this.field490 = true;
                this.field526 = this.field291;
            }
            this.field517 = 0;
            this.field291 = 0;
            if (arg0 >= 0) {
                this.field519 = this.field363.method455();
            }
            if (super.field19 > 17 && super.field20 > 357 && super.field19 < 496 && super.field20 < 453) {
                if (this.field338 != -1) {
                    this.method169(class29.field963[this.field338], 5, 2, super.field19, 357, 0, super.field20, 17);
                } else if (this.field126 != -1) {
                    this.method169(class29.field963[this.field126], 5, 3, super.field19, 357, 0, super.field20, 17);
                } else if (super.field20 < 434 && super.field19 < 426) {
                    this.method93(true, super.field19 - 17, super.field20 - 357);
                }
            }
            if (this.field338 != -1 && this.field517 != this.field359) {
                this.field409 = true;
                this.field359 = this.field517;
            }
            if (this.field338 != -1 && this.field436 != this.field291) {
                this.field409 = true;
                this.field436 = this.field291;
            }
            boolean var2 = false;
            while (!var2) {
                var2 = true;
                for (int var3 = 0; var3 < this.field131 - 1; ++var3) {
                    if (this.field251[var3] < 1000 && this.field251[var3 + 1] > 1000) {
                        String var4 = this.field305[var3];
                        this.field305[var3] = this.field305[var3 + 1];
                        this.field305[var3 + 1] = var4;
                        int var5 = this.field251[var3];
                        this.field251[var3] = this.field251[var3 + 1];
                        this.field251[var3 + 1] = var5;
                        int var6 = this.field249[var3];
                        this.field249[var3] = this.field249[var3 + 1];
                        this.field249[var3 + 1] = var6;
                        int var7 = this.field250[var3];
                        this.field250[var3] = this.field250[var3 + 1];
                        this.field250[var3 + 1] = var7;
                        int var8 = this.field252[var3];
                        this.field252[var3] = this.field252[var3 + 1];
                        this.field252[var3 + 1] = var8;
                        var2 = false;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "k", descriptor = "(B)V")
    public final void method158(byte arg0) {
        if (arg0 != 9) {
            this.field519 = this.field363.method455();
        }
        if (super.field25 == 1) {
            if (super.field26 >= 6 && super.field26 <= 106 && super.field27 >= 467 && super.field27 <= 499) {
                this.field571 = (this.field571 + 1) % 4;
                this.field459 = true;
                this.field409 = true;
                this.field320.method444(false, 4);
                this.field320.method445(this.field571);
                this.field320.method445(this.field354);
                this.field320.method445(this.field516);
            }
            if (super.field26 >= 135 && super.field26 <= 235 && super.field27 >= 467 && super.field27 <= 499) {
                this.field354 = (this.field354 + 1) % 3;
                this.field459 = true;
                this.field409 = true;
                this.field320.method444(false, 4);
                this.field320.method445(this.field571);
                this.field320.method445(this.field354);
                this.field320.method445(this.field516);
            }
            if (super.field26 >= 273 && super.field26 <= 373 && super.field27 >= 467 && super.field27 <= 499) {
                this.field516 = (this.field516 + 1) % 3;
                this.field459 = true;
                this.field409 = true;
                this.field320.method444(false, 4);
                this.field320.method445(this.field571);
                this.field320.method445(this.field354);
                this.field320.method445(this.field516);
            }
            if (super.field26 >= 412 && super.field26 <= 512 && super.field27 >= 467 && super.field27 <= 499) {
                if (this.field299 == -1) {
                    this.method143(false);
                    this.field408 = "";
                    this.field502 = false;
                    for (int var2 = 0; var2 < class29.field963.length; ++var2) {
                        if (class29.field963[var2] != null && class29.field963[var2].field952 == 600) {
                            this.field243 = this.field299 = class29.field963[var2].field928;
                            return;
                        }
                    }
                    return;
                }
                this.method104("", "Please close the interface you have open before using 'report abuse'", 0, this.field341);
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(IILIBHVCUAH;I)V")
    public final void method159(int arg0, int arg1, class19 arg2, int arg3) {
        int var5 = arg0 * arg0 + arg3 * arg3;
        while (arg1 >= 0) {
            this.field519 = this.field363.method455();
        }
        if (var5 > 4225 && var5 < 90000) {
            int var6 = this.field197 + this.field120 & 2047;
            int var7 = class66.field1649[var6];
            int var8 = class66.field1650[var6];
            int var9 = var7 * 256 / (this.field292 + 256);
            int var10 = var8 * 256 / (this.field292 + 256);
            int var11 = arg0 * var9 + arg3 * var10 >> 16;
            int var12 = arg0 * var10 - arg3 * var9 >> 16;
            double var13 = Math.atan2((double) var11, (double) var12);
            int var15 = (int) (Math.sin(var13) * 63.0D);
            int var16 = (int) (Math.cos(var13) * 57.0D);
            this.field275.method237(var13, (byte) 126, 15, 83 - var16 - 20, 256, 15, 20, var15 + 94 + 4 - 10, 20);
        } else {
            this.method100(arg3, arg0, arg2, 2934);
        }
    }

    @OriginalMember(owner = "client", name = "l", descriptor = "(B)V")
    public final void method160(byte arg0) {
        try {
            this.field414 = -1;
            this.field450.method507();
            this.field208.method507();
            ++field523;
            if (field523 > 118) {
                field523 = 0;
                this.field320.method444(false, 118);
                this.field320.method449(0);
            }
            class26.method291(344);
            this.method70(this.field406);
            this.field383.method342(false);
            System.gc();
            for (int var2 = 0; var2 < 4; ++var2) {
                this.field445[var2].method25();
            }
            for (int var3 = 0; var3 < 4; ++var3) {
                for (int var4 = 0; var4 < 104; ++var4) {
                    for (int var5 = 0; var5 < 104; ++var5) {
                        this.field531[var3][var4][var5] = 0;
                    }
                }
            }
            class22 var6 = new class22(104, 104, this.field360, (byte) -35, this.field531);
            int var7 = this.field163.length;
            this.field320.method444(false, 161);
            if (!this.field499) {
                for (int var8 = 0; var8 < var7; ++var8) {
                    int var9 = (this.field272[var8] >> 8) * 64 - this.field255;
                    int var10 = (this.field272[var8] & 255) * 64 - this.field256;
                    byte[] var11 = this.field163[var8];
                    if (var11 != null) {
                        var6.method276(var9, 2, (this.field556 - 6) * 8, (this.field555 - 6) * 8, this.field445, var11, var10);
                    }
                }
                for (int var12 = 0; var12 < var7; ++var12) {
                    int var13 = (this.field272[var12] >> 8) * 64 - this.field255;
                    int var14 = (this.field272[var12] & 255) * 64 - this.field256;
                    byte[] var15 = this.field163[var12];
                    if (var15 == null && this.field556 < 800) {
                        var6.method256((byte) -11, var13, 64, var14, 64);
                    }
                }
                this.field320.method444(false, 161);
                for (int var16 = 0; var16 < var7; ++var16) {
                    byte[] var17 = this.field504[var16];
                    if (var17 != null) {
                        int var18 = (this.field272[var16] >> 8) * 64 - this.field255;
                        int var19 = (this.field272[var16] & 255) * 64 - this.field256;
                        var6.method264(false, var19, var17, this.field445, this.field383, var18);
                    }
                }
            }
            if (this.field499) {
                int var20 = 0;
                label253: while (true) {
                    if (var20 >= 4) {
                        for (int var30 = 0; var30 < 13; ++var30) {
                            for (int var31 = 0; var31 < 13; ++var31) {
                                int var32 = this.field569[0][var30][var31];
                                if (var32 == -1) {
                                    var6.method256((byte) -11, var30 * 8, 8, var31 * 8, 8);
                                }
                            }
                        }
                        this.field320.method444(false, 161);
                        int var33 = 0;
                        while (true) {
                            if (var33 >= 4) {
                                break label253;
                            }
                            for (int var34 = 0; var34 < 13; ++var34) {
                                for (int var35 = 0; var35 < 13; ++var35) {
                                    int var36 = this.field569[var33][var34][var35];
                                    if (var36 != -1) {
                                        int var37 = var36 >> 24 & 3;
                                        int var38 = var36 >> 1 & 3;
                                        int var39 = var36 >> 14 & 1023;
                                        int var40 = var36 >> 3 & 2047;
                                        int var41 = (var39 / 8 << 8) + var40 / 8;
                                        for (int var42 = 0; var42 < this.field272.length; ++var42) {
                                            if (this.field272[var42] == var41 && this.field504[var42] != null) {
                                                var6.method273((var39 & 7) * 8, var34 * 8, var35 * 8, this.field504[var42], var38, var33, this.field383, (var40 & 7) * 8, (byte) 2, var37, this.field445);
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
                            int var23 = this.field569[var20][var21][var22];
                            if (var23 != -1) {
                                int var24 = var23 >> 24 & 3;
                                int var25 = var23 >> 1 & 3;
                                int var26 = var23 >> 14 & 1023;
                                int var27 = var23 >> 3 & 2047;
                                int var28 = (var26 / 8 << 8) + var27 / 8;
                                for (int var29 = 0; var29 < this.field272.length; ++var29) {
                                    if (this.field272[var29] == var28 && this.field163[var29] != null) {
                                        var6.method258(var25, var22 * 8, this.field163[var29], this.field445, var21 * 8, 383, var24, (var27 & 7) * 8, (var26 & 7) * 8, var20);
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    ++var20;
                }
            }
            this.field320.method444(false, 161);
            var6.method260(430, this.field445, this.field383);
            this.field510.method399(true);
            this.field320.method444(false, 161);
            int var43 = class22.field783;
            if (var43 > this.field548) {
                var43 = this.field548;
            }
            if (var43 < this.field548 - 1) {
                int var44 = this.field548 - 1;
            }
            if (field196) {
                this.field383.method343((byte) 116, class22.field783);
            } else {
                this.field383.method343((byte) 116, 0);
            }
            for (int var45 = 0; var45 < 104; ++var45) {
                for (int var46 = 0; var46 < 104; ++var46) {
                    this.method66(var45, var46);
                }
            }
            this.method131(818);
        } catch (Exception var60) {
        }
        class4.field64.method208();
        if (super.field14 != null) {
            this.field320.method444(false, 37);
            this.field320.method449(1057001181);
        }
        if (field196 && signlink.cache_dat != null) {
            int var48 = this.field491.method191(false, 0);
            for (int var49 = 0; var49 < var48; ++var49) {
                int var50 = this.field491.method200(var49, -651);
                if ((var50 & 121) == 0) {
                    class66.method524(var49, 4);
                }
            }
        }
        System.gc();
        class26.method292(37165, 20);
        this.field491.method185((byte) 6);
        int var51 = (this.field555 - 6) / 8 - 1;
        int var52 = (this.field555 + 6) / 8 + 1;
        int var53 = (this.field556 - 6) / 8 - 1;
        int var54 = (this.field556 + 6) / 8 + 1;
        if (arg0 == 7) {
            boolean var55 = false;
        } else {
            this.method6();
        }
        if (this.field161) {
            var51 = 49;
            var52 = 50;
            var53 = 49;
            var54 = 50;
        }
        for (int var56 = var51; var56 <= var52; ++var56) {
            for (int var57 = var53; var57 <= var54; ++var57) {
                if (var51 == var56 || var52 == var56 || var53 == var57 || var54 == var57) {
                    int var58 = this.field491.method199(var57, 0, -306, var56);
                    if (var58 != -1) {
                        this.field491.method195(-901, var58, 3);
                    }
                    int var59 = this.field491.method199(var57, 1, -306, var56);
                    if (var59 != -1) {
                        this.field491.method195(-901, var59, 3);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "J", descriptor = "(I)V")
    public final void method161(int arg0) {
        class51 var2 = (class51) this.field208.method503();
        int var3 = 37 / arg0;
        while (var2 != null) {
            if (this.field548 == var2.field1346 && field347 <= var2.field1354) {
                if (field347 >= var2.field1353) {
                    if (var2.field1344 > 0) {
                        class25 var4 = this.field365[var2.field1344 - 1];
                        if (var4 != null && var4.field1422 >= 0 && var4.field1422 < 13312 && var4.field1423 >= 0 && var4.field1423 < 13312) {
                            var2.method425(this.method72(var4.field1423, var4.field1422, var2.field1346, -964) - var2.field1352, var4.field1422, 1, var4.field1423, field347);
                        }
                    }
                    if (var2.field1344 < 0) {
                        int var5 = -var2.field1344 - 1;
                        class56 var6;
                        if (this.field375 == var5) {
                            var6 = field425;
                        } else {
                            var6 = this.field470[var5];
                        }
                        if (var6 != null && var6.field1422 >= 0 && var6.field1422 < 13312 && var6.field1423 >= 0 && var6.field1423 < 13312) {
                            var2.method425(this.method72(var6.field1423, var6.field1422, var2.field1346, -964) - var2.field1352, var6.field1422, 1, var6.field1423, field347);
                        }
                    }
                    var2.method426(this.field398, this.field579);
                    this.field383.method353(60, (int) var2.field1338, var2.field1335, -1, 8, (int) var2.field1340, this.field548, (int) var2.field1339, var2, false);
                }
            } else {
                var2.method398();
            }
            var2 = (class51) this.field208.method505(false);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IZLTTYUWHXI;)V")
    public final void method162(int arg0, boolean arg1, class54 arg2) {
        this.method163(arg2.field1422, arg0, arg2.field1423, this.field281);
        if (arg1) {
            this.field519 = -1;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIB)V")
    public final void method163(int arg0, int arg1, int arg2, byte arg3) {
        if (arg0 >= 128 && arg2 >= 128 && arg0 <= 13056 && arg2 <= 13056) {
            int var5 = this.method72(arg2, arg0, this.field548, -964) - arg1;
            int var6 = arg0 - this.field185;
            int var7 = var5 - this.field186;
            int var8 = arg2 - this.field187;
            if (this.field389 != arg3) {
                this.field519 = this.field363.method455();
            }
            int var9 = class66.field1649[this.field188];
            int var10 = class66.field1650[this.field188];
            int var11 = class66.field1649[this.field189];
            int var12 = class66.field1650[this.field189];
            int var13 = var6 * var12 + var8 * var11 >> 16;
            int var14 = var8 * var12 - var6 * var11 >> 16;
            int var16 = var7 * var10 - var9 * var14 >> 16;
            int var17 = var7 * var9 + var10 * var14 >> 16;
            if (var17 >= 50) {
                this.field355 = (var13 << 9) / var17 + class26.field878;
                this.field356 = (var16 << 9) / var17 + class26.field879;
            } else {
                this.field355 = -1;
                this.field356 = -1;
            }
        } else {
            this.field355 = -1;
            this.field356 = -1;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILDOIBONME;)V")
    private final void method164(int arg0, class8 arg1) {
        int var3 = 0;
        int var4 = -1;
        int var5 = 0;
        int var6 = 0;
        if (arg1.field623 == 0) {
            var3 = this.field383.method368(arg1.field622, arg1.field624, arg1.field625);
        }
        if (arg1.field623 == 1) {
            var3 = this.field383.method369(arg1.field625, -17514, arg1.field624, arg1.field622);
        }
        if (arg1.field623 == 2) {
            var3 = this.field383.method370(arg1.field622, arg1.field624, arg1.field625);
        }
        if (arg1.field623 == 3) {
            var3 = this.field383.method371(arg1.field622, arg1.field624, arg1.field625);
        }
        if (var3 != 0) {
            int var7 = this.field383.method372(arg1.field622, arg1.field624, arg1.field625, var3);
            var4 = var3 >> 14 & 32767;
            var5 = var7 & 31;
            var6 = var7 >> 6;
        }
        arg1.field617 = var4;
        if (arg0 != 0) {
            for (int var8 = 1; var8 > 0; ++var8) {
            }
        }
        arg1.field619 = var5;
        arg1.field618 = var6;
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(BI)V")
    public final void method165(byte arg0, int arg1) {
        int var3 = class49.field1311[arg1].field1319;
        if (var3 != 0) {
            int var4 = this.field286[arg1];
            if (arg0 == 109) {
                if (var3 == 1) {
                    if (var4 == 1) {
                        class26.method297(0.9D, 5);
                    }
                    if (var4 == 2) {
                        class26.method297(0.8D, 5);
                    }
                    if (var4 == 3) {
                        class26.method297(0.7D, 5);
                    }
                    if (var4 == 4) {
                        class26.method297(0.6D, 5);
                    }
                    class31.field1034.method208();
                    this.field412 = true;
                }
                if (var3 == 3) {
                    boolean var5 = this.field532;
                    if (var4 == 0) {
                        this.method63(0, this.field532, -22490);
                        this.field532 = true;
                    }
                    if (var4 == 1) {
                        this.method63(-400, this.field532, -22490);
                        this.field532 = true;
                    }
                    if (var4 == 2) {
                        this.method63(-800, this.field532, -22490);
                        this.field532 = true;
                    }
                    if (var4 == 3) {
                        this.method63(-1200, this.field532, -22490);
                        this.field532 = true;
                    }
                    if (var4 == 4) {
                        this.field532 = false;
                    }
                    if (this.field532 != var5 && !field196) {
                        if (this.field532) {
                            this.field369 = this.field476;
                            this.field370 = true;
                            this.field491.method184(2, this.field369);
                        } else {
                            this.method123(0);
                        }
                        this.field210 = 0;
                    }
                }
                if (var3 == 4) {
                    if (var4 == 0) {
                        this.field244 = true;
                        this.method48(0, -21639);
                    }
                    if (var4 == 1) {
                        this.field244 = true;
                        this.method48(-400, -21639);
                    }
                    if (var4 == 2) {
                        this.field244 = true;
                        this.method48(-800, -21639);
                    }
                    if (var4 == 3) {
                        this.field244 = true;
                        this.method48(-1200, -21639);
                    }
                    if (var4 == 4) {
                        this.field244 = false;
                    }
                }
                if (var3 == 5) {
                    this.field111 = var4;
                }
                if (var3 == 6) {
                    this.field380 = var4;
                }
                if (var3 == 8) {
                    this.field214 = var4;
                    this.field409 = true;
                }
                if (var3 == 9) {
                    this.field215 = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "K", descriptor = "(I)V")
    public final void method166(int arg0) {
        if (arg0 != -17023) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        while (true) {
            class63 var3 = this.field491.method197();
            if (var3 == null) {
                return;
            }
            if (var3.field1557 == 0) {
                class66.method523(var3.field1559, 39302, var3.field1558);
                if ((this.field491.method200(var3.field1558, -651) & 98) != 0) {
                    this.field490 = true;
                    if (this.field338 != -1) {
                        this.field409 = true;
                    }
                }
            }
            if (var3.field1557 == 1 && var3.field1559 != null) {
                class15.method215(-40035, var3.field1559);
            }
            if (var3.field1557 == 2 && this.field369 == var3.field1558 && var3.field1559 != null) {
                this.method88(this.field370, var3.field1559, (byte) -101);
            }
            if (var3.field1557 == 3 && this.field443 == 1) {
                for (int var4 = 0; var4 < this.field163.length; ++var4) {
                    if (this.field273[var4] == var3.field1558) {
                        this.field163[var4] = var3.field1559;
                        if (var3.field1559 == null) {
                            this.field273[var4] = -1;
                        }
                        break;
                    }
                    if (this.field274[var4] == var3.field1558) {
                        this.field504[var4] = var3.field1559;
                        if (var3.field1559 == null) {
                            this.field274[var4] = -1;
                        }
                        break;
                    }
                }
            }
            if (var3.field1557 == 93 && this.field491.method187(this.field190, var3.field1558)) {
                class22.method265(this.field491, 796, new class55(741, var3.field1559));
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(LLYHLTGUG;I)Z")
    public final boolean method167(class29 arg0, int arg1) {
        int var3 = arg0.field952;
        if (arg1 <= 0) {
            throw new NullPointerException();
        } else {
            if (this.field448 == 2) {
                if (var3 == 201) {
                    this.field409 = true;
                    this.field561 = 0;
                    this.field334 = true;
                    this.field179 = "";
                    this.field319 = 1;
                    this.field300 = "Enter name of friend to add to list";
                }
                if (var3 == 202) {
                    this.field409 = true;
                    this.field561 = 0;
                    this.field334 = true;
                    this.field179 = "";
                    this.field319 = 2;
                    this.field300 = "Enter name of friend to delete from list";
                }
            }
            if (var3 == 205) {
                this.field522 = 250;
                return true;
            } else {
                if (var3 == 501) {
                    this.field409 = true;
                    this.field561 = 0;
                    this.field334 = true;
                    this.field179 = "";
                    this.field319 = 4;
                    this.field300 = "Enter name of player to add to list";
                }
                if (var3 == 502) {
                    this.field409 = true;
                    this.field561 = 0;
                    this.field334 = true;
                    this.field179 = "";
                    this.field319 = 5;
                    this.field300 = "Enter name of player to delete from list";
                }
                if (var3 >= 300 && var3 <= 313) {
                    int var4 = (var3 - 300) / 2;
                    int var5 = var3 & 1;
                    int var6 = this.field545[var4];
                    if (var6 != -1) {
                        while (true) {
                            if (var5 == 0) {
                                --var6;
                                if (var6 < 0) {
                                    var6 = class36.field1098 - 1;
                                }
                            }
                            if (var5 == 1) {
                                ++var6;
                                if (var6 >= class36.field1098) {
                                    var6 = 0;
                                }
                            }
                            if (!class36.field1099[var6].field1105 && class36.field1099[var6].field1100 == var4 + (this.field515 ? 0 : 7)) {
                                this.field545[var4] = var6;
                                this.field301 = true;
                                break;
                            }
                        }
                    }
                }
                if (var3 >= 314 && var3 <= 323) {
                    int var7 = (var3 - 314) / 2;
                    int var8 = var3 & 1;
                    int var9 = this.field407[var7];
                    if (var8 == 0) {
                        --var9;
                        if (var9 < 0) {
                            var9 = field303[var7].length - 1;
                        }
                    }
                    if (var8 == 1) {
                        ++var9;
                        if (var9 >= field303[var7].length) {
                            var9 = 0;
                        }
                    }
                    this.field407[var7] = var9;
                    this.field301 = true;
                }
                if (var3 == 324 && !this.field515) {
                    this.field515 = true;
                    this.method146(454);
                }
                if (var3 == 325 && this.field515) {
                    this.field515 = false;
                    this.method146(454);
                }
                if (var3 != 326) {
                    if (var3 == 620) {
                        this.field502 = !this.field502;
                    }
                    if (var3 >= 601 && var3 <= 613) {
                        this.method143(false);
                        if (this.field408.length() > 0) {
                            this.field320.method444(false, 190);
                            this.field320.method451(class61.method508(this.field408), true);
                            this.field320.method445(var3 - 601);
                            this.field320.method445(this.field502 ? 1 : 0);
                        }
                    }
                    return false;
                } else {
                    this.field320.method444(false, 19);
                    this.field320.method445(this.field515 ? 0 : 1);
                    for (int var10 = 0; var10 < 7; ++var10) {
                        this.field320.method445(this.field545[var10]);
                    }
                    for (int var11 = 0; var11 < 5; ++var11) {
                        this.field320.method445(this.field407[var11]);
                    }
                    return true;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "L", descriptor = "(I)V")
    public final void method168(int arg0) {
        if (this.field511 == null) {
            this.method142(1);
            super.field12 = null;
            this.field199 = null;
            this.field200 = null;
            this.field201 = null;
            this.field202 = null;
            this.field203 = null;
            if (arg0 != 0) {
                this.field519 = this.field363.method455();
            }
            this.field204 = null;
            this.field205 = null;
            this.field206 = null;
            this.field207 = null;
            this.field511 = new class42(479, this.method11(false), 96, (byte) 33);
            this.field509 = new class42(172, this.method11(false), 156, (byte) 33);
            class53.method430(413);
            this.field315.method555(0, 0, this.field481);
            this.field508 = new class42(190, this.method11(false), 261, (byte) 33);
            this.field510 = new class42(512, this.method11(false), 334, (byte) 33);
            class53.method430(413);
            this.field573 = new class42(496, this.method11(false), 50, (byte) 33);
            this.field574 = new class42(269, this.method11(false), 37, (byte) 33);
            this.field575 = new class42(249, this.method11(false), 45, (byte) 33);
            this.field412 = true;
        }
    }

    @OriginalMember(owner = "client", name = "init", descriptor = "()V")
    public final void init() {
        field193 = Integer.parseInt(this.getParameter("nodeid"));
        field194 = Integer.parseInt(this.getParameter("portoff"));
        String var1 = this.getParameter("lowmem");
        if (var1 != null && var1.equals("1")) {
            method153(5);
        } else {
            method95(1652);
        }
        String var2 = this.getParameter("free");
        if (var2 != null && var2.equals("1")) {
            field195 = false;
        } else {
            field195 = true;
        }
        this.method2(503, 765, (byte) 19);
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LLYHLTGUG;IIIIIII)V")
    public final void method169(class29 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 != 5) {
            this.field320.method445(88);
        }
        if (arg0.field921 == 0 && arg0.field926 != null && !arg0.field976) {
            if (arg3 >= arg7 && arg6 >= arg4 && arg3 <= arg0.field950 + arg7 && arg6 <= arg0.field979 + arg4) {
                int var9 = arg0.field926.length;
                for (int var10 = 0; var10 < var9; ++var10) {
                    int var11 = arg0.field923[var10] + arg7;
                    int var12 = arg0.field968[var10] + arg4 - arg5;
                    class29 var13 = class29.field963[arg0.field926[var10]];
                    int var14 = var13.field930 + var11;
                    int var15 = var13.field935 + var12;
                    if ((var13.field931 >= 0 || var13.field951 != 0) && arg3 >= var14 && arg6 >= var15 && arg3 < var13.field950 + var14 && arg6 < var13.field979 + var15) {
                        if (var13.field931 >= 0) {
                            this.field517 = var13.field931;
                        } else {
                            this.field517 = var13.field938;
                        }
                    }
                    if (var13.field921 == 8 && arg3 >= var14 && arg6 >= var15 && arg3 < var13.field950 + var14 && arg6 < var13.field979 + var15) {
                        this.field291 = var13.field938;
                    }
                    if (var13.field921 == 0) {
                        this.method169(var13, 5, arg2, arg3, var15, var13.field920, arg6, var14);
                        if (var13.field956 > var13.field979) {
                            this.method120(var13.field979, var13.field956, arg3, var15, var13.field950 + var14, arg2, 44345, var13, arg6);
                        }
                    } else {
                        if (var13.field917 == 1 && arg3 >= var14 && arg6 >= var15 && arg3 < var13.field950 + var14 && arg6 < var13.field979 + var15) {
                            boolean var16 = false;
                            if (var13.field952 != 0) {
                                var16 = this.method152(var13, (byte) 44);
                            }
                            if (!var16) {
                                this.field305[this.field131] = var13.field970;
                                this.field251[this.field131] = 951;
                                this.field250[this.field131] = var13.field938;
                                ++this.field131;
                            }
                        }
                        if (var13.field917 == 2 && this.field146 == 0 && arg3 >= var14 && arg6 >= var15 && arg3 < var13.field950 + var14 && arg6 < var13.field979 + var15) {
                            String var17 = var13.field980;
                            if (var17.indexOf(" ") != -1) {
                                var17 = var17.substring(0, var17.indexOf(" "));
                            }
                            this.field305[this.field131] = var17 + " @gre@" + var13.field969;
                            this.field251[this.field131] = 870;
                            this.field250[this.field131] = var13.field938;
                            ++this.field131;
                        }
                        if (var13.field917 == 3 && arg3 >= var14 && arg6 >= var15 && arg3 < var13.field950 + var14 && arg6 < var13.field979 + var15) {
                            this.field305[this.field131] = "Close";
                            if (arg2 == 3) {
                                this.field251[this.field131] = 861;
                            } else {
                                this.field251[this.field131] = 978;
                            }
                            this.field250[this.field131] = var13.field938;
                            ++this.field131;
                        }
                        if (var13.field917 == 4 && arg3 >= var14 && arg6 >= var15 && arg3 < var13.field950 + var14 && arg6 < var13.field979 + var15) {
                            this.field305[this.field131] = var13.field970;
                            this.field251[this.field131] = 734;
                            this.field250[this.field131] = var13.field938;
                            ++this.field131;
                        }
                        if (var13.field917 == 5 && arg3 >= var14 && arg6 >= var15 && arg3 < var13.field950 + var14 && arg6 < var13.field979 + var15) {
                            this.field305[this.field131] = var13.field970;
                            this.field251[this.field131] = 597;
                            this.field250[this.field131] = var13.field938;
                            ++this.field131;
                        }
                        if (var13.field917 == 6 && !this.field503 && arg3 >= var14 && arg6 >= var15 && arg3 < var13.field950 + var14 && arg6 < var13.field979 + var15) {
                            this.field305[this.field131] = var13.field970;
                            this.field251[this.field131] = 217;
                            this.field250[this.field131] = var13.field938;
                            ++this.field131;
                        }
                        if (var13.field921 == 2) {
                            int var18 = 0;
                            for (int var19 = 0; var19 < var13.field979; ++var19) {
                                for (int var20 = 0; var20 < var13.field950; ++var20) {
                                    int var21 = (var13.field971 + 32) * var20 + var14;
                                    int var22 = (var13.field941 + 32) * var19 + var15;
                                    if (var18 < 20) {
                                        var21 += var13.field977[var18];
                                        var22 += var13.field915[var18];
                                    }
                                    if (arg3 >= var21 && arg6 >= var22 && arg3 < var21 + 32 && arg6 < var22 + 32) {
                                        this.field233 = var18;
                                        this.field234 = var13.field938;
                                        if (var13.field967[var18] > 0) {
                                            class31 var23 = class31.method322(var13.field967[var18] - 1);
                                            if (this.field494 == 1 && var13.field922) {
                                                if (this.field496 != var13.field938 || this.field495 != var18) {
                                                    this.field305[this.field131] = "Use " + this.field498 + " with @lre@" + var23.field1012;
                                                    this.field251[this.field131] = 208;
                                                    this.field252[this.field131] = var23.field1014;
                                                    this.field249[this.field131] = var18;
                                                    this.field250[this.field131] = var13.field938;
                                                    ++this.field131;
                                                }
                                            } else if (this.field146 == 1 && var13.field922) {
                                                if ((this.field148 & 16) == 16) {
                                                    this.field305[this.field131] = this.field149 + " @lre@" + var23.field1012;
                                                    this.field251[this.field131] = 775;
                                                    this.field252[this.field131] = var23.field1014;
                                                    this.field249[this.field131] = var18;
                                                    this.field250[this.field131] = var13.field938;
                                                    ++this.field131;
                                                }
                                            } else {
                                                if (var13.field922) {
                                                    for (int var24 = 4; var24 >= 3; --var24) {
                                                        if (var23.field1040 != null && var23.field1040[var24] != null) {
                                                            this.field305[this.field131] = var23.field1040[var24] + " @lre@" + var23.field1012;
                                                            if (var24 == 3) {
                                                                this.field251[this.field131] = 532;
                                                            }
                                                            if (var24 == 4) {
                                                                this.field251[this.field131] = 69;
                                                            }
                                                            this.field252[this.field131] = var23.field1014;
                                                            this.field249[this.field131] = var18;
                                                            this.field250[this.field131] = var13.field938;
                                                            ++this.field131;
                                                        } else if (var24 == 4) {
                                                            this.field305[this.field131] = "Drop @lre@" + var23.field1012;
                                                            this.field251[this.field131] = 69;
                                                            this.field252[this.field131] = var23.field1014;
                                                            this.field249[this.field131] = var18;
                                                            this.field250[this.field131] = var13.field938;
                                                            ++this.field131;
                                                        }
                                                    }
                                                }
                                                if (var13.field940) {
                                                    this.field305[this.field131] = "Use @lre@" + var23.field1012;
                                                    this.field251[this.field131] = 681;
                                                    this.field252[this.field131] = var23.field1014;
                                                    this.field249[this.field131] = var18;
                                                    this.field250[this.field131] = var13.field938;
                                                    ++this.field131;
                                                }
                                                if (var13.field922 && var23.field1040 != null) {
                                                    for (int var25 = 2; var25 >= 0; --var25) {
                                                        if (var23.field1040[var25] != null) {
                                                            this.field305[this.field131] = var23.field1040[var25] + " @lre@" + var23.field1012;
                                                            if (var25 == 0) {
                                                                this.field251[this.field131] = 650;
                                                            }
                                                            if (var25 == 1) {
                                                                this.field251[this.field131] = 118;
                                                            }
                                                            if (var25 == 2) {
                                                                this.field251[this.field131] = 821;
                                                            }
                                                            this.field252[this.field131] = var23.field1014;
                                                            this.field249[this.field131] = var18;
                                                            this.field250[this.field131] = var13.field938;
                                                            ++this.field131;
                                                        }
                                                    }
                                                }
                                                if (var13.field932 != null) {
                                                    for (int var26 = 4; var26 >= 0; --var26) {
                                                        if (var13.field932[var26] != null) {
                                                            this.field305[this.field131] = var13.field932[var26] + " @lre@" + var23.field1012;
                                                            if (var26 == 0) {
                                                                this.field251[this.field131] = 35;
                                                            }
                                                            if (var26 == 1) {
                                                                this.field251[this.field131] = 479;
                                                            }
                                                            if (var26 == 2) {
                                                                this.field251[this.field131] = 684;
                                                            }
                                                            if (var26 == 3) {
                                                                this.field251[this.field131] = 842;
                                                            }
                                                            if (var26 == 4) {
                                                                this.field251[this.field131] = 149;
                                                            }
                                                            this.field252[this.field131] = var23.field1014;
                                                            this.field249[this.field131] = var18;
                                                            this.field250[this.field131] = var13.field938;
                                                            ++this.field131;
                                                        }
                                                    }
                                                }
                                                this.field305[this.field131] = "Examine @lre@" + var23.field1012;
                                                this.field251[this.field131] = 1969;
                                                this.field252[this.field131] = var23.field1014;
                                                this.field249[this.field131] = var18;
                                                this.field250[this.field131] = var13.field938;
                                                ++this.field131;
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

    @OriginalMember(owner = "client", name = "q", descriptor = "(Z)V")
    public final void method170(boolean arg0) {
        class18 var2 = (class18) this.field450.method503();
        if (!arg0) {
            while (var2 != null) {
                if (this.field548 == var2.field736 && !var2.field743) {
                    if (field347 >= var2.field732) {
                        var2.method226((byte) 6, this.field579);
                        if (var2.field743) {
                            var2.method398();
                        } else {
                            this.field383.method353(60, var2.field737, 0, -1, 8, var2.field739, var2.field736, var2.field738, var2, false);
                        }
                    }
                } else {
                    var2.method398();
                }
                var2 = (class18) this.field450.method505(false);
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(I)V")
    public final void method9(int arg0) {
        if (!this.field413 && !this.field546 && !this.field507) {
            ++field340;
            if (arg0 >= 0) {
                this.field580 = null;
            }
            if (!this.field248) {
                this.method56(false, true);
            } else {
                this.method47((byte) -26);
            }
            this.field211 = 0;
        } else {
            this.method105((byte) 81);
        }
    }

    @OriginalMember(owner = "client", name = "m", descriptor = "(B)V")
    public final void method171(byte arg0) {
        if (arg0 != 117) {
            this.field145 = this.field242.method518();
        }
        if (this.field584 == 0) {
            int var2 = super.field25;
            if (this.field146 == 1 && super.field26 >= 516 && super.field27 >= 160 && super.field26 <= 765 && super.field27 <= 205) {
                var2 = 0;
            }
            if (this.field572) {
                if (var2 != 1) {
                    int var3 = super.field19;
                    int var4 = super.field20;
                    if (this.field438 == 0) {
                        var3 -= 4;
                        var4 -= 4;
                    }
                    if (this.field438 == 1) {
                        var3 -= 553;
                        var4 -= 205;
                    }
                    if (this.field438 == 2) {
                        var3 -= 17;
                        var4 -= 357;
                    }
                    if (var3 < this.field439 - 10 || var3 > this.field441 + this.field439 + 10 || var4 < this.field440 - 10 || var4 > this.field442 + this.field440 + 10) {
                        this.field572 = false;
                        if (this.field438 == 1) {
                            this.field490 = true;
                        }
                        if (this.field438 == 2) {
                            this.field409 = true;
                        }
                    }
                }
                if (var2 == 1) {
                    int var5 = this.field439;
                    int var6 = this.field440;
                    int var7 = this.field441;
                    int var8 = super.field26;
                    int var9 = super.field27;
                    if (this.field438 == 0) {
                        var8 -= 4;
                        var9 -= 4;
                    }
                    if (this.field438 == 1) {
                        var8 -= 553;
                        var9 -= 205;
                    }
                    if (this.field438 == 2) {
                        var8 -= 17;
                        var9 -= 357;
                    }
                    int var10 = -1;
                    for (int var11 = 0; var11 < this.field131; ++var11) {
                        int var12 = (this.field131 - 1 - var11) * 15 + var6 + 31;
                        if (var8 > var5 && var8 < var5 + var7 && var9 > var12 - 13 && var9 < var12 + 3) {
                            var10 = var11;
                        }
                    }
                    if (var10 != -1) {
                        this.method62(var10, 3);
                    }
                    this.field572 = false;
                    if (this.field438 == 1) {
                        this.field490 = true;
                    }
                    if (this.field438 == 2) {
                        this.field409 = true;
                        return;
                    }
                }
            } else {
                if (var2 == 1 && this.field131 > 0) {
                    int var13 = this.field251[this.field131 - 1];
                    if (var13 == 35 || var13 == 479 || var13 == 684 || var13 == 842 || var13 == 149 || var13 == 650 || var13 == 118 || var13 == 821 || var13 == 532 || var13 == 69 || var13 == 681 || var13 == 1969) {
                        int var14 = this.field249[this.field131 - 1];
                        int var15 = this.field250[this.field131 - 1];
                        class29 var16 = class29.field963[var15];
                        if (var16.field966 || var16.field933) {
                            this.field435 = false;
                            this.field488 = 0;
                            this.field582 = var15;
                            this.field583 = var14;
                            this.field584 = 2;
                            this.field585 = super.field26;
                            this.field586 = super.field27;
                            if (class29.field963[var15].field928 == this.field299) {
                                this.field584 = 1;
                            }
                            if (class29.field963[var15].field928 == this.field338) {
                                this.field584 = 3;
                            }
                            return;
                        }
                    }
                }
                if (var2 == 1 && (this.field111 == 1 || this.method94(this.field131 - 1, 9525)) && this.field131 > 2) {
                    var2 = 2;
                }
                if (var2 == 1 && this.field131 > 0) {
                    this.method62(this.field131 - 1, 3);
                }
                if (var2 != 2 || this.field131 <= 0) {
                    return;
                }
                this.method74((byte) -83);
            }
        }
    }

    @OriginalMember(owner = "client", name = "M", descriptor = "(I)V")
    public final void method172(int arg0) {
        if (this.field494 == 0 && this.field146 == 0) {
            this.field305[this.field131] = "Walk here";
            this.field251[this.field131] = 904;
            this.field249[this.field131] = super.field19;
            this.field250[this.field131] = super.field20;
            ++this.field131;
        }
        int var2 = -1;
        if (arg0 != 5631) {
            this.field519 = this.field363.method455();
        }
        for (int var3 = 0; var3 < class66.field1647; ++var3) {
            int var4 = class66.field1648[var3];
            int var5 = var4 & 127;
            int var6 = var4 >> 7 & 127;
            int var7 = var4 >> 29 & 3;
            int var8 = var4 >> 14 & 32767;
            if (var2 != var4) {
                var2 = var4;
                if (var7 == 2 && this.field383.method372(this.field548, var5, var6, var4) >= 0) {
                    class4 var9 = class4.method24(var8);
                    if (var9.field41 != null) {
                        var9 = var9.method17(-12201);
                    }
                    if (var9 == null) {
                        continue;
                    }
                    if (this.field494 == 1) {
                        this.field305[this.field131] = "Use " + this.field498 + " with @cya@" + var9.field54;
                        this.field251[this.field131] = 102;
                        this.field252[this.field131] = var4;
                        this.field249[this.field131] = var5;
                        this.field250[this.field131] = var6;
                        ++this.field131;
                    } else if (this.field146 == 1) {
                        if ((this.field148 & 4) == 4) {
                            this.field305[this.field131] = this.field149 + " @cya@" + var9.field54;
                            this.field251[this.field131] = 255;
                            this.field252[this.field131] = var4;
                            this.field249[this.field131] = var5;
                            this.field250[this.field131] = var6;
                            ++this.field131;
                        }
                    } else {
                        if (var9.field76 != null) {
                            for (int var10 = 4; var10 >= 0; --var10) {
                                if (var9.field76[var10] != null) {
                                    this.field305[this.field131] = var9.field76[var10] + " @cya@" + var9.field54;
                                    if (var10 == 0) {
                                        this.field251[this.field131] = 551;
                                    }
                                    if (var10 == 1) {
                                        this.field251[this.field131] = 568;
                                    }
                                    if (var10 == 2) {
                                        this.field251[this.field131] = 698;
                                    }
                                    if (var10 == 3) {
                                        this.field251[this.field131] = 388;
                                    }
                                    if (var10 == 4) {
                                        this.field251[this.field131] = 1500;
                                    }
                                    this.field252[this.field131] = var4;
                                    this.field249[this.field131] = var5;
                                    this.field250[this.field131] = var6;
                                    ++this.field131;
                                }
                            }
                        }
                        this.field305[this.field131] = "Examine @cya@" + var9.field54;
                        this.field251[this.field131] = 1554;
                        this.field252[this.field131] = var9.field62 << 14;
                        this.field249[this.field131] = var5;
                        this.field250[this.field131] = var6;
                        ++this.field131;
                    }
                }
                if (var7 == 1) {
                    class25 var11 = this.field365[var8];
                    if (var11.field871.field854 == 1 && (var11.field1422 & 127) == 64 && (var11.field1423 & 127) == 64) {
                        for (int var12 = 0; var12 < this.field366; ++var12) {
                            class25 var15 = this.field365[this.field367[var12]];
                            if (var15 != null && var11 != var15 && var15.field871.field854 == 1 && var11.field1422 == var15.field1422 && var11.field1423 == var15.field1423) {
                                this.method96(var5, -12242, var15.field871, var6, this.field367[var12]);
                            }
                        }
                        for (int var13 = 0; var13 < this.field471; ++var13) {
                            class56 var14 = this.field470[this.field472[var13]];
                            if (var14 != null && var11.field1422 == var14.field1422 && var11.field1423 == var14.field1423) {
                                this.method156(var6, this.field472[var13], var14, 0, var5);
                            }
                        }
                    }
                    this.method96(var5, -12242, var11.field871, var6, var8);
                }
                if (var7 == 0) {
                    class56 var16 = this.field470[var8];
                    if ((var16.field1422 & 127) == 64 && (var16.field1423 & 127) == 64) {
                        for (int var17 = 0; var17 < this.field366; ++var17) {
                            class25 var20 = this.field365[this.field367[var17]];
                            if (var20 != null && var20.field871.field854 == 1 && var16.field1422 == var20.field1422 && var16.field1423 == var20.field1423) {
                                this.method96(var5, -12242, var20.field871, var6, this.field367[var17]);
                            }
                        }
                        for (int var18 = 0; var18 < this.field471; ++var18) {
                            class56 var19 = this.field470[this.field472[var18]];
                            if (var19 != null && var16 != var19 && var16.field1422 == var19.field1422 && var16.field1423 == var19.field1423) {
                                this.method156(var6, this.field472[var18], var19, 0, var5);
                            }
                        }
                    }
                    this.method156(var6, var8, var16, 0, var5);
                }
                if (var7 == 3) {
                    class58 var21 = this.field580[this.field548][var5][var6];
                    if (var21 != null) {
                        for (class27 var22 = (class27) var21.method504((byte) -97); var22 != null; var22 = (class27) var21.method506(false)) {
                            class31 var23 = class31.method322(var22.field896);
                            if (this.field494 == 1) {
                                this.field305[this.field131] = "Use " + this.field498 + " with @lre@" + var23.field1012;
                                this.field251[this.field131] = 534;
                                this.field252[this.field131] = var22.field896;
                                this.field249[this.field131] = var5;
                                this.field250[this.field131] = var6;
                                ++this.field131;
                            } else if (this.field146 == 1) {
                                if ((this.field148 & 1) == 1) {
                                    this.field305[this.field131] = this.field149 + " @lre@" + var23.field1012;
                                    this.field251[this.field131] = 468;
                                    this.field252[this.field131] = var22.field896;
                                    this.field249[this.field131] = var5;
                                    this.field250[this.field131] = var6;
                                    ++this.field131;
                                }
                            } else {
                                for (int var24 = 4; var24 >= 0; --var24) {
                                    if (var23.field1036 != null && var23.field1036[var24] != null) {
                                        this.field305[this.field131] = var23.field1036[var24] + " @lre@" + var23.field1012;
                                        if (var24 == 0) {
                                            this.field251[this.field131] = 915;
                                        }
                                        if (var24 == 1) {
                                            this.field251[this.field131] = 109;
                                        }
                                        if (var24 == 2) {
                                            this.field251[this.field131] = 14;
                                        }
                                        if (var24 == 3) {
                                            this.field251[this.field131] = 186;
                                        }
                                        if (var24 == 4) {
                                            this.field251[this.field131] = 401;
                                        }
                                        this.field252[this.field131] = var22.field896;
                                        this.field249[this.field131] = var5;
                                        this.field250[this.field131] = var6;
                                        ++this.field131;
                                    } else if (var24 == 2) {
                                        this.field305[this.field131] = "Take @lre@" + var23.field1012;
                                        this.field251[this.field131] = 14;
                                        this.field252[this.field131] = var22.field896;
                                        this.field249[this.field131] = var5;
                                        this.field250[this.field131] = var6;
                                        ++this.field131;
                                    }
                                }
                                this.field305[this.field131] = "Examine @lre@" + var23.field1012;
                                this.field251[this.field131] = 1892;
                                this.field252[this.field131] = var22.field896;
                                this.field249[this.field131] = var5;
                                this.field250[this.field131] = var6;
                                ++this.field131;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZJ)V")
    public final void method173(boolean arg0, long arg1) {
        if (arg1 != 0L) {
            if (this.field447 >= 100 && this.field374 != 1) {
                this.method104("", "Your friendlist is full. Max of 100 for free users, and 200 for members", 0, this.field341);
            } else if (this.field447 >= 200) {
                this.method104("", "Your friendlist is full. Max of 100 for free users, and 200 for members", 0, this.field341);
            } else {
                String var4 = class61.method512(false, class61.method509(this.field533, arg1));
                if (!arg0) {
                    this.field519 = -1;
                }
                for (int var5 = 0; var5 < this.field447; ++var5) {
                    if (this.field313[var5] == arg1) {
                        this.method104("", var4 + " is already on your friend list", 0, this.field341);
                        return;
                    }
                }
                for (int var6 = 0; var6 < this.field253; ++var6) {
                    if (this.field399[var6] == arg1) {
                        this.method104("", "Please remove " + var4 + " from your ignore list first", 0, this.field341);
                        return;
                    }
                }
                if (!var4.equals(field425.field1488)) {
                    this.field581[this.field447] = var4;
                    this.field313[this.field447] = arg1;
                    this.field162[this.field447] = 0;
                    ++this.field447;
                    this.field490 = true;
                    this.field320.method444(false, 27);
                    this.field320.method451(arg1, true);
                }
            }
        }
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; ++var1) {
            field184[var1] = var0 - 1;
            var0 += var0;
        }
        field193 = 10;
        field195 = true;
        field259 = 6;
        field303 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };
        field344 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");
        field381 = true;
        field415 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");
        field460 = 85;
        field462 = new int[99];
        int var2 = 0;
        for (int var3 = 0; var3 < 99; ++var3) {
            int var4 = var3 + 1;
            int var5 = (int) ((double) var4 + 300.0D * Math.pow(2.0D, (double) var4 / 7.0D));
            var2 += var5;
            field462[var3] = var2 / 4;
        }
        field524 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
        field535 = -652;
    }
}
