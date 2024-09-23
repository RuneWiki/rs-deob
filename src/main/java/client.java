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
public class client extends class59 {

    @OriginalMember(owner = "client", name = "K", descriptor = "[LRZNFVLPG;")
    public class44[] field150 = new class44[5];

    @OriginalMember(owner = "client", name = "L", descriptor = "Ljava/lang/String;")
    private String field151 = "";

    @OriginalMember(owner = "client", name = "M", descriptor = "Ljava/lang/String;")
    private String field152 = "";

    @OriginalMember(owner = "client", name = "Y", descriptor = "I")
    private int field164 = 752;

    @OriginalMember(owner = "client", name = "cb", descriptor = "I")
    private int field168 = 7759444;

    @OriginalMember(owner = "client", name = "db", descriptor = "Z")
    private boolean field169 = false;

    @OriginalMember(owner = "client", name = "gb", descriptor = "I")
    private int field172 = 31514;

    @OriginalMember(owner = "client", name = "ib", descriptor = "Ljava/lang/String;")
    private String field174 = "";

    @OriginalMember(owner = "client", name = "jb", descriptor = "Ljava/lang/String;")
    private String field175 = "";

    @OriginalMember(owner = "client", name = "kb", descriptor = "Z")
    private boolean field176 = false;

    @OriginalMember(owner = "client", name = "mb", descriptor = "I")
    private int field178 = 50;

    @OriginalMember(owner = "client", name = "nb", descriptor = "[I")
    private int[] field179 = new int[this.field178];

    @OriginalMember(owner = "client", name = "ob", descriptor = "[I")
    private int[] field180 = new int[this.field178];

    @OriginalMember(owner = "client", name = "pb", descriptor = "[I")
    private int[] field181 = new int[this.field178];

    @OriginalMember(owner = "client", name = "qb", descriptor = "[I")
    private int[] field182 = new int[this.field178];

    @OriginalMember(owner = "client", name = "rb", descriptor = "[I")
    private int[] field183 = new int[this.field178];

    @OriginalMember(owner = "client", name = "sb", descriptor = "[I")
    private int[] field184 = new int[this.field178];

    @OriginalMember(owner = "client", name = "tb", descriptor = "[I")
    private int[] field185 = new int[this.field178];

    @OriginalMember(owner = "client", name = "ub", descriptor = "[Ljava/lang/String;")
    private String[] field186 = new String[this.field178];

    @OriginalMember(owner = "client", name = "vb", descriptor = "I")
    private final int field187 = 100;

    @OriginalMember(owner = "client", name = "wb", descriptor = "[I")
    private int[] field188 = new int[100];

    @OriginalMember(owner = "client", name = "zb", descriptor = "I")
    private int field191 = 586;

    @OriginalMember(owner = "client", name = "Bb", descriptor = "I")
    private int field193 = 351;

    @OriginalMember(owner = "client", name = "Db", descriptor = "Z")
    private boolean field195 = true;

    @OriginalMember(owner = "client", name = "Eb", descriptor = "Z")
    private boolean field196 = false;

    @OriginalMember(owner = "client", name = "Mb", descriptor = "I")
    private int field204 = 439;

    @OriginalMember(owner = "client", name = "Nb", descriptor = "[I")
    private int[] field205 = new int[5];

    @OriginalMember(owner = "client", name = "Ob", descriptor = "[I")
    private int[] field206 = new int[5];

    @OriginalMember(owner = "client", name = "Ub", descriptor = "Z")
    private boolean field212 = false;

    @OriginalMember(owner = "client", name = "Vb", descriptor = "[I")
    private int[] field213 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client", name = "Wb", descriptor = "[I")
    private int[] field214 = new int[50];

    @OriginalMember(owner = "client", name = "Xb", descriptor = "[[[I")
    private int[][][] field215 = new int[4][13][13];

    @OriginalMember(owner = "client", name = "Yb", descriptor = "[I")
    public int[] field216 = new int[2000];

    @OriginalMember(owner = "client", name = "dc", descriptor = "I")
    private int field221 = -1;

    @OriginalMember(owner = "client", name = "fc", descriptor = "LIMUIZRAF;")
    private class24 field223 = class24.method226(1, 0);

    @OriginalMember(owner = "client", name = "gc", descriptor = "I")
    private int field224 = 8;

    @OriginalMember(owner = "client", name = "hc", descriptor = "[J")
    private long[] field225 = new long[100];

    @OriginalMember(owner = "client", name = "jc", descriptor = "[LYHASUFYG;")
    private class68[] field227 = new class68[20];

    @OriginalMember(owner = "client", name = "kc", descriptor = "Z")
    private boolean field228 = false;

    @OriginalMember(owner = "client", name = "lc", descriptor = "[I")
    private int[] field229 = new int[50];

    @OriginalMember(owner = "client", name = "tc", descriptor = "[I")
    private int[] field237 = new int[1000];

    @OriginalMember(owner = "client", name = "uc", descriptor = "[I")
    private int[] field238 = new int[1000];

    @OriginalMember(owner = "client", name = "wc", descriptor = "I")
    private int field240 = 32747;

    @OriginalMember(owner = "client", name = "yc", descriptor = "[I")
    private int[] field242 = new int[class30.field922];

    @OriginalMember(owner = "client", name = "zc", descriptor = "Ljava/util/zip/CRC32;")
    private CRC32 field243 = new CRC32();

    @OriginalMember(owner = "client", name = "Ac", descriptor = "[LAGTHLVTI;")
    private class3[] field244 = new class3[13];

    @OriginalMember(owner = "client", name = "Cc", descriptor = "LIMUIZRAF;")
    private class24 field246 = class24.method226(1, 0);

    @OriginalMember(owner = "client", name = "Ec", descriptor = "Ljava/lang/String;")
    private String field248 = "";

    @OriginalMember(owner = "client", name = "Fc", descriptor = "[LYHASUFYG;")
    private class68[] field249 = new class68[20];

    @OriginalMember(owner = "client", name = "Hc", descriptor = "[B")
    private byte[] field251 = new byte[16384];

    @OriginalMember(owner = "client", name = "Kc", descriptor = "Z")
    public boolean field254 = false;

    @OriginalMember(owner = "client", name = "Lc", descriptor = "I")
    private int field255 = 774;

    @OriginalMember(owner = "client", name = "Rc", descriptor = "[I")
    private int[] field261 = new int[class30.field922];

    @OriginalMember(owner = "client", name = "Sc", descriptor = "I")
    private int field262 = -1;

    @OriginalMember(owner = "client", name = "Tc", descriptor = "Ljava/lang/String;")
    private String field263 = "";

    @OriginalMember(owner = "client", name = "Wc", descriptor = "B")
    private byte field266 = -121;

    @OriginalMember(owner = "client", name = "cd", descriptor = "Z")
    private volatile boolean field272 = false;

    @OriginalMember(owner = "client", name = "dd", descriptor = "Z")
    private boolean field273 = false;

    @OriginalMember(owner = "client", name = "kd", descriptor = "I")
    private int field280 = 26615;

    @OriginalMember(owner = "client", name = "ld", descriptor = "I")
    private int field281 = -797;

    @OriginalMember(owner = "client", name = "md", descriptor = "LIMUIZRAF;")
    private class24 field282 = new class24(0, new byte[5000]);

    @OriginalMember(owner = "client", name = "nd", descriptor = "[LOTOMPFCI;")
    private class37[] field283 = new class37[16384];

    @OriginalMember(owner = "client", name = "pd", descriptor = "[I")
    public int[] field285 = new int[16384];

    @OriginalMember(owner = "client", name = "qd", descriptor = "[Ljava/lang/String;")
    private String[] field286 = new String[500];

    @OriginalMember(owner = "client", name = "sd", descriptor = "I")
    private int field288 = 1;

    @OriginalMember(owner = "client", name = "td", descriptor = "Ljava/lang/String;")
    private String field289 = "";

    @OriginalMember(owner = "client", name = "ud", descriptor = "[[[LPILILDKN;")
    private class38[][][] field290 = new class38[4][104][104];

    @OriginalMember(owner = "client", name = "zd", descriptor = "Z")
    private boolean field295 = true;

    @OriginalMember(owner = "client", name = "Cd", descriptor = "Z")
    private boolean field298 = false;

    @OriginalMember(owner = "client", name = "Gd", descriptor = "I")
    private int field302 = 2;

    @OriginalMember(owner = "client", name = "Id", descriptor = "Z")
    private boolean field304 = true;

    @OriginalMember(owner = "client", name = "Sd", descriptor = "[I")
    private int[] field314 = new int[5];

    @OriginalMember(owner = "client", name = "Yd", descriptor = "I")
    private int field320 = 2;

    @OriginalMember(owner = "client", name = "ae", descriptor = "[I")
    private int[] field322 = new int[5];

    @OriginalMember(owner = "client", name = "fe", descriptor = "Z")
    private volatile boolean field327 = false;

    @OriginalMember(owner = "client", name = "he", descriptor = "LSJPORZIF;")
    private class48 field329 = new class48();

    @OriginalMember(owner = "client", name = "me", descriptor = "I")
    private int field334 = -820;

    @OriginalMember(owner = "client", name = "ne", descriptor = "I")
    private int field335 = 2301979;

    @OriginalMember(owner = "client", name = "pe", descriptor = "[I")
    private int[] field337 = new int[33];

    @OriginalMember(owner = "client", name = "qe", descriptor = "[I")
    private int[] field338 = new int[100];

    @OriginalMember(owner = "client", name = "re", descriptor = "[Ljava/lang/String;")
    private String[] field339 = new String[100];

    @OriginalMember(owner = "client", name = "se", descriptor = "[Ljava/lang/String;")
    private String[] field340 = new String[100];

    @OriginalMember(owner = "client", name = "te", descriptor = "[I")
    private int[] field341 = new int[5];

    @OriginalMember(owner = "client", name = "ve", descriptor = "[J")
    private long[] field343 = new long[200];

    @OriginalMember(owner = "client", name = "we", descriptor = "I")
    private int field344 = -1;

    @OriginalMember(owner = "client", name = "ze", descriptor = "Z")
    private boolean field347 = true;

    @OriginalMember(owner = "client", name = "Ae", descriptor = "Ljava/lang/String;")
    private String field348 = "";

    @OriginalMember(owner = "client", name = "De", descriptor = "Z")
    private boolean field351 = true;

    @OriginalMember(owner = "client", name = "Ge", descriptor = "Z")
    private boolean field354 = false;

    @OriginalMember(owner = "client", name = "He", descriptor = "I")
    private int field355 = 4;

    @OriginalMember(owner = "client", name = "Ie", descriptor = "B")
    private byte field356 = 4;

    @OriginalMember(owner = "client", name = "Je", descriptor = "[I")
    private int[] field357 = new int[9];

    @OriginalMember(owner = "client", name = "Ne", descriptor = "[I")
    private int[] field361 = new int[class30.field922];

    @OriginalMember(owner = "client", name = "Qe", descriptor = "I")
    private int field364 = -958;

    @OriginalMember(owner = "client", name = "Re", descriptor = "Z")
    private volatile boolean field365 = false;

    @OriginalMember(owner = "client", name = "We", descriptor = "I")
    private int field370 = 1;

    @OriginalMember(owner = "client", name = "Xe", descriptor = "Z")
    private boolean field371 = false;

    @OriginalMember(owner = "client", name = "Ze", descriptor = "[I")
    private final int[] field373 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client", name = "af", descriptor = "I")
    private int field374 = 1;

    @OriginalMember(owner = "client", name = "cf", descriptor = "I")
    private int field376 = 627;

    @OriginalMember(owner = "client", name = "df", descriptor = "I")
    private int field377 = -1;

    @OriginalMember(owner = "client", name = "gf", descriptor = "I")
    private int field380 = -820;

    @OriginalMember(owner = "client", name = "hf", descriptor = "I")
    private int field381 = -999;

    @OriginalMember(owner = "client", name = "jf", descriptor = "I")
    private int field382 = -13016;

    @OriginalMember(owner = "client", name = "pf", descriptor = "[I")
    private int[] field388 = new int[4000];

    @OriginalMember(owner = "client", name = "qf", descriptor = "[I")
    private int[] field389 = new int[4000];

    @OriginalMember(owner = "client", name = "rf", descriptor = "[LAGTHLVTI;")
    private class3[] field390 = new class3[2];

    @OriginalMember(owner = "client", name = "sf", descriptor = "I")
    private int field391 = -1;

    @OriginalMember(owner = "client", name = "tf", descriptor = "I")
    private int field392 = -1;

    @OriginalMember(owner = "client", name = "wf", descriptor = "I")
    private int field395 = -1;

    @OriginalMember(owner = "client", name = "zf", descriptor = "[Z")
    private boolean[] field398 = new boolean[5];

    @OriginalMember(owner = "client", name = "Af", descriptor = "[I")
    private int[] field399 = new int[50];

    @OriginalMember(owner = "client", name = "Bf", descriptor = "[[I")
    private int[][] field400 = new int[104][104];

    @OriginalMember(owner = "client", name = "Cf", descriptor = "[I")
    private int[] field401 = new int[256];

    @OriginalMember(owner = "client", name = "Df", descriptor = "B")
    private byte field402 = 2;

    @OriginalMember(owner = "client", name = "Ff", descriptor = "I")
    private int field404 = -1;

    @OriginalMember(owner = "client", name = "Hf", descriptor = "Z")
    private boolean field406 = false;

    @OriginalMember(owner = "client", name = "Nf", descriptor = "I")
    private int field412 = 128;

    @OriginalMember(owner = "client", name = "Rf", descriptor = "I")
    private int field416 = 317;

    @OriginalMember(owner = "client", name = "Sf", descriptor = "I")
    private int field417 = -458;

    @OriginalMember(owner = "client", name = "Tf", descriptor = "[LYHASUFYG;")
    private class68[] field418 = new class68[1000];

    @OriginalMember(owner = "client", name = "Uf", descriptor = "[Ljava/lang/String;")
    private String[] field419 = new String[200];

    @OriginalMember(owner = "client", name = "Vf", descriptor = "B")
    private byte field420 = 2;

    @OriginalMember(owner = "client", name = "Xf", descriptor = "I")
    private int field422 = -1;

    @OriginalMember(owner = "client", name = "Zf", descriptor = "Z")
    private boolean field424 = false;

    @OriginalMember(owner = "client", name = "fg", descriptor = "LIMUIZRAF;")
    private class24 field430 = class24.method226(1, 0);

    @OriginalMember(owner = "client", name = "kg", descriptor = "LPILILDKN;")
    private class38 field435 = new class38(false);

    @OriginalMember(owner = "client", name = "ng", descriptor = "Z")
    private boolean field438 = false;

    @OriginalMember(owner = "client", name = "ug", descriptor = "[I")
    private int[] field445 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client", name = "wg", descriptor = "I")
    private int field447 = 78;

    @OriginalMember(owner = "client", name = "Fg", descriptor = "[LAGTHLVTI;")
    private class3[] field456 = new class3[100];

    @OriginalMember(owner = "client", name = "Gg", descriptor = "I")
    private int field457 = -948;

    @OriginalMember(owner = "client", name = "Hg", descriptor = "[I")
    private int[] field458 = new int[151];

    @OriginalMember(owner = "client", name = "Lg", descriptor = "I")
    private int field462 = -1;

    @OriginalMember(owner = "client", name = "Qg", descriptor = "Ljava/lang/String;")
    private String field467 = "";

    @OriginalMember(owner = "client", name = "Xg", descriptor = "Z")
    private boolean field474 = false;

    @OriginalMember(owner = "client", name = "ch", descriptor = "[LYHASUFYG;")
    private class68[] field479 = new class68[100];

    @OriginalMember(owner = "client", name = "eh", descriptor = "[I")
    public int[] field481 = new int[1000];

    @OriginalMember(owner = "client", name = "kh", descriptor = "I")
    private int field487 = -23175;

    @OriginalMember(owner = "client", name = "nh", descriptor = "I")
    private int field490 = -1;

    @OriginalMember(owner = "client", name = "oh", descriptor = "LPILILDKN;")
    private class38 field491 = new class38(false);

    @OriginalMember(owner = "client", name = "qh", descriptor = "[[I")
    private int[][] field493 = new int[104][104];

    @OriginalMember(owner = "client", name = "sh", descriptor = "I")
    private int field495 = 5063219;

    @OriginalMember(owner = "client", name = "zh", descriptor = "I")
    private int field502 = 2;

    @OriginalMember(owner = "client", name = "Ah", descriptor = "B")
    private byte field503 = -105;

    @OriginalMember(owner = "client", name = "Bh", descriptor = "Z")
    private boolean field504 = false;

    @OriginalMember(owner = "client", name = "Ch", descriptor = "[Ljava/lang/String;")
    private String[] field505 = new String[5];

    @OriginalMember(owner = "client", name = "Dh", descriptor = "[Z")
    private boolean[] field506 = new boolean[5];

    @OriginalMember(owner = "client", name = "Eh", descriptor = "I")
    private int field507 = 2048;

    @OriginalMember(owner = "client", name = "Fh", descriptor = "I")
    private int field508 = 2047;

    @OriginalMember(owner = "client", name = "Gh", descriptor = "[LSJUCHLXH;")
    private class49[] field509 = new class49[this.field507];

    @OriginalMember(owner = "client", name = "Ih", descriptor = "[I")
    public int[] field511 = new int[this.field507];

    @OriginalMember(owner = "client", name = "Kh", descriptor = "[I")
    private int[] field513 = new int[this.field507];

    @OriginalMember(owner = "client", name = "Lh", descriptor = "[LIMUIZRAF;")
    private class24[] field514 = new class24[this.field507];

    @OriginalMember(owner = "client", name = "Nh", descriptor = "Z")
    private boolean field516 = false;

    @OriginalMember(owner = "client", name = "Th", descriptor = "[I")
    private int[] field522 = new int[200];

    @OriginalMember(owner = "client", name = "Uh", descriptor = "Z")
    public boolean field523 = true;

    @OriginalMember(owner = "client", name = "Yh", descriptor = "[I")
    private int[] field527 = new int[151];

    @OriginalMember(owner = "client", name = "ci", descriptor = "[I")
    private int[] field531 = new int[7];

    @OriginalMember(owner = "client", name = "fi", descriptor = "Z")
    private boolean field534 = false;

    @OriginalMember(owner = "client", name = "ji", descriptor = "B")
    private byte field538 = 4;

    @OriginalMember(owner = "client", name = "ni", descriptor = "Z")
    private boolean field542 = false;

    @OriginalMember(owner = "client", name = "xi", descriptor = "I")
    private int field552 = 3353893;

    @OriginalMember(owner = "client", name = "yi", descriptor = "[LWWMUUFBO;")
    private class63[] field553 = new class63[4];

    @OriginalMember(owner = "client", name = "Bi", descriptor = "I")
    private int field556 = -1;

    @OriginalMember(owner = "client", name = "Ci", descriptor = "I")
    private int field557 = -1;

    @OriginalMember(owner = "client", name = "Di", descriptor = "[LYHASUFYG;")
    private class68[] field558 = new class68[8];

    @OriginalMember(owner = "client", name = "Ei", descriptor = "I")
    private int field559 = 317;

    @OriginalMember(owner = "client", name = "Fi", descriptor = "[I")
    private int[] field560 = new int[500];

    @OriginalMember(owner = "client", name = "Gi", descriptor = "[I")
    private int[] field561 = new int[500];

    @OriginalMember(owner = "client", name = "Hi", descriptor = "[I")
    private int[] field562 = new int[500];

    @OriginalMember(owner = "client", name = "Ii", descriptor = "[I")
    private int[] field563 = new int[500];

    @OriginalMember(owner = "client", name = "Ji", descriptor = "B")
    private byte field564 = 96;

    @OriginalMember(owner = "client", name = "Li", descriptor = "Z")
    private boolean field566 = true;

    @OriginalMember(owner = "client", name = "Pi", descriptor = "[[I")
    private int[][] field570 = new int[104][104];

    @OriginalMember(owner = "client", name = "Qi", descriptor = "Z")
    private boolean field571 = true;

    @OriginalMember(owner = "client", name = "Ri", descriptor = "Z")
    private boolean field572 = true;

    @OriginalMember(owner = "client", name = "cj", descriptor = "I")
    private int field583 = 12314;

    @OriginalMember(owner = "client", name = "gj", descriptor = "Z")
    private boolean field587 = false;

    @OriginalMember(owner = "client", name = "hj", descriptor = "Z")
    private boolean field588 = false;

    @OriginalMember(owner = "client", name = "ij", descriptor = "Z")
    private boolean field589 = false;

    @OriginalMember(owner = "client", name = "jj", descriptor = "[I")
    private int[] field590 = new int[2000];

    @OriginalMember(owner = "client", name = "kj", descriptor = "I")
    private int field591 = 3;

    @OriginalMember(owner = "client", name = "tj", descriptor = "I")
    private int field600 = 1;

    @OriginalMember(owner = "client", name = "uj", descriptor = "I")
    private int field601 = 692;

    @OriginalMember(owner = "client", name = "vj", descriptor = "Z")
    private boolean field602 = false;

    @OriginalMember(owner = "client", name = "wj", descriptor = "I")
    private int field603 = -1;

    @OriginalMember(owner = "client", name = "yj", descriptor = "Z")
    private boolean field605 = false;

    @OriginalMember(owner = "client", name = "Ej", descriptor = "Z")
    private boolean field611 = false;

    @OriginalMember(owner = "client", name = "Fj", descriptor = "Z")
    private boolean field612 = true;

    @OriginalMember(owner = "client", name = "Gj", descriptor = "Z")
    private boolean field613 = false;

    @OriginalMember(owner = "client", name = "Lj", descriptor = "I")
    private int field618 = -948;

    @OriginalMember(owner = "client", name = "Mj", descriptor = "LPILILDKN;")
    private class38 field619 = new class38(false);

    @OriginalMember(owner = "client", name = "Sj", descriptor = "[I")
    private int[] field625 = new int[33];

    @OriginalMember(owner = "client", name = "Kb", descriptor = "[[I")
    public static final int[][] field202 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client", name = "Bc", descriptor = "I")
    private static int field245 = 38686;

    @OriginalMember(owner = "client", name = "jd", descriptor = "Ljava/math/BigInteger;")
    private static BigInteger field279 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client", name = "Dd", descriptor = "[I")
    public static int[] field299 = new int[32];

    @OriginalMember(owner = "client", name = "Td", descriptor = "I")
    private static int field315;

    @OriginalMember(owner = "client", name = "Vd", descriptor = "Z")
    private static boolean field317;

    @OriginalMember(owner = "client", name = "Ye", descriptor = "Z")
    private static boolean field372;

    @OriginalMember(owner = "client", name = "ag", descriptor = "Ljava/lang/String;")
    private static String field425;

    @OriginalMember(owner = "client", name = "Yg", descriptor = "[I")
    public static final int[] field475;

    @OriginalMember(owner = "client", name = "mh", descriptor = "[I")
    private static int[] field489;

    @OriginalMember(owner = "client", name = "ei", descriptor = "Ljava/math/BigInteger;")
    private static BigInteger field533;

    @OriginalMember(owner = "client", name = "J", descriptor = "I")
    private int field149;

    @OriginalMember(owner = "client", name = "N", descriptor = "I")
    private int field153;

    @OriginalMember(owner = "client", name = "O", descriptor = "I")
    private int field154;

    @OriginalMember(owner = "client", name = "P", descriptor = "I")
    private int field155;

    @OriginalMember(owner = "client", name = "Q", descriptor = "I")
    private int field156;

    @OriginalMember(owner = "client", name = "R", descriptor = "I")
    private int field157;

    @OriginalMember(owner = "client", name = "S", descriptor = "I")
    private int field158;

    @OriginalMember(owner = "client", name = "T", descriptor = "I")
    private static int field159;

    @OriginalMember(owner = "client", name = "U", descriptor = "I")
    private int field160;

    @OriginalMember(owner = "client", name = "W", descriptor = "I")
    private static int field162;

    @OriginalMember(owner = "client", name = "X", descriptor = "I")
    private static int field163;

    @OriginalMember(owner = "client", name = "fb", descriptor = "I")
    private static int field171;

    @OriginalMember(owner = "client", name = "lb", descriptor = "I")
    private int field177;

    @OriginalMember(owner = "client", name = "yb", descriptor = "I")
    private static int field190;

    @OriginalMember(owner = "client", name = "Ab", descriptor = "I")
    private static int field192;

    @OriginalMember(owner = "client", name = "Cb", descriptor = "I")
    private int field194;

    @OriginalMember(owner = "client", name = "Lb", descriptor = "I")
    private int field203;

    @OriginalMember(owner = "client", name = "Pb", descriptor = "I")
    private int field207;

    @OriginalMember(owner = "client", name = "Qb", descriptor = "I")
    private int field208;

    @OriginalMember(owner = "client", name = "Rb", descriptor = "I")
    private int field209;

    @OriginalMember(owner = "client", name = "Sb", descriptor = "I")
    private int field210;

    @OriginalMember(owner = "client", name = "Tb", descriptor = "I")
    private int field211;

    @OriginalMember(owner = "client", name = "Zb", descriptor = "I")
    private int field217;

    @OriginalMember(owner = "client", name = "ac", descriptor = "I")
    private int field218;

    @OriginalMember(owner = "client", name = "bc", descriptor = "I")
    private int field219;

    @OriginalMember(owner = "client", name = "ec", descriptor = "I")
    private int field222;

    @OriginalMember(owner = "client", name = "ic", descriptor = "I")
    private int field226;

    @OriginalMember(owner = "client", name = "mc", descriptor = "I")
    private int field230;

    @OriginalMember(owner = "client", name = "nc", descriptor = "I")
    private int field231;

    @OriginalMember(owner = "client", name = "oc", descriptor = "I")
    private int field232;

    @OriginalMember(owner = "client", name = "pc", descriptor = "I")
    private int field233;

    @OriginalMember(owner = "client", name = "qc", descriptor = "I")
    private int field234;

    @OriginalMember(owner = "client", name = "rc", descriptor = "I")
    private int field235;

    @OriginalMember(owner = "client", name = "sc", descriptor = "I")
    private int field236;

    @OriginalMember(owner = "client", name = "vc", descriptor = "I")
    private int field239;

    @OriginalMember(owner = "client", name = "Dc", descriptor = "I")
    private int field247;

    @OriginalMember(owner = "client", name = "Gc", descriptor = "I")
    private int field250;

    @OriginalMember(owner = "client", name = "Ic", descriptor = "I")
    private static int field252;

    @OriginalMember(owner = "client", name = "Jc", descriptor = "I")
    private int field253;

    @OriginalMember(owner = "client", name = "Nc", descriptor = "I")
    private int field257;

    @OriginalMember(owner = "client", name = "Oc", descriptor = "I")
    private int field258;

    @OriginalMember(owner = "client", name = "Vc", descriptor = "I")
    private int field265;

    @OriginalMember(owner = "client", name = "Xc", descriptor = "I")
    private static int field267;

    @OriginalMember(owner = "client", name = "Yc", descriptor = "I")
    private int field268;

    @OriginalMember(owner = "client", name = "Zc", descriptor = "I")
    private int field269;

    @OriginalMember(owner = "client", name = "ad", descriptor = "I")
    private int field270;

    @OriginalMember(owner = "client", name = "bd", descriptor = "I")
    private int field271;

    @OriginalMember(owner = "client", name = "ed", descriptor = "I")
    private int field274;

    @OriginalMember(owner = "client", name = "fd", descriptor = "I")
    private int field275;

    @OriginalMember(owner = "client", name = "gd", descriptor = "I")
    private int field276;

    @OriginalMember(owner = "client", name = "hd", descriptor = "I")
    private int field277;

    @OriginalMember(owner = "client", name = "id", descriptor = "I")
    private int field278;

    @OriginalMember(owner = "client", name = "od", descriptor = "I")
    private int field284;

    @OriginalMember(owner = "client", name = "rd", descriptor = "I")
    private int field287;

    @OriginalMember(owner = "client", name = "xd", descriptor = "I")
    private static int field293;

    @OriginalMember(owner = "client", name = "yd", descriptor = "I")
    private int field294;

    @OriginalMember(owner = "client", name = "Bd", descriptor = "I")
    private int field297;

    @OriginalMember(owner = "client", name = "Ed", descriptor = "I")
    private int field300;

    @OriginalMember(owner = "client", name = "Fd", descriptor = "I")
    private int field301;

    @OriginalMember(owner = "client", name = "Hd", descriptor = "I")
    private int field303;

    @OriginalMember(owner = "client", name = "Ud", descriptor = "I")
    public static int field316;

    @OriginalMember(owner = "client", name = "Xd", descriptor = "I")
    private int field319;

    @OriginalMember(owner = "client", name = "Zd", descriptor = "I")
    private static int field321;

    @OriginalMember(owner = "client", name = "be", descriptor = "I")
    private int field323;

    @OriginalMember(owner = "client", name = "ce", descriptor = "I")
    private static int field324;

    @OriginalMember(owner = "client", name = "ie", descriptor = "I")
    private int field330;

    @OriginalMember(owner = "client", name = "je", descriptor = "I")
    private int field331;

    @OriginalMember(owner = "client", name = "ke", descriptor = "I")
    private int field332;

    @OriginalMember(owner = "client", name = "le", descriptor = "I")
    private int field333;

    @OriginalMember(owner = "client", name = "oe", descriptor = "I")
    private int field336;

    @OriginalMember(owner = "client", name = "ue", descriptor = "I")
    private int field342;

    @OriginalMember(owner = "client", name = "xe", descriptor = "I")
    private int field345;

    @OriginalMember(owner = "client", name = "ye", descriptor = "I")
    private int field346;

    @OriginalMember(owner = "client", name = "Be", descriptor = "I")
    private int field349;

    @OriginalMember(owner = "client", name = "Ce", descriptor = "I")
    private int field350;

    @OriginalMember(owner = "client", name = "Fe", descriptor = "I")
    public int field353;

    @OriginalMember(owner = "client", name = "Ke", descriptor = "I")
    private int field358;

    @OriginalMember(owner = "client", name = "Le", descriptor = "I")
    private int field359;

    @OriginalMember(owner = "client", name = "Me", descriptor = "I")
    private int field360;

    @OriginalMember(owner = "client", name = "Oe", descriptor = "I")
    private static int field362;

    @OriginalMember(owner = "client", name = "Pe", descriptor = "I")
    private int field363;

    @OriginalMember(owner = "client", name = "Se", descriptor = "I")
    private int field366;

    @OriginalMember(owner = "client", name = "Ue", descriptor = "I")
    private int field368;

    @OriginalMember(owner = "client", name = "Ve", descriptor = "I")
    private int field369;

    @OriginalMember(owner = "client", name = "bf", descriptor = "I")
    private int field375;

    @OriginalMember(owner = "client", name = "ef", descriptor = "I")
    private int field378;

    @OriginalMember(owner = "client", name = "ff", descriptor = "I")
    private int field379;

    @OriginalMember(owner = "client", name = "kf", descriptor = "I")
    private int field383;

    @OriginalMember(owner = "client", name = "uf", descriptor = "I")
    public int field393;

    @OriginalMember(owner = "client", name = "vf", descriptor = "I")
    public int field394;

    @OriginalMember(owner = "client", name = "yf", descriptor = "I")
    private static int field397;

    @OriginalMember(owner = "client", name = "Ef", descriptor = "I")
    private int field403;

    @OriginalMember(owner = "client", name = "Gf", descriptor = "I")
    private static int field405;

    @OriginalMember(owner = "client", name = "Jf", descriptor = "I")
    private int field408;

    @OriginalMember(owner = "client", name = "Mf", descriptor = "I")
    private static int field411;

    @OriginalMember(owner = "client", name = "Of", descriptor = "I")
    private int field413;

    @OriginalMember(owner = "client", name = "Pf", descriptor = "I")
    private int field414;

    @OriginalMember(owner = "client", name = "Qf", descriptor = "I")
    private int field415;

    @OriginalMember(owner = "client", name = "Wf", descriptor = "I")
    private int field421;

    @OriginalMember(owner = "client", name = "jg", descriptor = "I")
    private static int field434;

    @OriginalMember(owner = "client", name = "tg", descriptor = "I")
    private int field444;

    @OriginalMember(owner = "client", name = "vg", descriptor = "I")
    public static int field446;

    @OriginalMember(owner = "client", name = "xg", descriptor = "I")
    private int field448;

    @OriginalMember(owner = "client", name = "yg", descriptor = "I")
    private int field449;

    @OriginalMember(owner = "client", name = "zg", descriptor = "I")
    private int field450;

    @OriginalMember(owner = "client", name = "Ag", descriptor = "I")
    private int field451;

    @OriginalMember(owner = "client", name = "Bg", descriptor = "I")
    private int field452;

    @OriginalMember(owner = "client", name = "Cg", descriptor = "I")
    private int field453;

    @OriginalMember(owner = "client", name = "Dg", descriptor = "I")
    private int field454;

    @OriginalMember(owner = "client", name = "Ig", descriptor = "I")
    private static int field459;

    @OriginalMember(owner = "client", name = "Jg", descriptor = "I")
    private int field460;

    @OriginalMember(owner = "client", name = "Kg", descriptor = "I")
    private int field461;

    @OriginalMember(owner = "client", name = "Pg", descriptor = "I")
    private int field466;

    @OriginalMember(owner = "client", name = "Rg", descriptor = "I")
    private int field468;

    @OriginalMember(owner = "client", name = "Sg", descriptor = "I")
    private int field469;

    @OriginalMember(owner = "client", name = "Tg", descriptor = "I")
    private int field470;

    @OriginalMember(owner = "client", name = "Ug", descriptor = "I")
    private int field471;

    @OriginalMember(owner = "client", name = "Vg", descriptor = "I")
    private int field472;

    @OriginalMember(owner = "client", name = "Wg", descriptor = "I")
    private int field473;

    @OriginalMember(owner = "client", name = "Zg", descriptor = "I")
    private int field476;

    @OriginalMember(owner = "client", name = "ah", descriptor = "I")
    private int field477;

    @OriginalMember(owner = "client", name = "dh", descriptor = "I")
    private int field480;

    @OriginalMember(owner = "client", name = "fh", descriptor = "I")
    private int field482;

    @OriginalMember(owner = "client", name = "gh", descriptor = "I")
    private int field483;

    @OriginalMember(owner = "client", name = "hh", descriptor = "I")
    private int field484;

    @OriginalMember(owner = "client", name = "ih", descriptor = "I")
    private int field485;

    @OriginalMember(owner = "client", name = "lh", descriptor = "I")
    private int field488;

    @OriginalMember(owner = "client", name = "ph", descriptor = "I")
    private int field492;

    @OriginalMember(owner = "client", name = "rh", descriptor = "I")
    private static int field494;

    @OriginalMember(owner = "client", name = "th", descriptor = "I")
    private int field496;

    @OriginalMember(owner = "client", name = "uh", descriptor = "I")
    private int field497;

    @OriginalMember(owner = "client", name = "vh", descriptor = "I")
    private int field498;

    @OriginalMember(owner = "client", name = "wh", descriptor = "I")
    private int field499;

    @OriginalMember(owner = "client", name = "xh", descriptor = "I")
    private int field500;

    @OriginalMember(owner = "client", name = "yh", descriptor = "I")
    private int field501;

    @OriginalMember(owner = "client", name = "Hh", descriptor = "I")
    private int field510;

    @OriginalMember(owner = "client", name = "Jh", descriptor = "I")
    private int field512;

    @OriginalMember(owner = "client", name = "Mh", descriptor = "I")
    private int field515;

    @OriginalMember(owner = "client", name = "ai", descriptor = "I")
    private int field529;

    @OriginalMember(owner = "client", name = "di", descriptor = "I")
    private int field532;

    @OriginalMember(owner = "client", name = "gi", descriptor = "I")
    private int field535;

    @OriginalMember(owner = "client", name = "Ai", descriptor = "I")
    private int field555;

    @OriginalMember(owner = "client", name = "Ki", descriptor = "I")
    private int field565;

    @OriginalMember(owner = "client", name = "Mi", descriptor = "I")
    private int field567;

    @OriginalMember(owner = "client", name = "Ni", descriptor = "I")
    private int field568;

    @OriginalMember(owner = "client", name = "Si", descriptor = "I")
    private int field573;

    @OriginalMember(owner = "client", name = "Ti", descriptor = "I")
    private int field574;

    @OriginalMember(owner = "client", name = "Ui", descriptor = "I")
    private int field575;

    @OriginalMember(owner = "client", name = "Vi", descriptor = "I")
    private int field576;

    @OriginalMember(owner = "client", name = "Wi", descriptor = "I")
    private int field577;

    @OriginalMember(owner = "client", name = "Xi", descriptor = "I")
    private int field578;

    @OriginalMember(owner = "client", name = "Yi", descriptor = "I")
    private int field579;

    @OriginalMember(owner = "client", name = "Zi", descriptor = "I")
    private int field580;

    @OriginalMember(owner = "client", name = "aj", descriptor = "I")
    private int field581;

    @OriginalMember(owner = "client", name = "bj", descriptor = "I")
    private int field582;

    @OriginalMember(owner = "client", name = "fj", descriptor = "I")
    private int field586;

    @OriginalMember(owner = "client", name = "lj", descriptor = "I")
    private int field592;

    @OriginalMember(owner = "client", name = "mj", descriptor = "I")
    private static int field593;

    @OriginalMember(owner = "client", name = "sj", descriptor = "I")
    private int field599;

    @OriginalMember(owner = "client", name = "zj", descriptor = "I")
    private int field606;

    @OriginalMember(owner = "client", name = "Aj", descriptor = "I")
    private int field607;

    @OriginalMember(owner = "client", name = "Bj", descriptor = "I")
    private static int field608;

    @OriginalMember(owner = "client", name = "Cj", descriptor = "I")
    public static int field609;

    @OriginalMember(owner = "client", name = "Dj", descriptor = "I")
    private int field610;

    @OriginalMember(owner = "client", name = "Nj", descriptor = "I")
    private int field620;

    @OriginalMember(owner = "client", name = "Oj", descriptor = "I")
    private int field621;

    @OriginalMember(owner = "client", name = "Pj", descriptor = "I")
    private int field622;

    @OriginalMember(owner = "client", name = "Qj", descriptor = "I")
    private int field623;

    @OriginalMember(owner = "client", name = "Rj", descriptor = "I")
    private int field624;

    @OriginalMember(owner = "client", name = "Uj", descriptor = "I")
    public static int field627;

    @OriginalMember(owner = "client", name = "Mc", descriptor = "J")
    private long field256;

    @OriginalMember(owner = "client", name = "Te", descriptor = "J")
    public long field367;

    @OriginalMember(owner = "client", name = "Yf", descriptor = "J")
    private long field423;

    @OriginalMember(owner = "client", name = "lg", descriptor = "J")
    private long field436;

    @OriginalMember(owner = "client", name = "Eg", descriptor = "J")
    private long field455;

    @OriginalMember(owner = "client", name = "lf", descriptor = "LDIVYVFFL;")
    private class10 field384;

    @OriginalMember(owner = "client", name = "mf", descriptor = "LDIVYVFFL;")
    private class10 field385;

    @OriginalMember(owner = "client", name = "nf", descriptor = "LDIVYVFFL;")
    private class10 field386;

    @OriginalMember(owner = "client", name = "of", descriptor = "LDIVYVFFL;")
    private class10 field387;

    @OriginalMember(owner = "client", name = "xf", descriptor = "LHUWYSFFT;")
    private class23 field396;

    @OriginalMember(owner = "client", name = "bi", descriptor = "LLIOYHOWO;")
    private class34 field530;

    @OriginalMember(owner = "client", name = "vd", descriptor = "LAGTHLVTI;")
    private class3 field291;

    @OriginalMember(owner = "client", name = "wd", descriptor = "LAGTHLVTI;")
    private class3 field292;

    @OriginalMember(owner = "client", name = "de", descriptor = "LAGTHLVTI;")
    private class3 field325;

    @OriginalMember(owner = "client", name = "ee", descriptor = "LAGTHLVTI;")
    private class3 field326;

    @OriginalMember(owner = "client", name = "gg", descriptor = "LAGTHLVTI;")
    private class3 field431;

    @OriginalMember(owner = "client", name = "hg", descriptor = "LAGTHLVTI;")
    private class3 field432;

    @OriginalMember(owner = "client", name = "ig", descriptor = "LAGTHLVTI;")
    private class3 field433;

    @OriginalMember(owner = "client", name = "og", descriptor = "LAGTHLVTI;")
    private class3 field439;

    @OriginalMember(owner = "client", name = "pg", descriptor = "LAGTHLVTI;")
    private class3 field440;

    @OriginalMember(owner = "client", name = "qg", descriptor = "LAGTHLVTI;")
    private class3 field441;

    @OriginalMember(owner = "client", name = "rg", descriptor = "LAGTHLVTI;")
    private class3 field442;

    @OriginalMember(owner = "client", name = "sg", descriptor = "LAGTHLVTI;")
    private class3 field443;

    @OriginalMember(owner = "client", name = "Mg", descriptor = "LAGTHLVTI;")
    private class3 field463;

    @OriginalMember(owner = "client", name = "Ng", descriptor = "LAGTHLVTI;")
    private class3 field464;

    @OriginalMember(owner = "client", name = "Og", descriptor = "LAGTHLVTI;")
    private class3 field465;

    @OriginalMember(owner = "client", name = "Oh", descriptor = "LAGTHLVTI;")
    private class3 field517;

    @OriginalMember(owner = "client", name = "Ph", descriptor = "LAGTHLVTI;")
    private class3 field518;

    @OriginalMember(owner = "client", name = "Qh", descriptor = "LAGTHLVTI;")
    private class3 field519;

    @OriginalMember(owner = "client", name = "Rh", descriptor = "LAGTHLVTI;")
    private class3 field520;

    @OriginalMember(owner = "client", name = "Sh", descriptor = "LAGTHLVTI;")
    private class3 field521;

    @OriginalMember(owner = "client", name = "xb", descriptor = "LSJUCHLXH;")
    public static class49 field189;

    @OriginalMember(owner = "client", name = "Z", descriptor = "LSKZHQGHX;")
    private class50 field165;

    @OriginalMember(owner = "client", name = "ab", descriptor = "LSKZHQGHX;")
    private class50 field166;

    @OriginalMember(owner = "client", name = "bb", descriptor = "LSKZHQGHX;")
    private class50 field167;

    @OriginalMember(owner = "client", name = "Jd", descriptor = "LSKZHQGHX;")
    private class50 field305;

    @OriginalMember(owner = "client", name = "Kd", descriptor = "LSKZHQGHX;")
    private class50 field306;

    @OriginalMember(owner = "client", name = "Ld", descriptor = "LSKZHQGHX;")
    private class50 field307;

    @OriginalMember(owner = "client", name = "Md", descriptor = "LSKZHQGHX;")
    private class50 field308;

    @OriginalMember(owner = "client", name = "Nd", descriptor = "LSKZHQGHX;")
    private class50 field309;

    @OriginalMember(owner = "client", name = "Od", descriptor = "LSKZHQGHX;")
    private class50 field310;

    @OriginalMember(owner = "client", name = "Pd", descriptor = "LSKZHQGHX;")
    private class50 field311;

    @OriginalMember(owner = "client", name = "Qd", descriptor = "LSKZHQGHX;")
    private class50 field312;

    @OriginalMember(owner = "client", name = "Rd", descriptor = "LSKZHQGHX;")
    private class50 field313;

    @OriginalMember(owner = "client", name = "oi", descriptor = "LSKZHQGHX;")
    private class50 field543;

    @OriginalMember(owner = "client", name = "pi", descriptor = "LSKZHQGHX;")
    private class50 field544;

    @OriginalMember(owner = "client", name = "qi", descriptor = "LSKZHQGHX;")
    private class50 field545;

    @OriginalMember(owner = "client", name = "ri", descriptor = "LSKZHQGHX;")
    private class50 field546;

    @OriginalMember(owner = "client", name = "si", descriptor = "LSKZHQGHX;")
    private class50 field547;

    @OriginalMember(owner = "client", name = "ti", descriptor = "LSKZHQGHX;")
    private class50 field548;

    @OriginalMember(owner = "client", name = "ui", descriptor = "LSKZHQGHX;")
    private class50 field549;

    @OriginalMember(owner = "client", name = "vi", descriptor = "LSKZHQGHX;")
    private class50 field550;

    @OriginalMember(owner = "client", name = "wi", descriptor = "LSKZHQGHX;")
    private class50 field551;

    @OriginalMember(owner = "client", name = "Hj", descriptor = "LSKZHQGHX;")
    private class50 field614;

    @OriginalMember(owner = "client", name = "Ij", descriptor = "LSKZHQGHX;")
    private class50 field615;

    @OriginalMember(owner = "client", name = "Jj", descriptor = "LSKZHQGHX;")
    private class50 field616;

    @OriginalMember(owner = "client", name = "Kj", descriptor = "LSKZHQGHX;")
    private class50 field617;

    @OriginalMember(owner = "client", name = "mg", descriptor = "LTDBJVJCU;")
    private class53 field437;

    @OriginalMember(owner = "client", name = "If", descriptor = "LXAXJBOWU;")
    public class65 field407;

    @OriginalMember(owner = "client", name = "Oi", descriptor = "LXXDUCPOC;")
    private class66 field569;

    @OriginalMember(owner = "client", name = "Fb", descriptor = "LYHASUFYG;")
    private class68 field197;

    @OriginalMember(owner = "client", name = "Gb", descriptor = "LYHASUFYG;")
    private class68 field198;

    @OriginalMember(owner = "client", name = "Hb", descriptor = "LYHASUFYG;")
    private class68 field199;

    @OriginalMember(owner = "client", name = "Ib", descriptor = "LYHASUFYG;")
    private class68 field200;

    @OriginalMember(owner = "client", name = "Jb", descriptor = "LYHASUFYG;")
    private class68 field201;

    @OriginalMember(owner = "client", name = "Ee", descriptor = "LYHASUFYG;")
    private class68 field352;

    @OriginalMember(owner = "client", name = "Kf", descriptor = "LYHASUFYG;")
    private class68 field409;

    @OriginalMember(owner = "client", name = "Lf", descriptor = "LYHASUFYG;")
    private class68 field410;

    @OriginalMember(owner = "client", name = "bh", descriptor = "LYHASUFYG;")
    private class68 field478;

    @OriginalMember(owner = "client", name = "Wh", descriptor = "LYHASUFYG;")
    private class68 field525;

    @OriginalMember(owner = "client", name = "Xh", descriptor = "LYHASUFYG;")
    private class68 field526;

    @OriginalMember(owner = "client", name = "dj", descriptor = "LYHASUFYG;")
    private class68 field584;

    @OriginalMember(owner = "client", name = "ej", descriptor = "LYHASUFYG;")
    private class68 field585;

    @OriginalMember(owner = "client", name = "xj", descriptor = "LYHASUFYG;")
    private class68 field604;

    @OriginalMember(owner = "client", name = "Ad", descriptor = "LBYZSQZUF;")
    private class7 field296;

    @OriginalMember(owner = "client", name = "cc", descriptor = "Ljava/lang/String;")
    public String field220;

    @OriginalMember(owner = "client", name = "xc", descriptor = "Ljava/lang/String;")
    private String field241;

    @OriginalMember(owner = "client", name = "jh", descriptor = "Ljava/lang/String;")
    public String field486;

    @OriginalMember(owner = "client", name = "nj", descriptor = "Ljava/lang/String;")
    private String field594;

    @OriginalMember(owner = "client", name = "Zh", descriptor = "Ljava/net/Socket;")
    private Socket field528;

    @OriginalMember(owner = "client", name = "eb", descriptor = "Z")
    public static boolean field170;

    @OriginalMember(owner = "client", name = "Wd", descriptor = "Z")
    private static boolean field318;

    @OriginalMember(owner = "client", name = "zi", descriptor = "Z")
    private static boolean field554;

    @OriginalMember(owner = "client", name = "rj", descriptor = "Z")
    public static boolean field598;

    @OriginalMember(owner = "client", name = "Tj", descriptor = "Z")
    private static boolean field626;

    @OriginalMember(owner = "client", name = "Pc", descriptor = "[I")
    private int[] field259;

    @OriginalMember(owner = "client", name = "Qc", descriptor = "[I")
    private int[] field260;

    @OriginalMember(owner = "client", name = "bg", descriptor = "[I")
    private int[] field426;

    @OriginalMember(owner = "client", name = "cg", descriptor = "[I")
    private int[] field427;

    @OriginalMember(owner = "client", name = "dg", descriptor = "[I")
    private int[] field428;

    @OriginalMember(owner = "client", name = "eg", descriptor = "[I")
    private int[] field429;

    @OriginalMember(owner = "client", name = "hi", descriptor = "[I")
    private int[] field536;

    @OriginalMember(owner = "client", name = "ii", descriptor = "[I")
    private int[] field537;

    @OriginalMember(owner = "client", name = "ki", descriptor = "[I")
    private int[] field539;

    @OriginalMember(owner = "client", name = "li", descriptor = "[I")
    private int[] field540;

    @OriginalMember(owner = "client", name = "mi", descriptor = "[I")
    private int[] field541;

    @OriginalMember(owner = "client", name = "oj", descriptor = "[I")
    private int[] field595;

    @OriginalMember(owner = "client", name = "pj", descriptor = "[I")
    private int[] field596;

    @OriginalMember(owner = "client", name = "qj", descriptor = "[I")
    private int[] field597;

    @OriginalMember(owner = "client", name = "Uc", descriptor = "[LAGTHLVTI;")
    private class3[] field264;

    @OriginalMember(owner = "client", name = "hb", descriptor = "[[B")
    private byte[][] field173;

    @OriginalMember(owner = "client", name = "ge", descriptor = "[[B")
    private byte[][] field328;

    @OriginalMember(owner = "client", name = "Vh", descriptor = "[[[B")
    private byte[][][] field524;

    @OriginalMember(owner = "client", name = "V", descriptor = "[[[I")
    private int[][][] field161;

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILSJPORZIF;)Z")
    public final boolean method33(int arg0, class48 arg1) {
        if (arg1.field1221 == null) {
            return false;
        } else {
            for (int var3 = 0; var3 < arg1.field1221.length; ++var3) {
                int var4 = this.method41(var3, 180, arg1);
                int var5 = arg1.field1244[var3];
                if (arg1.field1221[var3] == 2) {
                    if (var4 >= var5) {
                        return false;
                    }
                } else if (arg1.field1221[var3] == 3) {
                    if (var4 <= var5) {
                        return false;
                    }
                } else if (arg1.field1221[var3] == 4) {
                    if (var4 == var5) {
                        return false;
                    }
                } else if (var4 != var5) {
                    return false;
                }
            }
            if (arg0 != 45167) {
                this.field370 = -305;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(I)V")
    public final void method34(int arg0) {
        this.field614.method455(9133);
        class58.field1478 = this.field596;
        this.field463.method13(0, 0, 4);
        if (arg0 > 0) {
            if (this.field395 != -1) {
                this.method131(0, 0, 0, -44100, class48.field1219[this.field395]);
            } else if (this.field445[this.field591] != -1) {
                this.method131(0, 0, 0, -44100, class48.field1219[this.field445[this.field591]]);
            }
            if (this.field516 && this.field207 == 1) {
                this.method135(true);
            }
            this.field614.method456(553, -30916, 205, super.field1502);
            this.field616.method455(9133);
            class58.field1478 = this.field597;
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(B)V")
    public final void method35(byte arg0) {
        this.field291 = new class3(this.field296, "titlebox", 0);
        this.field292 = new class3(this.field296, "titlebutton", 0);
        this.field264 = new class3[12];
        int var2 = 0;
        try {
            var2 = Integer.parseInt(this.getParameter("fl_icon"));
        } catch (Exception var19) {
        }
        if (var2 == 0) {
            for (int var3 = 0; var3 < 12; ++var3) {
                this.field264[var3] = new class3(this.field296, "runes", var3);
            }
        } else {
            for (int var4 = 0; var4 < 12; ++var4) {
                this.field264[var4] = new class3(this.field296, "runes", (var4 & 3) + 12);
            }
        }
        this.field409 = new class68(128, 265);
        if (arg0 == 59) {
            this.field410 = new class68(128, 265);
            for (int var5 = 0; var5 < 33920; ++var5) {
                this.field409.field1690[var5] = this.field546.field1316[var5];
            }
            for (int var6 = 0; var6 < 33920; ++var6) {
                this.field410.field1690[var6] = this.field547.field1316[var6];
            }
            this.field427 = new int[256];
            for (int var7 = 0; var7 < 64; ++var7) {
                this.field427[var7] = var7 * 262144;
            }
            for (int var8 = 0; var8 < 64; ++var8) {
                this.field427[var8 + 64] = var8 * 1024 + 16711680;
            }
            for (int var9 = 0; var9 < 64; ++var9) {
                this.field427[var9 + 128] = var9 * 4 + 16776960;
            }
            for (int var10 = 0; var10 < 64; ++var10) {
                this.field427[var10 + 192] = 16777215;
            }
            this.field428 = new int[256];
            for (int var11 = 0; var11 < 64; ++var11) {
                this.field428[var11] = var11 * 1024;
            }
            for (int var12 = 0; var12 < 64; ++var12) {
                this.field428[var12 + 64] = var12 * 4 + 65280;
            }
            for (int var13 = 0; var13 < 64; ++var13) {
                this.field428[var13 + 128] = var13 * 262144 + 65535;
            }
            for (int var14 = 0; var14 < 64; ++var14) {
                this.field428[var14 + 192] = 16777215;
            }
            this.field429 = new int[256];
            for (int var15 = 0; var15 < 64; ++var15) {
                this.field429[var15] = var15 * 4;
            }
            for (int var16 = 0; var16 < 64; ++var16) {
                this.field429[var16 + 64] = var16 * 262144 + 255;
            }
            for (int var17 = 0; var17 < 64; ++var17) {
                this.field429[var17 + 128] = var17 * 1024 + 16711935;
            }
            for (int var18 = 0; var18 < 64; ++var18) {
                this.field429[var18 + 192] = 16777215;
            }
            this.field426 = new int[256];
            this.field259 = new int[32768];
            this.field260 = new int[32768];
            this.method40((class3) null, this.field572);
            this.field536 = new int[32768];
            this.field537 = new int[32768];
            this.method83(field372, 10, "Connecting to fileserver");
            if (!this.field365) {
                this.field272 = true;
                this.field365 = true;
                this.method36(this, 2);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
    public final void method36(Runnable arg0, int arg1) {
        if (arg1 > 10) {
            arg1 = 10;
        }
        if (signlink.mainapp != null) {
            signlink.startthread(arg0, arg1);
        } else {
            super.method36(arg0, arg1);
        }
    }

    @OriginalMember(owner = "client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        try {
            System.out.println("RS2 user client - release #" + 330);
            if (arg0.length != 5) {
                System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
            } else {
                field315 = Integer.parseInt(arg0[0]);
                field316 = Integer.parseInt(arg0[1]);
                if (arg0[2].equals("lowmem")) {
                    method105((byte) -19);
                } else {
                    if (!arg0[2].equals("highmem")) {
                        System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
                        return;
                    }
                    method51(0);
                }
                if (arg0[3].equals("free")) {
                    field317 = false;
                } else {
                    if (!arg0[3].equals("members")) {
                        System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
                        return;
                    }
                    field317 = true;
                }
                signlink.storeid = Integer.parseInt(arg0[4]);
                signlink.startpriv(InetAddress.getLocalHost());
                client var1 = new client();
                var1.method511(765, 503, -955);
            }
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BILYHASUFYG;I)V")
    public final void method37(byte arg0, int arg1, class68 arg2, int arg3) {
        int var5 = this.field413 + this.field319 & 2047;
        int var6 = arg1 * arg1 + arg3 * arg3;
        if (var6 <= 6400) {
            int var7 = class67.field1678[var5];
            int var8 = class67.field1679[var5];
            int var9 = var7 * 256 / (this.field287 + 256);
            if (arg0 != -98) {
                for (int var10 = 1; var10 > 0; ++var10) {
                }
            }
            int var11 = var8 * 256 / (this.field287 + 256);
            int var12 = arg1 * var11 + arg3 * var9 >> 16;
            int var13 = arg3 * var11 - arg1 * var9 >> 16;
            if (var6 > 2500) {
                arg2.method584(83 - var13 - arg2.field1696 / 2 - 4, this.field464, var12 + 94 - arg2.field1695 / 2 + 4, this.field266);
            } else {
                arg2.method578(var12 + 94 - arg2.field1695 / 2 + 4, 83 - var13 - arg2.field1696 / 2 - 4, 4);
            }
        }
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(I)V")
    public final void method38(int arg0) {
        if (arg0 >= 0) {
            this.field295 = !this.field295;
        }
        this.method162(this.field571);
        if (this.field271 == 1) {
            this.field558[this.field270 / 100].method578(this.field268 - 8 - 4, this.field269 - 8 - 4, 4);
        }
        if (this.field271 == 2) {
            this.field558[this.field270 / 100 + 4].method578(this.field268 - 8 - 4, this.field269 - 8 - 4, 4);
        }
        if (this.field391 != -1) {
            this.method163(0, this.field607, this.field391);
            this.method131(0, 0, 0, -44100, class48.field1219[this.field391]);
        }
        if (this.field262 != -1) {
            this.method163(0, this.field607, this.field262);
            this.method131(0, 0, 0, -44100, class48.field1219[this.field262]);
        }
        this.method70(748);
        if (!this.field516) {
            this.method168(7);
            this.method103(-9516);
        } else if (this.field207 == 0) {
            this.method135(true);
        }
        if (this.field592 == 1) {
            this.field227[1].method578(472, 296, 4);
        }
        if (field598) {
            short var2 = 507;
            byte var3 = 20;
            int var4 = 16776960;
            if (super.field1498 < 15) {
                var4 = 16711680;
            }
            this.field385.method175("Fps:" + super.field1498, 0, var4, var2, var3);
            int var12 = var3 + 15;
            Runtime var5 = Runtime.getRuntime();
            int var6 = (int) ((var5.totalMemory() - var5.freeMemory()) / 1024L);
            int var7 = 16776960;
            if (var6 > 33554432 && field318) {
                int var8 = 16711680;
            }
            this.field385.method175("Mem:" + var6 + "k", 0, 16776960, var2, var12);
            var12 += 15;
        }
        if (this.field582 != 0) {
            int var9 = this.field582 / 50;
            int var10 = var9 / 60;
            int var11 = var9 % 60;
            if (var11 < 10) {
                this.field385.method180(329, "System update in: " + var10 + ":0" + var11, -412, 4, 16776960);
            } else {
                this.field385.method180(329, "System update in: " + var10 + ":" + var11, -412, 4, 16776960);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IBIILSJUCHLXH;)V")
    public final void method39(int arg0, byte arg1, int arg2, int arg3, class49 arg4) {
        if (field189 != arg4) {
            if (this.field203 < 400) {
                if (this.field564 != arg1) {
                    this.field612 = !this.field612;
                }
                String var6;
                if (arg4.field1314 == 0) {
                    var6 = arg4.field1302 + method57(arg4.field1301, field189.field1301, true) + " (level-" + arg4.field1301 + ")";
                } else {
                    var6 = arg4.field1302 + " (skill-" + arg4.field1314 + ")";
                }
                if (this.field482 == 1) {
                    this.field286[this.field203] = "Use " + this.field486 + " with @whi@" + var6;
                    this.field562[this.field203] = 29;
                    this.field563[this.field203] = arg2;
                    this.field560[this.field203] = arg0;
                    this.field561[this.field203] = arg3;
                    ++this.field203;
                } else if (this.field217 == 1) {
                    if ((this.field219 & 8) == 8) {
                        this.field286[this.field203] = this.field220 + " @whi@" + var6;
                        this.field562[this.field203] = 313;
                        this.field563[this.field203] = arg2;
                        this.field560[this.field203] = arg0;
                        this.field561[this.field203] = arg3;
                        ++this.field203;
                    }
                } else {
                    for (int var7 = 4; var7 >= 0; --var7) {
                        if (this.field505[var7] != null) {
                            this.field286[this.field203] = this.field505[var7] + " @whi@" + var6;
                            short var9 = 0;
                            if (this.field505[var7].equalsIgnoreCase("attack")) {
                                if (arg4.field1301 > field189.field1301) {
                                    var9 = 2000;
                                }
                                if (field189.field1288 != 0 && arg4.field1288 != 0) {
                                    if (field189.field1288 == arg4.field1288) {
                                        var9 = 2000;
                                    } else {
                                        var9 = 0;
                                    }
                                }
                            } else if (this.field506[var7]) {
                                var9 = 2000;
                            }
                            if (var7 == 0) {
                                this.field562[this.field203] = var9 + 409;
                            }
                            if (var7 == 1) {
                                this.field562[this.field203] = var9 + 148;
                            }
                            if (var7 == 2) {
                                this.field562[this.field203] = var9 + 743;
                            }
                            if (var7 == 3) {
                                this.field562[this.field203] = var9 + 540;
                            }
                            if (var7 == 4) {
                                this.field562[this.field203] = var9 + 575;
                            }
                            this.field563[this.field203] = arg2;
                            this.field560[this.field203] = arg0;
                            this.field561[this.field203] = arg3;
                            ++this.field203;
                        }
                    }
                }
                for (int var8 = 0; var8 < this.field203; ++var8) {
                    if (this.field562[var8] == 797) {
                        this.field286[var8] = "Walk here @whi@" + var6;
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LAGTHLVTI;Z)V")
    public final void method40(class3 arg0, boolean arg1) {
        short var3 = 256;
        this.field254 &= arg1;
        for (int var4 = 0; var4 < this.field259.length; ++var4) {
            this.field259[var4] = 0;
        }
        for (int var5 = 0; var5 < 5000; ++var5) {
            int var17 = (int) (Math.random() * 128.0D * (double) var3);
            this.field259[var17] = (int) (Math.random() * 256.0D);
        }
        for (int var6 = 0; var6 < 20; ++var6) {
            for (int var13 = 1; var13 < var3 - 1; ++var13) {
                for (int var15 = 1; var15 < 127; ++var15) {
                    int var16 = (var13 << 7) + var15;
                    this.field260[var16] = (this.field259[var16 - 1] + this.field259[var16 + 1] + this.field259[var16 - 128] + this.field259[var16 + 128]) / 4;
                }
            }
            int[] var14 = this.field259;
            this.field259 = this.field260;
            this.field260 = var14;
        }
        if (arg0 != null) {
            int var7 = 0;
            for (int var8 = 0; var8 < arg0.field29; ++var8) {
                for (int var9 = 0; var9 < arg0.field28; ++var9) {
                    if (arg0.field26[var7++] != 0) {
                        int var10 = var9 + 16 + arg0.field30;
                        int var11 = var8 + 16 + arg0.field31;
                        int var12 = (var11 << 7) + var10;
                        this.field259[var12] = 0;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IILSJPORZIF;)I")
    public final int method41(int arg0, int arg1, class48 arg2) {
        if (arg1 <= 0) {
            return this.field224;
        } else if (arg2.field1236 != null && arg0 < arg2.field1236.length) {
            try {
                int[] var4 = arg2.field1236[arg0];
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
                        var9 = this.field361[var4[var6++]];
                    }
                    if (var8 == 2) {
                        var9 = this.field242[var4[var6++]];
                    }
                    if (var8 == 3) {
                        var9 = this.field261[var4[var6++]];
                    }
                    if (var8 == 4) {
                        class48 var11 = class48.field1219[var4[var6++]];
                        int var12 = var4[var6++];
                        if (var12 >= 0 && var12 < class46.field1162 && (!class46.method438(var12).field1199 || field317)) {
                            for (int var13 = 0; var13 < var11.field1256.length; ++var13) {
                                if (var12 + 1 == var11.field1256[var13]) {
                                    var9 += var11.field1218[var13];
                                }
                            }
                        }
                    }
                    if (var8 == 5) {
                        var9 = this.field216[var4[var6++]];
                    }
                    if (var8 == 6) {
                        var9 = field489[this.field242[var4[var6++]] - 1];
                    }
                    if (var8 == 7) {
                        var9 = this.field216[var4[var6++]] * 100 / 46875;
                    }
                    if (var8 == 8) {
                        var9 = field189.field1301;
                    }
                    if (var8 == 9) {
                        for (int var14 = 0; var14 < class30.field922; ++var14) {
                            if (class30.field924[var14]) {
                                var9 += this.field242[var14];
                            }
                        }
                    }
                    if (var8 == 10) {
                        class48 var15 = class48.field1219[var4[var6++]];
                        int var16 = var4[var6++] + 1;
                        if (var16 >= 0 && var16 < class46.field1162 && (!class46.method438(var16).field1199 || field317)) {
                            for (int var17 = 0; var17 < var15.field1256.length; ++var17) {
                                if (var15.field1256[var17] == var16) {
                                    var9 = 999999999;
                                    break;
                                }
                            }
                        }
                    }
                    if (var8 == 11) {
                        var9 = this.field470;
                    }
                    if (var8 == 12) {
                        var9 = this.field247;
                    }
                    if (var8 == 13) {
                        int var18 = this.field216[var4[var6++]];
                        int var19 = var4[var6++];
                        var9 = (var18 & 1 << var19) != 0 ? 1 : 0;
                    }
                    if (var8 == 14) {
                        int var20 = var4[var6++];
                        class2 var21 = class2.field12[var20];
                        int var22 = var21.field14;
                        int var23 = var21.field15;
                        int var24 = var21.field16;
                        int var25 = field299[var24 - var23];
                        var9 = this.field216[var22] >> var23 & var25;
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
                        var9 = (field189.field51 >> 7) + this.field330;
                    }
                    if (var8 == 19) {
                        var9 = (field189.field52 >> 7) + this.field331;
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

    @OriginalMember(owner = "client", name = "a", descriptor = "(IILIMUIZRAF;)V")
    private final void method42(int arg0, int arg1, class24 arg2) {
        this.field480 = 0;
        this.field512 = 0;
        this.method46(arg1, (byte) 8, arg2);
        this.method133(true, arg1, arg2);
        this.method82(arg2, arg1, true);
        while (arg0 >= 0) {
            this.method116();
        }
        for (int var4 = 0; var4 < this.field480; ++var4) {
            int var6 = this.field481[var4];
            if (field609 != this.field283[var6].field81) {
                this.field283[var6].field1044 = null;
                this.field283[var6] = null;
            }
        }
        if (arg2.field832 != arg1) {
            signlink.reporterror(this.field151 + " size mismatch in getnpcpos - pos:" + arg2.field832 + " psize:" + arg1);
            throw new RuntimeException("eek");
        } else {
            for (int var5 = 0; var5 < this.field284; ++var5) {
                if (this.field283[this.field285[var5]] == null) {
                    signlink.reporterror(this.field151 + " null entry in npc list - pos:" + var5 + " size:" + this.field284);
                    throw new RuntimeException("eek");
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Z)V")
    public void method43(boolean arg0) {
        System.out.println("============");
        System.out.println("flame-cycle:" + this.field383);
        if (arg0) {
            if (this.field437 != null) {
                System.out.println("Od-cycle:" + this.field437.field1371);
            }
            System.out.println("loop-cycle:" + field609);
            System.out.println("draw-cycle:" + field446);
            System.out.println("ptype:" + this.field497);
            System.out.println("psize:" + this.field496);
            if (this.field396 != null) {
                this.field396.method225(true);
            }
            super.field1499 = true;
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(B)Ljava/awt/Component;")
    public final Component method44(byte arg0) {
        if (arg0 == 2) {
            boolean var2 = false;
            if (signlink.mainapp != null) {
                return signlink.mainapp;
            } else {
                return super.field1505 != null ? super.field1505 : this;
            }
        } else {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IZ)V")
    public final void method45(int arg0, boolean arg1) {
        if (this.field583 != arg0) {
            this.field290 = null;
        }
        for (int var3 = 0; var3 < this.field284; ++var3) {
            class37 var4 = this.field283[this.field285[var3]];
            int var5 = (this.field285[var3] << 14) + 536870912;
            if (var4 != null && var4.method21(0) && var4.field1044.field1534 == arg1 && var4.field1044.method519(207)) {
                int var6 = var4.field51 >> 7;
                int var7 = var4.field52 >> 7;
                if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
                    if (var4.field40 == 1 && (var4.field51 & 127) == 64 && (var4.field52 & 127) == 64) {
                        if (this.field400[var6][var7] == this.field379) {
                            continue;
                        }
                        this.field400[var6][var7] = this.field379;
                    }
                    if (!var4.field1044.field1545) {
                        var5 += Integer.MIN_VALUE;
                    }
                    this.field530.method336(this.method84(false, var4.field52, this.field303, var4.field51), false, var5, (var4.field40 - 1) * 64 + 60, var4.field51, var4, this.field303, var4.field52, var4.field53, var4.field39);
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IBLIMUIZRAF;)V")
    private final void method46(int arg0, byte arg1, class24 arg2) {
        arg2.method248((byte) 7);
        int var4 = arg2.method249(8, (byte) -80);
        if (arg1 != 8) {
            this.field497 = -1;
        }
        if (var4 < this.field284) {
            for (int var5 = var4; var5 < this.field284; ++var5) {
                this.field481[this.field480++] = this.field285[var5];
            }
        }
        if (var4 > this.field284) {
            signlink.reporterror(this.field151 + " Too many npcs");
            throw new RuntimeException("eek");
        } else {
            this.field284 = 0;
            for (int var6 = 0; var6 < var4; ++var6) {
                int var7 = this.field285[var6];
                class37 var8 = this.field283[var7];
                int var9 = arg2.method249(1, (byte) -80);
                if (var9 == 0) {
                    this.field285[this.field284++] = var7;
                    var8.field81 = field609;
                } else {
                    int var10 = arg2.method249(2, (byte) -80);
                    if (var10 == 0) {
                        this.field285[this.field284++] = var7;
                        var8.field81 = field609;
                        this.field513[this.field512++] = var7;
                    } else if (var10 == 1) {
                        this.field285[this.field284++] = var7;
                        var8.field81 = field609;
                        int var11 = arg2.method249(3, (byte) -80);
                        var8.method20(false, var11, (byte) 0);
                        int var12 = arg2.method249(1, (byte) -80);
                        if (var12 == 1) {
                            this.field513[this.field512++] = var7;
                        }
                    } else if (var10 == 2) {
                        this.field285[this.field284++] = var7;
                        var8.field81 = field609;
                        int var13 = arg2.method249(3, (byte) -80);
                        var8.method20(true, var13, (byte) 0);
                        int var14 = arg2.method249(3, (byte) -80);
                        var8.method20(true, var14, (byte) 0);
                        int var15 = arg2.method249(1, (byte) -80);
                        if (var15 == 1) {
                            this.field513[this.field512++] = var7;
                        }
                    } else if (var10 == 3) {
                        this.field481[this.field480++] = var7;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILBBWFUJHQ;I)V")
    public final void method47(int arg0, class5 arg1, int arg2) {
        this.method48(arg0, (byte) 8, arg1.field51, arg1.field52);
        if (arg2 == 42909) {
            ;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IBII)V")
    public final void method48(int arg0, byte arg1, int arg2, int arg3) {
        if (arg2 >= 128 && arg3 >= 128 && arg2 <= 13056 && arg3 <= 13056) {
            int var5 = this.method84(false, arg3, this.field303, arg2) - arg0;
            int var6 = arg2 - this.field230;
            int var7 = var5 - this.field231;
            int var8 = arg3 - this.field232;
            int var9 = class67.field1678[this.field233];
            int var10 = class67.field1679[this.field233];
            int var11 = class67.field1678[this.field234];
            int var12 = class67.field1679[this.field234];
            int var13 = var6 * var12 + var8 * var11 >> 16;
            int var14 = var8 * var12 - var6 * var11 >> 16;
            if (arg1 == 8) {
                boolean var15 = false;
            } else {
                this.field497 = -1;
            }
            int var17 = var7 * var10 - var9 * var14 >> 16;
            int var18 = var7 * var9 + var10 * var14 >> 16;
            if (var18 >= 50) {
                this.field556 = (var13 << 9) / var18 + class58.field1472;
                this.field557 = (var17 << 9) / var18 + class58.field1473;
            } else {
                this.field556 = -1;
                this.field557 = -1;
            }
        } else {
            this.field556 = -1;
            this.field557 = -1;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LSJPORZIF;I)Z")
    public final boolean method49(class48 arg0, int arg1) {
        int var3 = arg0.field1268;
        this.field496 += arg1;
        if (this.field579 == 2) {
            if (var3 == 201) {
                this.field212 = true;
                this.field492 = 0;
                this.field424 = true;
                this.field263 = "";
                this.field555 = 1;
                this.field348 = "Enter name of friend to add to list";
            }
            if (var3 == 202) {
                this.field212 = true;
                this.field492 = 0;
                this.field424 = true;
                this.field263 = "";
                this.field555 = 2;
                this.field348 = "Enter name of friend to delete from list";
            }
        }
        if (var3 == 205) {
            this.field500 = 250;
            return true;
        } else {
            if (var3 == 501) {
                this.field212 = true;
                this.field492 = 0;
                this.field424 = true;
                this.field263 = "";
                this.field555 = 4;
                this.field348 = "Enter name of player to add to list";
            }
            if (var3 == 502) {
                this.field212 = true;
                this.field492 = 0;
                this.field424 = true;
                this.field263 = "";
                this.field555 = 5;
                this.field348 = "Enter name of player to delete from list";
            }
            if (var3 >= 300 && var3 <= 313) {
                int var4 = (var3 - 300) / 2;
                int var5 = var3 & 1;
                int var6 = this.field531[var4];
                if (var6 != -1) {
                    while (true) {
                        if (var5 == 0) {
                            --var6;
                            if (var6 < 0) {
                                var6 = class6.field100 - 1;
                            }
                        }
                        if (var5 == 1) {
                            ++var6;
                            if (var6 >= class6.field100) {
                                var6 = 0;
                            }
                        }
                        if (!class6.field101[var6].field107 && class6.field101[var6].field102 == var4 + (this.field304 ? 0 : 7)) {
                            this.field531[var4] = var6;
                            this.field196 = true;
                            break;
                        }
                    }
                }
            }
            if (var3 >= 314 && var3 <= 323) {
                int var7 = (var3 - 314) / 2;
                int var8 = var3 & 1;
                int var9 = this.field341[var7];
                if (var8 == 0) {
                    --var9;
                    if (var9 < 0) {
                        var9 = field202[var7].length - 1;
                    }
                }
                if (var8 == 1) {
                    ++var9;
                    if (var9 >= field202[var7].length) {
                        var9 = 0;
                    }
                }
                this.field341[var7] = var9;
                this.field196 = true;
            }
            if (var3 == 324 && !this.field304) {
                this.field304 = true;
                this.method174(89);
            }
            if (var3 == 325 && this.field304) {
                this.field304 = false;
                this.method174(89);
            }
            if (var3 != 326) {
                if (var3 == 613) {
                    this.field406 = !this.field406;
                }
                if (var3 >= 601 && var3 <= 612) {
                    this.method76(188);
                    if (this.field248.length() > 0) {
                        this.field223.method227(40, this.field376);
                        this.field223.method234(979, class31.method318(this.field248));
                        this.field223.method228(var3 - 601);
                        this.field223.method228(this.field406 ? 1 : 0);
                    }
                }
                return false;
            } else {
                this.field223.method227(159, this.field376);
                this.field223.method228(this.field304 ? 0 : 1);
                for (int var10 = 0; var10 < 7; ++var10) {
                    this.field223.method228(this.field531[var10]);
                }
                for (int var11 = 0; var11 < 5; ++var11) {
                    this.field223.method228(this.field341[var11]);
                }
                return true;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LFHZFOSDU;B)V")
    private final void method50(class16 arg0, byte arg1) {
        int var3 = 0;
        int var4 = -1;
        int var5 = 0;
        int var6 = 0;
        if (arg0.field714 == 0) {
            var3 = this.field530.method351(arg0.field713, arg0.field715, arg0.field716);
        }
        if (arg0.field714 == 1) {
            var3 = this.field530.method352(arg0.field713, false, arg0.field716, arg0.field715);
        }
        if (arg0.field714 == 2) {
            var3 = this.field530.method353(arg0.field713, arg0.field715, arg0.field716);
        }
        if (arg0.field714 == 3) {
            var3 = this.field530.method354(arg0.field713, arg0.field715, arg0.field716);
        }
        if (var3 != 0) {
            int var7 = this.field530.method355(arg0.field713, arg0.field715, arg0.field716, var3);
            var4 = var3 >> 14 & 32767;
            var5 = var7 & 31;
            var6 = var7 >> 6;
        }
        arg0.field717 = var4;
        if (arg1 == 0) {
            boolean var8 = false;
        } else {
            this.field374 = -53;
        }
        arg0.field719 = var5;
        arg0.field718 = var6;
    }

    @OriginalMember(owner = "client", name = "h", descriptor = "(I)V")
    public static final void method51(int arg0) {
        class34.field949 = false;
        class58.field1467 = false;
        field318 = false;
        class42.field1103 = false;
        if (arg0 != 0) {
            for (int var1 = 1; var1 > 0; ++var1) {
            }
        }
        class41.field1053 = false;
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(II)Ljava/lang/String;")
    private static final String method52(int arg0, int arg1) {
        String var2 = String.valueOf(arg0);
        for (int var3 = var2.length() - 3; var3 > 0; var3 -= 3) {
            var2 = var2.substring(0, var3) + "," + var2.substring(var3);
        }
        if (arg1 != -26537) {
            for (int var4 = 1; var4 > 0; ++var4) {
            }
        }
        if (var2.length() > 8) {
            var2 = "@gre@" + var2.substring(0, var2.length() - 8) + " million @whi@(" + var2 + ")";
        } else if (var2.length() > 4) {
            var2 = "@cya@" + var2.substring(0, var2.length() - 4) + "K @whi@(" + var2 + ")";
        }
        return " " + var2;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(B)V")
    public final void method53(byte arg0) {
        if (arg0 != 112) {
            this.field290 = null;
        }
        if (!this.field588 && !this.field371 && !this.field542) {
            ++field446;
            if (!this.field254) {
                this.method130(false, 887);
            } else {
                this.method151(0);
            }
            this.field586 = 0;
        } else {
            this.method97(true);
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(II)Ljava/lang/String;")
    private static final String method54(int arg0, int arg1) {
        if (arg0 != 0) {
            throw new NullPointerException();
        } else if (arg1 < 100000) {
            return String.valueOf(arg1);
        } else {
            return arg1 < 10000000 ? arg1 / 1000 + "K" : arg1 / 1000000 + "M";
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIZII)V")
    public final void method55(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        this.field325.method13(arg2, arg5, 4);
        this.field326.method13(arg2, arg1 + arg5 - 16, 4);
        class11.method196(this.field335, arg2, 16, arg1 - 32, arg5 + 16, 3);
        int var7 = (arg1 - 32) * arg1 / arg4;
        if (var7 < 8) {
            var7 = 8;
        }
        int var8 = (arg1 - 32 - var7) * arg0 / (arg4 - arg1);
        class11.method196(this.field495, arg2, 16, var7, arg5 + 16 + var8, 3);
        class11.method201(arg2, var7, arg5 + 16 + var8, this.field168, (byte) 1);
        class11.method201(arg2 + 1, var7, arg5 + 16 + var8, this.field168, (byte) 1);
        class11.method199(this.field168, arg2, arg5 + 16 + var8, 0, 16);
        class11.method199(this.field168, arg2, arg5 + 17 + var8, 0, 16);
        this.field254 &= arg3;
        class11.method201(arg2 + 15, var7, arg5 + 16 + var8, this.field552, (byte) 1);
        class11.method201(arg2 + 14, var7 - 1, arg5 + 17 + var8, this.field552, (byte) 1);
        class11.method199(this.field552, arg2, arg5 + 15 + var8 + var7, 0, 16);
        class11.method199(this.field552, arg2 + 1, arg5 + 14 + var8 + var7, 0, 15);
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIII)V")
    public final void method56(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg2 != 17156) {
            this.field290 = null;
        }
        int var7 = this.field530.method351(arg4, arg5, arg1);
        if (var7 != 0) {
            int var8 = this.field530.method355(arg4, arg5, arg1, var7);
            int var9 = var8 >> 6 & 3;
            int var10 = var8 & 31;
            int var11 = arg3;
            if (var7 > 0) {
                var11 = arg0;
            }
            int[] var12 = this.field478.field1690;
            int var13 = (103 - arg1) * 512 * 4 + arg5 * 4 + 24624;
            int var14 = var7 >> 14 & 32767;
            class41 var15 = class41.method398(var14);
            if (var15.field1090 != -1) {
                class3 var16 = this.field456[var15.field1090];
                if (var16 != null) {
                    int var17 = (var15.field1094 * 4 - var16.field28) / 2;
                    int var18 = (var15.field1067 * 4 - var16.field29) / 2;
                    var16.method13(arg5 * 4 + 48 + var17, (104 - arg1 - var15.field1067) * 4 + 48 + var18, 4);
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
        int var19 = this.field530.method353(arg4, arg5, arg1);
        if (var19 != 0) {
            int var20 = this.field530.method355(arg4, arg5, arg1, var19);
            int var21 = var20 >> 6 & 3;
            int var22 = var20 & 31;
            int var23 = var19 >> 14 & 32767;
            class41 var24 = class41.method398(var23);
            if (var24.field1090 != -1) {
                class3 var25 = this.field456[var24.field1090];
                if (var25 != null) {
                    int var26 = (var24.field1094 * 4 - var25.field28) / 2;
                    int var27 = (var24.field1067 * 4 - var25.field29) / 2;
                    var25.method13(arg5 * 4 + 48 + var26, (104 - arg1 - var24.field1067) * 4 + 48 + var27, 4);
                }
            } else if (var22 == 9) {
                int var28 = 15658734;
                if (var19 > 0) {
                    var28 = 15597568;
                }
                int[] var29 = this.field478.field1690;
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
        int var31 = this.field530.method354(arg4, arg5, arg1);
        if (var31 != 0) {
            int var32 = var31 >> 14 & 32767;
            class41 var33 = class41.method398(var32);
            if (var33.field1090 != -1) {
                class3 var34 = this.field456[var33.field1090];
                if (var34 != null) {
                    int var35 = (var33.field1094 * 4 - var34.field28) / 2;
                    int var36 = (var33.field1067 * 4 - var34.field29) / 2;
                    var34.method13(arg5 * 4 + 48 + var35, (104 - arg1 - var33.field1067) * 4 + 48 + var36, 4);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIZ)Ljava/lang/String;")
    public static final String method57(int arg0, int arg1, boolean arg2) {
        if (!arg2) {
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

    @OriginalMember(owner = "client", name = "b", descriptor = "(Z)V")
    public final void method58(boolean arg0) {
        class41.field1073.method527();
        if (!arg0) {
            this.field224 = 63;
        }
        class41.field1079.method527();
        class60.field1547.method527();
        class46.field1190.method527();
        class46.field1160.method527();
        class49.field1295.method527();
        class9.field148.method527();
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILIMUIZRAF;I)V")
    private final void method59(int arg0, class24 arg1, int arg2) {
        int var4 = 18 / arg0;
        for (int var5 = 0; var5 < this.field512; ++var5) {
            int var6 = this.field513[var5];
            class49 var7 = this.field509[var6];
            int var8 = arg1.method238();
            if ((var8 & 4) != 0) {
                var8 += arg1.method238() << 8;
            }
            this.method119(arg1, var7, var8, var6, (byte) 1);
        }
    }

    @OriginalMember(owner = "client", name = "i", descriptor = "(I)V")
    public final void method60(int arg0) {
        if (arg0 <= 0) {
            this.field497 = -1;
        }
        if (field318 && this.field226 == 2 && class42.field1122 != this.field303) {
            this.field616.method455(9133);
            this.field385.method176(-35924, 151, 0, 257, "Loading - please wait.");
            this.field385.method176(-35924, 150, 16777215, 256, "Loading - please wait.");
            this.field616.method456(4, -30916, 4, super.field1502);
            this.field226 = 1;
            this.field455 = System.currentTimeMillis();
        }
        if (this.field226 == 1) {
            int var2 = this.method61(true);
            if (var2 != 0 && System.currentTimeMillis() - this.field455 > 360000L) {
                signlink.reporterror(this.field151 + " glcfb " + this.field423 + "," + var2 + "," + field318 + "," + this.field150[0] + "," + this.field437.method472() + "," + this.field303 + "," + this.field460 + "," + this.field461);
                this.field455 = System.currentTimeMillis();
            }
        }
        if (this.field226 == 2 && this.field422 != this.field303) {
            this.field422 = this.field303;
            this.method114(this.field416, this.field303);
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(Z)I")
    public final int method61(boolean arg0) {
        for (int var2 = 0; var2 < this.field173.length; ++var2) {
            if (this.field173[var2] == null && this.field540[var2] != -1) {
                return -1;
            }
            if (this.field328[var2] == null && this.field541[var2] != -1) {
                return -2;
            }
        }
        boolean var3 = true;
        for (int var4 = 0; var4 < this.field173.length; ++var4) {
            byte[] var5 = this.field328[var4];
            if (var5 != null) {
                int var6 = (this.field539[var4] >> 8) * 64 - this.field330;
                int var7 = (this.field539[var4] & 255) * 64 - this.field331;
                if (this.field613) {
                    var6 = 10;
                    var7 = 10;
                }
                var3 &= class42.method407(var5, var6, -898, var7);
            }
        }
        if (!var3) {
            return -3;
        } else if (this.field504) {
            return -4;
        } else {
            this.field226 = 2;
            class42.field1122 = this.field303;
            this.field254 &= arg0;
            this.method128(true);
            this.field223.method227(231, this.field376);
            return 0;
        }
    }

    @OriginalMember(owner = "client", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        return signlink.mainapp != null ? signlink.mainapp.getParameter(arg0) : super.getParameter(arg0);
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;B)Z")
    public final boolean method62(String arg0, byte arg1) {
        if (arg0 == null) {
            return false;
        } else {
            for (int var3 = 0; var3 < this.field578; ++var3) {
                if (arg0.equalsIgnoreCase(this.field419[var3])) {
                    return true;
                }
            }
            if (this.field356 == arg1) {
                boolean var4 = false;
            } else {
                this.field382 = 482;
            }
            return arg0.equalsIgnoreCase(field189.field1302);
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(II)V")
    public final void method63(int arg0, int arg1) {
        int var3 = class52.field1350[arg1].field1358;
        if (var3 != 0) {
            int var4 = this.field216[arg1];
            if (arg0 < 0) {
                if (var3 == 1) {
                    if (var4 == 1) {
                        class58.method503((byte) -128, 0.9D);
                    }
                    if (var4 == 2) {
                        class58.method503((byte) -128, 0.8D);
                    }
                    if (var4 == 3) {
                        class58.method503((byte) -128, 0.7D);
                    }
                    if (var4 == 4) {
                        class58.method503((byte) -128, 0.6D);
                    }
                    class46.field1160.method527();
                    this.field611 = true;
                }
                if (var3 == 3) {
                    boolean var5 = this.field195;
                    if (var4 == 0) {
                        this.method153(this.field195, -455, 0);
                        this.field195 = true;
                    }
                    if (var4 == 1) {
                        this.method153(this.field195, -455, -400);
                        this.field195 = true;
                    }
                    if (var4 == 2) {
                        this.method153(this.field195, -455, -800);
                        this.field195 = true;
                    }
                    if (var4 == 3) {
                        this.method153(this.field195, -455, -1200);
                        this.field195 = true;
                    }
                    if (var4 == 4) {
                        this.field195 = false;
                    }
                    if (this.field195 != var5 && !field318) {
                        if (this.field195) {
                            this.field346 = this.field377;
                            this.field347 = true;
                            this.field437.method469(2, this.field346);
                        } else {
                            this.method99(this.field382);
                        }
                        this.field222 = 0;
                    }
                }
                if (var3 == 4) {
                    if (var4 == 0) {
                        this.field351 = true;
                        this.method102(0, (byte) 6);
                    }
                    if (var4 == 1) {
                        this.field351 = true;
                        this.method102(-400, (byte) 6);
                    }
                    if (var4 == 2) {
                        this.field351 = true;
                        this.method102(-800, (byte) 6);
                    }
                    if (var4 == 3) {
                        this.field351 = true;
                        this.method102(-1200, (byte) 6);
                    }
                    if (var4 == 4) {
                        this.field351 = false;
                    }
                }
                if (var3 == 5) {
                    this.field366 = var4;
                }
                if (var3 == 6) {
                    this.field454 = var4;
                }
                if (var3 == 8) {
                    this.field336 = var4;
                    this.field212 = true;
                }
                if (var3 == 9) {
                    this.field239 = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(Z)V")
    public final void method64(boolean arg0) {
        if (this.field500 > 0) {
            this.method166(true);
        } else {
            this.field616.method455(9133);
            this.field385.method176(-35924, 144, 0, 257, "Connection lost");
            this.field385.method176(-35924, 143, 16777215, 256, "Connection lost");
            this.field385.method176(-35924, 159, 0, 257, "Please wait - attempting to reestablish");
            this.field385.method176(-35924, 158, 16777215, 256, "Please wait - attempting to reestablish");
            if (arg0) {
                this.field616.method456(4, -30916, 4, super.field1502);
                this.field369 = 0;
                this.field476 = 0;
                class23 var2 = this.field396;
                this.field254 = false;
                this.field363 = 0;
                this.method109(this.field151, this.field152, true);
                if (!this.field254) {
                    this.method166(true);
                }
                try {
                    var2.method220();
                } catch (Exception var3) {
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BLSJPORZIF;)V")
    public final void method65(byte arg0, class48 arg1) {
        int var3 = arg1.field1268;
        if (arg0 != -12) {
            this.field497 = this.field246.method238();
        }
        if (var3 >= 1 && var3 <= 100 || var3 >= 701 && var3 <= 800) {
            if (var3 == 1 && this.field579 == 0) {
                arg1.field1220 = "Loading friend list";
                arg1.field1226 = 0;
            } else if (var3 == 1 && this.field579 == 1) {
                arg1.field1220 = "Connecting to friendserver";
                arg1.field1226 = 0;
            } else if (var3 == 2 && this.field579 != 2) {
                arg1.field1220 = "Please wait...";
                arg1.field1226 = 0;
            } else {
                int var4 = this.field578;
                if (this.field579 != 2) {
                    var4 = 0;
                }
                if (var3 > 700) {
                    var3 -= 601;
                } else {
                    --var3;
                }
                if (var3 >= var4) {
                    arg1.field1220 = "";
                    arg1.field1226 = 0;
                } else {
                    arg1.field1220 = this.field419[var3];
                    arg1.field1226 = 1;
                }
            }
        } else if (var3 >= 101 && var3 <= 200 || var3 >= 801 && var3 <= 900) {
            int var5 = this.field578;
            if (this.field579 != 2) {
                var5 = 0;
            }
            if (var3 > 800) {
                var3 -= 701;
            } else {
                var3 -= 101;
            }
            if (var3 >= var5) {
                arg1.field1220 = "";
                arg1.field1226 = 0;
            } else {
                if (this.field522[var3] == 0) {
                    arg1.field1220 = "@red@Offline";
                } else if (this.field522[var3] < 200) {
                    if (this.field522[var3] == field315) {
                        arg1.field1220 = "@gre@World-" + (this.field522[var3] - 9);
                    } else {
                        arg1.field1220 = "@yel@World-" + (this.field522[var3] - 9);
                    }
                } else if (this.field522[var3] == field315) {
                    arg1.field1220 = "@gre@Classic" + (this.field522[var3] - 219);
                } else {
                    arg1.field1220 = "@yel@Classic" + (this.field522[var3] - 219);
                }
                arg1.field1226 = 1;
            }
        } else if (var3 == 203) {
            int var6 = this.field578;
            if (this.field579 != 2) {
                var6 = 0;
            }
            arg1.field1215 = var6 * 15 + 20;
            if (arg1.field1215 <= arg1.field1267) {
                arg1.field1215 = arg1.field1267 + 1;
            }
        } else if (var3 >= 401 && var3 <= 500) {
            var3 -= 401;
            if (var3 == 0 && this.field579 == 0) {
                arg1.field1220 = "Loading ignore list";
                arg1.field1226 = 0;
            } else if (var3 == 1 && this.field579 == 0) {
                arg1.field1220 = "Please wait...";
                arg1.field1226 = 0;
            } else {
                int var7 = this.field448;
                if (this.field579 == 0) {
                    var7 = 0;
                }
                if (var3 >= var7) {
                    arg1.field1220 = "";
                    arg1.field1226 = 0;
                } else {
                    arg1.field1220 = class31.method322(true, class31.method319(-602, this.field225[var3]));
                    arg1.field1226 = 1;
                }
            }
        } else if (var3 == 503) {
            arg1.field1215 = this.field448 * 15 + 20;
            if (arg1.field1215 <= arg1.field1267) {
                arg1.field1215 = arg1.field1267 + 1;
            }
        } else if (var3 == 327) {
            arg1.field1232 = 150;
            arg1.field1233 = (int) (Math.sin((double) field609 / 40.0D) * 256.0D) & 2047;
            if (this.field196) {
                for (int var8 = 0; var8 < 7; ++var8) {
                    int var15 = this.field531[var8];
                    if (var15 >= 0 && !class6.field101[var15].method24(989)) {
                        return;
                    }
                }
                this.field196 = false;
                class67[] var9 = new class67[7];
                int var10 = 0;
                for (int var11 = 0; var11 < 7; ++var11) {
                    int var14 = this.field531[var11];
                    if (var14 >= 0) {
                        var9[var10++] = class6.field101[var14].method25(true);
                    }
                }
                class67 var12 = new class67(var9, true, var10);
                for (int var13 = 0; var13 < 5; ++var13) {
                    if (this.field341[var13] != 0) {
                        var12.method562(field202[var13][0], field202[var13][this.field341[var13]]);
                        if (var13 == 1) {
                            var12.method562(field475[0], field475[this.field341[var13]]);
                        }
                    }
                }
                var12.method555((byte) 45);
                var12.method556(598, class71.field1705[field189.field90].field1707[0]);
                var12.method565(64, 850, -30, -50, -30, true);
                arg1.field1241 = 5;
                arg1.field1242 = 0;
                class48.method451(this.field355, 0, 5, var12);
            }
        } else if (var3 == 324) {
            if (this.field584 == null) {
                this.field584 = arg1.field1277;
                this.field585 = arg1.field1264;
            }
            if (this.field304) {
                arg1.field1277 = this.field585;
            } else {
                arg1.field1277 = this.field584;
            }
        } else if (var3 == 325) {
            if (this.field584 == null) {
                this.field584 = arg1.field1277;
                this.field585 = arg1.field1264;
            }
            if (this.field304) {
                arg1.field1277 = this.field584;
            } else {
                arg1.field1277 = this.field585;
            }
        } else if (var3 == 600) {
            arg1.field1220 = this.field248;
            if (field609 % 20 < 10) {
                arg1.field1220 = arg1.field1220 + "|";
            } else {
                arg1.field1220 = arg1.field1220 + " ";
            }
        } else {
            if (var3 == 613) {
                if (this.field235 >= 1) {
                    if (this.field406) {
                        arg1.field1230 = 16711680;
                        arg1.field1220 = "Moderator option: Mute player for 48 hours: <ON>";
                    } else {
                        arg1.field1230 = 16777215;
                        arg1.field1220 = "Moderator option: Mute player for 48 hours: <OFF>";
                    }
                } else {
                    arg1.field1220 = "";
                }
            }
            if (var3 == 650 || var3 == 655) {
                if (this.field250 != 0) {
                    String var16;
                    if (this.field403 == 0) {
                        var16 = "earlier today";
                    } else if (this.field403 == 1) {
                        var16 = "yesterday";
                    } else {
                        var16 = this.field403 + " days ago";
                    }
                    arg1.field1220 = "You last logged in " + var16 + " from: " + signlink.dns;
                } else {
                    arg1.field1220 = "";
                }
            }
            if (var3 == 651) {
                if (this.field342 == 0) {
                    arg1.field1220 = "0 unread messages";
                    arg1.field1230 = 16776960;
                }
                if (this.field342 == 1) {
                    arg1.field1220 = "1 unread message";
                    arg1.field1230 = 65280;
                }
                if (this.field342 > 1) {
                    arg1.field1220 = this.field342 + " unread messages";
                    arg1.field1230 = 65280;
                }
            }
            if (var3 == 652) {
                if (this.field300 == 201) {
                    if (this.field294 == 1) {
                        arg1.field1220 = "@yel@This is a non-members world: @whi@Since you are a member we";
                    } else {
                        arg1.field1220 = "";
                    }
                } else if (this.field300 == 200) {
                    arg1.field1220 = "You have not yet set any password recovery questions.";
                } else {
                    String var17;
                    if (this.field300 == 0) {
                        var17 = "Earlier today";
                    } else if (this.field300 == 1) {
                        var17 = "Yesterday";
                    } else {
                        var17 = this.field300 + " days ago";
                    }
                    arg1.field1220 = var17 + " you changed your recovery questions";
                }
            }
            if (var3 == 653) {
                if (this.field300 == 201) {
                    if (this.field294 == 1) {
                        arg1.field1220 = "@whi@recommend you use a members world instead. You may use";
                    } else {
                        arg1.field1220 = "";
                    }
                } else if (this.field300 == 200) {
                    arg1.field1220 = "We strongly recommend you do so now to secure your account.";
                } else {
                    arg1.field1220 = "If you do not remember making this change then cancel it immediately";
                }
            }
            if (var3 == 654) {
                if (this.field300 == 201) {
                    if (this.field294 == 1) {
                        arg1.field1220 = "@whi@this world but member benefits are unavailable whilst here.";
                    } else {
                        arg1.field1220 = "";
                    }
                } else if (this.field300 == 200) {
                    arg1.field1220 = "Do this from the 'account management' area on our front webpage";
                } else {
                    arg1.field1220 = "Do this from the 'account management' area on our front webpage";
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(JI)V")
    public final void method66(long arg0, int arg1) {
        if (arg0 != 0L) {
            if (this.field448 >= 100) {
                this.method125(0, "", "Your ignore list is full. Max of 100 hit", (byte) 5);
            } else {
                String var4 = class31.method322(true, class31.method319(-602, arg0));
                for (int var5 = 0; var5 < this.field448; ++var5) {
                    if (this.field225[var5] == arg0) {
                        this.method125(0, "", var4 + " is already on your ignore list", (byte) 5);
                        return;
                    }
                }
                for (int var6 = 0; var6 < this.field578; ++var6) {
                    if (this.field343[var6] == arg0) {
                        this.method125(0, "", "Please remove " + var4 + " from your friend list first", (byte) 5);
                        return;
                    }
                }
                this.field225[this.field448++] = arg0;
                this.field589 = true;
                this.field496 += arg1;
                this.field223.method227(235, this.field376);
                this.field223.method234(979, arg0);
            }
        }
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(Z)I")
    public final int method67(boolean arg0) {
        int var2 = 3;
        if (!arg0) {
            this.field223.method228(55);
        }
        if (this.field233 < 310) {
            int var3 = this.field230 >> 7;
            int var4 = this.field232 >> 7;
            int var5 = field189.field51 >> 7;
            int var6 = field189.field52 >> 7;
            if ((this.field524[this.field303][var3][var4] & 4) != 0) {
                var2 = this.field303;
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
                    if ((this.field524[this.field303][var3][var4] & 4) != 0) {
                        var2 = this.field303;
                    }
                    var10 += var9;
                    if (var10 >= 65536) {
                        var10 -= 65536;
                        if (var4 < var6) {
                            ++var4;
                        } else if (var4 > var6) {
                            --var4;
                        }
                        if ((this.field524[this.field303][var3][var4] & 4) != 0) {
                            var2 = this.field303;
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
                    if ((this.field524[this.field303][var3][var4] & 4) != 0) {
                        var2 = this.field303;
                    }
                    var12 += var11;
                    if (var12 >= 65536) {
                        var12 -= 65536;
                        if (var3 < var5) {
                            ++var3;
                        } else if (var3 > var5) {
                            --var3;
                        }
                        if ((this.field524[this.field303][var3][var4] & 4) != 0) {
                            var2 = this.field303;
                        }
                    }
                }
            }
        }
        if ((this.field524[this.field303][field189.field51 >> 7][field189.field52 >> 7] & 4) != 0) {
            var2 = this.field303;
        }
        return var2;
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(B)I")
    public final int method68(byte arg0) {
        int var2 = this.method84(false, this.field232, this.field303, this.field230);
        if (arg0 != 76) {
            this.field382 = this.field569.method541();
        }
        return var2 - this.field231 < 800 && (this.field524[this.field303][this.field230 >> 7][this.field232 >> 7] & 4) != 0 ? this.field303 : 3;
    }

    @OriginalMember(owner = "client", name = "j", descriptor = "(I)V")
    public final void method69(int arg0) {
        if (arg0 == 13755) {
            int var2 = this.field386.method178(47982, "Choose Option");
            for (int var3 = 0; var3 < this.field203; ++var3) {
                int var11 = this.field386.method178(47982, this.field286[var3]);
                if (var11 > var2) {
                    var2 = var11;
                }
            }
            var2 += 8;
            int var4 = this.field203 * 15 + 21;
            if (super.field1517 > 4 && super.field1518 > 4 && super.field1517 < 516 && super.field1518 < 338) {
                int var5 = super.field1517 - 4 - var2 / 2;
                if (var2 + var5 > 512) {
                    var5 = 512 - var2;
                }
                if (var5 < 0) {
                    var5 = 0;
                }
                int var6 = super.field1518 - 4;
                if (var4 + var6 > 334) {
                    var6 = 334 - var4;
                }
                if (var6 < 0) {
                    var6 = 0;
                }
                this.field516 = true;
                this.field207 = 0;
                this.field208 = var5;
                this.field209 = var6;
                this.field210 = var2;
                this.field211 = this.field203 * 15 + 22;
            }
            if (super.field1517 > 553 && super.field1518 > 205 && super.field1517 < 743 && super.field1518 < 466) {
                int var7 = super.field1517 - 553 - var2 / 2;
                if (var7 < 0) {
                    var7 = 0;
                } else if (var2 + var7 > 190) {
                    var7 = 190 - var2;
                }
                int var8 = super.field1518 - 205;
                if (var8 < 0) {
                    var8 = 0;
                } else if (var4 + var8 > 261) {
                    var8 = 261 - var4;
                }
                this.field516 = true;
                this.field207 = 1;
                this.field208 = var7;
                this.field209 = var8;
                this.field210 = var2;
                this.field211 = this.field203 * 15 + 22;
            }
            if (super.field1517 > 17 && super.field1518 > 357 && super.field1517 < 496 && super.field1518 < 453) {
                int var9 = super.field1517 - 17 - var2 / 2;
                if (var9 < 0) {
                    var9 = 0;
                } else if (var2 + var9 > 479) {
                    var9 = 479 - var2;
                }
                int var10 = super.field1518 - 357;
                if (var10 < 0) {
                    var10 = 0;
                } else if (var4 + var10 > 96) {
                    var10 = 96 - var4;
                }
                this.field516 = true;
                this.field207 = 2;
                this.field208 = var9;
                this.field209 = var10;
                this.field210 = var2;
                this.field211 = this.field203 * 15 + 22;
            }
        }
    }

    @OriginalMember(owner = "client", name = "k", descriptor = "(I)V")
    public final void method70(int arg0) {
        if (arg0 <= 0) {
            this.field290 = null;
        }
        this.field565 = 0;
        int var2 = (field189.field51 >> 7) + this.field330;
        int var3 = (field189.field52 >> 7) + this.field331;
        if (var2 >= 3053 && var2 <= 3156 && var3 >= 3056 && var3 <= 3136) {
            this.field565 = 1;
        }
        if (var2 >= 3072 && var2 <= 3118 && var3 >= 9492 && var3 <= 9535) {
            this.field565 = 1;
        }
        if (this.field565 == 1 && var2 >= 3139 && var2 <= 3199 && var3 >= 3008 && var3 <= 3062) {
            this.field565 = 0;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIBIIIII)V")
    private final void method71(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        class16 var11 = null;
        for (class16 var12 = (class16) this.field435.method382(); var12 != null; var12 = (class16) this.field435.method384((byte) -96)) {
            if (var12.field713 == arg0 && var12.field715 == arg8 && var12.field716 == arg3 && var12.field714 == arg6) {
                var11 = var12;
                break;
            }
        }
        if (var11 == null) {
            var11 = new class16();
            var11.field713 = arg0;
            var11.field714 = arg6;
            var11.field715 = arg8;
            var11.field716 = arg3;
            this.method50(var11, (byte) 0);
            this.field435.method379(var11);
        }
        var11.field720 = arg1;
        var11.field722 = arg5;
        var11.field721 = arg9;
        var11.field724 = arg7;
        if (arg4 != -33) {
            this.field612 = !this.field612;
        }
        var11.field723 = arg2;
    }

    @OriginalMember(owner = "client", name = "l", descriptor = "(I)V")
    public final void method72(int arg0) {
        this.field496 += arg0;
        if (super.field1516 == 1) {
            if (super.field1517 >= 6 && super.field1517 <= 106 && super.field1518 >= 467 && super.field1518 <= 499) {
                this.field421 = (this.field421 + 1) % 4;
                this.field176 = true;
                this.field212 = true;
                this.field223.method227(112, this.field376);
                this.field223.method228(this.field421);
                this.field223.method228(this.field515);
                this.field223.method228(this.field488);
            }
            if (super.field1517 >= 135 && super.field1517 <= 235 && super.field1518 >= 467 && super.field1518 <= 499) {
                this.field515 = (this.field515 + 1) % 3;
                this.field176 = true;
                this.field212 = true;
                this.field223.method227(112, this.field376);
                this.field223.method228(this.field421);
                this.field223.method228(this.field515);
                this.field223.method228(this.field488);
            }
            if (super.field1517 >= 273 && super.field1517 <= 373 && super.field1518 >= 467 && super.field1518 <= 499) {
                this.field488 = (this.field488 + 1) % 3;
                this.field176 = true;
                this.field212 = true;
                this.field223.method227(112, this.field376);
                this.field223.method228(this.field421);
                this.field223.method228(this.field515);
                this.field223.method228(this.field488);
            }
            if (super.field1517 >= 412 && super.field1517 <= 512 && super.field1518 >= 467 && super.field1518 <= 499) {
                if (this.field262 == -1) {
                    this.method76(188);
                    this.field248 = "";
                    this.field406 = false;
                    for (int var2 = 0; var2 < class48.field1219.length; ++var2) {
                        if (class48.field1219[var2] != null && class48.field1219[var2].field1268 == 600) {
                            this.field490 = this.field262 = class48.field1219[var2].field1228;
                            break;
                        }
                    }
                } else {
                    this.method125(0, "", "Please close the interface you have open before using 'report abuse'", (byte) 5);
                }
            }
            ++field192;
            if (field192 > 1463) {
                field192 = 0;
                this.field223.method227(79, this.field376);
                this.field223.method228(0);
                int var3 = this.field223.field832;
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field223.method229(31213);
                }
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field223.method229(17777);
                }
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field223.method229(29378);
                }
                this.field223.method229(63715);
                this.field223.method228((int) (Math.random() * 256.0D));
                this.field223.method228(38);
                this.field223.method229(31503);
                this.field223.method228(5);
                this.field223.method228((int) (Math.random() * 256.0D));
                this.field223.method228((int) (Math.random() * 256.0D));
                this.field223.method237(this.field191, this.field223.field832 - var3);
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(II)V")
    public final void method73(int arg0, int arg1) {
        if (arg1 != 6225) {
            this.field497 = -1;
        }
        if (!field318) {
            if (class58.field1486[17] >= arg0) {
                class3 var3 = class58.field1480[17];
                int var4 = var3.field29 * var3.field28 - 1;
                int var5 = this.field607 * var3.field28 * 2;
                byte[] var6 = var3.field26;
                byte[] var7 = this.field251;
                for (int var8 = 0; var8 <= var4; ++var8) {
                    var7[var8] = var6[var8 - var5 & var4];
                }
                var3.field26 = var7;
                this.field251 = var6;
                class58.method501(17, -406);
                ++field459;
                if (field459 > 57) {
                    field459 = 0;
                    this.field223.method227(16, this.field376);
                }
            }
            if (class58.field1486[24] >= arg0) {
                class3 var9 = class58.field1480[24];
                int var10 = var9.field29 * var9.field28 - 1;
                int var11 = this.field607 * var9.field28 * 2;
                byte[] var12 = var9.field26;
                byte[] var13 = this.field251;
                for (int var14 = 0; var14 <= var10; ++var14) {
                    var13[var14] = var12[var14 - var11 & var10];
                }
                var9.field26 = var13;
                this.field251 = var12;
                class58.method501(24, -406);
            }
            if (class58.field1486[34] >= arg0) {
                class3 var15 = class58.field1480[34];
                int var16 = var15.field29 * var15.field28 - 1;
                int var17 = this.field607 * var15.field28 * 2;
                byte[] var18 = var15.field26;
                byte[] var19 = this.field251;
                for (int var20 = 0; var20 <= var16; ++var20) {
                    var19[var20] = var18[var20 - var17 & var16];
                }
                var15.field26 = var19;
                this.field251 = var18;
                class58.method501(34, -406);
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(II[B)Z")
    public final boolean method74(int arg0, int arg1, byte[] arg2) {
        if (arg0 >= 0) {
            this.method116();
        }
        return arg2 == null ? true : signlink.wavesave(arg2, arg1);
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(B)V")
    public final void method75(byte arg0) {
        short var2 = 256;
        if (this.field257 > 0) {
            for (int var3 = 0; var3 < 256; ++var3) {
                if (this.field257 > 768) {
                    this.field426[var3] = this.method124(this.field428[var3], this.field427[var3], 9, 1024 - this.field257);
                } else if (this.field257 > 256) {
                    this.field426[var3] = this.field428[var3];
                } else {
                    this.field426[var3] = this.method124(this.field427[var3], this.field428[var3], 9, 256 - this.field257);
                }
            }
        } else if (this.field258 > 0) {
            for (int var4 = 0; var4 < 256; ++var4) {
                if (this.field258 > 768) {
                    this.field426[var4] = this.method124(this.field429[var4], this.field427[var4], 9, 1024 - this.field258);
                } else if (this.field258 > 256) {
                    this.field426[var4] = this.field429[var4];
                } else {
                    this.field426[var4] = this.method124(this.field427[var4], this.field429[var4], 9, 256 - this.field258);
                }
            }
        } else {
            for (int var5 = 0; var5 < 256; ++var5) {
                this.field426[var5] = this.field427[var5];
            }
        }
        for (int var6 = 0; var6 < 33920; ++var6) {
            this.field546.field1316[var6] = this.field409.field1690[var6];
        }
        int var7 = 0;
        int var8 = 1152;
        for (int var9 = 1; var9 < var2 - 1; ++var9) {
            int var23 = (var2 - var9) * this.field401[var9] / var2;
            int var24 = var23 + 22;
            if (var24 < 0) {
                var24 = 0;
            }
            var7 += var24;
            for (int var25 = var24; var25 < 128; ++var25) {
                int var26 = this.field536[var7++];
                if (var26 != 0) {
                    int var28 = 256 - var26;
                    int var29 = this.field426[var26];
                    int var30 = this.field546.field1316[var8];
                    this.field546.field1316[var8++] = ((var29 & 16711935) * var26 + (var30 & 16711935) * var28 & -16711936) + ((var29 & 65280) * var26 + (var30 & 65280) * var28 & 16711680) >> 8;
                } else {
                    ++var8;
                }
            }
            var8 += var24;
        }
        this.field546.method456(0, -30916, 0, super.field1502);
        for (int var10 = 0; var10 < 33920; ++var10) {
            this.field547.field1316[var10] = this.field410.field1690[var10];
        }
        int var11 = 0;
        int var12 = 1176;
        for (int var13 = 1; var13 < var2 - 1; ++var13) {
            int var14 = (var2 - var13) * this.field401[var13] / var2;
            int var15 = 103 - var14;
            int var16 = var12 + var14;
            for (int var17 = 0; var17 < var15; ++var17) {
                int var18 = this.field536[var11++];
                if (var18 != 0) {
                    int var20 = 256 - var18;
                    int var21 = this.field426[var18];
                    int var22 = this.field547.field1316[var16];
                    this.field547.field1316[var16++] = ((var21 & 16711935) * var18 + (var22 & 16711935) * var20 & -16711936) + ((var21 & 65280) * var18 + (var22 & 65280) * var20 & 16711680) >> 8;
                } else {
                    ++var16;
                }
            }
            var11 += 128 - var15;
            var12 = 128 - var15 - var14 + var16;
        }
        if (arg0 != 3) {
            this.field497 = -1;
        }
        this.field547.method456(637, -30916, 0, super.field1502);
    }

    @OriginalMember(owner = "client", name = "m", descriptor = "(I)V")
    public final void method76(int arg0) {
        this.field223.method227(169, this.field376);
        if (arg0 <= 0) {
            this.field290 = null;
        }
        if (this.field395 != -1) {
            this.field395 = -1;
            this.field589 = true;
            this.field298 = false;
            this.field354 = true;
        }
        if (this.field221 != -1) {
            this.field221 = -1;
            this.field212 = true;
            this.field298 = false;
        }
        this.field262 = -1;
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(III)V")
    public final void method77(int arg0, int arg1, int arg2) {
        int var4 = 0;
        int var5 = 25 / arg0;
        for (int var6 = 0; var6 < 100; ++var6) {
            if (this.field340[var6] != null) {
                int var7 = this.field338[var6];
                int var8 = 70 - var4 * 14 + this.field468 + 4;
                if (var8 < -20) {
                    break;
                }
                String var9 = this.field339[var6];
                boolean var10 = false;
                if (var9 != null && var9.startsWith("@cr1@")) {
                    var9 = var9.substring(5);
                    boolean var11 = true;
                }
                if (var9 != null && var9.startsWith("@cr2@")) {
                    var9 = var9.substring(5);
                    boolean var12 = true;
                }
                if (var7 == 0) {
                    ++var4;
                }
                if ((var7 == 1 || var7 == 2) && (var7 == 1 || this.field421 == 0 || this.field421 == 1 && this.method62(var9, this.field538))) {
                    if (arg2 > var8 - 14 && arg2 <= var8 && !var9.equals(field189.field1302)) {
                        if (this.field235 >= 1) {
                            this.field286[this.field203] = "Report abuse @whi@" + var9;
                            this.field562[this.field203] = 629;
                            ++this.field203;
                        }
                        this.field286[this.field203] = "Add ignore @whi@" + var9;
                        this.field562[this.field203] = 51;
                        ++this.field203;
                        this.field286[this.field203] = "Add friend @whi@" + var9;
                        this.field562[this.field203] = 79;
                        ++this.field203;
                    }
                    ++var4;
                }
                if ((var7 == 3 || var7 == 7) && this.field336 == 0 && (var7 == 7 || this.field515 == 0 || this.field515 == 1 && this.method62(var9, this.field538))) {
                    if (arg2 > var8 - 14 && arg2 <= var8) {
                        if (this.field235 >= 1) {
                            this.field286[this.field203] = "Report abuse @whi@" + var9;
                            this.field562[this.field203] = 629;
                            ++this.field203;
                        }
                        this.field286[this.field203] = "Add ignore @whi@" + var9;
                        this.field562[this.field203] = 51;
                        ++this.field203;
                        this.field286[this.field203] = "Add friend @whi@" + var9;
                        this.field562[this.field203] = 79;
                        ++this.field203;
                    }
                    ++var4;
                }
                if (var7 == 4 && (this.field488 == 0 || this.field488 == 1 && this.method62(var9, this.field538))) {
                    if (arg2 > var8 - 14 && arg2 <= var8) {
                        this.field286[this.field203] = "Accept trade @whi@" + var9;
                        this.field562[this.field203] = 457;
                        ++this.field203;
                    }
                    ++var4;
                }
                if ((var7 == 5 || var7 == 6) && this.field336 == 0 && this.field515 < 2) {
                    ++var4;
                }
                if (var7 == 8 && (this.field488 == 0 || this.field488 == 1 && this.method62(var9, this.field538))) {
                    if (arg2 > var8 - 14 && arg2 <= var8) {
                        this.field286[this.field203] = "Accept challenge @whi@" + var9;
                        this.field562[this.field203] = 502;
                        ++this.field203;
                    }
                    ++var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIZZIIIIII)Z")
    public final boolean method78(int arg0, int arg1, int arg2, int arg3, boolean arg4, boolean arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        byte var13 = 104;
        byte var14 = 104;
        for (int var15 = 0; var15 < var13; ++var15) {
            for (int var35 = 0; var35 < var14; ++var35) {
                this.field570[var15][var35] = 0;
                this.field493[var15][var35] = 99999999;
            }
        }
        int var16 = arg1;
        int var17 = arg2;
        this.field570[arg1][arg2] = 99;
        this.field493[arg1][arg2] = 0;
        byte var18 = 0;
        int var19 = 0;
        this.field254 &= arg5;
        this.field388[var18] = arg1;
        int var36 = var18 + 1;
        this.field389[var18] = arg2;
        boolean var20 = false;
        int var21 = this.field388.length;
        int[][] var22 = this.field553[this.field303].field1586;
        while (var36 != var19) {
            var16 = this.field388[var19];
            var17 = this.field389[var19];
            var19 = (var19 + 1) % var21;
            if (arg8 == var16 && arg7 == var17) {
                var20 = true;
                break;
            }
            if (arg0 != 0) {
                if ((arg0 < 5 || arg0 == 10) && this.field553[this.field303].method537(arg8, arg0 - 1, arg3, var17, var16, arg7, this.field240)) {
                    var20 = true;
                    break;
                }
                if (arg0 < 10 && this.field553[this.field303].method538(arg0 - 1, arg8, arg7, arg3, var17, -805, var16)) {
                    var20 = true;
                    break;
                }
            }
            if (arg10 != 0 && arg11 != 0 && this.field553[this.field303].method539((byte) 53, arg11, arg9, arg10, arg8, var17, arg7, var16)) {
                var20 = true;
                break;
            }
            int var34 = this.field493[var16][var17] + 1;
            if (var16 > 0 && this.field570[var16 - 1][var17] == 0 && (var22[var16 - 1][var17] & 19398920) == 0) {
                this.field388[var36] = var16 - 1;
                this.field389[var36] = var17;
                var36 = (var36 + 1) % var21;
                this.field570[var16 - 1][var17] = 2;
                this.field493[var16 - 1][var17] = var34;
            }
            if (var16 < var13 - 1 && this.field570[var16 + 1][var17] == 0 && (var22[var16 + 1][var17] & 19399040) == 0) {
                this.field388[var36] = var16 + 1;
                this.field389[var36] = var17;
                var36 = (var36 + 1) % var21;
                this.field570[var16 + 1][var17] = 8;
                this.field493[var16 + 1][var17] = var34;
            }
            if (var17 > 0 && this.field570[var16][var17 - 1] == 0 && (var22[var16][var17 - 1] & 19398914) == 0) {
                this.field388[var36] = var16;
                this.field389[var36] = var17 - 1;
                var36 = (var36 + 1) % var21;
                this.field570[var16][var17 - 1] = 1;
                this.field493[var16][var17 - 1] = var34;
            }
            if (var17 < var14 - 1 && this.field570[var16][var17 + 1] == 0 && (var22[var16][var17 + 1] & 19398944) == 0) {
                this.field388[var36] = var16;
                this.field389[var36] = var17 + 1;
                var36 = (var36 + 1) % var21;
                this.field570[var16][var17 + 1] = 4;
                this.field493[var16][var17 + 1] = var34;
            }
            if (var16 > 0 && var17 > 0 && this.field570[var16 - 1][var17 - 1] == 0 && (var22[var16 - 1][var17 - 1] & 19398926) == 0 && (var22[var16 - 1][var17] & 19398920) == 0 && (var22[var16][var17 - 1] & 19398914) == 0) {
                this.field388[var36] = var16 - 1;
                this.field389[var36] = var17 - 1;
                var36 = (var36 + 1) % var21;
                this.field570[var16 - 1][var17 - 1] = 3;
                this.field493[var16 - 1][var17 - 1] = var34;
            }
            if (var16 < var13 - 1 && var17 > 0 && this.field570[var16 + 1][var17 - 1] == 0 && (var22[var16 + 1][var17 - 1] & 19399043) == 0 && (var22[var16 + 1][var17] & 19399040) == 0 && (var22[var16][var17 - 1] & 19398914) == 0) {
                this.field388[var36] = var16 + 1;
                this.field389[var36] = var17 - 1;
                var36 = (var36 + 1) % var21;
                this.field570[var16 + 1][var17 - 1] = 9;
                this.field493[var16 + 1][var17 - 1] = var34;
            }
            if (var16 > 0 && var17 < var14 - 1 && this.field570[var16 - 1][var17 + 1] == 0 && (var22[var16 - 1][var17 + 1] & 19398968) == 0 && (var22[var16 - 1][var17] & 19398920) == 0 && (var22[var16][var17 + 1] & 19398944) == 0) {
                this.field388[var36] = var16 - 1;
                this.field389[var36] = var17 + 1;
                var36 = (var36 + 1) % var21;
                this.field570[var16 - 1][var17 + 1] = 6;
                this.field493[var16 - 1][var17 + 1] = var34;
            }
            if (var16 < var13 - 1 && var17 < var14 - 1 && this.field570[var16 + 1][var17 + 1] == 0 && (var22[var16 + 1][var17 + 1] & 19399136) == 0 && (var22[var16 + 1][var17] & 19399040) == 0 && (var22[var16][var17 + 1] & 19398944) == 0) {
                this.field388[var36] = var16 + 1;
                this.field389[var36] = var17 + 1;
                var36 = (var36 + 1) % var21;
                this.field570[var16 + 1][var17 + 1] = 12;
                this.field493[var16 + 1][var17 + 1] = var34;
            }
        }
        this.field606 = 0;
        if (!var20) {
            if (arg4) {
                int var23 = 100;
                for (int var24 = 1; var24 < 2; ++var24) {
                    for (int var25 = arg8 - var24; var25 <= arg8 + var24; ++var25) {
                        for (int var26 = arg7 - var24; var26 <= arg7 + var24; ++var26) {
                            if (var25 >= 0 && var26 >= 0 && var25 < 104 && var26 < 104 && this.field493[var25][var26] < var23) {
                                var23 = this.field493[var25][var26];
                                var16 = var25;
                                var17 = var26;
                                this.field606 = 1;
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
        this.field388[var27] = var16;
        int var37 = var27 + 1;
        this.field389[var27] = var17;
        int var28;
        int var29 = var28 = this.field570[var16][var17];
        while (arg1 != var16 || arg2 != var17) {
            if (var28 != var29) {
                var28 = var29;
                this.field388[var37] = var16;
                this.field389[var37++] = var17;
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
            var29 = this.field570[var16][var17];
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
            int var31 = this.field388[var37];
            int var32 = this.field389[var37];
            if (arg6 == 0) {
                this.field223.method227(58, this.field376);
                this.field223.method228(var30 + var30 + 3);
            }
            if (arg6 == 1) {
                this.field223.method227(21, this.field376);
                this.field223.method228(var30 + var30 + 3 + 14);
            }
            if (arg6 == 2) {
                this.field223.method227(221, this.field376);
                this.field223.method228(var30 + var30 + 3);
            }
            this.field223.method262(this.field330 + var31, 0);
            this.field223.method255(0, super.field1520[5] == 1 ? 1 : 0);
            this.field476 = this.field388[0];
            this.field477 = this.field389[0];
            for (int var33 = 1; var33 < var30; ++var33) {
                --var37;
                this.field223.method228(this.field388[var37] - var31);
                this.field223.method254(0, this.field389[var37] - var32);
            }
            this.field223.method262(this.field331 + var32, 0);
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIIIII)V")
    private final void method79(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg4 != -48118) {
            field372 = !field372;
        }
        if (arg6 >= 1 && arg0 >= 1 && arg6 <= 102 && arg0 <= 102) {
            if (field318 && this.field303 != arg1) {
                return;
            }
            int var9 = 0;
            boolean var10 = true;
            boolean var11 = false;
            boolean var12 = false;
            if (arg7 == 0) {
                var9 = this.field530.method351(arg1, arg6, arg0);
            }
            if (arg7 == 1) {
                var9 = this.field530.method352(arg1, false, arg0, arg6);
            }
            if (arg7 == 2) {
                var9 = this.field530.method353(arg1, arg6, arg0);
            }
            if (arg7 == 3) {
                var9 = this.field530.method354(arg1, arg6, arg0);
            }
            if (var9 != 0) {
                int var13 = this.field530.method355(arg1, arg6, arg0, var9);
                int var14 = var9 >> 14 & 32767;
                int var15 = var13 & 31;
                int var16 = var13 >> 6;
                if (arg7 == 0) {
                    this.field530.method342((byte) -112, arg1, arg0, arg6);
                    class41 var17 = class41.method398(var14);
                    if (var17.field1098) {
                        this.field553[arg1].method533(var17.field1091, var16, true, arg6, var15, arg0);
                    }
                }
                if (arg7 == 1) {
                    this.field530.method343(arg0, 27019, arg1, arg6);
                }
                if (arg7 == 2) {
                    this.field530.method344(arg0, arg1, arg6, false);
                    class41 var18 = class41.method398(var14);
                    if (var18.field1094 + arg6 > 103 || var18.field1094 + arg0 > 103 || var18.field1067 + arg6 > 103 || var18.field1067 + arg0 > 103) {
                        return;
                    }
                    if (var18.field1098) {
                        this.field553[arg1].method534((byte) 4, arg6, var18.field1067, arg0, var16, var18.field1094, var18.field1091);
                    }
                }
                if (arg7 == 3) {
                    this.field530.method345(true, arg6, arg1, arg0);
                    class41 var19 = class41.method398(var14);
                    if (var19.field1098 && var19.field1083) {
                        this.field553[arg1].method536(arg0, false, arg6);
                    }
                }
            }
            if (arg5 >= 0) {
                int var20 = arg1;
                if (arg1 < 3 && (this.field524[1][arg6][arg0] & 2) == 2) {
                    var20 = arg1 + 1;
                }
                class42.method417(arg6, this.field161, var20, arg3, this.field553[arg1], arg2, 927, arg0, arg5, arg1, this.field530);
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "([BZZ)V")
    public final void method80(byte[] arg0, boolean arg1, boolean arg2) {
        if (this.field195) {
            signlink.midifade = arg2 ? 1 : 0;
            signlink.midisave(arg0, arg0.length);
            if (!arg1) {
                for (int var4 = 1; var4 > 0; ++var4) {
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LYHASUFYG;III)V")
    public final void method81(class68 arg0, int arg1, int arg2, int arg3) {
        if (arg2 > 0) {
            int var5 = arg1 * arg1 + arg3 * arg3;
            if (var5 > 4225 && var5 < 90000) {
                int var6 = this.field413 + this.field319 & 2047;
                int var7 = class67.field1678[var6];
                int var8 = class67.field1679[var6];
                int var9 = var7 * 256 / (this.field287 + 256);
                int var10 = var8 * 256 / (this.field287 + 256);
                int var11 = arg1 * var10 + arg3 * var9 >> 16;
                int var12 = arg3 * var10 - arg1 * var9 >> 16;
                double var13 = Math.atan2((double) var11, (double) var12);
                int var15 = (int) (Math.sin(var13) * 63.0D);
                int var16 = (int) (Math.cos(var13) * 57.0D);
                this.field604.method583(var15 + 94 + 4 - 10, 20, var13, -542, 15, 15, 256, 20, 83 - var16 - 20);
            } else {
                this.method37((byte) -98, arg1, arg0, arg3);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LIMUIZRAF;IZ)V")
    private final void method82(class24 arg0, int arg1, boolean arg2) {
        if (!arg2) {
            this.field295 = !this.field295;
        }
        for (int var4 = 0; var4 < this.field512; ++var4) {
            int var5 = this.field513[var4];
            class37 var6 = this.field283[var5];
            int var7 = arg0.method238();
            if ((var7 & 2) != 0) {
                var6.field55 = arg0.method266(2);
                var6.field56 = arg0.method240();
            }
            if ((var7 & 4) != 0) {
                int var8 = arg0.method259(false);
                int var9 = arg0.method238();
                var6.method18(0, var9, field609, var8);
                var6.field92 = field609 + 300;
                var6.field93 = arg0.method238();
                var6.field94 = arg0.method238();
            }
            if ((var7 & 1) != 0) {
                var6.field77 = arg0.method245();
                var6.field58 = 100;
            }
            if ((var7 & 64) != 0) {
                var6.field1044 = class60.method521(arg0.method265(0));
                var6.field40 = var6.field1044.field1560;
                var6.field70 = var6.field1044.field1539;
                var6.field73 = var6.field1044.field1530;
                var6.field74 = var6.field1044.field1544;
                var6.field75 = var6.field1044.field1550;
                var6.field76 = var6.field1044.field1535;
                var6.field90 = var6.field1044.field1532;
            }
            if ((var7 & 32) != 0) {
                var6.field82 = arg0.method240();
                int var10 = arg0.method271(4);
                var6.field86 = var10 >> 16;
                var6.field85 = (var10 & 65535) + field609;
                var6.field83 = 0;
                var6.field84 = 0;
                if (var6.field85 > field609) {
                    var6.field83 = -1;
                }
                if (var6.field82 == 65535) {
                    var6.field82 = -1;
                }
            }
            if ((var7 & 128) != 0) {
                var6.field46 = arg0.method266(2);
                if (var6.field46 == 65535) {
                    var6.field46 = -1;
                }
            }
            if ((var7 & 8) != 0) {
                int var11 = arg0.method267(628);
                if (var11 == 65535) {
                    var11 = -1;
                }
                int var12 = arg0.method259(false);
                if (var6.field41 == var11 && var11 != -1) {
                    int var13 = class71.field1705[var11].field1719;
                    if (var13 == 1) {
                        var6.field42 = 0;
                        var6.field43 = 0;
                        var6.field44 = var12;
                        var6.field45 = 0;
                    }
                    if (var13 == 2) {
                        var6.field45 = 0;
                    }
                } else if (var11 == -1 || var6.field41 == -1 || class71.field1705[var11].field1713 >= class71.field1705[var6.field41].field1713) {
                    var6.field41 = var11;
                    var6.field42 = 0;
                    var6.field43 = 0;
                    var6.field44 = var12;
                    var6.field45 = 0;
                    var6.field59 = var6.field78;
                }
            }
            if ((var7 & 16) != 0) {
                int var14 = arg0.method258(178);
                int var15 = arg0.method257(true);
                var6.method18(0, var15, field609, var14);
                var6.field92 = field609 + 300;
                var6.field93 = arg0.method259(false);
                var6.field94 = arg0.method258(178);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZILjava/lang/String;)V")
    public final void method83(boolean arg0, int arg1, String arg2) {
        this.field444 = arg1;
        this.field594 = arg2;
        this.method121((byte) 8);
        if (this.field296 == null) {
            super.method83(field372, arg1, arg2);
        } else {
            this.field545.method455(9133);
            short var4 = 360;
            short var5 = 200;
            byte var6 = 20;
            this.field386.method176(-35924, var5 / 2 - 26 - var6, 16777215, var4 / 2, "RuneScape is loading - please wait...");
            int var7 = var5 / 2 - 18 - var6;
            this.field254 &= arg0;
            class11.method197(var7, 304, var4 / 2 - 152, 34, (byte) -19, 9179409);
            class11.method197(var7 + 1, 302, var4 / 2 - 151, 32, (byte) -19, 0);
            class11.method196(9179409, var4 / 2 - 150, arg1 * 3, 30, var7 + 2, 3);
            class11.method196(0, arg1 * 3 + (var4 / 2 - 150), 300 - arg1 * 3, 30, var7 + 2, 3);
            this.field386.method176(-35924, var5 / 2 + 5 - var6, 16777215, var4 / 2, arg2);
            this.field545.method456(202, -30916, 171, super.field1502);
            if (this.field611) {
                this.field611 = false;
                if (!this.field365) {
                    this.field546.method456(0, -30916, 0, super.field1502);
                    this.field547.method456(637, -30916, 0, super.field1502);
                }
                this.field543.method456(128, -30916, 0, super.field1502);
                this.field544.method456(202, -30916, 371, super.field1502);
                this.field548.method456(0, -30916, 265, super.field1502);
                this.field549.method456(562, -30916, 265, super.field1502);
                this.field550.method456(128, -30916, 171, super.field1502);
                this.field551.method456(562, -30916, 171, super.field1502);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZIII)I")
    public final int method84(boolean arg0, int arg1, int arg2, int arg3) {
        int var5 = arg3 >> 7;
        int var6 = arg1 >> 7;
        if (var5 >= 0 && var6 >= 0 && var5 <= 103 && var6 <= 103) {
            int var7 = arg2;
            if (arg2 < 3 && (this.field524[1][var5][var6] & 2) == 2) {
                var7 = arg2 + 1;
            }
            int var8 = arg3 & 127;
            int var9 = arg1 & 127;
            int var10 = (128 - var8) * this.field161[var7][var5][var6] + this.field161[var7][var5 + 1][var6] * var8 >> 7;
            if (arg0) {
                this.field497 = this.field246.method238();
            }
            int var11 = (128 - var8) * this.field161[var7][var5][var6 + 1] + this.field161[var7][var5 + 1][var6 + 1] * var8 >> 7;
            return (128 - var9) * var10 + var9 * var11 >> 7;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IZZLSJPORZIF;IIIII)V")
    public final void method85(int arg0, boolean arg1, boolean arg2, class48 arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (this.field438) {
            this.field323 = 32;
        } else {
            this.field323 = 0;
        }
        this.field438 = false;
        if (arg1) {
            for (int var10 = 1; var10 > 0; ++var10) {
            }
        }
        if (arg7 >= arg6 && arg7 < arg6 + 16 && arg8 >= arg4 && arg8 < arg4 + 16) {
            arg3.field1266 -= this.field586 * 4;
            if (arg2) {
                this.field589 = true;
                return;
            }
        } else if (arg7 >= arg6 && arg7 < arg6 + 16 && arg8 >= arg0 + arg4 - 16 && arg8 < arg0 + arg4) {
            arg3.field1266 += this.field586 * 4;
            if (arg2) {
                this.field589 = true;
                return;
            }
        } else {
            if (arg7 < arg6 - this.field323 || arg7 >= arg6 + 16 + this.field323 || arg8 < arg4 + 16 || arg8 >= arg0 + arg4 - 16 || this.field586 <= 0) {
                return;
            }
            int var11 = (arg0 - 32) * arg0 / arg5;
            if (var11 < 8) {
                var11 = 8;
            }
            int var12 = arg8 - arg4 - 16 - var11 / 2;
            int var13 = arg0 - 32 - var11;
            arg3.field1266 = (arg5 - arg0) * var12 / var13;
            if (arg2) {
                this.field589 = true;
            }
            this.field438 = true;
        }
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(B)V")
    public final void method86(byte arg0) {
        for (int var2 = -1; var2 < this.field510; ++var2) {
            int var6;
            if (var2 == -1) {
                var6 = this.field508;
            } else {
                var6 = this.field511[var2];
            }
            class49 var7 = this.field509[var6];
            if (var7 != null && var7.field58 > 0) {
                --var7.field58;
                if (var7.field58 == 0) {
                    var7.field77 = null;
                }
            }
        }
        if (arg0 != -42) {
            this.field193 = 449;
        }
        for (int var3 = 0; var3 < this.field284; ++var3) {
            int var4 = this.field285[var3];
            class37 var5 = this.field283[var4];
            if (var5 != null && var5.field58 > 0) {
                --var5.field58;
                if (var5.field58 == 0) {
                    var5.field77 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(JI)V")
    public final void method87(long arg0, int arg1) {
        if (arg0 != 0L) {
            if (this.field578 >= 100 && this.field532 != 1) {
                this.method125(0, "", "Your friendlist is full. Max of 100 for free users, and 200 for members", (byte) 5);
            } else if (this.field578 >= 200) {
                this.method125(0, "", "Your friendlist is full. Max of 100 for free users, and 200 for members", (byte) 5);
            } else {
                String var4 = class31.method322(true, class31.method319(-602, arg0));
                for (int var5 = 0; var5 < this.field578; ++var5) {
                    if (this.field343[var5] == arg0) {
                        this.method125(0, "", var4 + " is already on your friend list", (byte) 5);
                        return;
                    }
                }
                for (int var6 = 0; var6 < this.field448; ++var6) {
                    if (this.field225[var6] == arg0) {
                        this.method125(0, "", "Please remove " + var4 + " from your ignore list first", (byte) 5);
                        return;
                    }
                }
                if (!var4.equals(field189.field1302)) {
                    this.field419[this.field578] = var4;
                    this.field343[this.field578] = arg0;
                    if (arg1 <= 0) {
                        this.field497 = this.field246.method238();
                    }
                    this.field522[this.field578] = 0;
                    ++this.field578;
                    this.field589 = true;
                    this.field223.method227(22, this.field376);
                    this.field223.method234(979, arg0);
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "n", descriptor = "(I)V")
    public final void method88(int arg0) {
        if (arg0 <= 0) {
            field372 = !field372;
        }
        if (this.field529 == 0) {
            int var2 = super.field1500 / 2 - 80;
            int var3 = super.field1501 / 2 + 20;
            int var14 = var3 + 20;
            if (super.field1516 == 1 && super.field1517 >= var2 - 75 && super.field1517 <= var2 + 75 && super.field1518 >= var14 - 20 && super.field1518 <= var14 + 20) {
                this.field529 = 3;
                this.field160 = 0;
            }
            int var4 = super.field1500 / 2 + 80;
            if (super.field1516 == 1 && super.field1517 >= var4 - 75 && super.field1517 <= var4 + 75 && super.field1518 >= var14 - 20 && super.field1518 <= var14 + 20) {
                this.field174 = "";
                this.field175 = "Enter your username & password.";
                this.field529 = 2;
                this.field160 = 0;
            }
        } else if (this.field529 == 2) {
            int var5 = super.field1501 / 2 - 40;
            int var15 = var5 + 30;
            int var16 = var15 + 25;
            if (super.field1516 == 1 && super.field1518 >= var16 - 15 && super.field1518 < var16) {
                this.field160 = 0;
            }
            var5 = var16 + 15;
            if (super.field1516 == 1 && super.field1518 >= var5 - 15 && super.field1518 < var5) {
                this.field160 = 1;
            }
            var5 += 15;
            int var6 = super.field1500 / 2 - 80;
            int var7 = super.field1501 / 2 + 50;
            int var17 = var7 + 20;
            if (super.field1516 == 1 && super.field1517 >= var6 - 75 && super.field1517 <= var6 + 75 && super.field1518 >= var17 - 20 && super.field1518 <= var17 + 20) {
                this.field363 = 0;
                this.method109(this.field151, this.field152, false);
                if (this.field254) {
                    return;
                }
            }
            int var8 = super.field1500 / 2 + 80;
            if (super.field1516 == 1 && super.field1517 >= var8 - 75 && super.field1517 <= var8 + 75 && super.field1518 >= var17 - 20 && super.field1518 <= var17 + 20) {
                this.field529 = 0;
                this.field151 = "";
                this.field152 = "";
            }
            while (true) {
                while (true) {
                    int var9 = this.method515(this.field172);
                    if (var9 == -1) {
                        return;
                    }
                    boolean var10 = false;
                    for (int var11 = 0; var11 < field425.length(); ++var11) {
                        if (var9 == field425.charAt(var11)) {
                            var10 = true;
                            break;
                        }
                    }
                    if (this.field160 == 0) {
                        if (var9 == 8 && this.field151.length() > 0) {
                            this.field151 = this.field151.substring(0, this.field151.length() - 1);
                        }
                        if (var9 == 9 || var9 == 10 || var9 == 13) {
                            this.field160 = 1;
                        }
                        if (var10) {
                            this.field151 = this.field151 + (char) var9;
                        }
                        if (this.field151.length() > 12) {
                            this.field151 = this.field151.substring(0, 12);
                        }
                    } else if (this.field160 == 1) {
                        if (var9 == 8 && this.field152.length() > 0) {
                            this.field152 = this.field152.substring(0, this.field152.length() - 1);
                        }
                        if (var9 == 9 || var9 == 10 || var9 == 13) {
                            this.field160 = 0;
                        }
                        if (var10) {
                            this.field152 = this.field152 + (char) var9;
                        }
                        if (this.field152.length() > 20) {
                            this.field152 = this.field152.substring(0, 20);
                        }
                    }
                }
            }
        } else {
            if (this.field529 == 3) {
                int var12 = super.field1500 / 2;
                int var13 = super.field1501 / 2 + 50;
                int var18 = var13 + 20;
                if (super.field1516 == 1 && super.field1517 >= var12 - 75 && super.field1517 <= var12 + 75 && super.field1518 >= var18 - 20 && super.field1518 <= var18 + 20) {
                    this.field529 = 0;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "o", descriptor = "(I)V")
    public final void method89(int arg0) {
        byte[] var2 = this.field296.method29("title.dat", (byte[]) null);
        class68 var3 = new class68(var2, this);
        this.field546.method455(9133);
        var3.method576(0, 7, 0);
        this.field547.method455(9133);
        var3.method576(-637, 7, 0);
        while (arg0 >= 0) {
            this.field497 = this.field246.method238();
        }
        this.field543.method455(9133);
        var3.method576(-128, 7, 0);
        this.field544.method455(9133);
        var3.method576(-202, 7, -371);
        this.field545.method455(9133);
        var3.method576(-202, 7, -171);
        this.field548.method455(9133);
        var3.method576(0, 7, -265);
        this.field549.method455(9133);
        var3.method576(-562, 7, -265);
        this.field550.method455(9133);
        var3.method576(-128, 7, -171);
        this.field551.method455(9133);
        var3.method576(-562, 7, -171);
        int[] var4 = new int[var3.field1691];
        for (int var5 = 0; var5 < var3.field1692; ++var5) {
            for (int var10 = 0; var10 < var3.field1691; ++var10) {
                var4[var10] = var3.field1690[var3.field1691 * var5 + (var3.field1691 - var10 - 1)];
            }
            for (int var11 = 0; var11 < var3.field1691; ++var11) {
                var3.field1690[var3.field1691 * var5 + var11] = var4[var11];
            }
        }
        this.field546.method455(9133);
        var3.method576(382, 7, 0);
        this.field547.method455(9133);
        var3.method576(-255, 7, 0);
        this.field543.method455(9133);
        var3.method576(254, 7, 0);
        this.field544.method455(9133);
        var3.method576(180, 7, -371);
        this.field545.method455(9133);
        var3.method576(180, 7, -171);
        this.field548.method455(9133);
        var3.method576(382, 7, -265);
        this.field549.method455(9133);
        var3.method576(-180, 7, -265);
        this.field550.method455(9133);
        var3.method576(254, 7, -171);
        this.field551.method455(9133);
        var3.method576(-180, 7, -171);
        class68 var6 = new class68(this.field296, "logo", 0);
        this.field543.method455(9133);
        var6.method578(382 - var6.field1691 / 2 - 128, 18, 4);
        Object var7 = null;
        Object var8 = null;
        Object var9 = null;
        System.gc();
    }

    @OriginalMember(owner = "client", name = "p", descriptor = "(I)V")
    public final void method90(int arg0) {
        int var2 = 5;
        this.field357[8] = 0;
        int var3 = 0;
        if (arg0 != 0) {
            for (int var4 = 1; var4 > 0; ++var4) {
            }
        }
        while (this.field357[8] == 0) {
            String var5 = "Unknown problem";
            this.method83(field372, 20, "Connecting to web server");
            try {
                DataInputStream var6 = this.method167("crc" + (int) (Math.random() * 9.9999999E7D) + "-" + 330);
                class24 var7 = new class24(0, new byte[40]);
                var6.readFully(var7.field831, 0, 40);
                var6.close();
                for (int var8 = 0; var8 < 9; ++var8) {
                    this.field357[var8] = var7.method243();
                }
                int var9 = var7.method243();
                int var10 = 1234;
                for (int var11 = 0; var11 < 9; ++var11) {
                    var10 = (var10 << 1) + this.field357[var11];
                }
                if (var9 != var10) {
                    var5 = "checksum problem";
                    this.field357[8] = 0;
                }
            } catch (EOFException var14) {
                var5 = "EOF problem";
                this.field357[8] = 0;
            } catch (IOException var15) {
                var5 = "connection problem";
                this.field357[8] = 0;
            } catch (Exception var16) {
                var5 = "logic problem";
                this.field357[8] = 0;
                if (!signlink.reporterror) {
                    return;
                }
            }
            if (this.field357[8] == 0) {
                ++var3;
                for (int var12 = var2; var12 > 0; --var12) {
                    if (var3 >= 10) {
                        this.method83(field372, 10, "Game updated - please reload page");
                        var12 = 10;
                    } else {
                        this.method83(field372, 10, var5 + " - Will retry in " + var12 + " secs.");
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
                this.field273 = !this.field273;
            }
        }
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(II)V")
    public final void method91(int arg0, int arg1) {
        class38 var3 = this.field290[this.field303][arg0][arg1];
        if (var3 == null) {
            this.field530.method346(this.field303, arg0, arg1);
        } else {
            int var4 = -99999999;
            class47 var5 = null;
            for (class47 var6 = (class47) var3.method382(); var6 != null; var6 = (class47) var3.method384((byte) -96)) {
                class46 var11 = class46.method438(var6.field1211);
                int var12 = var11.field1189;
                if (var11.field1196) {
                    var12 = (var6.field1210 + 1) * var12;
                }
                if (var12 > var4) {
                    var4 = var12;
                    var5 = var6;
                }
            }
            var3.method380(var5, false);
            class47 var7 = null;
            class47 var8 = null;
            for (class47 var9 = (class47) var3.method382(); var9 != null; var9 = (class47) var3.method384((byte) -96)) {
                if (var5.field1211 != var9.field1211 && var7 == null) {
                    var7 = var9;
                }
                if (var5.field1211 != var9.field1211 && var7.field1211 != var9.field1211 && var8 == null) {
                    var8 = var9;
                }
            }
            int var10 = (arg1 << 7) + arg0 + 1610612736;
            this.field530.method332(var7, this.field303, this.method84(false, arg1 * 128 + 64, this.field303, arg0 * 128 + 64), var10, arg1, var5, true, var8, arg0);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IILWHKCNEXD;II)V")
    public final void method92(int arg0, int arg1, class60 arg2, int arg3, int arg4) {
        if (this.field203 < 400) {
            if (arg2.field1549 != null) {
                arg2 = arg2.method518(-13525);
            }
            if (arg2 != null) {
                if (arg2.field1545) {
                    String var6 = arg2.field1548;
                    while (arg0 >= 0) {
                        this.method116();
                    }
                    if (arg2.field1538 != 0) {
                        var6 = var6 + method57(arg2.field1538, field189.field1301, true) + " (level-" + arg2.field1538 + ")";
                    }
                    if (this.field482 == 1) {
                        this.field286[this.field203] = "Use " + this.field486 + " with @yel@" + var6;
                        this.field562[this.field203] = 124;
                        this.field563[this.field203] = arg3;
                        this.field560[this.field203] = arg1;
                        this.field561[this.field203] = arg4;
                        ++this.field203;
                    } else {
                        if (this.field217 == 1) {
                            if ((this.field219 & 2) == 2) {
                                this.field286[this.field203] = this.field220 + " @yel@" + var6;
                                this.field562[this.field203] = 53;
                                this.field563[this.field203] = arg3;
                                this.field560[this.field203] = arg1;
                                this.field561[this.field203] = arg4;
                                ++this.field203;
                                return;
                            }
                        } else {
                            if (arg2.field1564 != null) {
                                for (int var7 = 4; var7 >= 0; --var7) {
                                    if (arg2.field1564[var7] != null && !arg2.field1564[var7].equalsIgnoreCase("attack")) {
                                        this.field286[this.field203] = arg2.field1564[var7] + " @yel@" + var6;
                                        if (var7 == 0) {
                                            this.field562[this.field203] = 17;
                                        }
                                        if (var7 == 1) {
                                            this.field562[this.field203] = 507;
                                        }
                                        if (var7 == 2) {
                                            this.field562[this.field203] = 215;
                                        }
                                        if (var7 == 3) {
                                            this.field562[this.field203] = 919;
                                        }
                                        if (var7 == 4) {
                                            this.field562[this.field203] = 216;
                                        }
                                        this.field563[this.field203] = arg3;
                                        this.field560[this.field203] = arg1;
                                        this.field561[this.field203] = arg4;
                                        ++this.field203;
                                    }
                                }
                            }
                            if (arg2.field1564 != null) {
                                for (int var8 = 4; var8 >= 0; --var8) {
                                    if (arg2.field1564[var8] != null && arg2.field1564[var8].equalsIgnoreCase("attack")) {
                                        short var9 = 0;
                                        if (arg2.field1538 > field189.field1301) {
                                            var9 = 2000;
                                        }
                                        this.field286[this.field203] = arg2.field1564[var8] + " @yel@" + var6;
                                        if (var8 == 0) {
                                            this.field562[this.field203] = var9 + 17;
                                        }
                                        if (var8 == 1) {
                                            this.field562[this.field203] = var9 + 507;
                                        }
                                        if (var8 == 2) {
                                            this.field562[this.field203] = var9 + 215;
                                        }
                                        if (var8 == 3) {
                                            this.field562[this.field203] = var9 + 919;
                                        }
                                        if (var8 == 4) {
                                            this.field562[this.field203] = var9 + 216;
                                        }
                                        this.field563[this.field203] = arg3;
                                        this.field560[this.field203] = arg1;
                                        this.field561[this.field203] = arg4;
                                        ++this.field203;
                                    }
                                }
                            }
                            this.field286[this.field203] = "Examine @yel@" + var6;
                            this.field562[this.field203] = 1159;
                            this.field563[this.field203] = arg3;
                            this.field560[this.field203] = arg1;
                            this.field561[this.field203] = arg4;
                            ++this.field203;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "q", descriptor = "(I)V")
    public final void method93(int arg0) {
        if (this.field482 == 0 && this.field217 == 0) {
            this.field286[this.field203] = "Walk here";
            this.field562[this.field203] = 797;
            this.field560[this.field203] = super.field1510;
            this.field561[this.field203] = super.field1511;
            ++this.field203;
        }
        int var2 = -1;
        if (arg0 != 0) {
            this.field290 = null;
        }
        for (int var3 = 0; var3 < class67.field1676; ++var3) {
            int var4 = class67.field1677[var3];
            int var5 = var4 & 127;
            int var6 = var4 >> 7 & 127;
            int var7 = var4 >> 29 & 3;
            int var8 = var4 >> 14 & 32767;
            if (var2 != var4) {
                var2 = var4;
                if (var7 == 2 && this.field530.method355(this.field303, var5, var6, var4) >= 0) {
                    class41 var9 = class41.method398(var8);
                    if (var9.field1070 != null) {
                        var9 = var9.method402(228);
                    }
                    if (var9 == null) {
                        continue;
                    }
                    if (this.field482 == 1) {
                        this.field286[this.field203] = "Use " + this.field486 + " with @cya@" + var9.field1085;
                        this.field562[this.field203] = 748;
                        this.field563[this.field203] = var4;
                        this.field560[this.field203] = var5;
                        this.field561[this.field203] = var6;
                        ++this.field203;
                    } else if (this.field217 == 1) {
                        if ((this.field219 & 4) == 4) {
                            this.field286[this.field203] = this.field220 + " @cya@" + var9.field1085;
                            this.field562[this.field203] = 749;
                            this.field563[this.field203] = var4;
                            this.field560[this.field203] = var5;
                            this.field561[this.field203] = var6;
                            ++this.field203;
                        }
                    } else {
                        if (var9.field1081 != null) {
                            for (int var10 = 4; var10 >= 0; --var10) {
                                if (var9.field1081[var10] != null) {
                                    this.field286[this.field203] = var9.field1081[var10] + " @cya@" + var9.field1085;
                                    if (var10 == 0) {
                                        this.field562[this.field203] = 314;
                                    }
                                    if (var10 == 1) {
                                        this.field562[this.field203] = 217;
                                    }
                                    if (var10 == 2) {
                                        this.field562[this.field203] = 139;
                                    }
                                    if (var10 == 3) {
                                        this.field562[this.field203] = 693;
                                    }
                                    if (var10 == 4) {
                                        this.field562[this.field203] = 1963;
                                    }
                                    this.field563[this.field203] = var4;
                                    this.field560[this.field203] = var5;
                                    this.field561[this.field203] = var6;
                                    ++this.field203;
                                }
                            }
                        }
                        this.field286[this.field203] = "Examine @cya@" + var9.field1085;
                        this.field562[this.field203] = 1619;
                        this.field563[this.field203] = var9.field1082 << 14;
                        this.field560[this.field203] = var5;
                        this.field561[this.field203] = var6;
                        ++this.field203;
                    }
                }
                if (var7 == 1) {
                    class37 var11 = this.field283[var8];
                    if (var11.field1044.field1560 == 1 && (var11.field51 & 127) == 64 && (var11.field52 & 127) == 64) {
                        for (int var12 = 0; var12 < this.field284; ++var12) {
                            class37 var15 = this.field283[this.field285[var12]];
                            if (var15 != null && var11 != var15 && var15.field1044.field1560 == 1 && var11.field51 == var15.field51 && var11.field52 == var15.field52) {
                                this.method92(-797, var5, var15.field1044, this.field285[var12], var6);
                            }
                        }
                        for (int var13 = 0; var13 < this.field510; ++var13) {
                            class49 var14 = this.field509[this.field511[var13]];
                            if (var14 != null && var11.field51 == var14.field51 && var11.field52 == var14.field52) {
                                this.method39(var5, (byte) 96, this.field511[var13], var6, var14);
                            }
                        }
                    }
                    this.method92(-797, var5, var11.field1044, var8, var6);
                }
                if (var7 == 0) {
                    class49 var16 = this.field509[var8];
                    if ((var16.field51 & 127) == 64 && (var16.field52 & 127) == 64) {
                        for (int var17 = 0; var17 < this.field284; ++var17) {
                            class37 var20 = this.field283[this.field285[var17]];
                            if (var20 != null && var20.field1044.field1560 == 1 && var16.field51 == var20.field51 && var16.field52 == var20.field52) {
                                this.method92(-797, var5, var20.field1044, this.field285[var17], var6);
                            }
                        }
                        for (int var18 = 0; var18 < this.field510; ++var18) {
                            class49 var19 = this.field509[this.field511[var18]];
                            if (var19 != null && var16 != var19 && var16.field51 == var19.field51 && var16.field52 == var19.field52) {
                                this.method39(var5, (byte) 96, this.field511[var18], var6, var19);
                            }
                        }
                    }
                    this.method39(var5, (byte) 96, var8, var6, var16);
                }
                if (var7 == 3) {
                    class38 var21 = this.field290[this.field303][var5][var6];
                    if (var21 != null) {
                        for (class47 var22 = (class47) var21.method383(5); var22 != null; var22 = (class47) var21.method385(-552)) {
                            class46 var23 = class46.method438(var22.field1211);
                            if (this.field482 == 1) {
                                this.field286[this.field203] = "Use " + this.field486 + " with @lre@" + var23.field1164;
                                this.field562[this.field203] = 567;
                                this.field563[this.field203] = var22.field1211;
                                this.field560[this.field203] = var5;
                                this.field561[this.field203] = var6;
                                ++this.field203;
                            } else if (this.field217 == 1) {
                                if ((this.field219 & 1) == 1) {
                                    this.field286[this.field203] = this.field220 + " @lre@" + var23.field1164;
                                    this.field562[this.field203] = 862;
                                    this.field563[this.field203] = var22.field1211;
                                    this.field560[this.field203] = var5;
                                    this.field561[this.field203] = var6;
                                    ++this.field203;
                                }
                            } else {
                                for (int var24 = 4; var24 >= 0; --var24) {
                                    if (var23.field1193 != null && var23.field1193[var24] != null) {
                                        this.field286[this.field203] = var23.field1193[var24] + " @lre@" + var23.field1164;
                                        if (var24 == 0) {
                                            this.field562[this.field203] = 464;
                                        }
                                        if (var24 == 1) {
                                            this.field562[this.field203] = 6;
                                        }
                                        if (var24 == 2) {
                                            this.field562[this.field203] = 263;
                                        }
                                        if (var24 == 3) {
                                            this.field562[this.field203] = 348;
                                        }
                                        if (var24 == 4) {
                                            this.field562[this.field203] = 482;
                                        }
                                        this.field563[this.field203] = var22.field1211;
                                        this.field560[this.field203] = var5;
                                        this.field561[this.field203] = var6;
                                        ++this.field203;
                                    } else if (var24 == 2) {
                                        this.field286[this.field203] = "Take @lre@" + var23.field1164;
                                        this.field562[this.field203] = 263;
                                        this.field563[this.field203] = var22.field1211;
                                        this.field560[this.field203] = var5;
                                        this.field561[this.field203] = var6;
                                        ++this.field203;
                                    }
                                }
                                this.field286[this.field203] = "Examine @lre@" + var23.field1164;
                                this.field562[this.field203] = 1334;
                                this.field563[this.field203] = var22.field1211;
                                this.field560[this.field203] = var5;
                                this.field561[this.field203] = var6;
                                ++this.field203;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(JI)V")
    public final void method94(long arg0, int arg1) {
        if (arg0 != 0L) {
            for (int var4 = 0; var4 < this.field448; ++var4) {
                if (this.field225[var4] == arg0) {
                    --this.field448;
                    this.field589 = true;
                    for (int var5 = var4; var5 < this.field448; ++var5) {
                        this.field225[var5] = this.field225[var5 + 1];
                    }
                    this.field223.method227(33, this.field376);
                    this.field223.method234(979, arg0);
                    break;
                }
            }
            if (arg1 != 0) {
                this.field457 = -190;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;IZI)LBYZSQZUF;")
    public final class7 method95(int arg0, String arg1, String arg2, int arg3, boolean arg4, int arg5) {
        byte[] var7 = null;
        int var8 = 5;
        try {
            if (this.field150[0] != null) {
                var7 = this.field150[0].method427(this.field224, arg5);
            }
        } catch (Exception var30) {
        }
        if (var7 != null) {
            this.field243.reset();
            this.field243.update(var7);
            int var9 = (int) this.field243.getValue();
            if (arg3 != var9) {
                var7 = null;
            }
        }
        if (var7 != null) {
            return new class7(-7298, var7);
        } else {
            int var11 = 0;
            while (var7 == null) {
                String var12 = "Unknown error";
                this.method83(field372, arg0, "Requesting " + arg2);
                Object var13 = null;
                try {
                    int var14 = 0;
                    DataInputStream var15 = this.method167(arg1 + arg3);
                    byte[] var16 = new byte[6];
                    var15.readFully(var16, 0, 6);
                    class24 var17 = new class24(0, var16);
                    var17.field832 = 3;
                    int var18 = var17.method242() + 6;
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
                            this.method83(field372, arg0, "Loading " + arg2 + " - " + var23 + "%");
                        }
                        var14 = var23;
                    }
                    var15.close();
                    try {
                        if (this.field150[0] != null) {
                            this.field150[0].method428((byte) -43, arg5, var7.length, var7);
                        }
                    } catch (Exception var29) {
                        this.field150[0] = null;
                    }
                    if (var7 != null) {
                        this.field243.reset();
                        this.field243.update(var7);
                        int var24 = (int) this.field243.getValue();
                        if (arg3 != var24) {
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
                            this.method83(field372, arg0, "Game updated - please reload page");
                            var26 = 10;
                        } else {
                            this.method83(field372, arg0, var12 + " - Retrying in " + var26);
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
                    this.field273 = !this.field273;
                }
            }
            class7 var27 = new class7(-7298, var7);
            if (!arg4) {
                field252 = this.field569.method541();
            }
            return var27;
        }
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(I)V")
    public final void method96(int arg0) {
        if (arg0 != 0) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        this.field611 = true;
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(Z)V")
    public final void method97(boolean arg0) {
        Graphics var2 = this.method44((byte) 2).getGraphics();
        var2.setColor(Color.black);
        var2.fillRect(0, 0, 765, 503);
        this.field254 &= arg0;
        this.method514(1, -503);
        if (this.field371) {
            this.field365 = false;
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
        if (this.field542) {
            this.field365 = false;
            var2.setFont(new Font("Helvetica", 1, 20));
            var2.setColor(Color.white);
            var2.drawString("Error - unable to load game!", 50, 50);
            var2.drawString("To play RuneScape make sure you play from", 50, 100);
            var2.drawString("http://www.runescape.com", 50, 150);
        }
        if (this.field588) {
            this.field365 = false;
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

    @OriginalMember(owner = "client", name = "run", descriptor = "()V")
    public final void run() {
        if (this.field272) {
            this.method161(7);
        } else {
            super.run();
        }
    }

    @OriginalMember(owner = "client", name = "r", descriptor = "(I)V")
    public final void method98(int arg0) {
        class36 var2 = (class36) this.field491.method382();
        if (arg0 >= 0) {
            this.field566 = !this.field566;
        }
        while (var2 != null) {
            if (this.field303 == var2.field1019 && field609 <= var2.field1033) {
                if (field609 >= var2.field1032) {
                    if (var2.field1016 > 0) {
                        class37 var3 = this.field283[var2.field1016 - 1];
                        if (var3 != null && var3.field51 >= 0 && var3.field51 < 13312 && var3.field52 >= 0 && var3.field52 < 13312) {
                            var2.method376(var3.field51, var3.field52, 8, field609, this.method84(false, var3.field52, var2.field1019, var3.field51) - var2.field1030);
                        }
                    }
                    if (var2.field1016 < 0) {
                        int var4 = -var2.field1016 - 1;
                        class49 var5;
                        if (this.field404 == var4) {
                            var5 = field189;
                        } else {
                            var5 = this.field509[var4];
                        }
                        if (var5 != null && var5.field51 >= 0 && var5.field51 < 13312 && var5.field52 >= 0 && var5.field52 < 13312) {
                            var2.method376(var5.field51, var5.field52, 8, field609, this.method84(false, var5.field52, var2.field1019, var5.field51) - var2.field1030);
                        }
                    }
                    var2.method377(this.field228, this.field607);
                    this.field530.method336((int) var2.field1024, false, -1, 60, (int) var2.field1022, var2, this.field303, (int) var2.field1023, var2.field1025, false);
                }
            } else {
                var2.method540();
            }
            var2 = (class36) this.field491.method384((byte) -96);
        }
    }

    @OriginalMember(owner = "client", name = "s", descriptor = "(I)V")
    public final void method99(int arg0) {
        signlink.midiplay = false;
        signlink.midifade = 0;
        signlink.midi = "stop";
        if (arg0 != -13016) {
            this.field281 = this.field569.method541();
        }
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(B)V")
    public final void method100(byte arg0) {
        if (arg0 == 53) {
            for (int var2 = -1; var2 < this.field510; ++var2) {
                int var3;
                if (var2 == -1) {
                    var3 = this.field508;
                } else {
                    var3 = this.field511[var2];
                }
                class49 var4 = this.field509[var3];
                if (var4 != null) {
                    this.method145(var4, (byte) 42, 1);
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(IILIMUIZRAF;)V")
    private final void method101(int arg0, int arg1, class24 arg2) {
        this.field480 = 0;
        this.field512 = 0;
        int var4 = 64 / arg0;
        this.method104(arg2, arg1, (byte) -115);
        this.method138(-857, arg2, arg1);
        this.method157(arg2, arg1, this.field255);
        this.method59(811, arg2, arg1);
        for (int var5 = 0; var5 < this.field480; ++var5) {
            int var7 = this.field481[var5];
            if (field609 != this.field509[var7].field81) {
                this.field509[var7] = null;
            }
        }
        if (arg2.field832 != arg1) {
            signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg2.field832 + " psize:" + arg1);
            throw new RuntimeException("eek");
        } else {
            for (int var6 = 0; var6 < this.field510; ++var6) {
                if (this.field509[this.field511[var6]] == null) {
                    signlink.reporterror(this.field151 + " null entry in pl list - pos:" + var6 + " size:" + this.field510);
                    throw new RuntimeException("eek");
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IB)V")
    public final void method102(int arg0, byte arg1) {
        signlink.wavevol = arg0;
        if (arg1 != 6) {
            for (int var3 = 1; var3 > 0; ++var3) {
            }
        }
    }

    @OriginalMember(owner = "client", name = "t", descriptor = "(I)V")
    public final void method103(int arg0) {
        if (arg0 != -9516) {
            this.field370 = -429;
        }
        if (this.field203 >= 2 || this.field482 != 0 || this.field217 != 0) {
            String var2;
            if (this.field482 == 1 && this.field203 < 2) {
                var2 = "Use " + this.field486 + " with...";
            } else if (this.field217 == 1 && this.field203 < 2) {
                var2 = this.field220 + "...";
            } else {
                var2 = this.field286[this.field203 - 1];
            }
            if (this.field203 > 2) {
                var2 = var2 + "@whi@ / " + (this.field203 - 2) + " more options";
            }
            this.field386.method185(15, 4, var2, true, 16777215, 36526, field609 / 1000);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LIMUIZRAF;IB)V")
    private final void method104(class24 arg0, int arg1, byte arg2) {
        arg0.method248((byte) 7);
        int var4 = arg0.method249(1, (byte) -80);
        if (var4 != 0) {
            int var5 = arg0.method249(2, (byte) -80);
            if (arg2 != -115) {
                this.field169 = !this.field169;
            }
            if (var5 == 0) {
                this.field513[this.field512++] = this.field508;
            } else if (var5 == 1) {
                int var6 = arg0.method249(3, (byte) -80);
                field189.method20(false, var6, (byte) 0);
                int var7 = arg0.method249(1, (byte) -80);
                if (var7 == 1) {
                    this.field513[this.field512++] = this.field508;
                }
            } else if (var5 == 2) {
                int var8 = arg0.method249(3, (byte) -80);
                field189.method20(true, var8, (byte) 0);
                int var9 = arg0.method249(3, (byte) -80);
                field189.method20(true, var9, (byte) 0);
                int var10 = arg0.method249(1, (byte) -80);
                if (var10 == 1) {
                    this.field513[this.field512++] = this.field508;
                }
            } else if (var5 == 3) {
                int var11 = arg0.method249(7, (byte) -80);
                this.field303 = arg0.method249(2, (byte) -80);
                int var12 = arg0.method249(1, (byte) -80);
                int var13 = arg0.method249(7, (byte) -80);
                int var14 = arg0.method249(1, (byte) -80);
                if (var14 == 1) {
                    this.field513[this.field512++] = this.field508;
                }
                field189.method19(var13, var12 == 1, -612, var11);
            }
        }
    }

    @OriginalMember(owner = "client", name = "h", descriptor = "(B)V")
    public static final void method105(byte arg0) {
        class34.field949 = true;
        class58.field1467 = true;
        field318 = true;
        class42.field1103 = true;
        class41.field1053 = true;
        if (arg0 == -19) {
            ;
        }
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(Z)V")
    public final void method106(boolean arg0) {
        class13 var2 = (class13) this.field619.method382();
        this.field254 &= arg0;
        while (var2 != null) {
            if (this.field303 == var2.field673 && !var2.field677) {
                if (field609 >= var2.field678) {
                    var2.method209(true, this.field607);
                    if (var2.field677) {
                        var2.method540();
                    } else {
                        this.field530.method336(var2.field676, false, -1, 60, var2.field674, var2, var2.field673, var2.field675, 0, false);
                    }
                }
            } else {
                var2.method540();
            }
            var2 = (class13) this.field619.method384((byte) -96);
        }
    }

    @OriginalMember(owner = "client", name = "u", descriptor = "(I)V")
    public final void method107(int arg0) {
        if (this.field582 > 1) {
            --this.field582;
        }
        if (this.field500 > 0) {
            --this.field500;
        }
        for (int var2 = 0; var2 < 5 && this.method123((byte) 74); ++var2) {
        }
        if (this.field254) {
            Object var3 = this.field407.field1591;
            synchronized (this.field407.field1591) {
                if (!field170) {
                    this.field407.field1593 = 0;
                } else if (super.field1516 != 0 || this.field407.field1593 >= 40) {
                    this.field223.method227(42, this.field376);
                    this.field223.method228(0);
                    int var4 = this.field223.field832;
                    int var5 = 0;
                    for (int var6 = 0; var6 < this.field407.field1593 && var4 - this.field223.field832 < 240; ++var6) {
                        ++var5;
                        int var7 = this.field407.field1592[var6];
                        if (var7 < 0) {
                            var7 = 0;
                        } else if (var7 > 502) {
                            var7 = 502;
                        }
                        int var8 = this.field407.field1594[var6];
                        if (var8 < 0) {
                            var8 = 0;
                        } else if (var8 > 764) {
                            var8 = 764;
                        }
                        int var9 = var7 * 765 + var8;
                        if (this.field407.field1592[var6] == -1 && this.field407.field1594[var6] == -1) {
                            var8 = -1;
                            var7 = -1;
                            var9 = 524287;
                        }
                        if (this.field393 == var8 && this.field394 == var7) {
                            if (this.field353 < 2047) {
                                ++this.field353;
                            }
                        } else {
                            int var10 = var8 - this.field393;
                            this.field393 = var8;
                            int var11 = var7 - this.field394;
                            this.field394 = var7;
                            if (this.field353 < 8 && var10 >= -32 && var10 <= 31 && var11 >= -32 && var11 <= 31) {
                                var10 += 32;
                                var11 += 32;
                                this.field223.method229((this.field353 << 12) + (var10 << 6) + var11);
                                this.field353 = 0;
                            } else if (this.field353 < 8) {
                                this.field223.method231((this.field353 << 19) + 8388608 + var9);
                                this.field353 = 0;
                            } else {
                                this.field223.method232((this.field353 << 19) + -1073741824 + var9);
                                this.field353 = 0;
                            }
                        }
                    }
                    this.field223.method237(this.field191, this.field223.field832 - var4);
                    if (var5 >= this.field407.field1593) {
                        this.field407.field1593 = 0;
                    } else {
                        this.field407.field1593 -= var5;
                        for (int var12 = 0; var12 < this.field407.field1593; ++var12) {
                            this.field407.field1594[var12] = this.field407.field1594[var5 + var12];
                            this.field407.field1592[var12] = this.field407.field1592[var5 + var12];
                        }
                    }
                }
            }
            if (super.field1516 != 0) {
                long var13 = (super.field1519 - this.field367) / 50L;
                if (var13 > 4095L) {
                    var13 = 4095L;
                }
                this.field367 = super.field1519;
                int var15 = super.field1518;
                if (var15 < 0) {
                    var15 = 0;
                } else if (var15 > 502) {
                    var15 = 502;
                }
                int var16 = super.field1517;
                if (var16 < 0) {
                    var16 = 0;
                } else if (var16 > 764) {
                    var16 = 764;
                }
                int var17 = var15 * 765 + var16;
                byte var18 = 0;
                if (super.field1516 == 2) {
                    var18 = 1;
                }
                int var19 = (int) var13;
                this.field223.method227(185, this.field376);
                this.field223.method232((var18 << 19) + (var19 << 20) + var17);
            }
            if (this.field473 > 0) {
                --this.field473;
            }
            if (super.field1520[1] == 1 || super.field1520[2] == 1 || super.field1520[3] == 1 || super.field1520[4] == 1) {
                this.field474 = true;
            }
            if (this.field474 && this.field473 <= 0) {
                this.field473 = 20;
                this.field474 = false;
                this.field223.method227(29, this.field376);
                this.field223.method264(this.field413, 4);
                this.field223.method229(this.field412);
            }
            if (super.field1507 && !this.field523) {
                this.field523 = true;
                this.field223.method227(239, this.field376);
                this.field223.method228(1);
            }
            if (!super.field1507 && this.field523) {
                this.field523 = false;
                this.field223.method227(239, this.field376);
                this.field223.method228(0);
            }
            this.method60(this.field193);
            this.method159(this.field295);
            this.method154(984);
            ++field321;
            if (field321 > 120) {
                field321 = 0;
                this.field223.method227(24, this.field376);
                this.field223.method229(20610);
            }
            ++this.field498;
            if (this.field498 > 750) {
                this.method64(true);
            }
            this.method100((byte) 53);
            this.method144(0);
            this.method86((byte) -42);
            ++field411;
            if (field411 > 1891) {
                field411 = 0;
                this.field223.method227(226, this.field376);
                this.field223.method228(0);
                int var20 = this.field223.field832;
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field223.method228(173);
                }
                this.field223.method229(47741);
                this.field223.method229(19406);
                this.field223.method228((int) (Math.random() * 256.0D));
                this.field223.method228(255);
                this.field223.method229(61428);
                this.field223.method229(35709);
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field223.method228(79);
                }
                this.field223.method229(26314);
                this.field223.method229((int) (Math.random() * 65536.0D));
                this.field223.method237(this.field191, this.field223.field832 - var20);
            }
            ++this.field607;
            if (this.field271 != 0) {
                this.field270 += 20;
                if (this.field270 >= 400) {
                    this.field271 = 0;
                }
            }
            if (this.field156 != 0) {
                ++this.field153;
                if (this.field153 >= 15) {
                    if (this.field156 == 2) {
                        this.field589 = true;
                    }
                    if (this.field156 == 3) {
                        this.field212 = true;
                    }
                    this.field156 = 0;
                }
            }
            if (this.field451 != 0) {
                ++this.field567;
                if (super.field1510 > this.field452 + 5 || super.field1510 < this.field452 - 5 || super.field1511 > this.field453 + 5 || super.field1511 < this.field453 - 5) {
                    this.field534 = true;
                }
                if (super.field1509 == 0) {
                    if (this.field451 == 2) {
                        this.field589 = true;
                    }
                    if (this.field451 == 3) {
                        this.field212 = true;
                    }
                    this.field451 = 0;
                    if (this.field534 && this.field567 >= 5) {
                        this.field581 = -1;
                        this.method168(7);
                        if (this.field581 == this.field449 && this.field580 != this.field450) {
                            class48 var21 = class48.field1219[this.field449];
                            byte var22 = 0;
                            if (this.field239 == 1 && var21.field1268 == 206) {
                                var22 = 1;
                            }
                            if (var21.field1256[this.field580] <= 0) {
                                var22 = 0;
                            }
                            if (var21.field1270) {
                                int var23 = this.field450;
                                int var24 = this.field580;
                                var21.field1256[var24] = var21.field1256[var23];
                                var21.field1218[var24] = var21.field1218[var23];
                                var21.field1256[var23] = -1;
                                var21.field1218[var23] = 0;
                            } else if (var22 == 1) {
                                int var25 = this.field450;
                                int var26 = this.field580;
                                while (var25 != var26) {
                                    if (var25 > var26) {
                                        var21.method447(var25, false, var25 - 1);
                                        --var25;
                                    } else if (var25 < var26) {
                                        var21.method447(var25, false, var25 + 1);
                                        ++var25;
                                    }
                                }
                            } else {
                                var21.method447(this.field450, false, this.field580);
                            }
                            this.field223.method227(3, this.field376);
                            this.field223.method263(this.field370, this.field449);
                            this.field223.method264(this.field450, 4);
                            this.field223.method263(this.field370, this.field580);
                            this.field223.method255(0, var22);
                        }
                    } else if ((this.field366 == 1 || this.method122((byte) -101, this.field203 - 1)) && this.field203 > 2) {
                        this.method69(13755);
                    } else if (this.field203 > 0) {
                        this.method115(this.field203 - 1, -390);
                    }
                    this.field153 = 10;
                    super.field1516 = 0;
                }
            }
            if (class34.field983 != -1) {
                int var27 = class34.field983;
                int var28 = class34.field984;
                boolean var29 = this.method78(0, field189.field87[0], field189.field88[0], 0, true, true, 0, var28, var27, 0, 0, 0);
                class34.field983 = -1;
                if (var29) {
                    this.field268 = super.field1517;
                    this.field269 = super.field1518;
                    this.field271 = 1;
                    this.field270 = 0;
                }
            }
            if (super.field1516 == 1 && this.field241 != null) {
                this.field241 = null;
                this.field212 = true;
                super.field1516 = 0;
            }
            this.method137(-39297);
            this.method156(true);
            this.method171(this.field374);
            this.method72(0);
            if (super.field1509 == 1 || super.field1516 == 1) {
                ++this.field586;
            }
            if (this.field226 == 2) {
                this.method140(752);
            }
            if (this.field226 == 2 && this.field605) {
                this.method134(0);
            }
            for (int var30 = 0; var30 < 5; ++var30) {
                int var10002 = this.field314[var30]++;
            }
            this.method141(this.field169);
            ++field163;
            if (field163 > 97) {
                field163 = 0;
                this.field223.method227(207, this.field376);
            }
            ++super.field1508;
            if (arg0 != 0) {
                field626 = !field626;
            }
            if (super.field1508 > 4500) {
                this.field500 = 250;
                super.field1508 -= 500;
                this.field223.method227(41, this.field376);
            }
            ++this.field157;
            if (this.field157 > 500) {
                this.field157 = 0;
                int var31 = (int) (Math.random() * 8.0D);
                if ((var31 & 1) == 1) {
                    this.field501 += this.field502;
                }
                if ((var31 & 2) == 2) {
                    this.field301 += this.field302;
                }
                if ((var31 & 4) == 4) {
                    this.field599 += this.field600;
                }
            }
            if (this.field501 < -50) {
                this.field502 = 2;
            }
            if (this.field501 > 50) {
                this.field502 = -2;
            }
            if (this.field301 < -55) {
                this.field302 = 2;
            }
            if (this.field301 > 55) {
                this.field302 = -2;
            }
            if (this.field599 < -40) {
                this.field600 = 1;
            }
            if (this.field599 > 40) {
                this.field600 = -1;
            }
            ++this.field610;
            if (this.field610 > 500) {
                this.field610 = 0;
                int var32 = (int) (Math.random() * 8.0D);
                if ((var32 & 1) == 1) {
                    this.field319 += this.field320;
                }
                if ((var32 & 2) == 2) {
                    this.field287 += this.field288;
                }
            }
            if (this.field319 < -60) {
                this.field320 = 2;
            }
            if (this.field319 > 60) {
                this.field320 = -2;
            }
            if (this.field287 < -20) {
                this.field288 = 1;
            }
            if (this.field287 > 10) {
                this.field288 = -1;
            }
            ++this.field499;
            if (this.field499 > 50) {
                this.field223.method227(184, this.field376);
            }
            try {
                if (this.field396 != null && this.field223.field832 > 0) {
                    this.field396.method224(0, (byte) 83, this.field223.field831, this.field223.field832);
                    this.field223.field832 = 0;
                    this.field499 = 0;
                }
            } catch (IOException var34) {
                this.method64(true);
            } catch (Exception var35) {
                this.method166(true);
            }
        }
    }

    @OriginalMember(owner = "client", name = "i", descriptor = "(B)V")
    public final void method108(byte arg0) {
        if (this.field617 == null) {
            this.method169(this.field417);
            super.field1503 = null;
            this.field543 = null;
            this.field544 = null;
            this.field545 = null;
            this.field546 = null;
            this.field547 = null;
            this.field548 = null;
            this.field549 = null;
            this.field550 = null;
            this.field551 = null;
            this.field617 = new class50(96, 13856, 479, this.method44((byte) 2));
            this.field615 = new class50(156, 13856, 172, this.method44((byte) 2));
            class11.method194(-27727);
            this.field464.method13(0, 0, 4);
            this.field614 = new class50(261, 13856, 190, this.method44((byte) 2));
            this.field616 = new class50(334, 13856, 512, this.method44((byte) 2));
            class11.method194(-27727);
            this.field165 = new class50(50, 13856, 496, this.method44((byte) 2));
            this.field166 = new class50(37, 13856, 269, this.method44((byte) 2));
            if (this.field402 == arg0) {
                boolean var2 = false;
            } else {
                field252 = this.field569.method541();
            }
            this.field167 = new class50(45, 13856, 249, this.method44((byte) 2));
            this.field611 = true;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)V")
    public final void method109(String arg0, String arg1, boolean arg2) {
        signlink.errorname = arg0;
        try {
            if (!arg2) {
                this.field174 = "";
                this.field175 = "Connecting to server...";
                this.method130(true, 887);
            }
            this.field396 = new class23(true, this.method111(field316 + 43594), this);
            long var4 = class31.method318(arg0);
            int var6 = (int) (var4 >> 16 & 31L);
            this.field223.field832 = 0;
            this.field223.method228(14);
            this.field223.method228(var6);
            this.field396.method224(0, (byte) 83, this.field223.field831, 2);
            for (int var7 = 0; var7 < 8; ++var7) {
                this.field396.method221();
            }
            int var8 = this.field396.method221();
            int var9 = var8;
            if (var8 == 0) {
                this.field396.method223(this.field246.field831, 0, 8);
                this.field246.field832 = 0;
                this.field423 = this.field246.method244((byte) 0);
                int[] var10 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (this.field423 >> 32), (int) this.field423 };
                this.field223.field832 = 0;
                this.field223.method228(10);
                this.field223.method232(var10[0]);
                this.field223.method232(var10[1]);
                this.field223.method232(var10[2]);
                this.field223.method232(var10[3]);
                this.field223.method232(signlink.uid);
                this.field223.method235(arg0);
                this.field223.method235(arg1);
                this.field223.method253(field533, 0, field279);
                this.field430.field832 = 0;
                if (arg2) {
                    this.field430.method228(18);
                } else {
                    this.field430.method228(16);
                }
                this.field430.method228(this.field223.field832 + 36 + 1 + 1 + 2);
                this.field430.method228(255);
                this.field430.method229(330);
                this.field430.method228(field318 ? 1 : 0);
                for (int var11 = 0; var11 < 9; ++var11) {
                    this.field430.method232(this.field357[var11]);
                }
                this.field430.method236((byte) 2, 0, this.field223.field831, this.field223.field832);
                this.field223.field836 = new class66(var10, (byte) -48);
                for (int var12 = 0; var12 < 4; ++var12) {
                    var10[var12] += 50;
                }
                this.field569 = new class66(var10, (byte) -48);
                this.field396.method224(0, (byte) 83, this.field430.field831, this.field430.field832);
                var8 = this.field396.method221();
            }
            if (var8 == 1) {
                try {
                    Thread.sleep(2000L);
                } catch (Exception var22) {
                }
                this.method109(arg0, arg1, arg2);
            } else if (var8 == 2) {
                this.field235 = this.field396.method221();
                field170 = this.field396.method221() == 1;
                this.field367 = 0L;
                this.field353 = 0;
                this.field407.field1593 = 0;
                super.field1507 = true;
                this.field523 = true;
                this.field254 = true;
                this.field223.field832 = 0;
                this.field246.field832 = 0;
                this.field497 = -1;
                this.field358 = -1;
                this.field359 = -1;
                this.field360 = -1;
                this.field496 = 0;
                this.field498 = 0;
                this.field582 = 0;
                this.field500 = 0;
                this.field345 = 0;
                this.field203 = 0;
                this.field516 = false;
                super.field1508 = 0;
                for (int var13 = 0; var13 < 100; ++var13) {
                    this.field340[var13] = null;
                }
                this.field482 = 0;
                this.field217 = 0;
                this.field226 = 0;
                this.field297 = 0;
                this.field501 = (int) (Math.random() * 100.0D) - 50;
                this.field301 = (int) (Math.random() * 110.0D) - 55;
                this.field599 = (int) (Math.random() * 80.0D) - 40;
                this.field319 = (int) (Math.random() * 120.0D) - 60;
                this.field287 = (int) (Math.random() * 30.0D) - 20;
                this.field413 = (int) (Math.random() * 20.0D) - 10 & 2047;
                this.field369 = 0;
                this.field422 = -1;
                this.field476 = 0;
                this.field477 = 0;
                this.field510 = 0;
                this.field284 = 0;
                for (int var14 = 0; var14 < this.field507; ++var14) {
                    this.field509[var14] = null;
                    this.field514[var14] = null;
                }
                for (int var15 = 0; var15 < 16384; ++var15) {
                    this.field283[var15] = null;
                }
                field189 = this.field509[this.field508] = new class49();
                this.field491.method386();
                this.field619.method386();
                for (int var16 = 0; var16 < 4; ++var16) {
                    for (int var17 = 0; var17 < 104; ++var17) {
                        for (int var18 = 0; var18 < 104; ++var18) {
                            this.field290[var16][var17][var18] = null;
                        }
                    }
                }
                this.field435 = new class38(false);
                this.field579 = 0;
                this.field578 = 0;
                this.field462 = -1;
                this.field221 = -1;
                this.field262 = -1;
                this.field395 = -1;
                this.field391 = -1;
                this.field298 = false;
                this.field591 = 3;
                this.field492 = 0;
                this.field516 = false;
                this.field424 = false;
                this.field241 = null;
                this.field592 = 0;
                this.field392 = -1;
                this.field304 = true;
                this.method174(89);
                for (int var19 = 0; var19 < 5; ++var19) {
                    this.field341[var19] = 0;
                }
                for (int var20 = 0; var20 < 5; ++var20) {
                    this.field505[var20] = null;
                    this.field506[var20] = false;
                }
                field190 = 0;
                field159 = 0;
                field362 = 0;
                field434 = 0;
                field267 = 0;
                field405 = 0;
                field608 = 0;
                field171 = 0;
                field593 = 0;
                field397 = 0;
                this.method108(this.field420);
            } else if (var8 == 3) {
                this.field174 = "";
                this.field175 = "Invalid username or password.";
            } else if (var8 == 4) {
                this.field174 = "Your account has been disabled.";
                this.field175 = "Please check your message-centre for details.";
            } else if (var8 == 5) {
                this.field174 = "Your account is already logged in.";
                this.field175 = "Try again in 60 secs...";
            } else if (var8 == 6) {
                this.field174 = "RuneScape has been updated!";
                this.field175 = "Please reload this page.";
            } else if (var8 == 7) {
                this.field174 = "This world is full.";
                this.field175 = "Please use a different world.";
            } else if (var8 == 8) {
                this.field174 = "Unable to connect.";
                this.field175 = "Login server offline.";
            } else if (var8 == 9) {
                this.field174 = "Login limit exceeded.";
                this.field175 = "Too many connections from your address.";
            } else if (var8 == 10) {
                this.field174 = "Unable to connect.";
                this.field175 = "Bad session id.";
            } else if (var8 == 11) {
                this.field175 = "Login server rejected session.";
                this.field175 = "Please try again.";
            } else if (var8 == 12) {
                this.field174 = "You need a members account to login to this world.";
                this.field175 = "Please subscribe, or use a different world.";
            } else if (var8 == 13) {
                this.field174 = "Could not complete login.";
                this.field175 = "Please try using a different world.";
            } else if (var8 == 14) {
                this.field174 = "The server is being updated.";
                this.field175 = "Please wait 1 minute and try again.";
            } else if (var8 == 15) {
                this.field254 = true;
                this.field223.field832 = 0;
                this.field246.field832 = 0;
                this.field497 = -1;
                this.field358 = -1;
                this.field359 = -1;
                this.field360 = -1;
                this.field496 = 0;
                this.field498 = 0;
                this.field582 = 0;
                this.field203 = 0;
                this.field516 = false;
                this.field455 = System.currentTimeMillis();
            } else if (var8 == 16) {
                this.field174 = "Login attempts exceeded.";
                this.field175 = "Please wait 1 minute and try again.";
            } else if (var8 == 17) {
                this.field174 = "You are standing in a members-only area.";
                this.field175 = "To play on this world move to a free area first";
            } else if (var8 == 20) {
                this.field174 = "Invalid loginserver requested";
                this.field175 = "Please try using a different world.";
            } else if (var8 != 21) {
                if (var8 == -1) {
                    if (var9 == 0) {
                        if (this.field363 < 2) {
                            try {
                                Thread.sleep(2000L);
                            } catch (Exception var24) {
                            }
                            ++this.field363;
                            this.method109(arg0, arg1, arg2);
                        } else {
                            this.field174 = "No response from loginserver";
                            this.field175 = "Please wait 1 minute and try again.";
                        }
                    } else {
                        this.field174 = "No response from server";
                        this.field175 = "Please try using a different world.";
                    }
                } else {
                    System.out.println("response:" + var8);
                    this.field174 = "Unexpected server response";
                    this.field175 = "Please try using a different world.";
                }
            } else {
                int var21 = this.field396.method221();
                for (int var26 = var21 + 3; var26 >= 0; --var26) {
                    this.field174 = "You have only just left another world";
                    this.field175 = "Your profile will be transferred in: " + var26;
                    this.method130(true, 887);
                    try {
                        Thread.sleep(1200L);
                    } catch (Exception var23) {
                    }
                }
                this.method109(arg0, arg1, arg2);
            }
        } catch (IOException var25) {
            this.field174 = "";
            this.field175 = "Error connecting to server.";
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(I)V")
    public final void method110(int arg0) {
        signlink.reporterror = false;
        try {
            if (this.field396 != null) {
                this.field396.method220();
            }
        } catch (Exception var3) {
        }
        this.field396 = null;
        this.method99(this.field382);
        if (this.field407 != null) {
            this.field407.field1596 = false;
        }
        this.field407 = null;
        this.field437.method470();
        this.field437 = null;
        this.field282 = null;
        this.field223 = null;
        this.field430 = null;
        this.field246 = null;
        this.field539 = null;
        this.field173 = null;
        this.field328 = null;
        this.field540 = null;
        this.field541 = null;
        this.field161 = null;
        this.field524 = null;
        this.field530 = null;
        this.field553 = null;
        this.field570 = null;
        this.field493 = null;
        this.field388 = null;
        this.field389 = null;
        this.field251 = null;
        this.field614 = null;
        this.field615 = null;
        this.field616 = null;
        this.field617 = null;
        this.field165 = null;
        this.field166 = null;
        this.field167 = null;
        this.field305 = null;
        this.field306 = null;
        this.field307 = null;
        this.field308 = null;
        this.field309 = null;
        this.field310 = null;
        this.field311 = null;
        this.field312 = null;
        this.field313 = null;
        this.field463 = null;
        this.field464 = null;
        this.field465 = null;
        this.field431 = null;
        this.field432 = null;
        this.field433 = null;
        this.field244 = null;
        this.field439 = null;
        this.field440 = null;
        this.field441 = null;
        this.field442 = null;
        this.field443 = null;
        this.field517 = null;
        this.field518 = null;
        this.field519 = null;
        this.field520 = null;
        this.field521 = null;
        this.field352 = null;
        this.field249 = null;
        this.field227 = null;
        this.field558 = null;
        this.field197 = null;
        this.field198 = null;
        int var2 = 89 / arg0;
        this.field199 = null;
        this.field200 = null;
        this.field201 = null;
        this.field456 = null;
        this.field479 = null;
        this.field400 = null;
        this.field509 = null;
        this.field511 = null;
        this.field513 = null;
        this.field514 = null;
        this.field481 = null;
        this.field283 = null;
        this.field285 = null;
        this.field290 = null;
        this.field435 = null;
        this.field491 = null;
        this.field619 = null;
        this.field560 = null;
        this.field561 = null;
        this.field562 = null;
        this.field563 = null;
        this.field286 = null;
        this.field216 = null;
        this.field237 = null;
        this.field238 = null;
        this.field418 = null;
        this.field478 = null;
        this.field419 = null;
        this.field343 = null;
        this.field522 = null;
        this.field546 = null;
        this.field547 = null;
        this.field543 = null;
        this.field544 = null;
        this.field545 = null;
        this.field548 = null;
        this.field549 = null;
        this.field550 = null;
        this.field551 = null;
        this.method169(this.field417);
        class41.method399(285);
        class60.method516(285);
        class46.method439(285);
        class19.field742 = null;
        class6.field101 = null;
        class48.field1219 = null;
        class21.field781 = null;
        class71.field1705 = null;
        class9.field136 = null;
        class9.field148 = null;
        class52.field1350 = null;
        super.field1503 = null;
        class49.field1295 = null;
        class58.method494(285);
        class34.method324(285);
        class67.method544(285);
        class22.method217(285);
        System.gc();
        if (class64.field1590) {
        }
    }

    @OriginalMember(owner = "client", name = "v", descriptor = "(I)Ljava/net/Socket;")
    public final Socket method111(int arg0) throws IOException {
        return signlink.mainapp != null ? signlink.opensocket(arg0) : new Socket(InetAddress.getByName(this.getCodeBase().getHost()), arg0);
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IJ)V")
    public final void method112(int arg0, long arg1) {
        if (arg0 <= 0) {
            this.field497 = -1;
        }
        if (arg1 != 0L) {
            for (int var4 = 0; var4 < this.field578; ++var4) {
                if (this.field343[var4] == arg1) {
                    --this.field578;
                    this.field589 = true;
                    for (int var5 = var4; var5 < this.field578; ++var5) {
                        this.field419[var5] = this.field419[var5 + 1];
                        this.field522[var5] = this.field522[var5 + 1];
                        this.field343[var5] = this.field343[var5 + 1];
                    }
                    this.field223.method227(253, this.field376);
                    this.field223.method234(979, arg1);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIII)Z")
    public final boolean method113(int arg0, int arg1, int arg2, int arg3) {
        int var5 = arg0 >> 14 & 32767;
        int var6 = this.field530.method355(this.field303, arg1, arg3, arg0);
        if (var6 == -1) {
            return false;
        } else {
            int var7 = var6 & 31;
            int var8 = var6 >> 6 & 3;
            if (arg2 != 4) {
                this.field295 = !this.field295;
            }
            ++field324;
            if (field324 > 91) {
                field324 = 0;
                this.field223.method227(233, this.field376);
            }
            if (var7 != 10 && var7 != 11 && var7 != 22) {
                this.method78(var7 + 1, field189.field87[0], field189.field88[0], var8, false, true, 2, arg3, arg1, 0, 0, 0);
            } else {
                class41 var9 = class41.method398(var5);
                int var10;
                int var11;
                if (var8 != 0 && var8 != 2) {
                    var10 = var9.field1067;
                    var11 = var9.field1094;
                } else {
                    var10 = var9.field1094;
                    var11 = var9.field1067;
                }
                int var12 = var9.field1064;
                if (var8 != 0) {
                    var12 = (var12 >> 4 - var8) + (var12 << var8 & 15);
                }
                this.method78(0, field189.field87[0], field189.field88[0], 0, false, true, 2, arg3, arg1, var12, var10, var11);
            }
            this.field268 = super.field1517;
            this.field269 = super.field1518;
            this.field271 = 2;
            this.field270 = 0;
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(II)V")
    public final void method114(int arg0, int arg1) {
        int[] var3 = this.field478.field1690;
        int var4 = var3.length;
        for (int var5 = 0; var5 < var4; ++var5) {
            var3[var5] = 0;
        }
        for (int var6 = 1; var6 < 103; ++var6) {
            int var23 = (103 - var6) * 512 * 4 + 24628;
            for (int var24 = 1; var24 < 103; ++var24) {
                if ((this.field524[arg1][var24][var6] & 24) == 0) {
                    this.field530.method360(var3, var23, 512, arg1, var24, var6);
                }
                if (arg1 < 3 && (this.field524[arg1 + 1][var24][var6] & 8) != 0) {
                    this.field530.method360(var3, var23, 512, arg1 + 1, var24, var6);
                }
                var23 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        this.field478.method573(9133);
        for (int var9 = 1; var9 < 103; ++var9) {
            for (int var22 = 1; var22 < 103; ++var22) {
                if ((this.field524[arg1][var22][var9] & 24) == 0) {
                    this.method56(var8, var9, 17156, var7, arg1, var22);
                }
                if (arg1 < 3 && (this.field524[arg1 + 1][var22][var9] & 8) != 0) {
                    this.method56(var8, var9, 17156, var7, arg1 + 1, var22);
                }
            }
        }
        if (arg0 <= 0) {
            this.field290 = null;
        }
        this.field616.method455(9133);
        this.field236 = 0;
        for (int var10 = 0; var10 < 104; ++var10) {
            for (int var11 = 0; var11 < 104; ++var11) {
                int var12 = this.field530.method354(this.field303, var10, var11);
                if (var12 != 0) {
                    int var13 = var12 >> 14 & 32767;
                    int var14 = class41.method398(var13).field1099;
                    if (var14 >= 0) {
                        int var15 = var10;
                        int var16 = var11;
                        if (var14 != 22 && var14 != 29 && var14 != 34 && var14 != 36 && var14 != 46 && var14 != 47 && var14 != 48) {
                            byte var17 = 104;
                            byte var18 = 104;
                            int[][] var19 = this.field553[this.field303].field1586;
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
                        this.field418[this.field236] = this.field479[var14];
                        this.field237[this.field236] = var15;
                        this.field238[this.field236] = var16;
                        ++this.field236;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "h", descriptor = "(II)V")
    public final void method115(int arg0, int arg1) {
        if (arg0 >= 0) {
            if (this.field492 != 0) {
                this.field492 = 0;
                this.field212 = true;
            }
            int var3 = this.field560[arg0];
            int var4 = this.field561[arg0];
            int var5 = this.field562[arg0];
            int var6 = this.field563[arg0];
            if (arg1 < 0) {
                if (var5 >= 2000) {
                    var5 -= 2000;
                }
                if (var5 == 629) {
                    String var7 = this.field286[arg0];
                    int var8 = var7.indexOf("@whi@");
                    if (var8 != -1) {
                        if (this.field262 == -1) {
                            this.method76(188);
                            this.field248 = var7.substring(var8 + 5).trim();
                            this.field406 = false;
                            for (int var9 = 0; var9 < class48.field1219.length; ++var9) {
                                if (class48.field1219[var9] != null && class48.field1219[var9].field1268 == 600) {
                                    this.field490 = this.field262 = class48.field1219[var9].field1228;
                                    break;
                                }
                            }
                        } else {
                            this.method125(0, "", "Please close the interface you have open before using 'report abuse'", (byte) 5);
                        }
                    }
                }
                if (var5 == 575) {
                    class49 var10 = this.field509[var6];
                    if (var10 != null) {
                        this.method78(0, field189.field87[0], field189.field88[0], 0, false, true, 2, var10.field88[0], var10.field87[0], 0, 1, 1);
                        this.field268 = super.field1517;
                        this.field269 = super.field1518;
                        this.field271 = 2;
                        this.field270 = 0;
                        this.field223.method227(124, this.field376);
                        this.field223.method262(var6, 0);
                    }
                }
                if (var5 == 843) {
                    class48 var11 = class48.field1219[var4];
                    boolean var12 = true;
                    if (var11.field1268 > 0) {
                        var12 = this.method49(var11, this.field408);
                    }
                    if (var12) {
                        this.field223.method227(166, this.field376);
                        this.field223.method229(var4);
                    }
                }
                if (var5 == 68) {
                    this.field482 = 1;
                    this.field483 = var3;
                    this.field484 = var4;
                    this.field485 = var6;
                    this.field486 = class46.method438(var6).field1164;
                    this.field217 = 0;
                    this.field589 = true;
                } else {
                    if (var5 == 36) {
                        this.field223.method227(165, this.field376);
                        this.field223.method263(this.field370, var6);
                        this.field223.method229(var4);
                        this.field223.method264(var3, 4);
                        this.field153 = 0;
                        this.field154 = var4;
                        this.field155 = var3;
                        this.field156 = 2;
                        if (class48.field1219[var4].field1228 == this.field262) {
                            this.field156 = 1;
                        }
                        if (class48.field1219[var4].field1228 == this.field221) {
                            this.field156 = 3;
                        }
                    }
                    if (var5 == 567) {
                        boolean var13 = this.method78(0, field189.field87[0], field189.field88[0], 0, false, true, 2, var4, var3, 0, 0, 0);
                        if (!var13) {
                            this.method78(0, field189.field87[0], field189.field88[0], 0, false, true, 2, var4, var3, 0, 1, 1);
                        }
                        this.field268 = super.field1517;
                        this.field269 = super.field1518;
                        this.field271 = 2;
                        this.field270 = 0;
                        this.field223.method227(215, this.field376);
                        this.field223.method264(this.field485, 4);
                        this.field223.method264(this.field483, 4);
                        this.field223.method262(this.field484, 0);
                        this.field223.method264(this.field330 + var3, 4);
                        this.field223.method229(var6);
                        this.field223.method262(this.field331 + var4, 0);
                    }
                    if (var5 == 6) {
                        boolean var15 = this.method78(0, field189.field87[0], field189.field88[0], 0, false, true, 2, var4, var3, 0, 0, 0);
                        if (!var15) {
                            this.method78(0, field189.field87[0], field189.field88[0], 0, false, true, 2, var4, var3, 0, 1, 1);
                        }
                        this.field268 = super.field1517;
                        this.field269 = super.field1518;
                        this.field271 = 2;
                        this.field270 = 0;
                        this.field223.method227(189, this.field376);
                        this.field223.method262(this.field330 + var3, 0);
                        this.field223.method264(var6, 4);
                        this.field223.method263(this.field370, this.field331 + var4);
                    }
                    if (var5 == 79 || var5 == 51 || var5 == 647 || var5 == 320) {
                        String var17 = this.field286[arg0];
                        int var18 = var17.indexOf("@whi@");
                        if (var18 != -1) {
                            long var19 = class31.method318(var17.substring(var18 + 5).trim());
                            if (var5 == 79) {
                                this.method87(var19, 735);
                            }
                            if (var5 == 51) {
                                this.method66(var19, 0);
                            }
                            if (var5 == 647) {
                                this.method112(103, var19);
                            }
                            if (var5 == 320) {
                                this.method94(var19, 0);
                            }
                        }
                    }
                    if (var5 == 819) {
                        this.field223.method227(177, this.field376);
                        this.field223.method264(var3, 4);
                        this.field223.method229(var4);
                        this.field223.method262(var6, 0);
                        this.field153 = 0;
                        this.field154 = var4;
                        this.field155 = var3;
                        this.field156 = 2;
                        if (class48.field1219[var4].field1228 == this.field262) {
                            this.field156 = 1;
                        }
                        if (class48.field1219[var4].field1228 == this.field221) {
                            this.field156 = 3;
                        }
                    }
                    if (var5 == 482) {
                        boolean var21 = this.method78(0, field189.field87[0], field189.field88[0], 0, false, true, 2, var4, var3, 0, 0, 0);
                        if (!var21) {
                            this.method78(0, field189.field87[0], field189.field88[0], 0, false, true, 2, var4, var3, 0, 1, 1);
                        }
                        this.field268 = super.field1517;
                        this.field269 = super.field1518;
                        this.field271 = 2;
                        this.field270 = 0;
                        field608 += this.field330;
                        if (field608 >= 143) {
                            this.field223.method227(115, this.field376);
                            this.field223.method231(13559990);
                            field608 = 0;
                        }
                        this.field223.method227(141, this.field376);
                        this.field223.method264(var6, 4);
                        this.field223.method263(this.field370, this.field330 + var3);
                        this.field223.method263(this.field370, this.field331 + var4);
                    }
                    if (var5 == 936) {
                        this.field223.method227(166, this.field376);
                        this.field223.method229(var4);
                        class48 var23 = class48.field1219[var4];
                        if (var23.field1236 != null && var23.field1236[0][0] == 5) {
                            int var24 = var23.field1236[0][1];
                            if (this.field216[var24] != var23.field1244[0]) {
                                this.field216[var24] = var23.field1244[0];
                                this.method63(this.field334, var24);
                                this.field589 = true;
                            }
                        }
                    }
                    if (var5 == 464) {
                        boolean var25 = this.method78(0, field189.field87[0], field189.field88[0], 0, false, true, 2, var4, var3, 0, 0, 0);
                        if (!var25) {
                            this.method78(0, field189.field87[0], field189.field88[0], 0, false, true, 2, var4, var3, 0, 1, 1);
                        }
                        this.field268 = super.field1517;
                        this.field269 = super.field1518;
                        this.field271 = 2;
                        this.field270 = 0;
                        this.field223.method227(237, this.field376);
                        this.field223.method263(this.field370, this.field330 + var3);
                        this.field223.method229(var6);
                        this.field223.method263(this.field370, this.field331 + var4);
                    }
                    if (var5 == 17) {
                        class37 var27 = this.field283[var6];
                        if (var27 != null) {
                            this.method78(0, field189.field87[0], field189.field88[0], 0, false, true, 2, var27.field88[0], var27.field87[0], 0, 1, 1);
                            this.field268 = super.field1517;
                            this.field269 = super.field1518;
                            this.field271 = 2;
                            this.field270 = 0;
                            this.field223.method227(82, this.field376);
                            this.field223.method264(var6, 4);
                        }
                    }
                    if (var5 == 29) {
                        class49 var28 = this.field509[var6];
                        if (var28 != null) {
                            this.method78(0, field189.field87[0], field189.field88[0], 0, false, true, 2, var28.field88[0], var28.field87[0], 0, 1, 1);
                            this.field268 = super.field1517;
                            this.field269 = super.field1518;
                            this.field271 = 2;
                            this.field270 = 0;
                            this.field223.method227(154, this.field376);
                            this.field223.method229(var6);
                            this.field223.method264(this.field485, 4);
                            this.field223.method229(this.field484);
                            this.field223.method229(this.field483);
                        }
                    }
                    if (var5 == 348) {
                        boolean var29 = this.method78(0, field189.field87[0], field189.field88[0], 0, false, true, 2, var4, var3, 0, 0, 0);
                        if (!var29) {
                            this.method78(0, field189.field87[0], field189.field88[0], 0, false, true, 2, var4, var3, 0, 1, 1);
                        }
                        this.field268 = super.field1517;
                        this.field269 = super.field1518;
                        this.field271 = 2;
                        this.field270 = 0;
                        this.field223.method227(8, this.field376);
                        this.field223.method262(var6, 0);
                        this.field223.method264(this.field330 + var3, 4);
                        this.field223.method264(this.field331 + var4, 4);
                    }
                    if (var5 == 329) {
                        this.method76(188);
                    }
                    if (var5 == 313) {
                        class49 var31 = this.field509[var6];
                        if (var31 != null) {
                            this.method78(0, field189.field87[0], field189.field88[0], 0, false, true, 2, var31.field88[0], var31.field87[0], 0, 1, 1);
                            this.field268 = super.field1517;
                            this.field269 = super.field1518;
                            this.field271 = 2;
                            this.field270 = 0;
                            this.field223.method227(72, this.field376);
                            this.field223.method264(var6, 4);
                            this.field223.method264(this.field218, 4);
                        }
                    }
                    if (var5 == 409) {
                        class49 var32 = this.field509[var6];
                        if (var32 != null) {
                            this.method78(0, field189.field87[0], field189.field88[0], 0, false, true, 2, var32.field88[0], var32.field87[0], 0, 1, 1);
                            this.field268 = super.field1517;
                            this.field269 = super.field1518;
                            this.field271 = 2;
                            this.field270 = 0;
                            ++field159;
                            if (field159 >= 128) {
                                this.field223.method227(90, this.field376);
                                field159 = 0;
                            }
                            this.field223.method227(240, this.field376);
                            this.field223.method229(var6);
                        }
                    }
                    if (var5 == 139) {
                        this.method113(var6, var3, 4, var4);
                        this.field223.method227(217, this.field376);
                        this.field223.method262(this.field331 + var4, 0);
                        this.field223.method262(this.field330 + var3, 0);
                        this.field223.method229(var6 >> 14 & 32767);
                    }
                    if (var5 == 1334) {
                        class46 var33 = class46.method438(var6);
                        String var34;
                        if (var33.field1177 != null) {
                            var34 = new String(var33.field1177);
                        } else {
                            var34 = "It's a " + var33.field1164 + ".";
                        }
                        this.method125(0, "", var34, (byte) 5);
                    }
                    if (var5 == 748 && this.method113(var6, var3, 4, var4)) {
                        this.field223.method227(176, this.field376);
                        this.field223.method262(var6 >> 14 & 32767, 0);
                        this.field223.method264(this.field483, 4);
                        this.field223.method264(this.field485, 4);
                        this.field223.method264(this.field484, 4);
                        this.field223.method229(this.field330 + var3);
                        this.field223.method262(this.field331 + var4, 0);
                    }
                    if (var5 == 749 && this.method113(var6, var3, 4, var4)) {
                        this.field223.method227(174, this.field376);
                        this.field223.method264(this.field330 + var3, 4);
                        this.field223.method263(this.field370, this.field331 + var4);
                        this.field223.method262(this.field218, 0);
                        this.field223.method264(var6 >> 14 & 32767, 4);
                    }
                    if (var5 == 457 || var5 == 502) {
                        String var35 = this.field286[arg0];
                        int var36 = var35.indexOf("@whi@");
                        if (var36 != -1) {
                            String var37 = var35.substring(var36 + 5).trim();
                            String var38 = class31.method322(true, class31.method319(-602, class31.method318(var37)));
                            boolean var39 = false;
                            for (int var40 = 0; var40 < this.field510; ++var40) {
                                class49 var41 = this.field509[this.field511[var40]];
                                if (var41 != null && var41.field1302 != null && var41.field1302.equalsIgnoreCase(var38)) {
                                    this.method78(0, field189.field87[0], field189.field88[0], 0, false, true, 2, var41.field88[0], var41.field87[0], 0, 1, 1);
                                    if (var5 == 457) {
                                        ++field267;
                                        if (field267 >= 76) {
                                            this.field223.method227(129, this.field376);
                                            this.field223.method228(78);
                                            field267 = 0;
                                        }
                                        this.field223.method227(78, this.field376);
                                        this.field223.method262(this.field511[var40], 0);
                                    }
                                    if (var5 == 502) {
                                        ++field159;
                                        if (field159 >= 128) {
                                            this.field223.method227(90, this.field376);
                                            field159 = 0;
                                        }
                                        this.field223.method227(240, this.field376);
                                        this.field223.method229(this.field511[var40]);
                                    }
                                    var39 = true;
                                    break;
                                }
                            }
                            if (!var39) {
                                this.method125(0, "", "Unable to find " + var38, (byte) 5);
                            }
                        }
                    }
                    if (var5 == 215) {
                        class37 var42 = this.field283[var6];
                        if (var42 != null) {
                            this.method78(0, field189.field87[0], field189.field88[0], 0, false, true, 2, var42.field88[0], var42.field87[0], 0, 1, 1);
                            this.field268 = super.field1517;
                            this.field269 = super.field1518;
                            this.field271 = 2;
                            this.field270 = 0;
                            ++field362;
                            if (field362 >= 86) {
                                this.field223.method227(136, this.field376);
                                this.field223.method228(103);
                                field362 = 0;
                            }
                            this.field223.method227(108, this.field376);
                            this.field223.method263(this.field370, var6);
                        }
                    }
                    if (var5 == 314) {
                        this.method113(var6, var3, 4, var4);
                        this.field223.method227(12, this.field376);
                        this.field223.method229(var6 >> 14 & 32767);
                        this.field223.method229(this.field330 + var3);
                        this.field223.method263(this.field370, this.field331 + var4);
                    }
                    if (var5 == 541) {
                        this.field223.method227(47, this.field376);
                        this.field223.method262(var3, 0);
                        this.field223.method262(var6, 0);
                        this.field223.method262(var4, 0);
                        this.field153 = 0;
                        this.field154 = var4;
                        this.field155 = var3;
                        this.field156 = 2;
                        if (class48.field1219[var4].field1228 == this.field262) {
                            this.field156 = 1;
                        }
                        if (class48.field1219[var4].field1228 == this.field221) {
                            this.field156 = 3;
                        }
                    }
                    if (var5 == 1313) {
                        class46 var43 = class46.method438(var6);
                        class48 var44 = class48.field1219[var4];
                        String var45;
                        if (var44 != null && var44.field1218[var3] >= 100000) {
                            var45 = var44.field1218[var3] + " x " + var43.field1164;
                        } else if (var43.field1177 != null) {
                            var45 = new String(var43.field1177);
                        } else {
                            var45 = "It's a " + var43.field1164 + ".";
                        }
                        this.method125(0, "", var45, (byte) 5);
                    }
                    if (var5 == 257) {
                        this.field223.method227(70, this.field376);
                        this.field223.method262(var4, 0);
                        this.field223.method264(var3, 4);
                        this.field223.method263(this.field370, var6);
                        this.field153 = 0;
                        this.field154 = var4;
                        this.field155 = var3;
                        this.field156 = 2;
                        if (class48.field1219[var4].field1228 == this.field262) {
                            this.field156 = 1;
                        }
                        if (class48.field1219[var4].field1228 == this.field221) {
                            this.field156 = 3;
                        }
                    }
                    if (var5 == 124) {
                        class37 var46 = this.field283[var6];
                        if (var46 != null) {
                            this.method78(0, field189.field87[0], field189.field88[0], 0, false, true, 2, var46.field88[0], var46.field87[0], 0, 1, 1);
                            this.field268 = super.field1517;
                            this.field269 = super.field1518;
                            this.field271 = 2;
                            this.field270 = 0;
                            this.field223.method227(96, this.field376);
                            this.field223.method262(this.field485, 0);
                            this.field223.method264(this.field484, 4);
                            this.field223.method229(this.field483);
                            this.field223.method262(var6, 0);
                        }
                    }
                    if (var5 == 114) {
                        this.field223.method227(67, this.field376);
                        this.field223.method264(var4, 4);
                        this.field223.method229(var6);
                        this.field223.method264(var3, 4);
                        this.field153 = 0;
                        this.field154 = var4;
                        this.field155 = var3;
                        this.field156 = 2;
                        if (class48.field1219[var4].field1228 == this.field262) {
                            this.field156 = 1;
                        }
                        if (class48.field1219[var4].field1228 == this.field221) {
                            this.field156 = 3;
                        }
                    }
                    if (var5 == 862) {
                        boolean var47 = this.method78(0, field189.field87[0], field189.field88[0], 0, false, true, 2, var4, var3, 0, 0, 0);
                        if (!var47) {
                            this.method78(0, field189.field87[0], field189.field88[0], 0, false, true, 2, var4, var3, 0, 1, 1);
                        }
                        this.field268 = super.field1517;
                        this.field269 = super.field1518;
                        this.field271 = 2;
                        this.field270 = 0;
                        this.field223.method227(125, this.field376);
                        this.field223.method262(this.field218, 0);
                        this.field223.method264(var6, 4);
                        this.field223.method262(this.field330 + var3, 0);
                        this.field223.method263(this.field370, this.field331 + var4);
                    }
                    if (var5 == 797) {
                        if (!this.field516) {
                            this.field530.method363(super.field1517 - 4, (byte) 5, super.field1518 - 4);
                        } else {
                            this.field530.method363(var3 - 4, (byte) 5, var4 - 4);
                        }
                    }
                    if (var5 == 140) {
                        this.field223.method227(188, this.field376);
                        this.field223.method229(var6);
                        this.field223.method264(var3, 4);
                        this.field223.method263(this.field370, var4);
                        this.field153 = 0;
                        this.field154 = var4;
                        this.field155 = var3;
                        this.field156 = 2;
                        if (class48.field1219[var4].field1228 == this.field262) {
                            this.field156 = 1;
                        }
                        if (class48.field1219[var4].field1228 == this.field221) {
                            this.field156 = 3;
                        }
                    }
                    if (var5 == 148) {
                        class49 var49 = this.field509[var6];
                        if (var49 != null) {
                            this.method78(0, field189.field87[0], field189.field88[0], 0, false, true, 2, var49.field88[0], var49.field87[0], 0, 1, 1);
                            this.field268 = super.field1517;
                            this.field269 = super.field1518;
                            this.field271 = 2;
                            this.field270 = 0;
                            this.field223.method227(131, this.field376);
                            this.field223.method229(var6);
                        }
                    }
                    if (var5 == 693) {
                        this.method113(var6, var3, 4, var4);
                        this.field223.method227(10, this.field376);
                        this.field223.method264(this.field331 + var4, 4);
                        this.field223.method262(var6 >> 14 & 32767, 0);
                        this.field223.method229(this.field330 + var3);
                    }
                    if (var5 == 263) {
                        boolean var50 = this.method78(0, field189.field87[0], field189.field88[0], 0, false, true, 2, var4, var3, 0, 0, 0);
                        if (!var50) {
                            this.method78(0, field189.field87[0], field189.field88[0], 0, false, true, 2, var4, var3, 0, 1, 1);
                        }
                        this.field268 = super.field1517;
                        this.field269 = super.field1518;
                        this.field271 = 2;
                        this.field270 = 0;
                        if ((var4 & 3) == 0) {
                            ++field405;
                        }
                        if (field405 >= 133) {
                            this.field223.method227(110, this.field376);
                            this.field223.method228(182);
                            field405 = 0;
                        }
                        this.field223.method227(206, this.field376);
                        this.field223.method262(this.field330 + var3, 0);
                        this.field223.method262(this.field331 + var4, 0);
                        this.field223.method264(var6, 4);
                    }
                    if (var5 == 815) {
                        this.field223.method227(241, this.field376);
                        this.field223.method263(this.field370, var3);
                        this.field223.method262(var6, 0);
                        this.field223.method229(var4);
                        this.field153 = 0;
                        this.field154 = var4;
                        this.field155 = var3;
                        this.field156 = 2;
                        if (class48.field1219[var4].field1228 == this.field262) {
                            this.field156 = 1;
                        }
                        if (class48.field1219[var4].field1228 == this.field221) {
                            this.field156 = 3;
                        }
                    }
                    if (var5 == 1619) {
                        int var52 = var6 >> 14 & 32767;
                        class41 var53 = class41.method398(var52);
                        String var54;
                        if (var53.field1077 != null) {
                            var54 = new String(var53.field1077);
                        } else {
                            var54 = "It's a " + var53.field1085 + ".";
                        }
                        this.method125(0, "", var54, (byte) 5);
                    }
                    if (var5 == 507) {
                        class37 var55 = this.field283[var6];
                        if (var55 != null) {
                            this.method78(0, field189.field87[0], field189.field88[0], 0, false, true, 2, var55.field88[0], var55.field87[0], 0, 1, 1);
                            this.field268 = super.field1517;
                            this.field269 = super.field1518;
                            this.field271 = 2;
                            this.field270 = 0;
                            ++field171;
                            if (field171 >= 62) {
                                this.field223.method227(109, this.field376);
                                field171 = 0;
                            }
                            this.field223.method227(175, this.field376);
                            this.field223.method229(var6);
                        }
                    }
                    if (var5 == 938) {
                        this.field223.method227(166, this.field376);
                        this.field223.method229(var4);
                        class48 var56 = class48.field1219[var4];
                        if (var56.field1236 != null && var56.field1236[0][0] == 5) {
                            int var57 = var56.field1236[0][1];
                            this.field216[var57] = 1 - this.field216[var57];
                            this.method63(this.field334, var57);
                            this.field589 = true;
                        }
                    }
                    if (var5 == 474) {
                        this.field223.method227(81, this.field376);
                        this.field223.method229(var6);
                        this.field223.method263(this.field370, var3);
                        this.field223.method229(var4);
                        this.field153 = 0;
                        this.field154 = var4;
                        this.field155 = var3;
                        this.field156 = 2;
                        if (class48.field1219[var4].field1228 == this.field262) {
                            this.field156 = 1;
                        }
                        if (class48.field1219[var4].field1228 == this.field221) {
                            this.field156 = 3;
                        }
                    }
                    if (var5 == 919) {
                        class37 var58 = this.field283[var6];
                        if (var58 != null) {
                            this.method78(0, field189.field87[0], field189.field88[0], 0, false, true, 2, var58.field88[0], var58.field87[0], 0, 1, 1);
                            this.field268 = super.field1517;
                            this.field269 = super.field1518;
                            this.field271 = 2;
                            this.field270 = 0;
                            this.field223.method227(225, this.field376);
                            this.field223.method262(var6, 0);
                        }
                    }
                    if (var5 == 104) {
                        this.field223.method227(76, this.field376);
                        this.field223.method262(var6, 0);
                        this.field223.method262(var4, 0);
                        this.field223.method262(var3, 0);
                        this.field153 = 0;
                        this.field154 = var4;
                        this.field155 = var3;
                        this.field156 = 2;
                        if (class48.field1219[var4].field1228 == this.field262) {
                            this.field156 = 1;
                        }
                        if (class48.field1219[var4].field1228 == this.field221) {
                            this.field156 = 3;
                        }
                    }
                    if (var5 == 637) {
                        this.field223.method227(28, this.field376);
                        this.field223.method264(var4, 4);
                        this.field223.method263(this.field370, this.field484);
                        this.field223.method229(this.field485);
                        this.field223.method262(var3, 0);
                        this.field223.method264(this.field483, 4);
                        this.field223.method262(var6, 0);
                        this.field153 = 0;
                        this.field154 = var4;
                        this.field155 = var3;
                        this.field156 = 2;
                        if (class48.field1219[var4].field1228 == this.field262) {
                            this.field156 = 1;
                        }
                        if (class48.field1219[var4].field1228 == this.field221) {
                            this.field156 = 3;
                        }
                    }
                    if (var5 == 522) {
                        this.field223.method227(45, this.field376);
                        this.field223.method263(this.field370, this.field218);
                        this.field223.method263(this.field370, var6);
                        this.field223.method229(var4);
                        this.field223.method264(var3, 4);
                        this.field153 = 0;
                        this.field154 = var4;
                        this.field155 = var3;
                        this.field156 = 2;
                        if (class48.field1219[var4].field1228 == this.field262) {
                            this.field156 = 1;
                        }
                        if (class48.field1219[var4].field1228 == this.field221) {
                            this.field156 = 3;
                        }
                    }
                    if (var5 == 1963) {
                        this.method113(var6, var3, 4, var4);
                        this.field223.method227(190, this.field376);
                        this.field223.method262(this.field331 + var4, 0);
                        this.field223.method264(this.field330 + var3, 4);
                        this.field223.method229(var6 >> 14 & 32767);
                    }
                    if (var5 == 216) {
                        class37 var59 = this.field283[var6];
                        if (var59 != null) {
                            this.method78(0, field189.field87[0], field189.field88[0], 0, false, true, 2, var59.field88[0], var59.field87[0], 0, 1, 1);
                            this.field268 = super.field1517;
                            this.field269 = super.field1518;
                            this.field271 = 2;
                            this.field270 = 0;
                            ++field190;
                            if (field190 >= 144) {
                                this.field223.method227(71, this.field376);
                                this.field223.method228(125);
                                field190 = 0;
                            }
                            this.field223.method227(242, this.field376);
                            this.field223.method264(var6, 4);
                        }
                    }
                    if (var5 == 1159) {
                        class37 var60 = this.field283[var6];
                        if (var60 != null) {
                            class60 var61 = var60.field1044;
                            if (var61.field1549 != null) {
                                var61 = var61.method518(-13525);
                            }
                            if (var61 != null) {
                                String var62;
                                if (var61.field1540 != null) {
                                    var62 = new String(var61.field1540);
                                } else {
                                    var62 = "It's a " + var61.field1548 + ".";
                                }
                                this.method125(0, "", var62, (byte) 5);
                            }
                        }
                    }
                    if (var5 == 499) {
                        String var63 = this.field286[arg0];
                        int var64 = var63.indexOf("@whi@");
                        if (var64 != -1) {
                            long var65 = class31.method318(var63.substring(var64 + 5).trim());
                            int var67 = -1;
                            for (int var68 = 0; var68 < this.field578; ++var68) {
                                if (this.field343[var68] == var65) {
                                    var67 = var68;
                                    break;
                                }
                            }
                            if (var67 != -1 && this.field522[var67] > 0) {
                                this.field212 = true;
                                this.field492 = 0;
                                this.field424 = true;
                                this.field263 = "";
                                this.field555 = 3;
                                this.field256 = this.field343[var67];
                                this.field348 = "Enter message to send to " + this.field419[var67];
                            }
                        }
                    }
                    if (var5 == 264 && !this.field298) {
                        this.field223.method227(99, this.field376);
                        this.field223.method229(var4);
                        this.field298 = true;
                    }
                    if (var5 == 743) {
                        class49 var69 = this.field509[var6];
                        if (var69 != null) {
                            this.method78(0, field189.field87[0], field189.field88[0], 0, false, true, 2, var69.field88[0], var69.field87[0], 0, 1, 1);
                            this.field268 = super.field1517;
                            this.field269 = super.field1518;
                            this.field271 = 2;
                            this.field270 = 0;
                            this.field223.method227(196, this.field376);
                            this.field223.method262(var6, 0);
                        }
                    }
                    if (var5 == 217) {
                        this.method113(var6, var3, 4, var4);
                        this.field223.method227(119, this.field376);
                        this.field223.method263(this.field370, this.field330 + var3);
                        this.field223.method262(this.field331 + var4, 0);
                        this.field223.method263(this.field370, var6 >> 14 & 32767);
                    }
                    if (var5 == 841) {
                        class48 var70 = class48.field1219[var4];
                        this.field217 = 1;
                        this.field218 = var4;
                        this.field219 = var70.field1280;
                        this.field482 = 0;
                        this.field589 = true;
                        String var71 = var70.field1257;
                        if (var71.indexOf(" ") != -1) {
                            var71 = var71.substring(0, var71.indexOf(" "));
                        }
                        String var72 = var70.field1257;
                        if (var72.indexOf(" ") != -1) {
                            var72 = var72.substring(var72.indexOf(" ") + 1);
                        }
                        this.field220 = var71 + " " + var70.field1265 + " " + var72;
                        if (this.field219 == 16) {
                            this.field589 = true;
                            this.field591 = 3;
                            this.field354 = true;
                        }
                    } else {
                        if (var5 == 540) {
                            class49 var73 = this.field509[var6];
                            if (var73 != null) {
                                this.method78(0, field189.field87[0], field189.field88[0], 0, false, true, 2, var73.field88[0], var73.field87[0], 0, 1, 1);
                                this.field268 = super.field1517;
                                this.field269 = super.field1518;
                                this.field271 = 2;
                                this.field270 = 0;
                                ++field267;
                                if (field267 >= 76) {
                                    this.field223.method227(129, this.field376);
                                    this.field223.method228(78);
                                    field267 = 0;
                                }
                                this.field223.method227(78, this.field376);
                                this.field223.method262(var6, 0);
                            }
                        }
                        if (var5 == 53) {
                            class37 var74 = this.field283[var6];
                            if (var74 != null) {
                                this.method78(0, field189.field87[0], field189.field88[0], 0, false, true, 2, var74.field88[0], var74.field87[0], 0, 1, 1);
                                this.field268 = super.field1517;
                                this.field269 = super.field1518;
                                this.field271 = 2;
                                this.field270 = 0;
                                this.field223.method227(152, this.field376);
                                this.field223.method263(this.field370, this.field218);
                                this.field223.method264(var6, 4);
                            }
                        }
                        if (var5 == 984) {
                            field434 += var4;
                            if (field434 >= 136) {
                                this.field223.method227(197, this.field376);
                                this.field223.method229(41190);
                                field434 = 0;
                            }
                            this.field223.method227(181, this.field376);
                            this.field223.method262(var6, 0);
                            this.field223.method229(var3);
                            this.field223.method264(var4, 4);
                            this.field153 = 0;
                            this.field154 = var4;
                            this.field155 = var3;
                            this.field156 = 2;
                            if (class48.field1219[var4].field1228 == this.field262) {
                                this.field156 = 1;
                            }
                            if (class48.field1219[var4].field1228 == this.field221) {
                                this.field156 = 3;
                            }
                        }
                        this.field482 = 0;
                        this.field217 = 0;
                        this.field589 = true;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "()V")
    public final void method116() {
        this.method83(field372, 20, "Starting up");
        if (signlink.sunjava) {
            super.field1496 = 5;
        }
        if (field554) {
            this.field588 = true;
        } else {
            field554 = true;
            boolean var1 = false;
            String var2 = this.method160(true);
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
                this.field542 = true;
            } else {
                if (signlink.cache_dat != null) {
                    for (int var3 = 0; var3 < 5; ++var3) {
                        this.field150[var3] = new class44(signlink.cache_dat, false, var3 + 1, 500000, signlink.cache_idx[var3]);
                    }
                }
                try {
                    this.method90(0);
                    this.field296 = this.method95(25, "title", "title screen", this.field357[1], true, 1);
                    this.field384 = new class10(false, "p11_full", this.field296, 4348);
                    this.field385 = new class10(false, "p12_full", this.field296, 4348);
                    this.field386 = new class10(false, "b12_full", this.field296, 4348);
                    this.field387 = new class10(true, "q8_full", this.field296, 4348);
                    this.method89(-930);
                    this.method35((byte) 59);
                    class7 var4 = this.method95(30, "config", "config", this.field357[2], true, 2);
                    class7 var5 = this.method95(35, "interface", "interface", this.field357[3], true, 3);
                    class7 var6 = this.method95(40, "media", "2d graphics", this.field357[4], true, 4);
                    class7 var7 = this.method95(45, "textures", "textures", this.field357[6], true, 6);
                    class7 var8 = this.method95(50, "wordenc", "chat system", this.field357[7], true, 7);
                    class7 var9 = this.method95(55, "sounds", "sound effects", this.field357[8], true, 8);
                    this.field524 = new byte[4][104][104];
                    this.field161 = new int[4][105][105];
                    this.field530 = new class34(104, this.field161, 4, -82, 104);
                    for (int var10 = 0; var10 < 4; ++var10) {
                        this.field553[var10] = new class63(104, field252, 104);
                    }
                    this.field478 = new class68(512, 512);
                    class7 var11 = this.method95(60, "versionlist", "update list", this.field357[5], true, 5);
                    this.method83(field372, 60, "Connecting to update server");
                    this.field437 = new class53();
                    this.field437.method464(var11, this);
                    class22.method215(this.field437.method467(0));
                    class67.method545(this.field437.method474(0, 86), this.field437);
                    if (!field318) {
                        this.field346 = 0;
                        try {
                            this.field346 = Integer.parseInt(this.getParameter("music"));
                        } catch (Exception var70) {
                        }
                        this.field347 = true;
                        this.field437.method469(2, this.field346);
                        while (this.field437.method472() > 0) {
                            this.method172(0);
                            try {
                                Thread.sleep(100L);
                            } catch (Exception var69) {
                            }
                            if (this.field437.field1409 > 3) {
                                this.method164("ondemand");
                                return;
                            }
                        }
                    }
                    this.method83(field372, 65, "Requesting animations");
                    int var12 = this.field437.method474(1, 86);
                    for (int var13 = 0; var13 < var12; ++var13) {
                        this.field437.method469(1, var13);
                    }
                    while (this.field437.method472() > 0) {
                        int var14 = var12 - this.field437.method472();
                        if (var14 > 0) {
                            this.method83(field372, 65, "Loading animations - " + var14 * 100 / var12 + "%");
                        }
                        this.method172(0);
                        try {
                            Thread.sleep(100L);
                        } catch (Exception var68) {
                        }
                        if (this.field437.field1409 > 3) {
                            this.method164("ondemand");
                            return;
                        }
                    }
                    this.method83(field372, 70, "Requesting models");
                    int var15 = this.field437.method474(0, 86);
                    for (int var16 = 0; var16 < var15; ++var16) {
                        int var17 = this.field437.method480(16165, var16);
                        if ((var17 & 1) != 0) {
                            this.field437.method469(0, var16);
                        }
                    }
                    int var18 = this.field437.method472();
                    while (this.field437.method472() > 0) {
                        int var19 = var18 - this.field437.method472();
                        if (var19 > 0) {
                            this.method83(field372, 70, "Loading models - " + var19 * 100 / var18 + "%");
                        }
                        this.method172(0);
                        try {
                            Thread.sleep(100L);
                        } catch (Exception var67) {
                        }
                    }
                    if (this.field150[0] != null) {
                        this.method83(field372, 75, "Requesting maps");
                        this.field437.method469(3, this.field437.method465(47, 48, 0, 0));
                        this.field437.method469(3, this.field437.method465(47, 48, 1, 0));
                        this.field437.method469(3, this.field437.method465(48, 48, 0, 0));
                        this.field437.method469(3, this.field437.method465(48, 48, 1, 0));
                        this.field437.method469(3, this.field437.method465(49, 48, 0, 0));
                        this.field437.method469(3, this.field437.method465(49, 48, 1, 0));
                        this.field437.method469(3, this.field437.method465(47, 47, 0, 0));
                        this.field437.method469(3, this.field437.method465(47, 47, 1, 0));
                        this.field437.method469(3, this.field437.method465(48, 47, 0, 0));
                        this.field437.method469(3, this.field437.method465(48, 47, 1, 0));
                        this.field437.method469(3, this.field437.method465(48, 148, 0, 0));
                        this.field437.method469(3, this.field437.method465(48, 148, 1, 0));
                        int var20 = this.field437.method472();
                        while (this.field437.method472() > 0) {
                            int var21 = var20 - this.field437.method472();
                            if (var21 > 0) {
                                this.method83(field372, 75, "Loading maps - " + var21 * 100 / var20 + "%");
                            }
                            this.method172(0);
                            try {
                                Thread.sleep(100L);
                            } catch (Exception var66) {
                            }
                        }
                    }
                    int var22 = this.field437.method474(0, 86);
                    for (int var23 = 0; var23 < var22; ++var23) {
                        int var24 = this.field437.method480(16165, var23);
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
                            this.field437.method468((byte) -65, 0, var23, var25);
                        }
                    }
                    this.field437.method478(field317, 806);
                    if (!field318) {
                        int var26 = this.field437.method474(2, 86);
                        for (int var27 = 1; var27 < var26; ++var27) {
                            if (this.field437.method479(var27, (byte) 0)) {
                                this.field437.method468((byte) -65, 2, var27, (byte) 1);
                            }
                        }
                    }
                    this.method83(field372, 80, "Unpacking media");
                    this.field463 = new class3(var6, "invback", 0);
                    this.field465 = new class3(var6, "chatback", 0);
                    this.field464 = new class3(var6, "mapback", 0);
                    this.field431 = new class3(var6, "backbase1", 0);
                    this.field432 = new class3(var6, "backbase2", 0);
                    this.field433 = new class3(var6, "backhmid1", 0);
                    for (int var28 = 0; var28 < 13; ++var28) {
                        this.field244[var28] = new class3(var6, "sideicons", var28);
                    }
                    this.field352 = new class68(var6, "compass", 0);
                    this.field604 = new class68(var6, "mapedge", 0);
                    this.field604.method575(38485);
                    try {
                        for (int var29 = 0; var29 < 100; ++var29) {
                            this.field456[var29] = new class3(var6, "mapscene", var29);
                        }
                    } catch (Exception var74) {
                    }
                    try {
                        for (int var30 = 0; var30 < 100; ++var30) {
                            this.field479[var30] = new class68(var6, "mapfunction", var30);
                        }
                    } catch (Exception var73) {
                    }
                    try {
                        for (int var31 = 0; var31 < 20; ++var31) {
                            this.field249[var31] = new class68(var6, "hitmarks", var31);
                        }
                    } catch (Exception var72) {
                    }
                    try {
                        for (int var32 = 0; var32 < 20; ++var32) {
                            this.field227[var32] = new class68(var6, "headicons", var32);
                        }
                    } catch (Exception var71) {
                    }
                    this.field525 = new class68(var6, "mapmarker", 0);
                    this.field526 = new class68(var6, "mapmarker", 1);
                    for (int var33 = 0; var33 < 8; ++var33) {
                        this.field558[var33] = new class68(var6, "cross", var33);
                    }
                    this.field197 = new class68(var6, "mapdots", 0);
                    this.field198 = new class68(var6, "mapdots", 1);
                    this.field199 = new class68(var6, "mapdots", 2);
                    this.field200 = new class68(var6, "mapdots", 3);
                    this.field201 = new class68(var6, "mapdots", 4);
                    this.field325 = new class3(var6, "scrollbar", 0);
                    this.field326 = new class3(var6, "scrollbar", 1);
                    this.field439 = new class3(var6, "redstone1", 0);
                    this.field440 = new class3(var6, "redstone2", 0);
                    this.field441 = new class3(var6, "redstone3", 0);
                    this.field442 = new class3(var6, "redstone1", 0);
                    this.field442.method10((byte) 5);
                    this.field443 = new class3(var6, "redstone2", 0);
                    this.field443.method10((byte) 5);
                    this.field517 = new class3(var6, "redstone1", 0);
                    this.field517.method11(-689);
                    this.field518 = new class3(var6, "redstone2", 0);
                    this.field518.method11(-689);
                    this.field519 = new class3(var6, "redstone3", 0);
                    this.field519.method11(-689);
                    this.field520 = new class3(var6, "redstone1", 0);
                    this.field520.method10((byte) 5);
                    this.field520.method11(-689);
                    this.field521 = new class3(var6, "redstone2", 0);
                    this.field521.method10((byte) 5);
                    this.field521.method11(-689);
                    for (int var34 = 0; var34 < 2; ++var34) {
                        this.field390[var34] = new class3(var6, "mod_icons", var34);
                    }
                    class68 var35 = new class68(var6, "backleft1", 0);
                    this.field305 = new class50(var35.field1692, 13856, var35.field1691, this.method44((byte) 2));
                    var35.method576(0, 7, 0);
                    class68 var36 = new class68(var6, "backleft2", 0);
                    this.field306 = new class50(var36.field1692, 13856, var36.field1691, this.method44((byte) 2));
                    var36.method576(0, 7, 0);
                    class68 var37 = new class68(var6, "backright1", 0);
                    this.field307 = new class50(var37.field1692, 13856, var37.field1691, this.method44((byte) 2));
                    var37.method576(0, 7, 0);
                    class68 var38 = new class68(var6, "backright2", 0);
                    this.field308 = new class50(var38.field1692, 13856, var38.field1691, this.method44((byte) 2));
                    var38.method576(0, 7, 0);
                    class68 var39 = new class68(var6, "backtop1", 0);
                    this.field309 = new class50(var39.field1692, 13856, var39.field1691, this.method44((byte) 2));
                    var39.method576(0, 7, 0);
                    class68 var40 = new class68(var6, "backvmid1", 0);
                    this.field310 = new class50(var40.field1692, 13856, var40.field1691, this.method44((byte) 2));
                    var40.method576(0, 7, 0);
                    class68 var41 = new class68(var6, "backvmid2", 0);
                    this.field311 = new class50(var41.field1692, 13856, var41.field1691, this.method44((byte) 2));
                    var41.method576(0, 7, 0);
                    class68 var42 = new class68(var6, "backvmid3", 0);
                    this.field312 = new class50(var42.field1692, 13856, var42.field1691, this.method44((byte) 2));
                    var42.method576(0, 7, 0);
                    class68 var43 = new class68(var6, "backhmid2", 0);
                    this.field313 = new class50(var43.field1692, 13856, var43.field1691, this.method44((byte) 2));
                    var43.method576(0, 7, 0);
                    int var44 = (int) (Math.random() * 21.0D) - 10;
                    int var45 = (int) (Math.random() * 21.0D) - 10;
                    int var46 = (int) (Math.random() * 21.0D) - 10;
                    int var47 = (int) (Math.random() * 41.0D) - 20;
                    for (int var48 = 0; var48 < 100; ++var48) {
                        if (this.field479[var48] != null) {
                            this.field479[var48].method574(var44 + var47, var46 + var47, 47, var45 + var47);
                        }
                        if (this.field456[var48] != null) {
                            this.field456[var48].method12(var44 + var47, var46 + var47, 47, var45 + var47);
                        }
                    }
                    this.method83(field372, 83, "Unpacking textures");
                    class58.method499(6, var7);
                    class58.method503((byte) -128, 0.8D);
                    class58.method498((byte) 1, 20);
                    this.method83(field372, 86, "Unpacking config");
                    class71.method590(var4, false);
                    class41.method400(var4);
                    class19.method211(var4, false);
                    class46.method434(var4);
                    class60.method517(var4);
                    class6.method22(var4, false);
                    class9.method30(var4, false);
                    class52.method462(var4, false);
                    class2.method6(var4, false);
                    class46.field1192 = field317;
                    if (!field318) {
                        this.method83(field372, 90, "Unpacking sounds");
                        byte[] var49 = var9.method29("sounds.dat", (byte[]) null);
                        class24 var50 = new class24(0, var49);
                        class12.method203(var50, false);
                    }
                    this.method83(field372, 95, "Unpacking interfaces");
                    class10[] var51 = new class10[] { this.field384, this.field385, this.field386, this.field387 };
                    class48.method450(var5, var51, field245, var6);
                    this.method83(field372, 100, "Preparing game engine");
                    for (int var52 = 0; var52 < 33; ++var52) {
                        int var53 = 999;
                        int var54 = 0;
                        for (int var55 = 0; var55 < 34; ++var55) {
                            if (this.field464.field26[this.field464.field28 * var52 + var55] == 0) {
                                if (var53 == 999) {
                                    var53 = var55;
                                }
                            } else if (var53 != 999) {
                                var54 = var55;
                                break;
                            }
                        }
                        this.field625[var52] = var53;
                        this.field337[var52] = var54 - var53;
                    }
                    for (int var56 = 5; var56 < 156; ++var56) {
                        int var57 = 999;
                        int var58 = 0;
                        for (int var59 = 25; var59 < 172; ++var59) {
                            if (this.field464.field26[this.field464.field28 * var56 + var59] == 0 && (var59 > 34 || var56 > 34)) {
                                if (var57 == 999) {
                                    var57 = var59;
                                }
                            } else if (var57 != 999) {
                                var58 = var59;
                                break;
                            }
                        }
                        this.field527[var56 - 5] = var57 - 25;
                        this.field458[var56 - 5] = var58 - var57;
                    }
                    class58.method496(96, 479, field626);
                    this.field595 = class58.field1478;
                    class58.method496(261, 190, field626);
                    this.field596 = class58.field1478;
                    class58.method496(334, 512, field626);
                    this.field597 = class58.field1478;
                    int[] var60 = new int[9];
                    for (int var61 = 0; var61 < 9; ++var61) {
                        int var62 = var61 * 32 + 128 + 15;
                        int var63 = var62 * 3 + 600;
                        int var64 = class58.field1476[var62];
                        var60[var61] = var63 * var64 >> 16;
                    }
                    class34.method361(500, 800, 0, var60, 334, 512);
                    class29.method280(var8);
                    this.field407 = new class65(6, this);
                    this.method36(this.field407, 10);
                    class15.field712 = this;
                    class41.field1087 = this;
                    class60.field1528 = this;
                } catch (Exception var75) {
                    signlink.reporterror("loaderror " + this.field594 + " " + this.field444);
                    this.field371 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "w", descriptor = "(I)V")
    private final void method117(int arg0) {
        if (arg0 != 6) {
            field626 = !field626;
        }
        for (class16 var2 = (class16) this.field435.method382(); var2 != null; var2 = (class16) this.field435.method384((byte) -96)) {
            if (var2.field723 == -1) {
                var2.field724 = 0;
                this.method50(var2, (byte) 0);
            } else {
                var2.method540();
            }
        }
    }

    @OriginalMember(owner = "client", name = "x", descriptor = "(I)V")
    public final void method118(int arg0) {
        if (this.field336 != 0) {
            int var2 = 0;
            if (this.field582 != 0) {
                var2 = 1;
            }
            for (int var3 = 0; var3 < 100; ++var3) {
                if (this.field340[var3] != null) {
                    int var5 = this.field338[var3];
                    String var6 = this.field339[var3];
                    boolean var7 = false;
                    if (var6 != null && var6.startsWith("@cr1@")) {
                        var6 = var6.substring(5);
                        boolean var8 = true;
                    }
                    if (var6 != null && var6.startsWith("@cr2@")) {
                        var6 = var6.substring(5);
                        boolean var9 = true;
                    }
                    if ((var5 == 3 || var5 == 7) && (var5 == 7 || this.field515 == 0 || this.field515 == 1 && this.method62(var6, this.field538))) {
                        int var10 = 329 - var2 * 13;
                        if (super.field1510 > 4 && super.field1511 - 4 > var10 - 10 && super.field1511 - 4 <= var10 + 3) {
                            int var11 = this.field385.method178(47982, "From:  " + var6 + this.field340[var3]) + 25;
                            if (var11 > 450) {
                                var11 = 450;
                            }
                            if (super.field1510 < var11 + 4) {
                                if (this.field235 >= 1) {
                                    this.field286[this.field203] = "Report abuse @whi@" + var6;
                                    this.field562[this.field203] = 2629;
                                    ++this.field203;
                                }
                                this.field286[this.field203] = "Add ignore @whi@" + var6;
                                this.field562[this.field203] = 2051;
                                ++this.field203;
                                this.field286[this.field203] = "Add friend @whi@" + var6;
                                this.field562[this.field203] = 2079;
                                ++this.field203;
                            }
                        }
                        ++var2;
                        if (var2 >= 5) {
                            return;
                        }
                    }
                    if ((var5 == 5 || var5 == 6) && this.field515 < 2) {
                        ++var2;
                        if (var2 >= 5) {
                            return;
                        }
                    }
                }
            }
            int var4 = 10 / arg0;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LIMUIZRAF;LSJUCHLXH;IIB)V")
    private final void method119(class24 arg0, class49 arg1, int arg2, int arg3, byte arg4) {
        if (arg4 == 1) {
            boolean var6 = false;
        } else {
            this.method116();
        }
        if ((arg2 & 16) != 0) {
            int var7 = arg0.method258(178);
            byte[] var8 = new byte[var7];
            class24 var9 = new class24(0, var8);
            arg0.method274(0, var7, var8, -470);
            this.field514[arg3] = var9;
            arg1.method452(457, var9);
        }
        if ((arg2 & 8) != 0) {
            int var10 = arg0.method257(true);
            int var11 = arg0.method258(178);
            arg1.method18(0, var11, field609, var10);
            arg1.field92 = field609 + 300;
            arg1.field93 = arg0.method258(178);
            arg1.field94 = arg0.method257(true);
        }
        if ((arg2 & 128) != 0) {
            int var12 = arg0.method267(628);
            if (var12 == 65535) {
                var12 = -1;
            }
            int var13 = arg0.method238();
            if (arg1.field41 == var12 && var12 != -1) {
                int var14 = class71.field1705[var12].field1719;
                if (var14 == 1) {
                    arg1.field42 = 0;
                    arg1.field43 = 0;
                    arg1.field44 = var13;
                    arg1.field45 = 0;
                }
                if (var14 == 2) {
                    arg1.field45 = 0;
                }
            } else if (var12 == -1 || arg1.field41 == -1 || class71.field1705[var12].field1713 >= class71.field1705[arg1.field41].field1713) {
                arg1.field41 = var12;
                arg1.field42 = 0;
                arg1.field43 = 0;
                arg1.field44 = var13;
                arg1.field45 = 0;
                arg1.field59 = arg1.field78;
            }
        }
        if ((arg2 & 32) != 0) {
            arg1.field46 = arg0.method240();
            if (arg1.field46 == 65535) {
                arg1.field46 = -1;
            }
        }
        if ((arg2 & 256) != 0) {
            int var15 = arg0.method259(false);
            int var16 = arg0.method259(false);
            arg1.method18(0, var16, field609, var15);
            arg1.field92 = field609 + 300;
            arg1.field93 = arg0.method238();
            arg1.field94 = arg0.method259(false);
        }
        if ((arg2 & 512) != 0) {
            arg1.field60 = arg0.method238();
            arg1.field62 = arg0.method238();
            arg1.field61 = arg0.method259(false);
            arg1.field63 = arg0.method238();
            arg1.field64 = arg0.method240() + field609;
            arg1.field65 = arg0.method267(628) + field609;
            arg1.field66 = arg0.method238();
            arg1.method17(6);
        }
        if ((arg2 & 64) != 0) {
            int var17 = arg0.method267(628);
            int var18 = arg0.method259(false);
            int var19 = arg0.method238();
            int var20 = arg0.field832;
            if (arg1.field1302 != null && arg1.field1287) {
                long var21 = class31.method318(arg1.field1302);
                boolean var23 = false;
                if (var18 <= 1) {
                    for (int var24 = 0; var24 < this.field448; ++var24) {
                        if (this.field225[var24] == var21) {
                            var23 = true;
                            break;
                        }
                    }
                }
                if (!var23 && this.field565 == 0) {
                    try {
                        this.field282.field832 = 0;
                        arg0.method275(this.field282.field831, 5, 0, var19);
                        this.field282.field832 = 0;
                        String var25 = class26.method276(this.field612, this.field282, var19);
                        String var26 = class29.method290(var25, 852);
                        arg1.field77 = var26;
                        arg1.field54 = var17 >> 8;
                        arg1.field80 = var17 & 255;
                        arg1.field58 = 150;
                        if (var18 != 2 && var18 != 3) {
                            if (var18 == 1) {
                                this.method125(1, "@cr1@" + arg1.field1302, var26, (byte) 5);
                            } else {
                                this.method125(2, arg1.field1302, var26, (byte) 5);
                            }
                        } else {
                            this.method125(1, "@cr2@" + arg1.field1302, var26, (byte) 5);
                        }
                    } catch (Exception var29) {
                        signlink.reporterror("cde2");
                    }
                }
            }
            arg0.field832 = var19 + var20;
        }
        if ((arg2 & 2) != 0) {
            arg1.field77 = arg0.method245();
            if (arg1.field77.charAt(0) == '~') {
                arg1.field77 = arg1.field77.substring(1);
                this.method125(2, arg1.field1302, arg1.field77, (byte) 5);
            } else if (field189 == arg1) {
                this.method125(2, arg1.field1302, arg1.field77, (byte) 5);
            }
            arg1.field54 = 0;
            arg1.field80 = 0;
            arg1.field58 = 150;
        }
        if ((arg2 & 1) != 0) {
            arg1.field55 = arg0.method240();
            arg1.field56 = arg0.method240();
        }
        if ((arg2 & 1024) != 0) {
            arg1.field82 = arg0.method240();
            int var28 = arg0.method271(4);
            arg1.field86 = var28 >> 16;
            arg1.field85 = (var28 & 65535) + field609;
            arg1.field83 = 0;
            arg1.field84 = 0;
            if (arg1.field85 > field609) {
                arg1.field83 = -1;
            }
            if (arg1.field82 == 65535) {
                arg1.field82 = -1;
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "y", descriptor = "(I)V")
    public final void method120(int arg0) {
        this.field615.method455(9133);
        if (this.field369 == 2) {
            byte[] var2 = this.field464.field26;
            int[] var3 = class11.field648;
            int var4 = var2.length;
            for (int var5 = 0; var5 < var4; ++var5) {
                if (var2[var5] == 0) {
                    var3[var5] = 0;
                }
            }
            this.field352.method582(0, this.field413, 33, this.field337, 25, 0, 0, 33, 256, this.field625, 25);
            this.field616.method455(9133);
        } else {
            int var6 = this.field413 + this.field319 & 2047;
            int var7 = field189.field51 / 32 + 48;
            int var8 = 464 - field189.field52 / 32;
            this.field478.method582(0, var6, 151, this.field458, var7, 5, 25, 146, this.field287 + 256, this.field527, var8);
            if (arg0 == 0) {
                this.field352.method582(0, this.field413, 33, this.field337, 25, 0, 0, 33, 256, this.field625, 25);
                for (int var9 = 0; var9 < this.field236; ++var9) {
                    int var39 = this.field237[var9] * 4 + 2 - field189.field51 / 32;
                    int var40 = this.field238[var9] * 4 + 2 - field189.field52 / 32;
                    this.method37((byte) -98, var39, this.field418[var9], var40);
                }
                for (int var10 = 0; var10 < 104; ++var10) {
                    for (int var35 = 0; var35 < 104; ++var35) {
                        class38 var36 = this.field290[this.field303][var10][var35];
                        if (var36 != null) {
                            int var37 = var10 * 4 + 2 - field189.field51 / 32;
                            int var38 = var35 * 4 + 2 - field189.field52 / 32;
                            this.method37((byte) -98, var37, this.field197, var38);
                        }
                    }
                }
                for (int var11 = 0; var11 < this.field284; ++var11) {
                    class37 var31 = this.field283[this.field285[var11]];
                    if (var31 != null && var31.method21(0)) {
                        class60 var32 = var31.field1044;
                        if (var32.field1549 != null) {
                            var32 = var32.method518(-13525);
                        }
                        if (var32 != null && var32.field1526 && var32.field1545) {
                            int var33 = var31.field51 / 32 - field189.field51 / 32;
                            int var34 = var31.field52 / 32 - field189.field52 / 32;
                            this.method37((byte) -98, var33, this.field198, var34);
                        }
                    }
                }
                for (int var12 = 0; var12 < this.field510; ++var12) {
                    class49 var23 = this.field509[this.field511[var12]];
                    if (var23 != null && var23.method21(0)) {
                        int var24 = var23.field51 / 32 - field189.field51 / 32;
                        int var25 = var23.field52 / 32 - field189.field52 / 32;
                        boolean var26 = false;
                        long var27 = class31.method318(var23.field1302);
                        for (int var29 = 0; var29 < this.field578; ++var29) {
                            if (this.field343[var29] == var27 && this.field522[var29] != 0) {
                                var26 = true;
                                break;
                            }
                        }
                        boolean var30 = false;
                        if (field189.field1288 != 0 && var23.field1288 != 0 && field189.field1288 == var23.field1288) {
                            var30 = true;
                        }
                        if (var26) {
                            this.method37((byte) -98, var24, this.field200, var25);
                        } else if (var30) {
                            this.method37((byte) -98, var24, this.field201, var25);
                        } else {
                            this.method37((byte) -98, var24, this.field199, var25);
                        }
                    }
                }
                if (this.field345 != 0 && field609 % 20 < 10) {
                    if (this.field345 == 1 && this.field535 >= 0 && this.field535 < this.field283.length) {
                        class37 var13 = this.field283[this.field535];
                        if (var13 != null) {
                            int var14 = var13.field51 / 32 - field189.field51 / 32;
                            int var15 = var13.field52 / 32 - field189.field52 / 32;
                            this.method81(this.field526, var14, this.field204, var15);
                        }
                    }
                    if (this.field345 == 2) {
                        int var16 = (this.field573 - this.field330) * 4 + 2 - field189.field51 / 32;
                        int var17 = (this.field574 - this.field331) * 4 + 2 - field189.field52 / 32;
                        this.method81(this.field526, var16, this.field204, var17);
                    }
                    if (this.field345 == 10 && this.field375 >= 0 && this.field375 < this.field509.length) {
                        class49 var18 = this.field509[this.field375];
                        if (var18 != null) {
                            int var19 = var18.field51 / 32 - field189.field51 / 32;
                            int var20 = var18.field52 / 32 - field189.field52 / 32;
                            this.method81(this.field526, var19, this.field204, var20);
                        }
                    }
                }
                if (this.field476 != 0) {
                    int var21 = this.field476 * 4 + 2 - field189.field51 / 32;
                    int var22 = this.field477 * 4 + 2 - field189.field52 / 32;
                    this.method37((byte) -98, var21, this.field525, var22);
                }
                class11.method196(16777215, 97, 3, 3, 78, 3);
                this.field616.method455(9133);
            }
        }
    }

    @OriginalMember(owner = "client", name = "j", descriptor = "(B)V")
    public final void method121(byte arg0) {
        if (arg0 == 8) {
            boolean var2 = false;
            if (this.field543 == null) {
                super.field1503 = null;
                this.field617 = null;
                this.field615 = null;
                this.field614 = null;
                this.field616 = null;
                this.field165 = null;
                this.field166 = null;
                this.field167 = null;
                this.field546 = new class50(265, 13856, 128, this.method44((byte) 2));
                class11.method194(-27727);
                this.field547 = new class50(265, 13856, 128, this.method44((byte) 2));
                class11.method194(-27727);
                this.field543 = new class50(171, 13856, 509, this.method44((byte) 2));
                class11.method194(-27727);
                this.field544 = new class50(132, 13856, 360, this.method44((byte) 2));
                class11.method194(-27727);
                this.field545 = new class50(200, 13856, 360, this.method44((byte) 2));
                class11.method194(-27727);
                this.field548 = new class50(238, 13856, 202, this.method44((byte) 2));
                class11.method194(-27727);
                this.field549 = new class50(238, 13856, 203, this.method44((byte) 2));
                class11.method194(-27727);
                this.field550 = new class50(94, 13856, 74, this.method44((byte) 2));
                class11.method194(-27727);
                this.field551 = new class50(94, 13856, 75, this.method44((byte) 2));
                class11.method194(-27727);
                if (this.field296 != null) {
                    this.method89(-930);
                    this.method35((byte) 59);
                }
                this.field611 = true;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BI)Z")
    public final boolean method122(byte arg0, int arg1) {
        if (arg1 < 0) {
            return false;
        } else {
            int var3 = this.field562[arg1];
            if (arg0 != -101) {
                this.field240 = this.field569.method541();
            }
            if (var3 >= 2000) {
                var3 -= 2000;
            }
            return var3 == 79;
        }
    }

    @OriginalMember(owner = "client", name = "k", descriptor = "(B)Z")
    public final boolean method123(byte arg0) {
        if (arg0 != 74) {
            this.field497 = this.field246.method238();
        }
        if (this.field396 == null) {
            return false;
        } else {
            try {
                int var2 = this.field396.method222();
                if (var2 == 0) {
                    return false;
                }
                if (this.field497 == -1) {
                    this.field396.method223(this.field246.field831, 0, 1);
                    this.field497 = this.field246.field831[0] & 255;
                    if (this.field569 != null) {
                        this.field497 = this.field497 - this.field569.method541() & 255;
                    }
                    this.field496 = class35.field1013[this.field497];
                    --var2;
                }
                if (this.field496 == -1) {
                    if (var2 <= 0) {
                        return false;
                    }
                    this.field396.method223(this.field246.field831, 0, 1);
                    this.field496 = this.field246.field831[0] & 255;
                    --var2;
                }
                if (this.field496 == -2) {
                    if (var2 <= 1) {
                        return false;
                    }
                    this.field396.method223(this.field246.field831, 0, 2);
                    this.field246.field832 = 0;
                    this.field496 = this.field246.method240();
                    var2 -= 2;
                }
                if (var2 < this.field496) {
                    return false;
                }
                this.field246.field832 = 0;
                this.field396.method223(this.field246.field831, 0, this.field496);
                this.field498 = 0;
                this.field360 = this.field359;
                this.field359 = this.field358;
                this.field358 = this.field497;
                if (this.field497 == 44) {
                    this.field369 = this.field246.method238();
                    this.field497 = -1;
                    return true;
                }
                if (this.field497 == 117) {
                    int var3 = this.field246.method265(0);
                    this.method129(var3, (byte) 4);
                    if (this.field221 != -1) {
                        this.field221 = -1;
                        this.field212 = true;
                    }
                    if (this.field492 != 0) {
                        this.field492 = 0;
                        this.field212 = true;
                    }
                    this.field395 = var3;
                    this.field589 = true;
                    this.field354 = true;
                    this.field262 = -1;
                    this.field298 = false;
                    this.field497 = -1;
                    return true;
                }
                if (this.field497 == 253) {
                    this.field605 = true;
                    this.field620 = this.field246.method238();
                    this.field621 = this.field246.method238();
                    this.field622 = this.field246.method240();
                    this.field623 = this.field246.method238();
                    this.field624 = this.field246.method238();
                    if (this.field624 >= 100) {
                        this.field230 = this.field620 * 128 + 64;
                        this.field232 = this.field621 * 128 + 64;
                        this.field231 = this.method84(false, this.field232, this.field303, this.field230) - this.field622;
                    }
                    this.field497 = -1;
                    return true;
                }
                if (this.field497 == 177) {
                    String var4 = this.field246.method245();
                    if (var4.endsWith(":tradereq:")) {
                        String var5 = var4.substring(0, var4.indexOf(":"));
                        long var6 = class31.method318(var5);
                        boolean var8 = false;
                        for (int var9 = 0; var9 < this.field448; ++var9) {
                            if (this.field225[var9] == var6) {
                                var8 = true;
                                break;
                            }
                        }
                        if (!var8 && this.field565 == 0) {
                            this.method125(4, var5, "wishes to trade with you.", (byte) 5);
                        }
                    } else if (var4.endsWith(":duelreq:")) {
                        String var10 = var4.substring(0, var4.indexOf(":"));
                        long var11 = class31.method318(var10);
                        boolean var13 = false;
                        for (int var14 = 0; var14 < this.field448; ++var14) {
                            if (this.field225[var14] == var11) {
                                var13 = true;
                                break;
                            }
                        }
                        if (!var13 && this.field565 == 0) {
                            this.method125(8, var10, "wishes to duel with you.", (byte) 5);
                        }
                    } else if (!var4.endsWith(":chalreq:")) {
                        this.method125(0, "", var4, (byte) 5);
                    } else {
                        String var15 = var4.substring(0, var4.indexOf(":"));
                        long var16 = class31.method318(var15);
                        boolean var18 = false;
                        for (int var19 = 0; var19 < this.field448; ++var19) {
                            if (this.field225[var19] == var16) {
                                var18 = true;
                                break;
                            }
                        }
                        if (!var18 && this.field565 == 0) {
                            String var20 = var4.substring(var4.indexOf(":") + 1, var4.length() - 9);
                            this.method125(8, var15, var20, (byte) 5);
                        }
                    }
                    this.field497 = -1;
                    return true;
                }
                if (this.field497 == 179) {
                    this.field476 = 0;
                    this.field497 = -1;
                    return true;
                }
                if (this.field497 == 254) {
                    int var21 = this.field246.method265(0);
                    int var22 = this.field246.method268((byte) 5);
                    class48 var23 = class48.field1219[var21];
                    var23.field1237 = var22;
                    if (var22 == -1) {
                        var23.field1217 = 0;
                        var23.field1222 = 0;
                    }
                    this.field497 = -1;
                    return true;
                }
                if (this.field497 == 239) {
                    int var24 = this.field246.method266(2);
                    class48.field1219[var24].field1241 = 3;
                    if (field189.field1296 == null) {
                        class48.field1219[var24].field1242 = (field189.field1286[11] << 5) + (field189.field1286[8] << 10) + (field189.field1286[0] << 15) + (field189.field1311[0] << 25) + (field189.field1311[4] << 20) + field189.field1286[1];
                    } else {
                        class48.field1219[var24].field1242 = (int) (field189.field1296.field1546 + 305419896L);
                    }
                    this.field497 = -1;
                    return true;
                }
                if (this.field497 == 62) {
                    this.field448 = this.field496 / 8;
                    for (int var25 = 0; var25 < this.field448; ++var25) {
                        this.field225[var25] = this.field246.method244((byte) 0);
                    }
                    this.field497 = -1;
                    return true;
                }
                if (this.field497 == 156) {
                    this.field589 = true;
                    int var26 = this.field246.method240();
                    class48 var27 = class48.field1219[var26];
                    while (this.field246.field832 < this.field496) {
                        int var28 = this.field246.method252();
                        int var29 = this.field246.method240();
                        int var30 = this.field246.method238();
                        if (var30 == 255) {
                            var30 = this.field246.method243();
                        }
                        if (var28 >= 0 && var28 < var27.field1256.length) {
                            var27.field1256[var28] = var29;
                            var27.field1218[var28] = var30;
                        }
                    }
                    this.field497 = -1;
                    return true;
                }
                if (this.field497 == 22) {
                    this.field591 = this.field246.method259(false);
                    this.field589 = true;
                    this.field354 = true;
                    this.field497 = -1;
                    return true;
                }
                if (this.field497 == 144) {
                    for (int var31 = 0; var31 < this.field216.length; ++var31) {
                        if (this.field590[var31] != this.field216[var31]) {
                            this.field216[var31] = this.field590[var31];
                            this.method63(this.field334, var31);
                            this.field589 = true;
                        }
                    }
                    this.field497 = -1;
                    return true;
                }
                if (this.field497 == 163) {
                    if (this.field395 != -1) {
                        this.field395 = -1;
                        this.field589 = true;
                        this.field354 = true;
                    }
                    if (this.field221 != -1) {
                        this.field221 = -1;
                        this.field212 = true;
                    }
                    if (this.field492 != 0) {
                        this.field492 = 0;
                        this.field212 = true;
                    }
                    this.field262 = -1;
                    this.field298 = false;
                    this.field497 = -1;
                    return true;
                }
                if (this.field497 == 86) {
                    int var32 = this.field246.method265(0);
                    int var33 = this.field246.method266(2);
                    int var34 = this.field246.method240();
                    class48.field1219[var34].field1278 = (var33 << 16) + var32;
                    this.field497 = -1;
                    return true;
                }
                if (this.field497 == 69) {
                    this.method101(963, this.field496, this.field246);
                    this.field504 = false;
                    this.field497 = -1;
                    return true;
                }
                if (this.field497 == 155) {
                    long var35 = this.field246.method244((byte) 0);
                    int var37 = this.field246.method238();
                    String var38 = class31.method322(true, class31.method319(-602, var35));
                    for (int var39 = 0; var39 < this.field578; ++var39) {
                        if (this.field343[var39] == var35) {
                            if (this.field522[var39] != var37) {
                                this.field522[var39] = var37;
                                this.field589 = true;
                                if (var37 > 0) {
                                    this.method125(5, "", var38 + " has logged in.", (byte) 5);
                                }
                                if (var37 == 0) {
                                    this.method125(5, "", var38 + " has logged out.", (byte) 5);
                                }
                            }
                            var38 = null;
                            break;
                        }
                    }
                    if (var38 != null && this.field578 < 200) {
                        this.field343[this.field578] = var35;
                        this.field419[this.field578] = var38;
                        this.field522[this.field578] = var37;
                        ++this.field578;
                        this.field589 = true;
                    }
                    boolean var40 = false;
                    while (!var40) {
                        var40 = true;
                        for (int var41 = 0; var41 < this.field578 - 1; ++var41) {
                            if (this.field522[var41] != field315 && this.field522[var41 + 1] == field315 || this.field522[var41] == 0 && this.field522[var41 + 1] != 0) {
                                int var42 = this.field522[var41];
                                this.field522[var41] = this.field522[var41 + 1];
                                this.field522[var41 + 1] = var42;
                                String var43 = this.field419[var41];
                                this.field419[var41] = this.field419[var41 + 1];
                                this.field419[var41 + 1] = var43;
                                long var44 = this.field343[var41];
                                this.field343[var41] = this.field343[var41 + 1];
                                this.field343[var41 + 1] = var44;
                                this.field589 = true;
                                var40 = false;
                            }
                        }
                    }
                    this.field497 = -1;
                    return true;
                }
                if (this.field497 == 213) {
                    this.method42(-611, this.field496, this.field246);
                    this.field497 = -1;
                    return true;
                }
                if (this.field497 == 60) {
                    int var46 = this.field246.method267(628);
                    int var47 = this.field246.method240();
                    int var48 = this.field246.method265(0);
                    int var49 = this.field246.method267(628);
                    class48.field1219[var48].field1232 = var49;
                    class48.field1219[var48].field1233 = var47;
                    class48.field1219[var48].field1231 = var46;
                    this.field497 = -1;
                    return true;
                }
                if (this.field497 == 153) {
                    this.field404 = this.field246.method240();
                    this.field532 = this.field246.method259(false);
                    this.field497 = -1;
                    return true;
                }
                if (this.field497 == 85) {
                    byte var50 = this.field246.method261(322);
                    int var51 = this.field246.method265(0);
                    this.field590[var51] = var50;
                    if (this.field216[var51] != var50) {
                        this.field216[var51] = var50;
                        this.method63(this.field334, var51);
                        this.field589 = true;
                        if (this.field462 != -1) {
                            this.field212 = true;
                        }
                    }
                    this.field497 = -1;
                    return true;
                }
                if (this.field497 == 252) {
                    this.field582 = this.field246.method240() * 30;
                    this.field497 = -1;
                    return true;
                }
                if (this.field497 != 66 && this.field497 != 97) {
                    if (this.field497 == 6) {
                        int var102 = this.field246.method266(2);
                        int var103 = this.field246.method240();
                        class48 var104 = class48.field1219[var103];
                        if (var104 != null && var104.field1269 == 0) {
                            if (var102 < 0) {
                                var102 = 0;
                            }
                            if (var102 > var104.field1215 - var104.field1267) {
                                var102 = var104.field1215 - var104.field1267;
                            }
                            var104.field1266 = var102;
                        }
                        this.field497 = -1;
                        return true;
                    }
                    if (this.field497 != 76 && this.field497 != 147 && this.field497 != 54 && this.field497 != 243 && this.field497 != 100 && this.field497 != 96 && this.field497 != 9 && this.field497 != 107 && this.field497 != 222 && this.field497 != 211 && this.field497 != 94) {
                        if (this.field497 == 64) {
                            this.field345 = this.field246.method238();
                            if (this.field345 == 1) {
                                this.field535 = this.field246.method240();
                            }
                            if (this.field345 >= 2 && this.field345 <= 6) {
                                if (this.field345 == 2) {
                                    this.field576 = 64;
                                    this.field577 = 64;
                                }
                                if (this.field345 == 3) {
                                    this.field576 = 0;
                                    this.field577 = 64;
                                }
                                if (this.field345 == 4) {
                                    this.field576 = 128;
                                    this.field577 = 64;
                                }
                                if (this.field345 == 5) {
                                    this.field576 = 64;
                                    this.field577 = 0;
                                }
                                if (this.field345 == 6) {
                                    this.field576 = 64;
                                    this.field577 = 128;
                                }
                                this.field345 = 2;
                                this.field573 = this.field246.method240();
                                this.field574 = this.field246.method240();
                                this.field575 = this.field246.method238();
                            }
                            if (this.field345 == 10) {
                                this.field375 = this.field246.method240();
                            }
                            this.field497 = -1;
                            return true;
                        }
                        if (this.field497 == 16) {
                            int var105 = this.field246.method266(2);
                            class48 var106 = class48.field1219[var105];
                            for (int var107 = 0; var107 < var106.field1256.length; ++var107) {
                                var106.field1256[var107] = -1;
                                var106.field1256[var107] = 0;
                            }
                            this.field497 = -1;
                            return true;
                        }
                        if (this.field497 == 152) {
                            int var108 = this.field246.method240();
                            this.method129(var108, (byte) 4);
                            if (this.field395 != -1) {
                                this.field395 = -1;
                                this.field589 = true;
                                this.field354 = true;
                            }
                            this.field221 = var108;
                            this.field212 = true;
                            this.field262 = -1;
                            this.field298 = false;
                            this.field497 = -1;
                            return true;
                        }
                        if (this.field497 == 40) {
                            this.method166(true);
                            this.field497 = -1;
                            return false;
                        }
                        if (this.field497 == 208) {
                            this.field592 = this.field246.method238();
                            this.field497 = -1;
                            return true;
                        }
                        if (this.field497 == 203) {
                            int var109 = this.field246.method240();
                            int var110 = this.field246.method266(2);
                            int var111 = this.field246.method267(628);
                            if (var111 == 65535) {
                                class48.field1219[var109].field1241 = 0;
                                this.field497 = -1;
                                return true;
                            }
                            class46 var112 = class46.method438(var111);
                            class48.field1219[var109].field1241 = 4;
                            class48.field1219[var109].field1242 = var111;
                            class48.field1219[var109].field1232 = var112.field1179;
                            class48.field1219[var109].field1233 = var112.field1169;
                            class48.field1219[var109].field1231 = var112.field1187 * 100 / var110;
                            this.field497 = -1;
                            return true;
                        }
                        if (this.field497 == 240) {
                            int var113 = this.field246.method240();
                            int var114 = this.field246.method240();
                            class48.field1219[var114].field1241 = 2;
                            class48.field1219[var114].field1242 = var113;
                            this.field497 = -1;
                            return true;
                        }
                        if (this.field497 == 204) {
                            boolean var115 = this.field246.method259(false) == 1;
                            int var116 = this.field246.method265(0);
                            class48.field1219[var116].field1225 = var115;
                            this.field497 = -1;
                            return true;
                        }
                        if (this.field497 == 205) {
                            int var117 = this.field246.method266(2);
                            if (var117 == 65535) {
                                var117 = -1;
                            }
                            if (this.field377 != var117 && this.field195 && !field318 && this.field222 == 0) {
                                this.field346 = var117;
                                this.field347 = true;
                                this.field437.method469(2, this.field346);
                            }
                            this.field377 = var117;
                            this.field497 = -1;
                            return true;
                        }
                        if (this.field497 == 194) {
                            int var118 = this.field246.method240();
                            int var119 = this.field246.method242();
                            if (this.field195 && !field318) {
                                this.field346 = var118;
                                this.field347 = false;
                                this.field437.method469(2, this.field346);
                                this.field222 = var119;
                            }
                            this.field497 = -1;
                            return true;
                        }
                        if (this.field497 == 73) {
                            if (this.field591 == 12) {
                                this.field589 = true;
                            }
                            this.field470 = this.field246.method238();
                            this.field497 = -1;
                            return true;
                        }
                        if (this.field497 == 167) {
                            String var120 = this.field246.method245();
                            int var121 = this.field246.method266(2);
                            class48.field1219[var121].field1220 = var120;
                            if (this.field445[this.field591] == class48.field1219[var121].field1228) {
                                this.field589 = true;
                            }
                            this.field497 = -1;
                            return true;
                        }
                        if (this.field497 == 180) {
                            String var122 = this.field246.method245();
                            int var123 = this.field246.method258(178);
                            int var124 = this.field246.method257(true);
                            if (var124 >= 1 && var124 <= 5) {
                                if (var122.equalsIgnoreCase("null")) {
                                    var122 = null;
                                }
                                this.field505[var124 - 1] = var122;
                                this.field506[var124 - 1] = var123 == 0;
                            }
                            this.field497 = -1;
                            return true;
                        }
                        if (this.field497 == 224) {
                            int var125 = this.field246.method238();
                            int var126 = this.field246.method238();
                            int var127 = this.field246.method238();
                            int var128 = this.field246.method238();
                            this.field398[var125] = true;
                            this.field322[var125] = var126;
                            this.field206[var125] = var127;
                            this.field205[var125] = var128;
                            this.field314[var125] = 0;
                            this.field497 = -1;
                            return true;
                        }
                        if (this.field497 == 114) {
                            int var129 = this.field246.method240();
                            int var130 = this.field246.method238();
                            int var131 = this.field246.method240();
                            if (this.field351 && !field318 && this.field297 < 50) {
                                this.field229[this.field297] = var129;
                                this.field214[this.field297] = var130;
                                this.field399[this.field297] = class12.field663[var129] + var131;
                                ++this.field297;
                            }
                            this.field497 = -1;
                            return true;
                        }
                        if (this.field497 == 4) {
                            int var132 = this.field246.method241();
                            int var133 = this.field246.method266(2);
                            int var134 = this.field246.method268((byte) 5);
                            class48 var135 = class48.field1219[var133];
                            var135.field1271 = var132;
                            var135.field1274 = var134;
                            this.field497 = -1;
                            return true;
                        }
                        if (this.field497 == 41) {
                            int var136 = this.field246.method238();
                            int var137 = this.field246.method240();
                            if (var137 == 65535) {
                                var137 = -1;
                            }
                            this.field445[var136] = var137;
                            this.field589 = true;
                            this.field354 = true;
                            this.field497 = -1;
                            return true;
                        }
                        if (this.field497 == 226) {
                            this.field589 = true;
                            int var138 = this.field246.method240();
                            class48 var139 = class48.field1219[var138];
                            int var140 = this.field246.method240();
                            for (int var141 = 0; var141 < var140; ++var141) {
                                var139.field1256[var141] = this.field246.method267(628);
                                int var142 = this.field246.method259(false);
                                if (var142 == 255) {
                                    var142 = this.field246.method272(this.field503);
                                }
                                var139.field1218[var141] = var142;
                            }
                            for (int var143 = var140; var143 < var139.field1256.length; ++var143) {
                                var139.field1256[var143] = 0;
                                var139.field1218[var143] = 0;
                            }
                            this.field497 = -1;
                            return true;
                        }
                        if (this.field497 == 170) {
                            int var144 = this.field246.method270(false);
                            int var145 = this.field246.method267(628);
                            this.field590[var145] = var144;
                            if (this.field216[var145] != var144) {
                                this.field216[var145] = var144;
                                this.method63(this.field334, var145);
                                this.field589 = true;
                                if (this.field462 != -1) {
                                    this.field212 = true;
                                }
                            }
                            this.field497 = -1;
                            return true;
                        }
                        if (this.field497 == 88) {
                            if (this.field591 == 12) {
                                this.field589 = true;
                            }
                            this.field247 = this.field246.method241();
                            this.field497 = -1;
                            return true;
                        }
                        if (this.field497 == 32) {
                            int var146 = this.field246.method265(0);
                            int var147 = this.field246.method267(628);
                            int var148 = var147 >> 10 & 31;
                            int var149 = var147 >> 5 & 31;
                            int var150 = var147 & 31;
                            class48.field1219[var146].field1230 = (var150 << 3) + (var148 << 19) + (var149 << 11);
                            this.field497 = -1;
                            return true;
                        }
                        if (this.field497 == 238) {
                            this.field605 = true;
                            this.field274 = this.field246.method238();
                            this.field275 = this.field246.method238();
                            this.field276 = this.field246.method240();
                            this.field277 = this.field246.method238();
                            this.field278 = this.field246.method238();
                            if (this.field278 >= 100) {
                                int var151 = this.field274 * 128 + 64;
                                int var152 = this.field275 * 128 + 64;
                                int var153 = this.method84(false, var152, this.field303, var151) - this.field276;
                                int var154 = var151 - this.field230;
                                int var155 = var153 - this.field231;
                                int var156 = var152 - this.field232;
                                int var157 = (int) Math.sqrt((double) (var154 * var154 + var156 * var156));
                                this.field233 = (int) (Math.atan2((double) var155, (double) var157) * 325.949D) & 2047;
                                this.field234 = (int) (Math.atan2((double) var154, (double) var156) * -325.949D) & 2047;
                                if (this.field233 < 128) {
                                    this.field233 = 128;
                                }
                                if (this.field233 > 383) {
                                    this.field233 = 383;
                                }
                            }
                            this.field497 = -1;
                            return true;
                        }
                        if (this.field497 == 98) {
                            int var158 = this.field246.method269(0);
                            if (var158 >= 0) {
                                this.method129(var158, (byte) 4);
                            }
                            this.field391 = var158;
                            this.field497 = -1;
                            return true;
                        }
                        if (this.field497 == 131) {
                            this.field349 = this.field246.method257(true);
                            this.field350 = this.field246.method258(178);
                            this.field497 = -1;
                            return true;
                        }
                        if (this.field497 == 166) {
                            this.field250 = this.field246.method270(false);
                            this.field300 = this.field246.method238();
                            this.field403 = this.field246.method267(628);
                            this.field342 = this.field246.method265(0);
                            this.field294 = this.field246.method258(178);
                            if (this.field250 != 0 && this.field262 == -1) {
                                signlink.dnslookup(class31.method321(true, this.field250));
                                this.method76(188);
                                short var159 = 650;
                                if (this.field300 != 201 || this.field294 == 1) {
                                    var159 = 655;
                                }
                                this.field248 = "";
                                this.field406 = false;
                                for (int var160 = 0; var160 < class48.field1219.length; ++var160) {
                                    if (class48.field1219[var160] != null && class48.field1219[var160].field1268 == var159) {
                                        this.field262 = class48.field1219[var160].field1228;
                                        break;
                                    }
                                }
                            }
                            this.field497 = -1;
                            return true;
                        }
                        if (this.field497 == 67) {
                            long var161 = this.field246.method244((byte) 0);
                            int var163 = this.field246.method243();
                            int var164 = this.field246.method238();
                            boolean var165 = false;
                            for (int var166 = 0; var166 < 100; ++var166) {
                                if (this.field188[var166] == var163) {
                                    var165 = true;
                                    break;
                                }
                            }
                            if (var164 <= 1) {
                                for (int var167 = 0; var167 < this.field448; ++var167) {
                                    if (this.field225[var167] == var161) {
                                        var165 = true;
                                        break;
                                    }
                                }
                            }
                            if (!var165 && this.field565 == 0) {
                                try {
                                    this.field188[this.field568] = var163;
                                    this.field568 = (this.field568 + 1) % 100;
                                    String var168 = class26.method276(this.field612, this.field246, this.field496 - 13);
                                    if (var164 != 3) {
                                        var168 = class29.method290(var168, 852);
                                    }
                                    if (var164 != 2 && var164 != 3) {
                                        if (var164 == 1) {
                                            this.method125(7, "@cr1@" + class31.method322(true, class31.method319(-602, var161)), var168, (byte) 5);
                                        } else {
                                            this.method125(3, class31.method322(true, class31.method319(-602, var161)), var168, (byte) 5);
                                        }
                                    } else {
                                        this.method125(7, "@cr2@" + class31.method322(true, class31.method319(-602, var161)), var168, (byte) 5);
                                    }
                                } catch (Exception var190) {
                                    signlink.reporterror("cde1");
                                }
                            }
                            this.field497 = -1;
                            return true;
                        }
                        if (this.field497 == 87) {
                            this.field349 = this.field246.method259(false);
                            this.field350 = this.field246.method238();
                            while (this.field246.field832 < this.field496) {
                                int var170 = this.field246.method238();
                                this.method127(var170, this.field246, false);
                            }
                            this.field497 = -1;
                            return true;
                        }
                        if (this.field497 == 115) {
                            this.field392 = this.field246.method257(true);
                            if (this.field591 == this.field392) {
                                if (this.field392 == 3) {
                                    this.field591 = 1;
                                } else {
                                    this.field591 = 3;
                                }
                                this.field589 = true;
                            }
                            this.field497 = -1;
                            return true;
                        }
                        if (this.field497 == 0) {
                            this.field424 = false;
                            this.field492 = 2;
                            this.field467 = "";
                            this.field212 = true;
                            this.field497 = -1;
                            return true;
                        }
                        if (this.field497 == 199) {
                            this.field605 = false;
                            for (int var171 = 0; var171 < 5; ++var171) {
                                this.field398[var171] = false;
                            }
                            this.field497 = -1;
                            return true;
                        }
                        if (this.field497 == 154) {
                            this.field421 = this.field246.method238();
                            this.field515 = this.field246.method238();
                            this.field488 = this.field246.method238();
                            this.field176 = true;
                            this.field212 = true;
                            this.field497 = -1;
                            return true;
                        }
                        if (this.field497 == 17) {
                            this.field579 = this.field246.method238();
                            this.field589 = true;
                            this.field497 = -1;
                            return true;
                        }
                        if (this.field497 == 92) {
                            int var172 = this.field246.method241();
                            this.field462 = var172;
                            this.field212 = true;
                            this.field497 = -1;
                            return true;
                        }
                        if (this.field497 == 113) {
                            int var173 = this.field246.method266(2);
                            int var174 = this.field246.method240();
                            class48.field1219[var174].field1241 = 1;
                            class48.field1219[var174].field1242 = var173;
                            this.field497 = -1;
                            return true;
                        }
                        if (this.field497 == 126) {
                            this.field424 = false;
                            this.field492 = 1;
                            this.field467 = "";
                            this.field212 = true;
                            this.field497 = -1;
                            return true;
                        }
                        if (this.field497 == 145) {
                            this.field589 = true;
                            int var175 = this.field246.method257(true);
                            int var176 = this.field246.method243();
                            int var177 = this.field246.method258(178);
                            this.field261[var175] = var176;
                            this.field361[var175] = var177;
                            this.field242[var175] = 1;
                            for (int var178 = 0; var178 < 98; ++var178) {
                                if (var176 >= field489[var178]) {
                                    this.field242[var175] = var178 + 2;
                                }
                            }
                            this.field497 = -1;
                            return true;
                        }
                        if (this.field497 == 178) {
                            int var179 = this.field246.method265(0);
                            int var180 = this.field246.method240();
                            if (this.field221 != -1) {
                                this.field221 = -1;
                                this.field212 = true;
                            }
                            if (this.field492 != 0) {
                                this.field492 = 0;
                                this.field212 = true;
                            }
                            this.field262 = var180;
                            this.field395 = var179;
                            this.field589 = true;
                            this.field354 = true;
                            this.field298 = false;
                            this.field497 = -1;
                            return true;
                        }
                        if (this.field497 == 39) {
                            this.field349 = this.field246.method257(true);
                            this.field350 = this.field246.method238();
                            for (int var181 = this.field349; var181 < this.field349 + 8; ++var181) {
                                for (int var182 = this.field350; var182 < this.field350 + 8; ++var182) {
                                    if (this.field290[this.field303][var181][var182] != null) {
                                        this.field290[this.field303][var181][var182] = null;
                                        this.method91(var181, var182);
                                    }
                                }
                            }
                            for (class16 var183 = (class16) this.field435.method382(); var183 != null; var183 = (class16) this.field435.method384((byte) -96)) {
                                if (var183.field715 >= this.field349 && var183.field715 < this.field349 + 8 && var183.field716 >= this.field350 && var183.field716 < this.field350 + 8 && this.field303 == var183.field713) {
                                    var183.field723 = 0;
                                }
                            }
                            this.field497 = -1;
                            return true;
                        }
                        if (this.field497 == 112) {
                            int var184 = this.field246.method266(2);
                            this.method129(var184, (byte) 4);
                            if (this.field395 != -1) {
                                this.field395 = -1;
                                this.field589 = true;
                                this.field354 = true;
                            }
                            if (this.field221 != -1) {
                                this.field221 = -1;
                                this.field212 = true;
                            }
                            if (this.field492 != 0) {
                                this.field492 = 0;
                                this.field212 = true;
                            }
                            this.field262 = var184;
                            this.field298 = false;
                            this.field497 = -1;
                            return true;
                        }
                        if (this.field497 == 249) {
                            for (int var185 = 0; var185 < this.field509.length; ++var185) {
                                if (this.field509[var185] != null) {
                                    this.field509[var185].field41 = -1;
                                }
                            }
                            for (int var186 = 0; var186 < this.field283.length; ++var186) {
                                if (this.field283[var186] != null) {
                                    this.field283[var186].field41 = -1;
                                }
                            }
                            this.field497 = -1;
                            return true;
                        }
                        signlink.reporterror("T1 - " + this.field497 + "," + this.field496 + " - " + this.field359 + "," + this.field360);
                        this.method166(true);
                        return true;
                    }
                    this.method127(this.field497, this.field246, false);
                    this.field497 = -1;
                    return true;
                }
                int var52 = this.field460;
                int var53 = this.field461;
                if (this.field497 == 66) {
                    var52 = this.field246.method265(0);
                    var53 = this.field246.method240();
                    this.field613 = false;
                }
                if (this.field497 == 97) {
                    var53 = this.field246.method240();
                    var52 = this.field246.method265(0);
                    this.field246.method248((byte) 7);
                    int var54 = 0;
                    while (true) {
                        if (var54 >= 4) {
                            this.field246.method250(-845);
                            this.field613 = true;
                            break;
                        }
                        for (int var55 = 0; var55 < 13; ++var55) {
                            for (int var56 = 0; var56 < 13; ++var56) {
                                int var57 = this.field246.method249(1, (byte) -80);
                                if (var57 == 1) {
                                    this.field215[var54][var55][var56] = this.field246.method249(26, (byte) -80);
                                } else {
                                    this.field215[var54][var55][var56] = -1;
                                }
                            }
                        }
                        ++var54;
                    }
                }
                if (this.field460 == var52 && this.field461 == var53 && this.field226 == 2) {
                    this.field497 = -1;
                    return true;
                }
                this.field460 = var52;
                this.field461 = var53;
                this.field330 = (this.field460 - 6) * 8;
                this.field331 = (this.field461 - 6) * 8;
                this.field602 = false;
                if ((this.field460 / 8 == 48 || this.field460 / 8 == 49) && this.field461 / 8 == 48) {
                    this.field602 = true;
                }
                if (this.field460 / 8 == 48 && this.field461 / 8 == 148) {
                    this.field602 = true;
                }
                this.field226 = 1;
                this.field455 = System.currentTimeMillis();
                this.field616.method455(9133);
                this.field385.method176(-35924, 151, 0, 257, "Loading - please wait.");
                this.field385.method176(-35924, 150, 16777215, 256, "Loading - please wait.");
                this.field616.method456(4, -30916, 4, super.field1502);
                if (this.field497 == 66) {
                    int var58 = 0;
                    int var59 = (this.field460 - 6) / 8;
                    label1148: while (true) {
                        if (var59 > (this.field460 + 6) / 8) {
                            this.field173 = new byte[var58][];
                            this.field328 = new byte[var58][];
                            this.field539 = new int[var58];
                            this.field540 = new int[var58];
                            this.field541 = new int[var58];
                            int var61 = 0;
                            int var62 = (this.field460 - 6) / 8;
                            while (true) {
                                if (var62 > (this.field460 + 6) / 8) {
                                    break label1148;
                                }
                                for (int var63 = (this.field461 - 6) / 8; var63 <= (this.field461 + 6) / 8; ++var63) {
                                    this.field539[var61] = (var62 << 8) + var63;
                                    if (!this.field602 || var63 != 49 && var63 != 149 && var63 != 147 && var62 != 50 && (var62 != 49 || var63 != 47)) {
                                        int var64 = this.field540[var61] = this.field437.method465(var62, var63, 0, 0);
                                        if (var64 != -1) {
                                            this.field437.method469(3, var64);
                                        }
                                        int var65 = this.field541[var61] = this.field437.method465(var62, var63, 1, 0);
                                        if (var65 != -1) {
                                            this.field437.method469(3, var65);
                                        }
                                        ++var61;
                                    } else {
                                        this.field540[var61] = -1;
                                        this.field541[var61] = -1;
                                        ++var61;
                                    }
                                }
                                ++var62;
                            }
                        }
                        for (int var60 = (this.field461 - 6) / 8; var60 <= (this.field461 + 6) / 8; ++var60) {
                            ++var58;
                        }
                        ++var59;
                    }
                }
                if (this.field497 == 97) {
                    int var66 = 0;
                    int[] var67 = new int[676];
                    int var68 = 0;
                    label1107: while (true) {
                        if (var68 >= 4) {
                            this.field173 = new byte[var66][];
                            this.field328 = new byte[var66][];
                            this.field539 = new int[var66];
                            this.field540 = new int[var66];
                            this.field541 = new int[var66];
                            int var76 = 0;
                            while (true) {
                                if (var76 >= var66) {
                                    break label1107;
                                }
                                int var77 = this.field539[var76] = var67[var76];
                                int var78 = var77 >> 8 & 255;
                                int var79 = var77 & 255;
                                int var80 = this.field540[var76] = this.field437.method465(var78, var79, 0, 0);
                                if (var80 != -1) {
                                    this.field437.method469(3, var80);
                                }
                                int var81 = this.field541[var76] = this.field437.method465(var78, var79, 1, 0);
                                if (var81 != -1) {
                                    this.field437.method469(3, var81);
                                }
                                ++var76;
                            }
                        }
                        for (int var69 = 0; var69 < 13; ++var69) {
                            for (int var70 = 0; var70 < 13; ++var70) {
                                int var71 = this.field215[var68][var69][var70];
                                if (var71 != -1) {
                                    int var72 = var71 >> 14 & 1023;
                                    int var73 = var71 >> 3 & 2047;
                                    int var74 = (var72 / 8 << 8) + var73 / 8;
                                    for (int var75 = 0; var75 < var66; ++var75) {
                                        if (var67[var75] == var74) {
                                            var74 = -1;
                                            break;
                                        }
                                    }
                                    if (var74 != -1) {
                                        var67[var66++] = var74;
                                    }
                                }
                            }
                        }
                        ++var68;
                    }
                }
                int var82 = this.field330 - this.field332;
                int var83 = this.field331 - this.field333;
                this.field332 = this.field330;
                this.field333 = this.field331;
                for (int var84 = 0; var84 < 16384; ++var84) {
                    class37 var85 = this.field283[var84];
                    if (var85 != null) {
                        for (int var86 = 0; var86 < 10; ++var86) {
                            var85.field87[var86] -= var82;
                            var85.field88[var86] -= var83;
                        }
                        var85.field51 -= var82 * 128;
                        var85.field52 -= var83 * 128;
                    }
                }
                for (int var87 = 0; var87 < this.field507; ++var87) {
                    class49 var88 = this.field509[var87];
                    if (var88 != null) {
                        for (int var89 = 0; var89 < 10; ++var89) {
                            var88.field87[var89] -= var82;
                            var88.field88[var89] -= var83;
                        }
                        var88.field51 -= var82 * 128;
                        var88.field52 -= var83 * 128;
                    }
                }
                this.field504 = true;
                byte var90 = 0;
                byte var91 = 104;
                byte var92 = 1;
                if (var82 < 0) {
                    var90 = 103;
                    var91 = -1;
                    var92 = -1;
                }
                byte var93 = 0;
                byte var94 = 104;
                byte var95 = 1;
                if (var83 < 0) {
                    var93 = 103;
                    var94 = -1;
                    var95 = -1;
                }
                for (int var96 = var90; var91 != var96; var96 += var92) {
                    for (int var97 = var93; var94 != var97; var97 += var95) {
                        int var98 = var82 + var96;
                        int var99 = var83 + var97;
                        for (int var100 = 0; var100 < 4; ++var100) {
                            if (var98 >= 0 && var99 >= 0 && var98 < 104 && var99 < 104) {
                                this.field290[var100][var96][var97] = this.field290[var100][var98][var99];
                            } else {
                                this.field290[var100][var96][var97] = null;
                            }
                        }
                    }
                }
                for (class16 var101 = (class16) this.field435.method382(); var101 != null; var101 = (class16) this.field435.method384((byte) -96)) {
                    var101.field715 -= var82;
                    var101.field716 -= var83;
                    if (var101.field715 < 0 || var101.field716 < 0 || var101.field715 >= 104 || var101.field716 >= 104) {
                        var101.method540();
                    }
                }
                if (this.field476 != 0) {
                    this.field476 -= var82;
                    this.field477 -= var83;
                }
                this.field605 = false;
                this.field497 = -1;
                return true;
            } catch (IOException var191) {
                this.method64(true);
            } catch (Exception var192) {
                String var188 = "T2 - " + this.field497 + "," + this.field359 + "," + this.field360 + " - " + this.field496 + "," + (field189.field87[0] + this.field330) + "," + (field189.field88[0] + this.field331) + " - ";
                for (int var189 = 0; var189 < this.field496 && var189 < 50; ++var189) {
                    var188 = var188 + this.field246.field831[var189] + ",";
                }
                signlink.reporterror(var188);
                this.method166(true);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(IIII)I")
    public final int method124(int arg0, int arg1, int arg2, int arg3) {
        int var5 = 256 - arg3;
        if (arg2 < 9 || arg2 > 9) {
            this.field290 = null;
        }
        return ((arg0 & 16711935) * arg3 + (arg1 & 16711935) * var5 & -16711936) + ((arg0 & 65280) * arg3 + (arg1 & 65280) * var5 & 16711680) >> 8;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;B)V")
    public final void method125(int arg0, String arg1, String arg2, byte arg3) {
        if (arg0 == 0 && this.field462 != -1) {
            this.field241 = arg2;
            super.field1516 = 0;
        }
        if (this.field221 == -1) {
            this.field212 = true;
        }
        for (int var5 = 99; var5 > 0; --var5) {
            this.field338[var5] = this.field338[var5 - 1];
            this.field339[var5] = this.field339[var5 - 1];
            this.field340[var5] = this.field340[var5 - 1];
        }
        this.field338[0] = arg0;
        this.field339[0] = arg1;
        this.field340[0] = arg2;
        if (arg3 != 5) {
            this.field559 = -115;
        }
    }

    @OriginalMember(owner = "client", name = "i", descriptor = "(II)Ljava/lang/String;")
    public final String method126(int arg0, int arg1) {
        while (arg0 >= 0) {
            this.method116();
        }
        if (arg1 < 999999999) {
            return String.valueOf(arg1);
        } else {
            return "*";
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILIMUIZRAF;Z)V")
    public final void method127(int arg0, class24 arg1, boolean arg2) {
        if (!arg2) {
            if (arg0 == 211) {
                int var4 = arg1.method259(false);
                int var5 = (var4 >> 4 & 7) + this.field349;
                int var6 = (var4 & 7) + this.field350;
                int var7 = arg1.method258(178);
                int var8 = var7 >> 2;
                int var9 = var7 & 3;
                int var10 = this.field373[var8];
                if (var5 >= 0 && var6 >= 0 && var5 < 104 && var6 < 104) {
                    this.method71(this.field303, -1, -1, var6, (byte) -33, var8, var10, 0, var5, var9);
                }
            } else if (arg0 == 243) {
                int var11 = arg1.method265(0);
                int var12 = arg1.method240();
                int var13 = arg1.method267(628);
                int var14 = arg1.method258(178);
                int var15 = (var14 >> 4 & 7) + this.field349;
                int var16 = (var14 & 7) + this.field350;
                if (var15 >= 0 && var16 >= 0 && var15 < 104 && var16 < 104 && this.field404 != var12) {
                    class47 var17 = new class47();
                    var17.field1211 = var13;
                    var17.field1210 = var11;
                    if (this.field290[this.field303][var15][var16] == null) {
                        this.field290[this.field303][var15][var16] = new class38(false);
                    }
                    this.field290[this.field303][var15][var16].method379(var17);
                    this.method91(var15, var16);
                }
            } else if (arg0 == 147) {
                int var18 = arg1.method238();
                int var19 = (var18 >> 4 & 7) + this.field349;
                int var20 = (var18 & 7) + this.field350;
                int var21 = arg1.method240();
                int var22 = arg1.method240();
                int var23 = arg1.method240();
                if (var19 >= 0 && var20 >= 0 && var19 < 104 && var20 < 104) {
                    class38 var24 = this.field290[this.field303][var19][var20];
                    if (var24 != null) {
                        for (class47 var25 = (class47) var24.method382(); var25 != null; var25 = (class47) var24.method384((byte) -96)) {
                            if ((var21 & 32767) == var25.field1211 && var25.field1210 == var22) {
                                var25.field1210 = var23;
                                break;
                            }
                        }
                        this.method91(var19, var20);
                    }
                }
            } else {
                if (arg0 == 54) {
                    int var26 = arg1.method240();
                    int var27 = arg1.method266(2);
                    byte var28 = arg1.method239();
                    byte var29 = arg1.method239();
                    byte var30 = arg1.method261(322);
                    byte var31 = arg1.method260(268);
                    int var32 = arg1.method238();
                    int var33 = (var32 >> 4 & 7) + this.field349;
                    int var34 = (var32 & 7) + this.field350;
                    int var35 = arg1.method265(0);
                    int var36 = arg1.method240();
                    int var37 = arg1.method259(false);
                    int var38 = var37 >> 2;
                    int var39 = var37 & 3;
                    int var40 = this.field373[var38];
                    class49 var41;
                    if (this.field404 == var36) {
                        var41 = field189;
                    } else {
                        var41 = this.field509[var36];
                    }
                    if (var41 != null) {
                        class41 var42 = class41.method398(var27);
                        int var43 = this.field161[this.field303][var33][var34];
                        int var44 = this.field161[this.field303][var33 + 1][var34];
                        int var45 = this.field161[this.field303][var33 + 1][var34 + 1];
                        int var46 = this.field161[this.field303][var33][var34 + 1];
                        class67 var47 = var42.method405(var38, var39, var43, var44, var45, var46, -1);
                        if (var47 != null) {
                            this.method71(this.field303, -1, var35 + 1, var34, (byte) -33, 0, var40, var26 + 1, var33, 0);
                            var41.field1289 = field609 + var26;
                            var41.field1290 = field609 + var35;
                            var41.field1309 = var47;
                            int var48 = var42.field1094;
                            int var49 = var42.field1067;
                            if (var39 == 1 || var39 == 3) {
                                var48 = var42.field1067;
                                var49 = var42.field1094;
                            }
                            var41.field1306 = var33 * 128 + var48 * 64;
                            var41.field1308 = var34 * 128 + var49 * 64;
                            var41.field1307 = this.method84(false, var41.field1308, this.field303, var41.field1306);
                            if (var31 > var28) {
                                byte var50 = var31;
                                var31 = var28;
                                var28 = var50;
                            }
                            if (var30 > var29) {
                                byte var51 = var30;
                                var30 = var29;
                                var29 = var51;
                            }
                            var41.field1297 = var31 + var33;
                            var41.field1299 = var28 + var33;
                            var41.field1298 = var30 + var34;
                            var41.field1300 = var29 + var34;
                        }
                    }
                }
                if (arg0 == 107) {
                    int var52 = arg1.method258(178);
                    int var53 = (var52 >> 4 & 7) + this.field349;
                    int var54 = (var52 & 7) + this.field350;
                    int var55 = arg1.method266(2);
                    int var56 = arg1.method240();
                    if (var53 >= 0 && var54 >= 0 && var53 < 104 && var54 < 104) {
                        class47 var57 = new class47();
                        var57.field1211 = var55;
                        var57.field1210 = var56;
                        if (this.field290[this.field303][var53][var54] == null) {
                            this.field290[this.field303][var53][var54] = new class38(false);
                        }
                        this.field290[this.field303][var53][var54].method379(var57);
                        this.method91(var53, var54);
                    }
                } else if (arg0 != 9) {
                    if (arg0 == 222) {
                        int var64 = arg1.method240();
                        int var65 = arg1.method258(178);
                        int var66 = var65 >> 2;
                        int var67 = var65 & 3;
                        int var68 = this.field373[var66];
                        int var69 = arg1.method257(true);
                        int var70 = (var69 >> 4 & 7) + this.field349;
                        int var71 = (var69 & 7) + this.field350;
                        if (var70 >= 0 && var71 >= 0 && var70 < 103 && var71 < 103) {
                            int var72 = this.field161[this.field303][var70][var71];
                            int var73 = this.field161[this.field303][var70 + 1][var71];
                            int var74 = this.field161[this.field303][var70 + 1][var71 + 1];
                            int var75 = this.field161[this.field303][var70][var71 + 1];
                            if (var68 == 0) {
                                class56 var76 = this.field530.method347(var70, var71, false, this.field303);
                                if (var76 != null) {
                                    int var77 = var76.field1458 >> 14 & 32767;
                                    if (var66 == 2) {
                                        var76.field1456 = new class15(var67 + 4, false, var73, var75, var74, var72, 0, var77, var64, 2);
                                        var76.field1457 = new class15(var67 + 1 & 3, false, var73, var75, var74, var72, 0, var77, var64, 2);
                                    } else {
                                        var76.field1456 = new class15(var67, false, var73, var75, var74, var72, 0, var77, var64, var66);
                                    }
                                }
                            }
                            if (var68 == 1) {
                                class17 var78 = this.field530.method348(41314, this.field303, var71, var70);
                                if (var78 != null) {
                                    var78.field730 = new class15(0, false, var73, var75, var74, var72, 0, var78.field731 >> 14 & 32767, var64, 4);
                                }
                            }
                            if (var68 == 2) {
                                class8 var79 = this.field530.method349(var71, this.field303, 258, var70);
                                if (var66 == 11) {
                                    var66 = 10;
                                }
                                if (var79 != null) {
                                    var79.field123 = new class15(var67, false, var73, var75, var74, var72, 0, var79.field131 >> 14 & 32767, var64, var66);
                                }
                            }
                            if (var68 == 3) {
                                class18 var80 = this.field530.method350(this.field303, (byte) -51, var71, var70);
                                if (var80 != null) {
                                    var80.field736 = new class15(var67, false, var73, var75, var74, var72, 0, var80.field737 >> 14 & 32767, var64, 22);
                                }
                            }
                        }
                    } else if (arg0 == 94) {
                        int var81 = arg1.method238();
                        int var82 = (var81 >> 4 & 7) + this.field349;
                        int var83 = (var81 & 7) + this.field350;
                        int var84 = arg1.method238();
                        int var85 = var84 >> 2;
                        int var86 = var84 & 3;
                        int var87 = this.field373[var85];
                        int var88 = arg1.method265(0);
                        if (var82 >= 0 && var83 >= 0 && var82 < 104 && var83 < 104) {
                            this.method71(this.field303, var88, -1, var83, (byte) -33, var85, var87, 0, var82, var86);
                        }
                    } else if (arg0 == 100) {
                        int var89 = arg1.method238();
                        int var90 = (var89 >> 4 & 7) + this.field349;
                        int var91 = (var89 & 7) + this.field350;
                        int var92 = arg1.method240();
                        int var93 = arg1.method238();
                        int var94 = arg1.method240();
                        if (var90 >= 0 && var91 >= 0 && var90 < 104 && var91 < 104) {
                            int var95 = var90 * 128 + 64;
                            int var96 = var91 * 128 + 64;
                            class13 var97 = new class13(var95, 0, var96, field609, this.field303, this.method84(false, var96, this.field303, var95) - var93, var94, var92);
                            this.field619.method379(var97);
                        }
                    } else {
                        if (arg0 == 76) {
                            int var98 = arg1.method238();
                            int var99 = (var98 >> 4 & 7) + this.field349;
                            int var100 = (var98 & 7) + this.field350;
                            int var101 = arg1.method240();
                            int var102 = arg1.method238();
                            int var103 = var102 >> 4 & 15;
                            int var104 = var102 & 7;
                            if (field189.field87[0] >= var99 - var103 && field189.field87[0] <= var99 + var103 && field189.field88[0] >= var100 - var103 && field189.field88[0] <= var100 + var103 && this.field351 && !field318 && this.field297 < 50) {
                                this.field229[this.field297] = var101;
                                this.field214[this.field297] = var104;
                                this.field399[this.field297] = class12.field663[var101];
                                ++this.field297;
                            }
                        }
                        if (arg0 == 96) {
                            int var105 = arg1.method238();
                            int var106 = (var105 >> 4 & 7) + this.field349;
                            int var107 = (var105 & 7) + this.field350;
                            int var108 = var106 + arg1.method239();
                            int var109 = var107 + arg1.method239();
                            int var110 = arg1.method241();
                            int var111 = arg1.method240();
                            int var112 = arg1.method238() * 4;
                            int var113 = arg1.method238() * 4;
                            int var114 = arg1.method240();
                            int var115 = arg1.method240();
                            int var116 = arg1.method238();
                            int var117 = arg1.method238();
                            if (var106 >= 0 && var107 >= 0 && var106 < 104 && var107 < 104 && var108 >= 0 && var109 >= 0 && var108 < 104 && var109 < 104 && var111 != 65535) {
                                int var118 = var106 * 128 + 64;
                                int var119 = var107 * 128 + 64;
                                int var120 = var108 * 128 + 64;
                                int var121 = var109 * 128 + 64;
                                class36 var122 = new class36(var117, field609 + var114, var116, 2, this.method84(false, var119, this.field303, var118) - var112, this.field303, var119, var113, var118, var110, field609 + var115, var111);
                                var122.method376(var120, var121, 8, field609 + var114, this.method84(false, var121, this.field303, var120) - var113);
                                this.field491.method379(var122);
                            }
                        }
                    }
                } else {
                    int var58 = arg1.method258(178);
                    int var59 = (var58 >> 4 & 7) + this.field349;
                    int var60 = (var58 & 7) + this.field350;
                    int var61 = arg1.method267(628);
                    if (var59 >= 0 && var60 >= 0 && var59 < 104 && var60 < 104) {
                        class38 var62 = this.field290[this.field303][var59][var60];
                        if (var62 != null) {
                            for (class47 var63 = (class47) var62.method382(); var63 != null; var63 = (class47) var62.method384((byte) -96)) {
                                if ((var61 & 32767) == var63.field1211) {
                                    var63.method540();
                                    break;
                                }
                            }
                            if (var62.method382() == null) {
                                this.field290[this.field303][var59][var60] = null;
                            }
                            this.method91(var59, var60);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "h", descriptor = "(Z)V")
    public final void method128(boolean arg0) {
        try {
            this.field422 = -1;
            this.field619.method386();
            this.field491.method386();
            class58.method497(-762);
            this.method58(true);
            this.field530.method325(614);
            System.gc();
            for (int var2 = 0; var2 < 4; ++var2) {
                this.field553[var2].method528();
            }
            for (int var3 = 0; var3 < 4; ++var3) {
                for (int var4 = 0; var4 < 104; ++var4) {
                    for (int var5 = 0; var5 < 104; ++var5) {
                        this.field524[var3][var4][var5] = 0;
                    }
                }
            }
            class42 var6 = new class42(-863, 104, this.field524, 104, this.field161);
            int var7 = this.field173.length;
            this.field223.method227(184, this.field376);
            if (!this.field613) {
                for (int var8 = 0; var8 < var7; ++var8) {
                    int var9 = (this.field539[var8] >> 8) * 64 - this.field330;
                    int var10 = (this.field539[var8] & 255) * 64 - this.field331;
                    byte[] var11 = this.field173[var8];
                    if (var11 != null) {
                        var6.method408(var11, var9, var10, (this.field460 - 6) * 8, this.field553, (this.field461 - 6) * 8, -38919);
                    }
                }
                for (int var12 = 0; var12 < var7; ++var12) {
                    int var13 = (this.field539[var12] >> 8) * 64 - this.field330;
                    int var14 = (this.field539[var12] & 255) * 64 - this.field331;
                    byte[] var15 = this.field173[var12];
                    if (var15 == null && this.field461 < 800) {
                        var6.method424(64, var13, this.field253, var14, 64);
                    }
                }
                this.field223.method227(184, this.field376);
                for (int var16 = 0; var16 < var7; ++var16) {
                    byte[] var17 = this.field328[var16];
                    if (var17 != null) {
                        int var18 = (this.field539[var16] >> 8) * 64 - this.field330;
                        int var19 = (this.field539[var16] & 255) * 64 - this.field331;
                        var6.method414(this.field530, 0, var17, var18, this.field553, var19);
                    }
                }
            }
            if (this.field613) {
                int var20 = 0;
                label244: while (true) {
                    if (var20 >= 4) {
                        for (int var30 = 0; var30 < 13; ++var30) {
                            for (int var31 = 0; var31 < 13; ++var31) {
                                int var32 = this.field215[0][var30][var31];
                                if (var32 == -1) {
                                    var6.method424(8, var30 * 8, this.field253, var31 * 8, 8);
                                }
                            }
                        }
                        this.field223.method227(184, this.field376);
                        int var33 = 0;
                        while (true) {
                            if (var33 >= 4) {
                                break label244;
                            }
                            for (int var34 = 0; var34 < 13; ++var34) {
                                for (int var35 = 0; var35 < 13; ++var35) {
                                    int var36 = this.field215[var33][var34][var35];
                                    if (var36 != -1) {
                                        int var37 = var36 >> 24 & 3;
                                        int var38 = var36 >> 1 & 3;
                                        int var39 = var36 >> 14 & 1023;
                                        int var40 = var36 >> 3 & 2047;
                                        int var41 = (var39 / 8 << 8) + var40 / 8;
                                        for (int var42 = 0; var42 < this.field539.length; ++var42) {
                                            if (this.field539[var42] == var41 && this.field328[var42] != null) {
                                                var6.method420(var34 * 8, this.field553, (var39 & 7) * 8, (byte) 64, var38, var37, var33, this.field530, (var40 & 7) * 8, var35 * 8, this.field328[var42]);
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
                            int var23 = this.field215[var20][var21][var22];
                            if (var23 != -1) {
                                int var24 = var23 >> 24 & 3;
                                int var25 = var23 >> 1 & 3;
                                int var26 = var23 >> 14 & 1023;
                                int var27 = var23 >> 3 & 2047;
                                int var28 = (var26 / 8 << 8) + var27 / 8;
                                for (int var29 = 0; var29 < this.field539.length; ++var29) {
                                    if (this.field539[var29] == var28 && this.field173[var29] != null) {
                                        var6.method411(var22 * 8, var25, 308, this.field553, var24, var21 * 8, (var26 & 7) * 8, var20, (var27 & 7) * 8, this.field173[var29]);
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    ++var20;
                }
            }
            this.field223.method227(184, this.field376);
            var6.method422(this.field530, this.field553, -3083);
            this.field616.method455(9133);
            this.field223.method227(184, this.field376);
            int var43 = class42.field1132;
            if (var43 > this.field303) {
                var43 = this.field303;
            }
            if (var43 < this.field303 - 1) {
                int var44 = this.field303 - 1;
            }
            if (field318) {
                this.field530.method326((byte) 7, class42.field1132);
            } else {
                this.field530.method326((byte) 7, 0);
            }
            for (int var45 = 0; var45 < 104; ++var45) {
                for (int var46 = 0; var46 < 104; ++var46) {
                    this.method91(var45, var46);
                }
            }
            this.method117(6);
        } catch (Exception var59) {
        }
        class41.field1073.method527();
        if (super.field1505 != null) {
            this.field223.method227(4, this.field376);
            this.field223.method232(1057001181);
        }
        if (field318 && signlink.cache_dat != null) {
            int var48 = this.field437.method474(0, 86);
            for (int var49 = 0; var49 < var48; ++var49) {
                int var50 = this.field437.method480(16165, var49);
                if ((var50 & 121) == 0) {
                    class67.method547(var49, 7);
                }
            }
        }
        System.gc();
        class58.method498((byte) 1, 20);
        this.field254 &= arg0;
        this.field437.method475(-67);
        int var51 = (this.field460 - 6) / 8 - 1;
        int var52 = (this.field460 + 6) / 8 + 1;
        int var53 = (this.field461 - 6) / 8 - 1;
        int var54 = (this.field461 + 6) / 8 + 1;
        if (this.field602) {
            var51 = 49;
            var52 = 50;
            var53 = 49;
            var54 = 50;
        }
        for (int var55 = var51; var55 <= var52; ++var55) {
            for (int var56 = var53; var56 <= var54; ++var56) {
                if (var51 == var55 || var52 == var55 || var53 == var56 || var54 == var56) {
                    int var57 = this.field437.method465(var55, var56, 0, 0);
                    if (var57 != -1) {
                        this.field437.method477(var57, 9, 3);
                    }
                    int var58 = this.field437.method465(var55, var56, 1, 0);
                    if (var58 != -1) {
                        this.field437.method477(var58, 9, 3);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(IB)V")
    public final void method129(int arg0, byte arg1) {
        if (arg1 == 4) {
            class48 var3 = class48.field1219[arg0];
            for (int var4 = 0; var4 < var3.field1213.length && var3.field1213[var4] != -1; ++var4) {
                class48 var5 = class48.field1219[var3.field1213[var4]];
                if (var5.field1269 == 1) {
                    this.method129(var5.field1262, (byte) 4);
                }
                var5.field1217 = 0;
                var5.field1222 = 0;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZI)V")
    public final void method130(boolean arg0, int arg1) {
        this.method121((byte) 8);
        this.field545.method455(9133);
        this.field291.method13(0, 0, 4);
        short var3 = 360;
        short var4 = 200;
        int var5 = 78 / arg1;
        if (this.field529 == 0) {
            int var6 = var4 / 2 + 80;
            this.field384.method177(this.field437.field1396, var3 / 2, var6, true, 7711145, -771);
            int var7 = var4 / 2 - 20;
            this.field386.method177("Welcome to RuneScape", var3 / 2, var7, true, 16776960, -771);
            int var18 = var7 + 30;
            int var8 = var3 / 2 - 80;
            int var9 = var4 / 2 + 20;
            this.field292.method13(var8 - 73, var9 - 20, 4);
            this.field386.method177("New User", var8, var9 + 5, true, 16777215, -771);
            int var10 = var3 / 2 + 80;
            this.field292.method13(var10 - 73, var9 - 20, 4);
            this.field386.method177("Existing User", var10, var9 + 5, true, 16777215, -771);
        }
        if (this.field529 == 2) {
            int var11 = var4 / 2 - 40;
            if (this.field174.length() > 0) {
                this.field386.method177(this.field174, var3 / 2, var11 - 15, true, 16776960, -771);
                this.field386.method177(this.field175, var3 / 2, var11, true, 16776960, -771);
                var11 += 30;
            } else {
                this.field386.method177(this.field175, var3 / 2, var11 - 7, true, 16776960, -771);
                var11 += 30;
            }
            this.field386.method184(16777215, "Username: " + this.field151 + (this.field160 == 0 & field609 % 40 < 20 ? "@yel@|" : ""), true, 0, var11, var3 / 2 - 90);
            var11 += 15;
            this.field386.method184(16777215, "Password: " + class31.method323(0, this.field152) + (this.field160 == 1 & field609 % 40 < 20 ? "@yel@|" : ""), true, 0, var11, var3 / 2 - 88);
            var11 += 15;
            if (!arg0) {
                int var12 = var3 / 2 - 80;
                int var13 = var4 / 2 + 50;
                this.field292.method13(var12 - 73, var13 - 20, 4);
                this.field386.method177("Login", var12, var13 + 5, true, 16777215, -771);
                int var14 = var3 / 2 + 80;
                this.field292.method13(var14 - 73, var13 - 20, 4);
                this.field386.method177("Cancel", var14, var13 + 5, true, 16777215, -771);
            }
        }
        if (this.field529 == 3) {
            this.field386.method177("Create a free account", var3 / 2, var4 / 2 - 60, true, 16776960, -771);
            int var15 = var4 / 2 - 35;
            this.field386.method177("To create a new account you need to", var3 / 2, var15, true, 16777215, -771);
            int var19 = var15 + 15;
            this.field386.method177("go back to the main RuneScape webpage", var3 / 2, var19, true, 16777215, -771);
            int var20 = var19 + 15;
            this.field386.method177("and choose the red 'create account'", var3 / 2, var20, true, 16777215, -771);
            int var21 = var20 + 15;
            this.field386.method177("button at the top right of that page.", var3 / 2, var21, true, 16777215, -771);
            int var22 = var21 + 15;
            int var16 = var3 / 2;
            int var17 = var4 / 2 + 50;
            this.field292.method13(var16 - 73, var17 - 20, 4);
            this.field386.method177("Cancel", var16, var17 + 5, true, 16777215, -771);
        }
        this.field545.method456(202, -30916, 171, super.field1502);
        if (this.field611) {
            this.field611 = false;
            this.field543.method456(128, -30916, 0, super.field1502);
            this.field544.method456(202, -30916, 371, super.field1502);
            this.field548.method456(0, -30916, 265, super.field1502);
            this.field549.method456(562, -30916, 265, super.field1502);
            this.field550.method456(128, -30916, 171, super.field1502);
            this.field551.method456(562, -30916, 171, super.field1502);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIILSJPORZIF;)V")
    public final void method131(int arg0, int arg1, int arg2, int arg3, class48 arg4) {
        if (arg4.field1269 == 0 && arg4.field1213 != null) {
            if (!arg4.field1225 || this.field265 == arg4.field1262 || this.field158 == arg4.field1262 || this.field378 == arg4.field1262) {
                int var6 = class11.field653;
                int var7 = class11.field651;
                int var8 = class11.field654;
                int var9 = class11.field652;
                class11.method193(arg4.field1247 + arg1, arg4.field1267 + arg0, arg1, arg0, true);
                int var10 = arg4.field1213.length;
                for (int var11 = 0; var11 < var10; ++var11) {
                    int var12 = arg4.field1276[var11] + arg1;
                    int var13 = arg4.field1273[var11] + arg0 - arg2;
                    class48 var14 = class48.field1219[arg4.field1213[var11]];
                    int var15 = var14.field1271 + var12;
                    int var16 = var14.field1274 + var13;
                    if (var14.field1268 > 0) {
                        this.method65((byte) -12, var14);
                    }
                    if (var14.field1269 == 0) {
                        if (var14.field1266 > var14.field1215 - var14.field1267) {
                            var14.field1266 = var14.field1215 - var14.field1267;
                        }
                        if (var14.field1266 < 0) {
                            var14.field1266 = 0;
                        }
                        this.method131(var16, var15, var14.field1266, -44100, var14);
                        if (var14.field1215 > var14.field1267) {
                            this.method55(var14.field1266, var14.field1267, var14.field1247 + var15, true, var14.field1215, var16);
                        }
                    } else if (var14.field1269 != 1) {
                        if (var14.field1269 == 2) {
                            int var17 = 0;
                            for (int var18 = 0; var18 < var14.field1267; ++var18) {
                                for (int var19 = 0; var19 < var14.field1247; ++var19) {
                                    int var20 = (var14.field1250 + 32) * var19 + var15;
                                    int var21 = (var14.field1261 + 32) * var18 + var16;
                                    if (var17 < 20) {
                                        var20 += var14.field1245[var17];
                                        var21 += var14.field1235[var17];
                                    }
                                    if (var14.field1256[var17] <= 0) {
                                        if (var14.field1258 != null && var17 < 20) {
                                            class68 var30 = var14.field1258[var17];
                                            if (var30 != null) {
                                                var30.method578(var20, var21, 4);
                                            }
                                        }
                                    } else {
                                        int var22 = 0;
                                        int var23 = 0;
                                        int var24 = var14.field1256[var17] - 1;
                                        if (var20 > class11.field653 - 32 && var20 < class11.field654 && var21 > class11.field651 - 32 && var21 < class11.field652 || this.field451 != 0 && this.field450 == var17) {
                                            int var25 = 0;
                                            if (this.field482 == 1 && this.field483 == var17 && this.field484 == var14.field1262) {
                                                var25 = 16777215;
                                            }
                                            class68 var26 = class46.method445(var14.field1218[var17], var25, 989, var24);
                                            if (var26 != null) {
                                                if (this.field451 != 0 && this.field450 == var17 && this.field449 == var14.field1262) {
                                                    var22 = super.field1510 - this.field452;
                                                    var23 = super.field1511 - this.field453;
                                                    if (var22 < 5 && var22 > -5) {
                                                        var22 = 0;
                                                    }
                                                    if (var23 < 5 && var23 > -5) {
                                                        var23 = 0;
                                                    }
                                                    if (this.field567 < 5) {
                                                        var22 = 0;
                                                        var23 = 0;
                                                    }
                                                    var26.method580(var21 + var23, var20 + var22, 128, (byte) 2);
                                                    if (var21 + var23 < class11.field651 && arg4.field1266 > 0) {
                                                        int var27 = (class11.field651 - var21 - var23) * this.field607 / 3;
                                                        if (var27 > this.field607 * 10) {
                                                            var27 = this.field607 * 10;
                                                        }
                                                        if (var27 > arg4.field1266) {
                                                            var27 = arg4.field1266;
                                                        }
                                                        arg4.field1266 -= var27;
                                                        this.field453 += var27;
                                                    }
                                                    if (var21 + var23 + 32 > class11.field652 && arg4.field1266 < arg4.field1215 - arg4.field1267) {
                                                        int var28 = (var21 + var23 + 32 - class11.field652) * this.field607 / 3;
                                                        if (var28 > this.field607 * 10) {
                                                            var28 = this.field607 * 10;
                                                        }
                                                        if (var28 > arg4.field1215 - arg4.field1267 - arg4.field1266) {
                                                            var28 = arg4.field1215 - arg4.field1267 - arg4.field1266;
                                                        }
                                                        arg4.field1266 += var28;
                                                        this.field453 -= var28;
                                                    }
                                                } else if (this.field156 != 0 && this.field155 == var17 && this.field154 == var14.field1262) {
                                                    var26.method580(var21, var20, 128, (byte) 2);
                                                } else {
                                                    var26.method578(var20, var21, 4);
                                                }
                                                if (var26.field1695 == 33 || var14.field1218[var17] != 1) {
                                                    int var29 = var14.field1218[var17];
                                                    this.field384.method180(var21 + 10 + var23, method54(field162, var29), -412, var20 + 1 + var22, 0);
                                                    this.field384.method180(var21 + 9 + var23, method54(field162, var29), -412, var20 + var22, 16776960);
                                                }
                                            }
                                        }
                                    }
                                    ++var17;
                                }
                            }
                        } else if (var14.field1269 == 3) {
                            boolean var31 = false;
                            if (this.field378 == var14.field1262 || this.field158 == var14.field1262 || this.field265 == var14.field1262) {
                                var31 = true;
                            }
                            int var32;
                            if (this.method33(45167, var14)) {
                                var32 = var14.field1243;
                                if (var31 && var14.field1240 != 0) {
                                    var32 = var14.field1240;
                                }
                            } else {
                                var32 = var14.field1230;
                                if (var31 && var14.field1246 != 0) {
                                    var32 = var14.field1246;
                                }
                            }
                            if (var14.field1251 == 0) {
                                if (var14.field1223) {
                                    class11.method196(var32, var15, var14.field1247, var14.field1267, var16, 3);
                                } else {
                                    class11.method197(var16, var14.field1247, var15, var14.field1267, (byte) -19, var32);
                                }
                            } else if (var14.field1223) {
                                class11.method195(256 - (var14.field1251 & 255), var14.field1247, var16, -882, var15, var14.field1267, var32);
                            } else {
                                class11.method198(-108, var16, var14.field1247, var15, var32, var14.field1267, 256 - (var14.field1251 & 255));
                            }
                        } else if (var14.field1269 == 4) {
                            class10 var33 = var14.field1255;
                            String var34 = var14.field1220;
                            boolean var35 = false;
                            if (this.field378 == var14.field1262 || this.field158 == var14.field1262 || this.field265 == var14.field1262) {
                                var35 = true;
                            }
                            int var36;
                            if (this.method33(45167, var14)) {
                                var36 = var14.field1243;
                                if (var35 && var14.field1240 != 0) {
                                    var36 = var14.field1240;
                                }
                                if (var14.field1224.length() > 0) {
                                    var34 = var14.field1224;
                                }
                            } else {
                                var36 = var14.field1230;
                                if (var35 && var14.field1246 != 0) {
                                    var36 = var14.field1246;
                                }
                            }
                            if (var14.field1226 == 6 && this.field298) {
                                var34 = "Please wait...";
                                var36 = var14.field1230;
                            }
                            if (class11.field649 == 479) {
                                if (var36 == 16776960) {
                                    var36 = 255;
                                }
                                if (var36 == 49152) {
                                    var36 = 16777215;
                                }
                            }
                            int var37 = var33.field639 + var16;
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
                                                                        var34 = var34.substring(0, var42) + this.method126(this.field457, this.method41(4, 180, var14)) + var34.substring(var42 + 2);
                                                                    }
                                                                }
                                                                var34 = var34.substring(0, var41) + this.method126(this.field457, this.method41(3, 180, var14)) + var34.substring(var41 + 2);
                                                            }
                                                        }
                                                        var34 = var34.substring(0, var40) + this.method126(this.field457, this.method41(2, 180, var14)) + var34.substring(var40 + 2);
                                                    }
                                                }
                                                var34 = var34.substring(0, var39) + this.method126(this.field457, this.method41(1, 180, var14)) + var34.substring(var39 + 2);
                                            }
                                        }
                                        var34 = var34.substring(0, var38) + this.method126(this.field457, this.method41(0, 180, var14)) + var34.substring(var38 + 2);
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
                                if (var14.field1259) {
                                    var33.method177(var44, var14.field1247 / 2 + var15, var37, var14.field1239, var36, -771);
                                } else {
                                    var33.method184(var36, var44, var14.field1239, 0, var37, var15);
                                }
                                var37 += var33.field639;
                            }
                        } else if (var14.field1269 == 5) {
                            class68 var45;
                            if (this.method33(45167, var14)) {
                                var45 = var14.field1264;
                            } else {
                                var45 = var14.field1277;
                            }
                            if (var45 != null) {
                                var45.method578(var15, var16, 4);
                            }
                        } else if (var14.field1269 == 6) {
                            int var46 = class58.field1472;
                            int var47 = class58.field1473;
                            class58.field1472 = var14.field1247 / 2 + var15;
                            class58.field1473 = var14.field1267 / 2 + var16;
                            int var48 = class58.field1476[var14.field1232] * var14.field1231 >> 16;
                            int var49 = class58.field1477[var14.field1232] * var14.field1231 >> 16;
                            boolean var50 = this.method33(45167, var14);
                            int var51;
                            if (var50) {
                                var51 = var14.field1238;
                            } else {
                                var51 = var14.field1237;
                            }
                            class67 var52;
                            if (var51 == -1) {
                                var52 = var14.method446(var50, false, -1, -1);
                            } else {
                                class71 var53 = class71.field1705[var51];
                                var52 = var14.method446(var50, false, var53.field1707[var14.field1217], var53.field1708[var14.field1217]);
                            }
                            if (var52 != null) {
                                var52.method568(0, var14.field1233, 0, var14.field1232, 0, var48, var49);
                            }
                            class58.field1472 = var46;
                            class58.field1473 = var47;
                        } else if (var14.field1269 == 7) {
                            class10 var54 = var14.field1255;
                            int var55 = 0;
                            for (int var56 = 0; var56 < var14.field1267; ++var56) {
                                for (int var57 = 0; var57 < var14.field1247; ++var57) {
                                    if (var14.field1256[var55] > 0) {
                                        class46 var58 = class46.method438(var14.field1256[var55] - 1);
                                        String var59 = var58.field1164;
                                        if (var58.field1196 || var14.field1218[var55] != 1) {
                                            var59 = var59 + " x" + method52(var14.field1218[var55], -26537);
                                        }
                                        int var60 = (var14.field1250 + 115) * var57 + var15;
                                        int var61 = (var14.field1261 + 12) * var56 + var16;
                                        if (var14.field1259) {
                                            var54.method177(var59, var14.field1247 / 2 + var60, var61, var14.field1239, var14.field1230, -771);
                                        } else {
                                            var54.method184(var14.field1230, var59, var14.field1239, 0, var61, var60);
                                        }
                                    }
                                    ++var55;
                                }
                            }
                        }
                    }
                }
                if (arg3 == -44100) {
                    class11.method193(var8, var9, var6, var7, true);
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "z", descriptor = "(I)V")
    public final void method132(int arg0) {
        ++this.field379;
        this.method139((byte) 8, true);
        this.method45(12314, true);
        this.method139((byte) 8, false);
        this.method45(12314, false);
        this.method98(-74);
        this.method106(true);
        if (!this.field605) {
            int var2 = this.field412;
            if (this.field368 / 256 > var2) {
                var2 = this.field368 / 256;
            }
            if (this.field398[4] && this.field206[4] + 128 > var2) {
                var2 = this.field206[4] + 128;
            }
            int var3 = this.field599 + this.field413 & 2047;
            this.method155(var2 * 3 + 600, var2, false, this.field472, var3, this.field471, this.method84(false, field189.field52, this.field303, field189.field51) - 50);
        }
        int var4;
        if (!this.field605) {
            var4 = this.method67(true);
        } else {
            var4 = this.method68((byte) 76);
        }
        int var5 = this.field230;
        int var6 = this.field231;
        int var7 = this.field232;
        int var8 = this.field233;
        int var9 = this.field234;
        for (int var10 = 0; var10 < 5; ++var10) {
            if (this.field398[var10]) {
                int var12 = (int) (Math.random() * (double) (this.field322[var10] * 2 + 1) - (double) this.field322[var10] + Math.sin((double) this.field205[var10] / 100.0D * (double) this.field314[var10]) * (double) this.field206[var10]);
                if (var10 == 0) {
                    this.field230 += var12;
                }
                if (var10 == 1) {
                    this.field231 += var12;
                }
                if (var10 == 2) {
                    this.field232 += var12;
                }
                if (var10 == 3) {
                    this.field234 = this.field234 + var12 & 2047;
                }
                if (var10 == 4) {
                    this.field233 += var12;
                    if (this.field233 < 128) {
                        this.field233 = 128;
                    }
                    if (this.field233 > 383) {
                        this.field233 = 383;
                    }
                }
            }
        }
        int var11 = class58.field1487;
        class67.field1673 = true;
        class67.field1676 = 0;
        class67.field1674 = super.field1510 - 4;
        class67.field1675 = super.field1511 - 4;
        class11.method194(-27727);
        this.field530.method364(this.field230, var4, false, this.field231, this.field233, this.field234, this.field232);
        this.field530.method339((byte) 8);
        this.method165(-999);
        this.method143(this.field364);
        this.method73(var11, 6225);
        this.method38(-69);
        this.field616.method456(4, -30916, 4, super.field1502);
        this.field230 = var5;
        if (arg0 == 0) {
            this.field231 = var6;
            this.field232 = var7;
            this.field233 = var8;
            this.field234 = var9;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZILIMUIZRAF;)V")
    private final void method133(boolean arg0, int arg1, class24 arg2) {
        if (!arg0) {
            this.field334 = this.field569.method541();
        }
        while (arg2.field833 + 21 < arg1 * 8) {
            int var4 = arg2.method249(14, (byte) -80);
            if (var4 == 16383) {
                break;
            }
            if (this.field283[var4] == null) {
                this.field283[var4] = new class37();
            }
            class37 var5 = this.field283[var4];
            this.field285[this.field284++] = var4;
            var5.field81 = field609;
            int var6 = arg2.method249(1, (byte) -80);
            var5.field1044 = class60.method521(arg2.method249(12, (byte) -80));
            int var7 = arg2.method249(1, (byte) -80);
            if (var7 == 1) {
                this.field513[this.field512++] = var4;
            }
            int var8 = arg2.method249(5, (byte) -80);
            if (var8 > 15) {
                var8 -= 32;
            }
            int var9 = arg2.method249(5, (byte) -80);
            if (var9 > 15) {
                var9 -= 32;
            }
            var5.field40 = var5.field1044.field1560;
            var5.field70 = var5.field1044.field1539;
            var5.field73 = var5.field1044.field1530;
            var5.field74 = var5.field1044.field1544;
            var5.field75 = var5.field1044.field1550;
            var5.field76 = var5.field1044.field1535;
            var5.field90 = var5.field1044.field1532;
            var5.method19(field189.field87[0] + var8, var6 == 1, -612, field189.field88[0] + var9);
        }
        arg2.method250(-845);
    }

    @OriginalMember(owner = "client", name = "A", descriptor = "(I)V")
    public final void method134(int arg0) {
        int var2 = this.field620 * 128 + 64;
        int var3 = this.field621 * 128 + 64;
        int var4 = this.method84(false, var3, this.field303, var2) - this.field622;
        if (this.field230 < var2) {
            this.field230 += (var2 - this.field230) * this.field624 / 1000 + this.field623;
            if (this.field230 > var2) {
                this.field230 = var2;
            }
        }
        if (this.field230 > var2) {
            this.field230 -= (this.field230 - var2) * this.field624 / 1000 + this.field623;
            if (this.field230 < var2) {
                this.field230 = var2;
            }
        }
        if (this.field231 < var4) {
            this.field231 += (var4 - this.field231) * this.field624 / 1000 + this.field623;
            if (this.field231 > var4) {
                this.field231 = var4;
            }
        }
        if (this.field231 > var4) {
            this.field231 -= (this.field231 - var4) * this.field624 / 1000 + this.field623;
            if (this.field231 < var4) {
                this.field231 = var4;
            }
        }
        if (this.field232 < var3) {
            this.field232 += (var3 - this.field232) * this.field624 / 1000 + this.field623;
            if (this.field232 > var3) {
                this.field232 = var3;
            }
        }
        if (this.field232 > var3) {
            this.field232 -= (this.field232 - var3) * this.field624 / 1000 + this.field623;
            if (this.field232 < var3) {
                this.field232 = var3;
            }
        }
        int var5 = this.field274 * 128 + 64;
        int var6 = this.field275 * 128 + 64;
        int var7 = this.method84(false, var6, this.field303, var5) - this.field276;
        int var8 = var5 - this.field230;
        int var9 = var7 - this.field231;
        int var10 = var6 - this.field232;
        int var11 = (int) Math.sqrt((double) (var8 * var8 + var10 * var10));
        int var12 = (int) (Math.atan2((double) var9, (double) var11) * 325.949D) & 2047;
        if (arg0 != 0) {
            field245 = this.field569.method541();
        }
        int var13 = (int) (Math.atan2((double) var8, (double) var10) * -325.949D) & 2047;
        if (var12 < 128) {
            var12 = 128;
        }
        if (var12 > 383) {
            var12 = 383;
        }
        if (this.field233 < var12) {
            this.field233 += (var12 - this.field233) * this.field278 / 1000 + this.field277;
            if (this.field233 > var12) {
                this.field233 = var12;
            }
        }
        if (this.field233 > var12) {
            this.field233 -= (this.field233 - var12) * this.field278 / 1000 + this.field277;
            if (this.field233 < var12) {
                this.field233 = var12;
            }
        }
        int var14 = var13 - this.field234;
        if (var14 > 1024) {
            var14 -= 2048;
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (var14 > 0) {
            this.field234 += this.field278 * var14 / 1000 + this.field277;
            this.field234 &= 2047;
        }
        if (var14 < 0) {
            this.field234 -= -var14 * this.field278 / 1000 + this.field277;
            this.field234 &= 2047;
        }
        int var15 = var13 - this.field234;
        if (var15 > 1024) {
            var15 -= 2048;
        }
        if (var15 < -1024) {
            var15 += 2048;
        }
        if (var15 < 0 && var14 > 0 || var15 > 0 && var14 < 0) {
            this.field234 = var13;
        }
    }

    @OriginalMember(owner = "client", name = "i", descriptor = "(Z)V")
    public final void method135(boolean arg0) {
        int var2 = this.field208;
        int var3 = this.field209;
        int var4 = this.field210;
        int var5 = this.field211;
        int var6 = 6116423;
        class11.method196(var6, var2, var4, var5, var3, 3);
        if (!arg0) {
            this.field290 = null;
        }
        class11.method196(0, var2 + 1, var4 - 2, 16, var3 + 1, 3);
        class11.method197(var3 + 18, var4 - 2, var2 + 1, var5 - 19, (byte) -19, 0);
        this.field386.method180(var3 + 14, "Choose Option", -412, var2 + 3, var6);
        int var7 = super.field1510;
        int var8 = super.field1511;
        if (this.field207 == 0) {
            var7 -= 4;
            var8 -= 4;
        }
        if (this.field207 == 1) {
            var7 -= 553;
            var8 -= 205;
        }
        if (this.field207 == 2) {
            var7 -= 17;
            var8 -= 357;
        }
        for (int var9 = 0; var9 < this.field203; ++var9) {
            int var10 = (this.field203 - 1 - var9) * 15 + var3 + 31;
            int var11 = 16777215;
            if (var7 > var2 && var7 < var2 + var4 && var8 > var10 - 13 && var8 < var10 + 3) {
                var11 = 16776960;
            }
            this.field386.method184(var11, this.field286[var9], true, 0, var10, var2 + 3);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIIILSJPORZIF;)V")
    public final void method136(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class48 arg6) {
        if (arg6.field1269 == 0 && arg6.field1213 != null && !arg6.field1225) {
            if (arg1 >= arg2 && arg0 >= arg4 && arg1 <= arg6.field1247 + arg2 && arg0 <= arg6.field1267 + arg4) {
                int var8 = arg6.field1213.length;
                for (int var9 = 0; var9 < var8; ++var9) {
                    int var10 = arg6.field1276[var9] + arg2;
                    int var11 = arg6.field1273[var9] + arg4 - arg3;
                    class48 var12 = class48.field1219[arg6.field1213[var9]];
                    int var13 = var12.field1271 + var10;
                    int var14 = var12.field1274 + var11;
                    if ((var12.field1275 >= 0 || var12.field1246 != 0) && arg1 >= var13 && arg0 >= var14 && arg1 < var12.field1247 + var13 && arg0 < var12.field1267 + var14) {
                        if (var12.field1275 >= 0) {
                            this.field149 = var12.field1275;
                        } else {
                            this.field149 = var12.field1262;
                        }
                    }
                    if (var12.field1269 == 0) {
                        this.method136(arg0, arg1, var13, var12.field1266, var14, -4903, var12);
                        if (var12.field1215 > var12.field1267) {
                            this.method85(var12.field1267, false, true, var12, var14, var12.field1215, var12.field1247 + var13, arg1, arg0);
                        }
                    } else {
                        if (var12.field1226 == 1 && arg1 >= var13 && arg0 >= var14 && arg1 < var12.field1247 + var13 && arg0 < var12.field1267 + var14) {
                            boolean var15 = false;
                            if (var12.field1268 != 0) {
                                var15 = this.method142(var12, 21568);
                            }
                            if (!var15) {
                                this.field286[this.field203] = var12.field1214;
                                this.field562[this.field203] = 843;
                                this.field561[this.field203] = var12.field1262;
                                ++this.field203;
                            }
                        }
                        if (var12.field1226 == 2 && this.field217 == 0 && arg1 >= var13 && arg0 >= var14 && arg1 < var12.field1247 + var13 && arg0 < var12.field1267 + var14) {
                            String var16 = var12.field1257;
                            if (var16.indexOf(" ") != -1) {
                                var16 = var16.substring(0, var16.indexOf(" "));
                            }
                            this.field286[this.field203] = var16 + " @gre@" + var12.field1265;
                            this.field562[this.field203] = 841;
                            this.field561[this.field203] = var12.field1262;
                            ++this.field203;
                        }
                        if (var12.field1226 == 3 && arg1 >= var13 && arg0 >= var14 && arg1 < var12.field1247 + var13 && arg0 < var12.field1267 + var14) {
                            this.field286[this.field203] = "Close";
                            this.field562[this.field203] = 329;
                            this.field561[this.field203] = var12.field1262;
                            ++this.field203;
                        }
                        if (var12.field1226 == 4 && arg1 >= var13 && arg0 >= var14 && arg1 < var12.field1247 + var13 && arg0 < var12.field1267 + var14) {
                            this.field286[this.field203] = var12.field1214;
                            this.field562[this.field203] = 938;
                            this.field561[this.field203] = var12.field1262;
                            ++this.field203;
                        }
                        if (var12.field1226 == 5 && arg1 >= var13 && arg0 >= var14 && arg1 < var12.field1247 + var13 && arg0 < var12.field1267 + var14) {
                            this.field286[this.field203] = var12.field1214;
                            this.field562[this.field203] = 936;
                            this.field561[this.field203] = var12.field1262;
                            ++this.field203;
                        }
                        if (var12.field1226 == 6 && !this.field298 && arg1 >= var13 && arg0 >= var14 && arg1 < var12.field1247 + var13 && arg0 < var12.field1267 + var14) {
                            this.field286[this.field203] = var12.field1214;
                            this.field562[this.field203] = 264;
                            this.field561[this.field203] = var12.field1262;
                            ++this.field203;
                        }
                        if (var12.field1269 == 2) {
                            int var17 = 0;
                            for (int var18 = 0; var18 < var12.field1267; ++var18) {
                                for (int var19 = 0; var19 < var12.field1247; ++var19) {
                                    int var20 = (var12.field1250 + 32) * var19 + var13;
                                    int var21 = (var12.field1261 + 32) * var18 + var14;
                                    if (var17 < 20) {
                                        var20 += var12.field1245[var17];
                                        var21 += var12.field1235[var17];
                                    }
                                    if (arg1 >= var20 && arg0 >= var21 && arg1 < var20 + 32 && arg0 < var21 + 32) {
                                        this.field580 = var17;
                                        this.field581 = var12.field1262;
                                        if (var12.field1256[var17] > 0) {
                                            class46 var22 = class46.method438(var12.field1256[var17] - 1);
                                            if (this.field482 == 1 && var12.field1279) {
                                                if (this.field484 != var12.field1262 || this.field483 != var17) {
                                                    this.field286[this.field203] = "Use " + this.field486 + " with @lre@" + var22.field1164;
                                                    this.field562[this.field203] = 637;
                                                    this.field563[this.field203] = var22.field1173;
                                                    this.field560[this.field203] = var17;
                                                    this.field561[this.field203] = var12.field1262;
                                                    ++this.field203;
                                                }
                                            } else if (this.field217 == 1 && var12.field1279) {
                                                if ((this.field219 & 16) == 16) {
                                                    this.field286[this.field203] = this.field220 + " @lre@" + var22.field1164;
                                                    this.field562[this.field203] = 522;
                                                    this.field563[this.field203] = var22.field1173;
                                                    this.field560[this.field203] = var17;
                                                    this.field561[this.field203] = var12.field1262;
                                                    ++this.field203;
                                                }
                                            } else {
                                                if (var12.field1279) {
                                                    for (int var23 = 4; var23 >= 3; --var23) {
                                                        if (var22.field1175 != null && var22.field1175[var23] != null) {
                                                            this.field286[this.field203] = var22.field1175[var23] + " @lre@" + var22.field1164;
                                                            if (var23 == 3) {
                                                                this.field562[this.field203] = 36;
                                                            }
                                                            if (var23 == 4) {
                                                                this.field562[this.field203] = 815;
                                                            }
                                                            this.field563[this.field203] = var22.field1173;
                                                            this.field560[this.field203] = var17;
                                                            this.field561[this.field203] = var12.field1262;
                                                            ++this.field203;
                                                        } else if (var23 == 4) {
                                                            this.field286[this.field203] = "Drop @lre@" + var22.field1164;
                                                            this.field562[this.field203] = 815;
                                                            this.field563[this.field203] = var22.field1173;
                                                            this.field560[this.field203] = var17;
                                                            this.field561[this.field203] = var12.field1262;
                                                            ++this.field203;
                                                        }
                                                    }
                                                }
                                                if (var12.field1253) {
                                                    this.field286[this.field203] = "Use @lre@" + var22.field1164;
                                                    this.field562[this.field203] = 68;
                                                    this.field563[this.field203] = var22.field1173;
                                                    this.field560[this.field203] = var17;
                                                    this.field561[this.field203] = var12.field1262;
                                                    ++this.field203;
                                                }
                                                if (var12.field1279 && var22.field1175 != null) {
                                                    for (int var24 = 2; var24 >= 0; --var24) {
                                                        if (var22.field1175[var24] != null) {
                                                            this.field286[this.field203] = var22.field1175[var24] + " @lre@" + var22.field1164;
                                                            if (var24 == 0) {
                                                                this.field562[this.field203] = 257;
                                                            }
                                                            if (var24 == 1) {
                                                                this.field562[this.field203] = 104;
                                                            }
                                                            if (var24 == 2) {
                                                                this.field562[this.field203] = 984;
                                                            }
                                                            this.field563[this.field203] = var22.field1173;
                                                            this.field560[this.field203] = var17;
                                                            this.field561[this.field203] = var12.field1262;
                                                            ++this.field203;
                                                        }
                                                    }
                                                }
                                                if (var12.field1227 != null) {
                                                    for (int var25 = 4; var25 >= 0; --var25) {
                                                        if (var12.field1227[var25] != null) {
                                                            this.field286[this.field203] = var12.field1227[var25] + " @lre@" + var22.field1164;
                                                            if (var25 == 0) {
                                                                this.field562[this.field203] = 114;
                                                            }
                                                            if (var25 == 1) {
                                                                this.field562[this.field203] = 819;
                                                            }
                                                            if (var25 == 2) {
                                                                this.field562[this.field203] = 474;
                                                            }
                                                            if (var25 == 3) {
                                                                this.field562[this.field203] = 541;
                                                            }
                                                            if (var25 == 4) {
                                                                this.field562[this.field203] = 140;
                                                            }
                                                            this.field563[this.field203] = var22.field1173;
                                                            this.field560[this.field203] = var17;
                                                            this.field561[this.field203] = var12.field1262;
                                                            ++this.field203;
                                                        }
                                                    }
                                                }
                                                this.field286[this.field203] = "Examine @lre@" + var22.field1164;
                                                this.field562[this.field203] = 1313;
                                                this.field563[this.field203] = var22.field1173;
                                                this.field560[this.field203] = var17;
                                                this.field561[this.field203] = var12.field1262;
                                                ++this.field203;
                                            }
                                        }
                                    }
                                    ++var17;
                                }
                            }
                        }
                    }
                }
                if (arg5 != -4903) {
                    field626 = !field626;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "B", descriptor = "(I)V")
    public final void method137(int arg0) {
        if (this.field451 == 0) {
            int var2 = super.field1516;
            if (arg0 != -39297) {
                for (int var3 = 1; var3 > 0; ++var3) {
                }
            }
            if (this.field217 == 1 && super.field1517 >= 516 && super.field1518 >= 160 && super.field1517 <= 765 && super.field1518 <= 205) {
                var2 = 0;
            }
            if (this.field516) {
                if (var2 != 1) {
                    int var4 = super.field1510;
                    int var5 = super.field1511;
                    if (this.field207 == 0) {
                        var4 -= 4;
                        var5 -= 4;
                    }
                    if (this.field207 == 1) {
                        var4 -= 553;
                        var5 -= 205;
                    }
                    if (this.field207 == 2) {
                        var4 -= 17;
                        var5 -= 357;
                    }
                    if (var4 < this.field208 - 10 || var4 > this.field210 + this.field208 + 10 || var5 < this.field209 - 10 || var5 > this.field211 + this.field209 + 10) {
                        this.field516 = false;
                        if (this.field207 == 1) {
                            this.field589 = true;
                        }
                        if (this.field207 == 2) {
                            this.field212 = true;
                        }
                    }
                }
                if (var2 == 1) {
                    int var6 = this.field208;
                    int var7 = this.field209;
                    int var8 = this.field210;
                    int var9 = super.field1517;
                    int var10 = super.field1518;
                    if (this.field207 == 0) {
                        var9 -= 4;
                        var10 -= 4;
                    }
                    if (this.field207 == 1) {
                        var9 -= 553;
                        var10 -= 205;
                    }
                    if (this.field207 == 2) {
                        var9 -= 17;
                        var10 -= 357;
                    }
                    int var11 = -1;
                    for (int var12 = 0; var12 < this.field203; ++var12) {
                        int var13 = (this.field203 - 1 - var12) * 15 + var7 + 31;
                        if (var9 > var6 && var9 < var6 + var8 && var10 > var13 - 13 && var10 < var13 + 3) {
                            var11 = var12;
                        }
                    }
                    if (var11 != -1) {
                        this.method115(var11, -390);
                    }
                    this.field516 = false;
                    if (this.field207 == 1) {
                        this.field589 = true;
                    }
                    if (this.field207 == 2) {
                        this.field212 = true;
                        return;
                    }
                }
            } else {
                if (var2 == 1 && this.field203 > 0) {
                    int var14 = this.field562[this.field203 - 1];
                    if (var14 == 114 || var14 == 819 || var14 == 474 || var14 == 541 || var14 == 140 || var14 == 257 || var14 == 104 || var14 == 984 || var14 == 36 || var14 == 815 || var14 == 68 || var14 == 1313) {
                        int var15 = this.field560[this.field203 - 1];
                        int var16 = this.field561[this.field203 - 1];
                        class48 var17 = class48.field1219[var16];
                        if (var17.field1248 || var17.field1270) {
                            this.field534 = false;
                            this.field567 = 0;
                            this.field449 = var16;
                            this.field450 = var15;
                            this.field451 = 2;
                            this.field452 = super.field1517;
                            this.field453 = super.field1518;
                            if (class48.field1219[var16].field1228 == this.field262) {
                                this.field451 = 1;
                            }
                            if (class48.field1219[var16].field1228 == this.field221) {
                                this.field451 = 3;
                            }
                            return;
                        }
                    }
                }
                if (var2 == 1 && (this.field366 == 1 || this.method122((byte) -101, this.field203 - 1)) && this.field203 > 2) {
                    var2 = 2;
                }
                if (var2 == 1 && this.field203 > 0) {
                    this.method115(this.field203 - 1, -390);
                }
                if (var2 != 2 || this.field203 <= 0) {
                    return;
                }
                this.method69(13755);
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(ILIMUIZRAF;I)V")
    private final void method138(int arg0, class24 arg1, int arg2) {
        label59: while (true) {
            if (arg0 >= 0) {
                int var16 = 1;
                while (true) {
                    if (var16 <= 0) {
                        continue label59;
                    }
                    ++var16;
                }
            }
            int var4 = arg1.method249(8, (byte) -80);
            if (var4 < this.field510) {
                for (int var5 = var4; var5 < this.field510; ++var5) {
                    this.field481[this.field480++] = this.field511[var5];
                }
            }
            if (var4 > this.field510) {
                signlink.reporterror(this.field151 + " Too many players");
                throw new RuntimeException("eek");
            }
            this.field510 = 0;
            for (int var6 = 0; var6 < var4; ++var6) {
                int var7 = this.field511[var6];
                class49 var8 = this.field509[var7];
                int var9 = arg1.method249(1, (byte) -80);
                if (var9 == 0) {
                    this.field511[this.field510++] = var7;
                    var8.field81 = field609;
                } else {
                    int var10 = arg1.method249(2, (byte) -80);
                    if (var10 == 0) {
                        this.field511[this.field510++] = var7;
                        var8.field81 = field609;
                        this.field513[this.field512++] = var7;
                    } else if (var10 == 1) {
                        this.field511[this.field510++] = var7;
                        var8.field81 = field609;
                        int var11 = arg1.method249(3, (byte) -80);
                        var8.method20(false, var11, (byte) 0);
                        int var12 = arg1.method249(1, (byte) -80);
                        if (var12 == 1) {
                            this.field513[this.field512++] = var7;
                        }
                    } else if (var10 == 2) {
                        this.field511[this.field510++] = var7;
                        var8.field81 = field609;
                        int var13 = arg1.method249(3, (byte) -80);
                        var8.method20(true, var13, (byte) 0);
                        int var14 = arg1.method249(3, (byte) -80);
                        var8.method20(true, var14, (byte) 0);
                        int var15 = arg1.method249(1, (byte) -80);
                        if (var15 == 1) {
                            this.field513[this.field512++] = var7;
                        }
                    } else if (var10 == 3) {
                        this.field481[this.field480++] = var7;
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BZ)V")
    public final void method139(byte arg0, boolean arg1) {
        if (field189.field51 >> 7 == this.field476 && field189.field52 >> 7 == this.field477) {
            this.field476 = 0;
        }
        int var3 = this.field510;
        if (arg0 == 8) {
            boolean var4 = false;
        } else {
            this.method116();
        }
        if (arg1) {
            var3 = 1;
        }
        for (int var5 = 0; var5 < var3; ++var5) {
            class49 var6;
            int var7;
            if (arg1) {
                var6 = field189;
                var7 = this.field508 << 14;
            } else {
                var6 = this.field509[this.field511[var5]];
                var7 = this.field511[var5] << 14;
            }
            if (var6 != null && var6.method21(0)) {
                var6.field1291 = false;
                if ((field318 && this.field510 > 50 || this.field510 > 200) && !arg1 && var6.field90 == var6.field67) {
                    var6.field1291 = true;
                }
                int var8 = var6.field51 >> 7;
                int var9 = var6.field52 >> 7;
                if (var8 >= 0 && var8 < 104 && var9 >= 0 && var9 < 104) {
                    if (var6.field1309 != null && field609 >= var6.field1289 && field609 < var6.field1290) {
                        var6.field1291 = false;
                        var6.field1312 = this.method84(false, var6.field52, this.field303, var6.field51);
                        this.field530.method337(60, var6.field51, var6.field1300, var7, var6.field1297, var6.field1312, var6.field53, this.field303, var6, var6.field1299, (byte) 78, var6.field1298, var6.field52);
                    } else {
                        if ((var6.field51 & 127) == 64 && (var6.field52 & 127) == 64) {
                            if (this.field400[var8][var9] == this.field379) {
                                continue;
                            }
                            this.field400[var8][var9] = this.field379;
                        }
                        var6.field1312 = this.method84(false, var6.field52, this.field303, var6.field51);
                        this.field530.method336(var6.field1312, false, var7, 60, var6.field51, var6, this.field303, var6.field52, var6.field53, var6.field39);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "C", descriptor = "(I)V")
    public final void method140(int arg0) {
        if (arg0 <= 0) {
            this.field497 = -1;
        }
        try {
            int var2 = field189.field51 + this.field501;
            int var3 = field189.field52 + this.field301;
            if (this.field471 - var2 < -500 || this.field471 - var2 > 500 || this.field472 - var3 < -500 || this.field472 - var3 > 500) {
                this.field471 = var2;
                this.field472 = var3;
            }
            if (this.field471 != var2) {
                this.field471 += (var2 - this.field471) / 16;
            }
            if (this.field472 != var3) {
                this.field472 += (var3 - this.field472) / 16;
            }
            if (super.field1520[1] == 1) {
                this.field414 += (-24 - this.field414) / 2;
            } else if (super.field1520[2] == 1) {
                this.field414 += (24 - this.field414) / 2;
            } else {
                this.field414 /= 2;
            }
            if (super.field1520[3] == 1) {
                this.field415 += (12 - this.field415) / 2;
            } else if (super.field1520[4] == 1) {
                this.field415 += (-12 - this.field415) / 2;
            } else {
                this.field415 /= 2;
            }
            this.field413 = this.field414 / 2 + this.field413 & 2047;
            this.field412 += this.field415 / 2;
            if (this.field412 < 128) {
                this.field412 = 128;
            }
            if (this.field412 > 383) {
                this.field412 = 383;
            }
            int var4 = this.field471 >> 7;
            int var5 = this.field472 >> 7;
            int var6 = this.method84(false, this.field472, this.field303, this.field471);
            int var7 = 0;
            if (var4 > 3 && var5 > 3 && var4 < 100 && var5 < 100) {
                for (int var8 = var4 - 4; var8 <= var4 + 4; ++var8) {
                    for (int var9 = var5 - 4; var9 <= var5 + 4; ++var9) {
                        int var10 = this.field303;
                        if (var10 < 3 && (this.field524[1][var8][var9] & 2) == 2) {
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
            if (var12 > this.field368) {
                this.field368 += (var12 - this.field368) / 24;
            } else if (var12 < this.field368) {
                this.field368 += (var12 - this.field368) / 80;
            }
        } catch (Exception var13) {
            signlink.reporterror("glfc_ex " + field189.field51 + "," + field189.field52 + "," + this.field471 + "," + this.field472 + "," + this.field460 + "," + this.field461 + "," + this.field330 + "," + this.field331);
            throw new RuntimeException("eek");
        }
    }

    @OriginalMember(owner = "client", name = "j", descriptor = "(Z)V")
    public final void method141(boolean arg0) {
        if (!arg0) {
            ++field494;
            if (field494 > 138) {
                field494 = 0;
                this.field223.method227(104, this.field376);
                this.field223.method228(156);
            }
            while (true) {
                int var2;
                do {
                    while (true) {
                        var2 = this.method515(this.field172);
                        if (var2 == -1) {
                            return;
                        }
                        if (this.field262 != -1 && this.field490 == this.field262) {
                            if (var2 == 8 && this.field248.length() > 0) {
                                this.field248 = this.field248.substring(0, this.field248.length() - 1);
                            }
                            break;
                        }
                        if (this.field424) {
                            if (var2 >= 32 && var2 <= 122 && this.field263.length() < 80) {
                                this.field263 = this.field263 + (char) var2;
                                this.field212 = true;
                            }
                            if (var2 == 8 && this.field263.length() > 0) {
                                this.field263 = this.field263.substring(0, this.field263.length() - 1);
                                this.field212 = true;
                            }
                            if (var2 == 13 || var2 == 10) {
                                this.field424 = false;
                                this.field212 = true;
                                if (this.field555 == 1) {
                                    long var3 = class31.method318(this.field263);
                                    this.method87(var3, 735);
                                }
                                if (this.field555 == 2 && this.field578 > 0) {
                                    long var5 = class31.method318(this.field263);
                                    this.method112(103, var5);
                                }
                                if (this.field555 == 3 && this.field263.length() > 0) {
                                    this.field223.method227(53, this.field376);
                                    this.field223.method228(0);
                                    int var7 = this.field223.field832;
                                    this.field223.method234(979, this.field256);
                                    class26.method277(this.field263, this.field223, 974);
                                    this.field223.method237(this.field191, this.field223.field832 - var7);
                                    this.field263 = class26.method278(this.field263, 852);
                                    this.field263 = class29.method290(this.field263, 852);
                                    this.method125(6, class31.method322(true, class31.method319(-602, this.field256)), this.field263, (byte) 5);
                                    if (this.field515 == 2) {
                                        this.field515 = 1;
                                        this.field176 = true;
                                        this.field223.method227(112, this.field376);
                                        this.field223.method228(this.field421);
                                        this.field223.method228(this.field515);
                                        this.field223.method228(this.field488);
                                    }
                                }
                                if (this.field555 == 4 && this.field448 < 100) {
                                    long var8 = class31.method318(this.field263);
                                    this.method66(var8, 0);
                                }
                                if (this.field555 == 5 && this.field448 > 0) {
                                    long var10 = class31.method318(this.field263);
                                    this.method94(var10, 0);
                                }
                            }
                        } else if (this.field492 == 1) {
                            if (var2 >= 48 && var2 <= 57 && this.field467.length() < 10) {
                                this.field467 = this.field467 + (char) var2;
                                this.field212 = true;
                            }
                            if (var2 == 8 && this.field467.length() > 0) {
                                this.field467 = this.field467.substring(0, this.field467.length() - 1);
                                this.field212 = true;
                            }
                            if (var2 == 13 || var2 == 10) {
                                if (this.field467.length() > 0) {
                                    int var12 = 0;
                                    try {
                                        var12 = Integer.parseInt(this.field467);
                                    } catch (Exception var22) {
                                    }
                                    this.field223.method227(134, this.field376);
                                    this.field223.method232(var12);
                                }
                                this.field492 = 0;
                                this.field212 = true;
                            }
                        } else if (this.field492 == 2) {
                            if (var2 >= 32 && var2 <= 122 && this.field467.length() < 12) {
                                this.field467 = this.field467 + (char) var2;
                                this.field212 = true;
                            }
                            if (var2 == 8 && this.field467.length() > 0) {
                                this.field467 = this.field467.substring(0, this.field467.length() - 1);
                                this.field212 = true;
                            }
                            if (var2 == 13 || var2 == 10) {
                                if (this.field467.length() > 0) {
                                    this.field223.method227(69, this.field376);
                                    this.field223.method234(979, class31.method318(this.field467));
                                }
                                this.field492 = 0;
                                this.field212 = true;
                            }
                        } else if (this.field221 == -1) {
                            if (var2 >= 32 && var2 <= 122 && this.field289.length() < 80) {
                                this.field289 = this.field289 + (char) var2;
                                this.field212 = true;
                            }
                            if (var2 == 8 && this.field289.length() > 0) {
                                this.field289 = this.field289.substring(0, this.field289.length() - 1);
                                this.field212 = true;
                            }
                            if ((var2 == 13 || var2 == 10) && this.field289.length() > 0) {
                                if (this.field235 == 2) {
                                    if (this.field289.equals("::clientdrop")) {
                                        this.method64(true);
                                    }
                                    if (this.field289.equals("::lag")) {
                                        this.method43(true);
                                    }
                                    if (this.field289.equals("::prefetchmusic")) {
                                        for (int var13 = 0; var13 < this.field437.method474(2, 86); ++var13) {
                                            this.field437.method468((byte) -65, 2, var13, (byte) 1);
                                        }
                                    }
                                    if (this.field289.equals("::fpson")) {
                                        field598 = true;
                                    }
                                    if (this.field289.equals("::fpsoff")) {
                                        field598 = false;
                                    }
                                    if (this.field289.equals("::noclip")) {
                                        for (int var14 = 0; var14 < 4; ++var14) {
                                            for (int var15 = 1; var15 < 103; ++var15) {
                                                for (int var16 = 1; var16 < 103; ++var16) {
                                                    this.field553[var14].field1586[var15][var16] = 0;
                                                }
                                            }
                                        }
                                    }
                                }
                                if (this.field289.startsWith("::")) {
                                    this.field223.method227(98, this.field376);
                                    this.field223.method228(this.field289.length() - 1);
                                    this.field223.method235(this.field289.substring(2));
                                } else {
                                    String var17 = this.field289.toLowerCase();
                                    byte var18 = 0;
                                    if (var17.startsWith("yellow:")) {
                                        var18 = 0;
                                        this.field289 = this.field289.substring(7);
                                    } else if (var17.startsWith("red:")) {
                                        var18 = 1;
                                        this.field289 = this.field289.substring(4);
                                    } else if (var17.startsWith("green:")) {
                                        var18 = 2;
                                        this.field289 = this.field289.substring(6);
                                    } else if (var17.startsWith("cyan:")) {
                                        var18 = 3;
                                        this.field289 = this.field289.substring(5);
                                    } else if (var17.startsWith("purple:")) {
                                        var18 = 4;
                                        this.field289 = this.field289.substring(7);
                                    } else if (var17.startsWith("white:")) {
                                        var18 = 5;
                                        this.field289 = this.field289.substring(6);
                                    } else if (var17.startsWith("flash1:")) {
                                        var18 = 6;
                                        this.field289 = this.field289.substring(7);
                                    } else if (var17.startsWith("flash2:")) {
                                        var18 = 7;
                                        this.field289 = this.field289.substring(7);
                                    } else if (var17.startsWith("flash3:")) {
                                        var18 = 8;
                                        this.field289 = this.field289.substring(7);
                                    } else if (var17.startsWith("glow1:")) {
                                        var18 = 9;
                                        this.field289 = this.field289.substring(6);
                                    } else if (var17.startsWith("glow2:")) {
                                        var18 = 10;
                                        this.field289 = this.field289.substring(6);
                                    } else if (var17.startsWith("glow3:")) {
                                        var18 = 11;
                                        this.field289 = this.field289.substring(6);
                                    }
                                    String var19 = this.field289.toLowerCase();
                                    byte var20 = 0;
                                    if (var19.startsWith("wave:")) {
                                        var20 = 1;
                                        this.field289 = this.field289.substring(5);
                                    } else if (var19.startsWith("wave2:")) {
                                        var20 = 2;
                                        this.field289 = this.field289.substring(6);
                                    } else if (var19.startsWith("shake:")) {
                                        var20 = 3;
                                        this.field289 = this.field289.substring(6);
                                    } else if (var19.startsWith("scroll:")) {
                                        var20 = 4;
                                        this.field289 = this.field289.substring(7);
                                    } else if (var19.startsWith("slide:")) {
                                        var20 = 5;
                                        this.field289 = this.field289.substring(6);
                                    }
                                    this.field223.method227(228, this.field376);
                                    this.field223.method228(0);
                                    int var21 = this.field223.field832;
                                    this.field223.method256(var18, 0);
                                    this.field282.field832 = 0;
                                    class26.method277(this.field289, this.field282, 974);
                                    this.field223.method273(true, this.field282.field831, this.field282.field832, 0);
                                    this.field223.method228(var20);
                                    this.field223.method237(this.field191, this.field223.field832 - var21);
                                    this.field289 = class26.method278(this.field289, 852);
                                    this.field289 = class29.method290(this.field289, 852);
                                    field189.field77 = this.field289;
                                    field189.field54 = var18;
                                    field189.field80 = var20;
                                    field189.field58 = 150;
                                    if (this.field235 == 2) {
                                        this.method125(2, "@cr2@" + field189.field1302, field189.field77, (byte) 5);
                                    } else if (this.field235 == 1) {
                                        this.method125(2, "@cr1@" + field189.field1302, field189.field77, (byte) 5);
                                    } else {
                                        this.method125(2, field189.field1302, field189.field77, (byte) 5);
                                    }
                                    if (this.field421 == 2) {
                                        this.field421 = 3;
                                        this.field176 = true;
                                        this.field223.method227(112, this.field376);
                                        this.field223.method228(this.field421);
                                        this.field223.method228(this.field515);
                                        this.field223.method228(this.field488);
                                    }
                                }
                                this.field289 = "";
                                this.field212 = true;
                            }
                        }
                    }
                } while ((var2 < 97 || var2 > 122) && (var2 < 65 || var2 > 90) && (var2 < 48 || var2 > 57) && var2 != 32);
                if (this.field248.length() < 12) {
                    this.field248 = this.field248 + (char) var2;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        return signlink.mainapp != null ? signlink.mainapp.getAppletContext() : super.getAppletContext();
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(LSJPORZIF;I)Z")
    public final boolean method142(class48 arg0, int arg1) {
        int var3 = arg0.field1268;
        if (arg1 != 21568) {
            throw new NullPointerException();
        } else if ((var3 < 1 || var3 > 200) && (var3 < 701 || var3 > 900)) {
            if (var3 >= 401 && var3 <= 500) {
                this.field286[this.field203] = "Remove @whi@" + arg0.field1220;
                this.field562[this.field203] = 320;
                ++this.field203;
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
            this.field286[this.field203] = "Remove @whi@" + this.field419[var3];
            this.field562[this.field203] = 647;
            ++this.field203;
            this.field286[this.field203] = "Message @whi@" + this.field419[var3];
            this.field562[this.field203] = 499;
            ++this.field203;
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "D", descriptor = "(I)V")
    public final void method143(int arg0) {
        if (this.field345 == 2) {
            this.method48(this.field575 * 2, (byte) 8, (this.field573 - this.field330 << 7) + this.field576, (this.field574 - this.field331 << 7) + this.field577);
            while (arg0 >= 0) {
                this.method116();
            }
            if (this.field556 > -1 && field609 % 20 < 10) {
                this.field227[2].method578(this.field556 - 12, this.field557 - 28, 4);
            }
        }
    }

    @OriginalMember(owner = "client", name = "E", descriptor = "(I)V")
    public final void method144(int arg0) {
        if (arg0 >= 0 && arg0 <= 0) {
            for (int var2 = 0; var2 < this.field284; ++var2) {
                int var3 = this.field285[var2];
                class37 var4 = this.field283[var3];
                if (var4 != null) {
                    this.method145(var4, (byte) 42, var4.field1044.field1560);
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LBBWFUJHQ;BI)V")
    public final void method145(class5 arg0, byte arg1, int arg2) {
        if (arg1 != 42) {
            this.method116();
        }
        if (arg0.field51 < 128 || arg0.field52 < 128 || arg0.field51 >= 13184 || arg0.field52 >= 13184) {
            arg0.field41 = -1;
            arg0.field82 = -1;
            arg0.field64 = 0;
            arg0.field65 = 0;
            arg0.field51 = arg0.field87[0] * 128 + arg0.field40 * 64;
            arg0.field52 = arg0.field88[0] * 128 + arg0.field40 * 64;
            arg0.method17(6);
        }
        if (field189 == arg0 && (arg0.field51 < 1536 || arg0.field52 < 1536 || arg0.field51 >= 11776 || arg0.field52 >= 11776)) {
            arg0.field41 = -1;
            arg0.field82 = -1;
            arg0.field64 = 0;
            arg0.field65 = 0;
            arg0.field51 = arg0.field87[0] * 128 + arg0.field40 * 64;
            arg0.field52 = arg0.field88[0] * 128 + arg0.field40 * 64;
            arg0.method17(6);
        }
        if (arg0.field64 > field609) {
            this.method146(-874, arg0);
        } else if (arg0.field65 >= field609) {
            this.method147(arg0, true);
        } else {
            this.method148((byte) -79, arg0);
        }
        this.method149(false, arg0);
        this.method150(44843, arg0);
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILBBWFUJHQ;)V")
    public final void method146(int arg0, class5 arg1) {
        int var3 = arg1.field64 - field609;
        int var4 = arg1.field60 * 128 + arg1.field40 * 64;
        int var5 = arg1.field62 * 128 + arg1.field40 * 64;
        arg1.field51 += (var4 - arg1.field51) / var3;
        arg1.field52 += (var5 - arg1.field52) / var3;
        arg1.field47 = 0;
        if (arg0 < 0) {
            if (arg1.field66 == 0) {
                arg1.field95 = 1024;
            }
            if (arg1.field66 == 1) {
                arg1.field95 = 1536;
            }
            if (arg1.field66 == 2) {
                arg1.field95 = 0;
            }
            if (arg1.field66 == 3) {
                arg1.field95 = 512;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LBBWFUJHQ;Z)V")
    public final void method147(class5 arg0, boolean arg1) {
        if (field609 == arg0.field65 || arg0.field41 == -1 || arg0.field44 != 0 || arg0.field43 + 1 > class71.field1705[arg0.field41].method591(0, arg0.field42)) {
            int var3 = arg0.field65 - arg0.field64;
            int var4 = field609 - arg0.field64;
            int var5 = arg0.field60 * 128 + arg0.field40 * 64;
            int var6 = arg0.field62 * 128 + arg0.field40 * 64;
            int var7 = arg0.field61 * 128 + arg0.field40 * 64;
            int var8 = arg0.field63 * 128 + arg0.field40 * 64;
            arg0.field51 = ((var3 - var4) * var5 + var4 * var7) / var3;
            arg0.field52 = ((var3 - var4) * var6 + var4 * var8) / var3;
        }
        arg0.field47 = 0;
        this.field254 &= arg1;
        if (arg0.field66 == 0) {
            arg0.field95 = 1024;
        }
        if (arg0.field66 == 1) {
            arg0.field95 = 1536;
        }
        if (arg0.field66 == 2) {
            arg0.field95 = 0;
        }
        if (arg0.field66 == 3) {
            arg0.field95 = 512;
        }
        arg0.field53 = arg0.field95;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BLBBWFUJHQ;)V")
    public final void method148(byte arg0, class5 arg1) {
        arg1.field67 = arg1.field90;
        if (arg1.field78 == 0) {
            arg1.field47 = 0;
        } else {
            if (arg1.field41 != -1 && arg1.field44 == 0) {
                class71 var3 = class71.field1705[arg1.field41];
                if (arg1.field59 > 0 && var3.field1717 == 0) {
                    ++arg1.field47;
                    return;
                }
                if (arg1.field59 <= 0 && var3.field1718 == 0) {
                    ++arg1.field47;
                    return;
                }
            }
            int var4 = arg1.field51;
            int var5 = arg1.field52;
            int var6 = arg1.field87[arg1.field78 - 1] * 128 + arg1.field40 * 64;
            int var7 = arg1.field88[arg1.field78 - 1] * 128 + arg1.field40 * 64;
            if (var6 - var4 <= 256 && var6 - var4 >= -256 && var7 - var5 <= 256 && var7 - var5 >= -256) {
                if (var4 < var6) {
                    if (var5 < var7) {
                        arg1.field95 = 1280;
                    } else if (var5 > var7) {
                        arg1.field95 = 1792;
                    } else {
                        arg1.field95 = 1536;
                    }
                } else if (var4 > var6) {
                    if (var5 < var7) {
                        arg1.field95 = 768;
                    } else if (var5 > var7) {
                        arg1.field95 = 256;
                    } else {
                        arg1.field95 = 512;
                    }
                } else if (var5 < var7) {
                    arg1.field95 = 1024;
                } else {
                    arg1.field95 = 0;
                }
                int var8 = arg1.field95 - arg1.field53 & 2047;
                if (var8 > 1024) {
                    var8 -= 2048;
                }
                int var9 = arg1.field74;
                if (arg0 != -79) {
                    this.field290 = null;
                }
                if (var8 >= -256 && var8 <= 256) {
                    var9 = arg1.field73;
                } else if (var8 >= 256 && var8 < 768) {
                    var9 = arg1.field76;
                } else if (var8 >= -768 && var8 <= -256) {
                    var9 = arg1.field75;
                }
                if (var9 == -1) {
                    var9 = arg1.field73;
                }
                arg1.field67 = var9;
                int var10 = 4;
                if (arg1.field95 != arg1.field53 && arg1.field46 == -1 && arg1.field70 != 0) {
                    var10 = 2;
                }
                if (arg1.field78 > 2) {
                    var10 = 6;
                }
                if (arg1.field78 > 3) {
                    var10 = 8;
                }
                if (arg1.field47 > 0 && arg1.field78 > 1) {
                    var10 = 8;
                    --arg1.field47;
                }
                if (arg1.field72[arg1.field78 - 1]) {
                    var10 <<= 1;
                }
                if (var10 >= 8 && arg1.field73 == arg1.field67 && arg1.field89 != -1) {
                    arg1.field67 = arg1.field89;
                }
                if (var4 < var6) {
                    arg1.field51 += var10;
                    if (arg1.field51 > var6) {
                        arg1.field51 = var6;
                    }
                } else if (var4 > var6) {
                    arg1.field51 -= var10;
                    if (arg1.field51 < var6) {
                        arg1.field51 = var6;
                    }
                }
                if (var5 < var7) {
                    arg1.field52 += var10;
                    if (arg1.field52 > var7) {
                        arg1.field52 = var7;
                    }
                } else if (var5 > var7) {
                    arg1.field52 -= var10;
                    if (arg1.field52 < var7) {
                        arg1.field52 = var7;
                    }
                }
                if (arg1.field51 == var6 && arg1.field52 == var7) {
                    --arg1.field78;
                    if (arg1.field59 > 0) {
                        --arg1.field59;
                        return;
                    }
                }
            } else {
                arg1.field51 = var6;
                arg1.field52 = var7;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZLBBWFUJHQ;)V")
    public final void method149(boolean arg0, class5 arg1) {
        if (arg0) {
            this.field416 = 31;
        }
        if (arg1.field70 != 0) {
            if (arg1.field46 != -1 && arg1.field46 < 32768) {
                class37 var3 = this.field283[arg1.field46];
                if (var3 != null) {
                    int var4 = arg1.field51 - var3.field51;
                    int var5 = arg1.field52 - var3.field52;
                    if (var4 != 0 || var5 != 0) {
                        arg1.field95 = (int) (Math.atan2((double) var4, (double) var5) * 325.949D) & 2047;
                    }
                }
            }
            if (arg1.field46 >= 32768) {
                int var6 = arg1.field46 - 32768;
                if (this.field404 == var6) {
                    var6 = this.field508;
                }
                class49 var7 = this.field509[var6];
                if (var7 != null) {
                    int var8 = arg1.field51 - var7.field51;
                    int var9 = arg1.field52 - var7.field52;
                    if (var8 != 0 || var9 != 0) {
                        arg1.field95 = (int) (Math.atan2((double) var8, (double) var9) * 325.949D) & 2047;
                    }
                }
            }
            if ((arg1.field55 != 0 || arg1.field56 != 0) && (arg1.field78 == 0 || arg1.field47 > 0)) {
                int var10 = arg1.field51 - (arg1.field55 - this.field330 - this.field330) * 64;
                int var11 = arg1.field52 - (arg1.field56 - this.field331 - this.field331) * 64;
                if (var10 != 0 || var11 != 0) {
                    arg1.field95 = (int) (Math.atan2((double) var10, (double) var11) * 325.949D) & 2047;
                }
                arg1.field55 = 0;
                arg1.field56 = 0;
            }
            int var12 = arg1.field95 - arg1.field53 & 2047;
            if (var12 != 0) {
                if (var12 >= arg1.field70 && var12 <= 2048 - arg1.field70) {
                    if (var12 > 1024) {
                        arg1.field53 -= arg1.field70;
                    } else {
                        arg1.field53 += arg1.field70;
                    }
                } else {
                    arg1.field53 = arg1.field95;
                }
                arg1.field53 &= 2047;
                if (arg1.field90 == arg1.field67 && arg1.field95 != arg1.field53) {
                    if (arg1.field91 != -1) {
                        arg1.field67 = arg1.field91;
                        return;
                    }
                    arg1.field67 = arg1.field73;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(ILBBWFUJHQ;)V")
    public final void method150(int arg0, class5 arg1) {
        if (arg0 != 44843) {
            field372 = !field372;
        }
        arg1.field39 = false;
        if (arg1.field67 != -1) {
            class71 var3 = class71.field1705[arg1.field67];
            ++arg1.field69;
            if (arg1.field68 < var3.field1706 && arg1.field69 > var3.method591(0, arg1.field68)) {
                arg1.field69 = 0;
                ++arg1.field68;
            }
            if (arg1.field68 >= var3.field1706) {
                arg1.field69 = 0;
                arg1.field68 = 0;
            }
        }
        if (arg1.field82 != -1 && field609 >= arg1.field85) {
            if (arg1.field83 < 0) {
                arg1.field83 = 0;
            }
            class71 var4 = class9.field136[arg1.field82].field140;
            ++arg1.field84;
            while (arg1.field83 < var4.field1706 && arg1.field84 > var4.method591(0, arg1.field83)) {
                arg1.field84 -= var4.method591(0, arg1.field83);
                ++arg1.field83;
            }
            if (arg1.field83 >= var4.field1706 && (arg1.field83 < 0 || arg1.field83 >= var4.field1706)) {
                arg1.field82 = -1;
            }
        }
        if (arg1.field41 != -1 && arg1.field44 <= 1) {
            class71 var5 = class71.field1705[arg1.field41];
            if (var5.field1717 == 1 && arg1.field59 > 0 && arg1.field64 <= field609 && arg1.field65 < field609) {
                arg1.field44 = 1;
                return;
            }
        }
        if (arg1.field41 != -1 && arg1.field44 == 0) {
            class71 var6 = class71.field1705[arg1.field41];
            ++arg1.field43;
            while (arg1.field42 < var6.field1706 && arg1.field43 > var6.method591(0, arg1.field42)) {
                arg1.field43 -= var6.method591(0, arg1.field42);
                ++arg1.field42;
            }
            if (arg1.field42 >= var6.field1706) {
                arg1.field42 -= var6.field1710;
                ++arg1.field45;
                if (arg1.field45 >= var6.field1716) {
                    arg1.field41 = -1;
                }
                if (arg1.field42 < 0 || arg1.field42 >= var6.field1706) {
                    arg1.field41 = -1;
                }
            }
            arg1.field39 = var6.field1712;
        }
        if (arg1.field44 > 0) {
            --arg1.field44;
        }
    }

    @OriginalMember(owner = "client", name = "F", descriptor = "(I)V")
    public final void method151(int arg0) {
        if (arg0 != 0) {
            this.field572 = !this.field572;
        }
        if (this.field611) {
            this.field611 = false;
            this.field305.method456(0, -30916, 4, super.field1502);
            this.field306.method456(0, -30916, 357, super.field1502);
            this.field307.method456(722, -30916, 4, super.field1502);
            this.field308.method456(743, -30916, 205, super.field1502);
            this.field309.method456(0, -30916, 0, super.field1502);
            this.field310.method456(516, -30916, 4, super.field1502);
            this.field311.method456(516, -30916, 205, super.field1502);
            this.field312.method456(496, -30916, 357, super.field1502);
            this.field313.method456(0, -30916, 338, super.field1502);
            this.field589 = true;
            this.field212 = true;
            this.field354 = true;
            this.field176 = true;
            if (this.field226 != 2) {
                this.field616.method456(4, -30916, 4, super.field1502);
                this.field615.method456(550, -30916, 4, super.field1502);
            }
        }
        if (this.field226 == 2) {
            this.method132(0);
        }
        if (this.field516 && this.field207 == 1) {
            this.field589 = true;
        }
        if (this.field395 != -1) {
            boolean var2 = this.method163(0, this.field607, this.field395);
            if (var2) {
                this.field589 = true;
            }
        }
        if (this.field156 == 2) {
            this.field589 = true;
        }
        if (this.field451 == 2) {
            this.field589 = true;
        }
        if (this.field589) {
            this.method34(759);
            this.field589 = false;
        }
        if (this.field221 == -1) {
            this.field329.field1266 = this.field447 - this.field468 - 77;
            if (super.field1510 > 448 && super.field1510 < 560 && super.field1511 > 332) {
                this.method85(77, false, false, this.field329, 0, this.field447, 463, super.field1510 - 17, super.field1511 - 357);
            }
            int var3 = this.field447 - 77 - this.field329.field1266;
            if (var3 < 0) {
                var3 = 0;
            }
            if (var3 > this.field447 - 77) {
                var3 = this.field447 - 77;
            }
            if (this.field468 != var3) {
                this.field468 = var3;
                this.field212 = true;
            }
        }
        if (this.field221 != -1) {
            boolean var4 = this.method163(0, this.field607, this.field221);
            if (var4) {
                this.field212 = true;
            }
        }
        if (this.field156 == 3) {
            this.field212 = true;
        }
        if (this.field451 == 3) {
            this.field212 = true;
        }
        if (this.field241 != null) {
            this.field212 = true;
        }
        if (this.field516 && this.field207 == 2) {
            this.field212 = true;
        }
        if (this.field212) {
            this.method173(true);
            this.field212 = false;
        }
        if (this.field226 == 2) {
            this.method120(0);
            this.field615.method456(550, -30916, 4, super.field1502);
        }
        if (this.field392 != -1) {
            this.field354 = true;
        }
        if (this.field354) {
            if (this.field392 != -1 && this.field591 == this.field392) {
                this.field392 = -1;
                this.field223.method227(150, this.field376);
                this.field223.method228(this.field591);
            }
            this.field354 = false;
            this.field167.method455(9133);
            this.field433.method13(0, 0, 4);
            if (this.field395 == -1) {
                if (this.field445[this.field591] != -1) {
                    if (this.field591 == 0) {
                        this.field439.method13(22, 10, 4);
                    }
                    if (this.field591 == 1) {
                        this.field440.method13(54, 8, 4);
                    }
                    if (this.field591 == 2) {
                        this.field440.method13(82, 8, 4);
                    }
                    if (this.field591 == 3) {
                        this.field441.method13(110, 8, 4);
                    }
                    if (this.field591 == 4) {
                        this.field443.method13(153, 8, 4);
                    }
                    if (this.field591 == 5) {
                        this.field443.method13(181, 8, 4);
                    }
                    if (this.field591 == 6) {
                        this.field442.method13(209, 9, 4);
                    }
                }
                if (this.field445[0] != -1 && (this.field392 != 0 || field609 % 20 < 10)) {
                    this.field244[0].method13(29, 13, 4);
                }
                if (this.field445[1] != -1 && (this.field392 != 1 || field609 % 20 < 10)) {
                    this.field244[1].method13(53, 11, 4);
                }
                if (this.field445[2] != -1 && (this.field392 != 2 || field609 % 20 < 10)) {
                    this.field244[2].method13(82, 11, 4);
                }
                if (this.field445[3] != -1 && (this.field392 != 3 || field609 % 20 < 10)) {
                    this.field244[3].method13(115, 12, 4);
                }
                if (this.field445[4] != -1 && (this.field392 != 4 || field609 % 20 < 10)) {
                    this.field244[4].method13(153, 13, 4);
                }
                if (this.field445[5] != -1 && (this.field392 != 5 || field609 % 20 < 10)) {
                    this.field244[5].method13(180, 11, 4);
                }
                if (this.field445[6] != -1 && (this.field392 != 6 || field609 % 20 < 10)) {
                    this.field244[6].method13(208, 13, 4);
                }
            }
            this.field167.method456(516, -30916, 160, super.field1502);
            this.field166.method455(9133);
            this.field432.method13(0, 0, 4);
            if (this.field395 == -1) {
                if (this.field445[this.field591] != -1) {
                    if (this.field591 == 7) {
                        this.field517.method13(42, 0, 4);
                    }
                    if (this.field591 == 8) {
                        this.field518.method13(74, 0, 4);
                    }
                    if (this.field591 == 9) {
                        this.field518.method13(102, 0, 4);
                    }
                    if (this.field591 == 10) {
                        this.field519.method13(130, 1, 4);
                    }
                    if (this.field591 == 11) {
                        this.field521.method13(173, 0, 4);
                    }
                    if (this.field591 == 12) {
                        this.field521.method13(201, 0, 4);
                    }
                    if (this.field591 == 13) {
                        this.field520.method13(229, 0, 4);
                    }
                }
                if (this.field445[8] != -1 && (this.field392 != 8 || field609 % 20 < 10)) {
                    this.field244[7].method13(74, 2, 4);
                }
                if (this.field445[9] != -1 && (this.field392 != 9 || field609 % 20 < 10)) {
                    this.field244[8].method13(102, 3, 4);
                }
                if (this.field445[10] != -1 && (this.field392 != 10 || field609 % 20 < 10)) {
                    this.field244[9].method13(137, 4, 4);
                }
                if (this.field445[11] != -1 && (this.field392 != 11 || field609 % 20 < 10)) {
                    this.field244[10].method13(174, 2, 4);
                }
                if (this.field445[12] != -1 && (this.field392 != 12 || field609 % 20 < 10)) {
                    this.field244[11].method13(201, 2, 4);
                }
                if (this.field445[13] != -1 && (this.field392 != 13 || field609 % 20 < 10)) {
                    this.field244[12].method13(226, 2, 4);
                }
            }
            this.field166.method456(496, -30916, 466, super.field1502);
            this.field616.method455(9133);
        }
        if (this.field176) {
            this.field176 = false;
            this.field165.method455(9133);
            this.field431.method13(0, 0, 4);
            this.field385.method177("Public chat", 55, 28, true, 16777215, -771);
            if (this.field421 == 0) {
                this.field385.method177("On", 55, 41, true, 65280, -771);
            }
            if (this.field421 == 1) {
                this.field385.method177("Friends", 55, 41, true, 16776960, -771);
            }
            if (this.field421 == 2) {
                this.field385.method177("Off", 55, 41, true, 16711680, -771);
            }
            if (this.field421 == 3) {
                this.field385.method177("Hide", 55, 41, true, 65535, -771);
            }
            this.field385.method177("Private chat", 184, 28, true, 16777215, -771);
            if (this.field515 == 0) {
                this.field385.method177("On", 184, 41, true, 65280, -771);
            }
            if (this.field515 == 1) {
                this.field385.method177("Friends", 184, 41, true, 16776960, -771);
            }
            if (this.field515 == 2) {
                this.field385.method177("Off", 184, 41, true, 16711680, -771);
            }
            this.field385.method177("Trade/compete", 324, 28, true, 16777215, -771);
            if (this.field488 == 0) {
                this.field385.method177("On", 324, 41, true, 65280, -771);
            }
            if (this.field488 == 1) {
                this.field385.method177("Friends", 324, 41, true, 16776960, -771);
            }
            if (this.field488 == 2) {
                this.field385.method177("Off", 324, 41, true, 16711680, -771);
            }
            this.field385.method177("Report abuse", 458, 33, true, 16777215, -771);
            this.field165.method456(0, -30916, 453, super.field1502);
            this.field616.method455(9133);
        }
        this.field607 = 0;
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(I)V")
    public final void method152(int arg0) {
        if (!this.field588 && !this.field371 && !this.field542) {
            ++field609;
            if (!this.field254) {
                this.method88(692);
            } else {
                this.method107(0);
            }
            this.method172(0);
            if (arg0 >= 0) {
                ;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZII)V")
    public final void method153(boolean arg0, int arg1, int arg2) {
        while (arg1 >= 0) {
            this.field193 = 417;
        }
        signlink.midivol = arg2;
        if (arg0) {
            signlink.midi = "voladjust";
        }
    }

    @OriginalMember(owner = "client", name = "G", descriptor = "(I)V")
    public final void method154(int arg0) {
        for (int var2 = 0; var2 < this.field297; ++var2) {
            if (this.field399[var2] <= 0) {
                boolean var3 = false;
                try {
                    if (this.field229[var2] == this.field603 && this.field214[var2] == this.field344) {
                        if (!this.method170(-130)) {
                            var3 = true;
                        }
                    } else {
                        class24 var4 = class12.method204((byte) 2, this.field229[var2], this.field214[var2]);
                        if (System.currentTimeMillis() + (long) (var4.field832 / 22) > (long) (this.field469 / 22) + this.field436) {
                            this.field469 = var4.field832;
                            this.field436 = System.currentTimeMillis();
                            if (this.method74(-416, var4.field832, var4.field831)) {
                                this.field603 = this.field229[var2];
                                this.field344 = this.field214[var2];
                            } else {
                                var3 = true;
                            }
                        }
                    }
                } catch (Exception var7) {
                }
                if (var3 && this.field399[var2] != -5) {
                    this.field399[var2] = -5;
                } else {
                    --this.field297;
                    for (int var6 = var2; var6 < this.field297; ++var6) {
                        this.field229[var6] = this.field229[var6 + 1];
                        this.field214[var6] = this.field214[var6 + 1];
                        this.field399[var6] = this.field399[var6 + 1];
                    }
                    --var2;
                }
            } else {
                int var10002 = this.field399[var2]--;
            }
        }
        if (arg0 <= 0) {
            this.field191 = this.field569.method541();
        }
        if (this.field222 > 0) {
            this.field222 -= 20;
            if (this.field222 < 0) {
                this.field222 = 0;
            }
            if (this.field222 == 0 && this.field195 && !field318) {
                this.field346 = this.field377;
                this.field347 = true;
                this.field437.method469(2, this.field346);
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIZIIII)V")
    public final void method155(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = 2048 - arg1 & 2047;
        int var9 = 2048 - arg4 & 2047;
        int var10 = 0;
        int var11 = 0;
        int var12 = arg0;
        if (var8 != 0) {
            int var13 = class67.field1678[var8];
            int var14 = class67.field1679[var8];
            int var15 = var11 * var14 - arg0 * var13 >> 16;
            var12 = var11 * var13 + arg0 * var14 >> 16;
            var11 = var15;
        }
        if (var9 != 0) {
            int var16 = class67.field1678[var9];
            int var17 = class67.field1679[var9];
            int var18 = var10 * var17 + var12 * var16 >> 16;
            var12 = var12 * var17 - var10 * var16 >> 16;
            var10 = var18;
        }
        this.field230 = arg5 - var10;
        this.field231 = arg6 - var11;
        this.field232 = arg3 - var12;
        if (arg2) {
            this.method116();
        }
        this.field233 = arg1;
        this.field234 = arg4;
    }

    @OriginalMember(owner = "client", name = "k", descriptor = "(Z)V")
    public final void method156(boolean arg0) {
        if (!arg0) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        if (this.field369 == 0) {
            if (super.field1516 == 1) {
                int var3 = super.field1517 - 25 - 550;
                int var4 = super.field1518 - 5 - 4;
                if (var3 >= 0 && var4 >= 0 && var3 < 146 && var4 < 151) {
                    var3 -= 73;
                    var4 -= 75;
                    int var5 = this.field413 + this.field319 & 2047;
                    int var6 = class58.field1476[var5];
                    int var7 = class58.field1477[var5];
                    int var8 = (this.field287 + 256) * var6 >> 8;
                    int var9 = (this.field287 + 256) * var7 >> 8;
                    int var10 = var3 * var9 + var4 * var8 >> 11;
                    int var11 = var4 * var9 - var3 * var8 >> 11;
                    int var12 = field189.field51 + var10 >> 7;
                    int var13 = field189.field52 - var11 >> 7;
                    boolean var14 = this.method78(0, field189.field87[0], field189.field88[0], 0, true, true, 1, var13, var12, 0, 0, 0);
                    if (var14) {
                        this.field223.method228(var3);
                        this.field223.method228(var4);
                        this.field223.method229(this.field413);
                        this.field223.method228(57);
                        this.field223.method228(this.field319);
                        this.field223.method228(this.field287);
                        this.field223.method228(89);
                        this.field223.method229(field189.field51);
                        this.field223.method229(field189.field52);
                        this.field223.method228(this.field606);
                        this.field223.method228(63);
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LIMUIZRAF;II)V")
    private final void method157(class24 arg0, int arg1, int arg2) {
        int var4 = 92 / arg2;
        while (arg0.field833 + 10 < arg1 * 8) {
            int var5 = arg0.method249(11, (byte) -80);
            if (var5 == 2047) {
                break;
            }
            if (this.field509[var5] == null) {
                this.field509[var5] = new class49();
                if (this.field514[var5] != null) {
                    this.field509[var5].method452(457, this.field514[var5]);
                }
            }
            this.field511[this.field510++] = var5;
            class49 var6 = this.field509[var5];
            var6.field81 = field609;
            int var7 = arg0.method249(5, (byte) -80);
            if (var7 > 15) {
                var7 -= 32;
            }
            int var8 = arg0.method249(1, (byte) -80);
            int var9 = arg0.method249(5, (byte) -80);
            if (var9 > 15) {
                var9 -= 32;
            }
            int var10 = arg0.method249(1, (byte) -80);
            if (var10 == 1) {
                this.field513[this.field512++] = var5;
            }
            var6.method19(field189.field87[0] + var7, var8 == 1, -612, field189.field88[0] + var9);
        }
        arg0.method250(-845);
    }

    @OriginalMember(owner = "client", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        if (signlink.mainapp != null) {
            return signlink.mainapp.getCodeBase();
        } else {
            try {
                if (super.field1505 != null) {
                    return new URL("http://127.0.0.1:" + (field316 + 80));
                }
            } catch (Exception var1) {
            }
            return super.getCodeBase();
        }
    }

    @OriginalMember(owner = "client", name = "l", descriptor = "(Z)V")
    public final void method158(boolean arg0) {
        short var2 = 256;
        if (!arg0) {
            field252 = -181;
        }
        for (int var3 = 10; var3 < 117; ++var3) {
            int var18 = (int) (Math.random() * 100.0D);
            if (var18 < 50) {
                this.field536[(var2 - 2 << 7) + var3] = 255;
            }
        }
        for (int var4 = 0; var4 < 100; ++var4) {
            int var15 = (int) (Math.random() * 124.0D) + 2;
            int var16 = (int) (Math.random() * 128.0D) + 128;
            int var17 = (var16 << 7) + var15;
            this.field536[var17] = 192;
        }
        for (int var5 = 1; var5 < var2 - 1; ++var5) {
            for (int var13 = 1; var13 < 127; ++var13) {
                int var14 = (var5 << 7) + var13;
                this.field537[var14] = (this.field536[var14 - 1] + this.field536[var14 + 1] + this.field536[var14 - 128] + this.field536[var14 + 128]) / 4;
            }
        }
        this.field194 += 128;
        if (this.field194 > this.field259.length) {
            this.field194 -= this.field259.length;
            int var6 = (int) (Math.random() * 12.0D);
            this.method40(this.field264[var6], this.field572);
        }
        for (int var7 = 1; var7 < var2 - 1; ++var7) {
            for (int var10 = 1; var10 < 127; ++var10) {
                int var11 = (var7 << 7) + var10;
                int var12 = this.field537[var11 + 128] - this.field259[this.field194 + var11 & this.field259.length - 1] / 5;
                if (var12 < 0) {
                    var12 = 0;
                }
                this.field536[var11] = var12;
            }
        }
        for (int var8 = 0; var8 < var2 - 1; ++var8) {
            this.field401[var8] = this.field401[var8 + 1];
        }
        this.field401[var2 - 1] = (int) (Math.sin((double) field609 / 14.0D) * 16.0D + Math.sin((double) field609 / 15.0D) * 14.0D + Math.sin((double) field609 / 16.0D) * 12.0D);
        if (this.field257 > 0) {
            this.field257 -= 4;
        }
        if (this.field258 > 0) {
            this.field258 -= 4;
        }
        if (this.field257 == 0 && this.field258 == 0) {
            int var9 = (int) (Math.random() * 2000.0D);
            if (var9 == 0) {
                this.field257 = 1024;
            }
            if (var9 == 1) {
                this.field258 = 1024;
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "m", descriptor = "(Z)V")
    private final void method159(boolean arg0) {
        this.field254 &= arg0;
        if (this.field226 == 2) {
            for (class16 var2 = (class16) this.field435.method382(); var2 != null; var2 = (class16) this.field435.method384((byte) -96)) {
                if (var2.field723 > 0) {
                    --var2.field723;
                }
                if (var2.field723 == 0) {
                    if (var2.field717 < 0 || class42.method425(var2.field719, var2.field717, this.field280)) {
                        this.method79(var2.field716, var2.field713, var2.field719, var2.field718, -48118, var2.field717, var2.field715, var2.field714);
                        var2.method540();
                    }
                } else {
                    if (var2.field724 > 0) {
                        --var2.field724;
                    }
                    if (var2.field724 == 0 && var2.field715 >= 1 && var2.field716 >= 1 && var2.field715 <= 102 && var2.field716 <= 102 && (var2.field720 < 0 || class42.method425(var2.field722, var2.field720, this.field280))) {
                        this.method79(var2.field716, var2.field713, var2.field722, var2.field721, -48118, var2.field720, var2.field715, var2.field714);
                        var2.field724 = -1;
                        if (var2.field720 == var2.field717 && var2.field717 == -1) {
                            var2.method540();
                        } else if (var2.field720 == var2.field717 && var2.field721 == var2.field718 && var2.field722 == var2.field719) {
                            var2.method540();
                        }
                    }
                }
            }
            ++field293;
            if (field293 > 100) {
                field293 = 0;
                this.field223.method227(15, this.field376);
                this.field223.method228(209);
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "n", descriptor = "(Z)Ljava/lang/String;")
    public final String method160(boolean arg0) {
        if (!arg0) {
            this.field497 = -1;
        }
        if (signlink.mainapp != null) {
            return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
        } else {
            return super.field1505 != null ? "runescape.com" : super.getDocumentBase().getHost().toLowerCase();
        }
    }

    @OriginalMember(owner = "client", name = "H", descriptor = "(I)V")
    public final void method161(int arg0) {
        this.field327 = true;
        if (arg0 == 7) {
            try {
                long var2 = System.currentTimeMillis();
                int var4 = 0;
                int var5 = 20;
                while (this.field365) {
                    ++this.field383;
                    this.method158(true);
                    this.method158(true);
                    this.method75((byte) 3);
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
            this.field327 = false;
        }
    }

    @OriginalMember(owner = "client", name = "o", descriptor = "(Z)V")
    public final void method162(boolean arg0) {
        if (this.field336 != 0) {
            class10 var2 = this.field385;
            this.field254 &= arg0;
            int var3 = 0;
            if (this.field582 != 0) {
                var3 = 1;
            }
            for (int var4 = 0; var4 < 100; ++var4) {
                if (this.field340[var4] != null) {
                    int var5 = this.field338[var4];
                    String var6 = this.field339[var4];
                    byte var7 = 0;
                    if (var6 != null && var6.startsWith("@cr1@")) {
                        var6 = var6.substring(5);
                        var7 = 1;
                    }
                    if (var6 != null && var6.startsWith("@cr2@")) {
                        var6 = var6.substring(5);
                        var7 = 2;
                    }
                    if ((var5 == 3 || var5 == 7) && (var5 == 7 || this.field515 == 0 || this.field515 == 1 && this.method62(var6, this.field538))) {
                        int var8 = 329 - var3 * 13;
                        byte var9 = 4;
                        var2.method180(var8, "From", -412, var9, 0);
                        var2.method180(var8 - 1, "From", -412, var9, 65535);
                        int var10 = var9 + var2.method178(47982, "From ");
                        if (var7 == 1) {
                            this.field390[0].method13(var10, var8 - 12, 4);
                            var10 += 14;
                        }
                        if (var7 == 2) {
                            this.field390[1].method13(var10, var8 - 12, 4);
                            var10 += 14;
                        }
                        var2.method180(var8, var6 + ": " + this.field340[var4], -412, var10, 0);
                        var2.method180(var8 - 1, var6 + ": " + this.field340[var4], -412, var10, 65535);
                        ++var3;
                        if (var3 >= 5) {
                            return;
                        }
                    }
                    if (var5 == 5 && this.field515 < 2) {
                        int var11 = 329 - var3 * 13;
                        var2.method180(var11, this.field340[var4], -412, 4, 0);
                        var2.method180(var11 - 1, this.field340[var4], -412, 4, 65535);
                        ++var3;
                        if (var3 >= 5) {
                            return;
                        }
                    }
                    if (var5 == 6 && this.field515 < 2) {
                        int var12 = 329 - var3 * 13;
                        var2.method180(var12, "To " + var6 + ": " + this.field340[var4], -412, 4, 0);
                        var2.method180(var12 - 1, "To " + var6 + ": " + this.field340[var4], -412, 4, 65535);
                        ++var3;
                        if (var3 >= 5) {
                            return;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(III)Z")
    public final boolean method163(int arg0, int arg1, int arg2) {
        boolean var4 = false;
        class48 var5 = class48.field1219[arg2];
        for (int var6 = 0; var6 < var5.field1213.length && var5.field1213[var6] != -1; ++var6) {
            class48 var7 = class48.field1219[var5.field1213[var6]];
            if (var7.field1269 == 1) {
                var4 |= this.method163(0, arg1, var7.field1262);
            }
            if (var7.field1269 == 6 && (var7.field1237 != -1 || var7.field1238 != -1)) {
                boolean var8 = this.method33(45167, var7);
                int var9;
                if (var8) {
                    var9 = var7.field1238;
                } else {
                    var9 = var7.field1237;
                }
                if (var9 != -1) {
                    class71 var10 = class71.field1705[var9];
                    var7.field1222 += arg1;
                    while (var7.field1222 > var10.method591(0, var7.field1217)) {
                        var7.field1222 -= var10.method591(0, var7.field1217) + 1;
                        ++var7.field1217;
                        if (var7.field1217 >= var10.field1706) {
                            var7.field1217 -= var10.field1710;
                            if (var7.field1217 < 0 || var7.field1217 >= var10.field1706) {
                                var7.field1217 = 0;
                            }
                        }
                        var4 = true;
                    }
                }
            }
            if (var7.field1269 == 6 && var7.field1278 != 0) {
                int var11 = var7.field1278 >> 16;
                int var12 = var7.field1278 << 16 >> 16;
                int var13 = arg1 * var11;
                int var14 = arg1 * var12;
                var7.field1232 = var7.field1232 + var13 & 2047;
                var7.field1233 = var7.field1233 + var14 & 2047;
                var4 = true;
            }
        }
        if (this.field466 != arg0) {
            this.method116();
        }
        return var4;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;)V")
    private final void method164(String arg0) {
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

    @OriginalMember(owner = "client", name = "I", descriptor = "(I)V")
    public final void method165(int arg0) {
        this.field177 = 0;
        for (int var2 = -1; var2 < this.field510 + this.field284; ++var2) {
            class5 var19;
            if (var2 == -1) {
                var19 = field189;
            } else if (var2 < this.field510) {
                var19 = this.field509[this.field511[var2]];
            } else {
                var19 = this.field283[this.field285[var2 - this.field510]];
            }
            if (var19 != null && var19.method21(0)) {
                if (var19 instanceof class37) {
                    class60 var20 = ((class37) var19).field1044;
                    if (var20.field1549 != null) {
                        var20 = var20.method518(-13525);
                    }
                    if (var20 == null) {
                        continue;
                    }
                }
                if (var2 >= this.field510) {
                    class60 var24 = ((class37) var19).field1044;
                    if (var24.field1555 >= 0 && var24.field1555 < this.field227.length) {
                        this.method47(var19.field57 + 15, var19, 42909);
                        if (this.field556 > -1) {
                            this.field227[var24.field1555].method578(this.field556 - 12, this.field557 - 30, 4);
                        }
                    }
                    if (this.field345 == 1 && this.field285[var2 - this.field510] == this.field535 && field609 % 20 < 10) {
                        this.method47(var19.field57 + 15, var19, 42909);
                        if (this.field556 > -1) {
                            this.field227[2].method578(this.field556 - 12, this.field557 - 28, 4);
                        }
                    }
                } else {
                    int var21 = 30;
                    class49 var22 = (class49) var19;
                    if (var22.field1292 != 0) {
                        this.method47(var19.field57 + 15, var19, 42909);
                        if (this.field556 > -1) {
                            for (int var23 = 0; var23 < 8; ++var23) {
                                if ((var22.field1292 & 1 << var23) != 0) {
                                    this.field227[var23].method578(this.field556 - 12, this.field557 - var21, 4);
                                    var21 -= 25;
                                }
                            }
                        }
                    }
                    if (var2 >= 0 && this.field345 == 10 && this.field511[var2] == this.field375) {
                        this.method47(var19.field57 + 15, var19, 42909);
                        if (this.field556 > -1) {
                            this.field227[7].method578(this.field556 - 12, this.field557 - var21, 4);
                        }
                    }
                }
                if (var19.field77 != null && (var2 >= this.field510 || this.field421 == 0 || this.field421 == 3 || this.field421 == 1 && this.method62(((class49) var19).field1302, this.field538))) {
                    this.method47(var19.field57, var19, 42909);
                    if (this.field556 > -1 && this.field177 < this.field178) {
                        this.field182[this.field177] = this.field386.method179(true, var19.field77) / 2;
                        this.field181[this.field177] = this.field386.field639;
                        this.field179[this.field177] = this.field556;
                        this.field180[this.field177] = this.field557;
                        this.field183[this.field177] = var19.field54;
                        this.field184[this.field177] = var19.field80;
                        this.field185[this.field177] = var19.field58;
                        this.field186[this.field177++] = var19.field77;
                        if (this.field454 == 0 && var19.field80 >= 1 && var19.field80 <= 3) {
                            this.field181[this.field177] += 10;
                            this.field180[this.field177] += 5;
                        }
                        if (this.field454 == 0 && var19.field80 == 4) {
                            this.field182[this.field177] = 60;
                        }
                        if (this.field454 == 0 && var19.field80 == 5) {
                            this.field181[this.field177] += 5;
                        }
                    }
                }
                if (var19.field92 > field609) {
                    this.method47(var19.field57 + 15, var19, 42909);
                    if (this.field556 > -1) {
                        int var25 = var19.field93 * 30 / var19.field94;
                        if (var25 > 30) {
                            var25 = 30;
                        }
                        class11.method196(65280, this.field556 - 15, var25, 5, this.field557 - 3, 3);
                        class11.method196(16711680, this.field556 - 15 + var25, 30 - var25, 5, this.field557 - 3, 3);
                    }
                }
                for (int var26 = 0; var26 < 4; ++var26) {
                    if (var19.field50[var26] > field609) {
                        this.method47(var19.field57 / 2, var19, 42909);
                        if (this.field556 > -1) {
                            if (var26 == 1) {
                                this.field557 -= 20;
                            }
                            if (var26 == 2) {
                                this.field556 -= 15;
                                this.field557 -= 10;
                            }
                            if (var26 == 3) {
                                this.field556 += 15;
                                this.field557 -= 10;
                            }
                            this.field249[var19.field49[var26]].method578(this.field556 - 12, this.field557 - 12, 4);
                            this.field384.method176(-35924, this.field557 + 4, 0, this.field556, String.valueOf(var19.field48[var26]));
                            this.field384.method176(-35924, this.field557 + 3, 16777215, this.field556 - 1, String.valueOf(var19.field48[var26]));
                        }
                    }
                }
            }
        }
        for (int var3 = 0; var3 < this.field177; ++var3) {
            int var4 = this.field179[var3];
            int var5 = this.field180[var3];
            int var6 = this.field182[var3];
            int var7 = this.field181[var3];
            boolean var8 = true;
            while (var8) {
                var8 = false;
                for (int var18 = 0; var18 < var3; ++var18) {
                    if (var5 + 2 > this.field180[var18] - this.field181[var18] && var5 - var7 < this.field180[var18] + 2 && var4 - var6 < this.field182[var18] + this.field179[var18] && var4 + var6 > this.field179[var18] - this.field182[var18] && this.field180[var18] - this.field181[var18] < var5) {
                        var5 = this.field180[var18] - this.field181[var18];
                        var8 = true;
                    }
                }
            }
            this.field556 = this.field179[var3];
            this.field557 = this.field180[var3] = var5;
            String var9 = this.field186[var3];
            if (this.field454 == 0) {
                int var10 = 16776960;
                if (this.field183[var3] < 6) {
                    var10 = this.field213[this.field183[var3]];
                }
                if (this.field183[var3] == 6) {
                    var10 = this.field379 % 20 < 10 ? 16711680 : 16776960;
                }
                if (this.field183[var3] == 7) {
                    var10 = this.field379 % 20 < 10 ? 255 : 65535;
                }
                if (this.field183[var3] == 8) {
                    var10 = this.field379 % 20 < 10 ? 45056 : 8454016;
                }
                if (this.field183[var3] == 9) {
                    int var11 = 150 - this.field185[var3];
                    if (var11 < 50) {
                        var10 = var11 * 1280 + 16711680;
                    } else if (var11 < 100) {
                        var10 = 16776960 - (var11 - 50) * 327680;
                    } else if (var11 < 150) {
                        var10 = (var11 - 100) * 5 + 65280;
                    }
                }
                if (this.field183[var3] == 10) {
                    int var12 = 150 - this.field185[var3];
                    if (var12 < 50) {
                        var10 = var12 * 5 + 16711680;
                    } else if (var12 < 100) {
                        var10 = 16711935 - (var12 - 50) * 327680;
                    } else if (var12 < 150) {
                        var10 = (var12 - 100) * 327680 + 255 - (var12 - 100) * 5;
                    }
                }
                if (this.field183[var3] == 11) {
                    int var13 = 150 - this.field185[var3];
                    if (var13 < 50) {
                        var10 = 16777215 - var13 * 327685;
                    } else if (var13 < 100) {
                        var10 = (var13 - 50) * 327685 + 65280;
                    } else if (var13 < 150) {
                        var10 = 16777215 - (var13 - 100) * 327680;
                    }
                }
                if (this.field184[var3] == 0) {
                    this.field386.method176(-35924, this.field557 + 1, 0, this.field556, var9);
                    this.field386.method176(-35924, this.field557, var10, this.field556, var9);
                }
                if (this.field184[var3] == 1) {
                    this.field386.method181(this.field557 + 1, this.field379, var9, 0, this.field556, 0);
                    this.field386.method181(this.field557, this.field379, var9, 0, this.field556, var10);
                }
                if (this.field184[var3] == 2) {
                    this.field386.method182(0, (byte) -99, this.field379, var9, this.field556, this.field557 + 1);
                    this.field386.method182(var10, (byte) -99, this.field379, var9, this.field556, this.field557);
                }
                if (this.field184[var3] == 3) {
                    this.field386.method183(this.field379, 150 - this.field185[var3], var9, this.field556, 9, 0, this.field557 + 1);
                    this.field386.method183(this.field379, 150 - this.field185[var3], var9, this.field556, 9, var10, this.field557);
                }
                if (this.field184[var3] == 4) {
                    int var14 = this.field386.method179(true, var9);
                    int var15 = (150 - this.field185[var3]) * (var14 + 100) / 150;
                    class11.method193(this.field556 + 50, 334, this.field556 - 50, 0, true);
                    this.field386.method180(this.field557 + 1, var9, -412, this.field556 + 50 - var15, 0);
                    this.field386.method180(this.field557, var9, -412, this.field556 + 50 - var15, var10);
                    class11.method192((byte) 36);
                }
                if (this.field184[var3] == 5) {
                    int var16 = 150 - this.field185[var3];
                    int var17 = 0;
                    if (var16 < 25) {
                        var17 = var16 - 25;
                    } else if (var16 > 125) {
                        var17 = var16 - 125;
                    }
                    class11.method193(512, this.field557 + 5, 0, this.field557 - this.field386.field639 - 1, true);
                    this.field386.method176(-35924, this.field557 + 1 + var17, 0, this.field556, var9);
                    this.field386.method176(-35924, this.field557 + var17, var10, this.field556, var9);
                    class11.method192((byte) 36);
                }
            } else {
                this.field386.method176(-35924, this.field557 + 1, 0, this.field556, var9);
                this.field386.method176(-35924, this.field557, 16776960, this.field556, var9);
            }
        }
        while (arg0 >= 0) {
            this.field497 = this.field246.method238();
        }
    }

    @OriginalMember(owner = "client", name = "p", descriptor = "(Z)V")
    public final void method166(boolean arg0) {
        try {
            if (this.field396 != null) {
                this.field396.method220();
            }
        } catch (Exception var3) {
        }
        this.field396 = null;
        this.field254 = false;
        this.field529 = 0;
        this.field151 = "";
        this.field152 = "";
        this.method58(true);
        this.field254 &= arg0;
        this.field530.method325(614);
        for (int var2 = 0; var2 < 4; ++var2) {
            this.field553[var2].method528();
        }
        System.gc();
        this.method99(this.field382);
        this.field377 = -1;
        this.field346 = -1;
        this.field222 = 0;
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(Ljava/lang/String;)Ljava/io/DataInputStream;")
    public final DataInputStream method167(String arg0) throws IOException {
        if (!this.field273) {
            return signlink.mainapp != null ? signlink.openurl(arg0) : new DataInputStream((new URL(this.getCodeBase(), arg0)).openStream());
        } else {
            if (this.field528 != null) {
                try {
                    this.field528.close();
                } catch (Exception var4) {
                }
                this.field528 = null;
            }
            this.field528 = this.method111(43595);
            this.field528.setSoTimeout(10000);
            InputStream var2 = this.field528.getInputStream();
            OutputStream var3 = this.field528.getOutputStream();
            var3.write(("JAGGRAB /" + arg0 + "\n\n").getBytes());
            return new DataInputStream(var2);
        }
    }

    @OriginalMember(owner = "client", name = "init", descriptor = "()V")
    public final void init() {
        field315 = Integer.parseInt(this.getParameter("nodeid"));
        field316 = Integer.parseInt(this.getParameter("portoff"));
        String var1 = this.getParameter("lowmem");
        if (var1 != null && var1.equals("1")) {
            method105((byte) -19);
        } else {
            method51(0);
        }
        String var2 = this.getParameter("free");
        if (var2 != null && var2.equals("1")) {
            field317 = false;
        } else {
            field317 = true;
        }
        this.method512(503, 765, 9);
    }

    @OriginalMember(owner = "client", name = "J", descriptor = "(I)V")
    public final void method168(int arg0) {
        if (arg0 != 7) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        if (this.field451 == 0) {
            this.field286[0] = "Cancel";
            this.field562[0] = 1575;
            this.field203 = 1;
            this.method118(284);
            this.field149 = 0;
            if (super.field1510 > 4 && super.field1511 > 4 && super.field1510 < 516 && super.field1511 < 338) {
                if (this.field262 != -1) {
                    this.method136(super.field1511, super.field1510, 4, 0, 4, -4903, class48.field1219[this.field262]);
                } else {
                    this.method93(0);
                }
            }
            if (this.field265 != this.field149) {
                this.field265 = this.field149;
            }
            this.field149 = 0;
            if (super.field1510 > 553 && super.field1511 > 205 && super.field1510 < 743 && super.field1511 < 466) {
                if (this.field395 != -1) {
                    this.method136(super.field1511, super.field1510, 553, 0, 205, -4903, class48.field1219[this.field395]);
                } else if (this.field445[this.field591] != -1) {
                    this.method136(super.field1511, super.field1510, 553, 0, 205, -4903, class48.field1219[this.field445[this.field591]]);
                }
            }
            if (this.field158 != this.field149) {
                this.field589 = true;
                this.field158 = this.field149;
            }
            this.field149 = 0;
            if (super.field1510 > 17 && super.field1511 > 357 && super.field1510 < 496 && super.field1511 < 453) {
                if (this.field221 != -1) {
                    this.method136(super.field1511, super.field1510, 17, 0, 357, -4903, class48.field1219[this.field221]);
                } else if (super.field1511 < 434 && super.field1510 < 426) {
                    this.method77(840, super.field1510 - 17, super.field1511 - 357);
                }
            }
            if (this.field221 != -1 && this.field378 != this.field149) {
                this.field212 = true;
                this.field378 = this.field149;
            }
            boolean var3 = false;
            while (!var3) {
                var3 = true;
                for (int var4 = 0; var4 < this.field203 - 1; ++var4) {
                    if (this.field562[var4] < 1000 && this.field562[var4 + 1] > 1000) {
                        String var5 = this.field286[var4];
                        this.field286[var4] = this.field286[var4 + 1];
                        this.field286[var4 + 1] = var5;
                        int var6 = this.field562[var4];
                        this.field562[var4] = this.field562[var4 + 1];
                        this.field562[var4 + 1] = var6;
                        int var7 = this.field560[var4];
                        this.field560[var4] = this.field560[var4 + 1];
                        this.field560[var4 + 1] = var7;
                        int var8 = this.field561[var4];
                        this.field561[var4] = this.field561[var4 + 1];
                        this.field561[var4 + 1] = var8;
                        int var9 = this.field563[var4];
                        this.field563[var4] = this.field563[var4 + 1];
                        this.field563[var4 + 1] = var9;
                        var3 = false;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "K", descriptor = "(I)V")
    public final void method169(int arg0) {
        this.field365 = false;
        while (this.field327) {
            this.field365 = false;
            try {
                Thread.sleep(50L);
            } catch (Exception var2) {
            }
        }
        this.field291 = null;
        this.field292 = null;
        this.field264 = null;
        this.field426 = null;
        this.field427 = null;
        this.field428 = null;
        if (arg0 >= 0) {
            field372 = !field372;
        }
        this.field429 = null;
        this.field259 = null;
        this.field260 = null;
        this.field536 = null;
        this.field537 = null;
        this.field409 = null;
        this.field410 = null;
    }

    @OriginalMember(owner = "client", name = "L", descriptor = "(I)Z")
    public final boolean method170(int arg0) {
        if (arg0 >= 0) {
            throw new NullPointerException();
        } else {
            return signlink.wavereplay();
        }
    }

    @OriginalMember(owner = "client", name = "M", descriptor = "(I)V")
    public final void method171(int arg0) {
        if (arg0 != 1) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        if (super.field1516 == 1) {
            if (super.field1517 >= 539 && super.field1517 <= 573 && super.field1518 >= 169 && super.field1518 < 205 && this.field445[0] != -1) {
                this.field589 = true;
                this.field591 = 0;
                this.field354 = true;
            }
            if (super.field1517 >= 569 && super.field1517 <= 599 && super.field1518 >= 168 && super.field1518 < 205 && this.field445[1] != -1) {
                this.field589 = true;
                this.field591 = 1;
                this.field354 = true;
            }
            if (super.field1517 >= 597 && super.field1517 <= 627 && super.field1518 >= 168 && super.field1518 < 205 && this.field445[2] != -1) {
                this.field589 = true;
                this.field591 = 2;
                this.field354 = true;
            }
            if (super.field1517 >= 625 && super.field1517 <= 669 && super.field1518 >= 168 && super.field1518 < 203 && this.field445[3] != -1) {
                this.field589 = true;
                this.field591 = 3;
                this.field354 = true;
            }
            if (super.field1517 >= 666 && super.field1517 <= 696 && super.field1518 >= 168 && super.field1518 < 205 && this.field445[4] != -1) {
                this.field589 = true;
                this.field591 = 4;
                this.field354 = true;
            }
            if (super.field1517 >= 694 && super.field1517 <= 724 && super.field1518 >= 168 && super.field1518 < 205 && this.field445[5] != -1) {
                this.field589 = true;
                this.field591 = 5;
                this.field354 = true;
            }
            if (super.field1517 >= 722 && super.field1517 <= 756 && super.field1518 >= 169 && super.field1518 < 205 && this.field445[6] != -1) {
                this.field589 = true;
                this.field591 = 6;
                this.field354 = true;
            }
            if (super.field1517 >= 540 && super.field1517 <= 574 && super.field1518 >= 466 && super.field1518 < 502 && this.field445[7] != -1) {
                this.field589 = true;
                this.field591 = 7;
                this.field354 = true;
            }
            if (super.field1517 >= 572 && super.field1517 <= 602 && super.field1518 >= 466 && super.field1518 < 503 && this.field445[8] != -1) {
                this.field589 = true;
                this.field591 = 8;
                this.field354 = true;
            }
            if (super.field1517 >= 599 && super.field1517 <= 629 && super.field1518 >= 466 && super.field1518 < 503 && this.field445[9] != -1) {
                this.field589 = true;
                this.field591 = 9;
                this.field354 = true;
            }
            if (super.field1517 >= 627 && super.field1517 <= 671 && super.field1518 >= 467 && super.field1518 < 502 && this.field445[10] != -1) {
                this.field589 = true;
                this.field591 = 10;
                this.field354 = true;
            }
            if (super.field1517 >= 669 && super.field1517 <= 699 && super.field1518 >= 466 && super.field1518 < 503 && this.field445[11] != -1) {
                this.field589 = true;
                this.field591 = 11;
                this.field354 = true;
            }
            if (super.field1517 >= 696 && super.field1517 <= 726 && super.field1518 >= 466 && super.field1518 < 503 && this.field445[12] != -1) {
                this.field589 = true;
                this.field591 = 12;
                this.field354 = true;
            }
            if (super.field1517 >= 724 && super.field1517 <= 758 && super.field1518 >= 466 && super.field1518 < 502 && this.field445[13] != -1) {
                this.field589 = true;
                this.field591 = 13;
                this.field354 = true;
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "N", descriptor = "(I)V")
    public final void method172(int arg0) {
        if (arg0 != 0) {
            this.field382 = this.field569.method541();
        }
        while (true) {
            class33 var2 = this.field437.method476();
            if (var2 == null) {
                return;
            }
            if (var2.field934 == 0) {
                class67.method546(-478, var2.field935, var2.field937);
                if ((this.field437.method480(16165, var2.field935) & 98) != 0) {
                    this.field589 = true;
                    if (this.field221 != -1) {
                        this.field212 = true;
                    }
                }
            }
            if (var2.field934 == 1 && var2.field937 != null) {
                class22.method216(var2.field937, (byte) 7);
            }
            if (var2.field934 == 2 && this.field346 == var2.field935 && var2.field937 != null) {
                this.method80(var2.field937, this.field566, this.field347);
            }
            if (var2.field934 == 3 && this.field226 == 1) {
                for (int var3 = 0; var3 < this.field173.length; ++var3) {
                    if (this.field540[var3] == var2.field935) {
                        this.field173[var3] = var2.field937;
                        if (var2.field937 == null) {
                            this.field540[var3] = -1;
                        }
                        break;
                    }
                    if (this.field541[var3] == var2.field935) {
                        this.field328[var3] = var2.field937;
                        if (var2.field937 == null) {
                            this.field541[var3] = -1;
                        }
                        break;
                    }
                }
            }
            if (var2.field934 == 93 && this.field437.method483(541, var2.field935)) {
                class42.method415(this.field487, new class24(0, var2.field937), this.field437);
            }
        }
    }

    @OriginalMember(owner = "client", name = "q", descriptor = "(Z)V")
    public final void method173(boolean arg0) {
        this.field617.method455(9133);
        class58.field1478 = this.field595;
        this.field465.method13(0, 0, 4);
        if (this.field424) {
            this.field386.method176(-35924, 40, 0, 239, this.field348);
            this.field386.method176(-35924, 60, 128, 239, this.field263 + "*");
        } else if (this.field492 == 1) {
            this.field386.method176(-35924, 40, 0, 239, "Enter amount:");
            this.field386.method176(-35924, 60, 128, 239, this.field467 + "*");
        } else if (this.field492 == 2) {
            this.field386.method176(-35924, 40, 0, 239, "Enter name:");
            this.field386.method176(-35924, 60, 128, 239, this.field467 + "*");
        } else if (this.field241 != null) {
            this.field386.method176(-35924, 40, 0, 239, this.field241);
            this.field386.method176(-35924, 60, 128, 239, "Click to continue");
        } else if (this.field221 != -1) {
            this.method131(0, 0, 0, -44100, class48.field1219[this.field221]);
        } else if (this.field462 != -1) {
            this.method131(0, 0, 0, -44100, class48.field1219[this.field462]);
        } else {
            class10 var2 = this.field385;
            int var3 = 0;
            class11.method193(463, 77, 0, 0, true);
            for (int var4 = 0; var4 < 100; ++var4) {
                if (this.field340[var4] != null) {
                    int var6 = this.field338[var4];
                    int var7 = 70 - var3 * 14 + this.field468;
                    String var8 = this.field339[var4];
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
                            var2.method180(var7, this.field340[var4], -412, 4, 0);
                        }
                        ++var3;
                    }
                    if ((var6 == 1 || var6 == 2) && (var6 == 1 || this.field421 == 0 || this.field421 == 1 && this.method62(var8, this.field538))) {
                        if (var7 > 0 && var7 < 110) {
                            int var10 = 4;
                            if (var9 == 1) {
                                this.field390[0].method13(var10, var7 - 12, 4);
                                var10 += 14;
                            }
                            if (var9 == 2) {
                                this.field390[1].method13(var10, var7 - 12, 4);
                                var10 += 14;
                            }
                            var2.method180(var7, var8 + ":", -412, var10, 0);
                            int var11 = var10 + var2.method178(47982, var8) + 8;
                            var2.method180(var7, this.field340[var4], -412, var11, 255);
                        }
                        ++var3;
                    }
                    if ((var6 == 3 || var6 == 7) && this.field336 == 0 && (var6 == 7 || this.field515 == 0 || this.field515 == 1 && this.method62(var8, this.field538))) {
                        if (var7 > 0 && var7 < 110) {
                            byte var12 = 4;
                            var2.method180(var7, "From", -412, var12, 0);
                            int var13 = var12 + var2.method178(47982, "From ");
                            if (var9 == 1) {
                                this.field390[0].method13(var13, var7 - 12, 4);
                                var13 += 14;
                            }
                            if (var9 == 2) {
                                this.field390[1].method13(var13, var7 - 12, 4);
                                var13 += 14;
                            }
                            var2.method180(var7, var8 + ":", -412, var13, 0);
                            int var14 = var13 + var2.method178(47982, var8) + 8;
                            var2.method180(var7, this.field340[var4], -412, var14, 8388608);
                        }
                        ++var3;
                    }
                    if (var6 == 4 && (this.field488 == 0 || this.field488 == 1 && this.method62(var8, this.field538))) {
                        if (var7 > 0 && var7 < 110) {
                            var2.method180(var7, var8 + " " + this.field340[var4], -412, 4, 8388736);
                        }
                        ++var3;
                    }
                    if (var6 == 5 && this.field336 == 0 && this.field515 < 2) {
                        if (var7 > 0 && var7 < 110) {
                            var2.method180(var7, this.field340[var4], -412, 4, 8388608);
                        }
                        ++var3;
                    }
                    if (var6 == 6 && this.field336 == 0 && this.field515 < 2) {
                        if (var7 > 0 && var7 < 110) {
                            var2.method180(var7, "To " + var8 + ":", -412, 4, 0);
                            var2.method180(var7, this.field340[var4], -412, 12 + var2.method178(47982, "To " + var8), 8388608);
                        }
                        ++var3;
                    }
                    if (var6 == 8 && (this.field488 == 0 || this.field488 == 1 && this.method62(var8, this.field538))) {
                        if (var7 > 0 && var7 < 110) {
                            var2.method180(var7, var8 + " " + this.field340[var4], -412, 4, 8270336);
                        }
                        ++var3;
                    }
                }
            }
            class11.method192((byte) 36);
            this.field447 = var3 * 14 + 7;
            if (this.field447 < 78) {
                this.field447 = 78;
            }
            this.method55(this.field447 - this.field468 - 77, 77, 463, true, this.field447, 0);
            String var5;
            if (field189 != null && field189.field1302 != null) {
                var5 = field189.field1302;
            } else {
                var5 = class31.method322(true, this.field151);
            }
            var2.method180(90, var5 + ":", -412, 4, 0);
            var2.method180(90, this.field289 + "*", -412, 6 + var2.method178(47982, var5 + ": "), 255);
            class11.method199(0, 0, 77, 0, 479);
        }
        if (this.field516 && this.field207 == 2) {
            this.method135(true);
        }
        this.field617.method456(17, -30916, 357, super.field1502);
        this.field616.method455(9133);
        if (!arg0) {
            this.field290 = null;
        }
        class58.field1478 = this.field597;
    }

    @OriginalMember(owner = "client", name = "O", descriptor = "(I)V")
    public final void method174(int arg0) {
        if (arg0 <= 0) {
            this.method116();
        }
        this.field196 = true;
        for (int var2 = 0; var2 < 7; ++var2) {
            this.field531[var2] = -1;
            for (int var3 = 0; var3 < class6.field100; ++var3) {
                if (!class6.field101[var3].field107 && class6.field101[var3].field102 == var2 + (this.field304 ? 0 : 7)) {
                    this.field531[var2] = var3;
                    break;
                }
            }
        }
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; ++var1) {
            field299[var1] = var0 - 1;
            var0 += var0;
        }
        field315 = 10;
        field317 = true;
        field372 = true;
        field425 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
        field475 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };
        field489 = new int[99];
        int var2 = 0;
        for (int var3 = 0; var3 < 99; ++var3) {
            int var4 = var3 + 1;
            int var5 = (int) ((double) var4 + 300.0D * Math.pow(2.0D, (double) var4 / 7.0D));
            var2 += var5;
            field489[var3] = var2 / 4;
        }
        field533 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");
    }
}
