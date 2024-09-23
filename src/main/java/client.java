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
public class client extends class45 {

    @OriginalMember(owner = "client", name = "L", descriptor = "[Z")
    private boolean[] field83 = new boolean[5];

    @OriginalMember(owner = "client", name = "N", descriptor = "Z")
    private boolean field85 = false;

    @OriginalMember(owner = "client", name = "X", descriptor = "LXQPFGONL;")
    private class62 field95 = class62.method466((byte) 2, 1);

    @OriginalMember(owner = "client", name = "Y", descriptor = "[LYPWLUGYN;")
    private class66[] field96 = new class66[2];

    @OriginalMember(owner = "client", name = "cb", descriptor = "Z")
    private boolean field100 = false;

    @OriginalMember(owner = "client", name = "db", descriptor = "Z")
    private boolean field101 = false;

    @OriginalMember(owner = "client", name = "fb", descriptor = "[LXSQWUDHM;")
    private class63[] field103 = new class63[4];

    @OriginalMember(owner = "client", name = "jb", descriptor = "Z")
    private boolean field107 = false;

    @OriginalMember(owner = "client", name = "pb", descriptor = "[LYPWLUGYN;")
    private class66[] field113 = new class66[100];

    @OriginalMember(owner = "client", name = "qb", descriptor = "Z")
    private boolean field114 = false;

    @OriginalMember(owner = "client", name = "rb", descriptor = "I")
    private int field115 = 3;

    @OriginalMember(owner = "client", name = "sb", descriptor = "[J")
    private long[] field116 = new long[100];

    @OriginalMember(owner = "client", name = "tb", descriptor = "Z")
    public boolean field117 = true;

    @OriginalMember(owner = "client", name = "vb", descriptor = "[B")
    private byte[] field119 = new byte[16384];

    @OriginalMember(owner = "client", name = "Hb", descriptor = "I")
    private int field131 = 1;

    @OriginalMember(owner = "client", name = "Ib", descriptor = "Z")
    private boolean field132 = false;

    @OriginalMember(owner = "client", name = "Vb", descriptor = "I")
    private int field145 = -1;

    @OriginalMember(owner = "client", name = "Wb", descriptor = "Z")
    private boolean field146 = false;

    @OriginalMember(owner = "client", name = "Xb", descriptor = "[I")
    private int[] field147 = new int[50];

    @OriginalMember(owner = "client", name = "Zb", descriptor = "I")
    private int field149 = 7;

    @OriginalMember(owner = "client", name = "cc", descriptor = "[I")
    private final int[] field152 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client", name = "dc", descriptor = "[LBFUTXOBU;")
    private class4[] field153 = new class4[20];

    @OriginalMember(owner = "client", name = "ec", descriptor = "I")
    private int field154 = 4;

    @OriginalMember(owner = "client", name = "fc", descriptor = "[I")
    private int[] field155 = new int[class8.field80];

    @OriginalMember(owner = "client", name = "jc", descriptor = "B")
    private byte field159 = -104;

    @OriginalMember(owner = "client", name = "lc", descriptor = "Z")
    private boolean field161 = false;

    @OriginalMember(owner = "client", name = "nc", descriptor = "Ljava/lang/String;")
    private String field163 = "";

    @OriginalMember(owner = "client", name = "pc", descriptor = "Z")
    private boolean field165 = true;

    @OriginalMember(owner = "client", name = "zc", descriptor = "Z")
    private boolean field175 = false;

    @OriginalMember(owner = "client", name = "Ac", descriptor = "B")
    private byte field176 = 0;

    @OriginalMember(owner = "client", name = "Cc", descriptor = "Z")
    private boolean field178 = true;

    @OriginalMember(owner = "client", name = "Gc", descriptor = "I")
    private int field182 = -1;

    @OriginalMember(owner = "client", name = "Ic", descriptor = "[I")
    private int[] field184 = new int[151];

    @OriginalMember(owner = "client", name = "Sc", descriptor = "I")
    private int field194 = -1;

    @OriginalMember(owner = "client", name = "Tc", descriptor = "I")
    private int field195 = -13404;

    @OriginalMember(owner = "client", name = "Uc", descriptor = "I")
    private int field196 = 78;

    @OriginalMember(owner = "client", name = "Wc", descriptor = "[[[I")
    private int[][][] field198 = new int[4][13][13];

    @OriginalMember(owner = "client", name = "Zc", descriptor = "I")
    private int field201 = -1;

    @OriginalMember(owner = "client", name = "ed", descriptor = "[LIEGUBMVC;")
    public class25[] field206 = new class25[5];

    @OriginalMember(owner = "client", name = "ld", descriptor = "LXQPFGONL;")
    private class62 field213 = class62.method466((byte) 2, 1);

    @OriginalMember(owner = "client", name = "md", descriptor = "[I")
    private int[] field214 = new int[33];

    @OriginalMember(owner = "client", name = "nd", descriptor = "[Ljava/lang/String;")
    private String[] field215 = new String[500];

    @OriginalMember(owner = "client", name = "od", descriptor = "[[I")
    private int[][] field216 = new int[104][104];

    @OriginalMember(owner = "client", name = "pd", descriptor = "Z")
    private boolean field217 = false;

    @OriginalMember(owner = "client", name = "qd", descriptor = "Z")
    private volatile boolean field218 = false;

    @OriginalMember(owner = "client", name = "rd", descriptor = "[I")
    private int[] field219 = new int[50];

    @OriginalMember(owner = "client", name = "Cd", descriptor = "[I")
    private int[] field230 = new int[7];

    @OriginalMember(owner = "client", name = "Dd", descriptor = "[I")
    private int[] field231 = new int[5];

    @OriginalMember(owner = "client", name = "Id", descriptor = "Z")
    private boolean field236 = true;

    @OriginalMember(owner = "client", name = "Jd", descriptor = "Z")
    private boolean field237 = false;

    @OriginalMember(owner = "client", name = "Kd", descriptor = "[I")
    private int[] field238 = new int[100];

    @OriginalMember(owner = "client", name = "Ld", descriptor = "[Ljava/lang/String;")
    private String[] field239 = new String[100];

    @OriginalMember(owner = "client", name = "Md", descriptor = "[Ljava/lang/String;")
    private String[] field240 = new String[100];

    @OriginalMember(owner = "client", name = "Od", descriptor = "[I")
    private int[] field242 = new int[200];

    @OriginalMember(owner = "client", name = "Qd", descriptor = "Z")
    private boolean field244 = true;

    @OriginalMember(owner = "client", name = "Sd", descriptor = "[I")
    private int[] field246 = new int[5];

    @OriginalMember(owner = "client", name = "Td", descriptor = "Ljava/lang/String;")
    private String field247 = "";

    @OriginalMember(owner = "client", name = "Vd", descriptor = "Z")
    private boolean field249 = false;

    @OriginalMember(owner = "client", name = "Wd", descriptor = "Z")
    private boolean field250 = false;

    @OriginalMember(owner = "client", name = "Xd", descriptor = "LXQPFGONL;")
    private class62 field251 = class62.method466((byte) 2, 1);

    @OriginalMember(owner = "client", name = "Yd", descriptor = "I")
    private int field252 = -20;

    @OriginalMember(owner = "client", name = "le", descriptor = "I")
    private int field265 = 5063219;

    @OriginalMember(owner = "client", name = "oe", descriptor = "I")
    private int field268 = -1;

    @OriginalMember(owner = "client", name = "pe", descriptor = "I")
    private int field269 = 939;

    @OriginalMember(owner = "client", name = "qe", descriptor = "I")
    private int field270 = -1;

    @OriginalMember(owner = "client", name = "re", descriptor = "I")
    private int field271 = -1;

    @OriginalMember(owner = "client", name = "se", descriptor = "[J")
    private long[] field272 = new long[200];

    @OriginalMember(owner = "client", name = "te", descriptor = "B")
    private byte field273 = 4;

    @OriginalMember(owner = "client", name = "ue", descriptor = "I")
    private int field274 = 1;

    @OriginalMember(owner = "client", name = "we", descriptor = "I")
    private int field276 = 1;

    @OriginalMember(owner = "client", name = "ze", descriptor = "[I")
    private int[] field279 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client", name = "Be", descriptor = "I")
    private int field281 = 50;

    @OriginalMember(owner = "client", name = "Ce", descriptor = "[I")
    private int[] field282 = new int[this.field281];

    @OriginalMember(owner = "client", name = "De", descriptor = "[I")
    private int[] field283 = new int[this.field281];

    @OriginalMember(owner = "client", name = "Ee", descriptor = "[I")
    private int[] field284 = new int[this.field281];

    @OriginalMember(owner = "client", name = "Fe", descriptor = "[I")
    private int[] field285 = new int[this.field281];

    @OriginalMember(owner = "client", name = "Ge", descriptor = "[I")
    private int[] field286 = new int[this.field281];

    @OriginalMember(owner = "client", name = "He", descriptor = "[I")
    private int[] field287 = new int[this.field281];

    @OriginalMember(owner = "client", name = "Ie", descriptor = "[I")
    private int[] field288 = new int[this.field281];

    @OriginalMember(owner = "client", name = "Je", descriptor = "[Ljava/lang/String;")
    private String[] field289 = new String[this.field281];

    @OriginalMember(owner = "client", name = "Te", descriptor = "Z")
    private boolean field299 = true;

    @OriginalMember(owner = "client", name = "Ve", descriptor = "I")
    private int field301 = -1;

    @OriginalMember(owner = "client", name = "cf", descriptor = "Ljava/lang/String;")
    private String field308 = "";

    @OriginalMember(owner = "client", name = "df", descriptor = "B")
    private byte field309 = -125;

    @OriginalMember(owner = "client", name = "ef", descriptor = "Z")
    private boolean field310 = false;

    @OriginalMember(owner = "client", name = "ff", descriptor = "[[I")
    private int[][] field311 = new int[104][104];

    @OriginalMember(owner = "client", name = "gf", descriptor = "LFOKYUBQV;")
    private class16 field312 = new class16(false);

    @OriginalMember(owner = "client", name = "hf", descriptor = "I")
    private int field313 = -8221;

    @OriginalMember(owner = "client", name = "jf", descriptor = "[I")
    private int[] field314 = new int[50];

    @OriginalMember(owner = "client", name = "lf", descriptor = "[I")
    private int[] field316 = new int[33];

    @OriginalMember(owner = "client", name = "of", descriptor = "[I")
    private int[] field319 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client", name = "pf", descriptor = "I")
    private int field320 = -1;

    @OriginalMember(owner = "client", name = "qf", descriptor = "I")
    private int field321 = -1;

    @OriginalMember(owner = "client", name = "rf", descriptor = "I")
    private int field322 = -1;

    @OriginalMember(owner = "client", name = "yf", descriptor = "I")
    private int field329 = 2;

    @OriginalMember(owner = "client", name = "Af", descriptor = "Z")
    private boolean field331 = false;

    @OriginalMember(owner = "client", name = "Cf", descriptor = "[I")
    private int[] field333 = new int[9];

    @OriginalMember(owner = "client", name = "Df", descriptor = "Z")
    private boolean field334 = true;

    @OriginalMember(owner = "client", name = "Ef", descriptor = "Ljava/lang/String;")
    private String field335 = "";

    @OriginalMember(owner = "client", name = "Ff", descriptor = "Ljava/lang/String;")
    private String field336 = "";

    @OriginalMember(owner = "client", name = "Lf", descriptor = "I")
    private int field342 = -1;

    @OriginalMember(owner = "client", name = "Mf", descriptor = "I")
    private int field343 = 835;

    @OriginalMember(owner = "client", name = "Nf", descriptor = "Z")
    private boolean field344 = true;

    @OriginalMember(owner = "client", name = "Pf", descriptor = "I")
    private int field346 = 2;

    @OriginalMember(owner = "client", name = "Qf", descriptor = "Z")
    private boolean field347 = false;

    @OriginalMember(owner = "client", name = "Wf", descriptor = "Z")
    public boolean field353 = false;

    @OriginalMember(owner = "client", name = "Xf", descriptor = "[LBFUTXOBU;")
    private class4[] field354 = new class4[8];

    @OriginalMember(owner = "client", name = "Zf", descriptor = "[I")
    private int[] field356 = new int[class8.field80];

    @OriginalMember(owner = "client", name = "ag", descriptor = "[I")
    private int[] field357 = new int[5];

    @OriginalMember(owner = "client", name = "cg", descriptor = "[I")
    private int[] field359 = new int[2000];

    @OriginalMember(owner = "client", name = "gg", descriptor = "[[I")
    private int[][] field363 = new int[104][104];

    @OriginalMember(owner = "client", name = "hg", descriptor = "[LYPWLUGYN;")
    private class66[] field364 = new class66[13];

    @OriginalMember(owner = "client", name = "ig", descriptor = "Z")
    private boolean field365 = false;

    @OriginalMember(owner = "client", name = "kg", descriptor = "LFOKYUBQV;")
    private class16 field367 = new class16(false);

    @OriginalMember(owner = "client", name = "pg", descriptor = "Z")
    private boolean field372 = false;

    @OriginalMember(owner = "client", name = "rg", descriptor = "[I")
    public int[] field374 = new int[2000];

    @OriginalMember(owner = "client", name = "tg", descriptor = "[[[LFOKYUBQV;")
    private class16[][][] field376 = new class16[4][104][104];

    @OriginalMember(owner = "client", name = "ug", descriptor = "I")
    private int field377 = 706;

    @OriginalMember(owner = "client", name = "Dg", descriptor = "B")
    private byte field386 = 4;

    @OriginalMember(owner = "client", name = "Fg", descriptor = "Z")
    private boolean field388 = false;

    @OriginalMember(owner = "client", name = "Hg", descriptor = "I")
    private int field390 = 2;

    @OriginalMember(owner = "client", name = "Ig", descriptor = "[LBFUTXOBU;")
    private class4[] field391 = new class4[1000];

    @OriginalMember(owner = "client", name = "Kg", descriptor = "[I")
    private int[] field393 = new int[5];

    @OriginalMember(owner = "client", name = "Mg", descriptor = "I")
    private int field395 = -1;

    @OriginalMember(owner = "client", name = "Ng", descriptor = "Z")
    private boolean field396 = true;

    @OriginalMember(owner = "client", name = "Tg", descriptor = "I")
    private int field402 = -822;

    @OriginalMember(owner = "client", name = "Ug", descriptor = "[I")
    private int[] field403 = new int[500];

    @OriginalMember(owner = "client", name = "Vg", descriptor = "[I")
    private int[] field404 = new int[500];

    @OriginalMember(owner = "client", name = "Wg", descriptor = "[I")
    private int[] field405 = new int[500];

    @OriginalMember(owner = "client", name = "Xg", descriptor = "[I")
    private int[] field406 = new int[500];

    @OriginalMember(owner = "client", name = "Yg", descriptor = "Z")
    private boolean field407 = false;

    @OriginalMember(owner = "client", name = "bh", descriptor = "I")
    private int field410 = -266;

    @OriginalMember(owner = "client", name = "ch", descriptor = "[I")
    private int[] field411 = new int[151];

    @OriginalMember(owner = "client", name = "eh", descriptor = "[LBFUTXOBU;")
    private class4[] field413 = new class4[20];

    @OriginalMember(owner = "client", name = "fh", descriptor = "I")
    private int field414 = 8;

    @OriginalMember(owner = "client", name = "gh", descriptor = "LFOKYUBQV;")
    private class16 field415 = new class16(false);

    @OriginalMember(owner = "client", name = "jh", descriptor = "I")
    private int field418 = 2048;

    @OriginalMember(owner = "client", name = "kh", descriptor = "I")
    private int field419 = 2047;

    @OriginalMember(owner = "client", name = "lh", descriptor = "[LTKIWGAGO;")
    private class54[] field420 = new class54[this.field418];

    @OriginalMember(owner = "client", name = "nh", descriptor = "[I")
    public int[] field422 = new int[this.field418];

    @OriginalMember(owner = "client", name = "ph", descriptor = "[I")
    private int[] field424 = new int[this.field418];

    @OriginalMember(owner = "client", name = "qh", descriptor = "[LXQPFGONL;")
    private class62[] field425 = new class62[this.field418];

    @OriginalMember(owner = "client", name = "rh", descriptor = "Z")
    private boolean field426 = false;

    @OriginalMember(owner = "client", name = "th", descriptor = "B")
    private byte field428 = -43;

    @OriginalMember(owner = "client", name = "wh", descriptor = "[Ljava/lang/String;")
    private String[] field431 = new String[200];

    @OriginalMember(owner = "client", name = "xh", descriptor = "I")
    private int field432 = 3353893;

    @OriginalMember(owner = "client", name = "Ah", descriptor = "B")
    private byte field435 = -106;

    @OriginalMember(owner = "client", name = "Lh", descriptor = "I")
    private int field446 = -281;

    @OriginalMember(owner = "client", name = "Mh", descriptor = "I")
    private int field447 = -1;

    @OriginalMember(owner = "client", name = "Rh", descriptor = "I")
    private int field452 = 4;

    @OriginalMember(owner = "client", name = "Sh", descriptor = "I")
    private int field453 = 2301979;

    @OriginalMember(owner = "client", name = "Uh", descriptor = "I")
    private int field455 = -443;

    @OriginalMember(owner = "client", name = "Vh", descriptor = "I")
    private int field456 = -906;

    @OriginalMember(owner = "client", name = "bi", descriptor = "[I")
    private int[] field462 = new int[1000];

    @OriginalMember(owner = "client", name = "ci", descriptor = "[I")
    private int[] field463 = new int[1000];

    @OriginalMember(owner = "client", name = "ei", descriptor = "Z")
    private boolean field465 = true;

    @OriginalMember(owner = "client", name = "fi", descriptor = "[I")
    private int[] field466 = new int[5];

    @OriginalMember(owner = "client", name = "gi", descriptor = "I")
    private int field467 = -515;

    @OriginalMember(owner = "client", name = "ii", descriptor = "Z")
    private volatile boolean field469 = false;

    @OriginalMember(owner = "client", name = "mi", descriptor = "Ljava/lang/String;")
    private String field473 = "";

    @OriginalMember(owner = "client", name = "ni", descriptor = "B")
    private byte field474 = 1;

    @OriginalMember(owner = "client", name = "ti", descriptor = "Z")
    private boolean field480 = true;

    @OriginalMember(owner = "client", name = "vi", descriptor = "[Ljava/lang/String;")
    private String[] field482 = new String[5];

    @OriginalMember(owner = "client", name = "wi", descriptor = "[Z")
    private boolean[] field483 = new boolean[5];

    @OriginalMember(owner = "client", name = "xi", descriptor = "[I")
    private int[] field484 = new int[4000];

    @OriginalMember(owner = "client", name = "yi", descriptor = "[I")
    private int[] field485 = new int[4000];

    @OriginalMember(owner = "client", name = "zi", descriptor = "I")
    private int field486 = 128;

    @OriginalMember(owner = "client", name = "Di", descriptor = "LKFCZNNDM;")
    private class34 field490 = new class34();

    @OriginalMember(owner = "client", name = "Ni", descriptor = "B")
    private byte field500 = 6;

    @OriginalMember(owner = "client", name = "Oi", descriptor = "Z")
    private volatile boolean field501 = false;

    @OriginalMember(owner = "client", name = "Pi", descriptor = "I")
    private final int field502 = 100;

    @OriginalMember(owner = "client", name = "Qi", descriptor = "[I")
    private int[] field503 = new int[100];

    @OriginalMember(owner = "client", name = "Ri", descriptor = "Z")
    private boolean field504 = false;

    @OriginalMember(owner = "client", name = "Si", descriptor = "Z")
    private boolean field505 = true;

    @OriginalMember(owner = "client", name = "Ti", descriptor = "[I")
    private int[] field506 = new int[class8.field80];

    @OriginalMember(owner = "client", name = "Ui", descriptor = "Z")
    private boolean field507 = false;

    @OriginalMember(owner = "client", name = "Vi", descriptor = "Z")
    private boolean field508 = true;

    @OriginalMember(owner = "client", name = "cj", descriptor = "I")
    private int field515 = 7759444;

    @OriginalMember(owner = "client", name = "dj", descriptor = "Z")
    private boolean field516 = false;

    @OriginalMember(owner = "client", name = "nj", descriptor = "LXQPFGONL;")
    private class62 field526 = new class62(new byte[5000], 49938);

    @OriginalMember(owner = "client", name = "oj", descriptor = "[LAHIOLHWV;")
    private class1[] field527 = new class1[16384];

    @OriginalMember(owner = "client", name = "qj", descriptor = "[I")
    public int[] field529 = new int[16384];

    @OriginalMember(owner = "client", name = "uj", descriptor = "Ljava/lang/String;")
    private String field533 = "";

    @OriginalMember(owner = "client", name = "vj", descriptor = "[LBFUTXOBU;")
    private class4[] field534 = new class4[100];

    @OriginalMember(owner = "client", name = "Bj", descriptor = "[I")
    public int[] field540 = new int[1000];

    @OriginalMember(owner = "client", name = "Cj", descriptor = "Ljava/util/zip/CRC32;")
    private CRC32 field541 = new CRC32();

    @OriginalMember(owner = "client", name = "Ej", descriptor = "Z")
    private boolean field543 = false;

    @OriginalMember(owner = "client", name = "Fj", descriptor = "B")
    private byte field544 = 9;

    @OriginalMember(owner = "client", name = "Ij", descriptor = "[I")
    private int[] field547 = new int[256];

    @OriginalMember(owner = "client", name = "Qj", descriptor = "Ljava/lang/String;")
    private String field555 = "";

    @OriginalMember(owner = "client", name = "Rj", descriptor = "Ljava/lang/String;")
    private String field556 = "";

    @OriginalMember(owner = "client", name = "Fb", descriptor = "I")
    private static int field129 = 718;

    @OriginalMember(owner = "client", name = "Fc", descriptor = "Z")
    private static boolean field181 = true;

    @OriginalMember(owner = "client", name = "Vc", descriptor = "[I")
    public static int[] field197 = new int[32];

    @OriginalMember(owner = "client", name = "Ed", descriptor = "I")
    private static int field232;

    @OriginalMember(owner = "client", name = "Gd", descriptor = "Z")
    private static boolean field234;

    @OriginalMember(owner = "client", name = "Rd", descriptor = "Ljava/math/BigInteger;")
    private static BigInteger field245;

    @OriginalMember(owner = "client", name = "mf", descriptor = "Ljava/lang/String;")
    private static String field317;

    @OriginalMember(owner = "client", name = "Bf", descriptor = "[I")
    private static int[] field332;

    @OriginalMember(owner = "client", name = "wg", descriptor = "I")
    private static int field379;

    @OriginalMember(owner = "client", name = "Lg", descriptor = "Ljava/math/BigInteger;")
    private static BigInteger field394;

    @OriginalMember(owner = "client", name = "Zg", descriptor = "[[I")
    public static final int[][] field408;

    @OriginalMember(owner = "client", name = "zh", descriptor = "[I")
    public static final int[] field434;

    @OriginalMember(owner = "client", name = "Qh", descriptor = "B")
    private static byte field451;

    @OriginalMember(owner = "client", name = "eb", descriptor = "I")
    private int field102;

    @OriginalMember(owner = "client", name = "gb", descriptor = "I")
    private int field104;

    @OriginalMember(owner = "client", name = "hb", descriptor = "I")
    private int field105;

    @OriginalMember(owner = "client", name = "ib", descriptor = "I")
    private int field106;

    @OriginalMember(owner = "client", name = "kb", descriptor = "I")
    private int field108;

    @OriginalMember(owner = "client", name = "lb", descriptor = "I")
    private int field109;

    @OriginalMember(owner = "client", name = "mb", descriptor = "I")
    private int field110;

    @OriginalMember(owner = "client", name = "nb", descriptor = "I")
    private int field111;

    @OriginalMember(owner = "client", name = "ob", descriptor = "I")
    private int field112;

    @OriginalMember(owner = "client", name = "ub", descriptor = "I")
    private int field118;

    @OriginalMember(owner = "client", name = "wb", descriptor = "I")
    private int field120;

    @OriginalMember(owner = "client", name = "xb", descriptor = "I")
    private int field121;

    @OriginalMember(owner = "client", name = "yb", descriptor = "I")
    private int field122;

    @OriginalMember(owner = "client", name = "zb", descriptor = "I")
    private int field123;

    @OriginalMember(owner = "client", name = "Ab", descriptor = "I")
    private int field124;

    @OriginalMember(owner = "client", name = "Bb", descriptor = "I")
    private int field125;

    @OriginalMember(owner = "client", name = "Cb", descriptor = "I")
    private int field126;

    @OriginalMember(owner = "client", name = "Db", descriptor = "I")
    private int field127;

    @OriginalMember(owner = "client", name = "Eb", descriptor = "I")
    private int field128;

    @OriginalMember(owner = "client", name = "Gb", descriptor = "I")
    private int field130;

    @OriginalMember(owner = "client", name = "Nb", descriptor = "I")
    private int field137;

    @OriginalMember(owner = "client", name = "Ob", descriptor = "I")
    private int field138;

    @OriginalMember(owner = "client", name = "Pb", descriptor = "I")
    private int field139;

    @OriginalMember(owner = "client", name = "Qb", descriptor = "I")
    private int field140;

    @OriginalMember(owner = "client", name = "Rb", descriptor = "I")
    private int field141;

    @OriginalMember(owner = "client", name = "Yb", descriptor = "I")
    private int field148;

    @OriginalMember(owner = "client", name = "ac", descriptor = "I")
    private int field150;

    @OriginalMember(owner = "client", name = "bc", descriptor = "I")
    private int field151;

    @OriginalMember(owner = "client", name = "gc", descriptor = "I")
    private int field156;

    @OriginalMember(owner = "client", name = "hc", descriptor = "I")
    private int field157;

    @OriginalMember(owner = "client", name = "ic", descriptor = "I")
    private static int field158;

    @OriginalMember(owner = "client", name = "kc", descriptor = "I")
    private static int field160;

    @OriginalMember(owner = "client", name = "mc", descriptor = "I")
    private int field162;

    @OriginalMember(owner = "client", name = "oc", descriptor = "I")
    private int field164;

    @OriginalMember(owner = "client", name = "uc", descriptor = "I")
    private static int field170;

    @OriginalMember(owner = "client", name = "vc", descriptor = "I")
    private int field171;

    @OriginalMember(owner = "client", name = "Ec", descriptor = "I")
    private int field180;

    @OriginalMember(owner = "client", name = "Xc", descriptor = "I")
    private int field199;

    @OriginalMember(owner = "client", name = "Yc", descriptor = "I")
    private static int field200;

    @OriginalMember(owner = "client", name = "ad", descriptor = "I")
    private int field202;

    @OriginalMember(owner = "client", name = "bd", descriptor = "I")
    private int field203;

    @OriginalMember(owner = "client", name = "cd", descriptor = "I")
    private static int field204;

    @OriginalMember(owner = "client", name = "dd", descriptor = "I")
    private int field205;

    @OriginalMember(owner = "client", name = "sd", descriptor = "I")
    private int field220;

    @OriginalMember(owner = "client", name = "td", descriptor = "I")
    private int field221;

    @OriginalMember(owner = "client", name = "ud", descriptor = "I")
    private int field222;

    @OriginalMember(owner = "client", name = "vd", descriptor = "I")
    private int field223;

    @OriginalMember(owner = "client", name = "wd", descriptor = "I")
    private int field224;

    @OriginalMember(owner = "client", name = "xd", descriptor = "I")
    private int field225;

    @OriginalMember(owner = "client", name = "yd", descriptor = "I")
    private int field226;

    @OriginalMember(owner = "client", name = "zd", descriptor = "I")
    private int field227;

    @OriginalMember(owner = "client", name = "Ad", descriptor = "I")
    private static int field228;

    @OriginalMember(owner = "client", name = "Fd", descriptor = "I")
    public static int field233;

    @OriginalMember(owner = "client", name = "Nd", descriptor = "I")
    private int field241;

    @OriginalMember(owner = "client", name = "Pd", descriptor = "I")
    private static int field243;

    @OriginalMember(owner = "client", name = "Ud", descriptor = "I")
    private int field248;

    @OriginalMember(owner = "client", name = "ce", descriptor = "I")
    private int field256;

    @OriginalMember(owner = "client", name = "de", descriptor = "I")
    private int field257;

    @OriginalMember(owner = "client", name = "ee", descriptor = "I")
    private int field258;

    @OriginalMember(owner = "client", name = "ge", descriptor = "I")
    private int field260;

    @OriginalMember(owner = "client", name = "he", descriptor = "I")
    private int field261;

    @OriginalMember(owner = "client", name = "ie", descriptor = "I")
    private int field262;

    @OriginalMember(owner = "client", name = "je", descriptor = "I")
    private int field263;

    @OriginalMember(owner = "client", name = "me", descriptor = "I")
    private int field266;

    @OriginalMember(owner = "client", name = "ne", descriptor = "I")
    private int field267;

    @OriginalMember(owner = "client", name = "ve", descriptor = "I")
    private int field275;

    @OriginalMember(owner = "client", name = "xe", descriptor = "I")
    private int field277;

    @OriginalMember(owner = "client", name = "ye", descriptor = "I")
    private int field278;

    @OriginalMember(owner = "client", name = "Ae", descriptor = "I")
    private int field280;

    @OriginalMember(owner = "client", name = "Ke", descriptor = "I")
    private int field290;

    @OriginalMember(owner = "client", name = "Le", descriptor = "I")
    private int field291;

    @OriginalMember(owner = "client", name = "Me", descriptor = "I")
    private int field292;

    @OriginalMember(owner = "client", name = "Ne", descriptor = "I")
    private int field293;

    @OriginalMember(owner = "client", name = "Oe", descriptor = "I")
    private int field294;

    @OriginalMember(owner = "client", name = "Pe", descriptor = "I")
    private int field295;

    @OriginalMember(owner = "client", name = "Qe", descriptor = "I")
    private int field296;

    @OriginalMember(owner = "client", name = "Se", descriptor = "I")
    private int field298;

    @OriginalMember(owner = "client", name = "Ue", descriptor = "I")
    private int field300;

    @OriginalMember(owner = "client", name = "We", descriptor = "I")
    private int field302;

    @OriginalMember(owner = "client", name = "nf", descriptor = "I")
    private int field318;

    @OriginalMember(owner = "client", name = "sf", descriptor = "I")
    private int field323;

    @OriginalMember(owner = "client", name = "uf", descriptor = "I")
    private int field325;

    @OriginalMember(owner = "client", name = "wf", descriptor = "I")
    private int field327;

    @OriginalMember(owner = "client", name = "xf", descriptor = "I")
    private int field328;

    @OriginalMember(owner = "client", name = "zf", descriptor = "I")
    public static int field330;

    @OriginalMember(owner = "client", name = "Gf", descriptor = "I")
    private int field337;

    @OriginalMember(owner = "client", name = "Hf", descriptor = "I")
    private int field338;

    @OriginalMember(owner = "client", name = "If", descriptor = "I")
    private int field339;

    @OriginalMember(owner = "client", name = "Jf", descriptor = "I")
    private int field340;

    @OriginalMember(owner = "client", name = "Kf", descriptor = "I")
    private int field341;

    @OriginalMember(owner = "client", name = "Of", descriptor = "I")
    private int field345;

    @OriginalMember(owner = "client", name = "Rf", descriptor = "I")
    private int field348;

    @OriginalMember(owner = "client", name = "Sf", descriptor = "I")
    private int field349;

    @OriginalMember(owner = "client", name = "Tf", descriptor = "I")
    private int field350;

    @OriginalMember(owner = "client", name = "Uf", descriptor = "I")
    private int field351;

    @OriginalMember(owner = "client", name = "Vf", descriptor = "I")
    private int field352;

    @OriginalMember(owner = "client", name = "Yf", descriptor = "I")
    private static int field355;

    @OriginalMember(owner = "client", name = "dg", descriptor = "I")
    private int field360;

    @OriginalMember(owner = "client", name = "eg", descriptor = "I")
    private int field361;

    @OriginalMember(owner = "client", name = "fg", descriptor = "I")
    private static int field362;

    @OriginalMember(owner = "client", name = "jg", descriptor = "I")
    private int field366;

    @OriginalMember(owner = "client", name = "lg", descriptor = "I")
    private int field368;

    @OriginalMember(owner = "client", name = "mg", descriptor = "I")
    private int field369;

    @OriginalMember(owner = "client", name = "qg", descriptor = "I")
    private int field373;

    @OriginalMember(owner = "client", name = "sg", descriptor = "I")
    private int field375;

    @OriginalMember(owner = "client", name = "vg", descriptor = "I")
    private static int field378;

    @OriginalMember(owner = "client", name = "xg", descriptor = "I")
    private int field380;

    @OriginalMember(owner = "client", name = "yg", descriptor = "I")
    private int field381;

    @OriginalMember(owner = "client", name = "zg", descriptor = "I")
    private int field382;

    @OriginalMember(owner = "client", name = "Ag", descriptor = "I")
    private int field383;

    @OriginalMember(owner = "client", name = "Bg", descriptor = "I")
    private int field384;

    @OriginalMember(owner = "client", name = "Cg", descriptor = "I")
    private int field385;

    @OriginalMember(owner = "client", name = "Eg", descriptor = "I")
    private int field387;

    @OriginalMember(owner = "client", name = "Gg", descriptor = "I")
    private int field389;

    @OriginalMember(owner = "client", name = "Og", descriptor = "I")
    private int field397;

    @OriginalMember(owner = "client", name = "Pg", descriptor = "I")
    private int field398;

    @OriginalMember(owner = "client", name = "Qg", descriptor = "I")
    private int field399;

    @OriginalMember(owner = "client", name = "Rg", descriptor = "I")
    private int field400;

    @OriginalMember(owner = "client", name = "Sg", descriptor = "I")
    private int field401;

    @OriginalMember(owner = "client", name = "dh", descriptor = "I")
    private int field412;

    @OriginalMember(owner = "client", name = "hh", descriptor = "I")
    private static int field416;

    @OriginalMember(owner = "client", name = "ih", descriptor = "I")
    private int field417;

    @OriginalMember(owner = "client", name = "mh", descriptor = "I")
    private int field421;

    @OriginalMember(owner = "client", name = "oh", descriptor = "I")
    private int field423;

    @OriginalMember(owner = "client", name = "uh", descriptor = "I")
    public int field429;

    @OriginalMember(owner = "client", name = "vh", descriptor = "I")
    public int field430;

    @OriginalMember(owner = "client", name = "yh", descriptor = "I")
    private int field433;

    @OriginalMember(owner = "client", name = "Bh", descriptor = "I")
    private static int field436;

    @OriginalMember(owner = "client", name = "Wh", descriptor = "I")
    private static int field457;

    @OriginalMember(owner = "client", name = "Xh", descriptor = "I")
    private int field458;

    @OriginalMember(owner = "client", name = "Yh", descriptor = "I")
    private int field459;

    @OriginalMember(owner = "client", name = "ai", descriptor = "I")
    private int field461;

    @OriginalMember(owner = "client", name = "di", descriptor = "I")
    private static int field464;

    @OriginalMember(owner = "client", name = "hi", descriptor = "I")
    private int field468;

    @OriginalMember(owner = "client", name = "ji", descriptor = "I")
    private int field470;

    @OriginalMember(owner = "client", name = "ki", descriptor = "I")
    private int field471;

    @OriginalMember(owner = "client", name = "li", descriptor = "I")
    private int field472;

    @OriginalMember(owner = "client", name = "ui", descriptor = "I")
    private int field481;

    @OriginalMember(owner = "client", name = "Ai", descriptor = "I")
    private int field487;

    @OriginalMember(owner = "client", name = "Bi", descriptor = "I")
    private int field488;

    @OriginalMember(owner = "client", name = "Ci", descriptor = "I")
    private int field489;

    @OriginalMember(owner = "client", name = "Ei", descriptor = "I")
    private int field491;

    @OriginalMember(owner = "client", name = "Ki", descriptor = "I")
    private static int field497;

    @OriginalMember(owner = "client", name = "Li", descriptor = "I")
    private int field498;

    @OriginalMember(owner = "client", name = "Mi", descriptor = "I")
    private static int field499;

    @OriginalMember(owner = "client", name = "Xi", descriptor = "I")
    private int field510;

    @OriginalMember(owner = "client", name = "hj", descriptor = "I")
    public static int field520;

    @OriginalMember(owner = "client", name = "mj", descriptor = "I")
    private int field525;

    @OriginalMember(owner = "client", name = "pj", descriptor = "I")
    private int field528;

    @OriginalMember(owner = "client", name = "tj", descriptor = "I")
    private int field532;

    @OriginalMember(owner = "client", name = "yj", descriptor = "I")
    public int field537;

    @OriginalMember(owner = "client", name = "zj", descriptor = "I")
    private int field538;

    @OriginalMember(owner = "client", name = "Aj", descriptor = "I")
    private int field539;

    @OriginalMember(owner = "client", name = "Dj", descriptor = "I")
    private int field542;

    @OriginalMember(owner = "client", name = "Gj", descriptor = "I")
    private int field545;

    @OriginalMember(owner = "client", name = "Hj", descriptor = "I")
    private int field546;

    @OriginalMember(owner = "client", name = "Mj", descriptor = "I")
    private int field551;

    @OriginalMember(owner = "client", name = "Nj", descriptor = "I")
    private int field552;

    @OriginalMember(owner = "client", name = "Oj", descriptor = "I")
    private int field553;

    @OriginalMember(owner = "client", name = "Pj", descriptor = "I")
    private static int field554;

    @OriginalMember(owner = "client", name = "Sj", descriptor = "I")
    public static int field557;

    @OriginalMember(owner = "client", name = "O", descriptor = "I")
    private int field86;

    @OriginalMember(owner = "client", name = "P", descriptor = "I")
    private int field87;

    @OriginalMember(owner = "client", name = "Q", descriptor = "I")
    private int field88;

    @OriginalMember(owner = "client", name = "W", descriptor = "I")
    private int field94;

    @OriginalMember(owner = "client", name = "ab", descriptor = "I")
    private int field98;

    @OriginalMember(owner = "client", name = "Mb", descriptor = "J")
    private long field136;

    @OriginalMember(owner = "client", name = "qc", descriptor = "J")
    public long field166;

    @OriginalMember(owner = "client", name = "Zd", descriptor = "J")
    private long field253;

    @OriginalMember(owner = "client", name = "Jg", descriptor = "J")
    private long field392;

    @OriginalMember(owner = "client", name = "wj", descriptor = "J")
    private long field535;

    @OriginalMember(owner = "client", name = "xc", descriptor = "LLLYASRTI;")
    private class37 field173;

    @OriginalMember(owner = "client", name = "Yi", descriptor = "LNSKCCMMO;")
    private class44 field511;

    @OriginalMember(owner = "client", name = "Zi", descriptor = "LNSKCCMMO;")
    private class44 field512;

    @OriginalMember(owner = "client", name = "aj", descriptor = "LNSKCCMMO;")
    private class44 field513;

    @OriginalMember(owner = "client", name = "bj", descriptor = "LNSKCCMMO;")
    private class44 field514;

    @OriginalMember(owner = "client", name = "Jc", descriptor = "LSBWJLPSR;")
    private class48 field185;

    @OriginalMember(owner = "client", name = "Kc", descriptor = "LSBWJLPSR;")
    private class48 field186;

    @OriginalMember(owner = "client", name = "Lc", descriptor = "LSBWJLPSR;")
    private class48 field187;

    @OriginalMember(owner = "client", name = "Mc", descriptor = "LSBWJLPSR;")
    private class48 field188;

    @OriginalMember(owner = "client", name = "Nc", descriptor = "LSBWJLPSR;")
    private class48 field189;

    @OriginalMember(owner = "client", name = "Oc", descriptor = "LSBWJLPSR;")
    private class48 field190;

    @OriginalMember(owner = "client", name = "Pc", descriptor = "LSBWJLPSR;")
    private class48 field191;

    @OriginalMember(owner = "client", name = "Qc", descriptor = "LSBWJLPSR;")
    private class48 field192;

    @OriginalMember(owner = "client", name = "Rc", descriptor = "LSBWJLPSR;")
    private class48 field193;

    @OriginalMember(owner = "client", name = "Ch", descriptor = "LSBWJLPSR;")
    private class48 field437;

    @OriginalMember(owner = "client", name = "Dh", descriptor = "LSBWJLPSR;")
    private class48 field438;

    @OriginalMember(owner = "client", name = "Eh", descriptor = "LSBWJLPSR;")
    private class48 field439;

    @OriginalMember(owner = "client", name = "Fh", descriptor = "LSBWJLPSR;")
    private class48 field440;

    @OriginalMember(owner = "client", name = "Gh", descriptor = "LSBWJLPSR;")
    private class48 field441;

    @OriginalMember(owner = "client", name = "Hh", descriptor = "LSBWJLPSR;")
    private class48 field442;

    @OriginalMember(owner = "client", name = "Ih", descriptor = "LSBWJLPSR;")
    private class48 field443;

    @OriginalMember(owner = "client", name = "Jh", descriptor = "LSBWJLPSR;")
    private class48 field444;

    @OriginalMember(owner = "client", name = "Kh", descriptor = "LSBWJLPSR;")
    private class48 field445;

    @OriginalMember(owner = "client", name = "Nh", descriptor = "LSBWJLPSR;")
    private class48 field448;

    @OriginalMember(owner = "client", name = "Oh", descriptor = "LSBWJLPSR;")
    private class48 field449;

    @OriginalMember(owner = "client", name = "Ph", descriptor = "LSBWJLPSR;")
    private class48 field450;

    @OriginalMember(owner = "client", name = "ij", descriptor = "LSBWJLPSR;")
    private class48 field521;

    @OriginalMember(owner = "client", name = "jj", descriptor = "LSBWJLPSR;")
    private class48 field522;

    @OriginalMember(owner = "client", name = "kj", descriptor = "LSBWJLPSR;")
    private class48 field523;

    @OriginalMember(owner = "client", name = "lj", descriptor = "LSBWJLPSR;")
    private class48 field524;

    @OriginalMember(owner = "client", name = "Jb", descriptor = "LBFUTXOBU;")
    private class4 field133;

    @OriginalMember(owner = "client", name = "Kb", descriptor = "LBFUTXOBU;")
    private class4 field134;

    @OriginalMember(owner = "client", name = "wc", descriptor = "LBFUTXOBU;")
    private class4 field172;

    @OriginalMember(owner = "client", name = "Dc", descriptor = "LBFUTXOBU;")
    private class4 field179;

    @OriginalMember(owner = "client", name = "Re", descriptor = "LBFUTXOBU;")
    private class4 field297;

    @OriginalMember(owner = "client", name = "ng", descriptor = "LBFUTXOBU;")
    private class4 field370;

    @OriginalMember(owner = "client", name = "og", descriptor = "LBFUTXOBU;")
    private class4 field371;

    @OriginalMember(owner = "client", name = "Fi", descriptor = "LBFUTXOBU;")
    private class4 field492;

    @OriginalMember(owner = "client", name = "Gi", descriptor = "LBFUTXOBU;")
    private class4 field493;

    @OriginalMember(owner = "client", name = "Hi", descriptor = "LBFUTXOBU;")
    private class4 field494;

    @OriginalMember(owner = "client", name = "Ii", descriptor = "LBFUTXOBU;")
    private class4 field495;

    @OriginalMember(owner = "client", name = "Ji", descriptor = "LBFUTXOBU;")
    private class4 field496;

    @OriginalMember(owner = "client", name = "rj", descriptor = "LBFUTXOBU;")
    private class4 field530;

    @OriginalMember(owner = "client", name = "sj", descriptor = "LBFUTXOBU;")
    private class4 field531;

    @OriginalMember(owner = "client", name = "yc", descriptor = "LTKIWGAGO;")
    public static class54 field174;

    @OriginalMember(owner = "client", name = "Hc", descriptor = "LUWFCTTCD;")
    public class55 field183;

    @OriginalMember(owner = "client", name = "tf", descriptor = "LWNPVPVVL;")
    private class58 field324;

    @OriginalMember(owner = "client", name = "Th", descriptor = "LXLANGUSV;")
    private class59 field454;

    @OriginalMember(owner = "client", name = "sh", descriptor = "LXMRRKSSB;")
    private class60 field427;

    @OriginalMember(owner = "client", name = "fd", descriptor = "LYPWLUGYN;")
    private class66 field207;

    @OriginalMember(owner = "client", name = "gd", descriptor = "LYPWLUGYN;")
    private class66 field208;

    @OriginalMember(owner = "client", name = "Xe", descriptor = "LYPWLUGYN;")
    private class66 field303;

    @OriginalMember(owner = "client", name = "Ye", descriptor = "LYPWLUGYN;")
    private class66 field304;

    @OriginalMember(owner = "client", name = "Ze", descriptor = "LYPWLUGYN;")
    private class66 field305;

    @OriginalMember(owner = "client", name = "af", descriptor = "LYPWLUGYN;")
    private class66 field306;

    @OriginalMember(owner = "client", name = "bf", descriptor = "LYPWLUGYN;")
    private class66 field307;

    @OriginalMember(owner = "client", name = "oi", descriptor = "LYPWLUGYN;")
    private class66 field475;

    @OriginalMember(owner = "client", name = "pi", descriptor = "LYPWLUGYN;")
    private class66 field476;

    @OriginalMember(owner = "client", name = "qi", descriptor = "LYPWLUGYN;")
    private class66 field477;

    @OriginalMember(owner = "client", name = "ri", descriptor = "LYPWLUGYN;")
    private class66 field478;

    @OriginalMember(owner = "client", name = "si", descriptor = "LYPWLUGYN;")
    private class66 field479;

    @OriginalMember(owner = "client", name = "ej", descriptor = "LYPWLUGYN;")
    private class66 field517;

    @OriginalMember(owner = "client", name = "fj", descriptor = "LYPWLUGYN;")
    private class66 field518;

    @OriginalMember(owner = "client", name = "gj", descriptor = "LYPWLUGYN;")
    private class66 field519;

    @OriginalMember(owner = "client", name = "Jj", descriptor = "LYPWLUGYN;")
    private class66 field548;

    @OriginalMember(owner = "client", name = "Kj", descriptor = "LYPWLUGYN;")
    private class66 field549;

    @OriginalMember(owner = "client", name = "R", descriptor = "LYPWLUGYN;")
    private class66 field89;

    @OriginalMember(owner = "client", name = "S", descriptor = "LYPWLUGYN;")
    private class66 field90;

    @OriginalMember(owner = "client", name = "T", descriptor = "LYPWLUGYN;")
    private class66 field91;

    @OriginalMember(owner = "client", name = "ah", descriptor = "LZCHENGKI;")
    private class71 field409;

    @OriginalMember(owner = "client", name = "Bd", descriptor = "Ljava/lang/String;")
    private String field229;

    @OriginalMember(owner = "client", name = "fe", descriptor = "Ljava/lang/String;")
    public String field259;

    @OriginalMember(owner = "client", name = "ke", descriptor = "Ljava/lang/String;")
    public String field264;

    @OriginalMember(owner = "client", name = "bb", descriptor = "Ljava/lang/String;")
    private String field99;

    @OriginalMember(owner = "client", name = "Wi", descriptor = "Ljava/net/Socket;")
    private Socket field509;

    @OriginalMember(owner = "client", name = "Bc", descriptor = "Z")
    public static boolean field177;

    @OriginalMember(owner = "client", name = "Hd", descriptor = "Z")
    private static boolean field235;

    @OriginalMember(owner = "client", name = "kf", descriptor = "Z")
    public static boolean field315;

    @OriginalMember(owner = "client", name = "bg", descriptor = "Z")
    private static boolean field358;

    @OriginalMember(owner = "client", name = "xj", descriptor = "Z")
    private static boolean field536;

    @OriginalMember(owner = "client", name = "Lj", descriptor = "Z")
    private static boolean field550;

    @OriginalMember(owner = "client", name = "Sb", descriptor = "[I")
    private int[] field142;

    @OriginalMember(owner = "client", name = "Tb", descriptor = "[I")
    private int[] field143;

    @OriginalMember(owner = "client", name = "Ub", descriptor = "[I")
    private int[] field144;

    @OriginalMember(owner = "client", name = "rc", descriptor = "[I")
    private int[] field167;

    @OriginalMember(owner = "client", name = "sc", descriptor = "[I")
    private int[] field168;

    @OriginalMember(owner = "client", name = "tc", descriptor = "[I")
    private int[] field169;

    @OriginalMember(owner = "client", name = "hd", descriptor = "[I")
    private int[] field209;

    @OriginalMember(owner = "client", name = "id", descriptor = "[I")
    private int[] field210;

    @OriginalMember(owner = "client", name = "jd", descriptor = "[I")
    private int[] field211;

    @OriginalMember(owner = "client", name = "kd", descriptor = "[I")
    private int[] field212;

    @OriginalMember(owner = "client", name = "ae", descriptor = "[I")
    private int[] field254;

    @OriginalMember(owner = "client", name = "be", descriptor = "[I")
    private int[] field255;

    @OriginalMember(owner = "client", name = "U", descriptor = "[I")
    private int[] field92;

    @OriginalMember(owner = "client", name = "V", descriptor = "[I")
    private int[] field93;

    @OriginalMember(owner = "client", name = "vf", descriptor = "[LYPWLUGYN;")
    private class66[] field326;

    @OriginalMember(owner = "client", name = "Lb", descriptor = "[[B")
    private byte[][] field135;

    @OriginalMember(owner = "client", name = "Z", descriptor = "[[B")
    private byte[][] field97;

    @OriginalMember(owner = "client", name = "Zh", descriptor = "[[[B")
    private byte[][][] field460;

    @OriginalMember(owner = "client", name = "M", descriptor = "[[[I")
    private int[][][] field84;

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZZ[B)V")
    public final void method32(boolean arg0, boolean arg1, byte[] arg2) {
        signlink.midifade = arg1 ? 1 : 0;
        signlink.midisave(arg2, arg2.length);
        this.field353 &= arg0;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LXQPFGONL;II)V")
    private final void method33(class62 arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field423; ++var4) {
            int var6 = this.field424[var4];
            class1 var7 = this.field527[var6];
            int var8 = arg0.method478();
            if ((var8 & 2) != 0) {
                var7.field597 = arg0.method504(-195);
                var7.field598 = arg0.method480();
            }
            if ((var8 & 128) != 0) {
                var7.field584 = arg0.method485();
                var7.field602 = 100;
            }
            if ((var8 & 32) != 0) {
                var7.field5 = class19.method210(arg0.method480());
                var7.field615 = var7.field5.field768;
                var7.field637 = var7.field5.field776;
                var7.field593 = var7.field5.field766;
                var7.field594 = var7.field5.field780;
                var7.field595 = var7.field5.field775;
                var7.field596 = var7.field5.field783;
                var7.field616 = var7.field5.field778;
            }
            if ((var8 & 64) != 0) {
                var7.field632 = arg0.method504(-195);
                int var9 = arg0.method483();
                var7.field636 = var9 >> 16;
                var7.field635 = (var9 & 65535) + field330;
                var7.field633 = 0;
                var7.field634 = 0;
                if (var7.field635 > field330) {
                    var7.field633 = -1;
                }
                if (var7.field632 == 65535) {
                    var7.field632 = -1;
                }
            }
            if ((var8 & 4) != 0) {
                int var10 = arg0.method498(false);
                int var11 = arg0.method498(false);
                var7.method181(var11, field330, var10, (byte) 2);
                var7.field581 = field330 + 300;
                var7.field582 = arg0.method498(false);
                var7.field583 = arg0.method496(221);
            }
            if ((var8 & 8) != 0) {
                var7.field591 = arg0.method480();
                if (var7.field591 == 65535) {
                    var7.field591 = -1;
                }
            }
            if ((var8 & 1) != 0) {
                int var12 = arg0.method504(-195);
                if (var12 == 65535) {
                    var12 = -1;
                }
                int var13 = arg0.method478();
                if (var7.field607 == var12 && var12 != -1) {
                    int var14 = class24.field813[var12].field827;
                    if (var14 == 1) {
                        var7.field608 = 0;
                        var7.field609 = 0;
                        var7.field610 = var13;
                        var7.field611 = 0;
                    }
                    if (var14 == 2) {
                        var7.field611 = 0;
                    }
                } else if (var12 == -1 || var7.field607 == -1 || class24.field813[var12].field821 >= class24.field813[var7.field607].field821) {
                    var7.field607 = var12;
                    var7.field608 = 0;
                    var7.field609 = 0;
                    var7.field610 = var13;
                    var7.field611 = 0;
                    var7.field585 = var7.field618;
                }
            }
            if ((var8 & 16) != 0) {
                int var15 = arg0.method498(false);
                int var16 = arg0.method496(221);
                var7.method181(var16, field330, var15, (byte) 2);
                var7.field581 = field330 + 300;
                var7.field582 = arg0.method498(false);
                var7.field583 = arg0.method498(false);
            }
        }
        if (arg1 < 0 || arg1 > 0) {
            for (int var5 = 1; var5 > 0; ++var5) {
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IILXQPFGONL;)V")
    public final void method34(int arg0, int arg1, class62 arg2) {
        if (arg1 < this.field452 || arg1 > this.field452) {
            this.field213.method468(176);
        }
        if (arg0 == 36) {
            int var4 = arg2.method478();
            int var5 = (var4 >> 4 & 7) + this.field368;
            int var6 = (var4 & 7) + this.field369;
            int var7 = arg2.method498(false);
            int var8 = var7 >> 2;
            int var9 = var7 & 3;
            int var10 = this.field152[var8];
            if (var5 >= 0 && var6 >= 0 && var5 < 104 && var6 < 104) {
                this.method42(var9, var10, var6, this.field164, 188, var8, var5, -1, 0, -1);
            }
        } else if (arg0 == 172) {
            int var11 = arg2.method478();
            int var12 = (var11 >> 4 & 7) + this.field368;
            int var13 = (var11 & 7) + this.field369;
            int var14 = var12 + arg2.method479();
            int var15 = var13 + arg2.method479();
            int var16 = arg2.method481();
            int var17 = arg2.method480();
            int var18 = arg2.method478() * 4;
            int var19 = arg2.method478() * 4;
            int var20 = arg2.method480();
            int var21 = arg2.method480();
            int var22 = arg2.method478();
            int var23 = arg2.method478();
            if (var12 >= 0 && var13 >= 0 && var12 < 104 && var13 < 104 && var14 >= 0 && var15 >= 0 && var14 < 104 && var15 < 104 && var17 != 65535) {
                int var24 = var12 * 128 + 64;
                int var25 = var13 * 128 + 64;
                int var26 = var14 * 128 + 64;
                int var27 = var15 * 128 + 64;
                class67 var28 = new class67(var22, var19, var23, var17, this.method65(var25, this.field164, false, var24) - var18, field330 + var21, this.field164, var25, var24, var16, (byte) 0, field330 + var20);
                var28.method535(var27, var26, true, this.method65(var27, this.field164, false, var26) - var19, field330 + var20);
                this.field415.method196(var28);
            }
        } else if (arg0 == 41) {
            int var29 = arg2.method478();
            int var30 = (var29 >> 4 & 7) + this.field368;
            int var31 = (var29 & 7) + this.field369;
            int var32 = arg2.method480();
            int var33 = arg2.method478();
            int var34 = arg2.method480();
            if (var30 >= 0 && var31 >= 0 && var30 < 104 && var31 < 104) {
                int var35 = var30 * 128 + 64;
                int var36 = var31 * 128 + 64;
                class43 var37 = new class43(var36, var32, var35, 0, this.field164, field330, var34, this.method65(var36, this.field164, false, var35) - var33);
                this.field312.method196(var37);
            }
        } else if (arg0 == 156) {
            int var38 = arg2.method496(221);
            int var39 = (var38 >> 4 & 7) + this.field368;
            int var40 = (var38 & 7) + this.field369;
            int var41 = arg2.method504(-195);
            int var42 = arg2.method496(221);
            int var43 = var42 >> 2;
            int var44 = var42 & 3;
            int var45 = this.field152[var43];
            if (var39 >= 0 && var40 >= 0 && var39 < 104 && var40 < 104) {
                this.method42(var44, var45, var40, this.field164, 188, var43, var39, var41, 0, -1);
            }
        } else if (arg0 == 0) {
            int var46 = arg2.method478();
            int var47 = (var46 >> 4 & 7) + this.field368;
            int var48 = (var46 & 7) + this.field369;
            int var49 = arg2.method480();
            int var50 = arg2.method480();
            int var51 = arg2.method480();
            if (var47 >= 0 && var48 >= 0 && var47 < 104 && var48 < 104) {
                class16 var52 = this.field376[this.field164][var47][var48];
                if (var52 != null) {
                    for (class42 var53 = (class42) var52.method199(); var53 != null; var53 = (class42) var52.method201(467)) {
                        if ((var49 & 32767) == var53.field1137 && var53.field1138 == var50) {
                            var53.field1138 = var51;
                            break;
                        }
                    }
                    this.method156(var47, var48);
                }
            }
        } else {
            if (arg0 == 101) {
                int var54 = arg2.method478();
                int var55 = (var54 >> 4 & 7) + this.field368;
                int var56 = (var54 & 7) + this.field369;
                int var57 = arg2.method480();
                int var58 = arg2.method478();
                int var59 = var58 >> 4 & 15;
                int var60 = var58 & 7;
                if (field174.field619[0] >= var55 - var59 && field174.field619[0] <= var55 + var59 && field174.field620[0] >= var56 - var59 && field174.field620[0] <= var56 + var59 && this.field508 && !field235 && this.field360 < 50) {
                    this.field314[this.field360] = var57;
                    this.field147[this.field360] = var60;
                    this.field219[this.field360] = class9.field560[var57];
                    ++this.field360;
                }
            }
            if (arg0 == 81) {
                int var61 = arg2.method506((byte) 56);
                int var62 = arg2.method497(8);
                int var63 = (var62 >> 4 & 7) + this.field368;
                int var64 = (var62 & 7) + this.field369;
                int var65 = arg2.method504(-195);
                if (var63 >= 0 && var64 >= 0 && var63 < 104 && var64 < 104) {
                    class42 var66 = new class42();
                    var66.field1137 = var65;
                    var66.field1138 = var61;
                    if (this.field376[this.field164][var63][var64] == null) {
                        this.field376[this.field164][var63][var64] = new class16(false);
                    }
                    this.field376[this.field164][var63][var64].method196(var66);
                    this.method156(var63, var64);
                }
            } else if (arg0 == 180) {
                int var67 = arg2.method506((byte) 56);
                int var68 = arg2.method496(221);
                int var69 = (var68 >> 4 & 7) + this.field368;
                int var70 = (var68 & 7) + this.field369;
                if (var69 >= 0 && var70 >= 0 && var69 < 104 && var70 < 104) {
                    class16 var71 = this.field376[this.field164][var69][var70];
                    if (var71 != null) {
                        for (class42 var72 = (class42) var71.method199(); var72 != null; var72 = (class42) var71.method201(467)) {
                            if ((var67 & 32767) == var72.field1137) {
                                var72.method195();
                                break;
                            }
                        }
                        if (var71.method199() == null) {
                            this.field376[this.field164][var69][var70] = null;
                        }
                        this.method156(var69, var70);
                    }
                }
            } else if (arg0 == 252) {
                int var73 = arg2.method498(false);
                int var74 = (var73 >> 4 & 7) + this.field368;
                int var75 = (var73 & 7) + this.field369;
                int var76 = arg2.method480();
                int var77 = arg2.method498(false);
                int var78 = var77 >> 2;
                int var79 = var77 & 3;
                int var80 = this.field152[var78];
                if (var74 >= 0 && var75 >= 0 && var74 < 103 && var75 < 103) {
                    int var81 = this.field84[this.field164][var74][var75];
                    int var82 = this.field84[this.field164][var74 + 1][var75];
                    int var83 = this.field84[this.field164][var74 + 1][var75 + 1];
                    int var84 = this.field84[this.field164][var74][var75 + 1];
                    if (var80 == 0) {
                        class6 var85 = this.field409.method561(var74, this.field164, var75, 496);
                        if (var85 != null) {
                            int var86 = var85.field66 >> 14 & 32767;
                            if (var78 == 2) {
                                var85.field64 = new class26(var82, var79 + 4, var81, -23440, false, var86, 2, var83, var84, var76);
                                var85.field65 = new class26(var82, var79 + 1 & 3, var81, -23440, false, var86, 2, var83, var84, var76);
                            } else {
                                var85.field64 = new class26(var82, var79, var81, -23440, false, var86, var78, var83, var84, var76);
                            }
                        }
                    }
                    if (var80 == 1) {
                        class33 var87 = this.field409.method562(var75, var74, (byte) 103, this.field164);
                        if (var87 != null) {
                            var87.field993 = new class26(var82, 0, var81, -23440, false, var87.field994 >> 14 & 32767, 4, var83, var84, var76);
                        }
                    }
                    if (var80 == 2) {
                        class52 var88 = this.field409.method563(var74, false, this.field164, var75);
                        if (var78 == 11) {
                            var78 = 10;
                        }
                        if (var88 != null) {
                            var88.field1329 = new class26(var82, var79, var81, -23440, false, var88.field1337 >> 14 & 32767, var78, var83, var84, var76);
                        }
                    }
                    if (var80 == 3) {
                        class29 var89 = this.field409.method564(var74, this.field164, (byte) -120, var75);
                        if (var89 != null) {
                            var89.field947 = new class26(var82, var79, var81, -23440, false, var89.field948 >> 14 & 32767, 22, var83, var84, var76);
                        }
                    }
                }
            } else if (arg0 == 84) {
                int var90 = arg2.method480();
                int var91 = arg2.method480();
                int var92 = arg2.method496(221);
                int var93 = (var92 >> 4 & 7) + this.field368;
                int var94 = (var92 & 7) + this.field369;
                int var95 = arg2.method505(-623);
                if (var93 >= 0 && var94 >= 0 && var93 < 104 && var94 < 104 && this.field301 != var95) {
                    class42 var96 = new class42();
                    var96.field1137 = var91;
                    var96.field1138 = var90;
                    if (this.field376[this.field164][var93][var94] == null) {
                        this.field376[this.field164][var93][var94] = new class16(false);
                    }
                    this.field376[this.field164][var93][var94].method196(var96);
                    this.method156(var93, var94);
                }
            } else {
                if (arg0 == 229) {
                    byte var97 = arg2.method500(356);
                    byte var98 = arg2.method499(-875);
                    byte var99 = arg2.method479();
                    int var100 = arg2.method505(-623);
                    int var101 = arg2.method496(221);
                    int var102 = (var101 >> 4 & 7) + this.field368;
                    int var103 = (var101 & 7) + this.field369;
                    int var104 = arg2.method504(-195);
                    int var105 = arg2.method478();
                    int var106 = var105 >> 2;
                    int var107 = var105 & 3;
                    int var108 = this.field152[var106];
                    int var109 = arg2.method504(-195);
                    byte var110 = arg2.method500(356);
                    int var111 = arg2.method505(-623);
                    class54 var112;
                    if (this.field301 == var100) {
                        var112 = field174;
                    } else {
                        var112 = this.field420[var100];
                    }
                    if (var112 != null) {
                        class13 var113 = class13.method194(var109);
                        int var114 = this.field84[this.field164][var102][var103];
                        int var115 = this.field84[this.field164][var102 + 1][var103];
                        int var116 = this.field84[this.field164][var102 + 1][var103 + 1];
                        int var117 = this.field84[this.field164][var102][var103 + 1];
                        class27 var118 = var113.method191(var106, var107, var114, var115, var116, var117, -1);
                        if (var118 != null) {
                            this.method42(0, var108, var103, this.field164, 188, 0, var102, -1, var104 + 1, var111 + 1);
                            var112.field1371 = field330 + var104;
                            var112.field1372 = field330 + var111;
                            var112.field1367 = var118;
                            int var119 = var113.field676;
                            int var120 = var113.field642;
                            if (var107 == 1 || var107 == 3) {
                                var119 = var113.field642;
                                var120 = var113.field676;
                            }
                            var112.field1364 = var102 * 128 + var119 * 64;
                            var112.field1366 = var103 * 128 + var120 * 64;
                            var112.field1365 = this.method65(var112.field1366, this.field164, false, var112.field1364);
                            if (var99 > var98) {
                                byte var121 = var99;
                                var99 = var98;
                                var98 = var121;
                            }
                            if (var110 > var97) {
                                byte var122 = var110;
                                var110 = var97;
                                var97 = var122;
                            }
                            var112.field1348 = var99 + var102;
                            var112.field1350 = var98 + var102;
                            var112.field1349 = var103 + var110;
                            var112.field1351 = var97 + var103;
                            return;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IILBFUTXOBU;I)V")
    public final void method35(int arg0, int arg1, class4 arg2, int arg3) {
        int var5 = arg1 * arg1 + arg3 * arg3;
        if (arg0 >= 0) {
            this.field244 = !this.field244;
        }
        if (var5 > 4225 && var5 < 90000) {
            int var6 = this.field487 + this.field328 & 2047;
            int var7 = class27.field926[var6];
            int var8 = class27.field927[var6];
            int var9 = var7 * 256 / (this.field130 + 256);
            int var10 = var8 * 256 / (this.field130 + 256);
            int var11 = arg1 * var9 + arg3 * var10 >> 16;
            int var12 = arg1 * var10 - arg3 * var9 >> 16;
            double var13 = Math.atan2((double) var11, (double) var12);
            int var15 = (int) (Math.sin(var13) * 63.0D);
            int var16 = (int) (Math.cos(var13) * 57.0D);
            this.field179.method18(354, var15 + 94 + 4 - 10, 20, var13, 256, 20, 15, 15, 83 - var16 - 20);
        } else {
            this.method151((byte) 3, arg1, arg3, arg2);
        }
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(I)Ljava/net/Socket;")
    public final Socket method36(int arg0) throws IOException {
        return signlink.mainapp != null ? signlink.opensocket(arg0) : new Socket(InetAddress.getByName(this.getCodeBase().getHost()), arg0);
    }

    @OriginalMember(owner = "client", name = "h", descriptor = "(I)V")
    public final void method37(int arg0) {
        if (arg0 >= 0) {
            this.field121 = this.field251.method478();
        }
        int var2 = 5;
        this.field333[8] = 0;
        int var3 = 0;
        while (this.field333[8] == 0) {
            String var4 = "Unknown problem";
            this.method163(field358, 20, "Connecting to web server");
            try {
                DataInputStream var5 = this.method159("crc" + (int) (Math.random() * 9.9999999E7D) + "-" + 313);
                class62 var6 = new class62(new byte[40], 49938);
                var5.readFully(var6.field1541, 0, 40);
                var5.close();
                for (int var7 = 0; var7 < 9; ++var7) {
                    this.field333[var7] = var6.method483();
                }
                int var8 = var6.method483();
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
                        this.method163(field358, 10, "Game updated - please reload page");
                        var11 = 10;
                    } else {
                        this.method163(field358, 10, var4 + " - Will retry in " + var11 + " secs.");
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
                this.field101 = !this.field101;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILKFCZNNDM;)Z")
    public final boolean method38(int arg0, class34 arg1) {
        if (arg0 >= 6 && arg0 <= 6) {
            int var3 = arg1.field1027;
            if (this.field459 == 2) {
                if (var3 == 201) {
                    this.field100 = true;
                    this.field471 = 0;
                    this.field516 = true;
                    this.field247 = "";
                    this.field366 = 1;
                    this.field163 = "Enter name of friend to add to list";
                }
                if (var3 == 202) {
                    this.field100 = true;
                    this.field471 = 0;
                    this.field516 = true;
                    this.field247 = "";
                    this.field366 = 2;
                    this.field163 = "Enter name of friend to delete from list";
                }
            }
            if (var3 == 205) {
                this.field124 = 250;
                return true;
            } else {
                if (var3 == 501) {
                    this.field100 = true;
                    this.field471 = 0;
                    this.field516 = true;
                    this.field247 = "";
                    this.field366 = 4;
                    this.field163 = "Enter name of player to add to list";
                }
                if (var3 == 502) {
                    this.field100 = true;
                    this.field471 = 0;
                    this.field516 = true;
                    this.field247 = "";
                    this.field366 = 5;
                    this.field163 = "Enter name of player to delete from list";
                }
                if (var3 >= 300 && var3 <= 313) {
                    int var4 = (var3 - 300) / 2;
                    int var5 = var3 & 1;
                    int var6 = this.field230[var4];
                    if (var6 != -1) {
                        while (true) {
                            if (var5 == 0) {
                                --var6;
                                if (var6 < 0) {
                                    var6 = class5.field51 - 1;
                                }
                            }
                            if (var5 == 1) {
                                ++var6;
                                if (var6 >= class5.field51) {
                                    var6 = 0;
                                }
                            }
                            if (!class5.field52[var6].field58 && class5.field52[var6].field53 == var4 + (this.field396 ? 0 : 7)) {
                                this.field230[var4] = var6;
                                this.field250 = true;
                                break;
                            }
                        }
                    }
                }
                if (var3 >= 314 && var3 <= 323) {
                    int var7 = (var3 - 314) / 2;
                    int var8 = var3 & 1;
                    int var9 = this.field231[var7];
                    if (var8 == 0) {
                        --var9;
                        if (var9 < 0) {
                            var9 = field408[var7].length - 1;
                        }
                    }
                    if (var8 == 1) {
                        ++var9;
                        if (var9 >= field408[var7].length) {
                            var9 = 0;
                        }
                    }
                    this.field231[var7] = var9;
                    this.field250 = true;
                }
                if (var3 == 324 && !this.field396) {
                    this.field396 = true;
                    this.method40(this.field505);
                }
                if (var3 == 325 && this.field396) {
                    this.field396 = false;
                    this.method40(this.field505);
                }
                if (var3 != 326) {
                    if (var3 == 613) {
                        this.field114 = !this.field114;
                    }
                    if (var3 >= 601 && var3 <= 612) {
                        this.method97(-171);
                        if (this.field308.length() > 0) {
                            this.field213.method467(63, 832);
                            this.field213.method474(class20.method214(this.field308), (byte) 6);
                            this.field213.method468(var3 - 601);
                            this.field213.method468(this.field114 ? 1 : 0);
                        }
                    }
                    return false;
                } else {
                    this.field213.method467(94, 832);
                    this.field213.method468(this.field396 ? 0 : 1);
                    for (int var10 = 0; var10 < 7; ++var10) {
                        this.field213.method468(this.field230[var10]);
                    }
                    for (int var11 = 0; var11 < 5; ++var11) {
                        this.field213.method468(this.field231[var11]);
                    }
                    return true;
                }
            }
        } else {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "client", name = "i", descriptor = "(I)V")
    public final void method39(int arg0) {
        if (this.field124 > 0) {
            this.method121(this.field178);
        } else {
            this.field523.method394(false);
            this.field512.method370("Connection lost", 257, false, 0, 144);
            int var2 = 3 / arg0;
            this.field512.method370("Connection lost", 256, false, 16777215, 143);
            this.field512.method370("Please wait - attempting to reestablish", 257, false, 0, 159);
            this.field512.method370("Please wait - attempting to reestablish", 256, false, 16777215, 158);
            this.field523.method395(-30874, super.field1179, 4, 4);
            this.field171 = 0;
            this.field295 = 0;
            class37 var3 = this.field173;
            this.field353 = false;
            this.field318 = 0;
            this.method154(this.field555, this.field556, true);
            if (!this.field353) {
                this.method121(this.field178);
            }
            try {
                var3.method351();
            } catch (Exception var4) {
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(Z)V")
    public final void method40(boolean arg0) {
        this.field250 = true;
        for (int var2 = 0; var2 < 7; ++var2) {
            this.field230[var2] = -1;
            for (int var4 = 0; var4 < class5.field51; ++var4) {
                if (!class5.field52[var4].field58 && class5.field52[var4].field53 == var2 + (this.field396 ? 0 : 7)) {
                    this.field230[var2] = var4;
                    break;
                }
            }
        }
        if (!arg0) {
            for (int var3 = 1; var3 > 0; ++var3) {
            }
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(Z)V")
    public final void method41(boolean arg0) {
        this.field353 &= arg0;
        this.field218 = true;
        try {
            long var2 = System.currentTimeMillis();
            int var4 = 0;
            int var5 = 20;
            while (this.field469) {
                ++this.field87;
                this.method66(true);
                this.method66(true);
                this.method107(48890);
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
        this.field218 = false;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIIIIIII)V")
    private final void method42(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        class72 var11 = null;
        for (class72 var12 = (class72) this.field367.method199(); var12 != null; var12 = (class72) this.field367.method201(467)) {
            if (var12.field1721 == arg3 && var12.field1723 == arg6 && var12.field1724 == arg2 && var12.field1722 == arg1) {
                var11 = var12;
                break;
            }
        }
        if (var11 == null) {
            var11 = new class72();
            var11.field1721 = arg3;
            var11.field1722 = arg1;
            var11.field1723 = arg6;
            var11.field1724 = arg2;
            this.method131(var11, (byte) 4);
            this.field367.method196(var11);
        }
        var11.field1717 = arg7;
        var11.field1719 = arg5;
        var11.field1718 = arg0;
        var11.field1716 = arg8;
        var11.field1720 = arg9;
        if (arg4 <= 0) {
            this.field213.method468(174);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(JI)V")
    public final void method43(long arg0, int arg1) {
        if (arg0 != 0L) {
            for (int var4 = 0; var4 < this.field458; ++var4) {
                if (this.field272[var4] == arg0) {
                    --this.field458;
                    this.field504 = true;
                    for (int var5 = var4; var5 < this.field458; ++var5) {
                        this.field431[var5] = this.field431[var5 + 1];
                        this.field242[var5] = this.field242[var5 + 1];
                        this.field272[var5] = this.field272[var5 + 1];
                    }
                    this.field213.method467(37, 832);
                    this.field213.method474(arg0, (byte) 6);
                    break;
                }
            }
            this.field120 += arg1;
        }
    }

    @OriginalMember(owner = "client", name = "run", descriptor = "()V")
    public final void run() {
        if (this.field501) {
            this.method41(true);
        } else {
            super.run();
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "()V")
    public final void method44() {
        this.method163(field358, 20, "Starting up");
        if (signlink.sunjava) {
            super.field1173 = 5;
        }
        if (field536) {
            this.field175 = true;
        } else {
            field536 = true;
            boolean var1 = false;
            String var2 = this.method165(7);
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
                this.field331 = true;
            } else {
                if (signlink.cache_dat != null) {
                    for (int var3 = 0; var3 < 5; ++var3) {
                        this.field206[var3] = new class25(signlink.cache_idx[var3], signlink.cache_dat, false, var3 + 1, 500000);
                    }
                }
                try {
                    this.method37(-494);
                    this.field427 = this.method120(true, "title", 25, "title screen", this.field333[1], 1);
                    this.field511 = new class44("p11_full", false, this.field427, 0);
                    this.field512 = new class44("p12_full", false, this.field427, 0);
                    this.field513 = new class44("b12_full", false, this.field427, 0);
                    this.field514 = new class44("q8_full", true, this.field427, 0);
                    this.method172(630);
                    this.method106(false);
                    class60 var4 = this.method120(true, "config", 30, "config", this.field333[2], 2);
                    class60 var5 = this.method120(true, "interface", 35, "interface", this.field333[3], 3);
                    class60 var6 = this.method120(true, "media", 40, "2d graphics", this.field333[4], 4);
                    class60 var7 = this.method120(true, "textures", 45, "textures", this.field333[6], 6);
                    class60 var8 = this.method120(true, "wordenc", 50, "chat system", this.field333[7], 7);
                    class60 var9 = this.method120(true, "sounds", 55, "sound effects", this.field333[8], 8);
                    this.field460 = new byte[4][104][104];
                    this.field84 = new int[4][105][105];
                    this.field409 = new class71(field181, this.field84, 4, 104, 104);
                    for (int var10 = 0; var10 < 4; ++var10) {
                        this.field103[var10] = new class63((byte) 1, 104, 104);
                    }
                    this.field297 = new class4(512, 512);
                    class60 var11 = this.method120(true, "versionlist", 60, "update list", this.field333[5], 5);
                    this.method163(field358, 60, "Connecting to update server");
                    this.field324 = new class58();
                    this.field324.method442(var11, this);
                    class49.method397(this.field324.method443((byte) 3));
                    class27.method235(this.field324.method439(0, (byte) 4), this.field324);
                    if (!field235) {
                        this.field298 = 0;
                        try {
                            this.field298 = Integer.parseInt(this.getParameter("music"));
                        } catch (Exception var70) {
                        }
                        this.field299 = true;
                        this.field324.method451(2, this.field298);
                        while (this.field324.method456() > 0) {
                            this.method52(-24437);
                            try {
                                Thread.sleep(100L);
                            } catch (Exception var69) {
                            }
                            if (this.field324.field1459 > 3) {
                                this.method138("ondemand");
                                return;
                            }
                        }
                    }
                    this.method163(field358, 65, "Requesting animations");
                    int var12 = this.field324.method439(1, (byte) 4);
                    for (int var13 = 0; var13 < var12; ++var13) {
                        this.field324.method451(1, var13);
                    }
                    while (this.field324.method456() > 0) {
                        int var14 = var12 - this.field324.method456();
                        if (var14 > 0) {
                            this.method163(field358, 65, "Loading animations - " + var14 * 100 / var12 + "%");
                        }
                        this.method52(-24437);
                        try {
                            Thread.sleep(100L);
                        } catch (Exception var68) {
                        }
                        if (this.field324.field1459 > 3) {
                            this.method138("ondemand");
                            return;
                        }
                    }
                    this.method163(field358, 70, "Requesting models");
                    int var15 = this.field324.method439(0, (byte) 4);
                    for (int var16 = 0; var16 < var15; ++var16) {
                        int var17 = this.field324.method458(var16, 7);
                        if ((var17 & 1) != 0) {
                            this.field324.method451(0, var16);
                        }
                    }
                    int var18 = this.field324.method456();
                    while (this.field324.method456() > 0) {
                        int var19 = var18 - this.field324.method456();
                        if (var19 > 0) {
                            this.method163(field358, 70, "Loading models - " + var19 * 100 / var18 + "%");
                        }
                        this.method52(-24437);
                        try {
                            Thread.sleep(100L);
                        } catch (Exception var67) {
                        }
                    }
                    if (this.field206[0] != null) {
                        this.method163(field358, 75, "Requesting maps");
                        this.field324.method451(3, this.field324.method449(47, 0, 48, 0));
                        this.field324.method451(3, this.field324.method449(47, 1, 48, 0));
                        this.field324.method451(3, this.field324.method449(48, 0, 48, 0));
                        this.field324.method451(3, this.field324.method449(48, 1, 48, 0));
                        this.field324.method451(3, this.field324.method449(49, 0, 48, 0));
                        this.field324.method451(3, this.field324.method449(49, 1, 48, 0));
                        this.field324.method451(3, this.field324.method449(47, 0, 47, 0));
                        this.field324.method451(3, this.field324.method449(47, 1, 47, 0));
                        this.field324.method451(3, this.field324.method449(48, 0, 47, 0));
                        this.field324.method451(3, this.field324.method449(48, 1, 47, 0));
                        this.field324.method451(3, this.field324.method449(48, 0, 148, 0));
                        this.field324.method451(3, this.field324.method449(48, 1, 148, 0));
                        int var20 = this.field324.method456();
                        while (this.field324.method456() > 0) {
                            int var21 = var20 - this.field324.method456();
                            if (var21 > 0) {
                                this.method163(field358, 75, "Loading maps - " + var21 * 100 / var20 + "%");
                            }
                            this.method52(-24437);
                            try {
                                Thread.sleep(100L);
                            } catch (Exception var66) {
                            }
                        }
                    }
                    int var22 = this.field324.method439(0, (byte) 4);
                    for (int var23 = 0; var23 < var22; ++var23) {
                        int var24 = this.field324.method458(var23, 7);
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
                            this.field324.method447(var23, 45785, 0, var25);
                        }
                    }
                    this.field324.method455(false, field234);
                    if (!field235) {
                        int var26 = this.field324.method439(2, (byte) 4);
                        for (int var27 = 1; var27 < var26; ++var27) {
                            if (this.field324.method452(var27, -343)) {
                                this.field324.method447(var27, 45785, 2, (byte) 1);
                            }
                        }
                    }
                    this.method163(field358, 80, "Unpacking media");
                    this.field517 = new class66(var6, "invback", 0);
                    this.field519 = new class66(var6, "chatback", 0);
                    this.field518 = new class66(var6, "mapback", 0);
                    this.field89 = new class66(var6, "backbase1", 0);
                    this.field90 = new class66(var6, "backbase2", 0);
                    this.field91 = new class66(var6, "backhmid1", 0);
                    for (int var28 = 0; var28 < 13; ++var28) {
                        this.field364[var28] = new class66(var6, "sideicons", var28);
                    }
                    this.field172 = new class4(var6, "compass", 0);
                    this.field179 = new class4(var6, "mapedge", 0);
                    this.field179.method10((byte) 4);
                    try {
                        for (int var29 = 0; var29 < 100; ++var29) {
                            this.field113[var29] = new class66(var6, "mapscene", var29);
                        }
                    } catch (Exception var74) {
                    }
                    try {
                        for (int var30 = 0; var30 < 100; ++var30) {
                            this.field534[var30] = new class4(var6, "mapfunction", var30);
                        }
                    } catch (Exception var73) {
                    }
                    try {
                        for (int var31 = 0; var31 < 20; ++var31) {
                            this.field153[var31] = new class4(var6, "hitmarks", var31);
                        }
                    } catch (Exception var72) {
                    }
                    try {
                        for (int var32 = 0; var32 < 20; ++var32) {
                            this.field413[var32] = new class4(var6, "headicons", var32);
                        }
                    } catch (Exception var71) {
                    }
                    this.field530 = new class4(var6, "mapmarker", 0);
                    this.field531 = new class4(var6, "mapmarker", 1);
                    for (int var33 = 0; var33 < 8; ++var33) {
                        this.field354[var33] = new class4(var6, "cross", var33);
                    }
                    this.field492 = new class4(var6, "mapdots", 0);
                    this.field493 = new class4(var6, "mapdots", 1);
                    this.field494 = new class4(var6, "mapdots", 2);
                    this.field495 = new class4(var6, "mapdots", 3);
                    this.field496 = new class4(var6, "mapdots", 4);
                    this.field207 = new class66(var6, "scrollbar", 0);
                    this.field208 = new class66(var6, "scrollbar", 1);
                    this.field475 = new class66(var6, "redstone1", 0);
                    this.field476 = new class66(var6, "redstone2", 0);
                    this.field477 = new class66(var6, "redstone3", 0);
                    this.field478 = new class66(var6, "redstone1", 0);
                    this.field478.method530(4);
                    this.field479 = new class66(var6, "redstone2", 0);
                    this.field479.method530(4);
                    this.field303 = new class66(var6, "redstone1", 0);
                    this.field303.method531(-321);
                    this.field304 = new class66(var6, "redstone2", 0);
                    this.field304.method531(-321);
                    this.field305 = new class66(var6, "redstone3", 0);
                    this.field305.method531(-321);
                    this.field306 = new class66(var6, "redstone1", 0);
                    this.field306.method530(4);
                    this.field306.method531(-321);
                    this.field307 = new class66(var6, "redstone2", 0);
                    this.field307.method530(4);
                    this.field307.method531(-321);
                    for (int var34 = 0; var34 < 2; ++var34) {
                        this.field96[var34] = new class66(var6, "mod_icons", var34);
                    }
                    class4 var35 = new class4(var6, "backleft1", 0);
                    this.field437 = new class48(var35.field43, -41603, var35.field42, this.method73(-13961));
                    var35.method11(field129, 0, 0);
                    class4 var36 = new class4(var6, "backleft2", 0);
                    this.field438 = new class48(var36.field43, -41603, var36.field42, this.method73(-13961));
                    var36.method11(field129, 0, 0);
                    class4 var37 = new class4(var6, "backright1", 0);
                    this.field439 = new class48(var37.field43, -41603, var37.field42, this.method73(-13961));
                    var37.method11(field129, 0, 0);
                    class4 var38 = new class4(var6, "backright2", 0);
                    this.field440 = new class48(var38.field43, -41603, var38.field42, this.method73(-13961));
                    var38.method11(field129, 0, 0);
                    class4 var39 = new class4(var6, "backtop1", 0);
                    this.field441 = new class48(var39.field43, -41603, var39.field42, this.method73(-13961));
                    var39.method11(field129, 0, 0);
                    class4 var40 = new class4(var6, "backvmid1", 0);
                    this.field442 = new class48(var40.field43, -41603, var40.field42, this.method73(-13961));
                    var40.method11(field129, 0, 0);
                    class4 var41 = new class4(var6, "backvmid2", 0);
                    this.field443 = new class48(var41.field43, -41603, var41.field42, this.method73(-13961));
                    var41.method11(field129, 0, 0);
                    class4 var42 = new class4(var6, "backvmid3", 0);
                    this.field444 = new class48(var42.field43, -41603, var42.field42, this.method73(-13961));
                    var42.method11(field129, 0, 0);
                    class4 var43 = new class4(var6, "backhmid2", 0);
                    this.field445 = new class48(var43.field43, -41603, var43.field42, this.method73(-13961));
                    var43.method11(field129, 0, 0);
                    int var44 = (int) (Math.random() * 21.0D) - 10;
                    int var45 = (int) (Math.random() * 21.0D) - 10;
                    int var46 = (int) (Math.random() * 21.0D) - 10;
                    int var47 = (int) (Math.random() * 41.0D) - 20;
                    for (int var48 = 0; var48 < 100; ++var48) {
                        if (this.field534[var48] != null) {
                            this.field534[var48].method9(var44 + var47, 666, var46 + var47, var45 + var47);
                        }
                        if (this.field113[var48] != null) {
                            this.field113[var48].method532(var44 + var47, 666, var46 + var47, var45 + var47);
                        }
                    }
                    this.method163(field358, 83, "Unpacking textures");
                    class31.method275(-978, var7);
                    class31.method279(0, 0.8D);
                    class31.method274((byte) 5, 20);
                    this.method163(field358, 86, "Unpacking config");
                    class24.method226(false, var4);
                    class13.method187(var4);
                    class28.method264(false, var4);
                    class57.method426(var4);
                    class19.method211(var4);
                    class5.method21(false, var4);
                    class17.method204(false, var4);
                    class65.method526(false, var4);
                    class30.method268(false, var4);
                    class57.field1416 = field234;
                    if (!field235) {
                        this.method163(field358, 90, "Unpacking sounds");
                        byte[] var49 = var9.method465("sounds.dat", (byte[]) null);
                        class62 var50 = new class62(var49, 49938);
                        class9.method174(false, var50);
                    }
                    this.method163(field358, 95, "Unpacking interfaces");
                    class44[] var51 = new class44[] { this.field511, this.field512, this.field513, this.field514 };
                    class34.method298(true, var5, var6, var51);
                    this.method163(field358, 100, "Preparing game engine");
                    for (int var52 = 0; var52 < 33; ++var52) {
                        int var53 = 999;
                        int var54 = 0;
                        for (int var55 = 0; var55 < 34; ++var55) {
                            if (this.field518.field1597[this.field518.field1599 * var52 + var55] == 0) {
                                if (var53 == 999) {
                                    var53 = var55;
                                }
                            } else if (var53 != 999) {
                                var54 = var55;
                                break;
                            }
                        }
                        this.field214[var52] = var53;
                        this.field316[var52] = var54 - var53;
                    }
                    for (int var56 = 5; var56 < 156; ++var56) {
                        int var57 = 999;
                        int var58 = 0;
                        for (int var59 = 25; var59 < 172; ++var59) {
                            if (this.field518.field1597[this.field518.field1599 * var56 + var59] == 0 && (var59 > 34 || var56 > 34)) {
                                if (var57 == 999) {
                                    var57 = var59;
                                }
                            } else if (var57 != 999) {
                                var58 = var59;
                                break;
                            }
                        }
                        this.field411[var56 - 5] = var57 - 25;
                        this.field184[var56 - 5] = var58 - var57;
                    }
                    class31.method272(96, (byte) 33, 479);
                    this.field142 = class31.field975;
                    class31.method272(261, (byte) 33, 190);
                    this.field143 = class31.field975;
                    class31.method272(334, (byte) 33, 512);
                    this.field144 = class31.field975;
                    int[] var60 = new int[9];
                    for (int var61 = 0; var61 < 9; ++var61) {
                        int var62 = var61 * 32 + 128 + 15;
                        int var63 = var62 * 3 + 600;
                        int var64 = class31.field973[var62];
                        var60[var61] = var63 * var64 >> 16;
                    }
                    class71.method575(500, var60, 512, 0, 334, 800);
                    class35.method301(var8);
                    this.field183 = new class55(this, 14271);
                    this.method102(this.field183, 10);
                    class26.field836 = this;
                    class13.field657 = this;
                    class19.field762 = this;
                } catch (Exception var75) {
                    signlink.reporterror("loaderror " + this.field99 + " " + this.field180);
                    this.field365 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIIIIIIZII)Z")
    public final boolean method45(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10, int arg11) {
        byte var13 = 104;
        byte var14 = 104;
        for (int var15 = 0; var15 < var13; ++var15) {
            for (int var35 = 0; var35 < var14; ++var35) {
                this.field311[var15][var35] = 0;
                this.field216[var15][var35] = 99999999;
            }
        }
        int var16 = arg7;
        int var17 = arg4;
        this.field311[arg7][arg4] = 99;
        this.field216[arg7][arg4] = 0;
        byte var18 = 0;
        int var19 = 0;
        this.field484[var18] = arg7;
        int var36 = var18 + 1;
        this.field485[var18] = arg4;
        boolean var20 = false;
        int var21 = this.field484.length;
        int[][] var22 = this.field103[this.field164].field1567;
        while (var36 != var19) {
            var16 = this.field484[var19];
            var17 = this.field485[var19];
            var19 = (var19 + 1) % var21;
            if (arg6 == var16 && arg1 == var17) {
                var20 = true;
                break;
            }
            if (arg8 != 0) {
                if ((arg8 < 5 || arg8 == 10) && this.field103[this.field164].method523(arg8 - 1, 498, arg6, var17, arg1, var16, arg10)) {
                    var20 = true;
                    break;
                }
                if (arg8 < 10 && this.field103[this.field164].method524(var16, arg6, arg8 - 1, arg10, 165, var17, arg1)) {
                    var20 = true;
                    break;
                }
            }
            if (arg11 != 0 && arg3 != 0 && this.field103[this.field164].method525(-121, arg1, arg5, arg6, var16, var17, arg11, arg3)) {
                var20 = true;
                break;
            }
            int var34 = this.field216[var16][var17] + 1;
            if (var16 > 0 && this.field311[var16 - 1][var17] == 0 && (var22[var16 - 1][var17] & 19398920) == 0) {
                this.field484[var36] = var16 - 1;
                this.field485[var36] = var17;
                var36 = (var36 + 1) % var21;
                this.field311[var16 - 1][var17] = 2;
                this.field216[var16 - 1][var17] = var34;
            }
            if (var16 < var13 - 1 && this.field311[var16 + 1][var17] == 0 && (var22[var16 + 1][var17] & 19399040) == 0) {
                this.field484[var36] = var16 + 1;
                this.field485[var36] = var17;
                var36 = (var36 + 1) % var21;
                this.field311[var16 + 1][var17] = 8;
                this.field216[var16 + 1][var17] = var34;
            }
            if (var17 > 0 && this.field311[var16][var17 - 1] == 0 && (var22[var16][var17 - 1] & 19398914) == 0) {
                this.field484[var36] = var16;
                this.field485[var36] = var17 - 1;
                var36 = (var36 + 1) % var21;
                this.field311[var16][var17 - 1] = 1;
                this.field216[var16][var17 - 1] = var34;
            }
            if (var17 < var14 - 1 && this.field311[var16][var17 + 1] == 0 && (var22[var16][var17 + 1] & 19398944) == 0) {
                this.field484[var36] = var16;
                this.field485[var36] = var17 + 1;
                var36 = (var36 + 1) % var21;
                this.field311[var16][var17 + 1] = 4;
                this.field216[var16][var17 + 1] = var34;
            }
            if (var16 > 0 && var17 > 0 && this.field311[var16 - 1][var17 - 1] == 0 && (var22[var16 - 1][var17 - 1] & 19398926) == 0 && (var22[var16 - 1][var17] & 19398920) == 0 && (var22[var16][var17 - 1] & 19398914) == 0) {
                this.field484[var36] = var16 - 1;
                this.field485[var36] = var17 - 1;
                var36 = (var36 + 1) % var21;
                this.field311[var16 - 1][var17 - 1] = 3;
                this.field216[var16 - 1][var17 - 1] = var34;
            }
            if (var16 < var13 - 1 && var17 > 0 && this.field311[var16 + 1][var17 - 1] == 0 && (var22[var16 + 1][var17 - 1] & 19399043) == 0 && (var22[var16 + 1][var17] & 19399040) == 0 && (var22[var16][var17 - 1] & 19398914) == 0) {
                this.field484[var36] = var16 + 1;
                this.field485[var36] = var17 - 1;
                var36 = (var36 + 1) % var21;
                this.field311[var16 + 1][var17 - 1] = 9;
                this.field216[var16 + 1][var17 - 1] = var34;
            }
            if (var16 > 0 && var17 < var14 - 1 && this.field311[var16 - 1][var17 + 1] == 0 && (var22[var16 - 1][var17 + 1] & 19398968) == 0 && (var22[var16 - 1][var17] & 19398920) == 0 && (var22[var16][var17 + 1] & 19398944) == 0) {
                this.field484[var36] = var16 - 1;
                this.field485[var36] = var17 + 1;
                var36 = (var36 + 1) % var21;
                this.field311[var16 - 1][var17 + 1] = 6;
                this.field216[var16 - 1][var17 + 1] = var34;
            }
            if (var16 < var13 - 1 && var17 < var14 - 1 && this.field311[var16 + 1][var17 + 1] == 0 && (var22[var16 + 1][var17 + 1] & 19399136) == 0 && (var22[var16 + 1][var17] & 19399040) == 0 && (var22[var16][var17 + 1] & 19398944) == 0) {
                this.field484[var36] = var16 + 1;
                this.field485[var36] = var17 + 1;
                var36 = (var36 + 1) % var21;
                this.field311[var16 + 1][var17 + 1] = 12;
                this.field216[var16 + 1][var17 + 1] = var34;
            }
        }
        this.field373 = 0;
        if (arg0 != 0) {
            this.field269 = this.field454.method461();
        }
        if (!var20) {
            if (arg9) {
                int var23 = 100;
                for (int var24 = 1; var24 < 2; ++var24) {
                    for (int var25 = arg6 - var24; var25 <= arg6 + var24; ++var25) {
                        for (int var26 = arg1 - var24; var26 <= arg1 + var24; ++var26) {
                            if (var25 >= 0 && var26 >= 0 && var25 < 104 && var26 < 104 && this.field216[var25][var26] < var23) {
                                var23 = this.field216[var25][var26];
                                var16 = var25;
                                var17 = var26;
                                this.field373 = 1;
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
        int var29 = var28 = this.field311[var16][var17];
        while (arg7 != var16 || arg4 != var17) {
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
            var29 = this.field311[var16][var17];
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
                this.field213.method467(190, 832);
                this.field213.method468(var30 + var30 + 3);
            }
            if (arg2 == 1) {
                this.field213.method467(212, 832);
                this.field213.method468(var30 + var30 + 3 + 14);
            }
            if (arg2 == 2) {
                this.field213.method467(196, 832);
                this.field213.method468(var30 + var30 + 3);
            }
            this.field213.method495(super.field1197[5] == 1 ? 1 : 0, 593);
            this.field213.method502(this.field126 + var32, true);
            this.field295 = this.field484[0];
            this.field296 = this.field485[0];
            for (int var33 = 1; var33 < var30; ++var33) {
                --var37;
                this.field213.method495(this.field484[var37] - var31, 593);
                this.field213.method494(this.field485[var37] - var32, (byte) 9);
            }
            this.field213.method503(false, this.field125 + var31);
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(III)V")
    public final void method46(int arg0, int arg1, int arg2) {
        if (arg1 != -28761) {
            this.field376 = null;
        }
        int var4 = 0;
        for (int var5 = 0; var5 < 100; ++var5) {
            if (this.field240[var5] != null) {
                int var6 = this.field238[var5];
                int var7 = 70 - var4 * 14 + this.field94 + 4;
                if (var7 < -20) {
                    break;
                }
                String var8 = this.field239[var5];
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
                if ((var6 == 1 || var6 == 2) && (var6 == 1 || this.field546 == 0 || this.field546 == 1 && this.method98(0, var8))) {
                    if (arg0 > var7 - 14 && arg0 <= var7 && !var8.equals(field174.field1360)) {
                        if (this.field417 >= 1) {
                            this.field215[this.field545] = "Report abuse @whi@" + var8;
                            this.field405[this.field545] = 218;
                            ++this.field545;
                        }
                        this.field215[this.field545] = "Add ignore @whi@" + var8;
                        this.field405[this.field545] = 979;
                        ++this.field545;
                        this.field215[this.field545] = "Add friend @whi@" + var8;
                        this.field405[this.field545] = 754;
                        ++this.field545;
                    }
                    ++var4;
                }
                if ((var6 == 3 || var6 == 7) && this.field102 == 0 && (var6 == 7 || this.field412 == 0 || this.field412 == 1 && this.method98(0, var8))) {
                    if (arg0 > var7 - 14 && arg0 <= var7) {
                        if (this.field417 >= 1) {
                            this.field215[this.field545] = "Report abuse @whi@" + var8;
                            this.field405[this.field545] = 218;
                            ++this.field545;
                        }
                        this.field215[this.field545] = "Add ignore @whi@" + var8;
                        this.field405[this.field545] = 979;
                        ++this.field545;
                        this.field215[this.field545] = "Add friend @whi@" + var8;
                        this.field405[this.field545] = 754;
                        ++this.field545;
                    }
                    ++var4;
                }
                if (var6 == 4 && (this.field162 == 0 || this.field162 == 1 && this.method98(0, var8))) {
                    if (arg0 > var7 - 14 && arg0 <= var7) {
                        this.field215[this.field545] = "Accept trade @whi@" + var8;
                        this.field405[this.field545] = 734;
                        ++this.field545;
                    }
                    ++var4;
                }
                if ((var6 == 5 || var6 == 6) && this.field102 == 0 && this.field412 < 2) {
                    ++var4;
                }
                if (var6 == 8 && (this.field162 == 0 || this.field162 == 1 && this.method98(0, var8))) {
                    if (arg0 > var7 - 14 && arg0 <= var7) {
                        this.field215[this.field545] = "Accept challenge @whi@" + var8;
                        this.field405[this.field545] = 205;
                        ++this.field545;
                    }
                    ++var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "j", descriptor = "(I)V")
    public final void method47(int arg0) {
        if (arg0 != -25387) {
            this.field467 = -453;
        }
        if (field235 && this.field302 == 2 && class51.field1303 != this.field164) {
            this.field523.method394(false);
            this.field512.method370("Loading - please wait.", 257, false, 0, 151);
            this.field512.method370("Loading - please wait.", 256, false, 16777215, 150);
            this.field523.method395(-30874, super.field1179, 4, 4);
            this.field302 = 1;
            this.field253 = System.currentTimeMillis();
        }
        if (this.field302 == 1) {
            int var2 = this.method48(0);
            if (var2 != 0 && System.currentTimeMillis() - this.field253 > 360000L) {
                signlink.reporterror(this.field555 + " glcfb " + this.field392 + "," + var2 + "," + field235 + "," + this.field206[0] + "," + this.field324.method456() + "," + this.field164 + "," + this.field277 + "," + this.field278);
                this.field253 = System.currentTimeMillis();
            }
        }
        if (this.field302 == 2 && this.field447 != this.field164) {
            this.field447 = this.field164;
            this.method132(7, this.field164);
        }
    }

    @OriginalMember(owner = "client", name = "k", descriptor = "(I)I")
    public final int method48(int arg0) {
        for (int var2 = 0; var2 < this.field97.length; ++var2) {
            if (this.field97[var2] == null && this.field168[var2] != -1) {
                return -1;
            }
            if (this.field135[var2] == null && this.field169[var2] != -1) {
                return -2;
            }
        }
        boolean var3 = true;
        for (int var4 = 0; var4 < this.field97.length; ++var4) {
            byte[] var5 = this.field135[var4];
            if (var5 != null) {
                int var6 = (this.field167[var4] >> 8) * 64 - this.field125;
                int var7 = (this.field167[var4] & 255) * 64 - this.field126;
                if (this.field237) {
                    var6 = 10;
                    var7 = 10;
                }
                var3 &= class51.method410(var6, var7, 0, var5);
            }
        }
        if (!var3) {
            return -3;
        } else if (this.field347) {
            return -4;
        } else {
            this.field302 = 2;
            class51.field1303 = this.field164;
            this.method149(23140);
            this.field213.method467(130, 832);
            if (arg0 != 0) {
                this.field274 = this.field454.method461();
            }
            return 0;
        }
    }

    @OriginalMember(owner = "client", name = "l", descriptor = "(I)V")
    public final void method49(int arg0) {
        if (arg0 >= 0) {
            this.field213.method468(249);
        }
        for (int var2 = 0; var2 < this.field360; ++var2) {
            if (this.field219[var2] <= 0) {
                boolean var3 = false;
                try {
                    if (this.field314[var2] == this.field321 && this.field147[var2] == this.field145) {
                        if (!this.method79(230)) {
                            var3 = true;
                        }
                    } else {
                        class62 var4 = class9.method175(this.field314[var2], this.field147[var2], -450);
                        if (System.currentTimeMillis() + (long) (var4.field1542 / 22) > (long) (this.field98 / 22) + this.field535) {
                            this.field98 = var4.field1542;
                            this.field535 = System.currentTimeMillis();
                            if (this.method125(var4.field1542, var4.field1541, 8)) {
                                this.field321 = this.field314[var2];
                                this.field145 = this.field147[var2];
                            } else {
                                var3 = true;
                            }
                        }
                    }
                } catch (Exception var7) {
                }
                if (var3 && this.field219[var2] != -5) {
                    this.field219[var2] = -5;
                } else {
                    --this.field360;
                    for (int var6 = var2; var6 < this.field360; ++var6) {
                        this.field314[var6] = this.field314[var6 + 1];
                        this.field147[var6] = this.field147[var6 + 1];
                        this.field219[var6] = this.field219[var6 + 1];
                    }
                    --var2;
                }
            } else {
                int var10002 = this.field219[var2]--;
            }
        }
        if (this.field542 > 0) {
            this.field542 -= 20;
            if (this.field542 < 0) {
                this.field542 = 0;
            }
            if (this.field542 == 0 && this.field480 && !field235) {
                this.field298 = this.field182;
                this.field299 = true;
                this.field324.method451(2, this.field298);
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LKFCZNNDM;Z)Z")
    public final boolean method50(class34 arg0, boolean arg1) {
        if (!arg1) {
            this.field236 = !this.field236;
        }
        if (arg0.field1047 == null) {
            return false;
        } else {
            for (int var3 = 0; var3 < arg0.field1047.length; ++var3) {
                int var4 = this.method101(var3, this.field176, arg0);
                int var5 = arg0.field1048[var3];
                if (arg0.field1047[var3] == 2) {
                    if (var4 >= var5) {
                        return false;
                    }
                } else if (arg0.field1047[var3] == 3) {
                    if (var4 <= var5) {
                        return false;
                    }
                } else if (arg0.field1047[var3] == 4) {
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

    @OriginalMember(owner = "client", name = "a", descriptor = "(B)V")
    public final void method51(byte arg0) {
        for (int var2 = -1; var2 < this.field421; ++var2) {
            int var6;
            if (var2 == -1) {
                var6 = this.field419;
            } else {
                var6 = this.field422[var2];
            }
            class54 var7 = this.field420[var6];
            if (var7 != null && var7.field602 > 0) {
                --var7.field602;
                if (var7.field602 == 0) {
                    var7.field584 = null;
                }
            }
        }
        if (arg0 != -87) {
            this.method44();
        }
        for (int var3 = 0; var3 < this.field528; ++var3) {
            int var4 = this.field529[var3];
            class1 var5 = this.field527[var4];
            if (var5 != null && var5.field602 > 0) {
                --var5.field602;
                if (var5.field602 == 0) {
                    var5.field584 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "m", descriptor = "(I)V")
    public final void method52(int arg0) {
        if (arg0 != -24437) {
            this.field121 = -1;
        }
        while (true) {
            class56 var2 = this.field324.method441();
            if (var2 == null) {
                return;
            }
            if (var2.field1383 == 0) {
                class27.method236(var2.field1380, false, var2.field1384);
                if ((this.field324.method458(var2.field1380, 7) & 98) != 0) {
                    this.field504 = true;
                    if (this.field322 != -1) {
                        this.field100 = true;
                    }
                }
            }
            if (var2.field1383 == 1 && var2.field1384 != null) {
                class49.method398(false, var2.field1384);
            }
            if (var2.field1383 == 2 && this.field298 == var2.field1380 && var2.field1384 != null) {
                this.method32(true, this.field299, var2.field1384);
            }
            if (var2.field1383 == 3 && this.field302 == 1) {
                for (int var3 = 0; var3 < this.field97.length; ++var3) {
                    if (this.field168[var3] == var2.field1380) {
                        this.field97[var3] = var2.field1384;
                        if (var2.field1384 == null) {
                            this.field168[var3] = -1;
                        }
                        break;
                    }
                    if (this.field169[var3] == var2.field1380) {
                        this.field135[var3] = var2.field1384;
                        if (var2.field1384 == null) {
                            this.field169[var3] = -1;
                        }
                        break;
                    }
                }
            }
            if (var2.field1383 == 93 && this.field324.method445(var2.field1380, false)) {
                class51.method412((byte) 96, this.field324, new class62(var2.field1384, 49938));
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIIIII)V")
    private final void method53(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 > 0) {
            if (arg6 >= 1 && arg3 >= 1 && arg6 <= 102 && arg3 <= 102) {
                if (field235 && this.field164 != arg5) {
                    return;
                }
                int var9 = 0;
                boolean var10 = true;
                boolean var11 = false;
                boolean var12 = false;
                if (arg2 == 0) {
                    var9 = this.field409.method565(arg5, arg6, arg3);
                }
                if (arg2 == 1) {
                    var9 = this.field409.method566(arg6, arg5, 6, arg3);
                }
                if (arg2 == 2) {
                    var9 = this.field409.method567(arg5, arg6, arg3);
                }
                if (arg2 == 3) {
                    var9 = this.field409.method568(arg5, arg6, arg3);
                }
                if (var9 != 0) {
                    int var13 = this.field409.method569(arg5, arg6, arg3, var9);
                    int var14 = var9 >> 14 & 32767;
                    int var15 = var13 & 31;
                    int var16 = var13 >> 6;
                    if (arg2 == 0) {
                        this.field409.method556(arg6, field550, arg3, arg5);
                        class13 var17 = class13.method194(var14);
                        if (var17.field641) {
                            this.field103[arg5].method519(arg3, var15, arg6, 0, var17.field663, var16);
                        }
                    }
                    if (arg2 == 1) {
                        this.field409.method557(arg5, true, arg6, arg3);
                    }
                    if (arg2 == 2) {
                        this.field409.method558(arg3, arg5, true, arg6);
                        class13 var18 = class13.method194(var14);
                        if (var18.field676 + arg6 > 103 || var18.field676 + arg3 > 103 || var18.field642 + arg6 > 103 || var18.field642 + arg3 > 103) {
                            return;
                        }
                        if (var18.field641) {
                            this.field103[arg5].method520(var18.field676, arg6, 6, arg3, var16, var18.field642, var18.field663);
                        }
                    }
                    if (arg2 == 3) {
                        this.field409.method559(arg3, arg6, arg5, (byte) 4);
                        class13 var19 = class13.method194(var14);
                        if (var19.field641 && var19.field662) {
                            this.field103[arg5].method522(arg6, arg3, 962);
                        }
                    }
                }
                if (arg7 >= 0) {
                    int var20 = arg5;
                    if (arg5 < 3 && (this.field460[1][arg6][arg3] & 2) == 2) {
                        var20 = arg5 + 1;
                    }
                    class51.method419(this.field409, arg4, arg0, var20, true, arg3, arg6, this.field84, this.field103[arg5], arg7, arg5);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IBLXQPFGONL;)V")
    private final void method54(int arg0, byte arg1, class62 arg2) {
        int var4 = arg2.method489(8, 0);
        if (var4 < this.field421) {
            for (int var5 = var4; var5 < this.field421; ++var5) {
                this.field540[this.field539++] = this.field422[var5];
            }
        }
        if (var4 > this.field421) {
            signlink.reporterror(this.field555 + " Too many players");
            throw new RuntimeException("eek");
        } else {
            this.field421 = 0;
            for (int var6 = 0; var6 < var4; ++var6) {
                int var7 = this.field422[var6];
                class54 var8 = this.field420[var7];
                int var9 = arg2.method489(1, 0);
                if (var9 == 0) {
                    this.field422[this.field421++] = var7;
                    var8.field630 = field330;
                } else {
                    int var10 = arg2.method489(2, 0);
                    if (var10 == 0) {
                        this.field422[this.field421++] = var7;
                        var8.field630 = field330;
                        this.field424[this.field423++] = var7;
                    } else if (var10 == 1) {
                        this.field422[this.field421++] = var7;
                        var8.field630 = field330;
                        int var11 = arg2.method489(3, 0);
                        var8.method180(var11, 5, false);
                        int var12 = arg2.method489(1, 0);
                        if (var12 == 1) {
                            this.field424[this.field423++] = var7;
                        }
                    } else if (var10 == 2) {
                        this.field422[this.field421++] = var7;
                        var8.field630 = field330;
                        int var13 = arg2.method489(3, 0);
                        var8.method180(var13, 5, true);
                        int var14 = arg2.method489(3, 0);
                        var8.method180(var14, 5, true);
                        int var15 = arg2.method489(1, 0);
                        if (var15 == 1) {
                            this.field424[this.field423++] = var7;
                        }
                    } else if (var10 == 3) {
                        this.field540[this.field539++] = var7;
                    }
                }
            }
            if (arg1 != 69) {
                this.field456 = 297;
            }
        }
    }

    @OriginalMember(owner = "client", name = "n", descriptor = "(I)V")
    public final void method55(int arg0) {
        this.field120 += arg0;
        if (this.field171 == 0) {
            if (super.field1193 == 1) {
                int var2 = super.field1194 - 25 - 550;
                int var3 = super.field1195 - 5 - 4;
                if (var2 >= 0 && var3 >= 0 && var2 < 146 && var3 < 151) {
                    var2 -= 73;
                    var3 -= 75;
                    int var4 = this.field487 + this.field328 & 2047;
                    int var5 = class31.field973[var4];
                    int var6 = class31.field974[var4];
                    int var7 = (this.field130 + 256) * var5 >> 8;
                    int var8 = (this.field130 + 256) * var6 >> 8;
                    int var9 = var2 * var8 + var3 * var7 >> 11;
                    int var10 = var3 * var8 - var2 * var7 >> 11;
                    int var11 = field174.field587 + var9 >> 7;
                    int var12 = field174.field588 - var10 >> 7;
                    boolean var13 = this.method45(0, var12, 1, 0, field174.field620[0], 0, var11, field174.field619[0], 0, true, 0, 0);
                    if (var13) {
                        this.field213.method468(var2);
                        this.field213.method468(var3);
                        this.field213.method469(this.field487);
                        this.field213.method468(57);
                        this.field213.method468(this.field328);
                        this.field213.method468(this.field130);
                        this.field213.method468(89);
                        this.field213.method469(field174.field587);
                        this.field213.method469(field174.field588);
                        this.field213.method468(this.field373);
                        this.field213.method468(63);
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(I)V")
    public final void method56(int arg0) {
        signlink.reporterror = false;
        try {
            if (this.field173 != null) {
                this.field173.method351();
            }
        } catch (Exception var2) {
        }
        this.field173 = null;
        this.method57(500);
        if (this.field183 != null) {
            this.field183.field1378 = false;
        }
        this.field183 = null;
        this.field324.method459();
        if (arg0 >= 0) {
            this.field213.method468(246);
        }
        this.field324 = null;
        this.field526 = null;
        this.field213 = null;
        this.field95 = null;
        this.field251 = null;
        this.field167 = null;
        this.field97 = null;
        this.field135 = null;
        this.field168 = null;
        this.field169 = null;
        this.field84 = null;
        this.field460 = null;
        this.field409 = null;
        this.field103 = null;
        this.field311 = null;
        this.field216 = null;
        this.field484 = null;
        this.field485 = null;
        this.field119 = null;
        this.field521 = null;
        this.field522 = null;
        this.field523 = null;
        this.field524 = null;
        this.field448 = null;
        this.field449 = null;
        this.field450 = null;
        this.field437 = null;
        this.field438 = null;
        this.field439 = null;
        this.field440 = null;
        this.field441 = null;
        this.field442 = null;
        this.field443 = null;
        this.field444 = null;
        this.field445 = null;
        this.field517 = null;
        this.field518 = null;
        this.field519 = null;
        this.field89 = null;
        this.field90 = null;
        this.field91 = null;
        this.field364 = null;
        this.field475 = null;
        this.field476 = null;
        this.field477 = null;
        this.field478 = null;
        this.field479 = null;
        this.field303 = null;
        this.field304 = null;
        this.field305 = null;
        this.field306 = null;
        this.field307 = null;
        this.field172 = null;
        this.field153 = null;
        this.field413 = null;
        this.field354 = null;
        this.field492 = null;
        this.field493 = null;
        this.field494 = null;
        this.field495 = null;
        this.field496 = null;
        this.field113 = null;
        this.field534 = null;
        this.field363 = null;
        this.field420 = null;
        this.field422 = null;
        this.field424 = null;
        this.field425 = null;
        this.field540 = null;
        this.field527 = null;
        this.field529 = null;
        this.field376 = null;
        this.field367 = null;
        this.field415 = null;
        this.field312 = null;
        this.field403 = null;
        this.field404 = null;
        this.field405 = null;
        this.field406 = null;
        this.field215 = null;
        this.field374 = null;
        this.field462 = null;
        this.field463 = null;
        this.field391 = null;
        this.field297 = null;
        this.field431 = null;
        this.field272 = null;
        this.field242 = null;
        this.field188 = null;
        this.field189 = null;
        this.field185 = null;
        this.field186 = null;
        this.field187 = null;
        this.field190 = null;
        this.field191 = null;
        this.field192 = null;
        this.field193 = null;
        this.method160(0);
        class13.method185(this.field269);
        class19.method209(this.field269);
        class57.method434(this.field269);
        class28.field932 = null;
        class5.field52 = null;
        class34.field1057 = null;
        class11.field571 = null;
        class24.field813 = null;
        class17.field725 = null;
        class17.field737 = null;
        class65.field1578 = null;
        super.field1180 = null;
        class54.field1370 = null;
        class31.method270(this.field269);
        class71.method538(this.field269);
        class27.method234(this.field269);
        class49.method399(this.field269);
        System.gc();
        if (class15.field717) {
        }
    }

    @OriginalMember(owner = "client", name = "o", descriptor = "(I)V")
    public final void method57(int arg0) {
        signlink.midifade = 0;
        signlink.midi = "stop";
        if (arg0 <= 0) {
            this.field121 = -1;
        }
    }

    @OriginalMember(owner = "client", name = "p", descriptor = "(I)V")
    private final void method58(int arg0) {
        class72 var2 = (class72) this.field367.method199();
        if (arg0 < 2 || arg0 > 2) {
            field379 = this.field454.method461();
        }
        while (var2 != null) {
            if (var2.field1720 == -1) {
                var2.field1716 = 0;
                this.method131(var2, (byte) 4);
            } else {
                var2.method195();
            }
            var2 = (class72) this.field367.method201(467);
        }
    }

    @OriginalMember(owner = "client", name = "q", descriptor = "(I)V")
    public final void method59(int arg0) {
        if (this.field185 == null) {
            super.field1180 = null;
            this.field524 = null;
            this.field522 = null;
            this.field521 = null;
            this.field523 = null;
            this.field448 = null;
            this.field449 = null;
            this.field450 = null;
            this.field188 = new class48(265, -41603, 128, this.method73(-13961));
            class36.method342(false);
            this.field189 = new class48(265, -41603, 128, this.method73(-13961));
            class36.method342(false);
            this.field185 = new class48(171, -41603, 509, this.method73(-13961));
            class36.method342(false);
            this.field186 = new class48(132, -41603, 360, this.method73(-13961));
            class36.method342(false);
            this.field187 = new class48(200, -41603, 360, this.method73(-13961));
            class36.method342(false);
            this.field190 = new class48(238, -41603, 202, this.method73(-13961));
            class36.method342(false);
            this.field191 = new class48(238, -41603, 203, this.method73(-13961));
            class36.method342(false);
            this.field192 = new class48(94, -41603, 74, this.method73(-13961));
            class36.method342(false);
            this.field193 = new class48(94, -41603, 75, this.method73(-13961));
            class36.method342(false);
            if (arg0 != 1) {
                this.field446 = this.field454.method461();
            }
            if (this.field427 != null) {
                this.method172(630);
                this.method106(false);
            }
            this.field249 = true;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BI)V")
    public final void method60(byte arg0, int arg1) {
        class34 var3 = class34.field1057[arg1];
        for (int var4 = 0; var4 < var3.field1031.length && var3.field1031[var4] != -1; ++var4) {
            class34 var5 = class34.field1057[var3.field1031[var4]];
            if (var5.field1058 == 1) {
                this.method60((byte) 5, var5.field1043);
            }
            var5.field1044 = 0;
            var5.field1016 = 0;
        }
        if (arg0 == 5) {
            boolean var6 = false;
        } else {
            this.field121 = -1;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZIILFWGUGZKU;I)V")
    public final void method61(boolean arg0, int arg1, int arg2, class19 arg3, int arg4) {
        if (this.field545 < 400) {
            if (arg3.field760 != null) {
                arg3 = arg3.method208(false);
            }
            if (arg3 != null) {
                if (arg3.field769) {
                    String var6 = arg3.field787;
                    if (arg0) {
                        this.field121 = this.field251.method478();
                    }
                    if (arg3.field748 != 0) {
                        var6 = var6 + method173(arg3.field748, (byte) -2, field174.field1346) + " (level-" + arg3.field748 + ")";
                    }
                    if (this.field260 == 1) {
                        this.field215[this.field545] = "Use " + this.field264 + " with @yel@" + var6;
                        this.field405[this.field545] = 690;
                        this.field406[this.field545] = arg1;
                        this.field403[this.field545] = arg2;
                        this.field404[this.field545] = arg4;
                        ++this.field545;
                    } else {
                        if (this.field256 == 1) {
                            if ((this.field258 & 2) == 2) {
                                this.field215[this.field545] = this.field259 + " @yel@" + var6;
                                this.field405[this.field545] = 140;
                                this.field406[this.field545] = arg1;
                                this.field403[this.field545] = arg2;
                                this.field404[this.field545] = arg4;
                                ++this.field545;
                                return;
                            }
                        } else {
                            if (arg3.field759 != null) {
                                for (int var7 = 4; var7 >= 0; --var7) {
                                    if (arg3.field759[var7] != null && !arg3.field759[var7].equalsIgnoreCase("attack")) {
                                        this.field215[this.field545] = arg3.field759[var7] + " @yel@" + var6;
                                        if (var7 == 0) {
                                            this.field405[this.field545] = 703;
                                        }
                                        if (var7 == 1) {
                                            this.field405[this.field545] = 125;
                                        }
                                        if (var7 == 2) {
                                            this.field405[this.field545] = 62;
                                        }
                                        if (var7 == 3) {
                                            this.field405[this.field545] = 737;
                                        }
                                        if (var7 == 4) {
                                            this.field405[this.field545] = 532;
                                        }
                                        this.field406[this.field545] = arg1;
                                        this.field403[this.field545] = arg2;
                                        this.field404[this.field545] = arg4;
                                        ++this.field545;
                                    }
                                }
                            }
                            if (arg3.field759 != null) {
                                for (int var8 = 4; var8 >= 0; --var8) {
                                    if (arg3.field759[var8] != null && arg3.field759[var8].equalsIgnoreCase("attack")) {
                                        short var9 = 0;
                                        if (arg3.field748 > field174.field1346) {
                                            var9 = 2000;
                                        }
                                        this.field215[this.field545] = arg3.field759[var8] + " @yel@" + var6;
                                        if (var8 == 0) {
                                            this.field405[this.field545] = var9 + 703;
                                        }
                                        if (var8 == 1) {
                                            this.field405[this.field545] = var9 + 125;
                                        }
                                        if (var8 == 2) {
                                            this.field405[this.field545] = var9 + 62;
                                        }
                                        if (var8 == 3) {
                                            this.field405[this.field545] = var9 + 737;
                                        }
                                        if (var8 == 4) {
                                            this.field405[this.field545] = var9 + 532;
                                        }
                                        this.field406[this.field545] = arg1;
                                        this.field403[this.field545] = arg2;
                                        this.field404[this.field545] = arg4;
                                        ++this.field545;
                                    }
                                }
                            }
                            this.field215[this.field545] = "Examine @yel@" + var6;
                            this.field405[this.field545] = 1914;
                            this.field406[this.field545] = arg1;
                            this.field403[this.field545] = arg2;
                            this.field404[this.field545] = arg4;
                            ++this.field545;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(Z)V")
    public final void method62(boolean arg0) {
        int var2 = this.field398;
        int var3 = this.field399;
        int var4 = this.field400;
        int var5 = this.field401;
        if (arg0) {
            this.field121 = -1;
        }
        int var6 = 6116423;
        class36.method344(var4, var6, true, var3, var2, var5);
        class36.method344(var4 - 2, 0, true, var3 + 1, var2 + 1, 16);
        class36.method345(var4 - 2, var2 + 1, var5 - 19, 0, (byte) 6, var3 + 18);
        this.field513.method374(0, var3 + 14, "Choose Option", var2 + 3, var6);
        int var7 = super.field1187;
        int var8 = super.field1188;
        if (this.field397 == 0) {
            var7 -= 4;
            var8 -= 4;
        }
        if (this.field397 == 1) {
            var7 -= 553;
            var8 -= 205;
        }
        if (this.field397 == 2) {
            var7 -= 17;
            var8 -= 357;
        }
        for (int var9 = 0; var9 < this.field545; ++var9) {
            int var10 = (this.field545 - 1 - var9) * 15 + var3 + 31;
            int var11 = 16777215;
            if (var7 > var2 && var7 < var2 + var4 && var8 > var10 - 13 && var8 < var10 + 3) {
                var11 = 16776960;
            }
            this.field513.method378(this.field215[var9], true, var2 + 3, this.field236, var10, var11);
        }
    }

    @OriginalMember(owner = "client", name = "r", descriptor = "(I)V")
    public final void method63(int arg0) {
        if (this.field148 == 2) {
            this.method134(this.field139 * 2, (this.field138 - this.field126 << 7) + this.field141, (this.field137 - this.field125 << 7) + this.field140, -106);
            this.field120 += arg0;
            if (this.field270 > -1 && field330 % 20 < 10) {
                this.field413[2].method13(-41075, this.field271 - 28, this.field270 - 12);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(JB)V")
    public final void method64(long arg0, byte arg1) {
        if (arg0 != 0L) {
            if (this.field458 >= 100 && this.field525 != 1) {
                this.method155(-531, 0, "Your friendlist is full. Max of 100 for free users, and 200 for members", "");
            } else if (this.field458 >= 200) {
                this.method155(-531, 0, "Your friendlist is full. Max of 100 for free users, and 200 for members", "");
            } else {
                String var4 = class20.method218(-670, class20.method215(7, arg0));
                for (int var5 = 0; var5 < this.field458; ++var5) {
                    if (this.field272[var5] == arg0) {
                        this.method155(-531, 0, var4 + " is already on your friend list", "");
                        return;
                    }
                }
                if (arg1 != -85) {
                    this.field121 = -1;
                }
                for (int var6 = 0; var6 < this.field433; ++var6) {
                    if (this.field116[var6] == arg0) {
                        this.method155(-531, 0, "Please remove " + var4 + " from your ignore list first", "");
                        return;
                    }
                }
                if (!var4.equals(field174.field1360)) {
                    this.field431[this.field458] = var4;
                    this.field272[this.field458] = arg0;
                    this.field242[this.field458] = 0;
                    ++this.field458;
                    this.field504 = true;
                    this.field213.method467(172, 832);
                    this.field213.method474(arg0, (byte) 6);
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIZI)I")
    public final int method65(int arg0, int arg1, boolean arg2, int arg3) {
        if (arg2) {
            this.field121 = this.field251.method478();
        }
        int var5 = arg3 >> 7;
        int var6 = arg0 >> 7;
        if (var5 >= 0 && var6 >= 0 && var5 <= 103 && var6 <= 103) {
            int var7 = arg1;
            if (arg1 < 3 && (this.field460[1][var5][var6] & 2) == 2) {
                var7 = arg1 + 1;
            }
            int var8 = arg3 & 127;
            int var9 = arg0 & 127;
            int var10 = (128 - var8) * this.field84[var7][var5][var6] + this.field84[var7][var5 + 1][var6] * var8 >> 7;
            int var11 = (128 - var8) * this.field84[var7][var5][var6 + 1] + this.field84[var7][var5 + 1][var6 + 1] * var8 >> 7;
            return (128 - var9) * var10 + var9 * var11 >> 7;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(Z)V")
    public final void method66(boolean arg0) {
        short var2 = 256;
        for (int var3 = 10; var3 < 117; ++var3) {
            int var18 = (int) (Math.random() * 100.0D);
            if (var18 < 50) {
                this.field92[(var2 - 2 << 7) + var3] = 255;
            }
        }
        for (int var4 = 0; var4 < 100; ++var4) {
            int var15 = (int) (Math.random() * 124.0D) + 2;
            int var16 = (int) (Math.random() * 128.0D) + 128;
            int var17 = (var16 << 7) + var15;
            this.field92[var17] = 192;
        }
        for (int var5 = 1; var5 < var2 - 1; ++var5) {
            for (int var13 = 1; var13 < 127; ++var13) {
                int var14 = (var5 << 7) + var13;
                this.field93[var14] = (this.field92[var14 - 1] + this.field92[var14 + 1] + this.field92[var14 - 128] + this.field92[var14 + 128]) / 4;
            }
        }
        this.field353 &= arg0;
        this.field224 += 128;
        if (this.field224 > this.field254.length) {
            this.field224 -= this.field254.length;
            int var6 = (int) (Math.random() * 12.0D);
            this.method130(this.field326[var6], 15549);
        }
        for (int var7 = 1; var7 < var2 - 1; ++var7) {
            for (int var10 = 1; var10 < 127; ++var10) {
                int var11 = (var7 << 7) + var10;
                int var12 = this.field93[var11 + 128] - this.field254[this.field224 + var11 & this.field254.length - 1] / 5;
                if (var12 < 0) {
                    var12 = 0;
                }
                this.field92[var11] = var12;
            }
        }
        for (int var8 = 0; var8 < var2 - 1; ++var8) {
            this.field547[var8] = this.field547[var8 + 1];
        }
        this.field547[var2 - 1] = (int) (Math.sin((double) field330 / 14.0D) * 16.0D + Math.sin((double) field330 / 15.0D) * 14.0D + Math.sin((double) field330 / 16.0D) * 12.0D);
        if (this.field156 > 0) {
            this.field156 -= 4;
        }
        if (this.field157 > 0) {
            this.field157 -= 4;
        }
        if (this.field156 == 0 && this.field157 == 0) {
            int var9 = (int) (Math.random() * 2000.0D);
            if (var9 == 0) {
                this.field156 = 1024;
            }
            if (var9 == 1) {
                this.field157 = 1024;
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(ILKFCZNNDM;)Z")
    public final boolean method67(int arg0, class34 arg1) {
        int var3 = arg1.field1027;
        if (arg0 <= 0) {
            this.field121 = -1;
        }
        if ((var3 < 1 || var3 > 200) && (var3 < 701 || var3 > 900)) {
            if (var3 >= 401 && var3 <= 500) {
                this.field215[this.field545] = "Remove @whi@" + arg1.field1002;
                this.field405[this.field545] = 817;
                ++this.field545;
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
            this.field215[this.field545] = "Remove @whi@" + this.field431[var3];
            this.field405[this.field545] = 224;
            ++this.field545;
            this.field215[this.field545] = "Message @whi@" + this.field431[var3];
            this.field405[this.field545] = 808;
            ++this.field545;
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(BI)Ljava/lang/String;")
    private static final String method68(byte arg0, int arg1) {
        if (arg0 != 16) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        if (arg1 < 100000) {
            return String.valueOf(arg1);
        } else {
            return arg1 < 10000000 ? arg1 / 1000 + "K" : arg1 / 1000000 + "M";
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IILTKIWGAGO;II)V")
    public final void method69(int arg0, int arg1, class54 arg2, int arg3, int arg4) {
        if (arg1 != 8) {
            for (int var6 = 1; var6 > 0; ++var6) {
            }
        }
        if (field174 != arg2) {
            if (this.field545 < 400) {
                String var7;
                if (arg2.field1345 == 0) {
                    var7 = arg2.field1360 + method173(arg2.field1346, (byte) -2, field174.field1346) + " (level-" + arg2.field1346 + ")";
                } else {
                    var7 = arg2.field1360 + " (skill-" + arg2.field1345 + ")";
                }
                if (this.field260 == 1) {
                    this.field215[this.field545] = "Use " + this.field264 + " with @whi@" + var7;
                    this.field405[this.field545] = 245;
                    this.field406[this.field545] = arg3;
                    this.field403[this.field545] = arg4;
                    this.field404[this.field545] = arg0;
                    ++this.field545;
                } else if (this.field256 == 1) {
                    if ((this.field258 & 8) == 8) {
                        this.field215[this.field545] = this.field259 + " @whi@" + var7;
                        this.field405[this.field545] = 609;
                        this.field406[this.field545] = arg3;
                        this.field403[this.field545] = arg4;
                        this.field404[this.field545] = arg0;
                        ++this.field545;
                    }
                } else {
                    for (int var8 = 4; var8 >= 0; --var8) {
                        if (this.field482[var8] != null) {
                            this.field215[this.field545] = this.field482[var8] + " @whi@" + var7;
                            short var10 = 0;
                            if (this.field482[var8].equalsIgnoreCase("attack")) {
                                if (arg2.field1346 > field174.field1346) {
                                    var10 = 2000;
                                }
                                if (field174.field1361 != 0 && arg2.field1361 != 0) {
                                    if (field174.field1361 == arg2.field1361) {
                                        var10 = 2000;
                                    } else {
                                        var10 = 0;
                                    }
                                }
                            } else if (this.field483[var8]) {
                                var10 = 2000;
                            }
                            if (var8 == 0) {
                                this.field405[this.field545] = var10 + 589;
                            }
                            if (var8 == 1) {
                                this.field405[this.field545] = var10 + 970;
                            }
                            if (var8 == 2) {
                                this.field405[this.field545] = var10 + 439;
                            }
                            if (var8 == 3) {
                                this.field405[this.field545] = var10 + 257;
                            }
                            if (var8 == 4) {
                                this.field405[this.field545] = var10 + 319;
                            }
                            this.field406[this.field545] = arg3;
                            this.field403[this.field545] = arg4;
                            this.field404[this.field545] = arg0;
                            ++this.field545;
                        }
                    }
                }
                for (int var9 = 0; var9 < this.field545; ++var9) {
                    if (this.field405[var9] == 252) {
                        this.field215[var9] = "Walk here @whi@" + var7;
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "s", descriptor = "(I)V")
    public final void method70(int arg0) {
        if (arg0 != 3960) {
            this.field121 = this.field251.method478();
        }
        if (super.field1193 == 1) {
            if (super.field1194 >= 6 && super.field1194 <= 106 && super.field1195 >= 467 && super.field1195 <= 499) {
                this.field546 = (this.field546 + 1) % 4;
                this.field310 = true;
                this.field100 = true;
                this.field213.method467(16, 832);
                this.field213.method468(this.field546);
                this.field213.method468(this.field412);
                this.field213.method468(this.field162);
            }
            if (super.field1194 >= 135 && super.field1194 <= 235 && super.field1195 >= 467 && super.field1195 <= 499) {
                this.field412 = (this.field412 + 1) % 3;
                this.field310 = true;
                this.field100 = true;
                this.field213.method467(16, 832);
                this.field213.method468(this.field546);
                this.field213.method468(this.field412);
                this.field213.method468(this.field162);
            }
            if (super.field1194 >= 273 && super.field1194 <= 373 && super.field1195 >= 467 && super.field1195 <= 499) {
                this.field162 = (this.field162 + 1) % 3;
                this.field310 = true;
                this.field100 = true;
                this.field213.method467(16, 832);
                this.field213.method468(this.field546);
                this.field213.method468(this.field412);
                this.field213.method468(this.field162);
            }
            if (super.field1194 >= 412 && super.field1194 <= 512 && super.field1195 >= 467 && super.field1195 <= 499) {
                if (this.field268 == -1) {
                    this.method97(-171);
                    this.field308 = "";
                    this.field114 = false;
                    for (int var2 = 0; var2 < class34.field1057.length; ++var2) {
                        if (class34.field1057[var2] != null && class34.field1057[var2].field1027 == 600) {
                            this.field320 = this.field268 = class34.field1057[var2].field1001;
                            return;
                        }
                    }
                    return;
                }
                this.method155(-531, 0, "Please close the interface you have open before using 'report abuse'", "");
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "t", descriptor = "(I)V")
    public static final void method71(int arg0) {
        class71.field1650 = true;
        class31.field964 = true;
        field235 = true;
        class51.field1314 = true;
        class13.field668 = true;
        if (arg0 == 8) {
            ;
        }
    }

    @OriginalMember(owner = "client", name = "u", descriptor = "(I)V")
    public void method72(int arg0) {
        System.out.println("============");
        System.out.println("flame-cycle:" + this.field87);
        if (this.field324 != null) {
            System.out.println("Od-cycle:" + this.field324.field1454);
        }
        System.out.println("loop-cycle:" + field330);
        if (arg0 != 0) {
            this.field213.method468(38);
        }
        System.out.println("draw-cycle:" + field520);
        System.out.println("ptype:" + this.field121);
        System.out.println("psize:" + this.field120);
        if (this.field173 != null) {
            this.field173.method356(0);
        }
        super.field1176 = true;
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(I)Ljava/awt/Component;")
    public final Component method73(int arg0) {
        if (arg0 != -13961) {
            this.field376 = null;
        }
        if (signlink.mainapp != null) {
            return signlink.mainapp;
        } else {
            return super.field1182 != null ? super.field1182 : this;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LKFCZNNDM;IIIIZIIB)V")
    public final void method74(class34 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, byte arg8) {
        if (this.field146) {
            this.field361 = 32;
        } else {
            this.field361 = 0;
        }
        this.field146 = false;
        if (arg8 != 2) {
            this.field452 = this.field454.method461();
        }
        if (arg3 >= arg4 && arg3 < arg4 + 16 && arg7 >= arg6 && arg7 < arg6 + 16) {
            arg0.field1049 -= this.field468 * 4;
            if (arg5) {
                this.field504 = true;
                return;
            }
        } else if (arg3 >= arg4 && arg3 < arg4 + 16 && arg7 >= arg1 + arg6 - 16 && arg7 < arg1 + arg6) {
            arg0.field1049 += this.field468 * 4;
            if (arg5) {
                this.field504 = true;
                return;
            }
        } else {
            if (arg3 < arg4 - this.field361 || arg3 >= arg4 + 16 + this.field361 || arg7 < arg6 + 16 || arg7 >= arg1 + arg6 - 16 || this.field468 <= 0) {
                return;
            }
            int var10 = (arg1 - 32) * arg1 / arg2;
            if (var10 < 8) {
                var10 = 8;
            }
            int var11 = arg7 - arg6 - 16 - var10 / 2;
            int var12 = arg1 - 32 - var10;
            arg0.field1049 = (arg2 - arg1) * var11 / var12;
            if (arg5) {
                this.field504 = true;
            }
            this.field146 = true;
        }
    }

    @OriginalMember(owner = "client", name = "v", descriptor = "(I)V")
    public static final void method75(int arg0) {
        if (arg0 <= 0) {
            for (int var1 = 1; var1 > 0; ++var1) {
            }
        }
        class71.field1650 = false;
        class31.field964 = false;
        field235 = false;
        class51.field1314 = false;
        class13.field668 = false;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIII)V")
    public final void method76(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 != 4) {
            this.field121 = this.field251.method478();
        }
        this.field207.method533(-41075, arg2, arg3);
        this.field208.method533(-41075, arg2 + arg5 - 16, arg3);
        class36.method344(16, this.field453, true, arg2 + 16, arg3, arg5 - 32);
        int var7 = (arg5 - 32) * arg5 / arg1;
        if (var7 < 8) {
            var7 = 8;
        }
        int var8 = (arg5 - 32 - var7) * arg4 / (arg1 - arg5);
        class36.method344(16, this.field265, true, arg2 + 16 + var8, arg3, var7);
        class36.method349(arg3, 964, var7, arg2 + 16 + var8, this.field515);
        class36.method349(arg3 + 1, 964, var7, arg2 + 16 + var8, this.field515);
        class36.method347(16, arg2 + 16 + var8, 0, this.field515, arg3);
        class36.method347(16, arg2 + 17 + var8, 0, this.field515, arg3);
        class36.method349(arg3 + 15, 964, var7, arg2 + 16 + var8, this.field432);
        class36.method349(arg3 + 14, 964, var7 - 1, arg2 + 17 + var8, this.field432);
        class36.method347(16, arg2 + 15 + var8 + var7, 0, this.field432, arg3);
        class36.method347(15, arg2 + 14 + var8 + var7, 0, this.field432, arg3 + 1);
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIZLKFCZNNDM;I)V")
    public final void method77(int arg0, int arg1, int arg2, int arg3, boolean arg4, class34 arg5, int arg6) {
        if (arg4) {
            this.field121 = -1;
        }
        if (arg5.field1058 == 0 && arg5.field1031 != null && !arg5.field1015) {
            if (arg2 >= arg6 && arg3 >= arg0 && arg2 <= arg5.field1033 + arg6 && arg3 <= arg5.field1056 + arg0) {
                int var8 = arg5.field1031.length;
                for (int var9 = 0; var9 < var8; ++var9) {
                    int var10 = arg5.field1011[var9] + arg6;
                    int var11 = arg5.field1024[var9] + arg0 - arg1;
                    class34 var12 = class34.field1057[arg5.field1031[var9]];
                    int var13 = var12.field1018 + var10;
                    int var14 = var12.field1000 + var11;
                    if ((var12.field1060 >= 0 || var12.field1013 != 0) && arg2 >= var13 && arg3 >= var14 && arg2 < var12.field1033 + var13 && arg3 < var12.field1056 + var14) {
                        if (var12.field1060 >= 0) {
                            this.field203 = var12.field1060;
                        } else {
                            this.field203 = var12.field1043;
                        }
                    }
                    if (var12.field1058 == 0) {
                        this.method77(var14, var12.field1049, arg2, arg3, this.field507, var12, var13);
                        if (var12.field1025 > var12.field1056) {
                            this.method74(var12, var12.field1056, var12.field1025, arg2, var12.field1033 + var13, true, var14, arg3, (byte) 2);
                        }
                    } else {
                        if (var12.field1059 == 1 && arg2 >= var13 && arg3 >= var14 && arg2 < var12.field1033 + var13 && arg3 < var12.field1056 + var14) {
                            boolean var15 = false;
                            if (var12.field1027 != 0) {
                                var15 = this.method67(312, var12);
                            }
                            if (!var15) {
                                this.field215[this.field545] = var12.field1038;
                                this.field405[this.field545] = 927;
                                this.field404[this.field545] = var12.field1043;
                                ++this.field545;
                            }
                        }
                        if (var12.field1059 == 2 && this.field256 == 0 && arg2 >= var13 && arg3 >= var14 && arg2 < var12.field1033 + var13 && arg3 < var12.field1056 + var14) {
                            String var16 = var12.field997;
                            if (var16.indexOf(" ") != -1) {
                                var16 = var16.substring(0, var16.indexOf(" "));
                            }
                            this.field215[this.field545] = var16 + " @gre@" + var12.field1017;
                            this.field405[this.field545] = 743;
                            this.field404[this.field545] = var12.field1043;
                            ++this.field545;
                        }
                        if (var12.field1059 == 3 && arg2 >= var13 && arg3 >= var14 && arg2 < var12.field1033 + var13 && arg3 < var12.field1056 + var14) {
                            this.field215[this.field545] = "Close";
                            this.field405[this.field545] = 974;
                            this.field404[this.field545] = var12.field1043;
                            ++this.field545;
                        }
                        if (var12.field1059 == 4 && arg2 >= var13 && arg3 >= var14 && arg2 < var12.field1033 + var13 && arg3 < var12.field1056 + var14) {
                            this.field215[this.field545] = var12.field1038;
                            this.field405[this.field545] = 222;
                            this.field404[this.field545] = var12.field1043;
                            ++this.field545;
                        }
                        if (var12.field1059 == 5 && arg2 >= var13 && arg3 >= var14 && arg2 < var12.field1033 + var13 && arg3 < var12.field1056 + var14) {
                            this.field215[this.field545] = var12.field1038;
                            this.field405[this.field545] = 872;
                            this.field404[this.field545] = var12.field1043;
                            ++this.field545;
                        }
                        if (var12.field1059 == 6 && !this.field132 && arg2 >= var13 && arg3 >= var14 && arg2 < var12.field1033 + var13 && arg3 < var12.field1056 + var14) {
                            this.field215[this.field545] = var12.field1038;
                            this.field405[this.field545] = 731;
                            this.field404[this.field545] = var12.field1043;
                            ++this.field545;
                        }
                        if (var12.field1058 == 2) {
                            int var17 = 0;
                            for (int var18 = 0; var18 < var12.field1056; ++var18) {
                                for (int var19 = 0; var19 < var12.field1033; ++var19) {
                                    int var20 = (var12.field1037 + 32) * var19 + var13;
                                    int var21 = (var12.field1023 + 32) * var18 + var14;
                                    if (var17 < 20) {
                                        var20 += var12.field1052[var17];
                                        var21 += var12.field1042[var17];
                                    }
                                    if (arg2 >= var20 && arg3 >= var21 && arg2 < var20 + 32 && arg3 < var21 + 32) {
                                        this.field266 = var17;
                                        this.field267 = var12.field1043;
                                        if (var12.field1003[var17] > 0) {
                                            class57 var22 = class57.method437(var12.field1003[var17] - 1);
                                            if (this.field260 == 1 && var12.field1039) {
                                                if (this.field262 != var12.field1043 || this.field261 != var17) {
                                                    this.field215[this.field545] = "Use " + this.field264 + " with @lre@" + var22.field1394;
                                                    this.field405[this.field545] = 741;
                                                    this.field406[this.field545] = var22.field1397;
                                                    this.field403[this.field545] = var17;
                                                    this.field404[this.field545] = var12.field1043;
                                                    ++this.field545;
                                                }
                                            } else if (this.field256 == 1 && var12.field1039) {
                                                if ((this.field258 & 16) == 16) {
                                                    this.field215[this.field545] = this.field259 + " @lre@" + var22.field1394;
                                                    this.field405[this.field545] = 2;
                                                    this.field406[this.field545] = var22.field1397;
                                                    this.field403[this.field545] = var17;
                                                    this.field404[this.field545] = var12.field1043;
                                                    ++this.field545;
                                                }
                                            } else {
                                                if (var12.field1039) {
                                                    for (int var23 = 4; var23 >= 3; --var23) {
                                                        if (var22.field1429 != null && var22.field1429[var23] != null) {
                                                            this.field215[this.field545] = var22.field1429[var23] + " @lre@" + var22.field1394;
                                                            if (var23 == 3) {
                                                                this.field405[this.field545] = 652;
                                                            }
                                                            if (var23 == 4) {
                                                                this.field405[this.field545] = 996;
                                                            }
                                                            this.field406[this.field545] = var22.field1397;
                                                            this.field403[this.field545] = var17;
                                                            this.field404[this.field545] = var12.field1043;
                                                            ++this.field545;
                                                        } else if (var23 == 4) {
                                                            this.field215[this.field545] = "Drop @lre@" + var22.field1394;
                                                            this.field405[this.field545] = 996;
                                                            this.field406[this.field545] = var22.field1397;
                                                            this.field403[this.field545] = var17;
                                                            this.field404[this.field545] = var12.field1043;
                                                            ++this.field545;
                                                        }
                                                    }
                                                }
                                                if (var12.field1028) {
                                                    this.field215[this.field545] = "Use @lre@" + var22.field1394;
                                                    this.field405[this.field545] = 237;
                                                    this.field406[this.field545] = var22.field1397;
                                                    this.field403[this.field545] = var17;
                                                    this.field404[this.field545] = var12.field1043;
                                                    ++this.field545;
                                                }
                                                if (var12.field1039 && var22.field1429 != null) {
                                                    for (int var24 = 2; var24 >= 0; --var24) {
                                                        if (var22.field1429[var24] != null) {
                                                            this.field215[this.field545] = var22.field1429[var24] + " @lre@" + var22.field1394;
                                                            if (var24 == 0) {
                                                                this.field405[this.field545] = 276;
                                                            }
                                                            if (var24 == 1) {
                                                                this.field405[this.field545] = 428;
                                                            }
                                                            if (var24 == 2) {
                                                                this.field405[this.field545] = 921;
                                                            }
                                                            this.field406[this.field545] = var22.field1397;
                                                            this.field403[this.field545] = var17;
                                                            this.field404[this.field545] = var12.field1043;
                                                            ++this.field545;
                                                        }
                                                    }
                                                }
                                                if (var12.field1009 != null) {
                                                    for (int var25 = 4; var25 >= 0; --var25) {
                                                        if (var12.field1009[var25] != null) {
                                                            this.field215[this.field545] = var12.field1009[var25] + " @lre@" + var22.field1394;
                                                            if (var25 == 0) {
                                                                this.field405[this.field545] = 97;
                                                            }
                                                            if (var25 == 1) {
                                                                this.field405[this.field545] = 657;
                                                            }
                                                            if (var25 == 2) {
                                                                this.field405[this.field545] = 298;
                                                            }
                                                            if (var25 == 3) {
                                                                this.field405[this.field545] = 601;
                                                            }
                                                            if (var25 == 4) {
                                                                this.field405[this.field545] = 855;
                                                            }
                                                            this.field406[this.field545] = var22.field1397;
                                                            this.field403[this.field545] = var17;
                                                            this.field404[this.field545] = var12.field1043;
                                                            ++this.field545;
                                                        }
                                                    }
                                                }
                                                this.field215[this.field545] = "Examine @lre@" + var22.field1394;
                                                this.field405[this.field545] = 1562;
                                                this.field406[this.field545] = var22.field1397;
                                                this.field403[this.field545] = var17;
                                                this.field404[this.field545] = var12.field1043;
                                                ++this.field545;
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

    @OriginalMember(owner = "client", name = "w", descriptor = "(I)V")
    public final void method78(int arg0) {
        if (arg0 != 5) {
            this.field274 = 372;
        }
        if (super.field1193 == 1) {
            if (super.field1194 >= 539 && super.field1194 <= 573 && super.field1195 >= 169 && super.field1195 < 205 && this.field319[0] != -1) {
                this.field504 = true;
                this.field115 = 0;
                this.field388 = true;
            }
            if (super.field1194 >= 569 && super.field1194 <= 599 && super.field1195 >= 168 && super.field1195 < 205 && this.field319[1] != -1) {
                this.field504 = true;
                this.field115 = 1;
                this.field388 = true;
            }
            if (super.field1194 >= 597 && super.field1194 <= 627 && super.field1195 >= 168 && super.field1195 < 205 && this.field319[2] != -1) {
                this.field504 = true;
                this.field115 = 2;
                this.field388 = true;
            }
            if (super.field1194 >= 625 && super.field1194 <= 669 && super.field1195 >= 168 && super.field1195 < 203 && this.field319[3] != -1) {
                this.field504 = true;
                this.field115 = 3;
                this.field388 = true;
            }
            if (super.field1194 >= 666 && super.field1194 <= 696 && super.field1195 >= 168 && super.field1195 < 205 && this.field319[4] != -1) {
                this.field504 = true;
                this.field115 = 4;
                this.field388 = true;
            }
            if (super.field1194 >= 694 && super.field1194 <= 724 && super.field1195 >= 168 && super.field1195 < 205 && this.field319[5] != -1) {
                this.field504 = true;
                this.field115 = 5;
                this.field388 = true;
            }
            if (super.field1194 >= 722 && super.field1194 <= 756 && super.field1195 >= 169 && super.field1195 < 205 && this.field319[6] != -1) {
                this.field504 = true;
                this.field115 = 6;
                this.field388 = true;
            }
            if (super.field1194 >= 540 && super.field1194 <= 574 && super.field1195 >= 466 && super.field1195 < 502 && this.field319[7] != -1) {
                this.field504 = true;
                this.field115 = 7;
                this.field388 = true;
            }
            if (super.field1194 >= 572 && super.field1194 <= 602 && super.field1195 >= 466 && super.field1195 < 503 && this.field319[8] != -1) {
                this.field504 = true;
                this.field115 = 8;
                this.field388 = true;
            }
            if (super.field1194 >= 599 && super.field1194 <= 629 && super.field1195 >= 466 && super.field1195 < 503 && this.field319[9] != -1) {
                this.field504 = true;
                this.field115 = 9;
                this.field388 = true;
            }
            if (super.field1194 >= 627 && super.field1194 <= 671 && super.field1195 >= 467 && super.field1195 < 502 && this.field319[10] != -1) {
                this.field504 = true;
                this.field115 = 10;
                this.field388 = true;
            }
            if (super.field1194 >= 669 && super.field1194 <= 699 && super.field1195 >= 466 && super.field1195 < 503 && this.field319[11] != -1) {
                this.field504 = true;
                this.field115 = 11;
                this.field388 = true;
            }
            if (super.field1194 >= 696 && super.field1194 <= 726 && super.field1195 >= 466 && super.field1195 < 503 && this.field319[12] != -1) {
                this.field504 = true;
                this.field115 = 12;
                this.field388 = true;
            }
            if (super.field1194 >= 724 && super.field1194 <= 758 && super.field1195 >= 466 && super.field1195 < 502 && this.field319[13] != -1) {
                this.field504 = true;
                this.field115 = 13;
                this.field388 = true;
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "x", descriptor = "(I)Z")
    public final boolean method79(int arg0) {
        int var2 = 76 / arg0;
        return signlink.wavereplay();
    }

    @OriginalMember(owner = "client", name = "y", descriptor = "(I)V")
    public final void method80(int arg0) {
        class13.field685.method222();
        class13.field674.method222();
        class19.field751.method222();
        class57.field1414.method222();
        class57.field1423.method222();
        class54.field1370.method222();
        if (arg0 >= 0) {
            this.field269 = this.field454.method461();
        }
        class17.field737.method222();
    }

    @OriginalMember(owner = "client", name = "z", descriptor = "(I)V")
    private final void method81(int arg0) {
        this.field120 += arg0;
        if (this.field302 == 2) {
            for (class72 var2 = (class72) this.field367.method199(); var2 != null; var2 = (class72) this.field367.method201(467)) {
                if (var2.field1720 > 0) {
                    --var2.field1720;
                }
                if (var2.field1720 == 0) {
                    if (var2.field1713 < 0 || class51.method402(var2.field1713, false, var2.field1715)) {
                        this.method53(var2.field1715, 794, var2.field1722, var2.field1724, var2.field1714, var2.field1721, var2.field1723, var2.field1713);
                        var2.method195();
                    }
                } else {
                    if (var2.field1716 > 0) {
                        --var2.field1716;
                    }
                    if (var2.field1716 == 0 && var2.field1723 >= 1 && var2.field1724 >= 1 && var2.field1723 <= 102 && var2.field1724 <= 102 && (var2.field1717 < 0 || class51.method402(var2.field1717, false, var2.field1719))) {
                        this.method53(var2.field1719, 794, var2.field1722, var2.field1724, var2.field1718, var2.field1721, var2.field1723, var2.field1717);
                        var2.field1716 = -1;
                        if (var2.field1717 == var2.field1713 && var2.field1713 == -1) {
                            var2.method195();
                        } else if (var2.field1717 == var2.field1713 && var2.field1718 == var2.field1714 && var2.field1719 == var2.field1715) {
                            var2.method195();
                        }
                    }
                }
            }
            ++field499;
            if (field499 > 1068) {
                field499 = 0;
                this.field213.method467(173, 832);
                this.field213.method468(0);
                int var3 = this.field213.field1542;
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field213.method469(9630);
                }
                this.field213.method469(18906);
                this.field213.method469((int) (Math.random() * 65536.0D));
                this.field213.method469(51983);
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field213.method469(14946);
                }
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field213.method468(185);
                }
                this.field213.method468((int) (Math.random() * 256.0D));
                this.field213.method468(69);
                this.field213.method468((int) (Math.random() * 256.0D));
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field213.method469(2883);
                }
                this.field213.method477(2, this.field213.field1542 - var3);
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(IZ)V")
    public final void method82(int arg0, boolean arg1) {
        if (field174.field587 >> 7 == this.field295 && field174.field588 >> 7 == this.field296) {
            this.field295 = 0;
        }
        int var3 = this.field421;
        if (arg0 <= 0) {
            for (int var4 = 1; var4 > 0; ++var4) {
            }
        }
        if (arg1) {
            var3 = 1;
        }
        for (int var5 = 0; var5 < var3; ++var5) {
            class54 var6;
            int var7;
            if (arg1) {
                var6 = field174;
                var7 = this.field419 << 14;
            } else {
                var6 = this.field420[this.field422[var5]];
                var7 = this.field422[var5] << 14;
            }
            if (var6 != null && var6.method1(this.field161)) {
                var6.field1363 = false;
                if ((field235 && this.field421 > 50 || this.field421 > 200) && !arg1 && var6.field616 == var6.field612) {
                    var6.field1363 = true;
                }
                int var8 = var6.field587 >> 7;
                int var9 = var6.field588 >> 7;
                if (var8 >= 0 && var8 < 104 && var9 >= 0 && var9 < 104) {
                    if (var6.field1367 != null && field330 >= var6.field1371 && field330 < var6.field1372) {
                        var6.field1363 = false;
                        var6.field1359 = this.method65(var6.field588, this.field164, false, var6.field587);
                        this.field409.method551(var6.field1359, var7, var6.field1349, var6.field1350, var6.field589, this.field164, var6.field588, var6, var6.field587, -401, var6.field1348, 60, var6.field1351);
                    } else {
                        if ((var6.field587 & 127) == 64 && (var6.field588 & 127) == 64) {
                            if (this.field363[var8][var9] == this.field532) {
                                continue;
                            }
                            this.field363[var8][var9] = this.field532;
                        }
                        var6.field1359 = this.method65(var6.field588, this.field164, false, var6.field587);
                        this.field409.method550(var6.field1359, 297, var6.field587, var6.field589, 60, this.field164, var6, var6.field588, var7, var6.field586);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "A", descriptor = "(I)V")
    public final void method83(int arg0) {
        this.field120 += arg0;
        while (true) {
            int var2;
            do {
                while (true) {
                    var2 = this.method389(807);
                    if (var2 == -1) {
                        return;
                    }
                    if (this.field268 != -1 && this.field320 == this.field268) {
                        if (var2 == 8 && this.field308.length() > 0) {
                            this.field308 = this.field308.substring(0, this.field308.length() - 1);
                        }
                        break;
                    }
                    if (this.field516) {
                        if (var2 >= 32 && var2 <= 122 && this.field247.length() < 80) {
                            this.field247 = this.field247 + (char) var2;
                            this.field100 = true;
                        }
                        if (var2 == 8 && this.field247.length() > 0) {
                            this.field247 = this.field247.substring(0, this.field247.length() - 1);
                            this.field100 = true;
                        }
                        if (var2 == 13 || var2 == 10) {
                            this.field516 = false;
                            this.field100 = true;
                            if (this.field366 == 1) {
                                long var3 = class20.method214(this.field247);
                                this.method64(var3, (byte) -85);
                            }
                            if (this.field366 == 2 && this.field458 > 0) {
                                long var5 = class20.method214(this.field247);
                                this.method43(var5, 0);
                            }
                            if (this.field366 == 3 && this.field247.length() > 0) {
                                this.field213.method467(252, 832);
                                this.field213.method468(0);
                                int var7 = this.field213.field1542;
                                this.field213.method474(this.field136, (byte) 6);
                                class23.method224(false, this.field213, this.field247);
                                this.field213.method477(2, this.field213.field1542 - var7);
                                this.field247 = class23.method225(this.field247, 0);
                                this.field247 = class35.method311(this.field247, 0);
                                this.method155(-531, 6, this.field247, class20.method218(-670, class20.method215(7, this.field136)));
                                if (this.field412 == 2) {
                                    this.field412 = 1;
                                    this.field310 = true;
                                    this.field213.method467(16, 832);
                                    this.field213.method468(this.field546);
                                    this.field213.method468(this.field412);
                                    this.field213.method468(this.field162);
                                }
                            }
                            if (this.field366 == 4 && this.field433 < 100) {
                                long var8 = class20.method214(this.field247);
                                this.method91(-43975, var8);
                            }
                            if (this.field366 == 5 && this.field433 > 0) {
                                long var10 = class20.method214(this.field247);
                                this.method128(var10, false);
                            }
                        }
                    } else if (this.field471 == 1) {
                        if (var2 >= 48 && var2 <= 57 && this.field473.length() < 10) {
                            this.field473 = this.field473 + (char) var2;
                            this.field100 = true;
                        }
                        if (var2 == 8 && this.field473.length() > 0) {
                            this.field473 = this.field473.substring(0, this.field473.length() - 1);
                            this.field100 = true;
                        }
                        if (var2 == 13 || var2 == 10) {
                            if (this.field473.length() > 0) {
                                int var12 = 0;
                                try {
                                    var12 = Integer.parseInt(this.field473);
                                } catch (Exception var22) {
                                }
                                this.field213.method467(211, 832);
                                this.field213.method472(var12);
                            }
                            this.field471 = 0;
                            this.field100 = true;
                        }
                    } else if (this.field471 == 2) {
                        if (var2 >= 32 && var2 <= 122 && this.field473.length() < 12) {
                            this.field473 = this.field473 + (char) var2;
                            this.field100 = true;
                        }
                        if (var2 == 8 && this.field473.length() > 0) {
                            this.field473 = this.field473.substring(0, this.field473.length() - 1);
                            this.field100 = true;
                        }
                        if (var2 == 13 || var2 == 10) {
                            if (this.field473.length() > 0) {
                                this.field213.method467(227, 832);
                                this.field213.method474(class20.method214(this.field473), (byte) 6);
                            }
                            this.field471 = 0;
                            this.field100 = true;
                        }
                    } else if (this.field322 == -1) {
                        if (var2 >= 32 && var2 <= 122 && this.field533.length() < 80) {
                            this.field533 = this.field533 + (char) var2;
                            this.field100 = true;
                        }
                        if (var2 == 8 && this.field533.length() > 0) {
                            this.field533 = this.field533.substring(0, this.field533.length() - 1);
                            this.field100 = true;
                        }
                        if ((var2 == 13 || var2 == 10) && this.field533.length() > 0) {
                            if (this.field417 == 2) {
                                if (this.field533.equals("::clientdrop")) {
                                    this.method39(763);
                                }
                                if (this.field533.equals("::lag")) {
                                    this.method72(0);
                                }
                                if (this.field533.equals("::prefetchmusic")) {
                                    for (int var13 = 0; var13 < this.field324.method439(2, (byte) 4); ++var13) {
                                        this.field324.method447(var13, 45785, 2, (byte) 1);
                                    }
                                }
                                if (this.field533.equals("::fpson")) {
                                    field315 = true;
                                }
                                if (this.field533.equals("::fpsoff")) {
                                    field315 = false;
                                }
                                if (this.field533.equals("::noclip")) {
                                    for (int var14 = 0; var14 < 4; ++var14) {
                                        for (int var15 = 1; var15 < 103; ++var15) {
                                            for (int var16 = 1; var16 < 103; ++var16) {
                                                this.field103[var14].field1567[var15][var16] = 0;
                                            }
                                        }
                                    }
                                }
                            }
                            if (this.field533.startsWith("::")) {
                                this.field213.method467(180, 832);
                                this.field213.method468(this.field533.length() - 1);
                                this.field213.method475(this.field533.substring(2));
                            } else {
                                String var17 = this.field533.toLowerCase();
                                byte var18 = 0;
                                if (var17.startsWith("yellow:")) {
                                    var18 = 0;
                                    this.field533 = this.field533.substring(7);
                                } else if (var17.startsWith("red:")) {
                                    var18 = 1;
                                    this.field533 = this.field533.substring(4);
                                } else if (var17.startsWith("green:")) {
                                    var18 = 2;
                                    this.field533 = this.field533.substring(6);
                                } else if (var17.startsWith("cyan:")) {
                                    var18 = 3;
                                    this.field533 = this.field533.substring(5);
                                } else if (var17.startsWith("purple:")) {
                                    var18 = 4;
                                    this.field533 = this.field533.substring(7);
                                } else if (var17.startsWith("white:")) {
                                    var18 = 5;
                                    this.field533 = this.field533.substring(6);
                                } else if (var17.startsWith("flash1:")) {
                                    var18 = 6;
                                    this.field533 = this.field533.substring(7);
                                } else if (var17.startsWith("flash2:")) {
                                    var18 = 7;
                                    this.field533 = this.field533.substring(7);
                                } else if (var17.startsWith("flash3:")) {
                                    var18 = 8;
                                    this.field533 = this.field533.substring(7);
                                } else if (var17.startsWith("glow1:")) {
                                    var18 = 9;
                                    this.field533 = this.field533.substring(6);
                                } else if (var17.startsWith("glow2:")) {
                                    var18 = 10;
                                    this.field533 = this.field533.substring(6);
                                } else if (var17.startsWith("glow3:")) {
                                    var18 = 11;
                                    this.field533 = this.field533.substring(6);
                                }
                                String var19 = this.field533.toLowerCase();
                                byte var20 = 0;
                                if (var19.startsWith("wave:")) {
                                    var20 = 1;
                                    this.field533 = this.field533.substring(5);
                                } else if (var19.startsWith("wave2:")) {
                                    var20 = 2;
                                    this.field533 = this.field533.substring(6);
                                } else if (var19.startsWith("shake:")) {
                                    var20 = 3;
                                    this.field533 = this.field533.substring(6);
                                } else if (var19.startsWith("scroll:")) {
                                    var20 = 4;
                                    this.field533 = this.field533.substring(7);
                                } else if (var19.startsWith("slide:")) {
                                    var20 = 5;
                                    this.field533 = this.field533.substring(6);
                                }
                                this.field213.method467(119, 832);
                                this.field213.method468(0);
                                int var21 = this.field213.field1542;
                                this.field213.method468(var18);
                                this.field526.field1542 = 0;
                                class23.method224(false, this.field526, this.field533);
                                this.field213.method476(641, this.field526.field1542, 0, this.field526.field1541);
                                this.field213.method468(var20);
                                this.field213.method477(2, this.field213.field1542 - var21);
                                this.field533 = class23.method225(this.field533, 0);
                                this.field533 = class35.method311(this.field533, 0);
                                field174.field584 = this.field533;
                                field174.field621 = var18;
                                field174.field629 = var20;
                                field174.field602 = 150;
                                if (this.field417 == 2) {
                                    this.method155(-531, 2, field174.field584, "@cr2@" + field174.field1360);
                                } else if (this.field417 == 1) {
                                    this.method155(-531, 2, field174.field584, "@cr1@" + field174.field1360);
                                } else {
                                    this.method155(-531, 2, field174.field584, field174.field1360);
                                }
                                if (this.field546 == 2) {
                                    this.field546 = 3;
                                    this.field310 = true;
                                    this.field213.method467(16, 832);
                                    this.field213.method468(this.field546);
                                    this.field213.method468(this.field412);
                                    this.field213.method468(this.field162);
                                }
                            }
                            this.field533 = "";
                            this.field100 = true;
                        }
                    }
                }
            } while ((var2 < 97 || var2 > 122) && (var2 < 65 || var2 > 90) && (var2 < 48 || var2 > 57) && var2 != 32);
            if (this.field308.length() < 12) {
                this.field308 = this.field308 + (char) var2;
            }
        }
    }

    @OriginalMember(owner = "client", name = "init", descriptor = "()V")
    public final void init() {
        field232 = Integer.parseInt(this.getParameter("nodeid"));
        field233 = Integer.parseInt(this.getParameter("portoff"));
        String var1 = this.getParameter("lowmem");
        if (var1 != null && var1.equals("1")) {
            method71(8);
        } else {
            method75(424);
        }
        String var2 = this.getParameter("free");
        if (var2 != null && var2.equals("1")) {
            field234 = false;
        } else {
            field234 = true;
        }
        this.method386(765, 503, -605);
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(Z)V")
    public final void method84(boolean arg0) {
        if (this.field260 == 0 && this.field256 == 0) {
            this.field215[this.field545] = "Walk here";
            this.field405[this.field545] = 252;
            this.field403[this.field545] = super.field1187;
            this.field404[this.field545] = super.field1188;
            ++this.field545;
        }
        int var2 = -1;
        for (int var3 = 0; var3 < class27.field924; ++var3) {
            int var4 = class27.field925[var3];
            int var5 = var4 & 127;
            int var6 = var4 >> 7 & 127;
            int var7 = var4 >> 29 & 3;
            int var8 = var4 >> 14 & 32767;
            if (var2 != var4) {
                var2 = var4;
                if (var7 == 2 && this.field409.method569(this.field164, var5, var6, var4) >= 0) {
                    class13 var9 = class13.method194(var8);
                    if (var9.field682 != null) {
                        var9 = var9.method189(-814);
                    }
                    if (var9 == null) {
                        continue;
                    }
                    if (this.field260 == 1) {
                        this.field215[this.field545] = "Use " + this.field264 + " with @cya@" + var9.field686;
                        this.field405[this.field545] = 521;
                        this.field406[this.field545] = var4;
                        this.field403[this.field545] = var5;
                        this.field404[this.field545] = var6;
                        ++this.field545;
                    } else if (this.field256 == 1) {
                        if ((this.field258 & 4) == 4) {
                            this.field215[this.field545] = this.field259 + " @cya@" + var9.field686;
                            this.field405[this.field545] = 502;
                            this.field406[this.field545] = var4;
                            this.field403[this.field545] = var5;
                            this.field404[this.field545] = var6;
                            ++this.field545;
                        }
                    } else {
                        if (var9.field651 != null) {
                            for (int var10 = 4; var10 >= 0; --var10) {
                                if (var9.field651[var10] != null) {
                                    this.field215[this.field545] = var9.field651[var10] + " @cya@" + var9.field686;
                                    if (var10 == 0) {
                                        this.field405[this.field545] = 516;
                                    }
                                    if (var10 == 1) {
                                        this.field405[this.field545] = 656;
                                    }
                                    if (var10 == 2) {
                                        this.field405[this.field545] = 294;
                                    }
                                    if (var10 == 3) {
                                        this.field405[this.field545] = 190;
                                    }
                                    if (var10 == 4) {
                                        this.field405[this.field545] = 1190;
                                    }
                                    this.field406[this.field545] = var4;
                                    this.field403[this.field545] = var5;
                                    this.field404[this.field545] = var6;
                                    ++this.field545;
                                }
                            }
                        }
                        this.field215[this.field545] = "Examine @cya@" + var9.field686;
                        this.field405[this.field545] = 1579;
                        this.field406[this.field545] = var9.field664 << 14;
                        this.field403[this.field545] = var5;
                        this.field404[this.field545] = var6;
                        ++this.field545;
                    }
                }
                if (var7 == 1) {
                    class1 var11 = this.field527[var8];
                    if (var11.field5.field768 == 1 && (var11.field587 & 127) == 64 && (var11.field588 & 127) == 64) {
                        for (int var12 = 0; var12 < this.field528; ++var12) {
                            class1 var15 = this.field527[this.field529[var12]];
                            if (var15 != null && var11 != var15 && var15.field5.field768 == 1 && var11.field587 == var15.field587 && var11.field588 == var15.field588) {
                                this.method61(false, this.field529[var12], var5, var15.field5, var6);
                            }
                        }
                        for (int var13 = 0; var13 < this.field421; ++var13) {
                            class54 var14 = this.field420[this.field422[var13]];
                            if (var14 != null && var11.field587 == var14.field587 && var11.field588 == var14.field588) {
                                this.method69(var6, 8, var14, this.field422[var13], var5);
                            }
                        }
                    }
                    this.method61(false, var8, var5, var11.field5, var6);
                }
                if (var7 == 0) {
                    class54 var16 = this.field420[var8];
                    if ((var16.field587 & 127) == 64 && (var16.field588 & 127) == 64) {
                        for (int var17 = 0; var17 < this.field528; ++var17) {
                            class1 var20 = this.field527[this.field529[var17]];
                            if (var20 != null && var20.field5.field768 == 1 && var16.field587 == var20.field587 && var16.field588 == var20.field588) {
                                this.method61(false, this.field529[var17], var5, var20.field5, var6);
                            }
                        }
                        for (int var18 = 0; var18 < this.field421; ++var18) {
                            class54 var19 = this.field420[this.field422[var18]];
                            if (var19 != null && var16 != var19 && var16.field587 == var19.field587 && var16.field588 == var19.field588) {
                                this.method69(var6, 8, var19, this.field422[var18], var5);
                            }
                        }
                    }
                    this.method69(var6, 8, var16, var8, var5);
                }
                if (var7 == 3) {
                    class16 var21 = this.field376[this.field164][var5][var6];
                    if (var21 != null) {
                        for (class42 var22 = (class42) var21.method200(0); var22 != null; var22 = (class42) var21.method202(0)) {
                            class57 var23 = class57.method437(var22.field1137);
                            if (this.field260 == 1) {
                                this.field215[this.field545] = "Use " + this.field264 + " with @lre@" + var23.field1394;
                                this.field405[this.field545] = 726;
                                this.field406[this.field545] = var22.field1137;
                                this.field403[this.field545] = var5;
                                this.field404[this.field545] = var6;
                                ++this.field545;
                            } else if (this.field256 == 1) {
                                if ((this.field258 & 1) == 1) {
                                    this.field215[this.field545] = this.field259 + " @lre@" + var23.field1394;
                                    this.field405[this.field545] = 962;
                                    this.field406[this.field545] = var22.field1137;
                                    this.field403[this.field545] = var5;
                                    this.field404[this.field545] = var6;
                                    ++this.field545;
                                }
                            } else {
                                for (int var24 = 4; var24 >= 0; --var24) {
                                    if (var23.field1386 != null && var23.field1386[var24] != null) {
                                        this.field215[this.field545] = var23.field1386[var24] + " @lre@" + var23.field1394;
                                        if (var24 == 0) {
                                            this.field405[this.field545] = 71;
                                        }
                                        if (var24 == 1) {
                                            this.field405[this.field545] = 154;
                                        }
                                        if (var24 == 2) {
                                            this.field405[this.field545] = 560;
                                        }
                                        if (var24 == 3) {
                                            this.field405[this.field545] = 596;
                                        }
                                        if (var24 == 4) {
                                            this.field405[this.field545] = 301;
                                        }
                                        this.field406[this.field545] = var22.field1137;
                                        this.field403[this.field545] = var5;
                                        this.field404[this.field545] = var6;
                                        ++this.field545;
                                    } else if (var24 == 2) {
                                        this.field215[this.field545] = "Take @lre@" + var23.field1394;
                                        this.field405[this.field545] = 560;
                                        this.field406[this.field545] = var22.field1137;
                                        this.field403[this.field545] = var5;
                                        this.field404[this.field545] = var6;
                                        ++this.field545;
                                    }
                                }
                                this.field215[this.field545] = "Examine @lre@" + var23.field1394;
                                this.field405[this.field545] = 1038;
                                this.field406[this.field545] = var22.field1137;
                                this.field403[this.field545] = var5;
                                this.field404[this.field545] = var6;
                                ++this.field545;
                            }
                        }
                    }
                }
            }
        }
        if (!arg0) {
            this.field465 = !this.field465;
        }
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(Z)V")
    public final void method85(boolean arg0) {
        if (arg0) {
            this.field236 = !this.field236;
        }
        try {
            int var2 = field174.field587 + this.field345;
            int var3 = field174.field588 + this.field389;
            if (this.field104 - var2 < -500 || this.field104 - var2 > 500 || this.field105 - var3 < -500 || this.field105 - var3 > 500) {
                this.field104 = var2;
                this.field105 = var3;
            }
            if (this.field104 != var2) {
                this.field104 += (var2 - this.field104) / 16;
            }
            if (this.field105 != var3) {
                this.field105 += (var3 - this.field105) / 16;
            }
            if (super.field1197[1] == 1) {
                this.field488 += (-24 - this.field488) / 2;
            } else if (super.field1197[2] == 1) {
                this.field488 += (24 - this.field488) / 2;
            } else {
                this.field488 /= 2;
            }
            if (super.field1197[3] == 1) {
                this.field489 += (12 - this.field489) / 2;
            } else if (super.field1197[4] == 1) {
                this.field489 += (-12 - this.field489) / 2;
            } else {
                this.field489 /= 2;
            }
            this.field487 = this.field488 / 2 + this.field487 & 2047;
            this.field486 += this.field489 / 2;
            if (this.field486 < 128) {
                this.field486 = 128;
            }
            if (this.field486 > 383) {
                this.field486 = 383;
            }
            int var4 = this.field104 >> 7;
            int var5 = this.field105 >> 7;
            int var6 = this.method65(this.field105, this.field164, false, this.field104);
            int var7 = 0;
            if (var4 > 3 && var5 > 3 && var4 < 100 && var5 < 100) {
                for (int var8 = var4 - 4; var8 <= var4 + 4; ++var8) {
                    for (int var9 = var5 - 4; var9 <= var5 + 4; ++var9) {
                        int var10 = this.field164;
                        if (var10 < 3 && (this.field460[1][var8][var9] & 2) == 2) {
                            ++var10;
                        }
                        int var11 = var6 - this.field84[var10][var8][var9];
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
            if (var12 > this.field553) {
                this.field553 += (var12 - this.field553) / 24;
            } else if (var12 < this.field553) {
                this.field553 += (var12 - this.field553) / 80;
            }
        } catch (Exception var13) {
            signlink.reporterror("glfc_ex " + field174.field587 + "," + field174.field588 + "," + this.field104 + "," + this.field105 + "," + this.field277 + "," + this.field278 + "," + this.field125 + "," + this.field126);
            throw new RuntimeException("eek");
        }
    }

    @OriginalMember(owner = "client", name = "B", descriptor = "(I)V")
    public final void method86(int arg0) {
        if (arg0 <= 0) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        if (this.field510 == 0) {
            int var3 = super.field1177 / 2 - 80;
            int var4 = super.field1178 / 2 + 20;
            int var15 = var4 + 20;
            if (super.field1193 == 1 && super.field1194 >= var3 - 75 && super.field1194 <= var3 + 75 && super.field1195 >= var15 - 20 && super.field1195 <= var15 + 20) {
                this.field510 = 3;
                this.field375 = 0;
            }
            int var5 = super.field1177 / 2 + 80;
            if (super.field1193 == 1 && super.field1194 >= var5 - 75 && super.field1194 <= var5 + 75 && super.field1195 >= var15 - 20 && super.field1195 <= var15 + 20) {
                this.field335 = "";
                this.field336 = "Enter your username & password.";
                this.field510 = 2;
                this.field375 = 0;
            }
        } else if (this.field510 == 2) {
            int var6 = super.field1178 / 2 - 40;
            int var16 = var6 + 30;
            int var17 = var16 + 25;
            if (super.field1193 == 1 && super.field1195 >= var17 - 15 && super.field1195 < var17) {
                this.field375 = 0;
            }
            var6 = var17 + 15;
            if (super.field1193 == 1 && super.field1195 >= var6 - 15 && super.field1195 < var6) {
                this.field375 = 1;
            }
            var6 += 15;
            int var7 = super.field1177 / 2 - 80;
            int var8 = super.field1178 / 2 + 50;
            int var18 = var8 + 20;
            if (super.field1193 == 1 && super.field1194 >= var7 - 75 && super.field1194 <= var7 + 75 && super.field1195 >= var18 - 20 && super.field1195 <= var18 + 20) {
                this.field318 = 0;
                this.method154(this.field555, this.field556, false);
                if (this.field353) {
                    return;
                }
            }
            int var9 = super.field1177 / 2 + 80;
            if (super.field1193 == 1 && super.field1194 >= var9 - 75 && super.field1194 <= var9 + 75 && super.field1195 >= var18 - 20 && super.field1195 <= var18 + 20) {
                this.field510 = 0;
                this.field555 = "";
                this.field556 = "";
            }
            while (true) {
                while (true) {
                    int var10 = this.method389(807);
                    if (var10 == -1) {
                        return;
                    }
                    boolean var11 = false;
                    for (int var12 = 0; var12 < field317.length(); ++var12) {
                        if (var10 == field317.charAt(var12)) {
                            var11 = true;
                            break;
                        }
                    }
                    if (this.field375 == 0) {
                        if (var10 == 8 && this.field555.length() > 0) {
                            this.field555 = this.field555.substring(0, this.field555.length() - 1);
                        }
                        if (var10 == 9 || var10 == 10 || var10 == 13) {
                            this.field375 = 1;
                        }
                        if (var11) {
                            this.field555 = this.field555 + (char) var10;
                        }
                        if (this.field555.length() > 12) {
                            this.field555 = this.field555.substring(0, 12);
                        }
                    } else if (this.field375 == 1) {
                        if (var10 == 8 && this.field556.length() > 0) {
                            this.field556 = this.field556.substring(0, this.field556.length() - 1);
                        }
                        if (var10 == 9 || var10 == 10 || var10 == 13) {
                            this.field375 = 0;
                        }
                        if (var11) {
                            this.field556 = this.field556 + (char) var10;
                        }
                        if (this.field556.length() > 20) {
                            this.field556 = this.field556.substring(0, 20);
                        }
                    }
                }
            }
        } else {
            if (this.field510 == 3) {
                int var13 = super.field1177 / 2;
                int var14 = super.field1178 / 2 + 50;
                int var19 = var14 + 20;
                if (super.field1193 == 1 && super.field1194 >= var13 - 75 && super.field1194 <= var13 + 75 && super.field1195 >= var19 - 20 && super.field1195 <= var19 + 20) {
                    this.field510 = 0;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIILKFCZNNDM;I)V")
    public final void method87(int arg0, int arg1, int arg2, class34 arg3, int arg4) {
        if (arg4 != 0) {
            this.method44();
        }
        if (arg3.field1058 == 0 && arg3.field1031 != null) {
            if (!arg3.field1015 || this.field470 == arg3.field1043 || this.field552 == arg3.field1043 || this.field325 == arg3.field1043) {
                int var6 = class36.field1093;
                int var7 = class36.field1091;
                int var8 = class36.field1094;
                int var9 = class36.field1092;
                class36.method341(arg2, arg1, false, arg3.field1033 + arg2, arg3.field1056 + arg1);
                int var10 = arg3.field1031.length;
                for (int var11 = 0; var11 < var10; ++var11) {
                    int var12 = arg3.field1011[var11] + arg2;
                    int var13 = arg3.field1024[var11] + arg1 - arg0;
                    class34 var14 = class34.field1057[arg3.field1031[var11]];
                    int var15 = var14.field1018 + var12;
                    int var16 = var14.field1000 + var13;
                    if (var14.field1027 > 0) {
                        this.method137(var14, (byte) 9);
                    }
                    if (var14.field1058 == 0) {
                        if (var14.field1049 > var14.field1025 - var14.field1056) {
                            var14.field1049 = var14.field1025 - var14.field1056;
                        }
                        if (var14.field1049 < 0) {
                            var14.field1049 = 0;
                        }
                        this.method87(var14.field1049, var16, var15, var14, 0);
                        if (var14.field1025 > var14.field1056) {
                            this.method76(4, var14.field1025, var16, var14.field1033 + var15, var14.field1049, var14.field1056);
                        }
                    } else if (var14.field1058 != 1) {
                        if (var14.field1058 == 2) {
                            int var17 = 0;
                            for (int var18 = 0; var18 < var14.field1056; ++var18) {
                                for (int var19 = 0; var19 < var14.field1033; ++var19) {
                                    int var20 = (var14.field1037 + 32) * var19 + var15;
                                    int var21 = (var14.field1023 + 32) * var18 + var16;
                                    if (var17 < 20) {
                                        var20 += var14.field1052[var17];
                                        var21 += var14.field1042[var17];
                                    }
                                    if (var14.field1003[var17] <= 0) {
                                        if (var14.field1029 != null && var17 < 20) {
                                            class4 var30 = var14.field1029[var17];
                                            if (var30 != null) {
                                                var30.method13(-41075, var21, var20);
                                            }
                                        }
                                    } else {
                                        int var22 = 0;
                                        int var23 = 0;
                                        int var24 = var14.field1003[var17] - 1;
                                        if (var20 > class36.field1093 - 32 && var20 < class36.field1094 && var21 > class36.field1091 - 32 && var21 < class36.field1092 || this.field383 != 0 && this.field382 == var17) {
                                            int var25 = 0;
                                            if (this.field260 == 1 && this.field261 == var17 && this.field262 == var14.field1043) {
                                                var25 = 16777215;
                                            }
                                            class4 var26 = class57.method436(7, var25, var14.field1036[var17], var24);
                                            if (var26 != null) {
                                                if (this.field383 != 0 && this.field382 == var17 && this.field381 == var14.field1043) {
                                                    var22 = super.field1187 - this.field384;
                                                    var23 = super.field1188 - this.field385;
                                                    if (var22 < 5 && var22 > -5) {
                                                        var22 = 0;
                                                    }
                                                    if (var23 < 5 && var23 > -5) {
                                                        var23 = 0;
                                                    }
                                                    if (this.field199 < 5) {
                                                        var22 = 0;
                                                        var23 = 0;
                                                    }
                                                    var26.method15(128, var20 + var22, var21 + var23, true);
                                                    if (var21 + var23 < class36.field1091 && arg3.field1049 > 0) {
                                                        int var27 = (class36.field1091 - var21 - var23) * this.field498 / 3;
                                                        if (var27 > this.field498 * 10) {
                                                            var27 = this.field498 * 10;
                                                        }
                                                        if (var27 > arg3.field1049) {
                                                            var27 = arg3.field1049;
                                                        }
                                                        arg3.field1049 -= var27;
                                                        this.field385 += var27;
                                                    }
                                                    if (var21 + var23 + 32 > class36.field1092 && arg3.field1049 < arg3.field1025 - arg3.field1056) {
                                                        int var28 = (var21 + var23 + 32 - class36.field1092) * this.field498 / 3;
                                                        if (var28 > this.field498 * 10) {
                                                            var28 = this.field498 * 10;
                                                        }
                                                        if (var28 > arg3.field1025 - arg3.field1056 - arg3.field1049) {
                                                            var28 = arg3.field1025 - arg3.field1056 - arg3.field1049;
                                                        }
                                                        arg3.field1049 += var28;
                                                        this.field385 -= var28;
                                                    }
                                                } else if (this.field340 != 0 && this.field339 == var17 && this.field338 == var14.field1043) {
                                                    var26.method15(128, var20, var21, true);
                                                } else {
                                                    var26.method13(-41075, var21, var20);
                                                }
                                                if (var26.field46 == 33 || var14.field1036[var17] != 1) {
                                                    int var29 = var14.field1036[var17];
                                                    this.field511.method374(0, var21 + 10 + var23, method68((byte) 16, var29), var20 + 1 + var22, 0);
                                                    this.field511.method374(0, var21 + 9 + var23, method68((byte) 16, var29), var20 + var22, 16776960);
                                                }
                                            }
                                        }
                                    }
                                    ++var17;
                                }
                            }
                        } else if (var14.field1058 == 3) {
                            boolean var31 = false;
                            if (this.field325 == var14.field1043 || this.field552 == var14.field1043 || this.field470 == var14.field1043) {
                                var31 = true;
                            }
                            int var32;
                            if (this.method50(var14, true)) {
                                var32 = var14.field996;
                                if (var31 && var14.field1045 != 0) {
                                    var32 = var14.field1045;
                                }
                            } else {
                                var32 = var14.field1046;
                                if (var31 && var14.field1013 != 0) {
                                    var32 = var14.field1013;
                                }
                            }
                            if (var14.field999 == 0) {
                                if (var14.field1030) {
                                    class36.method344(var14.field1033, var32, true, var16, var15, var14.field1056);
                                } else {
                                    class36.method345(var14.field1033, var15, var14.field1056, var32, (byte) 6, var16);
                                }
                            } else if (var14.field1030) {
                                class36.method343(var15, var14.field1033, var14.field1056, var32, 256 - (var14.field999 & 255), var16, this.field402);
                            } else {
                                class36.method346((byte) 3, var16, 256 - (var14.field999 & 255), var14.field1033, var32, var14.field1056, var15);
                            }
                        } else if (var14.field1058 == 4) {
                            class44 var33 = var14.field1004;
                            String var34 = var14.field1002;
                            boolean var35 = false;
                            if (this.field325 == var14.field1043 || this.field552 == var14.field1043 || this.field470 == var14.field1043) {
                                var35 = true;
                            }
                            int var36;
                            if (this.method50(var14, true)) {
                                var36 = var14.field996;
                                if (var35 && var14.field1045 != 0) {
                                    var36 = var14.field1045;
                                }
                                if (var14.field1019.length() > 0) {
                                    var34 = var14.field1019;
                                }
                            } else {
                                var36 = var14.field1046;
                                if (var35 && var14.field1013 != 0) {
                                    var36 = var14.field1013;
                                }
                            }
                            if (var14.field1059 == 6 && this.field132) {
                                var34 = "Please wait...";
                                var36 = var14.field1046;
                            }
                            if (class36.field1089 == 479) {
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
                                    label349: while (true) {
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
                                                                            break label349;
                                                                        }
                                                                        var34 = var34.substring(0, var42) + this.method166(this.method101(4, this.field176, var14), this.field150) + var34.substring(var42 + 2);
                                                                    }
                                                                }
                                                                var34 = var34.substring(0, var41) + this.method166(this.method101(3, this.field176, var14), this.field150) + var34.substring(var41 + 2);
                                                            }
                                                        }
                                                        var34 = var34.substring(0, var40) + this.method166(this.method101(2, this.field176, var14), this.field150) + var34.substring(var40 + 2);
                                                    }
                                                }
                                                var34 = var34.substring(0, var39) + this.method166(this.method101(1, this.field176, var14), this.field150) + var34.substring(var39 + 2);
                                            }
                                        }
                                        var34 = var34.substring(0, var38) + this.method166(this.method101(0, this.field176, var14), this.field150) + var34.substring(var38 + 2);
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
                                if (var14.field1061) {
                                    var33.method371(var36, var14.field1033 / 2 + var15, var44, var37, var14.field1032, -89);
                                } else {
                                    var33.method378(var44, var14.field1032, var15, this.field236, var37, var36);
                                }
                                var37 += var33.field1162;
                            }
                        } else if (var14.field1058 == 5) {
                            class4 var45;
                            if (this.method50(var14, true)) {
                                var45 = var14.field1005;
                            } else {
                                var45 = var14.field1040;
                            }
                            if (var45 != null) {
                                var45.method13(-41075, var16, var15);
                            }
                        } else if (var14.field1058 == 6) {
                            int var46 = class31.field969;
                            int var47 = class31.field970;
                            class31.field969 = var14.field1033 / 2 + var15;
                            class31.field970 = var14.field1056 / 2 + var16;
                            int var48 = class31.field973[var14.field1054] * var14.field1053 >> 16;
                            int var49 = class31.field974[var14.field1054] * var14.field1053 >> 16;
                            boolean var50 = this.method50(var14, true);
                            int var51;
                            if (var50) {
                                var51 = var14.field1008;
                            } else {
                                var51 = var14.field1007;
                            }
                            class27 var52;
                            if (var51 == -1) {
                                var52 = var14.method300(this.field309, -1, var50, -1);
                            } else {
                                class24 var53 = class24.field813[var51];
                                var52 = var14.method300(this.field309, var53.field815[var14.field1044], var50, var53.field816[var14.field1044]);
                            }
                            if (var52 != null) {
                                var52.method258(0, var14.field1055, 0, var14.field1054, 0, var48, var49);
                            }
                            class31.field969 = var46;
                            class31.field970 = var47;
                        } else if (var14.field1058 == 7) {
                            class44 var54 = var14.field1004;
                            int var55 = 0;
                            for (int var56 = 0; var56 < var14.field1056; ++var56) {
                                for (int var57 = 0; var57 < var14.field1033; ++var57) {
                                    if (var14.field1003[var55] > 0) {
                                        class57 var58 = class57.method437(var14.field1003[var55] - 1);
                                        String var59 = var58.field1394;
                                        if (var58.field1387 || var14.field1036[var55] != 1) {
                                            var59 = var59 + " x" + method168(field451, var14.field1036[var55]);
                                        }
                                        int var60 = (var14.field1037 + 115) * var57 + var15;
                                        int var61 = (var14.field1023 + 12) * var56 + var16;
                                        if (var14.field1061) {
                                            var54.method371(var14.field1046, var14.field1033 / 2 + var60, var59, var61, var14.field1032, -89);
                                        } else {
                                            var54.method378(var59, var14.field1032, var60, this.field236, var61, var14.field1046);
                                        }
                                    }
                                    ++var55;
                                }
                            }
                        }
                    }
                }
                class36.method341(var6, var7, false, var8, var9);
            }
        }
    }

    @OriginalMember(owner = "client", name = "C", descriptor = "(I)V")
    public final void method88(int arg0) {
        if (this.field387 > 1) {
            --this.field387;
        }
        if (this.field124 > 0) {
            --this.field124;
        }
        for (int var2 = 0; var2 < 5 && this.method129(4); ++var2) {
        }
        if (this.field353) {
            Object var3 = this.field183.field1374;
            synchronized (this.field183.field1374) {
                if (!field177) {
                    this.field183.field1375 = 0;
                } else if (super.field1193 != 0 || this.field183.field1375 >= 40) {
                    this.field213.method467(11, 832);
                    this.field213.method468(0);
                    int var4 = this.field213.field1542;
                    int var5 = 0;
                    for (int var6 = 0; var6 < this.field183.field1375 && var4 - this.field213.field1542 < 240; ++var6) {
                        ++var5;
                        int var7 = this.field183.field1373[var6];
                        if (var7 < 0) {
                            var7 = 0;
                        } else if (var7 > 502) {
                            var7 = 502;
                        }
                        int var8 = this.field183.field1377[var6];
                        if (var8 < 0) {
                            var8 = 0;
                        } else if (var8 > 764) {
                            var8 = 764;
                        }
                        int var9 = var7 * 765 + var8;
                        if (this.field183.field1373[var6] == -1 && this.field183.field1377[var6] == -1) {
                            var8 = -1;
                            var7 = -1;
                            var9 = 524287;
                        }
                        if (this.field429 == var8 && this.field430 == var7) {
                            if (this.field537 < 2047) {
                                ++this.field537;
                            }
                        } else {
                            int var10 = var8 - this.field429;
                            this.field429 = var8;
                            int var11 = var7 - this.field430;
                            this.field430 = var7;
                            if (this.field537 < 8 && var10 >= -32 && var10 <= 31 && var11 >= -32 && var11 <= 31) {
                                var10 += 32;
                                var11 += 32;
                                this.field213.method469((this.field537 << 12) + (var10 << 6) + var11);
                                this.field537 = 0;
                            } else if (this.field537 < 8) {
                                this.field213.method471((this.field537 << 19) + 8388608 + var9);
                                this.field537 = 0;
                            } else {
                                this.field213.method472((this.field537 << 19) + -1073741824 + var9);
                                this.field537 = 0;
                            }
                        }
                    }
                    this.field213.method477(2, this.field213.field1542 - var4);
                    if (var5 >= this.field183.field1375) {
                        this.field183.field1375 = 0;
                    } else {
                        this.field183.field1375 -= var5;
                        for (int var12 = 0; var12 < this.field183.field1375; ++var12) {
                            this.field183.field1377[var12] = this.field183.field1377[var5 + var12];
                            this.field183.field1373[var12] = this.field183.field1373[var5 + var12];
                        }
                    }
                }
            }
            if (super.field1193 != 0) {
                long var13 = (super.field1196 - this.field166) / 50L;
                if (var13 > 4095L) {
                    var13 = 4095L;
                }
                this.field166 = super.field1196;
                int var15 = super.field1195;
                if (var15 < 0) {
                    var15 = 0;
                } else if (var15 > 502) {
                    var15 = 502;
                }
                int var16 = super.field1194;
                if (var16 < 0) {
                    var16 = 0;
                } else if (var16 > 764) {
                    var16 = 764;
                }
                int var17 = var15 * 765 + var16;
                byte var18 = 0;
                if (super.field1193 == 2) {
                    var18 = 1;
                }
                int var19 = (int) var13;
                this.field213.method467(217, 832);
                this.field213.method509(496, (var18 << 19) + (var19 << 20) + var17);
            }
            if (this.field106 > 0) {
                --this.field106;
            }
            if (super.field1197[1] == 1 || super.field1197[2] == 1 || super.field1197[3] == 1 || super.field1197[4] == 1) {
                this.field107 = true;
            }
            if (this.field107 && this.field106 <= 0) {
                this.field106 = 20;
                this.field107 = false;
                this.field213.method467(61, 832);
                this.field213.method502(this.field486, true);
                this.field213.method501((byte) -11, this.field487);
            }
            if (super.field1184 && !this.field117) {
                this.field117 = true;
                this.field213.method467(194, 832);
                this.field213.method468(1);
            }
            if (!super.field1184 && this.field117) {
                this.field117 = false;
                this.field213.method467(194, 832);
                this.field213.method468(0);
            }
            this.method47(-25387);
            this.method81(0);
            this.method49(-97);
            ++this.field122;
            if (this.field122 > 750) {
                this.method39(763);
            }
            this.method164((byte) 111);
            this.method111((byte) 56);
            this.method51((byte) -87);
            ++this.field498;
            if (this.field223 != 0) {
                this.field222 += 20;
                if (this.field222 >= 400) {
                    this.field223 = 0;
                }
            }
            if (this.field340 != 0) {
                ++this.field337;
                if (this.field337 >= 15) {
                    if (this.field340 == 2) {
                        this.field504 = true;
                    }
                    if (this.field340 == 3) {
                        this.field100 = true;
                    }
                    this.field340 = 0;
                }
            }
            if (this.field383 != 0) {
                ++this.field199;
                if (super.field1187 > this.field384 + 5 || super.field1187 < this.field384 - 5 || super.field1188 > this.field385 + 5 || super.field1188 < this.field385 - 5) {
                    this.field426 = true;
                }
                if (super.field1186 == 0) {
                    if (this.field383 == 2) {
                        this.field504 = true;
                    }
                    if (this.field383 == 3) {
                        this.field100 = true;
                    }
                    this.field383 = 0;
                    if (this.field426 && this.field199 >= 5) {
                        this.field267 = -1;
                        this.method110((byte) -104);
                        if (this.field381 == this.field267 && this.field382 != this.field266) {
                            class34 var20 = class34.field1057[this.field381];
                            byte var21 = 0;
                            if (this.field472 == 1 && var20.field1027 == 206) {
                                var21 = 1;
                            }
                            if (var20.field1003[this.field266] <= 0) {
                                var21 = 0;
                            }
                            if (var20.field1012) {
                                int var22 = this.field382;
                                int var23 = this.field266;
                                var20.field1003[var23] = var20.field1003[var22];
                                var20.field1036[var23] = var20.field1036[var22];
                                var20.field1003[var22] = -1;
                                var20.field1036[var22] = 0;
                            } else if (var21 == 1) {
                                int var24 = this.field382;
                                int var25 = this.field266;
                                while (var24 != var25) {
                                    if (var24 > var25) {
                                        var20.method295(712, var24 - 1, var24);
                                        --var24;
                                    } else if (var24 < var25) {
                                        var20.method295(712, var24 + 1, var24);
                                        ++var24;
                                    }
                                }
                            } else {
                                var20.method295(712, this.field266, this.field382);
                            }
                            this.field213.method467(113, 832);
                            this.field213.method503(false, this.field382);
                            this.field213.method494(var21, (byte) 9);
                            this.field213.method501((byte) -11, this.field266);
                            this.field213.method503(false, this.field381);
                        }
                    } else if ((this.field323 == 1 || this.method170(false, this.field545 - 1)) && this.field545 > 2) {
                        this.method90(-565);
                    } else if (this.field545 > 0) {
                        this.method158(this.field545 - 1, 0);
                    }
                    this.field337 = 10;
                    super.field1193 = 0;
                }
            }
            if (class71.field1684 != -1) {
                int var26 = class71.field1684;
                int var27 = class71.field1685;
                boolean var28 = this.method45(0, var27, 0, 0, field174.field620[0], 0, var26, field174.field619[0], 0, true, 0, 0);
                class71.field1684 = -1;
                if (var28) {
                    this.field220 = super.field1194;
                    this.field221 = super.field1195;
                    this.field223 = 1;
                    this.field222 = 0;
                }
            }
            if (super.field1193 == 1 && this.field229 != null) {
                this.field229 = null;
                this.field100 = true;
                super.field1193 = 0;
            }
            this.method104(0);
            this.method55(0);
            this.method78(5);
            this.method70(3960);
            if (arg0 != -24166) {
                this.field121 = -1;
            }
            if (super.field1186 == 1 || super.field1193 == 1) {
                ++this.field468;
            }
            if (this.field302 == 2) {
                this.method85(false);
            }
            if (this.field302 == 2 && this.field372) {
                this.method124(this.field435);
            }
            for (int var29 = 0; var29 < 5; ++var29) {
                int var10002 = this.field393[var29]++;
            }
            this.method83(0);
            ++super.field1185;
            if (super.field1185 > 4500) {
                this.field124 = 250;
                super.field1185 -= 500;
                this.field213.method467(162, 832);
            }
            ++this.field202;
            if (this.field202 > 500) {
                this.field202 = 0;
                int var30 = (int) (Math.random() * 8.0D);
                if ((var30 & 1) == 1) {
                    this.field345 += this.field346;
                }
                if ((var30 & 2) == 2) {
                    this.field389 += this.field390;
                }
                if ((var30 & 4) == 4) {
                    this.field275 += this.field276;
                }
            }
            if (this.field345 < -50) {
                this.field346 = 2;
            }
            if (this.field345 > 50) {
                this.field346 = -2;
            }
            if (this.field389 < -55) {
                this.field390 = 2;
            }
            if (this.field389 > 55) {
                this.field390 = -2;
            }
            if (this.field275 < -40) {
                this.field276 = 1;
            }
            if (this.field275 > 40) {
                this.field276 = -1;
            }
            ++this.field248;
            if (this.field248 > 500) {
                this.field248 = 0;
                int var31 = (int) (Math.random() * 8.0D);
                if ((var31 & 1) == 1) {
                    this.field328 += this.field329;
                }
                if ((var31 & 2) == 2) {
                    this.field130 += this.field131;
                }
            }
            if (this.field328 < -60) {
                this.field329 = 2;
            }
            if (this.field328 > 60) {
                this.field329 = -2;
            }
            if (this.field130 < -20) {
                this.field131 = 1;
            }
            if (this.field130 > 10) {
                this.field131 = -1;
            }
            ++this.field123;
            if (this.field123 > 50) {
                this.field213.method467(126, 832);
            }
            try {
                if (this.field173 != null && this.field213.field1542 > 0) {
                    this.field173.method355(0, this.field213.field1542, 0, this.field213.field1541);
                    this.field213.field1542 = 0;
                    this.field123 = 0;
                }
            } catch (IOException var33) {
                this.method39(763);
            } catch (Exception var34) {
                this.method121(this.field178);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BZ)V")
    public final void method89(byte arg0, boolean arg1) {
        this.method59(1);
        this.field187.method394(false);
        this.field548.method533(-41075, 0, 0);
        if (arg0 != 55) {
            for (int var3 = 1; var3 > 0; ++var3) {
            }
        }
        short var4 = 360;
        short var5 = 200;
        if (this.field510 == 0) {
            int var6 = var5 / 2 + 80;
            this.field511.method371(7711145, var4 / 2, this.field324.field1482, var6, true, -89);
            int var7 = var5 / 2 - 20;
            this.field513.method371(16776960, var4 / 2, "Welcome to RuneScape", var7, true, -89);
            int var18 = var7 + 30;
            int var8 = var4 / 2 - 80;
            int var9 = var5 / 2 + 20;
            this.field549.method533(-41075, var9 - 20, var8 - 73);
            this.field513.method371(16777215, var8, "New User", var9 + 5, true, -89);
            int var10 = var4 / 2 + 80;
            this.field549.method533(-41075, var9 - 20, var10 - 73);
            this.field513.method371(16777215, var10, "Existing User", var9 + 5, true, -89);
        }
        if (this.field510 == 2) {
            int var11 = var5 / 2 - 40;
            if (this.field335.length() > 0) {
                this.field513.method371(16776960, var4 / 2, this.field335, var11 - 15, true, -89);
                this.field513.method371(16776960, var4 / 2, this.field336, var11, true, -89);
                var11 += 30;
            } else {
                this.field513.method371(16776960, var4 / 2, this.field336, var11 - 7, true, -89);
                var11 += 30;
            }
            this.field513.method378("Username: " + this.field555 + (this.field375 == 0 & field330 % 40 < 20 ? "@yel@|" : ""), true, var4 / 2 - 90, this.field236, var11, 16777215);
            var11 += 15;
            this.field513.method378("Password: " + class20.method219(this.field556, this.field500) + (this.field375 == 1 & field330 % 40 < 20 ? "@yel@|" : ""), true, var4 / 2 - 88, this.field236, var11, 16777215);
            var11 += 15;
            if (!arg1) {
                int var12 = var4 / 2 - 80;
                int var13 = var5 / 2 + 50;
                this.field549.method533(-41075, var13 - 20, var12 - 73);
                this.field513.method371(16777215, var12, "Login", var13 + 5, true, -89);
                int var14 = var4 / 2 + 80;
                this.field549.method533(-41075, var13 - 20, var14 - 73);
                this.field513.method371(16777215, var14, "Cancel", var13 + 5, true, -89);
            }
        }
        if (this.field510 == 3) {
            this.field513.method371(16776960, var4 / 2, "Create a free account", var5 / 2 - 60, true, -89);
            int var15 = var5 / 2 - 35;
            this.field513.method371(16777215, var4 / 2, "To create a new account you need to", var15, true, -89);
            int var19 = var15 + 15;
            this.field513.method371(16777215, var4 / 2, "go back to the main RuneScape webpage", var19, true, -89);
            int var20 = var19 + 15;
            this.field513.method371(16777215, var4 / 2, "and choose the red 'create account'", var20, true, -89);
            int var21 = var20 + 15;
            this.field513.method371(16777215, var4 / 2, "button at the top right of that page.", var21, true, -89);
            int var22 = var21 + 15;
            int var16 = var4 / 2;
            int var17 = var5 / 2 + 50;
            this.field549.method533(-41075, var17 - 20, var16 - 73);
            this.field513.method371(16777215, var16, "Cancel", var17 + 5, true, -89);
        }
        this.field187.method395(-30874, super.field1179, 171, 202);
        if (this.field249) {
            this.field249 = false;
            this.field185.method395(-30874, super.field1179, 0, 128);
            this.field186.method395(-30874, super.field1179, 371, 202);
            this.field190.method395(-30874, super.field1179, 265, 0);
            this.field191.method395(-30874, super.field1179, 265, 562);
            this.field192.method395(-30874, super.field1179, 171, 128);
            this.field193.method395(-30874, super.field1179, 171, 562);
        }
    }

    @OriginalMember(owner = "client", name = "D", descriptor = "(I)V")
    public final void method90(int arg0) {
        int var2 = this.field513.method372("Choose Option", 23764);
        for (int var3 = 0; var3 < this.field545; ++var3) {
            int var12 = this.field513.method372(this.field215[var3], 23764);
            if (var12 > var2) {
                var2 = var12;
            }
        }
        var2 += 8;
        while (arg0 >= 0) {
            for (int var11 = 1; var11 > 0; ++var11) {
            }
        }
        int var4 = this.field545 * 15 + 21;
        if (super.field1194 > 4 && super.field1195 > 4 && super.field1194 < 516 && super.field1195 < 338) {
            int var5 = super.field1194 - 4 - var2 / 2;
            if (var2 + var5 > 512) {
                var5 = 512 - var2;
            }
            if (var5 < 0) {
                var5 = 0;
            }
            int var6 = super.field1195 - 4;
            if (var4 + var6 > 334) {
                var6 = 334 - var4;
            }
            if (var6 < 0) {
                var6 = 0;
            }
            this.field543 = true;
            this.field397 = 0;
            this.field398 = var5;
            this.field399 = var6;
            this.field400 = var2;
            this.field401 = this.field545 * 15 + 22;
        }
        if (super.field1194 > 553 && super.field1195 > 205 && super.field1194 < 743 && super.field1195 < 466) {
            int var7 = super.field1194 - 553 - var2 / 2;
            if (var7 < 0) {
                var7 = 0;
            } else if (var2 + var7 > 190) {
                var7 = 190 - var2;
            }
            int var8 = super.field1195 - 205;
            if (var8 < 0) {
                var8 = 0;
            } else if (var4 + var8 > 261) {
                var8 = 261 - var4;
            }
            this.field543 = true;
            this.field397 = 1;
            this.field398 = var7;
            this.field399 = var8;
            this.field400 = var2;
            this.field401 = this.field545 * 15 + 22;
        }
        if (super.field1194 > 17 && super.field1195 > 357 && super.field1194 < 496 && super.field1195 < 453) {
            int var9 = super.field1194 - 17 - var2 / 2;
            if (var9 < 0) {
                var9 = 0;
            } else if (var2 + var9 > 479) {
                var9 = 479 - var2;
            }
            int var10 = super.field1195 - 357;
            if (var10 < 0) {
                var10 = 0;
            } else if (var4 + var10 > 96) {
                var10 = 96 - var4;
            }
            this.field543 = true;
            this.field397 = 2;
            this.field398 = var9;
            this.field399 = var10;
            this.field400 = var2;
            this.field401 = this.field545 * 15 + 22;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IJ)V")
    public final void method91(int arg0, long arg1) {
        if (arg1 != 0L) {
            if (this.field433 >= 100) {
                this.method155(-531, 0, "Your ignore list is full. Max of 100 hit", "");
            } else {
                String var4 = class20.method218(-670, class20.method215(7, arg1));
                for (int var5 = 0; var5 < this.field433; ++var5) {
                    if (this.field116[var5] == arg1) {
                        this.method155(-531, 0, var4 + " is already on your ignore list", "");
                        return;
                    }
                }
                for (int var6 = 0; var6 < this.field458; ++var6) {
                    if (this.field272[var6] == arg1) {
                        this.method155(-531, 0, "Please remove " + var4 + " from your friend list first", "");
                        return;
                    }
                }
                if (arg0 != -43975) {
                    this.field213.method468(199);
                }
                this.field116[this.field433++] = arg1;
                this.field504 = true;
                this.field213.method467(92, 832);
                this.field213.method474(arg1, (byte) 6);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILXQPFGONL;I)V")
    private final void method92(int arg0, class62 arg1, int arg2) {
        while (arg0 >= 0) {
            this.field121 = -1;
        }
        arg1.method488(2);
        int var4 = arg1.method489(1, 0);
        if (var4 != 0) {
            int var5 = arg1.method489(2, 0);
            if (var5 == 0) {
                this.field424[this.field423++] = this.field419;
            } else if (var5 == 1) {
                int var6 = arg1.method489(3, 0);
                field174.method180(var6, 5, false);
                int var7 = arg1.method489(1, 0);
                if (var7 == 1) {
                    this.field424[this.field423++] = this.field419;
                }
            } else if (var5 == 2) {
                int var8 = arg1.method489(3, 0);
                field174.method180(var8, 5, true);
                int var9 = arg1.method489(3, 0);
                field174.method180(var9, 5, true);
                int var10 = arg1.method489(1, 0);
                if (var10 == 1) {
                    this.field424[this.field423++] = this.field419;
                }
            } else if (var5 == 3) {
                this.field164 = arg1.method489(2, 0);
                int var11 = arg1.method489(7, 0);
                int var12 = arg1.method489(1, 0);
                int var13 = arg1.method489(7, 0);
                int var14 = arg1.method489(1, 0);
                if (var14 == 1) {
                    this.field424[this.field423++] = this.field419;
                }
                field174.method183(9, var11, var13, var12 == 1);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IBII)I")
    public final int method93(int arg0, byte arg1, int arg2, int arg3) {
        if (arg1 != -43) {
            field129 = this.field454.method461();
        }
        int var5 = 256 - arg0;
        return ((arg2 & 16711935) * var5 + (arg3 & 16711935) * arg0 & -16711936) + ((arg2 & 65280) * var5 + (arg3 & 65280) * arg0 & 16711680) >> 8;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIII)Z")
    public final boolean method94(int arg0, int arg1, int arg2, int arg3) {
        int var5 = arg2 >> 14 & 32767;
        int var6 = this.field409.method569(this.field164, arg3, arg1, arg2);
        if (var6 == -1) {
            return false;
        } else {
            int var7 = var6 & 31;
            int var8 = var6 >> 6 & 3;
            if (var7 != 10 && var7 != 11 && var7 != 22) {
                this.method45(0, arg1, 2, 0, field174.field620[0], 0, arg3, field174.field619[0], var7 + 1, false, var8, 0);
            } else {
                class13 var9 = class13.method194(var5);
                int var10;
                int var11;
                if (var8 != 0 && var8 != 2) {
                    var10 = var9.field642;
                    var11 = var9.field676;
                } else {
                    var10 = var9.field676;
                    var11 = var9.field642;
                }
                int var12 = var9.field672;
                if (var8 != 0) {
                    var12 = (var12 >> 4 - var8) + (var12 << var8 & 15);
                }
                this.method45(0, arg1, 2, var11, field174.field620[0], var12, arg3, field174.field619[0], 0, false, 0, var10);
            }
            this.field220 = super.field1194;
            this.field221 = super.field1195;
            this.field223 = 2;
            this.field222 = 0;
            if (arg0 != 0) {
                this.field465 = !this.field465;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "E", descriptor = "(I)I")
    public final int method95(int arg0) {
        int var2 = 3;
        if (arg0 >= 0) {
            return 3;
        } else {
            if (this.field351 < 310) {
                int var3 = this.field348 >> 7;
                int var4 = this.field350 >> 7;
                int var5 = field174.field587 >> 7;
                int var6 = field174.field588 >> 7;
                if ((this.field460[this.field164][var3][var4] & 4) != 0) {
                    var2 = this.field164;
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
                        if ((this.field460[this.field164][var3][var4] & 4) != 0) {
                            var2 = this.field164;
                        }
                        var10 += var9;
                        if (var10 >= 65536) {
                            var10 -= 65536;
                            if (var4 < var6) {
                                ++var4;
                            } else if (var4 > var6) {
                                --var4;
                            }
                            if ((this.field460[this.field164][var3][var4] & 4) != 0) {
                                var2 = this.field164;
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
                        if ((this.field460[this.field164][var3][var4] & 4) != 0) {
                            var2 = this.field164;
                        }
                        var12 += var11;
                        if (var12 >= 65536) {
                            var12 -= 65536;
                            if (var3 < var5) {
                                ++var3;
                            } else if (var3 > var5) {
                                --var3;
                            }
                            if ((this.field460[this.field164][var3][var4] & 4) != 0) {
                                var2 = this.field164;
                            }
                        }
                    }
                }
            }
            if ((this.field460[this.field164][field174.field587 >> 7][field174.field588 >> 7] & 4) != 0) {
                var2 = this.field164;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client", name = "F", descriptor = "(I)I")
    public final int method96(int arg0) {
        if (arg0 != 8) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        int var3 = this.method65(this.field350, this.field164, false, this.field348);
        return var3 - this.field349 < 800 && (this.field460[this.field164][this.field348 >> 7][this.field350 >> 7] & 4) != 0 ? this.field164 : 3;
    }

    @OriginalMember(owner = "client", name = "G", descriptor = "(I)V")
    public final void method97(int arg0) {
        while (arg0 >= 0) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        this.field213.method467(106, 832);
        if (this.field342 != -1) {
            this.field342 = -1;
            this.field504 = true;
            this.field132 = false;
            this.field388 = true;
        }
        if (this.field322 != -1) {
            this.field322 = -1;
            this.field100 = true;
            this.field132 = false;
        }
        this.field268 = -1;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILjava/lang/String;)Z")
    public final boolean method98(int arg0, String arg1) {
        if (arg0 != 0) {
            this.field121 = -1;
        }
        if (arg1 == null) {
            return false;
        } else {
            for (int var3 = 0; var3 < this.field458; ++var3) {
                if (arg1.equalsIgnoreCase(this.field431[var3])) {
                    return true;
                }
            }
            return arg1.equalsIgnoreCase(field174.field1360);
        }
    }

    @OriginalMember(owner = "client", name = "h", descriptor = "(Z)V")
    public final void method99(boolean arg0) {
        this.method127(36089);
        if (arg0) {
            this.field269 = this.field454.method461();
        }
        if (this.field223 == 1) {
            this.field354[this.field222 / 100].method13(-41075, this.field221 - 8 - 4, this.field220 - 8 - 4);
        }
        if (this.field223 == 2) {
            this.field354[this.field222 / 100 + 4].method13(-41075, this.field221 - 8 - 4, this.field220 - 8 - 4);
            ++field497;
            if (field497 > 120) {
                field497 = 0;
                this.field213.method467(15, 832);
                this.field213.method471(5570760);
            }
        }
        if (this.field194 != -1) {
            this.method162(this.field194, true, this.field498);
            this.method87(0, 0, 0, class34.field1057[this.field194], 0);
        }
        if (this.field268 != -1) {
            this.method162(this.field268, true, this.field498);
            this.method87(0, 0, 0, class34.field1057[this.field268], 0);
        }
        this.method100(43565);
        if (!this.field543) {
            this.method110((byte) -104);
            this.method126(true);
        } else if (this.field397 == 0) {
            this.method62(false);
        }
        if (this.field481 == 1) {
            this.field413[1].method13(-41075, 296, 472);
        }
        if (field315) {
            short var2 = 507;
            byte var3 = 20;
            int var4 = 16776960;
            if (super.field1175 < 15) {
                var4 = 16711680;
            }
            this.field512.method369(var4, "Fps:" + super.field1175, (byte) 7, var2, var3);
            int var12 = var3 + 15;
            Runtime var5 = Runtime.getRuntime();
            int var6 = (int) ((var5.totalMemory() - var5.freeMemory()) / 1024L);
            int var7 = 16776960;
            if (var6 > 33554432 && field235) {
                int var8 = 16711680;
            }
            this.field512.method369(16776960, "Mem:" + var6 + "k", (byte) 7, var2, var12);
            var12 += 15;
        }
        if (this.field387 != 0) {
            int var9 = this.field387 / 50;
            int var10 = var9 / 60;
            int var11 = var9 % 60;
            if (var11 < 10) {
                this.field512.method374(0, 329, "System update in: " + var10 + ":0" + var11, 4, 16776960);
            } else {
                this.field512.method374(0, 329, "System update in: " + var10 + ":" + var11, 4, 16776960);
            }
            ++field355;
            if (field355 > 77) {
                field355 = 0;
                this.field213.method467(179, 832);
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "H", descriptor = "(I)V")
    public final void method100(int arg0) {
        this.field118 = 0;
        if (arg0 != 43565) {
            this.method44();
        }
        int var2 = (field174.field587 >> 7) + this.field125;
        int var3 = (field174.field588 >> 7) + this.field126;
        if (var2 >= 3053 && var2 <= 3156 && var3 >= 3056 && var3 <= 3136) {
            this.field118 = 1;
        }
        if (var2 >= 3072 && var2 <= 3118 && var3 >= 9492 && var3 <= 9535) {
            this.field118 = 1;
        }
        if (this.field118 == 1 && var2 >= 3139 && var2 <= 3199 && var3 >= 3008 && var3 <= 3062) {
            this.field118 = 0;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IBLKFCZNNDM;)I")
    public final int method101(int arg0, byte arg1, class34 arg2) {
        if (arg1 != 0) {
            this.field376 = null;
        }
        if (arg2.field1050 != null && arg0 < arg2.field1050.length) {
            try {
                int[] var4 = arg2.field1050[arg0];
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
                        var9 = this.field506[var4[var6++]];
                    }
                    if (var8 == 2) {
                        var9 = this.field155[var4[var6++]];
                    }
                    if (var8 == 3) {
                        var9 = this.field356[var4[var6++]];
                    }
                    if (var8 == 4) {
                        class34 var11 = class34.field1057[var4[var6++]];
                        int var12 = var4[var6++];
                        if (var12 >= 0 && var12 < class57.field1424 && (!class57.method437(var12).field1391 || field234)) {
                            for (int var13 = 0; var13 < var11.field1003.length; ++var13) {
                                if (var12 + 1 == var11.field1003[var13]) {
                                    var9 += var11.field1036[var13];
                                }
                            }
                        }
                    }
                    if (var8 == 5) {
                        var9 = this.field374[var4[var6++]];
                    }
                    if (var8 == 6) {
                        var9 = field332[this.field155[var4[var6++]] - 1];
                    }
                    if (var8 == 7) {
                        var9 = this.field374[var4[var6++]] * 100 / 46875;
                    }
                    if (var8 == 8) {
                        var9 = field174.field1346;
                    }
                    if (var8 == 9) {
                        for (int var14 = 0; var14 < class8.field80; ++var14) {
                            if (class8.field82[var14]) {
                                var9 += this.field155[var14];
                            }
                        }
                    }
                    if (var8 == 10) {
                        class34 var15 = class34.field1057[var4[var6++]];
                        int var16 = var4[var6++] + 1;
                        if (var16 >= 0 && var16 < class57.field1424 && (!class57.method437(var16).field1391 || field234)) {
                            for (int var17 = 0; var17 < var15.field1003.length; ++var17) {
                                if (var15.field1003[var17] == var16) {
                                    var9 = 999999999;
                                    break;
                                }
                            }
                        }
                    }
                    if (var8 == 11) {
                        var9 = this.field538;
                    }
                    if (var8 == 12) {
                        var9 = this.field300;
                    }
                    if (var8 == 13) {
                        int var18 = this.field374[var4[var6++]];
                        int var19 = var4[var6++];
                        var9 = (var18 & 1 << var19) != 0 ? 1 : 0;
                    }
                    if (var8 == 14) {
                        int var20 = var4[var6++];
                        class30 var21 = class30.field953[var20];
                        int var22 = var21.field955;
                        int var23 = var21.field956;
                        int var24 = var21.field957;
                        int var25 = field197[var24 - var23];
                        var9 = this.field374[var22] >> var23 & var25;
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
                        var9 = (field174.field587 >> 7) + this.field125;
                    }
                    if (var8 == 19) {
                        var9 = (field174.field588 >> 7) + this.field126;
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

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
    public final void method102(Runnable arg0, int arg1) {
        if (arg1 > 10) {
            arg1 = 10;
        }
        if (signlink.mainapp != null) {
            signlink.startthread(arg0, arg1);
        } else {
            super.method102(arg0, arg1);
        }
    }

    @OriginalMember(owner = "client", name = "I", descriptor = "(I)V")
    public final void method103(int arg0) {
        if (arg0 != -8221) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        this.field280 = 0;
        for (int var3 = -1; var3 < this.field528 + this.field421; ++var3) {
            class12 var20;
            if (var3 == -1) {
                var20 = field174;
            } else if (var3 < this.field421) {
                var20 = this.field420[this.field422[var3]];
            } else {
                var20 = this.field527[this.field529[var3 - this.field421]];
            }
            if (var20 != null && var20.method1(this.field161)) {
                if (var20 instanceof class1) {
                    class19 var21 = ((class1) var20).field5;
                    if (var21.field760 != null) {
                        var21 = var21.method208(false);
                    }
                    if (var21 == null) {
                        continue;
                    }
                }
                if (var3 >= this.field421) {
                    class19 var25 = ((class1) var20).field5;
                    if (var25.field767 >= 0 && var25.field767 < this.field413.length) {
                        this.method133(var20, var20.field604 + 15, -350);
                        if (this.field270 > -1) {
                            this.field413[var25.field767].method13(-41075, this.field271 - 30, this.field270 - 12);
                        }
                    }
                    if (this.field148 == 1 && this.field529[var3 - this.field421] == this.field241 && field330 % 20 < 10) {
                        this.method133(var20, var20.field604 + 15, -350);
                        if (this.field270 > -1) {
                            this.field413[2].method13(-41075, this.field271 - 28, this.field270 - 12);
                        }
                    }
                } else {
                    int var22 = 30;
                    class54 var23 = (class54) var20;
                    if (var23.field1347 != 0) {
                        this.method133(var20, var20.field604 + 15, -350);
                        if (this.field270 > -1) {
                            for (int var24 = 0; var24 < 8; ++var24) {
                                if ((var23.field1347 & 1 << var24) != 0) {
                                    this.field413[var24].method13(-41075, this.field271 - var22, this.field270 - 12);
                                    var22 -= 25;
                                }
                            }
                        }
                    }
                    if (var3 >= 0 && this.field148 == 10 && this.field422[var3] == this.field327) {
                        this.method133(var20, var20.field604 + 15, -350);
                        if (this.field270 > -1) {
                            this.field413[7].method13(-41075, this.field271 - var22, this.field270 - 12);
                        }
                    }
                }
                if (var20.field584 != null && (var3 >= this.field421 || this.field546 == 0 || this.field546 == 3 || this.field546 == 1 && this.method98(0, ((class54) var20).field1360))) {
                    this.method133(var20, var20.field604, -350);
                    if (this.field270 > -1 && this.field280 < this.field281) {
                        this.field285[this.field280] = this.field513.method373(var20.field584, (byte) 3) / 2;
                        this.field284[this.field280] = this.field513.field1162;
                        this.field282[this.field280] = this.field270;
                        this.field283[this.field280] = this.field271;
                        this.field286[this.field280] = var20.field621;
                        this.field287[this.field280] = var20.field629;
                        this.field288[this.field280] = var20.field602;
                        this.field289[this.field280++] = var20.field584;
                        if (this.field341 == 0 && var20.field629 >= 1 && var20.field629 <= 3) {
                            this.field284[this.field280] += 10;
                            this.field283[this.field280] += 5;
                        }
                        if (this.field341 == 0 && var20.field629 == 4) {
                            this.field285[this.field280] = 60;
                        }
                        if (this.field341 == 0 && var20.field629 == 5) {
                            this.field284[this.field280] += 5;
                        }
                    }
                }
                if (var20.field581 > field330) {
                    this.method133(var20, var20.field604 + 15, -350);
                    if (this.field270 > -1) {
                        int var26 = var20.field582 * 30 / var20.field583;
                        if (var26 > 30) {
                            var26 = 30;
                        }
                        class36.method344(var26, 65280, true, this.field271 - 3, this.field270 - 15, 5);
                        class36.method344(30 - var26, 16711680, true, this.field271 - 3, this.field270 - 15 + var26, 5);
                    }
                }
                for (int var27 = 0; var27 < 4; ++var27) {
                    if (var20.field601[var27] > field330) {
                        this.method133(var20, var20.field604 / 2, -350);
                        if (this.field270 > -1) {
                            if (var27 == 1) {
                                this.field271 -= 20;
                            }
                            if (var27 == 2) {
                                this.field270 -= 15;
                                this.field271 -= 10;
                            }
                            if (var27 == 3) {
                                this.field270 += 15;
                                this.field271 -= 10;
                            }
                            this.field153[var20.field600[var27]].method13(-41075, this.field271 - 12, this.field270 - 12);
                            this.field511.method370(String.valueOf(var20.field599[var27]), this.field270, false, 0, this.field271 + 4);
                            this.field511.method370(String.valueOf(var20.field599[var27]), this.field270 - 1, false, 16777215, this.field271 + 3);
                        }
                    }
                }
            }
        }
        for (int var4 = 0; var4 < this.field280; ++var4) {
            int var5 = this.field282[var4];
            int var6 = this.field283[var4];
            int var7 = this.field285[var4];
            int var8 = this.field284[var4];
            boolean var9 = true;
            while (var9) {
                var9 = false;
                for (int var19 = 0; var19 < var4; ++var19) {
                    if (var6 + 2 > this.field283[var19] - this.field284[var19] && var6 - var8 < this.field283[var19] + 2 && var5 - var7 < this.field285[var19] + this.field282[var19] && var5 + var7 > this.field282[var19] - this.field285[var19] && this.field283[var19] - this.field284[var19] < var6) {
                        var6 = this.field283[var19] - this.field284[var19];
                        var9 = true;
                    }
                }
            }
            this.field270 = this.field282[var4];
            this.field271 = this.field283[var4] = var6;
            String var10 = this.field289[var4];
            if (this.field341 == 0) {
                int var11 = 16776960;
                if (this.field286[var4] < 6) {
                    var11 = this.field279[this.field286[var4]];
                }
                if (this.field286[var4] == 6) {
                    var11 = this.field532 % 20 < 10 ? 16711680 : 16776960;
                }
                if (this.field286[var4] == 7) {
                    var11 = this.field532 % 20 < 10 ? 255 : 65535;
                }
                if (this.field286[var4] == 8) {
                    var11 = this.field532 % 20 < 10 ? 45056 : 8454016;
                }
                if (this.field286[var4] == 9) {
                    int var12 = 150 - this.field288[var4];
                    if (var12 < 50) {
                        var11 = var12 * 1280 + 16711680;
                    } else if (var12 < 100) {
                        var11 = 16776960 - (var12 - 50) * 327680;
                    } else if (var12 < 150) {
                        var11 = (var12 - 100) * 5 + 65280;
                    }
                }
                if (this.field286[var4] == 10) {
                    int var13 = 150 - this.field288[var4];
                    if (var13 < 50) {
                        var11 = var13 * 5 + 16711680;
                    } else if (var13 < 100) {
                        var11 = 16711935 - (var13 - 50) * 327680;
                    } else if (var13 < 150) {
                        var11 = (var13 - 100) * 327680 + 255 - (var13 - 100) * 5;
                    }
                }
                if (this.field286[var4] == 11) {
                    int var14 = 150 - this.field288[var4];
                    if (var14 < 50) {
                        var11 = 16777215 - var14 * 327685;
                    } else if (var14 < 100) {
                        var11 = (var14 - 50) * 327685 + 65280;
                    } else if (var14 < 150) {
                        var11 = 16777215 - (var14 - 100) * 327680;
                    }
                }
                if (this.field287[var4] == 0) {
                    this.field513.method370(var10, this.field270, false, 0, this.field271 + 1);
                    this.field513.method370(var10, this.field270, false, var11, this.field271);
                }
                if (this.field287[var4] == 1) {
                    this.field513.method375(var10, this.field270, this.field532, 0, this.field271 + 1, true);
                    this.field513.method375(var10, this.field270, this.field532, var11, this.field271, true);
                }
                if (this.field287[var4] == 2) {
                    this.field513.method376(var10, this.field532, this.field544, 0, this.field270, this.field271 + 1);
                    this.field513.method376(var10, this.field532, this.field544, var11, this.field270, this.field271);
                }
                if (this.field287[var4] == 3) {
                    this.field513.method377(var10, this.field532, 150 - this.field288[var4], this.field270, (byte) 6, 0, this.field271 + 1);
                    this.field513.method377(var10, this.field532, 150 - this.field288[var4], this.field270, (byte) 6, var11, this.field271);
                }
                if (this.field287[var4] == 4) {
                    int var15 = this.field513.method373(var10, (byte) 3);
                    int var16 = (150 - this.field288[var4]) * (var15 + 100) / 150;
                    class36.method341(this.field270 - 50, 0, false, this.field270 + 50, 334);
                    this.field513.method374(0, this.field271 + 1, var10, this.field270 + 50 - var16, 0);
                    this.field513.method374(0, this.field271, var10, this.field270 + 50 - var16, var11);
                    class36.method340((byte) 3);
                }
                if (this.field287[var4] == 5) {
                    int var17 = 150 - this.field288[var4];
                    int var18 = 0;
                    if (var17 < 25) {
                        var18 = var17 - 25;
                    } else if (var17 > 125) {
                        var18 = var17 - 125;
                    }
                    class36.method341(0, this.field271 - this.field513.field1162 - 1, false, 512, this.field271 + 5);
                    this.field513.method370(var10, this.field270, false, 0, this.field271 + 1 + var18);
                    this.field513.method370(var10, this.field270, false, var11, this.field271 + var18);
                    class36.method340((byte) 3);
                }
            } else {
                this.field513.method370(var10, this.field270, false, 0, this.field271 + 1);
                this.field513.method370(var10, this.field270, false, 16776960, this.field271);
            }
        }
    }

    @OriginalMember(owner = "client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        try {
            System.out.println("RS2 user client - release #" + 313);
            if (arg0.length != 5) {
                System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
            } else {
                field232 = Integer.parseInt(arg0[0]);
                field233 = Integer.parseInt(arg0[1]);
                if (arg0[2].equals("lowmem")) {
                    method71(8);
                } else {
                    if (!arg0[2].equals("highmem")) {
                        System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
                        return;
                    }
                    method75(424);
                }
                if (arg0[3].equals("free")) {
                    field234 = false;
                } else {
                    if (!arg0[3].equals("members")) {
                        System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
                        return;
                    }
                    field234 = true;
                }
                signlink.storeid = Integer.parseInt(arg0[4]);
                signlink.startpriv(InetAddress.getLocalHost());
                client var1 = new client();
                var1.method385(765, (byte) 13, 503);
            }
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client", name = "J", descriptor = "(I)V")
    public final void method104(int arg0) {
        if (this.field383 == 0) {
            int var2 = super.field1193;
            if (arg0 != 0) {
                this.field467 = this.field454.method461();
            }
            if (this.field256 == 1 && super.field1194 >= 516 && super.field1195 >= 160 && super.field1194 <= 765 && super.field1195 <= 205) {
                var2 = 0;
            }
            if (this.field543) {
                if (var2 != 1) {
                    int var3 = super.field1187;
                    int var4 = super.field1188;
                    if (this.field397 == 0) {
                        var3 -= 4;
                        var4 -= 4;
                    }
                    if (this.field397 == 1) {
                        var3 -= 553;
                        var4 -= 205;
                    }
                    if (this.field397 == 2) {
                        var3 -= 17;
                        var4 -= 357;
                    }
                    if (var3 < this.field398 - 10 || var3 > this.field400 + this.field398 + 10 || var4 < this.field399 - 10 || var4 > this.field401 + this.field399 + 10) {
                        this.field543 = false;
                        if (this.field397 == 1) {
                            this.field504 = true;
                        }
                        if (this.field397 == 2) {
                            this.field100 = true;
                        }
                    }
                }
                if (var2 == 1) {
                    int var5 = this.field398;
                    int var6 = this.field399;
                    int var7 = this.field400;
                    int var8 = super.field1194;
                    int var9 = super.field1195;
                    if (this.field397 == 0) {
                        var8 -= 4;
                        var9 -= 4;
                    }
                    if (this.field397 == 1) {
                        var8 -= 553;
                        var9 -= 205;
                    }
                    if (this.field397 == 2) {
                        var8 -= 17;
                        var9 -= 357;
                    }
                    int var10 = -1;
                    for (int var11 = 0; var11 < this.field545; ++var11) {
                        int var12 = (this.field545 - 1 - var11) * 15 + var6 + 31;
                        if (var8 > var5 && var8 < var5 + var7 && var9 > var12 - 13 && var9 < var12 + 3) {
                            var10 = var11;
                        }
                    }
                    if (var10 != -1) {
                        this.method158(var10, 0);
                    }
                    this.field543 = false;
                    if (this.field397 == 1) {
                        this.field504 = true;
                    }
                    if (this.field397 == 2) {
                        this.field100 = true;
                        return;
                    }
                }
            } else {
                if (var2 == 1 && this.field545 > 0) {
                    int var13 = this.field405[this.field545 - 1];
                    if (var13 == 97 || var13 == 657 || var13 == 298 || var13 == 601 || var13 == 855 || var13 == 276 || var13 == 428 || var13 == 921 || var13 == 652 || var13 == 996 || var13 == 237 || var13 == 1562) {
                        int var14 = this.field403[this.field545 - 1];
                        int var15 = this.field404[this.field545 - 1];
                        class34 var16 = class34.field1057[var15];
                        if (var16.field1014 || var16.field1012) {
                            this.field426 = false;
                            this.field199 = 0;
                            this.field381 = var15;
                            this.field382 = var14;
                            this.field383 = 2;
                            this.field384 = super.field1194;
                            this.field385 = super.field1195;
                            if (class34.field1057[var15].field1001 == this.field268) {
                                this.field383 = 1;
                            }
                            if (class34.field1057[var15].field1001 == this.field322) {
                                this.field383 = 3;
                            }
                            return;
                        }
                    }
                }
                if (var2 == 1 && (this.field323 == 1 || this.method170(false, this.field545 - 1)) && this.field545 > 2) {
                    var2 = 2;
                }
                if (var2 == 1 && this.field545 > 0) {
                    this.method158(this.field545 - 1, 0);
                }
                if (var2 != 2 || this.field545 <= 0) {
                    return;
                }
                this.method90(-565);
            }
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(I)V")
    public final void method105(int arg0) {
        int var2 = 37 / arg0;
        if (!this.field175 && !this.field365 && !this.field331) {
            ++field520;
            if (!this.field353) {
                this.method89((byte) 55, false);
            } else {
                this.method118((byte) 1);
            }
            this.field468 = 0;
        } else {
            this.method148(-4067);
        }
    }

    @OriginalMember(owner = "client", name = "i", descriptor = "(Z)V")
    public final void method106(boolean arg0) {
        this.field548 = new class66(this.field427, "titlebox", 0);
        this.field549 = new class66(this.field427, "titlebutton", 0);
        this.field326 = new class66[12];
        int var2 = 0;
        if (!arg0) {
            try {
                var2 = Integer.parseInt(this.getParameter("fl_icon"));
            } catch (Exception var19) {
            }
            if (var2 == 0) {
                for (int var3 = 0; var3 < 12; ++var3) {
                    this.field326[var3] = new class66(this.field427, "runes", var3);
                }
            } else {
                for (int var4 = 0; var4 < 12; ++var4) {
                    this.field326[var4] = new class66(this.field427, "runes", (var4 & 3) + 12);
                }
            }
            this.field370 = new class4(128, 265);
            this.field371 = new class4(128, 265);
            for (int var5 = 0; var5 < 33920; ++var5) {
                this.field370.field41[var5] = this.field188.field1266[var5];
            }
            for (int var6 = 0; var6 < 33920; ++var6) {
                this.field371.field41[var6] = this.field189.field1266[var6];
            }
            this.field210 = new int[256];
            for (int var7 = 0; var7 < 64; ++var7) {
                this.field210[var7] = var7 * 262144;
            }
            for (int var8 = 0; var8 < 64; ++var8) {
                this.field210[var8 + 64] = var8 * 1024 + 16711680;
            }
            for (int var9 = 0; var9 < 64; ++var9) {
                this.field210[var9 + 128] = var9 * 4 + 16776960;
            }
            for (int var10 = 0; var10 < 64; ++var10) {
                this.field210[var10 + 192] = 16777215;
            }
            this.field211 = new int[256];
            for (int var11 = 0; var11 < 64; ++var11) {
                this.field211[var11] = var11 * 1024;
            }
            for (int var12 = 0; var12 < 64; ++var12) {
                this.field211[var12 + 64] = var12 * 4 + 65280;
            }
            for (int var13 = 0; var13 < 64; ++var13) {
                this.field211[var13 + 128] = var13 * 262144 + 65535;
            }
            for (int var14 = 0; var14 < 64; ++var14) {
                this.field211[var14 + 192] = 16777215;
            }
            this.field212 = new int[256];
            for (int var15 = 0; var15 < 64; ++var15) {
                this.field212[var15] = var15 * 4;
            }
            for (int var16 = 0; var16 < 64; ++var16) {
                this.field212[var16 + 64] = var16 * 262144 + 255;
            }
            for (int var17 = 0; var17 < 64; ++var17) {
                this.field212[var17 + 128] = var17 * 1024 + 16711935;
            }
            for (int var18 = 0; var18 < 64; ++var18) {
                this.field212[var18 + 192] = 16777215;
            }
            this.field209 = new int[256];
            this.field254 = new int[32768];
            this.field255 = new int[32768];
            this.method130((class66) null, 15549);
            this.field92 = new int[32768];
            this.field93 = new int[32768];
            this.method163(field358, 10, "Connecting to fileserver");
            if (!this.field469) {
                this.field501 = true;
                this.field469 = true;
                this.method102(this, 2);
            }
        }
    }

    @OriginalMember(owner = "client", name = "K", descriptor = "(I)V")
    public final void method107(int arg0) {
        short var2 = 256;
        if (this.field156 > 0) {
            for (int var3 = 0; var3 < 256; ++var3) {
                if (this.field156 > 768) {
                    this.field209[var3] = this.method93(1024 - this.field156, this.field428, this.field210[var3], this.field211[var3]);
                } else if (this.field156 > 256) {
                    this.field209[var3] = this.field211[var3];
                } else {
                    this.field209[var3] = this.method93(256 - this.field156, this.field428, this.field211[var3], this.field210[var3]);
                }
            }
        } else if (this.field157 > 0) {
            for (int var4 = 0; var4 < 256; ++var4) {
                if (this.field157 > 768) {
                    this.field209[var4] = this.method93(1024 - this.field157, this.field428, this.field210[var4], this.field212[var4]);
                } else if (this.field157 > 256) {
                    this.field209[var4] = this.field212[var4];
                } else {
                    this.field209[var4] = this.method93(256 - this.field157, this.field428, this.field212[var4], this.field210[var4]);
                }
            }
        } else {
            for (int var5 = 0; var5 < 256; ++var5) {
                this.field209[var5] = this.field210[var5];
            }
        }
        for (int var6 = 0; var6 < 33920; ++var6) {
            this.field188.field1266[var6] = this.field370.field41[var6];
        }
        int var7 = 0;
        int var8 = 1152;
        for (int var9 = 1; var9 < var2 - 1; ++var9) {
            int var23 = (var2 - var9) * this.field547[var9] / var2;
            int var24 = var23 + 22;
            if (var24 < 0) {
                var24 = 0;
            }
            var7 += var24;
            for (int var25 = var24; var25 < 128; ++var25) {
                int var26 = this.field92[var7++];
                if (var26 != 0) {
                    int var28 = 256 - var26;
                    int var29 = this.field209[var26];
                    int var30 = this.field188.field1266[var8];
                    this.field188.field1266[var8++] = ((var29 & 16711935) * var26 + (var30 & 16711935) * var28 & -16711936) + ((var29 & 65280) * var26 + (var30 & 65280) * var28 & 16711680) >> 8;
                } else {
                    ++var8;
                }
            }
            var8 += var24;
        }
        this.field188.method395(-30874, super.field1179, 0, 0);
        if (arg0 != 48890) {
            this.field446 = this.field454.method461();
        }
        for (int var10 = 0; var10 < 33920; ++var10) {
            this.field189.field1266[var10] = this.field371.field41[var10];
        }
        int var11 = 0;
        int var12 = 1176;
        for (int var13 = 1; var13 < var2 - 1; ++var13) {
            int var14 = (var2 - var13) * this.field547[var13] / var2;
            int var15 = 103 - var14;
            int var16 = var12 + var14;
            for (int var17 = 0; var17 < var15; ++var17) {
                int var18 = this.field92[var11++];
                if (var18 != 0) {
                    int var20 = 256 - var18;
                    int var21 = this.field209[var18];
                    int var22 = this.field189.field1266[var16];
                    this.field189.field1266[var16++] = ((var21 & 16711935) * var18 + (var22 & 16711935) * var20 & -16711936) + ((var21 & 65280) * var18 + (var22 & 65280) * var20 & 16711680) >> 8;
                } else {
                    ++var16;
                }
            }
            var11 += 128 - var15;
            var12 = 128 - var15 - var14 + var16;
        }
        this.field189.method395(-30874, super.field1179, 0, 637);
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(B)V")
    public final void method108(byte arg0) {
        ++this.field532;
        this.method82(735, true);
        this.method145(true, 706);
        this.method82(735, false);
        this.method145(false, 706);
        this.method150(-266);
        this.method144((byte) 3);
        if (!this.field372) {
            int var2 = this.field486;
            if (this.field553 / 256 > var2) {
                var2 = this.field553 / 256;
            }
            if (this.field83[4] && this.field466[4] + 128 > var2) {
                var2 = this.field466[4] + 128;
            }
            int var3 = this.field487 + this.field275 & 2047;
            this.method140(var3, this.method65(field174.field588, this.field164, false, field174.field587) - 50, this.field105, var2 * 3 + 600, this.field104, var2, 7);
        }
        int var4;
        if (!this.field372) {
            var4 = this.method95(-462);
        } else {
            var4 = this.method96(8);
        }
        int var5 = this.field348;
        int var6 = this.field349;
        int var7 = this.field350;
        int var8 = this.field351;
        int var9 = this.field352;
        for (int var10 = 0; var10 < 5; ++var10) {
            if (this.field83[var10]) {
                int var12 = (int) (Math.random() * (double) (this.field357[var10] * 2 + 1) - (double) this.field357[var10] + Math.sin((double) this.field246[var10] / 100.0D * (double) this.field393[var10]) * (double) this.field466[var10]);
                if (var10 == 0) {
                    this.field348 += var12;
                }
                if (var10 == 1) {
                    this.field349 += var12;
                }
                if (var10 == 2) {
                    this.field350 += var12;
                }
                if (var10 == 3) {
                    this.field352 = this.field352 + var12 & 2047;
                }
                if (var10 == 4) {
                    this.field351 += var12;
                    if (this.field351 < 128) {
                        this.field351 = 128;
                    }
                    if (this.field351 > 383) {
                        this.field351 = 383;
                    }
                }
            }
        }
        int var11 = class31.field984;
        class27.field921 = true;
        class27.field924 = 0;
        class27.field922 = super.field1187 - 4;
        class27.field923 = super.field1188 - 4;
        class36.method342(false);
        if (arg0 != 28) {
            this.field343 = -298;
        }
        this.field409.method578(-11068, this.field351, this.field348, this.field349, this.field350, var4, this.field352);
        this.field409.method553(0);
        this.method103(this.field313);
        this.method63(0);
        this.method152(this.field455, var11);
        this.method99(false);
        this.field523.method395(-30874, super.field1179, 4, 4);
        this.field348 = var5;
        this.field349 = var6;
        this.field350 = var7;
        this.field351 = var8;
        this.field352 = var9;
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(IILXQPFGONL;)V")
    private final void method109(int arg0, int arg1, class62 arg2) {
        this.field539 = 0;
        if (arg0 == 8407) {
            this.field423 = 0;
            this.method92(-590, arg2, arg1);
            this.method54(arg1, (byte) 69, arg2);
            this.method167(false, arg1, arg2);
            this.method139(arg2, arg1, 0);
            for (int var4 = 0; var4 < this.field539; ++var4) {
                int var6 = this.field540[var4];
                if (field330 != this.field420[var6].field630) {
                    this.field420[var6] = null;
                }
            }
            if (arg2.field1542 != arg1) {
                signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg2.field1542 + " psize:" + arg1);
                throw new RuntimeException("eek");
            } else {
                for (int var5 = 0; var5 < this.field421; ++var5) {
                    if (this.field420[this.field422[var5]] == null) {
                        signlink.reporterror(this.field555 + " null entry in pl list - pos:" + var5 + " size:" + this.field421);
                        throw new RuntimeException("eek");
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(B)V")
    public final void method110(byte arg0) {
        if (this.field383 == 0) {
            this.field215[0] = "Cancel";
            this.field405[0] = 1296;
            if (this.field159 != arg0) {
                this.field121 = -1;
            }
            this.field545 = 1;
            this.method157(38825);
            this.field203 = 0;
            if (super.field1187 > 4 && super.field1188 > 4 && super.field1187 < 516 && super.field1188 < 338) {
                if (this.field268 != -1) {
                    this.method77(4, 0, super.field1187, super.field1188, this.field507, class34.field1057[this.field268], 4);
                } else {
                    this.method84(true);
                }
            }
            if (this.field470 != this.field203) {
                this.field470 = this.field203;
            }
            this.field203 = 0;
            if (super.field1187 > 553 && super.field1188 > 205 && super.field1187 < 743 && super.field1188 < 466) {
                if (this.field342 != -1) {
                    this.method77(205, 0, super.field1187, super.field1188, this.field507, class34.field1057[this.field342], 553);
                } else if (this.field319[this.field115] != -1) {
                    this.method77(205, 0, super.field1187, super.field1188, this.field507, class34.field1057[this.field319[this.field115]], 553);
                }
            }
            if (this.field552 != this.field203) {
                this.field504 = true;
                this.field552 = this.field203;
            }
            this.field203 = 0;
            if (super.field1187 > 17 && super.field1188 > 357 && super.field1187 < 496 && super.field1188 < 453) {
                if (this.field322 != -1) {
                    this.method77(357, 0, super.field1187, super.field1188, this.field507, class34.field1057[this.field322], 17);
                } else if (super.field1188 < 434 && super.field1187 < 426) {
                    this.method46(super.field1188 - 357, -28761, super.field1187 - 17);
                }
            }
            if (this.field322 != -1 && this.field325 != this.field203) {
                this.field100 = true;
                this.field325 = this.field203;
            }
            boolean var2 = false;
            while (!var2) {
                var2 = true;
                for (int var3 = 0; var3 < this.field545 - 1; ++var3) {
                    if (this.field405[var3] < 1000 && this.field405[var3 + 1] > 1000) {
                        String var4 = this.field215[var3];
                        this.field215[var3] = this.field215[var3 + 1];
                        this.field215[var3 + 1] = var4;
                        int var5 = this.field405[var3];
                        this.field405[var3] = this.field405[var3 + 1];
                        this.field405[var3 + 1] = var5;
                        int var6 = this.field403[var3];
                        this.field403[var3] = this.field403[var3 + 1];
                        this.field403[var3 + 1] = var6;
                        int var7 = this.field404[var3];
                        this.field404[var3] = this.field404[var3 + 1];
                        this.field404[var3 + 1] = var7;
                        int var8 = this.field406[var3];
                        this.field406[var3] = this.field406[var3 + 1];
                        this.field406[var3 + 1] = var8;
                        var2 = false;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(B)V")
    public final void method111(byte arg0) {
        if (arg0 != 56) {
            this.field236 = !this.field236;
        }
        for (int var2 = 0; var2 < this.field528; ++var2) {
            int var3 = this.field529[var2];
            class1 var4 = this.field527[var3];
            if (var4 != null) {
                this.method112(true, var4.field5.field768, var4);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZILDGZJCXBC;)V")
    public final void method112(boolean arg0, int arg1, class12 arg2) {
        if (arg2.field587 < 128 || arg2.field588 < 128 || arg2.field587 >= 13184 || arg2.field588 >= 13184) {
            arg2.field607 = -1;
            arg2.field632 = -1;
            arg2.field626 = 0;
            arg2.field627 = 0;
            arg2.field587 = arg2.field619[0] * 128 + arg2.field615 * 64;
            arg2.field588 = arg2.field620[0] * 128 + arg2.field615 * 64;
            arg2.method182(-339);
        }
        if (field174 == arg2 && (arg2.field587 < 1536 || arg2.field588 < 1536 || arg2.field587 >= 11776 || arg2.field588 >= 11776)) {
            arg2.field607 = -1;
            arg2.field632 = -1;
            arg2.field626 = 0;
            arg2.field627 = 0;
            arg2.field587 = arg2.field619[0] * 128 + arg2.field615 * 64;
            arg2.field588 = arg2.field620[0] * 128 + arg2.field615 * 64;
            arg2.method182(-339);
        }
        if (arg2.field626 > field330) {
            this.method113(arg2, (byte) 3);
        } else if (arg2.field627 >= field330) {
            this.method114(true, arg2);
        } else {
            this.method115(arg2, 621);
        }
        this.method116(861, arg2);
        if (!arg0) {
            this.field465 = !this.field465;
        }
        this.method117(-14, arg2);
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LDGZJCXBC;B)V")
    public final void method113(class12 arg0, byte arg1) {
        int var3 = arg0.field626 - field330;
        int var4 = arg0.field622 * 128 + arg0.field615 * 64;
        int var5 = arg0.field624 * 128 + arg0.field615 * 64;
        if (arg1 != 3) {
            this.field121 = -1;
        }
        arg0.field587 += (var4 - arg0.field587) / var3;
        arg0.field588 += (var5 - arg0.field588) / var3;
        arg0.field631 = 0;
        if (arg0.field628 == 0) {
            arg0.field603 = 1024;
        }
        if (arg0.field628 == 1) {
            arg0.field603 = 1536;
        }
        if (arg0.field628 == 2) {
            arg0.field603 = 0;
        }
        if (arg0.field628 == 3) {
            arg0.field603 = 512;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZLDGZJCXBC;)V")
    public final void method114(boolean arg0, class12 arg1) {
        if (field330 == arg1.field627 || arg1.field607 == -1 || arg1.field610 != 0 || arg1.field609 + 1 > class24.field813[arg1.field607].method227(956, arg1.field608)) {
            int var3 = arg1.field627 - arg1.field626;
            int var4 = field330 - arg1.field626;
            int var5 = arg1.field622 * 128 + arg1.field615 * 64;
            int var6 = arg1.field624 * 128 + arg1.field615 * 64;
            int var7 = arg1.field623 * 128 + arg1.field615 * 64;
            int var8 = arg1.field625 * 128 + arg1.field615 * 64;
            arg1.field587 = ((var3 - var4) * var5 + var4 * var7) / var3;
            arg1.field588 = ((var3 - var4) * var6 + var4 * var8) / var3;
        }
        arg1.field631 = 0;
        if (arg1.field628 == 0) {
            arg1.field603 = 1024;
        }
        if (arg1.field628 == 1) {
            arg1.field603 = 1536;
        }
        if (arg1.field628 == 2) {
            arg1.field603 = 0;
        }
        if (arg1.field628 == 3) {
            arg1.field603 = 512;
        }
        arg1.field589 = arg1.field603;
        this.field353 &= arg0;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LDGZJCXBC;I)V")
    public final void method115(class12 arg0, int arg1) {
        arg0.field612 = arg0.field616;
        if (arg0.field618 == 0) {
            arg0.field631 = 0;
        } else {
            if (arg0.field607 != -1 && arg0.field610 == 0) {
                class24 var3 = class24.field813[arg0.field607];
                if (arg0.field585 > 0 && var3.field825 == 0) {
                    ++arg0.field631;
                    return;
                }
                if (arg0.field585 <= 0 && var3.field826 == 0) {
                    ++arg0.field631;
                    return;
                }
            }
            int var4 = arg0.field587;
            int var5 = arg0.field588;
            int var6 = arg0.field619[arg0.field618 - 1] * 128 + arg0.field615 * 64;
            int var7 = arg0.field620[arg0.field618 - 1] * 128 + arg0.field615 * 64;
            if (var6 - var4 <= 256 && var6 - var4 >= -256 && var7 - var5 <= 256 && var7 - var5 >= -256) {
                if (var4 < var6) {
                    if (var5 < var7) {
                        arg0.field603 = 1280;
                    } else if (var5 > var7) {
                        arg0.field603 = 1792;
                    } else {
                        arg0.field603 = 1536;
                    }
                } else if (var4 > var6) {
                    if (var5 < var7) {
                        arg0.field603 = 768;
                    } else if (var5 > var7) {
                        arg0.field603 = 256;
                    } else {
                        arg0.field603 = 512;
                    }
                } else if (var5 < var7) {
                    arg0.field603 = 1024;
                } else {
                    arg0.field603 = 0;
                }
                int var8 = arg0.field603 - arg0.field589 & 2047;
                if (var8 > 1024) {
                    var8 -= 2048;
                }
                int var9 = arg0.field594;
                if (arg1 > 0) {
                    if (var8 >= -256 && var8 <= 256) {
                        var9 = arg0.field593;
                    } else if (var8 >= 256 && var8 < 768) {
                        var9 = arg0.field596;
                    } else if (var8 >= -768 && var8 <= -256) {
                        var9 = arg0.field595;
                    }
                    if (var9 == -1) {
                        var9 = arg0.field593;
                    }
                    arg0.field612 = var9;
                    int var10 = 4;
                    if (arg0.field603 != arg0.field589 && arg0.field591 == -1 && arg0.field637 != 0) {
                        var10 = 2;
                    }
                    if (arg0.field618 > 2) {
                        var10 = 6;
                    }
                    if (arg0.field618 > 3) {
                        var10 = 8;
                    }
                    if (arg0.field631 > 0 && arg0.field618 > 1) {
                        var10 = 8;
                        --arg0.field631;
                    }
                    if (arg0.field590[arg0.field618 - 1]) {
                        var10 <<= 1;
                    }
                    if (var10 >= 8 && arg0.field612 == arg0.field593 && arg0.field605 != -1) {
                        arg0.field612 = arg0.field605;
                    }
                    if (var4 < var6) {
                        arg0.field587 += var10;
                        if (arg0.field587 > var6) {
                            arg0.field587 = var6;
                        }
                    } else if (var4 > var6) {
                        arg0.field587 -= var10;
                        if (arg0.field587 < var6) {
                            arg0.field587 = var6;
                        }
                    }
                    if (var5 < var7) {
                        arg0.field588 += var10;
                        if (arg0.field588 > var7) {
                            arg0.field588 = var7;
                        }
                    } else if (var5 > var7) {
                        arg0.field588 -= var10;
                        if (arg0.field588 < var7) {
                            arg0.field588 = var7;
                        }
                    }
                    if (arg0.field587 == var6 && arg0.field588 == var7) {
                        --arg0.field618;
                        if (arg0.field585 > 0) {
                            --arg0.field585;
                            return;
                        }
                    }
                }
            } else {
                arg0.field587 = var6;
                arg0.field588 = var7;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILDGZJCXBC;)V")
    public final void method116(int arg0, class12 arg1) {
        if (arg0 <= 0) {
            field129 = this.field454.method461();
        }
        if (arg1.field637 != 0) {
            if (arg1.field591 != -1 && arg1.field591 < 32768) {
                class1 var3 = this.field527[arg1.field591];
                if (var3 != null) {
                    int var4 = arg1.field587 - var3.field587;
                    int var5 = arg1.field588 - var3.field588;
                    if (var4 != 0 || var5 != 0) {
                        arg1.field603 = (int) (Math.atan2((double) var4, (double) var5) * 325.949D) & 2047;
                    }
                }
            }
            if (arg1.field591 >= 32768) {
                int var6 = arg1.field591 - 32768;
                if (this.field301 == var6) {
                    var6 = this.field419;
                }
                class54 var7 = this.field420[var6];
                if (var7 != null) {
                    int var8 = arg1.field587 - var7.field587;
                    int var9 = arg1.field588 - var7.field588;
                    if (var8 != 0 || var9 != 0) {
                        arg1.field603 = (int) (Math.atan2((double) var8, (double) var9) * 325.949D) & 2047;
                    }
                }
            }
            if ((arg1.field597 != 0 || arg1.field598 != 0) && (arg1.field618 == 0 || arg1.field631 > 0)) {
                int var10 = arg1.field587 - (arg1.field597 - this.field125 - this.field125) * 64;
                int var11 = arg1.field588 - (arg1.field598 - this.field126 - this.field126) * 64;
                if (var10 != 0 || var11 != 0) {
                    arg1.field603 = (int) (Math.atan2((double) var10, (double) var11) * 325.949D) & 2047;
                }
                arg1.field597 = 0;
                arg1.field598 = 0;
            }
            int var12 = arg1.field603 - arg1.field589 & 2047;
            if (var12 != 0) {
                if (var12 >= arg1.field637 && var12 <= 2048 - arg1.field637) {
                    if (var12 > 1024) {
                        arg1.field589 -= arg1.field637;
                    } else {
                        arg1.field589 += arg1.field637;
                    }
                } else {
                    arg1.field589 = arg1.field603;
                }
                arg1.field589 &= 2047;
                if (arg1.field616 == arg1.field612 && arg1.field603 != arg1.field589) {
                    if (arg1.field617 != -1) {
                        arg1.field612 = arg1.field617;
                        return;
                    }
                    arg1.field612 = arg1.field593;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(ILDGZJCXBC;)V")
    public final void method117(int arg0, class12 arg1) {
        if (arg0 >= 0) {
            this.field121 = -1;
        }
        arg1.field586 = false;
        if (arg1.field612 != -1) {
            class24 var3 = class24.field813[arg1.field612];
            ++arg1.field614;
            if (arg1.field613 < var3.field814 && arg1.field614 > var3.method227(956, arg1.field613)) {
                arg1.field614 = 0;
                ++arg1.field613;
            }
            if (arg1.field613 >= var3.field814) {
                arg1.field614 = 0;
                arg1.field613 = 0;
            }
        }
        if (arg1.field632 != -1 && field330 >= arg1.field635) {
            if (arg1.field633 < 0) {
                arg1.field633 = 0;
            }
            class24 var4 = class17.field725[arg1.field632].field729;
            ++arg1.field634;
            while (arg1.field633 < var4.field814 && arg1.field634 > var4.method227(956, arg1.field633)) {
                arg1.field634 -= var4.method227(956, arg1.field633);
                ++arg1.field633;
            }
            if (arg1.field633 >= var4.field814 && (arg1.field633 < 0 || arg1.field633 >= var4.field814)) {
                arg1.field632 = -1;
            }
        }
        if (arg1.field607 != -1 && arg1.field610 <= 1) {
            class24 var5 = class24.field813[arg1.field607];
            if (var5.field825 == 1 && arg1.field585 > 0 && arg1.field626 <= field330 && arg1.field627 < field330) {
                arg1.field610 = 1;
                return;
            }
        }
        if (arg1.field607 != -1 && arg1.field610 == 0) {
            class24 var6 = class24.field813[arg1.field607];
            ++arg1.field609;
            while (arg1.field608 < var6.field814 && arg1.field609 > var6.method227(956, arg1.field608)) {
                arg1.field609 -= var6.method227(956, arg1.field608);
                ++arg1.field608;
            }
            if (arg1.field608 >= var6.field814) {
                arg1.field608 -= var6.field818;
                ++arg1.field611;
                if (arg1.field611 >= var6.field824) {
                    arg1.field607 = -1;
                }
                if (arg1.field608 < 0 || arg1.field608 >= var6.field814) {
                    arg1.field607 = -1;
                }
            }
            arg1.field586 = var6.field820;
        }
        if (arg1.field610 > 0) {
            --arg1.field610;
        }
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(B)V")
    public final void method118(byte arg0) {
        if (this.field249) {
            this.field249 = false;
            this.field437.method395(-30874, super.field1179, 4, 0);
            this.field438.method395(-30874, super.field1179, 357, 0);
            this.field439.method395(-30874, super.field1179, 4, 722);
            this.field440.method395(-30874, super.field1179, 205, 743);
            this.field441.method395(-30874, super.field1179, 0, 0);
            this.field442.method395(-30874, super.field1179, 4, 516);
            this.field443.method395(-30874, super.field1179, 205, 516);
            this.field444.method395(-30874, super.field1179, 357, 496);
            this.field445.method395(-30874, super.field1179, 338, 0);
            this.field504 = true;
            this.field100 = true;
            this.field388 = true;
            this.field310 = true;
            if (this.field302 != 2) {
                this.field523.method395(-30874, super.field1179, 4, 4);
                this.field522.method395(-30874, super.field1179, 4, 550);
            }
            ++field378;
            if (field378 > 1910) {
                field378 = 0;
                this.field213.method467(60, 832);
                this.field213.method468(0);
                int var2 = this.field213.field1542;
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field213.method469(23900);
                }
                this.field213.method469(61843);
                this.field213.method468((int) (Math.random() * 256.0D));
                this.field213.method469(18658);
                this.field213.method468((int) (Math.random() * 256.0D));
                this.field213.method469(45247);
                this.field213.method468(238);
                this.field213.method468(56);
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field213.method469(35837);
                }
                this.field213.method469(52115);
                this.field213.method477(2, this.field213.field1542 - var2);
            }
        }
        if (this.field302 == 2) {
            this.method108((byte) 28);
        }
        if (this.field543 && this.field397 == 1) {
            this.field504 = true;
        }
        if (this.field342 != -1) {
            boolean var3 = this.method162(this.field342, true, this.field498);
            if (var3) {
                this.field504 = true;
            }
        }
        if (this.field340 == 2) {
            this.field504 = true;
        }
        if (this.field383 == 2) {
            this.field504 = true;
        }
        if (this.field504) {
            this.method169(false);
            this.field504 = false;
        }
        if (this.field322 == -1) {
            this.field490.field1049 = this.field196 - this.field94 - 77;
            if (super.field1187 > 448 && super.field1187 < 560 && super.field1188 > 332) {
                this.method74(this.field490, 77, this.field196, super.field1187 - 17, 463, false, 0, super.field1188 - 357, (byte) 2);
            }
            int var4 = this.field196 - 77 - this.field490.field1049;
            if (var4 < 0) {
                var4 = 0;
            }
            if (var4 > this.field196 - 77) {
                var4 = this.field196 - 77;
            }
            if (this.field94 != var4) {
                this.field94 = var4;
                this.field100 = true;
            }
        }
        if (this.field322 != -1) {
            boolean var5 = this.method162(this.field322, true, this.field498);
            if (var5) {
                this.field100 = true;
            }
        }
        if (this.field340 == 3) {
            this.field100 = true;
        }
        if (this.field383 == 3) {
            this.field100 = true;
        }
        if (this.field229 != null) {
            this.field100 = true;
        }
        if (this.field543 && this.field397 == 2) {
            this.field100 = true;
        }
        if (this.field100) {
            this.method153(-755);
            this.field100 = false;
        }
        if (this.field302 == 2) {
            this.method161((byte) 4);
            this.field522.method395(-30874, super.field1179, 4, 550);
        }
        if (this.field201 != -1) {
            this.field388 = true;
        }
        if (this.field388) {
            if (this.field201 != -1 && this.field201 == this.field115) {
                this.field201 = -1;
                this.field213.method467(3, 832);
                this.field213.method468(this.field115);
            }
            this.field388 = false;
            this.field450.method394(false);
            this.field91.method533(-41075, 0, 0);
            if (this.field342 == -1) {
                if (this.field319[this.field115] != -1) {
                    if (this.field115 == 0) {
                        this.field475.method533(-41075, 10, 22);
                    }
                    if (this.field115 == 1) {
                        this.field476.method533(-41075, 8, 54);
                    }
                    if (this.field115 == 2) {
                        this.field476.method533(-41075, 8, 82);
                    }
                    if (this.field115 == 3) {
                        this.field477.method533(-41075, 8, 110);
                    }
                    if (this.field115 == 4) {
                        this.field479.method533(-41075, 8, 153);
                    }
                    if (this.field115 == 5) {
                        this.field479.method533(-41075, 8, 181);
                    }
                    if (this.field115 == 6) {
                        this.field478.method533(-41075, 9, 209);
                    }
                }
                if (this.field319[0] != -1 && (this.field201 != 0 || field330 % 20 < 10)) {
                    this.field364[0].method533(-41075, 13, 29);
                }
                if (this.field319[1] != -1 && (this.field201 != 1 || field330 % 20 < 10)) {
                    this.field364[1].method533(-41075, 11, 53);
                }
                if (this.field319[2] != -1 && (this.field201 != 2 || field330 % 20 < 10)) {
                    this.field364[2].method533(-41075, 11, 82);
                }
                if (this.field319[3] != -1 && (this.field201 != 3 || field330 % 20 < 10)) {
                    this.field364[3].method533(-41075, 12, 115);
                }
                if (this.field319[4] != -1 && (this.field201 != 4 || field330 % 20 < 10)) {
                    this.field364[4].method533(-41075, 13, 153);
                }
                if (this.field319[5] != -1 && (this.field201 != 5 || field330 % 20 < 10)) {
                    this.field364[5].method533(-41075, 11, 180);
                }
                if (this.field319[6] != -1 && (this.field201 != 6 || field330 % 20 < 10)) {
                    this.field364[6].method533(-41075, 13, 208);
                }
            }
            this.field450.method395(-30874, super.field1179, 160, 516);
            this.field449.method394(false);
            this.field90.method533(-41075, 0, 0);
            if (this.field342 == -1) {
                if (this.field319[this.field115] != -1) {
                    if (this.field115 == 7) {
                        this.field303.method533(-41075, 0, 42);
                    }
                    if (this.field115 == 8) {
                        this.field304.method533(-41075, 0, 74);
                    }
                    if (this.field115 == 9) {
                        this.field304.method533(-41075, 0, 102);
                    }
                    if (this.field115 == 10) {
                        this.field305.method533(-41075, 1, 130);
                    }
                    if (this.field115 == 11) {
                        this.field307.method533(-41075, 0, 173);
                    }
                    if (this.field115 == 12) {
                        this.field307.method533(-41075, 0, 201);
                    }
                    if (this.field115 == 13) {
                        this.field306.method533(-41075, 0, 229);
                    }
                }
                if (this.field319[8] != -1 && (this.field201 != 8 || field330 % 20 < 10)) {
                    this.field364[7].method533(-41075, 2, 74);
                }
                if (this.field319[9] != -1 && (this.field201 != 9 || field330 % 20 < 10)) {
                    this.field364[8].method533(-41075, 3, 102);
                }
                if (this.field319[10] != -1 && (this.field201 != 10 || field330 % 20 < 10)) {
                    this.field364[9].method533(-41075, 4, 137);
                }
                if (this.field319[11] != -1 && (this.field201 != 11 || field330 % 20 < 10)) {
                    this.field364[10].method533(-41075, 2, 174);
                }
                if (this.field319[12] != -1 && (this.field201 != 12 || field330 % 20 < 10)) {
                    this.field364[11].method533(-41075, 2, 201);
                }
                if (this.field319[13] != -1 && (this.field201 != 13 || field330 % 20 < 10)) {
                    this.field364[12].method533(-41075, 2, 226);
                }
            }
            this.field449.method395(-30874, super.field1179, 466, 496);
            this.field523.method394(false);
        }
        if (this.field310) {
            this.field310 = false;
            this.field448.method394(false);
            this.field89.method533(-41075, 0, 0);
            this.field512.method371(16777215, 55, "Public chat", 28, true, -89);
            if (this.field546 == 0) {
                this.field512.method371(65280, 55, "On", 41, true, -89);
            }
            if (this.field546 == 1) {
                this.field512.method371(16776960, 55, "Friends", 41, true, -89);
            }
            if (this.field546 == 2) {
                this.field512.method371(16711680, 55, "Off", 41, true, -89);
            }
            if (this.field546 == 3) {
                this.field512.method371(65535, 55, "Hide", 41, true, -89);
            }
            this.field512.method371(16777215, 184, "Private chat", 28, true, -89);
            if (this.field412 == 0) {
                this.field512.method371(65280, 184, "On", 41, true, -89);
            }
            if (this.field412 == 1) {
                this.field512.method371(16776960, 184, "Friends", 41, true, -89);
            }
            if (this.field412 == 2) {
                this.field512.method371(16711680, 184, "Off", 41, true, -89);
            }
            this.field512.method371(16777215, 324, "Trade/compete", 28, true, -89);
            if (this.field162 == 0) {
                this.field512.method371(65280, 324, "On", 41, true, -89);
            }
            if (this.field162 == 1) {
                this.field512.method371(16776960, 324, "Friends", 41, true, -89);
            }
            if (this.field162 == 2) {
                this.field512.method371(16711680, 324, "Off", 41, true, -89);
            }
            this.field512.method371(16777215, 458, "Report abuse", 33, true, -89);
            this.field448.method395(-30874, super.field1179, 453, 0);
            this.field523.method394(false);
        }
        this.field498 = 0;
        if (this.field474 == arg0) {
            boolean var6 = false;
        }
    }

    @OriginalMember(owner = "client", name = "L", descriptor = "(I)V")
    public final void method119(int arg0) {
        if (this.field524 == null) {
            this.method160(0);
            super.field1180 = null;
            this.field185 = null;
            this.field186 = null;
            this.field187 = null;
            this.field188 = null;
            this.field189 = null;
            this.field190 = null;
            if (arg0 >= 1 && arg0 <= 1) {
                this.field191 = null;
                this.field192 = null;
                this.field193 = null;
                this.field524 = new class48(96, -41603, 479, this.method73(-13961));
                this.field522 = new class48(156, -41603, 172, this.method73(-13961));
                class36.method342(false);
                this.field518.method533(-41075, 0, 0);
                this.field521 = new class48(261, -41603, 190, this.method73(-13961));
                this.field523 = new class48(334, -41603, 512, this.method73(-13961));
                class36.method342(false);
                this.field448 = new class48(50, -41603, 496, this.method73(-13961));
                this.field449 = new class48(37, -41603, 269, this.method73(-13961));
                this.field450 = new class48(45, -41603, 249, this.method73(-13961));
                this.field249 = true;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZLjava/lang/String;ILjava/lang/String;II)LXMRRKSSB;")
    public final class60 method120(boolean arg0, String arg1, int arg2, String arg3, int arg4, int arg5) {
        if (!arg0) {
            field379 = -425;
        }
        byte[] var7 = null;
        int var8 = 5;
        try {
            if (this.field206[0] != null) {
                var7 = this.field206[0].method229(arg5, 168);
            }
        } catch (Exception var30) {
        }
        if (var7 != null) {
            this.field541.reset();
            this.field541.update(var7);
            int var9 = (int) this.field541.getValue();
            if (arg4 != var9) {
                var7 = null;
            }
        }
        if (var7 != null) {
            return new class60(var7, this.field343);
        } else {
            int var11 = 0;
            while (var7 == null) {
                String var12 = "Unknown error";
                this.method163(field358, arg2, "Requesting " + arg3);
                Object var13 = null;
                try {
                    int var14 = 0;
                    DataInputStream var15 = this.method159(arg1 + arg4);
                    byte[] var16 = new byte[6];
                    var15.readFully(var16, 0, 6);
                    class62 var17 = new class62(var16, 49938);
                    var17.field1542 = 3;
                    int var18 = var17.method482() + 6;
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
                            this.method163(field358, arg2, "Loading " + arg3 + " - " + var23 + "%");
                        }
                        var14 = var23;
                    }
                    var15.close();
                    try {
                        if (this.field206[0] != null) {
                            this.field206[0].method230(arg5, (byte) 99, var7, var7.length);
                        }
                    } catch (Exception var29) {
                        this.field206[0] = null;
                    }
                    if (var7 != null) {
                        this.field541.reset();
                        this.field541.update(var7);
                        int var24 = (int) this.field541.getValue();
                        if (arg4 != var24) {
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
                            this.method163(field358, arg2, "Game updated - please reload page");
                            var26 = 10;
                        } else {
                            this.method163(field358, arg2, var12 + " - Retrying in " + var26);
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
                    this.field101 = !this.field101;
                }
            }
            return new class60(var7, this.field343);
        }
    }

    @OriginalMember(owner = "client", name = "j", descriptor = "(Z)V")
    public final void method121(boolean arg0) {
        try {
            if (this.field173 != null) {
                this.field173.method351();
            }
        } catch (Exception var3) {
        }
        this.field173 = null;
        this.field353 = false;
        this.field510 = 0;
        this.field555 = "";
        this.field556 = "";
        if (arg0) {
            this.method80(this.field456);
            this.field409.method539((byte) -24);
            for (int var2 = 0; var2 < 4; ++var2) {
                this.field103[var2].method514();
            }
            System.gc();
            this.method57(500);
            this.field182 = -1;
            this.field298 = -1;
            this.field542 = 0;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIZ)V")
    public final void method122(int arg0, int arg1, boolean arg2) {
        if (arg1 >= 0) {
            for (int var4 = 1; var4 > 0; ++var4) {
            }
        }
        signlink.midivol = arg0;
        if (arg2) {
            signlink.midi = "voladjust";
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(IILXQPFGONL;)V")
    private final void method123(int arg0, int arg1, class62 arg2) {
        this.field539 = 0;
        this.field423 = 0;
        this.method136(480, arg1, arg2);
        this.method135(arg2, 0, arg1);
        this.method33(arg2, this.field88, arg1);
        if (arg0 >= 0) {
            this.field446 = 161;
        }
        for (int var4 = 0; var4 < this.field539; ++var4) {
            int var6 = this.field540[var4];
            if (field330 != this.field527[var6].field630) {
                this.field527[var6].field5 = null;
                this.field527[var6] = null;
            }
        }
        if (arg2.field1542 != arg1) {
            signlink.reporterror(this.field555 + " size mismatch in getnpcpos - pos:" + arg2.field1542 + " psize:" + arg1);
            throw new RuntimeException("eek");
        } else {
            for (int var5 = 0; var5 < this.field528; ++var5) {
                if (this.field527[this.field529[var5]] == null) {
                    signlink.reporterror(this.field555 + " null entry in npc list - pos:" + var5 + " size:" + this.field528);
                    throw new RuntimeException("eek");
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(B)V")
    public final void method124(byte arg0) {
        int var2 = this.field290 * 128 + 64;
        int var3 = this.field291 * 128 + 64;
        int var4 = this.method65(var3, this.field164, false, var2) - this.field292;
        if (this.field348 < var2) {
            this.field348 += (var2 - this.field348) * this.field294 / 1000 + this.field293;
            if (this.field348 > var2) {
                this.field348 = var2;
            }
        }
        if (this.field348 > var2) {
            this.field348 -= (this.field348 - var2) * this.field294 / 1000 + this.field293;
            if (this.field348 < var2) {
                this.field348 = var2;
            }
        }
        if (this.field349 < var4) {
            this.field349 += (var4 - this.field349) * this.field294 / 1000 + this.field293;
            if (this.field349 > var4) {
                this.field349 = var4;
            }
        }
        if (this.field349 > var4) {
            this.field349 -= (this.field349 - var4) * this.field294 / 1000 + this.field293;
            if (this.field349 < var4) {
                this.field349 = var4;
            }
        }
        if (this.field350 < var3) {
            this.field350 += (var3 - this.field350) * this.field294 / 1000 + this.field293;
            if (this.field350 > var3) {
                this.field350 = var3;
            }
        }
        if (this.field350 > var3) {
            this.field350 -= (this.field350 - var3) * this.field294 / 1000 + this.field293;
            if (this.field350 < var3) {
                this.field350 = var3;
            }
        }
        int var5 = this.field108 * 128 + 64;
        int var6 = this.field109 * 128 + 64;
        if (arg0 != -106) {
            this.field244 = !this.field244;
        }
        int var7 = this.method65(var6, this.field164, false, var5) - this.field110;
        int var8 = var5 - this.field348;
        int var9 = var7 - this.field349;
        int var10 = var6 - this.field350;
        int var11 = (int) Math.sqrt((double) (var8 * var8 + var10 * var10));
        int var12 = (int) (Math.atan2((double) var9, (double) var11) * 325.949D) & 2047;
        int var13 = (int) (Math.atan2((double) var8, (double) var10) * -325.949D) & 2047;
        if (var12 < 128) {
            var12 = 128;
        }
        if (var12 > 383) {
            var12 = 383;
        }
        if (this.field351 < var12) {
            this.field351 += (var12 - this.field351) * this.field112 / 1000 + this.field111;
            if (this.field351 > var12) {
                this.field351 = var12;
            }
        }
        if (this.field351 > var12) {
            this.field351 -= (this.field351 - var12) * this.field112 / 1000 + this.field111;
            if (this.field351 < var12) {
                this.field351 = var12;
            }
        }
        int var14 = var13 - this.field352;
        if (var14 > 1024) {
            var14 -= 2048;
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (var14 > 0) {
            this.field352 += this.field112 * var14 / 1000 + this.field111;
            this.field352 &= 2047;
        }
        if (var14 < 0) {
            this.field352 -= -var14 * this.field112 / 1000 + this.field111;
            this.field352 &= 2047;
        }
        int var15 = var13 - this.field352;
        if (var15 > 1024) {
            var15 -= 2048;
        }
        if (var15 < -1024) {
            var15 += 2048;
        }
        if (var15 < 0 && var14 > 0 || var15 > 0 && var14 < 0) {
            this.field352 = var13;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(I[BI)Z")
    public final boolean method125(int arg0, byte[] arg1, int arg2) {
        if (this.field414 != arg2) {
            this.field213.method468(84);
        }
        return arg1 == null ? true : signlink.wavesave(arg1, arg0);
    }

    @OriginalMember(owner = "client", name = "k", descriptor = "(Z)V")
    public final void method126(boolean arg0) {
        if (!arg0) {
            this.field376 = null;
        }
        if (this.field545 >= 2 || this.field260 != 0 || this.field256 != 0) {
            String var2;
            if (this.field260 == 1 && this.field545 < 2) {
                var2 = "Use " + this.field264 + " with...";
            } else if (this.field256 == 1 && this.field545 < 2) {
                var2 = this.field259 + "...";
            } else {
                var2 = this.field215[this.field545 - 1];
            }
            if (this.field545 > 2) {
                var2 = var2 + "@whi@ / " + (this.field545 - 2) + " more options";
            }
            this.field513.method379(16777215, true, -718, 15, field330 / 1000, var2, 4);
        }
    }

    @OriginalMember(owner = "client", name = "M", descriptor = "(I)V")
    public final void method127(int arg0) {
        if (this.field102 != 0) {
            class44 var2 = this.field512;
            if (arg0 == 36089) {
                int var3 = 0;
                if (this.field387 != 0) {
                    var3 = 1;
                }
                for (int var4 = 0; var4 < 100; ++var4) {
                    if (this.field240[var4] != null) {
                        int var5 = this.field238[var4];
                        String var6 = this.field239[var4];
                        byte var7 = 0;
                        if (var6 != null && var6.startsWith("@cr1@")) {
                            var6 = var6.substring(5);
                            var7 = 1;
                        }
                        if (var6 != null && var6.startsWith("@cr2@")) {
                            var6 = var6.substring(5);
                            var7 = 2;
                        }
                        if ((var5 == 3 || var5 == 7) && (var5 == 7 || this.field412 == 0 || this.field412 == 1 && this.method98(0, var6))) {
                            int var8 = 329 - var3 * 13;
                            byte var9 = 4;
                            var2.method374(0, var8, "From", var9, 0);
                            var2.method374(0, var8 - 1, "From", var9, 65535);
                            int var10 = var9 + var2.method372("From ", 23764);
                            if (var7 == 1) {
                                this.field96[0].method533(-41075, var8 - 12, var10);
                                var10 += 14;
                            }
                            if (var7 == 2) {
                                this.field96[1].method533(-41075, var8 - 12, var10);
                                var10 += 14;
                            }
                            var2.method374(0, var8, var6 + ": " + this.field240[var4], var10, 0);
                            var2.method374(0, var8 - 1, var6 + ": " + this.field240[var4], var10, 65535);
                            ++var3;
                            if (var3 >= 5) {
                                return;
                            }
                        }
                        if (var5 == 5 && this.field412 < 2) {
                            int var11 = 329 - var3 * 13;
                            var2.method374(0, var11, this.field240[var4], 4, 0);
                            var2.method374(0, var11 - 1, this.field240[var4], 4, 65535);
                            ++var3;
                            if (var3 >= 5) {
                                return;
                            }
                        }
                        if (var5 == 6 && this.field412 < 2) {
                            int var12 = 329 - var3 * 13;
                            var2.method374(0, var12, "To " + var6 + ": " + this.field240[var4], 4, 0);
                            var2.method374(0, var12 - 1, "To " + var6 + ": " + this.field240[var4], 4, 65535);
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

    @OriginalMember(owner = "client", name = "a", descriptor = "(JZ)V")
    public final void method128(long arg0, boolean arg1) {
        if (arg1) {
            this.method44();
        }
        if (arg0 != 0L) {
            for (int var4 = 0; var4 < this.field433; ++var4) {
                if (this.field116[var4] == arg0) {
                    --this.field433;
                    this.field504 = true;
                    for (int var5 = var4; var5 < this.field433; ++var5) {
                        this.field116[var5] = this.field116[var5 + 1];
                    }
                    this.field213.method467(9, 832);
                    this.field213.method474(arg0, (byte) 6);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "N", descriptor = "(I)Z")
    public final boolean method129(int arg0) {
        if (arg0 < 4 || arg0 > 4) {
            this.field213.method468(37);
        }
        if (this.field173 == null) {
            return false;
        } else {
            try {
                int var2 = this.field173.method353();
                if (var2 == 0) {
                    return false;
                }
                if (this.field121 == -1) {
                    this.field173.method354(this.field251.field1541, 0, 1);
                    this.field121 = this.field251.field1541[0] & 255;
                    if (this.field454 != null) {
                        this.field121 = this.field121 - this.field454.method461() & 255;
                    }
                    this.field120 = class3.field32[this.field121];
                    --var2;
                }
                if (this.field120 == -1) {
                    if (var2 <= 0) {
                        return false;
                    }
                    this.field173.method354(this.field251.field1541, 0, 1);
                    this.field120 = this.field251.field1541[0] & 255;
                    --var2;
                }
                if (this.field120 == -2) {
                    if (var2 <= 1) {
                        return false;
                    }
                    this.field173.method354(this.field251.field1541, 0, 2);
                    this.field251.field1542 = 0;
                    this.field120 = this.field251.method480();
                    var2 -= 2;
                }
                if (var2 < this.field120) {
                    return false;
                }
                this.field251.field1542 = 0;
                this.field173.method354(this.field251.field1541, 0, this.field120);
                this.field122 = 0;
                this.field227 = this.field226;
                this.field226 = this.field225;
                this.field225 = this.field121;
                if (this.field121 == 23) {
                    this.field201 = this.field251.method478();
                    if (this.field201 == this.field115) {
                        if (this.field201 == 3) {
                            this.field115 = 1;
                        } else {
                            this.field115 = 3;
                        }
                        this.field504 = true;
                    }
                    this.field121 = -1;
                    return true;
                }
                if (this.field121 == 31) {
                    for (int var3 = 0; var3 < this.field420.length; ++var3) {
                        if (this.field420[var3] != null) {
                            this.field420[var3].field607 = -1;
                        }
                    }
                    for (int var4 = 0; var4 < this.field527.length; ++var4) {
                        if (this.field527[var4] != null) {
                            this.field527[var4].field607 = -1;
                        }
                    }
                    this.field121 = -1;
                    return true;
                }
                if (this.field121 == 100) {
                    int var5 = this.field251.method506((byte) 56);
                    int var6 = this.field251.method505(-623);
                    int var7 = var5 >> 10 & 31;
                    int var8 = var5 >> 5 & 31;
                    int var9 = var5 & 31;
                    class34.field1057[var6].field1046 = (var9 << 3) + (var7 << 19) + (var8 << 11);
                    this.field121 = -1;
                    return true;
                }
                if (this.field121 == 192) {
                    int var10 = this.field251.method506((byte) 56);
                    int var11 = this.field251.method505(-623);
                    int var12 = this.field251.method505(-623);
                    int var13 = this.field251.method505(-623);
                    class34.field1057[var12].field1054 = var13;
                    class34.field1057[var12].field1055 = var10;
                    class34.field1057[var12].field1053 = var11;
                    this.field121 = -1;
                    return true;
                }
                if (this.field121 == 223) {
                    String var14 = this.field251.method485();
                    int var15 = this.field251.method478();
                    int var16 = this.field251.method496(221);
                    if (var15 >= 1 && var15 <= 5) {
                        if (var14.equalsIgnoreCase("null")) {
                            var14 = null;
                        }
                        this.field482[var15 - 1] = var14;
                        this.field483[var15 - 1] = var16 == 0;
                    }
                    this.field121 = -1;
                    return true;
                }
                if (this.field121 == 7) {
                    this.field433 = this.field120 / 8;
                    for (int var17 = 0; var17 < this.field433; ++var17) {
                        this.field116[var17] = this.field251.method484((byte) 17);
                    }
                    this.field121 = -1;
                    return true;
                }
                if (this.field121 == 39) {
                    for (int var18 = 0; var18 < this.field374.length; ++var18) {
                        if (this.field374[var18] != this.field359[var18]) {
                            this.field374[var18] = this.field359[var18];
                            this.method141(var18, 1306);
                            this.field504 = true;
                        }
                    }
                    this.field121 = -1;
                    return true;
                }
                if (this.field121 == 26) {
                    if (this.field115 == 12) {
                        this.field504 = true;
                    }
                    this.field300 = this.field251.method481();
                    this.field121 = -1;
                    return true;
                }
                if (this.field121 == 32) {
                    int var19 = this.field251.method496(221);
                    int var20 = this.field251.method506((byte) 56);
                    if (var20 == 65535) {
                        var20 = -1;
                    }
                    this.field319[var19] = var20;
                    this.field504 = true;
                    this.field388 = true;
                    this.field121 = -1;
                    return true;
                }
                if (this.field121 == 28) {
                    this.field380 = this.field251.method496(221);
                    this.field86 = this.field251.method480();
                    this.field151 = this.field251.method505(-623);
                    this.field205 = this.field251.method478();
                    this.field551 = this.field251.method510(true);
                    if (this.field551 != 0 && this.field268 == -1) {
                        signlink.dnslookup(class20.method217(this.field551, this.field195));
                        this.method97(-171);
                        short var21 = 650;
                        if (this.field205 != 201 || this.field380 == 1) {
                            var21 = 655;
                        }
                        this.field308 = "";
                        this.field114 = false;
                        for (int var22 = 0; var22 < class34.field1057.length; ++var22) {
                            if (class34.field1057[var22] != null && class34.field1057[var22].field1027 == var21) {
                                this.field268 = class34.field1057[var22].field1001;
                                break;
                            }
                        }
                    }
                    this.field121 = -1;
                    return true;
                }
                if (this.field121 == 225) {
                    this.field504 = true;
                    int var23 = this.field251.method496(221);
                    int var24 = this.field251.method496(221);
                    int var25 = this.field251.method483();
                    this.field356[var23] = var25;
                    this.field506[var23] = var24;
                    this.field155[var23] = 1;
                    for (int var26 = 0; var26 < 98; ++var26) {
                        if (var25 >= field332[var26]) {
                            this.field155[var23] = var26 + 2;
                        }
                    }
                    this.field121 = -1;
                    return true;
                }
                if (this.field121 == 45) {
                    long var27 = this.field251.method484((byte) 17);
                    int var29 = this.field251.method478();
                    String var30 = class20.method218(-670, class20.method215(7, var27));
                    for (int var31 = 0; var31 < this.field458; ++var31) {
                        if (this.field272[var31] == var27) {
                            if (this.field242[var31] != var29) {
                                this.field242[var31] = var29;
                                this.field504 = true;
                                if (var29 > 0) {
                                    this.method155(-531, 5, var30 + " has logged in.", "");
                                }
                                if (var29 == 0) {
                                    this.method155(-531, 5, var30 + " has logged out.", "");
                                }
                            }
                            var30 = null;
                            break;
                        }
                    }
                    if (var30 != null && this.field458 < 200) {
                        this.field272[this.field458] = var27;
                        this.field431[this.field458] = var30;
                        this.field242[this.field458] = var29;
                        ++this.field458;
                        this.field504 = true;
                    }
                    boolean var32 = false;
                    while (!var32) {
                        var32 = true;
                        for (int var33 = 0; var33 < this.field458 - 1; ++var33) {
                            if (this.field242[var33] != field232 && this.field242[var33 + 1] == field232 || this.field242[var33] == 0 && this.field242[var33 + 1] != 0) {
                                int var34 = this.field242[var33];
                                this.field242[var33] = this.field242[var33 + 1];
                                this.field242[var33 + 1] = var34;
                                String var35 = this.field431[var33];
                                this.field431[var33] = this.field431[var33 + 1];
                                this.field431[var33 + 1] = var35;
                                long var36 = this.field272[var33];
                                this.field272[var33] = this.field272[var33 + 1];
                                this.field272[var33 + 1] = var36;
                                this.field504 = true;
                                var32 = false;
                            }
                        }
                    }
                    this.field121 = -1;
                    return true;
                }
                if (this.field121 == 193) {
                    this.method123(-765, this.field120, this.field251);
                    this.field121 = -1;
                    return true;
                }
                if (this.field121 == 40) {
                    int var38 = this.field251.method506((byte) 56);
                    int var39 = this.field251.method505(-623);
                    if (this.field322 != -1) {
                        this.field322 = -1;
                        this.field100 = true;
                    }
                    if (this.field471 != 0) {
                        this.field471 = 0;
                        this.field100 = true;
                    }
                    this.field268 = var39;
                    this.field342 = var38;
                    this.field504 = true;
                    this.field388 = true;
                    this.field132 = false;
                    this.field121 = -1;
                    return true;
                }
                if (this.field121 == 95) {
                    int var40 = this.field251.method506((byte) 56);
                    int var41 = this.field251.method506((byte) 56);
                    int var42 = this.field251.method480();
                    if (var42 == 65535) {
                        class34.field1057[var41].field1021 = 0;
                        this.field121 = -1;
                        return true;
                    }
                    class57 var43 = class57.method437(var42);
                    class34.field1057[var41].field1021 = 4;
                    class34.field1057[var41].field1022 = var42;
                    class34.field1057[var41].field1054 = var43.field1399;
                    class34.field1057[var41].field1055 = var43.field1420;
                    class34.field1057[var41].field1053 = var43.field1401 * 100 / var40;
                    this.field121 = -1;
                    return true;
                }
                if (this.field121 == 93) {
                    this.field504 = true;
                    int var44 = this.field251.method480();
                    class34 var45 = class34.field1057[var44];
                    while (this.field251.field1542 < this.field120) {
                        int var46 = this.field251.method492();
                        int var47 = this.field251.method480();
                        int var48 = this.field251.method478();
                        if (var48 == 255) {
                            var48 = this.field251.method483();
                        }
                        if (var46 >= 0 && var46 < var45.field1003.length) {
                            var45.field1003[var46] = var47;
                            var45.field1036[var46] = var48;
                        }
                    }
                    this.field121 = -1;
                    return true;
                }
                if (this.field121 == 204) {
                    long var49 = this.field251.method484((byte) 17);
                    int var51 = this.field251.method483();
                    int var52 = this.field251.method478();
                    boolean var53 = false;
                    for (int var54 = 0; var54 < 100; ++var54) {
                        if (this.field503[var54] == var51) {
                            var53 = true;
                            break;
                        }
                    }
                    if (var52 <= 1) {
                        for (int var55 = 0; var55 < this.field433; ++var55) {
                            if (this.field116[var55] == var49) {
                                var53 = true;
                                break;
                            }
                        }
                    }
                    if (!var53 && this.field118 == 0) {
                        try {
                            this.field503[this.field491] = var51;
                            this.field491 = (this.field491 + 1) % 100;
                            String var56 = class23.method223(-555, this.field120 - 13, this.field251);
                            if (var52 != 3) {
                                var56 = class35.method311(var56, 0);
                            }
                            if (var52 != 2 && var52 != 3) {
                                if (var52 == 1) {
                                    this.method155(-531, 7, var56, "@cr1@" + class20.method218(-670, class20.method215(7, var49)));
                                } else {
                                    this.method155(-531, 3, var56, class20.method218(-670, class20.method215(7, var49)));
                                }
                            } else {
                                this.method155(-531, 7, var56, "@cr2@" + class20.method218(-670, class20.method215(7, var49)));
                            }
                        } catch (Exception var187) {
                            signlink.reporterror("cde1");
                        }
                    }
                    this.field121 = -1;
                    return true;
                }
                if (this.field121 == 3) {
                    this.field516 = false;
                    this.field471 = 1;
                    this.field473 = "";
                    this.field100 = true;
                    this.field121 = -1;
                    return true;
                }
                if (this.field121 == 50) {
                    int var58 = this.field251.method511((byte) 64);
                    int var59 = this.field251.method504(-195);
                    this.field359[var59] = var58;
                    if (this.field374[var59] != var58) {
                        this.field374[var59] = var58;
                        this.method141(var59, 1306);
                        this.field504 = true;
                        if (this.field395 != -1) {
                            this.field100 = true;
                        }
                    }
                    this.field121 = -1;
                    return true;
                }
                if (this.field121 == 72) {
                    this.field369 = this.field251.method498(false);
                    this.field368 = this.field251.method497(8);
                    for (int var60 = this.field368; var60 < this.field368 + 8; ++var60) {
                        for (int var61 = this.field369; var61 < this.field369 + 8; ++var61) {
                            if (this.field376[this.field164][var60][var61] != null) {
                                this.field376[this.field164][var60][var61] = null;
                                this.method156(var60, var61);
                            }
                        }
                    }
                    for (class72 var62 = (class72) this.field367.method199(); var62 != null; var62 = (class72) this.field367.method201(467)) {
                        if (var62.field1723 >= this.field368 && var62.field1723 < this.field368 + 8 && var62.field1724 >= this.field369 && var62.field1724 < this.field369 + 8 && this.field164 == var62.field1721) {
                            var62.field1720 = 0;
                        }
                    }
                    this.field121 = -1;
                    return true;
                }
                if (this.field121 == 144) {
                    int var63 = this.field251.method504(-195);
                    class34.field1057[var63].field1021 = 3;
                    if (field174.field1356 == null) {
                        class34.field1057[var63].field1022 = (field174.field1369[11] << 5) + (field174.field1369[8] << 10) + (field174.field1369[0] << 15) + (field174.field1354[0] << 25) + (field174.field1354[4] << 20) + field174.field1369[1];
                    } else {
                        class34.field1057[var63].field1022 = (int) (field174.field1356.field784 + 305419896L);
                    }
                    this.field121 = -1;
                    return true;
                }
                if (this.field121 == 160) {
                    int var64 = this.field251.method506((byte) 56);
                    byte var65 = this.field251.method500(356);
                    this.field359[var64] = var65;
                    if (this.field374[var64] != var65) {
                        this.field374[var64] = var65;
                        this.method141(var64, 1306);
                        this.field504 = true;
                        if (this.field395 != -1) {
                            this.field100 = true;
                        }
                    }
                    this.field121 = -1;
                    return true;
                }
                if (this.field121 == 214) {
                    int var66 = this.field251.method480();
                    this.method60((byte) 5, var66);
                    if (this.field342 != -1) {
                        this.field342 = -1;
                        this.field504 = true;
                        this.field388 = true;
                    }
                    if (this.field322 != -1) {
                        this.field322 = -1;
                        this.field100 = true;
                    }
                    if (this.field471 != 0) {
                        this.field471 = 0;
                        this.field100 = true;
                    }
                    this.field268 = var66;
                    this.field132 = false;
                    this.field121 = -1;
                    return true;
                }
                if (this.field121 == 6) {
                    this.field372 = false;
                    for (int var67 = 0; var67 < 5; ++var67) {
                        this.field83[var67] = false;
                    }
                    this.field121 = -1;
                    return true;
                }
                if (this.field121 == 212) {
                    int var68 = this.field251.method504(-195);
                    int var69 = this.field251.method480();
                    class34 var70 = class34.field1057[var68];
                    if (var70 != null && var70.field1058 == 0) {
                        if (var69 < 0) {
                            var69 = 0;
                        }
                        if (var69 > var70.field1025 - var70.field1056) {
                            var69 = var70.field1025 - var70.field1056;
                        }
                        var70.field1049 = var69;
                    }
                    this.field121 = -1;
                    return true;
                }
                if (this.field121 == 199) {
                    this.method109(8407, this.field120, this.field251);
                    this.field347 = false;
                    this.field121 = -1;
                    return true;
                }
                if (this.field121 == 85) {
                    int var71 = this.field251.method507(this.field344);
                    this.field395 = var71;
                    this.field100 = true;
                    this.field121 = -1;
                    return true;
                }
                if (this.field121 == 56) {
                    int var72 = this.field251.method508(37075);
                    if (var72 >= 0) {
                        this.method60((byte) 5, var72);
                    }
                    this.field194 = var72;
                    this.field121 = -1;
                    return true;
                }
                if (this.field121 == 166) {
                    this.field115 = this.field251.method497(8);
                    this.field504 = true;
                    this.field388 = true;
                    this.field121 = -1;
                    return true;
                }
                if (this.field121 == 126) {
                    int var73 = this.field251.method480();
                    this.method60((byte) 5, var73);
                    if (this.field342 != -1) {
                        this.field342 = -1;
                        this.field504 = true;
                        this.field388 = true;
                    }
                    this.field322 = var73;
                    this.field100 = true;
                    this.field268 = -1;
                    this.field132 = false;
                    this.field121 = -1;
                    return true;
                }
                if (this.field121 == 92) {
                    this.field295 = 0;
                    this.field121 = -1;
                    return true;
                }
                if (this.field121 == 196) {
                    this.field481 = this.field251.method478();
                    this.field121 = -1;
                    return true;
                }
                if (this.field121 == 61) {
                    int var74 = this.field251.method480();
                    boolean var75 = this.field251.method496(221) == 1;
                    class34.field1057[var74].field1015 = var75;
                    this.field121 = -1;
                    return true;
                }
                if (this.field121 == 13) {
                    int var76 = this.field251.method480();
                    int var77 = this.field251.method478();
                    int var78 = this.field251.method480();
                    if (this.field508 && !field235 && this.field360 < 50) {
                        this.field314[this.field360] = var76;
                        this.field147[this.field360] = var77;
                        this.field219[this.field360] = class9.field560[var76] + var78;
                        ++this.field360;
                    }
                    this.field121 = -1;
                    return true;
                }
                if (this.field121 == 157) {
                    this.field387 = this.field251.method480() * 30;
                    this.field121 = -1;
                    return true;
                }
                if (this.field121 == 232) {
                    this.field368 = this.field251.method496(221);
                    this.field369 = this.field251.method498(false);
                    this.field121 = -1;
                    return true;
                }
                if (this.field121 == 76) {
                    this.field504 = true;
                    int var79 = this.field251.method480();
                    class34 var80 = class34.field1057[var79];
                    int var81 = this.field251.method480();
                    for (int var82 = 0; var82 < var81; ++var82) {
                        int var83 = this.field251.method478();
                        if (var83 == 255) {
                            var83 = this.field251.method511((byte) 64);
                        }
                        var80.field1003[var82] = this.field251.method504(-195);
                        var80.field1036[var82] = var83;
                    }
                    for (int var84 = var81; var84 < var80.field1003.length; ++var84) {
                        var80.field1003[var84] = 0;
                        var80.field1036[var84] = 0;
                    }
                    this.field121 = -1;
                    return true;
                }
                if (this.field121 == 44) {
                    int var85 = this.field251.method506((byte) 56);
                    if (var85 == 65535) {
                        var85 = -1;
                    }
                    if (this.field182 != var85 && this.field480 && !field235 && this.field542 == 0) {
                        this.field298 = var85;
                        this.field299 = true;
                        this.field324.method451(2, this.field298);
                    }
                    this.field182 = var85;
                    this.field121 = -1;
                    return true;
                }
                if (this.field121 == 203) {
                    int var86 = this.field251.method504(-195);
                    int var87 = this.field251.method504(-195);
                    if (this.field480 && !field235) {
                        this.field298 = var86;
                        this.field299 = false;
                        this.field324.method451(2, this.field298);
                        this.field542 = var87;
                    }
                    this.field121 = -1;
                    return true;
                }
                if (this.field121 == 97) {
                    this.field171 = this.field251.method478();
                    this.field121 = -1;
                    return true;
                }
                if (this.field121 == 153) {
                    this.field459 = this.field251.method478();
                    this.field504 = true;
                    this.field121 = -1;
                    return true;
                }
                if (this.field121 == 46) {
                    int var88 = this.field251.method505(-623);
                    int var89 = this.field251.method507(this.field344);
                    class34 var90 = class34.field1057[var88];
                    var90.field1007 = var89;
                    if (var89 == -1) {
                        var90.field1044 = 0;
                        var90.field1016 = 0;
                    }
                    this.field121 = -1;
                    return true;
                }
                if (this.field121 == 149) {
                    int var91 = this.field251.method478();
                    int var92 = this.field251.method478();
                    int var93 = this.field251.method478();
                    int var94 = this.field251.method478();
                    this.field83[var91] = true;
                    this.field357[var91] = var92;
                    this.field466[var91] = var93;
                    this.field246[var91] = var94;
                    this.field393[var91] = 0;
                    this.field121 = -1;
                    return true;
                }
                if (this.field121 == 108) {
                    if (this.field115 == 12) {
                        this.field504 = true;
                    }
                    this.field538 = this.field251.method478();
                    this.field121 = -1;
                    return true;
                }
                if (this.field121 == 123) {
                    int var95 = this.field251.method505(-623);
                    int var96 = this.field251.method506((byte) 56);
                    class34.field1057[var95].field1021 = 1;
                    class34.field1057[var95].field1022 = var96;
                    this.field121 = -1;
                    return true;
                }
                if (this.field121 == 64) {
                    String var97 = this.field251.method485();
                    if (var97.endsWith(":tradereq:")) {
                        String var98 = var97.substring(0, var97.indexOf(":"));
                        long var99 = class20.method214(var98);
                        boolean var101 = false;
                        for (int var102 = 0; var102 < this.field433; ++var102) {
                            if (this.field116[var102] == var99) {
                                var101 = true;
                                break;
                            }
                        }
                        if (!var101 && this.field118 == 0) {
                            this.method155(-531, 4, "wishes to trade with you.", var98);
                        }
                    } else if (var97.endsWith(":duelreq:")) {
                        String var103 = var97.substring(0, var97.indexOf(":"));
                        long var104 = class20.method214(var103);
                        boolean var106 = false;
                        for (int var107 = 0; var107 < this.field433; ++var107) {
                            if (this.field116[var107] == var104) {
                                var106 = true;
                                break;
                            }
                        }
                        if (!var106 && this.field118 == 0) {
                            this.method155(-531, 8, "wishes to duel with you.", var103);
                        }
                    } else if (!var97.endsWith(":chalreq:")) {
                        this.method155(-531, 0, var97, "");
                    } else {
                        String var108 = var97.substring(0, var97.indexOf(":"));
                        long var109 = class20.method214(var108);
                        boolean var111 = false;
                        for (int var112 = 0; var112 < this.field433; ++var112) {
                            if (this.field116[var112] == var109) {
                                var111 = true;
                                break;
                            }
                        }
                        if (!var111 && this.field118 == 0) {
                            String var113 = var97.substring(var97.indexOf(":") + 1, var97.length() - 9);
                            this.method155(-531, 8, var113, var108);
                        }
                    }
                    this.field121 = -1;
                    return true;
                }
                if (this.field121 == 15) {
                    int var114 = this.field251.method480();
                    class34 var115 = class34.field1057[var114];
                    for (int var116 = 0; var116 < var115.field1003.length; ++var116) {
                        var115.field1003[var116] = -1;
                        var115.field1003[var116] = 0;
                    }
                    this.field121 = -1;
                    return true;
                }
                if (this.field121 == 18) {
                    int var117 = this.field251.method506((byte) 56);
                    String var118 = this.field251.method485();
                    class34.field1057[var117].field1002 = var118;
                    if (this.field319[this.field115] == class34.field1057[var117].field1001) {
                        this.field504 = true;
                    }
                    this.field121 = -1;
                    return true;
                }
                if (this.field121 != 68 && this.field121 != 217) {
                    if (this.field121 == 89) {
                        this.field546 = this.field251.method478();
                        this.field412 = this.field251.method478();
                        this.field162 = this.field251.method478();
                        this.field310 = true;
                        this.field100 = true;
                        this.field121 = -1;
                        return true;
                    }
                    if (this.field121 == 161) {
                        int var169 = this.field251.method504(-195);
                        this.method60((byte) 5, var169);
                        if (this.field322 != -1) {
                            this.field322 = -1;
                            this.field100 = true;
                        }
                        if (this.field471 != 0) {
                            this.field471 = 0;
                            this.field100 = true;
                        }
                        this.field342 = var169;
                        this.field504 = true;
                        this.field388 = true;
                        this.field268 = -1;
                        this.field132 = false;
                        this.field121 = -1;
                        return true;
                    }
                    if (this.field121 != 240) {
                        if (this.field121 == 237) {
                            if (this.field342 != -1) {
                                this.field342 = -1;
                                this.field504 = true;
                                this.field388 = true;
                            }
                            if (this.field322 != -1) {
                                this.field322 = -1;
                                this.field100 = true;
                            }
                            if (this.field471 != 0) {
                                this.field471 = 0;
                                this.field100 = true;
                            }
                            this.field268 = -1;
                            this.field132 = false;
                            this.field121 = -1;
                            return true;
                        }
                        if (this.field121 == 101 || this.field121 == 0 || this.field121 == 229 || this.field121 == 84 || this.field121 == 41 || this.field121 == 172 || this.field121 == 180 || this.field121 == 81 || this.field121 == 252 || this.field121 == 36 || this.field121 == 156) {
                            this.method34(this.field121, 4, this.field251);
                            this.field121 = -1;
                            return true;
                        }
                        if (this.field121 == 102) {
                            this.field148 = this.field251.method478();
                            if (this.field148 == 1) {
                                this.field241 = this.field251.method480();
                            }
                            if (this.field148 >= 2 && this.field148 <= 6) {
                                if (this.field148 == 2) {
                                    this.field140 = 64;
                                    this.field141 = 64;
                                }
                                if (this.field148 == 3) {
                                    this.field140 = 0;
                                    this.field141 = 64;
                                }
                                if (this.field148 == 4) {
                                    this.field140 = 128;
                                    this.field141 = 64;
                                }
                                if (this.field148 == 5) {
                                    this.field140 = 64;
                                    this.field141 = 0;
                                }
                                if (this.field148 == 6) {
                                    this.field140 = 64;
                                    this.field141 = 128;
                                }
                                this.field148 = 2;
                                this.field137 = this.field251.method480();
                                this.field138 = this.field251.method480();
                                this.field139 = this.field251.method478();
                            }
                            if (this.field148 == 10) {
                                this.field327 = this.field251.method480();
                            }
                            this.field121 = -1;
                            return true;
                        }
                        if (this.field121 == 250) {
                            this.field516 = false;
                            this.field471 = 2;
                            this.field473 = "";
                            this.field100 = true;
                            this.field121 = -1;
                            return true;
                        }
                        if (this.field121 == 90) {
                            this.field368 = this.field251.method497(8);
                            this.field369 = this.field251.method497(8);
                            while (this.field251.field1542 < this.field120) {
                                int var172 = this.field251.method478();
                                this.method34(var172, 4, this.field251);
                            }
                            this.field121 = -1;
                            return true;
                        }
                        if (this.field121 == 228) {
                            this.field372 = true;
                            this.field108 = this.field251.method478();
                            this.field109 = this.field251.method478();
                            this.field110 = this.field251.method480();
                            this.field111 = this.field251.method478();
                            this.field112 = this.field251.method478();
                            if (this.field112 >= 100) {
                                int var173 = this.field108 * 128 + 64;
                                int var174 = this.field109 * 128 + 64;
                                int var175 = this.method65(var174, this.field164, false, var173) - this.field110;
                                int var176 = var173 - this.field348;
                                int var177 = var175 - this.field349;
                                int var178 = var174 - this.field350;
                                int var179 = (int) Math.sqrt((double) (var176 * var176 + var178 * var178));
                                this.field351 = (int) (Math.atan2((double) var177, (double) var179) * 325.949D) & 2047;
                                this.field352 = (int) (Math.atan2((double) var176, (double) var178) * -325.949D) & 2047;
                                if (this.field351 < 128) {
                                    this.field351 = 128;
                                }
                                if (this.field351 > 383) {
                                    this.field351 = 383;
                                }
                            }
                            this.field121 = -1;
                            return true;
                        }
                        if (this.field121 == 245) {
                            int var180 = this.field251.method504(-195);
                            int var181 = this.field251.method507(this.field344);
                            int var182 = this.field251.method507(this.field344);
                            class34 var183 = class34.field1057[var180];
                            var183.field1018 = var182;
                            var183.field1000 = var181;
                            this.field121 = -1;
                            return true;
                        }
                        if (this.field121 == 25) {
                            this.field372 = true;
                            this.field290 = this.field251.method478();
                            this.field291 = this.field251.method478();
                            this.field292 = this.field251.method480();
                            this.field293 = this.field251.method478();
                            this.field294 = this.field251.method478();
                            if (this.field294 >= 100) {
                                this.field348 = this.field290 * 128 + 64;
                                this.field350 = this.field291 * 128 + 64;
                                this.field349 = this.method65(this.field350, this.field164, false, this.field348) - this.field292;
                            }
                            this.field121 = -1;
                            return true;
                        }
                        if (this.field121 == 159) {
                            this.field525 = this.field251.method497(8);
                            this.field301 = this.field251.method505(-623);
                            this.field121 = -1;
                            return true;
                        }
                        if (this.field121 == 234) {
                            this.method121(this.field178);
                            this.field121 = -1;
                            return false;
                        }
                        signlink.reporterror("T1 - " + this.field121 + "," + this.field120 + " - " + this.field226 + "," + this.field227);
                        this.method121(this.field178);
                        return true;
                    }
                    int var170 = this.field251.method506((byte) 56);
                    int var171 = this.field251.method505(-623);
                    class34.field1057[var171].field1021 = 2;
                    class34.field1057[var171].field1022 = var170;
                    this.field121 = -1;
                    return true;
                }
                int var119 = this.field277;
                int var120 = this.field278;
                if (this.field121 == 68) {
                    var120 = this.field251.method480();
                    var119 = this.field251.method504(-195);
                    this.field237 = false;
                }
                if (this.field121 == 217) {
                    this.field251.method488(2);
                    int var121 = 0;
                    while (true) {
                        if (var121 >= 4) {
                            this.field251.method490((byte) 8);
                            var120 = this.field251.method480();
                            var119 = this.field251.method480();
                            this.field237 = true;
                            break;
                        }
                        for (int var122 = 0; var122 < 13; ++var122) {
                            for (int var123 = 0; var123 < 13; ++var123) {
                                int var124 = this.field251.method489(1, 0);
                                if (var124 == 1) {
                                    this.field198[var121][var122][var123] = this.field251.method489(26, 0);
                                } else {
                                    this.field198[var121][var122][var123] = -1;
                                }
                            }
                        }
                        ++var121;
                    }
                }
                if (this.field277 == var119 && this.field278 == var120 && this.field302 == 2) {
                    this.field121 = -1;
                    return true;
                }
                this.field277 = var119;
                this.field278 = var120;
                this.field125 = (this.field277 - 6) * 8;
                this.field126 = (this.field278 - 6) * 8;
                this.field407 = false;
                if ((this.field277 / 8 == 48 || this.field277 / 8 == 49) && this.field278 / 8 == 48) {
                    this.field407 = true;
                }
                if (this.field277 / 8 == 48 && this.field278 / 8 == 148) {
                    this.field407 = true;
                }
                this.field302 = 1;
                this.field253 = System.currentTimeMillis();
                this.field523.method394(false);
                this.field512.method370("Loading - please wait.", 257, false, 0, 151);
                this.field512.method370("Loading - please wait.", 256, false, 16777215, 150);
                this.field523.method395(-30874, super.field1179, 4, 4);
                if (this.field121 == 68) {
                    int var125 = 0;
                    int var126 = (this.field277 - 6) / 8;
                    label1099: while (true) {
                        if (var126 > (this.field277 + 6) / 8) {
                            this.field97 = new byte[var125][];
                            this.field135 = new byte[var125][];
                            this.field167 = new int[var125];
                            this.field168 = new int[var125];
                            this.field169 = new int[var125];
                            int var128 = 0;
                            int var129 = (this.field277 - 6) / 8;
                            while (true) {
                                if (var129 > (this.field277 + 6) / 8) {
                                    break label1099;
                                }
                                for (int var130 = (this.field278 - 6) / 8; var130 <= (this.field278 + 6) / 8; ++var130) {
                                    this.field167[var128] = (var129 << 8) + var130;
                                    if (this.field407 && (var130 == 49 || var130 == 149 || var130 == 147 || var129 == 50 || var129 == 49 && var130 == 47)) {
                                        this.field168[var128] = -1;
                                        this.field169[var128] = -1;
                                        ++var128;
                                    } else {
                                        int var131 = this.field168[var128] = this.field324.method449(var129, 0, var130, 0);
                                        if (var131 != -1) {
                                            this.field324.method451(3, var131);
                                        }
                                        int var132 = this.field169[var128] = this.field324.method449(var129, 1, var130, 0);
                                        if (var132 != -1) {
                                            this.field324.method451(3, var132);
                                        }
                                        ++var128;
                                    }
                                }
                                ++var129;
                            }
                        }
                        for (int var127 = (this.field278 - 6) / 8; var127 <= (this.field278 + 6) / 8; ++var127) {
                            ++var125;
                        }
                        ++var126;
                    }
                }
                if (this.field121 == 217) {
                    int var133 = 0;
                    int[] var134 = new int[676];
                    int var135 = 0;
                    label1060: while (true) {
                        if (var135 >= 4) {
                            this.field97 = new byte[var133][];
                            this.field135 = new byte[var133][];
                            this.field167 = new int[var133];
                            this.field168 = new int[var133];
                            this.field169 = new int[var133];
                            int var143 = 0;
                            while (true) {
                                if (var143 >= var133) {
                                    break label1060;
                                }
                                int var144 = this.field167[var143] = var134[var143];
                                int var145 = var144 >> 8 & 255;
                                int var146 = var144 & 255;
                                int var147 = this.field168[var143] = this.field324.method449(var145, 0, var146, 0);
                                if (var147 != -1) {
                                    this.field324.method451(3, var147);
                                }
                                int var148 = this.field169[var143] = this.field324.method449(var145, 1, var146, 0);
                                if (var148 != -1) {
                                    this.field324.method451(3, var148);
                                }
                                ++var143;
                            }
                        }
                        for (int var136 = 0; var136 < 13; ++var136) {
                            for (int var137 = 0; var137 < 13; ++var137) {
                                int var138 = this.field198[var135][var136][var137];
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
                int var149 = this.field125 - this.field127;
                int var150 = this.field126 - this.field128;
                this.field127 = this.field125;
                this.field128 = this.field126;
                for (int var151 = 0; var151 < 16384; ++var151) {
                    class1 var152 = this.field527[var151];
                    if (var152 != null) {
                        for (int var153 = 0; var153 < 10; ++var153) {
                            var152.field619[var153] -= var149;
                            var152.field620[var153] -= var150;
                        }
                        var152.field587 -= var149 * 128;
                        var152.field588 -= var150 * 128;
                    }
                }
                for (int var154 = 0; var154 < this.field418; ++var154) {
                    class54 var155 = this.field420[var154];
                    if (var155 != null) {
                        for (int var156 = 0; var156 < 10; ++var156) {
                            var155.field619[var156] -= var149;
                            var155.field620[var156] -= var150;
                        }
                        var155.field587 -= var149 * 128;
                        var155.field588 -= var150 * 128;
                    }
                }
                this.field347 = true;
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
                                this.field376[var167][var163][var164] = this.field376[var167][var165][var166];
                            } else {
                                this.field376[var167][var163][var164] = null;
                            }
                        }
                    }
                }
                for (class72 var168 = (class72) this.field367.method199(); var168 != null; var168 = (class72) this.field367.method201(467)) {
                    var168.field1723 -= var149;
                    var168.field1724 -= var150;
                    if (var168.field1723 < 0 || var168.field1724 < 0 || var168.field1723 >= 104 || var168.field1724 >= 104) {
                        var168.method195();
                    }
                }
                if (this.field295 != 0) {
                    this.field295 -= var149;
                    this.field296 -= var150;
                }
                this.field372 = false;
                this.field121 = -1;
                return true;
            } catch (IOException var188) {
                this.method39(763);
            } catch (Exception var189) {
                String var185 = "T2 - " + this.field121 + "," + this.field226 + "," + this.field227 + " - " + this.field120 + "," + (field174.field619[0] + this.field125) + "," + (field174.field620[0] + this.field126) + " - ";
                for (int var186 = 0; var186 < this.field120 && var186 < 50; ++var186) {
                    var185 = var185 + this.field251.field1541[var186] + ",";
                }
                signlink.reporterror(var185);
                this.method121(this.field178);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LYPWLUGYN;I)V")
    public final void method130(class66 arg0, int arg1) {
        short var3 = 256;
        if (arg1 != 15549) {
            this.field343 = 258;
        }
        for (int var4 = 0; var4 < this.field254.length; ++var4) {
            this.field254[var4] = 0;
        }
        for (int var5 = 0; var5 < 5000; ++var5) {
            int var17 = (int) (Math.random() * 128.0D * (double) var3);
            this.field254[var17] = (int) (Math.random() * 256.0D);
        }
        for (int var6 = 0; var6 < 20; ++var6) {
            for (int var13 = 1; var13 < var3 - 1; ++var13) {
                for (int var15 = 1; var15 < 127; ++var15) {
                    int var16 = (var13 << 7) + var15;
                    this.field255[var16] = (this.field254[var16 - 1] + this.field254[var16 + 1] + this.field254[var16 - 128] + this.field254[var16 + 128]) / 4;
                }
            }
            int[] var14 = this.field254;
            this.field254 = this.field255;
            this.field255 = var14;
        }
        if (arg0 != null) {
            int var7 = 0;
            for (int var8 = 0; var8 < arg0.field1600; ++var8) {
                for (int var9 = 0; var9 < arg0.field1599; ++var9) {
                    if (arg0.field1597[var7++] != 0) {
                        int var10 = var9 + 16 + arg0.field1601;
                        int var11 = var8 + 16 + arg0.field1602;
                        int var12 = (var11 << 7) + var10;
                        this.field254[var12] = 0;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LZDLIXYKO;B)V")
    private final void method131(class72 arg0, byte arg1) {
        int var3 = 0;
        int var4 = -1;
        int var5 = 0;
        int var6 = 0;
        if (this.field386 == arg1) {
            boolean var7 = false;
        } else {
            this.field121 = this.field251.method478();
        }
        if (arg0.field1722 == 0) {
            var3 = this.field409.method565(arg0.field1721, arg0.field1723, arg0.field1724);
        }
        if (arg0.field1722 == 1) {
            var3 = this.field409.method566(arg0.field1723, arg0.field1721, 6, arg0.field1724);
        }
        if (arg0.field1722 == 2) {
            var3 = this.field409.method567(arg0.field1721, arg0.field1723, arg0.field1724);
        }
        if (arg0.field1722 == 3) {
            var3 = this.field409.method568(arg0.field1721, arg0.field1723, arg0.field1724);
        }
        if (var3 != 0) {
            int var8 = this.field409.method569(arg0.field1721, arg0.field1723, arg0.field1724, var3);
            var4 = var3 >> 14 & 32767;
            var5 = var8 & 31;
            var6 = var8 >> 6;
        }
        arg0.field1713 = var4;
        arg0.field1715 = var5;
        arg0.field1714 = var6;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(II)V")
    public final void method132(int arg0, int arg1) {
        int[] var3 = this.field297.field41;
        int var4 = var3.length;
        for (int var5 = 0; var5 < var4; ++var5) {
            var3[var5] = 0;
        }
        for (int var6 = 1; var6 < 103; ++var6) {
            int var23 = (103 - var6) * 512 * 4 + 24628;
            for (int var24 = 1; var24 < 103; ++var24) {
                if ((this.field460[arg1][var24][var6] & 24) == 0) {
                    this.field409.method574(var3, var23, 512, arg1, var24, var6);
                }
                if (arg1 < 3 && (this.field460[arg1 + 1][var24][var6] & 8) != 0) {
                    this.field409.method574(var3, var23, 512, arg1 + 1, var24, var6);
                }
                var23 += 4;
            }
        }
        if (arg0 >= 7 && arg0 <= 7) {
            int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
            int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
            this.field297.method8(false);
            for (int var9 = 1; var9 < 103; ++var9) {
                for (int var22 = 1; var22 < 103; ++var22) {
                    if ((this.field460[arg1][var22][var9] & 24) == 0) {
                        this.method171(var7, arg1, var9, var22, true, var8);
                    }
                    if (arg1 < 3 && (this.field460[arg1 + 1][var22][var9] & 8) != 0) {
                        this.method171(var7, arg1 + 1, var9, var22, true, var8);
                    }
                }
            }
            this.field523.method394(false);
            this.field461 = 0;
            for (int var10 = 0; var10 < 104; ++var10) {
                for (int var11 = 0; var11 < 104; ++var11) {
                    int var12 = this.field409.method568(this.field164, var10, var11);
                    if (var12 != 0) {
                        int var13 = var12 >> 14 & 32767;
                        int var14 = class13.method194(var13).field688;
                        if (var14 >= 0) {
                            int var15 = var10;
                            int var16 = var11;
                            if (var14 != 22 && var14 != 29 && var14 != 34 && var14 != 36 && var14 != 46 && var14 != 47 && var14 != 48) {
                                byte var17 = 104;
                                byte var18 = 104;
                                int[][] var19 = this.field103[this.field164].field1567;
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
                            this.field391[this.field461] = this.field534[var14];
                            this.field462[this.field461] = var15;
                            this.field463[this.field461] = var16;
                            ++this.field461;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LDGZJCXBC;II)V")
    public final void method133(class12 arg0, int arg1, int arg2) {
        while (arg2 >= 0) {
            this.field213.method468(88);
        }
        this.method134(arg1, arg0.field588, arg0.field587, -106);
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(IIII)V")
    public final void method134(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 >= 128 && arg1 >= 128 && arg2 <= 13056 && arg1 <= 13056) {
            int var5 = this.method65(arg1, this.field164, false, arg2) - arg0;
            int var6 = arg2 - this.field348;
            int var7 = var5 - this.field349;
            int var8 = arg1 - this.field350;
            int var9 = class27.field926[this.field351];
            int var10 = class27.field927[this.field351];
            int var11 = class27.field926[this.field352];
            int var12 = class27.field927[this.field352];
            int var13 = var6 * var12 + var8 * var11 >> 16;
            if (arg3 >= 0) {
                this.field446 = this.field454.method461();
            }
            int var14 = var8 * var12 - var6 * var11 >> 16;
            int var16 = var7 * var10 - var9 * var14 >> 16;
            int var17 = var7 * var9 + var10 * var14 >> 16;
            if (var17 >= 50) {
                this.field270 = (var13 << 9) / var17 + class31.field969;
                this.field271 = (var16 << 9) / var17 + class31.field970;
            } else {
                this.field270 = -1;
                this.field271 = -1;
            }
        } else {
            this.field270 = -1;
            this.field271 = -1;
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(LXQPFGONL;II)V")
    private final void method135(class62 arg0, int arg1, int arg2) {
        while (true) {
            if (arg0.field1543 + 21 < arg2 * 8) {
                int var4 = arg0.method489(14, 0);
                if (var4 != 16383) {
                    if (this.field527[var4] == null) {
                        this.field527[var4] = new class1();
                    }
                    class1 var5 = this.field527[var4];
                    this.field529[this.field528++] = var4;
                    var5.field630 = field330;
                    int var6 = arg0.method489(5, 0);
                    if (var6 > 15) {
                        var6 -= 32;
                    }
                    int var7 = arg0.method489(1, 0);
                    int var8 = arg0.method489(5, 0);
                    if (var8 > 15) {
                        var8 -= 32;
                    }
                    var5.field5 = class19.method210(arg0.method489(12, 0));
                    int var9 = arg0.method489(1, 0);
                    if (var9 == 1) {
                        this.field424[this.field423++] = var4;
                    }
                    var5.field615 = var5.field5.field768;
                    var5.field637 = var5.field5.field776;
                    var5.field593 = var5.field5.field766;
                    var5.field594 = var5.field5.field780;
                    var5.field595 = var5.field5.field775;
                    var5.field596 = var5.field5.field783;
                    var5.field616 = var5.field5.field778;
                    var5.method183(9, field174.field620[0] + var8, field174.field619[0] + var6, var7 == 1);
                    continue;
                }
            }
            arg0.method490((byte) 8);
            if (arg1 != 0) {
                this.field121 = arg0.method478();
                return;
            }
            return;
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(IILXQPFGONL;)V")
    private final void method136(int arg0, int arg1, class62 arg2) {
        arg2.method488(2);
        int var4 = arg2.method489(8, 0);
        if (var4 < this.field528) {
            for (int var5 = var4; var5 < this.field528; ++var5) {
                this.field540[this.field539++] = this.field529[var5];
            }
        }
        if (var4 > this.field528) {
            signlink.reporterror(this.field555 + " Too many npcs");
            throw new RuntimeException("eek");
        } else {
            this.field528 = 0;
            for (int var6 = 0; var6 < var4; ++var6) {
                int var8 = this.field529[var6];
                class1 var9 = this.field527[var8];
                int var10 = arg2.method489(1, 0);
                if (var10 == 0) {
                    this.field529[this.field528++] = var8;
                    var9.field630 = field330;
                } else {
                    int var11 = arg2.method489(2, 0);
                    if (var11 == 0) {
                        this.field529[this.field528++] = var8;
                        var9.field630 = field330;
                        this.field424[this.field423++] = var8;
                    } else if (var11 == 1) {
                        this.field529[this.field528++] = var8;
                        var9.field630 = field330;
                        int var12 = arg2.method489(3, 0);
                        var9.method180(var12, 5, false);
                        int var13 = arg2.method489(1, 0);
                        if (var13 == 1) {
                            this.field424[this.field423++] = var8;
                        }
                    } else if (var11 == 2) {
                        this.field529[this.field528++] = var8;
                        var9.field630 = field330;
                        int var14 = arg2.method489(3, 0);
                        var9.method180(var14, 5, true);
                        int var15 = arg2.method489(3, 0);
                        var9.method180(var15, 5, true);
                        int var16 = arg2.method489(1, 0);
                        if (var16 == 1) {
                            this.field424[this.field423++] = var8;
                        }
                    } else if (var11 == 3) {
                        this.field540[this.field539++] = var8;
                    }
                }
            }
            int var7 = 45 / arg0;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LKFCZNNDM;B)V")
    public final void method137(class34 arg0, byte arg1) {
        if (arg1 == 9) {
            boolean var3 = false;
        } else {
            this.field121 = this.field251.method478();
        }
        int var4 = arg0.field1027;
        if ((var4 < 1 || var4 > 100) && (var4 < 701 || var4 > 800)) {
            if (var4 >= 101 && var4 <= 200 || var4 >= 801 && var4 <= 900) {
                int var6 = this.field458;
                if (this.field459 != 2) {
                    var6 = 0;
                }
                if (var4 > 800) {
                    var4 -= 701;
                } else {
                    var4 -= 101;
                }
                if (var4 >= var6) {
                    arg0.field1002 = "";
                    arg0.field1059 = 0;
                } else {
                    if (this.field242[var4] == 0) {
                        arg0.field1002 = "@red@Offline";
                    } else if (this.field242[var4] == field232) {
                        arg0.field1002 = "@gre@World-" + (this.field242[var4] - 9);
                    } else {
                        arg0.field1002 = "@yel@World-" + (this.field242[var4] - 9);
                    }
                    arg0.field1059 = 1;
                }
            } else if (var4 == 203) {
                int var7 = this.field458;
                if (this.field459 != 2) {
                    var7 = 0;
                }
                arg0.field1025 = var7 * 15 + 20;
                if (arg0.field1025 <= arg0.field1056) {
                    arg0.field1025 = arg0.field1056 + 1;
                }
            } else if (var4 >= 401 && var4 <= 500) {
                var4 -= 401;
                if (var4 == 0 && this.field459 == 0) {
                    arg0.field1002 = "Loading ignore list";
                    arg0.field1059 = 0;
                } else if (var4 == 1 && this.field459 == 0) {
                    arg0.field1002 = "Please wait...";
                    arg0.field1059 = 0;
                } else {
                    int var8 = this.field433;
                    if (this.field459 == 0) {
                        var8 = 0;
                    }
                    if (var4 >= var8) {
                        arg0.field1002 = "";
                        arg0.field1059 = 0;
                    } else {
                        arg0.field1002 = class20.method218(-670, class20.method215(7, this.field116[var4]));
                        arg0.field1059 = 1;
                    }
                }
            } else if (var4 == 503) {
                arg0.field1025 = this.field433 * 15 + 20;
                if (arg0.field1025 <= arg0.field1056) {
                    arg0.field1025 = arg0.field1056 + 1;
                }
            } else if (var4 == 327) {
                arg0.field1054 = 150;
                arg0.field1055 = (int) (Math.sin((double) field330 / 40.0D) * 256.0D) & 2047;
                if (this.field250) {
                    for (int var9 = 0; var9 < 7; ++var9) {
                        int var16 = this.field230[var9];
                        if (var16 >= 0 && !class5.field52[var16].method23(false)) {
                            return;
                        }
                    }
                    this.field250 = false;
                    class27[] var10 = new class27[7];
                    int var11 = 0;
                    for (int var12 = 0; var12 < 7; ++var12) {
                        int var15 = this.field230[var12];
                        if (var15 >= 0) {
                            var10[var11++] = class5.field52[var15].method24(0);
                        }
                    }
                    class27 var13 = new class27(var10, true, var11);
                    for (int var14 = 0; var14 < 5; ++var14) {
                        if (this.field231[var14] != 0) {
                            var13.method252(field408[var14][0], field408[var14][this.field231[var14]]);
                            if (var14 == 1) {
                                var13.method252(field434[0], field434[this.field231[var14]]);
                            }
                        }
                    }
                    var13.method245(0);
                    var13.method246(-1851, class24.field813[field174.field616].field815[0]);
                    var13.method255(64, 850, -30, -50, -30, true);
                    arg0.field1021 = 5;
                    arg0.field1022 = 0;
                    class34.method297(0, 738, 5, var13);
                }
            } else if (var4 == 324) {
                if (this.field133 == null) {
                    this.field133 = arg0.field1040;
                    this.field134 = arg0.field1005;
                }
                if (this.field396) {
                    arg0.field1040 = this.field134;
                } else {
                    arg0.field1040 = this.field133;
                }
            } else if (var4 == 325) {
                if (this.field133 == null) {
                    this.field133 = arg0.field1040;
                    this.field134 = arg0.field1005;
                }
                if (this.field396) {
                    arg0.field1040 = this.field133;
                } else {
                    arg0.field1040 = this.field134;
                }
            } else if (var4 == 600) {
                arg0.field1002 = this.field308;
                if (field330 % 20 < 10) {
                    arg0.field1002 = arg0.field1002 + "|";
                } else {
                    arg0.field1002 = arg0.field1002 + " ";
                }
            } else {
                if (var4 == 613) {
                    if (this.field417 >= 1) {
                        if (this.field114) {
                            arg0.field1046 = 16711680;
                            arg0.field1002 = "Moderator option: Mute player for 48 hours: <ON>";
                        } else {
                            arg0.field1046 = 16777215;
                            arg0.field1002 = "Moderator option: Mute player for 48 hours: <OFF>";
                        }
                    } else {
                        arg0.field1002 = "";
                    }
                }
                if (var4 == 650 || var4 == 655) {
                    if (this.field551 != 0) {
                        String var17;
                        if (this.field86 == 0) {
                            var17 = "earlier today";
                        } else if (this.field86 == 1) {
                            var17 = "yesterday";
                        } else {
                            var17 = this.field86 + " days ago";
                        }
                        arg0.field1002 = "You last logged in " + var17 + " from: " + signlink.dns;
                    } else {
                        arg0.field1002 = "";
                    }
                }
                if (var4 == 651) {
                    if (this.field151 == 0) {
                        arg0.field1002 = "0 unread messages";
                        arg0.field1046 = 16776960;
                    }
                    if (this.field151 == 1) {
                        arg0.field1002 = "1 unread message";
                        arg0.field1046 = 65280;
                    }
                    if (this.field151 > 1) {
                        arg0.field1002 = this.field151 + " unread messages";
                        arg0.field1046 = 65280;
                    }
                }
                if (var4 == 652) {
                    if (this.field205 == 201) {
                        if (this.field380 == 1) {
                            arg0.field1002 = "@yel@This is a non-members world: @whi@Since you are a member we";
                        } else {
                            arg0.field1002 = "";
                        }
                    } else if (this.field205 == 200) {
                        arg0.field1002 = "You have not yet set any password recovery questions.";
                    } else {
                        String var18;
                        if (this.field205 == 0) {
                            var18 = "Earlier today";
                        } else if (this.field205 == 1) {
                            var18 = "Yesterday";
                        } else {
                            var18 = this.field205 + " days ago";
                        }
                        arg0.field1002 = var18 + " you changed your recovery questions";
                    }
                }
                if (var4 == 653) {
                    if (this.field205 == 201) {
                        if (this.field380 == 1) {
                            arg0.field1002 = "@whi@recommend you use a members world instead. You may use";
                        } else {
                            arg0.field1002 = "";
                        }
                    } else if (this.field205 == 200) {
                        arg0.field1002 = "We strongly recommend you do so now to secure your account.";
                    } else {
                        arg0.field1002 = "If you do not remember making this change then cancel it immediately";
                    }
                }
                if (var4 == 654) {
                    if (this.field205 == 201) {
                        if (this.field380 == 1) {
                            arg0.field1002 = "@whi@this world but member benefits are unavailable whilst here.";
                        } else {
                            arg0.field1002 = "";
                        }
                    } else if (this.field205 == 200) {
                        arg0.field1002 = "Do this from the 'account management' area on our front webpage";
                    } else {
                        arg0.field1002 = "Do this from the 'account management' area on our front webpage";
                    }
                }
            }
        } else if (var4 == 1 && this.field459 == 0) {
            arg0.field1002 = "Loading friend list";
            arg0.field1059 = 0;
        } else if (var4 == 1 && this.field459 == 1) {
            arg0.field1002 = "Connecting to friendserver";
            arg0.field1059 = 0;
        } else if (var4 == 2 && this.field459 != 2) {
            arg0.field1002 = "Please wait...";
            arg0.field1059 = 0;
        } else {
            int var5 = this.field458;
            if (this.field459 != 2) {
                var5 = 0;
            }
            if (var4 > 700) {
                var4 -= 601;
            } else {
                --var4;
            }
            if (var4 >= var5) {
                arg0.field1002 = "";
                arg0.field1059 = 0;
            } else {
                arg0.field1002 = this.field431[var4];
                arg0.field1059 = 1;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;)V")
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

    @OriginalMember(owner = "client", name = "c", descriptor = "(LXQPFGONL;II)V")
    private final void method139(class62 arg0, int arg1, int arg2) {
        int var10000 = arg1 + arg2;
        for (int var5 = 0; var5 < this.field423; ++var5) {
            int var6 = this.field424[var5];
            class54 var7 = this.field420[var6];
            int var8 = arg0.method478();
            if ((var8 & 4) != 0) {
                var8 += arg0.method478() << 8;
            }
            this.method146(-27938, var8, var6, arg0, var7);
        }
    }

    @OriginalMember(owner = "client", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        if (signlink.mainapp != null) {
            return signlink.mainapp.getCodeBase();
        } else {
            try {
                if (super.field1182 != null) {
                    return new URL("http://127.0.0.1:" + (field233 + 80));
                }
            } catch (Exception var1) {
            }
            return super.getCodeBase();
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIIII)V")
    public final void method140(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = 2048 - arg5 & 2047;
        int var9 = 2048 - arg0 & 2047;
        int var10 = 0;
        int var11 = 0;
        int var12 = arg3;
        if (var8 != 0) {
            int var13 = class27.field926[var8];
            int var14 = class27.field927[var8];
            int var15 = var11 * var14 - arg3 * var13 >> 16;
            var12 = var11 * var13 + arg3 * var14 >> 16;
            var11 = var15;
        }
        if (var9 != 0) {
            int var16 = class27.field926[var9];
            int var17 = class27.field927[var9];
            int var18 = var10 * var17 + var12 * var16 >> 16;
            var12 = var12 * var17 - var10 * var16 >> 16;
            var10 = var18;
        }
        this.field348 = arg4 - var10;
        this.field349 = arg1 - var11;
        this.field350 = arg2 - var12;
        this.field351 = arg5;
        this.field352 = arg0;
        if (arg6 != 7) {
            this.method44();
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(II)V")
    public final void method141(int arg0, int arg1) {
        if (arg1 == 1306) {
            int var3 = class65.field1578[arg0].field1586;
            if (var3 != 0) {
                int var4 = this.field374[arg0];
                if (var3 == 1) {
                    if (var4 == 1) {
                        class31.method279(0, 0.9D);
                    }
                    if (var4 == 2) {
                        class31.method279(0, 0.8D);
                    }
                    if (var4 == 3) {
                        class31.method279(0, 0.7D);
                    }
                    if (var4 == 4) {
                        class31.method279(0, 0.6D);
                    }
                    class57.field1423.method222();
                    this.field249 = true;
                }
                if (var3 == 3) {
                    boolean var5 = this.field480;
                    if (var4 == 0) {
                        this.method122(0, -974, this.field480);
                        this.field480 = true;
                    }
                    if (var4 == 1) {
                        this.method122(-400, -974, this.field480);
                        this.field480 = true;
                    }
                    if (var4 == 2) {
                        this.method122(-800, -974, this.field480);
                        this.field480 = true;
                    }
                    if (var4 == 3) {
                        this.method122(-1200, -974, this.field480);
                        this.field480 = true;
                    }
                    if (var4 == 4) {
                        this.field480 = false;
                    }
                    if (this.field480 != var5 && !field235) {
                        if (this.field480) {
                            this.field298 = this.field182;
                            this.field299 = true;
                            this.field324.method451(2, this.field298);
                        } else {
                            this.method57(500);
                        }
                        this.field542 = 0;
                    }
                }
                if (var3 == 4) {
                    if (var4 == 0) {
                        this.field508 = true;
                        this.method142(0, 504);
                    }
                    if (var4 == 1) {
                        this.field508 = true;
                        this.method142(-400, 504);
                    }
                    if (var4 == 2) {
                        this.field508 = true;
                        this.method142(-800, 504);
                    }
                    if (var4 == 3) {
                        this.field508 = true;
                        this.method142(-1200, 504);
                    }
                    if (var4 == 4) {
                        this.field508 = false;
                    }
                }
                if (var3 == 5) {
                    this.field323 = var4;
                }
                if (var3 == 6) {
                    this.field341 = var4;
                }
                if (var3 == 8) {
                    this.field102 = var4;
                    this.field100 = true;
                }
                if (var3 == 9) {
                    this.field472 = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(II)V")
    public final void method142(int arg0, int arg1) {
        int var3 = 73 / arg1;
        signlink.wavevol = arg0;
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(I)V")
    public final void method143(int arg0) {
        if (arg0 != 1890) {
            this.field334 = !this.field334;
        }
        this.field249 = true;
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(B)V")
    public final void method144(byte arg0) {
        if (arg0 != 3) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        for (class43 var3 = (class43) this.field312.method199(); var3 != null; var3 = (class43) this.field312.method201(467)) {
            if (this.field164 == var3.field1139 && !var3.field1143) {
                if (field330 >= var3.field1144) {
                    var3.method368(this.field149, this.field498);
                    if (var3.field1143) {
                        var3.method195();
                    } else {
                        this.field409.method550(var3.field1142, 297, var3.field1140, 0, 60, var3.field1139, var3, var3.field1141, -1, false);
                    }
                }
            } else {
                var3.method195();
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZI)V")
    public final void method145(boolean arg0, int arg1) {
        if (arg1 <= 0) {
            this.field121 = this.field251.method478();
        }
        for (int var3 = 0; var3 < this.field528; ++var3) {
            class1 var4 = this.field527[this.field529[var3]];
            int var5 = (this.field529[var3] << 14) + 536870912;
            if (var4 != null && var4.method1(this.field161) && var4.field5.field755 == arg0) {
                int var6 = var4.field587 >> 7;
                int var7 = var4.field588 >> 7;
                if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
                    if (var4.field615 == 1 && (var4.field587 & 127) == 64 && (var4.field588 & 127) == 64) {
                        if (this.field363[var6][var7] == this.field532) {
                            continue;
                        }
                        this.field363[var6][var7] = this.field532;
                    }
                    if (!var4.field5.field769) {
                        var5 += Integer.MIN_VALUE;
                    }
                    this.field409.method550(this.method65(var4.field588, this.field164, false, var4.field587), 297, var4.field587, var4.field589, (var4.field615 - 1) * 64 + 60, this.field164, var4, var4.field588, var5, var4.field586);
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIILXQPFGONL;LTKIWGAGO;)V")
    private final void method146(int arg0, int arg1, int arg2, class62 arg3, class54 arg4) {
        if (arg0 == -27938) {
            if ((arg1 & 256) != 0) {
                arg4.field622 = arg3.method496(221);
                arg4.field624 = arg3.method496(221);
                arg4.field623 = arg3.method498(false);
                arg4.field625 = arg3.method497(8);
                arg4.field626 = arg3.method505(-623) + field330;
                arg4.field627 = arg3.method506((byte) 56) + field330;
                arg4.field628 = arg3.method496(221);
                arg4.method182(-339);
            }
            if ((arg1 & 1) != 0) {
                arg4.field591 = arg3.method480();
                if (arg4.field591 == 65535) {
                    arg4.field591 = -1;
                }
            }
            if ((arg1 & 64) != 0) {
                arg4.field597 = arg3.method505(-623);
                arg4.field598 = arg3.method480();
            }
            if ((arg1 & 32) != 0) {
                int var6 = arg3.method497(8);
                byte[] var7 = new byte[var6];
                class62 var8 = new class62(var7, 49938);
                arg3.method513(var6, var7, 0, 26149);
                this.field425[arg2] = var8;
                arg4.method425(var8, false);
            }
            if ((arg1 & 128) != 0) {
                int var9 = arg3.method498(false);
                int var10 = arg3.method496(221);
                arg4.method181(var10, field330, var9, (byte) 2);
                arg4.field581 = field330 + 300;
                arg4.field582 = arg3.method496(221);
                arg4.field583 = arg3.method478();
            }
            if ((arg1 & 8) != 0) {
                int var11 = arg3.method505(-623);
                int var12 = arg3.method496(221);
                int var13 = arg3.method498(false);
                int var14 = arg3.field1542;
                if (arg4.field1360 != null && arg4.field1342) {
                    long var15 = class20.method214(arg4.field1360);
                    boolean var17 = false;
                    if (var12 <= 1) {
                        for (int var18 = 0; var18 < this.field433; ++var18) {
                            if (this.field116[var18] == var15) {
                                var17 = true;
                                break;
                            }
                        }
                    }
                    if (!var17 && this.field118 == 0) {
                        try {
                            this.field526.field1542 = 0;
                            arg3.method487(var13, 0, (byte) 5, this.field526.field1541);
                            this.field526.field1542 = 0;
                            String var19 = class23.method223(-555, var13, this.field526);
                            String var20 = class35.method311(var19, 0);
                            arg4.field584 = var20;
                            arg4.field621 = var11 >> 8;
                            arg4.field629 = var11 & 255;
                            arg4.field602 = 150;
                            if (var12 != 2 && var12 != 3) {
                                if (var12 == 1) {
                                    this.method155(-531, 1, var20, "@cr1@" + arg4.field1360);
                                } else {
                                    this.method155(-531, 2, var20, arg4.field1360);
                                }
                            } else {
                                this.method155(-531, 1, var20, "@cr2@" + arg4.field1360);
                            }
                        } catch (Exception var28) {
                            signlink.reporterror("cde2");
                        }
                    }
                }
                arg3.field1542 = var13 + var14;
            }
            if ((arg1 & 2) != 0) {
                int var22 = arg3.method505(-623);
                if (var22 == 65535) {
                    var22 = -1;
                }
                int var23 = arg3.method497(8);
                if (arg4.field607 == var22 && var22 != -1) {
                    int var24 = class24.field813[var22].field827;
                    if (var24 == 1) {
                        arg4.field608 = 0;
                        arg4.field609 = 0;
                        arg4.field610 = var23;
                        arg4.field611 = 0;
                    }
                    if (var24 == 2) {
                        arg4.field611 = 0;
                    }
                } else if (var22 == -1 || arg4.field607 == -1 || class24.field813[var22].field821 >= class24.field813[arg4.field607].field821) {
                    arg4.field607 = var22;
                    arg4.field608 = 0;
                    arg4.field609 = 0;
                    arg4.field610 = var23;
                    arg4.field611 = 0;
                    arg4.field585 = arg4.field618;
                }
            }
            if ((arg1 & 16) != 0) {
                arg4.field584 = arg3.method485();
                if (arg4.field584.charAt(0) == '~') {
                    arg4.field584 = arg4.field584.substring(1);
                    this.method155(-531, 2, arg4.field584, arg4.field1360);
                } else if (field174 == arg4) {
                    this.method155(-531, 2, arg4.field584, arg4.field1360);
                }
                arg4.field621 = 0;
                arg4.field629 = 0;
                arg4.field602 = 150;
            }
            if ((arg1 & 1024) != 0) {
                int var25 = arg3.method478();
                int var26 = arg3.method478();
                arg4.method181(var26, field330, var25, (byte) 2);
                arg4.field581 = field330 + 300;
                arg4.field582 = arg3.method497(8);
                arg4.field583 = arg3.method497(8);
            }
            if ((arg1 & 512) != 0) {
                arg4.field632 = arg3.method480();
                int var27 = arg3.method512(false);
                arg4.field636 = var27 >> 16;
                arg4.field635 = (var27 & 65535) + field330;
                arg4.field633 = 0;
                arg4.field634 = 0;
                if (arg4.field635 > field330) {
                    arg4.field633 = -1;
                }
                if (arg4.field632 == 65535) {
                    arg4.field632 = -1;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(I)V")
    public final void method147(int arg0) {
        if (!this.field175 && !this.field365 && !this.field331) {
            ++field330;
            if (!this.field353) {
                this.method86(720);
            } else {
                this.method88(-24166);
            }
            this.method52(-24437);
            while (arg0 >= 0) {
                this.method44();
            }
        }
    }

    @OriginalMember(owner = "client", name = "O", descriptor = "(I)V")
    public final void method148(int arg0) {
        Graphics var2 = this.method73(-13961).getGraphics();
        var2.setColor(Color.black);
        var2.fillRect(0, 0, 765, 503);
        if (arg0 == -4067) {
            this.method388(1, this.field244);
            if (this.field365) {
                this.field469 = false;
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
            if (this.field331) {
                this.field469 = false;
                var2.setFont(new Font("Helvetica", 1, 20));
                var2.setColor(Color.white);
                var2.drawString("Error - unable to load game!", 50, 50);
                var2.drawString("To play RuneScape make sure you play from", 50, 100);
                var2.drawString("http://www.runescape.com", 50, 150);
            }
            if (this.field175) {
                this.field469 = false;
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
    }

    @OriginalMember(owner = "client", name = "P", descriptor = "(I)V")
    public final void method149(int arg0) {
        try {
            this.field447 = -1;
            this.field312.method203();
            this.field415.method203();
            class31.method273(true);
            this.method80(this.field456);
            this.field409.method539((byte) -24);
            System.gc();
            for (int var2 = 0; var2 < 4; ++var2) {
                this.field103[var2].method514();
            }
            for (int var3 = 0; var3 < 4; ++var3) {
                for (int var4 = 0; var4 < 104; ++var4) {
                    for (int var5 = 0; var5 < 104; ++var5) {
                        this.field460[var3][var4][var5] = 0;
                    }
                }
            }
            class51 var6 = new class51(this.field84, 104, false, 104, this.field460);
            int var7 = this.field97.length;
            this.field213.method467(126, 832);
            if (!this.field237) {
                for (int var8 = 0; var8 < var7; ++var8) {
                    int var9 = (this.field167[var8] >> 8) * 64 - this.field125;
                    int var10 = (this.field167[var8] & 255) * 64 - this.field126;
                    byte[] var11 = this.field97[var8];
                    if (var11 != null) {
                        var6.method407(var11, this.field103, var9, var10, (this.field278 - 6) * 8, 0, (this.field277 - 6) * 8);
                    }
                }
                for (int var12 = 0; var12 < var7; ++var12) {
                    int var13 = (this.field167[var12] >> 8) * 64 - this.field125;
                    int var14 = (this.field167[var12] & 255) * 64 - this.field126;
                    byte[] var15 = this.field97[var12];
                    if (var15 == null && this.field278 < 800) {
                        var6.method414(var14, 0, 64, 64, var13);
                    }
                }
                ++field416;
                if (field416 > 133) {
                    field416 = 0;
                    this.field213.method467(204, 832);
                    this.field213.method472(0);
                }
                this.field213.method467(126, 832);
                for (int var16 = 0; var16 < var7; ++var16) {
                    byte[] var17 = this.field135[var16];
                    if (var17 != null) {
                        int var18 = (this.field167[var16] >> 8) * 64 - this.field125;
                        int var19 = (this.field167[var16] & 255) * 64 - this.field126;
                        var6.method417(this.field409, var18, var17, this.field103, var19, -74);
                    }
                }
            }
            if (this.field237) {
                int var20 = 0;
                label252: while (true) {
                    if (var20 >= 4) {
                        for (int var30 = 0; var30 < 13; ++var30) {
                            for (int var31 = 0; var31 < 13; ++var31) {
                                int var32 = this.field198[0][var30][var31];
                                if (var32 == -1) {
                                    var6.method414(var31 * 8, 0, 8, 8, var30 * 8);
                                }
                            }
                        }
                        this.field213.method467(126, 832);
                        int var33 = 0;
                        while (true) {
                            if (var33 >= 4) {
                                break label252;
                            }
                            for (int var34 = 0; var34 < 13; ++var34) {
                                for (int var35 = 0; var35 < 13; ++var35) {
                                    int var36 = this.field198[var33][var34][var35];
                                    if (var36 != -1) {
                                        int var37 = var36 >> 24 & 3;
                                        int var38 = var36 >> 1 & 3;
                                        int var39 = var36 >> 14 & 1023;
                                        int var40 = var36 >> 3 & 2047;
                                        int var41 = (var39 / 8 << 8) + var40 / 8;
                                        for (int var42 = 0; var42 < this.field167.length; ++var42) {
                                            if (this.field167[var42] == var41 && this.field135[var42] != null) {
                                                var6.method415((byte) 1, this.field409, this.field103, var37, (var39 & 7) * 8, var35 * 8, this.field135[var42], var34 * 8, var33, (var40 & 7) * 8, var38);
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
                            int var23 = this.field198[var20][var21][var22];
                            if (var23 != -1) {
                                int var24 = var23 >> 24 & 3;
                                int var25 = var23 >> 1 & 3;
                                int var26 = var23 >> 14 & 1023;
                                int var27 = var23 >> 3 & 2047;
                                int var28 = (var26 / 8 << 8) + var27 / 8;
                                for (int var29 = 0; var29 < this.field167.length; ++var29) {
                                    if (this.field167[var29] == var28 && this.field97[var29] != null) {
                                        var6.method418(true, (var26 & 7) * 8, var20, var22 * 8, this.field103, var21 * 8, (var27 & 7) * 8, this.field97[var29], var25, var24);
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    ++var20;
                }
            }
            this.field213.method467(126, 832);
            var6.method416(this.field103, 0, this.field409);
            this.field523.method394(false);
            this.field213.method467(126, 832);
            int var43 = class51.field1320;
            if (var43 > this.field164) {
                var43 = this.field164;
            }
            if (var43 < this.field164 - 1) {
                int var44 = this.field164 - 1;
            }
            if (field235) {
                this.field409.method540(class51.field1320, (byte) 9);
            } else {
                this.field409.method540(0, (byte) 9);
            }
            for (int var45 = 0; var45 < 104; ++var45) {
                for (int var46 = 0; var46 < 104; ++var46) {
                    this.method156(var45, var46);
                }
            }
            this.method58(2);
        } catch (Exception var59) {
        }
        class13.field685.method222();
        if (super.field1182 != null) {
            this.field213.method467(22, 832);
            this.field213.method472(1057001181);
        }
        if (field235 && signlink.cache_dat != null) {
            int var48 = this.field324.method439(0, (byte) 4);
            for (int var49 = 0; var49 < var48; ++var49) {
                int var50 = this.field324.method458(var49, 7);
                if ((var50 & 121) == 0) {
                    class27.method237(8, var49);
                }
            }
        }
        System.gc();
        class31.method274((byte) 5, 20);
        this.field324.method454(-661);
        int var51 = (this.field277 - 6) / 8 - 1;
        int var52 = (this.field277 + 6) / 8 + 1;
        int var53 = (this.field278 - 6) / 8 - 1;
        int var54 = (this.field278 + 6) / 8 + 1;
        if (arg0 != 23140) {
            field379 = this.field454.method461();
        }
        if (this.field407) {
            var51 = 49;
            var52 = 50;
            var53 = 49;
            var54 = 50;
        }
        for (int var55 = var51; var55 <= var52; ++var55) {
            for (int var56 = var53; var56 <= var54; ++var56) {
                if (var51 == var55 || var52 == var55 || var53 == var56 || var54 == var56) {
                    int var57 = this.field324.method449(var55, 0, var56, 0);
                    if (var57 != -1) {
                        this.field324.method448(3, var57, 0);
                    }
                    int var58 = this.field324.method449(var55, 1, var56, 0);
                    if (var58 != -1) {
                        this.field324.method448(3, var58, 0);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "Q", descriptor = "(I)V")
    public final void method150(int arg0) {
        if (arg0 >= 0) {
            this.method44();
        }
        for (class67 var2 = (class67) this.field415.method199(); var2 != null; var2 = (class67) this.field415.method201(467)) {
            if (this.field164 == var2.field1628 && field330 <= var2.field1613) {
                if (field330 >= var2.field1612) {
                    if (var2.field1631 > 0) {
                        class1 var3 = this.field527[var2.field1631 - 1];
                        if (var3 != null && var3.field587 >= 0 && var3.field587 < 13312 && var3.field588 >= 0 && var3.field588 < 13312) {
                            var2.method535(var3.field588, var3.field587, true, this.method65(var3.field588, var2.field1628, false, var3.field587) - var2.field1627, field330);
                        }
                    }
                    if (var2.field1631 < 0) {
                        int var4 = -var2.field1631 - 1;
                        class54 var5;
                        if (this.field301 == var4) {
                            var5 = field174;
                        } else {
                            var5 = this.field420[var4];
                        }
                        if (var5 != null && var5.field587 >= 0 && var5.field587 < 13312 && var5.field588 >= 0 && var5.field588 < 13312) {
                            var2.method535(var5.field588, var5.field587, true, this.method65(var5.field588, var2.field1628, false, var5.field587) - var2.field1627, field330);
                        }
                    }
                    var2.method536(this.field498, 1);
                    this.field409.method550((int) var2.field1619, 297, (int) var2.field1617, var2.field1622, 60, this.field164, var2, (int) var2.field1618, -1, false);
                }
            } else {
                var2.method195();
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BIILBFUTXOBU;)V")
    public final void method151(byte arg0, int arg1, int arg2, class4 arg3) {
        int var5 = this.field487 + this.field328 & 2047;
        int var6 = arg1 * arg1 + arg2 * arg2;
        if (var6 <= 6400) {
            int var7 = class27.field926[var5];
            int var8 = class27.field927[var5];
            if (arg0 == 3) {
                boolean var9 = false;
            } else {
                for (int var10 = 1; var10 > 0; ++var10) {
                }
            }
            int var11 = var7 * 256 / (this.field130 + 256);
            int var12 = var8 * 256 / (this.field130 + 256);
            int var13 = arg1 * var11 + arg2 * var12 >> 16;
            int var14 = arg1 * var12 - arg2 * var11 >> 16;
            if (var6 > 2500) {
                arg3.method19(this.field252, this.field518, 83 - var14 - arg3.field47 / 2 - 4, var13 + 94 - arg3.field46 / 2 + 4);
            } else {
                arg3.method13(-41075, 83 - var14 - arg3.field47 / 2 - 4, var13 + 94 - arg3.field46 / 2 + 4);
            }
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(II)V")
    public final void method152(int arg0, int arg1) {
        if (arg0 >= 0) {
            this.field410 = this.field454.method461();
        }
        if (!field235) {
            if (class31.field983[17] >= arg1) {
                class66 var3 = class31.field977[17];
                int var4 = var3.field1600 * var3.field1599 - 1;
                int var5 = this.field498 * var3.field1599 * 2;
                byte[] var6 = var3.field1597;
                byte[] var7 = this.field119;
                for (int var8 = 0; var8 <= var4; ++var8) {
                    var7[var8] = var6[var8 - var5 & var4];
                }
                var3.field1597 = var7;
                this.field119 = var6;
                class31.method277(0, 17);
                ++field362;
                if (field362 > 120) {
                    field362 = 0;
                    this.field213.method467(242, 832);
                    this.field213.method471(3262860);
                }
            }
            if (class31.field983[24] >= arg1) {
                class66 var9 = class31.field977[24];
                int var10 = var9.field1600 * var9.field1599 - 1;
                int var11 = this.field498 * var9.field1599 * 2;
                byte[] var12 = var9.field1597;
                byte[] var13 = this.field119;
                for (int var14 = 0; var14 <= var10; ++var14) {
                    var13[var14] = var12[var14 - var11 & var10];
                }
                var9.field1597 = var13;
                this.field119 = var12;
                class31.method277(0, 24);
            }
            if (class31.field983[34] >= arg1) {
                class66 var15 = class31.field977[34];
                int var16 = var15.field1600 * var15.field1599 - 1;
                int var17 = this.field498 * var15.field1599 * 2;
                byte[] var18 = var15.field1597;
                byte[] var19 = this.field119;
                for (int var20 = 0; var20 <= var16; ++var20) {
                    var19[var20] = var18[var20 - var17 & var16];
                }
                var15.field1597 = var19;
                this.field119 = var18;
                class31.method277(0, 34);
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "R", descriptor = "(I)V")
    public final void method153(int arg0) {
        this.field524.method394(false);
        while (arg0 >= 0) {
            this.field121 = this.field251.method478();
        }
        class31.field975 = this.field142;
        this.field519.method533(-41075, 0, 0);
        if (this.field516) {
            this.field513.method370(this.field163, 239, false, 0, 40);
            this.field513.method370(this.field247 + "*", 239, false, 128, 60);
        } else if (this.field471 == 1) {
            this.field513.method370("Enter amount:", 239, false, 0, 40);
            this.field513.method370(this.field473 + "*", 239, false, 128, 60);
        } else if (this.field471 == 2) {
            this.field513.method370("Enter name:", 239, false, 0, 40);
            this.field513.method370(this.field473 + "*", 239, false, 128, 60);
        } else if (this.field229 != null) {
            this.field513.method370(this.field229, 239, false, 0, 40);
            this.field513.method370("Click to continue", 239, false, 128, 60);
        } else if (this.field322 != -1) {
            this.method87(0, 0, 0, class34.field1057[this.field322], 0);
        } else if (this.field395 != -1) {
            this.method87(0, 0, 0, class34.field1057[this.field395], 0);
        } else {
            class44 var2 = this.field512;
            int var3 = 0;
            class36.method341(0, 0, false, 463, 77);
            for (int var4 = 0; var4 < 100; ++var4) {
                if (this.field240[var4] != null) {
                    int var6 = this.field238[var4];
                    int var7 = 70 - var3 * 14 + this.field94;
                    String var8 = this.field239[var4];
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
                            var2.method374(0, var7, this.field240[var4], 4, 0);
                        }
                        ++var3;
                    }
                    if ((var6 == 1 || var6 == 2) && (var6 == 1 || this.field546 == 0 || this.field546 == 1 && this.method98(0, var8))) {
                        if (var7 > 0 && var7 < 110) {
                            int var10 = 4;
                            if (var9 == 1) {
                                this.field96[0].method533(-41075, var7 - 12, var10);
                                var10 += 14;
                            }
                            if (var9 == 2) {
                                this.field96[1].method533(-41075, var7 - 12, var10);
                                var10 += 14;
                            }
                            var2.method374(0, var7, var8 + ":", var10, 0);
                            int var11 = var10 + var2.method372(var8, 23764) + 8;
                            var2.method374(0, var7, this.field240[var4], var11, 255);
                        }
                        ++var3;
                    }
                    if ((var6 == 3 || var6 == 7) && this.field102 == 0 && (var6 == 7 || this.field412 == 0 || this.field412 == 1 && this.method98(0, var8))) {
                        if (var7 > 0 && var7 < 110) {
                            byte var12 = 4;
                            var2.method374(0, var7, "From", var12, 0);
                            int var13 = var12 + var2.method372("From ", 23764);
                            if (var9 == 1) {
                                this.field96[0].method533(-41075, var7 - 12, var13);
                                var13 += 14;
                            }
                            if (var9 == 2) {
                                this.field96[1].method533(-41075, var7 - 12, var13);
                                var13 += 14;
                            }
                            var2.method374(0, var7, var8 + ":", var13, 0);
                            int var14 = var13 + var2.method372(var8, 23764) + 8;
                            var2.method374(0, var7, this.field240[var4], var14, 8388608);
                        }
                        ++var3;
                    }
                    if (var6 == 4 && (this.field162 == 0 || this.field162 == 1 && this.method98(0, var8))) {
                        if (var7 > 0 && var7 < 110) {
                            var2.method374(0, var7, var8 + " " + this.field240[var4], 4, 8388736);
                        }
                        ++var3;
                    }
                    if (var6 == 5 && this.field102 == 0 && this.field412 < 2) {
                        if (var7 > 0 && var7 < 110) {
                            var2.method374(0, var7, this.field240[var4], 4, 8388608);
                        }
                        ++var3;
                    }
                    if (var6 == 6 && this.field102 == 0 && this.field412 < 2) {
                        if (var7 > 0 && var7 < 110) {
                            var2.method374(0, var7, "To " + var8 + ":", 4, 0);
                            var2.method374(0, var7, this.field240[var4], 12 + var2.method372("To " + var8, 23764), 8388608);
                        }
                        ++var3;
                    }
                    if (var6 == 8 && (this.field162 == 0 || this.field162 == 1 && this.method98(0, var8))) {
                        if (var7 > 0 && var7 < 110) {
                            var2.method374(0, var7, var8 + " " + this.field240[var4], 4, 8270336);
                        }
                        ++var3;
                    }
                }
            }
            class36.method340((byte) 3);
            this.field196 = var3 * 14 + 7;
            if (this.field196 < 78) {
                this.field196 = 78;
            }
            this.method76(4, this.field196, 0, 463, this.field196 - this.field94 - 77, 77);
            String var5;
            if (field174 != null && field174.field1360 != null) {
                var5 = field174.field1360;
            } else {
                var5 = class20.method218(-670, this.field555);
            }
            var2.method374(0, 90, var5 + ":", 4, 0);
            var2.method374(0, 90, this.field533 + "*", 6 + var2.method372(var5 + ": ", 23764), 255);
            class36.method347(479, 77, 0, 0, 0);
        }
        if (this.field543 && this.field397 == 2) {
            this.method62(false);
        }
        this.field524.method395(-30874, super.field1179, 357, 17);
        this.field523.method394(false);
        class31.field975 = this.field144;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)V")
    public final void method154(String arg0, String arg1, boolean arg2) {
        signlink.errorname = arg0;
        try {
            if (!arg2) {
                this.field335 = "";
                this.field336 = "Connecting to server...";
                this.method89((byte) 55, true);
            }
            this.field173 = new class37(this.method36(field233 + 43594), true, this);
            long var4 = class20.method214(arg0);
            int var6 = (int) (var4 >> 16 & 31L);
            this.field213.field1542 = 0;
            this.field213.method468(14);
            this.field213.method468(var6);
            this.field173.method355(0, 2, 0, this.field213.field1541);
            for (int var7 = 0; var7 < 8; ++var7) {
                this.field173.method352();
            }
            int var8 = this.field173.method352();
            int var9 = var8;
            if (var8 == 0) {
                this.field173.method354(this.field251.field1541, 0, 8);
                this.field251.field1542 = 0;
                this.field392 = this.field251.method484((byte) 17);
                int[] var10 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (this.field392 >> 32), (int) this.field392 };
                this.field213.field1542 = 0;
                this.field213.method468(10);
                this.field213.method472(var10[0]);
                this.field213.method472(var10[1]);
                this.field213.method472(var10[2]);
                this.field213.method472(var10[3]);
                this.field213.method472(signlink.uid);
                this.field213.method475(arg0);
                this.field213.method475(arg1);
                this.field213.method493(field245, field394, (byte) -18);
                this.field95.field1542 = 0;
                if (arg2) {
                    this.field95.method468(18);
                } else {
                    this.field95.method468(16);
                }
                this.field95.method468(this.field213.field1542 + 36 + 1 + 1 + 2);
                this.field95.method468(255);
                this.field95.method469(313);
                this.field95.method468(field235 ? 1 : 0);
                for (int var11 = 0; var11 < 9; ++var11) {
                    this.field95.method472(this.field333[var11]);
                }
                this.field95.method476(641, this.field213.field1542, 0, this.field213.field1541);
                this.field213.field1546 = new class59(var10, 1);
                for (int var12 = 0; var12 < 4; ++var12) {
                    var10[var12] += 50;
                }
                this.field454 = new class59(var10, 1);
                this.field173.method355(0, this.field95.field1542, 0, this.field95.field1541);
                var8 = this.field173.method352();
            }
            if (var8 == 1) {
                try {
                    Thread.sleep(2000L);
                } catch (Exception var22) {
                }
                this.method154(arg0, arg1, arg2);
            } else if (var8 == 2) {
                this.field417 = this.field173.method352();
                field177 = this.field173.method352() == 1;
                this.field166 = 0L;
                this.field537 = 0;
                this.field183.field1375 = 0;
                super.field1184 = true;
                this.field117 = true;
                this.field353 = true;
                this.field213.field1542 = 0;
                this.field251.field1542 = 0;
                this.field121 = -1;
                this.field225 = -1;
                this.field226 = -1;
                this.field227 = -1;
                this.field120 = 0;
                this.field122 = 0;
                this.field387 = 0;
                this.field124 = 0;
                this.field148 = 0;
                this.field545 = 0;
                this.field543 = false;
                super.field1185 = 0;
                for (int var13 = 0; var13 < 100; ++var13) {
                    this.field240[var13] = null;
                }
                this.field260 = 0;
                this.field256 = 0;
                this.field302 = 0;
                this.field360 = 0;
                this.field345 = (int) (Math.random() * 100.0D) - 50;
                this.field389 = (int) (Math.random() * 110.0D) - 55;
                this.field275 = (int) (Math.random() * 80.0D) - 40;
                this.field328 = (int) (Math.random() * 120.0D) - 60;
                this.field130 = (int) (Math.random() * 30.0D) - 20;
                this.field487 = (int) (Math.random() * 20.0D) - 10 & 2047;
                this.field171 = 0;
                this.field447 = -1;
                this.field295 = 0;
                this.field296 = 0;
                this.field421 = 0;
                this.field528 = 0;
                for (int var14 = 0; var14 < this.field418; ++var14) {
                    this.field420[var14] = null;
                    this.field425[var14] = null;
                }
                for (int var15 = 0; var15 < 16384; ++var15) {
                    this.field527[var15] = null;
                }
                field174 = this.field420[this.field419] = new class54();
                this.field415.method203();
                this.field312.method203();
                for (int var16 = 0; var16 < 4; ++var16) {
                    for (int var17 = 0; var17 < 104; ++var17) {
                        for (int var18 = 0; var18 < 104; ++var18) {
                            this.field376[var16][var17][var18] = null;
                        }
                    }
                }
                this.field367 = new class16(false);
                this.field459 = 0;
                this.field458 = 0;
                this.field395 = -1;
                this.field322 = -1;
                this.field268 = -1;
                this.field342 = -1;
                this.field194 = -1;
                this.field132 = false;
                this.field115 = 3;
                this.field471 = 0;
                this.field543 = false;
                this.field516 = false;
                this.field229 = null;
                this.field481 = 0;
                this.field201 = -1;
                this.field396 = true;
                this.method40(this.field505);
                for (int var19 = 0; var19 < 5; ++var19) {
                    this.field231[var19] = 0;
                }
                for (int var20 = 0; var20 < 5; ++var20) {
                    this.field482[var20] = null;
                    this.field483[var20] = false;
                }
                field160 = 0;
                field228 = 0;
                field170 = 0;
                field436 = 0;
                field158 = 0;
                field554 = 0;
                field464 = 0;
                field200 = 0;
                field457 = 0;
                field243 = 0;
                this.method119(this.field274);
            } else if (var8 == 3) {
                this.field335 = "";
                this.field336 = "Invalid username or password.";
            } else if (var8 == 4) {
                this.field335 = "Your account has been disabled.";
                this.field336 = "Please check your message-centre for details.";
            } else if (var8 == 5) {
                this.field335 = "Your account is already logged in.";
                this.field336 = "Try again in 60 secs...";
            } else if (var8 == 6) {
                this.field335 = "RuneScape has been updated!";
                this.field336 = "Please reload this page.";
            } else if (var8 == 7) {
                this.field335 = "This world is full.";
                this.field336 = "Please use a different world.";
            } else if (var8 == 8) {
                this.field335 = "Unable to connect.";
                this.field336 = "Login server offline.";
            } else if (var8 == 9) {
                this.field335 = "Login limit exceeded.";
                this.field336 = "Too many connections from your address.";
            } else if (var8 == 10) {
                this.field335 = "Unable to connect.";
                this.field336 = "Bad session id.";
            } else if (var8 == 11) {
                this.field336 = "Login server rejected session.";
                this.field336 = "Please try again.";
            } else if (var8 == 12) {
                this.field335 = "You need a members account to login to this world.";
                this.field336 = "Please subscribe, or use a different world.";
            } else if (var8 == 13) {
                this.field335 = "Could not complete login.";
                this.field336 = "Please try using a different world.";
            } else if (var8 == 14) {
                this.field335 = "The server is being updated.";
                this.field336 = "Please wait 1 minute and try again.";
            } else if (var8 == 15) {
                this.field353 = true;
                this.field213.field1542 = 0;
                this.field251.field1542 = 0;
                this.field121 = -1;
                this.field225 = -1;
                this.field226 = -1;
                this.field227 = -1;
                this.field120 = 0;
                this.field122 = 0;
                this.field387 = 0;
                this.field545 = 0;
                this.field543 = false;
                this.field253 = System.currentTimeMillis();
            } else if (var8 == 16) {
                this.field335 = "Login attempts exceeded.";
                this.field336 = "Please wait 1 minute and try again.";
            } else if (var8 == 17) {
                this.field335 = "You are standing in a members-only area.";
                this.field336 = "To play on this world move to a free area first";
            } else if (var8 == 20) {
                this.field335 = "Invalid loginserver requested";
                this.field336 = "Please try using a different world.";
            } else if (var8 != 21) {
                if (var8 == -1) {
                    if (var9 == 0) {
                        if (this.field318 < 2) {
                            try {
                                Thread.sleep(2000L);
                            } catch (Exception var24) {
                            }
                            ++this.field318;
                            this.method154(arg0, arg1, arg2);
                        } else {
                            this.field335 = "No response from loginserver";
                            this.field336 = "Please wait 1 minute and try again.";
                        }
                    } else {
                        this.field335 = "No response from server";
                        this.field336 = "Please try using a different world.";
                    }
                } else {
                    System.out.println("response:" + var8);
                    this.field335 = "Unexpected server response";
                    this.field336 = "Please try using a different world.";
                }
            } else {
                for (int var21 = this.field173.method352(); var21 >= 0; --var21) {
                    this.field335 = "You have only just left another world";
                    this.field336 = "Your profile will be transferred in: " + var21 + " seconds";
                    this.method89((byte) 55, true);
                    try {
                        Thread.sleep(1000L);
                    } catch (Exception var23) {
                    }
                }
                this.method154(arg0, arg1, arg2);
            }
        } catch (IOException var25) {
            this.field335 = "";
            this.field336 = "Error connecting to server.";
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IILjava/lang/String;Ljava/lang/String;)V")
    public final void method155(int arg0, int arg1, String arg2, String arg3) {
        if (arg1 == 0 && this.field395 != -1) {
            this.field229 = arg2;
            super.field1193 = 0;
        }
        if (this.field322 == -1) {
            this.field100 = true;
        }
        for (int var5 = 99; var5 > 0; --var5) {
            this.field238[var5] = this.field238[var5 - 1];
            this.field239[var5] = this.field239[var5 - 1];
            this.field240[var5] = this.field240[var5 - 1];
        }
        if (arg0 < 0) {
            this.field238[0] = arg1;
            this.field239[0] = arg3;
            this.field240[0] = arg2;
        }
    }

    @OriginalMember(owner = "client", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        return signlink.mainapp != null ? signlink.mainapp.getAppletContext() : super.getAppletContext();
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(II)V")
    public final void method156(int arg0, int arg1) {
        class16 var3 = this.field376[this.field164][arg0][arg1];
        if (var3 == null) {
            this.field409.method560(this.field164, arg0, arg1);
        } else {
            int var4 = -99999999;
            class42 var5 = null;
            for (class42 var6 = (class42) var3.method199(); var6 != null; var6 = (class42) var3.method201(467)) {
                class57 var11 = class57.method437(var6.field1137);
                int var12 = var11.field1431;
                if (var11.field1387) {
                    var12 = (var6.field1138 + 1) * var12;
                }
                if (var12 > var4) {
                    var4 = var12;
                    var5 = var6;
                }
            }
            var3.method197(0, var5);
            class42 var7 = null;
            class42 var8 = null;
            for (class42 var9 = (class42) var3.method199(); var9 != null; var9 = (class42) var3.method201(467)) {
                if (var5.field1137 != var9.field1137 && var7 == null) {
                    var7 = var9;
                }
                if (var5.field1137 != var9.field1137 && var7.field1137 != var9.field1137 && var8 == null) {
                    var8 = var9;
                }
            }
            int var10 = (arg1 << 7) + arg0 + 1610612736;
            this.field409.method546(this.method65(arg1 * 128 + 64, this.field164, false, arg0 * 128 + 64), var7, var5, arg0, this.field164, var8, arg1, var10, -593);
        }
    }

    @OriginalMember(owner = "client", name = "S", descriptor = "(I)V")
    public final void method157(int arg0) {
        if (this.field102 != 0) {
            int var2 = 0;
            if (arg0 != 38825) {
                this.field150 = -279;
            }
            if (this.field387 != 0) {
                var2 = 1;
            }
            for (int var3 = 0; var3 < 100; ++var3) {
                if (this.field240[var3] != null) {
                    int var4 = this.field238[var3];
                    String var5 = this.field239[var3];
                    boolean var6 = false;
                    if (var5 != null && var5.startsWith("@cr1@")) {
                        var5 = var5.substring(5);
                        boolean var7 = true;
                    }
                    if (var5 != null && var5.startsWith("@cr2@")) {
                        var5 = var5.substring(5);
                        boolean var8 = true;
                    }
                    if ((var4 == 3 || var4 == 7) && (var4 == 7 || this.field412 == 0 || this.field412 == 1 && this.method98(0, var5))) {
                        int var9 = 329 - var2 * 13;
                        if (super.field1187 > 4 && super.field1188 - 4 > var9 - 10 && super.field1188 - 4 <= var9 + 3) {
                            int var10 = this.field512.method372("From:  " + var5 + this.field240[var3], 23764) + 25;
                            if (var10 > 450) {
                                var10 = 450;
                            }
                            if (super.field1187 < var10 + 4) {
                                if (this.field417 >= 1) {
                                    this.field215[this.field545] = "Report abuse @whi@" + var5;
                                    this.field405[this.field545] = 2218;
                                    ++this.field545;
                                }
                                this.field215[this.field545] = "Add ignore @whi@" + var5;
                                this.field405[this.field545] = 2979;
                                ++this.field545;
                                this.field215[this.field545] = "Add friend @whi@" + var5;
                                this.field405[this.field545] = 2754;
                                ++this.field545;
                            }
                        }
                        ++var2;
                        if (var2 >= 5) {
                            return;
                        }
                    }
                    if ((var4 == 5 || var4 == 6) && this.field412 < 2) {
                        ++var2;
                        if (var2 >= 5) {
                            return;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(II)V")
    public final void method158(int arg0, int arg1) {
        if (arg0 >= 0) {
            if (this.field471 != 0) {
                this.field471 = 0;
                this.field100 = true;
            }
            int var3 = this.field403[arg0];
            int var4 = this.field404[arg0];
            int var5 = this.field405[arg0];
            int var6 = this.field406[arg0];
            this.field120 += arg1;
            if (var5 >= 2000) {
                var5 -= 2000;
            }
            if (var5 == 741) {
                this.field213.method467(134, 832);
                this.field213.method503(false, var4);
                this.field213.method501((byte) -11, this.field262);
                this.field213.method501((byte) -11, var3);
                this.field213.method469(var6);
                this.field213.method503(false, this.field263);
                this.field213.method501((byte) -11, this.field261);
                this.field337 = 0;
                this.field338 = var4;
                this.field339 = var3;
                this.field340 = 2;
                if (class34.field1057[var4].field1001 == this.field268) {
                    this.field340 = 1;
                }
                if (class34.field1057[var4].field1001 == this.field322) {
                    this.field340 = 3;
                }
            }
            if (var5 == 609) {
                class54 var7 = this.field420[var6];
                if (var7 != null) {
                    this.method45(0, var7.field620[0], 2, 1, field174.field620[0], 0, var7.field619[0], field174.field619[0], 0, false, 0, 1);
                    this.field220 = super.field1194;
                    this.field221 = super.field1195;
                    this.field223 = 2;
                    this.field222 = 0;
                    this.field213.method467(249, 832);
                    this.field213.method503(false, this.field257);
                    this.field213.method503(false, var6);
                }
            }
            if (var5 == 731 && !this.field132) {
                this.field213.method467(65, 832);
                this.field213.method469(var4);
                this.field132 = true;
            }
            if (var5 == 690) {
                class1 var8 = this.field527[var6];
                if (var8 != null) {
                    this.method45(0, var8.field620[0], 2, 1, field174.field620[0], 0, var8.field619[0], field174.field619[0], 0, false, 0, 1);
                    this.field220 = super.field1194;
                    this.field221 = super.field1195;
                    this.field223 = 2;
                    this.field222 = 0;
                    this.field213.method467(137, 832);
                    this.field213.method501((byte) -11, this.field263);
                    this.field213.method503(false, this.field261);
                    this.field213.method501((byte) -11, var6);
                    this.field213.method503(false, this.field262);
                }
            }
            if (var5 == 601) {
                this.field213.method467(208, 832);
                this.field213.method469(var4);
                this.field213.method501((byte) -11, var6);
                this.field213.method469(var3);
                this.field337 = 0;
                this.field338 = var4;
                this.field339 = var3;
                this.field340 = 2;
                if (class34.field1057[var4].field1001 == this.field268) {
                    this.field340 = 1;
                }
                if (class34.field1057[var4].field1001 == this.field322) {
                    this.field340 = 3;
                }
            }
            if (var5 == 257) {
                class54 var9 = this.field420[var6];
                if (var9 != null) {
                    this.method45(0, var9.field620[0], 2, 1, field174.field620[0], 0, var9.field619[0], field174.field619[0], 0, false, 0, 1);
                    this.field220 = super.field1194;
                    this.field221 = super.field1195;
                    this.field223 = 2;
                    this.field222 = 0;
                    ++field158;
                    if (field158 >= 80) {
                        this.field213.method467(131, 832);
                        field158 = 0;
                    }
                    this.field213.method467(45, 832);
                    this.field213.method469(var6);
                }
            }
            if (var5 == 294) {
                field160 += var4;
                if (field160 >= 71) {
                    this.field213.method467(233, 832);
                    this.field213.method472(0);
                    field160 = 0;
                }
                this.method94(0, var4, var6, var3);
                this.field213.method467(116, 832);
                this.field213.method502(this.field126 + var4, true);
                this.field213.method503(false, var6 >> 14 & 32767);
                this.field213.method501((byte) -11, this.field125 + var3);
            }
            if (var5 == 737) {
                class1 var10 = this.field527[var6];
                if (var10 != null) {
                    this.method45(0, var10.field620[0], 2, 1, field174.field620[0], 0, var10.field619[0], field174.field619[0], 0, false, 0, 1);
                    this.field220 = super.field1194;
                    this.field221 = super.field1195;
                    this.field223 = 2;
                    this.field222 = 0;
                    this.field213.method467(146, 832);
                    this.field213.method501((byte) -11, var6);
                }
            }
            if (var5 == 298) {
                this.field213.method467(169, 832);
                this.field213.method502(var6, true);
                this.field213.method502(var4, true);
                this.field213.method503(false, var3);
                this.field337 = 0;
                this.field338 = var4;
                this.field339 = var3;
                this.field340 = 2;
                if (class34.field1057[var4].field1001 == this.field268) {
                    this.field340 = 1;
                }
                if (class34.field1057[var4].field1001 == this.field322) {
                    this.field340 = 3;
                }
            }
            if (var5 == 71) {
                boolean var11 = this.method45(0, var4, 2, 0, field174.field620[0], 0, var3, field174.field619[0], 0, false, 0, 0);
                if (!var11) {
                    this.method45(0, var4, 2, 1, field174.field620[0], 0, var3, field174.field619[0], 0, false, 0, 1);
                }
                this.field220 = super.field1194;
                this.field221 = super.field1195;
                this.field223 = 2;
                this.field222 = 0;
                this.field213.method467(165, 832);
                this.field213.method469(this.field126 + var4);
                this.field213.method502(var6, true);
                this.field213.method502(this.field125 + var3, true);
            }
            if (var5 == 921) {
                if ((var4 & 3) == 0) {
                    ++field228;
                }
                if (field228 >= 110) {
                    this.field213.method467(23, 832);
                    this.field213.method469(7536);
                    field228 = 0;
                }
                this.field213.method467(107, 832);
                this.field213.method469(var6);
                this.field213.method502(var3, true);
                this.field213.method501((byte) -11, var4);
                this.field337 = 0;
                this.field338 = var4;
                this.field339 = var3;
                this.field340 = 2;
                if (class34.field1057[var4].field1001 == this.field268) {
                    this.field340 = 1;
                }
                if (class34.field1057[var4].field1001 == this.field322) {
                    this.field340 = 3;
                }
            }
            if (var5 == 140) {
                class1 var13 = this.field527[var6];
                if (var13 != null) {
                    this.method45(0, var13.field620[0], 2, 1, field174.field620[0], 0, var13.field619[0], field174.field619[0], 0, false, 0, 1);
                    this.field220 = super.field1194;
                    this.field221 = super.field1195;
                    this.field223 = 2;
                    this.field222 = 0;
                    this.field213.method467(221, 832);
                    this.field213.method469(this.field257);
                    this.field213.method502(var6, true);
                }
            }
            if (var5 == 222) {
                this.field213.method467(100, 832);
                this.field213.method469(var4);
                class34 var14 = class34.field1057[var4];
                if (var14.field1050 != null && var14.field1050[0][0] == 5) {
                    int var15 = var14.field1050[0][1];
                    this.field374[var15] = 1 - this.field374[var15];
                    this.method141(var15, 1306);
                    this.field504 = true;
                }
            }
            if (var5 == 62) {
                class1 var16 = this.field527[var6];
                if (var16 != null) {
                    this.method45(0, var16.field620[0], 2, 1, field174.field620[0], 0, var16.field619[0], field174.field619[0], 0, false, 0, 1);
                    this.field220 = super.field1194;
                    this.field221 = super.field1195;
                    this.field223 = 2;
                    this.field222 = 0;
                    ++field554;
                    if (field554 >= 94) {
                        this.field213.method467(101, 832);
                        this.field213.method472(0);
                        field554 = 0;
                    }
                    this.field213.method467(105, 832);
                    this.field213.method502(var6, true);
                }
            }
            if (var5 == 726) {
                boolean var17 = this.method45(0, var4, 2, 0, field174.field620[0], 0, var3, field174.field619[0], 0, false, 0, 0);
                if (!var17) {
                    this.method45(0, var4, 2, 1, field174.field620[0], 0, var3, field174.field619[0], 0, false, 0, 1);
                }
                this.field220 = super.field1194;
                this.field221 = super.field1195;
                this.field223 = 2;
                this.field222 = 0;
                this.field213.method467(125, 832);
                this.field213.method502(var6, true);
                this.field213.method502(this.field261, true);
                this.field213.method469(this.field126 + var4);
                this.field213.method501((byte) -11, this.field263);
                this.field213.method469(this.field125 + var3);
                this.field213.method469(this.field262);
            }
            if (var5 == 2) {
                this.field213.method467(2, 832);
                this.field213.method501((byte) -11, var4);
                this.field213.method469(this.field257);
                this.field213.method501((byte) -11, var3);
                this.field213.method502(var6, true);
                this.field337 = 0;
                this.field338 = var4;
                this.field339 = var3;
                this.field340 = 2;
                if (class34.field1057[var4].field1001 == this.field268) {
                    this.field340 = 1;
                }
                if (class34.field1057[var4].field1001 == this.field322) {
                    this.field340 = 3;
                }
            }
            if (var5 == 301) {
                boolean var19 = this.method45(0, var4, 2, 0, field174.field620[0], 0, var3, field174.field619[0], 0, false, 0, 0);
                if (!var19) {
                    this.method45(0, var4, 2, 1, field174.field620[0], 0, var3, field174.field619[0], 0, false, 0, 1);
                }
                this.field220 = super.field1194;
                this.field221 = super.field1195;
                this.field223 = 2;
                this.field222 = 0;
                this.field213.method467(68, 832);
                this.field213.method501((byte) -11, var6);
                this.field213.method502(this.field126 + var4, true);
                this.field213.method502(this.field125 + var3, true);
            }
            if (var5 == 560) {
                boolean var21 = this.method45(0, var4, 2, 0, field174.field620[0], 0, var3, field174.field619[0], 0, false, 0, 0);
                if (!var21) {
                    this.method45(0, var4, 2, 1, field174.field620[0], 0, var3, field174.field619[0], 0, false, 0, 1);
                }
                this.field220 = super.field1194;
                this.field221 = super.field1195;
                this.field223 = 2;
                this.field222 = 0;
                this.field213.method467(216, 832);
                this.field213.method503(false, this.field126 + var4);
                this.field213.method503(false, var6);
                this.field213.method469(this.field125 + var3);
            }
            if (var5 == 97) {
                this.field213.method467(253, 832);
                this.field213.method502(var6, true);
                this.field213.method502(var4, true);
                this.field213.method469(var3);
                this.field337 = 0;
                this.field338 = var4;
                this.field339 = var3;
                this.field340 = 2;
                if (class34.field1057[var4].field1001 == this.field268) {
                    this.field340 = 1;
                }
                if (class34.field1057[var4].field1001 == this.field322) {
                    this.field340 = 3;
                }
            }
            if (var5 == 1562) {
                class57 var23 = class57.method437(var6);
                class34 var24 = class34.field1057[var4];
                String var25;
                if (var24 != null && var24.field1036[var3] >= 100000) {
                    var25 = var24.field1036[var3] + " x " + var23.field1394;
                } else if (var23.field1417 != null) {
                    var25 = new String(var23.field1417);
                } else {
                    var25 = "It's a " + var23.field1394 + ".";
                }
                this.method155(-531, 0, var25, "");
            }
            if (var5 == 1038) {
                class57 var26 = class57.method437(var6);
                String var27;
                if (var26.field1417 != null) {
                    var27 = new String(var26.field1417);
                } else {
                    var27 = "It's a " + var26.field1394 + ".";
                }
                this.method155(-531, 0, var27, "");
            }
            if (var5 == 502 && this.method94(0, var4, var6, var3)) {
                this.field213.method467(27, 832);
                this.field213.method501((byte) -11, this.field126 + var4);
                this.field213.method501((byte) -11, var6 >> 14 & 32767);
                this.field213.method501((byte) -11, this.field257);
                this.field213.method503(false, this.field125 + var3);
            }
            if (var5 == 734 || var5 == 205) {
                String var28 = this.field215[arg0];
                int var29 = var28.indexOf("@whi@");
                if (var29 != -1) {
                    String var30 = var28.substring(var29 + 5).trim();
                    String var31 = class20.method218(-670, class20.method215(7, class20.method214(var30)));
                    boolean var32 = false;
                    for (int var33 = 0; var33 < this.field421; ++var33) {
                        class54 var34 = this.field420[this.field422[var33]];
                        if (var34 != null && var34.field1360 != null && var34.field1360.equalsIgnoreCase(var31)) {
                            this.method45(0, var34.field620[0], 2, 1, field174.field620[0], 0, var34.field619[0], field174.field619[0], 0, false, 0, 1);
                            if (var5 == 734) {
                                ++field158;
                                if (field158 >= 80) {
                                    this.field213.method467(131, 832);
                                    field158 = 0;
                                }
                                this.field213.method467(45, 832);
                                this.field213.method469(this.field422[var33]);
                            }
                            if (var5 == 205) {
                                this.field213.method467(184, 832);
                                this.field213.method501((byte) -11, this.field422[var33]);
                            }
                            var32 = true;
                            break;
                        }
                    }
                    if (!var32) {
                        this.method155(-531, 0, "Unable to find " + var31, "");
                    }
                }
            }
            if (var5 == 428) {
                if ((var6 & 3) == 0) {
                    ++field436;
                }
                if (field436 >= 134) {
                    this.field213.method467(56, 832);
                    this.field213.method468(150);
                    field436 = 0;
                }
                this.field213.method467(191, 832);
                this.field213.method469(var4);
                this.field213.method501((byte) -11, var6);
                this.field213.method503(false, var3);
                this.field337 = 0;
                this.field338 = var4;
                this.field339 = var3;
                this.field340 = 2;
                if (class34.field1057[var4].field1001 == this.field268) {
                    this.field340 = 1;
                }
                if (class34.field1057[var4].field1001 == this.field322) {
                    this.field340 = 3;
                }
            }
            if (var5 == 754 || var5 == 979 || var5 == 224 || var5 == 817) {
                String var35 = this.field215[arg0];
                int var36 = var35.indexOf("@whi@");
                if (var36 != -1) {
                    long var37 = class20.method214(var35.substring(var36 + 5).trim());
                    if (var5 == 754) {
                        this.method64(var37, (byte) -85);
                    }
                    if (var5 == 979) {
                        this.method91(-43975, var37);
                    }
                    if (var5 == 224) {
                        this.method43(var37, 0);
                    }
                    if (var5 == 817) {
                        this.method128(var37, false);
                    }
                }
            }
            if (var5 == 125) {
                class1 var39 = this.field527[var6];
                if (var39 != null) {
                    this.method45(0, var39.field620[0], 2, 1, field174.field620[0], 0, var39.field619[0], field174.field619[0], 0, false, 0, 1);
                    this.field220 = super.field1194;
                    this.field221 = super.field1195;
                    this.field223 = 2;
                    this.field222 = 0;
                    this.field213.method467(57, 832);
                    this.field213.method501((byte) -11, var6);
                }
            }
            if (var5 == 1579) {
                int var40 = var6 >> 14 & 32767;
                class13 var41 = class13.method194(var40);
                String var42;
                if (var41.field666 != null) {
                    var42 = new String(var41.field666);
                } else {
                    var42 = "It's a " + var41.field686 + ".";
                }
                this.method155(-531, 0, var42, "");
            }
            if (var5 == 855) {
                this.field213.method467(40, 832);
                this.field213.method502(var6, true);
                this.field213.method503(false, var3);
                this.field213.method469(var4);
                this.field337 = 0;
                this.field338 = var4;
                this.field339 = var3;
                this.field340 = 2;
                if (class34.field1057[var4].field1001 == this.field268) {
                    this.field340 = 1;
                }
                if (class34.field1057[var4].field1001 == this.field322) {
                    this.field340 = 3;
                }
            }
            if (var5 == 927) {
                class34 var43 = class34.field1057[var4];
                boolean var44 = true;
                if (var43.field1027 > 0) {
                    var44 = this.method38(6, var43);
                }
                if (var44) {
                    this.field213.method467(100, 832);
                    this.field213.method469(var4);
                }
            }
            if (var5 == 516) {
                this.method94(0, var4, var6, var3);
                this.field213.method467(157, 832);
                this.field213.method501((byte) -11, var6 >> 14 & 32767);
                this.field213.method469(this.field125 + var3);
                this.field213.method503(false, this.field126 + var4);
            }
            if (var5 == 872) {
                this.field213.method467(100, 832);
                this.field213.method469(var4);
                class34 var45 = class34.field1057[var4];
                if (var45.field1050 != null && var45.field1050[0][0] == 5) {
                    int var46 = var45.field1050[0][1];
                    if (this.field374[var46] != var45.field1048[0]) {
                        this.field374[var46] = var45.field1048[0];
                        this.method141(var46, 1306);
                        this.field504 = true;
                    }
                }
            }
            if (var5 == 974) {
                this.method97(-171);
            }
            if (var5 == 1914) {
                class1 var47 = this.field527[var6];
                if (var47 != null) {
                    class19 var48 = var47.field5;
                    if (var48.field760 != null) {
                        var48 = var48.method208(false);
                    }
                    if (var48 != null) {
                        String var49;
                        if (var48.field754 != null) {
                            var49 = new String(var48.field754);
                        } else {
                            var49 = "It's a " + var48.field787 + ".";
                        }
                        this.method155(-531, 0, var49, "");
                    }
                }
            }
            if (var5 == 703) {
                class1 var50 = this.field527[var6];
                if (var50 != null) {
                    this.method45(0, var50.field620[0], 2, 1, field174.field620[0], 0, var50.field619[0], field174.field619[0], 0, false, 0, 1);
                    this.field220 = super.field1194;
                    this.field221 = super.field1195;
                    this.field223 = 2;
                    this.field222 = 0;
                    this.field213.method467(31, 832);
                    this.field213.method469(var6);
                }
            }
            if (var5 == 589) {
                class54 var51 = this.field420[var6];
                if (var51 != null) {
                    this.method45(0, var51.field620[0], 2, 1, field174.field620[0], 0, var51.field619[0], field174.field619[0], 0, false, 0, 1);
                    this.field220 = super.field1194;
                    this.field221 = super.field1195;
                    this.field223 = 2;
                    this.field222 = 0;
                    this.field213.method467(184, 832);
                    this.field213.method501((byte) -11, var6);
                }
            }
            if (var5 == 1190) {
                this.method94(0, var4, var6, var3);
                this.field213.method467(236, 832);
                this.field213.method503(false, this.field125 + var3);
                this.field213.method469(this.field126 + var4);
                this.field213.method502(var6 >> 14 & 32767, true);
            }
            if (var5 == 276) {
                this.field213.method467(86, 832);
                this.field213.method501((byte) -11, var6);
                this.field213.method501((byte) -11, var3);
                this.field213.method501((byte) -11, var4);
                this.field337 = 0;
                this.field338 = var4;
                this.field339 = var3;
                this.field340 = 2;
                if (class34.field1057[var4].field1001 == this.field268) {
                    this.field340 = 1;
                }
                if (class34.field1057[var4].field1001 == this.field322) {
                    this.field340 = 3;
                }
            }
            if (var5 == 808) {
                String var52 = this.field215[arg0];
                int var53 = var52.indexOf("@whi@");
                if (var53 != -1) {
                    long var54 = class20.method214(var52.substring(var53 + 5).trim());
                    int var56 = -1;
                    for (int var57 = 0; var57 < this.field458; ++var57) {
                        if (this.field272[var57] == var54) {
                            var56 = var57;
                            break;
                        }
                    }
                    if (var56 != -1 && this.field242[var56] > 0) {
                        this.field100 = true;
                        this.field471 = 0;
                        this.field516 = true;
                        this.field247 = "";
                        this.field366 = 3;
                        this.field136 = this.field272[var56];
                        this.field163 = "Enter message to send to " + this.field431[var56];
                    }
                }
            }
            if (var5 == 532) {
                class1 var58 = this.field527[var6];
                if (var58 != null) {
                    this.method45(0, var58.field620[0], 2, 1, field174.field620[0], 0, var58.field619[0], field174.field619[0], 0, false, 0, 1);
                    this.field220 = super.field1194;
                    this.field221 = super.field1195;
                    this.field223 = 2;
                    this.field222 = 0;
                    this.field213.method467(88, 832);
                    this.field213.method469(var6);
                }
            }
            if (var5 == 252) {
                if (!this.field543) {
                    this.field409.method577((byte) 117, super.field1195 - 4, super.field1194 - 4);
                } else {
                    this.field409.method577((byte) 117, var4 - 4, var3 - 4);
                }
            }
            if (var5 == 996) {
                this.field213.method467(139, 832);
                this.field213.method503(false, var6);
                this.field213.method503(false, var3);
                this.field213.method501((byte) -11, var4);
                this.field337 = 0;
                this.field338 = var4;
                this.field339 = var3;
                this.field340 = 2;
                if (class34.field1057[var4].field1001 == this.field268) {
                    this.field340 = 1;
                }
                if (class34.field1057[var4].field1001 == this.field322) {
                    this.field340 = 3;
                }
            }
            if (var5 == 319) {
                class54 var59 = this.field420[var6];
                if (var59 != null) {
                    this.method45(0, var59.field620[0], 2, 1, field174.field620[0], 0, var59.field619[0], field174.field619[0], 0, false, 0, 1);
                    this.field220 = super.field1194;
                    this.field221 = super.field1195;
                    this.field223 = 2;
                    this.field222 = 0;
                    this.field213.method467(30, 832);
                    this.field213.method469(var6);
                }
            }
            if (var5 == 521 && this.method94(0, var4, var6, var3)) {
                this.field213.method467(43, 832);
                this.field213.method503(false, var6 >> 14 & 32767);
                this.field213.method469(this.field126 + var4);
                this.field213.method502(this.field261, true);
                this.field213.method469(this.field262);
                this.field213.method469(this.field263);
                this.field213.method503(false, this.field125 + var3);
            }
            if (var5 == 190) {
                this.method94(0, var4, var6, var3);
                this.field213.method467(93, 832);
                this.field213.method502(this.field126 + var4, true);
                this.field213.method469(this.field125 + var3);
                this.field213.method469(var6 >> 14 & 32767);
            }
            if (var5 == 237) {
                this.field260 = 1;
                this.field261 = var3;
                this.field262 = var4;
                this.field263 = var6;
                this.field264 = class57.method437(var6).field1394;
                this.field256 = 0;
                this.field504 = true;
            } else {
                if (var5 == 962) {
                    boolean var60 = this.method45(0, var4, 2, 0, field174.field620[0], 0, var3, field174.field619[0], 0, false, 0, 0);
                    if (!var60) {
                        this.method45(0, var4, 2, 1, field174.field620[0], 0, var3, field174.field619[0], 0, false, 0, 1);
                    }
                    this.field220 = super.field1194;
                    this.field221 = super.field1195;
                    this.field223 = 2;
                    this.field222 = 0;
                    this.field213.method467(205, 832);
                    this.field213.method503(false, this.field126 + var4);
                    this.field213.method503(false, var6);
                    this.field213.method501((byte) -11, this.field257);
                    this.field213.method469(this.field125 + var3);
                }
                if (var5 == 596) {
                    boolean var62 = this.method45(0, var4, 2, 0, field174.field620[0], 0, var3, field174.field619[0], 0, false, 0, 0);
                    if (!var62) {
                        this.method45(0, var4, 2, 1, field174.field620[0], 0, var3, field174.field619[0], 0, false, 0, 1);
                    }
                    this.field220 = super.field1194;
                    this.field221 = super.field1195;
                    this.field223 = 2;
                    this.field222 = 0;
                    ++field170;
                    if (field170 >= 88) {
                        this.field213.method467(115, 832);
                        this.field213.method471(7252907);
                        field170 = 0;
                    }
                    this.field213.method467(177, 832);
                    this.field213.method503(false, this.field126 + var4);
                    this.field213.method502(this.field125 + var3, true);
                    this.field213.method469(var6);
                }
                if (var5 == 154) {
                    boolean var64 = this.method45(0, var4, 2, 0, field174.field620[0], 0, var3, field174.field619[0], 0, false, 0, 0);
                    if (!var64) {
                        this.method45(0, var4, 2, 1, field174.field620[0], 0, var3, field174.field619[0], 0, false, 0, 1);
                    }
                    this.field220 = super.field1194;
                    this.field221 = super.field1195;
                    this.field223 = 2;
                    this.field222 = 0;
                    this.field213.method467(248, 832);
                    this.field213.method503(false, this.field125 + var3);
                    this.field213.method469(this.field126 + var4);
                    this.field213.method501((byte) -11, var6);
                }
                if (var5 == 656) {
                    this.method94(0, var4, var6, var3);
                    this.field213.method467(17, 832);
                    this.field213.method469(var6 >> 14 & 32767);
                    this.field213.method503(false, this.field125 + var3);
                    this.field213.method469(this.field126 + var4);
                }
                if (var5 == 657) {
                    this.field213.method467(48, 832);
                    this.field213.method502(var6, true);
                    this.field213.method501((byte) -11, var4);
                    this.field213.method501((byte) -11, var3);
                    this.field337 = 0;
                    this.field338 = var4;
                    this.field339 = var3;
                    this.field340 = 2;
                    if (class34.field1057[var4].field1001 == this.field268) {
                        this.field340 = 1;
                    }
                    if (class34.field1057[var4].field1001 == this.field322) {
                        this.field340 = 3;
                    }
                }
                if (var5 == 970) {
                    class54 var66 = this.field420[var6];
                    if (var66 != null) {
                        this.method45(0, var66.field620[0], 2, 1, field174.field620[0], 0, var66.field619[0], field174.field619[0], 0, false, 0, 1);
                        this.field220 = super.field1194;
                        this.field221 = super.field1195;
                        this.field223 = 2;
                        this.field222 = 0;
                        this.field213.method467(246, 832);
                        this.field213.method501((byte) -11, var6);
                    }
                }
                if (var5 == 245) {
                    class54 var67 = this.field420[var6];
                    if (var67 != null) {
                        this.method45(0, var67.field620[0], 2, 1, field174.field620[0], 0, var67.field619[0], field174.field619[0], 0, false, 0, 1);
                        this.field220 = super.field1194;
                        this.field221 = super.field1195;
                        this.field223 = 2;
                        this.field222 = 0;
                        this.field213.method467(39, 832);
                        this.field213.method469(this.field261);
                        this.field213.method469(var6);
                        this.field213.method469(this.field262);
                        this.field213.method503(false, this.field263);
                    }
                }
                if (var5 == 218) {
                    String var68 = this.field215[arg0];
                    int var69 = var68.indexOf("@whi@");
                    if (var69 != -1) {
                        if (this.field268 == -1) {
                            this.method97(-171);
                            this.field308 = var68.substring(var69 + 5).trim();
                            this.field114 = false;
                            for (int var70 = 0; var70 < class34.field1057.length; ++var70) {
                                if (class34.field1057[var70] != null && class34.field1057[var70].field1027 == 600) {
                                    this.field320 = this.field268 = class34.field1057[var70].field1001;
                                    break;
                                }
                            }
                        } else {
                            this.method155(-531, 0, "Please close the interface you have open before using 'report abuse'", "");
                        }
                    }
                }
                if (var5 == 439) {
                    class54 var71 = this.field420[var6];
                    if (var71 != null) {
                        this.method45(0, var71.field620[0], 2, 1, field174.field620[0], 0, var71.field619[0], field174.field619[0], 0, false, 0, 1);
                        this.field220 = super.field1194;
                        this.field221 = super.field1195;
                        this.field223 = 2;
                        this.field222 = 0;
                        this.field213.method467(69, 832);
                        this.field213.method469(var6);
                    }
                }
                if (var5 == 743) {
                    class34 var72 = class34.field1057[var4];
                    this.field256 = 1;
                    this.field257 = var4;
                    this.field258 = var72.field1041;
                    this.field260 = 0;
                    this.field504 = true;
                    String var73 = var72.field997;
                    if (var73.indexOf(" ") != -1) {
                        var73 = var73.substring(0, var73.indexOf(" "));
                    }
                    String var74 = var72.field997;
                    if (var74.indexOf(" ") != -1) {
                        var74 = var74.substring(var74.indexOf(" ") + 1);
                    }
                    this.field259 = var73 + " " + var72.field1017 + " " + var74;
                    if (this.field258 == 16) {
                        this.field504 = true;
                        this.field115 = 3;
                        this.field388 = true;
                    }
                } else {
                    if (var5 == 652) {
                        this.field213.method467(197, 832);
                        this.field213.method502(var6, true);
                        this.field213.method503(false, var4);
                        this.field213.method503(false, var3);
                        this.field337 = 0;
                        this.field338 = var4;
                        this.field339 = var3;
                        this.field340 = 2;
                        if (class34.field1057[var4].field1001 == this.field268) {
                            this.field340 = 1;
                        }
                        if (class34.field1057[var4].field1001 == this.field322) {
                            this.field340 = 3;
                        }
                    }
                    this.field260 = 0;
                    this.field256 = 0;
                    this.field504 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(Ljava/lang/String;)Ljava/io/DataInputStream;")
    public final DataInputStream method159(String arg0) throws IOException {
        if (!this.field101) {
            return signlink.mainapp != null ? signlink.openurl(arg0) : new DataInputStream((new URL(this.getCodeBase(), arg0)).openStream());
        } else {
            if (this.field509 != null) {
                try {
                    this.field509.close();
                } catch (Exception var4) {
                }
                this.field509 = null;
            }
            this.field509 = this.method36(43595);
            this.field509.setSoTimeout(10000);
            InputStream var2 = this.field509.getInputStream();
            OutputStream var3 = this.field509.getOutputStream();
            var3.write(("JAGGRAB /" + arg0 + "\n\n").getBytes());
            return new DataInputStream(var2);
        }
    }

    @OriginalMember(owner = "client", name = "T", descriptor = "(I)V")
    public final void method160(int arg0) {
        this.field120 += arg0;
        this.field469 = false;
        while (this.field218) {
            this.field469 = false;
            try {
                Thread.sleep(50L);
            } catch (Exception var2) {
            }
        }
        this.field548 = null;
        this.field549 = null;
        this.field326 = null;
        this.field209 = null;
        this.field210 = null;
        this.field211 = null;
        this.field212 = null;
        this.field254 = null;
        this.field255 = null;
        this.field92 = null;
        this.field93 = null;
        this.field370 = null;
        this.field371 = null;
    }

    @OriginalMember(owner = "client", name = "h", descriptor = "(B)V")
    public final void method161(byte arg0) {
        this.field522.method394(false);
        if (this.field171 == 2) {
            byte[] var2 = this.field518.field1597;
            int[] var3 = class36.field1088;
            int var4 = var2.length;
            for (int var5 = 0; var5 < var4; ++var5) {
                if (var2[var5] == 0) {
                    var3[var5] = 0;
                }
            }
            this.field172.method17(this.field214, this.field316, 33, 0, 25, this.field487, this.field154, 0, 25, 256, 33);
            this.field523.method394(false);
        } else {
            int var6 = this.field487 + this.field328 & 2047;
            int var7 = field174.field587 / 32 + 48;
            int var8 = 464 - field174.field588 / 32;
            this.field297.method17(this.field411, this.field184, 151, 5, var7, var6, this.field154, 25, var8, this.field130 + 256, 146);
            this.field172.method17(this.field214, this.field316, 33, 0, 25, this.field487, this.field154, 0, 25, 256, 33);
            if (this.field273 == arg0) {
                boolean var9 = false;
            } else {
                this.field121 = this.field251.method478();
            }
            for (int var10 = 0; var10 < this.field461; ++var10) {
                int var40 = this.field462[var10] * 4 + 2 - field174.field587 / 32;
                int var41 = this.field463[var10] * 4 + 2 - field174.field588 / 32;
                this.method151((byte) 3, var41, var40, this.field391[var10]);
            }
            for (int var11 = 0; var11 < 104; ++var11) {
                for (int var36 = 0; var36 < 104; ++var36) {
                    class16 var37 = this.field376[this.field164][var11][var36];
                    if (var37 != null) {
                        int var38 = var11 * 4 + 2 - field174.field587 / 32;
                        int var39 = var36 * 4 + 2 - field174.field588 / 32;
                        this.method151((byte) 3, var39, var38, this.field492);
                    }
                }
            }
            for (int var12 = 0; var12 < this.field528; ++var12) {
                class1 var32 = this.field527[this.field529[var12]];
                if (var32 != null && var32.method1(this.field161)) {
                    class19 var33 = var32.field5;
                    if (var33.field760 != null) {
                        var33 = var33.method208(false);
                    }
                    if (var33 != null && var33.field782 && var33.field769) {
                        int var34 = var32.field587 / 32 - field174.field587 / 32;
                        int var35 = var32.field588 / 32 - field174.field588 / 32;
                        this.method151((byte) 3, var35, var34, this.field493);
                    }
                }
            }
            for (int var13 = 0; var13 < this.field421; ++var13) {
                class54 var24 = this.field420[this.field422[var13]];
                if (var24 != null && var24.method1(this.field161)) {
                    int var25 = var24.field587 / 32 - field174.field587 / 32;
                    int var26 = var24.field588 / 32 - field174.field588 / 32;
                    boolean var27 = false;
                    long var28 = class20.method214(var24.field1360);
                    for (int var30 = 0; var30 < this.field458; ++var30) {
                        if (this.field272[var30] == var28 && this.field242[var30] != 0) {
                            var27 = true;
                            break;
                        }
                    }
                    boolean var31 = false;
                    if (field174.field1361 != 0 && var24.field1361 != 0 && field174.field1361 == var24.field1361) {
                        var31 = true;
                    }
                    if (var27) {
                        this.method151((byte) 3, var26, var25, this.field495);
                    } else if (var31) {
                        this.method151((byte) 3, var26, var25, this.field496);
                    } else {
                        this.method151((byte) 3, var26, var25, this.field494);
                    }
                }
            }
            if (this.field148 != 0 && field330 % 20 < 10) {
                if (this.field148 == 1 && this.field241 >= 0 && this.field241 < this.field527.length) {
                    class1 var14 = this.field527[this.field241];
                    if (var14 != null) {
                        int var15 = var14.field587 / 32 - field174.field587 / 32;
                        int var16 = var14.field588 / 32 - field174.field588 / 32;
                        this.method35(-991, var16, this.field531, var15);
                    }
                }
                if (this.field148 == 2) {
                    int var17 = (this.field137 - this.field125) * 4 + 2 - field174.field587 / 32;
                    int var18 = (this.field138 - this.field126) * 4 + 2 - field174.field588 / 32;
                    this.method35(-991, var18, this.field531, var17);
                }
                if (this.field148 == 10 && this.field327 >= 0 && this.field327 < this.field420.length) {
                    class54 var19 = this.field420[this.field327];
                    if (var19 != null) {
                        int var20 = var19.field587 / 32 - field174.field587 / 32;
                        int var21 = var19.field588 / 32 - field174.field588 / 32;
                        this.method35(-991, var21, this.field531, var20);
                    }
                }
            }
            if (this.field295 != 0) {
                int var22 = this.field295 * 4 + 2 - field174.field587 / 32;
                int var23 = this.field296 * 4 + 2 - field174.field588 / 32;
                this.method151((byte) 3, var23, var22, this.field530);
            }
            class36.method344(3, 16777215, true, 78, 97, 3);
            this.field523.method394(false);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IZI)Z")
    public final boolean method162(int arg0, boolean arg1, int arg2) {
        if (!arg1) {
            this.field456 = -174;
        }
        boolean var4 = false;
        class34 var5 = class34.field1057[arg0];
        for (int var6 = 0; var6 < var5.field1031.length && var5.field1031[var6] != -1; ++var6) {
            class34 var7 = class34.field1057[var5.field1031[var6]];
            if (var7.field1058 == 1) {
                var4 |= this.method162(var7.field1043, true, arg2);
            }
            if (var7.field1058 == 6 && (var7.field1007 != -1 || var7.field1008 != -1)) {
                boolean var8 = this.method50(var7, true);
                int var9;
                if (var8) {
                    var9 = var7.field1008;
                } else {
                    var9 = var7.field1007;
                }
                if (var9 != -1) {
                    class24 var10 = class24.field813[var9];
                    var7.field1016 += arg2;
                    while (var7.field1016 > var10.method227(956, var7.field1044)) {
                        var7.field1016 -= var10.method227(956, var7.field1044) + 1;
                        ++var7.field1044;
                        if (var7.field1044 >= var10.field814) {
                            var7.field1044 -= var10.field818;
                            if (var7.field1044 < 0 || var7.field1044 >= var10.field814) {
                                var7.field1044 = 0;
                            }
                        }
                        var4 = true;
                    }
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZILjava/lang/String;)V")
    public final void method163(boolean arg0, int arg1, String arg2) {
        this.field180 = arg1;
        this.field99 = arg2;
        this.method59(1);
        if (this.field427 == null) {
            super.method163(field358, arg1, arg2);
        } else {
            this.field187.method394(false);
            short var4 = 360;
            short var5 = 200;
            byte var6 = 20;
            this.field513.method370("RuneScape is loading - please wait...", var4 / 2, false, 16777215, var5 / 2 - 26 - var6);
            int var7 = var5 / 2 - 18 - var6;
            if (arg0) {
                this.field343 = -45;
            }
            class36.method345(304, var4 / 2 - 152, 34, 9179409, (byte) 6, var7);
            class36.method345(302, var4 / 2 - 151, 32, 0, (byte) 6, var7 + 1);
            class36.method344(arg1 * 3, 9179409, true, var7 + 2, var4 / 2 - 150, 30);
            class36.method344(300 - arg1 * 3, 0, true, var7 + 2, arg1 * 3 + (var4 / 2 - 150), 30);
            this.field513.method370(arg2, var4 / 2, false, 16777215, var5 / 2 + 5 - var6);
            this.field187.method395(-30874, super.field1179, 171, 202);
            if (this.field249) {
                this.field249 = false;
                if (!this.field469) {
                    this.field188.method395(-30874, super.field1179, 0, 0);
                    this.field189.method395(-30874, super.field1179, 0, 637);
                }
                this.field185.method395(-30874, super.field1179, 0, 128);
                this.field186.method395(-30874, super.field1179, 371, 202);
                this.field190.method395(-30874, super.field1179, 265, 0);
                this.field191.method395(-30874, super.field1179, 265, 562);
                this.field192.method395(-30874, super.field1179, 171, 128);
                this.field193.method395(-30874, super.field1179, 171, 562);
            }
        }
    }

    @OriginalMember(owner = "client", name = "i", descriptor = "(B)V")
    public final void method164(byte arg0) {
        for (int var2 = -1; var2 < this.field421; ++var2) {
            int var3;
            if (var2 == -1) {
                var3 = this.field419;
            } else {
                var3 = this.field422[var2];
            }
            class54 var4 = this.field420[var3];
            if (var4 != null) {
                this.method112(true, 1, var4);
            }
        }
        ++field204;
        if (arg0 != 111) {
            this.field446 = 120;
        }
        if (field204 > 65) {
            field204 = 0;
            this.field213.method467(201, 832);
        }
    }

    @OriginalMember(owner = "client", name = "U", descriptor = "(I)Ljava/lang/String;")
    public final String method165(int arg0) {
        if (arg0 < 7 || arg0 > 7) {
            this.field121 = -1;
        }
        if (signlink.mainapp != null) {
            return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
        } else {
            return super.field1182 != null ? "runescape.com" : super.getDocumentBase().getHost().toLowerCase();
        }
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(II)Ljava/lang/String;")
    public final String method166(int arg0, int arg1) {
        if (arg1 != 0) {
            this.method44();
        }
        return arg0 < 999999999 ? String.valueOf(arg0) : "*";
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZILXQPFGONL;)V")
    private final void method167(boolean arg0, int arg1, class62 arg2) {
        if (arg0) {
            this.field121 = arg2.method478();
        }
        while (arg2.field1543 + 10 < arg1 * 8) {
            int var4 = arg2.method489(11, 0);
            if (var4 == 2047) {
                break;
            }
            if (this.field420[var4] == null) {
                this.field420[var4] = new class54();
                if (this.field425[var4] != null) {
                    this.field420[var4].method425(this.field425[var4], false);
                }
            }
            this.field422[this.field421++] = var4;
            class54 var5 = this.field420[var4];
            var5.field630 = field330;
            int var6 = arg2.method489(1, 0);
            if (var6 == 1) {
                this.field424[this.field423++] = var4;
            }
            int var7 = arg2.method489(1, 0);
            int var8 = arg2.method489(5, 0);
            if (var8 > 15) {
                var8 -= 32;
            }
            int var9 = arg2.method489(5, 0);
            if (var9 > 15) {
                var9 -= 32;
            }
            var5.method183(9, field174.field620[0] + var9, field174.field619[0] + var8, var7 == 1);
        }
        arg2.method490((byte) 8);
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(BI)Ljava/lang/String;")
    private static final String method168(byte arg0, int arg1) {
        String var2 = String.valueOf(arg1);
        for (int var3 = var2.length() - 3; var3 > 0; var3 -= 3) {
            var2 = var2.substring(0, var3) + "," + var2.substring(var3);
        }
        if (field451 != arg0) {
            field550 = !field550;
        }
        if (var2.length() > 8) {
            var2 = "@gre@" + var2.substring(0, var2.length() - 8) + " million @whi@(" + var2 + ")";
        } else if (var2.length() > 4) {
            var2 = "@cya@" + var2.substring(0, var2.length() - 4) + "K @whi@(" + var2 + ")";
        }
        return " " + var2;
    }

    @OriginalMember(owner = "client", name = "l", descriptor = "(Z)V")
    public final void method169(boolean arg0) {
        this.field521.method394(false);
        class31.field975 = this.field143;
        this.field517.method533(-41075, 0, 0);
        if (this.field342 != -1) {
            this.method87(0, 0, 0, class34.field1057[this.field342], 0);
        } else if (this.field319[this.field115] != -1) {
            this.method87(0, 0, 0, class34.field1057[this.field319[this.field115]], 0);
        }
        if (this.field543 && this.field397 == 1) {
            this.method62(false);
        }
        this.field521.method395(-30874, super.field1179, 205, 553);
        this.field523.method394(false);
        class31.field975 = this.field144;
        if (arg0) {
            this.method44();
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(ZI)Z")
    public final boolean method170(boolean arg0, int arg1) {
        if (arg1 < 0) {
            return false;
        } else {
            int var3 = this.field405[arg1];
            if (arg0) {
                for (int var4 = 1; var4 > 0; ++var4) {
                }
            }
            if (var3 >= 2000) {
                var3 -= 2000;
            }
            return var3 == 754;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIZI)V")
    public final void method171(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.field353 &= arg4;
        int var7 = this.field409.method565(arg1, arg3, arg2);
        if (var7 != 0) {
            int var8 = this.field409.method569(arg1, arg3, arg2, var7);
            int var9 = var8 >> 6 & 3;
            int var10 = var8 & 31;
            int var11 = arg0;
            if (var7 > 0) {
                var11 = arg5;
            }
            int[] var12 = this.field297.field41;
            int var13 = (103 - arg2) * 512 * 4 + arg3 * 4 + 24624;
            int var14 = var7 >> 14 & 32767;
            class13 var15 = class13.method194(var14);
            if (var15.field652 != -1) {
                class66 var16 = this.field113[var15.field652];
                if (var16 != null) {
                    int var17 = (var15.field676 * 4 - var16.field1599) / 2;
                    int var18 = (var15.field642 * 4 - var16.field1600) / 2;
                    var16.method533(-41075, (104 - arg2 - var15.field642) * 4 + 48 + var18, arg3 * 4 + 48 + var17);
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
        int var19 = this.field409.method567(arg1, arg3, arg2);
        if (var19 != 0) {
            int var20 = this.field409.method569(arg1, arg3, arg2, var19);
            int var21 = var20 >> 6 & 3;
            int var22 = var20 & 31;
            int var23 = var19 >> 14 & 32767;
            class13 var24 = class13.method194(var23);
            if (var24.field652 != -1) {
                class66 var25 = this.field113[var24.field652];
                if (var25 != null) {
                    int var26 = (var24.field676 * 4 - var25.field1599) / 2;
                    int var27 = (var24.field642 * 4 - var25.field1600) / 2;
                    var25.method533(-41075, (104 - arg2 - var24.field642) * 4 + 48 + var27, arg3 * 4 + 48 + var26);
                }
            } else if (var22 == 9) {
                int var28 = 15658734;
                if (var19 > 0) {
                    var28 = 15597568;
                }
                int[] var29 = this.field297.field41;
                int var30 = (103 - arg2) * 512 * 4 + arg3 * 4 + 24624;
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
        int var31 = this.field409.method568(arg1, arg3, arg2);
        if (var31 != 0) {
            int var32 = var31 >> 14 & 32767;
            class13 var33 = class13.method194(var32);
            if (var33.field652 != -1) {
                class66 var34 = this.field113[var33.field652];
                if (var34 != null) {
                    int var35 = (var33.field676 * 4 - var34.field1599) / 2;
                    int var36 = (var33.field642 * 4 - var34.field1600) / 2;
                    var34.method533(-41075, (104 - arg2 - var33.field642) * 4 + 48 + var36, arg3 * 4 + 48 + var35);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "V", descriptor = "(I)V")
    public final void method172(int arg0) {
        byte[] var2 = this.field427.method465("title.dat", (byte[]) null);
        class4 var3 = new class4(var2, this);
        this.field188.method394(false);
        var3.method11(field129, 0, 0);
        this.field189.method394(false);
        var3.method11(field129, -637, 0);
        this.field185.method394(false);
        var3.method11(field129, -128, 0);
        this.field186.method394(false);
        var3.method11(field129, -202, -371);
        this.field187.method394(false);
        var3.method11(field129, -202, -171);
        this.field190.method394(false);
        var3.method11(field129, 0, -265);
        this.field191.method394(false);
        var3.method11(field129, -562, -265);
        this.field192.method394(false);
        var3.method11(field129, -128, -171);
        this.field193.method394(false);
        var3.method11(field129, -562, -171);
        int[] var4 = new int[var3.field42];
        for (int var5 = 0; var5 < var3.field43; ++var5) {
            for (int var10 = 0; var10 < var3.field42; ++var10) {
                var4[var10] = var3.field41[var3.field42 * var5 + (var3.field42 - var10 - 1)];
            }
            for (int var11 = 0; var11 < var3.field42; ++var11) {
                var3.field41[var3.field42 * var5 + var11] = var4[var11];
            }
        }
        this.field188.method394(false);
        var3.method11(field129, 382, 0);
        this.field189.method394(false);
        var3.method11(field129, -255, 0);
        this.field185.method394(false);
        var3.method11(field129, 254, 0);
        this.field186.method394(false);
        var3.method11(field129, 180, -371);
        this.field187.method394(false);
        var3.method11(field129, 180, -171);
        this.field190.method394(false);
        var3.method11(field129, 382, -265);
        this.field191.method394(false);
        var3.method11(field129, -180, -265);
        this.field192.method394(false);
        var3.method11(field129, 254, -171);
        this.field193.method394(false);
        var3.method11(field129, -180, -171);
        class4 var6 = new class4(this.field427, "logo", 0);
        this.field185.method394(false);
        var6.method13(-41075, 18, 382 - var6.field42 / 2 - 128);
        Object var7 = null;
        Object var8 = null;
        if (arg0 > 0) {
            Object var9 = null;
            System.gc();
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(IBI)Ljava/lang/String;")
    public static final String method173(int arg0, byte arg1, int arg2) {
        if (arg1 != -2) {
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

    @OriginalMember(owner = "client", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        return signlink.mainapp != null ? signlink.mainapp.getParameter(arg0) : super.getParameter(arg0);
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; ++var1) {
            field197[var1] = var0 - 1;
            var0 += var0;
        }
        field232 = 10;
        field234 = true;
        field245 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");
        field317 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
        field332 = new int[99];
        int var2 = 0;
        for (int var3 = 0; var3 < 99; ++var3) {
            int var4 = var3 + 1;
            int var5 = (int) ((double) var4 + 300.0D * Math.pow(2.0D, (double) var4 / 7.0D));
            var2 += var5;
            field332[var3] = var2 / 4;
        }
        field379 = 424;
        field394 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");
        field408 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };
        field434 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };
        field451 = 25;
    }
}
