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
public class client extends class19 {

    @OriginalMember(owner = "client", name = "J", descriptor = "I")
    private int field50 = 7759444;

    @OriginalMember(owner = "client", name = "K", descriptor = "I")
    private int field51 = 128;

    @OriginalMember(owner = "client", name = "R", descriptor = "[LJFFVPFLB;")
    public class34[] field58 = new class34[5];

    @OriginalMember(owner = "client", name = "U", descriptor = "LINLHDAGO;")
    private class29 field61 = class29.method296(1, 974);

    @OriginalMember(owner = "client", name = "V", descriptor = "Z")
    private boolean field62 = false;

    @OriginalMember(owner = "client", name = "eb", descriptor = "I")
    private int field71 = 50;

    @OriginalMember(owner = "client", name = "fb", descriptor = "[I")
    private int[] field72 = new int[this.field71];

    @OriginalMember(owner = "client", name = "gb", descriptor = "[I")
    private int[] field73 = new int[this.field71];

    @OriginalMember(owner = "client", name = "hb", descriptor = "[I")
    private int[] field74 = new int[this.field71];

    @OriginalMember(owner = "client", name = "ib", descriptor = "[I")
    private int[] field75 = new int[this.field71];

    @OriginalMember(owner = "client", name = "jb", descriptor = "[I")
    private int[] field76 = new int[this.field71];

    @OriginalMember(owner = "client", name = "kb", descriptor = "[I")
    private int[] field77 = new int[this.field71];

    @OriginalMember(owner = "client", name = "lb", descriptor = "[I")
    private int[] field78 = new int[this.field71];

    @OriginalMember(owner = "client", name = "mb", descriptor = "[Ljava/lang/String;")
    private String[] field79 = new String[this.field71];

    @OriginalMember(owner = "client", name = "nb", descriptor = "Z")
    private boolean field80 = true;

    @OriginalMember(owner = "client", name = "qb", descriptor = "I")
    private int field83 = -267;

    @OriginalMember(owner = "client", name = "rb", descriptor = "[LXKULRNBA;")
    private class65[] field84 = new class65[100];

    @OriginalMember(owner = "client", name = "sb", descriptor = "I")
    private int field85 = -1;

    @OriginalMember(owner = "client", name = "vb", descriptor = "Ljava/lang/String;")
    private String field88 = "";

    @OriginalMember(owner = "client", name = "Ab", descriptor = "I")
    private int field93 = 730;

    @OriginalMember(owner = "client", name = "Db", descriptor = "I")
    private int field96 = 895;

    @OriginalMember(owner = "client", name = "Eb", descriptor = "I")
    private int field97 = 8;

    @OriginalMember(owner = "client", name = "Gb", descriptor = "[I")
    private int[] field99 = new int[class38.field1209];

    @OriginalMember(owner = "client", name = "Hb", descriptor = "I")
    private int field100 = -1;

    @OriginalMember(owner = "client", name = "Ob", descriptor = "B")
    private byte field107 = 5;

    @OriginalMember(owner = "client", name = "Rb", descriptor = "[[I")
    private int[][] field110 = new int[104][104];

    @OriginalMember(owner = "client", name = "Ub", descriptor = "[I")
    private final int[] field113 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client", name = "Vb", descriptor = "[I")
    private int[] field114 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client", name = "ec", descriptor = "[I")
    private int[] field123 = new int[5];

    @OriginalMember(owner = "client", name = "hc", descriptor = "[I")
    private int[] field126 = new int[33];

    @OriginalMember(owner = "client", name = "ic", descriptor = "I")
    private int field127 = 3;

    @OriginalMember(owner = "client", name = "jc", descriptor = "[Ljava/lang/String;")
    private String[] field128 = new String[5];

    @OriginalMember(owner = "client", name = "kc", descriptor = "[Z")
    private boolean[] field129 = new boolean[5];

    @OriginalMember(owner = "client", name = "lc", descriptor = "I")
    private int field130 = 581;

    @OriginalMember(owner = "client", name = "mc", descriptor = "[I")
    private int[] field131 = new int[5];

    @OriginalMember(owner = "client", name = "nc", descriptor = "[I")
    private int[] field132 = new int[class38.field1209];

    @OriginalMember(owner = "client", name = "pc", descriptor = "I")
    private int field134 = -1;

    @OriginalMember(owner = "client", name = "qc", descriptor = "Ljava/util/zip/CRC32;")
    private CRC32 field135 = new CRC32();

    @OriginalMember(owner = "client", name = "Ac", descriptor = "[I")
    private int[] field145 = new int[5];

    @OriginalMember(owner = "client", name = "Cc", descriptor = "Z")
    private boolean field147 = false;

    @OriginalMember(owner = "client", name = "Ec", descriptor = "I")
    private int field149 = 2;

    @OriginalMember(owner = "client", name = "Fc", descriptor = "I")
    private int field150 = -1;

    @OriginalMember(owner = "client", name = "Kc", descriptor = "I")
    private int field155 = -86;

    @OriginalMember(owner = "client", name = "Mc", descriptor = "Z")
    private boolean field157 = false;

    @OriginalMember(owner = "client", name = "Oc", descriptor = "B")
    private byte field159 = 108;

    @OriginalMember(owner = "client", name = "Pc", descriptor = "Z")
    private boolean field160 = false;

    @OriginalMember(owner = "client", name = "Xc", descriptor = "Z")
    private boolean field168 = true;

    @OriginalMember(owner = "client", name = "Zc", descriptor = "I")
    private int field170 = -710;

    @OriginalMember(owner = "client", name = "ad", descriptor = "I")
    private int field171 = -1;

    @OriginalMember(owner = "client", name = "bd", descriptor = "I")
    private int field172 = -1;

    @OriginalMember(owner = "client", name = "id", descriptor = "Ljava/lang/String;")
    private String field179 = "";

    @OriginalMember(owner = "client", name = "jd", descriptor = "Ljava/lang/String;")
    private String field180 = "";

    @OriginalMember(owner = "client", name = "nd", descriptor = "[I")
    public int[] field184 = new int[1000];

    @OriginalMember(owner = "client", name = "pd", descriptor = "[LXKULRNBA;")
    private class65[] field186 = new class65[8];

    @OriginalMember(owner = "client", name = "qd", descriptor = "I")
    private int field187 = -1;

    @OriginalMember(owner = "client", name = "rd", descriptor = "Z")
    private boolean field188 = true;

    @OriginalMember(owner = "client", name = "sd", descriptor = "Z")
    private boolean field189 = true;

    @OriginalMember(owner = "client", name = "td", descriptor = "I")
    private int field190 = -5196;

    @OriginalMember(owner = "client", name = "ud", descriptor = "Z")
    public boolean field191 = false;

    @OriginalMember(owner = "client", name = "vd", descriptor = "[[I")
    private int[][] field192 = new int[104][104];

    @OriginalMember(owner = "client", name = "wd", descriptor = "[I")
    private int[] field193 = new int[2000];

    @OriginalMember(owner = "client", name = "xd", descriptor = "[I")
    private int[] field194 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client", name = "yd", descriptor = "[I")
    private int[] field195 = new int[256];

    @OriginalMember(owner = "client", name = "Ad", descriptor = "I")
    private int field197 = -592;

    @OriginalMember(owner = "client", name = "Hd", descriptor = "I")
    private int field204 = 226;

    @OriginalMember(owner = "client", name = "Id", descriptor = "[[I")
    private int[][] field205 = new int[104][104];

    @OriginalMember(owner = "client", name = "Jd", descriptor = "B")
    private byte field206 = 0;

    @OriginalMember(owner = "client", name = "Md", descriptor = "I")
    private int field209 = 1;

    @OriginalMember(owner = "client", name = "Nd", descriptor = "LROXEPOUC;")
    private class51 field210 = new class51(0);

    @OriginalMember(owner = "client", name = "Rd", descriptor = "Z")
    private volatile boolean field214 = false;

    @OriginalMember(owner = "client", name = "Td", descriptor = "Z")
    private boolean field216 = false;

    @OriginalMember(owner = "client", name = "Ud", descriptor = "B")
    private byte field217 = -112;

    @OriginalMember(owner = "client", name = "Vd", descriptor = "Z")
    private boolean field218 = false;

    @OriginalMember(owner = "client", name = "Wd", descriptor = "B")
    private byte field219 = 9;

    @OriginalMember(owner = "client", name = "Xd", descriptor = "LINLHDAGO;")
    private class29 field220 = class29.method296(1, 974);

    @OriginalMember(owner = "client", name = "Zd", descriptor = "Z")
    private boolean field222 = false;

    @OriginalMember(owner = "client", name = "ee", descriptor = "I")
    private int field227 = 2;

    @OriginalMember(owner = "client", name = "ie", descriptor = "Ljava/lang/String;")
    private String field231 = "";

    @OriginalMember(owner = "client", name = "ne", descriptor = "Z")
    private boolean field236 = false;

    @OriginalMember(owner = "client", name = "pe", descriptor = "I")
    private int field238 = -48700;

    @OriginalMember(owner = "client", name = "se", descriptor = "Z")
    private boolean field241 = false;

    @OriginalMember(owner = "client", name = "te", descriptor = "LHPPBIEYV;")
    private class28 field242 = new class28();

    @OriginalMember(owner = "client", name = "Ae", descriptor = "Z")
    private boolean field249 = false;

    @OriginalMember(owner = "client", name = "Be", descriptor = "[I")
    private int[] field250 = new int[100];

    @OriginalMember(owner = "client", name = "Ce", descriptor = "[Ljava/lang/String;")
    private String[] field251 = new String[100];

    @OriginalMember(owner = "client", name = "De", descriptor = "[Ljava/lang/String;")
    private String[] field252 = new String[100];

    @OriginalMember(owner = "client", name = "Ee", descriptor = "Z")
    private boolean field253 = false;

    @OriginalMember(owner = "client", name = "Fe", descriptor = "[B")
    private byte[] field254 = new byte[16384];

    @OriginalMember(owner = "client", name = "Le", descriptor = "Z")
    private boolean field260 = false;

    @OriginalMember(owner = "client", name = "Me", descriptor = "B")
    private byte field261 = -18;

    @OriginalMember(owner = "client", name = "Oe", descriptor = "Z")
    private boolean field263 = false;

    @OriginalMember(owner = "client", name = "Se", descriptor = "B")
    private byte field267 = -18;

    @OriginalMember(owner = "client", name = "hf", descriptor = "Z")
    private boolean field282 = false;

    @OriginalMember(owner = "client", name = "jf", descriptor = "LROXEPOUC;")
    private class51 field283 = new class51(0);

    @OriginalMember(owner = "client", name = "kf", descriptor = "[J")
    private long[] field284 = new long[200];

    @OriginalMember(owner = "client", name = "lf", descriptor = "I")
    private int field285 = 2301979;

    @OriginalMember(owner = "client", name = "Bf", descriptor = "[I")
    private int[] field301 = new int[151];

    @OriginalMember(owner = "client", name = "Ff", descriptor = "LINLHDAGO;")
    private class29 field305 = new class29((byte) -28, new byte[5000]);

    @OriginalMember(owner = "client", name = "Gf", descriptor = "[LCRBPLXHF;")
    private class7[] field306 = new class7[16384];

    @OriginalMember(owner = "client", name = "If", descriptor = "[I")
    public int[] field308 = new int[16384];

    @OriginalMember(owner = "client", name = "Jf", descriptor = "[I")
    private int[] field309 = new int[151];

    @OriginalMember(owner = "client", name = "Lf", descriptor = "I")
    private int field311 = -1;

    @OriginalMember(owner = "client", name = "Mf", descriptor = "Z")
    private boolean field312 = false;

    @OriginalMember(owner = "client", name = "Of", descriptor = "I")
    private int field314 = -1;

    @OriginalMember(owner = "client", name = "Pf", descriptor = "[I")
    private int[] field315 = new int[33];

    @OriginalMember(owner = "client", name = "Rf", descriptor = "Z")
    private boolean field317 = true;

    @OriginalMember(owner = "client", name = "Sf", descriptor = "Z")
    private boolean field318 = false;

    @OriginalMember(owner = "client", name = "Tf", descriptor = "[I")
    private int[] field319 = new int[5];

    @OriginalMember(owner = "client", name = "Uf", descriptor = "[Ljava/lang/String;")
    private String[] field320 = new String[500];

    @OriginalMember(owner = "client", name = "Vf", descriptor = "Z")
    private volatile boolean field321 = false;

    @OriginalMember(owner = "client", name = "Wf", descriptor = "B")
    private byte field322 = 3;

    @OriginalMember(owner = "client", name = "Xf", descriptor = "Z")
    private boolean field323 = false;

    @OriginalMember(owner = "client", name = "Yf", descriptor = "Z")
    private boolean field324 = false;

    @OriginalMember(owner = "client", name = "Zf", descriptor = "LROXEPOUC;")
    private class51 field325 = new class51(0);

    @OriginalMember(owner = "client", name = "ag", descriptor = "[LXKULRNBA;")
    private class65[] field326 = new class65[20];

    @OriginalMember(owner = "client", name = "dg", descriptor = "Z")
    private boolean field329 = true;

    @OriginalMember(owner = "client", name = "fg", descriptor = "[I")
    private int[] field331 = new int[class38.field1209];

    @OriginalMember(owner = "client", name = "gg", descriptor = "B")
    private byte field332 = 62;

    @OriginalMember(owner = "client", name = "hg", descriptor = "[I")
    private int[] field333 = new int[9];

    @OriginalMember(owner = "client", name = "ig", descriptor = "Z")
    private boolean field334 = false;

    @OriginalMember(owner = "client", name = "ug", descriptor = "Z")
    private boolean field346 = false;

    @OriginalMember(owner = "client", name = "wg", descriptor = "[I")
    private int[] field348 = new int[7];

    @OriginalMember(owner = "client", name = "xg", descriptor = "Z")
    public boolean field349 = true;

    @OriginalMember(owner = "client", name = "zg", descriptor = "I")
    private int field351 = 5063219;

    @OriginalMember(owner = "client", name = "Bg", descriptor = "[I")
    public int[] field353 = new int[2000];

    @OriginalMember(owner = "client", name = "Eg", descriptor = "I")
    private int field356 = 654;

    @OriginalMember(owner = "client", name = "Fg", descriptor = "I")
    private int field357 = -1;

    @OriginalMember(owner = "client", name = "Lg", descriptor = "Z")
    private boolean field363 = true;

    @OriginalMember(owner = "client", name = "Rg", descriptor = "[I")
    private int[] field369 = new int[1000];

    @OriginalMember(owner = "client", name = "Sg", descriptor = "[I")
    private int[] field370 = new int[1000];

    @OriginalMember(owner = "client", name = "Tg", descriptor = "[LXKULRNBA;")
    private class65[] field371 = new class65[20];

    @OriginalMember(owner = "client", name = "Xg", descriptor = "I")
    private int field375 = 111;

    @OriginalMember(owner = "client", name = "Yg", descriptor = "[LXKULRNBA;")
    private class65[] field376 = new class65[1000];

    @OriginalMember(owner = "client", name = "Zg", descriptor = "Z")
    private boolean field377 = true;

    @OriginalMember(owner = "client", name = "ah", descriptor = "Z")
    private boolean field378 = false;

    @OriginalMember(owner = "client", name = "ih", descriptor = "Ljava/lang/String;")
    private String field386 = "";

    @OriginalMember(owner = "client", name = "jh", descriptor = "[I")
    private int[] field387 = new int[50];

    @OriginalMember(owner = "client", name = "kh", descriptor = "Ljava/lang/String;")
    private String field388 = "";

    @OriginalMember(owner = "client", name = "lh", descriptor = "Ljava/lang/String;")
    private String field389 = "";

    @OriginalMember(owner = "client", name = "mh", descriptor = "[[[LROXEPOUC;")
    private class51[][][] field390 = new class51[4][104][104];

    @OriginalMember(owner = "client", name = "nh", descriptor = "LINLHDAGO;")
    private class29 field391 = class29.method296(1, 974);

    @OriginalMember(owner = "client", name = "oh", descriptor = "Z")
    private boolean field392 = false;

    @OriginalMember(owner = "client", name = "qh", descriptor = "I")
    private int field394 = 2;

    @OriginalMember(owner = "client", name = "th", descriptor = "[LBKYZHYRW;")
    private class4[] field397 = new class4[13];

    @OriginalMember(owner = "client", name = "uh", descriptor = "Z")
    private boolean field398 = false;

    @OriginalMember(owner = "client", name = "xh", descriptor = "[Ljava/lang/String;")
    private String[] field401 = new String[200];

    @OriginalMember(owner = "client", name = "zh", descriptor = "I")
    private final int field403 = 100;

    @OriginalMember(owner = "client", name = "Ah", descriptor = "[I")
    private int[] field404 = new int[100];

    @OriginalMember(owner = "client", name = "Bh", descriptor = "B")
    private byte field405 = 0;

    @OriginalMember(owner = "client", name = "Dh", descriptor = "I")
    private int field407 = 1;

    @OriginalMember(owner = "client", name = "Eh", descriptor = "I")
    private int field408 = 78;

    @OriginalMember(owner = "client", name = "Nh", descriptor = "I")
    private int field417 = 2048;

    @OriginalMember(owner = "client", name = "Oh", descriptor = "I")
    private int field418 = 2047;

    @OriginalMember(owner = "client", name = "Ph", descriptor = "[LCXEZIPRQ;")
    private class8[] field419 = new class8[this.field417];

    @OriginalMember(owner = "client", name = "Rh", descriptor = "[I")
    public int[] field421 = new int[this.field417];

    @OriginalMember(owner = "client", name = "Th", descriptor = "[I")
    private int[] field423 = new int[this.field417];

    @OriginalMember(owner = "client", name = "Uh", descriptor = "[LINLHDAGO;")
    private class29[] field424 = new class29[this.field417];

    @OriginalMember(owner = "client", name = "Vh", descriptor = "Z")
    private boolean field425 = true;

    @OriginalMember(owner = "client", name = "Xh", descriptor = "I")
    private int field427 = 463;

    @OriginalMember(owner = "client", name = "Yh", descriptor = "I")
    private int field428 = -1;

    @OriginalMember(owner = "client", name = "ai", descriptor = "I")
    private int field430 = 7;

    @OriginalMember(owner = "client", name = "ei", descriptor = "Ljava/lang/String;")
    private String field434 = "";

    @OriginalMember(owner = "client", name = "oi", descriptor = "Z")
    private boolean field444 = true;

    @OriginalMember(owner = "client", name = "pi", descriptor = "[I")
    private int[] field445 = new int[50];

    @OriginalMember(owner = "client", name = "qi", descriptor = "Z")
    private boolean field446 = false;

    @OriginalMember(owner = "client", name = "ti", descriptor = "[[[I")
    private int[][][] field449 = new int[4][13][13];

    @OriginalMember(owner = "client", name = "ui", descriptor = "[LBKYZHYRW;")
    private class4[] field450 = new class4[2];

    @OriginalMember(owner = "client", name = "vi", descriptor = "Ljava/lang/String;")
    private String field451 = "";

    @OriginalMember(owner = "client", name = "wi", descriptor = "I")
    private int field452 = 3353893;

    @OriginalMember(owner = "client", name = "zi", descriptor = "[Z")
    private boolean[] field455 = new boolean[5];

    @OriginalMember(owner = "client", name = "Ci", descriptor = "I")
    private int field458 = 581;

    @OriginalMember(owner = "client", name = "Di", descriptor = "[J")
    private long[] field459 = new long[100];

    @OriginalMember(owner = "client", name = "Ei", descriptor = "Z")
    private boolean field460 = false;

    @OriginalMember(owner = "client", name = "Ti", descriptor = "[I")
    private int[] field475 = new int[200];

    @OriginalMember(owner = "client", name = "Ui", descriptor = "[LUTWNPFGW;")
    private class62[] field476 = new class62[4];

    @OriginalMember(owner = "client", name = "Xi", descriptor = "[I")
    private int[] field479 = new int[500];

    @OriginalMember(owner = "client", name = "Yi", descriptor = "[I")
    private int[] field480 = new int[500];

    @OriginalMember(owner = "client", name = "Zi", descriptor = "[I")
    private int[] field481 = new int[500];

    @OriginalMember(owner = "client", name = "aj", descriptor = "[I")
    private int[] field482 = new int[500];

    @OriginalMember(owner = "client", name = "hj", descriptor = "[I")
    private int[] field489 = new int[4000];

    @OriginalMember(owner = "client", name = "ij", descriptor = "[I")
    private int[] field490 = new int[4000];

    @OriginalMember(owner = "client", name = "kj", descriptor = "[I")
    private int[] field492 = new int[50];

    @OriginalMember(owner = "client", name = "mj", descriptor = "Z")
    private boolean field494 = false;

    @OriginalMember(owner = "client", name = "pj", descriptor = "Z")
    private boolean field497 = false;

    @OriginalMember(owner = "client", name = "qj", descriptor = "I")
    private int field498 = -1;

    @OriginalMember(owner = "client", name = "rj", descriptor = "Z")
    private boolean field499 = true;

    @OriginalMember(owner = "client", name = "vj", descriptor = "Z")
    private volatile boolean field503 = false;

    @OriginalMember(owner = "client", name = "Aj", descriptor = "Z")
    private boolean field508 = false;

    @OriginalMember(owner = "client", name = "Gj", descriptor = "I")
    private int field514 = -1;

    @OriginalMember(owner = "client", name = "Hj", descriptor = "I")
    private int field515 = -1;

    @OriginalMember(owner = "client", name = "Ij", descriptor = "Z")
    private boolean field516 = true;

    @OriginalMember(owner = "client", name = "Mj", descriptor = "Z")
    private boolean field520 = false;

    @OriginalMember(owner = "client", name = "Nj", descriptor = "[I")
    private int[] field521 = new int[5];

    @OriginalMember(owner = "client", name = "Oj", descriptor = "[LBKYZHYRW;")
    private class4[] field522 = new class4[100];

    @OriginalMember(owner = "client", name = "cc", descriptor = "Ljava/math/BigInteger;")
    private static BigInteger field121 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client", name = "ed", descriptor = "I")
    private static int field175 = 10;

    @OriginalMember(owner = "client", name = "gd", descriptor = "Z")
    private static boolean field177 = true;

    @OriginalMember(owner = "client", name = "be", descriptor = "I")
    private static int field224 = -119;

    @OriginalMember(owner = "client", name = "yf", descriptor = "Z")
    private static boolean field298 = true;

    @OriginalMember(owner = "client", name = "Nf", descriptor = "[I")
    public static int[] field313 = new int[32];

    @OriginalMember(owner = "client", name = "sg", descriptor = "[I")
    private static int[] field344;

    @OriginalMember(owner = "client", name = "tg", descriptor = "[I")
    public static final int[] field345;

    @OriginalMember(owner = "client", name = "ci", descriptor = "Ljava/lang/String;")
    private static String field432;

    @OriginalMember(owner = "client", name = "di", descriptor = "[[I")
    public static final int[][] field433;

    @OriginalMember(owner = "client", name = "uj", descriptor = "Ljava/math/BigInteger;")
    private static BigInteger field502;

    @OriginalMember(owner = "client", name = "Ib", descriptor = "I")
    private int field101;

    @OriginalMember(owner = "client", name = "Jb", descriptor = "I")
    private int field102;

    @OriginalMember(owner = "client", name = "Kb", descriptor = "I")
    private int field103;

    @OriginalMember(owner = "client", name = "Lb", descriptor = "I")
    private int field104;

    @OriginalMember(owner = "client", name = "Mb", descriptor = "I")
    private static int field105;

    @OriginalMember(owner = "client", name = "Nb", descriptor = "I")
    private static int field106;

    @OriginalMember(owner = "client", name = "Pb", descriptor = "I")
    private static int field108;

    @OriginalMember(owner = "client", name = "Qb", descriptor = "I")
    private int field109;

    @OriginalMember(owner = "client", name = "Sb", descriptor = "I")
    private int field111;

    @OriginalMember(owner = "client", name = "Tb", descriptor = "I")
    private int field112;

    @OriginalMember(owner = "client", name = "ac", descriptor = "I")
    public int field119;

    @OriginalMember(owner = "client", name = "bc", descriptor = "I")
    private static int field120;

    @OriginalMember(owner = "client", name = "dc", descriptor = "I")
    private int field122;

    @OriginalMember(owner = "client", name = "fc", descriptor = "I")
    private int field124;

    @OriginalMember(owner = "client", name = "gc", descriptor = "I")
    private int field125;

    @OriginalMember(owner = "client", name = "oc", descriptor = "I")
    private int field133;

    @OriginalMember(owner = "client", name = "rc", descriptor = "I")
    private int field136;

    @OriginalMember(owner = "client", name = "sc", descriptor = "I")
    private int field137;

    @OriginalMember(owner = "client", name = "tc", descriptor = "I")
    private int field138;

    @OriginalMember(owner = "client", name = "uc", descriptor = "I")
    private int field139;

    @OriginalMember(owner = "client", name = "vc", descriptor = "I")
    private int field140;

    @OriginalMember(owner = "client", name = "wc", descriptor = "I")
    private int field141;

    @OriginalMember(owner = "client", name = "xc", descriptor = "I")
    private int field142;

    @OriginalMember(owner = "client", name = "yc", descriptor = "I")
    private int field143;

    @OriginalMember(owner = "client", name = "zc", descriptor = "I")
    private int field144;

    @OriginalMember(owner = "client", name = "Dc", descriptor = "I")
    private int field148;

    @OriginalMember(owner = "client", name = "Lc", descriptor = "I")
    private int field156;

    @OriginalMember(owner = "client", name = "Qc", descriptor = "I")
    private static int field161;

    @OriginalMember(owner = "client", name = "Rc", descriptor = "I")
    private int field162;

    @OriginalMember(owner = "client", name = "Sc", descriptor = "I")
    private static int field163;

    @OriginalMember(owner = "client", name = "Tc", descriptor = "I")
    private int field164;

    @OriginalMember(owner = "client", name = "Uc", descriptor = "I")
    private int field165;

    @OriginalMember(owner = "client", name = "Vc", descriptor = "I")
    private int field166;

    @OriginalMember(owner = "client", name = "Yc", descriptor = "I")
    private int field169;

    @OriginalMember(owner = "client", name = "dd", descriptor = "I")
    private int field174;

    @OriginalMember(owner = "client", name = "fd", descriptor = "I")
    public static int field176;

    @OriginalMember(owner = "client", name = "ld", descriptor = "I")
    private int field182;

    @OriginalMember(owner = "client", name = "md", descriptor = "I")
    private int field183;

    @OriginalMember(owner = "client", name = "od", descriptor = "I")
    private int field185;

    @OriginalMember(owner = "client", name = "zd", descriptor = "I")
    private int field196;

    @OriginalMember(owner = "client", name = "Bd", descriptor = "I")
    private static int field198;

    @OriginalMember(owner = "client", name = "Cd", descriptor = "I")
    private int field199;

    @OriginalMember(owner = "client", name = "Dd", descriptor = "I")
    private int field200;

    @OriginalMember(owner = "client", name = "Ed", descriptor = "I")
    private int field201;

    @OriginalMember(owner = "client", name = "Fd", descriptor = "I")
    private int field202;

    @OriginalMember(owner = "client", name = "Ld", descriptor = "I")
    private int field208;

    @OriginalMember(owner = "client", name = "Od", descriptor = "I")
    private int field211;

    @OriginalMember(owner = "client", name = "Pd", descriptor = "I")
    private int field212;

    @OriginalMember(owner = "client", name = "Qd", descriptor = "I")
    private int field213;

    @OriginalMember(owner = "client", name = "Yd", descriptor = "I")
    private int field221;

    @OriginalMember(owner = "client", name = "ae", descriptor = "I")
    private int field223;

    @OriginalMember(owner = "client", name = "ce", descriptor = "I")
    private int field225;

    @OriginalMember(owner = "client", name = "de", descriptor = "I")
    private int field226;

    @OriginalMember(owner = "client", name = "je", descriptor = "I")
    private int field232;

    @OriginalMember(owner = "client", name = "ke", descriptor = "I")
    private int field233;

    @OriginalMember(owner = "client", name = "le", descriptor = "I")
    private int field234;

    @OriginalMember(owner = "client", name = "oe", descriptor = "I")
    private int field237;

    @OriginalMember(owner = "client", name = "qe", descriptor = "I")
    private static int field239;

    @OriginalMember(owner = "client", name = "re", descriptor = "I")
    private int field240;

    @OriginalMember(owner = "client", name = "ue", descriptor = "I")
    private int field243;

    @OriginalMember(owner = "client", name = "ve", descriptor = "I")
    private int field244;

    @OriginalMember(owner = "client", name = "we", descriptor = "I")
    private int field245;

    @OriginalMember(owner = "client", name = "xe", descriptor = "I")
    private int field246;

    @OriginalMember(owner = "client", name = "ye", descriptor = "I")
    private int field247;

    @OriginalMember(owner = "client", name = "ze", descriptor = "I")
    private int field248;

    @OriginalMember(owner = "client", name = "Ge", descriptor = "I")
    private int field255;

    @OriginalMember(owner = "client", name = "Ke", descriptor = "I")
    private int field259;

    @OriginalMember(owner = "client", name = "Ne", descriptor = "I")
    private int field262;

    @OriginalMember(owner = "client", name = "Te", descriptor = "I")
    private int field268;

    @OriginalMember(owner = "client", name = "Ue", descriptor = "I")
    private int field269;

    @OriginalMember(owner = "client", name = "Ve", descriptor = "I")
    private int field270;

    @OriginalMember(owner = "client", name = "We", descriptor = "I")
    private int field271;

    @OriginalMember(owner = "client", name = "Xe", descriptor = "I")
    private int field272;

    @OriginalMember(owner = "client", name = "Ye", descriptor = "I")
    private int field273;

    @OriginalMember(owner = "client", name = "of", descriptor = "I")
    private static int field288;

    @OriginalMember(owner = "client", name = "pf", descriptor = "I")
    private int field289;

    @OriginalMember(owner = "client", name = "qf", descriptor = "I")
    private int field290;

    @OriginalMember(owner = "client", name = "sf", descriptor = "I")
    private int field292;

    @OriginalMember(owner = "client", name = "Af", descriptor = "I")
    private int field300;

    @OriginalMember(owner = "client", name = "Cf", descriptor = "I")
    private int field302;

    @OriginalMember(owner = "client", name = "Df", descriptor = "I")
    private int field303;

    @OriginalMember(owner = "client", name = "Ef", descriptor = "I")
    private int field304;

    @OriginalMember(owner = "client", name = "Hf", descriptor = "I")
    private int field307;

    @OriginalMember(owner = "client", name = "Kf", descriptor = "I")
    private int field310;

    @OriginalMember(owner = "client", name = "Qf", descriptor = "I")
    private int field316;

    @OriginalMember(owner = "client", name = "cg", descriptor = "I")
    private int field328;

    @OriginalMember(owner = "client", name = "eg", descriptor = "I")
    private int field330;

    @OriginalMember(owner = "client", name = "jg", descriptor = "I")
    private static int field335;

    @OriginalMember(owner = "client", name = "og", descriptor = "I")
    private int field340;

    @OriginalMember(owner = "client", name = "pg", descriptor = "I")
    public static int field341;

    @OriginalMember(owner = "client", name = "vg", descriptor = "I")
    private int field347;

    @OriginalMember(owner = "client", name = "yg", descriptor = "I")
    private int field350;

    @OriginalMember(owner = "client", name = "Dg", descriptor = "I")
    private int field355;

    @OriginalMember(owner = "client", name = "Gg", descriptor = "I")
    private int field358;

    @OriginalMember(owner = "client", name = "Hg", descriptor = "I")
    private int field359;

    @OriginalMember(owner = "client", name = "Ig", descriptor = "I")
    private int field360;

    @OriginalMember(owner = "client", name = "Jg", descriptor = "I")
    private int field361;

    @OriginalMember(owner = "client", name = "Kg", descriptor = "I")
    private int field362;

    @OriginalMember(owner = "client", name = "Mg", descriptor = "I")
    private int field364;

    @OriginalMember(owner = "client", name = "Ng", descriptor = "I")
    private int field365;

    @OriginalMember(owner = "client", name = "Og", descriptor = "I")
    private int field366;

    @OriginalMember(owner = "client", name = "Pg", descriptor = "I")
    private int field367;

    @OriginalMember(owner = "client", name = "Qg", descriptor = "I")
    private int field368;

    @OriginalMember(owner = "client", name = "bh", descriptor = "I")
    private int field379;

    @OriginalMember(owner = "client", name = "ch", descriptor = "I")
    private int field380;

    @OriginalMember(owner = "client", name = "dh", descriptor = "I")
    private int field381;

    @OriginalMember(owner = "client", name = "eh", descriptor = "I")
    private int field382;

    @OriginalMember(owner = "client", name = "fh", descriptor = "I")
    private int field383;

    @OriginalMember(owner = "client", name = "hh", descriptor = "I")
    private int field385;

    @OriginalMember(owner = "client", name = "ph", descriptor = "I")
    private int field393;

    @OriginalMember(owner = "client", name = "rh", descriptor = "I")
    private int field395;

    @OriginalMember(owner = "client", name = "Ch", descriptor = "I")
    private int field406;

    @OriginalMember(owner = "client", name = "Fh", descriptor = "I")
    private int field409;

    @OriginalMember(owner = "client", name = "Gh", descriptor = "I")
    private int field410;

    @OriginalMember(owner = "client", name = "Hh", descriptor = "I")
    private int field411;

    @OriginalMember(owner = "client", name = "Ih", descriptor = "I")
    private int field412;

    @OriginalMember(owner = "client", name = "Jh", descriptor = "I")
    private int field413;

    @OriginalMember(owner = "client", name = "Lh", descriptor = "I")
    private static int field415;

    @OriginalMember(owner = "client", name = "Qh", descriptor = "I")
    private int field420;

    @OriginalMember(owner = "client", name = "Sh", descriptor = "I")
    private int field422;

    @OriginalMember(owner = "client", name = "Wh", descriptor = "I")
    private int field426;

    @OriginalMember(owner = "client", name = "bi", descriptor = "I")
    private static int field431;

    @OriginalMember(owner = "client", name = "ri", descriptor = "I")
    public int field447;

    @OriginalMember(owner = "client", name = "si", descriptor = "I")
    public int field448;

    @OriginalMember(owner = "client", name = "xi", descriptor = "I")
    private int field453;

    @OriginalMember(owner = "client", name = "yi", descriptor = "I")
    private int field454;

    @OriginalMember(owner = "client", name = "Bi", descriptor = "I")
    private int field457;

    @OriginalMember(owner = "client", name = "Vi", descriptor = "I")
    private int field477;

    @OriginalMember(owner = "client", name = "bj", descriptor = "I")
    private int field483;

    @OriginalMember(owner = "client", name = "cj", descriptor = "I")
    private int field484;

    @OriginalMember(owner = "client", name = "dj", descriptor = "I")
    private int field485;

    @OriginalMember(owner = "client", name = "ej", descriptor = "I")
    private int field486;

    @OriginalMember(owner = "client", name = "fj", descriptor = "I")
    private int field487;

    @OriginalMember(owner = "client", name = "jj", descriptor = "I")
    private static int field491;

    @OriginalMember(owner = "client", name = "lj", descriptor = "I")
    private static int field493;

    @OriginalMember(owner = "client", name = "wj", descriptor = "I")
    private int field504;

    @OriginalMember(owner = "client", name = "xj", descriptor = "I")
    private int field505;

    @OriginalMember(owner = "client", name = "zj", descriptor = "I")
    private static int field507;

    @OriginalMember(owner = "client", name = "Bj", descriptor = "I")
    private int field509;

    @OriginalMember(owner = "client", name = "Cj", descriptor = "I")
    private int field510;

    @OriginalMember(owner = "client", name = "Dj", descriptor = "I")
    private int field511;

    @OriginalMember(owner = "client", name = "Ej", descriptor = "I")
    private int field512;

    @OriginalMember(owner = "client", name = "Fj", descriptor = "I")
    private int field513;

    @OriginalMember(owner = "client", name = "Jj", descriptor = "I")
    private int field517;

    @OriginalMember(owner = "client", name = "Kj", descriptor = "I")
    private int field518;

    @OriginalMember(owner = "client", name = "L", descriptor = "I")
    private int field52;

    @OriginalMember(owner = "client", name = "Pj", descriptor = "I")
    public static int field523;

    @OriginalMember(owner = "client", name = "M", descriptor = "I")
    private int field53;

    @OriginalMember(owner = "client", name = "N", descriptor = "I")
    private int field54;

    @OriginalMember(owner = "client", name = "O", descriptor = "I")
    private int field55;

    @OriginalMember(owner = "client", name = "S", descriptor = "I")
    private int field59;

    @OriginalMember(owner = "client", name = "W", descriptor = "I")
    private static int field63;

    @OriginalMember(owner = "client", name = "X", descriptor = "I")
    private int field64;

    @OriginalMember(owner = "client", name = "Y", descriptor = "I")
    private int field65;

    @OriginalMember(owner = "client", name = "Z", descriptor = "I")
    private int field66;

    @OriginalMember(owner = "client", name = "ab", descriptor = "I")
    private int field67;

    @OriginalMember(owner = "client", name = "bb", descriptor = "I")
    private int field68;

    @OriginalMember(owner = "client", name = "cb", descriptor = "I")
    private int field69;

    @OriginalMember(owner = "client", name = "db", descriptor = "I")
    private int field70;

    @OriginalMember(owner = "client", name = "ub", descriptor = "I")
    public static int field87;

    @OriginalMember(owner = "client", name = "wb", descriptor = "I")
    private int field89;

    @OriginalMember(owner = "client", name = "xb", descriptor = "I")
    private int field90;

    @OriginalMember(owner = "client", name = "yb", descriptor = "I")
    private int field91;

    @OriginalMember(owner = "client", name = "zb", descriptor = "I")
    private int field92;

    @OriginalMember(owner = "client", name = "Bb", descriptor = "I")
    private int field94;

    @OriginalMember(owner = "client", name = "Cb", descriptor = "I")
    private int field95;

    @OriginalMember(owner = "client", name = "bg", descriptor = "J")
    private long field327;

    @OriginalMember(owner = "client", name = "sh", descriptor = "J")
    private long field396;

    @OriginalMember(owner = "client", name = "Lj", descriptor = "J")
    private long field519;

    @OriginalMember(owner = "client", name = "tb", descriptor = "J")
    public long field86;

    @OriginalMember(owner = "client", name = "Fb", descriptor = "J")
    private long field98;

    @OriginalMember(owner = "client", name = "yj", descriptor = "LDYBMLHQM;")
    private class16 field506;

    @OriginalMember(owner = "client", name = "Wb", descriptor = "LJLICUWSE;")
    private class35 field115;

    @OriginalMember(owner = "client", name = "Xb", descriptor = "LJLICUWSE;")
    private class35 field116;

    @OriginalMember(owner = "client", name = "Yb", descriptor = "LJLICUWSE;")
    private class35 field117;

    @OriginalMember(owner = "client", name = "Zb", descriptor = "LJLICUWSE;")
    private class35 field118;

    @OriginalMember(owner = "client", name = "Ze", descriptor = "LLWAVUJVV;")
    private class39 field274;

    @OriginalMember(owner = "client", name = "af", descriptor = "LLWAVUJVV;")
    private class39 field275;

    @OriginalMember(owner = "client", name = "bf", descriptor = "LLWAVUJVV;")
    private class39 field276;

    @OriginalMember(owner = "client", name = "kg", descriptor = "LLWAVUJVV;")
    private class39 field336;

    @OriginalMember(owner = "client", name = "lg", descriptor = "LLWAVUJVV;")
    private class39 field337;

    @OriginalMember(owner = "client", name = "mg", descriptor = "LLWAVUJVV;")
    private class39 field338;

    @OriginalMember(owner = "client", name = "ng", descriptor = "LLWAVUJVV;")
    private class39 field339;

    @OriginalMember(owner = "client", name = "fi", descriptor = "LLWAVUJVV;")
    private class39 field435;

    @OriginalMember(owner = "client", name = "gi", descriptor = "LLWAVUJVV;")
    private class39 field436;

    @OriginalMember(owner = "client", name = "hi", descriptor = "LLWAVUJVV;")
    private class39 field437;

    @OriginalMember(owner = "client", name = "ii", descriptor = "LLWAVUJVV;")
    private class39 field438;

    @OriginalMember(owner = "client", name = "ji", descriptor = "LLWAVUJVV;")
    private class39 field439;

    @OriginalMember(owner = "client", name = "ki", descriptor = "LLWAVUJVV;")
    private class39 field440;

    @OriginalMember(owner = "client", name = "li", descriptor = "LLWAVUJVV;")
    private class39 field441;

    @OriginalMember(owner = "client", name = "mi", descriptor = "LLWAVUJVV;")
    private class39 field442;

    @OriginalMember(owner = "client", name = "ni", descriptor = "LLWAVUJVV;")
    private class39 field443;

    @OriginalMember(owner = "client", name = "Ki", descriptor = "LLWAVUJVV;")
    private class39 field466;

    @OriginalMember(owner = "client", name = "Li", descriptor = "LLWAVUJVV;")
    private class39 field467;

    @OriginalMember(owner = "client", name = "Mi", descriptor = "LLWAVUJVV;")
    private class39 field468;

    @OriginalMember(owner = "client", name = "Ni", descriptor = "LLWAVUJVV;")
    private class39 field469;

    @OriginalMember(owner = "client", name = "Oi", descriptor = "LLWAVUJVV;")
    private class39 field470;

    @OriginalMember(owner = "client", name = "Pi", descriptor = "LLWAVUJVV;")
    private class39 field471;

    @OriginalMember(owner = "client", name = "Qi", descriptor = "LLWAVUJVV;")
    private class39 field472;

    @OriginalMember(owner = "client", name = "Ri", descriptor = "LLWAVUJVV;")
    private class39 field473;

    @OriginalMember(owner = "client", name = "Si", descriptor = "LLWAVUJVV;")
    private class39 field474;

    @OriginalMember(owner = "client", name = "fe", descriptor = "LBKYZHYRW;")
    private class4 field228;

    @OriginalMember(owner = "client", name = "ge", descriptor = "LBKYZHYRW;")
    private class4 field229;

    @OriginalMember(owner = "client", name = "he", descriptor = "LBKYZHYRW;")
    private class4 field230;

    @OriginalMember(owner = "client", name = "He", descriptor = "LBKYZHYRW;")
    private class4 field256;

    @OriginalMember(owner = "client", name = "Ie", descriptor = "LBKYZHYRW;")
    private class4 field257;

    @OriginalMember(owner = "client", name = "Je", descriptor = "LBKYZHYRW;")
    private class4 field258;

    @OriginalMember(owner = "client", name = "cf", descriptor = "LBKYZHYRW;")
    private class4 field277;

    @OriginalMember(owner = "client", name = "df", descriptor = "LBKYZHYRW;")
    private class4 field278;

    @OriginalMember(owner = "client", name = "ef", descriptor = "LBKYZHYRW;")
    private class4 field279;

    @OriginalMember(owner = "client", name = "ff", descriptor = "LBKYZHYRW;")
    private class4 field280;

    @OriginalMember(owner = "client", name = "gf", descriptor = "LBKYZHYRW;")
    private class4 field281;

    @OriginalMember(owner = "client", name = "vh", descriptor = "LBKYZHYRW;")
    private class4 field399;

    @OriginalMember(owner = "client", name = "wh", descriptor = "LBKYZHYRW;")
    private class4 field400;

    @OriginalMember(owner = "client", name = "Fi", descriptor = "LBKYZHYRW;")
    private class4 field461;

    @OriginalMember(owner = "client", name = "Gi", descriptor = "LBKYZHYRW;")
    private class4 field462;

    @OriginalMember(owner = "client", name = "Hi", descriptor = "LBKYZHYRW;")
    private class4 field463;

    @OriginalMember(owner = "client", name = "Ii", descriptor = "LBKYZHYRW;")
    private class4 field464;

    @OriginalMember(owner = "client", name = "Ji", descriptor = "LBKYZHYRW;")
    private class4 field465;

    @OriginalMember(owner = "client", name = "sj", descriptor = "LBKYZHYRW;")
    private class4 field500;

    @OriginalMember(owner = "client", name = "tj", descriptor = "LBKYZHYRW;")
    private class4 field501;

    @OriginalMember(owner = "client", name = "Cg", descriptor = "LSKDZZMVP;")
    private class59 field354;

    @OriginalMember(owner = "client", name = "Sd", descriptor = "LSTZSJMNC;")
    public class60 field215;

    @OriginalMember(owner = "client", name = "kd", descriptor = "LXKULRNBA;")
    private class65 field181;

    @OriginalMember(owner = "client", name = "me", descriptor = "LXKULRNBA;")
    private class65 field235;

    @OriginalMember(owner = "client", name = "tf", descriptor = "LXKULRNBA;")
    private class65 field293;

    @OriginalMember(owner = "client", name = "uf", descriptor = "LXKULRNBA;")
    private class65 field294;

    @OriginalMember(owner = "client", name = "vf", descriptor = "LXKULRNBA;")
    private class65 field295;

    @OriginalMember(owner = "client", name = "wf", descriptor = "LXKULRNBA;")
    private class65 field296;

    @OriginalMember(owner = "client", name = "xf", descriptor = "LXKULRNBA;")
    private class65 field297;

    @OriginalMember(owner = "client", name = "Mh", descriptor = "LXKULRNBA;")
    private class65 field416;

    @OriginalMember(owner = "client", name = "nj", descriptor = "LXKULRNBA;")
    private class65 field495;

    @OriginalMember(owner = "client", name = "oj", descriptor = "LXKULRNBA;")
    private class65 field496;

    @OriginalMember(owner = "client", name = "P", descriptor = "LXKULRNBA;")
    private class65 field56;

    @OriginalMember(owner = "client", name = "Q", descriptor = "LXKULRNBA;")
    private class65 field57;

    @OriginalMember(owner = "client", name = "ob", descriptor = "LXKULRNBA;")
    private class65 field81;

    @OriginalMember(owner = "client", name = "pb", descriptor = "LXKULRNBA;")
    private class65 field82;

    @OriginalMember(owner = "client", name = "Ai", descriptor = "LXRAHVOIV;")
    private class67 field456;

    @OriginalMember(owner = "client", name = "Bc", descriptor = "LYZICXNNP;")
    private class71 field146;

    @OriginalMember(owner = "client", name = "gj", descriptor = "LCXEZIPRQ;")
    public static class8 field488;

    @OriginalMember(owner = "client", name = "gh", descriptor = "LCXHZUTUD;")
    private class9 field384;

    @OriginalMember(owner = "client", name = "Wc", descriptor = "Ljava/lang/String;")
    public String field167;

    @OriginalMember(owner = "client", name = "Gd", descriptor = "Ljava/lang/String;")
    public String field203;

    @OriginalMember(owner = "client", name = "yh", descriptor = "Ljava/lang/String;")
    private String field402;

    @OriginalMember(owner = "client", name = "Kh", descriptor = "Ljava/lang/String;")
    private String field414;

    @OriginalMember(owner = "client", name = "cd", descriptor = "Ljava/net/Socket;")
    private Socket field173;

    @OriginalMember(owner = "client", name = "hd", descriptor = "Z")
    private static boolean field178;

    @OriginalMember(owner = "client", name = "rf", descriptor = "Z")
    public static boolean field291;

    @OriginalMember(owner = "client", name = "Ag", descriptor = "Z")
    private static boolean field352;

    @OriginalMember(owner = "client", name = "T", descriptor = "Z")
    public static boolean field60;

    @OriginalMember(owner = "client", name = "Gc", descriptor = "[I")
    private int[] field151;

    @OriginalMember(owner = "client", name = "Hc", descriptor = "[I")
    private int[] field152;

    @OriginalMember(owner = "client", name = "Ic", descriptor = "[I")
    private int[] field153;

    @OriginalMember(owner = "client", name = "Jc", descriptor = "[I")
    private int[] field154;

    @OriginalMember(owner = "client", name = "Pe", descriptor = "[I")
    private int[] field264;

    @OriginalMember(owner = "client", name = "Qe", descriptor = "[I")
    private int[] field265;

    @OriginalMember(owner = "client", name = "Re", descriptor = "[I")
    private int[] field266;

    @OriginalMember(owner = "client", name = "mf", descriptor = "[I")
    private int[] field286;

    @OriginalMember(owner = "client", name = "nf", descriptor = "[I")
    private int[] field287;

    @OriginalMember(owner = "client", name = "qg", descriptor = "[I")
    private int[] field342;

    @OriginalMember(owner = "client", name = "rg", descriptor = "[I")
    private int[] field343;

    @OriginalMember(owner = "client", name = "Ug", descriptor = "[I")
    private int[] field372;

    @OriginalMember(owner = "client", name = "Vg", descriptor = "[I")
    private int[] field373;

    @OriginalMember(owner = "client", name = "Wg", descriptor = "[I")
    private int[] field374;

    @OriginalMember(owner = "client", name = "Zh", descriptor = "[LBKYZHYRW;")
    private class4[] field429;

    @OriginalMember(owner = "client", name = "Kd", descriptor = "[[B")
    private byte[][] field207;

    @OriginalMember(owner = "client", name = "Wi", descriptor = "[[B")
    private byte[][] field478;

    @OriginalMember(owner = "client", name = "Nc", descriptor = "[[[B")
    private byte[][][] field158;

    @OriginalMember(owner = "client", name = "zf", descriptor = "[[[I")
    private int[][][] field299;

    @OriginalMember(owner = "client", name = "b", descriptor = "(II)Ljava/lang/String;")
    private static final String method17(int arg0, int arg1) {
        if (arg1 != 13311) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        if (arg0 < 100000) {
            return String.valueOf(arg0);
        } else {
            return arg0 < 10000000 ? arg0 / 1000 + "K" : arg0 / 1000000 + "M";
        }
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(I)V")
    public final void method18(int arg0) {
        int var2 = 94 / arg0;
        if (this.field174 == 0) {
            int var3 = super.field801 / 2 - 80;
            int var4 = super.field802 / 2 + 20;
            int var15 = var4 + 20;
            if (super.field817 == 1 && super.field818 >= var3 - 75 && super.field818 <= var3 + 75 && super.field819 >= var15 - 20 && super.field819 <= var15 + 20) {
                this.field174 = 3;
                this.field310 = 0;
            }
            int var5 = super.field801 / 2 + 80;
            if (super.field817 == 1 && super.field818 >= var5 - 75 && super.field818 <= var5 + 75 && super.field819 >= var15 - 20 && super.field819 <= var15 + 20) {
                this.field179 = "";
                this.field180 = "Enter your username & password.";
                this.field174 = 2;
                this.field310 = 0;
            }
        } else if (this.field174 == 2) {
            int var6 = super.field802 / 2 - 40;
            int var16 = var6 + 30;
            int var17 = var16 + 25;
            if (super.field817 == 1 && super.field819 >= var17 - 15 && super.field819 < var17) {
                this.field310 = 0;
            }
            var6 = var17 + 15;
            if (super.field817 == 1 && super.field819 >= var6 - 15 && super.field819 < var6) {
                this.field310 = 1;
            }
            var6 += 15;
            int var7 = super.field801 / 2 - 80;
            int var8 = super.field802 / 2 + 50;
            int var18 = var8 + 20;
            if (super.field817 == 1 && super.field818 >= var7 - 75 && super.field818 <= var7 + 75 && super.field819 >= var18 - 20 && super.field819 <= var18 + 20) {
                this.field255 = 0;
                this.method47(this.field388, this.field389, false);
                if (this.field191) {
                    return;
                }
            }
            int var9 = super.field801 / 2 + 80;
            if (super.field817 == 1 && super.field818 >= var9 - 75 && super.field818 <= var9 + 75 && super.field819 >= var18 - 20 && super.field819 <= var18 + 20) {
                this.field174 = 0;
                this.field388 = "";
                this.field389 = "";
            }
            while (true) {
                while (true) {
                    int var10 = this.method256(false);
                    if (var10 == -1) {
                        return;
                    }
                    boolean var11 = false;
                    for (int var12 = 0; var12 < field432.length(); ++var12) {
                        if (var10 == field432.charAt(var12)) {
                            var11 = true;
                            break;
                        }
                    }
                    if (this.field310 == 0) {
                        if (var10 == 8 && this.field388.length() > 0) {
                            this.field388 = this.field388.substring(0, this.field388.length() - 1);
                        }
                        if (var10 == 9 || var10 == 10 || var10 == 13) {
                            this.field310 = 1;
                        }
                        if (var11) {
                            this.field388 = this.field388 + (char) var10;
                        }
                        if (this.field388.length() > 12) {
                            this.field388 = this.field388.substring(0, 12);
                        }
                    } else if (this.field310 == 1) {
                        if (var10 == 8 && this.field389.length() > 0) {
                            this.field389 = this.field389.substring(0, this.field389.length() - 1);
                        }
                        if (var10 == 9 || var10 == 10 || var10 == 13) {
                            this.field310 = 0;
                        }
                        if (var11) {
                            this.field389 = this.field389 + (char) var10;
                        }
                        if (this.field389.length() > 20) {
                            this.field389 = this.field389.substring(0, 20);
                        }
                    }
                }
            }
        } else {
            if (this.field174 == 3) {
                int var13 = super.field801 / 2;
                int var14 = super.field802 / 2 + 50;
                int var19 = var14 + 20;
                if (super.field817 == 1 && super.field818 >= var13 - 75 && super.field818 <= var13 + 75 && super.field819 >= var19 - 20 && super.field819 <= var19 + 20) {
                    this.field174 = 0;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(I)V")
    public final void method19(int arg0) {
        this.field185 = 0;
        if (arg0 != 1) {
            this.field410 = this.field61.method308();
        }
        int var2 = (field488.field885 >> 7) + this.field141;
        int var3 = (field488.field886 >> 7) + this.field142;
        if (var2 >= 3053 && var2 <= 3156 && var3 >= 3056 && var3 <= 3136) {
            this.field185 = 1;
        }
        if (var2 >= 3072 && var2 <= 3118 && var3 >= 9492 && var3 <= 9535) {
            this.field185 = 1;
        }
        if (this.field185 == 1 && var2 >= 3139 && var2 <= 3199 && var3 >= 3008 && var3 <= 3062) {
            this.field185 = 0;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IILXKULRNBA;I)V")
    public final void method20(int arg0, int arg1, class65 arg2, int arg3) {
        int var5 = this.field52 + this.field226 & 2047;
        this.field409 += arg3;
        int var6 = arg0 * arg0 + arg1 * arg1;
        if (var6 <= 6400) {
            int var7 = class10.field680[var5];
            int var8 = class10.field681[var5];
            int var9 = var7 * 256 / (this.field406 + 256);
            int var10 = var8 * 256 / (this.field406 + 256);
            int var11 = arg0 * var10 + arg1 * var9 >> 16;
            int var12 = arg1 * var10 - arg0 * var9 >> 16;
            if (var6 > 2500) {
                arg2.method520(var11 + 94 - arg2.field1586 / 2 + 4, 644, this.field257, 83 - var12 - arg2.field1587 / 2 - 4);
            } else {
                arg2.method514(83 - var12 - arg2.field1587 / 2 - 4, true, var11 + 94 - arg2.field1586 / 2 + 4);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIIIIIII)V")
    private final void method21(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        class47 var11 = null;
        if (arg1 <= 0) {
            this.field410 = -1;
        }
        for (class47 var12 = (class47) this.field210.method427(); var12 != null; var12 = (class47) this.field210.method429(0)) {
            if (var12.field1306 == arg2 && var12.field1308 == arg3 && var12.field1309 == arg0 && var12.field1307 == arg9) {
                var11 = var12;
                break;
            }
        }
        if (var11 == null) {
            var11 = new class47();
            var11.field1306 = arg2;
            var11.field1307 = arg9;
            var11.field1308 = arg3;
            var11.field1309 = arg0;
            this.method57(var11, 113);
            this.field210.method424(var11);
        }
        var11.field1312 = arg5;
        var11.field1314 = arg6;
        var11.field1313 = arg7;
        var11.field1310 = arg8;
        var11.field1311 = arg4;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IZZ)V")
    public final void method22(int arg0, boolean arg1, boolean arg2) {
        if (arg2) {
            this.method149();
        }
        signlink.midivol = arg0;
        if (arg1) {
            signlink.midi = "voladjust";
        }
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(I)V")
    public final void method23(int arg0) {
        try {
            if (this.field146 != null) {
                this.field146.method583();
            }
        } catch (Exception var3) {
        }
        this.field146 = null;
        this.field191 = false;
        this.field174 = 0;
        this.field388 = "";
        this.field389 = "";
        this.method63(7);
        if (arg0 >= 0) {
            field298 = !field298;
        }
        this.field456.method527((byte) -106);
        for (int var2 = 0; var2 < 4; ++var2) {
            this.field476[var2].method484(39110);
        }
        System.gc();
        this.method88(1);
        this.field187 = -1;
        this.field316 = -1;
        this.field244 = 0;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(II[B)Z")
    public final boolean method24(int arg0, int arg1, byte[] arg2) {
        if (arg0 >= 0) {
            this.field97 = this.field354.method481();
        }
        return arg2 == null ? true : signlink.wavesave(arg2, arg1);
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;)V")
    private final void method25(String arg0) {
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

    @OriginalMember(owner = "client", name = "h", descriptor = "(I)V")
    private final void method26(int arg0) {
        if (arg0 <= 0) {
            this.field410 = this.field61.method308();
        }
        for (class47 var2 = (class47) this.field210.method427(); var2 != null; var2 = (class47) this.field210.method429(0)) {
            if (var2.field1311 == -1) {
                var2.field1310 = 0;
                this.method57(var2, 113);
            } else {
                var2.method234();
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIIIZLHPPBIEYV;I)V")
    public final void method27(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, class28 arg7, int arg8) {
        if (arg8 != 0) {
            this.field391.method298(178);
        }
        if (this.field312) {
            this.field457 = 32;
        } else {
            this.field457 = 0;
        }
        this.field312 = false;
        if (arg3 >= arg4 && arg3 < arg4 + 16 && arg1 >= arg2 && arg1 < arg2 + 16) {
            arg7.field1069 -= this.field426 * 4;
            if (arg6) {
                this.field334 = true;
                return;
            }
        } else if (arg3 >= arg4 && arg3 < arg4 + 16 && arg1 >= arg0 + arg2 - 16 && arg1 < arg0 + arg2) {
            arg7.field1069 += this.field426 * 4;
            if (arg6) {
                this.field334 = true;
                return;
            }
        } else {
            if (arg3 < arg4 - this.field457 || arg3 >= arg4 + 16 + this.field457 || arg1 < arg2 + 16 || arg1 >= arg0 + arg2 - 16 || this.field426 <= 0) {
                return;
            }
            int var10 = (arg0 - 32) * arg0 / arg5;
            if (var10 < 8) {
                var10 = 8;
            }
            int var11 = arg1 - arg2 - 16 - var10 / 2;
            int var12 = arg0 - 32 - var10;
            arg7.field1069 = (arg5 - arg0) * var11 / var12;
            if (arg6) {
                this.field334 = true;
            }
            this.field312 = true;
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(Z)V")
    public final void method28(boolean arg0) {
        this.field399 = new class4(this.field506, "titlebox", 0);
        this.field400 = new class4(this.field506, "titlebutton", 0);
        this.field429 = new class4[12];
        int var2 = 0;
        try {
            var2 = Integer.parseInt(this.getParameter("fl_icon"));
        } catch (Exception var19) {
        }
        if (var2 == 0) {
            for (int var3 = 0; var3 < 12; ++var3) {
                this.field429[var3] = new class4(this.field506, "runes", var3);
            }
        } else {
            for (int var4 = 0; var4 < 12; ++var4) {
                this.field429[var4] = new class4(this.field506, "runes", (var4 & 3) + 12);
            }
        }
        this.field495 = new class65(128, 265);
        this.field191 &= arg0;
        this.field496 = new class65(128, 265);
        for (int var5 = 0; var5 < 33920; ++var5) {
            this.field495.field1581[var5] = this.field438.field1213[var5];
        }
        for (int var6 = 0; var6 < 33920; ++var6) {
            this.field496.field1581[var6] = this.field439.field1213[var6];
        }
        this.field152 = new int[256];
        for (int var7 = 0; var7 < 64; ++var7) {
            this.field152[var7] = var7 * 262144;
        }
        for (int var8 = 0; var8 < 64; ++var8) {
            this.field152[var8 + 64] = var8 * 1024 + 16711680;
        }
        for (int var9 = 0; var9 < 64; ++var9) {
            this.field152[var9 + 128] = var9 * 4 + 16776960;
        }
        for (int var10 = 0; var10 < 64; ++var10) {
            this.field152[var10 + 192] = 16777215;
        }
        this.field153 = new int[256];
        for (int var11 = 0; var11 < 64; ++var11) {
            this.field153[var11] = var11 * 1024;
        }
        for (int var12 = 0; var12 < 64; ++var12) {
            this.field153[var12 + 64] = var12 * 4 + 65280;
        }
        for (int var13 = 0; var13 < 64; ++var13) {
            this.field153[var13 + 128] = var13 * 262144 + 65535;
        }
        for (int var14 = 0; var14 < 64; ++var14) {
            this.field153[var14 + 192] = 16777215;
        }
        this.field154 = new int[256];
        for (int var15 = 0; var15 < 64; ++var15) {
            this.field154[var15] = var15 * 4;
        }
        for (int var16 = 0; var16 < 64; ++var16) {
            this.field154[var16 + 64] = var16 * 262144 + 255;
        }
        for (int var17 = 0; var17 < 64; ++var17) {
            this.field154[var17 + 128] = var17 * 1024 + 16711935;
        }
        for (int var18 = 0; var18 < 64; ++var18) {
            this.field154[var18 + 192] = 16777215;
        }
        this.field151 = new int[256];
        this.field286 = new int[32768];
        this.field287 = new int[32768];
        this.method125((class4) null, -949);
        this.field342 = new int[32768];
        this.field343 = new int[32768];
        this.method120("Connecting to fileserver", 10, 7);
        if (!this.field503) {
            this.field321 = true;
            this.field503 = true;
            this.method113(this, 2);
        }
    }

    @OriginalMember(owner = "client", name = "i", descriptor = "(I)Z")
    public final boolean method29(int arg0) {
        while (arg0 >= 0) {
            this.field189 = !this.field189;
        }
        if (this.field146 == null) {
            return false;
        } else {
            try {
                int var2 = this.field146.method585();
                if (var2 == 0) {
                    return false;
                }
                if (this.field410 == -1) {
                    this.field146.method586(this.field61.field1106, 0, 1);
                    this.field410 = this.field61.field1106[0] & 255;
                    if (this.field354 != null) {
                        this.field410 = this.field410 - this.field354.method481() & 255;
                    }
                    this.field409 = class72.field1720[this.field410];
                    --var2;
                }
                if (this.field409 == -1) {
                    if (var2 <= 0) {
                        return false;
                    }
                    this.field146.method586(this.field61.field1106, 0, 1);
                    this.field409 = this.field61.field1106[0] & 255;
                    --var2;
                }
                if (this.field409 == -2) {
                    if (var2 <= 1) {
                        return false;
                    }
                    this.field146.method586(this.field61.field1106, 0, 2);
                    this.field61.field1107 = 0;
                    this.field409 = this.field61.method310();
                    var2 -= 2;
                }
                if (var2 < this.field409) {
                    return false;
                }
                this.field61.field1107 = 0;
                this.field146.method586(this.field61.field1106, 0, this.field409);
                this.field411 = 0;
                this.field366 = this.field365;
                this.field365 = this.field364;
                this.field364 = this.field410;
                if (this.field410 == 203) {
                    this.field134 = this.field61.method325(-254);
                    if (this.field134 == this.field127) {
                        if (this.field134 == 3) {
                            this.field127 = 1;
                        } else {
                            this.field127 = 3;
                        }
                        this.field334 = true;
                    }
                    this.field410 = -1;
                    return true;
                }
                if (this.field410 == 49) {
                    this.field334 = true;
                    int var3 = this.field61.method310();
                    class28 var4 = class28.field1045[var3];
                    while (this.field61.field1107 < this.field409) {
                        int var5 = this.field61.method322();
                        int var6 = this.field61.method310();
                        int var7 = this.field61.method308();
                        if (var7 == 255) {
                            var7 = this.field61.method313();
                        }
                        if (var5 >= 0 && var5 < var4.field1051.length) {
                            var4.field1051[var5] = var6;
                            var4.field1057[var5] = var7;
                        }
                    }
                    this.field410 = -1;
                    return true;
                }
                if (this.field410 == 124) {
                    String var8 = this.field61.method315();
                    int var9 = this.field61.method308();
                    int var10 = this.field61.method308();
                    if (var10 >= 1 && var10 <= 5) {
                        if (var8.equalsIgnoreCase("null")) {
                            var8 = null;
                        }
                        this.field128[var10 - 1] = var8;
                        this.field129[var10 - 1] = var9 == 0;
                    }
                    this.field410 = -1;
                    return true;
                }
                if (this.field410 == 63) {
                    this.field233 = 0;
                    this.field410 = -1;
                    return true;
                }
                if (this.field410 == 215) {
                    int var11 = this.field61.method337(0);
                    int var12 = this.field61.method334((byte) 6);
                    class28 var13 = class28.field1045[var12];
                    var13.field1073 = var11;
                    if (var11 == -1) {
                        var13.field1039 = 0;
                        var13.field1048 = 0;
                    }
                    this.field410 = -1;
                    return true;
                }
                if (this.field410 == 89) {
                    int var14 = this.field61.method334((byte) 6);
                    int var15 = this.field61.method335(-210);
                    int var16 = this.field61.method310();
                    if (var15 == 65535) {
                        class28.field1045[var16].field1081 = 0;
                        this.field410 = -1;
                        return true;
                    }
                    class27 var17 = class27.method286(var15);
                    class28.field1045[var16].field1081 = 4;
                    class28.field1045[var16].field1082 = var15;
                    class28.field1045[var16].field1025 = var17.field982;
                    class28.field1045[var16].field1026 = var17.field1013;
                    class28.field1045[var16].field1024 = var17.field998 * 100 / var14;
                    this.field410 = -1;
                    return true;
                }
                if (this.field410 == 225) {
                    int var18 = this.field61.method308();
                    int var19 = this.field61.method308();
                    int var20 = this.field61.method308();
                    int var21 = this.field61.method308();
                    this.field455[var18] = true;
                    this.field123[var18] = var19;
                    this.field521[var18] = var20;
                    this.field319[var18] = var21;
                    this.field131[var18] = 0;
                    this.field410 = -1;
                    return true;
                }
                if (this.field410 == 58) {
                    int var22 = this.field61.method336(this.field427);
                    int var23 = this.field61.method336(this.field427);
                    int var24 = this.field61.method335(-210);
                    class28 var25 = class28.field1045[var24];
                    var25.field1070 = var23;
                    var25.field1031 = var22;
                    this.field410 = -1;
                    return true;
                }
                if (this.field410 == 237) {
                    this.field302 = this.field61.method308();
                    this.field410 = -1;
                    return true;
                }
                if (this.field410 == 205) {
                    String var26 = this.field61.method315();
                    int var27 = this.field61.method334((byte) 6);
                    class28.field1045[var27].field1037 = var26;
                    if (this.field194[this.field127] == class28.field1045[var27].field1072) {
                        this.field334 = true;
                    }
                    this.field410 = -1;
                    return true;
                }
                if (this.field410 == 207) {
                    int var28 = this.field61.method333(870);
                    int var29 = this.field61.method333(870);
                    if (this.field357 != -1) {
                        this.field357 = -1;
                        this.field222 = true;
                    }
                    if (this.field508) {
                        this.field508 = false;
                        this.field222 = true;
                    }
                    this.field150 = var29;
                    this.field428 = var28;
                    this.field334 = true;
                    this.field62 = true;
                    this.field497 = false;
                    this.field410 = -1;
                    return true;
                }
                if (this.field410 == 167) {
                    int var30 = this.field61.method311();
                    this.field514 = var30;
                    this.field222 = true;
                    this.field410 = -1;
                    return true;
                }
                if (this.field410 == 162) {
                    this.field334 = true;
                    int var31 = this.field61.method308();
                    int var32 = this.field61.method338((byte) 115);
                    int var33 = this.field61.method325(-254);
                    this.field132[var33] = var32;
                    this.field331[var33] = var31;
                    this.field99[var33] = 1;
                    for (int var34 = 0; var34 < 98; ++var34) {
                        if (var32 >= field344[var34]) {
                            this.field99[var33] = var34 + 2;
                        }
                    }
                    this.field410 = -1;
                    return true;
                }
                if (this.field410 == 173) {
                    int var35 = this.field61.method334((byte) 6);
                    this.method138(this.field261, var35);
                    if (this.field428 != -1) {
                        this.field428 = -1;
                        this.field334 = true;
                        this.field62 = true;
                    }
                    this.field357 = var35;
                    this.field222 = true;
                    this.field150 = -1;
                    this.field497 = false;
                    this.field410 = -1;
                    return true;
                }
                if (this.field410 == 113 || this.field410 == 106 || this.field410 == 149 || this.field410 == 229 || this.field410 == 166 || this.field410 == 234 || this.field410 == 90 || this.field410 == 240 || this.field410 == 22 || this.field410 == 134 || this.field410 == 57) {
                    this.method140(this.field410, this.field61, 1);
                    this.field410 = -1;
                    return true;
                }
                if (this.field410 == 102) {
                    this.field157 = true;
                    this.field136 = this.field61.method308();
                    this.field137 = this.field61.method308();
                    this.field138 = this.field61.method310();
                    this.field139 = this.field61.method308();
                    this.field140 = this.field61.method308();
                    if (this.field140 >= 100) {
                        this.field379 = this.field136 * 128 + 64;
                        this.field381 = this.field137 * 128 + 64;
                        this.field380 = this.method99(this.field381, this.field169, 0, this.field379) - this.field138;
                    }
                    this.field410 = -1;
                    return true;
                }
                if (this.field410 == 103) {
                    int var36 = this.field61.method333(870);
                    if (var36 == 65535) {
                        var36 = -1;
                    }
                    if (this.field187 != var36 && this.field363 && !field178 && this.field244 == 0) {
                        this.field316 = var36;
                        this.field317 = true;
                        this.field384.method171(2, this.field316);
                    }
                    this.field187 = var36;
                    this.field410 = -1;
                    return true;
                }
                if (this.field410 == 194) {
                    int var37 = this.field61.method333(870);
                    int var38 = this.field61.method310();
                    if (this.field363 && !field178) {
                        this.field316 = var38;
                        this.field317 = false;
                        this.field384.method171(2, this.field316);
                        this.field244 = var37;
                    }
                    this.field410 = -1;
                    return true;
                }
                if (this.field410 == 199) {
                    int var39 = this.field61.method339(false);
                    int var40 = this.field61.method310();
                    this.field193[var40] = var39;
                    if (this.field353[var40] != var39) {
                        this.field353[var40] = var39;
                        this.method61(-35444, var40);
                        this.field334 = true;
                        if (this.field514 != -1) {
                            this.field222 = true;
                        }
                    }
                    this.field410 = -1;
                    return true;
                }
                if (this.field410 == 117) {
                    int var41 = this.field61.method333(870);
                    int var42 = this.field61.method334((byte) 6);
                    class28 var43 = class28.field1045[var42];
                    if (var43 != null && var43.field1020 == 0) {
                        if (var41 < 0) {
                            var41 = 0;
                        }
                        if (var41 > var43.field1066 - var43.field1044) {
                            var41 = var43.field1066 - var43.field1044;
                        }
                        var43.field1069 = var41;
                    }
                    this.field410 = -1;
                    return true;
                }
                if (this.field410 == 188) {
                    int var44 = this.field61.method310();
                    int var45 = this.field61.method308();
                    int var46 = this.field61.method310();
                    if (this.field168 && !field178 && this.field64 < 50) {
                        this.field387[this.field64] = var44;
                        this.field445[this.field64] = var45;
                        this.field492[this.field64] = class22.field854[var44] + var46;
                        ++this.field64;
                    }
                    this.field410 = -1;
                    return true;
                }
                if (this.field410 == 214) {
                    boolean var47 = this.field61.method326((byte) -115) == 1;
                    int var48 = this.field61.method334((byte) 6);
                    class28.field1045[var48].field1071 = var47;
                    this.field410 = -1;
                    return true;
                }
                if (this.field410 == 242) {
                    this.field454 = this.field61.method327(-41963);
                    this.field292 = this.field61.method333(870);
                    this.field330 = this.field61.method326((byte) -115);
                    this.field94 = this.field61.method334((byte) 6);
                    this.field225 = this.field61.method338((byte) 115);
                    if (this.field225 != 0 && this.field150 == -1) {
                        signlink.dnslookup(class55.method472(this.field225, (byte) 7));
                        this.method147((byte) 3);
                        short var49 = 650;
                        if (this.field330 != 201 || this.field454 == 1) {
                            var49 = 655;
                        }
                        this.field451 = "";
                        this.field494 = false;
                        for (int var50 = 0; var50 < class28.field1045.length; ++var50) {
                            if (class28.field1045[var50] != null && class28.field1045[var50].field1036 == var49) {
                                this.field150 = class28.field1045[var50].field1072;
                                break;
                            }
                        }
                    }
                    this.field410 = -1;
                    return true;
                }
                if (this.field410 == 75) {
                    if (this.field127 == 12) {
                        this.field334 = true;
                    }
                    this.field124 = this.field61.method311();
                    this.field410 = -1;
                    return true;
                }
                if (this.field410 == 176) {
                    this.field92 = this.field61.method325(-254);
                    this.field91 = this.field61.method325(-254);
                    for (int var51 = this.field91; var51 < this.field91 + 8; ++var51) {
                        for (int var52 = this.field92; var52 < this.field92 + 8; ++var52) {
                            if (this.field390[this.field169][var51][var52] != null) {
                                this.field390[this.field169][var51][var52] = null;
                                this.method107(var51, var52);
                            }
                        }
                    }
                    for (class47 var53 = (class47) this.field210.method427(); var53 != null; var53 = (class47) this.field210.method429(0)) {
                        if (var53.field1308 >= this.field91 && var53.field1308 < this.field91 + 8 && var53.field1309 >= this.field92 && var53.field1309 < this.field92 + 8 && this.field169 == var53.field1306) {
                            var53.field1311 = 0;
                        }
                    }
                    this.field410 = -1;
                    return true;
                }
                if (this.field410 == 28) {
                    long var54 = this.field61.method314((byte) -119);
                    int var56 = this.field61.method308();
                    String var57 = class55.method473(false, class55.method470(var54, (byte) 8));
                    for (int var58 = 0; var58 < this.field89; ++var58) {
                        if (this.field284[var58] == var54) {
                            if (this.field475[var58] != var56) {
                                this.field475[var58] = var56;
                                this.field334 = true;
                                if (var56 > 0) {
                                    this.method46("", false, 5, var57 + " has logged in.");
                                }
                                if (var56 == 0) {
                                    this.method46("", false, 5, var57 + " has logged out.");
                                }
                            }
                            var57 = null;
                            break;
                        }
                    }
                    if (var57 != null && this.field89 < 200) {
                        this.field284[this.field89] = var54;
                        this.field401[this.field89] = var57;
                        this.field475[this.field89] = var56;
                        ++this.field89;
                        this.field334 = true;
                    }
                    boolean var59 = false;
                    while (!var59) {
                        var59 = true;
                        for (int var60 = 0; var60 < this.field89 - 1; ++var60) {
                            if (this.field475[var60] != field175 && this.field475[var60 + 1] == field175 || this.field475[var60] == 0 && this.field475[var60 + 1] != 0) {
                                int var61 = this.field475[var60];
                                this.field475[var60] = this.field475[var60 + 1];
                                this.field475[var60 + 1] = var61;
                                String var62 = this.field401[var60];
                                this.field401[var60] = this.field401[var60 + 1];
                                this.field401[var60 + 1] = var62;
                                long var63 = this.field284[var60];
                                this.field284[var60] = this.field284[var60 + 1];
                                this.field284[var60 + 1] = var63;
                                this.field334 = true;
                                var59 = false;
                            }
                        }
                    }
                    this.field410 = -1;
                    return true;
                }
                if (this.field410 == 67) {
                    this.method42(929, this.field61, this.field409);
                    this.field410 = -1;
                    return true;
                }
                if (this.field410 == 31) {
                    this.field367 = this.field409 / 8;
                    for (int var65 = 0; var65 < this.field367; ++var65) {
                        this.field459[var65] = this.field61.method314((byte) -119);
                    }
                    this.field410 = -1;
                    return true;
                }
                if (this.field410 == 249) {
                    int var66 = this.field61.method334((byte) 6);
                    class28 var67 = class28.field1045[var66];
                    for (int var68 = 0; var68 < var67.field1051.length; ++var68) {
                        var67.field1051[var68] = -1;
                        var67.field1051[var68] = 0;
                    }
                    this.field410 = -1;
                    return true;
                }
                if (this.field410 == 85) {
                    this.field385 = this.field61.method308();
                    this.field410 = -1;
                    return true;
                }
                if (this.field410 == 10) {
                    int var69 = this.field61.method308();
                    int var70 = this.field61.method335(-210);
                    if (var70 == 65535) {
                        var70 = -1;
                    }
                    this.field194[var69] = var70;
                    this.field334 = true;
                    this.field62 = true;
                    this.field410 = -1;
                    return true;
                }
                if (this.field410 == 34) {
                    this.method23(-654);
                    this.field410 = -1;
                    return false;
                }
                if (this.field410 == 119) {
                    for (int var71 = 0; var71 < this.field353.length; ++var71) {
                        if (this.field353[var71] != this.field193[var71]) {
                            this.field353[var71] = this.field193[var71];
                            this.method61(-35444, var71);
                            this.field334 = true;
                        }
                    }
                    this.field410 = -1;
                    return true;
                }
                if (this.field410 == 182) {
                    this.field182 = this.field61.method325(-254);
                    this.field85 = this.field61.method335(-210);
                    this.field410 = -1;
                    return true;
                }
                if (this.field410 == 50) {
                    this.field334 = true;
                    int var72 = this.field61.method310();
                    class28 var73 = class28.field1045[var72];
                    int var74 = this.field61.method310();
                    for (int var75 = 0; var75 < var74; ++var75) {
                        int var76 = this.field61.method325(-254);
                        if (var76 == 255) {
                            var76 = this.field61.method339(false);
                        }
                        var73.field1051[var75] = this.field61.method310();
                        var73.field1057[var75] = var76;
                    }
                    for (int var77 = var74; var77 < var73.field1051.length; ++var77) {
                        var73.field1051[var77] = 0;
                        var73.field1057[var77] = 0;
                    }
                    this.field410 = -1;
                    return true;
                }
                if (this.field410 == 55) {
                    this.field90 = this.field61.method308();
                    this.field334 = true;
                    this.field410 = -1;
                    return true;
                }
                if (this.field410 == 184) {
                    this.field157 = false;
                    for (int var78 = 0; var78 < 5; ++var78) {
                        this.field455[var78] = false;
                    }
                    this.field410 = -1;
                    return true;
                }
                if (this.field410 == 153) {
                    int var79 = this.field61.method310();
                    this.method138(this.field261, var79);
                    if (this.field357 != -1) {
                        this.field357 = -1;
                        this.field222 = true;
                    }
                    if (this.field508) {
                        this.field508 = false;
                        this.field222 = true;
                    }
                    this.field428 = var79;
                    this.field334 = true;
                    this.field62 = true;
                    this.field150 = -1;
                    this.field497 = false;
                    this.field410 = -1;
                    return true;
                }
                if (this.field410 == 9) {
                    if (this.field428 != -1) {
                        this.field428 = -1;
                        this.field334 = true;
                        this.field62 = true;
                    }
                    if (this.field357 != -1) {
                        this.field357 = -1;
                        this.field222 = true;
                    }
                    if (this.field508) {
                        this.field508 = false;
                        this.field222 = true;
                    }
                    this.field150 = -1;
                    this.field497 = false;
                    this.field410 = -1;
                    return true;
                }
                if (this.field410 == 139) {
                    int var80 = this.field61.method334((byte) 6);
                    this.method138(this.field261, var80);
                    if (this.field428 != -1) {
                        this.field428 = -1;
                        this.field334 = true;
                        this.field62 = true;
                    }
                    if (this.field357 != -1) {
                        this.field357 = -1;
                        this.field222 = true;
                    }
                    if (this.field508) {
                        this.field508 = false;
                        this.field222 = true;
                    }
                    this.field150 = var80;
                    this.field497 = false;
                    this.field410 = -1;
                    return true;
                }
                if (this.field410 == 111) {
                    this.field127 = this.field61.method308();
                    this.field334 = true;
                    this.field62 = true;
                    this.field410 = -1;
                    return true;
                }
                if (this.field410 == 233) {
                    long var81 = this.field61.method314((byte) -119);
                    int var83 = this.field61.method313();
                    int var84 = this.field61.method308();
                    boolean var85 = false;
                    for (int var86 = 0; var86 < 100; ++var86) {
                        if (this.field404[var86] == var83) {
                            var85 = true;
                            break;
                        }
                    }
                    if (var84 <= 1) {
                        for (int var87 = 0; var87 < this.field367; ++var87) {
                            if (this.field459[var87] == var81) {
                                var85 = true;
                                break;
                            }
                        }
                    }
                    if (!var85 && this.field185 == 0) {
                        try {
                            this.field404[this.field111] = var83;
                            this.field111 = (this.field111 + 1) % 100;
                            String var88 = class17.method249(0, this.field61, this.field409 - 13);
                            if (var84 != 3) {
                                var88 = class43.method390(var88, 0);
                            }
                            if (var84 != 2 && var84 != 3) {
                                if (var84 == 1) {
                                    this.method46("@cr1@" + class55.method473(false, class55.method470(var81, (byte) 8)), false, 7, var88);
                                } else {
                                    this.method46(class55.method473(false, class55.method470(var81, (byte) 8)), false, 3, var88);
                                }
                            } else {
                                this.method46("@cr2@" + class55.method473(false, class55.method470(var81, (byte) 8)), false, 7, var88);
                            }
                        } catch (Exception var187) {
                            signlink.reporterror("cde1");
                        }
                    }
                    this.field410 = -1;
                    return true;
                }
                if (this.field410 == 107) {
                    this.method133(this.field409, 0, this.field61);
                    this.field324 = false;
                    this.field410 = -1;
                    return true;
                }
                if (this.field410 == 24) {
                    int var90 = this.field61.method333(870);
                    int var91 = this.field61.method333(870);
                    int var92 = this.field61.method335(-210);
                    int var93 = this.field61.method310();
                    class28.field1045[var93].field1025 = var92;
                    class28.field1045[var93].field1026 = var91;
                    class28.field1045[var93].field1024 = var90;
                    this.field410 = -1;
                    return true;
                }
                if (this.field410 == 121) {
                    this.field216 = false;
                    this.field508 = true;
                    this.field386 = "";
                    this.field222 = true;
                    this.field410 = -1;
                    return true;
                }
                if (this.field410 == 189) {
                    int var94 = this.field61.method334((byte) 6);
                    int var95 = this.field61.method310();
                    int var96 = var94 >> 10 & 31;
                    int var97 = var94 >> 5 & 31;
                    int var98 = var94 & 31;
                    class28.field1045[var95].field1061 = (var98 << 3) + (var96 << 19) + (var97 << 11);
                    this.field410 = -1;
                    return true;
                }
                if (this.field410 == 193) {
                    this.field300 = this.field61.method308();
                    if (this.field300 == 1) {
                        this.field350 = this.field61.method310();
                    }
                    if (this.field300 >= 2 && this.field300 <= 6) {
                        if (this.field300 == 2) {
                            this.field361 = 64;
                            this.field362 = 64;
                        }
                        if (this.field300 == 3) {
                            this.field361 = 0;
                            this.field362 = 64;
                        }
                        if (this.field300 == 4) {
                            this.field361 = 128;
                            this.field362 = 64;
                        }
                        if (this.field300 == 5) {
                            this.field361 = 64;
                            this.field362 = 0;
                        }
                        if (this.field300 == 6) {
                            this.field361 = 64;
                            this.field362 = 128;
                        }
                        this.field300 = 2;
                        this.field358 = this.field61.method310();
                        this.field359 = this.field61.method310();
                        this.field360 = this.field61.method308();
                    }
                    if (this.field300 == 10) {
                        this.field125 = this.field61.method310();
                    }
                    this.field410 = -1;
                    return true;
                }
                if (this.field410 == 104) {
                    int var99 = this.field61.method336(this.field427);
                    if (var99 >= 0) {
                        this.method138(this.field261, var99);
                    }
                    this.field515 = var99;
                    this.field410 = -1;
                    return true;
                }
                if (this.field410 == 120) {
                    byte var100 = this.field61.method329(-48151);
                    int var101 = this.field61.method335(-210);
                    this.field193[var101] = var100;
                    if (this.field353[var101] != var100) {
                        this.field353[var101] = var100;
                        this.method61(-35444, var101);
                        this.field334 = true;
                        if (this.field514 != -1) {
                            this.field222 = true;
                        }
                    }
                    this.field410 = -1;
                    return true;
                }
                if (this.field410 == 154) {
                    this.field92 = this.field61.method326((byte) -115);
                    this.field91 = this.field61.method326((byte) -115);
                    this.field410 = -1;
                    return true;
                }
                if (this.field410 == 255) {
                    String var102 = this.field61.method315();
                    if (var102.endsWith(":tradereq:")) {
                        String var103 = var102.substring(0, var102.indexOf(":"));
                        long var104 = class55.method469(var103);
                        boolean var106 = false;
                        for (int var107 = 0; var107 < this.field367; ++var107) {
                            if (this.field459[var107] == var104) {
                                var106 = true;
                                break;
                            }
                        }
                        if (!var106 && this.field185 == 0) {
                            this.method46(var103, false, 4, "wishes to trade with you.");
                        }
                    } else if (var102.endsWith(":duelreq:")) {
                        String var108 = var102.substring(0, var102.indexOf(":"));
                        long var109 = class55.method469(var108);
                        boolean var111 = false;
                        for (int var112 = 0; var112 < this.field367; ++var112) {
                            if (this.field459[var112] == var109) {
                                var111 = true;
                                break;
                            }
                        }
                        if (!var111 && this.field185 == 0) {
                            this.method46(var108, false, 8, "wishes to duel with you.");
                        }
                    } else if (!var102.endsWith(":chalreq:")) {
                        this.method46("", false, 0, var102);
                    } else {
                        String var113 = var102.substring(0, var102.indexOf(":"));
                        long var114 = class55.method469(var113);
                        boolean var116 = false;
                        for (int var117 = 0; var117 < this.field367; ++var117) {
                            if (this.field459[var117] == var114) {
                                var116 = true;
                                break;
                            }
                        }
                        if (!var116 && this.field185 == 0) {
                            String var118 = var102.substring(var102.indexOf(":") + 1, var102.length() - 9);
                            this.method46(var113, false, 8, var118);
                        }
                    }
                    this.field410 = -1;
                    return true;
                }
                if (this.field410 == 129) {
                    this.field477 = this.field61.method308();
                    this.field347 = this.field61.method308();
                    this.field212 = this.field61.method308();
                    this.field218 = true;
                    this.field222 = true;
                    this.field410 = -1;
                    return true;
                }
                if (this.field410 == 86 || this.field410 == 178) {
                    int var119 = this.field517;
                    int var120 = this.field518;
                    if (this.field410 == 86) {
                        var120 = this.field61.method333(870);
                        var119 = this.field61.method310();
                        this.field446 = false;
                    }
                    if (this.field410 == 178) {
                        this.field61.method318(-929);
                        int var121 = 0;
                        while (true) {
                            if (var121 >= 4) {
                                this.field61.method320(this.field377);
                                var120 = this.field61.method335(-210);
                                var119 = this.field61.method310();
                                this.field446 = true;
                                break;
                            }
                            for (int var122 = 0; var122 < 13; ++var122) {
                                for (int var123 = 0; var123 < 13; ++var123) {
                                    int var124 = this.field61.method319(754, 1);
                                    if (var124 == 1) {
                                        this.field449[var121][var122][var123] = this.field61.method319(754, 26);
                                    } else {
                                        this.field449[var121][var122][var123] = -1;
                                    }
                                }
                            }
                            ++var121;
                        }
                    }
                    if (this.field517 == var119 && this.field518 == var120 && this.field122 == 2) {
                        this.field410 = -1;
                        return true;
                    }
                    this.field517 = var119;
                    this.field518 = var120;
                    this.field141 = (this.field517 - 6) * 8;
                    this.field142 = (this.field518 - 6) * 8;
                    this.field253 = false;
                    if ((this.field517 / 8 == 48 || this.field517 / 8 == 49) && this.field518 / 8 == 48) {
                        this.field253 = true;
                    }
                    if (this.field517 / 8 == 48 && this.field518 / 8 == 148) {
                        this.field253 = true;
                    }
                    this.field122 = 1;
                    this.field98 = System.currentTimeMillis();
                    this.field338.method376(-329);
                    this.field116.method356(565, 151, 0, "Loading - please wait.", 257);
                    this.field116.method356(565, 150, 16777215, "Loading - please wait.", 256);
                    this.field338.method377(super.field803, 4, 1926, 4);
                    if (this.field410 == 86) {
                        int var125 = 0;
                        int var126 = (this.field517 - 6) / 8;
                        label1105: while (true) {
                            if (var126 > (this.field517 + 6) / 8) {
                                this.field478 = new byte[var125][];
                                this.field207 = new byte[var125][];
                                this.field264 = new int[var125];
                                this.field265 = new int[var125];
                                this.field266 = new int[var125];
                                int var128 = 0;
                                int var129 = (this.field517 - 6) / 8;
                                while (true) {
                                    if (var129 > (this.field517 + 6) / 8) {
                                        break label1105;
                                    }
                                    for (int var130 = (this.field518 - 6) / 8; var130 <= (this.field518 + 6) / 8; ++var130) {
                                        this.field264[var128] = (var129 << 8) + var130;
                                        if (this.field253 && (var130 == 49 || var130 == 149 || var130 == 147 || var129 == 50 || var129 == 49 && var130 == 47)) {
                                            this.field265[var128] = -1;
                                            this.field266[var128] = -1;
                                            ++var128;
                                        } else {
                                            int var131 = this.field265[var128] = this.field384.method169(var130, var129, 0, 6);
                                            if (var131 != -1) {
                                                this.field384.method171(3, var131);
                                            }
                                            int var132 = this.field266[var128] = this.field384.method169(var130, var129, 1, 6);
                                            if (var132 != -1) {
                                                this.field384.method171(3, var132);
                                            }
                                            ++var128;
                                        }
                                    }
                                    ++var129;
                                }
                            }
                            for (int var127 = (this.field518 - 6) / 8; var127 <= (this.field518 + 6) / 8; ++var127) {
                                ++var125;
                            }
                            ++var126;
                        }
                    }
                    if (this.field410 == 178) {
                        int var133 = 0;
                        int[] var134 = new int[676];
                        int var135 = 0;
                        label1066: while (true) {
                            if (var135 >= 4) {
                                this.field478 = new byte[var133][];
                                this.field207 = new byte[var133][];
                                this.field264 = new int[var133];
                                this.field265 = new int[var133];
                                this.field266 = new int[var133];
                                int var143 = 0;
                                while (true) {
                                    if (var143 >= var133) {
                                        break label1066;
                                    }
                                    int var144 = this.field264[var143] = var134[var143];
                                    int var145 = var144 >> 8 & 255;
                                    int var146 = var144 & 255;
                                    int var147 = this.field265[var143] = this.field384.method169(var146, var145, 0, 6);
                                    if (var147 != -1) {
                                        this.field384.method171(3, var147);
                                    }
                                    int var148 = this.field266[var143] = this.field384.method169(var146, var145, 1, 6);
                                    if (var148 != -1) {
                                        this.field384.method171(3, var148);
                                    }
                                    ++var143;
                                }
                            }
                            for (int var136 = 0; var136 < 13; ++var136) {
                                for (int var137 = 0; var137 < 13; ++var137) {
                                    int var138 = this.field449[var135][var136][var137];
                                    if (var138 != -1) {
                                        int var139 = var138 >> 14 & 1023;
                                        int var140 = var138 >> 3 & 2047;
                                        int var141 = (var139 / 8 << 8) + var140 / 8;
                                        for (int var142 = 0; var142 < var133; ++var142) {
                                            if (var134[var142] == var141) {
                                                var141 = -1;
                                                break;
                                            }
                                        }
                                        if (var141 != -1) {
                                            var134[var133++] = var141;
                                        }
                                    }
                                }
                            }
                            ++var135;
                        }
                    }
                    int var149 = this.field141 - this.field143;
                    int var150 = this.field142 - this.field144;
                    this.field143 = this.field141;
                    this.field144 = this.field142;
                    for (int var151 = 0; var151 < 16384; ++var151) {
                        class7 var152 = this.field306[var151];
                        if (var152 != null) {
                            for (int var153 = 0; var153 < 10; ++var153) {
                                var152.field876[var153] -= var149;
                                var152.field877[var153] -= var150;
                            }
                            var152.field885 -= var149 * 128;
                            var152.field886 -= var150 * 128;
                        }
                    }
                    for (int var154 = 0; var154 < this.field417; ++var154) {
                        class8 var155 = this.field419[var154];
                        if (var155 != null) {
                            for (int var156 = 0; var156 < 10; ++var156) {
                                var155.field876[var156] -= var149;
                                var155.field877[var156] -= var150;
                            }
                            var155.field885 -= var149 * 128;
                            var155.field886 -= var150 * 128;
                        }
                    }
                    this.field324 = true;
                    byte var157 = 0;
                    byte var158 = 104;
                    byte var159 = 1;
                    if (var149 < 0) {
                        var157 = 103;
                        var158 = -1;
                        var159 = -1;
                    }
                    byte var160 = 0;
                    byte var161 = 104;
                    byte var162 = 1;
                    if (var150 < 0) {
                        var160 = 103;
                        var161 = -1;
                        var162 = -1;
                    }
                    for (int var163 = var157; var158 != var163; var163 += var159) {
                        for (int var164 = var160; var161 != var164; var164 += var162) {
                            int var165 = var149 + var163;
                            int var166 = var150 + var164;
                            for (int var167 = 0; var167 < 4; ++var167) {
                                if (var165 >= 0 && var166 >= 0 && var165 < 104 && var166 < 104) {
                                    this.field390[var167][var163][var164] = this.field390[var167][var165][var166];
                                } else {
                                    this.field390[var167][var163][var164] = null;
                                }
                            }
                        }
                    }
                    for (class47 var168 = (class47) this.field210.method427(); var168 != null; var168 = (class47) this.field210.method429(0)) {
                        var168.field1308 -= var149;
                        var168.field1309 -= var150;
                        if (var168.field1308 < 0 || var168.field1309 < 0 || var168.field1308 >= 104 || var168.field1309 >= 104) {
                            var168.method234();
                        }
                    }
                    if (this.field233 != 0) {
                        this.field233 -= var149;
                        this.field234 -= var150;
                    }
                    this.field157 = false;
                    this.field410 = -1;
                    return true;
                }
                if (this.field410 == 78) {
                    this.field303 = this.field61.method310() * 30;
                    this.field410 = -1;
                    return true;
                }
                if (this.field410 == 36) {
                    for (int var169 = 0; var169 < this.field419.length; ++var169) {
                        if (this.field419[var169] != null) {
                            this.field419[var169].field898 = -1;
                        }
                    }
                    for (int var170 = 0; var170 < this.field306.length; ++var170) {
                        if (this.field306[var170] != null) {
                            this.field306[var170].field898 = -1;
                        }
                    }
                    this.field410 = -1;
                    return true;
                }
                if (this.field410 == 2) {
                    int var171 = this.field61.method310();
                    class28.field1045[var171].field1081 = 3;
                    if (field488.field533 == null) {
                        class28.field1045[var171].field1082 = (field488.field541[11] << 5) + (field488.field541[8] << 10) + (field488.field541[0] << 15) + (field488.field537[0] << 25) + (field488.field537[4] << 20) + field488.field541[1];
                    } else {
                        class28.field1045[var171].field1082 = (int) (field488.field533.field738 + 305419896L);
                    }
                    this.field410 = -1;
                    return true;
                }
                if (this.field410 == 163) {
                    int var172 = this.field61.method333(870);
                    int var173 = this.field61.method335(-210);
                    class28.field1045[var173].field1081 = 1;
                    class28.field1045[var173].field1082 = var172;
                    this.field410 = -1;
                    return true;
                }
                if (this.field410 == 40) {
                    if (this.field127 == 12) {
                        this.field334 = true;
                    }
                    this.field243 = this.field61.method308();
                    this.field410 = -1;
                    return true;
                }
                if (this.field410 == 33) {
                    this.field157 = true;
                    this.field483 = this.field61.method308();
                    this.field484 = this.field61.method308();
                    this.field485 = this.field61.method310();
                    this.field486 = this.field61.method308();
                    this.field487 = this.field61.method308();
                    if (this.field487 >= 100) {
                        int var174 = this.field483 * 128 + 64;
                        int var175 = this.field484 * 128 + 64;
                        int var176 = this.method99(var175, this.field169, 0, var174) - this.field485;
                        int var177 = var174 - this.field379;
                        int var178 = var176 - this.field380;
                        int var179 = var175 - this.field381;
                        int var180 = (int) Math.sqrt((double) (var177 * var177 + var179 * var179));
                        this.field382 = (int) (Math.atan2((double) var178, (double) var180) * 325.949D) & 2047;
                        this.field383 = (int) (Math.atan2((double) var177, (double) var179) * -325.949D) & 2047;
                        if (this.field382 < 128) {
                            this.field382 = 128;
                        }
                        if (this.field382 > 383) {
                            this.field382 = 383;
                        }
                    }
                    this.field410 = -1;
                    return true;
                }
                if (this.field410 == 144) {
                    this.field92 = this.field61.method326((byte) -115);
                    this.field91 = this.field61.method326((byte) -115);
                    while (this.field61.field1107 < this.field409) {
                        int var181 = this.field61.method308();
                        this.method140(var181, this.field61, 1);
                    }
                    this.field410 = -1;
                    return true;
                }
                if (this.field410 == 142) {
                    int var182 = this.field61.method335(-210);
                    int var183 = this.field61.method310();
                    class28.field1045[var183].field1081 = 2;
                    class28.field1045[var183].field1082 = var182;
                    this.field410 = -1;
                    return true;
                }
                signlink.reporterror("T1 - " + this.field410 + "," + this.field409 + " - " + this.field365 + "," + this.field366);
                this.method23(-654);
            } catch (IOException var188) {
                this.method150(this.field190);
            } catch (Exception var189) {
                String var185 = "T2 - " + this.field410 + "," + this.field365 + "," + this.field366 + " - " + this.field409 + "," + (field488.field876[0] + this.field141) + "," + (field488.field877[0] + this.field142) + " - ";
                for (int var186 = 0; var186 < this.field409 && var186 < 50; ++var186) {
                    var185 = var185 + this.field61.field1106[var186] + ",";
                }
                signlink.reporterror(var185);
                this.method23(-654);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "j", descriptor = "(I)V")
    public final void method30(int arg0) {
        for (int var2 = -1; var2 < this.field420; ++var2) {
            int var7;
            if (var2 == -1) {
                var7 = this.field418;
            } else {
                var7 = this.field421[var2];
            }
            class8 var8 = this.field419[var7];
            if (var8 != null && var8.field882 > 0) {
                --var8.field882;
                if (var8.field882 == 0) {
                    var8.field863 = null;
                }
            }
        }
        int var3 = 96 / arg0;
        for (int var4 = 0; var4 < this.field307; ++var4) {
            int var5 = this.field308[var4];
            class7 var6 = this.field306[var5];
            if (var6 != null && var6.field882 > 0) {
                --var6.field882;
                if (var6.field882 == 0) {
                    var6.field863 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIILHPPBIEYV;I)V")
    public final void method31(int arg0, int arg1, int arg2, class28 arg3, int arg4) {
        if (arg3.field1020 == 0 && arg3.field1068 != null) {
            if (!arg3.field1071 || this.field213 == arg3.field1079 || this.field328 == arg3.field1079 || this.field453 == arg3.field1079) {
                int var6 = class53.field1386;
                int var7 = class53.field1384;
                int var8 = class53.field1387;
                int var9 = class53.field1385;
                class53.method455(arg3.field1046 + arg4, 1, arg3.field1044 + arg2, arg2, arg4);
                int var10 = arg3.field1068.length;
                for (int var11 = 0; var11 < var10; ++var11) {
                    int var13 = arg3.field1083[var11] + arg4;
                    int var14 = arg3.field1080[var11] + arg2 - arg1;
                    class28 var15 = class28.field1045[arg3.field1068[var11]];
                    int var16 = var15.field1070 + var13;
                    int var17 = var15.field1031 + var14;
                    if (var15.field1036 > 0) {
                        this.method92(var15, 0);
                    }
                    if (var15.field1020 == 0) {
                        if (var15.field1069 > var15.field1066 - var15.field1044) {
                            var15.field1069 = var15.field1066 - var15.field1044;
                        }
                        if (var15.field1069 < 0) {
                            var15.field1069 = 0;
                        }
                        this.method31(this.field96, var15.field1069, var17, var15, var16);
                        if (var15.field1066 > var15.field1044) {
                            this.method145(4, var15.field1044, var17, var15.field1046 + var16, var15.field1066, var15.field1069);
                        }
                    } else if (var15.field1020 != 1) {
                        if (var15.field1020 == 2) {
                            int var18 = 0;
                            for (int var19 = 0; var19 < var15.field1044; ++var19) {
                                for (int var20 = 0; var20 < var15.field1046; ++var20) {
                                    int var21 = (var15.field1021 + 32) * var20 + var16;
                                    int var22 = (var15.field1023 + 32) * var19 + var17;
                                    if (var18 < 20) {
                                        var21 += var15.field1054[var18];
                                        var22 += var15.field1062[var18];
                                    }
                                    if (var15.field1051[var18] <= 0) {
                                        if (var15.field1077 != null && var18 < 20) {
                                            class65 var31 = var15.field1077[var18];
                                            if (var31 != null) {
                                                var31.method514(var22, true, var21);
                                            }
                                        }
                                    } else {
                                        int var23 = 0;
                                        int var24 = 0;
                                        int var25 = var15.field1051[var18] - 1;
                                        if (var21 > class53.field1386 - 32 && var21 < class53.field1387 && var22 > class53.field1384 - 32 && var22 < class53.field1385 || this.field511 != 0 && this.field510 == var18) {
                                            int var26 = 0;
                                            if (this.field199 == 1 && this.field200 == var18 && this.field201 == var15.field1079) {
                                                var26 = 16777215;
                                            }
                                            class65 var27 = class27.method282(var15.field1057[var18], 4, var26, var25);
                                            if (var27 != null) {
                                                if (this.field511 != 0 && this.field510 == var18 && this.field509 == var15.field1079) {
                                                    var23 = super.field811 - this.field512;
                                                    var24 = super.field812 - this.field513;
                                                    if (var23 < 5 && var23 > -5) {
                                                        var23 = 0;
                                                    }
                                                    if (var24 < 5 && var24 > -5) {
                                                        var24 = 0;
                                                    }
                                                    if (this.field259 < 5) {
                                                        var23 = 0;
                                                        var24 = 0;
                                                    }
                                                    var27.method516((byte) -14, var22 + var24, var21 + var23, 128);
                                                    if (var22 + var24 < class53.field1384 && arg3.field1069 > 0) {
                                                        int var28 = (class53.field1384 - var22 - var24) * this.field262 / 3;
                                                        if (var28 > this.field262 * 10) {
                                                            var28 = this.field262 * 10;
                                                        }
                                                        if (var28 > arg3.field1069) {
                                                            var28 = arg3.field1069;
                                                        }
                                                        arg3.field1069 -= var28;
                                                        this.field513 += var28;
                                                    }
                                                    if (var22 + var24 + 32 > class53.field1385 && arg3.field1069 < arg3.field1066 - arg3.field1044) {
                                                        int var29 = (var22 + var24 + 32 - class53.field1385) * this.field262 / 3;
                                                        if (var29 > this.field262 * 10) {
                                                            var29 = this.field262 * 10;
                                                        }
                                                        if (var29 > arg3.field1066 - arg3.field1044 - arg3.field1069) {
                                                            var29 = arg3.field1066 - arg3.field1044 - arg3.field1069;
                                                        }
                                                        arg3.field1069 += var29;
                                                        this.field513 -= var29;
                                                    }
                                                } else if (this.field273 != 0 && this.field272 == var18 && this.field271 == var15.field1079) {
                                                    var27.method516((byte) -14, var22, var21, 128);
                                                } else {
                                                    var27.method514(var22, true, var21);
                                                }
                                                if (var27.field1586 == 33 || var15.field1057[var18] != 1) {
                                                    int var30 = var15.field1057[var18];
                                                    this.field115.method360(true, var21 + 1 + var23, 0, method17(var30, 13311), var22 + 10 + var24);
                                                    this.field115.method360(true, var21 + var23, 16776960, method17(var30, 13311), var22 + 9 + var24);
                                                }
                                            }
                                        }
                                    }
                                    ++var18;
                                }
                            }
                        } else if (var15.field1020 == 3) {
                            boolean var32 = false;
                            if (this.field453 == var15.field1079 || this.field328 == var15.field1079 || this.field213 == var15.field1079) {
                                var32 = true;
                            }
                            int var33;
                            if (this.method55(var15, true)) {
                                var33 = var15.field1049;
                                if (var32 && var15.field1029 != 0) {
                                    var33 = var15.field1029;
                                }
                            } else {
                                var33 = var15.field1061;
                                if (var32 && var15.field1076 != 0) {
                                    var33 = var15.field1076;
                                }
                            }
                            if (var15.field1078 == 0) {
                                if (var15.field1038) {
                                    class53.method458((byte) -119, var15.field1046, var33, var17, var16, var15.field1044);
                                } else {
                                    class53.method459(var33, var16, var15.field1046, var15.field1044, var17, 2);
                                }
                            } else if (var15.field1038) {
                                class53.method457(256 - (var15.field1078 & 255), var33, var15.field1044, -34211, var16, var15.field1046, var17);
                            } else {
                                class53.method460(var15.field1044, var16, var17, var33, (byte) 43, 256 - (var15.field1078 & 255), var15.field1046);
                            }
                        } else if (var15.field1020 == 4) {
                            class35 var34 = var15.field1041;
                            String var35 = var15.field1037;
                            boolean var36 = false;
                            if (this.field453 == var15.field1079 || this.field328 == var15.field1079 || this.field213 == var15.field1079) {
                                var36 = true;
                            }
                            int var37;
                            if (this.method55(var15, true)) {
                                var37 = var15.field1049;
                                if (var36 && var15.field1029 != 0) {
                                    var37 = var15.field1029;
                                }
                                if (var15.field1030.length() > 0) {
                                    var35 = var15.field1030;
                                }
                            } else {
                                var37 = var15.field1061;
                                if (var36 && var15.field1076 != 0) {
                                    var37 = var15.field1076;
                                }
                            }
                            if (var15.field1035 == 6 && this.field497) {
                                var35 = "Please wait...";
                                var37 = var15.field1061;
                            }
                            if (class53.field1382 == 479) {
                                if (var37 == 16776960) {
                                    var37 = 255;
                                }
                                if (var37 == 49152) {
                                    var37 = 16777215;
                                }
                            }
                            int var38 = var34.field1198 + var17;
                            while (var35.length() > 0) {
                                if (var35.indexOf("%") != -1) {
                                    label327: while (true) {
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
                                                                            break label327;
                                                                        }
                                                                        var35 = var35.substring(0, var43) + this.method43(true, this.method144(var15, false, 4)) + var35.substring(var43 + 2);
                                                                    }
                                                                }
                                                                var35 = var35.substring(0, var42) + this.method43(true, this.method144(var15, false, 3)) + var35.substring(var42 + 2);
                                                            }
                                                        }
                                                        var35 = var35.substring(0, var41) + this.method43(true, this.method144(var15, false, 2)) + var35.substring(var41 + 2);
                                                    }
                                                }
                                                var35 = var35.substring(0, var40) + this.method43(true, this.method144(var15, false, 1)) + var35.substring(var40 + 2);
                                            }
                                        }
                                        var35 = var35.substring(0, var39) + this.method43(true, this.method144(var15, false, 0)) + var35.substring(var39 + 2);
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
                                if (var15.field1056) {
                                    var34.method357(var15.field1084, var15.field1046 / 2 + var16, var37, var45, var38, 4);
                                } else {
                                    var34.method364(var37, var38, (byte) 9, var16, var15.field1084, var45);
                                }
                                var38 += var34.field1198;
                            }
                        } else if (var15.field1020 == 5) {
                            class65 var46;
                            if (this.method55(var15, true)) {
                                var46 = var15.field1065;
                            } else {
                                var46 = var15.field1067;
                            }
                            if (var46 != null) {
                                var46.method514(var17, true, var16);
                            }
                        } else if (var15.field1020 == 6) {
                            int var47 = class12.field702;
                            int var48 = class12.field703;
                            class12.field702 = var15.field1046 / 2 + var16;
                            class12.field703 = var15.field1044 / 2 + var17;
                            int var49 = class12.field706[var15.field1025] * var15.field1024 >> 16;
                            int var50 = class12.field707[var15.field1025] * var15.field1024 >> 16;
                            boolean var51 = this.method55(var15, true);
                            int var52;
                            if (var51) {
                                var52 = var15.field1074;
                            } else {
                                var52 = var15.field1073;
                            }
                            class10 var53;
                            if (var52 == -1) {
                                var53 = var15.method294(-1, var51, -1, 623);
                            } else {
                                class26 var54 = class26.field949[var52];
                                var53 = var15.method294(var54.field952[var15.field1039], var51, var54.field951[var15.field1039], 623);
                            }
                            if (var53 != null) {
                                var53.method211(0, var15.field1026, 0, var15.field1025, 0, var49, var50);
                            }
                            class12.field702 = var47;
                            class12.field703 = var48;
                        } else if (var15.field1020 == 7) {
                            class35 var55 = var15.field1041;
                            int var56 = 0;
                            for (int var57 = 0; var57 < var15.field1044; ++var57) {
                                for (int var58 = 0; var58 < var15.field1046; ++var58) {
                                    if (var15.field1051[var56] > 0) {
                                        class27 var59 = class27.method286(var15.field1051[var56] - 1);
                                        String var60 = var59.field1004;
                                        if (var59.field968 || var15.field1057[var56] != 1) {
                                            var60 = var60 + " x" + method156(-19, var15.field1057[var56]);
                                        }
                                        int var61 = (var15.field1021 + 115) * var58 + var16;
                                        int var62 = (var15.field1023 + 12) * var57 + var17;
                                        if (var15.field1056) {
                                            var55.method357(var15.field1084, var15.field1046 / 2 + var61, var15.field1061, var60, var62, 4);
                                        } else {
                                            var55.method364(var15.field1061, var62, (byte) 9, var61, var15.field1084, var60);
                                        }
                                    }
                                    ++var56;
                                }
                            }
                        }
                    }
                }
                if (arg0 <= 0) {
                    for (int var12 = 1; var12 > 0; ++var12) {
                    }
                }
                class53.method455(var8, 1, var9, var7, var6);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILHPPBIEYV;)Z")
    public final boolean method32(int arg0, class28 arg1) {
        int var3 = arg1.field1036;
        if (arg0 < 6 || arg0 > 6) {
            this.field410 = -1;
        }
        if (this.field90 == 2) {
            if (var3 == 201) {
                this.field222 = true;
                this.field508 = false;
                this.field216 = true;
                this.field231 = "";
                this.field95 = 1;
                this.field434 = "Enter name of friend to add to list";
            }
            if (var3 == 202) {
                this.field222 = true;
                this.field508 = false;
                this.field216 = true;
                this.field231 = "";
                this.field95 = 2;
                this.field434 = "Enter name of friend to delete from list";
            }
        }
        if (var3 == 205) {
            this.field413 = 250;
            return true;
        } else {
            if (var3 == 501) {
                this.field222 = true;
                this.field508 = false;
                this.field216 = true;
                this.field231 = "";
                this.field95 = 4;
                this.field434 = "Enter name of player to add to list";
            }
            if (var3 == 502) {
                this.field222 = true;
                this.field508 = false;
                this.field216 = true;
                this.field231 = "";
                this.field95 = 5;
                this.field434 = "Enter name of player to delete from list";
            }
            if (var3 >= 300 && var3 <= 313) {
                int var4 = (var3 - 300) / 2;
                int var5 = var3 & 1;
                int var6 = this.field348[var4];
                if (var6 != -1) {
                    while (true) {
                        if (var5 == 0) {
                            --var6;
                            if (var6 < 0) {
                                var6 = class21.field842 - 1;
                            }
                        }
                        if (var5 == 1) {
                            ++var6;
                            if (var6 >= class21.field842) {
                                var6 = 0;
                            }
                        }
                        if (!class21.field843[var6].field849 && class21.field843[var6].field844 == var4 + (this.field444 ? 0 : 7)) {
                            this.field348[var4] = var6;
                            this.field323 = true;
                            break;
                        }
                    }
                }
            }
            if (var3 >= 314 && var3 <= 323) {
                int var7 = (var3 - 314) / 2;
                int var8 = var3 & 1;
                int var9 = this.field145[var7];
                if (var8 == 0) {
                    --var9;
                    if (var9 < 0) {
                        var9 = field433[var7].length - 1;
                    }
                }
                if (var8 == 1) {
                    ++var9;
                    if (var9 >= field433[var7].length) {
                        var9 = 0;
                    }
                }
                this.field145[var7] = var9;
                this.field323 = true;
            }
            if (var3 == 324 && !this.field444) {
                this.field444 = true;
                this.method109(9);
            }
            if (var3 == 325 && this.field444) {
                this.field444 = false;
                this.method109(9);
            }
            if (var3 != 326) {
                if (var3 == 613) {
                    this.field494 = !this.field494;
                }
                if (var3 >= 601 && var3 <= 612) {
                    this.method147((byte) 3);
                    if (this.field451.length() > 0) {
                        this.field391.method297(222, false);
                        this.field391.method304(8, class55.method469(this.field451));
                        this.field391.method298(var3 - 601);
                        this.field391.method298(this.field494 ? 1 : 0);
                    }
                }
                return false;
            } else {
                this.field391.method297(21, false);
                this.field391.method298(this.field444 ? 0 : 1);
                for (int var10 = 0; var10 < 7; ++var10) {
                    this.field391.method298(this.field348[var10]);
                }
                for (int var11 = 0; var11 < 5; ++var11) {
                    this.field391.method298(this.field145[var11]);
                }
                return true;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BILINLHDAGO;)V")
    private final void method33(byte arg0, int arg1, class29 arg2) {
        if (arg0 != 66) {
            this.field516 = !this.field516;
        }
        for (int var4 = 0; var4 < this.field422; ++var4) {
            int var5 = this.field423[var4];
            class8 var6 = this.field419[var5];
            int var7 = arg2.method308();
            if ((var7 & 1) != 0) {
                var7 += arg2.method308() << 8;
            }
            this.method154(arg2, -24437, var5, var6, var7);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZI)V")
    public final void method34(boolean arg0, int arg1) {
        for (int var3 = 0; var3 < this.field307; ++var3) {
            class7 var4 = this.field306[this.field308[var3]];
            int var5 = (this.field308[var3] << 14) + 536870912;
            if (var4 != null && var4.method161((byte) 5) && var4.field531.field748 == arg0) {
                int var6 = var4.field885 >> 7;
                int var7 = var4.field886 >> 7;
                if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
                    if (var4.field914 == 1 && (var4.field885 & 127) == 64 && (var4.field886 & 127) == 64) {
                        if (this.field110[var6][var7] == this.field245) {
                            continue;
                        }
                        this.field110[var6][var7] = this.field245;
                    }
                    this.field456.method538(var4.field886, this.field169, -610, var4.field885, var4.field862, (var4.field914 - 1) * 64 + 60, var4, var5, var4.field887, this.method99(var4.field886, this.field169, 0, var4.field885));
                }
            }
        }
        if (arg1 != 0) {
            this.field410 = -1;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BJ)V")
    public final void method35(byte arg0, long arg1) {
        if (arg0 != 0) {
            this.field391.method298(91);
        }
        if (arg1 != 0L) {
            for (int var4 = 0; var4 < this.field89; ++var4) {
                if (this.field284[var4] == arg1) {
                    --this.field89;
                    this.field334 = true;
                    for (int var5 = var4; var5 < this.field89; ++var5) {
                        this.field401[var5] = this.field401[var5 + 1];
                        this.field475[var5] = this.field475[var5 + 1];
                        this.field284[var5] = this.field284[var5 + 1];
                    }
                    this.field391.method297(110, false);
                    this.field391.method304(8, arg1);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IILCXEZIPRQ;IZ)V")
    public final void method36(int arg0, int arg1, class8 arg2, int arg3, boolean arg4) {
        if (arg4) {
            this.method149();
        }
        if (field488 != arg2) {
            if (this.field268 < 400) {
                String var6;
                if (arg2.field535 == 0) {
                    var6 = arg2.field532 + method130(arg2.field536, false, field488.field536) + " (level-" + arg2.field536 + ")";
                } else {
                    var6 = arg2.field532 + " (skill-" + arg2.field535 + ")";
                }
                if (this.field199 == 1) {
                    this.field320[this.field268] = "Use " + this.field203 + " with @whi@" + var6;
                    this.field481[this.field268] = 78;
                    this.field482[this.field268] = arg3;
                    this.field479[this.field268] = arg1;
                    this.field480[this.field268] = arg0;
                    ++this.field268;
                } else if (this.field164 == 1) {
                    if ((this.field166 & 8) == 8) {
                        this.field320[this.field268] = this.field167 + " @whi@" + var6;
                        this.field481[this.field268] = 469;
                        this.field482[this.field268] = arg3;
                        this.field479[this.field268] = arg1;
                        this.field480[this.field268] = arg0;
                        ++this.field268;
                    }
                } else {
                    for (int var7 = 4; var7 >= 0; --var7) {
                        if (this.field128[var7] != null) {
                            this.field320[this.field268] = this.field128[var7] + " @whi@" + var6;
                            short var9 = 0;
                            if (this.field128[var7].equalsIgnoreCase("attack")) {
                                if (arg2.field536 > field488.field536) {
                                    var9 = 2000;
                                }
                                if (field488.field549 != 0 && arg2.field549 != 0) {
                                    if (field488.field549 == arg2.field549) {
                                        var9 = 2000;
                                    } else {
                                        var9 = 0;
                                    }
                                }
                            } else if (this.field129[var7]) {
                                var9 = 2000;
                            }
                            if (var7 == 0) {
                                this.field481[this.field268] = var9 + 888;
                            }
                            if (var7 == 1) {
                                this.field481[this.field268] = var9 + 341;
                            }
                            if (var7 == 2) {
                                this.field481[this.field268] = var9 + 758;
                            }
                            if (var7 == 3) {
                                this.field481[this.field268] = var9 + 437;
                            }
                            if (var7 == 4) {
                                this.field481[this.field268] = var9 + 608;
                            }
                            this.field482[this.field268] = arg3;
                            this.field479[this.field268] = arg1;
                            this.field480[this.field268] = arg0;
                            ++this.field268;
                        }
                    }
                }
                for (int var8 = 0; var8 < this.field268; ++var8) {
                    if (this.field481[var8] == 89) {
                        this.field320[var8] = "Walk here @whi@" + var6;
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "k", descriptor = "(I)V")
    public final void method37(int arg0) {
        this.field336.method376(-329);
        class12.field708 = this.field373;
        this.field256.method10(0, true, 0);
        if (this.field428 != -1) {
            this.method31(this.field96, 0, 0, class28.field1045[this.field428], 0);
        } else if (this.field194[this.field127] != -1) {
            this.method31(this.field96, 0, 0, class28.field1045[this.field194[this.field127]], 0);
        }
        if (this.field318 && this.field65 == 1) {
            this.method54((byte) 4);
        }
        this.field336.method377(super.field803, 553, 1926, 205);
        this.field338.method376(-329);
        class12.field708 = this.field374;
        if (arg0 != -48700) {
            this.field130 = 343;
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(Z)V")
    public final void method38(boolean arg0) {
        this.field241 = true;
        if (!arg0) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(II)Z")
    public final boolean method39(int arg0, int arg1) {
        if (arg0 != 7) {
            throw new NullPointerException();
        } else if (arg1 < 0) {
            return false;
        } else {
            int var3 = this.field481[arg1];
            if (var3 >= 2000) {
                var3 -= 2000;
            }
            return var3 == 726;
        }
    }

    @OriginalMember(owner = "client", name = "l", descriptor = "(I)V")
    public final void method40(int arg0) {
        if (arg0 >= 0) {
            this.field390 = null;
        }
        if (super.field817 == 1) {
            if (super.field818 >= 6 && super.field818 <= 106 && super.field819 >= 467 && super.field819 <= 499) {
                this.field477 = (this.field477 + 1) % 4;
                this.field218 = true;
                this.field222 = true;
                this.field391.method297(50, false);
                this.field391.method298(this.field477);
                this.field391.method298(this.field347);
                this.field391.method298(this.field212);
            }
            if (super.field818 >= 135 && super.field818 <= 235 && super.field819 >= 467 && super.field819 <= 499) {
                this.field347 = (this.field347 + 1) % 3;
                this.field218 = true;
                this.field222 = true;
                this.field391.method297(50, false);
                this.field391.method298(this.field477);
                this.field391.method298(this.field347);
                this.field391.method298(this.field212);
            }
            if (super.field818 >= 273 && super.field818 <= 373 && super.field819 >= 467 && super.field819 <= 499) {
                this.field212 = (this.field212 + 1) % 3;
                this.field218 = true;
                this.field222 = true;
                this.field391.method297(50, false);
                this.field391.method298(this.field477);
                this.field391.method298(this.field347);
                this.field391.method298(this.field212);
            }
            if (super.field818 >= 412 && super.field818 <= 512 && super.field819 >= 467 && super.field819 <= 499) {
                if (this.field150 == -1) {
                    this.method147((byte) 3);
                    this.field451 = "";
                    this.field494 = false;
                    for (int var2 = 0; var2 < class28.field1045.length; ++var2) {
                        if (class28.field1045[var2] != null && class28.field1045[var2].field1036 == 600) {
                            this.field314 = this.field150 = class28.field1045[var2].field1072;
                            return;
                        }
                    }
                    return;
                }
                this.method46("", false, 0, "Please close the interface you have open before using 'report abuse'");
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(II)V")
    public final void method41(int arg0, int arg1) {
        if (arg0 >= 0) {
            for (int var3 = 1; var3 > 0; ++var3) {
            }
        }
        int[] var4 = this.field235.field1581;
        int var5 = var4.length;
        for (int var6 = 0; var6 < var5; ++var6) {
            var4[var6] = 0;
        }
        for (int var7 = 1; var7 < 103; ++var7) {
            int var25 = (103 - var7) * 512 * 4 + 24628;
            for (int var26 = 1; var26 < 103; ++var26) {
                if ((this.field158[arg1][var26][var7] & 24) == 0) {
                    this.field456.method562(var4, var25, 512, arg1, var26, var7);
                }
                if (arg1 < 3 && (this.field158[arg1 + 1][var26][var7] & 8) != 0) {
                    this.field456.method562(var4, var25, 512, arg1 + 1, var26, var7);
                }
                var25 += 4;
            }
        }
        int var8 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var9 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        this.field235.method509(-329);
        for (int var10 = 1; var10 < 103; ++var10) {
            for (int var24 = 1; var24 < 103; ++var24) {
                if ((this.field158[arg1][var24][var10] & 24) == 0) {
                    this.method143(true, var9, var10, var8, var24, arg1);
                }
                if (arg1 < 3 && (this.field158[arg1 + 1][var24][var10] & 8) != 0) {
                    this.method143(true, var9, var10, var8, var24, arg1 + 1);
                }
            }
        }
        this.field338.method376(-329);
        ++field491;
        if (field491 > 1408) {
            field491 = 0;
            this.field391.method297(245, false);
            this.field391.method298(0);
            int var11 = this.field391.field1107;
            this.field391.method299(59308);
            this.field391.method299((int) (Math.random() * 65536.0D));
            this.field391.method298((int) (Math.random() * 256.0D));
            this.field391.method299((int) (Math.random() * 65536.0D));
            this.field391.method299(30947);
            this.field391.method299((int) (Math.random() * 65536.0D));
            this.field391.method299((int) (Math.random() * 65536.0D));
            this.field391.method298(181);
            this.field391.method298(44);
            if ((int) (Math.random() * 2.0D) == 0) {
                this.field391.method298(97);
            }
            this.field391.method307(this.field391.field1107 - var11, (byte) 4);
        }
        this.field368 = 0;
        for (int var12 = 0; var12 < 104; ++var12) {
            for (int var13 = 0; var13 < 104; ++var13) {
                int var14 = this.field456.method556(this.field169, var12, var13);
                if (var14 != 0) {
                    int var15 = var14 >> 14 & 32767;
                    int var16 = class63.method501(var15).field1515;
                    if (var16 >= 0) {
                        int var17 = var12;
                        int var18 = var13;
                        if (var16 != 22 && var16 != 29 && var16 != 34 && var16 != 36 && var16 != 46 && var16 != 47 && var16 != 48) {
                            byte var19 = 104;
                            byte var20 = 104;
                            int[][] var21 = this.field476[this.field169].field1503;
                            for (int var22 = 0; var22 < 10; ++var22) {
                                int var23 = (int) (Math.random() * 4.0D);
                                if (var23 == 0 && var17 > 0 && var17 > var12 - 3 && (var21[var17 - 1][var18] & 2621704) == 0) {
                                    --var17;
                                }
                                if (var23 == 1 && var17 < var19 - 1 && var17 < var12 + 3 && (var21[var17 + 1][var18] & 2621824) == 0) {
                                    ++var17;
                                }
                                if (var23 == 2 && var18 > 0 && var18 > var13 - 3 && (var21[var17][var18 - 1] & 2621698) == 0) {
                                    --var18;
                                }
                                if (var23 == 3 && var18 < var20 - 1 && var18 < var13 + 3 && (var21[var17][var18 + 1] & 2621728) == 0) {
                                    ++var18;
                                }
                            }
                        }
                        this.field376[this.field368] = this.field84[var16];
                        this.field369[this.field368] = var17;
                        this.field370[this.field368] = var18;
                        ++this.field368;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILINLHDAGO;I)V")
    private final void method42(int arg0, class29 arg1, int arg2) {
        this.field183 = 0;
        this.field422 = 0;
        this.method137(arg1, false, arg2);
        this.method118(184, arg1, arg2);
        this.method72(arg2, true, arg1);
        if (arg0 > 0) {
            for (int var4 = 0; var4 < this.field183; ++var4) {
                int var6 = this.field184[var4];
                if (field341 != this.field306[var6].field864) {
                    this.field306[var6].field531 = null;
                    this.field306[var6] = null;
                }
            }
            if (arg1.field1107 != arg2) {
                signlink.reporterror(this.field388 + " size mismatch in getnpcpos - pos:" + arg1.field1107 + " psize:" + arg2);
                throw new RuntimeException("eek");
            } else {
                for (int var5 = 0; var5 < this.field307; ++var5) {
                    if (this.field306[this.field308[var5]] == null) {
                        signlink.reporterror(this.field388 + " null entry in npc list - pos:" + var5 + " size:" + this.field307);
                        throw new RuntimeException("eek");
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(ZI)Ljava/lang/String;")
    public final String method43(boolean arg0, int arg1) {
        if (!arg0) {
            this.field391.method298(113);
        }
        return arg1 < 999999999 ? String.valueOf(arg1) : "*";
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(B)V")
    public final void method44(byte arg0) {
        if (arg0 != -96) {
            this.method149();
        }
        try {
            int var2 = field488.field885 + this.field393;
            int var3 = field488.field886 + this.field148;
            if (this.field246 - var2 < -500 || this.field246 - var2 > 500 || this.field247 - var3 < -500 || this.field247 - var3 > 500) {
                this.field246 = var2;
                this.field247 = var3;
            }
            if (this.field246 != var2) {
                this.field246 += (var2 - this.field246) / 16;
            }
            if (this.field247 != var3) {
                this.field247 += (var3 - this.field247) / 16;
            }
            if (super.field821[1] == 1) {
                this.field53 += (-24 - this.field53) / 2;
            } else if (super.field821[2] == 1) {
                this.field53 += (24 - this.field53) / 2;
            } else {
                this.field53 /= 2;
            }
            if (super.field821[3] == 1) {
                this.field54 += (12 - this.field54) / 2;
            } else if (super.field821[4] == 1) {
                this.field54 += (-12 - this.field54) / 2;
            } else {
                this.field54 /= 2;
            }
            this.field52 = this.field53 / 2 + this.field52 & 2047;
            this.field51 += this.field54 / 2;
            if (this.field51 < 128) {
                this.field51 = 128;
            }
            if (this.field51 > 383) {
                this.field51 = 383;
            }
            int var4 = this.field246 >> 7;
            int var5 = this.field247 >> 7;
            int var6 = this.method99(this.field247, this.field169, 0, this.field246);
            int var7 = 0;
            if (var4 > 3 && var5 > 3 && var4 < 100 && var5 < 100) {
                for (int var8 = var4 - 4; var8 <= var4 + 4; ++var8) {
                    for (int var9 = var5 - 4; var9 <= var5 + 4; ++var9) {
                        int var10 = this.field169;
                        if (var10 < 3 && (this.field158[1][var8][var9] & 2) == 2) {
                            ++var10;
                        }
                        int var11 = var6 - this.field299[var10][var8][var9];
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
            if (var12 > this.field112) {
                this.field112 += (var12 - this.field112) / 24;
            } else if (var12 < this.field112) {
                this.field112 += (var12 - this.field112) / 80;
            }
        } catch (Exception var13) {
            signlink.reporterror("glfc_ex " + field488.field885 + "," + field488.field886 + "," + this.field246 + "," + this.field247 + "," + this.field517 + "," + this.field518 + "," + this.field141 + "," + this.field142);
            throw new RuntimeException("eek");
        }
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(II)V")
    public final void method45(int arg0, int arg1) {
        if (arg1 != 0) {
            for (int var3 = 1; var3 > 0; ++var3) {
            }
        }
        signlink.wavevol = arg0;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;ZILjava/lang/String;)V")
    public final void method46(String arg0, boolean arg1, int arg2, String arg3) {
        if (arg1) {
            for (int var5 = 1; var5 > 0; ++var5) {
            }
        }
        if (arg2 == 0 && this.field514 != -1) {
            this.field414 = arg3;
            super.field817 = 0;
        }
        if (this.field357 == -1) {
            this.field222 = true;
        }
        for (int var6 = 99; var6 > 0; --var6) {
            this.field250[var6] = this.field250[var6 - 1];
            this.field251[var6] = this.field251[var6 - 1];
            this.field252[var6] = this.field252[var6 - 1];
        }
        this.field250[0] = arg2;
        this.field251[0] = arg0;
        this.field252[0] = arg3;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)V")
    public final void method47(String arg0, String arg1, boolean arg2) {
        signlink.errorname = arg0;
        try {
            if (!arg2) {
                this.field179 = "";
                this.field180 = "Connecting to server...";
                this.method84(true, (byte) 1);
            }
            this.field146 = new class71(this.method112(field176 + 43594), this, this.field189);
            long var4 = class55.method469(arg0);
            int var6 = (int) (var4 >> 16 & 31L);
            this.field391.field1107 = 0;
            this.field391.method298(14);
            this.field391.method298(var6);
            this.field146.method587(0, -208, this.field391.field1106, 2);
            for (int var7 = 0; var7 < 8; ++var7) {
                this.field146.method584();
            }
            int var8 = this.field146.method584();
            int var9 = var8;
            if (var8 == 0) {
                this.field146.method586(this.field61.field1106, 0, 8);
                this.field61.field1107 = 0;
                this.field519 = this.field61.method314((byte) -119);
                int[] var10 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (this.field519 >> 32), (int) this.field519 };
                this.field391.field1107 = 0;
                this.field391.method298(10);
                this.field391.method302(var10[0]);
                this.field391.method302(var10[1]);
                this.field391.method302(var10[2]);
                this.field391.method302(var10[3]);
                this.field391.method302(signlink.uid);
                this.field391.method305(arg0);
                this.field391.method305(arg1);
                this.field391.method323(field121, field502, 783);
                this.field220.field1107 = 0;
                if (arg2) {
                    this.field220.method298(18);
                } else {
                    this.field220.method298(16);
                }
                this.field220.method298(this.field391.field1107 + 36 + 1 + 1 + 2);
                this.field220.method298(255);
                this.field220.method299(307);
                this.field220.method298(field178 ? 1 : 0);
                for (int var11 = 0; var11 < 9; ++var11) {
                    this.field220.method302(this.field333[var11]);
                }
                this.field220.method306(3, this.field391.field1107, 0, this.field391.field1106);
                this.field391.field1111 = new class59(var10, false);
                for (int var12 = 0; var12 < 4; ++var12) {
                    var10[var12] += 50;
                }
                this.field354 = new class59(var10, false);
                this.field146.method587(0, -208, this.field220.field1106, this.field220.field1107);
                var8 = this.field146.method584();
            }
            if (var8 == 1) {
                try {
                    Thread.sleep(2000L);
                } catch (Exception var22) {
                }
                this.method47(arg0, arg1, arg2);
            } else if (var8 == 2) {
                this.field223 = this.field146.method584();
                field60 = this.field146.method584() == 1;
                this.field86 = 0L;
                this.field119 = 0;
                this.field215.field1468 = 0;
                super.field808 = true;
                this.field349 = true;
                this.field191 = true;
                this.field391.field1107 = 0;
                this.field61.field1107 = 0;
                this.field410 = -1;
                this.field364 = -1;
                this.field365 = -1;
                this.field366 = -1;
                this.field409 = 0;
                this.field411 = 0;
                this.field303 = 0;
                this.field413 = 0;
                this.field300 = 0;
                this.field268 = 0;
                this.field318 = false;
                super.field809 = 0;
                for (int var13 = 0; var13 < 100; ++var13) {
                    this.field252[var13] = null;
                }
                this.field199 = 0;
                this.field164 = 0;
                this.field122 = 0;
                this.field64 = 0;
                this.field393 = (int) (Math.random() * 100.0D) - 50;
                this.field148 = (int) (Math.random() * 110.0D) - 55;
                this.field208 = (int) (Math.random() * 80.0D) - 40;
                this.field226 = (int) (Math.random() * 120.0D) - 60;
                this.field406 = (int) (Math.random() * 30.0D) - 20;
                this.field52 = (int) (Math.random() * 20.0D) - 10 & 2047;
                this.field302 = 0;
                this.field311 = -1;
                this.field233 = 0;
                this.field234 = 0;
                this.field420 = 0;
                this.field307 = 0;
                for (int var14 = 0; var14 < this.field417; ++var14) {
                    this.field419[var14] = null;
                    this.field424[var14] = null;
                }
                for (int var15 = 0; var15 < 16384; ++var15) {
                    this.field306[var15] = null;
                }
                field488 = this.field419[this.field418] = new class8();
                this.field283.method431();
                this.field325.method431();
                for (int var16 = 0; var16 < 4; ++var16) {
                    for (int var17 = 0; var17 < 104; ++var17) {
                        for (int var18 = 0; var18 < 104; ++var18) {
                            this.field390[var16][var17][var18] = null;
                        }
                    }
                }
                this.field210 = new class51(0);
                this.field90 = 0;
                this.field89 = 0;
                this.field514 = -1;
                this.field357 = -1;
                this.field150 = -1;
                this.field428 = -1;
                this.field515 = -1;
                this.field497 = false;
                this.field127 = 3;
                this.field508 = false;
                this.field318 = false;
                this.field216 = false;
                this.field414 = null;
                this.field385 = 0;
                this.field134 = -1;
                this.field444 = true;
                this.method109(9);
                for (int var19 = 0; var19 < 5; ++var19) {
                    this.field145[var19] = 0;
                }
                for (int var20 = 0; var20 < 5; ++var20) {
                    this.field128[var20] = null;
                    this.field129[var20] = false;
                }
                field239 = 0;
                field335 = 0;
                field288 = 0;
                field105 = 0;
                field108 = 0;
                field415 = 0;
                field431 = 0;
                field198 = 0;
                field63 = 0;
                field161 = 0;
                this.method117(false);
            } else if (var8 == 3) {
                this.field179 = "";
                this.field180 = "Invalid username or password.";
            } else if (var8 == 4) {
                this.field179 = "Your account has been disabled.";
                this.field180 = "Please check your message-centre for details.";
            } else if (var8 == 5) {
                this.field179 = "Your account is already logged in.";
                this.field180 = "Try again in 60 secs...";
            } else if (var8 == 6) {
                this.field179 = "RuneScape has been updated!";
                this.field180 = "Please reload this page.";
            } else if (var8 == 7) {
                this.field179 = "This world is full.";
                this.field180 = "Please use a different world.";
            } else if (var8 == 8) {
                this.field179 = "Unable to connect.";
                this.field180 = "Login server offline.";
            } else if (var8 == 9) {
                this.field179 = "Login limit exceeded.";
                this.field180 = "Too many connections from your address.";
            } else if (var8 == 10) {
                this.field179 = "Unable to connect.";
                this.field180 = "Bad session id.";
            } else if (var8 == 11) {
                this.field180 = "Login server rejected session.";
                this.field180 = "Please try again.";
            } else if (var8 == 12) {
                this.field179 = "You need a members account to login to this world.";
                this.field180 = "Please subscribe, or use a different world.";
            } else if (var8 == 13) {
                this.field179 = "Could not complete login.";
                this.field180 = "Please try using a different world.";
            } else if (var8 == 14) {
                this.field179 = "The server is being updated.";
                this.field180 = "Please wait 1 minute and try again.";
            } else if (var8 == 15) {
                this.field191 = true;
                this.field391.field1107 = 0;
                this.field61.field1107 = 0;
                this.field410 = -1;
                this.field364 = -1;
                this.field365 = -1;
                this.field366 = -1;
                this.field409 = 0;
                this.field411 = 0;
                this.field303 = 0;
                this.field268 = 0;
                this.field318 = false;
                this.field98 = System.currentTimeMillis();
            } else if (var8 == 16) {
                this.field179 = "Login attempts exceeded.";
                this.field180 = "Please wait 1 minute and try again.";
            } else if (var8 == 17) {
                this.field179 = "You are standing in a members-only area.";
                this.field180 = "To play on this world move to a free area first";
            } else if (var8 == 20) {
                this.field179 = "Invalid loginserver requested";
                this.field180 = "Please try using a different world.";
            } else if (var8 != 21) {
                if (var8 == -1) {
                    if (var9 == 0) {
                        if (this.field255 < 2) {
                            try {
                                Thread.sleep(2000L);
                            } catch (Exception var24) {
                            }
                            ++this.field255;
                            this.method47(arg0, arg1, arg2);
                        } else {
                            this.field179 = "No response from loginserver";
                            this.field180 = "Please wait 1 minute and try again.";
                        }
                    } else {
                        this.field179 = "No response from server";
                        this.field180 = "Please try using a different world.";
                    }
                } else {
                    System.out.println("response:" + var8);
                    this.field179 = "Unexpected server response";
                    this.field180 = "Please try using a different world.";
                }
            } else {
                for (int var21 = this.field146.method584(); var21 >= 0; --var21) {
                    this.field179 = "You have only just left another world";
                    this.field180 = "Your profile will be transferred in: " + var21 + " seconds";
                    this.method84(true, (byte) 1);
                    try {
                        Thread.sleep(1000L);
                    } catch (Exception var23) {
                    }
                }
                this.method47(arg0, arg1, arg2);
            }
        } catch (IOException var25) {
            this.field179 = "";
            this.field180 = "Error connecting to server.";
        }
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(Z)V")
    public final void method48(boolean arg0) {
        if (arg0) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        this.field70 = 0;
        for (int var3 = -1; var3 < this.field420 + this.field307; ++var3) {
            class23 var20;
            if (var3 == -1) {
                var20 = field488;
            } else if (var3 < this.field420) {
                var20 = this.field419[this.field421[var3]];
            } else {
                var20 = this.field306[this.field308[var3 - this.field420]];
            }
            if (var20 != null && var20.method161((byte) 5)) {
                if (var20 instanceof class7) {
                    class14 var21 = ((class7) var20).field531;
                    if (var21.field745 != null) {
                        var21 = var21.method240(3);
                    }
                    if (var21 == null) {
                        continue;
                    }
                }
                if (var3 >= this.field420) {
                    class14 var25 = ((class7) var20).field531;
                    if (var25.field740 >= 0 && var25.field740 < this.field371.length) {
                        this.method100(var20.field912 + 15, var20, -571);
                        if (this.field171 > -1) {
                            this.field371[var25.field740].method514(this.field172 - 30, true, this.field171 - 12);
                        }
                    }
                    if (this.field300 == 1 && this.field308[var3 - this.field420] == this.field350 && field341 % 20 < 10) {
                        this.method100(var20.field912 + 15, var20, -571);
                        if (this.field171 > -1) {
                            this.field371[2].method514(this.field172 - 28, true, this.field171 - 12);
                        }
                    }
                } else {
                    int var22 = 30;
                    class8 var23 = (class8) var20;
                    if (var23.field542 != 0) {
                        this.method100(var20.field912 + 15, var20, -571);
                        if (this.field171 > -1) {
                            for (int var24 = 0; var24 < 8; ++var24) {
                                if ((var23.field542 & 1 << var24) != 0) {
                                    this.field371[var24].method514(this.field172 - var22, true, this.field171 - 12);
                                    var22 -= 25;
                                }
                            }
                        }
                    }
                    if (var3 >= 0 && this.field300 == 10 && this.field421[var3] == this.field125) {
                        this.method100(var20.field912 + 15, var20, -571);
                        if (this.field171 > -1) {
                            this.field371[7].method514(this.field172 - var22, true, this.field171 - 12);
                        }
                    }
                }
                if (var20.field863 != null && (var3 >= this.field420 || this.field477 == 0 || this.field477 == 3 || this.field477 == 1 && this.method106(7, ((class8) var20).field532))) {
                    this.method100(var20.field912, var20, -571);
                    if (this.field171 > -1 && this.field70 < this.field71) {
                        this.field75[this.field70] = this.field117.method359(var20.field863, -529) / 2;
                        this.field74[this.field70] = this.field117.field1198;
                        this.field72[this.field70] = this.field171;
                        this.field73[this.field70] = this.field172;
                        this.field76[this.field70] = var20.field884;
                        this.field77[this.field70] = var20.field903;
                        this.field78[this.field70] = var20.field882;
                        this.field79[this.field70++] = var20.field863;
                        if (this.field304 == 0 && var20.field903 >= 1 && var20.field903 <= 3) {
                            this.field74[this.field70] += 10;
                            this.field73[this.field70] += 5;
                        }
                        if (this.field304 == 0 && var20.field903 == 4) {
                            this.field75[this.field70] = 60;
                        }
                        if (this.field304 == 0 && var20.field903 == 5) {
                            this.field74[this.field70] += 5;
                        }
                    }
                }
                if (var20.field888 > field341) {
                    this.method100(var20.field912 + 15, var20, -571);
                    if (this.field171 > -1) {
                        int var26 = var20.field889 * 30 / var20.field890;
                        if (var26 > 30) {
                            var26 = 30;
                        }
                        class53.method458((byte) -119, var26, 65280, this.field172 - 3, this.field171 - 15, 5);
                        class53.method458((byte) -119, 30 - var26, 16711680, this.field172 - 3, this.field171 - 15 + var26, 5);
                    }
                }
                for (int var27 = 0; var27 < 4; ++var27) {
                    if (var20.field897[var27] > field341) {
                        this.method100(var20.field912 / 2, var20, -571);
                        if (this.field171 > -1) {
                            if (var27 == 1) {
                                this.field172 -= 20;
                            }
                            if (var27 == 2) {
                                this.field171 -= 15;
                                this.field172 -= 10;
                            }
                            if (var27 == 3) {
                                this.field171 += 15;
                                this.field172 -= 10;
                            }
                            this.field326[var20.field896[var27]].method514(this.field172 - 12, true, this.field171 - 12);
                            this.field115.method356(565, this.field172 + 4, 0, String.valueOf(var20.field895[var27]), this.field171);
                            this.field115.method356(565, this.field172 + 3, 16777215, String.valueOf(var20.field895[var27]), this.field171 - 1);
                        }
                    }
                }
            }
        }
        for (int var4 = 0; var4 < this.field70; ++var4) {
            int var5 = this.field72[var4];
            int var6 = this.field73[var4];
            int var7 = this.field75[var4];
            int var8 = this.field74[var4];
            boolean var9 = true;
            while (var9) {
                var9 = false;
                for (int var19 = 0; var19 < var4; ++var19) {
                    if (var6 + 2 > this.field73[var19] - this.field74[var19] && var6 - var8 < this.field73[var19] + 2 && var5 - var7 < this.field75[var19] + this.field72[var19] && var5 + var7 > this.field72[var19] - this.field75[var19] && this.field73[var19] - this.field74[var19] < var6) {
                        var6 = this.field73[var19] - this.field74[var19];
                        var9 = true;
                    }
                }
            }
            this.field171 = this.field72[var4];
            this.field172 = this.field73[var4] = var6;
            String var10 = this.field79[var4];
            if (this.field304 == 0) {
                int var11 = 16776960;
                if (this.field76[var4] < 6) {
                    var11 = this.field114[this.field76[var4]];
                }
                if (this.field76[var4] == 6) {
                    var11 = this.field245 % 20 < 10 ? 16711680 : 16776960;
                }
                if (this.field76[var4] == 7) {
                    var11 = this.field245 % 20 < 10 ? 255 : 65535;
                }
                if (this.field76[var4] == 8) {
                    var11 = this.field245 % 20 < 10 ? 45056 : 8454016;
                }
                if (this.field76[var4] == 9) {
                    int var12 = 150 - this.field78[var4];
                    if (var12 < 50) {
                        var11 = var12 * 1280 + 16711680;
                    } else if (var12 < 100) {
                        var11 = 16776960 - (var12 - 50) * 327680;
                    } else if (var12 < 150) {
                        var11 = (var12 - 100) * 5 + 65280;
                    }
                }
                if (this.field76[var4] == 10) {
                    int var13 = 150 - this.field78[var4];
                    if (var13 < 50) {
                        var11 = var13 * 5 + 16711680;
                    } else if (var13 < 100) {
                        var11 = 16711935 - (var13 - 50) * 327680;
                    } else if (var13 < 150) {
                        var11 = (var13 - 100) * 327680 + 255 - (var13 - 100) * 5;
                    }
                }
                if (this.field76[var4] == 11) {
                    int var14 = 150 - this.field78[var4];
                    if (var14 < 50) {
                        var11 = 16777215 - var14 * 327685;
                    } else if (var14 < 100) {
                        var11 = (var14 - 50) * 327685 + 65280;
                    } else if (var14 < 150) {
                        var11 = 16777215 - (var14 - 100) * 327680;
                    }
                }
                if (this.field77[var4] == 0) {
                    this.field117.method356(565, this.field172 + 1, 0, var10, this.field171);
                    this.field117.method356(565, this.field172, var11, var10, this.field171);
                }
                if (this.field77[var4] == 1) {
                    this.field117.method361(this.field245, var10, this.field171, -44040, this.field172 + 1, 0);
                    this.field117.method361(this.field245, var10, this.field171, -44040, this.field172, var11);
                }
                if (this.field77[var4] == 2) {
                    this.field117.method362(this.field245, var10, this.field172 + 1, 0, 7, this.field171);
                    this.field117.method362(this.field245, var10, this.field172, var11, 7, this.field171);
                }
                if (this.field77[var4] == 3) {
                    this.field117.method363(this.field245, this.field172 + 1, 150 - this.field78[var4], 0, 0, var10, this.field171);
                    this.field117.method363(this.field245, this.field172, 150 - this.field78[var4], var11, 0, var10, this.field171);
                }
                if (this.field77[var4] == 4) {
                    int var15 = this.field117.method359(var10, -529);
                    int var16 = (150 - this.field78[var4]) * (var15 + 100) / 150;
                    class53.method455(this.field171 + 50, 1, 334, 0, this.field171 - 50);
                    this.field117.method360(true, this.field171 + 50 - var16, 0, var10, this.field172 + 1);
                    this.field117.method360(true, this.field171 + 50 - var16, var11, var10, this.field172);
                    class53.method454(true);
                }
                if (this.field77[var4] == 5) {
                    int var17 = 150 - this.field78[var4];
                    int var18 = 0;
                    if (var17 < 25) {
                        var18 = var17 - 25;
                    } else if (var17 > 125) {
                        var18 = var17 - 125;
                    }
                    class53.method455(512, 1, this.field172 + 5, this.field172 - this.field117.field1198 - 1, 0);
                    this.field117.method356(565, this.field172 + 1 + var18, 0, var10, this.field171);
                    this.field117.method356(565, this.field172 + var18, var11, var10, this.field171);
                    class53.method454(true);
                }
            } else {
                this.field117.method356(565, this.field172 + 1, 0, var10, this.field171);
                this.field117.method356(565, this.field172, 16776960, var10, this.field171);
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(B)V")
    public final void method49(byte arg0) {
        if (this.field435 == null) {
            super.field804 = null;
            this.field339 = null;
            this.field337 = null;
            this.field336 = null;
            this.field338 = null;
            this.field274 = null;
            this.field275 = null;
            this.field276 = null;
            this.field438 = new class39(128, 265, this.method136(0), 0);
            class53.method456(true);
            this.field439 = new class39(128, 265, this.method136(0), 0);
            class53.method456(true);
            if (arg0 != 9) {
                this.field197 = -302;
            }
            this.field435 = new class39(509, 171, this.method136(0), 0);
            class53.method456(true);
            this.field436 = new class39(360, 132, this.method136(0), 0);
            class53.method456(true);
            this.field437 = new class39(360, 200, this.method136(0), 0);
            class53.method456(true);
            this.field440 = new class39(202, 238, this.method136(0), 0);
            class53.method456(true);
            this.field441 = new class39(203, 238, this.method136(0), 0);
            class53.method456(true);
            this.field442 = new class39(74, 94, this.method136(0), 0);
            class53.method456(true);
            this.field443 = new class39(75, 94, this.method136(0), 0);
            class53.method456(true);
            if (this.field506 != null) {
                this.method94(false);
                this.method28(true);
            }
            this.field241 = true;
        }
    }

    @OriginalMember(owner = "client", name = "m", descriptor = "(I)V")
    public final void method50(int arg0) {
        this.field337.method376(-329);
        if (this.field302 == 2) {
            byte[] var2 = this.field257.field32;
            int[] var3 = class53.field1381;
            int var4 = var2.length;
            for (int var5 = 0; var5 < var4; ++var5) {
                if (var2[var5] == 0) {
                    var3[var5] = 0;
                }
            }
            this.field416.method518(this.field52, 33, 0, 33, 0, 25, this.field126, 256, false, 25, this.field315);
            this.field338.method376(-329);
        } else {
            int var6 = this.field52 + this.field226 & 2047;
            int var7 = field488.field885 / 32 + 48;
            int var8 = 464 - field488.field886 / 32;
            while (arg0 >= 0) {
                this.field390 = null;
            }
            this.field235.method518(var6, 146, 5, 151, 25, var8, this.field309, this.field406 + 256, false, var7, this.field301);
            this.field416.method518(this.field52, 33, 0, 33, 0, 25, this.field126, 256, false, 25, this.field315);
            for (int var9 = 0; var9 < this.field368; ++var9) {
                int var39 = this.field369[var9] * 4 + 2 - field488.field885 / 32;
                int var40 = this.field370[var9] * 4 + 2 - field488.field886 / 32;
                this.method20(var39, var40, this.field376[var9], 0);
            }
            for (int var10 = 0; var10 < 104; ++var10) {
                for (int var35 = 0; var35 < 104; ++var35) {
                    class51 var36 = this.field390[this.field169][var10][var35];
                    if (var36 != null) {
                        int var37 = var10 * 4 + 2 - field488.field885 / 32;
                        int var38 = var35 * 4 + 2 - field488.field886 / 32;
                        this.method20(var37, var38, this.field293, 0);
                    }
                }
            }
            for (int var11 = 0; var11 < this.field307; ++var11) {
                class7 var31 = this.field306[this.field308[var11]];
                if (var31 != null && var31.method161((byte) 5)) {
                    class14 var32 = var31.field531;
                    if (var32.field745 != null) {
                        var32 = var32.method240(3);
                    }
                    if (var32 != null && var32.field733) {
                        int var33 = var31.field885 / 32 - field488.field885 / 32;
                        int var34 = var31.field886 / 32 - field488.field886 / 32;
                        this.method20(var33, var34, this.field294, 0);
                    }
                }
            }
            for (int var12 = 0; var12 < this.field420; ++var12) {
                class8 var23 = this.field419[this.field421[var12]];
                if (var23 != null && var23.method161((byte) 5)) {
                    int var24 = var23.field885 / 32 - field488.field885 / 32;
                    int var25 = var23.field886 / 32 - field488.field886 / 32;
                    boolean var26 = false;
                    long var27 = class55.method469(var23.field532);
                    for (int var29 = 0; var29 < this.field89; ++var29) {
                        if (this.field284[var29] == var27 && this.field475[var29] != 0) {
                            var26 = true;
                            break;
                        }
                    }
                    boolean var30 = false;
                    if (field488.field549 != 0 && var23.field549 != 0 && field488.field549 == var23.field549) {
                        var30 = true;
                    }
                    if (var26) {
                        this.method20(var24, var25, this.field296, 0);
                    } else if (var30) {
                        this.method20(var24, var25, this.field297, 0);
                    } else {
                        this.method20(var24, var25, this.field295, 0);
                    }
                }
            }
            if (this.field300 != 0 && field341 % 20 < 10) {
                if (this.field300 == 1 && this.field350 >= 0 && this.field350 < this.field306.length) {
                    class7 var13 = this.field306[this.field350];
                    if (var13 != null) {
                        int var14 = var13.field885 / 32 - field488.field885 / 32;
                        int var15 = var13.field886 / 32 - field488.field886 / 32;
                        this.method98(var15, 0, this.field57, var14);
                    }
                }
                if (this.field300 == 2) {
                    int var16 = (this.field358 - this.field141) * 4 + 2 - field488.field885 / 32;
                    int var17 = (this.field359 - this.field142) * 4 + 2 - field488.field886 / 32;
                    this.method98(var17, 0, this.field57, var16);
                }
                if (this.field300 == 10 && this.field125 >= 0 && this.field125 < this.field419.length) {
                    class8 var18 = this.field419[this.field125];
                    if (var18 != null) {
                        int var19 = var18.field885 / 32 - field488.field885 / 32;
                        int var20 = var18.field886 / 32 - field488.field886 / 32;
                        this.method98(var20, 0, this.field57, var19);
                    }
                }
            }
            if (this.field233 != 0) {
                int var21 = this.field233 * 4 + 2 - field488.field885 / 32;
                int var22 = this.field234 * 4 + 2 - field488.field886 / 32;
                this.method20(var21, var22, this.field56, 0);
            }
            class53.method458((byte) -119, 3, 16777215, 78, 97, 3);
            this.field338.method376(-329);
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(B)V")
    public final void method51(byte arg0) {
        this.field214 = true;
        if (arg0 != 4) {
            field298 = !field298;
        }
        try {
            long var2 = System.currentTimeMillis();
            int var4 = 0;
            int var5 = 20;
            while (this.field503) {
                ++this.field237;
                this.method91(989);
                this.method91(989);
                this.method146(false);
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
        this.field214 = false;
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(Z)V")
    public final void method52(boolean arg0) {
        signlink.reporterror = false;
        try {
            if (this.field146 != null) {
                this.field146.method583();
            }
        } catch (Exception var2) {
        }
        this.field146 = null;
        this.method88(1);
        if (this.field215 != null) {
            this.field215.field1463 = false;
        }
        this.field215 = null;
        this.field384.method166();
        this.field384 = null;
        this.field305 = null;
        this.field391 = null;
        this.field220 = null;
        this.field61 = null;
        this.field264 = null;
        this.field478 = null;
        this.field207 = null;
        this.field265 = null;
        this.field266 = null;
        this.field299 = null;
        this.field158 = null;
        this.field456 = null;
        this.field476 = null;
        this.field205 = null;
        this.field192 = null;
        this.field489 = null;
        this.field490 = null;
        this.field254 = null;
        this.field336 = null;
        this.field337 = null;
        this.field338 = null;
        this.field339 = null;
        this.field274 = null;
        this.field275 = null;
        this.field276 = null;
        this.field466 = null;
        this.field467 = null;
        this.field468 = null;
        this.field469 = null;
        this.field470 = null;
        this.field471 = null;
        this.field472 = null;
        this.field473 = null;
        this.field474 = null;
        this.field256 = null;
        this.field257 = null;
        this.field258 = null;
        this.field228 = null;
        this.field229 = null;
        this.field230 = null;
        this.field397 = null;
        this.field277 = null;
        this.field278 = null;
        this.field279 = null;
        this.field280 = null;
        this.field281 = null;
        this.field461 = null;
        this.field462 = null;
        this.field463 = null;
        this.field464 = null;
        this.field465 = null;
        this.field416 = null;
        this.field326 = null;
        this.field371 = null;
        this.field186 = null;
        this.field293 = null;
        this.field294 = null;
        this.field295 = null;
        this.field296 = null;
        this.field297 = null;
        this.field522 = null;
        this.field84 = null;
        if (!arg0) {
            this.field390 = null;
        }
        this.field110 = null;
        this.field419 = null;
        this.field421 = null;
        this.field423 = null;
        this.field424 = null;
        this.field184 = null;
        this.field306 = null;
        this.field308 = null;
        this.field390 = null;
        this.field210 = null;
        this.field283 = null;
        this.field325 = null;
        this.field479 = null;
        this.field480 = null;
        this.field481 = null;
        this.field482 = null;
        this.field320 = null;
        this.field353 = null;
        this.field369 = null;
        this.field370 = null;
        this.field376 = null;
        this.field235 = null;
        this.field401 = null;
        this.field284 = null;
        this.field475 = null;
        this.field438 = null;
        this.field439 = null;
        this.field435 = null;
        this.field436 = null;
        this.field437 = null;
        this.field440 = null;
        this.field441 = null;
        this.field442 = null;
        this.field443 = null;
        this.method116(0);
        class63.method500(false);
        class14.method241(false);
        class27.method278(false);
        class56.field1412 = null;
        class21.field843 = null;
        class28.field1045 = null;
        class20.field828 = null;
        class26.field949 = null;
        class70.field1694 = null;
        class70.field1706 = null;
        class64.field1558 = null;
        super.field804 = null;
        class8.field539 = null;
        class12.method217(false);
        class67.method526(false);
        class10.method187(false);
        class5.method14(false);
        System.gc();
        if (class13.field723) {
        }
    }

    @OriginalMember(owner = "client", name = "n", descriptor = "(I)V")
    public final void method53(int arg0) {
        if (this.field199 == 0 && this.field164 == 0) {
            this.field320[this.field268] = "Walk here";
            this.field481[this.field268] = 89;
            this.field479[this.field268] = super.field811;
            this.field480[this.field268] = super.field812;
            ++this.field268;
        }
        int var2 = -1;
        for (int var3 = 0; var3 < class10.field678; ++var3) {
            int var5 = class10.field679[var3];
            int var6 = var5 & 127;
            int var7 = var5 >> 7 & 127;
            int var8 = var5 >> 29 & 3;
            int var9 = var5 >> 14 & 32767;
            if (var2 != var5) {
                var2 = var5;
                if (var8 == 2 && this.field456.method557(this.field169, var6, var7, var5) >= 0) {
                    class63 var10 = class63.method501(var9);
                    if (var10.field1554 != null) {
                        var10 = var10.method499(false);
                    }
                    if (var10 == null) {
                        continue;
                    }
                    if (this.field199 == 1) {
                        this.field320[this.field268] = "Use " + this.field203 + " with @cya@" + var10.field1519;
                        this.field481[this.field268] = 317;
                        this.field482[this.field268] = var5;
                        this.field479[this.field268] = var6;
                        this.field480[this.field268] = var7;
                        ++this.field268;
                    } else if (this.field164 == 1) {
                        if ((this.field166 & 4) == 4) {
                            this.field320[this.field268] = this.field167 + " @cya@" + var10.field1519;
                            this.field481[this.field268] = 364;
                            this.field482[this.field268] = var5;
                            this.field479[this.field268] = var6;
                            this.field480[this.field268] = var7;
                            ++this.field268;
                        }
                    } else {
                        if (var10.field1521 != null) {
                            for (int var11 = 4; var11 >= 0; --var11) {
                                if (var10.field1521[var11] != null) {
                                    this.field320[this.field268] = var10.field1521[var11] + " @cya@" + var10.field1519;
                                    if (var11 == 0) {
                                        this.field481[this.field268] = 607;
                                    }
                                    if (var11 == 1) {
                                        this.field481[this.field268] = 872;
                                    }
                                    if (var11 == 2) {
                                        this.field481[this.field268] = 323;
                                    }
                                    if (var11 == 3) {
                                        this.field481[this.field268] = 113;
                                    }
                                    if (var11 == 4) {
                                        this.field481[this.field268] = 1416;
                                    }
                                    this.field482[this.field268] = var5;
                                    this.field479[this.field268] = var6;
                                    this.field480[this.field268] = var7;
                                    ++this.field268;
                                }
                            }
                        }
                        this.field320[this.field268] = "Examine @cya@" + var10.field1519;
                        this.field481[this.field268] = 1033;
                        this.field482[this.field268] = var10.field1510 << 14;
                        this.field479[this.field268] = var6;
                        this.field480[this.field268] = var7;
                        ++this.field268;
                    }
                }
                if (var8 == 1) {
                    class7 var12 = this.field306[var9];
                    if (var12.field531.field762 == 1 && (var12.field885 & 127) == 64 && (var12.field886 & 127) == 64) {
                        for (int var13 = 0; var13 < this.field307; ++var13) {
                            class7 var16 = this.field306[this.field308[var13]];
                            if (var16 != null && var12 != var16 && var16.field531.field762 == 1 && var12.field885 == var16.field885 && var12.field886 == var16.field886) {
                                this.method96(var16.field531, var7, this.field80, var6, this.field308[var13]);
                            }
                        }
                        for (int var14 = 0; var14 < this.field420; ++var14) {
                            class8 var15 = this.field419[this.field421[var14]];
                            if (var15 != null && var12.field885 == var15.field885 && var12.field886 == var15.field886) {
                                this.method36(var7, var6, var15, this.field421[var14], false);
                            }
                        }
                    }
                    this.method96(var12.field531, var7, this.field80, var6, var9);
                }
                if (var8 == 0) {
                    class8 var17 = this.field419[var9];
                    if ((var17.field885 & 127) == 64 && (var17.field886 & 127) == 64) {
                        for (int var18 = 0; var18 < this.field307; ++var18) {
                            class7 var21 = this.field306[this.field308[var18]];
                            if (var21 != null && var21.field531.field762 == 1 && var17.field885 == var21.field885 && var17.field886 == var21.field886) {
                                this.method96(var21.field531, var7, this.field80, var6, this.field308[var18]);
                            }
                        }
                        for (int var19 = 0; var19 < this.field420; ++var19) {
                            class8 var20 = this.field419[this.field421[var19]];
                            if (var20 != null && var17 != var20 && var17.field885 == var20.field885 && var17.field886 == var20.field886) {
                                this.method36(var7, var6, var20, this.field421[var19], false);
                            }
                        }
                    }
                    this.method36(var7, var6, var17, var9, false);
                }
                if (var8 == 3) {
                    class51 var22 = this.field390[this.field169][var6][var7];
                    if (var22 != null) {
                        for (class69 var23 = (class69) var22.method428(0); var23 != null; var23 = (class69) var22.method430(true)) {
                            class27 var24 = class27.method286(var23.field1689);
                            if (this.field199 == 1) {
                                this.field320[this.field268] = "Use " + this.field203 + " with @lre@" + var24.field1004;
                                this.field481[this.field268] = 633;
                                this.field482[this.field268] = var23.field1689;
                                this.field479[this.field268] = var6;
                                this.field480[this.field268] = var7;
                                ++this.field268;
                            } else if (this.field164 == 1) {
                                if ((this.field166 & 1) == 1) {
                                    this.field320[this.field268] = this.field167 + " @lre@" + var24.field1004;
                                    this.field481[this.field268] = 122;
                                    this.field482[this.field268] = var23.field1689;
                                    this.field479[this.field268] = var6;
                                    this.field480[this.field268] = var7;
                                    ++this.field268;
                                }
                            } else {
                                for (int var25 = 4; var25 >= 0; --var25) {
                                    if (var24.field970 != null && var24.field970[var25] != null) {
                                        this.field320[this.field268] = var24.field970[var25] + " @lre@" + var24.field1004;
                                        if (var25 == 0) {
                                            this.field481[this.field268] = 143;
                                        }
                                        if (var25 == 1) {
                                            this.field481[this.field268] = 62;
                                        }
                                        if (var25 == 2) {
                                            this.field481[this.field268] = 473;
                                        }
                                        if (var25 == 3) {
                                            this.field481[this.field268] = 959;
                                        }
                                        if (var25 == 4) {
                                            this.field481[this.field268] = 985;
                                        }
                                        this.field482[this.field268] = var23.field1689;
                                        this.field479[this.field268] = var6;
                                        this.field480[this.field268] = var7;
                                        ++this.field268;
                                    } else if (var25 == 2) {
                                        this.field320[this.field268] = "Take @lre@" + var24.field1004;
                                        this.field481[this.field268] = 473;
                                        this.field482[this.field268] = var23.field1689;
                                        this.field479[this.field268] = var6;
                                        this.field480[this.field268] = var7;
                                        ++this.field268;
                                    }
                                }
                                this.field320[this.field268] = "Examine @lre@" + var24.field1004;
                                this.field481[this.field268] = 1385;
                                this.field482[this.field268] = var23.field1689;
                                this.field479[this.field268] = var6;
                                this.field480[this.field268] = var7;
                                ++this.field268;
                            }
                        }
                    }
                }
            }
        }
        int var4 = 27 / arg0;
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(B)V")
    public final void method54(byte arg0) {
        int var2 = this.field66;
        int var3 = this.field67;
        int var4 = this.field68;
        int var5 = this.field69;
        int var6 = 6116423;
        class53.method458((byte) -119, var4, var6, var3, var2, var5);
        class53.method458((byte) -119, var4 - 2, 0, var3 + 1, var2 + 1, 16);
        if (arg0 != 4) {
            this.method149();
        }
        class53.method459(0, var2 + 1, var4 - 2, var5 - 19, var3 + 18, 2);
        this.field117.method360(true, var2 + 3, var6, "Choose Option", var3 + 14);
        int var7 = super.field811;
        int var8 = super.field812;
        if (this.field65 == 0) {
            var7 -= 4;
            var8 -= 4;
        }
        if (this.field65 == 1) {
            var7 -= 553;
            var8 -= 205;
        }
        if (this.field65 == 2) {
            var7 -= 17;
            var8 -= 357;
        }
        for (int var9 = 0; var9 < this.field268; ++var9) {
            int var10 = (this.field268 - 1 - var9) * 15 + var3 + 31;
            int var11 = 16777215;
            if (var7 > var2 && var7 < var2 + var4 && var8 > var10 - 13 && var8 < var10 + 3) {
                var11 = 16776960;
            }
            this.field117.method364(var11, var10, (byte) 9, var2 + 3, true, this.field320[var9]);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LHPPBIEYV;Z)Z")
    public final boolean method55(class28 arg0, boolean arg1) {
        if (arg0.field1063 == null) {
            return false;
        } else {
            for (int var3 = 0; var3 < arg0.field1063.length; ++var3) {
                int var4 = this.method144(arg0, false, var3);
                int var5 = arg0.field1040[var3];
                if (arg0.field1063[var3] == 2) {
                    if (var4 >= var5) {
                        return false;
                    }
                } else if (arg0.field1063[var3] == 3) {
                    if (var4 <= var5) {
                        return false;
                    }
                } else if (arg0.field1063[var3] == 4) {
                    if (var4 == var5) {
                        return false;
                    }
                } else if (var4 != var5) {
                    return false;
                }
            }
            if (!arg1) {
                throw new NullPointerException();
            } else {
                return true;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(JI)V")
    public final void method56(long arg0, int arg1) {
        if (arg0 != 0L) {
            for (int var4 = 0; var4 < this.field367; ++var4) {
                if (this.field459[var4] == arg0) {
                    --this.field367;
                    this.field334 = true;
                    for (int var5 = var4; var5 < this.field367; ++var5) {
                        this.field459[var5] = this.field459[var5 + 1];
                    }
                    this.field391.method297(227, false);
                    this.field391.method304(8, arg0);
                    break;
                }
            }
            if (arg1 >= 0) {
                this.field390 = null;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LPAWLWNVI;I)V")
    private final void method57(class47 arg0, int arg1) {
        int var3 = 0;
        int var4 = -1;
        int var5 = 0;
        int var6 = 0;
        if (arg0.field1307 == 0) {
            var3 = this.field456.method553(arg0.field1306, arg0.field1308, arg0.field1309);
        }
        if (arg0.field1307 == 1) {
            var3 = this.field456.method554(arg0.field1306, arg0.field1309, 210, arg0.field1308);
        }
        if (arg0.field1307 == 2) {
            var3 = this.field456.method555(arg0.field1306, arg0.field1308, arg0.field1309);
        }
        if (arg0.field1307 == 3) {
            var3 = this.field456.method556(arg0.field1306, arg0.field1308, arg0.field1309);
        }
        if (var3 != 0) {
            int var7 = this.field456.method557(arg0.field1306, arg0.field1308, arg0.field1309, var3);
            var4 = var3 >> 14 & 32767;
            var5 = var7 & 31;
            var6 = var7 >> 6;
        }
        arg0.field1303 = var4;
        arg0.field1305 = var5;
        arg0.field1304 = var6;
        if (arg1 <= 0) {
            this.field390 = null;
        }
    }

    @OriginalMember(owner = "client", name = "o", descriptor = "(I)V")
    public final void method58(int arg0) {
        for (class57 var2 = (class57) this.field283.method427(); var2 != null; var2 = (class57) this.field283.method429(0)) {
            if (this.field169 == var2.field1429 && field341 <= var2.field1436) {
                if (field341 >= var2.field1435) {
                    if (var2.field1426 > 0) {
                        class7 var3 = this.field306[var2.field1426 - 1];
                        if (var3 != null && var3.field885 >= 0 && var3.field885 < 13312 && var3.field886 >= 0 && var3.field886 < 13312) {
                            var2.method479(var3.field885, var3.field886, this.field355, field341, this.method99(var3.field886, var2.field1429, 0, var3.field885) - var2.field1434);
                        }
                    }
                    if (var2.field1426 < 0) {
                        int var4 = -var2.field1426 - 1;
                        class8 var5;
                        if (this.field85 == var4) {
                            var5 = field488;
                        } else {
                            var5 = this.field419[var4];
                        }
                        if (var5 != null && var5.field885 >= 0 && var5.field885 < 13312 && var5.field886 >= 0 && var5.field886 < 13312) {
                            var2.method479(var5.field885, var5.field886, this.field355, field341, this.method99(var5.field886, var2.field1429, 0, var5.field885) - var2.field1434);
                        }
                    }
                    var2.method480(true, this.field262);
                    this.field456.method538((int) var2.field1442, this.field169, -610, (int) var2.field1441, false, 60, var2, -1, var2.field1447, (int) var2.field1443);
                }
            } else {
                var2.method234();
            }
        }
        ++field120;
        if (arg0 >= 0) {
            this.field516 = !this.field516;
        }
        if (field120 > 58) {
            field120 = 0;
            this.field391.method297(83, false);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZLHPPBIEYV;)Z")
    public final boolean method59(boolean arg0, class28 arg1) {
        int var3 = arg1.field1036;
        if (arg0) {
            this.field410 = this.field61.method308();
        }
        if ((var3 < 1 || var3 > 200) && (var3 < 701 || var3 > 900)) {
            if (var3 >= 401 && var3 <= 500) {
                this.field320[this.field268] = "Remove @whi@" + arg1.field1037;
                this.field481[this.field268] = 200;
                ++this.field268;
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
            this.field320[this.field268] = "Remove @whi@" + this.field401[var3];
            this.field481[this.field268] = 649;
            ++this.field268;
            this.field320[this.field268] = "Message @whi@" + this.field401[var3];
            this.field481[this.field268] = 456;
            ++this.field268;
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(B)V")
    public final void method60(byte arg0) {
        if (arg0 != -70) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        while (true) {
            class6 var3 = this.field384.method182();
            if (var3 == null) {
                return;
            }
            if (var3.field525 == 0) {
                class10.method189(var3.field526, var3.field528, false);
                if ((this.field384.method165(false, var3.field526) & 98) != 0) {
                    this.field334 = true;
                    if (this.field357 != -1) {
                        this.field222 = true;
                    }
                }
            }
            if (var3.field525 == 1 && var3.field528 != null) {
                class5.method13(var3.field528, false);
            }
            if (var3.field525 == 2 && this.field316 == var3.field526 && var3.field528 != null) {
                this.method139(this.field317, (byte) -80, var3.field528);
            }
            if (var3.field525 == 3 && this.field122 == 1) {
                for (int var4 = 0; var4 < this.field478.length; ++var4) {
                    if (this.field265[var4] == var3.field526) {
                        this.field478[var4] = var3.field528;
                        if (var3.field528 == null) {
                            this.field265[var4] = -1;
                        }
                        break;
                    }
                    if (this.field266[var4] == var3.field526) {
                        this.field207[var4] = var3.field528;
                        if (var3.field528 == null) {
                            this.field266[var4] = -1;
                        }
                        break;
                    }
                }
            }
            if (var3.field525 == 93 && this.field384.method176(var3.field526, (byte) 7)) {
                class52.method437(this.field384, this.field217, new class29((byte) -28, var3.field528));
            }
        }
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(II)V")
    public final void method61(int arg0, int arg1) {
        int var3 = class64.field1558[arg1].field1566;
        if (var3 != 0) {
            int var4 = this.field353[arg1];
            if (arg0 != -35444) {
                this.field410 = this.field61.method308();
            }
            if (var3 == 1) {
                if (var4 == 1) {
                    class12.method226(false, 0.9D);
                }
                if (var4 == 2) {
                    class12.method226(false, 0.8D);
                }
                if (var4 == 3) {
                    class12.method226(false, 0.7D);
                }
                if (var4 == 4) {
                    class12.method226(false, 0.6D);
                }
                class27.field980.method423();
                this.field241 = true;
            }
            if (var3 == 3) {
                boolean var5 = this.field363;
                if (var4 == 0) {
                    this.method22(0, this.field363, false);
                    this.field363 = true;
                }
                if (var4 == 1) {
                    this.method22(-400, this.field363, false);
                    this.field363 = true;
                }
                if (var4 == 2) {
                    this.method22(-800, this.field363, false);
                    this.field363 = true;
                }
                if (var4 == 3) {
                    this.method22(-1200, this.field363, false);
                    this.field363 = true;
                }
                if (var4 == 4) {
                    this.field363 = false;
                }
                if (this.field363 != var5 && !field178) {
                    if (this.field363) {
                        this.field316 = this.field187;
                        this.field317 = true;
                        this.field384.method171(2, this.field316);
                    } else {
                        this.method88(1);
                    }
                    this.field244 = 0;
                }
            }
            if (var3 == 4) {
                if (var4 == 0) {
                    this.field168 = true;
                    this.method45(0, 0);
                }
                if (var4 == 1) {
                    this.field168 = true;
                    this.method45(-400, 0);
                }
                if (var4 == 2) {
                    this.field168 = true;
                    this.method45(-800, 0);
                }
                if (var4 == 3) {
                    this.field168 = true;
                    this.method45(-1200, 0);
                }
                if (var4 == 4) {
                    this.field168 = false;
                }
            }
            if (var3 == 5) {
                this.field55 = var4;
            }
            if (var3 == 6) {
                this.field304 = var4;
            }
            if (var3 == 8) {
                this.field196 = var4;
                this.field222 = true;
            }
            if (var3 == 9) {
                this.field340 = var4;
            }
        }
    }

    @OriginalMember(owner = "client", name = "p", descriptor = "(I)V")
    public final void method62(int arg0) {
        if (this.field303 > 1) {
            --this.field303;
        }
        if (this.field413 > 0) {
            --this.field413;
        }
        for (int var2 = 0; var2 < 5 && this.method29(-359); ++var2) {
        }
        if (this.field191) {
            Object var3 = this.field215.field1464;
            synchronized (this.field215.field1464) {
                if (!field60) {
                    this.field215.field1468 = 0;
                } else if (super.field817 != 0 || this.field215.field1468 >= 40) {
                    this.field391.method297(20, false);
                    this.field391.method298(0);
                    int var4 = this.field391.field1107;
                    int var5 = 0;
                    for (int var6 = 0; var6 < this.field215.field1468 && var4 - this.field391.field1107 < 240; ++var6) {
                        ++var5;
                        int var7 = this.field215.field1465[var6];
                        if (var7 < 0) {
                            var7 = 0;
                        } else if (var7 > 502) {
                            var7 = 502;
                        }
                        int var8 = this.field215.field1467[var6];
                        if (var8 < 0) {
                            var8 = 0;
                        } else if (var8 > 764) {
                            var8 = 764;
                        }
                        int var9 = var7 * 765 + var8;
                        if (this.field215.field1465[var6] == -1 && this.field215.field1467[var6] == -1) {
                            var8 = -1;
                            var7 = -1;
                            var9 = 524287;
                        }
                        if (this.field447 == var8 && this.field448 == var7) {
                            if (this.field119 < 2047) {
                                ++this.field119;
                            }
                        } else {
                            int var10 = var8 - this.field447;
                            this.field447 = var8;
                            int var11 = var7 - this.field448;
                            this.field448 = var7;
                            if (this.field119 < 8 && var10 >= -32 && var10 <= 31 && var11 >= -32 && var11 <= 31) {
                                var10 += 32;
                                var11 += 32;
                                this.field391.method299((this.field119 << 12) + (var10 << 6) + var11);
                                this.field119 = 0;
                            } else if (this.field119 < 8) {
                                this.field391.method301((this.field119 << 19) + 8388608 + var9);
                                this.field119 = 0;
                            } else {
                                this.field391.method302((this.field119 << 19) + -1073741824 + var9);
                                this.field119 = 0;
                            }
                        }
                    }
                    this.field391.method307(this.field391.field1107 - var4, (byte) 4);
                    if (var5 >= this.field215.field1468) {
                        this.field215.field1468 = 0;
                    } else {
                        this.field215.field1468 -= var5;
                        for (int var12 = 0; var12 < this.field215.field1468; ++var12) {
                            this.field215.field1467[var12] = this.field215.field1467[var5 + var12];
                            this.field215.field1465[var12] = this.field215.field1465[var5 + var12];
                        }
                    }
                }
            }
            if (super.field817 != 0) {
                long var13 = (super.field820 - this.field86) / 50L;
                if (var13 > 4095L) {
                    var13 = 4095L;
                }
                this.field86 = super.field820;
                int var15 = super.field819;
                if (var15 < 0) {
                    var15 = 0;
                } else if (var15 > 502) {
                    var15 = 502;
                }
                int var16 = super.field818;
                if (var16 < 0) {
                    var16 = 0;
                } else if (var16 > 764) {
                    var16 = 764;
                }
                int var17 = var15 * 765 + var16;
                byte var18 = 0;
                if (super.field817 == 2) {
                    var18 = 1;
                }
                int var19 = (int) var13;
                this.field391.method297(56, false);
                this.field391.method302((var18 << 19) + (var19 << 20) + var17);
            }
            if (this.field248 > 0) {
                --this.field248;
            }
            if (super.field821[1] == 1 || super.field821[2] == 1 || super.field821[3] == 1 || super.field821[4] == 1) {
                this.field249 = true;
            }
            if (this.field249 && this.field248 <= 0) {
                this.field248 = 20;
                this.field249 = false;
                this.field391.method297(133, false);
                this.field391.method331(this.field52, (byte) 1);
                this.field391.method299(this.field51);
            }
            if (super.field808 && !this.field349) {
                this.field349 = true;
                this.field391.method297(29, false);
                this.field391.method298(1);
            }
            if (!super.field808 && this.field349) {
                this.field349 = false;
                this.field391.method297(29, false);
                this.field391.method298(0);
            }
            this.method69(this.field206);
            this.method90(this.field356);
            this.method105(this.field332);
            ++this.field411;
            if (this.field411 > 750) {
                this.method150(this.field190);
            }
            this.method158(0);
            this.method75(true);
            this.method30(226);
            ++this.field262;
            if (this.field104 != 0) {
                this.field103 += 20;
                if (this.field103 >= 400) {
                    this.field104 = 0;
                }
            }
            if (this.field273 != 0) {
                ++this.field270;
                if (this.field270 >= 15) {
                    if (this.field273 == 2) {
                        this.field334 = true;
                    }
                    if (this.field273 == 3) {
                        this.field222 = true;
                    }
                    this.field273 = 0;
                }
            }
            if (this.field511 != 0) {
                ++this.field259;
                if (super.field811 > this.field512 + 5 || super.field811 < this.field512 - 5 || super.field812 > this.field513 + 5 || super.field812 < this.field513 - 5) {
                    this.field378 = true;
                }
                if (super.field810 == 0) {
                    if (this.field511 == 2) {
                        this.field334 = true;
                    }
                    if (this.field511 == 3) {
                        this.field222 = true;
                    }
                    this.field511 = 0;
                    if (this.field378 && this.field259 >= 5) {
                        this.field290 = -1;
                        this.method89((byte) 9);
                        if (this.field509 == this.field290 && this.field510 != this.field289) {
                            class28 var20 = class28.field1045[this.field509];
                            byte var21 = 0;
                            if (this.field340 == 1 && var20.field1036 == 206) {
                                var21 = 1;
                            }
                            if (var20.field1051[this.field289] <= 0) {
                                var21 = 0;
                            }
                            if (var20.field1064) {
                                int var22 = this.field510;
                                int var23 = this.field289;
                                var20.field1051[var23] = var20.field1051[var22];
                                var20.field1057[var23] = var20.field1057[var22];
                                var20.field1051[var22] = -1;
                                var20.field1057[var22] = 0;
                            } else if (var21 == 1) {
                                int var24 = this.field510;
                                int var25 = this.field289;
                                while (var24 != var25) {
                                    if (var24 > var25) {
                                        var20.method293(618, var24 - 1, var24);
                                        --var24;
                                    } else if (var24 < var25) {
                                        var20.method293(618, var24 + 1, var24);
                                        ++var24;
                                    }
                                }
                            } else {
                                var20.method293(618, this.field289, this.field510);
                            }
                            this.field391.method297(128, false);
                            this.field391.method324(this.field322, var21);
                            this.field391.method299(this.field289);
                            this.field391.method299(this.field510);
                            this.field391.method330(this.field509, -79);
                        }
                    } else if ((this.field55 == 1 || this.method39(7, this.field268 - 1)) && this.field268 > 2) {
                        this.method93(0);
                    } else if (this.field268 > 0) {
                        this.method127((byte) 1, this.field268 - 1);
                    }
                    this.field270 = 10;
                    super.field817 = 0;
                }
            }
            ++field507;
            if (field507 > 1254) {
                field507 = 0;
                this.field391.method297(81, false);
                this.field391.method298(0);
                int var26 = this.field391.field1107;
                this.field391.method299((int) (Math.random() * 65536.0D));
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field391.method298(76);
                }
                this.field391.method298(84);
                this.field391.method299(19496);
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field391.method298(230);
                }
                this.field391.method298(174);
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field391.method298(218);
                }
                this.field391.method298(119);
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field391.method299(48565);
                }
                this.field391.method299(10883);
                this.field391.method307(this.field391.field1107 - var26, (byte) 4);
            }
            if (class67.field1656 != -1) {
                int var27 = class67.field1656;
                int var28 = class67.field1657;
                boolean var29 = this.method73(0, 0, 0, var27, 0, 3234, var28, true, field488.field876[0], 0, 0, field488.field877[0]);
                class67.field1656 = -1;
                if (var29) {
                    this.field101 = super.field818;
                    this.field102 = super.field819;
                    this.field104 = 1;
                    this.field103 = 0;
                }
            }
            if (super.field817 == 1 && this.field414 != null) {
                this.field414 = null;
                this.field222 = true;
                super.field817 = 0;
            }
            this.method95(true);
            this.method157((byte) -81);
            if (arg0 != 13485) {
                this.field410 = this.field61.method308();
            }
            this.method65(590);
            this.method40(-267);
            if (super.field810 == 1 || super.field817 == 1) {
                ++this.field426;
            }
            if (this.field122 == 2) {
                this.method44((byte) -96);
            }
            if (this.field122 == 2 && this.field157) {
                this.method68(false);
            }
            for (int var30 = 0; var30 < 5; ++var30) {
                int var10002 = this.field131[var30]++;
            }
            this.method153(true);
            ++super.field809;
            if (super.field809 > 4500) {
                this.field413 = 250;
                super.field809 -= 500;
                this.field391.method297(219, false);
            }
            ++this.field109;
            if (this.field109 > 500) {
                this.field109 = 0;
                int var31 = (int) (Math.random() * 8.0D);
                if ((var31 & 1) == 1) {
                    this.field393 += this.field394;
                }
                if ((var31 & 2) == 2) {
                    this.field148 += this.field149;
                }
                if ((var31 & 4) == 4) {
                    this.field208 += this.field209;
                }
            }
            if (this.field393 < -50) {
                this.field394 = 2;
            }
            if (this.field393 > 50) {
                this.field394 = -2;
            }
            if (this.field148 < -55) {
                this.field149 = 2;
            }
            if (this.field148 > 55) {
                this.field149 = -2;
            }
            if (this.field208 < -40) {
                this.field209 = 1;
            }
            if (this.field208 > 40) {
                this.field209 = -1;
            }
            ++this.field240;
            if (this.field240 > 500) {
                this.field240 = 0;
                int var32 = (int) (Math.random() * 8.0D);
                if ((var32 & 1) == 1) {
                    this.field226 += this.field227;
                }
                if ((var32 & 2) == 2) {
                    this.field406 += this.field407;
                }
            }
            if (this.field226 < -60) {
                this.field227 = 2;
            }
            if (this.field226 > 60) {
                this.field227 = -2;
            }
            if (this.field406 < -20) {
                this.field407 = 1;
            }
            if (this.field406 > 10) {
                this.field407 = -1;
            }
            ++this.field412;
            if (this.field412 > 50) {
                this.field391.method297(250, false);
            }
            try {
                if (this.field146 != null && this.field391.field1107 > 0) {
                    this.field146.method587(0, -208, this.field391.field1106, this.field391.field1107);
                    this.field391.field1107 = 0;
                    this.field412 = 0;
                }
            } catch (IOException var34) {
                this.method150(this.field190);
            } catch (Exception var35) {
                this.method23(-654);
            }
        }
    }

    @OriginalMember(owner = "client", name = "q", descriptor = "(I)V")
    public final void method63(int arg0) {
        class63.field1551.method423();
        class63.field1505.method423();
        class14.field747.method423();
        class27.field989.method423();
        class27.field980.method423();
        class8.field539.method423();
        if (arg0 >= 7 && arg0 <= 7) {
            class70.field1706.method423();
        }
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(Z)Ljava/lang/String;")
    public final String method64(boolean arg0) {
        if (arg0) {
            throw new NullPointerException();
        } else if (signlink.mainapp != null) {
            return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
        } else {
            return super.field806 != null ? "runescape.com" : super.getDocumentBase().getHost().toLowerCase();
        }
    }

    @OriginalMember(owner = "client", name = "r", descriptor = "(I)V")
    public final void method65(int arg0) {
        int var2 = 16 / arg0;
        if (super.field817 == 1) {
            if (super.field818 >= 539 && super.field818 <= 573 && super.field819 >= 169 && super.field819 < 205 && this.field194[0] != -1) {
                this.field334 = true;
                this.field127 = 0;
                this.field62 = true;
            }
            if (super.field818 >= 569 && super.field818 <= 599 && super.field819 >= 168 && super.field819 < 205 && this.field194[1] != -1) {
                this.field334 = true;
                this.field127 = 1;
                this.field62 = true;
            }
            if (super.field818 >= 597 && super.field818 <= 627 && super.field819 >= 168 && super.field819 < 205 && this.field194[2] != -1) {
                this.field334 = true;
                this.field127 = 2;
                this.field62 = true;
            }
            if (super.field818 >= 625 && super.field818 <= 669 && super.field819 >= 168 && super.field819 < 203 && this.field194[3] != -1) {
                this.field334 = true;
                this.field127 = 3;
                this.field62 = true;
            }
            if (super.field818 >= 666 && super.field818 <= 696 && super.field819 >= 168 && super.field819 < 205 && this.field194[4] != -1) {
                this.field334 = true;
                this.field127 = 4;
                this.field62 = true;
            }
            if (super.field818 >= 694 && super.field818 <= 724 && super.field819 >= 168 && super.field819 < 205 && this.field194[5] != -1) {
                this.field334 = true;
                this.field127 = 5;
                this.field62 = true;
            }
            if (super.field818 >= 722 && super.field818 <= 756 && super.field819 >= 169 && super.field819 < 205 && this.field194[6] != -1) {
                this.field334 = true;
                this.field127 = 6;
                this.field62 = true;
            }
            if (super.field818 >= 540 && super.field818 <= 574 && super.field819 >= 466 && super.field819 < 502 && this.field194[7] != -1) {
                this.field334 = true;
                this.field127 = 7;
                this.field62 = true;
            }
            if (super.field818 >= 572 && super.field818 <= 602 && super.field819 >= 466 && super.field819 < 503 && this.field194[8] != -1) {
                this.field334 = true;
                this.field127 = 8;
                this.field62 = true;
            }
            if (super.field818 >= 599 && super.field818 <= 629 && super.field819 >= 466 && super.field819 < 503 && this.field194[9] != -1) {
                this.field334 = true;
                this.field127 = 9;
                this.field62 = true;
            }
            if (super.field818 >= 627 && super.field818 <= 671 && super.field819 >= 467 && super.field819 < 502 && this.field194[10] != -1) {
                this.field334 = true;
                this.field127 = 10;
                this.field62 = true;
            }
            if (super.field818 >= 669 && super.field818 <= 699 && super.field819 >= 466 && super.field819 < 503 && this.field194[11] != -1) {
                this.field334 = true;
                this.field127 = 11;
                this.field62 = true;
            }
            if (super.field818 >= 696 && super.field818 <= 726 && super.field819 >= 466 && super.field819 < 503 && this.field194[12] != -1) {
                this.field334 = true;
                this.field127 = 12;
                this.field62 = true;
            }
            if (super.field818 >= 724 && super.field818 <= 758 && super.field819 >= 466 && super.field819 < 502 && this.field194[13] != -1) {
                this.field334 = true;
                this.field127 = 13;
                this.field62 = true;
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "s", descriptor = "(I)V")
    public final void method66(int arg0) {
        class48 var2 = (class48) this.field325.method427();
        if (this.field430 != arg0) {
            this.field410 = -1;
        }
        while (var2 != null) {
            if (this.field169 == var2.field1315 && !var2.field1322) {
                if (field341 >= var2.field1323) {
                    var2.method420(-27482, this.field262);
                    if (var2.field1322) {
                        var2.method234();
                    } else {
                        this.field456.method538(var2.field1317, var2.field1315, -610, var2.field1316, false, 60, var2, -1, 0, var2.field1318);
                    }
                }
            } else {
                var2.method234();
            }
            var2 = (class48) this.field325.method429(0);
        }
    }

    @OriginalMember(owner = "client", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        return signlink.mainapp != null ? signlink.mainapp.getAppletContext() : super.getAppletContext();
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZJ)V")
    public final void method67(boolean arg0, long arg1) {
        if (arg1 != 0L) {
            if (this.field367 >= 100) {
                this.method46("", false, 0, "Your ignore list is full. Max of 100 hit");
            } else {
                String var4 = class55.method473(false, class55.method470(arg1, (byte) 8));
                if (!arg0) {
                    for (int var5 = 0; var5 < this.field367; ++var5) {
                        if (this.field459[var5] == arg1) {
                            this.method46("", false, 0, var4 + " is already on your ignore list");
                            return;
                        }
                    }
                    for (int var6 = 0; var6 < this.field89; ++var6) {
                        if (this.field284[var6] == arg1) {
                            this.method46("", false, 0, "Please remove " + var4 + " from your friend list first");
                            return;
                        }
                    }
                    this.field459[this.field367++] = arg1;
                    this.field334 = true;
                    this.field391.method297(197, false);
                    this.field391.method304(8, arg1);
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(Z)V")
    public final void method68(boolean arg0) {
        int var2 = this.field136 * 128 + 64;
        int var3 = this.field137 * 128 + 64;
        int var4 = this.method99(var3, this.field169, 0, var2) - this.field138;
        if (this.field379 < var2) {
            this.field379 += (var2 - this.field379) * this.field140 / 1000 + this.field139;
            if (this.field379 > var2) {
                this.field379 = var2;
            }
        }
        if (this.field379 > var2) {
            this.field379 -= (this.field379 - var2) * this.field140 / 1000 + this.field139;
            if (this.field379 < var2) {
                this.field379 = var2;
            }
        }
        if (this.field380 < var4) {
            this.field380 += (var4 - this.field380) * this.field140 / 1000 + this.field139;
            if (this.field380 > var4) {
                this.field380 = var4;
            }
        }
        if (this.field380 > var4) {
            this.field380 -= (this.field380 - var4) * this.field140 / 1000 + this.field139;
            if (this.field380 < var4) {
                this.field380 = var4;
            }
        }
        if (this.field381 < var3) {
            this.field381 += (var3 - this.field381) * this.field140 / 1000 + this.field139;
            if (this.field381 > var3) {
                this.field381 = var3;
            }
        }
        if (this.field381 > var3) {
            this.field381 -= (this.field381 - var3) * this.field140 / 1000 + this.field139;
            if (this.field381 < var3) {
                this.field381 = var3;
            }
        }
        int var5 = this.field483 * 128 + 64;
        int var6 = this.field484 * 128 + 64;
        int var7 = this.method99(var6, this.field169, 0, var5) - this.field485;
        int var8 = var5 - this.field379;
        int var9 = var7 - this.field380;
        int var10 = var6 - this.field381;
        int var11 = (int) Math.sqrt((double) (var8 * var8 + var10 * var10));
        int var12 = (int) (Math.atan2((double) var9, (double) var11) * 325.949D) & 2047;
        if (arg0) {
            this.field410 = -1;
        }
        int var13 = (int) (Math.atan2((double) var8, (double) var10) * -325.949D) & 2047;
        if (var12 < 128) {
            var12 = 128;
        }
        if (var12 > 383) {
            var12 = 383;
        }
        if (this.field382 < var12) {
            this.field382 += (var12 - this.field382) * this.field487 / 1000 + this.field486;
            if (this.field382 > var12) {
                this.field382 = var12;
            }
        }
        if (this.field382 > var12) {
            this.field382 -= (this.field382 - var12) * this.field487 / 1000 + this.field486;
            if (this.field382 < var12) {
                this.field382 = var12;
            }
        }
        int var14 = var13 - this.field383;
        if (var14 > 1024) {
            var14 -= 2048;
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (var14 > 0) {
            this.field383 += this.field487 * var14 / 1000 + this.field486;
            this.field383 &= 2047;
        }
        if (var14 < 0) {
            this.field383 -= -var14 * this.field487 / 1000 + this.field486;
            this.field383 &= 2047;
        }
        int var15 = var13 - this.field383;
        if (var15 > 1024) {
            var15 -= 2048;
        }
        if (var15 < -1024) {
            var15 += 2048;
        }
        if (var15 < 0 && var14 > 0 || var15 > 0 && var14 < 0) {
            this.field383 = var13;
        }
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(B)V")
    public final void method69(byte arg0) {
        if (arg0 != 0) {
            this.field410 = this.field61.method308();
        }
        if (field178 && this.field122 == 2 && class52.field1349 != this.field169) {
            this.field338.method376(-329);
            this.field116.method356(565, 151, 0, "Loading - please wait.", 257);
            this.field116.method356(565, 150, 16777215, "Loading - please wait.", 256);
            this.field338.method377(super.field803, 4, 1926, 4);
            this.field122 = 1;
            this.field98 = System.currentTimeMillis();
        }
        if (this.field122 == 1) {
            int var2 = this.method70(0);
            if (var2 != 0 && System.currentTimeMillis() - this.field98 > 360000L) {
                signlink.reporterror(this.field388 + " glcfb " + this.field519 + "," + var2 + "," + field178 + "," + this.field58[0] + "," + this.field384.method179() + "," + this.field169 + "," + this.field517 + "," + this.field518);
                this.field98 = System.currentTimeMillis();
            }
        }
        if (this.field122 == 2 && this.field311 != this.field169) {
            this.field311 = this.field169;
            this.method41(-34, this.field169);
        }
    }

    @OriginalMember(owner = "client", name = "t", descriptor = "(I)I")
    public final int method70(int arg0) {
        for (int var2 = 0; var2 < this.field478.length; ++var2) {
            if (this.field478[var2] == null && this.field265[var2] != -1) {
                return -1;
            }
            if (this.field207[var2] == null && this.field266[var2] != -1) {
                return -2;
            }
        }
        boolean var3 = true;
        for (int var4 = 0; var4 < this.field478.length; ++var4) {
            byte[] var5 = this.field207[var4];
            if (var5 != null) {
                int var6 = (this.field264[var4] >> 8) * 64 - this.field141;
                int var7 = (this.field264[var4] & 255) * 64 - this.field142;
                if (this.field446) {
                    var6 = 10;
                    var7 = 10;
                }
                var3 &= class52.method442(var6, var5, 49616, var7);
            }
        }
        this.field409 += arg0;
        if (!var3) {
            return -3;
        } else if (this.field324) {
            return -4;
        } else {
            this.field122 = 2;
            class52.field1349 = this.field169;
            this.method119((byte) 5);
            this.field391.method297(201, false);
            return 0;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIZIII)V")
    private final void method71(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7) {
        if (arg4) {
            for (int var9 = 1; var9 > 0; ++var9) {
            }
        }
        if (arg5 >= 1 && arg0 >= 1 && arg5 <= 102 && arg0 <= 102) {
            if (field178 && this.field169 != arg6) {
                return;
            }
            int var10 = 0;
            boolean var11 = true;
            boolean var12 = false;
            boolean var13 = false;
            if (arg1 == 0) {
                var10 = this.field456.method553(arg6, arg5, arg0);
            }
            if (arg1 == 1) {
                var10 = this.field456.method554(arg6, arg0, 210, arg5);
            }
            if (arg1 == 2) {
                var10 = this.field456.method555(arg6, arg5, arg0);
            }
            if (arg1 == 3) {
                var10 = this.field456.method556(arg6, arg5, arg0);
            }
            if (var10 != 0) {
                int var14 = this.field456.method557(arg6, arg5, arg0, var10);
                int var15 = var10 >> 14 & 32767;
                int var16 = var14 & 31;
                int var17 = var14 >> 6;
                if (arg1 == 0) {
                    this.field456.method544(arg0, arg5, true, arg6);
                    class63 var18 = class63.method501(var15);
                    if (var18.field1518) {
                        this.field476[arg6].method489(false, var17, var18.field1523, arg5, arg0, var16);
                    }
                }
                if (arg1 == 1) {
                    this.field456.method545(arg5, arg0, 10399, arg6);
                }
                if (arg1 == 2) {
                    this.field456.method546(arg5, 15, arg0, arg6);
                    class63 var19 = class63.method501(var15);
                    if (var19.field1506 + arg5 > 103 || var19.field1506 + arg0 > 103 || var19.field1541 + arg5 > 103 || var19.field1541 + arg0 > 103) {
                        return;
                    }
                    if (var19.field1518) {
                        this.field476[arg6].method490(var17, arg5, var19.field1541, var19.field1506, 0, var19.field1523, arg0);
                    }
                }
                if (arg1 == 3) {
                    this.field456.method547(arg5, 0, arg0, arg6);
                    class63 var20 = class63.method501(var15);
                    if (var20.field1518 && var20.field1525) {
                        this.field476[arg6].method492(false, arg0, arg5);
                    }
                }
            }
            if (arg3 >= 0) {
                int var21 = arg6;
                if (arg6 < 3 && (this.field158[1][arg5][arg0] & 2) == 2) {
                    var21 = arg6 + 1;
                }
                class52.method447(this.field476[arg6], arg6, arg2, var21, arg7, this.field456, arg0, arg5, arg3, 2, this.field299);
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IZLINLHDAGO;)V")
    private final void method72(int arg0, boolean arg1, class29 arg2) {
        for (int var4 = 0; var4 < this.field422; ++var4) {
            int var5 = this.field423[var4];
            class7 var6 = this.field306[var5];
            int var7 = arg2.method308();
            if ((var7 & 64) != 0) {
                var6.field915 = arg2.method334((byte) 6);
                var6.field916 = arg2.method310();
            }
            if ((var7 & 32) != 0) {
                var6.field905 = arg2.method335(-210);
                int var8 = arg2.method338((byte) 115);
                var6.field909 = var8 >> 16;
                var6.field908 = (var8 & 65535) + field341;
                var6.field906 = 0;
                var6.field907 = 0;
                if (var6.field908 > field341) {
                    var6.field906 = -1;
                }
                if (var6.field905 == 65535) {
                    var6.field905 = -1;
                }
            }
            if ((var7 & 2) != 0) {
                var6.field531 = class14.method239(arg2.method335(-210));
                var6.field914 = var6.field531.field762;
                var6.field865 = var6.field531.field729;
                var6.field891 = var6.field531.field760;
                var6.field892 = var6.field531.field761;
                var6.field893 = var6.field531.field736;
                var6.field894 = var6.field531.field753;
                var6.field860 = var6.field531.field725;
            }
            if ((var7 & 16) != 0) {
                int var9 = arg2.method327(-41963);
                int var10 = arg2.method308();
                var6.method270(var9, -674, field341, var10);
                var6.field888 = field341 + 300;
                var6.field889 = arg2.method308();
                var6.field890 = arg2.method327(-41963);
            }
            if ((var7 & 8) != 0) {
                var6.field863 = arg2.method315();
                var6.field882 = 100;
            }
            if ((var7 & 4) != 0) {
                var6.field913 = arg2.method334((byte) 6);
                if (var6.field913 == 65535) {
                    var6.field913 = -1;
                }
            }
            if ((var7 & 128) != 0) {
                int var11 = arg2.method334((byte) 6);
                if (var11 == 65535) {
                    var11 = -1;
                }
                int var12 = arg2.method308();
                if (var6.field898 == var11 && var11 != -1) {
                    int var13 = class26.field949[var11].field963;
                    if (var13 == 1) {
                        var6.field899 = 0;
                        var6.field900 = 0;
                        var6.field901 = var12;
                        var6.field902 = 0;
                    }
                    if (var13 == 2) {
                        var6.field902 = 0;
                    }
                } else if (var11 == -1 || var6.field898 == -1 || class26.field949[var11].field957 >= class26.field949[var6.field898].field957) {
                    var6.field898 = var11;
                    var6.field899 = 0;
                    var6.field900 = 0;
                    var6.field901 = var12;
                    var6.field902 = 0;
                    var6.field868 = var6.field881;
                }
            }
            if ((var7 & 1) != 0) {
                int var14 = arg2.method308();
                int var15 = arg2.method326((byte) -115);
                var6.method270(var14, -674, field341, var15);
                var6.field888 = field341 + 300;
                var6.field889 = arg2.method327(-41963);
                var6.field890 = arg2.method327(-41963);
            }
        }
        this.field191 &= arg1;
    }

    @OriginalMember(owner = "client", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        if (signlink.mainapp != null) {
            return signlink.mainapp.getCodeBase();
        } else {
            try {
                if (super.field806 != null) {
                    return new URL("http://127.0.0.1:" + (field176 + 80));
                }
            } catch (Exception var1) {
            }
            return super.getCodeBase();
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIIIIZIIII)Z")
    public final boolean method73(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11) {
        byte var13 = 104;
        byte var14 = 104;
        for (int var15 = 0; var15 < var13; ++var15) {
            for (int var35 = 0; var35 < var14; ++var35) {
                this.field205[var15][var35] = 0;
                this.field192[var15][var35] = 99999999;
            }
        }
        int var16 = arg8;
        int var17 = arg11;
        this.field205[arg8][arg11] = 99;
        this.field192[arg8][arg11] = 0;
        byte var18 = 0;
        int var19 = 0;
        this.field489[var18] = arg8;
        int var36 = var18 + 1;
        this.field490[var18] = arg11;
        boolean var20 = false;
        int var21 = this.field489.length;
        int[][] var22 = this.field476[this.field169].field1503;
        if (arg5 != 3234) {
            this.field410 = this.field61.method308();
        }
        while (var36 != var19) {
            var16 = this.field489[var19];
            var17 = this.field490[var19];
            var19 = (var19 + 1) % var21;
            if (arg3 == var16 && arg6 == var17) {
                var20 = true;
                break;
            }
            if (arg4 != 0) {
                if ((arg4 < 5 || arg4 == 10) && this.field476[this.field169].method493(arg6, var17, 756, var16, arg4 - 1, arg3, arg10)) {
                    var20 = true;
                    break;
                }
                if (arg4 < 10 && this.field476[this.field169].method494(arg10, var17, arg6, 0, var16, arg4 - 1, arg3)) {
                    var20 = true;
                    break;
                }
            }
            if (arg2 != 0 && arg9 != 0 && this.field476[this.field169].method495(300, var17, var16, arg3, arg6, arg2, arg9, arg1)) {
                var20 = true;
                break;
            }
            int var34 = this.field192[var16][var17] + 1;
            if (var16 > 0 && this.field205[var16 - 1][var17] == 0 && (var22[var16 - 1][var17] & 2621704) == 0) {
                this.field489[var36] = var16 - 1;
                this.field490[var36] = var17;
                var36 = (var36 + 1) % var21;
                this.field205[var16 - 1][var17] = 2;
                this.field192[var16 - 1][var17] = var34;
            }
            if (var16 < var13 - 1 && this.field205[var16 + 1][var17] == 0 && (var22[var16 + 1][var17] & 2621824) == 0) {
                this.field489[var36] = var16 + 1;
                this.field490[var36] = var17;
                var36 = (var36 + 1) % var21;
                this.field205[var16 + 1][var17] = 8;
                this.field192[var16 + 1][var17] = var34;
            }
            if (var17 > 0 && this.field205[var16][var17 - 1] == 0 && (var22[var16][var17 - 1] & 2621698) == 0) {
                this.field489[var36] = var16;
                this.field490[var36] = var17 - 1;
                var36 = (var36 + 1) % var21;
                this.field205[var16][var17 - 1] = 1;
                this.field192[var16][var17 - 1] = var34;
            }
            if (var17 < var14 - 1 && this.field205[var16][var17 + 1] == 0 && (var22[var16][var17 + 1] & 2621728) == 0) {
                this.field489[var36] = var16;
                this.field490[var36] = var17 + 1;
                var36 = (var36 + 1) % var21;
                this.field205[var16][var17 + 1] = 4;
                this.field192[var16][var17 + 1] = var34;
            }
            if (var16 > 0 && var17 > 0 && this.field205[var16 - 1][var17 - 1] == 0 && (var22[var16 - 1][var17 - 1] & 2621710) == 0 && (var22[var16 - 1][var17] & 2621704) == 0 && (var22[var16][var17 - 1] & 2621698) == 0) {
                this.field489[var36] = var16 - 1;
                this.field490[var36] = var17 - 1;
                var36 = (var36 + 1) % var21;
                this.field205[var16 - 1][var17 - 1] = 3;
                this.field192[var16 - 1][var17 - 1] = var34;
            }
            if (var16 < var13 - 1 && var17 > 0 && this.field205[var16 + 1][var17 - 1] == 0 && (var22[var16 + 1][var17 - 1] & 2621827) == 0 && (var22[var16 + 1][var17] & 2621824) == 0 && (var22[var16][var17 - 1] & 2621698) == 0) {
                this.field489[var36] = var16 + 1;
                this.field490[var36] = var17 - 1;
                var36 = (var36 + 1) % var21;
                this.field205[var16 + 1][var17 - 1] = 9;
                this.field192[var16 + 1][var17 - 1] = var34;
            }
            if (var16 > 0 && var17 < var14 - 1 && this.field205[var16 - 1][var17 + 1] == 0 && (var22[var16 - 1][var17 + 1] & 2621752) == 0 && (var22[var16 - 1][var17] & 2621704) == 0 && (var22[var16][var17 + 1] & 2621728) == 0) {
                this.field489[var36] = var16 - 1;
                this.field490[var36] = var17 + 1;
                var36 = (var36 + 1) % var21;
                this.field205[var16 - 1][var17 + 1] = 6;
                this.field192[var16 - 1][var17 + 1] = var34;
            }
            if (var16 < var13 - 1 && var17 < var14 - 1 && this.field205[var16 + 1][var17 + 1] == 0 && (var22[var16 + 1][var17 + 1] & 2621920) == 0 && (var22[var16 + 1][var17] & 2621824) == 0 && (var22[var16][var17 + 1] & 2621728) == 0) {
                this.field489[var36] = var16 + 1;
                this.field490[var36] = var17 + 1;
                var36 = (var36 + 1) % var21;
                this.field205[var16 + 1][var17 + 1] = 12;
                this.field192[var16 + 1][var17 + 1] = var34;
            }
        }
        this.field59 = 0;
        if (!var20) {
            if (arg7) {
                int var23 = 100;
                for (int var24 = 1; var24 < 2; ++var24) {
                    for (int var25 = arg3 - var24; var25 <= arg3 + var24; ++var25) {
                        for (int var26 = arg6 - var24; var26 <= arg6 + var24; ++var26) {
                            if (var25 >= 0 && var26 >= 0 && var25 < 104 && var26 < 104 && this.field192[var25][var26] < var23) {
                                var23 = this.field192[var25][var26];
                                var16 = var25;
                                var17 = var26;
                                this.field59 = 1;
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
        this.field489[var27] = var16;
        int var37 = var27 + 1;
        this.field490[var27] = var17;
        int var28;
        int var29 = var28 = this.field205[var16][var17];
        while (arg8 != var16 || arg11 != var17) {
            if (var28 != var29) {
                var28 = var29;
                this.field489[var37] = var16;
                this.field490[var37++] = var17;
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
            var29 = this.field205[var16][var17];
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
            int var31 = this.field489[var37];
            int var32 = this.field490[var37];
            if (arg0 == 0) {
                this.field391.method297(186, false);
                this.field391.method298(var30 + var30 + 3);
            }
            if (arg0 == 1) {
                this.field391.method297(95, false);
                this.field391.method298(var30 + var30 + 3 + 14);
            }
            if (arg0 == 2) {
                this.field391.method297(64, false);
                this.field391.method298(var30 + var30 + 3);
            }
            this.field233 = this.field489[0];
            this.field234 = this.field490[0];
            for (int var33 = 1; var33 < var30; ++var33) {
                --var37;
                this.field391.method324(this.field322, this.field489[var37] - var31);
                this.field391.method324(this.field322, this.field490[var37] - var32);
            }
            this.field391.method332((byte) -51, this.field142 + var32);
            this.field391.method331(this.field141 + var31, (byte) 1);
            this.field391.method298(super.field821[5] == 1 ? 1 : 0);
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZLINLHDAGO;I)V")
    private final void method74(boolean arg0, class29 arg1, int arg2) {
        int var4 = arg1.method319(754, 8);
        if (arg0) {
            this.field391.method298(123);
        }
        if (var4 < this.field420) {
            for (int var5 = var4; var5 < this.field420; ++var5) {
                this.field184[this.field183++] = this.field421[var5];
            }
        }
        if (var4 > this.field420) {
            signlink.reporterror(this.field388 + " Too many players");
            throw new RuntimeException("eek");
        } else {
            this.field420 = 0;
            for (int var6 = 0; var6 < var4; ++var6) {
                int var7 = this.field421[var6];
                class8 var8 = this.field419[var7];
                int var9 = arg1.method319(754, 1);
                if (var9 == 0) {
                    this.field421[this.field420++] = var7;
                    var8.field864 = field341;
                } else {
                    int var10 = arg1.method319(754, 2);
                    if (var10 == 0) {
                        this.field421[this.field420++] = var7;
                        var8.field864 = field341;
                        this.field423[this.field422++] = var7;
                    } else if (var10 == 1) {
                        this.field421[this.field420++] = var7;
                        var8.field864 = field341;
                        int var11 = arg1.method319(754, 3);
                        var8.method272(376, false, var11);
                        int var12 = arg1.method319(754, 1);
                        if (var12 == 1) {
                            this.field423[this.field422++] = var7;
                        }
                    } else if (var10 == 2) {
                        this.field421[this.field420++] = var7;
                        var8.field864 = field341;
                        int var13 = arg1.method319(754, 3);
                        var8.method272(376, true, var13);
                        int var14 = arg1.method319(754, 3);
                        var8.method272(376, true, var14);
                        int var15 = arg1.method319(754, 1);
                        if (var15 == 1) {
                            this.field423[this.field422++] = var7;
                        }
                    } else if (var10 == 3) {
                        this.field184[this.field183++] = var7;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "h", descriptor = "(Z)V")
    public final void method75(boolean arg0) {
        this.field191 &= arg0;
        for (int var2 = 0; var2 < this.field307; ++var2) {
            int var3 = this.field308[var2];
            class7 var4 = this.field306[var3];
            if (var4 != null) {
                this.method76(var4.field531.field762, this.field458, var4);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IILFWNRUNYO;)V")
    public final void method76(int arg0, int arg1, class23 arg2) {
        if (arg2.field885 < 128 || arg2.field886 < 128 || arg2.field885 >= 13184 || arg2.field886 >= 13184) {
            arg2.field898 = -1;
            arg2.field905 = -1;
            arg2.field873 = 0;
            arg2.field874 = 0;
            arg2.field885 = arg2.field876[0] * 128 + arg2.field914 * 64;
            arg2.field886 = arg2.field877[0] * 128 + arg2.field914 * 64;
            arg2.method269(true);
        }
        if (field488 == arg2 && (arg2.field885 < 1536 || arg2.field886 < 1536 || arg2.field885 >= 11776 || arg2.field886 >= 11776)) {
            arg2.field898 = -1;
            arg2.field905 = -1;
            arg2.field873 = 0;
            arg2.field874 = 0;
            arg2.field885 = arg2.field876[0] * 128 + arg2.field914 * 64;
            arg2.field886 = arg2.field877[0] * 128 + arg2.field914 * 64;
            arg2.method269(true);
        }
        if (arg2.field873 > field341) {
            this.method77(arg2, 6);
        } else if (arg2.field874 >= field341) {
            this.method78(this.field93, arg2);
        } else {
            this.method79(arg2, 39736);
        }
        this.method80(arg2, 7);
        if (arg1 <= 0) {
            this.field263 = !this.field263;
        }
        this.method81(arg2, -38153);
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LFWNRUNYO;I)V")
    public final void method77(class23 arg0, int arg1) {
        int var3 = arg0.field873 - field341;
        int var4 = arg0.field914 * 64 + arg0.field869 * 128;
        int var5 = arg0.field914 * 64 + arg0.field871 * 128;
        if (arg1 != 6) {
            this.field410 = this.field61.method308();
        }
        arg0.field885 += (var4 - arg0.field885) / var3;
        arg0.field886 += (var5 - arg0.field886) / var3;
        arg0.field911 = 0;
        if (arg0.field875 == 0) {
            arg0.field883 = 1024;
        }
        if (arg0.field875 == 1) {
            arg0.field883 = 1536;
        }
        if (arg0.field875 == 2) {
            arg0.field883 = 0;
        }
        if (arg0.field875 == 3) {
            arg0.field883 = 512;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILFWNRUNYO;)V")
    public final void method78(int arg0, class23 arg1) {
        if (arg0 > 0) {
            if (field341 == arg1.field874 || arg1.field898 == -1 || arg1.field901 != 0 || arg1.field900 + 1 > class26.field949[arg1.field898].method275(210, arg1.field899)) {
                int var3 = arg1.field874 - arg1.field873;
                int var4 = field341 - arg1.field873;
                int var5 = arg1.field914 * 64 + arg1.field869 * 128;
                int var6 = arg1.field914 * 64 + arg1.field871 * 128;
                int var7 = arg1.field914 * 64 + arg1.field870 * 128;
                int var8 = arg1.field914 * 64 + arg1.field872 * 128;
                arg1.field885 = ((var3 - var4) * var5 + var4 * var7) / var3;
                arg1.field886 = ((var3 - var4) * var6 + var4 * var8) / var3;
            }
            arg1.field911 = 0;
            if (arg1.field875 == 0) {
                arg1.field883 = 1024;
            }
            if (arg1.field875 == 1) {
                arg1.field883 = 1536;
            }
            if (arg1.field875 == 2) {
                arg1.field883 = 0;
            }
            if (arg1.field875 == 3) {
                arg1.field883 = 512;
            }
            arg1.field887 = arg1.field883;
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(LFWNRUNYO;I)V")
    public final void method79(class23 arg0, int arg1) {
        arg0.field878 = arg0.field860;
        if (arg0.field881 == 0) {
            arg0.field911 = 0;
        } else {
            if (arg0.field898 != -1 && arg0.field901 == 0) {
                class26 var3 = class26.field949[arg0.field898];
                if (arg0.field868 > 0 && var3.field961 == 0) {
                    ++arg0.field911;
                    return;
                }
                if (arg0.field868 <= 0 && var3.field962 == 0) {
                    ++arg0.field911;
                    return;
                }
            }
            int var4 = arg0.field885;
            int var5 = arg0.field886;
            int var6 = arg0.field876[arg0.field881 - 1] * 128 + arg0.field914 * 64;
            int var7 = arg0.field877[arg0.field881 - 1] * 128 + arg0.field914 * 64;
            if (var6 - var4 <= 256 && var6 - var4 >= -256 && var7 - var5 <= 256 && var7 - var5 >= -256) {
                if (var4 < var6) {
                    if (var5 < var7) {
                        arg0.field883 = 1280;
                    } else if (var5 > var7) {
                        arg0.field883 = 1792;
                    } else {
                        arg0.field883 = 1536;
                    }
                } else if (var4 > var6) {
                    if (var5 < var7) {
                        arg0.field883 = 768;
                    } else if (var5 > var7) {
                        arg0.field883 = 256;
                    } else {
                        arg0.field883 = 512;
                    }
                } else if (var5 < var7) {
                    arg0.field883 = 1024;
                } else {
                    arg0.field883 = 0;
                }
                int var8 = arg0.field883 - arg0.field887 & 2047;
                if (var8 > 1024) {
                    var8 -= 2048;
                }
                int var9 = arg0.field892;
                if (var8 >= -256 && var8 <= 256) {
                    var9 = arg0.field891;
                } else if (var8 >= 256 && var8 < 768) {
                    var9 = arg0.field894;
                } else if (var8 >= -768 && var8 <= -256) {
                    var9 = arg0.field893;
                }
                if (var9 == -1) {
                    var9 = arg0.field891;
                }
                arg0.field878 = var9;
                int var10 = 4;
                if (arg1 != 39736) {
                    this.method149();
                }
                if (arg0.field887 != arg0.field883 && arg0.field913 == -1 && arg0.field865 != 0) {
                    var10 = 2;
                }
                if (arg0.field881 > 2) {
                    var10 = 6;
                }
                if (arg0.field881 > 3) {
                    var10 = 8;
                }
                if (arg0.field911 > 0 && arg0.field881 > 1) {
                    var10 = 8;
                    --arg0.field911;
                }
                if (arg0.field866[arg0.field881 - 1]) {
                    var10 <<= 1;
                }
                if (var10 >= 8 && arg0.field891 == arg0.field878 && arg0.field867 != -1) {
                    arg0.field878 = arg0.field867;
                }
                if (var4 < var6) {
                    arg0.field885 += var10;
                    if (arg0.field885 > var6) {
                        arg0.field885 = var6;
                    }
                } else if (var4 > var6) {
                    arg0.field885 -= var10;
                    if (arg0.field885 < var6) {
                        arg0.field885 = var6;
                    }
                }
                if (var5 < var7) {
                    arg0.field886 += var10;
                    if (arg0.field886 > var7) {
                        arg0.field886 = var7;
                    }
                } else if (var5 > var7) {
                    arg0.field886 -= var10;
                    if (arg0.field886 < var7) {
                        arg0.field886 = var7;
                    }
                }
                if (arg0.field885 == var6 && arg0.field886 == var7) {
                    --arg0.field881;
                    if (arg0.field868 > 0) {
                        --arg0.field868;
                        return;
                    }
                }
            } else {
                arg0.field885 = var6;
                arg0.field886 = var7;
            }
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(LFWNRUNYO;I)V")
    public final void method80(class23 arg0, int arg1) {
        int var3 = 95 / arg1;
        if (arg0.field865 != 0) {
            if (arg0.field913 != -1 && arg0.field913 < 32768) {
                class7 var4 = this.field306[arg0.field913];
                if (var4 != null) {
                    int var5 = arg0.field885 - var4.field885;
                    int var6 = arg0.field886 - var4.field886;
                    if (var5 != 0 || var6 != 0) {
                        arg0.field883 = (int) (Math.atan2((double) var5, (double) var6) * 325.949D) & 2047;
                    }
                }
            }
            if (arg0.field913 >= 32768) {
                int var7 = arg0.field913 - 32768;
                if (this.field85 == var7) {
                    var7 = this.field418;
                }
                class8 var8 = this.field419[var7];
                if (var8 != null) {
                    int var9 = arg0.field885 - var8.field885;
                    int var10 = arg0.field886 - var8.field886;
                    if (var9 != 0 || var10 != 0) {
                        arg0.field883 = (int) (Math.atan2((double) var9, (double) var10) * 325.949D) & 2047;
                    }
                }
            }
            if ((arg0.field915 != 0 || arg0.field916 != 0) && (arg0.field881 == 0 || arg0.field911 > 0)) {
                int var11 = arg0.field885 - (arg0.field915 - this.field141 - this.field141) * 64;
                int var12 = arg0.field886 - (arg0.field916 - this.field142 - this.field142) * 64;
                if (var11 != 0 || var12 != 0) {
                    arg0.field883 = (int) (Math.atan2((double) var11, (double) var12) * 325.949D) & 2047;
                }
                arg0.field915 = 0;
                arg0.field916 = 0;
            }
            int var13 = arg0.field883 - arg0.field887 & 2047;
            if (var13 != 0) {
                if (var13 >= arg0.field865 && var13 <= 2048 - arg0.field865) {
                    if (var13 > 1024) {
                        arg0.field887 -= arg0.field865;
                    } else {
                        arg0.field887 += arg0.field865;
                    }
                } else {
                    arg0.field887 = arg0.field883;
                }
                arg0.field887 &= 2047;
                if (arg0.field878 == arg0.field860 && arg0.field887 != arg0.field883) {
                    if (arg0.field861 != -1) {
                        arg0.field878 = arg0.field861;
                        return;
                    }
                    arg0.field878 = arg0.field891;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(LFWNRUNYO;I)V")
    public final void method81(class23 arg0, int arg1) {
        if (arg1 != -38153) {
            this.field391.method298(125);
        }
        arg0.field862 = false;
        if (arg0.field878 != -1) {
            class26 var3 = class26.field949[arg0.field878];
            ++arg0.field880;
            if (arg0.field879 < var3.field950 && arg0.field880 > var3.method275(210, arg0.field879)) {
                arg0.field880 = 0;
                ++arg0.field879;
            }
            if (arg0.field879 >= var3.field950) {
                arg0.field880 = 0;
                arg0.field879 = 0;
            }
        }
        if (arg0.field905 != -1 && field341 >= arg0.field908) {
            if (arg0.field906 < 0) {
                arg0.field906 = 0;
            }
            class26 var4 = class70.field1694[arg0.field905].field1698;
            ++arg0.field907;
            while (arg0.field906 < var4.field950 && arg0.field907 > var4.method275(210, arg0.field906)) {
                arg0.field907 -= var4.method275(210, arg0.field906);
                ++arg0.field906;
            }
            if (arg0.field906 >= var4.field950 && (arg0.field906 < 0 || arg0.field906 >= var4.field950)) {
                arg0.field905 = -1;
            }
        }
        if (arg0.field898 != -1 && arg0.field901 <= 1) {
            class26 var5 = class26.field949[arg0.field898];
            if (var5.field961 == 1 && arg0.field868 > 0 && arg0.field873 <= field341 && arg0.field874 < field341) {
                arg0.field901 = 1;
                return;
            }
        }
        if (arg0.field898 != -1 && arg0.field901 == 0) {
            class26 var6 = class26.field949[arg0.field898];
            ++arg0.field900;
            while (arg0.field899 < var6.field950 && arg0.field900 > var6.method275(210, arg0.field899)) {
                arg0.field900 -= var6.method275(210, arg0.field899);
                ++arg0.field899;
            }
            if (arg0.field899 >= var6.field950) {
                arg0.field899 -= var6.field954;
                ++arg0.field902;
                if (arg0.field902 >= var6.field960) {
                    arg0.field898 = -1;
                }
                if (arg0.field899 < 0 || arg0.field899 >= var6.field950) {
                    arg0.field898 = -1;
                }
            }
            arg0.field862 = var6.field956;
        }
        if (arg0.field901 > 0) {
            --arg0.field901;
        }
    }

    @OriginalMember(owner = "client", name = "u", descriptor = "(I)V")
    public final void method82(int arg0) {
        this.field409 += arg0;
        if (this.field241) {
            this.field241 = false;
            this.field466.method377(super.field803, 0, 1926, 4);
            this.field467.method377(super.field803, 0, 1926, 357);
            this.field468.method377(super.field803, 722, 1926, 4);
            this.field469.method377(super.field803, 743, 1926, 205);
            this.field470.method377(super.field803, 0, 1926, 0);
            this.field471.method377(super.field803, 516, 1926, 4);
            this.field472.method377(super.field803, 516, 1926, 205);
            this.field473.method377(super.field803, 496, 1926, 357);
            this.field474.method377(super.field803, 0, 1926, 338);
            this.field334 = true;
            this.field222 = true;
            this.field62 = true;
            this.field218 = true;
            if (this.field122 != 2) {
                this.field338.method377(super.field803, 4, 1926, 4);
                this.field337.method377(super.field803, 550, 1926, 4);
            }
            ++field493;
            if (field493 > 1058) {
                field493 = 0;
                this.field391.method297(85, false);
                this.field391.method298(0);
                int var2 = this.field391.field1107;
                this.field391.method299(59547);
                this.field391.method299((int) (Math.random() * 65536.0D));
                this.field391.method299((int) (Math.random() * 65536.0D));
                this.field391.method299(56213);
                this.field391.method299((int) (Math.random() * 65536.0D));
                this.field391.method299(58192);
                this.field391.method299((int) (Math.random() * 65536.0D));
                this.field391.method299(37698);
                this.field391.method299((int) (Math.random() * 65536.0D));
                this.field391.method298((int) (Math.random() * 256.0D));
                this.field391.method307(this.field391.field1107 - var2, (byte) 4);
            }
        }
        if (this.field122 == 2) {
            this.method131((byte) -98);
        }
        if (this.field318 && this.field65 == 1) {
            this.field334 = true;
        }
        if (this.field428 != -1) {
            boolean var3 = this.method121(this.field262, this.field133, this.field428);
            if (var3) {
                this.field334 = true;
            }
        }
        if (this.field273 == 2) {
            this.field334 = true;
        }
        if (this.field511 == 2) {
            this.field334 = true;
        }
        if (this.field334) {
            this.method37(this.field238);
            this.field334 = false;
        }
        ++field106;
        if (field106 > 98) {
            field106 = 0;
            this.field391.method297(231, false);
        }
        if (this.field357 == -1) {
            this.field242.field1069 = this.field408 - this.field162 - 77;
            if (super.field811 > 448 && super.field811 < 560 && super.field812 > 332) {
                this.method27(77, super.field812 - 357, 0, super.field811 - 17, 463, this.field408, false, this.field242, 0);
            }
            int var4 = this.field408 - 77 - this.field242.field1069;
            if (var4 < 0) {
                var4 = 0;
            }
            if (var4 > this.field408 - 77) {
                var4 = this.field408 - 77;
            }
            if (this.field162 != var4) {
                this.field162 = var4;
                this.field222 = true;
            }
            ++field163;
            if (field163 > 118) {
                field163 = 0;
                this.field391.method297(194, false);
                this.field391.method301(10523771);
            }
        }
        if (this.field357 != -1) {
            boolean var5 = this.method121(this.field262, this.field133, this.field357);
            if (var5) {
                this.field222 = true;
            }
        }
        if (this.field273 == 3) {
            this.field222 = true;
        }
        if (this.field511 == 3) {
            this.field222 = true;
        }
        if (this.field414 != null) {
            this.field222 = true;
        }
        if (this.field318 && this.field65 == 2) {
            this.field222 = true;
        }
        if (this.field222) {
            this.method126(false);
            this.field222 = false;
        }
        if (this.field122 == 2) {
            this.method50(-419);
            this.field337.method377(super.field803, 550, 1926, 4);
        }
        if (this.field134 != -1) {
            this.field62 = true;
        }
        if (this.field62) {
            if (this.field134 != -1 && this.field134 == this.field127) {
                this.field134 = -1;
                this.field391.method297(131, false);
                this.field391.method298(this.field127);
            }
            this.field62 = false;
            this.field276.method376(-329);
            this.field230.method10(0, true, 0);
            if (this.field428 == -1) {
                if (this.field194[this.field127] != -1) {
                    if (this.field127 == 0) {
                        this.field277.method10(10, true, 22);
                    }
                    if (this.field127 == 1) {
                        this.field278.method10(8, true, 54);
                    }
                    if (this.field127 == 2) {
                        this.field278.method10(8, true, 82);
                    }
                    if (this.field127 == 3) {
                        this.field279.method10(8, true, 110);
                    }
                    if (this.field127 == 4) {
                        this.field281.method10(8, true, 153);
                    }
                    if (this.field127 == 5) {
                        this.field281.method10(8, true, 181);
                    }
                    if (this.field127 == 6) {
                        this.field280.method10(9, true, 209);
                    }
                }
                if (this.field194[0] != -1 && (this.field134 != 0 || field341 % 20 < 10)) {
                    this.field397[0].method10(13, true, 29);
                }
                if (this.field194[1] != -1 && (this.field134 != 1 || field341 % 20 < 10)) {
                    this.field397[1].method10(11, true, 53);
                }
                if (this.field194[2] != -1 && (this.field134 != 2 || field341 % 20 < 10)) {
                    this.field397[2].method10(11, true, 82);
                }
                if (this.field194[3] != -1 && (this.field134 != 3 || field341 % 20 < 10)) {
                    this.field397[3].method10(12, true, 115);
                }
                if (this.field194[4] != -1 && (this.field134 != 4 || field341 % 20 < 10)) {
                    this.field397[4].method10(13, true, 153);
                }
                if (this.field194[5] != -1 && (this.field134 != 5 || field341 % 20 < 10)) {
                    this.field397[5].method10(11, true, 180);
                }
                if (this.field194[6] != -1 && (this.field134 != 6 || field341 % 20 < 10)) {
                    this.field397[6].method10(13, true, 208);
                }
            }
            this.field276.method377(super.field803, 516, 1926, 160);
            this.field275.method376(-329);
            this.field229.method10(0, true, 0);
            if (this.field428 == -1) {
                if (this.field194[this.field127] != -1) {
                    if (this.field127 == 7) {
                        this.field461.method10(0, true, 42);
                    }
                    if (this.field127 == 8) {
                        this.field462.method10(0, true, 74);
                    }
                    if (this.field127 == 9) {
                        this.field462.method10(0, true, 102);
                    }
                    if (this.field127 == 10) {
                        this.field463.method10(1, true, 130);
                    }
                    if (this.field127 == 11) {
                        this.field465.method10(0, true, 173);
                    }
                    if (this.field127 == 12) {
                        this.field465.method10(0, true, 201);
                    }
                    if (this.field127 == 13) {
                        this.field464.method10(0, true, 229);
                    }
                }
                if (this.field194[8] != -1 && (this.field134 != 8 || field341 % 20 < 10)) {
                    this.field397[7].method10(2, true, 74);
                }
                if (this.field194[9] != -1 && (this.field134 != 9 || field341 % 20 < 10)) {
                    this.field397[8].method10(3, true, 102);
                }
                if (this.field194[10] != -1 && (this.field134 != 10 || field341 % 20 < 10)) {
                    this.field397[9].method10(4, true, 137);
                }
                if (this.field194[11] != -1 && (this.field134 != 11 || field341 % 20 < 10)) {
                    this.field397[10].method10(2, true, 174);
                }
                if (this.field194[12] != -1 && (this.field134 != 12 || field341 % 20 < 10)) {
                    this.field397[11].method10(2, true, 201);
                }
                if (this.field194[13] != -1 && (this.field134 != 13 || field341 % 20 < 10)) {
                    this.field397[12].method10(2, true, 226);
                }
            }
            this.field275.method377(super.field803, 496, 1926, 466);
            this.field338.method376(-329);
        }
        if (this.field218) {
            this.field218 = false;
            this.field274.method376(-329);
            this.field228.method10(0, true, 0);
            this.field116.method357(true, 55, 16777215, "Public chat", 28, 4);
            if (this.field477 == 0) {
                this.field116.method357(true, 55, 65280, "On", 41, 4);
            }
            if (this.field477 == 1) {
                this.field116.method357(true, 55, 16776960, "Friends", 41, 4);
            }
            if (this.field477 == 2) {
                this.field116.method357(true, 55, 16711680, "Off", 41, 4);
            }
            if (this.field477 == 3) {
                this.field116.method357(true, 55, 65535, "Hide", 41, 4);
            }
            this.field116.method357(true, 184, 16777215, "Private chat", 28, 4);
            if (this.field347 == 0) {
                this.field116.method357(true, 184, 65280, "On", 41, 4);
            }
            if (this.field347 == 1) {
                this.field116.method357(true, 184, 16776960, "Friends", 41, 4);
            }
            if (this.field347 == 2) {
                this.field116.method357(true, 184, 16711680, "Off", 41, 4);
            }
            this.field116.method357(true, 324, 16777215, "Trade/compete", 28, 4);
            if (this.field212 == 0) {
                this.field116.method357(true, 324, 65280, "On", 41, 4);
            }
            if (this.field212 == 1) {
                this.field116.method357(true, 324, 16776960, "Friends", 41, 4);
            }
            if (this.field212 == 2) {
                this.field116.method357(true, 324, 16711680, "Off", 41, 4);
            }
            this.field116.method357(true, 458, 16777215, "Report abuse", 33, 4);
            this.field274.method377(super.field803, 0, 1926, 453);
            this.field338.method376(-329);
        }
        this.field262 = 0;
    }

    @OriginalMember(owner = "client", name = "v", descriptor = "(I)V")
    public static final void method83(int arg0) {
        class67.field1622 = false;
        if (arg0 >= 0 && arg0 <= 0) {
            class12.field697 = false;
            field178 = false;
            class52.field1343 = false;
            class63.field1512 = false;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZB)V")
    public final void method84(boolean arg0, byte arg1) {
        this.method49((byte) 9);
        if (arg1 == 1) {
            boolean var3 = false;
        } else {
            this.field410 = this.field61.method308();
        }
        this.field437.method376(-329);
        this.field399.method10(0, true, 0);
        short var4 = 360;
        short var5 = 200;
        if (this.field174 == 0) {
            int var6 = var5 / 2 + 80;
            this.field115.method357(true, var4 / 2, 7711145, this.field384.field579, var6, 4);
            int var7 = var5 / 2 - 20;
            this.field117.method357(true, var4 / 2, 16776960, "Welcome to RuneScape", var7, 4);
            int var18 = var7 + 30;
            int var8 = var4 / 2 - 80;
            int var9 = var5 / 2 + 20;
            this.field400.method10(var9 - 20, true, var8 - 73);
            this.field117.method357(true, var8, 16777215, "New User", var9 + 5, 4);
            int var10 = var4 / 2 + 80;
            this.field400.method10(var9 - 20, true, var10 - 73);
            this.field117.method357(true, var10, 16777215, "Existing User", var9 + 5, 4);
        }
        if (this.field174 == 2) {
            int var11 = var5 / 2 - 40;
            if (this.field179.length() > 0) {
                this.field117.method357(true, var4 / 2, 16776960, this.field179, var11 - 15, 4);
                this.field117.method357(true, var4 / 2, 16776960, this.field180, var11, 4);
                var11 += 30;
            } else {
                this.field117.method357(true, var4 / 2, 16776960, this.field180, var11 - 7, 4);
                var11 += 30;
            }
            this.field117.method364(16777215, var11, (byte) 9, var4 / 2 - 90, true, "Username: " + this.field388 + (this.field310 == 0 & field341 % 40 < 20 ? "@yel@|" : ""));
            var11 += 15;
            this.field117.method364(16777215, var11, (byte) 9, var4 / 2 - 88, true, "Password: " + class55.method474(-574, this.field389) + (this.field310 == 1 & field341 % 40 < 20 ? "@yel@|" : ""));
            var11 += 15;
            if (!arg0) {
                int var12 = var4 / 2 - 80;
                int var13 = var5 / 2 + 50;
                this.field400.method10(var13 - 20, true, var12 - 73);
                this.field117.method357(true, var12, 16777215, "Login", var13 + 5, 4);
                int var14 = var4 / 2 + 80;
                this.field400.method10(var13 - 20, true, var14 - 73);
                this.field117.method357(true, var14, 16777215, "Cancel", var13 + 5, 4);
            }
        }
        if (this.field174 == 3) {
            this.field117.method357(true, var4 / 2, 16776960, "Create a free account", var5 / 2 - 60, 4);
            int var15 = var5 / 2 - 35;
            this.field117.method357(true, var4 / 2, 16777215, "To create a new account you need to", var15, 4);
            int var19 = var15 + 15;
            this.field117.method357(true, var4 / 2, 16777215, "go back to the main RuneScape webpage", var19, 4);
            int var20 = var19 + 15;
            this.field117.method357(true, var4 / 2, 16777215, "and choose the red 'create account'", var20, 4);
            int var21 = var20 + 15;
            this.field117.method357(true, var4 / 2, 16777215, "button at the top right of that page.", var21, 4);
            int var22 = var21 + 15;
            int var16 = var4 / 2;
            int var17 = var5 / 2 + 50;
            this.field400.method10(var17 - 20, true, var16 - 73);
            this.field117.method357(true, var16, 16777215, "Cancel", var17 + 5, 4);
        }
        this.field437.method377(super.field803, 202, 1926, 171);
        if (this.field241) {
            this.field241 = false;
            this.field435.method377(super.field803, 128, 1926, 0);
            this.field436.method377(super.field803, 202, 1926, 371);
            this.field440.method377(super.field803, 0, 1926, 265);
            this.field441.method377(super.field803, 562, 1926, 265);
            this.field442.method377(super.field803, 128, 1926, 171);
            this.field443.method377(super.field803, 562, 1926, 171);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BIII)I")
    public final int method85(byte arg0, int arg1, int arg2, int arg3) {
        if (arg0 != -114) {
            this.field410 = this.field61.method308();
        }
        int var5 = 256 - arg2;
        return ((arg1 & 16711935) * var5 + (arg3 & 16711935) * arg2 & -16711936) + ((arg1 & 65280) * var5 + (arg3 & 65280) * arg2 & 16711680) >> 8;
    }

    @OriginalMember(owner = "client", name = "w", descriptor = "(I)I")
    public final int method86(int arg0) {
        int var2 = 3;
        if (arg0 != 0) {
            return 3;
        } else {
            if (this.field382 < 310) {
                int var3 = this.field379 >> 7;
                int var4 = this.field381 >> 7;
                int var5 = field488.field885 >> 7;
                int var6 = field488.field886 >> 7;
                if ((this.field158[this.field169][var3][var4] & 4) != 0) {
                    var2 = this.field169;
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
                        if ((this.field158[this.field169][var3][var4] & 4) != 0) {
                            var2 = this.field169;
                        }
                        var10 += var9;
                        if (var10 >= 65536) {
                            var10 -= 65536;
                            if (var4 < var6) {
                                ++var4;
                            } else if (var4 > var6) {
                                --var4;
                            }
                            if ((this.field158[this.field169][var3][var4] & 4) != 0) {
                                var2 = this.field169;
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
                        if ((this.field158[this.field169][var3][var4] & 4) != 0) {
                            var2 = this.field169;
                        }
                        var12 += var11;
                        if (var12 >= 65536) {
                            var12 -= 65536;
                            if (var3 < var5) {
                                ++var3;
                            } else if (var3 > var5) {
                                --var3;
                            }
                            if ((this.field158[this.field169][var3][var4] & 4) != 0) {
                                var2 = this.field169;
                            }
                        }
                    }
                }
            }
            if ((this.field158[this.field169][field488.field885 >> 7][field488.field886 >> 7] & 4) != 0) {
                var2 = this.field169;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client", name = "x", descriptor = "(I)I")
    public final int method87(int arg0) {
        if (arg0 >= 0) {
            this.method149();
        }
        int var2 = this.method99(this.field381, this.field169, 0, this.field379);
        return var2 - this.field380 < 800 && (this.field158[this.field169][this.field379 >> 7][this.field381 >> 7] & 4) != 0 ? this.field169 : 3;
    }

    @OriginalMember(owner = "client", name = "y", descriptor = "(I)V")
    public final void method88(int arg0) {
        signlink.midifade = 0;
        signlink.midi = "stop";
        if (arg0 != 1) {
            this.field410 = -1;
        }
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(B)V")
    public final void method89(byte arg0) {
        if (this.field511 == 0) {
            this.field320[0] = "Cancel";
            this.field481[0] = 1013;
            this.field268 = 1;
            this.method123(this.field499);
            this.field221 = 0;
            if (super.field811 > 4 && super.field812 > 4 && super.field811 < 516 && super.field812 < 338) {
                if (this.field150 != -1) {
                    this.method102(super.field811, super.field812, 4, class28.field1045[this.field150], 4, false, 0);
                } else {
                    this.method53(458);
                }
            }
            if (this.field221 != this.field213) {
                this.field213 = this.field221;
            }
            this.field221 = 0;
            if (super.field811 > 553 && super.field812 > 205 && super.field811 < 743 && super.field812 < 466) {
                if (this.field428 != -1) {
                    this.method102(super.field811, super.field812, 553, class28.field1045[this.field428], 205, false, 0);
                } else if (this.field194[this.field127] != -1) {
                    this.method102(super.field811, super.field812, 553, class28.field1045[this.field194[this.field127]], 205, false, 0);
                }
            }
            if (this.field328 != this.field221) {
                this.field334 = true;
                this.field328 = this.field221;
            }
            this.field221 = 0;
            if (super.field811 > 17 && super.field812 > 357 && super.field811 < 496 && super.field812 < 453) {
                if (this.field357 != -1) {
                    this.method102(super.field811, super.field812, 17, class28.field1045[this.field357], 357, false, 0);
                } else if (super.field812 < 434 && super.field811 < 426) {
                    this.method132(super.field811 - 17, 7, super.field812 - 357);
                }
            }
            if (this.field357 != -1 && this.field453 != this.field221) {
                this.field222 = true;
                this.field453 = this.field221;
            }
            boolean var2 = false;
            if (arg0 != 9) {
                this.method149();
            }
            while (!var2) {
                var2 = true;
                for (int var3 = 0; var3 < this.field268 - 1; ++var3) {
                    if (this.field481[var3] < 1000 && this.field481[var3 + 1] > 1000) {
                        String var4 = this.field320[var3];
                        this.field320[var3] = this.field320[var3 + 1];
                        this.field320[var3 + 1] = var4;
                        int var5 = this.field481[var3];
                        this.field481[var3] = this.field481[var3 + 1];
                        this.field481[var3 + 1] = var5;
                        int var6 = this.field479[var3];
                        this.field479[var3] = this.field479[var3 + 1];
                        this.field479[var3 + 1] = var6;
                        int var7 = this.field480[var3];
                        this.field480[var3] = this.field480[var3 + 1];
                        this.field480[var3 + 1] = var7;
                        int var8 = this.field482[var3];
                        this.field482[var3] = this.field482[var3 + 1];
                        this.field482[var3 + 1] = var8;
                        var2 = false;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "z", descriptor = "(I)V")
    private final void method90(int arg0) {
        if (arg0 > 0) {
            if (this.field122 == 2) {
                for (class47 var2 = (class47) this.field210.method427(); var2 != null; var2 = (class47) this.field210.method429(0)) {
                    if (var2.field1311 > 0) {
                        --var2.field1311;
                    }
                    if (var2.field1311 == 0) {
                        if (var2.field1303 < 0 || class52.method432(var2.field1305, 841, var2.field1303)) {
                            this.method71(var2.field1309, var2.field1307, var2.field1305, var2.field1303, false, var2.field1308, var2.field1306, var2.field1304);
                            var2.method234();
                        }
                    } else {
                        if (var2.field1310 > 0) {
                            --var2.field1310;
                        }
                        if (var2.field1310 == 0 && var2.field1308 >= 1 && var2.field1309 >= 1 && var2.field1308 <= 102 && var2.field1309 <= 102 && (var2.field1312 < 0 || class52.method432(var2.field1314, 841, var2.field1312))) {
                            this.method71(var2.field1309, var2.field1307, var2.field1314, var2.field1312, false, var2.field1308, var2.field1306, var2.field1313);
                            var2.field1310 = -1;
                            if (var2.field1312 == var2.field1303 && var2.field1303 == -1) {
                                var2.method234();
                            } else if (var2.field1312 == var2.field1303 && var2.field1313 == var2.field1304 && var2.field1314 == var2.field1305) {
                                var2.method234();
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "A", descriptor = "(I)V")
    public final void method91(int arg0) {
        short var2 = 256;
        int var3 = 80 / arg0;
        for (int var4 = 10; var4 < 117; ++var4) {
            int var19 = (int) (Math.random() * 100.0D);
            if (var19 < 50) {
                this.field342[(var2 - 2 << 7) + var4] = 255;
            }
        }
        for (int var5 = 0; var5 < 100; ++var5) {
            int var16 = (int) (Math.random() * 124.0D) + 2;
            int var17 = (int) (Math.random() * 128.0D) + 128;
            int var18 = (var17 << 7) + var16;
            this.field342[var18] = 192;
        }
        for (int var6 = 1; var6 < var2 - 1; ++var6) {
            for (int var14 = 1; var14 < 127; ++var14) {
                int var15 = (var6 << 7) + var14;
                this.field343[var15] = (this.field342[var15 - 1] + this.field342[var15 + 1] + this.field342[var15 - 128] + this.field342[var15 + 128]) / 4;
            }
        }
        this.field156 += 128;
        if (this.field156 > this.field286.length) {
            this.field156 -= this.field286.length;
            int var7 = (int) (Math.random() * 12.0D);
            this.method125(this.field429[var7], -949);
        }
        for (int var8 = 1; var8 < var2 - 1; ++var8) {
            for (int var11 = 1; var11 < 127; ++var11) {
                int var12 = (var8 << 7) + var11;
                int var13 = this.field343[var12 + 128] - this.field286[this.field156 + var12 & this.field286.length - 1] / 5;
                if (var13 < 0) {
                    var13 = 0;
                }
                this.field342[var12] = var13;
            }
        }
        for (int var9 = 0; var9 < var2 - 1; ++var9) {
            this.field195[var9] = this.field195[var9 + 1];
        }
        this.field195[var2 - 1] = (int) (Math.sin((double) field341 / 14.0D) * 16.0D + Math.sin((double) field341 / 15.0D) * 14.0D + Math.sin((double) field341 / 16.0D) * 12.0D);
        if (this.field504 > 0) {
            this.field504 -= 4;
        }
        if (this.field505 > 0) {
            this.field505 -= 4;
        }
        if (this.field504 == 0 && this.field505 == 0) {
            int var10 = (int) (Math.random() * 2000.0D);
            if (var10 == 0) {
                this.field504 = 1024;
            }
            if (var10 == 1) {
                this.field505 = 1024;
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LHPPBIEYV;I)V")
    public final void method92(class28 arg0, int arg1) {
        if (arg1 == 0) {
            int var3 = arg0.field1036;
            if ((var3 < 1 || var3 > 100) && (var3 < 701 || var3 > 800)) {
                if (var3 >= 101 && var3 <= 200 || var3 >= 801 && var3 <= 900) {
                    int var5 = this.field89;
                    if (this.field90 != 2) {
                        var5 = 0;
                    }
                    if (var3 > 800) {
                        var3 -= 701;
                    } else {
                        var3 -= 101;
                    }
                    if (var3 >= var5) {
                        arg0.field1037 = "";
                        arg0.field1035 = 0;
                    } else {
                        if (this.field475[var3] == 0) {
                            arg0.field1037 = "@red@Offline";
                        } else if (this.field475[var3] == field175) {
                            arg0.field1037 = "@gre@World-" + (this.field475[var3] - 9);
                        } else {
                            arg0.field1037 = "@yel@World-" + (this.field475[var3] - 9);
                        }
                        arg0.field1035 = 1;
                    }
                } else if (var3 == 203) {
                    int var6 = this.field89;
                    if (this.field90 != 2) {
                        var6 = 0;
                    }
                    arg0.field1066 = var6 * 15 + 20;
                    if (arg0.field1066 <= arg0.field1044) {
                        arg0.field1066 = arg0.field1044 + 1;
                    }
                } else if (var3 >= 401 && var3 <= 500) {
                    var3 -= 401;
                    if (var3 == 0 && this.field90 == 0) {
                        arg0.field1037 = "Loading ignore list";
                        arg0.field1035 = 0;
                    } else if (var3 == 1 && this.field90 == 0) {
                        arg0.field1037 = "Please wait...";
                        arg0.field1035 = 0;
                    } else {
                        int var7 = this.field367;
                        if (this.field90 == 0) {
                            var7 = 0;
                        }
                        if (var3 >= var7) {
                            arg0.field1037 = "";
                            arg0.field1035 = 0;
                        } else {
                            arg0.field1037 = class55.method473(false, class55.method470(this.field459[var3], (byte) 8));
                            arg0.field1035 = 1;
                        }
                    }
                } else if (var3 == 503) {
                    arg0.field1066 = this.field367 * 15 + 20;
                    if (arg0.field1066 <= arg0.field1044) {
                        arg0.field1066 = arg0.field1044 + 1;
                    }
                } else if (var3 == 327) {
                    arg0.field1025 = 150;
                    arg0.field1026 = (int) (Math.sin((double) field341 / 40.0D) * 256.0D) & 2047;
                    if (this.field323) {
                        for (int var8 = 0; var8 < 7; ++var8) {
                            int var15 = this.field348[var8];
                            if (var15 >= 0 && !class21.field843[var15].method259((byte) 1)) {
                                return;
                            }
                        }
                        this.field323 = false;
                        class10[] var9 = new class10[7];
                        int var10 = 0;
                        for (int var11 = 0; var11 < 7; ++var11) {
                            int var14 = this.field348[var11];
                            if (var14 >= 0) {
                                var9[var10++] = class21.field843[var14].method260(7);
                            }
                        }
                        class10 var12 = new class10(17776, var9, var10);
                        for (int var13 = 0; var13 < 5; ++var13) {
                            if (this.field145[var13] != 0) {
                                var12.method205(field433[var13][0], field433[var13][this.field145[var13]]);
                                if (var13 == 1) {
                                    var12.method205(field345[0], field345[this.field145[var13]]);
                                }
                            }
                        }
                        var12.method198(-390);
                        var12.method199(class26.field949[field488.field860].field951[0], 0);
                        var12.method208(64, 850, -30, -50, -30, true);
                        arg0.field1081 = 5;
                        arg0.field1082 = 0;
                        class28.method290(0, 5, var12, (byte) 0);
                    }
                } else if (var3 == 324) {
                    if (this.field81 == null) {
                        this.field81 = arg0.field1067;
                        this.field82 = arg0.field1065;
                    }
                    if (this.field444) {
                        arg0.field1067 = this.field82;
                    } else {
                        arg0.field1067 = this.field81;
                    }
                } else if (var3 == 325) {
                    if (this.field81 == null) {
                        this.field81 = arg0.field1067;
                        this.field82 = arg0.field1065;
                    }
                    if (this.field444) {
                        arg0.field1067 = this.field81;
                    } else {
                        arg0.field1067 = this.field82;
                    }
                } else if (var3 == 600) {
                    arg0.field1037 = this.field451;
                    if (field341 % 20 < 10) {
                        arg0.field1037 = arg0.field1037 + "|";
                    } else {
                        arg0.field1037 = arg0.field1037 + " ";
                    }
                } else {
                    if (var3 == 613) {
                        if (this.field223 >= 1) {
                            if (this.field494) {
                                arg0.field1061 = 16711680;
                                arg0.field1037 = "Moderator option: Mute player for 48 hours: <ON>";
                            } else {
                                arg0.field1061 = 16777215;
                                arg0.field1037 = "Moderator option: Mute player for 48 hours: <OFF>";
                            }
                        } else {
                            arg0.field1037 = "";
                        }
                    }
                    if (var3 == 650 || var3 == 655) {
                        if (this.field225 != 0) {
                            String var16;
                            if (this.field94 == 0) {
                                var16 = "earlier today";
                            } else if (this.field94 == 1) {
                                var16 = "yesterday";
                            } else {
                                var16 = this.field94 + " days ago";
                            }
                            arg0.field1037 = "You last logged in " + var16 + " from: " + signlink.dns;
                        } else {
                            arg0.field1037 = "";
                        }
                    }
                    if (var3 == 651) {
                        if (this.field292 == 0) {
                            arg0.field1037 = "0 unread messages";
                            arg0.field1061 = 16776960;
                        }
                        if (this.field292 == 1) {
                            arg0.field1037 = "1 unread message";
                            arg0.field1061 = 65280;
                        }
                        if (this.field292 > 1) {
                            arg0.field1037 = this.field292 + " unread messages";
                            arg0.field1061 = 65280;
                        }
                    }
                    if (var3 == 652) {
                        if (this.field330 == 201) {
                            if (this.field454 == 1) {
                                arg0.field1037 = "@yel@This is a non-members world: @whi@Since you are a member we";
                            } else {
                                arg0.field1037 = "";
                            }
                        } else if (this.field330 == 200) {
                            arg0.field1037 = "You have not yet set any password recovery questions.";
                        } else {
                            String var17;
                            if (this.field330 == 0) {
                                var17 = "Earlier today";
                            } else if (this.field330 == 1) {
                                var17 = "Yesterday";
                            } else {
                                var17 = this.field330 + " days ago";
                            }
                            arg0.field1037 = var17 + " you changed your recovery questions";
                        }
                    }
                    if (var3 == 653) {
                        if (this.field330 == 201) {
                            if (this.field454 == 1) {
                                arg0.field1037 = "@whi@recommend you use a members world instead. You may use";
                            } else {
                                arg0.field1037 = "";
                            }
                        } else if (this.field330 == 200) {
                            arg0.field1037 = "We strongly recommend you do so now to secure your account.";
                        } else {
                            arg0.field1037 = "If you do not remember making this change then cancel it immediately";
                        }
                    }
                    if (var3 == 654) {
                        if (this.field330 == 201) {
                            if (this.field454 == 1) {
                                arg0.field1037 = "@whi@this world but member benefits are unavailable whilst here.";
                            } else {
                                arg0.field1037 = "";
                            }
                        } else if (this.field330 == 200) {
                            arg0.field1037 = "Do this from the 'account management' area on our front webpage";
                        } else {
                            arg0.field1037 = "Do this from the 'account management' area on our front webpage";
                        }
                    }
                }
            } else if (var3 == 1 && this.field90 == 0) {
                arg0.field1037 = "Loading friend list";
                arg0.field1035 = 0;
            } else if (var3 == 1 && this.field90 == 1) {
                arg0.field1037 = "Connecting to friendserver";
                arg0.field1035 = 0;
            } else if (var3 == 2 && this.field90 != 2) {
                arg0.field1037 = "Please wait...";
                arg0.field1035 = 0;
            } else {
                int var4 = this.field89;
                if (this.field90 != 2) {
                    var4 = 0;
                }
                if (var3 > 700) {
                    var3 -= 601;
                } else {
                    --var3;
                }
                if (var3 >= var4) {
                    arg0.field1037 = "";
                    arg0.field1035 = 0;
                } else {
                    arg0.field1037 = this.field401[var3];
                    arg0.field1035 = 1;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "B", descriptor = "(I)V")
    public final void method93(int arg0) {
        int var2 = this.field117.method358(this.field329, "Choose Option");
        for (int var3 = 0; var3 < this.field268; ++var3) {
            int var11 = this.field117.method358(this.field329, this.field320[var3]);
            if (var11 > var2) {
                var2 = var11;
            }
        }
        var2 += 8;
        int var4 = this.field268 * 15 + 21;
        if (arg0 == 0) {
            if (super.field818 > 4 && super.field819 > 4 && super.field818 < 516 && super.field819 < 338) {
                int var5 = super.field818 - 4 - var2 / 2;
                if (var2 + var5 > 512) {
                    var5 = 512 - var2;
                }
                if (var5 < 0) {
                    var5 = 0;
                }
                int var6 = super.field819 - 4;
                if (var4 + var6 > 334) {
                    var6 = 334 - var4;
                }
                if (var6 < 0) {
                    var6 = 0;
                }
                this.field318 = true;
                this.field65 = 0;
                this.field66 = var5;
                this.field67 = var6;
                this.field68 = var2;
                this.field69 = this.field268 * 15 + 22;
            }
            if (super.field818 > 553 && super.field819 > 205 && super.field818 < 743 && super.field819 < 466) {
                int var7 = super.field818 - 553 - var2 / 2;
                if (var7 < 0) {
                    var7 = 0;
                } else if (var2 + var7 > 190) {
                    var7 = 190 - var2;
                }
                int var8 = super.field819 - 205;
                if (var8 < 0) {
                    var8 = 0;
                } else if (var4 + var8 > 261) {
                    var8 = 261 - var4;
                }
                this.field318 = true;
                this.field65 = 1;
                this.field66 = var7;
                this.field67 = var8;
                this.field68 = var2;
                this.field69 = this.field268 * 15 + 22;
            }
            if (super.field818 > 17 && super.field819 > 357 && super.field818 < 496 && super.field819 < 453) {
                int var9 = super.field818 - 17 - var2 / 2;
                if (var9 < 0) {
                    var9 = 0;
                } else if (var2 + var9 > 479) {
                    var9 = 479 - var2;
                }
                int var10 = super.field819 - 357;
                if (var10 < 0) {
                    var10 = 0;
                } else if (var4 + var10 > 96) {
                    var10 = 96 - var4;
                }
                this.field318 = true;
                this.field65 = 2;
                this.field66 = var9;
                this.field67 = var10;
                this.field68 = var2;
                this.field69 = this.field268 * 15 + 22;
            }
        }
    }

    @OriginalMember(owner = "client", name = "i", descriptor = "(Z)V")
    public final void method94(boolean arg0) {
        byte[] var2 = this.field506.method248("title.dat", (byte[]) null);
        class65 var3 = new class65(var2, this);
        this.field438.method376(-329);
        var3.method512(0, -503, 0);
        this.field439.method376(-329);
        var3.method512(0, -503, -637);
        this.field435.method376(-329);
        var3.method512(0, -503, -128);
        this.field436.method376(-329);
        var3.method512(-371, -503, -202);
        this.field437.method376(-329);
        var3.method512(-171, -503, -202);
        this.field440.method376(-329);
        var3.method512(-265, -503, 0);
        this.field441.method376(-329);
        var3.method512(-265, -503, -562);
        this.field442.method376(-329);
        var3.method512(-171, -503, -128);
        this.field443.method376(-329);
        var3.method512(-171, -503, -562);
        int[] var4 = new int[var3.field1582];
        for (int var5 = 0; var5 < var3.field1583; ++var5) {
            for (int var10 = 0; var10 < var3.field1582; ++var10) {
                var4[var10] = var3.field1581[var3.field1582 * var5 + (var3.field1582 - var10 - 1)];
            }
            for (int var11 = 0; var11 < var3.field1582; ++var11) {
                var3.field1581[var3.field1582 * var5 + var11] = var4[var11];
            }
        }
        this.field438.method376(-329);
        var3.method512(0, -503, 382);
        this.field439.method376(-329);
        var3.method512(0, -503, -255);
        this.field435.method376(-329);
        var3.method512(0, -503, 254);
        this.field436.method376(-329);
        var3.method512(-371, -503, 180);
        this.field437.method376(-329);
        var3.method512(-171, -503, 180);
        this.field440.method376(-329);
        var3.method512(-265, -503, 382);
        this.field441.method376(-329);
        var3.method512(-265, -503, -180);
        this.field442.method376(-329);
        var3.method512(-171, -503, 254);
        this.field443.method376(-329);
        var3.method512(-171, -503, -180);
        class65 var6 = new class65(this.field506, "logo", 0);
        this.field435.method376(-329);
        var6.method514(18, true, 382 - var6.field1582 / 2 - 128);
        Object var7 = null;
        Object var8 = null;
        if (!arg0) {
            Object var9 = null;
            System.gc();
        }
    }

    @OriginalMember(owner = "client", name = "j", descriptor = "(Z)V")
    public final void method95(boolean arg0) {
        if (this.field511 == 0) {
            int var2 = super.field817;
            this.field191 &= arg0;
            if (this.field164 == 1 && super.field818 >= 516 && super.field819 >= 160 && super.field818 <= 765 && super.field819 <= 205) {
                var2 = 0;
            }
            if (this.field318) {
                if (var2 != 1) {
                    int var3 = super.field811;
                    int var4 = super.field812;
                    if (this.field65 == 0) {
                        var3 -= 4;
                        var4 -= 4;
                    }
                    if (this.field65 == 1) {
                        var3 -= 553;
                        var4 -= 205;
                    }
                    if (this.field65 == 2) {
                        var3 -= 17;
                        var4 -= 357;
                    }
                    if (var3 < this.field66 - 10 || var3 > this.field68 + this.field66 + 10 || var4 < this.field67 - 10 || var4 > this.field69 + this.field67 + 10) {
                        this.field318 = false;
                        if (this.field65 == 1) {
                            this.field334 = true;
                        }
                        if (this.field65 == 2) {
                            this.field222 = true;
                        }
                    }
                }
                if (var2 == 1) {
                    int var5 = this.field66;
                    int var6 = this.field67;
                    int var7 = this.field68;
                    int var8 = super.field818;
                    int var9 = super.field819;
                    if (this.field65 == 0) {
                        var8 -= 4;
                        var9 -= 4;
                    }
                    if (this.field65 == 1) {
                        var8 -= 553;
                        var9 -= 205;
                    }
                    if (this.field65 == 2) {
                        var8 -= 17;
                        var9 -= 357;
                    }
                    int var10 = -1;
                    for (int var11 = 0; var11 < this.field268; ++var11) {
                        int var12 = (this.field268 - 1 - var11) * 15 + var6 + 31;
                        if (var8 > var5 && var8 < var5 + var7 && var9 > var12 - 13 && var9 < var12 + 3) {
                            var10 = var11;
                        }
                    }
                    if (var10 != -1) {
                        this.method127((byte) 1, var10);
                    }
                    this.field318 = false;
                    if (this.field65 == 1) {
                        this.field334 = true;
                    }
                    if (this.field65 == 2) {
                        this.field222 = true;
                        return;
                    }
                }
            } else {
                if (var2 == 1 && this.field268 > 0) {
                    int var13 = this.field481[this.field268 - 1];
                    if (var13 == 969 || var13 == 138 || var13 == 572 || var13 == 314 || var13 == 391 || var13 == 835 || var13 == 56 || var13 == 470 || var13 == 759 || var13 == 290 || var13 == 654 || var13 == 1790) {
                        int var14 = this.field479[this.field268 - 1];
                        int var15 = this.field480[this.field268 - 1];
                        class28 var16 = class28.field1045[var15];
                        if (var16.field1075 || var16.field1064) {
                            this.field378 = false;
                            this.field259 = 0;
                            this.field509 = var15;
                            this.field510 = var14;
                            this.field511 = 2;
                            this.field512 = super.field818;
                            this.field513 = super.field819;
                            if (class28.field1045[var15].field1072 == this.field150) {
                                this.field511 = 1;
                            }
                            if (class28.field1045[var15].field1072 == this.field357) {
                                this.field511 = 3;
                            }
                            return;
                        }
                    }
                }
                if (var2 == 1 && (this.field55 == 1 || this.method39(7, this.field268 - 1)) && this.field268 > 2) {
                    var2 = 2;
                }
                if (var2 == 1 && this.field268 > 0) {
                    this.method127((byte) 1, this.field268 - 1);
                }
                if (var2 != 2 || this.field268 <= 0) {
                    return;
                }
                this.method93(0);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LDOBKXCMM;IZII)V")
    public final void method96(class14 arg0, int arg1, boolean arg2, int arg3, int arg4) {
        if (this.field268 < 400) {
            if (arg0.field745 != null) {
                arg0 = arg0.method240(3);
            }
            if (arg0 != null) {
                String var6 = arg0.field750;
                this.field191 &= arg2;
                if (arg0.field749 != 0) {
                    var6 = var6 + method130(arg0.field749, false, field488.field536) + " (level-" + arg0.field749 + ")";
                }
                if (this.field199 == 1) {
                    this.field320[this.field268] = "Use " + this.field203 + " with @yel@" + var6;
                    this.field481[this.field268] = 370;
                    this.field482[this.field268] = arg4;
                    this.field479[this.field268] = arg3;
                    this.field480[this.field268] = arg1;
                    ++this.field268;
                } else {
                    if (this.field164 == 1) {
                        if ((this.field166 & 2) == 2) {
                            this.field320[this.field268] = this.field167 + " @yel@" + var6;
                            this.field481[this.field268] = 595;
                            this.field482[this.field268] = arg4;
                            this.field479[this.field268] = arg3;
                            this.field480[this.field268] = arg1;
                            ++this.field268;
                            return;
                        }
                    } else {
                        if (arg0.field746 != null) {
                            for (int var7 = 4; var7 >= 0; --var7) {
                                if (arg0.field746[var7] != null && !arg0.field746[var7].equalsIgnoreCase("attack")) {
                                    this.field320[this.field268] = arg0.field746[var7] + " @yel@" + var6;
                                    if (var7 == 0) {
                                        this.field481[this.field268] = 601;
                                    }
                                    if (var7 == 1) {
                                        this.field481[this.field268] = 942;
                                    }
                                    if (var7 == 2) {
                                        this.field481[this.field268] = 496;
                                    }
                                    if (var7 == 3) {
                                        this.field481[this.field268] = 335;
                                    }
                                    if (var7 == 4) {
                                        this.field481[this.field268] = 617;
                                    }
                                    this.field482[this.field268] = arg4;
                                    this.field479[this.field268] = arg3;
                                    this.field480[this.field268] = arg1;
                                    ++this.field268;
                                }
                            }
                        }
                        if (arg0.field746 != null) {
                            for (int var8 = 4; var8 >= 0; --var8) {
                                if (arg0.field746[var8] != null && arg0.field746[var8].equalsIgnoreCase("attack")) {
                                    short var9 = 0;
                                    if (arg0.field749 > field488.field536) {
                                        var9 = 2000;
                                    }
                                    this.field320[this.field268] = arg0.field746[var8] + " @yel@" + var6;
                                    if (var8 == 0) {
                                        this.field481[this.field268] = var9 + 601;
                                    }
                                    if (var8 == 1) {
                                        this.field481[this.field268] = var9 + 942;
                                    }
                                    if (var8 == 2) {
                                        this.field481[this.field268] = var9 + 496;
                                    }
                                    if (var8 == 3) {
                                        this.field481[this.field268] = var9 + 335;
                                    }
                                    if (var8 == 4) {
                                        this.field481[this.field268] = var9 + 617;
                                    }
                                    this.field482[this.field268] = arg4;
                                    this.field479[this.field268] = arg3;
                                    this.field480[this.field268] = arg1;
                                    ++this.field268;
                                }
                            }
                        }
                        this.field320[this.field268] = "Examine @yel@" + var6;
                        this.field481[this.field268] = 1258;
                        this.field482[this.field268] = arg4;
                        this.field479[this.field268] = arg3;
                        this.field480[this.field268] = arg1;
                        ++this.field268;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        return signlink.mainapp != null ? signlink.mainapp.getParameter(arg0) : super.getParameter(arg0);
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;IILjava/lang/String;II)LDYBMLHQM;")
    public final class16 method97(String arg0, int arg1, int arg2, String arg3, int arg4, int arg5) {
        byte[] var7 = null;
        int var8 = 5;
        try {
            if (this.field58[0] != null) {
                var7 = this.field58[0].method351(6, arg2);
            }
        } catch (Exception var30) {
        }
        if (var7 != null) {
            this.field135.reset();
            this.field135.update(var7);
            int var9 = (int) this.field135.getValue();
            if (arg5 != var9) {
                var7 = null;
            }
        }
        if (var7 != null) {
            return new class16(var7, -13);
        } else {
            int var11 = 0;
            while (var7 == null) {
                String var12 = "Unknown error";
                this.method120("Requesting " + arg0, arg1, 7);
                Object var13 = null;
                try {
                    int var14 = 0;
                    DataInputStream var15 = this.method108(arg3 + arg5);
                    byte[] var16 = new byte[6];
                    var15.readFully(var16, 0, 6);
                    class29 var17 = new class29((byte) -28, var16);
                    var17.field1107 = 3;
                    int var18 = var17.method312() + 6;
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
                            this.method120("Loading " + arg0 + " - " + var23 + "%", arg1, 7);
                        }
                        var14 = var23;
                    }
                    var15.close();
                    try {
                        if (this.field58[0] != null) {
                            this.field58[0].method352(arg2, var7.length, (byte) 48, var7);
                        }
                    } catch (Exception var29) {
                        this.field58[0] = null;
                    }
                    if (var7 != null) {
                        this.field135.reset();
                        this.field135.update(var7);
                        int var24 = (int) this.field135.getValue();
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
                            this.method120("Game updated - please reload page", arg1, 7);
                            var26 = 10;
                        } else {
                            this.method120(var12 + " - Retrying in " + var26, arg1, 7);
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
                    this.field520 = !this.field520;
                }
            }
            class16 var27 = new class16(var7, -13);
            this.field409 += arg4;
            return var27;
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(IILXKULRNBA;I)V")
    public final void method98(int arg0, int arg1, class65 arg2, int arg3) {
        this.field409 += arg1;
        int var5 = arg0 * arg0 + arg3 * arg3;
        if (var5 > 4225 && var5 < 90000) {
            int var6 = this.field52 + this.field226 & 2047;
            int var7 = class10.field680[var6];
            int var8 = class10.field681[var6];
            int var9 = var7 * 256 / (this.field406 + 256);
            int var10 = var8 * 256 / (this.field406 + 256);
            int var11 = arg0 * var9 + arg3 * var10 >> 16;
            int var12 = arg0 * var10 - arg3 * var9 >> 16;
            double var13 = Math.atan2((double) var11, (double) var12);
            int var15 = (int) (Math.sin(var13) * 63.0D);
            int var16 = (int) (Math.cos(var13) * 57.0D);
            this.field181.method519(20, 20, 15, var13, 256, 15, (byte) 6, var15 + 94 + 4 - 10, 83 - var16 - 20);
        } else {
            this.method20(arg3, arg0, arg2, 0);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIII)I")
    public final int method99(int arg0, int arg1, int arg2, int arg3) {
        this.field409 += arg2;
        int var5 = arg3 >> 7;
        int var6 = arg0 >> 7;
        if (var5 >= 0 && var6 >= 0 && var5 <= 103 && var6 <= 103) {
            int var7 = arg1;
            if (arg1 < 3 && (this.field158[1][var5][var6] & 2) == 2) {
                var7 = arg1 + 1;
            }
            int var8 = arg3 & 127;
            int var9 = arg0 & 127;
            int var10 = (128 - var8) * this.field299[var7][var5][var6] + this.field299[var7][var5 + 1][var6] * var8 >> 7;
            int var11 = (128 - var8) * this.field299[var7][var5][var6 + 1] + this.field299[var7][var5 + 1][var6 + 1] * var8 >> 7;
            return (128 - var9) * var10 + var9 * var11 >> 7;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILFWNRUNYO;I)V")
    public final void method100(int arg0, class23 arg1, int arg2) {
        if (arg2 >= 0) {
            this.field460 = !this.field460;
        }
        this.method101(arg1.field886, false, arg1.field885, arg0);
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IZII)V")
    public final void method101(int arg0, boolean arg1, int arg2, int arg3) {
        if (arg2 >= 128 && arg0 >= 128 && arg2 <= 13056 && arg0 <= 13056) {
            int var5 = this.method99(arg0, this.field169, 0, arg2) - arg3;
            int var6 = arg2 - this.field379;
            int var7 = var5 - this.field380;
            int var8 = arg0 - this.field381;
            int var9 = class10.field680[this.field382];
            int var10 = class10.field681[this.field382];
            int var11 = class10.field680[this.field383];
            int var12 = class10.field681[this.field383];
            int var13 = var6 * var12 + var8 * var11 >> 16;
            int var14 = var8 * var12 - var6 * var11 >> 16;
            int var16 = var7 * var10 - var9 * var14 >> 16;
            if (arg1) {
                for (int var17 = 1; var17 > 0; ++var17) {
                }
            }
            int var18 = var7 * var9 + var10 * var14 >> 16;
            if (var18 >= 50) {
                this.field171 = (var13 << 9) / var18 + class12.field702;
                this.field172 = (var16 << 9) / var18 + class12.field703;
            } else {
                this.field171 = -1;
                this.field172 = -1;
            }
        } else {
            this.field171 = -1;
            this.field172 = -1;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIILHPPBIEYV;IZI)V")
    public final void method102(int arg0, int arg1, int arg2, class28 arg3, int arg4, boolean arg5, int arg6) {
        if (arg5) {
            this.field188 = !this.field188;
        }
        if (arg3.field1020 == 0 && arg3.field1068 != null && !arg3.field1071) {
            if (arg0 >= arg2 && arg1 >= arg4 && arg0 <= arg3.field1046 + arg2 && arg1 <= arg3.field1044 + arg4) {
                int var8 = arg3.field1068.length;
                for (int var9 = 0; var9 < var8; ++var9) {
                    int var10 = arg3.field1083[var9] + arg2;
                    int var11 = arg3.field1080[var9] + arg4 - arg6;
                    class28 var12 = class28.field1045[arg3.field1068[var9]];
                    int var13 = var12.field1070 + var10;
                    int var14 = var12.field1031 + var11;
                    if ((var12.field1043 >= 0 || var12.field1076 != 0) && arg0 >= var13 && arg1 >= var14 && arg0 < var12.field1046 + var13 && arg1 < var12.field1044 + var14) {
                        if (var12.field1043 >= 0) {
                            this.field221 = var12.field1043;
                        } else {
                            this.field221 = var12.field1079;
                        }
                    }
                    if (var12.field1020 == 0) {
                        this.method102(arg0, arg1, var13, var12, var14, false, var12.field1069);
                        if (var12.field1066 > var12.field1044) {
                            this.method27(var12.field1044, arg1, var14, arg0, var12.field1046 + var13, var12.field1066, true, var12, 0);
                        }
                    } else {
                        if (var12.field1035 == 1 && arg0 >= var13 && arg1 >= var14 && arg0 < var12.field1046 + var13 && arg1 < var12.field1044 + var14) {
                            boolean var15 = false;
                            if (var12.field1036 != 0) {
                                var15 = this.method59(false, var12);
                            }
                            if (!var15) {
                                this.field320[this.field268] = var12.field1053;
                                this.field481[this.field268] = 863;
                                this.field480[this.field268] = var12.field1079;
                                ++this.field268;
                            }
                        }
                        if (var12.field1035 == 2 && this.field164 == 0 && arg0 >= var13 && arg1 >= var14 && arg0 < var12.field1046 + var13 && arg1 < var12.field1044 + var14) {
                            String var16 = var12.field1059;
                            if (var16.indexOf(" ") != -1) {
                                var16 = var16.substring(0, var16.indexOf(" "));
                            }
                            this.field320[this.field268] = var16 + " @gre@" + var12.field1085;
                            this.field481[this.field268] = 367;
                            this.field480[this.field268] = var12.field1079;
                            ++this.field268;
                        }
                        if (var12.field1035 == 3 && arg0 >= var13 && arg1 >= var14 && arg0 < var12.field1046 + var13 && arg1 < var12.field1044 + var14) {
                            this.field320[this.field268] = "Close";
                            this.field481[this.field268] = 925;
                            this.field480[this.field268] = var12.field1079;
                            ++this.field268;
                        }
                        if (var12.field1035 == 4 && arg0 >= var13 && arg1 >= var14 && arg0 < var12.field1046 + var13 && arg1 < var12.field1044 + var14) {
                            this.field320[this.field268] = var12.field1053;
                            this.field481[this.field268] = 646;
                            this.field480[this.field268] = var12.field1079;
                            ++this.field268;
                        }
                        if (var12.field1035 == 5 && arg0 >= var13 && arg1 >= var14 && arg0 < var12.field1046 + var13 && arg1 < var12.field1044 + var14) {
                            this.field320[this.field268] = var12.field1053;
                            this.field481[this.field268] = 243;
                            this.field480[this.field268] = var12.field1079;
                            ++this.field268;
                        }
                        if (var12.field1035 == 6 && !this.field497 && arg0 >= var13 && arg1 >= var14 && arg0 < var12.field1046 + var13 && arg1 < var12.field1044 + var14) {
                            this.field320[this.field268] = var12.field1053;
                            this.field481[this.field268] = 832;
                            this.field480[this.field268] = var12.field1079;
                            ++this.field268;
                        }
                        if (var12.field1020 == 2) {
                            int var17 = 0;
                            for (int var18 = 0; var18 < var12.field1044; ++var18) {
                                for (int var19 = 0; var19 < var12.field1046; ++var19) {
                                    int var20 = (var12.field1021 + 32) * var19 + var13;
                                    int var21 = (var12.field1023 + 32) * var18 + var14;
                                    if (var17 < 20) {
                                        var20 += var12.field1054[var17];
                                        var21 += var12.field1062[var17];
                                    }
                                    if (arg0 >= var20 && arg1 >= var21 && arg0 < var20 + 32 && arg1 < var21 + 32) {
                                        this.field289 = var17;
                                        this.field290 = var12.field1079;
                                        if (var12.field1051[var17] > 0) {
                                            class27 var22 = class27.method286(var12.field1051[var17] - 1);
                                            if (this.field199 == 1 && var12.field1058) {
                                                if (this.field201 != var12.field1079 || this.field200 != var17) {
                                                    this.field320[this.field268] = "Use " + this.field203 + " with @lre@" + var22.field1004;
                                                    this.field481[this.field268] = 436;
                                                    this.field482[this.field268] = var22.field1006;
                                                    this.field479[this.field268] = var17;
                                                    this.field480[this.field268] = var12.field1079;
                                                    ++this.field268;
                                                }
                                            } else if (this.field164 == 1 && var12.field1058) {
                                                if ((this.field166 & 16) == 16) {
                                                    this.field320[this.field268] = this.field167 + " @lre@" + var22.field1004;
                                                    this.field481[this.field268] = 350;
                                                    this.field482[this.field268] = var22.field1006;
                                                    this.field479[this.field268] = var17;
                                                    this.field480[this.field268] = var12.field1079;
                                                    ++this.field268;
                                                }
                                            } else {
                                                if (var12.field1058) {
                                                    for (int var23 = 4; var23 >= 3; --var23) {
                                                        if (var22.field983 != null && var22.field983[var23] != null) {
                                                            this.field320[this.field268] = var22.field983[var23] + " @lre@" + var22.field1004;
                                                            if (var23 == 3) {
                                                                this.field481[this.field268] = 759;
                                                            }
                                                            if (var23 == 4) {
                                                                this.field481[this.field268] = 290;
                                                            }
                                                            this.field482[this.field268] = var22.field1006;
                                                            this.field479[this.field268] = var17;
                                                            this.field480[this.field268] = var12.field1079;
                                                            ++this.field268;
                                                        } else if (var23 == 4) {
                                                            this.field320[this.field268] = "Drop @lre@" + var22.field1004;
                                                            this.field481[this.field268] = 290;
                                                            this.field482[this.field268] = var22.field1006;
                                                            this.field479[this.field268] = var17;
                                                            this.field480[this.field268] = var12.field1079;
                                                            ++this.field268;
                                                        }
                                                    }
                                                }
                                                if (var12.field1055) {
                                                    this.field320[this.field268] = "Use @lre@" + var22.field1004;
                                                    this.field481[this.field268] = 654;
                                                    this.field482[this.field268] = var22.field1006;
                                                    this.field479[this.field268] = var17;
                                                    this.field480[this.field268] = var12.field1079;
                                                    ++this.field268;
                                                }
                                                if (var12.field1058 && var22.field983 != null) {
                                                    for (int var24 = 2; var24 >= 0; --var24) {
                                                        if (var22.field983[var24] != null) {
                                                            this.field320[this.field268] = var22.field983[var24] + " @lre@" + var22.field1004;
                                                            if (var24 == 0) {
                                                                this.field481[this.field268] = 835;
                                                            }
                                                            if (var24 == 1) {
                                                                this.field481[this.field268] = 56;
                                                            }
                                                            if (var24 == 2) {
                                                                this.field481[this.field268] = 470;
                                                            }
                                                            this.field482[this.field268] = var22.field1006;
                                                            this.field479[this.field268] = var17;
                                                            this.field480[this.field268] = var12.field1079;
                                                            ++this.field268;
                                                        }
                                                    }
                                                }
                                                if (var12.field1028 != null) {
                                                    for (int var25 = 4; var25 >= 0; --var25) {
                                                        if (var12.field1028[var25] != null) {
                                                            this.field320[this.field268] = var12.field1028[var25] + " @lre@" + var22.field1004;
                                                            if (var25 == 0) {
                                                                this.field481[this.field268] = 969;
                                                            }
                                                            if (var25 == 1) {
                                                                this.field481[this.field268] = 138;
                                                            }
                                                            if (var25 == 2) {
                                                                this.field481[this.field268] = 572;
                                                            }
                                                            if (var25 == 3) {
                                                                this.field481[this.field268] = 314;
                                                            }
                                                            if (var25 == 4) {
                                                                this.field481[this.field268] = 391;
                                                            }
                                                            this.field482[this.field268] = var22.field1006;
                                                            this.field479[this.field268] = var17;
                                                            this.field480[this.field268] = var12.field1079;
                                                            ++this.field268;
                                                        }
                                                    }
                                                }
                                                this.field320[this.field268] = "Examine @lre@" + var22.field1004;
                                                this.field481[this.field268] = 1790;
                                                this.field482[this.field268] = var22.field1006;
                                                this.field479[this.field268] = var17;
                                                this.field480[this.field268] = var12.field1079;
                                                ++this.field268;
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

    @OriginalMember(owner = "client", name = "b", descriptor = "(ZJ)V")
    public final void method103(boolean arg0, long arg1) {
        if (arg1 != 0L) {
            if (this.field89 >= 100 && this.field182 != 1) {
                this.method46("", false, 0, "Your friendlist is full. Max of 100 for free users, and 200 for members");
            } else if (this.field89 >= 200) {
                this.method46("", false, 0, "Your friendlist is full. Max of 100 for free users, and 200 for members");
            } else {
                String var4 = class55.method473(false, class55.method470(arg1, (byte) 8));
                for (int var5 = 0; var5 < this.field89; ++var5) {
                    if (this.field284[var5] == arg1) {
                        this.method46("", false, 0, var4 + " is already on your friend list");
                        return;
                    }
                }
                for (int var6 = 0; var6 < this.field367; ++var6) {
                    if (this.field459[var6] == arg1) {
                        this.method46("", false, 0, "Please remove " + var4 + " from your ignore list first");
                        return;
                    }
                }
                if (!var4.equals(field488.field532)) {
                    this.field401[this.field89] = var4;
                    if (arg0) {
                        this.field189 = !this.field189;
                    }
                    this.field284[this.field89] = arg1;
                    this.field475[this.field89] = 0;
                    ++this.field89;
                    this.field334 = true;
                    this.field391.method297(70, false);
                    this.field391.method304(8, arg1);
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "C", descriptor = "(I)V")
    public final void method104(int arg0) {
        this.field409 += arg0;
        if (this.field300 == 2) {
            this.method101((this.field359 - this.field142 << 7) + this.field362, false, (this.field358 - this.field141 << 7) + this.field361, this.field360 * 2);
            if (this.field171 > -1 && field341 % 20 < 10) {
                this.field371[2].method514(this.field172 - 28, true, this.field171 - 12);
            }
        }
    }

    @OriginalMember(owner = "client", name = "h", descriptor = "(B)V")
    public final void method105(byte arg0) {
        if (arg0 != 62) {
            this.field189 = !this.field189;
        }
        for (int var2 = 0; var2 < this.field64; ++var2) {
            if (this.field492[var2] <= 0) {
                boolean var3 = false;
                try {
                    if (this.field387[var2] == this.field100 && this.field445[var2] == this.field498) {
                        if (!this.method151(true)) {
                            var3 = true;
                        }
                    } else {
                        class29 var4 = class22.method264(this.field445[var2], this.field387[var2], this.field97);
                        if (System.currentTimeMillis() + (long) (var4.field1107 / 22) > (long) (this.field211 / 22) + this.field396) {
                            this.field211 = var4.field1107;
                            this.field396 = System.currentTimeMillis();
                            if (this.method24(-510, var4.field1107, var4.field1106)) {
                                this.field100 = this.field387[var2];
                                this.field498 = this.field445[var2];
                            } else {
                                var3 = true;
                            }
                        }
                    }
                } catch (Exception var7) {
                }
                if (var3 && this.field492[var2] != -5) {
                    this.field492[var2] = -5;
                } else {
                    --this.field64;
                    for (int var6 = var2; var6 < this.field64; ++var6) {
                        this.field387[var6] = this.field387[var6 + 1];
                        this.field445[var6] = this.field445[var6 + 1];
                        this.field492[var6] = this.field492[var6 + 1];
                    }
                    --var2;
                }
            } else {
                int var10002 = this.field492[var2]--;
            }
        }
        if (this.field244 > 0) {
            this.field244 -= 20;
            if (this.field244 < 0) {
                this.field244 = 0;
            }
            if (this.field244 == 0 && this.field363 && !field178) {
                this.field316 = this.field187;
                this.field317 = true;
                this.field384.method171(2, this.field316);
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILjava/lang/String;)Z")
    public final boolean method106(int arg0, String arg1) {
        if (arg1 == null) {
            return false;
        } else {
            for (int var3 = 0; var3 < this.field89; ++var3) {
                if (arg1.equalsIgnoreCase(this.field401[var3])) {
                    return true;
                }
            }
            if (arg0 != 7) {
                for (int var4 = 1; var4 > 0; ++var4) {
                }
            }
            return arg1.equalsIgnoreCase(field488.field532);
        }
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(II)V")
    public final void method107(int arg0, int arg1) {
        class51 var3 = this.field390[this.field169][arg0][arg1];
        if (var3 == null) {
            this.field456.method548(this.field169, arg0, arg1);
        } else {
            int var4 = -99999999;
            class69 var5 = null;
            for (class69 var6 = (class69) var3.method427(); var6 != null; var6 = (class69) var3.method429(0)) {
                class27 var11 = class27.method286(var6.field1689);
                int var12 = var11.field999;
                if (var11.field968) {
                    var12 = (var6.field1688 + 1) * var12;
                }
                if (var12 > var4) {
                    var4 = var12;
                    var5 = var6;
                }
            }
            var3.method425(9, var5);
            class69 var7 = null;
            class69 var8 = null;
            for (class69 var9 = (class69) var3.method427(); var9 != null; var9 = (class69) var3.method429(0)) {
                if (var5.field1689 != var9.field1689 && var7 == null) {
                    var7 = var9;
                }
                if (var5.field1689 != var9.field1689 && var7.field1689 != var9.field1689 && var8 == null) {
                    var8 = var9;
                }
            }
            int var10 = (arg1 << 7) + arg0 + 1610612736;
            this.field456.method534(var5, var7, 868, var8, arg1, arg0, this.field169, var10, this.method99(arg1 * 128 + 64, this.field169, 0, arg0 * 128 + 64));
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(Ljava/lang/String;)Ljava/io/DataInputStream;")
    public final DataInputStream method108(String arg0) throws IOException {
        if (!this.field520) {
            return signlink.mainapp != null ? signlink.openurl(arg0) : new DataInputStream((new URL(this.getCodeBase(), arg0)).openStream());
        } else {
            if (this.field173 != null) {
                try {
                    this.field173.close();
                } catch (Exception var4) {
                }
                this.field173 = null;
            }
            this.field173 = this.method112(43595);
            this.field173.setSoTimeout(10000);
            InputStream var2 = this.field173.getInputStream();
            OutputStream var3 = this.field173.getOutputStream();
            var3.write(("JAGGRAB /" + arg0 + "\n\n").getBytes());
            return new DataInputStream(var2);
        }
    }

    @OriginalMember(owner = "client", name = "D", descriptor = "(I)V")
    public final void method109(int arg0) {
        this.field323 = true;
        if (arg0 < 9 || arg0 > 9) {
            this.field390 = null;
        }
        for (int var2 = 0; var2 < 7; ++var2) {
            this.field348[var2] = -1;
            for (int var3 = 0; var3 < class21.field842; ++var3) {
                if (!class21.field843[var3].field849 && class21.field843[var3].field844 == var2 + (this.field444 ? 0 : 7)) {
                    this.field348[var2] = var3;
                    break;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "i", descriptor = "(B)V")
    public final void method110(byte arg0) {
        if (arg0 != -94) {
            this.method149();
        }
        this.method152(false);
        if (this.field104 == 1) {
            this.field186[this.field103 / 100].method514(this.field102 - 8 - 4, true, this.field101 - 8 - 4);
        }
        if (this.field104 == 2) {
            this.field186[this.field103 / 100 + 4].method514(this.field102 - 8 - 4, true, this.field101 - 8 - 4);
        }
        if (this.field515 != -1) {
            this.method121(this.field262, this.field133, this.field515);
            this.method31(this.field96, 0, 0, class28.field1045[this.field515], 0);
        }
        if (this.field150 != -1) {
            this.method121(this.field262, this.field133, this.field150);
            this.method31(this.field96, 0, 0, class28.field1045[this.field150], 0);
        }
        this.method19(1);
        if (!this.field318) {
            this.method89((byte) 9);
            this.method115(this.field159);
        } else if (this.field65 == 0) {
            this.method54((byte) 4);
        }
        if (this.field385 == 1) {
            this.field371[1].method514(296, true, 472);
        }
        if (field291) {
            short var2 = 507;
            byte var3 = 20;
            int var4 = 16776960;
            if (super.field799 < 15) {
                var4 = 16711680;
            }
            this.field116.method355("Fps:" + super.field799, var4, var3, var2, -981);
            int var12 = var3 + 15;
            Runtime var5 = Runtime.getRuntime();
            int var6 = (int) ((var5.totalMemory() - var5.freeMemory()) / 1024L);
            int var7 = 16776960;
            if (var6 > 33554432 && field178) {
                int var8 = 16711680;
            }
            this.field116.method355("Mem:" + var6 + "k", 16776960, var12, var2, -981);
            var12 += 15;
        }
        if (this.field303 != 0) {
            int var9 = this.field303 / 50;
            int var10 = var9 / 60;
            int var11 = var9 % 60;
            if (var11 < 10) {
                this.field116.method360(true, 4, 16776960, "System update in: " + var10 + ":0" + var11, 329);
            } else {
                this.field116.method360(true, 4, 16776960, "System update in: " + var10 + ":" + var11, 329);
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(I)V")
    public final void method111(int arg0) {
        if (!this.field346 && !this.field260 && !this.field147) {
            ++field341;
            if (!this.field191) {
                this.method18(111);
            } else {
                this.method62(13485);
            }
            this.method60((byte) -70);
            if (arg0 == -44087) {
                ;
            }
        }
    }

    @OriginalMember(owner = "client", name = "init", descriptor = "()V")
    public final void init() {
        field175 = Integer.parseInt(this.getParameter("nodeid"));
        field176 = Integer.parseInt(this.getParameter("portoff"));
        String var1 = this.getParameter("lowmem");
        if (var1 != null && var1.equals("1")) {
            method155(field298);
        } else {
            method83(0);
        }
        String var2 = this.getParameter("free");
        if (var2 != null && var2.equals("1")) {
            field177 = false;
        } else {
            field177 = true;
        }
        this.method253(503, true, 765);
    }

    @OriginalMember(owner = "client", name = "E", descriptor = "(I)Ljava/net/Socket;")
    public final Socket method112(int arg0) throws IOException {
        return signlink.mainapp != null ? signlink.opensocket(arg0) : new Socket(InetAddress.getByName(this.getCodeBase().getHost()), arg0);
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
    public final void method113(Runnable arg0, int arg1) {
        if (arg1 > 10) {
            arg1 = 10;
        }
        if (signlink.mainapp != null) {
            signlink.startthread(arg0, arg1);
        } else {
            super.method113(arg0, arg1);
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(I)V")
    public final void method114(int arg0) {
        if (!this.field346 && !this.field260 && !this.field147) {
            ++field87;
            if (!this.field191) {
                this.method84(false, (byte) 1);
            } else {
                this.method82(0);
            }
            this.field426 = 0;
            if (arg0 >= 0) {
                for (int var2 = 1; var2 > 0; ++var2) {
                }
            }
        } else {
            this.method142(64);
        }
    }

    @OriginalMember(owner = "client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        try {
            System.out.println("RS2 user client - release #" + 307);
            if (arg0.length != 5) {
                System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
            } else {
                field175 = Integer.parseInt(arg0[0]);
                field176 = Integer.parseInt(arg0[1]);
                if (arg0[2].equals("lowmem")) {
                    method155(field298);
                } else {
                    if (!arg0[2].equals("highmem")) {
                        System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
                        return;
                    }
                    method83(0);
                }
                if (arg0[3].equals("free")) {
                    field177 = false;
                } else {
                    if (!arg0[3].equals("members")) {
                        System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
                        return;
                    }
                    field177 = true;
                }
                signlink.storeid = Integer.parseInt(arg0[4]);
                signlink.startpriv(InetAddress.getLocalHost());
                client var1 = new client();
                var1.method252(field224, 503, 765);
            }
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client", name = "j", descriptor = "(B)V")
    public final void method115(byte arg0) {
        if (this.field268 >= 2 || this.field199 != 0 || this.field164 != 0) {
            String var2;
            if (this.field199 == 1 && this.field268 < 2) {
                var2 = "Use " + this.field203 + " with...";
            } else if (this.field164 == 1 && this.field268 < 2) {
                var2 = this.field167 + "...";
            } else {
                var2 = this.field320[this.field268 - 1];
            }
            if (this.field268 > 2) {
                var2 = var2 + "@whi@ / " + (this.field268 - 2) + " more options";
            }
            this.field117.method365(15, true, var2, 16777215, 1, field341 / 1000, 4);
            if (arg0 == 108) {
                ;
            }
        }
    }

    @OriginalMember(owner = "client", name = "F", descriptor = "(I)V")
    public final void method116(int arg0) {
        this.field503 = false;
        this.field409 += arg0;
        while (this.field214) {
            this.field503 = false;
            try {
                Thread.sleep(50L);
            } catch (Exception var2) {
            }
        }
        this.field399 = null;
        this.field400 = null;
        this.field429 = null;
        this.field151 = null;
        this.field152 = null;
        this.field153 = null;
        this.field154 = null;
        this.field286 = null;
        this.field287 = null;
        this.field342 = null;
        this.field343 = null;
        this.field495 = null;
        this.field496 = null;
    }

    @OriginalMember(owner = "client", name = "k", descriptor = "(Z)V")
    public final void method117(boolean arg0) {
        if (this.field339 == null) {
            this.method116(0);
            super.field804 = null;
            this.field435 = null;
            this.field436 = null;
            this.field437 = null;
            this.field438 = null;
            this.field439 = null;
            this.field440 = null;
            this.field441 = null;
            this.field442 = null;
            this.field443 = null;
            this.field339 = new class39(479, 96, this.method136(0), 0);
            this.field337 = new class39(172, 156, this.method136(0), 0);
            class53.method456(true);
            this.field257.method10(0, true, 0);
            this.field336 = new class39(190, 261, this.method136(0), 0);
            this.field338 = new class39(512, 334, this.method136(0), 0);
            class53.method456(true);
            this.field274 = new class39(496, 50, this.method136(0), 0);
            if (!arg0) {
                this.field275 = new class39(269, 37, this.method136(0), 0);
                this.field276 = new class39(249, 45, this.method136(0), 0);
                this.field241 = true;
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(ILINLHDAGO;I)V")
    private final void method118(int arg0, class29 arg1, int arg2) {
        if (arg0 != 184) {
            for (int var4 = 1; var4 > 0; ++var4) {
            }
        }
        while (arg1.field1108 + 21 < arg2 * 8) {
            int var5 = arg1.method319(754, 14);
            if (var5 == 16383) {
                break;
            }
            if (this.field306[var5] == null) {
                this.field306[var5] = new class7();
            }
            class7 var6 = this.field306[var5];
            this.field308[this.field307++] = var5;
            var6.field864 = field341;
            int var7 = arg1.method319(754, 1);
            if (var7 == 1) {
                this.field423[this.field422++] = var5;
            }
            int var8 = arg1.method319(754, 1);
            int var9 = arg1.method319(754, 5);
            if (var9 > 15) {
                var9 -= 32;
            }
            int var10 = arg1.method319(754, 5);
            if (var10 > 15) {
                var10 -= 32;
            }
            var6.field531 = class14.method239(arg1.method319(754, 12));
            var6.field914 = var6.field531.field762;
            var6.field865 = var6.field531.field729;
            var6.field891 = var6.field531.field760;
            var6.field892 = var6.field531.field761;
            var6.field893 = var6.field531.field736;
            var6.field894 = var6.field531.field753;
            var6.field860 = var6.field531.field725;
            var6.method271(field488.field876[0] + var10, 8, field488.field877[0] + var9, var8 == 1);
        }
        arg1.method320(this.field377);
    }

    @OriginalMember(owner = "client", name = "k", descriptor = "(B)V")
    public final void method119(byte arg0) {
        try {
            this.field311 = -1;
            this.field325.method431();
            this.field283.method431();
            class12.method220(540);
            this.method63(7);
            this.field456.method527((byte) -106);
            for (int var2 = 0; var2 < 4; ++var2) {
                this.field476[var2].method484(39110);
            }
            System.gc();
            for (int var3 = 0; var3 < 4; ++var3) {
                for (int var4 = 0; var4 < 104; ++var4) {
                    for (int var5 = 0; var5 < 104; ++var5) {
                        this.field158[var3][var4][var5] = 0;
                    }
                }
            }
            class52 var6 = new class52(this.field299, this.field158, 104, (byte) 8, 104);
            int var7 = this.field478.length;
            class52.field1343 = class67.field1622;
            for (int var8 = 0; var8 < var7; ++var8) {
                int var9 = this.field264[var8] >> 8;
                int var10 = this.field264[var8] & 255;
                if (var9 == 33 && var10 >= 71 && var10 <= 73) {
                    class52.field1343 = false;
                }
            }
            if (class52.field1343) {
                this.field456.method528(this.field169, -174);
            } else {
                this.field456.method528(0, -174);
            }
            this.field391.method297(250, false);
            if (!this.field446) {
                for (int var11 = 0; var11 < var7; ++var11) {
                    int var12 = (this.field264[var11] >> 8) * 64 - this.field141;
                    int var13 = (this.field264[var11] & 255) * 64 - this.field142;
                    byte[] var14 = this.field478[var11];
                    if (var14 != null) {
                        var6.method438((this.field517 - 6) * 8, (this.field518 - 6) * 8, var12, var14, 4, var13);
                    }
                }
                for (int var15 = 0; var15 < var7; ++var15) {
                    int var16 = (this.field264[var15] >> 8) * 64 - this.field141;
                    int var17 = (this.field264[var15] & 255) * 64 - this.field142;
                    byte[] var18 = this.field478[var15];
                    if (var18 == null && this.field518 < 800) {
                        var6.method452(var17, 64, true, var16, 64);
                    }
                }
                this.field391.method297(250, false);
                for (int var19 = 0; var19 < var7; ++var19) {
                    byte[] var20 = this.field207[var19];
                    if (var20 != null) {
                        int var21 = (this.field264[var19] >> 8) * 64 - this.field141;
                        int var22 = (this.field264[var19] & 255) * 64 - this.field142;
                        var6.method450(false, this.field476, var21, this.field456, var22, var20);
                    }
                }
            }
            if (this.field446) {
                int var23 = 0;
                label251: while (true) {
                    if (var23 >= 4) {
                        for (int var33 = 0; var33 < 13; ++var33) {
                            for (int var34 = 0; var34 < 13; ++var34) {
                                int var35 = this.field449[0][var33][var34];
                                if (var35 == -1) {
                                    var6.method452(var34 * 8, 8, true, var33 * 8, 8);
                                }
                            }
                        }
                        this.field391.method297(250, false);
                        int var36 = 0;
                        while (true) {
                            if (var36 >= 4) {
                                break label251;
                            }
                            for (int var37 = 0; var37 < 13; ++var37) {
                                for (int var38 = 0; var38 < 13; ++var38) {
                                    int var39 = this.field449[var36][var37][var38];
                                    if (var39 != -1) {
                                        int var40 = var39 >> 24 & 3;
                                        int var41 = var39 >> 1 & 3;
                                        int var42 = var39 >> 14 & 1023;
                                        int var43 = var39 >> 3 & 2047;
                                        int var44 = (var42 / 8 << 8) + var43 / 8;
                                        for (int var45 = 0; var45 < this.field264.length; ++var45) {
                                            if (this.field264[var45] == var44 && this.field207[var45] != null) {
                                                var6.method433(var37 * 8, (var43 & 7) * 8, var40, this.field207[var45], (var42 & 7) * 8, this.field456, this.field188, this.field476, var38 * 8, var41, var36);
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
                            int var26 = this.field449[var23][var24][var25];
                            if (var26 != -1) {
                                int var27 = var26 >> 24 & 3;
                                int var28 = var26 >> 1 & 3;
                                int var29 = var26 >> 14 & 1023;
                                int var30 = var26 >> 3 & 2047;
                                int var31 = (var29 / 8 << 8) + var30 / 8;
                                for (int var32 = 0; var32 < this.field264.length; ++var32) {
                                    if (this.field264[var32] == var31 && this.field478[var32] != null) {
                                        var6.method435((var29 & 7) * 8, this.field478[var32], var24 * 8, var28, var25 * 8, var23, 26170, var27, (var30 & 7) * 8);
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    ++var23;
                }
            }
            this.field391.method297(250, false);
            var6.method436(0, this.field476, this.field456);
            this.field338.method376(-329);
            this.field391.method297(250, false);
            for (int var46 = 0; var46 < 104; ++var46) {
                for (int var47 = 0; var47 < 104; ++var47) {
                    this.method107(var46, var47);
                }
            }
            this.method26(192);
        } catch (Exception var61) {
        }
        class63.field1551.method423();
        if (super.field806 != null) {
            this.field391.method297(3, false);
            this.field391.method302(1057001181);
        }
        if (field178 && signlink.cache_dat != null) {
            int var49 = this.field384.method186((byte) 2, 0);
            for (int var50 = 0; var50 < var49; ++var50) {
                int var51 = this.field384.method165(false, var50);
                if ((var51 & 121) == 0) {
                    class10.method190(4, var50);
                }
            }
        }
        System.gc();
        class12.method221((byte) 1, 20);
        this.field384.method185(0);
        int var52 = (this.field517 - 6) / 8 - 1;
        int var53 = (this.field517 + 6) / 8 + 1;
        if (arg0 == 5) {
            boolean var54 = false;
        } else {
            this.field391.method298(35);
        }
        int var55 = (this.field518 - 6) / 8 - 1;
        int var56 = (this.field518 + 6) / 8 + 1;
        if (this.field253) {
            var52 = 49;
            var53 = 50;
            var55 = 49;
            var56 = 50;
        }
        for (int var57 = var52; var57 <= var53; ++var57) {
            for (int var58 = var55; var58 <= var56; ++var58) {
                if (var52 == var57 || var53 == var57 || var55 == var58 || var56 == var58) {
                    int var59 = this.field384.method169(var58, var57, 0, 6);
                    if (var59 != -1) {
                        this.field384.method172(var59, (byte) -119, 3);
                    }
                    int var60 = this.field384.method169(var58, var57, 1, 6);
                    if (var60 != -1) {
                        this.field384.method172(var60, (byte) -119, 3);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;II)V")
    public final void method120(String arg0, int arg1, int arg2) {
        this.field269 = arg1;
        this.field402 = arg0;
        this.method49((byte) 9);
        if (this.field506 == null) {
            super.method120(arg0, arg1, 7);
        } else {
            this.field437.method376(-329);
            short var4 = 360;
            short var5 = 200;
            byte var6 = 20;
            this.field117.method356(565, var5 / 2 - 26 - var6, 16777215, "RuneScape is loading - please wait...", var4 / 2);
            int var7 = var5 / 2 - 18 - var6;
            class53.method459(9179409, var4 / 2 - 152, 304, 34, var7, 2);
            class53.method459(0, var4 / 2 - 151, 302, 32, var7 + 1, 2);
            class53.method458((byte) -119, arg1 * 3, 9179409, var7 + 2, var4 / 2 - 150, 30);
            if (arg2 >= 7 && arg2 <= 7) {
                class53.method458((byte) -119, 300 - arg1 * 3, 0, var7 + 2, arg1 * 3 + (var4 / 2 - 150), 30);
                this.field117.method356(565, var5 / 2 + 5 - var6, 16777215, arg0, var4 / 2);
                this.field437.method377(super.field803, 202, 1926, 171);
                if (this.field241) {
                    this.field241 = false;
                    if (!this.field503) {
                        this.field438.method377(super.field803, 0, 1926, 0);
                        this.field439.method377(super.field803, 637, 1926, 0);
                    }
                    this.field435.method377(super.field803, 128, 1926, 0);
                    this.field436.method377(super.field803, 202, 1926, 371);
                    this.field440.method377(super.field803, 0, 1926, 265);
                    this.field441.method377(super.field803, 562, 1926, 265);
                    this.field442.method377(super.field803, 128, 1926, 171);
                    this.field443.method377(super.field803, 562, 1926, 171);
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(III)Z")
    public final boolean method121(int arg0, int arg1, int arg2) {
        boolean var4 = false;
        if (arg1 != 0) {
            this.field189 = !this.field189;
        }
        class28 var5 = class28.field1045[arg2];
        for (int var6 = 0; var6 < var5.field1068.length && var5.field1068[var6] != -1; ++var6) {
            class28 var7 = class28.field1045[var5.field1068[var6]];
            if (var7.field1020 == 1) {
                var4 |= this.method121(arg0, this.field133, var7.field1079);
            }
            if (var7.field1020 == 6 && (var7.field1073 != -1 || var7.field1074 != -1)) {
                boolean var8 = this.method55(var7, true);
                int var9;
                if (var8) {
                    var9 = var7.field1074;
                } else {
                    var9 = var7.field1073;
                }
                if (var9 != -1) {
                    class26 var10 = class26.field949[var9];
                    var7.field1048 += arg0;
                    while (var7.field1048 > var10.method275(210, var7.field1039)) {
                        var7.field1048 -= var10.method275(210, var7.field1039) + 1;
                        ++var7.field1039;
                        if (var7.field1039 >= var10.field950) {
                            var7.field1039 -= var10.field954;
                            if (var7.field1039 < 0 || var7.field1039 >= var10.field950) {
                                var7.field1039 = 0;
                            }
                        }
                        var4 = true;
                    }
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(ZI)V")
    public final void method122(boolean arg0, int arg1) {
        if (arg1 >= 0) {
            this.field390 = null;
        }
        if (field488.field885 >> 7 == this.field233 && field488.field886 >> 7 == this.field234) {
            this.field233 = 0;
        }
        int var3 = this.field420;
        if (arg0) {
            var3 = 1;
        }
        for (int var4 = 0; var4 < var3; ++var4) {
            class8 var5;
            int var6;
            if (arg0) {
                var5 = field488;
                var6 = this.field418 << 14;
            } else {
                var5 = this.field419[this.field421[var4]];
                var6 = this.field421[var4] << 14;
            }
            if (var5 != null && var5.method161((byte) 5)) {
                var5.field548 = false;
                if ((field178 && this.field420 > 50 || this.field420 > 200) && !arg0 && var5.field878 == var5.field860) {
                    var5.field548 = true;
                }
                int var7 = var5.field885 >> 7;
                int var8 = var5.field886 >> 7;
                if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                    if (var5.field559 != null && field341 >= var5.field544 && field341 < var5.field545) {
                        var5.field548 = false;
                        var5.field540 = this.method99(var5.field886, this.field169, 0, var5.field885);
                        this.field456.method539(this.field169, var5.field540, var5.field552, var5.field887, false, var5.field554, var6, var5.field885, var5.field555, var5.field553, var5.field886, var5, 60);
                    } else {
                        if ((var5.field885 & 127) == 64 && (var5.field886 & 127) == 64) {
                            if (this.field110[var7][var8] == this.field245) {
                                continue;
                            }
                            this.field110[var7][var8] = this.field245;
                        }
                        var5.field540 = this.method99(var5.field886, this.field169, 0, var5.field885);
                        this.field456.method538(var5.field886, this.field169, -610, var5.field885, var5.field862, 60, var5, var6, var5.field887, var5.field540);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "l", descriptor = "(Z)V")
    public final void method123(boolean arg0) {
        if (!arg0) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        if (this.field196 != 0) {
            int var3 = 0;
            if (this.field303 != 0) {
                var3 = 1;
            }
            for (int var4 = 0; var4 < 100; ++var4) {
                if (this.field252[var4] != null) {
                    int var5 = this.field250[var4];
                    String var6 = this.field251[var4];
                    boolean var7 = false;
                    if (var6 != null && var6.startsWith("@cr1@")) {
                        var6 = var6.substring(5);
                        boolean var8 = true;
                    }
                    if (var6 != null && var6.startsWith("@cr2@")) {
                        var6 = var6.substring(5);
                        boolean var9 = true;
                    }
                    if ((var5 == 3 || var5 == 7) && (var5 == 7 || this.field347 == 0 || this.field347 == 1 && this.method106(7, var6))) {
                        int var10 = 329 - var3 * 13;
                        if (super.field811 > 4 && super.field812 - 4 > var10 - 10 && super.field812 - 4 <= var10 + 3) {
                            int var11 = this.field116.method358(this.field329, "From:  " + var6 + this.field252[var4]) + 25;
                            if (var11 > 450) {
                                var11 = 450;
                            }
                            if (super.field811 < var11 + 4) {
                                if (this.field223 >= 1) {
                                    this.field320[this.field268] = "Report abuse @whi@" + var6;
                                    this.field481[this.field268] = 2596;
                                    ++this.field268;
                                }
                                this.field320[this.field268] = "Add ignore @whi@" + var6;
                                this.field481[this.field268] = 2505;
                                ++this.field268;
                                this.field320[this.field268] = "Add friend @whi@" + var6;
                                this.field481[this.field268] = 2726;
                                ++this.field268;
                            }
                        }
                        ++var3;
                        if (var3 >= 5) {
                            return;
                        }
                    }
                    if ((var5 == 5 || var5 == 6) && this.field347 < 2) {
                        ++var3;
                        if (var3 >= 5) {
                            return;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(ILINLHDAGO;I)V")
    private final void method124(int arg0, class29 arg1, int arg2) {
        if (arg0 == 5) {
            arg1.method318(-929);
            int var4 = arg1.method319(754, 1);
            if (var4 != 0) {
                int var5 = arg1.method319(754, 2);
                if (var5 == 0) {
                    this.field423[this.field422++] = this.field418;
                } else if (var5 == 1) {
                    int var6 = arg1.method319(754, 3);
                    field488.method272(376, false, var6);
                    int var7 = arg1.method319(754, 1);
                    if (var7 == 1) {
                        this.field423[this.field422++] = this.field418;
                    }
                } else if (var5 == 2) {
                    int var8 = arg1.method319(754, 3);
                    field488.method272(376, true, var8);
                    int var9 = arg1.method319(754, 3);
                    field488.method272(376, true, var9);
                    int var10 = arg1.method319(754, 1);
                    if (var10 == 1) {
                        this.field423[this.field422++] = this.field418;
                    }
                } else if (var5 == 3) {
                    int var11 = arg1.method319(754, 1);
                    if (var11 == 1) {
                        this.field423[this.field422++] = this.field418;
                    }
                    int var12 = arg1.method319(754, 1);
                    int var13 = arg1.method319(754, 7);
                    int var14 = arg1.method319(754, 7);
                    this.field169 = arg1.method319(754, 2);
                    field488.method271(var14, 8, var13, var12 == 1);
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LBKYZHYRW;I)V")
    public final void method125(class4 arg0, int arg1) {
        short var3 = 256;
        for (int var4 = 0; var4 < this.field286.length; ++var4) {
            this.field286[var4] = 0;
        }
        for (int var5 = 0; var5 < 5000; ++var5) {
            int var18 = (int) (Math.random() * 128.0D * (double) var3);
            this.field286[var18] = (int) (Math.random() * 256.0D);
        }
        while (arg1 >= 0) {
            for (int var17 = 1; var17 > 0; ++var17) {
            }
        }
        for (int var6 = 0; var6 < 20; ++var6) {
            for (int var13 = 1; var13 < var3 - 1; ++var13) {
                for (int var15 = 1; var15 < 127; ++var15) {
                    int var16 = (var13 << 7) + var15;
                    this.field287[var16] = (this.field286[var16 - 1] + this.field286[var16 + 1] + this.field286[var16 - 128] + this.field286[var16 + 128]) / 4;
                }
            }
            int[] var14 = this.field286;
            this.field286 = this.field287;
            this.field287 = var14;
        }
        if (arg0 != null) {
            int var7 = 0;
            for (int var8 = 0; var8 < arg0.field35; ++var8) {
                for (int var9 = 0; var9 < arg0.field34; ++var9) {
                    if (arg0.field32[var7++] != 0) {
                        int var10 = var9 + 16 + arg0.field36;
                        int var11 = var8 + 16 + arg0.field37;
                        int var12 = (var11 << 7) + var10;
                        this.field286[var12] = 0;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "m", descriptor = "(Z)V")
    public final void method126(boolean arg0) {
        this.field339.method376(-329);
        class12.field708 = this.field372;
        this.field258.method10(0, true, 0);
        if (this.field216) {
            this.field117.method356(565, 40, 0, this.field434, 239);
            this.field117.method356(565, 60, 128, this.field231 + "*", 239);
        } else if (this.field508) {
            this.field117.method356(565, 40, 0, "Enter amount:", 239);
            this.field117.method356(565, 60, 128, this.field386 + "*", 239);
        } else if (this.field414 != null) {
            this.field117.method356(565, 40, 0, this.field414, 239);
            this.field117.method356(565, 60, 128, "Click to continue", 239);
        } else if (this.field357 != -1) {
            this.method31(this.field96, 0, 0, class28.field1045[this.field357], 0);
        } else if (this.field514 != -1) {
            this.method31(this.field96, 0, 0, class28.field1045[this.field514], 0);
        } else {
            class35 var2 = this.field116;
            int var3 = 0;
            class53.method455(463, 1, 77, 0, 0);
            for (int var4 = 0; var4 < 100; ++var4) {
                if (this.field252[var4] != null) {
                    int var6 = this.field250[var4];
                    int var7 = 70 - var3 * 14 + this.field162;
                    String var8 = this.field251[var4];
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
                            var2.method360(true, 4, 0, this.field252[var4], var7);
                        }
                        ++var3;
                    }
                    if ((var6 == 1 || var6 == 2) && (var6 == 1 || this.field477 == 0 || this.field477 == 1 && this.method106(7, var8))) {
                        if (var7 > 0 && var7 < 110) {
                            int var10 = 4;
                            if (var9 == 1) {
                                this.field450[0].method10(var7 - 12, true, var10);
                                var10 += 14;
                            }
                            if (var9 == 2) {
                                this.field450[1].method10(var7 - 12, true, var10);
                                var10 += 14;
                            }
                            var2.method360(true, var10, 0, var8 + ":", var7);
                            int var11 = var10 + var2.method358(this.field329, var8) + 8;
                            var2.method360(true, var11, 255, this.field252[var4], var7);
                        }
                        ++var3;
                    }
                    if ((var6 == 3 || var6 == 7) && this.field196 == 0 && (var6 == 7 || this.field347 == 0 || this.field347 == 1 && this.method106(7, var8))) {
                        if (var7 > 0 && var7 < 110) {
                            byte var12 = 4;
                            var2.method360(true, var12, 0, "From", var7);
                            int var13 = var12 + var2.method358(this.field329, "From ");
                            if (var9 == 1) {
                                this.field450[0].method10(var7 - 12, true, var13);
                                var13 += 14;
                            }
                            if (var9 == 2) {
                                this.field450[1].method10(var7 - 12, true, var13);
                                var13 += 14;
                            }
                            var2.method360(true, var13, 0, var8 + ":", var7);
                            int var14 = var13 + var2.method358(this.field329, var8) + 8;
                            var2.method360(true, var14, 8388608, this.field252[var4], var7);
                        }
                        ++var3;
                    }
                    if (var6 == 4 && (this.field212 == 0 || this.field212 == 1 && this.method106(7, var8))) {
                        if (var7 > 0 && var7 < 110) {
                            var2.method360(true, 4, 8388736, var8 + " " + this.field252[var4], var7);
                        }
                        ++var3;
                    }
                    if (var6 == 5 && this.field196 == 0 && this.field347 < 2) {
                        if (var7 > 0 && var7 < 110) {
                            var2.method360(true, 4, 8388608, this.field252[var4], var7);
                        }
                        ++var3;
                    }
                    if (var6 == 6 && this.field196 == 0 && this.field347 < 2) {
                        if (var7 > 0 && var7 < 110) {
                            var2.method360(true, 4, 0, "To " + var8 + ":", var7);
                            var2.method360(true, 12 + var2.method358(this.field329, "To " + var8), 8388608, this.field252[var4], var7);
                        }
                        ++var3;
                    }
                    if (var6 == 8 && (this.field212 == 0 || this.field212 == 1 && this.method106(7, var8))) {
                        if (var7 > 0 && var7 < 110) {
                            var2.method360(true, 4, 8270336, var8 + " " + this.field252[var4], var7);
                        }
                        ++var3;
                    }
                }
            }
            class53.method454(true);
            this.field408 = var3 * 14 + 7;
            if (this.field408 < 78) {
                this.field408 = 78;
            }
            this.method145(4, 77, 0, 463, this.field408, this.field408 - this.field162 - 77);
            String var5;
            if (field488 != null && field488.field532 != null) {
                var5 = field488.field532;
            } else {
                var5 = class55.method473(false, this.field388);
            }
            var2.method360(true, 4, 0, var5 + ":", 90);
            var2.method360(true, 6 + var2.method358(this.field329, var5 + ": "), 255, this.field88 + "*", 90);
            class53.method461(479, this.field219, 0, 77, 0);
        }
        if (this.field318 && this.field65 == 2) {
            this.method54((byte) 4);
        }
        this.field339.method377(super.field803, 17, 1926, 357);
        this.field338.method376(-329);
        class12.field708 = this.field374;
        if (arg0) {
            this.field410 = this.field61.method308();
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BI)V")
    public final void method127(byte arg0, int arg1) {
        if (arg1 >= 0) {
            if (this.field508) {
                this.field508 = false;
                this.field222 = true;
            }
            int var3 = this.field479[arg1];
            int var4 = this.field480[arg1];
            int var5 = this.field481[arg1];
            int var6 = this.field482[arg1];
            if (var5 >= 2000) {
                var5 -= 2000;
            }
            if (var5 == 601) {
                class7 var7 = this.field306[var6];
                if (var7 != null) {
                    this.method73(2, 0, 1, var7.field876[0], 0, 3234, var7.field877[0], false, field488.field876[0], 1, 0, field488.field877[0]);
                    this.field101 = super.field818;
                    this.field102 = super.field819;
                    this.field104 = 2;
                    this.field103 = 0;
                    this.field391.method297(135, false);
                    this.field391.method330(var6, -79);
                }
            }
            if (var5 == 633) {
                boolean var8 = this.method73(2, 0, 0, var3, 0, 3234, var4, false, field488.field876[0], 0, 0, field488.field877[0]);
                if (!var8) {
                    this.method73(2, 0, 1, var3, 0, 3234, var4, false, field488.field876[0], 1, 0, field488.field877[0]);
                }
                this.field101 = super.field818;
                this.field102 = super.field819;
                this.field104 = 2;
                this.field103 = 0;
                this.field391.method297(18, false);
                this.field391.method332((byte) -51, this.field201);
                this.field391.method331(this.field200, (byte) 1);
                this.field391.method332((byte) -51, this.field202);
                this.field391.method332((byte) -51, var6);
                this.field391.method299(this.field142 + var4);
                this.field391.method299(this.field141 + var3);
            }
            if (var5 == 835) {
                this.field391.method297(40, false);
                this.field391.method330(var4, -79);
                this.field391.method299(var3);
                this.field391.method331(var6, (byte) 1);
                this.field270 = 0;
                this.field271 = var4;
                this.field272 = var3;
                this.field273 = 2;
                if (class28.field1045[var4].field1072 == this.field150) {
                    this.field273 = 1;
                }
                if (class28.field1045[var4].field1072 == this.field357) {
                    this.field273 = 3;
                }
            }
            if (var5 == 572) {
                this.field391.method297(92, false);
                this.field391.method330(var4, -79);
                this.field391.method330(var3, -79);
                this.field391.method332((byte) -51, var6);
                this.field270 = 0;
                this.field271 = var4;
                this.field272 = var3;
                this.field273 = 2;
                if (class28.field1045[var4].field1072 == this.field150) {
                    this.field273 = 1;
                }
                if (class28.field1045[var4].field1072 == this.field357) {
                    this.field273 = 3;
                }
            }
            if (var5 == 832 && !this.field497) {
                this.field391.method297(61, false);
                this.field391.method299(var4);
                this.field497 = true;
            }
            if (var5 == 888) {
                class8 var10 = this.field419[var6];
                if (var10 != null) {
                    this.method73(2, 0, 1, var10.field876[0], 0, 3234, var10.field877[0], false, field488.field876[0], 1, 0, field488.field877[0]);
                    this.field101 = super.field818;
                    this.field102 = super.field819;
                    this.field104 = 2;
                    this.field103 = 0;
                    this.field391.method297(157, false);
                    this.field391.method332((byte) -51, var6);
                }
            }
            if (var5 == 1033) {
                int var11 = var6 >> 14 & 32767;
                class63 var12 = class63.method501(var11);
                String var13;
                if (var12.field1540 != null) {
                    var13 = new String(var12.field1540);
                } else {
                    var13 = "It's a " + var12.field1519 + ".";
                }
                this.method46("", false, 0, var13);
            }
            if (var5 == 62) {
                boolean var14 = this.method73(2, 0, 0, var3, 0, 3234, var4, false, field488.field876[0], 0, 0, field488.field877[0]);
                if (!var14) {
                    this.method73(2, 0, 1, var3, 0, 3234, var4, false, field488.field876[0], 1, 0, field488.field877[0]);
                }
                this.field101 = super.field818;
                this.field102 = super.field819;
                this.field104 = 2;
                this.field103 = 0;
                field415 += this.field141;
                if (field415 >= 86) {
                    this.field391.method297(72, false);
                    this.field391.method299(10341);
                    field415 = 0;
                }
                this.field391.method297(242, false);
                this.field391.method332((byte) -51, var6);
                this.field391.method332((byte) -51, this.field142 + var4);
                this.field391.method331(this.field141 + var3, (byte) 1);
            }
            if (var5 == 758) {
                class8 var16 = this.field419[var6];
                if (var16 != null) {
                    this.method73(2, 0, 1, var16.field876[0], 0, 3234, var16.field877[0], false, field488.field876[0], 1, 0, field488.field877[0]);
                    this.field101 = super.field818;
                    this.field102 = super.field819;
                    this.field104 = 2;
                    this.field103 = 0;
                    this.field391.method297(137, false);
                    this.field391.method299(var6);
                }
            }
            if (var5 == 469) {
                class8 var17 = this.field419[var6];
                if (var17 != null) {
                    this.method73(2, 0, 1, var17.field876[0], 0, 3234, var17.field877[0], false, field488.field876[0], 1, 0, field488.field877[0]);
                    this.field101 = super.field818;
                    this.field102 = super.field819;
                    this.field104 = 2;
                    this.field103 = 0;
                    this.field391.method297(213, false);
                    this.field391.method332((byte) -51, this.field165);
                    this.field391.method331(var6, (byte) 1);
                }
            }
            if (var5 == 726 || var5 == 505 || var5 == 649 || var5 == 200) {
                String var18 = this.field320[arg1];
                int var19 = var18.indexOf("@whi@");
                if (var19 != -1) {
                    long var20 = class55.method469(var18.substring(var19 + 5).trim());
                    if (var5 == 726) {
                        this.method103(false, var20);
                    }
                    if (var5 == 505) {
                        this.method67(false, var20);
                    }
                    if (var5 == 649) {
                        this.method35(this.field405, var20);
                    }
                    if (var5 == 200) {
                        this.method56(var20, -451);
                    }
                }
            }
            if (var5 == 470) {
                this.field391.method297(106, false);
                this.field391.method332((byte) -51, var4);
                this.field391.method299(var3);
                this.field391.method331(var6, (byte) 1);
                this.field270 = 0;
                this.field271 = var4;
                this.field272 = var3;
                this.field273 = 2;
                if (class28.field1045[var4].field1072 == this.field150) {
                    this.field273 = 1;
                }
                if (class28.field1045[var4].field1072 == this.field357) {
                    this.field273 = 3;
                }
            }
            if (var5 == 654) {
                this.field199 = 1;
                this.field200 = var3;
                this.field201 = var4;
                this.field202 = var6;
                this.field203 = class27.method286(var6).field1004;
                this.field164 = 0;
                this.field334 = true;
            } else if (var5 == 367) {
                class28 var22 = class28.field1045[var4];
                this.field164 = 1;
                this.field165 = var4;
                this.field166 = var22.field1042;
                this.field199 = 0;
                this.field334 = true;
                String var23 = var22.field1059;
                if (var23.indexOf(" ") != -1) {
                    var23 = var23.substring(0, var23.indexOf(" "));
                }
                String var24 = var22.field1059;
                if (var24.indexOf(" ") != -1) {
                    var24 = var24.substring(var24.indexOf(" ") + 1);
                }
                this.field167 = var23 + " " + var22.field1085 + " " + var24;
                if (this.field166 == 16) {
                    this.field334 = true;
                    this.field127 = 3;
                    this.field62 = true;
                }
            } else {
                if (var5 == 985) {
                    boolean var25 = this.method73(2, 0, 0, var3, 0, 3234, var4, false, field488.field876[0], 0, 0, field488.field877[0]);
                    if (!var25) {
                        this.method73(2, 0, 1, var3, 0, 3234, var4, false, field488.field876[0], 1, 0, field488.field877[0]);
                    }
                    this.field101 = super.field818;
                    this.field102 = super.field819;
                    this.field104 = 2;
                    this.field103 = 0;
                    this.field391.method297(123, false);
                    this.field391.method332((byte) -51, var6);
                    this.field391.method299(this.field142 + var4);
                    this.field391.method299(this.field141 + var3);
                }
                if (var5 == 290) {
                    if ((var6 & 3) == 0) {
                        ++field239;
                    }
                    if (field239 >= 84) {
                        this.field391.method297(48, false);
                        this.field391.method299(3240);
                        field239 = 0;
                    }
                    this.field391.method297(232, false);
                    this.field391.method331(var4, (byte) 1);
                    this.field391.method331(var3, (byte) 1);
                    this.field391.method330(var6, -79);
                    this.field270 = 0;
                    this.field271 = var4;
                    this.field272 = var3;
                    this.field273 = 2;
                    if (class28.field1045[var4].field1072 == this.field150) {
                        this.field273 = 1;
                    }
                    if (class28.field1045[var4].field1072 == this.field357) {
                        this.field273 = 3;
                    }
                }
                if (var5 == 314) {
                    this.field391.method297(69, false);
                    this.field391.method330(var4, -79);
                    this.field391.method299(var3);
                    this.field391.method330(var6, -79);
                    this.field270 = 0;
                    this.field271 = var4;
                    this.field272 = var3;
                    this.field273 = 2;
                    if (class28.field1045[var4].field1072 == this.field150) {
                        this.field273 = 1;
                    }
                    if (class28.field1045[var4].field1072 == this.field357) {
                        this.field273 = 3;
                    }
                }
                if (var5 == 969) {
                    this.field391.method297(183, false);
                    this.field391.method330(var4, -79);
                    this.field391.method331(var3, (byte) 1);
                    this.field391.method331(var6, (byte) 1);
                    this.field270 = 0;
                    this.field271 = var4;
                    this.field272 = var3;
                    this.field273 = 2;
                    if (class28.field1045[var4].field1072 == this.field150) {
                        this.field273 = 1;
                    }
                    if (class28.field1045[var4].field1072 == this.field357) {
                        this.field273 = 3;
                    }
                }
                if (var5 == 1385) {
                    class27 var27 = class27.method286(var6);
                    String var28;
                    if (var27.field1014 != null) {
                        var28 = new String(var27.field1014);
                    } else {
                        var28 = "It's a " + var27.field1004 + ".";
                    }
                    this.method46("", false, 0, var28);
                }
                if (var5 == 323) {
                    this.method148(var3, var4, 0, var6);
                    this.field391.method297(249, false);
                    this.field391.method299(var6 >> 14 & 32767);
                    this.field391.method330(this.field142 + var4, -79);
                    this.field391.method331(this.field141 + var3, (byte) 1);
                }
                if (var5 == 122) {
                    boolean var29 = this.method73(2, 0, 0, var3, 0, 3234, var4, false, field488.field876[0], 0, 0, field488.field877[0]);
                    if (!var29) {
                        this.method73(2, 0, 1, var3, 0, 3234, var4, false, field488.field876[0], 1, 0, field488.field877[0]);
                    }
                    this.field101 = super.field818;
                    this.field102 = super.field819;
                    this.field104 = 2;
                    this.field103 = 0;
                    this.field391.method297(200, false);
                    this.field391.method299(this.field165);
                    this.field391.method299(var6);
                    this.field391.method331(this.field142 + var4, (byte) 1);
                    this.field391.method331(this.field141 + var3, (byte) 1);
                }
                if (var5 == 113) {
                    this.method148(var3, var4, 0, var6);
                    this.field391.method297(102, false);
                    this.field391.method330(var6 >> 14 & 32767, -79);
                    this.field391.method299(this.field142 + var4);
                    this.field391.method299(this.field141 + var3);
                }
                if (var5 == 925) {
                    this.method147((byte) 3);
                }
                if (var5 == 496) {
                    class7 var31 = this.field306[var6];
                    if (var31 != null) {
                        this.method73(2, 0, 1, var31.field876[0], 0, 3234, var31.field877[0], false, field488.field876[0], 1, 0, field488.field877[0]);
                        this.field101 = super.field818;
                        this.field102 = super.field819;
                        this.field104 = 2;
                        this.field103 = 0;
                        if ((var6 & 3) == 0) {
                            ++field105;
                        }
                        if (field105 >= 86) {
                            this.field391.method297(47, false);
                            this.field391.method302(0);
                            field105 = 0;
                        }
                        this.field391.method297(155, false);
                        this.field391.method299(var6);
                    }
                }
                if (var5 == 596) {
                    String var32 = this.field320[arg1];
                    int var33 = var32.indexOf("@whi@");
                    if (var33 != -1) {
                        if (this.field150 == -1) {
                            this.method147((byte) 3);
                            this.field451 = var32.substring(var33 + 5).trim();
                            this.field494 = false;
                            for (int var34 = 0; var34 < class28.field1045.length; ++var34) {
                                if (class28.field1045[var34] != null && class28.field1045[var34].field1036 == 600) {
                                    this.field314 = this.field150 = class28.field1045[var34].field1072;
                                    break;
                                }
                            }
                        } else {
                            this.method46("", false, 0, "Please close the interface you have open before using 'report abuse'");
                        }
                    }
                }
                if (var5 == 393 || var5 == 752) {
                    String var35 = this.field320[arg1];
                    int var36 = var35.indexOf("@whi@");
                    if (var36 != -1) {
                        String var37 = var35.substring(var36 + 5).trim();
                        String var38 = class55.method473(false, class55.method470(class55.method469(var37), (byte) 8));
                        boolean var39 = false;
                        for (int var40 = 0; var40 < this.field420; ++var40) {
                            class8 var41 = this.field419[this.field421[var40]];
                            if (var41 != null && var41.field532 != null && var41.field532.equalsIgnoreCase(var38)) {
                                this.method73(2, 0, 1, var41.field876[0], 0, 3234, var41.field877[0], false, field488.field876[0], 1, 0, field488.field877[0]);
                                if (var5 == 393) {
                                    this.field391.method297(221, false);
                                    this.field391.method332((byte) -51, this.field421[var40]);
                                }
                                if (var5 == 752) {
                                    this.field391.method297(157, false);
                                    this.field391.method332((byte) -51, this.field421[var40]);
                                }
                                var39 = true;
                                break;
                            }
                        }
                        if (!var39) {
                            this.method46("", false, 0, "Unable to find " + var38);
                        }
                    }
                }
                if (var5 == 646) {
                    this.field391.method297(107, false);
                    this.field391.method299(var4);
                    class28 var42 = class28.field1045[var4];
                    if (var42.field1050 != null && var42.field1050[0][0] == 5) {
                        int var43 = var42.field1050[0][1];
                        this.field353[var43] = 1 - this.field353[var43];
                        this.method61(-35444, var43);
                        this.field334 = true;
                    }
                }
                if (var5 == 350) {
                    this.field391.method297(1, false);
                    this.field391.method299(this.field165);
                    this.field391.method332((byte) -51, var4);
                    this.field391.method332((byte) -51, var3);
                    this.field391.method330(var6, -79);
                    this.field270 = 0;
                    this.field271 = var4;
                    this.field272 = var3;
                    this.field273 = 2;
                    if (class28.field1045[var4].field1072 == this.field150) {
                        this.field273 = 1;
                    }
                    if (class28.field1045[var4].field1072 == this.field357) {
                        this.field273 = 3;
                    }
                }
                if (var5 == 863) {
                    class28 var44 = class28.field1045[var4];
                    boolean var45 = true;
                    if (var44.field1036 > 0) {
                        var45 = this.method32(6, var44);
                    }
                    if (var45) {
                        this.field391.method297(107, false);
                        this.field391.method299(var4);
                    }
                }
                if (var5 == 436) {
                    this.field391.method297(26, false);
                    this.field391.method330(this.field201, -79);
                    this.field391.method299(this.field200);
                    this.field391.method330(this.field202, -79);
                    this.field391.method330(var4, -79);
                    this.field391.method331(var3, (byte) 1);
                    this.field391.method299(var6);
                    this.field270 = 0;
                    this.field271 = var4;
                    this.field272 = var3;
                    this.field273 = 2;
                    if (class28.field1045[var4].field1072 == this.field150) {
                        this.field273 = 1;
                    }
                    if (class28.field1045[var4].field1072 == this.field357) {
                        this.field273 = 3;
                    }
                }
                if (var5 == 437) {
                    class8 var46 = this.field419[var6];
                    if (var46 != null) {
                        this.method73(2, 0, 1, var46.field876[0], 0, 3234, var46.field877[0], false, field488.field876[0], 1, 0, field488.field877[0]);
                        this.field101 = super.field818;
                        this.field102 = super.field819;
                        this.field104 = 2;
                        this.field103 = 0;
                        this.field391.method297(221, false);
                        this.field391.method332((byte) -51, var6);
                    }
                }
                if (var5 == 456) {
                    String var47 = this.field320[arg1];
                    int var48 = var47.indexOf("@whi@");
                    if (var48 != -1) {
                        long var49 = class55.method469(var47.substring(var48 + 5).trim());
                        int var51 = -1;
                        for (int var52 = 0; var52 < this.field89; ++var52) {
                            if (this.field284[var52] == var49) {
                                var51 = var52;
                                break;
                            }
                        }
                        if (var51 != -1 && this.field475[var51] > 0) {
                            this.field222 = true;
                            this.field508 = false;
                            this.field216 = true;
                            this.field231 = "";
                            this.field95 = 3;
                            this.field327 = this.field284[var51];
                            this.field434 = "Enter message to send to " + this.field401[var51];
                        }
                    }
                }
                if (var5 == 370) {
                    class7 var53 = this.field306[var6];
                    if (var53 != null) {
                        this.method73(2, 0, 1, var53.field876[0], 0, 3234, var53.field877[0], false, field488.field876[0], 1, 0, field488.field877[0]);
                        this.field101 = super.field818;
                        this.field102 = super.field819;
                        this.field104 = 2;
                        this.field103 = 0;
                        this.field391.method297(169, false);
                        this.field391.method332((byte) -51, this.field201);
                        this.field391.method330(this.field200, -79);
                        this.field391.method299(this.field202);
                        this.field391.method331(var6, (byte) 1);
                    }
                }
                if (var5 == 595) {
                    class7 var54 = this.field306[var6];
                    if (var54 != null) {
                        this.method73(2, 0, 1, var54.field876[0], 0, 3234, var54.field877[0], false, field488.field876[0], 1, 0, field488.field877[0]);
                        this.field101 = super.field818;
                        this.field102 = super.field819;
                        this.field104 = 2;
                        this.field103 = 0;
                        this.field391.method297(247, false);
                        this.field391.method299(this.field165);
                        this.field391.method331(var6, (byte) 1);
                    }
                }
                if (var5 == 364 && this.method148(var3, var4, 0, var6)) {
                    this.field391.method297(210, false);
                    this.field391.method299(this.field165);
                    this.field391.method330(var6 >> 14 & 32767, -79);
                    this.field391.method331(this.field142 + var4, (byte) 1);
                    this.field391.method330(this.field141 + var3, -79);
                }
                if (var5 == 959) {
                    boolean var55 = this.method73(2, 0, 0, var3, 0, 3234, var4, false, field488.field876[0], 0, 0, field488.field877[0]);
                    if (!var55) {
                        this.method73(2, 0, 1, var3, 0, 3234, var4, false, field488.field876[0], 1, 0, field488.field877[0]);
                    }
                    this.field101 = super.field818;
                    this.field102 = super.field819;
                    this.field104 = 2;
                    this.field103 = 0;
                    this.field391.method297(184, false);
                    this.field391.method332((byte) -51, var6);
                    this.field391.method332((byte) -51, this.field142 + var4);
                    this.field391.method299(this.field141 + var3);
                }
                if (var5 == 607) {
                    this.method148(var3, var4, 0, var6);
                    this.field391.method297(76, false);
                    this.field391.method299(var6 >> 14 & 32767);
                    this.field391.method331(this.field142 + var4, (byte) 1);
                    this.field391.method332((byte) -51, this.field141 + var3);
                }
                if (var5 == 1258) {
                    class7 var57 = this.field306[var6];
                    if (var57 != null) {
                        class14 var58 = var57.field531;
                        if (var58.field745 != null) {
                            var58 = var58.method240(3);
                        }
                        if (var58 != null) {
                            String var59;
                            if (var58.field728 != null) {
                                var59 = new String(var58.field728);
                            } else {
                                var59 = "It's a " + var58.field750 + ".";
                            }
                            this.method46("", false, 0, var59);
                        }
                    }
                }
                if (var5 == 1790) {
                    class27 var60 = class27.method286(var6);
                    class28 var61 = class28.field1045[var4];
                    String var62;
                    if (var61 != null && var61.field1057[var3] >= 100000) {
                        var62 = var61.field1057[var3] + " x " + var60.field1004;
                    } else if (var60.field1014 != null) {
                        var62 = new String(var60.field1014);
                    } else {
                        var62 = "It's a " + var60.field1004 + ".";
                    }
                    this.method46("", false, 0, var62);
                }
                if (var5 == 608) {
                    class8 var63 = this.field419[var6];
                    if (var63 != null) {
                        this.method73(2, 0, 1, var63.field876[0], 0, 3234, var63.field877[0], false, field488.field876[0], 1, 0, field488.field877[0]);
                        this.field101 = super.field818;
                        this.field102 = super.field819;
                        this.field104 = 2;
                        this.field103 = 0;
                        this.field391.method297(134, false);
                        this.field391.method332((byte) -51, var6);
                    }
                }
                if (var5 == 335) {
                    class7 var64 = this.field306[var6];
                    if (var64 != null) {
                        this.method73(2, 0, 1, var64.field876[0], 0, 3234, var64.field877[0], false, field488.field876[0], 1, 0, field488.field877[0]);
                        this.field101 = super.field818;
                        this.field102 = super.field819;
                        this.field104 = 2;
                        this.field103 = 0;
                        field198 += var6;
                        if (field198 >= 148) {
                            this.field391.method297(252, false);
                            this.field391.method299(47761);
                            field198 = 0;
                        }
                        this.field391.method297(73, false);
                        this.field391.method299(var6);
                    }
                }
                if (var5 == 341) {
                    class8 var65 = this.field419[var6];
                    if (var65 != null) {
                        this.method73(2, 0, 1, var65.field876[0], 0, 3234, var65.field877[0], false, field488.field876[0], 1, 0, field488.field877[0]);
                        this.field101 = super.field818;
                        this.field102 = super.field819;
                        this.field104 = 2;
                        this.field103 = 0;
                        field431 += var6;
                        if (field431 >= 142) {
                            this.field391.method297(35, false);
                            this.field391.method301(2915346);
                            field431 = 0;
                        }
                        this.field391.method297(145, false);
                        this.field391.method331(var6, (byte) 1);
                    }
                }
                if (var5 == 317 && this.method148(var3, var4, 0, var6)) {
                    this.field391.method297(28, false);
                    this.field391.method330(this.field201, -79);
                    this.field391.method330(this.field200, -79);
                    this.field391.method332((byte) -51, this.field202);
                    this.field391.method330(var6 >> 14 & 32767, -79);
                    this.field391.method331(this.field142 + var4, (byte) 1);
                    this.field391.method299(this.field141 + var3);
                }
                if (var5 == 391) {
                    field335 += var4;
                    if (field335 >= 102) {
                        this.field391.method297(190, false);
                        this.field391.method298(224);
                        field335 = 0;
                    }
                    this.field391.method297(53, false);
                    this.field391.method330(var4, -79);
                    this.field391.method330(var3, -79);
                    this.field391.method330(var6, -79);
                    this.field270 = 0;
                    this.field271 = var4;
                    this.field272 = var3;
                    this.field273 = 2;
                    if (class28.field1045[var4].field1072 == this.field150) {
                        this.field273 = 1;
                    }
                    if (class28.field1045[var4].field1072 == this.field357) {
                        this.field273 = 3;
                    }
                }
                if (var5 == 78) {
                    class8 var66 = this.field419[var6];
                    if (var66 != null) {
                        this.method73(2, 0, 1, var66.field876[0], 0, 3234, var66.field877[0], false, field488.field876[0], 1, 0, field488.field877[0]);
                        this.field101 = super.field818;
                        this.field102 = super.field819;
                        this.field104 = 2;
                        this.field103 = 0;
                        this.field391.method297(165, false);
                        this.field391.method331(this.field201, (byte) 1);
                        this.field391.method299(this.field200);
                        this.field391.method331(this.field202, (byte) 1);
                        this.field391.method331(var6, (byte) 1);
                    }
                }
                if (var5 == 617) {
                    class7 var67 = this.field306[var6];
                    if (var67 != null) {
                        this.method73(2, 0, 1, var67.field876[0], 0, 3234, var67.field877[0], false, field488.field876[0], 1, 0, field488.field877[0]);
                        this.field101 = super.field818;
                        this.field102 = super.field819;
                        this.field104 = 2;
                        this.field103 = 0;
                        this.field391.method297(243, false);
                        this.field391.method299(var6);
                    }
                }
                if (var5 == 138) {
                    this.field391.method297(220, false);
                    this.field391.method299(var4);
                    this.field391.method330(var3, -79);
                    this.field391.method299(var6);
                    this.field270 = 0;
                    this.field271 = var4;
                    this.field272 = var3;
                    this.field273 = 2;
                    if (class28.field1045[var4].field1072 == this.field150) {
                        this.field273 = 1;
                    }
                    if (class28.field1045[var4].field1072 == this.field357) {
                        this.field273 = 3;
                    }
                }
                if (var5 == 872) {
                    ++field108;
                    if (field108 >= 93) {
                        this.field391.method297(30, false);
                        this.field391.method302(0);
                        field108 = 0;
                    }
                    this.method148(var3, var4, 0, var6);
                    this.field391.method297(80, false);
                    this.field391.method331(var6 >> 14 & 32767, (byte) 1);
                    this.field391.method330(this.field142 + var4, -79);
                    this.field391.method332((byte) -51, this.field141 + var3);
                }
                if (var5 == 56) {
                    this.field391.method297(226, false);
                    this.field391.method332((byte) -51, var4);
                    this.field391.method299(var3);
                    this.field391.method299(var6);
                    this.field270 = 0;
                    this.field271 = var4;
                    this.field272 = var3;
                    this.field273 = 2;
                    if (class28.field1045[var4].field1072 == this.field150) {
                        this.field273 = 1;
                    }
                    if (class28.field1045[var4].field1072 == this.field357) {
                        this.field273 = 3;
                    }
                }
                if (var5 == 143) {
                    boolean var68 = this.method73(2, 0, 0, var3, 0, 3234, var4, false, field488.field876[0], 0, 0, field488.field877[0]);
                    if (!var68) {
                        this.method73(2, 0, 1, var3, 0, 3234, var4, false, field488.field876[0], 1, 0, field488.field877[0]);
                    }
                    this.field101 = super.field818;
                    this.field102 = super.field819;
                    this.field104 = 2;
                    this.field103 = 0;
                    this.field391.method297(14, false);
                    this.field391.method331(var6, (byte) 1);
                    this.field391.method299(this.field142 + var4);
                    this.field391.method331(this.field141 + var3, (byte) 1);
                }
                if (var5 == 243) {
                    this.field391.method297(107, false);
                    this.field391.method299(var4);
                    class28 var70 = class28.field1045[var4];
                    if (var70.field1050 != null && var70.field1050[0][0] == 5) {
                        int var71 = var70.field1050[0][1];
                        if (this.field353[var71] != var70.field1040[0]) {
                            this.field353[var71] = var70.field1040[0];
                            this.method61(-35444, var71);
                            this.field334 = true;
                        }
                    }
                }
                if (var5 == 759) {
                    this.field391.method297(122, false);
                    this.field391.method299(var4);
                    this.field391.method332((byte) -51, var3);
                    this.field391.method332((byte) -51, var6);
                    this.field270 = 0;
                    this.field271 = var4;
                    this.field272 = var3;
                    this.field273 = 2;
                    if (class28.field1045[var4].field1072 == this.field150) {
                        this.field273 = 1;
                    }
                    if (class28.field1045[var4].field1072 == this.field357) {
                        this.field273 = 3;
                    }
                }
                if (var5 == 473) {
                    boolean var72 = this.method73(2, 0, 0, var3, 0, 3234, var4, false, field488.field876[0], 0, 0, field488.field877[0]);
                    if (!var72) {
                        this.method73(2, 0, 1, var3, 0, 3234, var4, false, field488.field876[0], 1, 0, field488.field877[0]);
                    }
                    this.field101 = super.field818;
                    this.field102 = super.field819;
                    this.field104 = 2;
                    this.field103 = 0;
                    ++field288;
                    if (field288 >= 106) {
                        this.field391.method297(230, false);
                        this.field391.method301(16152602);
                        field288 = 0;
                    }
                    this.field391.method297(115, false);
                    this.field391.method299(var6);
                    this.field391.method331(this.field142 + var4, (byte) 1);
                    this.field391.method330(this.field141 + var3, -79);
                }
                if (var5 == 89) {
                    if (!this.field318) {
                        this.field456.method565((byte) -60, super.field818 - 4, super.field819 - 4);
                    } else {
                        this.field456.method565((byte) -60, var3 - 4, var4 - 4);
                    }
                }
                if (var5 == 942) {
                    class7 var74 = this.field306[var6];
                    if (var74 != null) {
                        this.method73(2, 0, 1, var74.field876[0], 0, 3234, var74.field877[0], false, field488.field876[0], 1, 0, field488.field877[0]);
                        this.field101 = super.field818;
                        this.field102 = super.field819;
                        this.field104 = 2;
                        this.field103 = 0;
                        this.field391.method297(248, false);
                        this.field391.method299(var6);
                    }
                }
                if (var5 == 1416) {
                    this.method148(var3, var4, 0, var6);
                    this.field391.method297(96, false);
                    this.field391.method299(var6 >> 14 & 32767);
                    this.field391.method332((byte) -51, this.field142 + var4);
                    this.field391.method331(this.field141 + var3, (byte) 1);
                }
                this.field199 = 0;
                if (arg0 == 1) {
                    boolean var75 = false;
                } else {
                    this.field390 = null;
                }
                this.field164 = 0;
                this.field334 = true;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IBLINLHDAGO;)V")
    private final void method128(int arg0, byte arg1, class29 arg2) {
        if (arg1 == 8) {
            boolean var4 = false;
        } else {
            this.field133 = this.field354.method481();
        }
        while (arg2.field1108 + 10 < arg0 * 8) {
            int var5 = arg2.method319(754, 11);
            if (var5 == 2047) {
                break;
            }
            if (this.field419[var5] == null) {
                this.field419[var5] = new class8();
                if (this.field424[var5] != null) {
                    this.field419[var5].method163(this.field424[var5], true);
                }
            }
            this.field421[this.field420++] = var5;
            class8 var6 = this.field419[var5];
            var6.field864 = field341;
            int var7 = arg2.method319(754, 1);
            if (var7 == 1) {
                this.field423[this.field422++] = var5;
            }
            int var8 = arg2.method319(754, 1);
            int var9 = arg2.method319(754, 5);
            if (var9 > 15) {
                var9 -= 32;
            }
            int var10 = arg2.method319(754, 5);
            if (var10 > 15) {
                var10 -= 32;
            }
            var6.method271(field488.field876[0] + var10, 8, field488.field877[0] + var9, var8 == 1);
        }
        arg2.method320(this.field377);
    }

    @OriginalMember(owner = "client", name = "G", descriptor = "(I)V")
    public final void method129(int arg0) {
        if (arg0 != 4) {
            field298 = !field298;
        }
        int var2 = 5;
        this.field333[8] = 0;
        int var3 = 0;
        while (this.field333[8] == 0) {
            String var4 = "Unknown problem";
            this.method120("Connecting to web server", 20, 7);
            try {
                DataInputStream var5 = this.method108("crc" + (int) (Math.random() * 9.9999999E7D) + "-" + 307);
                class29 var6 = new class29((byte) -28, new byte[40]);
                var5.readFully(var6.field1106, 0, 40);
                var5.close();
                for (int var7 = 0; var7 < 9; ++var7) {
                    this.field333[var7] = var6.method313();
                }
                int var8 = var6.method313();
                int var9 = 1234;
                for (int var10 = 0; var10 < 9; ++var10) {
                    var9 = (var9 << 1) + this.field333[var10];
                }
                if (var8 != var9) {
                    var4 = "checksum problem";
                    this.field333[8] = 0;
                }
            } catch (EOFException var13) {
                var4 = "EOF problem";
                this.field333[8] = 0;
            } catch (IOException var14) {
                var4 = "connection problem";
                this.field333[8] = 0;
            } catch (Exception var15) {
                var4 = "logic problem";
                this.field333[8] = 0;
                if (!signlink.reporterror) {
                    return;
                }
            }
            if (this.field333[8] == 0) {
                ++var3;
                for (int var11 = var2; var11 > 0; --var11) {
                    if (var3 >= 10) {
                        this.method120("Game updated - please reload page", 10, 7);
                        var11 = 10;
                    } else {
                        this.method120(var4 + " - Will retry in " + var11 + " secs.", 10, 7);
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
                this.field520 = !this.field520;
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(IZI)Ljava/lang/String;")
    public static final String method130(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            for (int var3 = 1; var3 > 0; ++var3) {
            }
        }
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

    @OriginalMember(owner = "client", name = "l", descriptor = "(B)V")
    public final void method131(byte arg0) {
        ++this.field245;
        this.method122(true, -86);
        this.method34(true, 0);
        this.method122(false, -86);
        this.method34(false, 0);
        this.method58(-710);
        this.method66(7);
        if (!this.field157) {
            int var2 = this.field51;
            if (this.field112 / 256 > var2) {
                var2 = this.field112 / 256;
            }
            if (this.field455[4] && this.field521[4] + 128 > var2) {
                var2 = this.field521[4] + 128;
            }
            int var3 = this.field52 + this.field208 & 2047;
            this.method141(this.field247, (byte) 5, var2, var2 * 3 + 600, var3, this.field246, this.method99(field488.field886, this.field169, 0, field488.field885) - 50);
        }
        int var4;
        if (!this.field157) {
            var4 = this.method86(0);
        } else {
            var4 = this.method87(-378);
        }
        int var5 = this.field379;
        int var6 = this.field380;
        int var7 = this.field381;
        int var8 = this.field382;
        int var9 = this.field383;
        for (int var10 = 0; var10 < 5; ++var10) {
            if (this.field455[var10]) {
                int var13 = (int) (Math.random() * (double) (this.field123[var10] * 2 + 1) - (double) this.field123[var10] + Math.sin((double) this.field319[var10] / 100.0D * (double) this.field131[var10]) * (double) this.field521[var10]);
                if (var10 == 0) {
                    this.field379 += var13;
                }
                if (var10 == 1) {
                    this.field380 += var13;
                }
                if (var10 == 2) {
                    this.field381 += var13;
                }
                if (var10 == 3) {
                    this.field383 = this.field383 + var13 & 2047;
                }
                if (var10 == 4) {
                    this.field382 += var13;
                    if (this.field382 < 128) {
                        this.field382 = 128;
                    }
                    if (this.field382 > 383) {
                        this.field382 = 383;
                    }
                }
            }
        }
        int var11 = class12.field717;
        class10.field675 = true;
        class10.field678 = 0;
        class10.field676 = super.field811 - 4;
        class10.field677 = super.field812 - 4;
        class53.method456(true);
        this.field456.method566(this.field383, this.field381, this.field382, var4, this.field379, 992, this.field380);
        this.field456.method541((byte) -70);
        this.method48(false);
        this.method104(0);
        this.method134(var11, (byte) 92);
        this.method110((byte) -94);
        this.field338.method377(super.field803, 4, 1926, 4);
        this.field379 = var5;
        this.field380 = var6;
        this.field381 = var7;
        this.field382 = var8;
        if (arg0 != -98) {
            for (int var12 = 1; var12 > 0; ++var12) {
            }
        }
        this.field383 = var9;
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(III)V")
    public final void method132(int arg0, int arg1, int arg2) {
        if (arg1 >= 7 && arg1 <= 7) {
            int var4 = 0;
            for (int var5 = 0; var5 < 100; ++var5) {
                if (this.field252[var5] != null) {
                    int var6 = this.field250[var5];
                    int var7 = 70 - var4 * 14 + this.field162 + 4;
                    if (var7 < -20) {
                        break;
                    }
                    String var8 = this.field251[var5];
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
                    if ((var6 == 1 || var6 == 2) && (var6 == 1 || this.field477 == 0 || this.field477 == 1 && this.method106(7, var8))) {
                        if (arg2 > var7 - 14 && arg2 <= var7 && !var8.equals(field488.field532)) {
                            if (this.field223 >= 1) {
                                this.field320[this.field268] = "Report abuse @whi@" + var8;
                                this.field481[this.field268] = 596;
                                ++this.field268;
                            }
                            this.field320[this.field268] = "Add ignore @whi@" + var8;
                            this.field481[this.field268] = 505;
                            ++this.field268;
                            this.field320[this.field268] = "Add friend @whi@" + var8;
                            this.field481[this.field268] = 726;
                            ++this.field268;
                        }
                        ++var4;
                    }
                    if ((var6 == 3 || var6 == 7) && this.field196 == 0 && (var6 == 7 || this.field347 == 0 || this.field347 == 1 && this.method106(7, var8))) {
                        if (arg2 > var7 - 14 && arg2 <= var7) {
                            if (this.field223 >= 1) {
                                this.field320[this.field268] = "Report abuse @whi@" + var8;
                                this.field481[this.field268] = 596;
                                ++this.field268;
                            }
                            this.field320[this.field268] = "Add ignore @whi@" + var8;
                            this.field481[this.field268] = 505;
                            ++this.field268;
                            this.field320[this.field268] = "Add friend @whi@" + var8;
                            this.field481[this.field268] = 726;
                            ++this.field268;
                        }
                        ++var4;
                    }
                    if (var6 == 4 && (this.field212 == 0 || this.field212 == 1 && this.method106(7, var8))) {
                        if (arg2 > var7 - 14 && arg2 <= var7) {
                            this.field320[this.field268] = "Accept trade @whi@" + var8;
                            this.field481[this.field268] = 393;
                            ++this.field268;
                        }
                        ++var4;
                    }
                    if ((var6 == 5 || var6 == 6) && this.field196 == 0 && this.field347 < 2) {
                        ++var4;
                    }
                    if (var6 == 8 && (this.field212 == 0 || this.field212 == 1 && this.method106(7, var8))) {
                        if (arg2 > var7 - 14 && arg2 <= var7) {
                            this.field320[this.field268] = "Accept challenge @whi@" + var8;
                            this.field481[this.field268] = 752;
                            ++this.field268;
                        }
                        ++var4;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IILINLHDAGO;)V")
    private final void method133(int arg0, int arg1, class29 arg2) {
        this.field183 = 0;
        this.field422 = 0;
        this.method124(5, arg2, arg0);
        if (arg1 != 0) {
            this.field410 = -1;
        }
        this.method74(this.field160, arg2, arg0);
        this.method128(arg0, (byte) 8, arg2);
        this.method33((byte) 66, arg0, arg2);
        for (int var4 = 0; var4 < this.field183; ++var4) {
            int var6 = this.field184[var4];
            if (field341 != this.field419[var6].field864) {
                this.field419[var6] = null;
            }
        }
        if (arg2.field1107 != arg0) {
            signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg2.field1107 + " psize:" + arg0);
            throw new RuntimeException("eek");
        } else {
            for (int var5 = 0; var5 < this.field420; ++var5) {
                if (this.field419[this.field421[var5]] == null) {
                    signlink.reporterror(this.field388 + " null entry in pl list - pos:" + var5 + " size:" + this.field420);
                    throw new RuntimeException("eek");
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IB)V")
    public final void method134(int arg0, byte arg1) {
        if (arg1 != 92) {
            this.method149();
        }
        if (!field178) {
            if (class12.field716[17] >= arg0) {
                class4 var3 = class12.field710[17];
                int var4 = var3.field35 * var3.field34 - 1;
                int var5 = this.field262 * var3.field34 * 2;
                byte[] var6 = var3.field32;
                byte[] var7 = this.field254;
                for (int var8 = 0; var8 <= var4; ++var8) {
                    var7[var8] = var6[var8 - var5 & var4];
                }
                var3.field32 = var7;
                this.field254 = var6;
                class12.method224(8, 17);
            }
            if (class12.field716[24] >= arg0) {
                class4 var9 = class12.field710[24];
                int var10 = var9.field35 * var9.field34 - 1;
                int var11 = this.field262 * var9.field34 * 2;
                byte[] var12 = var9.field32;
                byte[] var13 = this.field254;
                for (int var14 = 0; var14 <= var10; ++var14) {
                    var13[var14] = var12[var14 - var11 & var10];
                }
                var9.field32 = var13;
                this.field254 = var12;
                class12.method224(8, 24);
            }
            if (class12.field716[34] >= arg0) {
                class4 var15 = class12.field710[34];
                int var16 = var15.field35 * var15.field34 - 1;
                int var17 = this.field262 * var15.field34 * 2;
                byte[] var18 = var15.field32;
                byte[] var19 = this.field254;
                for (int var20 = 0; var20 <= var16; ++var20) {
                    var19[var20] = var18[var20 - var17 & var16];
                }
                var15.field32 = var19;
                this.field254 = var18;
                class12.method224(8, 34);
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "H", descriptor = "(I)V")
    public void method135(int arg0) {
        System.out.println("============");
        System.out.println("flame-cycle:" + this.field237);
        if (this.field384 != null) {
            System.out.println("Od-cycle:" + this.field384.field600);
        }
        System.out.println("loop-cycle:" + field341);
        System.out.println("draw-cycle:" + field87);
        if (arg0 >= 0) {
            this.field410 = -1;
        }
        System.out.println("ptype:" + this.field410);
        System.out.println("psize:" + this.field409);
        if (this.field146 != null) {
            this.field146.method588(-210);
        }
        super.field800 = true;
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(I)Ljava/awt/Component;")
    public final Component method136(int arg0) {
        if (arg0 != 0) {
            this.field391.method298(20);
        }
        if (signlink.mainapp != null) {
            return signlink.mainapp;
        } else {
            return super.field806 != null ? super.field806 : this;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LINLHDAGO;ZI)V")
    private final void method137(class29 arg0, boolean arg1, int arg2) {
        arg0.method318(-929);
        int var4 = arg0.method319(754, 8);
        if (arg1) {
            for (int var5 = 1; var5 > 0; ++var5) {
            }
        }
        if (var4 < this.field307) {
            for (int var6 = var4; var6 < this.field307; ++var6) {
                this.field184[this.field183++] = this.field308[var6];
            }
        }
        if (var4 > this.field307) {
            signlink.reporterror(this.field388 + " Too many npcs");
            throw new RuntimeException("eek");
        } else {
            this.field307 = 0;
            for (int var7 = 0; var7 < var4; ++var7) {
                int var8 = this.field308[var7];
                class7 var9 = this.field306[var8];
                int var10 = arg0.method319(754, 1);
                if (var10 == 0) {
                    this.field308[this.field307++] = var8;
                    var9.field864 = field341;
                } else {
                    int var11 = arg0.method319(754, 2);
                    if (var11 == 0) {
                        this.field308[this.field307++] = var8;
                        var9.field864 = field341;
                        this.field423[this.field422++] = var8;
                    } else if (var11 == 1) {
                        this.field308[this.field307++] = var8;
                        var9.field864 = field341;
                        int var12 = arg0.method319(754, 3);
                        var9.method272(376, false, var12);
                        int var13 = arg0.method319(754, 1);
                        if (var13 == 1) {
                            this.field423[this.field422++] = var8;
                        }
                    } else if (var11 == 2) {
                        this.field308[this.field307++] = var8;
                        var9.field864 = field341;
                        int var14 = arg0.method319(754, 3);
                        var9.method272(376, true, var14);
                        int var15 = arg0.method319(754, 3);
                        var9.method272(376, true, var15);
                        int var16 = arg0.method319(754, 1);
                        if (var16 == 1) {
                            this.field423[this.field422++] = var8;
                        }
                    } else if (var11 == 3) {
                        this.field184[this.field183++] = var8;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(BI)V")
    public final void method138(byte arg0, int arg1) {
        class28 var3 = class28.field1045[arg1];
        for (int var4 = 0; var4 < var3.field1068.length && var3.field1068[var4] != -1; ++var4) {
            class28 var5 = class28.field1045[var3.field1068[var4]];
            if (var5.field1020 == 1) {
                this.method138(this.field261, var5.field1079);
            }
            var5.field1039 = 0;
            var5.field1048 = 0;
        }
        if (this.field267 != arg0) {
            this.field410 = -1;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZB[B)V")
    public final void method139(boolean arg0, byte arg1, byte[] arg2) {
        if (arg1 != -80) {
            this.method149();
        }
        signlink.midifade = arg0 ? 1 : 0;
        signlink.midisave(arg2, arg2.length);
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(ILINLHDAGO;I)V")
    public final void method140(int arg0, class29 arg1, int arg2) {
        if (arg2 < 1 || arg2 > 1) {
            this.method149();
        }
        if (arg0 == 134) {
            int var4 = arg1.method326((byte) -115);
            int var5 = var4 >> 2;
            int var6 = var4 & 3;
            int var7 = this.field113[var5];
            int var8 = arg1.method325(-254);
            int var9 = (var8 >> 4 & 7) + this.field91;
            int var10 = (var8 & 7) + this.field92;
            if (var9 >= 0 && var10 >= 0 && var9 < 104 && var10 < 104) {
                this.method21(var10, 208, this.field169, var9, -1, -1, var5, var6, 0, var7);
            }
        } else if (arg0 == 57) {
            int var11 = arg1.method335(-210);
            int var12 = arg1.method325(-254);
            int var13 = var12 >> 2;
            int var14 = var12 & 3;
            int var15 = this.field113[var13];
            int var16 = arg1.method327(-41963);
            int var17 = (var16 >> 4 & 7) + this.field91;
            int var18 = (var16 & 7) + this.field92;
            if (var17 >= 0 && var18 >= 0 && var17 < 104 && var18 < 104) {
                this.method21(var18, 208, this.field169, var17, -1, var11, var13, var14, 0, var15);
            }
        } else if (arg0 == 166) {
            int var19 = arg1.method308();
            int var20 = (var19 >> 4 & 7) + this.field91;
            int var21 = (var19 & 7) + this.field92;
            int var22 = arg1.method310();
            int var23 = arg1.method308();
            int var24 = arg1.method310();
            if (var20 >= 0 && var21 >= 0 && var20 < 104 && var21 < 104) {
                int var25 = var20 * 128 + 64;
                int var26 = var21 * 128 + 64;
                class48 var27 = new class48(var22, this.method99(var26, this.field169, 0, var25) - var23, field341, this.field169, var25, var24, true, var26);
                this.field325.method424(var27);
            }
        } else {
            if (arg0 == 113) {
                int var28 = arg1.method308();
                int var29 = (var28 >> 4 & 7) + this.field91;
                int var30 = (var28 & 7) + this.field92;
                int var31 = arg1.method310();
                int var32 = arg1.method308();
                int var33 = var32 >> 4 & 15;
                int var34 = var32 & 7;
                if (field488.field876[0] >= var29 - var33 && field488.field876[0] <= var29 + var33 && field488.field877[0] >= var30 - var33 && field488.field877[0] <= var30 + var33 && this.field168 && !field178 && this.field64 < 50) {
                    this.field387[this.field64] = var31;
                    this.field445[this.field64] = var34;
                    this.field492[this.field64] = class22.field854[var31];
                    ++this.field64;
                }
            }
            if (arg0 == 240) {
                int var35 = arg1.method335(-210);
                int var36 = arg1.method310();
                int var37 = arg1.method325(-254);
                int var38 = (var37 >> 4 & 7) + this.field91;
                int var39 = (var37 & 7) + this.field92;
                if (var38 >= 0 && var39 >= 0 && var38 < 104 && var39 < 104) {
                    class69 var40 = new class69();
                    var40.field1689 = var36;
                    var40.field1688 = var35;
                    if (this.field390[this.field169][var38][var39] == null) {
                        this.field390[this.field169][var38][var39] = new class51(0);
                    }
                    this.field390[this.field169][var38][var39].method424(var40);
                    this.method107(var38, var39);
                }
            } else if (arg0 == 90) {
                int var41 = arg1.method334((byte) 6);
                int var42 = arg1.method325(-254);
                int var43 = (var42 >> 4 & 7) + this.field91;
                int var44 = (var42 & 7) + this.field92;
                if (var43 >= 0 && var44 >= 0 && var43 < 104 && var44 < 104) {
                    class51 var45 = this.field390[this.field169][var43][var44];
                    if (var45 != null) {
                        for (class69 var46 = (class69) var45.method427(); var46 != null; var46 = (class69) var45.method429(0)) {
                            if ((var41 & 32767) == var46.field1689) {
                                var46.method234();
                                break;
                            }
                        }
                        if (var45.method427() == null) {
                            this.field390[this.field169][var43][var44] = null;
                        }
                        this.method107(var43, var44);
                    }
                }
            } else if (arg0 == 234) {
                int var47 = arg1.method308();
                int var48 = (var47 >> 4 & 7) + this.field91;
                int var49 = (var47 & 7) + this.field92;
                int var50 = var48 + arg1.method309();
                int var51 = var49 + arg1.method309();
                int var52 = arg1.method311();
                int var53 = arg1.method310();
                int var54 = arg1.method308() * 4;
                int var55 = arg1.method308() * 4;
                int var56 = arg1.method310();
                int var57 = arg1.method310();
                int var58 = arg1.method308();
                int var59 = arg1.method308();
                if (var48 >= 0 && var49 >= 0 && var48 < 104 && var49 < 104 && var50 >= 0 && var51 >= 0 && var50 < 104 && var51 < 104 && var53 != 65535) {
                    int var60 = var48 * 128 + 64;
                    int var61 = var49 * 128 + 64;
                    int var62 = var50 * 128 + 64;
                    int var63 = var51 * 128 + 64;
                    class57 var64 = new class57(var58, field341 + var57, var61, this.method99(var61, this.field169, 0, var60) - var54, var60, var59, field341 + var56, this.field169, var52, 0, var55, var53);
                    var64.method479(var62, var63, this.field355, field341 + var56, this.method99(var63, this.field169, 0, var62) - var55);
                    this.field283.method424(var64);
                }
            } else if (arg0 == 22) {
                int var65 = arg1.method310();
                int var66 = arg1.method327(-41963);
                int var67 = var66 >> 2;
                int var68 = var66 & 3;
                int var69 = this.field113[var67];
                int var70 = arg1.method308();
                int var71 = (var70 >> 4 & 7) + this.field91;
                int var72 = (var70 & 7) + this.field92;
                if (var71 >= 0 && var72 >= 0 && var71 < 103 && var72 < 103) {
                    int var73 = this.field299[this.field169][var71][var72];
                    int var74 = this.field299[this.field169][var71 + 1][var72];
                    int var75 = this.field299[this.field169][var71 + 1][var72 + 1];
                    int var76 = this.field299[this.field169][var71][var72 + 1];
                    if (var69 == 0) {
                        class33 var77 = this.field456.method549(this.field395, var71, this.field169, var72);
                        if (var77 != null) {
                            int var78 = var77.field1176 >> 14 & 32767;
                            if (var67 == 2) {
                                var77.field1174 = new class25(false, var74, var78, var76, var65, var75, var68 + 4, 2, var73, 0);
                                var77.field1175 = new class25(false, var74, var78, var76, var65, var75, var68 + 1 & 3, 2, var73, 0);
                            } else {
                                var77.field1174 = new class25(false, var74, var78, var76, var65, var75, var68, var67, var73, 0);
                            }
                        }
                    }
                    if (var69 == 1) {
                        class11 var79 = this.field456.method550(var71, 248, var72, this.field169);
                        if (var79 != null) {
                            var79.field689 = new class25(false, var74, var79.field690 >> 14 & 32767, var76, var65, var75, 0, 4, var73, 0);
                        }
                    }
                    if (var69 == 2) {
                        class24 var80 = this.field456.method551(var72, -884, this.field169, var71);
                        if (var67 == 11) {
                            var67 = 10;
                        }
                        if (var80 != null) {
                            var80.field921 = new class25(false, var74, var80.field929 >> 14 & 32767, var76, var65, var75, var68, var67, var73, 0);
                        }
                    }
                    if (var69 == 3) {
                        class45 var81 = this.field456.method552(this.field169, (byte) -43, var71, var72);
                        if (var81 != null) {
                            var81.field1299 = new class25(false, var74, var81.field1300 >> 14 & 32767, var76, var65, var75, var68, 22, var73, 0);
                        }
                    }
                }
            } else {
                if (arg0 == 149) {
                    byte var82 = arg1.method329(-48151);
                    byte var83 = arg1.method328(this.field232);
                    byte var84 = arg1.method328(this.field232);
                    byte var85 = arg1.method329(-48151);
                    int var86 = arg1.method334((byte) 6);
                    int var87 = arg1.method310();
                    int var88 = arg1.method335(-210);
                    int var89 = arg1.method334((byte) 6);
                    int var90 = arg1.method308();
                    int var91 = var90 >> 2;
                    int var92 = var90 & 3;
                    int var93 = this.field113[var91];
                    int var94 = arg1.method308();
                    int var95 = (var94 >> 4 & 7) + this.field91;
                    int var96 = (var94 & 7) + this.field92;
                    class8 var97;
                    if (this.field85 == var86) {
                        var97 = field488;
                    } else {
                        var97 = this.field419[var86];
                    }
                    if (var97 != null) {
                        class63 var98 = class63.method501(var89);
                        int var99 = this.field299[this.field169][var95][var96];
                        int var100 = this.field299[this.field169][var95 + 1][var96];
                        int var101 = this.field299[this.field169][var95 + 1][var96 + 1];
                        int var102 = this.field299[this.field169][var95][var96 + 1];
                        class10 var103 = var98.method506(var91, var92, var99, var100, var101, var102, -1);
                        if (var103 != null) {
                            this.method21(var96, 208, this.field169, var95, var87 + 1, -1, 0, 0, var88 + 1, var93);
                            var97.field544 = field341 + var88;
                            var97.field545 = field341 + var87;
                            var97.field559 = var103;
                            int var104 = var98.field1506;
                            int var105 = var98.field1541;
                            if (var92 == 1 || var92 == 3) {
                                var104 = var98.field1541;
                                var105 = var98.field1506;
                            }
                            var97.field556 = var95 * 128 + var104 * 64;
                            var97.field558 = var96 * 128 + var105 * 64;
                            var97.field557 = this.method99(var97.field558, this.field169, 0, var97.field556);
                            if (var85 > var83) {
                                byte var106 = var85;
                                var85 = var83;
                                var83 = var106;
                            }
                            if (var84 > var82) {
                                byte var107 = var84;
                                var84 = var82;
                                var82 = var107;
                            }
                            var97.field552 = var85 + var95;
                            var97.field554 = var83 + var95;
                            var97.field553 = var84 + var96;
                            var97.field555 = var82 + var96;
                        }
                    }
                }
                if (arg0 != 106) {
                    if (arg0 == 229) {
                        int var116 = arg1.method310();
                        int var117 = arg1.method335(-210);
                        int var118 = arg1.method334((byte) 6);
                        int var119 = arg1.method308();
                        int var120 = (var119 >> 4 & 7) + this.field91;
                        int var121 = (var119 & 7) + this.field92;
                        if (var120 >= 0 && var121 >= 0 && var120 < 104 && var121 < 104 && this.field85 != var116) {
                            class69 var122 = new class69();
                            var122.field1689 = var118;
                            var122.field1688 = var117;
                            if (this.field390[this.field169][var120][var121] == null) {
                                this.field390[this.field169][var120][var121] = new class51(0);
                            }
                            this.field390[this.field169][var120][var121].method424(var122);
                            this.method107(var120, var121);
                        }
                    }
                } else {
                    int var108 = arg1.method308();
                    int var109 = (var108 >> 4 & 7) + this.field91;
                    int var110 = (var108 & 7) + this.field92;
                    int var111 = arg1.method310();
                    int var112 = arg1.method310();
                    int var113 = arg1.method310();
                    if (var109 >= 0 && var110 >= 0 && var109 < 104 && var110 < 104) {
                        class51 var114 = this.field390[this.field169][var109][var110];
                        if (var114 != null) {
                            for (class69 var115 = (class69) var114.method427(); var115 != null; var115 = (class69) var114.method429(0)) {
                                if ((var111 & 32767) == var115.field1689 && var115.field1688 == var112) {
                                    var115.field1688 = var113;
                                    break;
                                }
                            }
                            this.method107(var109, var110);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IBIIIII)V")
    public final void method141(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = 2048 - arg2 & 2047;
        int var9 = 2048 - arg4 & 2047;
        int var10 = 0;
        int var11 = 0;
        int var12 = arg3;
        if (this.field107 != arg1) {
            this.field390 = null;
        }
        if (var8 != 0) {
            int var13 = class10.field680[var8];
            int var14 = class10.field681[var8];
            int var15 = var11 * var14 - arg3 * var13 >> 16;
            var12 = var11 * var13 + arg3 * var14 >> 16;
            var11 = var15;
        }
        if (var9 != 0) {
            int var16 = class10.field680[var9];
            int var17 = class10.field681[var9];
            int var18 = var10 * var17 + var12 * var16 >> 16;
            var12 = var12 * var17 - var10 * var16 >> 16;
            var10 = var18;
        }
        this.field379 = arg5 - var10;
        this.field380 = arg6 - var11;
        this.field381 = arg0 - var12;
        this.field382 = arg2;
        this.field383 = arg4;
    }

    @OriginalMember(owner = "client", name = "I", descriptor = "(I)V")
    public final void method142(int arg0) {
        Graphics var2 = this.method136(0).getGraphics();
        var2.setColor(Color.black);
        var2.fillRect(0, 0, 765, 503);
        this.method255(1, 14025);
        if (arg0 <= 0) {
            this.method149();
        }
        if (this.field260) {
            this.field503 = false;
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
        if (this.field147) {
            this.field503 = false;
            var2.setFont(new Font("Helvetica", 1, 20));
            var2.setColor(Color.white);
            var2.drawString("Error - unable to load game!", 50, 50);
            var2.drawString("To play RuneScape make sure you play from", 50, 100);
            var2.drawString("http://www.runescape.com", 50, 150);
        }
        if (this.field346) {
            this.field503 = false;
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

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZIIIII)V")
    public final void method143(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = this.field456.method553(arg5, arg4, arg2);
        if (var7 != 0) {
            int var8 = this.field456.method557(arg5, arg4, arg2, var7);
            int var9 = var8 >> 6 & 3;
            int var10 = var8 & 31;
            int var11 = arg3;
            if (var7 > 0) {
                var11 = arg1;
            }
            int[] var12 = this.field235.field1581;
            int var13 = (103 - arg2) * 512 * 4 + arg4 * 4 + 24624;
            int var14 = var7 >> 14 & 32767;
            class63 var15 = class63.method501(var14);
            if (var15.field1547 != -1) {
                class4 var16 = this.field522[var15.field1547];
                if (var16 != null) {
                    int var17 = (var15.field1506 * 4 - var16.field34) / 2;
                    int var18 = (var15.field1541 * 4 - var16.field35) / 2;
                    var16.method10((104 - arg2 - var15.field1541) * 4 + 48 + var18, true, arg4 * 4 + 48 + var17);
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
        int var19 = this.field456.method555(arg5, arg4, arg2);
        if (!arg0) {
            for (int var20 = 1; var20 > 0; ++var20) {
            }
        }
        if (var19 != 0) {
            int var21 = this.field456.method557(arg5, arg4, arg2, var19);
            int var22 = var21 >> 6 & 3;
            int var23 = var21 & 31;
            int var24 = var19 >> 14 & 32767;
            class63 var25 = class63.method501(var24);
            if (var25.field1547 != -1) {
                class4 var26 = this.field522[var25.field1547];
                if (var26 != null) {
                    int var27 = (var25.field1506 * 4 - var26.field34) / 2;
                    int var28 = (var25.field1541 * 4 - var26.field35) / 2;
                    var26.method10((104 - arg2 - var25.field1541) * 4 + 48 + var28, true, arg4 * 4 + 48 + var27);
                }
            } else if (var23 == 9) {
                int var29 = 15658734;
                if (var19 > 0) {
                    var29 = 15597568;
                }
                int[] var30 = this.field235.field1581;
                int var31 = (103 - arg2) * 512 * 4 + arg4 * 4 + 24624;
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
        int var32 = this.field456.method556(arg5, arg4, arg2);
        if (var32 != 0) {
            int var33 = var32 >> 14 & 32767;
            class63 var34 = class63.method501(var33);
            if (var34.field1547 != -1) {
                class4 var35 = this.field522[var34.field1547];
                if (var35 != null) {
                    int var36 = (var34.field1506 * 4 - var35.field34) / 2;
                    int var37 = (var34.field1541 * 4 - var35.field35) / 2;
                    var35.method10((104 - arg2 - var34.field1541) * 4 + 48 + var37, true, arg4 * 4 + 48 + var36);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LHPPBIEYV;ZI)I")
    public final int method144(class28 arg0, boolean arg1, int arg2) {
        if (arg1) {
            this.field391.method298(16);
        }
        if (arg0.field1050 != null && arg2 < arg0.field1050.length) {
            try {
                int[] var4 = arg0.field1050[arg2];
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
                        var9 = this.field331[var4[var6++]];
                    }
                    if (var8 == 2) {
                        var9 = this.field99[var4[var6++]];
                    }
                    if (var8 == 3) {
                        var9 = this.field132[var4[var6++]];
                    }
                    if (var8 == 4) {
                        class28 var11 = class28.field1045[var4[var6++]];
                        int var12 = var4[var6++];
                        if (var12 >= 0 && var12 < class27.field1010 && (!class27.method286(var12).field986 || field177)) {
                            for (int var13 = 0; var13 < var11.field1051.length; ++var13) {
                                if (var12 + 1 == var11.field1051[var13]) {
                                    var9 += var11.field1057[var13];
                                }
                            }
                        }
                    }
                    if (var8 == 5) {
                        var9 = this.field353[var4[var6++]];
                    }
                    if (var8 == 6) {
                        var9 = field344[this.field99[var4[var6++]] - 1];
                    }
                    if (var8 == 7) {
                        var9 = this.field353[var4[var6++]] * 100 / 46875;
                    }
                    if (var8 == 8) {
                        var9 = field488.field536;
                    }
                    if (var8 == 9) {
                        for (int var14 = 0; var14 < class38.field1209; ++var14) {
                            if (class38.field1211[var14]) {
                                var9 += this.field99[var14];
                            }
                        }
                    }
                    if (var8 == 10) {
                        class28 var15 = class28.field1045[var4[var6++]];
                        int var16 = var4[var6++] + 1;
                        if (var16 >= 0 && var16 < class27.field1010 && (!class27.method286(var16).field986 || field177)) {
                            for (int var17 = 0; var17 < var15.field1051.length; ++var17) {
                                if (var15.field1051[var17] == var16) {
                                    var9 = 999999999;
                                    break;
                                }
                            }
                        }
                    }
                    if (var8 == 11) {
                        var9 = this.field243;
                    }
                    if (var8 == 12) {
                        var9 = this.field124;
                    }
                    if (var8 == 13) {
                        int var18 = this.field353[var4[var6++]];
                        int var19 = var4[var6++];
                        var9 = (var18 & 1 << var19) != 0 ? 1 : 0;
                    }
                    if (var8 == 14) {
                        int var20 = var4[var6++];
                        class44 var21 = class44.field1288[var20];
                        int var22 = var21.field1290;
                        int var23 = var21.field1291;
                        int var24 = var21.field1292;
                        int var25 = field313[var24 - var23];
                        var9 = this.field353[var22] >> var23 & var25;
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
                        var9 = (field488.field885 >> 7) + this.field141;
                    }
                    if (var8 == 19) {
                        var9 = (field488.field886 >> 7) + this.field142;
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

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIII)V")
    public final void method145(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field500.method10(arg2, true, arg3);
        this.field501.method10(arg1 + arg2 - 16, true, arg3);
        class53.method458((byte) -119, 16, this.field285, arg2 + 16, arg3, arg1 - 32);
        int var7 = (arg1 - 32) * arg1 / arg4;
        if (arg0 < 4 || arg0 > 4) {
            this.field83 = -80;
        }
        if (var7 < 8) {
            var7 = 8;
        }
        int var8 = (arg1 - 32 - var7) * arg5 / (arg4 - arg1);
        class53.method458((byte) -119, 16, this.field351, arg2 + 16 + var8, arg3, var7);
        class53.method463(arg2 + 16 + var8, arg3, -429, this.field50, var7);
        class53.method463(arg2 + 16 + var8, arg3 + 1, -429, this.field50, var7);
        class53.method461(16, this.field219, arg3, arg2 + 16 + var8, this.field50);
        class53.method461(16, this.field219, arg3, arg2 + 17 + var8, this.field50);
        class53.method463(arg2 + 16 + var8, arg3 + 15, -429, this.field452, var7);
        class53.method463(arg2 + 17 + var8, arg3 + 14, -429, this.field452, var7 - 1);
        class53.method461(16, this.field219, arg3, arg2 + 15 + var8 + var7, this.field452);
        class53.method461(15, this.field219, arg3 + 1, arg2 + 14 + var8 + var7, this.field452);
    }

    @OriginalMember(owner = "client", name = "n", descriptor = "(Z)V")
    public final void method146(boolean arg0) {
        short var2 = 256;
        if (this.field504 > 0) {
            for (int var3 = 0; var3 < 256; ++var3) {
                if (this.field504 > 768) {
                    this.field151[var3] = this.method85((byte) -114, this.field152[var3], 1024 - this.field504, this.field153[var3]);
                } else if (this.field504 > 256) {
                    this.field151[var3] = this.field153[var3];
                } else {
                    this.field151[var3] = this.method85((byte) -114, this.field153[var3], 256 - this.field504, this.field152[var3]);
                }
            }
        } else if (this.field505 > 0) {
            for (int var4 = 0; var4 < 256; ++var4) {
                if (this.field505 > 768) {
                    this.field151[var4] = this.method85((byte) -114, this.field152[var4], 1024 - this.field505, this.field154[var4]);
                } else if (this.field505 > 256) {
                    this.field151[var4] = this.field154[var4];
                } else {
                    this.field151[var4] = this.method85((byte) -114, this.field154[var4], 256 - this.field505, this.field152[var4]);
                }
            }
        } else {
            for (int var5 = 0; var5 < 256; ++var5) {
                this.field151[var5] = this.field152[var5];
            }
        }
        for (int var6 = 0; var6 < 33920; ++var6) {
            this.field438.field1213[var6] = this.field495.field1581[var6];
        }
        int var7 = 0;
        int var8 = 1152;
        for (int var9 = 1; var9 < var2 - 1; ++var9) {
            int var23 = (var2 - var9) * this.field195[var9] / var2;
            int var24 = var23 + 22;
            if (var24 < 0) {
                var24 = 0;
            }
            var7 += var24;
            for (int var25 = var24; var25 < 128; ++var25) {
                int var26 = this.field342[var7++];
                if (var26 != 0) {
                    int var28 = 256 - var26;
                    int var29 = this.field151[var26];
                    int var30 = this.field438.field1213[var8];
                    this.field438.field1213[var8++] = ((var29 & 16711935) * var26 + (var30 & 16711935) * var28 & -16711936) + ((var29 & 65280) * var26 + (var30 & 65280) * var28 & 16711680) >> 8;
                } else {
                    ++var8;
                }
            }
            var8 += var24;
        }
        this.field438.method377(super.field803, 0, 1926, 0);
        if (arg0) {
            this.field390 = null;
        }
        for (int var10 = 0; var10 < 33920; ++var10) {
            this.field439.field1213[var10] = this.field496.field1581[var10];
        }
        int var11 = 0;
        int var12 = 1176;
        for (int var13 = 1; var13 < var2 - 1; ++var13) {
            int var14 = (var2 - var13) * this.field195[var13] / var2;
            int var15 = 103 - var14;
            int var16 = var12 + var14;
            for (int var17 = 0; var17 < var15; ++var17) {
                int var18 = this.field342[var11++];
                if (var18 != 0) {
                    int var20 = 256 - var18;
                    int var21 = this.field151[var18];
                    int var22 = this.field439.field1213[var16];
                    this.field439.field1213[var16++] = ((var21 & 16711935) * var18 + (var22 & 16711935) * var20 & -16711936) + ((var21 & 65280) * var18 + (var22 & 65280) * var20 & 16711680) >> 8;
                } else {
                    ++var16;
                }
            }
            var11 += 128 - var15;
            var12 = 128 - var15 - var14 + var16;
        }
        this.field439.method377(super.field803, 637, 1926, 0);
    }

    @OriginalMember(owner = "client", name = "m", descriptor = "(B)V")
    public final void method147(byte arg0) {
        this.field391.method297(217, false);
        if (this.field428 != -1) {
            this.field428 = -1;
            this.field334 = true;
            this.field497 = false;
            this.field62 = true;
        }
        if (this.field357 != -1) {
            this.field357 = -1;
            this.field222 = true;
            this.field497 = false;
        }
        this.field150 = -1;
        if (arg0 == 3) {
            boolean var2 = false;
        } else {
            this.method149();
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(IIII)Z")
    public final boolean method148(int arg0, int arg1, int arg2, int arg3) {
        int var5 = arg3 >> 14 & 32767;
        int var6 = this.field456.method557(this.field169, arg0, arg1, arg3);
        if (var6 == -1) {
            return false;
        } else {
            int var7 = var6 & 31;
            int var8 = var6 >> 6 & 3;
            if (var7 != 10 && var7 != 11 && var7 != 22) {
                this.method73(2, 0, 0, arg0, var7 + 1, 3234, arg1, false, field488.field876[0], 0, var8, field488.field877[0]);
            } else {
                class63 var9 = class63.method501(var5);
                int var10;
                int var11;
                if (var8 != 0 && var8 != 2) {
                    var10 = var9.field1541;
                    var11 = var9.field1506;
                } else {
                    var10 = var9.field1506;
                    var11 = var9.field1541;
                }
                int var12 = var9.field1507;
                if (var8 != 0) {
                    var12 = (var12 >> 4 - var8) + (var12 << var8 & 15);
                }
                this.method73(2, var12, var10, arg0, 0, 3234, arg1, false, field488.field876[0], var11, 0, field488.field877[0]);
            }
            this.field101 = super.field818;
            this.field102 = super.field819;
            this.field104 = 2;
            this.field103 = 0;
            if (arg2 != 0) {
                throw new NullPointerException();
            } else {
                return true;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "()V")
    public final void method149() {
        this.method120("Starting up", 20, 7);
        if (signlink.sunjava) {
            super.field797 = 5;
        }
        if (field352) {
            this.field346 = true;
        } else {
            field352 = true;
            boolean var1 = false;
            String var2 = this.method64(false);
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
                this.field147 = true;
            } else {
                if (signlink.cache_dat != null) {
                    for (int var3 = 0; var3 < 5; ++var3) {
                        this.field58[var3] = new class34(500000, signlink.cache_dat, false, signlink.cache_idx[var3], var3 + 1);
                    }
                }
                try {
                    this.method129(4);
                    this.field506 = this.method97("title screen", 25, 1, "title", 0, this.field333[1]);
                    this.field115 = new class35("p11_full", false, this.field506, (byte) 9);
                    this.field116 = new class35("p12_full", false, this.field506, (byte) 9);
                    this.field117 = new class35("b12_full", false, this.field506, (byte) 9);
                    this.field118 = new class35("q8_full", true, this.field506, (byte) 9);
                    this.method94(false);
                    this.method28(true);
                    class16 var4 = this.method97("config", 30, 2, "config", 0, this.field333[2]);
                    class16 var5 = this.method97("interface", 35, 3, "interface", 0, this.field333[3]);
                    class16 var6 = this.method97("2d graphics", 40, 4, "media", 0, this.field333[4]);
                    class16 var7 = this.method97("textures", 45, 6, "textures", 0, this.field333[6]);
                    class16 var8 = this.method97("chat system", 50, 7, "wordenc", 0, this.field333[7]);
                    class16 var9 = this.method97("sound effects", 55, 8, "sounds", 0, this.field333[8]);
                    this.field158 = new byte[4][104][104];
                    this.field299 = new int[4][105][105];
                    this.field456 = new class67(104, this.field299, 4, 104, 5);
                    for (int var10 = 0; var10 < 4; ++var10) {
                        this.field476[var10] = new class62(104, 104, 18219);
                    }
                    this.field235 = new class65(512, 512);
                    class16 var11 = this.method97("update list", 60, 5, "versionlist", 0, this.field333[5]);
                    this.method120("Connecting to update server", 60, 7);
                    this.field384 = new class9();
                    this.field384.method170(var11, this);
                    class5.method12(this.field384.method177(false));
                    class10.method188(this.field384.method186((byte) 2, 0), this.field384);
                    if (!field178) {
                        this.field316 = 0;
                        try {
                            this.field316 = Integer.parseInt(this.getParameter("music"));
                        } catch (Exception var70) {
                        }
                        this.field317 = true;
                        this.field384.method171(2, this.field316);
                        while (this.field384.method179() > 0) {
                            this.method60((byte) -70);
                            try {
                                Thread.sleep(100L);
                            } catch (Exception var69) {
                            }
                            if (this.field384.field564 > 3) {
                                this.method25("ondemand");
                                return;
                            }
                        }
                    }
                    this.method120("Requesting animations", 65, 7);
                    int var12 = this.field384.method186((byte) 2, 1);
                    for (int var13 = 0; var13 < var12; ++var13) {
                        this.field384.method171(1, var13);
                    }
                    while (this.field384.method179() > 0) {
                        int var14 = var12 - this.field384.method179();
                        if (var14 > 0) {
                            this.method120("Loading animations - " + var14 * 100 / var12 + "%", 65, 7);
                        }
                        this.method60((byte) -70);
                        try {
                            Thread.sleep(100L);
                        } catch (Exception var68) {
                        }
                        if (this.field384.field564 > 3) {
                            this.method25("ondemand");
                            return;
                        }
                    }
                    this.method120("Requesting models", 70, 7);
                    int var15 = this.field384.method186((byte) 2, 0);
                    for (int var16 = 0; var16 < var15; ++var16) {
                        int var17 = this.field384.method165(false, var16);
                        if ((var17 & 1) != 0) {
                            this.field384.method171(0, var16);
                        }
                    }
                    int var18 = this.field384.method179();
                    while (this.field384.method179() > 0) {
                        int var19 = var18 - this.field384.method179();
                        if (var19 > 0) {
                            this.method120("Loading models - " + var19 * 100 / var18 + "%", 70, 7);
                        }
                        this.method60((byte) -70);
                        try {
                            Thread.sleep(100L);
                        } catch (Exception var67) {
                        }
                    }
                    if (this.field58[0] != null) {
                        this.method120("Requesting maps", 75, 7);
                        this.field384.method171(3, this.field384.method169(48, 47, 0, 6));
                        this.field384.method171(3, this.field384.method169(48, 47, 1, 6));
                        this.field384.method171(3, this.field384.method169(48, 48, 0, 6));
                        this.field384.method171(3, this.field384.method169(48, 48, 1, 6));
                        this.field384.method171(3, this.field384.method169(48, 49, 0, 6));
                        this.field384.method171(3, this.field384.method169(48, 49, 1, 6));
                        this.field384.method171(3, this.field384.method169(47, 47, 0, 6));
                        this.field384.method171(3, this.field384.method169(47, 47, 1, 6));
                        this.field384.method171(3, this.field384.method169(47, 48, 0, 6));
                        this.field384.method171(3, this.field384.method169(47, 48, 1, 6));
                        this.field384.method171(3, this.field384.method169(148, 48, 0, 6));
                        this.field384.method171(3, this.field384.method169(148, 48, 1, 6));
                        int var20 = this.field384.method179();
                        while (this.field384.method179() > 0) {
                            int var21 = var20 - this.field384.method179();
                            if (var21 > 0) {
                                this.method120("Loading maps - " + var21 * 100 / var20 + "%", 75, 7);
                            }
                            this.method60((byte) -70);
                            try {
                                Thread.sleep(100L);
                            } catch (Exception var66) {
                            }
                        }
                    }
                    int var22 = this.field384.method186((byte) 2, 0);
                    for (int var23 = 0; var23 < var22; ++var23) {
                        int var24 = this.field384.method165(false, var23);
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
                            this.field384.method174(var23, 0, var25, 8);
                        }
                    }
                    this.field384.method168(8, field177);
                    if (!field178) {
                        int var26 = this.field384.method186((byte) 2, 2);
                        for (int var27 = 1; var27 < var26; ++var27) {
                            if (this.field384.method184(9, var27)) {
                                this.field384.method174(var27, 2, (byte) 1, 8);
                            }
                        }
                    }
                    this.method120("Unpacking media", 80, 7);
                    this.field256 = new class4(var6, "invback", 0);
                    this.field258 = new class4(var6, "chatback", 0);
                    this.field257 = new class4(var6, "mapback", 0);
                    this.field228 = new class4(var6, "backbase1", 0);
                    this.field229 = new class4(var6, "backbase2", 0);
                    this.field230 = new class4(var6, "backhmid1", 0);
                    for (int var28 = 0; var28 < 13; ++var28) {
                        this.field397[var28] = new class4(var6, "sideicons", var28);
                    }
                    this.field416 = new class65(var6, "compass", 0);
                    this.field181 = new class65(var6, "mapedge", 0);
                    this.field181.method511(-31504);
                    try {
                        for (int var29 = 0; var29 < 100; ++var29) {
                            this.field522[var29] = new class4(var6, "mapscene", var29);
                        }
                    } catch (Exception var74) {
                    }
                    try {
                        for (int var30 = 0; var30 < 100; ++var30) {
                            this.field84[var30] = new class65(var6, "mapfunction", var30);
                        }
                    } catch (Exception var73) {
                    }
                    try {
                        for (int var31 = 0; var31 < 20; ++var31) {
                            this.field326[var31] = new class65(var6, "hitmarks", var31);
                        }
                    } catch (Exception var72) {
                    }
                    try {
                        for (int var32 = 0; var32 < 20; ++var32) {
                            this.field371[var32] = new class65(var6, "headicons", var32);
                        }
                    } catch (Exception var71) {
                    }
                    this.field56 = new class65(var6, "mapmarker", 0);
                    this.field57 = new class65(var6, "mapmarker", 1);
                    for (int var33 = 0; var33 < 8; ++var33) {
                        this.field186[var33] = new class65(var6, "cross", var33);
                    }
                    this.field293 = new class65(var6, "mapdots", 0);
                    this.field294 = new class65(var6, "mapdots", 1);
                    this.field295 = new class65(var6, "mapdots", 2);
                    this.field296 = new class65(var6, "mapdots", 3);
                    this.field297 = new class65(var6, "mapdots", 4);
                    this.field500 = new class4(var6, "scrollbar", 0);
                    this.field501 = new class4(var6, "scrollbar", 1);
                    this.field277 = new class4(var6, "redstone1", 0);
                    this.field278 = new class4(var6, "redstone2", 0);
                    this.field279 = new class4(var6, "redstone3", 0);
                    this.field280 = new class4(var6, "redstone1", 0);
                    this.field280.method7(0);
                    this.field281 = new class4(var6, "redstone2", 0);
                    this.field281.method7(0);
                    this.field461 = new class4(var6, "redstone1", 0);
                    this.field461.method8((byte) 6);
                    this.field462 = new class4(var6, "redstone2", 0);
                    this.field462.method8((byte) 6);
                    this.field463 = new class4(var6, "redstone3", 0);
                    this.field463.method8((byte) 6);
                    this.field464 = new class4(var6, "redstone1", 0);
                    this.field464.method7(0);
                    this.field464.method8((byte) 6);
                    this.field465 = new class4(var6, "redstone2", 0);
                    this.field465.method7(0);
                    this.field465.method8((byte) 6);
                    for (int var34 = 0; var34 < 2; ++var34) {
                        this.field450[var34] = new class4(var6, "mod_icons", var34);
                    }
                    class65 var35 = new class65(var6, "backleft1", 0);
                    this.field466 = new class39(var35.field1582, var35.field1583, this.method136(0), 0);
                    var35.method512(0, -503, 0);
                    class65 var36 = new class65(var6, "backleft2", 0);
                    this.field467 = new class39(var36.field1582, var36.field1583, this.method136(0), 0);
                    var36.method512(0, -503, 0);
                    class65 var37 = new class65(var6, "backright1", 0);
                    this.field468 = new class39(var37.field1582, var37.field1583, this.method136(0), 0);
                    var37.method512(0, -503, 0);
                    class65 var38 = new class65(var6, "backright2", 0);
                    this.field469 = new class39(var38.field1582, var38.field1583, this.method136(0), 0);
                    var38.method512(0, -503, 0);
                    class65 var39 = new class65(var6, "backtop1", 0);
                    this.field470 = new class39(var39.field1582, var39.field1583, this.method136(0), 0);
                    var39.method512(0, -503, 0);
                    class65 var40 = new class65(var6, "backvmid1", 0);
                    this.field471 = new class39(var40.field1582, var40.field1583, this.method136(0), 0);
                    var40.method512(0, -503, 0);
                    class65 var41 = new class65(var6, "backvmid2", 0);
                    this.field472 = new class39(var41.field1582, var41.field1583, this.method136(0), 0);
                    var41.method512(0, -503, 0);
                    class65 var42 = new class65(var6, "backvmid3", 0);
                    this.field473 = new class39(var42.field1582, var42.field1583, this.method136(0), 0);
                    var42.method512(0, -503, 0);
                    class65 var43 = new class65(var6, "backhmid2", 0);
                    this.field474 = new class39(var43.field1582, var43.field1583, this.method136(0), 0);
                    var43.method512(0, -503, 0);
                    int var44 = (int) (Math.random() * 21.0D) - 10;
                    int var45 = (int) (Math.random() * 21.0D) - 10;
                    int var46 = (int) (Math.random() * 21.0D) - 10;
                    int var47 = (int) (Math.random() * 41.0D) - 20;
                    for (int var48 = 0; var48 < 100; ++var48) {
                        if (this.field84[var48] != null) {
                            this.field84[var48].method510(var45 + var47, var46 + var47, 0, var44 + var47);
                        }
                        if (this.field522[var48] != null) {
                            this.field522[var48].method9(var45 + var47, var46 + var47, 0, var44 + var47);
                        }
                    }
                    this.method120("Unpacking textures", 83, 7);
                    class12.method222(var7, 282);
                    class12.method226(false, 0.8D);
                    class12.method221((byte) 1, 20);
                    this.method120("Unpacking config", 86, 7);
                    class26.method274(var4, false);
                    class63.method504(var4);
                    class56.method475(var4, false);
                    class27.method281(var4);
                    class14.method238(var4);
                    class21.method257(var4, false);
                    class70.method580(var4, false);
                    class64.method507(var4, false);
                    class44.method418(var4, false);
                    class27.field978 = field177;
                    if (!field178) {
                        this.method120("Unpacking sounds", 90, 7);
                        byte[] var49 = var9.method248("sounds.dat", (byte[]) null);
                        class29 var50 = new class29((byte) -28, var49);
                        class22.method263(var50, false);
                    }
                    this.method120("Unpacking interfaces", 95, 7);
                    class35[] var51 = new class35[] { this.field115, this.field116, this.field117, this.field118 };
                    class28.method291(var5, var51, var6, -260);
                    this.method120("Preparing game engine", 100, 7);
                    for (int var52 = 0; var52 < 33; ++var52) {
                        int var53 = 999;
                        int var54 = 0;
                        for (int var55 = 0; var55 < 34; ++var55) {
                            if (this.field257.field32[this.field257.field34 * var52 + var55] == 0) {
                                if (var53 == 999) {
                                    var53 = var55;
                                }
                            } else if (var53 != 999) {
                                var54 = var55;
                                break;
                            }
                        }
                        this.field315[var52] = var53;
                        this.field126[var52] = var54 - var53;
                    }
                    for (int var56 = 5; var56 < 156; ++var56) {
                        int var57 = 999;
                        int var58 = 0;
                        for (int var59 = 25; var59 < 172; ++var59) {
                            if (this.field257.field32[this.field257.field34 * var56 + var59] == 0 && (var59 > 34 || var56 > 34)) {
                                if (var57 == 999) {
                                    var57 = var59;
                                }
                            } else if (var57 != 999) {
                                var58 = var59;
                                break;
                            }
                        }
                        this.field301[var56 - 5] = var57 - 25;
                        this.field309[var56 - 5] = var58 - var57;
                    }
                    class12.method219(479, 96, -181);
                    this.field372 = class12.field708;
                    class12.method219(190, 261, -181);
                    this.field373 = class12.field708;
                    class12.method219(512, 334, -181);
                    this.field374 = class12.field708;
                    int[] var60 = new int[9];
                    for (int var61 = 0; var61 < 9; ++var61) {
                        int var62 = var61 * 32 + 128 + 15;
                        int var63 = var62 * 3 + 600;
                        int var64 = class12.field706[var62];
                        var60[var61] = var63 * var64 >> 16;
                    }
                    class67.method563(false, var60, 800, 500, 334, 512);
                    class43.method380(var8);
                    this.field215 = new class60((byte) 2, this);
                    this.method113(this.field215, 10);
                    class25.field938 = this;
                    class63.field1535 = this;
                    class14.field757 = this;
                } catch (Exception var75) {
                    signlink.reporterror("loaderror " + this.field402 + " " + this.field269);
                    this.field260 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "J", descriptor = "(I)V")
    public final void method150(int arg0) {
        if (this.field413 > 0) {
            this.method23(-654);
        } else {
            this.field338.method376(-329);
            this.field116.method356(565, 144, 0, "Connection lost", 257);
            this.field116.method356(565, 143, 16777215, "Connection lost", 256);
            this.field116.method356(565, 159, 0, "Please wait - attempting to reestablish", 257);
            if (arg0 != -5196) {
                field224 = this.field354.method481();
            }
            this.field116.method356(565, 158, 16777215, "Please wait - attempting to reestablish", 256);
            this.field338.method377(super.field803, 4, 1926, 4);
            this.field302 = 0;
            this.field233 = 0;
            class71 var2 = this.field146;
            this.field191 = false;
            this.field255 = 0;
            this.method47(this.field388, this.field389, true);
            if (!this.field191) {
                this.method23(-654);
            }
            try {
                var2.method583();
            } catch (Exception var3) {
            }
        }
    }

    @OriginalMember(owner = "client", name = "run", descriptor = "()V")
    public final void run() {
        if (this.field321) {
            this.method51((byte) 4);
        } else {
            super.run();
        }
    }

    @OriginalMember(owner = "client", name = "o", descriptor = "(Z)Z")
    public final boolean method151(boolean arg0) {
        this.field191 &= arg0;
        return signlink.wavereplay();
    }

    @OriginalMember(owner = "client", name = "p", descriptor = "(Z)V")
    public final void method152(boolean arg0) {
        if (this.field196 != 0) {
            class35 var2 = this.field116;
            int var3 = 0;
            if (arg0) {
                this.field410 = -1;
            }
            if (this.field303 != 0) {
                var3 = 1;
            }
            for (int var4 = 0; var4 < 100; ++var4) {
                if (this.field252[var4] != null) {
                    int var5 = this.field250[var4];
                    String var6 = this.field251[var4];
                    byte var7 = 0;
                    if (var6 != null && var6.startsWith("@cr1@")) {
                        var6 = var6.substring(5);
                        var7 = 1;
                    }
                    if (var6 != null && var6.startsWith("@cr2@")) {
                        var6 = var6.substring(5);
                        var7 = 2;
                    }
                    if ((var5 == 3 || var5 == 7) && (var5 == 7 || this.field347 == 0 || this.field347 == 1 && this.method106(7, var6))) {
                        int var8 = 329 - var3 * 13;
                        byte var9 = 4;
                        var2.method360(true, var9, 0, "From", var8);
                        var2.method360(true, var9, 65535, "From", var8 - 1);
                        int var10 = var9 + var2.method358(this.field329, "From ");
                        if (var7 == 1) {
                            this.field450[0].method10(var8 - 12, true, var10);
                            var10 += 14;
                        }
                        if (var7 == 2) {
                            this.field450[1].method10(var8 - 12, true, var10);
                            var10 += 14;
                        }
                        var2.method360(true, var10, 0, var6 + ": " + this.field252[var4], var8);
                        var2.method360(true, var10, 65535, var6 + ": " + this.field252[var4], var8 - 1);
                        ++var3;
                        if (var3 >= 5) {
                            return;
                        }
                    }
                    if (var5 == 5 && this.field347 < 2) {
                        int var11 = 329 - var3 * 13;
                        var2.method360(true, 4, 0, this.field252[var4], var11);
                        var2.method360(true, 4, 65535, this.field252[var4], var11 - 1);
                        ++var3;
                        if (var3 >= 5) {
                            return;
                        }
                    }
                    if (var5 == 6 && this.field347 < 2) {
                        int var12 = 329 - var3 * 13;
                        var2.method360(true, 4, 0, "To " + var6 + ": " + this.field252[var4], var12);
                        var2.method360(true, 4, 65535, "To " + var6 + ": " + this.field252[var4], var12 - 1);
                        ++var3;
                        if (var3 >= 5) {
                            return;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "q", descriptor = "(Z)V")
    public final void method153(boolean arg0) {
        this.field191 &= arg0;
        while (true) {
            int var2;
            do {
                while (true) {
                    var2 = this.method256(false);
                    if (var2 == -1) {
                        return;
                    }
                    if (this.field150 != -1 && this.field314 == this.field150) {
                        if (var2 == 8 && this.field451.length() > 0) {
                            this.field451 = this.field451.substring(0, this.field451.length() - 1);
                        }
                        break;
                    }
                    if (this.field216) {
                        if (var2 >= 32 && var2 <= 122 && this.field231.length() < 80) {
                            this.field231 = this.field231 + (char) var2;
                            this.field222 = true;
                        }
                        if (var2 == 8 && this.field231.length() > 0) {
                            this.field231 = this.field231.substring(0, this.field231.length() - 1);
                            this.field222 = true;
                        }
                        if (var2 == 13 || var2 == 10) {
                            this.field216 = false;
                            this.field222 = true;
                            if (this.field95 == 1) {
                                long var3 = class55.method469(this.field231);
                                this.method103(false, var3);
                            }
                            if (this.field95 == 2 && this.field89 > 0) {
                                long var5 = class55.method469(this.field231);
                                this.method35(this.field405, var5);
                            }
                            if (this.field95 == 3 && this.field231.length() > 0) {
                                this.field391.method297(59, false);
                                this.field391.method298(0);
                                int var7 = this.field391.field1107;
                                this.field391.method304(8, this.field327);
                                class17.method250(39843, this.field391, this.field231);
                                this.field391.method307(this.field391.field1107 - var7, (byte) 4);
                                this.field231 = class17.method251(this.field231, 0);
                                this.field231 = class43.method390(this.field231, 0);
                                this.method46(class55.method473(false, class55.method470(this.field327, (byte) 8)), false, 6, this.field231);
                                if (this.field347 == 2) {
                                    this.field347 = 1;
                                    this.field218 = true;
                                    this.field391.method297(50, false);
                                    this.field391.method298(this.field477);
                                    this.field391.method298(this.field347);
                                    this.field391.method298(this.field212);
                                }
                            }
                            if (this.field95 == 4 && this.field367 < 100) {
                                long var8 = class55.method469(this.field231);
                                this.method67(false, var8);
                            }
                            if (this.field95 == 5 && this.field367 > 0) {
                                long var10 = class55.method469(this.field231);
                                this.method56(var10, -451);
                            }
                        }
                    } else if (this.field508) {
                        if (var2 >= 48 && var2 <= 57 && this.field386.length() < 10) {
                            this.field386 = this.field386 + (char) var2;
                            this.field222 = true;
                        }
                        if (var2 == 8 && this.field386.length() > 0) {
                            this.field386 = this.field386.substring(0, this.field386.length() - 1);
                            this.field222 = true;
                        }
                        if (var2 == 13 || var2 == 10) {
                            if (this.field386.length() > 0) {
                                int var12 = 0;
                                try {
                                    var12 = Integer.parseInt(this.field386);
                                } catch (Exception var20) {
                                }
                                this.field391.method297(212, false);
                                this.field391.method302(var12);
                            }
                            this.field508 = false;
                            this.field222 = true;
                        }
                    } else if (this.field357 == -1) {
                        if (var2 >= 32 && var2 <= 122 && this.field88.length() < 80) {
                            this.field88 = this.field88 + (char) var2;
                            this.field222 = true;
                        }
                        if (var2 == 8 && this.field88.length() > 0) {
                            this.field88 = this.field88.substring(0, this.field88.length() - 1);
                            this.field222 = true;
                        }
                        if ((var2 == 13 || var2 == 10) && this.field88.length() > 0) {
                            if (this.field223 == 2) {
                                if (this.field88.equals("::clientdrop")) {
                                    this.method150(this.field190);
                                }
                                if (this.field88.equals("::lag")) {
                                    this.method135(-210);
                                }
                                if (this.field88.equals("::prefetchmusic")) {
                                    for (int var13 = 0; var13 < this.field384.method186((byte) 2, 2); ++var13) {
                                        this.field384.method174(var13, 2, (byte) 1, 8);
                                    }
                                }
                                if (this.field88.equals("::fpson")) {
                                    field291 = true;
                                }
                                if (this.field88.equals("::fpsoff")) {
                                    field291 = false;
                                }
                                if (this.field88.equals("::noclip")) {
                                    for (int var14 = 0; var14 < 4; ++var14) {
                                        this.field476[var14].method484(39110);
                                    }
                                }
                            }
                            if (this.field88.startsWith("::")) {
                                this.field391.method297(149, false);
                                this.field391.method298(this.field88.length() - 1);
                                this.field391.method305(this.field88.substring(2));
                            } else {
                                String var15 = this.field88.toLowerCase();
                                byte var16 = 0;
                                if (var15.startsWith("yellow:")) {
                                    var16 = 0;
                                    this.field88 = this.field88.substring(7);
                                } else if (var15.startsWith("red:")) {
                                    var16 = 1;
                                    this.field88 = this.field88.substring(4);
                                } else if (var15.startsWith("green:")) {
                                    var16 = 2;
                                    this.field88 = this.field88.substring(6);
                                } else if (var15.startsWith("cyan:")) {
                                    var16 = 3;
                                    this.field88 = this.field88.substring(5);
                                } else if (var15.startsWith("purple:")) {
                                    var16 = 4;
                                    this.field88 = this.field88.substring(7);
                                } else if (var15.startsWith("white:")) {
                                    var16 = 5;
                                    this.field88 = this.field88.substring(6);
                                } else if (var15.startsWith("flash1:")) {
                                    var16 = 6;
                                    this.field88 = this.field88.substring(7);
                                } else if (var15.startsWith("flash2:")) {
                                    var16 = 7;
                                    this.field88 = this.field88.substring(7);
                                } else if (var15.startsWith("flash3:")) {
                                    var16 = 8;
                                    this.field88 = this.field88.substring(7);
                                } else if (var15.startsWith("glow1:")) {
                                    var16 = 9;
                                    this.field88 = this.field88.substring(6);
                                } else if (var15.startsWith("glow2:")) {
                                    var16 = 10;
                                    this.field88 = this.field88.substring(6);
                                } else if (var15.startsWith("glow3:")) {
                                    var16 = 11;
                                    this.field88 = this.field88.substring(6);
                                }
                                String var17 = this.field88.toLowerCase();
                                byte var18 = 0;
                                if (var17.startsWith("wave:")) {
                                    var18 = 1;
                                    this.field88 = this.field88.substring(5);
                                } else if (var17.startsWith("wave2:")) {
                                    var18 = 2;
                                    this.field88 = this.field88.substring(6);
                                } else if (var17.startsWith("shake:")) {
                                    var18 = 3;
                                    this.field88 = this.field88.substring(6);
                                } else if (var17.startsWith("scroll:")) {
                                    var18 = 4;
                                    this.field88 = this.field88.substring(7);
                                } else if (var17.startsWith("slide:")) {
                                    var18 = 5;
                                    this.field88 = this.field88.substring(6);
                                }
                                this.field391.method297(211, false);
                                this.field391.method298(0);
                                int var19 = this.field391.field1107;
                                this.field305.field1107 = 0;
                                class17.method250(39843, this.field305, this.field88);
                                this.field391.method340(0, this.field305.field1107, 0, this.field305.field1106);
                                this.field391.method324(this.field322, var18);
                                this.field391.method324(this.field322, var16);
                                this.field391.method307(this.field391.field1107 - var19, (byte) 4);
                                this.field88 = class17.method251(this.field88, 0);
                                this.field88 = class43.method390(this.field88, 0);
                                field488.field863 = this.field88;
                                field488.field884 = var16;
                                field488.field903 = var18;
                                field488.field882 = 150;
                                if (this.field223 == 2) {
                                    this.method46("@cr2@" + field488.field532, false, 2, field488.field863);
                                } else if (this.field223 == 1) {
                                    this.method46("@cr1@" + field488.field532, false, 2, field488.field863);
                                } else {
                                    this.method46(field488.field532, false, 2, field488.field863);
                                }
                                if (this.field477 == 2) {
                                    this.field477 = 3;
                                    this.field218 = true;
                                    this.field391.method297(50, false);
                                    this.field391.method298(this.field477);
                                    this.field391.method298(this.field347);
                                    this.field391.method298(this.field212);
                                }
                            }
                            this.field88 = "";
                            this.field222 = true;
                        }
                    }
                }
            } while ((var2 < 97 || var2 > 122) && (var2 < 65 || var2 > 90) && (var2 < 48 || var2 > 57) && var2 != 32);
            if (this.field451.length() < 12) {
                this.field451 = this.field451 + (char) var2;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LINLHDAGO;IILCXEZIPRQ;I)V")
    private final void method154(class29 arg0, int arg1, int arg2, class8 arg3, int arg4) {
        if (arg1 != -24437) {
            this.field83 = this.field354.method481();
        }
        if ((arg4 & 256) != 0) {
            int var6 = arg0.method327(-41963);
            int var7 = arg0.method308();
            arg3.method270(var6, -674, field341, var7);
            arg3.field888 = field341 + 300;
            arg3.field889 = arg0.method325(-254);
            arg3.field890 = arg0.method327(-41963);
        }
        if ((arg4 & 512) != 0) {
            arg3.field869 = arg0.method326((byte) -115);
            arg3.field871 = arg0.method326((byte) -115);
            arg3.field870 = arg0.method326((byte) -115);
            arg3.field872 = arg0.method326((byte) -115);
            arg3.field873 = arg0.method333(870) + field341;
            arg3.field874 = arg0.method310() + field341;
            arg3.field875 = arg0.method326((byte) -115);
            arg3.method269(true);
        }
        if ((arg4 & 1024) != 0) {
            arg3.field905 = arg0.method334((byte) 6);
            int var8 = arg0.method313();
            arg3.field909 = var8 >> 16;
            arg3.field908 = (var8 & 65535) + field341;
            arg3.field906 = 0;
            arg3.field907 = 0;
            if (arg3.field908 > field341) {
                arg3.field906 = -1;
            }
            if (arg3.field905 == 65535) {
                arg3.field905 = -1;
            }
        }
        if ((arg4 & 8) != 0) {
            int var9 = arg0.method333(870);
            int var10 = arg0.method327(-41963);
            int var11 = arg0.method327(-41963);
            int var12 = arg0.field1107;
            if (arg3.field532 != null && arg3.field547) {
                long var13 = class55.method469(arg3.field532);
                boolean var15 = false;
                if (var10 <= 1) {
                    for (int var16 = 0; var16 < this.field367; ++var16) {
                        if (this.field459[var16] == var13) {
                            var15 = true;
                            break;
                        }
                    }
                }
                if (!var15 && this.field185 == 0) {
                    try {
                        this.field305.field1107 = 0;
                        arg0.method341(0, var11, 599, this.field305.field1106);
                        this.field305.field1107 = 0;
                        String var17 = class17.method249(0, this.field305, var11);
                        String var18 = class43.method390(var17, 0);
                        arg3.field863 = var18;
                        arg3.field884 = var9 >> 8;
                        arg3.field903 = var9 & 255;
                        arg3.field882 = 150;
                        if (var10 != 2 && var10 != 3) {
                            if (var10 == 1) {
                                this.method46("@cr1@" + arg3.field532, false, 1, var18);
                            } else {
                                this.method46(arg3.field532, false, 2, var18);
                            }
                        } else {
                            this.method46("@cr2@" + arg3.field532, false, 1, var18);
                        }
                    } catch (Exception var28) {
                        signlink.reporterror("cde2");
                    }
                }
            }
            arg0.field1107 = var11 + var12;
        }
        if ((arg4 & 128) != 0) {
            arg3.field915 = arg0.method334((byte) 6);
            arg3.field916 = arg0.method333(870);
        }
        if ((arg4 & 16) != 0) {
            int var20 = arg0.method327(-41963);
            int var21 = arg0.method326((byte) -115);
            arg3.method270(var20, -674, field341, var21);
            arg3.field888 = field341 + 300;
            arg3.field889 = arg0.method327(-41963);
            arg3.field890 = arg0.method325(-254);
        }
        if ((arg4 & 4) != 0) {
            arg3.field863 = arg0.method315();
            if (arg3.field863.charAt(0) == '~') {
                arg3.field863 = arg3.field863.substring(1);
                this.method46(arg3.field532, false, 2, arg3.field863);
            } else if (field488 == arg3) {
                this.method46(arg3.field532, false, 2, arg3.field863);
            }
            arg3.field884 = 0;
            arg3.field903 = 0;
            arg3.field882 = 150;
        }
        if ((arg4 & 64) != 0) {
            arg3.field913 = arg0.method333(870);
            if (arg3.field913 == 65535) {
                arg3.field913 = -1;
            }
        }
        if ((arg4 & 2) != 0) {
            int var22 = arg0.method334((byte) 6);
            if (var22 == 65535) {
                var22 = -1;
            }
            int var23 = arg0.method325(-254);
            if (arg3.field898 == var22 && var22 != -1) {
                int var24 = class26.field949[var22].field963;
                if (var24 == 1) {
                    arg3.field899 = 0;
                    arg3.field900 = 0;
                    arg3.field901 = var23;
                    arg3.field902 = 0;
                }
                if (var24 == 2) {
                    arg3.field902 = 0;
                }
            } else if (var22 == -1 || arg3.field898 == -1 || class26.field949[var22].field957 >= class26.field949[arg3.field898].field957) {
                arg3.field898 = var22;
                arg3.field899 = 0;
                arg3.field900 = 0;
                arg3.field901 = var23;
                arg3.field902 = 0;
                arg3.field868 = arg3.field881;
            }
        }
        if ((arg4 & 32) != 0) {
            int var25 = arg0.method308();
            byte[] var26 = new byte[var25];
            class29 var27 = new class29((byte) -28, var26);
            arg0.method342(var26, 0, false, var25);
            this.field424[arg2] = var27;
            arg3.method163(var27, true);
        }
    }

    @OriginalMember(owner = "client", name = "r", descriptor = "(Z)V")
    public static final void method155(boolean arg0) {
        class67.field1622 = true;
        if (!arg0) {
            field298 = !field298;
        }
        class12.field697 = true;
        field178 = true;
        class52.field1343 = true;
        class63.field1512 = true;
    }

    @OriginalMember(owner = "client", name = "h", descriptor = "(II)Ljava/lang/String;")
    private static final String method156(int arg0, int arg1) {
        String var2 = String.valueOf(arg1);
        if (arg0 >= 0) {
            throw new NullPointerException();
        } else {
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

    @OriginalMember(owner = "client", name = "n", descriptor = "(B)V")
    public final void method157(byte arg0) {
        if (arg0 != -81) {
            this.field392 = !this.field392;
        }
        if (this.field302 == 0) {
            if (super.field817 == 1) {
                int var2 = super.field818 - 25 - 550;
                int var3 = super.field819 - 5 - 4;
                if (var2 >= 0 && var3 >= 0 && var2 < 146 && var3 < 151) {
                    var2 -= 73;
                    var3 -= 75;
                    int var4 = this.field52 + this.field226 & 2047;
                    int var5 = class12.field706[var4];
                    int var6 = class12.field707[var4];
                    int var7 = (this.field406 + 256) * var5 >> 8;
                    int var8 = (this.field406 + 256) * var6 >> 8;
                    int var9 = var2 * var8 + var3 * var7 >> 11;
                    int var10 = var3 * var8 - var2 * var7 >> 11;
                    int var11 = field488.field885 + var9 >> 7;
                    int var12 = field488.field886 - var10 >> 7;
                    boolean var13 = this.method73(1, 0, 0, var11, 0, 3234, var12, true, field488.field876[0], 0, 0, field488.field877[0]);
                    if (var13) {
                        this.field391.method298(var2);
                        this.field391.method298(var3);
                        this.field391.method299(this.field52);
                        this.field391.method298(57);
                        this.field391.method298(this.field226);
                        this.field391.method298(this.field406);
                        this.field391.method298(89);
                        this.field391.method299(field488.field885);
                        this.field391.method299(field488.field886);
                        this.field391.method298(this.field59);
                        this.field391.method298(63);
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "K", descriptor = "(I)V")
    public final void method158(int arg0) {
        for (int var2 = -1; var2 < this.field420; ++var2) {
            int var3;
            if (var2 == -1) {
                var3 = this.field418;
            } else {
                var3 = this.field421[var2];
            }
            class8 var4 = this.field419[var3];
            if (var4 != null) {
                this.method76(1, this.field458, var4);
            }
        }
        this.field409 += arg0;
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; ++var1) {
            field313[var1] = var0 - 1;
            var0 += var0;
        }
        field344 = new int[99];
        int var2 = 0;
        for (int var3 = 0; var3 < 99; ++var3) {
            int var4 = var3 + 1;
            int var5 = (int) ((double) var4 + 300.0D * Math.pow(2.0D, (double) var4 / 7.0D));
            var2 += var5;
            field344[var3] = var2 / 4;
        }
        field345 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };
        field432 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
        field433 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };
        field502 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");
    }
}
