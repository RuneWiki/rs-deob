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
public class client extends class26 {

    @OriginalMember(owner = "client!client", name = "K", descriptor = "B")
    private byte field119 = 8;

    @OriginalMember(owner = "client!client", name = "L", descriptor = "[LYFAYUBGF;")
    public class66[] field120 = new class66[5];

    @OriginalMember(owner = "client!client", name = "M", descriptor = "I")
    private int field121 = 5063219;

    @OriginalMember(owner = "client!client", name = "N", descriptor = "Ljava/lang/String;")
    private String field122 = "";

    @OriginalMember(owner = "client!client", name = "O", descriptor = "[I")
    private int[] field123 = new int[5];

    @OriginalMember(owner = "client!client", name = "P", descriptor = "I")
    private int field124 = 907;

    @OriginalMember(owner = "client!client", name = "R", descriptor = "[J")
    private long[] field126 = new long[100];

    @OriginalMember(owner = "client!client", name = "T", descriptor = "Z")
    private boolean field128 = false;

    @OriginalMember(owner = "client!client", name = "W", descriptor = "I")
    private int field131 = -1;

    @OriginalMember(owner = "client!client", name = "X", descriptor = "LPQBRPYKE;")
    private class41 field132 = class41.method328(6, 1);

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
    private int field133 = -1;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "[I")
    private int[] field136 = new int[256];

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
    private int field137 = -214;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "Ljava/lang/String;")
    private String field138 = "";

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
    private int field140 = 2;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
    private int field142 = 1;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "LPQBRPYKE;")
    private class41 field143 = class41.method328(6, 1);

    @OriginalMember(owner = "client!client", name = "mb", descriptor = "I")
    private int field147 = 3;

    @OriginalMember(owner = "client!client", name = "ob", descriptor = "I")
    private int field149 = 5;

    @OriginalMember(owner = "client!client", name = "qb", descriptor = "[LWQACZBNG;")
    private class58[] field151 = new class58[8];

    @OriginalMember(owner = "client!client", name = "sb", descriptor = "I")
    private int field153 = -799;

    @OriginalMember(owner = "client!client", name = "wb", descriptor = "I")
    private int field157 = -1;

    @OriginalMember(owner = "client!client", name = "xb", descriptor = "Z")
    private boolean field158 = true;

    @OriginalMember(owner = "client!client", name = "yb", descriptor = "Z")
    private boolean field159 = false;

    @OriginalMember(owner = "client!client", name = "zb", descriptor = "Z")
    private boolean field160 = false;

    @OriginalMember(owner = "client!client", name = "Ab", descriptor = "Ljava/lang/String;")
    private String field161 = "";

    @OriginalMember(owner = "client!client", name = "Cb", descriptor = "[Ljava/lang/String;")
    private String[] field163 = new String[100];

    @OriginalMember(owner = "client!client", name = "Db", descriptor = "[I")
    private int[] field164 = new int[100];

    @OriginalMember(owner = "client!client", name = "Fb", descriptor = "Z")
    private boolean field166 = false;

    @OriginalMember(owner = "client!client", name = "Hb", descriptor = "[LVEIVHFHZ;")
    private class54[] field168 = new class54[100];

    @OriginalMember(owner = "client!client", name = "Ib", descriptor = "[LVEIVHFHZ;")
    private class54[] field169 = new class54[2];

    @OriginalMember(owner = "client!client", name = "Jb", descriptor = "[[I")
    private int[][] field170 = new int[104][104];

    @OriginalMember(owner = "client!client", name = "Kb", descriptor = "B")
    private byte field171 = -119;

    @OriginalMember(owner = "client!client", name = "Mb", descriptor = "Z")
    private boolean field173 = false;

    @OriginalMember(owner = "client!client", name = "Nb", descriptor = "B")
    private byte field174 = -125;

    @OriginalMember(owner = "client!client", name = "Ob", descriptor = "[I")
    private int[] field175 = new int[5];

    @OriginalMember(owner = "client!client", name = "Qb", descriptor = "Z")
    private boolean field177 = false;

    @OriginalMember(owner = "client!client", name = "Rb", descriptor = "[I")
    private int[] field178 = new int[500];

    @OriginalMember(owner = "client!client", name = "Sb", descriptor = "[I")
    private int[] field179 = new int[500];

    @OriginalMember(owner = "client!client", name = "Tb", descriptor = "[I")
    private int[] field180 = new int[500];

    @OriginalMember(owner = "client!client", name = "Ub", descriptor = "[I")
    private int[] field181 = new int[500];

    @OriginalMember(owner = "client!client", name = "Vb", descriptor = "Z")
    private boolean field182 = false;

    @OriginalMember(owner = "client!client", name = "Xb", descriptor = "I")
    private int field184 = -1;

    @OriginalMember(owner = "client!client", name = "Yb", descriptor = "[I")
    private int[] field185 = new int[50];

    @OriginalMember(owner = "client!client", name = "ac", descriptor = "B")
    private byte field187 = 40;

    @OriginalMember(owner = "client!client", name = "bc", descriptor = "[I")
    private int[] field188 = new int[33];

    @OriginalMember(owner = "client!client", name = "lc", descriptor = "I")
    private int field198 = 464;

    @OriginalMember(owner = "client!client", name = "nc", descriptor = "B")
    private byte field200 = -72;

    @OriginalMember(owner = "client!client", name = "oc", descriptor = "[I")
    private int[] field201 = new int[50];

    @OriginalMember(owner = "client!client", name = "pc", descriptor = "Z")
    private boolean field202 = true;

    @OriginalMember(owner = "client!client", name = "rc", descriptor = "Ljava/lang/String;")
    private String field204 = "";

    @OriginalMember(owner = "client!client", name = "sc", descriptor = "Ljava/lang/String;")
    private String field205 = "";

    @OriginalMember(owner = "client!client", name = "Ic", descriptor = "Z")
    private boolean field221 = false;

    @OriginalMember(owner = "client!client", name = "Mc", descriptor = "[Ljava/lang/String;")
    private String[] field225 = new String[500];

    @OriginalMember(owner = "client!client", name = "Pc", descriptor = "I")
    private int field228 = -1;

    @OriginalMember(owner = "client!client", name = "Qc", descriptor = "[[I")
    private int[][] field229 = new int[104][104];

    @OriginalMember(owner = "client!client", name = "Yc", descriptor = "Z")
    private boolean field237 = false;

    @OriginalMember(owner = "client!client", name = "ad", descriptor = "[B")
    private byte[] field239 = new byte[16384];

    @OriginalMember(owner = "client!client", name = "ed", descriptor = "LATOBWHST;")
    private class1 field243 = new class1();

    @OriginalMember(owner = "client!client", name = "fd", descriptor = "Z")
    private boolean field244 = false;

    @OriginalMember(owner = "client!client", name = "hd", descriptor = "I")
    private int field246 = 2;

    @OriginalMember(owner = "client!client", name = "md", descriptor = "I")
    private int field251 = -129;

    @OriginalMember(owner = "client!client", name = "nd", descriptor = "I")
    private int field252 = -1;

    @OriginalMember(owner = "client!client", name = "qd", descriptor = "[I")
    private int[] field255 = new int[1000];

    @OriginalMember(owner = "client!client", name = "rd", descriptor = "[I")
    private int[] field256 = new int[1000];

    @OriginalMember(owner = "client!client", name = "td", descriptor = "I")
    private int field258 = -1;

    @OriginalMember(owner = "client!client", name = "vd", descriptor = "[I")
    private int[] field260 = new int[class3.field94];

    @OriginalMember(owner = "client!client", name = "wd", descriptor = "[LEOSBSGLH;")
    private class15[] field261 = new class15[4];

    @OriginalMember(owner = "client!client", name = "yd", descriptor = "Z")
    private boolean field263 = false;

    @OriginalMember(owner = "client!client", name = "zd", descriptor = "LPQBRPYKE;")
    private class41 field264 = new class41(888, new byte[5000]);

    @OriginalMember(owner = "client!client", name = "Ad", descriptor = "[LTBFTCCSF;")
    private class47[] field265 = new class47[16384];

    @OriginalMember(owner = "client!client", name = "Cd", descriptor = "[I")
    public int[] field267 = new int[16384];

    @OriginalMember(owner = "client!client", name = "Md", descriptor = "Z")
    private boolean field277 = false;

    @OriginalMember(owner = "client!client", name = "Sd", descriptor = "I")
    private int field283 = -489;

    @OriginalMember(owner = "client!client", name = "Ud", descriptor = "I")
    private int field285 = 2;

    @OriginalMember(owner = "client!client", name = "be", descriptor = "Z")
    private boolean field292 = false;

    @OriginalMember(owner = "client!client", name = "de", descriptor = "LVGFLNLXH;")
    private class55 field294 = new class55(826);

    @OriginalMember(owner = "client!client", name = "je", descriptor = "LVGFLNLXH;")
    private class55 field300 = new class55(826);

    @OriginalMember(owner = "client!client", name = "qe", descriptor = "I")
    private int field307 = -1;

    @OriginalMember(owner = "client!client", name = "xe", descriptor = "[I")
    private int[] field314 = new int[151];

    @OriginalMember(owner = "client!client", name = "Ge", descriptor = "[I")
    private int[] field323 = new int[7];

    @OriginalMember(owner = "client!client", name = "Je", descriptor = "I")
    private int field326 = 584;

    @OriginalMember(owner = "client!client", name = "Ke", descriptor = "[LWQACZBNG;")
    private class58[] field327 = new class58[32];

    @OriginalMember(owner = "client!client", name = "Re", descriptor = "I")
    private int field334 = -1;

    @OriginalMember(owner = "client!client", name = "We", descriptor = "Z")
    private boolean field339 = false;

    @OriginalMember(owner = "client!client", name = "Xe", descriptor = "I")
    private final int field340 = 100;

    @OriginalMember(owner = "client!client", name = "Ye", descriptor = "[I")
    private int[] field341 = new int[100];

    @OriginalMember(owner = "client!client", name = "Ze", descriptor = "Z")
    private boolean field342 = false;

    @OriginalMember(owner = "client!client", name = "bf", descriptor = "B")
    private byte field344 = -68;

    @OriginalMember(owner = "client!client", name = "ef", descriptor = "Ljava/lang/String;")
    private String field347 = "";

    @OriginalMember(owner = "client!client", name = "ff", descriptor = "[I")
    private final int[] field348 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!client", name = "gf", descriptor = "[I")
    private int[] field349 = new int[9];

    @OriginalMember(owner = "client!client", name = "kf", descriptor = "[Ljava/lang/String;")
    private String[] field352 = new String[5];

    @OriginalMember(owner = "client!client", name = "lf", descriptor = "[Z")
    private boolean[] field353 = new boolean[5];

    @OriginalMember(owner = "client!client", name = "mf", descriptor = "[Ljava/lang/String;")
    private String[] field354 = new String[200];

    @OriginalMember(owner = "client!client", name = "vf", descriptor = "Z")
    private volatile boolean field363 = false;

    @OriginalMember(owner = "client!client", name = "wf", descriptor = "Ljava/lang/String;")
    private String field364 = "";

    @OriginalMember(owner = "client!client", name = "xf", descriptor = "[[I")
    private int[][] field365 = new int[104][104];

    @OriginalMember(owner = "client!client", name = "Ef", descriptor = "I")
    private int field372 = 7;

    @OriginalMember(owner = "client!client", name = "Ff", descriptor = "[LWQACZBNG;")
    private class58[] field373 = new class58[20];

    @OriginalMember(owner = "client!client", name = "Hf", descriptor = "Z")
    private boolean field375 = false;

    @OriginalMember(owner = "client!client", name = "Jf", descriptor = "[I")
    private int[] field377 = new int[200];

    @OriginalMember(owner = "client!client", name = "Pf", descriptor = "[I")
    private int[] field383 = new int[5];

    @OriginalMember(owner = "client!client", name = "Rf", descriptor = "LVGFLNLXH;")
    private class55 field385 = new class55(826);

    @OriginalMember(owner = "client!client", name = "Sf", descriptor = "Z")
    private boolean field386 = false;

    @OriginalMember(owner = "client!client", name = "Wf", descriptor = "Z")
    private boolean field390 = false;

    @OriginalMember(owner = "client!client", name = "Xf", descriptor = "[I")
    public int[] field391 = new int[2000];

    @OriginalMember(owner = "client!client", name = "Zf", descriptor = "Z")
    private boolean field393 = false;

    @OriginalMember(owner = "client!client", name = "gg", descriptor = "Z")
    private boolean field400 = false;

    @OriginalMember(owner = "client!client", name = "mg", descriptor = "Z")
    private boolean field406 = true;

    @OriginalMember(owner = "client!client", name = "pg", descriptor = "Z")
    private volatile boolean field409 = false;

    @OriginalMember(owner = "client!client", name = "qg", descriptor = "I")
    private int field410 = 642;

    @OriginalMember(owner = "client!client", name = "rg", descriptor = "I")
    private int field411 = -11116;

    @OriginalMember(owner = "client!client", name = "vg", descriptor = "Ljava/util/zip/CRC32;")
    private CRC32 field415 = new CRC32();

    @OriginalMember(owner = "client!client", name = "wg", descriptor = "B")
    private byte field416 = 10;

    @OriginalMember(owner = "client!client", name = "Ag", descriptor = "I")
    private int field420 = 7759444;

    @OriginalMember(owner = "client!client", name = "Bg", descriptor = "[I")
    private int[] field421 = new int[class3.field94];

    @OriginalMember(owner = "client!client", name = "Cg", descriptor = "[I")
    private int[] field422 = new int[100];

    @OriginalMember(owner = "client!client", name = "Dg", descriptor = "[Ljava/lang/String;")
    private String[] field423 = new String[100];

    @OriginalMember(owner = "client!client", name = "Eg", descriptor = "[Ljava/lang/String;")
    private String[] field424 = new String[100];

    @OriginalMember(owner = "client!client", name = "Fg", descriptor = "Z")
    private boolean field425 = true;

    @OriginalMember(owner = "client!client", name = "Gg", descriptor = "I")
    private int field426 = 9;

    @OriginalMember(owner = "client!client", name = "Mg", descriptor = "Z")
    private boolean field432 = true;

    @OriginalMember(owner = "client!client", name = "Ng", descriptor = "B")
    private byte field433 = 0;

    @OriginalMember(owner = "client!client", name = "Rg", descriptor = "[LWQACZBNG;")
    private class58[] field437 = new class58[32];

    @OriginalMember(owner = "client!client", name = "Tg", descriptor = "I")
    private int field439 = 1;

    @OriginalMember(owner = "client!client", name = "Vg", descriptor = "[I")
    private int[] field441 = new int[4000];

    @OriginalMember(owner = "client!client", name = "Wg", descriptor = "[I")
    private int[] field442 = new int[4000];

    @OriginalMember(owner = "client!client", name = "Xg", descriptor = "I")
    private int field443 = -1;

    @OriginalMember(owner = "client!client", name = "Zg", descriptor = "[LVEIVHFHZ;")
    private class54[] field445 = new class54[13];

    @OriginalMember(owner = "client!client", name = "bh", descriptor = "I")
    private int field447 = -1;

    @OriginalMember(owner = "client!client", name = "eh", descriptor = "B")
    private byte field450 = 58;

    @OriginalMember(owner = "client!client", name = "fh", descriptor = "I")
    private int field451 = 7558;

    @OriginalMember(owner = "client!client", name = "mh", descriptor = "Z")
    public boolean field458 = false;

    @OriginalMember(owner = "client!client", name = "nh", descriptor = "I")
    private int field459 = -42352;

    @OriginalMember(owner = "client!client", name = "oh", descriptor = "[LWQACZBNG;")
    private class58[] field460 = new class58[100];

    @OriginalMember(owner = "client!client", name = "ph", descriptor = "[LWQACZBNG;")
    private class58[] field461 = new class58[1000];

    @OriginalMember(owner = "client!client", name = "qh", descriptor = "[I")
    private int[] field462 = new int[class3.field94];

    @OriginalMember(owner = "client!client", name = "rh", descriptor = "[[[LVGFLNLXH;")
    private class55[][][] field463 = new class55[4][104][104];

    @OriginalMember(owner = "client!client", name = "th", descriptor = "Ljava/lang/String;")
    private String field465 = "";

    @OriginalMember(owner = "client!client", name = "uh", descriptor = "Ljava/lang/String;")
    private String field466 = "";

    @OriginalMember(owner = "client!client", name = "wh", descriptor = "Z")
    private boolean field468 = false;

    @OriginalMember(owner = "client!client", name = "xh", descriptor = "Z")
    private boolean field469 = false;

    @OriginalMember(owner = "client!client", name = "yh", descriptor = "I")
    private int field470 = 2048;

    @OriginalMember(owner = "client!client", name = "zh", descriptor = "I")
    private int field471 = 2047;

    @OriginalMember(owner = "client!client", name = "Ah", descriptor = "[LTPTANZXN;")
    private class49[] field472 = new class49[this.field470];

    @OriginalMember(owner = "client!client", name = "Ch", descriptor = "[I")
    public int[] field474 = new int[this.field470];

    @OriginalMember(owner = "client!client", name = "Eh", descriptor = "[I")
    private int[] field476 = new int[this.field470];

    @OriginalMember(owner = "client!client", name = "Fh", descriptor = "[LPQBRPYKE;")
    private class41[] field477 = new class41[this.field470];

    @OriginalMember(owner = "client!client", name = "Mh", descriptor = "I")
    private int field484 = 2301979;

    @OriginalMember(owner = "client!client", name = "Nh", descriptor = "[LWQACZBNG;")
    private class58[] field485 = new class58[32];

    @OriginalMember(owner = "client!client", name = "Rh", descriptor = "[Z")
    private boolean[] field489 = new boolean[5];

    @OriginalMember(owner = "client!client", name = "Th", descriptor = "I")
    private int field491 = 15536;

    @OriginalMember(owner = "client!client", name = "Vh", descriptor = "Z")
    private boolean field493 = true;

    @OriginalMember(owner = "client!client", name = "Wh", descriptor = "I")
    private int field494 = 78;

    @OriginalMember(owner = "client!client", name = "bi", descriptor = "I")
    private int field499 = -1;

    @OriginalMember(owner = "client!client", name = "ci", descriptor = "I")
    private int field500 = -1;

    @OriginalMember(owner = "client!client", name = "si", descriptor = "[[[I")
    private int[][][] field516 = new int[4][13][13];

    @OriginalMember(owner = "client!client", name = "vi", descriptor = "I")
    private int field519 = 3353893;

    @OriginalMember(owner = "client!client", name = "wi", descriptor = "[I")
    private int[] field520 = new int[33];

    @OriginalMember(owner = "client!client", name = "xi", descriptor = "B")
    private byte field521 = 106;

    @OriginalMember(owner = "client!client", name = "yi", descriptor = "I")
    private int field522 = 3;

    @OriginalMember(owner = "client!client", name = "Fi", descriptor = "[J")
    private long[] field529 = new long[200];

    @OriginalMember(owner = "client!client", name = "Li", descriptor = "[I")
    private int[] field535 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!client", name = "Ri", descriptor = "B")
    private byte field541 = 100;

    @OriginalMember(owner = "client!client", name = "Ti", descriptor = "I")
    private int field543 = 50;

    @OriginalMember(owner = "client!client", name = "Ui", descriptor = "[I")
    private int[] field544 = new int[this.field543];

    @OriginalMember(owner = "client!client", name = "Vi", descriptor = "[I")
    private int[] field545 = new int[this.field543];

    @OriginalMember(owner = "client!client", name = "Wi", descriptor = "[I")
    private int[] field546 = new int[this.field543];

    @OriginalMember(owner = "client!client", name = "Xi", descriptor = "[I")
    private int[] field547 = new int[this.field543];

    @OriginalMember(owner = "client!client", name = "Yi", descriptor = "[I")
    private int[] field548 = new int[this.field543];

    @OriginalMember(owner = "client!client", name = "Zi", descriptor = "[I")
    private int[] field549 = new int[this.field543];

    @OriginalMember(owner = "client!client", name = "aj", descriptor = "[I")
    private int[] field550 = new int[this.field543];

    @OriginalMember(owner = "client!client", name = "bj", descriptor = "[Ljava/lang/String;")
    private String[] field551 = new String[this.field543];

    @OriginalMember(owner = "client!client", name = "cj", descriptor = "[I")
    private int[] field552 = new int[50];

    @OriginalMember(owner = "client!client", name = "gj", descriptor = "Z")
    private boolean field556 = false;

    @OriginalMember(owner = "client!client", name = "ij", descriptor = "Z")
    private volatile boolean field558 = false;

    @OriginalMember(owner = "client!client", name = "kj", descriptor = "I")
    private int field560 = 3;

    @OriginalMember(owner = "client!client", name = "mj", descriptor = "LPQBRPYKE;")
    private class41 field562 = class41.method328(6, 1);

    @OriginalMember(owner = "client!client", name = "oj", descriptor = "Ljava/lang/String;")
    private String field564 = "";

    @OriginalMember(owner = "client!client", name = "vj", descriptor = "I")
    private int field571 = -1;

    @OriginalMember(owner = "client!client", name = "xj", descriptor = "Z")
    private boolean field573 = false;

    @OriginalMember(owner = "client!client", name = "yj", descriptor = "[I")
    private int[] field574 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!client", name = "Cj", descriptor = "I")
    private int field578 = -234;

    @OriginalMember(owner = "client!client", name = "Dj", descriptor = "[I")
    public int[] field579 = new int[] { 17, 24, 34, 40 };

    @OriginalMember(owner = "client!client", name = "Kj", descriptor = "Z")
    private boolean field586 = false;

    @OriginalMember(owner = "client!client", name = "Lj", descriptor = "[I")
    private int[] field587 = new int[151];

    @OriginalMember(owner = "client!client", name = "Mj", descriptor = "[I")
    private int[] field588 = new int[5];

    @OriginalMember(owner = "client!client", name = "Sj", descriptor = "I")
    private int field594 = -1;

    @OriginalMember(owner = "client!client", name = "Vj", descriptor = "[I")
    public int[] field597 = new int[1000];

    @OriginalMember(owner = "client!client", name = "Xj", descriptor = "Z")
    private boolean field599 = false;

    @OriginalMember(owner = "client!client", name = "Yj", descriptor = "[I")
    private int[] field600 = new int[2000];

    @OriginalMember(owner = "client!client", name = "ak", descriptor = "I")
    private int field602 = 6;

    @OriginalMember(owner = "client!client", name = "bk", descriptor = "I")
    private int field603 = -1;

    @OriginalMember(owner = "client!client", name = "ck", descriptor = "Z")
    private boolean field604 = false;

    @OriginalMember(owner = "client!client", name = "dk", descriptor = "I")
    private int field605 = 128;

    @OriginalMember(owner = "client!client", name = "hk", descriptor = "[I")
    private int[] field609 = new int[5];

    @OriginalMember(owner = "client!client", name = "ik", descriptor = "Z")
    public boolean field610 = true;

    @OriginalMember(owner = "client!client", name = "Lc", descriptor = "[I")
    public static int[] field224 = new int[32];

    @OriginalMember(owner = "client!client", name = "id", descriptor = "I")
    private static int field247;

    @OriginalMember(owner = "client!client", name = "kd", descriptor = "Z")
    private static boolean field249;

    @OriginalMember(owner = "client!client", name = "tf", descriptor = "B")
    private static byte field361;

    @OriginalMember(owner = "client!client", name = "Qf", descriptor = "I")
    private static int field384;

    @OriginalMember(owner = "client!client", name = "Yf", descriptor = "I")
    private static int field392;

    @OriginalMember(owner = "client!client", name = "ah", descriptor = "I")
    private static int field446;

    @OriginalMember(owner = "client!client", name = "lh", descriptor = "Ljava/lang/String;")
    private static String field457;

    @OriginalMember(owner = "client!client", name = "Qh", descriptor = "[I")
    private static int[] field488;

    @OriginalMember(owner = "client!client", name = "Sh", descriptor = "Ljava/math/BigInteger;")
    private static BigInteger field490;

    @OriginalMember(owner = "client!client", name = "ti", descriptor = "[[I")
    public static final int[][] field517;

    @OriginalMember(owner = "client!client", name = "lj", descriptor = "Ljava/math/BigInteger;")
    private static BigInteger field561;

    @OriginalMember(owner = "client!client", name = "uj", descriptor = "I")
    private static int field570;

    @OriginalMember(owner = "client!client", name = "Ej", descriptor = "[I")
    public static final int[] field580;

    @OriginalMember(owner = "client!client", name = "U", descriptor = "I")
    private int field129;

    @OriginalMember(owner = "client!client", name = "V", descriptor = "I")
    private int field130;

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
    private static int field134;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
    private int field139;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
    private int field141;

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
    private int field144;

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
    public int field145;

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "I")
    public int field146;

    @OriginalMember(owner = "client!client", name = "nb", descriptor = "I")
    private int field148;

    @OriginalMember(owner = "client!client", name = "pb", descriptor = "I")
    private int field150;

    @OriginalMember(owner = "client!client", name = "rb", descriptor = "I")
    private int field152;

    @OriginalMember(owner = "client!client", name = "tb", descriptor = "I")
    private int field154;

    @OriginalMember(owner = "client!client", name = "ub", descriptor = "I")
    private int field155;

    @OriginalMember(owner = "client!client", name = "Bb", descriptor = "I")
    private int field162;

    @OriginalMember(owner = "client!client", name = "Eb", descriptor = "I")
    private int field165;

    @OriginalMember(owner = "client!client", name = "Gb", descriptor = "I")
    public int field167;

    @OriginalMember(owner = "client!client", name = "Lb", descriptor = "I")
    private int field172;

    @OriginalMember(owner = "client!client", name = "Pb", descriptor = "I")
    private int field176;

    @OriginalMember(owner = "client!client", name = "Wb", descriptor = "I")
    private int field183;

    @OriginalMember(owner = "client!client", name = "Zb", descriptor = "I")
    private int field186;

    @OriginalMember(owner = "client!client", name = "mc", descriptor = "I")
    private int field199;

    @OriginalMember(owner = "client!client", name = "qc", descriptor = "I")
    private int field203;

    @OriginalMember(owner = "client!client", name = "Cc", descriptor = "I")
    private static int field215;

    @OriginalMember(owner = "client!client", name = "Dc", descriptor = "I")
    private int field216;

    @OriginalMember(owner = "client!client", name = "Ec", descriptor = "I")
    private int field217;

    @OriginalMember(owner = "client!client", name = "Fc", descriptor = "I")
    private int field218;

    @OriginalMember(owner = "client!client", name = "Gc", descriptor = "I")
    private int field219;

    @OriginalMember(owner = "client!client", name = "Hc", descriptor = "I")
    private int field220;

    @OriginalMember(owner = "client!client", name = "Jc", descriptor = "I")
    private int field222;

    @OriginalMember(owner = "client!client", name = "Kc", descriptor = "I")
    private static int field223;

    @OriginalMember(owner = "client!client", name = "Vc", descriptor = "I")
    private int field234;

    @OriginalMember(owner = "client!client", name = "Wc", descriptor = "I")
    private int field235;

    @OriginalMember(owner = "client!client", name = "Xc", descriptor = "I")
    private int field236;

    @OriginalMember(owner = "client!client", name = "Zc", descriptor = "I")
    private int field238;

    @OriginalMember(owner = "client!client", name = "bd", descriptor = "I")
    private int field240;

    @OriginalMember(owner = "client!client", name = "gd", descriptor = "I")
    private int field245;

    @OriginalMember(owner = "client!client", name = "jd", descriptor = "I")
    public static int field248;

    @OriginalMember(owner = "client!client", name = "od", descriptor = "I")
    private int field253;

    @OriginalMember(owner = "client!client", name = "pd", descriptor = "I")
    private int field254;

    @OriginalMember(owner = "client!client", name = "sd", descriptor = "I")
    private static int field257;

    @OriginalMember(owner = "client!client", name = "ud", descriptor = "I")
    private int field259;

    @OriginalMember(owner = "client!client", name = "Bd", descriptor = "I")
    private int field266;

    @OriginalMember(owner = "client!client", name = "Dd", descriptor = "I")
    private int field268;

    @OriginalMember(owner = "client!client", name = "Ed", descriptor = "I")
    private int field269;

    @OriginalMember(owner = "client!client", name = "Fd", descriptor = "I")
    private int field270;

    @OriginalMember(owner = "client!client", name = "Gd", descriptor = "I")
    private int field271;

    @OriginalMember(owner = "client!client", name = "Hd", descriptor = "I")
    private int field272;

    @OriginalMember(owner = "client!client", name = "Id", descriptor = "I")
    private static int field273;

    @OriginalMember(owner = "client!client", name = "Nd", descriptor = "I")
    private int field278;

    @OriginalMember(owner = "client!client", name = "Od", descriptor = "I")
    private int field279;

    @OriginalMember(owner = "client!client", name = "Pd", descriptor = "I")
    private int field280;

    @OriginalMember(owner = "client!client", name = "Qd", descriptor = "I")
    private int field281;

    @OriginalMember(owner = "client!client", name = "Rd", descriptor = "I")
    private int field282;

    @OriginalMember(owner = "client!client", name = "Td", descriptor = "I")
    private int field284;

    @OriginalMember(owner = "client!client", name = "Vd", descriptor = "I")
    private int field286;

    @OriginalMember(owner = "client!client", name = "Xd", descriptor = "I")
    private int field288;

    @OriginalMember(owner = "client!client", name = "Yd", descriptor = "I")
    private int field289;

    @OriginalMember(owner = "client!client", name = "Zd", descriptor = "I")
    private static int field290;

    @OriginalMember(owner = "client!client", name = "ae", descriptor = "I")
    private static int field291;

    @OriginalMember(owner = "client!client", name = "ce", descriptor = "I")
    private static int field293;

    @OriginalMember(owner = "client!client", name = "fe", descriptor = "I")
    private static int field296;

    @OriginalMember(owner = "client!client", name = "oe", descriptor = "I")
    private int field305;

    @OriginalMember(owner = "client!client", name = "pe", descriptor = "I")
    private static int field306;

    @OriginalMember(owner = "client!client", name = "se", descriptor = "I")
    private int field309;

    @OriginalMember(owner = "client!client", name = "te", descriptor = "I")
    private int field310;

    @OriginalMember(owner = "client!client", name = "ue", descriptor = "I")
    private static int field311;

    @OriginalMember(owner = "client!client", name = "ze", descriptor = "I")
    private int field316;

    @OriginalMember(owner = "client!client", name = "Ee", descriptor = "I")
    private int field321;

    @OriginalMember(owner = "client!client", name = "Fe", descriptor = "I")
    private int field322;

    @OriginalMember(owner = "client!client", name = "He", descriptor = "I")
    public static int field324;

    @OriginalMember(owner = "client!client", name = "Le", descriptor = "I")
    private int field328;

    @OriginalMember(owner = "client!client", name = "Me", descriptor = "I")
    private int field329;

    @OriginalMember(owner = "client!client", name = "Ne", descriptor = "I")
    private int field330;

    @OriginalMember(owner = "client!client", name = "Oe", descriptor = "I")
    private int field331;

    @OriginalMember(owner = "client!client", name = "Pe", descriptor = "I")
    private int field332;

    @OriginalMember(owner = "client!client", name = "Qe", descriptor = "I")
    private int field333;

    @OriginalMember(owner = "client!client", name = "Te", descriptor = "I")
    private int field336;

    @OriginalMember(owner = "client!client", name = "Ue", descriptor = "I")
    private int field337;

    @OriginalMember(owner = "client!client", name = "af", descriptor = "I")
    private int field343;

    @OriginalMember(owner = "client!client", name = "df", descriptor = "I")
    private int field346;

    @OriginalMember(owner = "client!client", name = "hf", descriptor = "I")
    private int field350;

    @OriginalMember(owner = "client!client", name = "jf", descriptor = "I")
    private int field351;

    @OriginalMember(owner = "client!client", name = "nf", descriptor = "I")
    private int field355;

    @OriginalMember(owner = "client!client", name = "uf", descriptor = "I")
    private int field362;

    @OriginalMember(owner = "client!client", name = "yf", descriptor = "I")
    private int field366;

    @OriginalMember(owner = "client!client", name = "zf", descriptor = "I")
    private int field367;

    @OriginalMember(owner = "client!client", name = "Af", descriptor = "I")
    private int field368;

    @OriginalMember(owner = "client!client", name = "Bf", descriptor = "I")
    private int field369;

    @OriginalMember(owner = "client!client", name = "Cf", descriptor = "I")
    private static int field370;

    @OriginalMember(owner = "client!client", name = "Df", descriptor = "I")
    private int field371;

    @OriginalMember(owner = "client!client", name = "Gf", descriptor = "I")
    private static int field374;

    @OriginalMember(owner = "client!client", name = "If", descriptor = "I")
    private int field376;

    @OriginalMember(owner = "client!client", name = "Kf", descriptor = "I")
    private int field378;

    @OriginalMember(owner = "client!client", name = "Lf", descriptor = "I")
    private int field379;

    @OriginalMember(owner = "client!client", name = "Mf", descriptor = "I")
    private int field380;

    @OriginalMember(owner = "client!client", name = "Nf", descriptor = "I")
    private int field381;

    @OriginalMember(owner = "client!client", name = "Of", descriptor = "I")
    private int field382;

    @OriginalMember(owner = "client!client", name = "Tf", descriptor = "I")
    private int field387;

    @OriginalMember(owner = "client!client", name = "Uf", descriptor = "I")
    private int field388;

    @OriginalMember(owner = "client!client", name = "Vf", descriptor = "I")
    private int field389;

    @OriginalMember(owner = "client!client", name = "ag", descriptor = "I")
    private int field394;

    @OriginalMember(owner = "client!client", name = "bg", descriptor = "I")
    private int field395;

    @OriginalMember(owner = "client!client", name = "cg", descriptor = "I")
    private int field396;

    @OriginalMember(owner = "client!client", name = "dg", descriptor = "I")
    private int field397;

    @OriginalMember(owner = "client!client", name = "eg", descriptor = "I")
    private int field398;

    @OriginalMember(owner = "client!client", name = "fg", descriptor = "I")
    private int field399;

    @OriginalMember(owner = "client!client", name = "hg", descriptor = "I")
    private int field401;

    @OriginalMember(owner = "client!client", name = "ig", descriptor = "I")
    private int field402;

    @OriginalMember(owner = "client!client", name = "jg", descriptor = "I")
    private int field403;

    @OriginalMember(owner = "client!client", name = "kg", descriptor = "I")
    private int field404;

    @OriginalMember(owner = "client!client", name = "lg", descriptor = "I")
    private int field405;

    @OriginalMember(owner = "client!client", name = "ng", descriptor = "I")
    private int field407;

    @OriginalMember(owner = "client!client", name = "og", descriptor = "I")
    private int field408;

    @OriginalMember(owner = "client!client", name = "ug", descriptor = "I")
    private int field414;

    @OriginalMember(owner = "client!client", name = "Hg", descriptor = "I")
    private int field427;

    @OriginalMember(owner = "client!client", name = "Og", descriptor = "I")
    private int field434;

    @OriginalMember(owner = "client!client", name = "Sg", descriptor = "I")
    private int field438;

    @OriginalMember(owner = "client!client", name = "Ug", descriptor = "I")
    private int field440;

    @OriginalMember(owner = "client!client", name = "Yg", descriptor = "I")
    private int field444;

    @OriginalMember(owner = "client!client", name = "ch", descriptor = "I")
    private int field448;

    @OriginalMember(owner = "client!client", name = "sh", descriptor = "I")
    private static int field464;

    @OriginalMember(owner = "client!client", name = "vh", descriptor = "I")
    private int field467;

    @OriginalMember(owner = "client!client", name = "Bh", descriptor = "I")
    private int field473;

    @OriginalMember(owner = "client!client", name = "Dh", descriptor = "I")
    private int field475;

    @OriginalMember(owner = "client!client", name = "Gh", descriptor = "I")
    private int field478;

    @OriginalMember(owner = "client!client", name = "Hh", descriptor = "I")
    private int field479;

    @OriginalMember(owner = "client!client", name = "Ih", descriptor = "I")
    private int field480;

    @OriginalMember(owner = "client!client", name = "Jh", descriptor = "I")
    private int field481;

    @OriginalMember(owner = "client!client", name = "Lh", descriptor = "I")
    private static int field483;

    @OriginalMember(owner = "client!client", name = "Oh", descriptor = "I")
    private int field486;

    @OriginalMember(owner = "client!client", name = "Ph", descriptor = "I")
    private int field487;

    @OriginalMember(owner = "client!client", name = "Uh", descriptor = "I")
    private int field492;

    @OriginalMember(owner = "client!client", name = "di", descriptor = "I")
    private int field501;

    @OriginalMember(owner = "client!client", name = "gi", descriptor = "I")
    private int field504;

    @OriginalMember(owner = "client!client", name = "hi", descriptor = "I")
    private int field505;

    @OriginalMember(owner = "client!client", name = "ii", descriptor = "I")
    private int field506;

    @OriginalMember(owner = "client!client", name = "ji", descriptor = "I")
    private int field507;

    @OriginalMember(owner = "client!client", name = "ki", descriptor = "I")
    private int field508;

    @OriginalMember(owner = "client!client", name = "li", descriptor = "I")
    private int field509;

    @OriginalMember(owner = "client!client", name = "ni", descriptor = "I")
    private int field511;

    @OriginalMember(owner = "client!client", name = "oi", descriptor = "I")
    private int field512;

    @OriginalMember(owner = "client!client", name = "pi", descriptor = "I")
    private int field513;

    @OriginalMember(owner = "client!client", name = "qi", descriptor = "I")
    private int field514;

    @OriginalMember(owner = "client!client", name = "ri", descriptor = "I")
    private int field515;

    @OriginalMember(owner = "client!client", name = "ui", descriptor = "I")
    private int field518;

    @OriginalMember(owner = "client!client", name = "zi", descriptor = "I")
    private int field523;

    @OriginalMember(owner = "client!client", name = "Ci", descriptor = "I")
    private int field526;

    @OriginalMember(owner = "client!client", name = "Di", descriptor = "I")
    private int field527;

    @OriginalMember(owner = "client!client", name = "Ei", descriptor = "I")
    private static int field528;

    @OriginalMember(owner = "client!client", name = "Gi", descriptor = "I")
    private int field530;

    @OriginalMember(owner = "client!client", name = "Hi", descriptor = "I")
    private int field531;

    @OriginalMember(owner = "client!client", name = "Ii", descriptor = "I")
    private int field532;

    @OriginalMember(owner = "client!client", name = "Ji", descriptor = "I")
    private int field533;

    @OriginalMember(owner = "client!client", name = "Ki", descriptor = "I")
    private int field534;

    @OriginalMember(owner = "client!client", name = "Mi", descriptor = "I")
    private int field536;

    @OriginalMember(owner = "client!client", name = "Ni", descriptor = "I")
    private int field537;

    @OriginalMember(owner = "client!client", name = "Pi", descriptor = "I")
    private int field539;

    @OriginalMember(owner = "client!client", name = "Qi", descriptor = "I")
    private int field540;

    @OriginalMember(owner = "client!client", name = "Si", descriptor = "I")
    private int field542;

    @OriginalMember(owner = "client!client", name = "dj", descriptor = "I")
    private int field553;

    @OriginalMember(owner = "client!client", name = "ej", descriptor = "I")
    private int field554;

    @OriginalMember(owner = "client!client", name = "jj", descriptor = "I")
    private int field559;

    @OriginalMember(owner = "client!client", name = "nj", descriptor = "I")
    private static int field563;

    @OriginalMember(owner = "client!client", name = "wj", descriptor = "I")
    private int field572;

    @OriginalMember(owner = "client!client", name = "Fj", descriptor = "I")
    public static int field581;

    @OriginalMember(owner = "client!client", name = "Nj", descriptor = "I")
    private int field589;

    @OriginalMember(owner = "client!client", name = "Oj", descriptor = "I")
    private int field590;

    @OriginalMember(owner = "client!client", name = "Pj", descriptor = "I")
    private int field591;

    @OriginalMember(owner = "client!client", name = "Qj", descriptor = "I")
    private int field592;

    @OriginalMember(owner = "client!client", name = "Tj", descriptor = "I")
    private int field595;

    @OriginalMember(owner = "client!client", name = "Uj", descriptor = "I")
    private int field596;

    @OriginalMember(owner = "client!client", name = "Wj", descriptor = "I")
    private int field598;

    @OriginalMember(owner = "client!client", name = "ek", descriptor = "I")
    private int field606;

    @OriginalMember(owner = "client!client", name = "fk", descriptor = "I")
    private int field607;

    @OriginalMember(owner = "client!client", name = "gk", descriptor = "I")
    private int field608;

    @OriginalMember(owner = "client!client", name = "jk", descriptor = "I")
    private int field611;

    @OriginalMember(owner = "client!client", name = "kk", descriptor = "I")
    private int field612;

    @OriginalMember(owner = "client!client", name = "lk", descriptor = "I")
    public static int field613;

    @OriginalMember(owner = "client!client", name = "vb", descriptor = "J")
    public long field156;

    @OriginalMember(owner = "client!client", name = "Ve", descriptor = "J")
    private long field338;

    @OriginalMember(owner = "client!client", name = "hj", descriptor = "J")
    private long field557;

    @OriginalMember(owner = "client!client", name = "Gj", descriptor = "J")
    private long field582;

    @OriginalMember(owner = "client!client", name = "Zj", descriptor = "J")
    private long field601;

    @OriginalMember(owner = "client!client", name = "cc", descriptor = "LDRNBRPSO;")
    private class10 field189;

    @OriginalMember(owner = "client!client", name = "dc", descriptor = "LDRNBRPSO;")
    private class10 field190;

    @OriginalMember(owner = "client!client", name = "ec", descriptor = "LDRNBRPSO;")
    private class10 field191;

    @OriginalMember(owner = "client!client", name = "fc", descriptor = "LDRNBRPSO;")
    private class10 field192;

    @OriginalMember(owner = "client!client", name = "gc", descriptor = "LDRNBRPSO;")
    private class10 field193;

    @OriginalMember(owner = "client!client", name = "hc", descriptor = "LDRNBRPSO;")
    private class10 field194;

    @OriginalMember(owner = "client!client", name = "ic", descriptor = "LDRNBRPSO;")
    private class10 field195;

    @OriginalMember(owner = "client!client", name = "jc", descriptor = "LDRNBRPSO;")
    private class10 field196;

    @OriginalMember(owner = "client!client", name = "kc", descriptor = "LDRNBRPSO;")
    private class10 field197;

    @OriginalMember(owner = "client!client", name = "tc", descriptor = "LDRNBRPSO;")
    private class10 field206;

    @OriginalMember(owner = "client!client", name = "uc", descriptor = "LDRNBRPSO;")
    private class10 field207;

    @OriginalMember(owner = "client!client", name = "vc", descriptor = "LDRNBRPSO;")
    private class10 field208;

    @OriginalMember(owner = "client!client", name = "wc", descriptor = "LDRNBRPSO;")
    private class10 field209;

    @OriginalMember(owner = "client!client", name = "xc", descriptor = "LDRNBRPSO;")
    private class10 field210;

    @OriginalMember(owner = "client!client", name = "yc", descriptor = "LDRNBRPSO;")
    private class10 field211;

    @OriginalMember(owner = "client!client", name = "zc", descriptor = "LDRNBRPSO;")
    private class10 field212;

    @OriginalMember(owner = "client!client", name = "Ac", descriptor = "LDRNBRPSO;")
    private class10 field213;

    @OriginalMember(owner = "client!client", name = "Bc", descriptor = "LDRNBRPSO;")
    private class10 field214;

    @OriginalMember(owner = "client!client", name = "Ae", descriptor = "LDRNBRPSO;")
    private class10 field317;

    @OriginalMember(owner = "client!client", name = "Be", descriptor = "LDRNBRPSO;")
    private class10 field318;

    @OriginalMember(owner = "client!client", name = "Ce", descriptor = "LDRNBRPSO;")
    private class10 field319;

    @OriginalMember(owner = "client!client", name = "De", descriptor = "LDRNBRPSO;")
    private class10 field320;

    @OriginalMember(owner = "client!client", name = "Hj", descriptor = "LDRNBRPSO;")
    private class10 field583;

    @OriginalMember(owner = "client!client", name = "Ij", descriptor = "LDRNBRPSO;")
    private class10 field584;

    @OriginalMember(owner = "client!client", name = "Jj", descriptor = "LDRNBRPSO;")
    private class10 field585;

    @OriginalMember(owner = "client!client", name = "xd", descriptor = "LQUPTMIEH;")
    private class42 field262;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "LTPTANZXN;")
    public static class49 field135;

    @OriginalMember(owner = "client!client", name = "Wd", descriptor = "LTVERLIYS;")
    private class51 field287;

    @OriginalMember(owner = "client!client", name = "dh", descriptor = "LUMNOCQQA;")
    private class52 field449;

    @OriginalMember(owner = "client!client", name = "we", descriptor = "LUVFIVFPB;")
    public class53 field313;

    @OriginalMember(owner = "client!client", name = "cd", descriptor = "LVEIVHFHZ;")
    private class54 field241;

    @OriginalMember(owner = "client!client", name = "dd", descriptor = "LVEIVHFHZ;")
    private class54 field242;

    @OriginalMember(owner = "client!client", name = "Jd", descriptor = "LVEIVHFHZ;")
    private class54 field274;

    @OriginalMember(owner = "client!client", name = "Kd", descriptor = "LVEIVHFHZ;")
    private class54 field275;

    @OriginalMember(owner = "client!client", name = "Ld", descriptor = "LVEIVHFHZ;")
    private class54 field276;

    @OriginalMember(owner = "client!client", name = "he", descriptor = "LVEIVHFHZ;")
    private class54 field298;

    @OriginalMember(owner = "client!client", name = "ie", descriptor = "LVEIVHFHZ;")
    private class54 field299;

    @OriginalMember(owner = "client!client", name = "of", descriptor = "LVEIVHFHZ;")
    private class54 field356;

    @OriginalMember(owner = "client!client", name = "pf", descriptor = "LVEIVHFHZ;")
    private class54 field357;

    @OriginalMember(owner = "client!client", name = "qf", descriptor = "LVEIVHFHZ;")
    private class54 field358;

    @OriginalMember(owner = "client!client", name = "rf", descriptor = "LVEIVHFHZ;")
    private class54 field359;

    @OriginalMember(owner = "client!client", name = "sf", descriptor = "LVEIVHFHZ;")
    private class54 field360;

    @OriginalMember(owner = "client!client", name = "xg", descriptor = "LVEIVHFHZ;")
    private class54 field417;

    @OriginalMember(owner = "client!client", name = "yg", descriptor = "LVEIVHFHZ;")
    private class54 field418;

    @OriginalMember(owner = "client!client", name = "zg", descriptor = "LVEIVHFHZ;")
    private class54 field419;

    @OriginalMember(owner = "client!client", name = "pj", descriptor = "LVEIVHFHZ;")
    private class54 field565;

    @OriginalMember(owner = "client!client", name = "qj", descriptor = "LVEIVHFHZ;")
    private class54 field566;

    @OriginalMember(owner = "client!client", name = "rj", descriptor = "LVEIVHFHZ;")
    private class54 field567;

    @OriginalMember(owner = "client!client", name = "sj", descriptor = "LVEIVHFHZ;")
    private class54 field568;

    @OriginalMember(owner = "client!client", name = "tj", descriptor = "LVEIVHFHZ;")
    private class54 field569;

    @OriginalMember(owner = "client!client", name = "Nc", descriptor = "LWQACZBNG;")
    private class58 field226;

    @OriginalMember(owner = "client!client", name = "Oc", descriptor = "LWQACZBNG;")
    private class58 field227;

    @OriginalMember(owner = "client!client", name = "Ie", descriptor = "LWQACZBNG;")
    private class58 field325;

    @OriginalMember(owner = "client!client", name = "Pg", descriptor = "LWQACZBNG;")
    private class58 field435;

    @OriginalMember(owner = "client!client", name = "Qg", descriptor = "LWQACZBNG;")
    private class58 field436;

    @OriginalMember(owner = "client!client", name = "gh", descriptor = "LWQACZBNG;")
    private class58 field452;

    @OriginalMember(owner = "client!client", name = "hh", descriptor = "LWQACZBNG;")
    private class58 field453;

    @OriginalMember(owner = "client!client", name = "ih", descriptor = "LWQACZBNG;")
    private class58 field454;

    @OriginalMember(owner = "client!client", name = "jh", descriptor = "LWQACZBNG;")
    private class58 field455;

    @OriginalMember(owner = "client!client", name = "kh", descriptor = "LWQACZBNG;")
    private class58 field456;

    @OriginalMember(owner = "client!client", name = "ai", descriptor = "LWQACZBNG;")
    private class58 field498;

    @OriginalMember(owner = "client!client", name = "mi", descriptor = "LWQACZBNG;")
    private class58 field510;

    @OriginalMember(owner = "client!client", name = "Ai", descriptor = "LWQACZBNG;")
    private class58 field524;

    @OriginalMember(owner = "client!client", name = "Bi", descriptor = "LWQACZBNG;")
    private class58 field525;

    @OriginalMember(owner = "client!client", name = "Oi", descriptor = "LWQACZBNG;")
    private class58 field538;

    @OriginalMember(owner = "client!client", name = "ye", descriptor = "LWUYFIEBK;")
    private class59 field315;

    @OriginalMember(owner = "client!client", name = "Q", descriptor = "LXOJZVVDK;")
    private class60 field125;

    @OriginalMember(owner = "client!client", name = "Rc", descriptor = "LZFUOSNLM;")
    private class70 field230;

    @OriginalMember(owner = "client!client", name = "Sc", descriptor = "LZFUOSNLM;")
    private class70 field231;

    @OriginalMember(owner = "client!client", name = "Tc", descriptor = "LZFUOSNLM;")
    private class70 field232;

    @OriginalMember(owner = "client!client", name = "Uc", descriptor = "LZFUOSNLM;")
    private class70 field233;

    @OriginalMember(owner = "client!client", name = "ge", descriptor = "Ljava/lang/String;")
    private String field297;

    @OriginalMember(owner = "client!client", name = "cf", descriptor = "Ljava/lang/String;")
    private String field345;

    @OriginalMember(owner = "client!client", name = "Kh", descriptor = "Ljava/lang/String;")
    public String field482;

    @OriginalMember(owner = "client!client", name = "Rj", descriptor = "Ljava/lang/String;")
    public String field593;

    @OriginalMember(owner = "client!client", name = "Se", descriptor = "Ljava/net/Socket;")
    private Socket field335;

    @OriginalMember(owner = "client!client", name = "S", descriptor = "Z")
    public static boolean field127;

    @OriginalMember(owner = "client!client", name = "ld", descriptor = "Z")
    private static boolean field250;

    @OriginalMember(owner = "client!client", name = "ee", descriptor = "Z")
    public static boolean field295;

    @OriginalMember(owner = "client!client", name = "re", descriptor = "Z")
    private static boolean field308;

    @OriginalMember(owner = "client!client", name = "ke", descriptor = "[I")
    private int[] field301;

    @OriginalMember(owner = "client!client", name = "le", descriptor = "[I")
    private int[] field302;

    @OriginalMember(owner = "client!client", name = "me", descriptor = "[I")
    private int[] field303;

    @OriginalMember(owner = "client!client", name = "ne", descriptor = "[I")
    private int[] field304;

    @OriginalMember(owner = "client!client", name = "sg", descriptor = "[I")
    private int[] field412;

    @OriginalMember(owner = "client!client", name = "tg", descriptor = "[I")
    private int[] field413;

    @OriginalMember(owner = "client!client", name = "Ig", descriptor = "[I")
    private int[] field428;

    @OriginalMember(owner = "client!client", name = "Jg", descriptor = "[I")
    private int[] field429;

    @OriginalMember(owner = "client!client", name = "Kg", descriptor = "[I")
    private int[] field430;

    @OriginalMember(owner = "client!client", name = "Lg", descriptor = "[I")
    private int[] field431;

    @OriginalMember(owner = "client!client", name = "Xh", descriptor = "[I")
    private int[] field495;

    @OriginalMember(owner = "client!client", name = "Yh", descriptor = "[I")
    private int[] field496;

    @OriginalMember(owner = "client!client", name = "Zh", descriptor = "[I")
    private int[] field497;

    @OriginalMember(owner = "client!client", name = "zj", descriptor = "[I")
    private int[] field575;

    @OriginalMember(owner = "client!client", name = "Aj", descriptor = "[I")
    private int[] field576;

    @OriginalMember(owner = "client!client", name = "fi", descriptor = "[LVEIVHFHZ;")
    private class54[] field503;

    @OriginalMember(owner = "client!client", name = "ve", descriptor = "[[B")
    private byte[][] field312;

    @OriginalMember(owner = "client!client", name = "Bj", descriptor = "[[B")
    private byte[][] field577;

    @OriginalMember(owner = "client!client", name = "fj", descriptor = "[[[B")
    private byte[][][] field555;

    @OriginalMember(owner = "client!client", name = "ei", descriptor = "[[[I")
    private int[][][] field502;

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
    public final void method16(int arg0) {
        this.field542 = 0;
        for (int var2 = -1; var2 < this.field473 + this.field266; ++var2) {
            class61 var20;
            if (var2 == -1) {
                var20 = field135;
            } else if (var2 < this.field473) {
                var20 = this.field472[this.field474[var2]];
            } else {
                var20 = this.field265[this.field267[var2 - this.field473]];
            }
            if (var20 != null && var20.method442(-40574)) {
                if (var20 instanceof class47) {
                    class29 var21 = ((class47) var20).field1366;
                    if (var21.field1032 != null) {
                        var21 = var21.method266(3);
                    }
                    if (var21 == null) {
                        continue;
                    }
                }
                if (var2 >= this.field473) {
                    class29 var24 = ((class47) var20).field1366;
                    if (var24.field1050 >= 0 && var24.field1050 < this.field485.length) {
                        this.method52(var20.field1648 + 15, 0, var20);
                        if (this.field499 > -1) {
                            this.field485[var24.field1050].method548(this.field500 - 30, this.field499 - 12, this.field578);
                        }
                    }
                    if (this.field501 == 1 && this.field267[var2 - this.field473] == this.field155 && field581 % 20 < 10) {
                        this.method52(var20.field1648 + 15, 0, var20);
                        if (this.field499 > -1) {
                            this.field437[0].method548(this.field500 - 28, this.field499 - 12, this.field578);
                        }
                    }
                } else {
                    int var22 = 30;
                    class49 var23 = (class49) var20;
                    if (var23.field1440 != -1 || var23.field1442 != -1) {
                        this.method52(var20.field1648 + 15, 0, var20);
                        if (this.field499 > -1) {
                            if (var23.field1440 != -1) {
                                this.field327[var23.field1440].method548(this.field500 - var22, this.field499 - 12, this.field578);
                                var22 += 25;
                            }
                            if (var23.field1442 != -1) {
                                this.field485[var23.field1442].method548(this.field500 - var22, this.field499 - 12, this.field578);
                                var22 += 25;
                            }
                        }
                    }
                    if (var2 >= 0 && this.field501 == 10 && this.field474[var2] == this.field144) {
                        this.method52(var20.field1648 + 15, 0, var20);
                        if (this.field499 > -1) {
                            this.field437[1].method548(this.field500 - var22, this.field499 - 12, this.field578);
                        }
                    }
                }
                if (var20.field1658 != null && (var2 >= this.field473 || this.field407 == 0 || this.field407 == 3 || this.field407 == 1 && this.method137((byte) 106, ((class49) var20).field1449))) {
                    this.method52(var20.field1648, 0, var20);
                    if (this.field499 > -1 && this.field542 < this.field543) {
                        this.field547[this.field542] = this.field232.method589(22125, var20.field1658) / 2;
                        this.field546[this.field542] = this.field232.field1743;
                        this.field544[this.field542] = this.field499;
                        this.field545[this.field542] = this.field500;
                        this.field548[this.field542] = var20.field1640;
                        this.field549[this.field542] = var20.field1652;
                        this.field550[this.field542] = var20.field1644;
                        this.field551[this.field542++] = var20.field1658;
                        if (this.field288 == 0 && var20.field1652 >= 1 && var20.field1652 <= 3) {
                            this.field546[this.field542] += 10;
                            this.field545[this.field542] += 5;
                        }
                        if (this.field288 == 0 && var20.field1652 == 4) {
                            this.field547[this.field542] = 60;
                        }
                        if (this.field288 == 0 && var20.field1652 == 5) {
                            this.field546[this.field542] += 5;
                        }
                    }
                }
                if (var20.field1603 > field581) {
                    this.method52(var20.field1648 + 15, 0, var20);
                    if (this.field499 > -1) {
                        int var25 = var20.field1604 * 30 / var20.field1605;
                        if (var25 > 30) {
                            var25 = 30;
                        }
                        class36.method291(this.field499 - 15, var25, 42613, this.field500 - 3, 65280, 5);
                        class36.method291(this.field499 - 15 + var25, 30 - var25, 42613, this.field500 - 3, 16711680, 5);
                    }
                }
                for (int var26 = 0; var26 < 4; ++var26) {
                    if (var20.field1622[var26] > field581) {
                        this.method52(var20.field1648 / 2, 0, var20);
                        if (this.field499 > -1) {
                            if (var26 == 1) {
                                this.field500 -= 20;
                            }
                            if (var26 == 2) {
                                this.field499 -= 15;
                                this.field500 -= 10;
                            }
                            if (var26 == 3) {
                                this.field499 += 15;
                                this.field500 -= 10;
                            }
                            this.field373[var20.field1621[var26]].method548(this.field500 - 12, this.field499 - 12, this.field578);
                            this.field230.method586(String.valueOf(var20.field1620[var26]), this.field499, 8, 0, this.field500 + 4);
                            this.field230.method586(String.valueOf(var20.field1620[var26]), this.field499 - 1, 8, 16777215, this.field500 + 3);
                        }
                    }
                }
            }
        }
        ++field563;
        if (field563 > 1485) {
            field563 = 0;
            this.field132.method329(254, false);
            this.field132.method330(0);
            int var3 = this.field132.field1241;
            this.field132.method330(155);
            this.field132.method331(29543);
            this.field132.method330((int) (Math.random() * 256.0D));
            this.field132.method330((int) (Math.random() * 256.0D));
            this.field132.method330((int) (Math.random() * 256.0D));
            this.field132.method330((int) (Math.random() * 256.0D));
            this.field132.method331(42538);
            this.field132.method330((int) (Math.random() * 256.0D));
            if ((int) (Math.random() * 2.0D) == 0) {
                this.field132.method331(6785);
            }
            if ((int) (Math.random() * 2.0D) == 0) {
                this.field132.method331(34515);
            }
            this.field132.method339(this.field132.field1241 - var3, (byte) 4);
        }
        for (int var4 = 0; var4 < this.field542; ++var4) {
            int var5 = this.field544[var4];
            int var6 = this.field545[var4];
            int var7 = this.field547[var4];
            int var8 = this.field546[var4];
            boolean var9 = true;
            while (var9) {
                var9 = false;
                for (int var19 = 0; var19 < var4; ++var19) {
                    if (var6 + 2 > this.field545[var19] - this.field546[var19] && var6 - var8 < this.field545[var19] + 2 && var5 - var7 < this.field547[var19] + this.field544[var19] && var5 + var7 > this.field544[var19] - this.field547[var19] && this.field545[var19] - this.field546[var19] < var6) {
                        var6 = this.field545[var19] - this.field546[var19];
                        var9 = true;
                    }
                }
            }
            this.field499 = this.field544[var4];
            this.field500 = this.field545[var4] = var6;
            String var10 = this.field551[var4];
            if (this.field288 == 0) {
                int var11 = 16776960;
                if (this.field548[var4] < 6) {
                    var11 = this.field535[this.field548[var4]];
                }
                if (this.field548[var4] == 6) {
                    var11 = this.field350 % 20 < 10 ? 16711680 : 16776960;
                }
                if (this.field548[var4] == 7) {
                    var11 = this.field350 % 20 < 10 ? 255 : 65535;
                }
                if (this.field548[var4] == 8) {
                    var11 = this.field350 % 20 < 10 ? 45056 : 8454016;
                }
                if (this.field548[var4] == 9) {
                    int var12 = 150 - this.field550[var4];
                    if (var12 < 50) {
                        var11 = var12 * 1280 + 16711680;
                    } else if (var12 < 100) {
                        var11 = 16776960 - (var12 - 50) * 327680;
                    } else if (var12 < 150) {
                        var11 = (var12 - 100) * 5 + 65280;
                    }
                }
                if (this.field548[var4] == 10) {
                    int var13 = 150 - this.field550[var4];
                    if (var13 < 50) {
                        var11 = var13 * 5 + 16711680;
                    } else if (var13 < 100) {
                        var11 = 16711935 - (var13 - 50) * 327680;
                    } else if (var13 < 150) {
                        var11 = (var13 - 100) * 327680 + 255 - (var13 - 100) * 5;
                    }
                }
                if (this.field548[var4] == 11) {
                    int var14 = 150 - this.field550[var4];
                    if (var14 < 50) {
                        var11 = 16777215 - var14 * 327685;
                    } else if (var14 < 100) {
                        var11 = (var14 - 50) * 327685 + 65280;
                    } else if (var14 < 150) {
                        var11 = 16777215 - (var14 - 100) * 327680;
                    }
                }
                if (this.field549[var4] == 0) {
                    this.field232.method586(var10, this.field499, 8, 0, this.field500 + 1);
                    this.field232.method586(var10, this.field499, 8, var11, this.field500);
                }
                if (this.field549[var4] == 1) {
                    this.field232.method591(var10, this.field499, 0, this.field350, 0, this.field500 + 1);
                    this.field232.method591(var10, this.field499, var11, this.field350, 0, this.field500);
                }
                if (this.field549[var4] == 2) {
                    this.field232.method592(0, this.field500 + 1, this.field350, var10, (byte) 9, this.field499);
                    this.field232.method592(var11, this.field500, this.field350, var10, (byte) 9, this.field499);
                }
                if (this.field549[var4] == 3) {
                    this.field232.method593(45739, this.field500 + 1, this.field350, var10, 150 - this.field550[var4], this.field499, 0);
                    this.field232.method593(45739, this.field500, this.field350, var10, 150 - this.field550[var4], this.field499, var11);
                }
                if (this.field549[var4] == 4) {
                    int var15 = this.field232.method589(22125, var10);
                    int var16 = (150 - this.field550[var4]) * (var15 + 100) / 150;
                    class36.method288(this.field499 - 50, 334, 0, this.field499 + 50, -586);
                    this.field232.method590(var10, this.field500 + 1, true, 0, this.field499 + 50 - var16);
                    this.field232.method590(var10, this.field500, true, var11, this.field499 + 50 - var16);
                    class36.method287(true);
                }
                if (this.field549[var4] == 5) {
                    int var17 = 150 - this.field550[var4];
                    int var18 = 0;
                    if (var17 < 25) {
                        var18 = var17 - 25;
                    } else if (var17 > 125) {
                        var18 = var17 - 125;
                    }
                    class36.method288(0, this.field500 + 5, this.field500 - this.field232.field1743 - 1, 512, -586);
                    this.field232.method586(var10, this.field499, 8, 0, this.field500 + 1 + var18);
                    this.field232.method586(var10, this.field499, 8, var11, this.field500 + var18);
                    class36.method287(true);
                }
            } else {
                this.field232.method586(var10, this.field499, 8, 0, this.field500 + 1);
                this.field232.method586(var10, this.field499, 8, 16776960, this.field500);
            }
        }
        if (arg0 == 3) {
            ;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IILjava/lang/String;ILjava/lang/String;I)LXOJZVVDK;")
    public final class60 method17(int arg0, int arg1, String arg2, int arg3, String arg4, int arg5) {
        byte[] var7 = null;
        this.field505 += arg3;
        int var8 = 5;
        try {
            if (this.field120[0] != null) {
                var7 = this.field120[0].method568(arg0, false);
            }
        } catch (Exception var30) {
        }
        if (var7 != null) {
            this.field415.reset();
            this.field415.update(var7);
            int var9 = (int) this.field415.getValue();
            if (arg5 != var9) {
                var7 = null;
            }
        }
        if (var7 != null) {
            return new class60(var7, this.field372);
        } else {
            int var11 = 0;
            while (var7 == null) {
                String var12 = "Unknown error";
                this.method55("Requesting " + arg2, false, arg1);
                Object var13 = null;
                try {
                    int var14 = 0;
                    DataInputStream var15 = this.method89(arg4 + arg5);
                    byte[] var16 = new byte[6];
                    var15.readFully(var16, 0, 6);
                    class41 var17 = new class41(888, var16);
                    var17.field1241 = 3;
                    int var18 = var17.method344() + 6;
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
                            this.method55("Loading " + arg2 + " - " + var23 + "%", false, arg1);
                        }
                        var14 = var23;
                    }
                    var15.close();
                    try {
                        if (this.field120[0] != null) {
                            this.field120[0].method569(false, var7, var7.length, arg0);
                        }
                    } catch (Exception var29) {
                        this.field120[0] = null;
                    }
                    if (var7 != null) {
                        this.field415.reset();
                        this.field415.update(var7);
                        int var24 = (int) this.field415.getValue();
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
                            this.method55("Game updated - please reload page", false, arg1);
                            var26 = 10;
                        } else {
                            this.method55(var12 + " - Retrying in " + var26, false, arg1);
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
                    this.field393 = !this.field393;
                }
            }
            return new class60(var7, this.field372);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
    public final void method18(byte arg0) {
        int var2 = this.field378 * 128 + 64;
        int var3 = this.field379 * 128 + 64;
        int var4 = this.method66(this.field183, var3, 6, var2) - this.field380;
        if (this.field511 < var2) {
            this.field511 += (var2 - this.field511) * this.field382 / 1000 + this.field381;
            if (this.field511 > var2) {
                this.field511 = var2;
            }
        }
        if (this.field511 > var2) {
            this.field511 -= (this.field511 - var2) * this.field382 / 1000 + this.field381;
            if (this.field511 < var2) {
                this.field511 = var2;
            }
        }
        if (this.field512 < var4) {
            this.field512 += (var4 - this.field512) * this.field382 / 1000 + this.field381;
            if (this.field512 > var4) {
                this.field512 = var4;
            }
        }
        if (this.field512 > var4) {
            this.field512 -= (this.field512 - var4) * this.field382 / 1000 + this.field381;
            if (this.field512 < var4) {
                this.field512 = var4;
            }
        }
        if (this.field513 < var3) {
            this.field513 += (var3 - this.field513) * this.field382 / 1000 + this.field381;
            if (this.field513 > var3) {
                this.field513 = var3;
            }
        }
        if (this.field513 > var3) {
            this.field513 -= (this.field513 - var3) * this.field382 / 1000 + this.field381;
            if (this.field513 < var3) {
                this.field513 = var3;
            }
        }
        int var5 = this.field394 * 128 + 64;
        if (arg0 != 0) {
            field291 = this.field315.method556();
        }
        int var6 = this.field395 * 128 + 64;
        int var7 = this.method66(this.field183, var6, 6, var5) - this.field396;
        int var8 = var5 - this.field511;
        int var9 = var7 - this.field512;
        int var10 = var6 - this.field513;
        int var11 = (int) Math.sqrt((double) (var8 * var8 + var10 * var10));
        int var12 = (int) (Math.atan2((double) var9, (double) var11) * 325.949D) & 2047;
        int var13 = (int) (Math.atan2((double) var8, (double) var10) * -325.949D) & 2047;
        if (var12 < 128) {
            var12 = 128;
        }
        if (var12 > 383) {
            var12 = 383;
        }
        if (this.field514 < var12) {
            this.field514 += (var12 - this.field514) * this.field398 / 1000 + this.field397;
            if (this.field514 > var12) {
                this.field514 = var12;
            }
        }
        if (this.field514 > var12) {
            this.field514 -= (this.field514 - var12) * this.field398 / 1000 + this.field397;
            if (this.field514 < var12) {
                this.field514 = var12;
            }
        }
        int var14 = var13 - this.field515;
        if (var14 > 1024) {
            var14 -= 2048;
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (var14 > 0) {
            this.field515 += this.field398 * var14 / 1000 + this.field397;
            this.field515 &= 2047;
        }
        if (var14 < 0) {
            this.field515 -= -var14 * this.field398 / 1000 + this.field397;
            this.field515 &= 2047;
        }
        int var15 = var13 - this.field515;
        if (var15 > 1024) {
            var15 -= 2048;
        }
        if (var15 < -1024) {
            var15 += 2048;
        }
        if (var15 < 0 && var14 > 0 || var15 > 0 && var14 < 0) {
            this.field515 = var13;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILPQBRPYKE;I)V")
    public final void method19(int arg0, class41 arg1, int arg2) {
        if (arg0 == -28839) {
            if (arg2 == 124) {
                int var4 = arg1.method368(false);
                int var5 = arg1.method361(this.field186);
                int var6 = (var5 >> 4 & 7) + this.field486;
                int var7 = (var5 & 7) + this.field487;
                if (var6 >= 0 && var7 >= 0 && var6 < 104 && var7 < 104) {
                    class55 var8 = this.field463[this.field183][var6][var7];
                    if (var8 != null) {
                        for (class56 var9 = (class56) var8.method532(); var9 != null; var9 = (class56) var8.method534(-420)) {
                            if ((var4 & 32767) == var9.field1565) {
                                var9.method163();
                                break;
                            }
                        }
                        if (var8.method532() == null) {
                            this.field463[this.field183][var6][var7] = null;
                        }
                        this.method67(var6, var7);
                    }
                }
            } else if (arg2 == 11) {
                int var10 = arg1.method360(6);
                int var11 = (var10 >> 4 & 7) + this.field486;
                int var12 = (var10 & 7) + this.field487;
                int var13 = arg1.method370((byte) 2);
                int var14 = arg1.method359(0);
                int var15 = var14 >> 2;
                int var16 = var14 & 3;
                int var17 = this.field348[var15];
                if (var11 >= 0 && var12 >= 0 && var11 < 103 && var12 < 103) {
                    int var18 = this.field502[this.field183][var11][var12];
                    int var19 = this.field502[this.field183][var11 + 1][var12];
                    int var20 = this.field502[this.field183][var11 + 1][var12 + 1];
                    int var21 = this.field502[this.field183][var11][var12 + 1];
                    if (var17 == 0) {
                        class12 var22 = this.field449.method493((byte) -104, var11, this.field183, var12);
                        if (var22 != null) {
                            int var23 = var22.field678 >> 14 & 32767;
                            if (var15 == 2) {
                                var22.field676 = new class13(var13, var23, 0, var16 + 4, var19, var20, var18, 2, false, var21);
                                var22.field677 = new class13(var13, var23, 0, var16 + 1 & 3, var19, var20, var18, 2, false, var21);
                            } else {
                                var22.field676 = new class13(var13, var23, 0, var16, var19, var20, var18, var15, false, var21);
                            }
                        }
                    }
                    if (var17 == 1) {
                        class11 var24 = this.field449.method494(var12, var11, -44190, this.field183);
                        if (var24 != null) {
                            var24.field668 = new class13(var13, var24.field669 >> 14 & 32767, 0, 0, var19, var20, var18, 4, false, var21);
                        }
                    }
                    if (var17 == 2) {
                        class18 var25 = this.field449.method495(939, var11, var12, this.field183);
                        if (var15 == 11) {
                            var15 = 10;
                        }
                        if (var25 != null) {
                            var25.field851 = new class13(var13, var25.field859 >> 14 & 32767, 0, var16, var19, var20, var18, var15, false, var21);
                        }
                    }
                    if (var17 == 3) {
                        class44 var26 = this.field449.method496(var11, this.field183, (byte) 87, var12);
                        if (var26 != null) {
                            var26.field1327 = new class13(var13, var26.field1328 >> 14 & 32767, 0, var16, var19, var20, var18, 22, false, var21);
                        }
                    }
                }
            } else if (arg2 == 68) {
                int var27 = arg1.method340();
                int var28 = (var27 >> 4 & 7) + this.field486;
                int var29 = (var27 & 7) + this.field487;
                int var30 = arg1.method342();
                int var31 = arg1.method342();
                int var32 = arg1.method342();
                if (var28 >= 0 && var29 >= 0 && var28 < 104 && var29 < 104) {
                    class55 var33 = this.field463[this.field183][var28][var29];
                    if (var33 != null) {
                        for (class56 var34 = (class56) var33.method532(); var34 != null; var34 = (class56) var33.method534(-420)) {
                            if ((var30 & 32767) == var34.field1565 && var34.field1567 == var31) {
                                var34.field1567 = var32;
                                break;
                            }
                        }
                        this.method67(var28, var29);
                    }
                }
            } else if (arg2 == 248) {
                int var35 = arg1.method340();
                int var36 = (var35 >> 4 & 7) + this.field486;
                int var37 = (var35 & 7) + this.field487;
                int var38 = var36 + arg1.method341();
                int var39 = var37 + arg1.method341();
                int var40 = arg1.method343();
                int var41 = arg1.method342();
                int var42 = arg1.method340() * 4;
                int var43 = arg1.method340() * 4;
                int var44 = arg1.method342();
                int var45 = arg1.method342();
                int var46 = arg1.method340();
                int var47 = arg1.method340();
                if (var36 >= 0 && var37 >= 0 && var36 < 104 && var37 < 104 && var38 >= 0 && var39 >= 0 && var38 < 104 && var39 < 104 && var41 != 65535) {
                    int var48 = var36 * 128 + 64;
                    int var49 = var37 * 128 + 64;
                    int var50 = var38 * 128 + 64;
                    int var51 = var39 * 128 + 64;
                    class62 var52 = new class62(var41, this.field183, var48, var40, var49, var46, false, var43, var47, this.method66(this.field183, var49, 6, var48) - var42, field581 + var45, field581 + var44);
                    var52.method566(field581 + var44, var51, 0, this.method66(this.field183, var51, 6, var50) - var43, var50);
                    this.field385.method529(var52);
                }
            } else if (arg2 == 156) {
                int var53 = arg1.method359(0);
                int var54 = var53 >> 2;
                int var55 = var53 & 3;
                int var56 = this.field348[var54];
                int var57 = arg1.method359(0);
                int var58 = (var57 >> 4 & 7) + this.field486;
                int var59 = (var57 & 7) + this.field487;
                if (var58 >= 0 && var59 >= 0 && var58 < 104 && var59 < 104) {
                    this.method81(0, var54, -625, this.field183, -1, var56, var58, var59, var55, -1);
                }
            } else if (arg2 == 183) {
                int var60 = arg1.method342();
                int var61 = arg1.method361(this.field186);
                int var62 = (var61 >> 4 & 7) + this.field486;
                int var63 = (var61 & 7) + this.field487;
                int var64 = arg1.method370((byte) 2);
                int var65 = arg1.method342();
                if (var62 >= 0 && var63 >= 0 && var62 < 104 && var63 < 104 && this.field157 != var64) {
                    class56 var66 = new class56();
                    var66.field1565 = var60;
                    var66.field1567 = var65;
                    if (this.field463[this.field183][var62][var63] == null) {
                        this.field463[this.field183][var62][var63] = new class55(826);
                    }
                    this.field463[this.field183][var62][var63].method529(var66);
                    this.method67(var62, var63);
                }
            } else if (arg2 == 241) {
                int var67 = arg1.method342();
                int var68 = arg1.method370((byte) 2);
                int var69 = arg1.method359(0);
                int var70 = (var69 >> 4 & 7) + this.field486;
                int var71 = (var69 & 7) + this.field487;
                if (var70 >= 0 && var71 >= 0 && var70 < 104 && var71 < 104) {
                    class56 var72 = new class56();
                    var72.field1565 = var68;
                    var72.field1567 = var67;
                    if (this.field463[this.field183][var70][var71] == null) {
                        this.field463[this.field183][var70][var71] = new class55(826);
                    }
                    this.field463[this.field183][var70][var71].method529(var72);
                    this.method67(var70, var71);
                }
            } else {
                if (arg2 == 164) {
                    int var73 = arg1.method370((byte) 2);
                    byte var74 = arg1.method362(0);
                    byte var75 = arg1.method363(true);
                    byte var76 = arg1.method341();
                    int var77 = arg1.method369(759);
                    int var78 = arg1.method340();
                    int var79 = (var78 >> 4 & 7) + this.field486;
                    int var80 = (var78 & 7) + this.field487;
                    int var81 = arg1.method360(6);
                    int var82 = var81 >> 2;
                    int var83 = var81 & 3;
                    int var84 = this.field348[var82];
                    int var85 = arg1.method369(759);
                    byte var86 = arg1.method364(this.field410);
                    int var87 = arg1.method368(false);
                    class49 var88;
                    if (this.field157 == var85) {
                        var88 = field135;
                    } else {
                        var88 = this.field472[var85];
                    }
                    if (var88 != null) {
                        class14 var89 = class14.method196(var87);
                        int var90 = this.field502[this.field183][var79][var80];
                        int var91 = this.field502[this.field183][var79 + 1][var80];
                        int var92 = this.field502[this.field183][var79 + 1][var80 + 1];
                        int var93 = this.field502[this.field183][var79][var80 + 1];
                        class16 var94 = var89.method201(var82, var83, var90, var91, var92, var93, -1);
                        if (var94 != null) {
                            this.method81(var77 + 1, 0, -625, this.field183, var73 + 1, var84, var79, var80, 0, -1);
                            var88.field1426 = field581 + var77;
                            var88.field1427 = field581 + var73;
                            var88.field1437 = var94;
                            int var95 = var89.field702;
                            int var96 = var89.field735;
                            if (var83 == 1 || var83 == 3) {
                                var95 = var89.field735;
                                var96 = var89.field702;
                            }
                            var88.field1434 = var79 * 128 + var95 * 64;
                            var88.field1436 = var80 * 128 + var96 * 64;
                            var88.field1435 = this.method66(this.field183, var88.field1436, 6, var88.field1434);
                            if (var86 > var75) {
                                byte var97 = var86;
                                var86 = var75;
                                var75 = var97;
                            }
                            if (var76 > var74) {
                                byte var98 = var76;
                                var76 = var74;
                                var74 = var98;
                            }
                            var88.field1420 = var79 + var86;
                            var88.field1422 = var75 + var79;
                            var88.field1421 = var76 + var80;
                            var88.field1423 = var74 + var80;
                        }
                    }
                }
                if (arg2 == 121) {
                    int var99 = arg1.method342();
                    int var100 = arg1.method360(6);
                    int var101 = var100 >> 2;
                    int var102 = var100 & 3;
                    int var103 = this.field348[var101];
                    int var104 = arg1.method361(this.field186);
                    int var105 = (var104 >> 4 & 7) + this.field486;
                    int var106 = (var104 & 7) + this.field487;
                    if (var105 >= 0 && var106 >= 0 && var105 < 104 && var106 < 104) {
                        this.method81(0, var101, -625, this.field183, -1, var103, var105, var106, var102, var99);
                    }
                } else {
                    if (arg2 == 245) {
                        int var107 = arg1.method340();
                        int var108 = (var107 >> 4 & 7) + this.field486;
                        int var109 = (var107 & 7) + this.field487;
                        int var110 = arg1.method342();
                        int var111 = arg1.method340();
                        int var112 = var111 >> 4 & 15;
                        int var113 = var111 & 7;
                        if (field135.field1631[0] >= var108 - var112 && field135.field1631[0] <= var108 + var112 && field135.field1632[0] >= var109 - var112 && field135.field1632[0] <= var109 + var112 && this.field425 && !field250 && this.field240 < 50) {
                            this.field552[this.field240] = var110;
                            this.field185[this.field240] = var113;
                            this.field201[this.field240] = class34.field1133[var110];
                            ++this.field240;
                        }
                    }
                    if (arg2 == 252) {
                        int var114 = arg1.method340();
                        int var115 = (var114 >> 4 & 7) + this.field486;
                        int var116 = (var114 & 7) + this.field487;
                        int var117 = arg1.method342();
                        int var118 = arg1.method340();
                        int var119 = arg1.method342();
                        if (var115 >= 0 && var116 >= 0 && var115 < 104 && var116 < 104) {
                            int var120 = var115 * 128 + 64;
                            int var121 = var116 * 128 + 64;
                            class22 var122 = new class22(var119, var117, var120, this.field183, field581, (byte) 3, this.method66(this.field183, var121, 6, var120) - var118, var121);
                            this.field294.method529(var122);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;)V")
    private final void method20(String arg0) {
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

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(BZ)V")
    public final void method21(byte arg0, boolean arg1) {
        if (field135.field1623 >> 7 == this.field536 && field135.field1624 >> 7 == this.field537) {
            this.field536 = 0;
        }
        int var3 = this.field473;
        if (arg1) {
            var3 = 1;
        }
        for (int var4 = 0; var4 < var3; ++var4) {
            class49 var5;
            int var6;
            if (arg1) {
                var5 = field135;
                var6 = this.field471 << 14;
            } else {
                var5 = this.field472[this.field474[var4]];
                var6 = this.field474[var4] << 14;
            }
            if (var5 != null && var5.method442(-40574)) {
                var5.field1446 = false;
                if ((field250 && this.field473 > 50 || this.field473 > 200) && !arg1 && var5.field1641 == var5.field1627) {
                    var5.field1446 = true;
                }
                int var7 = var5.field1623 >> 7;
                int var8 = var5.field1624 >> 7;
                if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                    if (var5.field1437 != null && field581 >= var5.field1426 && field581 < var5.field1427) {
                        var5.field1446 = false;
                        var5.field1447 = this.method66(this.field183, var5.field1624, 6, var5.field1623);
                        this.field449.method483(var5.field1423, var5.field1625, 60, var5.field1624, var5.field1623, var5.field1447, var5.field1420, this.field183, var5.field1421, var6, var5.field1422, (byte) 9, var5);
                    } else {
                        if ((var5.field1623 & 127) == 64 && (var5.field1624 & 127) == 64) {
                            if (this.field229[var7][var8] == this.field350) {
                                continue;
                            }
                            this.field229[var7][var8] = this.field350;
                        }
                        var5.field1447 = this.method66(this.field183, var5.field1624, 6, var5.field1623);
                        this.field449.method482(var6, var5, var5.field1619, this.field183, var5.field1447, 60, 42850, var5.field1623, var5.field1625, var5.field1624);
                    }
                }
            }
        }
        if (arg0 != 58) {
            this.method121();
        }
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
    public final void method22(int arg0) {
        if (this.field147 != arg0) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        while (true) {
            int var3;
            do {
                while (true) {
                    var3 = this.method263(-198);
                    if (var3 == -1) {
                        return;
                    }
                    if (this.field603 != -1 && this.field603 == this.field594) {
                        if (var3 == 8 && this.field564.length() > 0) {
                            this.field564 = this.field564.substring(0, this.field564.length() - 1);
                        }
                        break;
                    }
                    if (this.field166) {
                        if (var3 >= 32 && var3 <= 122 && this.field138.length() < 80) {
                            this.field138 = this.field138 + (char) var3;
                            this.field604 = true;
                        }
                        if (var3 == 8 && this.field138.length() > 0) {
                            this.field138 = this.field138.substring(0, this.field138.length() - 1);
                            this.field604 = true;
                        }
                        if (var3 == 13 || var3 == 10) {
                            this.field166 = false;
                            this.field604 = true;
                            if (this.field440 == 1) {
                                long var4 = class57.method537(this.field138);
                                this.method23(false, var4);
                            }
                            if (this.field440 == 2 && this.field129 > 0) {
                                long var6 = class57.method537(this.field138);
                                this.method134(var6, -637);
                            }
                            if (this.field440 == 3 && this.field138.length() > 0) {
                                this.field132.method329(252, false);
                                this.field132.method330(0);
                                int var8 = this.field132.field1241;
                                this.field132.method336(this.field557, 0);
                                class17.method246(this.field138, this.field132, (byte) 1);
                                this.field132.method339(this.field132.field1241 - var8, (byte) 4);
                                this.field138 = class17.method247(false, this.field138);
                                this.field138 = class46.method413(false, this.field138);
                                this.method102(this.field138, class57.method541(0, class57.method538(this.field557, (byte) 7)), -459, 6);
                                if (this.field362 == 2) {
                                    this.field362 = 1;
                                    this.field339 = true;
                                    this.field132.method329(186, false);
                                    this.field132.method330(this.field407);
                                    this.field132.method330(this.field362);
                                    this.field132.method330(this.field199);
                                }
                            }
                            if (this.field440 == 4 && this.field150 < 100) {
                                long var9 = class57.method537(this.field138);
                                this.method68(var9, false);
                            }
                            if (this.field440 == 5 && this.field150 > 0) {
                                long var11 = class57.method537(this.field138);
                                this.method61(100, var11);
                            }
                        }
                    } else if (this.field526 == 1) {
                        if (var3 >= 48 && var3 <= 57 && this.field122.length() < 10) {
                            this.field122 = this.field122 + (char) var3;
                            this.field604 = true;
                        }
                        if (var3 == 8 && this.field122.length() > 0) {
                            this.field122 = this.field122.substring(0, this.field122.length() - 1);
                            this.field604 = true;
                        }
                        if (var3 == 13 || var3 == 10) {
                            if (this.field122.length() > 0) {
                                int var13 = 0;
                                try {
                                    var13 = Integer.parseInt(this.field122);
                                } catch (Exception var23) {
                                }
                                this.field132.method329(104, false);
                                this.field132.method334(var13);
                            }
                            this.field526 = 0;
                            this.field604 = true;
                        }
                    } else if (this.field526 == 2) {
                        if (var3 >= 32 && var3 <= 122 && this.field122.length() < 12) {
                            this.field122 = this.field122 + (char) var3;
                            this.field604 = true;
                        }
                        if (var3 == 8 && this.field122.length() > 0) {
                            this.field122 = this.field122.substring(0, this.field122.length() - 1);
                            this.field604 = true;
                        }
                        if (var3 == 13 || var3 == 10) {
                            if (this.field122.length() > 0) {
                                this.field132.method329(32, false);
                                this.field132.method336(class57.method537(this.field122), 0);
                            }
                            this.field526 = 0;
                            this.field604 = true;
                        }
                    } else if (this.field526 == 3) {
                        if (var3 >= 32 && var3 <= 122 && this.field122.length() < 40) {
                            this.field122 = this.field122 + (char) var3;
                            this.field604 = true;
                        }
                        if (var3 == 8 && this.field122.length() > 0) {
                            this.field122 = this.field122.substring(0, this.field122.length() - 1);
                            this.field604 = true;
                        }
                    } else if (this.field447 == -1 && this.field252 == -1) {
                        if (var3 >= 32 && var3 <= 122 && this.field364.length() < 80) {
                            this.field364 = this.field364 + (char) var3;
                            this.field604 = true;
                        }
                        if (var3 == 8 && this.field364.length() > 0) {
                            this.field364 = this.field364.substring(0, this.field364.length() - 1);
                            this.field604 = true;
                        }
                        if ((var3 == 13 || var3 == 10) && this.field364.length() > 0) {
                            if (this.field448 == 2) {
                                if (this.field364.equals("::clientdrop")) {
                                    this.method60((byte) -50);
                                }
                                if (this.field364.equals("::lag")) {
                                    this.method152(764);
                                }
                                if (this.field364.equals("::prefetchmusic")) {
                                    for (int var14 = 0; var14 < this.field262.method396(2, -42623); ++var14) {
                                        this.field262.method389(2, 125, (byte) 1, var14);
                                    }
                                }
                                if (this.field364.equals("::fpson")) {
                                    field295 = true;
                                }
                                if (this.field364.equals("::fpsoff")) {
                                    field295 = false;
                                }
                                if (this.field364.equals("::noclip")) {
                                    for (int var15 = 0; var15 < 4; ++var15) {
                                        for (int var16 = 1; var16 < 103; ++var16) {
                                            for (int var17 = 1; var17 < 103; ++var17) {
                                                this.field261[var15].field760[var16][var17] = 0;
                                            }
                                        }
                                    }
                                }
                            }
                            if (this.field364.startsWith("::")) {
                                this.field132.method329(75, false);
                                this.field132.method330(this.field364.length() - 1);
                                this.field132.method337(this.field364.substring(2));
                            } else {
                                String var18 = this.field364.toLowerCase();
                                byte var19 = 0;
                                if (var18.startsWith("yellow:")) {
                                    var19 = 0;
                                    this.field364 = this.field364.substring(7);
                                } else if (var18.startsWith("red:")) {
                                    var19 = 1;
                                    this.field364 = this.field364.substring(4);
                                } else if (var18.startsWith("green:")) {
                                    var19 = 2;
                                    this.field364 = this.field364.substring(6);
                                } else if (var18.startsWith("cyan:")) {
                                    var19 = 3;
                                    this.field364 = this.field364.substring(5);
                                } else if (var18.startsWith("purple:")) {
                                    var19 = 4;
                                    this.field364 = this.field364.substring(7);
                                } else if (var18.startsWith("white:")) {
                                    var19 = 5;
                                    this.field364 = this.field364.substring(6);
                                } else if (var18.startsWith("flash1:")) {
                                    var19 = 6;
                                    this.field364 = this.field364.substring(7);
                                } else if (var18.startsWith("flash2:")) {
                                    var19 = 7;
                                    this.field364 = this.field364.substring(7);
                                } else if (var18.startsWith("flash3:")) {
                                    var19 = 8;
                                    this.field364 = this.field364.substring(7);
                                } else if (var18.startsWith("glow1:")) {
                                    var19 = 9;
                                    this.field364 = this.field364.substring(6);
                                } else if (var18.startsWith("glow2:")) {
                                    var19 = 10;
                                    this.field364 = this.field364.substring(6);
                                } else if (var18.startsWith("glow3:")) {
                                    var19 = 11;
                                    this.field364 = this.field364.substring(6);
                                }
                                String var20 = this.field364.toLowerCase();
                                byte var21 = 0;
                                if (var20.startsWith("wave:")) {
                                    var21 = 1;
                                    this.field364 = this.field364.substring(5);
                                } else if (var20.startsWith("wave2:")) {
                                    var21 = 2;
                                    this.field364 = this.field364.substring(6);
                                } else if (var20.startsWith("shake:")) {
                                    var21 = 3;
                                    this.field364 = this.field364.substring(6);
                                } else if (var20.startsWith("scroll:")) {
                                    var21 = 4;
                                    this.field364 = this.field364.substring(7);
                                } else if (var20.startsWith("slide:")) {
                                    var21 = 5;
                                    this.field364 = this.field364.substring(6);
                                }
                                this.field132.method329(199, false);
                                this.field132.method330(0);
                                int var22 = this.field132.field1241;
                                this.field132.method357(var19, this.field459);
                                this.field264.field1241 = 0;
                                class17.method246(this.field364, this.field264, (byte) 1);
                                this.field132.method338(0, 0, this.field264.field1241, this.field264.field1240);
                                this.field132.method330(var21);
                                this.field132.method339(this.field132.field1241 - var22, (byte) 4);
                                this.field364 = class17.method247(false, this.field364);
                                this.field364 = class46.method413(false, this.field364);
                                field135.field1658 = this.field364;
                                field135.field1640 = var19;
                                field135.field1652 = var21;
                                field135.field1644 = 150;
                                if (this.field448 == 2) {
                                    this.method102(field135.field1658, "@cr2@" + field135.field1449, -459, 2);
                                } else if (this.field448 == 1) {
                                    this.method102(field135.field1658, "@cr1@" + field135.field1449, -459, 2);
                                } else {
                                    this.method102(field135.field1658, field135.field1449, -459, 2);
                                }
                                if (this.field407 == 2) {
                                    this.field407 = 3;
                                    this.field339 = true;
                                    this.field132.method329(186, false);
                                    this.field132.method330(this.field407);
                                    this.field132.method330(this.field362);
                                    this.field132.method330(this.field199);
                                }
                            }
                            this.field364 = "";
                            this.field604 = true;
                        }
                    }
                }
            } while ((var3 < 97 || var3 > 122) && (var3 < 65 || var3 > 90) && (var3 < 48 || var3 > 57) && var3 != 32);
            if (this.field564.length() < 12) {
                this.field564 = this.field564 + (char) var3;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ZJ)V")
    public final void method23(boolean arg0, long arg1) {
        if (arg1 != 0L) {
            if (this.field129 >= 100 && this.field337 != 1) {
                this.method102("Your friendlist is full. Max of 100 for free users, and 200 for members", "", -459, 0);
            } else if (this.field129 >= 200) {
                this.method102("Your friendlist is full. Max of 100 for free users, and 200 for members", "", -459, 0);
            } else {
                String var4 = class57.method541(0, class57.method538(arg1, (byte) 7));
                for (int var5 = 0; var5 < this.field129; ++var5) {
                    if (this.field529[var5] == arg1) {
                        this.method102(var4 + " is already on your friend list", "", -459, 0);
                        return;
                    }
                }
                for (int var6 = 0; var6 < this.field150; ++var6) {
                    if (this.field126[var6] == arg1) {
                        this.method102("Please remove " + var4 + " from your ignore list first", "", -459, 0);
                        return;
                    }
                }
                if (arg0) {
                    this.field463 = null;
                }
                if (!var4.equals(field135.field1449)) {
                    this.field354[this.field129] = var4;
                    this.field529[this.field129] = arg1;
                    this.field377[this.field129] = 0;
                    ++this.field129;
                    this.field400 = true;
                    this.field132.method329(40, false);
                    this.field132.method336(arg1, 0);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IZ)Ljava/lang/String;")
    public final String method24(int arg0, boolean arg1) {
        if (arg1) {
            this.field128 = !this.field128;
        }
        return arg0 < 999999999 ? String.valueOf(arg0) : "*";
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILWQACZBNG;II)V")
    public final void method25(int arg0, class58 arg1, int arg2, int arg3) {
        if (arg1 != null) {
            int var5 = this.field606 + this.field245 & 2047;
            int var6 = arg0 * arg0 + arg3 * arg3;
            if (arg2 >= 0) {
                this.field153 = this.field315.method556();
            }
            if (var6 <= 6400) {
                int var7 = class16.field838[var5];
                int var8 = class16.field839[var5];
                int var9 = var7 * 256 / (this.field438 + 256);
                int var10 = var8 * 256 / (this.field438 + 256);
                int var11 = arg0 * var10 + arg3 * var9 >> 16;
                int var12 = arg3 * var10 - arg0 * var9 >> 16;
                if (var6 > 2500) {
                    arg1.method554(83 - var12 - arg1.field1589 / 2 - 4, false, var11 + 94 - arg1.field1588 / 2 + 4, this.field418);
                } else {
                    arg1.method548(83 - var12 - arg1.field1589 / 2 - 4, var11 + 94 - arg1.field1588 / 2 + 4, this.field578);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
    public final void method26(byte arg0) {
        if (arg0 == 3) {
            this.field598 = 0;
            int var2 = (field135.field1623 >> 7) + this.field401;
            int var3 = (field135.field1624 >> 7) + this.field402;
            if (var2 >= 3053 && var2 <= 3156 && var3 >= 3056 && var3 <= 3136) {
                this.field598 = 1;
            }
            if (var2 >= 3072 && var2 <= 3118 && var3 >= 9492 && var3 <= 9535) {
                this.field598 = 1;
            }
            if (this.field598 == 1 && var2 >= 3139 && var2 <= 3199 && var3 >= 3008 && var3 <= 3062) {
                this.field598 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIIIIZIII)Z")
    public final boolean method27(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9, int arg10, int arg11) {
        byte var13 = 104;
        byte var14 = 104;
        for (int var15 = 0; var15 < var13; ++var15) {
            for (int var39 = 0; var39 < var14; ++var39) {
                this.field365[var15][var39] = 0;
                this.field170[var15][var39] = 99999999;
            }
        }
        int var16 = arg9;
        int var17 = arg4;
        this.field365[arg9][arg4] = 99;
        this.field170[arg9][arg4] = 0;
        byte var18 = 0;
        int var19 = 0;
        this.field441[var18] = arg9;
        int var40 = var18 + 1;
        this.field442[var18] = arg4;
        boolean var20 = false;
        if (arg1 != 6) {
            field392 = 224;
        }
        int var21 = this.field441.length;
        int[][] var22 = this.field261[this.field183].field760;
        while (var40 != var19) {
            var16 = this.field441[var19];
            var17 = this.field442[var19];
            var19 = (var19 + 1) % var21;
            if (arg0 == var16 && arg2 == var17) {
                var20 = true;
                break;
            }
            if (arg10 != 0) {
                if ((arg10 < 5 || arg10 == 10) && this.field261[this.field183].method211((byte) 8, arg2, var16, var17, arg0, arg10 - 1, arg11)) {
                    var20 = true;
                    break;
                }
                if (arg10 < 10 && this.field261[this.field183].method212(arg10 - 1, 4, arg0, arg2, var16, var17, arg11)) {
                    var20 = true;
                    break;
                }
            }
            if (arg5 != 0 && arg7 != 0 && this.field261[this.field183].method213(arg2, arg5, this.field222, var16, arg3, arg7, arg0, var17)) {
                var20 = true;
                break;
            }
            int var38 = this.field170[var16][var17] + 1;
            if (var16 > 0 && this.field365[var16 - 1][var17] == 0 && (var22[var16 - 1][var17] & 19398920) == 0) {
                this.field441[var40] = var16 - 1;
                this.field442[var40] = var17;
                var40 = (var40 + 1) % var21;
                this.field365[var16 - 1][var17] = 2;
                this.field170[var16 - 1][var17] = var38;
            }
            if (var16 < var13 - 1 && this.field365[var16 + 1][var17] == 0 && (var22[var16 + 1][var17] & 19399040) == 0) {
                this.field441[var40] = var16 + 1;
                this.field442[var40] = var17;
                var40 = (var40 + 1) % var21;
                this.field365[var16 + 1][var17] = 8;
                this.field170[var16 + 1][var17] = var38;
            }
            if (var17 > 0 && this.field365[var16][var17 - 1] == 0 && (var22[var16][var17 - 1] & 19398914) == 0) {
                this.field441[var40] = var16;
                this.field442[var40] = var17 - 1;
                var40 = (var40 + 1) % var21;
                this.field365[var16][var17 - 1] = 1;
                this.field170[var16][var17 - 1] = var38;
            }
            if (var17 < var14 - 1 && this.field365[var16][var17 + 1] == 0 && (var22[var16][var17 + 1] & 19398944) == 0) {
                this.field441[var40] = var16;
                this.field442[var40] = var17 + 1;
                var40 = (var40 + 1) % var21;
                this.field365[var16][var17 + 1] = 4;
                this.field170[var16][var17 + 1] = var38;
            }
            if (var16 > 0 && var17 > 0 && this.field365[var16 - 1][var17 - 1] == 0 && (var22[var16 - 1][var17 - 1] & 19398926) == 0 && (var22[var16 - 1][var17] & 19398920) == 0 && (var22[var16][var17 - 1] & 19398914) == 0) {
                this.field441[var40] = var16 - 1;
                this.field442[var40] = var17 - 1;
                var40 = (var40 + 1) % var21;
                this.field365[var16 - 1][var17 - 1] = 3;
                this.field170[var16 - 1][var17 - 1] = var38;
            }
            if (var16 < var13 - 1 && var17 > 0 && this.field365[var16 + 1][var17 - 1] == 0 && (var22[var16 + 1][var17 - 1] & 19399043) == 0 && (var22[var16 + 1][var17] & 19399040) == 0 && (var22[var16][var17 - 1] & 19398914) == 0) {
                this.field441[var40] = var16 + 1;
                this.field442[var40] = var17 - 1;
                var40 = (var40 + 1) % var21;
                this.field365[var16 + 1][var17 - 1] = 9;
                this.field170[var16 + 1][var17 - 1] = var38;
            }
            if (var16 > 0 && var17 < var14 - 1 && this.field365[var16 - 1][var17 + 1] == 0 && (var22[var16 - 1][var17 + 1] & 19398968) == 0 && (var22[var16 - 1][var17] & 19398920) == 0 && (var22[var16][var17 + 1] & 19398944) == 0) {
                this.field441[var40] = var16 - 1;
                this.field442[var40] = var17 + 1;
                var40 = (var40 + 1) % var21;
                this.field365[var16 - 1][var17 + 1] = 6;
                this.field170[var16 - 1][var17 + 1] = var38;
            }
            if (var16 < var13 - 1 && var17 < var14 - 1 && this.field365[var16 + 1][var17 + 1] == 0 && (var22[var16 + 1][var17 + 1] & 19399136) == 0 && (var22[var16 + 1][var17] & 19399040) == 0 && (var22[var16][var17 + 1] & 19398944) == 0) {
                this.field441[var40] = var16 + 1;
                this.field442[var40] = var17 + 1;
                var40 = (var40 + 1) % var21;
                this.field365[var16 + 1][var17 + 1] = 12;
                this.field170[var16 + 1][var17 + 1] = var38;
            }
        }
        this.field559 = 0;
        if (!var20) {
            if (!arg8) {
                return false;
            }
            int var23 = 1000;
            int var24 = 100;
            byte var25 = 10;
            for (int var26 = arg0 - var25; var26 <= arg0 + var25; ++var26) {
                for (int var27 = arg2 - var25; var27 <= arg2 + var25; ++var27) {
                    if (var26 >= 0 && var27 >= 0 && var26 < 104 && var27 < 104 && this.field170[var26][var27] < 100) {
                        int var28 = 0;
                        if (var26 < arg0) {
                            var28 = arg0 - var26;
                        } else if (var26 > arg0 + arg5 - 1) {
                            var28 = var26 - (arg0 + arg5 - 1);
                        }
                        int var29 = 0;
                        if (var27 < arg2) {
                            var29 = arg2 - var27;
                        } else if (var27 > arg2 + arg7 - 1) {
                            var29 = var27 - (arg2 + arg7 - 1);
                        }
                        int var30 = var28 * var28 + var29 * var29;
                        if (var30 < var23 || var23 == var30 && this.field170[var26][var27] < var24) {
                            var23 = var30;
                            var24 = this.field170[var26][var27];
                            var16 = var26;
                            var17 = var27;
                        }
                    }
                }
            }
            if (var23 == 1000) {
                return false;
            }
            if (arg9 == var16 && arg4 == var17) {
                return false;
            }
            this.field559 = 1;
        }
        byte var31 = 0;
        this.field441[var31] = var16;
        int var41 = var31 + 1;
        this.field442[var31] = var17;
        int var32;
        int var33 = var32 = this.field365[var16][var17];
        while (arg9 != var16 || arg4 != var17) {
            if (var32 != var33) {
                var32 = var33;
                this.field441[var41] = var16;
                this.field442[var41++] = var17;
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
            var33 = this.field365[var16][var17];
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
            int var35 = this.field441[var41];
            int var36 = this.field442[var41];
            if (arg6 == 0) {
                this.field132.method329(120, false);
                this.field132.method330(var34 + var34 + 3);
            }
            if (arg6 == 1) {
                this.field132.method329(56, false);
                this.field132.method330(var34 + var34 + 3 + 14);
            }
            if (arg6 == 2) {
                this.field132.method329(70, false);
                this.field132.method330(var34 + var34 + 3);
            }
            this.field132.method367(0, this.field402 + var36);
            this.field536 = this.field441[0];
            this.field537 = this.field442[0];
            for (int var37 = 1; var37 < var34; ++var37) {
                --var41;
                this.field132.method356(this.field441[var41] - var35, this.field433);
                this.field132.method356(this.field442[var41] - var36, this.field433);
            }
            this.field132.method365(this.field401 + var35, (byte) 77);
            this.field132.method358((byte) 2, super.field956[5] == 1 ? 1 : 0);
            return true;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIII)V")
    public final void method28(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field298.method527(arg3, arg4, this.field578);
        this.field299.method527(arg2 + arg3 - 16, arg4, this.field578);
        class36.method291(arg4, 16, 42613, arg3 + 16, this.field484, arg2 - 32);
        int var7 = (arg2 - 32) * arg2 / arg1;
        if (var7 < 8) {
            var7 = 8;
        }
        int var8 = (arg2 - 32 - var7) * arg0 / (arg1 - arg2);
        class36.method291(arg4, 16, 42613, arg3 + 16 + var8, this.field121, var7);
        class36.method296(this.field420, var7, (byte) 79, arg3 + 16 + var8, arg4);
        class36.method296(this.field420, var7, (byte) 79, arg3 + 16 + var8, arg4 + 1);
        class36.method294(arg4, arg3 + 16 + var8, 16, 0, this.field420);
        class36.method294(arg4, arg3 + 17 + var8, 16, 0, this.field420);
        class36.method296(this.field519, var7, (byte) 79, arg3 + 16 + var8, arg4 + 15);
        if (arg5 >= 6 && arg5 <= 6) {
            class36.method296(this.field519, var7 - 1, (byte) 79, arg3 + 17 + var8, arg4 + 14);
            class36.method294(arg4, arg3 + 15 + var8 + var7, 16, 0, this.field519);
            class36.method294(arg4 + 1, arg3 + 14 + var8 + var7, 15, 0, this.field519);
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
    public final void method29(byte arg0) {
        if (arg0 != 8) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        for (int var3 = -1; var3 < this.field473; ++var3) {
            int var4;
            if (var3 == -1) {
                var4 = this.field471;
            } else {
                var4 = this.field474[var3];
            }
            class49 var5 = this.field472[var4];
            if (var5 != null) {
                this.method70(1, var5, 0);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(LVEIVHFHZ;I)V")
    public final void method30(class54 arg0, int arg1) {
        short var3 = 256;
        if (arg1 != 5980) {
            field293 = -489;
        }
        for (int var4 = 0; var4 < this.field412.length; ++var4) {
            this.field412[var4] = 0;
        }
        for (int var5 = 0; var5 < 5000; ++var5) {
            int var17 = (int) (Math.random() * 128.0D * (double) var3);
            this.field412[var17] = (int) (Math.random() * 256.0D);
        }
        for (int var6 = 0; var6 < 20; ++var6) {
            for (int var13 = 1; var13 < var3 - 1; ++var13) {
                for (int var15 = 1; var15 < 127; ++var15) {
                    int var16 = (var13 << 7) + var15;
                    this.field413[var16] = (this.field412[var16 - 1] + this.field412[var16 + 1] + this.field412[var16 - 128] + this.field412[var16 + 128]) / 4;
                }
            }
            int[] var14 = this.field412;
            this.field412 = this.field413;
            this.field413 = var14;
        }
        if (arg0 != null) {
            int var7 = 0;
            for (int var8 = 0; var8 < arg0.field1553; ++var8) {
                for (int var9 = 0; var9 < arg0.field1552; ++var9) {
                    if (arg0.field1550[var7++] != 0) {
                        int var10 = var9 + 16 + arg0.field1554;
                        int var11 = var8 + 16 + arg0.field1555;
                        int var12 = (var11 << 7) + var10;
                        this.field412[var12] = 0;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Z[BI)V")
    public final void method31(boolean arg0, byte[] arg1, int arg2) {
        if (arg2 >= 0) {
            this.field132.method330(176);
        }
        if (this.field406) {
            signlink.midifade = arg0 ? 1 : 0;
            signlink.midisave(arg1, arg1.length);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)V")
    public final void method32(String arg0, String arg1, boolean arg2) {
        signlink.errorname = arg0;
        try {
            if (!arg2) {
                this.field465 = "";
                this.field466 = "Connecting to server...";
                this.method103(-892, true);
            }
            this.field287 = new class51(this.field390, this.method85(field248 + 43594), this);
            long var4 = class57.method537(arg0);
            int var6 = (int) (var4 >> 16 & 31L);
            this.field132.field1241 = 0;
            this.field132.method330(14);
            this.field132.method330(var6);
            this.field287.method468(0, 9, this.field132.field1240, 2);
            for (int var7 = 0; var7 < 8; ++var7) {
                this.field287.method465();
            }
            int var8 = this.field287.method465();
            int var9 = var8;
            if (var8 == 0) {
                this.field287.method467(this.field143.field1240, 0, 8);
                this.field143.field1241 = 0;
                this.field338 = this.field143.method346(false);
                int[] var10 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (this.field338 >> 32), (int) this.field338 };
                this.field132.field1241 = 0;
                this.field132.method330(10);
                this.field132.method334(var10[0]);
                this.field132.method334(var10[1]);
                this.field132.method334(var10[2]);
                this.field132.method334(var10[3]);
                this.field132.method334(signlink.uid);
                this.field132.method337(arg0);
                this.field132.method337(arg1);
                this.field132.method355(field490, field561, false);
                this.field562.field1241 = 0;
                if (arg2) {
                    this.field562.method330(18);
                } else {
                    this.field562.method330(16);
                }
                this.field562.method330(this.field132.field1241 + 36 + 1 + 1 + 2);
                this.field562.method330(255);
                this.field562.method331(374);
                this.field562.method330(field250 ? 1 : 0);
                for (int var11 = 0; var11 < 9; ++var11) {
                    this.field562.method334(this.field349[var11]);
                }
                this.field562.method338(0, 0, this.field132.field1241, this.field132.field1240);
                this.field132.field1245 = new class59(0, var10);
                for (int var12 = 0; var12 < 4; ++var12) {
                    var10[var12] += 50;
                }
                this.field315 = new class59(0, var10);
                this.field287.method468(0, 9, this.field562.field1240, this.field562.field1241);
                var8 = this.field287.method465();
            }
            if (var8 == 1) {
                try {
                    Thread.sleep(2000L);
                } catch (Exception var22) {
                }
                this.method32(arg0, arg1, arg2);
            } else if (var8 == 2) {
                this.field448 = this.field287.method465();
                field127 = this.field287.method465() == 1;
                this.field156 = 0L;
                this.field167 = 0;
                this.field313.field1543 = 0;
                super.field943 = true;
                this.field610 = true;
                this.field458 = true;
                this.field132.field1241 = 0;
                this.field143.field1241 = 0;
                this.field506 = -1;
                this.field387 = -1;
                this.field388 = -1;
                this.field389 = -1;
                this.field505 = 0;
                this.field507 = 0;
                this.field527 = 0;
                this.field509 = 0;
                this.field501 = 0;
                this.field272 = 0;
                this.field173 = false;
                super.field944 = 0;
                for (int var13 = 0; var13 < 100; ++var13) {
                    this.field424[var13] = null;
                }
                this.field589 = 0;
                this.field479 = 0;
                this.field343 = 0;
                this.field240 = 0;
                this.field284 = (int) (Math.random() * 100.0D) - 50;
                this.field139 = (int) (Math.random() * 110.0D) - 55;
                this.field141 = (int) (Math.random() * 80.0D) - 40;
                this.field245 = (int) (Math.random() * 120.0D) - 60;
                this.field438 = (int) (Math.random() * 30.0D) - 20;
                this.field606 = (int) (Math.random() * 20.0D) - 10 & 2047;
                this.field408 = 0;
                this.field334 = -1;
                this.field536 = 0;
                this.field537 = 0;
                this.field473 = 0;
                this.field266 = 0;
                for (int var14 = 0; var14 < this.field470; ++var14) {
                    this.field472[var14] = null;
                    this.field477[var14] = null;
                }
                for (int var15 = 0; var15 < 16384; ++var15) {
                    this.field265[var15] = null;
                }
                field135 = this.field472[this.field471] = new class49();
                this.field385.method536();
                this.field294.method536();
                for (int var16 = 0; var16 < 4; ++var16) {
                    for (int var17 = 0; var17 < 104; ++var17) {
                        for (int var18 = 0; var18 < 104; ++var18) {
                            this.field463[var16][var17][var18] = null;
                        }
                    }
                }
                this.field300 = new class55(826);
                this.field130 = 0;
                this.field129 = 0;
                this.method33(-31, this.field443);
                this.field443 = -1;
                this.method33(-31, this.field447);
                this.field447 = -1;
                this.method33(-31, this.field603);
                this.field603 = -1;
                this.method33(-31, this.field252);
                this.field252 = -1;
                this.method33(-31, this.field184);
                this.field184 = -1;
                this.method33(-31, this.field228);
                this.field228 = -1;
                this.method33(-31, this.field133);
                this.field133 = -1;
                this.field469 = false;
                this.field522 = 3;
                this.field526 = 0;
                this.field173 = false;
                this.field166 = false;
                this.field345 = null;
                this.field595 = 0;
                this.field571 = -1;
                this.field202 = true;
                this.method58(11278);
                for (int var19 = 0; var19 < 5; ++var19) {
                    this.field123[var19] = 0;
                }
                for (int var20 = 0; var20 < 5; ++var20) {
                    this.field352[var20] = null;
                    this.field353[var20] = false;
                }
                field370 = 0;
                field528 = 0;
                field134 = 0;
                field306 = 0;
                field483 = 0;
                field296 = 0;
                field290 = 0;
                field257 = 0;
                field464 = 0;
                field311 = 0;
                this.method91(true);
            } else if (var8 == 3) {
                this.field465 = "";
                this.field466 = "Invalid username or password.";
            } else if (var8 == 4) {
                this.field465 = "Your account has been disabled.";
                this.field466 = "Please check your message-centre for details.";
            } else if (var8 == 5) {
                this.field465 = "Your account is already logged in.";
                this.field466 = "Try again in 60 secs...";
            } else if (var8 == 6) {
                this.field465 = "RuneScape has been updated!";
                this.field466 = "Please reload this page.";
            } else if (var8 == 7) {
                this.field465 = "This world is full.";
                this.field466 = "Please use a different world.";
            } else if (var8 == 8) {
                this.field465 = "Unable to connect.";
                this.field466 = "Login server offline.";
            } else if (var8 == 9) {
                this.field465 = "Login limit exceeded.";
                this.field466 = "Too many connections from your address.";
            } else if (var8 == 10) {
                this.field465 = "Unable to connect.";
                this.field466 = "Bad session id.";
            } else if (var8 == 12) {
                this.field465 = "You need a members account to login to this world.";
                this.field466 = "Please subscribe, or use a different world.";
            } else if (var8 == 13) {
                this.field465 = "Could not complete login.";
                this.field466 = "Please try using a different world.";
            } else if (var8 == 14) {
                this.field465 = "The server is being updated.";
                this.field466 = "Please wait 1 minute and try again.";
            } else if (var8 == 15) {
                this.field458 = true;
                this.field132.field1241 = 0;
                this.field143.field1241 = 0;
                this.field506 = -1;
                this.field387 = -1;
                this.field388 = -1;
                this.field389 = -1;
                this.field505 = 0;
                this.field507 = 0;
                this.field527 = 0;
                this.field272 = 0;
                this.field173 = false;
                this.field601 = System.currentTimeMillis();
            } else if (var8 == 16) {
                this.field465 = "Login attempts exceeded.";
                this.field466 = "Please wait 1 minute and try again.";
            } else if (var8 == 17) {
                this.field465 = "You are standing in a members-only area.";
                this.field466 = "To play on this world move to a free area first";
            } else if (var8 == 20) {
                this.field465 = "Invalid loginserver requested";
                this.field466 = "Please try using a different world.";
            } else if (var8 != 21) {
                if (var8 == 22) {
                    this.field465 = "Malformed login packet.";
                    this.field466 = "Please try again.";
                } else if (var8 == 23) {
                    this.field465 = "No reply from loginserver.";
                    this.field466 = "Please try again.";
                } else if (var8 == 24) {
                    this.field465 = "Error loading your profile.";
                    this.field466 = "Please contact customer support.";
                } else if (var8 == 25) {
                    this.field465 = "Unexpected loginserver response.";
                    this.field466 = "Please try using a different world.";
                } else if (var8 == 26) {
                    this.field465 = "This computers address has been blocked";
                    this.field466 = "as it was used to break our rules";
                } else if (var8 == -1) {
                    if (var9 == 0) {
                        if (this.field154 < 2) {
                            try {
                                Thread.sleep(2000L);
                            } catch (Exception var24) {
                            }
                            ++this.field154;
                            this.method32(arg0, arg1, arg2);
                        } else {
                            this.field465 = "No response from loginserver";
                            this.field466 = "Please wait 1 minute and try again.";
                        }
                    } else {
                        this.field465 = "No response from server";
                        this.field466 = "Please try using a different world.";
                    }
                } else {
                    System.out.println("response:" + var8);
                    this.field465 = "Unexpected server response";
                    this.field466 = "Please try using a different world.";
                }
            } else {
                int var21 = this.field287.method465();
                for (int var26 = var21 + 3; var26 >= 0; --var26) {
                    this.field465 = "You have only just left another world";
                    this.field466 = "Your profile will be transferred in: " + var26;
                    this.method103(-892, true);
                    try {
                        Thread.sleep(1200L);
                    } catch (Exception var23) {
                    }
                }
                this.method32(arg0, arg1, arg2);
            }
        } catch (IOException var25) {
            this.field465 = "";
            this.field466 = "Error connecting to server.";
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V")
    public final void method33(int arg0, int arg1) {
        if (arg0 < 0) {
            class1.method1(-31, arg1);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
    public final void method34(boolean arg0) {
        this.field558 = true;
        try {
            long var2 = System.currentTimeMillis();
            int var4 = 0;
            int var5 = 20;
            while (this.field409) {
                ++this.field369;
                this.method43((byte) 2);
                this.method43((byte) 2);
                this.method79((byte) 3);
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
        this.field558 = false;
        if (!arg0) {
            this.field390 = !this.field390;
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
    public final void method35(boolean arg0) {
        this.field458 &= arg0;
        this.field132.method329(237, false);
        if (this.field228 != -1) {
            this.method33(-31, this.field228);
            this.field228 = -1;
            this.field400 = true;
            this.field469 = false;
            this.field182 = true;
        }
        if (this.field447 != -1) {
            this.method33(-31, this.field447);
            this.field447 = -1;
            this.field604 = true;
            this.field469 = false;
        }
        if (this.field252 != -1) {
            this.method33(-31, this.field252);
            this.field252 = -1;
            this.field468 = true;
        }
        if (this.field184 != -1) {
            this.method33(-31, this.field184);
            this.field184 = -1;
        }
        if (this.field603 != -1) {
            this.method33(-31, this.field603);
            this.field603 = -1;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(LPQBRPYKE;ZI)V")
    private final void method36(class41 arg0, boolean arg1, int arg2) {
        this.field596 = 0;
        this.field475 = 0;
        this.method108(arg2, false, arg0);
        this.method149(arg2, -579, arg0);
        if (arg1) {
            this.method124(0, arg0, arg2);
            this.method128(arg2, arg0, (byte) 5);
            for (int var4 = 0; var4 < this.field596; ++var4) {
                int var6 = this.field597[var4];
                if (field581 != this.field472[var6].field1645) {
                    this.field472[var6] = null;
                }
            }
            if (arg0.field1241 != arg2) {
                signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg0.field1241 + " psize:" + arg2);
                throw new RuntimeException("eek");
            } else {
                for (int var5 = 0; var5 < this.field473; ++var5) {
                    if (this.field472[this.field474[var5]] == null) {
                        signlink.reporterror(this.field204 + " null entry in pl list - pos:" + var5 + " size:" + this.field473);
                        throw new RuntimeException("eek");
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
    public final void method37(int arg0) {
        if (arg0 != 7558) {
            field293 = this.field315.method556();
        }
        if (super.field952 == 1) {
            if (super.field953 >= 6 && super.field953 <= 106 && super.field954 >= 467 && super.field954 <= 499) {
                this.field407 = (this.field407 + 1) % 4;
                this.field339 = true;
                this.field604 = true;
                this.field132.method329(186, false);
                this.field132.method330(this.field407);
                this.field132.method330(this.field362);
                this.field132.method330(this.field199);
            }
            if (super.field953 >= 135 && super.field953 <= 235 && super.field954 >= 467 && super.field954 <= 499) {
                this.field362 = (this.field362 + 1) % 3;
                this.field339 = true;
                this.field604 = true;
                this.field132.method329(186, false);
                this.field132.method330(this.field407);
                this.field132.method330(this.field362);
                this.field132.method330(this.field199);
            }
            if (super.field953 >= 273 && super.field953 <= 373 && super.field954 >= 467 && super.field954 <= 499) {
                this.field199 = (this.field199 + 1) % 3;
                this.field339 = true;
                this.field604 = true;
                this.field132.method329(186, false);
                this.field132.method330(this.field407);
                this.field132.method330(this.field362);
                this.field132.method330(this.field199);
            }
            if (super.field953 >= 412 && super.field953 <= 512 && super.field954 >= 467 && super.field954 <= 499) {
                if (this.field603 == -1) {
                    this.method35(true);
                    this.field564 = "";
                    this.field375 = false;
                    this.field594 = this.field603 = class1.field42;
                    return;
                }
                this.method102("Please close the interface you have open before using 'report abuse'", "", -459, 0);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(LGWDACNJF;Z)V")
    private final void method38(class23 arg0, boolean arg1) {
        if (!arg1) {
            int var3 = 0;
            int var4 = -1;
            int var5 = 0;
            int var6 = 0;
            if (arg0.field903 == 0) {
                var3 = this.field449.method497(arg0.field902, arg0.field904, arg0.field905);
            }
            if (arg0.field903 == 1) {
                var3 = this.field449.method498(arg0.field902, -12848, arg0.field905, arg0.field904);
            }
            if (arg0.field903 == 2) {
                var3 = this.field449.method499(arg0.field902, arg0.field904, arg0.field905);
            }
            if (arg0.field903 == 3) {
                var3 = this.field449.method500(arg0.field902, arg0.field904, arg0.field905);
            }
            if (var3 != 0) {
                int var7 = this.field449.method501(arg0.field902, arg0.field904, arg0.field905, var3);
                var4 = var3 >> 14 & 32767;
                var5 = var7 & 31;
                var6 = var7 >> 6;
            }
            arg0.field899 = var4;
            arg0.field901 = var5;
            arg0.field900 = var6;
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
    public final void method39(int arg0) {
        this.field209 = null;
        this.field210 = null;
        this.field206 = null;
        this.field207 = null;
        this.field208 = null;
        this.field365 = null;
        this.field170 = null;
        this.field441 = null;
        this.field442 = null;
        this.field502 = null;
        this.field555 = null;
        this.field449 = null;
        this.field261 = null;
        this.field495 = null;
        this.field577 = null;
        this.field312 = null;
        this.field496 = null;
        this.field497 = null;
        this.field391 = null;
        this.field472 = null;
        this.field474 = null;
        this.field476 = null;
        this.field477 = null;
        this.field597 = null;
        this.field211 = null;
        this.field212 = null;
        this.field213 = null;
        this.field214 = null;
        this.field445 = null;
        this.field417 = null;
        this.field418 = null;
        this.field419 = null;
        this.field255 = null;
        this.field256 = null;
        this.field461 = null;
        this.field239 = null;
        this.field178 = null;
        this.field179 = null;
        this.field180 = null;
        this.field181 = null;
        this.field225 = null;
        this.method80(-480);
        this.field538 = null;
        this.field385 = null;
        this.field294 = null;
        if (this.field313 != null) {
            this.field313.field1540 = false;
        }
        this.field313 = null;
        this.field193 = null;
        this.field194 = null;
        this.field195 = null;
        this.field196 = null;
        this.field197 = null;
        if (this.field262 != null) {
            this.field262.method394();
        }
        this.field262 = null;
        this.field189 = null;
        if (arg0 != 3) {
            this.field132.method330(134);
        }
        this.field190 = null;
        this.field191 = null;
        this.field192 = null;
        this.field274 = null;
        this.field275 = null;
        this.field276 = null;
        this.field265 = null;
        this.field267 = null;
        this.field565 = null;
        this.field566 = null;
        this.field567 = null;
        this.field568 = null;
        this.field569 = null;
        this.field583 = null;
        this.field584 = null;
        this.field585 = null;
        this.field168 = null;
        this.field460 = null;
        this.field354 = null;
        this.field529 = null;
        this.field377 = null;
        this.field356 = null;
        this.field357 = null;
        this.field358 = null;
        this.field359 = null;
        this.field360 = null;
        this.field264 = null;
        this.field463 = null;
        this.field300 = null;
        this.field229 = null;
        this.field317 = null;
        this.field318 = null;
        this.field319 = null;
        this.field320 = null;
        this.field132 = null;
        this.field562 = null;
        this.field143 = null;
        this.field498 = null;
        try {
            if (this.field287 != null) {
                this.field287.method464();
            }
        } catch (Exception var2) {
        }
        this.field287 = null;
        this.field510 = null;
        this.field373 = null;
        this.field327 = null;
        this.field485 = null;
        this.field437 = null;
        this.field151 = null;
        this.field452 = null;
        this.field453 = null;
        this.field454 = null;
        this.field455 = null;
        this.field456 = null;
        this.method146(33560);
        class14.method191(false);
        class29.method267(false);
        class48.method448(false);
        class1.method3(false);
        class33.field1116 = null;
        class69.field1726 = null;
        class71.field1747 = null;
        class2.field77 = null;
        class38.field1171 = null;
        class38.field1183 = null;
        class6.field104 = null;
        super.field939 = null;
        class49.field1441 = null;
        class39.method306(false);
        class52.method470(false);
        class16.method214(false);
        class37.method300(false);
        System.gc();
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
    public final void method40(byte arg0) {
        if (this.field501 == 2) {
            this.method53((this.field216 - this.field401 << 7) + this.field219, this.field218 * 2, (this.field217 - this.field402 << 7) + this.field220, 0);
            if (arg0 != 22) {
                this.method121();
            }
            if (this.field499 > -1 && field581 % 20 < 10) {
                this.field437[0].method548(this.field500 - 28, this.field499 - 12, this.field578);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
    public final void method41(int arg0) {
        if (this.field206 == null) {
            super.field939 = null;
            this.field320 = null;
            this.field318 = null;
            this.field317 = null;
            this.field319 = null;
            this.field583 = null;
            this.field584 = null;
            this.field585 = null;
            this.field209 = new class10(265, 128, this.method153(-518), 384);
            class36.method289(5);
            this.field210 = new class10(265, 128, this.method153(-518), 384);
            class36.method289(5);
            this.field206 = new class10(171, 509, this.method153(-518), 384);
            class36.method289(5);
            this.field207 = new class10(132, 360, this.method153(-518), 384);
            class36.method289(5);
            this.field208 = new class10(200, 360, this.method153(-518), 384);
            class36.method289(5);
            this.field211 = new class10(238, 202, this.method153(-518), 384);
            class36.method289(5);
            this.field212 = new class10(238, 203, this.method153(-518), 384);
            class36.method289(5);
            this.field213 = new class10(94, 74, this.method153(-518), 384);
            class36.method289(5);
            this.field214 = new class10(94, 75, this.method153(-518), 384);
            if (arg0 < 7 || arg0 > 7) {
                for (int var2 = 1; var2 > 0; ++var2) {
                }
            }
            class36.method289(5);
            if (this.field125 != null) {
                this.method116(false);
                this.method157(16460);
            }
            this.field468 = true;
        }
    }

    @OriginalMember(owner = "client!client", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        if (signlink.mainapp != null) {
            return signlink.mainapp.getCodeBase();
        } else {
            try {
                if (super.field941 != null) {
                    return new URL("http://127.0.0.1:" + (field248 + 80));
                }
            } catch (Exception var1) {
            }
            return super.getCodeBase();
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)V")
    public static final void method42(boolean arg0) {
        class52.field1477 = false;
        class39.field1188 = false;
        field250 = false;
        if (!arg0) {
            field291 = -375;
        }
        class9.field625 = false;
        class14.field744 = false;
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V")
    public final void method43(byte arg0) {
        short var2 = 256;
        for (int var3 = 10; var3 < 117; ++var3) {
            int var18 = (int) (Math.random() * 100.0D);
            if (var18 < 50) {
                this.field575[(var2 - 2 << 7) + var3] = 255;
            }
        }
        for (int var4 = 0; var4 < 100; ++var4) {
            int var15 = (int) (Math.random() * 124.0D) + 2;
            int var16 = (int) (Math.random() * 128.0D) + 128;
            int var17 = (var16 << 7) + var15;
            this.field575[var17] = 192;
        }
        for (int var5 = 1; var5 < var2 - 1; ++var5) {
            for (int var13 = 1; var13 < 127; ++var13) {
                int var14 = (var5 << 7) + var13;
                this.field576[var14] = (this.field575[var14 - 1] + this.field575[var14 + 1] + this.field575[var14 - 128] + this.field575[var14 + 128]) / 4;
            }
        }
        this.field376 += 128;
        if (this.field376 > this.field412.length) {
            this.field376 -= this.field412.length;
            int var6 = (int) (Math.random() * 12.0D);
            this.method30(this.field503[var6], 5980);
        }
        for (int var7 = 1; var7 < var2 - 1; ++var7) {
            for (int var10 = 1; var10 < 127; ++var10) {
                int var11 = (var7 << 7) + var10;
                int var12 = this.field576[var11 + 128] - this.field412[this.field376 + var11 & this.field412.length - 1] / 5;
                if (var12 < 0) {
                    var12 = 0;
                }
                this.field575[var11] = var12;
            }
        }
        if (arg0 != 2) {
            this.field506 = -1;
        }
        for (int var8 = 0; var8 < var2 - 1; ++var8) {
            this.field136[var8] = this.field136[var8 + 1];
        }
        this.field136[var2 - 1] = (int) (Math.sin((double) field581 / 14.0D) * 16.0D + Math.sin((double) field581 / 15.0D) * 14.0D + Math.sin((double) field581 / 16.0D) * 12.0D);
        if (this.field611 > 0) {
            this.field611 -= 4;
        }
        if (this.field612 > 0) {
            this.field612 -= 4;
        }
        if (this.field611 == 0 && this.field612 == 0) {
            int var9 = (int) (Math.random() * 2000.0D);
            if (var9 == 0) {
                this.field611 = 1024;
            }
            if (var9 == 1) {
                this.field612 = 1024;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
    public final void method44(int arg0) {
        if (arg0 > 0) {
            if (field250 && this.field343 == 2 && class9.field645 != this.field183) {
                this.method142((String) null, 462, "Loading - please wait.");
                this.field343 = 1;
                this.field601 = System.currentTimeMillis();
            }
            if (this.field343 == 1) {
                int var2 = this.method45((byte) 8);
                if (var2 != 0 && System.currentTimeMillis() - this.field601 > 360000L) {
                    signlink.reporterror(this.field204 + " glcfb " + this.field338 + "," + var2 + "," + field250 + "," + this.field120[0] + "," + this.field262.method385() + "," + this.field183 + "," + this.field309 + "," + this.field310);
                    this.field601 = System.currentTimeMillis();
                }
            }
            if (this.field343 == 2 && this.field334 != this.field183) {
                this.field334 = this.field183;
                this.method162(-493, this.field183);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(B)I")
    public final int method45(byte arg0) {
        for (int var2 = 0; var2 < this.field577.length; ++var2) {
            if (this.field577[var2] == null && this.field496[var2] != -1) {
                return -1;
            }
            if (this.field312[var2] == null && this.field497[var2] != -1) {
                return -2;
            }
        }
        boolean var3 = true;
        for (int var4 = 0; var4 < this.field577.length; ++var4) {
            byte[] var6 = this.field312[var4];
            if (var6 != null) {
                int var7 = (this.field495[var4] >> 8) * 64 - this.field401;
                int var8 = (this.field495[var4] & 255) * 64 - this.field402;
                if (this.field599) {
                    var7 = 10;
                    var8 = 10;
                }
                var3 &= class9.method178(var7, var8, (byte) 1, var6);
            }
        }
        if (!var3) {
            return -3;
        } else if (this.field573) {
            return -4;
        } else {
            this.field343 = 2;
            class9.field645 = this.field183;
            this.method140((byte) 2);
            this.field132.method329(198, false);
            if (arg0 == 8) {
                boolean var5 = false;
            } else {
                this.field132.method330(117);
            }
            return 0;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IB)V")
    public final void method46(int arg0, byte arg1) {
        if (arg0 >= 0) {
            int var3 = this.field178[arg0];
            int var4 = this.field179[arg0];
            int var5 = this.field180[arg0];
            int var6 = this.field181[arg0];
            if (var5 >= 2000) {
                var5 -= 2000;
            }
            if (this.field526 != 0 && var5 != 1718) {
                this.field526 = 0;
                this.field604 = true;
            }
            if (var5 == 19) {
                class47 var7 = this.field265[var6];
                if (var7 != null) {
                    this.method27(var7.field1631[0], 6, var7.field1632[0], 0, field135.field1632[0], 1, 2, 1, false, field135.field1631[0], 0, 0);
                    this.field279 = super.field953;
                    this.field280 = super.field954;
                    this.field282 = 2;
                    this.field281 = 0;
                    this.field132.method329(148, false);
                    this.field132.method366(this.field244, var6);
                }
            }
            if (var5 == 843) {
                this.field132.method329(72, false);
                this.field132.method331(var4);
                class1 var8 = class1.method4(var4);
                if (var8.field65 != null && var8.field65[0][0] == 5) {
                    int var9 = var8.field65[0][1];
                    if (this.field391[var9] != var8.field35[0]) {
                        this.field391[var9] = var8.field35[0];
                        this.method150(true, var9);
                        this.field400 = true;
                    }
                }
            }
            if (var5 == 1234) {
                this.method136(var6, var3, var4, 6);
                this.field132.method329(0, false);
                this.field132.method366(this.field244, this.field401 + var3);
                this.field132.method366(this.field244, var6 >> 14 & 32767);
                this.field132.method367(0, this.field402 + var4);
            }
            if (var5 == 699) {
                this.method33(-31, this.field443);
                this.field443 = -1;
                this.field604 = true;
            }
            if (var5 == 115) {
                field296 += var6;
                if (field296 >= 132) {
                    this.field132.method329(12, false);
                    this.field132.method333(12545964);
                    field296 = 0;
                }
                this.field132.method329(231, false);
                this.field132.method331(var3);
                this.field132.method365(var4, (byte) 77);
                this.field132.method365(var6, (byte) 77);
                this.field268 = 0;
                this.field269 = var4;
                this.field270 = var3;
                this.field271 = 2;
                if (class1.method4(var4).field8 == this.field603) {
                    this.field271 = 1;
                }
                if (class1.method4(var4).field8 == this.field447) {
                    this.field271 = 3;
                }
            }
            if (var5 == 764) {
                boolean var10 = this.method27(var3, 6, var4, 0, field135.field1632[0], 0, 2, 0, false, field135.field1631[0], 0, 0);
                if (!var10) {
                    this.method27(var3, 6, var4, 0, field135.field1632[0], 1, 2, 1, false, field135.field1631[0], 0, 0);
                }
                this.field279 = super.field953;
                this.field280 = super.field954;
                this.field282 = 2;
                this.field281 = 0;
                this.field132.method329(156, false);
                this.field132.method366(this.field244, this.field401 + var3);
                this.field132.method331(this.field402 + var4);
                this.field132.method367(0, var6);
            }
            if (var5 == 652 && this.method136(var6, var3, var4, 6)) {
                this.field132.method329(251, false);
                this.field132.method331(this.field401 + var3);
                this.field132.method331(this.field402 + var4);
                this.field132.method331(this.field480);
                this.field132.method366(this.field244, var6 >> 14 & 32767);
            }
            if (var5 == 915) {
                this.field132.method329(72, false);
                this.field132.method331(var4);
                class1 var12 = class1.method4(var4);
                if (var12.field65 != null && var12.field65[0][0] == 5) {
                    int var13 = var12.field65[0][1];
                    this.field391[var13] = 1 - this.field391[var13];
                    this.method150(true, var13);
                    this.field400 = true;
                }
            }
            if (var5 == 891) {
                class49 var14 = this.field472[var6];
                if (var14 != null) {
                    this.method27(var14.field1631[0], 6, var14.field1632[0], 0, field135.field1632[0], 1, 2, 1, false, field135.field1631[0], 0, 0);
                    this.field279 = super.field953;
                    this.field280 = super.field954;
                    this.field282 = 2;
                    this.field281 = 0;
                    this.field132.method329(192, false);
                    this.field132.method367(0, this.field480);
                    this.field132.method366(this.field244, var6);
                }
            }
            if (var5 == 464 || var5 == 323) {
                String var15 = this.field225[arg0];
                int var16 = var15.indexOf("@whi@");
                if (var16 != -1) {
                    String var17 = var15.substring(var16 + 5).trim();
                    String var18 = class57.method541(0, class57.method538(class57.method537(var17), (byte) 7));
                    boolean var19 = false;
                    for (int var20 = 0; var20 < this.field473; ++var20) {
                        class49 var21 = this.field472[this.field474[var20]];
                        if (var21 != null && var21.field1449 != null && var21.field1449.equalsIgnoreCase(var18)) {
                            this.method27(var21.field1631[0], 6, var21.field1632[0], 0, field135.field1632[0], 1, 2, 1, false, field135.field1631[0], 0, 0);
                            if (var5 == 464) {
                                this.field132.method329(214, false);
                                this.field132.method331(this.field474[var20]);
                            }
                            if (var5 == 323) {
                                this.field132.method329(121, false);
                                this.field132.method366(this.field244, this.field474[var20]);
                            }
                            var19 = true;
                            break;
                        }
                    }
                    if (!var19) {
                        this.method102("Unable to find " + var18, "", -459, 0);
                    }
                }
            }
            if (var5 == 426) {
                class49 var22 = this.field472[var6];
                if (var22 != null) {
                    this.method27(var22.field1631[0], 6, var22.field1632[0], 0, field135.field1632[0], 1, 2, 1, false, field135.field1631[0], 0, 0);
                    this.field279 = super.field953;
                    this.field280 = super.field954;
                    this.field282 = 2;
                    this.field281 = 0;
                    this.field132.method329(121, false);
                    this.field132.method366(this.field244, var6);
                }
            }
            if (var5 == 155) {
                this.method136(var6, var3, var4, 6);
                this.field132.method329(66, false);
                this.field132.method367(0, this.field402 + var4);
                this.field132.method367(0, var6 >> 14 & 32767);
                this.field132.method366(this.field244, this.field401 + var3);
            }
            if (var5 == 659) {
                class47 var23 = this.field265[var6];
                if (var23 != null) {
                    this.method27(var23.field1631[0], 6, var23.field1632[0], 0, field135.field1632[0], 1, 2, 1, false, field135.field1631[0], 0, 0);
                    this.field279 = super.field953;
                    this.field280 = super.field954;
                    this.field282 = 2;
                    this.field281 = 0;
                    this.field132.method329(170, false);
                    this.field132.method331(var6);
                }
            }
            if (var5 == 247) {
                this.field132.method329(67, false);
                this.field132.method331(var3);
                this.field132.method366(this.field244, this.field591);
                this.field132.method367(0, this.field592);
                this.field132.method331(this.field590);
                this.field132.method331(var6);
                this.field132.method367(0, var4);
                this.field268 = 0;
                this.field269 = var4;
                this.field270 = var3;
                this.field271 = 2;
                if (class1.method4(var4).field8 == this.field603) {
                    this.field271 = 1;
                }
                if (class1.method4(var4).field8 == this.field447) {
                    this.field271 = 3;
                }
            }
            if (var5 == 513) {
                this.method136(var6, var3, var4, 6);
                this.field132.method329(8, false);
                this.field132.method331(this.field402 + var4);
                this.field132.method367(0, this.field401 + var3);
                this.field132.method367(0, var6 >> 14 & 32767);
            }
            if (var5 == 376) {
                String var24 = this.field225[arg0];
                int var25 = var24.indexOf("@whi@");
                if (var25 != -1) {
                    if (this.field603 == -1) {
                        this.method35(true);
                        this.field564 = var24.substring(var25 + 5).trim();
                        this.field375 = false;
                        this.field594 = this.field603 = class1.field42;
                    } else {
                        this.method102("Please close the interface you have open before using 'report abuse'", "", -459, 0);
                    }
                }
            }
            if (var5 == 108) {
                boolean var26 = this.method27(var3, 6, var4, 0, field135.field1632[0], 0, 2, 0, false, field135.field1631[0], 0, 0);
                if (!var26) {
                    this.method27(var3, 6, var4, 0, field135.field1632[0], 1, 2, 1, false, field135.field1631[0], 0, 0);
                }
                this.field279 = super.field953;
                this.field280 = super.field954;
                this.field282 = 2;
                this.field281 = 0;
                this.field132.method329(106, false);
                this.field132.method331(var6);
                this.field132.method365(this.field402 + var4, (byte) 77);
                this.field132.method331(this.field401 + var3);
            }
            if (var5 == 1420) {
                int var28 = var6 >> 14 & 32767;
                class14 var29 = class14.method196(var28);
                String var30;
                if (var29.field718 != null) {
                    var30 = new String(var29.field718);
                } else {
                    var30 = "It's a " + var29.field724 + ".";
                }
                this.method102(var30, "", -459, 0);
            }
            if (var5 == 619) {
                class47 var31 = this.field265[var6];
                if (var31 != null) {
                    this.method27(var31.field1631[0], 6, var31.field1632[0], 0, field135.field1632[0], 1, 2, 1, false, field135.field1631[0], 0, 0);
                    this.field279 = super.field953;
                    this.field280 = super.field954;
                    this.field282 = 2;
                    this.field281 = 0;
                    this.field132.method329(80, false);
                    this.field132.method365(var6, (byte) 77);
                }
            }
            if (var5 == 675 || var5 == 720 || var5 == 360 || var5 == 61) {
                String var32 = this.field225[arg0];
                int var33 = var32.indexOf("@whi@");
                if (var33 != -1) {
                    long var34 = class57.method537(var32.substring(var33 + 5).trim());
                    if (var5 == 675) {
                        this.method23(false, var34);
                    }
                    if (var5 == 720) {
                        this.method68(var34, false);
                    }
                    if (var5 == 360) {
                        this.method134(var34, -637);
                    }
                    if (var5 == 61) {
                        this.method61(100, var34);
                    }
                }
            }
            if (var5 == 21) {
                boolean var36 = this.method27(var3, 6, var4, 0, field135.field1632[0], 0, 2, 0, false, field135.field1631[0], 0, 0);
                if (!var36) {
                    this.method27(var3, 6, var4, 0, field135.field1632[0], 1, 2, 1, false, field135.field1631[0], 0, 0);
                }
                this.field279 = super.field953;
                this.field280 = super.field954;
                this.field282 = 2;
                this.field281 = 0;
                this.field132.method329(246, false);
                this.field132.method367(0, this.field401 + var3);
                this.field132.method366(this.field244, this.field402 + var4);
                this.field132.method367(0, var6);
            }
            if (var5 == 871) {
                field483 += var4;
                if (field483 >= 98) {
                    this.field132.method329(189, false);
                    this.field132.method334(0);
                    field483 = 0;
                }
                this.field132.method329(2, false);
                this.field132.method367(0, var4);
                this.field132.method331(var3);
                this.field132.method331(var6);
                this.field268 = 0;
                this.field269 = var4;
                this.field270 = var3;
                this.field271 = 2;
                if (class1.method4(var4).field8 == this.field603) {
                    this.field271 = 1;
                }
                if (class1.method4(var4).field8 == this.field447) {
                    this.field271 = 3;
                }
            }
            if (var5 == 257) {
                class47 var38 = this.field265[var6];
                if (var38 != null) {
                    this.method27(var38.field1631[0], 6, var38.field1632[0], 0, field135.field1632[0], 1, 2, 1, false, field135.field1631[0], 0, 0);
                    this.field279 = super.field953;
                    this.field280 = super.field954;
                    this.field282 = 2;
                    this.field281 = 0;
                    this.field132.method329(35, false);
                    this.field132.method365(this.field480, (byte) 77);
                    this.field132.method366(this.field244, var6);
                }
            }
            if (var5 == 850) {
                this.field132.method329(48, false);
                this.field132.method365(var6, (byte) 77);
                this.field132.method367(0, var4);
                this.field132.method366(this.field244, var3);
                this.field268 = 0;
                this.field269 = var4;
                this.field270 = var3;
                this.field271 = 2;
                if (class1.method4(var4).field8 == this.field603) {
                    this.field271 = 1;
                }
                if (class1.method4(var4).field8 == this.field447) {
                    this.field271 = 3;
                }
            }
            if (var5 == 1663) {
                class48 var39 = class48.method453(var6);
                String var40;
                if (var39.field1386 != null) {
                    var40 = new String(var39.field1386);
                } else {
                    var40 = "It's a " + var39.field1376 + ".";
                }
                this.method102(var40, "", -459, 0);
            }
            if (var5 == 547) {
                this.field132.method329(225, false);
                this.field132.method365(var4, (byte) 77);
                this.field132.method365(var6, (byte) 77);
                this.field132.method365(var3, (byte) 77);
                this.field268 = 0;
                this.field269 = var4;
                this.field270 = var3;
                this.field271 = 2;
                if (class1.method4(var4).field8 == this.field603) {
                    this.field271 = 1;
                }
                if (class1.method4(var4).field8 == this.field447) {
                    this.field271 = 3;
                }
            }
            if (var5 == 479) {
                this.field132.method329(233, false);
                this.field132.method331(var3);
                this.field132.method367(0, var4);
                this.field132.method366(this.field244, var6);
                this.field268 = 0;
                this.field269 = var4;
                this.field270 = var3;
                this.field271 = 2;
                if (class1.method4(var4).field8 == this.field603) {
                    this.field271 = 1;
                }
                if (class1.method4(var4).field8 == this.field447) {
                    this.field271 = 3;
                }
            }
            if (var5 == 886) {
                class49 var41 = this.field472[var6];
                if (var41 != null) {
                    this.method27(var41.field1631[0], 6, var41.field1632[0], 0, field135.field1632[0], 1, 2, 1, false, field135.field1631[0], 0, 0);
                    this.field279 = super.field953;
                    this.field280 = super.field954;
                    this.field282 = 2;
                    this.field281 = 0;
                    this.field132.method329(211, false);
                    this.field132.method366(this.field244, var6);
                }
            }
            if (var5 == 712) {
                boolean var42 = this.method27(var3, 6, var4, 0, field135.field1632[0], 0, 2, 0, false, field135.field1631[0], 0, 0);
                if (!var42) {
                    this.method27(var3, 6, var4, 0, field135.field1632[0], 1, 2, 1, false, field135.field1631[0], 0, 0);
                }
                this.field279 = super.field953;
                this.field280 = super.field954;
                this.field282 = 2;
                this.field281 = 0;
                this.field132.method329(202, false);
                this.field132.method365(this.field401 + var3, (byte) 77);
                this.field132.method365(this.field402 + var4, (byte) 77);
                this.field132.method366(this.field244, var6);
                this.field132.method367(0, this.field480);
            }
            if (var5 == 268 && !this.field469) {
                this.field132.method329(175, false);
                this.field132.method331(var4);
                this.field469 = true;
            }
            if (var5 == 616) {
                if (!this.field173) {
                    this.field449.method509(5, super.field953 - 4, super.field954 - 4);
                } else {
                    this.field449.method509(5, var3 - 4, var4 - 4);
                }
            }
            if (var5 == 253) {
                this.field589 = 1;
                this.field590 = var3;
                this.field591 = var4;
                this.field592 = var6;
                this.field593 = String.valueOf(class48.method453(var6).field1376);
                this.field479 = 0;
                this.field400 = true;
            } else {
                if (var5 == 670) {
                    field528 += var3;
                    if (field528 >= 85) {
                        this.field132.method329(141, false);
                        this.field132.method331(8034);
                        field528 = 0;
                    }
                    this.field132.method329(99, false);
                    this.field132.method365(var3, (byte) 77);
                    this.field132.method367(0, var6);
                    this.field132.method365(var4, (byte) 77);
                    this.field268 = 0;
                    this.field269 = var4;
                    this.field270 = var3;
                    this.field271 = 2;
                    if (class1.method4(var4).field8 == this.field603) {
                        this.field271 = 1;
                    }
                    if (class1.method4(var4).field8 == this.field447) {
                        this.field271 = 3;
                    }
                }
                if (var5 == 1327) {
                    class48 var44 = class48.method453(var6);
                    class1 var45 = class1.method4(var4);
                    String var46;
                    if (var45 != null && var45.field3[var3] >= 100000) {
                        var46 = var45.field3[var3] + " x " + var44.field1376;
                    } else if (var44.field1386 != null) {
                        var46 = new String(var44.field1386);
                    } else {
                        var46 = "It's a " + var44.field1376 + ".";
                    }
                    this.method102(var46, "", -459, 0);
                }
                if (var5 == 165) {
                    class47 var47 = this.field265[var6];
                    if (var47 != null) {
                        this.method27(var47.field1631[0], 6, var47.field1632[0], 0, field135.field1632[0], 1, 2, 1, false, field135.field1631[0], 0, 0);
                        this.field279 = super.field953;
                        this.field280 = super.field954;
                        this.field282 = 2;
                        this.field281 = 0;
                        field290 += var6;
                        if (field290 >= 58) {
                            this.field132.method329(21, false);
                            this.field132.method330(154);
                            field290 = 0;
                        }
                        this.field132.method329(235, false);
                        this.field132.method331(var6);
                    }
                }
                if (var5 == 940) {
                    this.field132.method329(118, false);
                    this.field132.method365(var3, (byte) 77);
                    this.field132.method365(var4, (byte) 77);
                    this.field132.method365(var6, (byte) 77);
                    this.field268 = 0;
                    this.field269 = var4;
                    this.field270 = var3;
                    this.field271 = 2;
                    if (class1.method4(var4).field8 == this.field603) {
                        this.field271 = 1;
                    }
                    if (class1.method4(var4).field8 == this.field447) {
                        this.field271 = 3;
                    }
                }
                if (var5 == 349) {
                    class1 var48 = class1.method4(var4);
                    boolean var49 = true;
                    if (var48.field26 > 0) {
                        var49 = this.method138(0, var48);
                    }
                    if (var49) {
                        this.field132.method329(72, false);
                        this.field132.method331(var4);
                    }
                }
                if (var5 == 20) {
                    this.method136(var6, var3, var4, 6);
                    this.field132.method329(38, false);
                    this.field132.method331(var6 >> 14 & 32767);
                    this.field132.method367(0, this.field402 + var4);
                    this.field132.method331(this.field401 + var3);
                }
                if (var5 == 857) {
                    class47 var50 = this.field265[var6];
                    if (var50 != null) {
                        this.method27(var50.field1631[0], 6, var50.field1632[0], 0, field135.field1632[0], 1, 2, 1, false, field135.field1631[0], 0, 0);
                        this.field279 = super.field953;
                        this.field280 = super.field954;
                        this.field282 = 2;
                        this.field281 = 0;
                        ++field370;
                        if (field370 >= 85) {
                            this.field132.method329(191, false);
                            this.field132.method331(23198);
                            field370 = 0;
                        }
                        this.field132.method329(187, false);
                        this.field132.method366(this.field244, var6);
                    }
                }
                if (var5 == 330) {
                    boolean var51 = this.method27(var3, 6, var4, 0, field135.field1632[0], 0, 2, 0, false, field135.field1631[0], 0, 0);
                    if (!var51) {
                        this.method27(var3, 6, var4, 0, field135.field1632[0], 1, 2, 1, false, field135.field1631[0], 0, 0);
                    }
                    this.field279 = super.field953;
                    this.field280 = super.field954;
                    this.field282 = 2;
                    this.field281 = 0;
                    this.field132.method329(226, false);
                    this.field132.method365(var6, (byte) 77);
                    this.field132.method367(0, this.field402 + var4);
                    this.field132.method365(this.field401 + var3, (byte) 77);
                }
                if (var5 == 5) {
                    if ((var4 & 3) == 0) {
                        ++field306;
                    }
                    if (field306 >= 68) {
                        this.field132.method329(215, false);
                        field306 = 0;
                    }
                    this.field132.method329(110, false);
                    this.field132.method331(var3);
                    this.field132.method331(var6);
                    this.field132.method365(var4, (byte) 77);
                    this.field268 = 0;
                    this.field269 = var4;
                    this.field270 = var3;
                    this.field271 = 2;
                    if (class1.method4(var4).field8 == this.field603) {
                        this.field271 = 1;
                    }
                    if (class1.method4(var4).field8 == this.field447) {
                        this.field271 = 3;
                    }
                }
                if (var5 == 419) {
                    this.field132.method329(184, false);
                    this.field132.method331(this.field480);
                    this.field132.method331(var4);
                    this.field132.method331(var3);
                    this.field132.method367(0, var6);
                    this.field268 = 0;
                    this.field269 = var4;
                    this.field270 = var3;
                    this.field271 = 2;
                    if (class1.method4(var4).field8 == this.field603) {
                        this.field271 = 1;
                    }
                    if (class1.method4(var4).field8 == this.field447) {
                        this.field271 = 3;
                    }
                }
                if (var5 == 123) {
                    this.field132.method329(139, false);
                    this.field132.method331(var6);
                    this.field132.method367(0, var3);
                    this.field132.method367(0, var4);
                    this.field268 = 0;
                    this.field269 = var4;
                    this.field270 = var3;
                    this.field271 = 2;
                    if (class1.method4(var4).field8 == this.field603) {
                        this.field271 = 1;
                    }
                    if (class1.method4(var4).field8 == this.field447) {
                        this.field271 = 3;
                    }
                }
                if (var5 == 863) {
                    class49 var53 = this.field472[var6];
                    if (var53 != null) {
                        this.method27(var53.field1631[0], 6, var53.field1632[0], 0, field135.field1632[0], 1, 2, 1, false, field135.field1631[0], 0, 0);
                        this.field279 = super.field953;
                        this.field280 = super.field954;
                        this.field282 = 2;
                        this.field281 = 0;
                        this.field132.method329(149, false);
                        this.field132.method365(var6, (byte) 77);
                    }
                }
                if (var5 == 654) {
                    String var54 = this.field225[arg0];
                    int var55 = var54.indexOf("@whi@");
                    if (var55 != -1) {
                        long var56 = class57.method537(var54.substring(var55 + 5).trim());
                        int var58 = -1;
                        for (int var59 = 0; var59 < this.field129; ++var59) {
                            if (this.field529[var59] == var56) {
                                var58 = var59;
                                break;
                            }
                        }
                        if (var58 != -1 && this.field377[var58] > 0) {
                            this.field604 = true;
                            this.field526 = 0;
                            this.field166 = true;
                            this.field138 = "";
                            this.field440 = 3;
                            this.field557 = this.field529[var58];
                            this.field347 = "Enter message to send to " + this.field354[var58];
                        }
                    }
                }
                if (var5 == 826) {
                    ++field134;
                    if (field134 >= 127) {
                        this.field132.method329(103, false);
                        this.field132.method331(56911);
                        field134 = 0;
                    }
                    this.method136(var6, var3, var4, 6);
                    this.field132.method329(203, false);
                    this.field132.method365(this.field401 + var3, (byte) 77);
                    this.field132.method331(this.field402 + var4);
                    this.field132.method366(this.field244, var6 >> 14 & 32767);
                }
                if (var5 == 715) {
                    boolean var60 = this.method27(var3, 6, var4, 0, field135.field1632[0], 0, 2, 0, false, field135.field1631[0], 0, 0);
                    if (!var60) {
                        this.method27(var3, 6, var4, 0, field135.field1632[0], 1, 2, 1, false, field135.field1631[0], 0, 0);
                    }
                    this.field279 = super.field953;
                    this.field280 = super.field954;
                    this.field282 = 2;
                    this.field281 = 0;
                    this.field132.method329(177, false);
                    this.field132.method366(this.field244, this.field401 + var3);
                    this.field132.method367(0, var6);
                    this.field132.method367(0, this.field402 + var4);
                }
                if (var5 == 193) {
                    this.field132.method329(182, false);
                    this.field132.method366(this.field244, var4);
                    this.field132.method367(0, var3);
                    this.field132.method367(0, var6);
                    this.field268 = 0;
                    this.field269 = var4;
                    this.field270 = var3;
                    this.field271 = 2;
                    if (class1.method4(var4).field8 == this.field603) {
                        this.field271 = 1;
                    }
                    if (class1.method4(var4).field8 == this.field447) {
                        this.field271 = 3;
                    }
                }
                if (var5 == 1) {
                    class1 var62 = class1.method4(var4);
                    this.field479 = 1;
                    this.field480 = var4;
                    this.field481 = var62.field19;
                    this.field589 = 0;
                    this.field400 = true;
                    String var63 = var62.field33;
                    if (var63.indexOf(" ") != -1) {
                        var63 = var63.substring(0, var63.indexOf(" "));
                    }
                    String var64 = var62.field33;
                    if (var64.indexOf(" ") != -1) {
                        var64 = var64.substring(var64.indexOf(" ") + 1);
                    }
                    this.field482 = var63 + " " + var62.field64 + " " + var64;
                    if (this.field481 == 16) {
                        this.field400 = true;
                        this.field522 = 3;
                        this.field182 = true;
                    }
                } else {
                    if (var5 == 804 && this.method136(var6, var3, var4, 6)) {
                        this.field132.method329(222, false);
                        this.field132.method331(this.field590);
                        this.field132.method367(0, this.field591);
                        this.field132.method331(this.field402 + var4);
                        this.field132.method365(this.field401 + var3, (byte) 77);
                        this.field132.method367(0, var6 >> 14 & 32767);
                        this.field132.method367(0, this.field592);
                    }
                    if (var5 == 564) {
                        class47 var65 = this.field265[var6];
                        if (var65 != null) {
                            this.method27(var65.field1631[0], 6, var65.field1632[0], 0, field135.field1632[0], 1, 2, 1, false, field135.field1631[0], 0, 0);
                            this.field279 = super.field953;
                            this.field280 = super.field954;
                            this.field282 = 2;
                            this.field281 = 0;
                            this.field132.method329(7, false);
                            this.field132.method366(this.field244, this.field590);
                            this.field132.method366(this.field244, this.field592);
                            this.field132.method366(this.field244, this.field591);
                            this.field132.method331(var6);
                        }
                    }
                    if (var5 == 1505) {
                        class47 var66 = this.field265[var6];
                        if (var66 != null) {
                            class29 var67 = var66.field1366;
                            if (var67.field1032 != null) {
                                var67 = var67.method266(3);
                            }
                            if (var67 != null) {
                                String var68;
                                if (var67.field1041 != null) {
                                    var68 = new String(var67.field1041);
                                } else {
                                    var68 = "It's a " + var67.field1064 + ".";
                                }
                                this.method102(var68, "", -459, 0);
                            }
                        }
                    }
                    if (var5 == 417) {
                        boolean var69 = this.method27(var3, 6, var4, 0, field135.field1632[0], 0, 2, 0, false, field135.field1631[0], 0, 0);
                        if (!var69) {
                            this.method27(var3, 6, var4, 0, field135.field1632[0], 1, 2, 1, false, field135.field1631[0], 0, 0);
                        }
                        this.field279 = super.field953;
                        this.field280 = super.field954;
                        this.field282 = 2;
                        this.field281 = 0;
                        this.field132.method329(86, false);
                        this.field132.method367(0, this.field592);
                        this.field132.method367(0, this.field402 + var4);
                        this.field132.method331(this.field401 + var3);
                        this.field132.method365(this.field590, (byte) 77);
                        this.field132.method331(var6);
                        this.field132.method365(this.field591, (byte) 77);
                    }
                    if (var5 == 266) {
                        class49 var71 = this.field472[var6];
                        if (var71 != null) {
                            this.method27(var71.field1631[0], 6, var71.field1632[0], 0, field135.field1632[0], 1, 2, 1, false, field135.field1631[0], 0, 0);
                            this.field279 = super.field953;
                            this.field280 = super.field954;
                            this.field282 = 2;
                            this.field281 = 0;
                            this.field132.method329(214, false);
                            this.field132.method331(var6);
                        }
                    }
                    if (var5 == 629) {
                        class49 var72 = this.field472[var6];
                        if (var72 != null) {
                            this.method27(var72.field1631[0], 6, var72.field1632[0], 0, field135.field1632[0], 1, 2, 1, false, field135.field1631[0], 0, 0);
                            this.field279 = super.field953;
                            this.field280 = super.field954;
                            this.field282 = 2;
                            this.field281 = 0;
                            field257 += var6;
                            if (field257 >= 115) {
                                this.field132.method329(45, false);
                                this.field132.method333(11222690);
                                field257 = 0;
                            }
                            this.field132.method329(33, false);
                            this.field132.method331(var6);
                        }
                    }
                    if (var5 == 969) {
                        this.method35(true);
                    }
                    if (var5 == 56) {
                        class49 var73 = this.field472[var6];
                        if (var73 != null) {
                            this.method27(var73.field1631[0], 6, var73.field1632[0], 0, field135.field1632[0], 1, 2, 1, false, field135.field1631[0], 0, 0);
                            this.field279 = super.field953;
                            this.field280 = super.field954;
                            this.field282 = 2;
                            this.field281 = 0;
                            this.field132.method329(57, false);
                            this.field132.method331(this.field591);
                            this.field132.method331(var6);
                            this.field132.method331(this.field590);
                            this.field132.method366(this.field244, this.field592);
                        }
                    }
                    this.field589 = 0;
                    if (arg1 == -31) {
                        this.field479 = 0;
                        this.field400 = true;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILATOBWHST;III)V")
    public final void method47(int arg0, class1 arg1, int arg2, int arg3, int arg4) {
        if (arg1.field63 == 0 && arg1.field30 != null) {
            if (!arg1.field44 || this.field328 == arg1.field18 || this.field148 == arg1.field18 || this.field434 == arg1.field18) {
                int var6 = class36.field1154;
                int var7 = class36.field1152;
                int var8 = class36.field1155;
                int var9 = class36.field1153;
                class36.method288(arg3, arg1.field52 + arg4, arg4, arg1.field66 + arg3, -586);
                int var10 = arg1.field30.length;
                for (int var11 = 0; var11 < var10; ++var11) {
                    int var13 = arg1.field57[var11] + arg3;
                    int var14 = arg1.field53[var11] + arg4 - arg0;
                    class1 var15 = class1.method4(arg1.field30[var11]);
                    int var16 = var15.field16 + var13;
                    int var17 = var15.field61 + var14;
                    if (var15.field26 > 0) {
                        this.method129(true, var15);
                    }
                    if (var15.field63 == 0) {
                        if (var15.field62 > var15.field43 - var15.field52) {
                            var15.field62 = var15.field43 - var15.field52;
                        }
                        if (var15.field62 < 0) {
                            var15.field62 = 0;
                        }
                        this.method47(var15.field62, var15, this.field198, var16, var17);
                        if (var15.field43 > var15.field52) {
                            this.method28(var15.field62, var15.field43, var15.field52, var17, var15.field66 + var16, 6);
                        }
                    } else if (var15.field63 != 1) {
                        if (var15.field63 == 2) {
                            int var18 = 0;
                            for (int var19 = 0; var19 < var15.field52; ++var19) {
                                for (int var20 = 0; var20 < var15.field66; ++var20) {
                                    int var21 = (var15.field27 + 32) * var20 + var16;
                                    int var22 = (var15.field50 + 32) * var19 + var17;
                                    if (var18 < 20) {
                                        var21 += var15.field17[var18];
                                        var22 += var15.field20[var18];
                                    }
                                    if (var15.field59[var18] <= 0) {
                                        if (var15.field22 != null && var18 < 20) {
                                            class58 var31 = var15.field22[var18];
                                            if (var31 != null) {
                                                var31.method548(var22, var21, this.field578);
                                            }
                                        }
                                    } else {
                                        int var23 = 0;
                                        int var24 = 0;
                                        int var25 = var15.field59[var18] - 1;
                                        if (var21 > class36.field1154 - 32 && var21 < class36.field1155 && var22 > class36.field1152 - 32 && var22 < class36.field1153 || this.field532 != 0 && this.field531 == var18) {
                                            int var26 = 0;
                                            if (this.field589 == 1 && this.field590 == var18 && this.field591 == var15.field18) {
                                                var26 = 16777215;
                                            }
                                            class58 var27 = class48.method446((byte) 11, var25, var26, var15.field3[var18]);
                                            if (var27 != null) {
                                                if (this.field532 != 0 && this.field531 == var18 && this.field530 == var15.field18) {
                                                    var23 = super.field946 - this.field533;
                                                    var24 = super.field947 - this.field534;
                                                    if (var23 < 5 && var23 > -5) {
                                                        var23 = 0;
                                                    }
                                                    if (var24 < 5 && var24 > -5) {
                                                        var24 = 0;
                                                    }
                                                    if (this.field427 < 5) {
                                                        var23 = 0;
                                                        var24 = 0;
                                                    }
                                                    var27.method550(var21 + var23, 128, var22 + var24, false);
                                                    if (var22 + var24 < class36.field1152 && arg1.field62 > 0) {
                                                        int var28 = (class36.field1152 - var22 - var24) * this.field253 / 3;
                                                        if (var28 > this.field253 * 10) {
                                                            var28 = this.field253 * 10;
                                                        }
                                                        if (var28 > arg1.field62) {
                                                            var28 = arg1.field62;
                                                        }
                                                        arg1.field62 -= var28;
                                                        this.field534 += var28;
                                                    }
                                                    if (var22 + var24 + 32 > class36.field1153 && arg1.field62 < arg1.field43 - arg1.field52) {
                                                        int var29 = (var22 + var24 + 32 - class36.field1153) * this.field253 / 3;
                                                        if (var29 > this.field253 * 10) {
                                                            var29 = this.field253 * 10;
                                                        }
                                                        if (var29 > arg1.field43 - arg1.field52 - arg1.field62) {
                                                            var29 = arg1.field43 - arg1.field52 - arg1.field62;
                                                        }
                                                        arg1.field62 += var29;
                                                        this.field534 -= var29;
                                                    }
                                                } else if (this.field271 != 0 && this.field270 == var18 && this.field269 == var15.field18) {
                                                    var27.method550(var21, 128, var22, false);
                                                } else {
                                                    var27.method548(var22, var21, this.field578);
                                                }
                                                if (var27.field1588 == 33 || var15.field3[var18] != 1) {
                                                    int var30 = var15.field3[var18];
                                                    this.field230.method590(method64(var30, (byte) -2), var22 + 10 + var24, true, 0, var21 + 1 + var23);
                                                    this.field230.method590(method64(var30, (byte) -2), var22 + 9 + var24, true, 16776960, var21 + var23);
                                                }
                                            }
                                        }
                                    }
                                    ++var18;
                                }
                            }
                        } else if (var15.field63 == 3) {
                            boolean var32 = false;
                            if (this.field434 == var15.field18 || this.field148 == var15.field18 || this.field328 == var15.field18) {
                                var32 = true;
                            }
                            int var33;
                            if (this.method86(var15, 5)) {
                                var33 = var15.field6;
                                if (var32 && var15.field48 != 0) {
                                    var33 = var15.field48;
                                }
                            } else {
                                var33 = var15.field51;
                                if (var32 && var15.field74 != 0) {
                                    var33 = var15.field74;
                                }
                            }
                            if (var15.field37 == 0) {
                                if (var15.field72) {
                                    class36.method291(var16, var15.field66, 42613, var17, var33, var15.field52);
                                } else {
                                    class36.method292(var15.field52, var15.field66, var16, var17, var33, (byte) 1);
                                }
                            } else if (var15.field72) {
                                class36.method290(256 - (var15.field37 & 255), var16, false, var15.field52, var33, var17, var15.field66);
                            } else {
                                class36.method293(0, var33, 256 - (var15.field37 & 255), var15.field52, var16, var15.field66, var17);
                            }
                        } else if (var15.field63 == 4) {
                            class70 var34 = var15.field9;
                            String var35 = var15.field29;
                            boolean var36 = false;
                            if (this.field434 == var15.field18 || this.field148 == var15.field18 || this.field328 == var15.field18) {
                                var36 = true;
                            }
                            int var37;
                            if (this.method86(var15, 5)) {
                                var37 = var15.field6;
                                if (var36 && var15.field48 != 0) {
                                    var37 = var15.field48;
                                }
                                if (var15.field2.length() > 0) {
                                    var35 = var15.field2;
                                }
                            } else {
                                var37 = var15.field51;
                                if (var36 && var15.field74 != 0) {
                                    var37 = var15.field74;
                                }
                            }
                            if (var15.field47 == 6 && this.field469) {
                                var35 = "Please wait...";
                                var37 = var15.field51;
                            }
                            if (class36.field1150 == 479) {
                                if (var37 == 16776960) {
                                    var37 = 255;
                                }
                                if (var37 == 49152) {
                                    var37 = 16777215;
                                }
                            }
                            int var38 = var34.field1743 + var17;
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
                                                                        var35 = var35.substring(0, var43) + this.method24(this.method127(4, -489, var15), false) + var35.substring(var43 + 2);
                                                                    }
                                                                }
                                                                var35 = var35.substring(0, var42) + this.method24(this.method127(3, -489, var15), false) + var35.substring(var42 + 2);
                                                            }
                                                        }
                                                        var35 = var35.substring(0, var41) + this.method24(this.method127(2, -489, var15), false) + var35.substring(var41 + 2);
                                                    }
                                                }
                                                var35 = var35.substring(0, var40) + this.method24(this.method127(1, -489, var15), false) + var35.substring(var40 + 2);
                                            }
                                        }
                                        var35 = var35.substring(0, var39) + this.method24(this.method127(0, -489, var15), false) + var35.substring(var39 + 2);
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
                                if (var15.field7) {
                                    var34.method587(var15.field66 / 2 + var16, var37, var38, var45, var15.field67, -104);
                                } else {
                                    var34.method594(var16, var45, var38, var37, this.field124, var15.field67);
                                }
                                var38 += var34.field1743;
                            }
                        } else if (var15.field63 == 5) {
                            class58 var46;
                            if (this.method86(var15, 5)) {
                                var46 = var15.field56;
                            } else {
                                var46 = var15.field73;
                            }
                            if (var46 != null) {
                                var46.method548(var17, var16, this.field578);
                            }
                        } else if (var15.field63 == 6) {
                            int var47 = class39.field1193;
                            int var48 = class39.field1194;
                            class39.field1193 = var15.field66 / 2 + var16;
                            class39.field1194 = var15.field52 / 2 + var17;
                            int var49 = class39.field1197[var15.field40] * var15.field39 >> 16;
                            int var50 = class39.field1198[var15.field40] * var15.field39 >> 16;
                            boolean var51 = this.method86(var15, 5);
                            int var52;
                            if (var51) {
                                var52 = var15.field12;
                            } else {
                                var52 = var15.field11;
                            }
                            class16 var53;
                            if (var52 == -1) {
                                var53 = var15.method6(var51, -1, -1, (byte) -77);
                            } else {
                                class2 var54 = class2.field77[var52];
                                var53 = var15.method6(var51, var54.field80[var15.field75], var54.field79[var15.field75], (byte) -77);
                            }
                            if (var53 != null) {
                                var53.method239(0, var15.field41, 0, var15.field40, 0, var49, var50);
                            }
                            class39.field1193 = var47;
                            class39.field1194 = var48;
                        } else {
                            if (var15.field63 == 7) {
                                class70 var55 = var15.field9;
                                int var56 = 0;
                                for (int var57 = 0; var57 < var15.field52; ++var57) {
                                    for (int var58 = 0; var58 < var15.field66; ++var58) {
                                        if (var15.field59[var56] > 0) {
                                            class48 var59 = class48.method453(var15.field59[var56] - 1);
                                            String var60 = String.valueOf(var59.field1376);
                                            if (var59.field1417 || var15.field3[var56] != 1) {
                                                var60 = var60 + " x" + method158(this.field174, var15.field3[var56]);
                                            }
                                            int var61 = (var15.field27 + 115) * var58 + var16;
                                            int var62 = (var15.field50 + 12) * var57 + var17;
                                            if (var15.field7) {
                                                var55.method587(var15.field66 / 2 + var61, var15.field51, var62, var60, var15.field67, -104);
                                            } else {
                                                var55.method594(var61, var60, var62, var15.field51, this.field124, var15.field67);
                                            }
                                        }
                                        ++var56;
                                    }
                                }
                            }
                            if (var15.field63 == 8 && (this.field278 == var15.field18 || this.field152 == var15.field18 || this.field371 == var15.field18) && this.field368 == 100) {
                                int var63 = 0;
                                int var64 = 0;
                                class70 var65 = this.field231;
                                String var66 = var15.field29;
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
                                    int var75 = var65.method588(var74, true);
                                    if (var75 > var63) {
                                        var63 = var75;
                                    }
                                    var64 += var65.field1743 + 1;
                                }
                                var63 += 6;
                                var64 += 7;
                                int var67 = var15.field66 + var16 - 5 - var63;
                                int var68 = var15.field52 + var17 + 5;
                                if (var67 < var16 + 5) {
                                    var67 = var16 + 5;
                                }
                                if (var63 + var67 > arg1.field66 + arg3) {
                                    var67 = arg1.field66 + arg3 - var63;
                                }
                                if (var64 + var68 > arg1.field52 + arg4) {
                                    var68 = arg1.field52 + arg4 - var64;
                                }
                                class36.method291(var67, var63, 42613, var68, 16777120, var64);
                                class36.method292(var64, var63, var67, var68, 0, (byte) 1);
                                String var69 = var15.field29;
                                int var70 = var65.field1743 + var68 + 2;
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
                                    var65.method594(var67 + 3, var72, var70, 0, this.field124, false);
                                    var70 += var65.field1743 + 1;
                                }
                            }
                        }
                    }
                }
                int var12 = 34 / arg2;
                class36.method288(var6, var9, var7, var8, -586);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V")
    public final void method48(int arg0) {
        if (arg0 >= 0) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        if (this.field408 == 0) {
            if (super.field952 == 1) {
                int var3 = super.field953 - 25 - 550;
                int var4 = super.field954 - 5 - 4;
                if (var3 >= 0 && var4 >= 0 && var3 < 146 && var4 < 151) {
                    var3 -= 73;
                    var4 -= 75;
                    int var5 = this.field606 + this.field245 & 2047;
                    int var6 = class39.field1197[var5];
                    int var7 = class39.field1198[var5];
                    int var8 = (this.field438 + 256) * var6 >> 8;
                    int var9 = (this.field438 + 256) * var7 >> 8;
                    int var10 = var3 * var9 + var4 * var8 >> 11;
                    int var11 = var4 * var9 - var3 * var8 >> 11;
                    int var12 = field135.field1623 + var10 >> 7;
                    int var13 = field135.field1624 - var11 >> 7;
                    boolean var14 = this.method27(var12, 6, var13, 0, field135.field1632[0], 0, 1, 0, true, field135.field1631[0], 0, 0);
                    if (var14) {
                        this.field132.method330(var3);
                        this.field132.method330(var4);
                        this.field132.method331(this.field606);
                        this.field132.method330(57);
                        this.field132.method330(this.field245);
                        this.field132.method330(this.field438);
                        this.field132.method330(89);
                        this.field132.method331(field135.field1623);
                        this.field132.method331(field135.field1624);
                        this.field132.method330(this.field559);
                        this.field132.method330(63);
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(BI)V")
    public final void method49(byte arg0, int arg1) {
        class1 var3 = class1.method4(arg1);
        for (int var4 = 0; var4 < var3.field30.length && var3.field30[var4] != -1; ++var4) {
            class1 var5 = class1.method4(var3.field30[var4]);
            if (var5.field63 == 1) {
                this.method49((byte) 58, var5.field18);
            }
            var5.field75 = 0;
            var5.field71 = 0;
        }
        if (this.field450 != arg0) {
            this.field463 = null;
        }
    }

    @OriginalMember(owner = "client!client", name = "m", descriptor = "(I)Z")
    public final boolean method50(int arg0) {
        while (arg0 >= 0) {
            this.method121();
        }
        return signlink.wavereplay();
    }

    @OriginalMember(owner = "client!client", name = "n", descriptor = "(I)V")
    public final void method51(int arg0) {
        if (arg0 > 0) {
            try {
                int var2 = field135.field1623 + this.field284;
                int var3 = field135.field1624 + this.field139;
                if (this.field234 - var2 < -500 || this.field234 - var2 > 500 || this.field235 - var3 < -500 || this.field235 - var3 > 500) {
                    this.field234 = var2;
                    this.field235 = var3;
                }
                if (this.field234 != var2) {
                    this.field234 += (var2 - this.field234) / 16;
                }
                if (this.field235 != var3) {
                    this.field235 += (var3 - this.field235) / 16;
                }
                if (super.field956[1] == 1) {
                    this.field607 += (-24 - this.field607) / 2;
                } else if (super.field956[2] == 1) {
                    this.field607 += (24 - this.field607) / 2;
                } else {
                    this.field607 /= 2;
                }
                if (super.field956[3] == 1) {
                    this.field608 += (12 - this.field608) / 2;
                } else if (super.field956[4] == 1) {
                    this.field608 += (-12 - this.field608) / 2;
                } else {
                    this.field608 /= 2;
                }
                this.field606 = this.field607 / 2 + this.field606 & 2047;
                this.field605 += this.field608 / 2;
                if (this.field605 < 128) {
                    this.field605 = 128;
                }
                if (this.field605 > 383) {
                    this.field605 = 383;
                }
                int var4 = this.field234 >> 7;
                int var5 = this.field235 >> 7;
                int var6 = this.method66(this.field183, this.field235, 6, this.field234);
                int var7 = 0;
                if (var4 > 3 && var5 > 3 && var4 < 100 && var5 < 100) {
                    for (int var8 = var4 - 4; var8 <= var4 + 4; ++var8) {
                        for (int var9 = var5 - 4; var9 <= var5 + 4; ++var9) {
                            int var10 = this.field183;
                            if (var10 < 3 && (this.field555[1][var8][var9] & 2) == 2) {
                                ++var10;
                            }
                            int var11 = var6 - this.field502[var10][var8][var9];
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
                if (var12 > this.field259) {
                    this.field259 += (var12 - this.field259) / 24;
                } else if (var12 < this.field259) {
                    this.field259 += (var12 - this.field259) / 80;
                }
            } catch (Exception var13) {
                signlink.reporterror("glfc_ex " + field135.field1623 + "," + field135.field1624 + "," + this.field234 + "," + this.field235 + "," + this.field309 + "," + this.field310 + "," + this.field401 + "," + this.field402);
                throw new RuntimeException("eek");
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IILXOZCTLMB;)V")
    public final void method52(int arg0, int arg1, class61 arg2) {
        this.method53(arg2.field1623, arg0, arg2.field1624, 0);
        this.field505 += arg1;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIII)V")
    public final void method53(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 != 0) {
            for (int var5 = 1; var5 > 0; ++var5) {
            }
        }
        if (arg0 >= 128 && arg2 >= 128 && arg0 <= 13056 && arg2 <= 13056) {
            int var6 = this.method66(this.field183, arg2, 6, arg0) - arg1;
            int var7 = arg0 - this.field511;
            int var8 = var6 - this.field512;
            int var9 = arg2 - this.field513;
            int var10 = class16.field838[this.field514];
            int var11 = class16.field839[this.field514];
            int var12 = class16.field838[this.field515];
            int var13 = class16.field839[this.field515];
            int var14 = var7 * var13 + var9 * var12 >> 16;
            int var15 = var9 * var13 - var7 * var12 >> 16;
            int var17 = var8 * var11 - var10 * var15 >> 16;
            int var18 = var8 * var10 + var11 * var15 >> 16;
            if (var18 >= 50) {
                this.field499 = (var14 << 9) / var18 + class39.field1193;
                this.field500 = (var17 << 9) / var18 + class39.field1194;
            } else {
                this.field499 = -1;
                this.field500 = -1;
            }
        } else {
            this.field499 = -1;
            this.field500 = -1;
        }
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(B)V")
    public final void method54(byte arg0) {
        if (arg0 == 7) {
            boolean var2 = false;
        } else {
            field293 = 470;
        }
        while (true) {
            class7 var3 = this.field262.method388();
            if (var3 == null) {
                return;
            }
            if (var3.field616 == 0) {
                class16.method216(var3.field618, false, var3.field615);
                if ((this.field262.method378(field446, var3.field618) & 98) != 0) {
                    this.field400 = true;
                    if (this.field447 != -1 || this.field443 != -1) {
                        this.field604 = true;
                    }
                }
            }
            if (var3.field616 == 1 && var3.field615 != null) {
                class37.method299(var3.field615, this.field158);
            }
            if (var3.field616 == 2 && this.field492 == var3.field618 && var3.field615 != null) {
                this.method31(this.field493, var3.field615, -542);
            }
            if (var3.field616 == 3 && this.field343 == 1) {
                for (int var4 = 0; var4 < this.field577.length; ++var4) {
                    if (this.field496[var4] == var3.field618) {
                        this.field577[var4] = var3.field615;
                        if (var3.field615 == null) {
                            this.field496[var4] = -1;
                        }
                        break;
                    }
                    if (this.field497[var4] == var3.field618) {
                        this.field312[var4] = var3.field615;
                        if (var3.field615 == null) {
                            this.field497[var4] = -1;
                        }
                        break;
                    }
                }
            }
            if (var3.field616 == 93 && this.field262.method390(646, var3.field618)) {
                class9.method179(new class41(888, var3.field615), 39766, this.field262);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;ZI)V")
    public final void method55(String arg0, boolean arg1, int arg2) {
        this.field405 = arg2;
        this.field297 = arg0;
        this.method41(7);
        if (this.field125 == null) {
            super.method55(arg0, false, arg2);
        } else {
            this.field208.method186(0);
            short var4 = 360;
            short var5 = 200;
            byte var6 = 20;
            this.field232.method586("RuneScape is loading - please wait...", var4 / 2, 8, 16777215, var5 / 2 - 26 - var6);
            int var7 = var5 / 2 - 18 - var6;
            class36.method292(34, 304, var4 / 2 - 152, var7, 9179409, (byte) 1);
            class36.method292(32, 302, var4 / 2 - 151, var7 + 1, 0, (byte) 1);
            class36.method291(var4 / 2 - 150, arg2 * 3, 42613, var7 + 2, 9179409, 30);
            class36.method291(arg2 * 3 + (var4 / 2 - 150), 300 - arg2 * 3, 42613, var7 + 2, 0, 30);
            this.field232.method586(arg0, var4 / 2, 8, 16777215, var5 / 2 + 5 - var6);
            if (arg1) {
                this.method121();
            }
            this.field208.method187(0, 202, super.field938, 171);
            if (this.field468) {
                this.field468 = false;
                if (!this.field409) {
                    this.field209.method187(0, 0, super.field938, 0);
                    this.field210.method187(0, 637, super.field938, 0);
                }
                this.field206.method187(0, 128, super.field938, 0);
                this.field207.method187(0, 202, super.field938, 371);
                this.field211.method187(0, 0, super.field938, 265);
                this.field212.method187(0, 562, super.field938, 265);
                this.field213.method187(0, 128, super.field938, 171);
                this.field214.method187(0, 562, super.field938, 171);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(ILWQACZBNG;II)V")
    public final void method56(int arg0, class58 arg1, int arg2, int arg3) {
        this.field505 += arg0;
        int var5 = arg2 * arg2 + arg3 * arg3;
        if (var5 > 4225 && var5 < 90000) {
            int var6 = this.field606 + this.field245 & 2047;
            int var7 = class16.field838[var6];
            int var8 = class16.field839[var6];
            int var9 = var7 * 256 / (this.field438 + 256);
            int var10 = var8 * 256 / (this.field438 + 256);
            int var11 = arg2 * var9 + arg3 * var10 >> 16;
            int var12 = arg2 * var10 - arg3 * var9 >> 16;
            double var13 = Math.atan2((double) var11, (double) var12);
            int var15 = (int) (Math.sin(var13) * 63.0D);
            int var16 = (int) (Math.cos(var13) * 57.0D);
            this.field325.method553(83 - var16 - 20, 15, 20, var15 + 94 + 4 - 10, var13, 256, -19836, 15, 20);
        } else {
            this.method25(arg3, arg1, -129, arg2);
        }
    }

    @OriginalMember(owner = "client!client", name = "o", descriptor = "(I)V")
    private final void method57(int arg0) {
        class23 var2 = (class23) this.field300.method532();
        if (arg0 <= 0) {
            for (int var3 = 1; var3 > 0; ++var3) {
            }
        }
        while (var2 != null) {
            if (var2.field895 == -1) {
                var2.field906 = 0;
                this.method38(var2, false);
            } else {
                var2.method163();
            }
            var2 = (class23) this.field300.method534(-420);
        }
    }

    @OriginalMember(owner = "client!client", name = "p", descriptor = "(I)V")
    public final void method58(int arg0) {
        this.field342 = true;
        for (int var2 = 0; var2 < 7; ++var2) {
            this.field323[var2] = -1;
            for (int var3 = 0; var3 < class69.field1725; ++var3) {
                if (!class69.field1726[var3].field1732 && class69.field1726[var3].field1727 == var2 + (this.field202 ? 0 : 7)) {
                    this.field323[var2] = var3;
                    break;
                }
            }
        }
        if (arg0 != 11278) {
            this.field132.method330(125);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(BZ)V")
    public final void method59(byte arg0, boolean arg1) {
        for (int var3 = 0; var3 < this.field266; ++var3) {
            class47 var5 = this.field265[this.field267[var3]];
            int var6 = (this.field267[var3] << 14) + 536870912;
            if (var5 != null && var5.method442(-40574) && var5.field1366.field1045 == arg1 && var5.field1366.method265(true)) {
                int var7 = var5.field1623 >> 7;
                int var8 = var5.field1624 >> 7;
                if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                    if (var5.field1613 == 1 && (var5.field1623 & 127) == 64 && (var5.field1624 & 127) == 64) {
                        if (this.field229[var7][var8] == this.field350) {
                            continue;
                        }
                        this.field229[var7][var8] = this.field350;
                    }
                    if (!var5.field1366.field1072) {
                        var6 += Integer.MIN_VALUE;
                    }
                    this.field449.method482(var6, var5, var5.field1619, this.field183, this.method66(this.field183, var5.field1624, 6, var5.field1623), (var5.field1613 - 1) * 64 + 60, 42850, var5.field1623, var5.field1625, var5.field1624);
                }
            }
        }
        if (arg0 == 3) {
            boolean var4 = false;
        } else {
            this.field160 = !this.field160;
        }
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(B)V")
    public final void method60(byte arg0) {
        if (this.field509 > 0) {
            this.method141(0);
        } else {
            this.method142("Please wait - attempting to reestablish", 462, "Connection lost");
            this.field408 = 0;
            this.field536 = 0;
            if (arg0 != -50) {
                this.field506 = -1;
            }
            class51 var2 = this.field287;
            this.field458 = false;
            this.field154 = 0;
            this.method32(this.field204, this.field205, true);
            if (!this.field458) {
                this.method141(0);
            }
            try {
                var2.method464();
            } catch (Exception var3) {
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IJ)V")
    public final void method61(int arg0, long arg1) {
        if (arg1 != 0L) {
            for (int var4 = 0; var4 < this.field150; ++var4) {
                if (this.field126[var4] == arg1) {
                    --this.field150;
                    this.field400 = true;
                    for (int var5 = var4; var5 < this.field150; ++var5) {
                        this.field126[var5] = this.field126[var5 + 1];
                    }
                    this.field132.method329(59, false);
                    this.field132.method336(arg1, 0);
                    break;
                }
            }
            int var6 = 49 / arg0;
        }
    }

    @OriginalMember(owner = "client!client", name = "q", descriptor = "(I)V")
    public final void method62(int arg0) {
        if (arg0 == 0) {
            if (this.field589 == 0 && this.field479 == 0) {
                this.field225[this.field272] = "Walk here";
                this.field180[this.field272] = 616;
                this.field178[this.field272] = super.field946;
                this.field179[this.field272] = super.field947;
                ++this.field272;
            }
            int var2 = -1;
            for (int var3 = 0; var3 < class16.field836; ++var3) {
                int var4 = class16.field837[var3];
                int var5 = var4 & 127;
                int var6 = var4 >> 7 & 127;
                int var7 = var4 >> 29 & 3;
                int var8 = var4 >> 14 & 32767;
                if (var2 != var4) {
                    var2 = var4;
                    if (var7 == 2 && this.field449.method501(this.field183, var5, var6, var4) >= 0) {
                        class14 var9 = class14.method196(var8);
                        if (var9.field738 != null) {
                            var9 = var9.method195((byte) 22);
                        }
                        if (var9 == null) {
                            continue;
                        }
                        if (this.field589 == 1) {
                            this.field225[this.field272] = "Use " + this.field593 + " with @cya@" + var9.field724;
                            this.field180[this.field272] = 804;
                            this.field181[this.field272] = var4;
                            this.field178[this.field272] = var5;
                            this.field179[this.field272] = var6;
                            ++this.field272;
                        } else if (this.field479 == 1) {
                            if ((this.field481 & 4) == 4) {
                                this.field225[this.field272] = this.field482 + " @cya@" + var9.field724;
                                this.field180[this.field272] = 652;
                                this.field181[this.field272] = var4;
                                this.field178[this.field272] = var5;
                                this.field179[this.field272] = var6;
                                ++this.field272;
                            }
                        } else {
                            if (var9.field743 != null) {
                                for (int var10 = 4; var10 >= 0; --var10) {
                                    if (var9.field743[var10] != null) {
                                        this.field225[this.field272] = var9.field743[var10] + " @cya@" + var9.field724;
                                        if (var10 == 0) {
                                            this.field180[this.field272] = 513;
                                        }
                                        if (var10 == 1) {
                                            this.field180[this.field272] = 20;
                                        }
                                        if (var10 == 2) {
                                            this.field180[this.field272] = 155;
                                        }
                                        if (var10 == 3) {
                                            this.field180[this.field272] = 826;
                                        }
                                        if (var10 == 4) {
                                            this.field180[this.field272] = 1234;
                                        }
                                        this.field181[this.field272] = var4;
                                        this.field178[this.field272] = var5;
                                        this.field179[this.field272] = var6;
                                        ++this.field272;
                                    }
                                }
                            }
                            this.field225[this.field272] = "Examine @cya@" + var9.field724;
                            this.field180[this.field272] = 1420;
                            this.field181[this.field272] = var9.field722 << 14;
                            this.field178[this.field272] = var5;
                            this.field179[this.field272] = var6;
                            ++this.field272;
                        }
                    }
                    if (var7 == 1) {
                        class47 var11 = this.field265[var8];
                        if (var11.field1366.field1054 == 1 && (var11.field1623 & 127) == 64 && (var11.field1624 & 127) == 64) {
                            for (int var12 = 0; var12 < this.field266; ++var12) {
                                class47 var15 = this.field265[this.field267[var12]];
                                if (var15 != null && var11 != var15 && var15.field1366.field1054 == 1 && var11.field1623 == var15.field1623 && var11.field1624 == var15.field1624) {
                                    this.method113(var5, -126, var15.field1366, this.field267[var12], var6);
                                }
                            }
                            for (int var13 = 0; var13 < this.field473; ++var13) {
                                class49 var14 = this.field472[this.field474[var13]];
                                if (var14 != null && var11.field1623 == var14.field1623 && var11.field1624 == var14.field1624) {
                                    this.method99(259, var6, var14, this.field474[var13], var5);
                                }
                            }
                        }
                        this.method113(var5, -126, var11.field1366, var8, var6);
                    }
                    if (var7 == 0) {
                        class49 var16 = this.field472[var8];
                        if ((var16.field1623 & 127) == 64 && (var16.field1624 & 127) == 64) {
                            for (int var17 = 0; var17 < this.field266; ++var17) {
                                class47 var20 = this.field265[this.field267[var17]];
                                if (var20 != null && var20.field1366.field1054 == 1 && var16.field1623 == var20.field1623 && var16.field1624 == var20.field1624) {
                                    this.method113(var5, -126, var20.field1366, this.field267[var17], var6);
                                }
                            }
                            for (int var18 = 0; var18 < this.field473; ++var18) {
                                class49 var19 = this.field472[this.field474[var18]];
                                if (var19 != null && var16 != var19 && var16.field1623 == var19.field1623 && var16.field1624 == var19.field1624) {
                                    this.method99(259, var6, var19, this.field474[var18], var5);
                                }
                            }
                        }
                        this.method99(259, var6, var16, var8, var5);
                    }
                    if (var7 == 3) {
                        class55 var21 = this.field463[this.field183][var5][var6];
                        if (var21 != null) {
                            for (class56 var22 = (class56) var21.method533((byte) 108); var22 != null; var22 = (class56) var21.method535(this.field541)) {
                                class48 var23 = class48.method453(var22.field1565);
                                if (this.field589 == 1) {
                                    this.field225[this.field272] = "Use " + this.field593 + " with @lre@" + var23.field1376;
                                    this.field180[this.field272] = 417;
                                    this.field181[this.field272] = var22.field1565;
                                    this.field178[this.field272] = var5;
                                    this.field179[this.field272] = var6;
                                    ++this.field272;
                                } else if (this.field479 == 1) {
                                    if ((this.field481 & 1) == 1) {
                                        this.field225[this.field272] = this.field482 + " @lre@" + var23.field1376;
                                        this.field180[this.field272] = 712;
                                        this.field181[this.field272] = var22.field1565;
                                        this.field178[this.field272] = var5;
                                        this.field179[this.field272] = var6;
                                        ++this.field272;
                                    }
                                } else {
                                    for (int var24 = 4; var24 >= 0; --var24) {
                                        if (var23.field1398 != null && var23.field1398[var24] != null) {
                                            this.field225[this.field272] = var23.field1398[var24] + " @lre@" + var23.field1376;
                                            if (var24 == 0) {
                                                this.field180[this.field272] = 108;
                                            }
                                            if (var24 == 1) {
                                                this.field180[this.field272] = 715;
                                            }
                                            if (var24 == 2) {
                                                this.field180[this.field272] = 764;
                                            }
                                            if (var24 == 3) {
                                                this.field180[this.field272] = 330;
                                            }
                                            if (var24 == 4) {
                                                this.field180[this.field272] = 21;
                                            }
                                            this.field181[this.field272] = var22.field1565;
                                            this.field178[this.field272] = var5;
                                            this.field179[this.field272] = var6;
                                            ++this.field272;
                                        } else if (var24 == 2) {
                                            this.field225[this.field272] = "Take @lre@" + var23.field1376;
                                            this.field180[this.field272] = 764;
                                            this.field181[this.field272] = var22.field1565;
                                            this.field178[this.field272] = var5;
                                            this.field179[this.field272] = var6;
                                            ++this.field272;
                                        }
                                    }
                                    this.field225[this.field272] = "Examine @lre@" + var23.field1376;
                                    this.field180[this.field272] = 1663;
                                    this.field181[this.field272] = var22.field1565;
                                    this.field178[this.field272] = var5;
                                    this.field179[this.field272] = var6;
                                    ++this.field272;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(I[BI)Z")
    public final boolean method63(int arg0, byte[] arg1, int arg2) {
        if (arg0 != -35761) {
            this.field326 = 231;
        }
        return arg1 == null ? true : signlink.wavesave(arg1, arg2);
    }

    @OriginalMember(owner = "client!client", name = "run", descriptor = "()V")
    public final void run() {
        if (this.field363) {
            this.method34(true);
        } else {
            super.run();
        }
    }

    @OriginalMember(owner = "client!client", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        return signlink.mainapp != null ? signlink.mainapp.getParameter(arg0) : super.getParameter(arg0);
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(IB)Ljava/lang/String;")
    private static final String method64(int arg0, byte arg1) {
        if (arg1 != -2) {
            field392 = -51;
        }
        if (arg0 < 100000) {
            return String.valueOf(arg0);
        } else {
            return arg0 < 10000000 ? arg0 / 1000 + "K" : arg0 / 1000000 + "M";
        }
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(B)V")
    public final void method65(byte arg0) {
        if (super.field939 == null) {
            this.method146(33560);
            this.field206 = null;
            this.field207 = null;
            this.field208 = null;
            this.field209 = null;
            this.field210 = null;
            this.field211 = null;
            this.field212 = null;
            this.field213 = null;
            this.field214 = null;
            this.field320 = null;
            this.field318 = null;
            this.field317 = null;
            this.field319 = null;
            this.field583 = null;
            this.field584 = null;
            this.field585 = null;
            super.field939 = new class10(503, 765, this.method153(-518), 384);
            this.field468 = true;
            if (this.field344 != arg0) {
                this.field160 = !this.field160;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(IIII)I")
    public final int method66(int arg0, int arg1, int arg2, int arg3) {
        int var5 = arg3 >> 7;
        int var6 = arg1 >> 7;
        if (arg2 != 6) {
            this.field506 = -1;
        }
        if (var5 >= 0 && var6 >= 0 && var5 <= 103 && var6 <= 103) {
            int var7 = arg0;
            if (arg0 < 3 && (this.field555[1][var5][var6] & 2) == 2) {
                var7 = arg0 + 1;
            }
            int var8 = arg3 & 127;
            int var9 = arg1 & 127;
            int var10 = (128 - var8) * this.field502[var7][var5][var6] + this.field502[var7][var5 + 1][var6] * var8 >> 7;
            int var11 = (128 - var8) * this.field502[var7][var5][var6 + 1] + this.field502[var7][var5 + 1][var6 + 1] * var8 >> 7;
            return (128 - var9) * var10 + var9 * var11 >> 7;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(II)V")
    public final void method67(int arg0, int arg1) {
        class55 var3 = this.field463[this.field183][arg0][arg1];
        if (var3 == null) {
            this.field449.method492(this.field183, arg0, arg1);
        } else {
            int var4 = -99999999;
            class56 var5 = null;
            for (class56 var6 = (class56) var3.method532(); var6 != null; var6 = (class56) var3.method534(-420)) {
                class48 var11 = class48.method453(var6.field1565);
                int var12 = var11.field1389;
                if (var11.field1417) {
                    var12 = (var6.field1567 + 1) * var12;
                }
                if (var12 > var4) {
                    var4 = var12;
                    var5 = var6;
                }
            }
            var3.method530(var5, true);
            class56 var7 = null;
            class56 var8 = null;
            for (class56 var9 = (class56) var3.method532(); var9 != null; var9 = (class56) var3.method534(-420)) {
                if (var5.field1565 != var9.field1565 && var7 == null) {
                    var7 = var9;
                }
                if (var5.field1565 != var9.field1565 && var7.field1565 != var9.field1565 && var8 == null) {
                    var8 = var9;
                }
            }
            int var10 = (arg1 << 7) + arg0 + 1610612736;
            this.field449.method478(0, this.field183, arg0, this.method66(this.field183, arg1 * 128 + 64, 6, arg0 * 128 + 64), var7, var10, arg1, var5, var8);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(JZ)V")
    public final void method68(long arg0, boolean arg1) {
        if (arg0 != 0L) {
            if (this.field150 >= 100) {
                this.method102("Your ignore list is full. Max of 100 hit", "", -459, 0);
            } else {
                String var4 = class57.method541(0, class57.method538(arg0, (byte) 7));
                for (int var5 = 0; var5 < this.field150; ++var5) {
                    if (this.field126[var5] == arg0) {
                        this.method102(var4 + " is already on your ignore list", "", -459, 0);
                        return;
                    }
                }
                for (int var6 = 0; var6 < this.field129; ++var6) {
                    if (this.field529[var6] == arg0) {
                        this.method102("Please remove " + var4 + " from your friend list first", "", -459, 0);
                        return;
                    }
                }
                this.field126[this.field150++] = arg0;
                this.field400 = true;
                if (arg1) {
                    this.field506 = -1;
                }
                this.field132.method329(129, false);
                this.field132.method336(arg0, 0);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "r", descriptor = "(I)V")
    public final void method69(int arg0) {
        for (int var2 = 0; var2 < this.field266; ++var2) {
            int var3 = this.field267[var2];
            class47 var4 = this.field265[var3];
            if (var4 != null) {
                this.method70(var4.field1366.field1054, var4, 0);
            }
        }
        if (this.field426 != arg0) {
            this.field506 = this.field143.method340();
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILXOZCTLMB;I)V")
    public final void method70(int arg0, class61 arg1, int arg2) {
        if (arg1.field1623 < 128 || arg1.field1624 < 128 || arg1.field1623 >= 13184 || arg1.field1624 >= 13184) {
            arg1.field1653 = -1;
            arg1.field1634 = -1;
            arg1.field1610 = 0;
            arg1.field1611 = 0;
            arg1.field1623 = arg1.field1631[0] * 128 + arg1.field1613 * 64;
            arg1.field1624 = arg1.field1632[0] * 128 + arg1.field1613 * 64;
            arg1.method562(-678);
        }
        if (field135 == arg1 && (arg1.field1623 < 1536 || arg1.field1624 < 1536 || arg1.field1623 >= 11776 || arg1.field1624 >= 11776)) {
            arg1.field1653 = -1;
            arg1.field1634 = -1;
            arg1.field1610 = 0;
            arg1.field1611 = 0;
            arg1.field1623 = arg1.field1631[0] * 128 + arg1.field1613 * 64;
            arg1.field1624 = arg1.field1632[0] * 128 + arg1.field1613 * 64;
            arg1.method562(-678);
        }
        if (arg1.field1610 > field581) {
            this.method71(arg1, 0);
        } else if (arg1.field1611 >= field581) {
            this.method72(3, arg1);
        } else {
            this.method73(false, arg1);
        }
        this.method74(arg1, 786);
        this.method75(-918, arg1);
        if (arg2 != 0) {
            field291 = -302;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(LXOZCTLMB;I)V")
    public final void method71(class61 arg0, int arg1) {
        int var3 = arg0.field1610 - field581;
        int var4 = arg0.field1613 * 64 + arg0.field1606 * 128;
        int var5 = arg0.field1613 * 64 + arg0.field1608 * 128;
        arg0.field1623 += (var4 - arg0.field1623) / var3;
        this.field505 += arg1;
        arg0.field1624 += (var5 - arg0.field1624) / var3;
        arg0.field1630 = 0;
        if (arg0.field1612 == 0) {
            arg0.field1614 = 1024;
        }
        if (arg0.field1612 == 1) {
            arg0.field1614 = 1536;
        }
        if (arg0.field1612 == 2) {
            arg0.field1614 = 0;
        }
        if (arg0.field1612 == 3) {
            arg0.field1614 = 512;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILXOZCTLMB;)V")
    public final void method72(int arg0, class61 arg1) {
        if (arg0 >= 3 && arg0 <= 3) {
            if (field581 == arg1.field1611 || arg1.field1653 == -1 || arg1.field1656 != 0 || arg1.field1655 + 1 > class2.field77[arg1.field1653].method12(arg1.field1654, 214)) {
                int var3 = arg1.field1611 - arg1.field1610;
                int var4 = field581 - arg1.field1610;
                int var5 = arg1.field1613 * 64 + arg1.field1606 * 128;
                int var6 = arg1.field1613 * 64 + arg1.field1608 * 128;
                int var7 = arg1.field1613 * 64 + arg1.field1607 * 128;
                int var8 = arg1.field1613 * 64 + arg1.field1609 * 128;
                arg1.field1623 = ((var3 - var4) * var5 + var4 * var7) / var3;
                arg1.field1624 = ((var3 - var4) * var6 + var4 * var8) / var3;
            }
            arg1.field1630 = 0;
            if (arg1.field1612 == 0) {
                arg1.field1614 = 1024;
            }
            if (arg1.field1612 == 1) {
                arg1.field1614 = 1536;
            }
            if (arg1.field1612 == 2) {
                arg1.field1614 = 0;
            }
            if (arg1.field1612 == 3) {
                arg1.field1614 = 512;
            }
            arg1.field1625 = arg1.field1614;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ZLXOZCTLMB;)V")
    public final void method73(boolean arg0, class61 arg1) {
        arg1.field1627 = arg1.field1641;
        if (arg1.field1639 == 0) {
            arg1.field1630 = 0;
        } else {
            if (arg1.field1653 != -1 && arg1.field1656 == 0) {
                class2 var3 = class2.field77[arg1.field1653];
                if (arg1.field1650 > 0 && var3.field89 == 0) {
                    ++arg1.field1630;
                    return;
                }
                if (arg1.field1650 <= 0 && var3.field90 == 0) {
                    ++arg1.field1630;
                    return;
                }
            }
            int var4 = arg1.field1623;
            int var5 = arg1.field1624;
            if (!arg0) {
                int var6 = arg1.field1631[arg1.field1639 - 1] * 128 + arg1.field1613 * 64;
                int var7 = arg1.field1632[arg1.field1639 - 1] * 128 + arg1.field1613 * 64;
                if (var6 - var4 <= 256 && var6 - var4 >= -256 && var7 - var5 <= 256 && var7 - var5 >= -256) {
                    if (var4 < var6) {
                        if (var5 < var7) {
                            arg1.field1614 = 1280;
                        } else if (var5 > var7) {
                            arg1.field1614 = 1792;
                        } else {
                            arg1.field1614 = 1536;
                        }
                    } else if (var4 > var6) {
                        if (var5 < var7) {
                            arg1.field1614 = 768;
                        } else if (var5 > var7) {
                            arg1.field1614 = 256;
                        } else {
                            arg1.field1614 = 512;
                        }
                    } else if (var5 < var7) {
                        arg1.field1614 = 1024;
                    } else {
                        arg1.field1614 = 0;
                    }
                    int var8 = arg1.field1614 - arg1.field1625 & 2047;
                    if (var8 > 1024) {
                        var8 -= 2048;
                    }
                    int var9 = arg1.field1616;
                    if (var8 >= -256 && var8 <= 256) {
                        var9 = arg1.field1615;
                    } else if (var8 >= 256 && var8 < 768) {
                        var9 = arg1.field1618;
                    } else if (var8 >= -768 && var8 <= -256) {
                        var9 = arg1.field1617;
                    }
                    if (var9 == -1) {
                        var9 = arg1.field1615;
                    }
                    arg1.field1627 = var9;
                    int var10 = 4;
                    if (arg1.field1625 != arg1.field1614 && arg1.field1633 == -1 && arg1.field1626 != 0) {
                        var10 = 2;
                    }
                    if (arg1.field1639 > 2) {
                        var10 = 6;
                    }
                    if (arg1.field1639 > 3) {
                        var10 = 8;
                    }
                    if (arg1.field1630 > 0 && arg1.field1639 > 1) {
                        var10 = 8;
                        --arg1.field1630;
                    }
                    if (arg1.field1643[arg1.field1639 - 1]) {
                        var10 <<= 1;
                    }
                    if (var10 >= 8 && arg1.field1627 == arg1.field1615 && arg1.field1659 != -1) {
                        arg1.field1627 = arg1.field1659;
                    }
                    if (var4 < var6) {
                        arg1.field1623 += var10;
                        if (arg1.field1623 > var6) {
                            arg1.field1623 = var6;
                        }
                    } else if (var4 > var6) {
                        arg1.field1623 -= var10;
                        if (arg1.field1623 < var6) {
                            arg1.field1623 = var6;
                        }
                    }
                    if (var5 < var7) {
                        arg1.field1624 += var10;
                        if (arg1.field1624 > var7) {
                            arg1.field1624 = var7;
                        }
                    } else if (var5 > var7) {
                        arg1.field1624 -= var10;
                        if (arg1.field1624 < var7) {
                            arg1.field1624 = var7;
                        }
                    }
                    if (arg1.field1623 == var6 && arg1.field1624 == var7) {
                        --arg1.field1639;
                        if (arg1.field1650 > 0) {
                            --arg1.field1650;
                            return;
                        }
                    }
                } else {
                    arg1.field1623 = var6;
                    arg1.field1624 = var7;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(LXOZCTLMB;I)V")
    public final void method74(class61 arg0, int arg1) {
        int var3 = 23 / arg1;
        if (arg0.field1626 != 0) {
            if (arg0.field1633 != -1 && arg0.field1633 < 32768) {
                class47 var4 = this.field265[arg0.field1633];
                if (var4 != null) {
                    int var5 = arg0.field1623 - var4.field1623;
                    int var6 = arg0.field1624 - var4.field1624;
                    if (var5 != 0 || var6 != 0) {
                        arg0.field1614 = (int) (Math.atan2((double) var5, (double) var6) * 325.949D) & 2047;
                    }
                }
            }
            if (arg0.field1633 >= 32768) {
                int var7 = arg0.field1633 - 32768;
                if (this.field157 == var7) {
                    var7 = this.field471;
                }
                class49 var8 = this.field472[var7];
                if (var8 != null) {
                    int var9 = arg0.field1623 - var8.field1623;
                    int var10 = arg0.field1624 - var8.field1624;
                    if (var9 != 0 || var10 != 0) {
                        arg0.field1614 = (int) (Math.atan2((double) var9, (double) var10) * 325.949D) & 2047;
                    }
                }
            }
            if ((arg0.field1646 != 0 || arg0.field1647 != 0) && (arg0.field1639 == 0 || arg0.field1630 > 0)) {
                int var11 = arg0.field1623 - (arg0.field1646 - this.field401 - this.field401) * 64;
                int var12 = arg0.field1624 - (arg0.field1647 - this.field402 - this.field402) * 64;
                if (var11 != 0 || var12 != 0) {
                    arg0.field1614 = (int) (Math.atan2((double) var11, (double) var12) * 325.949D) & 2047;
                }
                arg0.field1646 = 0;
                arg0.field1647 = 0;
            }
            int var13 = arg0.field1614 - arg0.field1625 & 2047;
            if (var13 != 0) {
                if (var13 >= arg0.field1626 && var13 <= 2048 - arg0.field1626) {
                    if (var13 > 1024) {
                        arg0.field1625 -= arg0.field1626;
                    } else {
                        arg0.field1625 += arg0.field1626;
                    }
                } else {
                    arg0.field1625 = arg0.field1614;
                }
                arg0.field1625 &= 2047;
                if (arg0.field1641 == arg0.field1627 && arg0.field1625 != arg0.field1614) {
                    if (arg0.field1642 != -1) {
                        arg0.field1627 = arg0.field1642;
                        return;
                    }
                    arg0.field1627 = arg0.field1615;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(ILXOZCTLMB;)V")
    public final void method75(int arg0, class61 arg1) {
        if (arg0 >= 0) {
            this.field506 = this.field143.method340();
        }
        arg1.field1619 = false;
        if (arg1.field1627 != -1) {
            class2 var3 = class2.field77[arg1.field1627];
            ++arg1.field1629;
            if (arg1.field1628 < var3.field78 && arg1.field1629 > var3.method12(arg1.field1628, 214)) {
                arg1.field1629 = 1;
                ++arg1.field1628;
            }
            if (arg1.field1628 >= var3.field78) {
                arg1.field1629 = 1;
                arg1.field1628 = 0;
            }
        }
        if (arg1.field1634 != -1 && field581 >= arg1.field1637) {
            if (arg1.field1635 < 0) {
                arg1.field1635 = 0;
            }
            class2 var4 = class38.field1171[arg1.field1634].field1175;
            ++arg1.field1636;
            if (arg1.field1635 < var4.field78 && arg1.field1636 > var4.method12(arg1.field1635, 214)) {
                arg1.field1636 = 1;
                ++arg1.field1635;
            }
            if (arg1.field1635 >= var4.field78 && (arg1.field1635 < 0 || arg1.field1635 >= var4.field78)) {
                arg1.field1634 = -1;
            }
        }
        if (arg1.field1653 != -1 && arg1.field1656 <= 1) {
            class2 var5 = class2.field77[arg1.field1653];
            if (var5.field89 == 1 && arg1.field1650 > 0 && arg1.field1610 <= field581 && arg1.field1611 < field581) {
                arg1.field1656 = 1;
                return;
            }
        }
        if (arg1.field1653 != -1 && arg1.field1656 == 0) {
            class2 var6 = class2.field77[arg1.field1653];
            ++arg1.field1655;
            if (arg1.field1654 < var6.field78 && arg1.field1655 > var6.method12(arg1.field1654, 214)) {
                arg1.field1655 = 1;
                ++arg1.field1654;
            }
            if (arg1.field1654 >= var6.field78) {
                arg1.field1654 -= var6.field82;
                ++arg1.field1657;
                if (arg1.field1657 >= var6.field88) {
                    arg1.field1653 = -1;
                }
                if (arg1.field1654 < 0 || arg1.field1654 >= var6.field78) {
                    arg1.field1653 = -1;
                }
            }
            arg1.field1619 = var6.field84;
        }
        if (arg1.field1656 > 0) {
            --arg1.field1656;
        }
    }

    @OriginalMember(owner = "client!client", name = "s", descriptor = "(I)V")
    public final void method76(int arg0) {
        if (this.field252 == -1 || this.field343 != 2 && super.field939 == null) {
            if (this.field468) {
                this.method91(true);
                this.field468 = false;
                this.field189.method187(0, 0, super.field938, 4);
                this.field190.method187(0, 0, super.field938, 357);
                this.field191.method187(0, 722, super.field938, 4);
                this.field192.method187(0, 743, super.field938, 205);
                this.field193.method187(0, 0, super.field938, 0);
                this.field194.method187(0, 516, super.field938, 4);
                this.field195.method187(0, 516, super.field938, 205);
                this.field196.method187(0, 496, super.field938, 357);
                this.field197.method187(0, 0, super.field938, 338);
                this.field400 = true;
                this.field604 = true;
                this.field182 = true;
                this.field339 = true;
                if (this.field343 != 2) {
                    this.field319.method187(0, 4, super.field938, 4);
                    this.field318.method187(0, 550, super.field938, 4);
                }
            }
            if (this.field343 == 2) {
                this.method148(this.field153);
            }
            if (this.field173 && this.field329 == 1) {
                this.field400 = true;
            }
            if (this.field228 != -1) {
                boolean var4 = this.method100(this.field253, this.field228, true);
                if (var4) {
                    this.field400 = true;
                }
            }
            if (this.field271 == 2) {
                this.field400 = true;
            }
            if (this.field532 == 2) {
                this.field400 = true;
            }
            if (this.field400) {
                this.method77(0);
                this.field400 = false;
            }
            if (this.field447 == -1 && this.field526 == 0) {
                this.field243.field62 = this.field494 - this.field367 - 77;
                if (super.field946 > 448 && super.field946 < 560 && super.field947 > 332) {
                    this.method88(77, super.field947 - 357, -1, this.field243, super.field946 - 17, this.field494, 463, (byte) 9, 0);
                }
                int var5 = this.field494 - 77 - this.field243.field62;
                if (var5 < 0) {
                    var5 = 0;
                }
                if (var5 > this.field494 - 77) {
                    var5 = this.field494 - 77;
                }
                if (this.field367 != var5) {
                    this.field367 = var5;
                    this.field604 = true;
                }
            }
            if (this.field447 == -1 && this.field526 == 3) {
                int var6 = this.field162 * 14 + 7;
                this.field243.field62 = this.field165;
                if (super.field946 > 448 && super.field946 < 560 && super.field947 > 332) {
                    this.method88(77, super.field947 - 357, -1, this.field243, super.field946 - 17, var6, 463, (byte) 9, 0);
                }
                int var7 = this.field243.field62;
                if (var7 < 0) {
                    var7 = 0;
                }
                if (var7 > var6 - 77) {
                    var7 = var6 - 77;
                }
                if (this.field165 != var7) {
                    this.field165 = var7;
                    this.field604 = true;
                }
            }
            if (this.field447 != -1) {
                boolean var8 = this.method100(this.field253, this.field447, true);
                if (var8) {
                    this.field604 = true;
                }
            }
            if (this.field271 == 3) {
                this.field604 = true;
            }
            if (this.field532 == 3) {
                this.field604 = true;
            }
            if (this.field345 != null) {
                this.field604 = true;
            }
            if (this.field173 && this.field329 == 2) {
                this.field604 = true;
            }
            if (this.field604) {
                this.method114((byte) 0);
                this.field604 = false;
            }
            if (this.field343 == 2) {
                this.method94(false);
                this.field318.method187(0, 550, super.field938, 4);
                ++field374;
                if (field374 > 1246) {
                    field374 = 0;
                    this.field132.method329(232, false);
                    this.field132.method330(0);
                    int var9 = this.field132.field1241;
                    this.field132.method331(23861);
                    this.field132.method330(28);
                    this.field132.method331(63549);
                    this.field132.method330(30);
                    if ((int) (Math.random() * 2.0D) == 0) {
                        this.field132.method331(30108);
                    }
                    this.field132.method330((int) (Math.random() * 256.0D));
                    if ((int) (Math.random() * 2.0D) == 0) {
                        this.field132.method330(7);
                    }
                    if ((int) (Math.random() * 2.0D) == 0) {
                        this.field132.method331(23140);
                    }
                    if ((int) (Math.random() * 2.0D) == 0) {
                        this.field132.method330(247);
                    }
                    this.field132.method331(43120);
                    this.field132.method339(this.field132.field1241 - var9, (byte) 4);
                }
            }
            if (this.field571 != -1) {
                this.field182 = true;
            }
            if (this.field182) {
                if (this.field571 != -1 && this.field571 == this.field522) {
                    this.field571 = -1;
                    this.field132.method329(242, false);
                    this.field132.method330(this.field522);
                }
                this.field182 = false;
                this.field585.method186(0);
                this.field276.method527(0, 0, this.field578);
                if (this.field228 == -1) {
                    if (this.field574[this.field522] != -1) {
                        if (this.field522 == 0) {
                            this.field565.method527(10, 22, this.field578);
                        }
                        if (this.field522 == 1) {
                            this.field566.method527(8, 54, this.field578);
                        }
                        if (this.field522 == 2) {
                            this.field566.method527(8, 82, this.field578);
                        }
                        if (this.field522 == 3) {
                            this.field567.method527(8, 110, this.field578);
                        }
                        if (this.field522 == 4) {
                            this.field569.method527(8, 153, this.field578);
                        }
                        if (this.field522 == 5) {
                            this.field569.method527(8, 181, this.field578);
                        }
                        if (this.field522 == 6) {
                            this.field568.method527(9, 209, this.field578);
                        }
                    }
                    if (this.field574[0] != -1 && (this.field571 != 0 || field581 % 20 < 10)) {
                        this.field445[0].method527(13, 29, this.field578);
                    }
                    if (this.field574[1] != -1 && (this.field571 != 1 || field581 % 20 < 10)) {
                        this.field445[1].method527(11, 53, this.field578);
                    }
                    if (this.field574[2] != -1 && (this.field571 != 2 || field581 % 20 < 10)) {
                        this.field445[2].method527(11, 82, this.field578);
                    }
                    if (this.field574[3] != -1 && (this.field571 != 3 || field581 % 20 < 10)) {
                        this.field445[3].method527(12, 115, this.field578);
                    }
                    if (this.field574[4] != -1 && (this.field571 != 4 || field581 % 20 < 10)) {
                        this.field445[4].method527(13, 153, this.field578);
                    }
                    if (this.field574[5] != -1 && (this.field571 != 5 || field581 % 20 < 10)) {
                        this.field445[5].method527(11, 180, this.field578);
                    }
                    if (this.field574[6] != -1 && (this.field571 != 6 || field581 % 20 < 10)) {
                        this.field445[6].method527(13, 208, this.field578);
                    }
                }
                this.field585.method187(0, 516, super.field938, 160);
                ++field273;
                if (field273 > 1764) {
                    field273 = 0;
                    this.field132.method329(49, false);
                    this.field132.method330(0);
                    int var10 = this.field132.field1241;
                    this.field132.method331(51137);
                    this.field132.method331(62484);
                    this.field132.method330((int) (Math.random() * 256.0D));
                    this.field132.method330(21);
                    if ((int) (Math.random() * 2.0D) == 0) {
                        this.field132.method331(59541);
                    }
                    this.field132.method330((int) (Math.random() * 256.0D));
                    this.field132.method331(15406);
                    if ((int) (Math.random() * 2.0D) == 0) {
                        this.field132.method331(19970);
                    }
                    this.field132.method330(219);
                    if ((int) (Math.random() * 2.0D) == 0) {
                        this.field132.method331(18918);
                    }
                    this.field132.method339(this.field132.field1241 - var10, (byte) 4);
                }
                this.field584.method186(0);
                this.field275.method527(0, 0, this.field578);
                if (this.field228 == -1) {
                    if (this.field574[this.field522] != -1) {
                        if (this.field522 == 7) {
                            this.field356.method527(0, 42, this.field578);
                        }
                        if (this.field522 == 8) {
                            this.field357.method527(0, 74, this.field578);
                        }
                        if (this.field522 == 9) {
                            this.field357.method527(0, 102, this.field578);
                        }
                        if (this.field522 == 10) {
                            this.field358.method527(1, 130, this.field578);
                        }
                        if (this.field522 == 11) {
                            this.field360.method527(0, 173, this.field578);
                        }
                        if (this.field522 == 12) {
                            this.field360.method527(0, 201, this.field578);
                        }
                        if (this.field522 == 13) {
                            this.field359.method527(0, 229, this.field578);
                        }
                    }
                    if (this.field574[8] != -1 && (this.field571 != 8 || field581 % 20 < 10)) {
                        this.field445[7].method527(2, 74, this.field578);
                    }
                    if (this.field574[9] != -1 && (this.field571 != 9 || field581 % 20 < 10)) {
                        this.field445[8].method527(3, 102, this.field578);
                    }
                    if (this.field574[10] != -1 && (this.field571 != 10 || field581 % 20 < 10)) {
                        this.field445[9].method527(4, 137, this.field578);
                    }
                    if (this.field574[11] != -1 && (this.field571 != 11 || field581 % 20 < 10)) {
                        this.field445[10].method527(2, 174, this.field578);
                    }
                    if (this.field574[12] != -1 && (this.field571 != 12 || field581 % 20 < 10)) {
                        this.field445[11].method527(2, 201, this.field578);
                    }
                    if (this.field574[13] != -1 && (this.field571 != 13 || field581 % 20 < 10)) {
                        this.field445[12].method527(2, 226, this.field578);
                    }
                }
                this.field584.method187(0, 496, super.field938, 466);
                this.field319.method186(0);
                class39.field1199 = this.field430;
            }
            if (this.field339) {
                this.field339 = false;
                this.field583.method186(0);
                this.field274.method527(0, 0, this.field578);
                this.field231.method587(55, 16777215, 28, "Public chat", true, -104);
                if (this.field407 == 0) {
                    this.field231.method587(55, 65280, 41, "On", true, -104);
                }
                if (this.field407 == 1) {
                    this.field231.method587(55, 16776960, 41, "Friends", true, -104);
                }
                if (this.field407 == 2) {
                    this.field231.method587(55, 16711680, 41, "Off", true, -104);
                }
                if (this.field407 == 3) {
                    this.field231.method587(55, 65535, 41, "Hide", true, -104);
                }
                this.field231.method587(184, 16777215, 28, "Private chat", true, -104);
                if (this.field362 == 0) {
                    this.field231.method587(184, 65280, 41, "On", true, -104);
                }
                if (this.field362 == 1) {
                    this.field231.method587(184, 16776960, 41, "Friends", true, -104);
                }
                if (this.field362 == 2) {
                    this.field231.method587(184, 16711680, 41, "Off", true, -104);
                }
                this.field231.method587(324, 16777215, 28, "Trade/compete", true, -104);
                if (this.field199 == 0) {
                    this.field231.method587(324, 65280, 41, "On", true, -104);
                }
                if (this.field199 == 1) {
                    this.field231.method587(324, 16776960, 41, "Friends", true, -104);
                }
                if (this.field199 == 2) {
                    this.field231.method587(324, 16711680, 41, "Off", true, -104);
                }
                this.field231.method587(458, 16777215, 33, "Report abuse", true, -104);
                this.field583.method187(0, 0, super.field938, 453);
                this.field319.method186(0);
                class39.field1199 = this.field430;
            }
            this.field253 = 0;
            if (arg0 <= 0) {
                this.field506 = this.field143.method340();
            }
        } else {
            if (this.field343 == 2) {
                this.method100(this.field253, this.field252, true);
                if (this.field184 != -1) {
                    this.method100(this.field253, this.field184, true);
                }
                this.field253 = 0;
                this.method65((byte) -68);
                super.field939.method186(0);
                class39.field1199 = this.field431;
                class36.method289(5);
                this.field468 = true;
                class1 var2 = class1.method4(this.field252);
                if (var2.field66 == 512 && var2.field52 == 334 && var2.field63 == 0) {
                    var2.field66 = 765;
                    var2.field52 = 503;
                }
                this.method47(0, var2, this.field198, 0, 0);
                if (this.field184 != -1) {
                    class1 var3 = class1.method4(this.field184);
                    if (var3.field66 == 512 && var3.field52 == 334 && var3.field63 == 0) {
                        var3.field66 = 765;
                        var3.field52 = 503;
                    }
                    this.method47(0, var3, this.field198, 0, 0);
                }
                if (!this.field173) {
                    this.method159(-31550);
                    this.method111(15536);
                } else {
                    this.method107(-41188);
                }
            }
            super.field939.method187(0, 0, super.field938, 0);
        }
    }

    @OriginalMember(owner = "client!client", name = "t", descriptor = "(I)V")
    public final void method77(int arg0) {
        this.field317.method186(0);
        class39.field1199 = this.field429;
        this.field417.method527(0, 0, this.field578);
        if (this.field228 != -1) {
            this.method47(0, class1.method4(this.field228), this.field198, 0, 0);
        } else if (this.field574[this.field522] != -1) {
            this.method47(0, class1.method4(this.field574[this.field522]), this.field198, 0, 0);
        }
        if (this.field173 && this.field329 == 1) {
            this.method107(-41188);
        }
        this.field317.method187(0, 553, super.field938, 205);
        this.field319.method186(0);
        if (arg0 < 0 || arg0 > 0) {
            this.field463 = null;
        }
        class39.field1199 = this.field430;
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(II)V")
    public final void method78(int arg0, int arg1) {
        if (arg0 != 5) {
            this.field506 = this.field143.method340();
        }
        if (!field250) {
            for (int var3 = 0; var3 < this.field579.length; ++var3) {
                int var4 = this.field579[var3];
                if (class39.field1207[var4] >= arg1) {
                    class54 var5 = class39.field1201[var4];
                    int var6 = var5.field1553 * var5.field1552 - 1;
                    int var7 = this.field253 * var5.field1552 * 2;
                    byte[] var8 = var5.field1550;
                    byte[] var9 = this.field239;
                    for (int var10 = 0; var10 <= var6; ++var10) {
                        var9[var10] = var8[var10 - var7 & var6];
                    }
                    var5.field1550 = var9;
                    this.field239 = var8;
                    class39.method313(var4, 904);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "k", descriptor = "(B)V")
    public final void method79(byte arg0) {
        short var2 = 256;
        if (this.field611 > 0) {
            for (int var3 = 0; var3 < 256; ++var3) {
                if (this.field611 > 768) {
                    this.field301[var3] = this.method133(true, 1024 - this.field611, this.field302[var3], this.field303[var3]);
                } else if (this.field611 > 256) {
                    this.field301[var3] = this.field303[var3];
                } else {
                    this.field301[var3] = this.method133(true, 256 - this.field611, this.field303[var3], this.field302[var3]);
                }
            }
        } else if (this.field612 > 0) {
            for (int var4 = 0; var4 < 256; ++var4) {
                if (this.field612 > 768) {
                    this.field301[var4] = this.method133(true, 1024 - this.field612, this.field302[var4], this.field304[var4]);
                } else if (this.field612 > 256) {
                    this.field301[var4] = this.field304[var4];
                } else {
                    this.field301[var4] = this.method133(true, 256 - this.field612, this.field304[var4], this.field302[var4]);
                }
            }
        } else {
            for (int var5 = 0; var5 < 256; ++var5) {
                this.field301[var5] = this.field302[var5];
            }
        }
        for (int var6 = 0; var6 < 33920; ++var6) {
            this.field209.field657[var6] = this.field524.field1583[var6];
        }
        int var7 = 0;
        int var8 = 1152;
        for (int var9 = 1; var9 < var2 - 1; ++var9) {
            int var24 = (var2 - var9) * this.field136[var9] / var2;
            int var25 = var24 + 22;
            if (var25 < 0) {
                var25 = 0;
            }
            var7 += var25;
            for (int var26 = var25; var26 < 128; ++var26) {
                int var27 = this.field575[var7++];
                if (var27 != 0) {
                    int var29 = 256 - var27;
                    int var30 = this.field301[var27];
                    int var31 = this.field209.field657[var8];
                    this.field209.field657[var8++] = ((var30 & 16711935) * var27 + (var31 & 16711935) * var29 & -16711936) + ((var30 & 65280) * var27 + (var31 & 65280) * var29 & 16711680) >> 8;
                } else {
                    ++var8;
                }
            }
            var8 += var25;
        }
        if (arg0 == 3) {
            boolean var10 = false;
        } else {
            this.field132.method330(119);
        }
        this.field209.method187(0, 0, super.field938, 0);
        for (int var11 = 0; var11 < 33920; ++var11) {
            this.field210.field657[var11] = this.field525.field1583[var11];
        }
        int var12 = 0;
        int var13 = 1176;
        for (int var14 = 1; var14 < var2 - 1; ++var14) {
            int var15 = (var2 - var14) * this.field136[var14] / var2;
            int var16 = 103 - var15;
            int var17 = var13 + var15;
            for (int var18 = 0; var18 < var16; ++var18) {
                int var19 = this.field575[var12++];
                if (var19 != 0) {
                    int var21 = 256 - var19;
                    int var22 = this.field301[var19];
                    int var23 = this.field210.field657[var17];
                    this.field210.field657[var17++] = ((var22 & 16711935) * var19 + (var23 & 16711935) * var21 & -16711936) + ((var22 & 65280) * var19 + (var23 & 65280) * var21 & 16711680) >> 8;
                } else {
                    ++var17;
                }
            }
            var12 += 128 - var16;
            var13 = 128 - var16 - var15 + var17;
        }
        this.field210.method187(0, 637, super.field938, 0);
    }

    @OriginalMember(owner = "client!client", name = "u", descriptor = "(I)V")
    public final void method80(int arg0) {
        signlink.midiplay = false;
        signlink.midifade = 0;
        signlink.midi = "stop";
        while (arg0 >= 0) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIIIIII)V")
    private final void method81(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        class23 var11 = null;
        for (class23 var12 = (class23) this.field300.method532(); var12 != null; var12 = (class23) this.field300.method534(-420)) {
            if (var12.field902 == arg3 && var12.field904 == arg6 && var12.field905 == arg7 && var12.field903 == arg5) {
                var11 = var12;
                break;
            }
        }
        if (var11 == null) {
            var11 = new class23();
            var11.field902 = arg3;
            var11.field903 = arg5;
            var11.field904 = arg6;
            var11.field905 = arg7;
            this.method38(var11, false);
            this.field300.method529(var11);
        }
        var11.field896 = arg9;
        if (arg2 >= 0) {
            this.field410 = this.field315.method556();
        }
        var11.field898 = arg1;
        var11.field897 = arg8;
        var11.field906 = arg0;
        var11.field895 = arg4;
    }

    @OriginalMember(owner = "client!client", name = "v", descriptor = "(I)V")
    public final void method82(int arg0) {
        for (int var2 = -1; var2 < this.field473; ++var2) {
            int var6;
            if (var2 == -1) {
                var6 = this.field471;
            } else {
                var6 = this.field474[var2];
            }
            class49 var7 = this.field472[var6];
            if (var7 != null && var7.field1644 > 0) {
                --var7.field1644;
                if (var7.field1644 == 0) {
                    var7.field1658 = null;
                }
            }
        }
        for (int var3 = 0; var3 < this.field266; ++var3) {
            int var4 = this.field267[var3];
            class47 var5 = this.field265[var4];
            if (var5 != null && var5.field1644 > 0) {
                --var5.field1644;
                if (var5.field1644 == 0) {
                    var5.field1658 = null;
                }
            }
        }
        if (arg0 > 0) {
            ;
        }
    }

    @OriginalMember(owner = "client!client", name = "w", descriptor = "(I)V")
    public static final void method83(int arg0) {
        class52.field1477 = true;
        class39.field1188 = true;
        int var1 = 97 / arg0;
        field250 = true;
        class9.field625 = true;
        class14.field744 = true;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IZI)V")
    public final void method84(int arg0, boolean arg1, int arg2) {
        if (arg0 >= 0) {
            this.field506 = -1;
        }
        signlink.midivol = arg2;
        if (arg1) {
            signlink.midi = "voladjust";
        }
    }

    @OriginalMember(owner = "client!client", name = "x", descriptor = "(I)Ljava/net/Socket;")
    public final Socket method85(int arg0) throws IOException {
        return signlink.mainapp != null ? signlink.opensocket(arg0) : new Socket(InetAddress.getByName(this.getCodeBase().getHost()), arg0);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(LATOBWHST;I)Z")
    public final boolean method86(class1 arg0, int arg1) {
        if (arg1 >= 5 && arg1 <= 5) {
            if (arg0.field10 == null) {
                return false;
            } else {
                for (int var3 = 0; var3 < arg0.field10.length; ++var3) {
                    int var4 = this.method127(var3, -489, arg0);
                    int var5 = arg0.field35[var3];
                    if (arg0.field10[var3] == 2) {
                        if (var4 >= var5) {
                            return false;
                        }
                    } else if (arg0.field10[var3] == 3) {
                        if (var4 <= var5) {
                            return false;
                        }
                    } else if (arg0.field10[var3] == 4) {
                        if (var4 == var5) {
                            return false;
                        }
                    } else if (var4 != var5) {
                        return false;
                    }
                }
                return true;
            }
        } else {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(III)V")
    public final void method87(int arg0, int arg1, int arg2) {
        if (arg1 != 23977) {
            this.field132.method330(173);
        }
        int var4 = 0;
        for (int var5 = 0; var5 < 100; ++var5) {
            if (this.field424[var5] != null) {
                int var6 = this.field422[var5];
                int var7 = 70 - var4 * 14 + this.field367 + 4;
                if (var7 < -20) {
                    break;
                }
                String var8 = this.field423[var5];
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
                if ((var6 == 1 || var6 == 2) && (var6 == 1 || this.field407 == 0 || this.field407 == 1 && this.method137((byte) 106, var8))) {
                    if (arg2 > var7 - 14 && arg2 <= var7 && !var8.equals(field135.field1449)) {
                        if (this.field448 >= 1) {
                            this.field225[this.field272] = "Report abuse @whi@" + var8;
                            this.field180[this.field272] = 376;
                            ++this.field272;
                        }
                        this.field225[this.field272] = "Add ignore @whi@" + var8;
                        this.field180[this.field272] = 720;
                        ++this.field272;
                        this.field225[this.field272] = "Add friend @whi@" + var8;
                        this.field180[this.field272] = 675;
                        ++this.field272;
                    }
                    ++var4;
                }
                if ((var6 == 3 || var6 == 7) && this.field305 == 0 && (var6 == 7 || this.field362 == 0 || this.field362 == 1 && this.method137((byte) 106, var8))) {
                    if (arg2 > var7 - 14 && arg2 <= var7) {
                        if (this.field448 >= 1) {
                            this.field225[this.field272] = "Report abuse @whi@" + var8;
                            this.field180[this.field272] = 376;
                            ++this.field272;
                        }
                        this.field225[this.field272] = "Add ignore @whi@" + var8;
                        this.field180[this.field272] = 720;
                        ++this.field272;
                        this.field225[this.field272] = "Add friend @whi@" + var8;
                        this.field180[this.field272] = 675;
                        ++this.field272;
                    }
                    ++var4;
                }
                if (var6 == 4 && (this.field199 == 0 || this.field199 == 1 && this.method137((byte) 106, var8))) {
                    if (arg2 > var7 - 14 && arg2 <= var7) {
                        this.field225[this.field272] = "Accept trade @whi@" + var8;
                        this.field180[this.field272] = 464;
                        ++this.field272;
                    }
                    ++var4;
                }
                if ((var6 == 5 || var6 == 6) && this.field305 == 0 && this.field362 < 2) {
                    ++var4;
                }
                if (var6 == 8 && (this.field199 == 0 || this.field199 == 1 && this.method137((byte) 106, var8))) {
                    if (arg2 > var7 - 14 && arg2 <= var7) {
                        this.field225[this.field272] = "Accept challenge @whi@" + var8;
                        this.field180[this.field272] = 323;
                        ++this.field272;
                    }
                    ++var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIILATOBWHST;IIIBI)V")
    public final void method88(int arg0, int arg1, int arg2, class1 arg3, int arg4, int arg5, int arg6, byte arg7, int arg8) {
        if (arg7 == 9) {
            boolean var10 = false;
            if (this.field277) {
                this.field321 = 32;
            } else {
                this.field321 = 0;
            }
            this.field277 = false;
            if (arg4 >= arg6 && arg4 < arg6 + 16 && arg1 >= arg8 && arg1 < arg8 + 16) {
                arg3.field62 -= this.field366 * 4;
                if (arg2 == 1) {
                    this.field400 = true;
                }
                if (arg2 == 2 || arg2 == 3) {
                    this.field604 = true;
                }
            } else if (arg4 >= arg6 && arg4 < arg6 + 16 && arg1 >= arg0 + arg8 - 16 && arg1 < arg0 + arg8) {
                arg3.field62 += this.field366 * 4;
                if (arg2 == 1) {
                    this.field400 = true;
                }
                if (arg2 == 2 || arg2 == 3) {
                    this.field604 = true;
                }
            } else if (arg4 >= arg6 - this.field321 && arg4 < arg6 + 16 + this.field321 && arg1 >= arg8 + 16 && arg1 < arg0 + arg8 - 16 && this.field366 > 0) {
                int var11 = (arg0 - 32) * arg0 / arg5;
                if (var11 < 8) {
                    var11 = 8;
                }
                int var12 = arg1 - arg8 - 16 - var11 / 2;
                int var13 = arg0 - 32 - var11;
                arg3.field62 = (arg5 - arg0) * var12 / var13;
                if (arg2 == 1) {
                    this.field400 = true;
                }
                if (arg2 == 2 || arg2 == 3) {
                    this.field604 = true;
                }
                this.field277 = true;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Ljava/lang/String;)Ljava/io/DataInputStream;")
    public final DataInputStream method89(String arg0) throws IOException {
        if (!this.field393) {
            return signlink.mainapp != null ? signlink.openurl(arg0) : new DataInputStream((new URL(this.getCodeBase(), arg0)).openStream());
        } else {
            if (this.field335 != null) {
                try {
                    this.field335.close();
                } catch (Exception var4) {
                }
                this.field335 = null;
            }
            this.field335 = this.method85(43595);
            this.field335.setSoTimeout(10000);
            InputStream var2 = this.field335.getInputStream();
            OutputStream var3 = this.field335.getOutputStream();
            var3.write(("JAGGRAB /" + arg0 + "\n\n").getBytes());
            return new DataInputStream(var2);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIZ)Ljava/lang/String;")
    public static final String method90(int arg0, int arg1, boolean arg2) {
        if (!arg2) {
            field291 = 213;
        }
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

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(Z)V")
    public final void method91(boolean arg0) {
        if (this.field320 == null) {
            this.method146(33560);
            super.field939 = null;
            this.field206 = null;
            this.field207 = null;
            this.field208 = null;
            this.field209 = null;
            this.field210 = null;
            this.field211 = null;
            this.field212 = null;
            this.field213 = null;
            this.field214 = null;
            this.field320 = new class10(96, 479, this.method153(-518), 384);
            this.field318 = new class10(156, 172, this.method153(-518), 384);
            class36.method289(5);
            this.field418.method527(0, 0, this.field578);
            this.field317 = new class10(261, 190, this.method153(-518), 384);
            this.field319 = new class10(334, 512, this.method153(-518), 384);
            class36.method289(5);
            this.field583 = new class10(50, 496, this.method153(-518), 384);
            this.field584 = new class10(37, 269, this.method153(-518), 384);
            this.field585 = new class10(45, 249, this.method153(-518), 384);
            this.field468 = true;
            this.field458 &= arg0;
            this.field319.method186(0);
            class39.field1199 = this.field430;
        }
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        try {
            System.out.println("RS2 user client - release #" + 374);
            if (arg0.length != 5) {
                System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
            } else {
                field247 = Integer.parseInt(arg0[0]);
                field248 = Integer.parseInt(arg0[1]);
                if (arg0[2].equals("lowmem")) {
                    method83(258);
                } else {
                    if (!arg0[2].equals("highmem")) {
                        System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
                        return;
                    }
                    method42(true);
                }
                if (arg0[3].equals("free")) {
                    field249 = false;
                } else {
                    if (!arg0[3].equals("members")) {
                        System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
                        return;
                    }
                    field249 = true;
                }
                signlink.storeid = Integer.parseInt(arg0[4]);
                signlink.startpriv(InetAddress.getLocalHost());
                client var1 = new client();
                var1.method259(765, 503, 0);
            }
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ZIIIIIII)V")
    private final void method92(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (!arg0) {
            field293 = this.field315.method556();
        }
        if (arg6 >= 1 && arg7 >= 1 && arg6 <= 102 && arg7 <= 102) {
            if (field250 && this.field183 != arg4) {
                return;
            }
            int var9 = 0;
            boolean var10 = true;
            boolean var11 = false;
            boolean var12 = false;
            if (arg2 == 0) {
                var9 = this.field449.method497(arg4, arg6, arg7);
            }
            if (arg2 == 1) {
                var9 = this.field449.method498(arg4, -12848, arg7, arg6);
            }
            if (arg2 == 2) {
                var9 = this.field449.method499(arg4, arg6, arg7);
            }
            if (arg2 == 3) {
                var9 = this.field449.method500(arg4, arg6, arg7);
            }
            if (var9 != 0) {
                int var13 = this.field449.method501(arg4, arg6, arg7, var9);
                int var14 = var9 >> 14 & 32767;
                int var15 = var13 & 31;
                int var16 = var13 >> 6;
                if (arg2 == 0) {
                    this.field449.method488(arg7, arg4, arg6, true);
                    class14 var17 = class14.method196(var14);
                    if (var17.field710) {
                        this.field261[arg4].method207(arg7, arg6, var17.field708, var15, 331, var16);
                    }
                }
                if (arg2 == 1) {
                    this.field449.method489(-28, arg7, arg4, arg6);
                }
                if (arg2 == 2) {
                    this.field449.method490(arg6, arg7, arg4, -35309);
                    class14 var18 = class14.method196(var14);
                    if (var18.field702 + arg6 > 103 || var18.field702 + arg7 > 103 || var18.field735 + arg6 > 103 || var18.field735 + arg7 > 103) {
                        return;
                    }
                    if (var18.field710) {
                        this.field261[arg4].method208(var18.field702, 188, var18.field735, arg7, arg6, var16, var18.field708);
                    }
                }
                if (arg2 == 3) {
                    this.field449.method491(arg7, arg4, -87, arg6);
                    class14 var19 = class14.method196(var14);
                    if (var19.field710 && var19.field746) {
                        this.field261[arg4].method210(arg6, (byte) 64, arg7);
                    }
                }
            }
            if (arg3 >= 0) {
                int var20 = arg4;
                if (arg4 < 3 && (this.field555[1][arg6][arg7] & 2) == 2) {
                    var20 = arg4 + 1;
                }
                class9.method169(this.field502, arg4, var20, arg6, this.field261[arg4], arg7, arg3, 850, arg5, arg1, this.field449);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIBII)V")
    public final void method93(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
        int var8 = 2048 - arg5 & 2047;
        int var9 = 2048 - arg2 & 2047;
        int var10 = 0;
        int var11 = 0;
        int var12 = arg1;
        if (var8 != 0) {
            int var13 = class16.field838[var8];
            int var14 = class16.field839[var8];
            int var15 = var11 * var14 - arg1 * var13 >> 16;
            var12 = var11 * var13 + arg1 * var14 >> 16;
            var11 = var15;
        }
        if (var9 != 0) {
            int var16 = class16.field838[var9];
            int var17 = class16.field839[var9];
            int var18 = var10 * var17 + var12 * var16 >> 16;
            var12 = var12 * var17 - var10 * var16 >> 16;
            var10 = var18;
        }
        this.field511 = arg6 - var10;
        this.field512 = arg3 - var11;
        this.field513 = arg0 - var12;
        if (arg4 == -113) {
            this.field514 = arg5;
            this.field515 = arg2;
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(Z)V")
    public final void method94(boolean arg0) {
        this.field318.method186(0);
        if (this.field408 == 2) {
            byte[] var2 = this.field418.field1550;
            int[] var3 = class36.field1149;
            int var4 = var2.length;
            for (int var5 = 0; var5 < var4; ++var5) {
                if (var2[var5] == 0) {
                    var3[var5] = 0;
                }
            }
            this.field510.method552(0, 256, this.field520, this.field606, 33, 25, 1, this.field188, 33, 0, 25);
            this.field319.method186(0);
            class39.field1199 = this.field430;
        } else {
            int var6 = this.field606 + this.field245 & 2047;
            int var7 = field135.field1623 / 32 + 48;
            if (arg0) {
                field446 = this.field315.method556();
            }
            int var8 = 464 - field135.field1624 / 32;
            this.field538.method552(5, this.field438 + 256, this.field587, var6, 146, var7, 1, this.field314, 151, 25, var8);
            this.field510.method552(0, 256, this.field520, this.field606, 33, 25, 1, this.field188, 33, 0, 25);
            for (int var9 = 0; var9 < this.field254; ++var9) {
                int var39 = this.field255[var9] * 4 + 2 - field135.field1623 / 32;
                int var40 = this.field256[var9] * 4 + 2 - field135.field1624 / 32;
                this.method25(var39, this.field461[var9], -129, var40);
            }
            for (int var10 = 0; var10 < 104; ++var10) {
                for (int var35 = 0; var35 < 104; ++var35) {
                    class55 var36 = this.field463[this.field183][var10][var35];
                    if (var36 != null) {
                        int var37 = var10 * 4 + 2 - field135.field1623 / 32;
                        int var38 = var35 * 4 + 2 - field135.field1624 / 32;
                        this.method25(var37, this.field452, -129, var38);
                    }
                }
            }
            for (int var11 = 0; var11 < this.field266; ++var11) {
                class47 var31 = this.field265[this.field267[var11]];
                if (var31 != null && var31.method442(-40574)) {
                    class29 var32 = var31.field1366;
                    if (var32.field1032 != null) {
                        var32 = var32.method266(3);
                    }
                    if (var32 != null && var32.field1055 && var32.field1072) {
                        int var33 = var31.field1623 / 32 - field135.field1623 / 32;
                        int var34 = var31.field1624 / 32 - field135.field1624 / 32;
                        this.method25(var33, this.field453, -129, var34);
                    }
                }
            }
            for (int var12 = 0; var12 < this.field473; ++var12) {
                class49 var23 = this.field472[this.field474[var12]];
                if (var23 != null && var23.method442(-40574)) {
                    int var24 = var23.field1623 / 32 - field135.field1623 / 32;
                    int var25 = var23.field1624 / 32 - field135.field1624 / 32;
                    boolean var26 = false;
                    long var27 = class57.method537(var23.field1449);
                    for (int var29 = 0; var29 < this.field129; ++var29) {
                        if (this.field529[var29] == var27 && this.field377[var29] != 0) {
                            var26 = true;
                            break;
                        }
                    }
                    boolean var30 = false;
                    if (field135.field1445 != 0 && var23.field1445 != 0 && field135.field1445 == var23.field1445) {
                        var30 = true;
                    }
                    if (var26) {
                        this.method25(var24, this.field455, -129, var25);
                    } else if (var30) {
                        this.method25(var24, this.field456, -129, var25);
                    } else {
                        this.method25(var24, this.field454, -129, var25);
                    }
                }
            }
            if (this.field501 != 0 && field581 % 20 < 10) {
                if (this.field501 == 1 && this.field155 >= 0 && this.field155 < this.field265.length) {
                    class47 var13 = this.field265[this.field155];
                    if (var13 != null) {
                        int var14 = var13.field1623 / 32 - field135.field1623 / 32;
                        int var15 = var13.field1624 / 32 - field135.field1624 / 32;
                        this.method56(0, this.field227, var15, var14);
                    }
                }
                if (this.field501 == 2) {
                    int var16 = (this.field216 - this.field401) * 4 + 2 - field135.field1623 / 32;
                    int var17 = (this.field217 - this.field402) * 4 + 2 - field135.field1624 / 32;
                    this.method56(0, this.field227, var17, var16);
                }
                if (this.field501 == 10 && this.field144 >= 0 && this.field144 < this.field472.length) {
                    class49 var18 = this.field472[this.field144];
                    if (var18 != null) {
                        int var19 = var18.field1623 / 32 - field135.field1623 / 32;
                        int var20 = var18.field1624 / 32 - field135.field1624 / 32;
                        this.method56(0, this.field227, var20, var19);
                    }
                }
            }
            if (this.field536 != 0) {
                int var21 = this.field536 * 4 + 2 - field135.field1623 / 32;
                int var22 = this.field537 * 4 + 2 - field135.field1624 / 32;
                this.method25(var21, this.field226, -129, var22);
            }
            class36.method291(97, 3, 42613, 78, 16777215, 3);
            this.field319.method186(0);
            class39.field1199 = this.field430;
        }
    }

    @OriginalMember(owner = "client!client", name = "l", descriptor = "(B)V")
    public final void method95(byte arg0) {
        if (arg0 != 41) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        if (super.field952 == 1) {
            if (super.field953 >= 539 && super.field953 <= 573 && super.field954 >= 169 && super.field954 < 205 && this.field574[0] != -1) {
                this.field400 = true;
                this.field522 = 0;
                this.field182 = true;
            }
            if (super.field953 >= 569 && super.field953 <= 599 && super.field954 >= 168 && super.field954 < 205 && this.field574[1] != -1) {
                this.field400 = true;
                this.field522 = 1;
                this.field182 = true;
            }
            if (super.field953 >= 597 && super.field953 <= 627 && super.field954 >= 168 && super.field954 < 205 && this.field574[2] != -1) {
                this.field400 = true;
                this.field522 = 2;
                this.field182 = true;
            }
            if (super.field953 >= 625 && super.field953 <= 669 && super.field954 >= 168 && super.field954 < 203 && this.field574[3] != -1) {
                this.field400 = true;
                this.field522 = 3;
                this.field182 = true;
            }
            if (super.field953 >= 666 && super.field953 <= 696 && super.field954 >= 168 && super.field954 < 205 && this.field574[4] != -1) {
                this.field400 = true;
                this.field522 = 4;
                this.field182 = true;
            }
            if (super.field953 >= 694 && super.field953 <= 724 && super.field954 >= 168 && super.field954 < 205 && this.field574[5] != -1) {
                this.field400 = true;
                this.field522 = 5;
                this.field182 = true;
            }
            if (super.field953 >= 722 && super.field953 <= 756 && super.field954 >= 169 && super.field954 < 205 && this.field574[6] != -1) {
                this.field400 = true;
                this.field522 = 6;
                this.field182 = true;
            }
            if (super.field953 >= 540 && super.field953 <= 574 && super.field954 >= 466 && super.field954 < 502 && this.field574[7] != -1) {
                this.field400 = true;
                this.field522 = 7;
                this.field182 = true;
            }
            if (super.field953 >= 572 && super.field953 <= 602 && super.field954 >= 466 && super.field954 < 503 && this.field574[8] != -1) {
                this.field400 = true;
                this.field522 = 8;
                this.field182 = true;
            }
            if (super.field953 >= 599 && super.field953 <= 629 && super.field954 >= 466 && super.field954 < 503 && this.field574[9] != -1) {
                this.field400 = true;
                this.field522 = 9;
                this.field182 = true;
            }
            if (super.field953 >= 627 && super.field953 <= 671 && super.field954 >= 467 && super.field954 < 502 && this.field574[10] != -1) {
                this.field400 = true;
                this.field522 = 10;
                this.field182 = true;
            }
            if (super.field953 >= 669 && super.field953 <= 699 && super.field954 >= 466 && super.field954 < 503 && this.field574[11] != -1) {
                this.field400 = true;
                this.field522 = 11;
                this.field182 = true;
            }
            if (super.field953 >= 696 && super.field953 <= 726 && super.field954 >= 466 && super.field954 < 503 && this.field574[12] != -1) {
                this.field400 = true;
                this.field522 = 12;
                this.field182 = true;
            }
            if (super.field953 >= 724 && super.field953 <= 758 && super.field954 >= 466 && super.field954 < 502 && this.field574[13] != -1) {
                this.field400 = true;
                this.field522 = 13;
                this.field182 = true;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
    public final void method96(int arg0) {
        if (arg0 == 0) {
            this.field468 = true;
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(Z)V")
    public final void method97(boolean arg0) {
        if (this.field305 != 0) {
            int var2 = 0;
            if (!arg0) {
                if (this.field527 != 0) {
                    var2 = 1;
                }
                for (int var3 = 0; var3 < 100; ++var3) {
                    if (this.field424[var3] != null) {
                        int var4 = this.field422[var3];
                        String var5 = this.field423[var3];
                        boolean var6 = false;
                        if (var5 != null && var5.startsWith("@cr1@")) {
                            var5 = var5.substring(5);
                            boolean var7 = true;
                        }
                        if (var5 != null && var5.startsWith("@cr2@")) {
                            var5 = var5.substring(5);
                            boolean var8 = true;
                        }
                        if ((var4 == 3 || var4 == 7) && (var4 == 7 || this.field362 == 0 || this.field362 == 1 && this.method137((byte) 106, var5))) {
                            int var9 = 329 - var2 * 13;
                            if (super.field946 > 4 && super.field947 - 4 > var9 - 10 && super.field947 - 4 <= var9 + 3) {
                                int var10 = this.field231.method588("From:  " + var5 + this.field424[var3], true) + 25;
                                if (var10 > 450) {
                                    var10 = 450;
                                }
                                if (super.field946 < var10 + 4) {
                                    if (this.field448 >= 1) {
                                        this.field225[this.field272] = "Report abuse @whi@" + var5;
                                        this.field180[this.field272] = 2376;
                                        ++this.field272;
                                    }
                                    this.field225[this.field272] = "Add ignore @whi@" + var5;
                                    this.field180[this.field272] = 2720;
                                    ++this.field272;
                                    this.field225[this.field272] = "Add friend @whi@" + var5;
                                    this.field180[this.field272] = 2675;
                                    ++this.field272;
                                }
                            }
                            ++var2;
                            if (var2 >= 5) {
                                return;
                            }
                        }
                        if ((var4 == 5 || var4 == 6) && this.field362 < 2) {
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

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(IIIIII)V")
    public final void method98(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = this.field449.method497(arg5, arg1, arg4);
        if (arg0 >= 5 && arg0 <= 5) {
            if (var7 != 0) {
                int var8 = this.field449.method501(arg5, arg1, arg4, var7);
                int var9 = var8 >> 6 & 3;
                int var10 = var8 & 31;
                int var11 = arg3;
                if (var7 > 0) {
                    var11 = arg2;
                }
                int[] var12 = this.field538.field1583;
                int var13 = (103 - arg4) * 512 * 4 + arg1 * 4 + 24624;
                int var14 = var7 >> 14 & 32767;
                class14 var15 = class14.method196(var14);
                if (var15.field699 != -1) {
                    class54 var16 = this.field168[var15.field699];
                    if (var16 != null) {
                        int var17 = (var15.field702 * 4 - var16.field1552) / 2;
                        int var18 = (var15.field735 * 4 - var16.field1553) / 2;
                        var16.method527((104 - arg4 - var15.field735) * 4 + 48 + var18, arg1 * 4 + 48 + var17, this.field578);
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
            int var19 = this.field449.method499(arg5, arg1, arg4);
            if (var19 != 0) {
                int var20 = this.field449.method501(arg5, arg1, arg4, var19);
                int var21 = var20 >> 6 & 3;
                int var22 = var20 & 31;
                int var23 = var19 >> 14 & 32767;
                class14 var24 = class14.method196(var23);
                if (var24.field699 != -1) {
                    class54 var25 = this.field168[var24.field699];
                    if (var25 != null) {
                        int var26 = (var24.field702 * 4 - var25.field1552) / 2;
                        int var27 = (var24.field735 * 4 - var25.field1553) / 2;
                        var25.method527((104 - arg4 - var24.field735) * 4 + 48 + var27, arg1 * 4 + 48 + var26, this.field578);
                    }
                } else if (var22 == 9) {
                    int var28 = 15658734;
                    if (var19 > 0) {
                        var28 = 15597568;
                    }
                    int[] var29 = this.field538.field1583;
                    int var30 = (103 - arg4) * 512 * 4 + arg1 * 4 + 24624;
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
            int var31 = this.field449.method500(arg5, arg1, arg4);
            if (var31 != 0) {
                int var32 = var31 >> 14 & 32767;
                class14 var33 = class14.method196(var32);
                if (var33.field699 != -1) {
                    class54 var34 = this.field168[var33.field699];
                    if (var34 != null) {
                        int var35 = (var33.field702 * 4 - var34.field1552) / 2;
                        int var36 = (var33.field735 * 4 - var34.field1553) / 2;
                        var34.method527((104 - arg4 - var33.field735) * 4 + 48 + var36, arg1 * 4 + 48 + var35, this.field578);
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IILTPTANZXN;II)V")
    public final void method99(int arg0, int arg1, class49 arg2, int arg3, int arg4) {
        if (field135 != arg2) {
            if (this.field272 < 400) {
                String var6;
                if (arg2.field1428 == 0) {
                    var6 = arg2.field1449 + method90(arg2.field1438, field135.field1438, true) + " (level-" + arg2.field1438 + ")";
                } else {
                    var6 = arg2.field1449 + " (skill-" + arg2.field1428 + ")";
                }
                if (this.field589 == 1) {
                    this.field225[this.field272] = "Use " + this.field593 + " with @whi@" + var6;
                    this.field180[this.field272] = 56;
                    this.field181[this.field272] = arg3;
                    this.field178[this.field272] = arg4;
                    this.field179[this.field272] = arg1;
                    ++this.field272;
                } else if (this.field479 == 1) {
                    if ((this.field481 & 8) == 8) {
                        this.field225[this.field272] = this.field482 + " @whi@" + var6;
                        this.field180[this.field272] = 891;
                        this.field181[this.field272] = arg3;
                        this.field178[this.field272] = arg4;
                        this.field179[this.field272] = arg1;
                        ++this.field272;
                    }
                } else {
                    for (int var7 = 4; var7 >= 0; --var7) {
                        if (this.field352[var7] != null) {
                            this.field225[this.field272] = this.field352[var7] + " @whi@" + var6;
                            short var10 = 0;
                            if (this.field352[var7].equalsIgnoreCase("attack")) {
                                if (arg2.field1438 > field135.field1438) {
                                    var10 = 2000;
                                }
                                if (field135.field1445 != 0 && arg2.field1445 != 0) {
                                    if (field135.field1445 == arg2.field1445) {
                                        var10 = 2000;
                                    } else {
                                        var10 = 0;
                                    }
                                }
                            } else if (this.field353[var7]) {
                                var10 = 2000;
                            }
                            if (var7 == 0) {
                                this.field180[this.field272] = var10 + 426;
                            }
                            if (var7 == 1) {
                                this.field180[this.field272] = var10 + 629;
                            }
                            if (var7 == 2) {
                                this.field180[this.field272] = var10 + 863;
                            }
                            if (var7 == 3) {
                                this.field180[this.field272] = var10 + 266;
                            }
                            if (var7 == 4) {
                                this.field180[this.field272] = var10 + 886;
                            }
                            this.field181[this.field272] = arg3;
                            this.field178[this.field272] = arg4;
                            this.field179[this.field272] = arg1;
                            ++this.field272;
                        }
                    }
                }
                for (int var8 = 0; var8 < this.field272; ++var8) {
                    if (this.field180[var8] == 616) {
                        this.field225[var8] = "Walk here @whi@" + var6;
                        break;
                    }
                }
                int var9 = 72 / arg0;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(IIZ)Z")
    public final boolean method100(int arg0, int arg1, boolean arg2) {
        boolean var4 = false;
        class1 var5 = class1.method4(arg1);
        for (int var6 = 0; var6 < var5.field30.length && var5.field30[var6] != -1; ++var6) {
            class1 var7 = class1.method4(var5.field30[var6]);
            if (var7.field63 == 0) {
                var4 |= this.method100(arg0, var7.field18, true);
            }
            if (var7.field63 == 6 && (var7.field11 != -1 || var7.field12 != -1)) {
                boolean var8 = this.method86(var7, 5);
                int var9;
                if (var8) {
                    var9 = var7.field12;
                } else {
                    var9 = var7.field11;
                }
                if (var9 != -1) {
                    class2 var10 = class2.field77[var9];
                    var7.field71 += arg0;
                    while (var7.field71 > var10.method12(var7.field75, 214)) {
                        var7.field71 -= var10.method12(var7.field75, 214);
                        ++var7.field75;
                        if (var7.field75 >= var10.field78) {
                            var7.field75 -= var10.field82;
                            if (var7.field75 < 0 || var7.field75 >= var10.field78) {
                                var7.field75 = 0;
                            }
                        }
                        var4 = true;
                    }
                }
            }
            if (var7.field63 == 6 && var7.field54 != 0) {
                int var11 = var7.field54 >> 16;
                int var12 = var7.field54 << 16 >> 16;
                int var13 = arg0 * var11;
                int var14 = arg0 * var12;
                var7.field40 = var7.field40 + var13 & 2047;
                var7.field41 = var7.field41 + var14 & 2047;
                var4 = true;
            }
        }
        if (!arg2) {
            this.field244 = !this.field244;
        }
        return var4;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(ILPQBRPYKE;I)V")
    private final void method101(int arg0, class41 arg1, int arg2) {
        while (true) {
            if (arg1.field1242 + 21 < arg2 * 8) {
                int var4 = arg1.method351(14, 0);
                if (var4 != 16383) {
                    if (this.field265[var4] == null) {
                        this.field265[var4] = new class47();
                    }
                    class47 var5 = this.field265[var4];
                    this.field267[this.field266++] = var4;
                    var5.field1645 = field581;
                    int var6 = arg1.method351(1, 0);
                    int var7 = arg1.method351(5, 0);
                    if (var7 > 15) {
                        var7 -= 32;
                    }
                    int var8 = arg1.method351(1, 0);
                    if (var8 == 1) {
                        this.field476[this.field475++] = var4;
                    }
                    var5.field1366 = class29.method269(arg1.method351(13, 0));
                    int var9 = arg1.method351(5, 0);
                    if (var9 > 15) {
                        var9 -= 32;
                    }
                    var5.field1613 = var5.field1366.field1054;
                    var5.field1626 = var5.field1366.field1039;
                    var5.field1615 = var5.field1366.field1059;
                    var5.field1616 = var5.field1366.field1068;
                    var5.field1617 = var5.field1366.field1036;
                    var5.field1618 = var5.field1366.field1038;
                    var5.field1641 = var5.field1366.field1034;
                    var5.method561(field135.field1632[0] + var7, 0, var6 == 1, field135.field1631[0] + var9);
                    continue;
                }
            }
            arg1.method352(true);
            if (arg0 != 0) {
                this.method121();
                return;
            }
            return;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;II)V")
    public final void method102(String arg0, String arg1, int arg2, int arg3) {
        if (arg3 == 0 && this.field443 != -1) {
            this.field345 = arg0;
            super.field952 = 0;
        }
        if (this.field447 == -1) {
            this.field604 = true;
        }
        for (int var5 = 99; var5 > 0; --var5) {
            this.field422[var5] = this.field422[var5 - 1];
            this.field423[var5] = this.field423[var5 - 1];
            this.field424[var5] = this.field424[var5 - 1];
        }
        this.field422[0] = arg3;
        this.field423[0] = arg1;
        this.field424[0] = arg0;
        while (arg2 >= 0) {
            this.field578 = 283;
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(IZ)V")
    public final void method103(int arg0, boolean arg1) {
        this.method41(7);
        if (arg0 < 0) {
            this.field208.method186(0);
            this.field241.method527(0, 0, this.field578);
            short var3 = 360;
            short var4 = 200;
            if (this.field336 == 0) {
                int var5 = var4 / 2 + 80;
                this.field230.method587(var3 / 2, 7711145, var5, this.field262.field1256, true, -104);
                int var6 = var4 / 2 - 20;
                this.field232.method587(var3 / 2, 16776960, var6, "Welcome to RuneScape", true, -104);
                int var17 = var6 + 30;
                int var7 = var3 / 2 - 80;
                int var8 = var4 / 2 + 20;
                this.field242.method527(var8 - 20, var7 - 73, this.field578);
                this.field232.method587(var7, 16777215, var8 + 5, "New User", true, -104);
                int var9 = var3 / 2 + 80;
                this.field242.method527(var8 - 20, var9 - 73, this.field578);
                this.field232.method587(var9, 16777215, var8 + 5, "Existing User", true, -104);
            }
            if (this.field336 == 2) {
                int var10 = var4 / 2 - 40;
                if (this.field465.length() > 0) {
                    this.field232.method587(var3 / 2, 16776960, var10 - 15, this.field465, true, -104);
                    this.field232.method587(var3 / 2, 16776960, var10, this.field466, true, -104);
                    var10 += 30;
                } else {
                    this.field232.method587(var3 / 2, 16776960, var10 - 7, this.field466, true, -104);
                    var10 += 30;
                }
                this.field232.method594(var3 / 2 - 90, "Username: " + this.field204 + (this.field355 == 0 & field581 % 40 < 20 ? "@yel@|" : ""), var10, 16777215, this.field124, true);
                var10 += 15;
                this.field232.method594(var3 / 2 - 88, "Password: " + class57.method542(-40219, this.field205) + (this.field355 == 1 & field581 % 40 < 20 ? "@yel@|" : ""), var10, 16777215, this.field124, true);
                var10 += 15;
                if (!arg1) {
                    int var11 = var3 / 2 - 80;
                    int var12 = var4 / 2 + 50;
                    this.field242.method527(var12 - 20, var11 - 73, this.field578);
                    this.field232.method587(var11, 16777215, var12 + 5, "Login", true, -104);
                    int var13 = var3 / 2 + 80;
                    this.field242.method527(var12 - 20, var13 - 73, this.field578);
                    this.field232.method587(var13, 16777215, var12 + 5, "Cancel", true, -104);
                }
            }
            if (this.field336 == 3) {
                this.field232.method587(var3 / 2, 16776960, var4 / 2 - 60, "Create a free account", true, -104);
                int var14 = var4 / 2 - 35;
                this.field232.method587(var3 / 2, 16777215, var14, "To create a new account you need to", true, -104);
                int var18 = var14 + 15;
                this.field232.method587(var3 / 2, 16777215, var18, "go back to the main RuneScape webpage", true, -104);
                int var19 = var18 + 15;
                this.field232.method587(var3 / 2, 16777215, var19, "and choose the 'create account'", true, -104);
                int var20 = var19 + 15;
                this.field232.method587(var3 / 2, 16777215, var20, "button near the top of that page.", true, -104);
                int var21 = var20 + 15;
                int var15 = var3 / 2;
                int var16 = var4 / 2 + 50;
                this.field242.method527(var16 - 20, var15 - 73, this.field578);
                this.field232.method587(var15, 16777215, var16 + 5, "Cancel", true, -104);
            }
            this.field208.method187(0, 202, super.field938, 171);
            if (this.field468) {
                this.field468 = false;
                this.field206.method187(0, 128, super.field938, 0);
                this.field207.method187(0, 202, super.field938, 371);
                this.field211.method187(0, 0, super.field938, 265);
                this.field212.method187(0, 562, super.field938, 265);
                this.field213.method187(0, 128, super.field938, 171);
                this.field214.method187(0, 562, super.field938, 171);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(ZI)Z")
    public final boolean method104(boolean arg0, int arg1) {
        if (arg0) {
            this.field158 = !this.field158;
        }
        if (arg1 < 0) {
            return false;
        } else {
            int var3 = this.field180[arg1];
            if (var3 >= 2000) {
                var3 -= 2000;
            }
            return var3 == 675;
        }
    }

    @OriginalMember(owner = "client!client", name = "y", descriptor = "(I)Ljava/lang/String;")
    public final String method105(int arg0) {
        this.field505 += arg0;
        if (signlink.mainapp != null) {
            return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
        } else {
            return super.field941 != null ? "runescape.com" : super.getDocumentBase().getHost().toLowerCase();
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
    public final void method106(byte arg0) {
        if (arg0 == 2) {
            boolean var2 = false;
            if (!this.field159 && !this.field263 && !this.field221) {
                ++field324;
                if (!this.field458) {
                    this.method103(-892, false);
                } else {
                    this.method76(381);
                }
                this.field366 = 0;
            } else {
                this.method126(-27417);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "z", descriptor = "(I)V")
    public final void method107(int arg0) {
        if (arg0 != -41188) {
            field446 = this.field315.method556();
        }
        int var2 = this.field330;
        int var3 = this.field331;
        int var4 = this.field332;
        int var5 = this.field333;
        int var6 = 6116423;
        class36.method291(var2, var4, 42613, var3, var6, var5);
        class36.method291(var2 + 1, var4 - 2, 42613, var3 + 1, 0, 16);
        class36.method292(var5 - 19, var4 - 2, var2 + 1, var3 + 18, 0, (byte) 1);
        this.field232.method590("Choose Option", var3 + 14, true, var6, var2 + 3);
        int var7 = super.field946;
        int var8 = super.field947;
        if (this.field329 == 0) {
            var7 -= 4;
            var8 -= 4;
        }
        if (this.field329 == 1) {
            var7 -= 553;
            var8 -= 205;
        }
        if (this.field329 == 2) {
            var7 -= 17;
            var8 -= 357;
        }
        for (int var9 = 0; var9 < this.field272; ++var9) {
            int var10 = (this.field272 - 1 - var9) * 15 + var3 + 31;
            int var11 = 16777215;
            if (var7 > var2 && var7 < var2 + var4 && var8 > var10 - 13 && var8 < var10 + 3) {
                var11 = 16776960;
            }
            this.field232.method594(var2 + 3, this.field225[var9], var10, var11, this.field124, true);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IZLPQBRPYKE;)V")
    private final void method108(int arg0, boolean arg1, class41 arg2) {
        arg2.method350(-19202);
        int var4 = arg2.method351(1, 0);
        if (arg1) {
            for (int var5 = 1; var5 > 0; ++var5) {
            }
        }
        if (var4 != 0) {
            int var6 = arg2.method351(2, 0);
            if (var6 == 0) {
                this.field476[this.field475++] = this.field471;
            } else if (var6 == 1) {
                int var7 = arg2.method351(3, 0);
                field135.method563((byte) -78, false, var7);
                int var8 = arg2.method351(1, 0);
                if (var8 == 1) {
                    this.field476[this.field475++] = this.field471;
                }
            } else if (var6 == 2) {
                int var9 = arg2.method351(3, 0);
                field135.method563((byte) -78, true, var9);
                int var10 = arg2.method351(3, 0);
                field135.method563((byte) -78, true, var10);
                int var11 = arg2.method351(1, 0);
                if (var11 == 1) {
                    this.field476[this.field475++] = this.field471;
                }
            } else if (var6 == 3) {
                int var12 = arg2.method351(7, 0);
                int var13 = arg2.method351(1, 0);
                this.field183 = arg2.method351(2, 0);
                int var14 = arg2.method351(7, 0);
                int var15 = arg2.method351(1, 0);
                if (var15 == 1) {
                    this.field476[this.field475++] = this.field471;
                }
                field135.method561(var14, 0, var13 == 1, var12);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IZLATOBWHST;IIIII)V")
    public final void method109(int arg0, boolean arg1, class1 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1) {
            this.field132.method330(219);
        }
        if (arg2.field63 == 0 && arg2.field30 != null && !arg2.field44) {
            if (arg7 >= arg5 && arg0 >= arg4 && arg7 <= arg2.field66 + arg5 && arg0 <= arg2.field52 + arg4) {
                int var9 = arg2.field30.length;
                for (int var10 = 0; var10 < var9; ++var10) {
                    int var11 = arg2.field57[var10] + arg5;
                    int var12 = arg2.field53[var10] + arg4 - arg3;
                    class1 var13 = class1.method4(arg2.field30[var10]);
                    int var14 = var13.field16 + var11;
                    int var15 = var13.field61 + var12;
                    if ((var13.field60 >= 0 || var13.field74 != 0) && arg7 >= var14 && arg0 >= var15 && arg7 < var13.field66 + var14 && arg0 < var13.field52 + var15) {
                        if (var13.field60 >= 0) {
                            this.field351 = var13.field60;
                        } else {
                            this.field351 = var13.field18;
                        }
                    }
                    if (var13.field63 == 8 && arg7 >= var14 && arg0 >= var15 && arg7 < var13.field66 + var14 && arg0 < var13.field52 + var15) {
                        this.field504 = var13.field18;
                    }
                    if (var13.field63 == 0) {
                        this.method109(arg0, false, var13, var13.field62, var15, var14, arg6, arg7);
                        if (var13.field43 > var13.field52) {
                            this.method88(var13.field52, arg0, arg6, var13, arg7, var13.field43, var13.field66 + var14, (byte) 9, var15);
                        }
                    } else {
                        if (var13.field47 == 1 && arg7 >= var14 && arg0 >= var15 && arg7 < var13.field66 + var14 && arg0 < var13.field52 + var15) {
                            boolean var16 = false;
                            if (var13.field26 != 0) {
                                var16 = this.method143(false, var13);
                            }
                            if (!var16) {
                                this.field225[this.field272] = var13.field25;
                                this.field180[this.field272] = 349;
                                this.field179[this.field272] = var13.field18;
                                ++this.field272;
                            }
                        }
                        if (var13.field47 == 2 && this.field479 == 0 && arg7 >= var14 && arg0 >= var15 && arg7 < var13.field66 + var14 && arg0 < var13.field52 + var15) {
                            String var17 = var13.field33;
                            if (var17.indexOf(" ") != -1) {
                                var17 = var17.substring(0, var17.indexOf(" "));
                            }
                            this.field225[this.field272] = var17 + " @gre@" + var13.field64;
                            this.field180[this.field272] = 1;
                            this.field179[this.field272] = var13.field18;
                            ++this.field272;
                        }
                        if (var13.field47 == 3 && arg7 >= var14 && arg0 >= var15 && arg7 < var13.field66 + var14 && arg0 < var13.field52 + var15) {
                            this.field225[this.field272] = "Close";
                            if (arg6 == 3) {
                                this.field180[this.field272] = 699;
                            } else {
                                this.field180[this.field272] = 969;
                            }
                            this.field179[this.field272] = var13.field18;
                            ++this.field272;
                        }
                        if (var13.field47 == 4 && arg7 >= var14 && arg0 >= var15 && arg7 < var13.field66 + var14 && arg0 < var13.field52 + var15) {
                            this.field225[this.field272] = var13.field25;
                            this.field180[this.field272] = 915;
                            this.field179[this.field272] = var13.field18;
                            ++this.field272;
                        }
                        if (var13.field47 == 5 && arg7 >= var14 && arg0 >= var15 && arg7 < var13.field66 + var14 && arg0 < var13.field52 + var15) {
                            this.field225[this.field272] = var13.field25;
                            this.field180[this.field272] = 843;
                            this.field179[this.field272] = var13.field18;
                            ++this.field272;
                        }
                        if (var13.field47 == 6 && !this.field469 && arg7 >= var14 && arg0 >= var15 && arg7 < var13.field66 + var14 && arg0 < var13.field52 + var15) {
                            this.field225[this.field272] = var13.field25;
                            this.field180[this.field272] = 268;
                            this.field179[this.field272] = var13.field18;
                            ++this.field272;
                        }
                        if (var13.field63 == 2) {
                            int var18 = 0;
                            for (int var19 = 0; var19 < var13.field52; ++var19) {
                                for (int var20 = 0; var20 < var13.field66; ++var20) {
                                    int var21 = (var13.field27 + 32) * var20 + var14;
                                    int var22 = (var13.field50 + 32) * var19 + var15;
                                    if (var18 < 20) {
                                        var21 += var13.field17[var18];
                                        var22 += var13.field20[var18];
                                    }
                                    if (arg7 >= var21 && arg0 >= var22 && arg7 < var21 + 32 && arg0 < var22 + 32) {
                                        this.field553 = var18;
                                        this.field554 = var13.field18;
                                        if (var13.field59[var18] > 0) {
                                            class48 var23 = class48.method453(var13.field59[var18] - 1);
                                            if (this.field589 == 1 && var13.field1) {
                                                if (this.field591 != var13.field18 || this.field590 != var18) {
                                                    this.field225[this.field272] = "Use " + this.field593 + " with @lre@" + var23.field1376;
                                                    this.field180[this.field272] = 247;
                                                    this.field181[this.field272] = var23.field1408;
                                                    this.field178[this.field272] = var18;
                                                    this.field179[this.field272] = var13.field18;
                                                    ++this.field272;
                                                }
                                            } else if (this.field479 == 1 && var13.field1) {
                                                if ((this.field481 & 16) == 16) {
                                                    this.field225[this.field272] = this.field482 + " @lre@" + var23.field1376;
                                                    this.field180[this.field272] = 419;
                                                    this.field181[this.field272] = var23.field1408;
                                                    this.field178[this.field272] = var18;
                                                    this.field179[this.field272] = var13.field18;
                                                    ++this.field272;
                                                }
                                            } else {
                                                if (var13.field1) {
                                                    for (int var24 = 4; var24 >= 3; --var24) {
                                                        if (var23.field1382 != null && var23.field1382[var24] != null) {
                                                            this.field225[this.field272] = var23.field1382[var24] + " @lre@" + var23.field1376;
                                                            if (var24 == 3) {
                                                                this.field180[this.field272] = 115;
                                                            }
                                                            if (var24 == 4) {
                                                                this.field180[this.field272] = 547;
                                                            }
                                                            this.field181[this.field272] = var23.field1408;
                                                            this.field178[this.field272] = var18;
                                                            this.field179[this.field272] = var13.field18;
                                                            ++this.field272;
                                                        } else if (var24 == 4) {
                                                            this.field225[this.field272] = "Drop @lre@" + var23.field1376;
                                                            this.field180[this.field272] = 547;
                                                            this.field181[this.field272] = var23.field1408;
                                                            this.field178[this.field272] = var18;
                                                            this.field179[this.field272] = var13.field18;
                                                            ++this.field272;
                                                        }
                                                    }
                                                }
                                                if (var13.field28) {
                                                    this.field225[this.field272] = "Use @lre@" + var23.field1376;
                                                    this.field180[this.field272] = 253;
                                                    this.field181[this.field272] = var23.field1408;
                                                    this.field178[this.field272] = var18;
                                                    this.field179[this.field272] = var13.field18;
                                                    ++this.field272;
                                                }
                                                if (var13.field1 && var23.field1382 != null) {
                                                    for (int var25 = 2; var25 >= 0; --var25) {
                                                        if (var23.field1382[var25] != null) {
                                                            this.field225[this.field272] = var23.field1382[var25] + " @lre@" + var23.field1376;
                                                            if (var25 == 0) {
                                                                this.field180[this.field272] = 479;
                                                            }
                                                            if (var25 == 1) {
                                                                this.field180[this.field272] = 940;
                                                            }
                                                            if (var25 == 2) {
                                                                this.field180[this.field272] = 193;
                                                            }
                                                            this.field181[this.field272] = var23.field1408;
                                                            this.field178[this.field272] = var18;
                                                            this.field179[this.field272] = var13.field18;
                                                            ++this.field272;
                                                        }
                                                    }
                                                }
                                                if (var13.field70 != null) {
                                                    for (int var26 = 4; var26 >= 0; --var26) {
                                                        if (var13.field70[var26] != null) {
                                                            this.field225[this.field272] = var13.field70[var26] + " @lre@" + var23.field1376;
                                                            if (var26 == 0) {
                                                                this.field180[this.field272] = 5;
                                                            }
                                                            if (var26 == 1) {
                                                                this.field180[this.field272] = 871;
                                                            }
                                                            if (var26 == 2) {
                                                                this.field180[this.field272] = 123;
                                                            }
                                                            if (var26 == 3) {
                                                                this.field180[this.field272] = 850;
                                                            }
                                                            if (var26 == 4) {
                                                                this.field180[this.field272] = 670;
                                                            }
                                                            this.field181[this.field272] = var23.field1408;
                                                            this.field178[this.field272] = var18;
                                                            this.field179[this.field272] = var13.field18;
                                                            ++this.field272;
                                                        }
                                                    }
                                                }
                                                this.field225[this.field272] = "Examine @lre@" + var23.field1376;
                                                this.field180[this.field272] = 1327;
                                                this.field181[this.field272] = var23.field1408;
                                                this.field178[this.field272] = var18;
                                                this.field179[this.field272] = var13.field18;
                                                ++this.field272;
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

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
    public final void method110(int arg0) {
        if (arg0 != 0) {
            this.field463 = null;
        }
        if (!this.field159 && !this.field263 && !this.field221) {
            ++field581;
            if (!this.field458) {
                this.method112(this.field171);
            } else {
                this.method131(true);
            }
            this.method54((byte) 7);
        }
    }

    @OriginalMember(owner = "client!client", name = "A", descriptor = "(I)V")
    public final void method111(int arg0) {
        if (this.field491 != arg0) {
            this.field578 = this.field315.method556();
        }
        if (this.field272 >= 2 || this.field589 != 0 || this.field479 != 0) {
            String var2;
            if (this.field589 == 1 && this.field272 < 2) {
                var2 = "Use " + this.field593 + " with...";
            } else if (this.field479 == 1 && this.field272 < 2) {
                var2 = this.field482 + "...";
            } else {
                var2 = this.field225[this.field272 - 1];
            }
            if (this.field272 > 2) {
                var2 = var2 + "@whi@ / " + (this.field272 - 2) + " more options";
            }
            this.field232.method595(16777215, true, true, var2, field581 / 1000, 4, 15);
        }
    }

    @OriginalMember(owner = "client!client", name = "m", descriptor = "(B)V")
    public final void method112(byte arg0) {
        if (arg0 != -119) {
            this.field463 = null;
        }
        if (this.field336 == 0) {
            int var2 = super.field936 / 2 - 80;
            int var3 = super.field937 / 2 + 20;
            int var14 = var3 + 20;
            if (super.field952 == 1 && super.field953 >= var2 - 75 && super.field953 <= var2 + 75 && super.field954 >= var14 - 20 && super.field954 <= var14 + 20) {
                this.field336 = 3;
                this.field355 = 0;
            }
            int var4 = super.field936 / 2 + 80;
            if (super.field952 == 1 && super.field953 >= var4 - 75 && super.field953 <= var4 + 75 && super.field954 >= var14 - 20 && super.field954 <= var14 + 20) {
                this.field465 = "";
                this.field466 = "Enter your username & password.";
                this.field336 = 2;
                this.field355 = 0;
            }
        } else if (this.field336 == 2) {
            int var5 = super.field937 / 2 - 40;
            int var15 = var5 + 30;
            int var16 = var15 + 25;
            if (super.field952 == 1 && super.field954 >= var16 - 15 && super.field954 < var16) {
                this.field355 = 0;
            }
            var5 = var16 + 15;
            if (super.field952 == 1 && super.field954 >= var5 - 15 && super.field954 < var5) {
                this.field355 = 1;
            }
            var5 += 15;
            int var6 = super.field936 / 2 - 80;
            int var7 = super.field937 / 2 + 50;
            int var17 = var7 + 20;
            if (super.field952 == 1 && super.field953 >= var6 - 75 && super.field953 <= var6 + 75 && super.field954 >= var17 - 20 && super.field954 <= var17 + 20) {
                this.field154 = 0;
                this.method32(this.field204, this.field205, false);
                if (this.field458) {
                    return;
                }
            }
            int var8 = super.field936 / 2 + 80;
            if (super.field952 == 1 && super.field953 >= var8 - 75 && super.field953 <= var8 + 75 && super.field954 >= var17 - 20 && super.field954 <= var17 + 20) {
                this.field336 = 0;
                this.field204 = "";
                this.field205 = "";
            }
            while (true) {
                while (true) {
                    int var9 = this.method263(-198);
                    if (var9 == -1) {
                        return;
                    }
                    boolean var10 = false;
                    for (int var11 = 0; var11 < field457.length(); ++var11) {
                        if (var9 == field457.charAt(var11)) {
                            var10 = true;
                            break;
                        }
                    }
                    if (this.field355 == 0) {
                        if (var9 == 8 && this.field204.length() > 0) {
                            this.field204 = this.field204.substring(0, this.field204.length() - 1);
                        }
                        if (var9 == 9 || var9 == 10 || var9 == 13) {
                            this.field355 = 1;
                        }
                        if (var10) {
                            this.field204 = this.field204 + (char) var9;
                        }
                        if (this.field204.length() > 12) {
                            this.field204 = this.field204.substring(0, 12);
                        }
                    } else if (this.field355 == 1) {
                        if (var9 == 8 && this.field205.length() > 0) {
                            this.field205 = this.field205.substring(0, this.field205.length() - 1);
                        }
                        if (var9 == 9 || var9 == 10 || var9 == 13) {
                            this.field355 = 0;
                        }
                        if (var10) {
                            this.field205 = this.field205 + (char) var9;
                        }
                        if (this.field205.length() > 20) {
                            this.field205 = this.field205.substring(0, 20);
                        }
                    }
                }
            }
        } else {
            if (this.field336 == 3) {
                int var12 = super.field936 / 2;
                int var13 = super.field937 / 2 + 50;
                int var18 = var13 + 20;
                if (super.field952 == 1 && super.field953 >= var12 - 75 && super.field953 <= var12 + 75 && super.field954 >= var18 - 20 && super.field954 <= var18 + 20) {
                    this.field336 = 0;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IILJRELGTVY;II)V")
    public final void method113(int arg0, int arg1, class29 arg2, int arg3, int arg4) {
        if (arg1 < 0) {
            if (this.field272 < 400) {
                if (arg2.field1032 != null) {
                    arg2 = arg2.method266(3);
                }
                if (arg2 != null) {
                    if (arg2.field1072) {
                        String var6 = arg2.field1064;
                        if (arg2.field1052 != 0) {
                            var6 = var6 + method90(arg2.field1052, field135.field1438, true) + " (level-" + arg2.field1052 + ")";
                        }
                        if (this.field589 == 1) {
                            this.field225[this.field272] = "Use " + this.field593 + " with @yel@" + var6;
                            this.field180[this.field272] = 564;
                            this.field181[this.field272] = arg3;
                            this.field178[this.field272] = arg0;
                            this.field179[this.field272] = arg4;
                            ++this.field272;
                        } else {
                            if (this.field479 == 1) {
                                if ((this.field481 & 2) == 2) {
                                    this.field225[this.field272] = this.field482 + " @yel@" + var6;
                                    this.field180[this.field272] = 257;
                                    this.field181[this.field272] = arg3;
                                    this.field178[this.field272] = arg0;
                                    this.field179[this.field272] = arg4;
                                    ++this.field272;
                                    return;
                                }
                            } else {
                                if (arg2.field1033 != null) {
                                    for (int var7 = 4; var7 >= 0; --var7) {
                                        if (arg2.field1033[var7] != null && !arg2.field1033[var7].equalsIgnoreCase("attack")) {
                                            this.field225[this.field272] = arg2.field1033[var7] + " @yel@" + var6;
                                            if (var7 == 0) {
                                                this.field180[this.field272] = 165;
                                            }
                                            if (var7 == 1) {
                                                this.field180[this.field272] = 19;
                                            }
                                            if (var7 == 2) {
                                                this.field180[this.field272] = 857;
                                            }
                                            if (var7 == 3) {
                                                this.field180[this.field272] = 659;
                                            }
                                            if (var7 == 4) {
                                                this.field180[this.field272] = 619;
                                            }
                                            this.field181[this.field272] = arg3;
                                            this.field178[this.field272] = arg0;
                                            this.field179[this.field272] = arg4;
                                            ++this.field272;
                                        }
                                    }
                                }
                                if (arg2.field1033 != null) {
                                    for (int var8 = 4; var8 >= 0; --var8) {
                                        if (arg2.field1033[var8] != null && arg2.field1033[var8].equalsIgnoreCase("attack")) {
                                            short var9 = 0;
                                            if (arg2.field1052 > field135.field1438) {
                                                var9 = 2000;
                                            }
                                            this.field225[this.field272] = arg2.field1033[var8] + " @yel@" + var6;
                                            if (var8 == 0) {
                                                this.field180[this.field272] = var9 + 165;
                                            }
                                            if (var8 == 1) {
                                                this.field180[this.field272] = var9 + 19;
                                            }
                                            if (var8 == 2) {
                                                this.field180[this.field272] = var9 + 857;
                                            }
                                            if (var8 == 3) {
                                                this.field180[this.field272] = var9 + 659;
                                            }
                                            if (var8 == 4) {
                                                this.field180[this.field272] = var9 + 619;
                                            }
                                            this.field181[this.field272] = arg3;
                                            this.field178[this.field272] = arg0;
                                            this.field179[this.field272] = arg4;
                                            ++this.field272;
                                        }
                                    }
                                }
                                this.field225[this.field272] = "Examine @yel@" + var6;
                                this.field180[this.field272] = 1505;
                                this.field181[this.field272] = arg3;
                                this.field178[this.field272] = arg0;
                                this.field179[this.field272] = arg4;
                                ++this.field272;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "n", descriptor = "(B)V")
    public final void method114(byte arg0) {
        this.field320.method186(0);
        if (arg0 == 0) {
            boolean var2 = false;
            class39.field1199 = this.field428;
            this.field419.method527(0, 0, this.field578);
            if (this.field166) {
                this.field232.method586(this.field347, 239, 8, 0, 40);
                this.field232.method586(this.field138 + "*", 239, 8, 128, 60);
            } else if (this.field526 == 1) {
                this.field232.method586("Enter amount:", 239, 8, 0, 40);
                this.field232.method586(this.field122 + "*", 239, 8, 128, 60);
            } else if (this.field526 == 2) {
                this.field232.method586("Enter name:", 239, 8, 0, 40);
                this.field232.method586(this.field122 + "*", 239, 8, 128, 60);
            } else if (this.field526 == 3) {
                if (this.field161 != this.field122) {
                    this.method117(this.field122, this.field411);
                    this.field161 = this.field122;
                }
                class70 var3 = this.field231;
                class36.method288(0, 77, 0, 463, -586);
                for (int var4 = 0; var4 < this.field162; ++var4) {
                    int var5 = var4 * 14 + 18 - this.field165;
                    if (var5 > 0 && var5 < 110) {
                        var3.method586(this.field163[var4], 239, 8, 0, var5);
                    }
                }
                class36.method287(true);
                if (this.field162 > 5) {
                    this.method28(this.field165, this.field162 * 14 + 7, 77, 0, 463, 6);
                }
                if (this.field122.length() == 0) {
                    this.field232.method586("Enter object name", 239, 8, 255, 40);
                } else if (this.field162 == 0) {
                    this.field232.method586("No matching objects found, please shorten search", 239, 8, 0, 40);
                }
                var3.method586(this.field122 + "*", 239, 8, 0, 90);
                class36.method294(0, 77, 479, 0, 0);
            } else if (this.field345 != null) {
                this.field232.method586(this.field345, 239, 8, 0, 40);
                this.field232.method586("Click to continue", 239, 8, 128, 60);
            } else if (this.field447 != -1) {
                this.method47(0, class1.method4(this.field447), this.field198, 0, 0);
            } else if (this.field443 != -1) {
                this.method47(0, class1.method4(this.field443), this.field198, 0, 0);
            } else {
                class70 var6 = this.field231;
                int var7 = 0;
                class36.method288(0, 77, 0, 463, -586);
                for (int var8 = 0; var8 < 100; ++var8) {
                    if (this.field424[var8] != null) {
                        int var10 = this.field422[var8];
                        int var11 = 70 - var7 * 14 + this.field367;
                        String var12 = this.field423[var8];
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
                                var6.method590(this.field424[var8], var11, true, 0, 4);
                            }
                            ++var7;
                        }
                        if ((var10 == 1 || var10 == 2) && (var10 == 1 || this.field407 == 0 || this.field407 == 1 && this.method137((byte) 106, var12))) {
                            if (var11 > 0 && var11 < 110) {
                                int var14 = 4;
                                if (var13 == 1) {
                                    this.field169[0].method527(var11 - 12, var14, this.field578);
                                    var14 += 14;
                                }
                                if (var13 == 2) {
                                    this.field169[1].method527(var11 - 12, var14, this.field578);
                                    var14 += 14;
                                }
                                var6.method590(var12 + ":", var11, true, 0, var14);
                                int var15 = var14 + var6.method588(var12, true) + 8;
                                var6.method590(this.field424[var8], var11, true, 255, var15);
                            }
                            ++var7;
                        }
                        if ((var10 == 3 || var10 == 7) && this.field305 == 0 && (var10 == 7 || this.field362 == 0 || this.field362 == 1 && this.method137((byte) 106, var12))) {
                            if (var11 > 0 && var11 < 110) {
                                byte var16 = 4;
                                var6.method590("From", var11, true, 0, var16);
                                int var17 = var16 + var6.method588("From ", true);
                                if (var13 == 1) {
                                    this.field169[0].method527(var11 - 12, var17, this.field578);
                                    var17 += 14;
                                }
                                if (var13 == 2) {
                                    this.field169[1].method527(var11 - 12, var17, this.field578);
                                    var17 += 14;
                                }
                                var6.method590(var12 + ":", var11, true, 0, var17);
                                int var18 = var17 + var6.method588(var12, true) + 8;
                                var6.method590(this.field424[var8], var11, true, 8388608, var18);
                            }
                            ++var7;
                        }
                        if (var10 == 4 && (this.field199 == 0 || this.field199 == 1 && this.method137((byte) 106, var12))) {
                            if (var11 > 0 && var11 < 110) {
                                var6.method590(var12 + " " + this.field424[var8], var11, true, 8388736, 4);
                            }
                            ++var7;
                        }
                        if (var10 == 5 && this.field305 == 0 && this.field362 < 2) {
                            if (var11 > 0 && var11 < 110) {
                                var6.method590(this.field424[var8], var11, true, 8388608, 4);
                            }
                            ++var7;
                        }
                        if (var10 == 6 && this.field305 == 0 && this.field362 < 2) {
                            if (var11 > 0 && var11 < 110) {
                                var6.method590("To " + var12 + ":", var11, true, 0, 4);
                                var6.method590(this.field424[var8], var11, true, 8388608, 12 + var6.method588("To " + var12, true));
                            }
                            ++var7;
                        }
                        if (var10 == 8 && (this.field199 == 0 || this.field199 == 1 && this.method137((byte) 106, var12))) {
                            if (var11 > 0 && var11 < 110) {
                                var6.method590(var12 + " " + this.field424[var8], var11, true, 8270336, 4);
                            }
                            ++var7;
                        }
                    }
                }
                class36.method287(true);
                this.field494 = var7 * 14 + 7;
                if (this.field494 < 78) {
                    this.field494 = 78;
                }
                this.method28(this.field494 - this.field367 - 77, this.field494, 77, 0, 463, 6);
                String var9;
                if (field135 != null && field135.field1449 != null) {
                    var9 = field135.field1449;
                } else {
                    var9 = class57.method541(0, this.field204);
                }
                var6.method590(var9 + ":", 90, true, 0, 4);
                var6.method590(this.field364 + "*", 90, true, 255, 6 + var6.method588(var9 + ": ", true));
                class36.method294(0, 77, 479, 0, 0);
            }
            if (this.field173 && this.field329 == 2) {
                this.method107(-41188);
            }
            this.field320.method187(0, 17, super.field938, 357);
            this.field319.method186(0);
            class39.field1199 = this.field430;
        }
    }

    @OriginalMember(owner = "client!client", name = "B", descriptor = "(I)V")
    public final void method115(int arg0) {
        int var2 = 94 / arg0;
        for (class22 var3 = (class22) this.field294.method532(); var3 != null; var3 = (class22) this.field294.method534(-420)) {
            if (this.field183 == var3.field889 && !var3.field884) {
                if (field581 >= var3.field885) {
                    var3.method256(this.field253, -10939);
                    if (var3.field884) {
                        var3.method163();
                    } else {
                        this.field449.method482(-1, var3, false, var3.field889, var3.field892, 60, 42850, var3.field890, 0, var3.field891);
                    }
                }
            } else {
                var3.method163();
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(Z)V")
    public final void method116(boolean arg0) {
        byte[] var2 = this.field125.method560("title.dat", (byte[]) null);
        class58 var3 = new class58(var2, this);
        this.field209.method186(0);
        var3.method546((byte) -49, 0, 0);
        this.field210.method186(0);
        var3.method546((byte) -49, -637, 0);
        this.field206.method186(0);
        var3.method546((byte) -49, -128, 0);
        this.field207.method186(0);
        var3.method546((byte) -49, -202, -371);
        this.field208.method186(0);
        var3.method546((byte) -49, -202, -171);
        this.field211.method186(0);
        var3.method546((byte) -49, 0, -265);
        this.field212.method186(0);
        var3.method546((byte) -49, -562, -265);
        this.field213.method186(0);
        var3.method546((byte) -49, -128, -171);
        this.field214.method186(0);
        var3.method546((byte) -49, -562, -171);
        int[] var4 = new int[var3.field1584];
        for (int var5 = 0; var5 < var3.field1585; ++var5) {
            for (int var10 = 0; var10 < var3.field1584; ++var10) {
                var4[var10] = var3.field1583[var3.field1584 * var5 + (var3.field1584 - var10 - 1)];
            }
            for (int var11 = 0; var11 < var3.field1584; ++var11) {
                var3.field1583[var3.field1584 * var5 + var11] = var4[var11];
            }
        }
        this.field209.method186(0);
        var3.method546((byte) -49, 382, 0);
        this.field210.method186(0);
        var3.method546((byte) -49, -255, 0);
        this.field206.method186(0);
        var3.method546((byte) -49, 254, 0);
        this.field207.method186(0);
        var3.method546((byte) -49, 180, -371);
        this.field208.method186(0);
        var3.method546((byte) -49, 180, -171);
        this.field211.method186(0);
        var3.method546((byte) -49, 382, -265);
        if (!arg0) {
            this.field212.method186(0);
            var3.method546((byte) -49, -180, -265);
            this.field213.method186(0);
            var3.method546((byte) -49, 254, -171);
            this.field214.method186(0);
            var3.method546((byte) -49, -180, -171);
            class58 var6 = new class58(this.field125, "logo", 0);
            this.field206.method186(0);
            var6.method548(18, 382 - var6.field1584 / 2 - 128, this.field578);
            Object var7 = null;
            Object var8 = null;
            Object var9 = null;
            System.gc();
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public final void method117(String arg0, int arg1) {
        if (arg1 != -11116) {
            this.field132.method330(55);
        }
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
                    this.field162 = 0;
                    label50: for (int var9 = 0; var9 < class48.field1395; ++var9) {
                        class48 var10 = class48.method453(var9);
                        if (var10.field1396 == -1 && var10.field1376 != null) {
                            String var11 = var10.field1376.toLowerCase();
                            for (int var12 = 0; var12 < var5; ++var12) {
                                if (var11.indexOf(var4[var12]) == -1) {
                                    continue label50;
                                }
                            }
                            this.field163[this.field162] = var11;
                            this.field164[this.field162] = var9;
                            ++this.field162;
                            if (this.field162 >= this.field163.length) {
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
            this.field162 = 0;
        }
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(Z)I")
    public final int method118(boolean arg0) {
        int var2 = 3;
        this.field458 &= arg0;
        if (this.field514 < 310) {
            int var3 = this.field511 >> 7;
            int var4 = this.field513 >> 7;
            int var5 = field135.field1623 >> 7;
            int var6 = field135.field1624 >> 7;
            if ((this.field555[this.field183][var3][var4] & 4) != 0) {
                var2 = this.field183;
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
                    if ((this.field555[this.field183][var3][var4] & 4) != 0) {
                        var2 = this.field183;
                    }
                    var10 += var9;
                    if (var10 >= 65536) {
                        var10 -= 65536;
                        if (var4 < var6) {
                            ++var4;
                        } else if (var4 > var6) {
                            --var4;
                        }
                        if ((this.field555[this.field183][var3][var4] & 4) != 0) {
                            var2 = this.field183;
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
                    if ((this.field555[this.field183][var3][var4] & 4) != 0) {
                        var2 = this.field183;
                    }
                    var12 += var11;
                    if (var12 >= 65536) {
                        var12 -= 65536;
                        if (var3 < var5) {
                            ++var3;
                        } else if (var3 > var5) {
                            --var3;
                        }
                        if ((this.field555[this.field183][var3][var4] & 4) != 0) {
                            var2 = this.field183;
                        }
                    }
                }
            }
        }
        if ((this.field555[this.field183][field135.field1623 >> 7][field135.field1624 >> 7] & 4) != 0) {
            var2 = this.field183;
        }
        return var2;
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(Z)I")
    public final int method119(boolean arg0) {
        int var2 = this.method66(this.field183, this.field513, 6, this.field511);
        if (arg0) {
            field392 = -254;
        }
        return var2 - this.field512 < 800 && (this.field555[this.field183][this.field511 >> 7][this.field513 >> 7] & 4) != 0 ? this.field183 : 3;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILPQBRPYKE;LTPTANZXN;IB)V")
    private final void method120(int arg0, class41 arg1, class49 arg2, int arg3, byte arg4) {
        if (arg4 != 2) {
            this.field426 = this.field315.method556();
        }
        if ((arg3 & 1024) != 0) {
            int var6 = arg1.method360(6);
            int var7 = arg1.method340();
            arg2.method564(field581, 0, var6, var7);
            arg2.field1603 = field581 + 300;
            arg2.field1604 = arg1.method340();
            arg2.field1605 = arg1.method361(this.field186);
        }
        if ((arg3 & 64) != 0) {
            int var8 = arg1.method359(0);
            int var9 = arg1.method360(6);
            arg2.method564(field581, 0, var8, var9);
            arg2.field1603 = field581 + 300;
            arg2.field1604 = arg1.method359(0);
            arg2.field1605 = arg1.method361(this.field186);
        }
        if ((arg3 & 1) != 0) {
            arg2.field1658 = arg1.method347();
            if (arg2.field1658.charAt(0) == '~') {
                arg2.field1658 = arg2.field1658.substring(1);
                this.method102(arg2.field1658, arg2.field1449, -459, 2);
            } else if (field135 == arg2) {
                this.method102(arg2.field1658, arg2.field1449, -459, 2);
            }
            arg2.field1640 = 0;
            arg2.field1652 = 0;
            arg2.field1644 = 150;
        }
        if ((arg3 & 256) != 0) {
            arg2.field1606 = arg1.method361(this.field186);
            arg2.field1608 = arg1.method340();
            arg2.field1607 = arg1.method361(this.field186);
            arg2.field1609 = arg1.method340();
            arg2.field1610 = arg1.method342() + field581;
            arg2.field1611 = arg1.method368(false) + field581;
            arg2.field1612 = arg1.method359(0);
            arg2.method562(-678);
        }
        if ((arg3 & 512) != 0) {
            arg2.field1634 = arg1.method368(false);
            int var10 = arg1.method345();
            arg2.field1638 = var10 >> 16;
            arg2.field1637 = (var10 & 65535) + field581;
            arg2.field1635 = 0;
            arg2.field1636 = 0;
            if (arg2.field1637 > field581) {
                arg2.field1635 = -1;
            }
            if (arg2.field1634 == 65535) {
                arg2.field1634 = -1;
            }
        }
        if ((arg3 & 4) != 0) {
            int var11 = arg1.method361(this.field186);
            byte[] var12 = new byte[var11];
            class41 var13 = new class41(888, var12);
            arg1.method376((byte) 7, 0, var12, var11);
            this.field477[arg0] = var13;
            arg2.method456(var13, 0);
        }
        if ((arg3 & 16) != 0) {
            int var14 = arg1.method368(false);
            int var15 = arg1.method361(this.field186);
            int var16 = arg1.method360(6);
            int var17 = arg1.field1241;
            if (arg2.field1449 != null && arg2.field1429) {
                long var18 = class57.method537(arg2.field1449);
                boolean var20 = false;
                if (var15 <= 1) {
                    for (int var21 = 0; var21 < this.field150; ++var21) {
                        if (this.field126[var21] == var18) {
                            var20 = true;
                            break;
                        }
                    }
                }
                if (!var20 && this.field598 == 0) {
                    try {
                        this.field264.field1241 = 0;
                        arg1.method376((byte) 7, 0, this.field264.field1240, var16);
                        this.field264.field1241 = 0;
                        String var22 = class17.method245(var16, -503, this.field264);
                        String var23 = class46.method413(false, var22);
                        arg2.field1658 = var23;
                        arg2.field1640 = var14 >> 8;
                        arg2.field1652 = var14 & 255;
                        arg2.field1644 = 150;
                        if (var15 != 2 && var15 != 3) {
                            if (var15 == 1) {
                                this.method102(var23, "@cr1@" + arg2.field1449, -459, 1);
                            } else {
                                this.method102(var23, arg2.field1449, -459, 2);
                            }
                        } else {
                            this.method102(var23, "@cr2@" + arg2.field1449, -459, 1);
                        }
                    } catch (Exception var28) {
                        signlink.reporterror("cde2");
                    }
                }
            }
            arg1.field1241 = var16 + var17;
        }
        if ((arg3 & 32) != 0) {
            int var25 = arg1.method370((byte) 2);
            if (var25 == 65535) {
                var25 = -1;
            }
            int var26 = arg1.method361(this.field186);
            if (arg2.field1653 == var25 && var25 != -1) {
                int var27 = class2.field77[var25].field91;
                if (var27 == 1) {
                    arg2.field1654 = 0;
                    arg2.field1655 = 0;
                    arg2.field1656 = var26;
                    arg2.field1657 = 0;
                }
                if (var27 == 2) {
                    arg2.field1657 = 0;
                }
            } else if (var25 == -1 || arg2.field1653 == -1 || class2.field77[var25].field85 >= class2.field77[arg2.field1653].field85) {
                arg2.field1653 = var25;
                arg2.field1654 = 0;
                arg2.field1655 = 0;
                arg2.field1656 = var26;
                arg2.field1657 = 0;
                arg2.field1650 = arg2.field1639;
            }
        }
        if ((arg3 & 128) != 0) {
            arg2.field1646 = arg1.method369(759);
            arg2.field1647 = arg1.method370((byte) 2);
        }
        if ((arg3 & 2) != 0) {
            arg2.field1633 = arg1.method370((byte) 2);
            if (arg2.field1633 == 65535) {
                arg2.field1633 = -1;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
    public final void method121() {
        this.method55("Starting up", false, 20);
        if (signlink.sunjava) {
            super.field932 = 5;
        }
        if (field308) {
            this.field159 = true;
        } else {
            field308 = true;
            boolean var1 = false;
            String var2 = this.method105(field291);
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
                this.field221 = true;
            } else {
                if (signlink.cache_dat != null) {
                    for (int var3 = 0; var3 < 5; ++var3) {
                        this.field120[var3] = new class66(600000, false, var3 + 1, signlink.cache_dat, signlink.cache_idx[var3]);
                    }
                }
                try {
                    this.method132(field361);
                    this.field125 = this.method17(1, 25, "title screen", field293, "title", this.field349[1]);
                    this.field230 = new class70(false, this.field125, true, "p11_full");
                    this.field231 = new class70(false, this.field125, true, "p12_full");
                    this.field232 = new class70(false, this.field125, true, "b12_full");
                    this.field233 = new class70(true, this.field125, true, "q8_full");
                    this.method116(false);
                    this.method157(16460);
                    class60 var4 = this.method17(2, 30, "config", field293, "config", this.field349[2]);
                    class60 var5 = this.method17(3, 35, "interface", field293, "interface", this.field349[3]);
                    class60 var6 = this.method17(4, 40, "2d graphics", field293, "media", this.field349[4]);
                    class60 var7 = this.method17(6, 45, "textures", field293, "textures", this.field349[6]);
                    class60 var8 = this.method17(7, 50, "chat system", field293, "wordenc", this.field349[7]);
                    class60 var9 = this.method17(8, 55, "sound effects", field293, "sounds", this.field349[8]);
                    this.field555 = new byte[4][104][104];
                    this.field502 = new int[4][105][105];
                    this.field449 = new class52(104, false, 104, this.field502, 4);
                    for (int var10 = 0; var10 < 4; ++var10) {
                        this.field261[var10] = new class15(104, 104, (byte) 6);
                    }
                    this.field538 = new class58(512, 512);
                    class60 var11 = this.method17(5, 60, "update list", field293, "versionlist", this.field349[5]);
                    this.method55("Connecting to update server", false, 60);
                    this.field262 = new class42();
                    this.field262.method377(var11, this);
                    class37.method298(this.field262.method387(-643));
                    class16.method215(this.field262.method396(0, -42623), this.field262);
                    if (!field250) {
                        this.field492 = 0;
                        this.field493 = true;
                        this.field262.method382(2, this.field492);
                        while (this.field262.method385() > 0) {
                            this.method54((byte) 7);
                            try {
                                Thread.sleep(100L);
                            } catch (Exception var74) {
                            }
                            if (this.field262.field1295 > 3) {
                                this.method20("ondemand");
                                return;
                            }
                        }
                    }
                    this.method55("Requesting animations", false, 65);
                    int var12 = this.field262.method396(1, -42623);
                    for (int var13 = 0; var13 < var12; ++var13) {
                        this.field262.method382(1, var13);
                    }
                    while (this.field262.method385() > 0) {
                        int var14 = var12 - this.field262.method385();
                        if (var14 > 0) {
                            this.method55("Loading animations - " + var14 * 100 / var12 + "%", false, 65);
                        }
                        this.method54((byte) 7);
                        try {
                            Thread.sleep(100L);
                        } catch (Exception var73) {
                        }
                        if (this.field262.field1295 > 3) {
                            this.method20("ondemand");
                            return;
                        }
                    }
                    this.method55("Requesting models", false, 70);
                    int var15 = this.field262.method396(0, -42623);
                    for (int var16 = 0; var16 < var15; ++var16) {
                        int var17 = this.field262.method378(field446, var16);
                        if ((var17 & 1) != 0) {
                            this.field262.method382(0, var16);
                        }
                    }
                    int var18 = this.field262.method385();
                    while (this.field262.method385() > 0) {
                        int var19 = var18 - this.field262.method385();
                        if (var19 > 0) {
                            this.method55("Loading models - " + var19 * 100 / var18 + "%", false, 70);
                        }
                        this.method54((byte) 7);
                        try {
                            Thread.sleep(100L);
                        } catch (Exception var72) {
                        }
                    }
                    if (this.field120[0] != null) {
                        this.method55("Requesting maps", false, 75);
                        this.field262.method382(3, this.field262.method384(0, 47, 48, (byte) 2));
                        this.field262.method382(3, this.field262.method384(1, 47, 48, (byte) 2));
                        this.field262.method382(3, this.field262.method384(0, 48, 48, (byte) 2));
                        this.field262.method382(3, this.field262.method384(1, 48, 48, (byte) 2));
                        this.field262.method382(3, this.field262.method384(0, 49, 48, (byte) 2));
                        this.field262.method382(3, this.field262.method384(1, 49, 48, (byte) 2));
                        this.field262.method382(3, this.field262.method384(0, 47, 47, (byte) 2));
                        this.field262.method382(3, this.field262.method384(1, 47, 47, (byte) 2));
                        this.field262.method382(3, this.field262.method384(0, 48, 47, (byte) 2));
                        this.field262.method382(3, this.field262.method384(1, 48, 47, (byte) 2));
                        this.field262.method382(3, this.field262.method384(0, 48, 148, (byte) 2));
                        this.field262.method382(3, this.field262.method384(1, 48, 148, (byte) 2));
                        int var20 = this.field262.method385();
                        while (this.field262.method385() > 0) {
                            int var21 = var20 - this.field262.method385();
                            if (var21 > 0) {
                                this.method55("Loading maps - " + var21 * 100 / var20 + "%", false, 75);
                            }
                            this.method54((byte) 7);
                            try {
                                Thread.sleep(100L);
                            } catch (Exception var71) {
                            }
                        }
                    }
                    int var22 = this.field262.method396(0, -42623);
                    for (int var23 = 0; var23 < var22; ++var23) {
                        int var24 = this.field262.method378(field446, var23);
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
                            this.field262.method389(0, 125, var25, var23);
                        }
                    }
                    this.field262.method393(-924, field249);
                    if (!field250) {
                        int var26 = this.field262.method396(2, -42623);
                        for (int var27 = 1; var27 < var26; ++var27) {
                            if (this.field262.method380(0, var27)) {
                                this.field262.method389(2, 125, (byte) 1, var27);
                            }
                        }
                    }
                    int var28 = this.field262.method396(0, -42623);
                    for (int var29 = 0; var29 < var28; ++var29) {
                        int var30 = this.field262.method378(field446, var29);
                        if (var30 == 0 && this.field262.field1293 < 200) {
                            this.field262.method389(0, 125, (byte) 1, var29);
                        }
                    }
                    this.method55("Unpacking media", false, 80);
                    this.field417 = new class54(var6, "invback", 0);
                    this.field419 = new class54(var6, "chatback", 0);
                    this.field418 = new class54(var6, "mapback", 0);
                    this.field274 = new class54(var6, "backbase1", 0);
                    this.field275 = new class54(var6, "backbase2", 0);
                    this.field276 = new class54(var6, "backhmid1", 0);
                    for (int var31 = 0; var31 < 13; ++var31) {
                        this.field445[var31] = new class54(var6, "sideicons", var31);
                    }
                    this.field510 = new class58(var6, "compass", 0);
                    this.field325 = new class58(var6, "mapedge", 0);
                    this.field325.method545(false);
                    for (int var32 = 0; var32 < 72; ++var32) {
                        this.field168[var32] = new class54(var6, "mapscene", var32);
                    }
                    for (int var33 = 0; var33 < 70; ++var33) {
                        this.field460[var33] = new class58(var6, "mapfunction", var33);
                    }
                    for (int var34 = 0; var34 < 5; ++var34) {
                        this.field373[var34] = new class58(var6, "hitmarks", var34);
                    }
                    for (int var35 = 0; var35 < 6; ++var35) {
                        this.field327[var35] = new class58(var6, "headicons_pk", var35);
                    }
                    for (int var36 = 0; var36 < 9; ++var36) {
                        this.field485[var36] = new class58(var6, "headicons_prayer", var36);
                    }
                    for (int var37 = 0; var37 < 6; ++var37) {
                        this.field437[var37] = new class58(var6, "headicons_hint", var37);
                    }
                    this.field498 = new class58(var6, "overlay_multiway", 0);
                    this.field226 = new class58(var6, "mapmarker", 0);
                    this.field227 = new class58(var6, "mapmarker", 1);
                    for (int var38 = 0; var38 < 8; ++var38) {
                        this.field151[var38] = new class58(var6, "cross", var38);
                    }
                    this.field452 = new class58(var6, "mapdots", 0);
                    this.field453 = new class58(var6, "mapdots", 1);
                    this.field454 = new class58(var6, "mapdots", 2);
                    this.field455 = new class58(var6, "mapdots", 3);
                    this.field456 = new class58(var6, "mapdots", 4);
                    this.field298 = new class54(var6, "scrollbar", 0);
                    this.field299 = new class54(var6, "scrollbar", 1);
                    this.field565 = new class54(var6, "redstone1", 0);
                    this.field566 = new class54(var6, "redstone2", 0);
                    this.field567 = new class54(var6, "redstone3", 0);
                    this.field568 = new class54(var6, "redstone1", 0);
                    this.field568.method524((byte) 1);
                    this.field569 = new class54(var6, "redstone2", 0);
                    this.field569.method524((byte) 1);
                    this.field356 = new class54(var6, "redstone1", 0);
                    this.field356.method525(480);
                    this.field357 = new class54(var6, "redstone2", 0);
                    this.field357.method525(480);
                    this.field358 = new class54(var6, "redstone3", 0);
                    this.field358.method525(480);
                    this.field359 = new class54(var6, "redstone1", 0);
                    this.field359.method524((byte) 1);
                    this.field359.method525(480);
                    this.field360 = new class54(var6, "redstone2", 0);
                    this.field360.method524((byte) 1);
                    this.field360.method525(480);
                    for (int var39 = 0; var39 < 2; ++var39) {
                        this.field169[var39] = new class54(var6, "mod_icons", var39);
                    }
                    class58 var40 = new class58(var6, "backleft1", 0);
                    this.field189 = new class10(var40.field1585, var40.field1584, this.method153(-518), 384);
                    var40.method546((byte) -49, 0, 0);
                    class58 var41 = new class58(var6, "backleft2", 0);
                    this.field190 = new class10(var41.field1585, var41.field1584, this.method153(-518), 384);
                    var41.method546((byte) -49, 0, 0);
                    class58 var42 = new class58(var6, "backright1", 0);
                    this.field191 = new class10(var42.field1585, var42.field1584, this.method153(-518), 384);
                    var42.method546((byte) -49, 0, 0);
                    class58 var43 = new class58(var6, "backright2", 0);
                    this.field192 = new class10(var43.field1585, var43.field1584, this.method153(-518), 384);
                    var43.method546((byte) -49, 0, 0);
                    class58 var44 = new class58(var6, "backtop1", 0);
                    this.field193 = new class10(var44.field1585, var44.field1584, this.method153(-518), 384);
                    var44.method546((byte) -49, 0, 0);
                    class58 var45 = new class58(var6, "backvmid1", 0);
                    this.field194 = new class10(var45.field1585, var45.field1584, this.method153(-518), 384);
                    var45.method546((byte) -49, 0, 0);
                    class58 var46 = new class58(var6, "backvmid2", 0);
                    this.field195 = new class10(var46.field1585, var46.field1584, this.method153(-518), 384);
                    var46.method546((byte) -49, 0, 0);
                    class58 var47 = new class58(var6, "backvmid3", 0);
                    this.field196 = new class10(var47.field1585, var47.field1584, this.method153(-518), 384);
                    var47.method546((byte) -49, 0, 0);
                    class58 var48 = new class58(var6, "backhmid2", 0);
                    this.field197 = new class10(var48.field1585, var48.field1584, this.method153(-518), 384);
                    var48.method546((byte) -49, 0, 0);
                    int var49 = (int) (Math.random() * 21.0D) - 10;
                    int var50 = (int) (Math.random() * 21.0D) - 10;
                    int var51 = (int) (Math.random() * 21.0D) - 10;
                    int var52 = (int) (Math.random() * 41.0D) - 20;
                    for (int var53 = 0; var53 < 100; ++var53) {
                        if (this.field460[var53] != null) {
                            this.field460[var53].method544(false, var50 + var52, var49 + var52, var51 + var52);
                        }
                        if (this.field168[var53] != null) {
                            this.field168[var53].method526(false, var50 + var52, var49 + var52, var51 + var52);
                        }
                    }
                    this.method55("Unpacking textures", false, 83);
                    class39.method311(0, var7);
                    class39.method315(0.8D, 1);
                    class39.method310(20, (byte) 70);
                    this.method55("Unpacking config", false, 86);
                    class2.method11((byte) -82, var4);
                    class14.method194(var4);
                    class33.method276((byte) -82, var4);
                    class48.method445(var4);
                    class29.method268(var4);
                    class69.method579((byte) -82, var4);
                    class38.method303((byte) -82, var4);
                    class6.method14((byte) -82, var4);
                    class25.method257((byte) -82, var4);
                    class48.field1409 = field249;
                    if (!field250) {
                        this.method55("Unpacking sounds", false, 90);
                        byte[] var54 = var9.method560("sounds.dat", (byte[]) null);
                        class41 var55 = new class41(888, var54);
                        class34.method280((byte) -82, var55);
                    }
                    this.method55("Unpacking interfaces", false, 95);
                    class70[] var56 = new class70[] { this.field230, this.field231, this.field232, this.field233 };
                    class1.method2(var5, true, var56, var6);
                    this.method55("Preparing game engine", false, 100);
                    for (int var57 = 0; var57 < 33; ++var57) {
                        int var58 = 999;
                        int var59 = 0;
                        for (int var60 = 0; var60 < 34; ++var60) {
                            if (this.field418.field1550[this.field418.field1552 * var57 + var60] == 0) {
                                if (var58 == 999) {
                                    var58 = var60;
                                }
                            } else if (var58 != 999) {
                                var59 = var60;
                                break;
                            }
                        }
                        this.field520[var57] = var58;
                        this.field188[var57] = var59 - var58;
                    }
                    for (int var61 = 5; var61 < 156; ++var61) {
                        int var62 = 999;
                        int var63 = 0;
                        for (int var64 = 25; var64 < 172; ++var64) {
                            if (this.field418.field1550[this.field418.field1552 * var61 + var64] == 0 && (var64 > 34 || var61 > 34)) {
                                if (var62 == 999) {
                                    var62 = var64;
                                }
                            } else if (var62 != 999) {
                                var63 = var64;
                                break;
                            }
                        }
                        this.field587[var61 - 5] = var62 - 25;
                        this.field314[var61 - 5] = var63 - var62;
                    }
                    class39.method308(field384, 765, 503);
                    this.field431 = class39.field1199;
                    class39.method308(field384, 479, 96);
                    this.field428 = class39.field1199;
                    class39.method308(field384, 190, 261);
                    this.field429 = class39.field1199;
                    class39.method308(field384, 512, 334);
                    this.field430 = class39.field1199;
                    int[] var65 = new int[9];
                    for (int var66 = 0; var66 < 9; ++var66) {
                        int var67 = var66 * 32 + 128 + 15;
                        int var68 = var67 * 3 + 600;
                        int var69 = class39.field1197[var67];
                        var65[var66] = var68 * var69 >> 16;
                    }
                    class52.method507(-289, 800, var65, 500, 334, 512);
                    class46.method403(var8);
                    this.field313 = new class53(this, -257);
                    this.method139(this.field313, 10);
                    class13.field684 = this;
                    class14.field726 = this;
                    class29.field1053 = this;
                } catch (Exception var75) {
                    signlink.reporterror("loaderror " + this.field297 + " " + this.field405);
                    this.field263 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "C", descriptor = "(I)V")
    public final void method122(int arg0) {
        if (arg0 <= 0) {
            this.field506 = -1;
        }
        for (class62 var2 = (class62) this.field385.method532(); var2 != null; var2 = (class62) this.field385.method534(-420)) {
            if (this.field183 == var2.field1680 && field581 <= var2.field1684) {
                if (field581 >= var2.field1683) {
                    if (var2.field1678 > 0) {
                        class47 var3 = this.field265[var2.field1678 - 1];
                        if (var3 != null && var3.field1623 >= 0 && var3.field1623 < 13312 && var3.field1624 >= 0 && var3.field1624 < 13312) {
                            var2.method566(field581, var3.field1624, 0, this.method66(var2.field1680, var3.field1624, 6, var3.field1623) - var2.field1670, var3.field1623);
                        }
                    }
                    if (var2.field1678 < 0) {
                        int var4 = -var2.field1678 - 1;
                        class49 var5;
                        if (this.field157 == var4) {
                            var5 = field135;
                        } else {
                            var5 = this.field472[var4];
                        }
                        if (var5 != null && var5.field1623 >= 0 && var5.field1623 < 13312 && var5.field1624 >= 0 && var5.field1624 < 13312) {
                            var2.method566(field581, var5.field1624, 0, this.method66(var2.field1680, var5.field1624, 6, var5.field1623) - var2.field1670, var5.field1623);
                        }
                    }
                    var2.method565(this.field253, this.field416);
                    this.field449.method482(-1, var2, false, this.field183, (int) var2.field1664, 60, 42850, (int) var2.field1662, var2.field1665, (int) var2.field1663);
                }
            } else {
                var2.method163();
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(LPQBRPYKE;ZI)V")
    private final void method123(class41 arg0, boolean arg1, int arg2) {
        this.field596 = 0;
        this.field475 = 0;
        this.method155(arg0, arg2, (byte) -22);
        this.method101(0, arg0, arg2);
        this.method145(arg0, -843, arg2);
        if (!arg1) {
            this.field506 = -1;
        }
        for (int var4 = 0; var4 < this.field596; ++var4) {
            int var6 = this.field597[var4];
            if (field581 != this.field265[var6].field1645) {
                this.field265[var6].field1366 = null;
                this.field265[var6] = null;
            }
        }
        if (arg0.field1241 != arg2) {
            signlink.reporterror(this.field204 + " size mismatch in getnpcpos - pos:" + arg0.field1241 + " psize:" + arg2);
            throw new RuntimeException("eek");
        } else {
            for (int var5 = 0; var5 < this.field266; ++var5) {
                if (this.field265[this.field267[var5]] == null) {
                    signlink.reporterror(this.field204 + " null entry in npc list - pos:" + var5 + " size:" + this.field266);
                    throw new RuntimeException("eek");
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(ILPQBRPYKE;I)V")
    private final void method124(int arg0, class41 arg1, int arg2) {
        if (arg0 != 0) {
            this.field506 = -1;
        }
        while (arg1.field1242 + 10 < arg2 * 8) {
            int var4 = arg1.method351(11, 0);
            if (var4 == 2047) {
                break;
            }
            if (this.field472[var4] == null) {
                this.field472[var4] = new class49();
                if (this.field477[var4] != null) {
                    this.field472[var4].method456(this.field477[var4], 0);
                }
            }
            this.field474[this.field473++] = var4;
            class49 var5 = this.field472[var4];
            var5.field1645 = field581;
            int var6 = arg1.method351(5, 0);
            if (var6 > 15) {
                var6 -= 32;
            }
            int var7 = arg1.method351(5, 0);
            if (var7 > 15) {
                var7 -= 32;
            }
            int var8 = arg1.method351(1, 0);
            if (var8 == 1) {
                this.field476[this.field475++] = var4;
            }
            int var9 = arg1.method351(1, 0);
            var5.method561(field135.field1632[0] + var7, 0, var9 == 1, field135.field1631[0] + var6);
        }
        arg1.method352(true);
    }

    @OriginalMember(owner = "client!client", name = "D", descriptor = "(I)V")
    public final void method125(int arg0) {
        class14.field737.method574();
        class14.field713.method574();
        class29.field1037.method574();
        class48.field1375.method574();
        class48.field1401.method574();
        class49.field1441.method574();
        class38.field1183.method574();
        if (arg0 < 8 || arg0 > 8) {
            this.field132.method330(102);
        }
    }

    @OriginalMember(owner = "client!client", name = "E", descriptor = "(I)V")
    public final void method126(int arg0) {
        Graphics var2 = this.method153(-518).getGraphics();
        var2.setColor(Color.black);
        if (arg0 != -27417) {
            this.method121();
        }
        var2.fillRect(0, 0, 765, 503);
        this.method262(false, 1);
        if (this.field263) {
            this.field409 = false;
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
        if (this.field221) {
            this.field409 = false;
            var2.setFont(new Font("Helvetica", 1, 20));
            var2.setColor(Color.white);
            var2.drawString("Error - unable to load game!", 50, 50);
            var2.drawString("To play RuneScape make sure you play from", 50, 100);
            var2.drawString("http://www.runescape.com", 50, 150);
        }
        if (this.field159) {
            this.field409 = false;
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

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IILATOBWHST;)I")
    public final int method127(int arg0, int arg1, class1 arg2) {
        if (arg1 >= 0) {
            this.field132.method330(198);
        }
        if (arg2.field65 != null && arg0 < arg2.field65.length) {
            try {
                int[] var4 = arg2.field65[arg0];
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
                        var9 = this.field421[var4[var6++]];
                    }
                    if (var8 == 2) {
                        var9 = this.field462[var4[var6++]];
                    }
                    if (var8 == 3) {
                        var9 = this.field260[var4[var6++]];
                    }
                    if (var8 == 4) {
                        class1 var11 = class1.method4(var4[var6++]);
                        int var12 = var4[var6++];
                        if (var12 >= 0 && var12 < class48.field1395 && (!class48.method453(var12).field1377 || field249)) {
                            for (int var13 = 0; var13 < var11.field59.length; ++var13) {
                                if (var12 + 1 == var11.field59[var13]) {
                                    var9 += var11.field3[var13];
                                }
                            }
                        }
                    }
                    if (var8 == 5) {
                        var9 = this.field391[var4[var6++]];
                    }
                    if (var8 == 6) {
                        var9 = field488[this.field462[var4[var6++]] - 1];
                    }
                    if (var8 == 7) {
                        var9 = this.field391[var4[var6++]] * 100 / 46875;
                    }
                    if (var8 == 8) {
                        var9 = field135.field1438;
                    }
                    if (var8 == 9) {
                        for (int var14 = 0; var14 < class3.field94; ++var14) {
                            if (class3.field96[var14]) {
                                var9 += this.field462[var14];
                            }
                        }
                    }
                    if (var8 == 10) {
                        class1 var15 = class1.method4(var4[var6++]);
                        int var16 = var4[var6++] + 1;
                        if (var16 >= 0 && var16 < class48.field1395 && (!class48.method453(var16).field1377 || field249)) {
                            for (int var17 = 0; var17 < var15.field59.length; ++var17) {
                                if (var15.field59[var17] == var16) {
                                    var9 = 999999999;
                                    break;
                                }
                            }
                        }
                    }
                    if (var8 == 11) {
                        var9 = this.field572;
                    }
                    if (var8 == 12) {
                        var9 = this.field478;
                    }
                    if (var8 == 13) {
                        int var18 = this.field391[var4[var6++]];
                        int var19 = var4[var6++];
                        var9 = (var18 & 1 << var19) != 0 ? 1 : 0;
                    }
                    if (var8 == 14) {
                        int var20 = var4[var6++];
                        class25 var21 = class25.field916[var20];
                        int var22 = var21.field918;
                        int var23 = var21.field919;
                        int var24 = var21.field920;
                        int var25 = field224[var24 - var23];
                        var9 = this.field391[var22] >> var23 & var25;
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
                        var9 = (field135.field1623 >> 7) + this.field401;
                    }
                    if (var8 == 19) {
                        var9 = (field135.field1624 >> 7) + this.field402;
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

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
    public final void init() {
        field247 = Integer.parseInt(this.getParameter("nodeid"));
        field248 = Integer.parseInt(this.getParameter("portoff"));
        String var1 = this.getParameter("lowmem");
        if (var1 != null && var1.equals("1")) {
            method83(258);
        } else {
            method42(true);
        }
        String var2 = this.getParameter("free");
        if (var2 != null && var2.equals("1")) {
            field249 = false;
        } else {
            field249 = true;
        }
        this.method260(503, 45241, 765);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILPQBRPYKE;B)V")
    private final void method128(int arg0, class41 arg1, byte arg2) {
        if (arg2 != 5) {
            this.field390 = !this.field390;
        }
        for (int var4 = 0; var4 < this.field475; ++var4) {
            int var5 = this.field476[var4];
            class49 var6 = this.field472[var5];
            int var7 = arg1.method340();
            if ((var7 & 8) != 0) {
                var7 += arg1.method340() << 8;
            }
            this.method120(var5, arg1, var6, var7, (byte) 2);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ZLATOBWHST;)V")
    public final void method129(boolean arg0, class1 arg1) {
        int var3 = arg1.field26;
        this.field458 &= arg0;
        if ((var3 < 1 || var3 > 100) && (var3 < 701 || var3 > 800)) {
            if (var3 >= 101 && var3 <= 200 || var3 >= 801 && var3 <= 900) {
                int var5 = this.field129;
                if (this.field130 != 2) {
                    var5 = 0;
                }
                if (var3 > 800) {
                    var3 -= 701;
                } else {
                    var3 -= 101;
                }
                if (var3 >= var5) {
                    arg1.field29 = "";
                    arg1.field47 = 0;
                } else {
                    if (this.field377[var3] == 0) {
                        arg1.field29 = "@red@Offline";
                    } else if (this.field377[var3] < 200) {
                        if (this.field377[var3] == field247) {
                            arg1.field29 = "@gre@World" + (this.field377[var3] - 9);
                        } else {
                            arg1.field29 = "@yel@World" + (this.field377[var3] - 9);
                        }
                    } else if (this.field377[var3] == field247) {
                        arg1.field29 = "@gre@Classic" + (this.field377[var3] - 219);
                    } else {
                        arg1.field29 = "@yel@Classic" + (this.field377[var3] - 219);
                    }
                    arg1.field47 = 1;
                }
            } else if (var3 == 203) {
                int var6 = this.field129;
                if (this.field130 != 2) {
                    var6 = 0;
                }
                arg1.field43 = var6 * 15 + 20;
                if (arg1.field43 <= arg1.field52) {
                    arg1.field43 = arg1.field52 + 1;
                }
            } else if (var3 >= 401 && var3 <= 500) {
                var3 -= 401;
                if (var3 == 0 && this.field130 == 0) {
                    arg1.field29 = "Loading ignore list";
                    arg1.field47 = 0;
                } else if (var3 == 1 && this.field130 == 0) {
                    arg1.field29 = "Please wait...";
                    arg1.field47 = 0;
                } else {
                    int var7 = this.field150;
                    if (this.field130 == 0) {
                        var7 = 0;
                    }
                    if (var3 >= var7) {
                        arg1.field29 = "";
                        arg1.field47 = 0;
                    } else {
                        arg1.field29 = class57.method541(0, class57.method538(this.field126[var3], (byte) 7));
                        arg1.field47 = 1;
                    }
                }
            } else if (var3 == 503) {
                arg1.field43 = this.field150 * 15 + 20;
                if (arg1.field43 <= arg1.field52) {
                    arg1.field43 = arg1.field52 + 1;
                }
            } else if (var3 == 327) {
                arg1.field40 = 150;
                arg1.field41 = (int) (Math.sin((double) field581 / 40.0D) * 256.0D) & 2047;
                if (this.field342) {
                    for (int var8 = 0; var8 < 7; ++var8) {
                        int var15 = this.field323[var8];
                        if (var15 >= 0 && !class69.field1726[var15].method581(-33860)) {
                            return;
                        }
                    }
                    this.field342 = false;
                    class16[] var9 = new class16[7];
                    int var10 = 0;
                    for (int var11 = 0; var11 < 7; ++var11) {
                        int var14 = this.field323[var11];
                        if (var14 >= 0) {
                            var9[var10++] = class69.field1726[var14].method582(this.field602);
                        }
                    }
                    class16 var12 = new class16(var10, var9, this.field200);
                    for (int var13 = 0; var13 < 5; ++var13) {
                        if (this.field123[var13] != 0) {
                            var12.method232(field517[var13][0], field517[var13][this.field123[var13]]);
                            if (var13 == 1) {
                                var12.method232(field580[0], field580[this.field123[var13]]);
                            }
                        }
                    }
                    var12.method225((byte) -116);
                    var12.method226((byte) 8, class2.field77[field135.field1641].field79[0]);
                    var12.method235(64, 850, -30, -50, -30, true);
                    arg1.field13 = 5;
                    arg1.field14 = 0;
                    class1.method9(0, 5, 17598, var12);
                }
            } else if (var3 == 324) {
                if (this.field435 == null) {
                    this.field435 = arg1.field73;
                    this.field436 = arg1.field56;
                }
                if (this.field202) {
                    arg1.field73 = this.field436;
                } else {
                    arg1.field73 = this.field435;
                }
            } else if (var3 == 325) {
                if (this.field435 == null) {
                    this.field435 = arg1.field73;
                    this.field436 = arg1.field56;
                }
                if (this.field202) {
                    arg1.field73 = this.field435;
                } else {
                    arg1.field73 = this.field436;
                }
            } else if (var3 == 600) {
                arg1.field29 = this.field564;
                if (field581 % 20 < 10) {
                    arg1.field29 = arg1.field29 + "|";
                } else {
                    arg1.field29 = arg1.field29 + " ";
                }
            } else {
                if (var3 == 620) {
                    if (this.field448 >= 1) {
                        if (this.field375) {
                            arg1.field51 = 16711680;
                            arg1.field29 = "Moderator option: Mute player for 48 hours: <ON>";
                        } else {
                            arg1.field51 = 16777215;
                            arg1.field29 = "Moderator option: Mute player for 48 hours: <OFF>";
                        }
                    } else {
                        arg1.field29 = "";
                    }
                }
                if (var3 == 660) {
                    int var16 = this.field523 - this.field176;
                    String var17;
                    if (var16 <= 0) {
                        var17 = "earlier today";
                    } else if (var16 == 1) {
                        var17 = "yesterday";
                    } else {
                        var17 = var16 + " days ago";
                    }
                    arg1.field29 = "You last logged in @red@" + var17 + "@bla@ from: @red@" + signlink.dns;
                }
                if (var3 == 661) {
                    if (this.field399 == 0) {
                        arg1.field29 = "\\nYou have not yet set any recovery questions.\\nIt is @lre@strongly@yel@ recommended that you do so.\\n\\nIf you don't you will be @lre@unable to recover your\\n@lre@password@yel@ if you forget it, or it is stolen.";
                    } else if (this.field399 <= this.field523) {
                        arg1.field29 = "\\n\\nRecovery Questions Last Set:\\n@gre@" + this.method130(this.field399, (byte) 1);
                    } else {
                        int var18 = this.field523 + 14 - this.field399;
                        String var19;
                        if (var18 <= 0) {
                            var19 = "Earlier today";
                        } else if (var18 == 1) {
                            var19 = "Yesterday";
                        } else {
                            var19 = var18 + " days ago";
                        }
                        arg1.field29 = var19 + " you requested@lre@ new recovery\\n@lre@questions.@yel@ The requested change will occur\\non: @lre@" + this.method130(this.field399, (byte) 1) + "\\n\\nIf you do not remember making this request\\ncancel it immediately, and change your password.";
                    }
                }
                if (var3 == 662) {
                    String var20;
                    if (this.field414 == 0) {
                        var20 = "@yel@0 unread messages";
                    } else if (this.field414 == 1) {
                        var20 = "@gre@1 unread message";
                    } else {
                        var20 = "@gre@" + this.field414 + " unread messages";
                    }
                    arg1.field29 = "You have " + var20 + "\\nin your message centre.";
                }
                if (var3 == 663) {
                    if (this.field289 > 0 && this.field289 <= this.field523 + 10) {
                        arg1.field29 = "Last password change:\\n@gre@" + this.method130(this.field289, (byte) 1);
                    } else {
                        arg1.field29 = "Last password change:\\n@gre@Never changed";
                    }
                }
                if (var3 == 665) {
                    if (this.field203 > 2 && !field249) {
                        arg1.field29 = "This is a non-members\\nworld. To enjoy your\\nmembers benefits we\\nrecommend you play on a\\nmembers world instead.";
                    } else if (this.field203 > 2) {
                        arg1.field29 = "\\n\\nYou have @gre@" + this.field203 + "@yel@ days of\\nmember credit remaining.";
                    } else if (this.field203 > 0) {
                        arg1.field29 = "You have @gre@" + this.field203 + "@yel@ days of\\nmember credit remaining.\\n\\n@lre@Credit low! Renew now\\n@lre@to avoid losing members.";
                    } else {
                        arg1.field29 = "You are not a member.\\n\\nChoose to subscribe and\\nyou'll get loads of extra\\nbenefits and features.";
                    }
                }
                if (var3 == 667) {
                    if (this.field203 > 2 && !field249) {
                        arg1.field29 = "To switch to a members-only world:\\n1) Logout and return to the world selection page.\\n2) Choose one of the members world with a gold star next to it's name.\\n\\nIf you prefer you can continue to use this world,\\nbut members only features will be unavailable here.";
                    } else if (this.field203 > 0) {
                        arg1.field29 = "To extend or cancel a subscription:\\n1) Logout and return to the frontpage of this website.\\n2)Choose the relevant option from the 'membership' section.\\n\\nNote: If you are a credit card subscriber a top-up payment will\\nautomatically be taken when 3 days credit remain.\\n(unless you cancel your subscription, which can be done at any time.)";
                    } else {
                        arg1.field29 = "To start a subscripton:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Start a new subscription'";
                    }
                }
                if (var3 == 668) {
                    if (this.field399 > this.field523) {
                        arg1.field29 = "To cancel this request:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Cancel recovery questions'.";
                    } else {
                        arg1.field29 = "To change your recovery questions:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Set new recovery questions'.";
                    }
                }
            }
        } else if (var3 == 1 && this.field130 == 0) {
            arg1.field29 = "Loading friend list";
            arg1.field47 = 0;
        } else if (var3 == 1 && this.field130 == 1) {
            arg1.field29 = "Connecting to friendserver";
            arg1.field47 = 0;
        } else if (var3 == 2 && this.field130 != 2) {
            arg1.field29 = "Please wait...";
            arg1.field47 = 0;
        } else {
            int var4 = this.field129;
            if (this.field130 != 2) {
                var4 = 0;
            }
            if (var3 > 700) {
                var3 -= 601;
            } else {
                --var3;
            }
            if (var3 >= var4) {
                arg1.field29 = "";
                arg1.field47 = 0;
            } else {
                arg1.field29 = this.field354[var3];
                arg1.field47 = 1;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(IB)Ljava/lang/String;")
    public final String method130(int arg0, byte arg1) {
        if (arg0 > this.field523 + 10) {
            return "Unknown";
        } else {
            long var3 = ((long) arg0 + 11745L) * 86400000L;
            Calendar var5 = Calendar.getInstance();
            if (arg1 == 1) {
                boolean var6 = false;
            } else {
                for (int var7 = 1; var7 > 0; ++var7) {
                }
            }
            var5.setTime(new Date(var3));
            int var8 = var5.get(5);
            int var9 = var5.get(2);
            int var10 = var5.get(1);
            String[] var11 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
            return var8 + "-" + var11[var9] + "-" + var10;
        }
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(Z)V")
    public final void method131(boolean arg0) {
        if (this.field527 > 1) {
            --this.field527;
        }
        if (this.field509 > 0) {
            --this.field509;
        }
        for (int var2 = 0; var2 < 5 && this.method156((byte) 111); ++var2) {
        }
        if (this.field458) {
            Object var3 = this.field313.field1546;
            synchronized (this.field313.field1546) {
                if (!field127) {
                    this.field313.field1543 = 0;
                } else if (super.field952 != 0 || this.field313.field1543 >= 40) {
                    this.field132.method329(128, false);
                    this.field132.method330(0);
                    int var4 = this.field132.field1241;
                    int var5 = 0;
                    for (int var6 = 0; var6 < this.field313.field1543 && var4 - this.field132.field1241 < 240; ++var6) {
                        ++var5;
                        int var7 = this.field313.field1542[var6];
                        if (var7 < 0) {
                            var7 = 0;
                        } else if (var7 > 502) {
                            var7 = 502;
                        }
                        int var8 = this.field313.field1544[var6];
                        if (var8 < 0) {
                            var8 = 0;
                        } else if (var8 > 764) {
                            var8 = 764;
                        }
                        int var9 = var7 * 765 + var8;
                        if (this.field313.field1542[var6] == -1 && this.field313.field1544[var6] == -1) {
                            var8 = -1;
                            var7 = -1;
                            var9 = 524287;
                        }
                        if (this.field145 == var8 && this.field146 == var7) {
                            if (this.field167 < 2047) {
                                ++this.field167;
                            }
                        } else {
                            int var10 = var8 - this.field145;
                            this.field145 = var8;
                            int var11 = var7 - this.field146;
                            this.field146 = var7;
                            if (this.field167 < 8 && var10 >= -32 && var10 <= 31 && var11 >= -32 && var11 <= 31) {
                                var10 += 32;
                                var11 += 32;
                                this.field132.method331((this.field167 << 12) + (var10 << 6) + var11);
                                this.field167 = 0;
                            } else if (this.field167 < 8) {
                                this.field132.method333((this.field167 << 19) + 8388608 + var9);
                                this.field167 = 0;
                            } else {
                                this.field132.method334((this.field167 << 19) + -1073741824 + var9);
                                this.field167 = 0;
                            }
                        }
                    }
                    this.field132.method339(this.field132.field1241 - var4, (byte) 4);
                    if (var5 >= this.field313.field1543) {
                        this.field313.field1543 = 0;
                    } else {
                        this.field313.field1543 -= var5;
                        for (int var12 = 0; var12 < this.field313.field1543; ++var12) {
                            this.field313.field1544[var12] = this.field313.field1544[var5 + var12];
                            this.field313.field1542[var12] = this.field313.field1542[var5 + var12];
                        }
                    }
                }
            }
            if (super.field952 != 0) {
                long var13 = (super.field955 - this.field156) / 50L;
                if (var13 > 4095L) {
                    var13 = 4095L;
                }
                this.field156 = super.field955;
                int var15 = super.field954;
                if (var15 < 0) {
                    var15 = 0;
                } else if (var15 > 502) {
                    var15 = 502;
                }
                int var16 = super.field953;
                if (var16 < 0) {
                    var16 = 0;
                } else if (var16 > 764) {
                    var16 = 764;
                }
                int var17 = var15 * 765 + var16;
                byte var18 = 0;
                if (super.field952 == 2) {
                    var18 = 1;
                }
                int var19 = (int) var13;
                this.field132.method329(1, false);
                this.field132.method334((var18 << 19) + (var19 << 20) + var17);
            }
            if (this.field236 > 0) {
                --this.field236;
            }
            if (super.field956[1] == 1 || super.field956[2] == 1 || super.field956[3] == 1 || super.field956[4] == 1) {
                this.field237 = true;
            }
            if (this.field237 && this.field236 <= 0) {
                this.field236 = 20;
                this.field237 = false;
                this.field132.method329(85, false);
                this.field132.method367(0, this.field605);
                this.field132.method365(this.field606, (byte) 77);
            }
            if (super.field943 && !this.field610) {
                this.field610 = true;
                this.field132.method329(201, false);
                this.field132.method330(1);
            }
            if (!super.field943 && this.field610) {
                this.field610 = false;
                this.field132.method329(201, false);
                this.field132.method330(0);
            }
            this.method44(144);
            this.method154((byte) 0);
            this.method135((byte) 4);
            ++this.field507;
            if (this.field507 > 750) {
                this.method60((byte) -50);
            }
            this.method29(this.field119);
            this.method69(9);
            this.method82(24);
            ++this.field253;
            if (this.field282 != 0) {
                this.field281 += 20;
                if (this.field281 >= 400) {
                    this.field282 = 0;
                }
            }
            if (this.field271 != 0) {
                ++this.field268;
                if (this.field268 >= 15) {
                    if (this.field271 == 2) {
                        this.field400 = true;
                    }
                    if (this.field271 == 3) {
                        this.field604 = true;
                    }
                    this.field271 = 0;
                }
            }
            if (this.field532 != 0) {
                ++this.field427;
                if (super.field946 > this.field533 + 5 || super.field946 < this.field533 - 5 || super.field947 > this.field534 + 5 || super.field947 < this.field534 - 5) {
                    this.field177 = true;
                }
                if (super.field945 == 0) {
                    if (this.field532 == 2) {
                        this.field400 = true;
                    }
                    if (this.field532 == 3) {
                        this.field604 = true;
                    }
                    this.field532 = 0;
                    if (this.field177 && this.field427 >= 5) {
                        this.field554 = -1;
                        this.method159(-31550);
                        if (this.field554 == this.field530 && this.field553 != this.field531) {
                            class1 var20 = class1.method4(this.field530);
                            byte var21 = 0;
                            if (this.field518 == 1 && var20.field26 == 206) {
                                var21 = 1;
                            }
                            if (var20.field59[this.field553] <= 0) {
                                var21 = 0;
                            }
                            if (var20.field46) {
                                int var22 = this.field531;
                                int var23 = this.field553;
                                var20.field59[var23] = var20.field59[var22];
                                var20.field3[var23] = var20.field3[var22];
                                var20.field59[var22] = -1;
                                var20.field3[var22] = 0;
                            } else if (var21 == 1) {
                                int var24 = this.field531;
                                int var25 = this.field553;
                                while (var24 != var25) {
                                    if (var24 > var25) {
                                        var20.method7(var24, 386, var24 - 1);
                                        --var24;
                                    } else if (var24 < var25) {
                                        var20.method7(var24, 386, var24 + 1);
                                        ++var24;
                                    }
                                }
                            } else {
                                var20.method7(this.field531, 386, this.field553);
                            }
                            this.field132.method329(166, false);
                            this.field132.method356(var21, this.field433);
                            this.field132.method365(this.field531, (byte) 77);
                            this.field132.method331(this.field553);
                            this.field132.method365(this.field530, (byte) 77);
                        }
                    } else if ((this.field316 == 1 || this.method104(false, this.field272 - 1)) && this.field272 > 2) {
                        this.method144(9);
                    } else if (this.field272 > 0) {
                        this.method46(this.field272 - 1, (byte) -31);
                    }
                    this.field268 = 10;
                    super.field952 = 0;
                }
            }
            if (class52.field1511 != -1) {
                int var26 = class52.field1511;
                int var27 = class52.field1512;
                boolean var28 = this.method27(var26, 6, var27, 0, field135.field1632[0], 0, 0, 0, true, field135.field1631[0], 0, 0);
                class52.field1511 = -1;
                if (var28) {
                    this.field279 = super.field953;
                    this.field280 = super.field954;
                    this.field282 = 1;
                    this.field281 = 0;
                }
            }
            if (super.field952 == 1 && this.field345 != null) {
                this.field345 = null;
                this.field604 = true;
                super.field952 = 0;
            }
            this.method147(-740);
            if (this.field252 == -1) {
                this.method48(-281);
                this.method95((byte) 41);
                this.method37(this.field451);
            }
            if (super.field945 == 1 || super.field952 == 1) {
                ++this.field366;
            }
            if (this.field278 == 0 && this.field152 == 0 && this.field371 == 0) {
                if (this.field368 > 0) {
                    --this.field368;
                }
            } else if (this.field368 < 100) {
                ++this.field368;
                if (this.field368 == 100) {
                    if (this.field278 != 0) {
                        this.field604 = true;
                    }
                    if (this.field152 != 0) {
                        this.field400 = true;
                    }
                }
            }
            if (this.field343 == 2) {
                this.method51(783);
            }
            if (this.field343 == 2 && this.field556) {
                this.method18((byte) 0);
            }
            for (int var29 = 0; var29 < 5; ++var29) {
                int var10002 = this.field588[var29]++;
            }
            this.method22(this.field560);
            ++super.field944;
            if (super.field944 > 4500) {
                this.field509 = 250;
                super.field944 -= 500;
                this.field132.method329(223, false);
            }
            ++this.field322;
            if (this.field322 > 500) {
                this.field322 = 0;
                int var30 = (int) (Math.random() * 8.0D);
                if ((var30 & 1) == 1) {
                    this.field284 += this.field285;
                }
                if ((var30 & 2) == 2) {
                    this.field139 += this.field140;
                }
                if ((var30 & 4) == 4) {
                    this.field141 += this.field142;
                }
            }
            if (this.field284 < -50) {
                this.field285 = 2;
            }
            if (this.field284 > 50) {
                this.field285 = -2;
            }
            if (this.field139 < -55) {
                this.field140 = 2;
            }
            if (this.field139 > 55) {
                this.field140 = -2;
            }
            if (this.field141 < -40) {
                this.field142 = 1;
            }
            if (this.field141 > 40) {
                this.field142 = -1;
            }
            ++this.field467;
            if (this.field467 > 500) {
                this.field467 = 0;
                int var31 = (int) (Math.random() * 8.0D);
                if ((var31 & 1) == 1) {
                    this.field245 += this.field246;
                }
                if ((var31 & 2) == 2) {
                    this.field438 += this.field439;
                }
            }
            if (this.field245 < -60) {
                this.field246 = 2;
            }
            if (this.field245 > 60) {
                this.field246 = -2;
            }
            if (this.field438 < -20) {
                this.field439 = 1;
            }
            if (this.field438 > 10) {
                this.field439 = -1;
            }
            ++this.field508;
            this.field458 &= arg0;
            if (this.field508 > 50) {
                this.field132.method329(114, false);
            }
            try {
                if (this.field287 != null && this.field132.field1241 > 0) {
                    this.field287.method468(0, 9, this.field132.field1240, this.field132.field1241);
                    this.field132.field1241 = 0;
                    this.field508 = 0;
                }
            } catch (IOException var33) {
                this.method60((byte) -50);
            } catch (Exception var34) {
                this.method141(0);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "o", descriptor = "(B)V")
    public final void method132(byte arg0) {
        int var2 = 5;
        this.field349[8] = 0;
        int var3 = 0;
        if (arg0 != 8) {
            this.field128 = !this.field128;
        }
        while (this.field349[8] == 0) {
            String var4 = "Unknown problem";
            this.method55("Connecting to web server", false, 20);
            try {
                DataInputStream var5 = this.method89("crc" + (int) (Math.random() * 9.9999999E7D) + "-" + 374);
                class41 var6 = new class41(888, new byte[40]);
                var5.readFully(var6.field1240, 0, 40);
                var5.close();
                for (int var7 = 0; var7 < 9; ++var7) {
                    this.field349[var7] = var6.method345();
                }
                int var8 = var6.method345();
                int var9 = 1234;
                for (int var10 = 0; var10 < 9; ++var10) {
                    var9 = (var9 << 1) + this.field349[var10];
                }
                if (var8 != var9) {
                    var4 = "checksum problem";
                    this.field349[8] = 0;
                }
            } catch (EOFException var13) {
                var4 = "EOF problem";
                this.field349[8] = 0;
            } catch (IOException var14) {
                var4 = "connection problem";
                this.field349[8] = 0;
            } catch (Exception var15) {
                var4 = "logic problem";
                this.field349[8] = 0;
                if (!signlink.reporterror) {
                    return;
                }
            }
            if (this.field349[8] == 0) {
                ++var3;
                for (int var11 = var2; var11 > 0; --var11) {
                    if (var3 >= 10) {
                        this.method55("Game updated - please reload page", false, 10);
                        var11 = 10;
                    } else {
                        this.method55(var4 + " - Will retry in " + var11 + " secs.", false, 10);
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
                this.field393 = !this.field393;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ZIII)I")
    public final int method133(boolean arg0, int arg1, int arg2, int arg3) {
        if (!arg0) {
            this.field132.method330(181);
        }
        int var5 = 256 - arg1;
        return ((arg2 & 16711935) * var5 + (arg3 & 16711935) * arg1 & -16711936) + ((arg2 & 65280) * var5 + (arg3 & 65280) * arg1 & 16711680) >> 8;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(JI)V")
    public final void method134(long arg0, int arg1) {
        if (arg0 != 0L) {
            for (int var4 = 0; var4 < this.field129; ++var4) {
                if (this.field529[var4] == arg0) {
                    --this.field129;
                    this.field400 = true;
                    for (int var5 = var4; var5 < this.field129; ++var5) {
                        this.field354[var5] = this.field354[var5 + 1];
                        this.field377[var5] = this.field377[var5 + 1];
                        this.field529[var5] = this.field529[var5 + 1];
                    }
                    this.field132.method329(116, false);
                    this.field132.method336(arg0, 0);
                    break;
                }
            }
            while (arg1 >= 0) {
                for (int var6 = 1; var6 > 0; ++var6) {
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "p", descriptor = "(B)V")
    public final void method135(byte arg0) {
        for (int var2 = 0; var2 < this.field240; ++var2) {
            if (this.field201[var2] <= 0) {
                boolean var3 = false;
                try {
                    if (this.field552[var2] == this.field131 && this.field185[var2] == this.field307) {
                        if (!this.method50(-38)) {
                            var3 = true;
                        }
                    } else {
                        class41 var4 = class34.method281(this.field552[var2], (byte) -75, this.field185[var2]);
                        if (System.currentTimeMillis() + (long) (var4.field1241 / 22) > (long) (this.field172 / 22) + this.field582) {
                            this.field172 = var4.field1241;
                            this.field582 = System.currentTimeMillis();
                            if (this.method63(-35761, var4.field1240, var4.field1241)) {
                                this.field131 = this.field552[var2];
                                this.field307 = this.field185[var2];
                            } else {
                                var3 = true;
                            }
                        }
                    }
                } catch (Exception var9) {
                    if (signlink.reporterror) {
                        this.field132.method329(171, false);
                        this.field132.method331(this.field552[var2] & 32767);
                    } else {
                        this.field132.method329(171, false);
                        this.field132.method331(-1);
                    }
                }
                if (var3 && this.field201[var2] != -5) {
                    this.field201[var2] = -5;
                } else {
                    --this.field240;
                    for (int var6 = var2; var6 < this.field240; ++var6) {
                        this.field552[var6] = this.field552[var6 + 1];
                        this.field185[var6] = this.field185[var6 + 1];
                        this.field201[var6] = this.field201[var6 + 1];
                    }
                    --var2;
                }
            } else {
                int var10002 = this.field201[var2]--;
            }
        }
        ++field223;
        if (arg0 == 4) {
            boolean var7 = false;
        } else {
            this.field132.method330(29);
        }
        if (field223 > 1454) {
            field223 = 0;
            this.field132.method329(31, false);
            this.field132.method330(0);
            int var8 = this.field132.field1241;
            this.field132.method331((int) (Math.random() * 65536.0D));
            this.field132.method331(26445);
            this.field132.method330((int) (Math.random() * 256.0D));
            this.field132.method331((int) (Math.random() * 65536.0D));
            this.field132.method330((int) (Math.random() * 256.0D));
            this.field132.method331((int) (Math.random() * 65536.0D));
            this.field132.method331(39738);
            this.field132.method330(180);
            this.field132.method330(202);
            if ((int) (Math.random() * 2.0D) == 0) {
                this.field132.method331(48946);
            }
            this.field132.method339(this.field132.field1241 - var8, (byte) 4);
        }
        if (this.field539 > 0) {
            this.field539 -= 20;
            if (this.field539 < 0) {
                this.field539 = 0;
            }
            if (this.field539 == 0 && this.field406 && !field250) {
                this.field492 = this.field258;
                this.field493 = true;
                this.field262.method382(2, this.field492);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(IIII)Z")
    public final boolean method136(int arg0, int arg1, int arg2, int arg3) {
        int var5 = arg0 >> 14 & 32767;
        int var6 = this.field449.method501(this.field183, arg1, arg2, arg0);
        if (var6 == -1) {
            return false;
        } else {
            int var7 = var6 & 31;
            int var8 = var6 >> 6 & 3;
            if (var7 != 10 && var7 != 11 && var7 != 22) {
                this.method27(arg1, 6, arg2, 0, field135.field1632[0], 0, 2, 0, true, field135.field1631[0], var7 + 1, var8);
            } else {
                class14 var9 = class14.method196(var5);
                int var10;
                int var11;
                if (var8 != 0 && var8 != 2) {
                    var10 = var9.field735;
                    var11 = var9.field702;
                } else {
                    var10 = var9.field702;
                    var11 = var9.field735;
                }
                int var12 = var9.field734;
                if (var8 != 0) {
                    var12 = (var12 >> 4 - var8) + (var12 << var8 & 15);
                }
                this.method27(arg1, 6, arg2, var12, field135.field1632[0], var10, 2, var11, true, field135.field1631[0], 0, 0);
            }
            this.field279 = super.field953;
            this.field280 = super.field954;
            this.field282 = 2;
            if (arg3 != 6) {
                this.field506 = this.field143.method340();
            }
            this.field281 = 0;
            return true;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(BLjava/lang/String;)Z")
    public final boolean method137(byte arg0, String arg1) {
        if (this.field521 != arg0) {
            for (int var3 = 1; var3 > 0; ++var3) {
            }
        }
        if (arg1 == null) {
            return false;
        } else {
            for (int var4 = 0; var4 < this.field129; ++var4) {
                if (arg1.equalsIgnoreCase(this.field354[var4])) {
                    return true;
                }
            }
            return arg1.equalsIgnoreCase(field135.field1449);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILATOBWHST;)Z")
    public final boolean method138(int arg0, class1 arg1) {
        if (arg0 != 0) {
            this.field459 = 193;
        }
        int var3 = arg1.field26;
        if (this.field130 == 2) {
            if (var3 == 201) {
                this.field604 = true;
                this.field526 = 0;
                this.field166 = true;
                this.field138 = "";
                this.field440 = 1;
                this.field347 = "Enter name of friend to add to list";
            }
            if (var3 == 202) {
                this.field604 = true;
                this.field526 = 0;
                this.field166 = true;
                this.field138 = "";
                this.field440 = 2;
                this.field347 = "Enter name of friend to delete from list";
            }
        }
        if (var3 == 205) {
            this.field509 = 250;
            return true;
        } else {
            if (var3 == 501) {
                this.field604 = true;
                this.field526 = 0;
                this.field166 = true;
                this.field138 = "";
                this.field440 = 4;
                this.field347 = "Enter name of player to add to list";
            }
            if (var3 == 502) {
                this.field604 = true;
                this.field526 = 0;
                this.field166 = true;
                this.field138 = "";
                this.field440 = 5;
                this.field347 = "Enter name of player to delete from list";
            }
            if (var3 >= 300 && var3 <= 313) {
                int var4 = (var3 - 300) / 2;
                int var5 = var3 & 1;
                int var6 = this.field323[var4];
                if (var6 != -1) {
                    while (true) {
                        if (var5 == 0) {
                            --var6;
                            if (var6 < 0) {
                                var6 = class69.field1725 - 1;
                            }
                        }
                        if (var5 == 1) {
                            ++var6;
                            if (var6 >= class69.field1725) {
                                var6 = 0;
                            }
                        }
                        if (!class69.field1726[var6].field1732 && class69.field1726[var6].field1727 == var4 + (this.field202 ? 0 : 7)) {
                            this.field323[var4] = var6;
                            this.field342 = true;
                            break;
                        }
                    }
                }
            }
            if (var3 >= 314 && var3 <= 323) {
                int var7 = (var3 - 314) / 2;
                int var8 = var3 & 1;
                int var9 = this.field123[var7];
                if (var8 == 0) {
                    --var9;
                    if (var9 < 0) {
                        var9 = field517[var7].length - 1;
                    }
                }
                if (var8 == 1) {
                    ++var9;
                    if (var9 >= field517[var7].length) {
                        var9 = 0;
                    }
                }
                this.field123[var7] = var9;
                this.field342 = true;
            }
            if (var3 == 324 && !this.field202) {
                this.field202 = true;
                this.method58(11278);
            }
            if (var3 == 325 && this.field202) {
                this.field202 = false;
                this.method58(11278);
            }
            if (var3 != 326) {
                if (var3 == 620) {
                    this.field375 = !this.field375;
                }
                if (var3 >= 601 && var3 <= 613) {
                    this.method35(true);
                    if (this.field564.length() > 0) {
                        this.field132.method329(52, false);
                        this.field132.method336(class57.method537(this.field564), 0);
                        this.field132.method330(var3 - 601);
                        this.field132.method330(this.field375 ? 1 : 0);
                    }
                }
                return false;
            } else {
                this.field132.method329(94, false);
                this.field132.method330(this.field202 ? 0 : 1);
                for (int var10 = 0; var10 < 7; ++var10) {
                    this.field132.method330(this.field323[var10]);
                }
                for (int var11 = 0; var11 < 5; ++var11) {
                    this.field132.method330(this.field123[var11]);
                }
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
    public final void method139(Runnable arg0, int arg1) {
        if (arg1 > 10) {
            arg1 = 10;
        }
        if (signlink.mainapp != null) {
            signlink.startthread(arg0, arg1);
        } else {
            super.method139(arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!client", name = "q", descriptor = "(B)V")
    public final void method140(byte arg0) {
        try {
            this.field334 = -1;
            this.field294.method536();
            this.field385.method536();
            class39.method309((byte) 8);
            this.method125(8);
            this.field449.method471(7);
            System.gc();
            for (int var2 = 0; var2 < 4; ++var2) {
                this.field261[var2].method202();
            }
            for (int var3 = 0; var3 < 4; ++var3) {
                for (int var4 = 0; var4 < 104; ++var4) {
                    for (int var5 = 0; var5 < 104; ++var5) {
                        this.field555[var3][var4][var5] = 0;
                    }
                }
            }
            class9 var6 = new class9(104, 0, this.field555, this.field502, 104);
            int var7 = this.field577.length;
            this.field132.method329(114, false);
            if (!this.field599) {
                for (int var8 = 0; var8 < var7; ++var8) {
                    int var9 = (this.field495[var8] >> 8) * 64 - this.field401;
                    int var10 = (this.field495[var8] & 255) * 64 - this.field402;
                    byte[] var11 = this.field577[var8];
                    if (var11 != null) {
                        var6.method168(var11, (this.field309 - 6) * 8, var9, (byte) -108, this.field261, var10, (this.field310 - 6) * 8);
                    }
                }
                for (int var12 = 0; var12 < var7; ++var12) {
                    int var13 = (this.field495[var12] >> 8) * 64 - this.field401;
                    int var14 = (this.field495[var12] & 255) * 64 - this.field402;
                    byte[] var15 = this.field577[var12];
                    if (var15 == null && this.field310 < 800) {
                        var6.method165(64, 73, 64, var13, var14);
                    }
                }
                this.field132.method329(114, false);
                for (int var16 = 0; var16 < var7; ++var16) {
                    byte[] var17 = this.field312[var16];
                    if (var17 != null) {
                        int var18 = (this.field495[var16] >> 8) * 64 - this.field401;
                        int var19 = (this.field495[var16] & 255) * 64 - this.field402;
                        var6.method170(this.field449, this.field261, var17, var18, var19, this.field187);
                    }
                }
            }
            if (this.field599) {
                int var20 = 0;
                label257: while (true) {
                    if (var20 >= 4) {
                        for (int var31 = 0; var31 < 13; ++var31) {
                            for (int var32 = 0; var32 < 13; ++var32) {
                                int var33 = this.field516[0][var31][var32];
                                if (var33 == -1) {
                                    var6.method165(8, 73, 8, var31 * 8, var32 * 8);
                                }
                            }
                        }
                        this.field132.method329(114, false);
                        int var34 = 0;
                        while (true) {
                            if (var34 >= 4) {
                                break label257;
                            }
                            for (int var35 = 0; var35 < 13; ++var35) {
                                for (int var36 = 0; var36 < 13; ++var36) {
                                    int var37 = this.field516[var34][var35][var36];
                                    if (var37 != -1) {
                                        int var38 = var37 >> 24 & 3;
                                        int var39 = var37 >> 1 & 3;
                                        int var40 = var37 >> 14 & 1023;
                                        int var41 = var37 >> 3 & 2047;
                                        int var42 = (var40 / 8 << 8) + var41 / 8;
                                        for (int var43 = 0; var43 < this.field495.length; ++var43) {
                                            if (this.field495[var43] == var42 && this.field312[var43] != null) {
                                                var6.method184(var38, var35 * 8, (var41 & 7) * 8, this.field449, 0, this.field261, var34, var36 * 8, var39, this.field312[var43], (var40 & 7) * 8);
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
                            int var24 = this.field516[var20][var21][var22];
                            if (var24 != -1) {
                                int var25 = var24 >> 24 & 3;
                                int var26 = var24 >> 1 & 3;
                                int var27 = var24 >> 14 & 1023;
                                int var28 = var24 >> 3 & 2047;
                                int var29 = (var27 / 8 << 8) + var28 / 8;
                                for (int var30 = 0; var30 < this.field495.length; ++var30) {
                                    if (this.field495[var30] == var29 && this.field577[var30] != null) {
                                        var6.method172(this.field261, (var27 & 7) * 8, var22 * 8, var21 * 8, false, var26, var25, var20, this.field577[var30], (var28 & 7) * 8);
                                        var23 = true;
                                        break;
                                    }
                                }
                            }
                            if (!var23) {
                                var6.method177(-11121, var20, var21 * 8, var22 * 8);
                            }
                        }
                    }
                    ++var20;
                }
            }
            this.field132.method329(114, false);
            var6.method185(38, this.field261, this.field449);
            if (this.field319 != null) {
                this.field319.method186(0);
                class39.field1199 = this.field430;
            }
            this.field132.method329(114, false);
            int var44 = class9.field626;
            if (var44 > this.field183) {
                var44 = this.field183;
            }
            if (var44 < this.field183 - 1) {
                int var45 = this.field183 - 1;
            }
            if (field250) {
                this.field449.method472(0, class9.field626);
            } else {
                this.field449.method472(0, 0);
            }
            for (int var46 = 0; var46 < 104; ++var46) {
                for (int var47 = 0; var47 < 104; ++var47) {
                    this.method67(var46, var47);
                }
            }
            this.method57(104);
        } catch (Exception var61) {
        }
        class14.field737.method574();
        if (super.field941 != null) {
            this.field132.method329(81, false);
            this.field132.method334(1057001181);
        }
        if (field250 && signlink.cache_dat != null) {
            int var49 = this.field262.method396(0, -42623);
            for (int var50 = 0; var50 < var49; ++var50) {
                int var51 = this.field262.method378(field446, var50);
                if ((var51 & 121) == 0) {
                    class16.method217((byte) 3, var50);
                }
            }
        }
        System.gc();
        class39.method310(20, (byte) 70);
        this.field262.method392(-10941);
        int var52 = (this.field309 - 6) / 8 - 1;
        int var53 = (this.field309 + 6) / 8 + 1;
        int var54 = (this.field310 - 6) / 8 - 1;
        int var55 = (this.field310 + 6) / 8 + 1;
        if (arg0 == 2) {
            boolean var56 = false;
        } else {
            this.field451 = this.field315.method556();
        }
        if (this.field586) {
            var52 = 49;
            var53 = 50;
            var54 = 49;
            var55 = 50;
        }
        for (int var57 = var52; var57 <= var53; ++var57) {
            for (int var58 = var54; var58 <= var55; ++var58) {
                if (var52 == var57 || var53 == var57 || var54 == var58 || var55 == var58) {
                    int var59 = this.field262.method384(0, var57, var58, (byte) 2);
                    if (var59 != -1) {
                        this.field262.method383(var59, -534, 3);
                    }
                    int var60 = this.field262.method384(1, var57, var58, (byte) 2);
                    if (var60 != -1) {
                        this.field262.method383(var60, -534, 3);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "F", descriptor = "(I)V")
    public final void method141(int arg0) {
        this.field505 += arg0;
        try {
            if (this.field287 != null) {
                this.field287.method464();
            }
        } catch (Exception var3) {
        }
        this.field287 = null;
        this.field458 = false;
        this.field336 = 0;
        this.field204 = "";
        this.field205 = "";
        this.method125(8);
        this.field449.method471(7);
        for (int var2 = 0; var2 < 4; ++var2) {
            this.field261[var2].method202();
        }
        System.gc();
        this.method80(-480);
        this.field258 = -1;
        this.field492 = -1;
        this.field539 = 0;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;)V")
    public final void method142(String arg0, int arg1, String arg2) {
        if (arg1 <= 0) {
            this.field506 = -1;
        }
        if (this.field319 != null) {
            this.field319.method186(0);
            class39.field1199 = this.field430;
            int var4 = 151;
            if (arg0 != null) {
                var4 -= 7;
            }
            this.field231.method586(arg2, 257, 8, 0, var4);
            this.field231.method586(arg2, 256, 8, 16777215, var4 - 1);
            var4 += 15;
            if (arg0 != null) {
                this.field231.method586(arg0, 257, 8, 0, var4);
                this.field231.method586(arg0, 256, 8, 16777215, var4 - 1);
            }
            this.field319.method187(0, 4, super.field938, 4);
        } else if (super.field939 != null) {
            super.field939.method186(0);
            class39.field1199 = this.field431;
            int var5 = 251;
            short var6 = 300;
            byte var7 = 50;
            class36.method291(383 - var6 / 2, var6, 42613, var5 - 5 - var7 / 2, 0, var7);
            class36.method292(var7, var6, 383 - var6 / 2, var5 - 5 - var7 / 2, 16777215, (byte) 1);
            if (arg0 != null) {
                var5 -= 7;
            }
            this.field231.method586(arg2, 383, 8, 0, var5);
            this.field231.method586(arg2, 382, 8, 16777215, var5 - 1);
            var5 += 15;
            if (arg0 != null) {
                this.field231.method586(arg0, 383, 8, 0, var5);
                this.field231.method586(arg0, 382, 8, 16777215, var5 - 1);
            }
            super.field939.method187(0, 0, super.field938, 0);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(ZLATOBWHST;)Z")
    public final boolean method143(boolean arg0, class1 arg1) {
        if (arg0) {
            throw new NullPointerException();
        } else {
            int var3 = arg1.field26;
            if ((var3 < 1 || var3 > 200) && (var3 < 701 || var3 > 900)) {
                if (var3 >= 401 && var3 <= 500) {
                    this.field225[this.field272] = "Remove @whi@" + arg1.field29;
                    this.field180[this.field272] = 61;
                    ++this.field272;
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
                this.field225[this.field272] = "Remove @whi@" + this.field354[var3];
                this.field180[this.field272] = 360;
                ++this.field272;
                this.field225[this.field272] = "Message @whi@" + this.field354[var3];
                this.field180[this.field272] = 654;
                ++this.field272;
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "G", descriptor = "(I)V")
    public final void method144(int arg0) {
        int var2 = this.field232.method588("Choose Option", true);
        for (int var3 = 0; var3 < this.field272; ++var3) {
            int var11 = this.field232.method588(this.field225[var3], true);
            if (var11 > var2) {
                var2 = var11;
            }
        }
        var2 += 8;
        int var4 = this.field272 * 15 + 21;
        if (arg0 < 9 || arg0 > 9) {
            this.field160 = !this.field160;
        }
        if (super.field953 > 4 && super.field954 > 4 && super.field953 < 516 && super.field954 < 338) {
            int var5 = super.field953 - 4 - var2 / 2;
            if (var2 + var5 > 512) {
                var5 = 512 - var2;
            }
            if (var5 < 0) {
                var5 = 0;
            }
            int var6 = super.field954 - 4;
            if (var4 + var6 > 334) {
                var6 = 334 - var4;
            }
            if (var6 < 0) {
                var6 = 0;
            }
            this.field173 = true;
            this.field329 = 0;
            this.field330 = var5;
            this.field331 = var6;
            this.field332 = var2;
            this.field333 = this.field272 * 15 + 22;
        }
        if (super.field953 > 553 && super.field954 > 205 && super.field953 < 743 && super.field954 < 466) {
            int var7 = super.field953 - 553 - var2 / 2;
            if (var7 < 0) {
                var7 = 0;
            } else if (var2 + var7 > 190) {
                var7 = 190 - var2;
            }
            int var8 = super.field954 - 205;
            if (var8 < 0) {
                var8 = 0;
            } else if (var4 + var8 > 261) {
                var8 = 261 - var4;
            }
            this.field173 = true;
            this.field329 = 1;
            this.field330 = var7;
            this.field331 = var8;
            this.field332 = var2;
            this.field333 = this.field272 * 15 + 22;
        }
        if (super.field953 > 17 && super.field954 > 357 && super.field953 < 496 && super.field954 < 453) {
            int var9 = super.field953 - 17 - var2 / 2;
            if (var9 < 0) {
                var9 = 0;
            } else if (var2 + var9 > 479) {
                var9 = 479 - var2;
            }
            int var10 = super.field954 - 357;
            if (var10 < 0) {
                var10 = 0;
            } else if (var4 + var10 > 96) {
                var10 = 96 - var4;
            }
            this.field173 = true;
            this.field329 = 2;
            this.field330 = var9;
            this.field331 = var10;
            this.field332 = var2;
            this.field333 = this.field272 * 15 + 22;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(LPQBRPYKE;II)V")
    private final void method145(class41 arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field475; ++var4) {
            int var5 = this.field476[var4];
            class47 var6 = this.field265[var5];
            int var7 = arg0.method340();
            if ((var7 & 32) != 0) {
                int var8 = arg0.method361(this.field186);
                int var9 = arg0.method360(6);
                var6.method564(field581, 0, var8, var9);
                var6.field1603 = field581 + 300;
                var6.field1604 = arg0.method360(6);
                var6.field1605 = arg0.method340();
            }
            if ((var7 & 4) != 0) {
                var6.field1633 = arg0.method370((byte) 2);
                if (var6.field1633 == 65535) {
                    var6.field1633 = -1;
                }
            }
            if ((var7 & 2) != 0) {
                var6.field1646 = arg0.method370((byte) 2);
                var6.field1647 = arg0.method368(false);
            }
            if ((var7 & 16) != 0) {
                var6.field1634 = arg0.method342();
                int var10 = arg0.method345();
                var6.field1638 = var10 >> 16;
                var6.field1637 = (var10 & 65535) + field581;
                var6.field1635 = 0;
                var6.field1636 = 0;
                if (var6.field1637 > field581) {
                    var6.field1635 = -1;
                }
                if (var6.field1634 == 65535) {
                    var6.field1634 = -1;
                }
            }
            if ((var7 & 1) != 0) {
                var6.field1658 = arg0.method347();
                var6.field1644 = 100;
            }
            if ((var7 & 128) != 0) {
                int var11 = arg0.method368(false);
                if (var11 == 65535) {
                    var11 = -1;
                }
                int var12 = arg0.method359(0);
                if (var6.field1653 == var11 && var11 != -1) {
                    int var13 = class2.field77[var11].field91;
                    if (var13 == 1) {
                        var6.field1654 = 0;
                        var6.field1655 = 0;
                        var6.field1656 = var12;
                        var6.field1657 = 0;
                    }
                    if (var13 == 2) {
                        var6.field1657 = 0;
                    }
                } else if (var11 == -1 || var6.field1653 == -1 || class2.field77[var11].field85 >= class2.field77[var6.field1653].field85) {
                    var6.field1653 = var11;
                    var6.field1654 = 0;
                    var6.field1655 = 0;
                    var6.field1656 = var12;
                    var6.field1657 = 0;
                    var6.field1650 = var6.field1639;
                }
            }
            if ((var7 & 8) != 0) {
                var6.field1366 = class29.method269(arg0.method368(false));
                var6.field1613 = var6.field1366.field1054;
                var6.field1626 = var6.field1366.field1039;
                var6.field1615 = var6.field1366.field1059;
                var6.field1616 = var6.field1366.field1068;
                var6.field1617 = var6.field1366.field1036;
                var6.field1618 = var6.field1366.field1038;
                var6.field1641 = var6.field1366.field1034;
            }
            if ((var7 & 64) != 0) {
                int var14 = arg0.method340();
                int var15 = arg0.method359(0);
                var6.method564(field581, 0, var14, var15);
                var6.field1603 = field581 + 300;
                var6.field1604 = arg0.method340();
                var6.field1605 = arg0.method359(0);
            }
        }
        if (arg1 >= 0) {
            this.field540 = 392;
        }
    }

    @OriginalMember(owner = "client!client", name = "H", descriptor = "(I)V")
    public final void method146(int arg0) {
        this.field409 = false;
        while (this.field558) {
            this.field409 = false;
            try {
                Thread.sleep(50L);
            } catch (Exception var2) {
            }
        }
        this.field241 = null;
        this.field242 = null;
        this.field503 = null;
        this.field301 = null;
        this.field302 = null;
        this.field303 = null;
        this.field304 = null;
        this.field412 = null;
        this.field413 = null;
        this.field575 = null;
        this.field576 = null;
        this.field524 = null;
        if (field392 == arg0) {
            this.field525 = null;
        }
    }

    @OriginalMember(owner = "client!client", name = "I", descriptor = "(I)V")
    public final void method147(int arg0) {
        if (this.field532 == 0) {
            int var2 = super.field952;
            if (arg0 >= 0) {
                this.method121();
            }
            if (this.field479 == 1 && super.field953 >= 516 && super.field954 >= 160 && super.field953 <= 765 && super.field954 <= 205) {
                var2 = 0;
            }
            if (this.field173) {
                if (var2 != 1) {
                    int var3 = super.field946;
                    int var4 = super.field947;
                    if (this.field329 == 0) {
                        var3 -= 4;
                        var4 -= 4;
                    }
                    if (this.field329 == 1) {
                        var3 -= 553;
                        var4 -= 205;
                    }
                    if (this.field329 == 2) {
                        var3 -= 17;
                        var4 -= 357;
                    }
                    if (var3 < this.field330 - 10 || var3 > this.field332 + this.field330 + 10 || var4 < this.field331 - 10 || var4 > this.field333 + this.field331 + 10) {
                        this.field173 = false;
                        if (this.field329 == 1) {
                            this.field400 = true;
                        }
                        if (this.field329 == 2) {
                            this.field604 = true;
                        }
                    }
                }
                if (var2 == 1) {
                    int var5 = this.field330;
                    int var6 = this.field331;
                    int var7 = this.field332;
                    int var8 = super.field953;
                    int var9 = super.field954;
                    if (this.field329 == 0) {
                        var8 -= 4;
                        var9 -= 4;
                    }
                    if (this.field329 == 1) {
                        var8 -= 553;
                        var9 -= 205;
                    }
                    if (this.field329 == 2) {
                        var8 -= 17;
                        var9 -= 357;
                    }
                    int var10 = -1;
                    for (int var11 = 0; var11 < this.field272; ++var11) {
                        int var12 = (this.field272 - 1 - var11) * 15 + var6 + 31;
                        if (var8 > var5 && var8 < var5 + var7 && var9 > var12 - 13 && var9 < var12 + 3) {
                            var10 = var11;
                        }
                    }
                    if (var10 != -1) {
                        this.method46(var10, (byte) -31);
                    }
                    this.field173 = false;
                    if (this.field329 == 1) {
                        this.field400 = true;
                    }
                    if (this.field329 == 2) {
                        this.field604 = true;
                        return;
                    }
                }
            } else {
                if (var2 == 1 && this.field272 > 0) {
                    int var13 = this.field180[this.field272 - 1];
                    if (var13 == 5 || var13 == 871 || var13 == 123 || var13 == 850 || var13 == 670 || var13 == 479 || var13 == 940 || var13 == 193 || var13 == 115 || var13 == 547 || var13 == 253 || var13 == 1327) {
                        int var14 = this.field178[this.field272 - 1];
                        int var15 = this.field179[this.field272 - 1];
                        class1 var16 = class1.method4(var15);
                        if (var16.field49 || var16.field46) {
                            this.field177 = false;
                            this.field427 = 0;
                            this.field530 = var15;
                            this.field531 = var14;
                            this.field532 = 2;
                            this.field533 = super.field953;
                            this.field534 = super.field954;
                            if (class1.method4(var15).field8 == this.field603) {
                                this.field532 = 1;
                            }
                            if (class1.method4(var15).field8 == this.field447) {
                                this.field532 = 3;
                            }
                            return;
                        }
                    }
                }
                if (var2 == 1 && (this.field316 == 1 || this.method104(false, this.field272 - 1)) && this.field272 > 2) {
                    var2 = 2;
                }
                if (var2 == 1 && this.field272 > 0) {
                    this.method46(this.field272 - 1, (byte) -31);
                }
                if (var2 != 2 || this.field272 <= 0) {
                    return;
                }
                this.method144(9);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "J", descriptor = "(I)V")
    public final void method148(int arg0) {
        ++this.field350;
        this.method21((byte) 58, true);
        this.method59((byte) 3, true);
        this.method21((byte) 58, false);
        this.method59((byte) 3, false);
        this.method122(584);
        this.method115(550);
        if (!this.field556) {
            int var2 = this.field605;
            if (this.field259 / 256 > var2) {
                var2 = this.field259 / 256;
            }
            if (this.field489[4] && this.field609[4] + 128 > var2) {
                var2 = this.field609[4] + 128;
            }
            int var3 = this.field606 + this.field141 & 2047;
            this.method93(this.field235, var2 * 3 + 600, var3, this.method66(this.field183, field135.field1624, 6, field135.field1623) - 50, (byte) -113, var2, this.field234);
        }
        int var4;
        if (!this.field556) {
            var4 = this.method118(true);
        } else {
            var4 = this.method119(false);
        }
        int var5 = this.field511;
        int var6 = this.field512;
        int var7 = this.field513;
        int var8 = this.field514;
        int var9 = this.field515;
        for (int var10 = 0; var10 < 5; ++var10) {
            if (this.field489[var10]) {
                int var13 = (int) (Math.random() * (double) (this.field175[var10] * 2 + 1) - (double) this.field175[var10] + Math.sin((double) this.field383[var10] / 100.0D * (double) this.field588[var10]) * (double) this.field609[var10]);
                if (var10 == 0) {
                    this.field511 += var13;
                }
                if (var10 == 1) {
                    this.field512 += var13;
                }
                if (var10 == 2) {
                    this.field513 += var13;
                }
                if (var10 == 3) {
                    this.field515 = this.field515 + var13 & 2047;
                }
                if (var10 == 4) {
                    this.field514 += var13;
                    if (this.field514 < 128) {
                        this.field514 = 128;
                    }
                    if (this.field514 > 383) {
                        this.field514 = 383;
                    }
                }
            }
        }
        int var11 = class39.field1208;
        class16.field833 = true;
        class16.field836 = 0;
        class16.field834 = super.field946 - 4;
        class16.field835 = super.field947 - 4;
        class36.method289(5);
        while (arg0 >= 0) {
            for (int var12 = 1; var12 > 0; ++var12) {
            }
        }
        this.field449.method510(true, var4, this.field513, this.field511, this.field514, this.field512, this.field515);
        this.field449.method485((byte) -82);
        this.method16(3);
        this.method40((byte) 22);
        this.method78(5, var11);
        this.method160(836);
        this.field319.method187(0, 4, super.field938, 4);
        this.field511 = var5;
        this.field512 = var6;
        this.field513 = var7;
        this.field514 = var8;
        this.field515 = var9;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IILPQBRPYKE;)V")
    private final void method149(int arg0, int arg1, class41 arg2) {
        if (arg1 >= 0) {
            this.method121();
        }
        int var4 = arg2.method351(8, 0);
        if (var4 < this.field473) {
            for (int var5 = var4; var5 < this.field473; ++var5) {
                this.field597[this.field596++] = this.field474[var5];
            }
        }
        if (var4 > this.field473) {
            signlink.reporterror(this.field204 + " Too many players");
            throw new RuntimeException("eek");
        } else {
            this.field473 = 0;
            for (int var6 = 0; var6 < var4; ++var6) {
                int var7 = this.field474[var6];
                class49 var8 = this.field472[var7];
                int var9 = arg2.method351(1, 0);
                if (var9 == 0) {
                    this.field474[this.field473++] = var7;
                    var8.field1645 = field581;
                } else {
                    int var10 = arg2.method351(2, 0);
                    if (var10 == 0) {
                        this.field474[this.field473++] = var7;
                        var8.field1645 = field581;
                        this.field476[this.field475++] = var7;
                    } else if (var10 == 1) {
                        this.field474[this.field473++] = var7;
                        var8.field1645 = field581;
                        int var11 = arg2.method351(3, 0);
                        var8.method563((byte) -78, false, var11);
                        int var12 = arg2.method351(1, 0);
                        if (var12 == 1) {
                            this.field476[this.field475++] = var7;
                        }
                    } else if (var10 == 2) {
                        this.field474[this.field473++] = var7;
                        var8.field1645 = field581;
                        int var13 = arg2.method351(3, 0);
                        var8.method563((byte) -78, true, var13);
                        int var14 = arg2.method351(3, 0);
                        var8.method563((byte) -78, true, var14);
                        int var15 = arg2.method351(1, 0);
                        if (var15 == 1) {
                            this.field476[this.field475++] = var7;
                        }
                    } else if (var10 == 3) {
                        this.field597[this.field596++] = var7;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(ZI)V")
    public final void method150(boolean arg0, int arg1) {
        int var3 = class6.field104[arg1].field112;
        if (var3 != 0) {
            int var4 = this.field391[arg1];
            if (!arg0) {
                this.field132.method330(68);
            }
            if (var3 == 1) {
                if (var4 == 1) {
                    class39.method315(0.9D, 1);
                }
                if (var4 == 2) {
                    class39.method315(0.8D, 1);
                }
                if (var4 == 3) {
                    class39.method315(0.7D, 1);
                }
                if (var4 == 4) {
                    class39.method315(0.6D, 1);
                }
                class48.field1401.method574();
                this.field468 = true;
            }
            if (var3 == 3) {
                boolean var5 = this.field406;
                if (var4 == 0) {
                    this.method84(-285, this.field406, 0);
                    this.field406 = true;
                }
                if (var4 == 1) {
                    this.method84(-285, this.field406, -400);
                    this.field406 = true;
                }
                if (var4 == 2) {
                    this.method84(-285, this.field406, -800);
                    this.field406 = true;
                }
                if (var4 == 3) {
                    this.method84(-285, this.field406, -1200);
                    this.field406 = true;
                }
                if (var4 == 4) {
                    this.field406 = false;
                }
                if (this.field406 != var5 && !field250) {
                    if (this.field406) {
                        this.field492 = this.field258;
                        this.field493 = true;
                        this.field262.method382(2, this.field492);
                    } else {
                        this.method80(-480);
                    }
                    this.field539 = 0;
                }
            }
            if (var3 == 4) {
                if (var4 == 0) {
                    this.field425 = true;
                    this.method151(0, 5);
                }
                if (var4 == 1) {
                    this.field425 = true;
                    this.method151(-400, 5);
                }
                if (var4 == 2) {
                    this.field425 = true;
                    this.method151(-800, 5);
                }
                if (var4 == 3) {
                    this.field425 = true;
                    this.method151(-1200, 5);
                }
                if (var4 == 4) {
                    this.field425 = false;
                }
            }
            if (var3 == 5) {
                this.field316 = var4;
            }
            if (var3 == 6) {
                this.field288 = var4;
            }
            if (var3 == 8) {
                this.field305 = var4;
                this.field604 = true;
            }
            if (var3 == 9) {
                this.field518 = var4;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(II)V")
    public final void method151(int arg0, int arg1) {
        signlink.wavevol = arg0;
        if (arg1 != 5) {
            field446 = -135;
        }
    }

    @OriginalMember(owner = "client!client", name = "K", descriptor = "(I)V")
    public void method152(int arg0) {
        System.out.println("============");
        System.out.println("flame-cycle:" + this.field369);
        if (this.field262 != null) {
            System.out.println("Od-cycle:" + this.field262.field1279);
        }
        System.out.println("loop-cycle:" + field581);
        System.out.println("draw-cycle:" + field324);
        System.out.println("ptype:" + this.field506);
        System.out.println("psize:" + this.field505);
        if (this.field287 != null) {
            this.field287.method469(764);
        }
        super.field935 = true;
        if (arg0 <= 0) {
            this.field132.method330(182);
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(I)Ljava/awt/Component;")
    public final Component method153(int arg0) {
        while (arg0 >= 0) {
            this.field506 = -1;
        }
        if (signlink.mainapp != null) {
            return signlink.mainapp;
        } else if (super.field941 != null) {
            return super.field941;
        } else {
            return this;
        }
    }

    @OriginalMember(owner = "client!client", name = "r", descriptor = "(B)V")
    private final void method154(byte arg0) {
        if (arg0 == 0) {
            boolean var2 = false;
        } else {
            this.field560 = 478;
        }
        if (this.field343 == 2) {
            for (class23 var3 = (class23) this.field300.method532(); var3 != null; var3 = (class23) this.field300.method534(-420)) {
                if (var3.field895 > 0) {
                    --var3.field895;
                }
                if (var3.field895 == 0) {
                    if (var3.field899 < 0 || class9.method164(var3.field899, (byte) -78, var3.field901)) {
                        this.method92(true, var3.field901, var3.field903, var3.field899, var3.field902, var3.field900, var3.field904, var3.field905);
                        var3.method163();
                    }
                } else {
                    if (var3.field906 > 0) {
                        --var3.field906;
                    }
                    if (var3.field906 == 0 && var3.field904 >= 1 && var3.field905 >= 1 && var3.field904 <= 102 && var3.field905 <= 102 && (var3.field896 < 0 || class9.method164(var3.field896, (byte) -78, var3.field898))) {
                        this.method92(true, var3.field898, var3.field903, var3.field896, var3.field902, var3.field897, var3.field904, var3.field905);
                        var3.field906 = -1;
                        if (var3.field899 == var3.field896 && var3.field899 == -1) {
                            var3.method163();
                        } else if (var3.field899 == var3.field896 && var3.field900 == var3.field897 && var3.field901 == var3.field898) {
                            var3.method163();
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        return signlink.mainapp != null ? signlink.mainapp.getAppletContext() : super.getAppletContext();
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(LPQBRPYKE;IB)V")
    private final void method155(class41 arg0, int arg1, byte arg2) {
        arg0.method350(-19202);
        int var4 = arg0.method351(8, 0);
        if (var4 < this.field266) {
            for (int var5 = var4; var5 < this.field266; ++var5) {
                this.field597[this.field596++] = this.field267[var5];
            }
        }
        if (var4 > this.field266) {
            signlink.reporterror(this.field204 + " Too many npcs");
            throw new RuntimeException("eek");
        } else {
            this.field266 = 0;
            if (arg2 != -22) {
                this.field506 = -1;
            }
            for (int var6 = 0; var6 < var4; ++var6) {
                int var7 = this.field267[var6];
                class47 var8 = this.field265[var7];
                int var9 = arg0.method351(1, 0);
                if (var9 == 0) {
                    this.field267[this.field266++] = var7;
                    var8.field1645 = field581;
                } else {
                    int var10 = arg0.method351(2, 0);
                    if (var10 == 0) {
                        this.field267[this.field266++] = var7;
                        var8.field1645 = field581;
                        this.field476[this.field475++] = var7;
                    } else if (var10 == 1) {
                        this.field267[this.field266++] = var7;
                        var8.field1645 = field581;
                        int var11 = arg0.method351(3, 0);
                        var8.method563((byte) -78, false, var11);
                        int var12 = arg0.method351(1, 0);
                        if (var12 == 1) {
                            this.field476[this.field475++] = var7;
                        }
                    } else if (var10 == 2) {
                        this.field267[this.field266++] = var7;
                        var8.field1645 = field581;
                        int var13 = arg0.method351(3, 0);
                        var8.method563((byte) -78, true, var13);
                        int var14 = arg0.method351(3, 0);
                        var8.method563((byte) -78, true, var14);
                        int var15 = arg0.method351(1, 0);
                        if (var15 == 1) {
                            this.field476[this.field475++] = var7;
                        }
                    } else if (var10 == 3) {
                        this.field597[this.field596++] = var7;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "s", descriptor = "(B)Z")
    public final boolean method156(byte arg0) {
        if (arg0 != 111) {
            this.method121();
        }
        if (this.field287 == null) {
            return false;
        } else {
            try {
                int var2 = this.field287.method466();
                if (var2 == 0) {
                    return false;
                }
                if (this.field506 == -1) {
                    this.field287.method467(this.field143.field1240, 0, 1);
                    this.field506 = this.field143.field1240[0] & 255;
                    if (this.field315 != null) {
                        this.field506 = this.field506 - this.field315.method556() & 255;
                    }
                    this.field505 = class31.field1087[this.field506];
                    --var2;
                }
                if (this.field505 == -1) {
                    if (var2 <= 0) {
                        return false;
                    }
                    this.field287.method467(this.field143.field1240, 0, 1);
                    this.field505 = this.field143.field1240[0] & 255;
                    --var2;
                }
                if (this.field505 == -2) {
                    if (var2 <= 1) {
                        return false;
                    }
                    this.field287.method467(this.field143.field1240, 0, 2);
                    this.field143.field1241 = 0;
                    this.field505 = this.field143.method342();
                    var2 -= 2;
                }
                if (var2 < this.field505) {
                    return false;
                }
                this.field143.field1241 = 0;
                this.field287.method467(this.field143.field1240, 0, this.field505);
                this.field507 = 0;
                this.field389 = this.field388;
                this.field388 = this.field387;
                this.field387 = this.field506;
                if (this.field506 == 180) {
                    this.field400 = true;
                    int var3 = this.field143.method342();
                    class1 var4 = class1.method4(var3);
                    int var5 = this.field143.method342();
                    for (int var6 = 0; var6 < var5; ++var6) {
                        var4.field59[var6] = this.field143.method370((byte) 2);
                        int var7 = this.field143.method359(0);
                        if (var7 == 255) {
                            var7 = this.field143.method375((byte) 4);
                        }
                        var4.field3[var6] = var7;
                    }
                    for (int var8 = var5; var8 < var4.field59.length; ++var8) {
                        var4.field59[var8] = 0;
                        var4.field3[var8] = 0;
                    }
                    this.field506 = -1;
                    return true;
                }
                if (this.field506 != 52 && this.field506 != 6) {
                    if (this.field506 == 236) {
                        this.method36(this.field143, true, this.field505);
                        this.field573 = false;
                        this.field506 = -1;
                        return true;
                    }
                    if (this.field506 == 253) {
                        this.method123(this.field143, true, this.field505);
                        this.field506 = -1;
                        return true;
                    }
                    if (this.field506 == 137) {
                        int var59 = this.field143.method340();
                        int var60 = this.field143.method340();
                        int var61 = this.field143.method340();
                        int var62 = this.field143.method340();
                        this.field489[var59] = true;
                        this.field175[var59] = var60;
                        this.field609[var59] = var61;
                        this.field383[var59] = var62;
                        this.field588[var59] = 0;
                        this.field506 = -1;
                        return true;
                    }
                    if (this.field506 == 64) {
                        this.field527 = this.field143.method369(759) * 30;
                        this.field506 = -1;
                        return true;
                    }
                    if (this.field506 == 79) {
                        int var63 = this.field143.method369(759);
                        class1.method4(var63).field13 = 3;
                        if (field135.field1431 == null) {
                            class1.method4(var63).field14 = (field135.field1425[11] << 5) + (field135.field1425[8] << 10) + (field135.field1425[0] << 15) + (field135.field1448[0] << 25) + (field135.field1448[4] << 20) + field135.field1425[1];
                        } else {
                            class1.method4(var63).field14 = (int) (field135.field1431.field1049 + 305419896L);
                        }
                        this.field506 = -1;
                        return true;
                    }
                    if (this.field506 == 181) {
                        int var64 = this.field143.method372((byte) -26);
                        int var65 = this.field143.method368(false);
                        class1 var66 = class1.method4(var65);
                        if (var66.field11 != var64 || var64 == -1) {
                            var66.field11 = var64;
                            var66.field75 = 0;
                            var66.field71 = 0;
                        }
                        this.field506 = -1;
                        return true;
                    }
                    if (this.field506 != 71) {
                        if (this.field506 == 235) {
                            this.field501 = this.field143.method340();
                            if (this.field501 == 1) {
                                this.field155 = this.field143.method342();
                            }
                            if (this.field501 >= 2 && this.field501 <= 6) {
                                if (this.field501 == 2) {
                                    this.field219 = 64;
                                    this.field220 = 64;
                                }
                                if (this.field501 == 3) {
                                    this.field219 = 0;
                                    this.field220 = 64;
                                }
                                if (this.field501 == 4) {
                                    this.field219 = 128;
                                    this.field220 = 64;
                                }
                                if (this.field501 == 5) {
                                    this.field219 = 64;
                                    this.field220 = 0;
                                }
                                if (this.field501 == 6) {
                                    this.field219 = 64;
                                    this.field220 = 128;
                                }
                                this.field501 = 2;
                                this.field216 = this.field143.method342();
                                this.field217 = this.field143.method342();
                                this.field218 = this.field143.method340();
                            }
                            if (this.field501 == 10) {
                                this.field144 = this.field143.method342();
                            }
                            this.field506 = -1;
                            return true;
                        }
                        if (this.field506 == 36) {
                            int var69 = this.field143.method369(759);
                            int var70 = this.field143.method342();
                            int var71 = this.field143.method370((byte) 2);
                            class1.method4(var71).field54 = (var69 << 16) + var70;
                            this.field506 = -1;
                            return true;
                        }
                        if (this.field506 == 163) {
                            this.field571 = this.field143.method360(6);
                            if (this.field571 == this.field522) {
                                if (this.field571 == 3) {
                                    this.field522 = 1;
                                } else {
                                    this.field522 = 3;
                                }
                                this.field400 = true;
                            }
                            this.field506 = -1;
                            return true;
                        }
                        if (this.field506 == 134) {
                            this.field400 = true;
                            int var72 = this.field143.method359(0);
                            int var73 = this.field143.method374(180);
                            int var74 = this.field143.method340();
                            this.field260[var72] = var73;
                            this.field421[var72] = var74;
                            this.field462[var72] = 1;
                            for (int var75 = 0; var75 < 98; ++var75) {
                                if (var73 >= field488[var75]) {
                                    this.field462[var72] = var75 + 2;
                                }
                            }
                            this.field506 = -1;
                            return true;
                        }
                        if (this.field506 == 46) {
                            this.field556 = false;
                            for (int var76 = 0; var76 < 5; ++var76) {
                                this.field489[var76] = false;
                            }
                            this.field506 = -1;
                            return true;
                        }
                        if (this.field506 == 226) {
                            int var77 = this.field143.method369(759);
                            int var78 = this.field143.method370((byte) 2);
                            this.method49((byte) 58, var77);
                            if (var78 != -1) {
                                this.method49((byte) 58, var78);
                            }
                            if (this.field603 != -1) {
                                this.method33(-31, this.field603);
                                this.field603 = -1;
                            }
                            if (this.field228 != -1) {
                                this.method33(-31, this.field228);
                                this.field228 = -1;
                            }
                            if (this.field447 != -1) {
                                this.method33(-31, this.field447);
                                this.field447 = -1;
                            }
                            if (this.field252 != var77) {
                                this.method33(-31, this.field252);
                                this.field252 = var77;
                            }
                            if (this.field184 != var77) {
                                this.method33(-31, this.field184);
                                this.field184 = var78;
                            }
                            this.field526 = 0;
                            this.field469 = false;
                            this.field506 = -1;
                            return true;
                        }
                        if (this.field506 == 158) {
                            int var79 = this.field143.method368(false);
                            boolean var80 = this.field143.method361(this.field186) == 1;
                            class1.method4(var79).field44 = var80;
                            this.field506 = -1;
                            return true;
                        }
                        if (this.field506 == 152) {
                            for (int var81 = 0; var81 < this.field472.length; ++var81) {
                                if (this.field472[var81] != null) {
                                    this.field472[var81].field1653 = -1;
                                }
                            }
                            for (int var82 = 0; var82 < this.field265.length; ++var82) {
                                if (this.field265[var82] != null) {
                                    this.field265[var82].field1653 = -1;
                                }
                            }
                            this.field506 = -1;
                            return true;
                        }
                        if (this.field506 == 2) {
                            this.field176 = this.field143.method368(false);
                            this.field238 = this.field143.method368(false);
                            this.field523 = this.field143.method370((byte) 2);
                            this.field203 = this.field143.method368(false);
                            this.field346 = this.field143.method375((byte) 4);
                            this.field143.method369(759);
                            this.field399 = this.field143.method370((byte) 2);
                            this.field444 = this.field143.method368(false);
                            this.field289 = this.field143.method369(759);
                            this.field414 = this.field143.method369(759);
                            this.field143.method361(this.field186);
                            signlink.dnslookup(class57.method540(this.field346, (byte) 7));
                            this.field506 = -1;
                            return true;
                        }
                        if (this.field506 == 243) {
                            this.field595 = this.field143.method340();
                            this.field506 = -1;
                            return true;
                        }
                        if (this.field506 == 162) {
                            String var83 = this.field143.method347();
                            if (var83.endsWith(":tradereq:")) {
                                String var84 = var83.substring(0, var83.indexOf(":"));
                                long var85 = class57.method537(var84);
                                boolean var87 = false;
                                for (int var88 = 0; var88 < this.field150; ++var88) {
                                    if (this.field126[var88] == var85) {
                                        var87 = true;
                                        break;
                                    }
                                }
                                if (!var87 && this.field598 == 0) {
                                    this.method102("wishes to trade with you.", var84, -459, 4);
                                }
                            } else if (var83.endsWith(":duelreq:")) {
                                String var89 = var83.substring(0, var83.indexOf(":"));
                                long var90 = class57.method537(var89);
                                boolean var92 = false;
                                for (int var93 = 0; var93 < this.field150; ++var93) {
                                    if (this.field126[var93] == var90) {
                                        var92 = true;
                                        break;
                                    }
                                }
                                if (!var92 && this.field598 == 0) {
                                    this.method102("wishes to duel with you.", var89, -459, 8);
                                }
                            } else if (!var83.endsWith(":chalreq:")) {
                                this.method102(var83, "", -459, 0);
                            } else {
                                String var94 = var83.substring(0, var83.indexOf(":"));
                                long var95 = class57.method537(var94);
                                boolean var97 = false;
                                for (int var98 = 0; var98 < this.field150; ++var98) {
                                    if (this.field126[var98] == var95) {
                                        var97 = true;
                                        break;
                                    }
                                }
                                if (!var97 && this.field598 == 0) {
                                    String var99 = var83.substring(var83.indexOf(":") + 1, var83.length() - 9);
                                    this.method102(var99, var94, -459, 8);
                                }
                            }
                            this.field506 = -1;
                            return true;
                        }
                        if (this.field506 == 115) {
                            int var100 = this.field143.method343();
                            if (this.field443 != var100) {
                                this.method33(-31, this.field443);
                                this.field443 = var100;
                            }
                            this.field604 = true;
                            this.field506 = -1;
                            return true;
                        }
                        if (this.field506 == 100) {
                            int var101 = this.field143.method375((byte) 4);
                            int var102 = this.field143.method370((byte) 2);
                            this.field600[var102] = var101;
                            if (this.field391[var102] != var101) {
                                this.field391[var102] = var101;
                                this.method150(true, var102);
                                this.field400 = true;
                                if (this.field443 != -1) {
                                    this.field604 = true;
                                }
                            }
                            this.field506 = -1;
                            return true;
                        }
                        if (this.field506 == 245 || this.field506 == 68 || this.field506 == 164 || this.field506 == 183 || this.field506 == 252 || this.field506 == 248 || this.field506 == 124 || this.field506 == 241 || this.field506 == 11 || this.field506 == 156 || this.field506 == 121) {
                            this.method19(-28839, this.field143, this.field506);
                            this.field506 = -1;
                            return true;
                        }
                        if (this.field506 == 14) {
                            int var103 = this.field143.method343();
                            if (var103 >= 0) {
                                this.method49((byte) 58, var103);
                            }
                            if (this.field133 != var103) {
                                this.method33(-31, this.field133);
                                this.field133 = var103;
                            }
                            this.field506 = -1;
                            return true;
                        }
                        if (this.field506 == 184) {
                            this.field536 = 0;
                            this.field506 = -1;
                            return true;
                        }
                        if (this.field506 == 196) {
                            this.field150 = this.field505 / 8;
                            for (int var104 = 0; var104 < this.field150; ++var104) {
                                this.field126[var104] = this.field143.method346(false);
                            }
                            this.field506 = -1;
                            return true;
                        }
                        if (this.field506 == 26) {
                            int var105 = this.field143.method369(759);
                            if (var105 == 65535) {
                                var105 = -1;
                            }
                            if (this.field258 != var105 && this.field406 && !field250 && this.field539 == 0) {
                                this.field492 = var105;
                                this.field493 = true;
                                this.field262.method382(2, this.field492);
                            }
                            this.field258 = var105;
                            this.field506 = -1;
                            return true;
                        }
                        if (this.field506 == 53) {
                            int var106 = this.field143.method373(572);
                            int var107 = this.field143.method368(false);
                            if (this.field406 && !field250) {
                                this.field492 = var107;
                                this.field493 = false;
                                this.field262.method382(2, this.field492);
                                this.field539 = var106;
                            }
                            this.field506 = -1;
                            return true;
                        }
                        if (this.field506 == 136) {
                            long var108 = this.field143.method346(false);
                            int var110 = this.field143.method340();
                            String var111 = class57.method541(0, class57.method538(var108, (byte) 7));
                            for (int var112 = 0; var112 < this.field129; ++var112) {
                                if (this.field529[var112] == var108) {
                                    if (this.field377[var112] != var110) {
                                        this.field377[var112] = var110;
                                        this.field400 = true;
                                        if (var110 > 0) {
                                            this.method102(var111 + " has logged in.", "", -459, 5);
                                        }
                                        if (var110 == 0) {
                                            this.method102(var111 + " has logged out.", "", -459, 5);
                                        }
                                    }
                                    var111 = null;
                                    break;
                                }
                            }
                            if (var111 != null && this.field129 < 200) {
                                this.field529[this.field129] = var108;
                                this.field354[this.field129] = var111;
                                this.field377[this.field129] = var110;
                                ++this.field129;
                                this.field400 = true;
                            }
                            boolean var113 = false;
                            while (!var113) {
                                var113 = true;
                                for (int var114 = 0; var114 < this.field129 - 1; ++var114) {
                                    if (this.field377[var114] != field247 && this.field377[var114 + 1] == field247 || this.field377[var114] == 0 && this.field377[var114 + 1] != 0) {
                                        int var115 = this.field377[var114];
                                        this.field377[var114] = this.field377[var114 + 1];
                                        this.field377[var114 + 1] = var115;
                                        String var116 = this.field354[var114];
                                        this.field354[var114] = this.field354[var114 + 1];
                                        this.field354[var114 + 1] = var116;
                                        long var117 = this.field529[var114];
                                        this.field529[var114] = this.field529[var114 + 1];
                                        this.field529[var114 + 1] = var117;
                                        this.field400 = true;
                                        var113 = false;
                                    }
                                }
                            }
                            this.field506 = -1;
                            return true;
                        }
                        if (this.field506 == 104) {
                            this.field487 = this.field143.method360(6);
                            this.field486 = this.field143.method360(6);
                            this.field506 = -1;
                            return true;
                        }
                        if (this.field506 == 221) {
                            this.field408 = this.field143.method340();
                            this.field506 = -1;
                            return true;
                        }
                        if (this.field506 == 229) {
                            int var119 = this.field143.method370((byte) 2);
                            int var120 = this.field143.method370((byte) 2);
                            int var121 = this.field143.method369(759);
                            int var122 = this.field143.method368(false);
                            class1.method4(var119).field40 = var120;
                            class1.method4(var119).field41 = var122;
                            class1.method4(var119).field39 = var121;
                            this.field506 = -1;
                            return true;
                        }
                        if (this.field506 == 29) {
                            int var123 = this.field143.method369(759);
                            this.method49((byte) 58, var123);
                            if (this.field447 != -1) {
                                this.method33(-31, this.field447);
                                this.field447 = -1;
                                this.field604 = true;
                            }
                            if (this.field252 != -1) {
                                this.method33(-31, this.field252);
                                this.field252 = -1;
                                this.field468 = true;
                            }
                            if (this.field184 != -1) {
                                this.method33(-31, this.field184);
                                this.field184 = -1;
                            }
                            if (this.field603 != -1) {
                                this.method33(-31, this.field603);
                                this.field603 = -1;
                            }
                            if (this.field228 != var123) {
                                this.method33(-31, this.field228);
                                this.field228 = var123;
                            }
                            if (this.field526 != 0) {
                                this.field526 = 0;
                                this.field604 = true;
                            }
                            this.field400 = true;
                            this.field182 = true;
                            this.field469 = false;
                            this.field506 = -1;
                            return true;
                        }
                        if (this.field506 == 179) {
                            int var124 = this.field143.method368(false);
                            int var125 = this.field143.method342();
                            class1 var126 = class1.method4(var125);
                            if (var126 != null && var126.field63 == 0) {
                                if (var124 < 0) {
                                    var124 = 0;
                                }
                                if (var124 > var126.field43 - var126.field52) {
                                    var124 = var126.field43 - var126.field52;
                                }
                                var126.field62 = var124;
                            }
                            this.field506 = -1;
                            return true;
                        }
                        if (this.field506 == 150) {
                            this.field166 = false;
                            this.field526 = 1;
                            this.field122 = "";
                            this.field604 = true;
                            this.field506 = -1;
                            return true;
                        }
                        if (this.field506 == 3) {
                            int var127 = this.field143.method370((byte) 2);
                            this.method49((byte) 58, var127);
                            if (this.field228 != -1) {
                                this.method33(-31, this.field228);
                                this.field228 = -1;
                                this.field400 = true;
                                this.field182 = true;
                            }
                            if (this.field252 != -1) {
                                this.method33(-31, this.field252);
                                this.field252 = -1;
                                this.field468 = true;
                            }
                            if (this.field184 != -1) {
                                this.method33(-31, this.field184);
                                this.field184 = -1;
                            }
                            if (this.field603 != -1) {
                                this.method33(-31, this.field603);
                                this.field603 = -1;
                            }
                            if (this.field447 != var127) {
                                this.method33(-31, this.field447);
                                this.field447 = var127;
                            }
                            this.field469 = false;
                            this.field604 = true;
                            this.field506 = -1;
                            return true;
                        }
                        if (this.field506 == 211) {
                            if (this.field522 == 12) {
                                this.field400 = true;
                            }
                            this.field572 = this.field143.method340();
                            this.field506 = -1;
                            return true;
                        }
                        if (this.field506 == 230) {
                            this.field487 = this.field143.method360(6);
                            this.field486 = this.field143.method361(this.field186);
                            for (int var128 = this.field486; var128 < this.field486 + 8; ++var128) {
                                for (int var129 = this.field487; var129 < this.field487 + 8; ++var129) {
                                    if (this.field463[this.field183][var128][var129] != null) {
                                        this.field463[this.field183][var128][var129] = null;
                                        this.method67(var128, var129);
                                    }
                                }
                            }
                            for (class23 var130 = (class23) this.field300.method532(); var130 != null; var130 = (class23) this.field300.method534(-420)) {
                                if (var130.field904 >= this.field486 && var130.field904 < this.field486 + 8 && var130.field905 >= this.field487 && var130.field905 < this.field487 + 8 && this.field183 == var130.field902) {
                                    var130.field895 = 0;
                                }
                            }
                            this.field506 = -1;
                            return true;
                        }
                        if (this.field506 == 13) {
                            int var131 = this.field143.method368(false);
                            int var132 = this.field143.method369(759);
                            class1.method4(var131).field13 = 2;
                            class1.method4(var131).field14 = var132;
                            this.field506 = -1;
                            return true;
                        }
                        if (this.field506 == 54) {
                            this.field400 = true;
                            int var133 = this.field143.method342();
                            class1 var134 = class1.method4(var133);
                            while (this.field143.field1241 < this.field505) {
                                int var135 = this.field143.method354();
                                int var136 = this.field143.method342();
                                int var137 = this.field143.method340();
                                if (var137 == 255) {
                                    var137 = this.field143.method345();
                                }
                                if (var135 >= 0 && var135 < var134.field59.length) {
                                    var134.field59[var135] = var136;
                                    var134.field3[var135] = var137;
                                }
                            }
                            this.field506 = -1;
                            return true;
                        }
                        if (this.field506 == 10) {
                            this.field130 = this.field143.method340();
                            this.field400 = true;
                            this.field506 = -1;
                            return true;
                        }
                        if (this.field506 == 237) {
                            int var138 = this.field143.method368(false);
                            int var139 = this.field143.method342();
                            if (this.field447 != -1) {
                                this.method33(-31, this.field447);
                                this.field447 = -1;
                                this.field604 = true;
                            }
                            if (this.field252 != -1) {
                                this.method33(-31, this.field252);
                                this.field252 = -1;
                                this.field468 = true;
                            }
                            if (this.field184 != -1) {
                                this.method33(-31, this.field184);
                                this.field184 = -1;
                            }
                            if (this.field603 != var138) {
                                this.method33(-31, this.field603);
                                this.field603 = var138;
                            }
                            if (this.field228 != var139) {
                                this.method33(-31, this.field228);
                                this.field228 = var139;
                            }
                            if (this.field526 != 0) {
                                this.field526 = 0;
                                this.field604 = true;
                            }
                            this.field400 = true;
                            this.field182 = true;
                            this.field469 = false;
                            this.field506 = -1;
                            return true;
                        }
                        if (this.field506 == 195) {
                            String var140 = this.field143.method347();
                            int var141 = this.field143.method370((byte) 2);
                            class1.method4(var141).field29 = var140;
                            int var10001 = this.field574[this.field522];
                            if (class1.method4(var141).field8 == var10001) {
                                this.field400 = true;
                            }
                            this.field506 = -1;
                            return true;
                        }
                        if (this.field506 == 76) {
                            this.method141(0);
                            this.field506 = -1;
                            return false;
                        }
                        if (this.field506 == 0) {
                            this.field522 = this.field143.method359(0);
                            this.field400 = true;
                            this.field182 = true;
                            this.field506 = -1;
                            return true;
                        }
                        if (this.field506 == 107) {
                            this.field407 = this.field143.method340();
                            this.field362 = this.field143.method340();
                            this.field199 = this.field143.method340();
                            this.field339 = true;
                            this.field604 = true;
                            this.field506 = -1;
                            return true;
                        }
                        if (this.field506 == 188) {
                            int var142 = this.field143.method359(0);
                            String var143 = this.field143.method347();
                            int var144 = this.field143.method340();
                            if (var142 >= 1 && var142 <= 5) {
                                if (var143.equalsIgnoreCase("null")) {
                                    var143 = null;
                                }
                                this.field352[var142 - 1] = var143;
                                this.field353[var142 - 1] = var144 == 0;
                            }
                            this.field506 = -1;
                            return true;
                        }
                        if (this.field506 == 254) {
                            if (this.field522 == 12) {
                                this.field400 = true;
                            }
                            this.field478 = this.field143.method343();
                            this.field506 = -1;
                            return true;
                        }
                        if (this.field506 == 72) {
                            int var145 = this.field143.method369(759);
                            int var146 = this.field143.method370((byte) 2);
                            int var147 = var146 >> 10 & 31;
                            int var148 = var146 >> 5 & 31;
                            int var149 = var146 & 31;
                            class1.method4(var145).field51 = (var149 << 3) + (var147 << 19) + (var148 << 11);
                            this.field506 = -1;
                            return true;
                        }
                        if (this.field506 == 120) {
                            int var150 = this.field143.method369(759);
                            int var151 = this.field143.method359(0);
                            if (var150 == 65535) {
                                var150 = -1;
                            }
                            if (this.field574[var151] != var150) {
                                this.method33(-31, this.field574[var151]);
                                this.field574[var151] = var150;
                            }
                            this.field400 = true;
                            this.field182 = true;
                            this.field506 = -1;
                            return true;
                        }
                        if (this.field506 == 168) {
                            int var152 = this.field143.method370((byte) 2);
                            int var153 = this.field143.method370((byte) 2);
                            int var154 = this.field143.method342();
                            if (var153 == 65535) {
                                class1.method4(var152).field13 = 0;
                                this.field506 = -1;
                                return true;
                            }
                            class48 var155 = class48.method453(var153);
                            class1.method4(var152).field13 = 4;
                            class1.method4(var152).field14 = var153;
                            class1.method4(var152).field40 = var155.field1368;
                            class1.method4(var152).field41 = var155.field1369;
                            class1.method4(var152).field39 = var155.field1380 * 100 / var154;
                            this.field506 = -1;
                            return true;
                        }
                        if (this.field506 == 41) {
                            if (this.field228 != -1) {
                                this.method33(-31, this.field228);
                                this.field228 = -1;
                                this.field400 = true;
                                this.field182 = true;
                            }
                            if (this.field447 != -1) {
                                this.method33(-31, this.field447);
                                this.field447 = -1;
                                this.field604 = true;
                            }
                            if (this.field252 != -1) {
                                this.method33(-31, this.field252);
                                this.field252 = -1;
                                this.field468 = true;
                            }
                            if (this.field184 != -1) {
                                this.method33(-31, this.field184);
                                this.field184 = -1;
                            }
                            if (this.field603 != -1) {
                                this.method33(-31, this.field603);
                                this.field603 = -1;
                            }
                            if (this.field526 != 0) {
                                this.field526 = 0;
                                this.field604 = true;
                            }
                            this.field469 = false;
                            this.field506 = -1;
                            return true;
                        }
                        if (this.field506 == 177) {
                            this.field556 = true;
                            this.field394 = this.field143.method340();
                            this.field395 = this.field143.method340();
                            this.field396 = this.field143.method342();
                            this.field397 = this.field143.method340();
                            this.field398 = this.field143.method340();
                            if (this.field398 >= 100) {
                                int var156 = this.field394 * 128 + 64;
                                int var157 = this.field395 * 128 + 64;
                                int var158 = this.method66(this.field183, var157, 6, var156) - this.field396;
                                int var159 = var156 - this.field511;
                                int var160 = var158 - this.field512;
                                int var161 = var157 - this.field513;
                                int var162 = (int) Math.sqrt((double) (var159 * var159 + var161 * var161));
                                this.field514 = (int) (Math.atan2((double) var160, (double) var162) * 325.949D) & 2047;
                                this.field515 = (int) (Math.atan2((double) var159, (double) var161) * -325.949D) & 2047;
                                if (this.field514 < 128) {
                                    this.field514 = 128;
                                }
                                if (this.field514 > 383) {
                                    this.field514 = 383;
                                }
                            }
                            this.field506 = -1;
                            return true;
                        }
                        if (this.field506 == 34) {
                            int var163 = this.field143.method342();
                            int var164 = this.field143.method340();
                            int var165 = this.field143.method342();
                            if (var165 == 65535) {
                                if (this.field240 < 50) {
                                    this.field552[this.field240] = (short) var163;
                                    this.field185[this.field240] = var164;
                                    this.field201[this.field240] = 0;
                                    ++this.field240;
                                }
                            } else if (this.field425 && !field250 && this.field240 < 50) {
                                this.field552[this.field240] = var163;
                                this.field185[this.field240] = var164;
                                this.field201[this.field240] = class34.field1133[var163] + var165;
                                ++this.field240;
                            }
                            this.field506 = -1;
                            return true;
                        }
                        if (this.field506 == 147) {
                            this.field487 = this.field143.method360(6);
                            this.field486 = this.field143.method360(6);
                            while (this.field143.field1241 < this.field505) {
                                int var166 = this.field143.method340();
                                this.method19(-28839, this.field143, var166);
                            }
                            this.field506 = -1;
                            return true;
                        }
                        if (this.field506 == 190) {
                            int var167 = this.field143.method370((byte) 2);
                            this.method49((byte) 58, var167);
                            if (this.field228 != -1) {
                                this.method33(-31, this.field228);
                                this.field228 = -1;
                                this.field400 = true;
                                this.field182 = true;
                            }
                            if (this.field447 != -1) {
                                this.method33(-31, this.field447);
                                this.field447 = -1;
                                this.field604 = true;
                            }
                            if (this.field252 != -1) {
                                this.method33(-31, this.field252);
                                this.field252 = -1;
                                this.field468 = true;
                            }
                            if (this.field184 != -1) {
                                this.method33(-31, this.field184);
                                this.field184 = -1;
                            }
                            if (this.field603 != var167) {
                                this.method33(-31, this.field603);
                                this.field603 = var167;
                            }
                            if (this.field526 != 0) {
                                this.field526 = 0;
                                this.field604 = true;
                            }
                            this.field469 = false;
                            this.field506 = -1;
                            return true;
                        }
                        if (this.field506 == 197) {
                            long var168 = this.field143.method346(false);
                            int var170 = this.field143.method345();
                            int var171 = this.field143.method340();
                            boolean var172 = false;
                            for (int var173 = 0; var173 < 100; ++var173) {
                                if (this.field341[var173] == var170) {
                                    var172 = true;
                                    break;
                                }
                            }
                            if (var171 <= 1) {
                                for (int var174 = 0; var174 < this.field150; ++var174) {
                                    if (this.field126[var174] == var168) {
                                        var172 = true;
                                        break;
                                    }
                                }
                            }
                            if (!var172 && this.field598 == 0) {
                                try {
                                    this.field341[this.field286] = var170;
                                    this.field286 = (this.field286 + 1) % 100;
                                    String var175 = class17.method245(this.field505 - 13, -503, this.field143);
                                    if (var171 != 3) {
                                        var175 = class46.method413(false, var175);
                                    }
                                    if (var171 != 2 && var171 != 3) {
                                        if (var171 == 1) {
                                            this.method102(var175, "@cr1@" + class57.method541(0, class57.method538(var168, (byte) 7)), -459, 7);
                                        } else {
                                            this.method102(var175, class57.method541(0, class57.method538(var168, (byte) 7)), -459, 3);
                                        }
                                    } else {
                                        this.method102(var175, "@cr2@" + class57.method541(0, class57.method538(var168, (byte) 7)), -459, 7);
                                    }
                                } catch (Exception var190) {
                                    signlink.reporterror("cde1");
                                }
                            }
                            this.field506 = -1;
                            return true;
                        }
                        if (this.field506 == 18) {
                            int var177 = this.field143.method342();
                            class1 var178 = class1.method4(var177);
                            for (int var179 = 0; var179 < var178.field59.length; ++var179) {
                                var178.field59[var179] = -1;
                                var178.field59[var179] = 0;
                            }
                            this.field506 = -1;
                            return true;
                        }
                        if (this.field506 == 216) {
                            for (int var180 = 0; var180 < this.field391.length; ++var180) {
                                if (this.field600[var180] != this.field391[var180]) {
                                    this.field391[var180] = this.field600[var180];
                                    this.method150(true, var180);
                                    this.field400 = true;
                                }
                            }
                            this.field506 = -1;
                            return true;
                        }
                        if (this.field506 == 5) {
                            int var181 = this.field143.method370((byte) 2);
                            int var182 = this.field143.method371(false);
                            int var183 = this.field143.method372((byte) -26);
                            class1 var184 = class1.method4(var181);
                            var184.field16 = var183;
                            var184.field61 = var182;
                            this.field506 = -1;
                            return true;
                        }
                        if (this.field506 == 125) {
                            this.field556 = true;
                            this.field378 = this.field143.method340();
                            this.field379 = this.field143.method340();
                            this.field380 = this.field143.method342();
                            this.field381 = this.field143.method340();
                            this.field382 = this.field143.method340();
                            if (this.field382 >= 100) {
                                this.field511 = this.field378 * 128 + 64;
                                this.field513 = this.field379 * 128 + 64;
                                this.field512 = this.method66(this.field183, this.field513, 6, this.field511) - this.field380;
                            }
                            this.field506 = -1;
                            return true;
                        }
                        if (this.field506 == 146) {
                            this.field337 = this.field143.method340();
                            this.field157 = this.field143.method342();
                            this.field506 = -1;
                            return true;
                        }
                        if (this.field506 == 194) {
                            byte var185 = this.field143.method364(this.field410);
                            int var186 = this.field143.method369(759);
                            this.field600[var186] = var185;
                            if (this.field391[var186] != var185) {
                                this.field391[var186] = var185;
                                this.method150(true, var186);
                                this.field400 = true;
                                if (this.field443 != -1) {
                                    this.field604 = true;
                                }
                            }
                            this.field506 = -1;
                            return true;
                        }
                        if (this.field506 == 175) {
                            this.field166 = false;
                            this.field526 = 2;
                            this.field122 = "";
                            this.field604 = true;
                            this.field506 = -1;
                            return true;
                        }
                        signlink.reporterror("T1 - " + this.field506 + "," + this.field505 + " - " + this.field388 + "," + this.field389);
                        this.method141(0);
                        return true;
                    }
                    int var67 = this.field143.method368(false);
                    int var68 = this.field143.method342();
                    class1.method4(var68).field13 = 1;
                    class1.method4(var68).field14 = var67;
                    this.field506 = -1;
                    return true;
                }
                int var9 = this.field309;
                int var10 = this.field310;
                if (this.field506 == 52) {
                    var9 = this.field143.method368(false);
                    var10 = this.field143.method370((byte) 2);
                    this.field599 = false;
                }
                if (this.field506 == 6) {
                    var10 = this.field143.method370((byte) 2);
                    var9 = this.field143.method342();
                    this.field143.method350(-19202);
                    int var11 = 0;
                    while (true) {
                        if (var11 >= 4) {
                            this.field143.method352(true);
                            this.field599 = true;
                            break;
                        }
                        for (int var12 = 0; var12 < 13; ++var12) {
                            for (int var13 = 0; var13 < 13; ++var13) {
                                int var14 = this.field143.method351(1, 0);
                                if (var14 == 1) {
                                    this.field516[var11][var12][var13] = this.field143.method351(26, 0);
                                } else {
                                    this.field516[var11][var12][var13] = -1;
                                }
                            }
                        }
                        ++var11;
                    }
                }
                if (this.field309 == var9 && this.field310 == var10 && this.field343 == 2) {
                    this.field506 = -1;
                    return true;
                }
                this.field309 = var9;
                this.field310 = var10;
                this.field401 = (this.field309 - 6) * 8;
                this.field402 = (this.field310 - 6) * 8;
                this.field586 = false;
                if ((this.field309 / 8 == 48 || this.field309 / 8 == 49) && this.field310 / 8 == 48) {
                    this.field586 = true;
                }
                if (this.field309 / 8 == 48 && this.field310 / 8 == 148) {
                    this.field586 = true;
                }
                this.field343 = 1;
                this.field601 = System.currentTimeMillis();
                this.method142((String) null, 462, "Loading - please wait.");
                if (this.field506 == 52) {
                    int var15 = 0;
                    int var16 = (this.field309 - 6) / 8;
                    label1243: while (true) {
                        if (var16 > (this.field309 + 6) / 8) {
                            this.field577 = new byte[var15][];
                            this.field312 = new byte[var15][];
                            this.field495 = new int[var15];
                            this.field496 = new int[var15];
                            this.field497 = new int[var15];
                            int var18 = 0;
                            int var19 = (this.field309 - 6) / 8;
                            while (true) {
                                if (var19 > (this.field309 + 6) / 8) {
                                    break label1243;
                                }
                                for (int var20 = (this.field310 - 6) / 8; var20 <= (this.field310 + 6) / 8; ++var20) {
                                    this.field495[var18] = (var19 << 8) + var20;
                                    if (this.field586 && (var20 == 49 || var20 == 149 || var20 == 147 || var19 == 50 || var19 == 49 && var20 == 47)) {
                                        this.field496[var18] = -1;
                                        this.field497[var18] = -1;
                                        ++var18;
                                    } else {
                                        int var21 = this.field496[var18] = this.field262.method384(0, var19, var20, (byte) 2);
                                        if (var21 != -1) {
                                            this.field262.method382(3, var21);
                                        }
                                        int var22 = this.field497[var18] = this.field262.method384(1, var19, var20, (byte) 2);
                                        if (var22 != -1) {
                                            this.field262.method382(3, var22);
                                        }
                                        ++var18;
                                    }
                                }
                                ++var19;
                            }
                        }
                        for (int var17 = (this.field310 - 6) / 8; var17 <= (this.field310 + 6) / 8; ++var17) {
                            ++var15;
                        }
                        ++var16;
                    }
                }
                if (this.field506 == 6) {
                    int var23 = 0;
                    int[] var24 = new int[676];
                    int var25 = 0;
                    label1204: while (true) {
                        if (var25 >= 4) {
                            this.field577 = new byte[var23][];
                            this.field312 = new byte[var23][];
                            this.field495 = new int[var23];
                            this.field496 = new int[var23];
                            this.field497 = new int[var23];
                            int var33 = 0;
                            while (true) {
                                if (var33 >= var23) {
                                    break label1204;
                                }
                                int var34 = this.field495[var33] = var24[var33];
                                int var35 = var34 >> 8 & 255;
                                int var36 = var34 & 255;
                                int var37 = this.field496[var33] = this.field262.method384(0, var35, var36, (byte) 2);
                                if (var37 != -1) {
                                    this.field262.method382(3, var37);
                                }
                                int var38 = this.field497[var33] = this.field262.method384(1, var35, var36, (byte) 2);
                                if (var38 != -1) {
                                    this.field262.method382(3, var38);
                                }
                                ++var33;
                            }
                        }
                        for (int var26 = 0; var26 < 13; ++var26) {
                            for (int var27 = 0; var27 < 13; ++var27) {
                                int var28 = this.field516[var25][var26][var27];
                                if (var28 != -1) {
                                    int var29 = var28 >> 14 & 1023;
                                    int var30 = var28 >> 3 & 2047;
                                    int var31 = (var29 / 8 << 8) + var30 / 8;
                                    for (int var32 = 0; var32 < var23; ++var32) {
                                        if (var24[var32] == var31) {
                                            var31 = -1;
                                            break;
                                        }
                                    }
                                    if (var31 != -1) {
                                        var24[var23++] = var31;
                                    }
                                }
                            }
                        }
                        ++var25;
                    }
                }
                int var39 = this.field401 - this.field403;
                int var40 = this.field402 - this.field404;
                this.field403 = this.field401;
                this.field404 = this.field402;
                for (int var41 = 0; var41 < 16384; ++var41) {
                    class47 var42 = this.field265[var41];
                    if (var42 != null) {
                        for (int var43 = 0; var43 < 10; ++var43) {
                            var42.field1631[var43] -= var39;
                            var42.field1632[var43] -= var40;
                        }
                        var42.field1623 -= var39 * 128;
                        var42.field1624 -= var40 * 128;
                    }
                }
                for (int var44 = 0; var44 < this.field470; ++var44) {
                    class49 var45 = this.field472[var44];
                    if (var45 != null) {
                        for (int var46 = 0; var46 < 10; ++var46) {
                            var45.field1631[var46] -= var39;
                            var45.field1632[var46] -= var40;
                        }
                        var45.field1623 -= var39 * 128;
                        var45.field1624 -= var40 * 128;
                    }
                }
                this.field573 = true;
                byte var47 = 0;
                byte var48 = 104;
                byte var49 = 1;
                if (var39 < 0) {
                    var47 = 103;
                    var48 = -1;
                    var49 = -1;
                }
                byte var50 = 0;
                byte var51 = 104;
                byte var52 = 1;
                if (var40 < 0) {
                    var50 = 103;
                    var51 = -1;
                    var52 = -1;
                }
                for (int var53 = var47; var48 != var53; var53 += var49) {
                    for (int var54 = var50; var51 != var54; var54 += var52) {
                        int var55 = var39 + var53;
                        int var56 = var40 + var54;
                        for (int var57 = 0; var57 < 4; ++var57) {
                            if (var55 >= 0 && var56 >= 0 && var55 < 104 && var56 < 104) {
                                this.field463[var57][var53][var54] = this.field463[var57][var55][var56];
                            } else {
                                this.field463[var57][var53][var54] = null;
                            }
                        }
                    }
                }
                for (class23 var58 = (class23) this.field300.method532(); var58 != null; var58 = (class23) this.field300.method534(-420)) {
                    var58.field904 -= var39;
                    var58.field905 -= var40;
                    if (var58.field904 < 0 || var58.field905 < 0 || var58.field904 >= 104 || var58.field905 >= 104) {
                        var58.method163();
                    }
                }
                if (this.field536 != 0) {
                    this.field536 -= var39;
                    this.field537 -= var40;
                }
                this.field556 = false;
                this.field506 = -1;
                return true;
            } catch (IOException var191) {
                this.method60((byte) -50);
            } catch (Exception var192) {
                String var188 = "T2 - " + this.field506 + "," + this.field388 + "," + this.field389 + " - " + this.field505 + "," + (field135.field1631[0] + this.field401) + "," + (field135.field1632[0] + this.field402) + " - ";
                for (int var189 = 0; var189 < this.field505 && var189 < 50; ++var189) {
                    var188 = var188 + this.field143.field1240[var189] + ",";
                }
                signlink.reporterror(var188);
                this.method141(0);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!client", name = "L", descriptor = "(I)V")
    public final void method157(int arg0) {
        this.field241 = new class54(this.field125, "titlebox", 0);
        this.field242 = new class54(this.field125, "titlebutton", 0);
        if (arg0 != 16460) {
            this.method121();
        }
        this.field503 = new class54[12];
        for (int var2 = 0; var2 < 12; ++var2) {
            this.field503[var2] = new class54(this.field125, "runes", var2);
        }
        this.field524 = new class58(128, 265);
        this.field525 = new class58(128, 265);
        for (int var3 = 0; var3 < 33920; ++var3) {
            this.field524.field1583[var3] = this.field209.field657[var3];
        }
        for (int var4 = 0; var4 < 33920; ++var4) {
            this.field525.field1583[var4] = this.field210.field657[var4];
        }
        this.field302 = new int[256];
        for (int var5 = 0; var5 < 64; ++var5) {
            this.field302[var5] = var5 * 262144;
        }
        for (int var6 = 0; var6 < 64; ++var6) {
            this.field302[var6 + 64] = var6 * 1024 + 16711680;
        }
        for (int var7 = 0; var7 < 64; ++var7) {
            this.field302[var7 + 128] = var7 * 4 + 16776960;
        }
        for (int var8 = 0; var8 < 64; ++var8) {
            this.field302[var8 + 192] = 16777215;
        }
        this.field303 = new int[256];
        for (int var9 = 0; var9 < 64; ++var9) {
            this.field303[var9] = var9 * 1024;
        }
        for (int var10 = 0; var10 < 64; ++var10) {
            this.field303[var10 + 64] = var10 * 4 + 65280;
        }
        for (int var11 = 0; var11 < 64; ++var11) {
            this.field303[var11 + 128] = var11 * 262144 + 65535;
        }
        for (int var12 = 0; var12 < 64; ++var12) {
            this.field303[var12 + 192] = 16777215;
        }
        this.field304 = new int[256];
        for (int var13 = 0; var13 < 64; ++var13) {
            this.field304[var13] = var13 * 4;
        }
        for (int var14 = 0; var14 < 64; ++var14) {
            this.field304[var14 + 64] = var14 * 262144 + 255;
        }
        for (int var15 = 0; var15 < 64; ++var15) {
            this.field304[var15 + 128] = var15 * 1024 + 16711935;
        }
        for (int var16 = 0; var16 < 64; ++var16) {
            this.field304[var16 + 192] = 16777215;
        }
        this.field301 = new int[256];
        this.field412 = new int[32768];
        this.field413 = new int[32768];
        this.method30((class54) null, 5980);
        this.field575 = new int[32768];
        this.field576 = new int[32768];
        this.method55("Connecting to fileserver", false, 10);
        if (!this.field409) {
            this.field363 = true;
            this.field409 = true;
            this.method139(this, 2);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(BI)Ljava/lang/String;")
    private static final String method158(byte arg0, int arg1) {
        String var2 = String.valueOf(arg1);
        if (arg0 != -125) {
            field570 = -246;
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

    @OriginalMember(owner = "client!client", name = "M", descriptor = "(I)V")
    public final void method159(int arg0) {
        if (this.field532 == 0) {
            this.field225[0] = "Cancel";
            this.field180[0] = 1718;
            this.field272 = 1;
            if (this.field252 != -1) {
                this.field351 = 0;
                this.field504 = 0;
                this.method109(super.field947, false, class1.method4(this.field252), 0, 0, 0, 0, super.field946);
                if (this.field351 != this.field328) {
                    this.field328 = this.field351;
                }
                if (this.field504 != this.field371) {
                    this.field371 = this.field504;
                }
            } else {
                this.method97(false);
                this.field351 = 0;
                this.field504 = 0;
                if (super.field946 > 4 && super.field947 > 4 && super.field946 < 516 && super.field947 < 338) {
                    if (this.field603 != -1) {
                        this.method109(super.field947, false, class1.method4(this.field603), 0, 4, 4, 0, super.field946);
                    } else {
                        this.method62(0);
                    }
                }
                if (this.field351 != this.field328) {
                    this.field328 = this.field351;
                }
                if (this.field504 != this.field371) {
                    this.field371 = this.field504;
                }
                this.field351 = 0;
                if (arg0 == -31550) {
                    this.field504 = 0;
                    if (super.field946 > 553 && super.field947 > 205 && super.field946 < 743 && super.field947 < 466) {
                        if (this.field228 != -1) {
                            this.method109(super.field947, false, class1.method4(this.field228), 0, 205, 553, 1, super.field946);
                        } else if (this.field574[this.field522] != -1) {
                            this.method109(super.field947, false, class1.method4(this.field574[this.field522]), 0, 205, 553, 1, super.field946);
                        }
                    }
                    if (this.field351 != this.field148) {
                        this.field400 = true;
                        this.field148 = this.field351;
                    }
                    if (this.field504 != this.field152) {
                        this.field400 = true;
                        this.field152 = this.field504;
                    }
                    this.field351 = 0;
                    this.field504 = 0;
                    if (super.field946 > 17 && super.field947 > 357 && super.field946 < 496 && super.field947 < 453) {
                        if (this.field447 != -1) {
                            this.method109(super.field947, false, class1.method4(this.field447), 0, 357, 17, 2, super.field946);
                        } else if (this.field443 != -1) {
                            this.method109(super.field947, false, class1.method4(this.field443), 0, 357, 17, 3, super.field946);
                        } else if (super.field947 < 434 && super.field946 < 426 && this.field526 == 0) {
                            this.method87(super.field946 - 17, 23977, super.field947 - 357);
                        }
                    }
                    if ((this.field447 != -1 || this.field443 != -1) && this.field434 != this.field351) {
                        this.field604 = true;
                        this.field434 = this.field351;
                    }
                    if ((this.field447 != -1 || this.field443 != -1) && this.field504 != this.field278) {
                        this.field604 = true;
                        this.field278 = this.field504;
                    }
                    boolean var2 = false;
                    while (!var2) {
                        var2 = true;
                        for (int var3 = 0; var3 < this.field272 - 1; ++var3) {
                            if (this.field180[var3] < 1000 && this.field180[var3 + 1] > 1000) {
                                String var4 = this.field225[var3];
                                this.field225[var3] = this.field225[var3 + 1];
                                this.field225[var3 + 1] = var4;
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
    }

    @OriginalMember(owner = "client!client", name = "N", descriptor = "(I)V")
    public final void method160(int arg0) {
        this.method161(this.field137);
        if (this.field282 == 1) {
            this.field151[this.field281 / 100].method548(this.field280 - 8 - 4, this.field279 - 8 - 4, this.field578);
        }
        if (this.field282 == 2) {
            this.field151[this.field281 / 100 + 4].method548(this.field280 - 8 - 4, this.field279 - 8 - 4, this.field578);
            ++field215;
            if (field215 > 140) {
                field215 = 0;
                this.field132.method329(122, false);
                this.field132.method334(0);
            }
        }
        if (this.field133 != -1) {
            this.method100(this.field253, this.field133, true);
            this.method47(0, class1.method4(this.field133), this.field198, 0, 0);
        }
        if (this.field603 != -1) {
            this.method100(this.field253, this.field603, true);
            this.method47(0, class1.method4(this.field603), this.field198, 0, 0);
        }
        this.method26((byte) 3);
        if (arg0 <= 0) {
            this.field506 = -1;
        }
        if (!this.field173) {
            this.method159(-31550);
            this.method111(15536);
        } else if (this.field329 == 0) {
            this.method107(-41188);
        }
        if (this.field595 == 1) {
            this.field498.method548(296, 472, this.field578);
        }
        if (field295) {
            short var2 = 507;
            byte var3 = 20;
            int var4 = 16776960;
            if (super.field934 < 30 && field250) {
                var4 = 16711680;
            }
            if (super.field934 < 20 && !field250) {
                var4 = 16711680;
            }
            this.field231.method585(16067, var4, var2, "Fps:" + super.field934, var3);
            int var13 = var3 + 15;
            Runtime var5 = Runtime.getRuntime();
            int var6 = (int) ((var5.totalMemory() - var5.freeMemory()) / 1024L);
            int var7 = 16776960;
            if (var6 > 33554432 && field250) {
                int var8 = 16711680;
            }
            if (var6 > 67108864 && !field250) {
                int var9 = 16711680;
            }
            this.field231.method585(16067, 16776960, var2, "Mem:" + var6 + "k", var13);
            var13 += 15;
        }
        if (this.field527 != 0) {
            int var10 = this.field527 / 50;
            int var11 = var10 / 60;
            int var12 = var10 % 60;
            if (var12 < 10) {
                this.field231.method590("System update in: " + var11 + ":0" + var12, 329, true, 16776960, 4);
            } else {
                this.field231.method590("System update in: " + var11 + ":" + var12, 329, true, 16776960, 4);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "O", descriptor = "(I)V")
    public final void method161(int arg0) {
        if (this.field305 != 0) {
            class70 var2 = this.field231;
            int var3 = 0;
            if (this.field527 != 0) {
                var3 = 1;
            }
            for (int var4 = 0; var4 < 100; ++var4) {
                if (this.field424[var4] != null) {
                    int var5 = this.field422[var4];
                    String var6 = this.field423[var4];
                    byte var7 = 0;
                    if (var6 != null && var6.startsWith("@cr1@")) {
                        var6 = var6.substring(5);
                        var7 = 1;
                    }
                    if (var6 != null && var6.startsWith("@cr2@")) {
                        var6 = var6.substring(5);
                        var7 = 2;
                    }
                    if ((var5 == 3 || var5 == 7) && (var5 == 7 || this.field362 == 0 || this.field362 == 1 && this.method137((byte) 106, var6))) {
                        int var8 = 329 - var3 * 13;
                        byte var9 = 4;
                        var2.method590("From", var8, true, 0, var9);
                        var2.method590("From", var8 - 1, true, 65535, var9);
                        int var10 = var9 + var2.method588("From ", true);
                        if (var7 == 1) {
                            this.field169[0].method527(var8 - 12, var10, this.field578);
                            var10 += 14;
                        }
                        if (var7 == 2) {
                            this.field169[1].method527(var8 - 12, var10, this.field578);
                            var10 += 14;
                        }
                        var2.method590(var6 + ": " + this.field424[var4], var8, true, 0, var10);
                        var2.method590(var6 + ": " + this.field424[var4], var8 - 1, true, 65535, var10);
                        ++var3;
                        if (var3 >= 5) {
                            return;
                        }
                    }
                    if (var5 == 5 && this.field362 < 2) {
                        int var11 = 329 - var3 * 13;
                        var2.method590(this.field424[var4], var11, true, 0, 4);
                        var2.method590(this.field424[var4], var11 - 1, true, 65535, 4);
                        ++var3;
                        if (var3 >= 5) {
                            return;
                        }
                    }
                    if (var5 == 6 && this.field362 < 2) {
                        int var12 = 329 - var3 * 13;
                        var2.method590("To " + var6 + ": " + this.field424[var4], var12, true, 0, 4);
                        var2.method590("To " + var6 + ": " + this.field424[var4], var12 - 1, true, 65535, 4);
                        ++var3;
                        if (var3 >= 5) {
                            return;
                        }
                    }
                }
            }
            while (arg0 >= 0) {
                this.field463 = null;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(II)V")
    public final void method162(int arg0, int arg1) {
        if (arg0 >= 0) {
            for (int var3 = 1; var3 > 0; ++var3) {
            }
        }
        int[] var4 = this.field538.field1583;
        int var5 = var4.length;
        for (int var6 = 0; var6 < var5; ++var6) {
            var4[var6] = 0;
        }
        for (int var7 = 1; var7 < 103; ++var7) {
            int var24 = (103 - var7) * 512 * 4 + 24628;
            for (int var25 = 1; var25 < 103; ++var25) {
                if ((this.field555[arg1][var25][var7] & 24) == 0) {
                    this.field449.method506(var4, var24, 512, arg1, var25, var7);
                }
                if (arg1 < 3 && (this.field555[arg1 + 1][var25][var7] & 8) != 0) {
                    this.field449.method506(var4, var24, 512, arg1 + 1, var25, var7);
                }
                var24 += 4;
            }
        }
        int var8 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var9 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        this.field538.method543(0);
        for (int var10 = 1; var10 < 103; ++var10) {
            for (int var23 = 1; var23 < 103; ++var23) {
                if ((this.field555[arg1][var23][var10] & 24) == 0) {
                    this.method98(this.field149, var23, var9, var8, var10, arg1);
                }
                if (arg1 < 3 && (this.field555[arg1 + 1][var23][var10] & 8) != 0) {
                    this.method98(this.field149, var23, var9, var8, var10, arg1 + 1);
                }
            }
        }
        if (this.field319 != null) {
            this.field319.method186(0);
            class39.field1199 = this.field430;
        }
        this.field254 = 0;
        for (int var11 = 0; var11 < 104; ++var11) {
            for (int var12 = 0; var12 < 104; ++var12) {
                int var13 = this.field449.method500(this.field183, var11, var12);
                if (var13 != 0) {
                    int var14 = var13 >> 14 & 32767;
                    int var15 = class14.method196(var14).field697;
                    if (var15 >= 0) {
                        int var16 = var11;
                        int var17 = var12;
                        if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
                            byte var18 = 104;
                            byte var19 = 104;
                            int[][] var20 = this.field261[this.field183].field760;
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
                        this.field461[this.field254] = this.field460[var15];
                        this.field255[this.field254] = var16;
                        this.field256[this.field254] = var17;
                        ++this.field254;
                    }
                }
            }
        }
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; ++var1) {
            field224[var1] = var0 - 1;
            var0 += var0;
        }
        field247 = 10;
        field249 = true;
        field361 = 8;
        field384 = -251;
        field392 = 33560;
        field446 = -46;
        field457 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
        field488 = new int[99];
        int var2 = 0;
        for (int var3 = 0; var3 < 99; ++var3) {
            int var4 = var3 + 1;
            int var5 = (int) ((double) var4 + 300.0D * Math.pow(2.0D, (double) var4 / 7.0D));
            var2 += var5;
            field488[var3] = var2 / 4;
        }
        field490 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");
        field517 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };
        field561 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");
        field570 = -126;
        field580 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };
    }
}
