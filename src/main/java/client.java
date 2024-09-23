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
public class client extends class27 {

    @OriginalMember(owner = "client", name = "K", descriptor = "[I")
    private int[] field108 = new int[33];

    @OriginalMember(owner = "client", name = "M", descriptor = "I")
    private int field110 = 50;

    @OriginalMember(owner = "client", name = "N", descriptor = "[I")
    private int[] field111 = new int[this.field110];

    @OriginalMember(owner = "client", name = "O", descriptor = "[I")
    private int[] field112 = new int[this.field110];

    @OriginalMember(owner = "client", name = "P", descriptor = "[I")
    private int[] field113 = new int[this.field110];

    @OriginalMember(owner = "client", name = "Q", descriptor = "[I")
    private int[] field114 = new int[this.field110];

    @OriginalMember(owner = "client", name = "R", descriptor = "[I")
    private int[] field115 = new int[this.field110];

    @OriginalMember(owner = "client", name = "S", descriptor = "[I")
    private int[] field116 = new int[this.field110];

    @OriginalMember(owner = "client", name = "T", descriptor = "[I")
    private int[] field117 = new int[this.field110];

    @OriginalMember(owner = "client", name = "U", descriptor = "[Ljava/lang/String;")
    private String[] field118 = new String[this.field110];

    @OriginalMember(owner = "client", name = "Y", descriptor = "[I")
    private int[] field122 = new int[7];

    @OriginalMember(owner = "client", name = "ib", descriptor = "Z")
    private boolean field132 = true;

    @OriginalMember(owner = "client", name = "kb", descriptor = "[Ljava/lang/String;")
    private String[] field134 = new String[200];

    @OriginalMember(owner = "client", name = "lb", descriptor = "B")
    private byte field135 = 4;

    @OriginalMember(owner = "client", name = "vb", descriptor = "B")
    private byte field145 = 82;

    @OriginalMember(owner = "client", name = "yb", descriptor = "[LXANVNPIN;")
    private class65[] field148 = new class65[32];

    @OriginalMember(owner = "client", name = "Hb", descriptor = "Z")
    private boolean field157 = false;

    @OriginalMember(owner = "client", name = "Ib", descriptor = "I")
    private int field158 = -69;

    @OriginalMember(owner = "client", name = "Kb", descriptor = "I")
    private int field160 = -1;

    @OriginalMember(owner = "client", name = "Nb", descriptor = "[LXANVNPIN;")
    private class65[] field163 = new class65[32];

    @OriginalMember(owner = "client", name = "Ob", descriptor = "I")
    private int field164 = 883;

    @OriginalMember(owner = "client", name = "Qb", descriptor = "I")
    private int field166 = 2;

    @OriginalMember(owner = "client", name = "Rb", descriptor = "[Z")
    private boolean[] field167 = new boolean[5];

    @OriginalMember(owner = "client", name = "Tb", descriptor = "[I")
    private int[] field169 = new int[1000];

    @OriginalMember(owner = "client", name = "Ub", descriptor = "[I")
    private int[] field170 = new int[1000];

    @OriginalMember(owner = "client", name = "cc", descriptor = "B")
    private byte field178 = 7;

    @OriginalMember(owner = "client", name = "qc", descriptor = "[I")
    private int[] field192 = new int[5];

    @OriginalMember(owner = "client", name = "sc", descriptor = "I")
    private int field194 = -1;

    @OriginalMember(owner = "client", name = "tc", descriptor = "[[I")
    private int[][] field195 = new int[104][104];

    @OriginalMember(owner = "client", name = "uc", descriptor = "I")
    private int field196 = -1;

    @OriginalMember(owner = "client", name = "vc", descriptor = "I")
    private int field197 = -1;

    @OriginalMember(owner = "client", name = "wc", descriptor = "[I")
    private int[] field198 = new int[5];

    @OriginalMember(owner = "client", name = "xc", descriptor = "I")
    private int field199 = -441;

    @OriginalMember(owner = "client", name = "Cc", descriptor = "B")
    private byte field204 = 81;

    @OriginalMember(owner = "client", name = "Dc", descriptor = "Z")
    private boolean field205 = false;

    @OriginalMember(owner = "client", name = "Ec", descriptor = "I")
    private int field206 = 128;

    @OriginalMember(owner = "client", name = "Ic", descriptor = "[LPQKEJITK;")
    private class47[] field210 = new class47[13];

    @OriginalMember(owner = "client", name = "Jc", descriptor = "B")
    private byte field211 = -86;

    @OriginalMember(owner = "client", name = "Kc", descriptor = "I")
    private int field212 = 5;

    @OriginalMember(owner = "client", name = "Lc", descriptor = "LDNRIFKTO;")
    private class11 field213 = class11.method177(1, 342);

    @OriginalMember(owner = "client", name = "Rc", descriptor = "[I")
    private int[] field219 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client", name = "Uc", descriptor = "Ljava/util/zip/CRC32;")
    private CRC32 field222 = new CRC32();

    @OriginalMember(owner = "client", name = "Wc", descriptor = "Z")
    private boolean field224 = false;

    @OriginalMember(owner = "client", name = "Xc", descriptor = "Z")
    public boolean field225 = true;

    @OriginalMember(owner = "client", name = "Zc", descriptor = "Z")
    private boolean field227 = false;

    @OriginalMember(owner = "client", name = "hd", descriptor = "I")
    private int field235 = 2301979;

    @OriginalMember(owner = "client", name = "Cd", descriptor = "Ljava/lang/String;")
    private String field256 = "";

    @OriginalMember(owner = "client", name = "Dd", descriptor = "LZCVCEQHJ;")
    private class70 field257 = new class70(-489);

    @OriginalMember(owner = "client", name = "Ed", descriptor = "Z")
    private boolean field258 = false;

    @OriginalMember(owner = "client", name = "Gd", descriptor = "[I")
    private int[] field260 = new int[50];

    @OriginalMember(owner = "client", name = "Hd", descriptor = "I")
    private int field261 = -753;

    @OriginalMember(owner = "client", name = "Id", descriptor = "Z")
    private volatile boolean field262 = false;

    @OriginalMember(owner = "client", name = "Kd", descriptor = "I")
    private int field264 = -1;

    @OriginalMember(owner = "client", name = "Md", descriptor = "B")
    private byte field266 = 5;

    @OriginalMember(owner = "client", name = "Nd", descriptor = "B")
    private byte field267 = 7;

    @OriginalMember(owner = "client", name = "Od", descriptor = "[LXANVNPIN;")
    private class65[] field268 = new class65[100];

    @OriginalMember(owner = "client", name = "Ud", descriptor = "LZCVCEQHJ;")
    private class70 field274 = new class70(-489);

    @OriginalMember(owner = "client", name = "Vd", descriptor = "I")
    private int field275 = 119;

    @OriginalMember(owner = "client", name = "Xd", descriptor = "B")
    private byte field277 = 6;

    @OriginalMember(owner = "client", name = "Yd", descriptor = "Z")
    private boolean field278 = false;

    @OriginalMember(owner = "client", name = "Zd", descriptor = "I")
    private int field279 = 29388;

    @OriginalMember(owner = "client", name = "be", descriptor = "I")
    private int field281 = 2;

    @OriginalMember(owner = "client", name = "ce", descriptor = "LZCVCEQHJ;")
    private class70 field282 = new class70(-489);

    @OriginalMember(owner = "client", name = "he", descriptor = "B")
    private byte field287 = -87;

    @OriginalMember(owner = "client", name = "ke", descriptor = "B")
    private byte field290 = 4;

    @OriginalMember(owner = "client", name = "oe", descriptor = "Ljava/lang/String;")
    private String field294 = "";

    @OriginalMember(owner = "client", name = "pe", descriptor = "Ljava/lang/String;")
    private String field295 = "";

    @OriginalMember(owner = "client", name = "ve", descriptor = "[[[I")
    private int[][][] field301 = new int[4][13][13];

    @OriginalMember(owner = "client", name = "xe", descriptor = "LDNRIFKTO;")
    private class11 field303 = new class11(new byte[5000], field500);

    @OriginalMember(owner = "client", name = "ye", descriptor = "[LDLNPJUEQ;")
    private class10[] field304 = new class10[16384];

    @OriginalMember(owner = "client", name = "Ae", descriptor = "[I")
    public int[] field306 = new int[16384];

    @OriginalMember(owner = "client", name = "Be", descriptor = "I")
    private int field307 = 78;

    @OriginalMember(owner = "client", name = "Ce", descriptor = "Z")
    private boolean field308 = false;

    @OriginalMember(owner = "client", name = "De", descriptor = "[LGYSQYVEV;")
    public class18[] field309 = new class18[5];

    @OriginalMember(owner = "client", name = "Fe", descriptor = "[J")
    private long[] field311 = new long[200];

    @OriginalMember(owner = "client", name = "Ge", descriptor = "[I")
    private int[] field312 = new int[5];

    @OriginalMember(owner = "client", name = "He", descriptor = "[I")
    private int[] field313 = new int[2000];

    @OriginalMember(owner = "client", name = "Ie", descriptor = "[Ljava/lang/String;")
    private String[] field314 = new String[500];

    @OriginalMember(owner = "client", name = "Je", descriptor = "[LPQKEJITK;")
    private class47[] field315 = new class47[2];

    @OriginalMember(owner = "client", name = "Ve", descriptor = "Ljava/lang/String;")
    private String field327 = "";

    @OriginalMember(owner = "client", name = "Ye", descriptor = "Z")
    private boolean field330 = false;

    @OriginalMember(owner = "client", name = "Ze", descriptor = "Ljava/lang/String;")
    private String field331 = "";

    @OriginalMember(owner = "client", name = "af", descriptor = "Z")
    private boolean field332 = true;

    @OriginalMember(owner = "client", name = "cf", descriptor = "I")
    private int field334 = 1;

    @OriginalMember(owner = "client", name = "kf", descriptor = "[I")
    private int[] field341 = new int[class6.field105];

    @OriginalMember(owner = "client", name = "lf", descriptor = "I")
    private int field342 = -1;

    @OriginalMember(owner = "client", name = "wf", descriptor = "[I")
    private int[] field353 = new int[256];

    @OriginalMember(owner = "client", name = "yf", descriptor = "[I")
    private int[] field355 = new int[100];

    @OriginalMember(owner = "client", name = "zf", descriptor = "[Ljava/lang/String;")
    private String[] field356 = new String[100];

    @OriginalMember(owner = "client", name = "Af", descriptor = "[Ljava/lang/String;")
    private String[] field357 = new String[100];

    @OriginalMember(owner = "client", name = "Bf", descriptor = "[LXANVNPIN;")
    private class65[] field358 = new class65[8];

    @OriginalMember(owner = "client", name = "Ff", descriptor = "I")
    private int field362 = 5063219;

    @OriginalMember(owner = "client", name = "Kf", descriptor = "[J")
    private long[] field367 = new long[100];

    @OriginalMember(owner = "client", name = "Nf", descriptor = "Z")
    private boolean field370 = false;

    @OriginalMember(owner = "client", name = "Of", descriptor = "Z")
    private boolean field371 = false;

    @OriginalMember(owner = "client", name = "Pf", descriptor = "Z")
    private boolean field372 = false;

    @OriginalMember(owner = "client", name = "Rf", descriptor = "Z")
    private boolean field374 = true;

    @OriginalMember(owner = "client", name = "Sf", descriptor = "[LXANVNPIN;")
    private class65[] field375 = new class65[1000];

    @OriginalMember(owner = "client", name = "Tf", descriptor = "Z")
    private boolean field376 = false;

    @OriginalMember(owner = "client", name = "Wf", descriptor = "Z")
    private boolean field379 = false;

    @OriginalMember(owner = "client", name = "ag", descriptor = "Z")
    private boolean field383 = false;

    @OriginalMember(owner = "client", name = "bg", descriptor = "I")
    private int field384 = 3;

    @OriginalMember(owner = "client", name = "cg", descriptor = "[LXANVNPIN;")
    private class65[] field385 = new class65[32];

    @OriginalMember(owner = "client", name = "kg", descriptor = "[B")
    private byte[] field393 = new byte[16384];

    @OriginalMember(owner = "client", name = "ng", descriptor = "Z")
    private boolean field396 = false;

    @OriginalMember(owner = "client", name = "pg", descriptor = "[I")
    private int[] field398 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client", name = "wg", descriptor = "Z")
    private boolean field405 = false;

    @OriginalMember(owner = "client", name = "yg", descriptor = "I")
    private int field407 = 3353893;

    @OriginalMember(owner = "client", name = "zg", descriptor = "I")
    private int field408 = -242;

    @OriginalMember(owner = "client", name = "Cg", descriptor = "I")
    private int field411 = 7759444;

    @OriginalMember(owner = "client", name = "Ng", descriptor = "I")
    private int field422 = 7199;

    @OriginalMember(owner = "client", name = "Og", descriptor = "Z")
    private volatile boolean field423 = false;

    @OriginalMember(owner = "client", name = "Sg", descriptor = "[I")
    private int[] field427 = new int[500];

    @OriginalMember(owner = "client", name = "Tg", descriptor = "[I")
    private int[] field428 = new int[500];

    @OriginalMember(owner = "client", name = "Ug", descriptor = "[I")
    private int[] field429 = new int[500];

    @OriginalMember(owner = "client", name = "Vg", descriptor = "[I")
    private int[] field430 = new int[500];

    @OriginalMember(owner = "client", name = "Wg", descriptor = "Z")
    private boolean field431 = false;

    @OriginalMember(owner = "client", name = "Yg", descriptor = "[[I")
    private int[][] field433 = new int[104][104];

    @OriginalMember(owner = "client", name = "ah", descriptor = "Z")
    private volatile boolean field435 = false;

    @OriginalMember(owner = "client", name = "bh", descriptor = "Z")
    private boolean field436 = false;

    @OriginalMember(owner = "client", name = "ih", descriptor = "[I")
    private final int[] field443 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client", name = "jh", descriptor = "[I")
    private int[] field444 = new int[5];

    @OriginalMember(owner = "client", name = "ph", descriptor = "Z")
    private boolean field450 = false;

    @OriginalMember(owner = "client", name = "vh", descriptor = "I")
    private int field456 = 7;

    @OriginalMember(owner = "client", name = "yh", descriptor = "[I")
    public int[] field459 = new int[1000];

    @OriginalMember(owner = "client", name = "Bh", descriptor = "LDNRIFKTO;")
    private class11 field462 = class11.method177(1, 342);

    @OriginalMember(owner = "client", name = "Ch", descriptor = "Z")
    private boolean field463 = true;

    @OriginalMember(owner = "client", name = "Dh", descriptor = "LLUAMUNXO;")
    private class30 field464 = new class30();

    @OriginalMember(owner = "client", name = "Fh", descriptor = "I")
    private int field466 = 2;

    @OriginalMember(owner = "client", name = "Oh", descriptor = "Z")
    private boolean field475 = false;

    @OriginalMember(owner = "client", name = "Sh", descriptor = "Z")
    private boolean field479 = false;

    @OriginalMember(owner = "client", name = "Th", descriptor = "Ljava/lang/String;")
    private String field480 = "";

    @OriginalMember(owner = "client", name = "Uh", descriptor = "Ljava/lang/String;")
    private String field481 = "";

    @OriginalMember(owner = "client", name = "Vh", descriptor = "[I")
    private int[] field482 = new int[151];

    @OriginalMember(owner = "client", name = "Wh", descriptor = "B")
    private byte field483 = -37;

    @OriginalMember(owner = "client", name = "Xh", descriptor = "[I")
    private int[] field484 = new int[200];

    @OriginalMember(owner = "client", name = "Yh", descriptor = "I")
    private int field485 = -30892;

    @OriginalMember(owner = "client", name = "ai", descriptor = "I")
    private final int field487 = 100;

    @OriginalMember(owner = "client", name = "bi", descriptor = "[I")
    private int[] field488 = new int[100];

    @OriginalMember(owner = "client", name = "ci", descriptor = "I")
    private int field489 = -1;

    @OriginalMember(owner = "client", name = "di", descriptor = "[I")
    private int[] field490 = new int[50];

    @OriginalMember(owner = "client", name = "ei", descriptor = "[I")
    private int[] field491 = new int[9];

    @OriginalMember(owner = "client", name = "fi", descriptor = "LDNRIFKTO;")
    private class11 field492 = class11.method177(1, 342);

    @OriginalMember(owner = "client", name = "hi", descriptor = "Z")
    private boolean field494 = false;

    @OriginalMember(owner = "client", name = "oi", descriptor = "[I")
    private int[] field501 = new int[50];

    @OriginalMember(owner = "client", name = "qi", descriptor = "I")
    private int field503 = -1;

    @OriginalMember(owner = "client", name = "ri", descriptor = "[[[LZCVCEQHJ;")
    private class70[][][] field504 = new class70[4][104][104];

    @OriginalMember(owner = "client", name = "ti", descriptor = "I")
    private int field506 = 1;

    @OriginalMember(owner = "client", name = "vi", descriptor = "Z")
    private boolean field508 = true;

    @OriginalMember(owner = "client", name = "xi", descriptor = "I")
    private int field510 = -1;

    @OriginalMember(owner = "client", name = "Di", descriptor = "[[I")
    private int[][] field516 = new int[104][104];

    @OriginalMember(owner = "client", name = "Hi", descriptor = "B")
    private byte field520 = 6;

    @OriginalMember(owner = "client", name = "Ni", descriptor = "I")
    private int field526 = -1;

    @OriginalMember(owner = "client", name = "Oi", descriptor = "Z")
    private boolean field527 = true;

    @OriginalMember(owner = "client", name = "Pi", descriptor = "Z")
    public boolean field528 = false;

    @OriginalMember(owner = "client", name = "Qi", descriptor = "[I")
    private int[] field529 = new int[4000];

    @OriginalMember(owner = "client", name = "Ri", descriptor = "[I")
    private int[] field530 = new int[4000];

    @OriginalMember(owner = "client", name = "Yi", descriptor = "[I")
    private int[] field537 = new int[151];

    @OriginalMember(owner = "client", name = "Zi", descriptor = "Z")
    private boolean field538 = true;

    @OriginalMember(owner = "client", name = "aj", descriptor = "[I")
    private int[] field539 = new int[33];

    @OriginalMember(owner = "client", name = "bj", descriptor = "Z")
    private boolean field540 = true;

    @OriginalMember(owner = "client", name = "dj", descriptor = "[Ljava/lang/String;")
    private String[] field542 = new String[5];

    @OriginalMember(owner = "client", name = "ej", descriptor = "[Z")
    private boolean[] field543 = new boolean[5];

    @OriginalMember(owner = "client", name = "fj", descriptor = "[I")
    private int[] field544 = new int[class6.field105];

    @OriginalMember(owner = "client", name = "hj", descriptor = "[I")
    private int[] field546 = new int[class6.field105];

    @OriginalMember(owner = "client", name = "jj", descriptor = "I")
    private int field548 = 1;

    @OriginalMember(owner = "client", name = "nj", descriptor = "B")
    private byte field552 = 1;

    @OriginalMember(owner = "client", name = "oj", descriptor = "[I")
    private int[] field553 = new int[5];

    @OriginalMember(owner = "client", name = "qj", descriptor = "I")
    private int field555 = 2048;

    @OriginalMember(owner = "client", name = "rj", descriptor = "I")
    private int field556 = 2047;

    @OriginalMember(owner = "client", name = "sj", descriptor = "[LHHCKFJEO;")
    private class21[] field557 = new class21[this.field555];

    @OriginalMember(owner = "client", name = "uj", descriptor = "[I")
    public int[] field559 = new int[this.field555];

    @OriginalMember(owner = "client", name = "wj", descriptor = "[I")
    private int[] field561 = new int[this.field555];

    @OriginalMember(owner = "client", name = "xj", descriptor = "[LDNRIFKTO;")
    private class11[] field562 = new class11[this.field555];

    @OriginalMember(owner = "client", name = "yj", descriptor = "[LURWDWMOD;")
    private class61[] field563 = new class61[4];

    @OriginalMember(owner = "client", name = "Aj", descriptor = "[LPQKEJITK;")
    private class47[] field565 = new class47[100];

    @OriginalMember(owner = "client", name = "Cj", descriptor = "I")
    private int field567 = -1;

    @OriginalMember(owner = "client", name = "Fj", descriptor = "Z")
    private boolean field570 = false;

    @OriginalMember(owner = "client", name = "Hj", descriptor = "Z")
    private boolean field572 = true;

    @OriginalMember(owner = "client", name = "Tj", descriptor = "I")
    private int field584 = -1;

    @OriginalMember(owner = "client", name = "Uj", descriptor = "I")
    private int field585 = -1;

    @OriginalMember(owner = "client", name = "Wj", descriptor = "Z")
    private boolean field587 = false;

    @OriginalMember(owner = "client", name = "Xj", descriptor = "[I")
    public int[] field588 = new int[2000];

    @OriginalMember(owner = "client", name = "Yj", descriptor = "Z")
    private boolean field589 = false;

    @OriginalMember(owner = "client", name = "Zj", descriptor = "Ljava/lang/String;")
    private String field590 = "";

    @OriginalMember(owner = "client", name = "ak", descriptor = "Z")
    private boolean field591 = true;

    @OriginalMember(owner = "client", name = "bk", descriptor = "Ljava/lang/String;")
    private String field592 = "";

    @OriginalMember(owner = "client", name = "ck", descriptor = "I")
    private int field593 = -31;

    @OriginalMember(owner = "client", name = "dk", descriptor = "B")
    private byte field594 = 5;

    @OriginalMember(owner = "client", name = "ek", descriptor = "I")
    private int field595 = -1;

    @OriginalMember(owner = "client", name = "fk", descriptor = "[LXANVNPIN;")
    private class65[] field596 = new class65[20];

    @OriginalMember(owner = "client", name = "gk", descriptor = "Z")
    private boolean field597 = false;

    @OriginalMember(owner = "client", name = "hk", descriptor = "I")
    private int field598 = -1;

    @OriginalMember(owner = "client", name = "jk", descriptor = "Z")
    private boolean field600 = false;

    @OriginalMember(owner = "client", name = "Gb", descriptor = "I")
    private static int field156 = 662;

    @OriginalMember(owner = "client", name = "bc", descriptor = "I")
    private static int field177 = 5;

    @OriginalMember(owner = "client", name = "Ad", descriptor = "Ljava/lang/String;")
    private static String field254 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @OriginalMember(owner = "client", name = "Td", descriptor = "Z")
    private static boolean field273 = true;

    @OriginalMember(owner = "client", name = "de", descriptor = "I")
    private static int field283 = 10;

    @OriginalMember(owner = "client", name = "fe", descriptor = "Z")
    private static boolean field285 = true;

    @OriginalMember(owner = "client", name = "we", descriptor = "B")
    private static byte field302 = 8;

    @OriginalMember(owner = "client", name = "We", descriptor = "Ljava/math/BigInteger;")
    private static BigInteger field328 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client", name = "Uf", descriptor = "[[I")
    public static final int[][] field377 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client", name = "lg", descriptor = "[I")
    private static int[] field394 = new int[99];

    @OriginalMember(owner = "client", name = "ch", descriptor = "Ljava/math/BigInteger;")
    private static BigInteger field437;

    @OriginalMember(owner = "client", name = "ni", descriptor = "Z")
    private static boolean field500;

    @OriginalMember(owner = "client", name = "yi", descriptor = "[I")
    public static final int[] field511;

    @OriginalMember(owner = "client", name = "Gi", descriptor = "B")
    private static byte field519;

    @OriginalMember(owner = "client", name = "cj", descriptor = "I")
    private static int field541;

    @OriginalMember(owner = "client", name = "pj", descriptor = "[I")
    public static int[] field554;

    @OriginalMember(owner = "client", name = "Dj", descriptor = "B")
    private static byte field568;

    @OriginalMember(owner = "client", name = "Nj", descriptor = "I")
    private static int field578;

    @OriginalMember(owner = "client", name = "L", descriptor = "I")
    private int field109;

    @OriginalMember(owner = "client", name = "W", descriptor = "I")
    private int field120;

    @OriginalMember(owner = "client", name = "Z", descriptor = "I")
    private int field123;

    @OriginalMember(owner = "client", name = "ab", descriptor = "I")
    private int field124;

    @OriginalMember(owner = "client", name = "db", descriptor = "I")
    private int field127;

    @OriginalMember(owner = "client", name = "eb", descriptor = "I")
    private int field128;

    @OriginalMember(owner = "client", name = "fb", descriptor = "I")
    private int field129;

    @OriginalMember(owner = "client", name = "gb", descriptor = "I")
    private int field130;

    @OriginalMember(owner = "client", name = "hb", descriptor = "I")
    private int field131;

    @OriginalMember(owner = "client", name = "jb", descriptor = "I")
    private int field133;

    @OriginalMember(owner = "client", name = "wb", descriptor = "I")
    private int field146;

    @OriginalMember(owner = "client", name = "xb", descriptor = "I")
    private int field147;

    @OriginalMember(owner = "client", name = "zb", descriptor = "I")
    private int field149;

    @OriginalMember(owner = "client", name = "Ab", descriptor = "I")
    private int field150;

    @OriginalMember(owner = "client", name = "Bb", descriptor = "I")
    private int field151;

    @OriginalMember(owner = "client", name = "Cb", descriptor = "I")
    private int field152;

    @OriginalMember(owner = "client", name = "Db", descriptor = "I")
    private int field153;

    @OriginalMember(owner = "client", name = "Fb", descriptor = "I")
    private int field155;

    @OriginalMember(owner = "client", name = "Jb", descriptor = "I")
    private int field159;

    @OriginalMember(owner = "client", name = "Pb", descriptor = "I")
    private int field165;

    @OriginalMember(owner = "client", name = "Sb", descriptor = "I")
    private int field168;

    @OriginalMember(owner = "client", name = "Vb", descriptor = "I")
    private int field171;

    @OriginalMember(owner = "client", name = "Wb", descriptor = "I")
    private int field172;

    @OriginalMember(owner = "client", name = "dc", descriptor = "I")
    private int field179;

    @OriginalMember(owner = "client", name = "ec", descriptor = "I")
    private static int field180;

    @OriginalMember(owner = "client", name = "fc", descriptor = "I")
    private int field181;

    @OriginalMember(owner = "client", name = "gc", descriptor = "I")
    private static int field182;

    @OriginalMember(owner = "client", name = "hc", descriptor = "I")
    private int field183;

    @OriginalMember(owner = "client", name = "ic", descriptor = "I")
    private int field184;

    @OriginalMember(owner = "client", name = "jc", descriptor = "I")
    private int field185;

    @OriginalMember(owner = "client", name = "mc", descriptor = "I")
    private int field188;

    @OriginalMember(owner = "client", name = "nc", descriptor = "I")
    public int field189;

    @OriginalMember(owner = "client", name = "oc", descriptor = "I")
    public int field190;

    @OriginalMember(owner = "client", name = "rc", descriptor = "I")
    private int field193;

    @OriginalMember(owner = "client", name = "Bc", descriptor = "I")
    private int field203;

    @OriginalMember(owner = "client", name = "Fc", descriptor = "I")
    private int field207;

    @OriginalMember(owner = "client", name = "Gc", descriptor = "I")
    private int field208;

    @OriginalMember(owner = "client", name = "Hc", descriptor = "I")
    private int field209;

    @OriginalMember(owner = "client", name = "Qc", descriptor = "I")
    private int field218;

    @OriginalMember(owner = "client", name = "Sc", descriptor = "I")
    private int field220;

    @OriginalMember(owner = "client", name = "Yc", descriptor = "I")
    private int field226;

    @OriginalMember(owner = "client", name = "fd", descriptor = "I")
    private int field233;

    @OriginalMember(owner = "client", name = "gd", descriptor = "I")
    private static int field234;

    @OriginalMember(owner = "client", name = "ld", descriptor = "I")
    public int field239;

    @OriginalMember(owner = "client", name = "vd", descriptor = "I")
    private int field249;

    @OriginalMember(owner = "client", name = "wd", descriptor = "I")
    private int field250;

    @OriginalMember(owner = "client", name = "xd", descriptor = "I")
    private int field251;

    @OriginalMember(owner = "client", name = "yd", descriptor = "I")
    private int field252;

    @OriginalMember(owner = "client", name = "zd", descriptor = "I")
    private int field253;

    @OriginalMember(owner = "client", name = "Bd", descriptor = "I")
    private int field255;

    @OriginalMember(owner = "client", name = "Fd", descriptor = "I")
    private int field259;

    @OriginalMember(owner = "client", name = "Ld", descriptor = "I")
    private int field265;

    @OriginalMember(owner = "client", name = "Sd", descriptor = "I")
    private int field272;

    @OriginalMember(owner = "client", name = "ae", descriptor = "I")
    private int field280;

    @OriginalMember(owner = "client", name = "ee", descriptor = "I")
    public static int field284;

    @OriginalMember(owner = "client", name = "je", descriptor = "I")
    private int field289;

    @OriginalMember(owner = "client", name = "le", descriptor = "I")
    private static int field291;

    @OriginalMember(owner = "client", name = "ne", descriptor = "I")
    private int field293;

    @OriginalMember(owner = "client", name = "qe", descriptor = "I")
    private int field296;

    @OriginalMember(owner = "client", name = "re", descriptor = "I")
    private static int field297;

    @OriginalMember(owner = "client", name = "se", descriptor = "I")
    private int field298;

    @OriginalMember(owner = "client", name = "te", descriptor = "I")
    private int field299;

    @OriginalMember(owner = "client", name = "ue", descriptor = "I")
    private static int field300;

    @OriginalMember(owner = "client", name = "ze", descriptor = "I")
    private int field305;

    @OriginalMember(owner = "client", name = "Ee", descriptor = "I")
    private static int field310;

    @OriginalMember(owner = "client", name = "Le", descriptor = "I")
    private static int field317;

    @OriginalMember(owner = "client", name = "Qe", descriptor = "I")
    private int field322;

    @OriginalMember(owner = "client", name = "Re", descriptor = "I")
    private int field323;

    @OriginalMember(owner = "client", name = "Se", descriptor = "I")
    private int field324;

    @OriginalMember(owner = "client", name = "Te", descriptor = "I")
    private int field325;

    @OriginalMember(owner = "client", name = "Ue", descriptor = "I")
    private int field326;

    @OriginalMember(owner = "client", name = "Xe", descriptor = "I")
    private int field329;

    @OriginalMember(owner = "client", name = "bf", descriptor = "I")
    private int field333;

    @OriginalMember(owner = "client", name = "df", descriptor = "I")
    private int field335;

    @OriginalMember(owner = "client", name = "ef", descriptor = "I")
    private int field336;

    @OriginalMember(owner = "client", name = "ff", descriptor = "I")
    private int field337;

    @OriginalMember(owner = "client", name = "gf", descriptor = "I")
    private int field338;

    @OriginalMember(owner = "client", name = "hf", descriptor = "I")
    private int field339;

    @OriginalMember(owner = "client", name = "jf", descriptor = "I")
    private int field340;

    @OriginalMember(owner = "client", name = "mf", descriptor = "I")
    private int field343;

    @OriginalMember(owner = "client", name = "nf", descriptor = "I")
    private int field344;

    @OriginalMember(owner = "client", name = "of", descriptor = "I")
    private int field345;

    @OriginalMember(owner = "client", name = "pf", descriptor = "I")
    private int field346;

    @OriginalMember(owner = "client", name = "qf", descriptor = "I")
    private int field347;

    @OriginalMember(owner = "client", name = "rf", descriptor = "I")
    private int field348;

    @OriginalMember(owner = "client", name = "sf", descriptor = "I")
    private int field349;

    @OriginalMember(owner = "client", name = "tf", descriptor = "I")
    private int field350;

    @OriginalMember(owner = "client", name = "uf", descriptor = "I")
    private static int field351;

    @OriginalMember(owner = "client", name = "vf", descriptor = "I")
    private int field352;

    @OriginalMember(owner = "client", name = "xf", descriptor = "I")
    private int field354;

    @OriginalMember(owner = "client", name = "Cf", descriptor = "I")
    private int field359;

    @OriginalMember(owner = "client", name = "Df", descriptor = "I")
    private int field360;

    @OriginalMember(owner = "client", name = "Ef", descriptor = "I")
    private int field361;

    @OriginalMember(owner = "client", name = "Gf", descriptor = "I")
    private int field363;

    @OriginalMember(owner = "client", name = "Hf", descriptor = "I")
    private int field364;

    @OriginalMember(owner = "client", name = "Lf", descriptor = "I")
    private int field368;

    @OriginalMember(owner = "client", name = "Mf", descriptor = "I")
    private static int field369;

    @OriginalMember(owner = "client", name = "Qf", descriptor = "I")
    private int field373;

    @OriginalMember(owner = "client", name = "Vf", descriptor = "I")
    private int field378;

    @OriginalMember(owner = "client", name = "Xf", descriptor = "I")
    private int field380;

    @OriginalMember(owner = "client", name = "Yf", descriptor = "I")
    private static int field381;

    @OriginalMember(owner = "client", name = "Zf", descriptor = "I")
    private static int field382;

    @OriginalMember(owner = "client", name = "dg", descriptor = "I")
    private int field386;

    @OriginalMember(owner = "client", name = "eg", descriptor = "I")
    private static int field387;

    @OriginalMember(owner = "client", name = "jg", descriptor = "I")
    private int field392;

    @OriginalMember(owner = "client", name = "mg", descriptor = "I")
    private int field395;

    @OriginalMember(owner = "client", name = "og", descriptor = "I")
    private int field397;

    @OriginalMember(owner = "client", name = "qg", descriptor = "I")
    private int field399;

    @OriginalMember(owner = "client", name = "rg", descriptor = "I")
    private int field400;

    @OriginalMember(owner = "client", name = "sg", descriptor = "I")
    private int field401;

    @OriginalMember(owner = "client", name = "tg", descriptor = "I")
    private int field402;

    @OriginalMember(owner = "client", name = "ug", descriptor = "I")
    private int field403;

    @OriginalMember(owner = "client", name = "vg", descriptor = "I")
    private int field404;

    @OriginalMember(owner = "client", name = "xg", descriptor = "I")
    public static int field406;

    @OriginalMember(owner = "client", name = "Ag", descriptor = "I")
    private int field409;

    @OriginalMember(owner = "client", name = "Bg", descriptor = "I")
    private int field410;

    @OriginalMember(owner = "client", name = "Dg", descriptor = "I")
    private int field412;

    @OriginalMember(owner = "client", name = "Pg", descriptor = "I")
    private int field424;

    @OriginalMember(owner = "client", name = "Qg", descriptor = "I")
    private int field425;

    @OriginalMember(owner = "client", name = "Xg", descriptor = "I")
    private static int field432;

    @OriginalMember(owner = "client", name = "dh", descriptor = "I")
    public static int field438;

    @OriginalMember(owner = "client", name = "rh", descriptor = "I")
    private int field452;

    @OriginalMember(owner = "client", name = "sh", descriptor = "I")
    private int field453;

    @OriginalMember(owner = "client", name = "uh", descriptor = "I")
    private int field455;

    @OriginalMember(owner = "client", name = "xh", descriptor = "I")
    private int field458;

    @OriginalMember(owner = "client", name = "Ah", descriptor = "I")
    private int field461;

    @OriginalMember(owner = "client", name = "Eh", descriptor = "I")
    private int field465;

    @OriginalMember(owner = "client", name = "Gh", descriptor = "I")
    private int field467;

    @OriginalMember(owner = "client", name = "Hh", descriptor = "I")
    private int field468;

    @OriginalMember(owner = "client", name = "Ih", descriptor = "I")
    private int field469;

    @OriginalMember(owner = "client", name = "Jh", descriptor = "I")
    private int field470;

    @OriginalMember(owner = "client", name = "Kh", descriptor = "I")
    private int field471;

    @OriginalMember(owner = "client", name = "Lh", descriptor = "I")
    private int field472;

    @OriginalMember(owner = "client", name = "Mh", descriptor = "I")
    private static int field473;

    @OriginalMember(owner = "client", name = "Nh", descriptor = "I")
    private int field474;

    @OriginalMember(owner = "client", name = "Ph", descriptor = "I")
    private int field476;

    @OriginalMember(owner = "client", name = "Qh", descriptor = "I")
    private int field477;

    @OriginalMember(owner = "client", name = "Rh", descriptor = "I")
    private int field478;

    @OriginalMember(owner = "client", name = "Zh", descriptor = "I")
    private int field486;

    @OriginalMember(owner = "client", name = "gi", descriptor = "I")
    private int field493;

    @OriginalMember(owner = "client", name = "ii", descriptor = "I")
    private int field495;

    @OriginalMember(owner = "client", name = "ji", descriptor = "I")
    private int field496;

    @OriginalMember(owner = "client", name = "ki", descriptor = "I")
    private int field497;

    @OriginalMember(owner = "client", name = "li", descriptor = "I")
    private int field498;

    @OriginalMember(owner = "client", name = "pi", descriptor = "I")
    private int field502;

    @OriginalMember(owner = "client", name = "si", descriptor = "I")
    private static int field505;

    @OriginalMember(owner = "client", name = "ui", descriptor = "I")
    private int field507;

    @OriginalMember(owner = "client", name = "wi", descriptor = "I")
    private static int field509;

    @OriginalMember(owner = "client", name = "zi", descriptor = "I")
    private int field512;

    @OriginalMember(owner = "client", name = "Ai", descriptor = "I")
    private int field513;

    @OriginalMember(owner = "client", name = "Bi", descriptor = "I")
    private int field514;

    @OriginalMember(owner = "client", name = "Ci", descriptor = "I")
    private int field515;

    @OriginalMember(owner = "client", name = "Ii", descriptor = "I")
    private int field521;

    @OriginalMember(owner = "client", name = "Ji", descriptor = "I")
    private int field522;

    @OriginalMember(owner = "client", name = "Ki", descriptor = "I")
    private int field523;

    @OriginalMember(owner = "client", name = "Li", descriptor = "I")
    private int field524;

    @OriginalMember(owner = "client", name = "Mi", descriptor = "I")
    private int field525;

    @OriginalMember(owner = "client", name = "Xi", descriptor = "I")
    private int field536;

    @OriginalMember(owner = "client", name = "ij", descriptor = "I")
    private int field547;

    @OriginalMember(owner = "client", name = "kj", descriptor = "I")
    private int field549;

    @OriginalMember(owner = "client", name = "tj", descriptor = "I")
    private int field558;

    @OriginalMember(owner = "client", name = "vj", descriptor = "I")
    private int field560;

    @OriginalMember(owner = "client", name = "zj", descriptor = "I")
    private int field564;

    @OriginalMember(owner = "client", name = "Bj", descriptor = "I")
    private int field566;

    @OriginalMember(owner = "client", name = "Ej", descriptor = "I")
    private int field569;

    @OriginalMember(owner = "client", name = "Gj", descriptor = "I")
    private int field571;

    @OriginalMember(owner = "client", name = "Ij", descriptor = "I")
    private int field573;

    @OriginalMember(owner = "client", name = "Kj", descriptor = "I")
    private static int field575;

    @OriginalMember(owner = "client", name = "Lj", descriptor = "I")
    private int field576;

    @OriginalMember(owner = "client", name = "Mj", descriptor = "I")
    private int field577;

    @OriginalMember(owner = "client", name = "Oj", descriptor = "I")
    private int field579;

    @OriginalMember(owner = "client", name = "Pj", descriptor = "I")
    private int field580;

    @OriginalMember(owner = "client", name = "Qj", descriptor = "I")
    private int field581;

    @OriginalMember(owner = "client", name = "Rj", descriptor = "I")
    private int field582;

    @OriginalMember(owner = "client", name = "Sj", descriptor = "I")
    private int field583;

    @OriginalMember(owner = "client", name = "ik", descriptor = "I")
    private int field599;

    @OriginalMember(owner = "client", name = "kk", descriptor = "I")
    private int field601;

    @OriginalMember(owner = "client", name = "lk", descriptor = "I")
    public static int field602;

    @OriginalMember(owner = "client", name = "lc", descriptor = "J")
    private long field187;

    @OriginalMember(owner = "client", name = "Tc", descriptor = "J")
    private long field221;

    @OriginalMember(owner = "client", name = "ie", descriptor = "J")
    private long field288;

    @OriginalMember(owner = "client", name = "Zg", descriptor = "J")
    public long field434;

    @OriginalMember(owner = "client", name = "qh", descriptor = "J")
    private long field451;

    @OriginalMember(owner = "client", name = "lh", descriptor = "LEOVZRNPE;")
    private class13 field446;

    @OriginalMember(owner = "client", name = "mh", descriptor = "LEOVZRNPE;")
    private class13 field447;

    @OriginalMember(owner = "client", name = "nh", descriptor = "LEOVZRNPE;")
    private class13 field448;

    @OriginalMember(owner = "client", name = "oh", descriptor = "LEOVZRNPE;")
    private class13 field449;

    @OriginalMember(owner = "client", name = "Ac", descriptor = "LFNOQZAYQ;")
    private class14 field202;

    @OriginalMember(owner = "client", name = "zh", descriptor = "LGOLMSHHL;")
    private class17 field460;

    @OriginalMember(owner = "client", name = "Wd", descriptor = "LHHCKFJEO;")
    public static class21 field276;

    @OriginalMember(owner = "client", name = "Eb", descriptor = "LMWSOISVX;")
    private class35 field154;

    @OriginalMember(owner = "client", name = "Pe", descriptor = "LOAGIEZRU;")
    private class42 field321;

    @OriginalMember(owner = "client", name = "yc", descriptor = "LPQKEJITK;")
    private class47 field200;

    @OriginalMember(owner = "client", name = "zc", descriptor = "LPQKEJITK;")
    private class47 field201;

    @OriginalMember(owner = "client", name = "id", descriptor = "LPQKEJITK;")
    private class47 field236;

    @OriginalMember(owner = "client", name = "jd", descriptor = "LPQKEJITK;")
    private class47 field237;

    @OriginalMember(owner = "client", name = "kd", descriptor = "LPQKEJITK;")
    private class47 field238;

    @OriginalMember(owner = "client", name = "Me", descriptor = "LPQKEJITK;")
    private class47 field318;

    @OriginalMember(owner = "client", name = "Ne", descriptor = "LPQKEJITK;")
    private class47 field319;

    @OriginalMember(owner = "client", name = "Oe", descriptor = "LPQKEJITK;")
    private class47 field320;

    @OriginalMember(owner = "client", name = "If", descriptor = "LPQKEJITK;")
    private class47 field365;

    @OriginalMember(owner = "client", name = "Jf", descriptor = "LPQKEJITK;")
    private class47 field366;

    @OriginalMember(owner = "client", name = "Eg", descriptor = "LPQKEJITK;")
    private class47 field413;

    @OriginalMember(owner = "client", name = "Fg", descriptor = "LPQKEJITK;")
    private class47 field414;

    @OriginalMember(owner = "client", name = "Gg", descriptor = "LPQKEJITK;")
    private class47 field415;

    @OriginalMember(owner = "client", name = "Hg", descriptor = "LPQKEJITK;")
    private class47 field416;

    @OriginalMember(owner = "client", name = "Ig", descriptor = "LPQKEJITK;")
    private class47 field417;

    @OriginalMember(owner = "client", name = "Si", descriptor = "LPQKEJITK;")
    private class47 field531;

    @OriginalMember(owner = "client", name = "Ti", descriptor = "LPQKEJITK;")
    private class47 field532;

    @OriginalMember(owner = "client", name = "Ui", descriptor = "LPQKEJITK;")
    private class47 field533;

    @OriginalMember(owner = "client", name = "Vi", descriptor = "LPQKEJITK;")
    private class47 field534;

    @OriginalMember(owner = "client", name = "Wi", descriptor = "LPQKEJITK;")
    private class47 field535;

    @OriginalMember(owner = "client", name = "mb", descriptor = "LTRQPVNER;")
    private class57 field136;

    @OriginalMember(owner = "client", name = "nb", descriptor = "LTRQPVNER;")
    private class57 field137;

    @OriginalMember(owner = "client", name = "ob", descriptor = "LTRQPVNER;")
    private class57 field138;

    @OriginalMember(owner = "client", name = "pb", descriptor = "LTRQPVNER;")
    private class57 field139;

    @OriginalMember(owner = "client", name = "qb", descriptor = "LTRQPVNER;")
    private class57 field140;

    @OriginalMember(owner = "client", name = "rb", descriptor = "LTRQPVNER;")
    private class57 field141;

    @OriginalMember(owner = "client", name = "sb", descriptor = "LTRQPVNER;")
    private class57 field142;

    @OriginalMember(owner = "client", name = "tb", descriptor = "LTRQPVNER;")
    private class57 field143;

    @OriginalMember(owner = "client", name = "ub", descriptor = "LTRQPVNER;")
    private class57 field144;

    @OriginalMember(owner = "client", name = "Nc", descriptor = "LTRQPVNER;")
    private class57 field215;

    @OriginalMember(owner = "client", name = "Oc", descriptor = "LTRQPVNER;")
    private class57 field216;

    @OriginalMember(owner = "client", name = "Pc", descriptor = "LTRQPVNER;")
    private class57 field217;

    @OriginalMember(owner = "client", name = "md", descriptor = "LTRQPVNER;")
    private class57 field240;

    @OriginalMember(owner = "client", name = "nd", descriptor = "LTRQPVNER;")
    private class57 field241;

    @OriginalMember(owner = "client", name = "od", descriptor = "LTRQPVNER;")
    private class57 field242;

    @OriginalMember(owner = "client", name = "pd", descriptor = "LTRQPVNER;")
    private class57 field243;

    @OriginalMember(owner = "client", name = "qd", descriptor = "LTRQPVNER;")
    private class57 field244;

    @OriginalMember(owner = "client", name = "rd", descriptor = "LTRQPVNER;")
    private class57 field245;

    @OriginalMember(owner = "client", name = "sd", descriptor = "LTRQPVNER;")
    private class57 field246;

    @OriginalMember(owner = "client", name = "td", descriptor = "LTRQPVNER;")
    private class57 field247;

    @OriginalMember(owner = "client", name = "ud", descriptor = "LTRQPVNER;")
    private class57 field248;

    @OriginalMember(owner = "client", name = "fg", descriptor = "LTRQPVNER;")
    private class57 field388;

    @OriginalMember(owner = "client", name = "gg", descriptor = "LTRQPVNER;")
    private class57 field389;

    @OriginalMember(owner = "client", name = "hg", descriptor = "LTRQPVNER;")
    private class57 field390;

    @OriginalMember(owner = "client", name = "ig", descriptor = "LTRQPVNER;")
    private class57 field391;

    @OriginalMember(owner = "client", name = "Lb", descriptor = "LXANVNPIN;")
    private class65 field161;

    @OriginalMember(owner = "client", name = "Mb", descriptor = "LXANVNPIN;")
    private class65 field162;

    @OriginalMember(owner = "client", name = "ad", descriptor = "LXANVNPIN;")
    private class65 field228;

    @OriginalMember(owner = "client", name = "bd", descriptor = "LXANVNPIN;")
    private class65 field229;

    @OriginalMember(owner = "client", name = "cd", descriptor = "LXANVNPIN;")
    private class65 field230;

    @OriginalMember(owner = "client", name = "dd", descriptor = "LXANVNPIN;")
    private class65 field231;

    @OriginalMember(owner = "client", name = "ed", descriptor = "LXANVNPIN;")
    private class65 field232;

    @OriginalMember(owner = "client", name = "Rg", descriptor = "LXANVNPIN;")
    private class65 field426;

    @OriginalMember(owner = "client", name = "kh", descriptor = "LXANVNPIN;")
    private class65 field445;

    @OriginalMember(owner = "client", name = "Ei", descriptor = "LXANVNPIN;")
    private class65 field517;

    @OriginalMember(owner = "client", name = "Fi", descriptor = "LXANVNPIN;")
    private class65 field518;

    @OriginalMember(owner = "client", name = "lj", descriptor = "LXANVNPIN;")
    private class65 field550;

    @OriginalMember(owner = "client", name = "mj", descriptor = "LXANVNPIN;")
    private class65 field551;

    @OriginalMember(owner = "client", name = "Jj", descriptor = "LXANVNPIN;")
    private class65 field574;

    @OriginalMember(owner = "client", name = "Vj", descriptor = "LXANVNPIN;")
    private class65 field586;

    @OriginalMember(owner = "client", name = "X", descriptor = "LXSMXYXEY;")
    private class68 field121;

    @OriginalMember(owner = "client", name = "Mc", descriptor = "LCNFMYDSL;")
    public class7 field214;

    @OriginalMember(owner = "client", name = "kc", descriptor = "Ljava/lang/String;")
    public String field186;

    @OriginalMember(owner = "client", name = "pc", descriptor = "Ljava/lang/String;")
    private String field191;

    @OriginalMember(owner = "client", name = "Vc", descriptor = "Ljava/lang/String;")
    private String field223;

    @OriginalMember(owner = "client", name = "mi", descriptor = "Ljava/lang/String;")
    public String field499;

    @OriginalMember(owner = "client", name = "me", descriptor = "Ljava/net/Socket;")
    private Socket field292;

    @OriginalMember(owner = "client", name = "V", descriptor = "Z")
    public static boolean field119;

    @OriginalMember(owner = "client", name = "Jd", descriptor = "Z")
    public static boolean field263;

    @OriginalMember(owner = "client", name = "ge", descriptor = "Z")
    private static boolean field286;

    @OriginalMember(owner = "client", name = "Ke", descriptor = "Z")
    private static boolean field316;

    @OriginalMember(owner = "client", name = "bb", descriptor = "[I")
    private int[] field125;

    @OriginalMember(owner = "client", name = "cb", descriptor = "[I")
    private int[] field126;

    @OriginalMember(owner = "client", name = "Xb", descriptor = "[I")
    private int[] field173;

    @OriginalMember(owner = "client", name = "Yb", descriptor = "[I")
    private int[] field174;

    @OriginalMember(owner = "client", name = "Zb", descriptor = "[I")
    private int[] field175;

    @OriginalMember(owner = "client", name = "ac", descriptor = "[I")
    private int[] field176;

    @OriginalMember(owner = "client", name = "Pd", descriptor = "[I")
    private int[] field269;

    @OriginalMember(owner = "client", name = "Qd", descriptor = "[I")
    private int[] field270;

    @OriginalMember(owner = "client", name = "Rd", descriptor = "[I")
    private int[] field271;

    @OriginalMember(owner = "client", name = "Lg", descriptor = "[I")
    private int[] field420;

    @OriginalMember(owner = "client", name = "Mg", descriptor = "[I")
    private int[] field421;

    @OriginalMember(owner = "client", name = "eh", descriptor = "[I")
    private int[] field439;

    @OriginalMember(owner = "client", name = "fh", descriptor = "[I")
    private int[] field440;

    @OriginalMember(owner = "client", name = "gh", descriptor = "[I")
    private int[] field441;

    @OriginalMember(owner = "client", name = "hh", descriptor = "[I")
    private int[] field442;

    @OriginalMember(owner = "client", name = "gj", descriptor = "[LPQKEJITK;")
    private class47[] field545;

    @OriginalMember(owner = "client", name = "th", descriptor = "[[B")
    private byte[][] field454;

    @OriginalMember(owner = "client", name = "wh", descriptor = "[[B")
    private byte[][] field457;

    @OriginalMember(owner = "client", name = "Jg", descriptor = "[[[B")
    private byte[][][] field418;

    @OriginalMember(owner = "client", name = "Kg", descriptor = "[[[I")
    private int[][][] field419;

    @OriginalMember(owner = "client", name = "c", descriptor = "(I)V")
    public final void method24(int arg0) {
        Graphics var2 = this.method73((byte) 0).getGraphics();
        var2.setColor(Color.black);
        var2.fillRect(0, 0, 765, 503);
        if (arg0 < 1 || arg0 > 1) {
            field156 = this.field460.method256();
        }
        this.method300(1, 0);
        if (this.field405) {
            this.field435 = false;
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
        if (this.field227) {
            this.field435 = false;
            var2.setFont(new Font("Helvetica", 1, 20));
            var2.setColor(Color.white);
            var2.drawString("Error - unable to load game!", 50, 50);
            var2.drawString("To play RuneScape make sure you play from", 50, 100);
            var2.drawString("http://www.runescape.com", 50, 150);
        }
        if (this.field370) {
            this.field435 = false;
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

    @OriginalMember(owner = "client", name = "init", descriptor = "()V")
    public final void init() {
        field283 = Integer.parseInt(this.getParameter("nodeid"));
        field284 = Integer.parseInt(this.getParameter("portoff"));
        String var1 = this.getParameter("lowmem");
        if (var1 != null && var1.equals("1")) {
            method95((byte) 127);
        } else {
            method85(-42665);
        }
        String var2 = this.getParameter("free");
        if (var2 != null && var2.equals("1")) {
            field285 = false;
        } else {
            field285 = true;
        }
        this.method298(503, field273, 765);
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BLLUAMUNXO;)Z")
    public final boolean method25(byte arg0, class30 arg1) {
        int var3 = arg1.field963;
        if (arg0 != 2) {
            this.field179 = -91;
        }
        if ((var3 < 1 || var3 > 200) && (var3 < 701 || var3 > 900)) {
            if (var3 >= 401 && var3 <= 500) {
                this.field314[this.field601] = "Remove @whi@" + arg1.field1003;
                this.field429[this.field601] = 156;
                ++this.field601;
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
            this.field314[this.field601] = "Remove @whi@" + this.field134[var3];
            this.field429[this.field601] = 942;
            ++this.field601;
            this.field314[this.field601] = "Message @whi@" + this.field134[var3];
            this.field429[this.field601] = 765;
            ++this.field601;
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZILDNRIFKTO;)V")
    private final void method26(boolean arg0, int arg1, class11 arg2) {
        this.field528 &= arg0;
        arg2.method199((byte) 113);
        int var4 = arg2.method200(5, 1);
        if (var4 != 0) {
            int var5 = arg2.method200(5, 2);
            if (var5 == 0) {
                this.field561[this.field560++] = this.field556;
            } else if (var5 == 1) {
                int var6 = arg2.method200(5, 3);
                field276.method19(true, var6, false);
                int var7 = arg2.method200(5, 1);
                if (var7 == 1) {
                    this.field561[this.field560++] = this.field556;
                }
            } else if (var5 == 2) {
                int var8 = arg2.method200(5, 3);
                field276.method19(true, var8, true);
                int var9 = arg2.method200(5, 3);
                field276.method19(true, var9, true);
                int var10 = arg2.method200(5, 1);
                if (var10 == 1) {
                    this.field561[this.field560++] = this.field556;
                }
            } else if (var5 == 3) {
                int var11 = arg2.method200(5, 1);
                if (var11 == 1) {
                    this.field561[this.field560++] = this.field556;
                }
                int var12 = arg2.method200(5, 7);
                int var13 = arg2.method200(5, 1);
                int var14 = arg2.method200(5, 7);
                this.field326 = arg2.method200(5, 2);
                field276.method22(var12, var14, var13 == 1, -824);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILjava/lang/String;I)V")
    public final void method27(int arg0, String arg1, int arg2) {
        this.field380 = arg0;
        this.field191 = arg1;
        this.method88((byte) 1);
        if (this.field202 == null) {
            super.method27(arg0, arg1, -211);
        } else {
            this.field242.method455(0);
            short var4 = 360;
            short var5 = 200;
            byte var6 = 20;
            this.field448.method230(16777215, var4 / 2, "RuneScape is loading - please wait...", (byte) -90, var5 / 2 - 26 - var6);
            int var7 = var5 / 2 - 18 - var6;
            class62.method518(34, this.field261, var4 / 2 - 152, 9179409, 304, var7);
            class62.method518(32, this.field261, var4 / 2 - 151, 0, 302, var7 + 1);
            class62.method517(30, 9179409, var4 / 2 - 150, arg0 * 3, this.field597, var7 + 2);
            class62.method517(30, 0, arg0 * 3 + (var4 / 2 - 150), 300 - arg0 * 3, this.field597, var7 + 2);
            this.field448.method230(16777215, var4 / 2, arg1, (byte) -90, var5 / 2 + 5 - var6);
            while (arg2 >= 0) {
                this.field374 = !this.field374;
            }
            this.field242.method456(202, 722, super.field905, 171);
            if (this.field379) {
                this.field379 = false;
                if (!this.field435) {
                    this.field243.method456(0, 722, super.field905, 0);
                    this.field244.method456(637, 722, super.field905, 0);
                }
                this.field240.method456(128, 722, super.field905, 0);
                this.field241.method456(202, 722, super.field905, 371);
                this.field245.method456(0, 722, super.field905, 265);
                this.field246.method456(562, 722, super.field905, 265);
                this.field247.method456(128, 722, super.field905, 171);
                this.field248.method456(562, 722, super.field905, 171);
            }
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(I)V")
    public final void method28(int arg0) {
        int var2 = 5;
        this.field491[8] = 0;
        int var3 = 0;
        int var4 = 23 / arg0;
        while (this.field491[8] == 0) {
            String var5 = "Unknown problem";
            this.method27(20, "Connecting to web server", -211);
            try {
                DataInputStream var6 = this.method162("crc" + (int) (Math.random() * 9.9999999E7D) + "-" + 336);
                class11 var7 = new class11(new byte[40], field500);
                var6.readFully(var7.field642, 0, 40);
                var6.close();
                for (int var8 = 0; var8 < 9; ++var8) {
                    this.field491[var8] = var7.method194();
                }
                int var9 = var7.method194();
                int var10 = 1234;
                for (int var11 = 0; var11 < 9; ++var11) {
                    var10 = (var10 << 1) + this.field491[var11];
                }
                if (var9 != var10) {
                    var5 = "checksum problem";
                    this.field491[8] = 0;
                }
            } catch (EOFException var14) {
                var5 = "EOF problem";
                this.field491[8] = 0;
            } catch (IOException var15) {
                var5 = "connection problem";
                this.field491[8] = 0;
            } catch (Exception var16) {
                var5 = "logic problem";
                this.field491[8] = 0;
                if (!signlink.reporterror) {
                    return;
                }
            }
            if (this.field491[8] == 0) {
                ++var3;
                for (int var12 = var2; var12 > 0; --var12) {
                    if (var3 >= 10) {
                        this.method27(10, "Game updated - please reload page", -211);
                        var12 = 10;
                    } else {
                        this.method27(10, var5 + " - Will retry in " + var12 + " secs.", -211);
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
                this.field157 = !this.field157;
            }
        }
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(I)Ljava/net/Socket;")
    public final Socket method29(int arg0) throws IOException {
        return signlink.mainapp != null ? signlink.opensocket(arg0) : new Socket(InetAddress.getByName(this.getCodeBase().getHost()), arg0);
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BIII)Z")
    public final boolean method30(byte arg0, int arg1, int arg2, int arg3) {
        int var5 = arg2 >> 14 & 32767;
        if (arg0 == 2) {
            boolean var6 = false;
        } else {
            this.method93();
        }
        int var7 = this.field121.method568(this.field326, arg1, arg3, arg2);
        if (var7 == -1) {
            return false;
        } else {
            int var8 = var7 & 31;
            int var9 = var7 >> 6 & 3;
            if (var8 != 10 && var8 != 11 && var8 != 22) {
                this.method46(field276.field89[0], 0, false, arg1, var9, arg3, 0, 0, -36, var8 + 1, field276.field88[0], 2);
            } else {
                class56 var10 = class56.method445(var5);
                int var11;
                int var12;
                if (var9 != 0 && var9 != 2) {
                    var11 = var10.field1426;
                    var12 = var10.field1427;
                } else {
                    var11 = var10.field1427;
                    var12 = var10.field1426;
                }
                int var13 = var10.field1405;
                if (var9 != 0) {
                    var13 = (var13 >> 4 - var9) + (var13 << var9 & 15);
                }
                this.method46(field276.field89[0], var11, false, arg1, 0, arg3, var12, var13, -36, 0, field276.field88[0], 2);
            }
            this.field127 = super.field920;
            this.field128 = super.field921;
            this.field130 = 2;
            this.field129 = 0;
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(B)V")
    public final void method31(byte arg0) {
        int var2 = this.field448.method232("Choose Option", 410);
        for (int var3 = 0; var3 < this.field601; ++var3) {
            int var11 = this.field448.method232(this.field314[var3], 410);
            if (var11 > var2) {
                var2 = var11;
            }
        }
        if (arg0 != -86) {
            this.field504 = null;
        }
        var2 += 8;
        int var4 = this.field601 * 15 + 21;
        if (super.field920 > 4 && super.field921 > 4 && super.field920 < 516 && super.field921 < 338) {
            int var5 = super.field920 - 4 - var2 / 2;
            if (var2 + var5 > 512) {
                var5 = 512 - var2;
            }
            if (var5 < 0) {
                var5 = 0;
            }
            int var6 = super.field921 - 4;
            if (var4 + var6 > 334) {
                var6 = 334 - var4;
            }
            if (var6 < 0) {
                var6 = 0;
            }
            this.field396 = true;
            this.field521 = 0;
            this.field522 = var5;
            this.field523 = var6;
            this.field524 = var2;
            this.field525 = this.field601 * 15 + 22;
        }
        if (super.field920 > 553 && super.field921 > 205 && super.field920 < 743 && super.field921 < 466) {
            int var7 = super.field920 - 553 - var2 / 2;
            if (var7 < 0) {
                var7 = 0;
            } else if (var2 + var7 > 190) {
                var7 = 190 - var2;
            }
            int var8 = super.field921 - 205;
            if (var8 < 0) {
                var8 = 0;
            } else if (var4 + var8 > 261) {
                var8 = 261 - var4;
            }
            this.field396 = true;
            this.field521 = 1;
            this.field522 = var7;
            this.field523 = var8;
            this.field524 = var2;
            this.field525 = this.field601 * 15 + 22;
        }
        if (super.field920 > 17 && super.field921 > 357 && super.field920 < 496 && super.field921 < 453) {
            int var9 = super.field920 - 17 - var2 / 2;
            if (var9 < 0) {
                var9 = 0;
            } else if (var2 + var9 > 479) {
                var9 = 479 - var2;
            }
            int var10 = super.field921 - 357;
            if (var10 < 0) {
                var10 = 0;
            } else if (var4 + var10 > 96) {
                var10 = 96 - var4;
            }
            this.field396 = true;
            this.field521 = 2;
            this.field522 = var9;
            this.field523 = var10;
            this.field524 = var2;
            this.field525 = this.field601 * 15 + 22;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LHHCKFJEO;ILDNRIFKTO;II)V")
    private final void method32(class21 arg0, int arg1, class11 arg2, int arg3, int arg4) {
        if (arg1 != 2) {
            this.method93();
        }
        if ((arg4 & 128) != 0) {
            arg0.field69 = arg2.method215(-998);
            if (arg0.field69 == 65535) {
                arg0.field69 = -1;
            }
        }
        if ((arg4 & 1024) != 0) {
            arg0.field76 = arg2.method206((byte) -35);
            arg0.field78 = arg2.method208((byte) 97);
            arg0.field77 = arg2.method206((byte) -35);
            arg0.field79 = arg2.method206((byte) -35);
            arg0.field80 = arg2.method214(this.field594) + field438;
            arg0.field81 = arg2.method215(-998) + field438;
            arg0.field82 = arg2.method189();
            arg0.method21((byte) 5);
        }
        if ((arg4 & 16) != 0) {
            int var6 = arg2.method207((byte) 7);
            byte[] var7 = new byte[var6];
            class11 var8 = new class11(var7, field500);
            arg2.method226(var6, 0, var7, 41);
            this.field562[arg3] = var8;
            arg0.method277(var8, 0);
        }
        if ((arg4 & 256) != 0) {
            int var9 = arg2.method207((byte) 7);
            int var10 = arg2.method207((byte) 7);
            arg0.method23(var10, var9, field438, 16331);
            arg0.field52 = field438 + 300;
            arg0.field53 = arg2.method208((byte) 97);
            arg0.field54 = arg2.method189();
        }
        if ((arg4 & 64) != 0) {
            arg0.field86 = arg2.method215(-998);
            arg0.field87 = arg2.method191();
        }
        if ((arg4 & 32) != 0) {
            int var11 = arg2.method189();
            int var12 = arg2.method208((byte) 97);
            arg0.method23(var12, var11, field438, 16331);
            arg0.field52 = field438 + 300;
            arg0.field53 = arg2.method189();
            arg0.field54 = arg2.method206((byte) -35);
        }
        if ((arg4 & 1) != 0) {
            int var13 = arg2.method214(this.field594);
            int var14 = arg2.method206((byte) -35);
            int var15 = arg2.method208((byte) 97);
            int var16 = arg2.field643;
            if (arg0.field805 != null && arg0.field804) {
                long var17 = class25.method278(arg0.field805);
                boolean var19 = false;
                if (var14 <= 1) {
                    for (int var20 = 0; var20 < this.field120; ++var20) {
                        if (this.field367[var20] == var17) {
                            var19 = true;
                            break;
                        }
                    }
                }
                if (!var19 && this.field259 == 0) {
                    try {
                        this.field303.field643 = 0;
                        arg2.method226(var15, 0, this.field303.field642, 41);
                        this.field303.field643 = 0;
                        String var21 = class50.method398((byte) 1, var15, this.field303);
                        String var22 = class59.method472(false, var21);
                        arg0.field99 = var22;
                        arg0.field64 = var13 >> 8;
                        arg0.field70 = var13 & 255;
                        arg0.field72 = 150;
                        if (var14 != 2 && var14 != 3) {
                            if (var14 == 1) {
                                this.method136((byte) 3, 1, var22, "@cr1@" + arg0.field805);
                            } else {
                                this.method136((byte) 3, 2, var22, arg0.field805);
                            }
                        } else {
                            this.method136((byte) 3, 1, var22, "@cr2@" + arg0.field805);
                        }
                    } catch (Exception var28) {
                        signlink.reporterror("cde2");
                    }
                }
            }
            arg2.field643 = var15 + var16;
        }
        if ((arg4 & 4) != 0) {
            int var24 = arg2.method215(-998);
            if (var24 == 65535) {
                var24 = -1;
            }
            int var25 = arg2.method207((byte) 7);
            if (arg0.field90 == var24 && var24 != -1) {
                int var26 = class71.field1727[var24].field1741;
                if (var26 == 1) {
                    arg0.field91 = 0;
                    arg0.field92 = 0;
                    arg0.field93 = var25;
                    arg0.field94 = 0;
                }
                if (var26 == 2) {
                    arg0.field94 = 0;
                }
            } else if (var24 == -1 || arg0.field90 == -1 || class71.field1727[var24].field1735 >= class71.field1727[arg0.field90].field1735) {
                arg0.field90 = var24;
                arg0.field91 = 0;
                arg0.field92 = 0;
                arg0.field93 = var25;
                arg0.field94 = 0;
                arg0.field95 = arg0.field83;
            }
        }
        if ((arg4 & 2) != 0) {
            arg0.field99 = arg2.method196();
            if (arg0.field99.charAt(0) == '~') {
                arg0.field99 = arg0.field99.substring(1);
                this.method136((byte) 3, 2, arg0.field99, arg0.field805);
            } else if (field276 == arg0) {
                this.method136((byte) 3, 2, arg0.field99, arg0.field805);
            }
            arg0.field64 = 0;
            arg0.field70 = 0;
            arg0.field72 = 150;
        }
        if ((arg4 & 512) != 0) {
            arg0.field59 = arg2.method216(0);
            int var27 = arg2.method224(360);
            arg0.field63 = var27 >> 16;
            arg0.field62 = (var27 & 65535) + field438;
            arg0.field60 = 0;
            arg0.field61 = 0;
            if (arg0.field62 > field438) {
                arg0.field60 = -1;
            }
            if (arg0.field59 == 65535) {
                arg0.field59 = -1;
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LDNRIFKTO;II)V")
    private final void method33(class11 arg0, int arg1, int arg2) {
        int var4 = 63 / arg2;
        while (arg0.field644 + 10 < arg1 * 8) {
            int var5 = arg0.method200(5, 11);
            if (var5 == 2047) {
                break;
            }
            if (this.field557[var5] == null) {
                this.field557[var5] = new class21();
                if (this.field562[var5] != null) {
                    this.field557[var5].method277(this.field562[var5], 0);
                }
            }
            this.field559[this.field558++] = var5;
            class21 var6 = this.field557[var5];
            var6.field71 = field438;
            int var7 = arg0.method200(5, 1);
            if (var7 == 1) {
                this.field561[this.field560++] = var5;
            }
            int var8 = arg0.method200(5, 5);
            if (var8 > 15) {
                var8 -= 32;
            }
            int var9 = arg0.method200(5, 1);
            int var10 = arg0.method200(5, 5);
            if (var10 > 15) {
                var10 -= 32;
            }
            var6.method22(field276.field89[0] + var10, field276.field88[0] + var8, var9 == 1, -824);
        }
        arg0.method201(0);
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(B)V")
    public final void method34(byte arg0) {
        this.field389.method455(0);
        if (this.field470 == 2) {
            byte[] var2 = this.field237.field1267;
            int[] var3 = class62.field1528;
            int var4 = var2.length;
            for (int var5 = 0; var5 < var4; ++var5) {
                if (var2[var5] == 0) {
                    var3[var5] = 0;
                }
            }
            this.field445.method533(33, 25, 256, this.field207, 25, this.field539, this.field108, 0, 0, 33, 2);
            this.field390.method455(0);
            class4.field36 = this.field441;
        } else {
            int var6 = this.field465 + this.field207 & 2047;
            int var7 = field276.field102 / 32 + 48;
            int var8 = 464 - field276.field103 / 32;
            this.field426.method533(146, var8, this.field547 + 256, var6, var7, this.field537, this.field482, 25, 5, 151, 2);
            this.field445.method533(33, 25, 256, this.field207, 25, this.field539, this.field108, 0, 0, 33, 2);
            for (int var9 = 0; var9 < this.field168; ++var9) {
                int var39 = this.field169[var9] * 4 + 2 - field276.field102 / 32;
                int var40 = this.field170[var9] * 4 + 2 - field276.field103 / 32;
                this.method77(true, this.field375[var9], var40, var39);
            }
            for (int var10 = 0; var10 < 104; ++var10) {
                for (int var35 = 0; var35 < 104; ++var35) {
                    class70 var36 = this.field504[this.field326][var10][var35];
                    if (var36 != null) {
                        int var37 = var10 * 4 + 2 - field276.field102 / 32;
                        int var38 = var35 * 4 + 2 - field276.field103 / 32;
                        this.method77(true, this.field228, var38, var37);
                    }
                }
            }
            if (this.field145 == arg0) {
                for (int var11 = 0; var11 < this.field305; ++var11) {
                    class10 var31 = this.field304[this.field306[var11]];
                    if (var31 != null && var31.method20(false)) {
                        class20 var32 = var31.field626;
                        if (var32.field733 != null) {
                            var32 = var32.method272(-362);
                        }
                        if (var32 != null && var32.field755 && var32.field762) {
                            int var33 = var31.field102 / 32 - field276.field102 / 32;
                            int var34 = var31.field103 / 32 - field276.field103 / 32;
                            this.method77(true, this.field229, var34, var33);
                        }
                    }
                }
                for (int var12 = 0; var12 < this.field558; ++var12) {
                    class21 var23 = this.field557[this.field559[var12]];
                    if (var23 != null && var23.method20(false)) {
                        int var24 = var23.field102 / 32 - field276.field102 / 32;
                        int var25 = var23.field103 / 32 - field276.field103 / 32;
                        boolean var26 = false;
                        long var27 = class25.method278(var23.field805);
                        for (int var29 = 0; var29 < this.field298; ++var29) {
                            if (this.field311[var29] == var27 && this.field484[var29] != 0) {
                                var26 = true;
                                break;
                            }
                        }
                        boolean var30 = false;
                        if (field276.field779 != 0 && var23.field779 != 0 && field276.field779 == var23.field779) {
                            var30 = true;
                        }
                        if (var26) {
                            this.method77(true, this.field231, var25, var24);
                        } else if (var30) {
                            this.method77(true, this.field232, var25, var24);
                        } else {
                            this.method77(true, this.field230, var25, var24);
                        }
                    }
                }
                if (this.field359 != 0 && field438 % 20 < 10) {
                    if (this.field359 == 1 && this.field193 >= 0 && this.field193 < this.field304.length) {
                        class10 var13 = this.field304[this.field193];
                        if (var13 != null) {
                            int var14 = var13.field102 / 32 - field276.field102 / 32;
                            int var15 = var13.field103 / 32 - field276.field103 / 32;
                            this.method149(var15, var14, this.field551, (byte) -59);
                        }
                    }
                    if (this.field359 == 2) {
                        int var16 = (this.field336 - this.field322) * 4 + 2 - field276.field102 / 32;
                        int var17 = (this.field337 - this.field323) * 4 + 2 - field276.field103 / 32;
                        this.method149(var17, var16, this.field551, (byte) -59);
                    }
                    if (this.field359 == 10 && this.field220 >= 0 && this.field220 < this.field557.length) {
                        class21 var18 = this.field557[this.field220];
                        if (var18 != null) {
                            int var19 = var18.field102 / 32 - field276.field102 / 32;
                            int var20 = var18.field103 / 32 - field276.field103 / 32;
                            this.method149(var20, var19, this.field551, (byte) -59);
                        }
                    }
                }
                if (this.field424 != 0) {
                    int var21 = this.field424 * 4 + 2 - field276.field102 / 32;
                    int var22 = this.field425 * 4 + 2 - field276.field103 / 32;
                    this.method77(true, this.field550, var22, var21);
                }
                class62.method517(3, 16777215, 97, 3, this.field597, 78);
                this.field390.method455(0);
                class4.field36 = this.field441;
            }
        }
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(B)V")
    public final void method35(byte arg0) {
        if (this.field495 == 0 && this.field183 == 0) {
            this.field314[this.field601] = "Walk here";
            this.field429[this.field601] = 579;
            this.field427[this.field601] = super.field913;
            this.field428[this.field601] = super.field914;
            ++this.field601;
        }
        int var2 = -1;
        for (int var3 = 0; var3 < class55.field1399; ++var3) {
            int var6 = class55.field1400[var3];
            int var7 = var6 & 127;
            int var8 = var6 >> 7 & 127;
            int var9 = var6 >> 29 & 3;
            int var10 = var6 >> 14 & 32767;
            if (var2 != var6) {
                var2 = var6;
                if (var9 == 2 && this.field121.method568(this.field326, var7, var8, var6) >= 0) {
                    class56 var11 = class56.method445(var10);
                    if (var11.field1436 != null) {
                        var11 = var11.method451((byte) 4);
                    }
                    if (var11 == null) {
                        continue;
                    }
                    if (this.field495 == 1) {
                        this.field314[this.field601] = "Use " + this.field499 + " with @cya@" + var11.field1452;
                        this.field429[this.field601] = 748;
                        this.field430[this.field601] = var6;
                        this.field427[this.field601] = var7;
                        this.field428[this.field601] = var8;
                        ++this.field601;
                    } else if (this.field183 == 1) {
                        if ((this.field185 & 4) == 4) {
                            this.field314[this.field601] = this.field186 + " @cya@" + var11.field1452;
                            this.field429[this.field601] = 212;
                            this.field430[this.field601] = var6;
                            this.field427[this.field601] = var7;
                            this.field428[this.field601] = var8;
                            ++this.field601;
                        }
                    } else {
                        if (var11.field1409 != null) {
                            for (int var12 = 4; var12 >= 0; --var12) {
                                if (var11.field1409[var12] != null) {
                                    this.field314[this.field601] = var11.field1409[var12] + " @cya@" + var11.field1452;
                                    if (var12 == 0) {
                                        this.field429[this.field601] = 633;
                                    }
                                    if (var12 == 1) {
                                        this.field429[this.field601] = 33;
                                    }
                                    if (var12 == 2) {
                                        this.field429[this.field601] = 76;
                                    }
                                    if (var12 == 3) {
                                        this.field429[this.field601] = 800;
                                    }
                                    if (var12 == 4) {
                                        this.field429[this.field601] = 1194;
                                    }
                                    this.field430[this.field601] = var6;
                                    this.field427[this.field601] = var7;
                                    this.field428[this.field601] = var8;
                                    ++this.field601;
                                }
                            }
                        }
                        this.field314[this.field601] = "Examine @cya@" + var11.field1452;
                        this.field429[this.field601] = 1704;
                        this.field430[this.field601] = var11.field1417 << 14;
                        this.field427[this.field601] = var7;
                        this.field428[this.field601] = var8;
                        ++this.field601;
                    }
                }
                if (var9 == 1) {
                    class10 var13 = this.field304[var10];
                    if (var13.field626.field751 == 1 && (var13.field102 & 127) == 64 && (var13.field103 & 127) == 64) {
                        for (int var14 = 0; var14 < this.field305; ++var14) {
                            class10 var17 = this.field304[this.field306[var14]];
                            if (var17 != null && var13 != var17 && var17.field626.field751 == 1 && var13.field102 == var17.field102 && var13.field103 == var17.field103) {
                                this.method116(var7, var17.field626, this.field306[var14], var8, (byte) 72);
                            }
                        }
                        for (int var15 = 0; var15 < this.field558; ++var15) {
                            class21 var16 = this.field557[this.field559[var15]];
                            if (var16 != null && var13.field102 == var16.field102 && var13.field103 == var16.field103) {
                                this.method125(var7, var16, var8, (byte) 38, this.field559[var15]);
                            }
                        }
                    }
                    this.method116(var7, var13.field626, var10, var8, (byte) 72);
                }
                if (var9 == 0) {
                    class21 var18 = this.field557[var10];
                    if ((var18.field102 & 127) == 64 && (var18.field103 & 127) == 64) {
                        for (int var19 = 0; var19 < this.field305; ++var19) {
                            class10 var22 = this.field304[this.field306[var19]];
                            if (var22 != null && var22.field626.field751 == 1 && var18.field102 == var22.field102 && var18.field103 == var22.field103) {
                                this.method116(var7, var22.field626, this.field306[var19], var8, (byte) 72);
                            }
                        }
                        for (int var20 = 0; var20 < this.field558; ++var20) {
                            class21 var21 = this.field557[this.field559[var20]];
                            if (var21 != null && var18 != var21 && var18.field102 == var21.field102 && var18.field103 == var21.field103) {
                                this.method125(var7, var21, var8, (byte) 38, this.field559[var20]);
                            }
                        }
                    }
                    this.method125(var7, var18, var8, (byte) 38, var10);
                }
                if (var9 == 3) {
                    class70 var23 = this.field504[this.field326][var7][var8];
                    if (var23 != null) {
                        for (class69 var24 = (class69) var23.method593(this.field540); var24 != null; var24 = (class69) var23.method595(true)) {
                            class26 var25 = class26.method293(var24.field1716);
                            if (this.field495 == 1) {
                                this.field314[this.field601] = "Use " + this.field499 + " with @lre@" + var25.field844;
                                this.field429[this.field601] = 341;
                                this.field430[this.field601] = var24.field1716;
                                this.field427[this.field601] = var7;
                                this.field428[this.field601] = var8;
                                ++this.field601;
                            } else if (this.field183 == 1) {
                                if ((this.field185 & 1) == 1) {
                                    this.field314[this.field601] = this.field186 + " @lre@" + var25.field844;
                                    this.field429[this.field601] = 534;
                                    this.field430[this.field601] = var24.field1716;
                                    this.field427[this.field601] = var7;
                                    this.field428[this.field601] = var8;
                                    ++this.field601;
                                }
                            } else {
                                for (int var26 = 4; var26 >= 0; --var26) {
                                    if (var25.field881 != null && var25.field881[var26] != null) {
                                        this.field314[this.field601] = var25.field881[var26] + " @lre@" + var25.field844;
                                        if (var26 == 0) {
                                            this.field429[this.field601] = 862;
                                        }
                                        if (var26 == 1) {
                                            this.field429[this.field601] = 784;
                                        }
                                        if (var26 == 2) {
                                            this.field429[this.field601] = 647;
                                        }
                                        if (var26 == 3) {
                                            this.field429[this.field601] = 58;
                                        }
                                        if (var26 == 4) {
                                            this.field429[this.field601] = 321;
                                        }
                                        this.field430[this.field601] = var24.field1716;
                                        this.field427[this.field601] = var7;
                                        this.field428[this.field601] = var8;
                                        ++this.field601;
                                    } else if (var26 == 2) {
                                        this.field314[this.field601] = "Take @lre@" + var25.field844;
                                        this.field429[this.field601] = 647;
                                        this.field430[this.field601] = var24.field1716;
                                        this.field427[this.field601] = var7;
                                        this.field428[this.field601] = var8;
                                        ++this.field601;
                                    }
                                }
                                this.field314[this.field601] = "Examine @lre@" + var25.field844;
                                this.field429[this.field601] = 1608;
                                this.field430[this.field601] = var24.field1716;
                                this.field427[this.field601] = var7;
                                this.field428[this.field601] = var8;
                                ++this.field601;
                            }
                        }
                    }
                }
            }
        }
        if (arg0 == 4) {
            boolean var4 = false;
        } else {
            for (int var5 = 1; var5 > 0; ++var5) {
            }
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(Z)V")
    public final void method36(boolean arg0) {
        this.field528 &= arg0;
        if (field286 && this.field577 == 2 && class41.field1198 != this.field326) {
            if (this.field390 != null) {
                this.field390.method455(0);
                class4.field36 = this.field441;
                this.field447.method230(0, 257, "Loading - please wait.", (byte) -90, 151);
                this.field447.method230(16777215, 256, "Loading - please wait.", (byte) -90, 150);
                this.field390.method456(4, 722, super.field905, 4);
            } else if (super.field906 != null) {
                super.field906.method455(0);
                class4.field36 = this.field442;
                this.field447.method230(0, 383, "Loading - please wait.", (byte) -90, 471);
                this.field447.method230(16777215, 382, "Loading - please wait.", (byte) -90, 470);
                super.field906.method456(0, 722, super.field905, 0);
            }
            this.field577 = 1;
            this.field187 = System.currentTimeMillis();
        }
        if (this.field577 == 1) {
            int var2 = this.method37((byte) 7);
            if (var2 != 0 && System.currentTimeMillis() - this.field187 > 360000L) {
                signlink.reporterror(this.field294 + " glcfb " + this.field221 + "," + var2 + "," + field286 + "," + this.field309[0] + "," + this.field154.method337() + "," + this.field326 + "," + this.field360 + "," + this.field361);
                this.field187 = System.currentTimeMillis();
            }
        }
        if (this.field577 == 2 && this.field489 != this.field326) {
            this.field489 = this.field326;
            this.method126((byte) 15, this.field326);
        }
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(B)I")
    public final int method37(byte arg0) {
        for (int var2 = 0; var2 < this.field457.length; ++var2) {
            if (this.field457[var2] == null && this.field270[var2] != -1) {
                return -1;
            }
            if (this.field454[var2] == null && this.field271[var2] != -1) {
                return -2;
            }
        }
        boolean var3 = true;
        if (this.field267 == arg0) {
            boolean var4 = false;
            for (int var5 = 0; var5 < this.field457.length; ++var5) {
                byte[] var6 = this.field454[var5];
                if (var6 != null) {
                    int var7 = (this.field269[var5] >> 8) * 64 - this.field322;
                    int var8 = (this.field269[var5] & 255) * 64 - this.field323;
                    if (this.field589) {
                        var7 = 10;
                        var8 = 10;
                    }
                    var3 &= class41.method371(var8, var6, this.field456, var7);
                }
            }
            if (!var3) {
                return -3;
            } else if (this.field224) {
                return -4;
            } else {
                this.field577 = 2;
                class41.field1198 = this.field326;
                this.method69(false);
                this.field213.method178(false, 226);
                return 0;
            }
        } else {
            return 2;
        }
    }

    @OriginalMember(owner = "client", name = "h", descriptor = "(B)V")
    public final void method38(byte arg0) {
        short var2 = 256;
        if (arg0 != 9) {
            this.field597 = !this.field597;
        }
        if (this.field363 > 0) {
            for (int var3 = 0; var3 < 256; ++var3) {
                if (this.field363 > 768) {
                    this.field173[var3] = this.method92(this.field175[var3], 1024 - this.field363, this.field174[var3], 0);
                } else if (this.field363 > 256) {
                    this.field173[var3] = this.field175[var3];
                } else {
                    this.field173[var3] = this.method92(this.field174[var3], 256 - this.field363, this.field175[var3], 0);
                }
            }
        } else if (this.field364 > 0) {
            for (int var4 = 0; var4 < 256; ++var4) {
                if (this.field364 > 768) {
                    this.field173[var4] = this.method92(this.field176[var4], 1024 - this.field364, this.field174[var4], 0);
                } else if (this.field364 > 256) {
                    this.field173[var4] = this.field176[var4];
                } else {
                    this.field173[var4] = this.method92(this.field174[var4], 256 - this.field364, this.field176[var4], 0);
                }
            }
        } else {
            for (int var5 = 0; var5 < 256; ++var5) {
                this.field173[var5] = this.field174[var5];
            }
        }
        for (int var6 = 0; var6 < 33920; ++var6) {
            this.field243.field1459[var6] = this.field161.field1620[var6];
        }
        int var7 = 0;
        int var8 = 1152;
        for (int var9 = 1; var9 < var2 - 1; ++var9) {
            int var23 = (var2 - var9) * this.field353[var9] / var2;
            int var24 = var23 + 22;
            if (var24 < 0) {
                var24 = 0;
            }
            var7 += var24;
            for (int var25 = var24; var25 < 128; ++var25) {
                int var26 = this.field420[var7++];
                if (var26 != 0) {
                    int var28 = 256 - var26;
                    int var29 = this.field173[var26];
                    int var30 = this.field243.field1459[var8];
                    this.field243.field1459[var8++] = ((var29 & 16711935) * var26 + (var30 & 16711935) * var28 & -16711936) + ((var29 & 65280) * var26 + (var30 & 65280) * var28 & 16711680) >> 8;
                } else {
                    ++var8;
                }
            }
            var8 += var24;
        }
        this.field243.method456(0, 722, super.field905, 0);
        for (int var10 = 0; var10 < 33920; ++var10) {
            this.field244.field1459[var10] = this.field162.field1620[var10];
        }
        int var11 = 0;
        int var12 = 1176;
        for (int var13 = 1; var13 < var2 - 1; ++var13) {
            int var14 = (var2 - var13) * this.field353[var13] / var2;
            int var15 = 103 - var14;
            int var16 = var12 + var14;
            for (int var17 = 0; var17 < var15; ++var17) {
                int var18 = this.field420[var11++];
                if (var18 != 0) {
                    int var20 = 256 - var18;
                    int var21 = this.field173[var18];
                    int var22 = this.field244.field1459[var16];
                    this.field244.field1459[var16++] = ((var21 & 16711935) * var18 + (var22 & 16711935) * var20 & -16711936) + ((var21 & 65280) * var18 + (var22 & 65280) * var20 & 16711680) >> 8;
                } else {
                    ++var16;
                }
            }
            var11 += 128 - var15;
            var12 = 128 - var15 - var14 + var16;
        }
        this.field244.method456(637, 722, super.field905, 0);
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZI)V")
    public final void method39(boolean arg0, int arg1) {
        if (arg1 >= 0) {
            if (this.field502 != 0) {
                this.field502 = 0;
                this.field205 = true;
            }
            int var3 = this.field427[arg1];
            int var4 = this.field428[arg1];
            int var5 = this.field429[arg1];
            int var6 = this.field430[arg1];
            if (var5 >= 2000) {
                var5 -= 2000;
            }
            if (var5 == 723 || var5 == 64 || var5 == 942 || var5 == 156) {
                String var7 = this.field314[arg1];
                int var8 = var7.indexOf("@whi@");
                if (var8 != -1) {
                    long var9 = class25.method278(var7.substring(var8 + 5).trim());
                    if (var5 == 723) {
                        this.method161(false, var9);
                    }
                    if (var5 == 64) {
                        this.method121(var9, 9);
                    }
                    if (var5 == 942) {
                        this.method129(var9, (byte) 37);
                    }
                    if (var5 == 156) {
                        this.method70(var9, false);
                    }
                }
            }
            if (var5 == 690) {
                class21 var11 = this.field557[var6];
                if (var11 != null) {
                    this.method46(field276.field89[0], 1, false, var11.field88[0], 0, var11.field89[0], 1, 0, -36, 0, field276.field88[0], 2);
                    this.field127 = super.field920;
                    this.field128 = super.field921;
                    this.field130 = 2;
                    this.field129 = 0;
                    this.field213.method178(false, 69);
                    this.field213.method211(35516, var6);
                    this.field213.method180(this.field184);
                }
            }
            if (var5 == 837) {
                class21 var12 = this.field557[var6];
                if (var12 != null) {
                    this.method46(field276.field89[0], 1, false, var12.field88[0], 0, var12.field89[0], 1, 0, -36, 0, field276.field88[0], 2);
                    this.field127 = super.field920;
                    this.field128 = super.field921;
                    this.field130 = 2;
                    this.field129 = 0;
                    this.field213.method178(false, 25);
                    this.field213.method212((byte) 5, var6);
                }
            }
            if (var5 == 1608) {
                class26 var13 = class26.method293(var6);
                String var14;
                if (var13.field858 != null) {
                    var14 = new String(var13.field858);
                } else {
                    var14 = "It's a " + var13.field844 + ".";
                }
                this.method136((byte) 3, 0, var14, "");
            }
            if (var5 == 579) {
                if (!this.field396) {
                    this.field121.method576(super.field921 - 4, super.field920 - 4, true);
                } else {
                    this.field121.method576(var4 - 4, var3 - 4, true);
                }
            }
            if (var5 == 534) {
                boolean var15 = this.method46(field276.field89[0], 0, false, var3, 0, var4, 0, 0, -36, 0, field276.field88[0], 2);
                if (!var15) {
                    this.method46(field276.field89[0], 1, false, var3, 0, var4, 1, 0, -36, 0, field276.field88[0], 2);
                }
                this.field127 = super.field920;
                this.field128 = super.field921;
                this.field130 = 2;
                this.field129 = 0;
                this.field213.method178(false, 48);
                this.field213.method212((byte) 5, this.field322 + var3);
                this.field213.method213(this.field323 + var4, false);
                this.field213.method212((byte) 5, this.field184);
                this.field213.method212((byte) 5, var6);
            }
            if (var5 == 777) {
                class21 var17 = this.field557[var6];
                if (var17 != null) {
                    this.method46(field276.field89[0], 1, false, var17.field88[0], 0, var17.field89[0], 1, 0, -36, 0, field276.field88[0], 2);
                    this.field127 = super.field920;
                    this.field128 = super.field921;
                    this.field130 = 2;
                    this.field129 = 0;
                    this.field213.method178(false, 29);
                    this.field213.method212((byte) 5, this.field498);
                    this.field213.method213(var6, false);
                    this.field213.method213(this.field497, false);
                    this.field213.method180(this.field496);
                }
            }
            if (var5 == 433) {
                this.field213.method178(false, 35);
                this.field213.method213(var6, false);
                this.field213.method212((byte) 5, var3);
                this.field213.method212((byte) 5, var4);
                this.field512 = 0;
                this.field513 = var4;
                this.field514 = var3;
                this.field515 = 2;
                if (class30.method316(var4).field988 == this.field595) {
                    this.field515 = 1;
                }
                if (class30.method316(var4).field988 == this.field585) {
                    this.field515 = 3;
                }
            }
            if (var5 == 1194) {
                this.method30((byte) 2, var3, var6, var4);
                this.field213.method178(false, 24);
                this.field213.method213(this.field322 + var3, false);
                this.field213.method213(var6 >> 14 & 32767, false);
                this.field213.method180(this.field323 + var4);
            }
            if (var5 == 1704) {
                int var18 = var6 >> 14 & 32767;
                class56 var19 = class56.method445(var18);
                String var20;
                if (var19.field1410 != null) {
                    var20 = new String(var19.field1410);
                } else {
                    var20 = "It's a " + var19.field1452 + ".";
                }
                this.method136((byte) 3, 0, var20, "");
            }
            if (var5 == 212 && this.method30((byte) 2, var3, var6, var4)) {
                this.field213.method178(false, 210);
                this.field213.method180(this.field323 + var4);
                this.field213.method212((byte) 5, var6 >> 14 & 32767);
                this.field213.method211(35516, this.field184);
                this.field213.method211(35516, this.field322 + var3);
            }
            if (var5 == 503) {
                this.field213.method178(false, 182);
                this.field213.method212((byte) 5, var4);
                this.field213.method212((byte) 5, var6);
                this.field213.method180(var3);
                this.field512 = 0;
                this.field513 = var4;
                this.field514 = var3;
                this.field515 = 2;
                if (class30.method316(var4).field988 == this.field595) {
                    this.field515 = 1;
                }
                if (class30.method316(var4).field988 == this.field585) {
                    this.field515 = 3;
                }
            }
            if (var5 == 236) {
                class30 var21 = class30.method316(var4);
                boolean var22 = true;
                if (var21.field963 > 0) {
                    var22 = this.method130(var21, -13938);
                }
                if (var22) {
                    this.field213.method178(false, 44);
                    this.field213.method180(var4);
                }
            }
            if (var5 == 321) {
                boolean var23 = this.method46(field276.field89[0], 0, false, var3, 0, var4, 0, 0, -36, 0, field276.field88[0], 2);
                if (!var23) {
                    this.method46(field276.field89[0], 1, false, var3, 0, var4, 1, 0, -36, 0, field276.field88[0], 2);
                }
                this.field127 = super.field920;
                this.field128 = super.field921;
                this.field130 = 2;
                this.field129 = 0;
                this.field213.method178(false, 96);
                this.field213.method211(35516, var6);
                this.field213.method211(35516, this.field322 + var3);
                this.field213.method213(this.field323 + var4, false);
            }
            if (var5 == 591 && !this.field587) {
                this.field213.method178(false, 179);
                this.field213.method180(var4);
                this.field587 = true;
            }
            if (var5 == 526) {
                this.field213.method178(false, 247);
                this.field213.method212((byte) 5, var3);
                this.field213.method213(this.field496, false);
                this.field213.method211(35516, var4);
                this.field213.method213(this.field498, false);
                this.field213.method213(this.field497, false);
                this.field213.method213(var6, false);
                this.field512 = 0;
                this.field513 = var4;
                this.field514 = var3;
                this.field515 = 2;
                if (class30.method316(var4).field988 == this.field595) {
                    this.field515 = 1;
                }
                if (class30.method316(var4).field988 == this.field585) {
                    this.field515 = 3;
                }
            }
            if (var5 == 192) {
                this.field213.method178(false, 44);
                this.field213.method180(var4);
                class30 var25 = class30.method316(var4);
                if (var25.field1025 != null && var25.field1025[0][0] == 5) {
                    int var26 = var25.field1025[0][1];
                    if (this.field588[var26] != var25.field1015[0]) {
                        this.field588[var26] = var25.field1015[0];
                        this.method139((byte) 77, var26);
                        this.field372 = true;
                    }
                }
            }
            if (var5 == 988) {
                class10 var27 = this.field304[var6];
                if (var27 != null) {
                    this.method46(field276.field89[0], 1, false, var27.field88[0], 0, var27.field89[0], 1, 0, -36, 0, field276.field88[0], 2);
                    this.field127 = super.field920;
                    this.field128 = super.field921;
                    this.field130 = 2;
                    this.field129 = 0;
                    this.field213.method178(false, 71);
                    this.field213.method212((byte) 5, var6);
                }
            }
            if (var5 == 33) {
                this.method30((byte) 2, var3, var6, var4);
                this.field213.method178(false, 86);
                this.field213.method213(var6 >> 14 & 32767, false);
                this.field213.method180(this.field323 + var4);
                this.field213.method180(this.field322 + var3);
            }
            if (var5 == 18) {
                if ((var4 & 3) == 0) {
                    ++field505;
                }
                if (field505 >= 125) {
                    this.field213.method178(false, 11);
                    this.field213.method179(17);
                    field505 = 0;
                }
                this.field213.method178(false, 0);
                this.field213.method212((byte) 5, var3);
                this.field213.method212((byte) 5, var4);
                this.field213.method211(35516, var6);
                this.field512 = 0;
                this.field513 = var4;
                this.field514 = var3;
                this.field515 = 2;
                if (class30.method316(var4).field988 == this.field595) {
                    this.field515 = 1;
                }
                if (class30.method316(var4).field988 == this.field585) {
                    this.field515 = 3;
                }
            }
            if (var5 == 871) {
                this.field213.method178(false, 239);
                this.field213.method180(var3);
                this.field213.method213(var4, false);
                this.field213.method180(var6);
                this.field512 = 0;
                this.field513 = var4;
                this.field514 = var3;
                this.field515 = 2;
                if (class30.method316(var4).field988 == this.field595) {
                    this.field515 = 1;
                }
                if (class30.method316(var4).field988 == this.field585) {
                    this.field515 = 3;
                }
            }
            if (var5 == 567) {
                this.method135(-10386, this.field194);
                this.field194 = -1;
                this.field205 = true;
            }
            if (var5 == 862) {
                boolean var28 = this.method46(field276.field89[0], 0, false, var3, 0, var4, 0, 0, -36, 0, field276.field88[0], 2);
                if (!var28) {
                    this.method46(field276.field89[0], 1, false, var3, 0, var4, 1, 0, -36, 0, field276.field88[0], 2);
                }
                this.field127 = super.field920;
                this.field128 = super.field921;
                this.field130 = 2;
                this.field129 = 0;
                this.field213.method178(false, 74);
                this.field213.method212((byte) 5, this.field323 + var4);
                this.field213.method212((byte) 5, var6);
                this.field213.method213(this.field322 + var3, false);
            }
            if (var5 == 20) {
                class21 var30 = this.field557[var6];
                if (var30 != null) {
                    this.method46(field276.field89[0], 1, false, var30.field88[0], 0, var30.field89[0], 1, 0, -36, 0, field276.field88[0], 2);
                    this.field127 = super.field920;
                    this.field128 = super.field921;
                    this.field130 = 2;
                    this.field129 = 0;
                    field382 += var6;
                    if (field382 >= 114) {
                        this.field213.method178(false, 162);
                        this.field213.method182(9118876);
                        field382 = 0;
                    }
                    this.field213.method178(false, 201);
                    this.field213.method213(var6, false);
                }
            }
            if (var5 == 800) {
                this.method30((byte) 2, var3, var6, var4);
                this.field213.method178(false, 119);
                this.field213.method211(35516, this.field322 + var3);
                this.field213.method211(35516, var6 >> 14 & 32767);
                this.field213.method213(this.field323 + var4, false);
            }
            if (var5 == 359) {
                class10 var31 = this.field304[var6];
                if (var31 != null) {
                    this.method46(field276.field89[0], 1, false, var31.field88[0], 0, var31.field89[0], 1, 0, -36, 0, field276.field88[0], 2);
                    this.field127 = super.field920;
                    this.field128 = super.field921;
                    this.field130 = 2;
                    this.field129 = 0;
                    field310 += var6;
                    if (field310 >= 132) {
                        this.field213.method178(false, 65);
                        field310 = 0;
                    }
                    this.field213.method178(false, 230);
                    this.field213.method211(35516, var6);
                }
            }
            if (var5 == 914) {
                this.field213.method178(false, 127);
                this.field213.method213(var4, false);
                this.field213.method212((byte) 5, var6);
                this.field213.method211(35516, var3);
                this.field512 = 0;
                this.field513 = var4;
                this.field514 = var3;
                this.field515 = 2;
                if (class30.method316(var4).field988 == this.field595) {
                    this.field515 = 1;
                }
                if (class30.method316(var4).field988 == this.field585) {
                    this.field515 = 3;
                }
            }
            if (var5 == 850) {
                class10 var32 = this.field304[var6];
                if (var32 != null) {
                    this.method46(field276.field89[0], 1, false, var32.field88[0], 0, var32.field89[0], 1, 0, -36, 0, field276.field88[0], 2);
                    this.field127 = super.field920;
                    this.field128 = super.field921;
                    this.field130 = 2;
                    this.field129 = 0;
                    this.field213.method178(false, 134);
                    this.field213.method213(var6, false);
                    this.field213.method211(35516, this.field498);
                    this.field213.method213(this.field496, false);
                    this.field213.method213(this.field497, false);
                }
            }
            if (var5 == 633) {
                this.method30((byte) 2, var3, var6, var4);
                this.field213.method178(false, 84);
                this.field213.method212((byte) 5, var6 >> 14 & 32767);
                this.field213.method212((byte) 5, this.field322 + var3);
                this.field213.method212((byte) 5, this.field323 + var4);
            }
            if (var5 == 686) {
                class30 var33 = class30.method316(var4);
                this.field183 = 1;
                this.field184 = var4;
                this.field185 = var33.field1012;
                this.field495 = 0;
                this.field372 = true;
                String var34 = var33.field1011;
                if (var34.indexOf(" ") != -1) {
                    var34 = var34.substring(0, var34.indexOf(" "));
                }
                String var35 = var33.field1011;
                if (var35.indexOf(" ") != -1) {
                    var35 = var35.substring(var35.indexOf(" ") + 1);
                }
                this.field186 = var34 + " " + var33.field977 + " " + var35;
                if (this.field185 == 16) {
                    this.field372 = true;
                    this.field384 = 3;
                    this.field258 = true;
                }
            } else {
                if (var5 == 361) {
                    class21 var36 = this.field557[var6];
                    if (var36 != null) {
                        this.method46(field276.field89[0], 1, false, var36.field88[0], 0, var36.field89[0], 1, 0, -36, 0, field276.field88[0], 2);
                        this.field127 = super.field920;
                        this.field128 = super.field921;
                        this.field130 = 2;
                        this.field129 = 0;
                        this.field213.method178(false, 60);
                        this.field213.method212((byte) 5, var6);
                    }
                }
                if (var5 == 283) {
                    class10 var37 = this.field304[var6];
                    if (var37 != null) {
                        this.method46(field276.field89[0], 1, false, var37.field88[0], 0, var37.field89[0], 1, 0, -36, 0, field276.field88[0], 2);
                        this.field127 = super.field920;
                        this.field128 = super.field921;
                        this.field130 = 2;
                        this.field129 = 0;
                        this.field213.method178(false, 40);
                        this.field213.method212((byte) 5, var6);
                        this.field213.method213(this.field184, false);
                    }
                }
                if (var5 == 784) {
                    boolean var38 = this.method46(field276.field89[0], 0, false, var3, 0, var4, 0, 0, -36, 0, field276.field88[0], 2);
                    if (!var38) {
                        this.method46(field276.field89[0], 1, false, var3, 0, var4, 1, 0, -36, 0, field276.field88[0], 2);
                    }
                    this.field127 = super.field920;
                    this.field128 = super.field921;
                    this.field130 = 2;
                    this.field129 = 0;
                    this.field213.method178(false, 244);
                    this.field213.method211(35516, var6);
                    this.field213.method212((byte) 5, this.field323 + var4);
                    this.field213.method213(this.field322 + var3, false);
                }
                if (var5 == 341) {
                    boolean var40 = this.method46(field276.field89[0], 0, false, var3, 0, var4, 0, 0, -36, 0, field276.field88[0], 2);
                    if (!var40) {
                        this.method46(field276.field89[0], 1, false, var3, 0, var4, 1, 0, -36, 0, field276.field88[0], 2);
                    }
                    this.field127 = super.field920;
                    this.field128 = super.field921;
                    this.field130 = 2;
                    this.field129 = 0;
                    this.field213.method178(false, 187);
                    this.field213.method211(35516, this.field323 + var4);
                    this.field213.method213(this.field497, false);
                    this.field213.method211(35516, this.field498);
                    this.field213.method180(this.field496);
                    this.field213.method180(var6);
                    this.field213.method213(this.field322 + var3, false);
                }
                if (var5 == 647) {
                    boolean var42 = this.method46(field276.field89[0], 0, false, var3, 0, var4, 0, 0, -36, 0, field276.field88[0], 2);
                    if (!var42) {
                        this.method46(field276.field89[0], 1, false, var3, 0, var4, 1, 0, -36, 0, field276.field88[0], 2);
                    }
                    this.field127 = super.field920;
                    this.field128 = super.field921;
                    this.field130 = 2;
                    this.field129 = 0;
                    this.field213.method178(false, 66);
                    this.field213.method180(var6);
                    this.field213.method211(35516, this.field323 + var4);
                    this.field213.method213(this.field322 + var3, false);
                }
                if (var5 == 269) {
                    class10 var44 = this.field304[var6];
                    if (var44 != null) {
                        this.method46(field276.field89[0], 1, false, var44.field88[0], 0, var44.field89[0], 1, 0, -36, 0, field276.field88[0], 2);
                        this.field127 = super.field920;
                        this.field128 = super.field921;
                        this.field130 = 2;
                        this.field129 = 0;
                        this.field213.method178(false, 107);
                        this.field213.method180(var6);
                    }
                }
                if (var5 == 76) {
                    this.method30((byte) 2, var3, var6, var4);
                    this.field213.method178(false, 128);
                    this.field213.method211(35516, this.field323 + var4);
                    this.field213.method211(35516, var6 >> 14 & 32767);
                    this.field213.method180(this.field322 + var3);
                }
                if (var5 == 959) {
                    field369 += var4;
                    if (field369 >= 132) {
                        this.field213.method178(false, 173);
                        field369 = 0;
                    }
                    this.field213.method178(false, 249);
                    this.field213.method180(var6);
                    this.field213.method211(35516, var3);
                    this.field213.method213(var4, false);
                    this.field512 = 0;
                    this.field513 = var4;
                    this.field514 = var3;
                    this.field515 = 2;
                    if (class30.method316(var4).field988 == this.field595) {
                        this.field515 = 1;
                    }
                    if (class30.method316(var4).field988 == this.field585) {
                        this.field515 = 3;
                    }
                }
                if (var5 == 137) {
                    this.field213.method178(false, 72);
                    this.field213.method211(35516, var6);
                    this.field213.method213(var4, false);
                    this.field213.method180(var3);
                    this.field512 = 0;
                    this.field513 = var4;
                    this.field514 = var3;
                    this.field515 = 2;
                    if (class30.method316(var4).field988 == this.field595) {
                        this.field515 = 1;
                    }
                    if (class30.method316(var4).field988 == this.field585) {
                        this.field515 = 3;
                    }
                }
                if (var5 == 601) {
                    this.field213.method178(false, 149);
                    this.field213.method211(35516, var6);
                    this.field213.method180(var3);
                    this.field213.method212((byte) 5, var4);
                    this.field512 = 0;
                    this.field513 = var4;
                    this.field514 = var3;
                    this.field515 = 2;
                    if (class30.method316(var4).field988 == this.field595) {
                        this.field515 = 1;
                    }
                    if (class30.method316(var4).field988 == this.field585) {
                        this.field515 = 3;
                    }
                }
                if (var5 == 562) {
                    this.field213.method178(false, 202);
                    this.field213.method180(this.field184);
                    this.field213.method211(35516, var3);
                    this.field213.method180(var4);
                    this.field213.method211(35516, var6);
                    this.field512 = 0;
                    this.field513 = var4;
                    this.field514 = var3;
                    this.field515 = 2;
                    if (class30.method316(var4).field988 == this.field595) {
                        this.field515 = 1;
                    }
                    if (class30.method316(var4).field988 == this.field585) {
                        this.field515 = 3;
                    }
                }
                if (var5 == 1675) {
                    class26 var45 = class26.method293(var6);
                    class30 var46 = class30.method316(var4);
                    String var47;
                    if (var46 != null && var46.field1032[var3] >= 100000) {
                        var47 = var46.field1032[var3] + " x " + var45.field844;
                    } else if (var45.field858 != null) {
                        var47 = new String(var45.field858);
                    } else {
                        var47 = "It's a " + var45.field844 + ".";
                    }
                    this.method136((byte) 3, 0, var47, "");
                }
                if (var5 == 509) {
                    this.field213.method178(false, 44);
                    this.field213.method180(var4);
                    class30 var48 = class30.method316(var4);
                    if (var48.field1025 != null && var48.field1025[0][0] == 5) {
                        int var49 = var48.field1025[0][1];
                        this.field588[var49] = 1 - this.field588[var49];
                        this.method139((byte) 77, var49);
                        this.field372 = true;
                    }
                }
                if (var5 == 407) {
                    this.method152(-21279);
                }
                if (var5 == 711) {
                    this.field495 = 1;
                    this.field496 = var3;
                    this.field497 = var4;
                    this.field498 = var6;
                    this.field499 = class26.method293(var6).field844;
                    this.field183 = 0;
                    this.field372 = true;
                } else {
                    if (var5 == 765) {
                        String var50 = this.field314[arg1];
                        int var51 = var50.indexOf("@whi@");
                        if (var51 != -1) {
                            long var52 = class25.method278(var50.substring(var51 + 5).trim());
                            int var54 = -1;
                            for (int var55 = 0; var55 < this.field298; ++var55) {
                                if (this.field311[var55] == var52) {
                                    var54 = var55;
                                    break;
                                }
                            }
                            if (var54 != -1 && this.field484[var54] > 0) {
                                this.field205 = true;
                                this.field502 = 0;
                                this.field436 = true;
                                this.field331 = "";
                                this.field566 = 3;
                                this.field451 = this.field311[var54];
                                this.field590 = "Enter message to send to " + this.field134[var54];
                            }
                        }
                    }
                    if (var5 == 511) {
                        ++field291;
                        if (field291 >= 93) {
                            this.field213.method178(false, 3);
                            this.field213.method182(12090599);
                            field291 = 0;
                        }
                        this.field213.method178(false, 28);
                        this.field213.method212((byte) 5, var4);
                        this.field213.method212((byte) 5, var6);
                        this.field213.method213(var3, false);
                        this.field512 = 0;
                        this.field513 = var4;
                        this.field514 = var3;
                        this.field515 = 2;
                        if (class30.method316(var4).field988 == this.field595) {
                            this.field515 = 1;
                        }
                        if (class30.method316(var4).field988 == this.field585) {
                            this.field515 = 3;
                        }
                    }
                    if (var5 == 111) {
                        class10 var56 = this.field304[var6];
                        if (var56 != null) {
                            this.method46(field276.field89[0], 1, false, var56.field88[0], 0, var56.field89[0], 1, 0, -36, 0, field276.field88[0], 2);
                            this.field127 = super.field920;
                            this.field128 = super.field921;
                            this.field130 = 2;
                            this.field129 = 0;
                            field381 += var6;
                            if (field381 >= 139) {
                                this.field213.method178(false, 203);
                                this.field213.method182(11800411);
                                field381 = 0;
                            }
                            this.field213.method178(false, 229);
                            this.field213.method211(35516, var6);
                        }
                    }
                    if (var5 == 446) {
                        class21 var57 = this.field557[var6];
                        if (var57 != null) {
                            this.method46(field276.field89[0], 1, false, var57.field88[0], 0, var57.field89[0], 1, 0, -36, 0, field276.field88[0], 2);
                            this.field127 = super.field920;
                            this.field128 = super.field921;
                            this.field130 = 2;
                            this.field129 = 0;
                            this.field213.method178(false, 41);
                            this.field213.method213(var6, false);
                        }
                    }
                    if (var5 == 164) {
                        this.field213.method178(false, 133);
                        this.field213.method180(var3);
                        this.field213.method212((byte) 5, var4);
                        this.field213.method180(var6);
                        this.field512 = 0;
                        this.field513 = var4;
                        this.field514 = var3;
                        this.field515 = 2;
                        if (class30.method316(var4).field988 == this.field595) {
                            this.field515 = 1;
                        }
                        if (class30.method316(var4).field988 == this.field585) {
                            this.field515 = 3;
                        }
                    }
                    if (var5 == 208) {
                        String var58 = this.field314[arg1];
                        int var59 = var58.indexOf("@whi@");
                        if (var59 != -1) {
                            if (this.field595 == -1) {
                                this.method152(-21279);
                                this.field327 = var58.substring(var59 + 5).trim();
                                this.field570 = false;
                                this.field503 = this.field595 = class30.field1024;
                            } else {
                                this.method136((byte) 3, 0, "Please close the interface you have open before using 'report abuse'", "");
                            }
                        }
                    }
                    if (var5 == 58) {
                        boolean var60 = this.method46(field276.field89[0], 0, false, var3, 0, var4, 0, 0, -36, 0, field276.field88[0], 2);
                        if (!var60) {
                            this.method46(field276.field89[0], 1, false, var3, 0, var4, 1, 0, -36, 0, field276.field88[0], 2);
                        }
                        this.field127 = super.field920;
                        this.field128 = super.field921;
                        this.field130 = 2;
                        this.field129 = 0;
                        this.field213.method178(false, 197);
                        this.field213.method180(var6);
                        this.field213.method212((byte) 5, this.field322 + var3);
                        this.field213.method213(this.field323 + var4, false);
                    }
                    if (var5 == 625) {
                        class10 var62 = this.field304[var6];
                        if (var62 != null) {
                            this.method46(field276.field89[0], 1, false, var62.field88[0], 0, var62.field89[0], 1, 0, -36, 0, field276.field88[0], 2);
                            this.field127 = super.field920;
                            this.field128 = super.field921;
                            this.field130 = 2;
                            this.field129 = 0;
                            field317 += var6;
                            if (field317 >= 119) {
                                this.field213.method178(false, 196);
                                this.field213.method179(12);
                                field317 = 0;
                            }
                            this.field213.method178(false, 223);
                            this.field213.method212((byte) 5, var6);
                        }
                    }
                    if (var5 == 1860) {
                        class10 var63 = this.field304[var6];
                        if (var63 != null) {
                            class20 var64 = var63.field626;
                            if (var64.field733 != null) {
                                var64 = var64.method272(-362);
                            }
                            if (var64 != null) {
                                String var65;
                                if (var64.field746 != null) {
                                    var65 = new String(var64.field746);
                                } else {
                                    var65 = "It's a " + var64.field753 + ".";
                                }
                                this.method136((byte) 3, 0, var65, "");
                            }
                        }
                    }
                    if (var5 == 748 && this.method30((byte) 2, var3, var6, var4)) {
                        this.field213.method178(false, 126);
                        this.field213.method211(35516, var6 >> 14 & 32767);
                        this.field213.method212((byte) 5, this.field497);
                        this.field213.method212((byte) 5, this.field496);
                        this.field213.method213(this.field322 + var3, false);
                        this.field213.method211(35516, this.field323 + var4);
                        this.field213.method211(35516, this.field498);
                    }
                    if (var5 == 65 || var5 == 426) {
                        String var66 = this.field314[arg1];
                        int var67 = var66.indexOf("@whi@");
                        if (var67 != -1) {
                            String var68 = var66.substring(var67 + 5).trim();
                            String var69 = class25.method282(49845, class25.method279(this.field463, class25.method278(var68)));
                            boolean var70 = false;
                            for (int var71 = 0; var71 < this.field558; ++var71) {
                                class21 var72 = this.field557[this.field559[var71]];
                                if (var72 != null && var72.field805 != null && var72.field805.equalsIgnoreCase(var69)) {
                                    this.method46(field276.field89[0], 1, false, var72.field88[0], 0, var72.field89[0], 1, 0, -36, 0, field276.field88[0], 2);
                                    if (var5 == 65) {
                                        ++field575;
                                        if (field575 >= 95) {
                                            this.field213.method178(false, 141);
                                            this.field213.method179(118);
                                            field575 = 0;
                                        }
                                        this.field213.method178(false, 209);
                                        this.field213.method180(this.field559[var71]);
                                    }
                                    if (var5 == 426) {
                                        this.field213.method178(false, 25);
                                        this.field213.method212((byte) 5, this.field559[var71]);
                                    }
                                    var70 = true;
                                    break;
                                }
                            }
                            if (!var70) {
                                this.method136((byte) 3, 0, "Unable to find " + var69, "");
                            }
                        }
                    }
                    if (var5 == 349) {
                        class21 var73 = this.field557[var6];
                        if (var73 != null) {
                            this.method46(field276.field89[0], 1, false, var73.field88[0], 0, var73.field89[0], 1, 0, -36, 0, field276.field88[0], 2);
                            this.field127 = super.field920;
                            this.field128 = super.field921;
                            this.field130 = 2;
                            this.field129 = 0;
                            ++field575;
                            if (field575 >= 95) {
                                this.field213.method178(false, 141);
                                this.field213.method179(118);
                                field575 = 0;
                            }
                            this.field213.method178(false, 209);
                            this.field213.method180(var6);
                        }
                    }
                    this.field495 = 0;
                    this.field183 = 0;
                    if (arg0) {
                        this.field275 = 137;
                    }
                    this.field372 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BI)V")
    public final void method40(byte arg0, int arg1) {
        if (this.field178 == arg0) {
            boolean var3 = false;
        } else {
            this.field150 = this.field492.method189();
        }
        class30 var4 = class30.method316(arg1);
        for (int var5 = 0; var5 < var4.field986.length && var4.field986[var5] != -1; ++var5) {
            class30 var6 = class30.method316(var4.field986[var5]);
            if (var6.field1005 == 1) {
                this.method40((byte) 7, var6.field996);
            }
            var6.field993 = 0;
            var6.field966 = 0;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)V")
    public final void method41(String arg0, String arg1, boolean arg2) {
        signlink.errorname = arg0;
        try {
            if (!arg2) {
                this.field480 = "";
                this.field481 = "Connecting to server...";
                this.method68(true, 444);
            }
            this.field321 = new class42(this, (byte) 5, this.method29(field284 + 43594));
            long var4 = class25.method278(arg0);
            int var6 = (int) (var4 >> 16 & 31L);
            this.field213.field643 = 0;
            this.field213.method179(14);
            this.field213.method179(var6);
            this.field321.method382((byte) 55, this.field213.field642, 0, 2);
            for (int var7 = 0; var7 < 8; ++var7) {
                this.field321.method379();
            }
            int var8 = this.field321.method379();
            int var9 = var8;
            if (var8 == 0) {
                this.field321.method381(this.field492.field642, 0, 8);
                this.field492.field643 = 0;
                this.field221 = this.field492.method195(0);
                int[] var10 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (this.field221 >> 32), (int) this.field221 };
                this.field213.field643 = 0;
                this.field213.method179(10);
                this.field213.method183(var10[0]);
                this.field213.method183(var10[1]);
                this.field213.method183(var10[2]);
                this.field213.method183(var10[3]);
                this.field213.method183(signlink.uid);
                this.field213.method186(arg0);
                this.field213.method186(arg1);
                this.field213.method204(field328, -854, field437);
                this.field462.field643 = 0;
                if (arg2) {
                    this.field462.method179(18);
                } else {
                    this.field462.method179(16);
                }
                this.field462.method179(this.field213.field643 + 36 + 1 + 1 + 2);
                this.field462.method179(255);
                this.field462.method180(336);
                this.field462.method179(field286 ? 1 : 0);
                for (int var11 = 0; var11 < 9; ++var11) {
                    this.field462.method183(this.field491[var11]);
                }
                this.field462.method187(this.field213.field643, this.field213.field642, 0, 0);
                this.field213.field647 = new class17(var10, 711);
                for (int var12 = 0; var12 < 4; ++var12) {
                    var10[var12] += 50;
                }
                this.field460 = new class17(var10, 711);
                this.field321.method382((byte) 55, this.field462.field642, 0, this.field462.field643);
                var8 = this.field321.method379();
            }
            if (var8 == 1) {
                try {
                    Thread.sleep(2000L);
                } catch (Exception var22) {
                }
                this.method41(arg0, arg1, arg2);
            } else if (var8 == 2) {
                this.field573 = this.field321.method379();
                field263 = this.field321.method379() == 1;
                this.field434 = 0L;
                this.field239 = 0;
                this.field214.field603 = 0;
                super.field910 = true;
                this.field225 = true;
                this.field528 = true;
                this.field213.field643 = 0;
                this.field492.field643 = 0;
                this.field150 = -1;
                this.field343 = -1;
                this.field344 = -1;
                this.field345 = -1;
                this.field149 = 0;
                this.field151 = 0;
                this.field404 = 0;
                this.field153 = 0;
                this.field359 = 0;
                this.field601 = 0;
                this.field396 = false;
                super.field911 = 0;
                for (int var13 = 0; var13 < 100; ++var13) {
                    this.field357[var13] = null;
                }
                this.field495 = 0;
                this.field183 = 0;
                this.field577 = 0;
                this.field507 = 0;
                this.field280 = (int) (Math.random() * 100.0D) - 50;
                this.field165 = (int) (Math.random() * 110.0D) - 55;
                this.field333 = (int) (Math.random() * 80.0D) - 40;
                this.field465 = (int) (Math.random() * 120.0D) - 60;
                this.field547 = (int) (Math.random() * 30.0D) - 20;
                this.field207 = (int) (Math.random() * 20.0D) - 10 & 2047;
                this.field470 = 0;
                this.field489 = -1;
                this.field424 = 0;
                this.field425 = 0;
                this.field558 = 0;
                this.field305 = 0;
                for (int var14 = 0; var14 < this.field555; ++var14) {
                    this.field557[var14] = null;
                    this.field562[var14] = null;
                }
                for (int var15 = 0; var15 < 16384; ++var15) {
                    this.field304[var15] = null;
                }
                field276 = this.field557[this.field556] = new class21();
                this.field274.method596();
                this.field282.method596();
                for (int var16 = 0; var16 < 4; ++var16) {
                    for (int var17 = 0; var17 < 104; ++var17) {
                        for (int var18 = 0; var18 < 104; ++var18) {
                            this.field504[var16][var17][var18] = null;
                        }
                    }
                }
                this.field257 = new class70(-489);
                this.field299 = 0;
                this.field298 = 0;
                this.method135(-10386, this.field194);
                this.field194 = -1;
                this.method135(-10386, this.field585);
                this.field585 = -1;
                this.method135(-10386, this.field595);
                this.field595 = -1;
                this.method135(-10386, this.field584);
                this.field584 = -1;
                this.method135(-10386, this.field342);
                this.field342 = -1;
                this.method135(-10386, this.field510);
                this.field510 = -1;
                this.field587 = false;
                this.field384 = 3;
                this.field502 = 0;
                this.field396 = false;
                this.field436 = false;
                this.field223 = null;
                this.field412 = 0;
                this.field567 = -1;
                this.field332 = true;
                this.method84(false);
                for (int var19 = 0; var19 < 5; ++var19) {
                    this.field444[var19] = 0;
                }
                for (int var20 = 0; var20 < 5; ++var20) {
                    this.field542[var20] = null;
                    this.field543[var20] = false;
                }
                field575 = 0;
                field381 = 0;
                field310 = 0;
                field505 = 0;
                field369 = 0;
                field317 = 0;
                field291 = 0;
                field473 = 0;
                field382 = 0;
                field182 = 0;
                this.method118(true);
            } else if (var8 == 3) {
                this.field480 = "";
                this.field481 = "Invalid username or password.";
            } else if (var8 == 4) {
                this.field480 = "Your account has been disabled.";
                this.field481 = "Please check your message-centre for details.";
            } else if (var8 == 5) {
                this.field480 = "Your account is already logged in.";
                this.field481 = "Try again in 60 secs...";
            } else if (var8 == 6) {
                this.field480 = "RuneScape has been updated!";
                this.field481 = "Please reload this page.";
            } else if (var8 == 7) {
                this.field480 = "This world is full.";
                this.field481 = "Please use a different world.";
            } else if (var8 == 8) {
                this.field480 = "Unable to connect.";
                this.field481 = "Login server offline.";
            } else if (var8 == 9) {
                this.field480 = "Login limit exceeded.";
                this.field481 = "Too many connections from your address.";
            } else if (var8 == 10) {
                this.field480 = "Unable to connect.";
                this.field481 = "Bad session id.";
            } else if (var8 == 11) {
                this.field480 = "Login server rejected session.";
                this.field481 = "Please try again.";
            } else if (var8 == 12) {
                this.field480 = "You need a members account to login to this world.";
                this.field481 = "Please subscribe, or use a different world.";
            } else if (var8 == 13) {
                this.field480 = "Could not complete login.";
                this.field481 = "Please try using a different world.";
            } else if (var8 == 14) {
                this.field480 = "The server is being updated.";
                this.field481 = "Please wait 1 minute and try again.";
            } else if (var8 == 15) {
                this.field528 = true;
                this.field213.field643 = 0;
                this.field492.field643 = 0;
                this.field150 = -1;
                this.field343 = -1;
                this.field344 = -1;
                this.field345 = -1;
                this.field149 = 0;
                this.field151 = 0;
                this.field404 = 0;
                this.field601 = 0;
                this.field396 = false;
                this.field187 = System.currentTimeMillis();
            } else if (var8 == 16) {
                this.field480 = "Login attempts exceeded.";
                this.field481 = "Please wait 1 minute and try again.";
            } else if (var8 == 17) {
                this.field480 = "You are standing in a members-only area.";
                this.field481 = "To play on this world move to a free area first";
            } else if (var8 == 20) {
                this.field480 = "Invalid loginserver requested";
                this.field481 = "Please try using a different world.";
            } else if (var8 != 21) {
                if (var8 == 22) {
                    this.field480 = "Malformed login packet.";
                    this.field481 = "Please try again.";
                } else if (var8 == -1) {
                    if (var9 == 0) {
                        if (this.field397 < 2) {
                            try {
                                Thread.sleep(2000L);
                            } catch (Exception var24) {
                            }
                            ++this.field397;
                            this.method41(arg0, arg1, arg2);
                        } else {
                            this.field480 = "No response from loginserver";
                            this.field481 = "Please wait 1 minute and try again.";
                        }
                    } else {
                        this.field480 = "No response from server";
                        this.field481 = "Please try using a different world.";
                    }
                } else {
                    System.out.println("response:" + var8);
                    this.field480 = "Unexpected server response";
                    this.field481 = "Please try using a different world.";
                }
            } else {
                int var21 = this.field321.method379();
                for (int var26 = var21 + 3; var26 >= 0; --var26) {
                    this.field480 = "You have only just left another world";
                    this.field481 = "Your profile will be transferred in: " + var26;
                    this.method68(true, 444);
                    try {
                        Thread.sleep(1200L);
                    } catch (Exception var23) {
                    }
                }
                this.method41(arg0, arg1, arg2);
            }
        } catch (IOException var25) {
            this.field480 = "";
            this.field481 = "Error connecting to server.";
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(ZI)V")
    public final void method42(boolean arg0, int arg1) {
        if (arg0) {
            this.field597 = !this.field597;
        }
        if (!field286) {
            if (class4.field44[17] >= arg1) {
                class47 var3 = class4.field38[17];
                int var4 = var3.field1270 * var3.field1269 - 1;
                int var5 = this.field181 * var3.field1269 * 2;
                byte[] var6 = var3.field1267;
                byte[] var7 = this.field393;
                for (int var8 = 0; var8 <= var4; ++var8) {
                    var7[var8] = var6[var8 - var5 & var4];
                }
                var3.field1267 = var7;
                this.field393 = var6;
                class4.method9(17, (byte) 4);
            }
            if (class4.field44[24] >= arg1) {
                class47 var9 = class4.field38[24];
                int var10 = var9.field1270 * var9.field1269 - 1;
                int var11 = this.field181 * var9.field1269 * 2;
                byte[] var12 = var9.field1267;
                byte[] var13 = this.field393;
                for (int var14 = 0; var14 <= var10; ++var14) {
                    var13[var14] = var12[var14 - var11 & var10];
                }
                var9.field1267 = var13;
                this.field393 = var12;
                class4.method9(24, (byte) 4);
            }
            if (class4.field44[34] >= arg1) {
                class47 var15 = class4.field38[34];
                int var16 = var15.field1270 * var15.field1269 - 1;
                int var17 = this.field181 * var15.field1269 * 2;
                byte[] var18 = var15.field1267;
                byte[] var19 = this.field393;
                for (int var20 = 0; var20 <= var16; ++var20) {
                    var19[var20] = var18[var20 - var17 & var16];
                }
                var15.field1267 = var19;
                this.field393 = var18;
                class4.method9(34, (byte) 4);
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(I)V")
    public final void method43(int arg0) {
        for (int var2 = -1; var2 < this.field558; ++var2) {
            int var3;
            if (var2 == -1) {
                var3 = this.field556;
            } else {
                var3 = this.field559[var2];
            }
            class21 var4 = this.field557[var3];
            if (var4 != null) {
                this.method102(7, 1, var4);
            }
        }
        ++field432;
        while (arg0 >= 0) {
            field500 = !field500;
        }
        if (field432 > 67) {
            field432 = 0;
            this.field213.method178(false, 222);
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(Z)V")
    public final void method44(boolean arg0) {
        if (super.field906 == null) {
            this.method165(0);
            this.field240 = null;
            this.field241 = null;
            this.field242 = null;
            this.field243 = null;
            this.field244 = null;
            this.field245 = null;
            this.field246 = null;
            this.field247 = null;
            this.field248 = null;
            this.field391 = null;
            this.field528 &= arg0;
            this.field389 = null;
            this.field388 = null;
            this.field390 = null;
            this.field215 = null;
            this.field216 = null;
            this.field217 = null;
            super.field906 = new class57(765, true, this.method73((byte) 0), 503);
            this.field379 = true;
        }
    }

    @OriginalMember(owner = "client", name = "i", descriptor = "(B)V")
    public final void method45(byte arg0) {
        try {
            if (this.field321 != null) {
                this.field321.method378();
            }
        } catch (Exception var3) {
        }
        this.field321 = null;
        this.field528 = false;
        this.field293 = 0;
        this.field294 = "";
        this.field295 = "";
        this.method80(true);
        if (this.field287 != arg0) {
            this.field330 = !this.field330;
        }
        this.field121.method538(true);
        for (int var2 = 0; var2 < 4; ++var2) {
            this.field563[var2].method500();
        }
        System.gc();
        this.method97(0);
        this.field264 = -1;
        this.field131 = -1;
        this.field536 = 0;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIZIIIIIIIII)Z")
    public final boolean method46(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        byte var13 = 104;
        byte var14 = 104;
        for (int var15 = 0; var15 < var13; ++var15) {
            for (int var35 = 0; var35 < var14; ++var35) {
                this.field516[var15][var35] = 0;
                this.field195[var15][var35] = 99999999;
            }
        }
        int var16 = arg10;
        int var17 = arg0;
        this.field516[arg10][arg0] = 99;
        this.field195[arg10][arg0] = 0;
        byte var18 = 0;
        int var19 = 0;
        this.field529[var18] = arg10;
        int var36 = var18 + 1;
        this.field530[var18] = arg0;
        if (arg8 >= 0) {
            this.field213.method179(1);
        }
        boolean var20 = false;
        int var21 = this.field529.length;
        int[][] var22 = this.field563[this.field326].field1523;
        while (var36 != var19) {
            var16 = this.field529[var19];
            var17 = this.field530[var19];
            var19 = (var19 + 1) % var21;
            if (arg3 == var16 && arg5 == var17) {
                var20 = true;
                break;
            }
            if (arg9 != 0) {
                if ((arg9 < 5 || arg9 == 10) && this.field563[this.field326].method509(arg9 - 1, 907, var17, arg3, var16, arg5, arg4)) {
                    var20 = true;
                    break;
                }
                if (arg9 < 10 && this.field563[this.field326].method510(arg9 - 1, arg3, var16, var17, arg4, -25, arg5)) {
                    var20 = true;
                    break;
                }
            }
            if (arg1 != 0 && arg6 != 0 && this.field563[this.field326].method511(var16, (byte) 66, arg7, var17, arg3, arg5, arg1, arg6)) {
                var20 = true;
                break;
            }
            int var34 = this.field195[var16][var17] + 1;
            if (var16 > 0 && this.field516[var16 - 1][var17] == 0 && (var22[var16 - 1][var17] & 19398920) == 0) {
                this.field529[var36] = var16 - 1;
                this.field530[var36] = var17;
                var36 = (var36 + 1) % var21;
                this.field516[var16 - 1][var17] = 2;
                this.field195[var16 - 1][var17] = var34;
            }
            if (var16 < var13 - 1 && this.field516[var16 + 1][var17] == 0 && (var22[var16 + 1][var17] & 19399040) == 0) {
                this.field529[var36] = var16 + 1;
                this.field530[var36] = var17;
                var36 = (var36 + 1) % var21;
                this.field516[var16 + 1][var17] = 8;
                this.field195[var16 + 1][var17] = var34;
            }
            if (var17 > 0 && this.field516[var16][var17 - 1] == 0 && (var22[var16][var17 - 1] & 19398914) == 0) {
                this.field529[var36] = var16;
                this.field530[var36] = var17 - 1;
                var36 = (var36 + 1) % var21;
                this.field516[var16][var17 - 1] = 1;
                this.field195[var16][var17 - 1] = var34;
            }
            if (var17 < var14 - 1 && this.field516[var16][var17 + 1] == 0 && (var22[var16][var17 + 1] & 19398944) == 0) {
                this.field529[var36] = var16;
                this.field530[var36] = var17 + 1;
                var36 = (var36 + 1) % var21;
                this.field516[var16][var17 + 1] = 4;
                this.field195[var16][var17 + 1] = var34;
            }
            if (var16 > 0 && var17 > 0 && this.field516[var16 - 1][var17 - 1] == 0 && (var22[var16 - 1][var17 - 1] & 19398926) == 0 && (var22[var16 - 1][var17] & 19398920) == 0 && (var22[var16][var17 - 1] & 19398914) == 0) {
                this.field529[var36] = var16 - 1;
                this.field530[var36] = var17 - 1;
                var36 = (var36 + 1) % var21;
                this.field516[var16 - 1][var17 - 1] = 3;
                this.field195[var16 - 1][var17 - 1] = var34;
            }
            if (var16 < var13 - 1 && var17 > 0 && this.field516[var16 + 1][var17 - 1] == 0 && (var22[var16 + 1][var17 - 1] & 19399043) == 0 && (var22[var16 + 1][var17] & 19399040) == 0 && (var22[var16][var17 - 1] & 19398914) == 0) {
                this.field529[var36] = var16 + 1;
                this.field530[var36] = var17 - 1;
                var36 = (var36 + 1) % var21;
                this.field516[var16 + 1][var17 - 1] = 9;
                this.field195[var16 + 1][var17 - 1] = var34;
            }
            if (var16 > 0 && var17 < var14 - 1 && this.field516[var16 - 1][var17 + 1] == 0 && (var22[var16 - 1][var17 + 1] & 19398968) == 0 && (var22[var16 - 1][var17] & 19398920) == 0 && (var22[var16][var17 + 1] & 19398944) == 0) {
                this.field529[var36] = var16 - 1;
                this.field530[var36] = var17 + 1;
                var36 = (var36 + 1) % var21;
                this.field516[var16 - 1][var17 + 1] = 6;
                this.field195[var16 - 1][var17 + 1] = var34;
            }
            if (var16 < var13 - 1 && var17 < var14 - 1 && this.field516[var16 + 1][var17 + 1] == 0 && (var22[var16 + 1][var17 + 1] & 19399136) == 0 && (var22[var16 + 1][var17] & 19399040) == 0 && (var22[var16][var17 + 1] & 19398944) == 0) {
                this.field529[var36] = var16 + 1;
                this.field530[var36] = var17 + 1;
                var36 = (var36 + 1) % var21;
                this.field516[var16 + 1][var17 + 1] = 12;
                this.field195[var16 + 1][var17 + 1] = var34;
            }
        }
        this.field461 = 0;
        if (!var20) {
            if (arg2) {
                int var23 = 100;
                for (int var24 = 1; var24 < 2; ++var24) {
                    for (int var25 = arg3 - var24; var25 <= arg3 + var24; ++var25) {
                        for (int var26 = arg5 - var24; var26 <= arg5 + var24; ++var26) {
                            if (var25 >= 0 && var26 >= 0 && var25 < 104 && var26 < 104 && this.field195[var25][var26] < var23) {
                                var23 = this.field195[var25][var26];
                                var16 = var25;
                                var17 = var26;
                                this.field461 = 1;
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
        this.field529[var27] = var16;
        int var37 = var27 + 1;
        this.field530[var27] = var17;
        int var28;
        int var29 = var28 = this.field516[var16][var17];
        while (arg10 != var16 || arg0 != var17) {
            if (var28 != var29) {
                var28 = var29;
                this.field529[var37] = var16;
                this.field530[var37++] = var17;
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
            var29 = this.field516[var16][var17];
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
            int var31 = this.field529[var37];
            int var32 = this.field530[var37];
            ++field473;
            if (field473 >= 101) {
                this.field213.method178(false, 106);
                field473 = 0;
            }
            if (arg11 == 0) {
                this.field213.method178(false, 225);
                this.field213.method179(var30 + var30 + 3);
            }
            if (arg11 == 1) {
                this.field213.method178(false, 160);
                this.field213.method179(var30 + var30 + 3 + 14);
            }
            if (arg11 == 2) {
                this.field213.method178(false, 234);
                this.field213.method179(var30 + var30 + 3);
            }
            this.field213.method211(35516, this.field323 + var32);
            this.field424 = this.field529[0];
            this.field425 = this.field530[0];
            for (int var33 = 1; var33 < var30; ++var33) {
                --var37;
                this.field213.method205(this.field529[var37] - var31, 6);
                this.field213.method205(this.field530[var37] - var32, 6);
            }
            this.field213.method213(this.field322 + var31, false);
            this.field213.method179(super.field923[5] == 1 ? 1 : 0);
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIB)LFNOQZAYQ;")
    public final class14 method47(String arg0, String arg1, int arg2, int arg3, int arg4, byte arg5) {
        if (this.field290 != arg5) {
            field273 = !field273;
        }
        byte[] var7 = null;
        int var8 = 5;
        try {
            if (this.field309[0] != null) {
                var7 = this.field309[0].method259(arg4, -25);
            }
        } catch (Exception var30) {
        }
        if (var7 != null) {
            this.field222.reset();
            this.field222.update(var7);
            int var9 = (int) this.field222.getValue();
            if (arg2 != var9) {
                var7 = null;
            }
        }
        if (var7 != null) {
            return new class14(var7, 754);
        } else {
            int var11 = 0;
            while (var7 == null) {
                String var12 = "Unknown error";
                this.method27(arg3, "Requesting " + arg0, -211);
                Object var13 = null;
                try {
                    int var14 = 0;
                    DataInputStream var15 = this.method162(arg1 + arg2);
                    byte[] var16 = new byte[6];
                    var15.readFully(var16, 0, 6);
                    class11 var17 = new class11(var16, field500);
                    var17.field643 = 3;
                    int var18 = var17.method193() + 6;
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
                            this.method27(arg3, "Loading " + arg0 + " - " + var23 + "%", -211);
                        }
                        var14 = var23;
                    }
                    var15.close();
                    try {
                        if (this.field309[0] != null) {
                            this.field309[0].method260(var7.length, var7, arg4, 0);
                        }
                    } catch (Exception var29) {
                        this.field309[0] = null;
                    }
                    if (var7 != null) {
                        this.field222.reset();
                        this.field222.update(var7);
                        int var24 = (int) this.field222.getValue();
                        if (arg2 != var24) {
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
                            this.method27(arg3, "Game updated - please reload page", -211);
                            var26 = 10;
                        } else {
                            this.method27(arg3, var12 + " - Retrying in " + var26, -211);
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
                    this.field157 = !this.field157;
                }
            }
            return new class14(var7, 754);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IZ)V")
    public final void method48(int arg0, boolean arg1) {
        for (int var3 = 0; var3 < this.field305; ++var3) {
            class10 var5 = this.field304[this.field306[var3]];
            int var6 = (this.field306[var3] << 14) + 536870912;
            if (var5 != null && var5.method20(false) && var5.field626.field754 == arg1 && var5.field626.method267((byte) 9)) {
                int var7 = var5.field102 >> 7;
                int var8 = var5.field103 >> 7;
                if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                    if (var5.field68 == 1 && (var5.field102 & 127) == 64 && (var5.field103 & 127) == 64) {
                        if (this.field433[var7][var8] == this.field410) {
                            continue;
                        }
                        this.field433[var7][var8] = this.field410;
                    }
                    if (!var5.field626.field762) {
                        var6 += Integer.MIN_VALUE;
                    }
                    this.field121.method549(var6, var5, var5.field103, var5.field104, this.method83(this.field326, true, var5.field102, var5.field103), 832, (var5.field68 - 1) * 64 + 60, var5.field102, var5.field65, this.field326);
                }
            }
        }
        int var4 = 25 / arg0;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LLUAMUNXO;IIIIIII)V")
    public final void method49(class30 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg0.field1005 == 0 && arg0.field986 != null && !arg0.field1026) {
            if (arg6 >= arg7 && arg2 >= arg1 && arg6 <= arg0.field1004 + arg7 && arg2 <= arg0.field1028 + arg1) {
                int var9 = arg0.field986.length;
                if (arg3 != 0) {
                    this.field504 = null;
                }
                for (int var10 = 0; var10 < var9; ++var10) {
                    int var11 = arg0.field992[var10] + arg7;
                    int var12 = arg0.field1010[var10] + arg1 - arg5;
                    class30 var13 = class30.method316(arg0.field986[var10]);
                    int var14 = var13.field1020 + var11;
                    int var15 = var13.field984 + var12;
                    if ((var13.field983 >= 0 || var13.field985 != 0) && arg6 >= var14 && arg2 >= var15 && arg6 < var13.field1004 + var14 && arg2 < var13.field1028 + var15) {
                        if (var13.field983 >= 0) {
                            this.field272 = var13.field983;
                        } else {
                            this.field272 = var13.field996;
                        }
                    }
                    if (var13.field1005 == 8 && arg6 >= var14 && arg2 >= var15 && arg6 < var13.field1004 + var14 && arg2 < var13.field1028 + var15) {
                        this.field155 = var13.field996;
                    }
                    if (var13.field1005 == 0) {
                        this.method49(var13, var15, arg2, 0, arg4, var13.field989, arg6, var14);
                        if (var13.field1027 > var13.field1028) {
                            this.method78(arg6, var13.field1004 + var14, var13.field1027, arg2, arg4, false, var15, var13.field1028, var13);
                        }
                    } else {
                        if (var13.field982 == 1 && arg6 >= var14 && arg2 >= var15 && arg6 < var13.field1004 + var14 && arg2 < var13.field1028 + var15) {
                            boolean var16 = false;
                            if (var13.field963 != 0) {
                                var16 = this.method25((byte) 2, var13);
                            }
                            if (!var16) {
                                this.field314[this.field601] = var13.field1001;
                                this.field429[this.field601] = 236;
                                this.field428[this.field601] = var13.field996;
                                ++this.field601;
                            }
                        }
                        if (var13.field982 == 2 && this.field183 == 0 && arg6 >= var14 && arg2 >= var15 && arg6 < var13.field1004 + var14 && arg2 < var13.field1028 + var15) {
                            String var17 = var13.field1011;
                            if (var17.indexOf(" ") != -1) {
                                var17 = var17.substring(0, var17.indexOf(" "));
                            }
                            this.field314[this.field601] = var17 + " @gre@" + var13.field977;
                            this.field429[this.field601] = 686;
                            this.field428[this.field601] = var13.field996;
                            ++this.field601;
                        }
                        if (var13.field982 == 3 && arg6 >= var14 && arg2 >= var15 && arg6 < var13.field1004 + var14 && arg2 < var13.field1028 + var15) {
                            this.field314[this.field601] = "Close";
                            if (arg4 == 3) {
                                this.field429[this.field601] = 567;
                            } else {
                                this.field429[this.field601] = 407;
                            }
                            this.field428[this.field601] = var13.field996;
                            ++this.field601;
                        }
                        if (var13.field982 == 4 && arg6 >= var14 && arg2 >= var15 && arg6 < var13.field1004 + var14 && arg2 < var13.field1028 + var15) {
                            this.field314[this.field601] = var13.field1001;
                            this.field429[this.field601] = 509;
                            this.field428[this.field601] = var13.field996;
                            ++this.field601;
                        }
                        if (var13.field982 == 5 && arg6 >= var14 && arg2 >= var15 && arg6 < var13.field1004 + var14 && arg2 < var13.field1028 + var15) {
                            this.field314[this.field601] = var13.field1001;
                            this.field429[this.field601] = 192;
                            this.field428[this.field601] = var13.field996;
                            ++this.field601;
                        }
                        if (var13.field982 == 6 && !this.field587 && arg6 >= var14 && arg2 >= var15 && arg6 < var13.field1004 + var14 && arg2 < var13.field1028 + var15) {
                            this.field314[this.field601] = var13.field1001;
                            this.field429[this.field601] = 591;
                            this.field428[this.field601] = var13.field996;
                            ++this.field601;
                        }
                        if (var13.field1005 == 2) {
                            int var18 = 0;
                            for (int var19 = 0; var19 < var13.field1028; ++var19) {
                                for (int var20 = 0; var20 < var13.field1004; ++var20) {
                                    int var21 = (var13.field964 + 32) * var20 + var14;
                                    int var22 = (var13.field1014 + 32) * var19 + var15;
                                    if (var18 < 20) {
                                        var21 += var13.field990[var18];
                                        var22 += var13.field975[var18];
                                    }
                                    if (arg6 >= var21 && arg2 >= var22 && arg6 < var21 + 32 && arg2 < var22 + 32) {
                                        this.field468 = var18;
                                        this.field469 = var13.field996;
                                        if (var13.field956[var18] > 0) {
                                            class26 var23 = class26.method293(var13.field956[var18] - 1);
                                            if (this.field495 == 1 && var13.field994) {
                                                if (this.field497 != var13.field996 || this.field496 != var18) {
                                                    this.field314[this.field601] = "Use " + this.field499 + " with @lre@" + var23.field844;
                                                    this.field429[this.field601] = 526;
                                                    this.field430[this.field601] = var23.field885;
                                                    this.field427[this.field601] = var18;
                                                    this.field428[this.field601] = var13.field996;
                                                    ++this.field601;
                                                }
                                            } else if (this.field183 == 1 && var13.field994) {
                                                if ((this.field185 & 16) == 16) {
                                                    this.field314[this.field601] = this.field186 + " @lre@" + var23.field844;
                                                    this.field429[this.field601] = 562;
                                                    this.field430[this.field601] = var23.field885;
                                                    this.field427[this.field601] = var18;
                                                    this.field428[this.field601] = var13.field996;
                                                    ++this.field601;
                                                }
                                            } else {
                                                if (var13.field994) {
                                                    for (int var24 = 4; var24 >= 3; --var24) {
                                                        if (var23.field860 != null && var23.field860[var24] != null) {
                                                            this.field314[this.field601] = var23.field860[var24] + " @lre@" + var23.field844;
                                                            if (var24 == 3) {
                                                                this.field429[this.field601] = 503;
                                                            }
                                                            if (var24 == 4) {
                                                                this.field429[this.field601] = 914;
                                                            }
                                                            this.field430[this.field601] = var23.field885;
                                                            this.field427[this.field601] = var18;
                                                            this.field428[this.field601] = var13.field996;
                                                            ++this.field601;
                                                        } else if (var24 == 4) {
                                                            this.field314[this.field601] = "Drop @lre@" + var23.field844;
                                                            this.field429[this.field601] = 914;
                                                            this.field430[this.field601] = var23.field885;
                                                            this.field427[this.field601] = var18;
                                                            this.field428[this.field601] = var13.field996;
                                                            ++this.field601;
                                                        }
                                                    }
                                                }
                                                if (var13.field998) {
                                                    this.field314[this.field601] = "Use @lre@" + var23.field844;
                                                    this.field429[this.field601] = 711;
                                                    this.field430[this.field601] = var23.field885;
                                                    this.field427[this.field601] = var18;
                                                    this.field428[this.field601] = var13.field996;
                                                    ++this.field601;
                                                }
                                                if (var13.field994 && var23.field860 != null) {
                                                    for (int var25 = 2; var25 >= 0; --var25) {
                                                        if (var23.field860[var25] != null) {
                                                            this.field314[this.field601] = var23.field860[var25] + " @lre@" + var23.field844;
                                                            if (var25 == 0) {
                                                                this.field429[this.field601] = 871;
                                                            }
                                                            if (var25 == 1) {
                                                                this.field429[this.field601] = 164;
                                                            }
                                                            if (var25 == 2) {
                                                                this.field429[this.field601] = 137;
                                                            }
                                                            this.field430[this.field601] = var23.field885;
                                                            this.field427[this.field601] = var18;
                                                            this.field428[this.field601] = var13.field996;
                                                            ++this.field601;
                                                        }
                                                    }
                                                }
                                                if (var13.field1022 != null) {
                                                    for (int var26 = 4; var26 >= 0; --var26) {
                                                        if (var13.field1022[var26] != null) {
                                                            this.field314[this.field601] = var13.field1022[var26] + " @lre@" + var23.field844;
                                                            if (var26 == 0) {
                                                                this.field429[this.field601] = 959;
                                                            }
                                                            if (var26 == 1) {
                                                                this.field429[this.field601] = 433;
                                                            }
                                                            if (var26 == 2) {
                                                                this.field429[this.field601] = 18;
                                                            }
                                                            if (var26 == 3) {
                                                                this.field429[this.field601] = 601;
                                                            }
                                                            if (var26 == 4) {
                                                                this.field429[this.field601] = 511;
                                                            }
                                                            this.field430[this.field601] = var23.field885;
                                                            this.field427[this.field601] = var18;
                                                            this.field428[this.field601] = var13.field996;
                                                            ++this.field601;
                                                        }
                                                    }
                                                }
                                                this.field314[this.field601] = "Examine @lre@" + var23.field844;
                                                this.field429[this.field601] = 1675;
                                                this.field430[this.field601] = var23.field885;
                                                this.field427[this.field601] = var18;
                                                this.field428[this.field601] = var13.field996;
                                                ++this.field601;
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

    @OriginalMember(owner = "client", name = "g", descriptor = "(I)V")
    public final void method50(int arg0) {
        int var2 = this.field249 * 128 + 64;
        int var3 = this.field250 * 128 + 64;
        int var4 = this.method83(this.field326, true, var2, var3) - this.field251;
        if (this.field346 < var2) {
            this.field346 += (var2 - this.field346) * this.field253 / 1000 + this.field252;
            if (this.field346 > var2) {
                this.field346 = var2;
            }
        }
        if (this.field346 > var2) {
            this.field346 -= (this.field346 - var2) * this.field253 / 1000 + this.field252;
            if (this.field346 < var2) {
                this.field346 = var2;
            }
        }
        if (this.field347 < var4) {
            this.field347 += (var4 - this.field347) * this.field253 / 1000 + this.field252;
            if (this.field347 > var4) {
                this.field347 = var4;
            }
        }
        if (this.field347 > var4) {
            this.field347 -= (this.field347 - var4) * this.field253 / 1000 + this.field252;
            if (this.field347 < var4) {
                this.field347 = var4;
            }
        }
        if (this.field348 < var3) {
            this.field348 += (var3 - this.field348) * this.field253 / 1000 + this.field252;
            if (this.field348 > var3) {
                this.field348 = var3;
            }
        }
        if (this.field348 > var3) {
            this.field348 -= (this.field348 - var3) * this.field253 / 1000 + this.field252;
            if (this.field348 < var3) {
                this.field348 = var3;
            }
        }
        ++field180;
        if (field180 > 82) {
            field180 = 0;
            this.field213.method178(false, 250);
        }
        int var5 = this.field579 * 128 + 64;
        int var6 = this.field580 * 128 + 64;
        while (arg0 >= 0) {
            this.field150 = -1;
        }
        int var7 = this.method83(this.field326, true, var5, var6) - this.field581;
        int var8 = var5 - this.field346;
        int var9 = var7 - this.field347;
        int var10 = var6 - this.field348;
        int var11 = (int) Math.sqrt((double) (var8 * var8 + var10 * var10));
        int var12 = (int) (Math.atan2((double) var9, (double) var11) * 325.949D) & 2047;
        int var13 = (int) (Math.atan2((double) var8, (double) var10) * -325.949D) & 2047;
        if (var12 < 128) {
            var12 = 128;
        }
        if (var12 > 383) {
            var12 = 383;
        }
        if (this.field349 < var12) {
            this.field349 += (var12 - this.field349) * this.field583 / 1000 + this.field582;
            if (this.field349 > var12) {
                this.field349 = var12;
            }
        }
        if (this.field349 > var12) {
            this.field349 -= (this.field349 - var12) * this.field583 / 1000 + this.field582;
            if (this.field349 < var12) {
                this.field349 = var12;
            }
        }
        int var14 = var13 - this.field350;
        if (var14 > 1024) {
            var14 -= 2048;
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (var14 > 0) {
            this.field350 += this.field583 * var14 / 1000 + this.field582;
            this.field350 &= 2047;
        }
        if (var14 < 0) {
            this.field350 -= -var14 * this.field583 / 1000 + this.field582;
            this.field350 &= 2047;
        }
        int var15 = var13 - this.field350;
        if (var15 > 1024) {
            var15 -= 2048;
        }
        if (var15 < -1024) {
            var15 += 2048;
        }
        if (var15 < 0 && var14 > 0 || var15 > 0 && var14 < 0) {
            this.field350 = var13;
        }
    }

    @OriginalMember(owner = "client", name = "j", descriptor = "(B)V")
    public final void method51(byte arg0) {
        this.field388.method455(0);
        class4.field36 = this.field440;
        this.field236.method390((byte) 50, 0, 0);
        if (arg0 != 3) {
            this.field275 = -449;
        }
        if (this.field342 != -1) {
            this.method138(0, 0, 0, class30.method316(this.field342), 0);
        } else if (this.field398[this.field384] != -1) {
            this.method138(0, 0, 0, class30.method316(this.field398[this.field384]), 0);
        }
        if (this.field396 && this.field521 == 1) {
            this.method59(4);
        }
        this.field388.method456(553, 722, super.field905, 205);
        this.field390.method455(0);
        class4.field36 = this.field441;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LLUAMUNXO;I)V")
    public final void method52(class30 arg0, int arg1) {
        int var3 = arg0.field963;
        if (arg1 != 5) {
            for (int var4 = 1; var4 > 0; ++var4) {
            }
        }
        if ((var3 < 1 || var3 > 100) && (var3 < 701 || var3 > 800)) {
            if (var3 >= 101 && var3 <= 200 || var3 >= 801 && var3 <= 900) {
                int var6 = this.field298;
                if (this.field299 != 2) {
                    var6 = 0;
                }
                if (var3 > 800) {
                    var3 -= 701;
                } else {
                    var3 -= 101;
                }
                if (var3 >= var6) {
                    arg0.field1003 = "";
                    arg0.field982 = 0;
                } else {
                    if (this.field484[var3] == 0) {
                        arg0.field1003 = "@red@Offline";
                    } else if (this.field484[var3] < 200) {
                        if (this.field484[var3] == field283) {
                            arg0.field1003 = "@gre@World-" + (this.field484[var3] - 9);
                        } else {
                            arg0.field1003 = "@yel@World-" + (this.field484[var3] - 9);
                        }
                    } else if (this.field484[var3] == field283) {
                        arg0.field1003 = "@gre@Classic" + (this.field484[var3] - 219);
                    } else {
                        arg0.field1003 = "@yel@Classic" + (this.field484[var3] - 219);
                    }
                    arg0.field982 = 1;
                }
            } else if (var3 == 203) {
                int var7 = this.field298;
                if (this.field299 != 2) {
                    var7 = 0;
                }
                arg0.field1027 = var7 * 15 + 20;
                if (arg0.field1027 <= arg0.field1028) {
                    arg0.field1027 = arg0.field1028 + 1;
                }
            } else if (var3 >= 401 && var3 <= 500) {
                var3 -= 401;
                if (var3 == 0 && this.field299 == 0) {
                    arg0.field1003 = "Loading ignore list";
                    arg0.field982 = 0;
                } else if (var3 == 1 && this.field299 == 0) {
                    arg0.field1003 = "Please wait...";
                    arg0.field982 = 0;
                } else {
                    int var8 = this.field120;
                    if (this.field299 == 0) {
                        var8 = 0;
                    }
                    if (var3 >= var8) {
                        arg0.field1003 = "";
                        arg0.field982 = 0;
                    } else {
                        arg0.field1003 = class25.method282(49845, class25.method279(this.field463, this.field367[var3]));
                        arg0.field982 = 1;
                    }
                }
            } else if (var3 == 503) {
                arg0.field1027 = this.field120 * 15 + 20;
                if (arg0.field1027 <= arg0.field1028) {
                    arg0.field1027 = arg0.field1028 + 1;
                }
            } else if (var3 == 327) {
                arg0.field969 = 150;
                arg0.field970 = (int) (Math.sin((double) field438 / 40.0D) * 256.0D) & 2047;
                if (this.field376) {
                    for (int var9 = 0; var9 < 7; ++var9) {
                        int var16 = this.field122[var9];
                        if (var16 >= 0 && !class9.field617[var16].method171(-980)) {
                            return;
                        }
                    }
                    this.field376 = false;
                    class55[] var10 = new class55[7];
                    int var11 = 0;
                    for (int var12 = 0; var12 < 7; ++var12) {
                        int var15 = this.field122[var12];
                        if (var15 >= 0) {
                            var10[var11++] = class9.field617[var15].method172(40);
                        }
                    }
                    class55 var13 = new class55(var11, false, var10);
                    for (int var14 = 0; var14 < 5; ++var14) {
                        if (this.field444[var14] != 0) {
                            var13.method432(field377[var14][0], field377[var14][this.field444[var14]]);
                            if (var14 == 1) {
                                var13.method432(field511[0], field511[this.field444[var14]]);
                            }
                        }
                    }
                    var13.method425(false);
                    var13.method426(class71.field1727[field276.field66].field1729[0], (byte) 1);
                    var13.method435(64, 850, -30, -50, -30, true);
                    arg0.field1006 = 5;
                    arg0.field1007 = 0;
                    class30.method308(5, var13, 0, 7);
                }
            } else if (var3 == 324) {
                if (this.field517 == null) {
                    this.field517 = arg0.field1009;
                    this.field518 = arg0.field974;
                }
                if (this.field332) {
                    arg0.field1009 = this.field518;
                } else {
                    arg0.field1009 = this.field517;
                }
            } else if (var3 == 325) {
                if (this.field517 == null) {
                    this.field517 = arg0.field1009;
                    this.field518 = arg0.field974;
                }
                if (this.field332) {
                    arg0.field1009 = this.field517;
                } else {
                    arg0.field1009 = this.field518;
                }
            } else if (var3 == 600) {
                arg0.field1003 = this.field327;
                if (field438 % 20 < 10) {
                    arg0.field1003 = arg0.field1003 + "|";
                } else {
                    arg0.field1003 = arg0.field1003 + " ";
                }
            } else {
                if (var3 == 620) {
                    if (this.field573 >= 1) {
                        if (this.field570) {
                            arg0.field981 = 16711680;
                            arg0.field1003 = "Moderator option: Mute player for 48 hours: <ON>";
                        } else {
                            arg0.field981 = 16777215;
                            arg0.field1003 = "Moderator option: Mute player for 48 hours: <OFF>";
                        }
                    } else {
                        arg0.field1003 = "";
                    }
                }
                if (var3 == 650 || var3 == 655) {
                    int var17 = this.field493 - this.field467;
                    String var18;
                    if (var17 <= 0) {
                        var18 = "earlier today";
                    } else if (var17 == 1) {
                        var18 = "yesterday";
                    } else {
                        var18 = var17 + " days ago";
                    }
                    arg0.field1003 = "You last logged in " + var18 + " from: " + signlink.dns;
                }
                if (var3 == 651) {
                    if (this.field133 == 0) {
                        arg0.field1003 = "0 unread messages";
                        arg0.field981 = 16776960;
                    }
                    if (this.field133 == 1) {
                        arg0.field1003 = "1 unread message";
                        arg0.field981 = 65280;
                    }
                    if (this.field133 > 1) {
                        arg0.field1003 = this.field133 + " unread messages";
                        arg0.field981 = 65280;
                    }
                }
                if (var3 == 652) {
                    if (this.field409 == 0) {
                        arg0.field1003 = "You have not yet set any password recovery questions.";
                    } else if (this.field409 <= this.field493) {
                        if (this.field452 > 0 && !field285) {
                            arg0.field1003 = "@yel@This is a non-members world: @whi@Since you are a member we";
                        } else {
                            arg0.field1003 = "";
                        }
                    } else {
                        int var19 = this.field493 + 14 - this.field409;
                        String var20;
                        if (var19 <= 0) {
                            var20 = "Earlier today";
                        } else if (var19 == 1) {
                            var20 = "Yesterday";
                        } else {
                            var20 = var19 + " days ago";
                        }
                        arg0.field1003 = var20 + " you changed your recovery questions";
                    }
                }
                if (var3 == 653) {
                    if (this.field409 == 0) {
                        arg0.field1003 = "We strongly recommend you do so now to secure your account.";
                    } else if (this.field409 <= this.field493) {
                        if (this.field452 > 0 && !field285) {
                            arg0.field1003 = "@whi@recommend you use a members world instead. You may use";
                        } else {
                            arg0.field1003 = "";
                        }
                    } else {
                        arg0.field1003 = "If you do not remember making this change then cancel it immediately";
                    }
                }
                if (var3 == 654) {
                    if (this.field409 == 0) {
                        arg0.field1003 = "Do this from the 'account management' area on our front webpage";
                    } else if (this.field409 <= this.field493) {
                        if (this.field452 > 0 && !field285) {
                            arg0.field1003 = "@whi@this world but member benefits are unavailable whilst here.";
                        } else {
                            arg0.field1003 = "";
                        }
                    } else {
                        arg0.field1003 = "Do this from the 'account management' area on our front webpage";
                    }
                }
                if (var3 == 660) {
                    int var21 = this.field493 - this.field467;
                    String var22;
                    if (var21 <= 0) {
                        var22 = "earlier today";
                    } else if (var21 == 1) {
                        var22 = "yesterday";
                    } else {
                        var22 = var21 + " days ago";
                    }
                    arg0.field1003 = "You last logged in @red@" + var22 + "@bla@ from: @red@" + signlink.dns;
                }
                if (var3 == 661) {
                    if (this.field409 == 0) {
                        arg0.field1003 = "\\nYou have not yet set any recovery questions.\\nIt is @red@strongly@yel@ recommended that you do so.\\n\\nIf you don't you will be @red@unable to recover your\\n@red@password@yel@ if you forget it, or it is stolen.";
                    } else if (this.field409 <= this.field493) {
                        arg0.field1003 = "\\n\\nRecovery Questions Last Set:\\n@gre@" + this.method53(591, this.field409);
                    } else {
                        int var23 = this.field493 + 14 - this.field409;
                        String var24;
                        if (var23 <= 0) {
                            var24 = "Earlier today";
                        } else if (var23 == 1) {
                            var24 = "Yesterday";
                        } else {
                            var24 = var23 + " days ago";
                        }
                        arg0.field1003 = var24 + " you requested@red@ new recovery\\n@red@questions.@yel@ The requested change will occur\\non: @red@" + this.method53(591, this.field409) + "\\n\\nIf you do not remember making this request\\ncancel it immediately, and change your password.";
                    }
                }
                if (var3 == 662) {
                    String var25;
                    if (this.field133 == 0) {
                        var25 = "@yel@0 unread messages";
                    } else if (this.field133 == 1) {
                        var25 = "@gre@1 unread message";
                    } else {
                        var25 = "@gre@" + this.field133 + " unread messages";
                    }
                    arg0.field1003 = "You have " + var25 + "\\nin your message centre.";
                }
                if (var3 == 663) {
                    arg0.field1003 = "Last password change:\\n@gre@" + this.method53(591, this.field123);
                }
                if (var3 == 664) {
                    if (this.field571 == 0) {
                        arg0.field1003 = "You have not yet set\\nany contact details.";
                    }
                    if (this.field571 == 1) {
                        arg0.field1003 = "Contact Details Last Set:\\n@gre@" + this.method53(591, this.field368);
                    }
                    if (this.field571 == 2) {
                        arg0.field1003 = "You need to set\\nnew contact details.";
                    }
                }
                if (var3 == 665) {
                    if (this.field452 > 2) {
                        arg0.field1003 = "\\n\\nYou have @gre@" + this.field452 + "@yel@ days of\\nmember credit remaining.";
                    } else if (this.field452 > 0) {
                        arg0.field1003 = "You have @gre@" + this.field452 + "@yel@ days of\\nmember credit remaining.\\n\\n@red@Credit low! Renew now\\n@red@to avoid losing members.";
                    } else {
                        arg0.field1003 = "You are not a member.\\n\\nChoose to subscribe and\\nyou'll get loads of extra\\nbenefits and features.";
                    }
                }
                if (var3 == 667) {
                    if (this.field452 == 0) {
                        arg0.field1003 = "To start a subscripton:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Start a new subscription'";
                    }
                    if (this.field452 > 0) {
                        arg0.field1003 = "To extend or cancel a subscription:\\n1) Logout and return to the frontpage of this website.\\n2)Choose the relevant option from the 'membership' section.\\n\\nNote: If you are a credit card subscriber a top-up payment will\\nautomatically be taken when 3 days credit remain.\\n(unless you cancel your subscription, which can be done at any time.)";
                    }
                }
                if (var3 == 668) {
                    if (this.field409 > this.field493) {
                        arg0.field1003 = "To cancel this request:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'cancel recovery questions'.";
                    } else {
                        arg0.field1003 = "To change your recovery questions:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Set new recovery questions'.";
                    }
                }
            }
        } else if (var3 == 1 && this.field299 == 0) {
            arg0.field1003 = "Loading friend list";
            arg0.field982 = 0;
        } else if (var3 == 1 && this.field299 == 1) {
            arg0.field1003 = "Connecting to friendserver";
            arg0.field982 = 0;
        } else if (var3 == 2 && this.field299 != 2) {
            arg0.field1003 = "Please wait...";
            arg0.field982 = 0;
        } else {
            int var5 = this.field298;
            if (this.field299 != 2) {
                var5 = 0;
            }
            if (var3 > 700) {
                var3 -= 601;
            } else {
                --var3;
            }
            if (var3 >= var5) {
                arg0.field1003 = "";
                arg0.field982 = 0;
            } else {
                arg0.field1003 = this.field134[var3];
                arg0.field982 = 1;
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(II)Ljava/lang/String;")
    public final String method53(int arg0, int arg1) {
        if (arg1 > this.field493 + 10) {
            return "Unknown";
        } else {
            long var3 = ((long) arg1 + 11745L) * 86400000L;
            Calendar var5 = Calendar.getInstance();
            var5.setTime(new Date(var3));
            if (arg0 <= 0) {
                for (int var6 = 1; var6 > 0; ++var6) {
                }
            }
            int var7 = var5.get(5);
            int var8 = var5.get(2);
            int var9 = var5.get(1);
            String[] var10 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
            return var7 + "-" + var10[var8] + "-" + var9;
        }
    }

    @OriginalMember(owner = "client", name = "h", descriptor = "(I)V")
    public final void method54(int arg0) {
        if (this.field401 == 0) {
            this.field314[0] = "Cancel";
            this.field429[0] = 1109;
            this.field601 = 1;
            if (this.field584 != -1) {
                this.field272 = 0;
                this.field155 = 0;
                this.method49(class30.method316(this.field584), 0, super.field914, 0, 0, 0, super.field913, 0);
                if (this.field395 != this.field272) {
                    this.field395 = this.field272;
                }
                if (this.field255 != this.field155) {
                    this.field255 = this.field155;
                }
            } else {
                this.method67((byte) -57);
                this.field272 = 0;
                this.field155 = 0;
                if (super.field913 > 4 && super.field914 > 4 && super.field913 < 516 && super.field914 < 338) {
                    if (this.field595 != -1) {
                        this.method49(class30.method316(this.field595), 4, super.field914, 0, 0, 0, super.field913, 4);
                    } else {
                        this.method35((byte) 4);
                    }
                }
                if (this.field395 != this.field272) {
                    this.field395 = this.field272;
                }
                if (this.field255 != this.field155) {
                    this.field255 = this.field155;
                }
                this.field272 = 0;
                this.field155 = 0;
                if (arg0 != 25993) {
                    this.field475 = !this.field475;
                }
                if (super.field913 > 553 && super.field914 > 205 && super.field913 < 743 && super.field914 < 466) {
                    if (this.field342 != -1) {
                        this.method49(class30.method316(this.field342), 205, super.field914, 0, 1, 0, super.field913, 553);
                    } else if (this.field398[this.field384] != -1) {
                        this.method49(class30.method316(this.field398[this.field384]), 205, super.field914, 0, 1, 0, super.field913, 553);
                    }
                }
                if (this.field272 != this.field203) {
                    this.field372 = true;
                    this.field203 = this.field272;
                }
                if (this.field171 != this.field155) {
                    this.field372 = true;
                    this.field171 = this.field155;
                }
                this.field272 = 0;
                this.field155 = 0;
                if (super.field913 > 17 && super.field914 > 357 && super.field913 < 496 && super.field914 < 453) {
                    if (this.field585 != -1) {
                        this.method49(class30.method316(this.field585), 357, super.field914, 0, 2, 0, super.field913, 17);
                    } else if (this.field194 != -1) {
                        this.method49(class30.method316(this.field194), 357, super.field914, 0, 3, 0, super.field913, 17);
                    } else if (super.field914 < 434 && super.field913 < 426) {
                        this.method156(super.field913 - 17, super.field914 - 357, false);
                    }
                }
                if ((this.field585 != -1 || this.field194 != -1) && this.field455 != this.field272) {
                    this.field205 = true;
                    this.field455 = this.field272;
                }
                if ((this.field585 != -1 || this.field194 != -1) && this.field386 != this.field155) {
                    this.field205 = true;
                    this.field386 = this.field155;
                }
                boolean var2 = false;
                while (!var2) {
                    var2 = true;
                    for (int var3 = 0; var3 < this.field601 - 1; ++var3) {
                        if (this.field429[var3] < 1000 && this.field429[var3 + 1] > 1000) {
                            String var4 = this.field314[var3];
                            this.field314[var3] = this.field314[var3 + 1];
                            this.field314[var3 + 1] = var4;
                            int var5 = this.field429[var3];
                            this.field429[var3] = this.field429[var3 + 1];
                            this.field429[var3 + 1] = var5;
                            int var6 = this.field427[var3];
                            this.field427[var3] = this.field427[var3 + 1];
                            this.field427[var3 + 1] = var6;
                            int var7 = this.field428[var3];
                            this.field428[var3] = this.field428[var3 + 1];
                            this.field428[var3 + 1] = var7;
                            int var8 = this.field430[var3];
                            this.field430[var3] = this.field430[var3 + 1];
                            this.field430[var3 + 1] = var8;
                            var2 = false;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IB)Ljava/lang/String;")
    private static final String method55(int arg0, byte arg1) {
        String var2 = String.valueOf(arg0);
        if (field568 != arg1) {
            throw new NullPointerException();
        } else {
            boolean var3 = false;
            for (int var4 = var2.length() - 3; var4 > 0; var4 -= 3) {
                var2 = var2.substring(0, var4) + "," + var2.substring(var4);
            }
            if (var2.length() > 8) {
                var2 = "@gre@" + var2.substring(0, var2.length() - 8) + " million @whi@(" + var2 + ")";
            } else if (var2.length() > 4) {
                var2 = "@cya@" + var2.substring(0, var2.length() - 4) + "K @whi@(" + var2 + ")";
            }
            return " " + var2;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(I)V")
    public final void method56(int arg0) {
        if (!this.field370 && !this.field405 && !this.field227) {
            ++field438;
            if (arg0 != -25033) {
                for (int var2 = 1; var2 > 0; ++var2) {
                }
            }
            if (!this.field528) {
                this.method163((byte) 73);
            } else {
                this.method119(883);
            }
            this.method168(988);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LXQZVTAMW;I)V")
    private final void method57(class67 arg0, int arg1) {
        int var3 = 0;
        int var4 = -1;
        int var5 = 0;
        int var6 = 0;
        if (arg1 < 5 || arg1 > 5) {
            field156 = this.field460.method256();
        }
        if (arg0.field1636 == 0) {
            var3 = this.field121.method564(arg0.field1635, arg0.field1637, arg0.field1638);
        }
        if (arg0.field1636 == 1) {
            var3 = this.field121.method565(arg0.field1638, arg0.field1635, this.field552, arg0.field1637);
        }
        if (arg0.field1636 == 2) {
            var3 = this.field121.method566(arg0.field1635, arg0.field1637, arg0.field1638);
        }
        if (arg0.field1636 == 3) {
            var3 = this.field121.method567(arg0.field1635, arg0.field1637, arg0.field1638);
        }
        if (var3 != 0) {
            int var7 = this.field121.method568(arg0.field1635, arg0.field1637, arg0.field1638, var3);
            var4 = var3 >> 14 & 32767;
            var5 = var7 & 31;
            var6 = var7 >> 6;
        }
        arg0.field1630 = var4;
        arg0.field1632 = var5;
        arg0.field1631 = var6;
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(B)V")
    public final void method58(byte arg0) {
        if (arg0 == 91) {
            if (!this.field370 && !this.field405 && !this.field227) {
                ++field406;
                if (!this.field528) {
                    this.method68(false, 444);
                } else {
                    this.method108(false);
                }
                this.field159 = 0;
            } else {
                this.method24(1);
            }
        }
    }

    @OriginalMember(owner = "client", name = "i", descriptor = "(I)V")
    public final void method59(int arg0) {
        int var2 = this.field522;
        int var3 = this.field523;
        int var4 = this.field524;
        int var5 = this.field525;
        int var6 = 6116423;
        class62.method517(var5, var6, var2, var4, this.field597, var3);
        class62.method517(16, 0, var2 + 1, var4 - 2, this.field597, var3 + 1);
        class62.method518(var5 - 19, this.field261, var2 + 1, 0, var4 - 2, var3 + 18);
        if (arg0 != 4) {
            this.field213.method179(157);
        }
        this.field448.method234(var2 + 3, "Choose Option", var6, 988, var3 + 14);
        int var7 = super.field913;
        int var8 = super.field914;
        if (this.field521 == 0) {
            var7 -= 4;
            var8 -= 4;
        }
        if (this.field521 == 1) {
            var7 -= 553;
            var8 -= 205;
        }
        if (this.field521 == 2) {
            var7 -= 17;
            var8 -= 357;
        }
        for (int var9 = 0; var9 < this.field601; ++var9) {
            int var10 = (this.field601 - 1 - var9) * 15 + var3 + 31;
            int var11 = 16777215;
            if (var7 > var2 && var7 < var2 + var4 && var8 > var10 - 13 && var8 < var10 + 3) {
                var11 = 16776960;
            }
            this.field448.method238(var2 + 3, 30867, this.field314[var9], true, var10, var11);
        }
    }

    @OriginalMember(owner = "client", name = "k", descriptor = "(B)V")
    public final void method60(byte arg0) {
        this.field391.method455(0);
        class4.field36 = this.field439;
        this.field238.method390((byte) 50, 0, 0);
        if (this.field436) {
            this.field448.method230(0, 239, this.field590, (byte) -90, 40);
            this.field448.method230(128, 239, this.field331 + "*", (byte) -90, 60);
        } else if (this.field502 == 1) {
            this.field448.method230(0, 239, "Enter amount:", (byte) -90, 40);
            this.field448.method230(128, 239, this.field256 + "*", (byte) -90, 60);
        } else if (this.field502 == 2) {
            this.field448.method230(0, 239, "Enter name:", (byte) -90, 40);
            this.field448.method230(128, 239, this.field256 + "*", (byte) -90, 60);
        } else if (this.field223 != null) {
            this.field448.method230(0, 239, this.field223, (byte) -90, 40);
            this.field448.method230(128, 239, "Click to continue", (byte) -90, 60);
        } else if (this.field585 != -1) {
            this.method138(0, 0, 0, class30.method316(this.field585), 0);
        } else if (this.field194 != -1) {
            this.method138(0, 0, 0, class30.method316(this.field194), 0);
        } else {
            class13 var2 = this.field447;
            int var3 = 0;
            class62.method514(0, 0, 77, 463, 0);
            for (int var4 = 0; var4 < 100; ++var4) {
                if (this.field357[var4] != null) {
                    int var6 = this.field355[var4];
                    int var7 = 70 - var3 * 14 + this.field474;
                    String var8 = this.field356[var4];
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
                            var2.method234(4, this.field357[var4], 0, 988, var7);
                        }
                        ++var3;
                    }
                    if ((var6 == 1 || var6 == 2) && (var6 == 1 || this.field576 == 0 || this.field576 == 1 && this.method99(var8, (byte) 4))) {
                        if (var7 > 0 && var7 < 110) {
                            int var10 = 4;
                            if (var9 == 1) {
                                this.field315[0].method390((byte) 50, var10, var7 - 12);
                                var10 += 14;
                            }
                            if (var9 == 2) {
                                this.field315[1].method390((byte) 50, var10, var7 - 12);
                                var10 += 14;
                            }
                            var2.method234(var10, var8 + ":", 0, 988, var7);
                            int var11 = var10 + var2.method232(var8, 410) + 8;
                            var2.method234(var11, this.field357[var4], 255, 988, var7);
                        }
                        ++var3;
                    }
                    if ((var6 == 3 || var6 == 7) && this.field352 == 0 && (var6 == 7 || this.field373 == 0 || this.field373 == 1 && this.method99(var8, (byte) 4))) {
                        if (var7 > 0 && var7 < 110) {
                            byte var12 = 4;
                            var2.method234(var12, "From", 0, 988, var7);
                            int var13 = var12 + var2.method232("From ", 410);
                            if (var9 == 1) {
                                this.field315[0].method390((byte) 50, var13, var7 - 12);
                                var13 += 14;
                            }
                            if (var9 == 2) {
                                this.field315[1].method390((byte) 50, var13, var7 - 12);
                                var13 += 14;
                            }
                            var2.method234(var13, var8 + ":", 0, 988, var7);
                            int var14 = var13 + var2.method232(var8, 410) + 8;
                            var2.method234(var14, this.field357[var4], 8388608, 988, var7);
                        }
                        ++var3;
                    }
                    if (var6 == 4 && (this.field453 == 0 || this.field453 == 1 && this.method99(var8, (byte) 4))) {
                        if (var7 > 0 && var7 < 110) {
                            var2.method234(4, var8 + " " + this.field357[var4], 8388736, 988, var7);
                        }
                        ++var3;
                    }
                    if (var6 == 5 && this.field352 == 0 && this.field373 < 2) {
                        if (var7 > 0 && var7 < 110) {
                            var2.method234(4, this.field357[var4], 8388608, 988, var7);
                        }
                        ++var3;
                    }
                    if (var6 == 6 && this.field352 == 0 && this.field373 < 2) {
                        if (var7 > 0 && var7 < 110) {
                            var2.method234(4, "To " + var8 + ":", 0, 988, var7);
                            var2.method234(12 + var2.method232("To " + var8, 410), this.field357[var4], 8388608, 988, var7);
                        }
                        ++var3;
                    }
                    if (var6 == 8 && (this.field453 == 0 || this.field453 == 1 && this.method99(var8, (byte) 4))) {
                        if (var7 > 0 && var7 < 110) {
                            var2.method234(4, var8 + " " + this.field357[var4], 8270336, 988, var7);
                        }
                        ++var3;
                    }
                }
            }
            class62.method513(-30460);
            this.field307 = var3 * 14 + 7;
            if (this.field307 < 78) {
                this.field307 = 78;
            }
            this.method111(this.field307, -471, this.field307 - this.field474 - 77, 0, 77, 463);
            String var5;
            if (field276 != null && field276.field805 != null) {
                var5 = field276.field805;
            } else {
                var5 = class25.method282(49845, this.field294);
            }
            var2.method234(4, var5 + ":", 0, 988, 90);
            var2.method234(6 + var2.method232(var5 + ": ", 410), this.field592 + "*", 255, 988, 90);
            class62.method520(77, 479, 0, 0, this.field289);
        }
        if (this.field396 && this.field521 == 2) {
            this.method59(4);
        }
        this.field391.method456(17, 722, super.field905, 357);
        this.field390.method455(0);
        class4.field36 = this.field441;
        if (this.field483 != arg0) {
            this.field504 = null;
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(II)V")
    public final void method61(int arg0, int arg1) {
        class70 var3 = this.field504[this.field326][arg0][arg1];
        if (var3 == null) {
            this.field121.method559(this.field326, arg0, arg1);
        } else {
            int var4 = -99999999;
            class69 var5 = null;
            for (class69 var6 = (class69) var3.method592(); var6 != null; var6 = (class69) var3.method594(-314)) {
                class26 var11 = class26.method293(var6.field1716);
                int var12 = var11.field883;
                if (var11.field865) {
                    var12 = (var6.field1717 + 1) * var12;
                }
                if (var12 > var4) {
                    var4 = var12;
                    var5 = var6;
                }
            }
            var3.method590(var5, 0);
            class69 var7 = null;
            class69 var8 = null;
            for (class69 var9 = (class69) var3.method592(); var9 != null; var9 = (class69) var3.method594(-314)) {
                if (var5.field1716 != var9.field1716 && var7 == null) {
                    var7 = var9;
                }
                if (var5.field1716 != var9.field1716 && var7.field1716 != var9.field1716 && var8 == null) {
                    var8 = var9;
                }
            }
            int var10 = (arg1 << 7) + arg0 + 1610612736;
            this.field121.method545(arg0, var7, this.method83(this.field326, true, arg0 * 128 + 64, arg1 * 128 + 64), this.field326, var10, arg1, false, var8, var5);
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(LDNRIFKTO;II)V")
    private final void method62(class11 arg0, int arg1, int arg2) {
        if (arg1 != 4) {
            field156 = 146;
        }
        this.field458 = 0;
        this.field560 = 0;
        this.method98(arg0, arg2, true);
        this.method155(arg2, (byte) 1, arg0);
        this.method143(arg2, -441, arg0);
        for (int var4 = 0; var4 < this.field458; ++var4) {
            int var6 = this.field459[var4];
            if (field438 != this.field304[var6].field71) {
                this.field304[var6].field626 = null;
                this.field304[var6] = null;
            }
        }
        if (arg0.field643 != arg2) {
            signlink.reporterror(this.field294 + " size mismatch in getnpcpos - pos:" + arg0.field643 + " psize:" + arg2);
            throw new RuntimeException("eek");
        } else {
            for (int var5 = 0; var5 < this.field305; ++var5) {
                if (this.field304[this.field306[var5]] == null) {
                    signlink.reporterror(this.field294 + " null entry in npc list - pos:" + var5 + " size:" + this.field305);
                    throw new RuntimeException("eek");
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LPQKEJITK;Z)V")
    public final void method63(class47 arg0, boolean arg1) {
        short var3 = 256;
        if (arg1) {
            for (int var4 = 1; var4 > 0; ++var4) {
            }
        }
        for (int var5 = 0; var5 < this.field125.length; ++var5) {
            this.field125[var5] = 0;
        }
        for (int var6 = 0; var6 < 5000; ++var6) {
            int var18 = (int) (Math.random() * 128.0D * (double) var3);
            this.field125[var18] = (int) (Math.random() * 256.0D);
        }
        for (int var7 = 0; var7 < 20; ++var7) {
            for (int var14 = 1; var14 < var3 - 1; ++var14) {
                for (int var16 = 1; var16 < 127; ++var16) {
                    int var17 = (var14 << 7) + var16;
                    this.field126[var17] = (this.field125[var17 - 1] + this.field125[var17 + 1] + this.field125[var17 - 128] + this.field125[var17 + 128]) / 4;
                }
            }
            int[] var15 = this.field125;
            this.field125 = this.field126;
            this.field126 = var15;
        }
        if (arg0 != null) {
            int var8 = 0;
            for (int var9 = 0; var9 < arg0.field1270; ++var9) {
                for (int var10 = 0; var10 < arg0.field1269; ++var10) {
                    if (arg0.field1267[var8++] != 0) {
                        int var11 = var10 + 16 + arg0.field1271;
                        int var12 = var9 + 16 + arg0.field1272;
                        int var13 = (var12 << 7) + var11;
                        this.field125[var13] = 0;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZIIIIIII)V")
    private final void method64(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (!arg0) {
            field578 = -311;
        }
        if (arg2 >= 1 && arg6 >= 1 && arg2 <= 102 && arg6 <= 102) {
            if (field286 && this.field326 != arg5) {
                return;
            }
            int var9 = 0;
            boolean var10 = true;
            boolean var11 = false;
            boolean var12 = false;
            if (arg3 == 0) {
                var9 = this.field121.method564(arg5, arg2, arg6);
            }
            if (arg3 == 1) {
                var9 = this.field121.method565(arg6, arg5, this.field552, arg2);
            }
            if (arg3 == 2) {
                var9 = this.field121.method566(arg5, arg2, arg6);
            }
            if (arg3 == 3) {
                var9 = this.field121.method567(arg5, arg2, arg6);
            }
            if (var9 != 0) {
                int var13 = this.field121.method568(arg5, arg2, arg6, var9);
                int var14 = var9 >> 14 & 32767;
                int var15 = var13 & 31;
                int var16 = var13 >> 6;
                if (arg3 == 0) {
                    this.field121.method555(arg2, arg5, this.field471, arg6);
                    class56 var17 = class56.method445(var14);
                    if (var17.field1431) {
                        this.field563[arg5].method505(var17.field1432, arg6, false, arg2, var16, var15);
                    }
                }
                if (arg3 == 1) {
                    this.field121.method556(arg5, -14337, arg6, arg2);
                }
                if (arg3 == 2) {
                    this.field121.method557(arg2, arg5, 2943, arg6);
                    class56 var18 = class56.method445(var14);
                    if (var18.field1427 + arg2 > 103 || var18.field1427 + arg6 > 103 || var18.field1426 + arg2 > 103 || var18.field1426 + arg6 > 103) {
                        return;
                    }
                    if (var18.field1431) {
                        this.field563[arg5].method506(var18.field1427, 166, arg6, var18.field1426, var18.field1432, var16, arg2);
                    }
                }
                if (arg3 == 3) {
                    this.field121.method558(-31424, arg6, arg2, arg5);
                    class56 var19 = class56.method445(var14);
                    if (var19.field1431 && var19.field1438) {
                        this.field563[arg5].method508(true, arg2, arg6);
                    }
                }
            }
            if (arg7 >= 0) {
                int var20 = arg5;
                if (arg5 < 3 && (this.field418[1][arg2][arg6] & 2) == 2) {
                    var20 = arg5 + 1;
                }
                class41.method364(0, arg4, arg5, arg6, arg7, arg2, var20, this.field563[arg5], this.field121, arg1, this.field419);
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "j", descriptor = "(I)V")
    public final void method65(int arg0) {
        if (arg0 < 0 || arg0 > 0) {
            this.field504 = null;
        }
        for (class28 var2 = (class28) this.field274.method592(); var2 != null; var2 = (class28) this.field274.method594(-314)) {
            if (this.field326 == var2.field939 && field438 <= var2.field929) {
                if (field438 >= var2.field928) {
                    if (var2.field943 > 0) {
                        class10 var3 = this.field304[var2.field943 - 1];
                        if (var3 != null && var3.field102 >= 0 && var3.field102 < 13312 && var3.field103 >= 0 && var3.field103 < 13312) {
                            var2.method303(field438, -426, var3.field102, this.method83(var2.field939, true, var3.field102, var3.field103) - var2.field948, var3.field103);
                        }
                    }
                    if (var2.field943 < 0) {
                        int var4 = -var2.field943 - 1;
                        class21 var5;
                        if (this.field526 == var4) {
                            var5 = field276;
                        } else {
                            var5 = this.field557[var4];
                        }
                        if (var5 != null && var5.field102 >= 0 && var5.field102 < 13312 && var5.field103 >= 0 && var5.field103 < 13312) {
                            var2.method303(field438, -426, var5.field102, this.method83(var2.field939, true, var5.field102, var5.field103) - var2.field948, var5.field103);
                        }
                    }
                    var2.method302(this.field572, this.field181);
                    this.field121.method549(-1, var2, (int) var2.field936, var2.field949, (int) var2.field937, 832, 60, (int) var2.field935, false, this.field326);
                }
            } else {
                var2.method1();
            }
        }
    }

    @OriginalMember(owner = "client", name = "k", descriptor = "(I)Z")
    public final boolean method66(int arg0) {
        int var2 = 26 / arg0;
        if (this.field321 == null) {
            return false;
        } else {
            try {
                int var3 = this.field321.method380();
                if (var3 == 0) {
                    return false;
                }
                if (this.field150 == -1) {
                    this.field321.method381(this.field492.field642, 0, 1);
                    this.field150 = this.field492.field642[0] & 255;
                    if (this.field460 != null) {
                        this.field150 = this.field150 - this.field460.method256() & 255;
                    }
                    this.field149 = class46.field1262[this.field150];
                    --var3;
                }
                if (this.field149 == -1) {
                    if (var3 <= 0) {
                        return false;
                    }
                    this.field321.method381(this.field492.field642, 0, 1);
                    this.field149 = this.field492.field642[0] & 255;
                    --var3;
                }
                if (this.field149 == -2) {
                    if (var3 <= 1) {
                        return false;
                    }
                    this.field321.method381(this.field492.field642, 0, 2);
                    this.field492.field643 = 0;
                    this.field149 = this.field492.method191();
                    var3 -= 2;
                }
                if (var3 < this.field149) {
                    return false;
                }
                this.field492.field643 = 0;
                this.field321.method381(this.field492.field642, 0, this.field149);
                this.field151 = 0;
                this.field345 = this.field344;
                this.field344 = this.field343;
                this.field343 = this.field150;
                if (this.field150 == 161) {
                    this.field296 = this.field492.method189();
                    this.field526 = this.field492.method214(this.field594);
                    this.field150 = -1;
                    return true;
                }
                if (this.field150 == 111) {
                    int var4 = this.field492.method191();
                    int var5 = this.field492.method189();
                    int var6 = this.field492.method191();
                    if (this.field527 && !field286 && this.field507 < 50) {
                        this.field501[this.field507] = var4;
                        this.field490[this.field507] = var5;
                        this.field260[this.field507] = class33.field1061[var4] + var6;
                        ++this.field507;
                    }
                    this.field150 = -1;
                    return true;
                }
                if (this.field150 == 92) {
                    this.field436 = false;
                    this.field502 = 1;
                    this.field256 = "";
                    this.field205 = true;
                    this.field150 = -1;
                    return true;
                }
                if (this.field150 == 244) {
                    this.field576 = this.field492.method189();
                    this.field373 = this.field492.method189();
                    this.field453 = this.field492.method189();
                    this.field308 = true;
                    this.field205 = true;
                    this.field150 = -1;
                    return true;
                }
                if (this.field150 == 23) {
                    this.field123 = this.field492.method216(0);
                    this.field486 = this.field492.method191();
                    this.field467 = this.field492.method191();
                    this.field409 = this.field492.method191();
                    this.field571 = this.field492.method189();
                    this.field368 = this.field492.method191();
                    this.field452 = this.field492.method191();
                    this.field354 = this.field492.method194();
                    this.field493 = this.field492.method191();
                    this.field549 = this.field492.method191();
                    this.field133 = this.field492.method214(this.field594);
                    if (this.field354 != 0 && this.field595 == -1) {
                        signlink.dnslookup(class25.method281(this.field354, 0));
                        this.method152(-21279);
                        short var7 = 650;
                        if (this.field409 > this.field493 || this.field409 == 0 || this.field452 > 0 && !field285) {
                            var7 = 655;
                        }
                        this.field327 = "";
                        this.field570 = false;
                        if (var7 == 650) {
                            this.field595 = class30.field980;
                        } else {
                            this.field595 = class30.field1019;
                        }
                    }
                    this.field150 = -1;
                    return true;
                }
                if (this.field150 == 100) {
                    int var8 = this.field492.method218(15662);
                    int var9 = this.field492.method219(-823);
                    int var10 = this.field492.method215(-998);
                    class30 var11 = class30.method316(var10);
                    var11.field1020 = var8;
                    var11.field984 = var9;
                    this.field150 = -1;
                    return true;
                }
                if (this.field150 == 117) {
                    int var12 = this.field492.method223(566);
                    int var13 = this.field492.method191();
                    this.field313[var13] = var12;
                    if (this.field588[var13] != var12) {
                        this.field588[var13] = var12;
                        this.method139((byte) 77, var13);
                        this.field372 = true;
                        if (this.field194 != -1) {
                            this.field205 = true;
                        }
                    }
                    this.field150 = -1;
                    return true;
                }
                if (this.field150 == 123) {
                    this.field470 = this.field492.method189();
                    this.field150 = -1;
                    return true;
                }
                if (this.field150 == 133) {
                    int var14 = this.field492.method214(this.field594);
                    int var15 = this.field492.method214(this.field594);
                    int var16 = this.field492.method191();
                    class30.method316(var14).field999 = (var16 << 16) + var15;
                    this.field150 = -1;
                    return true;
                }
                if (this.field150 == 243) {
                    int var17 = this.field492.method214(this.field594);
                    this.method40((byte) 7, var17);
                    if (this.field342 != -1) {
                        this.method135(-10386, this.field342);
                        this.field342 = -1;
                        this.field372 = true;
                        this.field258 = true;
                    }
                    if (this.field585 != -1) {
                        this.method135(-10386, this.field585);
                        this.field585 = -1;
                        this.field205 = true;
                    }
                    if (this.field584 != -1) {
                        this.method135(-10386, this.field584);
                        this.field584 = -1;
                        this.field379 = true;
                    }
                    if (this.field595 != var17) {
                        this.method135(-10386, this.field595);
                        this.field595 = var17;
                    }
                    if (this.field502 != 0) {
                        this.field502 = 0;
                        this.field205 = true;
                    }
                    this.field587 = false;
                    this.field150 = -1;
                    return true;
                }
                if (this.field150 == 102) {
                    int var18 = this.field492.method191();
                    class30.method316(var18).field1006 = 3;
                    if (field276.field803 == null) {
                        class30.method316(var18).field1007 = (field276.field801[11] << 5) + (field276.field801[8] << 10) + (field276.field801[0] << 15) + (field276.field778[0] << 25) + (field276.field778[4] << 20) + field276.field801[1];
                    } else {
                        class30.method316(var18).field1007 = (int) (field276.field803.field760 + 305419896L);
                    }
                    this.field150 = -1;
                    return true;
                }
                if (this.field150 == 93) {
                    for (int var19 = 0; var19 < this.field557.length; ++var19) {
                        if (this.field557[var19] != null) {
                            this.field557[var19].field90 = -1;
                        }
                    }
                    for (int var20 = 0; var20 < this.field304.length; ++var20) {
                        if (this.field304[var20] != null) {
                            this.field304[var20].field90 = -1;
                        }
                    }
                    this.field150 = -1;
                    return true;
                }
                if (this.field150 == 106) {
                    this.field567 = this.field492.method189();
                    if (this.field567 == this.field384) {
                        if (this.field567 == 3) {
                            this.field384 = 1;
                        } else {
                            this.field384 = 3;
                        }
                        this.field372 = true;
                    }
                    this.field150 = -1;
                    return true;
                }
                if (this.field150 == 83) {
                    this.field600 = true;
                    this.field579 = this.field492.method189();
                    this.field580 = this.field492.method189();
                    this.field581 = this.field492.method191();
                    this.field582 = this.field492.method189();
                    this.field583 = this.field492.method189();
                    if (this.field583 >= 100) {
                        int var21 = this.field579 * 128 + 64;
                        int var22 = this.field580 * 128 + 64;
                        int var23 = this.method83(this.field326, true, var21, var22) - this.field581;
                        int var24 = var21 - this.field346;
                        int var25 = var23 - this.field347;
                        int var26 = var22 - this.field348;
                        int var27 = (int) Math.sqrt((double) (var24 * var24 + var26 * var26));
                        this.field349 = (int) (Math.atan2((double) var25, (double) var27) * 325.949D) & 2047;
                        this.field350 = (int) (Math.atan2((double) var24, (double) var26) * -325.949D) & 2047;
                        if (this.field349 < 128) {
                            this.field349 = 128;
                        }
                        if (this.field349 > 383) {
                            this.field349 = 383;
                        }
                    }
                    this.field150 = -1;
                    return true;
                }
                if (this.field150 == 151) {
                    this.field299 = this.field492.method189();
                    this.field372 = true;
                    this.field150 = -1;
                    return true;
                }
                if (this.field150 == 189) {
                    int var28 = this.field492.method214(this.field594);
                    int var29 = this.field492.method216(0);
                    class30.method316(var29).field1006 = 1;
                    class30.method316(var29).field1007 = var28;
                    this.field150 = -1;
                    return true;
                }
                if (this.field150 == 140) {
                    this.field372 = true;
                    int var30 = this.field492.method191();
                    class30 var31 = class30.method316(var30);
                    int var32 = this.field492.method191();
                    for (int var33 = 0; var33 < var32; ++var33) {
                        int var34 = this.field492.method189();
                        if (var34 == 255) {
                            var34 = this.field492.method194();
                        }
                        var31.field956[var33] = this.field492.method214(this.field594);
                        var31.field1032[var33] = var34;
                    }
                    for (int var35 = var32; var35 < var31.field956.length; ++var35) {
                        var31.field956[var35] = 0;
                        var31.field1032[var35] = 0;
                    }
                    this.field150 = -1;
                    return true;
                }
                if (this.field150 == 11) {
                    int var36 = this.field492.method216(0);
                    int var37 = this.field492.method191();
                    int var38 = var37 >> 10 & 31;
                    int var39 = var37 >> 5 & 31;
                    int var40 = var37 & 31;
                    class30.method316(var36).field981 = (var40 << 3) + (var38 << 19) + (var39 << 11);
                    this.field150 = -1;
                    return true;
                }
                if (this.field150 == 225) {
                    this.field600 = false;
                    for (int var41 = 0; var41 < 5; ++var41) {
                        this.field167[var41] = false;
                    }
                    this.field150 = -1;
                    return true;
                }
                if (this.field150 == 53) {
                    int var42 = this.field492.method216(0);
                    this.method40((byte) 7, var42);
                    if (this.field585 != -1) {
                        this.method135(-10386, this.field585);
                        this.field585 = -1;
                        this.field205 = true;
                    }
                    if (this.field584 != -1) {
                        this.method135(-10386, this.field584);
                        this.field584 = -1;
                        this.field379 = true;
                    }
                    if (this.field595 != -1) {
                        this.method135(-10386, this.field595);
                        this.field595 = -1;
                    }
                    if (this.field342 != var42) {
                        this.method135(-10386, this.field342);
                        this.field342 = var42;
                    }
                    if (this.field502 != 0) {
                        this.field502 = 0;
                        this.field205 = true;
                    }
                    this.field372 = true;
                    this.field258 = true;
                    this.field587 = false;
                    this.field150 = -1;
                    return true;
                }
                if (this.field150 == 202) {
                    int var43 = this.field492.method216(0);
                    this.method40((byte) 7, var43);
                    if (this.field595 != -1) {
                        this.method135(-10386, this.field595);
                        this.field595 = -1;
                    }
                    if (this.field342 != -1) {
                        this.method135(-10386, this.field342);
                        this.field342 = -1;
                    }
                    if (this.field585 != -1) {
                        this.method135(-10386, this.field585);
                        this.field585 = -1;
                    }
                    if (this.field584 != var43) {
                        this.method135(-10386, this.field584);
                        this.field584 = var43;
                    }
                    this.field502 = 0;
                    this.field587 = false;
                    this.field150 = -1;
                    return true;
                }
                if (this.field150 == 233) {
                    int var44 = this.field492.method219(-823);
                    if (var44 >= 0) {
                        this.method40((byte) 7, var44);
                    }
                    if (this.field510 != var44) {
                        this.method135(-10386, this.field510);
                        this.field510 = var44;
                    }
                    this.field150 = -1;
                    return true;
                }
                if (this.field150 == 192) {
                    this.field436 = false;
                    this.field502 = 2;
                    this.field256 = "";
                    this.field205 = true;
                    this.field150 = -1;
                    return true;
                }
                if (this.field150 == 6) {
                    boolean var45 = this.field492.method208((byte) 97) == 1;
                    int var46 = this.field492.method191();
                    class30.method316(var46).field1026 = var45;
                    this.field150 = -1;
                    return true;
                }
                if (this.field150 == 128) {
                    this.field412 = this.field492.method189();
                    this.field150 = -1;
                    return true;
                }
                if (this.field150 == 209) {
                    int var47 = this.field492.method214(this.field594);
                    byte var48 = this.field492.method190();
                    this.field313[var47] = var48;
                    if (this.field588[var47] != var48) {
                        this.field588[var47] = var48;
                        this.method139((byte) 77, var47);
                        this.field372 = true;
                        if (this.field194 != -1) {
                            this.field205 = true;
                        }
                    }
                    this.field150 = -1;
                    return true;
                }
                if (this.field150 == 13) {
                    int var49 = this.field492.method216(0);
                    class30 var50 = class30.method316(var49);
                    for (int var51 = 0; var51 < var50.field956.length; ++var51) {
                        var50.field956[var51] = -1;
                        var50.field956[var51] = 0;
                    }
                    this.field150 = -1;
                    return true;
                }
                if (this.field150 == 149) {
                    this.field372 = true;
                    int var52 = this.field492.method222((byte) 0);
                    int var53 = this.field492.method208((byte) 97);
                    int var54 = this.field492.method189();
                    this.field341[var54] = var52;
                    this.field544[var54] = var53;
                    this.field546[var54] = 1;
                    for (int var55 = 0; var55 < 98; ++var55) {
                        if (var52 >= field394[var55]) {
                            this.field546[var54] = var55 + 2;
                        }
                    }
                    this.field150 = -1;
                    return true;
                }
                if (this.field150 == 235) {
                    this.method62(this.field492, 4, this.field149);
                    this.field150 = -1;
                    return true;
                }
                if (this.field150 == 166) {
                    this.method45((byte) -87);
                    this.field150 = -1;
                    return false;
                }
                if (this.field150 == 223) {
                    int var56 = this.field492.method217(5);
                    if (this.field194 != var56) {
                        this.method135(-10386, this.field194);
                        this.field194 = var56;
                    }
                    this.field205 = true;
                    this.field150 = -1;
                    return true;
                }
                if (this.field150 == 238) {
                    int var57 = this.field492.method191();
                    int var58 = this.field492.method191();
                    class30.method316(var57).field1006 = 2;
                    class30.method316(var57).field1007 = var58;
                    this.field150 = -1;
                    return true;
                }
                if (this.field150 == 147) {
                    if (this.field342 != -1) {
                        this.method135(-10386, this.field342);
                        this.field342 = -1;
                        this.field372 = true;
                        this.field258 = true;
                    }
                    if (this.field585 != -1) {
                        this.method135(-10386, this.field585);
                        this.field585 = -1;
                        this.field205 = true;
                    }
                    if (this.field584 != -1) {
                        this.method135(-10386, this.field584);
                        this.field584 = -1;
                        this.field379 = true;
                    }
                    if (this.field595 != -1) {
                        this.method135(-10386, this.field595);
                        this.field595 = -1;
                    }
                    if (this.field502 != 0) {
                        this.field502 = 0;
                        this.field205 = true;
                    }
                    this.field587 = false;
                    this.field150 = -1;
                    return true;
                }
                if (this.field150 == 141) {
                    String var59 = this.field492.method196();
                    if (var59.endsWith(":tradereq:")) {
                        String var60 = var59.substring(0, var59.indexOf(":"));
                        long var61 = class25.method278(var60);
                        boolean var63 = false;
                        for (int var64 = 0; var64 < this.field120; ++var64) {
                            if (this.field367[var64] == var61) {
                                var63 = true;
                                break;
                            }
                        }
                        if (!var63 && this.field259 == 0) {
                            this.method136((byte) 3, 4, "wishes to trade with you.", var60);
                        }
                    } else if (var59.endsWith(":duelreq:")) {
                        String var65 = var59.substring(0, var59.indexOf(":"));
                        long var66 = class25.method278(var65);
                        boolean var68 = false;
                        for (int var69 = 0; var69 < this.field120; ++var69) {
                            if (this.field367[var69] == var66) {
                                var68 = true;
                                break;
                            }
                        }
                        if (!var68 && this.field259 == 0) {
                            this.method136((byte) 3, 8, "wishes to duel with you.", var65);
                        }
                    } else if (!var59.endsWith(":chalreq:")) {
                        this.method136((byte) 3, 0, var59, "");
                    } else {
                        String var70 = var59.substring(0, var59.indexOf(":"));
                        long var71 = class25.method278(var70);
                        boolean var73 = false;
                        for (int var74 = 0; var74 < this.field120; ++var74) {
                            if (this.field367[var74] == var71) {
                                var73 = true;
                                break;
                            }
                        }
                        if (!var73 && this.field259 == 0) {
                            String var75 = var59.substring(var59.indexOf(":") + 1, var59.length() - 9);
                            this.method136((byte) 3, 8, var75, var70);
                        }
                    }
                    this.field150 = -1;
                    return true;
                }
                if (this.field150 == 51) {
                    int var76 = this.field492.method216(0);
                    this.method40((byte) 7, var76);
                    if (this.field342 != -1) {
                        this.method135(-10386, this.field342);
                        this.field342 = -1;
                        this.field372 = true;
                        this.field258 = true;
                    }
                    if (this.field584 != -1) {
                        this.method135(-10386, this.field584);
                        this.field584 = -1;
                        this.field379 = true;
                    }
                    if (this.field595 != -1) {
                        this.method135(-10386, this.field595);
                        this.field595 = -1;
                    }
                    if (this.field585 != var76) {
                        this.method135(-10386, this.field585);
                        this.field585 = var76;
                    }
                    this.field587 = false;
                    this.field205 = true;
                    this.field150 = -1;
                    return true;
                }
                if (this.field150 == 109) {
                    String var77 = this.field492.method196();
                    int var78 = this.field492.method216(0);
                    class30.method316(var78).field1003 = var77;
                    int var10001 = this.field398[this.field384];
                    if (class30.method316(var78).field988 == var10001) {
                        this.field372 = true;
                    }
                    this.field150 = -1;
                    return true;
                }
                if (this.field150 == 69) {
                    this.method110(this.field149, this.field492, -672);
                    this.field224 = false;
                    this.field150 = -1;
                    return true;
                }
                if (this.field150 == 113) {
                    this.field404 = this.field492.method216(0) * 30;
                    this.field150 = -1;
                    return true;
                }
                if (this.field150 == 241) {
                    int var79 = this.field492.method216(0);
                    if (var79 == 65535) {
                        var79 = -1;
                    }
                    if (this.field264 != var79 && this.field508 && !field286 && this.field536 == 0) {
                        this.field131 = var79;
                        this.field132 = true;
                        this.field154.method328(2, this.field131);
                    }
                    this.field264 = var79;
                    this.field150 = -1;
                    return true;
                }
                if (this.field150 == 239) {
                    int var80 = this.field492.method215(-998);
                    int var81 = this.field492.method220(8);
                    if (this.field508 && !field286) {
                        this.field131 = var80;
                        this.field132 = false;
                        this.field154.method328(2, this.field131);
                        this.field536 = var81;
                    }
                    this.field150 = -1;
                    return true;
                }
                if (this.field150 == 108) {
                    int var82 = this.field492.method191();
                    int var83 = this.field492.method216(0);
                    int var84 = this.field492.method191();
                    if (var83 == 65535) {
                        class30.method316(var82).field1006 = 0;
                        this.field150 = -1;
                        return true;
                    }
                    class26 var85 = class26.method293(var83);
                    class30.method316(var82).field1006 = 4;
                    class30.method316(var82).field1007 = var83;
                    class30.method316(var82).field969 = var85.field851;
                    class30.method316(var82).field970 = var85.field877;
                    class30.method316(var82).field968 = var85.field852 * 100 / var84;
                    this.field150 = -1;
                    return true;
                }
                if (this.field150 == 72) {
                    int var86 = this.field492.method189();
                    int var87 = this.field492.method189();
                    int var88 = this.field492.method189();
                    int var89 = this.field492.method189();
                    this.field167[var86] = true;
                    this.field312[var86] = var87;
                    this.field198[var86] = var88;
                    this.field192[var86] = var89;
                    this.field553[var86] = 0;
                    this.field150 = -1;
                    return true;
                }
                if (this.field150 == 26) {
                    this.field120 = this.field149 / 8;
                    for (int var90 = 0; var90 < this.field120; ++var90) {
                        this.field367[var90] = this.field492.method195(0);
                    }
                    this.field150 = -1;
                    return true;
                }
                if (this.field150 == 54) {
                    int var91 = this.field492.method216(0);
                    int var92 = this.field492.method217(5);
                    class30 var93 = class30.method316(var91);
                    if (var93.field958 != var92 || var92 == -1) {
                        var93.field958 = var92;
                        var93.field993 = 0;
                        var93.field966 = 0;
                    }
                    this.field150 = -1;
                    return true;
                }
                if (this.field150 == 29) {
                    int var94 = this.field492.method216(0);
                    int var95 = this.field492.method191();
                    class30 var96 = class30.method316(var94);
                    if (var96 != null && var96.field1005 == 0) {
                        if (var95 < 0) {
                            var95 = 0;
                        }
                        if (var95 > var96.field1027 - var96.field1028) {
                            var95 = var96.field1027 - var96.field1028;
                        }
                        var96.field989 = var95;
                    }
                    this.field150 = -1;
                    return true;
                }
                if (this.field150 == 175) {
                    this.field424 = 0;
                    this.field150 = -1;
                    return true;
                }
                if (this.field150 == 75) {
                    if (this.field384 == 12) {
                        this.field372 = true;
                    }
                    this.field188 = this.field492.method189();
                    this.field150 = -1;
                    return true;
                }
                if (this.field150 == 245) {
                    long var97 = this.field492.method195(0);
                    int var99 = this.field492.method189();
                    String var100 = class25.method282(49845, class25.method279(this.field463, var97));
                    for (int var101 = 0; var101 < this.field298; ++var101) {
                        if (this.field311[var101] == var97) {
                            if (this.field484[var101] != var99) {
                                this.field484[var101] = var99;
                                this.field372 = true;
                                if (var99 > 0) {
                                    this.method136((byte) 3, 5, var100 + " has logged in.", "");
                                }
                                if (var99 == 0) {
                                    this.method136((byte) 3, 5, var100 + " has logged out.", "");
                                }
                            }
                            var100 = null;
                            break;
                        }
                    }
                    if (var100 != null && this.field298 < 200) {
                        this.field311[this.field298] = var97;
                        this.field134[this.field298] = var100;
                        this.field484[this.field298] = var99;
                        ++this.field298;
                        this.field372 = true;
                    }
                    boolean var102 = false;
                    while (!var102) {
                        var102 = true;
                        for (int var103 = 0; var103 < this.field298 - 1; ++var103) {
                            if (this.field484[var103] != field283 && this.field484[var103 + 1] == field283 || this.field484[var103] == 0 && this.field484[var103 + 1] != 0) {
                                int var104 = this.field484[var103];
                                this.field484[var103] = this.field484[var103 + 1];
                                this.field484[var103 + 1] = var104;
                                String var105 = this.field134[var103];
                                this.field134[var103] = this.field134[var103 + 1];
                                this.field134[var103 + 1] = var105;
                                long var106 = this.field311[var103];
                                this.field311[var103] = this.field311[var103 + 1];
                                this.field311[var103 + 1] = var106;
                                this.field372 = true;
                                var102 = false;
                            }
                        }
                    }
                    this.field150 = -1;
                    return true;
                }
                if (this.field150 == 15) {
                    this.field146 = this.field492.method208((byte) 97);
                    this.field147 = this.field492.method208((byte) 97);
                    while (this.field492.field643 < this.field149) {
                        int var108 = this.field492.method189();
                        this.method127(this.field492, var108, true);
                    }
                    this.field150 = -1;
                    return true;
                }
                if (this.field150 == 217) {
                    this.field146 = this.field492.method189();
                    this.field147 = this.field492.method208((byte) 97);
                    for (int var109 = this.field146; var109 < this.field146 + 8; ++var109) {
                        for (int var110 = this.field147; var110 < this.field147 + 8; ++var110) {
                            if (this.field504[this.field326][var109][var110] != null) {
                                this.field504[this.field326][var109][var110] = null;
                                this.method61(var109, var110);
                            }
                        }
                    }
                    for (class67 var111 = (class67) this.field257.method592(); var111 != null; var111 = (class67) this.field257.method594(-314)) {
                        if (var111.field1637 >= this.field146 && var111.field1637 < this.field146 + 8 && var111.field1638 >= this.field147 && var111.field1638 < this.field147 + 8 && this.field326 == var111.field1635) {
                            var111.field1633 = 0;
                        }
                    }
                    this.field150 = -1;
                    return true;
                }
                if (this.field150 == 185 || this.field150 == 87 || this.field150 == 207 || this.field150 == 253 || this.field150 == 94 || this.field150 == 24 || this.field150 == 212 || this.field150 == 52 || this.field150 == 77 || this.field150 == 211 || this.field150 == 197) {
                    this.method127(this.field492, this.field150, true);
                    this.field150 = -1;
                    return true;
                }
                if (this.field150 == 130) {
                    this.field600 = true;
                    this.field249 = this.field492.method189();
                    this.field250 = this.field492.method189();
                    this.field251 = this.field492.method191();
                    this.field252 = this.field492.method189();
                    this.field253 = this.field492.method189();
                    if (this.field253 >= 100) {
                        this.field346 = this.field249 * 128 + 64;
                        this.field348 = this.field250 * 128 + 64;
                        this.field347 = this.method83(this.field326, true, this.field346, this.field348) - this.field251;
                    }
                    this.field150 = -1;
                    return true;
                }
                if (this.field150 == 38) {
                    if (this.field384 == 12) {
                        this.field372 = true;
                    }
                    this.field226 = this.field492.method192();
                    this.field150 = -1;
                    return true;
                }
                if (this.field150 == 165 || this.field150 == 95) {
                    int var112 = this.field360;
                    int var113 = this.field361;
                    if (this.field150 == 165) {
                        var112 = this.field492.method214(this.field594);
                        var113 = this.field492.method216(0);
                        this.field589 = false;
                    }
                    if (this.field150 == 95) {
                        var112 = this.field492.method214(this.field594);
                        this.field492.method199((byte) 113);
                        int var114 = 0;
                        while (true) {
                            if (var114 >= 4) {
                                this.field492.method201(0);
                                var113 = this.field492.method191();
                                this.field589 = true;
                                break;
                            }
                            for (int var115 = 0; var115 < 13; ++var115) {
                                for (int var116 = 0; var116 < 13; ++var116) {
                                    int var117 = this.field492.method200(5, 1);
                                    if (var117 == 1) {
                                        this.field301[var114][var115][var116] = this.field492.method200(5, 26);
                                    } else {
                                        this.field301[var114][var115][var116] = -1;
                                    }
                                }
                            }
                            ++var114;
                        }
                    }
                    if (this.field360 == var112 && this.field361 == var113 && this.field577 == 2) {
                        this.field150 = -1;
                        return true;
                    }
                    this.field360 = var112;
                    this.field361 = var113;
                    this.field322 = (this.field360 - 6) * 8;
                    this.field323 = (this.field361 - 6) * 8;
                    this.field383 = false;
                    if ((this.field360 / 8 == 48 || this.field360 / 8 == 49) && this.field361 / 8 == 48) {
                        this.field383 = true;
                    }
                    if (this.field360 / 8 == 48 && this.field361 / 8 == 148) {
                        this.field383 = true;
                    }
                    this.field577 = 1;
                    this.field187 = System.currentTimeMillis();
                    if (this.field390 != null) {
                        this.field390.method455(0);
                        class4.field36 = this.field441;
                        this.field447.method230(0, 257, "Loading - please wait.", (byte) -90, 151);
                        this.field447.method230(16777215, 256, "Loading - please wait.", (byte) -90, 150);
                        this.field390.method456(4, 722, super.field905, 4);
                    } else if (super.field906 != null) {
                        super.field906.method455(0);
                        class4.field36 = this.field442;
                        this.field447.method230(0, 383, "Loading - please wait.", (byte) -90, 471);
                        this.field447.method230(16777215, 382, "Loading - please wait.", (byte) -90, 470);
                        super.field906.method456(0, 722, super.field905, 0);
                    }
                    if (this.field150 == 165) {
                        int var118 = 0;
                        int var119 = (this.field360 - 6) / 8;
                        label1193: while (true) {
                            if (var119 > (this.field360 + 6) / 8) {
                                this.field457 = new byte[var118][];
                                this.field454 = new byte[var118][];
                                this.field269 = new int[var118];
                                this.field270 = new int[var118];
                                this.field271 = new int[var118];
                                int var121 = 0;
                                int var122 = (this.field360 - 6) / 8;
                                while (true) {
                                    if (var122 > (this.field360 + 6) / 8) {
                                        break label1193;
                                    }
                                    for (int var123 = (this.field361 - 6) / 8; var123 <= (this.field361 + 6) / 8; ++var123) {
                                        this.field269[var121] = (var122 << 8) + var123;
                                        if (this.field383 && (var123 == 49 || var123 == 149 || var123 == 147 || var122 == 50 || var122 == 49 && var123 == 47)) {
                                            this.field270[var121] = -1;
                                            this.field271[var121] = -1;
                                            ++var121;
                                        } else {
                                            int var124 = this.field270[var121] = this.field154.method340(true, var123, var122, 0);
                                            if (var124 != -1) {
                                                this.field154.method328(3, var124);
                                            }
                                            int var125 = this.field271[var121] = this.field154.method340(true, var123, var122, 1);
                                            if (var125 != -1) {
                                                this.field154.method328(3, var125);
                                            }
                                            ++var121;
                                        }
                                    }
                                    ++var122;
                                }
                            }
                            for (int var120 = (this.field361 - 6) / 8; var120 <= (this.field361 + 6) / 8; ++var120) {
                                ++var118;
                            }
                            ++var119;
                        }
                    }
                    if (this.field150 == 95) {
                        int var126 = 0;
                        int[] var127 = new int[676];
                        int var128 = 0;
                        label1154: while (true) {
                            if (var128 >= 4) {
                                this.field457 = new byte[var126][];
                                this.field454 = new byte[var126][];
                                this.field269 = new int[var126];
                                this.field270 = new int[var126];
                                this.field271 = new int[var126];
                                int var136 = 0;
                                while (true) {
                                    if (var136 >= var126) {
                                        break label1154;
                                    }
                                    int var137 = this.field269[var136] = var127[var136];
                                    int var138 = var137 >> 8 & 255;
                                    int var139 = var137 & 255;
                                    int var140 = this.field270[var136] = this.field154.method340(true, var139, var138, 0);
                                    if (var140 != -1) {
                                        this.field154.method328(3, var140);
                                    }
                                    int var141 = this.field271[var136] = this.field154.method340(true, var139, var138, 1);
                                    if (var141 != -1) {
                                        this.field154.method328(3, var141);
                                    }
                                    ++var136;
                                }
                            }
                            for (int var129 = 0; var129 < 13; ++var129) {
                                for (int var130 = 0; var130 < 13; ++var130) {
                                    int var131 = this.field301[var128][var129][var130];
                                    if (var131 != -1) {
                                        int var132 = var131 >> 14 & 1023;
                                        int var133 = var131 >> 3 & 2047;
                                        int var134 = (var132 / 8 << 8) + var133 / 8;
                                        for (int var135 = 0; var135 < var126; ++var135) {
                                            if (var127[var135] == var134) {
                                                var134 = -1;
                                                break;
                                            }
                                        }
                                        if (var134 != -1) {
                                            var127[var126++] = var134;
                                        }
                                    }
                                }
                            }
                            ++var128;
                        }
                    }
                    int var142 = this.field322 - this.field324;
                    int var143 = this.field323 - this.field325;
                    this.field324 = this.field322;
                    this.field325 = this.field323;
                    for (int var144 = 0; var144 < 16384; ++var144) {
                        class10 var145 = this.field304[var144];
                        if (var145 != null) {
                            for (int var146 = 0; var146 < 10; ++var146) {
                                var145.field88[var146] -= var142;
                                var145.field89[var146] -= var143;
                            }
                            var145.field102 -= var142 * 128;
                            var145.field103 -= var143 * 128;
                        }
                    }
                    for (int var147 = 0; var147 < this.field555; ++var147) {
                        class21 var148 = this.field557[var147];
                        if (var148 != null) {
                            for (int var149 = 0; var149 < 10; ++var149) {
                                var148.field88[var149] -= var142;
                                var148.field89[var149] -= var143;
                            }
                            var148.field102 -= var142 * 128;
                            var148.field103 -= var143 * 128;
                        }
                    }
                    this.field224 = true;
                    byte var150 = 0;
                    byte var151 = 104;
                    byte var152 = 1;
                    if (var142 < 0) {
                        var150 = 103;
                        var151 = -1;
                        var152 = -1;
                    }
                    byte var153 = 0;
                    byte var154 = 104;
                    byte var155 = 1;
                    if (var143 < 0) {
                        var153 = 103;
                        var154 = -1;
                        var155 = -1;
                    }
                    for (int var156 = var150; var151 != var156; var156 += var152) {
                        for (int var157 = var153; var154 != var157; var157 += var155) {
                            int var158 = var142 + var156;
                            int var159 = var143 + var157;
                            for (int var160 = 0; var160 < 4; ++var160) {
                                if (var158 >= 0 && var159 >= 0 && var158 < 104 && var159 < 104) {
                                    this.field504[var160][var156][var157] = this.field504[var160][var158][var159];
                                } else {
                                    this.field504[var160][var156][var157] = null;
                                }
                            }
                        }
                    }
                    for (class67 var161 = (class67) this.field257.method592(); var161 != null; var161 = (class67) this.field257.method594(-314)) {
                        var161.field1637 -= var142;
                        var161.field1638 -= var143;
                        if (var161.field1637 < 0 || var161.field1638 < 0 || var161.field1637 >= 104 || var161.field1638 >= 104) {
                            var161.method1();
                        }
                    }
                    if (this.field424 != 0) {
                        this.field424 -= var142;
                        this.field425 -= var143;
                    }
                    this.field600 = false;
                    this.field150 = -1;
                    return true;
                }
                if (this.field150 == 232) {
                    int var162 = this.field492.method215(-998);
                    int var163 = this.field492.method214(this.field594);
                    if (this.field585 != -1) {
                        this.method135(-10386, this.field585);
                        this.field585 = -1;
                        this.field205 = true;
                    }
                    if (this.field584 != -1) {
                        this.method135(-10386, this.field584);
                        this.field584 = -1;
                        this.field379 = true;
                    }
                    if (this.field595 != var162) {
                        this.method135(-10386, this.field595);
                        this.field595 = var162;
                    }
                    if (this.field342 != var163) {
                        this.method135(-10386, this.field342);
                        this.field342 = var163;
                    }
                    if (this.field502 != 0) {
                        this.field502 = 0;
                        this.field205 = true;
                    }
                    this.field372 = true;
                    this.field258 = true;
                    this.field587 = false;
                    this.field150 = -1;
                    return true;
                }
                if (this.field150 == 213) {
                    this.field146 = this.field492.method207((byte) 7);
                    this.field147 = this.field492.method189();
                    this.field150 = -1;
                    return true;
                }
                if (this.field150 == 169) {
                    this.field359 = this.field492.method189();
                    if (this.field359 == 1) {
                        this.field193 = this.field492.method191();
                    }
                    if (this.field359 >= 2 && this.field359 <= 6) {
                        if (this.field359 == 2) {
                            this.field339 = 64;
                            this.field340 = 64;
                        }
                        if (this.field359 == 3) {
                            this.field339 = 0;
                            this.field340 = 64;
                        }
                        if (this.field359 == 4) {
                            this.field339 = 128;
                            this.field340 = 64;
                        }
                        if (this.field359 == 5) {
                            this.field339 = 64;
                            this.field340 = 0;
                        }
                        if (this.field359 == 6) {
                            this.field339 = 64;
                            this.field340 = 128;
                        }
                        this.field359 = 2;
                        this.field336 = this.field492.method191();
                        this.field337 = this.field492.method191();
                        this.field338 = this.field492.method189();
                    }
                    if (this.field359 == 10) {
                        this.field220 = this.field492.method191();
                    }
                    this.field150 = -1;
                    return true;
                }
                if (this.field150 == 249) {
                    int var164 = this.field492.method216(0);
                    int var165 = this.field492.method189();
                    if (var164 == 65535) {
                        var164 = -1;
                    }
                    if (this.field398[var165] != var164) {
                        this.method135(-10386, this.field398[var165]);
                        this.field398[var165] = var164;
                    }
                    this.field372 = true;
                    this.field258 = true;
                    this.field150 = -1;
                    return true;
                }
                if (this.field150 == 33) {
                    int var166 = this.field492.method189();
                    String var167 = this.field492.method196();
                    int var168 = this.field492.method207((byte) 7);
                    if (var168 >= 1 && var168 <= 5) {
                        if (var167.equalsIgnoreCase("null")) {
                            var167 = null;
                        }
                        this.field542[var168 - 1] = var167;
                        this.field543[var168 - 1] = var166 == 0;
                    }
                    this.field150 = -1;
                    return true;
                }
                if (this.field150 == 18) {
                    int var169 = this.field492.method214(this.field594);
                    int var170 = this.field492.method191();
                    int var171 = this.field492.method214(this.field594);
                    int var172 = this.field492.method216(0);
                    class30.method316(var171).field969 = var172;
                    class30.method316(var171).field970 = var169;
                    class30.method316(var171).field968 = var170;
                    this.field150 = -1;
                    return true;
                }
                if (this.field150 == 110) {
                    this.field384 = this.field492.method207((byte) 7);
                    this.field372 = true;
                    this.field258 = true;
                    this.field150 = -1;
                    return true;
                }
                if (this.field150 == 48) {
                    for (int var173 = 0; var173 < this.field588.length; ++var173) {
                        if (this.field588[var173] != this.field313[var173]) {
                            this.field588[var173] = this.field313[var173];
                            this.method139((byte) 77, var173);
                            this.field372 = true;
                        }
                    }
                    this.field150 = -1;
                    return true;
                }
                if (this.field150 == 67) {
                    this.field372 = true;
                    int var174 = this.field492.method191();
                    class30 var175 = class30.method316(var174);
                    while (this.field492.field643 < this.field149) {
                        int var176 = this.field492.method203();
                        int var177 = this.field492.method191();
                        int var178 = this.field492.method189();
                        if (var178 == 255) {
                            var178 = this.field492.method194();
                        }
                        if (var176 >= 0 && var176 < var175.field956.length) {
                            var175.field956[var176] = var177;
                            var175.field1032[var176] = var178;
                        }
                    }
                    this.field150 = -1;
                    return true;
                }
                if (this.field150 == 208) {
                    long var179 = this.field492.method195(0);
                    int var181 = this.field492.method194();
                    int var182 = this.field492.method189();
                    boolean var183 = false;
                    for (int var184 = 0; var184 < 100; ++var184) {
                        if (this.field488[var184] == var181) {
                            var183 = true;
                            break;
                        }
                    }
                    if (var182 <= 1) {
                        for (int var185 = 0; var185 < this.field120; ++var185) {
                            if (this.field367[var185] == var179) {
                                var183 = true;
                                break;
                            }
                        }
                    }
                    if (!var183 && this.field259 == 0) {
                        try {
                            this.field488[this.field172] = var181;
                            this.field172 = (this.field172 + 1) % 100;
                            String var186 = class50.method398((byte) 1, this.field149 - 13, this.field492);
                            if (var182 != 3) {
                                var186 = class59.method472(false, var186);
                            }
                            if (var182 != 2 && var182 != 3) {
                                if (var182 == 1) {
                                    this.method136((byte) 3, 7, var186, "@cr1@" + class25.method282(49845, class25.method279(this.field463, var179)));
                                } else {
                                    this.method136((byte) 3, 3, var186, class25.method282(49845, class25.method279(this.field463, var179)));
                                }
                            } else {
                                this.method136((byte) 3, 7, var186, "@cr2@" + class25.method282(49845, class25.method279(this.field463, var179)));
                            }
                        } catch (Exception var191) {
                            signlink.reporterror("cde1");
                        }
                    }
                    this.field150 = -1;
                    return true;
                }
                signlink.reporterror("T1 - " + this.field150 + "," + this.field149 + " - " + this.field344 + "," + this.field345);
                this.method45((byte) -87);
            } catch (IOException var192) {
                this.method132(43947);
            } catch (Exception var193) {
                String var189 = "T2 - " + this.field150 + "," + this.field344 + "," + this.field345 + " - " + this.field149 + "," + (field276.field88[0] + this.field322) + "," + (field276.field89[0] + this.field323) + " - ";
                for (int var190 = 0; var190 < this.field149 && var190 < 50; ++var190) {
                    var189 = var189 + this.field492.field642[var190] + ",";
                }
                signlink.reporterror(var189);
                this.method45((byte) -87);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "l", descriptor = "(B)V")
    public final void method67(byte arg0) {
        if (arg0 != -57) {
            this.method93();
        }
        if (this.field352 != 0) {
            int var2 = 0;
            if (this.field404 != 0) {
                var2 = 1;
            }
            for (int var3 = 0; var3 < 100; ++var3) {
                if (this.field357[var3] != null) {
                    int var4 = this.field355[var3];
                    String var5 = this.field356[var3];
                    boolean var6 = false;
                    if (var5 != null && var5.startsWith("@cr1@")) {
                        var5 = var5.substring(5);
                        boolean var7 = true;
                    }
                    if (var5 != null && var5.startsWith("@cr2@")) {
                        var5 = var5.substring(5);
                        boolean var8 = true;
                    }
                    if ((var4 == 3 || var4 == 7) && (var4 == 7 || this.field373 == 0 || this.field373 == 1 && this.method99(var5, (byte) 4))) {
                        int var9 = 329 - var2 * 13;
                        if (super.field913 > 4 && super.field914 - 4 > var9 - 10 && super.field914 - 4 <= var9 + 3) {
                            int var10 = this.field447.method232("From:  " + var5 + this.field357[var3], 410) + 25;
                            if (var10 > 450) {
                                var10 = 450;
                            }
                            if (super.field913 < var10 + 4) {
                                if (this.field573 >= 1) {
                                    this.field314[this.field601] = "Report abuse @whi@" + var5;
                                    this.field429[this.field601] = 2208;
                                    ++this.field601;
                                }
                                this.field314[this.field601] = "Add ignore @whi@" + var5;
                                this.field429[this.field601] = 2064;
                                ++this.field601;
                                this.field314[this.field601] = "Add friend @whi@" + var5;
                                this.field429[this.field601] = 2723;
                                ++this.field601;
                            }
                        }
                        ++var2;
                        if (var2 >= 5) {
                            return;
                        }
                    }
                    if ((var4 == 5 || var4 == 6) && this.field373 < 2) {
                        ++var2;
                        if (var2 >= 5) {
                            return;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(ZI)V")
    public final void method68(boolean arg0, int arg1) {
        this.method88((byte) 1);
        this.field242.method455(0);
        this.field200.method390((byte) 50, 0, 0);
        short var3 = 360;
        short var4 = 200;
        if (arg1 > 0) {
            if (this.field293 == 0) {
                int var5 = var4 / 2 + 80;
                this.field446.method231(27826, this.field154.field1111, true, var5, 7711145, var3 / 2);
                int var6 = var4 / 2 - 20;
                this.field448.method231(27826, "Welcome to RuneScape", true, var6, 16776960, var3 / 2);
                int var17 = var6 + 30;
                int var7 = var3 / 2 - 80;
                int var8 = var4 / 2 + 20;
                this.field201.method390((byte) 50, var7 - 73, var8 - 20);
                this.field448.method231(27826, "New User", true, var8 + 5, 16777215, var7);
                int var9 = var3 / 2 + 80;
                this.field201.method390((byte) 50, var9 - 73, var8 - 20);
                this.field448.method231(27826, "Existing User", true, var8 + 5, 16777215, var9);
            }
            if (this.field293 == 2) {
                int var10 = var4 / 2 - 40;
                if (this.field480.length() > 0) {
                    this.field448.method231(27826, this.field480, true, var10 - 15, 16776960, var3 / 2);
                    this.field448.method231(27826, this.field481, true, var10, 16776960, var3 / 2);
                    var10 += 30;
                } else {
                    this.field448.method231(27826, this.field481, true, var10 - 7, 16776960, var3 / 2);
                    var10 += 30;
                }
                this.field448.method238(var3 / 2 - 90, 30867, "Username: " + this.field294 + (this.field569 == 0 & field438 % 40 < 20 ? "@yel@|" : ""), true, var10, 16777215);
                var10 += 15;
                this.field448.method238(var3 / 2 - 88, 30867, "Password: " + class25.method283(this.field295, false) + (this.field569 == 1 & field438 % 40 < 20 ? "@yel@|" : ""), true, var10, 16777215);
                var10 += 15;
                if (!arg0) {
                    int var11 = var3 / 2 - 80;
                    int var12 = var4 / 2 + 50;
                    this.field201.method390((byte) 50, var11 - 73, var12 - 20);
                    this.field448.method231(27826, "Login", true, var12 + 5, 16777215, var11);
                    int var13 = var3 / 2 + 80;
                    this.field201.method390((byte) 50, var13 - 73, var12 - 20);
                    this.field448.method231(27826, "Cancel", true, var12 + 5, 16777215, var13);
                }
            }
            if (this.field293 == 3) {
                this.field448.method231(27826, "Create a free account", true, var4 / 2 - 60, 16776960, var3 / 2);
                int var14 = var4 / 2 - 35;
                this.field448.method231(27826, "To create a new account you need to", true, var14, 16777215, var3 / 2);
                int var18 = var14 + 15;
                this.field448.method231(27826, "go back to the main RuneScape webpage", true, var18, 16777215, var3 / 2);
                int var19 = var18 + 15;
                this.field448.method231(27826, "and choose the red 'create account'", true, var19, 16777215, var3 / 2);
                int var20 = var19 + 15;
                this.field448.method231(27826, "button at the top right of that page.", true, var20, 16777215, var3 / 2);
                int var21 = var20 + 15;
                int var15 = var3 / 2;
                int var16 = var4 / 2 + 50;
                this.field201.method390((byte) 50, var15 - 73, var16 - 20);
                this.field448.method231(27826, "Cancel", true, var16 + 5, 16777215, var15);
            }
            this.field242.method456(202, 722, super.field905, 171);
            if (this.field379) {
                this.field379 = false;
                this.field240.method456(128, 722, super.field905, 0);
                this.field241.method456(202, 722, super.field905, 371);
                this.field245.method456(0, 722, super.field905, 265);
                this.field246.method456(562, 722, super.field905, 265);
                this.field247.method456(128, 722, super.field905, 171);
                this.field248.method456(562, 722, super.field905, 171);
            }
        }
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(Z)V")
    public final void method69(boolean arg0) {
        try {
            this.field489 = -1;
            this.field282.method596();
            this.field274.method596();
            ++field509;
            if (field509 > 94) {
                field509 = 0;
                this.field213.method178(false, 129);
            }
            class4.method5(1);
            this.method80(true);
            this.field121.method538(true);
            System.gc();
            for (int var2 = 0; var2 < 4; ++var2) {
                this.field563[var2].method500();
            }
            for (int var3 = 0; var3 < 4; ++var3) {
                for (int var4 = 0; var4 < 104; ++var4) {
                    for (int var5 = 0; var5 < 104; ++var5) {
                        this.field418[var3][var4][var5] = 0;
                    }
                }
            }
            class41 var6 = new class41(104, this.field418, (byte) 71, this.field419, 104);
            int var7 = this.field457.length;
            this.field213.method178(false, 231);
            if (!this.field589) {
                for (int var8 = 0; var8 < var7; ++var8) {
                    int var9 = (this.field269[var8] >> 8) * 64 - this.field322;
                    int var10 = (this.field269[var8] & 255) * 64 - this.field323;
                    byte[] var11 = this.field457[var8];
                    if (var11 != null) {
                        var6.method376(var10, (this.field361 - 6) * 8, var9, var11, (byte) 2, this.field563, (this.field360 - 6) * 8);
                    }
                }
                for (int var12 = 0; var12 < var7; ++var12) {
                    int var13 = (this.field269[var12] >> 8) * 64 - this.field322;
                    int var14 = (this.field269[var12] & 255) * 64 - this.field323;
                    byte[] var15 = this.field457[var12];
                    if (var15 == null && this.field361 < 800) {
                        var6.method359(64, false, 64, var14, var13);
                    }
                }
                this.field213.method178(false, 231);
                for (int var16 = 0; var16 < var7; ++var16) {
                    byte[] var17 = this.field454[var16];
                    if (var17 != null) {
                        int var18 = (this.field269[var16] >> 8) * 64 - this.field322;
                        int var19 = (this.field269[var16] & 255) * 64 - this.field323;
                        var6.method372(-44739, var19, var18, var17, this.field121, this.field563);
                    }
                }
            }
            if (this.field589) {
                int var20 = 0;
                label261: while (true) {
                    if (var20 >= 4) {
                        for (int var30 = 0; var30 < 13; ++var30) {
                            for (int var31 = 0; var31 < 13; ++var31) {
                                int var32 = this.field301[0][var30][var31];
                                if (var32 == -1) {
                                    var6.method359(8, false, 8, var31 * 8, var30 * 8);
                                }
                            }
                        }
                        this.field213.method178(false, 231);
                        int var33 = 0;
                        while (true) {
                            if (var33 >= 4) {
                                break label261;
                            }
                            for (int var34 = 0; var34 < 13; ++var34) {
                                for (int var35 = 0; var35 < 13; ++var35) {
                                    int var36 = this.field301[var33][var34][var35];
                                    if (var36 != -1) {
                                        int var37 = var36 >> 24 & 3;
                                        int var38 = var36 >> 1 & 3;
                                        int var39 = var36 >> 14 & 1023;
                                        int var40 = var36 >> 3 & 2047;
                                        int var41 = (var39 / 8 << 8) + var40 / 8;
                                        for (int var42 = 0; var42 < this.field269.length; ++var42) {
                                            if (this.field269[var42] == var41 && this.field454[var42] != null) {
                                                var6.method368((var40 & 7) * 8, var38, this.field563, var37, -2506, var34 * 8, (var39 & 7) * 8, var35 * 8, this.field121, var33, this.field454[var42]);
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
                            int var23 = this.field301[var20][var21][var22];
                            if (var23 != -1) {
                                int var24 = var23 >> 24 & 3;
                                int var25 = var23 >> 1 & 3;
                                int var26 = var23 >> 14 & 1023;
                                int var27 = var23 >> 3 & 2047;
                                int var28 = (var26 / 8 << 8) + var27 / 8;
                                for (int var29 = 0; var29 < this.field269.length; ++var29) {
                                    if (this.field269[var29] == var28 && this.field457[var29] != null) {
                                        var6.method373((var27 & 7) * 8, -815, var22 * 8, var21 * 8, var24, this.field563, var25, this.field457[var29], (var26 & 7) * 8, var20);
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    ++var20;
                }
            }
            this.field213.method178(false, 231);
            var6.method374(this.field563, this.field121, 0);
            if (this.field390 != null) {
                this.field390.method455(0);
                class4.field36 = this.field441;
            }
            this.field213.method178(false, 231);
            int var43 = class41.field1203;
            if (var43 > this.field326) {
                var43 = this.field326;
            }
            if (var43 < this.field326 - 1) {
                int var44 = this.field326 - 1;
            }
            if (field286) {
                this.field121.method539(class41.field1203, this.field593);
            } else {
                this.field121.method539(0, this.field593);
            }
            for (int var45 = 0; var45 < 104; ++var45) {
                for (int var46 = 0; var46 < 104; ++var46) {
                    this.method61(var45, var46);
                }
            }
            this.method128(750);
        } catch (Exception var59) {
        }
        class56.field1413.method403();
        if (super.field908 != null) {
            this.field213.method178(false, 207);
            this.field213.method183(1057001181);
        }
        if (field286 && signlink.cache_dat != null) {
            int var48 = this.field154.method342(0, true);
            for (int var49 = 0; var49 < var48; ++var49) {
                int var50 = this.field154.method338(-30035, var49);
                if ((var50 & 121) == 0) {
                    class55.method417(var49, -273);
                }
            }
        }
        System.gc();
        class4.method6(3, 20);
        this.field154.method331(39268);
        int var51 = (this.field360 - 6) / 8 - 1;
        int var52 = (this.field360 + 6) / 8 + 1;
        int var53 = (this.field361 - 6) / 8 - 1;
        int var54 = (this.field361 + 6) / 8 + 1;
        if (arg0) {
            this.field330 = !this.field330;
        }
        if (this.field383) {
            var51 = 49;
            var52 = 50;
            var53 = 49;
            var54 = 50;
        }
        for (int var55 = var51; var55 <= var52; ++var55) {
            for (int var56 = var53; var56 <= var54; ++var56) {
                if (var51 == var55 || var52 == var55 || var53 == var56 || var54 == var56) {
                    int var57 = this.field154.method340(true, var56, var55, 0);
                    if (var57 != -1) {
                        this.field154.method330(false, var57, 3);
                    }
                    int var58 = this.field154.method340(true, var56, var55, 1);
                    if (var58 != -1) {
                        this.field154.method330(false, var58, 3);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(JZ)V")
    public final void method70(long arg0, boolean arg1) {
        if (!arg1) {
            if (arg0 != 0L) {
                for (int var4 = 0; var4 < this.field120; ++var4) {
                    if (this.field367[var4] == arg0) {
                        --this.field120;
                        this.field372 = true;
                        for (int var5 = var4; var5 < this.field120; ++var5) {
                            this.field367[var5] = this.field367[var5 + 1];
                        }
                        this.field213.method178(false, 46);
                        this.field213.method185((byte) 35, arg0);
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "l", descriptor = "(I)V")
    public final void method71(int arg0) {
        if (arg0 != 23067) {
            this.field456 = -469;
        }
        this.method109(this.field275);
        if (this.field130 == 1) {
            this.field358[this.field129 / 100].method529((byte) 50, this.field127 - 8 - 4, this.field128 - 8 - 4);
        }
        if (this.field130 == 2) {
            this.field358[this.field129 / 100 + 4].method529((byte) 50, this.field127 - 8 - 4, this.field128 - 8 - 4);
        }
        if (this.field510 != -1) {
            this.method166(this.field181, this.field510, (byte) -5);
            this.method138(0, 0, 0, class30.method316(this.field510), 0);
        }
        if (this.field595 != -1) {
            this.method166(this.field181, this.field595, (byte) -5);
            this.method138(0, 0, 0, class30.method316(this.field595), 0);
        }
        this.method113(0);
        if (!this.field396) {
            this.method54(25993);
            this.method134(739);
        } else if (this.field521 == 0) {
            this.method59(4);
        }
        if (this.field412 == 1) {
            this.field586.method529((byte) 50, 472, 296);
        }
        if (field119) {
            short var2 = 507;
            byte var3 = 20;
            int var4 = 16776960;
            if (super.field901 < 15) {
                var4 = 16711680;
            }
            this.field447.method229(var4, var3, this.field179, "Fps:" + super.field901, var2);
            int var13 = var3 + 15;
            Runtime var5 = Runtime.getRuntime();
            int var6 = (int) ((var5.totalMemory() - var5.freeMemory()) / 1024L);
            int var7 = 16776960;
            if (var6 > 33554432 && field286) {
                int var8 = 16711680;
            }
            if (var6 > 67108864 && !field286) {
                int var9 = 16711680;
            }
            this.field447.method229(16776960, var13, this.field179, "Mem:" + var6 + "k", var2);
            var13 += 15;
        }
        if (this.field404 != 0) {
            int var10 = this.field404 / 50;
            int var11 = var10 / 60;
            int var12 = var10 % 60;
            if (var12 < 10) {
                this.field447.method234(4, "System update in: " + var11 + ":0" + var12, 16776960, 988, 329);
            } else {
                this.field447.method234(4, "System update in: " + var11 + ":" + var12, 16776960, 988, 329);
            }
            ++field351;
            if (field351 > 65) {
                field351 = 0;
                this.field213.method178(false, 116);
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(Z)V")
    public void method72(boolean arg0) {
        System.out.println("============");
        System.out.println("flame-cycle:" + this.field392);
        if (this.field154 != null) {
            System.out.println("Od-cycle:" + this.field154.field1119);
        }
        System.out.println("loop-cycle:" + field438);
        System.out.println("draw-cycle:" + field406);
        System.out.println("ptype:" + this.field150);
        if (arg0) {
            field541 = this.field460.method256();
        }
        System.out.println("psize:" + this.field149);
        if (this.field321 != null) {
            this.field321.method383(false);
        }
        super.field902 = true;
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(B)Ljava/awt/Component;")
    public final Component method73(byte arg0) {
        if (arg0 == 0) {
            boolean var2 = false;
            if (signlink.mainapp != null) {
                return signlink.mainapp;
            } else {
                return super.field908 != null ? super.field908 : this;
            }
        } else {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(Z)V")
    public final void method74(boolean arg0) {
        if (arg0) {
            this.field504 = null;
        }
        this.field200 = new class47(this.field202, "titlebox", 0);
        this.field201 = new class47(this.field202, "titlebutton", 0);
        this.field545 = new class47[12];
        int var2 = 0;
        try {
            var2 = Integer.parseInt(this.getParameter("fl_icon"));
        } catch (Exception var19) {
        }
        if (var2 == 0) {
            for (int var3 = 0; var3 < 12; ++var3) {
                this.field545[var3] = new class47(this.field202, "runes", var3);
            }
        } else {
            for (int var4 = 0; var4 < 12; ++var4) {
                this.field545[var4] = new class47(this.field202, "runes", (var4 & 3) + 12);
            }
        }
        this.field161 = new class65(128, 265);
        this.field162 = new class65(128, 265);
        for (int var5 = 0; var5 < 33920; ++var5) {
            this.field161.field1620[var5] = this.field243.field1459[var5];
        }
        for (int var6 = 0; var6 < 33920; ++var6) {
            this.field162.field1620[var6] = this.field244.field1459[var6];
        }
        this.field174 = new int[256];
        for (int var7 = 0; var7 < 64; ++var7) {
            this.field174[var7] = var7 * 262144;
        }
        for (int var8 = 0; var8 < 64; ++var8) {
            this.field174[var8 + 64] = var8 * 1024 + 16711680;
        }
        for (int var9 = 0; var9 < 64; ++var9) {
            this.field174[var9 + 128] = var9 * 4 + 16776960;
        }
        for (int var10 = 0; var10 < 64; ++var10) {
            this.field174[var10 + 192] = 16777215;
        }
        this.field175 = new int[256];
        for (int var11 = 0; var11 < 64; ++var11) {
            this.field175[var11] = var11 * 1024;
        }
        for (int var12 = 0; var12 < 64; ++var12) {
            this.field175[var12 + 64] = var12 * 4 + 65280;
        }
        for (int var13 = 0; var13 < 64; ++var13) {
            this.field175[var13 + 128] = var13 * 262144 + 65535;
        }
        for (int var14 = 0; var14 < 64; ++var14) {
            this.field175[var14 + 192] = 16777215;
        }
        this.field176 = new int[256];
        for (int var15 = 0; var15 < 64; ++var15) {
            this.field176[var15] = var15 * 4;
        }
        for (int var16 = 0; var16 < 64; ++var16) {
            this.field176[var16 + 64] = var16 * 262144 + 255;
        }
        for (int var17 = 0; var17 < 64; ++var17) {
            this.field176[var17 + 128] = var17 * 1024 + 16711935;
        }
        for (int var18 = 0; var18 < 64; ++var18) {
            this.field176[var18 + 192] = 16777215;
        }
        this.field173 = new int[256];
        this.field125 = new int[32768];
        this.field126 = new int[32768];
        this.method63((class47) null, this.field450);
        this.field420 = new int[32768];
        this.field421 = new int[32768];
        this.method27(10, "Connecting to fileserver", -211);
        if (!this.field435) {
            this.field262 = true;
            this.field435 = true;
            this.method86(this, 2);
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(ZI)V")
    public final void method75(boolean arg0, int arg1) {
        if (field276.field102 >> 7 == this.field424 && field276.field103 >> 7 == this.field425) {
            this.field424 = 0;
        }
        int var3 = this.field558;
        int var4 = 39 / arg1;
        if (arg0) {
            var3 = 1;
        }
        for (int var5 = 0; var5 < var3; ++var5) {
            class21 var6;
            int var7;
            if (arg0) {
                var6 = field276;
                var7 = this.field556 << 14;
            } else {
                var6 = this.field557[this.field559[var5]];
                var7 = this.field559[var5] << 14;
            }
            if (var6 != null && var6.method20(false)) {
                var6.field782 = false;
                if ((field286 && this.field558 > 50 || this.field558 > 200) && !arg0 && var6.field66 == var6.field49) {
                    var6.field782 = true;
                }
                int var8 = var6.field102 >> 7;
                int var9 = var6.field103 >> 7;
                if (var8 >= 0 && var8 < 104 && var9 >= 0 && var9 < 104) {
                    if (var6.field786 != null && field438 >= var6.field798 && field438 < var6.field799) {
                        var6.field782 = false;
                        var6.field789 = this.method83(this.field326, true, var6.field102, var6.field103);
                        this.field121.method550(this.field326, var6.field789, var6.field794, var6.field102, var6.field795, var6.field796, var6, var6.field104, false, 60, var6.field103, var7, var6.field797);
                    } else {
                        if ((var6.field102 & 127) == 64 && (var6.field103 & 127) == 64) {
                            if (this.field433[var8][var9] == this.field410) {
                                continue;
                            }
                            this.field433[var8][var9] = this.field410;
                        }
                        var6.field789 = this.method83(this.field326, true, var6.field102, var6.field103);
                        this.field121.method549(var7, var6, var6.field103, var6.field104, var6.field789, 832, 60, var6.field102, var6.field65, this.field326);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIIIIIII)V")
    private final void method76(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        class67 var11 = null;
        class67 var12 = (class67) this.field257.method592();
        int var13 = 22 / arg7;
        while (var12 != null) {
            if (var12.field1635 == arg3 && var12.field1637 == arg0 && var12.field1638 == arg4 && var12.field1636 == arg2) {
                var11 = var12;
                break;
            }
            var12 = (class67) this.field257.method594(-314);
        }
        if (var11 == null) {
            var11 = new class67();
            var11.field1635 = arg3;
            var11.field1636 = arg2;
            var11.field1637 = arg0;
            var11.field1638 = arg4;
            this.method57(var11, 5);
            this.field257.method589(var11);
        }
        var11.field1639 = arg9;
        var11.field1641 = arg6;
        var11.field1640 = arg5;
        var11.field1634 = arg1;
        var11.field1633 = arg8;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZLXANVNPIN;II)V")
    public final void method77(boolean arg0, class65 arg1, int arg2, int arg3) {
        int var5 = this.field465 + this.field207 & 2047;
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 <= 6400) {
            int var7 = class55.field1401[var5];
            int var8 = class55.field1402[var5];
            if (!arg0) {
                this.field289 = 409;
            }
            int var9 = var7 * 256 / (this.field547 + 256);
            int var10 = var8 * 256 / (this.field547 + 256);
            int var11 = arg2 * var9 + arg3 * var10 >> 16;
            int var12 = arg2 * var10 - arg3 * var9 >> 16;
            if (var6 > 2500) {
                arg1.method535(this.field237, -29874, 83 - var12 - arg1.field1626 / 2 - 4, var11 + 94 - arg1.field1625 / 2 + 4);
            } else {
                arg1.method529((byte) 50, var11 + 94 - arg1.field1625 / 2 + 4, 83 - var12 - arg1.field1626 / 2 - 4);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIIZIILLUAMUNXO;)V")
    public final void method78(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, class30 arg8) {
        if (!arg5) {
            if (this.field494) {
                this.field124 = 32;
            } else {
                this.field124 = 0;
            }
            this.field494 = false;
            if (arg0 >= arg1 && arg0 < arg1 + 16 && arg3 >= arg6 && arg3 < arg6 + 16) {
                arg8.field989 -= this.field159 * 4;
                if (arg4 == 1) {
                    this.field372 = true;
                }
                if (arg4 == 2 || arg4 == 3) {
                    this.field205 = true;
                }
            } else if (arg0 >= arg1 && arg0 < arg1 + 16 && arg3 >= arg6 + arg7 - 16 && arg3 < arg6 + arg7) {
                arg8.field989 += this.field159 * 4;
                if (arg4 == 1) {
                    this.field372 = true;
                }
                if (arg4 == 2 || arg4 == 3) {
                    this.field205 = true;
                }
            } else if (arg0 >= arg1 - this.field124 && arg0 < arg1 + 16 + this.field124 && arg3 >= arg6 + 16 && arg3 < arg6 + arg7 - 16 && this.field159 > 0) {
                int var10 = (arg7 - 32) * arg7 / arg2;
                if (var10 < 8) {
                    var10 = 8;
                }
                int var11 = arg3 - arg6 - 16 - var10 / 2;
                int var12 = arg7 - 32 - var10;
                arg8.field989 = (arg2 - arg7) * var11 / var12;
                if (arg4 == 1) {
                    this.field372 = true;
                }
                if (arg4 == 2 || arg4 == 3) {
                    this.field205 = true;
                }
                this.field494 = true;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZIZ)V")
    public final void method79(boolean arg0, int arg1, boolean arg2) {
        if (arg0) {
            this.field150 = -1;
        }
        signlink.midivol = arg1;
        if (arg2) {
            signlink.midi = "voladjust";
        }
    }

    @OriginalMember(owner = "client", name = "h", descriptor = "(Z)V")
    public final void method80(boolean arg0) {
        class56.field1413.method403();
        class56.field1434.method403();
        class20.field747.method403();
        class26.field884.method403();
        class26.field840.method403();
        class21.field790.method403();
        this.field528 &= arg0;
        class37.field1149.method403();
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(Z)V")
    public final void method81(boolean arg0) {
        signlink.reporterror = false;
        try {
            if (this.field321 != null) {
                this.field321.method378();
            }
        } catch (Exception var2) {
        }
        this.field321 = null;
        this.method97(0);
        if (this.field214 != null) {
            this.field214.field605 = false;
        }
        this.field214 = null;
        this.field154.method329();
        this.field154 = null;
        this.field303 = null;
        this.field213 = null;
        this.field462 = null;
        this.field492 = null;
        this.field269 = null;
        this.field457 = null;
        this.field454 = null;
        this.field270 = null;
        this.field271 = null;
        this.field419 = null;
        this.field418 = null;
        this.field121 = null;
        this.field563 = null;
        this.field516 = null;
        this.field195 = null;
        this.field529 = null;
        this.field530 = null;
        this.field393 = null;
        this.field388 = null;
        this.field389 = null;
        this.field390 = null;
        this.field391 = null;
        this.field215 = null;
        this.field216 = null;
        this.field217 = null;
        this.field136 = null;
        this.field137 = null;
        this.field138 = null;
        this.field139 = null;
        this.field140 = null;
        this.field141 = null;
        this.field142 = null;
        this.field143 = null;
        this.field144 = null;
        this.field236 = null;
        this.field237 = null;
        this.field238 = null;
        this.field318 = null;
        this.field319 = null;
        this.field320 = null;
        this.field210 = null;
        this.field531 = null;
        this.field532 = null;
        this.field533 = null;
        this.field534 = null;
        this.field535 = null;
        this.field413 = null;
        this.field414 = null;
        this.field415 = null;
        this.field416 = null;
        this.field417 = null;
        this.field445 = null;
        this.field596 = null;
        this.field163 = null;
        this.field385 = null;
        this.field148 = null;
        this.field358 = null;
        this.field586 = null;
        this.field228 = null;
        this.field229 = null;
        this.field230 = null;
        this.field231 = null;
        this.field232 = null;
        this.field565 = null;
        this.field268 = null;
        this.field433 = null;
        this.field557 = null;
        this.field559 = null;
        this.field561 = null;
        this.field562 = null;
        this.field459 = null;
        this.field304 = null;
        this.field306 = null;
        this.field504 = null;
        this.field257 = null;
        this.field274 = null;
        this.field282 = null;
        this.field427 = null;
        this.field428 = null;
        this.field429 = null;
        this.field430 = null;
        this.field314 = null;
        this.field588 = null;
        this.field169 = null;
        this.field170 = null;
        this.field375 = null;
        this.field426 = null;
        this.field134 = null;
        this.field311 = null;
        this.field484 = null;
        this.field243 = null;
        this.field244 = null;
        this.field240 = null;
        this.field241 = null;
        this.field242 = null;
        this.field245 = null;
        this.field246 = null;
        this.field247 = null;
        this.field248 = null;
        this.method165(0);
        class56.method449(4);
        class20.method274(4);
        class26.method288(4);
        class30.method309(4);
        class19.field721 = null;
        class9.field617 = null;
        class32.field1045 = null;
        class71.field1727 = null;
        class37.field1137 = null;
        class37.field1149 = null;
        class54.field1311 = null;
        super.field906 = null;
        class21.field790 = null;
        class4.method2(4);
        class68.method537(4);
        class55.method414(4);
        if (arg0) {
            this.field150 = -1;
        }
        class39.method354(4);
        System.gc();
        if (class2.field14) {
        }
    }

    @OriginalMember(owner = "client", name = "m", descriptor = "(I)V")
    public final void method82(int arg0) {
        this.field149 += arg0;
        for (int var2 = -1; var2 < this.field558; ++var2) {
            int var6;
            if (var2 == -1) {
                var6 = this.field556;
            } else {
                var6 = this.field559[var2];
            }
            class21 var7 = this.field557[var6];
            if (var7 != null && var7.field72 > 0) {
                --var7.field72;
                if (var7.field72 == 0) {
                    var7.field99 = null;
                }
            }
        }
        for (int var3 = 0; var3 < this.field305; ++var3) {
            int var4 = this.field306[var3];
            class10 var5 = this.field304[var4];
            if (var5 != null && var5.field72 > 0) {
                --var5.field72;
                if (var5.field72 == 0) {
                    var5.field99 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IZII)I")
    public final int method83(int arg0, boolean arg1, int arg2, int arg3) {
        int var5 = arg2 >> 7;
        int var6 = arg3 >> 7;
        if (var5 >= 0 && var6 >= 0 && var5 <= 103 && var6 <= 103) {
            int var7 = arg0;
            if (arg0 < 3 && (this.field418[1][var5][var6] & 2) == 2) {
                var7 = arg0 + 1;
            }
            int var8 = arg2 & 127;
            int var9 = arg3 & 127;
            int var10 = (128 - var8) * this.field419[var7][var5][var6] + this.field419[var7][var5 + 1][var6] * var8 >> 7;
            this.field528 &= arg1;
            int var11 = (128 - var8) * this.field419[var7][var5][var6 + 1] + this.field419[var7][var5 + 1][var6 + 1] * var8 >> 7;
            return (128 - var9) * var10 + var9 * var11 >> 7;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        try {
            System.out.println("RS2 user client - release #" + 336);
            if (arg0.length != 5) {
                System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
            } else {
                field283 = Integer.parseInt(arg0[0]);
                field284 = Integer.parseInt(arg0[1]);
                if (arg0[2].equals("lowmem")) {
                    method95((byte) 127);
                } else {
                    if (!arg0[2].equals("highmem")) {
                        System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
                        return;
                    }
                    method85(-42665);
                }
                if (arg0[3].equals("free")) {
                    field285 = false;
                } else {
                    if (!arg0[3].equals("members")) {
                        System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
                        return;
                    }
                    field285 = true;
                }
                signlink.storeid = Integer.parseInt(arg0[4]);
                signlink.startpriv(InetAddress.getLocalHost());
                client var1 = new client();
                var1.method297(765, 503, 0);
            }
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client", name = "i", descriptor = "(Z)V")
    public final void method84(boolean arg0) {
        this.field376 = true;
        for (int var2 = 0; var2 < 7; ++var2) {
            this.field122[var2] = -1;
            for (int var3 = 0; var3 < class9.field616; ++var3) {
                if (!class9.field617[var3].field623 && class9.field617[var3].field618 == var2 + (this.field332 ? 0 : 7)) {
                    this.field122[var2] = var3;
                    break;
                }
            }
        }
        if (!arg0) {
            ;
        }
    }

    @OriginalMember(owner = "client", name = "n", descriptor = "(I)V")
    public static final void method85(int arg0) {
        class68.field1653 = false;
        class4.field25 = false;
        field286 = false;
        class41.field1202 = false;
        if (arg0 == -42665) {
            class56.field1447 = false;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
    public final void method86(Runnable arg0, int arg1) {
        if (arg1 > 10) {
            arg1 = 10;
        }
        if (signlink.mainapp != null) {
            signlink.startthread(arg0, arg1);
        } else {
            super.method86(arg0, arg1);
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(II)Ljava/lang/String;")
    public final String method87(int arg0, int arg1) {
        if (arg0 <= 0) {
            for (int var3 = 1; var3 > 0; ++var3) {
            }
        }
        return arg1 < 999999999 ? String.valueOf(arg1) : "*";
    }

    @OriginalMember(owner = "client", name = "m", descriptor = "(B)V")
    public final void method88(byte arg0) {
        if (this.field240 == null) {
            super.field906 = null;
            this.field391 = null;
            if (arg0 == 1) {
                boolean var2 = false;
            } else {
                for (int var3 = 1; var3 > 0; ++var3) {
                }
            }
            this.field389 = null;
            this.field388 = null;
            this.field390 = null;
            this.field215 = null;
            this.field216 = null;
            this.field217 = null;
            this.field243 = new class57(128, true, this.method73((byte) 0), 265);
            class62.method515((byte) 75);
            this.field244 = new class57(128, true, this.method73((byte) 0), 265);
            class62.method515((byte) 75);
            this.field240 = new class57(509, true, this.method73((byte) 0), 171);
            class62.method515((byte) 75);
            this.field241 = new class57(360, true, this.method73((byte) 0), 132);
            class62.method515((byte) 75);
            this.field242 = new class57(360, true, this.method73((byte) 0), 200);
            class62.method515((byte) 75);
            this.field245 = new class57(202, true, this.method73((byte) 0), 238);
            class62.method515((byte) 75);
            this.field246 = new class57(203, true, this.method73((byte) 0), 238);
            class62.method515((byte) 75);
            this.field247 = new class57(74, true, this.method73((byte) 0), 94);
            class62.method515((byte) 75);
            this.field248 = new class57(75, true, this.method73((byte) 0), 94);
            class62.method515((byte) 75);
            if (this.field202 != null) {
                this.method158(false);
                this.method74(false);
            }
            this.field379 = true;
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(I)V")
    public final void method89(int arg0) {
        if (arg0 >= 0) {
            this.method93();
        }
        this.field379 = true;
    }

    @OriginalMember(owner = "client", name = "o", descriptor = "(I)V")
    public final void method90(int arg0) {
        if (this.field485 == arg0) {
            if (super.field919 == 1) {
                if (super.field920 >= 539 && super.field920 <= 573 && super.field921 >= 169 && super.field921 < 205 && this.field398[0] != -1) {
                    this.field372 = true;
                    this.field384 = 0;
                    this.field258 = true;
                }
                if (super.field920 >= 569 && super.field920 <= 599 && super.field921 >= 168 && super.field921 < 205 && this.field398[1] != -1) {
                    this.field372 = true;
                    this.field384 = 1;
                    this.field258 = true;
                }
                if (super.field920 >= 597 && super.field920 <= 627 && super.field921 >= 168 && super.field921 < 205 && this.field398[2] != -1) {
                    this.field372 = true;
                    this.field384 = 2;
                    this.field258 = true;
                }
                if (super.field920 >= 625 && super.field920 <= 669 && super.field921 >= 168 && super.field921 < 203 && this.field398[3] != -1) {
                    this.field372 = true;
                    this.field384 = 3;
                    this.field258 = true;
                }
                if (super.field920 >= 666 && super.field920 <= 696 && super.field921 >= 168 && super.field921 < 205 && this.field398[4] != -1) {
                    this.field372 = true;
                    this.field384 = 4;
                    this.field258 = true;
                }
                if (super.field920 >= 694 && super.field920 <= 724 && super.field921 >= 168 && super.field921 < 205 && this.field398[5] != -1) {
                    this.field372 = true;
                    this.field384 = 5;
                    this.field258 = true;
                }
                if (super.field920 >= 722 && super.field920 <= 756 && super.field921 >= 169 && super.field921 < 205 && this.field398[6] != -1) {
                    this.field372 = true;
                    this.field384 = 6;
                    this.field258 = true;
                }
                if (super.field920 >= 540 && super.field920 <= 574 && super.field921 >= 466 && super.field921 < 502 && this.field398[7] != -1) {
                    this.field372 = true;
                    this.field384 = 7;
                    this.field258 = true;
                }
                if (super.field920 >= 572 && super.field920 <= 602 && super.field921 >= 466 && super.field921 < 503 && this.field398[8] != -1) {
                    this.field372 = true;
                    this.field384 = 8;
                    this.field258 = true;
                }
                if (super.field920 >= 599 && super.field920 <= 629 && super.field921 >= 466 && super.field921 < 503 && this.field398[9] != -1) {
                    this.field372 = true;
                    this.field384 = 9;
                    this.field258 = true;
                }
                if (super.field920 >= 627 && super.field920 <= 671 && super.field921 >= 467 && super.field921 < 502 && this.field398[10] != -1) {
                    this.field372 = true;
                    this.field384 = 10;
                    this.field258 = true;
                }
                if (super.field920 >= 669 && super.field920 <= 699 && super.field921 >= 466 && super.field921 < 503 && this.field398[11] != -1) {
                    this.field372 = true;
                    this.field384 = 11;
                    this.field258 = true;
                }
                if (super.field920 >= 696 && super.field920 <= 726 && super.field921 >= 466 && super.field921 < 503 && this.field398[12] != -1) {
                    this.field372 = true;
                    this.field384 = 12;
                    this.field258 = true;
                }
                if (super.field920 >= 724 && super.field920 <= 758 && super.field921 >= 466 && super.field921 < 502 && this.field398[13] != -1) {
                    this.field372 = true;
                    this.field384 = 13;
                    this.field258 = true;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LLUAMUNXO;B)Z")
    public final boolean method91(class30 arg0, byte arg1) {
        if (arg1 == 5) {
            boolean var3 = false;
            if (arg0.field961 == null) {
                return false;
            } else {
                for (int var4 = 0; var4 < arg0.field961.length; ++var4) {
                    int var5 = this.method167(var4, arg0, -140);
                    int var6 = arg0.field1015[var4];
                    if (arg0.field961[var4] == 2) {
                        if (var5 >= var6) {
                            return false;
                        }
                    } else if (arg0.field961[var4] == 3) {
                        if (var5 <= var6) {
                            return false;
                        }
                    } else if (arg0.field961[var4] == 4) {
                        if (var5 == var6) {
                            return false;
                        }
                    } else if (var5 != var6) {
                        return false;
                    }
                }
                return true;
            }
        } else {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIII)I")
    public final int method92(int arg0, int arg1, int arg2, int arg3) {
        int var5 = 256 - arg1;
        if (arg3 != 0) {
            for (int var6 = 1; var6 > 0; ++var6) {
            }
        }
        return ((arg0 & 16711935) * arg1 + (arg2 & 16711935) * var5 & -16711936) + ((arg0 & 65280) * arg1 + (arg2 & 65280) * var5 & 16711680) >> 8;
    }

    @OriginalMember(owner = "client", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        return signlink.mainapp != null ? signlink.mainapp.getParameter(arg0) : super.getParameter(arg0);
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "()V")
    public final void method93() {
        this.method27(20, "Starting up", -211);
        if (signlink.sunjava) {
            super.field899 = 5;
        }
        if (field316) {
            this.field370 = true;
        } else {
            field316 = true;
            boolean var1 = false;
            String var2 = this.method157(0);
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
                this.field227 = true;
            } else {
                if (signlink.cache_dat != null) {
                    for (int var3 = 0; var3 < 5; ++var3) {
                        this.field309[var3] = new class18(var3 + 1, 500000, signlink.cache_idx[var3], 0, signlink.cache_dat);
                    }
                }
                try {
                    this.method28(879);
                    this.field202 = this.method47("title screen", "title", this.field491[1], 25, 1, (byte) 4);
                    this.field446 = new class13("p11_full", false, false, this.field202);
                    this.field447 = new class13("p12_full", false, false, this.field202);
                    this.field448 = new class13("b12_full", false, false, this.field202);
                    this.field449 = new class13("q8_full", false, true, this.field202);
                    this.method158(false);
                    this.method74(false);
                    class14 var4 = this.method47("config", "config", this.field491[2], 30, 2, (byte) 4);
                    class14 var5 = this.method47("interface", "interface", this.field491[3], 35, 3, (byte) 4);
                    class14 var6 = this.method47("2d graphics", "media", this.field491[4], 40, 4, (byte) 4);
                    class14 var7 = this.method47("textures", "textures", this.field491[6], 45, 6, (byte) 4);
                    class14 var8 = this.method47("chat system", "wordenc", this.field491[7], 50, 7, (byte) 4);
                    class14 var9 = this.method47("sound effects", "sounds", this.field491[8], 55, 8, (byte) 4);
                    this.field418 = new byte[4][104][104];
                    this.field419 = new int[4][105][105];
                    this.field121 = new class68(false, 104, 4, this.field419, 104);
                    for (int var10 = 0; var10 < 4; ++var10) {
                        this.field563[var10] = new class61(true, 104, 104);
                    }
                    this.field426 = new class65(512, 512);
                    class14 var11 = this.method47("update list", "versionlist", this.field491[5], 60, 5, (byte) 4);
                    this.method27(60, "Connecting to update server", -211);
                    this.field154 = new class35();
                    this.field154.method347(var11, this);
                    class39.method352(this.field154.method335(0));
                    class55.method415(this.field154.method342(0, true), this.field154);
                    if (!field286) {
                        this.field131 = 0;
                        try {
                            this.field131 = Integer.parseInt(this.getParameter("music"));
                        } catch (Exception var72) {
                        }
                        this.field132 = true;
                        this.field154.method328(2, this.field131);
                        while (this.field154.method337() > 0) {
                            this.method168(988);
                            try {
                                Thread.sleep(100L);
                            } catch (Exception var71) {
                            }
                            if (this.field154.field1109 > 3) {
                                this.method145("ondemand");
                                return;
                            }
                        }
                    }
                    this.method27(65, "Requesting animations", -211);
                    int var12 = this.field154.method342(1, true);
                    for (int var13 = 0; var13 < var12; ++var13) {
                        this.field154.method328(1, var13);
                    }
                    while (this.field154.method337() > 0) {
                        int var14 = var12 - this.field154.method337();
                        if (var14 > 0) {
                            this.method27(65, "Loading animations - " + var14 * 100 / var12 + "%", -211);
                        }
                        this.method168(988);
                        try {
                            Thread.sleep(100L);
                        } catch (Exception var70) {
                        }
                        if (this.field154.field1109 > 3) {
                            this.method145("ondemand");
                            return;
                        }
                    }
                    this.method27(70, "Requesting models", -211);
                    int var15 = this.field154.method342(0, true);
                    for (int var16 = 0; var16 < var15; ++var16) {
                        int var17 = this.field154.method338(-30035, var16);
                        if ((var17 & 1) != 0) {
                            this.field154.method328(0, var16);
                        }
                    }
                    int var18 = this.field154.method337();
                    while (this.field154.method337() > 0) {
                        int var19 = var18 - this.field154.method337();
                        if (var19 > 0) {
                            this.method27(70, "Loading models - " + var19 * 100 / var18 + "%", -211);
                        }
                        this.method168(988);
                        try {
                            Thread.sleep(100L);
                        } catch (Exception var69) {
                        }
                    }
                    if (this.field309[0] != null) {
                        this.method27(75, "Requesting maps", -211);
                        this.field154.method328(3, this.field154.method340(true, 48, 47, 0));
                        this.field154.method328(3, this.field154.method340(true, 48, 47, 1));
                        this.field154.method328(3, this.field154.method340(true, 48, 48, 0));
                        this.field154.method328(3, this.field154.method340(true, 48, 48, 1));
                        this.field154.method328(3, this.field154.method340(true, 48, 49, 0));
                        this.field154.method328(3, this.field154.method340(true, 48, 49, 1));
                        this.field154.method328(3, this.field154.method340(true, 47, 47, 0));
                        this.field154.method328(3, this.field154.method340(true, 47, 47, 1));
                        this.field154.method328(3, this.field154.method340(true, 47, 48, 0));
                        this.field154.method328(3, this.field154.method340(true, 47, 48, 1));
                        this.field154.method328(3, this.field154.method340(true, 148, 48, 0));
                        this.field154.method328(3, this.field154.method340(true, 148, 48, 1));
                        int var20 = this.field154.method337();
                        while (this.field154.method337() > 0) {
                            int var21 = var20 - this.field154.method337();
                            if (var21 > 0) {
                                this.method27(75, "Loading maps - " + var21 * 100 / var20 + "%", -211);
                            }
                            this.method168(988);
                            try {
                                Thread.sleep(100L);
                            } catch (Exception var68) {
                            }
                        }
                    }
                    int var22 = this.field154.method342(0, true);
                    for (int var23 = 0; var23 < var22; ++var23) {
                        int var24 = this.field154.method338(-30035, var23);
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
                            this.field154.method332(0, var25, 212, var23);
                        }
                    }
                    this.field154.method334(true, field285);
                    if (!field286) {
                        int var26 = this.field154.method342(2, true);
                        for (int var27 = 1; var27 < var26; ++var27) {
                            if (this.field154.method339(var27, field302)) {
                                this.field154.method332(2, (byte) 1, 212, var27);
                            }
                        }
                    }
                    this.method27(80, "Unpacking media", -211);
                    this.field236 = new class47(var6, "invback", 0);
                    this.field238 = new class47(var6, "chatback", 0);
                    this.field237 = new class47(var6, "mapback", 0);
                    this.field318 = new class47(var6, "backbase1", 0);
                    this.field319 = new class47(var6, "backbase2", 0);
                    this.field320 = new class47(var6, "backhmid1", 0);
                    for (int var28 = 0; var28 < 13; ++var28) {
                        this.field210[var28] = new class47(var6, "sideicons", var28);
                    }
                    this.field445 = new class65(var6, "compass", 0);
                    this.field574 = new class65(var6, "mapedge", 0);
                    this.field574.method526(353);
                    for (int var29 = 0; var29 < 72; ++var29) {
                        this.field565[var29] = new class47(var6, "mapscene", var29);
                    }
                    for (int var30 = 0; var30 < 63; ++var30) {
                        this.field268[var30] = new class65(var6, "mapfunction", var30);
                    }
                    for (int var31 = 0; var31 < 5; ++var31) {
                        this.field596[var31] = new class65(var6, "hitmarks", var31);
                    }
                    for (int var32 = 0; var32 < 6; ++var32) {
                        this.field163[var32] = new class65(var6, "headicons_pk", var32);
                    }
                    for (int var33 = 0; var33 < 9; ++var33) {
                        this.field385[var33] = new class65(var6, "headicons_prayer", var33);
                    }
                    for (int var34 = 0; var34 < 6; ++var34) {
                        this.field148[var34] = new class65(var6, "headicons_hint", var34);
                    }
                    this.field586 = new class65(var6, "overlay_multiway", 0);
                    this.field550 = new class65(var6, "mapmarker", 0);
                    this.field551 = new class65(var6, "mapmarker", 1);
                    for (int var35 = 0; var35 < 8; ++var35) {
                        this.field358[var35] = new class65(var6, "cross", var35);
                    }
                    this.field228 = new class65(var6, "mapdots", 0);
                    this.field229 = new class65(var6, "mapdots", 1);
                    this.field230 = new class65(var6, "mapdots", 2);
                    this.field231 = new class65(var6, "mapdots", 3);
                    this.field232 = new class65(var6, "mapdots", 4);
                    this.field365 = new class47(var6, "scrollbar", 0);
                    this.field366 = new class47(var6, "scrollbar", 1);
                    this.field531 = new class47(var6, "redstone1", 0);
                    this.field532 = new class47(var6, "redstone2", 0);
                    this.field533 = new class47(var6, "redstone3", 0);
                    this.field534 = new class47(var6, "redstone1", 0);
                    this.field534.method387(929);
                    this.field535 = new class47(var6, "redstone2", 0);
                    this.field535.method387(929);
                    this.field413 = new class47(var6, "redstone1", 0);
                    this.field413.method388((byte) 118);
                    this.field414 = new class47(var6, "redstone2", 0);
                    this.field414.method388((byte) 118);
                    this.field415 = new class47(var6, "redstone3", 0);
                    this.field415.method388((byte) 118);
                    this.field416 = new class47(var6, "redstone1", 0);
                    this.field416.method387(929);
                    this.field416.method388((byte) 118);
                    this.field417 = new class47(var6, "redstone2", 0);
                    this.field417.method387(929);
                    this.field417.method388((byte) 118);
                    for (int var36 = 0; var36 < 2; ++var36) {
                        this.field315[var36] = new class47(var6, "mod_icons", var36);
                    }
                    class65 var37 = new class65(var6, "backleft1", 0);
                    this.field136 = new class57(var37.field1621, true, this.method73((byte) 0), var37.field1622);
                    var37.method527((byte) 1, 0, 0);
                    class65 var38 = new class65(var6, "backleft2", 0);
                    this.field137 = new class57(var38.field1621, true, this.method73((byte) 0), var38.field1622);
                    var38.method527((byte) 1, 0, 0);
                    class65 var39 = new class65(var6, "backright1", 0);
                    this.field138 = new class57(var39.field1621, true, this.method73((byte) 0), var39.field1622);
                    var39.method527((byte) 1, 0, 0);
                    class65 var40 = new class65(var6, "backright2", 0);
                    this.field139 = new class57(var40.field1621, true, this.method73((byte) 0), var40.field1622);
                    var40.method527((byte) 1, 0, 0);
                    class65 var41 = new class65(var6, "backtop1", 0);
                    this.field140 = new class57(var41.field1621, true, this.method73((byte) 0), var41.field1622);
                    var41.method527((byte) 1, 0, 0);
                    class65 var42 = new class65(var6, "backvmid1", 0);
                    this.field141 = new class57(var42.field1621, true, this.method73((byte) 0), var42.field1622);
                    var42.method527((byte) 1, 0, 0);
                    class65 var43 = new class65(var6, "backvmid2", 0);
                    this.field142 = new class57(var43.field1621, true, this.method73((byte) 0), var43.field1622);
                    var43.method527((byte) 1, 0, 0);
                    class65 var44 = new class65(var6, "backvmid3", 0);
                    this.field143 = new class57(var44.field1621, true, this.method73((byte) 0), var44.field1622);
                    var44.method527((byte) 1, 0, 0);
                    class65 var45 = new class65(var6, "backhmid2", 0);
                    this.field144 = new class57(var45.field1621, true, this.method73((byte) 0), var45.field1622);
                    var45.method527((byte) 1, 0, 0);
                    int var46 = (int) (Math.random() * 21.0D) - 10;
                    int var47 = (int) (Math.random() * 21.0D) - 10;
                    int var48 = (int) (Math.random() * 21.0D) - 10;
                    int var49 = (int) (Math.random() * 41.0D) - 20;
                    for (int var50 = 0; var50 < 100; ++var50) {
                        if (this.field268[var50] != null) {
                            this.field268[var50].method525(var46 + var49, var48 + var49, var47 + var49, 1);
                        }
                        if (this.field565[var50] != null) {
                            this.field565[var50].method389(var46 + var49, var48 + var49, var47 + var49, 1);
                        }
                    }
                    this.method27(83, "Unpacking textures", -211);
                    class4.method7(-518, var7);
                    class4.method11(0.8D, (byte) 0);
                    class4.method6(3, 20);
                    this.method27(86, "Unpacking config", -211);
                    class71.method597(var4, field156);
                    class56.method447(var4);
                    class19.method263(var4, field156);
                    class26.method290(var4);
                    class20.method271(var4);
                    class9.method169(var4, field156);
                    class37.method349(var4, field156);
                    class54.method412(var4, field156);
                    class31.method318(var4, field156);
                    class26.field879 = field285;
                    if (!field286) {
                        this.method27(90, "Unpacking sounds", -211);
                        byte[] var51 = var9.method246("sounds.dat", (byte[]) null);
                        class11 var52 = new class11(var51, field500);
                        class33.method320(var52, field156);
                    }
                    this.method27(95, "Unpacking interfaces", -211);
                    class13[] var53 = new class13[] { this.field446, this.field447, this.field448, this.field449 };
                    class30.method315(var5, var53, 6, var6);
                    this.method27(100, "Preparing game engine", -211);
                    for (int var54 = 0; var54 < 33; ++var54) {
                        int var55 = 999;
                        int var56 = 0;
                        for (int var57 = 0; var57 < 34; ++var57) {
                            if (this.field237.field1267[this.field237.field1269 * var54 + var57] == 0) {
                                if (var55 == 999) {
                                    var55 = var57;
                                }
                            } else if (var55 != 999) {
                                var56 = var57;
                                break;
                            }
                        }
                        this.field108[var54] = var55;
                        this.field539[var54] = var56 - var55;
                    }
                    for (int var58 = 5; var58 < 156; ++var58) {
                        int var59 = 999;
                        int var60 = 0;
                        for (int var61 = 25; var61 < 172; ++var61) {
                            if (this.field237.field1267[this.field237.field1269 * var58 + var61] == 0 && (var61 > 34 || var58 > 34)) {
                                if (var59 == 999) {
                                    var59 = var61;
                                }
                            } else if (var59 != 999) {
                                var60 = var61;
                                break;
                            }
                        }
                        this.field482[var58 - 5] = var59 - 25;
                        this.field537[var58 - 5] = var60 - var59;
                    }
                    class4.method4((byte) -93, 765, 503);
                    this.field442 = class4.field36;
                    class4.method4((byte) -93, 479, 96);
                    this.field439 = class4.field36;
                    class4.method4((byte) -93, 190, 261);
                    this.field440 = class4.field36;
                    class4.method4((byte) -93, 512, 334);
                    this.field441 = class4.field36;
                    int[] var62 = new int[9];
                    for (int var63 = 0; var63 < 9; ++var63) {
                        int var64 = var63 * 32 + 128 + 15;
                        int var65 = var64 * 3 + 600;
                        int var66 = class4.field34[var64];
                        var62[var63] = var65 * var66 >> 16;
                    }
                    class68.method574((byte) 82, var62, 334, 512, 500, 800);
                    class59.method462(var8);
                    this.field214 = new class7(field578, this);
                    this.method86(this.field214, 10);
                    class45.field1252 = this;
                    class56.field1414 = this;
                    class20.field773 = this;
                } catch (Exception var73) {
                    signlink.reporterror("loaderror " + this.field191 + " " + this.field380);
                    this.field405 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "j", descriptor = "(Z)V")
    public final void method94(boolean arg0) {
        this.field423 = true;
        try {
            long var2 = System.currentTimeMillis();
            int var4 = 0;
            int var5 = 20;
            while (this.field435) {
                ++this.field392;
                this.method133(true);
                this.method133(true);
                this.method38((byte) 9);
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
        this.field423 = false;
        if (!arg0) {
            ;
        }
    }

    @OriginalMember(owner = "client", name = "n", descriptor = "(B)V")
    public static final void method95(byte arg0) {
        class68.field1653 = true;
        if (field519 != arg0) {
            for (int var1 = 1; var1 > 0; ++var1) {
            }
        }
        class4.field25 = true;
        field286 = true;
        class41.field1202 = true;
        class56.field1447 = true;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILDNRIFKTO;B)V")
    private final void method96(int arg0, class11 arg1, byte arg2) {
        if (this.field277 == arg2) {
            boolean var4 = false;
            for (int var5 = 0; var5 < this.field560; ++var5) {
                int var6 = this.field561[var5];
                class21 var7 = this.field557[var6];
                int var8 = arg1.method189();
                if ((var8 & 8) != 0) {
                    var8 += arg1.method189() << 8;
                }
                this.method32(var7, 2, arg1, var6, var8);
            }
        }
    }

    @OriginalMember(owner = "client", name = "p", descriptor = "(I)V")
    public final void method97(int arg0) {
        signlink.midiplay = false;
        this.field149 += arg0;
        signlink.midifade = 0;
        signlink.midi = "stop";
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LDNRIFKTO;IZ)V")
    private final void method98(class11 arg0, int arg1, boolean arg2) {
        this.field528 &= arg2;
        arg0.method199((byte) 113);
        int var4 = arg0.method200(5, 8);
        if (var4 < this.field305) {
            for (int var5 = var4; var5 < this.field305; ++var5) {
                this.field459[this.field458++] = this.field306[var5];
            }
        }
        if (var4 > this.field305) {
            signlink.reporterror(this.field294 + " Too many npcs");
            throw new RuntimeException("eek");
        } else {
            this.field305 = 0;
            for (int var6 = 0; var6 < var4; ++var6) {
                int var7 = this.field306[var6];
                class10 var8 = this.field304[var7];
                int var9 = arg0.method200(5, 1);
                if (var9 == 0) {
                    this.field306[this.field305++] = var7;
                    var8.field71 = field438;
                } else {
                    int var10 = arg0.method200(5, 2);
                    if (var10 == 0) {
                        this.field306[this.field305++] = var7;
                        var8.field71 = field438;
                        this.field561[this.field560++] = var7;
                    } else if (var10 == 1) {
                        this.field306[this.field305++] = var7;
                        var8.field71 = field438;
                        int var11 = arg0.method200(5, 3);
                        var8.method19(true, var11, false);
                        int var12 = arg0.method200(5, 1);
                        if (var12 == 1) {
                            this.field561[this.field560++] = var7;
                        }
                    } else if (var10 == 2) {
                        this.field306[this.field305++] = var7;
                        var8.field71 = field438;
                        int var13 = arg0.method200(5, 3);
                        var8.method19(true, var13, true);
                        int var14 = arg0.method200(5, 3);
                        var8.method19(true, var14, true);
                        int var15 = arg0.method200(5, 1);
                        if (var15 == 1) {
                            this.field561[this.field560++] = var7;
                        }
                    } else if (var10 == 3) {
                        this.field459[this.field458++] = var7;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;B)Z")
    public final boolean method99(String arg0, byte arg1) {
        if (arg1 == 4) {
            boolean var3 = false;
        } else {
            field541 = 14;
        }
        if (arg0 == null) {
            return false;
        } else {
            for (int var4 = 0; var4 < this.field298; ++var4) {
                if (arg0.equalsIgnoreCase(this.field134[var4])) {
                    return true;
                }
            }
            return arg0.equalsIgnoreCase(field276.field805);
        }
    }

    @OriginalMember(owner = "client", name = "q", descriptor = "(I)V")
    public final void method100(int arg0) {
        for (int var2 = 0; var2 < this.field507; ++var2) {
            if (this.field260[var2] <= 0) {
                boolean var3 = false;
                try {
                    if (this.field501[var2] == this.field598 && this.field490[var2] == this.field160) {
                        if (!this.method112((byte) 2)) {
                            var3 = true;
                        }
                    } else {
                        class11 var4 = class33.method321((byte) 1, this.field501[var2], this.field490[var2]);
                        if (System.currentTimeMillis() + (long) (var4.field643 / 22) > (long) (this.field564 / 22) + this.field288) {
                            this.field564 = var4.field643;
                            this.field288 = System.currentTimeMillis();
                            if (this.method115(var4.field642, 1, var4.field643)) {
                                this.field598 = this.field501[var2];
                                this.field160 = this.field490[var2];
                            } else {
                                var3 = true;
                            }
                        }
                    }
                } catch (Exception var7) {
                }
                if (var3 && this.field260[var2] != -5) {
                    this.field260[var2] = -5;
                } else {
                    --this.field507;
                    for (int var6 = var2; var6 < this.field507; ++var6) {
                        this.field501[var6] = this.field501[var6 + 1];
                        this.field490[var6] = this.field490[var6 + 1];
                        this.field260[var6] = this.field260[var6 + 1];
                    }
                    --var2;
                }
            } else {
                int var10002 = this.field260[var2]--;
            }
        }
        if (arg0 != -17887) {
            this.field150 = -1;
        }
        if (this.field536 > 0) {
            this.field536 -= 20;
            if (this.field536 < 0) {
                this.field536 = 0;
            }
            if (this.field536 == 0 && this.field508 && !field286) {
                this.field131 = this.field264;
                this.field132 = true;
                this.field154.method328(2, this.field131);
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "k", descriptor = "(Z)V")
    public final void method101(boolean arg0) {
        ++field297;
        this.field528 &= arg0;
        if (field297 > 191) {
            field297 = 0;
            this.field213.method178(false, 123);
            this.field213.method183(0);
        }
        for (int var2 = 0; var2 < this.field305; ++var2) {
            int var3 = this.field306[var2];
            class10 var4 = this.field304[var3];
            if (var4 != null) {
                this.method102(7, var4.field626.field751, var4);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IILBTOCNVPA;)V")
    public final void method102(int arg0, int arg1, class5 arg2) {
        if (arg2.field102 < 128 || arg2.field103 < 128 || arg2.field102 >= 13184 || arg2.field103 >= 13184) {
            arg2.field90 = -1;
            arg2.field59 = -1;
            arg2.field80 = 0;
            arg2.field81 = 0;
            arg2.field102 = arg2.field88[0] * 128 + arg2.field68 * 64;
            arg2.field103 = arg2.field89[0] * 128 + arg2.field68 * 64;
            arg2.method21((byte) 5);
        }
        if (field276 == arg2 && (arg2.field102 < 1536 || arg2.field103 < 1536 || arg2.field102 >= 11776 || arg2.field103 >= 11776)) {
            arg2.field90 = -1;
            arg2.field59 = -1;
            arg2.field80 = 0;
            arg2.field81 = 0;
            arg2.field102 = arg2.field88[0] * 128 + arg2.field68 * 64;
            arg2.field103 = arg2.field89[0] * 128 + arg2.field68 * 64;
            arg2.method21((byte) 5);
        }
        if (arg2.field80 > field438) {
            this.method103(0, arg2);
        } else if (arg2.field81 >= field438) {
            this.method104(true, arg2);
        } else {
            this.method105(arg2, 0);
        }
        this.method106(-355, arg2);
        this.method107((byte) 5, arg2);
        if (arg0 == 7) {
            ;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILBTOCNVPA;)V")
    public final void method103(int arg0, class5 arg1) {
        int var3 = arg1.field80 - field438;
        int var4 = arg1.field76 * 128 + arg1.field68 * 64;
        int var5 = arg1.field78 * 128 + arg1.field68 * 64;
        arg1.field102 += (var4 - arg1.field102) / var3;
        if (arg0 != 0) {
            this.field150 = this.field492.method189();
        }
        arg1.field103 += (var5 - arg1.field103) / var3;
        arg1.field101 = 0;
        if (arg1.field82 == 0) {
            arg1.field74 = 1024;
        }
        if (arg1.field82 == 1) {
            arg1.field74 = 1536;
        }
        if (arg1.field82 == 2) {
            arg1.field74 = 0;
        }
        if (arg1.field82 == 3) {
            arg1.field74 = 512;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZLBTOCNVPA;)V")
    public final void method104(boolean arg0, class5 arg1) {
        if (field438 == arg1.field81 || arg1.field90 == -1 || arg1.field93 != 0 || arg1.field92 + 1 > class71.field1727[arg1.field90].method598(arg1.field91, -818)) {
            int var3 = arg1.field81 - arg1.field80;
            int var4 = field438 - arg1.field80;
            int var5 = arg1.field76 * 128 + arg1.field68 * 64;
            int var6 = arg1.field78 * 128 + arg1.field68 * 64;
            int var7 = arg1.field77 * 128 + arg1.field68 * 64;
            int var8 = arg1.field79 * 128 + arg1.field68 * 64;
            arg1.field102 = ((var3 - var4) * var5 + var4 * var7) / var3;
            arg1.field103 = ((var3 - var4) * var6 + var4 * var8) / var3;
        }
        arg1.field101 = 0;
        if (!arg0) {
            this.field597 = !this.field597;
        }
        if (arg1.field82 == 0) {
            arg1.field74 = 1024;
        }
        if (arg1.field82 == 1) {
            arg1.field74 = 1536;
        }
        if (arg1.field82 == 2) {
            arg1.field74 = 0;
        }
        if (arg1.field82 == 3) {
            arg1.field74 = 512;
        }
        arg1.field104 = arg1.field74;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LBTOCNVPA;I)V")
    public final void method105(class5 arg0, int arg1) {
        arg0.field49 = arg0.field66;
        if (arg0.field83 == 0) {
            arg0.field101 = 0;
        } else {
            if (arg0.field90 != -1 && arg0.field93 == 0) {
                class71 var3 = class71.field1727[arg0.field90];
                if (arg0.field95 > 0 && var3.field1739 == 0) {
                    ++arg0.field101;
                    return;
                }
                if (arg0.field95 <= 0 && var3.field1740 == 0) {
                    ++arg0.field101;
                    return;
                }
            }
            int var4 = arg0.field102;
            int var5 = arg0.field103;
            if (arg1 != 0) {
                this.field463 = !this.field463;
            }
            int var6 = arg0.field88[arg0.field83 - 1] * 128 + arg0.field68 * 64;
            int var7 = arg0.field89[arg0.field83 - 1] * 128 + arg0.field68 * 64;
            if (var6 - var4 <= 256 && var6 - var4 >= -256 && var7 - var5 <= 256 && var7 - var5 >= -256) {
                if (var4 < var6) {
                    if (var5 < var7) {
                        arg0.field74 = 1280;
                    } else if (var5 > var7) {
                        arg0.field74 = 1792;
                    } else {
                        arg0.field74 = 1536;
                    }
                } else if (var4 > var6) {
                    if (var5 < var7) {
                        arg0.field74 = 768;
                    } else if (var5 > var7) {
                        arg0.field74 = 256;
                    } else {
                        arg0.field74 = 512;
                    }
                } else if (var5 < var7) {
                    arg0.field74 = 1024;
                } else {
                    arg0.field74 = 0;
                }
                int var8 = arg0.field74 - arg0.field104 & 2047;
                if (var8 > 1024) {
                    var8 -= 2048;
                }
                int var9 = arg0.field56;
                if (var8 >= -256 && var8 <= 256) {
                    var9 = arg0.field55;
                } else if (var8 >= 256 && var8 < 768) {
                    var9 = arg0.field58;
                } else if (var8 >= -768 && var8 <= -256) {
                    var9 = arg0.field57;
                }
                if (var9 == -1) {
                    var9 = arg0.field55;
                }
                arg0.field49 = var9;
                int var10 = 4;
                if (arg0.field74 != arg0.field104 && arg0.field69 == -1 && arg0.field85 != 0) {
                    var10 = 2;
                }
                if (arg0.field83 > 2) {
                    var10 = 6;
                }
                if (arg0.field83 > 3) {
                    var10 = 8;
                }
                if (arg0.field101 > 0 && arg0.field83 > 1) {
                    var10 = 8;
                    --arg0.field101;
                }
                if (arg0.field48[arg0.field83 - 1]) {
                    var10 <<= 1;
                }
                if (var10 >= 8 && arg0.field55 == arg0.field49 && arg0.field100 != -1) {
                    arg0.field49 = arg0.field100;
                }
                if (var4 < var6) {
                    arg0.field102 += var10;
                    if (arg0.field102 > var6) {
                        arg0.field102 = var6;
                    }
                } else if (var4 > var6) {
                    arg0.field102 -= var10;
                    if (arg0.field102 < var6) {
                        arg0.field102 = var6;
                    }
                }
                if (var5 < var7) {
                    arg0.field103 += var10;
                    if (arg0.field103 > var7) {
                        arg0.field103 = var7;
                    }
                } else if (var5 > var7) {
                    arg0.field103 -= var10;
                    if (arg0.field103 < var7) {
                        arg0.field103 = var7;
                    }
                }
                if (arg0.field102 == var6 && arg0.field103 == var7) {
                    --arg0.field83;
                    if (arg0.field95 > 0) {
                        --arg0.field95;
                        return;
                    }
                }
            } else {
                arg0.field102 = var6;
                arg0.field103 = var7;
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(ILBTOCNVPA;)V")
    public final void method106(int arg0, class5 arg1) {
        while (arg0 >= 0) {
            this.field150 = -1;
        }
        if (arg1.field85 != 0) {
            if (arg1.field69 != -1 && arg1.field69 < 32768) {
                class10 var3 = this.field304[arg1.field69];
                if (var3 != null) {
                    int var4 = arg1.field102 - var3.field102;
                    int var5 = arg1.field103 - var3.field103;
                    if (var4 != 0 || var5 != 0) {
                        arg1.field74 = (int) (Math.atan2((double) var4, (double) var5) * 325.949D) & 2047;
                    }
                }
            }
            if (arg1.field69 >= 32768) {
                int var6 = arg1.field69 - 32768;
                if (this.field526 == var6) {
                    var6 = this.field556;
                }
                class21 var7 = this.field557[var6];
                if (var7 != null) {
                    int var8 = arg1.field102 - var7.field102;
                    int var9 = arg1.field103 - var7.field103;
                    if (var8 != 0 || var9 != 0) {
                        arg1.field74 = (int) (Math.atan2((double) var8, (double) var9) * 325.949D) & 2047;
                    }
                }
            }
            if ((arg1.field86 != 0 || arg1.field87 != 0) && (arg1.field83 == 0 || arg1.field101 > 0)) {
                int var10 = arg1.field102 - (arg1.field86 - this.field322 - this.field322) * 64;
                int var11 = arg1.field103 - (arg1.field87 - this.field323 - this.field323) * 64;
                if (var10 != 0 || var11 != 0) {
                    arg1.field74 = (int) (Math.atan2((double) var10, (double) var11) * 325.949D) & 2047;
                }
                arg1.field86 = 0;
                arg1.field87 = 0;
            }
            int var12 = arg1.field74 - arg1.field104 & 2047;
            if (var12 != 0) {
                if (var12 >= arg1.field85 && var12 <= 2048 - arg1.field85) {
                    if (var12 > 1024) {
                        arg1.field104 -= arg1.field85;
                    } else {
                        arg1.field104 += arg1.field85;
                    }
                } else {
                    arg1.field104 = arg1.field74;
                }
                arg1.field104 &= 2047;
                if (arg1.field66 == arg1.field49 && arg1.field74 != arg1.field104) {
                    if (arg1.field67 != -1) {
                        arg1.field49 = arg1.field67;
                        return;
                    }
                    arg1.field49 = arg1.field55;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BLBTOCNVPA;)V")
    public final void method107(byte arg0, class5 arg1) {
        if (this.field266 != arg0) {
            this.field408 = -425;
        }
        arg1.field65 = false;
        if (arg1.field49 != -1) {
            class71 var3 = class71.field1727[arg1.field49];
            ++arg1.field51;
            if (arg1.field50 < var3.field1728 && arg1.field51 > var3.method598(arg1.field50, -818)) {
                arg1.field51 = 0;
                ++arg1.field50;
            }
            if (arg1.field50 >= var3.field1728) {
                arg1.field51 = 0;
                arg1.field50 = 0;
            }
        }
        if (arg1.field59 != -1 && field438 >= arg1.field62) {
            if (arg1.field60 < 0) {
                arg1.field60 = 0;
            }
            class71 var4 = class37.field1137[arg1.field59].field1141;
            ++arg1.field61;
            while (arg1.field60 < var4.field1728 && arg1.field61 > var4.method598(arg1.field60, -818)) {
                arg1.field61 -= var4.method598(arg1.field60, -818);
                ++arg1.field60;
            }
            if (arg1.field60 >= var4.field1728 && (arg1.field60 < 0 || arg1.field60 >= var4.field1728)) {
                arg1.field59 = -1;
            }
        }
        if (arg1.field90 != -1 && arg1.field93 <= 1) {
            class71 var5 = class71.field1727[arg1.field90];
            if (var5.field1739 == 1 && arg1.field95 > 0 && arg1.field80 <= field438 && arg1.field81 < field438) {
                arg1.field93 = 1;
                return;
            }
        }
        if (arg1.field90 != -1 && arg1.field93 == 0) {
            class71 var6 = class71.field1727[arg1.field90];
            ++arg1.field92;
            while (arg1.field91 < var6.field1728 && arg1.field92 > var6.method598(arg1.field91, -818)) {
                arg1.field92 -= var6.method598(arg1.field91, -818);
                ++arg1.field91;
            }
            if (arg1.field91 >= var6.field1728) {
                arg1.field91 -= var6.field1732;
                ++arg1.field94;
                if (arg1.field94 >= var6.field1738) {
                    arg1.field90 = -1;
                }
                if (arg1.field91 < 0 || arg1.field91 >= var6.field1728) {
                    arg1.field90 = -1;
                }
            }
            arg1.field65 = var6.field1734;
        }
        if (arg1.field93 > 0) {
            --arg1.field93;
        }
    }

    @OriginalMember(owner = "client", name = "l", descriptor = "(Z)V")
    public final void method108(boolean arg0) {
        if (arg0) {
            this.field504 = null;
        }
        if (this.field584 != -1) {
            this.method166(this.field181, this.field584, (byte) -5);
            this.field181 = 0;
            this.method44(true);
            super.field906.method455(0);
            class4.field36 = this.field442;
            class62.method515((byte) 75);
            this.field379 = true;
            class30 var2 = class30.method316(this.field584);
            if (var2.field1004 == 512 && var2.field1028 == 334 && var2.field1005 == 0) {
                var2.field1004 = 765;
                var2.field1028 = 503;
            }
            this.method138(0, 0, 0, var2, 0);
            if (!this.field396) {
                this.method54(25993);
                this.method134(739);
            } else {
                this.method59(4);
            }
            super.field906.method456(0, 722, super.field905, 0);
        } else {
            if (this.field379) {
                this.method118(true);
                this.field379 = false;
                this.field136.method456(0, 722, super.field905, 4);
                this.field137.method456(0, 722, super.field905, 357);
                this.field138.method456(722, 722, super.field905, 4);
                this.field139.method456(743, 722, super.field905, 205);
                this.field140.method456(0, 722, super.field905, 0);
                this.field141.method456(516, 722, super.field905, 4);
                this.field142.method456(516, 722, super.field905, 205);
                this.field143.method456(496, 722, super.field905, 357);
                this.field144.method456(0, 722, super.field905, 338);
                this.field372 = true;
                this.field205 = true;
                this.field258 = true;
                this.field308 = true;
                if (this.field577 != 2) {
                    this.field390.method456(4, 722, super.field905, 4);
                    this.field389.method456(550, 722, super.field905, 4);
                }
            }
            if (this.field577 == 2) {
                this.method122(-23669);
            }
            if (this.field396 && this.field521 == 1) {
                this.field372 = true;
            }
            if (this.field342 != -1) {
                boolean var3 = this.method166(this.field181, this.field342, (byte) -5);
                if (var3) {
                    this.field372 = true;
                }
            }
            if (this.field515 == 2) {
                this.field372 = true;
            }
            if (this.field401 == 2) {
                this.field372 = true;
            }
            if (this.field372) {
                this.method51((byte) 3);
                this.field372 = false;
            }
            if (this.field585 == -1) {
                this.field464.field989 = this.field307 - this.field474 - 77;
                if (super.field913 > 448 && super.field913 < 560 && super.field914 > 332) {
                    this.method78(super.field913 - 17, 463, this.field307, super.field914 - 357, -1, false, 0, 77, this.field464);
                }
                int var4 = this.field307 - 77 - this.field464.field989;
                if (var4 < 0) {
                    var4 = 0;
                }
                if (var4 > this.field307 - 77) {
                    var4 = this.field307 - 77;
                }
                if (this.field474 != var4) {
                    this.field474 = var4;
                    this.field205 = true;
                }
            }
            if (this.field585 != -1) {
                boolean var5 = this.method166(this.field181, this.field585, (byte) -5);
                if (var5) {
                    this.field205 = true;
                }
            }
            if (this.field515 == 3) {
                this.field205 = true;
            }
            if (this.field401 == 3) {
                this.field205 = true;
            }
            if (this.field223 != null) {
                this.field205 = true;
            }
            if (this.field396 && this.field521 == 2) {
                this.field205 = true;
            }
            if (this.field205) {
                this.method60(this.field483);
                this.field205 = false;
            }
            if (this.field577 == 2) {
                this.method34((byte) 82);
                this.field389.method456(550, 722, super.field905, 4);
            }
            if (this.field567 != -1) {
                this.field258 = true;
            }
            if (this.field258) {
                if (this.field567 != -1 && this.field567 == this.field384) {
                    this.field567 = -1;
                    this.field213.method178(false, 64);
                    this.field213.method179(this.field384);
                }
                this.field258 = false;
                this.field217.method455(0);
                this.field320.method390((byte) 50, 0, 0);
                if (this.field342 == -1) {
                    if (this.field398[this.field384] != -1) {
                        if (this.field384 == 0) {
                            this.field531.method390((byte) 50, 22, 10);
                        }
                        if (this.field384 == 1) {
                            this.field532.method390((byte) 50, 54, 8);
                        }
                        if (this.field384 == 2) {
                            this.field532.method390((byte) 50, 82, 8);
                        }
                        if (this.field384 == 3) {
                            this.field533.method390((byte) 50, 110, 8);
                        }
                        if (this.field384 == 4) {
                            this.field535.method390((byte) 50, 153, 8);
                        }
                        if (this.field384 == 5) {
                            this.field535.method390((byte) 50, 181, 8);
                        }
                        if (this.field384 == 6) {
                            this.field534.method390((byte) 50, 209, 9);
                        }
                    }
                    if (this.field398[0] != -1 && (this.field567 != 0 || field438 % 20 < 10)) {
                        this.field210[0].method390((byte) 50, 29, 13);
                    }
                    if (this.field398[1] != -1 && (this.field567 != 1 || field438 % 20 < 10)) {
                        this.field210[1].method390((byte) 50, 53, 11);
                    }
                    if (this.field398[2] != -1 && (this.field567 != 2 || field438 % 20 < 10)) {
                        this.field210[2].method390((byte) 50, 82, 11);
                    }
                    if (this.field398[3] != -1 && (this.field567 != 3 || field438 % 20 < 10)) {
                        this.field210[3].method390((byte) 50, 115, 12);
                    }
                    if (this.field398[4] != -1 && (this.field567 != 4 || field438 % 20 < 10)) {
                        this.field210[4].method390((byte) 50, 153, 13);
                    }
                    if (this.field398[5] != -1 && (this.field567 != 5 || field438 % 20 < 10)) {
                        this.field210[5].method390((byte) 50, 180, 11);
                    }
                    if (this.field398[6] != -1 && (this.field567 != 6 || field438 % 20 < 10)) {
                        this.field210[6].method390((byte) 50, 208, 13);
                    }
                }
                this.field217.method456(516, 722, super.field905, 160);
                this.field216.method455(0);
                this.field319.method390((byte) 50, 0, 0);
                if (this.field342 == -1) {
                    if (this.field398[this.field384] != -1) {
                        if (this.field384 == 7) {
                            this.field413.method390((byte) 50, 42, 0);
                        }
                        if (this.field384 == 8) {
                            this.field414.method390((byte) 50, 74, 0);
                        }
                        if (this.field384 == 9) {
                            this.field414.method390((byte) 50, 102, 0);
                        }
                        if (this.field384 == 10) {
                            this.field415.method390((byte) 50, 130, 1);
                        }
                        if (this.field384 == 11) {
                            this.field417.method390((byte) 50, 173, 0);
                        }
                        if (this.field384 == 12) {
                            this.field417.method390((byte) 50, 201, 0);
                        }
                        if (this.field384 == 13) {
                            this.field416.method390((byte) 50, 229, 0);
                        }
                    }
                    if (this.field398[8] != -1 && (this.field567 != 8 || field438 % 20 < 10)) {
                        this.field210[7].method390((byte) 50, 74, 2);
                    }
                    if (this.field398[9] != -1 && (this.field567 != 9 || field438 % 20 < 10)) {
                        this.field210[8].method390((byte) 50, 102, 3);
                    }
                    if (this.field398[10] != -1 && (this.field567 != 10 || field438 % 20 < 10)) {
                        this.field210[9].method390((byte) 50, 137, 4);
                    }
                    if (this.field398[11] != -1 && (this.field567 != 11 || field438 % 20 < 10)) {
                        this.field210[10].method390((byte) 50, 174, 2);
                    }
                    if (this.field398[12] != -1 && (this.field567 != 12 || field438 % 20 < 10)) {
                        this.field210[11].method390((byte) 50, 201, 2);
                    }
                    if (this.field398[13] != -1 && (this.field567 != 13 || field438 % 20 < 10)) {
                        this.field210[12].method390((byte) 50, 226, 2);
                    }
                }
                this.field216.method456(496, 722, super.field905, 466);
                this.field390.method455(0);
                class4.field36 = this.field441;
            }
            if (this.field308) {
                this.field308 = false;
                this.field215.method455(0);
                this.field318.method390((byte) 50, 0, 0);
                this.field447.method231(27826, "Public chat", true, 28, 16777215, 55);
                if (this.field576 == 0) {
                    this.field447.method231(27826, "On", true, 41, 65280, 55);
                }
                if (this.field576 == 1) {
                    this.field447.method231(27826, "Friends", true, 41, 16776960, 55);
                }
                if (this.field576 == 2) {
                    this.field447.method231(27826, "Off", true, 41, 16711680, 55);
                }
                if (this.field576 == 3) {
                    this.field447.method231(27826, "Hide", true, 41, 65535, 55);
                }
                this.field447.method231(27826, "Private chat", true, 28, 16777215, 184);
                if (this.field373 == 0) {
                    this.field447.method231(27826, "On", true, 41, 65280, 184);
                }
                if (this.field373 == 1) {
                    this.field447.method231(27826, "Friends", true, 41, 16776960, 184);
                }
                if (this.field373 == 2) {
                    this.field447.method231(27826, "Off", true, 41, 16711680, 184);
                }
                this.field447.method231(27826, "Trade/compete", true, 28, 16777215, 324);
                if (this.field453 == 0) {
                    this.field447.method231(27826, "On", true, 41, 65280, 324);
                }
                if (this.field453 == 1) {
                    this.field447.method231(27826, "Friends", true, 41, 16776960, 324);
                }
                if (this.field453 == 2) {
                    this.field447.method231(27826, "Off", true, 41, 16711680, 324);
                }
                this.field447.method231(27826, "Report abuse", true, 33, 16777215, 458);
                this.field215.method456(0, 722, super.field905, 453);
                this.field390.method455(0);
                class4.field36 = this.field441;
            }
            this.field181 = 0;
        }
    }

    @OriginalMember(owner = "client", name = "r", descriptor = "(I)V")
    public final void method109(int arg0) {
        if (this.field352 != 0) {
            class13 var2 = this.field447;
            int var3 = 0;
            if (this.field404 != 0) {
                var3 = 1;
            }
            for (int var4 = 0; var4 < 100; ++var4) {
                if (this.field357[var4] != null) {
                    int var6 = this.field355[var4];
                    String var7 = this.field356[var4];
                    byte var8 = 0;
                    if (var7 != null && var7.startsWith("@cr1@")) {
                        var7 = var7.substring(5);
                        var8 = 1;
                    }
                    if (var7 != null && var7.startsWith("@cr2@")) {
                        var7 = var7.substring(5);
                        var8 = 2;
                    }
                    if ((var6 == 3 || var6 == 7) && (var6 == 7 || this.field373 == 0 || this.field373 == 1 && this.method99(var7, (byte) 4))) {
                        int var9 = 329 - var3 * 13;
                        byte var10 = 4;
                        var2.method234(var10, "From", 0, 988, var9);
                        var2.method234(var10, "From", 65535, 988, var9 - 1);
                        int var11 = var10 + var2.method232("From ", 410);
                        if (var8 == 1) {
                            this.field315[0].method390((byte) 50, var11, var9 - 12);
                            var11 += 14;
                        }
                        if (var8 == 2) {
                            this.field315[1].method390((byte) 50, var11, var9 - 12);
                            var11 += 14;
                        }
                        var2.method234(var11, var7 + ": " + this.field357[var4], 0, 988, var9);
                        var2.method234(var11, var7 + ": " + this.field357[var4], 65535, 988, var9 - 1);
                        ++var3;
                        if (var3 >= 5) {
                            return;
                        }
                    }
                    if (var6 == 5 && this.field373 < 2) {
                        int var12 = 329 - var3 * 13;
                        var2.method234(4, this.field357[var4], 0, 988, var12);
                        var2.method234(4, this.field357[var4], 65535, 988, var12 - 1);
                        ++var3;
                        if (var3 >= 5) {
                            return;
                        }
                    }
                    if (var6 == 6 && this.field373 < 2) {
                        int var13 = 329 - var3 * 13;
                        var2.method234(4, "To " + var7 + ": " + this.field357[var4], 0, 988, var13);
                        var2.method234(4, "To " + var7 + ": " + this.field357[var4], 65535, 988, var13 - 1);
                        ++var3;
                        if (var3 >= 5) {
                            return;
                        }
                    }
                }
            }
            int var5 = 46 / arg0;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILDNRIFKTO;I)V")
    private final void method110(int arg0, class11 arg1, int arg2) {
        this.field458 = 0;
        this.field560 = 0;
        this.method26(true, arg0, arg1);
        if (arg2 < 0) {
            this.method140(arg0, 5, arg1);
            this.method33(arg1, arg0, 687);
            this.method96(arg0, arg1, (byte) 6);
            for (int var4 = 0; var4 < this.field458; ++var4) {
                int var6 = this.field459[var4];
                if (field438 != this.field557[var6].field71) {
                    this.field557[var6] = null;
                }
            }
            if (arg1.field643 != arg0) {
                signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg1.field643 + " psize:" + arg0);
                throw new RuntimeException("eek");
            } else {
                for (int var5 = 0; var5 < this.field558; ++var5) {
                    if (this.field557[this.field559[var5]] == null) {
                        signlink.reporterror(this.field294 + " null entry in pl list - pos:" + var5 + " size:" + this.field558);
                        throw new RuntimeException("eek");
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIII)V")
    public final void method111(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        while (arg1 >= 0) {
            this.field275 = -58;
        }
        this.field365.method390((byte) 50, arg5, arg3);
        this.field366.method390((byte) 50, arg5, arg3 + arg4 - 16);
        class62.method517(arg4 - 32, this.field235, arg5, 16, this.field597, arg3 + 16);
        int var7 = (arg4 - 32) * arg4 / arg0;
        if (var7 < 8) {
            var7 = 8;
        }
        int var8 = (arg4 - 32 - var7) * arg2 / (arg0 - arg4);
        class62.method517(var7, this.field362, arg5, 16, this.field597, arg3 + 16 + var8);
        class62.method522(this.field411, arg5, var7, arg3 + 16 + var8, true);
        class62.method522(this.field411, arg5 + 1, var7, arg3 + 16 + var8, true);
        class62.method520(arg3 + 16 + var8, 16, arg5, this.field411, this.field289);
        class62.method520(arg3 + 17 + var8, 16, arg5, this.field411, this.field289);
        class62.method522(this.field407, arg5 + 15, var7, arg3 + 16 + var8, true);
        class62.method522(this.field407, arg5 + 14, var7 - 1, arg3 + 17 + var8, true);
        class62.method520(arg3 + 15 + var8 + var7, 16, arg5, this.field407, this.field289);
        class62.method520(arg3 + 14 + var8 + var7, 15, arg5 + 1, this.field407, this.field289);
    }

    @OriginalMember(owner = "client", name = "o", descriptor = "(B)Z")
    public final boolean method112(byte arg0) {
        if (arg0 == 2) {
            boolean var2 = false;
        } else {
            this.field456 = this.field460.method256();
        }
        return signlink.wavereplay();
    }

    @OriginalMember(owner = "client", name = "s", descriptor = "(I)V")
    public final void method113(int arg0) {
        this.field149 += arg0;
        this.field259 = 0;
        int var2 = (field276.field102 >> 7) + this.field322;
        int var3 = (field276.field103 >> 7) + this.field323;
        if (var2 >= 3053 && var2 <= 3156 && var3 >= 3056 && var3 <= 3136) {
            this.field259 = 1;
        }
        if (var2 >= 3072 && var2 <= 3118 && var3 >= 9492 && var3 <= 9535) {
            this.field259 = 1;
        }
        if (this.field259 == 1 && var2 >= 3139 && var2 <= 3199 && var3 >= 3008 && var3 <= 3062) {
            this.field259 = 0;
        }
    }

    @OriginalMember(owner = "client", name = "t", descriptor = "(I)V")
    public final void method114(int arg0) {
        if (arg0 < 5 || arg0 > 5) {
            this.field213.method179(27);
        }
        for (class48 var2 = (class48) this.field282.method592(); var2 != null; var2 = (class48) this.field282.method594(-314)) {
            if (this.field326 == var2.field1281 && !var2.field1276) {
                if (field438 >= var2.field1278) {
                    var2.method392(this.field181, false);
                    if (var2.field1276) {
                        var2.method1();
                    } else {
                        this.field121.method549(-1, var2, var2.field1283, 0, var2.field1284, 832, 60, var2.field1282, false, var2.field1281);
                    }
                }
            } else {
                var2.method1();
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "([BII)Z")
    public final boolean method115(byte[] arg0, int arg1, int arg2) {
        if (this.field506 != arg1) {
            this.field504 = null;
        }
        return arg0 == null ? true : signlink.wavesave(arg0, arg2);
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILHEKJNUPL;IIB)V")
    public final void method116(int arg0, class20 arg1, int arg2, int arg3, byte arg4) {
        if (arg4 == 72) {
            if (this.field601 < 400) {
                if (arg1.field733 != null) {
                    arg1 = arg1.method272(-362);
                }
                if (arg1 != null) {
                    if (arg1.field762) {
                        String var6 = arg1.field753;
                        if (arg1.field759 != 0) {
                            var6 = var6 + method148(field276.field800, arg1.field759, 3) + " (level-" + arg1.field759 + ")";
                        }
                        if (this.field495 == 1) {
                            this.field314[this.field601] = "Use " + this.field499 + " with @yel@" + var6;
                            this.field429[this.field601] = 850;
                            this.field430[this.field601] = arg2;
                            this.field427[this.field601] = arg0;
                            this.field428[this.field601] = arg3;
                            ++this.field601;
                        } else {
                            if (this.field183 == 1) {
                                if ((this.field185 & 2) == 2) {
                                    this.field314[this.field601] = this.field186 + " @yel@" + var6;
                                    this.field429[this.field601] = 283;
                                    this.field430[this.field601] = arg2;
                                    this.field427[this.field601] = arg0;
                                    this.field428[this.field601] = arg3;
                                    ++this.field601;
                                    return;
                                }
                            } else {
                                if (arg1.field737 != null) {
                                    for (int var7 = 4; var7 >= 0; --var7) {
                                        if (arg1.field737[var7] != null && !arg1.field737[var7].equalsIgnoreCase("attack")) {
                                            this.field314[this.field601] = arg1.field737[var7] + " @yel@" + var6;
                                            if (var7 == 0) {
                                                this.field429[this.field601] = 111;
                                            }
                                            if (var7 == 1) {
                                                this.field429[this.field601] = 269;
                                            }
                                            if (var7 == 2) {
                                                this.field429[this.field601] = 625;
                                            }
                                            if (var7 == 3) {
                                                this.field429[this.field601] = 988;
                                            }
                                            if (var7 == 4) {
                                                this.field429[this.field601] = 359;
                                            }
                                            this.field430[this.field601] = arg2;
                                            this.field427[this.field601] = arg0;
                                            this.field428[this.field601] = arg3;
                                            ++this.field601;
                                        }
                                    }
                                }
                                if (arg1.field737 != null) {
                                    for (int var8 = 4; var8 >= 0; --var8) {
                                        if (arg1.field737[var8] != null && arg1.field737[var8].equalsIgnoreCase("attack")) {
                                            short var9 = 0;
                                            if (arg1.field759 > field276.field800) {
                                                var9 = 2000;
                                            }
                                            this.field314[this.field601] = arg1.field737[var8] + " @yel@" + var6;
                                            if (var8 == 0) {
                                                this.field429[this.field601] = var9 + 111;
                                            }
                                            if (var8 == 1) {
                                                this.field429[this.field601] = var9 + 269;
                                            }
                                            if (var8 == 2) {
                                                this.field429[this.field601] = var9 + 625;
                                            }
                                            if (var8 == 3) {
                                                this.field429[this.field601] = var9 + 988;
                                            }
                                            if (var8 == 4) {
                                                this.field429[this.field601] = var9 + 359;
                                            }
                                            this.field430[this.field601] = arg2;
                                            this.field427[this.field601] = arg0;
                                            this.field428[this.field601] = arg3;
                                            ++this.field601;
                                        }
                                    }
                                }
                                this.field314[this.field601] = "Examine @yel@" + var6;
                                this.field429[this.field601] = 1860;
                                this.field430[this.field601] = arg2;
                                this.field427[this.field601] = arg0;
                                this.field428[this.field601] = arg3;
                                ++this.field601;
                            }
                        }
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
                if (super.field908 != null) {
                    return new URL("http://127.0.0.1:" + (field284 + 80));
                }
            } catch (Exception var1) {
            }
            return super.getCodeBase();
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIIII)V")
    public final void method117(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = 2048 - arg6 & 2047;
        int var9 = 2048 - arg2 & 2047;
        int var10 = 0;
        int var11 = 0;
        int var12 = arg5;
        if (var8 != 0) {
            int var13 = class55.field1401[var8];
            int var14 = class55.field1402[var8];
            int var15 = var11 * var14 - arg5 * var13 >> 16;
            var12 = var11 * var13 + arg5 * var14 >> 16;
            var11 = var15;
        }
        if (var9 != 0) {
            int var16 = class55.field1401[var9];
            int var17 = class55.field1402[var9];
            int var18 = var10 * var17 + var12 * var16 >> 16;
            var12 = var12 * var17 - var10 * var16 >> 16;
            var10 = var18;
        }
        this.field346 = arg3 - var10;
        this.field347 = arg0 - var11;
        if (this.field279 != arg1) {
            this.field279 = 276;
        }
        this.field348 = arg4 - var12;
        this.field349 = arg6;
        this.field350 = arg2;
    }

    @OriginalMember(owner = "client", name = "m", descriptor = "(Z)V")
    public final void method118(boolean arg0) {
        if (this.field391 == null) {
            this.method165(0);
            super.field906 = null;
            this.field240 = null;
            this.field241 = null;
            this.field242 = null;
            this.field243 = null;
            this.field244 = null;
            this.field245 = null;
            this.field246 = null;
            this.field247 = null;
            this.field248 = null;
            this.field391 = new class57(479, true, this.method73((byte) 0), 96);
            this.field389 = new class57(172, true, this.method73((byte) 0), 156);
            class62.method515((byte) 75);
            this.field237.method390((byte) 50, 0, 0);
            this.field388 = new class57(190, true, this.method73((byte) 0), 261);
            this.field390 = new class57(512, true, this.method73((byte) 0), 334);
            class62.method515((byte) 75);
            this.field528 &= arg0;
            this.field215 = new class57(496, true, this.method73((byte) 0), 50);
            this.field216 = new class57(269, true, this.method73((byte) 0), 37);
            this.field217 = new class57(249, true, this.method73((byte) 0), 45);
            this.field379 = true;
            this.field390.method455(0);
            class4.field36 = this.field441;
        }
    }

    @OriginalMember(owner = "client", name = "u", descriptor = "(I)V")
    public final void method119(int arg0) {
        if (this.field404 > 1) {
            --this.field404;
        }
        if (this.field153 > 0) {
            --this.field153;
        }
        for (int var2 = 0; var2 < 5 && this.method66(208); ++var2) {
        }
        if (this.field528) {
            Object var3 = this.field214.field606;
            synchronized (this.field214.field606) {
                if (!field263) {
                    this.field214.field603 = 0;
                } else if (super.field919 != 0 || this.field214.field603 >= 40) {
                    this.field213.method178(false, 147);
                    this.field213.method179(0);
                    int var4 = this.field213.field643;
                    int var5 = 0;
                    for (int var6 = 0; var6 < this.field214.field603 && var4 - this.field213.field643 < 240; ++var6) {
                        ++var5;
                        int var7 = this.field214.field608[var6];
                        if (var7 < 0) {
                            var7 = 0;
                        } else if (var7 > 502) {
                            var7 = 502;
                        }
                        int var8 = this.field214.field607[var6];
                        if (var8 < 0) {
                            var8 = 0;
                        } else if (var8 > 764) {
                            var8 = 764;
                        }
                        int var9 = var7 * 765 + var8;
                        if (this.field214.field608[var6] == -1 && this.field214.field607[var6] == -1) {
                            var8 = -1;
                            var7 = -1;
                            var9 = 524287;
                        }
                        if (this.field189 == var8 && this.field190 == var7) {
                            if (this.field239 < 2047) {
                                ++this.field239;
                            }
                        } else {
                            int var10 = var8 - this.field189;
                            this.field189 = var8;
                            int var11 = var7 - this.field190;
                            this.field190 = var7;
                            if (this.field239 < 8 && var10 >= -32 && var10 <= 31 && var11 >= -32 && var11 <= 31) {
                                var10 += 32;
                                var11 += 32;
                                this.field213.method180((this.field239 << 12) + (var10 << 6) + var11);
                                this.field239 = 0;
                            } else if (this.field239 < 8) {
                                this.field213.method182((this.field239 << 19) + 8388608 + var9);
                                this.field239 = 0;
                            } else {
                                this.field213.method183((this.field239 << 19) + -1073741824 + var9);
                                this.field239 = 0;
                            }
                        }
                    }
                    this.field213.method188(this.field213.field643 - var4, -122);
                    if (var5 >= this.field214.field603) {
                        this.field214.field603 = 0;
                    } else {
                        this.field214.field603 -= var5;
                        for (int var12 = 0; var12 < this.field214.field603; ++var12) {
                            this.field214.field607[var12] = this.field214.field607[var5 + var12];
                            this.field214.field608[var12] = this.field214.field608[var5 + var12];
                        }
                    }
                }
            }
            if (super.field919 != 0) {
                long var13 = (super.field922 - this.field434) / 50L;
                if (var13 > 4095L) {
                    var13 = 4095L;
                }
                this.field434 = super.field922;
                int var15 = super.field921;
                if (var15 < 0) {
                    var15 = 0;
                } else if (var15 > 502) {
                    var15 = 502;
                }
                int var16 = super.field920;
                if (var16 < 0) {
                    var16 = 0;
                } else if (var16 > 764) {
                    var16 = 764;
                }
                int var17 = var15 * 765 + var16;
                byte var18 = 0;
                if (super.field919 == 2) {
                    var18 = 1;
                }
                int var19 = (int) var13;
                this.field213.method178(false, 144);
                this.field213.method221((var18 << 19) + (var19 << 20) + var17, 0);
            }
            if (this.field478 > 0) {
                --this.field478;
            }
            if (super.field923[1] == 1 || super.field923[2] == 1 || super.field923[3] == 1 || super.field923[4] == 1) {
                this.field479 = true;
            }
            if (this.field479 && this.field478 <= 0) {
                this.field478 = 20;
                this.field479 = false;
                this.field213.method178(false, 232);
                this.field213.method212((byte) 5, this.field207);
                this.field213.method211(35516, this.field206);
            }
            if (super.field910 && !this.field225) {
                this.field225 = true;
                this.field213.method178(false, 199);
                this.field213.method179(1);
            }
            if (!super.field910 && this.field225) {
                this.field225 = false;
                this.field213.method178(false, 199);
                this.field213.method179(0);
            }
            this.method36(true);
            this.method147((byte) 72);
            this.method100(-17887);
            ++field387;
            if (field387 > 110) {
                field387 = 0;
                this.field213.method178(false, 140);
                this.field213.method180(46885);
            }
            ++this.field151;
            if (this.field151 > 750) {
                this.method132(43947);
            }
            this.method43(-242);
            this.method101(true);
            this.method82(0);
            ++this.field181;
            if (this.field130 != 0) {
                this.field129 += 20;
                if (this.field129 >= 400) {
                    this.field130 = 0;
                }
            }
            if (this.field515 != 0) {
                ++this.field512;
                if (this.field512 >= 15) {
                    if (this.field515 == 2) {
                        this.field372 = true;
                    }
                    if (this.field515 == 3) {
                        this.field205 = true;
                    }
                    this.field515 = 0;
                }
            }
            if (this.field401 != 0) {
                ++this.field265;
                if (super.field913 > this.field402 + 5 || super.field913 < this.field402 - 5 || super.field914 > this.field403 + 5 || super.field914 < this.field403 - 5) {
                    this.field371 = true;
                }
                if (super.field912 == 0) {
                    if (this.field401 == 2) {
                        this.field372 = true;
                    }
                    if (this.field401 == 3) {
                        this.field205 = true;
                    }
                    this.field401 = 0;
                    if (this.field371 && this.field265 >= 5) {
                        this.field469 = -1;
                        this.method54(25993);
                        if (this.field469 == this.field399 && this.field468 != this.field400) {
                            class30 var20 = class30.method316(this.field399);
                            byte var21 = 0;
                            if (this.field599 == 1 && var20.field963 == 206) {
                                var21 = 1;
                            }
                            if (var20.field956[this.field468] <= 0) {
                                var21 = 0;
                            }
                            if (var20.field1018) {
                                int var22 = this.field400;
                                int var23 = this.field468;
                                var20.field956[var23] = var20.field956[var22];
                                var20.field1032[var23] = var20.field1032[var22];
                                var20.field956[var22] = -1;
                                var20.field1032[var22] = 0;
                            } else if (var21 == 1) {
                                int var24 = this.field400;
                                int var25 = this.field468;
                                while (var24 != var25) {
                                    if (var24 > var25) {
                                        var20.method317(2, var24 - 1, var24);
                                        --var24;
                                    } else if (var24 < var25) {
                                        var20.method317(2, var24 + 1, var24);
                                        ++var24;
                                    }
                                }
                            } else {
                                var20.method317(2, this.field468, this.field400);
                            }
                            this.field213.method178(false, 205);
                            this.field213.method211(35516, this.field399);
                            this.field213.method179(var21);
                            this.field213.method180(this.field400);
                            this.field213.method180(this.field468);
                        }
                    } else if ((this.field329 == 1 || this.method131((byte) 9, this.field601 - 1)) && this.field601 > 2) {
                        this.method31(this.field211);
                    } else if (this.field601 > 0) {
                        this.method39(false, this.field601 - 1);
                    }
                    this.field512 = 10;
                    super.field919 = 0;
                }
            }
            if (class68.field1687 != -1) {
                int var26 = class68.field1687;
                int var27 = class68.field1688;
                boolean var28 = this.method46(field276.field89[0], 0, true, var26, 0, var27, 0, 0, -36, 0, field276.field88[0], 0);
                class68.field1687 = -1;
                if (var28) {
                    this.field127 = super.field920;
                    this.field128 = super.field921;
                    this.field130 = 1;
                    this.field129 = 0;
                }
            }
            if (super.field919 == 1 && this.field223 != null) {
                this.field223 = null;
                this.field205 = true;
                super.field919 = 0;
            }
            this.method141(false);
            if (this.field584 == -1) {
                this.method160(45696);
                this.method90(-30892);
                this.method144((byte) 6);
            }
            if (super.field912 == 1 || super.field919 == 1) {
                ++this.field159;
            }
            if (this.field577 == 2) {
                this.method150((byte) 4);
            }
            if (this.field577 == 2 && this.field600) {
                this.method50(-919);
            }
            for (int var29 = 0; var29 < 5; ++var29) {
                int var10002 = this.field553[var29]++;
            }
            this.method146((byte) 4);
            ++super.field911;
            if (super.field911 > 4500) {
                this.field153 = 250;
                super.field911 -= 500;
                this.field213.method178(false, 136);
            }
            ++this.field472;
            if (this.field472 > 500) {
                this.field472 = 0;
                int var30 = (int) (Math.random() * 8.0D);
                if ((var30 & 1) == 1) {
                    this.field280 += this.field281;
                }
                if ((var30 & 2) == 2) {
                    this.field165 += this.field166;
                }
                if ((var30 & 4) == 4) {
                    this.field333 += this.field334;
                }
            }
            if (this.field280 < -50) {
                this.field281 = 2;
            }
            if (this.field280 > 50) {
                this.field281 = -2;
            }
            if (this.field165 < -55) {
                this.field166 = 2;
            }
            if (this.field165 > 55) {
                this.field166 = -2;
            }
            if (this.field333 < -40) {
                this.field334 = 1;
            }
            if (this.field333 > 40) {
                this.field334 = -1;
            }
            ++this.field378;
            if (this.field378 > 500) {
                this.field378 = 0;
                int var31 = (int) (Math.random() * 8.0D);
                if ((var31 & 1) == 1) {
                    this.field465 += this.field466;
                }
                if ((var31 & 2) == 2) {
                    this.field547 += this.field548;
                }
            }
            if (this.field465 < -60) {
                this.field466 = 2;
            }
            if (this.field465 > 60) {
                this.field466 = -2;
            }
            if (this.field547 < -20) {
                this.field548 = 1;
            }
            if (this.field547 > 10) {
                this.field548 = -1;
            }
            ++this.field152;
            if (arg0 <= 0) {
                this.field450 = !this.field450;
            }
            if (this.field152 > 50) {
                this.field213.method178(false, 231);
            }
            try {
                if (this.field321 != null && this.field213.field643 > 0) {
                    this.field321.method382((byte) 55, this.field213.field642, 0, this.field213.field643);
                    this.field213.field643 = 0;
                    this.field152 = 0;
                }
            } catch (IOException var33) {
                this.method132(43947);
            } catch (Exception var34) {
                this.method45((byte) -87);
            }
        }
    }

    @OriginalMember(owner = "client", name = "v", descriptor = "(I)V")
    public final void method120(int arg0) {
        this.field109 = 0;
        for (int var2 = -1; var2 < this.field558 + this.field305; ++var2) {
            class5 var19;
            if (var2 == -1) {
                var19 = field276;
            } else if (var2 < this.field558) {
                var19 = this.field557[this.field559[var2]];
            } else {
                var19 = this.field304[this.field306[var2 - this.field558]];
            }
            if (var19 != null && var19.method20(false)) {
                if (var19 instanceof class10) {
                    class20 var20 = ((class10) var19).field626;
                    if (var20.field733 != null) {
                        var20 = var20.method272(-362);
                    }
                    if (var20 == null) {
                        continue;
                    }
                }
                if (var2 >= this.field558) {
                    class20 var23 = ((class10) var19).field626;
                    if (var23.field766 >= 0 && var23.field766 < this.field385.length) {
                        this.method123(var19, false, var19.field84 + 15);
                        if (this.field196 > -1) {
                            this.field385[var23.field766].method529((byte) 50, this.field196 - 12, this.field197 - 30);
                        }
                    }
                    if (this.field359 == 1 && this.field306[var2 - this.field558] == this.field193 && field438 % 20 < 10) {
                        this.method123(var19, false, var19.field84 + 15);
                        if (this.field196 > -1) {
                            this.field148[0].method529((byte) 50, this.field196 - 12, this.field197 - 28);
                        }
                    }
                } else {
                    int var21 = 30;
                    class21 var22 = (class21) var19;
                    if (var22.field787 != -1 || var22.field780 != -1) {
                        this.method123(var19, false, var19.field84 + 15);
                        if (this.field196 > -1) {
                            if (var22.field787 != -1) {
                                this.field163[var22.field787].method529((byte) 50, this.field196 - 12, this.field197 - var21);
                                var21 += 25;
                            }
                            if (var22.field780 != -1) {
                                this.field385[var22.field780].method529((byte) 50, this.field196 - 12, this.field197 - var21);
                                var21 += 25;
                            }
                        }
                    }
                    if (var2 >= 0 && this.field359 == 10 && this.field559[var2] == this.field220) {
                        this.method123(var19, false, var19.field84 + 15);
                        if (this.field196 > -1) {
                            this.field148[1].method529((byte) 50, this.field196 - 12, this.field197 - var21);
                        }
                    }
                }
                if (var19.field99 != null && (var2 >= this.field558 || this.field576 == 0 || this.field576 == 3 || this.field576 == 1 && this.method99(((class21) var19).field805, (byte) 4))) {
                    this.method123(var19, false, var19.field84);
                    if (this.field196 > -1 && this.field109 < this.field110) {
                        this.field114[this.field109] = this.field448.method233(-267, var19.field99) / 2;
                        this.field113[this.field109] = this.field448.field671;
                        this.field111[this.field109] = this.field196;
                        this.field112[this.field109] = this.field197;
                        this.field115[this.field109] = var19.field64;
                        this.field116[this.field109] = var19.field70;
                        this.field117[this.field109] = var19.field72;
                        this.field118[this.field109++] = var19.field99;
                        if (this.field335 == 0 && var19.field70 >= 1 && var19.field70 <= 3) {
                            this.field113[this.field109] += 10;
                            this.field112[this.field109] += 5;
                        }
                        if (this.field335 == 0 && var19.field70 == 4) {
                            this.field114[this.field109] = 60;
                        }
                        if (this.field335 == 0 && var19.field70 == 5) {
                            this.field113[this.field109] += 5;
                        }
                    }
                }
                if (var19.field52 > field438) {
                    this.method123(var19, false, var19.field84 + 15);
                    if (this.field196 > -1) {
                        int var24 = var19.field53 * 30 / var19.field54;
                        if (var24 > 30) {
                            var24 = 30;
                        }
                        class62.method517(5, 65280, this.field196 - 15, var24, this.field597, this.field197 - 3);
                        class62.method517(5, 16711680, this.field196 - 15 + var24, 30 - var24, this.field597, this.field197 - 3);
                    }
                }
                for (int var25 = 0; var25 < 4; ++var25) {
                    if (var19.field98[var25] > field438) {
                        this.method123(var19, false, var19.field84 / 2);
                        if (this.field196 > -1) {
                            if (var25 == 1) {
                                this.field197 -= 20;
                            }
                            if (var25 == 2) {
                                this.field196 -= 15;
                                this.field197 -= 10;
                            }
                            if (var25 == 3) {
                                this.field196 += 15;
                                this.field197 -= 10;
                            }
                            this.field596[var19.field97[var25]].method529((byte) 50, this.field196 - 12, this.field197 - 12);
                            this.field446.method230(0, this.field196, String.valueOf(var19.field96[var25]), (byte) -90, this.field197 + 4);
                            this.field446.method230(16777215, this.field196 - 1, String.valueOf(var19.field96[var25]), (byte) -90, this.field197 + 3);
                        }
                    }
                }
            }
        }
        if (this.field212 != arg0) {
            this.field504 = null;
        }
        for (int var3 = 0; var3 < this.field109; ++var3) {
            int var4 = this.field111[var3];
            int var5 = this.field112[var3];
            int var6 = this.field114[var3];
            int var7 = this.field113[var3];
            boolean var8 = true;
            while (var8) {
                var8 = false;
                for (int var18 = 0; var18 < var3; ++var18) {
                    if (var5 + 2 > this.field112[var18] - this.field113[var18] && var5 - var7 < this.field112[var18] + 2 && var4 - var6 < this.field114[var18] + this.field111[var18] && var4 + var6 > this.field111[var18] - this.field114[var18] && this.field112[var18] - this.field113[var18] < var5) {
                        var5 = this.field112[var18] - this.field113[var18];
                        var8 = true;
                    }
                }
            }
            this.field196 = this.field111[var3];
            this.field197 = this.field112[var3] = var5;
            String var9 = this.field118[var3];
            if (this.field335 == 0) {
                int var10 = 16776960;
                if (this.field115[var3] < 6) {
                    var10 = this.field219[this.field115[var3]];
                }
                if (this.field115[var3] == 6) {
                    var10 = this.field410 % 20 < 10 ? 16711680 : 16776960;
                }
                if (this.field115[var3] == 7) {
                    var10 = this.field410 % 20 < 10 ? 255 : 65535;
                }
                if (this.field115[var3] == 8) {
                    var10 = this.field410 % 20 < 10 ? 45056 : 8454016;
                }
                if (this.field115[var3] == 9) {
                    int var11 = 150 - this.field117[var3];
                    if (var11 < 50) {
                        var10 = var11 * 1280 + 16711680;
                    } else if (var11 < 100) {
                        var10 = 16776960 - (var11 - 50) * 327680;
                    } else if (var11 < 150) {
                        var10 = (var11 - 100) * 5 + 65280;
                    }
                }
                if (this.field115[var3] == 10) {
                    int var12 = 150 - this.field117[var3];
                    if (var12 < 50) {
                        var10 = var12 * 5 + 16711680;
                    } else if (var12 < 100) {
                        var10 = 16711935 - (var12 - 50) * 327680;
                    } else if (var12 < 150) {
                        var10 = (var12 - 100) * 327680 + 255 - (var12 - 100) * 5;
                    }
                }
                if (this.field115[var3] == 11) {
                    int var13 = 150 - this.field117[var3];
                    if (var13 < 50) {
                        var10 = 16777215 - var13 * 327685;
                    } else if (var13 < 100) {
                        var10 = (var13 - 50) * 327685 + 65280;
                    } else if (var13 < 150) {
                        var10 = 16777215 - (var13 - 100) * 327680;
                    }
                }
                if (this.field116[var3] == 0) {
                    this.field448.method230(0, this.field196, var9, (byte) -90, this.field197 + 1);
                    this.field448.method230(var10, this.field196, var9, (byte) -90, this.field197);
                }
                if (this.field116[var3] == 1) {
                    this.field448.method235(0, var9, this.field197 + 1, this.field196, this.field410, 0);
                    this.field448.method235(var10, var9, this.field197, this.field196, this.field410, 0);
                }
                if (this.field116[var3] == 2) {
                    this.field448.method236(this.field197 + 1, this.field204, var9, this.field196, this.field410, 0);
                    this.field448.method236(this.field197, this.field204, var9, this.field196, this.field410, var10);
                }
                if (this.field116[var3] == 3) {
                    this.field448.method237(6, this.field197 + 1, this.field196, 0, 150 - this.field117[var3], var9, this.field410);
                    this.field448.method237(6, this.field197, this.field196, var10, 150 - this.field117[var3], var9, this.field410);
                }
                if (this.field116[var3] == 4) {
                    int var14 = this.field448.method233(-267, var9);
                    int var15 = (150 - this.field117[var3]) * (var14 + 100) / 150;
                    class62.method514(this.field196 - 50, 0, 334, this.field196 + 50, 0);
                    this.field448.method234(this.field196 + 50 - var15, var9, 0, 988, this.field197 + 1);
                    this.field448.method234(this.field196 + 50 - var15, var9, var10, 988, this.field197);
                    class62.method513(-30460);
                }
                if (this.field116[var3] == 5) {
                    int var16 = 150 - this.field117[var3];
                    int var17 = 0;
                    if (var16 < 25) {
                        var17 = var16 - 25;
                    } else if (var16 > 125) {
                        var17 = var16 - 125;
                    }
                    class62.method514(0, this.field197 - this.field448.field671 - 1, this.field197 + 5, 512, 0);
                    this.field448.method230(0, this.field196, var9, (byte) -90, this.field197 + 1 + var17);
                    this.field448.method230(var10, this.field196, var9, (byte) -90, this.field197 + var17);
                    class62.method513(-30460);
                }
            } else {
                this.field448.method230(0, this.field196, var9, (byte) -90, this.field197 + 1);
                this.field448.method230(16776960, this.field196, var9, (byte) -90, this.field197);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(JI)V")
    public final void method121(long arg0, int arg1) {
        if (arg0 != 0L) {
            if (this.field120 >= 100) {
                this.method136((byte) 3, 0, "Your ignore list is full. Max of 100 hit", "");
            } else {
                String var4 = class25.method282(49845, class25.method279(this.field463, arg0));
                for (int var5 = 0; var5 < this.field120; ++var5) {
                    if (this.field367[var5] == arg0) {
                        this.method136((byte) 3, 0, var4 + " is already on your ignore list", "");
                        return;
                    }
                }
                if (arg1 != 9) {
                    this.method93();
                }
                for (int var6 = 0; var6 < this.field298; ++var6) {
                    if (this.field311[var6] == arg0) {
                        this.method136((byte) 3, 0, "Please remove " + var4 + " from your friend list first", "");
                        return;
                    }
                }
                this.field367[this.field120++] = arg0;
                this.field372 = true;
                this.field213.method178(false, 85);
                this.field213.method185((byte) 35, arg0);
            }
        }
    }

    @OriginalMember(owner = "client", name = "w", descriptor = "(I)V")
    public final void method122(int arg0) {
        ++this.field410;
        this.method75(true, 305);
        this.method48(496, true);
        this.method75(false, 305);
        this.method48(496, false);
        this.method65(0);
        this.method114(5);
        if (!this.field600) {
            int var2 = this.field206;
            if (this.field233 / 256 > var2) {
                var2 = this.field233 / 256;
            }
            if (this.field167[4] && this.field198[4] + 128 > var2) {
                var2 = this.field198[4] + 128;
            }
            int var3 = this.field333 + this.field207 & 2047;
            this.method117(this.method83(this.field326, true, field276.field102, field276.field103) - 50, 29388, var3, this.field476, this.field477, var2 * 3 + 600, var2);
        }
        int var4;
        if (!this.field600) {
            var4 = this.method153(17835);
        } else {
            var4 = this.method154((byte) 46);
        }
        int var5 = this.field346;
        int var6 = this.field347;
        int var7 = this.field348;
        int var8 = this.field349;
        int var9 = this.field350;
        for (int var10 = 0; var10 < 5; ++var10) {
            if (this.field167[var10]) {
                int var12 = (int) (Math.random() * (double) (this.field312[var10] * 2 + 1) - (double) this.field312[var10] + Math.sin((double) this.field192[var10] / 100.0D * (double) this.field553[var10]) * (double) this.field198[var10]);
                if (var10 == 0) {
                    this.field346 += var12;
                }
                if (var10 == 1) {
                    this.field347 += var12;
                }
                if (var10 == 2) {
                    this.field348 += var12;
                }
                if (var10 == 3) {
                    this.field350 = this.field350 + var12 & 2047;
                }
                if (var10 == 4) {
                    this.field349 += var12;
                    if (this.field349 < 128) {
                        this.field349 = 128;
                    }
                    if (this.field349 > 383) {
                        this.field349 = 383;
                    }
                }
            }
        }
        int var11 = class4.field45;
        class55.field1396 = true;
        class55.field1399 = 0;
        class55.field1397 = super.field913 - 4;
        class55.field1398 = super.field914 - 4;
        class62.method515((byte) 75);
        if (arg0 != -23669) {
            this.field504 = null;
        }
        this.field121.method577(this.field347, this.field346, this.field349, 0, var4, this.field348, this.field350);
        this.field121.method552(0);
        this.method120(field177);
        this.method137(false);
        this.method42(false, var11);
        this.method71(23067);
        this.field390.method456(4, 722, super.field905, 4);
        this.field346 = var5;
        this.field347 = var6;
        this.field348 = var7;
        this.field349 = var8;
        this.field350 = var9;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LBTOCNVPA;ZI)V")
    public final void method123(class5 arg0, boolean arg1, int arg2) {
        this.method124(arg2, arg0.field102, false, arg0.field103);
        if (arg1) {
            this.field213.method179(188);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIZI)V")
    public final void method124(int arg0, int arg1, boolean arg2, int arg3) {
        if (arg1 >= 128 && arg3 >= 128 && arg1 <= 13056 && arg3 <= 13056) {
            int var5 = this.method83(this.field326, true, arg1, arg3) - arg0;
            if (arg2) {
                this.field213.method179(176);
            }
            int var6 = arg1 - this.field346;
            int var7 = var5 - this.field347;
            int var8 = arg3 - this.field348;
            int var9 = class55.field1401[this.field349];
            int var10 = class55.field1402[this.field349];
            int var11 = class55.field1401[this.field350];
            int var12 = class55.field1402[this.field350];
            int var13 = var6 * var12 + var8 * var11 >> 16;
            int var14 = var8 * var12 - var6 * var11 >> 16;
            int var16 = var7 * var10 - var9 * var14 >> 16;
            int var17 = var7 * var9 + var10 * var14 >> 16;
            if (var17 >= 50) {
                this.field196 = (var13 << 9) / var17 + class4.field30;
                this.field197 = (var16 << 9) / var17 + class4.field31;
            } else {
                this.field196 = -1;
                this.field197 = -1;
            }
        } else {
            this.field196 = -1;
            this.field197 = -1;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILHHCKFJEO;IBI)V")
    public final void method125(int arg0, class21 arg1, int arg2, byte arg3, int arg4) {
        if (field276 != arg1) {
            if (this.field601 < 400) {
                String var6;
                if (arg1.field793 == 0) {
                    var6 = arg1.field805 + method148(field276.field800, arg1.field800, 3) + " (level-" + arg1.field800 + ")";
                } else {
                    var6 = arg1.field805 + " (skill-" + arg1.field793 + ")";
                }
                if (this.field495 == 1) {
                    this.field314[this.field601] = "Use " + this.field499 + " with @whi@" + var6;
                    this.field429[this.field601] = 777;
                    this.field430[this.field601] = arg4;
                    this.field427[this.field601] = arg0;
                    this.field428[this.field601] = arg2;
                    ++this.field601;
                } else if (this.field183 == 1) {
                    if ((this.field185 & 8) == 8) {
                        this.field314[this.field601] = this.field186 + " @whi@" + var6;
                        this.field429[this.field601] = 690;
                        this.field430[this.field601] = arg4;
                        this.field427[this.field601] = arg0;
                        this.field428[this.field601] = arg2;
                        ++this.field601;
                    }
                } else {
                    for (int var7 = 4; var7 >= 0; --var7) {
                        if (this.field542[var7] != null) {
                            this.field314[this.field601] = this.field542[var7] + " @whi@" + var6;
                            short var9 = 0;
                            if (this.field542[var7].equalsIgnoreCase("attack")) {
                                if (arg1.field800 > field276.field800) {
                                    var9 = 2000;
                                }
                                if (field276.field779 != 0 && arg1.field779 != 0) {
                                    if (field276.field779 == arg1.field779) {
                                        var9 = 2000;
                                    } else {
                                        var9 = 0;
                                    }
                                }
                            } else if (this.field543[var7]) {
                                var9 = 2000;
                            }
                            if (var7 == 0) {
                                this.field429[this.field601] = var9 + 837;
                            }
                            if (var7 == 1) {
                                this.field429[this.field601] = var9 + 446;
                            }
                            if (var7 == 2) {
                                this.field429[this.field601] = var9 + 361;
                            }
                            if (var7 == 3) {
                                this.field429[this.field601] = var9 + 349;
                            }
                            if (var7 == 4) {
                                this.field429[this.field601] = var9 + 20;
                            }
                            this.field430[this.field601] = arg4;
                            this.field427[this.field601] = arg0;
                            this.field428[this.field601] = arg2;
                            ++this.field601;
                        }
                    }
                }
                for (int var8 = 0; var8 < this.field601; ++var8) {
                    if (this.field429[var8] == 579) {
                        this.field314[var8] = "Walk here @whi@" + var6;
                        break;
                    }
                }
                if (arg3 != 38) {
                    this.field150 = this.field492.method189();
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(BI)V")
    public final void method126(byte arg0, int arg1) {
        int[] var3 = this.field426.field1620;
        int var4 = var3.length;
        for (int var5 = 0; var5 < var4; ++var5) {
            var3[var5] = 0;
        }
        for (int var6 = 1; var6 < 103; ++var6) {
            int var23 = (103 - var6) * 512 * 4 + 24628;
            for (int var24 = 1; var24 < 103; ++var24) {
                if ((this.field418[arg1][var24][var6] & 24) == 0) {
                    this.field121.method573(var3, var23, 512, arg1, var24, var6);
                }
                if (arg1 < 3 && (this.field418[arg1 + 1][var24][var6] & 8) != 0) {
                    this.field121.method573(var3, var23, 512, arg1 + 1, var24, var6);
                }
                var23 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        this.field426.method524(0);
        for (int var9 = 1; var9 < 103; ++var9) {
            for (int var22 = 1; var22 < 103; ++var22) {
                if ((this.field418[arg1][var22][var9] & 24) == 0) {
                    this.method159(3, var22, var9, var8, var7, arg1);
                }
                if (arg1 < 3 && (this.field418[arg1 + 1][var22][var9] & 8) != 0) {
                    this.method159(3, var22, var9, var8, var7, arg1 + 1);
                }
            }
        }
        if (this.field390 != null) {
            this.field390.method455(0);
            class4.field36 = this.field441;
        }
        ++field300;
        if (field300 > 82) {
            field300 = 0;
            this.field213.method178(false, 155);
        }
        this.field168 = 0;
        for (int var10 = 0; var10 < 104; ++var10) {
            for (int var11 = 0; var11 < 104; ++var11) {
                int var12 = this.field121.method567(this.field326, var10, var11);
                if (var12 != 0) {
                    int var13 = var12 >> 14 & 32767;
                    int var14 = class56.method445(var13).field1437;
                    if (var14 >= 0) {
                        int var15 = var10;
                        int var16 = var11;
                        if (var14 != 22 && var14 != 29 && var14 != 34 && var14 != 36 && var14 != 46 && var14 != 47 && var14 != 48) {
                            byte var17 = 104;
                            byte var18 = 104;
                            int[][] var19 = this.field563[this.field326].field1523;
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
                        this.field375[this.field168] = this.field268[var14];
                        this.field169[this.field168] = var15;
                        this.field170[this.field168] = var16;
                        ++this.field168;
                    }
                }
            }
        }
        if (arg0 != 15) {
            this.field150 = this.field492.method189();
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(LDNRIFKTO;IZ)V")
    public final void method127(class11 arg0, int arg1, boolean arg2) {
        if (!arg2) {
            field156 = this.field460.method256();
        }
        if (arg1 == 24) {
            int var4 = arg0.method189();
            int var5 = (var4 >> 4 & 7) + this.field146;
            int var6 = (var4 & 7) + this.field147;
            int var7 = var5 + arg0.method190();
            int var8 = var6 + arg0.method190();
            int var9 = arg0.method192();
            int var10 = arg0.method191();
            int var11 = arg0.method189() * 4;
            int var12 = arg0.method189() * 4;
            int var13 = arg0.method191();
            int var14 = arg0.method191();
            int var15 = arg0.method189();
            int var16 = arg0.method189();
            if (var5 >= 0 && var6 >= 0 && var5 < 104 && var6 < 104 && var7 >= 0 && var8 >= 0 && var7 < 104 && var8 < 104 && var10 != 65535) {
                int var17 = var5 * 128 + 64;
                int var18 = var6 * 128 + 64;
                int var19 = var7 * 128 + 64;
                int var20 = var8 * 128 + 64;
                class28 var21 = new class28(field438 + var13, var12, var9, var18, var16, this.field326, var15, field438 + var14, var17, this.method83(this.field326, true, var17, var18) - var11, var10, 142);
                var21.method303(field438 + var13, -426, var19, this.method83(this.field326, true, var19, var20) - var12, var20);
                this.field274.method589(var21);
            }
        } else if (arg1 == 211) {
            int var22 = arg0.method207((byte) 7);
            int var23 = (var22 >> 4 & 7) + this.field146;
            int var24 = (var22 & 7) + this.field147;
            int var25 = arg0.method207((byte) 7);
            int var26 = var25 >> 2;
            int var27 = var25 & 3;
            int var28 = this.field443[var26];
            if (var23 >= 0 && var24 >= 0 && var23 < 104 && var24 < 104) {
                this.method76(var23, 0, var28, this.field326, var24, var27, var26, 786, -1, -1);
            }
        } else if (arg1 == 253) {
            int var29 = arg0.method216(0);
            int var30 = arg0.method189();
            int var31 = (var30 >> 4 & 7) + this.field146;
            int var32 = (var30 & 7) + this.field147;
            int var33 = arg0.method214(this.field594);
            int var34 = arg0.method216(0);
            if (var31 >= 0 && var32 >= 0 && var31 < 104 && var32 < 104 && this.field526 != var33) {
                class69 var35 = new class69();
                var35.field1716 = var29;
                var35.field1717 = var34;
                if (this.field504[this.field326][var31][var32] == null) {
                    this.field504[this.field326][var31][var32] = new class70(-489);
                }
                this.field504[this.field326][var31][var32].method589(var35);
                this.method61(var31, var32);
            }
        } else if (arg1 == 77) {
            int var36 = arg0.method215(-998);
            int var37 = arg0.method208((byte) 97);
            int var38 = (var37 >> 4 & 7) + this.field146;
            int var39 = (var37 & 7) + this.field147;
            int var40 = arg0.method189();
            int var41 = var40 >> 2;
            int var42 = var40 & 3;
            int var43 = this.field443[var41];
            if (var38 >= 0 && var39 >= 0 && var38 < 103 && var39 < 103) {
                int var44 = this.field419[this.field326][var38][var39];
                int var45 = this.field419[this.field326][var38 + 1][var39];
                int var46 = this.field419[this.field326][var38 + 1][var39 + 1];
                int var47 = this.field419[this.field326][var38][var39 + 1];
                if (var43 == 0) {
                    class1 var48 = this.field121.method560(this.field422, var39, this.field326, var38);
                    if (var48 != null) {
                        int var49 = var48.field8 >> 14 & 32767;
                        if (var41 == 2) {
                            var48.field6 = new class45(0, var44, var45, var36, var42 + 4, var46, var49, var47, false, 2);
                            var48.field7 = new class45(0, var44, var45, var36, var42 + 1 & 3, var46, var49, var47, false, 2);
                        } else {
                            var48.field6 = new class45(0, var44, var45, var36, var42, var46, var49, var47, false, var41);
                        }
                    }
                }
                if (var43 == 1) {
                    class3 var50 = this.field121.method561(var39, var38, this.field326, false);
                    if (var50 != null) {
                        var50.field20 = new class45(0, var44, var45, var36, 0, var46, var50.field21 >> 14 & 32767, var47, false, 4);
                    }
                }
                if (var43 == 2) {
                    class22 var51 = this.field121.method562(var39, this.field326, 0, var38);
                    if (var41 == 11) {
                        var41 = 10;
                    }
                    if (var51 != null) {
                        var51.field811 = new class45(0, var44, var45, var36, var42, var46, var51.field819 >> 14 & 32767, var47, false, var41);
                    }
                }
                if (var43 == 3) {
                    class43 var52 = this.field121.method563(var38, this.field326, false, var39);
                    if (var52 != null) {
                        var52.field1243 = new class45(0, var44, var45, var36, var42, var46, var52.field1244 >> 14 & 32767, var47, false, 22);
                    }
                }
            }
        } else if (arg1 == 52) {
            int var53 = arg0.method216(0);
            int var54 = arg0.method214(this.field594);
            int var55 = arg0.method208((byte) 97);
            int var56 = (var55 >> 4 & 7) + this.field146;
            int var57 = (var55 & 7) + this.field147;
            if (var56 >= 0 && var57 >= 0 && var56 < 104 && var57 < 104) {
                class69 var58 = new class69();
                var58.field1716 = var53;
                var58.field1717 = var54;
                if (this.field504[this.field326][var56][var57] == null) {
                    this.field504[this.field326][var56][var57] = new class70(-489);
                }
                this.field504[this.field326][var56][var57].method589(var58);
                this.method61(var56, var57);
            }
        } else if (arg1 == 197) {
            int var59 = arg0.method191();
            int var60 = arg0.method189();
            int var61 = (var60 >> 4 & 7) + this.field146;
            int var62 = (var60 & 7) + this.field147;
            int var63 = arg0.method189();
            int var64 = var63 >> 2;
            int var65 = var63 & 3;
            int var66 = this.field443[var64];
            if (var61 >= 0 && var62 >= 0 && var61 < 104 && var62 < 104) {
                this.method76(var61, 0, var66, this.field326, var62, var65, var64, 786, -1, var59);
            }
        } else {
            if (arg1 == 185) {
                int var67 = arg0.method189();
                int var68 = (var67 >> 4 & 7) + this.field146;
                int var69 = (var67 & 7) + this.field147;
                int var70 = arg0.method191();
                int var71 = arg0.method189();
                int var72 = var71 >> 4 & 15;
                int var73 = var71 & 7;
                if (field276.field88[0] >= var68 - var72 && field276.field88[0] <= var68 + var72 && field276.field89[0] >= var69 - var72 && field276.field89[0] <= var69 + var72 && this.field527 && !field286 && this.field507 < 50) {
                    this.field501[this.field507] = var70;
                    this.field490[this.field507] = var73;
                    this.field260[this.field507] = class33.field1061[var70];
                    ++this.field507;
                }
            }
            if (arg1 == 87) {
                int var74 = arg0.method189();
                int var75 = (var74 >> 4 & 7) + this.field146;
                int var76 = (var74 & 7) + this.field147;
                int var77 = arg0.method191();
                int var78 = arg0.method191();
                int var79 = arg0.method191();
                if (var75 >= 0 && var76 >= 0 && var75 < 104 && var76 < 104) {
                    class70 var80 = this.field504[this.field326][var75][var76];
                    if (var80 != null) {
                        for (class69 var81 = (class69) var80.method592(); var81 != null; var81 = (class69) var80.method594(-314)) {
                            if ((var77 & 32767) == var81.field1716 && var81.field1717 == var78) {
                                var81.field1717 = var79;
                                break;
                            }
                        }
                        this.method61(var75, var76);
                    }
                }
            } else if (arg1 == 94) {
                int var82 = arg0.method189();
                int var83 = (var82 >> 4 & 7) + this.field146;
                int var84 = (var82 & 7) + this.field147;
                int var85 = arg0.method191();
                int var86 = arg0.method189();
                int var87 = arg0.method191();
                if (var83 >= 0 && var84 >= 0 && var83 < 104 && var84 < 104) {
                    int var88 = var83 * 128 + 64;
                    int var89 = var84 * 128 + 64;
                    class48 var90 = new class48(false, var85, var87, this.method83(this.field326, true, var88, var89) - var86, var89, this.field326, var88, field438);
                    this.field282.method589(var90);
                }
            } else {
                if (arg1 == 207) {
                    int var91 = arg0.method215(-998);
                    int var92 = arg0.method214(this.field594);
                    byte var93 = arg0.method210(9);
                    byte var94 = arg0.method209((byte) 51);
                    int var95 = arg0.method191();
                    int var96 = arg0.method208((byte) 97);
                    int var97 = (var96 >> 4 & 7) + this.field146;
                    int var98 = (var96 & 7) + this.field147;
                    int var99 = arg0.method191();
                    int var100 = arg0.method189();
                    int var101 = var100 >> 2;
                    int var102 = var100 & 3;
                    int var103 = this.field443[var101];
                    byte var104 = arg0.method190();
                    byte var105 = arg0.method209((byte) 51);
                    class21 var106;
                    if (this.field526 == var95) {
                        var106 = field276;
                    } else {
                        var106 = this.field557[var95];
                    }
                    if (var106 != null) {
                        class56 var107 = class56.method445(var92);
                        int var108 = this.field419[this.field326][var97][var98];
                        int var109 = this.field419[this.field326][var97 + 1][var98];
                        int var110 = this.field419[this.field326][var97 + 1][var98 + 1];
                        int var111 = this.field419[this.field326][var97][var98 + 1];
                        class55 var112 = var107.method446(var101, var102, var108, var109, var110, var111, -1);
                        if (var112 != null) {
                            this.method76(var97, var99 + 1, var103, this.field326, var98, 0, 0, 786, var91 + 1, -1);
                            var106.field798 = field438 + var99;
                            var106.field799 = field438 + var91;
                            var106.field786 = var112;
                            int var113 = var107.field1427;
                            int var114 = var107.field1426;
                            if (var102 == 1 || var102 == 3) {
                                var113 = var107.field1426;
                                var114 = var107.field1427;
                            }
                            var106.field783 = var97 * 128 + var113 * 64;
                            var106.field785 = var98 * 128 + var114 * 64;
                            var106.field784 = this.method83(this.field326, true, var106.field783, var106.field785);
                            if (var105 > var104) {
                                byte var115 = var105;
                                var105 = var104;
                                var104 = var115;
                            }
                            if (var94 > var93) {
                                byte var116 = var94;
                                var94 = var93;
                                var93 = var116;
                            }
                            var106.field794 = var97 + var105;
                            var106.field796 = var97 + var104;
                            var106.field795 = var94 + var98;
                            var106.field797 = var93 + var98;
                        }
                    }
                }
                if (arg1 == 212) {
                    int var117 = arg0.method206((byte) -35);
                    int var118 = (var117 >> 4 & 7) + this.field146;
                    int var119 = (var117 & 7) + this.field147;
                    int var120 = arg0.method214(this.field594);
                    if (var118 >= 0 && var119 >= 0 && var118 < 104 && var119 < 104) {
                        class70 var121 = this.field504[this.field326][var118][var119];
                        if (var121 != null) {
                            for (class69 var122 = (class69) var121.method592(); var122 != null; var122 = (class69) var121.method594(-314)) {
                                if ((var120 & 32767) == var122.field1716) {
                                    var122.method1();
                                    break;
                                }
                            }
                            if (var121.method592() == null) {
                                this.field504[this.field326][var118][var119] = null;
                            }
                            this.method61(var118, var119);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "x", descriptor = "(I)V")
    private final void method128(int arg0) {
        class67 var2 = (class67) this.field257.method592();
        if (arg0 <= 0) {
            this.field150 = -1;
        }
        while (var2 != null) {
            if (var2.field1633 == -1) {
                var2.field1634 = 0;
                this.method57(var2, 5);
            } else {
                var2.method1();
            }
            var2 = (class67) this.field257.method594(-314);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(JB)V")
    public final void method129(long arg0, byte arg1) {
        if (arg1 != 37) {
            this.field150 = this.field492.method189();
        }
        if (arg0 != 0L) {
            for (int var4 = 0; var4 < this.field298; ++var4) {
                if (this.field311[var4] == arg0) {
                    --this.field298;
                    this.field372 = true;
                    for (int var5 = var4; var5 < this.field298; ++var5) {
                        this.field134[var5] = this.field134[var5 + 1];
                        this.field484[var5] = this.field484[var5 + 1];
                        this.field311[var5] = this.field311[var5 + 1];
                    }
                    this.field213.method178(false, 188);
                    this.field213.method185((byte) 35, arg0);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(LLUAMUNXO;I)Z")
    public final boolean method130(class30 arg0, int arg1) {
        int var3 = arg0.field963;
        if (arg1 != -13938) {
            this.field199 = -160;
        }
        if (this.field299 == 2) {
            if (var3 == 201) {
                this.field205 = true;
                this.field502 = 0;
                this.field436 = true;
                this.field331 = "";
                this.field566 = 1;
                this.field590 = "Enter name of friend to add to list";
            }
            if (var3 == 202) {
                this.field205 = true;
                this.field502 = 0;
                this.field436 = true;
                this.field331 = "";
                this.field566 = 2;
                this.field590 = "Enter name of friend to delete from list";
            }
        }
        if (var3 == 205) {
            this.field153 = 250;
            return true;
        } else {
            if (var3 == 501) {
                this.field205 = true;
                this.field502 = 0;
                this.field436 = true;
                this.field331 = "";
                this.field566 = 4;
                this.field590 = "Enter name of player to add to list";
            }
            if (var3 == 502) {
                this.field205 = true;
                this.field502 = 0;
                this.field436 = true;
                this.field331 = "";
                this.field566 = 5;
                this.field590 = "Enter name of player to delete from list";
            }
            if (var3 >= 300 && var3 <= 313) {
                int var4 = (var3 - 300) / 2;
                int var5 = var3 & 1;
                int var6 = this.field122[var4];
                if (var6 != -1) {
                    while (true) {
                        if (var5 == 0) {
                            --var6;
                            if (var6 < 0) {
                                var6 = class9.field616 - 1;
                            }
                        }
                        if (var5 == 1) {
                            ++var6;
                            if (var6 >= class9.field616) {
                                var6 = 0;
                            }
                        }
                        if (!class9.field617[var6].field623 && class9.field617[var6].field618 == var4 + (this.field332 ? 0 : 7)) {
                            this.field122[var4] = var6;
                            this.field376 = true;
                            break;
                        }
                    }
                }
            }
            if (var3 >= 314 && var3 <= 323) {
                int var7 = (var3 - 314) / 2;
                int var8 = var3 & 1;
                int var9 = this.field444[var7];
                if (var8 == 0) {
                    --var9;
                    if (var9 < 0) {
                        var9 = field377[var7].length - 1;
                    }
                }
                if (var8 == 1) {
                    ++var9;
                    if (var9 >= field377[var7].length) {
                        var9 = 0;
                    }
                }
                this.field444[var7] = var9;
                this.field376 = true;
            }
            if (var3 == 324 && !this.field332) {
                this.field332 = true;
                this.method84(false);
            }
            if (var3 == 325 && this.field332) {
                this.field332 = false;
                this.method84(false);
            }
            if (var3 != 326) {
                if (var3 == 620) {
                    this.field570 = !this.field570;
                }
                if (var3 >= 601 && var3 <= 613) {
                    this.method152(-21279);
                    if (this.field327.length() > 0) {
                        this.field213.method178(false, 192);
                        this.field213.method185((byte) 35, class25.method278(this.field327));
                        this.field213.method179(var3 - 601);
                        this.field213.method179(this.field570 ? 1 : 0);
                    }
                }
                return false;
            } else {
                this.field213.method178(false, 154);
                this.field213.method179(this.field332 ? 0 : 1);
                for (int var10 = 0; var10 < 7; ++var10) {
                    this.field213.method179(this.field122[var10]);
                }
                for (int var11 = 0; var11 < 5; ++var11) {
                    this.field213.method179(this.field444[var11]);
                }
                return true;
            }
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(BI)Z")
    public final boolean method131(byte arg0, int arg1) {
        if (arg0 == 9) {
            boolean var3 = false;
        } else {
            this.field150 = -1;
        }
        if (arg1 < 0) {
            return false;
        } else {
            int var4 = this.field429[arg1];
            if (var4 >= 2000) {
                var4 -= 2000;
            }
            return var4 == 723;
        }
    }

    @OriginalMember(owner = "client", name = "y", descriptor = "(I)V")
    public final void method132(int arg0) {
        if (arg0 != 43947) {
            this.field150 = this.field492.method189();
        }
        if (this.field153 > 0) {
            this.method45((byte) -87);
        } else {
            if (this.field390 != null) {
                this.field390.method455(0);
                class4.field36 = this.field441;
                this.field447.method230(0, 257, "Connection lost", (byte) -90, 144);
                this.field447.method230(16777215, 256, "Connection lost", (byte) -90, 143);
                this.field447.method230(0, 257, "Please wait - attempting to reestablish", (byte) -90, 159);
                this.field447.method230(16777215, 256, "Please wait - attempting to reestablish", (byte) -90, 158);
                this.field390.method456(4, 722, super.field905, 4);
            } else if (super.field906 != null) {
                super.field906.method455(0);
                class4.field36 = this.field442;
                this.field447.method230(0, 383, "Connection lost", (byte) -90, 464);
                this.field447.method230(16777215, 382, "Connection lost", (byte) -90, 463);
                this.field447.method230(0, 383, "Please wait - attempting to reestablish", (byte) -90, 479);
                this.field447.method230(16777215, 382, "Please wait - attempting to reestablish", (byte) -90, 478);
                super.field906.method456(0, 722, super.field905, 0);
            }
            this.field470 = 0;
            this.field424 = 0;
            class42 var2 = this.field321;
            this.field528 = false;
            this.field397 = 0;
            this.method41(this.field294, this.field295, true);
            if (!this.field528) {
                this.method45((byte) -87);
            }
            try {
                var2.method378();
            } catch (Exception var3) {
            }
        }
    }

    @OriginalMember(owner = "client", name = "n", descriptor = "(Z)V")
    public final void method133(boolean arg0) {
        short var2 = 256;
        for (int var3 = 10; var3 < 117; ++var3) {
            int var18 = (int) (Math.random() * 100.0D);
            if (var18 < 50) {
                this.field420[(var2 - 2 << 7) + var3] = 255;
            }
        }
        for (int var4 = 0; var4 < 100; ++var4) {
            int var15 = (int) (Math.random() * 124.0D) + 2;
            int var16 = (int) (Math.random() * 128.0D) + 128;
            int var17 = (var16 << 7) + var15;
            this.field420[var17] = 192;
        }
        for (int var5 = 1; var5 < var2 - 1; ++var5) {
            for (int var13 = 1; var13 < 127; ++var13) {
                int var14 = (var5 << 7) + var13;
                this.field421[var14] = (this.field420[var14 - 1] + this.field420[var14 + 1] + this.field420[var14 - 128] + this.field420[var14 + 128]) / 4;
            }
        }
        this.field218 += 128;
        if (this.field218 > this.field125.length) {
            this.field218 -= this.field125.length;
            int var6 = (int) (Math.random() * 12.0D);
            this.method63(this.field545[var6], this.field450);
        }
        for (int var7 = 1; var7 < var2 - 1; ++var7) {
            for (int var10 = 1; var10 < 127; ++var10) {
                int var11 = (var7 << 7) + var10;
                int var12 = this.field421[var11 + 128] - this.field125[this.field218 + var11 & this.field125.length - 1] / 5;
                if (var12 < 0) {
                    var12 = 0;
                }
                this.field420[var11] = var12;
            }
        }
        if (!arg0) {
            field156 = 375;
        }
        for (int var8 = 0; var8 < var2 - 1; ++var8) {
            this.field353[var8] = this.field353[var8 + 1];
        }
        this.field353[var2 - 1] = (int) (Math.sin((double) field438 / 14.0D) * 16.0D + Math.sin((double) field438 / 15.0D) * 14.0D + Math.sin((double) field438 / 16.0D) * 12.0D);
        if (this.field363 > 0) {
            this.field363 -= 4;
        }
        if (this.field364 > 0) {
            this.field364 -= 4;
        }
        if (this.field363 == 0 && this.field364 == 0) {
            int var9 = (int) (Math.random() * 2000.0D);
            if (var9 == 0) {
                this.field363 = 1024;
            }
            if (var9 == 1) {
                this.field364 = 1024;
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "z", descriptor = "(I)V")
    public final void method134(int arg0) {
        int var2 = 98 / arg0;
        if (this.field601 >= 2 || this.field495 != 0 || this.field183 != 0) {
            String var3;
            if (this.field495 == 1 && this.field601 < 2) {
                var3 = "Use " + this.field499 + " with...";
            } else if (this.field183 == 1 && this.field601 < 2) {
                var3 = this.field186 + "...";
            } else {
                var3 = this.field314[this.field601 - 1];
            }
            if (this.field601 > 2) {
                var3 = var3 + "@whi@ / " + (this.field601 - 2) + " more options";
            }
            this.field448.method239(4, var3, true, true, 15, field438 / 1000, 16777215);
        }
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(II)V")
    public final void method135(int arg0, int arg1) {
        if (arg0 == -10386) {
            class30.method312(-10386, arg1);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BILjava/lang/String;Ljava/lang/String;)V")
    public final void method136(byte arg0, int arg1, String arg2, String arg3) {
        if (arg1 == 0 && this.field194 != -1) {
            this.field223 = arg2;
            super.field919 = 0;
        }
        if (this.field585 == -1) {
            this.field205 = true;
        }
        for (int var5 = 99; var5 > 0; --var5) {
            this.field355[var5] = this.field355[var5 - 1];
            this.field356[var5] = this.field356[var5 - 1];
            this.field357[var5] = this.field357[var5 - 1];
        }
        if (arg0 == 3) {
            boolean var6 = false;
        } else {
            this.field279 = -330;
        }
        this.field355[0] = arg1;
        this.field356[0] = arg3;
        this.field357[0] = arg2;
    }

    @OriginalMember(owner = "client", name = "o", descriptor = "(Z)V")
    public final void method137(boolean arg0) {
        if (this.field359 == 2) {
            this.method124(this.field338 * 2, (this.field336 - this.field322 << 7) + this.field339, false, (this.field337 - this.field323 << 7) + this.field340);
            if (arg0) {
                this.field150 = this.field492.method189();
            }
            if (this.field196 > -1 && field438 % 20 < 10) {
                this.field148[0].method529((byte) 50, this.field196 - 12, this.field197 - 28);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIILLUAMUNXO;I)V")
    public final void method138(int arg0, int arg1, int arg2, class30 arg3, int arg4) {
        if (arg3.field1005 == 0 && arg3.field986 != null) {
            if (!arg3.field1026 || this.field395 == arg3.field996 || this.field203 == arg3.field996 || this.field455 == arg3.field996) {
                int var6 = class62.field1533;
                int var7 = class62.field1531;
                int var8 = class62.field1534;
                int var9 = class62.field1532;
                class62.method514(arg4, arg1, arg3.field1028 + arg1, arg3.field1004 + arg4, 0);
                int var10 = arg3.field986.length;
                for (int var11 = 0; var11 < var10; ++var11) {
                    int var13 = arg3.field992[var11] + arg4;
                    int var14 = arg3.field1010[var11] + arg1 - arg2;
                    class30 var15 = class30.method316(arg3.field986[var11]);
                    int var16 = var15.field1020 + var13;
                    int var17 = var15.field984 + var14;
                    if (var15.field963 > 0) {
                        this.method52(var15, 5);
                    }
                    if (var15.field1005 == 0) {
                        if (var15.field989 > var15.field1027 - var15.field1028) {
                            var15.field989 = var15.field1027 - var15.field1028;
                        }
                        if (var15.field989 < 0) {
                            var15.field989 = 0;
                        }
                        this.method138(0, var17, var15.field989, var15, var16);
                        if (var15.field1027 > var15.field1028) {
                            this.method111(var15.field1027, -471, var15.field989, var17, var15.field1028, var15.field1004 + var16);
                        }
                    } else if (var15.field1005 != 1) {
                        if (var15.field1005 == 2) {
                            int var18 = 0;
                            for (int var19 = 0; var19 < var15.field1028; ++var19) {
                                for (int var20 = 0; var20 < var15.field1004; ++var20) {
                                    int var21 = (var15.field964 + 32) * var20 + var16;
                                    int var22 = (var15.field1014 + 32) * var19 + var17;
                                    if (var18 < 20) {
                                        var21 += var15.field990[var18];
                                        var22 += var15.field975[var18];
                                    }
                                    if (var15.field956[var18] <= 0) {
                                        if (var15.field967 != null && var18 < 20) {
                                            class65 var31 = var15.field967[var18];
                                            if (var31 != null) {
                                                var31.method529((byte) 50, var21, var22);
                                            }
                                        }
                                    } else {
                                        int var23 = 0;
                                        int var24 = 0;
                                        int var25 = var15.field956[var18] - 1;
                                        if (var21 > class62.field1533 - 32 && var21 < class62.field1534 && var22 > class62.field1531 - 32 && var22 < class62.field1532 || this.field401 != 0 && this.field400 == var18) {
                                            int var26 = 0;
                                            if (this.field495 == 1 && this.field496 == var18 && this.field497 == var15.field996) {
                                                var26 = 16777215;
                                            }
                                            class65 var27 = class26.method295(var26, var25, var15.field1032[var18], -198);
                                            if (var27 != null) {
                                                if (this.field401 != 0 && this.field400 == var18 && this.field399 == var15.field996) {
                                                    var23 = super.field913 - this.field402;
                                                    var24 = super.field914 - this.field403;
                                                    if (var23 < 5 && var23 > -5) {
                                                        var23 = 0;
                                                    }
                                                    if (var24 < 5 && var24 > -5) {
                                                        var24 = 0;
                                                    }
                                                    if (this.field265 < 5) {
                                                        var23 = 0;
                                                        var24 = 0;
                                                    }
                                                    var27.method531(true, var21 + var23, var22 + var24, 128);
                                                    if (var22 + var24 < class62.field1531 && arg3.field989 > 0) {
                                                        int var28 = (class62.field1531 - var22 - var24) * this.field181 / 3;
                                                        if (var28 > this.field181 * 10) {
                                                            var28 = this.field181 * 10;
                                                        }
                                                        if (var28 > arg3.field989) {
                                                            var28 = arg3.field989;
                                                        }
                                                        arg3.field989 -= var28;
                                                        this.field403 += var28;
                                                    }
                                                    if (var22 + var24 + 32 > class62.field1532 && arg3.field989 < arg3.field1027 - arg3.field1028) {
                                                        int var29 = (var22 + var24 + 32 - class62.field1532) * this.field181 / 3;
                                                        if (var29 > this.field181 * 10) {
                                                            var29 = this.field181 * 10;
                                                        }
                                                        if (var29 > arg3.field1027 - arg3.field1028 - arg3.field989) {
                                                            var29 = arg3.field1027 - arg3.field1028 - arg3.field989;
                                                        }
                                                        arg3.field989 += var29;
                                                        this.field403 -= var29;
                                                    }
                                                } else if (this.field515 != 0 && this.field514 == var18 && this.field513 == var15.field996) {
                                                    var27.method531(true, var21, var22, 128);
                                                } else {
                                                    var27.method529((byte) 50, var21, var22);
                                                }
                                                if (var27.field1625 == 33 || var15.field1032[var18] != 1) {
                                                    int var30 = var15.field1032[var18];
                                                    this.field446.method234(var21 + 1 + var23, method151(var30, 7), 0, 988, var22 + 10 + var24);
                                                    this.field446.method234(var21 + var23, method151(var30, 7), 16776960, 988, var22 + 9 + var24);
                                                }
                                            }
                                        }
                                    }
                                    ++var18;
                                }
                            }
                        } else if (var15.field1005 == 3) {
                            boolean var32 = false;
                            if (this.field455 == var15.field996 || this.field203 == var15.field996 || this.field395 == var15.field996) {
                                var32 = true;
                            }
                            int var33;
                            if (this.method91(var15, (byte) 5)) {
                                var33 = var15.field1021;
                                if (var32 && var15.field1016 != 0) {
                                    var33 = var15.field1016;
                                }
                            } else {
                                var33 = var15.field981;
                                if (var32 && var15.field985 != 0) {
                                    var33 = var15.field985;
                                }
                            }
                            if (var15.field978 == 0) {
                                if (var15.field971) {
                                    class62.method517(var15.field1028, var33, var16, var15.field1004, this.field597, var17);
                                } else {
                                    class62.method518(var15.field1028, this.field261, var16, var33, var15.field1004, var17);
                                }
                            } else if (var15.field971) {
                                class62.method516(27370, var15.field1004, 256 - (var15.field978 & 255), var15.field1028, var16, var33, var17);
                            } else {
                                class62.method519(var15.field1004, var16, var17, 256 - (var15.field978 & 255), var33, var15.field1028, false);
                            }
                        } else if (var15.field1005 == 4) {
                            class13 var34 = var15.field997;
                            String var35 = var15.field1003;
                            boolean var36 = false;
                            if (this.field455 == var15.field996 || this.field203 == var15.field996 || this.field395 == var15.field996) {
                                var36 = true;
                            }
                            int var37;
                            if (this.method91(var15, (byte) 5)) {
                                var37 = var15.field1021;
                                if (var36 && var15.field1016 != 0) {
                                    var37 = var15.field1016;
                                }
                                if (var15.field1000.length() > 0) {
                                    var35 = var15.field1000;
                                }
                            } else {
                                var37 = var15.field981;
                                if (var36 && var15.field985 != 0) {
                                    var37 = var15.field985;
                                }
                            }
                            if (var15.field982 == 6 && this.field587) {
                                var35 = "Please wait...";
                                var37 = var15.field981;
                            }
                            if (class62.field1529 == 479) {
                                if (var37 == 16776960) {
                                    var37 = 255;
                                }
                                if (var37 == 49152) {
                                    var37 = 16777215;
                                }
                            }
                            int var38 = var34.field671 + var17;
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
                                                                        var35 = var35.substring(0, var43) + this.method87(298, this.method167(4, var15, -140)) + var35.substring(var43 + 2);
                                                                    }
                                                                }
                                                                var35 = var35.substring(0, var42) + this.method87(298, this.method167(3, var15, -140)) + var35.substring(var42 + 2);
                                                            }
                                                        }
                                                        var35 = var35.substring(0, var41) + this.method87(298, this.method167(2, var15, -140)) + var35.substring(var41 + 2);
                                                    }
                                                }
                                                var35 = var35.substring(0, var40) + this.method87(298, this.method167(1, var15, -140)) + var35.substring(var40 + 2);
                                            }
                                        }
                                        var35 = var35.substring(0, var39) + this.method87(298, this.method167(0, var15, -140)) + var35.substring(var39 + 2);
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
                                if (var15.field1002) {
                                    var34.method231(27826, var45, var15.field1017, var38, var37, var15.field1004 / 2 + var16);
                                } else {
                                    var34.method238(var16, 30867, var45, var15.field1017, var38, var37);
                                }
                                var38 += var34.field671;
                            }
                        } else if (var15.field1005 == 5) {
                            class65 var46;
                            if (this.method91(var15, (byte) 5)) {
                                var46 = var15.field974;
                            } else {
                                var46 = var15.field1009;
                            }
                            if (var46 != null) {
                                var46.method529((byte) 50, var16, var17);
                            }
                        } else if (var15.field1005 == 6) {
                            int var47 = class4.field30;
                            int var48 = class4.field31;
                            class4.field30 = var15.field1004 / 2 + var16;
                            class4.field31 = var15.field1028 / 2 + var17;
                            int var49 = class4.field34[var15.field969] * var15.field968 >> 16;
                            int var50 = class4.field35[var15.field969] * var15.field968 >> 16;
                            boolean var51 = this.method91(var15, (byte) 5);
                            int var52;
                            if (var51) {
                                var52 = var15.field959;
                            } else {
                                var52 = var15.field958;
                            }
                            class55 var53;
                            if (var52 == -1) {
                                var53 = var15.method314(this.field591, -1, var51, -1);
                            } else {
                                class71 var54 = class71.field1727[var52];
                                var53 = var15.method314(this.field591, var54.field1729[var15.field993], var51, var54.field1730[var15.field993]);
                            }
                            if (var53 != null) {
                                var53.method438(0, var15.field970, 0, var15.field969, 0, var49, var50);
                            }
                            class4.field30 = var47;
                            class4.field31 = var48;
                        } else {
                            if (var15.field1005 == 7) {
                                class13 var55 = var15.field997;
                                int var56 = 0;
                                for (int var57 = 0; var57 < var15.field1028; ++var57) {
                                    for (int var58 = 0; var58 < var15.field1004; ++var58) {
                                        if (var15.field956[var56] > 0) {
                                            class26 var59 = class26.method293(var15.field956[var56] - 1);
                                            String var60 = var59.field844;
                                            if (var59.field865 || var15.field1032[var56] != 1) {
                                                var60 = var60 + " x" + method55(var15.field1032[var56], (byte) 2);
                                            }
                                            int var61 = (var15.field964 + 115) * var58 + var16;
                                            int var62 = (var15.field1014 + 12) * var57 + var17;
                                            if (var15.field1002) {
                                                var55.method231(27826, var60, var15.field1017, var62, var15.field981, var15.field1004 / 2 + var61);
                                            } else {
                                                var55.method238(var61, 30867, var60, var15.field1017, var62, var15.field981);
                                            }
                                        }
                                        ++var56;
                                    }
                                }
                            }
                            if (var15.field1005 == 8 && (this.field386 == var15.field996 || this.field171 == var15.field996 || this.field255 == var15.field996)) {
                                int var63 = 0;
                                int var64 = 0;
                                class13 var65 = this.field447;
                                String var66 = var15.field1003;
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
                                    int var75 = var65.method232(var74, 410);
                                    if (var75 > var63) {
                                        var63 = var75;
                                    }
                                    var64 += var65.field671 + 1;
                                }
                                var63 += 6;
                                var64 += 7;
                                int var67 = var15.field1004 + var16 - 5 - var63;
                                int var68 = var15.field1028 + var17 + 5;
                                if (var67 < var16 + 5) {
                                    var67 = var16 + 5;
                                }
                                if (var63 + var67 > arg3.field1004 + arg4) {
                                    var67 = arg3.field1004 + arg4 - var63;
                                }
                                class62.method517(var64, 16777120, var67, var63, this.field597, var68);
                                class62.method518(var64, this.field261, var67, 0, var63, var68);
                                String var69 = var15.field1003;
                                int var70 = var65.field671 + var68 + 2;
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
                                    var65.method238(var67 + 3, 30867, var72, false, var70, 0);
                                    var70 += var65.field671 + 1;
                                }
                            }
                        }
                    }
                }
                class62.method514(var6, var7, var9, var8, 0);
                if (arg0 < 0 || arg0 > 0) {
                    for (int var12 = 1; var12 > 0; ++var12) {
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(BI)V")
    public final void method139(byte arg0, int arg1) {
        int var3 = class54.field1311[arg1].field1319;
        if (arg0 == 77) {
            if (var3 != 0) {
                int var4 = this.field588[arg1];
                if (var3 == 1) {
                    if (var4 == 1) {
                        class4.method11(0.9D, (byte) 0);
                    }
                    if (var4 == 2) {
                        class4.method11(0.8D, (byte) 0);
                    }
                    if (var4 == 3) {
                        class4.method11(0.7D, (byte) 0);
                    }
                    if (var4 == 4) {
                        class4.method11(0.6D, (byte) 0);
                    }
                    class26.field840.method403();
                    this.field379 = true;
                }
                if (var3 == 3) {
                    boolean var5 = this.field508;
                    if (var4 == 0) {
                        this.method79(false, 0, this.field508);
                        this.field508 = true;
                    }
                    if (var4 == 1) {
                        this.method79(false, -400, this.field508);
                        this.field508 = true;
                    }
                    if (var4 == 2) {
                        this.method79(false, -800, this.field508);
                        this.field508 = true;
                    }
                    if (var4 == 3) {
                        this.method79(false, -1200, this.field508);
                        this.field508 = true;
                    }
                    if (var4 == 4) {
                        this.field508 = false;
                    }
                    if (this.field508 != var5 && !field286) {
                        if (this.field508) {
                            this.field131 = this.field264;
                            this.field132 = true;
                            this.field154.method328(2, this.field131);
                        } else {
                            this.method97(0);
                        }
                        this.field536 = 0;
                    }
                }
                if (var3 == 4) {
                    if (var4 == 0) {
                        this.field527 = true;
                        this.method142(-69, 0);
                    }
                    if (var4 == 1) {
                        this.field527 = true;
                        this.method142(-69, -400);
                    }
                    if (var4 == 2) {
                        this.field527 = true;
                        this.method142(-69, -800);
                    }
                    if (var4 == 3) {
                        this.field527 = true;
                        this.method142(-69, -1200);
                    }
                    if (var4 == 4) {
                        this.field527 = false;
                    }
                }
                if (var3 == 5) {
                    this.field329 = var4;
                }
                if (var3 == 6) {
                    this.field335 = var4;
                }
                if (var3 == 8) {
                    this.field352 = var4;
                    this.field205 = true;
                }
                if (var3 == 9) {
                    this.field599 = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IILDNRIFKTO;)V")
    private final void method140(int arg0, int arg1, class11 arg2) {
        int var4 = arg2.method200(5, 8);
        if (var4 < this.field558) {
            for (int var5 = var4; var5 < this.field558; ++var5) {
                this.field459[this.field458++] = this.field559[var5];
            }
        }
        if (var4 > this.field558) {
            signlink.reporterror(this.field294 + " Too many players");
            throw new RuntimeException("eek");
        } else {
            this.field558 = 0;
            if (arg1 < 5 || arg1 > 5) {
                this.field150 = arg2.method189();
            }
            for (int var6 = 0; var6 < var4; ++var6) {
                int var7 = this.field559[var6];
                class21 var8 = this.field557[var7];
                int var9 = arg2.method200(5, 1);
                if (var9 == 0) {
                    this.field559[this.field558++] = var7;
                    var8.field71 = field438;
                } else {
                    int var10 = arg2.method200(5, 2);
                    if (var10 == 0) {
                        this.field559[this.field558++] = var7;
                        var8.field71 = field438;
                        this.field561[this.field560++] = var7;
                    } else if (var10 == 1) {
                        this.field559[this.field558++] = var7;
                        var8.field71 = field438;
                        int var11 = arg2.method200(5, 3);
                        var8.method19(true, var11, false);
                        int var12 = arg2.method200(5, 1);
                        if (var12 == 1) {
                            this.field561[this.field560++] = var7;
                        }
                    } else if (var10 == 2) {
                        this.field559[this.field558++] = var7;
                        var8.field71 = field438;
                        int var13 = arg2.method200(5, 3);
                        var8.method19(true, var13, true);
                        int var14 = arg2.method200(5, 3);
                        var8.method19(true, var14, true);
                        int var15 = arg2.method200(5, 1);
                        if (var15 == 1) {
                            this.field561[this.field560++] = var7;
                        }
                    } else if (var10 == 3) {
                        this.field459[this.field458++] = var7;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "p", descriptor = "(Z)V")
    public final void method141(boolean arg0) {
        if (this.field401 == 0) {
            int var2 = super.field919;
            if (!arg0) {
                if (this.field183 == 1 && super.field920 >= 516 && super.field921 >= 160 && super.field920 <= 765 && super.field921 <= 205) {
                    var2 = 0;
                }
                if (this.field396) {
                    if (var2 != 1) {
                        int var3 = super.field913;
                        int var4 = super.field914;
                        if (this.field521 == 0) {
                            var3 -= 4;
                            var4 -= 4;
                        }
                        if (this.field521 == 1) {
                            var3 -= 553;
                            var4 -= 205;
                        }
                        if (this.field521 == 2) {
                            var3 -= 17;
                            var4 -= 357;
                        }
                        if (var3 < this.field522 - 10 || var3 > this.field524 + this.field522 + 10 || var4 < this.field523 - 10 || var4 > this.field525 + this.field523 + 10) {
                            this.field396 = false;
                            if (this.field521 == 1) {
                                this.field372 = true;
                            }
                            if (this.field521 == 2) {
                                this.field205 = true;
                            }
                        }
                    }
                    if (var2 == 1) {
                        int var5 = this.field522;
                        int var6 = this.field523;
                        int var7 = this.field524;
                        int var8 = super.field920;
                        int var9 = super.field921;
                        if (this.field521 == 0) {
                            var8 -= 4;
                            var9 -= 4;
                        }
                        if (this.field521 == 1) {
                            var8 -= 553;
                            var9 -= 205;
                        }
                        if (this.field521 == 2) {
                            var8 -= 17;
                            var9 -= 357;
                        }
                        int var10 = -1;
                        for (int var11 = 0; var11 < this.field601; ++var11) {
                            int var12 = (this.field601 - 1 - var11) * 15 + var6 + 31;
                            if (var8 > var5 && var8 < var5 + var7 && var9 > var12 - 13 && var9 < var12 + 3) {
                                var10 = var11;
                            }
                        }
                        if (var10 != -1) {
                            this.method39(false, var10);
                        }
                        this.field396 = false;
                        if (this.field521 == 1) {
                            this.field372 = true;
                        }
                        if (this.field521 == 2) {
                            this.field205 = true;
                            return;
                        }
                    }
                } else {
                    if (var2 == 1 && this.field601 > 0) {
                        int var13 = this.field429[this.field601 - 1];
                        if (var13 == 959 || var13 == 433 || var13 == 18 || var13 == 601 || var13 == 511 || var13 == 871 || var13 == 164 || var13 == 137 || var13 == 503 || var13 == 914 || var13 == 711 || var13 == 1675) {
                            int var14 = this.field427[this.field601 - 1];
                            int var15 = this.field428[this.field601 - 1];
                            class30 var16 = class30.method316(var15);
                            if (var16.field1030 || var16.field1018) {
                                this.field371 = false;
                                this.field265 = 0;
                                this.field399 = var15;
                                this.field400 = var14;
                                this.field401 = 2;
                                this.field402 = super.field920;
                                this.field403 = super.field921;
                                if (class30.method316(var15).field988 == this.field595) {
                                    this.field401 = 1;
                                }
                                if (class30.method316(var15).field988 == this.field585) {
                                    this.field401 = 3;
                                }
                                return;
                            }
                        }
                    }
                    if (var2 == 1 && (this.field329 == 1 || this.method131((byte) 9, this.field601 - 1)) && this.field601 > 2) {
                        var2 = 2;
                    }
                    if (var2 == 1 && this.field601 > 0) {
                        this.method39(false, this.field601 - 1);
                    }
                    if (var2 != 2 || this.field601 <= 0) {
                        return;
                    }
                    this.method31(this.field211);
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(II)V")
    public final void method142(int arg0, int arg1) {
        if (arg0 >= 0) {
            this.field450 = !this.field450;
        }
        signlink.wavevol = arg1;
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(IILDNRIFKTO;)V")
    private final void method143(int arg0, int arg1, class11 arg2) {
        for (int var4 = 0; var4 < this.field560; ++var4) {
            int var5 = this.field561[var4];
            class10 var6 = this.field304[var5];
            int var7 = arg2.method189();
            if ((var7 & 8) != 0) {
                var6.field86 = arg2.method191();
                var6.field87 = arg2.method214(this.field594);
            }
            if ((var7 & 1) != 0) {
                int var8 = arg2.method206((byte) -35);
                int var9 = arg2.method206((byte) -35);
                var6.method23(var9, var8, field438, 16331);
                var6.field52 = field438 + 300;
                var6.field53 = arg2.method207((byte) 7);
                var6.field54 = arg2.method207((byte) 7);
            }
            if ((var7 & 16) != 0) {
                var6.field626 = class20.method273(arg2.method214(this.field594));
                var6.field68 = var6.field626.field751;
                var6.field85 = var6.field626.field742;
                var6.field55 = var6.field626.field752;
                var6.field56 = var6.field626.field744;
                var6.field57 = var6.field626.field745;
                var6.field58 = var6.field626.field770;
                var6.field66 = var6.field626.field768;
            }
            if ((var7 & 2) != 0) {
                var6.field59 = arg2.method216(0);
                int var10 = arg2.method224(360);
                var6.field63 = var10 >> 16;
                var6.field62 = (var10 & 65535) + field438;
                var6.field60 = 0;
                var6.field61 = 0;
                if (var6.field62 > field438) {
                    var6.field60 = -1;
                }
                if (var6.field59 == 65535) {
                    var6.field59 = -1;
                }
            }
            if ((var7 & 128) != 0) {
                int var11 = arg2.method208((byte) 97);
                int var12 = arg2.method189();
                var6.method23(var12, var11, field438, 16331);
                var6.field52 = field438 + 300;
                var6.field53 = arg2.method206((byte) -35);
                var6.field54 = arg2.method207((byte) 7);
            }
            if ((var7 & 32) != 0) {
                var6.field99 = arg2.method196();
                var6.field72 = 100;
            }
            if ((var7 & 4) != 0) {
                var6.field69 = arg2.method191();
                if (var6.field69 == 65535) {
                    var6.field69 = -1;
                }
            }
            if ((var7 & 64) != 0) {
                int var13 = arg2.method215(-998);
                if (var13 == 65535) {
                    var13 = -1;
                }
                int var14 = arg2.method206((byte) -35);
                if (var6.field90 == var13 && var13 != -1) {
                    int var15 = class71.field1727[var13].field1741;
                    if (var15 == 1) {
                        var6.field91 = 0;
                        var6.field92 = 0;
                        var6.field93 = var14;
                        var6.field94 = 0;
                    }
                    if (var15 == 2) {
                        var6.field94 = 0;
                    }
                } else if (var13 == -1 || var6.field90 == -1 || class71.field1727[var13].field1735 >= class71.field1727[var6.field90].field1735) {
                    var6.field90 = var13;
                    var6.field91 = 0;
                    var6.field92 = 0;
                    var6.field93 = var14;
                    var6.field94 = 0;
                    var6.field95 = var6.field83;
                }
            }
        }
        while (arg1 >= 0) {
            this.method93();
        }
    }

    @OriginalMember(owner = "client", name = "p", descriptor = "(B)V")
    public final void method144(byte arg0) {
        if (this.field520 != arg0) {
            this.field504 = null;
        }
        if (super.field919 == 1) {
            if (super.field920 >= 6 && super.field920 <= 106 && super.field921 >= 467 && super.field921 <= 499) {
                this.field576 = (this.field576 + 1) % 4;
                this.field308 = true;
                this.field205 = true;
                this.field213.method178(false, 235);
                this.field213.method179(this.field576);
                this.field213.method179(this.field373);
                this.field213.method179(this.field453);
            }
            if (super.field920 >= 135 && super.field920 <= 235 && super.field921 >= 467 && super.field921 <= 499) {
                this.field373 = (this.field373 + 1) % 3;
                this.field308 = true;
                this.field205 = true;
                this.field213.method178(false, 235);
                this.field213.method179(this.field576);
                this.field213.method179(this.field373);
                this.field213.method179(this.field453);
            }
            if (super.field920 >= 273 && super.field920 <= 373 && super.field921 >= 467 && super.field921 <= 499) {
                this.field453 = (this.field453 + 1) % 3;
                this.field308 = true;
                this.field205 = true;
                this.field213.method178(false, 235);
                this.field213.method179(this.field576);
                this.field213.method179(this.field373);
                this.field213.method179(this.field453);
            }
            if (super.field920 >= 412 && super.field920 <= 512 && super.field921 >= 467 && super.field921 <= 499) {
                if (this.field595 == -1) {
                    this.method152(-21279);
                    this.field327 = "";
                    this.field570 = false;
                    this.field503 = this.field595 = class30.field1024;
                    return;
                }
                this.method136((byte) 3, 0, "Please close the interface you have open before using 'report abuse'", "");
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        return signlink.mainapp != null ? signlink.mainapp.getAppletContext() : super.getAppletContext();
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;)V")
    private final void method145(String arg0) {
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

    @OriginalMember(owner = "client", name = "q", descriptor = "(B)V")
    public final void method146(byte arg0) {
        if (arg0 != 4) {
            this.field504 = null;
        }
        ++field234;
        if (field234 > 1849) {
            field234 = 0;
            this.field213.method178(false, 131);
            this.field213.method179(0);
            int var2 = this.field213.field643;
            this.field213.method180(2104);
            if ((int) (Math.random() * 2.0D) == 0) {
                this.field213.method179(178);
            }
            this.field213.method179(92);
            this.field213.method180(12175);
            if ((int) (Math.random() * 2.0D) == 0) {
                this.field213.method179(56);
            }
            this.field213.method179(255);
            this.field213.method180(19906);
            this.field213.method180(49688);
            this.field213.method180(30019);
            this.field213.method179(185);
            this.field213.method188(this.field213.field643 - var2, -122);
        }
        while (true) {
            int var3;
            do {
                while (true) {
                    var3 = this.method301(true);
                    if (var3 == -1) {
                        return;
                    }
                    if (this.field595 != -1 && this.field595 == this.field503) {
                        if (var3 == 8 && this.field327.length() > 0) {
                            this.field327 = this.field327.substring(0, this.field327.length() - 1);
                        }
                        break;
                    }
                    if (this.field436) {
                        if (var3 >= 32 && var3 <= 122 && this.field331.length() < 80) {
                            this.field331 = this.field331 + (char) var3;
                            this.field205 = true;
                        }
                        if (var3 == 8 && this.field331.length() > 0) {
                            this.field331 = this.field331.substring(0, this.field331.length() - 1);
                            this.field205 = true;
                        }
                        if (var3 == 13 || var3 == 10) {
                            this.field436 = false;
                            this.field205 = true;
                            if (this.field566 == 1) {
                                long var4 = class25.method278(this.field331);
                                this.method161(false, var4);
                            }
                            if (this.field566 == 2 && this.field298 > 0) {
                                long var6 = class25.method278(this.field331);
                                this.method129(var6, (byte) 37);
                            }
                            if (this.field566 == 3 && this.field331.length() > 0) {
                                this.field213.method178(false, 191);
                                this.field213.method179(0);
                                int var8 = this.field213.field643;
                                this.field213.method185((byte) 35, this.field451);
                                class50.method399(this.field331, true, this.field213);
                                this.field213.method188(this.field213.field643 - var8, -122);
                                this.field331 = class50.method400(false, this.field331);
                                this.field331 = class59.method472(false, this.field331);
                                this.method136((byte) 3, 6, this.field331, class25.method282(49845, class25.method279(this.field463, this.field451)));
                                if (this.field373 == 2) {
                                    this.field373 = 1;
                                    this.field308 = true;
                                    this.field213.method178(false, 235);
                                    this.field213.method179(this.field576);
                                    this.field213.method179(this.field373);
                                    this.field213.method179(this.field453);
                                }
                            }
                            if (this.field566 == 4 && this.field120 < 100) {
                                long var9 = class25.method278(this.field331);
                                this.method121(var9, 9);
                            }
                            if (this.field566 == 5 && this.field120 > 0) {
                                long var11 = class25.method278(this.field331);
                                this.method70(var11, false);
                            }
                        }
                    } else if (this.field502 == 1) {
                        if (var3 >= 48 && var3 <= 57 && this.field256.length() < 10) {
                            this.field256 = this.field256 + (char) var3;
                            this.field205 = true;
                        }
                        if (var3 == 8 && this.field256.length() > 0) {
                            this.field256 = this.field256.substring(0, this.field256.length() - 1);
                            this.field205 = true;
                        }
                        if (var3 == 13 || var3 == 10) {
                            if (this.field256.length() > 0) {
                                int var13 = 0;
                                try {
                                    var13 = Integer.parseInt(this.field256);
                                } catch (Exception var23) {
                                }
                                this.field213.method178(false, 102);
                                this.field213.method183(var13);
                            }
                            this.field502 = 0;
                            this.field205 = true;
                        }
                    } else if (this.field502 == 2) {
                        if (var3 >= 32 && var3 <= 122 && this.field256.length() < 12) {
                            this.field256 = this.field256 + (char) var3;
                            this.field205 = true;
                        }
                        if (var3 == 8 && this.field256.length() > 0) {
                            this.field256 = this.field256.substring(0, this.field256.length() - 1);
                            this.field205 = true;
                        }
                        if (var3 == 13 || var3 == 10) {
                            if (this.field256.length() > 0) {
                                this.field213.method178(false, 236);
                                this.field213.method185((byte) 35, class25.method278(this.field256));
                            }
                            this.field502 = 0;
                            this.field205 = true;
                        }
                    } else if (this.field585 == -1) {
                        if (var3 >= 32 && var3 <= 122 && this.field592.length() < 80) {
                            this.field592 = this.field592 + (char) var3;
                            this.field205 = true;
                        }
                        if (var3 == 8 && this.field592.length() > 0) {
                            this.field592 = this.field592.substring(0, this.field592.length() - 1);
                            this.field205 = true;
                        }
                        if ((var3 == 13 || var3 == 10) && this.field592.length() > 0) {
                            if (this.field573 == 2) {
                                if (this.field592.equals("::clientdrop")) {
                                    this.method132(43947);
                                }
                                if (this.field592.equals("::lag")) {
                                    this.method72(false);
                                }
                                if (this.field592.equals("::prefetchmusic")) {
                                    for (int var14 = 0; var14 < this.field154.method342(2, true); ++var14) {
                                        this.field154.method332(2, (byte) 1, 212, var14);
                                    }
                                }
                                if (this.field592.equals("::fpson")) {
                                    field119 = true;
                                }
                                if (this.field592.equals("::fpsoff")) {
                                    field119 = false;
                                }
                                if (this.field592.equals("::noclip")) {
                                    for (int var15 = 0; var15 < 4; ++var15) {
                                        for (int var16 = 1; var16 < 103; ++var16) {
                                            for (int var17 = 1; var17 < 103; ++var17) {
                                                this.field563[var15].field1523[var16][var17] = 0;
                                            }
                                        }
                                    }
                                }
                            }
                            if (this.field592.startsWith("::")) {
                                this.field213.method178(false, 255);
                                this.field213.method179(this.field592.length() - 1);
                                this.field213.method186(this.field592.substring(2));
                            } else {
                                String var18 = this.field592.toLowerCase();
                                byte var19 = 0;
                                if (var18.startsWith("yellow:")) {
                                    var19 = 0;
                                    this.field592 = this.field592.substring(7);
                                } else if (var18.startsWith("red:")) {
                                    var19 = 1;
                                    this.field592 = this.field592.substring(4);
                                } else if (var18.startsWith("green:")) {
                                    var19 = 2;
                                    this.field592 = this.field592.substring(6);
                                } else if (var18.startsWith("cyan:")) {
                                    var19 = 3;
                                    this.field592 = this.field592.substring(5);
                                } else if (var18.startsWith("purple:")) {
                                    var19 = 4;
                                    this.field592 = this.field592.substring(7);
                                } else if (var18.startsWith("white:")) {
                                    var19 = 5;
                                    this.field592 = this.field592.substring(6);
                                } else if (var18.startsWith("flash1:")) {
                                    var19 = 6;
                                    this.field592 = this.field592.substring(7);
                                } else if (var18.startsWith("flash2:")) {
                                    var19 = 7;
                                    this.field592 = this.field592.substring(7);
                                } else if (var18.startsWith("flash3:")) {
                                    var19 = 8;
                                    this.field592 = this.field592.substring(7);
                                } else if (var18.startsWith("glow1:")) {
                                    var19 = 9;
                                    this.field592 = this.field592.substring(6);
                                } else if (var18.startsWith("glow2:")) {
                                    var19 = 10;
                                    this.field592 = this.field592.substring(6);
                                } else if (var18.startsWith("glow3:")) {
                                    var19 = 11;
                                    this.field592 = this.field592.substring(6);
                                }
                                String var20 = this.field592.toLowerCase();
                                byte var21 = 0;
                                if (var20.startsWith("wave:")) {
                                    var21 = 1;
                                    this.field592 = this.field592.substring(5);
                                } else if (var20.startsWith("wave2:")) {
                                    var21 = 2;
                                    this.field592 = this.field592.substring(6);
                                } else if (var20.startsWith("shake:")) {
                                    var21 = 3;
                                    this.field592 = this.field592.substring(6);
                                } else if (var20.startsWith("scroll:")) {
                                    var21 = 4;
                                    this.field592 = this.field592.substring(7);
                                } else if (var20.startsWith("slide:")) {
                                    var21 = 5;
                                    this.field592 = this.field592.substring(6);
                                }
                                this.field213.method178(false, 115);
                                this.field213.method179(0);
                                int var22 = this.field213.field643;
                                this.field213.method205(var19, 6);
                                this.field303.field643 = 0;
                                class50.method399(this.field592, true, this.field303);
                                this.field213.method225(this.field303.field643, this.field303.field642, 368, 0);
                                this.field213.method205(var21, 6);
                                this.field213.method188(this.field213.field643 - var22, -122);
                                this.field592 = class50.method400(false, this.field592);
                                this.field592 = class59.method472(false, this.field592);
                                field276.field99 = this.field592;
                                field276.field64 = var19;
                                field276.field70 = var21;
                                field276.field72 = 150;
                                if (this.field573 == 2) {
                                    this.method136((byte) 3, 2, field276.field99, "@cr2@" + field276.field805);
                                } else if (this.field573 == 1) {
                                    this.method136((byte) 3, 2, field276.field99, "@cr1@" + field276.field805);
                                } else {
                                    this.method136((byte) 3, 2, field276.field99, field276.field805);
                                }
                                if (this.field576 == 2) {
                                    this.field576 = 3;
                                    this.field308 = true;
                                    this.field213.method178(false, 235);
                                    this.field213.method179(this.field576);
                                    this.field213.method179(this.field373);
                                    this.field213.method179(this.field453);
                                }
                            }
                            this.field592 = "";
                            this.field205 = true;
                        }
                    }
                }
            } while ((var3 < 97 || var3 > 122) && (var3 < 65 || var3 > 90) && (var3 < 48 || var3 > 57) && var3 != 32);
            if (this.field327.length() < 12) {
                this.field327 = this.field327 + (char) var3;
            }
        }
    }

    @OriginalMember(owner = "client", name = "r", descriptor = "(B)V")
    private final void method147(byte arg0) {
        if (arg0 != 72) {
            this.method93();
        }
        if (this.field577 == 2) {
            for (class67 var2 = (class67) this.field257.method592(); var2 != null; var2 = (class67) this.field257.method594(-314)) {
                if (var2.field1633 > 0) {
                    --var2.field1633;
                }
                if (var2.field1633 == 0) {
                    if (var2.field1630 < 0 || class41.method370(var2.field1632, var2.field1630, 0)) {
                        this.method64(true, var2.field1632, var2.field1637, var2.field1636, var2.field1631, var2.field1635, var2.field1638, var2.field1630);
                        var2.method1();
                    }
                } else {
                    if (var2.field1634 > 0) {
                        --var2.field1634;
                    }
                    if (var2.field1634 == 0 && var2.field1637 >= 1 && var2.field1638 >= 1 && var2.field1637 <= 102 && var2.field1638 <= 102 && (var2.field1639 < 0 || class41.method370(var2.field1641, var2.field1639, 0))) {
                        this.method64(true, var2.field1641, var2.field1637, var2.field1636, var2.field1640, var2.field1635, var2.field1638, var2.field1639);
                        var2.field1634 = -1;
                        if (var2.field1639 == var2.field1630 && var2.field1630 == -1) {
                            var2.method1();
                        } else if (var2.field1639 == var2.field1630 && var2.field1640 == var2.field1631 && var2.field1641 == var2.field1632) {
                            var2.method1();
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(III)Ljava/lang/String;")
    public static final String method148(int arg0, int arg1, int arg2) {
        if (arg2 != 3) {
            field177 = 434;
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

    @OriginalMember(owner = "client", name = "a", descriptor = "(IILXANVNPIN;B)V")
    public final void method149(int arg0, int arg1, class65 arg2, byte arg3) {
        if (arg3 == -59) {
            int var5 = arg0 * arg0 + arg1 * arg1;
            if (var5 > 4225 && var5 < 90000) {
                int var6 = this.field465 + this.field207 & 2047;
                int var7 = class55.field1401[var6];
                int var8 = class55.field1402[var6];
                int var9 = var7 * 256 / (this.field547 + 256);
                int var10 = var8 * 256 / (this.field547 + 256);
                int var11 = arg0 * var9 + arg1 * var10 >> 16;
                int var12 = arg0 * var10 - arg1 * var9 >> 16;
                double var13 = Math.atan2((double) var11, (double) var12);
                int var15 = (int) (Math.sin(var13) * 63.0D);
                int var16 = (int) (Math.cos(var13) * 57.0D);
                this.field574.method534(256, 15, 15, var15 + 94 + 4 - 10, 83 - var16 - 20, (byte) 21, var13, 20, 20);
            } else {
                this.method77(true, arg2, arg0, arg1);
            }
        }
    }

    @OriginalMember(owner = "client", name = "s", descriptor = "(B)V")
    public final void method150(byte arg0) {
        if (this.field135 == arg0) {
            try {
                int var2 = field276.field102 + this.field280;
                int var3 = field276.field103 + this.field165;
                if (this.field476 - var2 < -500 || this.field476 - var2 > 500 || this.field477 - var3 < -500 || this.field477 - var3 > 500) {
                    this.field476 = var2;
                    this.field477 = var3;
                }
                if (this.field476 != var2) {
                    this.field476 += (var2 - this.field476) / 16;
                }
                if (this.field477 != var3) {
                    this.field477 += (var3 - this.field477) / 16;
                }
                if (super.field923[1] == 1) {
                    this.field208 += (-24 - this.field208) / 2;
                } else if (super.field923[2] == 1) {
                    this.field208 += (24 - this.field208) / 2;
                } else {
                    this.field208 /= 2;
                }
                if (super.field923[3] == 1) {
                    this.field209 += (12 - this.field209) / 2;
                } else if (super.field923[4] == 1) {
                    this.field209 += (-12 - this.field209) / 2;
                } else {
                    this.field209 /= 2;
                }
                this.field207 = this.field208 / 2 + this.field207 & 2047;
                this.field206 += this.field209 / 2;
                if (this.field206 < 128) {
                    this.field206 = 128;
                }
                if (this.field206 > 383) {
                    this.field206 = 383;
                }
                int var4 = this.field476 >> 7;
                int var5 = this.field477 >> 7;
                int var6 = this.method83(this.field326, true, this.field476, this.field477);
                int var7 = 0;
                if (var4 > 3 && var5 > 3 && var4 < 100 && var5 < 100) {
                    for (int var8 = var4 - 4; var8 <= var4 + 4; ++var8) {
                        for (int var9 = var5 - 4; var9 <= var5 + 4; ++var9) {
                            int var10 = this.field326;
                            if (var10 < 3 && (this.field418[1][var8][var9] & 2) == 2) {
                                ++var10;
                            }
                            int var11 = var6 - this.field419[var10][var8][var9];
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
                if (var12 > this.field233) {
                    this.field233 += (var12 - this.field233) / 24;
                } else if (var12 < this.field233) {
                    this.field233 += (var12 - this.field233) / 80;
                }
            } catch (Exception var13) {
                signlink.reporterror("glfc_ex " + field276.field102 + "," + field276.field103 + "," + this.field476 + "," + this.field477 + "," + this.field360 + "," + this.field361 + "," + this.field322 + "," + this.field323);
                throw new RuntimeException("eek");
            }
        }
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(II)Ljava/lang/String;")
    private static final String method151(int arg0, int arg1) {
        if (field541 != arg1) {
            throw new NullPointerException();
        } else if (arg0 < 100000) {
            return String.valueOf(arg0);
        } else {
            return arg0 < 10000000 ? arg0 / 1000 + "K" : arg0 / 1000000 + "M";
        }
    }

    @OriginalMember(owner = "client", name = "A", descriptor = "(I)V")
    public final void method152(int arg0) {
        if (arg0 != -21279) {
            this.field213.method179(80);
        }
        this.field213.method178(false, 36);
        if (this.field342 != -1) {
            this.method135(-10386, this.field342);
            this.field342 = -1;
            this.field372 = true;
            this.field587 = false;
            this.field258 = true;
        }
        if (this.field585 != -1) {
            this.method135(-10386, this.field585);
            this.field585 = -1;
            this.field205 = true;
            this.field587 = false;
        }
        if (this.field584 != -1) {
            this.method135(-10386, this.field584);
            this.field584 = -1;
            this.field379 = true;
        }
        if (this.field595 != -1) {
            this.method135(-10386, this.field595);
            this.field595 = -1;
        }
    }

    @OriginalMember(owner = "client", name = "B", descriptor = "(I)I")
    public final int method153(int arg0) {
        if (arg0 != 17835) {
            this.method93();
        }
        int var2 = 3;
        if (this.field349 < 310) {
            int var3 = this.field346 >> 7;
            int var4 = this.field348 >> 7;
            int var5 = field276.field102 >> 7;
            int var6 = field276.field103 >> 7;
            if ((this.field418[this.field326][var3][var4] & 4) != 0) {
                var2 = this.field326;
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
                    if ((this.field418[this.field326][var3][var4] & 4) != 0) {
                        var2 = this.field326;
                    }
                    var10 += var9;
                    if (var10 >= 65536) {
                        var10 -= 65536;
                        if (var4 < var6) {
                            ++var4;
                        } else if (var4 > var6) {
                            --var4;
                        }
                        if ((this.field418[this.field326][var3][var4] & 4) != 0) {
                            var2 = this.field326;
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
                    if ((this.field418[this.field326][var3][var4] & 4) != 0) {
                        var2 = this.field326;
                    }
                    var12 += var11;
                    if (var12 >= 65536) {
                        var12 -= 65536;
                        if (var3 < var5) {
                            ++var3;
                        } else if (var3 > var5) {
                            --var3;
                        }
                        if ((this.field418[this.field326][var3][var4] & 4) != 0) {
                            var2 = this.field326;
                        }
                    }
                }
            }
        }
        if ((this.field418[this.field326][field276.field102 >> 7][field276.field103 >> 7] & 4) != 0) {
            var2 = this.field326;
        }
        return var2;
    }

    @OriginalMember(owner = "client", name = "t", descriptor = "(B)I")
    public final int method154(byte arg0) {
        if (arg0 != 46) {
            this.field485 = -456;
        }
        int var2 = this.method83(this.field326, true, this.field346, this.field348);
        return var2 - this.field347 < 800 && (this.field418[this.field326][this.field346 >> 7][this.field348 >> 7] & 4) != 0 ? this.field326 : 3;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IBLDNRIFKTO;)V")
    private final void method155(int arg0, byte arg1, class11 arg2) {
        while (true) {
            if (arg2.field644 + 21 < arg0 * 8) {
                int var4 = arg2.method200(5, 14);
                if (var4 != 16383) {
                    if (this.field304[var4] == null) {
                        this.field304[var4] = new class10();
                    }
                    class10 var5 = this.field304[var4];
                    this.field306[this.field305++] = var4;
                    var5.field71 = field438;
                    int var6 = arg2.method200(5, 5);
                    if (var6 > 15) {
                        var6 -= 32;
                    }
                    int var7 = arg2.method200(5, 1);
                    if (var7 == 1) {
                        this.field561[this.field560++] = var4;
                    }
                    int var8 = arg2.method200(5, 1);
                    int var9 = arg2.method200(5, 5);
                    if (var9 > 15) {
                        var9 -= 32;
                    }
                    var5.field626 = class20.method273(arg2.method200(5, 12));
                    var5.field68 = var5.field626.field751;
                    var5.field85 = var5.field626.field742;
                    var5.field55 = var5.field626.field752;
                    var5.field56 = var5.field626.field744;
                    var5.field57 = var5.field626.field745;
                    var5.field58 = var5.field626.field770;
                    var5.field66 = var5.field626.field768;
                    var5.method22(field276.field89[0] + var9, field276.field88[0] + var6, var8 == 1, -824);
                    continue;
                }
            }
            arg2.method201(0);
            if (arg1 == 1) {
                boolean var10 = false;
                return;
            }
            return;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIZ)V")
    public final void method156(int arg0, int arg1, boolean arg2) {
        int var4 = 0;
        for (int var5 = 0; var5 < 100; ++var5) {
            if (this.field357[var5] != null) {
                int var6 = this.field355[var5];
                int var7 = 70 - var4 * 14 + this.field474 + 4;
                if (var7 < -20) {
                    break;
                }
                String var8 = this.field356[var5];
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
                if ((var6 == 1 || var6 == 2) && (var6 == 1 || this.field576 == 0 || this.field576 == 1 && this.method99(var8, (byte) 4))) {
                    if (arg1 > var7 - 14 && arg1 <= var7 && !var8.equals(field276.field805)) {
                        if (this.field573 >= 1) {
                            this.field314[this.field601] = "Report abuse @whi@" + var8;
                            this.field429[this.field601] = 208;
                            ++this.field601;
                        }
                        this.field314[this.field601] = "Add ignore @whi@" + var8;
                        this.field429[this.field601] = 64;
                        ++this.field601;
                        this.field314[this.field601] = "Add friend @whi@" + var8;
                        this.field429[this.field601] = 723;
                        ++this.field601;
                    }
                    ++var4;
                }
                if ((var6 == 3 || var6 == 7) && this.field352 == 0 && (var6 == 7 || this.field373 == 0 || this.field373 == 1 && this.method99(var8, (byte) 4))) {
                    if (arg1 > var7 - 14 && arg1 <= var7) {
                        if (this.field573 >= 1) {
                            this.field314[this.field601] = "Report abuse @whi@" + var8;
                            this.field429[this.field601] = 208;
                            ++this.field601;
                        }
                        this.field314[this.field601] = "Add ignore @whi@" + var8;
                        this.field429[this.field601] = 64;
                        ++this.field601;
                        this.field314[this.field601] = "Add friend @whi@" + var8;
                        this.field429[this.field601] = 723;
                        ++this.field601;
                    }
                    ++var4;
                }
                if (var6 == 4 && (this.field453 == 0 || this.field453 == 1 && this.method99(var8, (byte) 4))) {
                    if (arg1 > var7 - 14 && arg1 <= var7) {
                        this.field314[this.field601] = "Accept trade @whi@" + var8;
                        this.field429[this.field601] = 65;
                        ++this.field601;
                    }
                    ++var4;
                }
                if ((var6 == 5 || var6 == 6) && this.field352 == 0 && this.field373 < 2) {
                    ++var4;
                }
                if (var6 == 8 && (this.field453 == 0 || this.field453 == 1 && this.method99(var8, (byte) 4))) {
                    if (arg1 > var7 - 14 && arg1 <= var7) {
                        this.field314[this.field601] = "Accept challenge @whi@" + var8;
                        this.field429[this.field601] = 426;
                        ++this.field601;
                    }
                    ++var4;
                }
            }
        }
        if (arg2) {
            this.field164 = this.field460.method256();
        }
    }

    @OriginalMember(owner = "client", name = "C", descriptor = "(I)Ljava/lang/String;")
    public final String method157(int arg0) {
        this.field149 += arg0;
        if (signlink.mainapp != null) {
            return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
        } else {
            return super.field908 != null ? "runescape.com" : super.getDocumentBase().getHost().toLowerCase();
        }
    }

    @OriginalMember(owner = "client", name = "q", descriptor = "(Z)V")
    public final void method158(boolean arg0) {
        if (!arg0) {
            byte[] var2 = this.field202.method246("title.dat", (byte[]) null);
            class65 var3 = new class65(var2, this);
            this.field243.method455(0);
            var3.method527((byte) 1, 0, 0);
            this.field244.method455(0);
            var3.method527((byte) 1, -637, 0);
            this.field240.method455(0);
            var3.method527((byte) 1, -128, 0);
            this.field241.method455(0);
            var3.method527((byte) 1, -202, -371);
            this.field242.method455(0);
            var3.method527((byte) 1, -202, -171);
            this.field245.method455(0);
            var3.method527((byte) 1, 0, -265);
            this.field246.method455(0);
            var3.method527((byte) 1, -562, -265);
            this.field247.method455(0);
            var3.method527((byte) 1, -128, -171);
            this.field248.method455(0);
            var3.method527((byte) 1, -562, -171);
            int[] var4 = new int[var3.field1621];
            for (int var5 = 0; var5 < var3.field1622; ++var5) {
                for (int var10 = 0; var10 < var3.field1621; ++var10) {
                    var4[var10] = var3.field1620[var3.field1621 * var5 + (var3.field1621 - var10 - 1)];
                }
                for (int var11 = 0; var11 < var3.field1621; ++var11) {
                    var3.field1620[var3.field1621 * var5 + var11] = var4[var11];
                }
            }
            this.field243.method455(0);
            var3.method527((byte) 1, 382, 0);
            this.field244.method455(0);
            var3.method527((byte) 1, -255, 0);
            this.field240.method455(0);
            var3.method527((byte) 1, 254, 0);
            this.field241.method455(0);
            var3.method527((byte) 1, 180, -371);
            this.field242.method455(0);
            var3.method527((byte) 1, 180, -171);
            this.field245.method455(0);
            var3.method527((byte) 1, 382, -265);
            this.field246.method455(0);
            var3.method527((byte) 1, -180, -265);
            this.field247.method455(0);
            var3.method527((byte) 1, 254, -171);
            this.field248.method455(0);
            var3.method527((byte) 1, -180, -171);
            class65 var6 = new class65(this.field202, "logo", 0);
            this.field240.method455(0);
            var6.method529((byte) 50, 382 - var6.field1621 / 2 - 128, 18);
            Object var7 = null;
            Object var8 = null;
            Object var9 = null;
            System.gc();
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(IIIIII)V")
    public final void method159(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = this.field121.method564(arg5, arg1, arg2);
        if (var7 != 0) {
            int var8 = this.field121.method568(arg5, arg1, arg2, var7);
            int var9 = var8 >> 6 & 3;
            int var10 = var8 & 31;
            int var11 = arg4;
            if (var7 > 0) {
                var11 = arg3;
            }
            int[] var12 = this.field426.field1620;
            int var13 = (103 - arg2) * 512 * 4 + arg1 * 4 + 24624;
            int var14 = var7 >> 14 & 32767;
            class56 var15 = class56.method445(var14);
            if (var15.field1445 != -1) {
                class47 var16 = this.field565[var15.field1445];
                if (var16 != null) {
                    int var17 = (var15.field1427 * 4 - var16.field1269) / 2;
                    int var18 = (var15.field1426 * 4 - var16.field1270) / 2;
                    var16.method390((byte) 50, arg1 * 4 + 48 + var17, (104 - arg2 - var15.field1426) * 4 + 48 + var18);
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
        int var19 = this.field121.method566(arg5, arg1, arg2);
        if (var19 != 0) {
            int var20 = this.field121.method568(arg5, arg1, arg2, var19);
            int var21 = var20 >> 6 & 3;
            int var22 = var20 & 31;
            int var23 = var19 >> 14 & 32767;
            class56 var24 = class56.method445(var23);
            if (var24.field1445 != -1) {
                class47 var25 = this.field565[var24.field1445];
                if (var25 != null) {
                    int var26 = (var24.field1427 * 4 - var25.field1269) / 2;
                    int var27 = (var24.field1426 * 4 - var25.field1270) / 2;
                    var25.method390((byte) 50, arg1 * 4 + 48 + var26, (104 - arg2 - var24.field1426) * 4 + 48 + var27);
                }
            } else if (var22 == 9) {
                int var28 = 15658734;
                if (var19 > 0) {
                    var28 = 15597568;
                }
                int[] var29 = this.field426.field1620;
                int var30 = (103 - arg2) * 512 * 4 + arg1 * 4 + 24624;
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
        int var31 = this.field121.method567(arg5, arg1, arg2);
        if (arg0 < 3 || arg0 > 3) {
            this.field450 = !this.field450;
        }
        if (var31 != 0) {
            int var32 = var31 >> 14 & 32767;
            class56 var33 = class56.method445(var32);
            if (var33.field1445 != -1) {
                class47 var34 = this.field565[var33.field1445];
                if (var34 != null) {
                    int var35 = (var33.field1427 * 4 - var34.field1269) / 2;
                    int var36 = (var33.field1426 * 4 - var34.field1270) / 2;
                    var34.method390((byte) 50, arg1 * 4 + 48 + var35, (104 - arg2 - var33.field1426) * 4 + 48 + var36);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "run", descriptor = "()V")
    public final void run() {
        if (this.field262) {
            this.method94(false);
        } else {
            super.run();
        }
    }

    @OriginalMember(owner = "client", name = "D", descriptor = "(I)V")
    public final void method160(int arg0) {
        if (arg0 != 45696) {
            this.field213.method179(243);
        }
        if (this.field470 == 0) {
            if (super.field919 == 1) {
                int var2 = super.field920 - 25 - 550;
                int var3 = super.field921 - 5 - 4;
                if (var2 >= 0 && var3 >= 0 && var2 < 146 && var3 < 151) {
                    var2 -= 73;
                    var3 -= 75;
                    int var4 = this.field465 + this.field207 & 2047;
                    int var5 = class4.field34[var4];
                    int var6 = class4.field35[var4];
                    int var7 = (this.field547 + 256) * var5 >> 8;
                    int var8 = (this.field547 + 256) * var6 >> 8;
                    int var9 = var2 * var8 + var3 * var7 >> 11;
                    int var10 = var3 * var8 - var2 * var7 >> 11;
                    int var11 = field276.field102 + var9 >> 7;
                    int var12 = field276.field103 - var10 >> 7;
                    boolean var13 = this.method46(field276.field89[0], 0, true, var11, 0, var12, 0, 0, -36, 0, field276.field88[0], 1);
                    if (var13) {
                        this.field213.method179(var2);
                        this.field213.method179(var3);
                        this.field213.method180(this.field207);
                        this.field213.method179(57);
                        this.field213.method179(this.field465);
                        this.field213.method179(this.field547);
                        this.field213.method179(89);
                        this.field213.method180(field276.field102);
                        this.field213.method180(field276.field103);
                        this.field213.method179(this.field461);
                        this.field213.method179(63);
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZJ)V")
    public final void method161(boolean arg0, long arg1) {
        if (arg1 != 0L) {
            if (this.field298 >= 100 && this.field296 != 1) {
                this.method136((byte) 3, 0, "Your friendlist is full. Max of 100 for free users, and 200 for members", "");
            } else if (this.field298 >= 200) {
                this.method136((byte) 3, 0, "Your friendlist is full. Max of 100 for free users, and 200 for members", "");
            } else {
                String var4 = class25.method282(49845, class25.method279(this.field463, arg1));
                for (int var5 = 0; var5 < this.field298; ++var5) {
                    if (this.field311[var5] == arg1) {
                        this.method136((byte) 3, 0, var4 + " is already on your friend list", "");
                        return;
                    }
                }
                for (int var6 = 0; var6 < this.field120; ++var6) {
                    if (this.field367[var6] == arg1) {
                        this.method136((byte) 3, 0, "Please remove " + var4 + " from your ignore list first", "");
                        return;
                    }
                }
                if (!var4.equals(field276.field805)) {
                    this.field134[this.field298] = var4;
                    this.field311[this.field298] = arg1;
                    this.field484[this.field298] = 0;
                    ++this.field298;
                    this.field372 = true;
                    this.field213.method178(false, 70);
                    if (arg0) {
                        field541 = this.field460.method256();
                    }
                    this.field213.method185((byte) 35, arg1);
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(Ljava/lang/String;)Ljava/io/DataInputStream;")
    public final DataInputStream method162(String arg0) throws IOException {
        if (!this.field157) {
            return signlink.mainapp != null ? signlink.openurl(arg0) : new DataInputStream((new URL(this.getCodeBase(), arg0)).openStream());
        } else {
            if (this.field292 != null) {
                try {
                    this.field292.close();
                } catch (Exception var4) {
                }
                this.field292 = null;
            }
            this.field292 = this.method29(43595);
            this.field292.setSoTimeout(10000);
            InputStream var2 = this.field292.getInputStream();
            OutputStream var3 = this.field292.getOutputStream();
            var3.write(("JAGGRAB /" + arg0 + "\n\n").getBytes());
            return new DataInputStream(var2);
        }
    }

    @OriginalMember(owner = "client", name = "u", descriptor = "(B)V")
    public final void method163(byte arg0) {
        if (arg0 != 73) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        if (this.field293 == 0) {
            int var3 = super.field903 / 2 - 80;
            int var4 = super.field904 / 2 + 20;
            int var15 = var4 + 20;
            if (super.field919 == 1 && super.field920 >= var3 - 75 && super.field920 <= var3 + 75 && super.field921 >= var15 - 20 && super.field921 <= var15 + 20) {
                this.field293 = 3;
                this.field569 = 0;
            }
            int var5 = super.field903 / 2 + 80;
            if (super.field919 == 1 && super.field920 >= var5 - 75 && super.field920 <= var5 + 75 && super.field921 >= var15 - 20 && super.field921 <= var15 + 20) {
                this.field480 = "";
                this.field481 = "Enter your username & password.";
                this.field293 = 2;
                this.field569 = 0;
            }
        } else if (this.field293 == 2) {
            int var6 = super.field904 / 2 - 40;
            int var16 = var6 + 30;
            int var17 = var16 + 25;
            if (super.field919 == 1 && super.field921 >= var17 - 15 && super.field921 < var17) {
                this.field569 = 0;
            }
            var6 = var17 + 15;
            if (super.field919 == 1 && super.field921 >= var6 - 15 && super.field921 < var6) {
                this.field569 = 1;
            }
            var6 += 15;
            int var7 = super.field903 / 2 - 80;
            int var8 = super.field904 / 2 + 50;
            int var18 = var8 + 20;
            if (super.field919 == 1 && super.field920 >= var7 - 75 && super.field920 <= var7 + 75 && super.field921 >= var18 - 20 && super.field921 <= var18 + 20) {
                this.field397 = 0;
                this.method41(this.field294, this.field295, false);
                if (this.field528) {
                    return;
                }
            }
            int var9 = super.field903 / 2 + 80;
            if (super.field919 == 1 && super.field920 >= var9 - 75 && super.field920 <= var9 + 75 && super.field921 >= var18 - 20 && super.field921 <= var18 + 20) {
                this.field293 = 0;
                this.field294 = "";
                this.field295 = "";
            }
            while (true) {
                while (true) {
                    int var10 = this.method301(true);
                    if (var10 == -1) {
                        return;
                    }
                    boolean var11 = false;
                    for (int var12 = 0; var12 < field254.length(); ++var12) {
                        if (var10 == field254.charAt(var12)) {
                            var11 = true;
                            break;
                        }
                    }
                    if (this.field569 == 0) {
                        if (var10 == 8 && this.field294.length() > 0) {
                            this.field294 = this.field294.substring(0, this.field294.length() - 1);
                        }
                        if (var10 == 9 || var10 == 10 || var10 == 13) {
                            this.field569 = 1;
                        }
                        if (var11) {
                            this.field294 = this.field294 + (char) var10;
                        }
                        if (this.field294.length() > 12) {
                            this.field294 = this.field294.substring(0, 12);
                        }
                    } else if (this.field569 == 1) {
                        if (var10 == 8 && this.field295.length() > 0) {
                            this.field295 = this.field295.substring(0, this.field295.length() - 1);
                        }
                        if (var10 == 9 || var10 == 10 || var10 == 13) {
                            this.field569 = 0;
                        }
                        if (var11) {
                            this.field295 = this.field295 + (char) var10;
                        }
                        if (this.field295.length() > 20) {
                            this.field295 = this.field295.substring(0, 20);
                        }
                    }
                }
            }
        } else {
            if (this.field293 == 3) {
                int var13 = super.field903 / 2;
                int var14 = super.field904 / 2 + 50;
                int var19 = var14 + 20;
                if (super.field919 == 1 && super.field920 >= var13 - 75 && super.field920 <= var13 + 75 && super.field921 >= var19 - 20 && super.field921 <= var19 + 20) {
                    this.field293 = 0;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZI[B)V")
    public final void method164(boolean arg0, int arg1, byte[] arg2) {
        if (this.field508) {
            signlink.midifade = arg0 ? 1 : 0;
            signlink.midisave(arg2, arg2.length);
            if (arg1 > 0) {
                ;
            }
        }
    }

    @OriginalMember(owner = "client", name = "E", descriptor = "(I)V")
    public final void method165(int arg0) {
        this.field435 = false;
        while (this.field423) {
            this.field435 = false;
            try {
                Thread.sleep(50L);
            } catch (Exception var2) {
            }
        }
        this.field200 = null;
        this.field201 = null;
        this.field545 = null;
        this.field173 = null;
        this.field174 = null;
        this.field175 = null;
        if (arg0 != 0) {
            this.field261 = -186;
        }
        this.field176 = null;
        this.field125 = null;
        this.field126 = null;
        this.field420 = null;
        this.field421 = null;
        this.field161 = null;
        this.field162 = null;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIB)Z")
    public final boolean method166(int arg0, int arg1, byte arg2) {
        boolean var4 = false;
        if (arg2 != -5) {
            field500 = !field500;
        }
        class30 var5 = class30.method316(arg1);
        for (int var6 = 0; var6 < var5.field986.length && var5.field986[var6] != -1; ++var6) {
            class30 var7 = class30.method316(var5.field986[var6]);
            if (var7.field1005 == 1) {
                var4 |= this.method166(arg0, var7.field996, (byte) -5);
            }
            if (var7.field1005 == 6 && (var7.field958 != -1 || var7.field959 != -1)) {
                boolean var8 = this.method91(var7, (byte) 5);
                int var9;
                if (var8) {
                    var9 = var7.field959;
                } else {
                    var9 = var7.field958;
                }
                if (var9 != -1) {
                    class71 var10 = class71.field1727[var9];
                    var7.field966 += arg0;
                    while (var7.field966 > var10.method598(var7.field993, -818)) {
                        var7.field966 -= var10.method598(var7.field993, -818) + 1;
                        ++var7.field993;
                        if (var7.field993 >= var10.field1728) {
                            var7.field993 -= var10.field1732;
                            if (var7.field993 < 0 || var7.field993 >= var10.field1728) {
                                var7.field993 = 0;
                            }
                        }
                        var4 = true;
                    }
                }
            }
            if (var7.field1005 == 6 && var7.field999 != 0) {
                int var11 = var7.field999 >> 16;
                int var12 = var7.field999 << 16 >> 16;
                int var13 = arg0 * var11;
                int var14 = arg0 * var12;
                var7.field969 = var7.field969 + var13 & 2047;
                var7.field970 = var7.field970 + var14 & 2047;
                var4 = true;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILLUAMUNXO;I)I")
    public final int method167(int arg0, class30 arg1, int arg2) {
        while (arg2 >= 0) {
            this.method93();
        }
        if (arg1.field1025 != null && arg0 < arg1.field1025.length) {
            try {
                int[] var4 = arg1.field1025[arg0];
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
                        var9 = this.field544[var4[var6++]];
                    }
                    if (var8 == 2) {
                        var9 = this.field546[var4[var6++]];
                    }
                    if (var8 == 3) {
                        var9 = this.field341[var4[var6++]];
                    }
                    if (var8 == 4) {
                        class30 var11 = class30.method316(var4[var6++]);
                        int var12 = var4[var6++];
                        if (var12 >= 0 && var12 < class26.field887 && (!class26.method293(var12).field867 || field285)) {
                            for (int var13 = 0; var13 < var11.field956.length; ++var13) {
                                if (var12 + 1 == var11.field956[var13]) {
                                    var9 += var11.field1032[var13];
                                }
                            }
                        }
                    }
                    if (var8 == 5) {
                        var9 = this.field588[var4[var6++]];
                    }
                    if (var8 == 6) {
                        var9 = field394[this.field546[var4[var6++]] - 1];
                    }
                    if (var8 == 7) {
                        var9 = this.field588[var4[var6++]] * 100 / 46875;
                    }
                    if (var8 == 8) {
                        var9 = field276.field800;
                    }
                    if (var8 == 9) {
                        for (int var14 = 0; var14 < class6.field105; ++var14) {
                            if (class6.field107[var14]) {
                                var9 += this.field546[var14];
                            }
                        }
                    }
                    if (var8 == 10) {
                        class30 var15 = class30.method316(var4[var6++]);
                        int var16 = var4[var6++] + 1;
                        if (var16 >= 0 && var16 < class26.field887 && (!class26.method293(var16).field867 || field285)) {
                            for (int var17 = 0; var17 < var15.field956.length; ++var17) {
                                if (var15.field956[var17] == var16) {
                                    var9 = 999999999;
                                    break;
                                }
                            }
                        }
                    }
                    if (var8 == 11) {
                        var9 = this.field188;
                    }
                    if (var8 == 12) {
                        var9 = this.field226;
                    }
                    if (var8 == 13) {
                        int var18 = this.field588[var4[var6++]];
                        int var19 = var4[var6++];
                        var9 = (var18 & 1 << var19) != 0 ? 1 : 0;
                    }
                    if (var8 == 14) {
                        int var20 = var4[var6++];
                        class31 var21 = class31.field1035[var20];
                        int var22 = var21.field1037;
                        int var23 = var21.field1038;
                        int var24 = var21.field1039;
                        int var25 = field554[var24 - var23];
                        var9 = this.field588[var22] >> var23 & var25;
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
                        var9 = (field276.field102 >> 7) + this.field322;
                    }
                    if (var8 == 19) {
                        var9 = (field276.field103 >> 7) + this.field323;
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

    @OriginalMember(owner = "client", name = "F", descriptor = "(I)V")
    public final void method168(int arg0) {
        int var2 = 84 / arg0;
        while (true) {
            class8 var3 = this.field154.method333();
            if (var3 == null) {
                return;
            }
            if (var3.field613 == 0) {
                class55.method416(var3.field610, var3.field611, (byte) 0);
                if ((this.field154.method338(-30035, var3.field610) & 98) != 0) {
                    this.field372 = true;
                    if (this.field585 != -1 || this.field194 != -1) {
                        this.field205 = true;
                    }
                }
            }
            if (var3.field613 == 1 && var3.field611 != null) {
                class39.method353(0, var3.field611);
            }
            if (var3.field613 == 2 && this.field131 == var3.field610 && var3.field611 != null) {
                this.method164(this.field132, 157, var3.field611);
            }
            if (var3.field613 == 3 && this.field577 == 1) {
                for (int var4 = 0; var4 < this.field457.length; ++var4) {
                    if (this.field270[var4] == var3.field610) {
                        this.field457[var4] = var3.field611;
                        if (var3.field611 == null) {
                            this.field270[var4] = -1;
                        }
                        break;
                    }
                    if (this.field271[var4] == var3.field610) {
                        this.field454[var4] = var3.field611;
                        if (var3.field611 == null) {
                            this.field271[var4] = -1;
                        }
                        break;
                    }
                }
            }
            if (var3.field613 == 93 && this.field154.method327(var3.field610, -596)) {
                class41.method357(true, new class11(var3.field611, field500), this.field154);
            }
        }
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; ++var1) {
            int var4 = var1 + 1;
            int var5 = (int) ((double) var4 + 300.0D * Math.pow(2.0D, (double) var4 / 7.0D));
            var0 += var5;
            field394[var1] = var0 / 4;
        }
        field437 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");
        field500 = true;
        field511 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };
        field519 = 127;
        field541 = 7;
        field554 = new int[32];
        int var2 = 2;
        for (int var3 = 0; var3 < 32; ++var3) {
            field554[var3] = var2 - 1;
            var2 += var2;
        }
        field568 = 2;
        field578 = 30;
    }
}
