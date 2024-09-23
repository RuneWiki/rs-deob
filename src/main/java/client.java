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
public class client extends class35 {

    @OriginalMember(owner = "client", name = "J", descriptor = "[I")
    private int[] field180 = new int[50];

    @OriginalMember(owner = "client", name = "K", descriptor = "Z")
    private boolean field181 = false;

    @OriginalMember(owner = "client", name = "L", descriptor = "[I")
    private int[] field182 = new int[9];

    @OriginalMember(owner = "client", name = "M", descriptor = "LJDSNLLMP;")
    private class29 field183 = new class29();

    @OriginalMember(owner = "client", name = "N", descriptor = "B")
    private byte field184 = 112;

    @OriginalMember(owner = "client", name = "P", descriptor = "LYLURZVWU;")
    private class65 field186 = new class65((byte) 52);

    @OriginalMember(owner = "client", name = "Q", descriptor = "[J")
    private long[] field187 = new long[200];

    @OriginalMember(owner = "client", name = "R", descriptor = "I")
    private int field188 = 3353893;

    @OriginalMember(owner = "client", name = "S", descriptor = "Z")
    private boolean field189 = false;

    @OriginalMember(owner = "client", name = "T", descriptor = "[LDZSIRBWX;")
    private class15[] field190 = new class15[100];

    @OriginalMember(owner = "client", name = "V", descriptor = "[I")
    private int[] field192 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client", name = "W", descriptor = "[I")
    private final int[] field193 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client", name = "ab", descriptor = "Z")
    private boolean field197 = false;

    @OriginalMember(owner = "client", name = "bb", descriptor = "I")
    private int field198 = -280;

    @OriginalMember(owner = "client", name = "cb", descriptor = "LYOXDZEVD;")
    private class68 field199 = class68.method537(0, 1);

    @OriginalMember(owner = "client", name = "db", descriptor = "B")
    private byte field200 = 7;

    @OriginalMember(owner = "client", name = "fb", descriptor = "Z")
    private boolean field202 = false;

    @OriginalMember(owner = "client", name = "gb", descriptor = "Ljava/lang/String;")
    private String field203 = "";

    @OriginalMember(owner = "client", name = "hb", descriptor = "Ljava/lang/String;")
    private String field204 = "";

    @OriginalMember(owner = "client", name = "ib", descriptor = "Z")
    private boolean field205 = false;

    @OriginalMember(owner = "client", name = "nb", descriptor = "I")
    private int field210 = -1;

    @OriginalMember(owner = "client", name = "ob", descriptor = "[I")
    private int[] field211 = new int[2000];

    @OriginalMember(owner = "client", name = "ub", descriptor = "I")
    private int field217 = 34131;

    @OriginalMember(owner = "client", name = "vb", descriptor = "B")
    private byte field218 = 1;

    @OriginalMember(owner = "client", name = "zb", descriptor = "[I")
    private int[] field222 = new int[151];

    @OriginalMember(owner = "client", name = "Eb", descriptor = "[LLEBPILPF;")
    public class32[] field227 = new class32[5];

    @OriginalMember(owner = "client", name = "Ib", descriptor = "B")
    private byte field231 = -71;

    @OriginalMember(owner = "client", name = "Jb", descriptor = "LYOXDZEVD;")
    private class68 field232 = class68.method537(0, 1);

    @OriginalMember(owner = "client", name = "Lb", descriptor = "B")
    private byte field234 = 0;

    @OriginalMember(owner = "client", name = "Ub", descriptor = "[I")
    private int[] field243 = new int[4000];

    @OriginalMember(owner = "client", name = "Vb", descriptor = "[I")
    private int[] field244 = new int[4000];

    @OriginalMember(owner = "client", name = "Xb", descriptor = "Z")
    private boolean field246 = true;

    @OriginalMember(owner = "client", name = "Yb", descriptor = "Z")
    private boolean field247 = true;

    @OriginalMember(owner = "client", name = "dc", descriptor = "[LDZSIRBWX;")
    private class15[] field252 = new class15[2];

    @OriginalMember(owner = "client", name = "ic", descriptor = "I")
    private int field257 = 1;

    @OriginalMember(owner = "client", name = "jc", descriptor = "Z")
    private boolean field258 = false;

    @OriginalMember(owner = "client", name = "kc", descriptor = "I")
    private final int field259 = 100;

    @OriginalMember(owner = "client", name = "lc", descriptor = "[I")
    private int[] field260 = new int[100];

    @OriginalMember(owner = "client", name = "rc", descriptor = "[Z")
    private boolean[] field266 = new boolean[5];

    @OriginalMember(owner = "client", name = "sc", descriptor = "[LDYPVESKW;")
    private class14[] field267 = new class14[20];

    @OriginalMember(owner = "client", name = "uc", descriptor = "LYOXDZEVD;")
    private class68 field269 = new class68(new byte[5000], -103);

    @OriginalMember(owner = "client", name = "vc", descriptor = "[LCMGLYFCQ;")
    private class10[] field270 = new class10[16384];

    @OriginalMember(owner = "client", name = "xc", descriptor = "[I")
    public int[] field272 = new int[16384];

    @OriginalMember(owner = "client", name = "yc", descriptor = "I")
    private int field273 = -1;

    @OriginalMember(owner = "client", name = "Ac", descriptor = "I")
    private int field275 = -1;

    @OriginalMember(owner = "client", name = "Dc", descriptor = "I")
    private int field278 = -279;

    @OriginalMember(owner = "client", name = "Ec", descriptor = "I")
    private int field279 = -1;

    @OriginalMember(owner = "client", name = "Ic", descriptor = "[LDZSIRBWX;")
    private class15[] field283 = new class15[13];

    @OriginalMember(owner = "client", name = "Mc", descriptor = "[I")
    private int[] field287 = new int[1000];

    @OriginalMember(owner = "client", name = "Nc", descriptor = "[I")
    private int[] field288 = new int[1000];

    @OriginalMember(owner = "client", name = "Pc", descriptor = "[I")
    private int[] field290 = new int[class24.field824];

    @OriginalMember(owner = "client", name = "Qc", descriptor = "I")
    private int field291 = 2301979;

    @OriginalMember(owner = "client", name = "Rc", descriptor = "B")
    private byte field292 = 5;

    @OriginalMember(owner = "client", name = "Tc", descriptor = "I")
    private int field294 = 78;

    @OriginalMember(owner = "client", name = "dd", descriptor = "Z")
    private boolean field304 = false;

    @OriginalMember(owner = "client", name = "kd", descriptor = "Z")
    private boolean field311 = false;

    @OriginalMember(owner = "client", name = "ld", descriptor = "[I")
    private int[] field312 = new int[class24.field824];

    @OriginalMember(owner = "client", name = "Dd", descriptor = "Z")
    private boolean field330 = false;

    @OriginalMember(owner = "client", name = "Fd", descriptor = "Z")
    private boolean field332 = true;

    @OriginalMember(owner = "client", name = "Gd", descriptor = "I")
    private int field333 = 7759444;

    @OriginalMember(owner = "client", name = "Ld", descriptor = "[I")
    public int[] field338 = new int[1000];

    @OriginalMember(owner = "client", name = "Md", descriptor = "Z")
    private boolean field339 = false;

    @OriginalMember(owner = "client", name = "Nd", descriptor = "I")
    private int field340 = 5063219;

    @OriginalMember(owner = "client", name = "Rd", descriptor = "Z")
    private boolean field344 = false;

    @OriginalMember(owner = "client", name = "Ud", descriptor = "Z")
    private volatile boolean field347 = false;

    @OriginalMember(owner = "client", name = "Wd", descriptor = "[Ljava/lang/String;")
    private String[] field349 = new String[5];

    @OriginalMember(owner = "client", name = "Xd", descriptor = "[Z")
    private boolean[] field350 = new boolean[5];

    @OriginalMember(owner = "client", name = "Yd", descriptor = "Z")
    private boolean field351 = true;

    @OriginalMember(owner = "client", name = "ae", descriptor = "I")
    private int field353 = 2;

    @OriginalMember(owner = "client", name = "fe", descriptor = "I")
    private int field358 = -1;

    @OriginalMember(owner = "client", name = "ge", descriptor = "I")
    private int field359 = -1;

    @OriginalMember(owner = "client", name = "he", descriptor = "[I")
    private int[] field360 = new int[33];

    @OriginalMember(owner = "client", name = "ie", descriptor = "I")
    private int field361 = 826;

    @OriginalMember(owner = "client", name = "je", descriptor = "LYLURZVWU;")
    private class65 field362 = new class65((byte) 52);

    @OriginalMember(owner = "client", name = "ke", descriptor = "B")
    private byte field363 = 30;

    @OriginalMember(owner = "client", name = "le", descriptor = "[I")
    private int[] field364 = new int[500];

    @OriginalMember(owner = "client", name = "me", descriptor = "[I")
    private int[] field365 = new int[500];

    @OriginalMember(owner = "client", name = "ne", descriptor = "[I")
    private int[] field366 = new int[500];

    @OriginalMember(owner = "client", name = "oe", descriptor = "[I")
    private int[] field367 = new int[500];

    @OriginalMember(owner = "client", name = "pe", descriptor = "[LDYPVESKW;")
    private class14[] field368 = new class14[8];

    @OriginalMember(owner = "client", name = "se", descriptor = "[LDYPVESKW;")
    private class14[] field371 = new class14[100];

    @OriginalMember(owner = "client", name = "te", descriptor = "I")
    private int field372 = 691;

    @OriginalMember(owner = "client", name = "ue", descriptor = "Ljava/util/zip/CRC32;")
    private CRC32 field373 = new CRC32();

    @OriginalMember(owner = "client", name = "we", descriptor = "Z")
    private boolean field375 = false;

    @OriginalMember(owner = "client", name = "Ge", descriptor = "Z")
    private boolean field385 = false;

    @OriginalMember(owner = "client", name = "He", descriptor = "I")
    private int field386 = 21834;

    @OriginalMember(owner = "client", name = "Le", descriptor = "I")
    private int field390 = -1;

    @OriginalMember(owner = "client", name = "Me", descriptor = "[LGDVKBIIV;")
    private class22[] field391 = new class22[4];

    @OriginalMember(owner = "client", name = "Te", descriptor = "[I")
    private int[] field398 = new int[5];

    @OriginalMember(owner = "client", name = "Ue", descriptor = "Z")
    private boolean field399 = false;

    @OriginalMember(owner = "client", name = "We", descriptor = "Ljava/lang/String;")
    private String field401 = "";

    @OriginalMember(owner = "client", name = "Xe", descriptor = "Ljava/lang/String;")
    private String field402 = "";

    @OriginalMember(owner = "client", name = "af", descriptor = "[[I")
    private int[][] field405 = new int[104][104];

    @OriginalMember(owner = "client", name = "bf", descriptor = "[I")
    private int[] field406 = new int[256];

    @OriginalMember(owner = "client", name = "hf", descriptor = "Z")
    private boolean field412 = false;

    @OriginalMember(owner = "client", name = "nf", descriptor = "[I")
    private int[] field417 = new int[50];

    @OriginalMember(owner = "client", name = "of", descriptor = "[I")
    private int[] field418 = new int[class24.field824];

    @OriginalMember(owner = "client", name = "pf", descriptor = "[J")
    private long[] field419 = new long[100];

    @OriginalMember(owner = "client", name = "tf", descriptor = "B")
    private byte field423 = 6;

    @OriginalMember(owner = "client", name = "Ef", descriptor = "Z")
    private boolean field434 = false;

    @OriginalMember(owner = "client", name = "Ff", descriptor = "I")
    private int field435 = -1;

    @OriginalMember(owner = "client", name = "Gf", descriptor = "[I")
    private int[] field436 = new int[5];

    @OriginalMember(owner = "client", name = "If", descriptor = "I")
    private int field438 = -1;

    @OriginalMember(owner = "client", name = "Jf", descriptor = "B")
    private byte field439 = -60;

    @OriginalMember(owner = "client", name = "Lf", descriptor = "I")
    private int field441 = 2;

    @OriginalMember(owner = "client", name = "Uf", descriptor = "[[I")
    private int[][] field450 = new int[104][104];

    @OriginalMember(owner = "client", name = "dg", descriptor = "Z")
    public boolean field459 = true;

    @OriginalMember(owner = "client", name = "eg", descriptor = "Z")
    private boolean field460 = false;

    @OriginalMember(owner = "client", name = "fg", descriptor = "I")
    private int field461 = 7;

    @OriginalMember(owner = "client", name = "og", descriptor = "[I")
    private int[] field470 = new int[200];

    @OriginalMember(owner = "client", name = "pg", descriptor = "Z")
    private boolean field471 = false;

    @OriginalMember(owner = "client", name = "qg", descriptor = "I")
    private int field472 = -1;

    @OriginalMember(owner = "client", name = "rg", descriptor = "[I")
    private int[] field473 = new int[151];

    @OriginalMember(owner = "client", name = "yg", descriptor = "I")
    private int field480 = 2048;

    @OriginalMember(owner = "client", name = "zg", descriptor = "I")
    private int field481 = 2047;

    @OriginalMember(owner = "client", name = "Ag", descriptor = "[LAGFDLNBY;")
    private class1[] field482 = new class1[this.field480];

    @OriginalMember(owner = "client", name = "Cg", descriptor = "[I")
    public int[] field484 = new int[this.field480];

    @OriginalMember(owner = "client", name = "Eg", descriptor = "[I")
    private int[] field486 = new int[this.field480];

    @OriginalMember(owner = "client", name = "Fg", descriptor = "[LYOXDZEVD;")
    private class68[] field487 = new class68[this.field480];

    @OriginalMember(owner = "client", name = "Gg", descriptor = "[I")
    private int[] field488 = new int[50];

    @OriginalMember(owner = "client", name = "Hg", descriptor = "I")
    private int field489 = 93;

    @OriginalMember(owner = "client", name = "Jg", descriptor = "Z")
    private boolean field491 = true;

    @OriginalMember(owner = "client", name = "Kg", descriptor = "I")
    private int field492 = 6;

    @OriginalMember(owner = "client", name = "Lg", descriptor = "I")
    private int field493 = -1;

    @OriginalMember(owner = "client", name = "Wg", descriptor = "[I")
    private int[] field504 = new int[100];

    @OriginalMember(owner = "client", name = "Xg", descriptor = "[Ljava/lang/String;")
    private String[] field505 = new String[100];

    @OriginalMember(owner = "client", name = "Yg", descriptor = "[Ljava/lang/String;")
    private String[] field506 = new String[100];

    @OriginalMember(owner = "client", name = "eh", descriptor = "B")
    private byte field512 = 4;

    @OriginalMember(owner = "client", name = "fh", descriptor = "LYLURZVWU;")
    private class65 field513 = new class65((byte) 52);

    @OriginalMember(owner = "client", name = "nh", descriptor = "Z")
    private volatile boolean field521 = false;

    @OriginalMember(owner = "client", name = "ph", descriptor = "[I")
    private int[] field523 = new int[5];

    @OriginalMember(owner = "client", name = "rh", descriptor = "I")
    private int field525 = 2;

    @OriginalMember(owner = "client", name = "th", descriptor = "I")
    private int field527 = 128;

    @OriginalMember(owner = "client", name = "Ah", descriptor = "I")
    private int field534 = 2;

    @OriginalMember(owner = "client", name = "Bh", descriptor = "Z")
    private boolean field535 = true;

    @OriginalMember(owner = "client", name = "Eh", descriptor = "I")
    private int field538 = -712;

    @OriginalMember(owner = "client", name = "Gh", descriptor = "[I")
    private int[] field540 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client", name = "Hh", descriptor = "Z")
    private boolean field541 = false;

    @OriginalMember(owner = "client", name = "Lh", descriptor = "Z")
    private boolean field545 = true;

    @OriginalMember(owner = "client", name = "Sh", descriptor = "Ljava/lang/String;")
    private String field552 = "";

    @OriginalMember(owner = "client", name = "Th", descriptor = "Z")
    private boolean field553 = false;

    @OriginalMember(owner = "client", name = "Wh", descriptor = "Z")
    private boolean field556 = false;

    @OriginalMember(owner = "client", name = "Yh", descriptor = "LYOXDZEVD;")
    private class68 field558 = class68.method537(0, 1);

    @OriginalMember(owner = "client", name = "bi", descriptor = "I")
    private int field561 = -1;

    @OriginalMember(owner = "client", name = "ei", descriptor = "I")
    private int field564 = -6;

    @OriginalMember(owner = "client", name = "fi", descriptor = "[[I")
    private int[][] field565 = new int[104][104];

    @OriginalMember(owner = "client", name = "ji", descriptor = "B")
    private byte field569 = 3;

    @OriginalMember(owner = "client", name = "mi", descriptor = "I")
    private int field572 = 617;

    @OriginalMember(owner = "client", name = "ni", descriptor = "I")
    private int field573 = -653;

    @OriginalMember(owner = "client", name = "ri", descriptor = "I")
    private int field577 = -1;

    @OriginalMember(owner = "client", name = "si", descriptor = "[[[I")
    private int[][][] field578 = new int[4][13][13];

    @OriginalMember(owner = "client", name = "vi", descriptor = "Ljava/lang/String;")
    private String field581 = "";

    @OriginalMember(owner = "client", name = "yi", descriptor = "[I")
    private int[] field584 = new int[33];

    @OriginalMember(owner = "client", name = "Ci", descriptor = "[LDYPVESKW;")
    private class14[] field588 = new class14[20];

    @OriginalMember(owner = "client", name = "Gi", descriptor = "[LDYPVESKW;")
    private class14[] field592 = new class14[1000];

    @OriginalMember(owner = "client", name = "Ii", descriptor = "Z")
    private boolean field594 = false;

    @OriginalMember(owner = "client", name = "Ji", descriptor = "[Ljava/lang/String;")
    private String[] field595 = new String[200];

    @OriginalMember(owner = "client", name = "Ki", descriptor = "B")
    private byte field596 = 3;

    @OriginalMember(owner = "client", name = "Li", descriptor = "[I")
    private int[] field597 = new int[7];

    @OriginalMember(owner = "client", name = "Pi", descriptor = "Z")
    private boolean field601 = false;

    @OriginalMember(owner = "client", name = "Qi", descriptor = "Z")
    private boolean field602 = false;

    @OriginalMember(owner = "client", name = "Ti", descriptor = "I")
    private int field605 = 1;

    @OriginalMember(owner = "client", name = "Ui", descriptor = "I")
    private int field606 = -1;

    @OriginalMember(owner = "client", name = "Vi", descriptor = "Z")
    private boolean field607 = false;

    @OriginalMember(owner = "client", name = "Xi", descriptor = "Ljava/lang/String;")
    private String field609 = "";

    @OriginalMember(owner = "client", name = "Yi", descriptor = "Ljava/lang/String;")
    private String field610 = "";

    @OriginalMember(owner = "client", name = "bj", descriptor = "[B")
    private byte[] field613 = new byte[16384];

    @OriginalMember(owner = "client", name = "cj", descriptor = "[[[LYLURZVWU;")
    private class65[][][] field614 = new class65[4][104][104];

    @OriginalMember(owner = "client", name = "dj", descriptor = "[Ljava/lang/String;")
    private String[] field615 = new String[500];

    @OriginalMember(owner = "client", name = "fj", descriptor = "B")
    private byte field617 = -41;

    @OriginalMember(owner = "client", name = "hj", descriptor = "Z")
    public boolean field619 = false;

    @OriginalMember(owner = "client", name = "ij", descriptor = "[I")
    private int[] field620 = new int[5];

    @OriginalMember(owner = "client", name = "kj", descriptor = "Z")
    private boolean field622 = false;

    @OriginalMember(owner = "client", name = "mj", descriptor = "Ljava/lang/String;")
    private String field624 = "";

    @OriginalMember(owner = "client", name = "tj", descriptor = "[I")
    public int[] field631 = new int[2000];

    @OriginalMember(owner = "client", name = "uj", descriptor = "[I")
    private int[] field632 = new int[5];

    @OriginalMember(owner = "client", name = "xj", descriptor = "Z")
    private boolean field635 = false;

    @OriginalMember(owner = "client", name = "Aj", descriptor = "I")
    private int field638 = 50;

    @OriginalMember(owner = "client", name = "Bj", descriptor = "[I")
    private int[] field639 = new int[this.field638];

    @OriginalMember(owner = "client", name = "Cj", descriptor = "[I")
    private int[] field640 = new int[this.field638];

    @OriginalMember(owner = "client", name = "Dj", descriptor = "[I")
    private int[] field641 = new int[this.field638];

    @OriginalMember(owner = "client", name = "Ej", descriptor = "[I")
    private int[] field642 = new int[this.field638];

    @OriginalMember(owner = "client", name = "Fj", descriptor = "[I")
    private int[] field643 = new int[this.field638];

    @OriginalMember(owner = "client", name = "Gj", descriptor = "[I")
    private int[] field644 = new int[this.field638];

    @OriginalMember(owner = "client", name = "Hj", descriptor = "[I")
    private int[] field645 = new int[this.field638];

    @OriginalMember(owner = "client", name = "Ij", descriptor = "[Ljava/lang/String;")
    private String[] field646 = new String[this.field638];

    @OriginalMember(owner = "client", name = "Jj", descriptor = "Z")
    private volatile boolean field647 = false;

    @OriginalMember(owner = "client", name = "Lj", descriptor = "I")
    private int field649 = 3;

    @OriginalMember(owner = "client", name = "Mb", descriptor = "I")
    private static int field235 = 10;

    @OriginalMember(owner = "client", name = "Ob", descriptor = "Z")
    private static boolean field237 = true;

    @OriginalMember(owner = "client", name = "Oc", descriptor = "[I")
    private static int[] field289 = new int[99];

    @OriginalMember(owner = "client", name = "Td", descriptor = "Ljava/math/BigInteger;")
    private static BigInteger field346;

    @OriginalMember(owner = "client", name = "Ke", descriptor = "I")
    private static int field389;

    @OriginalMember(owner = "client", name = "Ze", descriptor = "I")
    private static int field404;

    @OriginalMember(owner = "client", name = "rf", descriptor = "[I")
    public static int[] field421;

    @OriginalMember(owner = "client", name = "Ig", descriptor = "I")
    private static int field490;

    @OriginalMember(owner = "client", name = "yh", descriptor = "[[I")
    public static final int[][] field532;

    @OriginalMember(owner = "client", name = "Uh", descriptor = "Ljava/lang/String;")
    private static String field554;

    @OriginalMember(owner = "client", name = "Fi", descriptor = "[I")
    public static final int[] field591;

    @OriginalMember(owner = "client", name = "nj", descriptor = "Ljava/math/BigInteger;")
    private static BigInteger field625;

    @OriginalMember(owner = "client", name = "O", descriptor = "I")
    private int field185;

    @OriginalMember(owner = "client", name = "U", descriptor = "I")
    private int field191;

    @OriginalMember(owner = "client", name = "X", descriptor = "I")
    private int field194;

    @OriginalMember(owner = "client", name = "Y", descriptor = "I")
    private static int field195;

    @OriginalMember(owner = "client", name = "Z", descriptor = "I")
    private int field196;

    @OriginalMember(owner = "client", name = "eb", descriptor = "I")
    private int field201;

    @OriginalMember(owner = "client", name = "pb", descriptor = "I")
    private int field212;

    @OriginalMember(owner = "client", name = "qb", descriptor = "I")
    private int field213;

    @OriginalMember(owner = "client", name = "rb", descriptor = "I")
    private int field214;

    @OriginalMember(owner = "client", name = "sb", descriptor = "I")
    private int field215;

    @OriginalMember(owner = "client", name = "tb", descriptor = "I")
    private int field216;

    @OriginalMember(owner = "client", name = "wb", descriptor = "I")
    private int field219;

    @OriginalMember(owner = "client", name = "xb", descriptor = "I")
    private int field220;

    @OriginalMember(owner = "client", name = "yb", descriptor = "I")
    private int field221;

    @OriginalMember(owner = "client", name = "Fb", descriptor = "I")
    private static int field228;

    @OriginalMember(owner = "client", name = "Gb", descriptor = "I")
    private int field229;

    @OriginalMember(owner = "client", name = "Hb", descriptor = "I")
    private int field230;

    @OriginalMember(owner = "client", name = "Kb", descriptor = "I")
    private int field233;

    @OriginalMember(owner = "client", name = "Nb", descriptor = "I")
    public static int field236;

    @OriginalMember(owner = "client", name = "Qb", descriptor = "I")
    private int field239;

    @OriginalMember(owner = "client", name = "Rb", descriptor = "I")
    private int field240;

    @OriginalMember(owner = "client", name = "Sb", descriptor = "I")
    private int field241;

    @OriginalMember(owner = "client", name = "Tb", descriptor = "I")
    private int field242;

    @OriginalMember(owner = "client", name = "Wb", descriptor = "I")
    private static int field245;

    @OriginalMember(owner = "client", name = "Zb", descriptor = "I")
    private int field248;

    @OriginalMember(owner = "client", name = "ac", descriptor = "I")
    private int field249;

    @OriginalMember(owner = "client", name = "bc", descriptor = "I")
    private int field250;

    @OriginalMember(owner = "client", name = "cc", descriptor = "I")
    private int field251;

    @OriginalMember(owner = "client", name = "fc", descriptor = "I")
    private int field254;

    @OriginalMember(owner = "client", name = "gc", descriptor = "I")
    private static int field255;

    @OriginalMember(owner = "client", name = "hc", descriptor = "I")
    private int field256;

    @OriginalMember(owner = "client", name = "mc", descriptor = "I")
    private int field261;

    @OriginalMember(owner = "client", name = "nc", descriptor = "I")
    private int field262;

    @OriginalMember(owner = "client", name = "oc", descriptor = "I")
    private int field263;

    @OriginalMember(owner = "client", name = "pc", descriptor = "I")
    private int field264;

    @OriginalMember(owner = "client", name = "qc", descriptor = "I")
    private int field265;

    @OriginalMember(owner = "client", name = "tc", descriptor = "I")
    private int field268;

    @OriginalMember(owner = "client", name = "wc", descriptor = "I")
    private int field271;

    @OriginalMember(owner = "client", name = "zc", descriptor = "I")
    private int field274;

    @OriginalMember(owner = "client", name = "Jc", descriptor = "I")
    private int field284;

    @OriginalMember(owner = "client", name = "Kc", descriptor = "I")
    private int field285;

    @OriginalMember(owner = "client", name = "Lc", descriptor = "I")
    private int field286;

    @OriginalMember(owner = "client", name = "Sc", descriptor = "I")
    private static int field293;

    @OriginalMember(owner = "client", name = "ed", descriptor = "I")
    private int field305;

    @OriginalMember(owner = "client", name = "fd", descriptor = "I")
    private int field306;

    @OriginalMember(owner = "client", name = "gd", descriptor = "I")
    private int field307;

    @OriginalMember(owner = "client", name = "hd", descriptor = "I")
    private int field308;

    @OriginalMember(owner = "client", name = "id", descriptor = "I")
    private int field309;

    @OriginalMember(owner = "client", name = "jd", descriptor = "I")
    private int field310;

    @OriginalMember(owner = "client", name = "md", descriptor = "I")
    private int field313;

    @OriginalMember(owner = "client", name = "nd", descriptor = "I")
    private int field314;

    @OriginalMember(owner = "client", name = "od", descriptor = "I")
    private int field315;

    @OriginalMember(owner = "client", name = "pd", descriptor = "I")
    private int field316;

    @OriginalMember(owner = "client", name = "vd", descriptor = "I")
    private int field322;

    @OriginalMember(owner = "client", name = "wd", descriptor = "I")
    private int field323;

    @OriginalMember(owner = "client", name = "xd", descriptor = "I")
    private int field324;

    @OriginalMember(owner = "client", name = "yd", descriptor = "I")
    private int field325;

    @OriginalMember(owner = "client", name = "Ad", descriptor = "I")
    private int field327;

    @OriginalMember(owner = "client", name = "Bd", descriptor = "I")
    private int field328;

    @OriginalMember(owner = "client", name = "Cd", descriptor = "I")
    private int field329;

    @OriginalMember(owner = "client", name = "Ed", descriptor = "I")
    private int field331;

    @OriginalMember(owner = "client", name = "Hd", descriptor = "I")
    private int field334;

    @OriginalMember(owner = "client", name = "Id", descriptor = "I")
    private int field335;

    @OriginalMember(owner = "client", name = "Jd", descriptor = "I")
    private int field336;

    @OriginalMember(owner = "client", name = "Kd", descriptor = "I")
    private int field337;

    @OriginalMember(owner = "client", name = "Od", descriptor = "I")
    private int field341;

    @OriginalMember(owner = "client", name = "Pd", descriptor = "I")
    private int field342;

    @OriginalMember(owner = "client", name = "Qd", descriptor = "I")
    private int field343;

    @OriginalMember(owner = "client", name = "Sd", descriptor = "I")
    public static int field345;

    @OriginalMember(owner = "client", name = "Vd", descriptor = "I")
    private static int field348;

    @OriginalMember(owner = "client", name = "Zd", descriptor = "I")
    private int field352;

    @OriginalMember(owner = "client", name = "be", descriptor = "I")
    private int field354;

    @OriginalMember(owner = "client", name = "ee", descriptor = "I")
    private int field357;

    @OriginalMember(owner = "client", name = "qe", descriptor = "I")
    private static int field369;

    @OriginalMember(owner = "client", name = "ve", descriptor = "I")
    private int field374;

    @OriginalMember(owner = "client", name = "ze", descriptor = "I")
    private int field378;

    @OriginalMember(owner = "client", name = "Ae", descriptor = "I")
    private int field379;

    @OriginalMember(owner = "client", name = "Be", descriptor = "I")
    private int field380;

    @OriginalMember(owner = "client", name = "Ce", descriptor = "I")
    private int field381;

    @OriginalMember(owner = "client", name = "De", descriptor = "I")
    private int field382;

    @OriginalMember(owner = "client", name = "Ee", descriptor = "I")
    private int field383;

    @OriginalMember(owner = "client", name = "Fe", descriptor = "I")
    private int field384;

    @OriginalMember(owner = "client", name = "Ie", descriptor = "I")
    private int field387;

    @OriginalMember(owner = "client", name = "Pe", descriptor = "I")
    private int field394;

    @OriginalMember(owner = "client", name = "Qe", descriptor = "I")
    private int field395;

    @OriginalMember(owner = "client", name = "Se", descriptor = "I")
    private static int field397;

    @OriginalMember(owner = "client", name = "Ve", descriptor = "I")
    private int field400;

    @OriginalMember(owner = "client", name = "Ye", descriptor = "I")
    private static int field403;

    @OriginalMember(owner = "client", name = "cf", descriptor = "I")
    private static int field407;

    @OriginalMember(owner = "client", name = "lf", descriptor = "I")
    public int field415;

    @OriginalMember(owner = "client", name = "mf", descriptor = "I")
    public int field416;

    @OriginalMember(owner = "client", name = "qf", descriptor = "I")
    private int field420;

    @OriginalMember(owner = "client", name = "sf", descriptor = "I")
    private int field422;

    @OriginalMember(owner = "client", name = "uf", descriptor = "I")
    private int field424;

    @OriginalMember(owner = "client", name = "Hf", descriptor = "I")
    private int field437;

    @OriginalMember(owner = "client", name = "Kf", descriptor = "I")
    private int field440;

    @OriginalMember(owner = "client", name = "Nf", descriptor = "I")
    private int field443;

    @OriginalMember(owner = "client", name = "Of", descriptor = "I")
    private int field444;

    @OriginalMember(owner = "client", name = "Pf", descriptor = "I")
    private int field445;

    @OriginalMember(owner = "client", name = "Qf", descriptor = "I")
    private int field446;

    @OriginalMember(owner = "client", name = "Rf", descriptor = "I")
    private int field447;

    @OriginalMember(owner = "client", name = "Sf", descriptor = "I")
    private int field448;

    @OriginalMember(owner = "client", name = "Tf", descriptor = "I")
    private int field449;

    @OriginalMember(owner = "client", name = "Xf", descriptor = "I")
    private int field453;

    @OriginalMember(owner = "client", name = "Yf", descriptor = "I")
    private int field454;

    @OriginalMember(owner = "client", name = "Zf", descriptor = "I")
    private int field455;

    @OriginalMember(owner = "client", name = "ag", descriptor = "I")
    private int field456;

    @OriginalMember(owner = "client", name = "cg", descriptor = "I")
    private int field458;

    @OriginalMember(owner = "client", name = "sg", descriptor = "I")
    private int field474;

    @OriginalMember(owner = "client", name = "Bg", descriptor = "I")
    private int field483;

    @OriginalMember(owner = "client", name = "Dg", descriptor = "I")
    private int field485;

    @OriginalMember(owner = "client", name = "Mg", descriptor = "I")
    private int field494;

    @OriginalMember(owner = "client", name = "Ng", descriptor = "I")
    public static int field495;

    @OriginalMember(owner = "client", name = "Rg", descriptor = "I")
    private int field499;

    @OriginalMember(owner = "client", name = "Sg", descriptor = "I")
    private int field500;

    @OriginalMember(owner = "client", name = "Tg", descriptor = "I")
    private int field501;

    @OriginalMember(owner = "client", name = "Ug", descriptor = "I")
    private int field502;

    @OriginalMember(owner = "client", name = "Vg", descriptor = "I")
    private int field503;

    @OriginalMember(owner = "client", name = "ah", descriptor = "I")
    private int field508;

    @OriginalMember(owner = "client", name = "bh", descriptor = "I")
    private int field509;

    @OriginalMember(owner = "client", name = "ch", descriptor = "I")
    private static int field510;

    @OriginalMember(owner = "client", name = "dh", descriptor = "I")
    private int field511;

    @OriginalMember(owner = "client", name = "gh", descriptor = "I")
    private int field514;

    @OriginalMember(owner = "client", name = "hh", descriptor = "I")
    private int field515;

    @OriginalMember(owner = "client", name = "ih", descriptor = "I")
    private int field516;

    @OriginalMember(owner = "client", name = "jh", descriptor = "I")
    private int field517;

    @OriginalMember(owner = "client", name = "kh", descriptor = "I")
    private int field518;

    @OriginalMember(owner = "client", name = "lh", descriptor = "I")
    private int field519;

    @OriginalMember(owner = "client", name = "qh", descriptor = "I")
    private int field524;

    @OriginalMember(owner = "client", name = "uh", descriptor = "I")
    private int field528;

    @OriginalMember(owner = "client", name = "vh", descriptor = "I")
    private int field529;

    @OriginalMember(owner = "client", name = "wh", descriptor = "I")
    private int field530;

    @OriginalMember(owner = "client", name = "xh", descriptor = "I")
    private int field531;

    @OriginalMember(owner = "client", name = "zh", descriptor = "I")
    private int field533;

    @OriginalMember(owner = "client", name = "Fh", descriptor = "I")
    private int field539;

    @OriginalMember(owner = "client", name = "Jh", descriptor = "I")
    private int field543;

    @OriginalMember(owner = "client", name = "Kh", descriptor = "I")
    private int field544;

    @OriginalMember(owner = "client", name = "Nh", descriptor = "I")
    private int field547;

    @OriginalMember(owner = "client", name = "Oh", descriptor = "I")
    private static int field548;

    @OriginalMember(owner = "client", name = "Ph", descriptor = "I")
    private int field549;

    @OriginalMember(owner = "client", name = "Qh", descriptor = "I")
    private int field550;

    @OriginalMember(owner = "client", name = "Rh", descriptor = "I")
    private int field551;

    @OriginalMember(owner = "client", name = "Vh", descriptor = "I")
    private int field555;

    @OriginalMember(owner = "client", name = "Xh", descriptor = "I")
    public int field557;

    @OriginalMember(owner = "client", name = "Zh", descriptor = "I")
    private int field559;

    @OriginalMember(owner = "client", name = "ai", descriptor = "I")
    private int field560;

    @OriginalMember(owner = "client", name = "di", descriptor = "I")
    private int field563;

    @OriginalMember(owner = "client", name = "gi", descriptor = "I")
    private int field566;

    @OriginalMember(owner = "client", name = "hi", descriptor = "I")
    private static int field567;

    @OriginalMember(owner = "client", name = "ii", descriptor = "I")
    private static int field568;

    @OriginalMember(owner = "client", name = "ki", descriptor = "I")
    private int field570;

    @OriginalMember(owner = "client", name = "li", descriptor = "I")
    private int field571;

    @OriginalMember(owner = "client", name = "Di", descriptor = "I")
    private int field589;

    @OriginalMember(owner = "client", name = "Ei", descriptor = "I")
    private int field590;

    @OriginalMember(owner = "client", name = "Si", descriptor = "I")
    private int field604;

    @OriginalMember(owner = "client", name = "Wi", descriptor = "I")
    private int field608;

    @OriginalMember(owner = "client", name = "aj", descriptor = "I")
    private int field612;

    @OriginalMember(owner = "client", name = "ej", descriptor = "I")
    private int field616;

    @OriginalMember(owner = "client", name = "gj", descriptor = "I")
    private int field618;

    @OriginalMember(owner = "client", name = "jj", descriptor = "I")
    private static int field621;

    @OriginalMember(owner = "client", name = "lj", descriptor = "I")
    private static int field623;

    @OriginalMember(owner = "client", name = "qj", descriptor = "I")
    private int field628;

    @OriginalMember(owner = "client", name = "rj", descriptor = "I")
    private static int field629;

    @OriginalMember(owner = "client", name = "sj", descriptor = "I")
    private int field630;

    @OriginalMember(owner = "client", name = "yj", descriptor = "I")
    private int field636;

    @OriginalMember(owner = "client", name = "zj", descriptor = "I")
    private int field637;

    @OriginalMember(owner = "client", name = "Kj", descriptor = "I")
    private static int field648;

    @OriginalMember(owner = "client", name = "Mj", descriptor = "I")
    public static int field650;

    @OriginalMember(owner = "client", name = "xe", descriptor = "J")
    private long field376;

    @OriginalMember(owner = "client", name = "kf", descriptor = "J")
    public long field414;

    @OriginalMember(owner = "client", name = "oh", descriptor = "J")
    private long field522;

    @OriginalMember(owner = "client", name = "sh", descriptor = "J")
    private long field526;

    @OriginalMember(owner = "client", name = "ci", descriptor = "J")
    private long field562;

    @OriginalMember(owner = "client", name = "qd", descriptor = "LDYPVESKW;")
    private class14 field317;

    @OriginalMember(owner = "client", name = "rd", descriptor = "LDYPVESKW;")
    private class14 field318;

    @OriginalMember(owner = "client", name = "sd", descriptor = "LDYPVESKW;")
    private class14 field319;

    @OriginalMember(owner = "client", name = "td", descriptor = "LDYPVESKW;")
    private class14 field320;

    @OriginalMember(owner = "client", name = "ud", descriptor = "LDYPVESKW;")
    private class14 field321;

    @OriginalMember(owner = "client", name = "Re", descriptor = "LDYPVESKW;")
    private class14 field396;

    @OriginalMember(owner = "client", name = "Vf", descriptor = "LDYPVESKW;")
    private class14 field451;

    @OriginalMember(owner = "client", name = "Wf", descriptor = "LDYPVESKW;")
    private class14 field452;

    @OriginalMember(owner = "client", name = "ti", descriptor = "LDYPVESKW;")
    private class14 field579;

    @OriginalMember(owner = "client", name = "ui", descriptor = "LDYPVESKW;")
    private class14 field580;

    @OriginalMember(owner = "client", name = "Ri", descriptor = "LDYPVESKW;")
    private class14 field603;

    @OriginalMember(owner = "client", name = "Zi", descriptor = "LDYPVESKW;")
    private class14 field611;

    @OriginalMember(owner = "client", name = "oj", descriptor = "LDYPVESKW;")
    private class14 field626;

    @OriginalMember(owner = "client", name = "pj", descriptor = "LDYPVESKW;")
    private class14 field627;

    @OriginalMember(owner = "client", name = "Bc", descriptor = "LDZSIRBWX;")
    private class15 field276;

    @OriginalMember(owner = "client", name = "Cc", descriptor = "LDZSIRBWX;")
    private class15 field277;

    @OriginalMember(owner = "client", name = "gg", descriptor = "LDZSIRBWX;")
    private class15 field462;

    @OriginalMember(owner = "client", name = "hg", descriptor = "LDZSIRBWX;")
    private class15 field463;

    @OriginalMember(owner = "client", name = "ig", descriptor = "LDZSIRBWX;")
    private class15 field464;

    @OriginalMember(owner = "client", name = "jg", descriptor = "LDZSIRBWX;")
    private class15 field465;

    @OriginalMember(owner = "client", name = "kg", descriptor = "LDZSIRBWX;")
    private class15 field466;

    @OriginalMember(owner = "client", name = "tg", descriptor = "LDZSIRBWX;")
    private class15 field475;

    @OriginalMember(owner = "client", name = "ug", descriptor = "LDZSIRBWX;")
    private class15 field476;

    @OriginalMember(owner = "client", name = "vg", descriptor = "LDZSIRBWX;")
    private class15 field477;

    @OriginalMember(owner = "client", name = "wg", descriptor = "LDZSIRBWX;")
    private class15 field478;

    @OriginalMember(owner = "client", name = "xg", descriptor = "LDZSIRBWX;")
    private class15 field479;

    @OriginalMember(owner = "client", name = "oi", descriptor = "LDZSIRBWX;")
    private class15 field574;

    @OriginalMember(owner = "client", name = "pi", descriptor = "LDZSIRBWX;")
    private class15 field575;

    @OriginalMember(owner = "client", name = "qi", descriptor = "LDZSIRBWX;")
    private class15 field576;

    @OriginalMember(owner = "client", name = "Ai", descriptor = "LDZSIRBWX;")
    private class15 field586;

    @OriginalMember(owner = "client", name = "Bi", descriptor = "LDZSIRBWX;")
    private class15 field587;

    @OriginalMember(owner = "client", name = "Mi", descriptor = "LDZSIRBWX;")
    private class15 field598;

    @OriginalMember(owner = "client", name = "Ni", descriptor = "LDZSIRBWX;")
    private class15 field599;

    @OriginalMember(owner = "client", name = "Oi", descriptor = "LDZSIRBWX;")
    private class15 field600;

    @OriginalMember(owner = "client", name = "Mf", descriptor = "LAGFDLNBY;")
    public static class1 field442;

    @OriginalMember(owner = "client", name = "Ab", descriptor = "LOIDSBDUP;")
    private class40 field223;

    @OriginalMember(owner = "client", name = "Bb", descriptor = "LOIDSBDUP;")
    private class40 field224;

    @OriginalMember(owner = "client", name = "Cb", descriptor = "LOIDSBDUP;")
    private class40 field225;

    @OriginalMember(owner = "client", name = "Db", descriptor = "LOIDSBDUP;")
    private class40 field226;

    @OriginalMember(owner = "client", name = "Fc", descriptor = "LOIDSBDUP;")
    private class40 field280;

    @OriginalMember(owner = "client", name = "Gc", descriptor = "LOIDSBDUP;")
    private class40 field281;

    @OriginalMember(owner = "client", name = "Hc", descriptor = "LOIDSBDUP;")
    private class40 field282;

    @OriginalMember(owner = "client", name = "Uc", descriptor = "LOIDSBDUP;")
    private class40 field295;

    @OriginalMember(owner = "client", name = "Vc", descriptor = "LOIDSBDUP;")
    private class40 field296;

    @OriginalMember(owner = "client", name = "Wc", descriptor = "LOIDSBDUP;")
    private class40 field297;

    @OriginalMember(owner = "client", name = "Xc", descriptor = "LOIDSBDUP;")
    private class40 field298;

    @OriginalMember(owner = "client", name = "Yc", descriptor = "LOIDSBDUP;")
    private class40 field299;

    @OriginalMember(owner = "client", name = "Zc", descriptor = "LOIDSBDUP;")
    private class40 field300;

    @OriginalMember(owner = "client", name = "ad", descriptor = "LOIDSBDUP;")
    private class40 field301;

    @OriginalMember(owner = "client", name = "bd", descriptor = "LOIDSBDUP;")
    private class40 field302;

    @OriginalMember(owner = "client", name = "cd", descriptor = "LOIDSBDUP;")
    private class40 field303;

    @OriginalMember(owner = "client", name = "vf", descriptor = "LOIDSBDUP;")
    private class40 field425;

    @OriginalMember(owner = "client", name = "wf", descriptor = "LOIDSBDUP;")
    private class40 field426;

    @OriginalMember(owner = "client", name = "xf", descriptor = "LOIDSBDUP;")
    private class40 field427;

    @OriginalMember(owner = "client", name = "yf", descriptor = "LOIDSBDUP;")
    private class40 field428;

    @OriginalMember(owner = "client", name = "zf", descriptor = "LOIDSBDUP;")
    private class40 field429;

    @OriginalMember(owner = "client", name = "Af", descriptor = "LOIDSBDUP;")
    private class40 field430;

    @OriginalMember(owner = "client", name = "Bf", descriptor = "LOIDSBDUP;")
    private class40 field431;

    @OriginalMember(owner = "client", name = "Cf", descriptor = "LOIDSBDUP;")
    private class40 field432;

    @OriginalMember(owner = "client", name = "Df", descriptor = "LOIDSBDUP;")
    private class40 field433;

    @OriginalMember(owner = "client", name = "de", descriptor = "LOTSGNSQM;")
    private class41 field356;

    @OriginalMember(owner = "client", name = "Hi", descriptor = "LPOKVNZOV;")
    private class42 field593;

    @OriginalMember(owner = "client", name = "df", descriptor = "LRXCVCUUO;")
    private class45 field408;

    @OriginalMember(owner = "client", name = "ef", descriptor = "LRXCVCUUO;")
    private class45 field409;

    @OriginalMember(owner = "client", name = "ff", descriptor = "LRXCVCUUO;")
    private class45 field410;

    @OriginalMember(owner = "client", name = "gf", descriptor = "LRXCVCUUO;")
    private class45 field411;

    @OriginalMember(owner = "client", name = "Dh", descriptor = "LSFXLZPAR;")
    private class47 field537;

    @OriginalMember(owner = "client", name = "mh", descriptor = "LUUFZOKXH;")
    private class54 field520;

    @OriginalMember(owner = "client", name = "zi", descriptor = "LVNYQVBWD;")
    private class56 field585;

    @OriginalMember(owner = "client", name = "ec", descriptor = "LANTLOSVZ;")
    public class5 field253;

    @OriginalMember(owner = "client", name = "zd", descriptor = "Ljava/lang/String;")
    public String field326;

    @OriginalMember(owner = "client", name = "jf", descriptor = "Ljava/lang/String;")
    private String field413;

    @OriginalMember(owner = "client", name = "bg", descriptor = "Ljava/lang/String;")
    public String field457;

    @OriginalMember(owner = "client", name = "Zg", descriptor = "Ljava/lang/String;")
    private String field507;

    @OriginalMember(owner = "client", name = "Mh", descriptor = "Ljava/net/Socket;")
    private Socket field546;

    @OriginalMember(owner = "client", name = "Pb", descriptor = "Z")
    private static boolean field238;

    @OriginalMember(owner = "client", name = "ce", descriptor = "Z")
    public static boolean field355;

    @OriginalMember(owner = "client", name = "re", descriptor = "Z")
    private static boolean field370;

    @OriginalMember(owner = "client", name = "Je", descriptor = "Z")
    public static boolean field388;

    @OriginalMember(owner = "client", name = "jb", descriptor = "[I")
    private int[] field206;

    @OriginalMember(owner = "client", name = "kb", descriptor = "[I")
    private int[] field207;

    @OriginalMember(owner = "client", name = "lb", descriptor = "[I")
    private int[] field208;

    @OriginalMember(owner = "client", name = "mb", descriptor = "[I")
    private int[] field209;

    @OriginalMember(owner = "client", name = "Ne", descriptor = "[I")
    private int[] field392;

    @OriginalMember(owner = "client", name = "Oe", descriptor = "[I")
    private int[] field393;

    @OriginalMember(owner = "client", name = "lg", descriptor = "[I")
    private int[] field467;

    @OriginalMember(owner = "client", name = "mg", descriptor = "[I")
    private int[] field468;

    @OriginalMember(owner = "client", name = "ng", descriptor = "[I")
    private int[] field469;

    @OriginalMember(owner = "client", name = "Og", descriptor = "[I")
    private int[] field496;

    @OriginalMember(owner = "client", name = "Pg", descriptor = "[I")
    private int[] field497;

    @OriginalMember(owner = "client", name = "Qg", descriptor = "[I")
    private int[] field498;

    @OriginalMember(owner = "client", name = "wi", descriptor = "[I")
    private int[] field582;

    @OriginalMember(owner = "client", name = "xi", descriptor = "[I")
    private int[] field583;

    @OriginalMember(owner = "client", name = "vj", descriptor = "[LDZSIRBWX;")
    private class15[] field633;

    @OriginalMember(owner = "client", name = "Ch", descriptor = "[[B")
    private byte[][] field536;

    @OriginalMember(owner = "client", name = "Ih", descriptor = "[[B")
    private byte[][] field542;

    @OriginalMember(owner = "client", name = "wj", descriptor = "[[[B")
    private byte[][][] field634;

    @OriginalMember(owner = "client", name = "ye", descriptor = "[[[I")
    private int[][][] field377;

    @OriginalMember(owner = "client", name = "f", descriptor = "(I)V")
    public static final void method25(int arg0) {
        class56.field1383 = true;
        class33.field976 = true;
        field238 = true;
        class34.field1001 = true;
        if (arg0 != 1) {
            field490 = -395;
        }
        class48.field1283 = true;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;I)Z")
    public final boolean method26(String arg0, int arg1) {
        if (arg0 == null) {
            return false;
        } else {
            for (int var3 = 0; var3 < this.field508; ++var3) {
                if (arg0.equalsIgnoreCase(this.field595[var3])) {
                    return true;
                }
            }
            if (arg1 != 15404) {
                this.field614 = null;
            }
            return arg0.equalsIgnoreCase(field442.field13);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Z)V")
    public final void method27(boolean arg0) {
        if (arg0) {
            this.field213 = -1;
        }
        this.field556 = true;
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(I)V")
    public final void method28(int arg0) {
        if (this.field268 != 0) {
            class45 var2 = this.field409;
            if (arg0 != 12036) {
                this.field614 = null;
            }
            int var3 = 0;
            if (this.field284 != 0) {
                var3 = 1;
            }
            for (int var4 = 0; var4 < 100; ++var4) {
                if (this.field506[var4] != null) {
                    int var5 = this.field504[var4];
                    String var6 = this.field505[var4];
                    byte var7 = 0;
                    if (var6 != null && var6.startsWith("@cr1@")) {
                        var6 = var6.substring(5);
                        var7 = 1;
                    }
                    if (var6 != null && var6.startsWith("@cr2@")) {
                        var6 = var6.substring(5);
                        var7 = 2;
                    }
                    if ((var5 == 3 || var5 == 7) && (var5 == 7 || this.field612 == 0 || this.field612 == 1 && this.method26(var6, 15404))) {
                        int var8 = 329 - var3 * 13;
                        byte var9 = 4;
                        var2.method386(var9, "From", 0, -997, var8);
                        var2.method386(var9, "From", 65535, -997, var8 - 1);
                        int var10 = var9 + var2.method384("From ", true);
                        if (var7 == 1) {
                            this.field252[0].method192(var8 - 12, var10, 49598);
                            var10 += 14;
                        }
                        if (var7 == 2) {
                            this.field252[1].method192(var8 - 12, var10, 49598);
                            var10 += 14;
                        }
                        var2.method386(var10, var6 + ": " + this.field506[var4], 0, -997, var8);
                        var2.method386(var10, var6 + ": " + this.field506[var4], 65535, -997, var8 - 1);
                        ++var3;
                        if (var3 >= 5) {
                            return;
                        }
                    }
                    if (var5 == 5 && this.field612 < 2) {
                        int var11 = 329 - var3 * 13;
                        var2.method386(4, this.field506[var4], 0, -997, var11);
                        var2.method386(4, this.field506[var4], 65535, -997, var11 - 1);
                        ++var3;
                        if (var3 >= 5) {
                            return;
                        }
                    }
                    if (var5 == 6 && this.field612 < 2) {
                        int var12 = 329 - var3 * 13;
                        var2.method386(4, "To " + var6 + ": " + this.field506[var4], 0, -997, var12);
                        var2.method386(4, "To " + var6 + ": " + this.field506[var4], 65535, -997, var12 - 1);
                        ++var3;
                        if (var3 >= 5) {
                            return;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "h", descriptor = "(I)V")
    public final void method29(int arg0) {
        this.field544 = 0;
        if (arg0 < 1 || arg0 > 1) {
            this.method119();
        }
        int var2 = (field442.field1569 >> 7) + this.field248;
        int var3 = (field442.field1570 >> 7) + this.field249;
        if (var2 >= 3053 && var2 <= 3156 && var3 >= 3056 && var3 <= 3136) {
            this.field544 = 1;
        }
        if (var2 >= 3072 && var2 <= 3118 && var3 >= 9492 && var3 <= 9535) {
            this.field544 = 1;
        }
        if (this.field544 == 1 && var2 >= 3139 && var2 <= 3199 && var3 >= 3008 && var3 <= 3062) {
            this.field544 = 0;
        }
    }

    @OriginalMember(owner = "client", name = "i", descriptor = "(I)V")
    public final void method30(int arg0) {
        if (this.field284 > 1) {
            --this.field284;
        }
        if (this.field216 > 0) {
            --this.field216;
        }
        for (int var2 = 0; var2 < 5 && this.method66(556); ++var2) {
        }
        if (this.field619) {
            Object var3 = this.field253.field122;
            synchronized (this.field253.field122) {
                if (!field355) {
                    this.field253.field121 = 0;
                } else if (super.field1052 != 0 || this.field253.field121 >= 40) {
                    this.field232.method538(203, (byte) 0);
                    this.field232.method539(0);
                    int var4 = this.field232.field1612;
                    int var5 = 0;
                    for (int var6 = 0; var6 < this.field253.field121 && var4 - this.field232.field1612 < 240; ++var6) {
                        ++var5;
                        int var7 = this.field253.field120[var6];
                        if (var7 < 0) {
                            var7 = 0;
                        } else if (var7 > 502) {
                            var7 = 502;
                        }
                        int var8 = this.field253.field123[var6];
                        if (var8 < 0) {
                            var8 = 0;
                        } else if (var8 > 764) {
                            var8 = 764;
                        }
                        int var9 = var7 * 765 + var8;
                        if (this.field253.field120[var6] == -1 && this.field253.field123[var6] == -1) {
                            var8 = -1;
                            var7 = -1;
                            var9 = 524287;
                        }
                        if (this.field415 == var8 && this.field416 == var7) {
                            if (this.field557 < 2047) {
                                ++this.field557;
                            }
                        } else {
                            int var10 = var8 - this.field415;
                            this.field415 = var8;
                            int var11 = var7 - this.field416;
                            this.field416 = var7;
                            if (this.field557 < 8 && var10 >= -32 && var10 <= 31 && var11 >= -32 && var11 <= 31) {
                                var10 += 32;
                                var11 += 32;
                                this.field232.method540((this.field557 << 12) + (var10 << 6) + var11);
                                this.field557 = 0;
                            } else if (this.field557 < 8) {
                                this.field232.method542((this.field557 << 19) + 8388608 + var9);
                                this.field557 = 0;
                            } else {
                                this.field232.method543((this.field557 << 19) + -1073741824 + var9);
                                this.field557 = 0;
                            }
                        }
                    }
                    this.field232.method548(this.field232.field1612 - var4, true);
                    if (var5 >= this.field253.field121) {
                        this.field253.field121 = 0;
                    } else {
                        this.field253.field121 -= var5;
                        for (int var12 = 0; var12 < this.field253.field121; ++var12) {
                            this.field253.field123[var12] = this.field253.field123[var5 + var12];
                            this.field253.field120[var12] = this.field253.field120[var5 + var12];
                        }
                    }
                }
            }
            if (super.field1052 != 0) {
                long var13 = (super.field1055 - this.field414) / 50L;
                if (var13 > 4095L) {
                    var13 = 4095L;
                }
                this.field414 = super.field1055;
                int var15 = super.field1054;
                if (var15 < 0) {
                    var15 = 0;
                } else if (var15 > 502) {
                    var15 = 502;
                }
                int var16 = super.field1053;
                if (var16 < 0) {
                    var16 = 0;
                } else if (var16 > 764) {
                    var16 = 764;
                }
                int var17 = var15 * 765 + var16;
                byte var18 = 0;
                if (super.field1052 == 2) {
                    var18 = 1;
                }
                int var19 = (int) var13;
                this.field232.method538(32, (byte) 0);
                this.field232.method543((var18 << 19) + (var19 << 20) + var17);
            }
            if (this.field343 > 0) {
                --this.field343;
            }
            if (super.field1056[1] == 1 || super.field1056[2] == 1 || super.field1056[3] == 1 || super.field1056[4] == 1) {
                this.field344 = true;
            }
            if (this.field344 && this.field343 <= 0) {
                this.field343 = 20;
                this.field344 = false;
                this.field232.method538(106, (byte) 0);
                this.field232.method573(this.field527, true);
                this.field232.method573(this.field528, true);
            }
            if (super.field1043 && !this.field459) {
                this.field459 = true;
                this.field232.method538(49, (byte) 0);
                this.field232.method539(1);
            }
            if (!super.field1043 && this.field459) {
                this.field459 = false;
                this.field232.method538(49, (byte) 0);
                this.field232.method539(0);
            }
            this.method143(this.field191);
            this.method126(0);
            this.method131((byte) -5);
            ++this.field214;
            if (this.field214 > 750) {
                this.method85(2317);
            }
            this.method166(10738);
            this.method32(true);
            this.method104(650);
            ++this.field329;
            if (this.field242 != 0) {
                this.field241 += 20;
                if (this.field241 >= 400) {
                    this.field242 = 0;
                }
            }
            if (this.field316 != 0) {
                ++this.field313;
                if (this.field313 >= 15) {
                    if (this.field316 == 2) {
                        this.field189 = true;
                    }
                    if (this.field316 == 3) {
                        this.field412 = true;
                    }
                    this.field316 = 0;
                }
            }
            if (this.field307 != 0) {
                ++this.field424;
                if (super.field1046 > this.field308 + 5 || super.field1046 < this.field308 - 5 || super.field1047 > this.field309 + 5 || super.field1047 < this.field309 - 5) {
                    this.field607 = true;
                }
                if (super.field1045 == 0) {
                    if (this.field307 == 2) {
                        this.field189 = true;
                    }
                    if (this.field307 == 3) {
                        this.field412 = true;
                    }
                    this.field307 = 0;
                    if (this.field607 && this.field424 >= 5) {
                        this.field449 = -1;
                        this.method86(true);
                        if (this.field449 == this.field305 && this.field448 != this.field306) {
                            class29 var20 = class29.field895[this.field305];
                            byte var21 = 0;
                            if (this.field563 == 1 && var20.field892 == 206) {
                                var21 = 1;
                            }
                            if (var20.field880[this.field448] <= 0) {
                                var21 = 0;
                            }
                            if (var20.field931) {
                                int var22 = this.field306;
                                int var23 = this.field448;
                                var20.field880[var23] = var20.field880[var22];
                                var20.field912[var23] = var20.field912[var22];
                                var20.field880[var22] = -1;
                                var20.field912[var22] = 0;
                            } else if (var21 == 1) {
                                int var24 = this.field306;
                                int var25 = this.field448;
                                while (var24 != var25) {
                                    if (var24 > var25) {
                                        var20.method276(var24, true, var24 - 1);
                                        --var24;
                                    } else if (var24 < var25) {
                                        var20.method276(var24, true, var24 + 1);
                                        ++var24;
                                    }
                                }
                            } else {
                                var20.method276(this.field306, true, this.field448);
                            }
                            this.field232.method538(251, (byte) 0);
                            this.field232.method575(this.field306, (byte) 64);
                            this.field232.method566(false, var21);
                            this.field232.method574(6, this.field448);
                            this.field232.method575(this.field305, (byte) 64);
                        }
                    } else if ((this.field220 == 1 || this.method94((byte) 5, this.field219 - 1)) && this.field219 > 2) {
                        this.method137((byte) 83);
                    } else if (this.field219 > 0) {
                        this.method82(this.field219 - 1, false);
                    }
                    this.field313 = 10;
                    super.field1052 = 0;
                }
            }
            if (class56.field1417 != -1) {
                int var26 = class56.field1417;
                int var27 = class56.field1418;
                boolean var28 = this.method47(0, field442.field1560[0], field442.field1559[0], 0, 0, true, 0, 349, 0, 0, var27, var26);
                class56.field1417 = -1;
                if (var28) {
                    this.field239 = super.field1053;
                    this.field240 = super.field1054;
                    this.field242 = 1;
                    this.field241 = 0;
                }
            }
            if (super.field1052 == 1 && this.field413 != null) {
                this.field413 = null;
                this.field412 = true;
                super.field1052 = 0;
            }
            this.method101((byte) -126);
            this.method67(this.field545);
            this.method136(13535);
            this.method96((byte) 3);
            int var29 = 69 / arg0;
            if (super.field1045 == 1 || super.field1052 == 1) {
                ++this.field420;
            }
            if (this.field571 == 2) {
                this.method55(this.field363);
            }
            if (this.field571 == 2 && this.field594) {
                this.method63(-973);
            }
            for (int var30 = 0; var30 < 5; ++var30) {
                int var10002 = this.field436[var30]++;
            }
            this.method102(0);
            ++super.field1044;
            if (super.field1044 > 4500) {
                this.field216 = 250;
                super.field1044 -= 500;
                this.field232.method538(204, (byte) 0);
            }
            ++this.field550;
            if (this.field550 > 500) {
                this.field550 = 0;
                int var31 = (int) (Math.random() * 8.0D);
                if ((var31 & 1) == 1) {
                    this.field524 += this.field525;
                }
                if ((var31 & 2) == 2) {
                    this.field440 += this.field441;
                }
                if ((var31 & 4) == 4) {
                    this.field604 += this.field605;
                }
            }
            if (this.field524 < -50) {
                this.field525 = 2;
            }
            if (this.field524 > 50) {
                this.field525 = -2;
            }
            if (this.field440 < -55) {
                this.field441 = 2;
            }
            if (this.field440 > 55) {
                this.field441 = -2;
            }
            if (this.field604 < -40) {
                this.field605 = 1;
            }
            if (this.field604 > 40) {
                this.field605 = -1;
            }
            ++this.field555;
            if (this.field555 > 500) {
                this.field555 = 0;
                int var32 = (int) (Math.random() * 8.0D);
                if ((var32 & 1) == 1) {
                    this.field352 += this.field353;
                }
                if ((var32 & 2) == 2) {
                    this.field256 += this.field257;
                }
            }
            if (this.field352 < -60) {
                this.field353 = 2;
            }
            if (this.field352 > 60) {
                this.field353 = -2;
            }
            if (this.field256 < -20) {
                this.field257 = 1;
            }
            if (this.field256 > 10) {
                this.field257 = -1;
            }
            ++this.field215;
            if (this.field215 > 50) {
                this.field232.method538(236, (byte) 0);
            }
            try {
                if (this.field537 != null && this.field232.field1612 > 0) {
                    this.field537.method401(this.field232.field1612, -632, 0, this.field232.field1611);
                    this.field232.field1612 = 0;
                    this.field215 = 0;
                }
            } catch (IOException var34) {
                this.method85(2317);
            } catch (Exception var35) {
                this.method120(-710);
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(Z)V")
    public final void method31(boolean arg0) {
        if (arg0) {
            this.field213 = this.field558.method549();
        }
        if (this.field219 >= 2 || this.field322 != 0 || this.field454 != 0) {
            String var2;
            if (this.field322 == 1 && this.field219 < 2) {
                var2 = "Use " + this.field326 + " with...";
            } else if (this.field454 == 1 && this.field219 < 2) {
                var2 = this.field457 + "...";
            } else {
                var2 = this.field615[this.field219 - 1];
            }
            if (this.field219 > 2) {
                var2 = var2 + "@whi@ / " + (this.field219 - 2) + " more options";
            }
            this.field410.method391(15, true, 16777215, var2, 4, field345 / 1000, 16830);
        }
    }

    @OriginalMember(owner = "client", name = "run", descriptor = "()V")
    public final void run() {
        if (this.field347) {
            this.method145(false);
        } else {
            super.run();
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(Z)V")
    public final void method32(boolean arg0) {
        ++field623;
        if (arg0) {
            if (field623 > 105) {
                field623 = 0;
                this.field232.method538(199, (byte) 0);
                this.field232.method539(253);
            }
            for (int var2 = 0; var2 < this.field271; ++var2) {
                int var3 = this.field272[var2];
                class10 var4 = this.field270[var3];
                if (var4 != null) {
                    this.method33(-18476, var4.field653.field754, var4);
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IILYOWFBYTG;)V")
    public final void method33(int arg0, int arg1, class67 arg2) {
        if (arg0 != -18476) {
            this.method119();
        }
        if (arg2.field1569 < 128 || arg2.field1570 < 128 || arg2.field1569 >= 13184 || arg2.field1570 >= 13184) {
            arg2.field1575 = -1;
            arg2.field1580 = -1;
            arg2.field1554 = 0;
            arg2.field1555 = 0;
            arg2.field1569 = arg2.field1559[0] * 128 + arg2.field1548 * 64;
            arg2.field1570 = arg2.field1560[0] * 128 + arg2.field1548 * 64;
            arg2.method535(true);
        }
        if (field442 == arg2 && (arg2.field1569 < 1536 || arg2.field1570 < 1536 || arg2.field1569 >= 11776 || arg2.field1570 >= 11776)) {
            arg2.field1575 = -1;
            arg2.field1580 = -1;
            arg2.field1554 = 0;
            arg2.field1555 = 0;
            arg2.field1569 = arg2.field1559[0] * 128 + arg2.field1548 * 64;
            arg2.field1570 = arg2.field1560[0] * 128 + arg2.field1548 * 64;
            arg2.method535(true);
        }
        if (arg2.field1554 > field345) {
            this.method34(true, arg2);
        } else if (arg2.field1555 >= field345) {
            this.method35(153, arg2);
        } else {
            this.method36(arg2, true);
        }
        this.method37(arg2, 9);
        this.method38(arg2, (byte) 86);
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZLYOWFBYTG;)V")
    public final void method34(boolean arg0, class67 arg1) {
        int var3 = arg1.field1554 - field345;
        int var4 = arg1.field1550 * 128 + arg1.field1548 * 64;
        int var5 = arg1.field1552 * 128 + arg1.field1548 * 64;
        if (arg0) {
            arg1.field1569 += (var4 - arg1.field1569) / var3;
            arg1.field1570 += (var5 - arg1.field1570) / var3;
            arg1.field1588 = 0;
            if (arg1.field1556 == 0) {
                arg1.field1562 = 1024;
            }
            if (arg1.field1556 == 1) {
                arg1.field1562 = 1536;
            }
            if (arg1.field1556 == 2) {
                arg1.field1562 = 0;
            }
            if (arg1.field1556 == 3) {
                arg1.field1562 = 512;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILYOWFBYTG;)V")
    public final void method35(int arg0, class67 arg1) {
        if (field345 == arg1.field1555 || arg1.field1575 == -1 || arg1.field1578 != 0 || arg1.field1577 + 1 > class9.field163[arg1.field1575].method23((byte) 2, arg1.field1576)) {
            int var3 = arg1.field1555 - arg1.field1554;
            int var4 = field345 - arg1.field1554;
            int var5 = arg1.field1550 * 128 + arg1.field1548 * 64;
            int var6 = arg1.field1552 * 128 + arg1.field1548 * 64;
            int var7 = arg1.field1551 * 128 + arg1.field1548 * 64;
            int var8 = arg1.field1553 * 128 + arg1.field1548 * 64;
            arg1.field1569 = ((var3 - var4) * var5 + var4 * var7) / var3;
            arg1.field1570 = ((var3 - var4) * var6 + var4 * var8) / var3;
        }
        arg1.field1588 = 0;
        int var9 = 23 / arg0;
        if (arg1.field1556 == 0) {
            arg1.field1562 = 1024;
        }
        if (arg1.field1556 == 1) {
            arg1.field1562 = 1536;
        }
        if (arg1.field1556 == 2) {
            arg1.field1562 = 0;
        }
        if (arg1.field1556 == 3) {
            arg1.field1562 = 512;
        }
        arg1.field1571 = arg1.field1562;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LYOWFBYTG;Z)V")
    public final void method36(class67 arg0, boolean arg1) {
        arg0.field1572 = arg0.field1586;
        if (arg0.field1563 == 0) {
            arg0.field1588 = 0;
        } else {
            if (arg0.field1575 != -1 && arg0.field1578 == 0) {
                class9 var3 = class9.field163[arg0.field1575];
                if (arg0.field1540 > 0 && var3.field175 == 0) {
                    ++arg0.field1588;
                    return;
                }
                if (arg0.field1540 <= 0 && var3.field176 == 0) {
                    ++arg0.field1588;
                    return;
                }
            }
            int var4 = arg0.field1569;
            int var5 = arg0.field1570;
            this.field619 &= arg1;
            int var6 = arg0.field1559[arg0.field1563 - 1] * 128 + arg0.field1548 * 64;
            int var7 = arg0.field1560[arg0.field1563 - 1] * 128 + arg0.field1548 * 64;
            if (var6 - var4 <= 256 && var6 - var4 >= -256 && var7 - var5 <= 256 && var7 - var5 >= -256) {
                if (var4 < var6) {
                    if (var5 < var7) {
                        arg0.field1562 = 1280;
                    } else if (var5 > var7) {
                        arg0.field1562 = 1792;
                    } else {
                        arg0.field1562 = 1536;
                    }
                } else if (var4 > var6) {
                    if (var5 < var7) {
                        arg0.field1562 = 768;
                    } else if (var5 > var7) {
                        arg0.field1562 = 256;
                    } else {
                        arg0.field1562 = 512;
                    }
                } else if (var5 < var7) {
                    arg0.field1562 = 1024;
                } else {
                    arg0.field1562 = 0;
                }
                int var8 = arg0.field1562 - arg0.field1571 & 2047;
                if (var8 > 1024) {
                    var8 -= 2048;
                }
                int var9 = arg0.field1566;
                if (var8 >= -256 && var8 <= 256) {
                    var9 = arg0.field1565;
                } else if (var8 >= 256 && var8 < 768) {
                    var9 = arg0.field1568;
                } else if (var8 >= -768 && var8 <= -256) {
                    var9 = arg0.field1567;
                }
                if (var9 == -1) {
                    var9 = arg0.field1565;
                }
                arg0.field1572 = var9;
                int var10 = 4;
                if (arg0.field1571 != arg0.field1562 && arg0.field1590 == -1 && arg0.field1561 != 0) {
                    var10 = 2;
                }
                if (arg0.field1563 > 2) {
                    var10 = 6;
                }
                if (arg0.field1563 > 3) {
                    var10 = 8;
                }
                if (arg0.field1588 > 0 && arg0.field1563 > 1) {
                    var10 = 8;
                    --arg0.field1588;
                }
                if (arg0.field1589[arg0.field1563 - 1]) {
                    var10 <<= 1;
                }
                if (var10 >= 8 && arg0.field1572 == arg0.field1565 && arg0.field1557 != -1) {
                    arg0.field1572 = arg0.field1557;
                }
                if (var4 < var6) {
                    arg0.field1569 += var10;
                    if (arg0.field1569 > var6) {
                        arg0.field1569 = var6;
                    }
                } else if (var4 > var6) {
                    arg0.field1569 -= var10;
                    if (arg0.field1569 < var6) {
                        arg0.field1569 = var6;
                    }
                }
                if (var5 < var7) {
                    arg0.field1570 += var10;
                    if (arg0.field1570 > var7) {
                        arg0.field1570 = var7;
                    }
                } else if (var5 > var7) {
                    arg0.field1570 -= var10;
                    if (arg0.field1570 < var7) {
                        arg0.field1570 = var7;
                    }
                }
                if (arg0.field1569 == var6 && arg0.field1570 == var7) {
                    --arg0.field1563;
                    if (arg0.field1540 > 0) {
                        --arg0.field1540;
                        return;
                    }
                }
            } else {
                arg0.field1569 = var6;
                arg0.field1570 = var7;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LYOWFBYTG;I)V")
    public final void method37(class67 arg0, int arg1) {
        if (arg1 < 9 || arg1 > 9) {
            this.field232.method539(231);
        }
        if (arg0.field1561 != 0) {
            if (arg0.field1590 != -1 && arg0.field1590 < 32768) {
                class10 var3 = this.field270[arg0.field1590];
                if (var3 != null) {
                    int var4 = arg0.field1569 - var3.field1569;
                    int var5 = arg0.field1570 - var3.field1570;
                    if (var4 != 0 || var5 != 0) {
                        arg0.field1562 = (int) (Math.atan2((double) var4, (double) var5) * 325.949D) & 2047;
                    }
                }
            }
            if (arg0.field1590 >= 32768) {
                int var6 = arg0.field1590 - 32768;
                if (this.field279 == var6) {
                    var6 = this.field481;
                }
                class1 var7 = this.field482[var6];
                if (var7 != null) {
                    int var8 = arg0.field1569 - var7.field1569;
                    int var9 = arg0.field1570 - var7.field1570;
                    if (var8 != 0 || var9 != 0) {
                        arg0.field1562 = (int) (Math.atan2((double) var8, (double) var9) * 325.949D) & 2047;
                    }
                }
            }
            if ((arg0.field1542 != 0 || arg0.field1543 != 0) && (arg0.field1563 == 0 || arg0.field1588 > 0)) {
                int var10 = arg0.field1569 - (arg0.field1542 - this.field248 - this.field248) * 64;
                int var11 = arg0.field1570 - (arg0.field1543 - this.field249 - this.field249) * 64;
                if (var10 != 0 || var11 != 0) {
                    arg0.field1562 = (int) (Math.atan2((double) var10, (double) var11) * 325.949D) & 2047;
                }
                arg0.field1542 = 0;
                arg0.field1543 = 0;
            }
            int var12 = arg0.field1562 - arg0.field1571 & 2047;
            if (var12 != 0) {
                if (var12 >= arg0.field1561 && var12 <= 2048 - arg0.field1561) {
                    if (var12 > 1024) {
                        arg0.field1571 -= arg0.field1561;
                    } else {
                        arg0.field1571 += arg0.field1561;
                    }
                } else {
                    arg0.field1571 = arg0.field1562;
                }
                arg0.field1571 &= 2047;
                if (arg0.field1586 == arg0.field1572 && arg0.field1571 != arg0.field1562) {
                    if (arg0.field1587 != -1) {
                        arg0.field1572 = arg0.field1587;
                        return;
                    }
                    arg0.field1572 = arg0.field1565;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LYOWFBYTG;B)V")
    public final void method38(class67 arg0, byte arg1) {
        if (arg1 != 86) {
            this.method119();
        }
        arg0.field1535 = false;
        if (arg0.field1572 != -1) {
            class9 var3 = class9.field163[arg0.field1572];
            ++arg0.field1574;
            if (arg0.field1573 < var3.field164 && arg0.field1574 > var3.method23((byte) 2, arg0.field1573)) {
                arg0.field1574 = 0;
                ++arg0.field1573;
            }
            if (arg0.field1573 >= var3.field164) {
                arg0.field1574 = 0;
                arg0.field1573 = 0;
            }
        }
        if (arg0.field1580 != -1 && field345 >= arg0.field1583) {
            if (arg0.field1581 < 0) {
                arg0.field1581 = 0;
            }
            class9 var4 = class27.field847[arg0.field1580].field851;
            ++arg0.field1582;
            while (arg0.field1581 < var4.field164 && arg0.field1582 > var4.method23((byte) 2, arg0.field1581)) {
                arg0.field1582 -= var4.method23((byte) 2, arg0.field1581);
                ++arg0.field1581;
            }
            if (arg0.field1581 >= var4.field164 && (arg0.field1581 < 0 || arg0.field1581 >= var4.field164)) {
                arg0.field1580 = -1;
            }
        }
        if (arg0.field1575 != -1 && arg0.field1578 <= 1) {
            class9 var5 = class9.field163[arg0.field1575];
            if (var5.field175 == 1 && arg0.field1540 > 0 && arg0.field1554 <= field345 && arg0.field1555 < field345) {
                arg0.field1578 = 1;
                return;
            }
        }
        if (arg0.field1575 != -1 && arg0.field1578 == 0) {
            class9 var6 = class9.field163[arg0.field1575];
            ++arg0.field1577;
            while (arg0.field1576 < var6.field164 && arg0.field1577 > var6.method23((byte) 2, arg0.field1576)) {
                arg0.field1577 -= var6.method23((byte) 2, arg0.field1576);
                ++arg0.field1576;
            }
            if (arg0.field1576 >= var6.field164) {
                arg0.field1576 -= var6.field168;
                ++arg0.field1579;
                if (arg0.field1579 >= var6.field174) {
                    arg0.field1575 = -1;
                }
                if (arg0.field1576 < 0 || arg0.field1576 >= var6.field164) {
                    arg0.field1575 = -1;
                }
            }
            arg0.field1535 = var6.field170;
        }
        if (arg0.field1578 > 0) {
            --arg0.field1578;
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(B)V")
    public final void method39(byte arg0) {
        if (this.field556) {
            this.field556 = false;
            this.field425.method373(4, 0, super.field1038, 0);
            this.field426.method373(357, 0, super.field1038, 0);
            this.field427.method373(4, 0, super.field1038, 722);
            this.field428.method373(205, 0, super.field1038, 743);
            this.field429.method373(0, 0, super.field1038, 0);
            this.field430.method373(4, 0, super.field1038, 516);
            this.field431.method373(205, 0, super.field1038, 516);
            this.field432.method373(357, 0, super.field1038, 496);
            this.field433.method373(338, 0, super.field1038, 0);
            this.field189 = true;
            this.field412 = true;
            this.field339 = true;
            this.field181 = true;
            if (this.field571 != 2) {
                this.field225.method373(4, 0, super.field1038, 4);
                this.field224.method373(4, 0, super.field1038, 550);
            }
        }
        if (this.field571 == 2) {
            this.method149((byte) 105);
        }
        if (this.field385 && this.field261 == 1) {
            this.field189 = true;
        }
        if (this.field435 != -1) {
            boolean var2 = this.method42(this.field539, this.field329, this.field435);
            if (var2) {
                this.field189 = true;
            }
        }
        if (this.field316 == 2) {
            this.field189 = true;
        }
        if (this.field307 == 2) {
            this.field189 = true;
        }
        if (this.field189) {
            this.method52(6);
            this.field189 = false;
        }
        if (this.field606 == -1) {
            this.field183.field889 = this.field294 - this.field618 - 77;
            if (super.field1046 > 448 && super.field1046 < 560 && super.field1047 > 332) {
                this.method103(0, super.field1047 - 357, this.field294, false, this.field183, 463, this.field572, 77, super.field1046 - 17);
            }
            int var3 = this.field294 - 77 - this.field183.field889;
            if (var3 < 0) {
                var3 = 0;
            }
            if (var3 > this.field294 - 77) {
                var3 = this.field294 - 77;
            }
            if (this.field618 != var3) {
                this.field618 = var3;
                this.field412 = true;
            }
            ++field348;
            if (field348 > 88) {
                field348 = 0;
                this.field232.method538(8, (byte) 0);
            }
        }
        if (this.field606 != -1) {
            boolean var4 = this.method42(this.field539, this.field329, this.field606);
            if (var4) {
                this.field412 = true;
            }
        }
        if (this.field316 == 3) {
            this.field412 = true;
        }
        if (this.field307 == 3) {
            this.field412 = true;
        }
        if (this.field413 != null) {
            this.field412 = true;
        }
        if (this.field385 && this.field261 == 2) {
            this.field412 = true;
        }
        if (this.field412) {
            this.method160((byte) 1);
            this.field412 = false;
        }
        if (this.field571 == 2) {
            this.method106(-158);
            this.field224.method373(4, 0, super.field1038, 550);
        }
        if (this.field390 != -1) {
            this.field339 = true;
        }
        if (this.field339) {
            if (this.field390 != -1 && this.field649 == this.field390) {
                this.field390 = -1;
                this.field232.method538(139, (byte) 0);
                this.field232.method539(this.field649);
            }
            this.field339 = false;
            this.field282.method372(0);
            this.field576.method192(0, 0, 49598);
            if (this.field435 == -1) {
                if (this.field540[this.field649] != -1) {
                    if (this.field649 == 0) {
                        this.field462.method192(10, 22, 49598);
                    }
                    if (this.field649 == 1) {
                        this.field463.method192(8, 54, 49598);
                    }
                    if (this.field649 == 2) {
                        this.field463.method192(8, 82, 49598);
                    }
                    if (this.field649 == 3) {
                        this.field464.method192(8, 110, 49598);
                    }
                    if (this.field649 == 4) {
                        this.field466.method192(8, 153, 49598);
                    }
                    if (this.field649 == 5) {
                        this.field466.method192(8, 181, 49598);
                    }
                    if (this.field649 == 6) {
                        this.field465.method192(9, 209, 49598);
                    }
                }
                if (this.field540[0] != -1 && (this.field390 != 0 || field345 % 20 < 10)) {
                    this.field283[0].method192(13, 29, 49598);
                }
                if (this.field540[1] != -1 && (this.field390 != 1 || field345 % 20 < 10)) {
                    this.field283[1].method192(11, 53, 49598);
                }
                if (this.field540[2] != -1 && (this.field390 != 2 || field345 % 20 < 10)) {
                    this.field283[2].method192(11, 82, 49598);
                }
                if (this.field540[3] != -1 && (this.field390 != 3 || field345 % 20 < 10)) {
                    this.field283[3].method192(12, 115, 49598);
                }
                if (this.field540[4] != -1 && (this.field390 != 4 || field345 % 20 < 10)) {
                    this.field283[4].method192(13, 153, 49598);
                }
                if (this.field540[5] != -1 && (this.field390 != 5 || field345 % 20 < 10)) {
                    this.field283[5].method192(11, 180, 49598);
                }
                if (this.field540[6] != -1 && (this.field390 != 6 || field345 % 20 < 10)) {
                    this.field283[6].method192(13, 208, 49598);
                }
            }
            this.field282.method373(160, 0, super.field1038, 516);
            this.field281.method372(0);
            this.field575.method192(0, 0, 49598);
            if (this.field435 == -1) {
                if (this.field540[this.field649] != -1) {
                    if (this.field649 == 7) {
                        this.field475.method192(0, 42, 49598);
                    }
                    if (this.field649 == 8) {
                        this.field476.method192(0, 74, 49598);
                    }
                    if (this.field649 == 9) {
                        this.field476.method192(0, 102, 49598);
                    }
                    if (this.field649 == 10) {
                        this.field477.method192(1, 130, 49598);
                    }
                    if (this.field649 == 11) {
                        this.field479.method192(0, 173, 49598);
                    }
                    if (this.field649 == 12) {
                        this.field479.method192(0, 201, 49598);
                    }
                    if (this.field649 == 13) {
                        this.field478.method192(0, 229, 49598);
                    }
                }
                if (this.field540[8] != -1 && (this.field390 != 8 || field345 % 20 < 10)) {
                    this.field283[7].method192(2, 74, 49598);
                }
                if (this.field540[9] != -1 && (this.field390 != 9 || field345 % 20 < 10)) {
                    this.field283[8].method192(3, 102, 49598);
                }
                if (this.field540[10] != -1 && (this.field390 != 10 || field345 % 20 < 10)) {
                    this.field283[9].method192(4, 137, 49598);
                }
                if (this.field540[11] != -1 && (this.field390 != 11 || field345 % 20 < 10)) {
                    this.field283[10].method192(2, 174, 49598);
                }
                if (this.field540[12] != -1 && (this.field390 != 12 || field345 % 20 < 10)) {
                    this.field283[11].method192(2, 201, 49598);
                }
                if (this.field540[13] != -1 && (this.field390 != 13 || field345 % 20 < 10)) {
                    this.field283[12].method192(2, 226, 49598);
                }
            }
            this.field281.method373(466, 0, super.field1038, 496);
            this.field225.method372(0);
        }
        if (this.field181) {
            this.field181 = false;
            this.field280.method372(0);
            this.field574.method192(0, 0, 49598);
            this.field409.method383(28, 16777215, 55, true, "Public chat", 6);
            if (this.field628 == 0) {
                this.field409.method383(41, 65280, 55, true, "On", 6);
            }
            if (this.field628 == 1) {
                this.field409.method383(41, 16776960, 55, true, "Friends", 6);
            }
            if (this.field628 == 2) {
                this.field409.method383(41, 16711680, 55, true, "Off", 6);
            }
            if (this.field628 == 3) {
                this.field409.method383(41, 65535, 55, true, "Hide", 6);
            }
            this.field409.method383(28, 16777215, 184, true, "Private chat", 6);
            if (this.field612 == 0) {
                this.field409.method383(41, 65280, 184, true, "On", 6);
            }
            if (this.field612 == 1) {
                this.field409.method383(41, 16776960, 184, true, "Friends", 6);
            }
            if (this.field612 == 2) {
                this.field409.method383(41, 16711680, 184, true, "Off", 6);
            }
            this.field409.method383(28, 16777215, 324, true, "Trade/compete", 6);
            if (this.field357 == 0) {
                this.field409.method383(41, 65280, 324, true, "On", 6);
            }
            if (this.field357 == 1) {
                this.field409.method383(41, 16776960, 324, true, "Friends", 6);
            }
            if (this.field357 == 2) {
                this.field409.method383(41, 16711680, 324, true, "Off", 6);
            }
            this.field409.method383(33, 16777215, 458, true, "Report abuse", 6);
            this.field280.method373(453, 0, super.field1038, 0);
            this.field225.method372(0);
        }
        this.field329 = 0;
        if (arg0 != 9) {
            this.field614 = null;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(B)V")
    public final void method40(byte arg0) {
        if (this.field218 == arg0) {
            boolean var2 = false;
        } else {
            this.method119();
        }
        if (!this.field471 && !this.field399 && !this.field541) {
            ++field345;
            if (!this.field619) {
                this.method53(49602);
            } else {
                this.method30(93);
            }
            this.method138(-40545);
        }
    }

    @OriginalMember(owner = "client", name = "j", descriptor = "(I)V")
    public final void method41(int arg0) {
        class25 var2 = (class25) this.field362.method528();
        if (arg0 >= 0) {
            for (int var3 = 1; var3 > 0; ++var3) {
            }
        }
        while (var2 != null) {
            if (this.field494 == var2.field835 && !var2.field833) {
                if (field345 >= var2.field832) {
                    var2.method230(-2273, this.field329);
                    if (var2.field833) {
                        var2.method589();
                    } else {
                        this.field585.method468(var2.field837, false, var2.field838, var2.field836, -1, 48192, var2.field835, var2, 0, 60);
                    }
                }
            } else {
                var2.method589();
            }
            var2 = (class25) this.field362.method530(false);
        }
    }

    @OriginalMember(owner = "client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        try {
            System.out.println("RS2 user client - release #" + 315);
            if (arg0.length != 5) {
                System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
            } else {
                field235 = Integer.parseInt(arg0[0]);
                field236 = Integer.parseInt(arg0[1]);
                if (arg0[2].equals("lowmem")) {
                    method25(1);
                } else {
                    if (!arg0[2].equals("highmem")) {
                        System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
                        return;
                    }
                    method127(false);
                }
                if (arg0[3].equals("free")) {
                    field237 = false;
                } else {
                    if (!arg0[3].equals("members")) {
                        System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
                        return;
                    }
                    field237 = true;
                }
                signlink.storeid = Integer.parseInt(arg0[4]);
                signlink.startpriv(InetAddress.getLocalHost());
                client var1 = new client();
                var1.method333(503, (byte) 9, 765);
            }
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(III)Z")
    public final boolean method42(int arg0, int arg1, int arg2) {
        this.field212 += arg0;
        boolean var4 = false;
        class29 var5 = class29.field895[arg2];
        for (int var6 = 0; var6 < var5.field929.length && var5.field929[var6] != -1; ++var6) {
            class29 var7 = class29.field895[var5.field929[var6]];
            if (var7.field909 == 1) {
                var4 |= this.method42(this.field539, arg1, var7.field884);
            }
            if (var7.field909 == 6 && (var7.field893 != -1 || var7.field894 != -1)) {
                boolean var8 = this.method87((byte) 114, var7);
                int var9;
                if (var8) {
                    var9 = var7.field894;
                } else {
                    var9 = var7.field893;
                }
                if (var9 != -1) {
                    class9 var10 = class9.field163[var9];
                    var7.field920 += arg1;
                    while (var7.field920 > var10.method23((byte) 2, var7.field936)) {
                        var7.field920 -= var10.method23((byte) 2, var7.field936) + 1;
                        ++var7.field936;
                        if (var7.field936 >= var10.field164) {
                            var7.field936 -= var10.field168;
                            if (var7.field936 < 0 || var7.field936 >= var10.field164) {
                                var7.field936 = 0;
                            }
                        }
                        var4 = true;
                    }
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(Z)Z")
    public final boolean method43(boolean arg0) {
        if (!arg0) {
            this.field213 = -1;
        }
        return signlink.wavereplay();
    }

    @OriginalMember(owner = "client", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        if (signlink.mainapp != null) {
            return signlink.mainapp.getCodeBase();
        } else {
            try {
                if (super.field1041 != null) {
                    return new URL("http://127.0.0.1:" + (field236 + 80));
                }
            } catch (Exception var1) {
            }
            return super.getCodeBase();
        }
    }

    @OriginalMember(owner = "client", name = "k", descriptor = "(I)V")
    public void method44(int arg0) {
        System.out.println("============");
        this.field212 += arg0;
        System.out.println("flame-cycle:" + this.field543);
        if (this.field520 != null) {
            System.out.println("Od-cycle:" + this.field520.field1334);
        }
        System.out.println("loop-cycle:" + field345);
        System.out.println("draw-cycle:" + field495);
        System.out.println("ptype:" + this.field213);
        System.out.println("psize:" + this.field212);
        if (this.field537 != null) {
            this.field537.method402(0);
        }
        super.field1035 = true;
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(I)Ljava/awt/Component;")
    public final Component method45(int arg0) {
        while (arg0 >= 0) {
            this.field614 = null;
        }
        if (signlink.mainapp != null) {
            return signlink.mainapp;
        } else if (super.field1041 != null) {
            return super.field1041;
        } else {
            return this;
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(B)V")
    public final void method46(byte arg0) {
        this.field434 = true;
        for (int var2 = 0; var2 < 7; ++var2) {
            this.field597[var2] = -1;
            for (int var4 = 0; var4 < class60.field1470; ++var4) {
                if (!class60.field1471[var4].field1477 && class60.field1471[var4].field1472 == var2 + (this.field246 ? 0 : 7)) {
                    this.field597[var2] = var4;
                    break;
                }
            }
        }
        if (arg0 == 2) {
            boolean var3 = false;
        } else {
            this.field601 = !this.field601;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIIZIIIIII)Z")
    public final boolean method47(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        byte var13 = 104;
        byte var14 = 104;
        for (int var15 = 0; var15 < var13; ++var15) {
            for (int var36 = 0; var36 < var14; ++var36) {
                this.field565[var15][var36] = 0;
                this.field405[var15][var36] = 99999999;
            }
        }
        int var16 = arg2;
        int var17 = arg1;
        this.field565[arg2][arg1] = 99;
        this.field405[arg2][arg1] = 0;
        byte var18 = 0;
        int var19 = 0;
        this.field243[var18] = arg2;
        int var37 = var18 + 1;
        this.field244[var18] = arg1;
        boolean var20 = false;
        int var21 = this.field243.length;
        int[][] var22 = this.field391[this.field494].field813;
        while (var37 != var19) {
            var16 = this.field243[var19];
            var17 = this.field244[var19];
            var19 = (var19 + 1) % var21;
            if (arg11 == var16 && arg10 == var17) {
                var20 = true;
                break;
            }
            if (arg0 != 0) {
                if ((arg0 < 5 || arg0 == 10) && this.field391[this.field494].method224(arg9, arg10, var17, arg11, (byte) 8, arg0 - 1, var16)) {
                    var20 = true;
                    break;
                }
                if (arg0 < 10 && this.field391[this.field494].method225(arg11, arg10, 40519, var17, arg0 - 1, arg9, var16)) {
                    var20 = true;
                    break;
                }
            }
            if (arg4 != 0 && arg8 != 0 && this.field391[this.field494].method226(var16, arg3, arg11, arg4, var17, (byte) 6, arg10, arg8)) {
                var20 = true;
                break;
            }
            int var35 = this.field405[var16][var17] + 1;
            if (var16 > 0 && this.field565[var16 - 1][var17] == 0 && (var22[var16 - 1][var17] & 19398920) == 0) {
                this.field243[var37] = var16 - 1;
                this.field244[var37] = var17;
                var37 = (var37 + 1) % var21;
                this.field565[var16 - 1][var17] = 2;
                this.field405[var16 - 1][var17] = var35;
            }
            if (var16 < var13 - 1 && this.field565[var16 + 1][var17] == 0 && (var22[var16 + 1][var17] & 19399040) == 0) {
                this.field243[var37] = var16 + 1;
                this.field244[var37] = var17;
                var37 = (var37 + 1) % var21;
                this.field565[var16 + 1][var17] = 8;
                this.field405[var16 + 1][var17] = var35;
            }
            if (var17 > 0 && this.field565[var16][var17 - 1] == 0 && (var22[var16][var17 - 1] & 19398914) == 0) {
                this.field243[var37] = var16;
                this.field244[var37] = var17 - 1;
                var37 = (var37 + 1) % var21;
                this.field565[var16][var17 - 1] = 1;
                this.field405[var16][var17 - 1] = var35;
            }
            if (var17 < var14 - 1 && this.field565[var16][var17 + 1] == 0 && (var22[var16][var17 + 1] & 19398944) == 0) {
                this.field243[var37] = var16;
                this.field244[var37] = var17 + 1;
                var37 = (var37 + 1) % var21;
                this.field565[var16][var17 + 1] = 4;
                this.field405[var16][var17 + 1] = var35;
            }
            if (var16 > 0 && var17 > 0 && this.field565[var16 - 1][var17 - 1] == 0 && (var22[var16 - 1][var17 - 1] & 19398926) == 0 && (var22[var16 - 1][var17] & 19398920) == 0 && (var22[var16][var17 - 1] & 19398914) == 0) {
                this.field243[var37] = var16 - 1;
                this.field244[var37] = var17 - 1;
                var37 = (var37 + 1) % var21;
                this.field565[var16 - 1][var17 - 1] = 3;
                this.field405[var16 - 1][var17 - 1] = var35;
            }
            if (var16 < var13 - 1 && var17 > 0 && this.field565[var16 + 1][var17 - 1] == 0 && (var22[var16 + 1][var17 - 1] & 19399043) == 0 && (var22[var16 + 1][var17] & 19399040) == 0 && (var22[var16][var17 - 1] & 19398914) == 0) {
                this.field243[var37] = var16 + 1;
                this.field244[var37] = var17 - 1;
                var37 = (var37 + 1) % var21;
                this.field565[var16 + 1][var17 - 1] = 9;
                this.field405[var16 + 1][var17 - 1] = var35;
            }
            if (var16 > 0 && var17 < var14 - 1 && this.field565[var16 - 1][var17 + 1] == 0 && (var22[var16 - 1][var17 + 1] & 19398968) == 0 && (var22[var16 - 1][var17] & 19398920) == 0 && (var22[var16][var17 + 1] & 19398944) == 0) {
                this.field243[var37] = var16 - 1;
                this.field244[var37] = var17 + 1;
                var37 = (var37 + 1) % var21;
                this.field565[var16 - 1][var17 + 1] = 6;
                this.field405[var16 - 1][var17 + 1] = var35;
            }
            if (var16 < var13 - 1 && var17 < var14 - 1 && this.field565[var16 + 1][var17 + 1] == 0 && (var22[var16 + 1][var17 + 1] & 19399136) == 0 && (var22[var16 + 1][var17] & 19399040) == 0 && (var22[var16][var17 + 1] & 19398944) == 0) {
                this.field243[var37] = var16 + 1;
                this.field244[var37] = var17 + 1;
                var37 = (var37 + 1) % var21;
                this.field565[var16 + 1][var17 + 1] = 12;
                this.field405[var16 + 1][var17 + 1] = var35;
            }
        }
        this.field185 = 0;
        if (!var20) {
            if (arg5) {
                int var23 = 100;
                for (int var24 = 1; var24 < 2; ++var24) {
                    for (int var25 = arg11 - var24; var25 <= arg11 + var24; ++var25) {
                        for (int var26 = arg10 - var24; var26 <= arg10 + var24; ++var26) {
                            if (var25 >= 0 && var26 >= 0 && var25 < 104 && var26 < 104 && this.field405[var25][var26] < var23) {
                                var23 = this.field405[var25][var26];
                                var16 = var25;
                                var17 = var26;
                                this.field185 = 1;
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
        this.field243[var27] = var16;
        int var38 = var27 + 1;
        this.field244[var27] = var17;
        int var28 = 50 / arg7;
        int var29;
        int var30 = var29 = this.field565[var16][var17];
        while (arg2 != var16 || arg1 != var17) {
            if (var29 != var30) {
                var29 = var30;
                this.field243[var38] = var16;
                this.field244[var38++] = var17;
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
            var30 = this.field565[var16][var17];
        }
        if (var38 <= 0) {
            if (arg6 == 1) {
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
            int var32 = this.field243[var38];
            int var33 = this.field244[var38];
            if (arg6 == 0) {
                this.field232.method538(61, (byte) 0);
                this.field232.method539(var31 + var31 + 3);
            }
            if (arg6 == 1) {
                this.field232.method538(220, (byte) 0);
                this.field232.method539(var31 + var31 + 3 + 14);
            }
            if (arg6 == 2) {
                this.field232.method538(21, (byte) 0);
                this.field232.method539(var31 + var31 + 3);
            }
            this.field232.method540(this.field248 + var32);
            this.field232.method567(super.field1056[5] == 1 ? 1 : 0, 305);
            this.field394 = this.field243[0];
            this.field395 = this.field244[0];
            for (int var34 = 1; var34 < var31; ++var34) {
                --var38;
                this.field232.method567(this.field243[var38] - var32, 305);
                this.field232.method539(this.field244[var38] - var33);
            }
            this.field232.method540(this.field249 + var33);
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IZILDYPVESKW;)V")
    public final void method48(int arg0, boolean arg1, int arg2, class14 arg3) {
        int var5 = arg0 * arg0 + arg2 * arg2;
        if (!arg1) {
            this.field614 = null;
        }
        if (var5 > 4225 && var5 < 90000) {
            int var6 = this.field528 + this.field352 & 2047;
            int var7 = class39.field1169[var6];
            int var8 = class39.field1170[var6];
            int var9 = var7 * 256 / (this.field256 + 256);
            int var10 = var8 * 256 / (this.field256 + 256);
            int var11 = arg0 * var10 + arg2 * var9 >> 16;
            int var12 = arg2 * var10 - arg0 * var9 >> 16;
            double var13 = Math.atan2((double) var11, (double) var12);
            int var15 = (int) (Math.sin(var13) * 63.0D);
            int var16 = (int) (Math.cos(var13) * 57.0D);
            this.field603.method184(20, 20, 15, 15, 256, -485, 83 - var16 - 20, var15 + 94 + 4 - 10, var13);
        } else {
            this.method83(arg2, arg0, (byte) -94, arg3);
        }
    }

    @OriginalMember(owner = "client", name = "init", descriptor = "()V")
    public final void init() {
        field235 = Integer.parseInt(this.getParameter("nodeid"));
        field236 = Integer.parseInt(this.getParameter("portoff"));
        String var1 = this.getParameter("lowmem");
        if (var1 != null && var1.equals("1")) {
            method25(1);
        } else {
            method127(false);
        }
        String var2 = this.getParameter("free");
        if (var2 != null && var2.equals("1")) {
            field237 = false;
        } else {
            field237 = true;
        }
        this.method334(765, 503, (byte) -61);
    }

    @OriginalMember(owner = "client", name = "l", descriptor = "(I)V")
    public final void method49(int arg0) {
        Graphics var2 = this.method45(-33).getGraphics();
        var2.setColor(Color.black);
        var2.fillRect(0, 0, 765, 503);
        this.method336(true, 1);
        int var3 = 7 / arg0;
        if (this.field399) {
            this.field521 = false;
            var2.setFont(new Font("Helvetica", 1, 16));
            var2.setColor(Color.yellow);
            byte var4 = 35;
            var2.drawString("Sorry, an error has occured whilst loading RuneScape", 30, var4);
            int var6 = var4 + 50;
            var2.setColor(Color.white);
            var2.drawString("To fix this try the following (in order):", 30, var6);
            int var7 = var6 + 50;
            var2.setColor(Color.white);
            var2.setFont(new Font("Helvetica", 1, 12));
            var2.drawString("1: Try closing ALL open web-browser windows, and reloading", 30, var7);
            int var8 = var7 + 30;
            var2.drawString("2: Try clearing your web-browsers cache from tools->internet options", 30, var8);
            int var9 = var8 + 30;
            var2.drawString("3: Try using a different game-world", 30, var9);
            int var11 = var9 + 30;
            var2.drawString("4: Try rebooting your computer", 30, var11);
            int var13 = var11 + 30;
            var2.drawString("5: Try selecting a different version of Java from the play-game menu", 30, var13);
        }
        if (this.field541) {
            this.field521 = false;
            var2.setFont(new Font("Helvetica", 1, 20));
            var2.setColor(Color.white);
            var2.drawString("Error - unable to load game!", 50, 50);
            var2.drawString("To play RuneScape make sure you play from", 50, 100);
            var2.drawString("http://www.runescape.com", 50, 150);
        }
        if (this.field471) {
            this.field521 = false;
            var2.setColor(Color.yellow);
            byte var5 = 35;
            var2.drawString("Error a copy of RuneScape already appears to be loaded", 30, var5);
            int var10 = var5 + 50;
            var2.setColor(Color.white);
            var2.drawString("To fix this try the following (in order):", 30, var10);
            int var12 = var10 + 50;
            var2.setColor(Color.white);
            var2.setFont(new Font("Helvetica", 1, 12));
            var2.drawString("1: Try closing ALL open web-browser windows, and reloading", 30, var12);
            int var14 = var12 + 30;
            var2.drawString("2: Try rebooting your computer, and reloading", 30, var14);
            int var15 = var14 + 30;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IBLYOXDZEVD;)V")
    public final void method50(int arg0, byte arg1, class68 arg2) {
        if (arg1 != -60) {
            this.field539 = -358;
        }
        if (arg0 == 89) {
            int var4 = arg2.method549();
            int var5 = (var4 >> 4 & 7) + this.field327;
            int var6 = (var4 & 7) + this.field328;
            int var7 = arg2.method551();
            int var8 = arg2.method551();
            int var9 = arg2.method551();
            if (var5 >= 0 && var6 >= 0 && var5 < 104 && var6 < 104) {
                class65 var10 = this.field614[this.field494][var5][var6];
                if (var10 != null) {
                    for (class44 var11 = (class44) var10.method528(); var11 != null; var11 = (class44) var10.method530(false)) {
                        if ((var7 & 32767) == var11.field1196 && var11.field1195 == var8) {
                            var11.field1195 = var9;
                            break;
                        }
                    }
                    this.method99(var5, var6);
                }
            }
        } else {
            if (arg0 == 178) {
                int var12 = arg2.method549();
                int var13 = (var12 >> 4 & 7) + this.field327;
                int var14 = (var12 & 7) + this.field328;
                int var15 = arg2.method551();
                int var16 = arg2.method549();
                int var17 = var16 >> 4 & 15;
                int var18 = var16 & 7;
                if (field442.field1559[0] >= var13 - var17 && field442.field1559[0] <= var13 + var17 && field442.field1560[0] >= var14 - var17 && field442.field1560[0] <= var14 + var17 && this.field247 && !field238 && this.field387 < 50) {
                    this.field180[this.field387] = var15;
                    this.field417[this.field387] = var18;
                    this.field488[this.field387] = class12.field670[var15];
                    ++this.field387;
                }
            }
            if (arg0 == 62) {
                int var19 = arg2.method549();
                int var20 = var19 >> 2;
                int var21 = var19 & 3;
                int var22 = this.field193[var20];
                byte var23 = arg2.method571(false);
                byte var24 = arg2.method572(-608);
                int var25 = arg2.method576(-113);
                int var26 = arg2.method549();
                int var27 = (var26 >> 4 & 7) + this.field327;
                int var28 = (var26 & 7) + this.field328;
                int var29 = arg2.method576(-113);
                byte var30 = arg2.method550();
                int var31 = arg2.method576(-113);
                byte var32 = arg2.method572(-608);
                int var33 = arg2.method578(false);
                class1 var34;
                if (this.field279 == var29) {
                    var34 = field442;
                } else {
                    var34 = this.field482[var29];
                }
                if (var34 != null) {
                    class48 var35 = class48.method410(var31);
                    int var36 = this.field377[this.field494][var27][var28];
                    int var37 = this.field377[this.field494][var27 + 1][var28];
                    int var38 = this.field377[this.field494][var27 + 1][var28 + 1];
                    int var39 = this.field377[this.field494][var27][var28 + 1];
                    class39 var40 = var35.method405(var20, var21, var36, var37, var38, var39, -1);
                    if (var40 != null) {
                        this.method154(this.field231, var22, 0, this.field494, var28, var33 + 1, 0, var27, var25 + 1, -1);
                        var34.field23 = field345 + var33;
                        var34.field24 = field345 + var25;
                        var34.field12 = var40;
                        int var41 = var35.field1289;
                        int var42 = var35.field1255;
                        if (var21 == 1 || var21 == 3) {
                            var41 = var35.field1255;
                            var42 = var35.field1289;
                        }
                        var34.field9 = var27 * 128 + var41 * 64;
                        var34.field11 = var28 * 128 + var42 * 64;
                        var34.field10 = this.method81(0, var34.field11, this.field494, var34.field9);
                        if (var23 > var32) {
                            byte var43 = var23;
                            var23 = var32;
                            var32 = var43;
                        }
                        if (var30 > var24) {
                            byte var44 = var30;
                            var30 = var24;
                            var24 = var44;
                        }
                        var34.field19 = var23 + var27;
                        var34.field21 = var27 + var32;
                        var34.field20 = var28 + var30;
                        var34.field22 = var24 + var28;
                    }
                }
            }
            if (arg0 == 235) {
                int var45 = arg2.method569(-234);
                int var46 = (var45 >> 4 & 7) + this.field327;
                int var47 = (var45 & 7) + this.field328;
                int var48 = arg2.method549();
                int var49 = var48 >> 2;
                int var50 = var48 & 3;
                int var51 = this.field193[var49];
                if (var46 >= 0 && var47 >= 0 && var46 < 104 && var47 < 104) {
                    this.method154(this.field231, var51, var50, this.field494, var47, 0, var49, var46, -1, -1);
                }
            } else if (arg0 == 202) {
                int var52 = arg2.method551();
                int var53 = arg2.method569(-234);
                int var54 = (var53 >> 4 & 7) + this.field327;
                int var55 = (var53 & 7) + this.field328;
                int var56 = arg2.method577(true);
                if (var54 >= 0 && var55 >= 0 && var54 < 104 && var55 < 104) {
                    class44 var57 = new class44();
                    var57.field1196 = var56;
                    var57.field1195 = var52;
                    if (this.field614[this.field494][var54][var55] == null) {
                        this.field614[this.field494][var54][var55] = new class65((byte) 52);
                    }
                    this.field614[this.field494][var54][var55].method525(var57);
                    this.method99(var54, var55);
                }
            } else if (arg0 == 69) {
                int var58 = arg2.method549();
                int var59 = (var58 >> 4 & 7) + this.field327;
                int var60 = (var58 & 7) + this.field328;
                int var61 = var59 + arg2.method550();
                int var62 = var60 + arg2.method550();
                int var63 = arg2.method552();
                int var64 = arg2.method551();
                int var65 = arg2.method549() * 4;
                int var66 = arg2.method549() * 4;
                int var67 = arg2.method551();
                int var68 = arg2.method551();
                int var69 = arg2.method549();
                int var70 = arg2.method549();
                if (var59 >= 0 && var60 >= 0 && var59 < 104 && var60 < 104 && var61 >= 0 && var62 >= 0 && var61 < 104 && var62 < 104 && var64 != 65535) {
                    int var71 = var59 * 128 + 64;
                    int var72 = var60 * 128 + 64;
                    int var73 = var61 * 128 + 64;
                    int var74 = var62 * 128 + 64;
                    class61 var75 = new class61(field345 + var68, this.field494, -708, var71, var64, var63, var70, var69, var72, field345 + var67, var66, this.method81(0, var72, this.field494, var71) - var65);
                    var75.method514(var74, field345 + var67, this.method81(0, var74, this.field494, var73) - var66, this.field234, var73);
                    this.field513.method525(var75);
                }
            } else if (arg0 == 37) {
                int var76 = arg2.method576(-113);
                int var77 = arg2.method549();
                int var78 = (var77 >> 4 & 7) + this.field327;
                int var79 = (var77 & 7) + this.field328;
                int var80 = arg2.method570((byte) 96);
                int var81 = var80 >> 2;
                int var82 = var80 & 3;
                int var83 = this.field193[var81];
                if (var78 >= 0 && var79 >= 0 && var78 < 104 && var79 < 104) {
                    this.method154(this.field231, var83, var82, this.field494, var79, 0, var81, var78, -1, var76);
                }
            } else if (arg0 == 97) {
                int var84 = arg2.method549();
                int var85 = var84 >> 2;
                int var86 = var84 & 3;
                int var87 = this.field193[var85];
                int var88 = arg2.method578(false);
                int var89 = arg2.method570((byte) 96);
                int var90 = (var89 >> 4 & 7) + this.field327;
                int var91 = (var89 & 7) + this.field328;
                if (var90 >= 0 && var91 >= 0 && var90 < 103 && var91 < 103) {
                    int var92 = this.field377[this.field494][var90][var91];
                    int var93 = this.field377[this.field494][var90 + 1][var91];
                    int var94 = this.field377[this.field494][var90 + 1][var91 + 1];
                    int var95 = this.field377[this.field494][var90][var91 + 1];
                    if (var87 == 0) {
                        class53 var96 = this.field585.method479(var91, var90, false, this.field494);
                        if (var96 != null) {
                            int var97 = var96.field1318 >> 14 & 32767;
                            if (var85 == 2) {
                                var96.field1316 = new class8(var86 + 4, var94, 2, false, var88, var97, var92, var93, var95, 0);
                                var96.field1317 = new class8(var86 + 1 & 3, var94, 2, false, var88, var97, var92, var93, var95, 0);
                            } else {
                                var96.field1316 = new class8(var86, var94, var85, false, var88, var97, var92, var93, var95, 0);
                            }
                        }
                    }
                    if (var87 == 1) {
                        class13 var98 = this.field585.method480(this.field494, false, var90, var91);
                        if (var98 != null) {
                            var98.field681 = new class8(0, var94, 4, false, var88, var98.field682 >> 14 & 32767, var92, var93, var95, 0);
                        }
                    }
                    if (var87 == 2) {
                        class37 var99 = this.field585.method481(var91, var90, this.field494, 67);
                        if (var85 == 11) {
                            var85 = 10;
                        }
                        if (var99 != null) {
                            var99.field1070 = new class8(var86, var94, var85, false, var88, var99.field1078 >> 14 & 32767, var92, var93, var95, 0);
                        }
                    }
                    if (var87 == 3) {
                        class26 var100 = this.field585.method482(this.field494, var90, var91, true);
                        if (var100 != null) {
                            var100.field842 = new class8(var86, var94, 22, false, var88, var100.field843 >> 14 & 32767, var92, var93, var95, 0);
                        }
                    }
                }
            } else if (arg0 == 213) {
                int var101 = arg2.method549();
                int var102 = (var101 >> 4 & 7) + this.field327;
                int var103 = (var101 & 7) + this.field328;
                int var104 = arg2.method551();
                int var105 = arg2.method549();
                int var106 = arg2.method551();
                if (var102 >= 0 && var103 >= 0 && var102 < 104 && var103 < 104) {
                    int var107 = var102 * 128 + 64;
                    int var108 = var103 * 128 + 64;
                    class25 var109 = new class25(this.method81(0, var108, this.field494, var107) - var105, this.field494, (byte) 9, field345, var104, var108, var107, var106);
                    this.field362.method525(var109);
                }
            } else if (arg0 == 17) {
                int var110 = arg2.method578(false);
                int var111 = arg2.method549();
                int var112 = (var111 >> 4 & 7) + this.field327;
                int var113 = (var111 & 7) + this.field328;
                int var114 = arg2.method577(true);
                int var115 = arg2.method551();
                if (var112 >= 0 && var113 >= 0 && var112 < 104 && var113 < 104 && this.field279 != var114) {
                    class44 var116 = new class44();
                    var116.field1196 = var110;
                    var116.field1195 = var115;
                    if (this.field614[this.field494][var112][var113] == null) {
                        this.field614[this.field494][var112][var113] = new class65((byte) 52);
                    }
                    this.field614[this.field494][var112][var113].method525(var116);
                    this.method99(var112, var113);
                }
            } else if (arg0 == 61) {
                int var117 = arg2.method577(true);
                int var118 = arg2.method568(this.field278);
                int var119 = (var118 >> 4 & 7) + this.field327;
                int var120 = (var118 & 7) + this.field328;
                if (var119 >= 0 && var120 >= 0 && var119 < 104 && var120 < 104) {
                    class65 var121 = this.field614[this.field494][var119][var120];
                    if (var121 != null) {
                        for (class44 var122 = (class44) var121.method528(); var122 != null; var122 = (class44) var121.method530(false)) {
                            if ((var117 & 32767) == var122.field1196) {
                                var122.method589();
                                break;
                            }
                        }
                        if (var121.method528() == null) {
                            this.field614[this.field494][var119][var120] = null;
                        }
                        this.method99(var119, var120);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IZIIII)V")
    public final void method51(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field586.method192(arg4, arg5, 49598);
        this.field587.method192(arg3 + arg4 - 16, arg5, 49598);
        class31.method284(arg5, arg4 + 16, this.field291, (byte) -4, arg3 - 32, 16);
        if (arg1) {
            this.field213 = -1;
        }
        int var7 = (arg3 - 32) * arg3 / arg0;
        if (var7 < 8) {
            var7 = 8;
        }
        int var8 = (arg3 - 32 - var7) * arg2 / (arg0 - arg3);
        class31.method284(arg5, arg4 + 16 + var8, this.field340, (byte) -4, var7, 16);
        class31.method289(false, this.field333, arg5, var7, arg4 + 16 + var8);
        class31.method289(false, this.field333, arg5 + 1, var7, arg4 + 16 + var8);
        class31.method287(this.field333, arg5, arg4 + 16 + var8, (byte) 8, 16);
        class31.method287(this.field333, arg5, arg4 + 17 + var8, (byte) 8, 16);
        class31.method289(false, this.field188, arg5 + 15, var7, arg4 + 16 + var8);
        class31.method289(false, this.field188, arg5 + 14, var7 - 1, arg4 + 17 + var8);
        class31.method287(this.field188, arg5, arg4 + 15 + var8 + var7, (byte) 8, 16);
        class31.method287(this.field188, arg5 + 1, arg4 + 14 + var8 + var7, (byte) 8, 15);
    }

    @OriginalMember(owner = "client", name = "m", descriptor = "(I)V")
    public final void method52(int arg0) {
        this.field223.method372(0);
        class33.field987 = this.field497;
        this.field598.method192(0, 0, 49598);
        if (this.field435 != -1) {
            this.method78(0, class29.field895[this.field435], 0, 0, (byte) 2);
        } else if (this.field540[this.field649] != -1) {
            this.method78(0, class29.field895[this.field540[this.field649]], 0, 0, (byte) 2);
        }
        if (this.field385 && this.field261 == 1) {
            this.method69(-713);
        }
        this.field223.method373(205, 0, super.field1038, 553);
        this.field225.method372(0);
        if (arg0 < this.field492 || arg0 > this.field492) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        class33.field987 = this.field498;
    }

    @OriginalMember(owner = "client", name = "n", descriptor = "(I)V")
    public final void method53(int arg0) {
        if (arg0 == 49602) {
            if (this.field547 == 0) {
                int var2 = super.field1036 / 2 - 80;
                int var3 = super.field1037 / 2 + 20;
                int var14 = var3 + 20;
                if (super.field1052 == 1 && super.field1053 >= var2 - 75 && super.field1053 <= var2 + 75 && super.field1054 >= var14 - 20 && super.field1054 <= var14 + 20) {
                    this.field547 = 3;
                    this.field437 = 0;
                }
                int var4 = super.field1036 / 2 + 80;
                if (super.field1052 == 1 && super.field1053 >= var4 - 75 && super.field1053 <= var4 + 75 && super.field1054 >= var14 - 20 && super.field1054 <= var14 + 20) {
                    this.field401 = "";
                    this.field402 = "Enter your username & password.";
                    this.field547 = 2;
                    this.field437 = 0;
                }
            } else if (this.field547 == 2) {
                int var5 = super.field1037 / 2 - 40;
                int var15 = var5 + 30;
                int var16 = var15 + 25;
                if (super.field1052 == 1 && super.field1054 >= var16 - 15 && super.field1054 < var16) {
                    this.field437 = 0;
                }
                var5 = var16 + 15;
                if (super.field1052 == 1 && super.field1054 >= var5 - 15 && super.field1054 < var5) {
                    this.field437 = 1;
                }
                var5 += 15;
                int var6 = super.field1036 / 2 - 80;
                int var7 = super.field1037 / 2 + 50;
                int var17 = var7 + 20;
                if (super.field1052 == 1 && super.field1053 >= var6 - 75 && super.field1053 <= var6 + 75 && super.field1054 >= var17 - 20 && super.field1054 <= var17 + 20) {
                    this.field566 = 0;
                    this.method130(this.field203, this.field204, false);
                    if (this.field619) {
                        return;
                    }
                }
                int var8 = super.field1036 / 2 + 80;
                if (super.field1052 == 1 && super.field1053 >= var8 - 75 && super.field1053 <= var8 + 75 && super.field1054 >= var17 - 20 && super.field1054 <= var17 + 20) {
                    this.field547 = 0;
                    this.field203 = "";
                    this.field204 = "";
                }
                while (true) {
                    while (true) {
                        int var9 = this.method337(7);
                        if (var9 == -1) {
                            return;
                        }
                        boolean var10 = false;
                        for (int var11 = 0; var11 < field554.length(); ++var11) {
                            if (var9 == field554.charAt(var11)) {
                                var10 = true;
                                break;
                            }
                        }
                        if (this.field437 == 0) {
                            if (var9 == 8 && this.field203.length() > 0) {
                                this.field203 = this.field203.substring(0, this.field203.length() - 1);
                            }
                            if (var9 == 9 || var9 == 10 || var9 == 13) {
                                this.field437 = 1;
                            }
                            if (var10) {
                                this.field203 = this.field203 + (char) var9;
                            }
                            if (this.field203.length() > 12) {
                                this.field203 = this.field203.substring(0, 12);
                            }
                        } else if (this.field437 == 1) {
                            if (var9 == 8 && this.field204.length() > 0) {
                                this.field204 = this.field204.substring(0, this.field204.length() - 1);
                            }
                            if (var9 == 9 || var9 == 10 || var9 == 13) {
                                this.field437 = 0;
                            }
                            if (var10) {
                                this.field204 = this.field204 + (char) var9;
                            }
                            if (this.field204.length() > 20) {
                                this.field204 = this.field204.substring(0, 20);
                            }
                        }
                    }
                }
            } else {
                if (this.field547 == 3) {
                    int var12 = super.field1036 / 2;
                    int var13 = super.field1037 / 2 + 50;
                    int var18 = var13 + 20;
                    if (super.field1052 == 1 && super.field1053 >= var12 - 75 && super.field1053 <= var12 + 75 && super.field1054 >= var18 - 20 && super.field1054 <= var18 + 20) {
                        this.field547 = 0;
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(JI)V")
    public final void method54(long arg0, int arg1) {
        if (arg0 != 0L) {
            if (this.field508 >= 100 && this.field201 != 1) {
                this.method146(0, "Your friendlist is full. Max of 100 for free users, and 200 for members", "", false);
            } else if (this.field508 >= 200) {
                this.method146(0, "Your friendlist is full. Max of 100 for free users, and 200 for members", "", false);
            } else {
                String var4 = class21.method213(31698, class21.method210(0, arg0));
                this.field212 += arg1;
                for (int var5 = 0; var5 < this.field508; ++var5) {
                    if (this.field187[var5] == arg0) {
                        this.method146(0, var4 + " is already on your friend list", "", false);
                        return;
                    }
                }
                for (int var6 = 0; var6 < this.field458; ++var6) {
                    if (this.field419[var6] == arg0) {
                        this.method146(0, "Please remove " + var4 + " from your ignore list first", "", false);
                        return;
                    }
                }
                if (!var4.equals(field442.field13)) {
                    this.field595[this.field508] = var4;
                    this.field187[this.field508] = arg0;
                    this.field470[this.field508] = 0;
                    ++this.field508;
                    this.field189 = true;
                    this.field232.method538(51, (byte) 0);
                    this.field232.method545(false, arg0);
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(B)V")
    public final void method55(byte arg0) {
        if (this.field363 != arg0) {
            this.field213 = this.field558.method549();
        }
        try {
            int var2 = field442.field1569 + this.field524;
            int var3 = field442.field1570 + this.field440;
            if (this.field341 - var2 < -500 || this.field341 - var2 > 500 || this.field342 - var3 < -500 || this.field342 - var3 > 500) {
                this.field341 = var2;
                this.field342 = var3;
            }
            if (this.field341 != var2) {
                this.field341 += (var2 - this.field341) / 16;
            }
            if (this.field342 != var3) {
                this.field342 += (var3 - this.field342) / 16;
            }
            if (super.field1056[1] == 1) {
                this.field529 += (-24 - this.field529) / 2;
            } else if (super.field1056[2] == 1) {
                this.field529 += (24 - this.field529) / 2;
            } else {
                this.field529 /= 2;
            }
            if (super.field1056[3] == 1) {
                this.field530 += (12 - this.field530) / 2;
            } else if (super.field1056[4] == 1) {
                this.field530 += (-12 - this.field530) / 2;
            } else {
                this.field530 /= 2;
            }
            this.field528 = this.field529 / 2 + this.field528 & 2047;
            this.field527 += this.field530 / 2;
            if (this.field527 < 128) {
                this.field527 = 128;
            }
            if (this.field527 > 383) {
                this.field527 = 383;
            }
            int var4 = this.field341 >> 7;
            int var5 = this.field342 >> 7;
            int var6 = this.method81(0, this.field342, this.field494, this.field341);
            int var7 = 0;
            if (var4 > 3 && var5 > 3 && var4 < 100 && var5 < 100) {
                for (int var8 = var4 - 4; var8 <= var4 + 4; ++var8) {
                    for (int var9 = var5 - 4; var9 <= var5 + 4; ++var9) {
                        int var10 = this.field494;
                        if (var10 < 3 && (this.field634[1][var8][var9] & 2) == 2) {
                            ++var10;
                        }
                        int var11 = var6 - this.field377[var10][var8][var9];
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
            if (var12 > this.field630) {
                this.field630 += (var12 - this.field630) / 24;
            } else if (var12 < this.field630) {
                this.field630 += (var12 - this.field630) / 80;
            }
        } catch (Exception var13) {
            signlink.reporterror("glfc_ex " + field442.field1569 + "," + field442.field1570 + "," + this.field341 + "," + this.field342 + "," + this.field229 + "," + this.field230 + "," + this.field248 + "," + this.field249);
            throw new RuntimeException("eek");
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZLDZSIRBWX;)V")
    public final void method56(boolean arg0, class15 arg1) {
        short var3 = 256;
        if (arg0) {
            this.field232.method539(242);
        }
        for (int var4 = 0; var4 < this.field392.length; ++var4) {
            this.field392[var4] = 0;
        }
        for (int var5 = 0; var5 < 5000; ++var5) {
            int var17 = (int) (Math.random() * 128.0D * (double) var3);
            this.field392[var17] = (int) (Math.random() * 256.0D);
        }
        for (int var6 = 0; var6 < 20; ++var6) {
            for (int var13 = 1; var13 < var3 - 1; ++var13) {
                for (int var15 = 1; var15 < 127; ++var15) {
                    int var16 = (var13 << 7) + var15;
                    this.field393[var16] = (this.field392[var16 - 1] + this.field392[var16 + 1] + this.field392[var16 - 128] + this.field392[var16 + 128]) / 4;
                }
            }
            int[] var14 = this.field392;
            this.field392 = this.field393;
            this.field393 = var14;
        }
        if (arg1 != null) {
            int var7 = 0;
            for (int var8 = 0; var8 < arg1.field706; ++var8) {
                for (int var9 = 0; var9 < arg1.field705; ++var9) {
                    if (arg1.field703[var7++] != 0) {
                        int var10 = var9 + 16 + arg1.field707;
                        int var11 = var8 + 16 + arg1.field708;
                        int var12 = (var11 << 7) + var10;
                        this.field392[var12] = 0;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILYOXDZEVD;B)V")
    private final void method57(int arg0, class68 arg1, byte arg2) {
        this.field337 = 0;
        this.field485 = 0;
        this.method90(arg1, arg0, this.field202);
        this.method159(arg0, arg1, (byte) -25);
        this.method129((byte) -28, arg0, arg1);
        if (arg2 != -50) {
            this.field614 = null;
        }
        this.method59(arg1, false, arg0);
        for (int var4 = 0; var4 < this.field337; ++var4) {
            int var6 = this.field338[var4];
            if (field345 != this.field482[var6].field1564) {
                this.field482[var6] = null;
            }
        }
        if (arg1.field1612 != arg0) {
            signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg1.field1612 + " psize:" + arg0);
            throw new RuntimeException("eek");
        } else {
            for (int var5 = 0; var5 < this.field483; ++var5) {
                if (this.field482[this.field484[var5]] == null) {
                    signlink.reporterror(this.field203 + " null entry in pl list - pos:" + var5 + " size:" + this.field483);
                    throw new RuntimeException("eek");
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "o", descriptor = "(I)V")
    private final void method58(int arg0) {
        if (arg0 != 0) {
            this.field232.method539(99);
        }
        for (class4 var2 = (class4) this.field186.method528(); var2 != null; var2 = (class4) this.field186.method530(false)) {
            if (var2.field117 == -1) {
                var2.field118 = 0;
                this.method162(var2, -30058);
            } else {
                var2.method589();
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LYOXDZEVD;ZI)V")
    private final void method59(class68 arg0, boolean arg1, int arg2) {
        if (arg1) {
            this.field232.method539(231);
        }
        for (int var4 = 0; var4 < this.field485; ++var4) {
            int var5 = this.field486[var4];
            class1 var6 = this.field482[var5];
            int var7 = arg0.method549();
            if ((var7 & 64) != 0) {
                var7 += arg0.method549() << 8;
            }
            this.method117(arg0, var6, var5, var7, -653);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LYOXDZEVD;IB)V")
    private final void method60(class68 arg0, int arg1, byte arg2) {
        while (true) {
            if (arg0.field1613 + 21 < arg1 * 8) {
                int var4 = arg0.method560(true, 14);
                if (var4 != 16383) {
                    if (this.field270[var4] == null) {
                        this.field270[var4] = new class10();
                    }
                    class10 var5 = this.field270[var4];
                    this.field272[this.field271++] = var4;
                    var5.field1564 = field345;
                    int var6 = arg0.method560(true, 5);
                    if (var6 > 15) {
                        var6 -= 32;
                    }
                    int var7 = arg0.method560(true, 5);
                    if (var7 > 15) {
                        var7 -= 32;
                    }
                    var5.field653 = class19.method202(arg0.method560(true, 12));
                    int var8 = arg0.method560(true, 1);
                    if (var8 == 1) {
                        this.field486[this.field485++] = var4;
                    }
                    int var9 = arg0.method560(true, 1);
                    var5.field1548 = var5.field653.field754;
                    var5.field1561 = var5.field653.field759;
                    var5.field1565 = var5.field653.field762;
                    var5.field1566 = var5.field653.field770;
                    var5.field1567 = var5.field653.field746;
                    var5.field1568 = var5.field653.field763;
                    var5.field1586 = var5.field653.field743;
                    var5.method533(field442.field1560[0] + var7, -741, field442.field1559[0] + var6, var9 == 1);
                    continue;
                }
            }
            arg0.method561((byte) 1);
            if (arg2 != 45) {
                this.field202 = !this.field202;
                return;
            }
            return;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BLJDSNLLMP;)V")
    public final void method61(byte arg0, class29 arg1) {
        int var3 = arg1.field892;
        if (arg0 != 5) {
            field567 = 145;
        }
        if ((var3 < 1 || var3 > 100) && (var3 < 701 || var3 > 800)) {
            if (var3 >= 101 && var3 <= 200 || var3 >= 801 && var3 <= 900) {
                int var5 = this.field508;
                if (this.field509 != 2) {
                    var5 = 0;
                }
                if (var3 > 800) {
                    var3 -= 701;
                } else {
                    var3 -= 101;
                }
                if (var3 >= var5) {
                    arg1.field881 = "";
                    arg1.field935 = 0;
                } else {
                    if (this.field470[var3] == 0) {
                        arg1.field881 = "@red@Offline";
                    } else if (this.field470[var3] == field235) {
                        arg1.field881 = "@gre@World-" + (this.field470[var3] - 9);
                    } else {
                        arg1.field881 = "@yel@World-" + (this.field470[var3] - 9);
                    }
                    arg1.field935 = 1;
                }
            } else if (var3 == 203) {
                int var6 = this.field508;
                if (this.field509 != 2) {
                    var6 = 0;
                }
                arg1.field887 = var6 * 15 + 20;
                if (arg1.field887 <= arg1.field926) {
                    arg1.field887 = arg1.field926 + 1;
                }
            } else if (var3 >= 401 && var3 <= 500) {
                var3 -= 401;
                if (var3 == 0 && this.field509 == 0) {
                    arg1.field881 = "Loading ignore list";
                    arg1.field935 = 0;
                } else if (var3 == 1 && this.field509 == 0) {
                    arg1.field881 = "Please wait...";
                    arg1.field935 = 0;
                } else {
                    int var7 = this.field458;
                    if (this.field509 == 0) {
                        var7 = 0;
                    }
                    if (var3 >= var7) {
                        arg1.field881 = "";
                        arg1.field935 = 0;
                    } else {
                        arg1.field881 = class21.method213(31698, class21.method210(0, this.field419[var3]));
                        arg1.field935 = 1;
                    }
                }
            } else if (var3 == 503) {
                arg1.field887 = this.field458 * 15 + 20;
                if (arg1.field887 <= arg1.field926) {
                    arg1.field887 = arg1.field926 + 1;
                }
            } else if (var3 == 327) {
                arg1.field904 = 150;
                arg1.field905 = (int) (Math.sin((double) field345 / 40.0D) * 256.0D) & 2047;
                if (this.field434) {
                    for (int var8 = 0; var8 < 7; ++var8) {
                        int var15 = this.field597[var8];
                        if (var15 >= 0 && !class60.field1471[var15].method510(48283)) {
                            return;
                        }
                    }
                    this.field434 = false;
                    class39[] var9 = new class39[7];
                    int var10 = 0;
                    for (int var11 = 0; var11 < 7; ++var11) {
                        int var14 = this.field597[var11];
                        if (var14 >= 0) {
                            var9[var10++] = class60.field1471[var14].method511(false);
                        }
                    }
                    class39 var12 = new class39(var9, (byte) 0, var10);
                    for (int var13 = 0; var13 < 5; ++var13) {
                        if (this.field523[var13] != 0) {
                            var12.method360(field532[var13][0], field532[var13][this.field523[var13]]);
                            if (var13 == 1) {
                                var12.method360(field591[0], field591[this.field523[var13]]);
                            }
                        }
                    }
                    var12.method353(10544);
                    var12.method354(class9.field163[field442.field1586].field165[0], this.field423);
                    var12.method363(64, 850, -30, -50, -30, true);
                    arg1.field917 = 5;
                    arg1.field918 = 0;
                    class29.method273(5, false, var12, 0);
                }
            } else if (var3 == 324) {
                if (this.field626 == null) {
                    this.field626 = arg1.field879;
                    this.field627 = arg1.field910;
                }
                if (this.field246) {
                    arg1.field879 = this.field627;
                } else {
                    arg1.field879 = this.field626;
                }
            } else if (var3 == 325) {
                if (this.field626 == null) {
                    this.field626 = arg1.field879;
                    this.field627 = arg1.field910;
                }
                if (this.field246) {
                    arg1.field879 = this.field626;
                } else {
                    arg1.field879 = this.field627;
                }
            } else if (var3 == 600) {
                arg1.field881 = this.field581;
                if (field345 % 20 < 10) {
                    arg1.field881 = arg1.field881 + "|";
                } else {
                    arg1.field881 = arg1.field881 + " ";
                }
            } else {
                if (var3 == 613) {
                    if (this.field379 >= 1) {
                        if (this.field602) {
                            arg1.field883 = 16711680;
                            arg1.field881 = "Moderator option: Mute player for 48 hours: <ON>";
                        } else {
                            arg1.field883 = 16777215;
                            arg1.field881 = "Moderator option: Mute player for 48 hours: <OFF>";
                        }
                    } else {
                        arg1.field881 = "";
                    }
                }
                if (var3 == 650 || var3 == 655) {
                    if (this.field511 != 0) {
                        String var16;
                        if (this.field221 == 0) {
                            var16 = "earlier today";
                        } else if (this.field221 == 1) {
                            var16 = "yesterday";
                        } else {
                            var16 = this.field221 + " days ago";
                        }
                        arg1.field881 = "You last logged in " + var16 + " from: " + signlink.dns;
                    } else {
                        arg1.field881 = "";
                    }
                }
                if (var3 == 651) {
                    if (this.field194 == 0) {
                        arg1.field881 = "0 unread messages";
                        arg1.field883 = 16776960;
                    }
                    if (this.field194 == 1) {
                        arg1.field881 = "1 unread message";
                        arg1.field883 = 65280;
                    }
                    if (this.field194 > 1) {
                        arg1.field881 = this.field194 + " unread messages";
                        arg1.field883 = 65280;
                    }
                }
                if (var3 == 652) {
                    if (this.field374 == 201) {
                        if (this.field233 == 1) {
                            arg1.field881 = "@yel@This is a non-members world: @whi@Since you are a member we";
                        } else {
                            arg1.field881 = "";
                        }
                    } else if (this.field374 == 200) {
                        arg1.field881 = "You have not yet set any password recovery questions.";
                    } else {
                        String var17;
                        if (this.field374 == 0) {
                            var17 = "Earlier today";
                        } else if (this.field374 == 1) {
                            var17 = "Yesterday";
                        } else {
                            var17 = this.field374 + " days ago";
                        }
                        arg1.field881 = var17 + " you changed your recovery questions";
                    }
                }
                if (var3 == 653) {
                    if (this.field374 == 201) {
                        if (this.field233 == 1) {
                            arg1.field881 = "@whi@recommend you use a members world instead. You may use";
                        } else {
                            arg1.field881 = "";
                        }
                    } else if (this.field374 == 200) {
                        arg1.field881 = "We strongly recommend you do so now to secure your account.";
                    } else {
                        arg1.field881 = "If you do not remember making this change then cancel it immediately";
                    }
                }
                if (var3 == 654) {
                    if (this.field374 == 201) {
                        if (this.field233 == 1) {
                            arg1.field881 = "@whi@this world but member benefits are unavailable whilst here.";
                        } else {
                            arg1.field881 = "";
                        }
                    } else if (this.field374 == 200) {
                        arg1.field881 = "Do this from the 'account management' area on our front webpage";
                    } else {
                        arg1.field881 = "Do this from the 'account management' area on our front webpage";
                    }
                }
            }
        } else if (var3 == 1 && this.field509 == 0) {
            arg1.field881 = "Loading friend list";
            arg1.field935 = 0;
        } else if (var3 == 1 && this.field509 == 1) {
            arg1.field881 = "Connecting to friendserver";
            arg1.field935 = 0;
        } else if (var3 == 2 && this.field509 != 2) {
            arg1.field881 = "Please wait...";
            arg1.field935 = 0;
        } else {
            int var4 = this.field508;
            if (this.field509 != 2) {
                var4 = 0;
            }
            if (var3 > 700) {
                var3 -= 601;
            } else {
                --var3;
            }
            if (var3 >= var4) {
                arg1.field881 = "";
                arg1.field935 = 0;
            } else {
                arg1.field881 = this.field595[var3];
                arg1.field935 = 1;
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(BLJDSNLLMP;)Z")
    public final boolean method62(byte arg0, class29 arg1) {
        int var3 = arg1.field892;
        if (arg0 != -120) {
            this.method119();
        }
        if ((var3 < 1 || var3 > 200) && (var3 < 701 || var3 > 900)) {
            if (var3 >= 401 && var3 <= 500) {
                this.field615[this.field219] = "Remove @whi@" + arg1.field881;
                this.field366[this.field219] = 799;
                ++this.field219;
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
            this.field615[this.field219] = "Remove @whi@" + this.field595[var3];
            this.field366[this.field219] = 515;
            ++this.field219;
            this.field615[this.field219] = "Message @whi@" + this.field595[var3];
            this.field366[this.field219] = 72;
            ++this.field219;
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "p", descriptor = "(I)V")
    public final void method63(int arg0) {
        while (arg0 >= 0) {
            this.field258 = !this.field258;
        }
        int var2 = this.field380 * 128 + 64;
        int var3 = this.field381 * 128 + 64;
        int var4 = this.method81(0, var3, this.field494, var2) - this.field382;
        if (this.field443 < var2) {
            this.field443 += (var2 - this.field443) * this.field384 / 1000 + this.field383;
            if (this.field443 > var2) {
                this.field443 = var2;
            }
        }
        if (this.field443 > var2) {
            this.field443 -= (this.field443 - var2) * this.field384 / 1000 + this.field383;
            if (this.field443 < var2) {
                this.field443 = var2;
            }
        }
        if (this.field444 < var4) {
            this.field444 += (var4 - this.field444) * this.field384 / 1000 + this.field383;
            if (this.field444 > var4) {
                this.field444 = var4;
            }
        }
        if (this.field444 > var4) {
            this.field444 -= (this.field444 - var4) * this.field384 / 1000 + this.field383;
            if (this.field444 < var4) {
                this.field444 = var4;
            }
        }
        if (this.field445 < var3) {
            this.field445 += (var3 - this.field445) * this.field384 / 1000 + this.field383;
            if (this.field445 > var3) {
                this.field445 = var3;
            }
        }
        if (this.field445 > var3) {
            this.field445 -= (this.field445 - var3) * this.field384 / 1000 + this.field383;
            if (this.field445 < var3) {
                this.field445 = var3;
            }
        }
        int var5 = this.field499 * 128 + 64;
        int var6 = this.field500 * 128 + 64;
        int var7 = this.method81(0, var6, this.field494, var5) - this.field501;
        int var8 = var5 - this.field443;
        int var9 = var7 - this.field444;
        int var10 = var6 - this.field445;
        int var11 = (int) Math.sqrt((double) (var8 * var8 + var10 * var10));
        int var12 = (int) (Math.atan2((double) var9, (double) var11) * 325.949D) & 2047;
        int var13 = (int) (Math.atan2((double) var8, (double) var10) * -325.949D) & 2047;
        if (var12 < 128) {
            var12 = 128;
        }
        if (var12 > 383) {
            var12 = 383;
        }
        if (this.field446 < var12) {
            this.field446 += (var12 - this.field446) * this.field503 / 1000 + this.field502;
            if (this.field446 > var12) {
                this.field446 = var12;
            }
        }
        if (this.field446 > var12) {
            this.field446 -= (this.field446 - var12) * this.field503 / 1000 + this.field502;
            if (this.field446 < var12) {
                this.field446 = var12;
            }
        }
        int var14 = var13 - this.field447;
        if (var14 > 1024) {
            var14 -= 2048;
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (var14 > 0) {
            this.field447 += this.field503 * var14 / 1000 + this.field502;
            this.field447 &= 2047;
        }
        if (var14 < 0) {
            this.field447 -= -var14 * this.field503 / 1000 + this.field502;
            this.field447 &= 2047;
        }
        int var15 = var13 - this.field447;
        if (var15 > 1024) {
            var15 -= 2048;
        }
        if (var15 < -1024) {
            var15 += 2048;
        }
        if (var15 < 0 && var14 > 0 || var15 > 0 && var14 < 0) {
            this.field447 = var13;
        }
    }

    @OriginalMember(owner = "client", name = "q", descriptor = "(I)V")
    public final void method64(int arg0) {
        int var2 = 18 / arg0;
        if (this.field268 != 0) {
            int var3 = 0;
            if (this.field284 != 0) {
                var3 = 1;
            }
            for (int var4 = 0; var4 < 100; ++var4) {
                if (this.field506[var4] != null) {
                    int var5 = this.field504[var4];
                    String var6 = this.field505[var4];
                    boolean var7 = false;
                    if (var6 != null && var6.startsWith("@cr1@")) {
                        var6 = var6.substring(5);
                        boolean var8 = true;
                    }
                    if (var6 != null && var6.startsWith("@cr2@")) {
                        var6 = var6.substring(5);
                        boolean var9 = true;
                    }
                    if ((var5 == 3 || var5 == 7) && (var5 == 7 || this.field612 == 0 || this.field612 == 1 && this.method26(var6, 15404))) {
                        int var10 = 329 - var3 * 13;
                        if (super.field1046 > 4 && super.field1047 - 4 > var10 - 10 && super.field1047 - 4 <= var10 + 3) {
                            int var11 = this.field409.method384("From:  " + var6 + this.field506[var4], true) + 25;
                            if (var11 > 450) {
                                var11 = 450;
                            }
                            if (super.field1046 < var11 + 4) {
                                if (this.field379 >= 1) {
                                    this.field615[this.field219] = "Report abuse @whi@" + var6;
                                    this.field366[this.field219] = 2399;
                                    ++this.field219;
                                }
                                this.field615[this.field219] = "Add ignore @whi@" + var6;
                                this.field366[this.field219] = 2092;
                                ++this.field219;
                                this.field615[this.field219] = "Add friend @whi@" + var6;
                                this.field366[this.field219] = 2264;
                                ++this.field219;
                            }
                        }
                        ++var3;
                        if (var3 >= 5) {
                            return;
                        }
                    }
                    if ((var5 == 5 || var5 == 6) && this.field612 < 2) {
                        ++var3;
                        if (var3 >= 5) {
                            return;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(III)Ljava/lang/String;")
    public static final String method65(int arg0, int arg1, int arg2) {
        if (arg2 <= 0) {
            for (int var3 = 1; var3 > 0; ++var3) {
            }
        }
        int var4 = arg0 - arg1;
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

    @OriginalMember(owner = "client", name = "r", descriptor = "(I)Z")
    public final boolean method66(int arg0) {
        if (arg0 <= 0) {
            this.method119();
        }
        if (this.field537 == null) {
            return false;
        } else {
            try {
                int var2 = this.field537.method399();
                if (var2 == 0) {
                    return false;
                }
                if (this.field213 == -1) {
                    this.field537.method400(this.field558.field1611, 0, 1);
                    this.field213 = this.field558.field1611[0] & 255;
                    if (this.field593 != null) {
                        this.field213 = this.field213 - this.field593.method377() & 255;
                    }
                    this.field212 = class57.field1447[this.field213];
                    --var2;
                }
                if (this.field212 == -1) {
                    if (var2 <= 0) {
                        return false;
                    }
                    this.field537.method400(this.field558.field1611, 0, 1);
                    this.field212 = this.field558.field1611[0] & 255;
                    --var2;
                }
                if (this.field212 == -2) {
                    if (var2 <= 1) {
                        return false;
                    }
                    this.field537.method400(this.field558.field1611, 0, 2);
                    this.field558.field1612 = 0;
                    this.field212 = this.field558.method551();
                    var2 -= 2;
                }
                if (var2 < this.field212) {
                    return false;
                }
                this.field558.field1612 = 0;
                this.field537.method400(this.field558.field1611, 0, this.field212);
                this.field214 = 0;
                this.field336 = this.field335;
                this.field335 = this.field334;
                this.field334 = this.field213;
                if (this.field213 == 40) {
                    int var3 = this.field558.method582(true);
                    int var4 = this.field558.method576(-113);
                    this.field211[var4] = var3;
                    if (this.field631[var4] != var3) {
                        this.field631[var4] = var3;
                        this.method124(691, var4);
                        this.field189 = true;
                        if (this.field493 != -1) {
                            this.field412 = true;
                        }
                    }
                    this.field213 = -1;
                    return true;
                }
                if (this.field213 == 53) {
                    this.field189 = true;
                    int var5 = this.field558.method551();
                    class29 var6 = class29.field895[var5];
                    while (this.field558.field1612 < this.field212) {
                        int var7 = this.field558.method563();
                        int var8 = this.field558.method551();
                        int var9 = this.field558.method549();
                        if (var9 == 255) {
                            var9 = this.field558.method554();
                        }
                        if (var7 >= 0 && var7 < var6.field880.length) {
                            var6.field880[var7] = var8;
                            var6.field912[var7] = var9;
                        }
                    }
                    this.field213 = -1;
                    return true;
                }
                if (this.field213 == 183) {
                    int var10 = this.field558.method579(false);
                    if (var10 >= 0) {
                        this.method157(-758, var10);
                    }
                    this.field577 = var10;
                    this.field213 = -1;
                    return true;
                }
                if (this.field213 == 1) {
                    int var11 = this.field558.method549();
                    int var12 = this.field558.method576(-113);
                    if (var12 == 65535) {
                        var12 = -1;
                    }
                    this.field540[var11] = var12;
                    this.field189 = true;
                    this.field339 = true;
                    this.field213 = -1;
                    return true;
                }
                if (this.field213 == 161) {
                    int var13 = this.field558.method551();
                    int var14 = this.field558.method578(false);
                    int var15 = this.field558.method578(false);
                    if (var14 == 65535) {
                        class29.field895[var13].field917 = 0;
                        this.field213 = -1;
                        return true;
                    }
                    class3 var16 = class3.method13(var14);
                    class29.field895[var13].field917 = 4;
                    class29.field895[var13].field918 = var14;
                    class29.field895[var13].field904 = var16.field80;
                    class29.field895[var13].field905 = var16.field72;
                    class29.field895[var13].field903 = var16.field82 * 100 / var15;
                    this.field213 = -1;
                    return true;
                }
                if (this.field213 == 249) {
                    this.field460 = false;
                    this.field310 = 2;
                    this.field552 = "";
                    this.field412 = true;
                    this.field213 = -1;
                    return true;
                }
                if (this.field213 == 134) {
                    int var17 = this.field558.method577(true);
                    int var18 = this.field558.method576(-113);
                    int var19 = var17 >> 10 & 31;
                    int var20 = var17 >> 5 & 31;
                    int var21 = var17 & 31;
                    class29.field895[var18].field883 = (var21 << 3) + (var19 << 19) + (var20 << 11);
                    this.field213 = -1;
                    return true;
                }
                if (this.field213 == 120) {
                    this.field458 = this.field212 / 8;
                    for (int var22 = 0; var22 < this.field458; ++var22) {
                        this.field419[var22] = this.field558.method555(true);
                    }
                    this.field213 = -1;
                    return true;
                }
                if (this.field213 == 234) {
                    this.method57(this.field212, this.field558, (byte) -50);
                    this.field622 = false;
                    this.field213 = -1;
                    return true;
                }
                if (this.field213 == 15) {
                    long var23 = this.field558.method555(true);
                    int var25 = this.field558.method554();
                    int var26 = this.field558.method549();
                    boolean var27 = false;
                    for (int var28 = 0; var28 < 100; ++var28) {
                        if (this.field260[var28] == var25) {
                            var27 = true;
                            break;
                        }
                    }
                    if (var26 <= 1) {
                        for (int var29 = 0; var29 < this.field458; ++var29) {
                            if (this.field419[var29] == var23) {
                                var27 = true;
                                break;
                            }
                        }
                    }
                    if (!var27 && this.field544 == 0) {
                        try {
                            this.field260[this.field378] = var25;
                            this.field378 = (this.field378 + 1) % 100;
                            String var30 = class17.method199(this.field558, -291, this.field212 - 13);
                            if (var26 != 3) {
                                var30 = class28.method244(-164, var30);
                            }
                            if (var26 != 2 && var26 != 3) {
                                if (var26 == 1) {
                                    this.method146(7, var30, "@cr1@" + class21.method213(31698, class21.method210(0, var23)), false);
                                } else {
                                    this.method146(3, var30, class21.method213(31698, class21.method210(0, var23)), false);
                                }
                            } else {
                                this.method146(7, var30, "@cr2@" + class21.method213(31698, class21.method210(0, var23)), false);
                            }
                        } catch (Exception var187) {
                            signlink.reporterror("cde1");
                        }
                    }
                    this.field213 = -1;
                    return true;
                }
                if (this.field213 == 32) {
                    this.field594 = true;
                    this.field380 = this.field558.method549();
                    this.field381 = this.field558.method549();
                    this.field382 = this.field558.method551();
                    this.field383 = this.field558.method549();
                    this.field384 = this.field558.method549();
                    if (this.field384 >= 100) {
                        this.field443 = this.field380 * 128 + 64;
                        this.field445 = this.field381 * 128 + 64;
                        this.field444 = this.method81(0, this.field445, this.field494, this.field443) - this.field382;
                    }
                    this.field213 = -1;
                    return true;
                }
                if (this.field213 == 25) {
                    this.field327 = this.field558.method569(-234);
                    this.field328 = this.field558.method568(this.field278);
                    this.field213 = -1;
                    return true;
                }
                if (this.field213 == 154) {
                    this.field284 = this.field558.method576(-113) * 30;
                    this.field213 = -1;
                    return true;
                }
                if (this.field213 == 160) {
                    int var32 = this.field558.method578(false);
                    this.method157(-758, var32);
                    if (this.field435 != -1) {
                        this.field435 = -1;
                        this.field189 = true;
                        this.field339 = true;
                    }
                    if (this.field606 != -1) {
                        this.field606 = -1;
                        this.field412 = true;
                    }
                    if (this.field310 != 0) {
                        this.field310 = 0;
                        this.field412 = true;
                    }
                    this.field438 = var32;
                    this.field205 = false;
                    this.field213 = -1;
                    return true;
                }
                if (this.field213 == 139) {
                    this.field474 = this.field558.method549();
                    if (this.field474 == 1) {
                        this.field570 = this.field558.method551();
                    }
                    if (this.field474 >= 2 && this.field474 <= 6) {
                        if (this.field474 == 2) {
                            this.field517 = 64;
                            this.field518 = 64;
                        }
                        if (this.field474 == 3) {
                            this.field517 = 0;
                            this.field518 = 64;
                        }
                        if (this.field474 == 4) {
                            this.field517 = 128;
                            this.field518 = 64;
                        }
                        if (this.field474 == 5) {
                            this.field517 = 64;
                            this.field518 = 0;
                        }
                        if (this.field474 == 6) {
                            this.field517 = 64;
                            this.field518 = 128;
                        }
                        this.field474 = 2;
                        this.field514 = this.field558.method551();
                        this.field515 = this.field558.method551();
                        this.field516 = this.field558.method549();
                    }
                    if (this.field474 == 10) {
                        this.field453 = this.field558.method551();
                    }
                    this.field213 = -1;
                    return true;
                }
                if (this.field213 == 103) {
                    for (int var33 = 0; var33 < this.field631.length; ++var33) {
                        if (this.field631[var33] != this.field211[var33]) {
                            this.field631[var33] = this.field211[var33];
                            this.method124(691, var33);
                            this.field189 = true;
                        }
                    }
                    this.field213 = -1;
                    return true;
                }
                if (this.field213 == 80) {
                    this.field189 = true;
                    int var34 = this.field558.method551();
                    class29 var35 = class29.field895[var34];
                    int var36 = this.field558.method551();
                    for (int var37 = 0; var37 < var36; ++var37) {
                        var35.field880[var37] = this.field558.method578(false);
                        int var38 = this.field558.method568(this.field278);
                        if (var38 == 255) {
                            var38 = this.field558.method581(true);
                        }
                        var35.field912[var37] = var38;
                    }
                    for (int var39 = var36; var39 < var35.field880.length; ++var39) {
                        var35.field880[var39] = 0;
                        var35.field912[var39] = 0;
                    }
                    this.field213 = -1;
                    return true;
                }
                if (this.field213 == 77) {
                    int var40 = this.field558.method576(-113);
                    int var41 = this.field558.method578(false);
                    class29.field895[var41].field917 = 2;
                    class29.field895[var41].field918 = var40;
                    this.field213 = -1;
                    return true;
                }
                if (this.field213 == 98) {
                    int var42 = this.field558.method551();
                    int var43 = this.field558.method549();
                    int var44 = this.field558.method551();
                    if (this.field247 && !field238 && this.field387 < 50) {
                        this.field180[this.field387] = var42;
                        this.field417[this.field387] = var43;
                        this.field488[this.field387] = class12.field670[var42] + var44;
                        ++this.field387;
                    }
                    this.field213 = -1;
                    return true;
                }
                if (this.field213 == 155) {
                    byte var45 = this.field558.method550();
                    int var46 = this.field558.method551();
                    this.field211[var46] = var45;
                    if (this.field631[var46] != var45) {
                        this.field631[var46] = var45;
                        this.method124(691, var46);
                        this.field189 = true;
                        if (this.field493 != -1) {
                            this.field412 = true;
                        }
                    }
                    this.field213 = -1;
                    return true;
                }
                if (this.field213 == 242) {
                    this.field189 = true;
                    int var47 = this.field558.method569(-234);
                    int var48 = this.field558.method568(this.field278);
                    int var49 = this.field558.method554();
                    this.field290[var47] = var49;
                    this.field418[var47] = var48;
                    this.field312[var47] = 1;
                    for (int var50 = 0; var50 < 98; ++var50) {
                        if (var49 >= field289[var50]) {
                            this.field312[var47] = var50 + 2;
                        }
                    }
                    this.field213 = -1;
                    return true;
                }
                if (this.field213 == 255) {
                    this.field327 = this.field558.method549();
                    this.field328 = this.field558.method569(-234);
                    for (int var51 = this.field327; var51 < this.field327 + 8; ++var51) {
                        for (int var52 = this.field328; var52 < this.field328 + 8; ++var52) {
                            if (this.field614[this.field494][var51][var52] != null) {
                                this.field614[this.field494][var51][var52] = null;
                                this.method99(var51, var52);
                            }
                        }
                    }
                    for (class4 var53 = (class4) this.field186.method528(); var53 != null; var53 = (class4) this.field186.method530(false)) {
                        if (var53.field109 >= this.field327 && var53.field109 < this.field327 + 8 && var53.field110 >= this.field328 && var53.field110 < this.field328 + 8 && this.field494 == var53.field107) {
                            var53.field117 = 0;
                        }
                    }
                    this.field213 = -1;
                    return true;
                }
                if (this.field213 == 65) {
                    if (this.field435 != -1) {
                        this.field435 = -1;
                        this.field189 = true;
                        this.field339 = true;
                    }
                    if (this.field606 != -1) {
                        this.field606 = -1;
                        this.field412 = true;
                    }
                    if (this.field310 != 0) {
                        this.field310 = 0;
                        this.field412 = true;
                    }
                    this.field438 = -1;
                    this.field205 = false;
                    this.field213 = -1;
                    return true;
                }
                if (this.field213 == 179) {
                    this.field628 = this.field558.method549();
                    this.field612 = this.field558.method549();
                    this.field357 = this.field558.method549();
                    this.field181 = true;
                    this.field412 = true;
                    this.field213 = -1;
                    return true;
                }
                if (this.field213 == 31) {
                    String var54 = this.field558.method556();
                    if (var54.endsWith(":tradereq:")) {
                        String var55 = var54.substring(0, var54.indexOf(":"));
                        long var56 = class21.method209(var55);
                        boolean var58 = false;
                        for (int var59 = 0; var59 < this.field458; ++var59) {
                            if (this.field419[var59] == var56) {
                                var58 = true;
                                break;
                            }
                        }
                        if (!var58 && this.field544 == 0) {
                            this.method146(4, "wishes to trade with you.", var55, false);
                        }
                    } else if (var54.endsWith(":duelreq:")) {
                        String var60 = var54.substring(0, var54.indexOf(":"));
                        long var61 = class21.method209(var60);
                        boolean var63 = false;
                        for (int var64 = 0; var64 < this.field458; ++var64) {
                            if (this.field419[var64] == var61) {
                                var63 = true;
                                break;
                            }
                        }
                        if (!var63 && this.field544 == 0) {
                            this.method146(8, "wishes to duel with you.", var60, false);
                        }
                    } else if (!var54.endsWith(":chalreq:")) {
                        this.method146(0, var54, "", false);
                    } else {
                        String var65 = var54.substring(0, var54.indexOf(":"));
                        long var66 = class21.method209(var65);
                        boolean var68 = false;
                        for (int var69 = 0; var69 < this.field458; ++var69) {
                            if (this.field419[var69] == var66) {
                                var68 = true;
                                break;
                            }
                        }
                        if (!var68 && this.field544 == 0) {
                            String var70 = var54.substring(var54.indexOf(":") + 1, var54.length() - 9);
                            this.method146(8, var70, var65, false);
                        }
                    }
                    this.field213 = -1;
                    return true;
                }
                if (this.field213 == 107) {
                    this.field460 = false;
                    this.field310 = 1;
                    this.field552 = "";
                    this.field412 = true;
                    this.field213 = -1;
                    return true;
                }
                if (this.field213 == 8) {
                    this.field649 = this.field558.method549();
                    this.field189 = true;
                    this.field339 = true;
                    this.field213 = -1;
                    return true;
                }
                if (this.field213 == 71) {
                    int var71 = this.field558.method576(-113);
                    if (var71 == 65535) {
                        var71 = -1;
                    }
                    if (this.field275 != var71 && this.field351 && !field238 && this.field285 == 0) {
                        this.field331 = var71;
                        this.field332 = true;
                        this.field520.method450(2, this.field331);
                    }
                    this.field275 = var71;
                    this.field213 = -1;
                    return true;
                }
                if (this.field213 == 184) {
                    int var72 = this.field558.method551();
                    int var73 = this.field558.method577(true);
                    if (this.field351 && !field238) {
                        this.field331 = var72;
                        this.field332 = false;
                        this.field520.method450(2, this.field331);
                        this.field285 = var73;
                    }
                    this.field213 = -1;
                    return true;
                }
                if (this.field213 == 178 || this.field213 == 89 || this.field213 == 62 || this.field213 == 17 || this.field213 == 213 || this.field213 == 69 || this.field213 == 61 || this.field213 == 202 || this.field213 == 97 || this.field213 == 235 || this.field213 == 37) {
                    this.method50(this.field213, this.field439, this.field558);
                    this.field213 = -1;
                    return true;
                }
                if (this.field213 == 127) {
                    int var74 = this.field558.method577(true);
                    int var75 = this.field558.method577(true);
                    class29.field895[var74].field917 = 1;
                    class29.field895[var74].field918 = var75;
                    this.field213 = -1;
                    return true;
                }
                if (this.field213 == 92) {
                    int var76 = this.field558.method580(0);
                    int var77 = this.field558.method578(false);
                    class29 var78 = class29.field895[var77];
                    var78.field893 = var76;
                    if (var76 == -1) {
                        var78.field936 = 0;
                        var78.field920 = 0;
                    }
                    this.field213 = -1;
                    return true;
                }
                if (this.field213 == 85) {
                    int var79 = this.field558.method580(0);
                    this.field493 = var79;
                    this.field412 = true;
                    this.field213 = -1;
                    return true;
                }
                if (this.field213 == 187) {
                    this.method161(this.field212, this.field558, (byte) -102);
                    this.field213 = -1;
                    return true;
                }
                if (this.field213 == 10) {
                    int var80 = this.field558.method578(false);
                    int var81 = this.field558.method578(false);
                    int var82 = this.field558.method551();
                    int var83 = this.field558.method578(false);
                    class29.field895[var81].field904 = var83;
                    class29.field895[var81].field905 = var80;
                    class29.field895[var81].field903 = var82;
                    this.field213 = -1;
                    return true;
                }
                if (this.field213 == 246) {
                    int var84 = this.field558.method549();
                    int var85 = this.field558.method549();
                    int var86 = this.field558.method549();
                    int var87 = this.field558.method549();
                    this.field266[var84] = true;
                    this.field632[var84] = var85;
                    this.field398[var84] = var86;
                    this.field620[var84] = var87;
                    this.field436[var84] = 0;
                    this.field213 = -1;
                    return true;
                }
                if (this.field213 == 7) {
                    this.field594 = false;
                    for (int var88 = 0; var88 < 5; ++var88) {
                        this.field266[var88] = false;
                    }
                    this.field213 = -1;
                    return true;
                }
                if (this.field213 == 150) {
                    int var89 = this.field558.method576(-113);
                    class29.field895[var89].field917 = 3;
                    if (field442.field3 == null) {
                        class29.field895[var89].field918 = (field442.field5[11] << 5) + (field442.field5[8] << 10) + (field442.field5[0] << 15) + (field442.field6[0] << 25) + (field442.field6[4] << 20) + field442.field5[1];
                    } else {
                        class29.field895[var89].field918 = (int) (field442.field3.field778 + 305419896L);
                    }
                    this.field213 = -1;
                    return true;
                }
                if (this.field213 == 233) {
                    this.field509 = this.field558.method549();
                    this.field189 = true;
                    this.field213 = -1;
                    return true;
                }
                if (this.field213 == 106) {
                    int var90 = this.field558.method576(-113);
                    boolean var91 = this.field558.method569(-234) == 1;
                    class29.field895[var90].field882 = var91;
                    this.field213 = -1;
                    return true;
                }
                if (this.field213 == 36) {
                    int var92 = this.field558.method580(0);
                    int var93 = this.field558.method579(false);
                    int var94 = this.field558.method576(-113);
                    class29 var95 = class29.field895[var94];
                    var95.field908 = var93;
                    var95.field933 = var92;
                    this.field213 = -1;
                    return true;
                }
                if (this.field213 == 52) {
                    for (int var96 = 0; var96 < this.field482.length; ++var96) {
                        if (this.field482[var96] != null) {
                            this.field482[var96].field1575 = -1;
                        }
                    }
                    for (int var97 = 0; var97 < this.field270.length; ++var97) {
                        if (this.field270[var97] != null) {
                            this.field270[var97].field1575 = -1;
                        }
                    }
                    this.field213 = -1;
                    return true;
                }
                if (this.field213 == 151) {
                    this.field511 = this.field558.method554();
                    this.field374 = this.field558.method568(this.field278);
                    this.field194 = this.field558.method576(-113);
                    this.field233 = this.field558.method568(this.field278);
                    this.field221 = this.field558.method577(true);
                    if (this.field511 != 0 && this.field438 == -1) {
                        signlink.dnslookup(class21.method212(false, this.field511));
                        this.method84(true);
                        short var98 = 650;
                        if (this.field374 != 201 || this.field233 == 1) {
                            var98 = 655;
                        }
                        this.field581 = "";
                        this.field602 = false;
                        for (int var99 = 0; var99 < class29.field895.length; ++var99) {
                            if (class29.field895[var99] != null && class29.field895[var99].field892 == var98) {
                                this.field438 = class29.field895[var99].field919;
                                break;
                            }
                        }
                    }
                    this.field213 = -1;
                    return true;
                }
                if (this.field213 == 90) {
                    if (this.field649 == 12) {
                        this.field189 = true;
                    }
                    this.field616 = this.field558.method552();
                    this.field213 = -1;
                    return true;
                }
                if (this.field213 == 44) {
                    this.field594 = true;
                    this.field499 = this.field558.method549();
                    this.field500 = this.field558.method549();
                    this.field501 = this.field558.method551();
                    this.field502 = this.field558.method549();
                    this.field503 = this.field558.method549();
                    if (this.field503 >= 100) {
                        int var100 = this.field499 * 128 + 64;
                        int var101 = this.field500 * 128 + 64;
                        int var102 = this.method81(0, var101, this.field494, var100) - this.field501;
                        int var103 = var100 - this.field443;
                        int var104 = var102 - this.field444;
                        int var105 = var101 - this.field445;
                        int var106 = (int) Math.sqrt((double) (var103 * var103 + var105 * var105));
                        this.field446 = (int) (Math.atan2((double) var104, (double) var106) * 325.949D) & 2047;
                        this.field447 = (int) (Math.atan2((double) var103, (double) var105) * -325.949D) & 2047;
                        if (this.field446 < 128) {
                            this.field446 = 128;
                        }
                        if (this.field446 > 383) {
                            this.field446 = 383;
                        }
                    }
                    this.field213 = -1;
                    return true;
                }
                if (this.field213 == 217) {
                    int var107 = this.field558.method578(false);
                    String var108 = this.field558.method556();
                    class29.field895[var107].field881 = var108;
                    if (this.field540[this.field649] == class29.field895[var107].field919) {
                        this.field189 = true;
                    }
                    this.field213 = -1;
                    return true;
                }
                if (this.field213 == 218) {
                    this.field394 = 0;
                    this.field213 = -1;
                    return true;
                }
                if (this.field213 == 3 || this.field213 == 86) {
                    int var109 = this.field229;
                    int var110 = this.field230;
                    if (this.field213 == 3) {
                        var109 = this.field558.method578(false);
                        var110 = this.field558.method577(true);
                        this.field311 = false;
                    }
                    if (this.field213 == 86) {
                        var109 = this.field558.method578(false);
                        var110 = this.field558.method551();
                        this.field558.method559(-8237);
                        int var111 = 0;
                        while (true) {
                            if (var111 >= 4) {
                                this.field558.method561((byte) 1);
                                this.field311 = true;
                                break;
                            }
                            for (int var112 = 0; var112 < 13; ++var112) {
                                for (int var113 = 0; var113 < 13; ++var113) {
                                    int var114 = this.field558.method560(true, 1);
                                    if (var114 == 1) {
                                        this.field578[var111][var112][var113] = this.field558.method560(true, 26);
                                    } else {
                                        this.field578[var111][var112][var113] = -1;
                                    }
                                }
                            }
                            ++var111;
                        }
                    }
                    if (this.field229 == var109 && this.field230 == var110 && this.field571 == 2) {
                        this.field213 = -1;
                        return true;
                    }
                    this.field229 = var109;
                    this.field230 = var110;
                    this.field248 = (this.field229 - 6) * 8;
                    this.field249 = (this.field230 - 6) * 8;
                    this.field375 = false;
                    if ((this.field229 / 8 == 48 || this.field229 / 8 == 49) && this.field230 / 8 == 48) {
                        this.field375 = true;
                    }
                    if (this.field229 / 8 == 48 && this.field230 / 8 == 148) {
                        this.field375 = true;
                    }
                    this.field571 = 1;
                    this.field376 = System.currentTimeMillis();
                    this.field225.method372(0);
                    this.field409.method382(0, 19850, "Loading - please wait.", 151, 257);
                    this.field409.method382(16777215, 19850, "Loading - please wait.", 150, 256);
                    this.field225.method373(4, 0, super.field1038, 4);
                    if (this.field213 == 3) {
                        int var115 = 0;
                        int var116 = (this.field229 - 6) / 8;
                        label1107: while (true) {
                            if (var116 > (this.field229 + 6) / 8) {
                                this.field542 = new byte[var115][];
                                this.field536 = new byte[var115][];
                                this.field467 = new int[var115];
                                this.field468 = new int[var115];
                                this.field469 = new int[var115];
                                int var118 = 0;
                                int var119 = (this.field229 - 6) / 8;
                                while (true) {
                                    if (var119 > (this.field229 + 6) / 8) {
                                        break label1107;
                                    }
                                    for (int var120 = (this.field230 - 6) / 8; var120 <= (this.field230 + 6) / 8; ++var120) {
                                        this.field467[var118] = (var119 << 8) + var120;
                                        if (this.field375 && (var120 == 49 || var120 == 149 || var120 == 147 || var119 == 50 || var119 == 49 && var120 == 47)) {
                                            this.field468[var118] = -1;
                                            this.field469[var118] = -1;
                                            ++var118;
                                        } else {
                                            int var121 = this.field468[var118] = this.field520.method433(0, var119, 0, var120);
                                            if (var121 != -1) {
                                                this.field520.method450(3, var121);
                                            }
                                            int var122 = this.field469[var118] = this.field520.method433(0, var119, 1, var120);
                                            if (var122 != -1) {
                                                this.field520.method450(3, var122);
                                            }
                                            ++var118;
                                        }
                                    }
                                    ++var119;
                                }
                            }
                            for (int var117 = (this.field230 - 6) / 8; var117 <= (this.field230 + 6) / 8; ++var117) {
                                ++var115;
                            }
                            ++var116;
                        }
                    }
                    if (this.field213 == 86) {
                        int var123 = 0;
                        int[] var124 = new int[676];
                        int var125 = 0;
                        label1068: while (true) {
                            if (var125 >= 4) {
                                this.field542 = new byte[var123][];
                                this.field536 = new byte[var123][];
                                this.field467 = new int[var123];
                                this.field468 = new int[var123];
                                this.field469 = new int[var123];
                                int var133 = 0;
                                while (true) {
                                    if (var133 >= var123) {
                                        break label1068;
                                    }
                                    int var134 = this.field467[var133] = var124[var133];
                                    int var135 = var134 >> 8 & 255;
                                    int var136 = var134 & 255;
                                    int var137 = this.field468[var133] = this.field520.method433(0, var135, 0, var136);
                                    if (var137 != -1) {
                                        this.field520.method450(3, var137);
                                    }
                                    int var138 = this.field469[var133] = this.field520.method433(0, var135, 1, var136);
                                    if (var138 != -1) {
                                        this.field520.method450(3, var138);
                                    }
                                    ++var133;
                                }
                            }
                            for (int var126 = 0; var126 < 13; ++var126) {
                                for (int var127 = 0; var127 < 13; ++var127) {
                                    int var128 = this.field578[var125][var126][var127];
                                    if (var128 != -1) {
                                        int var129 = var128 >> 14 & 1023;
                                        int var130 = var128 >> 3 & 2047;
                                        int var131 = (var129 / 8 << 8) + var130 / 8;
                                        for (int var132 = 0; var132 < var123; ++var132) {
                                            if (var124[var132] == var131) {
                                                var131 = -1;
                                                break;
                                            }
                                        }
                                        if (var131 != -1) {
                                            var124[var123++] = var131;
                                        }
                                    }
                                }
                            }
                            ++var125;
                        }
                    }
                    int var139 = this.field248 - this.field250;
                    int var140 = this.field249 - this.field251;
                    this.field250 = this.field248;
                    this.field251 = this.field249;
                    for (int var141 = 0; var141 < 16384; ++var141) {
                        class10 var142 = this.field270[var141];
                        if (var142 != null) {
                            for (int var143 = 0; var143 < 10; ++var143) {
                                var142.field1559[var143] -= var139;
                                var142.field1560[var143] -= var140;
                            }
                            var142.field1569 -= var139 * 128;
                            var142.field1570 -= var140 * 128;
                        }
                    }
                    for (int var144 = 0; var144 < this.field480; ++var144) {
                        class1 var145 = this.field482[var144];
                        if (var145 != null) {
                            for (int var146 = 0; var146 < 10; ++var146) {
                                var145.field1559[var146] -= var139;
                                var145.field1560[var146] -= var140;
                            }
                            var145.field1569 -= var139 * 128;
                            var145.field1570 -= var140 * 128;
                        }
                    }
                    this.field622 = true;
                    byte var147 = 0;
                    byte var148 = 104;
                    byte var149 = 1;
                    if (var139 < 0) {
                        var147 = 103;
                        var148 = -1;
                        var149 = -1;
                    }
                    byte var150 = 0;
                    byte var151 = 104;
                    byte var152 = 1;
                    if (var140 < 0) {
                        var150 = 103;
                        var151 = -1;
                        var152 = -1;
                    }
                    for (int var153 = var147; var148 != var153; var153 += var149) {
                        for (int var154 = var150; var151 != var154; var154 += var152) {
                            int var155 = var139 + var153;
                            int var156 = var140 + var154;
                            for (int var157 = 0; var157 < 4; ++var157) {
                                if (var155 >= 0 && var156 >= 0 && var155 < 104 && var156 < 104) {
                                    this.field614[var157][var153][var154] = this.field614[var157][var155][var156];
                                } else {
                                    this.field614[var157][var153][var154] = null;
                                }
                            }
                        }
                    }
                    for (class4 var158 = (class4) this.field186.method528(); var158 != null; var158 = (class4) this.field186.method530(false)) {
                        var158.field109 -= var139;
                        var158.field110 -= var140;
                        if (var158.field109 < 0 || var158.field110 < 0 || var158.field109 >= 104 || var158.field110 >= 104) {
                            var158.method589();
                        }
                    }
                    if (this.field394 != 0) {
                        this.field394 -= var139;
                        this.field395 -= var140;
                    }
                    this.field594 = false;
                    this.field213 = -1;
                    return true;
                }
                if (this.field213 == 212) {
                    this.field196 = this.field558.method549();
                    this.field213 = -1;
                    return true;
                }
                if (this.field213 == 35) {
                    int var159 = this.field558.method576(-113);
                    int var160 = this.field558.method577(true);
                    class29 var161 = class29.field895[var159];
                    if (var161 != null && var161.field909 == 0) {
                        if (var160 < 0) {
                            var160 = 0;
                        }
                        if (var160 > var161.field887 - var161.field926) {
                            var160 = var161.field887 - var161.field926;
                        }
                        var161.field889 = var160;
                    }
                    this.field213 = -1;
                    return true;
                }
                if (this.field213 == 64) {
                    if (this.field649 == 12) {
                        this.field189 = true;
                    }
                    this.field608 = this.field558.method549();
                    this.field213 = -1;
                    return true;
                }
                if (this.field213 == 42) {
                    int var162 = this.field558.method578(false);
                    int var163 = this.field558.method576(-113);
                    if (this.field606 != -1) {
                        this.field606 = -1;
                        this.field412 = true;
                    }
                    if (this.field310 != 0) {
                        this.field310 = 0;
                        this.field412 = true;
                    }
                    this.field438 = var162;
                    this.field435 = var163;
                    this.field189 = true;
                    this.field339 = true;
                    this.field205 = false;
                    this.field213 = -1;
                    return true;
                }
                if (this.field213 == 185) {
                    String var164 = this.field558.method556();
                    int var165 = this.field558.method549();
                    int var166 = this.field558.method568(this.field278);
                    if (var165 >= 1 && var165 <= 5) {
                        if (var164.equalsIgnoreCase("null")) {
                            var164 = null;
                        }
                        this.field349[var165 - 1] = var164;
                        this.field350[var165 - 1] = var166 == 0;
                    }
                    this.field213 = -1;
                    return true;
                }
                if (this.field213 == 197) {
                    this.method120(-710);
                    this.field213 = -1;
                    return false;
                }
                if (this.field213 == 215) {
                    this.field549 = this.field558.method549();
                    this.field213 = -1;
                    return true;
                }
                if (this.field213 == 2) {
                    this.field328 = this.field558.method549();
                    this.field327 = this.field558.method569(-234);
                    while (this.field558.field1612 < this.field212) {
                        int var167 = this.field558.method549();
                        this.method50(var167, this.field439, this.field558);
                    }
                    this.field213 = -1;
                    return true;
                }
                if (this.field213 == 158) {
                    long var168 = this.field558.method555(true);
                    int var170 = this.field558.method549();
                    String var171 = class21.method213(31698, class21.method210(0, var168));
                    for (int var172 = 0; var172 < this.field508; ++var172) {
                        if (this.field187[var172] == var168) {
                            if (this.field470[var172] != var170) {
                                this.field470[var172] = var170;
                                this.field189 = true;
                                if (var170 > 0) {
                                    this.method146(5, var171 + " has logged in.", "", false);
                                }
                                if (var170 == 0) {
                                    this.method146(5, var171 + " has logged out.", "", false);
                                }
                            }
                            var171 = null;
                            break;
                        }
                    }
                    if (var171 != null && this.field508 < 200) {
                        this.field187[this.field508] = var168;
                        this.field595[this.field508] = var171;
                        this.field470[this.field508] = var170;
                        ++this.field508;
                        this.field189 = true;
                    }
                    boolean var173 = false;
                    while (!var173) {
                        var173 = true;
                        for (int var174 = 0; var174 < this.field508 - 1; ++var174) {
                            if (this.field470[var174] != field235 && this.field470[var174 + 1] == field235 || this.field470[var174] == 0 && this.field470[var174 + 1] != 0) {
                                int var175 = this.field470[var174];
                                this.field470[var174] = this.field470[var174 + 1];
                                this.field470[var174 + 1] = var175;
                                String var176 = this.field595[var174];
                                this.field595[var174] = this.field595[var174 + 1];
                                this.field595[var174 + 1] = var176;
                                long var177 = this.field187[var174];
                                this.field187[var174] = this.field187[var174 + 1];
                                this.field187[var174 + 1] = var177;
                                this.field189 = true;
                                var173 = false;
                            }
                        }
                    }
                    this.field213 = -1;
                    return true;
                }
                if (this.field213 == 157) {
                    this.field201 = this.field558.method569(-234);
                    this.field279 = this.field558.method578(false);
                    this.field213 = -1;
                    return true;
                }
                if (this.field213 == 45) {
                    int var179 = this.field558.method551();
                    this.method157(-758, var179);
                    if (this.field435 != -1) {
                        this.field435 = -1;
                        this.field189 = true;
                        this.field339 = true;
                    }
                    this.field606 = var179;
                    this.field412 = true;
                    this.field438 = -1;
                    this.field205 = false;
                    this.field213 = -1;
                    return true;
                }
                if (this.field213 == 170) {
                    int var180 = this.field558.method576(-113);
                    class29 var181 = class29.field895[var180];
                    for (int var182 = 0; var182 < var181.field880.length; ++var182) {
                        var181.field880[var182] = -1;
                        var181.field880[var182] = 0;
                    }
                    this.field213 = -1;
                    return true;
                }
                if (this.field213 == 14) {
                    this.field390 = this.field558.method549();
                    if (this.field649 == this.field390) {
                        if (this.field390 == 3) {
                            this.field649 = 1;
                        } else {
                            this.field649 = 3;
                        }
                        this.field189 = true;
                    }
                    this.field213 = -1;
                    return true;
                }
                if (this.field213 == 67) {
                    int var183 = this.field558.method577(true);
                    this.method157(-758, var183);
                    if (this.field606 != -1) {
                        this.field606 = -1;
                        this.field412 = true;
                    }
                    if (this.field310 != 0) {
                        this.field310 = 0;
                        this.field412 = true;
                    }
                    this.field435 = var183;
                    this.field189 = true;
                    this.field339 = true;
                    this.field438 = -1;
                    this.field205 = false;
                    this.field213 = -1;
                    return true;
                }
                signlink.reporterror("T1 - " + this.field213 + "," + this.field212 + " - " + this.field335 + "," + this.field336);
                this.method120(-710);
            } catch (IOException var188) {
                this.method85(2317);
            } catch (Exception var189) {
                String var185 = "T2 - " + this.field213 + "," + this.field335 + "," + this.field336 + " - " + this.field212 + "," + (field442.field1559[0] + this.field248) + "," + (field442.field1560[0] + this.field249) + " - ";
                for (int var186 = 0; var186 < this.field212 && var186 < 50; ++var186) {
                    var185 = var185 + this.field558.field1611[var186] + ",";
                }
                signlink.reporterror(var185);
                this.method120(-710);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(Z)V")
    public final void method67(boolean arg0) {
        this.field619 &= arg0;
        if (this.field196 == 0) {
            if (super.field1052 == 1) {
                int var2 = super.field1053 - 25 - 550;
                int var3 = super.field1054 - 5 - 4;
                if (var2 >= 0 && var3 >= 0 && var2 < 146 && var3 < 151) {
                    var2 -= 73;
                    var3 -= 75;
                    int var4 = this.field528 + this.field352 & 2047;
                    int var5 = class33.field985[var4];
                    int var6 = class33.field986[var4];
                    int var7 = (this.field256 + 256) * var5 >> 8;
                    int var8 = (this.field256 + 256) * var6 >> 8;
                    int var9 = var2 * var8 + var3 * var7 >> 11;
                    int var10 = var3 * var8 - var2 * var7 >> 11;
                    int var11 = field442.field1569 + var9 >> 7;
                    int var12 = field442.field1570 - var10 >> 7;
                    boolean var13 = this.method47(0, field442.field1560[0], field442.field1559[0], 0, 0, true, 1, 349, 0, 0, var12, var11);
                    if (var13) {
                        this.field232.method539(var2);
                        this.field232.method539(var3);
                        this.field232.method540(this.field528);
                        this.field232.method539(57);
                        this.field232.method539(this.field352);
                        this.field232.method539(this.field256);
                        this.field232.method539(89);
                        this.field232.method540(field442.field1569);
                        this.field232.method540(field442.field1570);
                        this.field232.method539(this.field185);
                        this.field232.method539(63);
                    }
                }
                ++field369;
                if (field369 > 1084) {
                    field369 = 0;
                    this.field232.method538(100, (byte) 0);
                    this.field232.method539(0);
                    int var14 = this.field232.field1612;
                    if ((int) (Math.random() * 2.0D) == 0) {
                        this.field232.method540(43797);
                    }
                    this.field232.method539(123);
                    this.field232.method540(31673);
                    this.field232.method540(58545);
                    if ((int) (Math.random() * 2.0D) == 0) {
                        this.field232.method539(54);
                    }
                    if ((int) (Math.random() * 2.0D) == 0) {
                        this.field232.method540(41636);
                    }
                    this.field232.method539(215);
                    this.field232.method539(76);
                    this.field232.method540((int) (Math.random() * 65536.0D));
                    this.field232.method539(203);
                    this.field232.method548(this.field232.field1612 - var14, true);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "([BBZ)V")
    public final void method68(byte[] arg0, byte arg1, boolean arg2) {
        signlink.midifade = arg2 ? 1 : 0;
        signlink.midisave(arg0, arg0.length);
        if (arg1 != 0) {
            this.field614 = null;
        }
    }

    @OriginalMember(owner = "client", name = "s", descriptor = "(I)V")
    public final void method69(int arg0) {
        int var2 = this.field262;
        int var3 = this.field263;
        int var4 = this.field264;
        int var5 = this.field265;
        if (arg0 < 0) {
            int var6 = 6116423;
            class31.method284(var2, var3, var6, (byte) -4, var5, var4);
            class31.method284(var2 + 1, var3 + 1, 0, (byte) -4, 16, var4 - 2);
            class31.method285(var3 + 18, var5 - 19, 0, var2 + 1, var4 - 2, this.field569);
            this.field410.method386(var2 + 3, "Choose Option", var6, -997, var3 + 14);
            int var7 = super.field1046;
            int var8 = super.field1047;
            if (this.field261 == 0) {
                var7 -= 4;
                var8 -= 4;
            }
            if (this.field261 == 1) {
                var7 -= 553;
                var8 -= 205;
            }
            if (this.field261 == 2) {
                var7 -= 17;
                var8 -= 357;
            }
            for (int var9 = 0; var9 < this.field219; ++var9) {
                int var10 = (this.field219 - 1 - var9) * 15 + var3 + 31;
                int var11 = 16777215;
                if (var7 > var2 && var7 < var2 + var4 && var8 > var10 - 13 && var8 < var10 + 3) {
                    var11 = 16776960;
                }
                this.field410.method390(this.field615[var9], var10, (byte) 3, var2 + 3, var11, true);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIIIII)V")
    private final void method70(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        while (arg6 >= 0) {
            this.field232.method539(49);
        }
        if (arg2 >= 1 && arg5 >= 1 && arg2 <= 102 && arg5 <= 102) {
            if (field238 && this.field494 != arg7) {
                return;
            }
            int var9 = 0;
            boolean var10 = true;
            boolean var11 = false;
            boolean var12 = false;
            if (arg0 == 0) {
                var9 = this.field585.method483(arg7, arg2, arg5);
            }
            if (arg0 == 1) {
                var9 = this.field585.method484(arg5, -997, arg7, arg2);
            }
            if (arg0 == 2) {
                var9 = this.field585.method485(arg7, arg2, arg5);
            }
            if (arg0 == 3) {
                var9 = this.field585.method486(arg7, arg2, arg5);
            }
            if (var9 != 0) {
                int var13 = this.field585.method487(arg7, arg2, arg5, var9);
                int var14 = var9 >> 14 & 32767;
                int var15 = var13 & 31;
                int var16 = var13 >> 6;
                if (arg0 == 0) {
                    this.field585.method474(this.field512, arg2, arg7, arg5);
                    class48 var17 = class48.method410(var14);
                    if (var17.field1254) {
                        this.field391[arg7].method220(var15, var16, var17.field1295, arg2, arg5, true);
                    }
                }
                if (arg0 == 1) {
                    this.field585.method475(arg7, arg2, true, arg5);
                }
                if (arg0 == 2) {
                    this.field585.method476(3, arg7, arg2, arg5);
                    class48 var18 = class48.method410(var14);
                    if (var18.field1289 + arg2 > 103 || var18.field1289 + arg5 > 103 || var18.field1255 + arg2 > 103 || var18.field1255 + arg5 > 103) {
                        return;
                    }
                    if (var18.field1254) {
                        this.field391[arg7].method221(var18.field1289, var18.field1255, var16, arg5, arg2, false, var18.field1295);
                    }
                }
                if (arg0 == 3) {
                    this.field585.method477(arg2, -11, arg5, arg7);
                    class48 var19 = class48.method410(var14);
                    if (var19.field1254 && var19.field1271) {
                        this.field391[arg7].method223(arg5, arg2, this.field184);
                    }
                }
            }
            if (arg3 >= 0) {
                int var20 = arg7;
                if (arg7 < 3 && (this.field634[1][arg2][arg5] & 2) == 2) {
                    var20 = arg7 + 1;
                }
                class34.method323(this.field391[arg7], arg5, arg2, arg4, var20, arg1, this.field585, 8, arg3, this.field377, arg7);
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(B)V")
    public final void method71(byte arg0) {
        if (arg0 != 1) {
            this.field232.method539(33);
        }
        signlink.midifade = 0;
        signlink.midi = "stop";
    }

    @OriginalMember(owner = "client", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        return signlink.mainapp != null ? signlink.mainapp.getParameter(arg0) : super.getParameter(arg0);
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIII)V")
    public final void method72(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = this.field585.method483(arg0, arg2, arg4);
        this.field212 += arg5;
        if (var7 != 0) {
            int var8 = this.field585.method487(arg0, arg2, arg4, var7);
            int var9 = var8 >> 6 & 3;
            int var10 = var8 & 31;
            int var11 = arg1;
            if (var7 > 0) {
                var11 = arg3;
            }
            int[] var12 = this.field396.field692;
            int var13 = (103 - arg4) * 512 * 4 + arg2 * 4 + 24624;
            int var14 = var7 >> 14 & 32767;
            class48 var15 = class48.method410(var14);
            if (var15.field1291 != -1) {
                class15 var16 = this.field190[var15.field1291];
                if (var16 != null) {
                    int var17 = (var15.field1289 * 4 - var16.field705) / 2;
                    int var18 = (var15.field1255 * 4 - var16.field706) / 2;
                    var16.method192((104 - arg4 - var15.field1255) * 4 + 48 + var18, arg2 * 4 + 48 + var17, 49598);
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
        int var19 = this.field585.method485(arg0, arg2, arg4);
        if (var19 != 0) {
            int var20 = this.field585.method487(arg0, arg2, arg4, var19);
            int var21 = var20 >> 6 & 3;
            int var22 = var20 & 31;
            int var23 = var19 >> 14 & 32767;
            class48 var24 = class48.method410(var23);
            if (var24.field1291 != -1) {
                class15 var25 = this.field190[var24.field1291];
                if (var25 != null) {
                    int var26 = (var24.field1289 * 4 - var25.field705) / 2;
                    int var27 = (var24.field1255 * 4 - var25.field706) / 2;
                    var25.method192((104 - arg4 - var24.field1255) * 4 + 48 + var27, arg2 * 4 + 48 + var26, 49598);
                }
            } else if (var22 == 9) {
                int var28 = 15658734;
                if (var19 > 0) {
                    var28 = 15597568;
                }
                int[] var29 = this.field396.field692;
                int var30 = (103 - arg4) * 512 * 4 + arg2 * 4 + 24624;
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
        int var31 = this.field585.method486(arg0, arg2, arg4);
        if (var31 != 0) {
            int var32 = var31 >> 14 & 32767;
            class48 var33 = class48.method410(var32);
            if (var33.field1291 != -1) {
                class15 var34 = this.field190[var33.field1291];
                if (var34 != null) {
                    int var35 = (var33.field1289 * 4 - var34.field705) / 2;
                    int var36 = (var33.field1255 * 4 - var34.field706) / 2;
                    var34.method192((104 - arg4 - var33.field1255) * 4 + 48 + var36, arg2 * 4 + 48 + var35, 49598);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(I[BI)Z")
    public final boolean method73(int arg0, byte[] arg1, int arg2) {
        if (arg0 != 0) {
            this.method119();
        }
        return arg1 == null ? true : signlink.wavesave(arg1, arg2);
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(III)V")
    public final void method74(int arg0, int arg1, int arg2) {
        int var4 = 0;
        for (int var5 = 0; var5 < 100; ++var5) {
            if (this.field506[var5] != null) {
                int var6 = this.field504[var5];
                int var7 = 70 - var4 * 14 + this.field618 + 4;
                if (var7 < -20) {
                    break;
                }
                String var8 = this.field505[var5];
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
                if ((var6 == 1 || var6 == 2) && (var6 == 1 || this.field628 == 0 || this.field628 == 1 && this.method26(var8, 15404))) {
                    if (arg1 > var7 - 14 && arg1 <= var7 && !var8.equals(field442.field13)) {
                        if (this.field379 >= 1) {
                            this.field615[this.field219] = "Report abuse @whi@" + var8;
                            this.field366[this.field219] = 399;
                            ++this.field219;
                        }
                        this.field615[this.field219] = "Add ignore @whi@" + var8;
                        this.field366[this.field219] = 92;
                        ++this.field219;
                        this.field615[this.field219] = "Add friend @whi@" + var8;
                        this.field366[this.field219] = 264;
                        ++this.field219;
                    }
                    ++var4;
                }
                if ((var6 == 3 || var6 == 7) && this.field268 == 0 && (var6 == 7 || this.field612 == 0 || this.field612 == 1 && this.method26(var8, 15404))) {
                    if (arg1 > var7 - 14 && arg1 <= var7) {
                        if (this.field379 >= 1) {
                            this.field615[this.field219] = "Report abuse @whi@" + var8;
                            this.field366[this.field219] = 399;
                            ++this.field219;
                        }
                        this.field615[this.field219] = "Add ignore @whi@" + var8;
                        this.field366[this.field219] = 92;
                        ++this.field219;
                        this.field615[this.field219] = "Add friend @whi@" + var8;
                        this.field366[this.field219] = 264;
                        ++this.field219;
                    }
                    ++var4;
                }
                if (var6 == 4 && (this.field357 == 0 || this.field357 == 1 && this.method26(var8, 15404))) {
                    if (arg1 > var7 - 14 && arg1 <= var7) {
                        this.field615[this.field219] = "Accept trade @whi@" + var8;
                        this.field366[this.field219] = 851;
                        ++this.field219;
                    }
                    ++var4;
                }
                if ((var6 == 5 || var6 == 6) && this.field268 == 0 && this.field612 < 2) {
                    ++var4;
                }
                if (var6 == 8 && (this.field357 == 0 || this.field357 == 1 && this.method26(var8, 15404))) {
                    if (arg1 > var7 - 14 && arg1 <= var7) {
                        this.field615[this.field219] = "Accept challenge @whi@" + var8;
                        this.field366[this.field219] = 471;
                        ++this.field219;
                    }
                    ++var4;
                }
            }
        }
        if (arg2 != 0) {
            this.field213 = this.field558.method549();
        }
    }

    @OriginalMember(owner = "client", name = "t", descriptor = "(I)I")
    public final int method75(int arg0) {
        if (arg0 < 8 || arg0 > 8) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        int var3 = 3;
        if (this.field446 < 310) {
            int var4 = this.field443 >> 7;
            int var5 = this.field445 >> 7;
            int var6 = field442.field1569 >> 7;
            int var7 = field442.field1570 >> 7;
            if ((this.field634[this.field494][var4][var5] & 4) != 0) {
                var3 = this.field494;
            }
            int var8;
            if (var6 > var4) {
                var8 = var6 - var4;
            } else {
                var8 = var4 - var6;
            }
            int var9;
            if (var7 > var5) {
                var9 = var7 - var5;
            } else {
                var9 = var5 - var7;
            }
            if (var8 > var9) {
                int var10 = var9 * 65536 / var8;
                int var11 = 32768;
                while (var4 != var6) {
                    if (var4 < var6) {
                        ++var4;
                    } else if (var4 > var6) {
                        --var4;
                    }
                    if ((this.field634[this.field494][var4][var5] & 4) != 0) {
                        var3 = this.field494;
                    }
                    var11 += var10;
                    if (var11 >= 65536) {
                        var11 -= 65536;
                        if (var5 < var7) {
                            ++var5;
                        } else if (var5 > var7) {
                            --var5;
                        }
                        if ((this.field634[this.field494][var4][var5] & 4) != 0) {
                            var3 = this.field494;
                        }
                    }
                }
            } else {
                int var12 = var8 * 65536 / var9;
                int var13 = 32768;
                while (var5 != var7) {
                    if (var5 < var7) {
                        ++var5;
                    } else if (var5 > var7) {
                        --var5;
                    }
                    if ((this.field634[this.field494][var4][var5] & 4) != 0) {
                        var3 = this.field494;
                    }
                    var13 += var12;
                    if (var13 >= 65536) {
                        var13 -= 65536;
                        if (var4 < var6) {
                            ++var4;
                        } else if (var4 > var6) {
                            --var4;
                        }
                        if ((this.field634[this.field494][var4][var5] & 4) != 0) {
                            var3 = this.field494;
                        }
                    }
                }
            }
        }
        if ((this.field634[this.field494][field442.field1569 >> 7][field442.field1570 >> 7] & 4) != 0) {
            var3 = this.field494;
        }
        return var3;
    }

    @OriginalMember(owner = "client", name = "u", descriptor = "(I)I")
    public final int method76(int arg0) {
        if (arg0 < 1 || arg0 > 1) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        int var3 = this.method81(0, this.field445, this.field494, this.field443);
        return var3 - this.field444 < 800 && (this.field634[this.field494][this.field443 >> 7][this.field445 >> 7] & 4) != 0 ? this.field494 : 3;
    }

    @OriginalMember(owner = "client", name = "v", descriptor = "(I)V")
    public final void method77(int arg0) {
        short var2 = 256;
        if (this.field559 > 0) {
            for (int var3 = 0; var3 < 256; ++var3) {
                if (this.field559 > 768) {
                    this.field206[var3] = this.method148(this.field208[var3], this.field207[var3], 1024 - this.field559, 0);
                } else if (this.field559 > 256) {
                    this.field206[var3] = this.field208[var3];
                } else {
                    this.field206[var3] = this.method148(this.field207[var3], this.field208[var3], 256 - this.field559, 0);
                }
            }
        } else if (this.field560 > 0) {
            for (int var4 = 0; var4 < 256; ++var4) {
                if (this.field560 > 768) {
                    this.field206[var4] = this.method148(this.field209[var4], this.field207[var4], 1024 - this.field560, 0);
                } else if (this.field560 > 256) {
                    this.field206[var4] = this.field209[var4];
                } else {
                    this.field206[var4] = this.method148(this.field207[var4], this.field209[var4], 256 - this.field560, 0);
                }
            }
        } else {
            for (int var5 = 0; var5 < 256; ++var5) {
                this.field206[var5] = this.field207[var5];
            }
        }
        for (int var6 = 0; var6 < 33920; ++var6) {
            this.field298.field1174[var6] = this.field579.field692[var6];
        }
        int var7 = 0;
        int var8 = 1152;
        for (int var9 = 1; var9 < var2 - 1; ++var9) {
            int var23 = (var2 - var9) * this.field406[var9] / var2;
            int var24 = var23 + 22;
            if (var24 < 0) {
                var24 = 0;
            }
            var7 += var24;
            for (int var25 = var24; var25 < 128; ++var25) {
                int var26 = this.field582[var7++];
                if (var26 != 0) {
                    int var28 = 256 - var26;
                    int var29 = this.field206[var26];
                    int var30 = this.field298.field1174[var8];
                    this.field298.field1174[var8++] = ((var29 & 16711935) * var26 + (var30 & 16711935) * var28 & -16711936) + ((var29 & 65280) * var26 + (var30 & 65280) * var28 & 16711680) >> 8;
                } else {
                    ++var8;
                }
            }
            var8 += var24;
        }
        this.field298.method373(0, 0, super.field1038, 0);
        if (arg0 != 0) {
            this.field232.method539(215);
        }
        for (int var10 = 0; var10 < 33920; ++var10) {
            this.field299.field1174[var10] = this.field580.field692[var10];
        }
        int var11 = 0;
        int var12 = 1176;
        for (int var13 = 1; var13 < var2 - 1; ++var13) {
            int var14 = (var2 - var13) * this.field406[var13] / var2;
            int var15 = 103 - var14;
            int var16 = var12 + var14;
            for (int var17 = 0; var17 < var15; ++var17) {
                int var18 = this.field582[var11++];
                if (var18 != 0) {
                    int var20 = 256 - var18;
                    int var21 = this.field206[var18];
                    int var22 = this.field299.field1174[var16];
                    this.field299.field1174[var16++] = ((var21 & 16711935) * var18 + (var22 & 16711935) * var20 & -16711936) + ((var21 & 65280) * var18 + (var22 & 65280) * var20 & 16711680) >> 8;
                } else {
                    ++var16;
                }
            }
            var11 += 128 - var15;
            var12 = 128 - var15 - var14 + var16;
        }
        this.field299.method373(0, 0, super.field1038, 637);
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILJDSNLLMP;IIB)V")
    public final void method78(int arg0, class29 arg1, int arg2, int arg3, byte arg4) {
        if (arg1.field909 == 0 && arg1.field929 != null) {
            if (!arg1.field882 || this.field422 == arg1.field884 || this.field274 == arg1.field884 || this.field400 == arg1.field884) {
                int var6 = class31.field958;
                int var7 = class31.field956;
                int var8 = class31.field959;
                int var9 = class31.field957;
                class31.method281(arg3, arg1.field926 + arg3, arg1.field934 + arg0, arg0, 1);
                int var10 = arg1.field929.length;
                if (arg4 == 2) {
                    boolean var11 = false;
                } else {
                    this.field213 = this.field558.method549();
                }
                for (int var12 = 0; var12 < var10; ++var12) {
                    int var13 = arg1.field938[var12] + arg0;
                    int var14 = arg1.field911[var12] + arg3 - arg2;
                    class29 var15 = class29.field895[arg1.field929[var12]];
                    int var16 = var15.field908 + var13;
                    int var17 = var15.field933 + var14;
                    if (var15.field892 > 0) {
                        this.method61((byte) 5, var15);
                    }
                    if (var15.field909 == 0) {
                        if (var15.field889 > var15.field887 - var15.field926) {
                            var15.field889 = var15.field887 - var15.field926;
                        }
                        if (var15.field889 < 0) {
                            var15.field889 = 0;
                        }
                        this.method78(var16, var15, var15.field889, var17, (byte) 2);
                        if (var15.field887 > var15.field926) {
                            this.method51(var15.field887, false, var15.field889, var15.field926, var17, var15.field934 + var16);
                        }
                    } else if (var15.field909 != 1) {
                        if (var15.field909 == 2) {
                            int var18 = 0;
                            for (int var19 = 0; var19 < var15.field926; ++var19) {
                                for (int var20 = 0; var20 < var15.field934; ++var20) {
                                    int var21 = (var15.field930 + 32) * var20 + var16;
                                    int var22 = (var15.field886 + 32) * var19 + var17;
                                    if (var18 < 20) {
                                        var21 += var15.field902[var18];
                                        var22 += var15.field928[var18];
                                    }
                                    if (var15.field880[var18] <= 0) {
                                        if (var15.field916 != null && var18 < 20) {
                                            class14 var31 = var15.field916[var18];
                                            if (var31 != null) {
                                                var31.method179(var22, var21, 49598);
                                            }
                                        }
                                    } else {
                                        int var23 = 0;
                                        int var24 = 0;
                                        int var25 = var15.field880[var18] - 1;
                                        if (var21 > class31.field958 - 32 && var21 < class31.field959 && var22 > class31.field956 - 32 && var22 < class31.field957 || this.field307 != 0 && this.field306 == var18) {
                                            int var26 = 0;
                                            if (this.field322 == 1 && this.field323 == var18 && this.field324 == var15.field884) {
                                                var26 = 16777215;
                                            }
                                            class14 var27 = class3.method14(var25, var15.field912[var18], var26, 0);
                                            if (var27 != null) {
                                                if (this.field307 != 0 && this.field306 == var18 && this.field305 == var15.field884) {
                                                    var23 = super.field1046 - this.field308;
                                                    var24 = super.field1047 - this.field309;
                                                    if (var23 < 5 && var23 > -5) {
                                                        var23 = 0;
                                                    }
                                                    if (var24 < 5 && var24 > -5) {
                                                        var24 = 0;
                                                    }
                                                    if (this.field424 < 5) {
                                                        var23 = 0;
                                                        var24 = 0;
                                                    }
                                                    var27.method181(var22 + var24, 128, this.field534, var21 + var23);
                                                    if (var22 + var24 < class31.field956 && arg1.field889 > 0) {
                                                        int var28 = (class31.field956 - var22 - var24) * this.field329 / 3;
                                                        if (var28 > this.field329 * 10) {
                                                            var28 = this.field329 * 10;
                                                        }
                                                        if (var28 > arg1.field889) {
                                                            var28 = arg1.field889;
                                                        }
                                                        arg1.field889 -= var28;
                                                        this.field309 += var28;
                                                    }
                                                    if (var22 + var24 + 32 > class31.field957 && arg1.field889 < arg1.field887 - arg1.field926) {
                                                        int var29 = (var22 + var24 + 32 - class31.field957) * this.field329 / 3;
                                                        if (var29 > this.field329 * 10) {
                                                            var29 = this.field329 * 10;
                                                        }
                                                        if (var29 > arg1.field887 - arg1.field926 - arg1.field889) {
                                                            var29 = arg1.field887 - arg1.field926 - arg1.field889;
                                                        }
                                                        arg1.field889 += var29;
                                                        this.field309 -= var29;
                                                    }
                                                } else if (this.field316 != 0 && this.field315 == var18 && this.field314 == var15.field884) {
                                                    var27.method181(var22, 128, this.field534, var21);
                                                } else {
                                                    var27.method179(var22, var21, 49598);
                                                }
                                                if (var27.field697 == 33 || var15.field912[var18] != 1) {
                                                    int var30 = var15.field912[var18];
                                                    this.field408.method386(var21 + 1 + var23, method89(true, var30), 0, -997, var22 + 10 + var24);
                                                    this.field408.method386(var21 + var23, method89(true, var30), 16776960, -997, var22 + 9 + var24);
                                                }
                                            }
                                        }
                                    }
                                    ++var18;
                                }
                            }
                        } else if (var15.field909 == 3) {
                            boolean var32 = false;
                            if (this.field400 == var15.field884 || this.field274 == var15.field884 || this.field422 == var15.field884) {
                                var32 = true;
                            }
                            int var33;
                            if (this.method87((byte) 114, var15)) {
                                var33 = var15.field890;
                                if (var32 && var15.field921 != 0) {
                                    var33 = var15.field921;
                                }
                            } else {
                                var33 = var15.field883;
                                if (var32 && var15.field891 != 0) {
                                    var33 = var15.field891;
                                }
                            }
                            if (var15.field888 == 0) {
                                if (var15.field943) {
                                    class31.method284(var16, var17, var33, (byte) -4, var15.field926, var15.field934);
                                } else {
                                    class31.method285(var17, var15.field926, var33, var16, var15.field934, this.field569);
                                }
                            } else if (var15.field943) {
                                class31.method283(var15.field926, var33, var15.field934, var17, var16, (byte) 2, 256 - (var15.field888 & 255));
                            } else {
                                class31.method286(var33, this.field590, var15.field934, var16, 256 - (var15.field888 & 255), var15.field926, var17);
                            }
                        } else if (var15.field909 == 4) {
                            class45 var34 = var15.field913;
                            String var35 = var15.field881;
                            boolean var36 = false;
                            if (this.field400 == var15.field884 || this.field274 == var15.field884 || this.field422 == var15.field884) {
                                var36 = true;
                            }
                            int var37;
                            if (this.method87((byte) 114, var15)) {
                                var37 = var15.field890;
                                if (var36 && var15.field921 != 0) {
                                    var37 = var15.field921;
                                }
                                if (var15.field878.length() > 0) {
                                    var35 = var15.field878;
                                }
                            } else {
                                var37 = var15.field883;
                                if (var36 && var15.field891 != 0) {
                                    var37 = var15.field891;
                                }
                            }
                            if (var15.field935 == 6 && this.field205) {
                                var35 = "Please wait...";
                                var37 = var15.field883;
                            }
                            if (class31.field954 == 479) {
                                if (var37 == 16776960) {
                                    var37 = 255;
                                }
                                if (var37 == 49152) {
                                    var37 = 16777215;
                                }
                            }
                            int var38 = var34.field1207 + var17;
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
                                                                        var35 = var35.substring(0, var43) + this.method113(false, this.method153(false, var15, 4)) + var35.substring(var43 + 2);
                                                                    }
                                                                }
                                                                var35 = var35.substring(0, var42) + this.method113(false, this.method153(false, var15, 3)) + var35.substring(var42 + 2);
                                                            }
                                                        }
                                                        var35 = var35.substring(0, var41) + this.method113(false, this.method153(false, var15, 2)) + var35.substring(var41 + 2);
                                                    }
                                                }
                                                var35 = var35.substring(0, var40) + this.method113(false, this.method153(false, var15, 1)) + var35.substring(var40 + 2);
                                            }
                                        }
                                        var35 = var35.substring(0, var39) + this.method113(false, this.method153(false, var15, 0)) + var35.substring(var39 + 2);
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
                                if (var15.field944) {
                                    var34.method383(var38, var37, var15.field934 / 2 + var16, var15.field924, var45, 6);
                                } else {
                                    var34.method390(var45, var38, (byte) 3, var16, var37, var15.field924);
                                }
                                var38 += var34.field1207;
                            }
                        } else if (var15.field909 == 5) {
                            class14 var46;
                            if (this.method87((byte) 114, var15)) {
                                var46 = var15.field910;
                            } else {
                                var46 = var15.field879;
                            }
                            if (var46 != null) {
                                var46.method179(var17, var16, 49598);
                            }
                        } else if (var15.field909 == 6) {
                            int var47 = class33.field981;
                            int var48 = class33.field982;
                            class33.field981 = var15.field934 / 2 + var16;
                            class33.field982 = var15.field926 / 2 + var17;
                            int var49 = class33.field985[var15.field904] * var15.field903 >> 16;
                            int var50 = class33.field986[var15.field904] * var15.field903 >> 16;
                            boolean var51 = this.method87((byte) 114, var15);
                            int var52;
                            if (var51) {
                                var52 = var15.field894;
                            } else {
                                var52 = var15.field893;
                            }
                            class39 var53;
                            if (var52 == -1) {
                                var53 = var15.method272(var51, -1, -837, -1);
                            } else {
                                class9 var54 = class9.field163[var52];
                                var53 = var15.method272(var51, var54.field165[var15.field936], -837, var54.field166[var15.field936]);
                            }
                            if (var53 != null) {
                                var53.method366(0, var15.field905, 0, var15.field904, 0, var49, var50);
                            }
                            class33.field981 = var47;
                            class33.field982 = var48;
                        } else if (var15.field909 == 7) {
                            class45 var55 = var15.field913;
                            int var56 = 0;
                            for (int var57 = 0; var57 < var15.field926; ++var57) {
                                for (int var58 = 0; var58 < var15.field934; ++var58) {
                                    if (var15.field880[var56] > 0) {
                                        class3 var59 = class3.method13(var15.field880[var56] - 1);
                                        String var60 = var59.field56;
                                        if (var59.field101 || var15.field912[var56] != 1) {
                                            var60 = var60 + " x" + method135(var15.field912[var56], false);
                                        }
                                        int var61 = (var15.field930 + 115) * var58 + var16;
                                        int var62 = (var15.field886 + 12) * var57 + var17;
                                        if (var15.field944) {
                                            var55.method383(var62, var15.field883, var15.field934 / 2 + var61, var15.field924, var60, 6);
                                        } else {
                                            var55.method390(var60, var62, (byte) 3, var61, var15.field883, var15.field924);
                                        }
                                    }
                                    ++var56;
                                }
                            }
                        }
                    }
                }
                class31.method281(var7, var9, var8, var6, 1);
            }
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(I)V")
    public final void method79(int arg0) {
        if (arg0 != -2522) {
            this.field330 = !this.field330;
        }
        if (!this.field471 && !this.field399 && !this.field541) {
            ++field495;
            if (!this.field619) {
                this.method132(false, this.field538);
            } else {
                this.method39((byte) 9);
            }
            this.field420 = 0;
        } else {
            this.method49(372);
        }
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(B)V")
    public final void method80(byte arg0) {
        if (this.field322 == 0 && this.field454 == 0) {
            this.field615[this.field219] = "Walk here";
            this.field366[this.field219] = 746;
            this.field364[this.field219] = super.field1046;
            this.field365[this.field219] = super.field1047;
            ++this.field219;
        }
        int var2 = -1;
        for (int var3 = 0; var3 < class39.field1167; ++var3) {
            int var4 = class39.field1168[var3];
            int var5 = var4 & 127;
            int var6 = var4 >> 7 & 127;
            int var7 = var4 >> 29 & 3;
            int var8 = var4 >> 14 & 32767;
            if (var2 != var4) {
                var2 = var4;
                if (var7 == 2 && this.field585.method487(this.field494, var5, var6, var4) >= 0) {
                    class48 var9 = class48.method410(var8);
                    if (var9.field1251 != null) {
                        var9 = var9.method406(3);
                    }
                    if (var9 == null) {
                        continue;
                    }
                    if (this.field322 == 1) {
                        this.field615[this.field219] = "Use " + this.field326 + " with @cya@" + var9.field1282;
                        this.field366[this.field219] = 888;
                        this.field367[this.field219] = var4;
                        this.field364[this.field219] = var5;
                        this.field365[this.field219] = var6;
                        ++this.field219;
                    } else if (this.field454 == 1) {
                        if ((this.field456 & 4) == 4) {
                            this.field615[this.field219] = this.field457 + " @cya@" + var9.field1282;
                            this.field366[this.field219] = 330;
                            this.field367[this.field219] = var4;
                            this.field364[this.field219] = var5;
                            this.field365[this.field219] = var6;
                            ++this.field219;
                        }
                    } else {
                        if (var9.field1270 != null) {
                            for (int var10 = 4; var10 >= 0; --var10) {
                                if (var9.field1270[var10] != null) {
                                    this.field615[this.field219] = var9.field1270[var10] + " @cya@" + var9.field1282;
                                    if (var10 == 0) {
                                        this.field366[this.field219] = 234;
                                    }
                                    if (var10 == 1) {
                                        this.field366[this.field219] = 794;
                                    }
                                    if (var10 == 2) {
                                        this.field366[this.field219] = 164;
                                    }
                                    if (var10 == 3) {
                                        this.field366[this.field219] = 594;
                                    }
                                    if (var10 == 4) {
                                        this.field366[this.field219] = 1025;
                                    }
                                    this.field367[this.field219] = var4;
                                    this.field364[this.field219] = var5;
                                    this.field365[this.field219] = var6;
                                    ++this.field219;
                                }
                            }
                        }
                        this.field615[this.field219] = "Examine @cya@" + var9.field1282;
                        this.field366[this.field219] = 1446;
                        this.field367[this.field219] = var9.field1280 << 14;
                        this.field364[this.field219] = var5;
                        this.field365[this.field219] = var6;
                        ++this.field219;
                    }
                }
                if (var7 == 1) {
                    class10 var11 = this.field270[var8];
                    if (var11.field653.field754 == 1 && (var11.field1569 & 127) == 64 && (var11.field1570 & 127) == 64) {
                        for (int var12 = 0; var12 < this.field271; ++var12) {
                            class10 var15 = this.field270[this.field272[var12]];
                            if (var15 != null && var11 != var15 && var15.field653.field754 == 1 && var11.field1569 == var15.field1569 && var11.field1570 == var15.field1570) {
                                this.method147((byte) -41, this.field272[var12], var6, var15.field653, var5);
                            }
                        }
                        for (int var13 = 0; var13 < this.field483; ++var13) {
                            class1 var14 = this.field482[this.field484[var13]];
                            if (var14 != null && var11.field1569 == var14.field1569 && var11.field1570 == var14.field1570) {
                                this.method152(var14, var6, 3, this.field484[var13], var5);
                            }
                        }
                    }
                    this.method147((byte) -41, var8, var6, var11.field653, var5);
                }
                if (var7 == 0) {
                    class1 var16 = this.field482[var8];
                    if ((var16.field1569 & 127) == 64 && (var16.field1570 & 127) == 64) {
                        for (int var17 = 0; var17 < this.field271; ++var17) {
                            class10 var20 = this.field270[this.field272[var17]];
                            if (var20 != null && var20.field653.field754 == 1 && var16.field1569 == var20.field1569 && var16.field1570 == var20.field1570) {
                                this.method147((byte) -41, this.field272[var17], var6, var20.field653, var5);
                            }
                        }
                        for (int var18 = 0; var18 < this.field483; ++var18) {
                            class1 var19 = this.field482[this.field484[var18]];
                            if (var19 != null && var16 != var19 && var16.field1569 == var19.field1569 && var16.field1570 == var19.field1570) {
                                this.method152(var19, var6, 3, this.field484[var18], var5);
                            }
                        }
                    }
                    this.method152(var16, var6, 3, var8, var5);
                }
                if (var7 == 3) {
                    class65 var21 = this.field614[this.field494][var5][var6];
                    if (var21 != null) {
                        for (class44 var22 = (class44) var21.method529(0); var22 != null; var22 = (class44) var21.method531(398)) {
                            class3 var23 = class3.method13(var22.field1196);
                            if (this.field322 == 1) {
                                this.field615[this.field219] = "Use " + this.field326 + " with @lre@" + var23.field56;
                                this.field366[this.field219] = 158;
                                this.field367[this.field219] = var22.field1196;
                                this.field364[this.field219] = var5;
                                this.field365[this.field219] = var6;
                                ++this.field219;
                            } else if (this.field454 == 1) {
                                if ((this.field456 & 1) == 1) {
                                    this.field615[this.field219] = this.field457 + " @lre@" + var23.field56;
                                    this.field366[this.field219] = 960;
                                    this.field367[this.field219] = var22.field1196;
                                    this.field364[this.field219] = var5;
                                    this.field365[this.field219] = var6;
                                    ++this.field219;
                                }
                            } else {
                                for (int var24 = 4; var24 >= 0; --var24) {
                                    if (var23.field88 != null && var23.field88[var24] != null) {
                                        this.field615[this.field219] = var23.field88[var24] + " @lre@" + var23.field56;
                                        if (var24 == 0) {
                                            this.field366[this.field219] = 211;
                                        }
                                        if (var24 == 1) {
                                            this.field366[this.field219] = 498;
                                        }
                                        if (var24 == 2) {
                                            this.field366[this.field219] = 624;
                                        }
                                        if (var24 == 3) {
                                            this.field366[this.field219] = 287;
                                        }
                                        if (var24 == 4) {
                                            this.field366[this.field219] = 47;
                                        }
                                        this.field367[this.field219] = var22.field1196;
                                        this.field364[this.field219] = var5;
                                        this.field365[this.field219] = var6;
                                        ++this.field219;
                                    } else if (var24 == 2) {
                                        this.field615[this.field219] = "Take @lre@" + var23.field56;
                                        this.field366[this.field219] = 624;
                                        this.field367[this.field219] = var22.field1196;
                                        this.field364[this.field219] = var5;
                                        this.field365[this.field219] = var6;
                                        ++this.field219;
                                    }
                                }
                                this.field615[this.field219] = "Examine @lre@" + var23.field56;
                                this.field366[this.field219] = 1498;
                                this.field367[this.field219] = var22.field1196;
                                this.field364[this.field219] = var5;
                                this.field365[this.field219] = var6;
                                ++this.field219;
                            }
                        }
                    }
                }
            }
        }
        if (arg0 != -41) {
            this.field232.method539(188);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIII)I")
    public final int method81(int arg0, int arg1, int arg2, int arg3) {
        int var5 = arg3 >> 7;
        int var6 = arg1 >> 7;
        if (var5 >= 0 && var6 >= 0 && var5 <= 103 && var6 <= 103) {
            int var7 = arg2;
            if (arg2 < 3 && (this.field634[1][var5][var6] & 2) == 2) {
                var7 = arg2 + 1;
            }
            int var8 = arg3 & 127;
            int var9 = arg1 & 127;
            if (arg0 != 0) {
                for (int var10 = 1; var10 > 0; ++var10) {
                }
            }
            int var11 = (128 - var8) * this.field377[var7][var5][var6] + this.field377[var7][var5 + 1][var6] * var8 >> 7;
            int var12 = (128 - var8) * this.field377[var7][var5][var6 + 1] + this.field377[var7][var5 + 1][var6 + 1] * var8 >> 7;
            return (128 - var9) * var11 + var9 * var12 >> 7;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IZ)V")
    public final void method82(int arg0, boolean arg1) {
        if (arg1) {
            for (int var3 = 1; var3 > 0; ++var3) {
            }
        }
        if (arg0 >= 0) {
            if (this.field310 != 0) {
                this.field310 = 0;
                this.field412 = true;
            }
            int var4 = this.field364[arg0];
            int var5 = this.field365[arg0];
            int var6 = this.field366[arg0];
            int var7 = this.field367[arg0];
            if (var6 >= 2000) {
                var6 -= 2000;
            }
            if (var6 == 164) {
                this.method92(var5, var7, var4, 7);
                this.field232.method538(13, (byte) 0);
                this.field232.method573(var7 >> 14 & 32767, true);
                this.field232.method573(this.field249 + var5, true);
                this.field232.method575(this.field248 + var4, (byte) 64);
            }
            if (var6 == 685) {
                this.field232.method538(95, (byte) 0);
                this.field232.method540(var5);
                class29 var8 = class29.field895[var5];
                if (var8.field927 != null && var8.field927[0][0] == 5) {
                    int var9 = var8.field927[0][1];
                    this.field631[var9] = 1 - this.field631[var9];
                    this.method124(691, var9);
                    this.field189 = true;
                }
            }
            if (var6 == 585) {
                class10 var10 = this.field270[var7];
                if (var10 != null) {
                    this.method47(0, field442.field1560[0], field442.field1559[0], 0, 1, false, 2, 349, 1, 0, var10.field1560[0], var10.field1559[0]);
                    this.field239 = super.field1053;
                    this.field240 = super.field1054;
                    this.field242 = 2;
                    this.field241 = 0;
                    this.field232.method538(227, (byte) 0);
                    this.field232.method574(6, var7);
                }
            }
            if (var6 == 960) {
                boolean var11 = this.method47(0, field442.field1560[0], field442.field1559[0], 0, 0, false, 2, 349, 0, 0, var5, var4);
                if (!var11) {
                    this.method47(0, field442.field1560[0], field442.field1559[0], 0, 1, false, 2, 349, 1, 0, var5, var4);
                }
                this.field239 = super.field1053;
                this.field240 = super.field1054;
                this.field242 = 2;
                this.field241 = 0;
                this.field232.method538(125, (byte) 0);
                this.field232.method574(6, this.field248 + var4);
                this.field232.method573(this.field455, true);
                this.field232.method574(6, this.field249 + var5);
                this.field232.method574(6, var7);
            }
            if (var6 == 404) {
                class1 var13 = this.field482[var7];
                if (var13 != null) {
                    this.method47(0, field442.field1560[0], field442.field1559[0], 0, 1, false, 2, 349, 1, 0, var13.field1560[0], var13.field1559[0]);
                    this.field239 = super.field1053;
                    this.field240 = super.field1054;
                    this.field242 = 2;
                    this.field241 = 0;
                    this.field232.method538(248, (byte) 0);
                    this.field232.method573(var7, true);
                }
            }
            if (var6 == 467) {
                class10 var14 = this.field270[var7];
                if (var14 != null) {
                    this.method47(0, field442.field1560[0], field442.field1559[0], 0, 1, false, 2, 349, 1, 0, var14.field1560[0], var14.field1559[0]);
                    this.field239 = super.field1053;
                    this.field240 = super.field1054;
                    this.field242 = 2;
                    this.field241 = 0;
                    this.field232.method538(122, (byte) 0);
                    this.field232.method540(var7);
                }
            }
            if (var6 == 624) {
                boolean var15 = this.method47(0, field442.field1560[0], field442.field1559[0], 0, 0, false, 2, 349, 0, 0, var5, var4);
                if (!var15) {
                    this.method47(0, field442.field1560[0], field442.field1559[0], 0, 1, false, 2, 349, 1, 0, var5, var4);
                }
                this.field239 = super.field1053;
                this.field240 = super.field1054;
                this.field242 = 2;
                this.field241 = 0;
                this.field232.method538(156, (byte) 0);
                this.field232.method574(6, this.field249 + var5);
                this.field232.method574(6, var7);
                this.field232.method574(6, this.field248 + var4);
            }
            if (var6 == 851 || var6 == 471) {
                String var17 = this.field615[arg0];
                int var18 = var17.indexOf("@whi@");
                if (var18 != -1) {
                    String var19 = var17.substring(var18 + 5).trim();
                    String var20 = class21.method213(31698, class21.method210(0, class21.method209(var19)));
                    boolean var21 = false;
                    for (int var22 = 0; var22 < this.field483; ++var22) {
                        class1 var23 = this.field482[this.field484[var22]];
                        if (var23 != null && var23.field13 != null && var23.field13.equalsIgnoreCase(var20)) {
                            this.method47(0, field442.field1560[0], field442.field1559[0], 0, 1, false, 2, 349, 1, 0, var23.field1560[0], var23.field1559[0]);
                            if (var6 == 851) {
                                this.field232.method538(10, (byte) 0);
                                this.field232.method540(this.field484[var22]);
                            }
                            if (var6 == 471) {
                                field548 += var7;
                                if (field548 >= 50) {
                                    this.field232.method538(240, (byte) 0);
                                    this.field232.method542(8103948);
                                    field548 = 0;
                                }
                                this.field232.method538(69, (byte) 0);
                                this.field232.method575(this.field484[var22], (byte) 64);
                            }
                            var21 = true;
                            break;
                        }
                    }
                    if (!var21) {
                        this.method146(0, "Unable to find " + var20, "", false);
                    }
                }
            }
            if (var6 == 1654) {
                class3 var24 = class3.method13(var7);
                class29 var25 = class29.field895[var5];
                String var26;
                if (var25 != null && var25.field912[var4] >= 100000) {
                    var26 = var25.field912[var4] + " x " + var24.field56;
                } else if (var24.field92 != null) {
                    var26 = new String(var24.field92);
                } else {
                    var26 = "It's a " + var24.field56 + ".";
                }
                this.method146(0, var26, "", false);
            }
            if (var6 == 1171) {
                class10 var27 = this.field270[var7];
                if (var27 != null) {
                    class19 var28 = var27.field653;
                    if (var28.field772 != null) {
                        var28 = var28.method206(false);
                    }
                    if (var28 != null) {
                        String var29;
                        if (var28.field780 != null) {
                            var29 = new String(var28.field780);
                        } else {
                            var29 = "It's a " + var28.field775 + ".";
                        }
                        this.method146(0, var29, "", false);
                    }
                }
            }
            if (var6 == 609) {
                this.field232.method538(167, (byte) 0);
                this.field232.method573(var5, true);
                this.field232.method573(var7, true);
                this.field232.method540(this.field455);
                this.field232.method573(var4, true);
                this.field313 = 0;
                this.field314 = var5;
                this.field315 = var4;
                this.field316 = 2;
                if (class29.field895[var5].field919 == this.field438) {
                    this.field316 = 1;
                }
                if (class29.field895[var5].field919 == this.field606) {
                    this.field316 = 3;
                }
            }
            if (var6 == 639) {
                this.field232.method538(224, (byte) 0);
                this.field232.method573(var7, true);
                this.field232.method574(6, var4);
                this.field232.method574(6, var5);
                this.field313 = 0;
                this.field314 = var5;
                this.field315 = var4;
                this.field316 = 2;
                if (class29.field895[var5].field919 == this.field438) {
                    this.field316 = 1;
                }
                if (class29.field895[var5].field919 == this.field606) {
                    this.field316 = 3;
                }
            }
            if (var6 == 399) {
                String var30 = this.field615[arg0];
                int var31 = var30.indexOf("@whi@");
                if (var31 != -1) {
                    if (this.field438 == -1) {
                        this.method84(true);
                        this.field581 = var30.substring(var31 + 5).trim();
                        this.field602 = false;
                        for (int var32 = 0; var32 < class29.field895.length; ++var32) {
                            if (class29.field895[var32] != null && class29.field895[var32].field892 == 600) {
                                this.field472 = this.field438 = class29.field895[var32].field919;
                                break;
                            }
                        }
                    } else {
                        this.method146(0, "Please close the interface you have open before using 'report abuse'", "", false);
                    }
                }
            }
            if (var6 == 813) {
                this.field232.method538(176, (byte) 0);
                this.field232.method574(6, var4);
                this.field232.method574(6, var7);
                this.field232.method540(var5);
                this.field313 = 0;
                this.field314 = var5;
                this.field315 = var4;
                this.field316 = 2;
                if (class29.field895[var5].field919 == this.field438) {
                    this.field316 = 1;
                }
                if (class29.field895[var5].field919 == this.field606) {
                    this.field316 = 3;
                }
            }
            if (var6 == 654) {
                class1 var33 = this.field482[var7];
                if (var33 != null) {
                    this.method47(0, field442.field1560[0], field442.field1559[0], 0, 1, false, 2, 349, 1, 0, var33.field1560[0], var33.field1559[0]);
                    this.field239 = super.field1053;
                    this.field240 = super.field1054;
                    this.field242 = 2;
                    this.field241 = 0;
                    this.field232.method538(151, (byte) 0);
                    this.field232.method573(var7, true);
                    this.field232.method575(this.field455, (byte) 64);
                }
            }
            if (var6 == 972) {
                this.field232.method538(5, (byte) 0);
                this.field232.method540(var5);
                this.field232.method573(var4, true);
                this.field232.method575(var7, (byte) 64);
                this.field313 = 0;
                this.field314 = var5;
                this.field315 = var4;
                this.field316 = 2;
                if (class29.field895[var5].field919 == this.field438) {
                    this.field316 = 1;
                }
                if (class29.field895[var5].field919 == this.field606) {
                    this.field316 = 3;
                }
            }
            if (var6 == 691) {
                class10 var34 = this.field270[var7];
                if (var34 != null) {
                    this.method47(0, field442.field1560[0], field442.field1559[0], 0, 1, false, 2, 349, 1, 0, var34.field1560[0], var34.field1559[0]);
                    this.field239 = super.field1053;
                    this.field240 = super.field1054;
                    this.field242 = 2;
                    this.field241 = 0;
                    if ((var7 & 3) == 0) {
                        ++field195;
                    }
                    if (field195 >= 93) {
                        this.field232.method538(217, (byte) 0);
                        this.field232.method540(57731);
                        field195 = 0;
                    }
                    this.field232.method538(73, (byte) 0);
                    this.field232.method574(6, var7);
                }
            }
            if (var6 == 57) {
                class1 var35 = this.field482[var7];
                if (var35 != null) {
                    this.method47(0, field442.field1560[0], field442.field1559[0], 0, 1, false, 2, 349, 1, 0, var35.field1560[0], var35.field1559[0]);
                    this.field239 = super.field1053;
                    this.field240 = super.field1054;
                    this.field242 = 2;
                    this.field241 = 0;
                    this.field232.method538(52, (byte) 0);
                    this.field232.method573(var7, true);
                }
            }
            if (var6 == 746) {
                if (!this.field385) {
                    this.field585.method495(super.field1053 - 4, super.field1054 - 4, false);
                } else {
                    this.field585.method495(var4 - 4, var5 - 4, false);
                }
            }
            if (var6 == 496) {
                class29 var36 = class29.field895[var5];
                this.field454 = 1;
                this.field455 = var5;
                this.field456 = var36.field942;
                this.field322 = 0;
                this.field189 = true;
                String var37 = var36.field907;
                if (var37.indexOf(" ") != -1) {
                    var37 = var37.substring(0, var37.indexOf(" "));
                }
                String var38 = var36.field907;
                if (var38.indexOf(" ") != -1) {
                    var38 = var38.substring(var38.indexOf(" ") + 1);
                }
                this.field457 = var37 + " " + var36.field906 + " " + var38;
                if (this.field456 == 16) {
                    this.field189 = true;
                    this.field649 = 3;
                    this.field339 = true;
                }
            } else {
                if (var6 == 440) {
                    ++field510;
                    if (field510 >= 95) {
                        this.field232.method538(45, (byte) 0);
                        field510 = 0;
                    }
                    this.field232.method538(59, (byte) 0);
                    this.field232.method574(6, var7);
                    this.field232.method575(var5, (byte) 64);
                    this.field232.method575(var4, (byte) 64);
                    this.field313 = 0;
                    this.field314 = var5;
                    this.field315 = var4;
                    this.field316 = 2;
                    if (class29.field895[var5].field919 == this.field438) {
                        this.field316 = 1;
                    }
                    if (class29.field895[var5].field919 == this.field606) {
                        this.field316 = 3;
                    }
                }
                if (var6 == 815) {
                    this.method84(true);
                }
                if (var6 == 971) {
                    class10 var39 = this.field270[var7];
                    if (var39 != null) {
                        this.method47(0, field442.field1560[0], field442.field1559[0], 0, 1, false, 2, 349, 1, 0, var39.field1560[0], var39.field1559[0]);
                        this.field239 = super.field1053;
                        this.field240 = super.field1054;
                        this.field242 = 2;
                        this.field241 = 0;
                        this.field232.method538(218, (byte) 0);
                        this.field232.method573(this.field324, true);
                        this.field232.method573(var7, true);
                        this.field232.method575(this.field323, (byte) 64);
                        this.field232.method575(this.field325, (byte) 64);
                    }
                }
                if (var6 == 831) {
                    class1 var40 = this.field482[var7];
                    if (var40 != null) {
                        this.method47(0, field442.field1560[0], field442.field1559[0], 0, 1, false, 2, 349, 1, 0, var40.field1560[0], var40.field1559[0]);
                        this.field239 = super.field1053;
                        this.field240 = super.field1054;
                        this.field242 = 2;
                        this.field241 = 0;
                        this.field232.method538(174, (byte) 0);
                        this.field232.method573(var7, true);
                    }
                }
                if (var6 == 1446) {
                    int var41 = var7 >> 14 & 32767;
                    class48 var42 = class48.method410(var41);
                    String var43;
                    if (var42.field1285 != null) {
                        var43 = new String(var42.field1285);
                    } else {
                        var43 = "It's a " + var42.field1282 + ".";
                    }
                    this.method146(0, var43, "", false);
                }
                if (var6 == 38) {
                    class10 var44 = this.field270[var7];
                    if (var44 != null) {
                        this.method47(0, field442.field1560[0], field442.field1559[0], 0, 1, false, 2, 349, 1, 0, var44.field1560[0], var44.field1559[0]);
                        this.field239 = super.field1053;
                        this.field240 = super.field1054;
                        this.field242 = 2;
                        this.field241 = 0;
                        this.field232.method538(135, (byte) 0);
                        this.field232.method574(6, var7);
                    }
                }
                if (var6 == 1498) {
                    class3 var45 = class3.method13(var7);
                    String var46;
                    if (var45.field92 != null) {
                        var46 = new String(var45.field92);
                    } else {
                        var46 = "It's a " + var45.field56 + ".";
                    }
                    this.method146(0, var46, "", false);
                }
                if (var6 == 445) {
                    class1 var47 = this.field482[var7];
                    if (var47 != null) {
                        this.method47(0, field442.field1560[0], field442.field1559[0], 0, 1, false, 2, 349, 1, 0, var47.field1560[0], var47.field1559[0]);
                        this.field239 = super.field1053;
                        this.field240 = super.field1054;
                        this.field242 = 2;
                        this.field241 = 0;
                        field548 += var7;
                        if (field548 >= 50) {
                            this.field232.method538(240, (byte) 0);
                            this.field232.method542(8103948);
                            field548 = 0;
                        }
                        this.field232.method538(69, (byte) 0);
                        this.field232.method575(var7, (byte) 64);
                    }
                }
                if (var6 == 615) {
                    this.field232.method538(97, (byte) 0);
                    this.field232.method540(var7);
                    this.field232.method574(6, var4);
                    this.field232.method574(6, var5);
                    this.field313 = 0;
                    this.field314 = var5;
                    this.field315 = var4;
                    this.field316 = 2;
                    if (class29.field895[var5].field919 == this.field438) {
                        this.field316 = 1;
                    }
                    if (class29.field895[var5].field919 == this.field606) {
                        this.field316 = 3;
                    }
                }
                if (var6 == 1025) {
                    this.method92(var5, var7, var4, 7);
                    this.field232.method538(36, (byte) 0);
                    this.field232.method575(this.field249 + var5, (byte) 64);
                    this.field232.method575(this.field248 + var4, (byte) 64);
                    this.field232.method574(6, var7 >> 14 & 32767);
                }
                if (var6 == 262) {
                    this.field232.method538(95, (byte) 0);
                    this.field232.method540(var5);
                    class29 var48 = class29.field895[var5];
                    if (var48.field927 != null && var48.field927[0][0] == 5) {
                        int var49 = var48.field927[0][1];
                        if (this.field631[var49] != var48.field940[0]) {
                            this.field631[var49] = var48.field940[0];
                            this.method124(691, var49);
                            this.field189 = true;
                        }
                    }
                }
                if (var6 == 234) {
                    this.method92(var5, var7, var4, 7);
                    this.field232.method538(234, (byte) 0);
                    this.field232.method574(6, this.field248 + var4);
                    this.field232.method573(var7 >> 14 & 32767, true);
                    this.field232.method573(this.field249 + var5, true);
                }
                if (var6 == 868) {
                    this.field232.method538(237, (byte) 0);
                    this.field232.method573(var7, true);
                    this.field232.method540(var5);
                    this.field232.method575(var4, (byte) 64);
                    this.field313 = 0;
                    this.field314 = var5;
                    this.field315 = var4;
                    this.field316 = 2;
                    if (class29.field895[var5].field919 == this.field438) {
                        this.field316 = 1;
                    }
                    if (class29.field895[var5].field919 == this.field606) {
                        this.field316 = 3;
                    }
                }
                if (var6 == 997) {
                    field629 += var5;
                    if (field629 >= 76) {
                        this.field232.method538(84, (byte) 0);
                        this.field232.method543(0);
                        field629 = 0;
                    }
                    this.field232.method538(58, (byte) 0);
                    this.field232.method574(6, var4);
                    this.field232.method540(var7);
                    this.field232.method574(6, var5);
                    this.field313 = 0;
                    this.field314 = var5;
                    this.field315 = var4;
                    this.field316 = 2;
                    if (class29.field895[var5].field919 == this.field438) {
                        this.field316 = 1;
                    }
                    if (class29.field895[var5].field919 == this.field606) {
                        this.field316 = 3;
                    }
                }
                if (var6 == 330 && this.method92(var5, var7, var4, 7)) {
                    this.field232.method538(159, (byte) 0);
                    this.field232.method575(this.field455, (byte) 64);
                    this.field232.method574(6, this.field249 + var5);
                    this.field232.method573(this.field248 + var4, true);
                    this.field232.method540(var7 >> 14 & 32767);
                }
                if (var6 == 794) {
                    field228 += var5;
                    if (field228 >= 112) {
                        this.field232.method538(207, (byte) 0);
                        this.field232.method540(45399);
                        field228 = 0;
                    }
                    this.method92(var5, var7, var4, 7);
                    this.field232.method538(48, (byte) 0);
                    this.field232.method574(6, var7 >> 14 & 32767);
                    this.field232.method574(6, this.field248 + var4);
                    this.field232.method573(this.field249 + var5, true);
                }
                if (var6 == 826) {
                    field403 += var5;
                    if (field403 >= 144) {
                        this.field232.method538(169, (byte) 0);
                        this.field232.method540(36325);
                        field403 = 0;
                    }
                    this.field232.method538(85, (byte) 0);
                    this.field232.method573(var4, true);
                    this.field232.method574(6, var7);
                    this.field232.method540(var5);
                    this.field313 = 0;
                    this.field314 = var5;
                    this.field315 = var4;
                    this.field316 = 2;
                    if (class29.field895[var5].field919 == this.field438) {
                        this.field316 = 1;
                    }
                    if (class29.field895[var5].field919 == this.field606) {
                        this.field316 = 3;
                    }
                }
                if (var6 == 47) {
                    boolean var50 = this.method47(0, field442.field1560[0], field442.field1559[0], 0, 0, false, 2, 349, 0, 0, var5, var4);
                    if (!var50) {
                        this.method47(0, field442.field1560[0], field442.field1559[0], 0, 1, false, 2, 349, 1, 0, var5, var4);
                    }
                    this.field239 = super.field1053;
                    this.field240 = super.field1054;
                    this.field242 = 2;
                    this.field241 = 0;
                    this.field232.method538(177, (byte) 0);
                    this.field232.method574(6, this.field248 + var4);
                    this.field232.method574(6, var7);
                    this.field232.method575(this.field249 + var5, (byte) 64);
                }
                if (var6 == 230 && !this.field205) {
                    this.field232.method538(20, (byte) 0);
                    this.field232.method540(var5);
                    this.field205 = true;
                }
                if (var6 == 264 || var6 == 92 || var6 == 515 || var6 == 799) {
                    String var52 = this.field615[arg0];
                    int var53 = var52.indexOf("@whi@");
                    if (var53 != -1) {
                        long var54 = class21.method209(var52.substring(var53 + 5).trim());
                        if (var6 == 264) {
                            this.method54(var54, 0);
                        }
                        if (var6 == 92) {
                            this.method91(0, var54);
                        }
                        if (var6 == 515) {
                            this.method110(21834, var54);
                        }
                        if (var6 == 799) {
                            this.method163(true, var54);
                        }
                    }
                }
                if (var6 == 197) {
                    ++field568;
                    if (field568 >= 123) {
                        this.field232.method538(201, (byte) 0);
                        field568 = 0;
                    }
                    this.field232.method538(226, (byte) 0);
                    this.field232.method574(6, var4);
                    this.field232.method575(var5, (byte) 64);
                    this.field232.method575(var7, (byte) 64);
                    this.field313 = 0;
                    this.field314 = var5;
                    this.field315 = var4;
                    this.field316 = 2;
                    if (class29.field895[var5].field919 == this.field438) {
                        this.field316 = 1;
                    }
                    if (class29.field895[var5].field919 == this.field606) {
                        this.field316 = 3;
                    }
                }
                if (var6 == 600) {
                    class10 var56 = this.field270[var7];
                    if (var56 != null) {
                        this.method47(0, field442.field1560[0], field442.field1559[0], 0, 1, false, 2, 349, 1, 0, var56.field1560[0], var56.field1559[0]);
                        this.field239 = super.field1053;
                        this.field240 = super.field1054;
                        this.field242 = 2;
                        this.field241 = 0;
                        this.field232.method538(133, (byte) 0);
                        this.field232.method573(this.field455, true);
                        this.field232.method575(var7, (byte) 64);
                    }
                }
                if (var6 == 211) {
                    boolean var57 = this.method47(0, field442.field1560[0], field442.field1559[0], 0, 0, false, 2, 349, 0, 0, var5, var4);
                    if (!var57) {
                        this.method47(0, field442.field1560[0], field442.field1559[0], 0, 1, false, 2, 349, 1, 0, var5, var4);
                    }
                    this.field239 = super.field1053;
                    this.field240 = super.field1054;
                    this.field242 = 2;
                    this.field241 = 0;
                    this.field232.method538(72, (byte) 0);
                    this.field232.method575(this.field248 + var4, (byte) 64);
                    this.field232.method574(6, var7);
                    this.field232.method573(this.field249 + var5, true);
                }
                if (var6 == 359) {
                    class1 var59 = this.field482[var7];
                    if (var59 != null) {
                        this.method47(0, field442.field1560[0], field442.field1559[0], 0, 1, false, 2, 349, 1, 0, var59.field1560[0], var59.field1559[0]);
                        this.field239 = super.field1053;
                        this.field240 = super.field1054;
                        this.field242 = 2;
                        this.field241 = 0;
                        this.field232.method538(10, (byte) 0);
                        this.field232.method540(var7);
                    }
                }
                if (var6 == 904) {
                    this.field232.method538(25, (byte) 0);
                    this.field232.method574(6, this.field324);
                    this.field232.method575(var5, (byte) 64);
                    this.field232.method574(6, this.field323);
                    this.field232.method573(var4, true);
                    this.field232.method574(6, var7);
                    this.field232.method540(this.field325);
                    this.field313 = 0;
                    this.field314 = var5;
                    this.field315 = var4;
                    this.field316 = 2;
                    if (class29.field895[var5].field919 == this.field438) {
                        this.field316 = 1;
                    }
                    if (class29.field895[var5].field919 == this.field606) {
                        this.field316 = 3;
                    }
                }
                if (var6 == 72) {
                    String var60 = this.field615[arg0];
                    int var61 = var60.indexOf("@whi@");
                    if (var61 != -1) {
                        long var62 = class21.method209(var60.substring(var61 + 5).trim());
                        int var64 = -1;
                        for (int var65 = 0; var65 < this.field508; ++var65) {
                            if (this.field187[var65] == var62) {
                                var64 = var65;
                                break;
                            }
                        }
                        if (var64 != -1 && this.field470[var64] > 0) {
                            this.field412 = true;
                            this.field310 = 0;
                            this.field460 = true;
                            this.field610 = "";
                            this.field531 = 3;
                            this.field522 = this.field187[var64];
                            this.field624 = "Enter message to send to " + this.field595[var64];
                        }
                    }
                }
                if (var6 == 498) {
                    boolean var66 = this.method47(0, field442.field1560[0], field442.field1559[0], 0, 0, false, 2, 349, 0, 0, var5, var4);
                    if (!var66) {
                        this.method47(0, field442.field1560[0], field442.field1559[0], 0, 1, false, 2, 349, 1, 0, var5, var4);
                    }
                    this.field239 = super.field1053;
                    this.field240 = super.field1054;
                    this.field242 = 2;
                    this.field241 = 0;
                    this.field232.method538(208, (byte) 0);
                    this.field232.method573(this.field249 + var5, true);
                    this.field232.method574(6, var7);
                    this.field232.method540(this.field248 + var4);
                }
                if (var6 == 888 && this.method92(var5, var7, var4, 7)) {
                    this.field232.method538(50, (byte) 0);
                    this.field232.method575(this.field323, (byte) 64);
                    this.field232.method540(this.field325);
                    this.field232.method573(var7 >> 14 & 32767, true);
                    this.field232.method540(this.field324);
                    this.field232.method574(6, this.field248 + var4);
                    this.field232.method540(this.field249 + var5);
                }
                if (var6 == 287) {
                    boolean var68 = this.method47(0, field442.field1560[0], field442.field1559[0], 0, 0, false, 2, 349, 0, 0, var5, var4);
                    if (!var68) {
                        this.method47(0, field442.field1560[0], field442.field1559[0], 0, 1, false, 2, 349, 1, 0, var5, var4);
                    }
                    this.field239 = super.field1053;
                    this.field240 = super.field1054;
                    this.field242 = 2;
                    this.field241 = 0;
                    this.field232.method538(158, (byte) 0);
                    this.field232.method540(this.field249 + var5);
                    this.field232.method574(6, var7);
                    this.field232.method575(this.field248 + var4, (byte) 64);
                }
                if (var6 == 158) {
                    boolean var70 = this.method47(0, field442.field1560[0], field442.field1559[0], 0, 0, false, 2, 349, 0, 0, var5, var4);
                    if (!var70) {
                        this.method47(0, field442.field1560[0], field442.field1559[0], 0, 1, false, 2, 349, 1, 0, var5, var4);
                    }
                    this.field239 = super.field1053;
                    this.field240 = super.field1054;
                    this.field242 = 2;
                    this.field241 = 0;
                    this.field232.method538(162, (byte) 0);
                    this.field232.method540(this.field325);
                    this.field232.method540(var7);
                    this.field232.method540(this.field324);
                    this.field232.method573(this.field323, true);
                    this.field232.method573(this.field249 + var5, true);
                    this.field232.method540(this.field248 + var4);
                }
                if (var6 == 558) {
                    class1 var72 = this.field482[var7];
                    if (var72 != null) {
                        this.method47(0, field442.field1560[0], field442.field1559[0], 0, 1, false, 2, 349, 1, 0, var72.field1560[0], var72.field1559[0]);
                        this.field239 = super.field1053;
                        this.field240 = super.field1054;
                        this.field242 = 2;
                        this.field241 = 0;
                        this.field232.method538(109, (byte) 0);
                        this.field232.method573(this.field325, true);
                        this.field232.method540(var7);
                        this.field232.method573(this.field324, true);
                        this.field232.method575(this.field323, (byte) 64);
                    }
                }
                if (var6 == 727) {
                    this.field322 = 1;
                    this.field323 = var4;
                    this.field324 = var5;
                    this.field325 = var7;
                    this.field326 = class3.method13(var7).field56;
                    this.field454 = 0;
                    this.field189 = true;
                } else {
                    if (var6 == 170) {
                        class29 var73 = class29.field895[var5];
                        boolean var74 = true;
                        if (var73.field892 > 0) {
                            var74 = this.method114(this.field361, var73);
                        }
                        if (var74) {
                            this.field232.method538(95, (byte) 0);
                            this.field232.method540(var5);
                        }
                    }
                    if (var6 == 966) {
                        class10 var75 = this.field270[var7];
                        if (var75 != null) {
                            this.method47(0, field442.field1560[0], field442.field1559[0], 0, 1, false, 2, 349, 1, 0, var75.field1560[0], var75.field1559[0]);
                            this.field239 = super.field1053;
                            this.field240 = super.field1054;
                            this.field242 = 2;
                            this.field241 = 0;
                            this.field232.method538(209, (byte) 0);
                            this.field232.method540(var7);
                        }
                    }
                    if (var6 == 19) {
                        ++field407;
                        if (field407 >= 116) {
                            this.field232.method538(39, (byte) 0);
                            this.field232.method543(0);
                            field407 = 0;
                        }
                        this.field232.method538(64, (byte) 0);
                        this.field232.method573(var4, true);
                        this.field232.method573(var5, true);
                        this.field232.method575(var7, (byte) 64);
                        this.field313 = 0;
                        this.field314 = var5;
                        this.field315 = var4;
                        this.field316 = 2;
                        if (class29.field895[var5].field919 == this.field438) {
                            this.field316 = 1;
                        }
                        if (class29.field895[var5].field919 == this.field606) {
                            this.field316 = 3;
                        }
                    }
                    if (var6 == 594) {
                        this.method92(var5, var7, var4, 7);
                        this.field232.method538(150, (byte) 0);
                        this.field232.method540(this.field248 + var4);
                        this.field232.method575(this.field249 + var5, (byte) 64);
                        this.field232.method573(var7 >> 14 & 32767, true);
                    }
                    this.field322 = 0;
                    this.field454 = 0;
                    this.field189 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIBLDYPVESKW;)V")
    public final void method83(int arg0, int arg1, byte arg2, class14 arg3) {
        int var5 = this.field528 + this.field352 & 2047;
        int var6 = arg0 * arg0 + arg1 * arg1;
        if (var6 <= 6400) {
            int var7 = class39.field1169[var5];
            int var8 = class39.field1170[var5];
            if (arg2 != -94) {
                this.field278 = this.field593.method377();
            }
            int var9 = var7 * 256 / (this.field256 + 256);
            int var10 = var8 * 256 / (this.field256 + 256);
            int var11 = arg0 * var9 + arg1 * var10 >> 16;
            int var12 = arg0 * var10 - arg1 * var9 >> 16;
            if (var6 > 2500) {
                arg3.method185(83 - var12 - arg3.field698 / 2 - 4, this.field491, var11 + 94 - arg3.field697 / 2 + 4, this.field599);
            } else {
                arg3.method179(83 - var12 - arg3.field698 / 2 - 4, var11 + 94 - arg3.field697 / 2 + 4, 49598);
            }
        }
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(Z)V")
    public final void method84(boolean arg0) {
        this.field232.method538(166, (byte) 0);
        if (this.field435 != -1) {
            this.field435 = -1;
            this.field189 = true;
            this.field205 = false;
            this.field339 = true;
        }
        if (this.field606 != -1) {
            this.field606 = -1;
            this.field412 = true;
            this.field205 = false;
        }
        this.field438 = -1;
        if (!arg0) {
            field567 = this.field593.method377();
        }
    }

    @OriginalMember(owner = "client", name = "w", descriptor = "(I)V")
    public final void method85(int arg0) {
        if (this.field216 > 0) {
            this.method120(-710);
        } else {
            this.field225.method372(0);
            this.field409.method382(0, 19850, "Connection lost", 144, 257);
            this.field409.method382(16777215, 19850, "Connection lost", 143, 256);
            this.field409.method382(0, 19850, "Please wait - attempting to reestablish", 159, 257);
            if (arg0 != 2317) {
                field404 = this.field593.method377();
            }
            this.field409.method382(16777215, 19850, "Please wait - attempting to reestablish", 158, 256);
            this.field225.method373(4, 0, super.field1038, 4);
            this.field196 = 0;
            this.field394 = 0;
            class47 var2 = this.field537;
            this.field619 = false;
            this.field566 = 0;
            this.method130(this.field203, this.field204, true);
            if (!this.field619) {
                this.method120(-710);
            }
            try {
                var2.method397();
            } catch (Exception var3) {
            }
        }
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(Z)V")
    public final void method86(boolean arg0) {
        if (this.field307 == 0) {
            this.field615[0] = "Cancel";
            this.field366[0] = 1462;
            this.field219 = 1;
            this.method64(96);
            this.field636 = 0;
            this.field619 &= arg0;
            if (super.field1046 > 4 && super.field1047 > 4 && super.field1046 < 516 && super.field1047 < 338) {
                if (this.field438 != -1) {
                    this.method118(4, 0, super.field1047, 4, class29.field895[this.field438], 0, super.field1046);
                } else {
                    this.method80(this.field617);
                }
            }
            if (this.field636 != this.field422) {
                this.field422 = this.field636;
            }
            this.field636 = 0;
            if (super.field1046 > 553 && super.field1047 > 205 && super.field1046 < 743 && super.field1047 < 466) {
                if (this.field435 != -1) {
                    this.method118(553, 0, super.field1047, 205, class29.field895[this.field435], 0, super.field1046);
                } else if (this.field540[this.field649] != -1) {
                    this.method118(553, 0, super.field1047, 205, class29.field895[this.field540[this.field649]], 0, super.field1046);
                }
            }
            if (this.field636 != this.field274) {
                this.field189 = true;
                this.field274 = this.field636;
            }
            this.field636 = 0;
            if (super.field1046 > 17 && super.field1047 > 357 && super.field1046 < 496 && super.field1047 < 453) {
                if (this.field606 != -1) {
                    this.method118(17, 0, super.field1047, 357, class29.field895[this.field606], 0, super.field1046);
                } else if (super.field1047 < 434 && super.field1046 < 426) {
                    this.method74(super.field1046 - 17, super.field1047 - 357, 0);
                }
            }
            if (this.field606 != -1 && this.field636 != this.field400) {
                this.field412 = true;
                this.field400 = this.field636;
            }
            boolean var2 = false;
            while (!var2) {
                var2 = true;
                for (int var3 = 0; var3 < this.field219 - 1; ++var3) {
                    if (this.field366[var3] < 1000 && this.field366[var3 + 1] > 1000) {
                        String var4 = this.field615[var3];
                        this.field615[var3] = this.field615[var3 + 1];
                        this.field615[var3 + 1] = var4;
                        int var5 = this.field366[var3];
                        this.field366[var3] = this.field366[var3 + 1];
                        this.field366[var3 + 1] = var5;
                        int var6 = this.field364[var3];
                        this.field364[var3] = this.field364[var3 + 1];
                        this.field364[var3 + 1] = var6;
                        int var7 = this.field365[var3];
                        this.field365[var3] = this.field365[var3 + 1];
                        this.field365[var3 + 1] = var7;
                        int var8 = this.field367[var3];
                        this.field367[var3] = this.field367[var3 + 1];
                        this.field367[var3 + 1] = var8;
                        var2 = false;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(BLJDSNLLMP;)Z")
    public final boolean method87(byte arg0, class29 arg1) {
        if (arg0 != 114) {
            this.field213 = this.field558.method549();
        }
        if (arg1.field932 == null) {
            return false;
        } else {
            for (int var3 = 0; var3 < arg1.field932.length; ++var3) {
                int var4 = this.method153(false, arg1, var3);
                int var5 = arg1.field940[var3];
                if (arg1.field932[var3] == 2) {
                    if (var4 >= var5) {
                        return false;
                    }
                } else if (arg1.field932[var3] == 3) {
                    if (var4 <= var5) {
                        return false;
                    }
                } else if (arg1.field932[var3] == 4) {
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

    @OriginalMember(owner = "client", name = "h", descriptor = "(Z)V")
    public final void method88(boolean arg0) {
        this.field619 &= arg0;
        byte[] var2 = this.field356.method376("title.dat", (byte[]) null);
        class14 var3 = new class14(var2, this);
        this.field298.method372(0);
        var3.method177(0, 0, (byte) -31);
        this.field299.method372(0);
        var3.method177(0, -637, (byte) -31);
        this.field295.method372(0);
        var3.method177(0, -128, (byte) -31);
        this.field296.method372(0);
        var3.method177(-371, -202, (byte) -31);
        this.field297.method372(0);
        var3.method177(-171, -202, (byte) -31);
        this.field300.method372(0);
        var3.method177(-265, 0, (byte) -31);
        this.field301.method372(0);
        var3.method177(-265, -562, (byte) -31);
        this.field302.method372(0);
        var3.method177(-171, -128, (byte) -31);
        this.field303.method372(0);
        var3.method177(-171, -562, (byte) -31);
        int[] var4 = new int[var3.field693];
        for (int var5 = 0; var5 < var3.field694; ++var5) {
            for (int var10 = 0; var10 < var3.field693; ++var10) {
                var4[var10] = var3.field692[var3.field693 * var5 + (var3.field693 - var10 - 1)];
            }
            for (int var11 = 0; var11 < var3.field693; ++var11) {
                var3.field692[var3.field693 * var5 + var11] = var4[var11];
            }
        }
        this.field298.method372(0);
        var3.method177(0, 382, (byte) -31);
        this.field299.method372(0);
        var3.method177(0, -255, (byte) -31);
        this.field295.method372(0);
        var3.method177(0, 254, (byte) -31);
        this.field296.method372(0);
        var3.method177(-371, 180, (byte) -31);
        this.field297.method372(0);
        var3.method177(-171, 180, (byte) -31);
        this.field300.method372(0);
        var3.method177(-265, 382, (byte) -31);
        this.field301.method372(0);
        var3.method177(-265, -180, (byte) -31);
        this.field302.method372(0);
        var3.method177(-171, 254, (byte) -31);
        this.field303.method372(0);
        var3.method177(-171, -180, (byte) -31);
        class14 var6 = new class14(this.field356, "logo", 0);
        this.field295.method372(0);
        var6.method179(18, 382 - var6.field693 / 2 - 128, 49598);
        Object var7 = null;
        Object var8 = null;
        Object var9 = null;
        System.gc();
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(ZI)Ljava/lang/String;")
    private static final String method89(boolean arg0, int arg1) {
        if (!arg0) {
            throw new NullPointerException();
        } else if (arg1 < 100000) {
            return String.valueOf(arg1);
        } else {
            return arg1 < 10000000 ? arg1 / 1000 + "K" : arg1 / 1000000 + "M";
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LYOXDZEVD;IZ)V")
    private final void method90(class68 arg0, int arg1, boolean arg2) {
        arg0.method559(-8237);
        if (arg2) {
            this.field614 = null;
        }
        int var4 = arg0.method560(true, 1);
        if (var4 != 0) {
            int var5 = arg0.method560(true, 2);
            if (var5 == 0) {
                this.field486[this.field485++] = this.field481;
            } else if (var5 == 1) {
                int var6 = arg0.method560(true, 3);
                field442.method536(var6, false, false);
                int var7 = arg0.method560(true, 1);
                if (var7 == 1) {
                    this.field486[this.field485++] = this.field481;
                }
            } else if (var5 == 2) {
                int var8 = arg0.method560(true, 3);
                field442.method536(var8, true, false);
                int var9 = arg0.method560(true, 3);
                field442.method536(var9, true, false);
                int var10 = arg0.method560(true, 1);
                if (var10 == 1) {
                    this.field486[this.field485++] = this.field481;
                }
            } else if (var5 == 3) {
                this.field494 = arg0.method560(true, 2);
                int var11 = arg0.method560(true, 7);
                int var12 = arg0.method560(true, 1);
                if (var12 == 1) {
                    this.field486[this.field485++] = this.field481;
                }
                int var13 = arg0.method560(true, 1);
                int var14 = arg0.method560(true, 7);
                field442.method533(var11, -741, var14, var13 == 1);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IJ)V")
    public final void method91(int arg0, long arg1) {
        if (arg1 != 0L) {
            if (this.field458 >= 100) {
                this.method146(0, "Your ignore list is full. Max of 100 hit", "", false);
            } else {
                String var4 = class21.method213(31698, class21.method210(0, arg1));
                if (arg0 != 0) {
                    this.method119();
                }
                for (int var5 = 0; var5 < this.field458; ++var5) {
                    if (this.field419[var5] == arg1) {
                        this.method146(0, var4 + " is already on your ignore list", "", false);
                        return;
                    }
                }
                for (int var6 = 0; var6 < this.field508; ++var6) {
                    if (this.field187[var6] == arg1) {
                        this.method146(0, "Please remove " + var4 + " from your friend list first", "", false);
                        return;
                    }
                }
                this.field419[this.field458++] = arg1;
                this.field189 = true;
                this.field232.method538(250, (byte) 0);
                this.field232.method545(false, arg1);
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(IIII)Z")
    public final boolean method92(int arg0, int arg1, int arg2, int arg3) {
        int var5 = arg1 >> 14 & 32767;
        int var6 = this.field585.method487(this.field494, arg2, arg0, arg1);
        if (var6 == -1) {
            return false;
        } else {
            int var7 = var6 & 31;
            int var8 = var6 >> 6 & 3;
            if (var7 != 10 && var7 != 11 && var7 != 22) {
                this.method47(var7 + 1, field442.field1560[0], field442.field1559[0], 0, 0, false, 2, 349, 0, var8, arg0, arg2);
            } else {
                class48 var9 = class48.method410(var5);
                int var10;
                int var11;
                if (var8 != 0 && var8 != 2) {
                    var10 = var9.field1255;
                    var11 = var9.field1289;
                } else {
                    var10 = var9.field1289;
                    var11 = var9.field1255;
                }
                int var12 = var9.field1262;
                if (var8 != 0) {
                    var12 = (var12 >> 4 - var8) + (var12 << var8 & 15);
                }
                this.method47(0, field442.field1560[0], field442.field1559[0], var12, var10, false, 2, 349, var11, 0, arg0, arg2);
            }
            this.field239 = super.field1053;
            this.field240 = super.field1054;
            this.field242 = 2;
            this.field241 = 0;
            if (arg3 < this.field461 || arg3 > this.field461) {
                this.field545 = !this.field545;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "i", descriptor = "(Z)V")
    public final void method93(boolean arg0) {
        short var2 = 256;
        for (int var3 = 10; var3 < 117; ++var3) {
            int var18 = (int) (Math.random() * 100.0D);
            if (var18 < 50) {
                this.field582[(var2 - 2 << 7) + var3] = 255;
            }
        }
        for (int var4 = 0; var4 < 100; ++var4) {
            int var15 = (int) (Math.random() * 124.0D) + 2;
            int var16 = (int) (Math.random() * 128.0D) + 128;
            int var17 = (var16 << 7) + var15;
            this.field582[var17] = 192;
        }
        this.field619 &= arg0;
        for (int var5 = 1; var5 < var2 - 1; ++var5) {
            for (int var13 = 1; var13 < 127; ++var13) {
                int var14 = (var5 << 7) + var13;
                this.field583[var14] = (this.field582[var14 - 1] + this.field582[var14 + 1] + this.field582[var14 - 128] + this.field582[var14 + 128]) / 4;
            }
        }
        this.field589 += 128;
        if (this.field589 > this.field392.length) {
            this.field589 -= this.field392.length;
            int var6 = (int) (Math.random() * 12.0D);
            this.method56(false, this.field633[var6]);
        }
        for (int var7 = 1; var7 < var2 - 1; ++var7) {
            for (int var10 = 1; var10 < 127; ++var10) {
                int var11 = (var7 << 7) + var10;
                int var12 = this.field583[var11 + 128] - this.field392[this.field589 + var11 & this.field392.length - 1] / 5;
                if (var12 < 0) {
                    var12 = 0;
                }
                this.field582[var11] = var12;
            }
        }
        for (int var8 = 0; var8 < var2 - 1; ++var8) {
            this.field406[var8] = this.field406[var8 + 1];
        }
        this.field406[var2 - 1] = (int) (Math.sin((double) field345 / 14.0D) * 16.0D + Math.sin((double) field345 / 15.0D) * 14.0D + Math.sin((double) field345 / 16.0D) * 12.0D);
        if (this.field559 > 0) {
            this.field559 -= 4;
        }
        if (this.field560 > 0) {
            this.field560 -= 4;
        }
        if (this.field559 == 0 && this.field560 == 0) {
            int var9 = (int) (Math.random() * 2000.0D);
            if (var9 == 0) {
                this.field559 = 1024;
            }
            if (var9 == 1) {
                this.field560 = 1024;
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BI)Z")
    public final boolean method94(byte arg0, int arg1) {
        if (arg1 < 0) {
            return false;
        } else {
            int var3 = this.field366[arg1];
            if (this.field292 == arg0) {
                boolean var4 = false;
                if (var3 >= 2000) {
                    var3 -= 2000;
                }
                return var3 == 264;
            } else {
                throw new NullPointerException();
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(BI)V")
    public final void method95(byte arg0, int arg1) {
        int[] var3 = this.field396.field692;
        if (arg0 == 3) {
            boolean var4 = false;
        } else {
            this.field614 = null;
        }
        int var5 = var3.length;
        for (int var6 = 0; var6 < var5; ++var6) {
            var3[var6] = 0;
        }
        for (int var7 = 1; var7 < 103; ++var7) {
            int var24 = (103 - var7) * 512 * 4 + 24628;
            for (int var25 = 1; var25 < 103; ++var25) {
                if ((this.field634[arg1][var25][var7] & 24) == 0) {
                    this.field585.method492(var3, var24, 512, arg1, var25, var7);
                }
                if (arg1 < 3 && (this.field634[arg1 + 1][var25][var7] & 8) != 0) {
                    this.field585.method492(var3, var24, 512, arg1 + 1, var25, var7);
                }
                var24 += 4;
            }
        }
        int var8 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var9 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        this.field396.method174(0);
        for (int var10 = 1; var10 < 103; ++var10) {
            for (int var23 = 1; var23 < 103; ++var23) {
                if ((this.field634[arg1][var23][var10] & 24) == 0) {
                    this.method72(arg1, var8, var23, var9, var10, 0);
                }
                if (arg1 < 3 && (this.field634[arg1 + 1][var23][var10] & 8) != 0) {
                    this.method72(arg1 + 1, var8, var23, var9, var10, 0);
                }
            }
        }
        this.field225.method372(0);
        this.field286 = 0;
        for (int var11 = 0; var11 < 104; ++var11) {
            for (int var12 = 0; var12 < 104; ++var12) {
                int var13 = this.field585.method486(this.field494, var11, var12);
                if (var13 != 0) {
                    int var14 = var13 >> 14 & 32767;
                    int var15 = class48.method410(var14).field1288;
                    if (var15 >= 0) {
                        int var16 = var11;
                        int var17 = var12;
                        if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
                            byte var18 = 104;
                            byte var19 = 104;
                            int[][] var20 = this.field391[this.field494].field813;
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
                        this.field592[this.field286] = this.field371[var15];
                        this.field287[this.field286] = var16;
                        this.field288[this.field286] = var17;
                        ++this.field286;
                    }
                }
            }
        }
        ++field621;
        if (field621 > 57) {
            field621 = 0;
            this.field232.method538(24, (byte) 0);
        }
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(B)V")
    public final void method96(byte arg0) {
        if (arg0 != 3) {
            this.field258 = !this.field258;
        }
        if (super.field1052 == 1) {
            if (super.field1053 >= 6 && super.field1053 <= 106 && super.field1054 >= 467 && super.field1054 <= 499) {
                this.field628 = (this.field628 + 1) % 4;
                this.field181 = true;
                this.field412 = true;
                this.field232.method538(192, (byte) 0);
                this.field232.method539(this.field628);
                this.field232.method539(this.field612);
                this.field232.method539(this.field357);
            }
            if (super.field1053 >= 135 && super.field1053 <= 235 && super.field1054 >= 467 && super.field1054 <= 499) {
                this.field612 = (this.field612 + 1) % 3;
                this.field181 = true;
                this.field412 = true;
                this.field232.method538(192, (byte) 0);
                this.field232.method539(this.field628);
                this.field232.method539(this.field612);
                this.field232.method539(this.field357);
            }
            if (super.field1053 >= 273 && super.field1053 <= 373 && super.field1054 >= 467 && super.field1054 <= 499) {
                this.field357 = (this.field357 + 1) % 3;
                this.field181 = true;
                this.field412 = true;
                this.field232.method538(192, (byte) 0);
                this.field232.method539(this.field628);
                this.field232.method539(this.field612);
                this.field232.method539(this.field357);
            }
            if (super.field1053 >= 412 && super.field1053 <= 512 && super.field1054 >= 467 && super.field1054 <= 499) {
                if (this.field438 == -1) {
                    this.method84(true);
                    this.field581 = "";
                    this.field602 = false;
                    for (int var2 = 0; var2 < class29.field895.length; ++var2) {
                        if (class29.field895[var2] != null && class29.field895[var2].field892 == 600) {
                            this.field472 = this.field438 = class29.field895[var2].field919;
                            return;
                        }
                    }
                    return;
                }
                this.method146(0, "Please close the interface you have open before using 'report abuse'", "", false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "j", descriptor = "(Z)V")
    public final void method97(boolean arg0) {
        this.field521 = false;
        while (this.field647) {
            this.field521 = false;
            try {
                Thread.sleep(50L);
            } catch (Exception var3) {
            }
        }
        this.field276 = null;
        this.field277 = null;
        this.field633 = null;
        this.field206 = null;
        this.field207 = null;
        this.field208 = null;
        this.field209 = null;
        this.field392 = null;
        if (arg0) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        this.field393 = null;
        this.field582 = null;
        this.field583 = null;
        this.field579 = null;
        this.field580 = null;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;BIILjava/lang/String;I)LOTSGNSQM;")
    public final class41 method98(String arg0, byte arg1, int arg2, int arg3, String arg4, int arg5) {
        byte[] var7 = null;
        int var8 = 5;
        try {
            if (this.field227[0] != null) {
                var7 = this.field227[0].method291((byte) 44, arg2);
            }
        } catch (Exception var30) {
        }
        if (var7 != null) {
            this.field373.reset();
            this.field373.update(var7);
            int var9 = (int) this.field373.getValue();
            if (arg3 != var9) {
                var7 = null;
            }
        }
        if (var7 != null) {
            return new class41(var7, true);
        } else {
            int var11 = 0;
            if (arg1 != -99) {
                this.field213 = -1;
            }
            while (var7 == null) {
                String var12 = "Unknown error";
                this.method156((byte) 63, arg5, "Requesting " + arg4);
                Object var13 = null;
                try {
                    int var14 = 0;
                    DataInputStream var15 = this.method123(arg0 + arg3);
                    byte[] var16 = new byte[6];
                    var15.readFully(var16, 0, 6);
                    class68 var17 = new class68(var16, -103);
                    var17.field1612 = 3;
                    int var18 = var17.method553() + 6;
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
                            this.method156((byte) 63, arg5, "Loading " + arg4 + " - " + var23 + "%");
                        }
                        var14 = var23;
                    }
                    var15.close();
                    try {
                        if (this.field227[0] != null) {
                            this.field227[0].method292(var7.length, var7, 3, arg2);
                        }
                    } catch (Exception var29) {
                        this.field227[0] = null;
                    }
                    if (var7 != null) {
                        this.field373.reset();
                        this.field373.update(var7);
                        int var24 = (int) this.field373.getValue();
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
                            this.method156((byte) 63, arg5, "Game updated - please reload page");
                            var26 = 10;
                        } else {
                            this.method156((byte) 63, arg5, var12 + " - Retrying in " + var26);
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
                    this.field197 = !this.field197;
                }
            }
            return new class41(var7, true);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(II)V")
    public final void method99(int arg0, int arg1) {
        class65 var3 = this.field614[this.field494][arg0][arg1];
        if (var3 == null) {
            this.field585.method478(this.field494, arg0, arg1);
        } else {
            int var4 = -99999999;
            class44 var5 = null;
            for (class44 var6 = (class44) var3.method528(); var6 != null; var6 = (class44) var3.method530(false)) {
                class3 var11 = class3.method13(var6.field1196);
                int var12 = var11.field105;
                if (var11.field101) {
                    var12 = (var6.field1195 + 1) * var12;
                }
                if (var12 > var4) {
                    var4 = var12;
                    var5 = var6;
                }
            }
            var3.method526(var5, 5);
            class44 var7 = null;
            class44 var8 = null;
            for (class44 var9 = (class44) var3.method528(); var9 != null; var9 = (class44) var3.method530(false)) {
                if (var5.field1196 != var9.field1196 && var7 == null) {
                    var7 = var9;
                }
                if (var5.field1196 != var9.field1196 && var7.field1196 != var9.field1196 && var8 == null) {
                    var8 = var9;
                }
            }
            int var10 = (arg1 << 7) + arg0 + 1610612736;
            this.field585.method464(var8, var10, var5, arg0, arg1, this.field494, this.method81(0, arg1 * 128 + 64, this.field494, arg0 * 128 + 64), 0, var7);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZILYOXDZEVD;)V")
    private final void method100(boolean arg0, int arg1, class68 arg2) {
        this.field619 &= arg0;
        for (int var4 = 0; var4 < this.field485; ++var4) {
            int var5 = this.field486[var4];
            class10 var6 = this.field270[var5];
            int var7 = arg2.method549();
            if ((var7 & 4) != 0) {
                var6.field1544 = arg2.method556();
                var6.field1585 = 100;
            }
            if ((var7 & 1) != 0) {
                int var8 = arg2.method549();
                int var9 = arg2.method570((byte) 96);
                var6.method534(7, field345, var8, var9);
                var6.field1536 = field345 + 300;
                var6.field1537 = arg2.method570((byte) 96);
                var6.field1538 = arg2.method569(-234);
            }
            if ((var7 & 128) != 0) {
                var6.field1542 = arg2.method578(false);
                var6.field1543 = arg2.method578(false);
            }
            if ((var7 & 8) != 0) {
                var6.field1590 = arg2.method578(false);
                if (var6.field1590 == 65535) {
                    var6.field1590 = -1;
                }
            }
            if ((var7 & 32) != 0) {
                var6.field1580 = arg2.method578(false);
                int var10 = arg2.method554();
                var6.field1584 = var10 >> 16;
                var6.field1583 = (var10 & 65535) + field345;
                var6.field1581 = 0;
                var6.field1582 = 0;
                if (var6.field1583 > field345) {
                    var6.field1581 = -1;
                }
                if (var6.field1580 == 65535) {
                    var6.field1580 = -1;
                }
            }
            if ((var7 & 2) != 0) {
                int var11 = arg2.method577(true);
                if (var11 == 65535) {
                    var11 = -1;
                }
                int var12 = arg2.method570((byte) 96);
                if (var6.field1575 == var11 && var11 != -1) {
                    int var13 = class9.field163[var11].field177;
                    if (var13 == 1) {
                        var6.field1576 = 0;
                        var6.field1577 = 0;
                        var6.field1578 = var12;
                        var6.field1579 = 0;
                    }
                    if (var13 == 2) {
                        var6.field1579 = 0;
                    }
                } else if (var11 == -1 || var6.field1575 == -1 || class9.field163[var11].field171 >= class9.field163[var6.field1575].field171) {
                    var6.field1575 = var11;
                    var6.field1576 = 0;
                    var6.field1577 = 0;
                    var6.field1578 = var12;
                    var6.field1579 = 0;
                    var6.field1540 = var6.field1563;
                }
            }
            if ((var7 & 64) != 0) {
                var6.field653 = class19.method202(arg2.method551());
                var6.field1548 = var6.field653.field754;
                var6.field1561 = var6.field653.field759;
                var6.field1565 = var6.field653.field762;
                var6.field1566 = var6.field653.field770;
                var6.field1567 = var6.field653.field746;
                var6.field1568 = var6.field653.field763;
                var6.field1586 = var6.field653.field743;
            }
            if ((var7 & 16) != 0) {
                int var14 = arg2.method569(-234);
                int var15 = arg2.method570((byte) 96);
                var6.method534(7, field345, var14, var15);
                var6.field1536 = field345 + 300;
                var6.field1537 = arg2.method568(this.field278);
                var6.field1538 = arg2.method570((byte) 96);
            }
        }
    }

    @OriginalMember(owner = "client", name = "h", descriptor = "(B)V")
    public final void method101(byte arg0) {
        if (this.field307 == 0) {
            int var2 = super.field1052;
            if (arg0 == -126) {
                if (this.field454 == 1 && super.field1053 >= 516 && super.field1054 >= 160 && super.field1053 <= 765 && super.field1054 <= 205) {
                    var2 = 0;
                }
                if (this.field385) {
                    if (var2 != 1) {
                        int var3 = super.field1046;
                        int var4 = super.field1047;
                        if (this.field261 == 0) {
                            var3 -= 4;
                            var4 -= 4;
                        }
                        if (this.field261 == 1) {
                            var3 -= 553;
                            var4 -= 205;
                        }
                        if (this.field261 == 2) {
                            var3 -= 17;
                            var4 -= 357;
                        }
                        if (var3 < this.field262 - 10 || var3 > this.field264 + this.field262 + 10 || var4 < this.field263 - 10 || var4 > this.field265 + this.field263 + 10) {
                            this.field385 = false;
                            if (this.field261 == 1) {
                                this.field189 = true;
                            }
                            if (this.field261 == 2) {
                                this.field412 = true;
                            }
                        }
                    }
                    if (var2 == 1) {
                        int var5 = this.field262;
                        int var6 = this.field263;
                        int var7 = this.field264;
                        int var8 = super.field1053;
                        int var9 = super.field1054;
                        if (this.field261 == 0) {
                            var8 -= 4;
                            var9 -= 4;
                        }
                        if (this.field261 == 1) {
                            var8 -= 553;
                            var9 -= 205;
                        }
                        if (this.field261 == 2) {
                            var8 -= 17;
                            var9 -= 357;
                        }
                        int var10 = -1;
                        for (int var11 = 0; var11 < this.field219; ++var11) {
                            int var12 = (this.field219 - 1 - var11) * 15 + var6 + 31;
                            if (var8 > var5 && var8 < var5 + var7 && var9 > var12 - 13 && var9 < var12 + 3) {
                                var10 = var11;
                            }
                        }
                        if (var10 != -1) {
                            this.method82(var10, false);
                        }
                        this.field385 = false;
                        if (this.field261 == 1) {
                            this.field189 = true;
                        }
                        if (this.field261 == 2) {
                            this.field412 = true;
                            return;
                        }
                    }
                } else {
                    if (var2 == 1 && this.field219 > 0) {
                        int var13 = this.field366[this.field219 - 1];
                        if (var13 == 440 || var13 == 639 || var13 == 997 || var13 == 19 || var13 == 972 || var13 == 615 || var13 == 826 || var13 == 813 || var13 == 868 || var13 == 197 || var13 == 727 || var13 == 1654) {
                            int var14 = this.field364[this.field219 - 1];
                            int var15 = this.field365[this.field219 - 1];
                            class29 var16 = class29.field895[var15];
                            if (var16.field896 || var16.field931) {
                                this.field607 = false;
                                this.field424 = 0;
                                this.field305 = var15;
                                this.field306 = var14;
                                this.field307 = 2;
                                this.field308 = super.field1053;
                                this.field309 = super.field1054;
                                if (class29.field895[var15].field919 == this.field438) {
                                    this.field307 = 1;
                                }
                                if (class29.field895[var15].field919 == this.field606) {
                                    this.field307 = 3;
                                }
                                return;
                            }
                        }
                    }
                    if (var2 == 1 && (this.field220 == 1 || this.method94((byte) 5, this.field219 - 1)) && this.field219 > 2) {
                        var2 = 2;
                    }
                    if (var2 == 1 && this.field219 > 0) {
                        this.method82(this.field219 - 1, false);
                    }
                    if (var2 != 2 || this.field219 <= 0) {
                        return;
                    }
                    this.method137((byte) 83);
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "x", descriptor = "(I)V")
    public final void method102(int arg0) {
        ++field648;
        if (arg0 != 0) {
            this.field213 = this.field558.method549();
        }
        if (field648 > 147) {
            field648 = 0;
            this.field232.method538(212, (byte) 0);
            this.field232.method539(46);
        }
        while (true) {
            int var2;
            do {
                while (true) {
                    var2 = this.method337(7);
                    if (var2 == -1) {
                        return;
                    }
                    if (this.field438 != -1 && this.field472 == this.field438) {
                        if (var2 == 8 && this.field581.length() > 0) {
                            this.field581 = this.field581.substring(0, this.field581.length() - 1);
                        }
                        break;
                    }
                    if (this.field460) {
                        if (var2 >= 32 && var2 <= 122 && this.field610.length() < 80) {
                            this.field610 = this.field610 + (char) var2;
                            this.field412 = true;
                        }
                        if (var2 == 8 && this.field610.length() > 0) {
                            this.field610 = this.field610.substring(0, this.field610.length() - 1);
                            this.field412 = true;
                        }
                        if (var2 == 13 || var2 == 10) {
                            this.field460 = false;
                            this.field412 = true;
                            if (this.field531 == 1) {
                                long var3 = class21.method209(this.field610);
                                this.method54(var3, 0);
                            }
                            if (this.field531 == 2 && this.field508 > 0) {
                                long var5 = class21.method209(this.field610);
                                this.method110(21834, var5);
                            }
                            if (this.field531 == 3 && this.field610.length() > 0) {
                                this.field232.method538(43, (byte) 0);
                                this.field232.method539(0);
                                int var7 = this.field232.field1612;
                                this.field232.method545(false, this.field522);
                                class17.method200(this.field232, (byte) 5, this.field610);
                                this.field232.method548(this.field232.field1612 - var7, true);
                                this.field610 = class17.method201(-164, this.field610);
                                this.field610 = class28.method244(-164, this.field610);
                                this.method146(6, this.field610, class21.method213(31698, class21.method210(0, this.field522)), false);
                                if (this.field612 == 2) {
                                    this.field612 = 1;
                                    this.field181 = true;
                                    this.field232.method538(192, (byte) 0);
                                    this.field232.method539(this.field628);
                                    this.field232.method539(this.field612);
                                    this.field232.method539(this.field357);
                                }
                            }
                            if (this.field531 == 4 && this.field458 < 100) {
                                long var8 = class21.method209(this.field610);
                                this.method91(0, var8);
                            }
                            if (this.field531 == 5 && this.field458 > 0) {
                                long var10 = class21.method209(this.field610);
                                this.method163(true, var10);
                            }
                        }
                    } else if (this.field310 == 1) {
                        if (var2 >= 48 && var2 <= 57 && this.field552.length() < 10) {
                            this.field552 = this.field552 + (char) var2;
                            this.field412 = true;
                        }
                        if (var2 == 8 && this.field552.length() > 0) {
                            this.field552 = this.field552.substring(0, this.field552.length() - 1);
                            this.field412 = true;
                        }
                        if (var2 == 13 || var2 == 10) {
                            if (this.field552.length() > 0) {
                                int var12 = 0;
                                try {
                                    var12 = Integer.parseInt(this.field552);
                                } catch (Exception var22) {
                                }
                                this.field232.method538(67, (byte) 0);
                                this.field232.method543(var12);
                            }
                            this.field310 = 0;
                            this.field412 = true;
                        }
                    } else if (this.field310 == 2) {
                        if (var2 >= 32 && var2 <= 122 && this.field552.length() < 12) {
                            this.field552 = this.field552 + (char) var2;
                            this.field412 = true;
                        }
                        if (var2 == 8 && this.field552.length() > 0) {
                            this.field552 = this.field552.substring(0, this.field552.length() - 1);
                            this.field412 = true;
                        }
                        if (var2 == 13 || var2 == 10) {
                            if (this.field552.length() > 0) {
                                this.field232.method538(241, (byte) 0);
                                this.field232.method545(false, class21.method209(this.field552));
                            }
                            this.field310 = 0;
                            this.field412 = true;
                        }
                    } else if (this.field606 == -1) {
                        if (var2 >= 32 && var2 <= 122 && this.field609.length() < 80) {
                            this.field609 = this.field609 + (char) var2;
                            this.field412 = true;
                        }
                        if (var2 == 8 && this.field609.length() > 0) {
                            this.field609 = this.field609.substring(0, this.field609.length() - 1);
                            this.field412 = true;
                        }
                        if ((var2 == 13 || var2 == 10) && this.field609.length() > 0) {
                            if (this.field379 == 2) {
                                if (this.field609.equals("::clientdrop")) {
                                    this.method85(2317);
                                }
                                if (this.field609.equals("::lag")) {
                                    this.method44(0);
                                }
                                if (this.field609.equals("::prefetchmusic")) {
                                    for (int var13 = 0; var13 < this.field520.method435(2, true); ++var13) {
                                        this.field520.method443(3, (byte) 1, var13, 2);
                                    }
                                }
                                if (this.field609.equals("::fpson")) {
                                    field388 = true;
                                }
                                if (this.field609.equals("::fpsoff")) {
                                    field388 = false;
                                }
                                if (this.field609.equals("::noclip")) {
                                    for (int var14 = 0; var14 < 4; ++var14) {
                                        for (int var15 = 1; var15 < 103; ++var15) {
                                            for (int var16 = 1; var16 < 103; ++var16) {
                                                this.field391[var14].field813[var15][var16] = 0;
                                            }
                                        }
                                    }
                                }
                            }
                            if (this.field609.startsWith("::")) {
                                this.field232.method538(155, (byte) 0);
                                this.field232.method539(this.field609.length() - 1);
                                this.field232.method546(this.field609.substring(2));
                            } else {
                                String var17 = this.field609.toLowerCase();
                                byte var18 = 0;
                                if (var17.startsWith("yellow:")) {
                                    var18 = 0;
                                    this.field609 = this.field609.substring(7);
                                } else if (var17.startsWith("red:")) {
                                    var18 = 1;
                                    this.field609 = this.field609.substring(4);
                                } else if (var17.startsWith("green:")) {
                                    var18 = 2;
                                    this.field609 = this.field609.substring(6);
                                } else if (var17.startsWith("cyan:")) {
                                    var18 = 3;
                                    this.field609 = this.field609.substring(5);
                                } else if (var17.startsWith("purple:")) {
                                    var18 = 4;
                                    this.field609 = this.field609.substring(7);
                                } else if (var17.startsWith("white:")) {
                                    var18 = 5;
                                    this.field609 = this.field609.substring(6);
                                } else if (var17.startsWith("flash1:")) {
                                    var18 = 6;
                                    this.field609 = this.field609.substring(7);
                                } else if (var17.startsWith("flash2:")) {
                                    var18 = 7;
                                    this.field609 = this.field609.substring(7);
                                } else if (var17.startsWith("flash3:")) {
                                    var18 = 8;
                                    this.field609 = this.field609.substring(7);
                                } else if (var17.startsWith("glow1:")) {
                                    var18 = 9;
                                    this.field609 = this.field609.substring(6);
                                } else if (var17.startsWith("glow2:")) {
                                    var18 = 10;
                                    this.field609 = this.field609.substring(6);
                                } else if (var17.startsWith("glow3:")) {
                                    var18 = 11;
                                    this.field609 = this.field609.substring(6);
                                }
                                String var19 = this.field609.toLowerCase();
                                byte var20 = 0;
                                if (var19.startsWith("wave:")) {
                                    var20 = 1;
                                    this.field609 = this.field609.substring(5);
                                } else if (var19.startsWith("wave2:")) {
                                    var20 = 2;
                                    this.field609 = this.field609.substring(6);
                                } else if (var19.startsWith("shake:")) {
                                    var20 = 3;
                                    this.field609 = this.field609.substring(6);
                                } else if (var19.startsWith("scroll:")) {
                                    var20 = 4;
                                    this.field609 = this.field609.substring(7);
                                } else if (var19.startsWith("slide:")) {
                                    var20 = 5;
                                    this.field609 = this.field609.substring(6);
                                }
                                this.field232.method538(173, (byte) 0);
                                this.field232.method539(0);
                                int var21 = this.field232.field1612;
                                this.field232.method539(var18);
                                this.field232.method565(var20, true);
                                this.field269.field1612 = 0;
                                class17.method200(this.field269, (byte) 5, this.field609);
                                this.field232.method583(0, 173, this.field269.field1612, this.field269.field1611);
                                this.field232.method548(this.field232.field1612 - var21, true);
                                this.field609 = class17.method201(-164, this.field609);
                                this.field609 = class28.method244(-164, this.field609);
                                field442.field1544 = this.field609;
                                field442.field1541 = var18;
                                field442.field1549 = var20;
                                field442.field1585 = 150;
                                if (this.field379 == 2) {
                                    this.method146(2, field442.field1544, "@cr2@" + field442.field13, false);
                                } else if (this.field379 == 1) {
                                    this.method146(2, field442.field1544, "@cr1@" + field442.field13, false);
                                } else {
                                    this.method146(2, field442.field1544, field442.field13, false);
                                }
                                if (this.field628 == 2) {
                                    this.field628 = 3;
                                    this.field181 = true;
                                    this.field232.method538(192, (byte) 0);
                                    this.field232.method539(this.field628);
                                    this.field232.method539(this.field612);
                                    this.field232.method539(this.field357);
                                }
                            }
                            this.field609 = "";
                            this.field412 = true;
                        }
                    }
                }
            } while ((var2 < 97 || var2 > 122) && (var2 < 65 || var2 > 90) && (var2 < 48 || var2 > 57) && var2 != 32);
            if (this.field581.length() < 12) {
                this.field581 = this.field581 + (char) var2;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIZLJDSNLLMP;IIII)V")
    public final void method103(int arg0, int arg1, int arg2, boolean arg3, class29 arg4, int arg5, int arg6, int arg7, int arg8) {
        int var10 = 33 / arg6;
        if (this.field635) {
            this.field533 = 32;
        } else {
            this.field533 = 0;
        }
        this.field635 = false;
        if (arg8 >= arg5 && arg8 < arg5 + 16 && arg1 >= arg0 && arg1 < arg0 + 16) {
            arg4.field889 -= this.field420 * 4;
            if (arg3) {
                this.field189 = true;
                return;
            }
        } else if (arg8 >= arg5 && arg8 < arg5 + 16 && arg1 >= arg0 + arg7 - 16 && arg1 < arg0 + arg7) {
            arg4.field889 += this.field420 * 4;
            if (arg3) {
                this.field189 = true;
                return;
            }
        } else {
            if (arg8 < arg5 - this.field533 || arg8 >= arg5 + 16 + this.field533 || arg1 < arg0 + 16 || arg1 >= arg0 + arg7 - 16 || this.field420 <= 0) {
                return;
            }
            int var11 = (arg7 - 32) * arg7 / arg2;
            if (var11 < 8) {
                var11 = 8;
            }
            int var12 = arg1 - arg0 - 16 - var11 / 2;
            int var13 = arg7 - 32 - var11;
            arg4.field889 = (arg2 - arg7) * var12 / var13;
            if (arg3) {
                this.field189 = true;
            }
            this.field635 = true;
        }
    }

    @OriginalMember(owner = "client", name = "y", descriptor = "(I)V")
    public final void method104(int arg0) {
        if (arg0 <= 0) {
            this.field614 = null;
        }
        for (int var2 = -1; var2 < this.field483; ++var2) {
            int var6;
            if (var2 == -1) {
                var6 = this.field481;
            } else {
                var6 = this.field484[var2];
            }
            class1 var7 = this.field482[var6];
            if (var7 != null && var7.field1585 > 0) {
                --var7.field1585;
                if (var7.field1585 == 0) {
                    var7.field1544 = null;
                }
            }
        }
        for (int var3 = 0; var3 < this.field271; ++var3) {
            int var4 = this.field272[var3];
            class10 var5 = this.field270[var4];
            if (var5 != null && var5.field1585 > 0) {
                --var5.field1585;
                if (var5.field1585 == 0) {
                    var5.field1544 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIIII)V")
    public final void method105(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        while (arg6 >= 0) {
            this.field538 = 291;
        }
        int var8 = 2048 - arg0 & 2047;
        int var9 = 2048 - arg1 & 2047;
        int var10 = 0;
        int var11 = 0;
        int var12 = arg4;
        if (var8 != 0) {
            int var13 = class39.field1169[var8];
            int var14 = class39.field1170[var8];
            int var15 = var11 * var14 - arg4 * var13 >> 16;
            var12 = var11 * var13 + arg4 * var14 >> 16;
            var11 = var15;
        }
        if (var9 != 0) {
            int var16 = class39.field1169[var9];
            int var17 = class39.field1170[var9];
            int var18 = var10 * var17 + var12 * var16 >> 16;
            var12 = var12 * var17 - var10 * var16 >> 16;
            var10 = var18;
        }
        this.field443 = arg2 - var10;
        this.field444 = arg3 - var11;
        this.field445 = arg5 - var12;
        this.field446 = arg0;
        this.field447 = arg1;
    }

    @OriginalMember(owner = "client", name = "z", descriptor = "(I)V")
    public final void method106(int arg0) {
        this.field224.method372(0);
        if (this.field196 == 2) {
            byte[] var2 = this.field599.field703;
            int[] var3 = class31.field953;
            int var4 = var2.length;
            for (int var5 = 0; var5 < var4; ++var5) {
                if (var2[var5] == 0) {
                    var3[var5] = 0;
                }
            }
            this.field611.method183(256, 0, this.field528, 25, 33, 0, this.field360, 33, 25, (byte) 9, this.field584);
            this.field225.method372(0);
        } else {
            int var6 = this.field528 + this.field352 & 2047;
            while (arg0 >= 0) {
                this.field213 = this.field558.method549();
            }
            int var7 = field442.field1569 / 32 + 48;
            int var8 = 464 - field442.field1570 / 32;
            this.field396.method183(this.field256 + 256, 5, var6, var8, 151, 25, this.field473, 146, var7, (byte) 9, this.field222);
            this.field611.method183(256, 0, this.field528, 25, 33, 0, this.field360, 33, 25, (byte) 9, this.field584);
            for (int var9 = 0; var9 < this.field286; ++var9) {
                int var39 = this.field287[var9] * 4 + 2 - field442.field1569 / 32;
                int var40 = this.field288[var9] * 4 + 2 - field442.field1570 / 32;
                this.method83(var40, var39, (byte) -94, this.field592[var9]);
            }
            for (int var10 = 0; var10 < 104; ++var10) {
                for (int var35 = 0; var35 < 104; ++var35) {
                    class65 var36 = this.field614[this.field494][var10][var35];
                    if (var36 != null) {
                        int var37 = var10 * 4 + 2 - field442.field1569 / 32;
                        int var38 = var35 * 4 + 2 - field442.field1570 / 32;
                        this.method83(var38, var37, (byte) -94, this.field317);
                    }
                }
            }
            for (int var11 = 0; var11 < this.field271; ++var11) {
                class10 var31 = this.field270[this.field272[var11]];
                if (var31 != null && var31.method1(8)) {
                    class19 var32 = var31.field653;
                    if (var32.field772 != null) {
                        var32 = var32.method206(false);
                    }
                    if (var32 != null && var32.field752 && var32.field757) {
                        int var33 = var31.field1569 / 32 - field442.field1569 / 32;
                        int var34 = var31.field1570 / 32 - field442.field1570 / 32;
                        this.method83(var34, var33, (byte) -94, this.field318);
                    }
                }
            }
            for (int var12 = 0; var12 < this.field483; ++var12) {
                class1 var23 = this.field482[this.field484[var12]];
                if (var23 != null && var23.method1(8)) {
                    int var24 = var23.field1569 / 32 - field442.field1569 / 32;
                    int var25 = var23.field1570 / 32 - field442.field1570 / 32;
                    boolean var26 = false;
                    long var27 = class21.method209(var23.field13);
                    for (int var29 = 0; var29 < this.field508; ++var29) {
                        if (this.field187[var29] == var27 && this.field470[var29] != 0) {
                            var26 = true;
                            break;
                        }
                    }
                    boolean var30 = false;
                    if (field442.field2 != 0 && var23.field2 != 0 && field442.field2 == var23.field2) {
                        var30 = true;
                    }
                    if (var26) {
                        this.method83(var25, var24, (byte) -94, this.field320);
                    } else if (var30) {
                        this.method83(var25, var24, (byte) -94, this.field321);
                    } else {
                        this.method83(var25, var24, (byte) -94, this.field319);
                    }
                }
            }
            if (this.field474 != 0 && field345 % 20 < 10) {
                if (this.field474 == 1 && this.field570 >= 0 && this.field570 < this.field270.length) {
                    class10 var13 = this.field270[this.field570];
                    if (var13 != null) {
                        int var14 = var13.field1569 / 32 - field442.field1569 / 32;
                        int var15 = var13.field1570 / 32 - field442.field1570 / 32;
                        this.method48(var14, true, var15, this.field452);
                    }
                }
                if (this.field474 == 2) {
                    int var16 = (this.field514 - this.field248) * 4 + 2 - field442.field1569 / 32;
                    int var17 = (this.field515 - this.field249) * 4 + 2 - field442.field1570 / 32;
                    this.method48(var16, true, var17, this.field452);
                }
                if (this.field474 == 10 && this.field453 >= 0 && this.field453 < this.field482.length) {
                    class1 var18 = this.field482[this.field453];
                    if (var18 != null) {
                        int var19 = var18.field1569 / 32 - field442.field1569 / 32;
                        int var20 = var18.field1570 / 32 - field442.field1570 / 32;
                        this.method48(var19, true, var20, this.field452);
                    }
                }
            }
            if (this.field394 != 0) {
                int var21 = this.field394 * 4 + 2 - field442.field1569 / 32;
                int var22 = this.field395 * 4 + 2 - field442.field1570 / 32;
                this.method83(var22, var21, (byte) -94, this.field451);
            }
            class31.method284(97, 78, 16777215, (byte) -4, 3, 3);
            this.field225.method372(0);
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(BI)V")
    public final void method107(byte arg0, int arg1) {
        if (arg0 != -125) {
            this.field213 = -1;
        }
        signlink.wavevol = arg1;
    }

    @OriginalMember(owner = "client", name = "A", descriptor = "(I)V")
    public final void method108(int arg0) {
        this.field637 = 0;
        if (arg0 != 5) {
            this.field232.method539(99);
        }
        for (int var2 = -1; var2 < this.field483 + this.field271; ++var2) {
            class67 var19;
            if (var2 == -1) {
                var19 = field442;
            } else if (var2 < this.field483) {
                var19 = this.field482[this.field484[var2]];
            } else {
                var19 = this.field270[this.field272[var2 - this.field483]];
            }
            if (var19 != null && var19.method1(8)) {
                if (var19 instanceof class10) {
                    class19 var20 = ((class10) var19).field653;
                    if (var20.field772 != null) {
                        var20 = var20.method206(false);
                    }
                    if (var20 == null) {
                        continue;
                    }
                }
                if (var2 >= this.field483) {
                    class19 var24 = ((class10) var19).field653;
                    if (var24.field782 >= 0 && var24.field782 < this.field267.length) {
                        this.method139((byte) 4, var19.field1558 + 15, var19);
                        if (this.field358 > -1) {
                            this.field267[var24.field782].method179(this.field359 - 30, this.field358 - 12, 49598);
                        }
                    }
                    if (this.field474 == 1 && this.field272[var2 - this.field483] == this.field570 && field345 % 20 < 10) {
                        this.method139((byte) 4, var19.field1558 + 15, var19);
                        if (this.field358 > -1) {
                            this.field267[2].method179(this.field359 - 28, this.field358 - 12, 49598);
                        }
                    }
                } else {
                    int var21 = 30;
                    class1 var22 = (class1) var19;
                    if (var22.field28 != 0) {
                        this.method139((byte) 4, var19.field1558 + 15, var19);
                        if (this.field358 > -1) {
                            for (int var23 = 0; var23 < 8; ++var23) {
                                if ((var22.field28 & 1 << var23) != 0) {
                                    this.field267[var23].method179(this.field359 - var21, this.field358 - 12, 49598);
                                    var21 -= 25;
                                }
                            }
                        }
                    }
                    if (var2 >= 0 && this.field474 == 10 && this.field484[var2] == this.field453) {
                        this.method139((byte) 4, var19.field1558 + 15, var19);
                        if (this.field358 > -1) {
                            this.field267[7].method179(this.field359 - var21, this.field358 - 12, 49598);
                        }
                    }
                }
                if (var19.field1544 != null && (var2 >= this.field483 || this.field628 == 0 || this.field628 == 3 || this.field628 == 1 && this.method26(((class1) var19).field13, 15404))) {
                    this.method139((byte) 4, var19.field1558, var19);
                    if (this.field358 > -1 && this.field637 < this.field638) {
                        this.field642[this.field637] = this.field410.method385(-1850, var19.field1544) / 2;
                        this.field641[this.field637] = this.field410.field1207;
                        this.field639[this.field637] = this.field358;
                        this.field640[this.field637] = this.field359;
                        this.field643[this.field637] = var19.field1541;
                        this.field644[this.field637] = var19.field1549;
                        this.field645[this.field637] = var19.field1585;
                        this.field646[this.field637++] = var19.field1544;
                        if (this.field551 == 0 && var19.field1549 >= 1 && var19.field1549 <= 3) {
                            this.field641[this.field637] += 10;
                            this.field640[this.field637] += 5;
                        }
                        if (this.field551 == 0 && var19.field1549 == 4) {
                            this.field642[this.field637] = 60;
                        }
                        if (this.field551 == 0 && var19.field1549 == 5) {
                            this.field641[this.field637] += 5;
                        }
                    }
                }
                if (var19.field1536 > field345) {
                    this.method139((byte) 4, var19.field1558 + 15, var19);
                    if (this.field358 > -1) {
                        int var25 = var19.field1537 * 30 / var19.field1538;
                        if (var25 > 30) {
                            var25 = 30;
                        }
                        class31.method284(this.field358 - 15, this.field359 - 3, 65280, (byte) -4, 5, var25);
                        class31.method284(this.field358 - 15 + var25, this.field359 - 3, 16711680, (byte) -4, 5, 30 - var25);
                    }
                }
                for (int var26 = 0; var26 < 4; ++var26) {
                    if (var19.field1547[var26] > field345) {
                        this.method139((byte) 4, var19.field1558 / 2, var19);
                        if (this.field358 > -1) {
                            if (var26 == 1) {
                                this.field359 -= 20;
                            }
                            if (var26 == 2) {
                                this.field358 -= 15;
                                this.field359 -= 10;
                            }
                            if (var26 == 3) {
                                this.field358 += 15;
                                this.field359 -= 10;
                            }
                            this.field588[var19.field1546[var26]].method179(this.field359 - 12, this.field358 - 12, 49598);
                            this.field408.method382(0, 19850, String.valueOf(var19.field1545[var26]), this.field359 + 4, this.field358);
                            this.field408.method382(16777215, 19850, String.valueOf(var19.field1545[var26]), this.field359 + 3, this.field358 - 1);
                        }
                    }
                }
            }
        }
        for (int var3 = 0; var3 < this.field637; ++var3) {
            int var4 = this.field639[var3];
            int var5 = this.field640[var3];
            int var6 = this.field642[var3];
            int var7 = this.field641[var3];
            boolean var8 = true;
            while (var8) {
                var8 = false;
                for (int var18 = 0; var18 < var3; ++var18) {
                    if (var5 + 2 > this.field640[var18] - this.field641[var18] && var5 - var7 < this.field640[var18] + 2 && var4 - var6 < this.field642[var18] + this.field639[var18] && var4 + var6 > this.field639[var18] - this.field642[var18] && this.field640[var18] - this.field641[var18] < var5) {
                        var5 = this.field640[var18] - this.field641[var18];
                        var8 = true;
                    }
                }
            }
            this.field358 = this.field639[var3];
            this.field359 = this.field640[var3] = var5;
            String var9 = this.field646[var3];
            if (this.field551 == 0) {
                int var10 = 16776960;
                if (this.field643[var3] < 6) {
                    var10 = this.field192[this.field643[var3]];
                }
                if (this.field643[var3] == 6) {
                    var10 = this.field354 % 20 < 10 ? 16711680 : 16776960;
                }
                if (this.field643[var3] == 7) {
                    var10 = this.field354 % 20 < 10 ? 255 : 65535;
                }
                if (this.field643[var3] == 8) {
                    var10 = this.field354 % 20 < 10 ? 45056 : 8454016;
                }
                if (this.field643[var3] == 9) {
                    int var11 = 150 - this.field645[var3];
                    if (var11 < 50) {
                        var10 = var11 * 1280 + 16711680;
                    } else if (var11 < 100) {
                        var10 = 16776960 - (var11 - 50) * 327680;
                    } else if (var11 < 150) {
                        var10 = (var11 - 100) * 5 + 65280;
                    }
                }
                if (this.field643[var3] == 10) {
                    int var12 = 150 - this.field645[var3];
                    if (var12 < 50) {
                        var10 = var12 * 5 + 16711680;
                    } else if (var12 < 100) {
                        var10 = 16711935 - (var12 - 50) * 327680;
                    } else if (var12 < 150) {
                        var10 = (var12 - 100) * 327680 + 255 - (var12 - 100) * 5;
                    }
                }
                if (this.field643[var3] == 11) {
                    int var13 = 150 - this.field645[var3];
                    if (var13 < 50) {
                        var10 = 16777215 - var13 * 327685;
                    } else if (var13 < 100) {
                        var10 = (var13 - 50) * 327685 + 65280;
                    } else if (var13 < 150) {
                        var10 = 16777215 - (var13 - 100) * 327680;
                    }
                }
                if (this.field644[var3] == 0) {
                    this.field410.method382(0, 19850, var9, this.field359 + 1, this.field358);
                    this.field410.method382(var10, 19850, var9, this.field359, this.field358);
                }
                if (this.field644[var3] == 1) {
                    this.field410.method387(this.field359 + 1, -442, this.field358, this.field354, 0, var9);
                    this.field410.method387(this.field359, -442, this.field358, this.field354, var10, var9);
                }
                if (this.field644[var3] == 2) {
                    this.field410.method388(0, this.field359 + 1, this.field354, this.field358, 0, var9);
                    this.field410.method388(var10, this.field359, this.field354, this.field358, 0, var9);
                }
                if (this.field644[var3] == 3) {
                    this.field410.method389(this.field359 + 1, var9, 150 - this.field645[var3], (byte) 9, this.field354, 0, this.field358);
                    this.field410.method389(this.field359, var9, 150 - this.field645[var3], (byte) 9, this.field354, var10, this.field358);
                }
                if (this.field644[var3] == 4) {
                    int var14 = this.field410.method385(-1850, var9);
                    int var15 = (150 - this.field645[var3]) * (var14 + 100) / 150;
                    class31.method281(0, 334, this.field358 + 50, this.field358 - 50, 1);
                    this.field410.method386(this.field358 + 50 - var15, var9, 0, -997, this.field359 + 1);
                    this.field410.method386(this.field358 + 50 - var15, var9, var10, -997, this.field359);
                    class31.method280(true);
                }
                if (this.field644[var3] == 5) {
                    int var16 = 150 - this.field645[var3];
                    int var17 = 0;
                    if (var16 < 25) {
                        var17 = var16 - 25;
                    } else if (var16 > 125) {
                        var17 = var16 - 125;
                    }
                    class31.method281(this.field359 - this.field410.field1207 - 1, this.field359 + 5, 512, 0, 1);
                    this.field410.method382(0, 19850, var9, this.field359 + 1 + var17, this.field358);
                    this.field410.method382(var10, 19850, var9, this.field359 + var17, this.field358);
                    class31.method280(true);
                }
            } else {
                this.field410.method382(0, 19850, var9, this.field359 + 1, this.field358);
                this.field410.method382(16776960, 19850, var9, this.field359, this.field358);
            }
        }
    }

    @OriginalMember(owner = "client", name = "B", descriptor = "(I)V")
    public final void method109(int arg0) {
        try {
            this.field210 = -1;
            this.field362.method532();
            this.field513.method532();
            class33.method298(85);
            this.method111((byte) 6);
            this.field585.method457((byte) -124);
            System.gc();
            for (int var2 = 0; var2 < 4; ++var2) {
                this.field391[var2].method215();
            }
            for (int var3 = 0; var3 < 4; ++var3) {
                for (int var4 = 0; var4 < 104; ++var4) {
                    for (int var5 = 0; var5 < 104; ++var5) {
                        this.field634[var3][var4][var5] = 0;
                    }
                }
            }
            class34 var6 = new class34(-32174, this.field634, this.field377, 104, 104);
            int var7 = this.field542.length;
            this.field232.method538(236, (byte) 0);
            if (!this.field311) {
                for (int var8 = 0; var8 < var7; ++var8) {
                    int var9 = (this.field467[var8] >> 8) * 64 - this.field248;
                    int var10 = (this.field467[var8] & 255) * 64 - this.field249;
                    byte[] var11 = this.field542[var8];
                    if (var11 != null) {
                        var6.method312((this.field230 - 6) * 8, this.field391, var9, (this.field229 - 6) * 8, 0, var10, var11);
                    }
                }
                for (int var12 = 0; var12 < var7; ++var12) {
                    int var13 = (this.field467[var12] >> 8) * 64 - this.field248;
                    int var14 = (this.field467[var12] & 255) * 64 - this.field249;
                    byte[] var15 = this.field542[var12];
                    if (var15 == null && this.field230 < 800) {
                        var6.method329(false, 64, 64, var14, var13);
                    }
                }
                this.field232.method538(236, (byte) 0);
                for (int var16 = 0; var16 < var7; ++var16) {
                    byte[] var17 = this.field536[var16];
                    if (var17 != null) {
                        int var18 = (this.field467[var16] >> 8) * 64 - this.field248;
                        int var19 = (this.field467[var16] & 255) * 64 - this.field249;
                        var6.method320(var19, var18, this.field391, var17, true, this.field585);
                    }
                }
            }
            if (this.field311) {
                int var20 = 0;
                label248: while (true) {
                    if (var20 >= 4) {
                        for (int var30 = 0; var30 < 13; ++var30) {
                            for (int var31 = 0; var31 < 13; ++var31) {
                                int var32 = this.field578[0][var30][var31];
                                if (var32 == -1) {
                                    var6.method329(false, 8, 8, var31 * 8, var30 * 8);
                                }
                            }
                        }
                        this.field232.method538(236, (byte) 0);
                        int var33 = 0;
                        while (true) {
                            if (var33 >= 4) {
                                break label248;
                            }
                            for (int var34 = 0; var34 < 13; ++var34) {
                                for (int var35 = 0; var35 < 13; ++var35) {
                                    int var36 = this.field578[var33][var34][var35];
                                    if (var36 != -1) {
                                        int var37 = var36 >> 24 & 3;
                                        int var38 = var36 >> 1 & 3;
                                        int var39 = var36 >> 14 & 1023;
                                        int var40 = var36 >> 3 & 2047;
                                        int var41 = (var39 / 8 << 8) + var40 / 8;
                                        for (int var42 = 0; var42 < this.field467.length; ++var42) {
                                            if (this.field467[var42] == var41 && this.field536[var42] != null) {
                                                var6.method322(47822, this.field585, var33, var38, (var39 & 7) * 8, (var40 & 7) * 8, var35 * 8, this.field536[var42], this.field391, var34 * 8, var37);
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
                            int var23 = this.field578[var20][var21][var22];
                            if (var23 != -1) {
                                int var24 = var23 >> 24 & 3;
                                int var25 = var23 >> 1 & 3;
                                int var26 = var23 >> 14 & 1023;
                                int var27 = var23 >> 3 & 2047;
                                int var28 = (var26 / 8 << 8) + var27 / 8;
                                for (int var29 = 0; var29 < this.field467.length; ++var29) {
                                    if (this.field467[var29] == var28 && this.field542[var29] != null) {
                                        var6.method319(var20, this.field391, (var26 & 7) * 8, var24, (var27 & 7) * 8, var21 * 8, true, var25, var22 * 8, this.field542[var29]);
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    ++var20;
                }
            }
            this.field232.method538(236, (byte) 0);
            var6.method332(this.field585, (byte) 6, this.field391);
            this.field225.method372(0);
            this.field232.method538(236, (byte) 0);
            int var43 = class34.field1019;
            if (var43 > this.field494) {
                var43 = this.field494;
            }
            if (var43 < this.field494 - 1) {
                int var44 = this.field494 - 1;
            }
            if (field238) {
                this.field585.method458(-2959, class34.field1019);
            } else {
                this.field585.method458(-2959, 0);
            }
            for (int var45 = 0; var45 < 104; ++var45) {
                for (int var46 = 0; var46 < 104; ++var46) {
                    this.method99(var45, var46);
                }
            }
            this.method58(0);
        } catch (Exception var59) {
        }
        class48.field1246.method229();
        if (super.field1041 != null) {
            this.field232.method538(118, (byte) 0);
            this.field232.method543(1057001181);
        }
        if (field238 && signlink.cache_dat != null) {
            int var48 = this.field520.method435(0, true);
            for (int var49 = 0; var49 < var48; ++var49) {
                int var50 = this.field520.method436(var49, 8);
                if ((var50 & 121) == 0) {
                    class39.method345(var49, 636);
                }
            }
        }
        System.gc();
        class33.method299(20, (byte) 8);
        this.field520.method444(false);
        int var51 = (this.field229 - 6) / 8 - 1;
        int var52 = (this.field229 + 6) / 8 + 1;
        int var53 = (this.field230 - 6) / 8 - 1;
        int var54 = (this.field230 + 6) / 8 + 1;
        if (arg0 >= 0) {
            this.field572 = -225;
        }
        if (this.field375) {
            var51 = 49;
            var52 = 50;
            var53 = 49;
            var54 = 50;
        }
        for (int var55 = var51; var55 <= var52; ++var55) {
            for (int var56 = var53; var56 <= var54; ++var56) {
                if (var51 == var55 || var52 == var55 || var53 == var56 || var54 == var56) {
                    int var57 = this.field520.method433(0, var55, 0, var56);
                    if (var57 != -1) {
                        this.field520.method441(var57, 3, true);
                    }
                    int var58 = this.field520.method433(0, var55, 1, var56);
                    if (var58 != -1) {
                        this.field520.method441(var58, 3, true);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(IJ)V")
    public final void method110(int arg0, long arg1) {
        if (arg1 != 0L) {
            for (int var4 = 0; var4 < this.field508; ++var4) {
                if (this.field187[var4] == arg1) {
                    --this.field508;
                    this.field189 = true;
                    for (int var5 = var4; var5 < this.field508; ++var5) {
                        this.field595[var5] = this.field595[var5 + 1];
                        this.field470[var5] = this.field470[var5 + 1];
                        this.field187[var5] = this.field187[var5 + 1];
                    }
                    this.field232.method538(7, (byte) 0);
                    this.field232.method545(false, arg1);
                    break;
                }
            }
            if (this.field386 != arg0) {
                this.field213 = this.field558.method549();
            }
        }
    }

    @OriginalMember(owner = "client", name = "i", descriptor = "(B)V")
    public final void method111(byte arg0) {
        class48.field1246.method229();
        class48.field1247.method229();
        class19.field745.method229();
        class3.field91.method229();
        class3.field95.method229();
        class1.field17.method229();
        class27.field859.method229();
        if (arg0 != 6) {
            this.field330 = !this.field330;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZZ)V")
    public final void method112(boolean arg0, boolean arg1) {
        if (arg0) {
            this.field330 = !this.field330;
        }
        for (int var3 = 0; var3 < this.field271; ++var3) {
            class10 var4 = this.field270[this.field272[var3]];
            int var5 = (this.field272[var3] << 14) + 536870912;
            if (var4 != null && var4.method1(8) && var4.field653.field760 == arg1) {
                int var6 = var4.field1569 >> 7;
                int var7 = var4.field1570 >> 7;
                if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
                    if (var4.field1548 == 1 && (var4.field1569 & 127) == 64 && (var4.field1570 & 127) == 64) {
                        if (this.field450[var6][var7] == this.field354) {
                            continue;
                        }
                        this.field450[var6][var7] = this.field354;
                    }
                    if (!var4.field653.field757) {
                        var5 += Integer.MIN_VALUE;
                    }
                    this.field585.method468(var4.field1570, var4.field1535, this.method81(0, var4.field1570, this.field494, var4.field1569), var4.field1569, var5, 48192, this.field494, var4, var4.field1571, (var4.field1548 - 1) * 64 + 60);
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(ZI)Ljava/lang/String;")
    public final String method113(boolean arg0, int arg1) {
        if (arg0) {
            this.method119();
        }
        return arg1 < 999999999 ? String.valueOf(arg1) : "*";
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILJDSNLLMP;)Z")
    public final boolean method114(int arg0, class29 arg1) {
        int var3 = arg1.field892;
        if (arg0 <= 0) {
            throw new NullPointerException();
        } else {
            if (this.field509 == 2) {
                if (var3 == 201) {
                    this.field412 = true;
                    this.field310 = 0;
                    this.field460 = true;
                    this.field610 = "";
                    this.field531 = 1;
                    this.field624 = "Enter name of friend to add to list";
                }
                if (var3 == 202) {
                    this.field412 = true;
                    this.field310 = 0;
                    this.field460 = true;
                    this.field610 = "";
                    this.field531 = 2;
                    this.field624 = "Enter name of friend to delete from list";
                }
            }
            if (var3 == 205) {
                this.field216 = 250;
                return true;
            } else {
                if (var3 == 501) {
                    this.field412 = true;
                    this.field310 = 0;
                    this.field460 = true;
                    this.field610 = "";
                    this.field531 = 4;
                    this.field624 = "Enter name of player to add to list";
                }
                if (var3 == 502) {
                    this.field412 = true;
                    this.field310 = 0;
                    this.field460 = true;
                    this.field610 = "";
                    this.field531 = 5;
                    this.field624 = "Enter name of player to delete from list";
                }
                if (var3 >= 300 && var3 <= 313) {
                    int var4 = (var3 - 300) / 2;
                    int var5 = var3 & 1;
                    int var6 = this.field597[var4];
                    if (var6 != -1) {
                        while (true) {
                            if (var5 == 0) {
                                --var6;
                                if (var6 < 0) {
                                    var6 = class60.field1470 - 1;
                                }
                            }
                            if (var5 == 1) {
                                ++var6;
                                if (var6 >= class60.field1470) {
                                    var6 = 0;
                                }
                            }
                            if (!class60.field1471[var6].field1477 && class60.field1471[var6].field1472 == var4 + (this.field246 ? 0 : 7)) {
                                this.field597[var4] = var6;
                                this.field434 = true;
                                break;
                            }
                        }
                    }
                }
                if (var3 >= 314 && var3 <= 323) {
                    int var7 = (var3 - 314) / 2;
                    int var8 = var3 & 1;
                    int var9 = this.field523[var7];
                    if (var8 == 0) {
                        --var9;
                        if (var9 < 0) {
                            var9 = field532[var7].length - 1;
                        }
                    }
                    if (var8 == 1) {
                        ++var9;
                        if (var9 >= field532[var7].length) {
                            var9 = 0;
                        }
                    }
                    this.field523[var7] = var9;
                    this.field434 = true;
                }
                if (var3 == 324 && !this.field246) {
                    this.field246 = true;
                    this.method46((byte) 2);
                }
                if (var3 == 325 && this.field246) {
                    this.field246 = false;
                    this.method46((byte) 2);
                }
                if (var3 != 326) {
                    if (var3 == 613) {
                        this.field602 = !this.field602;
                    }
                    if (var3 >= 601 && var3 <= 612) {
                        this.method84(true);
                        if (this.field581.length() > 0) {
                            this.field232.method538(131, (byte) 0);
                            this.field232.method545(false, class21.method209(this.field581));
                            this.field232.method539(var3 - 601);
                            this.field232.method539(this.field602 ? 1 : 0);
                        }
                    }
                    return false;
                } else {
                    this.field232.method538(102, (byte) 0);
                    this.field232.method539(this.field246 ? 0 : 1);
                    for (int var10 = 0; var10 < 7; ++var10) {
                        this.field232.method539(this.field597[var10]);
                    }
                    for (int var11 = 0; var11 < 5; ++var11) {
                        this.field232.method539(this.field523[var11]);
                    }
                    return true;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;)V")
    private final void method115(String arg0) {
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

    @OriginalMember(owner = "client", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        return signlink.mainapp != null ? signlink.mainapp.getAppletContext() : super.getAppletContext();
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(IZ)V")
    public final void method116(int arg0, boolean arg1) {
        if (arg1) {
            field389 = -183;
        }
        if (!field238) {
            if (class33.field995[17] >= arg0) {
                class15 var3 = class33.field989[17];
                int var4 = var3.field706 * var3.field705 - 1;
                int var5 = this.field329 * var3.field705 * 2;
                byte[] var6 = var3.field703;
                byte[] var7 = this.field613;
                for (int var8 = 0; var8 <= var4; ++var8) {
                    var7[var8] = var6[var8 - var5 & var4];
                }
                var3.field703 = var7;
                this.field613 = var6;
                class33.method302(28985, 17);
            }
            if (class33.field995[24] >= arg0) {
                class15 var9 = class33.field989[24];
                int var10 = var9.field706 * var9.field705 - 1;
                int var11 = this.field329 * var9.field705 * 2;
                byte[] var12 = var9.field703;
                byte[] var13 = this.field613;
                for (int var14 = 0; var14 <= var10; ++var14) {
                    var13[var14] = var12[var14 - var11 & var10];
                }
                var9.field703 = var13;
                this.field613 = var12;
                class33.method302(28985, 24);
            }
            if (class33.field995[34] >= arg0) {
                class15 var15 = class33.field989[34];
                int var16 = var15.field706 * var15.field705 - 1;
                int var17 = this.field329 * var15.field705 * 2;
                byte[] var18 = var15.field703;
                byte[] var19 = this.field613;
                for (int var20 = 0; var20 <= var16; ++var20) {
                    var19[var20] = var18[var20 - var17 & var16];
                }
                var15.field703 = var19;
                this.field613 = var18;
                class33.method302(28985, 34);
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LYOXDZEVD;LAGFDLNBY;III)V")
    private final void method117(class68 arg0, class1 arg1, int arg2, int arg3, int arg4) {
        while (arg4 >= 0) {
            this.field213 = arg0.method549();
        }
        if ((arg3 & 256) != 0) {
            arg1.field1580 = arg0.method576(-113);
            int var6 = arg0.method554();
            arg1.field1584 = var6 >> 16;
            arg1.field1583 = (var6 & 65535) + field345;
            arg1.field1581 = 0;
            arg1.field1582 = 0;
            if (arg1.field1583 > field345) {
                arg1.field1581 = -1;
            }
            if (arg1.field1580 == 65535) {
                arg1.field1580 = -1;
            }
        }
        if ((arg3 & 16) != 0) {
            int var7 = arg0.method578(false);
            if (var7 == 65535) {
                var7 = -1;
            }
            int var8 = arg0.method549();
            if (arg1.field1575 == var7 && var7 != -1) {
                int var9 = class9.field163[var7].field177;
                if (var9 == 1) {
                    arg1.field1576 = 0;
                    arg1.field1577 = 0;
                    arg1.field1578 = var8;
                    arg1.field1579 = 0;
                }
                if (var9 == 2) {
                    arg1.field1579 = 0;
                }
            } else if (var7 == -1 || arg1.field1575 == -1 || class9.field163[var7].field171 >= class9.field163[arg1.field1575].field171) {
                arg1.field1575 = var7;
                arg1.field1576 = 0;
                arg1.field1577 = 0;
                arg1.field1578 = var8;
                arg1.field1579 = 0;
                arg1.field1540 = arg1.field1563;
            }
        }
        if ((arg3 & 512) != 0) {
            arg1.field1550 = arg0.method568(this.field278);
            arg1.field1552 = arg0.method568(this.field278);
            arg1.field1551 = arg0.method570((byte) 96);
            arg1.field1553 = arg0.method549();
            arg1.field1554 = arg0.method576(-113) + field345;
            arg1.field1555 = arg0.method578(false) + field345;
            arg1.field1556 = arg0.method549();
            arg1.method535(true);
        }
        if ((arg3 & 128) != 0) {
            arg1.field1544 = arg0.method556();
            if (arg1.field1544.charAt(0) == '~') {
                arg1.field1544 = arg1.field1544.substring(1);
                this.method146(2, arg1.field1544, arg1.field13, false);
            } else if (field442 == arg1) {
                this.method146(2, arg1.field1544, arg1.field13, false);
            }
            arg1.field1541 = 0;
            arg1.field1549 = 0;
            arg1.field1585 = 150;
        }
        if ((arg3 & 32) != 0) {
            arg1.field1590 = arg0.method551();
            if (arg1.field1590 == 65535) {
                arg1.field1590 = -1;
            }
        }
        if ((arg3 & 2) != 0) {
            int var10 = arg0.method549();
            int var11 = arg0.method568(this.field278);
            arg1.method534(7, field345, var10, var11);
            arg1.field1536 = field345 + 300;
            arg1.field1537 = arg0.method568(this.field278);
            arg1.field1538 = arg0.method568(this.field278);
        }
        if ((arg3 & 1024) != 0) {
            int var12 = arg0.method549();
            int var13 = arg0.method570((byte) 96);
            arg1.method534(7, field345, var12, var13);
            arg1.field1536 = field345 + 300;
            arg1.field1537 = arg0.method570((byte) 96);
            arg1.field1538 = arg0.method569(-234);
        }
        if ((arg3 & 8) != 0) {
            int var14 = arg0.method576(-113);
            int var15 = arg0.method569(-234);
            int var16 = arg0.method549();
            int var17 = arg0.field1612;
            if (arg1.field13 != null && arg1.field18) {
                long var18 = class21.method209(arg1.field13);
                boolean var20 = false;
                if (var15 <= 1) {
                    for (int var21 = 0; var21 < this.field458; ++var21) {
                        if (this.field419[var21] == var18) {
                            var20 = true;
                            break;
                        }
                    }
                }
                if (!var20 && this.field544 == 0) {
                    try {
                        this.field269.field1612 = 0;
                        arg0.method558(0, this.field269.field1611, this.field200, var16);
                        this.field269.field1612 = 0;
                        String var22 = class17.method199(this.field269, -291, var16);
                        String var23 = class28.method244(-164, var22);
                        arg1.field1544 = var23;
                        arg1.field1541 = var14 >> 8;
                        arg1.field1549 = var14 & 255;
                        arg1.field1585 = 150;
                        if (var15 != 2 && var15 != 3) {
                            if (var15 == 1) {
                                this.method146(1, var23, "@cr1@" + arg1.field13, false);
                            } else {
                                this.method146(2, var23, arg1.field13, false);
                            }
                        } else {
                            this.method146(1, var23, "@cr2@" + arg1.field13, false);
                        }
                    } catch (Exception var28) {
                        signlink.reporterror("cde2");
                    }
                }
            }
            arg0.field1612 = var16 + var17;
        }
        if ((arg3 & 4) != 0) {
            int var25 = arg0.method549();
            byte[] var26 = new byte[var25];
            class68 var27 = new class68(var26, -103);
            arg0.method584(var25, (byte) 0, 0, var26);
            this.field487[arg2] = var27;
            arg1.method4(332, var27);
        }
        if ((arg3 & 1) != 0) {
            arg1.field1542 = arg0.method578(false);
            arg1.field1543 = arg0.method577(true);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIILJDSNLLMP;II)V")
    public final void method118(int arg0, int arg1, int arg2, int arg3, class29 arg4, int arg5, int arg6) {
        if (arg1 < 0 || arg1 > 0) {
            this.field545 = !this.field545;
        }
        if (arg4.field909 == 0 && arg4.field929 != null && !arg4.field882) {
            if (arg6 >= arg0 && arg2 >= arg3 && arg6 <= arg4.field934 + arg0 && arg2 <= arg4.field926 + arg3) {
                int var8 = arg4.field929.length;
                for (int var9 = 0; var9 < var8; ++var9) {
                    int var10 = arg4.field938[var9] + arg0;
                    int var11 = arg4.field911[var9] + arg3 - arg5;
                    class29 var12 = class29.field895[arg4.field929[var9]];
                    int var13 = var12.field908 + var10;
                    int var14 = var12.field933 + var11;
                    if ((var12.field915 >= 0 || var12.field891 != 0) && arg6 >= var13 && arg2 >= var14 && arg6 < var12.field934 + var13 && arg2 < var12.field926 + var14) {
                        if (var12.field915 >= 0) {
                            this.field636 = var12.field915;
                        } else {
                            this.field636 = var12.field884;
                        }
                    }
                    if (var12.field909 == 0) {
                        this.method118(var13, 0, arg2, var14, var12, var12.field889, arg6);
                        if (var12.field887 > var12.field926) {
                            this.method103(var14, arg2, var12.field887, true, var12, var12.field934 + var13, this.field572, var12.field926, arg6);
                        }
                    } else {
                        if (var12.field935 == 1 && arg6 >= var13 && arg2 >= var14 && arg6 < var12.field934 + var13 && arg2 < var12.field926 + var14) {
                            boolean var15 = false;
                            if (var12.field892 != 0) {
                                var15 = this.method62((byte) -120, var12);
                            }
                            if (!var15) {
                                this.field615[this.field219] = var12.field925;
                                this.field366[this.field219] = 170;
                                this.field365[this.field219] = var12.field884;
                                ++this.field219;
                            }
                        }
                        if (var12.field935 == 2 && this.field454 == 0 && arg6 >= var13 && arg2 >= var14 && arg6 < var12.field934 + var13 && arg2 < var12.field926 + var14) {
                            String var16 = var12.field907;
                            if (var16.indexOf(" ") != -1) {
                                var16 = var16.substring(0, var16.indexOf(" "));
                            }
                            this.field615[this.field219] = var16 + " @gre@" + var12.field906;
                            this.field366[this.field219] = 496;
                            this.field365[this.field219] = var12.field884;
                            ++this.field219;
                        }
                        if (var12.field935 == 3 && arg6 >= var13 && arg2 >= var14 && arg6 < var12.field934 + var13 && arg2 < var12.field926 + var14) {
                            this.field615[this.field219] = "Close";
                            this.field366[this.field219] = 815;
                            this.field365[this.field219] = var12.field884;
                            ++this.field219;
                        }
                        if (var12.field935 == 4 && arg6 >= var13 && arg2 >= var14 && arg6 < var12.field934 + var13 && arg2 < var12.field926 + var14) {
                            this.field615[this.field219] = var12.field925;
                            this.field366[this.field219] = 685;
                            this.field365[this.field219] = var12.field884;
                            ++this.field219;
                        }
                        if (var12.field935 == 5 && arg6 >= var13 && arg2 >= var14 && arg6 < var12.field934 + var13 && arg2 < var12.field926 + var14) {
                            this.field615[this.field219] = var12.field925;
                            this.field366[this.field219] = 262;
                            this.field365[this.field219] = var12.field884;
                            ++this.field219;
                        }
                        if (var12.field935 == 6 && !this.field205 && arg6 >= var13 && arg2 >= var14 && arg6 < var12.field934 + var13 && arg2 < var12.field926 + var14) {
                            this.field615[this.field219] = var12.field925;
                            this.field366[this.field219] = 230;
                            this.field365[this.field219] = var12.field884;
                            ++this.field219;
                        }
                        if (var12.field909 == 2) {
                            int var17 = 0;
                            for (int var18 = 0; var18 < var12.field926; ++var18) {
                                for (int var19 = 0; var19 < var12.field934; ++var19) {
                                    int var20 = (var12.field930 + 32) * var19 + var13;
                                    int var21 = (var12.field886 + 32) * var18 + var14;
                                    if (var17 < 20) {
                                        var20 += var12.field902[var17];
                                        var21 += var12.field928[var17];
                                    }
                                    if (arg6 >= var20 && arg2 >= var21 && arg6 < var20 + 32 && arg2 < var21 + 32) {
                                        this.field448 = var17;
                                        this.field449 = var12.field884;
                                        if (var12.field880[var17] > 0) {
                                            class3 var22 = class3.method13(var12.field880[var17] - 1);
                                            if (this.field322 == 1 && var12.field901) {
                                                if (this.field324 != var12.field884 || this.field323 != var17) {
                                                    this.field615[this.field219] = "Use " + this.field326 + " with @lre@" + var22.field56;
                                                    this.field366[this.field219] = 904;
                                                    this.field367[this.field219] = var22.field68;
                                                    this.field364[this.field219] = var17;
                                                    this.field365[this.field219] = var12.field884;
                                                    ++this.field219;
                                                }
                                            } else if (this.field454 == 1 && var12.field901) {
                                                if ((this.field456 & 16) == 16) {
                                                    this.field615[this.field219] = this.field457 + " @lre@" + var22.field56;
                                                    this.field366[this.field219] = 609;
                                                    this.field367[this.field219] = var22.field68;
                                                    this.field364[this.field219] = var17;
                                                    this.field365[this.field219] = var12.field884;
                                                    ++this.field219;
                                                }
                                            } else {
                                                if (var12.field901) {
                                                    for (int var23 = 4; var23 >= 3; --var23) {
                                                        if (var22.field96 != null && var22.field96[var23] != null) {
                                                            this.field615[this.field219] = var22.field96[var23] + " @lre@" + var22.field56;
                                                            if (var23 == 3) {
                                                                this.field366[this.field219] = 868;
                                                            }
                                                            if (var23 == 4) {
                                                                this.field366[this.field219] = 197;
                                                            }
                                                            this.field367[this.field219] = var22.field68;
                                                            this.field364[this.field219] = var17;
                                                            this.field365[this.field219] = var12.field884;
                                                            ++this.field219;
                                                        } else if (var23 == 4) {
                                                            this.field615[this.field219] = "Drop @lre@" + var22.field56;
                                                            this.field366[this.field219] = 197;
                                                            this.field367[this.field219] = var22.field68;
                                                            this.field364[this.field219] = var17;
                                                            this.field365[this.field219] = var12.field884;
                                                            ++this.field219;
                                                        }
                                                    }
                                                }
                                                if (var12.field900) {
                                                    this.field615[this.field219] = "Use @lre@" + var22.field56;
                                                    this.field366[this.field219] = 727;
                                                    this.field367[this.field219] = var22.field68;
                                                    this.field364[this.field219] = var17;
                                                    this.field365[this.field219] = var12.field884;
                                                    ++this.field219;
                                                }
                                                if (var12.field901 && var22.field96 != null) {
                                                    for (int var24 = 2; var24 >= 0; --var24) {
                                                        if (var22.field96[var24] != null) {
                                                            this.field615[this.field219] = var22.field96[var24] + " @lre@" + var22.field56;
                                                            if (var24 == 0) {
                                                                this.field366[this.field219] = 615;
                                                            }
                                                            if (var24 == 1) {
                                                                this.field366[this.field219] = 826;
                                                            }
                                                            if (var24 == 2) {
                                                                this.field366[this.field219] = 813;
                                                            }
                                                            this.field367[this.field219] = var22.field68;
                                                            this.field364[this.field219] = var17;
                                                            this.field365[this.field219] = var12.field884;
                                                            ++this.field219;
                                                        }
                                                    }
                                                }
                                                if (var12.field885 != null) {
                                                    for (int var25 = 4; var25 >= 0; --var25) {
                                                        if (var12.field885[var25] != null) {
                                                            this.field615[this.field219] = var12.field885[var25] + " @lre@" + var22.field56;
                                                            if (var25 == 0) {
                                                                this.field366[this.field219] = 440;
                                                            }
                                                            if (var25 == 1) {
                                                                this.field366[this.field219] = 639;
                                                            }
                                                            if (var25 == 2) {
                                                                this.field366[this.field219] = 997;
                                                            }
                                                            if (var25 == 3) {
                                                                this.field366[this.field219] = 19;
                                                            }
                                                            if (var25 == 4) {
                                                                this.field366[this.field219] = 972;
                                                            }
                                                            this.field367[this.field219] = var22.field68;
                                                            this.field364[this.field219] = var17;
                                                            this.field365[this.field219] = var12.field884;
                                                            ++this.field219;
                                                        }
                                                    }
                                                }
                                                this.field615[this.field219] = "Examine @lre@" + var22.field56;
                                                this.field366[this.field219] = 1654;
                                                this.field367[this.field219] = var22.field68;
                                                this.field364[this.field219] = var17;
                                                this.field365[this.field219] = var12.field884;
                                                ++this.field219;
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

    @OriginalMember(owner = "client", name = "a", descriptor = "()V")
    public final void method119() {
        this.method156((byte) 63, 20, "Starting up");
        if (signlink.sunjava) {
            super.field1032 = 5;
        }
        if (field370) {
            this.field471 = true;
        } else {
            field370 = true;
            boolean var1 = false;
            String var2 = this.method133(2);
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
                this.field541 = true;
            } else {
                if (signlink.cache_dat != null) {
                    for (int var3 = 0; var3 < 5; ++var3) {
                        this.field227[var3] = new class32(500000, signlink.cache_dat, 6, signlink.cache_idx[var3], var3 + 1);
                    }
                }
                try {
                    this.method122(974);
                    this.field356 = this.method98("title", (byte) -99, 1, this.field182[1], "title screen", 25);
                    this.field408 = new class45(false, (byte) -51, "p11_full", this.field356);
                    this.field409 = new class45(false, (byte) -51, "p12_full", this.field356);
                    this.field410 = new class45(false, (byte) -51, "b12_full", this.field356);
                    this.field411 = new class45(true, (byte) -51, "q8_full", this.field356);
                    this.method88(true);
                    this.method128(34131);
                    class41 var4 = this.method98("config", (byte) -99, 2, this.field182[2], "config", 30);
                    class41 var5 = this.method98("interface", (byte) -99, 3, this.field182[3], "interface", 35);
                    class41 var6 = this.method98("media", (byte) -99, 4, this.field182[4], "2d graphics", 40);
                    class41 var7 = this.method98("textures", (byte) -99, 6, this.field182[6], "textures", 45);
                    class41 var8 = this.method98("wordenc", (byte) -99, 7, this.field182[7], "chat system", 50);
                    class41 var9 = this.method98("sounds", (byte) -99, 8, this.field182[8], "sound effects", 55);
                    this.field634 = new byte[4][104][104];
                    this.field377 = new int[4][105][105];
                    this.field585 = new class56(4, 104, this.field377, -18, 104);
                    for (int var10 = 0; var10 < 4; ++var10) {
                        this.field391[var10] = new class22(104, 104, (byte) 5);
                    }
                    this.field396 = new class14(512, 512);
                    class41 var11 = this.method98("versionlist", (byte) -99, 5, this.field182[5], "update list", 60);
                    this.method156((byte) 63, 60, "Connecting to update server");
                    this.field520 = new class54();
                    this.field520.method449(var11, this);
                    class55.method451(this.field520.method438(0));
                    class39.method343(this.field520.method435(0, true), this.field520);
                    if (!field238) {
                        this.field331 = 0;
                        try {
                            this.field331 = Integer.parseInt(this.getParameter("music"));
                        } catch (Exception var70) {
                        }
                        this.field332 = true;
                        this.field520.method450(2, this.field331);
                        while (this.field520.method431() > 0) {
                            this.method138(-40545);
                            try {
                                Thread.sleep(100L);
                            } catch (Exception var69) {
                            }
                            if (this.field520.field1327 > 3) {
                                this.method115("ondemand");
                                return;
                            }
                        }
                    }
                    this.method156((byte) 63, 65, "Requesting animations");
                    int var12 = this.field520.method435(1, true);
                    for (int var13 = 0; var13 < var12; ++var13) {
                        this.field520.method450(1, var13);
                    }
                    while (this.field520.method431() > 0) {
                        int var14 = var12 - this.field520.method431();
                        if (var14 > 0) {
                            this.method156((byte) 63, 65, "Loading animations - " + var14 * 100 / var12 + "%");
                        }
                        this.method138(-40545);
                        try {
                            Thread.sleep(100L);
                        } catch (Exception var68) {
                        }
                        if (this.field520.field1327 > 3) {
                            this.method115("ondemand");
                            return;
                        }
                    }
                    this.method156((byte) 63, 70, "Requesting models");
                    int var15 = this.field520.method435(0, true);
                    for (int var16 = 0; var16 < var15; ++var16) {
                        int var17 = this.field520.method436(var16, 8);
                        if ((var17 & 1) != 0) {
                            this.field520.method450(0, var16);
                        }
                    }
                    int var18 = this.field520.method431();
                    while (this.field520.method431() > 0) {
                        int var19 = var18 - this.field520.method431();
                        if (var19 > 0) {
                            this.method156((byte) 63, 70, "Loading models - " + var19 * 100 / var18 + "%");
                        }
                        this.method138(-40545);
                        try {
                            Thread.sleep(100L);
                        } catch (Exception var67) {
                        }
                    }
                    if (this.field227[0] != null) {
                        this.method156((byte) 63, 75, "Requesting maps");
                        this.field520.method450(3, this.field520.method433(0, 47, 0, 48));
                        this.field520.method450(3, this.field520.method433(0, 47, 1, 48));
                        this.field520.method450(3, this.field520.method433(0, 48, 0, 48));
                        this.field520.method450(3, this.field520.method433(0, 48, 1, 48));
                        this.field520.method450(3, this.field520.method433(0, 49, 0, 48));
                        this.field520.method450(3, this.field520.method433(0, 49, 1, 48));
                        this.field520.method450(3, this.field520.method433(0, 47, 0, 47));
                        this.field520.method450(3, this.field520.method433(0, 47, 1, 47));
                        this.field520.method450(3, this.field520.method433(0, 48, 0, 47));
                        this.field520.method450(3, this.field520.method433(0, 48, 1, 47));
                        this.field520.method450(3, this.field520.method433(0, 48, 0, 148));
                        this.field520.method450(3, this.field520.method433(0, 48, 1, 148));
                        int var20 = this.field520.method431();
                        while (this.field520.method431() > 0) {
                            int var21 = var20 - this.field520.method431();
                            if (var21 > 0) {
                                this.method156((byte) 63, 75, "Loading maps - " + var21 * 100 / var20 + "%");
                            }
                            this.method138(-40545);
                            try {
                                Thread.sleep(100L);
                            } catch (Exception var66) {
                            }
                        }
                    }
                    int var22 = this.field520.method435(0, true);
                    for (int var23 = 0; var23 < var22; ++var23) {
                        int var24 = this.field520.method436(var23, 8);
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
                            this.field520.method443(3, var25, var23, 0);
                        }
                    }
                    this.field520.method439(field237, -858);
                    if (!field238) {
                        int var26 = this.field520.method435(2, true);
                        for (int var27 = 1; var27 < var26; ++var27) {
                            if (this.field520.method445(var27, (byte) -1)) {
                                this.field520.method443(3, (byte) 1, var27, 2);
                            }
                        }
                    }
                    this.method156((byte) 63, 80, "Unpacking media");
                    this.field598 = new class15(var6, "invback", 0);
                    this.field600 = new class15(var6, "chatback", 0);
                    this.field599 = new class15(var6, "mapback", 0);
                    this.field574 = new class15(var6, "backbase1", 0);
                    this.field575 = new class15(var6, "backbase2", 0);
                    this.field576 = new class15(var6, "backhmid1", 0);
                    for (int var28 = 0; var28 < 13; ++var28) {
                        this.field283[var28] = new class15(var6, "sideicons", var28);
                    }
                    this.field611 = new class14(var6, "compass", 0);
                    this.field603 = new class14(var6, "mapedge", 0);
                    this.field603.method176((byte) 3);
                    try {
                        for (int var29 = 0; var29 < 100; ++var29) {
                            this.field190[var29] = new class15(var6, "mapscene", var29);
                        }
                    } catch (Exception var74) {
                    }
                    try {
                        for (int var30 = 0; var30 < 100; ++var30) {
                            this.field371[var30] = new class14(var6, "mapfunction", var30);
                        }
                    } catch (Exception var73) {
                    }
                    try {
                        for (int var31 = 0; var31 < 20; ++var31) {
                            this.field588[var31] = new class14(var6, "hitmarks", var31);
                        }
                    } catch (Exception var72) {
                    }
                    try {
                        for (int var32 = 0; var32 < 20; ++var32) {
                            this.field267[var32] = new class14(var6, "headicons", var32);
                        }
                    } catch (Exception var71) {
                    }
                    this.field451 = new class14(var6, "mapmarker", 0);
                    this.field452 = new class14(var6, "mapmarker", 1);
                    for (int var33 = 0; var33 < 8; ++var33) {
                        this.field368[var33] = new class14(var6, "cross", var33);
                    }
                    this.field317 = new class14(var6, "mapdots", 0);
                    this.field318 = new class14(var6, "mapdots", 1);
                    this.field319 = new class14(var6, "mapdots", 2);
                    this.field320 = new class14(var6, "mapdots", 3);
                    this.field321 = new class14(var6, "mapdots", 4);
                    this.field586 = new class15(var6, "scrollbar", 0);
                    this.field587 = new class15(var6, "scrollbar", 1);
                    this.field462 = new class15(var6, "redstone1", 0);
                    this.field463 = new class15(var6, "redstone2", 0);
                    this.field464 = new class15(var6, "redstone3", 0);
                    this.field465 = new class15(var6, "redstone1", 0);
                    this.field465.method189(field490);
                    this.field466 = new class15(var6, "redstone2", 0);
                    this.field466.method189(field490);
                    this.field475 = new class15(var6, "redstone1", 0);
                    this.field475.method190(false);
                    this.field476 = new class15(var6, "redstone2", 0);
                    this.field476.method190(false);
                    this.field477 = new class15(var6, "redstone3", 0);
                    this.field477.method190(false);
                    this.field478 = new class15(var6, "redstone1", 0);
                    this.field478.method189(field490);
                    this.field478.method190(false);
                    this.field479 = new class15(var6, "redstone2", 0);
                    this.field479.method189(field490);
                    this.field479.method190(false);
                    for (int var34 = 0; var34 < 2; ++var34) {
                        this.field252[var34] = new class15(var6, "mod_icons", var34);
                    }
                    class14 var35 = new class14(var6, "backleft1", 0);
                    this.field425 = new class40(this.method45(-33), var35.field693, var35.field694, false);
                    var35.method177(0, 0, (byte) -31);
                    class14 var36 = new class14(var6, "backleft2", 0);
                    this.field426 = new class40(this.method45(-33), var36.field693, var36.field694, false);
                    var36.method177(0, 0, (byte) -31);
                    class14 var37 = new class14(var6, "backright1", 0);
                    this.field427 = new class40(this.method45(-33), var37.field693, var37.field694, false);
                    var37.method177(0, 0, (byte) -31);
                    class14 var38 = new class14(var6, "backright2", 0);
                    this.field428 = new class40(this.method45(-33), var38.field693, var38.field694, false);
                    var38.method177(0, 0, (byte) -31);
                    class14 var39 = new class14(var6, "backtop1", 0);
                    this.field429 = new class40(this.method45(-33), var39.field693, var39.field694, false);
                    var39.method177(0, 0, (byte) -31);
                    class14 var40 = new class14(var6, "backvmid1", 0);
                    this.field430 = new class40(this.method45(-33), var40.field693, var40.field694, false);
                    var40.method177(0, 0, (byte) -31);
                    class14 var41 = new class14(var6, "backvmid2", 0);
                    this.field431 = new class40(this.method45(-33), var41.field693, var41.field694, false);
                    var41.method177(0, 0, (byte) -31);
                    class14 var42 = new class14(var6, "backvmid3", 0);
                    this.field432 = new class40(this.method45(-33), var42.field693, var42.field694, false);
                    var42.method177(0, 0, (byte) -31);
                    class14 var43 = new class14(var6, "backhmid2", 0);
                    this.field433 = new class40(this.method45(-33), var43.field693, var43.field694, false);
                    var43.method177(0, 0, (byte) -31);
                    int var44 = (int) (Math.random() * 21.0D) - 10;
                    int var45 = (int) (Math.random() * 21.0D) - 10;
                    int var46 = (int) (Math.random() * 21.0D) - 10;
                    int var47 = (int) (Math.random() * 41.0D) - 20;
                    for (int var48 = 0; var48 < 100; ++var48) {
                        if (this.field371[var48] != null) {
                            this.field371[var48].method175(var46 + var47, 0, var44 + var47, var45 + var47);
                        }
                        if (this.field190[var48] != null) {
                            this.field190[var48].method191(var46 + var47, 0, var44 + var47, var45 + var47);
                        }
                    }
                    this.method156((byte) 63, 83, "Unpacking textures");
                    class33.method300(var7, true);
                    class33.method304(0.8D, 415);
                    class33.method299(20, (byte) 8);
                    this.method156((byte) 63, 86, "Unpacking config");
                    class9.method22(var4, false);
                    class48.method404(var4);
                    class62.method516(var4, false);
                    class3.method15(var4);
                    class19.method204(var4);
                    class60.method508(var4, false);
                    class27.method231(var4, false);
                    class7.method19(var4, false);
                    class50.method416(var4, false);
                    class3.field60 = field237;
                    if (!field238) {
                        this.method156((byte) 63, 90, "Unpacking sounds");
                        byte[] var49 = var9.method376("sounds.dat", (byte[]) null);
                        class68 var50 = new class68(var49, -103);
                        class12.method168(var50, false);
                    }
                    this.method156((byte) 63, 95, "Unpacking interfaces");
                    class45[] var51 = new class45[] { this.field408, this.field409, this.field410, this.field411 };
                    class29.method277(var51, var5, var6, field567);
                    this.method156((byte) 63, 100, "Preparing game engine");
                    for (int var52 = 0; var52 < 33; ++var52) {
                        int var53 = 999;
                        int var54 = 0;
                        for (int var55 = 0; var55 < 34; ++var55) {
                            if (this.field599.field703[this.field599.field705 * var52 + var55] == 0) {
                                if (var53 == 999) {
                                    var53 = var55;
                                }
                            } else if (var53 != 999) {
                                var54 = var55;
                                break;
                            }
                        }
                        this.field360[var52] = var53;
                        this.field584[var52] = var54 - var53;
                    }
                    for (int var56 = 5; var56 < 156; ++var56) {
                        int var57 = 999;
                        int var58 = 0;
                        for (int var59 = 25; var59 < 172; ++var59) {
                            if (this.field599.field703[this.field599.field705 * var56 + var59] == 0 && (var59 > 34 || var56 > 34)) {
                                if (var57 == 999) {
                                    var57 = var59;
                                }
                            } else if (var57 != 999) {
                                var58 = var59;
                                break;
                            }
                        }
                        this.field473[var56 - 5] = var57 - 25;
                        this.field222[var56 - 5] = var58 - var57;
                    }
                    class33.method297(field404, 479, 96);
                    this.field496 = class33.field987;
                    class33.method297(field404, 190, 261);
                    this.field497 = class33.field987;
                    class33.method297(field404, 512, 334);
                    this.field498 = class33.field987;
                    int[] var60 = new int[9];
                    for (int var61 = 0; var61 < 9; ++var61) {
                        int var62 = var61 * 32 + 128 + 15;
                        int var63 = var62 * 3 + 600;
                        int var64 = class33.field985[var62];
                        var60[var61] = var63 * var64 >> 16;
                    }
                    class56.method493(334, 500, var60, 0, 800, 512);
                    class28.method234(var8);
                    this.field253 = new class5(false, this);
                    this.method141(this.field253, 10);
                    class8.field151 = this;
                    class48.field1290 = this;
                    class19.field748 = this;
                } catch (Exception var75) {
                    signlink.reporterror("loaderror " + this.field507 + " " + this.field254);
                    this.field399 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "C", descriptor = "(I)V")
    public final void method120(int arg0) {
        try {
            if (this.field537 != null) {
                this.field537.method397();
            }
        } catch (Exception var3) {
        }
        this.field537 = null;
        while (arg0 >= 0) {
            this.field213 = this.field558.method549();
        }
        this.field619 = false;
        this.field547 = 0;
        this.field203 = "";
        this.field204 = "";
        this.method111((byte) 6);
        this.field585.method457((byte) -124);
        for (int var2 = 0; var2 < 4; ++var2) {
            this.field391[var2].method215();
        }
        System.gc();
        this.method71((byte) 1);
        this.field275 = -1;
        this.field331 = -1;
        this.field285 = 0;
    }

    @OriginalMember(owner = "client", name = "D", descriptor = "(I)Ljava/net/Socket;")
    public final Socket method121(int arg0) throws IOException {
        return signlink.mainapp != null ? signlink.opensocket(arg0) : new Socket(InetAddress.getByName(this.getCodeBase().getHost()), arg0);
    }

    @OriginalMember(owner = "client", name = "E", descriptor = "(I)V")
    public final void method122(int arg0) {
        int var2 = 5;
        this.field182[8] = 0;
        int var3 = 0;
        if (arg0 <= 0) {
            this.field232.method539(159);
        }
        while (this.field182[8] == 0) {
            String var4 = "Unknown problem";
            this.method156((byte) 63, 20, "Connecting to web server");
            try {
                DataInputStream var5 = this.method123("crc" + (int) (Math.random() * 9.9999999E7D) + "-" + 315);
                class68 var6 = new class68(new byte[40], -103);
                var5.readFully(var6.field1611, 0, 40);
                var5.close();
                for (int var7 = 0; var7 < 9; ++var7) {
                    this.field182[var7] = var6.method554();
                }
                int var8 = var6.method554();
                int var9 = 1234;
                for (int var10 = 0; var10 < 9; ++var10) {
                    var9 = (var9 << 1) + this.field182[var10];
                }
                if (var8 != var9) {
                    var4 = "checksum problem";
                    this.field182[8] = 0;
                }
            } catch (EOFException var13) {
                var4 = "EOF problem";
                this.field182[8] = 0;
            } catch (IOException var14) {
                var4 = "connection problem";
                this.field182[8] = 0;
            } catch (Exception var15) {
                var4 = "logic problem";
                this.field182[8] = 0;
                if (!signlink.reporterror) {
                    return;
                }
            }
            if (this.field182[8] == 0) {
                ++var3;
                for (int var11 = var2; var11 > 0; --var11) {
                    if (var3 >= 10) {
                        this.method156((byte) 63, 10, "Game updated - please reload page");
                        var11 = 10;
                    } else {
                        this.method156((byte) 63, 10, var4 + " - Will retry in " + var11 + " secs.");
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
                this.field197 = !this.field197;
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(Ljava/lang/String;)Ljava/io/DataInputStream;")
    public final DataInputStream method123(String arg0) throws IOException {
        if (!this.field197) {
            return signlink.mainapp != null ? signlink.openurl(arg0) : new DataInputStream((new URL(this.getCodeBase(), arg0)).openStream());
        } else {
            if (this.field546 != null) {
                try {
                    this.field546.close();
                } catch (Exception var4) {
                }
                this.field546 = null;
            }
            this.field546 = this.method121(43595);
            this.field546.setSoTimeout(10000);
            InputStream var2 = this.field546.getInputStream();
            OutputStream var3 = this.field546.getOutputStream();
            var3.write(("JAGGRAB /" + arg0 + "\n\n").getBytes());
            return new DataInputStream(var2);
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(II)V")
    public final void method124(int arg0, int arg1) {
        int var3 = class7.field130[arg1].field138;
        if (var3 != 0) {
            int var4 = this.field631[arg1];
            if (arg0 <= 0) {
                this.field614 = null;
            }
            if (var3 == 1) {
                if (var4 == 1) {
                    class33.method304(0.9D, 415);
                }
                if (var4 == 2) {
                    class33.method304(0.8D, 415);
                }
                if (var4 == 3) {
                    class33.method304(0.7D, 415);
                }
                if (var4 == 4) {
                    class33.method304(0.6D, 415);
                }
                class3.field95.method229();
                this.field556 = true;
            }
            if (var3 == 3) {
                boolean var5 = this.field351;
                if (var4 == 0) {
                    this.method155(0, this.field351, this.field198);
                    this.field351 = true;
                }
                if (var4 == 1) {
                    this.method155(-400, this.field351, this.field198);
                    this.field351 = true;
                }
                if (var4 == 2) {
                    this.method155(-800, this.field351, this.field198);
                    this.field351 = true;
                }
                if (var4 == 3) {
                    this.method155(-1200, this.field351, this.field198);
                    this.field351 = true;
                }
                if (var4 == 4) {
                    this.field351 = false;
                }
                if (this.field351 != var5 && !field238) {
                    if (this.field351) {
                        this.field331 = this.field275;
                        this.field332 = true;
                        this.field520.method450(2, this.field331);
                    } else {
                        this.method71((byte) 1);
                    }
                    this.field285 = 0;
                }
            }
            if (var3 == 4) {
                if (var4 == 0) {
                    this.field247 = true;
                    this.method107((byte) -125, 0);
                }
                if (var4 == 1) {
                    this.field247 = true;
                    this.method107((byte) -125, -400);
                }
                if (var4 == 2) {
                    this.field247 = true;
                    this.method107((byte) -125, -800);
                }
                if (var4 == 3) {
                    this.field247 = true;
                    this.method107((byte) -125, -1200);
                }
                if (var4 == 4) {
                    this.field247 = false;
                }
            }
            if (var3 == 5) {
                this.field220 = var4;
            }
            if (var3 == 6) {
                this.field551 = var4;
            }
            if (var3 == 8) {
                this.field268 = var4;
                this.field412 = true;
            }
            if (var3 == 9) {
                this.field563 = var4;
            }
        }
    }

    @OriginalMember(owner = "client", name = "j", descriptor = "(B)V")
    public final void method125(byte arg0) {
        if (this.field474 == 2) {
            this.method140(-465, this.field516 * 2, (this.field514 - this.field248 << 7) + this.field517, (this.field515 - this.field249 << 7) + this.field518);
            if (arg0 != 5) {
                this.field258 = !this.field258;
            }
            if (this.field358 > -1 && field345 % 20 < 10) {
                this.field267[2].method179(this.field359 - 28, this.field358 - 12, 49598);
            }
        }
    }

    @OriginalMember(owner = "client", name = "F", descriptor = "(I)V")
    private final void method126(int arg0) {
        if (arg0 != 0) {
            this.field213 = this.field558.method549();
        }
        if (this.field571 == 2) {
            for (class4 var2 = (class4) this.field186.method528(); var2 != null; var2 = (class4) this.field186.method530(false)) {
                if (var2.field117 > 0) {
                    --var2.field117;
                }
                if (var2.field117 == 0) {
                    if (var2.field114 < 0 || class34.method316(var2.field116, var2.field114, -13964)) {
                        this.method70(var2.field108, var2.field116, var2.field109, var2.field114, var2.field115, var2.field110, -6, var2.field107);
                        var2.method589();
                    }
                } else {
                    if (var2.field118 > 0) {
                        --var2.field118;
                    }
                    if (var2.field118 == 0 && var2.field109 >= 1 && var2.field110 >= 1 && var2.field109 <= 102 && var2.field110 <= 102 && (var2.field111 < 0 || class34.method316(var2.field113, var2.field111, -13964))) {
                        this.method70(var2.field108, var2.field113, var2.field109, var2.field111, var2.field112, var2.field110, -6, var2.field107);
                        var2.field118 = -1;
                        if (var2.field114 == var2.field111 && var2.field114 == -1) {
                            var2.method589();
                        } else if (var2.field114 == var2.field111 && var2.field115 == var2.field112 && var2.field116 == var2.field113) {
                            var2.method589();
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "k", descriptor = "(Z)V")
    public static final void method127(boolean arg0) {
        class56.field1383 = false;
        if (arg0) {
            field389 = -260;
        }
        class33.field976 = false;
        field238 = false;
        class34.field1001 = false;
        class48.field1283 = false;
    }

    @OriginalMember(owner = "client", name = "G", descriptor = "(I)V")
    public final void method128(int arg0) {
        this.field276 = new class15(this.field356, "titlebox", 0);
        this.field277 = new class15(this.field356, "titlebutton", 0);
        this.field633 = new class15[12];
        int var2 = 0;
        try {
            var2 = Integer.parseInt(this.getParameter("fl_icon"));
        } catch (Exception var19) {
        }
        if (var2 == 0) {
            for (int var3 = 0; var3 < 12; ++var3) {
                this.field633[var3] = new class15(this.field356, "runes", var3);
            }
        } else {
            for (int var4 = 0; var4 < 12; ++var4) {
                this.field633[var4] = new class15(this.field356, "runes", (var4 & 3) + 12);
            }
        }
        this.field579 = new class14(128, 265);
        if (this.field217 != arg0) {
            this.field232.method539(227);
        }
        this.field580 = new class14(128, 265);
        for (int var5 = 0; var5 < 33920; ++var5) {
            this.field579.field692[var5] = this.field298.field1174[var5];
        }
        for (int var6 = 0; var6 < 33920; ++var6) {
            this.field580.field692[var6] = this.field299.field1174[var6];
        }
        this.field207 = new int[256];
        for (int var7 = 0; var7 < 64; ++var7) {
            this.field207[var7] = var7 * 262144;
        }
        for (int var8 = 0; var8 < 64; ++var8) {
            this.field207[var8 + 64] = var8 * 1024 + 16711680;
        }
        for (int var9 = 0; var9 < 64; ++var9) {
            this.field207[var9 + 128] = var9 * 4 + 16776960;
        }
        for (int var10 = 0; var10 < 64; ++var10) {
            this.field207[var10 + 192] = 16777215;
        }
        this.field208 = new int[256];
        for (int var11 = 0; var11 < 64; ++var11) {
            this.field208[var11] = var11 * 1024;
        }
        for (int var12 = 0; var12 < 64; ++var12) {
            this.field208[var12 + 64] = var12 * 4 + 65280;
        }
        for (int var13 = 0; var13 < 64; ++var13) {
            this.field208[var13 + 128] = var13 * 262144 + 65535;
        }
        for (int var14 = 0; var14 < 64; ++var14) {
            this.field208[var14 + 192] = 16777215;
        }
        this.field209 = new int[256];
        for (int var15 = 0; var15 < 64; ++var15) {
            this.field209[var15] = var15 * 4;
        }
        for (int var16 = 0; var16 < 64; ++var16) {
            this.field209[var16 + 64] = var16 * 262144 + 255;
        }
        for (int var17 = 0; var17 < 64; ++var17) {
            this.field209[var17 + 128] = var17 * 1024 + 16711935;
        }
        for (int var18 = 0; var18 < 64; ++var18) {
            this.field209[var18 + 192] = 16777215;
        }
        this.field206 = new int[256];
        this.field392 = new int[32768];
        this.field393 = new int[32768];
        this.method56(false, (class15) null);
        this.field582 = new int[32768];
        this.field583 = new int[32768];
        this.method156((byte) 63, 10, "Connecting to fileserver");
        if (!this.field521) {
            this.field347 = true;
            this.field521 = true;
            this.method141(this, 2);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BILYOXDZEVD;)V")
    private final void method129(byte arg0, int arg1, class68 arg2) {
        if (arg0 != -28) {
            for (int var4 = 1; var4 > 0; ++var4) {
            }
        }
        while (arg2.field1613 + 10 < arg1 * 8) {
            int var5 = arg2.method560(true, 11);
            if (var5 == 2047) {
                break;
            }
            if (this.field482[var5] == null) {
                this.field482[var5] = new class1();
                if (this.field487[var5] != null) {
                    this.field482[var5].method4(332, this.field487[var5]);
                }
            }
            this.field484[this.field483++] = var5;
            class1 var6 = this.field482[var5];
            var6.field1564 = field345;
            int var7 = arg2.method560(true, 5);
            if (var7 > 15) {
                var7 -= 32;
            }
            int var8 = arg2.method560(true, 1);
            int var9 = arg2.method560(true, 5);
            if (var9 > 15) {
                var9 -= 32;
            }
            int var10 = arg2.method560(true, 1);
            if (var10 == 1) {
                this.field486[this.field485++] = var5;
            }
            var6.method533(field442.field1560[0] + var7, -741, field442.field1559[0] + var9, var8 == 1);
        }
        arg2.method561((byte) 1);
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)V")
    public final void method130(String arg0, String arg1, boolean arg2) {
        signlink.errorname = arg0;
        try {
            if (!arg2) {
                this.field401 = "";
                this.field402 = "Connecting to server...";
                this.method132(true, this.field538);
            }
            this.field537 = new class47(false, this, this.method121(field236 + 43594));
            long var4 = class21.method209(arg0);
            int var6 = (int) (var4 >> 16 & 31L);
            this.field232.field1612 = 0;
            this.field232.method539(14);
            this.field232.method539(var6);
            this.field537.method401(2, -632, 0, this.field232.field1611);
            for (int var7 = 0; var7 < 8; ++var7) {
                this.field537.method398();
            }
            int var8 = this.field537.method398();
            int var9 = var8;
            if (var8 == 0) {
                this.field537.method400(this.field558.field1611, 0, 8);
                this.field558.field1612 = 0;
                this.field562 = this.field558.method555(true);
                int[] var10 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (this.field562 >> 32), (int) this.field562 };
                this.field232.field1612 = 0;
                this.field232.method539(10);
                this.field232.method543(var10[0]);
                this.field232.method543(var10[1]);
                this.field232.method543(var10[2]);
                this.field232.method543(var10[3]);
                this.field232.method543(signlink.uid);
                this.field232.method546(arg0);
                this.field232.method546(arg1);
                this.field232.method564(field346, true, field625);
                this.field199.field1612 = 0;
                if (arg2) {
                    this.field199.method539(18);
                } else {
                    this.field199.method539(16);
                }
                this.field199.method539(this.field232.field1612 + 36 + 1 + 1 + 2);
                this.field199.method539(255);
                this.field199.method540(315);
                this.field199.method539(field238 ? 1 : 0);
                for (int var11 = 0; var11 < 9; ++var11) {
                    this.field199.method543(this.field182[var11]);
                }
                this.field199.method547(0, this.field232.field1611, this.field232.field1612, -56);
                this.field232.field1616 = new class42(false, var10);
                for (int var12 = 0; var12 < 4; ++var12) {
                    var10[var12] += 50;
                }
                this.field593 = new class42(false, var10);
                this.field537.method401(this.field199.field1612, -632, 0, this.field199.field1611);
                var8 = this.field537.method398();
            }
            if (var8 == 1) {
                try {
                    Thread.sleep(2000L);
                } catch (Exception var22) {
                }
                this.method130(arg0, arg1, arg2);
            } else if (var8 == 2) {
                this.field379 = this.field537.method398();
                field355 = this.field537.method398() == 1;
                this.field414 = 0L;
                this.field557 = 0;
                this.field253.field121 = 0;
                super.field1043 = true;
                this.field459 = true;
                this.field619 = true;
                this.field232.field1612 = 0;
                this.field558.field1612 = 0;
                this.field213 = -1;
                this.field334 = -1;
                this.field335 = -1;
                this.field336 = -1;
                this.field212 = 0;
                this.field214 = 0;
                this.field284 = 0;
                this.field216 = 0;
                this.field474 = 0;
                this.field219 = 0;
                this.field385 = false;
                super.field1044 = 0;
                for (int var13 = 0; var13 < 100; ++var13) {
                    this.field506[var13] = null;
                }
                this.field322 = 0;
                this.field454 = 0;
                this.field571 = 0;
                this.field387 = 0;
                this.field524 = (int) (Math.random() * 100.0D) - 50;
                this.field440 = (int) (Math.random() * 110.0D) - 55;
                this.field604 = (int) (Math.random() * 80.0D) - 40;
                this.field352 = (int) (Math.random() * 120.0D) - 60;
                this.field256 = (int) (Math.random() * 30.0D) - 20;
                this.field528 = (int) (Math.random() * 20.0D) - 10 & 2047;
                this.field196 = 0;
                this.field210 = -1;
                this.field394 = 0;
                this.field395 = 0;
                this.field483 = 0;
                this.field271 = 0;
                for (int var14 = 0; var14 < this.field480; ++var14) {
                    this.field482[var14] = null;
                    this.field487[var14] = null;
                }
                for (int var15 = 0; var15 < 16384; ++var15) {
                    this.field270[var15] = null;
                }
                field442 = this.field482[this.field481] = new class1();
                this.field513.method532();
                this.field362.method532();
                for (int var16 = 0; var16 < 4; ++var16) {
                    for (int var17 = 0; var17 < 104; ++var17) {
                        for (int var18 = 0; var18 < 104; ++var18) {
                            this.field614[var16][var17][var18] = null;
                        }
                    }
                }
                this.field186 = new class65((byte) 52);
                this.field509 = 0;
                this.field508 = 0;
                this.field493 = -1;
                this.field606 = -1;
                this.field438 = -1;
                this.field435 = -1;
                this.field577 = -1;
                this.field205 = false;
                this.field649 = 3;
                this.field310 = 0;
                this.field385 = false;
                this.field460 = false;
                this.field413 = null;
                this.field549 = 0;
                this.field390 = -1;
                this.field246 = true;
                this.method46((byte) 2);
                for (int var19 = 0; var19 < 5; ++var19) {
                    this.field523[var19] = 0;
                }
                for (int var20 = 0; var20 < 5; ++var20) {
                    this.field349[var20] = null;
                    this.field350[var20] = false;
                }
                field407 = 0;
                field510 = 0;
                field228 = 0;
                field403 = 0;
                field568 = 0;
                field629 = 0;
                field548 = 0;
                field195 = 0;
                field397 = 0;
                field245 = 0;
                this.method158(43718);
            } else if (var8 == 3) {
                this.field401 = "";
                this.field402 = "Invalid username or password.";
            } else if (var8 == 4) {
                this.field401 = "Your account has been disabled.";
                this.field402 = "Please check your message-centre for details.";
            } else if (var8 == 5) {
                this.field401 = "Your account is already logged in.";
                this.field402 = "Try again in 60 secs...";
            } else if (var8 == 6) {
                this.field401 = "RuneScape has been updated!";
                this.field402 = "Please reload this page.";
            } else if (var8 == 7) {
                this.field401 = "This world is full.";
                this.field402 = "Please use a different world.";
            } else if (var8 == 8) {
                this.field401 = "Unable to connect.";
                this.field402 = "Login server offline.";
            } else if (var8 == 9) {
                this.field401 = "Login limit exceeded.";
                this.field402 = "Too many connections from your address.";
            } else if (var8 == 10) {
                this.field401 = "Unable to connect.";
                this.field402 = "Bad session id.";
            } else if (var8 == 11) {
                this.field402 = "Login server rejected session.";
                this.field402 = "Please try again.";
            } else if (var8 == 12) {
                this.field401 = "You need a members account to login to this world.";
                this.field402 = "Please subscribe, or use a different world.";
            } else if (var8 == 13) {
                this.field401 = "Could not complete login.";
                this.field402 = "Please try using a different world.";
            } else if (var8 == 14) {
                this.field401 = "The server is being updated.";
                this.field402 = "Please wait 1 minute and try again.";
            } else if (var8 == 15) {
                this.field619 = true;
                this.field232.field1612 = 0;
                this.field558.field1612 = 0;
                this.field213 = -1;
                this.field334 = -1;
                this.field335 = -1;
                this.field336 = -1;
                this.field212 = 0;
                this.field214 = 0;
                this.field284 = 0;
                this.field219 = 0;
                this.field385 = false;
                this.field376 = System.currentTimeMillis();
            } else if (var8 == 16) {
                this.field401 = "Login attempts exceeded.";
                this.field402 = "Please wait 1 minute and try again.";
            } else if (var8 == 17) {
                this.field401 = "You are standing in a members-only area.";
                this.field402 = "To play on this world move to a free area first";
            } else if (var8 == 20) {
                this.field401 = "Invalid loginserver requested";
                this.field402 = "Please try using a different world.";
            } else if (var8 != 21) {
                if (var8 == -1) {
                    if (var9 == 0) {
                        if (this.field566 < 2) {
                            try {
                                Thread.sleep(2000L);
                            } catch (Exception var24) {
                            }
                            ++this.field566;
                            this.method130(arg0, arg1, arg2);
                        } else {
                            this.field401 = "No response from loginserver";
                            this.field402 = "Please wait 1 minute and try again.";
                        }
                    } else {
                        this.field401 = "No response from server";
                        this.field402 = "Please try using a different world.";
                    }
                } else {
                    System.out.println("response:" + var8);
                    this.field401 = "Unexpected server response";
                    this.field402 = "Please try using a different world.";
                }
            } else {
                for (int var21 = this.field537.method398(); var21 >= 0; --var21) {
                    this.field401 = "You have only just left another world";
                    this.field402 = "Your profile will be transferred in: " + var21 + " seconds";
                    this.method132(true, this.field538);
                    try {
                        Thread.sleep(1000L);
                    } catch (Exception var23) {
                    }
                }
                this.method130(arg0, arg1, arg2);
            }
        } catch (IOException var25) {
            this.field401 = "";
            this.field402 = "Error connecting to server.";
        }
    }

    @OriginalMember(owner = "client", name = "k", descriptor = "(B)V")
    public final void method131(byte arg0) {
        for (int var2 = 0; var2 < this.field387; ++var2) {
            if (this.field488[var2] <= 0) {
                boolean var3 = false;
                try {
                    if (this.field180[var2] == this.field561 && this.field417[var2] == this.field273) {
                        if (!this.method43(true)) {
                            var3 = true;
                        }
                    } else {
                        class68 var4 = class12.method169(this.field417[var2], this.field180[var2], 0);
                        if (System.currentTimeMillis() + (long) (var4.field1612 / 22) > (long) (this.field519 / 22) + this.field526) {
                            this.field519 = var4.field1612;
                            this.field526 = System.currentTimeMillis();
                            if (this.method73(0, var4.field1611, var4.field1612)) {
                                this.field561 = this.field180[var2];
                                this.field273 = this.field417[var2];
                            } else {
                                var3 = true;
                            }
                        }
                    }
                } catch (Exception var7) {
                }
                if (var3 && this.field488[var2] != -5) {
                    this.field488[var2] = -5;
                } else {
                    --this.field387;
                    for (int var6 = var2; var6 < this.field387; ++var6) {
                        this.field180[var6] = this.field180[var6 + 1];
                        this.field417[var6] = this.field417[var6 + 1];
                        this.field488[var6] = this.field488[var6 + 1];
                    }
                    --var2;
                }
            } else {
                int var10002 = this.field488[var2]--;
            }
        }
        if (arg0 != -5) {
            this.field489 = this.field593.method377();
        }
        if (this.field285 > 0) {
            this.field285 -= 20;
            if (this.field285 < 0) {
                this.field285 = 0;
            }
            if (this.field285 == 0 && this.field351 && !field238) {
                this.field331 = this.field275;
                this.field332 = true;
                this.field520.method450(2, this.field331);
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(ZI)V")
    public final void method132(boolean arg0, int arg1) {
        this.method165(0);
        this.field297.method372(0);
        this.field276.method192(0, 0, 49598);
        short var3 = 360;
        short var4 = 200;
        if (arg1 < 0) {
            if (this.field547 == 0) {
                int var5 = var4 / 2 + 80;
                this.field408.method383(var5, 7711145, var3 / 2, true, this.field520.field1333, 6);
                int var6 = var4 / 2 - 20;
                this.field410.method383(var6, 16776960, var3 / 2, true, "Welcome to RuneScape", 6);
                int var17 = var6 + 30;
                int var7 = var3 / 2 - 80;
                int var8 = var4 / 2 + 20;
                this.field277.method192(var8 - 20, var7 - 73, 49598);
                this.field410.method383(var8 + 5, 16777215, var7, true, "New User", 6);
                int var9 = var3 / 2 + 80;
                this.field277.method192(var8 - 20, var9 - 73, 49598);
                this.field410.method383(var8 + 5, 16777215, var9, true, "Existing User", 6);
            }
            if (this.field547 == 2) {
                int var10 = var4 / 2 - 40;
                if (this.field401.length() > 0) {
                    this.field410.method383(var10 - 15, 16776960, var3 / 2, true, this.field401, 6);
                    this.field410.method383(var10, 16776960, var3 / 2, true, this.field402, 6);
                    var10 += 30;
                } else {
                    this.field410.method383(var10 - 7, 16776960, var3 / 2, true, this.field402, 6);
                    var10 += 30;
                }
                this.field410.method390("Username: " + this.field203 + (this.field437 == 0 & field345 % 40 < 20 ? "@yel@|" : ""), var10, (byte) 3, var3 / 2 - 90, 16777215, true);
                var10 += 15;
                this.field410.method390("Password: " + class21.method214(this.field204, -428) + (this.field437 == 1 & field345 % 40 < 20 ? "@yel@|" : ""), var10, (byte) 3, var3 / 2 - 88, 16777215, true);
                var10 += 15;
                if (!arg0) {
                    int var11 = var3 / 2 - 80;
                    int var12 = var4 / 2 + 50;
                    this.field277.method192(var12 - 20, var11 - 73, 49598);
                    this.field410.method383(var12 + 5, 16777215, var11, true, "Login", 6);
                    int var13 = var3 / 2 + 80;
                    this.field277.method192(var12 - 20, var13 - 73, 49598);
                    this.field410.method383(var12 + 5, 16777215, var13, true, "Cancel", 6);
                }
            }
            if (this.field547 == 3) {
                this.field410.method383(var4 / 2 - 60, 16776960, var3 / 2, true, "Create a free account", 6);
                int var14 = var4 / 2 - 35;
                this.field410.method383(var14, 16777215, var3 / 2, true, "To create a new account you need to", 6);
                int var18 = var14 + 15;
                this.field410.method383(var18, 16777215, var3 / 2, true, "go back to the main RuneScape webpage", 6);
                int var19 = var18 + 15;
                this.field410.method383(var19, 16777215, var3 / 2, true, "and choose the red 'create account'", 6);
                int var20 = var19 + 15;
                this.field410.method383(var20, 16777215, var3 / 2, true, "button at the top right of that page.", 6);
                int var21 = var20 + 15;
                int var15 = var3 / 2;
                int var16 = var4 / 2 + 50;
                this.field277.method192(var16 - 20, var15 - 73, 49598);
                this.field410.method383(var16 + 5, 16777215, var15, true, "Cancel", 6);
            }
            this.field297.method373(171, 0, super.field1038, 202);
            if (this.field556) {
                this.field556 = false;
                this.field295.method373(0, 0, super.field1038, 128);
                this.field296.method373(371, 0, super.field1038, 202);
                this.field300.method373(265, 0, super.field1038, 0);
                this.field301.method373(265, 0, super.field1038, 562);
                this.field302.method373(171, 0, super.field1038, 128);
                this.field303.method373(171, 0, super.field1038, 562);
            }
        }
    }

    @OriginalMember(owner = "client", name = "H", descriptor = "(I)Ljava/lang/String;")
    public final String method133(int arg0) {
        if (arg0 < 2 || arg0 > 2) {
            this.field213 = this.field558.method549();
        }
        if (signlink.mainapp != null) {
            return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
        } else {
            return super.field1041 != null ? "runescape.com" : super.getDocumentBase().getHost().toLowerCase();
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IILYOXDZEVD;)V")
    private final void method134(int arg0, int arg1, class68 arg2) {
        arg2.method559(-8237);
        int var4 = arg2.method560(true, 8);
        if (var4 < this.field271) {
            for (int var5 = var4; var5 < this.field271; ++var5) {
                this.field338[this.field337++] = this.field272[var5];
            }
        }
        if (var4 > this.field271) {
            signlink.reporterror(this.field203 + " Too many npcs");
            throw new RuntimeException("eek");
        } else {
            this.field271 = 0;
            if (arg0 != 0) {
                this.field213 = arg2.method549();
            }
            for (int var6 = 0; var6 < var4; ++var6) {
                int var7 = this.field272[var6];
                class10 var8 = this.field270[var7];
                int var9 = arg2.method560(true, 1);
                if (var9 == 0) {
                    this.field272[this.field271++] = var7;
                    var8.field1564 = field345;
                } else {
                    int var10 = arg2.method560(true, 2);
                    if (var10 == 0) {
                        this.field272[this.field271++] = var7;
                        var8.field1564 = field345;
                        this.field486[this.field485++] = var7;
                    } else if (var10 == 1) {
                        this.field272[this.field271++] = var7;
                        var8.field1564 = field345;
                        int var11 = arg2.method560(true, 3);
                        var8.method536(var11, false, false);
                        int var12 = arg2.method560(true, 1);
                        if (var12 == 1) {
                            this.field486[this.field485++] = var7;
                        }
                    } else if (var10 == 2) {
                        this.field272[this.field271++] = var7;
                        var8.field1564 = field345;
                        int var13 = arg2.method560(true, 3);
                        var8.method536(var13, true, false);
                        int var14 = arg2.method560(true, 3);
                        var8.method536(var14, true, false);
                        int var15 = arg2.method560(true, 1);
                        if (var15 == 1) {
                            this.field486[this.field485++] = var7;
                        }
                    } else if (var10 == 3) {
                        this.field338[this.field337++] = var7;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(IZ)Ljava/lang/String;")
    private static final String method135(int arg0, boolean arg1) {
        String var2 = String.valueOf(arg0);
        for (int var3 = var2.length() - 3; var3 > 0; var3 -= 3) {
            var2 = var2.substring(0, var3) + "," + var2.substring(var3);
        }
        if (arg1) {
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

    @OriginalMember(owner = "client", name = "I", descriptor = "(I)V")
    public final void method136(int arg0) {
        if (arg0 != 13535) {
            this.field232.method539(18);
        }
        if (super.field1052 == 1) {
            if (super.field1053 >= 539 && super.field1053 <= 573 && super.field1054 >= 169 && super.field1054 < 205 && this.field540[0] != -1) {
                this.field189 = true;
                this.field649 = 0;
                this.field339 = true;
            }
            if (super.field1053 >= 569 && super.field1053 <= 599 && super.field1054 >= 168 && super.field1054 < 205 && this.field540[1] != -1) {
                this.field189 = true;
                this.field649 = 1;
                this.field339 = true;
            }
            if (super.field1053 >= 597 && super.field1053 <= 627 && super.field1054 >= 168 && super.field1054 < 205 && this.field540[2] != -1) {
                this.field189 = true;
                this.field649 = 2;
                this.field339 = true;
            }
            if (super.field1053 >= 625 && super.field1053 <= 669 && super.field1054 >= 168 && super.field1054 < 203 && this.field540[3] != -1) {
                this.field189 = true;
                this.field649 = 3;
                this.field339 = true;
            }
            if (super.field1053 >= 666 && super.field1053 <= 696 && super.field1054 >= 168 && super.field1054 < 205 && this.field540[4] != -1) {
                this.field189 = true;
                this.field649 = 4;
                this.field339 = true;
            }
            if (super.field1053 >= 694 && super.field1053 <= 724 && super.field1054 >= 168 && super.field1054 < 205 && this.field540[5] != -1) {
                this.field189 = true;
                this.field649 = 5;
                this.field339 = true;
            }
            if (super.field1053 >= 722 && super.field1053 <= 756 && super.field1054 >= 169 && super.field1054 < 205 && this.field540[6] != -1) {
                this.field189 = true;
                this.field649 = 6;
                this.field339 = true;
            }
            if (super.field1053 >= 540 && super.field1053 <= 574 && super.field1054 >= 466 && super.field1054 < 502 && this.field540[7] != -1) {
                this.field189 = true;
                this.field649 = 7;
                this.field339 = true;
            }
            if (super.field1053 >= 572 && super.field1053 <= 602 && super.field1054 >= 466 && super.field1054 < 503 && this.field540[8] != -1) {
                this.field189 = true;
                this.field649 = 8;
                this.field339 = true;
            }
            if (super.field1053 >= 599 && super.field1053 <= 629 && super.field1054 >= 466 && super.field1054 < 503 && this.field540[9] != -1) {
                this.field189 = true;
                this.field649 = 9;
                this.field339 = true;
            }
            if (super.field1053 >= 627 && super.field1053 <= 671 && super.field1054 >= 467 && super.field1054 < 502 && this.field540[10] != -1) {
                this.field189 = true;
                this.field649 = 10;
                this.field339 = true;
            }
            if (super.field1053 >= 669 && super.field1053 <= 699 && super.field1054 >= 466 && super.field1054 < 503 && this.field540[11] != -1) {
                this.field189 = true;
                this.field649 = 11;
                this.field339 = true;
            }
            if (super.field1053 >= 696 && super.field1053 <= 726 && super.field1054 >= 466 && super.field1054 < 503 && this.field540[12] != -1) {
                this.field189 = true;
                this.field649 = 12;
                this.field339 = true;
            }
            if (super.field1053 >= 724 && super.field1053 <= 758 && super.field1054 >= 466 && super.field1054 < 502 && this.field540[13] != -1) {
                this.field189 = true;
                this.field649 = 13;
                this.field339 = true;
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "l", descriptor = "(B)V")
    public final void method137(byte arg0) {
        int var2 = this.field410.method384("Choose Option", true);
        for (int var3 = 0; var3 < this.field219; ++var3) {
            int var11 = this.field410.method384(this.field615[var3], true);
            if (var11 > var2) {
                var2 = var11;
            }
        }
        var2 += 8;
        int var4 = this.field219 * 15 + 21;
        if (arg0 != 83) {
            this.field202 = !this.field202;
        }
        if (super.field1053 > 4 && super.field1054 > 4 && super.field1053 < 516 && super.field1054 < 338) {
            int var5 = super.field1053 - 4 - var2 / 2;
            if (var2 + var5 > 512) {
                var5 = 512 - var2;
            }
            if (var5 < 0) {
                var5 = 0;
            }
            int var6 = super.field1054 - 4;
            if (var4 + var6 > 334) {
                var6 = 334 - var4;
            }
            if (var6 < 0) {
                var6 = 0;
            }
            this.field385 = true;
            this.field261 = 0;
            this.field262 = var5;
            this.field263 = var6;
            this.field264 = var2;
            this.field265 = this.field219 * 15 + 22;
        }
        if (super.field1053 > 553 && super.field1054 > 205 && super.field1053 < 743 && super.field1054 < 466) {
            int var7 = super.field1053 - 553 - var2 / 2;
            if (var7 < 0) {
                var7 = 0;
            } else if (var2 + var7 > 190) {
                var7 = 190 - var2;
            }
            int var8 = super.field1054 - 205;
            if (var8 < 0) {
                var8 = 0;
            } else if (var4 + var8 > 261) {
                var8 = 261 - var4;
            }
            this.field385 = true;
            this.field261 = 1;
            this.field262 = var7;
            this.field263 = var8;
            this.field264 = var2;
            this.field265 = this.field219 * 15 + 22;
        }
        if (super.field1053 > 17 && super.field1054 > 357 && super.field1053 < 496 && super.field1054 < 453) {
            int var9 = super.field1053 - 17 - var2 / 2;
            if (var9 < 0) {
                var9 = 0;
            } else if (var2 + var9 > 479) {
                var9 = 479 - var2;
            }
            int var10 = super.field1054 - 357;
            if (var10 < 0) {
                var10 = 0;
            } else if (var4 + var10 > 96) {
                var10 = 96 - var4;
            }
            this.field385 = true;
            this.field261 = 2;
            this.field262 = var9;
            this.field263 = var10;
            this.field264 = var2;
            this.field265 = this.field219 * 15 + 22;
        }
    }

    @OriginalMember(owner = "client", name = "J", descriptor = "(I)V")
    public final void method138(int arg0) {
        if (arg0 != -40545) {
            this.field217 = -184;
        }
        while (true) {
            class36 var2 = this.field520.method446();
            if (var2 == null) {
                return;
            }
            if (var2.field1065 == 0) {
                class39.method344(var2.field1062, 500, var2.field1063);
                if ((this.field520.method436(var2.field1062, 8) & 98) != 0) {
                    this.field189 = true;
                    if (this.field606 != -1) {
                        this.field412 = true;
                    }
                }
            }
            if (var2.field1065 == 1 && var2.field1063 != null) {
                class55.method452(659, var2.field1063);
            }
            if (var2.field1065 == 2 && this.field331 == var2.field1062 && var2.field1063 != null) {
                this.method68(var2.field1063, (byte) 0, this.field332);
            }
            if (var2.field1065 == 3 && this.field571 == 1) {
                for (int var3 = 0; var3 < this.field542.length; ++var3) {
                    if (this.field468[var3] == var2.field1062) {
                        this.field542[var3] = var2.field1063;
                        if (var2.field1063 == null) {
                            this.field468[var3] = -1;
                        }
                        break;
                    }
                    if (this.field469[var3] == var2.field1062) {
                        this.field536[var3] = var2.field1063;
                        if (var2.field1063 == null) {
                            this.field469[var3] = -1;
                        }
                        break;
                    }
                }
            }
            if (var2.field1065 == 93 && this.field520.method434(0, var2.field1062)) {
                class34.method317(true, this.field520, new class68(var2.field1063, -103));
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BILYOWFBYTG;)V")
    public final void method139(byte arg0, int arg1, class67 arg2) {
        this.method140(-465, arg1, arg2.field1569, arg2.field1570);
        if (arg0 == 4) {
            boolean var4 = false;
        } else {
            field490 = this.field593.method377();
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(IIII)V")
    public final void method140(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 >= 128 && arg3 >= 128 && arg2 <= 13056 && arg3 <= 13056) {
            int var5 = this.method81(0, arg3, this.field494, arg2) - arg1;
            int var6 = arg2 - this.field443;
            int var7 = var5 - this.field444;
            int var8 = arg3 - this.field445;
            int var9 = class39.field1169[this.field446];
            int var10 = class39.field1170[this.field446];
            int var11 = class39.field1169[this.field447];
            int var12 = class39.field1170[this.field447];
            int var13 = var6 * var12 + var8 * var11 >> 16;
            int var14 = var8 * var12 - var6 * var11 >> 16;
            int var16 = var7 * var10 - var9 * var14 >> 16;
            while (arg0 >= 0) {
                this.field232.method539(116);
            }
            int var17 = var7 * var9 + var10 * var14 >> 16;
            if (var17 >= 50) {
                this.field358 = (var13 << 9) / var17 + class33.field981;
                this.field359 = (var16 << 9) / var17 + class33.field982;
            } else {
                this.field358 = -1;
                this.field359 = -1;
            }
        } else {
            this.field358 = -1;
            this.field359 = -1;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
    public final void method141(Runnable arg0, int arg1) {
        if (arg1 > 10) {
            arg1 = 10;
        }
        if (signlink.mainapp != null) {
            signlink.startthread(arg0, arg1);
        } else {
            super.method141(arg0, arg1);
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(I)V")
    public final void method142(int arg0) {
        signlink.reporterror = false;
        try {
            if (this.field537 != null) {
                this.field537.method397();
            }
        } catch (Exception var2) {
        }
        this.field537 = null;
        this.method71((byte) 1);
        if (this.field253 != null) {
            this.field253.field124 = false;
        }
        this.field253 = null;
        this.field520.method440();
        this.field520 = null;
        this.field269 = null;
        this.field232 = null;
        this.field199 = null;
        this.field558 = null;
        this.field467 = null;
        this.field542 = null;
        this.field536 = null;
        this.field468 = null;
        this.field469 = null;
        this.field377 = null;
        this.field634 = null;
        this.field585 = null;
        this.field391 = null;
        this.field565 = null;
        this.field405 = null;
        this.field243 = null;
        this.field244 = null;
        this.field613 = null;
        this.field223 = null;
        this.field224 = null;
        this.field225 = null;
        this.field226 = null;
        this.field280 = null;
        this.field281 = null;
        this.field282 = null;
        this.field425 = null;
        this.field426 = null;
        if (arg0 >= 0) {
            this.field232.method539(121);
        }
        this.field427 = null;
        this.field428 = null;
        this.field429 = null;
        this.field430 = null;
        this.field431 = null;
        this.field432 = null;
        this.field433 = null;
        this.field598 = null;
        this.field599 = null;
        this.field600 = null;
        this.field574 = null;
        this.field575 = null;
        this.field576 = null;
        this.field283 = null;
        this.field462 = null;
        this.field463 = null;
        this.field464 = null;
        this.field465 = null;
        this.field466 = null;
        this.field475 = null;
        this.field476 = null;
        this.field477 = null;
        this.field478 = null;
        this.field479 = null;
        this.field611 = null;
        this.field588 = null;
        this.field267 = null;
        this.field368 = null;
        this.field317 = null;
        this.field318 = null;
        this.field319 = null;
        this.field320 = null;
        this.field321 = null;
        this.field190 = null;
        this.field371 = null;
        this.field450 = null;
        this.field482 = null;
        this.field484 = null;
        this.field486 = null;
        this.field487 = null;
        this.field338 = null;
        this.field270 = null;
        this.field272 = null;
        this.field614 = null;
        this.field186 = null;
        this.field513 = null;
        this.field362 = null;
        this.field364 = null;
        this.field365 = null;
        this.field366 = null;
        this.field367 = null;
        this.field615 = null;
        this.field631 = null;
        this.field287 = null;
        this.field288 = null;
        this.field592 = null;
        this.field396 = null;
        this.field595 = null;
        this.field187 = null;
        this.field470 = null;
        this.field298 = null;
        this.field299 = null;
        this.field295 = null;
        this.field296 = null;
        this.field297 = null;
        this.field300 = null;
        this.field301 = null;
        this.field302 = null;
        this.field303 = null;
        this.method97(false);
        class48.method407(true);
        class19.method207(true);
        class3.method7(true);
        class62.field1509 = null;
        class60.field1471 = null;
        class29.field895 = null;
        class11.field655 = null;
        class9.field163 = null;
        class27.field847 = null;
        class27.field859 = null;
        class7.field130 = null;
        super.field1039 = null;
        class1.field17 = null;
        class33.method295(true);
        class56.method456(true);
        class39.method342(true);
        class55.method453(true);
        System.gc();
        if (class72.field1713) {
        }
    }

    @OriginalMember(owner = "client", name = "K", descriptor = "(I)V")
    public final void method143(int arg0) {
        this.field212 += arg0;
        if (field238 && this.field571 == 2 && class34.field1000 != this.field494) {
            this.field225.method372(0);
            this.field409.method382(0, 19850, "Loading - please wait.", 151, 257);
            this.field409.method382(16777215, 19850, "Loading - please wait.", 150, 256);
            this.field225.method373(4, 0, super.field1038, 4);
            this.field571 = 1;
            this.field376 = System.currentTimeMillis();
        }
        if (this.field571 == 1) {
            int var2 = this.method144(true);
            if (var2 != 0 && System.currentTimeMillis() - this.field376 > 360000L) {
                signlink.reporterror(this.field203 + " glcfb " + this.field562 + "," + var2 + "," + field238 + "," + this.field227[0] + "," + this.field520.method431() + "," + this.field494 + "," + this.field229 + "," + this.field230);
                this.field376 = System.currentTimeMillis();
            }
        }
        if (this.field571 == 2 && this.field494 != this.field210) {
            this.field210 = this.field494;
            this.method95((byte) 3, this.field494);
        }
    }

    @OriginalMember(owner = "client", name = "l", descriptor = "(Z)I")
    public final int method144(boolean arg0) {
        for (int var2 = 0; var2 < this.field542.length; ++var2) {
            if (this.field542[var2] == null && this.field468[var2] != -1) {
                return -1;
            }
            if (this.field536[var2] == null && this.field469[var2] != -1) {
                return -2;
            }
        }
        boolean var3 = true;
        for (int var4 = 0; var4 < this.field542.length; ++var4) {
            byte[] var5 = this.field536[var4];
            if (var5 != null) {
                int var6 = (this.field467[var4] >> 8) * 64 - this.field248;
                int var7 = (this.field467[var4] & 255) * 64 - this.field249;
                if (this.field311) {
                    var6 = 10;
                    var7 = 10;
                }
                var3 &= class34.method314(9, var7, var5, var6);
            }
        }
        if (!var3) {
            return -3;
        } else if (this.field622) {
            return -4;
        } else {
            this.field571 = 2;
            class34.field1000 = this.field494;
            this.field619 &= arg0;
            this.method109(-497);
            this.field232.method538(46, (byte) 0);
            return 0;
        }
    }

    @OriginalMember(owner = "client", name = "m", descriptor = "(Z)V")
    public final void method145(boolean arg0) {
        this.field647 = true;
        if (arg0) {
            this.field213 = -1;
        }
        try {
            long var2 = System.currentTimeMillis();
            int var4 = 0;
            int var5 = 20;
            while (this.field521) {
                ++this.field543;
                this.method93(true);
                this.method93(true);
                this.method77(0);
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
        this.field647 = false;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;Z)V")
    public final void method146(int arg0, String arg1, String arg2, boolean arg3) {
        if (arg3) {
            this.field202 = !this.field202;
        }
        if (arg0 == 0 && this.field493 != -1) {
            this.field413 = arg1;
            super.field1052 = 0;
        }
        if (this.field606 == -1) {
            this.field412 = true;
        }
        for (int var5 = 99; var5 > 0; --var5) {
            this.field504[var5] = this.field504[var5 - 1];
            this.field505[var5] = this.field505[var5 - 1];
            this.field506[var5] = this.field506[var5 - 1];
        }
        this.field504[0] = arg0;
        this.field505[0] = arg2;
        this.field506[0] = arg1;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BIILFKIKYVJJ;I)V")
    public final void method147(byte arg0, int arg1, int arg2, class19 arg3, int arg4) {
        if (arg0 == -41) {
            if (this.field219 < 400) {
                if (arg3.field772 != null) {
                    arg3 = arg3.method206(false);
                }
                if (arg3 != null) {
                    if (arg3.field757) {
                        String var6 = arg3.field775;
                        if (arg3.field776 != 0) {
                            var6 = var6 + method65(field442.field4, arg3.field776, 383) + " (level-" + arg3.field776 + ")";
                        }
                        if (this.field322 == 1) {
                            this.field615[this.field219] = "Use " + this.field326 + " with @yel@" + var6;
                            this.field366[this.field219] = 971;
                            this.field367[this.field219] = arg1;
                            this.field364[this.field219] = arg4;
                            this.field365[this.field219] = arg2;
                            ++this.field219;
                        } else {
                            if (this.field454 == 1) {
                                if ((this.field456 & 2) == 2) {
                                    this.field615[this.field219] = this.field457 + " @yel@" + var6;
                                    this.field366[this.field219] = 600;
                                    this.field367[this.field219] = arg1;
                                    this.field364[this.field219] = arg4;
                                    this.field365[this.field219] = arg2;
                                    ++this.field219;
                                    return;
                                }
                            } else {
                                if (arg3.field750 != null) {
                                    for (int var7 = 4; var7 >= 0; --var7) {
                                        if (arg3.field750[var7] != null && !arg3.field750[var7].equalsIgnoreCase("attack")) {
                                            this.field615[this.field219] = arg3.field750[var7] + " @yel@" + var6;
                                            if (var7 == 0) {
                                                this.field366[this.field219] = 38;
                                            }
                                            if (var7 == 1) {
                                                this.field366[this.field219] = 467;
                                            }
                                            if (var7 == 2) {
                                                this.field366[this.field219] = 585;
                                            }
                                            if (var7 == 3) {
                                                this.field366[this.field219] = 966;
                                            }
                                            if (var7 == 4) {
                                                this.field366[this.field219] = 691;
                                            }
                                            this.field367[this.field219] = arg1;
                                            this.field364[this.field219] = arg4;
                                            this.field365[this.field219] = arg2;
                                            ++this.field219;
                                        }
                                    }
                                }
                                if (arg3.field750 != null) {
                                    for (int var8 = 4; var8 >= 0; --var8) {
                                        if (arg3.field750[var8] != null && arg3.field750[var8].equalsIgnoreCase("attack")) {
                                            short var9 = 0;
                                            if (arg3.field776 > field442.field4) {
                                                var9 = 2000;
                                            }
                                            this.field615[this.field219] = arg3.field750[var8] + " @yel@" + var6;
                                            if (var8 == 0) {
                                                this.field366[this.field219] = var9 + 38;
                                            }
                                            if (var8 == 1) {
                                                this.field366[this.field219] = var9 + 467;
                                            }
                                            if (var8 == 2) {
                                                this.field366[this.field219] = var9 + 585;
                                            }
                                            if (var8 == 3) {
                                                this.field366[this.field219] = var9 + 966;
                                            }
                                            if (var8 == 4) {
                                                this.field366[this.field219] = var9 + 691;
                                            }
                                            this.field367[this.field219] = arg1;
                                            this.field364[this.field219] = arg4;
                                            this.field365[this.field219] = arg2;
                                            ++this.field219;
                                        }
                                    }
                                }
                                this.field615[this.field219] = "Examine @yel@" + var6;
                                this.field366[this.field219] = 1171;
                                this.field367[this.field219] = arg1;
                                this.field364[this.field219] = arg4;
                                this.field365[this.field219] = arg2;
                                ++this.field219;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(IIII)I")
    public final int method148(int arg0, int arg1, int arg2, int arg3) {
        int var5 = 256 - arg2;
        this.field212 += arg3;
        return ((arg0 & 16711935) * arg2 + (arg1 & 16711935) * var5 & -16711936) + ((arg0 & 65280) * arg2 + (arg1 & 65280) * var5 & 16711680) >> 8;
    }

    @OriginalMember(owner = "client", name = "m", descriptor = "(B)V")
    public final void method149(byte arg0) {
        ++this.field354;
        this.method164(true, true);
        this.method112(false, true);
        this.method164(false, true);
        this.method112(false, false);
        this.method151(504);
        this.method41(-335);
        if (!this.field594) {
            int var2 = this.field527;
            if (this.field630 / 256 > var2) {
                var2 = this.field630 / 256;
            }
            if (this.field266[4] && this.field398[4] + 128 > var2) {
                var2 = this.field398[4] + 128;
            }
            int var3 = this.field604 + this.field528 & 2047;
            this.method105(var2, var3, this.field341, this.method81(0, field442.field1570, this.field494, field442.field1569) - 50, var2 * 3 + 600, this.field342, -621);
        }
        int var4;
        if (!this.field594) {
            var4 = this.method75(8);
        } else {
            var4 = this.method76(1);
        }
        int var5 = this.field443;
        int var6 = this.field444;
        int var7 = this.field445;
        int var8 = this.field446;
        int var9 = this.field447;
        for (int var10 = 0; var10 < 5; ++var10) {
            if (this.field266[var10]) {
                int var12 = (int) (Math.random() * (double) (this.field632[var10] * 2 + 1) - (double) this.field632[var10] + Math.sin((double) this.field620[var10] / 100.0D * (double) this.field436[var10]) * (double) this.field398[var10]);
                if (var10 == 0) {
                    this.field443 += var12;
                }
                if (var10 == 1) {
                    this.field444 += var12;
                }
                if (var10 == 2) {
                    this.field445 += var12;
                }
                if (var10 == 3) {
                    this.field447 = this.field447 + var12 & 2047;
                }
                if (var10 == 4) {
                    this.field446 += var12;
                    if (this.field446 < 128) {
                        this.field446 = 128;
                    }
                    if (this.field446 > 383) {
                        this.field446 = 383;
                    }
                }
            }
        }
        int var11 = class33.field996;
        class39.field1164 = true;
        class39.field1167 = 0;
        class39.field1165 = super.field1046 - 4;
        class39.field1166 = super.field1047 - 4;
        if (arg0 != 105) {
            this.field614 = null;
        }
        class31.method282(3);
        this.field585.method496(this.field444, var4, this.field447, this.field443, 971, this.field446, this.field445);
        this.field585.method471(0);
        this.method108(5);
        this.method125((byte) 5);
        this.method116(var11, false);
        this.method150((byte) 7);
        this.field225.method373(4, 0, super.field1038, 4);
        this.field443 = var5;
        this.field444 = var6;
        this.field445 = var7;
        this.field446 = var8;
        this.field447 = var9;
    }

    @OriginalMember(owner = "client", name = "n", descriptor = "(B)V")
    public final void method150(byte arg0) {
        this.method28(12036);
        if (arg0 != 7) {
            this.field232.method539(103);
        }
        if (this.field242 == 1) {
            this.field368[this.field241 / 100].method179(this.field240 - 8 - 4, this.field239 - 8 - 4, 49598);
        }
        if (this.field242 == 2) {
            this.field368[this.field241 / 100 + 4].method179(this.field240 - 8 - 4, this.field239 - 8 - 4, 49598);
        }
        if (this.field577 != -1) {
            this.method42(this.field539, this.field329, this.field577);
            this.method78(0, class29.field895[this.field577], 0, 0, (byte) 2);
        }
        if (this.field438 != -1) {
            this.method42(this.field539, this.field329, this.field438);
            this.method78(0, class29.field895[this.field438], 0, 0, (byte) 2);
        }
        this.method29(1);
        if (!this.field385) {
            this.method86(true);
            this.method31(false);
        } else if (this.field261 == 0) {
            this.method69(-713);
        }
        if (this.field549 == 1) {
            this.field267[1].method179(296, 472, 49598);
        }
        if (field388) {
            short var2 = 507;
            byte var3 = 20;
            int var4 = 16776960;
            if (super.field1034 < 15) {
                var4 = 16711680;
            }
            this.field409.method381(var2, var3, (byte) 2, "Fps:" + super.field1034, var4);
            int var12 = var3 + 15;
            Runtime var5 = Runtime.getRuntime();
            int var6 = (int) ((var5.totalMemory() - var5.freeMemory()) / 1024L);
            int var7 = 16776960;
            if (var6 > 33554432 && field238) {
                int var8 = 16711680;
            }
            this.field409.method381(var2, var12, (byte) 2, "Mem:" + var6 + "k", 16776960);
            var12 += 15;
        }
        if (this.field284 != 0) {
            int var9 = this.field284 / 50;
            int var10 = var9 / 60;
            int var11 = var9 % 60;
            if (var11 < 10) {
                this.field409.method386(4, "System update in: " + var10 + ":0" + var11, 16776960, -997, 329);
            } else {
                this.field409.method386(4, "System update in: " + var10 + ":" + var11, 16776960, -997, 329);
            }
        }
    }

    @OriginalMember(owner = "client", name = "L", descriptor = "(I)V")
    public final void method151(int arg0) {
        class61 var2 = (class61) this.field513.method528();
        if (arg0 <= 0) {
            this.field213 = -1;
        }
        while (var2 != null) {
            if (this.field494 == var2.field1483 && field345 <= var2.field1491) {
                if (field345 >= var2.field1490) {
                    if (var2.field1494 > 0) {
                        class10 var3 = this.field270[var2.field1494 - 1];
                        if (var3 != null && var3.field1569 >= 0 && var3.field1569 < 13312 && var3.field1570 >= 0 && var3.field1570 < 13312) {
                            var2.method514(var3.field1570, field345, this.method81(0, var3.field1570, var2.field1483, var3.field1569) - var2.field1482, this.field234, var3.field1569);
                        }
                    }
                    if (var2.field1494 < 0) {
                        int var4 = -var2.field1494 - 1;
                        class1 var5;
                        if (this.field279 == var4) {
                            var5 = field442;
                        } else {
                            var5 = this.field482[var4];
                        }
                        if (var5 != null && var5.field1569 >= 0 && var5.field1569 < 13312 && var5.field1570 >= 0 && var5.field1570 < 13312) {
                            var2.method514(var5.field1570, field345, this.method81(0, var5.field1570, var2.field1483, var5.field1569) - var2.field1482, this.field234, var5.field1569);
                        }
                    }
                    var2.method515(this.field329, this.field596);
                    this.field585.method468((int) var2.field1496, false, (int) var2.field1497, (int) var2.field1495, -1, 48192, this.field494, var2, var2.field1488, 60);
                }
            } else {
                var2.method589();
            }
            var2 = (class61) this.field513.method530(false);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LAGFDLNBY;IIII)V")
    public final void method152(class1 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (field442 != arg0) {
            if (this.field219 < 400) {
                if (arg2 == 3) {
                    String var6;
                    if (arg0.field16 == 0) {
                        var6 = arg0.field13 + method65(field442.field4, arg0.field4, 383) + " (level-" + arg0.field4 + ")";
                    } else {
                        var6 = arg0.field13 + " (skill-" + arg0.field16 + ")";
                    }
                    if (this.field322 == 1) {
                        this.field615[this.field219] = "Use " + this.field326 + " with @whi@" + var6;
                        this.field366[this.field219] = 558;
                        this.field367[this.field219] = arg3;
                        this.field364[this.field219] = arg4;
                        this.field365[this.field219] = arg1;
                        ++this.field219;
                    } else if (this.field454 == 1) {
                        if ((this.field456 & 8) == 8) {
                            this.field615[this.field219] = this.field457 + " @whi@" + var6;
                            this.field366[this.field219] = 654;
                            this.field367[this.field219] = arg3;
                            this.field364[this.field219] = arg4;
                            this.field365[this.field219] = arg1;
                            ++this.field219;
                        }
                    } else {
                        for (int var7 = 4; var7 >= 0; --var7) {
                            if (this.field349[var7] != null) {
                                this.field615[this.field219] = this.field349[var7] + " @whi@" + var6;
                                short var9 = 0;
                                if (this.field349[var7].equalsIgnoreCase("attack")) {
                                    if (arg0.field4 > field442.field4) {
                                        var9 = 2000;
                                    }
                                    if (field442.field2 != 0 && arg0.field2 != 0) {
                                        if (field442.field2 == arg0.field2) {
                                            var9 = 2000;
                                        } else {
                                            var9 = 0;
                                        }
                                    }
                                } else if (this.field350[var7]) {
                                    var9 = 2000;
                                }
                                if (var7 == 0) {
                                    this.field366[this.field219] = var9 + 445;
                                }
                                if (var7 == 1) {
                                    this.field366[this.field219] = var9 + 57;
                                }
                                if (var7 == 2) {
                                    this.field366[this.field219] = var9 + 831;
                                }
                                if (var7 == 3) {
                                    this.field366[this.field219] = var9 + 359;
                                }
                                if (var7 == 4) {
                                    this.field366[this.field219] = var9 + 404;
                                }
                                this.field367[this.field219] = arg3;
                                this.field364[this.field219] = arg4;
                                this.field365[this.field219] = arg1;
                                ++this.field219;
                            }
                        }
                    }
                    for (int var8 = 0; var8 < this.field219; ++var8) {
                        if (this.field366[var8] == 746) {
                            this.field615[var8] = "Walk here @whi@" + var6;
                            return;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZLJDSNLLMP;I)I")
    public final int method153(boolean arg0, class29 arg1, int arg2) {
        if (arg0) {
            return 1;
        } else if (arg1.field927 != null && arg2 < arg1.field927.length) {
            try {
                int[] var4 = arg1.field927[arg2];
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
                        var9 = this.field418[var4[var6++]];
                    }
                    if (var8 == 2) {
                        var9 = this.field312[var4[var6++]];
                    }
                    if (var8 == 3) {
                        var9 = this.field290[var4[var6++]];
                    }
                    if (var8 == 4) {
                        class29 var11 = class29.field895[var4[var6++]];
                        int var12 = var4[var6++];
                        if (var12 >= 0 && var12 < class3.field62 && (!class3.method13(var12).field93 || field237)) {
                            for (int var13 = 0; var13 < var11.field880.length; ++var13) {
                                if (var12 + 1 == var11.field880[var13]) {
                                    var9 += var11.field912[var13];
                                }
                            }
                        }
                    }
                    if (var8 == 5) {
                        var9 = this.field631[var4[var6++]];
                    }
                    if (var8 == 6) {
                        var9 = field289[this.field312[var4[var6++]] - 1];
                    }
                    if (var8 == 7) {
                        var9 = this.field631[var4[var6++]] * 100 / 46875;
                    }
                    if (var8 == 8) {
                        var9 = field442.field4;
                    }
                    if (var8 == 9) {
                        for (int var14 = 0; var14 < class24.field824; ++var14) {
                            if (class24.field826[var14]) {
                                var9 += this.field312[var14];
                            }
                        }
                    }
                    if (var8 == 10) {
                        class29 var15 = class29.field895[var4[var6++]];
                        int var16 = var4[var6++] + 1;
                        if (var16 >= 0 && var16 < class3.field62 && (!class3.method13(var16).field93 || field237)) {
                            for (int var17 = 0; var17 < var15.field880.length; ++var17) {
                                if (var15.field880[var17] == var16) {
                                    var9 = 999999999;
                                    break;
                                }
                            }
                        }
                    }
                    if (var8 == 11) {
                        var9 = this.field608;
                    }
                    if (var8 == 12) {
                        var9 = this.field616;
                    }
                    if (var8 == 13) {
                        int var18 = this.field631[var4[var6++]];
                        int var19 = var4[var6++];
                        var9 = (var18 & 1 << var19) != 0 ? 1 : 0;
                    }
                    if (var8 == 14) {
                        int var20 = var4[var6++];
                        class50 var21 = class50.field1300[var20];
                        int var22 = var21.field1302;
                        int var23 = var21.field1303;
                        int var24 = var21.field1304;
                        int var25 = field421[var24 - var23];
                        var9 = this.field631[var22] >> var23 & var25;
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
                        var9 = (field442.field1569 >> 7) + this.field248;
                    }
                    if (var8 == 19) {
                        var9 = (field442.field1570 >> 7) + this.field249;
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

    @OriginalMember(owner = "client", name = "a", descriptor = "(BIIIIIIIII)V")
    private final void method154(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        class4 var11 = null;
        for (class4 var12 = (class4) this.field186.method528(); var12 != null; var12 = (class4) this.field186.method530(false)) {
            if (var12.field107 == arg3 && var12.field109 == arg7 && var12.field110 == arg4 && var12.field108 == arg1) {
                var11 = var12;
                break;
            }
        }
        if (var11 == null) {
            var11 = new class4();
            var11.field107 = arg3;
            var11.field108 = arg1;
            var11.field109 = arg7;
            var11.field110 = arg4;
            this.method162(var11, -30058);
            this.field186.method525(var11);
        }
        var11.field111 = arg9;
        var11.field113 = arg6;
        var11.field112 = arg2;
        var11.field118 = arg5;
        if (arg0 != -71) {
            field404 = this.field593.method377();
        }
        var11.field117 = arg8;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IZI)V")
    public final void method155(int arg0, boolean arg1, int arg2) {
        while (arg2 >= 0) {
            this.field213 = -1;
        }
        signlink.midivol = arg0;
        if (arg1) {
            signlink.midi = "voladjust";
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BILjava/lang/String;)V")
    public final void method156(byte arg0, int arg1, String arg2) {
        this.field254 = arg1;
        this.field507 = arg2;
        this.method165(0);
        if (this.field356 == null) {
            super.method156((byte) 63, arg1, arg2);
        } else {
            this.field297.method372(0);
            short var4 = 360;
            short var5 = 200;
            byte var6 = 20;
            this.field410.method382(16777215, 19850, "RuneScape is loading - please wait...", var5 / 2 - 26 - var6, var4 / 2);
            int var7 = var5 / 2 - 18 - var6;
            class31.method285(var7, 34, 9179409, var4 / 2 - 152, 304, this.field569);
            class31.method285(var7 + 1, 32, 0, var4 / 2 - 151, 302, this.field569);
            class31.method284(var4 / 2 - 150, var7 + 2, 9179409, (byte) -4, 30, arg1 * 3);
            if (arg0 != 63) {
                field490 = this.field593.method377();
            }
            class31.method284(arg1 * 3 + (var4 / 2 - 150), var7 + 2, 0, (byte) -4, 30, 300 - arg1 * 3);
            this.field410.method382(16777215, 19850, arg2, var5 / 2 + 5 - var6, var4 / 2);
            this.field297.method373(171, 0, super.field1038, 202);
            if (this.field556) {
                this.field556 = false;
                if (!this.field521) {
                    this.field298.method373(0, 0, super.field1038, 0);
                    this.field299.method373(0, 0, super.field1038, 637);
                }
                this.field295.method373(0, 0, super.field1038, 128);
                this.field296.method373(371, 0, super.field1038, 202);
                this.field300.method373(265, 0, super.field1038, 0);
                this.field301.method373(265, 0, super.field1038, 562);
                this.field302.method373(171, 0, super.field1038, 128);
                this.field303.method373(171, 0, super.field1038, 562);
            }
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(II)V")
    public final void method157(int arg0, int arg1) {
        class29 var3 = class29.field895[arg1];
        for (int var4 = 0; var4 < var3.field929.length && var3.field929[var4] != -1; ++var4) {
            class29 var5 = class29.field895[var3.field929[var4]];
            if (var5.field909 == 1) {
                this.method157(-758, var5.field884);
            }
            var5.field936 = 0;
            var5.field920 = 0;
        }
        while (arg0 >= 0) {
            this.field232.method539(225);
        }
    }

    @OriginalMember(owner = "client", name = "M", descriptor = "(I)V")
    public final void method158(int arg0) {
        if (this.field226 == null) {
            this.method97(false);
            super.field1039 = null;
            this.field295 = null;
            this.field296 = null;
            this.field297 = null;
            this.field298 = null;
            this.field299 = null;
            this.field300 = null;
            this.field301 = null;
            this.field302 = null;
            this.field303 = null;
            this.field226 = new class40(this.method45(-33), 479, 96, false);
            this.field224 = new class40(this.method45(-33), 172, 156, false);
            class31.method282(3);
            this.field599.method192(0, 0, 49598);
            this.field223 = new class40(this.method45(-33), 190, 261, false);
            this.field225 = new class40(this.method45(-33), 512, 334, false);
            if (arg0 != 43718) {
                this.field538 = this.field593.method377();
            }
            class31.method282(3);
            this.field280 = new class40(this.method45(-33), 496, 50, false);
            this.field281 = new class40(this.method45(-33), 269, 37, false);
            this.field282 = new class40(this.method45(-33), 249, 45, false);
            this.field556 = true;
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(ILYOXDZEVD;B)V")
    private final void method159(int arg0, class68 arg1, byte arg2) {
        int var4 = arg1.method560(true, 8);
        if (var4 < this.field483) {
            for (int var5 = var4; var5 < this.field483; ++var5) {
                this.field338[this.field337++] = this.field484[var5];
            }
        }
        if (var4 > this.field483) {
            signlink.reporterror(this.field203 + " Too many players");
            throw new RuntimeException("eek");
        } else {
            this.field483 = 0;
            if (arg2 != -25) {
                this.method119();
            }
            for (int var6 = 0; var6 < var4; ++var6) {
                int var7 = this.field484[var6];
                class1 var8 = this.field482[var7];
                int var9 = arg1.method560(true, 1);
                if (var9 == 0) {
                    this.field484[this.field483++] = var7;
                    var8.field1564 = field345;
                } else {
                    int var10 = arg1.method560(true, 2);
                    if (var10 == 0) {
                        this.field484[this.field483++] = var7;
                        var8.field1564 = field345;
                        this.field486[this.field485++] = var7;
                    } else if (var10 == 1) {
                        this.field484[this.field483++] = var7;
                        var8.field1564 = field345;
                        int var11 = arg1.method560(true, 3);
                        var8.method536(var11, false, false);
                        int var12 = arg1.method560(true, 1);
                        if (var12 == 1) {
                            this.field486[this.field485++] = var7;
                        }
                    } else if (var10 == 2) {
                        this.field484[this.field483++] = var7;
                        var8.field1564 = field345;
                        int var13 = arg1.method560(true, 3);
                        var8.method536(var13, true, false);
                        int var14 = arg1.method560(true, 3);
                        var8.method536(var14, true, false);
                        int var15 = arg1.method560(true, 1);
                        if (var15 == 1) {
                            this.field486[this.field485++] = var7;
                        }
                    } else if (var10 == 3) {
                        this.field338[this.field337++] = var7;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "o", descriptor = "(B)V")
    public final void method160(byte arg0) {
        this.field226.method372(0);
        class33.field987 = this.field496;
        this.field600.method192(0, 0, 49598);
        if (this.field460) {
            this.field410.method382(0, 19850, this.field624, 40, 239);
            this.field410.method382(128, 19850, this.field610 + "*", 60, 239);
        } else if (this.field310 == 1) {
            this.field410.method382(0, 19850, "Enter amount:", 40, 239);
            this.field410.method382(128, 19850, this.field552 + "*", 60, 239);
        } else if (this.field310 == 2) {
            this.field410.method382(0, 19850, "Enter name:", 40, 239);
            this.field410.method382(128, 19850, this.field552 + "*", 60, 239);
        } else if (this.field413 != null) {
            this.field410.method382(0, 19850, this.field413, 40, 239);
            this.field410.method382(128, 19850, "Click to continue", 60, 239);
        } else if (this.field606 != -1) {
            this.method78(0, class29.field895[this.field606], 0, 0, (byte) 2);
        } else if (this.field493 != -1) {
            this.method78(0, class29.field895[this.field493], 0, 0, (byte) 2);
        } else {
            class45 var2 = this.field409;
            int var3 = 0;
            class31.method281(0, 77, 463, 0, 1);
            for (int var4 = 0; var4 < 100; ++var4) {
                if (this.field506[var4] != null) {
                    int var6 = this.field504[var4];
                    int var7 = 70 - var3 * 14 + this.field618;
                    String var8 = this.field505[var4];
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
                            var2.method386(4, this.field506[var4], 0, -997, var7);
                        }
                        ++var3;
                    }
                    if ((var6 == 1 || var6 == 2) && (var6 == 1 || this.field628 == 0 || this.field628 == 1 && this.method26(var8, 15404))) {
                        if (var7 > 0 && var7 < 110) {
                            int var10 = 4;
                            if (var9 == 1) {
                                this.field252[0].method192(var7 - 12, var10, 49598);
                                var10 += 14;
                            }
                            if (var9 == 2) {
                                this.field252[1].method192(var7 - 12, var10, 49598);
                                var10 += 14;
                            }
                            var2.method386(var10, var8 + ":", 0, -997, var7);
                            int var11 = var10 + var2.method384(var8, true) + 8;
                            var2.method386(var11, this.field506[var4], 255, -997, var7);
                        }
                        ++var3;
                    }
                    if ((var6 == 3 || var6 == 7) && this.field268 == 0 && (var6 == 7 || this.field612 == 0 || this.field612 == 1 && this.method26(var8, 15404))) {
                        if (var7 > 0 && var7 < 110) {
                            byte var12 = 4;
                            var2.method386(var12, "From", 0, -997, var7);
                            int var13 = var12 + var2.method384("From ", true);
                            if (var9 == 1) {
                                this.field252[0].method192(var7 - 12, var13, 49598);
                                var13 += 14;
                            }
                            if (var9 == 2) {
                                this.field252[1].method192(var7 - 12, var13, 49598);
                                var13 += 14;
                            }
                            var2.method386(var13, var8 + ":", 0, -997, var7);
                            int var14 = var13 + var2.method384(var8, true) + 8;
                            var2.method386(var14, this.field506[var4], 8388608, -997, var7);
                        }
                        ++var3;
                    }
                    if (var6 == 4 && (this.field357 == 0 || this.field357 == 1 && this.method26(var8, 15404))) {
                        if (var7 > 0 && var7 < 110) {
                            var2.method386(4, var8 + " " + this.field506[var4], 8388736, -997, var7);
                        }
                        ++var3;
                    }
                    if (var6 == 5 && this.field268 == 0 && this.field612 < 2) {
                        if (var7 > 0 && var7 < 110) {
                            var2.method386(4, this.field506[var4], 8388608, -997, var7);
                        }
                        ++var3;
                    }
                    if (var6 == 6 && this.field268 == 0 && this.field612 < 2) {
                        if (var7 > 0 && var7 < 110) {
                            var2.method386(4, "To " + var8 + ":", 0, -997, var7);
                            var2.method386(12 + var2.method384("To " + var8, true), this.field506[var4], 8388608, -997, var7);
                        }
                        ++var3;
                    }
                    if (var6 == 8 && (this.field357 == 0 || this.field357 == 1 && this.method26(var8, 15404))) {
                        if (var7 > 0 && var7 < 110) {
                            var2.method386(4, var8 + " " + this.field506[var4], 8270336, -997, var7);
                        }
                        ++var3;
                    }
                }
            }
            class31.method280(true);
            this.field294 = var3 * 14 + 7;
            if (this.field294 < 78) {
                this.field294 = 78;
            }
            this.method51(this.field294, false, this.field294 - this.field618 - 77, 77, 0, 463);
            String var5;
            if (field442 != null && field442.field13 != null) {
                var5 = field442.field13;
            } else {
                var5 = class21.method213(31698, this.field203);
            }
            var2.method386(4, var5 + ":", 0, -997, 90);
            var2.method386(6 + var2.method384(var5 + ": ", true), this.field609 + "*", 255, -997, 90);
            class31.method287(0, 0, 77, (byte) 8, 479);
        }
        if (this.field385 && this.field261 == 2) {
            this.method69(-713);
        }
        this.field226.method373(357, 0, super.field1038, 17);
        if (arg0 != 1) {
            this.field572 = this.field593.method377();
        }
        this.field225.method372(0);
        class33.field987 = this.field498;
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(ILYOXDZEVD;B)V")
    private final void method161(int arg0, class68 arg1, byte arg2) {
        this.field337 = 0;
        if (arg2 != -102) {
            for (int var4 = 1; var4 > 0; ++var4) {
            }
        }
        this.field485 = 0;
        this.method134(0, arg0, arg1);
        this.method60(arg1, arg0, (byte) 45);
        this.method100(true, arg0, arg1);
        for (int var5 = 0; var5 < this.field337; ++var5) {
            int var7 = this.field338[var5];
            if (field345 != this.field270[var7].field1564) {
                this.field270[var7].field653 = null;
                this.field270[var7] = null;
            }
        }
        if (arg1.field1612 != arg0) {
            signlink.reporterror(this.field203 + " size mismatch in getnpcpos - pos:" + arg1.field1612 + " psize:" + arg0);
            throw new RuntimeException("eek");
        } else {
            for (int var6 = 0; var6 < this.field271; ++var6) {
                if (this.field270[this.field272[var6]] == null) {
                    signlink.reporterror(this.field203 + " null entry in npc list - pos:" + var6 + " size:" + this.field271);
                    throw new RuntimeException("eek");
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LAIQUEQRG;I)V")
    private final void method162(class4 arg0, int arg1) {
        if (arg1 != -30058) {
            this.field258 = !this.field258;
        }
        int var3 = 0;
        int var4 = -1;
        int var5 = 0;
        int var6 = 0;
        if (arg0.field108 == 0) {
            var3 = this.field585.method483(arg0.field107, arg0.field109, arg0.field110);
        }
        if (arg0.field108 == 1) {
            var3 = this.field585.method484(arg0.field110, -997, arg0.field107, arg0.field109);
        }
        if (arg0.field108 == 2) {
            var3 = this.field585.method485(arg0.field107, arg0.field109, arg0.field110);
        }
        if (arg0.field108 == 3) {
            var3 = this.field585.method486(arg0.field107, arg0.field109, arg0.field110);
        }
        if (var3 != 0) {
            int var7 = this.field585.method487(arg0.field107, arg0.field109, arg0.field110, var3);
            var4 = var3 >> 14 & 32767;
            var5 = var7 & 31;
            var6 = var7 >> 6;
        }
        arg0.field114 = var4;
        arg0.field116 = var5;
        arg0.field115 = var6;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZJ)V")
    public final void method163(boolean arg0, long arg1) {
        if (arg1 != 0L) {
            for (int var4 = 0; var4 < this.field458; ++var4) {
                if (this.field419[var4] == arg1) {
                    --this.field458;
                    this.field189 = true;
                    for (int var5 = var4; var5 < this.field458; ++var5) {
                        this.field419[var5] = this.field419[var5 + 1];
                    }
                    this.field232.method538(221, (byte) 0);
                    this.field232.method545(false, arg1);
                    break;
                }
            }
            if (!arg0) {
                this.field535 = !this.field535;
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(ZZ)V")
    public final void method164(boolean arg0, boolean arg1) {
        if (field442.field1569 >> 7 == this.field394 && field442.field1570 >> 7 == this.field395) {
            this.field394 = 0;
            ++field255;
            if (field255 > 103) {
                field255 = 0;
                this.field232.method538(195, (byte) 0);
                this.field232.method540(37611);
            }
        }
        int var3 = this.field483;
        if (arg1) {
            if (arg0) {
                var3 = 1;
            }
            for (int var4 = 0; var4 < var3; ++var4) {
                class1 var5;
                int var6;
                if (arg0) {
                    var5 = field442;
                    var6 = this.field481 << 14;
                } else {
                    var5 = this.field482[this.field484[var4]];
                    var6 = this.field484[var4] << 14;
                }
                if (var5 != null && var5.method1(8)) {
                    var5.field29 = false;
                    if ((field238 && this.field483 > 50 || this.field483 > 200) && !arg0 && var5.field1586 == var5.field1572) {
                        var5.field29 = true;
                    }
                    int var7 = var5.field1569 >> 7;
                    int var8 = var5.field1570 >> 7;
                    if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                        if (var5.field12 != null && field345 >= var5.field23 && field345 < var5.field24) {
                            var5.field29 = false;
                            var5.field8 = this.method81(0, var5.field1570, this.field494, var5.field1569);
                            this.field585.method469(var5.field8, var6, var5, this.field494, var5.field22, var5.field1571, var5.field19, (byte) 74, var5.field20, 60, var5.field21, var5.field1569, var5.field1570);
                        } else {
                            if ((var5.field1569 & 127) == 64 && (var5.field1570 & 127) == 64) {
                                if (this.field450[var7][var8] == this.field354) {
                                    continue;
                                }
                                this.field450[var7][var8] = this.field354;
                            }
                            var5.field8 = this.method81(0, var5.field1570, this.field494, var5.field1569);
                            this.field585.method468(var5.field1570, var5.field1535, var5.field8, var5.field1569, var6, 48192, this.field494, var5, var5.field1571, 60);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "N", descriptor = "(I)V")
    public final void method165(int arg0) {
        if (this.field295 == null) {
            super.field1039 = null;
            this.field226 = null;
            this.field224 = null;
            this.field223 = null;
            this.field212 += arg0;
            this.field225 = null;
            this.field280 = null;
            this.field281 = null;
            this.field282 = null;
            this.field298 = new class40(this.method45(-33), 128, 265, false);
            class31.method282(3);
            this.field299 = new class40(this.method45(-33), 128, 265, false);
            class31.method282(3);
            this.field295 = new class40(this.method45(-33), 509, 171, false);
            class31.method282(3);
            this.field296 = new class40(this.method45(-33), 360, 132, false);
            class31.method282(3);
            this.field297 = new class40(this.method45(-33), 360, 200, false);
            class31.method282(3);
            this.field300 = new class40(this.method45(-33), 202, 238, false);
            class31.method282(3);
            this.field301 = new class40(this.method45(-33), 203, 238, false);
            class31.method282(3);
            this.field302 = new class40(this.method45(-33), 74, 94, false);
            class31.method282(3);
            this.field303 = new class40(this.method45(-33), 75, 94, false);
            class31.method282(3);
            if (this.field356 != null) {
                this.method88(true);
                this.method128(34131);
            }
            this.field556 = true;
        }
    }

    @OriginalMember(owner = "client", name = "O", descriptor = "(I)V")
    public final void method166(int arg0) {
        for (int var2 = -1; var2 < this.field483; ++var2) {
            int var3;
            if (var2 == -1) {
                var3 = this.field481;
            } else {
                var3 = this.field484[var2];
            }
            class1 var4 = this.field482[var3];
            if (var4 != null) {
                this.method33(-18476, 1, var4);
            }
        }
        ++field293;
        if (arg0 != 10738) {
            this.field258 = !this.field258;
        }
        if (field293 > 183) {
            field293 = 0;
            this.field232.method538(216, (byte) 0);
            this.field232.method539(222);
        }
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; ++var1) {
            int var4 = var1 + 1;
            int var5 = (int) ((double) var4 + 300.0D * Math.pow(2.0D, (double) var4 / 7.0D));
            var0 += var5;
            field289[var1] = var0 / 4;
        }
        field346 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");
        field389 = 540;
        field404 = -944;
        field421 = new int[32];
        int var2 = 2;
        for (int var3 = 0; var3 < 32; ++var3) {
            field421[var3] = var2 - 1;
            var2 += var2;
        }
        field490 = -169;
        field532 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };
        field554 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
        field591 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };
        field625 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");
    }
}
