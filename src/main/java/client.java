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
public class client extends class61 {

    @OriginalMember(owner = "client", name = "K", descriptor = "Z")
    private boolean field120 = true;

    @OriginalMember(owner = "client", name = "N", descriptor = "I")
    private int field123 = -27;

    @OriginalMember(owner = "client", name = "O", descriptor = "[[[LEWLVMFRK;")
    private class15[][][] field124 = new class15[4][104][104];

    @OriginalMember(owner = "client", name = "Q", descriptor = "I")
    private int field126 = -1;

    @OriginalMember(owner = "client", name = "R", descriptor = "Z")
    private boolean field127 = false;

    @OriginalMember(owner = "client", name = "V", descriptor = "[Ljava/lang/String;")
    private String[] field131 = new String[500];

    @OriginalMember(owner = "client", name = "bb", descriptor = "[[I")
    private int[][] field137 = new int[104][104];

    @OriginalMember(owner = "client", name = "cb", descriptor = "Z")
    private boolean field138 = false;

    @OriginalMember(owner = "client", name = "db", descriptor = "[LOPAHDXQS;")
    private class43[] field139 = new class43[4];

    @OriginalMember(owner = "client", name = "mb", descriptor = "I")
    private int field148 = 2;

    @OriginalMember(owner = "client", name = "ob", descriptor = "[I")
    private int[] field150 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client", name = "pb", descriptor = "Z")
    private boolean field151 = false;

    @OriginalMember(owner = "client", name = "qb", descriptor = "I")
    private int field152 = -1;

    @OriginalMember(owner = "client", name = "sb", descriptor = "Z")
    private boolean field154 = true;

    @OriginalMember(owner = "client", name = "tb", descriptor = "[[[I")
    private int[][][] field155 = new int[4][13][13];

    @OriginalMember(owner = "client", name = "Db", descriptor = "[I")
    private int[] field165 = new int[151];

    @OriginalMember(owner = "client", name = "Gb", descriptor = "B")
    private byte field168 = -107;

    @OriginalMember(owner = "client", name = "Hb", descriptor = "Z")
    private boolean field169 = false;

    @OriginalMember(owner = "client", name = "Jb", descriptor = "[I")
    private int[] field171 = new int[33];

    @OriginalMember(owner = "client", name = "Nb", descriptor = "[[I")
    private int[][] field175 = new int[104][104];

    @OriginalMember(owner = "client", name = "Pb", descriptor = "[Ljava/lang/String;")
    private String[] field177 = new String[200];

    @OriginalMember(owner = "client", name = "Ub", descriptor = "Z")
    private boolean field182 = true;

    @OriginalMember(owner = "client", name = "Wb", descriptor = "Z")
    private volatile boolean field184 = false;

    @OriginalMember(owner = "client", name = "Yb", descriptor = "I")
    private int field186 = -1;

    @OriginalMember(owner = "client", name = "bc", descriptor = "I")
    private int field189 = 5;

    @OriginalMember(owner = "client", name = "cc", descriptor = "Z")
    private boolean field190 = false;

    @OriginalMember(owner = "client", name = "fc", descriptor = "Z")
    private boolean field193 = false;

    @OriginalMember(owner = "client", name = "jc", descriptor = "[I")
    private int[] field197 = new int[class35.field1057];

    @OriginalMember(owner = "client", name = "kc", descriptor = "I")
    private int field198 = -1;

    @OriginalMember(owner = "client", name = "mc", descriptor = "Z")
    private boolean field200 = false;

    @OriginalMember(owner = "client", name = "nc", descriptor = "[LYGMSKJOQ;")
    private class69[] field201 = new class69[20];

    @OriginalMember(owner = "client", name = "oc", descriptor = "Ljava/util/zip/CRC32;")
    private CRC32 field202 = new CRC32();

    @OriginalMember(owner = "client", name = "pc", descriptor = "I")
    private int field203 = -615;

    @OriginalMember(owner = "client", name = "qc", descriptor = "I")
    private int field204 = 128;

    @OriginalMember(owner = "client", name = "wc", descriptor = "I")
    private int field210 = 284;

    @OriginalMember(owner = "client", name = "yc", descriptor = "LEWLVMFRK;")
    private class15 field212 = new class15(field412);

    @OriginalMember(owner = "client", name = "zc", descriptor = "[LDEITBGVL;")
    private class9[] field213 = new class9[2];

    @OriginalMember(owner = "client", name = "Bc", descriptor = "Z")
    private boolean field215 = false;

    @OriginalMember(owner = "client", name = "Dc", descriptor = "I")
    private int field217 = 46314;

    @OriginalMember(owner = "client", name = "Fc", descriptor = "I")
    private int field219 = -393;

    @OriginalMember(owner = "client", name = "Kc", descriptor = "Z")
    public boolean field224 = true;

    @OriginalMember(owner = "client", name = "Mc", descriptor = "Z")
    private boolean field226 = true;

    @OriginalMember(owner = "client", name = "Oc", descriptor = "I")
    private int field228 = 2048;

    @OriginalMember(owner = "client", name = "Pc", descriptor = "I")
    private int field229 = 2047;

    @OriginalMember(owner = "client", name = "Qc", descriptor = "[LOTTYZSZE;")
    private class45[] field230 = new class45[this.field228];

    @OriginalMember(owner = "client", name = "Sc", descriptor = "[I")
    public int[] field232 = new int[this.field228];

    @OriginalMember(owner = "client", name = "Uc", descriptor = "[I")
    private int[] field234 = new int[this.field228];

    @OriginalMember(owner = "client", name = "Vc", descriptor = "[LXJCNBMKS;")
    private class68[] field235 = new class68[this.field228];

    @OriginalMember(owner = "client", name = "Wc", descriptor = "[I")
    private int[] field236 = new int[9];

    @OriginalMember(owner = "client", name = "dd", descriptor = "[I")
    private int[] field243 = new int[100];

    @OriginalMember(owner = "client", name = "ed", descriptor = "[Ljava/lang/String;")
    private String[] field244 = new String[100];

    @OriginalMember(owner = "client", name = "fd", descriptor = "[Ljava/lang/String;")
    private String[] field245 = new String[100];

    @OriginalMember(owner = "client", name = "gd", descriptor = "Z")
    private boolean field246 = false;

    @OriginalMember(owner = "client", name = "od", descriptor = "I")
    private int field254 = -1;

    @OriginalMember(owner = "client", name = "pd", descriptor = "[I")
    private int[] field255 = new int[2000];

    @OriginalMember(owner = "client", name = "qd", descriptor = "I")
    private int field256 = 3;

    @OriginalMember(owner = "client", name = "wd", descriptor = "Ljava/lang/String;")
    private String field262 = "";

    @OriginalMember(owner = "client", name = "Ad", descriptor = "Z")
    private boolean field266 = false;

    @OriginalMember(owner = "client", name = "Bd", descriptor = "[B")
    private byte[] field267 = new byte[16384];

    @OriginalMember(owner = "client", name = "Cd", descriptor = "Z")
    private boolean field268 = false;

    @OriginalMember(owner = "client", name = "Ld", descriptor = "Z")
    private boolean field277 = false;

    @OriginalMember(owner = "client", name = "Nd", descriptor = "I")
    private int field279 = -1;

    @OriginalMember(owner = "client", name = "Od", descriptor = "[I")
    private int[] field280 = new int[33];

    @OriginalMember(owner = "client", name = "Pd", descriptor = "[LYGMSKJOQ;")
    private class69[] field281 = new class69[1000];

    @OriginalMember(owner = "client", name = "Rd", descriptor = "[I")
    private int[] field283 = new int[5];

    @OriginalMember(owner = "client", name = "Sd", descriptor = "[I")
    private int[] field284 = new int[500];

    @OriginalMember(owner = "client", name = "Td", descriptor = "[I")
    private int[] field285 = new int[500];

    @OriginalMember(owner = "client", name = "Ud", descriptor = "[I")
    private int[] field286 = new int[500];

    @OriginalMember(owner = "client", name = "Vd", descriptor = "[I")
    private int[] field287 = new int[500];

    @OriginalMember(owner = "client", name = "Wd", descriptor = "Ljava/lang/String;")
    private String field288 = "";

    @OriginalMember(owner = "client", name = "Zd", descriptor = "[I")
    private int[] field291 = new int[5];

    @OriginalMember(owner = "client", name = "ce", descriptor = "I")
    private int field294 = -1;

    @OriginalMember(owner = "client", name = "de", descriptor = "B")
    private byte field295 = 7;

    @OriginalMember(owner = "client", name = "fe", descriptor = "Z")
    private boolean field297 = true;

    @OriginalMember(owner = "client", name = "ge", descriptor = "Z")
    private boolean field298 = true;

    @OriginalMember(owner = "client", name = "he", descriptor = "[[I")
    private int[][] field299 = new int[104][104];

    @OriginalMember(owner = "client", name = "ie", descriptor = "Ljava/lang/String;")
    private String field300 = "";

    @OriginalMember(owner = "client", name = "je", descriptor = "Ljava/lang/String;")
    private String field301 = "";

    @OriginalMember(owner = "client", name = "ke", descriptor = "[Z")
    private boolean[] field302 = new boolean[5];

    @OriginalMember(owner = "client", name = "le", descriptor = "[J")
    private long[] field303 = new long[100];

    @OriginalMember(owner = "client", name = "ne", descriptor = "[I")
    private int[] field305 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client", name = "oe", descriptor = "I")
    private int field306 = -318;

    @OriginalMember(owner = "client", name = "pe", descriptor = "Z")
    private boolean field307 = false;

    @OriginalMember(owner = "client", name = "te", descriptor = "[I")
    private int[] field311 = new int[1000];

    @OriginalMember(owner = "client", name = "ue", descriptor = "[I")
    private int[] field312 = new int[1000];

    @OriginalMember(owner = "client", name = "xe", descriptor = "I")
    private int field315 = 284;

    @OriginalMember(owner = "client", name = "Be", descriptor = "Z")
    private boolean field319 = false;

    @OriginalMember(owner = "client", name = "Ce", descriptor = "Z")
    private boolean field320 = false;

    @OriginalMember(owner = "client", name = "Le", descriptor = "I")
    private int field329 = 1;

    @OriginalMember(owner = "client", name = "Ve", descriptor = "[I")
    private int[] field339 = new int[200];

    @OriginalMember(owner = "client", name = "ef", descriptor = "I")
    private int field348 = -1;

    @OriginalMember(owner = "client", name = "ff", descriptor = "I")
    private int field349 = -1;

    @OriginalMember(owner = "client", name = "gf", descriptor = "[I")
    private int[] field350 = new int[5];

    @OriginalMember(owner = "client", name = "hf", descriptor = "I")
    private int field351 = 3353893;

    @OriginalMember(owner = "client", name = "jf", descriptor = "Z")
    private boolean field352 = false;

    @OriginalMember(owner = "client", name = "kf", descriptor = "[LYGMSKJOQ;")
    private class69[] field353 = new class69[8];

    @OriginalMember(owner = "client", name = "lf", descriptor = "Z")
    private boolean field354 = false;

    @OriginalMember(owner = "client", name = "mf", descriptor = "LXJCNBMKS;")
    private class68 field355 = new class68((byte) 9, new byte[5000]);

    @OriginalMember(owner = "client", name = "nf", descriptor = "[LFSNLAIJY;")
    private class18[] field356 = new class18[16384];

    @OriginalMember(owner = "client", name = "pf", descriptor = "[I")
    public int[] field358 = new int[16384];

    @OriginalMember(owner = "client", name = "qf", descriptor = "B")
    private byte field359 = -119;

    @OriginalMember(owner = "client", name = "uf", descriptor = "Z")
    private volatile boolean field363 = false;

    @OriginalMember(owner = "client", name = "Ef", descriptor = "Z")
    private boolean field373 = false;

    @OriginalMember(owner = "client", name = "Ff", descriptor = "Z")
    private boolean field374 = false;

    @OriginalMember(owner = "client", name = "Hf", descriptor = "B")
    private byte field376 = 7;

    @OriginalMember(owner = "client", name = "Of", descriptor = "[I")
    private int[] field383 = new int[class35.field1057];

    @OriginalMember(owner = "client", name = "Pf", descriptor = "B")
    private byte field384 = -18;

    @OriginalMember(owner = "client", name = "Sf", descriptor = "Z")
    private boolean field387 = false;

    @OriginalMember(owner = "client", name = "Tf", descriptor = "Z")
    private boolean field388 = false;

    @OriginalMember(owner = "client", name = "bg", descriptor = "Z")
    private volatile boolean field396 = false;

    @OriginalMember(owner = "client", name = "cg", descriptor = "B")
    private byte field397 = -27;

    @OriginalMember(owner = "client", name = "dg", descriptor = "Z")
    private boolean field398 = false;

    @OriginalMember(owner = "client", name = "eg", descriptor = "I")
    private int field399 = -87;

    @OriginalMember(owner = "client", name = "gg", descriptor = "I")
    private int field401 = -1;

    @OriginalMember(owner = "client", name = "ig", descriptor = "[J")
    private long[] field403 = new long[200];

    @OriginalMember(owner = "client", name = "jg", descriptor = "[I")
    private int[] field404 = new int[50];

    @OriginalMember(owner = "client", name = "kg", descriptor = "[I")
    private int[] field405 = new int[4000];

    @OriginalMember(owner = "client", name = "lg", descriptor = "[I")
    private int[] field406 = new int[4000];

    @OriginalMember(owner = "client", name = "ng", descriptor = "Z")
    private boolean field408 = false;

    @OriginalMember(owner = "client", name = "og", descriptor = "Ljava/lang/String;")
    private String field409 = "";

    @OriginalMember(owner = "client", name = "qg", descriptor = "I")
    private int field411 = 2301979;

    @OriginalMember(owner = "client", name = "tg", descriptor = "Ljava/lang/String;")
    private String field414 = "";

    @OriginalMember(owner = "client", name = "wg", descriptor = "LEWLVMFRK;")
    private class15 field417 = new class15(field412);

    @OriginalMember(owner = "client", name = "zg", descriptor = "Z")
    private boolean field420 = false;

    @OriginalMember(owner = "client", name = "Cg", descriptor = "Z")
    private boolean field423 = true;

    @OriginalMember(owner = "client", name = "Dg", descriptor = "I")
    private int field424 = 7759444;

    @OriginalMember(owner = "client", name = "Hg", descriptor = "I")
    private int field428 = 2;

    @OriginalMember(owner = "client", name = "Lg", descriptor = "I")
    private int field432 = 2;

    @OriginalMember(owner = "client", name = "Ng", descriptor = "I")
    private int field434 = 50;

    @OriginalMember(owner = "client", name = "Og", descriptor = "[I")
    private int[] field435 = new int[this.field434];

    @OriginalMember(owner = "client", name = "Pg", descriptor = "[I")
    private int[] field436 = new int[this.field434];

    @OriginalMember(owner = "client", name = "Qg", descriptor = "[I")
    private int[] field437 = new int[this.field434];

    @OriginalMember(owner = "client", name = "Rg", descriptor = "[I")
    private int[] field438 = new int[this.field434];

    @OriginalMember(owner = "client", name = "Sg", descriptor = "[I")
    private int[] field439 = new int[this.field434];

    @OriginalMember(owner = "client", name = "Tg", descriptor = "[I")
    private int[] field440 = new int[this.field434];

    @OriginalMember(owner = "client", name = "Ug", descriptor = "[I")
    private int[] field441 = new int[this.field434];

    @OriginalMember(owner = "client", name = "Vg", descriptor = "[Ljava/lang/String;")
    private String[] field442 = new String[this.field434];

    @OriginalMember(owner = "client", name = "Wg", descriptor = "[I")
    private int[] field443 = new int[7];

    @OriginalMember(owner = "client", name = "Yg", descriptor = "Z")
    private boolean field445 = false;

    @OriginalMember(owner = "client", name = "ah", descriptor = "LXJCNBMKS;")
    private class68 field447 = class68.method522(1, -127);

    @OriginalMember(owner = "client", name = "bh", descriptor = "[LYGMSKJOQ;")
    private class69[] field448 = new class69[20];

    @OriginalMember(owner = "client", name = "ch", descriptor = "Z")
    private boolean field449 = false;

    @OriginalMember(owner = "client", name = "dh", descriptor = "Z")
    private boolean field450 = false;

    @OriginalMember(owner = "client", name = "fh", descriptor = "Z")
    public boolean field452 = false;

    @OriginalMember(owner = "client", name = "hh", descriptor = "I")
    private final int field454 = 100;

    @OriginalMember(owner = "client", name = "ih", descriptor = "[I")
    private int[] field455 = new int[100];

    @OriginalMember(owner = "client", name = "jh", descriptor = "I")
    private int field456 = 6;

    @OriginalMember(owner = "client", name = "lh", descriptor = "LEWLVMFRK;")
    private class15 field458 = new class15(field412);

    @OriginalMember(owner = "client", name = "xh", descriptor = "Ljava/lang/String;")
    private String field470 = "";

    @OriginalMember(owner = "client", name = "Gh", descriptor = "[I")
    private int[] field479 = new int[class35.field1057];

    @OriginalMember(owner = "client", name = "Hh", descriptor = "I")
    private int field480 = 5063219;

    @OriginalMember(owner = "client", name = "Jh", descriptor = "[I")
    private int[] field482 = new int[5];

    @OriginalMember(owner = "client", name = "Qh", descriptor = "[I")
    public int[] field489 = new int[1000];

    @OriginalMember(owner = "client", name = "Th", descriptor = "I")
    private int field492 = 537;

    @OriginalMember(owner = "client", name = "Uh", descriptor = "[LOVNURGUS;")
    public class46[] field493 = new class46[5];

    @OriginalMember(owner = "client", name = "Vh", descriptor = "Z")
    private boolean field494 = false;

    @OriginalMember(owner = "client", name = "Wh", descriptor = "Ljava/lang/String;")
    private String field495 = "";

    @OriginalMember(owner = "client", name = "Xh", descriptor = "Ljava/lang/String;")
    private String field496 = "";

    @OriginalMember(owner = "client", name = "Zh", descriptor = "Z")
    private boolean field498 = false;

    @OriginalMember(owner = "client", name = "li", descriptor = "[I")
    private int[] field510 = new int[5];

    @OriginalMember(owner = "client", name = "mi", descriptor = "B")
    private byte field511 = 32;

    @OriginalMember(owner = "client", name = "pi", descriptor = "I")
    private int field514 = 1;

    @OriginalMember(owner = "client", name = "yi", descriptor = "[LDEITBGVL;")
    private class9[] field523 = new class9[13];

    @OriginalMember(owner = "client", name = "zi", descriptor = "LRWLOYYVC;")
    private class53 field524 = new class53();

    @OriginalMember(owner = "client", name = "Bi", descriptor = "I")
    private int field526 = -1;

    @OriginalMember(owner = "client", name = "Oi", descriptor = "[I")
    private int[] field539 = new int[50];

    @OriginalMember(owner = "client", name = "Pi", descriptor = "Z")
    private boolean field540 = false;

    @OriginalMember(owner = "client", name = "Ti", descriptor = "I")
    private int field544 = 1;

    @OriginalMember(owner = "client", name = "Ui", descriptor = "I")
    private int field545 = 9;

    @OriginalMember(owner = "client", name = "Wi", descriptor = "I")
    private int field547 = -1;

    @OriginalMember(owner = "client", name = "Xi", descriptor = "[I")
    private final int[] field548 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client", name = "Zi", descriptor = "[I")
    private int[] field550 = new int[151];

    @OriginalMember(owner = "client", name = "aj", descriptor = "I")
    private int field551 = 6;

    @OriginalMember(owner = "client", name = "bj", descriptor = "I")
    private int field552 = -1;

    @OriginalMember(owner = "client", name = "cj", descriptor = "I")
    private int field553 = 78;

    @OriginalMember(owner = "client", name = "fj", descriptor = "LXJCNBMKS;")
    private class68 field556 = class68.method522(1, -127);

    @OriginalMember(owner = "client", name = "hj", descriptor = "LXJCNBMKS;")
    private class68 field558 = class68.method522(1, -127);

    @OriginalMember(owner = "client", name = "lj", descriptor = "Z")
    private boolean field562 = false;

    @OriginalMember(owner = "client", name = "nj", descriptor = "[I")
    private int[] field564 = new int[50];

    @OriginalMember(owner = "client", name = "tj", descriptor = "I")
    private int field570 = -1;

    @OriginalMember(owner = "client", name = "Aj", descriptor = "Z")
    private boolean field577 = false;

    @OriginalMember(owner = "client", name = "Bj", descriptor = "[I")
    private int[] field578 = new int[256];

    @OriginalMember(owner = "client", name = "Cj", descriptor = "[LDEITBGVL;")
    private class9[] field579 = new class9[100];

    @OriginalMember(owner = "client", name = "Hj", descriptor = "[I")
    public int[] field584 = new int[2000];

    @OriginalMember(owner = "client", name = "Jj", descriptor = "[LYGMSKJOQ;")
    private class69[] field586 = new class69[100];

    @OriginalMember(owner = "client", name = "Kj", descriptor = "[Ljava/lang/String;")
    private String[] field587 = new String[5];

    @OriginalMember(owner = "client", name = "Lj", descriptor = "[Z")
    private boolean[] field588 = new boolean[5];

    @OriginalMember(owner = "client", name = "X", descriptor = "[I")
    private static int[] field133 = new int[99];

    @OriginalMember(owner = "client", name = "Qb", descriptor = "B")
    private static byte field178;

    @OriginalMember(owner = "client", name = "lc", descriptor = "Ljava/math/BigInteger;")
    private static BigInteger field199;

    @OriginalMember(owner = "client", name = "rd", descriptor = "[I")
    public static int[] field257;

    @OriginalMember(owner = "client", name = "wf", descriptor = "I")
    private static int field365;

    @OriginalMember(owner = "client", name = "Af", descriptor = "I")
    private static int field369;

    @OriginalMember(owner = "client", name = "Cf", descriptor = "Z")
    private static boolean field371;

    @OriginalMember(owner = "client", name = "Rf", descriptor = "Ljava/lang/String;")
    private static String field386;

    @OriginalMember(owner = "client", name = "rg", descriptor = "Z")
    private static boolean field412;

    @OriginalMember(owner = "client", name = "Fg", descriptor = "I")
    private static int field426;

    @OriginalMember(owner = "client", name = "Zg", descriptor = "[I")
    public static final int[] field446;

    @OriginalMember(owner = "client", name = "kh", descriptor = "Ljava/math/BigInteger;")
    private static BigInteger field457;

    @OriginalMember(owner = "client", name = "ij", descriptor = "[[I")
    public static final int[][] field559;

    @OriginalMember(owner = "client", name = "L", descriptor = "I")
    private static int field121;

    @OriginalMember(owner = "client", name = "M", descriptor = "I")
    private int field122;

    @OriginalMember(owner = "client", name = "P", descriptor = "I")
    private int field125;

    @OriginalMember(owner = "client", name = "S", descriptor = "I")
    private int field128;

    @OriginalMember(owner = "client", name = "T", descriptor = "I")
    private int field129;

    @OriginalMember(owner = "client", name = "U", descriptor = "I")
    private int field130;

    @OriginalMember(owner = "client", name = "W", descriptor = "I")
    private int field132;

    @OriginalMember(owner = "client", name = "Y", descriptor = "I")
    private int field134;

    @OriginalMember(owner = "client", name = "Z", descriptor = "I")
    private static int field135;

    @OriginalMember(owner = "client", name = "ab", descriptor = "I")
    private int field136;

    @OriginalMember(owner = "client", name = "ib", descriptor = "I")
    private int field144;

    @OriginalMember(owner = "client", name = "lb", descriptor = "I")
    private int field147;

    @OriginalMember(owner = "client", name = "nb", descriptor = "I")
    private static int field149;

    @OriginalMember(owner = "client", name = "rb", descriptor = "I")
    private static int field153;

    @OriginalMember(owner = "client", name = "ub", descriptor = "I")
    private int field156;

    @OriginalMember(owner = "client", name = "vb", descriptor = "I")
    private int field157;

    @OriginalMember(owner = "client", name = "wb", descriptor = "I")
    private int field158;

    @OriginalMember(owner = "client", name = "xb", descriptor = "I")
    private static int field159;

    @OriginalMember(owner = "client", name = "yb", descriptor = "I")
    private int field160;

    @OriginalMember(owner = "client", name = "zb", descriptor = "I")
    private int field161;

    @OriginalMember(owner = "client", name = "Ab", descriptor = "I")
    private int field162;

    @OriginalMember(owner = "client", name = "Bb", descriptor = "I")
    private int field163;

    @OriginalMember(owner = "client", name = "Cb", descriptor = "I")
    private int field164;

    @OriginalMember(owner = "client", name = "Eb", descriptor = "I")
    private int field166;

    @OriginalMember(owner = "client", name = "Fb", descriptor = "I")
    private int field167;

    @OriginalMember(owner = "client", name = "Ib", descriptor = "I")
    private int field170;

    @OriginalMember(owner = "client", name = "Ob", descriptor = "I")
    private int field176;

    @OriginalMember(owner = "client", name = "Xb", descriptor = "I")
    private int field185;

    @OriginalMember(owner = "client", name = "Zb", descriptor = "I")
    private int field187;

    @OriginalMember(owner = "client", name = "ac", descriptor = "I")
    private int field188;

    @OriginalMember(owner = "client", name = "dc", descriptor = "I")
    private int field191;

    @OriginalMember(owner = "client", name = "hc", descriptor = "I")
    private int field195;

    @OriginalMember(owner = "client", name = "ic", descriptor = "I")
    private int field196;

    @OriginalMember(owner = "client", name = "rc", descriptor = "I")
    private int field205;

    @OriginalMember(owner = "client", name = "sc", descriptor = "I")
    private int field206;

    @OriginalMember(owner = "client", name = "tc", descriptor = "I")
    private int field207;

    @OriginalMember(owner = "client", name = "uc", descriptor = "I")
    private int field208;

    @OriginalMember(owner = "client", name = "xc", descriptor = "I")
    private static int field211;

    @OriginalMember(owner = "client", name = "Ac", descriptor = "I")
    private static int field214;

    @OriginalMember(owner = "client", name = "Cc", descriptor = "I")
    private int field216;

    @OriginalMember(owner = "client", name = "Ec", descriptor = "I")
    private int field218;

    @OriginalMember(owner = "client", name = "Gc", descriptor = "I")
    private int field220;

    @OriginalMember(owner = "client", name = "Hc", descriptor = "I")
    private int field221;

    @OriginalMember(owner = "client", name = "Ic", descriptor = "I")
    private int field222;

    @OriginalMember(owner = "client", name = "Jc", descriptor = "I")
    private int field223;

    @OriginalMember(owner = "client", name = "Rc", descriptor = "I")
    private int field231;

    @OriginalMember(owner = "client", name = "Tc", descriptor = "I")
    private int field233;

    @OriginalMember(owner = "client", name = "cd", descriptor = "I")
    private int field242;

    @OriginalMember(owner = "client", name = "hd", descriptor = "I")
    private int field247;

    @OriginalMember(owner = "client", name = "xd", descriptor = "I")
    private int field263;

    @OriginalMember(owner = "client", name = "yd", descriptor = "I")
    private int field264;

    @OriginalMember(owner = "client", name = "zd", descriptor = "I")
    private int field265;

    @OriginalMember(owner = "client", name = "Id", descriptor = "I")
    private int field274;

    @OriginalMember(owner = "client", name = "Jd", descriptor = "I")
    private int field275;

    @OriginalMember(owner = "client", name = "Kd", descriptor = "I")
    private int field276;

    @OriginalMember(owner = "client", name = "Md", descriptor = "I")
    private static int field278;

    @OriginalMember(owner = "client", name = "Qd", descriptor = "I")
    private int field282;

    @OriginalMember(owner = "client", name = "Yd", descriptor = "I")
    private static int field290;

    @OriginalMember(owner = "client", name = "ee", descriptor = "I")
    private int field296;

    @OriginalMember(owner = "client", name = "me", descriptor = "I")
    private int field304;

    @OriginalMember(owner = "client", name = "re", descriptor = "I")
    private int field309;

    @OriginalMember(owner = "client", name = "se", descriptor = "I")
    private int field310;

    @OriginalMember(owner = "client", name = "we", descriptor = "I")
    private static int field314;

    @OriginalMember(owner = "client", name = "ye", descriptor = "I")
    private int field316;

    @OriginalMember(owner = "client", name = "ze", descriptor = "I")
    private int field317;

    @OriginalMember(owner = "client", name = "Ee", descriptor = "I")
    private static int field322;

    @OriginalMember(owner = "client", name = "Fe", descriptor = "I")
    private int field323;

    @OriginalMember(owner = "client", name = "Ge", descriptor = "I")
    private int field324;

    @OriginalMember(owner = "client", name = "He", descriptor = "I")
    private int field325;

    @OriginalMember(owner = "client", name = "Ie", descriptor = "I")
    private int field326;

    @OriginalMember(owner = "client", name = "Je", descriptor = "I")
    private int field327;

    @OriginalMember(owner = "client", name = "Ke", descriptor = "I")
    private int field328;

    @OriginalMember(owner = "client", name = "Ye", descriptor = "I")
    private int field342;

    @OriginalMember(owner = "client", name = "Ze", descriptor = "I")
    private int field343;

    @OriginalMember(owner = "client", name = "af", descriptor = "I")
    private int field344;

    @OriginalMember(owner = "client", name = "bf", descriptor = "I")
    private int field345;

    @OriginalMember(owner = "client", name = "cf", descriptor = "I")
    private int field346;

    @OriginalMember(owner = "client", name = "of", descriptor = "I")
    private int field357;

    @OriginalMember(owner = "client", name = "rf", descriptor = "I")
    private int field360;

    @OriginalMember(owner = "client", name = "sf", descriptor = "I")
    private int field361;

    @OriginalMember(owner = "client", name = "tf", descriptor = "I")
    private int field362;

    @OriginalMember(owner = "client", name = "Bf", descriptor = "I")
    public static int field370;

    @OriginalMember(owner = "client", name = "Gf", descriptor = "I")
    private static int field375;

    @OriginalMember(owner = "client", name = "Qf", descriptor = "I")
    private int field385;

    @OriginalMember(owner = "client", name = "Vf", descriptor = "I")
    private int field390;

    @OriginalMember(owner = "client", name = "Wf", descriptor = "I")
    private int field391;

    @OriginalMember(owner = "client", name = "Xf", descriptor = "I")
    private int field392;

    @OriginalMember(owner = "client", name = "Yf", descriptor = "I")
    private int field393;

    @OriginalMember(owner = "client", name = "Zf", descriptor = "I")
    private int field394;

    @OriginalMember(owner = "client", name = "fg", descriptor = "I")
    private int field400;

    @OriginalMember(owner = "client", name = "hg", descriptor = "I")
    private static int field402;

    @OriginalMember(owner = "client", name = "mg", descriptor = "I")
    private static int field407;

    @OriginalMember(owner = "client", name = "pg", descriptor = "I")
    private int field410;

    @OriginalMember(owner = "client", name = "sg", descriptor = "I")
    private int field413;

    @OriginalMember(owner = "client", name = "xg", descriptor = "I")
    private int field418;

    @OriginalMember(owner = "client", name = "yg", descriptor = "I")
    private int field419;

    @OriginalMember(owner = "client", name = "Ag", descriptor = "I")
    public static int field421;

    @OriginalMember(owner = "client", name = "Bg", descriptor = "I")
    private int field422;

    @OriginalMember(owner = "client", name = "Eg", descriptor = "I")
    private int field425;

    @OriginalMember(owner = "client", name = "Gg", descriptor = "I")
    private int field427;

    @OriginalMember(owner = "client", name = "Ig", descriptor = "I")
    private int field429;

    @OriginalMember(owner = "client", name = "Jg", descriptor = "I")
    private int field430;

    @OriginalMember(owner = "client", name = "Kg", descriptor = "I")
    private int field431;

    @OriginalMember(owner = "client", name = "Mg", descriptor = "I")
    private int field433;

    @OriginalMember(owner = "client", name = "Xg", descriptor = "I")
    private int field444;

    @OriginalMember(owner = "client", name = "gh", descriptor = "I")
    private int field453;

    @OriginalMember(owner = "client", name = "mh", descriptor = "I")
    private int field459;

    @OriginalMember(owner = "client", name = "nh", descriptor = "I")
    private int field460;

    @OriginalMember(owner = "client", name = "oh", descriptor = "I")
    private int field461;

    @OriginalMember(owner = "client", name = "ph", descriptor = "I")
    private int field462;

    @OriginalMember(owner = "client", name = "qh", descriptor = "I")
    private int field463;

    @OriginalMember(owner = "client", name = "rh", descriptor = "I")
    private int field464;

    @OriginalMember(owner = "client", name = "sh", descriptor = "I")
    private int field465;

    @OriginalMember(owner = "client", name = "th", descriptor = "I")
    private int field466;

    @OriginalMember(owner = "client", name = "uh", descriptor = "I")
    private int field467;

    @OriginalMember(owner = "client", name = "vh", descriptor = "I")
    private int field468;

    @OriginalMember(owner = "client", name = "wh", descriptor = "I")
    public static int field469;

    @OriginalMember(owner = "client", name = "zh", descriptor = "I")
    private int field472;

    @OriginalMember(owner = "client", name = "Ah", descriptor = "I")
    public int field473;

    @OriginalMember(owner = "client", name = "Bh", descriptor = "I")
    private static int field474;

    @OriginalMember(owner = "client", name = "Ch", descriptor = "I")
    private int field475;

    @OriginalMember(owner = "client", name = "Kh", descriptor = "I")
    private int field483;

    @OriginalMember(owner = "client", name = "Lh", descriptor = "I")
    private int field484;

    @OriginalMember(owner = "client", name = "Mh", descriptor = "I")
    private int field485;

    @OriginalMember(owner = "client", name = "Nh", descriptor = "I")
    private int field486;

    @OriginalMember(owner = "client", name = "Oh", descriptor = "I")
    private int field487;

    @OriginalMember(owner = "client", name = "Ph", descriptor = "I")
    private int field488;

    @OriginalMember(owner = "client", name = "Sh", descriptor = "I")
    private int field491;

    @OriginalMember(owner = "client", name = "Yh", descriptor = "I")
    private int field497;

    @OriginalMember(owner = "client", name = "ai", descriptor = "I")
    private int field499;

    @OriginalMember(owner = "client", name = "bi", descriptor = "I")
    private int field500;

    @OriginalMember(owner = "client", name = "ci", descriptor = "I")
    private int field501;

    @OriginalMember(owner = "client", name = "di", descriptor = "I")
    private int field502;

    @OriginalMember(owner = "client", name = "ei", descriptor = "I")
    private int field503;

    @OriginalMember(owner = "client", name = "fi", descriptor = "I")
    private int field504;

    @OriginalMember(owner = "client", name = "gi", descriptor = "I")
    private int field505;

    @OriginalMember(owner = "client", name = "hi", descriptor = "I")
    private int field506;

    @OriginalMember(owner = "client", name = "ii", descriptor = "I")
    private int field507;

    @OriginalMember(owner = "client", name = "ji", descriptor = "I")
    private int field508;

    @OriginalMember(owner = "client", name = "ki", descriptor = "I")
    private int field509;

    @OriginalMember(owner = "client", name = "ni", descriptor = "I")
    private int field512;

    @OriginalMember(owner = "client", name = "ri", descriptor = "I")
    private int field516;

    @OriginalMember(owner = "client", name = "si", descriptor = "I")
    private int field517;

    @OriginalMember(owner = "client", name = "ti", descriptor = "I")
    private int field518;

    @OriginalMember(owner = "client", name = "ui", descriptor = "I")
    private int field519;

    @OriginalMember(owner = "client", name = "vi", descriptor = "I")
    private int field520;

    @OriginalMember(owner = "client", name = "xi", descriptor = "I")
    private static int field522;

    @OriginalMember(owner = "client", name = "Ai", descriptor = "I")
    private int field525;

    @OriginalMember(owner = "client", name = "Ci", descriptor = "I")
    private int field527;

    @OriginalMember(owner = "client", name = "Mi", descriptor = "I")
    private static int field537;

    @OriginalMember(owner = "client", name = "Ni", descriptor = "I")
    private int field538;

    @OriginalMember(owner = "client", name = "Qi", descriptor = "I")
    private int field541;

    @OriginalMember(owner = "client", name = "Ri", descriptor = "I")
    private static int field542;

    @OriginalMember(owner = "client", name = "Si", descriptor = "I")
    private int field543;

    @OriginalMember(owner = "client", name = "Vi", descriptor = "I")
    private int field546;

    @OriginalMember(owner = "client", name = "Yi", descriptor = "I")
    private int field549;

    @OriginalMember(owner = "client", name = "ej", descriptor = "I")
    private int field555;

    @OriginalMember(owner = "client", name = "gj", descriptor = "I")
    private int field557;

    @OriginalMember(owner = "client", name = "jj", descriptor = "I")
    public int field560;

    @OriginalMember(owner = "client", name = "kj", descriptor = "I")
    public int field561;

    @OriginalMember(owner = "client", name = "uj", descriptor = "I")
    private int field571;

    @OriginalMember(owner = "client", name = "vj", descriptor = "I")
    private int field572;

    @OriginalMember(owner = "client", name = "wj", descriptor = "I")
    private int field573;

    @OriginalMember(owner = "client", name = "Fj", descriptor = "I")
    private int field582;

    @OriginalMember(owner = "client", name = "Gj", descriptor = "I")
    private int field583;

    @OriginalMember(owner = "client", name = "Mj", descriptor = "I")
    private int field589;

    @OriginalMember(owner = "client", name = "Nj", descriptor = "I")
    private int field590;

    @OriginalMember(owner = "client", name = "Oj", descriptor = "I")
    private int field591;

    @OriginalMember(owner = "client", name = "Pj", descriptor = "I")
    private int field592;

    @OriginalMember(owner = "client", name = "Qj", descriptor = "I")
    public static int field593;

    @OriginalMember(owner = "client", name = "De", descriptor = "J")
    private long field321;

    @OriginalMember(owner = "client", name = "Uf", descriptor = "J")
    private long field389;

    @OriginalMember(owner = "client", name = "Ih", descriptor = "J")
    private long field481;

    @OriginalMember(owner = "client", name = "oi", descriptor = "J")
    public long field513;

    @OriginalMember(owner = "client", name = "mj", descriptor = "J")
    private long field563;

    @OriginalMember(owner = "client", name = "vc", descriptor = "LEUCYOSVT;")
    private class14 field209;

    @OriginalMember(owner = "client", name = "ae", descriptor = "LJUGCSXVJ;")
    public class26 field292;

    @OriginalMember(owner = "client", name = "Nc", descriptor = "LKALHRUDX;")
    private class28 field227;

    @OriginalMember(owner = "client", name = "Lc", descriptor = "LADZBQDSQ;")
    private class2 field225;

    @OriginalMember(owner = "client", name = "ve", descriptor = "LOTTYZSZE;")
    public static class45 field313;

    @OriginalMember(owner = "client", name = "Rh", descriptor = "LQKFGLETG;")
    private class50 field490;

    @OriginalMember(owner = "client", name = "vf", descriptor = "LSDLNXGIT;")
    private class57 field364;

    @OriginalMember(owner = "client", name = "eb", descriptor = "LUMCYZJWP;")
    private class60 field140;

    @OriginalMember(owner = "client", name = "fb", descriptor = "LUMCYZJWP;")
    private class60 field141;

    @OriginalMember(owner = "client", name = "gb", descriptor = "LUMCYZJWP;")
    private class60 field142;

    @OriginalMember(owner = "client", name = "hb", descriptor = "LUMCYZJWP;")
    private class60 field143;

    @OriginalMember(owner = "client", name = "jb", descriptor = "LYGMSKJOQ;")
    private class69 field145;

    @OriginalMember(owner = "client", name = "kb", descriptor = "LYGMSKJOQ;")
    private class69 field146;

    @OriginalMember(owner = "client", name = "nd", descriptor = "LYGMSKJOQ;")
    private class69 field253;

    @OriginalMember(owner = "client", name = "sd", descriptor = "LYGMSKJOQ;")
    private class69 field258;

    @OriginalMember(owner = "client", name = "td", descriptor = "LYGMSKJOQ;")
    private class69 field259;

    @OriginalMember(owner = "client", name = "Dd", descriptor = "LYGMSKJOQ;")
    private class69 field269;

    @OriginalMember(owner = "client", name = "Ed", descriptor = "LYGMSKJOQ;")
    private class69 field270;

    @OriginalMember(owner = "client", name = "Fd", descriptor = "LYGMSKJOQ;")
    private class69 field271;

    @OriginalMember(owner = "client", name = "Gd", descriptor = "LYGMSKJOQ;")
    private class69 field272;

    @OriginalMember(owner = "client", name = "Hd", descriptor = "LYGMSKJOQ;")
    private class69 field273;

    @OriginalMember(owner = "client", name = "be", descriptor = "LYGMSKJOQ;")
    private class69 field293;

    @OriginalMember(owner = "client", name = "Ae", descriptor = "LYGMSKJOQ;")
    private class69 field318;

    @OriginalMember(owner = "client", name = "Mf", descriptor = "LYGMSKJOQ;")
    private class69 field381;

    @OriginalMember(owner = "client", name = "Nf", descriptor = "LYGMSKJOQ;")
    private class69 field382;

    @OriginalMember(owner = "client", name = "Rb", descriptor = "LYQSLUNUN;")
    private class71 field179;

    @OriginalMember(owner = "client", name = "Sb", descriptor = "LYQSLUNUN;")
    private class71 field180;

    @OriginalMember(owner = "client", name = "Tb", descriptor = "LYQSLUNUN;")
    private class71 field181;

    @OriginalMember(owner = "client", name = "Me", descriptor = "LYQSLUNUN;")
    private class71 field330;

    @OriginalMember(owner = "client", name = "Ne", descriptor = "LYQSLUNUN;")
    private class71 field331;

    @OriginalMember(owner = "client", name = "Oe", descriptor = "LYQSLUNUN;")
    private class71 field332;

    @OriginalMember(owner = "client", name = "Pe", descriptor = "LYQSLUNUN;")
    private class71 field333;

    @OriginalMember(owner = "client", name = "Qe", descriptor = "LYQSLUNUN;")
    private class71 field334;

    @OriginalMember(owner = "client", name = "Re", descriptor = "LYQSLUNUN;")
    private class71 field335;

    @OriginalMember(owner = "client", name = "Se", descriptor = "LYQSLUNUN;")
    private class71 field336;

    @OriginalMember(owner = "client", name = "Te", descriptor = "LYQSLUNUN;")
    private class71 field337;

    @OriginalMember(owner = "client", name = "Ue", descriptor = "LYQSLUNUN;")
    private class71 field338;

    @OriginalMember(owner = "client", name = "If", descriptor = "LYQSLUNUN;")
    private class71 field377;

    @OriginalMember(owner = "client", name = "Jf", descriptor = "LYQSLUNUN;")
    private class71 field378;

    @OriginalMember(owner = "client", name = "Kf", descriptor = "LYQSLUNUN;")
    private class71 field379;

    @OriginalMember(owner = "client", name = "Lf", descriptor = "LYQSLUNUN;")
    private class71 field380;

    @OriginalMember(owner = "client", name = "Di", descriptor = "LYQSLUNUN;")
    private class71 field528;

    @OriginalMember(owner = "client", name = "Ei", descriptor = "LYQSLUNUN;")
    private class71 field529;

    @OriginalMember(owner = "client", name = "Fi", descriptor = "LYQSLUNUN;")
    private class71 field530;

    @OriginalMember(owner = "client", name = "Gi", descriptor = "LYQSLUNUN;")
    private class71 field531;

    @OriginalMember(owner = "client", name = "Hi", descriptor = "LYQSLUNUN;")
    private class71 field532;

    @OriginalMember(owner = "client", name = "Ii", descriptor = "LYQSLUNUN;")
    private class71 field533;

    @OriginalMember(owner = "client", name = "Ji", descriptor = "LYQSLUNUN;")
    private class71 field534;

    @OriginalMember(owner = "client", name = "Ki", descriptor = "LYQSLUNUN;")
    private class71 field535;

    @OriginalMember(owner = "client", name = "Li", descriptor = "LYQSLUNUN;")
    private class71 field536;

    @OriginalMember(owner = "client", name = "Xc", descriptor = "LDEITBGVL;")
    private class9 field237;

    @OriginalMember(owner = "client", name = "Yc", descriptor = "LDEITBGVL;")
    private class9 field238;

    @OriginalMember(owner = "client", name = "Zc", descriptor = "LDEITBGVL;")
    private class9 field239;

    @OriginalMember(owner = "client", name = "ad", descriptor = "LDEITBGVL;")
    private class9 field240;

    @OriginalMember(owner = "client", name = "bd", descriptor = "LDEITBGVL;")
    private class9 field241;

    @OriginalMember(owner = "client", name = "We", descriptor = "LDEITBGVL;")
    private class9 field340;

    @OriginalMember(owner = "client", name = "Xe", descriptor = "LDEITBGVL;")
    private class9 field341;

    @OriginalMember(owner = "client", name = "Dh", descriptor = "LDEITBGVL;")
    private class9 field476;

    @OriginalMember(owner = "client", name = "Eh", descriptor = "LDEITBGVL;")
    private class9 field477;

    @OriginalMember(owner = "client", name = "Fh", descriptor = "LDEITBGVL;")
    private class9 field478;

    @OriginalMember(owner = "client", name = "oj", descriptor = "LDEITBGVL;")
    private class9 field565;

    @OriginalMember(owner = "client", name = "pj", descriptor = "LDEITBGVL;")
    private class9 field566;

    @OriginalMember(owner = "client", name = "qj", descriptor = "LDEITBGVL;")
    private class9 field567;

    @OriginalMember(owner = "client", name = "rj", descriptor = "LDEITBGVL;")
    private class9 field568;

    @OriginalMember(owner = "client", name = "sj", descriptor = "LDEITBGVL;")
    private class9 field569;

    @OriginalMember(owner = "client", name = "xj", descriptor = "LDEITBGVL;")
    private class9 field574;

    @OriginalMember(owner = "client", name = "yj", descriptor = "LDEITBGVL;")
    private class9 field575;

    @OriginalMember(owner = "client", name = "zj", descriptor = "LDEITBGVL;")
    private class9 field576;

    @OriginalMember(owner = "client", name = "Dj", descriptor = "LDEITBGVL;")
    private class9 field580;

    @OriginalMember(owner = "client", name = "Ej", descriptor = "LDEITBGVL;")
    private class9 field581;

    @OriginalMember(owner = "client", name = "Vb", descriptor = "Ljava/lang/String;")
    private String field183;

    @OriginalMember(owner = "client", name = "ag", descriptor = "Ljava/lang/String;")
    public String field395;

    @OriginalMember(owner = "client", name = "wi", descriptor = "Ljava/lang/String;")
    public String field521;

    @OriginalMember(owner = "client", name = "Ij", descriptor = "Ljava/lang/String;")
    private String field585;

    @OriginalMember(owner = "client", name = "dj", descriptor = "Ljava/net/Socket;")
    private Socket field554;

    @OriginalMember(owner = "client", name = "ec", descriptor = "Z")
    private static boolean field192;

    @OriginalMember(owner = "client", name = "md", descriptor = "Z")
    public static boolean field252;

    @OriginalMember(owner = "client", name = "qe", descriptor = "Z")
    private static boolean field308;

    @OriginalMember(owner = "client", name = "Df", descriptor = "Z")
    private static boolean field372;

    @OriginalMember(owner = "client", name = "eh", descriptor = "Z")
    public static boolean field451;

    @OriginalMember(owner = "client", name = "Kb", descriptor = "[I")
    private int[] field172;

    @OriginalMember(owner = "client", name = "Lb", descriptor = "[I")
    private int[] field173;

    @OriginalMember(owner = "client", name = "Mb", descriptor = "[I")
    private int[] field174;

    @OriginalMember(owner = "client", name = "id", descriptor = "[I")
    private int[] field248;

    @OriginalMember(owner = "client", name = "jd", descriptor = "[I")
    private int[] field249;

    @OriginalMember(owner = "client", name = "kd", descriptor = "[I")
    private int[] field250;

    @OriginalMember(owner = "client", name = "ld", descriptor = "[I")
    private int[] field251;

    @OriginalMember(owner = "client", name = "ud", descriptor = "[I")
    private int[] field260;

    @OriginalMember(owner = "client", name = "vd", descriptor = "[I")
    private int[] field261;

    @OriginalMember(owner = "client", name = "xf", descriptor = "[I")
    private int[] field366;

    @OriginalMember(owner = "client", name = "yf", descriptor = "[I")
    private int[] field367;

    @OriginalMember(owner = "client", name = "zf", descriptor = "[I")
    private int[] field368;

    @OriginalMember(owner = "client", name = "ug", descriptor = "[I")
    private int[] field415;

    @OriginalMember(owner = "client", name = "vg", descriptor = "[I")
    private int[] field416;

    @OriginalMember(owner = "client", name = "yh", descriptor = "[LDEITBGVL;")
    private class9[] field471;

    @OriginalMember(owner = "client", name = "gc", descriptor = "[[B")
    private byte[][] field194;

    @OriginalMember(owner = "client", name = "Xd", descriptor = "[[B")
    private byte[][] field289;

    @OriginalMember(owner = "client", name = "qi", descriptor = "[[[B")
    private byte[][][] field515;

    @OriginalMember(owner = "client", name = "df", descriptor = "[[[I")
    private int[][][] field347;

    @OriginalMember(owner = "client", name = "b", descriptor = "(I)V")
    public final void method19(int arg0) {
        class58.field1470.method299();
        class58.field1463.method299();
        class37.field1101.method299();
        class5.field84.method299();
        class5.field90.method299();
        class45.field1192.method299();
        if (arg0 != -39695) {
            field308 = !field308;
        }
        class66.field1617.method299();
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(I)V")
    public final void method20(int arg0) {
        short var2 = 256;
        if (arg0 <= 0) {
            field412 = !field412;
        }
        for (int var3 = 10; var3 < 117; ++var3) {
            int var18 = (int) (Math.random() * 100.0D);
            if (var18 < 50) {
                this.field415[(var2 - 2 << 7) + var3] = 255;
            }
        }
        for (int var4 = 0; var4 < 100; ++var4) {
            int var15 = (int) (Math.random() * 124.0D) + 2;
            int var16 = (int) (Math.random() * 128.0D) + 128;
            int var17 = (var16 << 7) + var15;
            this.field415[var17] = 192;
        }
        for (int var5 = 1; var5 < var2 - 1; ++var5) {
            for (int var13 = 1; var13 < 127; ++var13) {
                int var14 = (var5 << 7) + var13;
                this.field416[var14] = (this.field415[var14 - 1] + this.field415[var14 + 1] + this.field415[var14 - 128] + this.field415[var14 + 128]) / 4;
            }
        }
        this.field282 += 128;
        if (this.field282 > this.field260.length) {
            this.field282 -= this.field260.length;
            int var6 = (int) (Math.random() * 12.0D);
            this.method153(0, this.field471[var6]);
        }
        for (int var7 = 1; var7 < var2 - 1; ++var7) {
            for (int var10 = 1; var10 < 127; ++var10) {
                int var11 = (var7 << 7) + var10;
                int var12 = this.field416[var11 + 128] - this.field260[this.field282 + var11 & this.field260.length - 1] / 5;
                if (var12 < 0) {
                    var12 = 0;
                }
                this.field415[var11] = var12;
            }
        }
        for (int var8 = 0; var8 < var2 - 1; ++var8) {
            this.field578[var8] = this.field578[var8 + 1];
        }
        this.field578[var2 - 1] = (int) (Math.sin((double) field421 / 14.0D) * 16.0D + Math.sin((double) field421 / 15.0D) * 14.0D + Math.sin((double) field421 / 16.0D) * 12.0D);
        if (this.field572 > 0) {
            this.field572 -= 4;
        }
        if (this.field573 > 0) {
            this.field573 -= 4;
        }
        if (this.field572 == 0 && this.field573 == 0) {
            int var9 = (int) (Math.random() * 2000.0D);
            if (var9 == 0) {
                this.field572 = 1024;
            }
            if (var9 == 1) {
                this.field573 = 1024;
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(I)V")
    public final void method21(int arg0) {
        int var2 = 85 / arg0;
        this.field433 = 0;
        for (int var3 = -1; var3 < this.field357 + this.field231; ++var3) {
            class70 var20;
            if (var3 == -1) {
                var20 = field313;
            } else if (var3 < this.field231) {
                var20 = this.field230[this.field232[var3]];
            } else {
                var20 = this.field356[this.field358[var3 - this.field231]];
            }
            if (var20 != null && var20.method245(6)) {
                if (var20 instanceof class18) {
                    class37 var21 = ((class18) var20).field722;
                    if (var21.field1082 != null) {
                        var21 = var21.method364(-670);
                    }
                    if (var21 == null) {
                        continue;
                    }
                }
                if (var3 >= this.field231) {
                    class37 var25 = ((class18) var20).field722;
                    if (var25.field1106 >= 0 && var25.field1106 < this.field448.length) {
                        this.method66((byte) 45, var20, var20.field1707 + 15);
                        if (this.field348 > -1) {
                            this.field448[var25.field1106].method576(this.field349 - 30, this.field348 - 12, (byte) 35);
                        }
                    }
                    if (this.field418 == 1 && this.field358[var3 - this.field231] == this.field132 && field421 % 20 < 10) {
                        this.method66((byte) 45, var20, var20.field1707 + 15);
                        if (this.field348 > -1) {
                            this.field448[2].method576(this.field349 - 28, this.field348 - 12, (byte) 35);
                        }
                    }
                } else {
                    int var22 = 30;
                    class45 var23 = (class45) var20;
                    if (var23.field1204 != 0) {
                        this.method66((byte) 45, var20, var20.field1707 + 15);
                        if (this.field348 > -1) {
                            for (int var24 = 0; var24 < 8; ++var24) {
                                if ((var23.field1204 & 1 << var24) != 0) {
                                    this.field448[var24].method576(this.field349 - var22, this.field348 - 12, (byte) 35);
                                    var22 -= 25;
                                }
                            }
                        }
                    }
                    if (var3 >= 0 && this.field418 == 10 && this.field232[var3] == this.field208) {
                        this.method66((byte) 45, var20, var20.field1707 + 15);
                        if (this.field348 > -1) {
                            this.field448[7].method576(this.field349 - var22, this.field348 - 12, (byte) 35);
                        }
                    }
                }
                if (var20.field1709 != null && (var3 >= this.field231 || this.field527 == 0 || this.field527 == 3 || this.field527 == 1 && this.method68(46314, ((class45) var20).field1193))) {
                    this.method66((byte) 45, var20, var20.field1707);
                    if (this.field348 > -1 && this.field433 < this.field434) {
                        this.field438[this.field433] = this.field142.method469(0, var20.field1709) / 2;
                        this.field437[this.field433] = this.field142.field1503;
                        this.field435[this.field433] = this.field348;
                        this.field436[this.field433] = this.field349;
                        this.field439[this.field433] = var20.field1680;
                        this.field440[this.field433] = var20.field1689;
                        this.field441[this.field433] = var20.field1690;
                        this.field442[this.field433++] = var20.field1709;
                        if (this.field296 == 0 && var20.field1689 >= 1 && var20.field1689 <= 3) {
                            this.field437[this.field433] += 10;
                            this.field436[this.field433] += 5;
                        }
                        if (this.field296 == 0 && var20.field1689 == 4) {
                            this.field438[this.field433] = 60;
                        }
                        if (this.field296 == 0 && var20.field1689 == 5) {
                            this.field437[this.field433] += 5;
                        }
                    }
                }
                if (var20.field1669 > field421) {
                    this.method66((byte) 45, var20, var20.field1707 + 15);
                    if (this.field348 > -1) {
                        int var26 = var20.field1670 * 30 / var20.field1671;
                        if (var26 > 30) {
                            var26 = 30;
                        }
                        class22.method284(this.field348 - 15, this.field349 - 3, 65280, var26, 47782, 5);
                        class22.method284(this.field348 - 15 + var26, this.field349 - 3, 16711680, 30 - var26, 47782, 5);
                    }
                }
                for (int var27 = 0; var27 < 4; ++var27) {
                    if (var20.field1719[var27] > field421) {
                        this.method66((byte) 45, var20, var20.field1707 / 2);
                        if (this.field348 > -1) {
                            if (var27 == 1) {
                                this.field349 -= 20;
                            }
                            if (var27 == 2) {
                                this.field348 -= 15;
                                this.field349 -= 10;
                            }
                            if (var27 == 3) {
                                this.field348 += 15;
                                this.field349 -= 10;
                            }
                            this.field201[var20.field1718[var27]].method576(this.field349 - 12, this.field348 - 12, (byte) 35);
                            this.field140.method466(this.field349 + 4, String.valueOf(var20.field1717[var27]), 0, this.field348, 5);
                            this.field140.method466(this.field349 + 3, String.valueOf(var20.field1717[var27]), 16777215, this.field348 - 1, 5);
                        }
                    }
                }
            }
        }
        ++field474;
        if (field474 > 78) {
            field474 = 0;
            this.field447.method523(204, 0);
        }
        for (int var4 = 0; var4 < this.field433; ++var4) {
            int var5 = this.field435[var4];
            int var6 = this.field436[var4];
            int var7 = this.field438[var4];
            int var8 = this.field437[var4];
            boolean var9 = true;
            while (var9) {
                var9 = false;
                for (int var19 = 0; var19 < var4; ++var19) {
                    if (var6 + 2 > this.field436[var19] - this.field437[var19] && var6 - var8 < this.field436[var19] + 2 && var5 - var7 < this.field438[var19] + this.field435[var19] && var5 + var7 > this.field435[var19] - this.field438[var19] && this.field436[var19] - this.field437[var19] < var6) {
                        var6 = this.field436[var19] - this.field437[var19];
                        var9 = true;
                    }
                }
            }
            this.field348 = this.field435[var4];
            this.field349 = this.field436[var4] = var6;
            String var10 = this.field442[var4];
            if (this.field296 == 0) {
                int var11 = 16776960;
                if (this.field439[var4] < 6) {
                    var11 = this.field305[this.field439[var4]];
                }
                if (this.field439[var4] == 6) {
                    var11 = this.field475 % 20 < 10 ? 16711680 : 16776960;
                }
                if (this.field439[var4] == 7) {
                    var11 = this.field475 % 20 < 10 ? 255 : 65535;
                }
                if (this.field439[var4] == 8) {
                    var11 = this.field475 % 20 < 10 ? 45056 : 8454016;
                }
                if (this.field439[var4] == 9) {
                    int var12 = 150 - this.field441[var4];
                    if (var12 < 50) {
                        var11 = var12 * 1280 + 16711680;
                    } else if (var12 < 100) {
                        var11 = 16776960 - (var12 - 50) * 327680;
                    } else if (var12 < 150) {
                        var11 = (var12 - 100) * 5 + 65280;
                    }
                }
                if (this.field439[var4] == 10) {
                    int var13 = 150 - this.field441[var4];
                    if (var13 < 50) {
                        var11 = var13 * 5 + 16711680;
                    } else if (var13 < 100) {
                        var11 = 16711935 - (var13 - 50) * 327680;
                    } else if (var13 < 150) {
                        var11 = (var13 - 100) * 327680 + 255 - (var13 - 100) * 5;
                    }
                }
                if (this.field439[var4] == 11) {
                    int var14 = 150 - this.field441[var4];
                    if (var14 < 50) {
                        var11 = 16777215 - var14 * 327685;
                    } else if (var14 < 100) {
                        var11 = (var14 - 50) * 327685 + 65280;
                    } else if (var14 < 150) {
                        var11 = 16777215 - (var14 - 100) * 327680;
                    }
                }
                if (this.field440[var4] == 0) {
                    this.field142.method466(this.field349 + 1, var10, 0, this.field348, 5);
                    this.field142.method466(this.field349, var10, var11, this.field348, 5);
                }
                if (this.field440[var4] == 1) {
                    this.field142.method471(0, var10, this.field475, this.field348, this.field349 + 1, 524);
                    this.field142.method471(var11, var10, this.field475, this.field348, this.field349, 524);
                }
                if (this.field440[var4] == 2) {
                    this.field142.method472(var10, this.field349 + 1, this.field348, this.field475, 0, 0);
                    this.field142.method472(var10, this.field349, this.field348, this.field475, var11, 0);
                }
                if (this.field440[var4] == 3) {
                    this.field142.method473(this.field348, 150 - this.field441[var4], this.field475, 5, 0, var10, this.field349 + 1);
                    this.field142.method473(this.field348, 150 - this.field441[var4], this.field475, 5, var11, var10, this.field349);
                }
                if (this.field440[var4] == 4) {
                    int var15 = this.field142.method469(0, var10);
                    int var16 = (150 - this.field441[var4]) * (var15 + 100) / 150;
                    class22.method281(true, this.field348 - 50, 0, this.field348 + 50, 334);
                    this.field142.method470(this.field348 + 50 - var16, var10, 0, this.field349 + 1, 1);
                    this.field142.method470(this.field348 + 50 - var16, var10, var11, this.field349, 1);
                    class22.method280(-378);
                }
                if (this.field440[var4] == 5) {
                    int var17 = 150 - this.field441[var4];
                    int var18 = 0;
                    if (var17 < 25) {
                        var18 = var17 - 25;
                    } else if (var17 > 125) {
                        var18 = var17 - 125;
                    }
                    class22.method281(true, 0, this.field349 - this.field142.field1503 - 1, 512, this.field349 + 5);
                    this.field142.method466(this.field349 + 1 + var18, var10, 0, this.field348, 5);
                    this.field142.method466(this.field349 + var18, var10, var11, this.field348, 5);
                    class22.method280(-378);
                }
            } else {
                this.field142.method466(this.field349 + 1, var10, 0, this.field348, 5);
                this.field142.method466(this.field349, var10, 16776960, this.field348, 5);
            }
        }
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(B)V")
    public final void method22(byte arg0) {
        if (this.field330 == null) {
            super.field1520 = null;
            this.field380 = null;
            this.field378 = null;
            this.field377 = null;
            this.field379 = null;
            this.field179 = null;
            if (arg0 != 6) {
                this.field343 = -1;
            }
            this.field180 = null;
            this.field181 = null;
            this.field333 = new class71(265, this.method28((byte) 7), 128, (byte) 1);
            class22.method282(this.field189);
            this.field334 = new class71(265, this.method28((byte) 7), 128, (byte) 1);
            class22.method282(this.field189);
            this.field330 = new class71(171, this.method28((byte) 7), 509, (byte) 1);
            class22.method282(this.field189);
            this.field331 = new class71(132, this.method28((byte) 7), 360, (byte) 1);
            class22.method282(this.field189);
            this.field332 = new class71(200, this.method28((byte) 7), 360, (byte) 1);
            class22.method282(this.field189);
            this.field335 = new class71(238, this.method28((byte) 7), 202, (byte) 1);
            class22.method282(this.field189);
            this.field336 = new class71(238, this.method28((byte) 7), 203, (byte) 1);
            class22.method282(this.field189);
            this.field337 = new class71(94, this.method28((byte) 7), 74, (byte) 1);
            class22.method282(this.field189);
            this.field338 = new class71(94, this.method28((byte) 7), 75, (byte) 1);
            class22.method282(this.field189);
            if (this.field490 != null) {
                this.method42((byte) -121);
                this.method70((byte) -78);
            }
            this.field420 = true;
        }
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(I)V")
    public final void method23(int arg0) {
        if (this.field380 == null) {
            this.method55((byte) 74);
            super.field1520 = null;
            this.field330 = null;
            this.field331 = null;
            this.field332 = null;
            this.field333 = null;
            this.field334 = null;
            this.field335 = null;
            this.field336 = null;
            this.field337 = null;
            this.field338 = null;
            this.field380 = new class71(96, this.method28((byte) 7), 479, (byte) 1);
            this.field378 = new class71(156, this.method28((byte) 7), 172, (byte) 1);
            class22.method282(this.field189);
            this.field575.method166(0, 0, (byte) 35);
            this.field377 = new class71(261, this.method28((byte) 7), 190, (byte) 1);
            this.field379 = new class71(334, this.method28((byte) 7), 512, (byte) 1);
            class22.method282(this.field189);
            this.field179 = new class71(50, this.method28((byte) 7), 496, (byte) 1);
            this.field342 += arg0;
            this.field180 = new class71(37, this.method28((byte) 7), 269, (byte) 1);
            this.field181 = new class71(45, this.method28((byte) 7), 249, (byte) 1);
            this.field420 = true;
        }
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(I)V")
    public final void method24(int arg0) {
        if (arg0 != 1) {
            this.field447.method524(114);
        }
        for (class25 var2 = (class25) this.field417.method201(); var2 != null; var2 = (class25) this.field417.method203((byte) 3)) {
            if (this.field144 == var2.field879 && !var2.field883) {
                if (field421 >= var2.field873) {
                    var2.method300(this.field304, -17619);
                    if (var2.field883) {
                        var2.method396();
                    } else {
                        this.field227.method317(0, var2.field879, var2.field880, 0, var2.field881, 60, var2.field882, -1, var2, false);
                    }
                }
            } else {
                var2.method396();
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(II)Z")
    public final boolean method25(int arg0, int arg1) {
        if (arg1 != 0) {
            this.field343 = -1;
        }
        if (arg0 < 0) {
            return false;
        } else {
            int var3 = this.field286[arg0];
            if (var3 >= 2000) {
                var3 -= 2000;
            }
            return var3 == 554;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;I)V")
    public final void method26(int arg0, String arg1, String arg2, int arg3) {
        if (arg3 == 0 && this.field552 != -1) {
            this.field585 = arg1;
            super.field1533 = 0;
        }
        if (this.field254 == -1) {
            this.field498 = true;
        }
        for (int var5 = 99; var5 > 0; --var5) {
            this.field243[var5] = this.field243[var5 - 1];
            this.field244[var5] = this.field244[var5 - 1];
            this.field245[var5] = this.field245[var5 - 1];
        }
        if (arg0 == 0) {
            this.field243[0] = arg3;
            this.field244[0] = arg2;
            this.field245[0] = arg1;
        }
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(I)V")
    public void method27(int arg0) {
        System.out.println("============");
        if (arg0 != 0) {
            this.method46();
        }
        System.out.println("flame-cycle:" + this.field541);
        if (this.field364 != null) {
            System.out.println("Od-cycle:" + this.field364.field1430);
        }
        System.out.println("loop-cycle:" + field421);
        System.out.println("draw-cycle:" + field469);
        System.out.println("ptype:" + this.field343);
        System.out.println("psize:" + this.field342);
        if (this.field209 != null) {
            this.field209.method197(0);
        }
        super.field1516 = true;
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(B)Ljava/awt/Component;")
    public final Component method28(byte arg0) {
        if (arg0 == 7) {
            boolean var2 = false;
        } else {
            this.method46();
        }
        if (signlink.mainapp != null) {
            return signlink.mainapp;
        } else {
            return super.field1522 != null ? super.field1522 : this;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LRWLOYYVC;IZIZIIII)V")
    public final void method29(class53 arg0, int arg1, boolean arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg2) {
            this.field343 = -1;
        }
        if (this.field193) {
            this.field360 = 32;
        } else {
            this.field360 = 0;
        }
        this.field193 = false;
        if (arg8 >= arg1 && arg8 < arg1 + 16 && arg5 >= arg3 && arg5 < arg3 + 16) {
            arg0.field1287 -= this.field517 * 4;
            if (arg4) {
                this.field354 = true;
                return;
            }
        } else if (arg8 >= arg1 && arg8 < arg1 + 16 && arg5 >= arg3 + arg6 - 16 && arg5 < arg3 + arg6) {
            arg0.field1287 += this.field517 * 4;
            if (arg4) {
                this.field354 = true;
                return;
            }
        } else {
            if (arg8 < arg1 - this.field360 || arg8 >= arg1 + 16 + this.field360 || arg5 < arg3 + 16 || arg5 >= arg3 + arg6 - 16 || this.field517 <= 0) {
                return;
            }
            int var10 = (arg6 - 32) * arg6 / arg7;
            if (var10 < 8) {
                var10 = 8;
            }
            int var11 = arg5 - arg3 - 16 - var10 / 2;
            int var12 = arg6 - 32 - var10;
            arg0.field1287 = (arg7 - arg6) * var11 / var12;
            if (arg4) {
                this.field354 = true;
            }
            this.field193 = true;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IILXJCNBMKS;)V")
    private final void method30(int arg0, int arg1, class68 arg2) {
        arg2.method544((byte) 7);
        if (arg0 != 20585) {
            this.method46();
        }
        int var4 = arg2.method545(true, 1);
        if (var4 != 0) {
            int var5 = arg2.method545(true, 2);
            if (var5 == 0) {
                this.field234[this.field233++] = this.field229;
            } else if (var5 == 1) {
                int var6 = arg2.method545(true, 3);
                field313.method584((byte) 9, false, var6);
                int var7 = arg2.method545(true, 1);
                if (var7 == 1) {
                    this.field234[this.field233++] = this.field229;
                }
            } else if (var5 == 2) {
                int var8 = arg2.method545(true, 3);
                field313.method584((byte) 9, true, var8);
                int var9 = arg2.method545(true, 3);
                field313.method584((byte) 9, true, var9);
                int var10 = arg2.method545(true, 1);
                if (var10 == 1) {
                    this.field234[this.field233++] = this.field229;
                }
            } else if (var5 == 3) {
                int var11 = arg2.method545(true, 7);
                int var12 = arg2.method545(true, 7);
                this.field144 = arg2.method545(true, 2);
                int var13 = arg2.method545(true, 1);
                if (var13 == 1) {
                    this.field234[this.field233++] = this.field229;
                }
                int var14 = arg2.method545(true, 1);
                field313.method585(2, var11, var12, var14 == 1);
            }
        }
    }

    @OriginalMember(owner = "client", name = "h", descriptor = "(I)V")
    public final void method31(int arg0) {
        int var2 = 5;
        this.field236[8] = 0;
        this.field342 += arg0;
        int var3 = 0;
        while (this.field236[8] == 0) {
            String var4 = "Unknown problem";
            this.method107(20, false, "Connecting to web server");
            try {
                DataInputStream var5 = this.method137("crc" + (int) (Math.random() * 9.9999999E7D) + "-" + 321);
                class68 var6 = new class68((byte) 9, new byte[40]);
                var5.readFully(var6.field1642, 0, 40);
                var5.close();
                for (int var7 = 0; var7 < 9; ++var7) {
                    this.field236[var7] = var6.method539();
                }
                int var8 = var6.method539();
                int var9 = 1234;
                for (int var10 = 0; var10 < 9; ++var10) {
                    var9 = (var9 << 1) + this.field236[var10];
                }
                if (var8 != var9) {
                    var4 = "checksum problem";
                    this.field236[8] = 0;
                }
            } catch (EOFException var13) {
                var4 = "EOF problem";
                this.field236[8] = 0;
            } catch (IOException var14) {
                var4 = "connection problem";
                this.field236[8] = 0;
            } catch (Exception var15) {
                var4 = "logic problem";
                this.field236[8] = 0;
                if (!signlink.reporterror) {
                    return;
                }
            }
            if (this.field236[8] == 0) {
                ++var3;
                for (int var11 = var2; var11 > 0; --var11) {
                    if (var3 >= 10) {
                        this.method107(10, false, "Game updated - please reload page");
                        var11 = 10;
                    } else {
                        this.method107(10, false, var4 + " - Will retry in " + var11 + " secs.");
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
                this.field450 = !this.field450;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILXJCNBMKS;I)V")
    private final void method32(int arg0, class68 arg1, int arg2) {
        this.field488 = 0;
        this.field233 = 0;
        if (arg0 == 4289) {
            this.method61(arg2, (byte) -27, arg1);
            this.method108(arg1, false, arg2);
            this.method104(arg1, arg2, false);
            for (int var4 = 0; var4 < this.field488; ++var4) {
                int var6 = this.field489[var4];
                if (field421 != this.field356[var6].field1681) {
                    this.field356[var6].field722 = null;
                    this.field356[var6] = null;
                }
            }
            if (arg1.field1643 != arg2) {
                signlink.reporterror(this.field300 + " size mismatch in getnpcpos - pos:" + arg1.field1643 + " psize:" + arg2);
                throw new RuntimeException("eek");
            } else {
                for (int var5 = 0; var5 < this.field357; ++var5) {
                    if (this.field356[this.field358[var5]] == null) {
                        signlink.reporterror(this.field300 + " null entry in npc list - pos:" + var5 + " size:" + this.field357);
                        throw new RuntimeException("eek");
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(Z)V")
    public final void method33(boolean arg0) {
        if (arg0) {
            this.field343 = -1;
        }
        this.field184 = true;
        try {
            long var2 = System.currentTimeMillis();
            int var4 = 0;
            int var5 = 20;
            while (this.field363) {
                ++this.field541;
                this.method20(17);
                this.method20(17);
                this.method94(false);
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
        this.field184 = false;
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(B)V")
    public final void method34(byte arg0) {
        if (arg0 == 1) {
            boolean var2 = false;
            if (this.field491 == 0) {
                if (super.field1533 == 1) {
                    int var3 = super.field1534 - 25 - 550;
                    int var4 = super.field1535 - 5 - 4;
                    if (var3 >= 0 && var4 >= 0 && var3 < 146 && var4 < 151) {
                        var3 -= 73;
                        var4 -= 75;
                        int var5 = this.field205 + this.field147 & 2047;
                        int var6 = class12.field639[var5];
                        int var7 = class12.field640[var5];
                        int var8 = (this.field328 + 256) * var6 >> 8;
                        int var9 = (this.field328 + 256) * var7 >> 8;
                        int var10 = var3 * var9 + var4 * var8 >> 11;
                        int var11 = var4 * var9 - var3 * var8 >> 11;
                        int var12 = field313.field1721 + var10 >> 7;
                        int var13 = field313.field1722 - var11 >> 7;
                        boolean var14 = this.method82(0, 0, 0, 1, 0, field313.field1696[0], var12, true, field313.field1697[0], var13, 0, 0);
                        if (var14) {
                            this.field447.method524(var3);
                            this.field447.method524(var4);
                            this.field447.method525(this.field205);
                            this.field447.method524(57);
                            this.field447.method524(this.field147);
                            this.field447.method524(this.field328);
                            this.field447.method524(89);
                            this.field447.method525(field313.field1721);
                            this.field447.method525(field313.field1722);
                            this.field447.method524(this.field167);
                            this.field447.method524(63);
                            return;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "i", descriptor = "(I)Ljava/lang/String;")
    public final String method35(int arg0) {
        if (arg0 <= 0) {
            this.field203 = 334;
        }
        if (signlink.mainapp != null) {
            return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
        } else {
            return super.field1522 != null ? "runescape.com" : super.getDocumentBase().getHost().toLowerCase();
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;)V")
    private final void method36(String arg0) {
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

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZJ)V")
    public final void method37(boolean arg0, long arg1) {
        if (arg1 != 0L) {
            if (this.field429 >= 100) {
                this.method26(0, "Your ignore list is full. Max of 100 hit", "", 0);
            } else {
                String var4 = class62.method490(false, class62.method487(arg1, (byte) 7));
                for (int var5 = 0; var5 < this.field429; ++var5) {
                    if (this.field303[var5] == arg1) {
                        this.method26(0, var4 + " is already on your ignore list", "", 0);
                        return;
                    }
                }
                for (int var6 = 0; var6 < this.field128; ++var6) {
                    if (this.field403[var6] == arg1) {
                        this.method26(0, "Please remove " + var4 + " from your friend list first", "", 0);
                        return;
                    }
                }
                this.field303[this.field429++] = arg1;
                this.field354 = true;
                this.field447.method523(155, 0);
                this.field447.method530(155, arg1);
                this.field452 &= arg0;
            }
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(Z)V")
    public final void method38(boolean arg0) {
        if (arg0) {
            this.field447.method524(41);
        }
        for (int var2 = 0; var2 < this.field549; ++var2) {
            if (this.field564[var2] <= 0) {
                boolean var3 = false;
                try {
                    if (this.field404[var2] == this.field294 && this.field539[var2] == this.field547) {
                        if (!this.method138(this.field274)) {
                            var3 = true;
                        }
                    } else {
                        class68 var4 = class23.method292(0, this.field404[var2], this.field539[var2]);
                        if (System.currentTimeMillis() + (long) (var4.field1643 / 22) > (long) (this.field557 / 22) + this.field481) {
                            this.field557 = var4.field1643;
                            this.field481 = System.currentTimeMillis();
                            if (this.method49(var4.field1642, -30532, var4.field1643)) {
                                this.field294 = this.field404[var2];
                                this.field547 = this.field539[var2];
                            } else {
                                var3 = true;
                            }
                        }
                    }
                } catch (Exception var7) {
                }
                if (var3 && this.field564[var2] != -5) {
                    this.field564[var2] = -5;
                } else {
                    --this.field549;
                    for (int var6 = var2; var6 < this.field549; ++var6) {
                        this.field404[var6] = this.field404[var6 + 1];
                        this.field539[var6] = this.field539[var6 + 1];
                        this.field564[var6] = this.field564[var6 + 1];
                    }
                    --var2;
                }
            } else {
                int var10002 = this.field564[var2]--;
            }
        }
        if (this.field538 > 0) {
            this.field538 -= 20;
            if (this.field538 < 0) {
                this.field538 = 0;
            }
            if (this.field538 == 0 && this.field182 && !field372) {
                this.field422 = this.field570;
                this.field423 = true;
                this.field364.method430(2, this.field422);
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZI)V")
    public final void method39(boolean arg0, int arg1) {
        int var3 = 71 / arg1;
        for (int var4 = 0; var4 < this.field357; ++var4) {
            class18 var5 = this.field356[this.field358[var4]];
            int var6 = (this.field358[var4] << 14) + 536870912;
            if (var5 != null && var5.method245(6) && var5.field722.field1076 == arg0) {
                int var7 = var5.field1721 >> 7;
                int var8 = var5.field1722 >> 7;
                if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                    if (var5.field1712 == 1 && (var5.field1721 & 127) == 64 && (var5.field1722 & 127) == 64) {
                        if (this.field175[var7][var8] == this.field475) {
                            continue;
                        }
                        this.field175[var7][var8] = this.field475;
                    }
                    if (!var5.field722.field1095) {
                        var6 += Integer.MIN_VALUE;
                    }
                    this.field227.method317(var5.field1723, this.field144, var5.field1721, 0, var5.field1722, (var5.field1712 - 1) * 64 + 60, this.method91(0, var5.field1722, this.field144, var5.field1721), var6, var5, var5.field1703);
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
                if (super.field1522 != null) {
                    return new URL("http://127.0.0.1:" + (field370 + 80));
                }
            } catch (Exception var1) {
            }
            return super.getCodeBase();
        }
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(Z)V")
    public final void method40(boolean arg0) {
        this.field452 &= arg0;
        if (this.field325 == 0) {
            int var2 = super.field1533;
            if (this.field518 == 1 && super.field1534 >= 516 && super.field1535 >= 160 && super.field1534 <= 765 && super.field1535 <= 205) {
                var2 = 0;
            }
            if (this.field320) {
                if (var2 != 1) {
                    int var3 = super.field1527;
                    int var4 = super.field1528;
                    if (this.field460 == 0) {
                        var3 -= 4;
                        var4 -= 4;
                    }
                    if (this.field460 == 1) {
                        var3 -= 553;
                        var4 -= 205;
                    }
                    if (this.field460 == 2) {
                        var3 -= 17;
                        var4 -= 357;
                    }
                    if (var3 < this.field461 - 10 || var3 > this.field463 + this.field461 + 10 || var4 < this.field462 - 10 || var4 > this.field464 + this.field462 + 10) {
                        this.field320 = false;
                        if (this.field460 == 1) {
                            this.field354 = true;
                        }
                        if (this.field460 == 2) {
                            this.field498 = true;
                        }
                    }
                }
                if (var2 == 1) {
                    int var5 = this.field461;
                    int var6 = this.field462;
                    int var7 = this.field463;
                    int var8 = super.field1534;
                    int var9 = super.field1535;
                    if (this.field460 == 0) {
                        var8 -= 4;
                        var9 -= 4;
                    }
                    if (this.field460 == 1) {
                        var8 -= 553;
                        var9 -= 205;
                    }
                    if (this.field460 == 2) {
                        var8 -= 17;
                        var9 -= 357;
                    }
                    int var10 = -1;
                    for (int var11 = 0; var11 < this.field122; ++var11) {
                        int var12 = (this.field122 - 1 - var11) * 15 + var6 + 31;
                        if (var8 > var5 && var8 < var5 + var7 && var9 > var12 - 13 && var9 < var12 + 3) {
                            var10 = var11;
                        }
                    }
                    if (var10 != -1) {
                        this.method128(var10, 0);
                    }
                    this.field320 = false;
                    if (this.field460 == 1) {
                        this.field354 = true;
                    }
                    if (this.field460 == 2) {
                        this.field498 = true;
                        return;
                    }
                }
            } else {
                if (var2 == 1 && this.field122 > 0) {
                    int var13 = this.field286[this.field122 - 1];
                    if (var13 == 883 || var13 == 997 || var13 == 67 || var13 == 186 || var13 == 966 || var13 == 99 || var13 == 111 || var13 == 308 || var13 == 442 || var13 == 2 || var13 == 756 || var13 == 1298) {
                        int var14 = this.field284[this.field122 - 1];
                        int var15 = this.field285[this.field122 - 1];
                        class53 var16 = class53.field1309[var15];
                        if (var16.field1288 || var16.field1293) {
                            this.field307 = false;
                            this.field196 = 0;
                            this.field323 = var15;
                            this.field324 = var14;
                            this.field325 = 2;
                            this.field326 = super.field1534;
                            this.field327 = super.field1535;
                            if (class53.field1309[var15].field1298 == this.field279) {
                                this.field325 = 1;
                            }
                            if (class53.field1309[var15].field1298 == this.field254) {
                                this.field325 = 3;
                            }
                            return;
                        }
                    }
                }
                if (var2 == 1 && (this.field546 == 1 || this.method25(this.field122 - 1, 0)) && this.field122 > 2) {
                    var2 = 2;
                }
                if (var2 == 1 && this.field122 > 0) {
                    this.method128(this.field122 - 1, 0);
                }
                if (var2 != 2 || this.field122 <= 0) {
                    return;
                }
                this.method45(true);
            }
        }
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(Z)V")
    public final void method41(boolean arg0) {
        this.field378.method588(823);
        if (this.field491 == 2) {
            byte[] var2 = this.field575.field607;
            int[] var3 = class22.field840;
            int var4 = var2.length;
            for (int var5 = 0; var5 < var4; ++var5) {
                if (var2[var5] == 0) {
                    var3[var5] = 0;
                }
            }
            this.field293.method580(25, this.field171, 256, 34359, 0, 0, 25, this.field280, this.field205, 33, 33);
            this.field379.method588(823);
        } else {
            int var6 = this.field205 + this.field147 & 2047;
            int var7 = field313.field1721 / 32 + 48;
            if (!arg0) {
                this.method46();
            }
            int var8 = 464 - field313.field1722 / 32;
            this.field318.method580(var8, this.field550, this.field328 + 256, 34359, 5, 25, var7, this.field165, var6, 151, 146);
            this.field293.method580(25, this.field171, 256, 34359, 0, 0, 25, this.field280, this.field205, 33, 33);
            for (int var9 = 0; var9 < this.field310; ++var9) {
                int var39 = this.field311[var9] * 4 + 2 - field313.field1721 / 32;
                int var40 = this.field312[var9] * 4 + 2 - field313.field1722 / 32;
                this.method130(var40, var39, this.field281[var9], -302);
            }
            for (int var10 = 0; var10 < 104; ++var10) {
                for (int var35 = 0; var35 < 104; ++var35) {
                    class15 var36 = this.field124[this.field144][var10][var35];
                    if (var36 != null) {
                        int var37 = var10 * 4 + 2 - field313.field1721 / 32;
                        int var38 = var35 * 4 + 2 - field313.field1722 / 32;
                        this.method130(var38, var37, this.field269, -302);
                    }
                }
            }
            for (int var11 = 0; var11 < this.field357; ++var11) {
                class18 var31 = this.field356[this.field358[var11]];
                if (var31 != null && var31.method245(6)) {
                    class37 var32 = var31.field722;
                    if (var32.field1082 != null) {
                        var32 = var32.method364(-670);
                    }
                    if (var32 != null && var32.field1071 && var32.field1095) {
                        int var33 = var31.field1721 / 32 - field313.field1721 / 32;
                        int var34 = var31.field1722 / 32 - field313.field1722 / 32;
                        this.method130(var34, var33, this.field270, -302);
                    }
                }
            }
            for (int var12 = 0; var12 < this.field231; ++var12) {
                class45 var23 = this.field230[this.field232[var12]];
                if (var23 != null && var23.method245(6)) {
                    int var24 = var23.field1721 / 32 - field313.field1721 / 32;
                    int var25 = var23.field1722 / 32 - field313.field1722 / 32;
                    boolean var26 = false;
                    long var27 = class62.method486(var23.field1193);
                    for (int var29 = 0; var29 < this.field128; ++var29) {
                        if (this.field403[var29] == var27 && this.field339[var29] != 0) {
                            var26 = true;
                            break;
                        }
                    }
                    boolean var30 = false;
                    if (field313.field1185 != 0 && var23.field1185 != 0 && field313.field1185 == var23.field1185) {
                        var30 = true;
                    }
                    if (var26) {
                        this.method130(var25, var24, this.field272, -302);
                    } else if (var30) {
                        this.method130(var25, var24, this.field273, -302);
                    } else {
                        this.method130(var25, var24, this.field271, -302);
                    }
                }
            }
            if (this.field418 != 0 && field421 % 20 < 10) {
                if (this.field418 == 1 && this.field132 >= 0 && this.field132 < this.field356.length) {
                    class18 var13 = this.field356[this.field132];
                    if (var13 != null) {
                        int var14 = var13.field1721 / 32 - field313.field1721 / 32;
                        int var15 = var13.field1722 / 32 - field313.field1722 / 32;
                        this.method43(this.field210, this.field259, var15, var14);
                    }
                }
                if (this.field418 == 2) {
                    int var16 = (this.field499 - this.field220) * 4 + 2 - field313.field1721 / 32;
                    int var17 = (this.field500 - this.field221) * 4 + 2 - field313.field1722 / 32;
                    this.method43(this.field210, this.field259, var17, var16);
                }
                if (this.field418 == 10 && this.field208 >= 0 && this.field208 < this.field230.length) {
                    class45 var18 = this.field230[this.field208];
                    if (var18 != null) {
                        int var19 = var18.field1721 / 32 - field313.field1721 / 32;
                        int var20 = var18.field1722 / 32 - field313.field1722 / 32;
                        this.method43(this.field210, this.field259, var20, var19);
                    }
                }
            }
            if (this.field316 != 0) {
                int var21 = this.field316 * 4 + 2 - field313.field1721 / 32;
                int var22 = this.field317 * 4 + 2 - field313.field1722 / 32;
                this.method130(var22, var21, this.field258, -302);
            }
            class22.method284(97, 78, 16777215, 3, 47782, 3);
            this.field379.method588(823);
        }
    }

    @OriginalMember(owner = "client", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        return signlink.mainapp != null ? signlink.mainapp.getParameter(arg0) : super.getParameter(arg0);
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(B)V")
    public final void method42(byte arg0) {
        byte[] var2 = this.field490.method402("title.dat", (byte[]) null);
        class69 var3 = new class69(var2, this);
        this.field333.method588(823);
        var3.method574((byte) 82, 0, 0);
        this.field334.method588(823);
        var3.method574((byte) 82, -637, 0);
        this.field330.method588(823);
        var3.method574((byte) 82, -128, 0);
        this.field331.method588(823);
        var3.method574((byte) 82, -202, -371);
        this.field332.method588(823);
        var3.method574((byte) 82, -202, -171);
        this.field335.method588(823);
        var3.method574((byte) 82, 0, -265);
        this.field336.method588(823);
        var3.method574((byte) 82, -562, -265);
        if (arg0 != -121) {
            this.field562 = !this.field562;
        }
        this.field337.method588(823);
        var3.method574((byte) 82, -128, -171);
        this.field338.method588(823);
        var3.method574((byte) 82, -562, -171);
        int[] var4 = new int[var3.field1663];
        for (int var5 = 0; var5 < var3.field1664; ++var5) {
            for (int var10 = 0; var10 < var3.field1663; ++var10) {
                var4[var10] = var3.field1662[var3.field1663 * var5 + (var3.field1663 - var10 - 1)];
            }
            for (int var11 = 0; var11 < var3.field1663; ++var11) {
                var3.field1662[var3.field1663 * var5 + var11] = var4[var11];
            }
        }
        this.field333.method588(823);
        var3.method574((byte) 82, 382, 0);
        this.field334.method588(823);
        var3.method574((byte) 82, -255, 0);
        this.field330.method588(823);
        var3.method574((byte) 82, 254, 0);
        this.field331.method588(823);
        var3.method574((byte) 82, 180, -371);
        this.field332.method588(823);
        var3.method574((byte) 82, 180, -171);
        this.field335.method588(823);
        var3.method574((byte) 82, 382, -265);
        this.field336.method588(823);
        var3.method574((byte) 82, -180, -265);
        this.field337.method588(823);
        var3.method574((byte) 82, 254, -171);
        this.field338.method588(823);
        var3.method574((byte) 82, -180, -171);
        class69 var6 = new class69(this.field490, "logo", 0);
        this.field330.method588(823);
        var6.method576(18, 382 - var6.field1663 / 2 - 128, (byte) 35);
        Object var7 = null;
        Object var8 = null;
        Object var9 = null;
        System.gc();
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILYGMSKJOQ;II)V")
    public final void method43(int arg0, class69 arg1, int arg2, int arg3) {
        int var5 = arg2 * arg2 + arg3 * arg3;
        int var6 = 21 / arg0;
        if (var5 > 4225 && var5 < 90000) {
            int var7 = this.field205 + this.field147 & 2047;
            int var8 = class19.field796[var7];
            int var9 = class19.field797[var7];
            int var10 = var8 * 256 / (this.field328 + 256);
            int var11 = var9 * 256 / (this.field328 + 256);
            int var12 = arg2 * var10 + arg3 * var11 >> 16;
            int var13 = arg2 * var11 - arg3 * var10 >> 16;
            double var14 = Math.atan2((double) var12, (double) var13);
            int var16 = (int) (Math.sin(var14) * 63.0D);
            int var17 = (int) (Math.cos(var14) * 57.0D);
            this.field253.method581(15, var14, 20, 20, var16 + 94 + 4 - 10, (byte) 7, 83 - var17 - 20, 15, 256);
        } else {
            this.method130(arg2, arg3, arg1, -302);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LRWLOYYVC;ZIIIII)V")
    public final void method44(class53 arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0.field1330 == 0 && arg0.field1302 != null && !arg0.field1272) {
            if (arg2 >= arg5 && arg4 >= arg6 && arg2 <= arg0.field1316 + arg5 && arg4 <= arg0.field1307 + arg6) {
                int var8 = arg0.field1302.length;
                if (arg1) {
                    this.field138 = !this.field138;
                }
                for (int var9 = 0; var9 < var8; ++var9) {
                    int var10 = arg0.field1294[var9] + arg5;
                    int var11 = arg0.field1268[var9] + arg6 - arg3;
                    class53 var12 = class53.field1309[arg0.field1302[var9]];
                    int var13 = var12.field1306 + var10;
                    int var14 = var12.field1304 + var11;
                    if ((var12.field1303 >= 0 || var12.field1292 != 0) && arg2 >= var13 && arg4 >= var14 && arg2 < var12.field1316 + var13 && arg4 < var12.field1307 + var14) {
                        if (var12.field1303 >= 0) {
                            this.field136 = var12.field1303;
                        } else {
                            this.field136 = var12.field1319;
                        }
                    }
                    if (var12.field1330 == 0) {
                        this.method44(var12, this.field374, arg2, var12.field1287, arg4, var13, var14);
                        if (var12.field1312 > var12.field1307) {
                            this.method29(var12, var12.field1316 + var13, false, var14, true, arg4, var12.field1307, var12.field1312, arg2);
                        }
                    } else {
                        if (var12.field1324 == 1 && arg2 >= var13 && arg4 >= var14 && arg2 < var12.field1316 + var13 && arg4 < var12.field1307 + var14) {
                            boolean var15 = false;
                            if (var12.field1317 != 0) {
                                var15 = this.method74(false, var12);
                            }
                            if (!var15) {
                                this.field131[this.field122] = var12.field1286;
                                this.field286[this.field122] = 539;
                                this.field285[this.field122] = var12.field1319;
                                ++this.field122;
                            }
                        }
                        if (var12.field1324 == 2 && this.field518 == 0 && arg2 >= var13 && arg4 >= var14 && arg2 < var12.field1316 + var13 && arg4 < var12.field1307 + var14) {
                            String var16 = var12.field1278;
                            if (var16.indexOf(" ") != -1) {
                                var16 = var16.substring(0, var16.indexOf(" "));
                            }
                            this.field131[this.field122] = var16 + " @gre@" + var12.field1315;
                            this.field286[this.field122] = 6;
                            this.field285[this.field122] = var12.field1319;
                            ++this.field122;
                        }
                        if (var12.field1324 == 3 && arg2 >= var13 && arg4 >= var14 && arg2 < var12.field1316 + var13 && arg4 < var12.field1307 + var14) {
                            this.field131[this.field122] = "Close";
                            this.field286[this.field122] = 210;
                            this.field285[this.field122] = var12.field1319;
                            ++this.field122;
                        }
                        if (var12.field1324 == 4 && arg2 >= var13 && arg4 >= var14 && arg2 < var12.field1316 + var13 && arg4 < var12.field1307 + var14) {
                            this.field131[this.field122] = var12.field1286;
                            this.field286[this.field122] = 522;
                            this.field285[this.field122] = var12.field1319;
                            ++this.field122;
                        }
                        if (var12.field1324 == 5 && arg2 >= var13 && arg4 >= var14 && arg2 < var12.field1316 + var13 && arg4 < var12.field1307 + var14) {
                            this.field131[this.field122] = var12.field1286;
                            this.field286[this.field122] = 565;
                            this.field285[this.field122] = var12.field1319;
                            ++this.field122;
                        }
                        if (var12.field1324 == 6 && !this.field398 && arg2 >= var13 && arg4 >= var14 && arg2 < var12.field1316 + var13 && arg4 < var12.field1307 + var14) {
                            this.field131[this.field122] = var12.field1286;
                            this.field286[this.field122] = 551;
                            this.field285[this.field122] = var12.field1319;
                            ++this.field122;
                        }
                        if (var12.field1330 == 2) {
                            int var17 = 0;
                            for (int var18 = 0; var18 < var12.field1307; ++var18) {
                                for (int var19 = 0; var19 < var12.field1316; ++var19) {
                                    int var20 = (var12.field1290 + 32) * var19 + var13;
                                    int var21 = (var12.field1310 + 32) * var18 + var14;
                                    if (var17 < 20) {
                                        var20 += var12.field1276[var17];
                                        var21 += var12.field1282[var17];
                                    }
                                    if (arg2 >= var20 && arg4 >= var21 && arg2 < var20 + 32 && arg4 < var21 + 32) {
                                        this.field582 = var17;
                                        this.field583 = var12.field1319;
                                        if (var12.field1327[var17] > 0) {
                                            class5 var22 = class5.method13(var12.field1327[var17] - 1);
                                            if (this.field391 == 1 && var12.field1305) {
                                                if (this.field393 != var12.field1319 || this.field392 != var17) {
                                                    this.field131[this.field122] = "Use " + this.field395 + " with @lre@" + var22.field51;
                                                    this.field286[this.field122] = 373;
                                                    this.field287[this.field122] = var22.field89;
                                                    this.field284[this.field122] = var17;
                                                    this.field285[this.field122] = var12.field1319;
                                                    ++this.field122;
                                                }
                                            } else if (this.field518 == 1 && var12.field1305) {
                                                if ((this.field520 & 16) == 16) {
                                                    this.field131[this.field122] = this.field521 + " @lre@" + var22.field51;
                                                    this.field286[this.field122] = 162;
                                                    this.field287[this.field122] = var22.field89;
                                                    this.field284[this.field122] = var17;
                                                    this.field285[this.field122] = var12.field1319;
                                                    ++this.field122;
                                                }
                                            } else {
                                                if (var12.field1305) {
                                                    for (int var23 = 4; var23 >= 3; --var23) {
                                                        if (var22.field91 != null && var22.field91[var23] != null) {
                                                            this.field131[this.field122] = var22.field91[var23] + " @lre@" + var22.field51;
                                                            if (var23 == 3) {
                                                                this.field286[this.field122] = 442;
                                                            }
                                                            if (var23 == 4) {
                                                                this.field286[this.field122] = 2;
                                                            }
                                                            this.field287[this.field122] = var22.field89;
                                                            this.field284[this.field122] = var17;
                                                            this.field285[this.field122] = var12.field1319;
                                                            ++this.field122;
                                                        } else if (var23 == 4) {
                                                            this.field131[this.field122] = "Drop @lre@" + var22.field51;
                                                            this.field286[this.field122] = 2;
                                                            this.field287[this.field122] = var22.field89;
                                                            this.field284[this.field122] = var17;
                                                            this.field285[this.field122] = var12.field1319;
                                                            ++this.field122;
                                                        }
                                                    }
                                                }
                                                if (var12.field1265) {
                                                    this.field131[this.field122] = "Use @lre@" + var22.field51;
                                                    this.field286[this.field122] = 756;
                                                    this.field287[this.field122] = var22.field89;
                                                    this.field284[this.field122] = var17;
                                                    this.field285[this.field122] = var12.field1319;
                                                    ++this.field122;
                                                }
                                                if (var12.field1305 && var22.field91 != null) {
                                                    for (int var24 = 2; var24 >= 0; --var24) {
                                                        if (var22.field91[var24] != null) {
                                                            this.field131[this.field122] = var22.field91[var24] + " @lre@" + var22.field51;
                                                            if (var24 == 0) {
                                                                this.field286[this.field122] = 99;
                                                            }
                                                            if (var24 == 1) {
                                                                this.field286[this.field122] = 111;
                                                            }
                                                            if (var24 == 2) {
                                                                this.field286[this.field122] = 308;
                                                            }
                                                            this.field287[this.field122] = var22.field89;
                                                            this.field284[this.field122] = var17;
                                                            this.field285[this.field122] = var12.field1319;
                                                            ++this.field122;
                                                        }
                                                    }
                                                }
                                                if (var12.field1323 != null) {
                                                    for (int var25 = 4; var25 >= 0; --var25) {
                                                        if (var12.field1323[var25] != null) {
                                                            this.field131[this.field122] = var12.field1323[var25] + " @lre@" + var22.field51;
                                                            if (var25 == 0) {
                                                                this.field286[this.field122] = 883;
                                                            }
                                                            if (var25 == 1) {
                                                                this.field286[this.field122] = 997;
                                                            }
                                                            if (var25 == 2) {
                                                                this.field286[this.field122] = 67;
                                                            }
                                                            if (var25 == 3) {
                                                                this.field286[this.field122] = 186;
                                                            }
                                                            if (var25 == 4) {
                                                                this.field286[this.field122] = 966;
                                                            }
                                                            this.field287[this.field122] = var22.field89;
                                                            this.field284[this.field122] = var17;
                                                            this.field285[this.field122] = var12.field1319;
                                                            ++this.field122;
                                                        }
                                                    }
                                                }
                                                this.field131[this.field122] = "Examine @lre@" + var22.field51;
                                                this.field286[this.field122] = 1298;
                                                this.field287[this.field122] = var22.field89;
                                                this.field284[this.field122] = var17;
                                                this.field285[this.field122] = var12.field1319;
                                                ++this.field122;
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

    @OriginalMember(owner = "client", name = "g", descriptor = "(Z)V")
    public final void method45(boolean arg0) {
        int var2 = this.field142.method468("Choose Option", (byte) 12);
        if (!arg0) {
            for (int var3 = 1; var3 > 0; ++var3) {
            }
        }
        for (int var4 = 0; var4 < this.field122; ++var4) {
            int var12 = this.field142.method468(this.field131[var4], (byte) 12);
            if (var12 > var2) {
                var2 = var12;
            }
        }
        var2 += 8;
        int var5 = this.field122 * 15 + 21;
        if (super.field1534 > 4 && super.field1535 > 4 && super.field1534 < 516 && super.field1535 < 338) {
            int var6 = super.field1534 - 4 - var2 / 2;
            if (var2 + var6 > 512) {
                var6 = 512 - var2;
            }
            if (var6 < 0) {
                var6 = 0;
            }
            int var7 = super.field1535 - 4;
            if (var5 + var7 > 334) {
                var7 = 334 - var5;
            }
            if (var7 < 0) {
                var7 = 0;
            }
            this.field320 = true;
            this.field460 = 0;
            this.field461 = var6;
            this.field462 = var7;
            this.field463 = var2;
            this.field464 = this.field122 * 15 + 22;
        }
        if (super.field1534 > 553 && super.field1535 > 205 && super.field1534 < 743 && super.field1535 < 466) {
            int var8 = super.field1534 - 553 - var2 / 2;
            if (var8 < 0) {
                var8 = 0;
            } else if (var2 + var8 > 190) {
                var8 = 190 - var2;
            }
            int var9 = super.field1535 - 205;
            if (var9 < 0) {
                var9 = 0;
            } else if (var5 + var9 > 261) {
                var9 = 261 - var5;
            }
            this.field320 = true;
            this.field460 = 1;
            this.field461 = var8;
            this.field462 = var9;
            this.field463 = var2;
            this.field464 = this.field122 * 15 + 22;
        }
        if (super.field1534 > 17 && super.field1535 > 357 && super.field1534 < 496 && super.field1535 < 453) {
            int var10 = super.field1534 - 17 - var2 / 2;
            if (var10 < 0) {
                var10 = 0;
            } else if (var2 + var10 > 479) {
                var10 = 479 - var2;
            }
            int var11 = super.field1535 - 357;
            if (var11 < 0) {
                var11 = 0;
            } else if (var5 + var11 > 96) {
                var11 = 96 - var5;
            }
            this.field320 = true;
            this.field460 = 2;
            this.field461 = var10;
            this.field462 = var11;
            this.field463 = var2;
            this.field464 = this.field122 * 15 + 22;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "()V")
    public final void method46() {
        this.method107(20, false, "Starting up");
        if (signlink.sunjava) {
            super.field1513 = 5;
        }
        if (field192) {
            this.field319 = true;
        } else {
            field192 = true;
            boolean var1 = false;
            String var2 = this.method35(750);
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
                this.field408 = true;
            } else {
                if (signlink.cache_dat != null) {
                    for (int var3 = 0; var3 < 5; ++var3) {
                        this.field493[var3] = new class46(field290, signlink.cache_idx[var3], signlink.cache_dat, var3 + 1, 500000);
                    }
                }
                try {
                    this.method31(0);
                    this.field490 = this.method83(0, "title", 1, 25, "title screen", this.field236[1]);
                    this.field140 = new class60("p11_full", false, -525, this.field490);
                    this.field141 = new class60("p12_full", false, -525, this.field490);
                    this.field142 = new class60("b12_full", false, -525, this.field490);
                    this.field143 = new class60("q8_full", true, -525, this.field490);
                    this.method42((byte) -121);
                    this.method70((byte) -78);
                    class50 var4 = this.method83(0, "config", 2, 30, "config", this.field236[2]);
                    class50 var5 = this.method83(0, "interface", 3, 35, "interface", this.field236[3]);
                    class50 var6 = this.method83(0, "media", 4, 40, "2d graphics", this.field236[4]);
                    class50 var7 = this.method83(0, "textures", 6, 45, "textures", this.field236[6]);
                    class50 var8 = this.method83(0, "wordenc", 7, 50, "chat system", this.field236[7]);
                    class50 var9 = this.method83(0, "sounds", 8, 55, "sound effects", this.field236[8]);
                    this.field515 = new byte[4][104][104];
                    this.field347 = new int[4][105][105];
                    this.field227 = new class28((byte) 6, 4, 104, this.field347, 104);
                    for (int var10 = 0; var10 < 4; ++var10) {
                        this.field139[var10] = new class43(104, (byte) 4, 104);
                    }
                    this.field318 = new class69(512, 512);
                    class50 var11 = this.method83(0, "versionlist", 5, 60, "update list", this.field236[5]);
                    this.method107(60, false, "Connecting to update server");
                    this.field364 = new class57();
                    this.field364.method448(var11, this);
                    class55.method424(this.field364.method433(43313));
                    class19.method247(this.field364.method429(0, 631), this.field364);
                    if (!field372) {
                        this.field422 = 0;
                        try {
                            this.field422 = Integer.parseInt(this.getParameter("music"));
                        } catch (Exception var70) {
                        }
                        this.field423 = true;
                        this.field364.method430(2, this.field422);
                        while (this.field364.method440() > 0) {
                            this.method156(false);
                            try {
                                Thread.sleep(100L);
                            } catch (Exception var69) {
                            }
                            if (this.field364.field1427 > 3) {
                                this.method36("ondemand");
                                return;
                            }
                        }
                    }
                    this.method107(65, false, "Requesting animations");
                    int var12 = this.field364.method429(1, 631);
                    for (int var13 = 0; var13 < var12; ++var13) {
                        this.field364.method430(1, var13);
                    }
                    while (this.field364.method440() > 0) {
                        int var14 = var12 - this.field364.method440();
                        if (var14 > 0) {
                            this.method107(65, false, "Loading animations - " + var14 * 100 / var12 + "%");
                        }
                        this.method156(false);
                        try {
                            Thread.sleep(100L);
                        } catch (Exception var68) {
                        }
                        if (this.field364.field1427 > 3) {
                            this.method36("ondemand");
                            return;
                        }
                    }
                    this.method107(70, false, "Requesting models");
                    int var15 = this.field364.method429(0, 631);
                    for (int var16 = 0; var16 < var15; ++var16) {
                        int var17 = this.field364.method439(var16, 21251);
                        if ((var17 & 1) != 0) {
                            this.field364.method430(0, var16);
                        }
                    }
                    int var18 = this.field364.method440();
                    while (this.field364.method440() > 0) {
                        int var19 = var18 - this.field364.method440();
                        if (var19 > 0) {
                            this.method107(70, false, "Loading models - " + var19 * 100 / var18 + "%");
                        }
                        this.method156(false);
                        try {
                            Thread.sleep(100L);
                        } catch (Exception var67) {
                        }
                    }
                    if (this.field493[0] != null) {
                        this.method107(75, false, "Requesting maps");
                        this.field364.method430(3, this.field364.method438(0, 47, true, 48));
                        this.field364.method430(3, this.field364.method438(1, 47, true, 48));
                        this.field364.method430(3, this.field364.method438(0, 48, true, 48));
                        this.field364.method430(3, this.field364.method438(1, 48, true, 48));
                        this.field364.method430(3, this.field364.method438(0, 49, true, 48));
                        this.field364.method430(3, this.field364.method438(1, 49, true, 48));
                        this.field364.method430(3, this.field364.method438(0, 47, true, 47));
                        this.field364.method430(3, this.field364.method438(1, 47, true, 47));
                        this.field364.method430(3, this.field364.method438(0, 48, true, 47));
                        this.field364.method430(3, this.field364.method438(1, 48, true, 47));
                        this.field364.method430(3, this.field364.method438(0, 48, true, 148));
                        this.field364.method430(3, this.field364.method438(1, 48, true, 148));
                        int var20 = this.field364.method440();
                        while (this.field364.method440() > 0) {
                            int var21 = var20 - this.field364.method440();
                            if (var21 > 0) {
                                this.method107(75, false, "Loading maps - " + var21 * 100 / var20 + "%");
                            }
                            this.method156(false);
                            try {
                                Thread.sleep(100L);
                            } catch (Exception var66) {
                            }
                        }
                    }
                    int var22 = this.field364.method429(0, 631);
                    for (int var23 = 0; var23 < var22; ++var23) {
                        int var24 = this.field364.method439(var23, 21251);
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
                            this.field364.method446(0, -79, var23, var25);
                        }
                    }
                    this.field364.method432(field308, field371);
                    if (!field372) {
                        int var26 = this.field364.method429(2, 631);
                        for (int var27 = 1; var27 < var26; ++var27) {
                            if (this.field364.method449(-86, var27)) {
                                this.field364.method446(2, -79, var27, (byte) 1);
                            }
                        }
                    }
                    this.method107(80, false, "Unpacking media");
                    this.field574 = new class9(var6, "invback", 0);
                    this.field576 = new class9(var6, "chatback", 0);
                    this.field575 = new class9(var6, "mapback", 0);
                    this.field476 = new class9(var6, "backbase1", 0);
                    this.field477 = new class9(var6, "backbase2", 0);
                    this.field478 = new class9(var6, "backhmid1", 0);
                    for (int var28 = 0; var28 < 13; ++var28) {
                        this.field523[var28] = new class9(var6, "sideicons", var28);
                    }
                    this.field293 = new class69(var6, "compass", 0);
                    this.field253 = new class69(var6, "mapedge", 0);
                    this.field253.method573(793);
                    try {
                        for (int var29 = 0; var29 < 100; ++var29) {
                            this.field579[var29] = new class9(var6, "mapscene", var29);
                        }
                    } catch (Exception var74) {
                    }
                    try {
                        for (int var30 = 0; var30 < 100; ++var30) {
                            this.field586[var30] = new class69(var6, "mapfunction", var30);
                        }
                    } catch (Exception var73) {
                    }
                    try {
                        for (int var31 = 0; var31 < 20; ++var31) {
                            this.field201[var31] = new class69(var6, "hitmarks", var31);
                        }
                    } catch (Exception var72) {
                    }
                    try {
                        for (int var32 = 0; var32 < 20; ++var32) {
                            this.field448[var32] = new class69(var6, "headicons", var32);
                        }
                    } catch (Exception var71) {
                    }
                    this.field258 = new class69(var6, "mapmarker", 0);
                    this.field259 = new class69(var6, "mapmarker", 1);
                    for (int var33 = 0; var33 < 8; ++var33) {
                        this.field353[var33] = new class69(var6, "cross", var33);
                    }
                    this.field269 = new class69(var6, "mapdots", 0);
                    this.field270 = new class69(var6, "mapdots", 1);
                    this.field271 = new class69(var6, "mapdots", 2);
                    this.field272 = new class69(var6, "mapdots", 3);
                    this.field273 = new class69(var6, "mapdots", 4);
                    this.field580 = new class9(var6, "scrollbar", 0);
                    this.field581 = new class9(var6, "scrollbar", 1);
                    this.field237 = new class9(var6, "redstone1", 0);
                    this.field238 = new class9(var6, "redstone2", 0);
                    this.field239 = new class9(var6, "redstone3", 0);
                    this.field240 = new class9(var6, "redstone1", 0);
                    this.field240.method163(0);
                    this.field241 = new class9(var6, "redstone2", 0);
                    this.field241.method163(0);
                    this.field565 = new class9(var6, "redstone1", 0);
                    this.field565.method164(-365);
                    this.field566 = new class9(var6, "redstone2", 0);
                    this.field566.method164(-365);
                    this.field567 = new class9(var6, "redstone3", 0);
                    this.field567.method164(-365);
                    this.field568 = new class9(var6, "redstone1", 0);
                    this.field568.method163(0);
                    this.field568.method164(-365);
                    this.field569 = new class9(var6, "redstone2", 0);
                    this.field569.method163(0);
                    this.field569.method164(-365);
                    for (int var34 = 0; var34 < 2; ++var34) {
                        this.field213[var34] = new class9(var6, "mod_icons", var34);
                    }
                    class69 var35 = new class69(var6, "backleft1", 0);
                    this.field528 = new class71(var35.field1664, this.method28((byte) 7), var35.field1663, (byte) 1);
                    var35.method574((byte) 82, 0, 0);
                    class69 var36 = new class69(var6, "backleft2", 0);
                    this.field529 = new class71(var36.field1664, this.method28((byte) 7), var36.field1663, (byte) 1);
                    var36.method574((byte) 82, 0, 0);
                    class69 var37 = new class69(var6, "backright1", 0);
                    this.field530 = new class71(var37.field1664, this.method28((byte) 7), var37.field1663, (byte) 1);
                    var37.method574((byte) 82, 0, 0);
                    class69 var38 = new class69(var6, "backright2", 0);
                    this.field531 = new class71(var38.field1664, this.method28((byte) 7), var38.field1663, (byte) 1);
                    var38.method574((byte) 82, 0, 0);
                    class69 var39 = new class69(var6, "backtop1", 0);
                    this.field532 = new class71(var39.field1664, this.method28((byte) 7), var39.field1663, (byte) 1);
                    var39.method574((byte) 82, 0, 0);
                    class69 var40 = new class69(var6, "backvmid1", 0);
                    this.field533 = new class71(var40.field1664, this.method28((byte) 7), var40.field1663, (byte) 1);
                    var40.method574((byte) 82, 0, 0);
                    class69 var41 = new class69(var6, "backvmid2", 0);
                    this.field534 = new class71(var41.field1664, this.method28((byte) 7), var41.field1663, (byte) 1);
                    var41.method574((byte) 82, 0, 0);
                    class69 var42 = new class69(var6, "backvmid3", 0);
                    this.field535 = new class71(var42.field1664, this.method28((byte) 7), var42.field1663, (byte) 1);
                    var42.method574((byte) 82, 0, 0);
                    class69 var43 = new class69(var6, "backhmid2", 0);
                    this.field536 = new class71(var43.field1664, this.method28((byte) 7), var43.field1663, (byte) 1);
                    var43.method574((byte) 82, 0, 0);
                    int var44 = (int) (Math.random() * 21.0D) - 10;
                    int var45 = (int) (Math.random() * 21.0D) - 10;
                    int var46 = (int) (Math.random() * 21.0D) - 10;
                    int var47 = (int) (Math.random() * 41.0D) - 20;
                    for (int var48 = 0; var48 < 100; ++var48) {
                        if (this.field586[var48] != null) {
                            this.field586[var48].method572(var46 + var47, field178, var44 + var47, var45 + var47);
                        }
                        if (this.field579[var48] != null) {
                            this.field579[var48].method165(var46 + var47, field178, var44 + var47, var45 + var47);
                        }
                    }
                    this.method107(83, false, "Unpacking textures");
                    class12.method175((byte) 56, var7);
                    class12.method179(false, 0.8D);
                    class12.method174(20, false);
                    this.method107(86, false, "Unpacking config");
                    class21.method276(0, var4);
                    class58.method451(var4);
                    class34.method358(0, var4);
                    class5.method6(var4);
                    class37.method365(var4);
                    class44.method383(0, var4);
                    class66.method517(0, var4);
                    class41.method369(0, var4);
                    class67.method520(0, var4);
                    class5.field60 = field371;
                    if (!field372) {
                        this.method107(90, false, "Unpacking sounds");
                        byte[] var49 = var9.method402("sounds.dat", (byte[]) null);
                        class68 var50 = new class68((byte) 9, var49);
                        class23.method291(0, var50);
                    }
                    this.method107(95, false, "Unpacking interfaces");
                    class60[] var51 = new class60[] { this.field140, this.field141, this.field142, this.field143 };
                    class53.method410(var5, var51, (byte) 5, var6);
                    this.method107(100, false, "Preparing game engine");
                    for (int var52 = 0; var52 < 33; ++var52) {
                        int var53 = 999;
                        int var54 = 0;
                        for (int var55 = 0; var55 < 34; ++var55) {
                            if (this.field575.field607[this.field575.field609 * var52 + var55] == 0) {
                                if (var53 == 999) {
                                    var53 = var55;
                                }
                            } else if (var53 != 999) {
                                var54 = var55;
                                break;
                            }
                        }
                        this.field171[var52] = var53;
                        this.field280[var52] = var54 - var53;
                    }
                    for (int var56 = 5; var56 < 156; ++var56) {
                        int var57 = 999;
                        int var58 = 0;
                        for (int var59 = 25; var59 < 172; ++var59) {
                            if (this.field575.field607[this.field575.field609 * var56 + var59] == 0 && (var59 > 34 || var56 > 34)) {
                                if (var57 == 999) {
                                    var57 = var59;
                                }
                            } else if (var57 != 999) {
                                var58 = var59;
                                break;
                            }
                        }
                        this.field550[var56 - 5] = var57 - 25;
                        this.field165[var56 - 5] = var58 - var57;
                    }
                    class12.method172(96, (byte) 121, 479);
                    this.field172 = class12.field641;
                    class12.method172(261, (byte) 121, 190);
                    this.field173 = class12.field641;
                    class12.method172(334, (byte) 121, 512);
                    this.field174 = class12.field641;
                    int[] var60 = new int[9];
                    for (int var61 = 0; var61 < 9; ++var61) {
                        int var62 = var61 * 32 + 128 + 15;
                        int var63 = var62 * 3 + 600;
                        int var64 = class12.field639[var62];
                        var60[var61] = var63 * var64 >> 16;
                    }
                    class28.method342(500, 512, 334, var60, 800, (byte) 7);
                    class16.method206(var8);
                    this.field292 = new class26(0, this);
                    this.method106(this.field292, 10);
                    class1.field14 = this;
                    class58.field1446 = this;
                    class37.field1081 = this;
                } catch (Exception var75) {
                    signlink.reporterror("loaderror " + this.field183 + " " + this.field512);
                    this.field277 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "h", descriptor = "(Z)V")
    public final void method47(boolean arg0) {
        if (arg0) {
            this.field447.method524(108);
        }
        this.field380.method588(823);
        class12.field641 = this.field172;
        this.field576.method166(0, 0, (byte) 35);
        if (this.field268) {
            this.field142.method466(40, this.field470, 0, 239, 5);
            this.field142.method466(60, this.field409 + "*", 128, 239, 5);
        } else if (this.field242 == 1) {
            this.field142.method466(40, "Enter amount:", 0, 239, 5);
            this.field142.method466(60, this.field262 + "*", 128, 239, 5);
        } else if (this.field242 == 2) {
            this.field142.method466(40, "Enter name:", 0, 239, 5);
            this.field142.method466(60, this.field262 + "*", 128, 239, 5);
        } else if (this.field585 != null) {
            this.field142.method466(40, this.field585, 0, 239, 5);
            this.field142.method466(60, "Click to continue", 128, 239, 5);
        } else if (this.field254 != -1) {
            this.method158(class53.field1309[this.field254], 0, 0, 0, (byte) 7);
        } else if (this.field552 != -1) {
            this.method158(class53.field1309[this.field552], 0, 0, 0, (byte) 7);
        } else {
            class60 var2 = this.field141;
            int var3 = 0;
            class22.method281(true, 0, 0, 463, 77);
            for (int var4 = 0; var4 < 100; ++var4) {
                if (this.field245[var4] != null) {
                    int var6 = this.field243[var4];
                    int var7 = 70 - var3 * 14 + this.field130;
                    String var8 = this.field244[var4];
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
                            var2.method470(4, this.field245[var4], 0, var7, 1);
                        }
                        ++var3;
                    }
                    if ((var6 == 1 || var6 == 2) && (var6 == 1 || this.field527 == 0 || this.field527 == 1 && this.method68(46314, var8))) {
                        if (var7 > 0 && var7 < 110) {
                            int var10 = 4;
                            if (var9 == 1) {
                                this.field213[0].method166(var7 - 12, var10, (byte) 35);
                                var10 += 14;
                            }
                            if (var9 == 2) {
                                this.field213[1].method166(var7 - 12, var10, (byte) 35);
                                var10 += 14;
                            }
                            var2.method470(var10, var8 + ":", 0, var7, 1);
                            int var11 = var10 + var2.method468(var8, (byte) 12) + 8;
                            var2.method470(var11, this.field245[var4], 255, var7, 1);
                        }
                        ++var3;
                    }
                    if ((var6 == 3 || var6 == 7) && this.field509 == 0 && (var6 == 7 || this.field410 == 0 || this.field410 == 1 && this.method68(46314, var8))) {
                        if (var7 > 0 && var7 < 110) {
                            byte var12 = 4;
                            var2.method470(var12, "From", 0, var7, 1);
                            int var13 = var12 + var2.method468("From ", (byte) 12);
                            if (var9 == 1) {
                                this.field213[0].method166(var7 - 12, var13, (byte) 35);
                                var13 += 14;
                            }
                            if (var9 == 2) {
                                this.field213[1].method166(var7 - 12, var13, (byte) 35);
                                var13 += 14;
                            }
                            var2.method470(var13, var8 + ":", 0, var7, 1);
                            int var14 = var13 + var2.method468(var8, (byte) 12) + 8;
                            var2.method470(var14, this.field245[var4], 8388608, var7, 1);
                        }
                        ++var3;
                    }
                    if (var6 == 4 && (this.field176 == 0 || this.field176 == 1 && this.method68(46314, var8))) {
                        if (var7 > 0 && var7 < 110) {
                            var2.method470(4, var8 + " " + this.field245[var4], 8388736, var7, 1);
                        }
                        ++var3;
                    }
                    if (var6 == 5 && this.field509 == 0 && this.field410 < 2) {
                        if (var7 > 0 && var7 < 110) {
                            var2.method470(4, this.field245[var4], 8388608, var7, 1);
                        }
                        ++var3;
                    }
                    if (var6 == 6 && this.field509 == 0 && this.field410 < 2) {
                        if (var7 > 0 && var7 < 110) {
                            var2.method470(4, "To " + var8 + ":", 0, var7, 1);
                            var2.method470(12 + var2.method468("To " + var8, (byte) 12), this.field245[var4], 8388608, var7, 1);
                        }
                        ++var3;
                    }
                    if (var6 == 8 && (this.field176 == 0 || this.field176 == 1 && this.method68(46314, var8))) {
                        if (var7 > 0 && var7 < 110) {
                            var2.method470(4, var8 + " " + this.field245[var4], 8270336, var7, 1);
                        }
                        ++var3;
                    }
                }
            }
            class22.method280(-378);
            this.field553 = var3 * 14 + 7;
            if (this.field553 < 78) {
                this.field553 = 78;
            }
            this.method62(this.field553 - this.field130 - 77, 77, 463, 0, this.field553, -87);
            String var5;
            if (field313 != null && field313.field1193 != null) {
                var5 = field313.field1193;
            } else {
                var5 = class62.method490(false, this.field300);
            }
            var2.method470(4, var5 + ":", 0, 90, 1);
            var2.method470(6 + var2.method468(var5 + ": ", (byte) 12), this.field288 + "*", 255, 90, 1);
            class22.method287(0, 77, -166, 479, 0);
        }
        if (this.field320 && this.field460 == 2) {
            this.method126(true);
        }
        this.field380.method589(357, super.field1519, 418, 17);
        this.field379.method588(823);
        class12.field641 = this.field174;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BLRWLOYYVC;)Z")
    public final boolean method48(byte arg0, class53 arg1) {
        int var3 = arg1.field1317;
        if (arg0 != 67) {
            for (int var4 = 1; var4 > 0; ++var4) {
            }
        }
        if (this.field129 == 2) {
            if (var3 == 201) {
                this.field498 = true;
                this.field242 = 0;
                this.field268 = true;
                this.field409 = "";
                this.field425 = 1;
                this.field470 = "Enter name of friend to add to list";
            }
            if (var3 == 202) {
                this.field498 = true;
                this.field242 = 0;
                this.field268 = true;
                this.field409 = "";
                this.field425 = 2;
                this.field470 = "Enter name of friend to delete from list";
            }
        }
        if (var3 == 205) {
            this.field346 = 250;
            return true;
        } else {
            if (var3 == 501) {
                this.field498 = true;
                this.field242 = 0;
                this.field268 = true;
                this.field409 = "";
                this.field425 = 4;
                this.field470 = "Enter name of player to add to list";
            }
            if (var3 == 502) {
                this.field498 = true;
                this.field242 = 0;
                this.field268 = true;
                this.field409 = "";
                this.field425 = 5;
                this.field470 = "Enter name of player to delete from list";
            }
            if (var3 >= 300 && var3 <= 313) {
                int var5 = (var3 - 300) / 2;
                int var6 = var3 & 1;
                int var7 = this.field443[var5];
                if (var7 != -1) {
                    while (true) {
                        if (var6 == 0) {
                            --var7;
                            if (var7 < 0) {
                                var7 = class44.field1168 - 1;
                            }
                        }
                        if (var6 == 1) {
                            ++var7;
                            if (var7 >= class44.field1168) {
                                var7 = 0;
                            }
                        }
                        if (!class44.field1169[var7].field1175 && class44.field1169[var7].field1170 == var5 + (this.field154 ? 0 : 7)) {
                            this.field443[var5] = var7;
                            this.field373 = true;
                            break;
                        }
                    }
                }
            }
            if (var3 >= 314 && var3 <= 323) {
                int var8 = (var3 - 314) / 2;
                int var9 = var3 & 1;
                int var10 = this.field482[var8];
                if (var9 == 0) {
                    --var10;
                    if (var10 < 0) {
                        var10 = field559[var8].length - 1;
                    }
                }
                if (var9 == 1) {
                    ++var10;
                    if (var10 >= field559[var8].length) {
                        var10 = 0;
                    }
                }
                this.field482[var8] = var10;
                this.field373 = true;
            }
            if (var3 == 324 && !this.field154) {
                this.field154 = true;
                this.method52(-23057);
            }
            if (var3 == 325 && this.field154) {
                this.field154 = false;
                this.method52(-23057);
            }
            if (var3 != 326) {
                if (var3 == 613) {
                    this.field200 = !this.field200;
                }
                if (var3 >= 601 && var3 <= 612) {
                    this.method63(5);
                    if (this.field414.length() > 0) {
                        this.field447.method523(251, 0);
                        this.field447.method530(155, class62.method486(this.field414));
                        this.field447.method524(var3 - 601);
                        this.field447.method524(this.field200 ? 1 : 0);
                    }
                }
                return false;
            } else {
                this.field447.method523(77, 0);
                this.field447.method524(this.field154 ? 0 : 1);
                for (int var11 = 0; var11 < 7; ++var11) {
                    this.field447.method524(this.field443[var11]);
                }
                for (int var12 = 0; var12 < 5; ++var12) {
                    this.field447.method524(this.field482[var12]);
                }
                return true;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "([BII)Z")
    public final boolean method49(byte[] arg0, int arg1, int arg2) {
        if (arg1 != -30532) {
            this.field447.method524(231);
        }
        return arg0 == null ? true : signlink.wavesave(arg0, arg2);
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIIIIIII)V")
    private final void method50(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        class42 var11 = null;
        class42 var12 = (class42) this.field212.method201();
        if (arg1 != 0) {
            this.field449 = !this.field449;
        }
        while (var12 != null) {
            if (var12.field1140 == arg4 && var12.field1142 == arg0 && var12.field1143 == arg9 && var12.field1141 == arg6) {
                var11 = var12;
                break;
            }
            var12 = (class42) this.field212.method203((byte) 3);
        }
        if (var11 == null) {
            var11 = new class42();
            var11.field1140 = arg4;
            var11.field1141 = arg6;
            var11.field1142 = arg0;
            var11.field1143 = arg9;
            this.method95(var11, this.field226);
            this.field212.method198(var11);
        }
        var11.field1148 = arg7;
        var11.field1150 = arg3;
        var11.field1149 = arg2;
        var11.field1147 = arg8;
        var11.field1139 = arg5;
    }

    @OriginalMember(owner = "client", name = "i", descriptor = "(Z)V")
    public final void method51(boolean arg0) {
        for (int var2 = -1; var2 < this.field231; ++var2) {
            int var3;
            if (var2 == -1) {
                var3 = this.field229;
            } else {
                var3 = this.field232[var2];
            }
            class45 var4 = this.field230[var3];
            if (var4 != null) {
                this.method142(var4, 1, this.field511);
            }
        }
        if (!arg0) {
            ++field121;
            if (field121 > 71) {
                field121 = 0;
                this.field447.method523(13, 0);
            }
        }
    }

    @OriginalMember(owner = "client", name = "j", descriptor = "(I)V")
    public final void method52(int arg0) {
        this.field373 = true;
        for (int var2 = 0; var2 < 7; ++var2) {
            this.field443[var2] = -1;
            for (int var3 = 0; var3 < class44.field1168; ++var3) {
                if (!class44.field1169[var3].field1175 && class44.field1169[var3].field1170 == var2 + (this.field154 ? 0 : 7)) {
                    this.field443[var2] = var3;
                    break;
                }
            }
        }
        if (arg0 == -23057) {
            ;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(JZ)V")
    public final void method53(long arg0, boolean arg1) {
        if (arg0 != 0L) {
            for (int var4 = 0; var4 < this.field429; ++var4) {
                if (this.field303[var4] == arg0) {
                    --this.field429;
                    this.field354 = true;
                    for (int var5 = var4; var5 < this.field429; ++var5) {
                        this.field303[var5] = this.field303[var5 + 1];
                    }
                    this.field447.method523(43, 0);
                    this.field447.method530(155, arg0);
                    break;
                }
            }
            if (arg1) {
                this.method46();
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(JI)V")
    public final void method54(long arg0, int arg1) {
        if (arg0 != 0L) {
            for (int var4 = 0; var4 < this.field128; ++var4) {
                if (this.field403[var4] == arg0) {
                    --this.field128;
                    this.field354 = true;
                    for (int var5 = var4; var5 < this.field128; ++var5) {
                        this.field177[var5] = this.field177[var5 + 1];
                        this.field339[var5] = this.field339[var5 + 1];
                        this.field403[var5] = this.field403[var5 + 1];
                    }
                    this.field447.method523(1, 0);
                    this.field447.method530(155, arg0);
                    break;
                }
            }
            if (arg1 != -26833) {
                this.field374 = !this.field374;
            }
        }
    }

    @OriginalMember(owner = "client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        try {
            System.out.println("RS2 user client - release #" + 321);
            if (arg0.length != 5) {
                System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
            } else {
                field369 = Integer.parseInt(arg0[0]);
                field370 = Integer.parseInt(arg0[1]);
                if (arg0[2].equals("lowmem")) {
                    method139(field365);
                } else {
                    if (!arg0[2].equals("highmem")) {
                        System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
                        return;
                    }
                    method86(false);
                }
                if (arg0[3].equals("free")) {
                    field371 = false;
                } else {
                    if (!arg0[3].equals("members")) {
                        System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
                        return;
                    }
                    field371 = true;
                }
                signlink.storeid = Integer.parseInt(arg0[4]);
                signlink.startpriv(InetAddress.getLocalHost());
                client var1 = new client();
                var1.method481(503, 0, 765);
            }
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client", name = "h", descriptor = "(B)V")
    public final void method55(byte arg0) {
        this.field363 = false;
        while (this.field184) {
            this.field363 = false;
            try {
                Thread.sleep(50L);
            } catch (Exception var2) {
            }
        }
        this.field340 = null;
        this.field341 = null;
        if (arg0 == 74) {
            this.field471 = null;
            this.field248 = null;
            this.field249 = null;
            this.field250 = null;
            this.field251 = null;
            this.field260 = null;
            this.field261 = null;
            this.field415 = null;
            this.field416 = null;
            this.field145 = null;
            this.field146 = null;
        }
    }

    @OriginalMember(owner = "client", name = "i", descriptor = "(B)V")
    public final void method56(byte arg0) {
        if (this.field418 == 2) {
            this.method67(-27, (this.field499 - this.field220 << 7) + this.field502, this.field501 * 2, (this.field500 - this.field221 << 7) + this.field503);
            if (this.field384 != arg0) {
                this.field189 = this.field225.method3();
            }
            if (this.field348 > -1 && field421 % 20 < 10) {
                this.field448[2].method576(this.field349 - 28, this.field348 - 12, (byte) 35);
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(III)Z")
    public final boolean method57(int arg0, int arg1, int arg2) {
        boolean var4 = false;
        if (arg1 >= 0) {
            this.field124 = null;
        }
        class53 var5 = class53.field1309[arg0];
        for (int var6 = 0; var6 < var5.field1302.length && var5.field1302[var6] != -1; ++var6) {
            class53 var7 = class53.field1309[var5.field1302[var6]];
            if (var7.field1330 == 1) {
                var4 |= this.method57(var7.field1319, -217, arg2);
            }
            if (var7.field1330 == 6 && (var7.field1299 != -1 || var7.field1300 != -1)) {
                boolean var8 = this.method159(true, var7);
                int var9;
                if (var8) {
                    var9 = var7.field1300;
                } else {
                    var9 = var7.field1299;
                }
                if (var9 != -1) {
                    class21 var10 = class21.field817[var9];
                    var7.field1301 += arg2;
                    while (var7.field1301 > var10.method277((byte) 110, var7.field1326)) {
                        var7.field1301 -= var10.method277((byte) 110, var7.field1326) + 1;
                        ++var7.field1326;
                        if (var7.field1326 >= var10.field818) {
                            var7.field1326 -= var10.field822;
                            if (var7.field1326 < 0 || var7.field1326 >= var10.field818) {
                                var7.field1326 = 0;
                            }
                        }
                        var4 = true;
                    }
                }
            }
            if (var7.field1330 == 6 && var7.field1274 != 0) {
                int var11 = var7.field1274 >> 16;
                int var12 = var7.field1274 << 16 >> 16;
                int var13 = arg2 * var11;
                int var14 = arg2 * var12;
                var7.field1296 = var7.field1296 + var13 & 2047;
                var7.field1297 = var7.field1297 + var14 & 2047;
                var4 = true;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client", name = "j", descriptor = "(B)Z")
    public final boolean method58(byte arg0) {
        if (this.field295 != arg0) {
            throw new NullPointerException();
        } else {
            boolean var2 = false;
            if (this.field209 == null) {
                return false;
            } else {
                try {
                    int var3 = this.field209.method194();
                    if (var3 == 0) {
                        return false;
                    }
                    if (this.field343 == -1) {
                        this.field209.method195(this.field556.field1642, 0, 1);
                        this.field343 = this.field556.field1642[0] & 255;
                        if (this.field225 != null) {
                            this.field343 = this.field343 - this.field225.method3() & 255;
                        }
                        this.field342 = class64.field1586[this.field343];
                        --var3;
                    }
                    if (this.field342 == -1) {
                        if (var3 <= 0) {
                            return false;
                        }
                        this.field209.method195(this.field556.field1642, 0, 1);
                        this.field342 = this.field556.field1642[0] & 255;
                        --var3;
                    }
                    if (this.field342 == -2) {
                        if (var3 <= 1) {
                            return false;
                        }
                        this.field209.method195(this.field556.field1642, 0, 2);
                        this.field556.field1643 = 0;
                        this.field342 = this.field556.method536();
                        var3 -= 2;
                    }
                    if (var3 < this.field342) {
                        return false;
                    }
                    this.field556.field1643 = 0;
                    this.field209.method195(this.field556.field1642, 0, this.field342);
                    this.field344 = 0;
                    this.field158 = this.field157;
                    this.field157 = this.field156;
                    this.field156 = this.field343;
                    if (this.field343 == 212) {
                        this.field354 = true;
                        int var4 = this.field556.method566((byte) 1);
                        int var5 = this.field556.method553(3);
                        int var6 = this.field556.method552(22736);
                        this.field383[var5] = var4;
                        this.field197[var5] = var6;
                        this.field479[var5] = 1;
                        for (int var7 = 0; var7 < 98; ++var7) {
                            if (var4 >= field133[var7]) {
                                this.field479[var5] = var7 + 2;
                            }
                        }
                        this.field343 = -1;
                        return true;
                    }
                    if (this.field343 == 184) {
                        if (this.field256 == 12) {
                            this.field354 = true;
                        }
                        this.field166 = this.field556.method537();
                        this.field343 = -1;
                        return true;
                    }
                    if (this.field343 == 113) {
                        if (this.field152 != -1) {
                            this.field152 = -1;
                            this.field354 = true;
                            this.field577 = true;
                        }
                        if (this.field254 != -1) {
                            this.field254 = -1;
                            this.field498 = true;
                        }
                        if (this.field242 != 0) {
                            this.field242 = 0;
                            this.field498 = true;
                        }
                        this.field279 = -1;
                        this.field398 = false;
                        this.field343 = -1;
                        return true;
                    }
                    if (this.field343 == 36) {
                        this.field127 = false;
                        for (int var8 = 0; var8 < 5; ++var8) {
                            this.field302[var8] = false;
                        }
                        this.field343 = -1;
                        return true;
                    }
                    if (this.field343 == 239) {
                        int var9 = this.field556.method561(-862);
                        int var10 = this.field556.method536();
                        int var11 = var9 >> 10 & 31;
                        int var12 = var9 >> 5 & 31;
                        int var13 = var9 & 31;
                        class53.field1309[var10].field1269 = (var13 << 3) + (var11 << 19) + (var12 << 11);
                        this.field343 = -1;
                        return true;
                    }
                    if (this.field343 == 204) {
                        String var14 = this.field556.method541();
                        int var15 = this.field556.method553(3);
                        int var16 = this.field556.method534();
                        if (var15 >= 1 && var15 <= 5) {
                            if (var14.equalsIgnoreCase("null")) {
                                var14 = null;
                            }
                            this.field587[var15 - 1] = var14;
                            this.field588[var15 - 1] = var16 == 0;
                        }
                        this.field343 = -1;
                        return true;
                    }
                    if (this.field343 == 171) {
                        int var17 = this.field556.method559(0);
                        String var18 = this.field556.method541();
                        class53.field1309[var17].field1291 = var18;
                        if (this.field150[this.field256] == class53.field1309[var17].field1298) {
                            this.field354 = true;
                        }
                        this.field343 = -1;
                        return true;
                    }
                    if (this.field343 == 189) {
                        this.field401 = this.field556.method536();
                        this.field134 = this.field556.method553(3);
                        this.field343 = -1;
                        return true;
                    }
                    if (this.field343 == 138) {
                        this.method32(4289, this.field556, this.field342);
                        this.field343 = -1;
                        return true;
                    }
                    if (this.field343 == 211 || this.field343 == 152) {
                        int var19 = this.field187;
                        int var20 = this.field188;
                        if (this.field343 == 211) {
                            var19 = this.field556.method559(0);
                            var20 = this.field556.method536();
                            this.field352 = false;
                        }
                        if (this.field343 == 152) {
                            var19 = this.field556.method559(0);
                            this.field556.method544((byte) 7);
                            int var21 = 0;
                            while (true) {
                                if (var21 >= 4) {
                                    this.field556.method546(0);
                                    var20 = this.field556.method560(-123);
                                    this.field352 = true;
                                    break;
                                }
                                for (int var22 = 0; var22 < 13; ++var22) {
                                    for (int var23 = 0; var23 < 13; ++var23) {
                                        int var24 = this.field556.method545(true, 1);
                                        if (var24 == 1) {
                                            this.field155[var21][var22][var23] = this.field556.method545(true, 26);
                                        } else {
                                            this.field155[var21][var22][var23] = -1;
                                        }
                                    }
                                }
                                ++var21;
                            }
                        }
                        if (this.field187 == var19 && this.field188 == var20 && this.field218 == 2) {
                            this.field343 = -1;
                            return true;
                        }
                        this.field187 = var19;
                        this.field188 = var20;
                        this.field220 = (this.field187 - 6) * 8;
                        this.field221 = (this.field188 - 6) * 8;
                        this.field151 = false;
                        if ((this.field187 / 8 == 48 || this.field187 / 8 == 49) && this.field188 / 8 == 48) {
                            this.field151 = true;
                        }
                        if (this.field187 / 8 == 48 && this.field188 / 8 == 148) {
                            this.field151 = true;
                        }
                        this.field218 = 1;
                        this.field389 = System.currentTimeMillis();
                        this.field379.method588(823);
                        this.field141.method466(151, "Loading - please wait.", 0, 257, 5);
                        this.field141.method466(150, "Loading - please wait.", 16777215, 256, 5);
                        this.field379.method589(4, super.field1519, 418, 4);
                        if (this.field343 == 211) {
                            int var25 = 0;
                            int var26 = (this.field187 - 6) / 8;
                            label1144: while (true) {
                                if (var26 > (this.field187 + 6) / 8) {
                                    this.field289 = new byte[var25][];
                                    this.field194 = new byte[var25][];
                                    this.field366 = new int[var25];
                                    this.field367 = new int[var25];
                                    this.field368 = new int[var25];
                                    int var28 = 0;
                                    int var29 = (this.field187 - 6) / 8;
                                    while (true) {
                                        if (var29 > (this.field187 + 6) / 8) {
                                            break label1144;
                                        }
                                        for (int var30 = (this.field188 - 6) / 8; var30 <= (this.field188 + 6) / 8; ++var30) {
                                            this.field366[var28] = (var29 << 8) + var30;
                                            if (this.field151 && (var30 == 49 || var30 == 149 || var30 == 147 || var29 == 50 || var29 == 49 && var30 == 47)) {
                                                this.field367[var28] = -1;
                                                this.field368[var28] = -1;
                                                ++var28;
                                            } else {
                                                int var31 = this.field367[var28] = this.field364.method438(0, var29, true, var30);
                                                if (var31 != -1) {
                                                    this.field364.method430(3, var31);
                                                }
                                                int var32 = this.field368[var28] = this.field364.method438(1, var29, true, var30);
                                                if (var32 != -1) {
                                                    this.field364.method430(3, var32);
                                                }
                                                ++var28;
                                            }
                                        }
                                        ++var29;
                                    }
                                }
                                for (int var27 = (this.field188 - 6) / 8; var27 <= (this.field188 + 6) / 8; ++var27) {
                                    ++var25;
                                }
                                ++var26;
                            }
                        }
                        if (this.field343 == 152) {
                            int var33 = 0;
                            int[] var34 = new int[676];
                            int var35 = 0;
                            label1105: while (true) {
                                if (var35 >= 4) {
                                    this.field289 = new byte[var33][];
                                    this.field194 = new byte[var33][];
                                    this.field366 = new int[var33];
                                    this.field367 = new int[var33];
                                    this.field368 = new int[var33];
                                    int var43 = 0;
                                    while (true) {
                                        if (var43 >= var33) {
                                            break label1105;
                                        }
                                        int var44 = this.field366[var43] = var34[var43];
                                        int var45 = var44 >> 8 & 255;
                                        int var46 = var44 & 255;
                                        int var47 = this.field367[var43] = this.field364.method438(0, var45, true, var46);
                                        if (var47 != -1) {
                                            this.field364.method430(3, var47);
                                        }
                                        int var48 = this.field368[var43] = this.field364.method438(1, var45, true, var46);
                                        if (var48 != -1) {
                                            this.field364.method430(3, var48);
                                        }
                                        ++var43;
                                    }
                                }
                                for (int var36 = 0; var36 < 13; ++var36) {
                                    for (int var37 = 0; var37 < 13; ++var37) {
                                        int var38 = this.field155[var35][var36][var37];
                                        if (var38 != -1) {
                                            int var39 = var38 >> 14 & 1023;
                                            int var40 = var38 >> 3 & 2047;
                                            int var41 = (var39 / 8 << 8) + var40 / 8;
                                            for (int var42 = 0; var42 < var33; ++var42) {
                                                if (var34[var42] == var41) {
                                                    var41 = -1;
                                                    break;
                                                }
                                            }
                                            if (var41 != -1) {
                                                var34[var33++] = var41;
                                            }
                                        }
                                    }
                                }
                                ++var35;
                            }
                        }
                        int var49 = this.field220 - this.field222;
                        int var50 = this.field221 - this.field223;
                        this.field222 = this.field220;
                        this.field223 = this.field221;
                        for (int var51 = 0; var51 < 16384; ++var51) {
                            class18 var52 = this.field356[var51];
                            if (var52 != null) {
                                for (int var53 = 0; var53 < 10; ++var53) {
                                    var52.field1696[var53] -= var49;
                                    var52.field1697[var53] -= var50;
                                }
                                var52.field1721 -= var49 * 128;
                                var52.field1722 -= var50 * 128;
                            }
                        }
                        for (int var54 = 0; var54 < this.field228; ++var54) {
                            class45 var55 = this.field230[var54];
                            if (var55 != null) {
                                for (int var56 = 0; var56 < 10; ++var56) {
                                    var55.field1696[var56] -= var49;
                                    var55.field1697[var56] -= var50;
                                }
                                var55.field1721 -= var49 * 128;
                                var55.field1722 -= var50 * 128;
                            }
                        }
                        this.field387 = true;
                        byte var57 = 0;
                        byte var58 = 104;
                        byte var59 = 1;
                        if (var49 < 0) {
                            var57 = 103;
                            var58 = -1;
                            var59 = -1;
                        }
                        byte var60 = 0;
                        byte var61 = 104;
                        byte var62 = 1;
                        if (var50 < 0) {
                            var60 = 103;
                            var61 = -1;
                            var62 = -1;
                        }
                        for (int var63 = var57; var58 != var63; var63 += var59) {
                            for (int var64 = var60; var61 != var64; var64 += var62) {
                                int var65 = var49 + var63;
                                int var66 = var50 + var64;
                                for (int var67 = 0; var67 < 4; ++var67) {
                                    if (var65 >= 0 && var66 >= 0 && var65 < 104 && var66 < 104) {
                                        this.field124[var67][var63][var64] = this.field124[var67][var65][var66];
                                    } else {
                                        this.field124[var67][var63][var64] = null;
                                    }
                                }
                            }
                        }
                        for (class42 var68 = (class42) this.field212.method201(); var68 != null; var68 = (class42) this.field212.method203((byte) 3)) {
                            var68.field1142 -= var49;
                            var68.field1143 -= var50;
                            if (var68.field1142 < 0 || var68.field1143 < 0 || var68.field1142 >= 104 || var68.field1143 >= 104) {
                                var68.method396();
                            }
                        }
                        if (this.field316 != 0) {
                            this.field316 -= var49;
                            this.field317 -= var50;
                        }
                        this.field127 = false;
                        this.field343 = -1;
                        return true;
                    }
                    if (this.field343 == 58) {
                        this.field385 = this.field556.method536() * 30;
                        this.field343 = -1;
                        return true;
                    }
                    if (this.field343 == 101) {
                        this.field491 = this.field556.method534();
                        this.field343 = -1;
                        return true;
                    }
                    if (this.field343 == 3) {
                        this.method59(this.field342, 771, this.field556);
                        this.field387 = false;
                        this.field343 = -1;
                        return true;
                    }
                    if (this.field343 == 217) {
                        int var69 = this.field556.method561(-862);
                        this.method133(true, var69);
                        if (this.field152 != -1) {
                            this.field152 = -1;
                            this.field354 = true;
                            this.field577 = true;
                        }
                        if (this.field254 != -1) {
                            this.field254 = -1;
                            this.field498 = true;
                        }
                        if (this.field242 != 0) {
                            this.field242 = 0;
                            this.field498 = true;
                        }
                        this.field279 = var69;
                        this.field398 = false;
                        this.field343 = -1;
                        return true;
                    }
                    if (this.field343 == 132) {
                        for (int var70 = 0; var70 < this.field584.length; ++var70) {
                            if (this.field584[var70] != this.field255[var70]) {
                                this.field584[var70] = this.field255[var70];
                                this.method155(var70, 7);
                                this.field354 = true;
                            }
                        }
                        this.field343 = -1;
                        return true;
                    }
                    if (this.field343 == 170) {
                        this.field362 = this.field556.method534();
                        this.field343 = -1;
                        return true;
                    }
                    if (this.field343 == 207) {
                        int var71 = this.field556.method536();
                        byte var72 = this.field556.method535();
                        this.field255[var71] = var72;
                        if (this.field584[var71] != var72) {
                            this.field584[var71] = var72;
                            this.method155(var71, 7);
                            this.field354 = true;
                            if (this.field552 != -1) {
                                this.field498 = true;
                            }
                        }
                        this.field343 = -1;
                        return true;
                    }
                    if (this.field343 == 126) {
                        this.field256 = this.field556.method552(22736);
                        this.field354 = true;
                        this.field577 = true;
                        this.field343 = -1;
                        return true;
                    }
                    if (this.field343 == 135) {
                        this.field429 = this.field342 / 8;
                        for (int var73 = 0; var73 < this.field429; ++var73) {
                            this.field303[var73] = this.field556.method540(true);
                        }
                        this.field343 = -1;
                        return true;
                    }
                    if (this.field343 == 149) {
                        int var74 = this.field556.method554((byte) 112);
                        int var75 = this.field556.method536();
                        if (var75 == 65535) {
                            var75 = -1;
                        }
                        this.field150[var74] = var75;
                        this.field354 = true;
                        this.field577 = true;
                        this.field343 = -1;
                        return true;
                    }
                    if (this.field343 == 177) {
                        this.field316 = 0;
                        this.field343 = -1;
                        return true;
                    }
                    if (this.field343 == 163) {
                        this.field354 = true;
                        int var76 = this.field556.method536();
                        class53 var77 = class53.field1309[var76];
                        while (this.field556.field1643 < this.field342) {
                            int var78 = this.field556.method548();
                            int var79 = this.field556.method536();
                            int var80 = this.field556.method534();
                            if (var80 == 255) {
                                var80 = this.field556.method539();
                            }
                            if (var78 >= 0 && var78 < var77.field1327.length) {
                                var77.field1327[var78] = var79;
                                var77.field1289[var78] = var80;
                            }
                        }
                        this.field343 = -1;
                        return true;
                    }
                    if (this.field343 == 70) {
                        long var81 = this.field556.method540(true);
                        int var83 = this.field556.method539();
                        int var84 = this.field556.method534();
                        boolean var85 = false;
                        for (int var86 = 0; var86 < 100; ++var86) {
                            if (this.field455[var86] == var83) {
                                var85 = true;
                                break;
                            }
                        }
                        if (var84 <= 1) {
                            for (int var87 = 0; var87 < this.field429; ++var87) {
                                if (this.field303[var87] == var81) {
                                    var85 = true;
                                    break;
                                }
                            }
                        }
                        if (!var85 && this.field170 == 0) {
                            try {
                                this.field455[this.field497] = var83;
                                this.field497 = (this.field497 + 1) % 100;
                                String var88 = class48.method397(this.field246, this.field342 - 13, this.field556);
                                if (var84 != 3) {
                                    var88 = class16.method216(var88, 0);
                                }
                                if (var84 != 2 && var84 != 3) {
                                    if (var84 == 1) {
                                        this.method26(0, var88, "@cr1@" + class62.method490(false, class62.method487(var81, (byte) 7)), 7);
                                    } else {
                                        this.method26(0, var88, class62.method490(false, class62.method487(var81, (byte) 7)), 3);
                                    }
                                } else {
                                    this.method26(0, var88, "@cr2@" + class62.method490(false, class62.method487(var81, (byte) 7)), 7);
                                }
                            } catch (Exception var191) {
                                signlink.reporterror("cde1");
                            }
                        }
                        this.field343 = -1;
                        return true;
                    }
                    if (this.field343 == 245) {
                        int var90 = this.field556.method567(false);
                        int var91 = this.field556.method536();
                        this.field255[var91] = var90;
                        if (this.field584[var91] != var90) {
                            this.field584[var91] = var90;
                            this.method155(var91, 7);
                            this.field354 = true;
                            if (this.field552 != -1) {
                                this.field498 = true;
                            }
                        }
                        this.field343 = -1;
                        return true;
                    }
                    if (this.field343 == 60) {
                        this.field354 = true;
                        int var92 = this.field556.method536();
                        class53 var93 = class53.field1309[var92];
                        int var94 = this.field556.method536();
                        for (int var95 = 0; var95 < var94; ++var95) {
                            var93.field1327[var95] = this.field556.method536();
                            int var96 = this.field556.method554((byte) 112);
                            if (var96 == 255) {
                                var96 = this.field556.method539();
                            }
                            var93.field1289[var95] = var96;
                        }
                        for (int var97 = var94; var97 < var93.field1327.length; ++var97) {
                            var93.field1327[var97] = 0;
                            var93.field1289[var97] = 0;
                        }
                        this.field343 = -1;
                        return true;
                    }
                    if (this.field343 == 230) {
                        String var98 = this.field556.method541();
                        if (var98.endsWith(":tradereq:")) {
                            String var99 = var98.substring(0, var98.indexOf(":"));
                            long var100 = class62.method486(var99);
                            boolean var102 = false;
                            for (int var103 = 0; var103 < this.field429; ++var103) {
                                if (this.field303[var103] == var100) {
                                    var102 = true;
                                    break;
                                }
                            }
                            if (!var102 && this.field170 == 0) {
                                this.method26(0, "wishes to trade with you.", var99, 4);
                            }
                        } else if (var98.endsWith(":duelreq:")) {
                            String var104 = var98.substring(0, var98.indexOf(":"));
                            long var105 = class62.method486(var104);
                            boolean var107 = false;
                            for (int var108 = 0; var108 < this.field429; ++var108) {
                                if (this.field303[var108] == var105) {
                                    var107 = true;
                                    break;
                                }
                            }
                            if (!var107 && this.field170 == 0) {
                                this.method26(0, "wishes to duel with you.", var104, 8);
                            }
                        } else if (!var98.endsWith(":chalreq:")) {
                            this.method26(0, var98, "", 0);
                        } else {
                            String var109 = var98.substring(0, var98.indexOf(":"));
                            long var110 = class62.method486(var109);
                            boolean var112 = false;
                            for (int var113 = 0; var113 < this.field429; ++var113) {
                                if (this.field303[var113] == var110) {
                                    var112 = true;
                                    break;
                                }
                            }
                            if (!var112 && this.field170 == 0) {
                                String var114 = var98.substring(var98.indexOf(":") + 1, var98.length() - 9);
                                this.method26(0, var114, var109, 8);
                            }
                        }
                        this.field343 = -1;
                        return true;
                    }
                    if (this.field343 == 240 || this.field343 == 35 || this.field343 == 159 || this.field343 == 26 || this.field343 == 80 || this.field343 == 128 || this.field343 == 37 || this.field343 == 61 || this.field343 == 72 || this.field343 == 251 || this.field343 == 102) {
                        this.method152(this.field343, this.field556, 5);
                        this.field343 = -1;
                        return true;
                    }
                    if (this.field343 == 52) {
                        int var115 = this.field556.method561(-862);
                        this.method133(true, var115);
                        if (this.field152 != -1) {
                            this.field152 = -1;
                            this.field354 = true;
                            this.field577 = true;
                        }
                        this.field254 = var115;
                        this.field498 = true;
                        this.field279 = -1;
                        this.field398 = false;
                        this.field343 = -1;
                        return true;
                    }
                    if (this.field343 == 81) {
                        int var116 = this.field556.method536();
                        int var117 = this.field556.method559(0);
                        int var118 = this.field556.method536();
                        if (var116 == 65535) {
                            class53.field1309[var117].field1320 = 0;
                            this.field343 = -1;
                            return true;
                        }
                        class5 var119 = class5.method13(var116);
                        class53.field1309[var117].field1320 = 4;
                        class53.field1309[var117].field1321 = var116;
                        class53.field1309[var117].field1296 = var119.field80;
                        class53.field1309[var117].field1297 = var119.field67;
                        class53.field1309[var117].field1295 = var119.field44 * 100 / var118;
                        this.field343 = -1;
                        return true;
                    }
                    if (this.field343 == 57) {
                        if (this.field256 == 12) {
                            this.field354 = true;
                        }
                        this.field125 = this.field556.method534();
                        this.field343 = -1;
                        return true;
                    }
                    if (this.field343 == 220) {
                        int var120 = this.field556.method564(false);
                        this.field552 = var120;
                        this.field498 = true;
                        this.field343 = -1;
                        return true;
                    }
                    if (this.field343 == 222) {
                        long var121 = this.field556.method540(true);
                        int var123 = this.field556.method534();
                        String var124 = class62.method490(false, class62.method487(var121, (byte) 7));
                        for (int var125 = 0; var125 < this.field128; ++var125) {
                            if (this.field403[var125] == var121) {
                                if (this.field339[var125] != var123) {
                                    this.field339[var125] = var123;
                                    this.field354 = true;
                                    if (var123 > 0) {
                                        this.method26(0, var124 + " has logged in.", "", 5);
                                    }
                                    if (var123 == 0) {
                                        this.method26(0, var124 + " has logged out.", "", 5);
                                    }
                                }
                                var124 = null;
                                break;
                            }
                        }
                        if (var124 != null && this.field128 < 200) {
                            this.field403[this.field128] = var121;
                            this.field177[this.field128] = var124;
                            this.field339[this.field128] = var123;
                            ++this.field128;
                            this.field354 = true;
                        }
                        boolean var126 = false;
                        while (!var126) {
                            var126 = true;
                            for (int var127 = 0; var127 < this.field128 - 1; ++var127) {
                                if (this.field339[var127] != field369 && this.field339[var127 + 1] == field369 || this.field339[var127] == 0 && this.field339[var127 + 1] != 0) {
                                    int var128 = this.field339[var127];
                                    this.field339[var127] = this.field339[var127 + 1];
                                    this.field339[var127 + 1] = var128;
                                    String var129 = this.field177[var127];
                                    this.field177[var127] = this.field177[var127 + 1];
                                    this.field177[var127 + 1] = var129;
                                    long var130 = this.field403[var127];
                                    this.field403[var127] = this.field403[var127 + 1];
                                    this.field403[var127 + 1] = var130;
                                    this.field354 = true;
                                    var126 = false;
                                }
                            }
                        }
                        this.field343 = -1;
                        return true;
                    }
                    if (this.field343 == 176) {
                        this.field126 = this.field556.method552(22736);
                        if (this.field256 == this.field126) {
                            if (this.field126 == 3) {
                                this.field256 = 1;
                            } else {
                                this.field256 = 3;
                            }
                            this.field354 = true;
                        }
                        this.field343 = -1;
                        return true;
                    }
                    if (this.field343 == 183) {
                        this.field276 = this.field556.method553(3);
                        this.field275 = this.field556.method534();
                        this.field343 = -1;
                        return true;
                    }
                    if (this.field343 == 140) {
                        for (int var132 = 0; var132 < this.field230.length; ++var132) {
                            if (this.field230[var132] != null) {
                                this.field230[var132].field1698 = -1;
                            }
                        }
                        for (int var133 = 0; var133 < this.field356.length; ++var133) {
                            if (this.field356[var133] != null) {
                                this.field356[var133].field1698 = -1;
                            }
                        }
                        this.field343 = -1;
                        return true;
                    }
                    if (this.field343 == 7) {
                        this.field418 = this.field556.method534();
                        if (this.field418 == 1) {
                            this.field132 = this.field556.method536();
                        }
                        if (this.field418 >= 2 && this.field418 <= 6) {
                            if (this.field418 == 2) {
                                this.field502 = 64;
                                this.field503 = 64;
                            }
                            if (this.field418 == 3) {
                                this.field502 = 0;
                                this.field503 = 64;
                            }
                            if (this.field418 == 4) {
                                this.field502 = 128;
                                this.field503 = 64;
                            }
                            if (this.field418 == 5) {
                                this.field502 = 64;
                                this.field503 = 0;
                            }
                            if (this.field418 == 6) {
                                this.field502 = 64;
                                this.field503 = 128;
                            }
                            this.field418 = 2;
                            this.field499 = this.field556.method536();
                            this.field500 = this.field556.method536();
                            this.field501 = this.field556.method534();
                        }
                        if (this.field418 == 10) {
                            this.field208 = this.field556.method536();
                        }
                        this.field343 = -1;
                        return true;
                    }
                    if (this.field343 == 64) {
                        int var134 = this.field556.method537();
                        if (var134 >= 0) {
                            this.method133(true, var134);
                        }
                        this.field186 = var134;
                        this.field343 = -1;
                        return true;
                    }
                    if (this.field343 == 165) {
                        int var135 = this.field556.method534();
                        int var136 = this.field556.method534();
                        int var137 = this.field556.method534();
                        int var138 = this.field556.method534();
                        this.field302[var135] = true;
                        this.field510[var135] = var136;
                        this.field350[var135] = var137;
                        this.field283[var135] = var138;
                        this.field291[var135] = 0;
                        this.field343 = -1;
                        return true;
                    }
                    if (this.field343 == 250) {
                        this.field527 = this.field556.method534();
                        this.field410 = this.field556.method534();
                        this.field176 = this.field556.method534();
                        this.field169 = true;
                        this.field498 = true;
                        this.field343 = -1;
                        return true;
                    }
                    if (this.field343 == 41) {
                        this.field129 = this.field556.method534();
                        this.field354 = true;
                        this.field343 = -1;
                        return true;
                    }
                    if (this.field343 == 157) {
                        this.field268 = false;
                        this.field242 = 1;
                        this.field262 = "";
                        this.field498 = true;
                        this.field343 = -1;
                        return true;
                    }
                    if (this.field343 == 108) {
                        this.field268 = false;
                        this.field242 = 2;
                        this.field262 = "";
                        this.field498 = true;
                        this.field343 = -1;
                        return true;
                    }
                    if (this.field343 == 116) {
                        int var139 = this.field556.method561(-862);
                        int var140 = this.field556.method559(0);
                        if (this.field254 != -1) {
                            this.field254 = -1;
                            this.field498 = true;
                        }
                        if (this.field242 != 0) {
                            this.field242 = 0;
                            this.field498 = true;
                        }
                        this.field279 = var140;
                        this.field152 = var139;
                        this.field354 = true;
                        this.field577 = true;
                        this.field398 = false;
                        this.field343 = -1;
                        return true;
                    }
                    if (this.field343 == 164) {
                        int var141 = this.field556.method561(-862);
                        int var142 = this.field556.method560(-123);
                        int var143 = this.field556.method536();
                        int var144 = this.field556.method560(-123);
                        class53.field1309[var141].field1296 = var142;
                        class53.field1309[var141].field1297 = var143;
                        class53.field1309[var141].field1295 = var144;
                        this.field343 = -1;
                        return true;
                    }
                    if (this.field343 == 56) {
                        this.field275 = this.field556.method554((byte) 112);
                        this.field276 = this.field556.method534();
                        for (int var145 = this.field275; var145 < this.field275 + 8; ++var145) {
                            for (int var146 = this.field276; var146 < this.field276 + 8; ++var146) {
                                if (this.field124[this.field144][var145][var146] != null) {
                                    this.field124[this.field144][var145][var146] = null;
                                    this.method93(var145, var146);
                                }
                            }
                        }
                        for (class42 var147 = (class42) this.field212.method201(); var147 != null; var147 = (class42) this.field212.method203((byte) 3)) {
                            if (var147.field1142 >= this.field275 && var147.field1142 < this.field275 + 8 && var147.field1143 >= this.field276 && var147.field1143 < this.field276 + 8 && this.field144 == var147.field1140) {
                                var147.field1139 = 0;
                            }
                        }
                        this.field343 = -1;
                        return true;
                    }
                    if (this.field343 == 195) {
                        int var148 = this.field556.method536();
                        class53.field1309[var148].field1320 = 3;
                        if (field313.field1182 == null) {
                            class53.field1309[var148].field1321 = (field313.field1186[11] << 5) + (field313.field1186[8] << 10) + (field313.field1186[0] << 15) + (field313.field1195[0] << 25) + (field313.field1195[4] << 20) + field313.field1186[1];
                        } else {
                            class53.field1309[var148].field1321 = (int) (field313.field1182.field1070 + 305419896L);
                        }
                        this.field343 = -1;
                        return true;
                    }
                    if (this.field343 == 216) {
                        int var149 = this.field556.method561(-862);
                        int var150 = this.field556.method536();
                        int var151 = this.field556.method561(-862);
                        class53.field1309[var151].field1274 = (var149 << 16) + var150;
                        this.field343 = -1;
                        return true;
                    }
                    if (this.field343 == 93) {
                        int var152 = this.field556.method563(0);
                        int var153 = this.field556.method536();
                        class53 var154 = class53.field1309[var153];
                        var154.field1299 = var152;
                        if (var152 == -1) {
                            var154.field1326 = 0;
                            var154.field1301 = 0;
                        }
                        this.field343 = -1;
                        return true;
                    }
                    if (this.field343 == 118) {
                        int var155 = this.field556.method561(-862);
                        if (var155 == 65535) {
                            var155 = -1;
                        }
                        if (this.field570 != var155 && this.field182 && !field372 && this.field538 == 0) {
                            this.field422 = var155;
                            this.field423 = true;
                            this.field364.method430(2, this.field422);
                        }
                        this.field570 = var155;
                        this.field343 = -1;
                        return true;
                    }
                    if (this.field343 == 175) {
                        int var156 = this.field556.method560(-123);
                        int var157 = this.field556.method538();
                        if (this.field182 && !field372) {
                            this.field422 = var156;
                            this.field423 = false;
                            this.field364.method430(2, this.field422);
                            this.field538 = var157;
                        }
                        this.field343 = -1;
                        return true;
                    }
                    if (this.field343 == 30) {
                        int var158 = this.field556.method559(0);
                        int var159 = this.field556.method559(0);
                        class53 var160 = class53.field1309[var159];
                        if (var160 != null && var160.field1330 == 0) {
                            if (var158 < 0) {
                                var158 = 0;
                            }
                            if (var158 > var160.field1312 - var160.field1307) {
                                var158 = var160.field1312 - var160.field1307;
                            }
                            var160.field1287 = var158;
                        }
                        this.field343 = -1;
                        return true;
                    }
                    if (this.field343 == 65) {
                        this.field275 = this.field556.method534();
                        this.field276 = this.field556.method553(3);
                        while (this.field556.field1643 < this.field342) {
                            int var161 = this.field556.method534();
                            this.method152(var161, this.field556, 5);
                        }
                        this.field343 = -1;
                        return true;
                    }
                    if (this.field343 == 198) {
                        this.method109(false);
                        this.field343 = -1;
                        return false;
                    }
                    if (this.field343 == 76) {
                        int var162 = this.field556.method560(-123);
                        class53 var163 = class53.field1309[var162];
                        for (int var164 = 0; var164 < var163.field1327.length; ++var164) {
                            var163.field1327[var164] = -1;
                            var163.field1327[var164] = 0;
                        }
                        this.field343 = -1;
                        return true;
                    }
                    if (this.field343 == 196) {
                        int var165 = this.field556.method536();
                        int var166 = this.field556.method534();
                        int var167 = this.field556.method536();
                        if (this.field120 && !field372 && this.field549 < 50) {
                            this.field404[this.field549] = var165;
                            this.field539[this.field549] = var166;
                            this.field564[this.field549] = class23.field858[var165] + var167;
                            ++this.field549;
                        }
                        this.field343 = -1;
                        return true;
                    }
                    if (this.field343 == 208) {
                        int var168 = this.field556.method559(0);
                        this.method133(true, var168);
                        if (this.field254 != -1) {
                            this.field254 = -1;
                            this.field498 = true;
                        }
                        if (this.field242 != 0) {
                            this.field242 = 0;
                            this.field498 = true;
                        }
                        this.field152 = var168;
                        this.field354 = true;
                        this.field577 = true;
                        this.field279 = -1;
                        this.field398 = false;
                        this.field343 = -1;
                        return true;
                    }
                    if (this.field343 == 13) {
                        int var169 = this.field556.method537();
                        int var170 = this.field556.method559(0);
                        int var171 = this.field556.method562(1);
                        class53 var172 = class53.field1309[var170];
                        var172.field1306 = var171;
                        var172.field1304 = var169;
                        this.field343 = -1;
                        return true;
                    }
                    if (this.field343 == 55) {
                        this.field127 = true;
                        this.field483 = this.field556.method534();
                        this.field484 = this.field556.method534();
                        this.field485 = this.field556.method536();
                        this.field486 = this.field556.method534();
                        this.field487 = this.field556.method534();
                        if (this.field487 >= 100) {
                            this.field504 = this.field483 * 128 + 64;
                            this.field506 = this.field484 * 128 + 64;
                            this.field505 = this.method91(0, this.field506, this.field144, this.field504) - this.field485;
                        }
                        this.field343 = -1;
                        return true;
                    }
                    if (this.field343 == 11) {
                        int var173 = this.field556.method560(-123);
                        boolean var174 = this.field556.method552(22736) == 1;
                        class53.field1309[var173].field1272 = var174;
                        this.field343 = -1;
                        return true;
                    }
                    if (this.field343 == 62) {
                        int var175 = this.field556.method561(-862);
                        int var176 = this.field556.method559(0);
                        class53.field1309[var176].field1320 = 2;
                        class53.field1309[var176].field1321 = var175;
                        this.field343 = -1;
                        return true;
                    }
                    if (this.field343 == 247) {
                        int var177 = this.field556.method560(-123);
                        int var178 = this.field556.method561(-862);
                        class53.field1309[var177].field1320 = 1;
                        class53.field1309[var177].field1321 = var178;
                        this.field343 = -1;
                        return true;
                    }
                    if (this.field343 == 142) {
                        this.field127 = true;
                        this.field160 = this.field556.method534();
                        this.field161 = this.field556.method534();
                        this.field162 = this.field556.method536();
                        this.field163 = this.field556.method534();
                        this.field164 = this.field556.method534();
                        if (this.field164 >= 100) {
                            int var179 = this.field160 * 128 + 64;
                            int var180 = this.field161 * 128 + 64;
                            int var181 = this.method91(0, var180, this.field144, var179) - this.field162;
                            int var182 = var179 - this.field504;
                            int var183 = var181 - this.field505;
                            int var184 = var180 - this.field506;
                            int var185 = (int) Math.sqrt((double) (var182 * var182 + var184 * var184));
                            this.field507 = (int) (Math.atan2((double) var183, (double) var185) * 325.949D) & 2047;
                            this.field508 = (int) (Math.atan2((double) var182, (double) var184) * -325.949D) & 2047;
                            if (this.field507 < 128) {
                                this.field507 = 128;
                            }
                            if (this.field507 > 383) {
                                this.field507 = 383;
                            }
                        }
                        this.field343 = -1;
                        return true;
                    }
                    if (this.field343 == 186) {
                        this.field400 = this.field556.method561(-862);
                        this.field430 = this.field556.method567(false);
                        this.field453 = this.field556.method552(22736);
                        this.field516 = this.field556.method553(3);
                        this.field459 = this.field556.method561(-862);
                        if (this.field430 != 0 && this.field279 == -1) {
                            signlink.dnslookup(class62.method489(-144, this.field430));
                            this.method63(5);
                            short var186 = 650;
                            if (this.field453 != 201 || this.field516 == 1) {
                                var186 = 655;
                            }
                            this.field414 = "";
                            this.field200 = false;
                            for (int var187 = 0; var187 < class53.field1309.length; ++var187) {
                                if (class53.field1309[var187] != null && class53.field1309[var187].field1317 == var186) {
                                    this.field279 = class53.field1309[var187].field1298;
                                    break;
                                }
                            }
                        }
                        this.field343 = -1;
                        return true;
                    }
                    signlink.reporterror("T1 - " + this.field343 + "," + this.field342 + " - " + this.field157 + "," + this.field158);
                    this.method109(false);
                } catch (IOException var192) {
                    this.method125(this.field219);
                } catch (Exception var193) {
                    String var189 = "T2 - " + this.field343 + "," + this.field157 + "," + this.field158 + " - " + this.field342 + "," + (field313.field1696[0] + this.field220) + "," + (field313.field1697[0] + this.field221) + " - ";
                    for (int var190 = 0; var190 < this.field342 && var190 < 50; ++var190) {
                        var189 = var189 + this.field556.field1642[var190] + ",";
                    }
                    signlink.reporterror(var189);
                    this.method109(false);
                }
                return true;
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(IILXJCNBMKS;)V")
    private final void method59(int arg0, int arg1, class68 arg2) {
        int var4 = 65 / arg1;
        this.field488 = 0;
        this.field233 = 0;
        this.method30(20585, arg0, arg2);
        this.method115(arg2, arg0, true);
        this.method122(arg2, arg0, false);
        this.method151(arg2, arg0, 5);
        for (int var5 = 0; var5 < this.field488; ++var5) {
            int var7 = this.field489[var5];
            if (field421 != this.field230[var7].field1681) {
                this.field230[var7] = null;
            }
        }
        if (arg2.field1643 != arg0) {
            signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg2.field1643 + " psize:" + arg0);
            throw new RuntimeException("eek");
        } else {
            for (int var6 = 0; var6 < this.field231; ++var6) {
                if (this.field230[this.field232[var6]] == null) {
                    signlink.reporterror(this.field300 + " null entry in pl list - pos:" + var6 + " size:" + this.field231);
                    throw new RuntimeException("eek");
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "run", descriptor = "()V")
    public final void run() {
        if (this.field396) {
            this.method33(false);
        } else {
            super.run();
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(III)Ljava/lang/String;")
    public static final String method60(int arg0, int arg1, int arg2) {
        int var3 = 15 / arg1;
        int var4 = arg2 - arg0;
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

    @OriginalMember(owner = "client", name = "a", descriptor = "(IBLXJCNBMKS;)V")
    private final void method61(int arg0, byte arg1, class68 arg2) {
        arg2.method544((byte) 7);
        int var4 = arg2.method545(true, 8);
        if (var4 < this.field357) {
            for (int var5 = var4; var5 < this.field357; ++var5) {
                this.field489[this.field488++] = this.field358[var5];
            }
        }
        if (var4 > this.field357) {
            signlink.reporterror(this.field300 + " Too many npcs");
            throw new RuntimeException("eek");
        } else {
            this.field357 = 0;
            if (arg1 != -27) {
                for (int var6 = 1; var6 > 0; ++var6) {
                }
            }
            for (int var7 = 0; var7 < var4; ++var7) {
                int var8 = this.field358[var7];
                class18 var9 = this.field356[var8];
                int var10 = arg2.method545(true, 1);
                if (var10 == 0) {
                    this.field358[this.field357++] = var8;
                    var9.field1681 = field421;
                } else {
                    int var11 = arg2.method545(true, 2);
                    if (var11 == 0) {
                        this.field358[this.field357++] = var8;
                        var9.field1681 = field421;
                        this.field234[this.field233++] = var8;
                    } else if (var11 == 1) {
                        this.field358[this.field357++] = var8;
                        var9.field1681 = field421;
                        int var12 = arg2.method545(true, 3);
                        var9.method584((byte) 9, false, var12);
                        int var13 = arg2.method545(true, 1);
                        if (var13 == 1) {
                            this.field234[this.field233++] = var8;
                        }
                    } else if (var11 == 2) {
                        this.field358[this.field357++] = var8;
                        var9.field1681 = field421;
                        int var14 = arg2.method545(true, 3);
                        var9.method584((byte) 9, true, var14);
                        int var15 = arg2.method545(true, 3);
                        var9.method584((byte) 9, true, var15);
                        int var16 = arg2.method545(true, 1);
                        if (var16 == 1) {
                            this.field234[this.field233++] = var8;
                        }
                    } else if (var11 == 3) {
                        this.field489[this.field488++] = var8;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIII)V")
    public final void method62(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field580.method166(arg3, arg2, (byte) 35);
        this.field581.method166(arg1 + arg3 - 16, arg2, (byte) 35);
        class22.method284(arg2, arg3 + 16, this.field411, 16, 47782, arg1 - 32);
        int var7 = (arg1 - 32) * arg1 / arg4;
        if (var7 < 8) {
            var7 = 8;
        }
        int var8 = (arg1 - 32 - var7) * arg0 / (arg4 - arg1);
        class22.method284(arg2, arg3 + 16 + var8, this.field480, 16, 47782, var7);
        class22.method289(11909, arg2, this.field424, arg3 + 16 + var8, var7);
        class22.method289(11909, arg2 + 1, this.field424, arg3 + 16 + var8, var7);
        class22.method287(this.field424, arg3 + 16 + var8, -166, 16, arg2);
        class22.method287(this.field424, arg3 + 17 + var8, -166, 16, arg2);
        class22.method289(11909, arg2 + 15, this.field351, arg3 + 16 + var8, var7);
        class22.method289(11909, arg2 + 14, this.field351, arg3 + 17 + var8, var7 - 1);
        class22.method287(this.field351, arg3 + 15 + var8 + var7, -166, 16, arg2);
        class22.method287(this.field351, arg3 + 14 + var8 + var7, -166, 15, arg2 + 1);
        if (arg5 >= 0) {
            ;
        }
    }

    @OriginalMember(owner = "client", name = "k", descriptor = "(I)V")
    public final void method63(int arg0) {
        this.field447.method523(252, 0);
        if (arg0 >= 5 && arg0 <= 5) {
            if (this.field152 != -1) {
                this.field152 = -1;
                this.field354 = true;
                this.field398 = false;
                this.field577 = true;
            }
            if (this.field254 != -1) {
                this.field254 = -1;
                this.field498 = true;
                this.field398 = false;
            }
            this.field279 = -1;
        }
    }

    @OriginalMember(owner = "client", name = "l", descriptor = "(I)V")
    public final void method64(int arg0) {
        int var2 = this.field483 * 128 + 64;
        int var3 = this.field484 * 128 + 64;
        int var4 = this.method91(0, var3, this.field144, var2) - this.field485;
        if (this.field504 < var2) {
            this.field504 += (var2 - this.field504) * this.field487 / 1000 + this.field486;
            if (this.field504 > var2) {
                this.field504 = var2;
            }
        }
        if (this.field504 > var2) {
            this.field504 -= (this.field504 - var2) * this.field487 / 1000 + this.field486;
            if (this.field504 < var2) {
                this.field504 = var2;
            }
        }
        if (this.field505 < var4) {
            this.field505 += (var4 - this.field505) * this.field487 / 1000 + this.field486;
            if (this.field505 > var4) {
                this.field505 = var4;
            }
        }
        if (this.field505 > var4) {
            this.field505 -= (this.field505 - var4) * this.field487 / 1000 + this.field486;
            if (this.field505 < var4) {
                this.field505 = var4;
            }
        }
        if (this.field506 < var3) {
            this.field506 += (var3 - this.field506) * this.field487 / 1000 + this.field486;
            if (this.field506 > var3) {
                this.field506 = var3;
            }
        }
        if (this.field506 > var3) {
            this.field506 -= (this.field506 - var3) * this.field487 / 1000 + this.field486;
            if (this.field506 < var3) {
                this.field506 = var3;
            }
        }
        int var5 = this.field160 * 128 + 64;
        int var6 = this.field161 * 128 + 64;
        int var7 = this.method91(0, var6, this.field144, var5) - this.field162;
        int var8 = var5 - this.field504;
        int var9 = var7 - this.field505;
        int var10 = var6 - this.field506;
        int var11 = (int) Math.sqrt((double) (var8 * var8 + var10 * var10));
        int var12 = (int) (Math.atan2((double) var9, (double) var11) * 325.949D) & 2047;
        int var13 = (int) (Math.atan2((double) var8, (double) var10) * -325.949D) & 2047;
        if (arg0 > 0) {
            if (var12 < 128) {
                var12 = 128;
            }
            if (var12 > 383) {
                var12 = 383;
            }
            if (this.field507 < var12) {
                this.field507 += (var12 - this.field507) * this.field164 / 1000 + this.field163;
                if (this.field507 > var12) {
                    this.field507 = var12;
                }
            }
            if (this.field507 > var12) {
                this.field507 -= (this.field507 - var12) * this.field164 / 1000 + this.field163;
                if (this.field507 < var12) {
                    this.field507 = var12;
                }
            }
            int var14 = var13 - this.field508;
            if (var14 > 1024) {
                var14 -= 2048;
            }
            if (var14 < -1024) {
                var14 += 2048;
            }
            if (var14 > 0) {
                this.field508 += this.field164 * var14 / 1000 + this.field163;
                this.field508 &= 2047;
            }
            if (var14 < 0) {
                this.field508 -= -var14 * this.field164 / 1000 + this.field163;
                this.field508 &= 2047;
            }
            int var15 = var13 - this.field508;
            if (var15 > 1024) {
                var15 -= 2048;
            }
            if (var15 < -1024) {
                var15 += 2048;
            }
            if (var15 < 0 && var14 > 0 || var15 > 0 && var14 < 0) {
                this.field508 = var13;
            }
        }
    }

    @OriginalMember(owner = "client", name = "m", descriptor = "(I)V")
    public final void method65(int arg0) {
        while (arg0 >= 0) {
            this.field447.method524(71);
        }
        this.field170 = 0;
        int var2 = (field313.field1721 >> 7) + this.field220;
        int var3 = (field313.field1722 >> 7) + this.field221;
        if (var2 >= 3053 && var2 <= 3156 && var3 >= 3056 && var3 <= 3136) {
            this.field170 = 1;
        }
        if (var2 >= 3072 && var2 <= 3118 && var3 >= 9492 && var3 <= 9535) {
            this.field170 = 1;
        }
        if (this.field170 == 1 && var2 >= 3139 && var2 <= 3199 && var3 >= 3008 && var3 <= 3062) {
            this.field170 = 0;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BLYHEHTOVP;I)V")
    public final void method66(byte arg0, class70 arg1, int arg2) {
        if (arg0 != 45) {
            for (int var4 = 1; var4 > 0; ++var4) {
            }
        }
        this.method67(-27, arg1.field1721, arg2, arg1.field1722);
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIII)V")
    public final void method67(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 >= 128 && arg3 >= 128 && arg1 <= 13056 && arg3 <= 13056) {
            int var5 = this.method91(0, arg3, this.field144, arg1) - arg2;
            int var6 = arg1 - this.field504;
            int var7 = var5 - this.field505;
            int var8 = arg3 - this.field506;
            int var9 = class19.field796[this.field507];
            int var10 = class19.field797[this.field507];
            if (arg0 < 0) {
                int var11 = class19.field796[this.field508];
                int var12 = class19.field797[this.field508];
                int var13 = var6 * var12 + var8 * var11 >> 16;
                int var14 = var8 * var12 - var6 * var11 >> 16;
                int var16 = var7 * var10 - var9 * var14 >> 16;
                int var17 = var7 * var9 + var10 * var14 >> 16;
                if (var17 >= 50) {
                    this.field348 = (var13 << 9) / var17 + class12.field635;
                    this.field349 = (var16 << 9) / var17 + class12.field636;
                } else {
                    this.field348 = -1;
                    this.field349 = -1;
                }
            }
        } else {
            this.field348 = -1;
            this.field349 = -1;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILjava/lang/String;)Z")
    public final boolean method68(int arg0, String arg1) {
        if (arg1 == null) {
            return false;
        } else {
            for (int var3 = 0; var3 < this.field128; ++var3) {
                if (arg1.equalsIgnoreCase(this.field177[var3])) {
                    return true;
                }
            }
            if (this.field217 != arg0) {
                this.method46();
            }
            return arg1.equalsIgnoreCase(field313.field1193);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(I)V")
    public final void method69(int arg0) {
        signlink.reporterror = false;
        try {
            if (this.field209 != null) {
                this.field209.method192();
            }
        } catch (Exception var2) {
        }
        this.field209 = null;
        this.method96(1);
        if (this.field292 != null) {
            this.field292.field886 = false;
        }
        this.field292 = null;
        this.field364.method442();
        this.field364 = null;
        this.field355 = null;
        this.field447 = null;
        this.field558 = null;
        this.field556 = null;
        this.field366 = null;
        this.field289 = null;
        this.field194 = null;
        this.field367 = null;
        this.field368 = null;
        this.field347 = null;
        this.field515 = null;
        this.field227 = null;
        this.field139 = null;
        this.field137 = null;
        this.field299 = null;
        this.field405 = null;
        this.field406 = null;
        this.field267 = null;
        this.field377 = null;
        this.field378 = null;
        this.field379 = null;
        this.field380 = null;
        this.field179 = null;
        this.field180 = null;
        this.field181 = null;
        this.field528 = null;
        this.field529 = null;
        this.field530 = null;
        if (arg0 >= 0) {
            this.field343 = -1;
        }
        this.field531 = null;
        this.field532 = null;
        this.field533 = null;
        this.field534 = null;
        this.field535 = null;
        this.field536 = null;
        this.field574 = null;
        this.field575 = null;
        this.field576 = null;
        this.field476 = null;
        this.field477 = null;
        this.field478 = null;
        this.field523 = null;
        this.field237 = null;
        this.field238 = null;
        this.field239 = null;
        this.field240 = null;
        this.field241 = null;
        this.field565 = null;
        this.field566 = null;
        this.field567 = null;
        this.field568 = null;
        this.field569 = null;
        this.field293 = null;
        this.field201 = null;
        this.field448 = null;
        this.field353 = null;
        this.field269 = null;
        this.field270 = null;
        this.field271 = null;
        this.field272 = null;
        this.field273 = null;
        this.field579 = null;
        this.field586 = null;
        this.field175 = null;
        this.field230 = null;
        this.field232 = null;
        this.field234 = null;
        this.field235 = null;
        this.field489 = null;
        this.field356 = null;
        this.field358 = null;
        this.field124 = null;
        this.field212 = null;
        this.field458 = null;
        this.field417 = null;
        this.field284 = null;
        this.field285 = null;
        this.field286 = null;
        this.field287 = null;
        this.field131 = null;
        this.field584 = null;
        this.field311 = null;
        this.field312 = null;
        this.field281 = null;
        this.field318 = null;
        this.field177 = null;
        this.field403 = null;
        this.field339 = null;
        this.field333 = null;
        this.field334 = null;
        this.field330 = null;
        this.field331 = null;
        this.field332 = null;
        this.field335 = null;
        this.field336 = null;
        this.field337 = null;
        this.field338 = null;
        this.method55((byte) 74);
        class58.method452(0);
        class37.method363(0);
        class5.method12(0);
        class34.field1045 = null;
        class44.field1169 = null;
        class53.field1309 = null;
        class3.field26 = null;
        class21.field817 = null;
        class66.field1605 = null;
        class66.field1617 = null;
        class41.field1125 = null;
        super.field1520 = null;
        class45.field1192 = null;
        class12.method170(0);
        class28.method305(0);
        class19.method246(0);
        class55.method426(0);
        System.gc();
        if (class47.field1218) {
        }
    }

    @OriginalMember(owner = "client", name = "k", descriptor = "(B)V")
    public final void method70(byte arg0) {
        this.field340 = new class9(this.field490, "titlebox", 0);
        this.field341 = new class9(this.field490, "titlebutton", 0);
        this.field471 = new class9[12];
        if (arg0 != -78) {
            this.field562 = !this.field562;
        }
        int var2 = 0;
        try {
            var2 = Integer.parseInt(this.getParameter("fl_icon"));
        } catch (Exception var19) {
        }
        if (var2 == 0) {
            for (int var3 = 0; var3 < 12; ++var3) {
                this.field471[var3] = new class9(this.field490, "runes", var3);
            }
        } else {
            for (int var4 = 0; var4 < 12; ++var4) {
                this.field471[var4] = new class9(this.field490, "runes", (var4 & 3) + 12);
            }
        }
        this.field145 = new class69(128, 265);
        this.field146 = new class69(128, 265);
        for (int var5 = 0; var5 < 33920; ++var5) {
            this.field145.field1662[var5] = this.field333.field1727[var5];
        }
        for (int var6 = 0; var6 < 33920; ++var6) {
            this.field146.field1662[var6] = this.field334.field1727[var6];
        }
        this.field249 = new int[256];
        for (int var7 = 0; var7 < 64; ++var7) {
            this.field249[var7] = var7 * 262144;
        }
        for (int var8 = 0; var8 < 64; ++var8) {
            this.field249[var8 + 64] = var8 * 1024 + 16711680;
        }
        for (int var9 = 0; var9 < 64; ++var9) {
            this.field249[var9 + 128] = var9 * 4 + 16776960;
        }
        for (int var10 = 0; var10 < 64; ++var10) {
            this.field249[var10 + 192] = 16777215;
        }
        this.field250 = new int[256];
        for (int var11 = 0; var11 < 64; ++var11) {
            this.field250[var11] = var11 * 1024;
        }
        for (int var12 = 0; var12 < 64; ++var12) {
            this.field250[var12 + 64] = var12 * 4 + 65280;
        }
        for (int var13 = 0; var13 < 64; ++var13) {
            this.field250[var13 + 128] = var13 * 262144 + 65535;
        }
        for (int var14 = 0; var14 < 64; ++var14) {
            this.field250[var14 + 192] = 16777215;
        }
        this.field251 = new int[256];
        for (int var15 = 0; var15 < 64; ++var15) {
            this.field251[var15] = var15 * 4;
        }
        for (int var16 = 0; var16 < 64; ++var16) {
            this.field251[var16 + 64] = var16 * 262144 + 255;
        }
        for (int var17 = 0; var17 < 64; ++var17) {
            this.field251[var17 + 128] = var17 * 1024 + 16711935;
        }
        for (int var18 = 0; var18 < 64; ++var18) {
            this.field251[var18 + 192] = 16777215;
        }
        this.field248 = new int[256];
        this.field260 = new int[32768];
        this.field261 = new int[32768];
        this.method153(0, (class9) null);
        this.field415 = new int[32768];
        this.field416 = new int[32768];
        this.method107(10, false, "Connecting to fileserver");
        if (!this.field363) {
            this.field396 = true;
            this.field363 = true;
            this.method106(this, 2);
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(IIIIII)V")
    public final void method71(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != 1) {
            for (int var7 = 1; var7 > 0; ++var7) {
            }
        }
        int var8 = this.field227.method332(arg2, arg5, arg0);
        if (var8 != 0) {
            int var9 = this.field227.method336(arg2, arg5, arg0, var8);
            int var10 = var9 >> 6 & 3;
            int var11 = var9 & 31;
            int var12 = arg4;
            if (var8 > 0) {
                var12 = arg3;
            }
            int[] var13 = this.field318.field1662;
            int var14 = (103 - arg0) * 512 * 4 + arg5 * 4 + 24624;
            int var15 = var8 >> 14 & 32767;
            class58 var16 = class58.method455(var15);
            if (var16.field1451 != -1) {
                class9 var17 = this.field579[var16.field1451];
                if (var17 != null) {
                    int var18 = (var16.field1450 * 4 - var17.field609) / 2;
                    int var19 = (var16.field1439 * 4 - var17.field610) / 2;
                    var17.method166((104 - arg0 - var16.field1439) * 4 + 48 + var19, arg5 * 4 + 48 + var18, (byte) 35);
                }
            } else {
                if (var11 == 0 || var11 == 2) {
                    if (var10 == 0) {
                        var13[var14] = var12;
                        var13[var14 + 512] = var12;
                        var13[var14 + 1024] = var12;
                        var13[var14 + 1536] = var12;
                    } else if (var10 == 1) {
                        var13[var14] = var12;
                        var13[var14 + 1] = var12;
                        var13[var14 + 2] = var12;
                        var13[var14 + 3] = var12;
                    } else if (var10 == 2) {
                        var13[var14 + 3] = var12;
                        var13[var14 + 3 + 512] = var12;
                        var13[var14 + 3 + 1024] = var12;
                        var13[var14 + 3 + 1536] = var12;
                    } else if (var10 == 3) {
                        var13[var14 + 1536] = var12;
                        var13[var14 + 1536 + 1] = var12;
                        var13[var14 + 1536 + 2] = var12;
                        var13[var14 + 1536 + 3] = var12;
                    }
                }
                if (var11 == 3) {
                    if (var10 == 0) {
                        var13[var14] = var12;
                    } else if (var10 == 1) {
                        var13[var14 + 3] = var12;
                    } else if (var10 == 2) {
                        var13[var14 + 3 + 1536] = var12;
                    } else if (var10 == 3) {
                        var13[var14 + 1536] = var12;
                    }
                }
                if (var11 == 2) {
                    if (var10 == 3) {
                        var13[var14] = var12;
                        var13[var14 + 512] = var12;
                        var13[var14 + 1024] = var12;
                        var13[var14 + 1536] = var12;
                    } else if (var10 == 0) {
                        var13[var14] = var12;
                        var13[var14 + 1] = var12;
                        var13[var14 + 2] = var12;
                        var13[var14 + 3] = var12;
                    } else if (var10 == 1) {
                        var13[var14 + 3] = var12;
                        var13[var14 + 3 + 512] = var12;
                        var13[var14 + 3 + 1024] = var12;
                        var13[var14 + 3 + 1536] = var12;
                    } else if (var10 == 2) {
                        var13[var14 + 1536] = var12;
                        var13[var14 + 1536 + 1] = var12;
                        var13[var14 + 1536 + 2] = var12;
                        var13[var14 + 1536 + 3] = var12;
                    }
                }
            }
        }
        int var20 = this.field227.method334(arg2, arg5, arg0);
        if (var20 != 0) {
            int var21 = this.field227.method336(arg2, arg5, arg0, var20);
            int var22 = var21 >> 6 & 3;
            int var23 = var21 & 31;
            int var24 = var20 >> 14 & 32767;
            class58 var25 = class58.method455(var24);
            if (var25.field1451 != -1) {
                class9 var26 = this.field579[var25.field1451];
                if (var26 != null) {
                    int var27 = (var25.field1450 * 4 - var26.field609) / 2;
                    int var28 = (var25.field1439 * 4 - var26.field610) / 2;
                    var26.method166((104 - arg0 - var25.field1439) * 4 + 48 + var28, arg5 * 4 + 48 + var27, (byte) 35);
                }
            } else if (var23 == 9) {
                int var29 = 15658734;
                if (var20 > 0) {
                    var29 = 15597568;
                }
                int[] var30 = this.field318.field1662;
                int var31 = (103 - arg0) * 512 * 4 + arg5 * 4 + 24624;
                if (var22 != 0 && var22 != 2) {
                    var30[var31] = var29;
                    var30[var31 + 512 + 1] = var29;
                    var30[var31 + 1024 + 2] = var29;
                    var30[var31 + 1536 + 3] = var29;
                } else {
                    var30[var31 + 1536] = var29;
                    var30[var31 + 1024 + 1] = var29;
                    var30[var31 + 512 + 2] = var29;
                    var30[var31 + 3] = var29;
                }
            }
        }
        int var32 = this.field227.method335(arg2, arg5, arg0);
        if (var32 != 0) {
            int var33 = var32 >> 14 & 32767;
            class58 var34 = class58.method455(var33);
            if (var34.field1451 != -1) {
                class9 var35 = this.field579[var34.field1451];
                if (var35 != null) {
                    int var36 = (var34.field1450 * 4 - var35.field609) / 2;
                    int var37 = (var34.field1439 * 4 - var35.field610) / 2;
                    var35.method166((104 - arg0 - var34.field1439) * 4 + 48 + var37, arg5 * 4 + 48 + var36, (byte) 35);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "n", descriptor = "(I)V")
    public final void method72(int arg0) {
        this.field342 += arg0;
        if (super.field1533 == 1) {
            if (super.field1534 >= 539 && super.field1534 <= 573 && super.field1535 >= 169 && super.field1535 < 205 && this.field150[0] != -1) {
                this.field354 = true;
                this.field256 = 0;
                this.field577 = true;
            }
            if (super.field1534 >= 569 && super.field1534 <= 599 && super.field1535 >= 168 && super.field1535 < 205 && this.field150[1] != -1) {
                this.field354 = true;
                this.field256 = 1;
                this.field577 = true;
            }
            if (super.field1534 >= 597 && super.field1534 <= 627 && super.field1535 >= 168 && super.field1535 < 205 && this.field150[2] != -1) {
                this.field354 = true;
                this.field256 = 2;
                this.field577 = true;
            }
            if (super.field1534 >= 625 && super.field1534 <= 669 && super.field1535 >= 168 && super.field1535 < 203 && this.field150[3] != -1) {
                this.field354 = true;
                this.field256 = 3;
                this.field577 = true;
            }
            if (super.field1534 >= 666 && super.field1534 <= 696 && super.field1535 >= 168 && super.field1535 < 205 && this.field150[4] != -1) {
                this.field354 = true;
                this.field256 = 4;
                this.field577 = true;
            }
            if (super.field1534 >= 694 && super.field1534 <= 724 && super.field1535 >= 168 && super.field1535 < 205 && this.field150[5] != -1) {
                this.field354 = true;
                this.field256 = 5;
                this.field577 = true;
            }
            if (super.field1534 >= 722 && super.field1534 <= 756 && super.field1535 >= 169 && super.field1535 < 205 && this.field150[6] != -1) {
                this.field354 = true;
                this.field256 = 6;
                this.field577 = true;
            }
            if (super.field1534 >= 540 && super.field1534 <= 574 && super.field1535 >= 466 && super.field1535 < 502 && this.field150[7] != -1) {
                this.field354 = true;
                this.field256 = 7;
                this.field577 = true;
            }
            if (super.field1534 >= 572 && super.field1534 <= 602 && super.field1535 >= 466 && super.field1535 < 503 && this.field150[8] != -1) {
                this.field354 = true;
                this.field256 = 8;
                this.field577 = true;
            }
            if (super.field1534 >= 599 && super.field1534 <= 629 && super.field1535 >= 466 && super.field1535 < 503 && this.field150[9] != -1) {
                this.field354 = true;
                this.field256 = 9;
                this.field577 = true;
            }
            if (super.field1534 >= 627 && super.field1534 <= 671 && super.field1535 >= 467 && super.field1535 < 502 && this.field150[10] != -1) {
                this.field354 = true;
                this.field256 = 10;
                this.field577 = true;
            }
            if (super.field1534 >= 669 && super.field1534 <= 699 && super.field1535 >= 466 && super.field1535 < 503 && this.field150[11] != -1) {
                this.field354 = true;
                this.field256 = 11;
                this.field577 = true;
            }
            if (super.field1534 >= 696 && super.field1534 <= 726 && super.field1535 >= 466 && super.field1535 < 503 && this.field150[12] != -1) {
                this.field354 = true;
                this.field256 = 12;
                this.field577 = true;
            }
            if (super.field1534 >= 724 && super.field1534 <= 758 && super.field1535 >= 466 && super.field1535 < 502 && this.field150[13] != -1) {
                this.field354 = true;
                this.field256 = 13;
                this.field577 = true;
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Z)V")
    public final void method73(boolean arg0) {
        if (!this.field319 && !this.field277 && !this.field408) {
            ++field421;
            if (!this.field452) {
                this.method92(-172);
            } else {
                this.method97(18097);
            }
            this.method156(false);
            this.field452 &= arg0;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZLRWLOYYVC;)Z")
    public final boolean method74(boolean arg0, class53 arg1) {
        if (arg0) {
            field426 = 20;
        }
        int var3 = arg1.field1317;
        if ((var3 < 1 || var3 > 200) && (var3 < 701 || var3 > 900)) {
            if (var3 >= 401 && var3 <= 500) {
                this.field131[this.field122] = "Remove @whi@" + arg1.field1291;
                this.field286[this.field122] = 355;
                ++this.field122;
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
            this.field131[this.field122] = "Remove @whi@" + this.field177[var3];
            this.field286[this.field122] = 163;
            ++this.field122;
            this.field131[this.field122] = "Message @whi@" + this.field177[var3];
            this.field286[this.field122] = 643;
            ++this.field122;
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "j", descriptor = "(Z)V")
    public final void method75(boolean arg0) {
        this.field452 &= arg0;
        if (super.field1533 == 1) {
            if (super.field1534 >= 6 && super.field1534 <= 106 && super.field1535 >= 467 && super.field1535 <= 499) {
                this.field527 = (this.field527 + 1) % 4;
                this.field169 = true;
                this.field498 = true;
                this.field447.method523(36, 0);
                this.field447.method524(this.field527);
                this.field447.method524(this.field410);
                this.field447.method524(this.field176);
            }
            if (super.field1534 >= 135 && super.field1534 <= 235 && super.field1535 >= 467 && super.field1535 <= 499) {
                this.field410 = (this.field410 + 1) % 3;
                this.field169 = true;
                this.field498 = true;
                this.field447.method523(36, 0);
                this.field447.method524(this.field527);
                this.field447.method524(this.field410);
                this.field447.method524(this.field176);
            }
            if (super.field1534 >= 273 && super.field1534 <= 373 && super.field1535 >= 467 && super.field1535 <= 499) {
                this.field176 = (this.field176 + 1) % 3;
                this.field169 = true;
                this.field498 = true;
                this.field447.method523(36, 0);
                this.field447.method524(this.field527);
                this.field447.method524(this.field410);
                this.field447.method524(this.field176);
            }
            if (super.field1534 >= 412 && super.field1534 <= 512 && super.field1535 >= 467 && super.field1535 <= 499) {
                if (this.field279 == -1) {
                    this.method63(5);
                    this.field414 = "";
                    this.field200 = false;
                    for (int var2 = 0; var2 < class53.field1309.length; ++var2) {
                        if (class53.field1309[var2] != null && class53.field1309[var2].field1317 == 600) {
                            this.field198 = this.field279 = class53.field1309[var2].field1298;
                            return;
                        }
                    }
                    return;
                }
                this.method26(0, "Please close the interface you have open before using 'report abuse'", "", 0);
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "l", descriptor = "(B)V")
    public final void method76(byte arg0) {
        if (this.field509 != 0) {
            class60 var2 = this.field141;
            int var3 = 0;
            if (arg0 == 0) {
                if (this.field385 != 0) {
                    var3 = 1;
                }
                for (int var4 = 0; var4 < 100; ++var4) {
                    if (this.field245[var4] != null) {
                        int var5 = this.field243[var4];
                        String var6 = this.field244[var4];
                        byte var7 = 0;
                        if (var6 != null && var6.startsWith("@cr1@")) {
                            var6 = var6.substring(5);
                            var7 = 1;
                        }
                        if (var6 != null && var6.startsWith("@cr2@")) {
                            var6 = var6.substring(5);
                            var7 = 2;
                        }
                        if ((var5 == 3 || var5 == 7) && (var5 == 7 || this.field410 == 0 || this.field410 == 1 && this.method68(46314, var6))) {
                            int var8 = 329 - var3 * 13;
                            byte var9 = 4;
                            var2.method470(var9, "From", 0, var8, 1);
                            var2.method470(var9, "From", 65535, var8 - 1, 1);
                            int var10 = var9 + var2.method468("From ", (byte) 12);
                            if (var7 == 1) {
                                this.field213[0].method166(var8 - 12, var10, (byte) 35);
                                var10 += 14;
                            }
                            if (var7 == 2) {
                                this.field213[1].method166(var8 - 12, var10, (byte) 35);
                                var10 += 14;
                            }
                            var2.method470(var10, var6 + ": " + this.field245[var4], 0, var8, 1);
                            var2.method470(var10, var6 + ": " + this.field245[var4], 65535, var8 - 1, 1);
                            ++var3;
                            if (var3 >= 5) {
                                return;
                            }
                        }
                        if (var5 == 5 && this.field410 < 2) {
                            int var11 = 329 - var3 * 13;
                            var2.method470(4, this.field245[var4], 0, var11, 1);
                            var2.method470(4, this.field245[var4], 65535, var11 - 1, 1);
                            ++var3;
                            if (var3 >= 5) {
                                return;
                            }
                        }
                        if (var5 == 6 && this.field410 < 2) {
                            int var12 = 329 - var3 * 13;
                            var2.method470(4, "To " + var6 + ": " + this.field245[var4], 0, var12, 1);
                            var2.method470(4, "To " + var6 + ": " + this.field245[var4], 65535, var12 - 1, 1);
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

    @OriginalMember(owner = "client", name = "a", descriptor = "(IZLRWLOYYVC;)I")
    public final int method77(int arg0, boolean arg1, class53 arg2) {
        if (!arg1) {
            this.field124 = null;
        }
        if (arg2.field1328 != null && arg0 < arg2.field1328.length) {
            try {
                int[] var4 = arg2.field1328[arg0];
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
                        var9 = this.field197[var4[var6++]];
                    }
                    if (var8 == 2) {
                        var9 = this.field479[var4[var6++]];
                    }
                    if (var8 == 3) {
                        var9 = this.field383[var4[var6++]];
                    }
                    if (var8 == 4) {
                        class53 var11 = class53.field1309[var4[var6++]];
                        int var12 = var4[var6++];
                        if (var12 >= 0 && var12 < class5.field52 && (!class5.method13(var12).field75 || field371)) {
                            for (int var13 = 0; var13 < var11.field1327.length; ++var13) {
                                if (var12 + 1 == var11.field1327[var13]) {
                                    var9 += var11.field1289[var13];
                                }
                            }
                        }
                    }
                    if (var8 == 5) {
                        var9 = this.field584[var4[var6++]];
                    }
                    if (var8 == 6) {
                        var9 = field133[this.field479[var4[var6++]] - 1];
                    }
                    if (var8 == 7) {
                        var9 = this.field584[var4[var6++]] * 100 / 46875;
                    }
                    if (var8 == 8) {
                        var9 = field313.field1183;
                    }
                    if (var8 == 9) {
                        for (int var14 = 0; var14 < class35.field1057; ++var14) {
                            if (class35.field1059[var14]) {
                                var9 += this.field479[var14];
                            }
                        }
                    }
                    if (var8 == 10) {
                        class53 var15 = class53.field1309[var4[var6++]];
                        int var16 = var4[var6++] + 1;
                        if (var16 >= 0 && var16 < class5.field52 && (!class5.method13(var16).field75 || field371)) {
                            for (int var17 = 0; var17 < var15.field1327.length; ++var17) {
                                if (var15.field1327[var17] == var16) {
                                    var9 = 999999999;
                                    break;
                                }
                            }
                        }
                    }
                    if (var8 == 11) {
                        var9 = this.field125;
                    }
                    if (var8 == 12) {
                        var9 = this.field166;
                    }
                    if (var8 == 13) {
                        int var18 = this.field584[var4[var6++]];
                        int var19 = var4[var6++];
                        var9 = (var18 & 1 << var19) != 0 ? 1 : 0;
                    }
                    if (var8 == 14) {
                        int var20 = var4[var6++];
                        class67 var21 = class67.field1619[var20];
                        int var22 = var21.field1621;
                        int var23 = var21.field1622;
                        int var24 = var21.field1623;
                        int var25 = field257[var24 - var23];
                        var9 = this.field584[var22] >> var23 & var25;
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
                        var9 = (field313.field1721 >> 7) + this.field220;
                    }
                    if (var8 == 19) {
                        var9 = (field313.field1722 >> 7) + this.field221;
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

    @OriginalMember(owner = "client", name = "k", descriptor = "(Z)V")
    public final void method78(boolean arg0) {
        if (arg0) {
            this.field343 = this.field556.method534();
        }
        try {
            int var2 = field313.field1721 + this.field431;
            int var3 = field313.field1722 + this.field427;
            if (this.field263 - var2 < -500 || this.field263 - var2 > 500 || this.field264 - var3 < -500 || this.field264 - var3 > 500) {
                this.field263 = var2;
                this.field264 = var3;
            }
            if (this.field263 != var2) {
                this.field263 += (var2 - this.field263) / 16;
            }
            if (this.field264 != var3) {
                this.field264 += (var3 - this.field264) / 16;
            }
            if (super.field1537[1] == 1) {
                this.field206 += (-24 - this.field206) / 2;
            } else if (super.field1537[2] == 1) {
                this.field206 += (24 - this.field206) / 2;
            } else {
                this.field206 /= 2;
            }
            if (super.field1537[3] == 1) {
                this.field207 += (12 - this.field207) / 2;
            } else if (super.field1537[4] == 1) {
                this.field207 += (-12 - this.field207) / 2;
            } else {
                this.field207 /= 2;
            }
            this.field205 = this.field206 / 2 + this.field205 & 2047;
            this.field204 += this.field207 / 2;
            if (this.field204 < 128) {
                this.field204 = 128;
            }
            if (this.field204 > 383) {
                this.field204 = 383;
            }
            ++field135;
            if (field135 > 190) {
                field135 = 0;
                this.field447.method523(131, 0);
                this.field447.method527(12235807);
            }
            int var4 = this.field263 >> 7;
            int var5 = this.field264 >> 7;
            int var6 = this.method91(0, this.field264, this.field144, this.field263);
            int var7 = 0;
            if (var4 > 3 && var5 > 3 && var4 < 100 && var5 < 100) {
                for (int var8 = var4 - 4; var8 <= var4 + 4; ++var8) {
                    for (int var9 = var5 - 4; var9 <= var5 + 4; ++var9) {
                        int var10 = this.field144;
                        if (var10 < 3 && (this.field515[1][var8][var9] & 2) == 2) {
                            ++var10;
                        }
                        int var11 = var6 - this.field347[var10][var8][var9];
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
            if (var12 > this.field444) {
                this.field444 += (var12 - this.field444) / 24;
            } else if (var12 < this.field444) {
                this.field444 += (var12 - this.field444) / 80;
            }
        } catch (Exception var13) {
            signlink.reporterror("glfc_ex " + field313.field1721 + "," + field313.field1722 + "," + this.field263 + "," + this.field264 + "," + this.field187 + "," + this.field188 + "," + this.field220 + "," + this.field221);
            throw new RuntimeException("eek");
        }
    }

    @OriginalMember(owner = "client", name = "o", descriptor = "(I)V")
    public final void method79(int arg0) {
        this.method76((byte) 0);
        if (arg0 != 2) {
            this.field514 = 57;
        }
        if (this.field592 == 1) {
            this.field353[this.field591 / 100].method576(this.field590 - 8 - 4, this.field589 - 8 - 4, (byte) 35);
            ++field153;
            if (field153 > 73) {
                field153 = 0;
                this.field447.method523(83, 0);
            }
        }
        if (this.field592 == 2) {
            this.field353[this.field591 / 100 + 4].method576(this.field590 - 8 - 4, this.field589 - 8 - 4, (byte) 35);
            ++field537;
            if (field537 > 102) {
                field537 = 0;
                this.field447.method523(148, 0);
                this.field447.method524(197);
            }
        }
        if (this.field186 != -1) {
            this.method57(this.field186, -217, this.field304);
            this.method158(class53.field1309[this.field186], 0, 0, 0, (byte) 7);
        }
        if (this.field279 != -1) {
            this.method57(this.field279, -217, this.field304);
            this.method158(class53.field1309[this.field279], 0, 0, 0, (byte) 7);
        }
        this.method65(-592);
        if (!this.field320) {
            this.method132(true);
            this.method81(-566);
        } else if (this.field460 == 0) {
            this.method126(true);
        }
        if (this.field362 == 1) {
            this.field448[1].method576(296, 472, (byte) 35);
        }
        if (field451) {
            short var2 = 507;
            byte var3 = 20;
            int var4 = 16776960;
            if (super.field1515 < 15) {
                var4 = 16711680;
            }
            this.field141.method465(var2, var4, this.field390, var3, "Fps:" + super.field1515);
            int var12 = var3 + 15;
            Runtime var5 = Runtime.getRuntime();
            int var6 = (int) ((var5.totalMemory() - var5.freeMemory()) / 1024L);
            int var7 = 16776960;
            if (var6 > 33554432 && field372) {
                int var8 = 16711680;
            }
            this.field141.method465(var2, 16776960, this.field390, var12, "Mem:" + var6 + "k");
            var12 += 15;
        }
        if (this.field385 != 0) {
            int var9 = this.field385 / 50;
            int var10 = var9 / 60;
            int var11 = var9 % 60;
            if (var11 < 10) {
                this.field141.method470(4, "System update in: " + var10 + ":0" + var11, 16776960, 329, 1);
            } else {
                this.field141.method470(4, "System update in: " + var10 + ":" + var11, 16776960, 329, 1);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIIIII)V")
    private final void method80(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        label105: while (true) {
            if (arg7 >= 0) {
                int var21 = 1;
                while (true) {
                    if (var21 <= 0) {
                        continue label105;
                    }
                    ++var21;
                }
            }
            if (arg5 >= 1 && arg2 >= 1 && arg5 <= 102 && arg2 <= 102) {
                if (field372 && this.field144 != arg1) {
                    return;
                }
                int var9 = 0;
                boolean var10 = true;
                boolean var11 = false;
                boolean var12 = false;
                if (arg6 == 0) {
                    var9 = this.field227.method332(arg1, arg5, arg2);
                }
                if (arg6 == 1) {
                    var9 = this.field227.method333(arg2, true, arg5, arg1);
                }
                if (arg6 == 2) {
                    var9 = this.field227.method334(arg1, arg5, arg2);
                }
                if (arg6 == 3) {
                    var9 = this.field227.method335(arg1, arg5, arg2);
                }
                if (var9 != 0) {
                    int var13 = this.field227.method336(arg1, arg5, arg2, var9);
                    int var14 = var9 >> 14 & 32767;
                    int var15 = var13 & 31;
                    int var16 = var13 >> 6;
                    if (arg6 == 0) {
                        this.field227.method323(arg5, arg1, (byte) -95, arg2);
                        class58 var17 = class58.method455(var14);
                        if (var17.field1483) {
                            this.field139[arg1].method376(arg2, -19182, var17.field1445, var15, arg5, var16);
                        }
                    }
                    if (arg6 == 1) {
                        this.field227.method324(arg2, arg5, arg1, true);
                    }
                    if (arg6 == 2) {
                        this.field227.method325(-129, arg2, arg5, arg1);
                        class58 var18 = class58.method455(var14);
                        if (var18.field1450 + arg5 > 103 || var18.field1450 + arg2 > 103 || var18.field1439 + arg5 > 103 || var18.field1439 + arg2 > 103) {
                            return;
                        }
                        if (var18.field1483) {
                            this.field139[arg1].method377(var18.field1445, arg5, (byte) 6, var18.field1450, var18.field1439, var16, arg2);
                        }
                    }
                    if (arg6 == 3) {
                        this.field227.method326(arg5, arg1, 0, arg2);
                        class58 var19 = class58.method455(var14);
                        if (var19.field1483 && var19.field1448) {
                            this.field139[arg1].method379(arg5, 397, arg2);
                        }
                    }
                }
                if (arg0 >= 0) {
                    int var20 = arg1;
                    if (arg1 < 3 && (this.field515[1][arg5][arg2] & 2) == 2) {
                        var20 = arg1 + 1;
                    }
                    class63.method510(true, arg2, arg1, arg3, arg5, this.field227, this.field139[arg1], var20, arg4, this.field347, arg0);
                    return;
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client", name = "p", descriptor = "(I)V")
    public final void method81(int arg0) {
        if (this.field122 >= 2 || this.field391 != 0 || this.field518 != 0) {
            String var2;
            if (this.field391 == 1 && this.field122 < 2) {
                var2 = "Use " + this.field395 + " with...";
            } else if (this.field518 == 1 && this.field122 < 2) {
                var2 = this.field521 + "...";
            } else {
                var2 = this.field131[this.field122 - 1];
            }
            if (this.field122 > 2) {
                var2 = var2 + "@whi@ / " + (this.field122 - 2) + " more options";
            }
            this.field142.method475(var2, 16777215, true, 4, false, field421 / 1000, 15);
            while (arg0 >= 0) {
                for (int var3 = 1; var3 > 0; ++var3) {
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIIIIZIIII)Z")
    public final boolean method82(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11) {
        byte var13 = 104;
        byte var14 = 104;
        for (int var15 = 0; var15 < var13; ++var15) {
            for (int var35 = 0; var35 < var14; ++var35) {
                this.field137[var15][var35] = 0;
                this.field299[var15][var35] = 99999999;
            }
        }
        int var16 = arg5;
        int var17 = arg8;
        this.field137[arg5][arg8] = 99;
        this.field299[arg5][arg8] = 0;
        byte var18 = 0;
        int var19 = 0;
        this.field405[var18] = arg5;
        int var36 = var18 + 1;
        this.field406[var18] = arg8;
        if (arg1 != 0) {
            field308 = !field308;
        }
        boolean var20 = false;
        int var21 = this.field405.length;
        int[][] var22 = this.field139[this.field144].field1163;
        while (var36 != var19) {
            var16 = this.field405[var19];
            var17 = this.field406[var19];
            var19 = (var19 + 1) % var21;
            if (arg6 == var16 && arg9 == var17) {
                var20 = true;
                break;
            }
            if (arg11 != 0) {
                if ((arg11 < 5 || arg11 == 10) && this.field139[this.field144].method380(var16, arg11 - 1, -776, arg6, var17, arg10, arg9)) {
                    var20 = true;
                    break;
                }
                if (arg11 < 10 && this.field139[this.field144].method381(arg10, 0, arg11 - 1, arg9, var16, var17, arg6)) {
                    var20 = true;
                    break;
                }
            }
            if (arg0 != 0 && arg2 != 0 && this.field139[this.field144].method382(arg0, arg9, -53, var17, arg4, arg2, var16, arg6)) {
                var20 = true;
                break;
            }
            int var34 = this.field299[var16][var17] + 1;
            if (var16 > 0 && this.field137[var16 - 1][var17] == 0 && (var22[var16 - 1][var17] & 19398920) == 0) {
                this.field405[var36] = var16 - 1;
                this.field406[var36] = var17;
                var36 = (var36 + 1) % var21;
                this.field137[var16 - 1][var17] = 2;
                this.field299[var16 - 1][var17] = var34;
            }
            if (var16 < var13 - 1 && this.field137[var16 + 1][var17] == 0 && (var22[var16 + 1][var17] & 19399040) == 0) {
                this.field405[var36] = var16 + 1;
                this.field406[var36] = var17;
                var36 = (var36 + 1) % var21;
                this.field137[var16 + 1][var17] = 8;
                this.field299[var16 + 1][var17] = var34;
            }
            if (var17 > 0 && this.field137[var16][var17 - 1] == 0 && (var22[var16][var17 - 1] & 19398914) == 0) {
                this.field405[var36] = var16;
                this.field406[var36] = var17 - 1;
                var36 = (var36 + 1) % var21;
                this.field137[var16][var17 - 1] = 1;
                this.field299[var16][var17 - 1] = var34;
            }
            if (var17 < var14 - 1 && this.field137[var16][var17 + 1] == 0 && (var22[var16][var17 + 1] & 19398944) == 0) {
                this.field405[var36] = var16;
                this.field406[var36] = var17 + 1;
                var36 = (var36 + 1) % var21;
                this.field137[var16][var17 + 1] = 4;
                this.field299[var16][var17 + 1] = var34;
            }
            if (var16 > 0 && var17 > 0 && this.field137[var16 - 1][var17 - 1] == 0 && (var22[var16 - 1][var17 - 1] & 19398926) == 0 && (var22[var16 - 1][var17] & 19398920) == 0 && (var22[var16][var17 - 1] & 19398914) == 0) {
                this.field405[var36] = var16 - 1;
                this.field406[var36] = var17 - 1;
                var36 = (var36 + 1) % var21;
                this.field137[var16 - 1][var17 - 1] = 3;
                this.field299[var16 - 1][var17 - 1] = var34;
            }
            if (var16 < var13 - 1 && var17 > 0 && this.field137[var16 + 1][var17 - 1] == 0 && (var22[var16 + 1][var17 - 1] & 19399043) == 0 && (var22[var16 + 1][var17] & 19399040) == 0 && (var22[var16][var17 - 1] & 19398914) == 0) {
                this.field405[var36] = var16 + 1;
                this.field406[var36] = var17 - 1;
                var36 = (var36 + 1) % var21;
                this.field137[var16 + 1][var17 - 1] = 9;
                this.field299[var16 + 1][var17 - 1] = var34;
            }
            if (var16 > 0 && var17 < var14 - 1 && this.field137[var16 - 1][var17 + 1] == 0 && (var22[var16 - 1][var17 + 1] & 19398968) == 0 && (var22[var16 - 1][var17] & 19398920) == 0 && (var22[var16][var17 + 1] & 19398944) == 0) {
                this.field405[var36] = var16 - 1;
                this.field406[var36] = var17 + 1;
                var36 = (var36 + 1) % var21;
                this.field137[var16 - 1][var17 + 1] = 6;
                this.field299[var16 - 1][var17 + 1] = var34;
            }
            if (var16 < var13 - 1 && var17 < var14 - 1 && this.field137[var16 + 1][var17 + 1] == 0 && (var22[var16 + 1][var17 + 1] & 19399136) == 0 && (var22[var16 + 1][var17] & 19399040) == 0 && (var22[var16][var17 + 1] & 19398944) == 0) {
                this.field405[var36] = var16 + 1;
                this.field406[var36] = var17 + 1;
                var36 = (var36 + 1) % var21;
                this.field137[var16 + 1][var17 + 1] = 12;
                this.field299[var16 + 1][var17 + 1] = var34;
            }
        }
        this.field167 = 0;
        if (!var20) {
            if (arg7) {
                int var23 = 100;
                for (int var24 = 1; var24 < 2; ++var24) {
                    for (int var25 = arg6 - var24; var25 <= arg6 + var24; ++var25) {
                        for (int var26 = arg9 - var24; var26 <= arg9 + var24; ++var26) {
                            if (var25 >= 0 && var26 >= 0 && var25 < 104 && var26 < 104 && this.field299[var25][var26] < var23) {
                                var23 = this.field299[var25][var26];
                                var16 = var25;
                                var17 = var26;
                                this.field167 = 1;
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
        this.field405[var27] = var16;
        int var37 = var27 + 1;
        this.field406[var27] = var17;
        int var28;
        int var29 = var28 = this.field137[var16][var17];
        while (arg5 != var16 || arg8 != var17) {
            if (var28 != var29) {
                var28 = var29;
                this.field405[var37] = var16;
                this.field406[var37++] = var17;
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
            var29 = this.field137[var16][var17];
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
            int var31 = this.field405[var37];
            int var32 = this.field406[var37];
            ++field278;
            if (field278 >= 127) {
                this.field447.method523(142, 0);
                this.field447.method527(84528);
                field278 = 0;
            }
            if (arg3 == 0) {
                this.field447.method523(249, 0);
                this.field447.method524(var30 + var30 + 3);
            }
            if (arg3 == 1) {
                this.field447.method523(147, 0);
                this.field447.method524(var30 + var30 + 3 + 14);
            }
            if (arg3 == 2) {
                this.field447.method523(162, 0);
                this.field447.method524(var30 + var30 + 3);
            }
            this.field447.method550(this.field456, super.field1537[5] == 1 ? 1 : 0);
            this.field447.method525(this.field221 + var32);
            this.field447.method556(field426, this.field220 + var31);
            this.field316 = this.field405[0];
            this.field317 = this.field406[0];
            for (int var33 = 1; var33 < var30; ++var33) {
                --var37;
                this.field447.method551(this.field405[var37] - var31, 47778);
                this.field447.method550(this.field456, this.field406[var37] - var32);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILjava/lang/String;IILjava/lang/String;I)LQKFGLETG;")
    public final class50 method83(int arg0, String arg1, int arg2, int arg3, String arg4, int arg5) {
        byte[] var7 = null;
        if (arg0 != 0) {
            this.field343 = -1;
        }
        int var8 = 5;
        try {
            if (this.field493[0] != null) {
                var7 = this.field493[0].method392(this.field397, arg2);
            }
        } catch (Exception var30) {
        }
        if (var7 != null) {
            this.field202.reset();
            this.field202.update(var7);
            int var9 = (int) this.field202.getValue();
            if (arg5 != var9) {
                var7 = null;
            }
        }
        if (var7 != null) {
            return new class50(var7, this.field514);
        } else {
            int var11 = 0;
            while (var7 == null) {
                String var12 = "Unknown error";
                this.method107(arg3, false, "Requesting " + arg4);
                Object var13 = null;
                try {
                    int var14 = 0;
                    DataInputStream var15 = this.method137(arg1 + arg5);
                    byte[] var16 = new byte[6];
                    var15.readFully(var16, 0, 6);
                    class68 var17 = new class68((byte) 9, var16);
                    var17.field1643 = 3;
                    int var18 = var17.method538() + 6;
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
                            this.method107(arg3, false, "Loading " + arg4 + " - " + var23 + "%");
                        }
                        var14 = var23;
                    }
                    var15.close();
                    try {
                        if (this.field493[0] != null) {
                            this.field493[0].method393(var7, var7.length, arg2, 1);
                        }
                    } catch (Exception var29) {
                        this.field493[0] = null;
                    }
                    if (var7 != null) {
                        this.field202.reset();
                        this.field202.update(var7);
                        int var24 = (int) this.field202.getValue();
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
                            this.method107(arg3, false, "Game updated - please reload page");
                            var26 = 10;
                        } else {
                            this.method107(arg3, false, var12 + " - Retrying in " + var26);
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
                    this.field450 = !this.field450;
                }
            }
            return new class50(var7, this.field514);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)V")
    public final void method84(String arg0, String arg1, boolean arg2) {
        signlink.errorname = arg0;
        try {
            if (!arg2) {
                this.field495 = "";
                this.field496 = "Connecting to server...";
                this.method154(true, 8633);
            }
            this.field209 = new class14((byte) -115, this.method85(field370 + 43594), this);
            long var4 = class62.method486(arg0);
            int var6 = (int) (var4 >> 16 & 31L);
            this.field447.field1643 = 0;
            this.field447.method524(14);
            this.field447.method524(var6);
            this.field209.method196(4, 2, 0, this.field447.field1642);
            for (int var7 = 0; var7 < 8; ++var7) {
                this.field209.method193();
            }
            int var8 = this.field209.method193();
            int var9 = var8;
            if (var8 == 0) {
                this.field209.method195(this.field556.field1642, 0, 8);
                this.field556.field1643 = 0;
                this.field563 = this.field556.method540(true);
                int[] var10 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (this.field563 >> 32), (int) this.field563 };
                this.field447.field1643 = 0;
                this.field447.method524(10);
                this.field447.method528(var10[0]);
                this.field447.method528(var10[1]);
                this.field447.method528(var10[2]);
                this.field447.method528(var10[3]);
                this.field447.method528(signlink.uid);
                this.field447.method531(arg0);
                this.field447.method531(arg1);
                this.field447.method549(field457, (byte) 8, field199);
                this.field558.field1643 = 0;
                if (arg2) {
                    this.field558.method524(18);
                } else {
                    this.field558.method524(16);
                }
                this.field558.method524(this.field447.field1643 + 36 + 1 + 1 + 2);
                this.field558.method524(255);
                this.field558.method525(321);
                this.field558.method524(field372 ? 1 : 0);
                for (int var11 = 0; var11 < 9; ++var11) {
                    this.field558.method528(this.field236[var11]);
                }
                this.field558.method532(this.field447.field1642, this.field447.field1643, 3, 0);
                this.field447.field1647 = new class2(var10, (byte) 0);
                for (int var12 = 0; var12 < 4; ++var12) {
                    var10[var12] += 50;
                }
                this.field225 = new class2(var10, (byte) 0);
                this.field209.method196(4, this.field558.field1643, 0, this.field558.field1642);
                var8 = this.field209.method193();
            }
            if (var8 == 1) {
                try {
                    Thread.sleep(2000L);
                } catch (Exception var22) {
                }
                this.method84(arg0, arg1, arg2);
            } else if (var8 == 2) {
                this.field472 = this.field209.method193();
                field252 = this.field209.method193() == 1;
                this.field513 = 0L;
                this.field473 = 0;
                this.field292.field889 = 0;
                super.field1524 = true;
                this.field224 = true;
                this.field452 = true;
                this.field447.field1643 = 0;
                this.field556.field1643 = 0;
                this.field343 = -1;
                this.field156 = -1;
                this.field157 = -1;
                this.field158 = -1;
                this.field342 = 0;
                this.field344 = 0;
                this.field385 = 0;
                this.field346 = 0;
                this.field418 = 0;
                this.field122 = 0;
                this.field320 = false;
                super.field1525 = 0;
                for (int var13 = 0; var13 < 100; ++var13) {
                    this.field245[var13] = null;
                }
                this.field391 = 0;
                this.field518 = 0;
                this.field218 = 0;
                this.field549 = 0;
                this.field431 = (int) (Math.random() * 100.0D) - 50;
                this.field427 = (int) (Math.random() * 110.0D) - 55;
                this.field543 = (int) (Math.random() * 80.0D) - 40;
                this.field147 = (int) (Math.random() * 120.0D) - 60;
                this.field328 = (int) (Math.random() * 30.0D) - 20;
                this.field205 = (int) (Math.random() * 20.0D) - 10 & 2047;
                this.field491 = 0;
                this.field526 = -1;
                this.field316 = 0;
                this.field317 = 0;
                this.field231 = 0;
                this.field357 = 0;
                for (int var14 = 0; var14 < this.field228; ++var14) {
                    this.field230[var14] = null;
                    this.field235[var14] = null;
                }
                for (int var15 = 0; var15 < 16384; ++var15) {
                    this.field356[var15] = null;
                }
                field313 = this.field230[this.field229] = new class45();
                this.field458.method205();
                this.field417.method205();
                for (int var16 = 0; var16 < 4; ++var16) {
                    for (int var17 = 0; var17 < 104; ++var17) {
                        for (int var18 = 0; var18 < 104; ++var18) {
                            this.field124[var16][var17][var18] = null;
                        }
                    }
                }
                this.field212 = new class15(field412);
                this.field129 = 0;
                this.field128 = 0;
                this.field552 = -1;
                this.field254 = -1;
                this.field279 = -1;
                this.field152 = -1;
                this.field186 = -1;
                this.field398 = false;
                this.field256 = 3;
                this.field242 = 0;
                this.field320 = false;
                this.field268 = false;
                this.field585 = null;
                this.field362 = 0;
                this.field126 = -1;
                this.field154 = true;
                this.method52(-23057);
                for (int var19 = 0; var19 < 5; ++var19) {
                    this.field482[var19] = 0;
                }
                for (int var20 = 0; var20 < 5; ++var20) {
                    this.field587[var20] = null;
                    this.field588[var20] = false;
                }
                field314 = 0;
                field522 = 0;
                field278 = 0;
                field214 = 0;
                field149 = 0;
                field159 = 0;
                field375 = 0;
                field402 = 0;
                field542 = 0;
                field322 = 0;
                this.method23(0);
            } else if (var8 == 3) {
                this.field495 = "";
                this.field496 = "Invalid username or password.";
            } else if (var8 == 4) {
                this.field495 = "Your account has been disabled.";
                this.field496 = "Please check your message-centre for details.";
            } else if (var8 == 5) {
                this.field495 = "Your account is already logged in.";
                this.field496 = "Try again in 60 secs...";
            } else if (var8 == 6) {
                this.field495 = "RuneScape has been updated!";
                this.field496 = "Please reload this page.";
            } else if (var8 == 7) {
                this.field495 = "This world is full.";
                this.field496 = "Please use a different world.";
            } else if (var8 == 8) {
                this.field495 = "Unable to connect.";
                this.field496 = "Login server offline.";
            } else if (var8 == 9) {
                this.field495 = "Login limit exceeded.";
                this.field496 = "Too many connections from your address.";
            } else if (var8 == 10) {
                this.field495 = "Unable to connect.";
                this.field496 = "Bad session id.";
            } else if (var8 == 11) {
                this.field496 = "Login server rejected session.";
                this.field496 = "Please try again.";
            } else if (var8 == 12) {
                this.field495 = "You need a members account to login to this world.";
                this.field496 = "Please subscribe, or use a different world.";
            } else if (var8 == 13) {
                this.field495 = "Could not complete login.";
                this.field496 = "Please try using a different world.";
            } else if (var8 == 14) {
                this.field495 = "The server is being updated.";
                this.field496 = "Please wait 1 minute and try again.";
            } else if (var8 == 15) {
                this.field452 = true;
                this.field447.field1643 = 0;
                this.field556.field1643 = 0;
                this.field343 = -1;
                this.field156 = -1;
                this.field157 = -1;
                this.field158 = -1;
                this.field342 = 0;
                this.field344 = 0;
                this.field385 = 0;
                this.field122 = 0;
                this.field320 = false;
                this.field389 = System.currentTimeMillis();
            } else if (var8 == 16) {
                this.field495 = "Login attempts exceeded.";
                this.field496 = "Please wait 1 minute and try again.";
            } else if (var8 == 17) {
                this.field495 = "You are standing in a members-only area.";
                this.field496 = "To play on this world move to a free area first";
            } else if (var8 == 20) {
                this.field495 = "Invalid loginserver requested";
                this.field496 = "Please try using a different world.";
            } else if (var8 != 21) {
                if (var8 == -1) {
                    if (var9 == 0) {
                        if (this.field413 < 2) {
                            try {
                                Thread.sleep(2000L);
                            } catch (Exception var24) {
                            }
                            ++this.field413;
                            this.method84(arg0, arg1, arg2);
                        } else {
                            this.field495 = "No response from loginserver";
                            this.field496 = "Please wait 1 minute and try again.";
                        }
                    } else {
                        this.field495 = "No response from server";
                        this.field496 = "Please try using a different world.";
                    }
                } else {
                    System.out.println("response:" + var8);
                    this.field495 = "Unexpected server response";
                    this.field496 = "Please try using a different world.";
                }
            } else {
                int var21 = this.field209.method193();
                for (int var26 = var21 + 3; var26 >= 0; --var26) {
                    this.field495 = "You have only just left another world";
                    this.field496 = "Your profile will be transferred in: " + var26;
                    this.method154(true, 8633);
                    try {
                        Thread.sleep(1200L);
                    } catch (Exception var23) {
                    }
                }
                this.method84(arg0, arg1, arg2);
            }
        } catch (IOException var25) {
            this.field495 = "";
            this.field496 = "Error connecting to server.";
        }
    }

    @OriginalMember(owner = "client", name = "q", descriptor = "(I)Ljava/net/Socket;")
    public final Socket method85(int arg0) throws IOException {
        return signlink.mainapp != null ? signlink.opensocket(arg0) : new Socket(InetAddress.getByName(this.getCodeBase().getHost()), arg0);
    }

    @OriginalMember(owner = "client", name = "l", descriptor = "(Z)V")
    public static final void method86(boolean arg0) {
        class28.field928 = false;
        class12.field630 = false;
        if (arg0) {
            for (int var1 = 1; var1 > 0; ++var1) {
            }
        }
        field372 = false;
        class63.field1576 = false;
        class58.field1460 = false;
    }

    @OriginalMember(owner = "client", name = "r", descriptor = "(I)V")
    private final void method87(int arg0) {
        if (arg0 < 3 || arg0 > 3) {
            this.field219 = this.field225.method3();
        }
        for (class42 var2 = (class42) this.field212.method201(); var2 != null; var2 = (class42) this.field212.method203((byte) 3)) {
            if (var2.field1139 == -1) {
                var2.field1147 = 0;
                this.method95(var2, this.field226);
            } else {
                var2.method396();
            }
        }
    }

    @OriginalMember(owner = "client", name = "m", descriptor = "(B)V")
    public final void method88(byte arg0) {
        if (arg0 == 2) {
            boolean var2 = false;
            while (true) {
                int var3;
                do {
                    while (true) {
                        var3 = this.method485((byte) -122);
                        if (var3 == -1) {
                            return;
                        }
                        if (this.field279 != -1 && this.field279 == this.field198) {
                            if (var3 == 8 && this.field414.length() > 0) {
                                this.field414 = this.field414.substring(0, this.field414.length() - 1);
                            }
                            break;
                        }
                        if (this.field268) {
                            if (var3 >= 32 && var3 <= 122 && this.field409.length() < 80) {
                                this.field409 = this.field409 + (char) var3;
                                this.field498 = true;
                            }
                            if (var3 == 8 && this.field409.length() > 0) {
                                this.field409 = this.field409.substring(0, this.field409.length() - 1);
                                this.field498 = true;
                            }
                            if (var3 == 13 || var3 == 10) {
                                this.field268 = false;
                                this.field498 = true;
                                if (this.field425 == 1) {
                                    long var4 = class62.method486(this.field409);
                                    this.method124(var4, -210);
                                }
                                if (this.field425 == 2 && this.field128 > 0) {
                                    long var6 = class62.method486(this.field409);
                                    this.method54(var6, -26833);
                                }
                                if (this.field425 == 3 && this.field409.length() > 0) {
                                    this.field447.method523(192, 0);
                                    this.field447.method524(0);
                                    int var8 = this.field447.field1643;
                                    this.field447.method530(155, this.field321);
                                    class48.method398(this.field447, this.field138, this.field409);
                                    this.field447.method533(737, this.field447.field1643 - var8);
                                    this.field409 = class48.method399(this.field409, 0);
                                    this.field409 = class16.method216(this.field409, 0);
                                    this.method26(0, this.field409, class62.method490(false, class62.method487(this.field321, (byte) 7)), 6);
                                    if (this.field410 == 2) {
                                        this.field410 = 1;
                                        this.field169 = true;
                                        this.field447.method523(36, 0);
                                        this.field447.method524(this.field527);
                                        this.field447.method524(this.field410);
                                        this.field447.method524(this.field176);
                                    }
                                }
                                if (this.field425 == 4 && this.field429 < 100) {
                                    long var9 = class62.method486(this.field409);
                                    this.method37(true, var9);
                                }
                                if (this.field425 == 5 && this.field429 > 0) {
                                    long var11 = class62.method486(this.field409);
                                    this.method53(var11, false);
                                }
                            }
                        } else if (this.field242 == 1) {
                            if (var3 >= 48 && var3 <= 57 && this.field262.length() < 10) {
                                this.field262 = this.field262 + (char) var3;
                                this.field498 = true;
                            }
                            if (var3 == 8 && this.field262.length() > 0) {
                                this.field262 = this.field262.substring(0, this.field262.length() - 1);
                                this.field498 = true;
                            }
                            if (var3 == 13 || var3 == 10) {
                                if (this.field262.length() > 0) {
                                    int var13 = 0;
                                    try {
                                        var13 = Integer.parseInt(this.field262);
                                    } catch (Exception var23) {
                                    }
                                    this.field447.method523(128, 0);
                                    this.field447.method528(var13);
                                }
                                this.field242 = 0;
                                this.field498 = true;
                            }
                        } else if (this.field242 == 2) {
                            if (var3 >= 32 && var3 <= 122 && this.field262.length() < 12) {
                                this.field262 = this.field262 + (char) var3;
                                this.field498 = true;
                            }
                            if (var3 == 8 && this.field262.length() > 0) {
                                this.field262 = this.field262.substring(0, this.field262.length() - 1);
                                this.field498 = true;
                            }
                            if (var3 == 13 || var3 == 10) {
                                if (this.field262.length() > 0) {
                                    this.field447.method523(209, 0);
                                    this.field447.method530(155, class62.method486(this.field262));
                                }
                                this.field242 = 0;
                                this.field498 = true;
                            }
                        } else if (this.field254 == -1) {
                            if (var3 >= 32 && var3 <= 122 && this.field288.length() < 80) {
                                this.field288 = this.field288 + (char) var3;
                                this.field498 = true;
                            }
                            if (var3 == 8 && this.field288.length() > 0) {
                                this.field288 = this.field288.substring(0, this.field288.length() - 1);
                                this.field498 = true;
                            }
                            if ((var3 == 13 || var3 == 10) && this.field288.length() > 0) {
                                if (this.field472 == 2) {
                                    if (this.field288.equals("::clientdrop")) {
                                        this.method125(this.field219);
                                    }
                                    if (this.field288.equals("::lag")) {
                                        this.method27(0);
                                    }
                                    if (this.field288.equals("::prefetchmusic")) {
                                        for (int var14 = 0; var14 < this.field364.method429(2, 631); ++var14) {
                                            this.field364.method446(2, -79, var14, (byte) 1);
                                        }
                                    }
                                    if (this.field288.equals("::fpson")) {
                                        field451 = true;
                                    }
                                    if (this.field288.equals("::fpsoff")) {
                                        field451 = false;
                                    }
                                    if (this.field288.equals("::noclip")) {
                                        for (int var15 = 0; var15 < 4; ++var15) {
                                            for (int var16 = 1; var16 < 103; ++var16) {
                                                for (int var17 = 1; var17 < 103; ++var17) {
                                                    this.field139[var15].field1163[var16][var17] = 0;
                                                }
                                            }
                                        }
                                    }
                                }
                                if (this.field288.startsWith("::")) {
                                    this.field447.method523(218, 0);
                                    this.field447.method524(this.field288.length() - 1);
                                    this.field447.method531(this.field288.substring(2));
                                } else {
                                    String var18 = this.field288.toLowerCase();
                                    byte var19 = 0;
                                    if (var18.startsWith("yellow:")) {
                                        var19 = 0;
                                        this.field288 = this.field288.substring(7);
                                    } else if (var18.startsWith("red:")) {
                                        var19 = 1;
                                        this.field288 = this.field288.substring(4);
                                    } else if (var18.startsWith("green:")) {
                                        var19 = 2;
                                        this.field288 = this.field288.substring(6);
                                    } else if (var18.startsWith("cyan:")) {
                                        var19 = 3;
                                        this.field288 = this.field288.substring(5);
                                    } else if (var18.startsWith("purple:")) {
                                        var19 = 4;
                                        this.field288 = this.field288.substring(7);
                                    } else if (var18.startsWith("white:")) {
                                        var19 = 5;
                                        this.field288 = this.field288.substring(6);
                                    } else if (var18.startsWith("flash1:")) {
                                        var19 = 6;
                                        this.field288 = this.field288.substring(7);
                                    } else if (var18.startsWith("flash2:")) {
                                        var19 = 7;
                                        this.field288 = this.field288.substring(7);
                                    } else if (var18.startsWith("flash3:")) {
                                        var19 = 8;
                                        this.field288 = this.field288.substring(7);
                                    } else if (var18.startsWith("glow1:")) {
                                        var19 = 9;
                                        this.field288 = this.field288.substring(6);
                                    } else if (var18.startsWith("glow2:")) {
                                        var19 = 10;
                                        this.field288 = this.field288.substring(6);
                                    } else if (var18.startsWith("glow3:")) {
                                        var19 = 11;
                                        this.field288 = this.field288.substring(6);
                                    }
                                    String var20 = this.field288.toLowerCase();
                                    byte var21 = 0;
                                    if (var20.startsWith("wave:")) {
                                        var21 = 1;
                                        this.field288 = this.field288.substring(5);
                                    } else if (var20.startsWith("wave2:")) {
                                        var21 = 2;
                                        this.field288 = this.field288.substring(6);
                                    } else if (var20.startsWith("shake:")) {
                                        var21 = 3;
                                        this.field288 = this.field288.substring(6);
                                    } else if (var20.startsWith("scroll:")) {
                                        var21 = 4;
                                        this.field288 = this.field288.substring(7);
                                    } else if (var20.startsWith("slide:")) {
                                        var21 = 5;
                                        this.field288 = this.field288.substring(6);
                                    }
                                    this.field447.method523(175, 0);
                                    this.field447.method524(0);
                                    int var22 = this.field447.field1643;
                                    this.field447.method550(this.field456, var21);
                                    this.field355.field1643 = 0;
                                    class48.method398(this.field355, this.field138, this.field288);
                                    this.field447.method568(this.field355.field1642, 0, -27280, this.field355.field1643);
                                    this.field447.method550(this.field456, var19);
                                    this.field447.method533(737, this.field447.field1643 - var22);
                                    this.field288 = class48.method399(this.field288, 0);
                                    this.field288 = class16.method216(this.field288, 0);
                                    field313.field1709 = this.field288;
                                    field313.field1680 = var19;
                                    field313.field1689 = var21;
                                    field313.field1690 = 150;
                                    if (this.field472 == 2) {
                                        this.method26(0, field313.field1709, "@cr2@" + field313.field1193, 2);
                                    } else if (this.field472 == 1) {
                                        this.method26(0, field313.field1709, "@cr1@" + field313.field1193, 2);
                                    } else {
                                        this.method26(0, field313.field1709, field313.field1193, 2);
                                    }
                                    if (this.field527 == 2) {
                                        this.field527 = 3;
                                        this.field169 = true;
                                        this.field447.method523(36, 0);
                                        this.field447.method524(this.field527);
                                        this.field447.method524(this.field410);
                                        this.field447.method524(this.field176);
                                    }
                                }
                                this.field288 = "";
                                this.field498 = true;
                            }
                        }
                    }
                } while ((var3 < 97 || var3 > 122) && (var3 < 65 || var3 > 90) && (var3 < 48 || var3 > 57) && var3 != 32);
                if (this.field414.length() < 12) {
                    this.field414 = this.field414 + (char) var3;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "s", descriptor = "(I)I")
    public final int method89(int arg0) {
        int var2 = 3;
        if (arg0 != 20823) {
            return 0;
        } else {
            if (this.field507 < 310) {
                int var3 = this.field504 >> 7;
                int var4 = this.field506 >> 7;
                int var5 = field313.field1721 >> 7;
                int var6 = field313.field1722 >> 7;
                if ((this.field515[this.field144][var3][var4] & 4) != 0) {
                    var2 = this.field144;
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
                        if ((this.field515[this.field144][var3][var4] & 4) != 0) {
                            var2 = this.field144;
                        }
                        var10 += var9;
                        if (var10 >= 65536) {
                            var10 -= 65536;
                            if (var4 < var6) {
                                ++var4;
                            } else if (var4 > var6) {
                                --var4;
                            }
                            if ((this.field515[this.field144][var3][var4] & 4) != 0) {
                                var2 = this.field144;
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
                        if ((this.field515[this.field144][var3][var4] & 4) != 0) {
                            var2 = this.field144;
                        }
                        var12 += var11;
                        if (var12 >= 65536) {
                            var12 -= 65536;
                            if (var3 < var5) {
                                ++var3;
                            } else if (var3 > var5) {
                                --var3;
                            }
                            if ((this.field515[this.field144][var3][var4] & 4) != 0) {
                                var2 = this.field144;
                            }
                        }
                    }
                }
            }
            if ((this.field515[this.field144][field313.field1721 >> 7][field313.field1722 >> 7] & 4) != 0) {
                var2 = this.field144;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client", name = "t", descriptor = "(I)I")
    public final int method90(int arg0) {
        if (this.field545 != arg0) {
            this.field343 = -1;
        }
        int var2 = this.method91(0, this.field506, this.field144, this.field504);
        return var2 - this.field505 < 800 && (this.field515[this.field144][this.field504 >> 7][this.field506 >> 7] & 4) != 0 ? this.field144 : 3;
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(IIII)I")
    public final int method91(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 != 0) {
            return 2;
        } else {
            int var5 = arg3 >> 7;
            int var6 = arg1 >> 7;
            if (var5 >= 0 && var6 >= 0 && var5 <= 103 && var6 <= 103) {
                int var7 = arg2;
                if (arg2 < 3 && (this.field515[1][var5][var6] & 2) == 2) {
                    var7 = arg2 + 1;
                }
                int var8 = arg3 & 127;
                int var9 = arg1 & 127;
                int var10 = (128 - var8) * this.field347[var7][var5][var6] + this.field347[var7][var5 + 1][var6] * var8 >> 7;
                int var11 = (128 - var8) * this.field347[var7][var5][var6 + 1] + this.field347[var7][var5 + 1][var6 + 1] * var8 >> 7;
                return (128 - var9) * var10 + var9 * var11 >> 7;
            } else {
                return 0;
            }
        }
    }

    @OriginalMember(owner = "client", name = "u", descriptor = "(I)V")
    public final void method92(int arg0) {
        if (arg0 >= 0) {
            this.field562 = !this.field562;
        }
        if (this.field555 == 0) {
            int var2 = super.field1517 / 2 - 80;
            int var3 = super.field1518 / 2 + 20;
            int var14 = var3 + 20;
            if (super.field1533 == 1 && super.field1534 >= var2 - 75 && super.field1534 <= var2 + 75 && super.field1535 >= var14 - 20 && super.field1535 <= var14 + 20) {
                this.field555 = 3;
                this.field247 = 0;
            }
            int var4 = super.field1517 / 2 + 80;
            if (super.field1533 == 1 && super.field1534 >= var4 - 75 && super.field1534 <= var4 + 75 && super.field1535 >= var14 - 20 && super.field1535 <= var14 + 20) {
                this.field495 = "";
                this.field496 = "Enter your username & password.";
                this.field555 = 2;
                this.field247 = 0;
            }
        } else if (this.field555 == 2) {
            int var5 = super.field1518 / 2 - 40;
            int var15 = var5 + 30;
            int var16 = var15 + 25;
            if (super.field1533 == 1 && super.field1535 >= var16 - 15 && super.field1535 < var16) {
                this.field247 = 0;
            }
            var5 = var16 + 15;
            if (super.field1533 == 1 && super.field1535 >= var5 - 15 && super.field1535 < var5) {
                this.field247 = 1;
            }
            var5 += 15;
            int var6 = super.field1517 / 2 - 80;
            int var7 = super.field1518 / 2 + 50;
            int var17 = var7 + 20;
            if (super.field1533 == 1 && super.field1534 >= var6 - 75 && super.field1534 <= var6 + 75 && super.field1535 >= var17 - 20 && super.field1535 <= var17 + 20) {
                this.field413 = 0;
                this.method84(this.field300, this.field301, false);
                if (this.field452) {
                    return;
                }
            }
            int var8 = super.field1517 / 2 + 80;
            if (super.field1533 == 1 && super.field1534 >= var8 - 75 && super.field1534 <= var8 + 75 && super.field1535 >= var17 - 20 && super.field1535 <= var17 + 20) {
                this.field555 = 0;
                this.field300 = "";
                this.field301 = "";
            }
            while (true) {
                while (true) {
                    int var9 = this.method485((byte) -122);
                    if (var9 == -1) {
                        return;
                    }
                    boolean var10 = false;
                    for (int var11 = 0; var11 < field386.length(); ++var11) {
                        if (var9 == field386.charAt(var11)) {
                            var10 = true;
                            break;
                        }
                    }
                    if (this.field247 == 0) {
                        if (var9 == 8 && this.field300.length() > 0) {
                            this.field300 = this.field300.substring(0, this.field300.length() - 1);
                        }
                        if (var9 == 9 || var9 == 10 || var9 == 13) {
                            this.field247 = 1;
                        }
                        if (var10) {
                            this.field300 = this.field300 + (char) var9;
                        }
                        if (this.field300.length() > 12) {
                            this.field300 = this.field300.substring(0, 12);
                        }
                    } else if (this.field247 == 1) {
                        if (var9 == 8 && this.field301.length() > 0) {
                            this.field301 = this.field301.substring(0, this.field301.length() - 1);
                        }
                        if (var9 == 9 || var9 == 10 || var9 == 13) {
                            this.field247 = 0;
                        }
                        if (var10) {
                            this.field301 = this.field301 + (char) var9;
                        }
                        if (this.field301.length() > 20) {
                            this.field301 = this.field301.substring(0, 20);
                        }
                    }
                }
            }
        } else {
            if (this.field555 == 3) {
                int var12 = super.field1517 / 2;
                int var13 = super.field1518 / 2 + 50;
                int var18 = var13 + 20;
                if (super.field1533 == 1 && super.field1534 >= var12 - 75 && super.field1534 <= var12 + 75 && super.field1535 >= var18 - 20 && super.field1535 <= var18 + 20) {
                    this.field555 = 0;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(II)V")
    public final void method93(int arg0, int arg1) {
        class15 var3 = this.field124[this.field144][arg0][arg1];
        if (var3 == null) {
            this.field227.method327(this.field144, arg0, arg1);
        } else {
            int var4 = -99999999;
            class33 var5 = null;
            for (class33 var6 = (class33) var3.method201(); var6 != null; var6 = (class33) var3.method203((byte) 3)) {
                class5 var11 = class5.method13(var6.field1041);
                int var12 = var11.field92;
                if (var11.field76) {
                    var12 = (var6.field1040 + 1) * var12;
                }
                if (var12 > var4) {
                    var4 = var12;
                    var5 = var6;
                }
            }
            var3.method199(303, var5);
            class33 var7 = null;
            class33 var8 = null;
            for (class33 var9 = (class33) var3.method201(); var9 != null; var9 = (class33) var3.method203((byte) 3)) {
                if (var5.field1041 != var9.field1041 && var7 == null) {
                    var7 = var9;
                }
                if (var5.field1041 != var9.field1041 && var7.field1041 != var9.field1041 && var8 == null) {
                    var8 = var9;
                }
            }
            int var10 = (arg1 << 7) + arg0 + 1610612736;
            this.field227.method313(var5, arg1, this.method91(0, arg1 * 128 + 64, this.field144, arg0 * 128 + 64), var8, this.field144, arg0, var10, var7, true);
        }
    }

    @OriginalMember(owner = "client", name = "m", descriptor = "(Z)V")
    public final void method94(boolean arg0) {
        short var2 = 256;
        if (this.field572 > 0) {
            for (int var3 = 0; var3 < 256; ++var3) {
                if (this.field572 > 768) {
                    this.field248[var3] = this.method103(this.field249[var3], this.field250[var3], -979, 1024 - this.field572);
                } else if (this.field572 > 256) {
                    this.field248[var3] = this.field250[var3];
                } else {
                    this.field248[var3] = this.method103(this.field250[var3], this.field249[var3], -979, 256 - this.field572);
                }
            }
        } else if (this.field573 > 0) {
            for (int var4 = 0; var4 < 256; ++var4) {
                if (this.field573 > 768) {
                    this.field248[var4] = this.method103(this.field249[var4], this.field251[var4], -979, 1024 - this.field573);
                } else if (this.field573 > 256) {
                    this.field248[var4] = this.field251[var4];
                } else {
                    this.field248[var4] = this.method103(this.field251[var4], this.field249[var4], -979, 256 - this.field573);
                }
            }
        } else {
            for (int var5 = 0; var5 < 256; ++var5) {
                this.field248[var5] = this.field249[var5];
            }
        }
        for (int var6 = 0; var6 < 33920; ++var6) {
            this.field333.field1727[var6] = this.field145.field1662[var6];
        }
        int var7 = 0;
        int var8 = 1152;
        for (int var9 = 1; var9 < var2 - 1; ++var9) {
            int var23 = (var2 - var9) * this.field578[var9] / var2;
            int var24 = var23 + 22;
            if (var24 < 0) {
                var24 = 0;
            }
            var7 += var24;
            for (int var25 = var24; var25 < 128; ++var25) {
                int var26 = this.field415[var7++];
                if (var26 != 0) {
                    int var28 = 256 - var26;
                    int var29 = this.field248[var26];
                    int var30 = this.field333.field1727[var8];
                    this.field333.field1727[var8++] = ((var29 & 16711935) * var26 + (var30 & 16711935) * var28 & -16711936) + ((var29 & 65280) * var26 + (var30 & 65280) * var28 & 16711680) >> 8;
                } else {
                    ++var8;
                }
            }
            var8 += var24;
        }
        this.field333.method589(0, super.field1519, 418, 0);
        for (int var10 = 0; var10 < 33920; ++var10) {
            this.field334.field1727[var10] = this.field146.field1662[var10];
        }
        int var11 = 0;
        int var12 = 1176;
        for (int var13 = 1; var13 < var2 - 1; ++var13) {
            int var14 = (var2 - var13) * this.field578[var13] / var2;
            int var15 = 103 - var14;
            int var16 = var12 + var14;
            for (int var17 = 0; var17 < var15; ++var17) {
                int var18 = this.field415[var11++];
                if (var18 != 0) {
                    int var20 = 256 - var18;
                    int var21 = this.field248[var18];
                    int var22 = this.field334.field1727[var16];
                    this.field334.field1727[var16++] = ((var21 & 16711935) * var18 + (var22 & 16711935) * var20 & -16711936) + ((var21 & 65280) * var18 + (var22 & 65280) * var20 & 16711680) >> 8;
                } else {
                    ++var16;
                }
            }
            var11 += 128 - var15;
            var12 = 128 - var15 - var14 + var16;
        }
        this.field334.method589(0, super.field1519, 418, 637);
        if (arg0) {
            this.field514 = this.field225.method3();
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LOCRHTPRV;Z)V")
    private final void method95(class42 arg0, boolean arg1) {
        int var3 = 0;
        int var4 = -1;
        int var5 = 0;
        int var6 = 0;
        this.field452 &= arg1;
        if (arg0.field1141 == 0) {
            var3 = this.field227.method332(arg0.field1140, arg0.field1142, arg0.field1143);
        }
        if (arg0.field1141 == 1) {
            var3 = this.field227.method333(arg0.field1143, true, arg0.field1142, arg0.field1140);
        }
        if (arg0.field1141 == 2) {
            var3 = this.field227.method334(arg0.field1140, arg0.field1142, arg0.field1143);
        }
        if (arg0.field1141 == 3) {
            var3 = this.field227.method335(arg0.field1140, arg0.field1142, arg0.field1143);
        }
        if (var3 != 0) {
            int var7 = this.field227.method336(arg0.field1140, arg0.field1142, arg0.field1143, var3);
            var4 = var3 >> 14 & 32767;
            var5 = var7 & 31;
            var6 = var7 >> 6;
        }
        arg0.field1144 = var4;
        arg0.field1146 = var5;
        arg0.field1145 = var6;
    }

    @OriginalMember(owner = "client", name = "v", descriptor = "(I)V")
    public final void method96(int arg0) {
        signlink.midifade = 0;
        signlink.midi = "stop";
        if (arg0 < 1 || arg0 > 1) {
            ;
        }
    }

    @OriginalMember(owner = "client", name = "w", descriptor = "(I)V")
    public final void method97(int arg0) {
        if (this.field385 > 1) {
            --this.field385;
        }
        if (this.field346 > 0) {
            --this.field346;
        }
        for (int var2 = 0; var2 < 5 && this.method58((byte) 7); ++var2) {
        }
        if (arg0 != 18097) {
            this.field124 = null;
        }
        if (this.field452) {
            Object var3 = this.field292.field888;
            synchronized (this.field292.field888) {
                if (!field252) {
                    this.field292.field889 = 0;
                } else if (super.field1533 != 0 || this.field292.field889 >= 40) {
                    this.field447.method523(33, 0);
                    this.field447.method524(0);
                    int var4 = this.field447.field1643;
                    int var5 = 0;
                    for (int var6 = 0; var6 < this.field292.field889 && var4 - this.field447.field1643 < 240; ++var6) {
                        ++var5;
                        int var7 = this.field292.field887[var6];
                        if (var7 < 0) {
                            var7 = 0;
                        } else if (var7 > 502) {
                            var7 = 502;
                        }
                        int var8 = this.field292.field884[var6];
                        if (var8 < 0) {
                            var8 = 0;
                        } else if (var8 > 764) {
                            var8 = 764;
                        }
                        int var9 = var7 * 765 + var8;
                        if (this.field292.field887[var6] == -1 && this.field292.field884[var6] == -1) {
                            var8 = -1;
                            var7 = -1;
                            var9 = 524287;
                        }
                        if (this.field560 == var8 && this.field561 == var7) {
                            if (this.field473 < 2047) {
                                ++this.field473;
                            }
                        } else {
                            int var10 = var8 - this.field560;
                            this.field560 = var8;
                            int var11 = var7 - this.field561;
                            this.field561 = var7;
                            if (this.field473 < 8 && var10 >= -32 && var10 <= 31 && var11 >= -32 && var11 <= 31) {
                                var10 += 32;
                                var11 += 32;
                                this.field447.method525((this.field473 << 12) + (var10 << 6) + var11);
                                this.field473 = 0;
                            } else if (this.field473 < 8) {
                                this.field447.method527((this.field473 << 19) + 8388608 + var9);
                                this.field473 = 0;
                            } else {
                                this.field447.method528((this.field473 << 19) + -1073741824 + var9);
                                this.field473 = 0;
                            }
                        }
                    }
                    this.field447.method533(737, this.field447.field1643 - var4);
                    if (var5 >= this.field292.field889) {
                        this.field292.field889 = 0;
                    } else {
                        this.field292.field889 -= var5;
                        for (int var12 = 0; var12 < this.field292.field889; ++var12) {
                            this.field292.field884[var12] = this.field292.field884[var5 + var12];
                            this.field292.field887[var12] = this.field292.field887[var5 + var12];
                        }
                    }
                }
            }
            if (super.field1533 != 0) {
                long var13 = (super.field1536 - this.field513) / 50L;
                if (var13 > 4095L) {
                    var13 = 4095L;
                }
                this.field513 = super.field1536;
                int var15 = super.field1535;
                if (var15 < 0) {
                    var15 = 0;
                } else if (var15 > 502) {
                    var15 = 502;
                }
                int var16 = super.field1534;
                if (var16 < 0) {
                    var16 = 0;
                } else if (var16 > 764) {
                    var16 = 764;
                }
                int var17 = var15 * 765 + var16;
                byte var18 = 0;
                if (super.field1533 == 2) {
                    var18 = 1;
                }
                int var19 = (int) var13;
                this.field447.method523(133, 0);
                this.field447.method565(-469, (var18 << 19) + (var19 << 20) + var17);
            }
            if (this.field265 > 0) {
                --this.field265;
            }
            if (super.field1537[1] == 1 || super.field1537[2] == 1 || super.field1537[3] == 1 || super.field1537[4] == 1) {
                this.field266 = true;
            }
            if (this.field266 && this.field265 <= 0) {
                this.field265 = 20;
                this.field266 = false;
                this.field447.method523(73, 0);
                this.field447.method525(this.field204);
                this.field447.method525(this.field205);
            }
            if (super.field1524 && !this.field224) {
                this.field224 = true;
                this.field447.method523(95, 0);
                this.field447.method524(1);
            }
            if (!super.field1524 && this.field224) {
                this.field224 = false;
                this.field447.method523(95, 0);
                this.field447.method524(0);
            }
            this.method119(823);
            this.method123(797);
            this.method38(false);
            ++this.field344;
            if (this.field344 > 750) {
                this.method125(this.field219);
            }
            this.method51(this.field449);
            this.method141(2);
            this.method131(false);
            ++this.field304;
            if (this.field592 != 0) {
                this.field591 += 20;
                if (this.field591 >= 400) {
                    this.field592 = 0;
                }
            }
            if (this.field468 != 0) {
                ++this.field465;
                if (this.field465 >= 15) {
                    if (this.field468 == 2) {
                        this.field354 = true;
                    }
                    if (this.field468 == 3) {
                        this.field498 = true;
                    }
                    this.field468 = 0;
                }
            }
            if (this.field325 != 0) {
                ++this.field196;
                if (super.field1527 > this.field326 + 5 || super.field1527 < this.field326 - 5 || super.field1528 > this.field327 + 5 || super.field1528 < this.field327 - 5) {
                    this.field307 = true;
                }
                if (super.field1526 == 0) {
                    if (this.field325 == 2) {
                        this.field354 = true;
                    }
                    if (this.field325 == 3) {
                        this.field498 = true;
                    }
                    this.field325 = 0;
                    if (this.field307 && this.field196 >= 5) {
                        this.field583 = -1;
                        this.method132(true);
                        if (this.field583 == this.field323 && this.field582 != this.field324) {
                            class53 var20 = class53.field1309[this.field323];
                            byte var21 = 0;
                            if (this.field216 == 1 && var20.field1317 == 206) {
                                var21 = 1;
                            }
                            if (var20.field1327[this.field582] <= 0) {
                                var21 = 0;
                            }
                            if (var20.field1293) {
                                int var22 = this.field324;
                                int var23 = this.field582;
                                var20.field1327[var23] = var20.field1327[var22];
                                var20.field1289[var23] = var20.field1289[var22];
                                var20.field1327[var22] = -1;
                                var20.field1289[var22] = 0;
                            } else if (var21 == 1) {
                                int var24 = this.field324;
                                int var25 = this.field582;
                                while (var24 != var25) {
                                    if (var24 > var25) {
                                        var20.method414((byte) 7, var24 - 1, var24);
                                        --var24;
                                    } else if (var24 < var25) {
                                        var20.method414((byte) 7, var24 + 1, var24);
                                        ++var24;
                                    }
                                }
                            } else {
                                var20.method414((byte) 7, this.field582, this.field324);
                            }
                            this.field447.method523(248, 0);
                            this.field447.method524(var21);
                            this.field447.method558(this.field582, (byte) 7);
                            this.field447.method556(field426, this.field324);
                            this.field447.method558(this.field323, (byte) 7);
                        }
                    } else if ((this.field546 == 1 || this.method25(this.field122 - 1, 0)) && this.field122 > 2) {
                        this.method45(true);
                    } else if (this.field122 > 0) {
                        this.method128(this.field122 - 1, 0);
                    }
                    this.field465 = 10;
                    super.field1533 = 0;
                }
            }
            if (class28.field962 != -1) {
                int var26 = class28.field962;
                int var27 = class28.field963;
                boolean var28 = this.method82(0, 0, 0, 0, 0, field313.field1696[0], var26, true, field313.field1697[0], var27, 0, 0);
                class28.field962 = -1;
                if (var28) {
                    this.field589 = super.field1534;
                    this.field590 = super.field1535;
                    this.field592 = 1;
                    this.field591 = 0;
                }
            }
            if (super.field1533 == 1 && this.field585 != null) {
                this.field585 = null;
                this.field498 = true;
                super.field1533 = 0;
            }
            this.method40(true);
            this.method34((byte) 1);
            this.method72(0);
            this.method75(true);
            if (super.field1526 == 1 || super.field1533 == 1) {
                ++this.field517;
            }
            if (this.field218 == 2) {
                this.method78(false);
            }
            if (this.field218 == 2 && this.field127) {
                this.method64(289);
            }
            for (int var29 = 0; var29 < 5; ++var29) {
                int var10002 = this.field291[var29]++;
            }
            this.method88((byte) 2);
            ++super.field1525;
            if (super.field1525 > 4500) {
                this.field346 = 250;
                super.field1525 -= 500;
                this.field447.method523(166, 0);
            }
            ++this.field361;
            if (this.field361 > 500) {
                this.field361 = 0;
                int var30 = (int) (Math.random() * 8.0D);
                if ((var30 & 1) == 1) {
                    this.field431 += this.field432;
                }
                if ((var30 & 2) == 2) {
                    this.field427 += this.field428;
                }
                if ((var30 & 4) == 4) {
                    this.field543 += this.field544;
                }
            }
            if (this.field431 < -50) {
                this.field432 = 2;
            }
            if (this.field431 > 50) {
                this.field432 = -2;
            }
            if (this.field427 < -55) {
                this.field428 = 2;
            }
            if (this.field427 > 55) {
                this.field428 = -2;
            }
            if (this.field543 < -40) {
                this.field544 = 1;
            }
            if (this.field543 > 40) {
                this.field544 = -1;
            }
            ++this.field419;
            if (this.field419 > 500) {
                this.field419 = 0;
                int var31 = (int) (Math.random() * 8.0D);
                if ((var31 & 1) == 1) {
                    this.field147 += this.field148;
                }
                if ((var31 & 2) == 2) {
                    this.field328 += this.field329;
                }
            }
            if (this.field147 < -60) {
                this.field148 = 2;
            }
            if (this.field147 > 60) {
                this.field148 = -2;
            }
            if (this.field328 < -20) {
                this.field329 = 1;
            }
            if (this.field328 > 10) {
                this.field329 = -1;
            }
            ++this.field345;
            if (this.field345 > 50) {
                this.field447.method523(220, 0);
            }
            try {
                if (this.field209 != null && this.field447.field1643 > 0) {
                    this.field209.method196(4, this.field447.field1643, 0, this.field447.field1642);
                    this.field447.field1643 = 0;
                    this.field345 = 0;
                }
            } catch (IOException var33) {
                this.method125(this.field219);
            } catch (Exception var34) {
                this.method109(false);
            }
        }
    }

    @OriginalMember(owner = "client", name = "x", descriptor = "(I)V")
    public final void method98(int arg0) {
        if (arg0 <= 0) {
            this.field445 = !this.field445;
        }
        for (class51 var2 = (class51) this.field458.method201(); var2 != null; var2 = (class51) this.field458.method203((byte) 3)) {
            if (this.field144 == var2.field1254 && field421 <= var2.field1240) {
                if (field421 >= var2.field1239) {
                    if (var2.field1237 > 0) {
                        class18 var3 = this.field356[var2.field1237 - 1];
                        if (var3 != null && var3.field1721 >= 0 && var3.field1721 < 13312 && var3.field1722 >= 0 && var3.field1722 < 13312) {
                            var2.method403(var3.field1721, var3.field1722, 136, this.method91(0, var3.field1722, var2.field1254, var3.field1721) - var2.field1245, field421);
                        }
                    }
                    if (var2.field1237 < 0) {
                        int var4 = -var2.field1237 - 1;
                        class45 var5;
                        if (this.field401 == var4) {
                            var5 = field313;
                        } else {
                            var5 = this.field230[var4];
                        }
                        if (var5 != null && var5.field1721 >= 0 && var5.field1721 < 13312 && var5.field1722 >= 0 && var5.field1722 < 13312) {
                            var2.method403(var5.field1721, var5.field1722, 136, this.method91(0, var5.field1722, var2.field1254, var5.field1721) - var2.field1245, field421);
                        }
                    }
                    var2.method404(this.field304, true);
                    this.field227.method317(var2.field1246, this.field144, (int) var2.field1258, 0, (int) var2.field1259, 60, (int) var2.field1260, -1, var2, false);
                }
            } else {
                var2.method396();
            }
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(II)V")
    public final void method99(int arg0, int arg1) {
        int[] var3 = this.field318.field1662;
        int var4 = var3.length;
        for (int var5 = 0; var5 < var4; ++var5) {
            var3[var5] = 0;
        }
        for (int var6 = 1; var6 < 103; ++var6) {
            int var23 = (103 - var6) * 512 * 4 + 24628;
            for (int var24 = 1; var24 < 103; ++var24) {
                if ((this.field515[arg1][var24][var6] & 24) == 0) {
                    this.field227.method341(var3, var23, 512, arg1, var24, var6);
                }
                if (arg1 < 3 && (this.field515[arg1 + 1][var24][var6] & 8) != 0) {
                    this.field227.method341(var3, var23, 512, arg1 + 1, var24, var6);
                }
                var23 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        this.field318.method571(823);
        for (int var9 = 1; var9 < 103; ++var9) {
            for (int var22 = 1; var22 < 103; ++var22) {
                if ((this.field515[arg1][var22][var9] & 24) == 0) {
                    this.method71(var9, 1, arg1, var8, var7, var22);
                }
                if (arg1 < 3 && (this.field515[arg1 + 1][var22][var9] & 8) != 0) {
                    this.method71(var9, 1, arg1 + 1, var8, var7, var22);
                }
            }
        }
        this.field379.method588(823);
        ++field407;
        if (field407 > 58) {
            field407 = 0;
            this.field447.method523(91, 0);
        }
        this.field310 = 0;
        if (arg0 < 2 || arg0 > 2) {
            this.field343 = this.field556.method534();
        }
        for (int var10 = 0; var10 < 104; ++var10) {
            for (int var11 = 0; var11 < 104; ++var11) {
                int var12 = this.field227.method335(this.field144, var10, var11);
                if (var12 != 0) {
                    int var13 = var12 >> 14 & 32767;
                    int var14 = class58.method455(var13).field1444;
                    if (var14 >= 0) {
                        int var15 = var10;
                        int var16 = var11;
                        if (var14 != 22 && var14 != 29 && var14 != 34 && var14 != 36 && var14 != 46 && var14 != 47 && var14 != 48) {
                            byte var17 = 104;
                            byte var18 = 104;
                            int[][] var19 = this.field139[this.field144].field1163;
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
                        this.field281[this.field310] = this.field586[var14];
                        this.field311[this.field310] = var15;
                        this.field312[this.field310] = var16;
                        ++this.field310;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "n", descriptor = "(Z)V")
    public final void method100(boolean arg0) {
        try {
            this.field526 = -1;
            this.field417.method205();
            this.field458.method205();
            class12.method173(false);
            this.method19(-39695);
            this.field227.method306(818);
            System.gc();
            for (int var2 = 0; var2 < 4; ++var2) {
                this.field139[var2].method371();
            }
            for (int var3 = 0; var3 < 4; ++var3) {
                for (int var4 = 0; var4 < 104; ++var4) {
                    for (int var5 = 0; var5 < 104; ++var5) {
                        this.field515[var3][var4][var5] = 0;
                    }
                }
            }
            class63 var6 = new class63(this.field515, 104, -239, 104, this.field347);
            int var7 = this.field289.length;
            this.field447.method523(220, 0);
            if (!this.field352) {
                for (int var8 = 0; var8 < var7; ++var8) {
                    int var9 = (this.field366[var8] >> 8) * 64 - this.field220;
                    int var10 = (this.field366[var8] & 255) * 64 - this.field221;
                    byte[] var11 = this.field289[var8];
                    if (var11 != null) {
                        var6.method509((this.field188 - 6) * 8, var10, (byte) 57, var9, this.field139, var11, (this.field187 - 6) * 8);
                    }
                }
                for (int var12 = 0; var12 < var7; ++var12) {
                    int var13 = (this.field366[var12] >> 8) * 64 - this.field220;
                    int var14 = (this.field366[var12] & 255) * 64 - this.field221;
                    byte[] var15 = this.field289[var12];
                    if (var15 == null && this.field188 < 800) {
                        var6.method499(0, 64, 64, var14, var13);
                    }
                }
                this.field447.method523(220, 0);
                for (int var16 = 0; var16 < var7; ++var16) {
                    byte[] var17 = this.field194[var16];
                    if (var17 != null) {
                        int var18 = (this.field366[var16] >> 8) * 64 - this.field220;
                        int var19 = (this.field366[var16] & 255) * 64 - this.field221;
                        var6.method494(this.field139, var19, this.field227, var17, var18, 0);
                    }
                }
            }
            if (this.field352) {
                int var20 = 0;
                label248: while (true) {
                    if (var20 >= 4) {
                        for (int var30 = 0; var30 < 13; ++var30) {
                            for (int var31 = 0; var31 < 13; ++var31) {
                                int var32 = this.field155[0][var30][var31];
                                if (var32 == -1) {
                                    var6.method499(0, 8, 8, var31 * 8, var30 * 8);
                                }
                            }
                        }
                        this.field447.method523(220, 0);
                        int var33 = 0;
                        while (true) {
                            if (var33 >= 4) {
                                break label248;
                            }
                            for (int var34 = 0; var34 < 13; ++var34) {
                                for (int var35 = 0; var35 < 13; ++var35) {
                                    int var36 = this.field155[var33][var34][var35];
                                    if (var36 != -1) {
                                        int var37 = var36 >> 24 & 3;
                                        int var38 = var36 >> 1 & 3;
                                        int var39 = var36 >> 14 & 1023;
                                        int var40 = var36 >> 3 & 2047;
                                        int var41 = (var39 / 8 << 8) + var40 / 8;
                                        for (int var42 = 0; var42 < this.field366.length; ++var42) {
                                            if (this.field366[var42] == var41 && this.field194[var42] != null) {
                                                var6.method492((var40 & 7) * 8, this.field139, var37, 2, var33, this.field227, var38, var34 * 8, var35 * 8, (var39 & 7) * 8, this.field194[var42]);
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
                            int var23 = this.field155[var20][var21][var22];
                            if (var23 != -1) {
                                int var24 = var23 >> 24 & 3;
                                int var25 = var23 >> 1 & 3;
                                int var26 = var23 >> 14 & 1023;
                                int var27 = var23 >> 3 & 2047;
                                int var28 = (var26 / 8 << 8) + var27 / 8;
                                for (int var29 = 0; var29 < this.field366.length; ++var29) {
                                    if (this.field366[var29] == var28 && this.field289[var29] != null) {
                                        var6.method503(this.field139, this.field289[var29], 129, var24, var21 * 8, var25, (var27 & 7) * 8, (var26 & 7) * 8, var20, var22 * 8);
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    ++var20;
                }
            }
            this.field447.method523(220, 0);
            var6.method511(this.field227, this.field139, 732);
            this.field379.method588(823);
            this.field447.method523(220, 0);
            int var43 = class63.field1559;
            if (var43 > this.field144) {
                var43 = this.field144;
            }
            if (var43 < this.field144 - 1) {
                int var44 = this.field144 - 1;
            }
            if (field372) {
                this.field227.method307(false, class63.field1559);
            } else {
                this.field227.method307(false, 0);
            }
            for (int var45 = 0; var45 < 104; ++var45) {
                for (int var46 = 0; var46 < 104; ++var46) {
                    this.method93(var45, var46);
                }
            }
            this.method87(3);
        } catch (Exception var59) {
        }
        class58.field1470.method299();
        if (super.field1522 != null) {
            this.field447.method523(126, 0);
            this.field447.method528(1057001181);
        }
        if (field372 && signlink.cache_dat != null) {
            int var48 = this.field364.method429(0, 631);
            for (int var49 = 0; var49 < var48; ++var49) {
                int var50 = this.field364.method439(var49, 21251);
                if ((var50 & 121) == 0) {
                    class19.method249(var49, -614);
                }
            }
        }
        System.gc();
        class12.method174(20, false);
        if (arg0) {
            this.field124 = null;
        }
        this.field364.method445((byte) -54);
        int var51 = (this.field187 - 6) / 8 - 1;
        int var52 = (this.field187 + 6) / 8 + 1;
        int var53 = (this.field188 - 6) / 8 - 1;
        int var54 = (this.field188 + 6) / 8 + 1;
        if (this.field151) {
            var51 = 49;
            var52 = 50;
            var53 = 49;
            var54 = 50;
        }
        for (int var55 = var51; var55 <= var52; ++var55) {
            for (int var56 = var53; var56 <= var54; ++var56) {
                if (var51 == var55 || var52 == var55 || var53 == var56 || var54 == var56) {
                    int var57 = this.field364.method438(0, var55, true, var56);
                    if (var57 != -1) {
                        this.field364.method441(this.field492, 3, var57);
                    }
                    int var58 = this.field364.method438(1, var55, true, var56);
                    if (var58 != -1) {
                        this.field364.method441(this.field492, 3, var58);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LRWLOYYVC;B)V")
    public final void method101(class53 arg0, byte arg1) {
        int var3 = arg0.field1317;
        if (arg1 == 0) {
            boolean var4 = false;
        } else {
            for (int var5 = 1; var5 > 0; ++var5) {
            }
        }
        if (var3 >= 1 && var3 <= 100 || var3 >= 701 && var3 <= 800) {
            if (var3 == 1 && this.field129 == 0) {
                arg0.field1291 = "Loading friend list";
                arg0.field1324 = 0;
            } else if (var3 == 1 && this.field129 == 1) {
                arg0.field1291 = "Connecting to friendserver";
                arg0.field1324 = 0;
            } else if (var3 == 2 && this.field129 != 2) {
                arg0.field1291 = "Please wait...";
                arg0.field1324 = 0;
            } else {
                int var6 = this.field128;
                if (this.field129 != 2) {
                    var6 = 0;
                }
                if (var3 > 700) {
                    var3 -= 601;
                } else {
                    --var3;
                }
                if (var3 >= var6) {
                    arg0.field1291 = "";
                    arg0.field1324 = 0;
                } else {
                    arg0.field1291 = this.field177[var3];
                    arg0.field1324 = 1;
                }
            }
        } else if (var3 >= 101 && var3 <= 200 || var3 >= 801 && var3 <= 900) {
            int var7 = this.field128;
            if (this.field129 != 2) {
                var7 = 0;
            }
            if (var3 > 800) {
                var3 -= 701;
            } else {
                var3 -= 101;
            }
            if (var3 >= var7) {
                arg0.field1291 = "";
                arg0.field1324 = 0;
            } else {
                if (this.field339[var3] == 0) {
                    arg0.field1291 = "@red@Offline";
                } else if (this.field339[var3] == field369) {
                    arg0.field1291 = "@gre@World-" + (this.field339[var3] - 9);
                } else {
                    arg0.field1291 = "@yel@World-" + (this.field339[var3] - 9);
                }
                arg0.field1324 = 1;
            }
        } else if (var3 == 203) {
            int var8 = this.field128;
            if (this.field129 != 2) {
                var8 = 0;
            }
            arg0.field1312 = var8 * 15 + 20;
            if (arg0.field1312 <= arg0.field1307) {
                arg0.field1312 = arg0.field1307 + 1;
            }
        } else if (var3 >= 401 && var3 <= 500) {
            var3 -= 401;
            if (var3 == 0 && this.field129 == 0) {
                arg0.field1291 = "Loading ignore list";
                arg0.field1324 = 0;
            } else if (var3 == 1 && this.field129 == 0) {
                arg0.field1291 = "Please wait...";
                arg0.field1324 = 0;
            } else {
                int var9 = this.field429;
                if (this.field129 == 0) {
                    var9 = 0;
                }
                if (var3 >= var9) {
                    arg0.field1291 = "";
                    arg0.field1324 = 0;
                } else {
                    arg0.field1291 = class62.method490(false, class62.method487(this.field303[var3], (byte) 7));
                    arg0.field1324 = 1;
                }
            }
        } else if (var3 == 503) {
            arg0.field1312 = this.field429 * 15 + 20;
            if (arg0.field1312 <= arg0.field1307) {
                arg0.field1312 = arg0.field1307 + 1;
            }
        } else if (var3 == 327) {
            arg0.field1296 = 150;
            arg0.field1297 = (int) (Math.sin((double) field421 / 40.0D) * 256.0D) & 2047;
            if (this.field373) {
                for (int var10 = 0; var10 < 7; ++var10) {
                    int var17 = this.field443[var10];
                    if (var17 >= 0 && !class44.field1169[var17].method385((byte) 8)) {
                        return;
                    }
                }
                this.field373 = false;
                class19[] var11 = new class19[7];
                int var12 = 0;
                for (int var13 = 0; var13 < 7; ++var13) {
                    int var16 = this.field443[var13];
                    if (var16 >= 0) {
                        var11[var12++] = class44.field1169[var16].method386(893);
                    }
                }
                class19 var14 = new class19(var12, 221, var11);
                for (int var15 = 0; var15 < 5; ++var15) {
                    if (this.field482[var15] != 0) {
                        var14.method264(field559[var15][0], field559[var15][this.field482[var15]]);
                        if (var15 == 1) {
                            var14.method264(field446[0], field446[this.field482[var15]]);
                        }
                    }
                }
                var14.method257(284);
                var14.method258(class21.field817[field313.field1678].field819[0], 4);
                var14.method267(64, 850, -30, -50, -30, true);
                arg0.field1320 = 5;
                arg0.field1321 = 0;
                class53.method413(var14, 5, 0, -487);
            }
        } else if (var3 == 324) {
            if (this.field381 == null) {
                this.field381 = arg0.field1322;
                this.field382 = arg0.field1313;
            }
            if (this.field154) {
                arg0.field1322 = this.field382;
            } else {
                arg0.field1322 = this.field381;
            }
        } else if (var3 == 325) {
            if (this.field381 == null) {
                this.field381 = arg0.field1322;
                this.field382 = arg0.field1313;
            }
            if (this.field154) {
                arg0.field1322 = this.field381;
            } else {
                arg0.field1322 = this.field382;
            }
        } else if (var3 == 600) {
            arg0.field1291 = this.field414;
            if (field421 % 20 < 10) {
                arg0.field1291 = arg0.field1291 + "|";
            } else {
                arg0.field1291 = arg0.field1291 + " ";
            }
        } else {
            if (var3 == 613) {
                if (this.field472 >= 1) {
                    if (this.field200) {
                        arg0.field1269 = 16711680;
                        arg0.field1291 = "Moderator option: Mute player for 48 hours: <ON>";
                    } else {
                        arg0.field1269 = 16777215;
                        arg0.field1291 = "Moderator option: Mute player for 48 hours: <OFF>";
                    }
                } else {
                    arg0.field1291 = "";
                }
            }
            if (var3 == 650 || var3 == 655) {
                if (this.field430 != 0) {
                    String var18;
                    if (this.field400 == 0) {
                        var18 = "earlier today";
                    } else if (this.field400 == 1) {
                        var18 = "yesterday";
                    } else {
                        var18 = this.field400 + " days ago";
                    }
                    arg0.field1291 = "You last logged in " + var18 + " from: " + signlink.dns;
                } else {
                    arg0.field1291 = "";
                }
            }
            if (var3 == 651) {
                if (this.field459 == 0) {
                    arg0.field1291 = "0 unread messages";
                    arg0.field1269 = 16776960;
                }
                if (this.field459 == 1) {
                    arg0.field1291 = "1 unread message";
                    arg0.field1269 = 65280;
                }
                if (this.field459 > 1) {
                    arg0.field1291 = this.field459 + " unread messages";
                    arg0.field1269 = 65280;
                }
            }
            if (var3 == 652) {
                if (this.field453 == 201) {
                    if (this.field516 == 1) {
                        arg0.field1291 = "@yel@This is a non-members world: @whi@Since you are a member we";
                    } else {
                        arg0.field1291 = "";
                    }
                } else if (this.field453 == 200) {
                    arg0.field1291 = "You have not yet set any password recovery questions.";
                } else {
                    String var19;
                    if (this.field453 == 0) {
                        var19 = "Earlier today";
                    } else if (this.field453 == 1) {
                        var19 = "Yesterday";
                    } else {
                        var19 = this.field453 + " days ago";
                    }
                    arg0.field1291 = var19 + " you changed your recovery questions";
                }
            }
            if (var3 == 653) {
                if (this.field453 == 201) {
                    if (this.field516 == 1) {
                        arg0.field1291 = "@whi@recommend you use a members world instead. You may use";
                    } else {
                        arg0.field1291 = "";
                    }
                } else if (this.field453 == 200) {
                    arg0.field1291 = "We strongly recommend you do so now to secure your account.";
                } else {
                    arg0.field1291 = "If you do not remember making this change then cancel it immediately";
                }
            }
            if (var3 == 654) {
                if (this.field453 == 201) {
                    if (this.field516 == 1) {
                        arg0.field1291 = "@whi@this world but member benefits are unavailable whilst here.";
                    } else {
                        arg0.field1291 = "";
                    }
                } else if (this.field453 == 200) {
                    arg0.field1291 = "Do this from the 'account management' area on our front webpage";
                } else {
                    arg0.field1291 = "Do this from the 'account management' area on our front webpage";
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(B)V")
    public final void method102(byte arg0) {
        if (arg0 == 6) {
            boolean var2 = false;
        } else {
            for (int var3 = 1; var3 > 0; ++var3) {
            }
        }
        if (!this.field319 && !this.field277 && !this.field408) {
            ++field469;
            if (!this.field452) {
                this.method154(false, 8633);
            } else {
                this.method148((byte) -9);
            }
            this.field517 = 0;
        } else {
            this.method110(this.field571);
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(IIII)I")
    public final int method103(int arg0, int arg1, int arg2, int arg3) {
        int var5 = 256 - arg3;
        while (arg2 >= 0) {
            this.field343 = -1;
        }
        return ((arg0 & 16711935) * var5 + (arg1 & 16711935) * arg3 & -16711936) + ((arg0 & 65280) * var5 + (arg1 & 65280) * arg3 & 16711680) >> 8;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LXJCNBMKS;IZ)V")
    private final void method104(class68 arg0, int arg1, boolean arg2) {
        if (arg2) {
            this.field343 = -1;
        }
        for (int var4 = 0; var4 < this.field233; ++var4) {
            int var5 = this.field234[var4];
            class18 var6 = this.field356[var5];
            int var7 = arg0.method534();
            if ((var7 & 2) != 0) {
                var6.field1709 = arg0.method541();
                var6.field1690 = 100;
            }
            if ((var7 & 32) != 0) {
                int var8 = arg0.method554((byte) 112);
                int var9 = arg0.method553(3);
                var6.method586(field421, var9, false, var8);
                var6.field1669 = field421 + 300;
                var6.field1670 = arg0.method552(22736);
                var6.field1671 = arg0.method554((byte) 112);
            }
            if ((var7 & 8) != 0) {
                var6.field1673 = arg0.method559(0);
                int var10 = arg0.method567(false);
                var6.field1677 = var10 >> 16;
                var6.field1676 = (var10 & 65535) + field421;
                var6.field1674 = 0;
                var6.field1675 = 0;
                if (var6.field1676 > field421) {
                    var6.field1674 = -1;
                }
                if (var6.field1673 == 65535) {
                    var6.field1673 = -1;
                }
            }
            if ((var7 & 64) != 0) {
                var6.field1708 = arg0.method560(-123);
                if (var6.field1708 == 65535) {
                    var6.field1708 = -1;
                }
            }
            if ((var7 & 16) != 0) {
                var6.field722 = class37.method368(arg0.method561(-862));
                var6.field1712 = var6.field722.field1090;
                var6.field1705 = var6.field722.field1079;
                var6.field1713 = var6.field722.field1075;
                var6.field1714 = var6.field722.field1080;
                var6.field1715 = var6.field722.field1074;
                var6.field1716 = var6.field722.field1099;
                var6.field1678 = var6.field722.field1091;
            }
            if ((var7 & 4) != 0) {
                int var11 = arg0.method559(0);
                if (var11 == 65535) {
                    var11 = -1;
                }
                int var12 = arg0.method534();
                if (var6.field1698 == var11 && var11 != -1) {
                    int var13 = class21.field817[var11].field831;
                    if (var13 == 1) {
                        var6.field1699 = 0;
                        var6.field1700 = 0;
                        var6.field1701 = var12;
                        var6.field1702 = 0;
                    }
                    if (var13 == 2) {
                        var6.field1702 = 0;
                    }
                } else if (var11 == -1 || var6.field1698 == -1 || class21.field817[var11].field825 >= class21.field817[var6.field1698].field825) {
                    var6.field1698 = var11;
                    var6.field1699 = 0;
                    var6.field1700 = 0;
                    var6.field1701 = var12;
                    var6.field1702 = 0;
                    var6.field1724 = var6.field1704;
                }
            }
            if ((var7 & 128) != 0) {
                var6.field1710 = arg0.method559(0);
                var6.field1711 = arg0.method561(-862);
            }
            if ((var7 & 1) != 0) {
                int var14 = arg0.method554((byte) 112);
                int var15 = arg0.method553(3);
                var6.method586(field421, var15, false, var14);
                var6.field1669 = field421 + 300;
                var6.field1670 = arg0.method534();
                var6.field1671 = arg0.method553(3);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LOTTYZSZE;ILXJCNBMKS;II)V")
    private final void method105(class45 arg0, int arg1, class68 arg2, int arg3, int arg4) {
        if (arg1 >= 7 && arg1 <= 7) {
            if ((arg3 & 2) != 0) {
                int var6 = arg2.method554((byte) 112);
                int var7 = arg2.method552(22736);
                arg0.method586(field421, var7, false, var6);
                arg0.field1669 = field421 + 300;
                arg0.field1670 = arg2.method534();
                arg0.field1671 = arg2.method552(22736);
            }
            if ((arg3 & 512) != 0) {
                arg0.field1682 = arg2.method554((byte) 112);
                arg0.field1684 = arg2.method552(22736);
                arg0.field1683 = arg2.method553(3);
                arg0.field1685 = arg2.method554((byte) 112);
                arg0.field1686 = arg2.method561(-862) + field421;
                arg0.field1687 = arg2.method559(0) + field421;
                arg0.field1688 = arg2.method554((byte) 112);
                arg0.method587(4);
            }
            if ((arg3 & 32) != 0) {
                arg0.field1708 = arg2.method536();
                if (arg0.field1708 == 65535) {
                    arg0.field1708 = -1;
                }
            }
            if ((arg3 & 8) != 0) {
                arg0.field1710 = arg2.method559(0);
                arg0.field1711 = arg2.method536();
            }
            if ((arg3 & 256) != 0) {
                int var8 = arg2.method553(3);
                int var9 = arg2.method554((byte) 112);
                arg0.method586(field421, var9, false, var8);
                arg0.field1669 = field421 + 300;
                arg0.field1670 = arg2.method534();
                arg0.field1671 = arg2.method534();
            }
            if ((arg3 & 4) != 0) {
                int var10 = arg2.method553(3);
                byte[] var11 = new byte[var10];
                class68 var12 = new class68((byte) 9, var11);
                arg2.method569(0, var11, false, var10);
                this.field235[arg4] = var12;
                arg0.method390(this.field297, var12);
            }
            if ((arg3 & 64) != 0) {
                int var13 = arg2.method559(0);
                int var14 = arg2.method553(3);
                int var15 = arg2.method534();
                int var16 = arg2.field1643;
                if (arg0.field1193 != null && arg0.field1194) {
                    long var17 = class62.method486(arg0.field1193);
                    boolean var19 = false;
                    if (var14 <= 1) {
                        for (int var20 = 0; var20 < this.field429; ++var20) {
                            if (this.field303[var20] == var17) {
                                var19 = true;
                                break;
                            }
                        }
                    }
                    if (!var19 && this.field170 == 0) {
                        try {
                            this.field355.field1643 = 0;
                            arg2.method570(0, this.field355.field1642, (byte) -54, var15);
                            this.field355.field1643 = 0;
                            String var21 = class48.method397(this.field246, var15, this.field355);
                            String var22 = class16.method216(var21, 0);
                            arg0.field1709 = var22;
                            arg0.field1680 = var13 >> 8;
                            arg0.field1689 = var13 & 255;
                            arg0.field1690 = 150;
                            if (var14 != 2 && var14 != 3) {
                                if (var14 == 1) {
                                    this.method26(0, var22, "@cr1@" + arg0.field1193, 1);
                                } else {
                                    this.method26(0, var22, arg0.field1193, 2);
                                }
                            } else {
                                this.method26(0, var22, "@cr2@" + arg0.field1193, 1);
                            }
                        } catch (Exception var28) {
                            signlink.reporterror("cde2");
                        }
                    }
                }
                arg2.field1643 = var15 + var16;
            }
            if ((arg3 & 1024) != 0) {
                arg0.field1673 = arg2.method561(-862);
                int var24 = arg2.method567(false);
                arg0.field1677 = var24 >> 16;
                arg0.field1676 = (var24 & 65535) + field421;
                arg0.field1674 = 0;
                arg0.field1675 = 0;
                if (arg0.field1676 > field421) {
                    arg0.field1674 = -1;
                }
                if (arg0.field1673 == 65535) {
                    arg0.field1673 = -1;
                }
            }
            if ((arg3 & 1) != 0) {
                int var25 = arg2.method536();
                if (var25 == 65535) {
                    var25 = -1;
                }
                int var26 = arg2.method553(3);
                if (arg0.field1698 == var25 && var25 != -1) {
                    int var27 = class21.field817[var25].field831;
                    if (var27 == 1) {
                        arg0.field1699 = 0;
                        arg0.field1700 = 0;
                        arg0.field1701 = var26;
                        arg0.field1702 = 0;
                    }
                    if (var27 == 2) {
                        arg0.field1702 = 0;
                    }
                } else if (var25 == -1 || arg0.field1698 == -1 || class21.field817[var25].field825 >= class21.field817[arg0.field1698].field825) {
                    arg0.field1698 = var25;
                    arg0.field1699 = 0;
                    arg0.field1700 = 0;
                    arg0.field1701 = var26;
                    arg0.field1702 = 0;
                    arg0.field1724 = arg0.field1704;
                }
            }
            if ((arg3 & 128) != 0) {
                arg0.field1709 = arg2.method541();
                if (arg0.field1709.charAt(0) == '~') {
                    arg0.field1709 = arg0.field1709.substring(1);
                    this.method26(0, arg0.field1709, arg0.field1193, 2);
                } else if (field313 == arg0) {
                    this.method26(0, arg0.field1709, arg0.field1193, 2);
                }
                arg0.field1680 = 0;
                arg0.field1689 = 0;
                arg0.field1690 = 150;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
    public final void method106(Runnable arg0, int arg1) {
        if (arg1 > 10) {
            arg1 = 10;
        }
        if (signlink.mainapp != null) {
            signlink.startthread(arg0, arg1);
        } else {
            super.method106(arg0, arg1);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IZLjava/lang/String;)V")
    public final void method107(int arg0, boolean arg1, String arg2) {
        if (!arg1) {
            this.field512 = arg0;
            this.field183 = arg2;
            this.method22((byte) 6);
            if (this.field490 == null) {
                super.method107(arg0, false, arg2);
            } else {
                this.field332.method588(823);
                short var4 = 360;
                short var5 = 200;
                byte var6 = 20;
                this.field142.method466(var5 / 2 - 26 - var6, "RuneScape is loading - please wait...", 16777215, var4 / 2, 5);
                int var7 = var5 / 2 - 18 - var6;
                class22.method285(34, 9179409, var4 / 2 - 152, 304, -1086, var7);
                class22.method285(32, 0, var4 / 2 - 151, 302, -1086, var7 + 1);
                class22.method284(var4 / 2 - 150, var7 + 2, 9179409, arg0 * 3, 47782, 30);
                class22.method284(arg0 * 3 + (var4 / 2 - 150), var7 + 2, 0, 300 - arg0 * 3, 47782, 30);
                this.field142.method466(var5 / 2 + 5 - var6, arg2, 16777215, var4 / 2, 5);
                this.field332.method589(171, super.field1519, 418, 202);
                if (this.field420) {
                    this.field420 = false;
                    if (!this.field363) {
                        this.field333.method589(0, super.field1519, 418, 0);
                        this.field334.method589(0, super.field1519, 418, 637);
                    }
                    this.field330.method589(0, super.field1519, 418, 128);
                    this.field331.method589(371, super.field1519, 418, 202);
                    this.field335.method589(265, super.field1519, 418, 0);
                    this.field336.method589(265, super.field1519, 418, 562);
                    this.field337.method589(171, super.field1519, 418, 128);
                    this.field338.method589(171, super.field1519, 418, 562);
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LXJCNBMKS;ZI)V")
    private final void method108(class68 arg0, boolean arg1, int arg2) {
        if (arg1) {
            field412 = !field412;
        }
        while (arg0.field1644 + 21 < arg2 * 8) {
            int var4 = arg0.method545(true, 14);
            if (var4 == 16383) {
                break;
            }
            if (this.field356[var4] == null) {
                this.field356[var4] = new class18();
            }
            class18 var5 = this.field356[var4];
            this.field358[this.field357++] = var4;
            var5.field1681 = field421;
            int var6 = arg0.method545(true, 1);
            if (var6 == 1) {
                this.field234[this.field233++] = var4;
            }
            int var7 = arg0.method545(true, 5);
            if (var7 > 15) {
                var7 -= 32;
            }
            int var8 = arg0.method545(true, 5);
            if (var8 > 15) {
                var8 -= 32;
            }
            var5.field722 = class37.method368(arg0.method545(true, 12));
            int var9 = arg0.method545(true, 1);
            var5.field1712 = var5.field722.field1090;
            var5.field1705 = var5.field722.field1079;
            var5.field1713 = var5.field722.field1075;
            var5.field1714 = var5.field722.field1080;
            var5.field1715 = var5.field722.field1074;
            var5.field1716 = var5.field722.field1099;
            var5.field1678 = var5.field722.field1091;
            var5.method585(2, field313.field1696[0] + var8, field313.field1697[0] + var7, var9 == 1);
        }
        arg0.method546(0);
    }

    @OriginalMember(owner = "client", name = "o", descriptor = "(Z)V")
    public final void method109(boolean arg0) {
        if (!arg0) {
            try {
                if (this.field209 != null) {
                    this.field209.method192();
                }
            } catch (Exception var3) {
            }
            this.field209 = null;
            this.field452 = false;
            this.field555 = 0;
            this.field300 = "";
            this.field301 = "";
            this.method19(-39695);
            this.field227.method306(818);
            for (int var2 = 0; var2 < 4; ++var2) {
                this.field139[var2].method371();
            }
            System.gc();
            this.method96(1);
            this.field570 = -1;
            this.field422 = -1;
            this.field538 = 0;
        }
    }

    @OriginalMember(owner = "client", name = "y", descriptor = "(I)V")
    public final void method110(int arg0) {
        Graphics var2 = this.method28((byte) 7).getGraphics();
        var2.setColor(Color.black);
        var2.fillRect(0, 0, 765, 503);
        this.method484(702, 1);
        this.field342 += arg0;
        if (this.field277) {
            this.field363 = false;
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
        if (this.field408) {
            this.field363 = false;
            var2.setFont(new Font("Helvetica", 1, 20));
            var2.setColor(Color.white);
            var2.drawString("Error - unable to load game!", 50, 50);
            var2.drawString("To play RuneScape make sure you play from", 50, 100);
            var2.drawString("http://www.runescape.com", 50, 150);
        }
        if (this.field319) {
            this.field363 = false;
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

    @OriginalMember(owner = "client", name = "d", descriptor = "(IIII)Z")
    public final boolean method111(int arg0, int arg1, int arg2, int arg3) {
        int var5 = arg0 >> 14 & 32767;
        int var6 = this.field227.method336(this.field144, arg1, arg2, arg0);
        if (var6 == -1) {
            return false;
        } else {
            int var7 = var6 & 31;
            int var8 = var6 >> 6 & 3;
            if (var7 != 10 && var7 != 11 && var7 != 22) {
                this.method82(0, 0, 0, 2, 0, field313.field1696[0], arg1, false, field313.field1697[0], arg2, var8, var7 + 1);
            } else {
                class58 var9 = class58.method455(var5);
                int var10;
                int var11;
                if (var8 != 0 && var8 != 2) {
                    var10 = var9.field1439;
                    var11 = var9.field1450;
                } else {
                    var10 = var9.field1450;
                    var11 = var9.field1439;
                }
                int var12 = var9.field1465;
                if (var8 != 0) {
                    var12 = (var12 >> 4 - var8) + (var12 << var8 & 15);
                }
                this.method82(var10, 0, var11, 2, var12, field313.field1696[0], arg1, false, field313.field1697[0], arg2, 0, 0);
            }
            this.field589 = super.field1534;
            if (arg3 != 0) {
                throw new NullPointerException();
            } else {
                this.field590 = super.field1535;
                this.field592 = 2;
                this.field591 = 0;
                return true;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BI)Ljava/lang/String;")
    public final String method112(byte arg0, int arg1) {
        if (arg0 != -119) {
            this.field298 = !this.field298;
        }
        return arg1 < 999999999 ? String.valueOf(arg1) : "*";
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(III)V")
    public final void method113(int arg0, int arg1, int arg2) {
        int var4 = 0;
        if (arg2 >= 0) {
            this.field447.method524(227);
        }
        for (int var5 = 0; var5 < 100; ++var5) {
            if (this.field245[var5] != null) {
                int var6 = this.field243[var5];
                int var7 = 70 - var4 * 14 + this.field130 + 4;
                if (var7 < -20) {
                    break;
                }
                String var8 = this.field244[var5];
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
                if ((var6 == 1 || var6 == 2) && (var6 == 1 || this.field527 == 0 || this.field527 == 1 && this.method68(46314, var8))) {
                    if (arg1 > var7 - 14 && arg1 <= var7 && !var8.equals(field313.field1193)) {
                        if (this.field472 >= 1) {
                            this.field131[this.field122] = "Report abuse @whi@" + var8;
                            this.field286[this.field122] = 38;
                            ++this.field122;
                        }
                        this.field131[this.field122] = "Add ignore @whi@" + var8;
                        this.field286[this.field122] = 376;
                        ++this.field122;
                        this.field131[this.field122] = "Add friend @whi@" + var8;
                        this.field286[this.field122] = 554;
                        ++this.field122;
                    }
                    ++var4;
                }
                if ((var6 == 3 || var6 == 7) && this.field509 == 0 && (var6 == 7 || this.field410 == 0 || this.field410 == 1 && this.method68(46314, var8))) {
                    if (arg1 > var7 - 14 && arg1 <= var7) {
                        if (this.field472 >= 1) {
                            this.field131[this.field122] = "Report abuse @whi@" + var8;
                            this.field286[this.field122] = 38;
                            ++this.field122;
                        }
                        this.field131[this.field122] = "Add ignore @whi@" + var8;
                        this.field286[this.field122] = 376;
                        ++this.field122;
                        this.field131[this.field122] = "Add friend @whi@" + var8;
                        this.field286[this.field122] = 554;
                        ++this.field122;
                    }
                    ++var4;
                }
                if (var6 == 4 && (this.field176 == 0 || this.field176 == 1 && this.method68(46314, var8))) {
                    if (arg1 > var7 - 14 && arg1 <= var7) {
                        this.field131[this.field122] = "Accept trade @whi@" + var8;
                        this.field286[this.field122] = 543;
                        ++this.field122;
                    }
                    ++var4;
                }
                if ((var6 == 5 || var6 == 6) && this.field509 == 0 && this.field410 < 2) {
                    ++var4;
                }
                if (var6 == 8 && (this.field176 == 0 || this.field176 == 1 && this.method68(46314, var8))) {
                    if (arg1 > var7 - 14 && arg1 <= var7) {
                        this.field131[this.field122] = "Accept challenge @whi@" + var8;
                        this.field286[this.field122] = 219;
                        ++this.field122;
                    }
                    ++var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LOTTYZSZE;ZIII)V")
    public final void method114(class45 arg0, boolean arg1, int arg2, int arg3, int arg4) {
        if (field313 != arg0) {
            if (this.field122 < 400) {
                if (arg1) {
                    this.field343 = -1;
                }
                String var6;
                if (arg0.field1201 == 0) {
                    var6 = arg0.field1193 + method60(arg0.field1183, 505, field313.field1183) + " (level-" + arg0.field1183 + ")";
                } else {
                    var6 = arg0.field1193 + " (skill-" + arg0.field1201 + ")";
                }
                if (this.field391 == 1) {
                    this.field131[this.field122] = "Use " + this.field395 + " with @whi@" + var6;
                    this.field286[this.field122] = 291;
                    this.field287[this.field122] = arg3;
                    this.field284[this.field122] = arg2;
                    this.field285[this.field122] = arg4;
                    ++this.field122;
                } else if (this.field518 == 1) {
                    if ((this.field520 & 8) == 8) {
                        this.field131[this.field122] = this.field521 + " @whi@" + var6;
                        this.field286[this.field122] = 108;
                        this.field287[this.field122] = arg3;
                        this.field284[this.field122] = arg2;
                        this.field285[this.field122] = arg4;
                        ++this.field122;
                    }
                } else {
                    for (int var7 = 4; var7 >= 0; --var7) {
                        if (this.field587[var7] != null) {
                            this.field131[this.field122] = this.field587[var7] + " @whi@" + var6;
                            short var9 = 0;
                            if (this.field587[var7].equalsIgnoreCase("attack")) {
                                if (arg0.field1183 > field313.field1183) {
                                    var9 = 2000;
                                }
                                if (field313.field1185 != 0 && arg0.field1185 != 0) {
                                    if (field313.field1185 == arg0.field1185) {
                                        var9 = 2000;
                                    } else {
                                        var9 = 0;
                                    }
                                }
                            } else if (this.field588[var7]) {
                                var9 = 2000;
                            }
                            if (var7 == 0) {
                                this.field286[this.field122] = var9 + 822;
                            }
                            if (var7 == 1) {
                                this.field286[this.field122] = var9 + 986;
                            }
                            if (var7 == 2) {
                                this.field286[this.field122] = var9 + 431;
                            }
                            if (var7 == 3) {
                                this.field286[this.field122] = var9 + 916;
                            }
                            if (var7 == 4) {
                                this.field286[this.field122] = var9 + 132;
                            }
                            this.field287[this.field122] = arg3;
                            this.field284[this.field122] = arg2;
                            this.field285[this.field122] = arg4;
                            ++this.field122;
                        }
                    }
                }
                for (int var8 = 0; var8 < this.field122; ++var8) {
                    if (this.field286[var8] == 746) {
                        this.field131[var8] = "Walk here @whi@" + var6;
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(LXJCNBMKS;IZ)V")
    private final void method115(class68 arg0, int arg1, boolean arg2) {
        int var4 = arg0.method545(true, 8);
        if (var4 < this.field231) {
            for (int var5 = var4; var5 < this.field231; ++var5) {
                this.field489[this.field488++] = this.field232[var5];
            }
        }
        if (var4 > this.field231) {
            signlink.reporterror(this.field300 + " Too many players");
            throw new RuntimeException("eek");
        } else {
            this.field231 = 0;
            for (int var6 = 0; var6 < var4; ++var6) {
                int var7 = this.field232[var6];
                class45 var8 = this.field230[var7];
                int var9 = arg0.method545(true, 1);
                if (var9 == 0) {
                    this.field232[this.field231++] = var7;
                    var8.field1681 = field421;
                } else {
                    int var10 = arg0.method545(true, 2);
                    if (var10 == 0) {
                        this.field232[this.field231++] = var7;
                        var8.field1681 = field421;
                        this.field234[this.field233++] = var7;
                    } else if (var10 == 1) {
                        this.field232[this.field231++] = var7;
                        var8.field1681 = field421;
                        int var11 = arg0.method545(true, 3);
                        var8.method584((byte) 9, false, var11);
                        int var12 = arg0.method545(true, 1);
                        if (var12 == 1) {
                            this.field234[this.field233++] = var7;
                        }
                    } else if (var10 == 2) {
                        this.field232[this.field231++] = var7;
                        var8.field1681 = field421;
                        int var13 = arg0.method545(true, 3);
                        var8.method584((byte) 9, true, var13);
                        int var14 = arg0.method545(true, 3);
                        var8.method584((byte) 9, true, var14);
                        int var15 = arg0.method545(true, 1);
                        if (var15 == 1) {
                            this.field234[this.field233++] = var7;
                        }
                    } else if (var10 == 3) {
                        this.field489[this.field488++] = var7;
                    }
                }
            }
            this.field452 &= arg2;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILNHTDEVDA;IZI)V")
    public final void method116(int arg0, class37 arg1, int arg2, boolean arg3, int arg4) {
        this.field452 &= arg3;
        if (this.field122 < 400) {
            if (arg1.field1082 != null) {
                arg1 = arg1.method364(-670);
            }
            if (arg1 != null) {
                if (arg1.field1095) {
                    String var6 = arg1.field1109;
                    if (arg1.field1068 != 0) {
                        var6 = var6 + method60(arg1.field1068, 505, field313.field1183) + " (level-" + arg1.field1068 + ")";
                    }
                    if (this.field391 == 1) {
                        this.field131[this.field122] = "Use " + this.field395 + " with @yel@" + var6;
                        this.field286[this.field122] = 450;
                        this.field287[this.field122] = arg2;
                        this.field284[this.field122] = arg4;
                        this.field285[this.field122] = arg0;
                        ++this.field122;
                    } else {
                        if (this.field518 == 1) {
                            if ((this.field520 & 2) == 2) {
                                this.field131[this.field122] = this.field521 + " @yel@" + var6;
                                this.field286[this.field122] = 902;
                                this.field287[this.field122] = arg2;
                                this.field284[this.field122] = arg4;
                                this.field285[this.field122] = arg0;
                                ++this.field122;
                                return;
                            }
                        } else {
                            if (arg1.field1097 != null) {
                                for (int var7 = 4; var7 >= 0; --var7) {
                                    if (arg1.field1097[var7] != null && !arg1.field1097[var7].equalsIgnoreCase("attack")) {
                                        this.field131[this.field122] = arg1.field1097[var7] + " @yel@" + var6;
                                        if (var7 == 0) {
                                            this.field286[this.field122] = 173;
                                        }
                                        if (var7 == 1) {
                                            this.field286[this.field122] = 11;
                                        }
                                        if (var7 == 2) {
                                            this.field286[this.field122] = 567;
                                        }
                                        if (var7 == 3) {
                                            this.field286[this.field122] = 415;
                                        }
                                        if (var7 == 4) {
                                            this.field286[this.field122] = 246;
                                        }
                                        this.field287[this.field122] = arg2;
                                        this.field284[this.field122] = arg4;
                                        this.field285[this.field122] = arg0;
                                        ++this.field122;
                                    }
                                }
                            }
                            if (arg1.field1097 != null) {
                                for (int var8 = 4; var8 >= 0; --var8) {
                                    if (arg1.field1097[var8] != null && arg1.field1097[var8].equalsIgnoreCase("attack")) {
                                        short var9 = 0;
                                        if (arg1.field1068 > field313.field1183) {
                                            var9 = 2000;
                                        }
                                        this.field131[this.field122] = arg1.field1097[var8] + " @yel@" + var6;
                                        if (var8 == 0) {
                                            this.field286[this.field122] = var9 + 173;
                                        }
                                        if (var8 == 1) {
                                            this.field286[this.field122] = var9 + 11;
                                        }
                                        if (var8 == 2) {
                                            this.field286[this.field122] = var9 + 567;
                                        }
                                        if (var8 == 3) {
                                            this.field286[this.field122] = var9 + 415;
                                        }
                                        if (var8 == 4) {
                                            this.field286[this.field122] = var9 + 246;
                                        }
                                        this.field287[this.field122] = arg2;
                                        this.field284[this.field122] = arg4;
                                        this.field285[this.field122] = arg0;
                                        ++this.field122;
                                    }
                                }
                            }
                            this.field131[this.field122] = "Examine @yel@" + var6;
                            this.field286[this.field122] = 1569;
                            this.field287[this.field122] = arg2;
                            this.field284[this.field122] = arg4;
                            this.field285[this.field122] = arg0;
                            ++this.field122;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(II)Ljava/lang/String;")
    private static final String method117(int arg0, int arg1) {
        String var2 = String.valueOf(arg0);
        if (arg1 != 0) {
            field426 = 98;
        }
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

    @OriginalMember(owner = "client", name = "z", descriptor = "(I)V")
    public final void method118(int arg0) {
        if (this.field391 == 0 && this.field518 == 0) {
            this.field131[this.field122] = "Walk here";
            this.field286[this.field122] = 746;
            this.field284[this.field122] = super.field1527;
            this.field285[this.field122] = super.field1528;
            ++this.field122;
        }
        int var2 = -1;
        for (int var3 = 0; var3 < class19.field794; ++var3) {
            int var4 = class19.field795[var3];
            int var5 = var4 & 127;
            int var6 = var4 >> 7 & 127;
            int var7 = var4 >> 29 & 3;
            int var8 = var4 >> 14 & 32767;
            if (var2 != var4) {
                var2 = var4;
                if (var7 == 2 && this.field227.method336(this.field144, var5, var6, var4) >= 0) {
                    class58 var9 = class58.method455(var8);
                    if (var9.field1467 != null) {
                        var9 = var9.method457((byte) 1);
                    }
                    if (var9 == null) {
                        continue;
                    }
                    if (this.field391 == 1) {
                        this.field131[this.field122] = "Use " + this.field395 + " with @cya@" + var9.field1437;
                        this.field286[this.field122] = 31;
                        this.field287[this.field122] = var4;
                        this.field284[this.field122] = var5;
                        this.field285[this.field122] = var6;
                        ++this.field122;
                    } else if (this.field518 == 1) {
                        if ((this.field520 & 4) == 4) {
                            this.field131[this.field122] = this.field521 + " @cya@" + var9.field1437;
                            this.field286[this.field122] = 591;
                            this.field287[this.field122] = var4;
                            this.field284[this.field122] = var5;
                            this.field285[this.field122] = var6;
                            ++this.field122;
                        }
                    } else {
                        if (var9.field1475 != null) {
                            for (int var10 = 4; var10 >= 0; --var10) {
                                if (var9.field1475[var10] != null) {
                                    this.field131[this.field122] = var9.field1475[var10] + " @cya@" + var9.field1437;
                                    if (var10 == 0) {
                                        this.field286[this.field122] = 948;
                                    }
                                    if (var10 == 1) {
                                        this.field286[this.field122] = 957;
                                    }
                                    if (var10 == 2) {
                                        this.field286[this.field122] = 941;
                                    }
                                    if (var10 == 3) {
                                        this.field286[this.field122] = 947;
                                    }
                                    if (var10 == 4) {
                                        this.field286[this.field122] = 1555;
                                    }
                                    this.field287[this.field122] = var4;
                                    this.field284[this.field122] = var5;
                                    this.field285[this.field122] = var6;
                                    ++this.field122;
                                }
                            }
                        }
                        this.field131[this.field122] = "Examine @cya@" + var9.field1437;
                        this.field286[this.field122] = 1595;
                        this.field287[this.field122] = var9.field1455 << 14;
                        this.field284[this.field122] = var5;
                        this.field285[this.field122] = var6;
                        ++this.field122;
                    }
                }
                if (var7 == 1) {
                    class18 var11 = this.field356[var8];
                    if (var11.field722.field1090 == 1 && (var11.field1721 & 127) == 64 && (var11.field1722 & 127) == 64) {
                        for (int var12 = 0; var12 < this.field357; ++var12) {
                            class18 var15 = this.field356[this.field358[var12]];
                            if (var15 != null && var11 != var15 && var15.field722.field1090 == 1 && var11.field1721 == var15.field1721 && var11.field1722 == var15.field1722) {
                                this.method116(var6, var15.field722, this.field358[var12], true, var5);
                            }
                        }
                        for (int var13 = 0; var13 < this.field231; ++var13) {
                            class45 var14 = this.field230[this.field232[var13]];
                            if (var14 != null && var11.field1721 == var14.field1721 && var11.field1722 == var14.field1722) {
                                this.method114(var14, false, var5, this.field232[var13], var6);
                            }
                        }
                    }
                    this.method116(var6, var11.field722, var8, true, var5);
                }
                if (var7 == 0) {
                    class45 var16 = this.field230[var8];
                    if ((var16.field1721 & 127) == 64 && (var16.field1722 & 127) == 64) {
                        for (int var17 = 0; var17 < this.field357; ++var17) {
                            class18 var20 = this.field356[this.field358[var17]];
                            if (var20 != null && var20.field722.field1090 == 1 && var16.field1721 == var20.field1721 && var16.field1722 == var20.field1722) {
                                this.method116(var6, var20.field722, this.field358[var17], true, var5);
                            }
                        }
                        for (int var18 = 0; var18 < this.field231; ++var18) {
                            class45 var19 = this.field230[this.field232[var18]];
                            if (var19 != null && var16 != var19 && var16.field1721 == var19.field1721 && var16.field1722 == var19.field1722) {
                                this.method114(var19, false, var5, this.field232[var18], var6);
                            }
                        }
                    }
                    this.method114(var16, false, var5, var8, var6);
                }
                if (var7 == 3) {
                    class15 var21 = this.field124[this.field144][var5][var6];
                    if (var21 != null) {
                        for (class33 var22 = (class33) var21.method202(-2258); var22 != null; var22 = (class33) var21.method204((byte) 0)) {
                            class5 var23 = class5.method13(var22.field1041);
                            if (this.field391 == 1) {
                                this.field131[this.field122] = "Use " + this.field395 + " with @lre@" + var23.field51;
                                this.field286[this.field122] = 358;
                                this.field287[this.field122] = var22.field1041;
                                this.field284[this.field122] = var5;
                                this.field285[this.field122] = var6;
                                ++this.field122;
                            } else if (this.field518 == 1) {
                                if ((this.field520 & 1) == 1) {
                                    this.field131[this.field122] = this.field521 + " @lre@" + var23.field51;
                                    this.field286[this.field122] = 558;
                                    this.field287[this.field122] = var22.field1041;
                                    this.field284[this.field122] = var5;
                                    this.field285[this.field122] = var6;
                                    ++this.field122;
                                }
                            } else {
                                for (int var24 = 4; var24 >= 0; --var24) {
                                    if (var23.field70 != null && var23.field70[var24] != null) {
                                        this.field131[this.field122] = var23.field70[var24] + " @lre@" + var23.field51;
                                        if (var24 == 0) {
                                            this.field286[this.field122] = 410;
                                        }
                                        if (var24 == 1) {
                                            this.field286[this.field122] = 129;
                                        }
                                        if (var24 == 2) {
                                            this.field286[this.field122] = 790;
                                        }
                                        if (var24 == 3) {
                                            this.field286[this.field122] = 922;
                                        }
                                        if (var24 == 4) {
                                            this.field286[this.field122] = 579;
                                        }
                                        this.field287[this.field122] = var22.field1041;
                                        this.field284[this.field122] = var5;
                                        this.field285[this.field122] = var6;
                                        ++this.field122;
                                    } else if (var24 == 2) {
                                        this.field131[this.field122] = "Take @lre@" + var23.field51;
                                        this.field286[this.field122] = 790;
                                        this.field287[this.field122] = var22.field1041;
                                        this.field284[this.field122] = var5;
                                        this.field285[this.field122] = var6;
                                        ++this.field122;
                                    }
                                }
                                this.field131[this.field122] = "Examine @lre@" + var23.field51;
                                this.field286[this.field122] = 1070;
                                this.field287[this.field122] = var22.field1041;
                                this.field284[this.field122] = var5;
                                this.field285[this.field122] = var6;
                                ++this.field122;
                            }
                        }
                    }
                }
            }
        }
        if (arg0 >= 0) {
            this.method46();
        }
    }

    @OriginalMember(owner = "client", name = "A", descriptor = "(I)V")
    public final void method119(int arg0) {
        int var2 = 15 / arg0;
        if (field372 && this.field218 == 2 && class63.field1579 != this.field144) {
            this.field379.method588(823);
            this.field141.method466(151, "Loading - please wait.", 0, 257, 5);
            this.field141.method466(150, "Loading - please wait.", 16777215, 256, 5);
            this.field379.method589(4, super.field1519, 418, 4);
            this.field218 = 1;
            this.field389 = System.currentTimeMillis();
        }
        if (this.field218 == 1) {
            int var3 = this.method120((byte) 9);
            if (var3 != 0 && System.currentTimeMillis() - this.field389 > 360000L) {
                signlink.reporterror(this.field300 + " glcfb " + this.field563 + "," + var3 + "," + field372 + "," + this.field493[0] + "," + this.field364.method440() + "," + this.field144 + "," + this.field187 + "," + this.field188);
                this.field389 = System.currentTimeMillis();
            }
        }
        if (this.field218 == 2 && this.field526 != this.field144) {
            this.field526 = this.field144;
            this.method99(2, this.field144);
        }
    }

    @OriginalMember(owner = "client", name = "n", descriptor = "(B)I")
    public final int method120(byte arg0) {
        for (int var2 = 0; var2 < this.field289.length; ++var2) {
            if (this.field289[var2] == null && this.field367[var2] != -1) {
                return -1;
            }
            if (this.field194[var2] == null && this.field368[var2] != -1) {
                return -2;
            }
        }
        boolean var3 = true;
        for (int var4 = 0; var4 < this.field289.length; ++var4) {
            byte[] var6 = this.field194[var4];
            if (var6 != null) {
                int var7 = (this.field366[var4] >> 8) * 64 - this.field220;
                int var8 = (this.field366[var4] & 255) * 64 - this.field221;
                if (this.field352) {
                    var7 = 10;
                    var8 = 10;
                }
                var3 &= class63.method498(var7, var8, var6, 43518);
            }
        }
        if (!var3) {
            return -3;
        } else if (this.field387) {
            return -4;
        } else {
            this.field218 = 2;
            class63.field1579 = this.field144;
            this.method100(false);
            if (arg0 == 9) {
                boolean var5 = false;
            } else {
                field308 = !field308;
            }
            this.field447.method523(255, 0);
            return 0;
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(Z)V")
    public final void method121(boolean arg0) {
        this.field420 = true;
        if (arg0) {
            this.field124 = null;
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(LXJCNBMKS;IZ)V")
    private final void method122(class68 arg0, int arg1, boolean arg2) {
        while (true) {
            if (arg0.field1644 + 10 < arg1 * 8) {
                int var4 = arg0.method545(true, 11);
                if (var4 != 2047) {
                    if (this.field230[var4] == null) {
                        this.field230[var4] = new class45();
                        if (this.field235[var4] != null) {
                            this.field230[var4].method390(this.field297, this.field235[var4]);
                        }
                    }
                    this.field232[this.field231++] = var4;
                    class45 var5 = this.field230[var4];
                    var5.field1681 = field421;
                    int var6 = arg0.method545(true, 1);
                    int var7 = arg0.method545(true, 1);
                    if (var7 == 1) {
                        this.field234[this.field233++] = var4;
                    }
                    int var8 = arg0.method545(true, 5);
                    if (var8 > 15) {
                        var8 -= 32;
                    }
                    int var9 = arg0.method545(true, 5);
                    if (var9 > 15) {
                        var9 -= 32;
                    }
                    var5.method585(2, field313.field1696[0] + var8, field313.field1697[0] + var9, var6 == 1);
                    continue;
                }
            }
            arg0.method546(0);
            if (arg2) {
                this.method46();
                return;
            }
            return;
        }
    }

    @OriginalMember(owner = "client", name = "B", descriptor = "(I)V")
    private final void method123(int arg0) {
        if (arg0 <= 0) {
            this.field124 = null;
        }
        if (this.field218 == 2) {
            for (class42 var2 = (class42) this.field212.method201(); var2 != null; var2 = (class42) this.field212.method203((byte) 3)) {
                if (var2.field1139 > 0) {
                    --var2.field1139;
                }
                if (var2.field1139 == 0) {
                    if (var2.field1144 < 0 || class63.method500(-239, var2.field1144, var2.field1146)) {
                        this.method80(var2.field1144, var2.field1140, var2.field1143, var2.field1146, var2.field1145, var2.field1142, var2.field1141, -319);
                        var2.method396();
                    }
                } else {
                    if (var2.field1147 > 0) {
                        --var2.field1147;
                    }
                    if (var2.field1147 == 0 && var2.field1142 >= 1 && var2.field1143 >= 1 && var2.field1142 <= 102 && var2.field1143 <= 102 && (var2.field1148 < 0 || class63.method500(-239, var2.field1148, var2.field1150))) {
                        this.method80(var2.field1148, var2.field1140, var2.field1143, var2.field1150, var2.field1149, var2.field1142, var2.field1141, -319);
                        var2.field1147 = -1;
                        if (var2.field1148 == var2.field1144 && var2.field1144 == -1) {
                            var2.method396();
                        } else if (var2.field1148 == var2.field1144 && var2.field1149 == var2.field1145 && var2.field1150 == var2.field1146) {
                            var2.method396();
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(JI)V")
    public final void method124(long arg0, int arg1) {
        if (arg0 != 0L) {
            if (this.field128 >= 100 && this.field134 != 1) {
                this.method26(0, "Your friendlist is full. Max of 100 for free users, and 200 for members", "", 0);
            } else if (this.field128 >= 200) {
                this.method26(0, "Your friendlist is full. Max of 100 for free users, and 200 for members", "", 0);
            } else {
                String var4 = class62.method490(false, class62.method487(arg0, (byte) 7));
                while (arg1 >= 0) {
                    this.field514 = this.field225.method3();
                }
                for (int var5 = 0; var5 < this.field128; ++var5) {
                    if (this.field403[var5] == arg0) {
                        this.method26(0, var4 + " is already on your friend list", "", 0);
                        return;
                    }
                }
                for (int var6 = 0; var6 < this.field429; ++var6) {
                    if (this.field303[var6] == arg0) {
                        this.method26(0, "Please remove " + var4 + " from your ignore list first", "", 0);
                        return;
                    }
                }
                if (!var4.equals(field313.field1193)) {
                    this.field177[this.field128] = var4;
                    this.field403[this.field128] = arg0;
                    this.field339[this.field128] = 0;
                    ++this.field128;
                    this.field354 = true;
                    this.field447.method523(238, 0);
                    this.field447.method530(155, arg0);
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "C", descriptor = "(I)V")
    public final void method125(int arg0) {
        if (this.field346 > 0) {
            this.method109(false);
        } else {
            this.field379.method588(823);
            this.field141.method466(144, "Connection lost", 0, 257, 5);
            this.field141.method466(143, "Connection lost", 16777215, 256, 5);
            this.field141.method466(159, "Please wait - attempting to reestablish", 0, 257, 5);
            this.field141.method466(158, "Please wait - attempting to reestablish", 16777215, 256, 5);
            this.field379.method589(4, super.field1519, 418, 4);
            this.field491 = 0;
            this.field316 = 0;
            class14 var2 = this.field209;
            if (arg0 < 0) {
                this.field452 = false;
                this.field413 = 0;
                this.method84(this.field300, this.field301, true);
                if (!this.field452) {
                    this.method109(false);
                }
                try {
                    var2.method192();
                } catch (Exception var3) {
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "p", descriptor = "(Z)V")
    public final void method126(boolean arg0) {
        int var2 = this.field461;
        int var3 = this.field462;
        int var4 = this.field463;
        int var5 = this.field464;
        this.field452 &= arg0;
        int var6 = 6116423;
        class22.method284(var2, var3, var6, var4, 47782, var5);
        class22.method284(var2 + 1, var3 + 1, 0, var4 - 2, 47782, 16);
        class22.method285(var5 - 19, 0, var2 + 1, var4 - 2, -1086, var3 + 18);
        this.field142.method470(var2 + 3, "Choose Option", var6, var3 + 14, 1);
        int var7 = super.field1527;
        int var8 = super.field1528;
        if (this.field460 == 0) {
            var7 -= 4;
            var8 -= 4;
        }
        if (this.field460 == 1) {
            var7 -= 553;
            var8 -= 205;
        }
        if (this.field460 == 2) {
            var7 -= 17;
            var8 -= 357;
        }
        for (int var9 = 0; var9 < this.field122; ++var9) {
            int var10 = (this.field122 - 1 - var9) * 15 + var3 + 31;
            int var11 = 16777215;
            if (var7 > var2 && var7 < var2 + var4 && var8 > var10 - 13 && var8 < var10 + 3) {
                var11 = 16776960;
            }
            this.field142.method474(var10, var11, this.field131[var9], true, var2 + 3, (byte) 3);
        }
    }

    @OriginalMember(owner = "client", name = "o", descriptor = "(B)V")
    public final void method127(byte arg0) {
        if (this.field509 != 0) {
            int var2 = 0;
            if (this.field385 != 0) {
                var2 = 1;
            }
            for (int var3 = 0; var3 < 100; ++var3) {
                if (this.field245[var3] != null) {
                    int var5 = this.field243[var3];
                    String var6 = this.field244[var3];
                    boolean var7 = false;
                    if (var6 != null && var6.startsWith("@cr1@")) {
                        var6 = var6.substring(5);
                        boolean var8 = true;
                    }
                    if (var6 != null && var6.startsWith("@cr2@")) {
                        var6 = var6.substring(5);
                        boolean var9 = true;
                    }
                    if ((var5 == 3 || var5 == 7) && (var5 == 7 || this.field410 == 0 || this.field410 == 1 && this.method68(46314, var6))) {
                        int var10 = 329 - var2 * 13;
                        if (super.field1527 > 4 && super.field1528 - 4 > var10 - 10 && super.field1528 - 4 <= var10 + 3) {
                            int var11 = this.field141.method468("From:  " + var6 + this.field245[var3], (byte) 12) + 25;
                            if (var11 > 450) {
                                var11 = 450;
                            }
                            if (super.field1527 < var11 + 4) {
                                if (this.field472 >= 1) {
                                    this.field131[this.field122] = "Report abuse @whi@" + var6;
                                    this.field286[this.field122] = 2038;
                                    ++this.field122;
                                }
                                this.field131[this.field122] = "Add ignore @whi@" + var6;
                                this.field286[this.field122] = 2376;
                                ++this.field122;
                                this.field131[this.field122] = "Add friend @whi@" + var6;
                                this.field286[this.field122] = 2554;
                                ++this.field122;
                            }
                        }
                        ++var2;
                        if (var2 >= 5) {
                            return;
                        }
                    }
                    if ((var5 == 5 || var5 == 6) && this.field410 < 2) {
                        ++var2;
                        if (var2 >= 5) {
                            return;
                        }
                    }
                }
            }
            if (arg0 == 8) {
                boolean var4 = false;
            } else {
                this.field124 = null;
            }
        }
    }

    @OriginalMember(owner = "client", name = "init", descriptor = "()V")
    public final void init() {
        field369 = Integer.parseInt(this.getParameter("nodeid"));
        field370 = Integer.parseInt(this.getParameter("portoff"));
        String var1 = this.getParameter("lowmem");
        if (var1 != null && var1.equals("1")) {
            method139(field365);
        } else {
            method86(false);
        }
        String var2 = this.getParameter("free");
        if (var2 != null && var2.equals("1")) {
            field371 = false;
        } else {
            field371 = true;
        }
        this.method482(503, 765, (byte) -23);
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(II)V")
    public final void method128(int arg0, int arg1) {
        if (arg0 >= 0) {
            if (this.field242 != 0) {
                this.field242 = 0;
                this.field498 = true;
            }
            int var3 = this.field284[arg0];
            int var4 = this.field285[arg0];
            int var5 = this.field286[arg0];
            int var6 = this.field287[arg0];
            if (var5 >= 2000) {
                var5 -= 2000;
            }
            if (var5 == 565) {
                this.field447.method523(129, 0);
                this.field447.method525(var4);
                class53 var7 = class53.field1309[var4];
                if (var7.field1328 != null && var7.field1328[0][0] == 5) {
                    int var8 = var7.field1328[0][1];
                    if (this.field584[var8] != var7.field1273[0]) {
                        this.field584[var8] = var7.field1273[0];
                        this.method155(var8, 7);
                        this.field354 = true;
                    }
                }
            }
            if (var5 == 246) {
                class18 var9 = this.field356[var6];
                if (var9 != null) {
                    this.method82(1, 0, 1, 2, 0, field313.field1696[0], var9.field1696[0], false, field313.field1697[0], var9.field1697[0], 0, 0);
                    this.field589 = super.field1534;
                    this.field590 = super.field1535;
                    this.field592 = 2;
                    this.field591 = 0;
                    this.field447.method523(39, 0);
                    this.field447.method525(var6);
                }
            }
            if (var5 == 450) {
                class18 var10 = this.field356[var6];
                if (var10 != null) {
                    this.method82(1, 0, 1, 2, 0, field313.field1696[0], var10.field1696[0], false, field313.field1697[0], var10.field1697[0], 0, 0);
                    this.field589 = super.field1534;
                    this.field590 = super.field1535;
                    this.field592 = 2;
                    this.field591 = 0;
                    this.field447.method523(185, 0);
                    this.field447.method525(this.field392);
                    this.field447.method557(this.field394, (byte) 60);
                    this.field447.method556(field426, var6);
                    this.field447.method557(this.field393, (byte) 60);
                }
            }
            if (var5 == 551 && !this.field398) {
                this.field447.method523(58, 0);
                this.field447.method525(var4);
                this.field398 = true;
            }
            if (var5 == 539) {
                class53 var11 = class53.field1309[var4];
                boolean var12 = true;
                if (var11.field1317 > 0) {
                    var12 = this.method48((byte) 67, var11);
                }
                if (var12) {
                    this.field447.method523(129, 0);
                    this.field447.method525(var4);
                }
            }
            if (var5 == 916) {
                class45 var13 = this.field230[var6];
                if (var13 != null) {
                    this.method82(1, 0, 1, 2, 0, field313.field1696[0], var13.field1696[0], false, field313.field1697[0], var13.field1697[0], 0, 0);
                    this.field589 = super.field1534;
                    this.field590 = super.field1535;
                    this.field592 = 2;
                    this.field591 = 0;
                    this.field447.method523(163, 0);
                    this.field447.method556(field426, var6);
                }
            }
            if (var5 == 1555) {
                this.method111(var6, var3, var4, 0);
                this.field447.method523(59, 0);
                this.field447.method557(var6 >> 14 & 32767, (byte) 60);
                this.field447.method556(field426, this.field220 + var3);
                this.field447.method558(this.field221 + var4, (byte) 7);
            }
            if (var5 == 111) {
                this.field447.method523(122, 0);
                this.field447.method556(field426, var4);
                this.field447.method557(var3, (byte) 60);
                this.field447.method558(var6, (byte) 7);
                this.field465 = 0;
                this.field466 = var4;
                this.field467 = var3;
                this.field468 = 2;
                if (class53.field1309[var4].field1298 == this.field279) {
                    this.field468 = 1;
                }
                if (class53.field1309[var4].field1298 == this.field254) {
                    this.field468 = 3;
                }
            }
            if (var5 == 1569) {
                class18 var14 = this.field356[var6];
                if (var14 != null) {
                    class37 var15 = var14.field722;
                    if (var15.field1082 != null) {
                        var15 = var15.method364(-670);
                    }
                    if (var15 != null) {
                        String var16;
                        if (var15.field1073 != null) {
                            var16 = new String(var15.field1073);
                        } else {
                            var16 = "It's a " + var15.field1109 + ".";
                        }
                        this.method26(0, var16, "", 0);
                    }
                }
            }
            if (var5 == 1070) {
                class5 var17 = class5.method13(var6);
                String var18;
                if (var17.field77 != null) {
                    var18 = new String(var17.field77);
                } else {
                    var18 = "It's a " + var17.field51 + ".";
                }
                this.method26(0, var18, "", 0);
            }
            if (var5 == 415) {
                class18 var19 = this.field356[var6];
                if (var19 != null) {
                    this.method82(1, 0, 1, 2, 0, field313.field1696[0], var19.field1696[0], false, field313.field1697[0], var19.field1697[0], 0, 0);
                    this.field589 = super.field1534;
                    this.field590 = super.field1535;
                    this.field592 = 2;
                    this.field591 = 0;
                    this.field447.method523(134, 0);
                    this.field447.method557(var6, (byte) 60);
                }
            }
            if (var5 == 11) {
                class18 var20 = this.field356[var6];
                if (var20 != null) {
                    this.method82(1, 0, 1, 2, 0, field313.field1696[0], var20.field1696[0], false, field313.field1697[0], var20.field1697[0], 0, 0);
                    this.field589 = super.field1534;
                    this.field590 = super.field1535;
                    this.field592 = 2;
                    this.field591 = 0;
                    this.field447.method523(119, 0);
                    this.field447.method556(field426, var6);
                }
            }
            if (var5 == 554 || var5 == 376 || var5 == 163 || var5 == 355) {
                String var21 = this.field131[arg0];
                int var22 = var21.indexOf("@whi@");
                if (var22 != -1) {
                    long var23 = class62.method486(var21.substring(var22 + 5).trim());
                    if (var5 == 554) {
                        this.method124(var23, -210);
                    }
                    if (var5 == 376) {
                        this.method37(true, var23);
                    }
                    if (var5 == 163) {
                        this.method54(var23, -26833);
                    }
                    if (var5 == 355) {
                        this.method53(var23, false);
                    }
                }
            }
            if (var5 == 31 && this.method111(var6, var3, var4, 0)) {
                this.field447.method523(149, 0);
                this.field447.method558(this.field394, (byte) 7);
                this.field447.method556(field426, this.field221 + var4);
                this.field447.method558(this.field220 + var3, (byte) 7);
                this.field447.method525(var6 >> 14 & 32767);
                this.field447.method556(field426, this.field393);
                this.field447.method525(this.field392);
            }
            if (var5 == 431) {
                class45 var25 = this.field230[var6];
                if (var25 != null) {
                    this.method82(1, 0, 1, 2, 0, field313.field1696[0], var25.field1696[0], false, field313.field1697[0], var25.field1697[0], 0, 0);
                    this.field589 = super.field1534;
                    this.field590 = super.field1535;
                    this.field592 = 2;
                    this.field591 = 0;
                    this.field447.method523(141, 0);
                    this.field447.method557(var6, (byte) 60);
                }
            }
            if (var5 == 948) {
                this.method111(var6, var3, var4, 0);
                this.field447.method523(130, 0);
                this.field447.method557(var6 >> 14 & 32767, (byte) 60);
                this.field447.method525(this.field220 + var3);
                this.field447.method558(this.field221 + var4, (byte) 7);
            }
            if (var5 == 543 || var5 == 219) {
                String var26 = this.field131[arg0];
                int var27 = var26.indexOf("@whi@");
                if (var27 != -1) {
                    String var28 = var26.substring(var27 + 5).trim();
                    String var29 = class62.method490(false, class62.method487(class62.method486(var28), (byte) 7));
                    boolean var30 = false;
                    for (int var31 = 0; var31 < this.field231; ++var31) {
                        class45 var32 = this.field230[this.field232[var31]];
                        if (var32 != null && var32.field1193 != null && var32.field1193.equalsIgnoreCase(var29)) {
                            this.method82(1, 0, 1, 2, 0, field313.field1696[0], var32.field1696[0], false, field313.field1697[0], var32.field1697[0], 0, 0);
                            if (var5 == 543) {
                                this.field447.method523(163, 0);
                                this.field447.method556(field426, this.field232[var31]);
                            }
                            if (var5 == 219) {
                                this.field447.method523(96, 0);
                                this.field447.method556(field426, this.field232[var31]);
                            }
                            var30 = true;
                            break;
                        }
                    }
                    if (!var30) {
                        this.method26(0, "Unable to find " + var29, "", 0);
                    }
                }
            }
            if (var5 == 941) {
                this.method111(var6, var3, var4, 0);
                this.field447.method523(243, 0);
                this.field447.method558(this.field220 + var3, (byte) 7);
                this.field447.method557(var6 >> 14 & 32767, (byte) 60);
                this.field447.method525(this.field221 + var4);
            }
            if (var5 == 173) {
                class18 var33 = this.field356[var6];
                if (var33 != null) {
                    this.method82(1, 0, 1, 2, 0, field313.field1696[0], var33.field1696[0], false, field313.field1697[0], var33.field1697[0], 0, 0);
                    this.field589 = super.field1534;
                    this.field590 = super.field1535;
                    this.field592 = 2;
                    this.field591 = 0;
                    this.field447.method523(200, 0);
                    this.field447.method525(var6);
                }
            }
            if (var5 == 308) {
                field214 += var3;
                if (field214 >= 51) {
                    this.field447.method523(18, 0);
                    this.field447.method524(70);
                    field214 = 0;
                }
                this.field447.method523(112, 0);
                this.field447.method558(var3, (byte) 7);
                this.field447.method556(field426, var6);
                this.field447.method525(var4);
                this.field465 = 0;
                this.field466 = var4;
                this.field467 = var3;
                this.field468 = 2;
                if (class53.field1309[var4].field1298 == this.field279) {
                    this.field468 = 1;
                }
                if (class53.field1309[var4].field1298 == this.field254) {
                    this.field468 = 3;
                }
            }
            if (var5 == 790) {
                boolean var34 = this.method82(0, 0, 0, 2, 0, field313.field1696[0], var3, false, field313.field1697[0], var4, 0, 0);
                if (!var34) {
                    this.method82(1, 0, 1, 2, 0, field313.field1696[0], var3, false, field313.field1697[0], var4, 0, 0);
                }
                this.field589 = super.field1534;
                this.field590 = super.field1535;
                this.field592 = 2;
                this.field591 = 0;
                if ((var3 & 3) == 0) {
                    ++field522;
                }
                if (field522 >= 79) {
                    this.field447.method523(92, 0);
                    this.field447.method524(134);
                    field522 = 0;
                }
                this.field447.method523(115, 0);
                this.field447.method556(field426, this.field220 + var3);
                this.field447.method525(this.field221 + var4);
                this.field447.method558(var6, (byte) 7);
            }
            if (var5 == 902) {
                class18 var36 = this.field356[var6];
                if (var36 != null) {
                    this.method82(1, 0, 1, 2, 0, field313.field1696[0], var36.field1696[0], false, field313.field1697[0], var36.field1697[0], 0, 0);
                    this.field589 = super.field1534;
                    this.field590 = super.field1535;
                    this.field592 = 2;
                    this.field591 = 0;
                    this.field447.method523(109, 0);
                    this.field447.method525(var6);
                    this.field447.method558(this.field519, (byte) 7);
                }
            }
            if (var5 == 162) {
                this.field447.method523(34, 0);
                this.field447.method556(field426, var4);
                this.field447.method558(var3, (byte) 7);
                this.field447.method558(this.field519, (byte) 7);
                this.field447.method557(var6, (byte) 60);
                this.field465 = 0;
                this.field466 = var4;
                this.field467 = var3;
                this.field468 = 2;
                if (class53.field1309[var4].field1298 == this.field279) {
                    this.field468 = 1;
                }
                if (class53.field1309[var4].field1298 == this.field254) {
                    this.field468 = 3;
                }
            }
            if (var5 == 410) {
                boolean var37 = this.method82(0, 0, 0, 2, 0, field313.field1696[0], var3, false, field313.field1697[0], var4, 0, 0);
                if (!var37) {
                    this.method82(1, 0, 1, 2, 0, field313.field1696[0], var3, false, field313.field1697[0], var4, 0, 0);
                }
                this.field589 = super.field1534;
                this.field590 = super.field1535;
                this.field592 = 2;
                this.field591 = 0;
                this.field447.method523(53, 0);
                this.field447.method525(this.field221 + var4);
                this.field447.method556(field426, var6);
                this.field447.method558(this.field220 + var3, (byte) 7);
            }
            if (var5 == 291) {
                class45 var39 = this.field230[var6];
                if (var39 != null) {
                    this.method82(1, 0, 1, 2, 0, field313.field1696[0], var39.field1696[0], false, field313.field1697[0], var39.field1697[0], 0, 0);
                    this.field589 = super.field1534;
                    this.field590 = super.field1535;
                    this.field592 = 2;
                    this.field591 = 0;
                    this.field447.method523(206, 0);
                    this.field447.method556(field426, this.field393);
                    this.field447.method558(this.field392, (byte) 7);
                    this.field447.method558(this.field394, (byte) 7);
                    this.field447.method525(var6);
                }
            }
            if (var5 == 579) {
                boolean var40 = this.method82(0, 0, 0, 2, 0, field313.field1696[0], var3, false, field313.field1697[0], var4, 0, 0);
                if (!var40) {
                    this.method82(1, 0, 1, 2, 0, field313.field1696[0], var3, false, field313.field1697[0], var4, 0, 0);
                }
                this.field589 = super.field1534;
                this.field590 = super.field1535;
                this.field592 = 2;
                this.field591 = 0;
                ++field159;
                if (field159 >= 96) {
                    this.field447.method523(217, 0);
                    this.field447.method524(77);
                    field159 = 0;
                }
                this.field447.method523(55, 0);
                this.field447.method558(this.field221 + var4, (byte) 7);
                this.field447.method556(field426, this.field220 + var3);
                this.field447.method556(field426, var6);
            }
            if (var5 == 1298) {
                class5 var42 = class5.method13(var6);
                class53 var43 = class53.field1309[var4];
                String var44;
                if (var43 != null && var43.field1289[var3] >= 100000) {
                    var44 = var43.field1289[var3] + " x " + var42.field51;
                } else if (var42.field77 != null) {
                    var44 = new String(var42.field77);
                } else {
                    var44 = "It's a " + var42.field51 + ".";
                }
                this.method26(0, var44, "", 0);
            }
            if (var5 == 558) {
                boolean var45 = this.method82(0, 0, 0, 2, 0, field313.field1696[0], var3, false, field313.field1697[0], var4, 0, 0);
                if (!var45) {
                    this.method82(1, 0, 1, 2, 0, field313.field1696[0], var3, false, field313.field1697[0], var4, 0, 0);
                }
                this.field589 = super.field1534;
                this.field590 = super.field1535;
                this.field592 = 2;
                this.field591 = 0;
                this.field447.method523(3, 0);
                this.field447.method556(field426, this.field519);
                this.field447.method556(field426, var6);
                this.field447.method557(this.field221 + var4, (byte) 60);
                this.field447.method557(this.field220 + var3, (byte) 60);
            }
            if (var5 == 129) {
                boolean var47 = this.method82(0, 0, 0, 2, 0, field313.field1696[0], var3, false, field313.field1697[0], var4, 0, 0);
                if (!var47) {
                    this.method82(1, 0, 1, 2, 0, field313.field1696[0], var3, false, field313.field1697[0], var4, 0, 0);
                }
                this.field589 = super.field1534;
                this.field590 = super.field1535;
                this.field592 = 2;
                this.field591 = 0;
                this.field447.method523(38, 0);
                this.field447.method557(this.field220 + var3, (byte) 60);
                this.field447.method557(var6, (byte) 60);
                this.field447.method557(this.field221 + var4, (byte) 60);
            }
            if (var5 == 67) {
                this.field447.method523(145, 0);
                this.field447.method556(field426, var6);
                this.field447.method557(var3, (byte) 60);
                this.field447.method558(var4, (byte) 7);
                this.field465 = 0;
                this.field466 = var4;
                this.field467 = var3;
                this.field468 = 2;
                if (class53.field1309[var4].field1298 == this.field279) {
                    this.field468 = 1;
                }
                if (class53.field1309[var4].field1298 == this.field254) {
                    this.field468 = 3;
                }
            }
            if (var5 == 746) {
                if (!this.field320) {
                    this.field227.method344(15, super.field1535 - 4, super.field1534 - 4);
                } else {
                    this.field227.method344(15, var4 - 4, var3 - 4);
                }
            }
            if (var5 == 6) {
                class53 var49 = class53.field1309[var4];
                this.field518 = 1;
                this.field519 = var4;
                this.field520 = var49.field1311;
                this.field391 = 0;
                this.field354 = true;
                String var50 = var49.field1278;
                if (var50.indexOf(" ") != -1) {
                    var50 = var50.substring(0, var50.indexOf(" "));
                }
                String var51 = var49.field1278;
                if (var51.indexOf(" ") != -1) {
                    var51 = var51.substring(var51.indexOf(" ") + 1);
                }
                this.field521 = var50 + " " + var49.field1315 + " " + var51;
                if (this.field520 == 16) {
                    this.field354 = true;
                    this.field256 = 3;
                    this.field577 = true;
                }
            } else {
                if (var5 == 38) {
                    String var52 = this.field131[arg0];
                    int var53 = var52.indexOf("@whi@");
                    if (var53 != -1) {
                        if (this.field279 == -1) {
                            this.method63(5);
                            this.field414 = var52.substring(var53 + 5).trim();
                            this.field200 = false;
                            for (int var54 = 0; var54 < class53.field1309.length; ++var54) {
                                if (class53.field1309[var54] != null && class53.field1309[var54].field1317 == 600) {
                                    this.field198 = this.field279 = class53.field1309[var54].field1298;
                                    break;
                                }
                            }
                        } else {
                            this.method26(0, "Please close the interface you have open before using 'report abuse'", "", 0);
                        }
                    }
                }
                if (var5 == 957) {
                    this.method111(var6, var3, var4, 0);
                    this.field447.method523(54, 0);
                    this.field447.method556(field426, this.field221 + var4);
                    this.field447.method556(field426, var6 >> 14 & 32767);
                    this.field447.method557(this.field220 + var3, (byte) 60);
                }
                if (var5 == 986) {
                    class45 var55 = this.field230[var6];
                    if (var55 != null) {
                        this.method82(1, 0, 1, 2, 0, field313.field1696[0], var55.field1696[0], false, field313.field1697[0], var55.field1697[0], 0, 0);
                        this.field589 = super.field1534;
                        this.field590 = super.field1535;
                        this.field592 = 2;
                        this.field591 = 0;
                        ++field314;
                        if (field314 >= 133) {
                            this.field447.method523(2, 0);
                            this.field447.method528(0);
                            field314 = 0;
                        }
                        this.field447.method523(114, 0);
                        this.field447.method525(var6);
                    }
                }
                if (var5 == 567) {
                    class18 var56 = this.field356[var6];
                    if (var56 != null) {
                        this.method82(1, 0, 1, 2, 0, field313.field1696[0], var56.field1696[0], false, field313.field1697[0], var56.field1697[0], 0, 0);
                        this.field589 = super.field1534;
                        this.field590 = super.field1535;
                        this.field592 = 2;
                        this.field591 = 0;
                        this.field447.method523(31, 0);
                        this.field447.method556(field426, var6);
                    }
                }
                if (var5 == 997) {
                    this.field447.method523(136, 0);
                    this.field447.method558(var3, (byte) 7);
                    this.field447.method557(var6, (byte) 60);
                    this.field447.method558(var4, (byte) 7);
                    this.field465 = 0;
                    this.field466 = var4;
                    this.field467 = var3;
                    this.field468 = 2;
                    if (class53.field1309[var4].field1298 == this.field279) {
                        this.field468 = 1;
                    }
                    if (class53.field1309[var4].field1298 == this.field254) {
                        this.field468 = 3;
                    }
                }
                if (var5 == 210) {
                    this.method63(5);
                }
                if (var5 == 132) {
                    class45 var57 = this.field230[var6];
                    if (var57 != null) {
                        this.method82(1, 0, 1, 2, 0, field313.field1696[0], var57.field1696[0], false, field313.field1697[0], var57.field1697[0], 0, 0);
                        this.field589 = super.field1534;
                        this.field590 = super.field1535;
                        this.field592 = 2;
                        this.field591 = 0;
                        this.field447.method523(48, 0);
                        this.field447.method525(var6);
                    }
                }
                if (var5 == 822) {
                    class45 var58 = this.field230[var6];
                    if (var58 != null) {
                        this.method82(1, 0, 1, 2, 0, field313.field1696[0], var58.field1696[0], false, field313.field1697[0], var58.field1697[0], 0, 0);
                        this.field589 = super.field1534;
                        this.field590 = super.field1535;
                        this.field592 = 2;
                        this.field591 = 0;
                        this.field447.method523(96, 0);
                        this.field447.method556(field426, var6);
                    }
                }
                if (var5 == 756) {
                    this.field391 = 1;
                    this.field392 = var3;
                    this.field393 = var4;
                    this.field394 = var6;
                    this.field395 = class5.method13(var6).field51;
                    this.field518 = 0;
                    this.field354 = true;
                } else {
                    if (var5 == 358) {
                        boolean var59 = this.method82(0, 0, 0, 2, 0, field313.field1696[0], var3, false, field313.field1697[0], var4, 0, 0);
                        if (!var59) {
                            this.method82(1, 0, 1, 2, 0, field313.field1696[0], var3, false, field313.field1697[0], var4, 0, 0);
                        }
                        this.field589 = super.field1534;
                        this.field590 = super.field1535;
                        this.field592 = 2;
                        this.field591 = 0;
                        this.field447.method523(102, 0);
                        this.field447.method525(this.field392);
                        this.field447.method557(this.field393, (byte) 60);
                        this.field447.method525(this.field394);
                        this.field447.method525(this.field221 + var4);
                        this.field447.method558(var6, (byte) 7);
                        this.field447.method558(this.field220 + var3, (byte) 7);
                    }
                    if (var5 == 922) {
                        boolean var61 = this.method82(0, 0, 0, 2, 0, field313.field1696[0], var3, false, field313.field1697[0], var4, 0, 0);
                        if (!var61) {
                            this.method82(1, 0, 1, 2, 0, field313.field1696[0], var3, false, field313.field1697[0], var4, 0, 0);
                        }
                        this.field589 = super.field1534;
                        this.field590 = super.field1535;
                        this.field592 = 2;
                        this.field591 = 0;
                        this.field447.method523(221, 0);
                        this.field447.method557(var6, (byte) 60);
                        this.field447.method525(this.field220 + var3);
                        this.field447.method557(this.field221 + var4, (byte) 60);
                    }
                    if (var5 == 186) {
                        this.field447.method523(32, 0);
                        this.field447.method557(var6, (byte) 60);
                        this.field447.method556(field426, var4);
                        this.field447.method525(var3);
                        this.field465 = 0;
                        this.field466 = var4;
                        this.field467 = var3;
                        this.field468 = 2;
                        if (class53.field1309[var4].field1298 == this.field279) {
                            this.field468 = 1;
                        }
                        if (class53.field1309[var4].field1298 == this.field254) {
                            this.field468 = 3;
                        }
                    }
                    if (var5 == 883) {
                        if ((var3 & 3) == 0) {
                            ++field375;
                        }
                        if (field375 >= 69) {
                            this.field447.method523(167, 0);
                            this.field447.method525(2525);
                            field375 = 0;
                        }
                        this.field447.method523(237, 0);
                        this.field447.method558(var6, (byte) 7);
                        this.field447.method556(field426, var3);
                        this.field447.method557(var4, (byte) 60);
                        this.field465 = 0;
                        this.field466 = var4;
                        this.field467 = var3;
                        this.field468 = 2;
                        if (class53.field1309[var4].field1298 == this.field279) {
                            this.field468 = 1;
                        }
                        if (class53.field1309[var4].field1298 == this.field254) {
                            this.field468 = 3;
                        }
                    }
                    if (var5 == 591 && this.method111(var6, var3, var4, 0)) {
                        this.field447.method523(127, 0);
                        this.field447.method556(field426, this.field519);
                        this.field447.method558(this.field221 + var4, (byte) 7);
                        this.field447.method557(this.field220 + var3, (byte) 60);
                        this.field447.method558(var6 >> 14 & 32767, (byte) 7);
                    }
                    if (var5 == 2) {
                        this.field447.method523(132, 0);
                        this.field447.method556(field426, var4);
                        this.field447.method556(field426, var6);
                        this.field447.method556(field426, var3);
                        this.field465 = 0;
                        this.field466 = var4;
                        this.field467 = var3;
                        this.field468 = 2;
                        if (class53.field1309[var4].field1298 == this.field279) {
                            this.field468 = 1;
                        }
                        if (class53.field1309[var4].field1298 == this.field254) {
                            this.field468 = 3;
                        }
                    }
                    if (var5 == 966) {
                        this.field447.method523(124, 0);
                        this.field447.method556(field426, var4);
                        this.field447.method556(field426, var3);
                        this.field447.method557(var6, (byte) 60);
                        this.field465 = 0;
                        this.field466 = var4;
                        this.field467 = var3;
                        this.field468 = 2;
                        if (class53.field1309[var4].field1298 == this.field279) {
                            this.field468 = 1;
                        }
                        if (class53.field1309[var4].field1298 == this.field254) {
                            this.field468 = 3;
                        }
                    }
                    if (var5 == 442) {
                        this.field447.method523(172, 0);
                        this.field447.method558(var3, (byte) 7);
                        this.field447.method557(var6, (byte) 60);
                        this.field447.method558(var4, (byte) 7);
                        this.field465 = 0;
                        this.field466 = var4;
                        this.field467 = var3;
                        this.field468 = 2;
                        if (class53.field1309[var4].field1298 == this.field279) {
                            this.field468 = 1;
                        }
                        if (class53.field1309[var4].field1298 == this.field254) {
                            this.field468 = 3;
                        }
                    }
                    if (var5 == 643) {
                        String var63 = this.field131[arg0];
                        int var64 = var63.indexOf("@whi@");
                        if (var64 != -1) {
                            long var65 = class62.method486(var63.substring(var64 + 5).trim());
                            int var67 = -1;
                            for (int var68 = 0; var68 < this.field128; ++var68) {
                                if (this.field403[var68] == var65) {
                                    var67 = var68;
                                    break;
                                }
                            }
                            if (var67 != -1 && this.field339[var67] > 0) {
                                this.field498 = true;
                                this.field242 = 0;
                                this.field268 = true;
                                this.field409 = "";
                                this.field425 = 3;
                                this.field321 = this.field403[var67];
                                this.field470 = "Enter message to send to " + this.field177[var67];
                            }
                        }
                    }
                    if (var5 == 373) {
                        this.field447.method523(214, 0);
                        this.field447.method557(var6, (byte) 60);
                        this.field447.method558(var4, (byte) 7);
                        this.field447.method558(var3, (byte) 7);
                        this.field447.method525(this.field394);
                        this.field447.method557(this.field393, (byte) 60);
                        this.field447.method558(this.field392, (byte) 7);
                        this.field465 = 0;
                        this.field466 = var4;
                        this.field467 = var3;
                        this.field468 = 2;
                        if (class53.field1309[var4].field1298 == this.field279) {
                            this.field468 = 1;
                        }
                        if (class53.field1309[var4].field1298 == this.field254) {
                            this.field468 = 3;
                        }
                    }
                    if (var5 == 1595) {
                        int var69 = var6 >> 14 & 32767;
                        class58 var70 = class58.method455(var69);
                        String var71;
                        if (var70.field1443 != null) {
                            var71 = new String(var70.field1443);
                        } else {
                            var71 = "It's a " + var70.field1437 + ".";
                        }
                        this.method26(0, var71, "", 0);
                    }
                    if (var5 == 947) {
                        this.method111(var6, var3, var4, 0);
                        this.field447.method523(125, 0);
                        this.field447.method525(this.field221 + var4);
                        this.field447.method525(this.field220 + var3);
                        this.field447.method525(var6 >> 14 & 32767);
                    }
                    if (var5 == 522) {
                        this.field447.method523(129, 0);
                        this.field447.method525(var4);
                        class53 var72 = class53.field1309[var4];
                        if (var72.field1328 != null && var72.field1328[0][0] == 5) {
                            int var73 = var72.field1328[0][1];
                            this.field584[var73] = 1 - this.field584[var73];
                            this.method155(var73, 7);
                            this.field354 = true;
                        }
                    }
                    if (var5 == 108) {
                        class45 var74 = this.field230[var6];
                        if (var74 != null) {
                            this.method82(1, 0, 1, 2, 0, field313.field1696[0], var74.field1696[0], false, field313.field1697[0], var74.field1697[0], 0, 0);
                            this.field589 = super.field1534;
                            this.field590 = super.field1535;
                            this.field592 = 2;
                            this.field591 = 0;
                            this.field447.method523(84, 0);
                            this.field447.method556(field426, var6);
                            this.field447.method558(this.field519, (byte) 7);
                        }
                    }
                    if (var5 == 99) {
                        if ((var6 & 3) == 0) {
                            ++field149;
                        }
                        if (field149 >= 117) {
                            this.field447.method523(108, 0);
                            this.field447.method524(206);
                            field149 = 0;
                        }
                        this.field447.method523(197, 0);
                        this.field447.method558(var3, (byte) 7);
                        this.field447.method558(var4, (byte) 7);
                        this.field447.method558(var6, (byte) 7);
                        this.field465 = 0;
                        this.field466 = var4;
                        this.field467 = var3;
                        this.field468 = 2;
                        if (class53.field1309[var4].field1298 == this.field279) {
                            this.field468 = 1;
                        }
                        if (class53.field1309[var4].field1298 == this.field254) {
                            this.field468 = 3;
                        }
                    }
                    this.field391 = 0;
                    this.field342 += arg1;
                    this.field518 = 0;
                    this.field354 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "p", descriptor = "(B)V")
    public final void method129(byte arg0) {
        ++this.field475;
        this.method135(6, true);
        this.method39(true, 260);
        this.method135(6, false);
        this.method39(false, 260);
        this.method98(89);
        this.method24(1);
        if (!this.field127) {
            int var2 = this.field204;
            if (this.field444 / 256 > var2) {
                var2 = this.field444 / 256;
            }
            if (this.field302[4] && this.field350[4] + 128 > var2) {
                var2 = this.field350[4] + 128;
            }
            int var3 = this.field543 + this.field205 & 2047;
            this.method134(var3, this.field263, var2 * 3 + 600, this.field203, this.method91(0, field313.field1722, this.field144, field313.field1721) - 50, var2, this.field264);
        }
        int var4;
        if (!this.field127) {
            var4 = this.method89(20823);
        } else {
            var4 = this.method90(9);
        }
        int var5 = this.field504;
        int var6 = this.field505;
        int var7 = this.field506;
        int var8 = this.field507;
        int var9 = this.field508;
        for (int var10 = 0; var10 < 5; ++var10) {
            if (this.field302[var10]) {
                int var12 = (int) (Math.random() * (double) (this.field510[var10] * 2 + 1) - (double) this.field510[var10] + Math.sin((double) this.field283[var10] / 100.0D * (double) this.field291[var10]) * (double) this.field350[var10]);
                if (var10 == 0) {
                    this.field504 += var12;
                }
                if (var10 == 1) {
                    this.field505 += var12;
                }
                if (var10 == 2) {
                    this.field506 += var12;
                }
                if (var10 == 3) {
                    this.field508 = this.field508 + var12 & 2047;
                }
                if (var10 == 4) {
                    this.field507 += var12;
                    if (this.field507 < 128) {
                        this.field507 = 128;
                    }
                    if (this.field507 > 383) {
                        this.field507 = 383;
                    }
                }
            }
        }
        int var11 = class12.field650;
        class19.field791 = true;
        class19.field794 = 0;
        class19.field792 = super.field1527 - 4;
        class19.field793 = super.field1528 - 4;
        class22.method282(this.field189);
        this.field227.method345(this.field445, var4, this.field505, this.field504, this.field508, this.field506, this.field507);
        this.field227.method320(false);
        this.method21(121);
        if (arg0 != -102) {
            this.method46();
        }
        this.method56((byte) -18);
        this.method160(var11, 27188);
        this.method79(2);
        this.field379.method589(4, super.field1519, 418, 4);
        this.field504 = var5;
        this.field505 = var6;
        this.field506 = var7;
        this.field507 = var8;
        this.field508 = var9;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IILYGMSKJOQ;I)V")
    public final void method130(int arg0, int arg1, class69 arg2, int arg3) {
        int var5 = this.field205 + this.field147 & 2047;
        int var6 = arg0 * arg0 + arg1 * arg1;
        if (var6 <= 6400) {
            int var7 = class19.field796[var5];
            int var8 = class19.field797[var5];
            int var9 = var7 * 256 / (this.field328 + 256);
            if (arg3 >= 0) {
                field365 = -164;
            }
            int var10 = var8 * 256 / (this.field328 + 256);
            int var11 = arg0 * var9 + arg1 * var10 >> 16;
            int var12 = arg0 * var10 - arg1 * var9 >> 16;
            if (var6 > 2500) {
                arg2.method582(this.field575, 83 - var12 - arg2.field1668 / 2 - 4, var11 + 94 - arg2.field1667 / 2 + 4, -31972);
            } else {
                arg2.method576(83 - var12 - arg2.field1668 / 2 - 4, var11 + 94 - arg2.field1667 / 2 + 4, (byte) 35);
            }
        }
    }

    @OriginalMember(owner = "client", name = "q", descriptor = "(Z)V")
    public final void method131(boolean arg0) {
        if (arg0) {
            this.field219 = -343;
        }
        for (int var2 = -1; var2 < this.field231; ++var2) {
            int var6;
            if (var2 == -1) {
                var6 = this.field229;
            } else {
                var6 = this.field232[var2];
            }
            class45 var7 = this.field230[var6];
            if (var7 != null && var7.field1690 > 0) {
                --var7.field1690;
                if (var7.field1690 == 0) {
                    var7.field1709 = null;
                }
            }
        }
        for (int var3 = 0; var3 < this.field357; ++var3) {
            int var4 = this.field358[var3];
            class18 var5 = this.field356[var4];
            if (var5 != null && var5.field1690 > 0) {
                --var5.field1690;
                if (var5.field1690 == 0) {
                    var5.field1709 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "r", descriptor = "(Z)V")
    public final void method132(boolean arg0) {
        if (this.field325 == 0) {
            this.field131[0] = "Cancel";
            this.field286[0] = 1640;
            this.field122 = 1;
            this.method127((byte) 8);
            this.field136 = 0;
            if (super.field1527 > 4 && super.field1528 > 4 && super.field1527 < 516 && super.field1528 < 338) {
                if (this.field279 != -1) {
                    this.method44(class53.field1309[this.field279], this.field374, super.field1527, 0, super.field1528, 4, 4);
                } else {
                    this.method118(-297);
                }
            }
            if (this.field185 != this.field136) {
                this.field185 = this.field136;
            }
            this.field136 = 0;
            this.field452 &= arg0;
            if (super.field1527 > 553 && super.field1528 > 205 && super.field1527 < 743 && super.field1528 < 466) {
                if (this.field152 != -1) {
                    this.method44(class53.field1309[this.field152], this.field374, super.field1527, 0, super.field1528, 553, 205);
                } else if (this.field150[this.field256] != -1) {
                    this.method44(class53.field1309[this.field150[this.field256]], this.field374, super.field1527, 0, super.field1528, 553, 205);
                }
            }
            if (this.field191 != this.field136) {
                this.field354 = true;
                this.field191 = this.field136;
            }
            this.field136 = 0;
            if (super.field1527 > 17 && super.field1528 > 357 && super.field1527 < 496 && super.field1528 < 453) {
                if (this.field254 != -1) {
                    this.method44(class53.field1309[this.field254], this.field374, super.field1527, 0, super.field1528, 17, 357);
                } else if (super.field1528 < 434 && super.field1527 < 426) {
                    this.method113(super.field1527 - 17, super.field1528 - 357, -433);
                }
            }
            if (this.field254 != -1 && this.field309 != this.field136) {
                this.field498 = true;
                this.field309 = this.field136;
            }
            boolean var2 = false;
            while (!var2) {
                var2 = true;
                for (int var3 = 0; var3 < this.field122 - 1; ++var3) {
                    if (this.field286[var3] < 1000 && this.field286[var3 + 1] > 1000) {
                        String var4 = this.field131[var3];
                        this.field131[var3] = this.field131[var3 + 1];
                        this.field131[var3 + 1] = var4;
                        int var5 = this.field286[var3];
                        this.field286[var3] = this.field286[var3 + 1];
                        this.field286[var3 + 1] = var5;
                        int var6 = this.field284[var3];
                        this.field284[var3] = this.field284[var3 + 1];
                        this.field284[var3 + 1] = var6;
                        int var7 = this.field285[var3];
                        this.field285[var3] = this.field285[var3 + 1];
                        this.field285[var3 + 1] = var7;
                        int var8 = this.field287[var3];
                        this.field287[var3] = this.field287[var3 + 1];
                        this.field287[var3 + 1] = var8;
                        var2 = false;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(ZI)V")
    public final void method133(boolean arg0, int arg1) {
        class53 var3 = class53.field1309[arg1];
        for (int var4 = 0; var4 < var3.field1302.length && var3.field1302[var4] != -1; ++var4) {
            class53 var5 = class53.field1309[var3.field1302[var4]];
            if (var5.field1330 == 1) {
                this.method133(true, var5.field1319);
            }
            var5.field1326 = 0;
            var5.field1301 = 0;
        }
        if (!arg0) {
            this.field545 = 97;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIIII)V")
    public final void method134(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = 2048 - arg5 & 2047;
        int var9 = 2048 - arg0 & 2047;
        int var10 = 0;
        int var11 = 0;
        int var12 = arg2;
        while (arg3 >= 0) {
            this.field124 = null;
        }
        if (var8 != 0) {
            int var13 = class19.field796[var8];
            int var14 = class19.field797[var8];
            int var15 = var11 * var14 - arg2 * var13 >> 16;
            var12 = var11 * var13 + arg2 * var14 >> 16;
            var11 = var15;
        }
        if (var9 != 0) {
            int var16 = class19.field796[var9];
            int var17 = class19.field797[var9];
            int var18 = var10 * var17 + var12 * var16 >> 16;
            var12 = var12 * var17 - var10 * var16 >> 16;
            var10 = var18;
        }
        this.field504 = arg1 - var10;
        this.field505 = arg4 - var11;
        this.field506 = arg6 - var12;
        this.field507 = arg5;
        this.field508 = arg0;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IZ)V")
    public final void method135(int arg0, boolean arg1) {
        if (field313.field1721 >> 7 == this.field316 && field313.field1722 >> 7 == this.field317) {
            this.field316 = 0;
        }
        int var3 = this.field231;
        if (arg1) {
            var3 = 1;
        }
        for (int var4 = 0; var4 < var3; ++var4) {
            class45 var5;
            int var6;
            if (arg1) {
                var5 = field313;
                var6 = this.field229 << 14;
            } else {
                var5 = this.field230[this.field232[var4]];
                var6 = this.field232[var4] << 14;
            }
            if (var5 != null && var5.method245(6)) {
                var5.field1187 = false;
                if ((field372 && this.field231 > 50 || this.field231 > 200) && !arg1 && var5.field1692 == var5.field1678) {
                    var5.field1187 = true;
                }
                int var7 = var5.field1721 >> 7;
                int var8 = var5.field1722 >> 7;
                if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                    if (var5.field1181 != null && field421 >= var5.field1176 && field421 < var5.field1177) {
                        var5.field1187 = false;
                        var5.field1202 = this.method91(0, var5.field1722, this.field144, var5.field1721);
                        this.field227.method318(0, var5.field1202, var5.field1199, var5.field1200, var5.field1721, var6, var5, var5.field1723, var5.field1722, this.field144, var5.field1197, var5.field1198, 60);
                    } else {
                        if ((var5.field1721 & 127) == 64 && (var5.field1722 & 127) == 64) {
                            if (this.field175[var7][var8] == this.field475) {
                                continue;
                            }
                            this.field175[var7][var8] = this.field475;
                        }
                        var5.field1202 = this.method91(0, var5.field1722, this.field144, var5.field1721);
                        this.field227.method317(var5.field1723, this.field144, var5.field1721, 0, var5.field1722, 60, var5.field1202, var6, var5, var5.field1703);
                    }
                }
            }
        }
        if (arg0 != 6) {
            this.field447.method524(10);
        }
    }

    @OriginalMember(owner = "client", name = "s", descriptor = "(Z)V")
    public final void method136(boolean arg0) {
        this.field377.method588(823);
        class12.field641 = this.field173;
        this.field452 &= arg0;
        this.field574.method166(0, 0, (byte) 35);
        if (this.field152 != -1) {
            this.method158(class53.field1309[this.field152], 0, 0, 0, (byte) 7);
        } else if (this.field150[this.field256] != -1) {
            this.method158(class53.field1309[this.field150[this.field256]], 0, 0, 0, (byte) 7);
        }
        if (this.field320 && this.field460 == 1) {
            this.method126(true);
        }
        this.field377.method589(205, super.field1519, 418, 553);
        this.field379.method588(823);
        class12.field641 = this.field174;
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(Ljava/lang/String;)Ljava/io/DataInputStream;")
    public final DataInputStream method137(String arg0) throws IOException {
        if (!this.field450) {
            return signlink.mainapp != null ? signlink.openurl(arg0) : new DataInputStream((new URL(this.getCodeBase(), arg0)).openStream());
        } else {
            if (this.field554 != null) {
                try {
                    this.field554.close();
                } catch (Exception var4) {
                }
                this.field554 = null;
            }
            this.field554 = this.method85(43595);
            this.field554.setSoTimeout(10000);
            InputStream var2 = this.field554.getInputStream();
            OutputStream var3 = this.field554.getOutputStream();
            var3.write(("JAGGRAB /" + arg0 + "\n\n").getBytes());
            return new DataInputStream(var2);
        }
    }

    @OriginalMember(owner = "client", name = "D", descriptor = "(I)Z")
    public final boolean method138(int arg0) {
        if (arg0 != 0) {
            throw new NullPointerException();
        } else {
            return signlink.wavereplay();
        }
    }

    @OriginalMember(owner = "client", name = "E", descriptor = "(I)V")
    public static final void method139(int arg0) {
        int var1 = 38 / arg0;
        class28.field928 = true;
        class12.field630 = true;
        field372 = true;
        class63.field1576 = true;
        class58.field1460 = true;
    }

    @OriginalMember(owner = "client", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        return signlink.mainapp != null ? signlink.mainapp.getAppletContext() : super.getAppletContext();
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZZI)V")
    public final void method140(boolean arg0, boolean arg1, int arg2) {
        signlink.midivol = arg2;
        this.field452 &= arg1;
        if (arg0) {
            signlink.midi = "voladjust";
        }
    }

    @OriginalMember(owner = "client", name = "F", descriptor = "(I)V")
    public final void method141(int arg0) {
        for (int var2 = 0; var2 < this.field357; ++var2) {
            int var3 = this.field358[var2];
            class18 var4 = this.field356[var3];
            if (var4 != null) {
                this.method142(var4, var4.field722.field1090, this.field511);
            }
        }
        if (arg0 < 2 || arg0 > 2) {
            this.field343 = -1;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LYHEHTOVP;IB)V")
    public final void method142(class70 arg0, int arg1, byte arg2) {
        if (arg0.field1721 < 128 || arg0.field1722 < 128 || arg0.field1721 >= 13184 || arg0.field1722 >= 13184) {
            arg0.field1698 = -1;
            arg0.field1673 = -1;
            arg0.field1686 = 0;
            arg0.field1687 = 0;
            arg0.field1721 = arg0.field1696[0] * 128 + arg0.field1712 * 64;
            arg0.field1722 = arg0.field1697[0] * 128 + arg0.field1712 * 64;
            arg0.method587(4);
        }
        if (field313 == arg0 && (arg0.field1721 < 1536 || arg0.field1722 < 1536 || arg0.field1721 >= 11776 || arg0.field1722 >= 11776)) {
            arg0.field1698 = -1;
            arg0.field1673 = -1;
            arg0.field1686 = 0;
            arg0.field1687 = 0;
            arg0.field1721 = arg0.field1696[0] * 128 + arg0.field1712 * 64;
            arg0.field1722 = arg0.field1697[0] * 128 + arg0.field1712 * 64;
            arg0.method587(4);
        }
        if (arg0.field1686 > field421) {
            this.method143(arg0, (byte) -107);
        } else if (arg0.field1687 >= field421) {
            this.method144(arg0, 357);
        } else {
            this.method145(0, arg0);
        }
        this.method146(arg0, -43162);
        this.method147(-700, arg0);
        if (arg2 != 32) {
            this.field124 = null;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LYHEHTOVP;B)V")
    public final void method143(class70 arg0, byte arg1) {
        int var3 = arg0.field1686 - field421;
        int var4 = arg0.field1712 * 64 + arg0.field1682 * 128;
        int var5 = arg0.field1712 * 64 + arg0.field1684 * 128;
        arg0.field1721 += (var4 - arg0.field1721) / var3;
        if (this.field168 != arg1) {
            this.field449 = !this.field449;
        }
        arg0.field1722 += (var5 - arg0.field1722) / var3;
        arg0.field1706 = 0;
        if (arg0.field1688 == 0) {
            arg0.field1695 = 1024;
        }
        if (arg0.field1688 == 1) {
            arg0.field1695 = 1536;
        }
        if (arg0.field1688 == 2) {
            arg0.field1695 = 0;
        }
        if (arg0.field1688 == 3) {
            arg0.field1695 = 512;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LYHEHTOVP;I)V")
    public final void method144(class70 arg0, int arg1) {
        if (field421 == arg0.field1687 || arg0.field1698 == -1 || arg0.field1701 != 0 || arg0.field1700 + 1 > class21.field817[arg0.field1698].method277((byte) 110, arg0.field1699)) {
            int var3 = arg0.field1687 - arg0.field1686;
            int var4 = field421 - arg0.field1686;
            int var5 = arg0.field1712 * 64 + arg0.field1682 * 128;
            int var6 = arg0.field1712 * 64 + arg0.field1684 * 128;
            int var7 = arg0.field1712 * 64 + arg0.field1683 * 128;
            int var8 = arg0.field1712 * 64 + arg0.field1685 * 128;
            arg0.field1721 = ((var3 - var4) * var5 + var4 * var7) / var3;
            arg0.field1722 = ((var3 - var4) * var6 + var4 * var8) / var3;
        }
        arg0.field1706 = 0;
        if (arg0.field1688 == 0) {
            arg0.field1695 = 1024;
        }
        if (arg0.field1688 == 1) {
            arg0.field1695 = 1536;
        }
        if (arg0.field1688 == 2) {
            arg0.field1695 = 0;
        }
        if (arg0.field1688 == 3) {
            arg0.field1695 = 512;
        }
        arg0.field1723 = arg0.field1695;
        if (arg1 <= 0) {
            this.field456 = this.field225.method3();
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILYHEHTOVP;)V")
    public final void method145(int arg0, class70 arg1) {
        arg1.field1692 = arg1.field1678;
        if (arg1.field1704 == 0) {
            arg1.field1706 = 0;
        } else {
            if (arg1.field1698 != -1 && arg1.field1701 == 0) {
                class21 var3 = class21.field817[arg1.field1698];
                if (arg1.field1724 > 0 && var3.field829 == 0) {
                    ++arg1.field1706;
                    return;
                }
                if (arg1.field1724 <= 0 && var3.field830 == 0) {
                    ++arg1.field1706;
                    return;
                }
            }
            int var4 = arg1.field1721;
            int var5 = arg1.field1722;
            int var6 = arg1.field1696[arg1.field1704 - 1] * 128 + arg1.field1712 * 64;
            int var7 = arg1.field1697[arg1.field1704 - 1] * 128 + arg1.field1712 * 64;
            if (arg0 != 0) {
                this.field343 = this.field556.method534();
            }
            if (var6 - var4 <= 256 && var6 - var4 >= -256 && var7 - var5 <= 256 && var7 - var5 >= -256) {
                if (var4 < var6) {
                    if (var5 < var7) {
                        arg1.field1695 = 1280;
                    } else if (var5 > var7) {
                        arg1.field1695 = 1792;
                    } else {
                        arg1.field1695 = 1536;
                    }
                } else if (var4 > var6) {
                    if (var5 < var7) {
                        arg1.field1695 = 768;
                    } else if (var5 > var7) {
                        arg1.field1695 = 256;
                    } else {
                        arg1.field1695 = 512;
                    }
                } else if (var5 < var7) {
                    arg1.field1695 = 1024;
                } else {
                    arg1.field1695 = 0;
                }
                int var8 = arg1.field1695 - arg1.field1723 & 2047;
                if (var8 > 1024) {
                    var8 -= 2048;
                }
                int var9 = arg1.field1714;
                if (var8 >= -256 && var8 <= 256) {
                    var9 = arg1.field1713;
                } else if (var8 >= 256 && var8 < 768) {
                    var9 = arg1.field1716;
                } else if (var8 >= -768 && var8 <= -256) {
                    var9 = arg1.field1715;
                }
                if (var9 == -1) {
                    var9 = arg1.field1713;
                }
                arg1.field1692 = var9;
                int var10 = 4;
                if (arg1.field1723 != arg1.field1695 && arg1.field1708 == -1 && arg1.field1705 != 0) {
                    var10 = 2;
                }
                if (arg1.field1704 > 2) {
                    var10 = 6;
                }
                if (arg1.field1704 > 3) {
                    var10 = 8;
                }
                if (arg1.field1706 > 0 && arg1.field1704 > 1) {
                    var10 = 8;
                    --arg1.field1706;
                }
                if (arg1.field1725[arg1.field1704 - 1]) {
                    var10 <<= 1;
                }
                if (var10 >= 8 && arg1.field1713 == arg1.field1692 && arg1.field1672 != -1) {
                    arg1.field1692 = arg1.field1672;
                }
                if (var4 < var6) {
                    arg1.field1721 += var10;
                    if (arg1.field1721 > var6) {
                        arg1.field1721 = var6;
                    }
                } else if (var4 > var6) {
                    arg1.field1721 -= var10;
                    if (arg1.field1721 < var6) {
                        arg1.field1721 = var6;
                    }
                }
                if (var5 < var7) {
                    arg1.field1722 += var10;
                    if (arg1.field1722 > var7) {
                        arg1.field1722 = var7;
                    }
                } else if (var5 > var7) {
                    arg1.field1722 -= var10;
                    if (arg1.field1722 < var7) {
                        arg1.field1722 = var7;
                    }
                }
                if (arg1.field1721 == var6 && arg1.field1722 == var7) {
                    --arg1.field1704;
                    if (arg1.field1724 > 0) {
                        --arg1.field1724;
                        return;
                    }
                }
            } else {
                arg1.field1721 = var6;
                arg1.field1722 = var7;
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(LYHEHTOVP;I)V")
    public final void method146(class70 arg0, int arg1) {
        if (arg1 != -43162) {
            this.field343 = -1;
        }
        if (arg0.field1705 != 0) {
            if (arg0.field1708 != -1 && arg0.field1708 < 32768) {
                class18 var3 = this.field356[arg0.field1708];
                if (var3 != null) {
                    int var4 = arg0.field1721 - var3.field1721;
                    int var5 = arg0.field1722 - var3.field1722;
                    if (var4 != 0 || var5 != 0) {
                        arg0.field1695 = (int) (Math.atan2((double) var4, (double) var5) * 325.949D) & 2047;
                    }
                }
            }
            if (arg0.field1708 >= 32768) {
                int var6 = arg0.field1708 - 32768;
                if (this.field401 == var6) {
                    var6 = this.field229;
                }
                class45 var7 = this.field230[var6];
                if (var7 != null) {
                    int var8 = arg0.field1721 - var7.field1721;
                    int var9 = arg0.field1722 - var7.field1722;
                    if (var8 != 0 || var9 != 0) {
                        arg0.field1695 = (int) (Math.atan2((double) var8, (double) var9) * 325.949D) & 2047;
                    }
                }
            }
            if ((arg0.field1710 != 0 || arg0.field1711 != 0) && (arg0.field1704 == 0 || arg0.field1706 > 0)) {
                int var10 = arg0.field1721 - (arg0.field1710 - this.field220 - this.field220) * 64;
                int var11 = arg0.field1722 - (arg0.field1711 - this.field221 - this.field221) * 64;
                if (var10 != 0 || var11 != 0) {
                    arg0.field1695 = (int) (Math.atan2((double) var10, (double) var11) * 325.949D) & 2047;
                }
                arg0.field1710 = 0;
                arg0.field1711 = 0;
            }
            int var12 = arg0.field1695 - arg0.field1723 & 2047;
            if (var12 != 0) {
                if (var12 >= arg0.field1705 && var12 <= 2048 - arg0.field1705) {
                    if (var12 > 1024) {
                        arg0.field1723 -= arg0.field1705;
                    } else {
                        arg0.field1723 += arg0.field1705;
                    }
                } else {
                    arg0.field1723 = arg0.field1695;
                }
                arg0.field1723 &= 2047;
                if (arg0.field1692 == arg0.field1678 && arg0.field1723 != arg0.field1695) {
                    if (arg0.field1679 != -1) {
                        arg0.field1692 = arg0.field1679;
                        return;
                    }
                    arg0.field1692 = arg0.field1713;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(ILYHEHTOVP;)V")
    public final void method147(int arg0, class70 arg1) {
        while (arg0 >= 0) {
            this.field343 = this.field556.method534();
        }
        arg1.field1703 = false;
        if (arg1.field1692 != -1) {
            class21 var3 = class21.field817[arg1.field1692];
            ++arg1.field1694;
            if (arg1.field1693 < var3.field818 && arg1.field1694 > var3.method277((byte) 110, arg1.field1693)) {
                arg1.field1694 = 0;
                ++arg1.field1693;
            }
            if (arg1.field1693 >= var3.field818) {
                arg1.field1694 = 0;
                arg1.field1693 = 0;
            }
        }
        if (arg1.field1673 != -1 && field421 >= arg1.field1676) {
            if (arg1.field1674 < 0) {
                arg1.field1674 = 0;
            }
            class21 var4 = class66.field1605[arg1.field1673].field1609;
            ++arg1.field1675;
            while (arg1.field1674 < var4.field818 && arg1.field1675 > var4.method277((byte) 110, arg1.field1674)) {
                arg1.field1675 -= var4.method277((byte) 110, arg1.field1674);
                ++arg1.field1674;
            }
            if (arg1.field1674 >= var4.field818 && (arg1.field1674 < 0 || arg1.field1674 >= var4.field818)) {
                arg1.field1673 = -1;
            }
        }
        if (arg1.field1698 != -1 && arg1.field1701 <= 1) {
            class21 var5 = class21.field817[arg1.field1698];
            if (var5.field829 == 1 && arg1.field1724 > 0 && arg1.field1686 <= field421 && arg1.field1687 < field421) {
                arg1.field1701 = 1;
                return;
            }
        }
        if (arg1.field1698 != -1 && arg1.field1701 == 0) {
            class21 var6 = class21.field817[arg1.field1698];
            ++arg1.field1700;
            while (arg1.field1699 < var6.field818 && arg1.field1700 > var6.method277((byte) 110, arg1.field1699)) {
                arg1.field1700 -= var6.method277((byte) 110, arg1.field1699);
                ++arg1.field1699;
            }
            if (arg1.field1699 >= var6.field818) {
                arg1.field1699 -= var6.field822;
                ++arg1.field1702;
                if (arg1.field1702 >= var6.field828) {
                    arg1.field1698 = -1;
                }
                if (arg1.field1699 < 0 || arg1.field1699 >= var6.field818) {
                    arg1.field1698 = -1;
                }
            }
            arg1.field1703 = var6.field824;
        }
        if (arg1.field1701 > 0) {
            --arg1.field1701;
        }
    }

    @OriginalMember(owner = "client", name = "q", descriptor = "(B)V")
    public final void method148(byte arg0) {
        if (this.field420) {
            this.field420 = false;
            this.field528.method589(4, super.field1519, 418, 0);
            this.field529.method589(357, super.field1519, 418, 0);
            this.field530.method589(4, super.field1519, 418, 722);
            this.field531.method589(205, super.field1519, 418, 743);
            this.field532.method589(0, super.field1519, 418, 0);
            this.field533.method589(4, super.field1519, 418, 516);
            this.field534.method589(205, super.field1519, 418, 516);
            this.field535.method589(357, super.field1519, 418, 496);
            this.field536.method589(338, super.field1519, 418, 0);
            this.field354 = true;
            this.field498 = true;
            this.field577 = true;
            this.field169 = true;
            if (this.field218 != 2) {
                this.field379.method589(4, super.field1519, 418, 4);
                this.field378.method589(4, super.field1519, 418, 550);
            }
        }
        if (this.field218 == 2) {
            this.method129((byte) -102);
        }
        if (this.field320 && this.field460 == 1) {
            this.field354 = true;
        }
        if (this.field152 != -1) {
            boolean var2 = this.method57(this.field152, -217, this.field304);
            if (var2) {
                this.field354 = true;
            }
        }
        if (this.field468 == 2) {
            this.field354 = true;
        }
        if (this.field325 == 2) {
            this.field354 = true;
        }
        if (this.field354) {
            this.method136(true);
            this.field354 = false;
        }
        if (this.field254 == -1) {
            this.field524.field1287 = this.field553 - this.field130 - 77;
            if (super.field1527 > 448 && super.field1527 < 560 && super.field1528 > 332) {
                this.method29(this.field524, 463, false, 0, false, super.field1528 - 357, 77, this.field553, super.field1527 - 17);
            }
            int var3 = this.field553 - 77 - this.field524.field1287;
            if (var3 < 0) {
                var3 = 0;
            }
            if (var3 > this.field553 - 77) {
                var3 = this.field553 - 77;
            }
            if (this.field130 != var3) {
                this.field130 = var3;
                this.field498 = true;
            }
            ++field211;
            if (field211 > 1297) {
                field211 = 0;
                this.field447.method523(116, 0);
                this.field447.method524(0);
                int var4 = this.field447.field1643;
                this.field447.method524(174);
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field447.method524(213);
                }
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field447.method525(35720);
                }
                this.field447.method525((int) (Math.random() * 65536.0D));
                this.field447.method525((int) (Math.random() * 65536.0D));
                this.field447.method524((int) (Math.random() * 256.0D));
                this.field447.method525(47094);
                this.field447.method524(200);
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field447.method524(242);
                }
                this.field447.method525(13108);
                this.field447.method533(737, this.field447.field1643 - var4);
            }
        }
        if (this.field254 != -1) {
            boolean var5 = this.method57(this.field254, -217, this.field304);
            if (var5) {
                this.field498 = true;
            }
        }
        if (this.field468 == 3) {
            this.field498 = true;
        }
        if (this.field325 == 3) {
            this.field498 = true;
        }
        if (this.field585 != null) {
            this.field498 = true;
        }
        if (this.field320 && this.field460 == 2) {
            this.field498 = true;
        }
        if (this.field498) {
            this.method47(false);
            this.field498 = false;
        }
        if (this.field218 == 2) {
            this.method41(true);
            this.field378.method589(4, super.field1519, 418, 550);
        }
        if (this.field126 != -1) {
            this.field577 = true;
        }
        if (this.field577) {
            if (this.field126 != -1 && this.field256 == this.field126) {
                this.field126 = -1;
                this.field447.method523(199, 0);
                this.field447.method524(this.field256);
            }
            this.field577 = false;
            this.field181.method588(823);
            this.field478.method166(0, 0, (byte) 35);
            if (this.field152 == -1) {
                if (this.field150[this.field256] != -1) {
                    if (this.field256 == 0) {
                        this.field237.method166(10, 22, (byte) 35);
                    }
                    if (this.field256 == 1) {
                        this.field238.method166(8, 54, (byte) 35);
                    }
                    if (this.field256 == 2) {
                        this.field238.method166(8, 82, (byte) 35);
                    }
                    if (this.field256 == 3) {
                        this.field239.method166(8, 110, (byte) 35);
                    }
                    if (this.field256 == 4) {
                        this.field241.method166(8, 153, (byte) 35);
                    }
                    if (this.field256 == 5) {
                        this.field241.method166(8, 181, (byte) 35);
                    }
                    if (this.field256 == 6) {
                        this.field240.method166(9, 209, (byte) 35);
                    }
                }
                if (this.field150[0] != -1 && (this.field126 != 0 || field421 % 20 < 10)) {
                    this.field523[0].method166(13, 29, (byte) 35);
                }
                if (this.field150[1] != -1 && (this.field126 != 1 || field421 % 20 < 10)) {
                    this.field523[1].method166(11, 53, (byte) 35);
                }
                if (this.field150[2] != -1 && (this.field126 != 2 || field421 % 20 < 10)) {
                    this.field523[2].method166(11, 82, (byte) 35);
                }
                if (this.field150[3] != -1 && (this.field126 != 3 || field421 % 20 < 10)) {
                    this.field523[3].method166(12, 115, (byte) 35);
                }
                if (this.field150[4] != -1 && (this.field126 != 4 || field421 % 20 < 10)) {
                    this.field523[4].method166(13, 153, (byte) 35);
                }
                if (this.field150[5] != -1 && (this.field126 != 5 || field421 % 20 < 10)) {
                    this.field523[5].method166(11, 180, (byte) 35);
                }
                if (this.field150[6] != -1 && (this.field126 != 6 || field421 % 20 < 10)) {
                    this.field523[6].method166(13, 208, (byte) 35);
                }
            }
            this.field181.method589(160, super.field1519, 418, 516);
            this.field180.method588(823);
            this.field477.method166(0, 0, (byte) 35);
            if (this.field152 == -1) {
                if (this.field150[this.field256] != -1) {
                    if (this.field256 == 7) {
                        this.field565.method166(0, 42, (byte) 35);
                    }
                    if (this.field256 == 8) {
                        this.field566.method166(0, 74, (byte) 35);
                    }
                    if (this.field256 == 9) {
                        this.field566.method166(0, 102, (byte) 35);
                    }
                    if (this.field256 == 10) {
                        this.field567.method166(1, 130, (byte) 35);
                    }
                    if (this.field256 == 11) {
                        this.field569.method166(0, 173, (byte) 35);
                    }
                    if (this.field256 == 12) {
                        this.field569.method166(0, 201, (byte) 35);
                    }
                    if (this.field256 == 13) {
                        this.field568.method166(0, 229, (byte) 35);
                    }
                }
                if (this.field150[8] != -1 && (this.field126 != 8 || field421 % 20 < 10)) {
                    this.field523[7].method166(2, 74, (byte) 35);
                }
                if (this.field150[9] != -1 && (this.field126 != 9 || field421 % 20 < 10)) {
                    this.field523[8].method166(3, 102, (byte) 35);
                }
                if (this.field150[10] != -1 && (this.field126 != 10 || field421 % 20 < 10)) {
                    this.field523[9].method166(4, 137, (byte) 35);
                }
                if (this.field150[11] != -1 && (this.field126 != 11 || field421 % 20 < 10)) {
                    this.field523[10].method166(2, 174, (byte) 35);
                }
                if (this.field150[12] != -1 && (this.field126 != 12 || field421 % 20 < 10)) {
                    this.field523[11].method166(2, 201, (byte) 35);
                }
                if (this.field150[13] != -1 && (this.field126 != 13 || field421 % 20 < 10)) {
                    this.field523[12].method166(2, 226, (byte) 35);
                }
            }
            this.field180.method589(466, super.field1519, 418, 496);
            this.field379.method588(823);
        }
        if (this.field169) {
            this.field169 = false;
            this.field179.method588(823);
            this.field476.method166(0, 0, (byte) 35);
            this.field141.method467(55, "Public chat", true, true, 16777215, 28);
            if (this.field527 == 0) {
                this.field141.method467(55, "On", true, true, 65280, 41);
            }
            if (this.field527 == 1) {
                this.field141.method467(55, "Friends", true, true, 16776960, 41);
            }
            if (this.field527 == 2) {
                this.field141.method467(55, "Off", true, true, 16711680, 41);
            }
            if (this.field527 == 3) {
                this.field141.method467(55, "Hide", true, true, 65535, 41);
            }
            this.field141.method467(184, "Private chat", true, true, 16777215, 28);
            if (this.field410 == 0) {
                this.field141.method467(184, "On", true, true, 65280, 41);
            }
            if (this.field410 == 1) {
                this.field141.method467(184, "Friends", true, true, 16776960, 41);
            }
            if (this.field410 == 2) {
                this.field141.method467(184, "Off", true, true, 16711680, 41);
            }
            this.field141.method467(324, "Trade/compete", true, true, 16777215, 28);
            if (this.field176 == 0) {
                this.field141.method467(324, "On", true, true, 65280, 41);
            }
            if (this.field176 == 1) {
                this.field141.method467(324, "Friends", true, true, 16776960, 41);
            }
            if (this.field176 == 2) {
                this.field141.method467(324, "Off", true, true, 16711680, 41);
            }
            this.field141.method467(458, "Report abuse", true, true, 16777215, 33);
            this.field179.method589(453, super.field1519, 418, 0);
            this.field379.method588(823);
        }
        this.field304 = 0;
        if (arg0 != -9) {
            this.field138 = !this.field138;
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(ZI)Ljava/lang/String;")
    private static final String method149(boolean arg0, int arg1) {
        if (!arg0) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        if (arg1 < 100000) {
            return String.valueOf(arg1);
        } else {
            return arg1 < 10000000 ? arg1 / 1000 + "K" : arg1 / 1000000 + "M";
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Z[BZ)V")
    public final void method150(boolean arg0, byte[] arg1, boolean arg2) {
        signlink.midifade = arg0 ? 1 : 0;
        signlink.midisave(arg1, arg1.length);
        if (!arg2) {
            this.field343 = -1;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LXJCNBMKS;II)V")
    private final void method151(class68 arg0, int arg1, int arg2) {
        if (arg2 < 5 || arg2 > 5) {
            this.field343 = arg0.method534();
        }
        for (int var4 = 0; var4 < this.field233; ++var4) {
            int var5 = this.field234[var4];
            class45 var6 = this.field230[var5];
            int var7 = arg0.method534();
            if ((var7 & 16) != 0) {
                var7 += arg0.method534() << 8;
            }
            this.method105(var6, 7, arg0, var7, var5);
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(ILXJCNBMKS;I)V")
    public final void method152(int arg0, class68 arg1, int arg2) {
        if (arg2 != 5) {
            this.field124 = null;
        }
        if (arg0 == 72) {
            int var4 = arg1.method552(22736);
            int var5 = var4 >> 2;
            int var6 = var4 & 3;
            int var7 = this.field548[var5];
            int var8 = arg1.method536();
            int var9 = arg1.method534();
            int var10 = (var9 >> 4 & 7) + this.field275;
            int var11 = (var9 & 7) + this.field276;
            if (var10 >= 0 && var11 >= 0 && var10 < 103 && var11 < 103) {
                int var12 = this.field347[this.field144][var10][var11];
                int var13 = this.field347[this.field144][var10 + 1][var11];
                int var14 = this.field347[this.field144][var10 + 1][var11 + 1];
                int var15 = this.field347[this.field144][var10][var11 + 1];
                if (var7 == 0) {
                    class7 var16 = this.field227.method328(var10, var11, (byte) 74, this.field144);
                    if (var16 != null) {
                        int var17 = var16.field118 >> 14 & 32767;
                        if (var5 == 2) {
                            var16.field116 = new class1(var12, var13, var6 + 4, 2, var8, var17, var14, false, var15, this.field551);
                            var16.field117 = new class1(var12, var13, var6 + 1 & 3, 2, var8, var17, var14, false, var15, this.field551);
                        } else {
                            var16.field116 = new class1(var12, var13, var6, var5, var8, var17, var14, false, var15, this.field551);
                        }
                    }
                }
                if (var7 == 1) {
                    class8 var18 = this.field227.method329(var11, this.field144, var10, 2);
                    if (var18 != null) {
                        var18.field599 = new class1(var12, var13, 0, 4, var8, var18.field600 >> 14 & 32767, var14, false, var15, this.field551);
                    }
                }
                if (var7 == 2) {
                    class20 var19 = this.field227.method330(this.field144, var10, var11, this.field376);
                    if (var5 == 11) {
                        var5 = 10;
                    }
                    if (var19 != null) {
                        var19.field804 = new class1(var12, var13, var6, var5, var8, var19.field812 >> 14 & 32767, var14, false, var15, this.field551);
                    }
                }
                if (var7 == 3) {
                    class40 var20 = this.field227.method331(var10, this.field144, (byte) 7, var11);
                    if (var20 != null) {
                        var20.field1121 = new class1(var12, var13, var6, 22, var8, var20.field1122 >> 14 & 32767, var14, false, var15, this.field551);
                    }
                }
            }
        } else if (arg0 == 35) {
            int var21 = arg1.method534();
            int var22 = (var21 >> 4 & 7) + this.field275;
            int var23 = (var21 & 7) + this.field276;
            int var24 = arg1.method536();
            int var25 = arg1.method536();
            int var26 = arg1.method536();
            if (var22 >= 0 && var23 >= 0 && var22 < 104 && var23 < 104) {
                class15 var27 = this.field124[this.field144][var22][var23];
                if (var27 != null) {
                    for (class33 var28 = (class33) var27.method201(); var28 != null; var28 = (class33) var27.method203((byte) 3)) {
                        if ((var24 & 32767) == var28.field1041 && var28.field1040 == var25) {
                            var28.field1040 = var26;
                            break;
                        }
                    }
                    this.method93(var22, var23);
                }
            }
        } else {
            if (arg0 == 159) {
                int var29 = arg1.method534();
                int var30 = (var29 >> 4 & 7) + this.field275;
                int var31 = (var29 & 7) + this.field276;
                byte var32 = arg1.method555(this.field195);
                int var33 = arg1.method553(3);
                int var34 = var33 >> 2;
                int var35 = var33 & 3;
                int var36 = this.field548[var34];
                int var37 = arg1.method560(-123);
                byte var38 = arg1.method555(this.field195);
                byte var39 = arg1.method535();
                int var40 = arg1.method536();
                int var41 = arg1.method561(-862);
                byte var42 = arg1.method535();
                int var43 = arg1.method561(-862);
                class45 var44;
                if (this.field401 == var43) {
                    var44 = field313;
                } else {
                    var44 = this.field230[var43];
                }
                if (var44 != null) {
                    class58 var45 = class58.method455(var40);
                    int var46 = this.field347[this.field144][var30][var31];
                    int var47 = this.field347[this.field144][var30 + 1][var31];
                    int var48 = this.field347[this.field144][var30 + 1][var31 + 1];
                    int var49 = this.field347[this.field144][var30][var31 + 1];
                    class19 var50 = var45.method456(var34, var35, var46, var47, var48, var49, -1);
                    if (var50 != null) {
                        this.method50(var30, 0, 0, 0, this.field144, var37 + 1, var36, -1, var41 + 1, var31);
                        var44.field1176 = field421 + var41;
                        var44.field1177 = field421 + var37;
                        var44.field1181 = var50;
                        int var51 = var45.field1450;
                        int var52 = var45.field1439;
                        if (var35 == 1 || var35 == 3) {
                            var51 = var45.field1439;
                            var52 = var45.field1450;
                        }
                        var44.field1178 = var30 * 128 + var51 * 64;
                        var44.field1180 = var31 * 128 + var52 * 64;
                        var44.field1179 = this.method91(0, var44.field1180, this.field144, var44.field1178);
                        if (var39 > var42) {
                            byte var53 = var39;
                            var39 = var42;
                            var42 = var53;
                        }
                        if (var38 > var32) {
                            byte var54 = var38;
                            var38 = var32;
                            var32 = var54;
                        }
                        var44.field1197 = var30 + var39;
                        var44.field1199 = var30 + var42;
                        var44.field1198 = var31 + var38;
                        var44.field1200 = var31 + var32;
                    }
                }
            }
            if (arg0 == 61) {
                int var55 = arg1.method534();
                int var56 = (var55 >> 4 & 7) + this.field275;
                int var57 = (var55 & 7) + this.field276;
                int var58 = arg1.method560(-123);
                int var59 = arg1.method561(-862);
                if (var56 >= 0 && var57 >= 0 && var56 < 104 && var57 < 104) {
                    class33 var60 = new class33();
                    var60.field1041 = var59;
                    var60.field1040 = var58;
                    if (this.field124[this.field144][var56][var57] == null) {
                        this.field124[this.field144][var56][var57] = new class15(field412);
                    }
                    this.field124[this.field144][var56][var57].method198(var60);
                    this.method93(var56, var57);
                }
            } else if (arg0 == 102) {
                int var61 = arg1.method553(3);
                int var62 = var61 >> 2;
                int var63 = var61 & 3;
                int var64 = this.field548[var62];
                int var65 = arg1.method561(-862);
                int var66 = arg1.method553(3);
                int var67 = (var66 >> 4 & 7) + this.field275;
                int var68 = (var66 & 7) + this.field276;
                if (var67 >= 0 && var68 >= 0 && var67 < 104 && var68 < 104) {
                    this.method50(var67, 0, var63, var62, this.field144, -1, var64, var65, 0, var68);
                }
            } else if (arg0 == 128) {
                int var69 = arg1.method534();
                int var70 = (var69 >> 4 & 7) + this.field275;
                int var71 = (var69 & 7) + this.field276;
                int var72 = var70 + arg1.method535();
                int var73 = var71 + arg1.method535();
                int var74 = arg1.method537();
                int var75 = arg1.method536();
                int var76 = arg1.method534() * 4;
                int var77 = arg1.method534() * 4;
                int var78 = arg1.method536();
                int var79 = arg1.method536();
                int var80 = arg1.method534();
                int var81 = arg1.method534();
                if (var70 >= 0 && var71 >= 0 && var70 < 104 && var71 < 104 && var72 >= 0 && var73 >= 0 && var72 < 104 && var73 < 104 && var75 != 65535) {
                    int var82 = var70 * 128 + 64;
                    int var83 = var71 * 128 + 64;
                    int var84 = var72 * 128 + 64;
                    int var85 = var73 * 128 + 64;
                    class51 var86 = new class51(var81, var80, field421 + var78, var75, this.method91(0, var83, this.field144, var82) - var76, var74, field421 + var79, this.field144, var77, true, var83, var82);
                    var86.method403(var84, var85, 136, this.method91(0, var85, this.field144, var84) - var77, field421 + var78);
                    this.field458.method198(var86);
                }
            } else if (arg0 == 26) {
                int var87 = arg1.method536();
                int var88 = arg1.method561(-862);
                int var89 = arg1.method554((byte) 112);
                int var90 = (var89 >> 4 & 7) + this.field275;
                int var91 = (var89 & 7) + this.field276;
                int var92 = arg1.method559(0);
                if (var90 >= 0 && var91 >= 0 && var90 < 104 && var91 < 104 && this.field401 != var92) {
                    class33 var93 = new class33();
                    var93.field1041 = var87;
                    var93.field1040 = var88;
                    if (this.field124[this.field144][var90][var91] == null) {
                        this.field124[this.field144][var90][var91] = new class15(field412);
                    }
                    this.field124[this.field144][var90][var91].method198(var93);
                    this.method93(var90, var91);
                }
            } else if (arg0 == 251) {
                int var94 = arg1.method534();
                int var95 = (var94 >> 4 & 7) + this.field275;
                int var96 = (var94 & 7) + this.field276;
                int var97 = arg1.method553(3);
                int var98 = var97 >> 2;
                int var99 = var97 & 3;
                int var100 = this.field548[var98];
                if (var95 >= 0 && var96 >= 0 && var95 < 104 && var96 < 104) {
                    this.method50(var95, 0, var99, var98, this.field144, -1, var100, -1, 0, var96);
                }
            } else if (arg0 != 37) {
                if (arg0 == 80) {
                    int var107 = arg1.method534();
                    int var108 = (var107 >> 4 & 7) + this.field275;
                    int var109 = (var107 & 7) + this.field276;
                    int var110 = arg1.method536();
                    int var111 = arg1.method534();
                    int var112 = arg1.method536();
                    if (var108 >= 0 && var109 >= 0 && var108 < 104 && var109 < 104) {
                        int var113 = var108 * 128 + 64;
                        int var114 = var109 * 128 + 64;
                        class25 var115 = new class25(this.method91(0, var114, this.field144, var113) - var111, var112, 368, field421, var110, this.field144, var113, var114);
                        this.field417.method198(var115);
                    }
                } else {
                    if (arg0 == 240) {
                        int var116 = arg1.method534();
                        int var117 = (var116 >> 4 & 7) + this.field275;
                        int var118 = (var116 & 7) + this.field276;
                        int var119 = arg1.method536();
                        int var120 = arg1.method534();
                        int var121 = var120 >> 4 & 15;
                        int var122 = var120 & 7;
                        if (field313.field1696[0] >= var117 - var121 && field313.field1696[0] <= var117 + var121 && field313.field1697[0] >= var118 - var121 && field313.field1697[0] <= var118 + var121 && this.field120 && !field372 && this.field549 < 50) {
                            this.field404[this.field549] = var119;
                            this.field539[this.field549] = var122;
                            this.field564[this.field549] = class23.field858[var119];
                            ++this.field549;
                            return;
                        }
                    }
                }
            } else {
                int var101 = arg1.method552(22736);
                int var102 = (var101 >> 4 & 7) + this.field275;
                int var103 = (var101 & 7) + this.field276;
                int var104 = arg1.method536();
                if (var102 >= 0 && var103 >= 0 && var102 < 104 && var103 < 104) {
                    class15 var105 = this.field124[this.field144][var102][var103];
                    if (var105 != null) {
                        for (class33 var106 = (class33) var105.method201(); var106 != null; var106 = (class33) var105.method203((byte) 3)) {
                            if ((var104 & 32767) == var106.field1041) {
                                var106.method396();
                                break;
                            }
                        }
                        if (var105.method201() == null) {
                            this.field124[this.field144][var102][var103] = null;
                        }
                        this.method93(var102, var103);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILDEITBGVL;)V")
    public final void method153(int arg0, class9 arg1) {
        short var3 = 256;
        for (int var4 = 0; var4 < this.field260.length; ++var4) {
            this.field260[var4] = 0;
        }
        for (int var5 = 0; var5 < 5000; ++var5) {
            int var17 = (int) (Math.random() * 128.0D * (double) var3);
            this.field260[var17] = (int) (Math.random() * 256.0D);
        }
        for (int var6 = 0; var6 < 20; ++var6) {
            for (int var13 = 1; var13 < var3 - 1; ++var13) {
                for (int var15 = 1; var15 < 127; ++var15) {
                    int var16 = (var13 << 7) + var15;
                    this.field261[var16] = (this.field260[var16 - 1] + this.field260[var16 + 1] + this.field260[var16 - 128] + this.field260[var16 + 128]) / 4;
                }
            }
            int[] var14 = this.field260;
            this.field260 = this.field261;
            this.field261 = var14;
        }
        this.field342 += arg0;
        if (arg1 != null) {
            int var7 = 0;
            for (int var8 = 0; var8 < arg1.field610; ++var8) {
                for (int var9 = 0; var9 < arg1.field609; ++var9) {
                    if (arg1.field607[var7++] != 0) {
                        int var10 = var9 + 16 + arg1.field611;
                        int var11 = var8 + 16 + arg1.field612;
                        int var12 = (var11 << 7) + var10;
                        this.field260[var12] = 0;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(ZI)V")
    public final void method154(boolean arg0, int arg1) {
        this.method22((byte) 6);
        this.field332.method588(823);
        this.field340.method166(0, 0, (byte) 35);
        short var3 = 360;
        short var4 = 200;
        if (this.field555 == 0) {
            int var5 = var4 / 2 + 80;
            this.field140.method467(var3 / 2, this.field364.field1392, true, true, 7711145, var5);
            int var6 = var4 / 2 - 20;
            this.field142.method467(var3 / 2, "Welcome to RuneScape", true, true, 16776960, var6);
            int var17 = var6 + 30;
            int var7 = var3 / 2 - 80;
            int var8 = var4 / 2 + 20;
            this.field341.method166(var8 - 20, var7 - 73, (byte) 35);
            this.field142.method467(var7, "New User", true, true, 16777215, var8 + 5);
            int var9 = var3 / 2 + 80;
            this.field341.method166(var8 - 20, var9 - 73, (byte) 35);
            this.field142.method467(var9, "Existing User", true, true, 16777215, var8 + 5);
        }
        if (this.field555 == 2) {
            int var10 = var4 / 2 - 40;
            if (this.field495.length() > 0) {
                this.field142.method467(var3 / 2, this.field495, true, true, 16776960, var10 - 15);
                this.field142.method467(var3 / 2, this.field496, true, true, 16776960, var10);
                var10 += 30;
            } else {
                this.field142.method467(var3 / 2, this.field496, true, true, 16776960, var10 - 7);
                var10 += 30;
            }
            this.field142.method474(var10, 16777215, "Username: " + this.field300 + (this.field247 == 0 & field421 % 40 < 20 ? "@yel@|" : ""), true, var3 / 2 - 90, (byte) 3);
            var10 += 15;
            this.field142.method474(var10, 16777215, "Password: " + class62.method491(0, this.field301) + (this.field247 == 1 & field421 % 40 < 20 ? "@yel@|" : ""), true, var3 / 2 - 88, (byte) 3);
            var10 += 15;
            if (!arg0) {
                int var11 = var3 / 2 - 80;
                int var12 = var4 / 2 + 50;
                this.field341.method166(var12 - 20, var11 - 73, (byte) 35);
                this.field142.method467(var11, "Login", true, true, 16777215, var12 + 5);
                int var13 = var3 / 2 + 80;
                this.field341.method166(var12 - 20, var13 - 73, (byte) 35);
                this.field142.method467(var13, "Cancel", true, true, 16777215, var12 + 5);
            }
        }
        if (this.field555 == 3) {
            this.field142.method467(var3 / 2, "Create a free account", true, true, 16776960, var4 / 2 - 60);
            int var14 = var4 / 2 - 35;
            this.field142.method467(var3 / 2, "To create a new account you need to", true, true, 16777215, var14);
            int var18 = var14 + 15;
            this.field142.method467(var3 / 2, "go back to the main RuneScape webpage", true, true, 16777215, var18);
            int var19 = var18 + 15;
            this.field142.method467(var3 / 2, "and choose the red 'create account'", true, true, 16777215, var19);
            int var20 = var19 + 15;
            this.field142.method467(var3 / 2, "button at the top right of that page.", true, true, 16777215, var20);
            int var21 = var20 + 15;
            int var15 = var3 / 2;
            int var16 = var4 / 2 + 50;
            this.field341.method166(var16 - 20, var15 - 73, (byte) 35);
            this.field142.method467(var15, "Cancel", true, true, 16777215, var16 + 5);
        }
        this.field332.method589(171, super.field1519, 418, 202);
        if (arg1 != 8633) {
            this.field343 = -1;
        }
        if (this.field420) {
            this.field420 = false;
            this.field330.method589(0, super.field1519, 418, 128);
            this.field331.method589(371, super.field1519, 418, 202);
            this.field335.method589(265, super.field1519, 418, 0);
            this.field336.method589(265, super.field1519, 418, 562);
            this.field337.method589(171, super.field1519, 418, 128);
            this.field338.method589(171, super.field1519, 418, 562);
        }
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(II)V")
    public final void method155(int arg0, int arg1) {
        int var3 = class41.field1125[arg0].field1133;
        if (arg1 != 7) {
            this.method46();
        }
        if (var3 != 0) {
            int var4 = this.field584[arg0];
            if (var3 == 1) {
                if (var4 == 1) {
                    class12.method179(false, 0.9D);
                }
                if (var4 == 2) {
                    class12.method179(false, 0.8D);
                }
                if (var4 == 3) {
                    class12.method179(false, 0.7D);
                }
                if (var4 == 4) {
                    class12.method179(false, 0.6D);
                }
                class5.field90.method299();
                this.field420 = true;
            }
            if (var3 == 3) {
                boolean var5 = this.field182;
                if (var4 == 0) {
                    this.method140(this.field182, true, 0);
                    this.field182 = true;
                }
                if (var4 == 1) {
                    this.method140(this.field182, true, -400);
                    this.field182 = true;
                }
                if (var4 == 2) {
                    this.method140(this.field182, true, -800);
                    this.field182 = true;
                }
                if (var4 == 3) {
                    this.method140(this.field182, true, -1200);
                    this.field182 = true;
                }
                if (var4 == 4) {
                    this.field182 = false;
                }
                if (this.field182 != var5 && !field372) {
                    if (this.field182) {
                        this.field422 = this.field570;
                        this.field423 = true;
                        this.field364.method430(2, this.field422);
                    } else {
                        this.method96(1);
                    }
                    this.field538 = 0;
                }
            }
            if (var3 == 4) {
                if (var4 == 0) {
                    this.field120 = true;
                    this.method157(false, 0);
                }
                if (var4 == 1) {
                    this.field120 = true;
                    this.method157(false, -400);
                }
                if (var4 == 2) {
                    this.field120 = true;
                    this.method157(false, -800);
                }
                if (var4 == 3) {
                    this.field120 = true;
                    this.method157(false, -1200);
                }
                if (var4 == 4) {
                    this.field120 = false;
                }
            }
            if (var3 == 5) {
                this.field546 = var4;
            }
            if (var3 == 6) {
                this.field296 = var4;
            }
            if (var3 == 8) {
                this.field509 = var4;
                this.field498 = true;
            }
            if (var3 == 9) {
                this.field216 = var4;
            }
        }
    }

    @OriginalMember(owner = "client", name = "t", descriptor = "(Z)V")
    public final void method156(boolean arg0) {
        if (arg0) {
            this.field124 = null;
        }
        while (true) {
            class72 var2 = this.field364.method437();
            if (var2 == null) {
                return;
            }
            if (var2.field1734 == 0) {
                class19.method248(var2.field1735, var2.field1737, 48292);
                if ((this.field364.method439(var2.field1735, 21251) & 98) != 0) {
                    this.field354 = true;
                    if (this.field254 != -1) {
                        this.field498 = true;
                    }
                }
            }
            if (var2.field1734 == 1 && var2.field1737 != null) {
                class55.method425(var2.field1737, this.field525);
            }
            if (var2.field1734 == 2 && this.field422 == var2.field1735 && var2.field1737 != null) {
                this.method150(this.field423, var2.field1737, true);
            }
            if (var2.field1734 == 3 && this.field218 == 1) {
                for (int var3 = 0; var3 < this.field289.length; ++var3) {
                    if (this.field367[var3] == var2.field1735) {
                        this.field289[var3] = var2.field1737;
                        if (var2.field1737 == null) {
                            this.field367[var3] = -1;
                        }
                        break;
                    }
                    if (this.field368[var3] == var2.field1735) {
                        this.field194[var3] = var2.field1737;
                        if (var2.field1737 == null) {
                            this.field368[var3] = -1;
                        }
                        break;
                    }
                }
            }
            if (var2.field1734 == 93 && this.field364.method443(var2.field1735, 0)) {
                class63.method506(this.field364, new class68((byte) 9, var2.field1737), this.field388);
            }
        }
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(ZI)V")
    public final void method157(boolean arg0, int arg1) {
        signlink.wavevol = arg1;
        if (arg0) {
            for (int var3 = 1; var3 > 0; ++var3) {
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LRWLOYYVC;IIIB)V")
    public final void method158(class53 arg0, int arg1, int arg2, int arg3, byte arg4) {
        if (arg0.field1330 == 0 && arg0.field1302 != null) {
            if (!arg0.field1272 || this.field185 == arg0.field1319 || this.field191 == arg0.field1319 || this.field309 == arg0.field1319) {
                int var6 = class22.field845;
                int var7 = class22.field843;
                int var8 = class22.field846;
                int var9 = class22.field844;
                class22.method281(true, arg2, arg3, arg0.field1316 + arg2, arg0.field1307 + arg3);
                int var10 = arg0.field1302.length;
                if (arg4 == 7) {
                    boolean var11 = false;
                } else {
                    this.method46();
                }
                for (int var12 = 0; var12 < var10; ++var12) {
                    int var13 = arg0.field1294[var12] + arg2;
                    int var14 = arg0.field1268[var12] + arg3 - arg1;
                    class53 var15 = class53.field1309[arg0.field1302[var12]];
                    int var16 = var15.field1306 + var13;
                    int var17 = var15.field1304 + var14;
                    if (var15.field1317 > 0) {
                        this.method101(var15, (byte) 0);
                    }
                    if (var15.field1330 == 0) {
                        if (var15.field1287 > var15.field1312 - var15.field1307) {
                            var15.field1287 = var15.field1312 - var15.field1307;
                        }
                        if (var15.field1287 < 0) {
                            var15.field1287 = 0;
                        }
                        this.method158(var15, var15.field1287, var16, var17, (byte) 7);
                        if (var15.field1312 > var15.field1307) {
                            this.method62(var15.field1287, var15.field1307, var15.field1316 + var16, var17, var15.field1312, -87);
                        }
                    } else if (var15.field1330 != 1) {
                        if (var15.field1330 == 2) {
                            int var18 = 0;
                            for (int var19 = 0; var19 < var15.field1307; ++var19) {
                                for (int var20 = 0; var20 < var15.field1316; ++var20) {
                                    int var21 = (var15.field1290 + 32) * var20 + var16;
                                    int var22 = (var15.field1310 + 32) * var19 + var17;
                                    if (var18 < 20) {
                                        var21 += var15.field1276[var18];
                                        var22 += var15.field1282[var18];
                                    }
                                    if (var15.field1327[var18] <= 0) {
                                        if (var15.field1270 != null && var18 < 20) {
                                            class69 var31 = var15.field1270[var18];
                                            if (var31 != null) {
                                                var31.method576(var22, var21, (byte) 35);
                                            }
                                        }
                                    } else {
                                        int var23 = 0;
                                        int var24 = 0;
                                        int var25 = var15.field1327[var18] - 1;
                                        if (var21 > class22.field845 - 32 && var21 < class22.field846 && var22 > class22.field843 - 32 && var22 < class22.field844 || this.field325 != 0 && this.field324 == var18) {
                                            int var26 = 0;
                                            if (this.field391 == 1 && this.field392 == var18 && this.field393 == var15.field1319) {
                                                var26 = 16777215;
                                            }
                                            class69 var27 = class5.method8((byte) 6, var25, var15.field1289[var18], var26);
                                            if (var27 != null) {
                                                if (this.field325 != 0 && this.field324 == var18 && this.field323 == var15.field1319) {
                                                    var23 = super.field1527 - this.field326;
                                                    var24 = super.field1528 - this.field327;
                                                    if (var23 < 5 && var23 > -5) {
                                                        var23 = 0;
                                                    }
                                                    if (var24 < 5 && var24 > -5) {
                                                        var24 = 0;
                                                    }
                                                    if (this.field196 < 5) {
                                                        var23 = 0;
                                                        var24 = 0;
                                                    }
                                                    var27.method578(false, var22 + var24, var21 + var23, 128);
                                                    if (var22 + var24 < class22.field843 && arg0.field1287 > 0) {
                                                        int var28 = (class22.field843 - var22 - var24) * this.field304 / 3;
                                                        if (var28 > this.field304 * 10) {
                                                            var28 = this.field304 * 10;
                                                        }
                                                        if (var28 > arg0.field1287) {
                                                            var28 = arg0.field1287;
                                                        }
                                                        arg0.field1287 -= var28;
                                                        this.field327 += var28;
                                                    }
                                                    if (var22 + var24 + 32 > class22.field844 && arg0.field1287 < arg0.field1312 - arg0.field1307) {
                                                        int var29 = (var22 + var24 + 32 - class22.field844) * this.field304 / 3;
                                                        if (var29 > this.field304 * 10) {
                                                            var29 = this.field304 * 10;
                                                        }
                                                        if (var29 > arg0.field1312 - arg0.field1307 - arg0.field1287) {
                                                            var29 = arg0.field1312 - arg0.field1307 - arg0.field1287;
                                                        }
                                                        arg0.field1287 += var29;
                                                        this.field327 -= var29;
                                                    }
                                                } else if (this.field468 != 0 && this.field467 == var18 && this.field466 == var15.field1319) {
                                                    var27.method578(false, var22, var21, 128);
                                                } else {
                                                    var27.method576(var22, var21, (byte) 35);
                                                }
                                                if (var27.field1667 == 33 || var15.field1289[var18] != 1) {
                                                    int var30 = var15.field1289[var18];
                                                    this.field140.method470(var21 + 1 + var23, method149(true, var30), 0, var22 + 10 + var24, 1);
                                                    this.field140.method470(var21 + var23, method149(true, var30), 16776960, var22 + 9 + var24, 1);
                                                }
                                            }
                                        }
                                    }
                                    ++var18;
                                }
                            }
                        } else if (var15.field1330 == 3) {
                            boolean var32 = false;
                            if (this.field309 == var15.field1319 || this.field191 == var15.field1319 || this.field185 == var15.field1319) {
                                var32 = true;
                            }
                            int var33;
                            if (this.method159(true, var15)) {
                                var33 = var15.field1283;
                                if (var32 && var15.field1277 != 0) {
                                    var33 = var15.field1277;
                                }
                            } else {
                                var33 = var15.field1269;
                                if (var32 && var15.field1292 != 0) {
                                    var33 = var15.field1292;
                                }
                            }
                            if (var15.field1314 == 0) {
                                if (var15.field1318) {
                                    class22.method284(var16, var17, var33, var15.field1316, 47782, var15.field1307);
                                } else {
                                    class22.method285(var15.field1307, var33, var16, var15.field1316, -1086, var17);
                                }
                            } else if (var15.field1318) {
                                class22.method283(var33, var15.field1316, -861, var17, 256 - (var15.field1314 & 255), var16, var15.field1307);
                            } else {
                                class22.method286(5, var15.field1307, var33, 256 - (var15.field1314 & 255), var15.field1316, var17, var16);
                            }
                        } else if (var15.field1330 == 4) {
                            class60 var34 = var15.field1308;
                            String var35 = var15.field1291;
                            boolean var36 = false;
                            if (this.field309 == var15.field1319 || this.field191 == var15.field1319 || this.field185 == var15.field1319) {
                                var36 = true;
                            }
                            int var37;
                            if (this.method159(true, var15)) {
                                var37 = var15.field1283;
                                if (var36 && var15.field1277 != 0) {
                                    var37 = var15.field1277;
                                }
                                if (var15.field1325.length() > 0) {
                                    var35 = var15.field1325;
                                }
                            } else {
                                var37 = var15.field1269;
                                if (var36 && var15.field1292 != 0) {
                                    var37 = var15.field1292;
                                }
                            }
                            if (var15.field1324 == 6 && this.field398) {
                                var35 = "Please wait...";
                                var37 = var15.field1269;
                            }
                            if (class22.field841 == 479) {
                                if (var37 == 16776960) {
                                    var37 = 255;
                                }
                                if (var37 == 49152) {
                                    var37 = 16777215;
                                }
                            }
                            int var38 = var34.field1503 + var17;
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
                                                                        var35 = var35.substring(0, var43) + this.method112(this.field359, this.method77(4, true, var15)) + var35.substring(var43 + 2);
                                                                    }
                                                                }
                                                                var35 = var35.substring(0, var42) + this.method112(this.field359, this.method77(3, true, var15)) + var35.substring(var42 + 2);
                                                            }
                                                        }
                                                        var35 = var35.substring(0, var41) + this.method112(this.field359, this.method77(2, true, var15)) + var35.substring(var41 + 2);
                                                    }
                                                }
                                                var35 = var35.substring(0, var40) + this.method112(this.field359, this.method77(1, true, var15)) + var35.substring(var40 + 2);
                                            }
                                        }
                                        var35 = var35.substring(0, var39) + this.method112(this.field359, this.method77(0, true, var15)) + var35.substring(var39 + 2);
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
                                if (var15.field1271) {
                                    var34.method467(var15.field1316 / 2 + var16, var45, true, var15.field1284, var37, var38);
                                } else {
                                    var34.method474(var38, var37, var45, var15.field1284, var16, (byte) 3);
                                }
                                var38 += var34.field1503;
                            }
                        } else if (var15.field1330 == 5) {
                            class69 var46;
                            if (this.method159(true, var15)) {
                                var46 = var15.field1313;
                            } else {
                                var46 = var15.field1322;
                            }
                            if (var46 != null) {
                                var46.method576(var17, var16, (byte) 35);
                            }
                        } else if (var15.field1330 == 6) {
                            int var47 = class12.field635;
                            int var48 = class12.field636;
                            class12.field635 = var15.field1316 / 2 + var16;
                            class12.field636 = var15.field1307 / 2 + var17;
                            int var49 = class12.field639[var15.field1296] * var15.field1295 >> 16;
                            int var50 = class12.field640[var15.field1296] * var15.field1295 >> 16;
                            boolean var51 = this.method159(true, var15);
                            int var52;
                            if (var51) {
                                var52 = var15.field1300;
                            } else {
                                var52 = var15.field1299;
                            }
                            class19 var53;
                            if (var52 == -1) {
                                var53 = var15.method415(var51, -1, -1, 4);
                            } else {
                                class21 var54 = class21.field817[var52];
                                var53 = var15.method415(var51, var54.field820[var15.field1326], var54.field819[var15.field1326], 4);
                            }
                            if (var53 != null) {
                                var53.method270(0, var15.field1297, 0, var15.field1296, 0, var49, var50);
                            }
                            class12.field635 = var47;
                            class12.field636 = var48;
                        } else if (var15.field1330 == 7) {
                            class60 var55 = var15.field1308;
                            int var56 = 0;
                            for (int var57 = 0; var57 < var15.field1307; ++var57) {
                                for (int var58 = 0; var58 < var15.field1316; ++var58) {
                                    if (var15.field1327[var56] > 0) {
                                        class5 var59 = class5.method13(var15.field1327[var56] - 1);
                                        String var60 = var59.field51;
                                        if (var59.field76 || var15.field1289[var56] != 1) {
                                            var60 = var60 + " x" + method117(var15.field1289[var56], 0);
                                        }
                                        int var61 = (var15.field1290 + 115) * var58 + var16;
                                        int var62 = (var15.field1310 + 12) * var57 + var17;
                                        if (var15.field1271) {
                                            var55.method467(var15.field1316 / 2 + var61, var60, true, var15.field1284, var15.field1269, var62);
                                        } else {
                                            var55.method474(var62, var15.field1269, var60, var15.field1284, var61, (byte) 3);
                                        }
                                    }
                                    ++var56;
                                }
                            }
                        }
                    }
                }
                class22.method281(true, var6, var7, var8, var9);
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(ZLRWLOYYVC;)Z")
    public final boolean method159(boolean arg0, class53 arg1) {
        if (arg1.field1281 == null) {
            return false;
        } else {
            for (int var3 = 0; var3 < arg1.field1281.length; ++var3) {
                int var4 = this.method77(var3, true, arg1);
                int var5 = arg1.field1273[var3];
                if (arg1.field1281[var3] == 2) {
                    if (var4 >= var5) {
                        return false;
                    }
                } else if (arg1.field1281[var3] == 3) {
                    if (var4 <= var5) {
                        return false;
                    }
                } else if (arg1.field1281[var3] == 4) {
                    if (var4 == var5) {
                        return false;
                    }
                } else if (var4 != var5) {
                    return false;
                }
            }
            if (!arg0) {
                this.field447.method524(165);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "h", descriptor = "(II)V")
    public final void method160(int arg0, int arg1) {
        if (arg1 != 27188) {
            this.field343 = this.field556.method534();
        }
        if (!field372) {
            if (class12.field649[17] >= arg0) {
                class9 var3 = class12.field643[17];
                int var4 = var3.field610 * var3.field609 - 1;
                int var5 = this.field304 * var3.field609 * 2;
                byte[] var6 = var3.field607;
                byte[] var7 = this.field267;
                for (int var8 = 0; var8 <= var4; ++var8) {
                    var7[var8] = var6[var8 - var5 & var4];
                }
                var3.field607 = var7;
                this.field267 = var6;
                class12.method177(17, 0);
            }
            if (class12.field649[24] >= arg0) {
                class9 var9 = class12.field643[24];
                int var10 = var9.field610 * var9.field609 - 1;
                int var11 = this.field304 * var9.field609 * 2;
                byte[] var12 = var9.field607;
                byte[] var13 = this.field267;
                for (int var14 = 0; var14 <= var10; ++var14) {
                    var13[var14] = var12[var14 - var11 & var10];
                }
                var9.field607 = var13;
                this.field267 = var12;
                class12.method177(24, 0);
            }
            if (class12.field649[34] >= arg0) {
                class9 var15 = class12.field643[34];
                int var16 = var15.field610 * var15.field609 - 1;
                int var17 = this.field304 * var15.field609 * 2;
                byte[] var18 = var15.field607;
                byte[] var19 = this.field267;
                for (int var20 = 0; var20 <= var16; ++var20) {
                    var19[var20] = var18[var20 - var17 & var16];
                }
                var15.field607 = var19;
                this.field267 = var18;
                class12.method177(34, 0);
                return;
            }
        }
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; ++var1) {
            int var4 = var1 + 1;
            int var5 = (int) ((double) var4 + 300.0D * Math.pow(2.0D, (double) var4 / 7.0D));
            var0 += var5;
            field133[var1] = var0 / 4;
        }
        field178 = -79;
        field199 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");
        field257 = new int[32];
        int var2 = 2;
        for (int var3 = 0; var3 < 32; ++var3) {
            field257[var3] = var2 - 1;
            var2 += var2;
        }
        field365 = 566;
        field369 = 10;
        field371 = true;
        field386 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
        field412 = true;
        field426 = 666;
        field446 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };
        field457 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");
        field559 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };
    }
}
