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
public class client extends class29 {

    @OriginalMember(owner = "client", name = "S", descriptor = "LULLVQOAK;")
    private class58 field47 = new class58();

    @OriginalMember(owner = "client", name = "W", descriptor = "Z")
    private boolean field51 = false;

    @OriginalMember(owner = "client", name = "X", descriptor = "I")
    private int field52 = 9776;

    @OriginalMember(owner = "client", name = "Y", descriptor = "[I")
    private int[] field53 = new int[5];

    @OriginalMember(owner = "client", name = "fb", descriptor = "[[[I")
    private int[][][] field60 = new int[4][13][13];

    @OriginalMember(owner = "client", name = "gb", descriptor = "[LLKEIRLLI;")
    private class35[] field61 = new class35[13];

    @OriginalMember(owner = "client", name = "hb", descriptor = "[I")
    private int[] field62 = new int[50];

    @OriginalMember(owner = "client", name = "sb", descriptor = "Z")
    private boolean field73 = false;

    @OriginalMember(owner = "client", name = "ub", descriptor = "[I")
    private int[] field75 = new int[class47.field1280];

    @OriginalMember(owner = "client", name = "xb", descriptor = "I")
    private int field78 = 2;

    @OriginalMember(owner = "client", name = "yb", descriptor = "I")
    private int field79 = -1;

    @OriginalMember(owner = "client", name = "zb", descriptor = "I")
    private int field80 = 128;

    @OriginalMember(owner = "client", name = "Fb", descriptor = "Z")
    private boolean field86 = true;

    @OriginalMember(owner = "client", name = "Gb", descriptor = "I")
    private int field87 = -1;

    @OriginalMember(owner = "client", name = "Hb", descriptor = "I")
    private int field88 = -1;

    @OriginalMember(owner = "client", name = "Mb", descriptor = "[B")
    private byte[] field93 = new byte[16384];

    @OriginalMember(owner = "client", name = "Nb", descriptor = "Z")
    private boolean field94 = false;

    @OriginalMember(owner = "client", name = "Ob", descriptor = "[LDUMEPGRH;")
    private class10[] field95 = new class10[20];

    @OriginalMember(owner = "client", name = "Qb", descriptor = "Z")
    private boolean field97 = false;

    @OriginalMember(owner = "client", name = "Ub", descriptor = "Z")
    private boolean field101 = true;

    @OriginalMember(owner = "client", name = "Vb", descriptor = "[I")
    private int[] field102 = new int[5];

    @OriginalMember(owner = "client", name = "Wb", descriptor = "Ljava/lang/String;")
    private String field103 = "";

    @OriginalMember(owner = "client", name = "Xb", descriptor = "Ljava/lang/String;")
    private String field104 = "";

    @OriginalMember(owner = "client", name = "Yb", descriptor = "B")
    private byte field105 = -44;

    @OriginalMember(owner = "client", name = "ac", descriptor = "Ljava/lang/String;")
    private String field107 = "";

    @OriginalMember(owner = "client", name = "cc", descriptor = "Z")
    private volatile boolean field109 = false;

    @OriginalMember(owner = "client", name = "dc", descriptor = "[I")
    private int[] field110 = new int[200];

    @OriginalMember(owner = "client", name = "fc", descriptor = "I")
    private int field112 = 7759444;

    @OriginalMember(owner = "client", name = "hc", descriptor = "I")
    private int field114 = -1;

    @OriginalMember(owner = "client", name = "qc", descriptor = "I")
    private int field123 = -139;

    @OriginalMember(owner = "client", name = "rc", descriptor = "[I")
    private int[] field124 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client", name = "xc", descriptor = "Z")
    private boolean field130 = false;

    @OriginalMember(owner = "client", name = "Ac", descriptor = "I")
    private int field133 = -1;

    @OriginalMember(owner = "client", name = "Dc", descriptor = "Z")
    private boolean field136 = false;

    @OriginalMember(owner = "client", name = "Fc", descriptor = "[I")
    private int[] field138 = new int[151];

    @OriginalMember(owner = "client", name = "Gc", descriptor = "I")
    private int field139 = -1;

    @OriginalMember(owner = "client", name = "Pc", descriptor = "I")
    private int field148 = 50;

    @OriginalMember(owner = "client", name = "Qc", descriptor = "[I")
    private int[] field149 = new int[this.field148];

    @OriginalMember(owner = "client", name = "Rc", descriptor = "[I")
    private int[] field150 = new int[this.field148];

    @OriginalMember(owner = "client", name = "Sc", descriptor = "[I")
    private int[] field151 = new int[this.field148];

    @OriginalMember(owner = "client", name = "Tc", descriptor = "[I")
    private int[] field152 = new int[this.field148];

    @OriginalMember(owner = "client", name = "Uc", descriptor = "[I")
    private int[] field153 = new int[this.field148];

    @OriginalMember(owner = "client", name = "Vc", descriptor = "[I")
    private int[] field154 = new int[this.field148];

    @OriginalMember(owner = "client", name = "Wc", descriptor = "[I")
    private int[] field155 = new int[this.field148];

    @OriginalMember(owner = "client", name = "Xc", descriptor = "[Ljava/lang/String;")
    private String[] field156 = new String[this.field148];

    @OriginalMember(owner = "client", name = "cd", descriptor = "Ljava/lang/String;")
    private String field161 = "";

    @OriginalMember(owner = "client", name = "dd", descriptor = "I")
    private int field162 = 341;

    @OriginalMember(owner = "client", name = "ed", descriptor = "[I")
    private int[] field163 = new int[class47.field1280];

    @OriginalMember(owner = "client", name = "fd", descriptor = "Z")
    private boolean field164 = true;

    @OriginalMember(owner = "client", name = "gd", descriptor = "[I")
    private int[] field165 = new int[5];

    @OriginalMember(owner = "client", name = "id", descriptor = "I")
    private final int field167 = 100;

    @OriginalMember(owner = "client", name = "jd", descriptor = "[I")
    private int[] field168 = new int[100];

    @OriginalMember(owner = "client", name = "md", descriptor = "[LSJIXUDLP;")
    public class50[] field171 = new class50[5];

    @OriginalMember(owner = "client", name = "nd", descriptor = "Z")
    private boolean field172 = false;

    @OriginalMember(owner = "client", name = "qd", descriptor = "[I")
    private int[] field175 = new int[class47.field1280];

    @OriginalMember(owner = "client", name = "sd", descriptor = "Z")
    private boolean field177 = false;

    @OriginalMember(owner = "client", name = "td", descriptor = "Z")
    private volatile boolean field178 = false;

    @OriginalMember(owner = "client", name = "ud", descriptor = "[Ljava/lang/String;")
    private String[] field179 = new String[500];

    @OriginalMember(owner = "client", name = "Bd", descriptor = "I")
    private int field186 = -1;

    @OriginalMember(owner = "client", name = "Dd", descriptor = "I")
    private int field188 = 1;

    @OriginalMember(owner = "client", name = "Ed", descriptor = "[I")
    private int[] field189 = new int[33];

    @OriginalMember(owner = "client", name = "Fd", descriptor = "Ljava/lang/String;")
    private String field190 = "";

    @OriginalMember(owner = "client", name = "Jd", descriptor = "[Ljava/lang/String;")
    private String[] field194 = new String[200];

    @OriginalMember(owner = "client", name = "Kd", descriptor = "B")
    private byte field195 = 1;

    @OriginalMember(owner = "client", name = "Ld", descriptor = "[LDUMEPGRH;")
    private class10[] field196 = new class10[100];

    @OriginalMember(owner = "client", name = "Qd", descriptor = "[Ljava/lang/String;")
    private String[] field201 = new String[5];

    @OriginalMember(owner = "client", name = "Rd", descriptor = "[Z")
    private boolean[] field202 = new boolean[5];

    @OriginalMember(owner = "client", name = "Td", descriptor = "B")
    private byte field204 = 3;

    @OriginalMember(owner = "client", name = "Ud", descriptor = "[I")
    private int[] field205 = new int[100];

    @OriginalMember(owner = "client", name = "Vd", descriptor = "[Ljava/lang/String;")
    private String[] field206 = new String[100];

    @OriginalMember(owner = "client", name = "Wd", descriptor = "[Ljava/lang/String;")
    private String[] field207 = new String[100];

    @OriginalMember(owner = "client", name = "Xd", descriptor = "[Z")
    private boolean[] field208 = new boolean[5];

    @OriginalMember(owner = "client", name = "Yd", descriptor = "I")
    private int field209 = 982;

    @OriginalMember(owner = "client", name = "fe", descriptor = "Z")
    private boolean field216 = false;

    @OriginalMember(owner = "client", name = "ke", descriptor = "Z")
    private boolean field221 = false;

    @OriginalMember(owner = "client", name = "le", descriptor = "I")
    private int field222 = 78;

    @OriginalMember(owner = "client", name = "qe", descriptor = "[[I")
    private int[][] field227 = new int[104][104];

    @OriginalMember(owner = "client", name = "te", descriptor = "Z")
    private boolean field230 = true;

    @OriginalMember(owner = "client", name = "ve", descriptor = "[I")
    private int[] field232 = new int[1000];

    @OriginalMember(owner = "client", name = "we", descriptor = "[I")
    private int[] field233 = new int[1000];

    @OriginalMember(owner = "client", name = "ye", descriptor = "B")
    private byte field235 = -111;

    @OriginalMember(owner = "client", name = "Ae", descriptor = "[I")
    private int[] field237 = new int[33];

    @OriginalMember(owner = "client", name = "Ee", descriptor = "[LLKEIRLLI;")
    private class35[] field241 = new class35[2];

    @OriginalMember(owner = "client", name = "He", descriptor = "Z")
    private boolean field244 = true;

    @OriginalMember(owner = "client", name = "Ie", descriptor = "Z")
    private boolean field245 = true;

    @OriginalMember(owner = "client", name = "Qe", descriptor = "LLOISKKJJ;")
    private class36 field253 = new class36(6);

    @OriginalMember(owner = "client", name = "Re", descriptor = "I")
    private int field254 = 5063219;

    @OriginalMember(owner = "client", name = "Se", descriptor = "I")
    private int field255 = -1;

    @OriginalMember(owner = "client", name = "Ve", descriptor = "B")
    private byte field258 = 45;

    @OriginalMember(owner = "client", name = "Xe", descriptor = "Z")
    private boolean field260 = false;

    @OriginalMember(owner = "client", name = "Ye", descriptor = "I")
    private int field261 = 18224;

    @OriginalMember(owner = "client", name = "Ze", descriptor = "Z")
    private boolean field262 = false;

    @OriginalMember(owner = "client", name = "af", descriptor = "[[I")
    private int[][] field263 = new int[104][104];

    @OriginalMember(owner = "client", name = "bf", descriptor = "I")
    private int field264 = 549;

    @OriginalMember(owner = "client", name = "cf", descriptor = "[LLKEIRLLI;")
    private class35[] field265 = new class35[100];

    @OriginalMember(owner = "client", name = "ef", descriptor = "I")
    private int field267 = 8754;

    @OriginalMember(owner = "client", name = "gf", descriptor = "Z")
    private boolean field269 = false;

    @OriginalMember(owner = "client", name = "jf", descriptor = "I")
    private int field271 = 1;

    @OriginalMember(owner = "client", name = "lf", descriptor = "[I")
    private int[] field273 = new int[50];

    @OriginalMember(owner = "client", name = "mf", descriptor = "I")
    private int field274 = 2301979;

    @OriginalMember(owner = "client", name = "wf", descriptor = "I")
    private int field284 = 2048;

    @OriginalMember(owner = "client", name = "xf", descriptor = "I")
    private int field285 = 2047;

    @OriginalMember(owner = "client", name = "yf", descriptor = "[LAHUILQJH;")
    private class1[] field286 = new class1[this.field284];

    @OriginalMember(owner = "client", name = "Af", descriptor = "[I")
    public int[] field288 = new int[this.field284];

    @OriginalMember(owner = "client", name = "Cf", descriptor = "[I")
    private int[] field290 = new int[this.field284];

    @OriginalMember(owner = "client", name = "Df", descriptor = "[LLDILQFVA;")
    private class34[] field291 = new class34[this.field284];

    @OriginalMember(owner = "client", name = "Gf", descriptor = "I")
    private int field294 = -1;

    @OriginalMember(owner = "client", name = "Hf", descriptor = "B")
    private byte field295 = -15;

    @OriginalMember(owner = "client", name = "Jf", descriptor = "[I")
    private int[] field297 = new int[5];

    @OriginalMember(owner = "client", name = "Uf", descriptor = "Ljava/lang/String;")
    private String field308 = "";

    @OriginalMember(owner = "client", name = "Vf", descriptor = "I")
    private int field309 = -1;

    @OriginalMember(owner = "client", name = "Wf", descriptor = "Ljava/util/zip/CRC32;")
    private CRC32 field310 = new CRC32();

    @OriginalMember(owner = "client", name = "dg", descriptor = "Z")
    private boolean field317 = false;

    @OriginalMember(owner = "client", name = "eg", descriptor = "B")
    private byte field318 = 5;

    @OriginalMember(owner = "client", name = "fg", descriptor = "LLOISKKJJ;")
    private class36 field319 = new class36(6);

    @OriginalMember(owner = "client", name = "gg", descriptor = "Z")
    private boolean field320 = true;

    @OriginalMember(owner = "client", name = "hg", descriptor = "Z")
    public boolean field321 = false;

    @OriginalMember(owner = "client", name = "kg", descriptor = "[I")
    private int[] field324 = new int[256];

    @OriginalMember(owner = "client", name = "og", descriptor = "Z")
    private boolean field328 = false;

    @OriginalMember(owner = "client", name = "pg", descriptor = "LLDILQFVA;")
    private class34 field329 = class34.method390(1, 35998);

    @OriginalMember(owner = "client", name = "sg", descriptor = "I")
    private int field332 = 43417;

    @OriginalMember(owner = "client", name = "yg", descriptor = "I")
    private int field338 = 582;

    @OriginalMember(owner = "client", name = "zg", descriptor = "[J")
    private long[] field339 = new long[100];

    @OriginalMember(owner = "client", name = "Ag", descriptor = "Z")
    private boolean field340 = false;

    @OriginalMember(owner = "client", name = "Fg", descriptor = "Z")
    private boolean field345 = false;

    @OriginalMember(owner = "client", name = "Hg", descriptor = "B")
    private byte field347 = 0;

    @OriginalMember(owner = "client", name = "Ig", descriptor = "Z")
    private boolean field348 = false;

    @OriginalMember(owner = "client", name = "Qg", descriptor = "I")
    private int field356 = 3;

    @OriginalMember(owner = "client", name = "Rg", descriptor = "[I")
    private int[] field357 = new int[500];

    @OriginalMember(owner = "client", name = "Sg", descriptor = "[I")
    private int[] field358 = new int[500];

    @OriginalMember(owner = "client", name = "Tg", descriptor = "[I")
    private int[] field359 = new int[500];

    @OriginalMember(owner = "client", name = "Ug", descriptor = "[I")
    private int[] field360 = new int[500];

    @OriginalMember(owner = "client", name = "Xg", descriptor = "I")
    private int field363 = 9;

    @OriginalMember(owner = "client", name = "Yg", descriptor = "Z")
    private boolean field364 = false;

    @OriginalMember(owner = "client", name = "ch", descriptor = "Z")
    private boolean field368 = false;

    @OriginalMember(owner = "client", name = "eh", descriptor = "[I")
    private int[] field370 = new int[9];

    @OriginalMember(owner = "client", name = "gh", descriptor = "[LDUMEPGRH;")
    private class10[] field372 = new class10[8];

    @OriginalMember(owner = "client", name = "hh", descriptor = "I")
    private int field373 = -1;

    @OriginalMember(owner = "client", name = "ih", descriptor = "LLOISKKJJ;")
    private class36 field374 = new class36(6);

    @OriginalMember(owner = "client", name = "jh", descriptor = "Z")
    private boolean field375 = false;

    @OriginalMember(owner = "client", name = "kh", descriptor = "[I")
    private int[] field376 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client", name = "vh", descriptor = "[I")
    private int[] field387 = new int[4000];

    @OriginalMember(owner = "client", name = "wh", descriptor = "[I")
    private int[] field388 = new int[4000];

    @OriginalMember(owner = "client", name = "Bh", descriptor = "I")
    private int field393 = 3353893;

    @OriginalMember(owner = "client", name = "Eh", descriptor = "I")
    private int field396 = 2;

    @OriginalMember(owner = "client", name = "Hh", descriptor = "Z")
    private boolean field399 = true;

    @OriginalMember(owner = "client", name = "Jh", descriptor = "Z")
    private volatile boolean field401 = false;

    @OriginalMember(owner = "client", name = "Mh", descriptor = "[I")
    public int[] field404 = new int[1000];

    @OriginalMember(owner = "client", name = "Oh", descriptor = "Z")
    private boolean field406 = false;

    @OriginalMember(owner = "client", name = "Ph", descriptor = "I")
    private int field407 = -353;

    @OriginalMember(owner = "client", name = "Qh", descriptor = "B")
    private byte field408 = 0;

    @OriginalMember(owner = "client", name = "Vh", descriptor = "LLDILQFVA;")
    private class34 field413 = class34.method390(1, 35998);

    @OriginalMember(owner = "client", name = "Xh", descriptor = "B")
    private byte field415 = 5;

    @OriginalMember(owner = "client", name = "ai", descriptor = "[I")
    private int[] field418 = new int[50];

    @OriginalMember(owner = "client", name = "ci", descriptor = "[[[LLOISKKJJ;")
    private class36[][][] field420 = new class36[4][104][104];

    @OriginalMember(owner = "client", name = "di", descriptor = "[LDUMEPGRH;")
    private class10[] field421 = new class10[1000];

    @OriginalMember(owner = "client", name = "ei", descriptor = "[LDUMEPGRH;")
    private class10[] field422 = new class10[20];

    @OriginalMember(owner = "client", name = "fi", descriptor = "I")
    private int field423 = 23829;

    @OriginalMember(owner = "client", name = "gi", descriptor = "Z")
    public boolean field424 = true;

    @OriginalMember(owner = "client", name = "ii", descriptor = "[I")
    private final int[] field426 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client", name = "ji", descriptor = "I")
    private int field427 = 1;

    @OriginalMember(owner = "client", name = "li", descriptor = "Z")
    private boolean field429 = false;

    @OriginalMember(owner = "client", name = "oi", descriptor = "I")
    private int field432 = 2;

    @OriginalMember(owner = "client", name = "zi", descriptor = "LLDILQFVA;")
    private class34 field443 = new class34(new byte[5000], field400);

    @OriginalMember(owner = "client", name = "Ai", descriptor = "[LTVKIEQYR;")
    private class54[] field444 = new class54[16384];

    @OriginalMember(owner = "client", name = "Ci", descriptor = "[I")
    public int[] field446 = new int[16384];

    @OriginalMember(owner = "client", name = "Hi", descriptor = "Z")
    private boolean field451 = false;

    @OriginalMember(owner = "client", name = "Li", descriptor = "[I")
    public int[] field455 = new int[2000];

    @OriginalMember(owner = "client", name = "Mi", descriptor = "I")
    private int field456 = -1;

    @OriginalMember(owner = "client", name = "Ni", descriptor = "Z")
    private boolean field457 = false;

    @OriginalMember(owner = "client", name = "aj", descriptor = "Z")
    private boolean field470 = false;

    @OriginalMember(owner = "client", name = "bj", descriptor = "Z")
    private boolean field471 = false;

    @OriginalMember(owner = "client", name = "fj", descriptor = "Z")
    private boolean field475 = false;

    @OriginalMember(owner = "client", name = "gj", descriptor = "Ljava/lang/String;")
    private String field476 = "";

    @OriginalMember(owner = "client", name = "hj", descriptor = "Ljava/lang/String;")
    private String field477 = "";

    @OriginalMember(owner = "client", name = "ij", descriptor = "Z")
    private boolean field478 = true;

    @OriginalMember(owner = "client", name = "pj", descriptor = "[LEXLGBZBR;")
    private class18[] field485 = new class18[4];

    @OriginalMember(owner = "client", name = "sj", descriptor = "[I")
    private int[] field488 = new int[5];

    @OriginalMember(owner = "client", name = "uj", descriptor = "[J")
    private long[] field490 = new long[200];

    @OriginalMember(owner = "client", name = "wj", descriptor = "I")
    private int field492 = -1;

    @OriginalMember(owner = "client", name = "yj", descriptor = "I")
    private int field494 = 1;

    @OriginalMember(owner = "client", name = "zj", descriptor = "LLDILQFVA;")
    private class34 field495 = class34.method390(1, 35998);

    @OriginalMember(owner = "client", name = "Bj", descriptor = "Z")
    private boolean field497 = false;

    @OriginalMember(owner = "client", name = "Cj", descriptor = "I")
    private int field498 = -1;

    @OriginalMember(owner = "client", name = "Hj", descriptor = "I")
    private int field503 = 7;

    @OriginalMember(owner = "client", name = "Kj", descriptor = "[I")
    private int[] field506 = new int[151];

    @OriginalMember(owner = "client", name = "Lj", descriptor = "I")
    private int field507 = 670;

    @OriginalMember(owner = "client", name = "Mj", descriptor = "B")
    private byte field508 = 76;

    @OriginalMember(owner = "client", name = "Oj", descriptor = "[I")
    private int[] field510 = new int[7];

    @OriginalMember(owner = "client", name = "Sj", descriptor = "Z")
    private boolean field514 = false;

    @OriginalMember(owner = "client", name = "Uj", descriptor = "Ljava/lang/String;")
    private String field516 = "";

    @OriginalMember(owner = "client", name = "Vj", descriptor = "[I")
    private int[] field517 = new int[2000];

    @OriginalMember(owner = "client", name = "Xj", descriptor = "[[I")
    private int[][] field519 = new int[104][104];

    @OriginalMember(owner = "client", name = "Yj", descriptor = "B")
    private byte field520 = 7;

    @OriginalMember(owner = "client", name = "bc", descriptor = "Z")
    private static boolean field108 = true;

    @OriginalMember(owner = "client", name = "ec", descriptor = "Ljava/math/BigInteger;")
    private static BigInteger field111 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client", name = "jc", descriptor = "I")
    private static int field116 = 22279;

    @OriginalMember(owner = "client", name = "rd", descriptor = "[I")
    public static int[] field176 = new int[32];

    @OriginalMember(owner = "client", name = "Ge", descriptor = "[[I")
    public static final int[][] field243;

    @OriginalMember(owner = "client", name = "Le", descriptor = "I")
    private static int field248;

    @OriginalMember(owner = "client", name = "We", descriptor = "I")
    private static int field259;

    @OriginalMember(owner = "client", name = "Nf", descriptor = "Ljava/lang/String;")
    private static String field301;

    @OriginalMember(owner = "client", name = "ig", descriptor = "I")
    private static int field322;

    @OriginalMember(owner = "client", name = "Rh", descriptor = "I")
    private static int field409;

    @OriginalMember(owner = "client", name = "Th", descriptor = "Z")
    private static boolean field411;

    @OriginalMember(owner = "client", name = "Yh", descriptor = "Ljava/math/BigInteger;")
    private static BigInteger field416;

    @OriginalMember(owner = "client", name = "hi", descriptor = "[I")
    public static final int[] field425;

    @OriginalMember(owner = "client", name = "Ji", descriptor = "[I")
    private static int[] field453;

    @OriginalMember(owner = "client", name = "Tb", descriptor = "I")
    private int field100;

    @OriginalMember(owner = "client", name = "ic", descriptor = "I")
    private int field115;

    @OriginalMember(owner = "client", name = "kc", descriptor = "I")
    private int field117;

    @OriginalMember(owner = "client", name = "sc", descriptor = "I")
    private int field125;

    @OriginalMember(owner = "client", name = "tc", descriptor = "I")
    private int field126;

    @OriginalMember(owner = "client", name = "uc", descriptor = "I")
    private int field127;

    @OriginalMember(owner = "client", name = "vc", descriptor = "I")
    private int field128;

    @OriginalMember(owner = "client", name = "wc", descriptor = "I")
    private int field129;

    @OriginalMember(owner = "client", name = "yc", descriptor = "I")
    private int field131;

    @OriginalMember(owner = "client", name = "Bc", descriptor = "I")
    private int field134;

    @OriginalMember(owner = "client", name = "Cc", descriptor = "I")
    private int field135;

    @OriginalMember(owner = "client", name = "Ec", descriptor = "I")
    private static int field137;

    @OriginalMember(owner = "client", name = "Hc", descriptor = "I")
    private static int field140;

    @OriginalMember(owner = "client", name = "Ic", descriptor = "I")
    public int field141;

    @OriginalMember(owner = "client", name = "Jc", descriptor = "I")
    public int field142;

    @OriginalMember(owner = "client", name = "Lc", descriptor = "I")
    private static int field144;

    @OriginalMember(owner = "client", name = "Mc", descriptor = "I")
    private int field145;

    @OriginalMember(owner = "client", name = "Nc", descriptor = "I")
    private static int field146;

    @OriginalMember(owner = "client", name = "Oc", descriptor = "I")
    private int field147;

    @OriginalMember(owner = "client", name = "Yc", descriptor = "I")
    private int field157;

    @OriginalMember(owner = "client", name = "Zc", descriptor = "I")
    private int field158;

    @OriginalMember(owner = "client", name = "hd", descriptor = "I")
    private int field166;

    @OriginalMember(owner = "client", name = "kd", descriptor = "I")
    private static int field169;

    @OriginalMember(owner = "client", name = "od", descriptor = "I")
    private static int field173;

    @OriginalMember(owner = "client", name = "zd", descriptor = "I")
    private int field184;

    @OriginalMember(owner = "client", name = "Ad", descriptor = "I")
    private static int field185;

    @OriginalMember(owner = "client", name = "Cd", descriptor = "I")
    private int field187;

    @OriginalMember(owner = "client", name = "Id", descriptor = "I")
    private int field193;

    @OriginalMember(owner = "client", name = "Md", descriptor = "I")
    private int field197;

    @OriginalMember(owner = "client", name = "Nd", descriptor = "I")
    private static int field198;

    @OriginalMember(owner = "client", name = "Od", descriptor = "I")
    private int field199;

    @OriginalMember(owner = "client", name = "Pd", descriptor = "I")
    private int field200;

    @OriginalMember(owner = "client", name = "Sd", descriptor = "I")
    private int field203;

    @OriginalMember(owner = "client", name = "Zd", descriptor = "I")
    private int field210;

    @OriginalMember(owner = "client", name = "ae", descriptor = "I")
    private int field211;

    @OriginalMember(owner = "client", name = "be", descriptor = "I")
    private int field212;

    @OriginalMember(owner = "client", name = "ce", descriptor = "I")
    private int field213;

    @OriginalMember(owner = "client", name = "de", descriptor = "I")
    private int field214;

    @OriginalMember(owner = "client", name = "je", descriptor = "I")
    private int field220;

    @OriginalMember(owner = "client", name = "me", descriptor = "I")
    private int field223;

    @OriginalMember(owner = "client", name = "ne", descriptor = "I")
    private int field224;

    @OriginalMember(owner = "client", name = "oe", descriptor = "I")
    private int field225;

    @OriginalMember(owner = "client", name = "pe", descriptor = "I")
    private int field226;

    @OriginalMember(owner = "client", name = "se", descriptor = "I")
    private int field229;

    @OriginalMember(owner = "client", name = "ue", descriptor = "I")
    private int field231;

    @OriginalMember(owner = "client", name = "Fe", descriptor = "I")
    public static int field242;

    @OriginalMember(owner = "client", name = "Je", descriptor = "I")
    public static int field246;

    @OriginalMember(owner = "client", name = "Ke", descriptor = "I")
    private int field247;

    @OriginalMember(owner = "client", name = "Ne", descriptor = "I")
    private int field250;

    @OriginalMember(owner = "client", name = "Oe", descriptor = "I")
    private int field251;

    @OriginalMember(owner = "client", name = "Pe", descriptor = "I")
    private static int field252;

    @OriginalMember(owner = "client", name = "Te", descriptor = "I")
    private int field256;

    @OriginalMember(owner = "client", name = "Ue", descriptor = "I")
    private int field257;

    @OriginalMember(owner = "client", name = "df", descriptor = "I")
    private int field266;

    @OriginalMember(owner = "client", name = "ff", descriptor = "I")
    private int field268;

    @OriginalMember(owner = "client", name = "hf", descriptor = "I")
    private int field270;

    @OriginalMember(owner = "client", name = "kf", descriptor = "I")
    private int field272;

    @OriginalMember(owner = "client", name = "nf", descriptor = "I")
    private int field275;

    @OriginalMember(owner = "client", name = "of", descriptor = "I")
    private int field276;

    @OriginalMember(owner = "client", name = "pf", descriptor = "I")
    private int field277;

    @OriginalMember(owner = "client", name = "qf", descriptor = "I")
    private int field278;

    @OriginalMember(owner = "client", name = "rf", descriptor = "I")
    private int field279;

    @OriginalMember(owner = "client", name = "sf", descriptor = "I")
    private int field280;

    @OriginalMember(owner = "client", name = "tf", descriptor = "I")
    private int field281;

    @OriginalMember(owner = "client", name = "zf", descriptor = "I")
    private int field287;

    @OriginalMember(owner = "client", name = "Bf", descriptor = "I")
    private int field289;

    @OriginalMember(owner = "client", name = "Ff", descriptor = "I")
    private static int field293;

    @OriginalMember(owner = "client", name = "If", descriptor = "I")
    private int field296;

    @OriginalMember(owner = "client", name = "Kf", descriptor = "I")
    private int field298;

    @OriginalMember(owner = "client", name = "Lf", descriptor = "I")
    private int field299;

    @OriginalMember(owner = "client", name = "Of", descriptor = "I")
    private int field302;

    @OriginalMember(owner = "client", name = "Pf", descriptor = "I")
    private int field303;

    @OriginalMember(owner = "client", name = "Qf", descriptor = "I")
    private int field304;

    @OriginalMember(owner = "client", name = "Rf", descriptor = "I")
    private int field305;

    @OriginalMember(owner = "client", name = "Sf", descriptor = "I")
    private int field306;

    @OriginalMember(owner = "client", name = "Tf", descriptor = "I")
    private int field307;

    @OriginalMember(owner = "client", name = "jg", descriptor = "I")
    private int field323;

    @OriginalMember(owner = "client", name = "tg", descriptor = "I")
    private int field333;

    @OriginalMember(owner = "client", name = "ug", descriptor = "I")
    private int field334;

    @OriginalMember(owner = "client", name = "vg", descriptor = "I")
    private int field335;

    @OriginalMember(owner = "client", name = "wg", descriptor = "I")
    private int field336;

    @OriginalMember(owner = "client", name = "xg", descriptor = "I")
    private int field337;

    @OriginalMember(owner = "client", name = "Eg", descriptor = "I")
    private int field344;

    @OriginalMember(owner = "client", name = "Gg", descriptor = "I")
    private static int field346;

    @OriginalMember(owner = "client", name = "Jg", descriptor = "I")
    private static int field349;

    @OriginalMember(owner = "client", name = "Kg", descriptor = "I")
    private int field350;

    @OriginalMember(owner = "client", name = "Lg", descriptor = "I")
    private int field351;

    @OriginalMember(owner = "client", name = "Mg", descriptor = "I")
    private int field352;

    @OriginalMember(owner = "client", name = "Ng", descriptor = "I")
    private int field353;

    @OriginalMember(owner = "client", name = "Og", descriptor = "I")
    private int field354;

    @OriginalMember(owner = "client", name = "Pg", descriptor = "I")
    private int field355;

    @OriginalMember(owner = "client", name = "Zg", descriptor = "I")
    private int field365;

    @OriginalMember(owner = "client", name = "ah", descriptor = "I")
    private int field366;

    @OriginalMember(owner = "client", name = "bh", descriptor = "I")
    private int field367;

    @OriginalMember(owner = "client", name = "dh", descriptor = "I")
    private int field369;

    @OriginalMember(owner = "client", name = "fh", descriptor = "I")
    private int field371;

    @OriginalMember(owner = "client", name = "lh", descriptor = "I")
    private int field377;

    @OriginalMember(owner = "client", name = "mh", descriptor = "I")
    private int field378;

    @OriginalMember(owner = "client", name = "nh", descriptor = "I")
    private int field379;

    @OriginalMember(owner = "client", name = "oh", descriptor = "I")
    private int field380;

    @OriginalMember(owner = "client", name = "ph", descriptor = "I")
    private int field381;

    @OriginalMember(owner = "client", name = "qh", descriptor = "I")
    private int field382;

    @OriginalMember(owner = "client", name = "rh", descriptor = "I")
    private int field383;

    @OriginalMember(owner = "client", name = "K", descriptor = "I")
    private int field39;

    @OriginalMember(owner = "client", name = "Ch", descriptor = "I")
    private int field394;

    @OriginalMember(owner = "client", name = "Dh", descriptor = "I")
    private int field395;

    @OriginalMember(owner = "client", name = "Fh", descriptor = "I")
    private int field397;

    @OriginalMember(owner = "client", name = "Gh", descriptor = "I")
    private int field398;

    @OriginalMember(owner = "client", name = "L", descriptor = "I")
    private int field40;

    @OriginalMember(owner = "client", name = "Ih", descriptor = "I")
    private static int field400;

    @OriginalMember(owner = "client", name = "Lh", descriptor = "I")
    private int field403;

    @OriginalMember(owner = "client", name = "Nh", descriptor = "I")
    private static int field405;

    @OriginalMember(owner = "client", name = "M", descriptor = "I")
    private int field41;

    @OriginalMember(owner = "client", name = "Sh", descriptor = "I")
    public static int field410;

    @OriginalMember(owner = "client", name = "Wh", descriptor = "I")
    private int field414;

    @OriginalMember(owner = "client", name = "Zh", descriptor = "I")
    private int field417;

    @OriginalMember(owner = "client", name = "bi", descriptor = "I")
    private int field419;

    @OriginalMember(owner = "client", name = "N", descriptor = "I")
    private int field42;

    @OriginalMember(owner = "client", name = "ki", descriptor = "I")
    private int field428;

    @OriginalMember(owner = "client", name = "O", descriptor = "I")
    private int field43;

    @OriginalMember(owner = "client", name = "mi", descriptor = "I")
    private int field430;

    @OriginalMember(owner = "client", name = "ni", descriptor = "I")
    private int field431;

    @OriginalMember(owner = "client", name = "qi", descriptor = "I")
    private int field434;

    @OriginalMember(owner = "client", name = "ri", descriptor = "I")
    public int field435;

    @OriginalMember(owner = "client", name = "si", descriptor = "I")
    private int field436;

    @OriginalMember(owner = "client", name = "ui", descriptor = "I")
    private int field438;

    @OriginalMember(owner = "client", name = "vi", descriptor = "I")
    private int field439;

    @OriginalMember(owner = "client", name = "P", descriptor = "I")
    private int field44;

    @OriginalMember(owner = "client", name = "wi", descriptor = "I")
    private int field440;

    @OriginalMember(owner = "client", name = "xi", descriptor = "I")
    private int field441;

    @OriginalMember(owner = "client", name = "yi", descriptor = "I")
    private int field442;

    @OriginalMember(owner = "client", name = "Bi", descriptor = "I")
    private int field445;

    @OriginalMember(owner = "client", name = "Di", descriptor = "I")
    private int field447;

    @OriginalMember(owner = "client", name = "Ei", descriptor = "I")
    private int field448;

    @OriginalMember(owner = "client", name = "Q", descriptor = "I")
    private int field45;

    @OriginalMember(owner = "client", name = "Gi", descriptor = "I")
    private int field450;

    @OriginalMember(owner = "client", name = "Ii", descriptor = "I")
    private int field452;

    @OriginalMember(owner = "client", name = "Ki", descriptor = "I")
    private static int field454;

    @OriginalMember(owner = "client", name = "Oi", descriptor = "I")
    private int field458;

    @OriginalMember(owner = "client", name = "Pi", descriptor = "I")
    private int field459;

    @OriginalMember(owner = "client", name = "cj", descriptor = "I")
    private int field472;

    @OriginalMember(owner = "client", name = "dj", descriptor = "I")
    private int field473;

    @OriginalMember(owner = "client", name = "ej", descriptor = "I")
    private int field474;

    @OriginalMember(owner = "client", name = "qj", descriptor = "I")
    private int field486;

    @OriginalMember(owner = "client", name = "rj", descriptor = "I")
    private int field487;

    @OriginalMember(owner = "client", name = "tj", descriptor = "I")
    private static int field489;

    @OriginalMember(owner = "client", name = "vj", descriptor = "I")
    private int field491;

    @OriginalMember(owner = "client", name = "Aj", descriptor = "I")
    private int field496;

    @OriginalMember(owner = "client", name = "Dj", descriptor = "I")
    private int field499;

    @OriginalMember(owner = "client", name = "Ej", descriptor = "I")
    private static int field500;

    @OriginalMember(owner = "client", name = "Fj", descriptor = "I")
    private int field501;

    @OriginalMember(owner = "client", name = "Gj", descriptor = "I")
    private int field502;

    @OriginalMember(owner = "client", name = "Ij", descriptor = "I")
    private int field504;

    @OriginalMember(owner = "client", name = "Nj", descriptor = "I")
    private int field509;

    @OriginalMember(owner = "client", name = "Rj", descriptor = "I")
    private int field513;

    @OriginalMember(owner = "client", name = "Wj", descriptor = "I")
    private static int field518;

    @OriginalMember(owner = "client", name = "Zj", descriptor = "I")
    public static int field521;

    @OriginalMember(owner = "client", name = "Z", descriptor = "I")
    private int field54;

    @OriginalMember(owner = "client", name = "ab", descriptor = "I")
    private int field55;

    @OriginalMember(owner = "client", name = "bb", descriptor = "I")
    private int field56;

    @OriginalMember(owner = "client", name = "cb", descriptor = "I")
    private int field57;

    @OriginalMember(owner = "client", name = "eb", descriptor = "I")
    private int field59;

    @OriginalMember(owner = "client", name = "ib", descriptor = "I")
    private int field63;

    @OriginalMember(owner = "client", name = "tb", descriptor = "I")
    private int field74;

    @OriginalMember(owner = "client", name = "wb", descriptor = "I")
    private int field77;

    @OriginalMember(owner = "client", name = "Ab", descriptor = "I")
    private int field81;

    @OriginalMember(owner = "client", name = "Bb", descriptor = "I")
    private int field82;

    @OriginalMember(owner = "client", name = "Cb", descriptor = "I")
    private int field83;

    @OriginalMember(owner = "client", name = "Db", descriptor = "I")
    private int field84;

    @OriginalMember(owner = "client", name = "Eb", descriptor = "I")
    private static int field85;

    @OriginalMember(owner = "client", name = "Pb", descriptor = "I")
    private int field96;

    @OriginalMember(owner = "client", name = "gc", descriptor = "J")
    private long field113;

    @OriginalMember(owner = "client", name = "Xf", descriptor = "J")
    public long field311;

    @OriginalMember(owner = "client", name = "Kh", descriptor = "J")
    private long field402;

    @OriginalMember(owner = "client", name = "pi", descriptor = "J")
    private long field433;

    @OriginalMember(owner = "client", name = "ti", descriptor = "J")
    private long field437;

    @OriginalMember(owner = "client", name = "Gd", descriptor = "LDUMEPGRH;")
    private class10 field191;

    @OriginalMember(owner = "client", name = "Hd", descriptor = "LDUMEPGRH;")
    private class10 field192;

    @OriginalMember(owner = "client", name = "ee", descriptor = "LDUMEPGRH;")
    private class10 field215;

    @OriginalMember(owner = "client", name = "vf", descriptor = "LDUMEPGRH;")
    private class10 field283;

    @OriginalMember(owner = "client", name = "Mf", descriptor = "LDUMEPGRH;")
    private class10 field300;

    @OriginalMember(owner = "client", name = "Bg", descriptor = "LDUMEPGRH;")
    private class10 field341;

    @OriginalMember(owner = "client", name = "Cg", descriptor = "LDUMEPGRH;")
    private class10 field342;

    @OriginalMember(owner = "client", name = "kj", descriptor = "LDUMEPGRH;")
    private class10 field480;

    @OriginalMember(owner = "client", name = "lj", descriptor = "LDUMEPGRH;")
    private class10 field481;

    @OriginalMember(owner = "client", name = "mj", descriptor = "LDUMEPGRH;")
    private class10 field482;

    @OriginalMember(owner = "client", name = "nj", descriptor = "LDUMEPGRH;")
    private class10 field483;

    @OriginalMember(owner = "client", name = "oj", descriptor = "LDUMEPGRH;")
    private class10 field484;

    @OriginalMember(owner = "client", name = "Rb", descriptor = "LDUMEPGRH;")
    private class10 field98;

    @OriginalMember(owner = "client", name = "Sb", descriptor = "LDUMEPGRH;")
    private class10 field99;

    @OriginalMember(owner = "client", name = "uf", descriptor = "LEDOAEAIN;")
    private class13 field282;

    @OriginalMember(owner = "client", name = "xh", descriptor = "LEYHVDWTF;")
    private class19 field389;

    @OriginalMember(owner = "client", name = "yh", descriptor = "LEYHVDWTF;")
    private class19 field390;

    @OriginalMember(owner = "client", name = "zh", descriptor = "LEYHVDWTF;")
    private class19 field391;

    @OriginalMember(owner = "client", name = "Ah", descriptor = "LEYHVDWTF;")
    private class19 field392;

    @OriginalMember(owner = "client", name = "zc", descriptor = "LAHUILQJH;")
    public static class1 field132;

    @OriginalMember(owner = "client", name = "Zb", descriptor = "LGLPUEKVZ;")
    private class23 field106;

    @OriginalMember(owner = "client", name = "Tj", descriptor = "LJHNSGCOV;")
    public class31 field515;

    @OriginalMember(owner = "client", name = "Fi", descriptor = "LKUQMNLGP;")
    private class33 field449;

    @OriginalMember(owner = "client", name = "lc", descriptor = "LLKEIRLLI;")
    private class35 field118;

    @OriginalMember(owner = "client", name = "mc", descriptor = "LLKEIRLLI;")
    private class35 field119;

    @OriginalMember(owner = "client", name = "nc", descriptor = "LLKEIRLLI;")
    private class35 field120;

    @OriginalMember(owner = "client", name = "oc", descriptor = "LLKEIRLLI;")
    private class35 field121;

    @OriginalMember(owner = "client", name = "pc", descriptor = "LLKEIRLLI;")
    private class35 field122;

    @OriginalMember(owner = "client", name = "Be", descriptor = "LLKEIRLLI;")
    private class35 field238;

    @OriginalMember(owner = "client", name = "Ce", descriptor = "LLKEIRLLI;")
    private class35 field239;

    @OriginalMember(owner = "client", name = "De", descriptor = "LLKEIRLLI;")
    private class35 field240;

    @OriginalMember(owner = "client", name = "Yf", descriptor = "LLKEIRLLI;")
    private class35 field312;

    @OriginalMember(owner = "client", name = "Zf", descriptor = "LLKEIRLLI;")
    private class35 field313;

    @OriginalMember(owner = "client", name = "ag", descriptor = "LLKEIRLLI;")
    private class35 field314;

    @OriginalMember(owner = "client", name = "bg", descriptor = "LLKEIRLLI;")
    private class35 field315;

    @OriginalMember(owner = "client", name = "cg", descriptor = "LLKEIRLLI;")
    private class35 field316;

    @OriginalMember(owner = "client", name = "qg", descriptor = "LLKEIRLLI;")
    private class35 field330;

    @OriginalMember(owner = "client", name = "rg", descriptor = "LLKEIRLLI;")
    private class35 field331;

    @OriginalMember(owner = "client", name = "Vg", descriptor = "LLKEIRLLI;")
    private class35 field361;

    @OriginalMember(owner = "client", name = "Wg", descriptor = "LLKEIRLLI;")
    private class35 field362;

    @OriginalMember(owner = "client", name = "T", descriptor = "LLKEIRLLI;")
    private class35 field48;

    @OriginalMember(owner = "client", name = "U", descriptor = "LLKEIRLLI;")
    private class35 field49;

    @OriginalMember(owner = "client", name = "V", descriptor = "LLKEIRLLI;")
    private class35 field50;

    @OriginalMember(owner = "client", name = "ze", descriptor = "LSPZBTZXL;")
    private class51 field236;

    @OriginalMember(owner = "client", name = "lg", descriptor = "LTWKZMYGD;")
    private class55 field325;

    @OriginalMember(owner = "client", name = "mg", descriptor = "LTWKZMYGD;")
    private class55 field326;

    @OriginalMember(owner = "client", name = "ng", descriptor = "LTWKZMYGD;")
    private class55 field327;

    @OriginalMember(owner = "client", name = "Qi", descriptor = "LTWKZMYGD;")
    private class55 field460;

    @OriginalMember(owner = "client", name = "Ri", descriptor = "LTWKZMYGD;")
    private class55 field461;

    @OriginalMember(owner = "client", name = "Si", descriptor = "LTWKZMYGD;")
    private class55 field462;

    @OriginalMember(owner = "client", name = "Ti", descriptor = "LTWKZMYGD;")
    private class55 field463;

    @OriginalMember(owner = "client", name = "Ui", descriptor = "LTWKZMYGD;")
    private class55 field464;

    @OriginalMember(owner = "client", name = "Vi", descriptor = "LTWKZMYGD;")
    private class55 field465;

    @OriginalMember(owner = "client", name = "Wi", descriptor = "LTWKZMYGD;")
    private class55 field466;

    @OriginalMember(owner = "client", name = "Xi", descriptor = "LTWKZMYGD;")
    private class55 field467;

    @OriginalMember(owner = "client", name = "Yi", descriptor = "LTWKZMYGD;")
    private class55 field468;

    @OriginalMember(owner = "client", name = "jb", descriptor = "LTWKZMYGD;")
    private class55 field64;

    @OriginalMember(owner = "client", name = "kb", descriptor = "LTWKZMYGD;")
    private class55 field65;

    @OriginalMember(owner = "client", name = "lb", descriptor = "LTWKZMYGD;")
    private class55 field66;

    @OriginalMember(owner = "client", name = "mb", descriptor = "LTWKZMYGD;")
    private class55 field67;

    @OriginalMember(owner = "client", name = "nb", descriptor = "LTWKZMYGD;")
    private class55 field68;

    @OriginalMember(owner = "client", name = "ob", descriptor = "LTWKZMYGD;")
    private class55 field69;

    @OriginalMember(owner = "client", name = "pb", descriptor = "LTWKZMYGD;")
    private class55 field70;

    @OriginalMember(owner = "client", name = "qb", descriptor = "LTWKZMYGD;")
    private class55 field71;

    @OriginalMember(owner = "client", name = "rb", descriptor = "LTWKZMYGD;")
    private class55 field72;

    @OriginalMember(owner = "client", name = "Ib", descriptor = "LTWKZMYGD;")
    private class55 field89;

    @OriginalMember(owner = "client", name = "Jb", descriptor = "LTWKZMYGD;")
    private class55 field90;

    @OriginalMember(owner = "client", name = "Kb", descriptor = "LTWKZMYGD;")
    private class55 field91;

    @OriginalMember(owner = "client", name = "Lb", descriptor = "LTWKZMYGD;")
    private class55 field92;

    @OriginalMember(owner = "client", name = "pd", descriptor = "LDLDGGHZP;")
    private class7 field174;

    @OriginalMember(owner = "client", name = "R", descriptor = "Ljava/lang/String;")
    public String field46;

    @OriginalMember(owner = "client", name = "Jj", descriptor = "Ljava/lang/String;")
    private String field505;

    @OriginalMember(owner = "client", name = "db", descriptor = "Ljava/lang/String;")
    public String field58;

    @OriginalMember(owner = "client", name = "vb", descriptor = "Ljava/lang/String;")
    private String field76;

    @OriginalMember(owner = "client", name = "Me", descriptor = "Ljava/net/Socket;")
    private Socket field249;

    @OriginalMember(owner = "client", name = "Kc", descriptor = "Z")
    private static boolean field143;

    @OriginalMember(owner = "client", name = "re", descriptor = "Z")
    public static boolean field228;

    @OriginalMember(owner = "client", name = "xe", descriptor = "Z")
    public static boolean field234;

    @OriginalMember(owner = "client", name = "Uh", descriptor = "Z")
    private static boolean field412;

    @OriginalMember(owner = "client", name = "Zi", descriptor = "Z")
    private static boolean field469;

    @OriginalMember(owner = "client", name = "ad", descriptor = "[I")
    private int[] field159;

    @OriginalMember(owner = "client", name = "bd", descriptor = "[I")
    private int[] field160;

    @OriginalMember(owner = "client", name = "vd", descriptor = "[I")
    private int[] field180;

    @OriginalMember(owner = "client", name = "wd", descriptor = "[I")
    private int[] field181;

    @OriginalMember(owner = "client", name = "xd", descriptor = "[I")
    private int[] field182;

    @OriginalMember(owner = "client", name = "yd", descriptor = "[I")
    private int[] field183;

    @OriginalMember(owner = "client", name = "ge", descriptor = "[I")
    private int[] field217;

    @OriginalMember(owner = "client", name = "he", descriptor = "[I")
    private int[] field218;

    @OriginalMember(owner = "client", name = "ie", descriptor = "[I")
    private int[] field219;

    @OriginalMember(owner = "client", name = "sh", descriptor = "[I")
    private int[] field384;

    @OriginalMember(owner = "client", name = "th", descriptor = "[I")
    private int[] field385;

    @OriginalMember(owner = "client", name = "uh", descriptor = "[I")
    private int[] field386;

    @OriginalMember(owner = "client", name = "Pj", descriptor = "[I")
    private int[] field511;

    @OriginalMember(owner = "client", name = "Qj", descriptor = "[I")
    private int[] field512;

    @OriginalMember(owner = "client", name = "Dg", descriptor = "[LLKEIRLLI;")
    private class35[] field343;

    @OriginalMember(owner = "client", name = "ld", descriptor = "[[B")
    private byte[][] field170;

    @OriginalMember(owner = "client", name = "xj", descriptor = "[[B")
    private byte[][] field493;

    @OriginalMember(owner = "client", name = "jj", descriptor = "[[[B")
    private byte[][][] field479;

    @OriginalMember(owner = "client", name = "Ef", descriptor = "[[[I")
    private int[][][] field292;

    @OriginalMember(owner = "client", name = "c", descriptor = "(I)V")
    public final void method10(int arg0) {
        this.field330 = new class35(this.field236, "titlebox", 0);
        this.field331 = new class35(this.field236, "titlebutton", 0);
        this.field343 = new class35[12];
        int var2 = 0;
        if (arg0 < 7 || arg0 > 7) {
            this.field439 = -1;
        }
        try {
            var2 = Integer.parseInt(this.getParameter("fl_icon"));
        } catch (Exception var19) {
        }
        if (var2 == 0) {
            for (int var3 = 0; var3 < 12; ++var3) {
                this.field343[var3] = new class35(this.field236, "runes", var3);
            }
        } else {
            for (int var4 = 0; var4 < 12; ++var4) {
                this.field343[var4] = new class35(this.field236, "runes", (var4 & 3) + 12);
            }
        }
        this.field341 = new class10(128, 265);
        this.field342 = new class10(128, 265);
        for (int var5 = 0; var5 < 33920; ++var5) {
            this.field341.field631[var5] = this.field463.field1362[var5];
        }
        for (int var6 = 0; var6 < 33920; ++var6) {
            this.field342.field631[var6] = this.field464.field1362[var6];
        }
        this.field181 = new int[256];
        for (int var7 = 0; var7 < 64; ++var7) {
            this.field181[var7] = var7 * 262144;
        }
        for (int var8 = 0; var8 < 64; ++var8) {
            this.field181[var8 + 64] = var8 * 1024 + 16711680;
        }
        for (int var9 = 0; var9 < 64; ++var9) {
            this.field181[var9 + 128] = var9 * 4 + 16776960;
        }
        for (int var10 = 0; var10 < 64; ++var10) {
            this.field181[var10 + 192] = 16777215;
        }
        this.field182 = new int[256];
        for (int var11 = 0; var11 < 64; ++var11) {
            this.field182[var11] = var11 * 1024;
        }
        for (int var12 = 0; var12 < 64; ++var12) {
            this.field182[var12 + 64] = var12 * 4 + 65280;
        }
        for (int var13 = 0; var13 < 64; ++var13) {
            this.field182[var13 + 128] = var13 * 262144 + 65535;
        }
        for (int var14 = 0; var14 < 64; ++var14) {
            this.field182[var14 + 192] = 16777215;
        }
        this.field183 = new int[256];
        for (int var15 = 0; var15 < 64; ++var15) {
            this.field183[var15] = var15 * 4;
        }
        for (int var16 = 0; var16 < 64; ++var16) {
            this.field183[var16 + 64] = var16 * 262144 + 255;
        }
        for (int var17 = 0; var17 < 64; ++var17) {
            this.field183[var17 + 128] = var17 * 1024 + 16711935;
        }
        for (int var18 = 0; var18 < 64; ++var18) {
            this.field183[var18 + 192] = 16777215;
        }
        this.field180 = new int[256];
        this.field511 = new int[32768];
        this.field512 = new int[32768];
        this.method126(5, (class35) null);
        this.field159 = new int[32768];
        this.field160 = new int[32768];
        this.method23(0, "Connecting to fileserver", 10);
        if (!this.field401) {
            this.field109 = true;
            this.field401 = true;
            this.method64(this, 2);
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(B)V")
    public final void method11(byte arg0) {
        if (arg0 != -90) {
            this.field439 = -1;
        }
        if (!this.field51 && !this.field94 && !this.field216) {
            ++field242;
            if (!this.field321) {
                this.method66(false, false);
            } else {
                this.method33(49857);
            }
            this.field428 = 0;
        } else {
            this.method12(-995);
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(I)V")
    public final void method12(int arg0) {
        Graphics var2 = this.method71(field322).getGraphics();
        var2.setColor(Color.black);
        while (arg0 >= 0) {
            for (int var5 = 1; var5 > 0; ++var5) {
            }
        }
        var2.fillRect(0, 0, 765, 503);
        this.method371(1, -410);
        if (this.field94) {
            this.field401 = false;
            var2.setFont(new Font("Helvetica", 1, 16));
            var2.setColor(Color.yellow);
            byte var3 = 35;
            var2.drawString("Sorry, an error has occured whilst loading RuneScape", 30, var3);
            int var6 = var3 + 50;
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
        if (this.field216) {
            this.field401 = false;
            var2.setFont(new Font("Helvetica", 1, 20));
            var2.setColor(Color.white);
            var2.drawString("Error - unable to load game!", 50, 50);
            var2.drawString("To play RuneScape make sure you play from", 50, 100);
            var2.drawString("http://www.runescape.com", 50, 150);
        }
        if (this.field51) {
            this.field401 = false;
            var2.setColor(Color.yellow);
            byte var4 = 35;
            var2.drawString("Error a copy of RuneScape already appears to be loaded", 30, var4);
            int var10 = var4 + 50;
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

    @OriginalMember(owner = "client", name = "d", descriptor = "(B)V")
    public final void method13(byte arg0) {
        if (this.field442 > 0) {
            this.method74((byte) -10);
        } else {
            this.field91.method529(false);
            if (arg0 != 37) {
                this.field221 = !this.field221;
            }
            this.field390.method253("Connection lost", 257, 144, 0, this.field264);
            this.field390.method253("Connection lost", 256, 143, 16777215, this.field264);
            this.field390.method253("Please wait - attempting to reestablish", 257, 159, 0, this.field264);
            this.field390.method253("Please wait - attempting to reestablish", 256, 158, 16777215, this.field264);
            this.field91.method530((byte) 9, 4, 4, super.field964);
            this.field59 = 0;
            this.field298 = 0;
            class13 var2 = this.field282;
            this.field321 = false;
            this.field486 = 0;
            this.method77(this.field103, this.field104, true);
            if (!this.field321) {
                this.method74((byte) -10);
            }
            try {
                var2.method227();
            } catch (Exception var3) {
            }
        }
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(I)V")
    public final void method14(int arg0) {
        if (arg0 <= 0) {
            this.field329.method392(117);
        }
        this.field369 = 0;
        int var2 = (field132.field1643 >> 7) + this.field223;
        int var3 = (field132.field1644 >> 7) + this.field224;
        if (var2 >= 3053 && var2 <= 3156 && var3 >= 3056 && var3 <= 3136) {
            this.field369 = 1;
        }
        if (var2 >= 3072 && var2 <= 3118 && var3 >= 9492 && var3 <= 9535) {
            this.field369 = 1;
        }
        if (this.field369 == 1 && var2 >= 3139 && var2 <= 3199 && var3 >= 3008 && var3 <= 3062) {
            this.field369 = 0;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILULLVQOAK;)V")
    public final void method15(int arg0, class58 arg1) {
        if (arg0 != 0) {
            this.field420 = null;
        }
        int var3 = arg1.field1422;
        if ((var3 < 1 || var3 > 100) && (var3 < 701 || var3 > 800)) {
            if (var3 >= 101 && var3 <= 200 || var3 >= 801 && var3 <= 900) {
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
                    arg1.field1445 = "";
                    arg1.field1411 = 0;
                } else {
                    if (this.field110[var3] == 0) {
                        arg1.field1445 = "@red@Offline";
                    } else if (this.field110[var3] == field409) {
                        arg1.field1445 = "@gre@World-" + (this.field110[var3] - 9);
                    } else {
                        arg1.field1445 = "@yel@World-" + (this.field110[var3] - 9);
                    }
                    arg1.field1411 = 1;
                }
            } else if (var3 == 203) {
                int var6 = this.field447;
                if (this.field448 != 2) {
                    var6 = 0;
                }
                arg1.field1401 = var6 * 15 + 20;
                if (arg1.field1401 <= arg1.field1452) {
                    arg1.field1401 = arg1.field1452 + 1;
                }
            } else if (var3 >= 401 && var3 <= 500) {
                var3 -= 401;
                if (var3 == 0 && this.field448 == 0) {
                    arg1.field1445 = "Loading ignore list";
                    arg1.field1411 = 0;
                } else if (var3 == 1 && this.field448 == 0) {
                    arg1.field1445 = "Please wait...";
                    arg1.field1411 = 0;
                } else {
                    int var7 = this.field251;
                    if (this.field448 == 0) {
                        var7 = 0;
                    }
                    if (var3 >= var7) {
                        arg1.field1445 = "";
                        arg1.field1411 = 0;
                    } else {
                        arg1.field1445 = class20.method272(false, class20.method269(this.field339[var3], -898));
                        arg1.field1411 = 1;
                    }
                }
            } else if (var3 == 503) {
                arg1.field1401 = this.field251 * 15 + 20;
                if (arg1.field1401 <= arg1.field1452) {
                    arg1.field1401 = arg1.field1452 + 1;
                }
            } else if (var3 == 327) {
                arg1.field1416 = 150;
                arg1.field1417 = (int) (Math.sin((double) field246 / 40.0D) * 256.0D) & 2047;
                if (this.field375) {
                    for (int var8 = 0; var8 < 7; ++var8) {
                        int var15 = this.field510[var8];
                        if (var15 >= 0 && !class68.field1633[var15].method570(-852)) {
                            return;
                        }
                    }
                    this.field375 = false;
                    class27[] var9 = new class27[7];
                    int var10 = 0;
                    for (int var11 = 0; var11 < 7; ++var11) {
                        int var14 = this.field510[var11];
                        if (var14 >= 0) {
                            var9[var10++] = class68.field1633[var14].method571(173);
                        }
                    }
                    class27 var12 = new class27((byte) 6, var10, var9);
                    for (int var13 = 0; var13 < 5; ++var13) {
                        if (this.field102[var13] != 0) {
                            var12.method336(field243[var13][0], field243[var13][this.field102[var13]]);
                            if (var13 == 1) {
                                var12.method336(field425[0], field425[this.field102[var13]]);
                            }
                        }
                    }
                    var12.method329(true);
                    var12.method330(class66.field1608[field132.field1654].field1610[0], 0);
                    var12.method339(64, 850, -30, -50, -30, true);
                    arg1.field1429 = 5;
                    arg1.field1430 = 0;
                    class58.method541(var12, 5, (byte) 2, 0);
                }
            } else if (var3 == 324) {
                if (this.field98 == null) {
                    this.field98 = arg1.field1443;
                    this.field99 = arg1.field1424;
                }
                if (this.field399) {
                    arg1.field1443 = this.field99;
                } else {
                    arg1.field1443 = this.field98;
                }
            } else if (var3 == 325) {
                if (this.field98 == null) {
                    this.field98 = arg1.field1443;
                    this.field99 = arg1.field1424;
                }
                if (this.field399) {
                    arg1.field1443 = this.field98;
                } else {
                    arg1.field1443 = this.field99;
                }
            } else if (var3 == 600) {
                arg1.field1445 = this.field107;
                if (field246 % 20 < 10) {
                    arg1.field1445 = arg1.field1445 + "|";
                } else {
                    arg1.field1445 = arg1.field1445 + " ";
                }
            } else {
                if (var3 == 613) {
                    if (this.field145 >= 1) {
                        if (this.field514) {
                            arg1.field1402 = 16711680;
                            arg1.field1445 = "Moderator option: Mute player for 48 hours: <ON>";
                        } else {
                            arg1.field1402 = 16777215;
                            arg1.field1445 = "Moderator option: Mute player for 48 hours: <OFF>";
                        }
                    } else {
                        arg1.field1445 = "";
                    }
                }
                if (var3 == 650 || var3 == 655) {
                    if (this.field268 != 0) {
                        String var16;
                        if (this.field220 == 0) {
                            var16 = "earlier today";
                        } else if (this.field220 == 1) {
                            var16 = "yesterday";
                        } else {
                            var16 = this.field220 + " days ago";
                        }
                        arg1.field1445 = "You last logged in " + var16 + " from: " + signlink.dns;
                    } else {
                        arg1.field1445 = "";
                    }
                }
                if (var3 == 651) {
                    if (this.field247 == 0) {
                        arg1.field1445 = "0 unread messages";
                        arg1.field1402 = 16776960;
                    }
                    if (this.field247 == 1) {
                        arg1.field1445 = "1 unread message";
                        arg1.field1402 = 65280;
                    }
                    if (this.field247 > 1) {
                        arg1.field1445 = this.field247 + " unread messages";
                        arg1.field1402 = 65280;
                    }
                }
                if (var3 == 652) {
                    if (this.field296 == 201) {
                        if (this.field501 == 1) {
                            arg1.field1445 = "@yel@This is a non-members world: @whi@Since you are a member we";
                        } else {
                            arg1.field1445 = "";
                        }
                    } else if (this.field296 == 200) {
                        arg1.field1445 = "You have not yet set any password recovery questions.";
                    } else {
                        String var17;
                        if (this.field296 == 0) {
                            var17 = "Earlier today";
                        } else if (this.field296 == 1) {
                            var17 = "Yesterday";
                        } else {
                            var17 = this.field296 + " days ago";
                        }
                        arg1.field1445 = var17 + " you changed your recovery questions";
                    }
                }
                if (var3 == 653) {
                    if (this.field296 == 201) {
                        if (this.field501 == 1) {
                            arg1.field1445 = "@whi@recommend you use a members world instead. You may use";
                        } else {
                            arg1.field1445 = "";
                        }
                    } else if (this.field296 == 200) {
                        arg1.field1445 = "We strongly recommend you do so now to secure your account.";
                    } else {
                        arg1.field1445 = "If you do not remember making this change then cancel it immediately";
                    }
                }
                if (var3 == 654) {
                    if (this.field296 == 201) {
                        if (this.field501 == 1) {
                            arg1.field1445 = "@whi@this world but member benefits are unavailable whilst here.";
                        } else {
                            arg1.field1445 = "";
                        }
                    } else if (this.field296 == 200) {
                        arg1.field1445 = "Do this from the 'account management' area on our front webpage";
                    } else {
                        arg1.field1445 = "Do this from the 'account management' area on our front webpage";
                    }
                }
            }
        } else if (var3 == 1 && this.field448 == 0) {
            arg1.field1445 = "Loading friend list";
            arg1.field1411 = 0;
        } else if (var3 == 1 && this.field448 == 1) {
            arg1.field1445 = "Connecting to friendserver";
            arg1.field1411 = 0;
        } else if (var3 == 2 && this.field448 != 2) {
            arg1.field1445 = "Please wait...";
            arg1.field1411 = 0;
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
                arg1.field1445 = "";
                arg1.field1411 = 0;
            } else {
                arg1.field1445 = this.field194[var3];
                arg1.field1411 = 1;
            }
        }
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(I)V")
    public final void method16(int arg0) {
        if (arg0 != 33812) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        if (super.field978 == 1) {
            if (super.field979 >= 539 && super.field979 <= 573 && super.field980 >= 169 && super.field980 < 205 && this.field376[0] != -1) {
                this.field177 = true;
                this.field356 = 0;
                this.field136 = true;
            }
            if (super.field979 >= 569 && super.field979 <= 599 && super.field980 >= 168 && super.field980 < 205 && this.field376[1] != -1) {
                this.field177 = true;
                this.field356 = 1;
                this.field136 = true;
            }
            if (super.field979 >= 597 && super.field979 <= 627 && super.field980 >= 168 && super.field980 < 205 && this.field376[2] != -1) {
                this.field177 = true;
                this.field356 = 2;
                this.field136 = true;
            }
            if (super.field979 >= 625 && super.field979 <= 669 && super.field980 >= 168 && super.field980 < 203 && this.field376[3] != -1) {
                this.field177 = true;
                this.field356 = 3;
                this.field136 = true;
            }
            if (super.field979 >= 666 && super.field979 <= 696 && super.field980 >= 168 && super.field980 < 205 && this.field376[4] != -1) {
                this.field177 = true;
                this.field356 = 4;
                this.field136 = true;
            }
            if (super.field979 >= 694 && super.field979 <= 724 && super.field980 >= 168 && super.field980 < 205 && this.field376[5] != -1) {
                this.field177 = true;
                this.field356 = 5;
                this.field136 = true;
            }
            if (super.field979 >= 722 && super.field979 <= 756 && super.field980 >= 169 && super.field980 < 205 && this.field376[6] != -1) {
                this.field177 = true;
                this.field356 = 6;
                this.field136 = true;
            }
            if (super.field979 >= 540 && super.field979 <= 574 && super.field980 >= 466 && super.field980 < 502 && this.field376[7] != -1) {
                this.field177 = true;
                this.field356 = 7;
                this.field136 = true;
            }
            if (super.field979 >= 572 && super.field979 <= 602 && super.field980 >= 466 && super.field980 < 503 && this.field376[8] != -1) {
                this.field177 = true;
                this.field356 = 8;
                this.field136 = true;
            }
            if (super.field979 >= 599 && super.field979 <= 629 && super.field980 >= 466 && super.field980 < 503 && this.field376[9] != -1) {
                this.field177 = true;
                this.field356 = 9;
                this.field136 = true;
            }
            if (super.field979 >= 627 && super.field979 <= 671 && super.field980 >= 467 && super.field980 < 502 && this.field376[10] != -1) {
                this.field177 = true;
                this.field356 = 10;
                this.field136 = true;
            }
            if (super.field979 >= 669 && super.field979 <= 699 && super.field980 >= 466 && super.field980 < 503 && this.field376[11] != -1) {
                this.field177 = true;
                this.field356 = 11;
                this.field136 = true;
            }
            if (super.field979 >= 696 && super.field979 <= 726 && super.field980 >= 466 && super.field980 < 503 && this.field376[12] != -1) {
                this.field177 = true;
                this.field356 = 12;
                this.field136 = true;
            }
            if (super.field979 >= 724 && super.field979 <= 758 && super.field980 >= 466 && super.field980 < 502 && this.field376[13] != -1) {
                this.field177 = true;
                this.field356 = 13;
                this.field136 = true;
            }
            ++field185;
            if (field185 > 184) {
                field185 = 0;
                this.field329.method391(213, 926);
                this.field329.method393(6488);
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIBLULLVQOAK;II)V")
    public final void method17(int arg0, int arg1, int arg2, byte arg3, class58 arg4, int arg5, int arg6) {
        if (arg4.field1410 == 0 && arg4.field1421 != null && !arg4.field1442) {
            if (arg2 >= arg5 && arg6 >= arg1 && arg2 <= arg4.field1451 + arg5 && arg6 <= arg4.field1452 + arg1) {
                int var8 = arg4.field1421.length;
                for (int var9 = 0; var9 < var8; ++var9) {
                    int var12 = arg4.field1444[var9] + arg5;
                    int var13 = arg4.field1455[var9] + arg1 - arg0;
                    class58 var14 = class58.field1405[arg4.field1421[var9]];
                    int var15 = var14.field1407 + var12;
                    int var16 = var14.field1423 + var13;
                    if ((var14.field1419 >= 0 || var14.field1398 != 0) && arg2 >= var15 && arg6 >= var16 && arg2 < var14.field1451 + var15 && arg6 < var14.field1452 + var16) {
                        if (var14.field1419 >= 0) {
                            this.field96 = var14.field1419;
                        } else {
                            this.field96 = var14.field1458;
                        }
                    }
                    if (var14.field1410 == 0) {
                        this.method17(var14.field1435, var16, arg2, (byte) 0, var14, var15, arg6);
                        if (var14.field1401 > var14.field1452) {
                            this.method122(arg2, 4, var16, arg6, var14.field1451 + var15, var14.field1452, var14, true, var14.field1401);
                        }
                    } else {
                        if (var14.field1411 == 1 && arg2 >= var15 && arg6 >= var16 && arg2 < var14.field1451 + var15 && arg6 < var14.field1452 + var16) {
                            boolean var17 = false;
                            if (var14.field1422 != 0) {
                                var17 = this.method56(var14, (byte) 95);
                            }
                            if (!var17) {
                                this.field179[this.field414] = var14.field1453;
                                this.field359[this.field414] = 158;
                                this.field358[this.field414] = var14.field1458;
                                ++this.field414;
                            }
                        }
                        if (var14.field1411 == 2 && this.field43 == 0 && arg2 >= var15 && arg6 >= var16 && arg2 < var14.field1451 + var15 && arg6 < var14.field1452 + var16) {
                            String var18 = var14.field1438;
                            if (var18.indexOf(" ") != -1) {
                                var18 = var18.substring(0, var18.indexOf(" "));
                            }
                            this.field179[this.field414] = var18 + " @gre@" + var14.field1408;
                            this.field359[this.field414] = 358;
                            this.field358[this.field414] = var14.field1458;
                            ++this.field414;
                        }
                        if (var14.field1411 == 3 && arg2 >= var15 && arg6 >= var16 && arg2 < var14.field1451 + var15 && arg6 < var14.field1452 + var16) {
                            this.field179[this.field414] = "Close";
                            this.field359[this.field414] = 242;
                            this.field358[this.field414] = var14.field1458;
                            ++this.field414;
                        }
                        if (var14.field1411 == 4 && arg2 >= var15 && arg6 >= var16 && arg2 < var14.field1451 + var15 && arg6 < var14.field1452 + var16) {
                            this.field179[this.field414] = var14.field1453;
                            this.field359[this.field414] = 682;
                            this.field358[this.field414] = var14.field1458;
                            ++this.field414;
                        }
                        if (var14.field1411 == 5 && arg2 >= var15 && arg6 >= var16 && arg2 < var14.field1451 + var15 && arg6 < var14.field1452 + var16) {
                            this.field179[this.field414] = var14.field1453;
                            this.field359[this.field414] = 552;
                            this.field358[this.field414] = var14.field1458;
                            ++this.field414;
                        }
                        if (var14.field1411 == 6 && !this.field429 && arg2 >= var15 && arg6 >= var16 && arg2 < var14.field1451 + var15 && arg6 < var14.field1452 + var16) {
                            this.field179[this.field414] = var14.field1453;
                            this.field359[this.field414] = 622;
                            this.field358[this.field414] = var14.field1458;
                            ++this.field414;
                        }
                        if (var14.field1410 == 2) {
                            int var19 = 0;
                            for (int var20 = 0; var20 < var14.field1452; ++var20) {
                                for (int var21 = 0; var21 < var14.field1451; ++var21) {
                                    int var22 = (var14.field1397 + 32) * var21 + var15;
                                    int var23 = (var14.field1433 + 32) * var20 + var16;
                                    if (var19 < 20) {
                                        var22 += var14.field1447[var19];
                                        var23 += var14.field1413[var19];
                                    }
                                    if (arg2 >= var22 && arg6 >= var23 && arg2 < var22 + 32 && arg6 < var23 + 32) {
                                        this.field458 = var19;
                                        this.field459 = var14.field1458;
                                        if (var14.field1400[var19] > 0) {
                                            class32 var24 = class32.method380(var14.field1400[var19] - 1);
                                            if (this.field54 == 1 && var14.field1463) {
                                                if (this.field56 != var14.field1458 || this.field55 != var19) {
                                                    this.field179[this.field414] = "Use " + this.field58 + " with @lre@" + var24.field1018;
                                                    this.field359[this.field414] = 829;
                                                    this.field360[this.field414] = var24.field1038;
                                                    this.field357[this.field414] = var19;
                                                    this.field358[this.field414] = var14.field1458;
                                                    ++this.field414;
                                                }
                                            } else if (this.field43 == 1 && var14.field1463) {
                                                if ((this.field45 & 16) == 16) {
                                                    this.field179[this.field414] = this.field46 + " @lre@" + var24.field1018;
                                                    this.field359[this.field414] = 943;
                                                    this.field360[this.field414] = var24.field1038;
                                                    this.field357[this.field414] = var19;
                                                    this.field358[this.field414] = var14.field1458;
                                                    ++this.field414;
                                                }
                                            } else {
                                                if (var14.field1463) {
                                                    for (int var25 = 4; var25 >= 3; --var25) {
                                                        if (var24.field1046 != null && var24.field1046[var25] != null) {
                                                            this.field179[this.field414] = var24.field1046[var25] + " @lre@" + var24.field1018;
                                                            if (var25 == 3) {
                                                                this.field359[this.field414] = 598;
                                                            }
                                                            if (var25 == 4) {
                                                                this.field359[this.field414] = 975;
                                                            }
                                                            this.field360[this.field414] = var24.field1038;
                                                            this.field357[this.field414] = var19;
                                                            this.field358[this.field414] = var14.field1458;
                                                            ++this.field414;
                                                        } else if (var25 == 4) {
                                                            this.field179[this.field414] = "Drop @lre@" + var24.field1018;
                                                            this.field359[this.field414] = 975;
                                                            this.field360[this.field414] = var24.field1038;
                                                            this.field357[this.field414] = var19;
                                                            this.field358[this.field414] = var14.field1458;
                                                            ++this.field414;
                                                        }
                                                    }
                                                }
                                                if (var14.field1412) {
                                                    this.field179[this.field414] = "Use @lre@" + var24.field1018;
                                                    this.field359[this.field414] = 787;
                                                    this.field360[this.field414] = var24.field1038;
                                                    this.field357[this.field414] = var19;
                                                    this.field358[this.field414] = var14.field1458;
                                                    ++this.field414;
                                                }
                                                if (var14.field1463 && var24.field1046 != null) {
                                                    for (int var26 = 2; var26 >= 0; --var26) {
                                                        if (var24.field1046[var26] != null) {
                                                            this.field179[this.field414] = var24.field1046[var26] + " @lre@" + var24.field1018;
                                                            if (var26 == 0) {
                                                                this.field359[this.field414] = 579;
                                                            }
                                                            if (var26 == 1) {
                                                                this.field359[this.field414] = 540;
                                                            }
                                                            if (var26 == 2) {
                                                                this.field359[this.field414] = 422;
                                                            }
                                                            this.field360[this.field414] = var24.field1038;
                                                            this.field357[this.field414] = var19;
                                                            this.field358[this.field414] = var14.field1458;
                                                            ++this.field414;
                                                        }
                                                    }
                                                }
                                                if (var14.field1448 != null) {
                                                    for (int var27 = 4; var27 >= 0; --var27) {
                                                        if (var14.field1448[var27] != null) {
                                                            this.field179[this.field414] = var14.field1448[var27] + " @lre@" + var24.field1018;
                                                            if (var27 == 0) {
                                                                this.field359[this.field414] = 855;
                                                            }
                                                            if (var27 == 1) {
                                                                this.field359[this.field414] = 822;
                                                            }
                                                            if (var27 == 2) {
                                                                this.field359[this.field414] = 589;
                                                            }
                                                            if (var27 == 3) {
                                                                this.field359[this.field414] = 914;
                                                            }
                                                            if (var27 == 4) {
                                                                this.field359[this.field414] = 568;
                                                            }
                                                            this.field360[this.field414] = var24.field1038;
                                                            this.field357[this.field414] = var19;
                                                            this.field358[this.field414] = var14.field1458;
                                                            ++this.field414;
                                                        }
                                                    }
                                                }
                                                this.field179[this.field414] = "Examine @lre@" + var24.field1018;
                                                this.field359[this.field414] = 1186;
                                                this.field360[this.field414] = var24.field1038;
                                                this.field357[this.field414] = var19;
                                                this.field358[this.field414] = var14.field1458;
                                                ++this.field414;
                                            }
                                        }
                                    }
                                    ++var19;
                                }
                            }
                        }
                    }
                }
                if (this.field347 == arg3) {
                    boolean var10 = false;
                } else {
                    for (int var11 = 1; var11 > 0; ++var11) {
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZLLDILQFVA;I)V")
    private final void method18(boolean arg0, class34 arg1, int arg2) {
        arg1.method412(false);
        int var4 = arg1.method413(true, 8);
        this.field321 &= arg0;
        if (var4 < this.field445) {
            for (int var5 = var4; var5 < this.field445; ++var5) {
                this.field404[this.field403++] = this.field446[var5];
            }
        }
        if (var4 > this.field445) {
            signlink.reporterror(this.field103 + " Too many npcs");
            throw new RuntimeException("eek");
        } else {
            this.field445 = 0;
            for (int var6 = 0; var6 < var4; ++var6) {
                int var7 = this.field446[var6];
                class54 var8 = this.field444[var7];
                int var9 = arg1.method413(true, 1);
                if (var9 == 0) {
                    this.field446[this.field445++] = var7;
                    var8.field1695 = field246;
                } else {
                    int var10 = arg1.method413(true, 2);
                    if (var10 == 0) {
                        this.field446[this.field445++] = var7;
                        var8.field1695 = field246;
                        this.field290[this.field289++] = var7;
                    } else if (var10 == 1) {
                        this.field446[this.field445++] = var7;
                        var8.field1695 = field246;
                        int var11 = arg1.method413(true, 3);
                        var8.method574(var11, false, false);
                        int var12 = arg1.method413(true, 1);
                        if (var12 == 1) {
                            this.field290[this.field289++] = var7;
                        }
                    } else if (var10 == 2) {
                        this.field446[this.field445++] = var7;
                        var8.field1695 = field246;
                        int var13 = arg1.method413(true, 3);
                        var8.method574(var13, true, false);
                        int var14 = arg1.method413(true, 3);
                        var8.method574(var14, true, false);
                        int var15 = arg1.method413(true, 1);
                        if (var15 == 1) {
                            this.field290[this.field289++] = var7;
                        }
                    } else if (var10 == 3) {
                        this.field404[this.field403++] = var7;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZI)Ljava/lang/String;")
    private static final String method19(boolean arg0, int arg1) {
        String var2 = String.valueOf(arg1);
        for (int var3 = var2.length() - 3; var3 > 0; var3 -= 3) {
            var2 = var2.substring(0, var3) + "," + var2.substring(var3);
        }
        if (!arg0) {
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

    @OriginalMember(owner = "client", name = "c", descriptor = "(III)Z")
    public final boolean method20(int arg0, int arg1, int arg2) {
        boolean var4 = false;
        class58 var5 = class58.field1405[arg0];
        for (int var6 = 0; var6 < var5.field1421.length && var5.field1421[var6] != -1; ++var6) {
            class58 var7 = class58.field1405[var5.field1421[var6]];
            if (var7.field1410 == 1) {
                var4 |= this.method20(var7.field1458, arg1, -208);
            }
            if (var7.field1410 == 6 && (var7.field1427 != -1 || var7.field1428 != -1)) {
                boolean var8 = this.method91(false, var7);
                int var9;
                if (var8) {
                    var9 = var7.field1428;
                } else {
                    var9 = var7.field1427;
                }
                if (var9 != -1) {
                    class66 var10 = class66.field1608[var9];
                    var7.field1431 += arg1;
                    while (var7.field1431 > var10.method566(var7.field1434, (byte) 2)) {
                        var7.field1431 -= var10.method566(var7.field1434, (byte) 2) + 1;
                        ++var7.field1434;
                        if (var7.field1434 >= var10.field1609) {
                            var7.field1434 -= var10.field1613;
                            if (var7.field1434 < 0 || var7.field1434 >= var10.field1609) {
                                var7.field1434 = 0;
                            }
                        }
                        var4 = true;
                    }
                }
            }
            if (var7.field1410 == 6 && var7.field1414 != 0) {
                int var11 = var7.field1414 >> 16;
                int var12 = var7.field1414 << 16 >> 16;
                int var13 = arg1 * var11;
                int var14 = arg1 * var12;
                var7.field1416 = var7.field1416 + var13 & 2047;
                var7.field1417 = var7.field1417 + var14 & 2047;
                var4 = true;
            }
        }
        if (arg2 >= 0) {
            throw new NullPointerException();
        } else {
            return var4;
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(Z)V")
    public final void method21(boolean arg0) {
        ++field140;
        if (arg0) {
            this.field439 = this.field413.method402();
        }
        if (field140 > 178) {
            field140 = 0;
            this.field329.method391(128, 926);
            this.field329.method396(0);
        }
        while (true) {
            int var2;
            do {
                while (true) {
                    var2 = this.method372(this.field475);
                    if (var2 == -1) {
                        return;
                    }
                    if (this.field255 != -1 && this.field498 == this.field255) {
                        if (var2 == 8 && this.field107.length() > 0) {
                            this.field107 = this.field107.substring(0, this.field107.length() - 1);
                        }
                        break;
                    }
                    if (this.field470) {
                        if (var2 >= 32 && var2 <= 122 && this.field190.length() < 80) {
                            this.field190 = this.field190 + (char) var2;
                            this.field260 = true;
                        }
                        if (var2 == 8 && this.field190.length() > 0) {
                            this.field190 = this.field190.substring(0, this.field190.length() - 1);
                            this.field260 = true;
                        }
                        if (var2 == 13 || var2 == 10) {
                            this.field470 = false;
                            this.field260 = true;
                            if (this.field134 == 1) {
                                long var3 = class20.method268(this.field190);
                                this.method69(var3, 641);
                            }
                            if (this.field134 == 2 && this.field447 > 0) {
                                long var5 = class20.method268(this.field190);
                                this.method46(var5, true);
                            }
                            if (this.field134 == 3 && this.field190.length() > 0) {
                                this.field329.method391(226, 926);
                                this.field329.method392(0);
                                int var7 = this.field329.field1073;
                                this.field329.method398(true, this.field433);
                                class26.method316(false, this.field329, this.field190);
                                this.field329.method401(this.field348, this.field329.field1073 - var7);
                                this.field190 = class26.method317(this.field190, (byte) 73);
                                this.field190 = class39.method470(this.field190, (byte) 73);
                                this.method131((byte) -32, class20.method272(false, class20.method269(this.field433, -898)), 6, this.field190);
                                if (this.field419 == 2) {
                                    this.field419 = 1;
                                    this.field97 = true;
                                    this.field329.method391(39, 926);
                                    this.field329.method392(this.field74);
                                    this.field329.method392(this.field419);
                                    this.field329.method392(this.field496);
                                }
                            }
                            if (this.field134 == 4 && this.field251 < 100) {
                                long var8 = class20.method268(this.field190);
                                this.method151(var8, (byte) -93);
                            }
                            if (this.field134 == 5 && this.field251 > 0) {
                                long var10 = class20.method268(this.field190);
                                this.method57(0, var10);
                            }
                        }
                    } else if (this.field117 == 1) {
                        if (var2 >= 48 && var2 <= 57 && this.field516.length() < 10) {
                            this.field516 = this.field516 + (char) var2;
                            this.field260 = true;
                        }
                        if (var2 == 8 && this.field516.length() > 0) {
                            this.field516 = this.field516.substring(0, this.field516.length() - 1);
                            this.field260 = true;
                        }
                        if (var2 == 13 || var2 == 10) {
                            if (this.field516.length() > 0) {
                                int var12 = 0;
                                try {
                                    var12 = Integer.parseInt(this.field516);
                                } catch (Exception var22) {
                                }
                                this.field329.method391(98, 926);
                                this.field329.method396(var12);
                            }
                            this.field117 = 0;
                            this.field260 = true;
                        }
                    } else if (this.field117 == 2) {
                        if (var2 >= 32 && var2 <= 122 && this.field516.length() < 12) {
                            this.field516 = this.field516 + (char) var2;
                            this.field260 = true;
                        }
                        if (var2 == 8 && this.field516.length() > 0) {
                            this.field516 = this.field516.substring(0, this.field516.length() - 1);
                            this.field260 = true;
                        }
                        if (var2 == 13 || var2 == 10) {
                            if (this.field516.length() > 0) {
                                this.field329.method391(13, 926);
                                this.field329.method398(true, class20.method268(this.field516));
                            }
                            this.field117 = 0;
                            this.field260 = true;
                        }
                    } else if (this.field133 == -1) {
                        if (var2 >= 32 && var2 <= 122 && this.field161.length() < 80) {
                            this.field161 = this.field161 + (char) var2;
                            this.field260 = true;
                        }
                        if (var2 == 8 && this.field161.length() > 0) {
                            this.field161 = this.field161.substring(0, this.field161.length() - 1);
                            this.field260 = true;
                        }
                        if ((var2 == 13 || var2 == 10) && this.field161.length() > 0) {
                            if (this.field145 == 2) {
                                if (this.field161.equals("::clientdrop")) {
                                    this.method13((byte) 37);
                                }
                                if (this.field161.equals("::lag")) {
                                    this.method70(true);
                                }
                                if (this.field161.equals("::prefetchmusic")) {
                                    for (int var13 = 0; var13 < this.field106.method295((byte) 9, 2); ++var13) {
                                        this.field106.method283(var13, (byte) 39, (byte) 1, 2);
                                    }
                                }
                                if (this.field161.equals("::fpson")) {
                                    field234 = true;
                                }
                                if (this.field161.equals("::fpsoff")) {
                                    field234 = false;
                                }
                                if (this.field161.equals("::noclip")) {
                                    for (int var14 = 0; var14 < 4; ++var14) {
                                        for (int var15 = 1; var15 < 103; ++var15) {
                                            for (int var16 = 1; var16 < 103; ++var16) {
                                                this.field485[var14].field717[var15][var16] = 0;
                                            }
                                        }
                                    }
                                }
                            }
                            if (this.field161.startsWith("::")) {
                                this.field329.method391(135, 926);
                                this.field329.method392(this.field161.length() - 1);
                                this.field329.method399(this.field161.substring(2));
                            } else {
                                String var17 = this.field161.toLowerCase();
                                byte var18 = 0;
                                if (var17.startsWith("yellow:")) {
                                    var18 = 0;
                                    this.field161 = this.field161.substring(7);
                                } else if (var17.startsWith("red:")) {
                                    var18 = 1;
                                    this.field161 = this.field161.substring(4);
                                } else if (var17.startsWith("green:")) {
                                    var18 = 2;
                                    this.field161 = this.field161.substring(6);
                                } else if (var17.startsWith("cyan:")) {
                                    var18 = 3;
                                    this.field161 = this.field161.substring(5);
                                } else if (var17.startsWith("purple:")) {
                                    var18 = 4;
                                    this.field161 = this.field161.substring(7);
                                } else if (var17.startsWith("white:")) {
                                    var18 = 5;
                                    this.field161 = this.field161.substring(6);
                                } else if (var17.startsWith("flash1:")) {
                                    var18 = 6;
                                    this.field161 = this.field161.substring(7);
                                } else if (var17.startsWith("flash2:")) {
                                    var18 = 7;
                                    this.field161 = this.field161.substring(7);
                                } else if (var17.startsWith("flash3:")) {
                                    var18 = 8;
                                    this.field161 = this.field161.substring(7);
                                } else if (var17.startsWith("glow1:")) {
                                    var18 = 9;
                                    this.field161 = this.field161.substring(6);
                                } else if (var17.startsWith("glow2:")) {
                                    var18 = 10;
                                    this.field161 = this.field161.substring(6);
                                } else if (var17.startsWith("glow3:")) {
                                    var18 = 11;
                                    this.field161 = this.field161.substring(6);
                                }
                                String var19 = this.field161.toLowerCase();
                                byte var20 = 0;
                                if (var19.startsWith("wave:")) {
                                    var20 = 1;
                                    this.field161 = this.field161.substring(5);
                                } else if (var19.startsWith("wave2:")) {
                                    var20 = 2;
                                    this.field161 = this.field161.substring(6);
                                } else if (var19.startsWith("shake:")) {
                                    var20 = 3;
                                    this.field161 = this.field161.substring(6);
                                } else if (var19.startsWith("scroll:")) {
                                    var20 = 4;
                                    this.field161 = this.field161.substring(7);
                                } else if (var19.startsWith("slide:")) {
                                    var20 = 5;
                                    this.field161 = this.field161.substring(6);
                                }
                                this.field329.method391(100, 926);
                                this.field329.method392(0);
                                int var21 = this.field329.field1073;
                                this.field443.field1073 = 0;
                                class26.method316(false, this.field443, this.field161);
                                this.field329.method438(this.field443.field1073, true, this.field443.field1072, 0);
                                this.field329.method419(var20, -900);
                                this.field329.method419(var18, -900);
                                this.field329.method401(this.field348, this.field329.field1073 - var21);
                                this.field161 = class26.method317(this.field161, (byte) 73);
                                this.field161 = class39.method470(this.field161, (byte) 73);
                                field132.field1688 = this.field161;
                                field132.field1683 = var18;
                                field132.field1640 = var20;
                                field132.field1694 = 150;
                                if (this.field145 == 2) {
                                    this.method131((byte) -32, "@cr2@" + field132.field19, 2, field132.field1688);
                                } else if (this.field145 == 1) {
                                    this.method131((byte) -32, "@cr1@" + field132.field19, 2, field132.field1688);
                                } else {
                                    this.method131((byte) -32, field132.field19, 2, field132.field1688);
                                }
                                if (this.field74 == 2) {
                                    this.field74 = 3;
                                    this.field97 = true;
                                    this.field329.method391(39, 926);
                                    this.field329.method392(this.field74);
                                    this.field329.method392(this.field419);
                                    this.field329.method392(this.field496);
                                }
                            }
                            this.field161 = "";
                            this.field260 = true;
                        }
                    }
                }
            } while ((var2 < 97 || var2 > 122) && (var2 < 65 || var2 > 90) && (var2 < 48 || var2 > 57) && var2 != 32);
            if (this.field107.length() < 12) {
                this.field107 = this.field107 + (char) var2;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Z[BB)V")
    public final void method22(boolean arg0, byte[] arg1, byte arg2) {
        if (this.field164) {
            signlink.midifade = arg0 ? 1 : 0;
            signlink.midisave(arg1, arg1.length);
            if (arg2 == 0) {
                ;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILjava/lang/String;I)V")
    public final void method23(int arg0, String arg1, int arg2) {
        this.field452 = arg2;
        this.field505 = arg1;
        this.method51(696);
        if (this.field236 == null) {
            super.method23(0, arg1, arg2);
        } else {
            this.field462.method529(false);
            if (arg0 != 0) {
                this.field332 = this.field449.method387();
            }
            short var4 = 360;
            short var5 = 200;
            byte var6 = 20;
            this.field391.method253("RuneScape is loading - please wait...", var4 / 2, var5 / 2 - 26 - var6, 16777215, this.field264);
            int var7 = var5 / 2 - 18 - var6;
            class53.method522(9179409, var4 / 2 - 152, 304, this.field423, 34, var7);
            class53.method522(0, var4 / 2 - 151, 302, this.field423, 32, var7 + 1);
            class53.method521(9179409, -426, arg2 * 3, var4 / 2 - 150, var7 + 2, 30);
            class53.method521(0, -426, 300 - arg2 * 3, arg2 * 3 + (var4 / 2 - 150), var7 + 2, 30);
            this.field391.method253(arg1, var4 / 2, var5 / 2 + 5 - var6, 16777215, this.field264);
            this.field462.method530((byte) 9, 171, 202, super.field964);
            if (this.field451) {
                this.field451 = false;
                if (!this.field401) {
                    this.field463.method530((byte) 9, 0, 0, super.field964);
                    this.field464.method530((byte) 9, 0, 637, super.field964);
                }
                this.field460.method530((byte) 9, 0, 128, super.field964);
                this.field461.method530((byte) 9, 371, 202, super.field964);
                this.field465.method530((byte) 9, 265, 0, super.field964);
                this.field466.method530((byte) 9, 265, 562, super.field964);
                this.field467.method530((byte) 9, 171, 128, super.field964);
                this.field468.method530((byte) 9, 171, 562, super.field964);
            }
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(Z)V")
    public final void method24(boolean arg0) {
        signlink.midiplay = false;
        if (arg0) {
            field322 = 413;
        }
        signlink.midifade = 0;
        signlink.midi = "stop";
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIIII)V")
    public final void method25(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = 2048 - arg4 & 2047;
        int var9 = 2048 - arg3 & 2047;
        int var10 = 0;
        int var11 = 0;
        int var12 = arg1;
        if (var8 != 0) {
            int var13 = class27.field913[var8];
            int var14 = class27.field914[var8];
            int var15 = var11 * var14 - arg1 * var13 >> 16;
            var12 = var11 * var13 + arg1 * var14 >> 16;
            var11 = var15;
        }
        if (var9 != 0) {
            int var16 = class27.field913[var9];
            int var17 = class27.field914[var9];
            int var18 = var10 * var17 + var12 * var16 >> 16;
            var12 = var12 * var17 - var10 * var16 >> 16;
            var10 = var18;
        }
        this.field125 = arg2 - var10;
        if (arg5 != 0) {
            this.field439 = -1;
        }
        this.field126 = arg6 - var11;
        this.field127 = arg0 - var12;
        this.field128 = arg4;
        this.field129 = arg3;
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(B)V")
    public final void method26(byte arg0) {
        for (int var2 = 0; var2 < this.field445; ++var2) {
            int var3 = this.field446[var2];
            class54 var4 = this.field444[var3];
            if (var4 != null) {
                this.method27(var4.field1359.field1709, true, var4);
            }
        }
        if (this.field258 != arg0) {
            this.field420 = null;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IZLZGJLFNLC;)V")
    public final void method27(int arg0, boolean arg1, class69 arg2) {
        if (arg2.field1643 < 128 || arg2.field1644 < 128 || arg2.field1643 >= 13184 || arg2.field1644 >= 13184) {
            arg2.field1689 = -1;
            arg2.field1661 = -1;
            arg2.field1672 = 0;
            arg2.field1673 = 0;
            arg2.field1643 = arg2.field1641[0] * 128 + arg2.field1666 * 64;
            arg2.field1644 = arg2.field1642[0] * 128 + arg2.field1666 * 64;
            arg2.method575(9);
        }
        if (field132 == arg2 && (arg2.field1643 < 1536 || arg2.field1644 < 1536 || arg2.field1643 >= 11776 || arg2.field1644 >= 11776)) {
            arg2.field1689 = -1;
            arg2.field1661 = -1;
            arg2.field1672 = 0;
            arg2.field1673 = 0;
            arg2.field1643 = arg2.field1641[0] * 128 + arg2.field1666 * 64;
            arg2.field1644 = arg2.field1642[0] * 128 + arg2.field1666 * 64;
            arg2.method575(9);
        }
        if (arg2.field1672 > field246) {
            this.method28(arg2, 3);
        } else if (arg2.field1673 >= field246) {
            this.method29(arg2, (byte) 7);
        } else {
            this.method30(7, arg2);
        }
        this.method31(arg2, (byte) -44);
        this.field321 &= arg1;
        this.method32(false, arg2);
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LZGJLFNLC;I)V")
    public final void method28(class69 arg0, int arg1) {
        if (arg1 != 3) {
            this.field420 = null;
        }
        int var3 = arg0.field1672 - field246;
        int var4 = arg0.field1668 * 128 + arg0.field1666 * 64;
        int var5 = arg0.field1670 * 128 + arg0.field1666 * 64;
        arg0.field1643 += (var4 - arg0.field1643) / var3;
        arg0.field1644 += (var5 - arg0.field1644) / var3;
        arg0.field1667 = 0;
        if (arg0.field1674 == 0) {
            arg0.field1687 = 1024;
        }
        if (arg0.field1674 == 1) {
            arg0.field1687 = 1536;
        }
        if (arg0.field1674 == 2) {
            arg0.field1687 = 0;
        }
        if (arg0.field1674 == 3) {
            arg0.field1687 = 512;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LZGJLFNLC;B)V")
    public final void method29(class69 arg0, byte arg1) {
        if (arg1 != 7) {
            this.field320 = !this.field320;
        }
        if (field246 == arg0.field1673 || arg0.field1689 == -1 || arg0.field1692 != 0 || arg0.field1691 + 1 > class66.field1608[arg0.field1689].method566(arg0.field1690, (byte) 2)) {
            int var3 = arg0.field1673 - arg0.field1672;
            int var4 = field246 - arg0.field1672;
            int var5 = arg0.field1668 * 128 + arg0.field1666 * 64;
            int var6 = arg0.field1670 * 128 + arg0.field1666 * 64;
            int var7 = arg0.field1669 * 128 + arg0.field1666 * 64;
            int var8 = arg0.field1671 * 128 + arg0.field1666 * 64;
            arg0.field1643 = ((var3 - var4) * var5 + var4 * var7) / var3;
            arg0.field1644 = ((var3 - var4) * var6 + var4 * var8) / var3;
        }
        arg0.field1667 = 0;
        if (arg0.field1674 == 0) {
            arg0.field1687 = 1024;
        }
        if (arg0.field1674 == 1) {
            arg0.field1687 = 1536;
        }
        if (arg0.field1674 == 2) {
            arg0.field1687 = 0;
        }
        if (arg0.field1674 == 3) {
            arg0.field1687 = 512;
        }
        arg0.field1645 = arg0.field1687;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILZGJLFNLC;)V")
    public final void method30(int arg0, class69 arg1) {
        if (arg0 != 7) {
            field116 = this.field449.method387();
        }
        arg1.field1647 = arg1.field1654;
        if (arg1.field1646 == 0) {
            arg1.field1667 = 0;
        } else {
            if (arg1.field1689 != -1 && arg1.field1692 == 0) {
                class66 var3 = class66.field1608[arg1.field1689];
                if (arg1.field1685 > 0 && var3.field1620 == 0) {
                    ++arg1.field1667;
                    return;
                }
                if (arg1.field1685 <= 0 && var3.field1621 == 0) {
                    ++arg1.field1667;
                    return;
                }
            }
            int var4 = arg1.field1643;
            int var5 = arg1.field1644;
            int var6 = arg1.field1641[arg1.field1646 - 1] * 128 + arg1.field1666 * 64;
            int var7 = arg1.field1642[arg1.field1646 - 1] * 128 + arg1.field1666 * 64;
            if (var6 - var4 <= 256 && var6 - var4 >= -256 && var7 - var5 <= 256 && var7 - var5 >= -256) {
                if (var4 < var6) {
                    if (var5 < var7) {
                        arg1.field1687 = 1280;
                    } else if (var5 > var7) {
                        arg1.field1687 = 1792;
                    } else {
                        arg1.field1687 = 1536;
                    }
                } else if (var4 > var6) {
                    if (var5 < var7) {
                        arg1.field1687 = 768;
                    } else if (var5 > var7) {
                        arg1.field1687 = 256;
                    } else {
                        arg1.field1687 = 512;
                    }
                } else if (var5 < var7) {
                    arg1.field1687 = 1024;
                } else {
                    arg1.field1687 = 0;
                }
                int var8 = arg1.field1687 - arg1.field1645 & 2047;
                if (var8 > 1024) {
                    var8 -= 2048;
                }
                int var9 = arg1.field1676;
                if (var8 >= -256 && var8 <= 256) {
                    var9 = arg1.field1675;
                } else if (var8 >= 256 && var8 < 768) {
                    var9 = arg1.field1678;
                } else if (var8 >= -768 && var8 <= -256) {
                    var9 = arg1.field1677;
                }
                if (var9 == -1) {
                    var9 = arg1.field1675;
                }
                arg1.field1647 = var9;
                int var10 = 4;
                if (arg1.field1687 != arg1.field1645 && arg1.field1684 == -1 && arg1.field1657 != 0) {
                    var10 = 2;
                }
                if (arg1.field1646 > 2) {
                    var10 = 6;
                }
                if (arg1.field1646 > 3) {
                    var10 = 8;
                }
                if (arg1.field1667 > 0 && arg1.field1646 > 1) {
                    var10 = 8;
                    --arg1.field1667;
                }
                if (arg1.field1653[arg1.field1646 - 1]) {
                    var10 <<= 1;
                }
                if (var10 >= 8 && arg1.field1675 == arg1.field1647 && arg1.field1680 != -1) {
                    arg1.field1647 = arg1.field1680;
                }
                if (var4 < var6) {
                    arg1.field1643 += var10;
                    if (arg1.field1643 > var6) {
                        arg1.field1643 = var6;
                    }
                } else if (var4 > var6) {
                    arg1.field1643 -= var10;
                    if (arg1.field1643 < var6) {
                        arg1.field1643 = var6;
                    }
                }
                if (var5 < var7) {
                    arg1.field1644 += var10;
                    if (arg1.field1644 > var7) {
                        arg1.field1644 = var7;
                    }
                } else if (var5 > var7) {
                    arg1.field1644 -= var10;
                    if (arg1.field1644 < var7) {
                        arg1.field1644 = var7;
                    }
                }
                if (arg1.field1643 == var6 && arg1.field1644 == var7) {
                    --arg1.field1646;
                    if (arg1.field1685 > 0) {
                        --arg1.field1685;
                        return;
                    }
                }
            } else {
                arg1.field1643 = var6;
                arg1.field1644 = var7;
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(LZGJLFNLC;B)V")
    public final void method31(class69 arg0, byte arg1) {
        if (this.field105 != arg1) {
            this.method83();
        }
        if (arg0.field1657 != 0) {
            if (arg0.field1684 != -1 && arg0.field1684 < 32768) {
                class54 var3 = this.field444[arg0.field1684];
                if (var3 != null) {
                    int var4 = arg0.field1643 - var3.field1643;
                    int var5 = arg0.field1644 - var3.field1644;
                    if (var4 != 0 || var5 != 0) {
                        arg0.field1687 = (int) (Math.atan2((double) var4, (double) var5) * 325.949D) & 2047;
                    }
                }
            }
            if (arg0.field1684 >= 32768) {
                int var6 = arg0.field1684 - 32768;
                if (this.field79 == var6) {
                    var6 = this.field285;
                }
                class1 var7 = this.field286[var6];
                if (var7 != null) {
                    int var8 = arg0.field1643 - var7.field1643;
                    int var9 = arg0.field1644 - var7.field1644;
                    if (var8 != 0 || var9 != 0) {
                        arg0.field1687 = (int) (Math.atan2((double) var8, (double) var9) * 325.949D) & 2047;
                    }
                }
            }
            if ((arg0.field1681 != 0 || arg0.field1682 != 0) && (arg0.field1646 == 0 || arg0.field1667 > 0)) {
                int var10 = arg0.field1643 - (arg0.field1681 - this.field223 - this.field223) * 64;
                int var11 = arg0.field1644 - (arg0.field1682 - this.field224 - this.field224) * 64;
                if (var10 != 0 || var11 != 0) {
                    arg0.field1687 = (int) (Math.atan2((double) var10, (double) var11) * 325.949D) & 2047;
                }
                arg0.field1681 = 0;
                arg0.field1682 = 0;
            }
            int var12 = arg0.field1687 - arg0.field1645 & 2047;
            if (var12 != 0) {
                if (var12 >= arg0.field1657 && var12 <= 2048 - arg0.field1657) {
                    if (var12 > 1024) {
                        arg0.field1645 -= arg0.field1657;
                    } else {
                        arg0.field1645 += arg0.field1657;
                    }
                } else {
                    arg0.field1645 = arg0.field1687;
                }
                arg0.field1645 &= 2047;
                if (arg0.field1654 == arg0.field1647 && arg0.field1687 != arg0.field1645) {
                    if (arg0.field1655 != -1) {
                        arg0.field1647 = arg0.field1655;
                        return;
                    }
                    arg0.field1647 = arg0.field1675;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZLZGJLFNLC;)V")
    public final void method32(boolean arg0, class69 arg1) {
        if (arg0) {
            this.field439 = -1;
        }
        arg1.field1686 = false;
        if (arg1.field1647 != -1) {
            class66 var3 = class66.field1608[arg1.field1647];
            ++arg1.field1649;
            if (arg1.field1648 < var3.field1609 && arg1.field1649 > var3.method566(arg1.field1648, (byte) 2)) {
                arg1.field1649 = 0;
                ++arg1.field1648;
            }
            if (arg1.field1648 >= var3.field1609) {
                arg1.field1649 = 0;
                arg1.field1648 = 0;
            }
        }
        if (arg1.field1661 != -1 && field246 >= arg1.field1664) {
            if (arg1.field1662 < 0) {
                arg1.field1662 = 0;
            }
            class66 var4 = class57.field1384[arg1.field1661].field1388;
            ++arg1.field1663;
            while (arg1.field1662 < var4.field1609 && arg1.field1663 > var4.method566(arg1.field1662, (byte) 2)) {
                arg1.field1663 -= var4.method566(arg1.field1662, (byte) 2);
                ++arg1.field1662;
            }
            if (arg1.field1662 >= var4.field1609 && (arg1.field1662 < 0 || arg1.field1662 >= var4.field1609)) {
                arg1.field1661 = -1;
            }
        }
        if (arg1.field1689 != -1 && arg1.field1692 <= 1) {
            class66 var5 = class66.field1608[arg1.field1689];
            if (var5.field1620 == 1 && arg1.field1685 > 0 && arg1.field1672 <= field246 && arg1.field1673 < field246) {
                arg1.field1692 = 1;
                return;
            }
        }
        if (arg1.field1689 != -1 && arg1.field1692 == 0) {
            class66 var6 = class66.field1608[arg1.field1689];
            ++arg1.field1691;
            while (arg1.field1690 < var6.field1609 && arg1.field1691 > var6.method566(arg1.field1690, (byte) 2)) {
                arg1.field1691 -= var6.method566(arg1.field1690, (byte) 2);
                ++arg1.field1690;
            }
            if (arg1.field1690 >= var6.field1609) {
                arg1.field1690 -= var6.field1613;
                ++arg1.field1693;
                if (arg1.field1693 >= var6.field1619) {
                    arg1.field1689 = -1;
                }
                if (arg1.field1690 < 0 || arg1.field1690 >= var6.field1609) {
                    arg1.field1689 = -1;
                }
            }
            arg1.field1686 = var6.field1615;
        }
        if (arg1.field1692 > 0) {
            --arg1.field1692;
        }
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(I)V")
    public final void method33(int arg0) {
        if (arg0 != 49857) {
            this.field439 = -1;
        }
        if (this.field451) {
            this.field451 = false;
            this.field64.method530((byte) 9, 4, 0, super.field964);
            this.field65.method530((byte) 9, 357, 0, super.field964);
            this.field66.method530((byte) 9, 4, 722, super.field964);
            this.field67.method530((byte) 9, 205, 743, super.field964);
            this.field68.method530((byte) 9, 0, 0, super.field964);
            this.field69.method530((byte) 9, 4, 516, super.field964);
            this.field70.method530((byte) 9, 205, 516, super.field964);
            this.field71.method530((byte) 9, 357, 496, super.field964);
            this.field72.method530((byte) 9, 338, 0, super.field964);
            this.field177 = true;
            this.field260 = true;
            this.field136 = true;
            this.field97 = true;
            if (this.field430 != 2) {
                this.field91.method530((byte) 9, 4, 4, super.field964);
                this.field90.method530((byte) 9, 4, 550, super.field964);
            }
        }
        if (this.field430 == 2) {
            this.method129(this.field407);
        }
        if (this.field345 && this.field333 == 1) {
            this.field177 = true;
        }
        if (this.field139 != -1) {
            boolean var2 = this.method20(this.field139, this.field417, -208);
            if (var2) {
                this.field177 = true;
            }
        }
        if (this.field355 == 2) {
            this.field177 = true;
        }
        if (this.field212 == 2) {
            this.field177 = true;
        }
        if (this.field177) {
            this.method96((byte) 5);
            this.field177 = false;
        }
        if (this.field133 == -1) {
            this.field47.field1435 = this.field222 - this.field256 - 77;
            if (super.field972 > 448 && super.field972 < 560 && super.field973 > 332) {
                this.method122(super.field972 - 17, 4, 0, super.field973 - 357, 463, 77, this.field47, false, this.field222);
            }
            int var3 = this.field222 - 77 - this.field47.field1435;
            if (var3 < 0) {
                var3 = 0;
            }
            if (var3 > this.field222 - 77) {
                var3 = this.field222 - 77;
            }
            if (this.field256 != var3) {
                this.field256 = var3;
                this.field260 = true;
            }
        }
        if (this.field133 != -1) {
            boolean var4 = this.method20(this.field133, this.field417, -208);
            if (var4) {
                this.field260 = true;
            }
        }
        if (this.field355 == 3) {
            this.field260 = true;
        }
        if (this.field212 == 3) {
            this.field260 = true;
        }
        if (this.field76 != null) {
            this.field260 = true;
        }
        if (this.field345 && this.field333 == 2) {
            this.field260 = true;
        }
        if (this.field260) {
            this.method144((byte) 5);
            this.field260 = false;
        }
        if (this.field430 == 2) {
            this.method93(false);
            this.field90.method530((byte) 9, 4, 550, super.field964);
        }
        if (this.field456 != -1) {
            this.field136 = true;
        }
        if (this.field136) {
            if (this.field456 != -1 && this.field456 == this.field356) {
                this.field456 = -1;
                this.field329.method391(37, 926);
                this.field329.method392(this.field356);
            }
            this.field136 = false;
            this.field327.method529(false);
            this.field240.method446(448, 0, 0);
            if (this.field139 == -1) {
                if (this.field376[this.field356] != -1) {
                    if (this.field356 == 0) {
                        this.field118.method446(448, 10, 22);
                    }
                    if (this.field356 == 1) {
                        this.field119.method446(448, 8, 54);
                    }
                    if (this.field356 == 2) {
                        this.field119.method446(448, 8, 82);
                    }
                    if (this.field356 == 3) {
                        this.field120.method446(448, 8, 110);
                    }
                    if (this.field356 == 4) {
                        this.field122.method446(448, 8, 153);
                    }
                    if (this.field356 == 5) {
                        this.field122.method446(448, 8, 181);
                    }
                    if (this.field356 == 6) {
                        this.field121.method446(448, 9, 209);
                    }
                }
                if (this.field376[0] != -1 && (this.field456 != 0 || field246 % 20 < 10)) {
                    this.field61[0].method446(448, 13, 29);
                }
                if (this.field376[1] != -1 && (this.field456 != 1 || field246 % 20 < 10)) {
                    this.field61[1].method446(448, 11, 53);
                }
                if (this.field376[2] != -1 && (this.field456 != 2 || field246 % 20 < 10)) {
                    this.field61[2].method446(448, 11, 82);
                }
                if (this.field376[3] != -1 && (this.field456 != 3 || field246 % 20 < 10)) {
                    this.field61[3].method446(448, 12, 115);
                }
                if (this.field376[4] != -1 && (this.field456 != 4 || field246 % 20 < 10)) {
                    this.field61[4].method446(448, 13, 153);
                }
                if (this.field376[5] != -1 && (this.field456 != 5 || field246 % 20 < 10)) {
                    this.field61[5].method446(448, 11, 180);
                }
                if (this.field376[6] != -1 && (this.field456 != 6 || field246 % 20 < 10)) {
                    this.field61[6].method446(448, 13, 208);
                }
            }
            this.field327.method530((byte) 9, 160, 516, super.field964);
            ++field454;
            if (field454 > 88) {
                field454 = 0;
                this.field329.method391(222, 926);
            }
            this.field326.method529(false);
            this.field239.method446(448, 0, 0);
            if (this.field139 == -1) {
                if (this.field376[this.field356] != -1) {
                    if (this.field356 == 7) {
                        this.field312.method446(448, 0, 42);
                    }
                    if (this.field356 == 8) {
                        this.field313.method446(448, 0, 74);
                    }
                    if (this.field356 == 9) {
                        this.field313.method446(448, 0, 102);
                    }
                    if (this.field356 == 10) {
                        this.field314.method446(448, 1, 130);
                    }
                    if (this.field356 == 11) {
                        this.field316.method446(448, 0, 173);
                    }
                    if (this.field356 == 12) {
                        this.field316.method446(448, 0, 201);
                    }
                    if (this.field356 == 13) {
                        this.field315.method446(448, 0, 229);
                    }
                }
                if (this.field376[8] != -1 && (this.field456 != 8 || field246 % 20 < 10)) {
                    this.field61[7].method446(448, 2, 74);
                }
                if (this.field376[9] != -1 && (this.field456 != 9 || field246 % 20 < 10)) {
                    this.field61[8].method446(448, 3, 102);
                }
                if (this.field376[10] != -1 && (this.field456 != 10 || field246 % 20 < 10)) {
                    this.field61[9].method446(448, 4, 137);
                }
                if (this.field376[11] != -1 && (this.field456 != 11 || field246 % 20 < 10)) {
                    this.field61[10].method446(448, 2, 174);
                }
                if (this.field376[12] != -1 && (this.field456 != 12 || field246 % 20 < 10)) {
                    this.field61[11].method446(448, 2, 201);
                }
                if (this.field376[13] != -1 && (this.field456 != 13 || field246 % 20 < 10)) {
                    this.field61[12].method446(448, 2, 226);
                }
            }
            this.field326.method530((byte) 9, 466, 496, super.field964);
            this.field91.method529(false);
        }
        if (this.field97) {
            this.field97 = false;
            this.field325.method529(false);
            this.field238.method446(448, 0, 0);
            this.field390.method254(55, 28, 16777215, "Public chat", true, false);
            if (this.field74 == 0) {
                this.field390.method254(55, 41, 65280, "On", true, false);
            }
            if (this.field74 == 1) {
                this.field390.method254(55, 41, 16776960, "Friends", true, false);
            }
            if (this.field74 == 2) {
                this.field390.method254(55, 41, 16711680, "Off", true, false);
            }
            if (this.field74 == 3) {
                this.field390.method254(55, 41, 65535, "Hide", true, false);
            }
            this.field390.method254(184, 28, 16777215, "Private chat", true, false);
            if (this.field419 == 0) {
                this.field390.method254(184, 41, 65280, "On", true, false);
            }
            if (this.field419 == 1) {
                this.field390.method254(184, 41, 16776960, "Friends", true, false);
            }
            if (this.field419 == 2) {
                this.field390.method254(184, 41, 16711680, "Off", true, false);
            }
            this.field390.method254(324, 28, 16777215, "Trade/compete", true, false);
            if (this.field496 == 0) {
                this.field390.method254(324, 41, 65280, "On", true, false);
            }
            if (this.field496 == 1) {
                this.field390.method254(324, 41, 16776960, "Friends", true, false);
            }
            if (this.field496 == 2) {
                this.field390.method254(324, 41, 16711680, "Off", true, false);
            }
            this.field390.method254(458, 33, 16777215, "Report abuse", true, false);
            this.field325.method530((byte) 9, 453, 0, super.field964);
            this.field91.method529(false);
        }
        this.field417 = 0;
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(ZI)V")
    public final void method34(boolean arg0, int arg1) {
        if (arg0) {
            this.field320 = !this.field320;
        }
        if (!field412) {
            if (class25.field829[17] >= arg1) {
                class35 var3 = class25.field823[17];
                int var4 = var3.field1094 * var3.field1093 - 1;
                int var5 = this.field417 * var3.field1093 * 2;
                byte[] var6 = var3.field1091;
                byte[] var7 = this.field93;
                for (int var8 = 0; var8 <= var4; ++var8) {
                    var7[var8] = var6[var8 - var5 & var4];
                }
                var3.field1091 = var7;
                this.field93 = var6;
                class25.method305(17, 0);
            }
            if (class25.field829[24] >= arg1) {
                class35 var9 = class25.field823[24];
                int var10 = var9.field1094 * var9.field1093 - 1;
                int var11 = this.field417 * var9.field1093 * 2;
                byte[] var12 = var9.field1091;
                byte[] var13 = this.field93;
                for (int var14 = 0; var14 <= var10; ++var14) {
                    var13[var14] = var12[var14 - var11 & var10];
                }
                var9.field1091 = var13;
                this.field93 = var12;
                class25.method305(24, 0);
            }
            if (class25.field829[34] >= arg1) {
                class35 var15 = class25.field823[34];
                int var16 = var15.field1094 * var15.field1093 - 1;
                int var17 = this.field417 * var15.field1093 * 2;
                byte[] var18 = var15.field1091;
                byte[] var19 = this.field93;
                for (int var20 = 0; var20 <= var16; ++var20) {
                    var19[var20] = var18[var20 - var17 & var16];
                }
                var15.field1091 = var19;
                this.field93 = var18;
                class25.method305(34, 0);
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(III)V")
    public final void method35(int arg0, int arg1, int arg2) {
        int var4 = 0;
        this.field438 += arg1;
        for (int var5 = 0; var5 < 100; ++var5) {
            if (this.field207[var5] != null) {
                int var6 = this.field205[var5];
                int var7 = 70 - var4 * 14 + this.field256 + 4;
                if (var7 < -20) {
                    break;
                }
                String var8 = this.field206[var5];
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
                if ((var6 == 1 || var6 == 2) && (var6 == 1 || this.field74 == 0 || this.field74 == 1 && this.method36(var8, this.field244))) {
                    if (arg2 > var7 - 14 && arg2 <= var7 && !var8.equals(field132.field19)) {
                        if (this.field145 >= 1) {
                            this.field179[this.field414] = "Report abuse @whi@" + var8;
                            this.field359[this.field414] = 200;
                            ++this.field414;
                        }
                        this.field179[this.field414] = "Add ignore @whi@" + var8;
                        this.field359[this.field414] = 76;
                        ++this.field414;
                        this.field179[this.field414] = "Add friend @whi@" + var8;
                        this.field359[this.field414] = 394;
                        ++this.field414;
                    }
                    ++var4;
                }
                if ((var6 == 3 || var6 == 7) && this.field504 == 0 && (var6 == 7 || this.field419 == 0 || this.field419 == 1 && this.method36(var8, this.field244))) {
                    if (arg2 > var7 - 14 && arg2 <= var7) {
                        if (this.field145 >= 1) {
                            this.field179[this.field414] = "Report abuse @whi@" + var8;
                            this.field359[this.field414] = 200;
                            ++this.field414;
                        }
                        this.field179[this.field414] = "Add ignore @whi@" + var8;
                        this.field359[this.field414] = 76;
                        ++this.field414;
                        this.field179[this.field414] = "Add friend @whi@" + var8;
                        this.field359[this.field414] = 394;
                        ++this.field414;
                    }
                    ++var4;
                }
                if (var6 == 4 && (this.field496 == 0 || this.field496 == 1 && this.method36(var8, this.field244))) {
                    if (arg2 > var7 - 14 && arg2 <= var7) {
                        this.field179[this.field414] = "Accept trade @whi@" + var8;
                        this.field359[this.field414] = 762;
                        ++this.field414;
                    }
                    ++var4;
                }
                if ((var6 == 5 || var6 == 6) && this.field504 == 0 && this.field419 < 2) {
                    ++var4;
                }
                if (var6 == 8 && (this.field496 == 0 || this.field496 == 1 && this.method36(var8, this.field244))) {
                    if (arg2 > var7 - 14 && arg2 <= var7) {
                        this.field179[this.field414] = "Accept challenge @whi@" + var8;
                        this.field359[this.field414] = 680;
                        ++this.field414;
                    }
                    ++var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;Z)Z")
    public final boolean method36(String arg0, boolean arg1) {
        if (arg0 == null) {
            return false;
        } else {
            for (int var3 = 0; var3 < this.field447; ++var3) {
                if (arg0.equalsIgnoreCase(this.field194[var3])) {
                    return true;
                }
            }
            this.field321 &= arg1;
            return arg0.equalsIgnoreCase(field132.field19);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(I)V")
    public final void method37(int arg0) {
        signlink.reporterror = false;
        try {
            if (this.field282 != null) {
                this.field282.method227();
            }
        } catch (Exception var2) {
        }
        this.field282 = null;
        this.method24(false);
        if (this.field515 != null) {
            this.field515.field994 = false;
        }
        this.field515 = null;
        this.field106.method282();
        this.field106 = null;
        this.field443 = null;
        this.field329 = null;
        this.field495 = null;
        this.field413 = null;
        this.field384 = null;
        this.field170 = null;
        this.field493 = null;
        this.field385 = null;
        this.field386 = null;
        this.field292 = null;
        this.field479 = null;
        this.field174 = null;
        this.field485 = null;
        this.field519 = null;
        this.field263 = null;
        this.field387 = null;
        this.field388 = null;
        this.field93 = null;
        this.field89 = null;
        this.field90 = null;
        this.field91 = null;
        this.field92 = null;
        this.field325 = null;
        this.field326 = null;
        this.field327 = null;
        this.field64 = null;
        this.field65 = null;
        this.field66 = null;
        this.field67 = null;
        this.field68 = null;
        this.field69 = null;
        this.field70 = null;
        this.field71 = null;
        this.field72 = null;
        this.field48 = null;
        this.field49 = null;
        this.field50 = null;
        this.field238 = null;
        this.field239 = null;
        this.field240 = null;
        this.field61 = null;
        this.field118 = null;
        this.field119 = null;
        this.field120 = null;
        this.field121 = null;
        this.field122 = null;
        this.field312 = null;
        this.field313 = null;
        this.field314 = null;
        this.field315 = null;
        this.field316 = null;
        this.field215 = null;
        this.field95 = null;
        this.field422 = null;
        this.field372 = null;
        this.field480 = null;
        this.field481 = null;
        this.field482 = null;
        this.field483 = null;
        this.field484 = null;
        this.field265 = null;
        this.field196 = null;
        this.field227 = null;
        this.field286 = null;
        this.field288 = null;
        this.field290 = null;
        this.field291 = null;
        this.field404 = null;
        this.field444 = null;
        this.field446 = null;
        this.field420 = null;
        this.field253 = null;
        this.field374 = null;
        this.field319 = null;
        this.field357 = null;
        this.field358 = null;
        this.field359 = null;
        this.field360 = null;
        this.field179 = null;
        this.field455 = null;
        this.field232 = null;
        this.field233 = null;
        this.field421 = null;
        this.field300 = null;
        this.field194 = null;
        this.field490 = null;
        this.field110 = null;
        this.field463 = null;
        this.field464 = null;
        this.field460 = null;
        if (arg0 != 1) {
            this.field264 = 149;
        }
        this.field461 = null;
        this.field462 = null;
        this.field465 = null;
        this.field466 = null;
        this.field467 = null;
        this.field468 = null;
        this.method134(0);
        class59.method553(0);
        class71.method592(0);
        class32.method384(0);
        class63.field1576 = null;
        class68.field1633 = null;
        class58.field1405 = null;
        class64.field1589 = null;
        class66.field1608 = null;
        class57.field1384 = null;
        class57.field1396 = null;
        class14.field678 = null;
        super.field965 = null;
        class1.field1 = null;
        class25.method298(0);
        class7.method157(0);
        class27.method318(0);
        class56.method534(0);
        System.gc();
        if (class6.field545) {
        }
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(B)V")
    public final void method38(byte arg0) {
        short var2 = 256;
        for (int var3 = 10; var3 < 117; ++var3) {
            int var19 = (int) (Math.random() * 100.0D);
            if (var19 < 50) {
                this.field159[(var2 - 2 << 7) + var3] = 255;
            }
        }
        for (int var4 = 0; var4 < 100; ++var4) {
            int var16 = (int) (Math.random() * 124.0D) + 2;
            int var17 = (int) (Math.random() * 128.0D) + 128;
            int var18 = (var17 << 7) + var16;
            this.field159[var18] = 192;
        }
        for (int var5 = 1; var5 < var2 - 1; ++var5) {
            for (int var14 = 1; var14 < 127; ++var14) {
                int var15 = (var5 << 7) + var14;
                this.field160[var15] = (this.field159[var15 - 1] + this.field159[var15 + 1] + this.field159[var15 - 128] + this.field159[var15 + 128]) / 4;
            }
        }
        this.field157 += 128;
        if (this.field157 > this.field511.length) {
            this.field157 -= this.field511.length;
            int var6 = (int) (Math.random() * 12.0D);
            this.method126(5, this.field343[var6]);
        }
        for (int var7 = 1; var7 < var2 - 1; ++var7) {
            for (int var11 = 1; var11 < 127; ++var11) {
                int var12 = (var7 << 7) + var11;
                int var13 = this.field160[var12 + 128] - this.field511[this.field157 + var12 & this.field511.length - 1] / 5;
                if (var13 < 0) {
                    var13 = 0;
                }
                this.field159[var12] = var13;
            }
        }
        if (arg0 == 8) {
            boolean var8 = false;
        } else {
            this.method83();
        }
        for (int var9 = 0; var9 < var2 - 1; ++var9) {
            this.field324[var9] = this.field324[var9 + 1];
        }
        this.field324[var2 - 1] = (int) (Math.sin((double) field246 / 14.0D) * 16.0D + Math.sin((double) field246 / 15.0D) * 14.0D + Math.sin((double) field246 / 16.0D) * 12.0D);
        if (this.field350 > 0) {
            this.field350 -= 4;
        }
        if (this.field351 > 0) {
            this.field351 -= 4;
        }
        if (this.field350 == 0 && this.field351 == 0) {
            int var10 = (int) (Math.random() * 2000.0D);
            if (var10 == 0) {
                this.field350 = 1024;
            }
            if (var10 == 1) {
                this.field351 = 1024;
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIII)V")
    public final void method39(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field361.method446(448, arg5, arg3);
        this.field362.method446(448, arg4 + arg5 - 16, arg3);
        class53.method521(this.field274, -426, 16, arg3, arg5 + 16, arg4 - 32);
        int var7 = (arg4 - 32) * arg4 / arg1;
        if (var7 < 8) {
            var7 = 8;
        }
        int var8 = (arg4 - 32 - var7) * arg2 / (arg1 - arg4);
        class53.method521(this.field254, -426, 16, arg3, arg5 + 16 + var8, var7);
        class53.method526(this.field112, var7, (byte) 88, arg3, arg5 + 16 + var8);
        class53.method526(this.field112, var7, (byte) 88, arg3 + 1, arg5 + 16 + var8);
        class53.method524(arg5 + 16 + var8, arg3, this.field112, 16, -81);
        class53.method524(arg5 + 17 + var8, arg3, this.field112, 16, -81);
        class53.method526(this.field393, var7, (byte) 88, arg3 + 15, arg5 + 16 + var8);
        class53.method526(this.field393, var7 - 1, (byte) 88, arg3 + 14, arg5 + 17 + var8);
        int var9 = 93 / arg0;
        class53.method524(arg5 + 15 + var8 + var7, arg3, this.field393, 16, -81);
        class53.method524(arg5 + 14 + var8 + var7, arg3 + 1, this.field393, 15, -81);
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BZI)V")
    public final void method40(byte arg0, boolean arg1, int arg2) {
        if (arg0 == 5) {
            signlink.midivol = arg2;
            if (arg1) {
                signlink.midi = "voladjust";
            }
        }
    }

    @OriginalMember(owner = "client", name = "h", descriptor = "(I)V")
    public final void method41(int arg0) {
        if (this.field84 > 1) {
            --this.field84;
        }
        if (this.field442 > 0) {
            --this.field442;
        }
        for (int var2 = 0; var2 < 5 && this.method117(0); ++var2) {
        }
        if (this.field321) {
            Object var3 = this.field515.field996;
            synchronized (this.field515.field996) {
                if (!field228) {
                    this.field515.field997 = 0;
                } else if (super.field978 != 0 || this.field515.field997 >= 40) {
                    this.field329.method391(129, 926);
                    this.field329.method392(0);
                    int var4 = this.field329.field1073;
                    int var5 = 0;
                    for (int var6 = 0; var6 < this.field515.field997 && var4 - this.field329.field1073 < 240; ++var6) {
                        ++var5;
                        int var7 = this.field515.field993[var6];
                        if (var7 < 0) {
                            var7 = 0;
                        } else if (var7 > 502) {
                            var7 = 502;
                        }
                        int var8 = this.field515.field992[var6];
                        if (var8 < 0) {
                            var8 = 0;
                        } else if (var8 > 764) {
                            var8 = 764;
                        }
                        int var9 = var7 * 765 + var8;
                        if (this.field515.field993[var6] == -1 && this.field515.field992[var6] == -1) {
                            var8 = -1;
                            var7 = -1;
                            var9 = 524287;
                        }
                        if (this.field141 == var8 && this.field142 == var7) {
                            if (this.field435 < 2047) {
                                ++this.field435;
                            }
                        } else {
                            int var10 = var8 - this.field141;
                            this.field141 = var8;
                            int var11 = var7 - this.field142;
                            this.field142 = var7;
                            if (this.field435 < 8 && var10 >= -32 && var10 <= 31 && var11 >= -32 && var11 <= 31) {
                                var10 += 32;
                                var11 += 32;
                                this.field329.method393((this.field435 << 12) + (var10 << 6) + var11);
                                this.field435 = 0;
                            } else if (this.field435 < 8) {
                                this.field329.method395((this.field435 << 19) + 8388608 + var9);
                                this.field435 = 0;
                            } else {
                                this.field329.method396((this.field435 << 19) + -1073741824 + var9);
                                this.field435 = 0;
                            }
                        }
                    }
                    this.field329.method401(this.field348, this.field329.field1073 - var4);
                    if (var5 >= this.field515.field997) {
                        this.field515.field997 = 0;
                    } else {
                        this.field515.field997 -= var5;
                        for (int var12 = 0; var12 < this.field515.field997; ++var12) {
                            this.field515.field992[var12] = this.field515.field992[var5 + var12];
                            this.field515.field993[var12] = this.field515.field993[var5 + var12];
                        }
                    }
                }
            }
            if (super.field978 != 0) {
                long var13 = (super.field981 - this.field311) / 50L;
                if (var13 > 4095L) {
                    var13 = 4095L;
                }
                this.field311 = super.field981;
                int var15 = super.field980;
                if (var15 < 0) {
                    var15 = 0;
                } else if (var15 > 502) {
                    var15 = 502;
                }
                int var16 = super.field979;
                if (var16 < 0) {
                    var16 = 0;
                } else if (var16 > 764) {
                    var16 = 764;
                }
                int var17 = var15 * 765 + var16;
                byte var18 = 0;
                if (super.field978 == 2) {
                    var18 = 1;
                }
                int var19 = (int) var13;
                this.field329.method391(96, 926);
                this.field329.method396((var18 << 19) + (var19 << 20) + var17);
            }
            if (this.field367 > 0) {
                --this.field367;
            }
            if (super.field982[1] == 1 || super.field982[2] == 1 || super.field982[3] == 1 || super.field982[4] == 1) {
                this.field368 = true;
            }
            if (this.field368 && this.field367 <= 0) {
                this.field367 = 20;
                this.field368 = false;
                this.field329.method391(35, 926);
                this.field329.method393(this.field81);
                this.field329.method393(this.field80);
            }
            if (super.field969 && !this.field424) {
                this.field424 = true;
                this.field329.method391(103, 926);
                this.field329.method392(1);
            }
            if (!super.field969 && this.field424) {
                this.field424 = false;
                this.field329.method391(103, 926);
                this.field329.method392(0);
            }
            this.method48(-161);
            this.method53(9891);
            this.method118((byte) 5);
            ++field346;
            if (field346 > 1607) {
                field346 = 0;
                this.field329.method391(155, 926);
                this.field329.method392(0);
                int var20 = this.field329.field1073;
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field329.method393(29516);
                }
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field329.method392(34);
                }
                this.field329.method393((int) (Math.random() * 65536.0D));
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field329.method392(192);
                }
                this.field329.method392(228);
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field329.method393(16924);
                }
                this.field329.method392(78);
                this.field329.method392((int) (Math.random() * 256.0D));
                this.field329.method392(88);
                this.field329.method393(38427);
                this.field329.method401(this.field348, this.field329.field1073 - var20);
            }
            ++this.field440;
            if (this.field440 > 750) {
                this.method13((byte) 37);
            }
            this.method88(16835);
            this.method26((byte) 45);
            this.method50(0);
            ++this.field417;
            if (this.field42 != 0) {
                this.field41 += 20;
                if (this.field41 >= 400) {
                    this.field42 = 0;
                }
            }
            if (this.field355 != 0) {
                ++this.field352;
                if (this.field352 >= 15) {
                    if (this.field355 == 2) {
                        this.field177 = true;
                    }
                    if (this.field355 == 3) {
                        this.field260 = true;
                    }
                    this.field355 = 0;
                }
            }
            if (this.field212 != 0) {
                ++this.field257;
                if (super.field972 > this.field213 + 5 || super.field972 < this.field213 - 5 || super.field973 > this.field214 + 5 || super.field973 < this.field214 - 5) {
                    this.field317 = true;
                }
                if (super.field971 == 0) {
                    if (this.field212 == 2) {
                        this.field177 = true;
                    }
                    if (this.field212 == 3) {
                        this.field260 = true;
                    }
                    this.field212 = 0;
                    if (this.field317 && this.field257 >= 5) {
                        this.field459 = -1;
                        this.method95((byte) -110);
                        if (this.field459 == this.field210 && this.field458 != this.field211) {
                            class58 var21 = class58.field1405[this.field210];
                            byte var22 = 0;
                            if (this.field509 == 1 && var21.field1422 == 206) {
                                var22 = 1;
                            }
                            if (var21.field1400[this.field458] <= 0) {
                                var22 = 0;
                            }
                            if (var21.field1403) {
                                int var23 = this.field211;
                                int var24 = this.field458;
                                var21.field1400[var24] = var21.field1400[var23];
                                var21.field1440[var24] = var21.field1440[var23];
                                var21.field1400[var23] = -1;
                                var21.field1440[var23] = 0;
                            } else if (var22 == 1) {
                                int var25 = this.field211;
                                int var26 = this.field458;
                                while (var25 != var26) {
                                    if (var25 > var26) {
                                        var21.method542(var25, this.field235, var25 - 1);
                                        --var25;
                                    } else if (var25 < var26) {
                                        var21.method542(var25, this.field235, var25 + 1);
                                        ++var25;
                                    }
                                }
                            } else {
                                var21.method542(this.field211, this.field235, this.field458);
                            }
                            this.field329.method391(63, 926);
                            this.field329.method418(var22, true);
                            this.field329.method393(this.field458);
                            this.field329.method427(this.field210, 38866);
                            this.field329.method428(false, this.field211);
                        }
                    } else if ((this.field115 == 1 || this.method148(8, this.field414 - 1)) && this.field414 > 2) {
                        this.method102(this.field487);
                    } else if (this.field414 > 0) {
                        this.method100(this.field414 - 1, false);
                    }
                    this.field352 = 10;
                    super.field978 = 0;
                }
            }
            if (class7.field588 != -1) {
                int var27 = class7.field588;
                int var28 = class7.field589;
                boolean var29 = this.method98(var27, field132.field1641[0], this.field195, 0, 0, 0, true, 0, 0, var28, 0, field132.field1642[0]);
                class7.field588 = -1;
                if (var29) {
                    this.field39 = super.field979;
                    this.field40 = super.field980;
                    this.field42 = 1;
                    this.field41 = 0;
                }
            }
            if (super.field978 == 1 && this.field76 != null) {
                this.field76 = null;
                this.field260 = true;
                super.field978 = 0;
            }
            this.method110(-655);
            this.method58(true);
            this.method16(33812);
            this.method132(-5);
            if (super.field971 == 1 || super.field978 == 1) {
                ++this.field428;
            }
            if (this.field430 == 2) {
                this.method121(0);
            }
            if (this.field430 == 2 && this.field364) {
                this.method101(this.field184);
            }
            for (int var30 = 0; var30 < 5; ++var30) {
                int var10002 = this.field53[var30]++;
            }
            this.method21(false);
            ++super.field970;
            if (super.field970 > 4500) {
                this.field442 = 250;
                super.field970 -= 500;
                this.field329.method391(86, 926);
            }
            ++this.field281;
            if (this.field281 > 500) {
                this.field281 = 0;
                int var31 = (int) (Math.random() * 8.0D);
                if ((var31 & 1) == 1) {
                    this.field395 += this.field396;
                }
                if ((var31 & 2) == 2) {
                    this.field77 += this.field78;
                }
                if ((var31 & 4) == 4) {
                    this.field187 += this.field188;
                }
            }
            if (this.field395 < -50) {
                this.field396 = 2;
            }
            if (this.field395 > 50) {
                this.field396 = -2;
            }
            if (this.field77 < -55) {
                this.field78 = 2;
            }
            if (this.field77 > 55) {
                this.field78 = -2;
            }
            if (this.field187 < -40) {
                this.field188 = 1;
            }
            if (this.field187 > 40) {
                this.field188 = -1;
            }
            ++this.field450;
            if (arg0 >= 0) {
                this.method83();
            }
            if (this.field450 > 500) {
                this.field450 = 0;
                int var32 = (int) (Math.random() * 8.0D);
                if ((var32 & 1) == 1) {
                    this.field431 += this.field432;
                }
                if ((var32 & 2) == 2) {
                    this.field270 += this.field271;
                }
            }
            if (this.field431 < -60) {
                this.field432 = 2;
            }
            if (this.field431 > 60) {
                this.field432 = -2;
            }
            if (this.field270 < -20) {
                this.field271 = 1;
            }
            if (this.field270 > 10) {
                this.field271 = -1;
            }
            ++field349;
            if (field349 > 107) {
                field349 = 0;
                this.field329.method391(45, 926);
                this.field329.method392(4);
            }
            ++this.field441;
            if (this.field441 > 50) {
                this.field329.method391(184, 926);
            }
            try {
                if (this.field282 != null && this.field329.field1073 > 0) {
                    this.field282.method231(this.field329.field1072, this.field329.field1073, true, 0);
                    this.field329.field1073 = 0;
                    this.field441 = 0;
                }
            } catch (IOException var34) {
                this.method13((byte) 37);
            } catch (Exception var35) {
                this.method74((byte) -10);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LULLVQOAK;I)Z")
    public final boolean method42(class58 arg0, int arg1) {
        int var3 = arg0.field1422;
        if (arg1 != 0) {
            throw new NullPointerException();
        } else {
            if (this.field448 == 2) {
                if (var3 == 201) {
                    this.field260 = true;
                    this.field117 = 0;
                    this.field470 = true;
                    this.field190 = "";
                    this.field134 = 1;
                    this.field308 = "Enter name of friend to add to list";
                }
                if (var3 == 202) {
                    this.field260 = true;
                    this.field117 = 0;
                    this.field470 = true;
                    this.field190 = "";
                    this.field134 = 2;
                    this.field308 = "Enter name of friend to delete from list";
                }
            }
            if (var3 == 205) {
                this.field442 = 250;
                return true;
            } else {
                if (var3 == 501) {
                    this.field260 = true;
                    this.field117 = 0;
                    this.field470 = true;
                    this.field190 = "";
                    this.field134 = 4;
                    this.field308 = "Enter name of player to add to list";
                }
                if (var3 == 502) {
                    this.field260 = true;
                    this.field117 = 0;
                    this.field470 = true;
                    this.field190 = "";
                    this.field134 = 5;
                    this.field308 = "Enter name of player to delete from list";
                }
                if (var3 >= 300 && var3 <= 313) {
                    int var4 = (var3 - 300) / 2;
                    int var5 = var3 & 1;
                    int var6 = this.field510[var4];
                    if (var6 != -1) {
                        while (true) {
                            if (var5 == 0) {
                                --var6;
                                if (var6 < 0) {
                                    var6 = class68.field1632 - 1;
                                }
                            }
                            if (var5 == 1) {
                                ++var6;
                                if (var6 >= class68.field1632) {
                                    var6 = 0;
                                }
                            }
                            if (!class68.field1633[var6].field1639 && class68.field1633[var6].field1634 == var4 + (this.field399 ? 0 : 7)) {
                                this.field510[var4] = var6;
                                this.field375 = true;
                                break;
                            }
                        }
                    }
                }
                if (var3 >= 314 && var3 <= 323) {
                    int var7 = (var3 - 314) / 2;
                    int var8 = var3 & 1;
                    int var9 = this.field102[var7];
                    if (var8 == 0) {
                        --var9;
                        if (var9 < 0) {
                            var9 = field243[var7].length - 1;
                        }
                    }
                    if (var8 == 1) {
                        ++var9;
                        if (var9 >= field243[var7].length) {
                            var9 = 0;
                        }
                    }
                    this.field102[var7] = var9;
                    this.field375 = true;
                }
                if (var3 == 324 && !this.field399) {
                    this.field399 = true;
                    this.method128(this.field221);
                }
                if (var3 == 325 && this.field399) {
                    this.field399 = false;
                    this.method128(this.field221);
                }
                if (var3 != 326) {
                    if (var3 == 613) {
                        this.field514 = !this.field514;
                    }
                    if (var3 >= 601 && var3 <= 612) {
                        this.method89(this.field261);
                        if (this.field107.length() > 0) {
                            this.field329.method391(66, 926);
                            this.field329.method398(true, class20.method268(this.field107));
                            this.field329.method392(var3 - 601);
                            this.field329.method392(this.field514 ? 1 : 0);
                        }
                    }
                    return false;
                } else {
                    this.field329.method391(76, 926);
                    this.field329.method392(this.field399 ? 0 : 1);
                    for (int var10 = 0; var10 < 7; ++var10) {
                        this.field329.method392(this.field510[var10]);
                    }
                    for (int var11 = 0; var11 < 5; ++var11) {
                        this.field329.method392(this.field102[var11]);
                    }
                    return true;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(Z)V")
    public final void method43(boolean arg0) {
        this.field321 &= arg0;
        try {
            this.field373 = -1;
            this.field319.method455();
            this.field374.method455();
            class25.method301(155);
            this.method115(true);
            this.field174.method158(-202);
            System.gc();
            for (int var2 = 0; var2 < 4; ++var2) {
                this.field485[var2].method240();
            }
            for (int var3 = 0; var3 < 4; ++var3) {
                for (int var4 = 0; var4 < 104; ++var4) {
                    for (int var5 = 0; var5 < 104; ++var5) {
                        this.field479[var3][var4][var5] = 0;
                    }
                }
            }
            class28 var6 = new class28(this.field479, this.field204, 104, this.field292, 104);
            int var7 = this.field170.length;
            this.field329.method391(184, 926);
            if (!this.field172) {
                for (int var8 = 0; var8 < var7; ++var8) {
                    int var9 = (this.field384[var8] >> 8) * 64 - this.field223;
                    int var10 = (this.field384[var8] & 255) * 64 - this.field224;
                    byte[] var11 = this.field170[var8];
                    if (var11 != null) {
                        var6.method364(this.field485, var11, var9, (this.field200 - 6) * 8, (this.field199 - 6) * 8, var10, true);
                    }
                }
                for (int var12 = 0; var12 < var7; ++var12) {
                    int var13 = (this.field384[var12] >> 8) * 64 - this.field223;
                    int var14 = (this.field384[var12] & 255) * 64 - this.field224;
                    byte[] var15 = this.field170[var12];
                    if (var15 == null && this.field200 < 800) {
                        var6.method362(-90, 64, 64, var14, var13);
                    }
                }
                this.field329.method391(184, 926);
                for (int var16 = 0; var16 < var7; ++var16) {
                    byte[] var17 = this.field493[var16];
                    if (var17 != null) {
                        int var18 = (this.field384[var16] >> 8) * 64 - this.field223;
                        int var19 = (this.field384[var16] & 255) * 64 - this.field224;
                        var6.method347(var18, this.field174, var17, -696, this.field485, var19);
                    }
                }
            }
            if (this.field172) {
                int var20 = 0;
                label249: while (true) {
                    if (var20 >= 4) {
                        for (int var30 = 0; var30 < 13; ++var30) {
                            for (int var31 = 0; var31 < 13; ++var31) {
                                int var32 = this.field60[0][var30][var31];
                                if (var32 == -1) {
                                    var6.method362(-90, 8, 8, var31 * 8, var30 * 8);
                                }
                            }
                        }
                        this.field329.method391(184, 926);
                        int var33 = 0;
                        while (true) {
                            if (var33 >= 4) {
                                break label249;
                            }
                            for (int var34 = 0; var34 < 13; ++var34) {
                                for (int var35 = 0; var35 < 13; ++var35) {
                                    int var36 = this.field60[var33][var34][var35];
                                    if (var36 != -1) {
                                        int var37 = var36 >> 24 & 3;
                                        int var38 = var36 >> 1 & 3;
                                        int var39 = var36 >> 14 & 1023;
                                        int var40 = var36 >> 3 & 2047;
                                        int var41 = (var39 / 8 << 8) + var40 / 8;
                                        for (int var42 = 0; var42 < this.field384.length; ++var42) {
                                            if (this.field384[var42] == var41 && this.field493[var42] != null) {
                                                var6.method358((var39 & 7) * 8, this.field485, var38, var33, this.field174, (var40 & 7) * 8, false, var34 * 8, this.field493[var42], var35 * 8, var37);
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
                            int var23 = this.field60[var20][var21][var22];
                            if (var23 != -1) {
                                int var24 = var23 >> 24 & 3;
                                int var25 = var23 >> 1 & 3;
                                int var26 = var23 >> 14 & 1023;
                                int var27 = var23 >> 3 & 2047;
                                int var28 = (var26 / 8 << 8) + var27 / 8;
                                for (int var29 = 0; var29 < this.field384.length; ++var29) {
                                    if (this.field384[var29] == var28 && this.field170[var29] != null) {
                                        var6.method367(this.field485, this.field170[var29], var22 * 8, var21 * 8, var20, var24, (var27 & 7) * 8, var25, (var26 & 7) * 8, (byte) -119);
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    ++var20;
                }
            }
            this.field329.method391(184, 926);
            var6.method348(false, this.field174, this.field485);
            this.field91.method529(false);
            this.field329.method391(184, 926);
            int var43 = class28.field935;
            if (var43 > this.field307) {
                var43 = this.field307;
            }
            if (var43 < this.field307 - 1) {
                int var44 = this.field307 - 1;
            }
            if (field412) {
                this.field174.method159(class28.field935, 160);
            } else {
                this.field174.method159(0, 160);
            }
            for (int var45 = 0; var45 < 104; ++var45) {
                for (int var46 = 0; var46 < 104; ++var46) {
                    this.method54(var45, var46);
                }
            }
            ++field293;
            if (field293 > 126) {
                field293 = 0;
                this.field329.method391(121, 926);
                this.field329.method392(109);
            }
            this.method150(false);
        } catch (Exception var59) {
        }
        class59.field1465.method154();
        if (super.field967 != null) {
            this.field329.method391(119, 926);
            this.field329.method396(1057001181);
        }
        if (field412 && signlink.cache_dat != null) {
            int var48 = this.field106.method295((byte) 9, 0);
            for (int var49 = 0; var49 < var48; ++var49) {
                int var50 = this.field106.method279(field248, var49);
                if ((var50 & 121) == 0) {
                    class27.method321(var49, 3);
                }
            }
        }
        System.gc();
        class25.method302(20, (byte) 121);
        this.field106.method291(this.field166);
        int var51 = (this.field199 - 6) / 8 - 1;
        int var52 = (this.field199 + 6) / 8 + 1;
        int var53 = (this.field200 - 6) / 8 - 1;
        int var54 = (this.field200 + 6) / 8 + 1;
        if (this.field262) {
            var51 = 49;
            var52 = 50;
            var53 = 49;
            var54 = 50;
        }
        for (int var55 = var51; var55 <= var52; ++var55) {
            for (int var56 = var53; var56 <= var54; ++var56) {
                if (var51 == var55 || var52 == var55 || var53 == var56 || var54 == var56) {
                    int var57 = this.field106.method285(var56, 0, var55, field108);
                    if (var57 != -1) {
                        this.field106.method296(3, (byte) 16, var57);
                    }
                    int var58 = this.field106.method285(var56, 1, var55, field108);
                    if (var58 != -1) {
                        this.field106.method296(3, (byte) 16, var58);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(B)V")
    public final void method44(byte arg0) {
        this.method47(3);
        if (this.field42 == 1) {
            this.field372[this.field41 / 100].method219(448, this.field40 - 8 - 4, this.field39 - 8 - 4);
        }
        if (this.field42 == 2) {
            this.field372[this.field41 / 100 + 4].method219(448, this.field40 - 8 - 4, this.field39 - 8 - 4);
        }
        if (this.field114 != -1) {
            this.method20(this.field114, this.field417, -208);
            this.method140(0, class58.field1405[this.field114], 0, 1, 0);
        }
        if (this.field255 != -1) {
            this.method20(this.field255, this.field417, -208);
            this.method140(0, class58.field1405[this.field255], 0, 1, 0);
        }
        this.method14(792);
        if (arg0 != -114) {
            this.field329.method392(154);
        }
        if (!this.field345) {
            this.method95((byte) -110);
            this.method65(0);
        } else if (this.field333 == 0) {
            this.method104(true);
        }
        if (this.field344 == 1) {
            this.field422[1].method219(448, 296, 472);
        }
        if (field234) {
            short var2 = 507;
            byte var3 = 20;
            int var4 = 16776960;
            if (super.field960 < 15) {
                var4 = 16711680;
            }
            this.field390.method252("Fps:" + super.field960, (byte) 28, var2, var4, var3);
            int var12 = var3 + 15;
            Runtime var5 = Runtime.getRuntime();
            int var6 = (int) ((var5.totalMemory() - var5.freeMemory()) / 1024L);
            int var7 = 16776960;
            if (var6 > 33554432 && field412) {
                int var8 = 16711680;
            }
            this.field390.method252("Mem:" + var6 + "k", (byte) 28, var2, 16776960, var12);
            var12 += 15;
        }
        if (this.field84 != 0) {
            int var9 = this.field84 / 50;
            int var10 = var9 / 60;
            int var11 = var9 % 60;
            if (var11 < 10) {
                this.field390.method257(4, "System update in: " + var10 + ":0" + var11, 329, 16776960, 0);
            } else {
                this.field390.method257(4, "System update in: " + var10 + ":" + var11, 329, 16776960, 0);
            }
        }
    }

    @OriginalMember(owner = "client", name = "i", descriptor = "(I)V")
    public final void method45(int arg0) {
        if (arg0 != 0) {
            this.field439 = this.field413.method402();
        }
        if (this.field250 == 0) {
            int var2 = super.field962 / 2 - 80;
            int var3 = super.field963 / 2 + 20;
            int var14 = var3 + 20;
            if (super.field978 == 1 && super.field979 >= var2 - 75 && super.field979 <= var2 + 75 && super.field980 >= var14 - 20 && super.field980 <= var14 + 20) {
                this.field250 = 3;
                this.field280 = 0;
            }
            int var4 = super.field962 / 2 + 80;
            if (super.field978 == 1 && super.field979 >= var4 - 75 && super.field979 <= var4 + 75 && super.field980 >= var14 - 20 && super.field980 <= var14 + 20) {
                this.field476 = "";
                this.field477 = "Enter your username & password.";
                this.field250 = 2;
                this.field280 = 0;
            }
        } else if (this.field250 == 2) {
            int var5 = super.field963 / 2 - 40;
            int var15 = var5 + 30;
            int var16 = var15 + 25;
            if (super.field978 == 1 && super.field980 >= var16 - 15 && super.field980 < var16) {
                this.field280 = 0;
            }
            var5 = var16 + 15;
            if (super.field978 == 1 && super.field980 >= var5 - 15 && super.field980 < var5) {
                this.field280 = 1;
            }
            var5 += 15;
            int var6 = super.field962 / 2 - 80;
            int var7 = super.field963 / 2 + 50;
            int var17 = var7 + 20;
            if (super.field978 == 1 && super.field979 >= var6 - 75 && super.field979 <= var6 + 75 && super.field980 >= var17 - 20 && super.field980 <= var17 + 20) {
                this.field486 = 0;
                this.method77(this.field103, this.field104, false);
                if (this.field321) {
                    return;
                }
            }
            int var8 = super.field962 / 2 + 80;
            if (super.field978 == 1 && super.field979 >= var8 - 75 && super.field979 <= var8 + 75 && super.field980 >= var17 - 20 && super.field980 <= var17 + 20) {
                this.field250 = 0;
                this.field103 = "";
                this.field104 = "";
            }
            while (true) {
                while (true) {
                    int var9 = this.method372(this.field475);
                    if (var9 == -1) {
                        return;
                    }
                    boolean var10 = false;
                    for (int var11 = 0; var11 < field301.length(); ++var11) {
                        if (var9 == field301.charAt(var11)) {
                            var10 = true;
                            break;
                        }
                    }
                    if (this.field280 == 0) {
                        if (var9 == 8 && this.field103.length() > 0) {
                            this.field103 = this.field103.substring(0, this.field103.length() - 1);
                        }
                        if (var9 == 9 || var9 == 10 || var9 == 13) {
                            this.field280 = 1;
                        }
                        if (var10) {
                            this.field103 = this.field103 + (char) var9;
                        }
                        if (this.field103.length() > 12) {
                            this.field103 = this.field103.substring(0, 12);
                        }
                    } else if (this.field280 == 1) {
                        if (var9 == 8 && this.field104.length() > 0) {
                            this.field104 = this.field104.substring(0, this.field104.length() - 1);
                        }
                        if (var9 == 9 || var9 == 10 || var9 == 13) {
                            this.field280 = 0;
                        }
                        if (var10) {
                            this.field104 = this.field104 + (char) var9;
                        }
                        if (this.field104.length() > 20) {
                            this.field104 = this.field104.substring(0, 20);
                        }
                    }
                }
            }
        } else {
            if (this.field250 == 3) {
                int var12 = super.field962 / 2;
                int var13 = super.field963 / 2 + 50;
                int var18 = var13 + 20;
                if (super.field978 == 1 && super.field979 >= var12 - 75 && super.field979 <= var12 + 75 && super.field980 >= var18 - 20 && super.field980 <= var18 + 20) {
                    this.field250 = 0;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(JZ)V")
    public final void method46(long arg0, boolean arg1) {
        if (!arg1) {
            this.field487 = this.field449.method387();
        }
        if (arg0 != 0L) {
            for (int var4 = 0; var4 < this.field447; ++var4) {
                if (this.field490[var4] == arg0) {
                    --this.field447;
                    this.field177 = true;
                    for (int var5 = var4; var5 < this.field447; ++var5) {
                        this.field194[var5] = this.field194[var5 + 1];
                        this.field110[var5] = this.field110[var5 + 1];
                        this.field490[var5] = this.field490[var5 + 1];
                    }
                    this.field329.method391(205, 926);
                    this.field329.method398(true, arg0);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "j", descriptor = "(I)V")
    public final void method47(int arg0) {
        if (this.field504 != 0) {
            class19 var2 = this.field390;
            if (arg0 != 3) {
                this.field439 = -1;
            }
            int var3 = 0;
            if (this.field84 != 0) {
                var3 = 1;
            }
            for (int var4 = 0; var4 < 100; ++var4) {
                if (this.field207[var4] != null) {
                    int var5 = this.field205[var4];
                    String var6 = this.field206[var4];
                    byte var7 = 0;
                    if (var6 != null && var6.startsWith("@cr1@")) {
                        var6 = var6.substring(5);
                        var7 = 1;
                    }
                    if (var6 != null && var6.startsWith("@cr2@")) {
                        var6 = var6.substring(5);
                        var7 = 2;
                    }
                    if ((var5 == 3 || var5 == 7) && (var5 == 7 || this.field419 == 0 || this.field419 == 1 && this.method36(var6, this.field244))) {
                        int var8 = 329 - var3 * 13;
                        byte var9 = 4;
                        var2.method257(var9, "From", var8, 0, 0);
                        var2.method257(var9, "From", var8 - 1, 65535, 0);
                        int var10 = var9 + var2.method255("From ", 0);
                        if (var7 == 1) {
                            this.field241[0].method446(448, var8 - 12, var10);
                            var10 += 14;
                        }
                        if (var7 == 2) {
                            this.field241[1].method446(448, var8 - 12, var10);
                            var10 += 14;
                        }
                        var2.method257(var10, var6 + ": " + this.field207[var4], var8, 0, 0);
                        var2.method257(var10, var6 + ": " + this.field207[var4], var8 - 1, 65535, 0);
                        ++var3;
                        if (var3 >= 5) {
                            return;
                        }
                    }
                    if (var5 == 5 && this.field419 < 2) {
                        int var11 = 329 - var3 * 13;
                        var2.method257(4, this.field207[var4], var11, 0, 0);
                        var2.method257(4, this.field207[var4], var11 - 1, 65535, 0);
                        ++var3;
                        if (var3 >= 5) {
                            return;
                        }
                    }
                    if (var5 == 6 && this.field419 < 2) {
                        int var12 = 329 - var3 * 13;
                        var2.method257(4, "To " + var6 + ": " + this.field207[var4], var12, 0, 0);
                        var2.method257(4, "To " + var6 + ": " + this.field207[var4], var12 - 1, 65535, 0);
                        ++var3;
                        if (var3 >= 5) {
                            return;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "k", descriptor = "(I)V")
    public final void method48(int arg0) {
        if (arg0 < 0) {
            if (field412 && this.field430 == 2 && class28.field945 != this.field307) {
                this.field91.method529(false);
                this.field390.method253("Loading - please wait.", 257, 151, 0, this.field264);
                this.field390.method253("Loading - please wait.", 256, 150, 16777215, this.field264);
                this.field91.method530((byte) 9, 4, 4, super.field964);
                this.field430 = 1;
                this.field437 = System.currentTimeMillis();
            }
            if (this.field430 == 1) {
                int var2 = this.method49((byte) -45);
                if (var2 != 0 && System.currentTimeMillis() - this.field437 > 360000L) {
                    signlink.reporterror(this.field103 + " glcfb " + this.field113 + "," + var2 + "," + field412 + "," + this.field171[0] + "," + this.field106.method280() + "," + this.field307 + "," + this.field199 + "," + this.field200);
                    this.field437 = System.currentTimeMillis();
                }
            }
            if (this.field430 == 2 && this.field373 != this.field307) {
                this.field373 = this.field307;
                this.method97(this.field307, true);
            }
        }
    }

    @OriginalMember(owner = "client", name = "h", descriptor = "(B)I")
    public final int method49(byte arg0) {
        for (int var2 = 0; var2 < this.field170.length; ++var2) {
            if (this.field170[var2] == null && this.field385[var2] != -1) {
                return -1;
            }
            if (this.field493[var2] == null && this.field386[var2] != -1) {
                return -2;
            }
        }
        boolean var3 = true;
        for (int var4 = 0; var4 < this.field170.length; ++var4) {
            byte[] var5 = this.field493[var4];
            if (var5 != null) {
                int var6 = (this.field384[var4] >> 8) * 64 - this.field223;
                int var7 = (this.field384[var4] & 255) * 64 - this.field224;
                if (this.field172) {
                    var6 = 10;
                    var7 = 10;
                }
                var3 &= class28.method354(var5, var6, (byte) -102, var7);
            }
        }
        if (arg0 != -45) {
            field469 = !field469;
        }
        if (!var3) {
            return -3;
        } else if (this.field471) {
            return -4;
        } else {
            this.field430 = 2;
            class28.field945 = this.field307;
            this.method43(this.field320);
            this.field329.method391(132, 926);
            return 0;
        }
    }

    @OriginalMember(owner = "client", name = "l", descriptor = "(I)V")
    public final void method50(int arg0) {
        for (int var2 = -1; var2 < this.field287; ++var2) {
            int var6;
            if (var2 == -1) {
                var6 = this.field285;
            } else {
                var6 = this.field288[var2];
            }
            class1 var7 = this.field286[var6];
            if (var7 != null && var7.field1694 > 0) {
                --var7.field1694;
                if (var7.field1694 == 0) {
                    var7.field1688 = null;
                }
            }
        }
        if (arg0 == 0) {
            for (int var3 = 0; var3 < this.field445; ++var3) {
                int var4 = this.field446[var3];
                class54 var5 = this.field444[var4];
                if (var5 != null && var5.field1694 > 0) {
                    --var5.field1694;
                    if (var5.field1694 == 0) {
                        var5.field1688 = null;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "run", descriptor = "()V")
    public final void run() {
        if (this.field109) {
            this.method142(0);
        } else {
            super.run();
        }
    }

    @OriginalMember(owner = "client", name = "m", descriptor = "(I)V")
    public final void method51(int arg0) {
        int var2 = 94 / arg0;
        if (this.field460 == null) {
            super.field965 = null;
            this.field92 = null;
            this.field90 = null;
            this.field89 = null;
            this.field91 = null;
            this.field325 = null;
            this.field326 = null;
            this.field327 = null;
            this.field463 = new class55(265, 128, (byte) 22, this.method71(field322));
            class53.method519(false);
            this.field464 = new class55(265, 128, (byte) 22, this.method71(field322));
            class53.method519(false);
            this.field460 = new class55(171, 509, (byte) 22, this.method71(field322));
            class53.method519(false);
            this.field461 = new class55(132, 360, (byte) 22, this.method71(field322));
            class53.method519(false);
            this.field462 = new class55(200, 360, (byte) 22, this.method71(field322));
            class53.method519(false);
            this.field465 = new class55(238, 202, (byte) 22, this.method71(field322));
            class53.method519(false);
            this.field466 = new class55(238, 203, (byte) 22, this.method71(field322));
            class53.method519(false);
            this.field467 = new class55(94, 74, (byte) 22, this.method71(field322));
            class53.method519(false);
            this.field468 = new class55(94, 75, (byte) 22, this.method71(field322));
            class53.method519(false);
            if (this.field236 != null) {
                this.method149(6);
                this.method10(7);
            }
            this.field451 = true;
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(II)V")
    public final void method52(int arg0, int arg1) {
        int var3 = class14.field678[arg0].field686;
        if (arg1 <= 0) {
            this.field439 = -1;
        }
        if (var3 != 0) {
            int var4 = this.field455[arg0];
            if (var3 == 1) {
                if (var4 == 1) {
                    class25.method307(0.9D, 3);
                }
                if (var4 == 2) {
                    class25.method307(0.8D, 3);
                }
                if (var4 == 3) {
                    class25.method307(0.7D, 3);
                }
                if (var4 == 4) {
                    class25.method307(0.6D, 3);
                }
                class32.field1028.method154();
                this.field451 = true;
            }
            if (var3 == 3) {
                boolean var5 = this.field164;
                if (var4 == 0) {
                    this.method40((byte) 5, this.field164, 0);
                    this.field164 = true;
                }
                if (var4 == 1) {
                    this.method40((byte) 5, this.field164, -400);
                    this.field164 = true;
                }
                if (var4 == 2) {
                    this.method40((byte) 5, this.field164, -800);
                    this.field164 = true;
                }
                if (var4 == 3) {
                    this.method40((byte) 5, this.field164, -1200);
                    this.field164 = true;
                }
                if (var4 == 4) {
                    this.field164 = false;
                }
                if (this.field164 != var5 && !field412) {
                    if (this.field164) {
                        this.field100 = this.field492;
                        this.field101 = true;
                        this.field106.method284(2, this.field100);
                    } else {
                        this.method24(false);
                    }
                    this.field63 = 0;
                }
            }
            if (var3 == 4) {
                if (var4 == 0) {
                    this.field86 = true;
                    this.method114(0, 1);
                }
                if (var4 == 1) {
                    this.field86 = true;
                    this.method114(-400, 1);
                }
                if (var4 == 2) {
                    this.field86 = true;
                    this.method114(-800, 1);
                }
                if (var4 == 3) {
                    this.field86 = true;
                    this.method114(-1200, 1);
                }
                if (var4 == 4) {
                    this.field86 = false;
                }
            }
            if (var3 == 5) {
                this.field115 = var4;
            }
            if (var3 == 6) {
                this.field203 = var4;
            }
            if (var3 == 8) {
                this.field504 = var4;
                this.field260 = true;
            }
            if (var3 == 9) {
                this.field509 = var4;
            }
        }
    }

    @OriginalMember(owner = "client", name = "n", descriptor = "(I)V")
    private final void method53(int arg0) {
        if (arg0 != 9891) {
            this.field439 = -1;
        }
        if (this.field430 == 2) {
            for (class48 var2 = (class48) this.field253.method451(); var2 != null; var2 = (class48) this.field253.method453((byte) 5)) {
                if (var2.field1294 > 0) {
                    --var2.field1294;
                }
                if (var2.field1294 == 0) {
                    if (var2.field1283 < 0 || class28.method360(500, var2.field1285, var2.field1283)) {
                        this.method76(var2.field1284, var2.field1289, var2.field1286, var2.field1287, var2.field1285, var2.field1283, var2.field1288, -23954);
                        var2.method156();
                    }
                } else {
                    if (var2.field1290 > 0) {
                        --var2.field1290;
                    }
                    if (var2.field1290 == 0 && var2.field1288 >= 1 && var2.field1289 >= 1 && var2.field1288 <= 102 && var2.field1289 <= 102 && (var2.field1291 < 0 || class28.method360(500, var2.field1293, var2.field1291))) {
                        this.method76(var2.field1292, var2.field1289, var2.field1286, var2.field1287, var2.field1293, var2.field1291, var2.field1288, -23954);
                        var2.field1290 = -1;
                        if (var2.field1291 == var2.field1283 && var2.field1283 == -1) {
                            var2.method156();
                        } else if (var2.field1291 == var2.field1283 && var2.field1292 == var2.field1284 && var2.field1293 == var2.field1285) {
                            var2.method156();
                        }
                    }
                }
            }
            ++field518;
            if (field518 > 55) {
                field518 = 0;
                this.field329.method391(139, 926);
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(II)V")
    public final void method54(int arg0, int arg1) {
        class36 var3 = this.field420[this.field307][arg0][arg1];
        if (var3 == null) {
            this.field174.method179(this.field307, arg0, arg1);
        } else {
            int var4 = -99999999;
            class67 var5 = null;
            for (class67 var6 = (class67) var3.method451(); var6 != null; var6 = (class67) var3.method453((byte) 5)) {
                class32 var11 = class32.method380(var6.field1625);
                int var12 = var11.field1019;
                if (var11.field998) {
                    var12 = (var6.field1626 + 1) * var12;
                }
                if (var12 > var4) {
                    var4 = var12;
                    var5 = var6;
                }
            }
            var3.method449(var5, this.field269);
            class67 var7 = null;
            class67 var8 = null;
            for (class67 var9 = (class67) var3.method451(); var9 != null; var9 = (class67) var3.method453((byte) 5)) {
                if (var5.field1625 != var9.field1625 && var7 == null) {
                    var7 = var9;
                }
                if (var5.field1625 != var9.field1625 && var7.field1625 != var9.field1625 && var8 == null) {
                    var8 = var9;
                }
            }
            int var10 = (arg1 << 7) + arg0 + 1610612736;
            this.field174.method165(var10, (byte) 5, var5, this.method141((byte) 76, arg1 * 128 + 64, this.field307, arg0 * 128 + 64), var7, arg0, this.field307, var8, arg1);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IZILDUMEPGRH;)V")
    public final void method55(int arg0, boolean arg1, int arg2, class10 arg3) {
        int var5 = arg0 * arg0 + arg2 * arg2;
        if (arg1) {
            for (int var6 = 1; var6 > 0; ++var6) {
            }
        }
        if (var5 > 4225 && var5 < 90000) {
            int var7 = this.field81 + this.field431 & 2047;
            int var8 = class27.field913[var7];
            int var9 = class27.field914[var7];
            int var10 = var8 * 256 / (this.field270 + 256);
            int var11 = var9 * 256 / (this.field270 + 256);
            int var12 = arg0 * var11 + arg2 * var10 >> 16;
            int var13 = arg2 * var11 - arg0 * var10 >> 16;
            double var14 = Math.atan2((double) var12, (double) var13);
            int var16 = (int) (Math.sin(var14) * 63.0D);
            int var17 = (int) (Math.cos(var14) * 57.0D);
            this.field283.method224(15, 20, 4, 83 - var17 - 20, var16 + 94 + 4 - 10, 256, var14, 15, 20);
        } else {
            this.method81(arg0, 225, arg2, arg3);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LULLVQOAK;B)Z")
    public final boolean method56(class58 arg0, byte arg1) {
        if (arg1 != 95) {
            this.field166 = -94;
        }
        int var3 = arg0.field1422;
        if ((var3 < 1 || var3 > 200) && (var3 < 701 || var3 > 900)) {
            if (var3 >= 401 && var3 <= 500) {
                this.field179[this.field414] = "Remove @whi@" + arg0.field1445;
                this.field359[this.field414] = 215;
                ++this.field414;
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
            this.field179[this.field414] = "Remove @whi@" + this.field194[var3];
            this.field359[this.field414] = 484;
            ++this.field414;
            this.field179[this.field414] = "Message @whi@" + this.field194[var3];
            this.field359[this.field414] = 403;
            ++this.field414;
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IJ)V")
    public final void method57(int arg0, long arg1) {
        if (arg1 != 0L) {
            for (int var4 = 0; var4 < this.field251; ++var4) {
                if (this.field339[var4] == arg1) {
                    --this.field251;
                    this.field177 = true;
                    for (int var5 = var4; var5 < this.field251; ++var5) {
                        this.field339[var5] = this.field339[var5 + 1];
                    }
                    this.field329.method391(97, 926);
                    this.field329.method398(true, arg1);
                    break;
                }
            }
            if (arg0 != 0) {
                this.field420 = null;
            }
        }
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(Z)V")
    public final void method58(boolean arg0) {
        if (!arg0) {
            this.field487 = this.field449.method387();
        }
        if (this.field59 == 0) {
            if (super.field978 == 1) {
                int var2 = super.field979 - 25 - 550;
                int var3 = super.field980 - 5 - 4;
                if (var2 >= 0 && var3 >= 0 && var2 < 146 && var3 < 151) {
                    var2 -= 73;
                    var3 -= 75;
                    int var4 = this.field81 + this.field431 & 2047;
                    int var5 = class25.field819[var4];
                    int var6 = class25.field820[var4];
                    int var7 = (this.field270 + 256) * var5 >> 8;
                    int var8 = (this.field270 + 256) * var6 >> 8;
                    int var9 = var2 * var8 + var3 * var7 >> 11;
                    int var10 = var3 * var8 - var2 * var7 >> 11;
                    int var11 = field132.field1643 + var9 >> 7;
                    int var12 = field132.field1644 - var10 >> 7;
                    boolean var13 = this.method98(var11, field132.field1641[0], this.field195, 0, 0, 0, true, 1, 0, var12, 0, field132.field1642[0]);
                    if (var13) {
                        this.field329.method392(var2);
                        this.field329.method392(var3);
                        this.field329.method393(this.field81);
                        this.field329.method392(57);
                        this.field329.method392(this.field431);
                        this.field329.method392(this.field270);
                        this.field329.method392(89);
                        this.field329.method393(field132.field1643);
                        this.field329.method393(field132.field1644);
                        this.field329.method392(this.field502);
                        this.field329.method392(63);
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BI)Ljava/lang/String;")
    public final String method59(byte arg0, int arg1) {
        if (arg0 != 7) {
            throw new NullPointerException();
        } else {
            return arg1 < 999999999 ? String.valueOf(arg1) : "*";
        }
    }

    @OriginalMember(owner = "client", name = "init", descriptor = "()V")
    public final void init() {
        field409 = Integer.parseInt(this.getParameter("nodeid"));
        field410 = Integer.parseInt(this.getParameter("portoff"));
        String var1 = this.getParameter("lowmem");
        if (var1 != null && var1.equals("1")) {
            method60(9);
        } else {
            method62(-208);
        }
        String var2 = this.getParameter("free");
        if (var2 != null && var2.equals("1")) {
            field411 = false;
        } else {
            field411 = true;
        }
        this.method369(11004, 765, 503);
    }

    @OriginalMember(owner = "client", name = "o", descriptor = "(I)V")
    public static final void method60(int arg0) {
        class7.field554 = true;
        class25.field810 = true;
        field412 = true;
        class28.field924 = true;
        if (arg0 >= 9 && arg0 <= 9) {
            class59.field1468 = true;
        }
    }

    @OriginalMember(owner = "client", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        if (signlink.mainapp != null) {
            return signlink.mainapp.getCodeBase();
        } else {
            try {
                if (super.field967 != null) {
                    return new URL("http://127.0.0.1:" + (field410 + 80));
                }
            } catch (Exception var1) {
            }
            return super.getCodeBase();
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(Z)V")
    public final void method61(boolean arg0) {
        this.field321 &= arg0;
        if (!this.field51 && !this.field94 && !this.field216) {
            ++field246;
            if (!this.field321) {
                this.method45(0);
            } else {
                this.method41(-558);
            }
            this.method94(0);
        }
    }

    @OriginalMember(owner = "client", name = "p", descriptor = "(I)V")
    public static final void method62(int arg0) {
        class7.field554 = false;
        class25.field810 = false;
        field412 = false;
        class28.field924 = false;
        if (arg0 >= 0) {
            field469 = !field469;
        }
        class59.field1468 = false;
    }

    @OriginalMember(owner = "client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        try {
            System.out.println("RS2 user client - release #" + 327);
            if (arg0.length != 5) {
                System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
            } else {
                field409 = Integer.parseInt(arg0[0]);
                field410 = Integer.parseInt(arg0[1]);
                if (arg0[2].equals("lowmem")) {
                    method60(9);
                } else {
                    if (!arg0[2].equals("highmem")) {
                        System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
                        return;
                    }
                    method62(-208);
                }
                if (arg0[3].equals("free")) {
                    field411 = false;
                } else {
                    if (!arg0[3].equals("members")) {
                        System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
                        return;
                    }
                    field411 = true;
                }
                signlink.storeid = Integer.parseInt(arg0[4]);
                signlink.startpriv(InetAddress.getLocalHost());
                client var1 = new client();
                var1.method368(-242, 765, 503);
            }
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client", name = "q", descriptor = "(I)V")
    public final void method63(int arg0) {
        if (this.field394 == 2) {
            this.method85((this.field276 - this.field224 << 7) + this.field279, (byte) 72, this.field277 * 2, (this.field275 - this.field223 << 7) + this.field278);
            this.field438 += arg0;
            if (this.field87 > -1 && field246 % 20 < 10) {
                this.field422[2].method219(448, this.field88 - 28, this.field87 - 12);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
    public final void method64(Runnable arg0, int arg1) {
        if (arg1 > 10) {
            arg1 = 10;
        }
        if (signlink.mainapp != null) {
            signlink.startthread(arg0, arg1);
        } else {
            super.method64(arg0, arg1);
        }
    }

    @OriginalMember(owner = "client", name = "r", descriptor = "(I)V")
    public final void method65(int arg0) {
        if (this.field414 >= 2 || this.field54 != 0 || this.field43 != 0) {
            this.field438 += arg0;
            String var2;
            if (this.field54 == 1 && this.field414 < 2) {
                var2 = "Use " + this.field58 + " with...";
            } else if (this.field43 == 1 && this.field414 < 2) {
                var2 = this.field46 + "...";
            } else {
                var2 = this.field179[this.field414 - 1];
            }
            if (this.field414 > 2) {
                var2 = var2 + "@whi@ / " + (this.field414 - 2) + " more options";
            }
            this.field391.method262(16777215, var2, true, 4, field246 / 1000, 0, 15);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZZ)V")
    public final void method66(boolean arg0, boolean arg1) {
        this.method51(696);
        if (arg0) {
            field248 = this.field449.method387();
        }
        this.field462.method529(false);
        this.field330.method446(448, 0, 0);
        short var3 = 360;
        short var4 = 200;
        if (this.field250 == 0) {
            int var5 = var4 / 2 + 80;
            this.field389.method254(var3 / 2, var5, 7711145, this.field106.field770, true, false);
            int var6 = var4 / 2 - 20;
            this.field391.method254(var3 / 2, var6, 16776960, "Welcome to RuneScape", true, false);
            int var17 = var6 + 30;
            int var7 = var3 / 2 - 80;
            int var8 = var4 / 2 + 20;
            this.field331.method446(448, var8 - 20, var7 - 73);
            this.field391.method254(var7, var8 + 5, 16777215, "New User", true, false);
            int var9 = var3 / 2 + 80;
            this.field331.method446(448, var8 - 20, var9 - 73);
            this.field391.method254(var9, var8 + 5, 16777215, "Existing User", true, false);
        }
        if (this.field250 == 2) {
            int var10 = var4 / 2 - 40;
            if (this.field476.length() > 0) {
                this.field391.method254(var3 / 2, var10 - 15, 16776960, this.field476, true, false);
                this.field391.method254(var3 / 2, var10, 16776960, this.field477, true, false);
                var10 += 30;
            } else {
                this.field391.method254(var3 / 2, var10 - 7, 16776960, this.field477, true, false);
                var10 += 30;
            }
            this.field391.method261(16777215, var3 / 2 - 90, true, true, "Username: " + this.field103 + (this.field280 == 0 & field246 % 40 < 20 ? "@yel@|" : ""), var10);
            var10 += 15;
            this.field391.method261(16777215, var3 / 2 - 88, true, true, "Password: " + class20.method273(-28858, this.field104) + (this.field280 == 1 & field246 % 40 < 20 ? "@yel@|" : ""), var10);
            var10 += 15;
            if (!arg1) {
                int var11 = var3 / 2 - 80;
                int var12 = var4 / 2 + 50;
                this.field331.method446(448, var12 - 20, var11 - 73);
                this.field391.method254(var11, var12 + 5, 16777215, "Login", true, false);
                int var13 = var3 / 2 + 80;
                this.field331.method446(448, var12 - 20, var13 - 73);
                this.field391.method254(var13, var12 + 5, 16777215, "Cancel", true, false);
            }
        }
        if (this.field250 == 3) {
            this.field391.method254(var3 / 2, var4 / 2 - 60, 16776960, "Create a free account", true, false);
            int var14 = var4 / 2 - 35;
            this.field391.method254(var3 / 2, var14, 16777215, "To create a new account you need to", true, false);
            int var18 = var14 + 15;
            this.field391.method254(var3 / 2, var18, 16777215, "go back to the main RuneScape webpage", true, false);
            int var19 = var18 + 15;
            this.field391.method254(var3 / 2, var19, 16777215, "and choose the red 'create account'", true, false);
            int var20 = var19 + 15;
            this.field391.method254(var3 / 2, var20, 16777215, "button at the top right of that page.", true, false);
            int var21 = var20 + 15;
            int var15 = var3 / 2;
            int var16 = var4 / 2 + 50;
            this.field331.method446(448, var16 - 20, var15 - 73);
            this.field391.method254(var15, var16 + 5, 16777215, "Cancel", true, false);
        }
        this.field462.method530((byte) 9, 171, 202, super.field964);
        if (this.field451) {
            this.field451 = false;
            this.field460.method530((byte) 9, 0, 128, super.field964);
            this.field461.method530((byte) 9, 371, 202, super.field964);
            this.field465.method530((byte) 9, 265, 0, super.field964);
            this.field466.method530((byte) 9, 265, 562, super.field964);
            this.field467.method530((byte) 9, 171, 128, super.field964);
            this.field468.method530((byte) 9, 171, 562, super.field964);
        }
    }

    @OriginalMember(owner = "client", name = "s", descriptor = "(I)V")
    public final void method67(int arg0) {
        if (arg0 != -3619) {
            field108 = !field108;
        }
        if (this.field92 == null) {
            this.method134(0);
            super.field965 = null;
            this.field460 = null;
            this.field461 = null;
            this.field462 = null;
            this.field463 = null;
            this.field464 = null;
            this.field465 = null;
            this.field466 = null;
            this.field467 = null;
            this.field468 = null;
            this.field92 = new class55(96, 479, (byte) 22, this.method71(field322));
            this.field90 = new class55(156, 172, (byte) 22, this.method71(field322));
            class53.method519(false);
            this.field49.method446(448, 0, 0);
            this.field89 = new class55(261, 190, (byte) 22, this.method71(field322));
            this.field91 = new class55(334, 512, (byte) 22, this.method71(field322));
            class53.method519(false);
            this.field325 = new class55(50, 496, (byte) 22, this.method71(field322));
            this.field326 = new class55(37, 269, (byte) 22, this.method71(field322));
            this.field327 = new class55(45, 249, (byte) 22, this.method71(field322));
            this.field451 = true;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILLDILQFVA;I)V")
    private final void method68(int arg0, class34 arg1, int arg2) {
        if (arg0 != 17449) {
            this.field439 = arg1.method402();
        }
        while (arg1.field1074 + 10 < arg2 * 8) {
            int var4 = arg1.method413(true, 11);
            if (var4 == 2047) {
                break;
            }
            if (this.field286[var4] == null) {
                this.field286[var4] = new class1();
                if (this.field291[var4] != null) {
                    this.field286[var4].method4(this.field291[var4], 8);
                }
            }
            this.field288[this.field287++] = var4;
            class1 var5 = this.field286[var4];
            var5.field1695 = field246;
            int var6 = arg1.method413(true, 5);
            if (var6 > 15) {
                var6 -= 32;
            }
            int var7 = arg1.method413(true, 1);
            int var8 = arg1.method413(true, 1);
            if (var8 == 1) {
                this.field290[this.field289++] = var4;
            }
            int var9 = arg1.method413(true, 5);
            if (var9 > 15) {
                var9 -= 32;
            }
            var5.method577(field132.field1642[0] + var9, (byte) 6, var7 == 1, field132.field1641[0] + var6);
        }
        arg1.method414(false);
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(JI)V")
    public final void method69(long arg0, int arg1) {
        if (arg0 != 0L) {
            if (this.field447 >= 100 && this.field158 != 1) {
                this.method131((byte) -32, "", 0, "Your friendlist is full. Max of 100 for free users, and 200 for members");
            } else if (this.field447 >= 200) {
                this.method131((byte) -32, "", 0, "Your friendlist is full. Max of 100 for free users, and 200 for members");
            } else {
                String var4 = class20.method272(false, class20.method269(arg0, -898));
                for (int var5 = 0; var5 < this.field447; ++var5) {
                    if (this.field490[var5] == arg0) {
                        this.method131((byte) -32, "", 0, var4 + " is already on your friend list");
                        return;
                    }
                }
                for (int var6 = 0; var6 < this.field251; ++var6) {
                    if (this.field339[var6] == arg0) {
                        this.method131((byte) -32, "", 0, "Please remove " + var4 + " from your ignore list first");
                        return;
                    }
                }
                if (!var4.equals(field132.field19)) {
                    this.field194[this.field447] = var4;
                    this.field490[this.field447] = arg0;
                    this.field110[this.field447] = 0;
                    ++this.field447;
                    this.field177 = true;
                    int var7 = 56 / arg1;
                    this.field329.method391(125, 926);
                    this.field329.method398(true, arg0);
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(Z)V")
    public void method70(boolean arg0) {
        System.out.println("============");
        System.out.println("flame-cycle:" + this.field434);
        if (this.field106 != null) {
            System.out.println("Od-cycle:" + this.field106.field783);
        }
        System.out.println("loop-cycle:" + field246);
        this.field321 &= arg0;
        System.out.println("draw-cycle:" + field242);
        System.out.println("ptype:" + this.field439);
        System.out.println("psize:" + this.field438);
        if (this.field282 != null) {
            this.field282.method232(true);
        }
        super.field961 = true;
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(I)Ljava/awt/Component;")
    public final Component method71(int arg0) {
        if (arg0 != 7129) {
            this.method83();
        }
        if (signlink.mainapp != null) {
            return signlink.mainapp;
        } else {
            return super.field967 != null ? super.field967 : this;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IBII)I")
    public final int method72(int arg0, byte arg1, int arg2, int arg3) {
        if (arg1 != -118) {
            for (int var5 = 1; var5 > 0; ++var5) {
            }
        }
        int var6 = 256 - arg0;
        return ((arg2 & 16711935) * var6 + (arg3 & 16711935) * arg0 & -16711936) + ((arg2 & 65280) * var6 + (arg3 & 65280) * arg0 & 16711680) >> 8;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LULLVQOAK;IZ)I")
    public final int method73(class58 arg0, int arg1, boolean arg2) {
        if (arg2) {
            this.field420 = null;
        }
        if (arg0.field1459 != null && arg1 < arg0.field1459.length) {
            try {
                int[] var4 = arg0.field1459[arg1];
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
                        var9 = this.field175[var4[var6++]];
                    }
                    if (var8 == 2) {
                        var9 = this.field163[var4[var6++]];
                    }
                    if (var8 == 3) {
                        var9 = this.field75[var4[var6++]];
                    }
                    if (var8 == 4) {
                        class58 var11 = class58.field1405[var4[var6++]];
                        int var12 = var4[var6++];
                        if (var12 >= 0 && var12 < class32.field1004 && (!class32.method380(var12).field1048 || field411)) {
                            for (int var13 = 0; var13 < var11.field1400.length; ++var13) {
                                if (var12 + 1 == var11.field1400[var13]) {
                                    var9 += var11.field1440[var13];
                                }
                            }
                        }
                    }
                    if (var8 == 5) {
                        var9 = this.field455[var4[var6++]];
                    }
                    if (var8 == 6) {
                        var9 = field453[this.field163[var4[var6++]] - 1];
                    }
                    if (var8 == 7) {
                        var9 = this.field455[var4[var6++]] * 100 / 46875;
                    }
                    if (var8 == 8) {
                        var9 = field132.field12;
                    }
                    if (var8 == 9) {
                        for (int var14 = 0; var14 < class47.field1280; ++var14) {
                            if (class47.field1282[var14]) {
                                var9 += this.field163[var14];
                            }
                        }
                    }
                    if (var8 == 10) {
                        class58 var15 = class58.field1405[var4[var6++]];
                        int var16 = var4[var6++] + 1;
                        if (var16 >= 0 && var16 < class32.field1004 && (!class32.method380(var16).field1048 || field411)) {
                            for (int var17 = 0; var17 < var15.field1400.length; ++var17) {
                                if (var15.field1400[var17] == var16) {
                                    var9 = 999999999;
                                    break;
                                }
                            }
                        }
                    }
                    if (var8 == 11) {
                        var9 = this.field229;
                    }
                    if (var8 == 12) {
                        var9 = this.field135;
                    }
                    if (var8 == 13) {
                        int var18 = this.field455[var4[var6++]];
                        int var19 = var4[var6++];
                        var9 = (var18 & 1 << var19) != 0 ? 1 : 0;
                    }
                    if (var8 == 14) {
                        int var20 = var4[var6++];
                        class37 var21 = class37.field1110[var20];
                        int var22 = var21.field1112;
                        int var23 = var21.field1113;
                        int var24 = var21.field1114;
                        int var25 = field176[var24 - var23];
                        var9 = this.field455[var22] >> var23 & var25;
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
                        var9 = (field132.field1643 >> 7) + this.field223;
                    }
                    if (var8 == 19) {
                        var9 = (field132.field1644 >> 7) + this.field224;
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

    @OriginalMember(owner = "client", name = "i", descriptor = "(B)V")
    public final void method74(byte arg0) {
        try {
            if (this.field282 != null) {
                this.field282.method227();
            }
        } catch (Exception var3) {
        }
        this.field282 = null;
        this.field321 = false;
        if (arg0 != -10) {
            field116 = 70;
        }
        this.field250 = 0;
        this.field103 = "";
        this.field104 = "";
        this.method115(true);
        this.field174.method158(-202);
        for (int var2 = 0; var2 < 4; ++var2) {
            this.field485[var2].method240();
        }
        System.gc();
        this.method24(false);
        this.field492 = -1;
        this.field100 = -1;
        this.field63 = 0;
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(IIIIII)V")
    public final void method75(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = this.field174.method184(arg2, arg0, arg4);
        if (var7 != 0) {
            int var8 = this.field174.method188(arg2, arg0, arg4, var7);
            int var9 = var8 >> 6 & 3;
            int var10 = var8 & 31;
            int var11 = arg1;
            if (var7 > 0) {
                var11 = arg3;
            }
            int[] var12 = this.field300.field631;
            int var13 = (103 - arg4) * 512 * 4 + arg0 * 4 + 24624;
            int var14 = var7 >> 14 & 32767;
            class59 var15 = class59.method555(var14);
            if (var15.field1504 != -1) {
                class35 var16 = this.field265[var15.field1504];
                if (var16 != null) {
                    int var17 = (var15.field1506 * 4 - var16.field1093) / 2;
                    int var18 = (var15.field1472 * 4 - var16.field1094) / 2;
                    var16.method446(448, (104 - arg4 - var15.field1472) * 4 + 48 + var18, arg0 * 4 + 48 + var17);
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
        int var19 = this.field174.method186(arg2, arg0, arg4);
        if (arg5 < 0) {
            if (var19 != 0) {
                int var20 = this.field174.method188(arg2, arg0, arg4, var19);
                int var21 = var20 >> 6 & 3;
                int var22 = var20 & 31;
                int var23 = var19 >> 14 & 32767;
                class59 var24 = class59.method555(var23);
                if (var24.field1504 != -1) {
                    class35 var25 = this.field265[var24.field1504];
                    if (var25 != null) {
                        int var26 = (var24.field1506 * 4 - var25.field1093) / 2;
                        int var27 = (var24.field1472 * 4 - var25.field1094) / 2;
                        var25.method446(448, (104 - arg4 - var24.field1472) * 4 + 48 + var27, arg0 * 4 + 48 + var26);
                    }
                } else if (var22 == 9) {
                    int var28 = 15658734;
                    if (var19 > 0) {
                        var28 = 15597568;
                    }
                    int[] var29 = this.field300.field631;
                    int var30 = (103 - arg4) * 512 * 4 + arg0 * 4 + 24624;
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
            int var31 = this.field174.method187(arg2, arg0, arg4);
            if (var31 != 0) {
                int var32 = var31 >> 14 & 32767;
                class59 var33 = class59.method555(var32);
                if (var33.field1504 != -1) {
                    class35 var34 = this.field265[var33.field1504];
                    if (var34 != null) {
                        int var35 = (var33.field1506 * 4 - var34.field1093) / 2;
                        int var36 = (var33.field1472 * 4 - var34.field1094) / 2;
                        var34.method446(448, (104 - arg4 - var33.field1472) * 4 + 48 + var36, arg0 * 4 + 48 + var35);
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIIIII)V")
    private final void method76(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg7 != -23954) {
            this.field267 = 464;
        }
        if (arg6 >= 1 && arg1 >= 1 && arg6 <= 102 && arg1 <= 102) {
            if (field412 && this.field307 != arg2) {
                return;
            }
            int var9 = 0;
            boolean var10 = true;
            boolean var11 = false;
            boolean var12 = false;
            if (arg3 == 0) {
                var9 = this.field174.method184(arg2, arg6, arg1);
            }
            if (arg3 == 1) {
                var9 = this.field174.method185(arg2, arg6, arg1, 3);
            }
            if (arg3 == 2) {
                var9 = this.field174.method186(arg2, arg6, arg1);
            }
            if (arg3 == 3) {
                var9 = this.field174.method187(arg2, arg6, arg1);
            }
            if (var9 != 0) {
                int var13 = this.field174.method188(arg2, arg6, arg1, var9);
                int var14 = var9 >> 14 & 32767;
                int var15 = var13 & 31;
                int var16 = var13 >> 6;
                if (arg3 == 0) {
                    this.field174.method175(-416, arg1, arg6, arg2);
                    class59 var17 = class59.method555(var14);
                    if (var17.field1480) {
                        this.field485[arg2].method245(arg1, 5104, var17.field1489, arg6, var15, var16);
                    }
                }
                if (arg3 == 1) {
                    this.field174.method176(false, arg6, arg2, arg1);
                }
                if (arg3 == 2) {
                    this.field174.method177(arg2, true, arg1, arg6);
                    class59 var18 = class59.method555(var14);
                    if (var18.field1506 + arg6 > 103 || var18.field1506 + arg1 > 103 || var18.field1472 + arg6 > 103 || var18.field1472 + arg1 > 103) {
                        return;
                    }
                    if (var18.field1480) {
                        this.field485[arg2].method246(var18.field1489, var18.field1506, var18.field1472, 0, arg6, var16, arg1);
                    }
                }
                if (arg3 == 3) {
                    this.field174.method178(9, arg6, arg2, arg1);
                    class59 var19 = class59.method555(var14);
                    if (var19.field1480 && var19.field1478) {
                        this.field485[arg2].method248(arg1, (byte) 3, arg6);
                    }
                }
            }
            if (arg5 >= 0) {
                int var20 = arg2;
                if (arg2 < 3 && (this.field479[1][arg6][arg1] & 2) == 2) {
                    var20 = arg2 + 1;
                }
                class28.method350(this.field292, arg2, arg1, var20, arg4, this.field52, this.field174, arg0, arg5, arg6, this.field485[arg2]);
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)V")
    public final void method77(String arg0, String arg1, boolean arg2) {
        signlink.errorname = arg0;
        try {
            if (!arg2) {
                this.field476 = "";
                this.field477 = "Connecting to server...";
                this.method66(false, true);
            }
            this.field282 = new class13(this.method105(field410 + 43594), this, (byte) -89);
            long var4 = class20.method268(arg0);
            int var6 = (int) (var4 >> 16 & 31L);
            this.field329.field1073 = 0;
            this.field329.method392(14);
            this.field329.method392(var6);
            this.field282.method231(this.field329.field1072, 2, true, 0);
            for (int var7 = 0; var7 < 8; ++var7) {
                this.field282.method228();
            }
            int var8 = this.field282.method228();
            int var9 = var8;
            if (var8 == 0) {
                this.field282.method230(this.field413.field1072, 0, 8);
                this.field413.field1073 = 0;
                this.field113 = this.field413.method408(0);
                int[] var10 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (this.field113 >> 32), (int) this.field113 };
                this.field329.field1073 = 0;
                this.field329.method392(10);
                this.field329.method396(var10[0]);
                this.field329.method396(var10[1]);
                this.field329.method396(var10[2]);
                this.field329.method396(var10[3]);
                this.field329.method396(signlink.uid);
                this.field329.method399(arg0);
                this.field329.method399(arg1);
                this.field329.method417(715, field416, field111);
                this.field495.field1073 = 0;
                if (arg2) {
                    this.field495.method392(18);
                } else {
                    this.field495.method392(16);
                }
                this.field495.method392(this.field329.field1073 + 36 + 1 + 1 + 2);
                this.field495.method392(255);
                this.field495.method393(327);
                this.field495.method392(field412 ? 1 : 0);
                for (int var11 = 0; var11 < 9; ++var11) {
                    this.field495.method396(this.field370[var11]);
                }
                this.field495.method400(this.field329.field1073, (byte) 48, this.field329.field1072, 0);
                this.field329.field1077 = new class33(-317, var10);
                for (int var12 = 0; var12 < 4; ++var12) {
                    var10[var12] += 50;
                }
                this.field449 = new class33(-317, var10);
                this.field282.method231(this.field495.field1072, this.field495.field1073, true, 0);
                var8 = this.field282.method228();
            }
            if (var8 == 1) {
                try {
                    Thread.sleep(2000L);
                } catch (Exception var22) {
                }
                this.method77(arg0, arg1, arg2);
            } else if (var8 == 2) {
                this.field145 = this.field282.method228();
                field228 = this.field282.method228() == 1;
                this.field311 = 0L;
                this.field435 = 0;
                this.field515.field997 = 0;
                super.field969 = true;
                this.field424 = true;
                this.field321 = true;
                this.field329.field1073 = 0;
                this.field413.field1073 = 0;
                this.field439 = -1;
                this.field472 = -1;
                this.field473 = -1;
                this.field474 = -1;
                this.field438 = 0;
                this.field440 = 0;
                this.field84 = 0;
                this.field442 = 0;
                this.field394 = 0;
                this.field414 = 0;
                this.field345 = false;
                super.field970 = 0;
                for (int var13 = 0; var13 < 100; ++var13) {
                    this.field207[var13] = null;
                }
                this.field54 = 0;
                this.field43 = 0;
                this.field430 = 0;
                this.field436 = 0;
                this.field395 = (int) (Math.random() * 100.0D) - 50;
                this.field77 = (int) (Math.random() * 110.0D) - 55;
                this.field187 = (int) (Math.random() * 80.0D) - 40;
                this.field431 = (int) (Math.random() * 120.0D) - 60;
                this.field270 = (int) (Math.random() * 30.0D) - 20;
                this.field81 = (int) (Math.random() * 20.0D) - 10 & 2047;
                this.field59 = 0;
                this.field373 = -1;
                this.field298 = 0;
                this.field299 = 0;
                this.field287 = 0;
                this.field445 = 0;
                for (int var14 = 0; var14 < this.field284; ++var14) {
                    this.field286[var14] = null;
                    this.field291[var14] = null;
                }
                for (int var15 = 0; var15 < 16384; ++var15) {
                    this.field444[var15] = null;
                }
                field132 = this.field286[this.field285] = new class1();
                this.field374.method455();
                this.field319.method455();
                for (int var16 = 0; var16 < 4; ++var16) {
                    for (int var17 = 0; var17 < 104; ++var17) {
                        for (int var18 = 0; var18 < 104; ++var18) {
                            this.field420[var16][var17][var18] = null;
                        }
                    }
                }
                this.field253 = new class36(6);
                this.field448 = 0;
                this.field447 = 0;
                this.field186 = -1;
                this.field133 = -1;
                this.field255 = -1;
                this.field139 = -1;
                this.field114 = -1;
                this.field429 = false;
                this.field356 = 3;
                this.field117 = 0;
                this.field345 = false;
                this.field470 = false;
                this.field76 = null;
                this.field344 = 0;
                this.field456 = -1;
                this.field399 = true;
                this.method128(this.field221);
                for (int var19 = 0; var19 < 5; ++var19) {
                    this.field102[var19] = 0;
                }
                for (int var20 = 0; var20 < 5; ++var20) {
                    this.field201[var20] = null;
                    this.field202[var20] = false;
                }
                field198 = 0;
                field169 = 0;
                field173 = 0;
                field144 = 0;
                field252 = 0;
                field489 = 0;
                field500 = 0;
                field405 = 0;
                field137 = 0;
                field85 = 0;
                this.method67(-3619);
            } else if (var8 == 3) {
                this.field476 = "";
                this.field477 = "Invalid username or password.";
            } else if (var8 == 4) {
                this.field476 = "Your account has been disabled.";
                this.field477 = "Please check your message-centre for details.";
            } else if (var8 == 5) {
                this.field476 = "Your account is already logged in.";
                this.field477 = "Try again in 60 secs...";
            } else if (var8 == 6) {
                this.field476 = "RuneScape has been updated!";
                this.field477 = "Please reload this page.";
            } else if (var8 == 7) {
                this.field476 = "This world is full.";
                this.field477 = "Please use a different world.";
            } else if (var8 == 8) {
                this.field476 = "Unable to connect.";
                this.field477 = "Login server offline.";
            } else if (var8 == 9) {
                this.field476 = "Login limit exceeded.";
                this.field477 = "Too many connections from your address.";
            } else if (var8 == 10) {
                this.field476 = "Unable to connect.";
                this.field477 = "Bad session id.";
            } else if (var8 == 11) {
                this.field477 = "Login server rejected session.";
                this.field477 = "Please try again.";
            } else if (var8 == 12) {
                this.field476 = "You need a members account to login to this world.";
                this.field477 = "Please subscribe, or use a different world.";
            } else if (var8 == 13) {
                this.field476 = "Could not complete login.";
                this.field477 = "Please try using a different world.";
            } else if (var8 == 14) {
                this.field476 = "The server is being updated.";
                this.field477 = "Please wait 1 minute and try again.";
            } else if (var8 == 15) {
                this.field321 = true;
                this.field329.field1073 = 0;
                this.field413.field1073 = 0;
                this.field439 = -1;
                this.field472 = -1;
                this.field473 = -1;
                this.field474 = -1;
                this.field438 = 0;
                this.field440 = 0;
                this.field84 = 0;
                this.field414 = 0;
                this.field345 = false;
                this.field437 = System.currentTimeMillis();
            } else if (var8 == 16) {
                this.field476 = "Login attempts exceeded.";
                this.field477 = "Please wait 1 minute and try again.";
            } else if (var8 == 17) {
                this.field476 = "You are standing in a members-only area.";
                this.field477 = "To play on this world move to a free area first";
            } else if (var8 == 20) {
                this.field476 = "Invalid loginserver requested";
                this.field477 = "Please try using a different world.";
            } else if (var8 != 21) {
                if (var8 == -1) {
                    if (var9 == 0) {
                        if (this.field486 < 2) {
                            try {
                                Thread.sleep(2000L);
                            } catch (Exception var24) {
                            }
                            ++this.field486;
                            this.method77(arg0, arg1, arg2);
                        } else {
                            this.field476 = "No response from loginserver";
                            this.field477 = "Please wait 1 minute and try again.";
                        }
                    } else {
                        this.field476 = "No response from server";
                        this.field477 = "Please try using a different world.";
                    }
                } else {
                    System.out.println("response:" + var8);
                    this.field476 = "Unexpected server response";
                    this.field477 = "Please try using a different world.";
                }
            } else {
                int var21 = this.field282.method228();
                for (int var26 = var21 + 3; var26 >= 0; --var26) {
                    this.field476 = "You have only just left another world";
                    this.field477 = "Your profile will be transferred in: " + var26;
                    this.method66(false, true);
                    try {
                        Thread.sleep(1200L);
                    } catch (Exception var23) {
                    }
                }
                this.method77(arg0, arg1, arg2);
            }
        } catch (IOException var25) {
            this.field476 = "";
            this.field477 = "Error connecting to server.";
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "([BII)Z")
    public final boolean method78(byte[] arg0, int arg1, int arg2) {
        if (arg2 != -24435) {
            this.field439 = this.field413.method402();
        }
        return arg0 == null ? true : signlink.wavesave(arg0, arg1);
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LLDILQFVA;II)V")
    private final void method79(class34 arg0, int arg1, int arg2) {
        arg0.method412(false);
        if (arg2 != 5103) {
            this.field420 = null;
        }
        int var4 = arg0.method413(true, 1);
        if (var4 != 0) {
            int var5 = arg0.method413(true, 2);
            if (var5 == 0) {
                this.field290[this.field289++] = this.field285;
            } else if (var5 == 1) {
                int var6 = arg0.method413(true, 3);
                field132.method574(var6, false, false);
                int var7 = arg0.method413(true, 1);
                if (var7 == 1) {
                    this.field290[this.field289++] = this.field285;
                }
            } else if (var5 == 2) {
                int var8 = arg0.method413(true, 3);
                field132.method574(var8, true, false);
                int var9 = arg0.method413(true, 3);
                field132.method574(var9, true, false);
                int var10 = arg0.method413(true, 1);
                if (var10 == 1) {
                    this.field290[this.field289++] = this.field285;
                }
            } else if (var5 == 3) {
                int var11 = arg0.method413(true, 1);
                int var12 = arg0.method413(true, 1);
                if (var12 == 1) {
                    this.field290[this.field289++] = this.field285;
                }
                this.field307 = arg0.method413(true, 2);
                int var13 = arg0.method413(true, 7);
                int var14 = arg0.method413(true, 7);
                field132.method577(var13, (byte) 6, var11 == 1, var14);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIIIIIII)V")
    private final void method80(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        class48 var11 = null;
        for (class48 var12 = (class48) this.field253.method451(); var12 != null; var12 = (class48) this.field253.method453((byte) 5)) {
            if (var12.field1286 == arg0 && var12.field1288 == arg6 && var12.field1289 == arg4 && var12.field1287 == arg5) {
                var11 = var12;
                break;
            }
        }
        if (var11 == null) {
            var11 = new class48();
            var11.field1286 = arg0;
            var11.field1287 = arg5;
            var11.field1288 = arg6;
            var11.field1289 = arg4;
            this.method82(var11, 17905);
            this.field253.method448(var11);
        }
        var11.field1291 = arg8;
        var11.field1293 = arg1;
        var11.field1292 = arg9;
        if (arg2 >= 1 && arg2 <= 1) {
            var11.field1290 = arg3;
            var11.field1294 = arg7;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIILDUMEPGRH;)V")
    public final void method81(int arg0, int arg1, int arg2, class10 arg3) {
        int var5 = this.field81 + this.field431 & 2047;
        int var6 = arg0 * arg0 + arg2 * arg2;
        if (var6 <= 6400) {
            int var7 = class27.field913[var5];
            int var8 = class27.field914[var5];
            int var9 = var7 * 256 / (this.field270 + 256);
            if (arg1 <= 0) {
                this.field423 = 13;
            }
            int var10 = var8 * 256 / (this.field270 + 256);
            int var11 = arg0 * var10 + arg2 * var9 >> 16;
            int var12 = arg2 * var10 - arg0 * var9 >> 16;
            if (var6 > 2500) {
                arg3.method225(83 - var12 - arg3.field637 / 2 - 4, var11 + 94 - arg3.field636 / 2 + 4, this.field49, this.field230);
            } else {
                arg3.method219(448, 83 - var12 - arg3.field637 / 2 - 4, var11 + 94 - arg3.field636 / 2 + 4);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LQXQLENZA;I)V")
    private final void method82(class48 arg0, int arg1) {
        int var3 = 0;
        int var4 = -1;
        int var5 = 0;
        int var6 = 0;
        if (arg0.field1287 == 0) {
            var3 = this.field174.method184(arg0.field1286, arg0.field1288, arg0.field1289);
        }
        if (arg0.field1287 == 1) {
            var3 = this.field174.method185(arg0.field1286, arg0.field1288, arg0.field1289, 3);
        }
        if (arg0.field1287 == 2) {
            var3 = this.field174.method186(arg0.field1286, arg0.field1288, arg0.field1289);
        }
        if (arg0.field1287 == 3) {
            var3 = this.field174.method187(arg0.field1286, arg0.field1288, arg0.field1289);
        }
        if (var3 != 0) {
            int var7 = this.field174.method188(arg0.field1286, arg0.field1288, arg0.field1289, var3);
            var4 = var3 >> 14 & 32767;
            var5 = var7 & 31;
            var6 = var7 >> 6;
        }
        arg0.field1283 = var4;
        arg0.field1285 = var5;
        arg0.field1284 = var6;
        if (arg1 != 17905) {
            field116 = 64;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "()V")
    public final void method83() {
        this.method23(0, "Starting up", 20);
        if (signlink.sunjava) {
            super.field958 = 5;
        }
        if (field143) {
            this.field51 = true;
        } else {
            field143 = true;
            boolean var1 = false;
            String var2 = this.method119(0);
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
                this.field216 = true;
            } else {
                if (signlink.cache_dat != null) {
                    for (int var3 = 0; var3 < 5; ++var3) {
                        this.field171[var3] = new class50(500000, signlink.cache_idx[var3], var3 + 1, signlink.cache_dat, field116);
                    }
                }
                try {
                    this.method123(982);
                    this.field236 = this.method99((byte) 0, 1, this.field370[1], "title screen", 25, "title");
                    this.field389 = new class19(this.field236, 101, false, "p11_full");
                    this.field390 = new class19(this.field236, 101, false, "p12_full");
                    this.field391 = new class19(this.field236, 101, false, "b12_full");
                    this.field392 = new class19(this.field236, 101, true, "q8_full");
                    this.method149(6);
                    this.method10(7);
                    class51 var4 = this.method99((byte) 0, 2, this.field370[2], "config", 30, "config");
                    class51 var5 = this.method99((byte) 0, 3, this.field370[3], "interface", 35, "interface");
                    class51 var6 = this.method99((byte) 0, 4, this.field370[4], "2d graphics", 40, "media");
                    class51 var7 = this.method99((byte) 0, 6, this.field370[6], "textures", 45, "textures");
                    class51 var8 = this.method99((byte) 0, 7, this.field370[7], "chat system", 50, "wordenc");
                    class51 var9 = this.method99((byte) 0, 8, this.field370[8], "sound effects", 55, "sounds");
                    this.field479 = new byte[4][104][104];
                    this.field292 = new int[4][105][105];
                    this.field174 = new class7((byte) 7, this.field292, 104, 104, 4);
                    for (int var10 = 0; var10 < 4; ++var10) {
                        this.field485[var10] = new class18(722, 104, 104);
                    }
                    this.field300 = new class10(512, 512);
                    class51 var11 = this.method99((byte) 0, 5, this.field370[5], "update list", 60, "versionlist");
                    this.method23(0, "Connecting to update server", 60);
                    this.field106 = new class23();
                    this.field106.method287(var11, this);
                    class56.method532(this.field106.method297(-520));
                    class27.method319(this.field106.method295((byte) 9, 0), this.field106);
                    if (!field412) {
                        this.field100 = 0;
                        try {
                            this.field100 = Integer.parseInt(this.getParameter("music"));
                        } catch (Exception var70) {
                        }
                        this.field101 = true;
                        this.field106.method284(2, this.field100);
                        while (this.field106.method280() > 0) {
                            this.method94(0);
                            try {
                                Thread.sleep(100L);
                            } catch (Exception var69) {
                            }
                            if (this.field106.field766 > 3) {
                                this.method146("ondemand");
                                return;
                            }
                        }
                    }
                    this.method23(0, "Requesting animations", 65);
                    int var12 = this.field106.method295((byte) 9, 1);
                    for (int var13 = 0; var13 < var12; ++var13) {
                        this.field106.method284(1, var13);
                    }
                    while (this.field106.method280() > 0) {
                        int var14 = var12 - this.field106.method280();
                        if (var14 > 0) {
                            this.method23(0, "Loading animations - " + var14 * 100 / var12 + "%", 65);
                        }
                        this.method94(0);
                        try {
                            Thread.sleep(100L);
                        } catch (Exception var68) {
                        }
                        if (this.field106.field766 > 3) {
                            this.method146("ondemand");
                            return;
                        }
                    }
                    this.method23(0, "Requesting models", 70);
                    int var15 = this.field106.method295((byte) 9, 0);
                    for (int var16 = 0; var16 < var15; ++var16) {
                        int var17 = this.field106.method279(field248, var16);
                        if ((var17 & 1) != 0) {
                            this.field106.method284(0, var16);
                        }
                    }
                    int var18 = this.field106.method280();
                    while (this.field106.method280() > 0) {
                        int var19 = var18 - this.field106.method280();
                        if (var19 > 0) {
                            this.method23(0, "Loading models - " + var19 * 100 / var18 + "%", 70);
                        }
                        this.method94(0);
                        try {
                            Thread.sleep(100L);
                        } catch (Exception var67) {
                        }
                    }
                    if (this.field171[0] != null) {
                        this.method23(0, "Requesting maps", 75);
                        this.field106.method284(3, this.field106.method285(48, 0, 47, field108));
                        this.field106.method284(3, this.field106.method285(48, 1, 47, field108));
                        this.field106.method284(3, this.field106.method285(48, 0, 48, field108));
                        this.field106.method284(3, this.field106.method285(48, 1, 48, field108));
                        this.field106.method284(3, this.field106.method285(48, 0, 49, field108));
                        this.field106.method284(3, this.field106.method285(48, 1, 49, field108));
                        this.field106.method284(3, this.field106.method285(47, 0, 47, field108));
                        this.field106.method284(3, this.field106.method285(47, 1, 47, field108));
                        this.field106.method284(3, this.field106.method285(47, 0, 48, field108));
                        this.field106.method284(3, this.field106.method285(47, 1, 48, field108));
                        this.field106.method284(3, this.field106.method285(148, 0, 48, field108));
                        this.field106.method284(3, this.field106.method285(148, 1, 48, field108));
                        int var20 = this.field106.method280();
                        while (this.field106.method280() > 0) {
                            int var21 = var20 - this.field106.method280();
                            if (var21 > 0) {
                                this.method23(0, "Loading maps - " + var21 * 100 / var20 + "%", 75);
                            }
                            this.method94(0);
                            try {
                                Thread.sleep(100L);
                            } catch (Exception var66) {
                            }
                        }
                    }
                    int var22 = this.field106.method295((byte) 9, 0);
                    for (int var23 = 0; var23 < var22; ++var23) {
                        int var24 = this.field106.method279(field248, var23);
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
                            this.field106.method283(var23, (byte) 39, var25, 0);
                        }
                    }
                    this.field106.method292((byte) -7, field411);
                    if (!field412) {
                        int var26 = this.field106.method295((byte) 9, 2);
                        for (int var27 = 1; var27 < var26; ++var27) {
                            if (this.field106.method288(false, var27)) {
                                this.field106.method283(var27, (byte) 39, (byte) 1, 2);
                            }
                        }
                    }
                    this.method23(0, "Unpacking media", 80);
                    this.field48 = new class35(var6, "invback", 0);
                    this.field50 = new class35(var6, "chatback", 0);
                    this.field49 = new class35(var6, "mapback", 0);
                    this.field238 = new class35(var6, "backbase1", 0);
                    this.field239 = new class35(var6, "backbase2", 0);
                    this.field240 = new class35(var6, "backhmid1", 0);
                    for (int var28 = 0; var28 < 13; ++var28) {
                        this.field61[var28] = new class35(var6, "sideicons", var28);
                    }
                    this.field215 = new class10(var6, "compass", 0);
                    this.field283 = new class10(var6, "mapedge", 0);
                    this.field283.method216(472);
                    try {
                        for (int var29 = 0; var29 < 100; ++var29) {
                            this.field265[var29] = new class35(var6, "mapscene", var29);
                        }
                    } catch (Exception var74) {
                    }
                    try {
                        for (int var30 = 0; var30 < 100; ++var30) {
                            this.field196[var30] = new class10(var6, "mapfunction", var30);
                        }
                    } catch (Exception var73) {
                    }
                    try {
                        for (int var31 = 0; var31 < 20; ++var31) {
                            this.field95[var31] = new class10(var6, "hitmarks", var31);
                        }
                    } catch (Exception var72) {
                    }
                    try {
                        for (int var32 = 0; var32 < 20; ++var32) {
                            this.field422[var32] = new class10(var6, "headicons", var32);
                        }
                    } catch (Exception var71) {
                    }
                    this.field191 = new class10(var6, "mapmarker", 0);
                    this.field192 = new class10(var6, "mapmarker", 1);
                    for (int var33 = 0; var33 < 8; ++var33) {
                        this.field372[var33] = new class10(var6, "cross", var33);
                    }
                    this.field480 = new class10(var6, "mapdots", 0);
                    this.field481 = new class10(var6, "mapdots", 1);
                    this.field482 = new class10(var6, "mapdots", 2);
                    this.field483 = new class10(var6, "mapdots", 3);
                    this.field484 = new class10(var6, "mapdots", 4);
                    this.field361 = new class35(var6, "scrollbar", 0);
                    this.field362 = new class35(var6, "scrollbar", 1);
                    this.field118 = new class35(var6, "redstone1", 0);
                    this.field119 = new class35(var6, "redstone2", 0);
                    this.field120 = new class35(var6, "redstone3", 0);
                    this.field121 = new class35(var6, "redstone1", 0);
                    this.field121.method443(5487);
                    this.field122 = new class35(var6, "redstone2", 0);
                    this.field122.method443(5487);
                    this.field312 = new class35(var6, "redstone1", 0);
                    this.field312.method444(true);
                    this.field313 = new class35(var6, "redstone2", 0);
                    this.field313.method444(true);
                    this.field314 = new class35(var6, "redstone3", 0);
                    this.field314.method444(true);
                    this.field315 = new class35(var6, "redstone1", 0);
                    this.field315.method443(5487);
                    this.field315.method444(true);
                    this.field316 = new class35(var6, "redstone2", 0);
                    this.field316.method443(5487);
                    this.field316.method444(true);
                    for (int var34 = 0; var34 < 2; ++var34) {
                        this.field241[var34] = new class35(var6, "mod_icons", var34);
                    }
                    class10 var35 = new class10(var6, "backleft1", 0);
                    this.field64 = new class55(var35.field633, var35.field632, (byte) 22, this.method71(field322));
                    var35.method217(false, 0, 0);
                    class10 var36 = new class10(var6, "backleft2", 0);
                    this.field65 = new class55(var36.field633, var36.field632, (byte) 22, this.method71(field322));
                    var36.method217(false, 0, 0);
                    class10 var37 = new class10(var6, "backright1", 0);
                    this.field66 = new class55(var37.field633, var37.field632, (byte) 22, this.method71(field322));
                    var37.method217(false, 0, 0);
                    class10 var38 = new class10(var6, "backright2", 0);
                    this.field67 = new class55(var38.field633, var38.field632, (byte) 22, this.method71(field322));
                    var38.method217(false, 0, 0);
                    class10 var39 = new class10(var6, "backtop1", 0);
                    this.field68 = new class55(var39.field633, var39.field632, (byte) 22, this.method71(field322));
                    var39.method217(false, 0, 0);
                    class10 var40 = new class10(var6, "backvmid1", 0);
                    this.field69 = new class55(var40.field633, var40.field632, (byte) 22, this.method71(field322));
                    var40.method217(false, 0, 0);
                    class10 var41 = new class10(var6, "backvmid2", 0);
                    this.field70 = new class55(var41.field633, var41.field632, (byte) 22, this.method71(field322));
                    var41.method217(false, 0, 0);
                    class10 var42 = new class10(var6, "backvmid3", 0);
                    this.field71 = new class55(var42.field633, var42.field632, (byte) 22, this.method71(field322));
                    var42.method217(false, 0, 0);
                    class10 var43 = new class10(var6, "backhmid2", 0);
                    this.field72 = new class55(var43.field633, var43.field632, (byte) 22, this.method71(field322));
                    var43.method217(false, 0, 0);
                    int var44 = (int) (Math.random() * 21.0D) - 10;
                    int var45 = (int) (Math.random() * 21.0D) - 10;
                    int var46 = (int) (Math.random() * 21.0D) - 10;
                    int var47 = (int) (Math.random() * 41.0D) - 20;
                    for (int var48 = 0; var48 < 100; ++var48) {
                        if (this.field196[var48] != null) {
                            this.field196[var48].method215(var45 + var47, var44 + var47, var46 + var47, 7547);
                        }
                        if (this.field265[var48] != null) {
                            this.field265[var48].method445(var45 + var47, var44 + var47, var46 + var47, 7547);
                        }
                    }
                    this.method23(0, "Unpacking textures", 83);
                    class25.method303(var7, 0);
                    class25.method307(0.8D, 3);
                    class25.method302(20, (byte) 121);
                    this.method23(0, "Unpacking config", 86);
                    class66.method565(68, var4);
                    class59.method546(var4);
                    class63.method561(68, var4);
                    class32.method383(var4);
                    class71.method588(var4);
                    class68.method568(68, var4);
                    class57.method537(68, var4);
                    class14.method233(68, var4);
                    class37.method456(68, var4);
                    class32.field1047 = field411;
                    if (!field412) {
                        this.method23(0, "Unpacking sounds", 90);
                        byte[] var49 = var9.method515("sounds.dat", (byte[]) null);
                        class34 var50 = new class34(var49, field400);
                        class46.method502(68, var50);
                    }
                    this.method23(0, "Unpacking interfaces", 95);
                    class19[] var51 = new class19[] { this.field389, this.field390, this.field391, this.field392 };
                    class58.method540(var51, (byte) 2, var6, var5);
                    this.method23(0, "Preparing game engine", 100);
                    for (int var52 = 0; var52 < 33; ++var52) {
                        int var53 = 999;
                        int var54 = 0;
                        for (int var55 = 0; var55 < 34; ++var55) {
                            if (this.field49.field1091[this.field49.field1093 * var52 + var55] == 0) {
                                if (var53 == 999) {
                                    var53 = var55;
                                }
                            } else if (var53 != 999) {
                                var54 = var55;
                                break;
                            }
                        }
                        this.field237[var52] = var53;
                        this.field189[var52] = var54 - var53;
                    }
                    for (int var56 = 5; var56 < 156; ++var56) {
                        int var57 = 999;
                        int var58 = 0;
                        for (int var59 = 25; var59 < 172; ++var59) {
                            if (this.field49.field1091[this.field49.field1093 * var56 + var59] == 0 && (var59 > 34 || var56 > 34)) {
                                if (var57 == 999) {
                                    var57 = var59;
                                }
                            } else if (var57 != 999) {
                                var58 = var59;
                                break;
                            }
                        }
                        this.field138[var56 - 5] = var57 - 25;
                        this.field506[var56 - 5] = var58 - var57;
                    }
                    class25.method300(96, true, 479);
                    this.field217 = class25.field821;
                    class25.method300(261, true, 190);
                    this.field218 = class25.field821;
                    class25.method300(334, true, 512);
                    this.field219 = class25.field821;
                    int[] var60 = new int[9];
                    for (int var61 = 0; var61 < 9; ++var61) {
                        int var62 = var61 * 32 + 128 + 15;
                        int var63 = var62 * 3 + 600;
                        int var64 = class25.field819[var62];
                        var60[var61] = var63 * var64 >> 16;
                    }
                    class7.method194(334, 500, -755, 800, 512, var60);
                    class39.method460(var8);
                    this.field515 = new class31(this, -346);
                    this.method64(this.field515, 10);
                    class22.field756 = this;
                    class59.field1509 = this;
                    class71.field1705 = this;
                } catch (Exception var75) {
                    signlink.reporterror("loaderror " + this.field505 + " " + this.field452);
                    this.field94 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LZGJLFNLC;IB)V")
    public final void method84(class69 arg0, int arg1, byte arg2) {
        if (arg2 != -38) {
            this.field439 = -1;
        }
        this.method85(arg0.field1644, (byte) 72, arg1, arg0.field1643);
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(IBII)V")
    public final void method85(int arg0, byte arg1, int arg2, int arg3) {
        if (arg3 >= 128 && arg0 >= 128 && arg3 <= 13056 && arg0 <= 13056) {
            int var5 = this.method141((byte) 76, arg0, this.field307, arg3) - arg2;
            int var6 = arg3 - this.field125;
            if (arg1 == 72) {
                int var7 = var5 - this.field126;
                int var8 = arg0 - this.field127;
                int var9 = class27.field913[this.field128];
                int var10 = class27.field914[this.field128];
                int var11 = class27.field913[this.field129];
                int var12 = class27.field914[this.field129];
                int var13 = var6 * var12 + var8 * var11 >> 16;
                int var14 = var8 * var12 - var6 * var11 >> 16;
                int var16 = var7 * var10 - var9 * var14 >> 16;
                int var17 = var7 * var9 + var10 * var14 >> 16;
                if (var17 >= 50) {
                    this.field87 = (var13 << 9) / var17 + class25.field815;
                    this.field88 = (var16 << 9) / var17 + class25.field816;
                } else {
                    this.field87 = -1;
                    this.field88 = -1;
                }
            }
        } else {
            this.field87 = -1;
            this.field88 = -1;
        }
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(III)Ljava/lang/String;")
    public static final String method86(int arg0, int arg1, int arg2) {
        if (arg1 <= 0) {
            throw new NullPointerException();
        } else {
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
            } else {
                return var3 > 0 ? "@gr1@" : "@yel@";
            }
        }
    }

    @OriginalMember(owner = "client", name = "t", descriptor = "(I)V")
    public final void method87(int arg0) {
        short var2 = 256;
        if (this.field350 > 0) {
            for (int var3 = 0; var3 < 256; ++var3) {
                if (this.field350 > 768) {
                    this.field180[var3] = this.method72(1024 - this.field350, (byte) -118, this.field181[var3], this.field182[var3]);
                } else if (this.field350 > 256) {
                    this.field180[var3] = this.field182[var3];
                } else {
                    this.field180[var3] = this.method72(256 - this.field350, (byte) -118, this.field182[var3], this.field181[var3]);
                }
            }
        } else if (this.field351 > 0) {
            for (int var4 = 0; var4 < 256; ++var4) {
                if (this.field351 > 768) {
                    this.field180[var4] = this.method72(1024 - this.field351, (byte) -118, this.field181[var4], this.field183[var4]);
                } else if (this.field351 > 256) {
                    this.field180[var4] = this.field183[var4];
                } else {
                    this.field180[var4] = this.method72(256 - this.field351, (byte) -118, this.field183[var4], this.field181[var4]);
                }
            }
        } else {
            for (int var5 = 0; var5 < 256; ++var5) {
                this.field180[var5] = this.field181[var5];
            }
        }
        for (int var6 = 0; var6 < 33920; ++var6) {
            this.field463.field1362[var6] = this.field341.field631[var6];
        }
        int var7 = 0;
        int var8 = 1152;
        for (int var9 = 1; var9 < var2 - 1; ++var9) {
            int var23 = (var2 - var9) * this.field324[var9] / var2;
            int var24 = var23 + 22;
            if (var24 < 0) {
                var24 = 0;
            }
            var7 += var24;
            for (int var25 = var24; var25 < 128; ++var25) {
                int var26 = this.field159[var7++];
                if (var26 != 0) {
                    int var28 = 256 - var26;
                    int var29 = this.field180[var26];
                    int var30 = this.field463.field1362[var8];
                    this.field463.field1362[var8++] = ((var29 & 16711935) * var26 + (var30 & 16711935) * var28 & -16711936) + ((var29 & 65280) * var26 + (var30 & 65280) * var28 & 16711680) >> 8;
                } else {
                    ++var8;
                }
            }
            var8 += var24;
        }
        this.field463.method530((byte) 9, 0, 0, super.field964);
        if (arg0 != 0) {
            this.field439 = this.field413.method402();
        }
        for (int var10 = 0; var10 < 33920; ++var10) {
            this.field464.field1362[var10] = this.field342.field631[var10];
        }
        int var11 = 0;
        int var12 = 1176;
        for (int var13 = 1; var13 < var2 - 1; ++var13) {
            int var14 = (var2 - var13) * this.field324[var13] / var2;
            int var15 = 103 - var14;
            int var16 = var12 + var14;
            for (int var17 = 0; var17 < var15; ++var17) {
                int var18 = this.field159[var11++];
                if (var18 != 0) {
                    int var20 = 256 - var18;
                    int var21 = this.field180[var18];
                    int var22 = this.field464.field1362[var16];
                    this.field464.field1362[var16++] = ((var21 & 16711935) * var18 + (var22 & 16711935) * var20 & -16711936) + ((var21 & 65280) * var18 + (var22 & 65280) * var20 & 16711680) >> 8;
                } else {
                    ++var16;
                }
            }
            var11 += 128 - var15;
            var12 = 128 - var15 - var14 + var16;
        }
        this.field464.method530((byte) 9, 0, 637, super.field964);
    }

    @OriginalMember(owner = "client", name = "u", descriptor = "(I)V")
    public final void method88(int arg0) {
        for (int var2 = -1; var2 < this.field287; ++var2) {
            int var3;
            if (var2 == -1) {
                var3 = this.field285;
            } else {
                var3 = this.field288[var2];
            }
            class1 var4 = this.field286[var3];
            if (var4 != null) {
                this.method27(1, true, var4);
            }
        }
        if (arg0 != 16835) {
            field469 = !field469;
        }
    }

    @OriginalMember(owner = "client", name = "v", descriptor = "(I)V")
    public final void method89(int arg0) {
        if (arg0 != 18224) {
            this.field439 = -1;
        }
        this.field329.method391(120, 926);
        if (this.field139 != -1) {
            this.field139 = -1;
            this.field177 = true;
            this.field429 = false;
            this.field136 = true;
        }
        if (this.field133 != -1) {
            this.field133 = -1;
            this.field260 = true;
            this.field429 = false;
        }
        this.field255 = -1;
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(B)V")
    public final void method90(byte arg0) {
        if (arg0 != 0) {
            this.field264 = this.field449.method387();
        }
        this.field451 = true;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZLULLVQOAK;)Z")
    public final boolean method91(boolean arg0, class58 arg1) {
        if (arg1.field1439 == null) {
            return false;
        } else {
            for (int var3 = 0; var3 < arg1.field1439.length; ++var3) {
                int var4 = this.method73(arg1, var3, false);
                int var5 = arg1.field1436[var3];
                if (arg1.field1439[var3] == 2) {
                    if (var4 >= var5) {
                        return false;
                    }
                } else if (arg1.field1439[var3] == 3) {
                    if (var4 <= var5) {
                        return false;
                    }
                } else if (arg1.field1439[var3] == 4) {
                    if (var4 == var5) {
                        return false;
                    }
                } else if (var4 != var5) {
                    return false;
                }
            }
            if (arg0) {
                this.field123 = -103;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(ZZ)V")
    public final void method92(boolean arg0, boolean arg1) {
        if (field132.field1643 >> 7 == this.field298 && field132.field1644 >> 7 == this.field299) {
            this.field298 = 0;
        }
        int var3 = this.field287;
        if (!arg1) {
            this.field184 = this.field449.method387();
        }
        if (arg0) {
            var3 = 1;
        }
        for (int var4 = 0; var4 < var3; ++var4) {
            class1 var5;
            int var6;
            if (arg0) {
                var5 = field132;
                var6 = this.field285 << 14;
            } else {
                var5 = this.field286[this.field288[var4]];
                var6 = this.field288[var4] << 14;
            }
            if (var5 != null && var5.method3(false)) {
                var5.field14 = false;
                if ((field412 && this.field287 > 50 || this.field287 > 200) && !arg0 && var5.field1654 == var5.field1647) {
                    var5.field14 = true;
                }
                int var7 = var5.field1643 >> 7;
                int var8 = var5.field1644 >> 7;
                if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                    if (var5.field8 != null && field246 >= var5.field10 && field246 < var5.field11) {
                        var5.field14 = false;
                        var5.field15 = this.method141((byte) 76, var5.field1644, this.field307, var5.field1643);
                        this.field174.method170(var5.field23, var5, var5.field25, var5.field26, var5.field15, var5.field1644, -513, this.field307, var5.field24, 60, var5.field1645, var6, var5.field1643);
                    } else {
                        if ((var5.field1643 & 127) == 64 && (var5.field1644 & 127) == 64) {
                            if (this.field227[var7][var8] == this.field193) {
                                continue;
                            }
                            this.field227[var7][var8] = this.field193;
                        }
                        var5.field15 = this.method141((byte) 76, var5.field1644, this.field307, var5.field1643);
                        this.field174.method169(this.field307, 60, var5.field1643, (byte) 7, var5.field15, var6, var5.field1644, var5.field1686, var5.field1645, var5);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "h", descriptor = "(Z)V")
    public final void method93(boolean arg0) {
        this.field90.method529(false);
        if (this.field59 == 2) {
            byte[] var2 = this.field49.field1091;
            int[] var3 = class53.field1347;
            int var4 = var2.length;
            for (int var5 = 0; var5 < var4; ++var5) {
                if (var2[var5] == 0) {
                    var3[var5] = 0;
                }
            }
            this.field215.method223(-40142, 0, this.field81, 33, 25, 25, this.field237, 33, 0, this.field189, 256);
            this.field91.method529(false);
        } else {
            int var6 = this.field81 + this.field431 & 2047;
            int var7 = field132.field1643 / 32 + 48;
            int var8 = 464 - field132.field1644 / 32;
            this.field300.method223(-40142, 25, var6, 151, var7, var8, this.field138, 146, 5, this.field506, this.field270 + 256);
            this.field215.method223(-40142, 0, this.field81, 33, 25, 25, this.field237, 33, 0, this.field189, 256);
            for (int var9 = 0; var9 < this.field231; ++var9) {
                int var39 = this.field232[var9] * 4 + 2 - field132.field1643 / 32;
                int var40 = this.field233[var9] * 4 + 2 - field132.field1644 / 32;
                this.method81(var39, 225, var40, this.field421[var9]);
            }
            if (arg0) {
                this.field420 = null;
            }
            for (int var10 = 0; var10 < 104; ++var10) {
                for (int var35 = 0; var35 < 104; ++var35) {
                    class36 var36 = this.field420[this.field307][var10][var35];
                    if (var36 != null) {
                        int var37 = var10 * 4 + 2 - field132.field1643 / 32;
                        int var38 = var35 * 4 + 2 - field132.field1644 / 32;
                        this.method81(var37, 225, var38, this.field480);
                    }
                }
            }
            for (int var11 = 0; var11 < this.field445; ++var11) {
                class54 var31 = this.field444[this.field446[var11]];
                if (var31 != null && var31.method3(false)) {
                    class71 var32 = var31.field1359;
                    if (var32.field1719 != null) {
                        var32 = var32.method591(0);
                    }
                    if (var32 != null && var32.field1726 && var32.field1708) {
                        int var33 = var31.field1643 / 32 - field132.field1643 / 32;
                        int var34 = var31.field1644 / 32 - field132.field1644 / 32;
                        this.method81(var33, 225, var34, this.field481);
                    }
                }
            }
            for (int var12 = 0; var12 < this.field287; ++var12) {
                class1 var23 = this.field286[this.field288[var12]];
                if (var23 != null && var23.method3(false)) {
                    int var24 = var23.field1643 / 32 - field132.field1643 / 32;
                    int var25 = var23.field1644 / 32 - field132.field1644 / 32;
                    boolean var26 = false;
                    long var27 = class20.method268(var23.field19);
                    for (int var29 = 0; var29 < this.field447; ++var29) {
                        if (this.field490[var29] == var27 && this.field110[var29] != 0) {
                            var26 = true;
                            break;
                        }
                    }
                    boolean var30 = false;
                    if (field132.field13 != 0 && var23.field13 != 0 && field132.field13 == var23.field13) {
                        var30 = true;
                    }
                    if (var26) {
                        this.method81(var24, 225, var25, this.field483);
                    } else if (var30) {
                        this.method81(var24, 225, var25, this.field484);
                    } else {
                        this.method81(var24, 225, var25, this.field482);
                    }
                }
            }
            if (this.field394 != 0 && field246 % 20 < 10) {
                if (this.field394 == 1 && this.field266 >= 0 && this.field266 < this.field444.length) {
                    class54 var13 = this.field444[this.field266];
                    if (var13 != null) {
                        int var14 = var13.field1643 / 32 - field132.field1643 / 32;
                        int var15 = var13.field1644 / 32 - field132.field1644 / 32;
                        this.method55(var14, false, var15, this.field192);
                    }
                }
                if (this.field394 == 2) {
                    int var16 = (this.field275 - this.field223) * 4 + 2 - field132.field1643 / 32;
                    int var17 = (this.field276 - this.field224) * 4 + 2 - field132.field1644 / 32;
                    this.method55(var16, false, var17, this.field192);
                }
                if (this.field394 == 10 && this.field377 >= 0 && this.field377 < this.field286.length) {
                    class1 var18 = this.field286[this.field377];
                    if (var18 != null) {
                        int var19 = var18.field1643 / 32 - field132.field1643 / 32;
                        int var20 = var18.field1644 / 32 - field132.field1644 / 32;
                        this.method55(var19, false, var20, this.field192);
                    }
                }
            }
            if (this.field298 != 0) {
                int var21 = this.field298 * 4 + 2 - field132.field1643 / 32;
                int var22 = this.field299 * 4 + 2 - field132.field1644 / 32;
                this.method81(var21, 225, var22, this.field191);
            }
            class53.method521(16777215, -426, 3, 97, 78, 3);
            this.field91.method529(false);
        }
    }

    @OriginalMember(owner = "client", name = "w", descriptor = "(I)V")
    public final void method94(int arg0) {
        this.field438 += arg0;
        while (true) {
            class60 var2 = this.field106.method294();
            if (var2 == null) {
                return;
            }
            if (var2.field1517 == 0) {
                class27.method320(var2.field1515, true, var2.field1516);
                if ((this.field106.method279(field248, var2.field1516) & 98) != 0) {
                    this.field177 = true;
                    if (this.field133 != -1) {
                        this.field260 = true;
                    }
                }
            }
            if (var2.field1517 == 1 && var2.field1515 != null) {
                class56.method533((byte) 9, var2.field1515);
            }
            if (var2.field1517 == 2 && this.field100 == var2.field1516 && var2.field1515 != null) {
                this.method22(this.field101, var2.field1515, (byte) 0);
            }
            if (var2.field1517 == 3 && this.field430 == 1) {
                for (int var3 = 0; var3 < this.field170.length; ++var3) {
                    if (this.field385[var3] == var2.field1516) {
                        this.field170[var3] = var2.field1515;
                        if (var2.field1515 == null) {
                            this.field385[var3] = -1;
                        }
                        break;
                    }
                    if (this.field386[var3] == var2.field1516) {
                        this.field493[var3] = var2.field1515;
                        if (var2.field1515 == null) {
                            this.field386[var3] = -1;
                        }
                        break;
                    }
                }
            }
            if (var2.field1517 == 93 && this.field106.method289(true, var2.field1516)) {
                class28.method356(-548, new class34(var2.field1515, field400), this.field106);
            }
        }
    }

    @OriginalMember(owner = "client", name = "j", descriptor = "(B)V")
    public final void method95(byte arg0) {
        if (this.field212 == 0) {
            this.field179[0] = "Cancel";
            this.field359[0] = 1845;
            this.field414 = 1;
            this.method120(this.field406);
            this.field96 = 0;
            if (super.field972 > 4 && super.field973 > 4 && super.field972 < 516 && super.field973 < 338) {
                if (this.field255 != -1) {
                    this.method17(0, 4, super.field972, (byte) 0, class58.field1405[this.field255], 4, super.field973);
                } else {
                    this.method133(155);
                }
            }
            if (this.field96 != this.field323) {
                this.field323 = this.field96;
            }
            this.field96 = 0;
            if (super.field972 > 553 && super.field973 > 205 && super.field972 < 743 && super.field973 < 466) {
                if (this.field139 != -1) {
                    this.method17(0, 205, super.field972, (byte) 0, class58.field1405[this.field139], 553, super.field973);
                } else if (this.field376[this.field356] != -1) {
                    this.method17(0, 205, super.field972, (byte) 0, class58.field1405[this.field376[this.field356]], 553, super.field973);
                }
            }
            if (this.field96 != this.field371) {
                this.field177 = true;
                this.field371 = this.field96;
            }
            this.field96 = 0;
            if (arg0 != -110) {
                this.field439 = -1;
            }
            if (super.field972 > 17 && super.field973 > 357 && super.field972 < 496 && super.field973 < 453) {
                if (this.field133 != -1) {
                    this.method17(0, 357, super.field972, (byte) 0, class58.field1405[this.field133], 17, super.field973);
                } else if (super.field973 < 434 && super.field972 < 426) {
                    this.method35(super.field972 - 17, 0, super.field973 - 357);
                }
            }
            if (this.field133 != -1 && this.field96 != this.field491) {
                this.field260 = true;
                this.field491 = this.field96;
            }
            boolean var2 = false;
            while (!var2) {
                var2 = true;
                for (int var3 = 0; var3 < this.field414 - 1; ++var3) {
                    if (this.field359[var3] < 1000 && this.field359[var3 + 1] > 1000) {
                        String var4 = this.field179[var3];
                        this.field179[var3] = this.field179[var3 + 1];
                        this.field179[var3 + 1] = var4;
                        int var5 = this.field359[var3];
                        this.field359[var3] = this.field359[var3 + 1];
                        this.field359[var3 + 1] = var5;
                        int var6 = this.field357[var3];
                        this.field357[var3] = this.field357[var3 + 1];
                        this.field357[var3 + 1] = var6;
                        int var7 = this.field358[var3];
                        this.field358[var3] = this.field358[var3 + 1];
                        this.field358[var3 + 1] = var7;
                        int var8 = this.field360[var3];
                        this.field360[var3] = this.field360[var3 + 1];
                        this.field360[var3 + 1] = var8;
                        var2 = false;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "k", descriptor = "(B)V")
    public final void method96(byte arg0) {
        this.field89.method529(false);
        if (this.field415 == arg0) {
            boolean var2 = false;
        } else {
            this.field439 = this.field413.method402();
        }
        class25.field821 = this.field218;
        this.field48.method446(448, 0, 0);
        if (this.field139 != -1) {
            this.method140(0, class58.field1405[this.field139], 0, 1, 0);
        } else if (this.field376[this.field356] != -1) {
            this.method140(0, class58.field1405[this.field376[this.field356]], 0, 1, 0);
        }
        if (this.field345 && this.field333 == 1) {
            this.method104(true);
        }
        this.field89.method530((byte) 9, 205, 553, super.field964);
        this.field91.method529(false);
        class25.field821 = this.field219;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IZ)V")
    public final void method97(int arg0, boolean arg1) {
        int[] var3 = this.field300.field631;
        int var4 = var3.length;
        for (int var5 = 0; var5 < var4; ++var5) {
            var3[var5] = 0;
        }
        for (int var6 = 1; var6 < 103; ++var6) {
            int var23 = (103 - var6) * 512 * 4 + 24628;
            for (int var24 = 1; var24 < 103; ++var24) {
                if ((this.field479[arg0][var24][var6] & 24) == 0) {
                    this.field174.method193(var3, var23, 512, arg0, var24, var6);
                }
                if (arg0 < 3 && (this.field479[arg0 + 1][var24][var6] & 8) != 0) {
                    this.field174.method193(var3, var23, 512, arg0 + 1, var24, var6);
                }
                var23 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        this.field321 &= arg1;
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        this.field300.method214(false);
        for (int var9 = 1; var9 < 103; ++var9) {
            for (int var22 = 1; var22 < 103; ++var22) {
                if ((this.field479[arg0][var22][var9] & 24) == 0) {
                    this.method75(var22, var7, arg0, var8, var9, -94);
                }
                if (arg0 < 3 && (this.field479[arg0 + 1][var22][var9] & 8) != 0) {
                    this.method75(var22, var7, arg0 + 1, var8, var9, -94);
                }
            }
        }
        this.field91.method529(false);
        this.field231 = 0;
        for (int var10 = 0; var10 < 104; ++var10) {
            for (int var11 = 0; var11 < 104; ++var11) {
                int var12 = this.field174.method187(this.field307, var10, var11);
                if (var12 != 0) {
                    int var13 = var12 >> 14 & 32767;
                    int var14 = class59.method555(var13).field1486;
                    if (var14 >= 0) {
                        int var15 = var10;
                        int var16 = var11;
                        if (var14 != 22 && var14 != 29 && var14 != 34 && var14 != 36 && var14 != 46 && var14 != 47 && var14 != 48) {
                            byte var17 = 104;
                            byte var18 = 104;
                            int[][] var19 = this.field485[this.field307].field717;
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
                        this.field421[this.field231] = this.field196[var14];
                        this.field232[this.field231] = var15;
                        this.field233[this.field231] = var16;
                        ++this.field231;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIBIIIZIIIII)Z")
    public final boolean method98(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        byte var13 = 104;
        byte var14 = 104;
        for (int var15 = 0; var15 < var13; ++var15) {
            for (int var36 = 0; var36 < var14; ++var36) {
                this.field519[var15][var36] = 0;
                this.field263[var15][var36] = 99999999;
            }
        }
        int var16 = arg1;
        int var17 = arg11;
        this.field519[arg1][arg11] = 99;
        if (arg2 != 1) {
            throw new NullPointerException();
        } else {
            boolean var18 = false;
            this.field263[arg1][arg11] = 0;
            byte var19 = 0;
            int var20 = 0;
            this.field387[var19] = arg1;
            int var37 = var19 + 1;
            this.field388[var19] = arg11;
            boolean var21 = false;
            int var22 = this.field387.length;
            int[][] var23 = this.field485[this.field307].field717;
            while (var37 != var20) {
                var16 = this.field387[var20];
                var17 = this.field388[var20];
                var20 = (var20 + 1) % var22;
                if (arg0 == var16 && arg9 == var17) {
                    var21 = true;
                    break;
                }
                if (arg10 != 0) {
                    if ((arg10 < 5 || arg10 == 10) && this.field485[this.field307].method249(835, var17, arg9, arg10 - 1, arg0, var16, arg3)) {
                        var21 = true;
                        break;
                    }
                    if (arg10 < 10 && this.field485[this.field307].method250(arg9, arg3, arg10 - 1, var17, arg0, -239, var16)) {
                        var21 = true;
                        break;
                    }
                }
                if (arg4 != 0 && arg8 != 0 && this.field485[this.field307].method251(arg8, 86, arg0, arg5, var16, arg4, var17, arg9)) {
                    var21 = true;
                    break;
                }
                int var35 = this.field263[var16][var17] + 1;
                if (var16 > 0 && this.field519[var16 - 1][var17] == 0 && (var23[var16 - 1][var17] & 19398920) == 0) {
                    this.field387[var37] = var16 - 1;
                    this.field388[var37] = var17;
                    var37 = (var37 + 1) % var22;
                    this.field519[var16 - 1][var17] = 2;
                    this.field263[var16 - 1][var17] = var35;
                }
                if (var16 < var13 - 1 && this.field519[var16 + 1][var17] == 0 && (var23[var16 + 1][var17] & 19399040) == 0) {
                    this.field387[var37] = var16 + 1;
                    this.field388[var37] = var17;
                    var37 = (var37 + 1) % var22;
                    this.field519[var16 + 1][var17] = 8;
                    this.field263[var16 + 1][var17] = var35;
                }
                if (var17 > 0 && this.field519[var16][var17 - 1] == 0 && (var23[var16][var17 - 1] & 19398914) == 0) {
                    this.field387[var37] = var16;
                    this.field388[var37] = var17 - 1;
                    var37 = (var37 + 1) % var22;
                    this.field519[var16][var17 - 1] = 1;
                    this.field263[var16][var17 - 1] = var35;
                }
                if (var17 < var14 - 1 && this.field519[var16][var17 + 1] == 0 && (var23[var16][var17 + 1] & 19398944) == 0) {
                    this.field387[var37] = var16;
                    this.field388[var37] = var17 + 1;
                    var37 = (var37 + 1) % var22;
                    this.field519[var16][var17 + 1] = 4;
                    this.field263[var16][var17 + 1] = var35;
                }
                if (var16 > 0 && var17 > 0 && this.field519[var16 - 1][var17 - 1] == 0 && (var23[var16 - 1][var17 - 1] & 19398926) == 0 && (var23[var16 - 1][var17] & 19398920) == 0 && (var23[var16][var17 - 1] & 19398914) == 0) {
                    this.field387[var37] = var16 - 1;
                    this.field388[var37] = var17 - 1;
                    var37 = (var37 + 1) % var22;
                    this.field519[var16 - 1][var17 - 1] = 3;
                    this.field263[var16 - 1][var17 - 1] = var35;
                }
                if (var16 < var13 - 1 && var17 > 0 && this.field519[var16 + 1][var17 - 1] == 0 && (var23[var16 + 1][var17 - 1] & 19399043) == 0 && (var23[var16 + 1][var17] & 19399040) == 0 && (var23[var16][var17 - 1] & 19398914) == 0) {
                    this.field387[var37] = var16 + 1;
                    this.field388[var37] = var17 - 1;
                    var37 = (var37 + 1) % var22;
                    this.field519[var16 + 1][var17 - 1] = 9;
                    this.field263[var16 + 1][var17 - 1] = var35;
                }
                if (var16 > 0 && var17 < var14 - 1 && this.field519[var16 - 1][var17 + 1] == 0 && (var23[var16 - 1][var17 + 1] & 19398968) == 0 && (var23[var16 - 1][var17] & 19398920) == 0 && (var23[var16][var17 + 1] & 19398944) == 0) {
                    this.field387[var37] = var16 - 1;
                    this.field388[var37] = var17 + 1;
                    var37 = (var37 + 1) % var22;
                    this.field519[var16 - 1][var17 + 1] = 6;
                    this.field263[var16 - 1][var17 + 1] = var35;
                }
                if (var16 < var13 - 1 && var17 < var14 - 1 && this.field519[var16 + 1][var17 + 1] == 0 && (var23[var16 + 1][var17 + 1] & 19399136) == 0 && (var23[var16 + 1][var17] & 19399040) == 0 && (var23[var16][var17 + 1] & 19398944) == 0) {
                    this.field387[var37] = var16 + 1;
                    this.field388[var37] = var17 + 1;
                    var37 = (var37 + 1) % var22;
                    this.field519[var16 + 1][var17 + 1] = 12;
                    this.field263[var16 + 1][var17 + 1] = var35;
                }
            }
            this.field502 = 0;
            if (!var21) {
                if (arg6) {
                    int var24 = 100;
                    for (int var25 = 1; var25 < 2; ++var25) {
                        for (int var26 = arg0 - var25; var26 <= arg0 + var25; ++var26) {
                            for (int var27 = arg9 - var25; var27 <= arg9 + var25; ++var27) {
                                if (var26 >= 0 && var27 >= 0 && var26 < 104 && var27 < 104 && this.field263[var26][var27] < var24) {
                                    var24 = this.field263[var26][var27];
                                    var16 = var26;
                                    var17 = var27;
                                    this.field502 = 1;
                                    var21 = true;
                                }
                            }
                        }
                        if (var21) {
                            break;
                        }
                    }
                }
                if (!var21) {
                    return false;
                }
            }
            byte var28 = 0;
            this.field387[var28] = var16;
            int var38 = var28 + 1;
            this.field388[var28] = var17;
            int var29;
            int var30 = var29 = this.field519[var16][var17];
            while (arg1 != var16 || arg11 != var17) {
                if (var29 != var30) {
                    var29 = var30;
                    this.field387[var38] = var16;
                    this.field388[var38++] = var17;
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
                var30 = this.field519[var16][var17];
            }
            if (var38 <= 0) {
                if (arg7 == 1) {
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
                int var32 = this.field387[var38];
                int var33 = this.field388[var38];
                ++field198;
                if (field198 >= 133) {
                    this.field329.method391(229, 926);
                    this.field329.method393(47151);
                    field198 = 0;
                }
                if (arg7 == 0) {
                    this.field329.method391(22, 926);
                    this.field329.method392(var31 + var31 + 3);
                }
                if (arg7 == 1) {
                    this.field329.method391(212, 926);
                    this.field329.method392(var31 + var31 + 3 + 14);
                }
                if (arg7 == 2) {
                    this.field329.method391(162, 926);
                    this.field329.method392(var31 + var31 + 3);
                }
                this.field329.method392(super.field982[5] == 1 ? 1 : 0);
                this.field298 = this.field387[0];
                this.field299 = this.field388[0];
                for (int var34 = 1; var34 < var31; ++var34) {
                    --var38;
                    this.field329.method392(this.field387[var38] - var32);
                    this.field329.method392(this.field388[var38] - var33);
                }
                this.field329.method428(false, this.field223 + var32);
                this.field329.method428(false, this.field224 + var33);
                return true;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BIILjava/lang/String;ILjava/lang/String;)LSPZBTZXL;")
    public final class51 method99(byte arg0, int arg1, int arg2, String arg3, int arg4, String arg5) {
        byte[] var7 = null;
        int var8 = 5;
        try {
            if (this.field171[0] != null) {
                var7 = this.field171[0].method510(arg1, 16191);
            }
        } catch (Exception var30) {
        }
        if (var7 != null) {
            this.field310.reset();
            this.field310.update(var7);
            int var9 = (int) this.field310.getValue();
            if (arg2 != var9) {
                var7 = null;
            }
        }
        if (var7 != null) {
            return new class51(var7, 603);
        } else {
            int var11 = 0;
            while (var7 == null) {
                String var12 = "Unknown error";
                this.method23(0, "Requesting " + arg3, arg4);
                Object var13 = null;
                try {
                    int var14 = 0;
                    DataInputStream var15 = this.method106(arg5 + arg2);
                    byte[] var16 = new byte[6];
                    var15.readFully(var16, 0, 6);
                    class34 var17 = new class34(var16, field400);
                    var17.field1073 = 3;
                    int var18 = var17.method406() + 6;
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
                            this.method23(0, "Loading " + arg3 + " - " + var23 + "%", arg4);
                        }
                        var14 = var23;
                    }
                    var15.close();
                    try {
                        if (this.field171[0] != null) {
                            this.field171[0].method511(var7, arg1, 103, var7.length);
                        }
                    } catch (Exception var29) {
                        this.field171[0] = null;
                    }
                    if (var7 != null) {
                        this.field310.reset();
                        this.field310.update(var7);
                        int var24 = (int) this.field310.getValue();
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
                            this.method23(0, "Game updated - please reload page", arg4);
                            var26 = 10;
                        } else {
                            this.method23(0, var12 + " - Retrying in " + var26, arg4);
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
                    this.field328 = !this.field328;
                }
            }
            class51 var27 = new class51(var7, 603);
            if (this.field408 != arg0) {
                throw new NullPointerException();
            } else {
                return var27;
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(IZ)V")
    public final void method100(int arg0, boolean arg1) {
        if (arg0 >= 0) {
            if (this.field117 != 0) {
                this.field117 = 0;
                this.field260 = true;
            }
            int var3 = this.field357[arg0];
            int var4 = this.field358[arg0];
            int var5 = this.field359[arg0];
            int var6 = this.field360[arg0];
            if (var5 >= 2000) {
                var5 -= 2000;
            }
            if (var5 == 584 && this.method139(var3, 2, var4, var6)) {
                this.field329.method391(65, 926);
                this.field329.method427(var6 >> 14 & 32767, 38866);
                this.field329.method427(this.field56, 38866);
                this.field329.method426(this.field272, this.field55);
                this.field329.method426(this.field272, this.field223 + var3);
                this.field329.method428(false, this.field57);
                this.field329.method426(this.field272, this.field224 + var4);
            }
            if (var5 == 682) {
                this.field329.method391(188, 926);
                this.field329.method393(var4);
                class58 var7 = class58.field1405[var4];
                if (var7.field1459 != null && var7.field1459[0][0] == 5) {
                    int var8 = var7.field1459[0][1];
                    this.field455[var8] = 1 - this.field455[var8];
                    this.method52(var8, 503);
                    this.field177 = true;
                }
            }
            if (var5 == 822) {
                this.field329.method391(88, 926);
                this.field329.method428(false, var3);
                this.field329.method426(this.field272, var6);
                this.field329.method427(var4, 38866);
                this.field352 = 0;
                this.field353 = var4;
                this.field354 = var3;
                this.field355 = 2;
                if (class58.field1405[var4].field1426 == this.field255) {
                    this.field355 = 1;
                }
                if (class58.field1405[var4].field1426 == this.field133) {
                    this.field355 = 3;
                }
            }
            if (var5 == 978) {
                boolean var9 = this.method98(var3, field132.field1641[0], this.field195, 0, 0, 0, false, 2, 0, var4, 0, field132.field1642[0]);
                if (!var9) {
                    this.method98(var3, field132.field1641[0], this.field195, 0, 1, 0, false, 2, 1, var4, 0, field132.field1642[0]);
                }
                this.field39 = super.field979;
                this.field40 = super.field980;
                this.field42 = 2;
                this.field41 = 0;
                this.field329.method391(204, 926);
                this.field329.method426(this.field272, this.field224 + var4);
                this.field329.method428(false, this.field223 + var3);
                this.field329.method393(var6);
            }
            if (var5 == 345) {
                class1 var11 = this.field286[var6];
                if (var11 != null) {
                    this.method98(var11.field1641[0], field132.field1641[0], this.field195, 0, 1, 0, false, 2, 1, var11.field1642[0], 0, field132.field1642[0]);
                    this.field39 = super.field979;
                    this.field40 = super.field980;
                    this.field42 = 2;
                    this.field41 = 0;
                    this.field329.method391(154, 926);
                    this.field329.method393(var6);
                }
            }
            if (var5 == 329) {
                this.method139(var3, 2, var4, var6);
                this.field329.method391(233, 926);
                this.field329.method393(var6 >> 14 & 32767);
                this.field329.method426(this.field272, this.field224 + var4);
                this.field329.method427(this.field223 + var3, 38866);
            }
            if (var5 == 787) {
                this.field54 = 1;
                this.field55 = var3;
                this.field56 = var4;
                this.field57 = var6;
                this.field58 = class32.method380(var6).field1018;
                this.field43 = 0;
                this.field177 = true;
            } else {
                if (var5 == 84) {
                    if (!this.field345) {
                        this.field174.method196(super.field979 - 4, super.field980 - 4, true);
                    } else {
                        this.field174.method196(var3 - 4, var4 - 4, true);
                    }
                }
                if (var5 == 348) {
                    class1 var12 = this.field286[var6];
                    if (var12 != null) {
                        this.method98(var12.field1641[0], field132.field1641[0], this.field195, 0, 1, 0, false, 2, 1, var12.field1642[0], 0, field132.field1642[0]);
                        this.field39 = super.field979;
                        this.field40 = super.field980;
                        this.field42 = 2;
                        this.field41 = 0;
                        this.field329.method391(70, 926);
                        this.field329.method428(false, this.field44);
                        this.field329.method426(this.field272, var6);
                    }
                }
                if (var5 == 914) {
                    this.field329.method391(6, 926);
                    this.field329.method428(false, var4);
                    this.field329.method393(var6);
                    this.field329.method426(this.field272, var3);
                    this.field352 = 0;
                    this.field353 = var4;
                    this.field354 = var3;
                    this.field355 = 2;
                    if (class58.field1405[var4].field1426 == this.field255) {
                        this.field355 = 1;
                    }
                    if (class58.field1405[var4].field1426 == this.field133) {
                        this.field355 = 3;
                    }
                }
                if (var5 == 568) {
                    this.field329.method391(60, 926);
                    this.field329.method428(false, var4);
                    this.field329.method426(this.field272, var6);
                    this.field329.method427(var3, 38866);
                    this.field352 = 0;
                    this.field353 = var4;
                    this.field354 = var3;
                    this.field355 = 2;
                    if (class58.field1405[var4].field1426 == this.field255) {
                        this.field355 = 1;
                    }
                    if (class58.field1405[var4].field1426 == this.field133) {
                        this.field355 = 3;
                    }
                }
                if (var5 == 492) {
                    class1 var13 = this.field286[var6];
                    if (var13 != null) {
                        this.method98(var13.field1641[0], field132.field1641[0], this.field195, 0, 1, 0, false, 2, 1, var13.field1642[0], 0, field132.field1642[0]);
                        this.field39 = super.field979;
                        this.field40 = super.field980;
                        this.field42 = 2;
                        this.field41 = 0;
                        this.field329.method391(55, 926);
                        this.field329.method426(this.field272, var6);
                    }
                }
                if (var5 == 589) {
                    this.field329.method391(192, 926);
                    this.field329.method428(false, var4);
                    this.field329.method393(var6);
                    this.field329.method426(this.field272, var3);
                    this.field352 = 0;
                    this.field353 = var4;
                    this.field354 = var3;
                    this.field355 = 2;
                    if (class58.field1405[var4].field1426 == this.field255) {
                        this.field355 = 1;
                    }
                    if (class58.field1405[var4].field1426 == this.field133) {
                        this.field355 = 3;
                    }
                }
                if (var5 == 1713) {
                    class54 var14 = this.field444[var6];
                    if (var14 != null) {
                        class71 var15 = var14.field1359;
                        if (var15.field1719 != null) {
                            var15 = var15.method591(0);
                        }
                        if (var15 != null) {
                            String var16;
                            if (var15.field1700 != null) {
                                var16 = new String(var15.field1700);
                            } else {
                                var16 = "It's a " + var15.field1727 + ".";
                            }
                            this.method131((byte) -32, "", 0, var16);
                        }
                    }
                }
                if (var5 == 100) {
                    boolean var17 = this.method98(var3, field132.field1641[0], this.field195, 0, 0, 0, false, 2, 0, var4, 0, field132.field1642[0]);
                    if (!var17) {
                        this.method98(var3, field132.field1641[0], this.field195, 0, 1, 0, false, 2, 1, var4, 0, field132.field1642[0]);
                    }
                    this.field39 = super.field979;
                    this.field40 = super.field980;
                    this.field42 = 2;
                    this.field41 = 0;
                    this.field329.method391(199, 926);
                    this.field329.method393(var6);
                    this.field329.method427(this.field224 + var4, 38866);
                    this.field329.method428(false, this.field223 + var3);
                }
                if (var5 == 552) {
                    this.field329.method391(188, 926);
                    this.field329.method393(var4);
                    class58 var19 = class58.field1405[var4];
                    if (var19.field1459 != null && var19.field1459[0][0] == 5) {
                        int var20 = var19.field1459[0][1];
                        if (this.field455[var20] != var19.field1436[0]) {
                            this.field455[var20] = var19.field1436[0];
                            this.method52(var20, 503);
                            this.field177 = true;
                        }
                    }
                }
                if (var5 == 403) {
                    String var21 = this.field179[arg0];
                    int var22 = var21.indexOf("@whi@");
                    if (var22 != -1) {
                        long var23 = class20.method268(var21.substring(var22 + 5).trim());
                        int var25 = -1;
                        for (int var26 = 0; var26 < this.field447; ++var26) {
                            if (this.field490[var26] == var23) {
                                var25 = var26;
                                break;
                            }
                        }
                        if (var25 != -1 && this.field110[var25] > 0) {
                            this.field260 = true;
                            this.field117 = 0;
                            this.field470 = true;
                            this.field190 = "";
                            this.field134 = 3;
                            this.field433 = this.field490[var25];
                            this.field308 = "Enter message to send to " + this.field194[var25];
                        }
                    }
                }
                if (var5 == 174) {
                    boolean var27 = this.method98(var3, field132.field1641[0], this.field195, 0, 0, 0, false, 2, 0, var4, 0, field132.field1642[0]);
                    if (!var27) {
                        this.method98(var3, field132.field1641[0], this.field195, 0, 1, 0, false, 2, 1, var4, 0, field132.field1642[0]);
                    }
                    this.field39 = super.field979;
                    this.field40 = super.field980;
                    this.field42 = 2;
                    this.field41 = 0;
                    this.field329.method391(137, 926);
                    this.field329.method428(false, this.field224 + var4);
                    this.field329.method393(this.field44);
                    this.field329.method427(var6, 38866);
                    this.field329.method426(this.field272, this.field223 + var3);
                }
                if (var5 == 622 && !this.field429) {
                    this.field329.method391(109, 926);
                    this.field329.method393(var4);
                    this.field429 = true;
                }
                if (var5 == 943) {
                    this.field329.method391(87, 926);
                    this.field329.method393(var6);
                    this.field329.method427(var3, 38866);
                    this.field329.method393(this.field44);
                    this.field329.method393(var4);
                    this.field352 = 0;
                    this.field353 = var4;
                    this.field354 = var3;
                    this.field355 = 2;
                    if (class58.field1405[var4].field1426 == this.field255) {
                        this.field355 = 1;
                    }
                    if (class58.field1405[var4].field1426 == this.field133) {
                        this.field355 = 3;
                    }
                }
                if (var5 == 422) {
                    if ((var3 & 3) == 0) {
                        ++field169;
                    }
                    if (field169 >= 132) {
                        this.field329.method391(48, 926);
                        this.field329.method392(205);
                        field169 = 0;
                    }
                    this.field329.method391(78, 926);
                    this.field329.method427(var6, 38866);
                    this.field329.method426(this.field272, var3);
                    this.field329.method427(var4, 38866);
                    this.field352 = 0;
                    this.field353 = var4;
                    this.field354 = var3;
                    this.field355 = 2;
                    if (class58.field1405[var4].field1426 == this.field255) {
                        this.field355 = 1;
                    }
                    if (class58.field1405[var4].field1426 == this.field133) {
                        this.field355 = 3;
                    }
                }
                if (var5 == 747) {
                    class54 var29 = this.field444[var6];
                    if (var29 != null) {
                        this.method98(var29.field1641[0], field132.field1641[0], this.field195, 0, 1, 0, false, 2, 1, var29.field1642[0], 0, field132.field1642[0]);
                        this.field39 = super.field979;
                        this.field40 = super.field980;
                        this.field42 = 2;
                        this.field41 = 0;
                        this.field329.method391(246, 926);
                        this.field329.method428(false, var6);
                    }
                }
                if (var5 == 746) {
                    class54 var30 = this.field444[var6];
                    if (var30 != null) {
                        this.method98(var30.field1641[0], field132.field1641[0], this.field195, 0, 1, 0, false, 2, 1, var30.field1642[0], 0, field132.field1642[0]);
                        this.field39 = super.field979;
                        this.field40 = super.field980;
                        this.field42 = 2;
                        this.field41 = 0;
                        this.field329.method391(24, 926);
                        this.field329.method428(false, var6);
                    }
                }
                if (var5 == 45) {
                    class1 var31 = this.field286[var6];
                    if (var31 != null) {
                        this.method98(var31.field1641[0], field132.field1641[0], this.field195, 0, 1, 0, false, 2, 1, var31.field1642[0], 0, field132.field1642[0]);
                        this.field39 = super.field979;
                        this.field40 = super.field980;
                        this.field42 = 2;
                        this.field41 = 0;
                        this.field329.method391(168, 926);
                        this.field329.method426(this.field272, var6);
                    }
                }
                if (var5 == 200) {
                    String var32 = this.field179[arg0];
                    int var33 = var32.indexOf("@whi@");
                    if (var33 != -1) {
                        if (this.field255 == -1) {
                            this.method89(this.field261);
                            this.field107 = var32.substring(var33 + 5).trim();
                            this.field514 = false;
                            for (int var34 = 0; var34 < class58.field1405.length; ++var34) {
                                if (class58.field1405[var34] != null && class58.field1405[var34].field1422 == 600) {
                                    this.field498 = this.field255 = class58.field1405[var34].field1426;
                                    break;
                                }
                            }
                        } else {
                            this.method131((byte) -32, "", 0, "Please close the interface you have open before using 'report abuse'");
                        }
                    }
                }
                if (var5 == 829) {
                    this.field329.method391(61, 926);
                    this.field329.method393(this.field56);
                    this.field329.method428(false, this.field57);
                    this.field329.method428(false, this.field55);
                    this.field329.method393(var4);
                    this.field329.method428(false, var3);
                    this.field329.method427(var6, 38866);
                    this.field352 = 0;
                    this.field353 = var4;
                    this.field354 = var3;
                    this.field355 = 2;
                    if (class58.field1405[var4].field1426 == this.field255) {
                        this.field355 = 1;
                    }
                    if (class58.field1405[var4].field1426 == this.field133) {
                        this.field355 = 3;
                    }
                }
                if (var5 == 718) {
                    class54 var35 = this.field444[var6];
                    if (var35 != null) {
                        this.method98(var35.field1641[0], field132.field1641[0], this.field195, 0, 1, 0, false, 2, 1, var35.field1642[0], 0, field132.field1642[0]);
                        this.field39 = super.field979;
                        this.field40 = super.field980;
                        this.field42 = 2;
                        this.field41 = 0;
                        this.field329.method391(110, 926);
                        this.field329.method393(var6);
                        this.field329.method428(false, this.field56);
                        this.field329.method426(this.field272, this.field57);
                        this.field329.method393(this.field55);
                    }
                }
                if (var5 == 1951) {
                    int var36 = var6 >> 14 & 32767;
                    class59 var37 = class59.method555(var36);
                    String var38;
                    if (var37.field1499 != null) {
                        var38 = new String(var37.field1499);
                    } else {
                        var38 = "It's a " + var37.field1497 + ".";
                    }
                    this.method131((byte) -32, "", 0, var38);
                }
                if (var5 == 748) {
                    boolean var39 = this.method98(var3, field132.field1641[0], this.field195, 0, 0, 0, false, 2, 0, var4, 0, field132.field1642[0]);
                    if (!var39) {
                        this.method98(var3, field132.field1641[0], this.field195, 0, 1, 0, false, 2, 1, var4, 0, field132.field1642[0]);
                    }
                    this.field39 = super.field979;
                    this.field40 = super.field980;
                    this.field42 = 2;
                    this.field41 = 0;
                    this.field329.method391(146, 926);
                    this.field329.method427(var6, 38866);
                    this.field329.method426(this.field272, this.field223 + var3);
                    this.field329.method426(this.field272, this.field224 + var4);
                }
                if (var5 == 144 && this.method139(var3, 2, var4, var6)) {
                    this.field329.method391(53, 926);
                    this.field329.method427(this.field224 + var4, 38866);
                    this.field329.method428(false, var6 >> 14 & 32767);
                    this.field329.method427(this.field44, 38866);
                    this.field329.method428(false, this.field223 + var3);
                }
                if (var5 == 253) {
                    boolean var41 = this.method98(var3, field132.field1641[0], this.field195, 0, 0, 0, false, 2, 0, var4, 0, field132.field1642[0]);
                    if (!var41) {
                        this.method98(var3, field132.field1641[0], this.field195, 0, 1, 0, false, 2, 1, var4, 0, field132.field1642[0]);
                    }
                    this.field39 = super.field979;
                    this.field40 = super.field980;
                    this.field42 = 2;
                    this.field41 = 0;
                    this.field329.method391(252, 926);
                    this.field329.method427(this.field224 + var4, 38866);
                    this.field329.method426(this.field272, var6);
                    this.field329.method428(false, this.field223 + var3);
                }
                if (var5 == 394 || var5 == 76 || var5 == 484 || var5 == 215) {
                    String var43 = this.field179[arg0];
                    int var44 = var43.indexOf("@whi@");
                    if (var44 != -1) {
                        long var45 = class20.method268(var43.substring(var44 + 5).trim());
                        if (var5 == 394) {
                            this.method69(var45, 641);
                        }
                        if (var5 == 76) {
                            this.method151(var45, (byte) -93);
                        }
                        if (var5 == 484) {
                            this.method46(var45, true);
                        }
                        if (var5 == 215) {
                            this.method57(0, var45);
                        }
                    }
                }
                if (var5 == 726) {
                    boolean var47 = this.method98(var3, field132.field1641[0], this.field195, 0, 0, 0, false, 2, 0, var4, 0, field132.field1642[0]);
                    if (!var47) {
                        this.method98(var3, field132.field1641[0], this.field195, 0, 1, 0, false, 2, 1, var4, 0, field132.field1642[0]);
                    }
                    this.field39 = super.field979;
                    this.field40 = super.field980;
                    this.field42 = 2;
                    this.field41 = 0;
                    this.field329.method391(171, 926);
                    this.field329.method427(this.field55, 38866);
                    this.field329.method393(this.field224 + var4);
                    this.field329.method428(false, var6);
                    this.field329.method427(this.field57, 38866);
                    this.field329.method428(false, this.field223 + var3);
                    this.field329.method393(this.field56);
                }
                if (var5 == 762 || var5 == 680) {
                    String var49 = this.field179[arg0];
                    int var50 = var49.indexOf("@whi@");
                    if (var50 != -1) {
                        String var51 = var49.substring(var50 + 5).trim();
                        String var52 = class20.method272(false, class20.method269(class20.method268(var51), -898));
                        boolean var53 = false;
                        for (int var54 = 0; var54 < this.field287; ++var54) {
                            class1 var55 = this.field286[this.field288[var54]];
                            if (var55 != null && var55.field19 != null && var55.field19.equalsIgnoreCase(var52)) {
                                this.method98(var55.field1641[0], field132.field1641[0], this.field195, 0, 1, 0, false, 2, 1, var55.field1642[0], 0, field132.field1642[0]);
                                if (var5 == 762) {
                                    this.field329.method391(168, 926);
                                    this.field329.method426(this.field272, this.field288[var54]);
                                }
                                if (var5 == 680) {
                                    this.field329.method391(154, 926);
                                    this.field329.method393(this.field288[var54]);
                                }
                                var53 = true;
                                break;
                            }
                        }
                        if (!var53) {
                            this.method131((byte) -32, "", 0, "Unable to find " + var52);
                        }
                    }
                }
                if (var5 == 975) {
                    this.field329.method391(216, 926);
                    this.field329.method426(this.field272, var4);
                    this.field329.method393(var6);
                    this.field329.method427(var3, 38866);
                    this.field352 = 0;
                    this.field353 = var4;
                    this.field354 = var3;
                    this.field355 = 2;
                    if (class58.field1405[var4].field1426 == this.field255) {
                        this.field355 = 1;
                    }
                    if (class58.field1405[var4].field1426 == this.field133) {
                        this.field355 = 3;
                    }
                }
                if (var5 == 447) {
                    class1 var56 = this.field286[var6];
                    if (var56 != null) {
                        this.method98(var56.field1641[0], field132.field1641[0], this.field195, 0, 1, 0, false, 2, 1, var56.field1642[0], 0, field132.field1642[0]);
                        this.field39 = super.field979;
                        this.field40 = super.field980;
                        this.field42 = 2;
                        this.field41 = 0;
                        this.field329.method391(126, 926);
                        this.field329.method426(this.field272, var6);
                        this.field329.method428(false, this.field55);
                        this.field329.method428(false, this.field57);
                        this.field329.method393(this.field56);
                    }
                }
                if (var5 == 499) {
                    ++field489;
                    if (field489 >= 109) {
                        this.field329.method391(185, 926);
                        this.field329.method395(715994);
                        field489 = 0;
                    }
                    this.method139(var3, 2, var4, var6);
                    this.field329.method391(50, 926);
                    this.field329.method393(this.field223 + var3);
                    this.field329.method393(this.field224 + var4);
                    this.field329.method428(false, var6 >> 14 & 32767);
                }
                if (var5 == 1186) {
                    class32 var57 = class32.method380(var6);
                    class58 var58 = class58.field1405[var4];
                    String var59;
                    if (var58 != null && var58.field1440[var3] >= 100000) {
                        var59 = var58.field1440[var3] + " x " + var57.field1018;
                    } else if (var57.field1043 != null) {
                        var59 = new String(var57.field1043);
                    } else {
                        var59 = "It's a " + var57.field1018 + ".";
                    }
                    this.method131((byte) -32, "", 0, var59);
                }
                if (var5 == 891) {
                    class54 var60 = this.field444[var6];
                    if (var60 != null) {
                        this.method98(var60.field1641[0], field132.field1641[0], this.field195, 0, 1, 0, false, 2, 1, var60.field1642[0], 0, field132.field1642[0]);
                        this.field39 = super.field979;
                        this.field40 = super.field980;
                        this.field42 = 2;
                        this.field41 = 0;
                        this.field329.method391(227, 926);
                        this.field329.method427(var6, 38866);
                    }
                }
                if (var5 == 855) {
                    this.field329.method391(164, 926);
                    this.field329.method428(false, var3);
                    this.field329.method393(var4);
                    this.field329.method428(false, var6);
                    this.field352 = 0;
                    this.field353 = var4;
                    this.field354 = var3;
                    this.field355 = 2;
                    if (class58.field1405[var4].field1426 == this.field255) {
                        this.field355 = 1;
                    }
                    if (class58.field1405[var4].field1426 == this.field133) {
                        this.field355 = 3;
                    }
                }
                if (var5 == 1174) {
                    ++field144;
                    if (field144 >= 87) {
                        this.field329.method391(167, 926);
                        field144 = 0;
                    }
                    this.method139(var3, 2, var4, var6);
                    this.field329.method391(182, 926);
                    this.field329.method427(var6 >> 14 & 32767, 38866);
                    this.field329.method426(this.field272, this.field224 + var4);
                    this.field329.method428(false, this.field223 + var3);
                }
                if (var5 == 664) {
                    class54 var61 = this.field444[var6];
                    if (var61 != null) {
                        this.method98(var61.field1641[0], field132.field1641[0], this.field195, 0, 1, 0, false, 2, 1, var61.field1642[0], 0, field132.field1642[0]);
                        this.field39 = super.field979;
                        this.field40 = super.field980;
                        this.field42 = 2;
                        this.field41 = 0;
                        this.field329.method391(113, 926);
                        this.field329.method426(this.field272, var6);
                    }
                }
                if (var5 == 598) {
                    this.field329.method391(214, 926);
                    this.field329.method426(this.field272, var3);
                    this.field329.method426(this.field272, var4);
                    this.field329.method426(this.field272, var6);
                    this.field352 = 0;
                    this.field353 = var4;
                    this.field354 = var3;
                    this.field355 = 2;
                    if (class58.field1405[var4].field1426 == this.field255) {
                        this.field355 = 1;
                    }
                    if (class58.field1405[var4].field1426 == this.field133) {
                        this.field355 = 3;
                    }
                }
                if (var5 == 478) {
                    this.method139(var3, 2, var4, var6);
                    this.field329.method391(228, 926);
                    this.field329.method428(false, var6 >> 14 & 32767);
                    this.field329.method393(this.field223 + var3);
                    this.field329.method427(this.field224 + var4, 38866);
                }
                if (var5 == 382) {
                    class54 var62 = this.field444[var6];
                    if (var62 != null) {
                        this.method98(var62.field1641[0], field132.field1641[0], this.field195, 0, 1, 0, false, 2, 1, var62.field1642[0], 0, field132.field1642[0]);
                        this.field39 = super.field979;
                        this.field40 = super.field980;
                        this.field42 = 2;
                        this.field41 = 0;
                        this.field329.method391(43, 926);
                        this.field329.method393(var6);
                        this.field329.method393(this.field44);
                    }
                }
                if (var5 == 1022) {
                    class32 var63 = class32.method380(var6);
                    String var64;
                    if (var63.field1043 != null) {
                        var64 = new String(var63.field1043);
                    } else {
                        var64 = "It's a " + var63.field1018 + ".";
                    }
                    this.method131((byte) -32, "", 0, var64);
                }
                if (var5 == 358) {
                    class58 var65 = class58.field1405[var4];
                    this.field43 = 1;
                    this.field44 = var4;
                    this.field45 = var65.field1420;
                    this.field54 = 0;
                    this.field177 = true;
                    String var66 = var65.field1438;
                    if (var66.indexOf(" ") != -1) {
                        var66 = var66.substring(0, var66.indexOf(" "));
                    }
                    String var67 = var65.field1438;
                    if (var67.indexOf(" ") != -1) {
                        var67 = var67.substring(var67.indexOf(" ") + 1);
                    }
                    this.field46 = var66 + " " + var65.field1408 + " " + var67;
                    if (this.field45 == 16) {
                        this.field177 = true;
                        this.field356 = 3;
                        this.field136 = true;
                    }
                } else {
                    if (var5 == 131) {
                        class54 var68 = this.field444[var6];
                        if (var68 != null) {
                            this.method98(var68.field1641[0], field132.field1641[0], this.field195, 0, 1, 0, false, 2, 1, var68.field1642[0], 0, field132.field1642[0]);
                            this.field39 = super.field979;
                            this.field40 = super.field980;
                            this.field42 = 2;
                            this.field41 = 0;
                            this.field329.method391(107, 926);
                            this.field329.method426(this.field272, var6);
                        }
                    }
                    if (var5 == 320) {
                        class1 var69 = this.field286[var6];
                        if (var69 != null) {
                            this.method98(var69.field1641[0], field132.field1641[0], this.field195, 0, 1, 0, false, 2, 1, var69.field1642[0], 0, field132.field1642[0]);
                            this.field39 = super.field979;
                            this.field40 = super.field980;
                            this.field42 = 2;
                            this.field41 = 0;
                            this.field329.method391(240, 926);
                            this.field329.method393(var6);
                        }
                    }
                    if (var5 == 863) {
                        class1 var70 = this.field286[var6];
                        if (var70 != null) {
                            this.method98(var70.field1641[0], field132.field1641[0], this.field195, 0, 1, 0, false, 2, 1, var70.field1642[0], 0, field132.field1642[0]);
                            this.field39 = super.field979;
                            this.field40 = super.field980;
                            this.field42 = 2;
                            this.field41 = 0;
                            this.field329.method391(249, 926);
                            this.field329.method393(var6);
                        }
                    }
                    if (var5 == 242) {
                        this.method89(this.field261);
                    }
                    if (var5 == 698) {
                        boolean var71 = this.method98(var3, field132.field1641[0], this.field195, 0, 0, 0, false, 2, 0, var4, 0, field132.field1642[0]);
                        if (!var71) {
                            this.method98(var3, field132.field1641[0], this.field195, 0, 1, 0, false, 2, 1, var4, 0, field132.field1642[0]);
                        }
                        this.field39 = super.field979;
                        this.field40 = super.field980;
                        this.field42 = 2;
                        this.field41 = 0;
                        this.field329.method391(219, 926);
                        this.field329.method426(this.field272, var6);
                        this.field329.method428(false, this.field223 + var3);
                        this.field329.method427(this.field224 + var4, 38866);
                    }
                    if (var5 == 579) {
                        field252 += var6;
                        if (field252 >= 64) {
                            this.field329.method391(31, 926);
                            this.field329.method392(4);
                            field252 = 0;
                        }
                        this.field329.method391(32, 926);
                        this.field329.method428(false, var4);
                        this.field329.method427(var3, 38866);
                        this.field329.method428(false, var6);
                        this.field352 = 0;
                        this.field353 = var4;
                        this.field354 = var3;
                        this.field355 = 2;
                        if (class58.field1405[var4].field1426 == this.field255) {
                            this.field355 = 1;
                        }
                        if (class58.field1405[var4].field1426 == this.field133) {
                            this.field355 = 3;
                        }
                    }
                    if (var5 == 549) {
                        ++field173;
                        if (field173 >= 56) {
                            this.field329.method391(242, 926);
                            this.field329.method393(22200);
                            field173 = 0;
                        }
                        this.method139(var3, 2, var4, var6);
                        this.field329.method391(141, 926);
                        this.field329.method428(false, var6 >> 14 & 32767);
                        this.field329.method426(this.field272, this.field224 + var4);
                        this.field329.method428(false, this.field223 + var3);
                    }
                    if (var5 == 158) {
                        class58 var73 = class58.field1405[var4];
                        boolean var74 = true;
                        if (var73.field1422 > 0) {
                            var74 = this.method42(var73, this.field499);
                        }
                        if (var74) {
                            this.field329.method391(188, 926);
                            this.field329.method393(var4);
                        }
                    }
                    if (var5 == 540) {
                        this.field329.method391(180, 926);
                        this.field329.method427(var6, 38866);
                        this.field329.method393(var4);
                        this.field329.method393(var3);
                        this.field352 = 0;
                        this.field353 = var4;
                        this.field354 = var3;
                        this.field355 = 2;
                        if (class58.field1405[var4].field1426 == this.field255) {
                            this.field355 = 1;
                        }
                        if (class58.field1405[var4].field1426 == this.field133) {
                            this.field355 = 3;
                        }
                    }
                    this.field54 = 0;
                    this.field43 = 0;
                    if (arg1) {
                        this.field503 = this.field449.method387();
                    }
                    this.field177 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "x", descriptor = "(I)V")
    public final void method101(int arg0) {
        int var2 = this.field378 * 128 + 64;
        int var3 = this.field379 * 128 + 64;
        int var4 = this.method141((byte) 76, var3, this.field307, var2) - this.field380;
        if (this.field125 < var2) {
            this.field125 += (var2 - this.field125) * this.field382 / 1000 + this.field381;
            if (this.field125 > var2) {
                this.field125 = var2;
            }
        }
        if (this.field125 > var2) {
            this.field125 -= (this.field125 - var2) * this.field382 / 1000 + this.field381;
            if (this.field125 < var2) {
                this.field125 = var2;
            }
        }
        if (this.field126 < var4) {
            this.field126 += (var4 - this.field126) * this.field382 / 1000 + this.field381;
            if (this.field126 > var4) {
                this.field126 = var4;
            }
        }
        if (this.field126 > var4) {
            this.field126 -= (this.field126 - var4) * this.field382 / 1000 + this.field381;
            if (this.field126 < var4) {
                this.field126 = var4;
            }
        }
        if (this.field127 < var3) {
            this.field127 += (var3 - this.field127) * this.field382 / 1000 + this.field381;
            if (this.field127 > var3) {
                this.field127 = var3;
            }
        }
        if (this.field127 > var3) {
            this.field127 -= (this.field127 - var3) * this.field382 / 1000 + this.field381;
            if (this.field127 < var3) {
                this.field127 = var3;
            }
        }
        int var5 = this.field302 * 128 + 64;
        int var6 = this.field303 * 128 + 64;
        this.field438 += arg0;
        int var7 = this.method141((byte) 76, var6, this.field307, var5) - this.field304;
        int var8 = var5 - this.field125;
        int var9 = var7 - this.field126;
        int var10 = var6 - this.field127;
        int var11 = (int) Math.sqrt((double) (var8 * var8 + var10 * var10));
        int var12 = (int) (Math.atan2((double) var9, (double) var11) * 325.949D) & 2047;
        int var13 = (int) (Math.atan2((double) var8, (double) var10) * -325.949D) & 2047;
        if (var12 < 128) {
            var12 = 128;
        }
        if (var12 > 383) {
            var12 = 383;
        }
        if (this.field128 < var12) {
            this.field128 += (var12 - this.field128) * this.field306 / 1000 + this.field305;
            if (this.field128 > var12) {
                this.field128 = var12;
            }
        }
        if (this.field128 > var12) {
            this.field128 -= (this.field128 - var12) * this.field306 / 1000 + this.field305;
            if (this.field128 < var12) {
                this.field128 = var12;
            }
        }
        int var14 = var13 - this.field129;
        if (var14 > 1024) {
            var14 -= 2048;
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (var14 > 0) {
            this.field129 += this.field306 * var14 / 1000 + this.field305;
            this.field129 &= 2047;
        }
        if (var14 < 0) {
            this.field129 -= -var14 * this.field306 / 1000 + this.field305;
            this.field129 &= 2047;
        }
        int var15 = var13 - this.field129;
        if (var15 > 1024) {
            var15 -= 2048;
        }
        if (var15 < -1024) {
            var15 += 2048;
        }
        if (var15 < 0 && var14 > 0 || var15 > 0 && var14 < 0) {
            this.field129 = var13;
        }
    }

    @OriginalMember(owner = "client", name = "y", descriptor = "(I)V")
    public final void method102(int arg0) {
        int var2 = this.field391.method255("Choose Option", 0);
        this.field438 += arg0;
        for (int var3 = 0; var3 < this.field414; ++var3) {
            int var11 = this.field391.method255(this.field179[var3], 0);
            if (var11 > var2) {
                var2 = var11;
            }
        }
        var2 += 8;
        int var4 = this.field414 * 15 + 21;
        if (super.field979 > 4 && super.field980 > 4 && super.field979 < 516 && super.field980 < 338) {
            int var5 = super.field979 - 4 - var2 / 2;
            if (var2 + var5 > 512) {
                var5 = 512 - var2;
            }
            if (var5 < 0) {
                var5 = 0;
            }
            int var6 = super.field980 - 4;
            if (var4 + var6 > 334) {
                var6 = 334 - var4;
            }
            if (var6 < 0) {
                var6 = 0;
            }
            this.field345 = true;
            this.field333 = 0;
            this.field334 = var5;
            this.field335 = var6;
            this.field336 = var2;
            this.field337 = this.field414 * 15 + 22;
        }
        if (super.field979 > 553 && super.field980 > 205 && super.field979 < 743 && super.field980 < 466) {
            int var7 = super.field979 - 553 - var2 / 2;
            if (var7 < 0) {
                var7 = 0;
            } else if (var2 + var7 > 190) {
                var7 = 190 - var2;
            }
            int var8 = super.field980 - 205;
            if (var8 < 0) {
                var8 = 0;
            } else if (var4 + var8 > 261) {
                var8 = 261 - var4;
            }
            this.field345 = true;
            this.field333 = 1;
            this.field334 = var7;
            this.field335 = var8;
            this.field336 = var2;
            this.field337 = this.field414 * 15 + 22;
        }
        if (super.field979 > 17 && super.field980 > 357 && super.field979 < 496 && super.field980 < 453) {
            int var9 = super.field979 - 17 - var2 / 2;
            if (var9 < 0) {
                var9 = 0;
            } else if (var2 + var9 > 479) {
                var9 = 479 - var2;
            }
            int var10 = super.field980 - 357;
            if (var10 < 0) {
                var10 = 0;
            } else if (var4 + var10 > 96) {
                var10 = 96 - var4;
            }
            this.field345 = true;
            this.field333 = 2;
            this.field334 = var9;
            this.field335 = var10;
            this.field336 = var2;
            this.field337 = this.field414 * 15 + 22;
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(ILLDILQFVA;I)V")
    private final void method103(int arg0, class34 arg1, int arg2) {
        this.field403 = 0;
        this.field289 = 0;
        this.method18(true, arg1, arg2);
        this.method125(arg2, arg1, 7);
        this.method143(arg2, arg1, 9);
        if (arg0 == 0) {
            for (int var4 = 0; var4 < this.field403; ++var4) {
                int var6 = this.field404[var4];
                if (field246 != this.field444[var6].field1695) {
                    this.field444[var6].field1359 = null;
                    this.field444[var6] = null;
                }
            }
            if (arg1.field1073 != arg2) {
                signlink.reporterror(this.field103 + " size mismatch in getnpcpos - pos:" + arg1.field1073 + " psize:" + arg2);
                throw new RuntimeException("eek");
            } else {
                for (int var5 = 0; var5 < this.field445; ++var5) {
                    if (this.field444[this.field446[var5]] == null) {
                        signlink.reporterror(this.field103 + " null entry in npc list - pos:" + var5 + " size:" + this.field445);
                        throw new RuntimeException("eek");
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "i", descriptor = "(Z)V")
    public final void method104(boolean arg0) {
        this.field321 &= arg0;
        int var2 = this.field334;
        int var3 = this.field335;
        int var4 = this.field336;
        int var5 = this.field337;
        int var6 = 6116423;
        class53.method521(var6, -426, var4, var2, var3, var5);
        class53.method521(0, -426, var4 - 2, var2 + 1, var3 + 1, 16);
        class53.method522(0, var2 + 1, var4 - 2, this.field423, var5 - 19, var3 + 18);
        this.field391.method257(var2 + 3, "Choose Option", var3 + 14, var6, 0);
        int var7 = super.field972;
        int var8 = super.field973;
        if (this.field333 == 0) {
            var7 -= 4;
            var8 -= 4;
        }
        if (this.field333 == 1) {
            var7 -= 553;
            var8 -= 205;
        }
        if (this.field333 == 2) {
            var7 -= 17;
            var8 -= 357;
        }
        for (int var9 = 0; var9 < this.field414; ++var9) {
            int var10 = (this.field414 - 1 - var9) * 15 + var3 + 31;
            int var11 = 16777215;
            if (var7 > var2 && var7 < var2 + var4 && var8 > var10 - 13 && var8 < var10 + 3) {
                var11 = 16776960;
            }
            this.field391.method261(var11, var2 + 3, true, true, this.field179[var9], var10);
        }
    }

    @OriginalMember(owner = "client", name = "z", descriptor = "(I)Ljava/net/Socket;")
    public final Socket method105(int arg0) throws IOException {
        return signlink.mainapp != null ? signlink.opensocket(arg0) : new Socket(InetAddress.getByName(this.getCodeBase().getHost()), arg0);
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;)Ljava/io/DataInputStream;")
    public final DataInputStream method106(String arg0) throws IOException {
        if (!this.field328) {
            return signlink.mainapp != null ? signlink.openurl(arg0) : new DataInputStream((new URL(this.getCodeBase(), arg0)).openStream());
        } else {
            if (this.field249 != null) {
                try {
                    this.field249.close();
                } catch (Exception var4) {
                }
                this.field249 = null;
            }
            this.field249 = this.method105(43595);
            this.field249.setSoTimeout(10000);
            InputStream var2 = this.field249.getInputStream();
            OutputStream var3 = this.field249.getOutputStream();
            var3.write(("JAGGRAB /" + arg0 + "\n\n").getBytes());
            return new DataInputStream(var2);
        }
    }

    @OriginalMember(owner = "client", name = "A", descriptor = "(I)I")
    public final int method107(int arg0) {
        if (arg0 <= 0) {
            field469 = !field469;
        }
        int var2 = 3;
        if (this.field128 < 310) {
            int var3 = this.field125 >> 7;
            int var4 = this.field127 >> 7;
            int var5 = field132.field1643 >> 7;
            int var6 = field132.field1644 >> 7;
            if ((this.field479[this.field307][var3][var4] & 4) != 0) {
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
                    if ((this.field479[this.field307][var3][var4] & 4) != 0) {
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
                        if ((this.field479[this.field307][var3][var4] & 4) != 0) {
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
                    if ((this.field479[this.field307][var3][var4] & 4) != 0) {
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
                        if ((this.field479[this.field307][var3][var4] & 4) != 0) {
                            var2 = this.field307;
                        }
                    }
                }
            }
        }
        if ((this.field479[this.field307][field132.field1643 >> 7][field132.field1644 >> 7] & 4) != 0) {
            var2 = this.field307;
        }
        return var2;
    }

    @OriginalMember(owner = "client", name = "B", descriptor = "(I)I")
    public final int method108(int arg0) {
        int var2 = this.method141((byte) 76, this.field127, this.field307, this.field125);
        if (arg0 != 4) {
            this.field348 = !this.field348;
        }
        return var2 - this.field126 < 800 && (this.field479[this.field307][this.field125 >> 7][this.field127 >> 7] & 4) != 0 ? this.field307 : 3;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IILAHUILQJH;II)V")
    public final void method109(int arg0, int arg1, class1 arg2, int arg3, int arg4) {
        int var6 = 76 / arg4;
        if (field132 != arg2) {
            if (this.field414 < 400) {
                String var7;
                if (arg2.field28 == 0) {
                    var7 = arg2.field19 + method86(arg2.field12, 462, field132.field12) + " (level-" + arg2.field12 + ")";
                } else {
                    var7 = arg2.field19 + " (skill-" + arg2.field28 + ")";
                }
                if (this.field54 == 1) {
                    this.field179[this.field414] = "Use " + this.field58 + " with @whi@" + var7;
                    this.field359[this.field414] = 447;
                    this.field360[this.field414] = arg0;
                    this.field357[this.field414] = arg3;
                    this.field358[this.field414] = arg1;
                    ++this.field414;
                } else if (this.field43 == 1) {
                    if ((this.field45 & 8) == 8) {
                        this.field179[this.field414] = this.field46 + " @whi@" + var7;
                        this.field359[this.field414] = 348;
                        this.field360[this.field414] = arg0;
                        this.field357[this.field414] = arg3;
                        this.field358[this.field414] = arg1;
                        ++this.field414;
                    }
                } else {
                    for (int var8 = 4; var8 >= 0; --var8) {
                        if (this.field201[var8] != null) {
                            this.field179[this.field414] = this.field201[var8] + " @whi@" + var7;
                            short var10 = 0;
                            if (this.field201[var8].equalsIgnoreCase("attack")) {
                                if (arg2.field12 > field132.field12) {
                                    var10 = 2000;
                                }
                                if (field132.field13 != 0 && arg2.field13 != 0) {
                                    if (field132.field13 == arg2.field13) {
                                        var10 = 2000;
                                    } else {
                                        var10 = 0;
                                    }
                                }
                            } else if (this.field202[var8]) {
                                var10 = 2000;
                            }
                            if (var8 == 0) {
                                this.field359[this.field414] = var10 + 345;
                            }
                            if (var8 == 1) {
                                this.field359[this.field414] = var10 + 492;
                            }
                            if (var8 == 2) {
                                this.field359[this.field414] = var10 + 863;
                            }
                            if (var8 == 3) {
                                this.field359[this.field414] = var10 + 45;
                            }
                            if (var8 == 4) {
                                this.field359[this.field414] = var10 + 320;
                            }
                            this.field360[this.field414] = arg0;
                            this.field357[this.field414] = arg3;
                            this.field358[this.field414] = arg1;
                            ++this.field414;
                        }
                    }
                }
                for (int var9 = 0; var9 < this.field414; ++var9) {
                    if (this.field359[var9] == 84) {
                        this.field179[var9] = "Walk here @whi@" + var7;
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "C", descriptor = "(I)V")
    public final void method110(int arg0) {
        if (this.field212 == 0) {
            int var2 = super.field978;
            if (arg0 >= 0) {
                this.method83();
            }
            if (this.field43 == 1 && super.field979 >= 516 && super.field980 >= 160 && super.field979 <= 765 && super.field980 <= 205) {
                var2 = 0;
            }
            if (this.field345) {
                if (var2 != 1) {
                    int var3 = super.field972;
                    int var4 = super.field973;
                    if (this.field333 == 0) {
                        var3 -= 4;
                        var4 -= 4;
                    }
                    if (this.field333 == 1) {
                        var3 -= 553;
                        var4 -= 205;
                    }
                    if (this.field333 == 2) {
                        var3 -= 17;
                        var4 -= 357;
                    }
                    if (var3 < this.field334 - 10 || var3 > this.field336 + this.field334 + 10 || var4 < this.field335 - 10 || var4 > this.field337 + this.field335 + 10) {
                        this.field345 = false;
                        if (this.field333 == 1) {
                            this.field177 = true;
                        }
                        if (this.field333 == 2) {
                            this.field260 = true;
                        }
                    }
                }
                if (var2 == 1) {
                    int var5 = this.field334;
                    int var6 = this.field335;
                    int var7 = this.field336;
                    int var8 = super.field979;
                    int var9 = super.field980;
                    if (this.field333 == 0) {
                        var8 -= 4;
                        var9 -= 4;
                    }
                    if (this.field333 == 1) {
                        var8 -= 553;
                        var9 -= 205;
                    }
                    if (this.field333 == 2) {
                        var8 -= 17;
                        var9 -= 357;
                    }
                    int var10 = -1;
                    for (int var11 = 0; var11 < this.field414; ++var11) {
                        int var12 = (this.field414 - 1 - var11) * 15 + var6 + 31;
                        if (var8 > var5 && var8 < var5 + var7 && var9 > var12 - 13 && var9 < var12 + 3) {
                            var10 = var11;
                        }
                    }
                    if (var10 != -1) {
                        this.method100(var10, false);
                    }
                    this.field345 = false;
                    if (this.field333 == 1) {
                        this.field177 = true;
                    }
                    if (this.field333 == 2) {
                        this.field260 = true;
                        return;
                    }
                }
            } else {
                if (var2 == 1 && this.field414 > 0) {
                    int var13 = this.field359[this.field414 - 1];
                    if (var13 == 855 || var13 == 822 || var13 == 589 || var13 == 914 || var13 == 568 || var13 == 579 || var13 == 540 || var13 == 422 || var13 == 598 || var13 == 975 || var13 == 787 || var13 == 1186) {
                        int var14 = this.field357[this.field414 - 1];
                        int var15 = this.field358[this.field414 - 1];
                        class58 var16 = class58.field1405[var15];
                        if (var16.field1456 || var16.field1403) {
                            this.field317 = false;
                            this.field257 = 0;
                            this.field210 = var15;
                            this.field211 = var14;
                            this.field212 = 2;
                            this.field213 = super.field979;
                            this.field214 = super.field980;
                            if (class58.field1405[var15].field1426 == this.field255) {
                                this.field212 = 1;
                            }
                            if (class58.field1405[var15].field1426 == this.field133) {
                                this.field212 = 3;
                            }
                            return;
                        }
                    }
                }
                if (var2 == 1 && (this.field115 == 1 || this.method148(8, this.field414 - 1)) && this.field414 > 2) {
                    var2 = 2;
                }
                if (var2 == 1 && this.field414 > 0) {
                    this.method100(this.field414 - 1, false);
                }
                if (var2 != 2 || this.field414 <= 0) {
                    return;
                }
                this.method102(this.field487);
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(LLDILQFVA;II)V")
    private final void method111(class34 arg0, int arg1, int arg2) {
        int var4 = arg0.method413(true, 8);
        if (var4 < this.field287) {
            for (int var5 = var4; var5 < this.field287; ++var5) {
                this.field404[this.field403++] = this.field288[var5];
            }
        }
        if (var4 > this.field287) {
            signlink.reporterror(this.field103 + " Too many players");
            throw new RuntimeException("eek");
        } else {
            this.field287 = 0;
            if (arg2 != 22339) {
                this.method83();
            }
            for (int var6 = 0; var6 < var4; ++var6) {
                int var7 = this.field288[var6];
                class1 var8 = this.field286[var7];
                int var9 = arg0.method413(true, 1);
                if (var9 == 0) {
                    this.field288[this.field287++] = var7;
                    var8.field1695 = field246;
                } else {
                    int var10 = arg0.method413(true, 2);
                    if (var10 == 0) {
                        this.field288[this.field287++] = var7;
                        var8.field1695 = field246;
                        this.field290[this.field289++] = var7;
                    } else if (var10 == 1) {
                        this.field288[this.field287++] = var7;
                        var8.field1695 = field246;
                        int var11 = arg0.method413(true, 3);
                        var8.method574(var11, false, false);
                        int var12 = arg0.method413(true, 1);
                        if (var12 == 1) {
                            this.field290[this.field289++] = var7;
                        }
                    } else if (var10 == 2) {
                        this.field288[this.field287++] = var7;
                        var8.field1695 = field246;
                        int var13 = arg0.method413(true, 3);
                        var8.method574(var13, true, false);
                        int var14 = arg0.method413(true, 3);
                        var8.method574(var14, true, false);
                        int var15 = arg0.method413(true, 1);
                        if (var15 == 1) {
                            this.field290[this.field289++] = var7;
                        }
                    } else if (var10 == 3) {
                        this.field404[this.field403++] = var7;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(ZI)V")
    public final void method112(boolean arg0, int arg1) {
        if (!arg0) {
            this.field439 = this.field413.method402();
        }
        class58 var3 = class58.field1405[arg1];
        for (int var4 = 0; var4 < var3.field1421.length && var3.field1421[var4] != -1; ++var4) {
            class58 var5 = class58.field1405[var3.field1421[var4]];
            if (var5.field1410 == 1) {
                this.method112(true, var5.field1458);
            }
            var5.field1434 = 0;
            var5.field1431 = 0;
        }
    }

    @OriginalMember(owner = "client", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        return signlink.mainapp != null ? signlink.mainapp.getAppletContext() : super.getAppletContext();
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(ZLLDILQFVA;I)V")
    private final void method113(boolean arg0, class34 arg1, int arg2) {
        this.field403 = 0;
        this.field289 = 0;
        this.method79(arg1, arg2, 5103);
        this.method111(arg1, arg2, 22339);
        this.method68(17449, arg1, arg2);
        this.method124(arg2, -139, arg1);
        for (int var4 = 0; var4 < this.field403; ++var4) {
            int var6 = this.field404[var4];
            if (field246 != this.field286[var6].field1695) {
                this.field286[var6] = null;
            }
        }
        this.field321 &= arg0;
        if (arg1.field1073 != arg2) {
            signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg1.field1073 + " psize:" + arg2);
            throw new RuntimeException("eek");
        } else {
            for (int var5 = 0; var5 < this.field287; ++var5) {
                if (this.field286[this.field288[var5]] == null) {
                    signlink.reporterror(this.field103 + " null entry in pl list - pos:" + var5 + " size:" + this.field287);
                    throw new RuntimeException("eek");
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(II)V")
    public final void method114(int arg0, int arg1) {
        signlink.wavevol = arg0;
        if (arg1 != 1) {
            this.field329.method392(194);
        }
    }

    @OriginalMember(owner = "client", name = "j", descriptor = "(Z)V")
    public final void method115(boolean arg0) {
        class59.field1465.method154();
        class59.field1482.method154();
        class71.field1712.method154();
        class32.field1030.method154();
        class32.field1028.method154();
        this.field321 &= arg0;
        class1.field1.method154();
        class57.field1396.method154();
    }

    @OriginalMember(owner = "client", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        return signlink.mainapp != null ? signlink.mainapp.getParameter(arg0) : super.getParameter(arg0);
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZB)V")
    public final void method116(boolean arg0, byte arg1) {
        for (int var3 = 0; var3 < this.field445; ++var3) {
            class54 var4 = this.field444[this.field446[var3]];
            int var5 = (this.field446[var3] << 14) + 536870912;
            if (var4 != null && var4.method3(false) && var4.field1359.field1735 == arg0) {
                int var6 = var4.field1643 >> 7;
                int var7 = var4.field1644 >> 7;
                if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
                    if (var4.field1666 == 1 && (var4.field1643 & 127) == 64 && (var4.field1644 & 127) == 64) {
                        if (this.field227[var6][var7] == this.field193) {
                            continue;
                        }
                        this.field227[var6][var7] = this.field193;
                    }
                    if (!var4.field1359.field1708) {
                        var5 += Integer.MIN_VALUE;
                    }
                    this.field174.method169(this.field307, (var4.field1666 - 1) * 64 + 60, var4.field1643, (byte) 7, this.method141((byte) 76, var4.field1644, this.field307, var4.field1643), var5, var4.field1644, var4.field1686, var4.field1645, var4);
                }
            }
        }
        if (arg1 != -85) {
            this.field420 = null;
        }
    }

    @OriginalMember(owner = "client", name = "D", descriptor = "(I)Z")
    public final boolean method117(int arg0) {
        this.field438 += arg0;
        if (this.field282 == null) {
            return false;
        } else {
            try {
                int var2 = this.field282.method229();
                if (var2 == 0) {
                    return false;
                }
                if (this.field439 == -1) {
                    this.field282.method230(this.field413.field1072, 0, 1);
                    this.field439 = this.field413.field1072[0] & 255;
                    if (this.field449 != null) {
                        this.field439 = this.field439 - this.field449.method387() & 255;
                    }
                    this.field438 = class15.field693[this.field439];
                    --var2;
                }
                if (this.field438 == -1) {
                    if (var2 <= 0) {
                        return false;
                    }
                    this.field282.method230(this.field413.field1072, 0, 1);
                    this.field438 = this.field413.field1072[0] & 255;
                    --var2;
                }
                if (this.field438 == -2) {
                    if (var2 <= 1) {
                        return false;
                    }
                    this.field282.method230(this.field413.field1072, 0, 2);
                    this.field413.field1073 = 0;
                    this.field438 = this.field413.method404();
                    var2 -= 2;
                }
                if (var2 < this.field438) {
                    return false;
                }
                this.field413.field1073 = 0;
                this.field282.method230(this.field413.field1072, 0, this.field438);
                this.field440 = 0;
                this.field474 = this.field473;
                this.field473 = this.field472;
                this.field472 = this.field439;
                if (this.field439 == 188) {
                    this.field394 = this.field413.method402();
                    if (this.field394 == 1) {
                        this.field266 = this.field413.method404();
                    }
                    if (this.field394 >= 2 && this.field394 <= 6) {
                        if (this.field394 == 2) {
                            this.field278 = 64;
                            this.field279 = 64;
                        }
                        if (this.field394 == 3) {
                            this.field278 = 0;
                            this.field279 = 64;
                        }
                        if (this.field394 == 4) {
                            this.field278 = 128;
                            this.field279 = 64;
                        }
                        if (this.field394 == 5) {
                            this.field278 = 64;
                            this.field279 = 0;
                        }
                        if (this.field394 == 6) {
                            this.field278 = 64;
                            this.field279 = 128;
                        }
                        this.field394 = 2;
                        this.field275 = this.field413.method404();
                        this.field276 = this.field413.method404();
                        this.field277 = this.field413.method402();
                    }
                    if (this.field394 == 10) {
                        this.field377 = this.field413.method404();
                    }
                    this.field439 = -1;
                    return true;
                }
                if (this.field439 == 34) {
                    int var3 = this.field413.method431(true);
                    int var4 = this.field413.method429(true);
                    class58.field1405[var4].field1429 = 2;
                    class58.field1405[var4].field1430 = var3;
                    this.field439 = -1;
                    return true;
                }
                if (this.field439 == 103) {
                    this.field398 = this.field413.method421(field259);
                    this.field397 = this.field413.method422(0);
                    while (this.field413.field1073 < this.field438) {
                        int var5 = this.field413.method402();
                        this.method136(false, this.field413, var5);
                    }
                    this.field439 = -1;
                    return true;
                }
                if (this.field439 == 53) {
                    int var6 = this.field413.method431(true);
                    class58.field1405[var6].field1429 = 3;
                    if (field132.field20 == null) {
                        class58.field1405[var6].field1430 = (field132.field16[11] << 5) + (field132.field16[8] << 10) + (field132.field16[0] << 15) + (field132.field4[0] << 25) + (field132.field4[4] << 20) + field132.field16[1];
                    } else {
                        class58.field1405[var6].field1430 = (int) (field132.field20.field1710 + 305419896L);
                    }
                    this.field439 = -1;
                    return true;
                }
                if (this.field439 == 118) {
                    this.field456 = this.field413.method420(0);
                    if (this.field456 == this.field356) {
                        if (this.field456 == 3) {
                            this.field356 = 1;
                        } else {
                            this.field356 = 3;
                        }
                        this.field177 = true;
                    }
                    this.field439 = -1;
                    return true;
                }
                if (this.field439 == 222) {
                    int var7 = this.field413.method432(this.field267);
                    int var8 = this.field413.method404();
                    class58 var9 = class58.field1405[var8];
                    var9.field1427 = var7;
                    if (var7 == -1) {
                        var9.field1434 = 0;
                        var9.field1431 = 0;
                    }
                    this.field439 = -1;
                    return true;
                }
                if (this.field439 == 110) {
                    this.field177 = true;
                    int var10 = this.field413.method404();
                    class58 var11 = class58.field1405[var10];
                    int var12 = this.field413.method404();
                    for (int var13 = 0; var13 < var12; ++var13) {
                        var11.field1400[var13] = this.field413.method430(true);
                        int var14 = this.field413.method402();
                        if (var14 == 255) {
                            var14 = this.field413.method436((byte) 5);
                        }
                        var11.field1440[var13] = var14;
                    }
                    for (int var15 = var12; var15 < var11.field1400.length; ++var15) {
                        var11.field1400[var15] = 0;
                        var11.field1440[var15] = 0;
                    }
                    this.field439 = -1;
                    return true;
                }
                if (this.field439 == 52) {
                    this.field470 = false;
                    this.field117 = 2;
                    this.field516 = "";
                    this.field260 = true;
                    this.field439 = -1;
                    return true;
                }
                if (this.field439 == 248) {
                    for (int var16 = 0; var16 < this.field455.length; ++var16) {
                        if (this.field517[var16] != this.field455[var16]) {
                            this.field455[var16] = this.field517[var16];
                            this.method52(var16, 503);
                            this.field177 = true;
                        }
                    }
                    this.field439 = -1;
                    return true;
                }
                if (this.field439 == 159) {
                    this.method103(0, this.field413, this.field438);
                    this.field439 = -1;
                    return true;
                }
                if (this.field439 == 92) {
                    int var17 = this.field413.method434(this.field130);
                    if (var17 >= 0) {
                        this.method112(true, var17);
                    }
                    this.field114 = var17;
                    this.field439 = -1;
                    return true;
                }
                if (this.field439 == 193) {
                    int var18 = this.field413.method432(this.field267);
                    int var19 = this.field413.method431(true);
                    int var20 = this.field413.method433(0);
                    class58 var21 = class58.field1405[var19];
                    var21.field1407 = var20;
                    var21.field1423 = var18;
                    this.field439 = -1;
                    return true;
                }
                if (this.field439 == 237) {
                    int var22 = this.field413.method431(true);
                    int var23 = this.field413.method404();
                    class58 var24 = class58.field1405[var23];
                    if (var24 != null && var24.field1410 == 0) {
                        if (var22 < 0) {
                            var22 = 0;
                        }
                        if (var22 > var24.field1401 - var24.field1452) {
                            var22 = var24.field1401 - var24.field1452;
                        }
                        var24.field1435 = var22;
                    }
                    this.field439 = -1;
                    return true;
                }
                if (this.field439 == 114) {
                    int var25 = this.field413.method433(0);
                    this.field186 = var25;
                    this.field260 = true;
                    this.field439 = -1;
                    return true;
                }
                if (this.field439 == 5) {
                    if (this.field356 == 12) {
                        this.field177 = true;
                    }
                    this.field135 = this.field413.method405();
                    this.field439 = -1;
                    return true;
                }
                if (this.field439 == 246) {
                    this.field448 = this.field413.method402();
                    this.field177 = true;
                    this.field439 = -1;
                    return true;
                }
                if (this.field439 == 226) {
                    int var26 = this.field413.method431(true);
                    boolean var27 = this.field413.method422(0) == 1;
                    class58.field1405[var26].field1442 = var27;
                    this.field439 = -1;
                    return true;
                }
                if (this.field439 == 121) {
                    this.field398 = this.field413.method422(0);
                    this.field397 = this.field413.method420(0);
                    for (int var28 = this.field397; var28 < this.field397 + 8; ++var28) {
                        for (int var29 = this.field398; var29 < this.field398 + 8; ++var29) {
                            if (this.field420[this.field307][var28][var29] != null) {
                                this.field420[this.field307][var28][var29] = null;
                                this.method54(var28, var29);
                            }
                        }
                    }
                    for (class48 var30 = (class48) this.field253.method451(); var30 != null; var30 = (class48) this.field253.method453((byte) 5)) {
                        if (var30.field1288 >= this.field397 && var30.field1288 < this.field397 + 8 && var30.field1289 >= this.field398 && var30.field1289 < this.field398 + 8 && this.field307 == var30.field1286) {
                            var30.field1294 = 0;
                        }
                    }
                    this.field439 = -1;
                    return true;
                }
                if (this.field439 == 229) {
                    this.method74((byte) -10);
                    this.field439 = -1;
                    return false;
                }
                if (this.field439 == 22) {
                    int var31 = this.field413.method430(true);
                    int var32 = this.field413.method404();
                    int var33 = this.field413.method404();
                    if (var31 == 65535) {
                        class58.field1405[var32].field1429 = 0;
                        this.field439 = -1;
                        return true;
                    }
                    class32 var34 = class32.method380(var31);
                    class58.field1405[var32].field1429 = 4;
                    class58.field1405[var32].field1430 = var31;
                    class58.field1405[var32].field1416 = var34.field1010;
                    class58.field1405[var32].field1417 = var34.field1034;
                    class58.field1405[var32].field1415 = var34.field1037 * 100 / var33;
                    this.field439 = -1;
                    return true;
                }
                if (this.field439 == 54) {
                    if (this.field139 != -1) {
                        this.field139 = -1;
                        this.field177 = true;
                        this.field136 = true;
                    }
                    if (this.field133 != -1) {
                        this.field133 = -1;
                        this.field260 = true;
                    }
                    if (this.field117 != 0) {
                        this.field117 = 0;
                        this.field260 = true;
                    }
                    this.field255 = -1;
                    this.field429 = false;
                    this.field439 = -1;
                    return true;
                }
                if (this.field439 != 169 && this.field439 != 243) {
                    if (this.field439 == 155) {
                        this.field364 = true;
                        this.field302 = this.field413.method402();
                        this.field303 = this.field413.method402();
                        this.field304 = this.field413.method404();
                        this.field305 = this.field413.method402();
                        this.field306 = this.field413.method402();
                        if (this.field306 >= 100) {
                            int var85 = this.field302 * 128 + 64;
                            int var86 = this.field303 * 128 + 64;
                            int var87 = this.method141((byte) 76, var86, this.field307, var85) - this.field304;
                            int var88 = var85 - this.field125;
                            int var89 = var87 - this.field126;
                            int var90 = var86 - this.field127;
                            int var91 = (int) Math.sqrt((double) (var88 * var88 + var90 * var90));
                            this.field128 = (int) (Math.atan2((double) var89, (double) var91) * 325.949D) & 2047;
                            this.field129 = (int) (Math.atan2((double) var88, (double) var90) * -325.949D) & 2047;
                            if (this.field128 < 128) {
                                this.field128 = 128;
                            }
                            if (this.field128 > 383) {
                                this.field128 = 383;
                            }
                        }
                        this.field439 = -1;
                        return true;
                    }
                    if (this.field439 == 37) {
                        for (int var92 = 0; var92 < this.field286.length; ++var92) {
                            if (this.field286[var92] != null) {
                                this.field286[var92].field1689 = -1;
                            }
                        }
                        for (int var93 = 0; var93 < this.field444.length; ++var93) {
                            if (this.field444[var93] != null) {
                                this.field444[var93].field1689 = -1;
                            }
                        }
                        this.field439 = -1;
                        return true;
                    }
                    if (this.field439 == 99) {
                        int var94 = this.field413.method431(true);
                        String var95 = this.field413.method409();
                        class58.field1405[var94].field1445 = var95;
                        if (this.field376[this.field356] == class58.field1405[var94].field1426) {
                            this.field177 = true;
                        }
                        this.field439 = -1;
                        return true;
                    }
                    if (this.field439 == 26) {
                        if (this.field356 == 12) {
                            this.field177 = true;
                        }
                        this.field229 = this.field413.method402();
                        this.field439 = -1;
                        return true;
                    }
                    if (this.field439 == 195) {
                        this.field177 = true;
                        int var96 = this.field413.method404();
                        class58 var97 = class58.field1405[var96];
                        while (this.field413.field1073 < this.field438) {
                            int var98 = this.field413.method416();
                            int var99 = this.field413.method404();
                            int var100 = this.field413.method402();
                            if (var100 == 255) {
                                var100 = this.field413.method407();
                            }
                            if (var98 >= 0 && var98 < var97.field1400.length) {
                                var97.field1400[var98] = var99;
                                var97.field1440[var98] = var100;
                            }
                        }
                        this.field439 = -1;
                        return true;
                    }
                    if (this.field439 == 23) {
                        int var101 = this.field413.method404();
                        int var102 = this.field413.method430(true);
                        int var103 = this.field413.method429(true);
                        class58.field1405[var102].field1414 = (var103 << 16) + var101;
                        this.field439 = -1;
                        return true;
                    }
                    if (this.field439 == 65) {
                        this.field59 = this.field413.method402();
                        this.field439 = -1;
                        return true;
                    }
                    if (this.field439 == 74) {
                        int var104 = this.field413.method429(true);
                        this.method112(true, var104);
                        if (this.field133 != -1) {
                            this.field133 = -1;
                            this.field260 = true;
                        }
                        if (this.field117 != 0) {
                            this.field117 = 0;
                            this.field260 = true;
                        }
                        this.field139 = var104;
                        this.field177 = true;
                        this.field136 = true;
                        this.field255 = -1;
                        this.field429 = false;
                        this.field439 = -1;
                        return true;
                    }
                    if (this.field439 == 64) {
                        this.field84 = this.field413.method429(true) * 30;
                        this.field439 = -1;
                        return true;
                    }
                    if (this.field439 != 76) {
                        if (this.field439 == 78) {
                            String var106 = this.field413.method409();
                            if (var106.endsWith(":tradereq:")) {
                                String var107 = var106.substring(0, var106.indexOf(":"));
                                long var108 = class20.method268(var107);
                                boolean var110 = false;
                                for (int var111 = 0; var111 < this.field251; ++var111) {
                                    if (this.field339[var111] == var108) {
                                        var110 = true;
                                        break;
                                    }
                                }
                                if (!var110 && this.field369 == 0) {
                                    this.method131((byte) -32, var107, 4, "wishes to trade with you.");
                                }
                            } else if (var106.endsWith(":duelreq:")) {
                                String var112 = var106.substring(0, var106.indexOf(":"));
                                long var113 = class20.method268(var112);
                                boolean var115 = false;
                                for (int var116 = 0; var116 < this.field251; ++var116) {
                                    if (this.field339[var116] == var113) {
                                        var115 = true;
                                        break;
                                    }
                                }
                                if (!var115 && this.field369 == 0) {
                                    this.method131((byte) -32, var112, 8, "wishes to duel with you.");
                                }
                            } else if (!var106.endsWith(":chalreq:")) {
                                this.method131((byte) -32, "", 0, var106);
                            } else {
                                String var117 = var106.substring(0, var106.indexOf(":"));
                                long var118 = class20.method268(var117);
                                boolean var120 = false;
                                for (int var121 = 0; var121 < this.field251; ++var121) {
                                    if (this.field339[var121] == var118) {
                                        var120 = true;
                                        break;
                                    }
                                }
                                if (!var120 && this.field369 == 0) {
                                    String var122 = var106.substring(var106.indexOf(":") + 1, var106.length() - 9);
                                    this.method131((byte) -32, var117, 8, var122);
                                }
                            }
                            this.field439 = -1;
                            return true;
                        }
                        if (this.field439 == 95) {
                            int var123 = this.field413.method436((byte) 5);
                            int var124 = this.field413.method430(true);
                            this.field517[var124] = var123;
                            if (this.field455[var124] != var123) {
                                this.field455[var124] = var123;
                                this.method52(var124, 503);
                                this.field177 = true;
                                if (this.field186 != -1) {
                                    this.field260 = true;
                                }
                            }
                            this.field439 = -1;
                            return true;
                        }
                        if (this.field439 == 135) {
                            int var125 = this.field413.method429(true);
                            if (var125 == 65535) {
                                var125 = -1;
                            }
                            if (this.field492 != var125 && this.field164 && !field412 && this.field63 == 0) {
                                this.field100 = var125;
                                this.field101 = true;
                                this.field106.method284(2, this.field100);
                            }
                            this.field492 = var125;
                            this.field439 = -1;
                            return true;
                        }
                        if (this.field439 == 137) {
                            int var126 = this.field413.method429(true);
                            int var127 = this.field413.method435(this.field520);
                            if (this.field164 && !field412) {
                                this.field100 = var126;
                                this.field101 = false;
                                this.field106.method284(2, this.field100);
                                this.field63 = var127;
                            }
                            this.field439 = -1;
                            return true;
                        }
                        if (this.field439 == 179) {
                            int var128 = this.field413.method404();
                            int var129 = this.field413.method402();
                            int var130 = this.field413.method404();
                            if (this.field86 && !field412 && this.field436 < 50) {
                                this.field62[this.field436] = var128;
                                this.field273[this.field436] = var129;
                                this.field418[this.field436] = class46.field1274[var128] + var130;
                                ++this.field436;
                            }
                            this.field439 = -1;
                            return true;
                        }
                        if (this.field439 == 239) {
                            int var131 = this.field413.method402();
                            int var132 = this.field413.method402();
                            int var133 = this.field413.method402();
                            int var134 = this.field413.method402();
                            this.field208[var131] = true;
                            this.field297[var131] = var132;
                            this.field165[var131] = var133;
                            this.field488[var131] = var134;
                            this.field53[var131] = 0;
                            this.field439 = -1;
                            return true;
                        }
                        if (this.field439 == 21) {
                            this.field298 = 0;
                            this.field439 = -1;
                            return true;
                        }
                        if (this.field439 == 131) {
                            int var135 = this.field413.method431(true);
                            class58 var136 = class58.field1405[var135];
                            for (int var137 = 0; var137 < var136.field1400.length; ++var137) {
                                var136.field1400[var137] = -1;
                                var136.field1400[var137] = 0;
                            }
                            this.field439 = -1;
                            return true;
                        }
                        if (this.field439 == 57) {
                            this.field177 = true;
                            int var138 = this.field413.method402();
                            int var139 = this.field413.method422(0);
                            int var140 = this.field413.method407();
                            this.field75[var139] = var140;
                            this.field175[var139] = var138;
                            this.field163[var139] = 1;
                            for (int var141 = 0; var141 < 98; ++var141) {
                                if (var140 >= field453[var141]) {
                                    this.field163[var139] = var141 + 2;
                                }
                            }
                            this.field439 = -1;
                            return true;
                        }
                        if (this.field439 == 255) {
                            this.field397 = this.field413.method402();
                            this.field398 = this.field413.method402();
                            this.field439 = -1;
                            return true;
                        }
                        if (this.field439 == 185) {
                            int var142 = this.field413.method429(true);
                            int var143 = this.field413.method431(true);
                            int var144 = this.field413.method430(true);
                            int var145 = this.field413.method430(true);
                            class58.field1405[var142].field1416 = var144;
                            class58.field1405[var142].field1417 = var145;
                            class58.field1405[var142].field1415 = var143;
                            this.field439 = -1;
                            return true;
                        }
                        if (this.field439 == 197) {
                            this.field470 = false;
                            this.field117 = 1;
                            this.field516 = "";
                            this.field260 = true;
                            this.field439 = -1;
                            return true;
                        }
                        if (this.field439 == 141) {
                            int var146 = this.field413.method430(true);
                            int var147 = this.field413.method420(0);
                            if (var146 == 65535) {
                                var146 = -1;
                            }
                            this.field376[var147] = var146;
                            this.field177 = true;
                            this.field136 = true;
                            this.field439 = -1;
                            return true;
                        }
                        if (this.field439 == 88) {
                            long var148 = this.field413.method408(0);
                            int var150 = this.field413.method402();
                            String var151 = class20.method272(false, class20.method269(var148, -898));
                            for (int var152 = 0; var152 < this.field447; ++var152) {
                                if (this.field490[var152] == var148) {
                                    if (this.field110[var152] != var150) {
                                        this.field110[var152] = var150;
                                        this.field177 = true;
                                        if (var150 > 0) {
                                            this.method131((byte) -32, "", 5, var151 + " has logged in.");
                                        }
                                        if (var150 == 0) {
                                            this.method131((byte) -32, "", 5, var151 + " has logged out.");
                                        }
                                    }
                                    var151 = null;
                                    break;
                                }
                            }
                            if (var151 != null && this.field447 < 200) {
                                this.field490[this.field447] = var148;
                                this.field194[this.field447] = var151;
                                this.field110[this.field447] = var150;
                                ++this.field447;
                                this.field177 = true;
                            }
                            boolean var153 = false;
                            while (!var153) {
                                var153 = true;
                                for (int var154 = 0; var154 < this.field447 - 1; ++var154) {
                                    if (this.field110[var154] != field409 && this.field110[var154 + 1] == field409 || this.field110[var154] == 0 && this.field110[var154 + 1] != 0) {
                                        int var155 = this.field110[var154];
                                        this.field110[var154] = this.field110[var154 + 1];
                                        this.field110[var154 + 1] = var155;
                                        String var156 = this.field194[var154];
                                        this.field194[var154] = this.field194[var154 + 1];
                                        this.field194[var154 + 1] = var156;
                                        long var157 = this.field490[var154];
                                        this.field490[var154] = this.field490[var154 + 1];
                                        this.field490[var154 + 1] = var157;
                                        this.field177 = true;
                                        var153 = false;
                                    }
                                }
                            }
                            this.field439 = -1;
                            return true;
                        }
                        if (this.field439 == 228) {
                            this.field251 = this.field438 / 8;
                            for (int var159 = 0; var159 < this.field251; ++var159) {
                                this.field339[var159] = this.field413.method408(0);
                            }
                            this.field439 = -1;
                            return true;
                        }
                        if (this.field439 == 160) {
                            int var160 = this.field413.method430(true);
                            this.method112(true, var160);
                            if (this.field139 != -1) {
                                this.field139 = -1;
                                this.field177 = true;
                                this.field136 = true;
                            }
                            if (this.field133 != -1) {
                                this.field133 = -1;
                                this.field260 = true;
                            }
                            if (this.field117 != 0) {
                                this.field117 = 0;
                                this.field260 = true;
                            }
                            this.field255 = var160;
                            this.field429 = false;
                            this.field439 = -1;
                            return true;
                        }
                        if (this.field439 == 116) {
                            long var161 = this.field413.method408(0);
                            int var163 = this.field413.method407();
                            int var164 = this.field413.method402();
                            boolean var165 = false;
                            for (int var166 = 0; var166 < 100; ++var166) {
                                if (this.field168[var166] == var163) {
                                    var165 = true;
                                    break;
                                }
                            }
                            if (var164 <= 1) {
                                for (int var167 = 0; var167 < this.field251; ++var167) {
                                    if (this.field339[var167] == var161) {
                                        var165 = true;
                                        break;
                                    }
                                }
                            }
                            if (!var165 && this.field369 == 0) {
                                try {
                                    this.field168[this.field197] = var163;
                                    this.field197 = (this.field197 + 1) % 100;
                                    String var168 = class26.method315(this.field438 - 13, this.field413, (byte) 8);
                                    if (var164 != 3) {
                                        var168 = class39.method470(var168, (byte) 73);
                                    }
                                    if (var164 != 2 && var164 != 3) {
                                        if (var164 == 1) {
                                            this.method131((byte) -32, "@cr1@" + class20.method272(false, class20.method269(var161, -898)), 7, var168);
                                        } else {
                                            this.method131((byte) -32, class20.method272(false, class20.method269(var161, -898)), 3, var168);
                                        }
                                    } else {
                                        this.method131((byte) -32, "@cr2@" + class20.method272(false, class20.method269(var161, -898)), 7, var168);
                                    }
                                } catch (Exception var190) {
                                    signlink.reporterror("cde1");
                                }
                            }
                            this.field439 = -1;
                            return true;
                        }
                        if (this.field439 == 113) {
                            this.field158 = this.field413.method402();
                            this.field79 = this.field413.method430(true);
                            this.field439 = -1;
                            return true;
                        }
                        if (this.field439 == 71) {
                            int var170 = this.field413.method431(true);
                            this.method112(true, var170);
                            if (this.field139 != -1) {
                                this.field139 = -1;
                                this.field177 = true;
                                this.field136 = true;
                            }
                            this.field133 = var170;
                            this.field260 = true;
                            this.field255 = -1;
                            this.field429 = false;
                            this.field439 = -1;
                            return true;
                        }
                        if (this.field439 == 55) {
                            this.field74 = this.field413.method402();
                            this.field419 = this.field413.method402();
                            this.field496 = this.field413.method402();
                            this.field97 = true;
                            this.field260 = true;
                            this.field439 = -1;
                            return true;
                        }
                        if (this.field439 == 109) {
                            int var171 = this.field413.method421(field259);
                            int var172 = this.field413.method402();
                            String var173 = this.field413.method409();
                            if (var171 >= 1 && var171 <= 5) {
                                if (var173.equalsIgnoreCase("null")) {
                                    var173 = null;
                                }
                                this.field201[var171 - 1] = var173;
                                this.field202[var171 - 1] = var172 == 0;
                            }
                            this.field439 = -1;
                            return true;
                        }
                        if (this.field439 == 216) {
                            this.field364 = true;
                            this.field378 = this.field413.method402();
                            this.field379 = this.field413.method402();
                            this.field380 = this.field413.method404();
                            this.field381 = this.field413.method402();
                            this.field382 = this.field413.method402();
                            if (this.field382 >= 100) {
                                this.field125 = this.field378 * 128 + 64;
                                this.field127 = this.field379 * 128 + 64;
                                this.field126 = this.method141((byte) 76, this.field127, this.field307, this.field125) - this.field380;
                            }
                            this.field439 = -1;
                            return true;
                        }
                        if (this.field439 == 3) {
                            this.method113(true, this.field413, this.field438);
                            this.field471 = false;
                            this.field439 = -1;
                            return true;
                        }
                        if (this.field439 == 196) {
                            this.field356 = this.field413.method402();
                            this.field177 = true;
                            this.field136 = true;
                            this.field439 = -1;
                            return true;
                        }
                        if (this.field439 == 8) {
                            this.field220 = this.field413.method429(true);
                            this.field268 = this.field413.method436((byte) 5);
                            this.field296 = this.field413.method421(field259);
                            this.field501 = this.field413.method420(0);
                            this.field247 = this.field413.method429(true);
                            if (this.field268 != 0 && this.field255 == -1) {
                                signlink.dnslookup(class20.method271(-266, this.field268));
                                this.method89(this.field261);
                                short var174 = 650;
                                if (this.field296 != 201 || this.field501 == 1) {
                                    var174 = 655;
                                }
                                this.field107 = "";
                                this.field514 = false;
                                for (int var175 = 0; var175 < class58.field1405.length; ++var175) {
                                    if (class58.field1405[var175] != null && class58.field1405[var175].field1422 == var174) {
                                        this.field255 = class58.field1405[var175].field1426;
                                        break;
                                    }
                                }
                            }
                            this.field439 = -1;
                            return true;
                        }
                        if (this.field439 == 192) {
                            this.field344 = this.field413.method402();
                            this.field439 = -1;
                            return true;
                        }
                        if (this.field439 == 205) {
                            int var176 = this.field413.method429(true);
                            int var177 = this.field413.method431(true);
                            int var178 = var176 >> 10 & 31;
                            int var179 = var176 >> 5 & 31;
                            int var180 = var176 & 31;
                            class58.field1405[var177].field1402 = (var180 << 3) + (var178 << 19) + (var179 << 11);
                            this.field439 = -1;
                            return true;
                        }
                        if (this.field439 == 152 || this.field439 == 120 || this.field439 == 194 || this.field439 == 127 || this.field439 == 47 || this.field439 == 81 || this.field439 == 170 || this.field439 == 86 || this.field439 == 254 || this.field439 == 75 || this.field439 == 124) {
                            this.method136(false, this.field413, this.field439);
                            this.field439 = -1;
                            return true;
                        }
                        if (this.field439 == 140) {
                            int var181 = this.field413.method404();
                            byte var182 = this.field413.method424(false);
                            this.field517[var181] = var182;
                            if (this.field455[var181] != var182) {
                                this.field455[var181] = var182;
                                this.method52(var181, 503);
                                this.field177 = true;
                                if (this.field186 != -1) {
                                    this.field260 = true;
                                }
                            }
                            this.field439 = -1;
                            return true;
                        }
                        if (this.field439 == 145) {
                            int var183 = this.field413.method430(true);
                            int var184 = this.field413.method431(true);
                            class58.field1405[var183].field1429 = 1;
                            class58.field1405[var183].field1430 = var184;
                            this.field439 = -1;
                            return true;
                        }
                        if (this.field439 == 206) {
                            int var185 = this.field413.method429(true);
                            int var186 = this.field413.method429(true);
                            if (this.field133 != -1) {
                                this.field133 = -1;
                                this.field260 = true;
                            }
                            if (this.field117 != 0) {
                                this.field117 = 0;
                                this.field260 = true;
                            }
                            this.field255 = var185;
                            this.field139 = var186;
                            this.field177 = true;
                            this.field136 = true;
                            this.field429 = false;
                            this.field439 = -1;
                            return true;
                        }
                        signlink.reporterror("T1 - " + this.field439 + "," + this.field438 + " - " + this.field473 + "," + this.field474);
                        this.method74((byte) -10);
                        return true;
                    }
                    this.field364 = false;
                    for (int var105 = 0; var105 < 5; ++var105) {
                        this.field208[var105] = false;
                    }
                    this.field439 = -1;
                    return true;
                }
                int var35 = this.field199;
                int var36 = this.field200;
                if (this.field439 == 169) {
                    var36 = this.field413.method430(true);
                    var35 = this.field413.method429(true);
                    this.field172 = false;
                }
                if (this.field439 == 243) {
                    var35 = this.field413.method431(true);
                    var36 = this.field413.method404();
                    this.field413.method412(false);
                    int var37 = 0;
                    while (true) {
                        if (var37 >= 4) {
                            this.field413.method414(false);
                            this.field172 = true;
                            break;
                        }
                        for (int var38 = 0; var38 < 13; ++var38) {
                            for (int var39 = 0; var39 < 13; ++var39) {
                                int var40 = this.field413.method413(true, 1);
                                if (var40 == 1) {
                                    this.field60[var37][var38][var39] = this.field413.method413(true, 26);
                                } else {
                                    this.field60[var37][var38][var39] = -1;
                                }
                            }
                        }
                        ++var37;
                    }
                }
                if (this.field199 == var35 && this.field200 == var36 && this.field430 == 2) {
                    this.field439 = -1;
                    return true;
                }
                this.field199 = var35;
                this.field200 = var36;
                this.field223 = (this.field199 - 6) * 8;
                this.field224 = (this.field200 - 6) * 8;
                this.field262 = false;
                if ((this.field199 / 8 == 48 || this.field199 / 8 == 49) && this.field200 / 8 == 48) {
                    this.field262 = true;
                }
                if (this.field199 / 8 == 48 && this.field200 / 8 == 148) {
                    this.field262 = true;
                }
                this.field430 = 1;
                this.field437 = System.currentTimeMillis();
                this.field91.method529(false);
                this.field390.method253("Loading - please wait.", 257, 151, 0, this.field264);
                this.field390.method253("Loading - please wait.", 256, 150, 16777215, this.field264);
                this.field91.method530((byte) 9, 4, 4, super.field964);
                if (this.field439 == 169) {
                    int var41 = 0;
                    int var42 = (this.field199 - 6) / 8;
                    label1096: while (true) {
                        if (var42 > (this.field199 + 6) / 8) {
                            this.field170 = new byte[var41][];
                            this.field493 = new byte[var41][];
                            this.field384 = new int[var41];
                            this.field385 = new int[var41];
                            this.field386 = new int[var41];
                            int var44 = 0;
                            int var45 = (this.field199 - 6) / 8;
                            while (true) {
                                if (var45 > (this.field199 + 6) / 8) {
                                    break label1096;
                                }
                                for (int var46 = (this.field200 - 6) / 8; var46 <= (this.field200 + 6) / 8; ++var46) {
                                    this.field384[var44] = (var45 << 8) + var46;
                                    if (!this.field262 || var46 != 49 && var46 != 149 && var46 != 147 && var45 != 50 && (var45 != 49 || var46 != 47)) {
                                        int var47 = this.field385[var44] = this.field106.method285(var46, 0, var45, field108);
                                        if (var47 != -1) {
                                            this.field106.method284(3, var47);
                                        }
                                        int var48 = this.field386[var44] = this.field106.method285(var46, 1, var45, field108);
                                        if (var48 != -1) {
                                            this.field106.method284(3, var48);
                                        }
                                        ++var44;
                                    } else {
                                        this.field385[var44] = -1;
                                        this.field386[var44] = -1;
                                        ++var44;
                                    }
                                }
                                ++var45;
                            }
                        }
                        for (int var43 = (this.field200 - 6) / 8; var43 <= (this.field200 + 6) / 8; ++var43) {
                            ++var41;
                        }
                        ++var42;
                    }
                }
                if (this.field439 == 243) {
                    int var49 = 0;
                    int[] var50 = new int[676];
                    int var51 = 0;
                    label1055: while (true) {
                        if (var51 >= 4) {
                            this.field170 = new byte[var49][];
                            this.field493 = new byte[var49][];
                            this.field384 = new int[var49];
                            this.field385 = new int[var49];
                            this.field386 = new int[var49];
                            int var59 = 0;
                            while (true) {
                                if (var59 >= var49) {
                                    break label1055;
                                }
                                int var60 = this.field384[var59] = var50[var59];
                                int var61 = var60 >> 8 & 255;
                                int var62 = var60 & 255;
                                int var63 = this.field385[var59] = this.field106.method285(var62, 0, var61, field108);
                                if (var63 != -1) {
                                    this.field106.method284(3, var63);
                                }
                                int var64 = this.field386[var59] = this.field106.method285(var62, 1, var61, field108);
                                if (var64 != -1) {
                                    this.field106.method284(3, var64);
                                }
                                ++var59;
                            }
                        }
                        for (int var52 = 0; var52 < 13; ++var52) {
                            for (int var53 = 0; var53 < 13; ++var53) {
                                int var54 = this.field60[var51][var52][var53];
                                if (var54 != -1) {
                                    int var55 = var54 >> 14 & 1023;
                                    int var56 = var54 >> 3 & 2047;
                                    int var57 = (var55 / 8 << 8) + var56 / 8;
                                    for (int var58 = 0; var58 < var49; ++var58) {
                                        if (var50[var58] == var57) {
                                            var57 = -1;
                                            break;
                                        }
                                    }
                                    if (var57 != -1) {
                                        var50[var49++] = var57;
                                    }
                                }
                            }
                        }
                        ++var51;
                    }
                }
                int var65 = this.field223 - this.field225;
                int var66 = this.field224 - this.field226;
                this.field225 = this.field223;
                this.field226 = this.field224;
                for (int var67 = 0; var67 < 16384; ++var67) {
                    class54 var68 = this.field444[var67];
                    if (var68 != null) {
                        for (int var69 = 0; var69 < 10; ++var69) {
                            var68.field1641[var69] -= var65;
                            var68.field1642[var69] -= var66;
                        }
                        var68.field1643 -= var65 * 128;
                        var68.field1644 -= var66 * 128;
                    }
                }
                for (int var70 = 0; var70 < this.field284; ++var70) {
                    class1 var71 = this.field286[var70];
                    if (var71 != null) {
                        for (int var72 = 0; var72 < 10; ++var72) {
                            var71.field1641[var72] -= var65;
                            var71.field1642[var72] -= var66;
                        }
                        var71.field1643 -= var65 * 128;
                        var71.field1644 -= var66 * 128;
                    }
                }
                this.field471 = true;
                byte var73 = 0;
                byte var74 = 104;
                byte var75 = 1;
                if (var65 < 0) {
                    var73 = 103;
                    var74 = -1;
                    var75 = -1;
                }
                byte var76 = 0;
                byte var77 = 104;
                byte var78 = 1;
                if (var66 < 0) {
                    var76 = 103;
                    var77 = -1;
                    var78 = -1;
                }
                for (int var79 = var73; var74 != var79; var79 += var75) {
                    for (int var80 = var76; var77 != var80; var80 += var78) {
                        int var81 = var65 + var79;
                        int var82 = var66 + var80;
                        for (int var83 = 0; var83 < 4; ++var83) {
                            if (var81 >= 0 && var82 >= 0 && var81 < 104 && var82 < 104) {
                                this.field420[var83][var79][var80] = this.field420[var83][var81][var82];
                            } else {
                                this.field420[var83][var79][var80] = null;
                            }
                        }
                    }
                }
                for (class48 var84 = (class48) this.field253.method451(); var84 != null; var84 = (class48) this.field253.method453((byte) 5)) {
                    var84.field1288 -= var65;
                    var84.field1289 -= var66;
                    if (var84.field1288 < 0 || var84.field1289 < 0 || var84.field1288 >= 104 || var84.field1289 >= 104) {
                        var84.method156();
                    }
                }
                if (this.field298 != 0) {
                    this.field298 -= var65;
                    this.field299 -= var66;
                }
                this.field364 = false;
                this.field439 = -1;
                return true;
            } catch (IOException var191) {
                this.method13((byte) 37);
            } catch (Exception var192) {
                String var188 = "T2 - " + this.field439 + "," + this.field473 + "," + this.field474 + " - " + this.field438 + "," + (field132.field1641[0] + this.field223) + "," + (field132.field1642[0] + this.field224) + " - ";
                for (int var189 = 0; var189 < this.field438 && var189 < 50; ++var189) {
                    var188 = var188 + this.field413.field1072[var189] + ",";
                }
                signlink.reporterror(var188);
                this.method74((byte) -10);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "l", descriptor = "(B)V")
    public final void method118(byte arg0) {
        for (int var2 = 0; var2 < this.field436; ++var2) {
            if (this.field418[var2] <= 0) {
                boolean var3 = false;
                try {
                    if (this.field62[var2] == this.field309 && this.field273[var2] == this.field294) {
                        if (!this.method145(443)) {
                            var3 = true;
                        }
                    } else {
                        class34 var4 = class46.method503(this.field62[var2], this.field273[var2], true);
                        if (System.currentTimeMillis() + (long) (var4.field1073 / 22) > (long) (this.field131 / 22) + this.field402) {
                            this.field131 = var4.field1073;
                            this.field402 = System.currentTimeMillis();
                            if (this.method78(var4.field1072, var4.field1073, -24435)) {
                                this.field309 = this.field62[var2];
                                this.field294 = this.field273[var2];
                            } else {
                                var3 = true;
                            }
                        }
                    }
                } catch (Exception var8) {
                }
                if (var3 && this.field418[var2] != -5) {
                    this.field418[var2] = -5;
                } else {
                    --this.field436;
                    for (int var6 = var2; var6 < this.field436; ++var6) {
                        this.field62[var6] = this.field62[var6 + 1];
                        this.field273[var6] = this.field273[var6 + 1];
                        this.field418[var6] = this.field418[var6 + 1];
                    }
                    --var2;
                }
            } else {
                int var10002 = this.field418[var2]--;
            }
        }
        if (arg0 == 5) {
            boolean var7 = false;
            if (this.field63 > 0) {
                this.field63 -= 20;
                if (this.field63 < 0) {
                    this.field63 = 0;
                }
                if (this.field63 == 0 && this.field164 && !field412) {
                    this.field100 = this.field492;
                    this.field101 = true;
                    this.field106.method284(2, this.field100);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "E", descriptor = "(I)Ljava/lang/String;")
    public final String method119(int arg0) {
        this.field438 += arg0;
        if (signlink.mainapp != null) {
            return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
        } else {
            return super.field967 != null ? "runescape.com" : super.getDocumentBase().getHost().toLowerCase();
        }
    }

    @OriginalMember(owner = "client", name = "k", descriptor = "(Z)V")
    public final void method120(boolean arg0) {
        if (this.field504 != 0) {
            int var2 = 0;
            if (this.field84 != 0) {
                var2 = 1;
            }
            for (int var3 = 0; var3 < 100; ++var3) {
                if (this.field207[var3] != null) {
                    int var4 = this.field205[var3];
                    String var5 = this.field206[var3];
                    boolean var6 = false;
                    if (var5 != null && var5.startsWith("@cr1@")) {
                        var5 = var5.substring(5);
                        boolean var7 = true;
                    }
                    if (var5 != null && var5.startsWith("@cr2@")) {
                        var5 = var5.substring(5);
                        boolean var8 = true;
                    }
                    if ((var4 == 3 || var4 == 7) && (var4 == 7 || this.field419 == 0 || this.field419 == 1 && this.method36(var5, this.field244))) {
                        int var9 = 329 - var2 * 13;
                        if (super.field972 > 4 && super.field973 - 4 > var9 - 10 && super.field973 - 4 <= var9 + 3) {
                            int var10 = this.field390.method255("From:  " + var5 + this.field207[var3], 0) + 25;
                            if (var10 > 450) {
                                var10 = 450;
                            }
                            if (super.field972 < var10 + 4) {
                                if (this.field145 >= 1) {
                                    this.field179[this.field414] = "Report abuse @whi@" + var5;
                                    this.field359[this.field414] = 2200;
                                    ++this.field414;
                                }
                                this.field179[this.field414] = "Add ignore @whi@" + var5;
                                this.field359[this.field414] = 2076;
                                ++this.field414;
                                this.field179[this.field414] = "Add friend @whi@" + var5;
                                this.field359[this.field414] = 2394;
                                ++this.field414;
                            }
                        }
                        ++var2;
                        if (var2 >= 5) {
                            return;
                        }
                    }
                    if ((var4 == 5 || var4 == 6) && this.field419 < 2) {
                        ++var2;
                        if (var2 >= 5) {
                            return;
                        }
                    }
                }
            }
            if (arg0) {
                this.field420 = null;
            }
        }
    }

    @OriginalMember(owner = "client", name = "F", descriptor = "(I)V")
    public final void method121(int arg0) {
        this.field438 += arg0;
        try {
            int var2 = field132.field1643 + this.field395;
            int var3 = field132.field1644 + this.field77;
            if (this.field365 - var2 < -500 || this.field365 - var2 > 500 || this.field366 - var3 < -500 || this.field366 - var3 > 500) {
                this.field365 = var2;
                this.field366 = var3;
            }
            if (this.field365 != var2) {
                this.field365 += (var2 - this.field365) / 16;
            }
            if (this.field366 != var3) {
                this.field366 += (var3 - this.field366) / 16;
            }
            if (super.field982[1] == 1) {
                this.field82 += (-24 - this.field82) / 2;
            } else if (super.field982[2] == 1) {
                this.field82 += (24 - this.field82) / 2;
            } else {
                this.field82 /= 2;
            }
            if (super.field982[3] == 1) {
                this.field83 += (12 - this.field83) / 2;
            } else if (super.field982[4] == 1) {
                this.field83 += (-12 - this.field83) / 2;
            } else {
                this.field83 /= 2;
            }
            this.field81 = this.field82 / 2 + this.field81 & 2047;
            this.field80 += this.field83 / 2;
            if (this.field80 < 128) {
                this.field80 = 128;
            }
            if (this.field80 > 383) {
                this.field80 = 383;
            }
            int var4 = this.field365 >> 7;
            int var5 = this.field366 >> 7;
            int var6 = this.method141((byte) 76, this.field366, this.field307, this.field365);
            int var7 = 0;
            if (var4 > 3 && var5 > 3 && var4 < 100 && var5 < 100) {
                for (int var8 = var4 - 4; var8 <= var4 + 4; ++var8) {
                    for (int var9 = var5 - 4; var9 <= var5 + 4; ++var9) {
                        int var10 = this.field307;
                        if (var10 < 3 && (this.field479[1][var8][var9] & 2) == 2) {
                            ++var10;
                        }
                        int var11 = var6 - this.field292[var10][var8][var9];
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
            if (var12 > this.field383) {
                this.field383 += (var12 - this.field383) / 24;
            } else if (var12 < this.field383) {
                this.field383 += (var12 - this.field383) / 80;
            }
        } catch (Exception var13) {
            signlink.reporterror("glfc_ex " + field132.field1643 + "," + field132.field1644 + "," + this.field365 + "," + this.field366 + "," + this.field199 + "," + this.field200 + "," + this.field223 + "," + this.field224);
            throw new RuntimeException("eek");
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIIILULLVQOAK;ZI)V")
    public final void method122(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class58 arg6, boolean arg7, int arg8) {
        if (this.field340) {
            this.field513 = 32;
        } else {
            this.field513 = 0;
        }
        this.field340 = false;
        if (arg1 < 4 || arg1 > 4) {
            this.field499 = 65;
        }
        if (arg0 >= arg4 && arg0 < arg4 + 16 && arg3 >= arg2 && arg3 < arg2 + 16) {
            arg6.field1435 -= this.field428 * 4;
            if (arg7) {
                this.field177 = true;
                return;
            }
        } else if (arg0 >= arg4 && arg0 < arg4 + 16 && arg3 >= arg2 + arg5 - 16 && arg3 < arg2 + arg5) {
            arg6.field1435 += this.field428 * 4;
            if (arg7) {
                this.field177 = true;
                return;
            }
        } else {
            if (arg0 < arg4 - this.field513 || arg0 >= arg4 + 16 + this.field513 || arg3 < arg2 + 16 || arg3 >= arg2 + arg5 - 16 || this.field428 <= 0) {
                return;
            }
            int var10 = (arg5 - 32) * arg5 / arg8;
            if (var10 < 8) {
                var10 = 8;
            }
            int var11 = arg3 - arg2 - 16 - var10 / 2;
            int var12 = arg5 - 32 - var10;
            arg6.field1435 = (arg8 - arg5) * var11 / var12;
            if (arg7) {
                this.field177 = true;
            }
            this.field340 = true;
        }
    }

    @OriginalMember(owner = "client", name = "G", descriptor = "(I)V")
    public final void method123(int arg0) {
        if (arg0 <= 0) {
            this.field320 = !this.field320;
        }
        int var2 = 5;
        this.field370[8] = 0;
        int var3 = 0;
        while (this.field370[8] == 0) {
            String var4 = "Unknown problem";
            this.method23(0, "Connecting to web server", 20);
            try {
                DataInputStream var5 = this.method106("crc" + (int) (Math.random() * 9.9999999E7D) + "-" + 327);
                class34 var6 = new class34(new byte[40], field400);
                var5.readFully(var6.field1072, 0, 40);
                var5.close();
                for (int var7 = 0; var7 < 9; ++var7) {
                    this.field370[var7] = var6.method407();
                }
                int var8 = var6.method407();
                int var9 = 1234;
                for (int var10 = 0; var10 < 9; ++var10) {
                    var9 = (var9 << 1) + this.field370[var10];
                }
                if (var8 != var9) {
                    var4 = "checksum problem";
                    this.field370[8] = 0;
                }
            } catch (EOFException var13) {
                var4 = "EOF problem";
                this.field370[8] = 0;
            } catch (IOException var14) {
                var4 = "connection problem";
                this.field370[8] = 0;
            } catch (Exception var15) {
                var4 = "logic problem";
                this.field370[8] = 0;
                if (!signlink.reporterror) {
                    return;
                }
            }
            if (this.field370[8] == 0) {
                ++var3;
                for (int var11 = var2; var11 > 0; --var11) {
                    if (var3 >= 10) {
                        this.method23(0, "Game updated - please reload page", 10);
                        var11 = 10;
                    } else {
                        this.method23(0, var4 + " - Will retry in " + var11 + " secs.", 10);
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
                this.field328 = !this.field328;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IILLDILQFVA;)V")
    private final void method124(int arg0, int arg1, class34 arg2) {
        while (arg1 >= 0) {
            this.field420 = null;
        }
        for (int var4 = 0; var4 < this.field289; ++var4) {
            int var5 = this.field290[var4];
            class1 var6 = this.field286[var5];
            int var7 = arg2.method402();
            if ((var7 & 32) != 0) {
                var7 += arg2.method402() << 8;
            }
            this.method127(var5, arg2, var7, var6, (byte) -48);
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(ILLDILQFVA;I)V")
    private final void method125(int arg0, class34 arg1, int arg2) {
        while (true) {
            if (arg1.field1074 + 21 < arg0 * 8) {
                int var4 = arg1.method413(true, 14);
                if (var4 != 16383) {
                    if (this.field444[var4] == null) {
                        this.field444[var4] = new class54();
                    }
                    class54 var5 = this.field444[var4];
                    this.field446[this.field445++] = var4;
                    var5.field1695 = field246;
                    int var6 = arg1.method413(true, 1);
                    if (var6 == 1) {
                        this.field290[this.field289++] = var4;
                    }
                    var5.field1359 = class71.method589(arg1.method413(true, 12));
                    int var7 = arg1.method413(true, 5);
                    if (var7 > 15) {
                        var7 -= 32;
                    }
                    int var8 = arg1.method413(true, 5);
                    if (var8 > 15) {
                        var8 -= 32;
                    }
                    int var9 = arg1.method413(true, 1);
                    var5.field1666 = var5.field1359.field1709;
                    var5.field1657 = var5.field1359.field1733;
                    var5.field1675 = var5.field1359.field1716;
                    var5.field1676 = var5.field1359.field1729;
                    var5.field1677 = var5.field1359.field1713;
                    var5.field1678 = var5.field1359.field1703;
                    var5.field1654 = var5.field1359.field1718;
                    var5.method577(field132.field1642[0] + var8, (byte) 6, var9 == 1, field132.field1641[0] + var7);
                    continue;
                }
            }
            arg1.method414(false);
            if (this.field503 != arg2) {
                this.field267 = -103;
                return;
            }
            return;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILLKEIRLLI;)V")
    public final void method126(int arg0, class35 arg1) {
        short var3 = 256;
        if (arg0 == 5) {
            for (int var4 = 0; var4 < this.field511.length; ++var4) {
                this.field511[var4] = 0;
            }
            for (int var5 = 0; var5 < 5000; ++var5) {
                int var17 = (int) (Math.random() * 128.0D * (double) var3);
                this.field511[var17] = (int) (Math.random() * 256.0D);
            }
            for (int var6 = 0; var6 < 20; ++var6) {
                for (int var13 = 1; var13 < var3 - 1; ++var13) {
                    for (int var15 = 1; var15 < 127; ++var15) {
                        int var16 = (var13 << 7) + var15;
                        this.field512[var16] = (this.field511[var16 - 1] + this.field511[var16 + 1] + this.field511[var16 - 128] + this.field511[var16 + 128]) / 4;
                    }
                }
                int[] var14 = this.field511;
                this.field511 = this.field512;
                this.field512 = var14;
            }
            if (arg1 != null) {
                int var7 = 0;
                for (int var8 = 0; var8 < arg1.field1094; ++var8) {
                    for (int var9 = 0; var9 < arg1.field1093; ++var9) {
                        if (arg1.field1091[var7++] != 0) {
                            int var10 = var9 + 16 + arg1.field1095;
                            int var11 = var8 + 16 + arg1.field1096;
                            int var12 = (var11 << 7) + var10;
                            this.field511[var12] = 0;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILLDILQFVA;ILAHUILQJH;B)V")
    private final void method127(int arg0, class34 arg1, int arg2, class1 arg3, byte arg4) {
        if (arg4 != -48) {
            this.field420 = null;
        }
        if ((arg2 & 4) != 0) {
            int var6 = arg1.method422(0);
            int var7 = arg1.method422(0);
            arg3.method576(-200, var7, var6, field246);
            arg3.field1650 = field246 + 300;
            arg3.field1651 = arg1.method420(0);
            arg3.field1652 = arg1.method422(0);
        }
        if ((arg2 & 16) != 0) {
            int var8 = arg1.method430(true);
            if (var8 == 65535) {
                var8 = -1;
            }
            int var9 = arg1.method421(field259);
            if (arg3.field1689 == var8 && var8 != -1) {
                int var10 = class66.field1608[var8].field1622;
                if (var10 == 1) {
                    arg3.field1690 = 0;
                    arg3.field1691 = 0;
                    arg3.field1692 = var9;
                    arg3.field1693 = 0;
                }
                if (var10 == 2) {
                    arg3.field1693 = 0;
                }
            } else if (var8 == -1 || arg3.field1689 == -1 || class66.field1608[var8].field1616 >= class66.field1608[arg3.field1689].field1616) {
                arg3.field1689 = var8;
                arg3.field1690 = 0;
                arg3.field1691 = 0;
                arg3.field1692 = var9;
                arg3.field1693 = 0;
                arg3.field1685 = arg3.field1646;
            }
        }
        if ((arg2 & 128) != 0) {
            arg3.field1688 = arg1.method409();
            if (arg3.field1688.charAt(0) == '~') {
                arg3.field1688 = arg3.field1688.substring(1);
                this.method131((byte) -32, arg3.field19, 2, arg3.field1688);
            } else if (field132 == arg3) {
                this.method131((byte) -32, arg3.field19, 2, arg3.field1688);
            }
            arg3.field1683 = 0;
            arg3.field1640 = 0;
            arg3.field1694 = 150;
        }
        if ((arg2 & 512) != 0) {
            int var11 = arg1.method421(field259);
            int var12 = arg1.method422(0);
            arg3.method576(-200, var12, var11, field246);
            arg3.field1650 = field246 + 300;
            arg3.field1651 = arg1.method402();
            arg3.field1652 = arg1.method422(0);
        }
        if ((arg2 & 64) != 0) {
            int var13 = arg1.method404();
            int var14 = arg1.method421(field259);
            int var15 = arg1.method402();
            int var16 = arg1.field1073;
            if (arg3.field19 != null && arg3.field17) {
                long var17 = class20.method268(arg3.field19);
                boolean var19 = false;
                if (var14 <= 1) {
                    for (int var20 = 0; var20 < this.field251; ++var20) {
                        if (this.field339[var20] == var17) {
                            var19 = true;
                            break;
                        }
                    }
                }
                if (!var19 && this.field369 == 0) {
                    try {
                        this.field443.field1073 = 0;
                        arg1.method440(var15, this.field443.field1072, 0, this.field457);
                        this.field443.field1073 = 0;
                        String var21 = class26.method315(var15, this.field443, (byte) 8);
                        String var22 = class39.method470(var21, (byte) 73);
                        arg3.field1688 = var22;
                        arg3.field1683 = var13 >> 8;
                        arg3.field1640 = var13 & 255;
                        arg3.field1694 = 150;
                        if (var14 != 2 && var14 != 3) {
                            if (var14 == 1) {
                                this.method131((byte) -32, "@cr1@" + arg3.field19, 1, var22);
                            } else {
                                this.method131((byte) -32, arg3.field19, 2, var22);
                            }
                        } else {
                            this.method131((byte) -32, "@cr2@" + arg3.field19, 1, var22);
                        }
                    } catch (Exception var28) {
                        signlink.reporterror("cde2");
                    }
                }
            }
            arg1.field1073 = var15 + var16;
        }
        if ((arg2 & 2) != 0) {
            arg3.field1681 = arg1.method431(true);
            arg3.field1682 = arg1.method430(true);
        }
        if ((arg2 & 8) != 0) {
            arg3.field1684 = arg1.method430(true);
            if (arg3.field1684 == 65535) {
                arg3.field1684 = -1;
            }
        }
        if ((arg2 & 1) != 0) {
            int var24 = arg1.method421(field259);
            byte[] var25 = new byte[var24];
            class34 var26 = new class34(var25, field400);
            arg1.method439(0, var24, false, var25);
            this.field291[arg0] = var26;
            arg3.method4(var26, 8);
        }
        if ((arg2 & 1024) != 0) {
            arg3.field1668 = arg1.method421(field259);
            arg3.field1670 = arg1.method420(0);
            arg3.field1669 = arg1.method421(field259);
            arg3.field1671 = arg1.method402();
            arg3.field1672 = arg1.method431(true) + field246;
            arg3.field1673 = arg1.method431(true) + field246;
            arg3.field1674 = arg1.method421(field259);
            arg3.method575(9);
        }
        if ((arg2 & 256) != 0) {
            arg3.field1661 = arg1.method404();
            int var27 = arg1.method436((byte) 5);
            arg3.field1665 = var27 >> 16;
            arg3.field1664 = (var27 & 65535) + field246;
            arg3.field1662 = 0;
            arg3.field1663 = 0;
            if (arg3.field1664 > field246) {
                arg3.field1662 = -1;
            }
            if (arg3.field1661 == 65535) {
                arg3.field1661 = -1;
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "l", descriptor = "(Z)V")
    public final void method128(boolean arg0) {
        this.field375 = true;
        for (int var2 = 0; var2 < 7; ++var2) {
            this.field510[var2] = -1;
            for (int var3 = 0; var3 < class68.field1632; ++var3) {
                if (!class68.field1633[var3].field1639 && class68.field1633[var3].field1634 == var2 + (this.field399 ? 0 : 7)) {
                    this.field510[var2] = var3;
                    break;
                }
            }
        }
        if (arg0) {
            this.field439 = this.field413.method402();
        }
    }

    @OriginalMember(owner = "client", name = "H", descriptor = "(I)V")
    public final void method129(int arg0) {
        while (arg0 >= 0) {
            this.field439 = -1;
        }
        ++this.field193;
        this.method92(true, true);
        this.method116(true, (byte) -85);
        this.method92(false, true);
        this.method116(false, (byte) -85);
        this.method137(499);
        this.method138(true);
        if (!this.field364) {
            int var2 = this.field80;
            if (this.field383 / 256 > var2) {
                var2 = this.field383 / 256;
            }
            if (this.field208[4] && this.field165[4] + 128 > var2) {
                var2 = this.field165[4] + 128;
            }
            int var3 = this.field81 + this.field187 & 2047;
            this.method25(this.field366, var2 * 3 + 600, this.field365, var3, var2, 0, this.method141((byte) 76, field132.field1644, this.field307, field132.field1643) - 50);
        }
        int var4;
        if (!this.field364) {
            var4 = this.method107(165);
        } else {
            var4 = this.method108(4);
        }
        int var5 = this.field125;
        int var6 = this.field126;
        int var7 = this.field127;
        int var8 = this.field128;
        int var9 = this.field129;
        for (int var10 = 0; var10 < 5; ++var10) {
            if (this.field208[var10]) {
                int var12 = (int) (Math.random() * (double) (this.field297[var10] * 2 + 1) - (double) this.field297[var10] + Math.sin((double) this.field488[var10] / 100.0D * (double) this.field53[var10]) * (double) this.field165[var10]);
                if (var10 == 0) {
                    this.field125 += var12;
                }
                if (var10 == 1) {
                    this.field126 += var12;
                }
                if (var10 == 2) {
                    this.field127 += var12;
                }
                if (var10 == 3) {
                    this.field129 = this.field129 + var12 & 2047;
                }
                if (var10 == 4) {
                    this.field128 += var12;
                    if (this.field128 < 128) {
                        this.field128 = 128;
                    }
                    if (this.field128 > 383) {
                        this.field128 = 383;
                    }
                }
            }
        }
        int var11 = class25.field830;
        class27.field908 = true;
        class27.field911 = 0;
        class27.field909 = super.field972 - 4;
        class27.field910 = super.field973 - 4;
        class53.method519(false);
        this.field174.method197(this.field127, this.field125, var4, -623, this.field129, this.field126, this.field128);
        this.field174.method172(false);
        this.method135((byte) 5);
        this.method63(0);
        this.method34(false, var11);
        this.method44((byte) -114);
        this.field91.method530((byte) 9, 4, 4, super.field964);
        this.field125 = var5;
        this.field126 = var6;
        this.field127 = var7;
        this.field128 = var8;
        this.field129 = var9;
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(II)Ljava/lang/String;")
    private static final String method130(int arg0, int arg1) {
        if (arg0 != -37821) {
            field259 = 72;
        }
        if (arg1 < 100000) {
            return String.valueOf(arg1);
        } else {
            return arg1 < 10000000 ? arg1 / 1000 + "K" : arg1 / 1000000 + "M";
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BLjava/lang/String;ILjava/lang/String;)V")
    public final void method131(byte arg0, String arg1, int arg2, String arg3) {
        if (arg2 == 0 && this.field186 != -1) {
            this.field76 = arg3;
            super.field978 = 0;
        }
        if (this.field133 == -1) {
            this.field260 = true;
        }
        for (int var5 = 99; var5 > 0; --var5) {
            this.field205[var5] = this.field205[var5 - 1];
            this.field206[var5] = this.field206[var5 - 1];
            this.field207[var5] = this.field207[var5 - 1];
        }
        if (arg0 != -32) {
            this.field439 = -1;
        }
        this.field205[0] = arg2;
        this.field206[0] = arg1;
        this.field207[0] = arg3;
    }

    @OriginalMember(owner = "client", name = "I", descriptor = "(I)V")
    public final void method132(int arg0) {
        while (arg0 >= 0) {
            for (int var3 = 1; var3 > 0; ++var3) {
            }
        }
        if (super.field978 == 1) {
            if (super.field979 >= 6 && super.field979 <= 106 && super.field980 >= 467 && super.field980 <= 499) {
                this.field74 = (this.field74 + 1) % 4;
                this.field97 = true;
                this.field260 = true;
                this.field329.method391(39, 926);
                this.field329.method392(this.field74);
                this.field329.method392(this.field419);
                this.field329.method392(this.field496);
            }
            if (super.field979 >= 135 && super.field979 <= 235 && super.field980 >= 467 && super.field980 <= 499) {
                this.field419 = (this.field419 + 1) % 3;
                this.field97 = true;
                this.field260 = true;
                this.field329.method391(39, 926);
                this.field329.method392(this.field74);
                this.field329.method392(this.field419);
                this.field329.method392(this.field496);
            }
            if (super.field979 >= 273 && super.field979 <= 373 && super.field980 >= 467 && super.field980 <= 499) {
                this.field496 = (this.field496 + 1) % 3;
                this.field97 = true;
                this.field260 = true;
                this.field329.method391(39, 926);
                this.field329.method392(this.field74);
                this.field329.method392(this.field419);
                this.field329.method392(this.field496);
            }
            if (super.field979 >= 412 && super.field979 <= 512 && super.field980 >= 467 && super.field980 <= 499) {
                if (this.field255 == -1) {
                    this.method89(this.field261);
                    this.field107 = "";
                    this.field514 = false;
                    for (int var2 = 0; var2 < class58.field1405.length; ++var2) {
                        if (class58.field1405[var2] != null && class58.field1405[var2].field1422 == 600) {
                            this.field498 = this.field255 = class58.field1405[var2].field1426;
                            return;
                        }
                    }
                    return;
                }
                this.method131((byte) -32, "", 0, "Please close the interface you have open before using 'report abuse'");
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "J", descriptor = "(I)V")
    public final void method133(int arg0) {
        if (arg0 <= 0) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        if (this.field54 == 0 && this.field43 == 0) {
            this.field179[this.field414] = "Walk here";
            this.field359[this.field414] = 84;
            this.field357[this.field414] = super.field972;
            this.field358[this.field414] = super.field973;
            ++this.field414;
        }
        int var3 = -1;
        for (int var4 = 0; var4 < class27.field911; ++var4) {
            int var5 = class27.field912[var4];
            int var6 = var5 & 127;
            int var7 = var5 >> 7 & 127;
            int var8 = var5 >> 29 & 3;
            int var9 = var5 >> 14 & 32767;
            if (var3 != var5) {
                var3 = var5;
                if (var8 == 2 && this.field174.method188(this.field307, var6, var7, var5) >= 0) {
                    class59 var10 = class59.method555(var9);
                    if (var10.field1502 != null) {
                        var10 = var10.method547((byte) 9);
                    }
                    if (var10 == null) {
                        continue;
                    }
                    if (this.field54 == 1) {
                        this.field179[this.field414] = "Use " + this.field58 + " with @cya@" + var10.field1497;
                        this.field359[this.field414] = 584;
                        this.field360[this.field414] = var5;
                        this.field357[this.field414] = var6;
                        this.field358[this.field414] = var7;
                        ++this.field414;
                    } else if (this.field43 == 1) {
                        if ((this.field45 & 4) == 4) {
                            this.field179[this.field414] = this.field46 + " @cya@" + var10.field1497;
                            this.field359[this.field414] = 144;
                            this.field360[this.field414] = var5;
                            this.field357[this.field414] = var6;
                            this.field358[this.field414] = var7;
                            ++this.field414;
                        }
                    } else {
                        if (var10.field1488 != null) {
                            for (int var11 = 4; var11 >= 0; --var11) {
                                if (var10.field1488[var11] != null) {
                                    this.field179[this.field414] = var10.field1488[var11] + " @cya@" + var10.field1497;
                                    if (var11 == 0) {
                                        this.field359[this.field414] = 329;
                                    }
                                    if (var11 == 1) {
                                        this.field359[this.field414] = 549;
                                    }
                                    if (var11 == 2) {
                                        this.field359[this.field414] = 478;
                                    }
                                    if (var11 == 3) {
                                        this.field359[this.field414] = 499;
                                    }
                                    if (var11 == 4) {
                                        this.field359[this.field414] = 1174;
                                    }
                                    this.field360[this.field414] = var5;
                                    this.field357[this.field414] = var6;
                                    this.field358[this.field414] = var7;
                                    ++this.field414;
                                }
                            }
                        }
                        this.field179[this.field414] = "Examine @cya@" + var10.field1497;
                        this.field359[this.field414] = 1951;
                        this.field360[this.field414] = var10.field1503 << 14;
                        this.field357[this.field414] = var6;
                        this.field358[this.field414] = var7;
                        ++this.field414;
                    }
                }
                if (var8 == 1) {
                    class54 var12 = this.field444[var9];
                    if (var12.field1359.field1709 == 1 && (var12.field1643 & 127) == 64 && (var12.field1644 & 127) == 64) {
                        for (int var13 = 0; var13 < this.field445; ++var13) {
                            class54 var16 = this.field444[this.field446[var13]];
                            if (var16 != null && var12 != var16 && var16.field1359.field1709 == 1 && var12.field1643 == var16.field1643 && var12.field1644 == var16.field1644) {
                                this.method147(var7, var16.field1359, this.field446[var13], true, var6);
                            }
                        }
                        for (int var14 = 0; var14 < this.field287; ++var14) {
                            class1 var15 = this.field286[this.field288[var14]];
                            if (var15 != null && var12.field1643 == var15.field1643 && var12.field1644 == var15.field1644) {
                                this.method109(this.field288[var14], var7, var15, var6, 582);
                            }
                        }
                    }
                    this.method147(var7, var12.field1359, var9, true, var6);
                }
                if (var8 == 0) {
                    class1 var17 = this.field286[var9];
                    if ((var17.field1643 & 127) == 64 && (var17.field1644 & 127) == 64) {
                        for (int var18 = 0; var18 < this.field445; ++var18) {
                            class54 var21 = this.field444[this.field446[var18]];
                            if (var21 != null && var21.field1359.field1709 == 1 && var17.field1643 == var21.field1643 && var17.field1644 == var21.field1644) {
                                this.method147(var7, var21.field1359, this.field446[var18], true, var6);
                            }
                        }
                        for (int var19 = 0; var19 < this.field287; ++var19) {
                            class1 var20 = this.field286[this.field288[var19]];
                            if (var20 != null && var17 != var20 && var17.field1643 == var20.field1643 && var17.field1644 == var20.field1644) {
                                this.method109(this.field288[var19], var7, var20, var6, 582);
                            }
                        }
                    }
                    this.method109(var9, var7, var17, var6, 582);
                }
                if (var8 == 3) {
                    class36 var22 = this.field420[this.field307][var6][var7];
                    if (var22 != null) {
                        for (class67 var23 = (class67) var22.method452((byte) -28); var23 != null; var23 = (class67) var22.method454((byte) -27)) {
                            class32 var24 = class32.method380(var23.field1625);
                            if (this.field54 == 1) {
                                this.field179[this.field414] = "Use " + this.field58 + " with @lre@" + var24.field1018;
                                this.field359[this.field414] = 726;
                                this.field360[this.field414] = var23.field1625;
                                this.field357[this.field414] = var6;
                                this.field358[this.field414] = var7;
                                ++this.field414;
                            } else if (this.field43 == 1) {
                                if ((this.field45 & 1) == 1) {
                                    this.field179[this.field414] = this.field46 + " @lre@" + var24.field1018;
                                    this.field359[this.field414] = 174;
                                    this.field360[this.field414] = var23.field1625;
                                    this.field357[this.field414] = var6;
                                    this.field358[this.field414] = var7;
                                    ++this.field414;
                                }
                            } else {
                                for (int var25 = 4; var25 >= 0; --var25) {
                                    if (var24.field1024 != null && var24.field1024[var25] != null) {
                                        this.field179[this.field414] = var24.field1024[var25] + " @lre@" + var24.field1018;
                                        if (var25 == 0) {
                                            this.field359[this.field414] = 748;
                                        }
                                        if (var25 == 1) {
                                            this.field359[this.field414] = 253;
                                        }
                                        if (var25 == 2) {
                                            this.field359[this.field414] = 978;
                                        }
                                        if (var25 == 3) {
                                            this.field359[this.field414] = 100;
                                        }
                                        if (var25 == 4) {
                                            this.field359[this.field414] = 698;
                                        }
                                        this.field360[this.field414] = var23.field1625;
                                        this.field357[this.field414] = var6;
                                        this.field358[this.field414] = var7;
                                        ++this.field414;
                                    } else if (var25 == 2) {
                                        this.field179[this.field414] = "Take @lre@" + var24.field1018;
                                        this.field359[this.field414] = 978;
                                        this.field360[this.field414] = var23.field1625;
                                        this.field357[this.field414] = var6;
                                        this.field358[this.field414] = var7;
                                        ++this.field414;
                                    }
                                }
                                this.field179[this.field414] = "Examine @lre@" + var24.field1018;
                                this.field359[this.field414] = 1022;
                                this.field360[this.field414] = var23.field1625;
                                this.field357[this.field414] = var6;
                                this.field358[this.field414] = var7;
                                ++this.field414;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "K", descriptor = "(I)V")
    public final void method134(int arg0) {
        this.field401 = false;
        while (this.field178) {
            this.field401 = false;
            try {
                Thread.sleep(50L);
            } catch (Exception var2) {
            }
        }
        this.field330 = null;
        this.field331 = null;
        this.field343 = null;
        this.field180 = null;
        this.field181 = null;
        this.field438 += arg0;
        this.field182 = null;
        this.field183 = null;
        this.field511 = null;
        this.field512 = null;
        this.field159 = null;
        this.field160 = null;
        this.field341 = null;
        this.field342 = null;
    }

    @OriginalMember(owner = "client", name = "m", descriptor = "(B)V")
    public final void method135(byte arg0) {
        if (arg0 != 5) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        this.field147 = 0;
        for (int var3 = -1; var3 < this.field445 + this.field287; ++var3) {
            class69 var20;
            if (var3 == -1) {
                var20 = field132;
            } else if (var3 < this.field287) {
                var20 = this.field286[this.field288[var3]];
            } else {
                var20 = this.field444[this.field446[var3 - this.field287]];
            }
            if (var20 != null && var20.method3(false)) {
                if (var20 instanceof class54) {
                    class71 var21 = ((class54) var20).field1359;
                    if (var21.field1719 != null) {
                        var21 = var21.method591(0);
                    }
                    if (var21 == null) {
                        continue;
                    }
                }
                if (var3 >= this.field287) {
                    class71 var25 = ((class54) var20).field1359;
                    if (var25.field1715 >= 0 && var25.field1715 < this.field422.length) {
                        this.method84(var20, var20.field1656 + 15, (byte) -38);
                        if (this.field87 > -1) {
                            this.field422[var25.field1715].method219(448, this.field88 - 30, this.field87 - 12);
                        }
                    }
                    if (this.field394 == 1 && this.field446[var3 - this.field287] == this.field266 && field246 % 20 < 10) {
                        this.method84(var20, var20.field1656 + 15, (byte) -38);
                        if (this.field87 > -1) {
                            this.field422[2].method219(448, this.field88 - 28, this.field87 - 12);
                        }
                    }
                } else {
                    int var22 = 30;
                    class1 var23 = (class1) var20;
                    if (var23.field21 != 0) {
                        this.method84(var20, var20.field1656 + 15, (byte) -38);
                        if (this.field87 > -1) {
                            for (int var24 = 0; var24 < 8; ++var24) {
                                if ((var23.field21 & 1 << var24) != 0) {
                                    this.field422[var24].method219(448, this.field88 - var22, this.field87 - 12);
                                    var22 -= 25;
                                }
                            }
                        }
                    }
                    if (var3 >= 0 && this.field394 == 10 && this.field288[var3] == this.field377) {
                        this.method84(var20, var20.field1656 + 15, (byte) -38);
                        if (this.field87 > -1) {
                            this.field422[7].method219(448, this.field88 - var22, this.field87 - 12);
                        }
                    }
                }
                if (var20.field1688 != null && (var3 >= this.field287 || this.field74 == 0 || this.field74 == 3 || this.field74 == 1 && this.method36(((class1) var20).field19, this.field244))) {
                    this.method84(var20, var20.field1656, (byte) -38);
                    if (this.field87 > -1 && this.field147 < this.field148) {
                        this.field152[this.field147] = this.field391.method256(-163, var20.field1688) / 2;
                        this.field151[this.field147] = this.field391.field728;
                        this.field149[this.field147] = this.field87;
                        this.field150[this.field147] = this.field88;
                        this.field153[this.field147] = var20.field1683;
                        this.field154[this.field147] = var20.field1640;
                        this.field155[this.field147] = var20.field1694;
                        this.field156[this.field147++] = var20.field1688;
                        if (this.field203 == 0 && var20.field1640 >= 1 && var20.field1640 <= 3) {
                            this.field151[this.field147] += 10;
                            this.field150[this.field147] += 5;
                        }
                        if (this.field203 == 0 && var20.field1640 == 4) {
                            this.field152[this.field147] = 60;
                        }
                        if (this.field203 == 0 && var20.field1640 == 5) {
                            this.field151[this.field147] += 5;
                        }
                    }
                }
                if (var20.field1650 > field246) {
                    this.method84(var20, var20.field1656 + 15, (byte) -38);
                    if (this.field87 > -1) {
                        int var26 = var20.field1651 * 30 / var20.field1652;
                        if (var26 > 30) {
                            var26 = 30;
                        }
                        class53.method521(65280, -426, var26, this.field87 - 15, this.field88 - 3, 5);
                        class53.method521(16711680, -426, 30 - var26, this.field87 - 15 + var26, this.field88 - 3, 5);
                    }
                }
                for (int var27 = 0; var27 < 4; ++var27) {
                    if (var20.field1660[var27] > field246) {
                        this.method84(var20, var20.field1656 / 2, (byte) -38);
                        if (this.field87 > -1) {
                            if (var27 == 1) {
                                this.field88 -= 20;
                            }
                            if (var27 == 2) {
                                this.field87 -= 15;
                                this.field88 -= 10;
                            }
                            if (var27 == 3) {
                                this.field87 += 15;
                                this.field88 -= 10;
                            }
                            this.field95[var20.field1659[var27]].method219(448, this.field88 - 12, this.field87 - 12);
                            this.field389.method253(String.valueOf(var20.field1658[var27]), this.field87, this.field88 + 4, 0, this.field264);
                            this.field389.method253(String.valueOf(var20.field1658[var27]), this.field87 - 1, this.field88 + 3, 16777215, this.field264);
                        }
                    }
                }
            }
        }
        for (int var4 = 0; var4 < this.field147; ++var4) {
            int var5 = this.field149[var4];
            int var6 = this.field150[var4];
            int var7 = this.field152[var4];
            int var8 = this.field151[var4];
            boolean var9 = true;
            while (var9) {
                var9 = false;
                for (int var19 = 0; var19 < var4; ++var19) {
                    if (var6 + 2 > this.field150[var19] - this.field151[var19] && var6 - var8 < this.field150[var19] + 2 && var5 - var7 < this.field152[var19] + this.field149[var19] && var5 + var7 > this.field149[var19] - this.field152[var19] && this.field150[var19] - this.field151[var19] < var6) {
                        var6 = this.field150[var19] - this.field151[var19];
                        var9 = true;
                    }
                }
            }
            this.field87 = this.field149[var4];
            this.field88 = this.field150[var4] = var6;
            String var10 = this.field156[var4];
            if (this.field203 == 0) {
                int var11 = 16776960;
                if (this.field153[var4] < 6) {
                    var11 = this.field124[this.field153[var4]];
                }
                if (this.field153[var4] == 6) {
                    var11 = this.field193 % 20 < 10 ? 16711680 : 16776960;
                }
                if (this.field153[var4] == 7) {
                    var11 = this.field193 % 20 < 10 ? 255 : 65535;
                }
                if (this.field153[var4] == 8) {
                    var11 = this.field193 % 20 < 10 ? 45056 : 8454016;
                }
                if (this.field153[var4] == 9) {
                    int var12 = 150 - this.field155[var4];
                    if (var12 < 50) {
                        var11 = var12 * 1280 + 16711680;
                    } else if (var12 < 100) {
                        var11 = 16776960 - (var12 - 50) * 327680;
                    } else if (var12 < 150) {
                        var11 = (var12 - 100) * 5 + 65280;
                    }
                }
                if (this.field153[var4] == 10) {
                    int var13 = 150 - this.field155[var4];
                    if (var13 < 50) {
                        var11 = var13 * 5 + 16711680;
                    } else if (var13 < 100) {
                        var11 = 16711935 - (var13 - 50) * 327680;
                    } else if (var13 < 150) {
                        var11 = (var13 - 100) * 327680 + 255 - (var13 - 100) * 5;
                    }
                }
                if (this.field153[var4] == 11) {
                    int var14 = 150 - this.field155[var4];
                    if (var14 < 50) {
                        var11 = 16777215 - var14 * 327685;
                    } else if (var14 < 100) {
                        var11 = (var14 - 50) * 327685 + 65280;
                    } else if (var14 < 150) {
                        var11 = 16777215 - (var14 - 100) * 327680;
                    }
                }
                if (this.field154[var4] == 0) {
                    this.field391.method253(var10, this.field87, this.field88 + 1, 0, this.field264);
                    this.field391.method253(var10, this.field87, this.field88, var11, this.field264);
                }
                if (this.field154[var4] == 1) {
                    this.field391.method258(var10, this.field193, -45089, 0, this.field88 + 1, this.field87);
                    this.field391.method258(var10, this.field193, -45089, var11, this.field88, this.field87);
                }
                if (this.field154[var4] == 2) {
                    this.field391.method259(var10, 0, this.field193, this.field87, this.field88 + 1, 8);
                    this.field391.method259(var10, var11, this.field193, this.field87, this.field88, 8);
                }
                if (this.field154[var4] == 3) {
                    this.field391.method260(var10, this.field88 + 1, this.field87, 0, false, 150 - this.field155[var4], this.field193);
                    this.field391.method260(var10, this.field88, this.field87, var11, false, 150 - this.field155[var4], this.field193);
                }
                if (this.field154[var4] == 4) {
                    int var15 = this.field391.method256(-163, var10);
                    int var16 = (150 - this.field155[var4]) * (var15 + 100) / 150;
                    class53.method518(0, 0, this.field87 + 50, 334, this.field87 - 50);
                    this.field391.method257(this.field87 + 50 - var16, var10, this.field88 + 1, 0, 0);
                    this.field391.method257(this.field87 + 50 - var16, var10, this.field88, var11, 0);
                    class53.method517(43417);
                }
                if (this.field154[var4] == 5) {
                    int var17 = 150 - this.field155[var4];
                    int var18 = 0;
                    if (var17 < 25) {
                        var18 = var17 - 25;
                    } else if (var17 > 125) {
                        var18 = var17 - 125;
                    }
                    class53.method518(this.field88 - this.field391.field728 - 1, 0, 512, this.field88 + 5, 0);
                    this.field391.method253(var10, this.field87, this.field88 + 1 + var18, 0, this.field264);
                    this.field391.method253(var10, this.field87, this.field88 + var18, var11, this.field264);
                    class53.method517(43417);
                }
            } else {
                this.field391.method253(var10, this.field87, this.field88 + 1, 0, this.field264);
                this.field391.method253(var10, this.field87, this.field88, 16776960, this.field264);
            }
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(ZLLDILQFVA;I)V")
    public final void method136(boolean arg0, class34 arg1, int arg2) {
        if (!arg0) {
            if (arg2 == 81) {
                int var4 = arg1.method402();
                int var5 = (var4 >> 4 & 7) + this.field397;
                int var6 = (var4 & 7) + this.field398;
                int var7 = var5 + arg1.method403();
                int var8 = var6 + arg1.method403();
                int var9 = arg1.method405();
                int var10 = arg1.method404();
                int var11 = arg1.method402() * 4;
                int var12 = arg1.method402() * 4;
                int var13 = arg1.method404();
                int var14 = arg1.method404();
                int var15 = arg1.method402();
                int var16 = arg1.method402();
                if (var5 >= 0 && var6 >= 0 && var5 < 104 && var6 < 104 && var7 >= 0 && var8 >= 0 && var7 < 104 && var8 < 104 && var10 != 65535) {
                    int var17 = var5 * 128 + 64;
                    int var18 = var6 * 128 + 64;
                    int var19 = var7 * 128 + 64;
                    int var20 = var8 * 128 + 64;
                    class38 var21 = new class38(var10, this.field307, false, this.method141((byte) 76, var18, this.field307, var17) - var11, var9, var12, field246 + var13, field246 + var14, var17, var18, var16, var15);
                    var21.method458(var20, this.method141((byte) 76, var20, this.field307, var19) - var12, var19, field246 + var13, this.field295);
                    this.field374.method448(var21);
                }
            } else {
                if (arg2 == 152) {
                    int var22 = arg1.method402();
                    int var23 = (var22 >> 4 & 7) + this.field397;
                    int var24 = (var22 & 7) + this.field398;
                    int var25 = arg1.method404();
                    int var26 = arg1.method402();
                    int var27 = var26 >> 4 & 15;
                    int var28 = var26 & 7;
                    if (field132.field1641[0] >= var23 - var27 && field132.field1641[0] <= var23 + var27 && field132.field1642[0] >= var24 - var27 && field132.field1642[0] <= var24 + var27 && this.field86 && !field412 && this.field436 < 50) {
                        this.field62[this.field436] = var25;
                        this.field273[this.field436] = var28;
                        this.field418[this.field436] = class46.field1274[var25];
                        ++this.field436;
                    }
                }
                if (arg2 == 170) {
                    int var29 = arg1.method420(0);
                    int var30 = (var29 >> 4 & 7) + this.field397;
                    int var31 = (var29 & 7) + this.field398;
                    int var32 = arg1.method430(true);
                    if (var30 >= 0 && var31 >= 0 && var30 < 104 && var31 < 104) {
                        class36 var33 = this.field420[this.field307][var30][var31];
                        if (var33 != null) {
                            for (class67 var34 = (class67) var33.method451(); var34 != null; var34 = (class67) var33.method453((byte) 5)) {
                                if ((var32 & 32767) == var34.field1625) {
                                    var34.method156();
                                    break;
                                }
                            }
                            if (var33.method451() == null) {
                                this.field420[this.field307][var30][var31] = null;
                            }
                            this.method54(var30, var31);
                        }
                    }
                } else if (arg2 == 254) {
                    int var35 = arg1.method421(field259);
                    int var36 = var35 >> 2;
                    int var37 = var35 & 3;
                    int var38 = this.field426[var36];
                    int var39 = arg1.method422(0);
                    int var40 = (var39 >> 4 & 7) + this.field397;
                    int var41 = (var39 & 7) + this.field398;
                    int var42 = arg1.method404();
                    if (var40 >= 0 && var41 >= 0 && var40 < 103 && var41 < 103) {
                        int var43 = this.field292[this.field307][var40][var41];
                        int var44 = this.field292[this.field307][var40 + 1][var41];
                        int var45 = this.field292[this.field307][var40 + 1][var41 + 1];
                        int var46 = this.field292[this.field307][var40][var41 + 1];
                        if (var38 == 0) {
                            class12 var47 = this.field174.method180(914, var41, this.field307, var40);
                            if (var47 != null) {
                                int var48 = var47.field659 >> 14 & 32767;
                                if (var36 == 2) {
                                    var47.field657 = new class22(var37 + 4, var44, false, var42, var48, 2, var43, (byte) 5, var45, var46);
                                    var47.field658 = new class22(var37 + 1 & 3, var44, false, var42, var48, 2, var43, (byte) 5, var45, var46);
                                } else {
                                    var47.field657 = new class22(var37, var44, false, var42, var48, var36, var43, (byte) 5, var45, var46);
                                }
                            }
                        }
                        if (var38 == 1) {
                            class44 var49 = this.field174.method181(this.field307, 0, var40, var41);
                            if (var49 != null) {
                                var49.field1218 = new class22(0, var44, false, var42, var49.field1219 >> 14 & 32767, 4, var43, (byte) 5, var45, var46);
                            }
                        }
                        if (var38 == 2) {
                            class11 var50 = this.field174.method182(-34370, this.field307, var40, var41);
                            if (var36 == 11) {
                                var36 = 10;
                            }
                            if (var50 != null) {
                                var50.field642 = new class22(var37, var44, false, var42, var50.field650 >> 14 & 32767, var36, var43, (byte) 5, var45, var46);
                            }
                        }
                        if (var38 == 3) {
                            class65 var51 = this.field174.method183(this.field307, var40, (byte) 5, var41);
                            if (var51 != null) {
                                var51.field1602 = new class22(var37, var44, false, var42, var51.field1603 >> 14 & 32767, 22, var43, (byte) 5, var45, var46);
                            }
                        }
                    }
                } else if (arg2 == 47) {
                    int var52 = arg1.method402();
                    int var53 = (var52 >> 4 & 7) + this.field397;
                    int var54 = (var52 & 7) + this.field398;
                    int var55 = arg1.method404();
                    int var56 = arg1.method402();
                    int var57 = arg1.method404();
                    if (var53 >= 0 && var54 >= 0 && var53 < 104 && var54 < 104) {
                        int var58 = var53 * 128 + 64;
                        int var59 = var54 * 128 + 64;
                        class5 var60 = new class5(var57, var55, this.method141((byte) 76, var59, this.field307, var58) - var56, field246, var59, (byte) 7, var58, this.field307);
                        this.field319.method448(var60);
                    }
                } else if (arg2 == 120) {
                    int var61 = arg1.method402();
                    int var62 = (var61 >> 4 & 7) + this.field397;
                    int var63 = (var61 & 7) + this.field398;
                    int var64 = arg1.method404();
                    int var65 = arg1.method404();
                    int var66 = arg1.method404();
                    if (var62 >= 0 && var63 >= 0 && var62 < 104 && var63 < 104) {
                        class36 var67 = this.field420[this.field307][var62][var63];
                        if (var67 != null) {
                            for (class67 var68 = (class67) var67.method451(); var68 != null; var68 = (class67) var67.method453((byte) 5)) {
                                if ((var64 & 32767) == var68.field1625 && var68.field1626 == var65) {
                                    var68.field1626 = var66;
                                    break;
                                }
                            }
                            this.method54(var62, var63);
                        }
                    }
                } else if (arg2 == 75) {
                    int var69 = arg1.method421(field259);
                    int var70 = var69 >> 2;
                    int var71 = var69 & 3;
                    int var72 = this.field426[var70];
                    int var73 = arg1.method402();
                    int var74 = (var73 >> 4 & 7) + this.field397;
                    int var75 = (var73 & 7) + this.field398;
                    if (var74 >= 0 && var75 >= 0 && var74 < 104 && var75 < 104) {
                        this.method80(this.field307, var70, this.field494, 0, var75, var72, var74, -1, -1, var71);
                    }
                } else if (arg2 == 124) {
                    int var76 = arg1.method422(0);
                    int var77 = (var76 >> 4 & 7) + this.field397;
                    int var78 = (var76 & 7) + this.field398;
                    int var79 = arg1.method421(field259);
                    int var80 = var79 >> 2;
                    int var81 = var79 & 3;
                    int var82 = this.field426[var80];
                    int var83 = arg1.method430(true);
                    if (var77 >= 0 && var78 >= 0 && var77 < 104 && var78 < 104) {
                        this.method80(this.field307, var80, this.field494, 0, var78, var82, var77, -1, var83, var81);
                    }
                } else {
                    if (arg2 == 194) {
                        byte var84 = arg1.method425(0);
                        int var85 = arg1.method421(field259);
                        int var86 = var85 >> 2;
                        int var87 = var85 & 3;
                        int var88 = this.field426[var86];
                        int var89 = arg1.method431(true);
                        byte var90 = arg1.method425(0);
                        int var91 = arg1.method404();
                        int var92 = arg1.method404();
                        int var93 = arg1.method429(true);
                        byte var94 = arg1.method425(0);
                        int var95 = arg1.method402();
                        int var96 = (var95 >> 4 & 7) + this.field397;
                        int var97 = (var95 & 7) + this.field398;
                        byte var98 = arg1.method423(7);
                        class1 var99;
                        if (this.field79 == var91) {
                            var99 = field132;
                        } else {
                            var99 = this.field286[var91];
                        }
                        if (var99 != null) {
                            class59 var100 = class59.method555(var93);
                            int var101 = this.field292[this.field307][var96][var97];
                            int var102 = this.field292[this.field307][var96 + 1][var97];
                            int var103 = this.field292[this.field307][var96 + 1][var97 + 1];
                            int var104 = this.field292[this.field307][var96][var97 + 1];
                            class27 var105 = var100.method548(var86, var87, var101, var102, var103, var104, -1);
                            if (var105 != null) {
                                this.method80(this.field307, 0, this.field494, var89 + 1, var97, var88, var96, var92 + 1, -1, 0);
                                var99.field10 = field246 + var89;
                                var99.field11 = field246 + var92;
                                var99.field8 = var105;
                                int var106 = var100.field1506;
                                int var107 = var100.field1472;
                                if (var87 == 1 || var87 == 3) {
                                    var106 = var100.field1472;
                                    var107 = var100.field1506;
                                }
                                var99.field5 = var96 * 128 + var106 * 64;
                                var99.field7 = var97 * 128 + var107 * 64;
                                var99.field6 = this.method141((byte) 76, var99.field7, this.field307, var99.field5);
                                if (var98 > var94) {
                                    byte var108 = var98;
                                    var98 = var94;
                                    var94 = var108;
                                }
                                if (var84 > var90) {
                                    byte var109 = var84;
                                    var84 = var90;
                                    var90 = var109;
                                }
                                var99.field23 = var96 + var98;
                                var99.field25 = var94 + var96;
                                var99.field24 = var84 + var97;
                                var99.field26 = var90 + var97;
                            }
                        }
                    }
                    if (arg2 == 127) {
                        int var110 = arg1.method420(0);
                        int var111 = (var110 >> 4 & 7) + this.field397;
                        int var112 = (var110 & 7) + this.field398;
                        int var113 = arg1.method430(true);
                        int var114 = arg1.method404();
                        int var115 = arg1.method404();
                        if (var111 >= 0 && var112 >= 0 && var111 < 104 && var112 < 104 && this.field79 != var115) {
                            class67 var116 = new class67();
                            var116.field1625 = var113;
                            var116.field1626 = var114;
                            if (this.field420[this.field307][var111][var112] == null) {
                                this.field420[this.field307][var111][var112] = new class36(6);
                            }
                            this.field420[this.field307][var111][var112].method448(var116);
                            this.method54(var111, var112);
                        }
                    } else if (arg2 == 86) {
                        int var117 = arg1.method429(true);
                        int var118 = arg1.method429(true);
                        int var119 = arg1.method402();
                        int var120 = (var119 >> 4 & 7) + this.field397;
                        int var121 = (var119 & 7) + this.field398;
                        if (var120 >= 0 && var121 >= 0 && var120 < 104 && var121 < 104) {
                            class67 var122 = new class67();
                            var122.field1625 = var118;
                            var122.field1626 = var117;
                            if (this.field420[this.field307][var120][var121] == null) {
                                this.field420[this.field307][var120][var121] = new class36(6);
                            }
                            this.field420[this.field307][var120][var121].method448(var122);
                            this.method54(var120, var121);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "L", descriptor = "(I)V")
    public final void method137(int arg0) {
        if (arg0 <= 0) {
            field469 = !field469;
        }
        for (class38 var2 = (class38) this.field374.method451(); var2 != null; var2 = (class38) this.field374.method453((byte) 5)) {
            if (this.field307 == var2.field1118 && field246 <= var2.field1124) {
                if (field246 >= var2.field1123) {
                    if (var2.field1145 > 0) {
                        class54 var3 = this.field444[var2.field1145 - 1];
                        if (var3 != null && var3.field1643 >= 0 && var3.field1643 < 13312 && var3.field1644 >= 0 && var3.field1644 < 13312) {
                            var2.method458(var3.field1644, this.method141((byte) 76, var3.field1644, var2.field1118, var3.field1643) - var2.field1128, var3.field1643, field246, this.field295);
                        }
                    }
                    if (var2.field1145 < 0) {
                        int var4 = -var2.field1145 - 1;
                        class1 var5;
                        if (this.field79 == var4) {
                            var5 = field132;
                        } else {
                            var5 = this.field286[var4];
                        }
                        if (var5 != null && var5.field1643 >= 0 && var5.field1643 < 13312 && var5.field1644 >= 0 && var5.field1644 < 13312) {
                            var2.method458(var5.field1644, this.method141((byte) 76, var5.field1644, var2.field1118, var5.field1643) - var2.field1128, var5.field1643, field246, this.field295);
                        }
                    }
                    var2.method459(false, this.field417);
                    this.field174.method169(this.field307, 60, (int) var2.field1133, (byte) 7, (int) var2.field1135, -1, (int) var2.field1134, false, var2.field1141, var2);
                }
            } else {
                var2.method156();
            }
        }
    }

    @OriginalMember(owner = "client", name = "m", descriptor = "(Z)V")
    public final void method138(boolean arg0) {
        if (arg0) {
            for (class5 var2 = (class5) this.field319.method451(); var2 != null; var2 = (class5) this.field319.method453((byte) 5)) {
                if (this.field307 == var2.field533 && !var2.field537) {
                    if (field246 >= var2.field532) {
                        var2.method155(this.field417, 565);
                        if (var2.field537) {
                            var2.method156();
                        } else {
                            this.field174.method169(var2.field533, 60, var2.field534, (byte) 7, var2.field536, -1, var2.field535, false, 0, var2);
                        }
                    }
                } else {
                    var2.method156();
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIII)Z")
    public final boolean method139(int arg0, int arg1, int arg2, int arg3) {
        int var5 = arg3 >> 14 & 32767;
        int var6 = this.field174.method188(this.field307, arg0, arg2, arg3);
        if (var6 == -1) {
            return false;
        } else {
            int var7 = var6 & 31;
            int var8 = var6 >> 6 & 3;
            ++field146;
            if (field146 > 99) {
                field146 = 0;
                this.field329.method391(217, 926);
            }
            if (var7 != 10 && var7 != 11 && var7 != 22) {
                this.method98(arg0, field132.field1641[0], this.field195, var8, 0, 0, false, 2, 0, arg2, var7 + 1, field132.field1642[0]);
            } else {
                class59 var9 = class59.method555(var5);
                int var10;
                int var11;
                if (var8 != 0 && var8 != 2) {
                    var10 = var9.field1472;
                    var11 = var9.field1506;
                } else {
                    var10 = var9.field1506;
                    var11 = var9.field1472;
                }
                int var12 = var9.field1507;
                if (var8 != 0) {
                    var12 = (var12 >> 4 - var8) + (var12 << var8 & 15);
                }
                this.method98(arg0, field132.field1641[0], this.field195, 0, var10, var12, false, 2, var11, arg2, 0, field132.field1642[0]);
            }
            this.field39 = super.field979;
            this.field40 = super.field980;
            this.field42 = 2;
            this.field41 = 0;
            if (arg1 != 2) {
                this.method83();
            }
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILULLVQOAK;III)V")
    public final void method140(int arg0, class58 arg1, int arg2, int arg3, int arg4) {
        if (arg1.field1410 == 0 && arg1.field1421 != null) {
            if (!arg1.field1442 || this.field323 == arg1.field1458 || this.field371 == arg1.field1458 || this.field491 == arg1.field1458) {
                int var6 = class53.field1352;
                int var7 = class53.field1350;
                int var8 = class53.field1353;
                int var9 = class53.field1351;
                if (this.field427 == arg3) {
                    class53.method518(arg4, 0, arg1.field1451 + arg0, arg1.field1452 + arg4, arg0);
                    int var10 = arg1.field1421.length;
                    for (int var11 = 0; var11 < var10; ++var11) {
                        int var12 = arg1.field1444[var11] + arg0;
                        int var13 = arg1.field1455[var11] + arg4 - arg2;
                        class58 var14 = class58.field1405[arg1.field1421[var11]];
                        int var15 = var14.field1407 + var12;
                        int var16 = var14.field1423 + var13;
                        if (var14.field1422 > 0) {
                            this.method15(0, var14);
                        }
                        if (var14.field1410 == 0) {
                            if (var14.field1435 > var14.field1401 - var14.field1452) {
                                var14.field1435 = var14.field1401 - var14.field1452;
                            }
                            if (var14.field1435 < 0) {
                                var14.field1435 = 0;
                            }
                            this.method140(var15, var14, var14.field1435, 1, var16);
                            if (var14.field1401 > var14.field1452) {
                                this.method39(405, var14.field1401, var14.field1435, var14.field1451 + var15, var14.field1452, var16);
                            }
                        } else if (var14.field1410 != 1) {
                            if (var14.field1410 == 2) {
                                int var17 = 0;
                                for (int var18 = 0; var18 < var14.field1452; ++var18) {
                                    for (int var19 = 0; var19 < var14.field1451; ++var19) {
                                        int var20 = (var14.field1397 + 32) * var19 + var15;
                                        int var21 = (var14.field1433 + 32) * var18 + var16;
                                        if (var17 < 20) {
                                            var20 += var14.field1447[var17];
                                            var21 += var14.field1413[var17];
                                        }
                                        if (var14.field1400[var17] <= 0) {
                                            if (var14.field1425 != null && var17 < 20) {
                                                class10 var30 = var14.field1425[var17];
                                                if (var30 != null) {
                                                    var30.method219(448, var21, var20);
                                                }
                                            }
                                        } else {
                                            int var22 = 0;
                                            int var23 = 0;
                                            int var24 = var14.field1400[var17] - 1;
                                            if (var20 > class53.field1352 - 32 && var20 < class53.field1353 && var21 > class53.field1350 - 32 && var21 < class53.field1351 || this.field212 != 0 && this.field211 == var17) {
                                                int var25 = 0;
                                                if (this.field54 == 1 && this.field55 == var17 && this.field56 == var14.field1458) {
                                                    var25 = 16777215;
                                                }
                                                class10 var26 = class32.method377(var14.field1440[var17], this.field162, var24, var25);
                                                if (var26 != null) {
                                                    if (this.field212 != 0 && this.field211 == var17 && this.field210 == var14.field1458) {
                                                        var22 = super.field972 - this.field213;
                                                        var23 = super.field973 - this.field214;
                                                        if (var22 < 5 && var22 > -5) {
                                                            var22 = 0;
                                                        }
                                                        if (var23 < 5 && var23 > -5) {
                                                            var23 = 0;
                                                        }
                                                        if (this.field257 < 5) {
                                                            var22 = 0;
                                                            var23 = 0;
                                                        }
                                                        var26.method221(var20 + var22, -7063, 128, var21 + var23);
                                                        if (var21 + var23 < class53.field1350 && arg1.field1435 > 0) {
                                                            int var27 = (class53.field1350 - var21 - var23) * this.field417 / 3;
                                                            if (var27 > this.field417 * 10) {
                                                                var27 = this.field417 * 10;
                                                            }
                                                            if (var27 > arg1.field1435) {
                                                                var27 = arg1.field1435;
                                                            }
                                                            arg1.field1435 -= var27;
                                                            this.field214 += var27;
                                                        }
                                                        if (var21 + var23 + 32 > class53.field1351 && arg1.field1435 < arg1.field1401 - arg1.field1452) {
                                                            int var28 = (var21 + var23 + 32 - class53.field1351) * this.field417 / 3;
                                                            if (var28 > this.field417 * 10) {
                                                                var28 = this.field417 * 10;
                                                            }
                                                            if (var28 > arg1.field1401 - arg1.field1452 - arg1.field1435) {
                                                                var28 = arg1.field1401 - arg1.field1452 - arg1.field1435;
                                                            }
                                                            arg1.field1435 += var28;
                                                            this.field214 -= var28;
                                                        }
                                                    } else if (this.field355 != 0 && this.field354 == var17 && this.field353 == var14.field1458) {
                                                        var26.method221(var20, -7063, 128, var21);
                                                    } else {
                                                        var26.method219(448, var21, var20);
                                                    }
                                                    if (var26.field636 == 33 || var14.field1440[var17] != 1) {
                                                        int var29 = var14.field1440[var17];
                                                        this.field389.method257(var20 + 1 + var22, method130(-37821, var29), var21 + 10 + var23, 0, 0);
                                                        this.field389.method257(var20 + var22, method130(-37821, var29), var21 + 9 + var23, 16776960, 0);
                                                    }
                                                }
                                            }
                                        }
                                        ++var17;
                                    }
                                }
                            } else if (var14.field1410 == 3) {
                                boolean var31 = false;
                                if (this.field491 == var14.field1458 || this.field371 == var14.field1458 || this.field323 == var14.field1458) {
                                    var31 = true;
                                }
                                int var32;
                                if (this.method91(false, var14)) {
                                    var32 = var14.field1449;
                                    if (var31 && var14.field1432 != 0) {
                                        var32 = var14.field1432;
                                    }
                                } else {
                                    var32 = var14.field1402;
                                    if (var31 && var14.field1398 != 0) {
                                        var32 = var14.field1398;
                                    }
                                }
                                if (var14.field1450 == 0) {
                                    if (var14.field1454) {
                                        class53.method521(var32, -426, var14.field1451, var15, var16, var14.field1452);
                                    } else {
                                        class53.method522(var32, var15, var14.field1451, this.field423, var14.field1452, var16);
                                    }
                                } else if (var14.field1454) {
                                    class53.method520(var32, var16, this.field507, var14.field1452, 256 - (var14.field1450 & 255), var14.field1451, var15);
                                } else {
                                    class53.method523(var15, var32, 256 - (var14.field1450 & 255), var14.field1451, var16, -519, var14.field1452);
                                }
                            } else if (var14.field1410 == 4) {
                                class19 var33 = var14.field1441;
                                String var34 = var14.field1445;
                                boolean var35 = false;
                                if (this.field491 == var14.field1458 || this.field371 == var14.field1458 || this.field323 == var14.field1458) {
                                    var35 = true;
                                }
                                int var36;
                                if (this.method91(false, var14)) {
                                    var36 = var14.field1449;
                                    if (var35 && var14.field1432 != 0) {
                                        var36 = var14.field1432;
                                    }
                                    if (var14.field1446.length() > 0) {
                                        var34 = var14.field1446;
                                    }
                                } else {
                                    var36 = var14.field1402;
                                    if (var35 && var14.field1398 != 0) {
                                        var36 = var14.field1398;
                                    }
                                }
                                if (var14.field1411 == 6 && this.field429) {
                                    var34 = "Please wait...";
                                    var36 = var14.field1402;
                                }
                                if (class53.field1348 == 479) {
                                    if (var36 == 16776960) {
                                        var36 = 255;
                                    }
                                    if (var36 == 49152) {
                                        var36 = 16777215;
                                    }
                                }
                                int var37 = var33.field728 + var16;
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
                                                                            var34 = var34.substring(0, var42) + this.method59((byte) 7, this.method73(var14, 4, false)) + var34.substring(var42 + 2);
                                                                        }
                                                                    }
                                                                    var34 = var34.substring(0, var41) + this.method59((byte) 7, this.method73(var14, 3, false)) + var34.substring(var41 + 2);
                                                                }
                                                            }
                                                            var34 = var34.substring(0, var40) + this.method59((byte) 7, this.method73(var14, 2, false)) + var34.substring(var40 + 2);
                                                        }
                                                    }
                                                    var34 = var34.substring(0, var39) + this.method59((byte) 7, this.method73(var14, 1, false)) + var34.substring(var39 + 2);
                                                }
                                            }
                                            var34 = var34.substring(0, var38) + this.method59((byte) 7, this.method73(var14, 0, false)) + var34.substring(var38 + 2);
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
                                    if (var14.field1462) {
                                        var33.method254(var14.field1451 / 2 + var15, var37, var36, var44, var14.field1437, false);
                                    } else {
                                        var33.method261(var36, var15, var14.field1437, true, var44, var37);
                                    }
                                    var37 += var33.field728;
                                }
                            } else if (var14.field1410 == 5) {
                                class10 var45;
                                if (this.method91(false, var14)) {
                                    var45 = var14.field1424;
                                } else {
                                    var45 = var14.field1443;
                                }
                                if (var45 != null) {
                                    var45.method219(448, var16, var15);
                                }
                            } else if (var14.field1410 == 6) {
                                int var46 = class25.field815;
                                int var47 = class25.field816;
                                class25.field815 = var14.field1451 / 2 + var15;
                                class25.field816 = var14.field1452 / 2 + var16;
                                int var48 = class25.field819[var14.field1416] * var14.field1415 >> 16;
                                int var49 = class25.field820[var14.field1416] * var14.field1415 >> 16;
                                boolean var50 = this.method91(false, var14);
                                int var51;
                                if (var50) {
                                    var51 = var14.field1428;
                                } else {
                                    var51 = var14.field1427;
                                }
                                class27 var52;
                                if (var51 == -1) {
                                    var52 = var14.method544(0, var50, -1, -1);
                                } else {
                                    class66 var53 = class66.field1608[var51];
                                    var52 = var14.method544(0, var50, var53.field1611[var14.field1434], var53.field1610[var14.field1434]);
                                }
                                if (var52 != null) {
                                    var52.method342(0, var14.field1417, 0, var14.field1416, 0, var48, var49);
                                }
                                class25.field815 = var46;
                                class25.field816 = var47;
                            } else if (var14.field1410 == 7) {
                                class19 var54 = var14.field1441;
                                int var55 = 0;
                                for (int var56 = 0; var56 < var14.field1452; ++var56) {
                                    for (int var57 = 0; var57 < var14.field1451; ++var57) {
                                        if (var14.field1400[var55] > 0) {
                                            class32 var58 = class32.method380(var14.field1400[var55] - 1);
                                            String var59 = var58.field1018;
                                            if (var58.field998 || var14.field1440[var55] != 1) {
                                                var59 = var59 + " x" + method19(true, var14.field1440[var55]);
                                            }
                                            int var60 = (var14.field1397 + 115) * var57 + var15;
                                            int var61 = (var14.field1433 + 12) * var56 + var16;
                                            if (var14.field1462) {
                                                var54.method254(var14.field1451 / 2 + var60, var61, var14.field1402, var59, var14.field1437, false);
                                            } else {
                                                var54.method261(var14.field1402, var60, var14.field1437, true, var59, var61);
                                            }
                                        }
                                        ++var55;
                                    }
                                }
                            }
                        }
                    }
                    class53.method518(var7, 0, var8, var9, var6);
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BIII)I")
    public final int method141(byte arg0, int arg1, int arg2, int arg3) {
        if (this.field508 != arg0) {
            return field116;
        } else {
            int var5 = arg3 >> 7;
            int var6 = arg1 >> 7;
            if (var5 >= 0 && var6 >= 0 && var5 <= 103 && var6 <= 103) {
                int var7 = arg2;
                if (arg2 < 3 && (this.field479[1][var5][var6] & 2) == 2) {
                    var7 = arg2 + 1;
                }
                int var8 = arg3 & 127;
                int var9 = arg1 & 127;
                int var10 = (128 - var8) * this.field292[var7][var5][var6] + this.field292[var7][var5 + 1][var6] * var8 >> 7;
                int var11 = (128 - var8) * this.field292[var7][var5][var6 + 1] + this.field292[var7][var5 + 1][var6 + 1] * var8 >> 7;
                return (128 - var9) * var10 + var9 * var11 >> 7;
            } else {
                return 0;
            }
        }
    }

    @OriginalMember(owner = "client", name = "M", descriptor = "(I)V")
    public final void method142(int arg0) {
        if (arg0 != 0) {
            this.field329.method392(52);
        }
        this.field178 = true;
        try {
            long var2 = System.currentTimeMillis();
            int var4 = 0;
            int var5 = 20;
            while (this.field401) {
                ++this.field434;
                this.method38((byte) 8);
                this.method38((byte) 8);
                this.method87(0);
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
        this.field178 = false;
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(ILLDILQFVA;I)V")
    private final void method143(int arg0, class34 arg1, int arg2) {
        if (arg2 < this.field363 || arg2 > this.field363) {
            this.field439 = -1;
        }
        for (int var4 = 0; var4 < this.field289; ++var4) {
            int var5 = this.field290[var4];
            class54 var6 = this.field444[var5];
            int var7 = arg1.method402();
            if ((var7 & 8) != 0) {
                var6.field1688 = arg1.method409();
                var6.field1694 = 100;
            }
            if ((var7 & 16) != 0) {
                var6.field1681 = arg1.method429(true);
                var6.field1682 = arg1.method404();
            }
            if ((var7 & 4) != 0) {
                int var8 = arg1.method421(field259);
                int var9 = arg1.method421(field259);
                var6.method576(-200, var9, var8, field246);
                var6.field1650 = field246 + 300;
                var6.field1651 = arg1.method422(0);
                var6.field1652 = arg1.method402();
            }
            if ((var7 & 1) != 0) {
                int var10 = arg1.method422(0);
                int var11 = arg1.method421(field259);
                var6.method576(-200, var11, var10, field246);
                var6.field1650 = field246 + 300;
                var6.field1651 = arg1.method420(0);
                var6.field1652 = arg1.method420(0);
            }
            if ((var7 & 64) != 0) {
                var6.field1661 = arg1.method404();
                int var12 = arg1.method437((byte) 2);
                var6.field1665 = var12 >> 16;
                var6.field1664 = (var12 & 65535) + field246;
                var6.field1662 = 0;
                var6.field1663 = 0;
                if (var6.field1664 > field246) {
                    var6.field1662 = -1;
                }
                if (var6.field1661 == 65535) {
                    var6.field1661 = -1;
                }
            }
            if ((var7 & 2) != 0) {
                var6.field1684 = arg1.method430(true);
                if (var6.field1684 == 65535) {
                    var6.field1684 = -1;
                }
            }
            if ((var7 & 32) != 0) {
                int var13 = arg1.method430(true);
                if (var13 == 65535) {
                    var13 = -1;
                }
                int var14 = arg1.method420(0);
                if (var6.field1689 == var13 && var13 != -1) {
                    int var15 = class66.field1608[var13].field1622;
                    if (var15 == 1) {
                        var6.field1690 = 0;
                        var6.field1691 = 0;
                        var6.field1692 = var14;
                        var6.field1693 = 0;
                    }
                    if (var15 == 2) {
                        var6.field1693 = 0;
                    }
                } else if (var13 == -1 || var6.field1689 == -1 || class66.field1608[var13].field1616 >= class66.field1608[var6.field1689].field1616) {
                    var6.field1689 = var13;
                    var6.field1690 = 0;
                    var6.field1691 = 0;
                    var6.field1692 = var14;
                    var6.field1693 = 0;
                    var6.field1685 = var6.field1646;
                }
            }
            if ((var7 & 128) != 0) {
                var6.field1359 = class71.method589(arg1.method430(true));
                var6.field1666 = var6.field1359.field1709;
                var6.field1657 = var6.field1359.field1733;
                var6.field1675 = var6.field1359.field1716;
                var6.field1676 = var6.field1359.field1729;
                var6.field1677 = var6.field1359.field1713;
                var6.field1678 = var6.field1359.field1703;
                var6.field1654 = var6.field1359.field1718;
            }
        }
    }

    @OriginalMember(owner = "client", name = "n", descriptor = "(B)V")
    public final void method144(byte arg0) {
        this.field92.method529(false);
        class25.field821 = this.field217;
        if (this.field318 == arg0) {
            boolean var2 = false;
        } else {
            this.method83();
        }
        this.field50.method446(448, 0, 0);
        if (this.field470) {
            this.field391.method253(this.field308, 239, 40, 0, this.field264);
            this.field391.method253(this.field190 + "*", 239, 60, 128, this.field264);
        } else if (this.field117 == 1) {
            this.field391.method253("Enter amount:", 239, 40, 0, this.field264);
            this.field391.method253(this.field516 + "*", 239, 60, 128, this.field264);
        } else if (this.field117 == 2) {
            this.field391.method253("Enter name:", 239, 40, 0, this.field264);
            this.field391.method253(this.field516 + "*", 239, 60, 128, this.field264);
        } else if (this.field76 != null) {
            this.field391.method253(this.field76, 239, 40, 0, this.field264);
            this.field391.method253("Click to continue", 239, 60, 128, this.field264);
        } else if (this.field133 != -1) {
            this.method140(0, class58.field1405[this.field133], 0, 1, 0);
        } else if (this.field186 != -1) {
            this.method140(0, class58.field1405[this.field186], 0, 1, 0);
        } else {
            class19 var3 = this.field390;
            int var4 = 0;
            class53.method518(0, 0, 463, 77, 0);
            for (int var5 = 0; var5 < 100; ++var5) {
                if (this.field207[var5] != null) {
                    int var7 = this.field205[var5];
                    int var8 = 70 - var4 * 14 + this.field256;
                    String var9 = this.field206[var5];
                    byte var10 = 0;
                    if (var9 != null && var9.startsWith("@cr1@")) {
                        var9 = var9.substring(5);
                        var10 = 1;
                    }
                    if (var9 != null && var9.startsWith("@cr2@")) {
                        var9 = var9.substring(5);
                        var10 = 2;
                    }
                    if (var7 == 0) {
                        if (var8 > 0 && var8 < 110) {
                            var3.method257(4, this.field207[var5], var8, 0, 0);
                        }
                        ++var4;
                    }
                    if ((var7 == 1 || var7 == 2) && (var7 == 1 || this.field74 == 0 || this.field74 == 1 && this.method36(var9, this.field244))) {
                        if (var8 > 0 && var8 < 110) {
                            int var11 = 4;
                            if (var10 == 1) {
                                this.field241[0].method446(448, var8 - 12, var11);
                                var11 += 14;
                            }
                            if (var10 == 2) {
                                this.field241[1].method446(448, var8 - 12, var11);
                                var11 += 14;
                            }
                            var3.method257(var11, var9 + ":", var8, 0, 0);
                            int var12 = var11 + var3.method255(var9, 0) + 8;
                            var3.method257(var12, this.field207[var5], var8, 255, 0);
                        }
                        ++var4;
                    }
                    if ((var7 == 3 || var7 == 7) && this.field504 == 0 && (var7 == 7 || this.field419 == 0 || this.field419 == 1 && this.method36(var9, this.field244))) {
                        if (var8 > 0 && var8 < 110) {
                            byte var13 = 4;
                            var3.method257(var13, "From", var8, 0, 0);
                            int var14 = var13 + var3.method255("From ", 0);
                            if (var10 == 1) {
                                this.field241[0].method446(448, var8 - 12, var14);
                                var14 += 14;
                            }
                            if (var10 == 2) {
                                this.field241[1].method446(448, var8 - 12, var14);
                                var14 += 14;
                            }
                            var3.method257(var14, var9 + ":", var8, 0, 0);
                            int var15 = var14 + var3.method255(var9, 0) + 8;
                            var3.method257(var15, this.field207[var5], var8, 8388608, 0);
                        }
                        ++var4;
                    }
                    if (var7 == 4 && (this.field496 == 0 || this.field496 == 1 && this.method36(var9, this.field244))) {
                        if (var8 > 0 && var8 < 110) {
                            var3.method257(4, var9 + " " + this.field207[var5], var8, 8388736, 0);
                        }
                        ++var4;
                    }
                    if (var7 == 5 && this.field504 == 0 && this.field419 < 2) {
                        if (var8 > 0 && var8 < 110) {
                            var3.method257(4, this.field207[var5], var8, 8388608, 0);
                        }
                        ++var4;
                    }
                    if (var7 == 6 && this.field504 == 0 && this.field419 < 2) {
                        if (var8 > 0 && var8 < 110) {
                            var3.method257(4, "To " + var9 + ":", var8, 0, 0);
                            var3.method257(12 + var3.method255("To " + var9, 0), this.field207[var5], var8, 8388608, 0);
                        }
                        ++var4;
                    }
                    if (var7 == 8 && (this.field496 == 0 || this.field496 == 1 && this.method36(var9, this.field244))) {
                        if (var8 > 0 && var8 < 110) {
                            var3.method257(4, var9 + " " + this.field207[var5], var8, 8270336, 0);
                        }
                        ++var4;
                    }
                }
            }
            class53.method517(43417);
            this.field222 = var4 * 14 + 7;
            if (this.field222 < 78) {
                this.field222 = 78;
            }
            this.method39(405, this.field222, this.field222 - this.field256 - 77, 463, 77, 0);
            String var6;
            if (field132 != null && field132.field19 != null) {
                var6 = field132.field19;
            } else {
                var6 = class20.method272(false, this.field103);
            }
            var3.method257(4, var6 + ":", 90, 0, 0);
            var3.method257(6 + var3.method255(var6 + ": ", 0), this.field161 + "*", 90, 255, 0);
            class53.method524(77, 0, 0, 479, -81);
        }
        if (this.field345 && this.field333 == 2) {
            this.method104(true);
        }
        this.field92.method530((byte) 9, 357, 17, super.field964);
        this.field91.method529(false);
        class25.field821 = this.field219;
    }

    @OriginalMember(owner = "client", name = "N", descriptor = "(I)Z")
    public final boolean method145(int arg0) {
        int var2 = 39 / arg0;
        return signlink.wavereplay();
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(Ljava/lang/String;)V")
    private final void method146(String arg0) {
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

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILZNUYRYPY;IZI)V")
    public final void method147(int arg0, class71 arg1, int arg2, boolean arg3, int arg4) {
        this.field321 &= arg3;
        if (this.field414 < 400) {
            if (arg1.field1719 != null) {
                arg1 = arg1.method591(0);
            }
            if (arg1 != null) {
                if (arg1.field1708) {
                    String var6 = arg1.field1727;
                    if (arg1.field1734 != 0) {
                        var6 = var6 + method86(arg1.field1734, 462, field132.field12) + " (level-" + arg1.field1734 + ")";
                    }
                    if (this.field54 == 1) {
                        this.field179[this.field414] = "Use " + this.field58 + " with @yel@" + var6;
                        this.field359[this.field414] = 718;
                        this.field360[this.field414] = arg2;
                        this.field357[this.field414] = arg4;
                        this.field358[this.field414] = arg0;
                        ++this.field414;
                    } else {
                        if (this.field43 == 1) {
                            if ((this.field45 & 2) == 2) {
                                this.field179[this.field414] = this.field46 + " @yel@" + var6;
                                this.field359[this.field414] = 382;
                                this.field360[this.field414] = arg2;
                                this.field357[this.field414] = arg4;
                                this.field358[this.field414] = arg0;
                                ++this.field414;
                                return;
                            }
                        } else {
                            if (arg1.field1720 != null) {
                                for (int var7 = 4; var7 >= 0; --var7) {
                                    if (arg1.field1720[var7] != null && !arg1.field1720[var7].equalsIgnoreCase("attack")) {
                                        this.field179[this.field414] = arg1.field1720[var7] + " @yel@" + var6;
                                        if (var7 == 0) {
                                            this.field359[this.field414] = 747;
                                        }
                                        if (var7 == 1) {
                                            this.field359[this.field414] = 891;
                                        }
                                        if (var7 == 2) {
                                            this.field359[this.field414] = 664;
                                        }
                                        if (var7 == 3) {
                                            this.field359[this.field414] = 746;
                                        }
                                        if (var7 == 4) {
                                            this.field359[this.field414] = 131;
                                        }
                                        this.field360[this.field414] = arg2;
                                        this.field357[this.field414] = arg4;
                                        this.field358[this.field414] = arg0;
                                        ++this.field414;
                                    }
                                }
                            }
                            if (arg1.field1720 != null) {
                                for (int var8 = 4; var8 >= 0; --var8) {
                                    if (arg1.field1720[var8] != null && arg1.field1720[var8].equalsIgnoreCase("attack")) {
                                        short var9 = 0;
                                        if (arg1.field1734 > field132.field12) {
                                            var9 = 2000;
                                        }
                                        this.field179[this.field414] = arg1.field1720[var8] + " @yel@" + var6;
                                        if (var8 == 0) {
                                            this.field359[this.field414] = var9 + 747;
                                        }
                                        if (var8 == 1) {
                                            this.field359[this.field414] = var9 + 891;
                                        }
                                        if (var8 == 2) {
                                            this.field359[this.field414] = var9 + 664;
                                        }
                                        if (var8 == 3) {
                                            this.field359[this.field414] = var9 + 746;
                                        }
                                        if (var8 == 4) {
                                            this.field359[this.field414] = var9 + 131;
                                        }
                                        this.field360[this.field414] = arg2;
                                        this.field357[this.field414] = arg4;
                                        this.field358[this.field414] = arg0;
                                        ++this.field414;
                                    }
                                }
                            }
                            this.field179[this.field414] = "Examine @yel@" + var6;
                            this.field359[this.field414] = 1713;
                            this.field360[this.field414] = arg2;
                            this.field357[this.field414] = arg4;
                            this.field358[this.field414] = arg0;
                            ++this.field414;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(II)Z")
    public final boolean method148(int arg0, int arg1) {
        if (arg0 < 8 || arg0 > 8) {
            this.field123 = -446;
        }
        if (arg1 < 0) {
            return false;
        } else {
            int var3 = this.field359[arg1];
            if (var3 >= 2000) {
                var3 -= 2000;
            }
            return var3 == 394;
        }
    }

    @OriginalMember(owner = "client", name = "O", descriptor = "(I)V")
    public final void method149(int arg0) {
        byte[] var2 = this.field236.method515("title.dat", (byte[]) null);
        class10 var3 = new class10(var2, this);
        this.field463.method529(false);
        var3.method217(false, 0, 0);
        this.field464.method529(false);
        var3.method217(false, -637, 0);
        this.field460.method529(false);
        var3.method217(false, -128, 0);
        this.field461.method529(false);
        var3.method217(false, -202, -371);
        this.field462.method529(false);
        var3.method217(false, -202, -171);
        this.field465.method529(false);
        var3.method217(false, 0, -265);
        this.field466.method529(false);
        var3.method217(false, -562, -265);
        this.field467.method529(false);
        var3.method217(false, -128, -171);
        this.field468.method529(false);
        var3.method217(false, -562, -171);
        int[] var4 = new int[var3.field632];
        for (int var5 = 0; var5 < var3.field633; ++var5) {
            for (int var10 = 0; var10 < var3.field632; ++var10) {
                var4[var10] = var3.field631[var3.field632 * var5 + (var3.field632 - var10 - 1)];
            }
            for (int var11 = 0; var11 < var3.field632; ++var11) {
                var3.field631[var3.field632 * var5 + var11] = var4[var11];
            }
        }
        this.field463.method529(false);
        var3.method217(false, 382, 0);
        this.field464.method529(false);
        var3.method217(false, -255, 0);
        this.field460.method529(false);
        var3.method217(false, 254, 0);
        this.field461.method529(false);
        var3.method217(false, 180, -371);
        if (arg0 >= 6 && arg0 <= 6) {
            this.field462.method529(false);
            var3.method217(false, 180, -171);
            this.field465.method529(false);
            var3.method217(false, 382, -265);
            this.field466.method529(false);
            var3.method217(false, -180, -265);
            this.field467.method529(false);
            var3.method217(false, 254, -171);
            this.field468.method529(false);
            var3.method217(false, -180, -171);
            class10 var6 = new class10(this.field236, "logo", 0);
            this.field460.method529(false);
            var6.method219(448, 18, 382 - var6.field632 / 2 - 128);
            Object var7 = null;
            Object var8 = null;
            Object var9 = null;
            System.gc();
        }
    }

    @OriginalMember(owner = "client", name = "n", descriptor = "(Z)V")
    private final void method150(boolean arg0) {
        if (arg0) {
            this.field267 = this.field449.method387();
        }
        for (class48 var2 = (class48) this.field253.method451(); var2 != null; var2 = (class48) this.field253.method453((byte) 5)) {
            if (var2.field1294 == -1) {
                var2.field1290 = 0;
                this.method82(var2, 17905);
            } else {
                var2.method156();
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(JB)V")
    public final void method151(long arg0, byte arg1) {
        if (arg0 != 0L) {
            if (this.field251 >= 100) {
                this.method131((byte) -32, "", 0, "Your ignore list is full. Max of 100 hit");
            } else {
                String var4 = class20.method272(false, class20.method269(arg0, -898));
                for (int var5 = 0; var5 < this.field251; ++var5) {
                    if (this.field339[var5] == arg0) {
                        this.method131((byte) -32, "", 0, var4 + " is already on your ignore list");
                        return;
                    }
                }
                for (int var6 = 0; var6 < this.field447; ++var6) {
                    if (this.field490[var6] == arg0) {
                        this.method131((byte) -32, "", 0, "Please remove " + var4 + " from your friend list first");
                        return;
                    }
                }
                this.field339[this.field251++] = arg0;
                this.field177 = true;
                this.field329.method391(142, 926);
                this.field329.method398(true, arg0);
                if (arg1 != -93) {
                    this.field209 = 404;
                }
            }
        }
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; ++var1) {
            field176[var1] = var0 - 1;
            var0 += var0;
        }
        field243 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };
        field248 = 507;
        field259 = 603;
        field301 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
        field322 = 7129;
        field409 = 10;
        field411 = true;
        field416 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");
        field425 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };
        field453 = new int[99];
        int var2 = 0;
        for (int var3 = 0; var3 < 99; ++var3) {
            int var4 = var3 + 1;
            int var5 = (int) ((double) var4 + 300.0D * Math.pow(2.0D, (double) var4 / 7.0D));
            var2 += var5;
            field453[var3] = var2 / 4;
        }
    }
}
